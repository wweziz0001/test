package E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static i a(boolean z4, int i, int i5, int i6, int i7, boolean z5, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i).setRowIndex(i5).setColumnSpan(i6).setRowSpan(i7).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build();
        return new i();
    }

    public static j b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i5) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i5);
        if (child != null) {
            return new j(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static j f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new j(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
        accessibilityNodeInfo.setTextSelectable(z4);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
