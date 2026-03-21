package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0278u;
import e3.C0394c;
import java.util.List;
import m3.C0667a;
import m3.C0669c;
import r3.C0782a;

/* JADX INFO: renamed from: io.flutter.embedding.android.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0488g extends Activity implements InterfaceC0491j, InterfaceC0278u {
    public static final int FLUTTER_VIEW_ID = View.generateViewId();
    private static final String TAG = "FlutterActivity";
    protected C0492k delegate;
    boolean hasRegisteredBackCallback = false;
    private C0280w lifecycle;
    private final OnBackInvokedCallback onBackInvokedCallback;

    public AbstractActivityC0488g() {
        int i = Build.VERSION.SDK_INT;
        this.onBackInvokedCallback = i < 33 ? null : i >= 34 ? new C0484c(this) : new androidx.activity.q(this, 1);
        this.lifecycle = new C0280w(this);
    }

    public static Intent createDefaultIntent(Context context) {
        withNewEngine().getClass();
        return new Intent(context, (Class<?>) AbstractActivityC0488g.class).putExtra("route", "/").putExtra("background_mode", "opaque").putExtra("destroy_engine_with_activity", true);
    }

    public static C0485d withCachedEngine(String str) {
        return new C0485d();
    }

    public static C0487f withNewEngine() {
        return new C0487f();
    }

    public static C0486e withNewEngineInGroup(String str) {
        return new C0486e();
    }

    public final boolean a(String str) {
        C0492k c0492k = this.delegate;
        if (c0492k == null) {
            Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0492k.f6580j) {
            return true;
        }
        Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean attachToEngineAutomatically() {
        return true;
    }

    public void cancelBackGesture() {
        if (a("cancelBackGesture")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c != null) {
                c0394c.f5613j.f8672a.a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public void commitBackGesture() {
        if (a("commitBackGesture")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c != null) {
                c0394c.f5613j.f8672a.a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0494m
    public void configureFlutterEngine(C0394c c0394c) {
        if (this.delegate.f6578g) {
            return;
        }
        Z1.f.H(c0394c);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void detachFromFlutterEngine() {
        Log.w(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        C0492k c0492k = this.delegate;
        if (c0492k != null) {
            c0492k.h();
            this.delegate.i();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public Activity getActivity() {
        return this;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getAppBundlePath() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean getBackCallbackState() {
        return this.hasRegisteredBackCallback;
    }

    public EnumC0493l getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? EnumC0493l.valueOf(getIntent().getStringExtra("background_mode")) : EnumC0493l.f6583l;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getDartEntrypointLibraryUri() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public InterfaceC0483b getExclusiveAppComponent() {
        return this.delegate;
    }

    public C0394c getFlutterEngine() {
        return this.delegate.f6573b;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public e3.k getFlutterShellArgs() {
        return e3.k.a(getIntent());
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, androidx.lifecycle.InterfaceC0278u
    public AbstractC0274p getLifecycle() {
        return this.lifecycle;
    }

    public Bundle getMetaData() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public S getRenderMode() {
        return getBackgroundMode() == EnumC0493l.f6583l ? S.f6546l : S.f6547m;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public W getTransparencyMode() {
        return getBackgroundMode() == EnumC0493l.f6583l ? W.f6558l : W.f6559m;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        if (a("onActivityResult")) {
            this.delegate.e(i, i5, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (a("onBackPressed")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c != null) {
                c0394c.i.f8672a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        try {
            Bundle metaData = getMetaData();
            if (metaData != null && (i = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            setFrameworkHandlesBack(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0492k c0492k = new C0492k(this);
        this.delegate = c0492k;
        c0492k.f();
        this.delegate.l(bundle);
        this.lifecycle.e(EnumC0272n.ON_CREATE);
        if (getBackgroundMode() == EnumC0493l.f6584m) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(this.delegate.g(FLUTTER_VIEW_ID, getRenderMode() == S.f6546l));
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (a("onDestroy")) {
            this.delegate.h();
            this.delegate.i();
        }
        release();
        this.lifecycle.e(EnumC0272n.ON_DESTROY);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void onFlutterSurfaceViewCreated(y yVar) {
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void onFlutterTextureViewCreated(A a5) {
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void onFlutterUiDisplayed() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a("onNewIntent")) {
            this.delegate.j(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        C0394c c0394c;
        super.onPause();
        if (a("onPause")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            if (c0492k.f6572a.shouldDispatchAppLifecycleState() && (c0394c = c0492k.f6573b) != null) {
                C0669c c0669c = c0394c.f5611g;
                c0669c.e(3, c0669c.f8676c);
            }
        }
        this.lifecycle.e(EnumC0272n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (a("onPostResume")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            if (c0492k.f6573b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0492k.f6575d;
            if (fVar != null) {
                fVar.b();
            }
            c0492k.f6573b.f5622s.k();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (a("onRequestPermissionsResult")) {
            this.delegate.k(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        C0394c c0394c;
        super.onResume();
        this.lifecycle.e(EnumC0272n.ON_RESUME);
        if (a("onResume")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            if (!c0492k.f6572a.shouldDispatchAppLifecycleState() || (c0394c = c0492k.f6573b) == null) {
                return;
            }
            C0669c c0669c = c0394c.f5611g;
            c0669c.e(2, c0669c.f8676c);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (a("onSaveInstanceState")) {
            this.delegate.m(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.lifecycle.e(EnumC0272n.ON_START);
        if (a("onStart")) {
            this.delegate.n();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (a("onStop")) {
            this.delegate.o();
        }
        this.lifecycle.e(EnumC0272n.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (a("onTrimMemory")) {
            this.delegate.p(i);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (a("onUserLeaveHint")) {
            this.delegate.q();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (a("onWindowFocusChanged")) {
            this.delegate.r(z4);
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean popSystemNavigator() {
        return false;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public io.flutter.plugin.platform.f providePlatformPlugin(Activity activity, C0394c c0394c) {
        return new io.flutter.plugin.platform.f(getActivity(), c0394c.f5615l, this);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public C0782a provideSensitiveContentPlugin(Activity activity, C0394c c0394c) {
        return new C0782a(FLUTTER_VIEW_ID, activity, c0394c.f5617n);
    }

    public void registerOnBackInvokedCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = true;
        }
    }

    public void release() {
        unregisterOnBackInvokedCallback();
        C0492k c0492k = this.delegate;
        if (c0492k != null) {
            c0492k.f6572a = null;
            c0492k.f6573b = null;
            c0492k.f6574c = null;
            c0492k.f6575d = null;
            c0492k.f6576e = null;
            this.delegate = null;
        }
    }

    public void setDelegate(C0492k c0492k) {
        this.delegate = c0492k;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public void setFrameworkHandlesBack(boolean z4) {
        if (z4 && !this.hasRegisteredBackCallback) {
            registerOnBackInvokedCallback();
        } else {
            if (z4 || !this.hasRegisteredBackCallback) {
                return;
            }
            unregisterOnBackInvokedCallback();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.delegate.f6578g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean shouldHandleDeeplinking() {
        try {
            Bundle metaData = getMetaData();
            if (metaData == null || !metaData.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return metaData.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j
    public boolean shouldRestoreAndSaveState() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    public void startBackGesture(BackEvent backEvent) {
        if (a("startBackGesture")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0667a c0667a = c0394c.f5613j;
            c0667a.getClass();
            c0667a.f8672a.a("startBackGesture", C0667a.a(backEvent), null);
        }
    }

    public void unregisterOnBackInvokedCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = false;
        }
    }

    public void updateBackGestureProgress(BackEvent backEvent) {
        if (a("updateBackGestureProgress")) {
            C0492k c0492k = this.delegate;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0667a c0667a = c0394c.f5613j;
            c0667a.getClass();
            c0667a.f8672a.a("updateBackGestureProgress", C0667a.a(backEvent), null);
        }
    }

    public void updateSystemUiOverlays() {
        io.flutter.plugin.platform.f fVar;
        C0492k c0492k = this.delegate;
        if (c0492k == null || (fVar = c0492k.f6575d) == null) {
            return;
        }
        fVar.b();
    }

    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0494m
    public void cleanUpFlutterEngine(C0394c c0394c) {
    }
}
