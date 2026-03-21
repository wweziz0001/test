package v;

import android.graphics.Color;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10270f;

    public C0904a(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f10265a = f2;
        this.f10266b = f5;
        this.f10267c = f6;
        this.f10268d = f7;
        this.f10269e = f8;
        this.f10270f = f9;
    }

    public static C0904a a(int i) {
        m mVar = m.f10295k;
        float fD = AbstractC0905b.d(Color.red(i));
        float fD2 = AbstractC0905b.d(Color.green(i));
        float fD3 = AbstractC0905b.d(Color.blue(i));
        float[][] fArr = AbstractC0905b.f10274d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fD3) + (fArr2[1] * fD2) + (fArr2[0] * fD);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[2] * fD3) + (fArr3[1] * fD2) + (fArr3[0] * fD);
        float[] fArr4 = fArr[2];
        float f6 = (fD3 * fArr4[2]) + (fD2 * fArr4[1]) + (fD * fArr4[0]);
        float[][] fArr5 = AbstractC0905b.f10271a;
        float[] fArr6 = fArr5[0];
        float f7 = (fArr6[2] * f6) + (fArr6[1] * f5) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f8 = (fArr7[2] * f6) + (fArr7[1] * f5) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f9 = (f6 * fArr8[2]) + (f5 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = mVar.f10302g;
        float f10 = fArr9[0] * f7;
        float f11 = fArr9[1] * f8;
        float f12 = fArr9[2] * f9;
        float fAbs = Math.abs(f10);
        float f13 = mVar.f10303h;
        float fPow = (float) Math.pow(((double) (fAbs * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = fAtan2;
        float f20 = (3.1415927f * f19) / 180.0f;
        float f21 = f18 * mVar.f10297b;
        float f22 = mVar.f10296a;
        float f23 = mVar.f10299d;
        float fPow4 = ((float) Math.pow(f21 / f22, mVar.f10304j * f23)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f24 = f22 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f10301f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f19) < 20.14d ? 360.0f + f19 : f19)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f10300e) * mVar.f10298c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f25 = mVar.i * fPow5;
        Math.sqrt((r3 * f23) / f24);
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f25 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f20;
        return new C0904a(f19, fPow5, fPow4, f26, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static C0904a b(float f2, float f5, float f6) {
        m mVar = m.f10295k;
        float f7 = mVar.f10299d;
        Math.sqrt(((double) f2) / 100.0d);
        float f8 = mVar.f10296a + 4.0f;
        float f9 = mVar.i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * mVar.f10299d) / f8);
        float f10 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f9) * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f6) / 180.0f;
        return new C0904a(f6, f5, f2, f10, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(v.m r17) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0904a.c(v.m):int");
    }
}
