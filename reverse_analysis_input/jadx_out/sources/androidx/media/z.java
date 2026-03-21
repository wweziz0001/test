package androidx.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A f4644a;

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        A a5 = this.f4644a;
        if (a5 != null) {
            a5.handleMessageInternal(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j5) {
        Bundle data = message.getData();
        data.setClassLoader(android.support.v4.media.g.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j5);
    }
}
