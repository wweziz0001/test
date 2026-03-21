package D;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f300a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f301b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0021v f302c = new ViewTreeObserverOnGlobalLayoutListenerC0021v();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return E.a(view);
        }
        if (f301b) {
            return null;
        }
        if (f300a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f300a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f301b = true;
                return null;
            }
        }
        try {
            Object obj = f300a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f301b = true;
            return null;
        }
    }

    public static void b(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i5 = Build.VERSION.SDK_INT;
            Object objB = null;
            if (i5 >= 28) {
                tag = D.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z4 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z4) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i5 >= 28) {
                        objB = D.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objB = tag2;
                        }
                    }
                    text.add((CharSequence) objB);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i5 >= 28) {
                objB = D.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objB = tag3;
                }
            }
            text2.add((CharSequence) objB);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            E.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void d(View view, C0002b c0002b) {
        if (c0002b == null && (a(view) instanceof C0001a)) {
            c0002b = new C0002b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0002b == null ? null : c0002b.f329b);
    }

    public static void e(View view, CharSequence charSequence) {
        new C0020u(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0021v viewTreeObserverOnGlobalLayoutListenerC0021v = f302c;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0021v.f372l.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0021v);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0021v);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0021v.f372l.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0021v);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0021v);
            }
        }
    }
}
