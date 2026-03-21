package m;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z4) {
        absListView.setSelectedChildViewEnabled(z4);
    }
}
