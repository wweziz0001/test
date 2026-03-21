package Z0;

import a0.C0155F;
import a0.InterfaceC0154E;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.C0363p;
import e0.C0389a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import m2.I;
import p2.C0727a;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2950a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static C0389a b(C0155F c0155f, String str) {
        int i = 0;
        while (true) {
            InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
            if (i >= interfaceC0154EArr.length) {
                return null;
            }
            InterfaceC0154E interfaceC0154E = interfaceC0154EArr[i];
            if (interfaceC0154E instanceof C0389a) {
                C0389a c0389a = (C0389a) interfaceC0154E;
                if (c0389a.f5485l.equals(str)) {
                    return c0389a;
                }
            }
            i++;
        }
    }

    public static boolean c(int i, boolean z4) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z4) {
            return true;
        }
        int[] iArr = f2950a;
        for (int i5 = 0; i5 < 29; i5++) {
            if (iArr[i5] == i) {
                return true;
            }
        }
        return false;
    }

    public static T0.e d(int i, C0363p c0363p) {
        int i5 = c0363p.i();
        if (c0363p.i() == 1684108385) {
            c0363p.I(8);
            String strR = c0363p.r(i5 - 16);
            return new T0.e("und", strR, strR);
        }
        AbstractC0360m.y("MetadataUtil", "Failed to parse comment attribute: " + e0.d.c(i));
        return null;
    }

    public static T0.a e(C0363p c0363p) {
        int i = c0363p.i();
        if (c0363p.i() != 1684108385) {
            AbstractC0360m.y("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int i5 = c0363p.i();
        byte[] bArr = h.f2848a;
        int i6 = i5 & 16777215;
        String str = i6 == 13 ? "image/jpeg" : i6 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC0307a.o(i6, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c0363p.I(4);
        int i7 = i - 16;
        byte[] bArr2 = new byte[i7];
        c0363p.g(bArr2, 0, i7);
        return new T0.a(str, null, 3, bArr2);
    }

    public static T0.n f(int i, C0363p c0363p, String str) {
        int i5 = c0363p.i();
        if (c0363p.i() == 1684108385 && i5 >= 22) {
            c0363p.I(10);
            int iB = c0363p.B();
            if (iB > 0) {
                String strI = AbstractC0307a.i("", iB);
                int iB2 = c0363p.B();
                if (iB2 > 0) {
                    strI = strI + "/" + iB2;
                }
                return new T0.n(str, null, I.u(strI));
            }
        }
        AbstractC0360m.y("MetadataUtil", "Failed to parse index/count attribute: " + e0.d.c(i));
        return null;
    }

    public static int g(C0363p c0363p) {
        int i = c0363p.i();
        if (c0363p.i() == 1684108385) {
            c0363p.I(8);
            int i5 = i - 16;
            if (i5 == 1) {
                return c0363p.v();
            }
            if (i5 == 2) {
                return c0363p.B();
            }
            if (i5 == 3) {
                return c0363p.y();
            }
            if (i5 == 4 && (c0363p.f() & 128) == 0) {
                return c0363p.z();
            }
        }
        AbstractC0360m.y("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static T0.i h(int i, String str, C0363p c0363p, boolean z4, boolean z5) {
        int iG = g(c0363p);
        if (z5) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z4 ? new T0.n(str, null, I.u(Integer.toString(iG))) : new T0.e("und", str, Integer.toString(iG));
        }
        AbstractC0360m.y("MetadataUtil", "Failed to parse uint8 attribute: " + e0.d.c(i));
        return null;
    }

    public static B0.d i(byte[] bArr) {
        C0363p c0363p = new C0363p(bArr);
        if (c0363p.f5315c < 32) {
            return null;
        }
        c0363p.H(0);
        int iA = c0363p.a();
        int i = c0363p.i();
        if (i != iA) {
            AbstractC0360m.y("PsshAtomUtil", "Advertised atom size (" + i + ") does not match buffer size: " + iA);
            return null;
        }
        int i5 = c0363p.i();
        if (i5 != 1886614376) {
            AbstractC0307a.o(i5, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iC = h.c(c0363p.i());
        if (iC > 1) {
            AbstractC0307a.o(iC, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c0363p.p(), c0363p.p());
        if (iC == 1) {
            int iZ = c0363p.z();
            UUID[] uuidArr = new UUID[iZ];
            for (int i6 = 0; i6 < iZ; i6++) {
                uuidArr[i6] = new UUID(c0363p.p(), c0363p.p());
            }
        }
        int iZ2 = c0363p.z();
        int iA2 = c0363p.a();
        if (iZ2 == iA2) {
            c0363p.g(new byte[iZ2], 0, iZ2);
            B0.d dVar = new B0.d();
            dVar.f190l = uuid;
            return dVar;
        }
        AbstractC0360m.y("PsshAtomUtil", "Atom data size (" + iZ2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static T0.n j(int i, C0363p c0363p, String str) {
        int i5 = c0363p.i();
        if (c0363p.i() == 1684108385) {
            c0363p.I(8);
            return new T0.n(str, null, I.u(c0363p.r(i5 - 16)));
        }
        AbstractC0360m.y("MetadataUtil", "Failed to parse text attribute: " + e0.d.c(i));
        return null;
    }

    public static F0.I k(F0.r rVar, boolean z4, boolean z5) {
        int i;
        long j5;
        long jP;
        int i5;
        int i6;
        boolean z6;
        int[] iArr;
        long j6;
        boolean z7 = true;
        long jQ = rVar.q();
        long j7 = -1;
        long j8 = 4096;
        if (jQ != -1 && jQ <= 4096) {
            j8 = jQ;
        }
        int i7 = (int) j8;
        C0363p c0363p = new C0363p(64);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < i7) {
            c0363p.E(8);
            if (!rVar.t(c0363p.f5313a, i8, 8, z7)) {
                break;
            }
            long jX = c0363p.x();
            int i10 = c0363p.i();
            if (jX == 1) {
                rVar.z(c0363p.f5313a, 8, 8);
                i5 = 16;
                c0363p.G(16);
                jP = c0363p.p();
                j5 = jQ;
            } else {
                if (jX == 0) {
                    long jQ2 = rVar.q();
                    if (jQ2 != j7) {
                        jX = (jQ2 - rVar.w()) + ((long) 8);
                    }
                }
                j5 = jQ;
                jP = jX;
                i5 = 8;
            }
            long j9 = i5;
            if (jP < j9) {
                return new n();
            }
            i9 += i5;
            if (i10 == 1836019574) {
                i7 += (int) jP;
                if (jQ == -1 || i7 <= j5) {
                    j6 = j5;
                } else {
                    j6 = j5;
                    i7 = (int) j6;
                }
                jQ = j6;
                z7 = true;
            } else {
                if (i10 == 1836019558 || i10 == 1836475768) {
                    i = 1;
                    break;
                }
                if (i10 == 1835295092) {
                    z8 = true;
                }
                if ((((long) i9) + jP) - j9 >= i7) {
                    i = 0;
                    break;
                }
                int i11 = (int) (jP - j9);
                i9 += i11;
                if (i10 != 1718909296) {
                    i6 = 0;
                    z6 = true;
                    if (i11 != 0) {
                        rVar.A(i11);
                    }
                } else {
                    if (i11 < 8) {
                        return new n();
                    }
                    c0363p.E(i11);
                    i6 = 0;
                    rVar.z(c0363p.f5313a, 0, i11);
                    if (c(c0363p.i(), z5)) {
                        z8 = true;
                    }
                    c0363p.I(4);
                    int iA = c0363p.a() / 4;
                    if (!z8 && iA > 0) {
                        iArr = new int[iA];
                        int i12 = 0;
                        while (true) {
                            if (i12 >= iA) {
                                z6 = true;
                                break;
                            }
                            int i13 = c0363p.i();
                            iArr[i12] = i13;
                            if (c(i13, z5)) {
                                z6 = true;
                                z8 = true;
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z6 = true;
                        iArr = null;
                    }
                    if (!z8) {
                        n nVar = new n();
                        if (iArr != null) {
                            int i14 = C0727a.f9194n;
                            if (iArr.length != 0) {
                                new C0727a(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i15 = C0727a.f9194n;
                        }
                        return nVar;
                    }
                }
                i8 = i6;
                z7 = z6;
                jQ = j5;
            }
            j7 = -1;
        }
        i = i8;
        if (!z8) {
            return n.f2907c;
        }
        if (z4 != i) {
            return i != 0 ? n.f2905a : n.f2906b;
        }
        return null;
    }
}
