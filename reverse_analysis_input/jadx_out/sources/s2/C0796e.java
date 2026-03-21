package s2;

import java.util.logging.Logger;
import r2.InterfaceC0781a;

/* JADX INFO: renamed from: s2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0796e implements r2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f9618a = Logger.getLogger(C0796e.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0796e f9619b = new C0796e();

    @Override // r2.m
    public final Class a() {
        return InterfaceC0781a.class;
    }

    @Override // r2.m
    public final Object b(Z1.s sVar) {
        return new C0795d(sVar);
    }

    @Override // r2.m
    public final Class c() {
        return InterfaceC0781a.class;
    }
}
