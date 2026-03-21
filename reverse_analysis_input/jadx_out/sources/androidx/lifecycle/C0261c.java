package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0261c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f4525b;

    public C0261c(int i, Method method) {
        this.f4524a = i;
        this.f4525b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0261c)) {
            return false;
        }
        C0261c c0261c = (C0261c) obj;
        return this.f4524a == c0261c.f4524a && this.f4525b.getName().equals(c0261c.f4525b.getName());
    }

    public final int hashCode() {
        return this.f4525b.getName().hashCode() + (this.f4524a * 31);
    }
}
