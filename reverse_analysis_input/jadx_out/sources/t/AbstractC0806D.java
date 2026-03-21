package t;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* JADX INFO: renamed from: t.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0806D {
    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j5, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j5, person);
    }

    public static Parcelable a(Person person) {
        return person;
    }
}
