package androidx.media;

import android.app.ActivityManager;
import android.app.Person;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class C {
    public static /* synthetic */ ActivityManager.TaskDescription b(String str, int i) {
        return new ActivityManager.TaskDescription(str, 0, i);
    }

    public static /* bridge */ /* synthetic */ Person c(Parcelable parcelable) {
        return (Person) parcelable;
    }
}
