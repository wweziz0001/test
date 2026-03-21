package n3;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w implements InterfaceC0703m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f8944a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8946c;

    static {
        f8945b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f8946c = Charset.forName("UTF8");
    }

    public static final void c(int i, ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position() % i;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i) - iPosition);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i = byteBuffer.get() & 255;
        return i < 254 ? i : i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(v vVar, int i) {
        int size = vVar.size() % i;
        if (size != 0) {
            for (int i5 = 0; i5 < i - size; i5++) {
                vVar.write(0);
            }
        }
    }

    public static final void h(v vVar, int i) {
        if (f8945b) {
            vVar.write(i);
            vVar.write(i >>> 8);
            vVar.write(i >>> 16);
            vVar.write(i >>> 24);
            return;
        }
        vVar.write(i >>> 24);
        vVar.write(i >>> 16);
        vVar.write(i >>> 8);
        vVar.write(i);
    }

    public static final void i(v vVar, long j5) {
        if (f8945b) {
            vVar.write((byte) j5);
            vVar.write((byte) (j5 >>> 8));
            vVar.write((byte) (j5 >>> 16));
            vVar.write((byte) (j5 >>> 24));
            vVar.write((byte) (j5 >>> 32));
            vVar.write((byte) (j5 >>> 40));
            vVar.write((byte) (j5 >>> 48));
            vVar.write((byte) (j5 >>> 56));
            return;
        }
        vVar.write((byte) (j5 >>> 56));
        vVar.write((byte) (j5 >>> 48));
        vVar.write((byte) (j5 >>> 40));
        vVar.write((byte) (j5 >>> 32));
        vVar.write((byte) (j5 >>> 24));
        vVar.write((byte) (j5 >>> 16));
        vVar.write((byte) (j5 >>> 8));
        vVar.write((byte) j5);
    }

    public static final void j(v vVar, int i) {
        if (i < 254) {
            vVar.write(i);
            return;
        }
        if (i > 65535) {
            vVar.write(255);
            h(vVar, i);
            return;
        }
        vVar.write(254);
        if (f8945b) {
            vVar.write(i);
            vVar.write(i >>> 8);
        } else {
            vVar.write(i >>> 8);
            vVar.write(i);
        }
    }

    @Override // n3.InterfaceC0703m
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objE = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objE;
    }

    @Override // n3.InterfaceC0703m
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        k(vVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b4, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f8946c;
        int i = 0;
        switch (b4) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                c(8, byteBuffer);
                return Double.valueOf(byteBuffer.getDouble());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int iD = d(byteBuffer);
                int[] iArr = new int[iD];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((iD * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int iD2 = d(byteBuffer);
                long[] jArr = new long[iD2];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((iD2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int iD3 = d(byteBuffer);
                double[] dArr = new double[iD3];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((iD3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int iD4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD4);
                while (i < iD4) {
                    arrayList.add(e(byteBuffer));
                    i++;
                }
                return arrayList;
            case 13:
                int iD5 = d(byteBuffer);
                HashMap map = new HashMap();
                while (i < iD5) {
                    map.put(e(byteBuffer), e(byteBuffer));
                    i++;
                }
                return map;
            case 14:
                int iD6 = d(byteBuffer);
                float[] fArr = new float[iD6];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((iD6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(v vVar, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            vVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            vVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z4 = obj instanceof Number;
        Charset charset = f8946c;
        if (z4) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                vVar.write(3);
                h(vVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                vVar.write(4);
                i(vVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                vVar.write(6);
                g(vVar, 8);
                i(vVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                vVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(vVar, bytes.length);
                vVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            vVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(vVar, bytes2.length);
            vVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            vVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(vVar, bArr.length);
            vVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            vVar.write(9);
            int[] iArr = (int[]) obj;
            j(vVar, iArr.length);
            g(vVar, 4);
            int length = iArr.length;
            while (i < length) {
                h(vVar, iArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            vVar.write(10);
            long[] jArr = (long[]) obj;
            j(vVar, jArr.length);
            g(vVar, 8);
            int length2 = jArr.length;
            while (i < length2) {
                i(vVar, jArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            vVar.write(11);
            double[] dArr = (double[]) obj;
            j(vVar, dArr.length);
            g(vVar, 8);
            int length3 = dArr.length;
            while (i < length3) {
                i(vVar, Double.doubleToLongBits(dArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof List) {
            vVar.write(12);
            List list = (List) obj;
            j(vVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(vVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            vVar.write(13);
            Map map = (Map) obj;
            j(vVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(vVar, entry.getKey());
                k(vVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        vVar.write(14);
        float[] fArr = (float[]) obj;
        j(vVar, fArr.length);
        g(vVar, 4);
        int length4 = fArr.length;
        while (i < length4) {
            h(vVar, Float.floatToIntBits(fArr[i]));
            i++;
        }
    }
}
