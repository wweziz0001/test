package m;

/* JADX INFO: renamed from: m.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0607o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8466h;

    public final void a(int i, int i5) {
        this.f8461c = i;
        this.f8462d = i5;
        this.f8466h = true;
        if (this.f8465g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f8459a = i5;
            }
            if (i != Integer.MIN_VALUE) {
                this.f8460b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f8459a = i;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f8460b = i5;
        }
    }
}
