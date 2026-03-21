package t0;

import com.google.crypto.tink.shaded.protobuf.C0324d;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v implements B0.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DataInputStream f9974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0324d f9975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f9976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f9977o;

    public v(x xVar, InputStream inputStream) {
        this.f9977o = xVar;
        this.f9974l = new DataInputStream(inputStream);
        C0324d c0324d = new C0324d();
        c0324d.f5189c = new ArrayList();
        c0324d.f5187a = 1;
        this.f9975m = c0324d;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    @Override // B0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.v.e():void");
    }

    @Override // B0.o
    public final void g() {
        this.f9976n = true;
    }
}
