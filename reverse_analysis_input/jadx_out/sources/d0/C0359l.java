package d0;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: d0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0348a f5295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0367t f5296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0357j f5297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f5298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f5299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f5300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5302h;
    public final boolean i;

    public C0359l(Looper looper, InterfaceC0348a interfaceC0348a, InterfaceC0357j interfaceC0357j) {
        this(new CopyOnWriteArraySet(), looper, interfaceC0348a, interfaceC0357j, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f5301g) {
            try {
                if (this.f5302h) {
                    return;
                }
                this.f5298d.add(new C0358k(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f5300f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C0367t c0367t = this.f5296b;
        if (!c0367t.f5321a.hasMessages(1)) {
            c0367t.getClass();
            C0366s c0366sB = C0367t.b();
            c0366sB.f5319a = c0367t.f5321a.obtainMessage(1);
            c0367t.getClass();
            Message message = c0366sB.f5319a;
            message.getClass();
            c0367t.f5321a.sendMessageAtFrontOfQueue(message);
            c0366sB.a();
        }
        ArrayDeque arrayDeque2 = this.f5299e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, InterfaceC0356i interfaceC0356i) {
        f();
        this.f5300f.add(new RunnableC0355h(new CopyOnWriteArraySet(this.f5298d), i, interfaceC0356i, 0));
    }

    public final void d() {
        f();
        synchronized (this.f5301g) {
            this.f5302h = true;
        }
        for (C0358k c0358k : this.f5298d) {
            InterfaceC0357j interfaceC0357j = this.f5297c;
            c0358k.f5294d = true;
            if (c0358k.f5293c) {
                c0358k.f5293c = false;
                interfaceC0357j.b(c0358k.f5291a, c0358k.f5292b.b());
            }
        }
        this.f5298d.clear();
    }

    public final void e(int i, InterfaceC0356i interfaceC0356i) {
        c(i, interfaceC0356i);
        b();
    }

    public final void f() {
        if (this.i) {
            AbstractC0360m.h(Thread.currentThread() == this.f5296b.f5321a.getLooper().getThread());
        }
    }

    public C0359l(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC0348a interfaceC0348a, InterfaceC0357j interfaceC0357j, boolean z4) {
        this.f5295a = interfaceC0348a;
        this.f5298d = copyOnWriteArraySet;
        this.f5297c = interfaceC0357j;
        this.f5301g = new Object();
        this.f5299e = new ArrayDeque();
        this.f5300f = new ArrayDeque();
        this.f5296b = ((C0365r) interfaceC0348a).a(looper, new C0354g(this, 0));
        this.i = z4;
    }
}
