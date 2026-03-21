package s2;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: s2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789A extends AbstractC0793b {
    public static C0789A b(j jVar, B0.d dVar, Integer num) throws GeneralSecurityException {
        j jVar2 = j.y;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        F2.a aVar = (F2.a) dVar.f190l;
        if (aVar.f860a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f860a.length);
        }
        if (jVar == jVar2) {
            F2.a.a(new byte[0]);
        } else if (jVar == j.f9645x) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f9644w) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new C0789A();
    }
}
