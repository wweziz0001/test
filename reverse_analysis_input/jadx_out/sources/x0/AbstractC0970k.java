package x0;

import a0.AbstractC0169U;
import android.os.Handler;
import d0.AbstractC0360m;
import f0.InterfaceC0403A;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: x0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0970k extends AbstractC0960a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f10726s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f10727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0403A f10728u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [x0.I, x0.h] */
    public final void A(final Object obj, J j5) {
        HashMap map = this.f10726s;
        AbstractC0360m.c(!map.containsKey(obj));
        ?? r12 = new I() { // from class: x0.h
            @Override // x0.I
            public final void a(AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U) {
                this.f10714a.z(obj, abstractC0960a, abstractC0169U);
            }
        };
        C0968i c0968i = new C0968i(this, obj);
        map.put(obj, new C0969j(j5, r12, c0968i));
        Handler handler = this.f10727t;
        handler.getClass();
        AbstractC0960a abstractC0960a = (AbstractC0960a) j5;
        abstractC0960a.getClass();
        m0.e eVar = abstractC0960a.f10636n;
        eVar.getClass();
        M m4 = new M();
        m4.f10545a = handler;
        m4.f10546b = c0968i;
        eVar.f8498c.add(m4);
        this.f10727t.getClass();
        m0.e eVar2 = abstractC0960a.f10637o;
        eVar2.getClass();
        m0.d dVar = new m0.d();
        dVar.f8495a = c0968i;
        eVar2.f8498c.add(dVar);
        InterfaceC0403A interfaceC0403A = this.f10728u;
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        abstractC0960a.o(r12, interfaceC0403A, jVar);
        if (this.f10635m.isEmpty()) {
            abstractC0960a.j(r12);
        }
    }

    @Override // x0.J
    public void e() {
        Iterator it = this.f10726s.values().iterator();
        while (it.hasNext()) {
            ((C0969j) it.next()).f10723a.e();
        }
    }

    @Override // x0.AbstractC0960a
    public void k() {
        for (C0969j c0969j : this.f10726s.values()) {
            ((AbstractC0960a) c0969j.f10723a).j(c0969j.f10724b);
        }
    }

    @Override // x0.AbstractC0960a
    public void m() {
        for (C0969j c0969j : this.f10726s.values()) {
            ((AbstractC0960a) c0969j.f10723a).l(c0969j.f10724b);
        }
    }

    @Override // x0.AbstractC0960a
    public void t() {
        HashMap map = this.f10726s;
        for (C0969j c0969j : map.values()) {
            ((AbstractC0960a) c0969j.f10723a).s(c0969j.f10724b);
            AbstractC0960a abstractC0960a = (AbstractC0960a) c0969j.f10723a;
            C0968i c0968i = c0969j.f10725c;
            abstractC0960a.v(c0968i);
            abstractC0960a.u(c0968i);
        }
        map.clear();
    }

    public abstract H w(Object obj, H h2);

    public abstract void z(Object obj, AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U);

    public long x(long j5, Object obj) {
        return j5;
    }

    public int y(int i, Object obj) {
        return i;
    }
}
