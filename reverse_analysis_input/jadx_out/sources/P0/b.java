package P0;

import F0.M;
import Q1.C;
import a0.C0155F;
import d0.C0363p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1678c;

    public static Q0.a E0(C0363p c0363p) {
        String strQ = c0363p.q();
        strQ.getClass();
        String strQ2 = c0363p.q();
        strQ2.getClass();
        return new Q0.a(strQ, strQ2, c0363p.p(), c0363p.p(), Arrays.copyOfRange(c0363p.f5313a, c0363p.f5314b, c0363p.f5315c));
    }

    @Override // Q1.C
    public final C0155F n(O0.a aVar, ByteBuffer byteBuffer) {
        switch (this.f1678c) {
            case 0:
                if (byteBuffer.get() == 116) {
                    M m4 = new M(byteBuffer.limit(), byteBuffer.array());
                    int i = 12;
                    m4.u(12);
                    int iF = (m4.f() + m4.i(12)) - 4;
                    m4.u(44);
                    m4.v(m4.i(12));
                    m4.u(16);
                    ArrayList arrayList = new ArrayList();
                    while (m4.f() < iF) {
                        m4.u(48);
                        int i5 = m4.i(8);
                        m4.u(4);
                        int iF2 = m4.f() + m4.i(i);
                        String str = null;
                        String str2 = null;
                        while (m4.f() < iF2) {
                            int i6 = m4.i(8);
                            int i7 = m4.i(8);
                            int iF3 = m4.f() + i7;
                            if (i6 == 2) {
                                int i8 = m4.i(16);
                                m4.u(8);
                                if (i8 == 3) {
                                    while (m4.f() < iF3) {
                                        int i9 = m4.i(8);
                                        Charset charset = StandardCharsets.US_ASCII;
                                        byte[] bArr = new byte[i9];
                                        m4.l(i9, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i10 = m4.i(8);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            m4.v(m4.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i6 == 21) {
                                Charset charset2 = StandardCharsets.US_ASCII;
                                byte[] bArr2 = new byte[i7];
                                m4.l(i7, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            m4.r(iF3 * 8);
                        }
                        m4.r(iF2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(str.concat(str2), i5));
                        }
                        i = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C0155F(arrayList);
                    }
                }
                return null;
            default:
                return new C0155F(E0(new C0363p(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
