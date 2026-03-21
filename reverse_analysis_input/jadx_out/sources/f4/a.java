package f4;

import C3.e;
import C3.f;
import N3.h;
import P2.c;
import android.os.Build;
import j$.time.ZoneId;
import j3.C0524a;
import j3.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f5783l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = new C0707q(c0524a.f7455c, "flutter_timezone");
        this.f5783l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f5783l;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("channel");
            throw null;
        }
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        ArrayList arrayList;
        String id;
        h.e(c0704n, "call");
        String str = c0704n.f8938a;
        if (h.a(str, "getLocalTimezone")) {
            if (Build.VERSION.SDK_INT >= 26) {
                id = ZoneId.systemDefault().getId();
                h.b(id);
            } else {
                id = TimeZone.getDefault().getID();
                h.b(id);
            }
            ((c) interfaceC0706p).success(id);
            return;
        }
        if (!h.a(str, "getAvailableTimezones")) {
            ((c) interfaceC0706p).notImplemented();
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            h.d(availableZoneIds, "getAvailableZoneIds(...)");
            arrayList = new ArrayList();
            f.W(availableZoneIds, arrayList);
        } else {
            String[] availableIDs = TimeZone.getAvailableIDs();
            h.d(availableIDs, "getAvailableIDs(...)");
            arrayList = new ArrayList();
            e.Y(availableIDs, arrayList);
        }
        ((c) interfaceC0706p).success(arrayList);
    }
}
