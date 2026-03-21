package Q;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1731d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.i f1733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1734c = 0;

    public p(Z1.i iVar, int i) {
        this.f1733b = iVar;
        this.f1732a = i;
    }

    public final int a(int i) {
        R.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.f376o;
        int i5 = iA + aVarC.f373l;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final int b() {
        R.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + aVarC.f373l;
        return ((ByteBuffer) aVarC.f376o).getInt(((ByteBuffer) aVarC.f376o).getInt(i) + i);
    }

    public final R.a c() {
        ThreadLocal threadLocal = f1731d;
        R.a aVar = (R.a) threadLocal.get();
        if (aVar == null) {
            aVar = new R.a();
            threadLocal.set(aVar);
        }
        R.b bVar = (R.b) this.f1733b.f3012l;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f373l;
            int i5 = (this.f1732a * 4) + ((ByteBuffer) bVar.f376o).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) bVar.f376o).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f376o;
            aVar.f376o = byteBuffer;
            if (byteBuffer != null) {
                aVar.f373l = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                aVar.f374m = i7;
                aVar.f375n = ((ByteBuffer) aVar.f376o).getShort(i7);
            } else {
                aVar.f373l = 0;
                aVar.f374m = 0;
                aVar.f375n = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        R.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f376o).getInt(iA + aVarC.f373l) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
