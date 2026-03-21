package f0;

import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import m2.b0;

/* JADX INFO: renamed from: f0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408c implements InterfaceC0413h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5659m = new ArrayList(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0417l f5661o;

    public AbstractC0408c(boolean z4) {
        this.f5658l = z4;
    }

    public final void a(int i) {
        C0417l c0417l = this.f5661o;
        int i5 = AbstractC0370w.f5326a;
        for (int i6 = 0; i6 < this.f5660n; i6++) {
            InterfaceC0403A interfaceC0403A = (InterfaceC0403A) this.f5659m.get(i6);
            boolean z4 = this.f5658l;
            B0.i iVar = (B0.i) interfaceC0403A;
            synchronized (iVar) {
                b0 b0Var = B0.i.f203n;
                if (z4 && (c0417l.f5693h & 8) != 8) {
                    iVar.f217h += (long) i;
                }
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        interfaceC0403A.getClass();
        ArrayList arrayList = this.f5659m;
        if (arrayList.contains(interfaceC0403A)) {
            return;
        }
        arrayList.add(interfaceC0403A);
        this.f5660n++;
    }

    public final void c() {
        C0417l c0417l = this.f5661o;
        int i = AbstractC0370w.f5326a;
        for (int i5 = 0; i5 < this.f5660n; i5++) {
            InterfaceC0403A interfaceC0403A = (InterfaceC0403A) this.f5659m.get(i5);
            boolean z4 = this.f5658l;
            B0.i iVar = (B0.i) interfaceC0403A;
            synchronized (iVar) {
                try {
                    b0 b0Var = B0.i.f203n;
                    if (z4 && (c0417l.f5693h & 8) != 8) {
                        AbstractC0360m.h(iVar.f215f > 0);
                        iVar.f212c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i6 = (int) (jElapsedRealtime - iVar.f216g);
                        iVar.i += (long) i6;
                        long j5 = iVar.f218j;
                        long j6 = iVar.f217h;
                        iVar.f218j = j5 + j6;
                        if (i6 > 0) {
                            iVar.f214e.a((j6 * 8000.0f) / i6, (int) Math.sqrt(j6));
                            if (iVar.i >= 2000 || iVar.f218j >= 524288) {
                                iVar.f219k = (long) iVar.f214e.b();
                            }
                            iVar.c(i6, iVar.f217h, iVar.f219k);
                            iVar.f216g = jElapsedRealtime;
                            iVar.f217h = 0L;
                        }
                        iVar.f215f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f5661o = null;
    }

    public final void d() {
        for (int i = 0; i < this.f5660n; i++) {
            ((InterfaceC0403A) this.f5659m.get(i)).getClass();
        }
    }

    public final void i(C0417l c0417l) {
        this.f5661o = c0417l;
        for (int i = 0; i < this.f5660n; i++) {
            InterfaceC0403A interfaceC0403A = (InterfaceC0403A) this.f5659m.get(i);
            boolean z4 = this.f5658l;
            B0.i iVar = (B0.i) interfaceC0403A;
            synchronized (iVar) {
                try {
                    b0 b0Var = B0.i.f203n;
                    if (z4 && (c0417l.f5693h & 8) != 8) {
                        if (iVar.f215f == 0) {
                            iVar.f212c.getClass();
                            iVar.f216g = SystemClock.elapsedRealtime();
                        }
                        iVar.f215f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
