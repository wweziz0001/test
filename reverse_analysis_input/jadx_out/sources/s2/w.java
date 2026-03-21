package s2;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0793b {
    public static w b(j jVar, B0.d dVar, Integer num) throws GeneralSecurityException {
        j jVar2 = j.f9643v;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        F2.a aVar = (F2.a) dVar.f190l;
        if (aVar.f860a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f860a.length);
        }
        if (jVar == jVar2) {
            F2.a.a(new byte[0]);
        } else if (jVar == j.f9642u) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f9641t) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new w();
    }
}
