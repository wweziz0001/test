package androidx.fragment.app;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4326b;

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup);

    public void c(androidx.activity.b bVar, ViewGroup viewGroup) {
        N3.h.e(bVar, "backEvent");
        N3.h.e(viewGroup, "container");
    }

    public void d(ViewGroup viewGroup) {
        N3.h.e(viewGroup, "container");
    }
}
