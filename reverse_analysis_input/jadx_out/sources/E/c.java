package E;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f627f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f629b;

    static {
        new c(null, 1, null);
        new c(null, 2, null);
        new c(null, 4, null);
        new c(null, 8, null);
        new c(null, 16, null);
        new c(null, 32, null);
        new c(null, 64, null);
        new c(null, 128, null);
        new c(null, 256, k.class);
        new c(null, 512, k.class);
        new c(null, 1024, l.class);
        new c(null, 2048, l.class);
        f624c = new c(null, 4096, null);
        f625d = new c(null, 8192, null);
        new c(null, 16384, null);
        new c(null, 32768, null);
        new c(null, 65536, null);
        new c(null, 131072, p.class);
        new c(null, 262144, null);
        new c(null, 524288, null);
        new c(null, 1048576, null);
        new c(null, 2097152, q.class);
        int i = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, n.class);
        f626e = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f627f = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new c(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, o.class);
        new c(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, m.class);
        new c(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new c(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new c(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new c(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new c(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new c(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new c(i >= 34 ? h.a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public c(Object obj, int i, Class cls) {
        this.f629b = i;
        if (obj == null) {
            this.f628a = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.f628a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f628a;
        Object obj3 = this.f628a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f628a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strB = j.b(this.f629b);
        if (strB.equals("ACTION_UNKNOWN")) {
            Object obj = this.f628a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strB = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strB);
        return sb.toString();
    }
}
