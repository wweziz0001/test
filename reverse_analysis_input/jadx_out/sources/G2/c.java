package G2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class c extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f893b;

    public /* synthetic */ c(r rVar, int i) {
        this.f892a = i;
        this.f893b = rVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        switch (this.f892a) {
            case 0:
                return new AtomicLong(((Number) this.f893b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.r()) {
                    arrayList.add(Long.valueOf(((Number) this.f893b.b(aVar)).longValue()));
                }
                aVar.k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        switch (this.f892a) {
            case 0:
                this.f893b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f893b.c(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.k();
                break;
        }
    }
}
