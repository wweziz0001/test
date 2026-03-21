package t;

import android.app.Notification;

/* JADX INFO: renamed from: t.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0803A {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
