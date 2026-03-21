package n3;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691a implements InterfaceC0695e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8931c;

    public /* synthetic */ C0691a(Object obj, int i, Object obj2) {
        this.f8929a = i;
        this.f8931c = obj;
        this.f8930b = obj2;
    }

    @Override // n3.InterfaceC0695e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f8929a) {
            case 0:
                Z1.i iVar = (Z1.i) this.f8931c;
                try {
                    ((InterfaceC0693c) this.f8930b).u(((InterfaceC0703m) iVar.f3014n).a(byteBuffer));
                } catch (RuntimeException e5) {
                    Log.e("BasicMessageChannel#" + ((String) iVar.f3013m), "Failed to handle message reply", e5);
                    return;
                }
                break;
            default:
                C0707q c0707q = (C0707q) this.f8931c;
                InterfaceC0706p interfaceC0706p = (InterfaceC0706p) this.f8930b;
                try {
                    if (byteBuffer == null) {
                        interfaceC0706p.notImplemented();
                    } else {
                        try {
                            interfaceC0706p.success(c0707q.f8942c.c(byteBuffer));
                        } catch (C0700j e6) {
                            interfaceC0706p.error(e6.f8934l, e6.getMessage(), e6.f8935m);
                        }
                    }
                } catch (RuntimeException e7) {
                    Log.e("MethodChannel#" + c0707q.f8941b, "Failed to handle method call result", e7);
                    return;
                }
                break;
        }
    }
}
