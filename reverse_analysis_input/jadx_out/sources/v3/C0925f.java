package v3;

import com.ryanheise.audioservice.AudioService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import n3.v;
import n3.w;

/* JADX INFO: renamed from: v3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925f extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0925f f10374d = new C0925f();

    @Override // n3.w
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        switch (b4) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return EnumC0928i.values()[((Long) objE).intValue()];
            case -126:
                Object objE2 = e(byteBuffer);
                if (objE2 == null) {
                    return null;
                }
                return EnumC0926g.values()[((Long) objE2).intValue()];
            case -125:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                C0927h c0927h = new C0927h();
                Long l3 = (Long) arrayList.get(0);
                if (l3 == null) {
                    throw new IllegalStateException("Nonnull field \"playerId\" is null.");
                }
                c0927h.f10377a = l3;
                return c0927h;
            case -124:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                C0924e c0924e = new C0924e();
                String str = (String) arrayList2.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"uri\" is null.");
                }
                c0924e.f10369a = str;
                c0924e.f10370b = (EnumC0926g) arrayList2.get(1);
                Map map = (Map) arrayList2.get(2);
                if (map == null) {
                    throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
                }
                c0924e.f10371c = map;
                c0924e.f10372d = (String) arrayList2.get(3);
                c0924e.f10373e = (EnumC0928i) arrayList2.get(4);
                return c0924e;
            case -123:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                C0929j c0929j = new C0929j();
                Long l4 = (Long) arrayList3.get(0);
                if (l4 == null) {
                    throw new IllegalStateException("Nonnull field \"playPosition\" is null.");
                }
                c0929j.f10381a = l4;
                Long l5 = (Long) arrayList3.get(1);
                if (l5 == null) {
                    throw new IllegalStateException("Nonnull field \"bufferPosition\" is null.");
                }
                c0929j.f10382b = l5;
                return c0929j;
            default:
                return super.f(b4, byteBuffer);
        }
    }

    @Override // n3.w
    public final void k(v vVar, Object obj) {
        if (obj instanceof EnumC0928i) {
            vVar.write(129);
            k(vVar, obj != null ? Integer.valueOf(((EnumC0928i) obj).f10380l) : null);
            return;
        }
        if (obj instanceof EnumC0926g) {
            vVar.write(AudioService.KEYCODE_BYPASS_PAUSE);
            k(vVar, obj != null ? Integer.valueOf(((EnumC0926g) obj).f10376l) : null);
            return;
        }
        if (obj instanceof C0927h) {
            vVar.write(131);
            C0927h c0927h = (C0927h) obj;
            c0927h.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c0927h.f10377a);
            k(vVar, arrayList);
            return;
        }
        if (obj instanceof C0924e) {
            vVar.write(132);
            C0924e c0924e = (C0924e) obj;
            c0924e.getClass();
            ArrayList arrayList2 = new ArrayList(5);
            arrayList2.add(c0924e.f10369a);
            arrayList2.add(c0924e.f10370b);
            arrayList2.add(c0924e.f10371c);
            arrayList2.add(c0924e.f10372d);
            arrayList2.add(c0924e.f10373e);
            k(vVar, arrayList2);
            return;
        }
        if (!(obj instanceof C0929j)) {
            super.k(vVar, obj);
            return;
        }
        vVar.write(133);
        C0929j c0929j = (C0929j) obj;
        c0929j.getClass();
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add(c0929j.f10381a);
        arrayList3.add(c0929j.f10382b);
        k(vVar, arrayList3);
    }
}
