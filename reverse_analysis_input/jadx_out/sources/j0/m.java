package j0;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7293f;

    public m(AudioTrack audioTrack) {
        this.f7288a = new l(audioTrack);
        a();
    }

    public final void a() {
        if (this.f7288a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.f7289b = i;
        if (i == 0) {
            this.f7292e = 0L;
            this.f7293f = -1L;
            this.f7290c = System.nanoTime() / 1000;
            this.f7291d = 10000L;
            return;
        }
        if (i == 1) {
            this.f7291d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f7291d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f7291d = 500000L;
        }
    }
}
