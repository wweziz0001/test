package D0;

import java.util.Arrays;

/* JADX INFO: renamed from: D0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0026a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f387g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f388h;

    public final boolean a() {
        return this.f384d > 15 && this.f388h == 0;
    }

    public final void b(long j5) {
        long j6 = this.f384d;
        if (j6 == 0) {
            this.f381a = j5;
        } else if (j6 == 1) {
            long j7 = j5 - this.f381a;
            this.f382b = j7;
            this.f386f = j7;
            this.f385e = 1L;
        } else {
            long j8 = j5 - this.f383c;
            int i = (int) (j6 % 15);
            long jAbs = Math.abs(j8 - this.f382b);
            boolean[] zArr = this.f387g;
            if (jAbs <= 1000000) {
                this.f385e++;
                this.f386f += j8;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f388h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f388h++;
            }
        }
        this.f384d++;
        this.f383c = j5;
    }

    public final void c() {
        this.f384d = 0L;
        this.f385e = 0L;
        this.f386f = 0L;
        this.f388h = 0;
        Arrays.fill(this.f387g, false);
    }
}
