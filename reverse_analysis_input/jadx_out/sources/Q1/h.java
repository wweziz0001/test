package Q1;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f1827c;

    public h(int i, Notification notification, int i5) {
        this.f1825a = i;
        this.f1827c = notification;
        this.f1826b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1825a == hVar.f1825a && this.f1826b == hVar.f1826b) {
            return this.f1827c.equals(hVar.f1827c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1827c.hashCode() + (((this.f1825a * 31) + this.f1826b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1825a + ", mForegroundServiceType=" + this.f1826b + ", mNotification=" + this.f1827c + '}';
    }
}
