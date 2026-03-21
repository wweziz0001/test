package l1;

import F0.K;
import F0.M;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f8057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8059c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f8062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f8063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8064h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8065j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8067l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8074s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f8060d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f8061e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f8068m = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f8069n = new n();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8066k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8070o = false;

    public o(K k4, boolean z4, boolean z5) {
        this.f8057a = k4;
        this.f8058b = z4;
        this.f8059c = z5;
        byte[] bArr = new byte[128];
        this.f8063g = bArr;
        this.f8062f = new M(bArr, 0, 0);
        n nVar = this.f8069n;
        nVar.f8043b = false;
        nVar.f8042a = false;
    }

    public final void a() {
        boolean z4;
        int i;
        boolean z5 = false;
        if (this.f8058b) {
            n nVar = this.f8069n;
            z4 = nVar.f8043b && ((i = nVar.f8046e) == 7 || i == 2);
        } else {
            z4 = this.f8074s;
        }
        boolean z6 = this.f8073r;
        int i5 = this.i;
        if (i5 == 5 || (z4 && i5 == 1)) {
            z5 = true;
        }
        this.f8073r = z6 | z5;
    }
}
