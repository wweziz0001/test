package f3;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.InterfaceC0695e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0695e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f5764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5766c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i) {
        this.f5764a = flutterJNI;
        this.f5765b = i;
    }

    @Override // n3.InterfaceC0695e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f5766c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i = this.f5765b;
        FlutterJNI flutterJNI = this.f5764a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i, byteBuffer, byteBuffer.position());
        }
    }
}
