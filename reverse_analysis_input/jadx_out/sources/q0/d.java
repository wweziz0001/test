package q0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f9253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Looper looper) {
        super(looper);
        this.f9253a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.f9253a;
        fVar.getClass();
        int i = message.what;
        e eVar = null;
        if (i == 1) {
            e eVar2 = (e) message.obj;
            try {
                fVar.f9261a.queueInputBuffer(eVar2.f9254a, 0, eVar2.f9255b, eVar2.f9257d, eVar2.f9258e);
            } catch (RuntimeException e5) {
                AtomicReference atomicReference = fVar.f9264d;
                while (!atomicReference.compareAndSet(null, e5) && atomicReference.get() == null) {
                }
            }
            eVar = eVar2;
        } else if (i == 2) {
            e eVar3 = (e) message.obj;
            int i5 = eVar3.f9254a;
            MediaCodec.CryptoInfo cryptoInfo = eVar3.f9256c;
            long j5 = eVar3.f9257d;
            int i6 = eVar3.f9258e;
            try {
                synchronized (f.f9260h) {
                    fVar.f9261a.queueSecureInputBuffer(i5, 0, cryptoInfo, j5, i6);
                }
            } catch (RuntimeException e6) {
                AtomicReference atomicReference2 = fVar.f9264d;
                while (!atomicReference2.compareAndSet(null, e6) && atomicReference2.get() == null) {
                }
            }
            eVar = eVar3;
        } else if (i == 3) {
            fVar.f9265e.a();
        } else if (i != 4) {
            AtomicReference atomicReference3 = fVar.f9264d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                fVar.f9261a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e7) {
                AtomicReference atomicReference4 = fVar.f9264d;
                while (!atomicReference4.compareAndSet(null, e7) && atomicReference4.get() == null) {
                }
            }
        }
        if (eVar != null) {
            ArrayDeque arrayDeque = f.f9259g;
            synchronized (arrayDeque) {
                arrayDeque.add(eVar);
            }
        }
    }
}
