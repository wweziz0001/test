package t0;

import android.net.Uri;
import d0.AbstractC0370w;
import java.util.Objects;
import m2.b0;
import m2.g0;

/* JADX INFO: renamed from: t0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f9820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f9821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f9826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9827h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9830l;

    public C0840D(C0839C c0839c) {
        this.f9820a = g0.a(c0839c.f9809a);
        this.f9821b = c0839c.f9810b.g();
        String str = c0839c.f9812d;
        int i = AbstractC0370w.f5326a;
        this.f9822c = str;
        this.f9823d = c0839c.f9813e;
        this.f9824e = c0839c.f9814f;
        this.f9826g = c0839c.f9815g;
        this.f9827h = c0839c.f9816h;
        this.f9825f = c0839c.f9811c;
        this.i = c0839c.i;
        this.f9828j = c0839c.f9818k;
        this.f9829k = c0839c.f9819l;
        this.f9830l = c0839c.f9817j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0840D.class != obj.getClass()) {
            return false;
        }
        C0840D c0840d = (C0840D) obj;
        if (this.f9825f == c0840d.f9825f) {
            g0 g0Var = this.f9820a;
            g0Var.getClass();
            if (m2.r.h(g0Var, c0840d.f9820a) && this.f9821b.equals(c0840d.f9821b)) {
                int i = AbstractC0370w.f5326a;
                if (Objects.equals(this.f9823d, c0840d.f9823d) && Objects.equals(this.f9822c, c0840d.f9822c) && Objects.equals(this.f9824e, c0840d.f9824e) && Objects.equals(this.f9830l, c0840d.f9830l) && Objects.equals(this.f9826g, c0840d.f9826g) && Objects.equals(this.f9828j, c0840d.f9828j) && Objects.equals(this.f9829k, c0840d.f9829k) && Objects.equals(this.f9827h, c0840d.f9827h) && Objects.equals(this.i, c0840d.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9821b.hashCode() + ((this.f9820a.hashCode() + 217) * 31)) * 31;
        String str = this.f9823d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9822c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9824e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9825f) * 31;
        String str4 = this.f9830l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f9826g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f9828j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9829k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9827h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
