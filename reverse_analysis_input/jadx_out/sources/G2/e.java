package G2;

import J2.A;
import J2.C0069b;
import J2.C0071d;
import J2.C0075h;
import J2.C0079l;
import J2.C0080m;
import J2.C0085s;
import J2.C0086t;
import J2.C0087u;
import J2.G;
import J2.Z;
import J2.b0;
import J2.j0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f895h = a.f887d;
    public static final p i = p.f908l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f896j = p.f909m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f897a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f898b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.e f899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0079l f900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f903g;

    public e(I2.i iVar, HashMap map, a aVar, ArrayList arrayList, p pVar, p pVar2, ArrayList arrayList2) {
        Z1.e eVar = new Z1.e(map, 3, arrayList2);
        this.f899c = eVar;
        this.f902f = true;
        this.f903g = aVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(j0.f1134A);
        arrayList3.add(pVar == p.f908l ? C0087u.f1184c : new C0085s(pVar, 1));
        arrayList3.add(iVar);
        arrayList3.addAll(arrayList);
        arrayList3.add(j0.f1150p);
        arrayList3.add(j0.f1142g);
        arrayList3.add(j0.f1139d);
        arrayList3.add(j0.f1140e);
        arrayList3.add(j0.f1141f);
        G g5 = j0.f1145k;
        arrayList3.add(new b0(Long.TYPE, Long.class, g5));
        arrayList3.add(new b0(Double.TYPE, Double.class, new b(0)));
        arrayList3.add(new b0(Float.TYPE, Float.class, new b(1)));
        arrayList3.add(pVar2 == p.f909m ? C0086t.f1182b : new C0085s(new C0086t(pVar2), 0));
        arrayList3.add(j0.f1143h);
        arrayList3.add(j0.i);
        arrayList3.add(new Z(AtomicLong.class, new c(g5, 0).a(), 0));
        arrayList3.add(new Z(AtomicLongArray.class, new c(g5, 1).a(), 0));
        arrayList3.add(j0.f1144j);
        arrayList3.add(j0.f1146l);
        arrayList3.add(j0.f1151q);
        arrayList3.add(j0.f1152r);
        arrayList3.add(new Z(BigDecimal.class, j0.f1147m, 0));
        arrayList3.add(new Z(BigInteger.class, j0.f1148n, 0));
        arrayList3.add(new Z(I2.k.class, j0.f1149o, 0));
        arrayList3.add(j0.f1153s);
        arrayList3.add(j0.f1154t);
        arrayList3.add(j0.f1156v);
        arrayList3.add(j0.f1157w);
        arrayList3.add(j0.y);
        arrayList3.add(j0.f1155u);
        arrayList3.add(j0.f1137b);
        arrayList3.add(C0075h.f1127c);
        arrayList3.add(j0.f1158x);
        if (M2.h.f1512a) {
            arrayList3.add(M2.h.f1514c);
            arrayList3.add(M2.h.f1513b);
            arrayList3.add(M2.h.f1515d);
        }
        arrayList3.add(C0069b.f1115c);
        arrayList3.add(j0.f1136a);
        arrayList3.add(new C0071d(eVar, 0));
        arrayList3.add(new C0071d(eVar, 1));
        C0079l c0079l = new C0079l(eVar);
        this.f900d = c0079l;
        arrayList3.add(c0079l);
        arrayList3.add(j0.f1135B);
        arrayList3.add(new A(eVar, iVar, c0079l, arrayList2));
        this.f901e = Collections.unmodifiableList(arrayList3);
    }

    public static void a(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Object b(String str, Type type) {
        N2.a aVar = new N2.a(type);
        Object objB = null;
        if (str != null) {
            O2.a aVar2 = new O2.a(new StringReader(str));
            aVar2.f1650z = 2;
            boolean z4 = true;
            aVar2.f1650z = 1;
            try {
                try {
                    try {
                        aVar2.E();
                        z4 = false;
                        objB = c(aVar).b(aVar2);
                    } catch (EOFException e5) {
                        if (!z4) {
                            throw new h(e5);
                        }
                    } catch (IllegalStateException e6) {
                        throw new h(e6);
                    }
                    aVar2.f1650z = 2;
                    if (objB != null) {
                        try {
                            if (aVar2.E() != 10) {
                                throw new h("JSON document was not fully consumed.");
                            }
                        } catch (O2.c e7) {
                            throw new h(e7);
                        } catch (IOException e8) {
                            throw new h(e8);
                        }
                    }
                } catch (IOException e9) {
                    throw new h(e9);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.12.0): " + e10.getMessage(), e10);
                }
            } catch (Throwable th) {
                aVar2.f1650z = 2;
                throw th;
            }
        }
        return objB;
    }

    public final r c(N2.a aVar) {
        boolean z4;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f898b;
        r rVar = (r) concurrentHashMap.get(aVar);
        if (rVar != null) {
            return rVar;
        }
        ThreadLocal threadLocal = this.f897a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            r rVar2 = (r) map.get(aVar);
            if (rVar2 != null) {
                return rVar2;
            }
            z4 = false;
        }
        try {
            d dVar = new d();
            map.put(aVar, dVar);
            Iterator it = this.f901e.iterator();
            r rVarCreate = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rVarCreate = ((s) it.next()).create(this, aVar);
                if (rVarCreate != null) {
                    if (dVar.f894a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    dVar.f894a = rVarCreate;
                    map.put(aVar, rVarCreate);
                }
            }
            if (z4) {
                threadLocal.remove();
            }
            if (rVarCreate != null) {
                if (z4) {
                    concurrentHashMap.putAll(map);
                }
                return rVarCreate;
            }
            throw new IllegalArgumentException("GSON (2.12.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z4) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final G2.r d(G2.s r7, N2.a r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            J2.l r0 = r6.f900d
            r0.getClass()
            J2.k r1 = J2.C0079l.f1160n
            if (r7 != r1) goto L14
            goto L57
        L14:
            java.util.concurrent.ConcurrentHashMap r1 = r0.f1163m
            java.lang.Class r2 = r8.f1601a
            java.lang.Object r3 = r1.get(r2)
            G2.s r3 = (G2.s) r3
            if (r3 == 0) goto L23
            if (r3 != r7) goto L58
            goto L57
        L23:
            java.lang.Class<H2.a> r3 = H2.a.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            H2.a r3 = (H2.a) r3
            if (r3 != 0) goto L2e
            goto L58
        L2e:
            java.lang.Class r3 = r3.value()
            java.lang.Class<G2.s> r4 = G2.s.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3b
            goto L58
        L3b:
            Z1.e r4 = r0.f1162l
            N2.a r5 = new N2.a
            r5.<init>(r3)
            I2.q r3 = r4.p(r5)
            java.lang.Object r3 = r3.e()
            G2.s r3 = (G2.s) r3
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            G2.s r1 = (G2.s) r1
            if (r1 == 0) goto L55
            r3 = r1
        L55:
            if (r3 != r7) goto L58
        L57:
            r7 = r0
        L58:
            java.util.List r0 = r6.f901e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            G2.s r2 = (G2.s) r2
            if (r1 != 0) goto L71
            if (r2 != r7) goto L5f
            r1 = 1
            goto L5f
        L71:
            G2.r r2 = r2.create(r6, r8)
            if (r2 == 0) goto L5f
            return r2
        L78:
            if (r1 != 0) goto L7f
            G2.r r7 = r6.c(r8)
            return r7
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.e.d(G2.s, N2.a):G2.r");
    }

    public final O2.b e(Writer writer) {
        O2.b bVar = new O2.b(writer);
        bVar.r(this.f903g);
        bVar.f1661t = this.f902f;
        bVar.s(2);
        bVar.f1663v = false;
        return bVar;
    }

    public final String f(Serializable serializable) {
        if (serializable == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e5) {
                throw new h(e5);
            }
        }
        Class cls = serializable.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(serializable, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e6) {
            throw new h(e6);
        }
    }

    public final void g(O2.b bVar) {
        i iVar = i.f905l;
        int i5 = bVar.f1660s;
        boolean z4 = bVar.f1661t;
        boolean z5 = bVar.f1663v;
        bVar.f1661t = this.f902f;
        bVar.f1663v = false;
        if (i5 == 2) {
            bVar.f1660s = 1;
        }
        try {
            try {
                j0.f1159z.getClass();
                C0080m.e(bVar, iVar);
                bVar.s(i5);
                bVar.f1661t = z4;
                bVar.f1663v = z5;
            } catch (IOException e5) {
                throw new h(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e6.getMessage(), e6);
            }
        } catch (Throwable th) {
            bVar.s(i5);
            bVar.f1661t = z4;
            bVar.f1663v = z5;
            throw th;
        }
    }

    public final void h(Serializable serializable, Class cls, O2.b bVar) {
        r rVarC = c(new N2.a(cls));
        int i5 = bVar.f1660s;
        if (i5 == 2) {
            bVar.f1660s = 1;
        }
        boolean z4 = bVar.f1661t;
        boolean z5 = bVar.f1663v;
        bVar.f1661t = this.f902f;
        bVar.f1663v = false;
        try {
            try {
                rVarC.c(bVar, serializable);
            } catch (IOException e5) {
                throw new h(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.s(i5);
            bVar.f1661t = z4;
            bVar.f1663v = z5;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f901e + ",instanceCreators:" + this.f899c + "}";
    }
}
