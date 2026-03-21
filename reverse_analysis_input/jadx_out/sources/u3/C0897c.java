package u3;

import com.ryanheise.audioservice.AudioService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import n3.v;
import n3.w;

/* JADX INFO: renamed from: u3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897c extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0897c f10256d = new C0897c();

    @Override // n3.w
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        if (b4 != -127) {
            if (b4 != -126) {
                return super.f(b4, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            C0895a c0895a = new C0895a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            c0895a.f10254a = bool;
            return c0895a;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        C0899e c0899e = new C0899e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        c0899e.f10259a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        c0899e.f10260b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        c0899e.f10261c = map;
        return c0899e;
    }

    @Override // n3.w
    public final void k(v vVar, Object obj) {
        if (obj instanceof C0899e) {
            vVar.write(129);
            C0899e c0899e = (C0899e) obj;
            c0899e.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(c0899e.f10259a);
            arrayList.add(c0899e.f10260b);
            arrayList.add(c0899e.f10261c);
            k(vVar, arrayList);
            return;
        }
        if (!(obj instanceof C0895a)) {
            super.k(vVar, obj);
            return;
        }
        vVar.write(AudioService.KEYCODE_BYPASS_PAUSE);
        C0895a c0895a = (C0895a) obj;
        c0895a.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(c0895a.f10254a);
        k(vVar, arrayList2);
    }
}
