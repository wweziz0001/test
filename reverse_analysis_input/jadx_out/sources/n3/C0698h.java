package n3;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: n3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698h implements InterfaceC0697g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8932a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z1.m f8933b;

    public C0698h(Z1.m mVar) {
        this.f8933b = mVar;
    }

    @Override // n3.InterfaceC0697g
    public final void endOfStream() {
        if (this.f8932a.getAndSet(true)) {
            return;
        }
        Z1.m mVar = this.f8933b;
        if (((AtomicReference) mVar.f3025n).get() != this) {
            return;
        }
        Z1.s sVar = (Z1.s) mVar.f3026o;
        ((InterfaceC0696f) sVar.f3085m).l((String) sVar.f3086n, null);
    }

    @Override // n3.InterfaceC0697g
    public final void error(String str, String str2, Object obj) throws IOException {
        if (this.f8932a.get()) {
            return;
        }
        Z1.m mVar = this.f8933b;
        if (((AtomicReference) mVar.f3025n).get() != this) {
            return;
        }
        Z1.s sVar = (Z1.s) mVar.f3026o;
        ((InterfaceC0696f) sVar.f3085m).l((String) sVar.f3086n, ((x) sVar.f3087o).f(str, str2, obj));
    }

    @Override // n3.InterfaceC0697g
    public final void success(Object obj) {
        if (this.f8932a.get()) {
            return;
        }
        Z1.m mVar = this.f8933b;
        if (((AtomicReference) mVar.f3025n).get() != this) {
            return;
        }
        Z1.s sVar = (Z1.s) mVar.f3026o;
        ((InterfaceC0696f) sVar.f3085m).l((String) sVar.f3086n, ((x) sVar.f3087o).a(obj));
    }
}
