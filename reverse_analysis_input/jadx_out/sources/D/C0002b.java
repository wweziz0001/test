package D;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.hqp_mobile_app.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0002b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f327c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0001a f329b;

    public C0002b() {
        this(f327c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f328a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, E.j jVar) {
        this.f328a.onInitializeAccessibilityNodeInfo(view, jVar.f631a);
    }

    public boolean c(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z4 = false;
        for (int i5 = 0; i5 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((E.c) listEmptyList.get(i5)).f628a).getId() != i; i5++) {
        }
        boolean zPerformAccessibilityAction = this.f328a.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        return z4;
    }

    public C0002b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f328a = accessibilityDelegate;
        this.f329b = new C0001a(this);
    }
}
