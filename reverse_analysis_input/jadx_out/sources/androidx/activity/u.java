package androidx.activity;

import androidx.fragment.app.D;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC0276s, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0274p f3768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f3769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f3770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f3771d;

    public u(x xVar, AbstractC0274p abstractC0274p, D d5) {
        N3.h.e(d5, "onBackPressedCallback");
        this.f3771d = xVar;
        this.f3768a = abstractC0274p;
        this.f3769b = d5;
        abstractC0274p.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        if (enumC0272n != EnumC0272n.ON_START) {
            if (enumC0272n != EnumC0272n.ON_STOP) {
                if (enumC0272n == EnumC0272n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.f3770c;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.f3771d;
        xVar.getClass();
        D d5 = this.f3769b;
        N3.h.e(d5, "onBackPressedCallback");
        xVar.f3776b.addLast(d5);
        v vVar2 = new v(xVar, d5);
        d5.f4226b.add(vVar2);
        xVar.d();
        d5.f4227c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f3770c = vVar2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f3768a.b(this);
        this.f3769b.f4226b.remove(this);
        v vVar = this.f3770c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f3770c = null;
    }
}
