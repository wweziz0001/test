package P;

import L.C0094b;
import O.i;
import O.j;
import androidx.datastore.preferences.protobuf.AbstractC0229v;
import androidx.datastore.preferences.protobuf.AbstractC0231x;
import androidx.datastore.preferences.protobuf.C0215g;
import androidx.datastore.preferences.protobuf.C0220l;
import androidx.datastore.preferences.protobuf.C0233z;
import androidx.datastore.preferences.protobuf.InterfaceC0230w;
import androidx.media.A;
import g4.m;
import g4.n;
import g4.o;
import g4.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1675a = new h();

    public final b a(p pVar) throws C0094b {
        byte[] bArr;
        try {
            O.e eVarQ = O.e.q(new o(pVar));
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            N3.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapO = eVarQ.o();
            N3.h.d(mapO, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapO.entrySet()) {
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                N3.h.d(str, "name");
                N3.h.d(jVar, "value");
                int iE = jVar.E();
                switch (iE == 0 ? -1 : g.f1674a[i.b(iE)]) {
                    case A.RESULT_ERROR /* -1 */:
                        throw new C0094b("Value case is null.", null);
                    case 0:
                    default:
                        throw new A1.c();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(jVar.v()));
                        break;
                    case 2:
                        bVar.d(new d(str), Float.valueOf(jVar.z()));
                        break;
                    case 3:
                        bVar.d(new d(str), Double.valueOf(jVar.y()));
                        break;
                    case 4:
                        bVar.d(new d(str), Integer.valueOf(jVar.A()));
                        break;
                    case 5:
                        bVar.d(new d(str), Long.valueOf(jVar.B()));
                        break;
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        d dVar = new d(str);
                        String strC = jVar.C();
                        N3.h.d(strC, "value.string");
                        bVar.d(dVar, strC);
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0230w interfaceC0230wP = jVar.D().p();
                        N3.h.d(interfaceC0230wP, "value.stringSet.stringsList");
                        bVar.d(dVar2, C3.f.Z(interfaceC0230wP));
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0215g c0215gW = jVar.w();
                        int size = c0215gW.size();
                        if (size == 0) {
                            bArr = AbstractC0231x.f4218b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0215gW.i(size, bArr2);
                            bArr = bArr2;
                        }
                        N3.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0094b("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0233z e5) {
            throw new C0094b("Unable to parse preferences proto.", e5);
        }
    }

    public final void b(Object obj, n nVar) throws IOException {
        AbstractC0229v abstractC0229vA;
        Map mapA = ((b) obj).a();
        O.c cVarP = O.e.p();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f1670a;
            if (value instanceof Boolean) {
                O.h hVarF = j.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarF.c();
                j.s((j) hVarF.f4216m, zBooleanValue);
                abstractC0229vA = hVarF.a();
            } else if (value instanceof Float) {
                O.h hVarF2 = j.F();
                float fFloatValue = ((Number) value).floatValue();
                hVarF2.c();
                j.t((j) hVarF2.f4216m, fFloatValue);
                abstractC0229vA = hVarF2.a();
            } else if (value instanceof Double) {
                O.h hVarF3 = j.F();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarF3.c();
                j.q((j) hVarF3.f4216m, dDoubleValue);
                abstractC0229vA = hVarF3.a();
            } else if (value instanceof Integer) {
                O.h hVarF4 = j.F();
                int iIntValue = ((Number) value).intValue();
                hVarF4.c();
                j.u((j) hVarF4.f4216m, iIntValue);
                abstractC0229vA = hVarF4.a();
            } else if (value instanceof Long) {
                O.h hVarF5 = j.F();
                long jLongValue = ((Number) value).longValue();
                hVarF5.c();
                j.n((j) hVarF5.f4216m, jLongValue);
                abstractC0229vA = hVarF5.a();
            } else if (value instanceof String) {
                O.h hVarF6 = j.F();
                hVarF6.c();
                j.o((j) hVarF6.f4216m, (String) value);
                abstractC0229vA = hVarF6.a();
            } else if (value instanceof Set) {
                O.h hVarF7 = j.F();
                O.f fVarQ = O.g.q();
                N3.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                fVarQ.c();
                O.g.n((O.g) fVarQ.f4216m, (Set) value);
                hVarF7.c();
                j.p((j) hVarF7.f4216m, (O.g) fVarQ.a());
                abstractC0229vA = hVarF7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                O.h hVarF8 = j.F();
                byte[] bArr = (byte[]) value;
                C0215g c0215g = C0215g.f4144n;
                C0215g c0215gH = C0215g.h(bArr, 0, bArr.length);
                hVarF8.c();
                j.r((j) hVarF8.f4216m, c0215gH);
                abstractC0229vA = hVarF8.a();
            }
            cVarP.getClass();
            str.getClass();
            cVarP.c();
            O.e.n((O.e) cVarP.f4216m).put(str, (j) abstractC0229vA);
        }
        O.e eVar = (O.e) cVarP.a();
        m mVar = new m(nVar);
        int iA = eVar.a(null);
        Logger logger = C0220l.f4176v;
        if (iA > 4096) {
            iA = 4096;
        }
        C0220l c0220l = new C0220l(mVar, iA);
        eVar.b(c0220l);
        if (c0220l.f4181t > 0) {
            c0220l.s0();
        }
    }
}
