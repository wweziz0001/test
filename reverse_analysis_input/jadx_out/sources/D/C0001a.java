package D;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.example.hqp_mobile_app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0002b f324a;

    public C0001a(C0002b c0002b) {
        this.f324a = c0002b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f324a.f328a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f324a.f328a.getAccessibilityNodeProvider(view);
        B0.d dVar = accessibilityNodeProvider != null ? new B0.d(accessibilityNodeProvider) : null;
        if (dVar != null) {
            return (AccessibilityNodeProvider) dVar.f190l;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f324a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        Object tag2;
        Object tag3;
        int iKeyAt;
        int i = 1;
        E.j jVar = new E.j(accessibilityNodeInfo);
        Field field = I.f300a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            tag = Boolean.valueOf(D.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i6 = 0;
        boolean z4 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i5 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z4 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i5 >= 28) {
            objValueOf = Boolean.valueOf(D.c(view));
        } else {
            Object tag4 = view.getTag(R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag4) ? tag4 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        boolean z5 = bool2 != null && bool2.booleanValue();
        if (i5 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i5 >= 28) {
            tag2 = D.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i5 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = F.b(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) tag3;
        if (i5 >= 30) {
            E.d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f324a.b(view, jVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i5 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    if (((WeakReference) sparseArray.valueAt(i7)).get() == null) {
                        arrayList.add(Integer.valueOf(i7));
                    }
                }
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    sparseArray.remove(((Integer) arrayList.get(i8)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i9 = 0;
                while (i9 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i9];
                    int i10 = i6;
                    while (true) {
                        if (i10 >= sparseArray2.size()) {
                            iKeyAt = E.j.f630b;
                            E.j.f630b = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i10)).get())) {
                                iKeyAt = sparseArray2.keyAt(i10);
                                break;
                            }
                            i10 += i;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i9]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i9];
                    Spanned spanned = (Spanned) text;
                    jVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    jVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    jVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    jVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i = 1;
                    i9++;
                    i6 = 0;
                }
            }
        }
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < listEmptyList.size(); i11++) {
            jVar.f631a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((E.c) listEmptyList.get(i11)).f628a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f324a.f328a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f324a.f328a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f324a.c(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f324a.f328a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f324a.f328a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
