package t;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: renamed from: t.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0805C {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j5, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j5, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
