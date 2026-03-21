package t;

import android.app.Notification;
import android.os.Parcel;
import b.C0294a;
import b.InterfaceC0296c;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f9706d;

    public Q(String str, int i, String str2, Notification notification) {
        this.f9703a = str;
        this.f9704b = i;
        this.f9705c = str2;
        this.f9706d = notification;
    }

    public final void a(InterfaceC0296c interfaceC0296c) {
        String str = this.f9703a;
        int i = this.f9704b;
        String str2 = this.f9705c;
        C0294a c0294a = (C0294a) interfaceC0296c;
        c0294a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0296c.f4824a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            Notification notification = this.f9706d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            c0294a.f4822c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f9703a);
        sb.append(", id:");
        sb.append(this.f9704b);
        sb.append(", tag:");
        return B0.i(sb, this.f9705c, "]");
    }
}
