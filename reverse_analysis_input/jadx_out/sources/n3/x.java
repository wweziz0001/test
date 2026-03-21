package n3;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0708r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f8947a;

    static {
        w wVar = w.f8944a;
        f8947a = new x();
    }

    @Override // n3.InterfaceC0708r
    public final ByteBuffer a(Object obj) throws IOException {
        v vVar = new v();
        vVar.write(0);
        w.f8944a.k(vVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // n3.InterfaceC0708r
    public final C0704n b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        w wVar = w.f8944a;
        Object objE = wVar.e(byteBuffer);
        Object objE2 = wVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C0704n(objE2, (String) objE);
    }

    @Override // n3.InterfaceC0708r
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b4 = byteBuffer.get();
        if (b4 != 0) {
            if (b4 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = w.f8944a.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        w wVar = w.f8944a;
        Object objE2 = wVar.e(byteBuffer);
        Object objE3 = wVar.e(byteBuffer);
        Object objE4 = wVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C0700j((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // n3.InterfaceC0708r
    public final ByteBuffer d(C0704n c0704n) {
        v vVar = new v();
        w wVar = w.f8944a;
        wVar.k(vVar, c0704n.f8938a);
        wVar.k(vVar, c0704n.f8939b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // n3.InterfaceC0708r
    public final ByteBuffer e(String str, String str2) throws IOException {
        v vVar = new v();
        vVar.write(1);
        w wVar = w.f8944a;
        wVar.k(vVar, "error");
        wVar.k(vVar, str);
        vVar.write(0);
        wVar.k(vVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // n3.InterfaceC0708r
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        v vVar = new v();
        vVar.write(1);
        w wVar = w.f8944a;
        wVar.k(vVar, str);
        wVar.k(vVar, str2);
        if (obj instanceof Throwable) {
            wVar.k(vVar, Log.getStackTraceString((Throwable) obj));
        } else {
            wVar.k(vVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }
}
