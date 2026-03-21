package j0;

import b0.AbstractC0301e;
import b0.C0298b;
import b0.C0299c;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: j0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0520A extends AbstractC0301e {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(int i5, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i5) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // b0.InterfaceC0300d
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i6 = this.f4835b.f4832c;
        if (i6 == 21) {
            byteBufferJ = j((i5 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i6 == 22) {
            byteBufferJ = j(i5);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i6 == 1342177280) {
            byteBufferJ = j((i5 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i6 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i5);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // b0.AbstractC0301e
    public final C0298b f(C0298b c0298b) throws C0299c {
        int i5 = c0298b.f4832c;
        if (i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4) {
            return i5 != 4 ? new C0298b(c0298b.f4830a, c0298b.f4831b, 4) : C0298b.f4829e;
        }
        throw new C0299c(c0298b);
    }
}
