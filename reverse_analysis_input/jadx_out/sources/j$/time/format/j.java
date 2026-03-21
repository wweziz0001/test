package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String[] f7075d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j f7076e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final j f7077f = new j("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7080c;

    j(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = f7075d;
            if (i < 22) {
                if (strArr[i].equals(str)) {
                    this.f7079b = i;
                    this.f7080c = i % 11;
                    this.f7078a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        Long lE = tVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z4 = false;
        if (lE == null) {
            return false;
        }
        int intExact = Math.toIntExact(lE.longValue());
        String str = this.f7078a;
        if (intExact == 0) {
            sb.append(str);
        } else {
            int iAbs = Math.abs((intExact / 3600) % 100);
            int iAbs2 = Math.abs((intExact / 60) % 60);
            int iAbs3 = Math.abs(intExact % 60);
            int length = sb.length();
            sb.append(intExact < 0 ? "-" : "+");
            if (this.f7079b < 11 || iAbs >= 10) {
                a(false, iAbs, sb);
            } else {
                sb.append((char) (iAbs + 48));
            }
            int i = this.f7080c;
            if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
                a(i > 0 && i % 2 == 0, iAbs2, sb);
                iAbs += iAbs2;
                if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                    if (i > 0 && i % 2 == 0) {
                        z4 = true;
                    }
                    a(z4, iAbs3, sb);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    private static void a(boolean z4, int i, StringBuilder sb) {
        sb.append(z4 ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        int i5;
        int i6;
        int i7;
        int i8;
        int length = charSequence.length();
        int length2 = this.f7078a.length();
        if (length2 != 0) {
            if (i == length) {
                return ~i;
            }
            if (qVar.r(charSequence, i, this.f7078a, 0, length2)) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i + length2);
            }
        } else if (i == length) {
            return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i);
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i9 = cCharAt == '-' ? -1 : 1;
            int i10 = this.f7080c;
            boolean z4 = i10 > 0 && i10 % 2 == 0;
            int i11 = this.f7079b;
            boolean z5 = i11 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!qVar.k()) {
                if (z5) {
                    if (z4 || (i11 == 0 && length > (i8 = i + 3) && charSequence.charAt(i8) == ':')) {
                        i11 = 10;
                        z4 = true;
                    } else {
                        i11 = 9;
                    }
                } else if (z4 || (i11 == 11 && length > (i7 = i + 3) && (charSequence.charAt(i + 2) == ':' || charSequence.charAt(i7) == ':'))) {
                    i11 = 21;
                    z4 = true;
                } else {
                    i11 = 20;
                }
            }
            switch (i11) {
                case 0:
                case 11:
                    c(charSequence, z5, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z5, iArr);
                    d(charSequence, z4, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z5, iArr);
                    d(charSequence, z4, true, iArr);
                    break;
                case 5:
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                case 17:
                    c(charSequence, z5, iArr);
                    d(charSequence, z4, true, iArr);
                    b(charSequence, z4, 3, iArr);
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                case 19:
                    c(charSequence, z5, iArr);
                    d(charSequence, z4, true, iArr);
                    if (!b(charSequence, z4, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z5, iArr);
                    if (b(charSequence, z4, 2, iArr)) {
                        b(charSequence, z4, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i12 = iArr[0];
            if (i12 > 0) {
                int i13 = iArr[1];
                if (i13 > 23 || (i5 = iArr[2]) > 59 || (i6 = iArr[3]) > 59) {
                    throw new j$.time.c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i5) * 60) + (((long) i13) * 3600) + ((long) i6)) * ((long) i9), i, i12);
            }
        }
        return length2 == 0 ? qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    private static void c(CharSequence charSequence, boolean z4, int[] iArr) {
        if (z4) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z4, boolean z5, int[] iArr) {
        if (b(charSequence, z4, 2, iArr) || !z5) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    private static boolean b(CharSequence charSequence, boolean z4, int i, int[] iArr) {
        int i5 = iArr[0];
        if (i5 < 0) {
            return true;
        }
        if (z4 && i != 1) {
            int i6 = i5 + 1;
            if (i6 > charSequence.length() || charSequence.charAt(i5) != ':') {
                return false;
            }
            i5 = i6;
        }
        int i7 = i5 + 2;
        if (i7 > charSequence.length()) {
            return false;
        }
        int i8 = i5 + 1;
        char cCharAt = charSequence.charAt(i5);
        char cCharAt2 = charSequence.charAt(i8);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i9 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
            if (i9 >= 0 && i9 <= 59) {
                iArr[i] = i9;
                iArr[0] = i7;
                return true;
            }
        }
        return false;
    }

    private static void e(CharSequence charSequence, int i, int i5, int[] iArr) {
        int i6;
        char cCharAt;
        int i7 = iArr[0];
        char[] cArr = new char[i5];
        int i8 = 0;
        int i9 = 0;
        while (i8 < i5 && (i6 = i7 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i7)) >= '0' && cCharAt <= '9') {
            cArr[i8] = cCharAt;
            i9++;
            i8++;
            i7 = i6;
        }
        if (i9 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i9) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i7;
    }

    public final String toString() {
        String strReplace = this.f7078a.replace("'", "''");
        return "Offset(" + f7075d[this.f7079b] + ",'" + strReplace + "')";
    }
}
