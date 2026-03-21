package b0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0300d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4834a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c();

    void d(ByteBuffer byteBuffer);

    C0298b e(C0298b c0298b);

    void flush();

    boolean isEnded();

    void reset();
}
