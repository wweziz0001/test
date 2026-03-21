package v3;

import b3.AbstractC0307a;
import java.io.IOException;
import java.util.HashMap;
import n3.C0698h;
import n3.InterfaceC0697g;
import n3.InterfaceC0699i;

/* JADX INFO: renamed from: v3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935p implements InterfaceC0699i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0933n f10395l;

    public void a(int i, int i5, long j5, int i6) throws IOException {
        HashMap map = new HashMap();
        map.put("event", "initialized");
        AbstractC0307a.p(i, map, "width", i5, "height");
        map.put("duration", Long.valueOf(j5));
        if (i6 != 0) {
            map.put("rotationCorrection", Integer.valueOf(i6));
        }
        this.f10395l.success(map);
    }

    @Override // n3.InterfaceC0699i
    public void onCancel(Object obj) throws IOException {
        C0933n c0933n = this.f10395l;
        c0933n.f10388a = null;
        c0933n.a();
    }

    @Override // n3.InterfaceC0699i
    public void onListen(Object obj, InterfaceC0697g interfaceC0697g) throws IOException {
        C0933n c0933n = this.f10395l;
        c0933n.f10388a = (C0698h) interfaceC0697g;
        c0933n.a();
    }
}
