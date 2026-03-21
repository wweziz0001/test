package O2;

import O.j;
import b3.AbstractC0307a;
import com.ryanheise.audioservice.AudioService;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Reader f1637l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f1646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f1647v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String[] f1649x;
    public int[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1650z = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final char[] f1638m = new char[1024];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1639n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1640o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1641p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1642q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1643r = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1648w = 1;

    static {
        A0.b.f47m = new A0.b(18);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f1647v = iArr;
        iArr[0] = 6;
        this.f1649x = new String[32];
        this.y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f1637l = reader;
    }

    public void A() {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 7) {
            throw M("null");
        }
        this.f1643r = 0;
        int[] iArr = this.y;
        int i = this.f1648w - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f1639n = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f1639n = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B(char r12) throws O2.c {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f1639n
            int r3 = r11.f1640o
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r11.f1638m
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r5[r2]
            int r9 = r11.f1650z
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.L(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f1639n = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r5, r3, r8)
            return r12
        L31:
            r1.append(r5, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f1639n = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L4f:
            r1.append(r5, r3, r2)
            char r2 = r11.G()
            r1.append(r2)
            int r2 = r11.f1639n
            int r3 = r11.f1640o
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f1641p
            int r2 = r2 + r6
            r11.f1641p = r2
            r11.f1642q = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r11.f1639n = r2
            boolean r2 = r11.n(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.L(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.B(char):java.lang.String");
    }

    public String C() throws IOException {
        String str;
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = D();
        } else if (iF == 8) {
            str = B('\'');
        } else if (iF == 9) {
            str = B('\"');
        } else if (iF == 11) {
            str = this.f1646u;
            this.f1646u = null;
        } else if (iF == 15) {
            str = Long.toString(this.f1644s);
        } else {
            if (iF != 16) {
                throw M("a string");
            }
            str = new String(this.f1638m, this.f1639n, this.f1645t);
            this.f1639n += this.f1645t;
        }
        this.f1643r = 0;
        int[] iArr = this.y;
        int i = this.f1648w - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String D() throws O2.c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f1639n
            int r4 = r3 + r2
            int r5 = r7.f1640o
            char[] r6 = r7.f1638m
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.n(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f1639n
            r0.append(r6, r3, r2)
            int r3 = r7.f1639n
            int r3 = r3 + r2
            r7.f1639n = r3
            r2 = 1
            boolean r2 = r7.n(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1639n
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f1639n
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f1639n
            int r2 = r2 + r1
            r7.f1639n = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.D():java.lang.String");
    }

    public int E() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void F(int i) throws c {
        int i5 = this.f1648w;
        if (i5 - 1 >= 255) {
            throw new c("Nesting limit 255 reached" + t());
        }
        int[] iArr = this.f1647v;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f1647v = Arrays.copyOf(iArr, i6);
            this.y = Arrays.copyOf(this.y, i6);
            this.f1649x = (String[]) Arrays.copyOf(this.f1649x, i6);
        }
        int[] iArr2 = this.f1647v;
        int i7 = this.f1648w;
        this.f1648w = i7 + 1;
        iArr2[i7] = i;
    }

    public final char G() throws c {
        int i;
        if (this.f1639n == this.f1640o && !n(1)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f1639n;
        int i6 = i5 + 1;
        this.f1639n = i6;
        char[] cArr = this.f1638m;
        char c5 = cArr[i5];
        if (c5 != '\n') {
            if (c5 != '\"') {
                if (c5 != '\'') {
                    if (c5 != '/' && c5 != '\\') {
                        if (c5 == 'b') {
                            return '\b';
                        }
                        if (c5 == 'f') {
                            return '\f';
                        }
                        if (c5 == 'n') {
                            return '\n';
                        }
                        if (c5 == 'r') {
                            return '\r';
                        }
                        if (c5 == 't') {
                            return '\t';
                        }
                        if (c5 != 'u') {
                            L("Invalid escape sequence");
                            throw null;
                        }
                        if (i5 + 5 > this.f1640o && !n(4)) {
                            L("Unterminated escape sequence");
                            throw null;
                        }
                        int i7 = this.f1639n;
                        int i8 = i7 + 4;
                        int i9 = 0;
                        while (i7 < i8) {
                            char c6 = cArr[i7];
                            int i10 = i9 << 4;
                            if (c6 >= '0' && c6 <= '9') {
                                i = c6 - '0';
                            } else if (c6 >= 'a' && c6 <= 'f') {
                                i = c6 - 'W';
                            } else {
                                if (c6 < 'A' || c6 > 'F') {
                                    L("Malformed Unicode escape \\u".concat(new String(cArr, this.f1639n, 4)));
                                    throw null;
                                }
                                i = c6 - '7';
                            }
                            i9 = i + i10;
                            i7++;
                        }
                        this.f1639n += 4;
                        return (char) i9;
                    }
                }
            }
            return c5;
        }
        if (this.f1650z == 3) {
            L("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f1641p++;
        this.f1642q = i6;
        if (this.f1650z == 3) {
            L("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c5;
    }

    public final void H(char c5) throws c {
        do {
            int i = this.f1639n;
            int i5 = this.f1640o;
            while (i < i5) {
                int i6 = i + 1;
                char c6 = this.f1638m[i];
                if (c6 == c5) {
                    this.f1639n = i6;
                    return;
                }
                if (c6 == '\\') {
                    this.f1639n = i6;
                    G();
                    i = this.f1639n;
                    i5 = this.f1640o;
                } else {
                    if (c6 == '\n') {
                        this.f1641p++;
                        this.f1642q = i6;
                    }
                    i = i6;
                }
            }
            this.f1639n = i;
        } while (n(1));
        L("Unterminated string");
        throw null;
    }

    public final void I() {
        char c5;
        do {
            if (this.f1639n >= this.f1640o && !n(1)) {
                return;
            }
            int i = this.f1639n;
            int i5 = i + 1;
            this.f1639n = i5;
            c5 = this.f1638m[i];
            if (c5 == '\n') {
                this.f1641p++;
                this.f1642q = i5;
                return;
            }
        } while (c5 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() throws O2.c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f1639n
            int r2 = r1 + r0
            int r3 = r4.f1640o
            if (r2 >= r3) goto L51
            char[] r2 = r4.f1638m
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.c()
        L4b:
            int r1 = r4.f1639n
            int r1 = r1 + r0
            r4.f1639n = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f1639n = r1
            r0 = 1
            boolean r0 = r4.n(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.J():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void K() throws IOException {
        int i = 0;
        do {
            int iF = this.f1643r;
            if (iF == 0) {
                iF = f();
            }
            switch (iF) {
                case 1:
                    F(3);
                    i++;
                    this.f1643r = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f1649x[this.f1648w - 1] = null;
                    }
                    this.f1648w--;
                    i--;
                    this.f1643r = 0;
                    break;
                case 3:
                    F(1);
                    i++;
                    this.f1643r = 0;
                    break;
                case 4:
                    this.f1648w--;
                    i--;
                    this.f1643r = 0;
                    break;
                case 5:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 15:
                default:
                    this.f1643r = 0;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    H('\'');
                    this.f1643r = 0;
                    break;
                case 9:
                    H('\"');
                    this.f1643r = 0;
                    break;
                case 10:
                    J();
                    this.f1643r = 0;
                    break;
                case 12:
                    H('\'');
                    if (i == 0) {
                        this.f1649x[this.f1648w - 1] = "<skipped>";
                    }
                    this.f1643r = 0;
                    break;
                case 13:
                    H('\"');
                    if (i == 0) {
                        this.f1649x[this.f1648w - 1] = "<skipped>";
                    }
                    this.f1643r = 0;
                    break;
                case 14:
                    J();
                    if (i == 0) {
                        this.f1649x[this.f1648w - 1] = "<skipped>";
                    }
                    this.f1643r = 0;
                    break;
                case 16:
                    this.f1639n += this.f1645t;
                    this.f1643r = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.y;
        int i5 = this.f1648w - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    public final void L(String str) throws c {
        throw new c(str + t() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final IllegalStateException M(String str) {
        String str2 = E() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM = AbstractC0307a.m("Expected ", str, " but was ");
        sbM.append(AbstractC0307a.t(E()));
        sbM.append(t());
        sbM.append("\nSee ");
        sbM.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM.toString());
    }

    public void a() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 3) {
            throw M("BEGIN_ARRAY");
        }
        F(1);
        this.y[this.f1648w - 1] = 0;
        this.f1643r = 0;
    }

    public void b() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 1) {
            throw M("BEGIN_OBJECT");
        }
        F(3);
        this.f1643r = 0;
    }

    public final void c() throws c {
        if (this.f1650z == 1) {
            return;
        }
        L("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1643r = 0;
        this.f1647v[0] = 8;
        this.f1648w = 1;
        this.f1637l.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0219, code lost:
    
        if (s(r1) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.f():int");
    }

    public void k() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw M("END_ARRAY");
        }
        int i = this.f1648w;
        this.f1648w = i - 1;
        int[] iArr = this.y;
        int i5 = i - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f1643r = 0;
    }

    public void l() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw M("END_OBJECT");
        }
        int i = this.f1648w;
        int i5 = i - 1;
        this.f1648w = i5;
        this.f1649x[i5] = null;
        int[] iArr = this.y;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f1643r = 0;
    }

    public final boolean n(int i) throws IOException {
        int i5;
        int i6;
        int i7 = this.f1642q;
        int i8 = this.f1639n;
        this.f1642q = i7 - i8;
        int i9 = this.f1640o;
        char[] cArr = this.f1638m;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f1640o = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f1640o = 0;
        }
        this.f1639n = 0;
        do {
            int i11 = this.f1640o;
            int i12 = this.f1637l.read(cArr, i11, cArr.length - i11);
            if (i12 == -1) {
                return false;
            }
            i5 = this.f1640o + i12;
            this.f1640o = i5;
            if (this.f1641p == 0 && (i6 = this.f1642q) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f1639n++;
                this.f1642q = i6 + 1;
                i++;
            }
        } while (i5 < i);
        return true;
    }

    public String o() {
        return p(false);
    }

    public final String p(boolean z4) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i5 = this.f1648w;
            if (i >= i5) {
                return sb.toString();
            }
            int i6 = this.f1647v[i];
            switch (i6) {
                case 1:
                case 2:
                    int i7 = this.y[i];
                    if (z4 && i7 > 0 && i == i5 - 1) {
                        i7--;
                    }
                    sb.append('[');
                    sb.append(i7);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f1649x[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                default:
                    throw new AssertionError(AbstractC0307a.i("Unknown scope value: ", i6));
            }
            i++;
        }
    }

    public String q() {
        return p(true);
    }

    public boolean r() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 17) ? false : true;
    }

    public final boolean s(char c5) throws c {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case AudioService.KEYCODE_BYPASS_PLAY /* 91 */:
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    final String t() {
        return " at line " + (this.f1641p + 1) + " column " + ((this.f1639n - this.f1642q) + 1) + " path " + o();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }

    public boolean u() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.f1643r = 0;
            int[] iArr = this.y;
            int i = this.f1648w - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iF != 6) {
            throw M("a boolean");
        }
        this.f1643r = 0;
        int[] iArr2 = this.y;
        int i5 = this.f1648w - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return false;
    }

    public double v() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f1643r = 0;
            int[] iArr = this.y;
            int i = this.f1648w - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1644s;
        }
        if (iF == 16) {
            this.f1646u = new String(this.f1638m, this.f1639n, this.f1645t);
            this.f1639n += this.f1645t;
        } else if (iF == 8 || iF == 9) {
            this.f1646u = B(iF == 8 ? '\'' : '\"');
        } else if (iF == 10) {
            this.f1646u = D();
        } else if (iF != 11) {
            throw M("a double");
        }
        this.f1643r = 11;
        double d5 = Double.parseDouble(this.f1646u);
        if (this.f1650z != 1 && (Double.isNaN(d5) || Double.isInfinite(d5))) {
            L("JSON forbids NaN and infinities: " + d5);
            throw null;
        }
        this.f1646u = null;
        this.f1643r = 0;
        int[] iArr2 = this.y;
        int i5 = this.f1648w - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return d5;
    }

    public int w() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j5 = this.f1644s;
            int i = (int) j5;
            if (j5 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f1644s + t());
            }
            this.f1643r = 0;
            int[] iArr = this.y;
            int i5 = this.f1648w - 1;
            iArr[i5] = iArr[i5] + 1;
            return i;
        }
        if (iF == 16) {
            this.f1646u = new String(this.f1638m, this.f1639n, this.f1645t);
            this.f1639n += this.f1645t;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw M("an int");
            }
            if (iF == 10) {
                this.f1646u = D();
            } else {
                this.f1646u = B(iF == 8 ? '\'' : '\"');
            }
            try {
                int i6 = Integer.parseInt(this.f1646u);
                this.f1643r = 0;
                int[] iArr2 = this.y;
                int i7 = this.f1648w - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1643r = 11;
        double d5 = Double.parseDouble(this.f1646u);
        int i8 = (int) d5;
        if (i8 != d5) {
            throw new NumberFormatException("Expected an int but was " + this.f1646u + t());
        }
        this.f1646u = null;
        this.f1643r = 0;
        int[] iArr3 = this.y;
        int i9 = this.f1648w - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }

    public long x() throws IOException {
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f1643r = 0;
            int[] iArr = this.y;
            int i = this.f1648w - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1644s;
        }
        if (iF == 16) {
            this.f1646u = new String(this.f1638m, this.f1639n, this.f1645t);
            this.f1639n += this.f1645t;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw M("a long");
            }
            if (iF == 10) {
                this.f1646u = D();
            } else {
                this.f1646u = B(iF == 8 ? '\'' : '\"');
            }
            try {
                long j5 = Long.parseLong(this.f1646u);
                this.f1643r = 0;
                int[] iArr2 = this.y;
                int i5 = this.f1648w - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return j5;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1643r = 11;
        double d5 = Double.parseDouble(this.f1646u);
        long j6 = (long) d5;
        if (j6 != d5) {
            throw new NumberFormatException("Expected a long but was " + this.f1646u + t());
        }
        this.f1646u = null;
        this.f1643r = 0;
        int[] iArr3 = this.y;
        int i6 = this.f1648w - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j6;
    }

    public String y() throws IOException {
        String strB;
        int iF = this.f1643r;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strB = D();
        } else if (iF == 12) {
            strB = B('\'');
        } else {
            if (iF != 13) {
                throw M("a name");
            }
            strB = B('\"');
        }
        this.f1643r = 0;
        this.f1649x[this.f1648w - 1] = strB;
        return strB;
    }

    public final int z(boolean z4) throws IOException {
        int i = this.f1639n;
        int i5 = this.f1640o;
        while (true) {
            if (i == i5) {
                this.f1639n = i;
                if (!n(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + t());
                }
                i = this.f1639n;
                i5 = this.f1640o;
            }
            int i6 = i + 1;
            char[] cArr = this.f1638m;
            char c5 = cArr[i];
            if (c5 == '\n') {
                this.f1641p++;
                this.f1642q = i6;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.f1639n = i6;
                    if (i6 == i5) {
                        this.f1639n = i;
                        boolean zN = n(2);
                        this.f1639n++;
                        if (!zN) {
                            return c5;
                        }
                    }
                    c();
                    int i7 = this.f1639n;
                    char c6 = cArr[i7];
                    if (c6 == '*') {
                        this.f1639n = i7 + 1;
                        while (true) {
                            if (this.f1639n + 2 > this.f1640o && !n(2)) {
                                L("Unterminated comment");
                                throw null;
                            }
                            int i8 = this.f1639n;
                            if (cArr[i8] != '\n') {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    if (cArr[this.f1639n + i9] != "*/".charAt(i9)) {
                                        break;
                                    }
                                }
                                i = this.f1639n + 2;
                                i5 = this.f1640o;
                                break;
                            }
                            this.f1641p++;
                            this.f1642q = i8 + 1;
                            this.f1639n++;
                        }
                    } else {
                        if (c6 != '/') {
                            return c5;
                        }
                        this.f1639n = i7 + 1;
                        I();
                        i = this.f1639n;
                        i5 = this.f1640o;
                    }
                } else {
                    if (c5 != '#') {
                        this.f1639n = i6;
                        return c5;
                    }
                    this.f1639n = i6;
                    c();
                    I();
                    i = this.f1639n;
                    i5 = this.f1640o;
                }
            }
            i = i6;
        }
    }
}
