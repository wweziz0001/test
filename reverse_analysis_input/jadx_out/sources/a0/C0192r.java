package a0;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: a0.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f3439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0.u f3441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A0.b f3442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f3443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m2.I f3444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f3445h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0153D f3446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0195u f3447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0198x f3448l;

    public final C0150A a() {
        C0197w c0197w;
        this.f3442e.getClass();
        Uri uri = this.f3439b;
        if (uri != null) {
            String str = this.f3440c;
            this.f3442e.getClass();
            c0197w = new C0197w(uri, str, null, this.f3443f, this.f3444g, this.f3445h, this.i);
        } else {
            c0197w = null;
        }
        String str2 = this.f3438a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        F0.u uVar = this.f3441d;
        uVar.getClass();
        C0194t c0194t = new C0194t(uVar);
        C0195u c0195u = this.f3447k;
        c0195u.getClass();
        C0196v c0196v = new C0196v(c0195u);
        C0153D c0153d = this.f3446j;
        if (c0153d == null) {
            c0153d = C0153D.f3185B;
        }
        return new C0150A(str3, c0194t, c0197w, c0196v, c0153d, this.f3448l);
    }
}
