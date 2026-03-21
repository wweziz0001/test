package J2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: J2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084q extends O2.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0083p f1171C = new C0083p();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final G2.k f1172D = new G2.k("closed");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f1173A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public G2.g f1174B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f1175z;

    public C0084q() {
        super(f1171C);
        this.f1175z = new ArrayList();
        this.f1174B = G2.i.f905l;
    }

    public final G2.g B() {
        return (G2.g) this.f1175z.get(r0.size() - 1);
    }

    public final void C(G2.g gVar) {
        if (this.f1173A != null) {
            if (!(gVar instanceof G2.i) || this.f1663v) {
                G2.j jVar = (G2.j) B();
                String str = this.f1173A;
                jVar.getClass();
                jVar.f906l.put(str, gVar);
            }
            this.f1173A = null;
            return;
        }
        if (this.f1175z.isEmpty()) {
            this.f1174B = gVar;
            return;
        }
        G2.g gVarB = B();
        if (!(gVarB instanceof G2.f)) {
            throw new IllegalStateException();
        }
        ((G2.f) gVarB).f904l.add(gVar);
    }

    @Override // O2.b
    public final void b() {
        G2.f fVar = new G2.f();
        C(fVar);
        this.f1175z.add(fVar);
    }

    @Override // O2.b
    public final void c() {
        G2.j jVar = new G2.j();
        C(jVar);
        this.f1175z.add(jVar);
    }

    @Override // O2.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f1175z;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f1172D);
    }

    @Override // O2.b
    public final void k() {
        ArrayList arrayList = this.f1175z;
        if (arrayList.isEmpty() || this.f1173A != null) {
            throw new IllegalStateException();
        }
        if (!(B() instanceof G2.f)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // O2.b
    public final void l() {
        ArrayList arrayList = this.f1175z;
        if (arrayList.isEmpty() || this.f1173A != null) {
            throw new IllegalStateException();
        }
        if (!(B() instanceof G2.j)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // O2.b
    public final void n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1175z.isEmpty() || this.f1173A != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(B() instanceof G2.j)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f1173A = str;
    }

    @Override // O2.b
    public final O2.b p() {
        C(G2.i.f905l);
        return this;
    }

    @Override // O2.b
    public final void u(double d5) {
        if (this.f1660s == 1 || (!Double.isNaN(d5) && !Double.isInfinite(d5))) {
            C(new G2.k(Double.valueOf(d5)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d5);
        }
    }

    @Override // O2.b
    public final void v(long j5) {
        C(new G2.k(Long.valueOf(j5)));
    }

    @Override // O2.b
    public final void w(Boolean bool) {
        if (bool == null) {
            C(G2.i.f905l);
        } else {
            C(new G2.k(bool));
        }
    }

    @Override // O2.b
    public final void x(Number number) {
        if (number == null) {
            C(G2.i.f905l);
            return;
        }
        if (this.f1660s != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        C(new G2.k(number));
    }

    @Override // O2.b
    public final void y(String str) {
        if (str == null) {
            C(G2.i.f905l);
        } else {
            C(new G2.k(str));
        }
    }

    @Override // O2.b
    public final void z(boolean z4) {
        C(new G2.k(Boolean.valueOf(z4)));
    }

    @Override // O2.b, java.io.Flushable
    public final void flush() {
    }
}
