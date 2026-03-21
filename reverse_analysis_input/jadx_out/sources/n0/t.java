package n0;

import F0.C0066m;
import F0.K;
import F0.u;
import F0.v;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0200z;
import android.text.TextUtils;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.AbstractC0538h;
import k1.AbstractC0539i;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class t implements F0.q {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f8920j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0368u f8922b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0200z f8924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F0.s f8926f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8928h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f8923c = new C0363p();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f8927g = new byte[1024];

    public t(String str, C0368u c0368u, C0200z c0200z, boolean z4) {
        this.f8921a = str;
        this.f8922b = c0368u;
        this.f8924d = c0200z;
        this.f8925e = z4;
    }

    public final K a(long j5) {
        K k4 = this.f8926f.k(0, 3);
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("text/vtt");
        c0189o.f3379d = this.f8921a;
        c0189o.f3392r = j5;
        B0.k(c0189o, k4);
        this.f8926f.j();
        return k4;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        throw new IllegalStateException();
    }

    @Override // F0.q
    public final int d(F0.r rVar, u uVar) throws C0157H, EOFException, InterruptedIOException {
        String strJ;
        this.f8926f.getClass();
        int i5 = (int) ((C0066m) rVar).f798n;
        int i6 = this.f8928h;
        byte[] bArr = this.f8927g;
        if (i6 == bArr.length) {
            this.f8927g = Arrays.copyOf(bArr, ((i5 != -1 ? i5 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f8927g;
        int i7 = this.f8928h;
        int i8 = ((C0066m) rVar).read(bArr2, i7, bArr2.length - i7);
        if (i8 != -1) {
            int i9 = this.f8928h + i8;
            this.f8928h = i9;
            if (i5 == -1 || i9 != i5) {
                return 0;
            }
        }
        C0363p c0363p = new C0363p(this.f8927g);
        AbstractC0539i.d(c0363p);
        String strJ2 = c0363p.j(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strJ2)) {
                while (true) {
                    String strJ3 = c0363p.j(StandardCharsets.UTF_8);
                    if (strJ3 == null) {
                        break;
                    }
                    if (AbstractC0539i.f7686a.matcher(strJ3).matches()) {
                        do {
                            strJ = c0363p.j(StandardCharsets.UTF_8);
                            if (strJ != null) {
                            }
                        } while (!strJ.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC0538h.f7682a.matcher(strJ3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                } else {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    long jC2 = AbstractC0539i.c(strGroup);
                    int i10 = AbstractC0370w.f5326a;
                    long jB = this.f8922b.b(AbstractC0370w.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                    K kA = a(jB - jC2);
                    byte[] bArr3 = this.f8927g;
                    int i11 = this.f8928h;
                    C0363p c0363p2 = this.f8923c;
                    c0363p2.F(i11, bArr3);
                    kA.a(c0363p2, this.f8928h, 0);
                    kA.b(jB, 1, this.f8928h, 0, null);
                }
                return -1;
            }
            if (strJ2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strJ2);
                if (!matcher3.find()) {
                    throw C0157H.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strJ2));
                }
                Matcher matcher4 = f8920j.matcher(strJ2);
                if (!matcher4.find()) {
                    throw C0157H.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strJ2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = AbstractC0539i.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j5 = Long.parseLong(strGroup3);
                int i12 = AbstractC0370w.f5326a;
                jU = AbstractC0370w.U(j5, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strJ2 = c0363p.j(StandardCharsets.UTF_8);
        }
    }

    @Override // F0.q
    public final boolean e(F0.r rVar) {
        C0066m c0066m = (C0066m) rVar;
        c0066m.t(this.f8927g, 0, 6, false);
        byte[] bArr = this.f8927g;
        C0363p c0363p = this.f8923c;
        c0363p.F(6, bArr);
        if (AbstractC0539i.a(c0363p)) {
            return true;
        }
        c0066m.t(this.f8927g, 6, 3, false);
        c0363p.F(9, this.f8927g);
        return AbstractC0539i.a(c0363p);
    }

    @Override // F0.q
    public final void j(F0.s sVar) {
        if (this.f8925e) {
            sVar = new Z1.s(sVar, this.f8924d);
        }
        this.f8926f = sVar;
        sVar.d(new v(-9223372036854775807L));
    }

    @Override // F0.q
    public final void release() {
    }
}
