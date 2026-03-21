package I2;

import F0.AbstractC0055b;
import F0.InterfaceC0061h;
import F0.K;
import a0.C0153D;
import a0.C0155F;
import a0.C0177c;
import a0.C0187m;
import a0.C0190p;
import a0.C0200z;
import a0.InterfaceC0162M;
import android.util.Log;
import c1.C0318a;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.InterfaceC0351d;
import d0.InterfaceC0356i;
import h0.C0458i;
import h0.C0464o;
import h0.SurfaceHolderCallbackC0445D;
import i0.C0477a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import m.B0;
import m2.C0639F;
import n3.InterfaceC0693c;
import org.json.JSONException;
import org.json.JSONObject;
import x0.C0984z;
import y3.C1030a;
import y3.C1035f;
import y3.C1037h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements q, InterfaceC0061h, InterfaceC0351d, InterfaceC0356i, e0.p, InterfaceC0693c, q0.x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1034m;

    public /* synthetic */ g(C0477a c0477a, Object obj, int i) {
        this.f1033l = i;
        this.f1034m = obj;
    }

    @Override // q0.x
    public int a(Object obj) {
        q0.o oVar = (q0.o) obj;
        oVar.getClass();
        C0190p c0190p = (C0190p) this.f1034m;
        String str = c0190p.f3424n;
        String str2 = oVar.f9289b;
        return ((str2.equals(str) || str2.equals(q0.y.b(c0190p))) && oVar.c(c0190p, false)) ? 1 : 0;
    }

    @Override // d0.InterfaceC0351d
    public void accept(Object obj) {
        C0318a c0318a = (C0318a) obj;
        switch (this.f1033l) {
            case 3:
                c1.h hVar = (c1.h) this.f1034m;
                hVar.getClass();
                c1.g gVar = new c1.g(c0318a.f5029b, C0200z.q(c0318a.f5028a, c0318a.f5030c));
                hVar.f5043c.add(gVar);
                long j5 = hVar.f5049j;
                if (j5 == -9223372036854775807L || c0318a.f5029b >= j5) {
                    hVar.a(gVar);
                }
                break;
            default:
                ((C0639F) this.f1034m).a(c0318a);
                break;
        }
    }

    @Override // F0.InterfaceC0061h
    public long b(long j5) {
        F0.w wVar = (F0.w) this.f1034m;
        return AbstractC0370w.j((j5 * ((long) wVar.f825e)) / 1000000, 0L, wVar.f829j - 1);
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        switch (this.f1033l) {
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC0162M) obj).onMediaMetadataChanged((C0153D) this.f1034m);
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((InterfaceC0162M) obj).onAudioAttributesChanged((C0177c) this.f1034m);
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                ((InterfaceC0162M) obj).onCues((c0.c) this.f1034m);
                break;
            case 9:
                ((InterfaceC0162M) obj).onMediaMetadataChanged(((SurfaceHolderCallbackC0445D) this.f1034m).f5909l.f5925L);
                break;
            case 10:
                ((InterfaceC0162M) obj).onMetadata((C0155F) this.f1034m);
                break;
            case 11:
                ((InterfaceC0162M) obj).onCues((List) this.f1034m);
                break;
            case 12:
            default:
                i0.h hVar = (i0.h) obj;
                hVar.getClass();
                hVar.f6407v = ((u0.g) this.f1034m).f10199a;
                break;
            case 13:
                i0.h hVar2 = (i0.h) obj;
                int i = hVar2.f6409x;
                C0458i c0458i = (C0458i) this.f1034m;
                hVar2.f6409x = i + c0458i.f6168g;
                hVar2.y += c0458i.f6166e;
                break;
            case 14:
                ((i0.h) obj).f6399n = (C0464o) this.f1034m;
                break;
            case 15:
                ((i0.h) obj).getClass();
                break;
        }
    }

    @Override // e0.p
    public void d(long j5, C0363p c0363p) {
        AbstractC0055b.f(j5, c0363p, (K[]) ((Z1.s) this.f1034m).f3086n);
    }

    @Override // I2.q
    public Object e() {
        Object obj = this.f1034m;
        switch (this.f1033l) {
            case 0:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e5) {
                    i4.a aVar = L2.c.f1490a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException("Failed to invoke constructor '" + L2.c.b(constructor) + "' with no args", e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + L2.c.b(constructor) + "' with no args", e7.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return y.f1079a.a(cls);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e8);
                }
        }
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        switch (this.f1033l) {
            case 20:
                boolean z4 = false;
                if (obj != null) {
                    try {
                        z4 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e5) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e5);
                    }
                }
                ((C0187m) ((g) this.f1034m).f1034m).c(z4);
                break;
            case 27:
                boolean z5 = obj instanceof List;
                long j5 = ((C1037h) this.f1034m).f11066l;
                if (!z5) {
                    i4.a.p(new C1030a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j5);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj2, (String) obj3, (String) list.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j5);
                    }
                }
                break;
            case 28:
                boolean z6 = obj instanceof List;
                Object obj4 = ((C1035f) this.f1034m).f11064m;
                if (!z6) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "", "AndroidMessage", obj4);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj5 = list2.get(0);
                        N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj5, (String) obj6, (String) list2.get(2)), "AndroidMessage", obj4);
                    }
                }
                break;
            default:
                boolean z7 = obj instanceof List;
                Object obj7 = ((C1035f) this.f1034m).f11064m;
                if (!z7) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "", "Certificate", obj7);
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj8 = list3.get(0);
                        N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list3.get(1);
                        N3.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj8, (String) obj9, (String) list3.get(2)), "Certificate", obj7);
                    }
                }
                break;
        }
    }

    public /* synthetic */ g(C0477a c0477a, Object obj, long j5) {
        this.f1033l = 15;
        this.f1034m = obj;
    }

    public /* synthetic */ g(C0477a c0477a, C0984z c0984z, u0.g gVar, IOException iOException, boolean z4) {
        this.f1033l = 16;
        this.f1034m = gVar;
    }

    public /* synthetic */ g(Object obj, int i) {
        this.f1033l = i;
        this.f1034m = obj;
    }
}
