package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0255w;
import e3.C0394c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import r3.C0782a;
import v1.InterfaceC0918h;

/* JADX INFO: loaded from: classes.dex */
public class r extends androidx.fragment.app.r implements InterfaceC0491j, ComponentCallbacks2 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f6606j0 = View.generateViewId();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C0492k f6608g0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ViewTreeObserverOnWindowFocusChangeListenerC0496o f6607f0 = new ViewTreeObserverOnWindowFocusChangeListenerC0496o(this);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final r f6609h0 = this;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final androidx.fragment.app.D f6610i0 = new androidx.fragment.app.D(this);

    public r() {
        q(new Bundle());
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0494m
    public final void cleanUpFlutterEngine(C0394c c0394c) {
        InterfaceC0918h activity = getActivity();
        if (activity instanceof InterfaceC0494m) {
            ((InterfaceC0494m) activity).cleanUpFlutterEngine(c0394c);
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0494m
    public final void configureFlutterEngine(C0394c c0394c) {
        InterfaceC0918h activity = getActivity();
        if (activity instanceof InterfaceC0494m) {
            ((InterfaceC0494m) activity).configureFlutterEngine(c0394c);
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void detachFromFlutterEngine() {
        Log.w("FlutterFragment", "FlutterFragment " + this + " connection to the engine " + this.f6608g0.f6573b + " evicted by another attaching activity");
        C0492k c0492k = this.f6608g0;
        if (c0492k != null) {
            c0492k.h();
            this.f6608g0.i();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getAppBundlePath() {
        return this.f4444q.getString("app_bundle_path");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean getBackCallbackState() {
        return this.f6610i0.f4225a;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getCachedEngineGroupId() {
        return this.f4444q.getString("cached_engine_group_id", null);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getCachedEngineId() {
        return this.f4444q.getString("cached_engine_id", null);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final List getDartEntrypointArgs() {
        return this.f4444q.getStringArrayList("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getDartEntrypointFunctionName() {
        return this.f4444q.getString("dart_entrypoint", "main");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getDartEntrypointLibraryUri() {
        return this.f4444q.getString("dart_entrypoint_uri");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final e3.k getFlutterShellArgs() {
        String[] stringArray = this.f4444q.getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        e3.k kVar = new e3.k();
        kVar.f5640a = new HashSet(Arrays.asList(stringArray));
        return kVar;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final String getInitialRoute() {
        return this.f4444q.getString("initial_route");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final S getRenderMode() {
        return S.valueOf(this.f4444q.getString("flutterview_render_mode", "surface"));
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final W getTransparencyMode() {
        return W.valueOf(this.f4444q.getString("flutterview_transparency_mode", "transparent"));
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void onFlutterSurfaceViewCreated(y yVar) {
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void onFlutterTextureViewCreated(A a5) {
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void onFlutterUiDisplayed() {
        InterfaceC0918h activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.m) {
            ((io.flutter.embedding.engine.renderer.m) activity).onFlutterUiDisplayed();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void onFlutterUiNoLongerDisplayed() {
        InterfaceC0918h activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.m) {
            ((io.flutter.embedding.engine.renderer.m) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (r("onTrimMemory")) {
            this.f6608g0.p(i);
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean popSystemNavigator() {
        AbstractActivityC0255w activity;
        if (!this.f4444q.getBoolean("should_automatically_handle_on_back_pressed", false) || (activity = getActivity()) == null) {
            return false;
        }
        androidx.fragment.app.D d5 = this.f6610i0;
        boolean z4 = d5.f4225a;
        if (z4) {
            d5.c(false);
        }
        activity.getOnBackPressedDispatcher().b();
        if (z4) {
            d5.c(true);
        }
        return true;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0495n
    public final C0394c provideFlutterEngine(Context context) {
        InterfaceC0918h activity = getActivity();
        if (activity instanceof InterfaceC0495n) {
            return ((InterfaceC0495n) activity).provideFlutterEngine(getContext());
        }
        return null;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final io.flutter.plugin.platform.f providePlatformPlugin(Activity activity, C0394c c0394c) {
        if (activity != null) {
            return new io.flutter.plugin.platform.f(getActivity(), c0394c.f5615l, this);
        }
        return null;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final C0782a provideSensitiveContentPlugin(Activity activity, C0394c c0394c) {
        if (activity == null) {
            return null;
        }
        return new C0782a(f6606j0, activity, c0394c.f5617n);
    }

    public final boolean r(String str) {
        C0492k c0492k = this.f6608g0;
        if (c0492k == null) {
            Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0492k.f6580j) {
            return true;
        }
        Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final void setFrameworkHandlesBack(boolean z4) {
        if (this.f4444q.getBoolean("should_automatically_handle_on_back_pressed", false)) {
            this.f6610i0.c(z4);
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean shouldAttachEngineToActivity() {
        return this.f4444q.getBoolean("should_attach_engine_to_activity");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean shouldDestroyEngineWithHost() {
        boolean z4 = this.f4444q.getBoolean("destroy_engine_with_fragment", false);
        return (getCachedEngineId() != null || this.f6608g0.f6578g) ? z4 : this.f4444q.getBoolean("destroy_engine_with_fragment", true);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean shouldHandleDeeplinking() {
        return this.f4444q.getBoolean("handle_deeplinking");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public final boolean shouldRestoreAndSaveState() {
        return this.f4444q.containsKey("enable_state_restoration") ? this.f4444q.getBoolean("enable_state_restoration") : getCachedEngineId() == null;
    }
}
