package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long[] f7069f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Enum f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f7071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f7072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f7073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f7074e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.r rVar, int i, int i5, z zVar) {
        this.f7070a = (Enum) rVar;
        this.f7071b = i;
        this.f7072c = i5;
        this.f7073d = zVar;
        this.f7074e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.r rVar, int i, int i5, z zVar, int i6) {
        this.f7070a = (Enum) rVar;
        this.f7071b = i;
        this.f7072c = i5;
        this.f7073d = zVar;
        this.f7074e = i6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i c() {
        return this.f7074e == -1 ? this : new i(this.f7070a, this.f7071b, this.f7072c, this.f7073d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i d(int i) {
        int i5 = this.f7074e + i;
        return new i(this.f7070a, this.f7071b, this.f7072c, this.f7073d, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean p(t tVar, StringBuilder sb) {
        ?? r02 = this.f7070a;
        Long lE = tVar.e(r02);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        w wVarB = tVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.f7072c;
        if (length > i) {
            throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        wVarB.getClass();
        int i5 = this.f7071b;
        z zVar = this.f7073d;
        if (jLongValue >= 0) {
            int i6 = c.f7064a[zVar.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    sb.append('+');
                }
            } else if (i5 < 19 && jLongValue >= f7069f[i5]) {
                sb.append('+');
            }
        } else {
            int i7 = c.f7064a[zVar.ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                sb.append('-');
            } else if (i7 == 4) {
                throw new j$.time.c("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i8 = 0; i8 < i5 - string.length(); i8++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    boolean b(q qVar) {
        int i = this.f7074e;
        return i == -1 || (i > 0 && this.f7071b == this.f7072c && this.f7073d == z.NOT_NEGATIVE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x013d, code lost:
    
        return ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013e, code lost:
    
        r3 = r20.f7070a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        if (r2 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0148, code lost:
    
        if (r2.bitLength() <= 63) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x014a, code lost:
    
        r2 = r2.divide(java.math.BigInteger.TEN);
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015e, code lost:
    
        return r21.n(r3, r2.longValue(), r1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0167, code lost:
    
        return r21.n(r3, r4, r1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f2, code lost:
    
        r2 = r16;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fc, code lost:
    
        if (r3 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        if (r2 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        if (r2.equals(java.math.BigInteger.ZERO) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010c, code lost:
    
        if (r21.k() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0111, code lost:
    
        return ~(r1 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0112, code lost:
    
        r2 = r2.negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0116, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0118, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011d, code lost:
    
        if (r9 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0123, code lost:
    
        if (r21.k() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0126, code lost:
    
        r4 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012b, code lost:
    
        if (r7 != j$.time.format.z.EXCEEDS_PAD) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0131, code lost:
    
        if (r21.k() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0133, code lost:
    
        r3 = r13 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0135, code lost:
    
        if (r5 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0137, code lost:
    
        if (r3 > r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013a, code lost:
    
        if (r3 <= r8) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [j$.time.temporal.r, java.lang.Enum] */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r(j$.time.format.q r21, java.lang.CharSequence r22, int r23) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.r(j$.time.format.q, java.lang.CharSequence, int):int");
    }

    public String toString() {
        Enum r02 = this.f7070a;
        int i = this.f7072c;
        z zVar = this.f7073d;
        int i5 = this.f7071b;
        if (i5 == 1 && i == 19 && zVar == z.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i5 == i && zVar == z.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i5 + ")";
        }
        return "Value(" + r02 + "," + i5 + "," + i + "," + zVar + ")";
    }
}
