package X1;

import Q1.q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f2607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Z1.i iVar, int i) {
        super(context, iVar);
        this.f2608g = i;
        N3.h.e(iVar, "taskExecutor");
        this.f2607f = new d(this, 0);
    }

    @Override // X1.f
    public final Object a() {
        switch (this.f2608g) {
            case 0:
                Intent intentRegisterReceiver = this.f2615b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    q.d().b(b.f2609a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f2615b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    q.d().b(c.f2610a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z4 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                Intent intentRegisterReceiver3 = this.f2615b.registerReceiver(null, e());
                boolean z5 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z5 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z5 = false;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    @Override // X1.f
    public final void c() {
        q.d().a(e.f2613a, getClass().getSimpleName().concat(": registering receiver"));
        this.f2615b.registerReceiver(this.f2607f, e());
    }

    @Override // X1.f
    public final void d() {
        q.d().a(e.f2613a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f2615b.unregisterReceiver(this.f2607f);
    }

    public final IntentFilter e() {
        switch (this.f2608g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
