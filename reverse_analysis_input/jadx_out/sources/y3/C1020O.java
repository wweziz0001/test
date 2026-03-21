package y3;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Objects;

/* JADX INFO: renamed from: y3.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1020O implements M3.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1022Q f11005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JsResult f11006n;

    public /* synthetic */ C1020O(C1022Q c1022q, JsResult jsResult, int i) {
        this.f11004l = i;
        this.f11005m = c1022q;
        this.f11006n = jsResult;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        C1015J c1015j = (C1015J) obj;
        switch (this.f11004l) {
            case 0:
                C1022Q c1022q = this.f11005m;
                c1022q.getClass();
                if (!c1015j.f10990d) {
                    boolean zEquals = Boolean.TRUE.equals(c1015j.f10988b);
                    JsResult jsResult = this.f11006n;
                    if (!zEquals) {
                        jsResult.cancel();
                    } else {
                        jsResult.confirm();
                    }
                } else {
                    A.e eVar = c1022q.f11011b.f11068a;
                    Throwable th = c1015j.f10989c;
                    Objects.requireNonNull(th);
                    eVar.getClass();
                    A.e.k(th);
                }
                break;
            case 1:
                C1022Q c1022q2 = this.f11005m;
                c1022q2.getClass();
                if (!c1015j.f10990d) {
                    this.f11006n.confirm();
                } else {
                    A.e eVar2 = c1022q2.f11011b.f11068a;
                    Throwable th2 = c1015j.f10989c;
                    Objects.requireNonNull(th2);
                    eVar2.getClass();
                    A.e.k(th2);
                }
                break;
            default:
                C1022Q c1022q3 = this.f11005m;
                c1022q3.getClass();
                if (!c1015j.f10990d) {
                    String str = (String) c1015j.f10988b;
                    JsPromptResult jsPromptResult = (JsPromptResult) this.f11006n;
                    if (str == null) {
                        jsPromptResult.cancel();
                    } else {
                        jsPromptResult.confirm(str);
                    }
                } else {
                    A.e eVar3 = c1022q3.f11011b.f11068a;
                    Throwable th3 = c1015j.f10989c;
                    Objects.requireNonNull(th3);
                    eVar3.getClass();
                    A.e.k(th3);
                }
                break;
        }
        return null;
    }
}
