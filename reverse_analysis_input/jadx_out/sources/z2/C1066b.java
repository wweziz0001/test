package z2;

import D2.C0029a;
import D2.C0030b;
import D2.C0031c;
import D2.C0032d;
import D2.C0033e;
import D2.C0034f;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: z2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1066b extends L0.e {
    @Override // L0.e
    public final AbstractC0321a a(AbstractC0321a abstractC0321a) {
        C0032d c0032d = (C0032d) abstractC0321a;
        C0029a c0029aE = C0030b.E();
        c0029aE.e();
        C0030b.y((C0030b) c0029aE.f5252m);
        byte[] bArrA = E2.n.a(c0032d.A());
        C0328h c0328hH = AbstractC0329i.h(bArrA, 0, bArrA.length);
        c0029aE.e();
        C0030b.z((C0030b) c0029aE.f5252m, c0328hH);
        C0034f c0034fB = c0032d.B();
        c0029aE.e();
        C0030b.A((C0030b) c0029aE.f5252m, c0034fB);
        return (C0030b) c0029aE.b();
    }

    @Override // L0.e
    public final Map k() {
        HashMap map = new HashMap();
        C0031c c0031cC = C0032d.C();
        c0031cC.e();
        C0032d.y((C0032d) c0031cC.f5252m);
        C0033e c0033eB = C0034f.B();
        c0033eB.e();
        C0034f.y((C0034f) c0033eB.f5252m);
        C0034f c0034f = (C0034f) c0033eB.b();
        c0031cC.e();
        C0032d.z((C0032d) c0031cC.f5252m, c0034f);
        map.put("AES_CMAC", new y2.d((C0032d) c0031cC.b(), 1));
        C0031c c0031cC2 = C0032d.C();
        c0031cC2.e();
        C0032d.y((C0032d) c0031cC2.f5252m);
        C0033e c0033eB2 = C0034f.B();
        c0033eB2.e();
        C0034f.y((C0034f) c0033eB2.f5252m);
        C0034f c0034f2 = (C0034f) c0033eB2.b();
        c0031cC2.e();
        C0032d.z((C0032d) c0031cC2.f5252m, c0034f2);
        map.put("AES256_CMAC", new y2.d((C0032d) c0031cC2.b(), 1));
        C0031c c0031cC3 = C0032d.C();
        c0031cC3.e();
        C0032d.y((C0032d) c0031cC3.f5252m);
        C0033e c0033eB3 = C0034f.B();
        c0033eB3.e();
        C0034f.y((C0034f) c0033eB3.f5252m);
        C0034f c0034f3 = (C0034f) c0033eB3.b();
        c0031cC3.e();
        C0032d.z((C0032d) c0031cC3.f5252m, c0034f3);
        map.put("AES256_CMAC_RAW", new y2.d((C0032d) c0031cC3.b(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // L0.e
    public final AbstractC0321a m(AbstractC0329i abstractC0329i) {
        return C0032d.D(abstractC0329i, C0335o.a());
    }

    @Override // L0.e
    public final void o(AbstractC0321a abstractC0321a) throws GeneralSecurityException {
        C0032d c0032d = (C0032d) abstractC0321a;
        C1067c.m(c0032d.B());
        if (c0032d.A() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
