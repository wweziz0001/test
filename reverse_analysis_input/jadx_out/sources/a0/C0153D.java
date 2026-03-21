package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;
import m2.C0640G;

/* JADX INFO: renamed from: a0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0153D {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0153D f3185B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m2.I f3186A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f3189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f3190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f3191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f3192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f3193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f3194h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f3195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f3196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f3197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f3198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f3199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f3200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f3201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f3202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f3203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f3204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f3205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f3206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f3207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f3208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f3209x;
    public final CharSequence y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f3210z;

    static {
        C0152C c0152c = new C0152C();
        C0640G c0640g = m2.I.f8549m;
        c0152c.f3184z = m2.b0.f8583p;
        f3185B = new C0153D(c0152c);
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0307a.n(5, 6, 8, 9, 10);
        AbstractC0307a.n(11, 12, 13, 14, 15);
        AbstractC0307a.n(16, 17, 18, 19, 20);
        AbstractC0307a.n(21, 22, 23, 24, 25);
        AbstractC0307a.n(26, 27, 28, 29, 30);
        AbstractC0307a.n(31, 32, 33, 34, 1000);
    }

    public C0153D(C0152C c0152c) {
        Boolean boolValueOf = c0152c.f3170k;
        Integer numValueOf = c0152c.f3169j;
        Integer numValueOf2 = c0152c.y;
        int i = 1;
        int i5 = 0;
        int i6 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i6 = i;
                }
                numValueOf = Integer.valueOf(i6);
            }
        } else if (numValueOf != null) {
            boolean z4 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z4);
            if (z4 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i5 = 21;
                        break;
                    case 3:
                        i5 = 22;
                        break;
                    case 4:
                        i5 = 23;
                        break;
                    case 5:
                        i5 = 24;
                        break;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 25;
                        break;
                    default:
                        i5 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i5);
            }
        }
        this.f3187a = c0152c.f3161a;
        this.f3188b = c0152c.f3162b;
        this.f3189c = c0152c.f3163c;
        this.f3190d = c0152c.f3164d;
        this.f3191e = c0152c.f3165e;
        this.f3192f = c0152c.f3166f;
        this.f3193g = c0152c.f3167g;
        this.f3194h = c0152c.f3168h;
        this.i = c0152c.i;
        this.f3195j = numValueOf;
        this.f3196k = boolValueOf;
        Integer num = c0152c.f3171l;
        this.f3197l = num;
        this.f3198m = num;
        this.f3199n = c0152c.f3172m;
        this.f3200o = c0152c.f3173n;
        this.f3201p = c0152c.f3174o;
        this.f3202q = c0152c.f3175p;
        this.f3203r = c0152c.f3176q;
        this.f3204s = c0152c.f3177r;
        this.f3205t = c0152c.f3178s;
        this.f3206u = c0152c.f3179t;
        this.f3207v = c0152c.f3180u;
        this.f3208w = c0152c.f3181v;
        this.f3209x = c0152c.f3182w;
        this.y = c0152c.f3183x;
        this.f3210z = numValueOf2;
        this.f3186A = c0152c.f3184z;
    }

    public final C0152C a() {
        C0152C c0152c = new C0152C();
        c0152c.f3161a = this.f3187a;
        c0152c.f3162b = this.f3188b;
        c0152c.f3163c = this.f3189c;
        c0152c.f3164d = this.f3190d;
        c0152c.f3165e = this.f3191e;
        c0152c.f3166f = this.f3192f;
        c0152c.f3167g = this.f3193g;
        c0152c.f3168h = this.f3194h;
        c0152c.i = this.i;
        c0152c.f3169j = this.f3195j;
        c0152c.f3170k = this.f3196k;
        c0152c.f3171l = this.f3198m;
        c0152c.f3172m = this.f3199n;
        c0152c.f3173n = this.f3200o;
        c0152c.f3174o = this.f3201p;
        c0152c.f3175p = this.f3202q;
        c0152c.f3176q = this.f3203r;
        c0152c.f3177r = this.f3204s;
        c0152c.f3178s = this.f3205t;
        c0152c.f3179t = this.f3206u;
        c0152c.f3180u = this.f3207v;
        c0152c.f3181v = this.f3208w;
        c0152c.f3182w = this.f3209x;
        c0152c.f3183x = this.y;
        c0152c.y = this.f3210z;
        c0152c.f3184z = this.f3186A;
        return c0152c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0153D.class != obj.getClass()) {
            return false;
        }
        C0153D c0153d = (C0153D) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f3187a, c0153d.f3187a) && Objects.equals(this.f3188b, c0153d.f3188b) && Objects.equals(this.f3189c, c0153d.f3189c) && Objects.equals(this.f3190d, c0153d.f3190d) && Objects.equals(this.f3191e, c0153d.f3191e) && Arrays.equals(this.f3192f, c0153d.f3192f) && Objects.equals(this.f3193g, c0153d.f3193g) && Objects.equals(this.f3194h, c0153d.f3194h) && Objects.equals(this.i, c0153d.i) && Objects.equals(this.f3195j, c0153d.f3195j) && Objects.equals(this.f3196k, c0153d.f3196k) && Objects.equals(this.f3198m, c0153d.f3198m) && Objects.equals(this.f3199n, c0153d.f3199n) && Objects.equals(this.f3200o, c0153d.f3200o) && Objects.equals(this.f3201p, c0153d.f3201p) && Objects.equals(this.f3202q, c0153d.f3202q) && Objects.equals(this.f3203r, c0153d.f3203r) && Objects.equals(this.f3204s, c0153d.f3204s) && Objects.equals(this.f3205t, c0153d.f3205t) && Objects.equals(this.f3206u, c0153d.f3206u) && Objects.equals(this.f3207v, c0153d.f3207v) && Objects.equals(this.f3208w, c0153d.f3208w) && Objects.equals(this.f3209x, c0153d.f3209x) && Objects.equals(this.y, c0153d.y) && Objects.equals(this.f3210z, c0153d.f3210z) && Objects.equals(this.f3186A, c0153d.f3186A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3187a, this.f3188b, this.f3189c, this.f3190d, null, null, this.f3191e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f3192f)), this.f3193g, null, this.f3194h, this.i, this.f3195j, this.f3196k, null, this.f3198m, this.f3199n, this.f3200o, this.f3201p, this.f3202q, this.f3203r, this.f3204s, this.f3205t, this.f3206u, this.f3207v, this.f3208w, this.f3209x, null, this.y, this.f3210z, true, this.f3186A});
    }
}
