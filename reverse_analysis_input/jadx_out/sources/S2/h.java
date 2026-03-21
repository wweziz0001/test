package S2;

import android.content.Context;
import android.media.AudioManager;
import j3.C0524a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j3.b, InterfaceC0705o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Map f2037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ArrayList f2038o = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f2039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f2040m;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        N3.h.e(c0524a, "flutterPluginBinding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        N3.h.d(interfaceC0696f, "getBinaryMessenger(...)");
        C0707q c0707q = new C0707q(interfaceC0696f, "com.ryanheise.audio_session");
        this.f2039l = c0707q;
        c0707q.b(this);
        Context context = c0524a.f7453a;
        N3.h.d(context, "getApplicationContext(...)");
        a aVar = new a();
        if (a.f2022m == null) {
            a.f2022m = new g(context);
        }
        aVar.f2023l = new C0707q(interfaceC0696f, "com.ryanheise.android_audio_manager");
        g gVar = a.f2022m;
        N3.h.b(gVar);
        gVar.f2029a.add(aVar);
        C0707q c0707q2 = aVar.f2023l;
        N3.h.b(c0707q2);
        c0707q2.b(aVar);
        this.f2040m = aVar;
        f2038o.add(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        N3.h.e(c0524a, "binding");
        C0707q c0707q = this.f2039l;
        N3.h.b(c0707q);
        c0707q.b(null);
        this.f2039l = null;
        a aVar = this.f2040m;
        N3.h.b(aVar);
        C0707q c0707q2 = aVar.f2023l;
        N3.h.b(c0707q2);
        c0707q2.b(null);
        g gVar = a.f2022m;
        N3.h.b(gVar);
        gVar.f2029a.remove(aVar);
        g gVar2 = a.f2022m;
        N3.h.b(gVar2);
        if (gVar2.f2029a.size() == 0) {
            g gVar3 = a.f2022m;
            N3.h.b(gVar3);
            gVar3.a();
            AudioManager audioManager = gVar3.f2034f;
            N3.h.b(audioManager);
            audioManager.unregisterAudioDeviceCallback(gVar3.f2035g);
            gVar3.f2033e = null;
            gVar3.f2034f = null;
            a.f2022m = null;
        }
        aVar.f2023l = null;
        this.f2040m = null;
        f2038o.remove(this);
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        N3.h.e(c0704n, "call");
        Object obj = c0704n.f8939b;
        N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        String str = c0704n.f8938a;
        if (!N3.h.a(str, "setConfiguration")) {
            if (!N3.h.a(str, "getConfiguration")) {
                ((P2.c) interfaceC0706p).notImplemented();
                return;
            } else {
                ((P2.c) interfaceC0706p).success(f2037n);
                return;
            }
        }
        f2037n = (Map) list.get(0);
        ((P2.c) interfaceC0706p).success(null);
        Map map = f2037n;
        N3.h.b(map);
        Object[] objArr = {map};
        for (h hVar : f2038o) {
            ArrayList arrayListZ = C3.e.Z(objArr);
            C0707q c0707q = hVar.f2039l;
            N3.h.b(c0707q);
            c0707q.a("onConfigurationChanged", arrayListZ, null);
        }
    }
}
