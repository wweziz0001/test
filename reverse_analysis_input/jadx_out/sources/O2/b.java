package O2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f1651w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f1652x = new String[128];
    public static final String[] y;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Writer f1653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f1654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public G2.a f1656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f1657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f1658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f1662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1663v;

    static {
        for (int i = 0; i <= 31; i++) {
            f1652x[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f1652x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f1654m = iArr;
        this.f1655n = 0;
        if (iArr.length == 0) {
            this.f1654m = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f1654m;
        int i = this.f1655n;
        this.f1655n = i + 1;
        iArr2[i] = 6;
        this.f1660s = 2;
        this.f1663v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1653l = writer;
        r(G2.a.f887d);
    }

    public final void A() throws IOException {
        if (this.f1662u != null) {
            int iQ = q();
            if (iQ == 5) {
                this.f1653l.write(this.f1658q);
            } else if (iQ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            this.f1654m[this.f1655n - 1] = 4;
            t(this.f1662u);
            this.f1662u = null;
        }
    }

    public final void a() throws IOException {
        int iQ = q();
        if (iQ == 1) {
            this.f1654m[this.f1655n - 1] = 2;
            o();
            return;
        }
        Writer writer = this.f1653l;
        if (iQ == 2) {
            writer.append((CharSequence) this.f1658q);
            o();
        } else {
            if (iQ == 4) {
                writer.append((CharSequence) this.f1657p);
                this.f1654m[this.f1655n - 1] = 5;
                return;
            }
            if (iQ != 6) {
                if (iQ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f1660s != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f1654m[this.f1655n - 1] = 7;
        }
    }

    public void b() throws IOException {
        A();
        a();
        int i = this.f1655n;
        int[] iArr = this.f1654m;
        if (i == iArr.length) {
            this.f1654m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f1654m;
        int i5 = this.f1655n;
        this.f1655n = i5 + 1;
        iArr2[i5] = 1;
        this.f1653l.write(91);
    }

    public void c() throws IOException {
        A();
        a();
        int i = this.f1655n;
        int[] iArr = this.f1654m;
        if (i == iArr.length) {
            this.f1654m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f1654m;
        int i5 = this.f1655n;
        this.f1655n = i5 + 1;
        iArr2[i5] = 3;
        this.f1653l.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1653l.close();
        int i = this.f1655n;
        if (i > 1 || (i == 1 && this.f1654m[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1655n = 0;
    }

    public final void f(int i, int i5, char c5) throws IOException {
        int iQ = q();
        if (iQ != i5 && iQ != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1662u != null) {
            throw new IllegalStateException("Dangling name: " + this.f1662u);
        }
        this.f1655n--;
        if (iQ == i5) {
            o();
        }
        this.f1653l.write(c5);
    }

    public void flush() throws IOException {
        if (this.f1655n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1653l.flush();
    }

    public void k() throws IOException {
        f(1, 2, ']');
    }

    public void l() throws IOException {
        f(3, 5, '}');
    }

    public void n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1662u != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iQ = q();
        if (iQ != 3 && iQ != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f1662u = str;
    }

    public final void o() throws IOException {
        if (this.f1659r) {
            return;
        }
        String str = this.f1656o.f888a;
        Writer writer = this.f1653l;
        writer.write(str);
        int i = this.f1655n;
        for (int i5 = 1; i5 < i; i5++) {
            writer.write(this.f1656o.f889b);
        }
    }

    public b p() throws IOException {
        if (this.f1662u != null) {
            if (!this.f1663v) {
                this.f1662u = null;
                return this;
            }
            A();
        }
        a();
        this.f1653l.write("null");
        return this;
    }

    public final int q() {
        int i = this.f1655n;
        if (i != 0) {
            return this.f1654m[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void r(G2.a aVar) {
        Objects.requireNonNull(aVar);
        this.f1656o = aVar;
        this.f1658q = ",";
        if (aVar.f890c) {
            this.f1657p = ": ";
            if (aVar.f888a.isEmpty()) {
                this.f1658q = ", ";
            }
        } else {
            this.f1657p = ":";
        }
        this.f1659r = this.f1656o.f888a.isEmpty() && this.f1656o.f889b.isEmpty();
    }

    public final void s(int i) {
        if (i == 0) {
            throw null;
        }
        this.f1660s = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f1661t
            if (r0 == 0) goto L7
            java.lang.String[] r0 = O2.b.y
            goto L9
        L7:
            java.lang.String[] r0 = O2.b.f1652x
        L9:
            java.io.Writer r1 = r8.f1653l
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.b.t(java.lang.String):void");
    }

    public void u(double d5) throws IOException {
        A();
        if (this.f1660s == 1 || !(Double.isNaN(d5) || Double.isInfinite(d5))) {
            a();
            this.f1653l.append((CharSequence) Double.toString(d5));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d5);
        }
    }

    public void v(long j5) throws IOException {
        A();
        a();
        this.f1653l.write(Long.toString(j5));
    }

    public void w(Boolean bool) throws IOException {
        if (bool == null) {
            p();
            return;
        }
        A();
        a();
        this.f1653l.write(bool.booleanValue() ? "true" : "false");
    }

    public void x(Number number) throws IOException {
        if (number == null) {
            p();
            return;
        }
        A();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f1660s != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f1651w.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        a();
        this.f1653l.append((CharSequence) string);
    }

    public void y(String str) throws IOException {
        if (str == null) {
            p();
            return;
        }
        A();
        a();
        t(str);
    }

    public void z(boolean z4) throws IOException {
        A();
        a();
        this.f1653l.write(z4 ? "true" : "false");
    }
}
