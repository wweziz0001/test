package t;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825n {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z4) {
        bigPictureStyle.showBigPictureWhenCollapsed(z4);
    }
}
