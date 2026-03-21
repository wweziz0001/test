package v3;

import java.io.IOException;
import java.util.ArrayList;
import n3.C0698h;
import n3.InterfaceC0697g;

/* JADX INFO: renamed from: v3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933n implements InterfaceC0697g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0698h f10388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10389b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10390c = false;

    public final void a() throws IOException {
        if (this.f10388a == null) {
            return;
        }
        ArrayList arrayList = this.f10389b;
        for (Object obj : arrayList) {
            if (obj instanceof C0931l) {
                this.f10388a.endOfStream();
            } else if (obj instanceof C0932m) {
                C0932m c0932m = (C0932m) obj;
                this.f10388a.error(c0932m.f10385a, c0932m.f10386b, c0932m.f10387c);
            } else {
                this.f10388a.success(obj);
            }
        }
        arrayList.clear();
    }

    @Override // n3.InterfaceC0697g
    public final void endOfStream() throws IOException {
        C0931l c0931l = new C0931l();
        if (!this.f10390c) {
            this.f10389b.add(c0931l);
        }
        a();
        this.f10390c = true;
    }

    @Override // n3.InterfaceC0697g
    public final void error(String str, String str2, Object obj) throws IOException {
        C0932m c0932m = new C0932m();
        c0932m.f10385a = str;
        c0932m.f10386b = str2;
        c0932m.f10387c = obj;
        if (!this.f10390c) {
            this.f10389b.add(c0932m);
        }
        a();
    }

    @Override // n3.InterfaceC0697g
    public final void success(Object obj) throws IOException {
        if (!this.f10390c) {
            this.f10389b.add(obj);
        }
        a();
    }
}
