package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f4099c = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4101b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f4100a = new E();

    public final V a(Class cls) {
        C0223o c0223o;
        V vX;
        N n4;
        Class cls2;
        AbstractC0231x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4101b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e5 = this.f4100a;
        e5.getClass();
        Class cls3 = W.f4109a;
        if (!AbstractC0229v.class.isAssignableFrom(cls) && (cls2 = W.f4109a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U uB = ((D) e5.f4070a).b(cls);
        if ((uB.f4108d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0229v.class.isAssignableFrom(cls);
            AbstractC0229v abstractC0229v = uB.f4105a;
            if (zIsAssignableFrom) {
                n4 = new N(W.f4111c, AbstractC0224p.f4187a, abstractC0229v);
            } else {
                d0 d0Var = W.f4110b;
                C0223o c0223o2 = AbstractC0224p.f4188b;
                if (c0223o2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n4 = new N(d0Var, c0223o2, abstractC0229v);
            }
            vX = n4;
        } else if (AbstractC0229v.class.isAssignableFrom(cls)) {
            O o4 = P.f4098b;
            B b4 = C.f4067b;
            d0 d0Var2 = W.f4111c;
            C0223o c0223o3 = O.i.b(uB.d()) != 1 ? AbstractC0224p.f4187a : null;
            I i = J.f4078b;
            int[] iArr = M.f4080n;
            if (!(uB instanceof U)) {
                uB.getClass();
                throw new ClassCastException();
            }
            vX = M.x(uB, o4, b4, d0Var2, c0223o3, i);
        } else {
            O o5 = P.f4097a;
            B b5 = C.f4066a;
            d0 d0Var3 = W.f4110b;
            if (O.i.b(uB.d()) != 1) {
                c0223o = AbstractC0224p.f4188b;
                if (c0223o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0223o = null;
            }
            I i5 = J.f4077a;
            int[] iArr2 = M.f4080n;
            if (!(uB instanceof U)) {
                uB.getClass();
                throw new ClassCastException();
            }
            vX = M.x(uB, o5, b5, d0Var3, c0223o, i5);
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, vX);
        return v5 != null ? v5 : vX;
    }
}
