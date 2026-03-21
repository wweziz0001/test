package defpackage;

import N3.h;
import a.AbstractC0149a;
import com.ryanheise.audioservice.AudioService;
import java.nio.ByteBuffer;
import java.util.List;
import n3.v;
import n3.w;
import y3.EnumC1017L;
import y3.EnumC1040k;
import y3.EnumC1046q;
import y3.EnumC1049t;
import y3.EnumC1050u;

/* JADX INFO: loaded from: classes.dex */
public class g extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5784d;

    public /* synthetic */ g(int i) {
        this.f5784d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [y3.t] */
    /* JADX WARN: Type inference failed for: r3v1, types: [y3.L] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y3.u] */
    /* JADX WARN: Type inference failed for: r3v3, types: [y3.k] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [y3.q] */
    /* JADX WARN: Type inference failed for: r7v10, types: [y3.k[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [y3.q[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [y3.t[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [y3.L[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [y3.u[]] */
    @Override // n3.w
    public Object f(byte b4, ByteBuffer byteBuffer) {
        ?? r32;
        switch (this.f5784d) {
            case 0:
                h.e(byteBuffer, "buffer");
                if (b4 == -127) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list != null) {
                    }
                } else if (b4 == -126) {
                    Object objE2 = e(byteBuffer);
                    List list2 = objE2 instanceof List ? (List) objE2 : null;
                    if (list2 != null) {
                    }
                }
                break;
            default:
                h.e(byteBuffer, "buffer");
                int i = 0;
                if (b4 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 != null) {
                        int iLongValue = (int) l3.longValue();
                        EnumC1046q.f11089m.getClass();
                        ?? Values = EnumC1046q.values();
                        int length = Values.length;
                        while (i < length) {
                            r32 = Values[i];
                            if (r32.f11095l != iLongValue) {
                                i++;
                            }
                        }
                    }
                } else if (b4 == -126) {
                    Long l4 = (Long) e(byteBuffer);
                    if (l4 != null) {
                        int iLongValue2 = (int) l4.longValue();
                        EnumC1040k.f11069m.getClass();
                        ?? Values2 = EnumC1040k.values();
                        int length2 = Values2.length;
                        while (i < length2) {
                            r32 = Values2[i];
                            if (r32.f11077l != iLongValue2) {
                                i++;
                            }
                        }
                    }
                } else if (b4 == -125) {
                    Long l5 = (Long) e(byteBuffer);
                    if (l5 != null) {
                        int iLongValue3 = (int) l5.longValue();
                        EnumC1050u.f11103m.getClass();
                        ?? Values3 = EnumC1050u.values();
                        int length3 = Values3.length;
                        while (i < length3) {
                            r32 = Values3[i];
                            if (r32.f11106l != iLongValue3) {
                                i++;
                            }
                        }
                    }
                } else if (b4 == -124) {
                    Long l6 = (Long) e(byteBuffer);
                    if (l6 != null) {
                        int iLongValue4 = (int) l6.longValue();
                        EnumC1017L.f10991m.getClass();
                        ?? Values4 = EnumC1017L.values();
                        int length4 = Values4.length;
                        while (i < length4) {
                            r32 = Values4[i];
                            if (r32.f11000l != iLongValue4) {
                                i++;
                            }
                        }
                    }
                } else if (b4 == -123) {
                    Long l7 = (Long) e(byteBuffer);
                    if (l7 != null) {
                        int iLongValue5 = (int) l7.longValue();
                        EnumC1049t.f11100m.getClass();
                        ?? Values5 = EnumC1049t.values();
                        int length5 = Values5.length;
                        while (i < length5) {
                            r32 = Values5[i];
                            if (r32.f11102l != iLongValue5) {
                                i++;
                            }
                        }
                    }
                }
                break;
        }
        return super.f(b4, byteBuffer);
    }

    @Override // n3.w
    public void k(v vVar, Object obj) {
        switch (this.f5784d) {
            case 0:
                if (obj instanceof b) {
                    vVar.write(129);
                    k(vVar, AbstractC0149a.y(((b) obj).f4821a));
                } else if (!(obj instanceof a)) {
                    super.k(vVar, obj);
                } else {
                    vVar.write(AudioService.KEYCODE_BYPASS_PAUSE);
                    k(vVar, AbstractC0149a.y(((a) obj).f3152a));
                }
                break;
            default:
                if (obj instanceof EnumC1046q) {
                    vVar.write(129);
                    k(vVar, Long.valueOf(((EnumC1046q) obj).f11095l));
                } else if (obj instanceof EnumC1040k) {
                    vVar.write(AudioService.KEYCODE_BYPASS_PAUSE);
                    k(vVar, Long.valueOf(((EnumC1040k) obj).f11077l));
                } else if (obj instanceof EnumC1050u) {
                    vVar.write(131);
                    k(vVar, Long.valueOf(((EnumC1050u) obj).f11106l));
                } else if (obj instanceof EnumC1017L) {
                    vVar.write(132);
                    k(vVar, Long.valueOf(((EnumC1017L) obj).f11000l));
                } else if (!(obj instanceof EnumC1049t)) {
                    super.k(vVar, obj);
                } else {
                    vVar.write(133);
                    k(vVar, Long.valueOf(((EnumC1049t) obj).f11102l));
                }
                break;
        }
    }
}
