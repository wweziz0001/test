package i1;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6461e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f6467l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f6470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f6471p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0479b f6473r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6462f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6463g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6464h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6465j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6468m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6469n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6472q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6474s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f6459c && gVar.f6459c) {
                this.f6458b = gVar.f6458b;
                this.f6459c = true;
            }
            if (this.f6464h == -1) {
                this.f6464h = gVar.f6464h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f6457a == null && (str = gVar.f6457a) != null) {
                this.f6457a = str;
            }
            if (this.f6462f == -1) {
                this.f6462f = gVar.f6462f;
            }
            if (this.f6463g == -1) {
                this.f6463g = gVar.f6463g;
            }
            if (this.f6469n == -1) {
                this.f6469n = gVar.f6469n;
            }
            if (this.f6470o == null && (alignment2 = gVar.f6470o) != null) {
                this.f6470o = alignment2;
            }
            if (this.f6471p == null && (alignment = gVar.f6471p) != null) {
                this.f6471p = alignment;
            }
            if (this.f6472q == -1) {
                this.f6472q = gVar.f6472q;
            }
            if (this.f6465j == -1) {
                this.f6465j = gVar.f6465j;
                this.f6466k = gVar.f6466k;
            }
            if (this.f6473r == null) {
                this.f6473r = gVar.f6473r;
            }
            if (this.f6474s == Float.MAX_VALUE) {
                this.f6474s = gVar.f6474s;
            }
            if (!this.f6461e && gVar.f6461e) {
                this.f6460d = gVar.f6460d;
                this.f6461e = true;
            }
            if (this.f6468m != -1 || (i = gVar.f6468m) == -1) {
                return;
            }
            this.f6468m = i;
        }
    }
}
