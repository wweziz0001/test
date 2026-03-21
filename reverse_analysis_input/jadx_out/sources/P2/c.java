package P2;

import D0.y;
import Z1.e;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f3.g;
import java.util.Objects;
import m3.C0676j;
import n3.C0707q;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0706p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1694c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f1692a = i;
        this.f1694c = obj;
        this.f1693b = obj2;
    }

    @Override // n3.InterfaceC0706p
    public final void error(String str, String str2, Object obj) {
        switch (this.f1692a) {
            case 0:
                ((Handler) this.f1694c).post(new b(this, str, str2, obj, 0));
                break;
            case 1:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((g) this.f1693b).a(((C0707q) ((e) this.f1694c).f3002n).f8942c.f(str, str2, obj));
                break;
        }
    }

    @Override // n3.InterfaceC0706p
    public final void notImplemented() {
        switch (this.f1692a) {
            case 0:
                Handler handler = (Handler) this.f1694c;
                c cVar = (c) this.f1693b;
                Objects.requireNonNull(cVar);
                handler.post(new A3.c(cVar, 2));
                break;
            case 1:
                break;
            default:
                ((g) this.f1693b).a(null);
                break;
        }
    }

    @Override // n3.InterfaceC0706p
    public final void success(Object obj) {
        switch (this.f1692a) {
            case 0:
                ((Handler) this.f1694c).post(new y(this, 3, obj));
                break;
            case 1:
                ((C0676j) this.f1694c).f8714b = (byte[]) this.f1693b;
                break;
            default:
                ((g) this.f1693b).a(((C0707q) ((e) this.f1694c).f3002n).f8942c.a(obj));
                break;
        }
    }

    public c(c cVar) {
        this.f1692a = 0;
        this.f1694c = new Handler(Looper.getMainLooper());
        this.f1693b = cVar;
    }

    private final void a() {
    }
}
