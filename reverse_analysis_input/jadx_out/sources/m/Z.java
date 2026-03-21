package m;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z4) {
        return popupWindow.getMaxAvailableHeight(view, i, z4);
    }
}
