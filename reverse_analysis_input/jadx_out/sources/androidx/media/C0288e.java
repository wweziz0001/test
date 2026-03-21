package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.media.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f4579g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f4581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f4582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f4583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4585f;

    static {
        int i = AudioAttributesCompat.f4562b;
        C0284a c0285b = Build.VERSION.SDK_INT >= 26 ? new C0285b() : new C0284a();
        c0285b.f(1);
        f4579g = new AudioAttributesCompat(c0285b.a());
    }

    public C0288e(int i, S2.d dVar, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z4) {
        this.f4580a = i;
        this.f4582c = handler;
        this.f4583d = audioAttributesCompat;
        this.f4584e = z4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f4581b = dVar;
        } else {
            this.f4581b = new C0287d(dVar, handler);
        }
        if (i5 >= 26) {
            this.f4585f = AbstractC0286c.a(i, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f4563a.b() : null, z4, this.f4581b, handler);
        } else {
            this.f4585f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0288e)) {
            return false;
        }
        C0288e c0288e = (C0288e) obj;
        return this.f4580a == c0288e.f4580a && this.f4584e == c0288e.f4584e && Objects.equals(this.f4581b, c0288e.f4581b) && Objects.equals(this.f4582c, c0288e.f4582c) && Objects.equals(this.f4583d, c0288e.f4583d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4580a), this.f4581b, this.f4582c, this.f4583d, Boolean.valueOf(this.f4584e));
    }
}
