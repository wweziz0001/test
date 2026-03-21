package D;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f325b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f326a;

    static {
        int i = Build.VERSION.SDK_INT;
        f325b = (i >= 30 ? new T() : i >= 29 ? new S() : new P()).b().f331a.a().f331a.b().f331a.c();
    }

    public a0(b0 b0Var) {
        this.f326a = b0Var;
    }

    public b0 a() {
        return this.f326a;
    }

    public b0 b() {
        return this.f326a;
    }

    public b0 c() {
        return this.f326a;
    }

    public C0004d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return j() == a0Var.j() && i() == a0Var.i() && Objects.equals(g(), a0Var.g()) && Objects.equals(f(), a0Var.f()) && Objects.equals(e(), a0Var.e());
    }

    public C0939c f() {
        return C0939c.f10401e;
    }

    public C0939c g() {
        return C0939c.f10401e;
    }

    public b0 h(int i, int i5, int i6, int i7) {
        return f325b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void d(View view) {
    }

    public void k(C0939c[] c0939cArr) {
    }

    public void l(b0 b0Var) {
    }

    public void m(C0939c c0939c) {
    }
}
