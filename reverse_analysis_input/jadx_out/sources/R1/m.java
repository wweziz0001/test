package R1;

import android.content.Context;
import x1.C0985a;
import x1.InterfaceC0986b;
import x1.InterfaceC0987c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0986b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f1903l;

    public /* synthetic */ m(Context context) {
        this.f1903l = context;
    }

    @Override // x1.InterfaceC0986b
    public InterfaceC0987c d(C0985a c0985a) {
        Context context = this.f1903l;
        D0.d dVar = c0985a.f10821c;
        N3.h.e(dVar, "callback");
        String str = c0985a.f10820b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new y1.f(context, str, dVar, true, true);
    }
}
