package U2;

import com.dexterous.flutterlocalnotifications.h;
import java.io.Serializable;
import java.util.HashMap;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0706p f2283m;

    public /* synthetic */ b(InterfaceC0706p interfaceC0706p, int i) {
        this.f2282l = i;
        this.f2283m = interfaceC0706p;
    }

    @Override // com.dexterous.flutterlocalnotifications.h
    public void a(boolean z4) {
        switch (this.f2282l) {
            case 1:
                this.f2283m.success(Boolean.valueOf(z4));
                break;
            case 2:
                this.f2283m.success(Boolean.valueOf(z4));
                break;
            case 3:
                this.f2283m.success(Boolean.valueOf(z4));
                break;
            default:
                this.f2283m.success(Boolean.valueOf(z4));
                break;
        }
    }

    @Override // U2.d
    public void b(String str, HashMap map) {
        this.f2283m.error("sqlite_error", str, map);
    }

    @Override // com.dexterous.flutterlocalnotifications.h
    public void c() {
        switch (this.f2282l) {
            case 1:
                this.f2283m.error("permissionRequestInProgress", "Another permission request is already in progress", null);
                break;
            case 2:
                this.f2283m.error("permissionRequestInProgress", "Another permission request is already in progress", null);
                break;
            case 3:
                this.f2283m.error("permissionRequestInProgress", "Another permission request is already in progress", null);
                break;
            default:
                this.f2283m.error("permissionRequestInProgress", "Another permission request is already in progress", null);
                break;
        }
    }

    @Override // U2.d
    public void d(Serializable serializable) {
        this.f2283m.success(serializable);
    }
}
