package H0;

import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m2.AbstractC0636C;
import m2.C0640G;
import m2.I;
import m2.b0;
import m2.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f955b;

    public f(int i, b0 b0Var) {
        this.f955b = i;
        this.f954a = b0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i, C0363p c0363p) {
        String str;
        a cVar;
        int i5;
        int i6 = 4;
        r.e("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i7 = c0363p.f5315c;
        int i8 = 0;
        int i9 = -2;
        int i10 = 0;
        while (c0363p.a() > 8) {
            int iK = c0363p.k();
            int iK2 = c0363p.f5314b + c0363p.k();
            c0363p.G(iK2);
            if (iK != 1414744396) {
                g gVar = null;
                switch (iK) {
                    case 1718776947:
                        if (i9 == 2) {
                            c0363p.I(i6);
                            int iK3 = c0363p.k();
                            int iK4 = c0363p.k();
                            c0363p.I(i6);
                            int iK5 = c0363p.k();
                            switch (iK5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC0307a.o(iK5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C0189o c0189o = new C0189o();
                                c0189o.f3394t = iK3;
                                c0189o.f3395u = iK4;
                                c0189o.g(str);
                                gVar = new g(new C0190p(c0189o));
                            }
                        } else if (i9 == 1) {
                            int iO = c0363p.o();
                            String str2 = iO != 1 ? iO != 85 ? iO != 255 ? iO != 8192 ? iO != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                AbstractC0307a.o(iO, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int iO2 = c0363p.o();
                                int iK6 = c0363p.k();
                                c0363p.I(6);
                                int iZ = AbstractC0370w.z(c0363p.o());
                                int iO3 = c0363p.a() > 0 ? c0363p.o() : i8;
                                byte[] bArr = new byte[iO3];
                                c0363p.g(bArr, i8, iO3);
                                C0189o c0189o2 = new C0189o();
                                c0189o2.f3387m = AbstractC0156G.m(str2);
                                c0189o2.f3366B = iO2;
                                c0189o2.f3367C = iK6;
                                if ("audio/raw".equals(str2) && iZ != 0) {
                                    c0189o2.f3368D = iZ;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iO3 > 0) {
                                    c0189o2.f3390p = I.u(bArr);
                                }
                                gVar = new g(new C0190p(c0189o2));
                            }
                        } else {
                            AbstractC0360m.y("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC0370w.E(i9));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int iK7 = c0363p.k();
                        c0363p.I(8);
                        int iK8 = c0363p.k();
                        int iK9 = c0363p.k();
                        c0363p.I(i6);
                        c0363p.k();
                        c0363p.I(12);
                        cVar = new c(iK7, iK8, iK9);
                        break;
                    case 1752331379:
                        int iK10 = c0363p.k();
                        c0363p.I(12);
                        c0363p.k();
                        int iK11 = c0363p.k();
                        int iK12 = c0363p.k();
                        c0363p.I(i6);
                        int iK13 = c0363p.k();
                        int iK14 = c0363p.k();
                        c0363p.I(8);
                        cVar = new d(iK10, iK11, iK12, iK13, iK14);
                        break;
                    case 1852994675:
                        cVar = new h(c0363p.t(c0363p.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(c0363p.k(), c0363p);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    int i11 = ((d) cVar).f937a;
                    if (i11 == 1935960438) {
                        i9 = 2;
                    } else if (i11 != 1935963489) {
                        if (i11 != 1937012852) {
                            AbstractC0360m.y("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i11));
                            i5 = -1;
                        } else {
                            i5 = 3;
                        }
                        i9 = i5;
                    } else {
                        i9 = 1;
                    }
                }
                int i12 = i10 + 1;
                int iF = AbstractC0636C.f(objArrCopyOf.length, i12);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i10] = cVar;
                i10 = i12;
            }
            c0363p.H(iK2);
            c0363p.G(i7);
            i6 = 4;
            i8 = 0;
        }
        return new f(i, I.m(i10, objArrCopyOf));
    }

    public final a a(Class cls) {
        C0640G c0640gListIterator = this.f954a.listIterator(0);
        while (c0640gListIterator.hasNext()) {
            a aVar = (a) c0640gListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // H0.a
    public final int getType() {
        return this.f955b;
    }
}
