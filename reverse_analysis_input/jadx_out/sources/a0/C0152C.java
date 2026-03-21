package a0;

import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: renamed from: a0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0152C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f3162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f3163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f3164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f3165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f3166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f3167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f3168h;
    public Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f3169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f3170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f3171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f3172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f3173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f3174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f3175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f3176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f3177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f3178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f3179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f3180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f3181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f3182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f3183x;
    public Integer y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m2.I f3184z;

    public final void a(int i, byte[] bArr) {
        if (this.f3166f != null) {
            Integer numValueOf = Integer.valueOf(i);
            int i5 = AbstractC0370w.f5326a;
            if (!numValueOf.equals(3) && Objects.equals(this.f3167g, 3)) {
                return;
            }
        }
        this.f3166f = (byte[]) bArr.clone();
        this.f3167g = Integer.valueOf(i);
    }

    public final void b(CharSequence charSequence) {
        this.f3182w = charSequence;
    }

    public final void c(Integer num) {
        this.f3173n = num;
    }

    public final void d(Integer num) {
        this.f3172m = num;
    }

    public final void e(Integer num) {
        this.f3171l = num;
    }
}
