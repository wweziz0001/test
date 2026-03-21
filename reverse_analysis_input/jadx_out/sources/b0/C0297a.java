package b0;

import d0.AbstractC0360m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m2.b0;

/* JADX INFO: renamed from: b0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f4825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4826b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f4827c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4828d;

    public C0297a(b0 b0Var) {
        this.f4825a = b0Var;
        C0298b c0298b = C0298b.f4829e;
        this.f4828d = false;
    }

    public final C0298b a(C0298b c0298b) throws C0299c {
        if (c0298b.equals(C0298b.f4829e)) {
            throw new C0299c(c0298b);
        }
        int i = 0;
        while (true) {
            b0 b0Var = this.f4825a;
            if (i >= b0Var.size()) {
                return c0298b;
            }
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) b0Var.get(i);
            C0298b c0298bE = interfaceC0300d.e(c0298b);
            if (interfaceC0300d.a()) {
                AbstractC0360m.h(!c0298bE.equals(C0298b.f4829e));
                c0298b = c0298bE;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f4826b;
        arrayList.clear();
        this.f4828d = false;
        int i = 0;
        while (true) {
            b0 b0Var = this.f4825a;
            if (i >= b0Var.size()) {
                break;
            }
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) b0Var.get(i);
            interfaceC0300d.flush();
            if (interfaceC0300d.a()) {
                arrayList.add(interfaceC0300d);
            }
            i++;
        }
        this.f4827c = new ByteBuffer[arrayList.size()];
        for (int i5 = 0; i5 <= c(); i5++) {
            this.f4827c[i5] = ((InterfaceC0300d) arrayList.get(i5)).b();
        }
    }

    public final int c() {
        return this.f4827c.length - 1;
    }

    public final boolean d() {
        return this.f4828d && ((InterfaceC0300d) this.f4826b.get(c())).isEnded() && !this.f4827c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f4826b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297a)) {
            return false;
        }
        C0297a c0297a = (C0297a) obj;
        b0 b0Var = this.f4825a;
        if (b0Var.size() != c0297a.f4825a.size()) {
            return false;
        }
        for (int i = 0; i < b0Var.size(); i++) {
            if (b0Var.get(i) != c0297a.f4825a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z4;
        for (boolean z5 = true; z5; z5 = z4) {
            z4 = false;
            int i = 0;
            while (i <= c()) {
                if (!this.f4827c[i].hasRemaining()) {
                    ArrayList arrayList = this.f4826b;
                    InterfaceC0300d interfaceC0300d = (InterfaceC0300d) arrayList.get(i);
                    if (!interfaceC0300d.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f4827c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0300d.f4834a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0300d.d(byteBuffer2);
                        this.f4827c[i] = interfaceC0300d.b();
                        z4 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f4827c[i].hasRemaining();
                    } else if (!this.f4827c[i].hasRemaining() && i < c()) {
                        ((InterfaceC0300d) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.f4825a.hashCode();
    }
}
