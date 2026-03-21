package a0;

import android.util.SparseBooleanArray;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: a0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3363b;

    public C0187m() {
        this.f3363b = new SparseBooleanArray();
    }

    public void a(int i) {
        AbstractC0360m.h(!this.f3362a);
        ((SparseBooleanArray) this.f3363b).append(i, true);
    }

    public C0188n b() {
        AbstractC0360m.h(!this.f3362a);
        this.f3362a = true;
        return new C0188n((SparseBooleanArray) this.f3363b);
    }

    public void c(boolean z4) {
        if (this.f3362a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f3362a = true;
        io.flutter.embedding.android.K k4 = (io.flutter.embedding.android.K) this.f3363b;
        int i = k4.f6537b - 1;
        k4.f6537b = i;
        boolean z5 = z4 | k4.f6538c;
        k4.f6538c = z5;
        if (i != 0 || z5) {
            return;
        }
        k4.f6539d.B(k4.f6536a);
    }

    public C0187m(String str, boolean z4) {
        this.f3362a = z4;
        this.f3363b = str;
    }
}
