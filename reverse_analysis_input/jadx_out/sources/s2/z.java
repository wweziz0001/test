package s2;

import D2.b0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r2.InterfaceC0781a;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0781a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f9684c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2.b f9686b;

    public z(b0 b0Var, x2.b bVar) {
        this.f9685a = b0Var;
        this.f9686b = bVar;
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC0321a abstractC0321aA;
        b0 b0Var = this.f9685a;
        AtomicReference atomicReference = r2.n.f9544a;
        synchronized (r2.n.class) {
            try {
                s1.l lVar = ((r2.e) r2.n.f9544a.get()).a(b0Var.D()).f9524a;
                Class cls = (Class) lVar.f9610c;
                if (!((Map) lVar.f9609b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + lVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) r2.n.f9546c.get(b0Var.D())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
                }
                AbstractC0329i abstractC0329iE = b0Var.E();
                try {
                    L0.e eVarG = lVar.g();
                    AbstractC0321a abstractC0321aM = eVarG.m(abstractC0329iE);
                    eVarG.o(abstractC0321aM);
                    abstractC0321aA = eVarG.a(abstractC0321aM);
                } catch (com.google.crypto.tink.shaded.protobuf.C e5) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) lVar.g().f1479a).getName()), e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = abstractC0321aA.e();
        byte[] bArrA = this.f9686b.a(bArrE, f9684c);
        byte[] bArrA2 = ((InterfaceC0781a) r2.n.d(this.f9685a.D(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC0781a) r2.n.d(this.f9685a.D(), this.f9686b.b(bArr3, f9684c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e6) {
            e = e6;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
