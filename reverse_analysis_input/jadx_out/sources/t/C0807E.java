package t;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: t.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0807E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f9693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f9695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f9696d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f9698f;

    public C0807E(CharSequence charSequence, long j5, X x4) {
        this.f9693a = charSequence;
        this.f9694b = j5;
        this.f9695c = x4;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0807E c0807e = (C0807E) arrayList.get(i);
            c0807e.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = c0807e.f9693a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c0807e.f9694b);
            X x4 = c0807e.f9695c;
            if (x4 != null) {
                bundle.putCharSequence("sender", x4.f9725a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", AbstractC0806D.a(W.b(x4)));
                } else {
                    bundle.putBundle("person", x4.b());
                }
            }
            String str = c0807e.f9697e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = c0807e.f9698f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = c0807e.f9696d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        X xA;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                C0807E c0807e = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            xA = X.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            xA = W.a(androidx.media.C.c(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            X x4 = new X();
                            x4.f9725a = charSequence;
                            x4.f9726b = null;
                            x4.f9727c = null;
                            x4.f9728d = null;
                            x4.f9729e = false;
                            x4.f9730f = false;
                            xA = x4;
                        } else {
                            xA = null;
                        }
                        C0807E c0807e2 = new C0807E(bundle.getCharSequence("text"), bundle.getLong("time"), xA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            c0807e2.f9697e = string;
                            c0807e2.f9698f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            c0807e2.f9696d.putAll(bundle.getBundle("extras"));
                        }
                        c0807e = c0807e2;
                    }
                } catch (ClassCastException unused) {
                }
                if (c0807e != null) {
                    arrayList.add(c0807e);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        long j5 = this.f9694b;
        CharSequence charSequence = this.f9693a;
        X x4 = this.f9695c;
        if (i >= 28) {
            messageA = AbstractC0806D.b(charSequence, j5, x4 != null ? W.b(x4) : null);
        } else {
            messageA = AbstractC0805C.a(charSequence, j5, x4 != null ? x4.f9725a : null);
        }
        String str = this.f9697e;
        if (str != null) {
            AbstractC0805C.b(messageA, str, this.f9698f);
        }
        return messageA;
    }
}
