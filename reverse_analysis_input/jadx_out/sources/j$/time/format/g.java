package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7068g;

    g(j$.time.temporal.r rVar, int i, int i5, boolean z4, int i6) {
        super(rVar, i, i5, z.NOT_NEGATIVE, i6);
        this.f7068g = z4;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c() {
        if (this.f7074e == -1) {
            return this;
        }
        return new g(this.f7070a, this.f7071b, this.f7072c, this.f7068g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i
    final i d(int i) {
        return new g(this.f7070a, this.f7071b, this.f7072c, this.f7068g, this.f7074e + i);
    }

    @Override // j$.time.format.i
    final boolean b(q qVar) {
        return qVar.k() && this.f7071b == this.f7072c && !this.f7068g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        ?? r02 = this.f7070a;
        Long lE = tVar.e(r02);
        if (lE == null) {
            return false;
        }
        w wVarB = tVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.w wVarB2 = r02.B();
        wVarB2.b(jLongValue, r02);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarB2.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(wVarB2.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z4 = this.f7068g;
        int i = this.f7071b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f7072c), roundingMode).toPlainString().substring(2);
            wVarB.getClass();
            if (z4) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z4) {
            wVarB.getClass();
            sb.append('.');
        }
        for (int i5 = 0; i5 < i; i5++) {
            wVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        int i5 = (qVar.k() || b(qVar)) ? this.f7071b : 0;
        int i6 = (qVar.k() || b(qVar)) ? this.f7072c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i5 > 0 ? ~i : i;
        }
        if (this.f7068g) {
            char cCharAt = charSequence.charAt(i);
            qVar.f().getClass();
            if (cCharAt != '.') {
                return i5 > 0 ? ~i : i;
            }
            i++;
        }
        int i7 = i;
        int i8 = i5 + i7;
        if (i8 > length) {
            return ~i7;
        }
        int iMin = Math.min(i6 + i7, length);
        int i9 = 0;
        int i10 = i7;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            int i11 = i10 + 1;
            int iA = qVar.f().a(charSequence.charAt(i10));
            if (iA >= 0) {
                i9 = (i9 * 10) + iA;
                i10 = i11;
            } else if (i11 < i8) {
                return ~i7;
            }
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(i9).movePointLeft(i10 - i7);
        ?? r5 = this.f7070a;
        j$.time.temporal.w wVarB = r5.B();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarB.e());
        return qVar.n(r5, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(wVarB.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i7, i10);
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f7070a + "," + this.f7071b + "," + this.f7072c + (this.f7068g ? ",DecimalPoint" : "") + ")";
    }
}
