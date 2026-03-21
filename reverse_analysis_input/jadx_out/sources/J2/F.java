package J2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class F extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r()) {
            try {
                arrayList.add(Integer.valueOf(aVar.w()));
            } catch (NumberFormatException e5) {
                throw new G2.h(e5);
            }
        }
        aVar.k();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        bVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            bVar.v(r6.get(i));
        }
        bVar.k();
    }
}
