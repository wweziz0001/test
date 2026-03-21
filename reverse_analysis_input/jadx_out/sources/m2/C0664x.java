package m2;

import java.util.Comparator;

/* JADX INFO: renamed from: m2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0664x extends AbstractC0666z {
    public static AbstractC0666z f(int i) {
        return i < 0 ? AbstractC0666z.f8670b : i > 0 ? AbstractC0666z.f8671c : AbstractC0666z.f8669a;
    }

    @Override // m2.AbstractC0666z
    public final AbstractC0666z a(int i, int i5) {
        return f(Integer.compare(i, i5));
    }

    @Override // m2.AbstractC0666z
    public final AbstractC0666z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // m2.AbstractC0666z
    public final AbstractC0666z c(boolean z4, boolean z5) {
        return f(Boolean.compare(z4, z5));
    }

    @Override // m2.AbstractC0666z
    public final AbstractC0666z d(boolean z4, boolean z5) {
        return f(Boolean.compare(z5, z4));
    }

    @Override // m2.AbstractC0666z
    public final int e() {
        return 0;
    }
}
