package F0;

import a0.AbstractC0156G;
import a0.C0155F;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0370w;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f828h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z1.l f830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0155F f831l;

    public w(int i, byte[] bArr) {
        M m4 = new M(bArr.length, bArr);
        m4.r(i * 8);
        this.f821a = m4.i(16);
        this.f822b = m4.i(16);
        this.f823c = m4.i(24);
        this.f824d = m4.i(24);
        int i5 = m4.i(20);
        this.f825e = i5;
        this.f826f = d(i5);
        this.f827g = m4.i(3) + 1;
        int i6 = m4.i(5) + 1;
        this.f828h = i6;
        this.i = a(i6);
        this.f829j = m4.k(36);
        this.f830k = null;
        this.f831l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j5 = this.f829j;
        if (j5 == 0) {
            return -9223372036854775807L;
        }
        return (j5 * 1000000) / ((long) this.f825e);
    }

    public final C0190p c(byte[] bArr, C0155F c0155f) {
        bArr[4] = -128;
        int i = this.f824d;
        if (i <= 0) {
            i = -1;
        }
        C0155F c0155f2 = this.f831l;
        if (c0155f2 != null) {
            c0155f = c0155f2.e(c0155f);
        }
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("audio/flac");
        c0189o.f3388n = i;
        c0189o.f3366B = this.f827g;
        c0189o.f3367C = this.f825e;
        c0189o.f3368D = AbstractC0370w.z(this.f828h);
        c0189o.f3390p = Collections.singletonList(bArr);
        c0189o.f3385k = c0155f;
        return new C0190p(c0189o);
    }

    public w(int i, int i5, int i6, int i7, int i8, int i9, int i10, long j5, Z1.l lVar, C0155F c0155f) {
        this.f821a = i;
        this.f822b = i5;
        this.f823c = i6;
        this.f824d = i7;
        this.f825e = i8;
        this.f826f = d(i8);
        this.f827g = i9;
        this.f828h = i10;
        this.i = a(i10);
        this.f829j = j5;
        this.f830k = lVar;
        this.f831l = c0155f;
    }
}
