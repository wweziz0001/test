package q0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0741a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D0.f f9243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f9244c;

    public /* synthetic */ C0741a(l lVar, D0.f fVar, int i) {
        this.f9242a = i;
        this.f9244c = lVar;
        this.f9243b = fVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j5, long j6) {
        switch (this.f9242a) {
            case 0:
                ((c) this.f9244c).getClass();
                D0.f fVar = this.f9243b;
                fVar.getClass();
                if (AbstractC0370w.f5326a >= 30) {
                    fVar.a(j5);
                } else {
                    Handler handler = fVar.f400l;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j5 >> 32), (int) j5));
                }
                break;
            default:
                ((Z1.l) this.f9244c).getClass();
                D0.f fVar2 = this.f9243b;
                fVar2.getClass();
                if (AbstractC0370w.f5326a >= 30) {
                    fVar2.a(j5);
                } else {
                    Handler handler2 = fVar2.f400l;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j5 >> 32), (int) j5));
                }
                break;
        }
    }
}
