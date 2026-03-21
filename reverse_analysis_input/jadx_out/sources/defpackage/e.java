package defpackage;

import D1.b;
import H1.j;
import N3.h;
import Z1.i;
import Z1.l;
import a.AbstractC0149a;
import a0.C0200z;
import a3.C0206a;
import android.app.Activity;
import b3.AbstractC0307a;
import java.util.List;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f5459a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.e f5460b = new B3.e(new c(0));

    public static InterfaceC0703m a() {
        return (InterfaceC0703m) f5460b.a();
    }

    public static void b(e eVar, InterfaceC0696f interfaceC0696f, final C0206a c0206a) {
        eVar.getClass();
        h.e(interfaceC0696f, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        i iVar = new i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", strConcat), a(), (C0200z) null);
        if (c0206a != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    List listB;
                    List listB2;
                    Activity activity;
                    switch (i) {
                        case 0:
                            C0206a c0206a2 = c0206a;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            h.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c0206a2.a((b) obj2);
                                listB = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listB = b.b(th);
                            }
                            lVar.u(listB);
                            return;
                        default:
                            try {
                                B0.d dVar = c0206a.f3582l;
                                h.b(dVar);
                                activity = (Activity) dVar.f190l;
                            } catch (Throwable th2) {
                                listB2 = b.b(th2);
                            }
                            if (activity == null) {
                                throw new j();
                            }
                            h.b(activity);
                            listB2 = AbstractC0149a.y(new a(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            lVar.u(listB2);
                            return;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", strConcat), a(), (C0200z) null);
        if (c0206a == null) {
            iVar2.E(null);
        } else {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    List listB;
                    List listB2;
                    Activity activity;
                    switch (i5) {
                        case 0:
                            C0206a c0206a2 = c0206a;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            h.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c0206a2.a((b) obj2);
                                listB = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listB = b.b(th);
                            }
                            lVar.u(listB);
                            return;
                        default:
                            try {
                                B0.d dVar = c0206a.f3582l;
                                h.b(dVar);
                                activity = (Activity) dVar.f190l;
                            } catch (Throwable th2) {
                                listB2 = b.b(th2);
                            }
                            if (activity == null) {
                                throw new j();
                            }
                            h.b(activity);
                            listB2 = AbstractC0149a.y(new a(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            lVar.u(listB2);
                            return;
                    }
                }
            });
        }
    }
}
