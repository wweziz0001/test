package v3;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: v3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0924e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC0926g f10370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f10371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC0928i f10373e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0924e.class != obj.getClass()) {
            return false;
        }
        C0924e c0924e = (C0924e) obj;
        return this.f10369a.equals(c0924e.f10369a) && Objects.equals(this.f10370b, c0924e.f10370b) && this.f10371c.equals(c0924e.f10371c) && Objects.equals(this.f10372d, c0924e.f10372d) && Objects.equals(this.f10373e, c0924e.f10373e);
    }

    public final int hashCode() {
        return Objects.hash(this.f10369a, this.f10370b, this.f10371c, this.f10372d, this.f10373e);
    }
}
