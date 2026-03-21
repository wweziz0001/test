package t3;

import com.ryanheise.audioservice.AudioService;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871b extends n3.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0871b f10059e = new C0871b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10060d;

    public /* synthetic */ C0871b(int i) {
        this.f10060d = i;
    }

    @Override // n3.w
    public Object f(byte b4, ByteBuffer byteBuffer) {
        switch (this.f10060d) {
            case 1:
                N3.h.e(byteBuffer, "buffer");
                if (b4 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 != null) {
                        int iLongValue = (int) l3.longValue();
                        L.f10049m.getClass();
                        L[] lArrValues = L.values();
                        int length = lArrValues.length;
                        for (int i = 0; i < length; i++) {
                            L l4 = lArrValues[i];
                            if (l4.f10054l == iLongValue) {
                            }
                        }
                    }
                } else if (b4 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        N3.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    }
                } else if (b4 == -125) {
                    Object objE2 = e(byteBuffer);
                    List list2 = objE2 instanceof List ? (List) objE2 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        N3.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    }
                }
                break;
        }
        return super.f(b4, byteBuffer);
    }

    @Override // n3.w
    public void k(n3.v vVar, Object obj) {
        switch (this.f10060d) {
            case 1:
                if (obj instanceof L) {
                    vVar.write(129);
                    k(vVar, Integer.valueOf(((L) obj).f10054l));
                } else if (obj instanceof C0876g) {
                    vVar.write(AudioService.KEYCODE_BYPASS_PAUSE);
                    C0876g c0876g = (C0876g) obj;
                    k(vVar, C3.g.Q(c0876g.f10068a, Boolean.valueOf(c0876g.f10069b)));
                } else if (!(obj instanceof N)) {
                    super.k(vVar, obj);
                } else {
                    vVar.write(131);
                    N n4 = (N) obj;
                    k(vVar, C3.g.Q(n4.f10055a, n4.f10056b));
                }
                break;
            default:
                super.k(vVar, obj);
                break;
        }
    }
}
