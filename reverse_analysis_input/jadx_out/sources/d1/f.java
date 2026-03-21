package d1;

import F0.M;
import android.text.SpannableStringBuilder;
import b3.AbstractC0307a;
import com.ryanheise.audioservice.AudioService;
import d0.AbstractC0349b;
import d0.AbstractC0360m;
import d0.C0363p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0363p f5408h = new C0363p();
    public final M i = new M();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5409j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0375e[] f5411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0375e f5412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f5413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f5414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public M f5415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5416q;

    public f(int i, List list) {
        this.f5410k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = AbstractC0349b.f5271a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b4 = ((byte[]) list.get(0))[0];
            }
        }
        this.f5411l = new C0375e[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f5411l[i5] = new C0375e();
        }
        this.f5412m = this.f5411l[0];
    }

    @Override // d1.h
    public final V1.h f() {
        List list = this.f5413n;
        this.f5414o = list;
        list.getClass();
        return new V1.h(list);
    }

    @Override // d1.h, g0.b
    public final void flush() {
        super.flush();
        this.f5413n = null;
        this.f5414o = null;
        this.f5416q = 0;
        this.f5412m = this.f5411l[0];
        l();
        this.f5415p = null;
    }

    @Override // d1.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f5787p;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0363p c0363p = this.f5408h;
        c0363p.F(iLimit, bArrArray);
        while (c0363p.a() >= 3) {
            int iV = c0363p.v();
            int i = iV & 3;
            boolean z4 = (iV & 4) == 4;
            byte bV = (byte) c0363p.v();
            byte bV2 = (byte) c0363p.v();
            if (i == 2 || i == 3) {
                if (z4) {
                    if (i == 3) {
                        j();
                        int i5 = (bV & 192) >> 6;
                        int i6 = this.f5409j;
                        if (i6 != -1 && i5 != (i6 + 1) % 4) {
                            l();
                            AbstractC0360m.y("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f5409j + " current=" + i5);
                        }
                        this.f5409j = i5;
                        int i7 = bV & 63;
                        if (i7 == 0) {
                            i7 = 64;
                        }
                        M m4 = new M(i5, i7);
                        this.f5415p = m4;
                        m4.f714e = 1;
                        m4.f711b[0] = bV2;
                    } else {
                        AbstractC0360m.c(i == 2);
                        M m5 = this.f5415p;
                        if (m5 == null) {
                            AbstractC0360m.l("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = m5.f711b;
                            int i8 = m5.f714e;
                            int i9 = i8 + 1;
                            m5.f714e = i9;
                            bArr[i8] = bV;
                            m5.f714e = i8 + 2;
                            bArr[i9] = bV2;
                        }
                    }
                    M m6 = this.f5415p;
                    if (m6.f714e == (m6.f713d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // d1.h
    public final boolean i() {
        return this.f5413n != this.f5414o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i;
        int i5;
        boolean z4;
        char c5;
        int i6;
        M m4 = this.f5415p;
        if (m4 == null) {
            return;
        }
        int i7 = 2;
        if (m4.f714e != (m4.f713d * 2) - 1) {
            AbstractC0360m.k("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f5415p.f713d * 2) - 1) + ", but current index is " + this.f5415p.f714e + " (sequence number " + this.f5415p.f712c + ");");
        }
        M m5 = this.f5415p;
        byte[] bArr = m5.f711b;
        int i8 = m5.f714e;
        M m6 = this.i;
        m6.p(i8, bArr);
        boolean z5 = false;
        while (true) {
            if (m6.b() > 0) {
                int i9 = 3;
                int i10 = m6.i(3);
                int i11 = m6.i(5);
                if (i10 == 7) {
                    m6.u(i7);
                    i10 = m6.i(6);
                    if (i10 < 7) {
                        AbstractC0307a.o(i10, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i11 == 0) {
                    if (i10 != 0) {
                        AbstractC0360m.y("Cea708Decoder", "serviceNumber is non-zero (" + i10 + ") when blockSize is 0");
                    }
                } else if (i10 != this.f5410k) {
                    m6.v(i11);
                } else {
                    int iG = (i11 * 8) + m6.g();
                    while (m6.g() < iG) {
                        int i12 = m6.i(8);
                        if (i12 != 16) {
                            if (i12 <= 31) {
                                if (i12 != 0) {
                                    if (i12 == i9) {
                                        this.f5413n = k();
                                    } else if (i12 != 8) {
                                        switch (i12) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f5412m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i12 >= 17 && i12 <= 23) {
                                                    AbstractC0360m.y("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i12);
                                                    m6.u(8);
                                                } else if (i12 < 24 || i12 > 31) {
                                                    AbstractC0307a.o(i12, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    AbstractC0360m.y("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i12);
                                                    m6.u(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f5412m.f5389b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i6 = i7;
                                i = i9;
                                i5 = iG;
                            } else if (i12 <= 127) {
                                if (i12 == 127) {
                                    this.f5412m.a((char) 9835);
                                } else {
                                    this.f5412m.a((char) (i12 & 255));
                                }
                                i6 = i7;
                                i = i9;
                                i5 = iG;
                                z5 = true;
                            } else {
                                if (i12 <= 159) {
                                    C0375e[] c0375eArr = this.f5411l;
                                    switch (i12) {
                                        case 128:
                                        case 129:
                                        case AudioService.KEYCODE_BYPASS_PAUSE /* 130 */:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i9;
                                            i5 = iG;
                                            z4 = true;
                                            int i13 = i12 - 128;
                                            if (this.f5416q != i13) {
                                                this.f5416q = i13;
                                                this.f5412m = c0375eArr[i13];
                                            }
                                            break;
                                        case 136:
                                            i = i9;
                                            i5 = iG;
                                            z4 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (m6.h()) {
                                                    C0375e c0375e = c0375eArr[8 - i14];
                                                    c0375e.f5388a.clear();
                                                    c0375e.f5389b.clear();
                                                    c0375e.f5401o = -1;
                                                    c0375e.f5402p = -1;
                                                    c0375e.f5403q = -1;
                                                    c0375e.f5405s = -1;
                                                    c0375e.f5407u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i9;
                                            i5 = iG;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (m6.h()) {
                                                    c0375eArr[8 - i15].f5391d = true;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 138:
                                            i = i9;
                                            i5 = iG;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (m6.h()) {
                                                    c0375eArr[8 - i16].f5391d = false;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 139:
                                            i = i9;
                                            i5 = iG;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (m6.h()) {
                                                    c0375eArr[8 - i17].f5391d = !r1.f5391d;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 140:
                                            i = i9;
                                            i5 = iG;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (m6.h()) {
                                                    c0375eArr[8 - i18].d();
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 141:
                                            i = i9;
                                            i5 = iG;
                                            m6.u(8);
                                            z4 = true;
                                            break;
                                        case 142:
                                            i = i9;
                                            i5 = iG;
                                            z4 = true;
                                            break;
                                        case 143:
                                            i = i9;
                                            i5 = iG;
                                            l();
                                            z4 = true;
                                            break;
                                        case 144:
                                            i5 = iG;
                                            if (this.f5412m.f5390c) {
                                                m6.i(4);
                                                m6.i(2);
                                                m6.i(2);
                                                boolean zH = m6.h();
                                                boolean zH2 = m6.h();
                                                i = 3;
                                                m6.i(3);
                                                m6.i(3);
                                                this.f5412m.e(zH, zH2);
                                                z4 = true;
                                            } else {
                                                m6.u(16);
                                                i = 3;
                                                z4 = true;
                                            }
                                            break;
                                        case 145:
                                            i5 = iG;
                                            if (this.f5412m.f5390c) {
                                                int iC = C0375e.c(m6.i(2), m6.i(2), m6.i(2), m6.i(2));
                                                int iC2 = C0375e.c(m6.i(2), m6.i(2), m6.i(2), m6.i(2));
                                                m6.u(2);
                                                C0375e.c(m6.i(2), m6.i(2), m6.i(2), 0);
                                                this.f5412m.f(iC, iC2);
                                            } else {
                                                m6.u(24);
                                            }
                                            i = 3;
                                            z4 = true;
                                            break;
                                        case 146:
                                            i5 = iG;
                                            if (this.f5412m.f5390c) {
                                                m6.u(4);
                                                int i19 = m6.i(4);
                                                m6.u(2);
                                                m6.i(6);
                                                C0375e c0375e2 = this.f5412m;
                                                if (c0375e2.f5407u != i19) {
                                                    c0375e2.a('\n');
                                                }
                                                c0375e2.f5407u = i19;
                                            } else {
                                                m6.u(16);
                                            }
                                            i = 3;
                                            z4 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0307a.o(i12, "Invalid C1 command: ", "Cea708Decoder");
                                            i = i9;
                                            i5 = iG;
                                            z4 = true;
                                            break;
                                        case 151:
                                            i5 = iG;
                                            if (this.f5412m.f5390c) {
                                                int iC3 = C0375e.c(m6.i(2), m6.i(2), m6.i(2), m6.i(2));
                                                m6.i(2);
                                                C0375e.c(m6.i(2), m6.i(2), m6.i(2), 0);
                                                m6.h();
                                                m6.h();
                                                m6.i(2);
                                                m6.i(2);
                                                int i20 = m6.i(2);
                                                m6.u(8);
                                                C0375e c0375e3 = this.f5412m;
                                                c0375e3.f5400n = iC3;
                                                c0375e3.f5397k = i20;
                                            } else {
                                                m6.u(32);
                                            }
                                            i = 3;
                                            z4 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i21 = i12 - 152;
                                            C0375e c0375e4 = c0375eArr[i21];
                                            m6.u(i7);
                                            boolean zH3 = m6.h();
                                            m6.u(i7);
                                            int i22 = m6.i(i9);
                                            boolean zH4 = m6.h();
                                            int i23 = m6.i(7);
                                            int i24 = m6.i(8);
                                            int i25 = m6.i(4);
                                            int i26 = m6.i(4);
                                            m6.u(i7);
                                            m6.u(6);
                                            m6.u(i7);
                                            int i27 = m6.i(3);
                                            i5 = iG;
                                            int i28 = m6.i(3);
                                            c0375e4.f5390c = true;
                                            c0375e4.f5391d = zH3;
                                            c0375e4.f5392e = i22;
                                            c0375e4.f5393f = zH4;
                                            c0375e4.f5394g = i23;
                                            c0375e4.f5395h = i24;
                                            c0375e4.i = i25;
                                            int i29 = i26 + 1;
                                            if (c0375e4.f5396j != i29) {
                                                c0375e4.f5396j = i29;
                                                while (true) {
                                                    ArrayList arrayList = c0375e4.f5388a;
                                                    if (arrayList.size() >= c0375e4.f5396j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i27 != 0 && c0375e4.f5398l != i27) {
                                                c0375e4.f5398l = i27;
                                                int i30 = i27 - 1;
                                                int i31 = C0375e.f5380B[i30];
                                                boolean z6 = C0375e.f5379A[i30];
                                                int i32 = C0375e.y[i30];
                                                int i33 = C0375e.f5387z[i30];
                                                int i34 = C0375e.f5386x[i30];
                                                c0375e4.f5400n = i31;
                                                c0375e4.f5397k = i34;
                                            }
                                            if (i28 != 0 && c0375e4.f5399m != i28) {
                                                c0375e4.f5399m = i28;
                                                int i35 = i28 - 1;
                                                int i36 = C0375e.f5382D[i35];
                                                int i37 = C0375e.f5381C[i35];
                                                c0375e4.e(false, false);
                                                c0375e4.f(C0375e.f5384v, C0375e.f5383E[i35]);
                                            }
                                            if (this.f5416q != i21) {
                                                this.f5416q = i21;
                                                this.f5412m = c0375eArr[i21];
                                            }
                                            i = 3;
                                            z4 = true;
                                            break;
                                    }
                                } else {
                                    i = i9;
                                    i5 = iG;
                                    z4 = true;
                                    if (i12 <= 255) {
                                        this.f5412m.a((char) (i12 & 255));
                                    } else {
                                        AbstractC0307a.o(i12, "Invalid base command: ", "Cea708Decoder");
                                        i6 = 2;
                                        c5 = 7;
                                    }
                                }
                                z5 = z4;
                                i6 = 2;
                                c5 = 7;
                            }
                            z4 = true;
                            c5 = 7;
                        } else {
                            i = i9;
                            i5 = iG;
                            z4 = true;
                            int i38 = m6.i(8);
                            if (i38 <= 31) {
                                c5 = 7;
                                if (i38 > 7) {
                                    if (i38 <= 15) {
                                        m6.u(8);
                                    } else if (i38 <= 23) {
                                        m6.u(16);
                                    } else if (i38 <= 31) {
                                        m6.u(24);
                                    }
                                }
                            } else {
                                c5 = 7;
                                if (i38 <= 127) {
                                    if (i38 == 32) {
                                        this.f5412m.a(' ');
                                    } else if (i38 == 33) {
                                        this.f5412m.a((char) 160);
                                    } else if (i38 == 37) {
                                        this.f5412m.a((char) 8230);
                                    } else if (i38 == 42) {
                                        this.f5412m.a((char) 352);
                                    } else if (i38 == 44) {
                                        this.f5412m.a((char) 338);
                                    } else if (i38 == 63) {
                                        this.f5412m.a((char) 376);
                                    } else if (i38 == 57) {
                                        this.f5412m.a((char) 8482);
                                    } else if (i38 == 58) {
                                        this.f5412m.a((char) 353);
                                    } else if (i38 == 60) {
                                        this.f5412m.a((char) 339);
                                    } else if (i38 != 61) {
                                        switch (i38) {
                                            case 48:
                                                this.f5412m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f5412m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f5412m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f5412m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f5412m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f5412m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i38) {
                                                    case 118:
                                                        this.f5412m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f5412m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f5412m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f5412m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f5412m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f5412m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f5412m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f5412m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f5412m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f5412m.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC0307a.o(i38, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f5412m.a((char) 8480);
                                    }
                                    z5 = true;
                                } else if (i38 > 159) {
                                    i6 = 2;
                                    if (i38 <= 255) {
                                        if (i38 == 160) {
                                            this.f5412m.a((char) 13252);
                                        } else {
                                            AbstractC0307a.o(i38, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f5412m.a('_');
                                        }
                                        z5 = true;
                                    } else {
                                        AbstractC0307a.o(i38, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i38 <= 135) {
                                    m6.u(32);
                                } else if (i38 <= 143) {
                                    m6.u(40);
                                } else if (i38 <= 159) {
                                    i6 = 2;
                                    m6.u(2);
                                    m6.u(m6.i(6) * 8);
                                }
                            }
                            i6 = 2;
                        }
                        i9 = i;
                        iG = i5;
                        i7 = i6;
                    }
                }
            }
        }
        if (z5) {
            this.f5413n = k();
        }
        this.f5415p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.f.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.f5411l[i].d();
        }
    }
}
