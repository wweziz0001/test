package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f5174c = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5176b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f5175a = new L();

    public final c0 a(Class cls) {
        c0 c0VarC;
        U u4;
        Class cls2;
        A.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5176b;
        c0 c0Var = (c0) concurrentHashMap.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        L l3 = this.f5175a;
        l3.getClass();
        Class cls3 = d0.f5190a;
        if (!AbstractC0342w.class.isAssignableFrom(cls) && (cls2 = d0.f5190a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        b0 b0VarB = ((K) l3.f5148a).b(cls);
        if ((b0VarB.f5184d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0342w.class.isAssignableFrom(cls);
            AbstractC0321a abstractC0321a = b0VarB.f5181a;
            if (zIsAssignableFrom) {
                u4 = new U(d0.f5193d, AbstractC0337q.f5241a, abstractC0321a);
            } else {
                g0 g0Var = d0.f5191b;
                C0336p c0336p = AbstractC0337q.f5242b;
                if (c0336p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u4 = new U(g0Var, c0336p, abstractC0321a);
            }
            c0VarC = u4;
        } else if (AbstractC0342w.class.isAssignableFrom(cls)) {
            c0VarC = b0VarB.d() == 1 ? T.C(b0VarB, W.f5173b, I.f5145b, d0.f5193d, AbstractC0337q.f5241a, O.f5152b) : T.C(b0VarB, W.f5173b, I.f5145b, d0.f5193d, null, O.f5152b);
        } else if (b0VarB.d() == 1) {
            V v4 = W.f5172a;
            G g5 = I.f5144a;
            g0 g0Var2 = d0.f5191b;
            C0336p c0336p2 = AbstractC0337q.f5242b;
            if (c0336p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c0VarC = T.C(b0VarB, v4, g5, g0Var2, c0336p2, O.f5151a);
        } else {
            c0VarC = T.C(b0VarB, W.f5172a, I.f5144a, d0.f5192c, null, O.f5151a);
        }
        c0 c0Var2 = (c0) concurrentHashMap.putIfAbsent(cls, c0VarC);
        return c0Var2 != null ? c0Var2 : c0VarC;
    }
}
