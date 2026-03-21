package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0274p;
import io.flutter.embedding.android.AbstractActivityC0502v;
import v1.C0916f;
import v1.InterfaceC0918h;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254v extends Z1.f implements u.i, androidx.lifecycle.Z, androidx.activity.y, InterfaceC0918h, P {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractActivityC0255w f4458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractActivityC0255w f4459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f4460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final M f4461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0502v f4462u;

    public C0254v(AbstractActivityC0502v abstractActivityC0502v) {
        super(14);
        this.f4462u = abstractActivityC0502v;
        Handler handler = new Handler();
        this.f4458q = abstractActivityC0502v;
        this.f4459r = abstractActivityC0502v;
        this.f4460s = handler;
        this.f4461t = new M();
    }

    @Override // Z1.f
    public final View D(int i) {
        return this.f4462u.findViewById(i);
    }

    @Override // Z1.f
    public final boolean E() {
        Window window = this.f4462u.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.P
    public final void a(r rVar) {
        this.f4462u.onAttachFragment(rVar);
    }

    @Override // u.i
    public final void addOnConfigurationChangedListener(C.a aVar) {
        this.f4462u.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0278u
    public final AbstractC0274p getLifecycle() {
        return this.f4462u.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.y
    public final androidx.activity.x getOnBackPressedDispatcher() {
        return this.f4462u.getOnBackPressedDispatcher();
    }

    @Override // v1.InterfaceC0918h
    public final C0916f getSavedStateRegistry() {
        return this.f4462u.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.Z
    public final androidx.lifecycle.Y getViewModelStore() {
        return this.f4462u.getViewModelStore();
    }

    @Override // u.i
    public final void removeOnConfigurationChangedListener(C.a aVar) {
        this.f4462u.removeOnConfigurationChangedListener(aVar);
    }
}
