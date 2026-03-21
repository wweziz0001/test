package q0;

import Q1.C0118a;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    void a(Bundle bundle);

    void b(int i, C0118a c0118a, long j5, int i5);

    void c(int i, int i5, long j5, int i6);

    int d(MediaCodec.BufferInfo bufferInfo);

    default boolean f(C0675i c0675i) {
        return false;
    }

    void flush();

    void g(long j5, int i);

    void h();

    ByteBuffer i(int i);

    void j(Surface surface);

    void k(int i);

    ByteBuffer l(int i);

    int p();

    void q(int i);

    void release();

    void s(D0.f fVar, Handler handler);

    MediaFormat w();
}
