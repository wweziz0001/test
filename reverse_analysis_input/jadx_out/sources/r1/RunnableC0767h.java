package r1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: r1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0767h implements Runnable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ThreadLocal f9490p = new ThreadLocal();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I2.l f9491q = new I2.l(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f9492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f9495o;

    public final void a(RecyclerView recyclerView, int i, int i5) {
        if (recyclerView.f4749x && this.f9493m == 0) {
            this.f9493m = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        D0.e eVar = recyclerView.f4726h0;
        eVar.f397a = i;
        eVar.f398b = i5;
    }

    public final void b(long j5) {
        C0766g c0766g;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f9492l;
        int size = arrayList.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                D0.e eVar = recyclerView2.f4726h0;
                eVar.f399c = 0;
                i += eVar.f399c;
            }
        }
        ArrayList arrayList2 = this.f9495o;
        arrayList2.ensureCapacity(i);
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                D0.e eVar2 = recyclerView3.f4726h0;
                Math.abs(eVar2.f397a);
                Math.abs(eVar2.f398b);
                if (eVar2.f399c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0766g());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f9491q);
        if (arrayList2.size() <= 0 || (recyclerView = (c0766g = (C0766g) arrayList2.get(0)).f9488d) == null) {
            return;
        }
        int i7 = c0766g.f9489e;
        if (recyclerView.f4736o.K() > 0) {
            RecyclerView.j(recyclerView.f4736o.J(0));
            throw null;
        }
        io.flutter.plugin.platform.c cVar = recyclerView.f4730l;
        try {
            recyclerView.f4704H++;
            cVar.c(i7);
            throw null;
        } catch (Throwable th) {
            int i8 = recyclerView.f4704H - 1;
            recyclerView.f4704H = i8;
            if (i8 < 1) {
                recyclerView.f4704H = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = z.d.f11118a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f9492l;
            if (arrayList.isEmpty()) {
                this.f9493m = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f9493m = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f9494n);
                this.f9493m = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f9493m = 0L;
            int i6 = z.d.f11118a;
            Trace.endSection();
            throw th;
        }
    }
}
