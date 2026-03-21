package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC0255w;
import androidx.fragment.app.C0234a;
import e3.C0394c;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: io.flutter.embedding.android.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0502v extends AbstractActivityC0255w implements InterfaceC0495n, InterfaceC0494m {
    public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    private r flutterFragment;

    public static Intent createDefaultIntent(Context context) {
        withNewEngine().getClass();
        return new Intent(context, (Class<?>) AbstractActivityC0502v.class).putExtra("route", "/").putExtra("background_mode", "opaque").putExtra("destroy_engine_with_activity", true);
    }

    public static C0499s withCachedEngine(String str) {
        return new C0499s();
    }

    public static C0501u withNewEngine() {
        return new C0501u();
    }

    public static C0500t withNewEngineInGroup(String str) {
        return new C0500t();
    }

    @Override // io.flutter.embedding.android.InterfaceC0494m
    public void configureFlutterEngine(C0394c c0394c) {
        r rVar = this.flutterFragment;
        if (rVar == null || !rVar.f6608g0.f6578g) {
            Z1.f.H(c0394c);
        }
    }

    public r createFlutterFragment() {
        S s4 = S.f6546l;
        EnumC0493l backgroundMode = getBackgroundMode();
        S renderMode = getRenderMode();
        EnumC0493l enumC0493l = EnumC0493l.f6583l;
        W w4 = W.f6559m;
        W w5 = backgroundMode == enumC0493l ? W.f6558l : w4;
        boolean z4 = renderMode == s4;
        if (getCachedEngineId() != null) {
            getCachedEngineId();
            shouldDestroyEngineWithHost();
            Objects.toString(backgroundMode);
            shouldAttachEngineToActivity();
            String cachedEngineId = getCachedEngineId();
            int i = r.f6606j0;
            boolean zShouldHandleDeeplinking = shouldHandleDeeplinking();
            boolean zShouldAttachEngineToActivity = shouldAttachEngineToActivity();
            boolean zShouldDestroyEngineWithHost = shouldDestroyEngineWithHost();
            try {
                r rVar = (r) r.class.getDeclaredConstructor(null).newInstance(null);
                if (rVar == null) {
                    throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + r.class.getCanonicalName() + ") does not match the expected return type.");
                }
                Bundle bundle = new Bundle();
                bundle.putString("cached_engine_id", cachedEngineId);
                bundle.putBoolean("destroy_engine_with_fragment", zShouldDestroyEngineWithHost);
                bundle.putBoolean("handle_deeplinking", zShouldHandleDeeplinking);
                bundle.putString("flutterview_render_mode", renderMode != null ? renderMode.name() : "surface");
                bundle.putString("flutterview_transparency_mode", w5.name());
                bundle.putBoolean("should_attach_engine_to_activity", zShouldAttachEngineToActivity);
                bundle.putBoolean("should_automatically_handle_on_back_pressed", true);
                bundle.putBoolean("should_delay_first_android_view_draw", z4);
                rVar.q(bundle);
                return rVar;
            } catch (Exception e5) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + r.class.getName() + ")", e5);
            }
        }
        getCachedEngineGroupId();
        Objects.toString(backgroundMode);
        getDartEntrypointFunctionName();
        if (getDartEntrypointLibraryUri() != null) {
            getDartEntrypointLibraryUri();
        }
        getInitialRoute();
        getAppBundlePath();
        shouldAttachEngineToActivity();
        if (getCachedEngineGroupId() != null) {
            String cachedEngineGroupId = getCachedEngineGroupId();
            int i5 = r.f6606j0;
            C0498q c0498q = new C0498q(cachedEngineGroupId);
            c0498q.f6599b = getDartEntrypointFunctionName();
            c0498q.f6600c = getInitialRoute();
            c0498q.f6601d = shouldHandleDeeplinking();
            c0498q.f6602e = renderMode;
            c0498q.f6603f = w5;
            c0498q.f6604g = shouldAttachEngineToActivity();
            c0498q.i = z4;
            c0498q.f6605h = true;
            try {
                r rVar2 = (r) r.class.getDeclaredConstructor(null).newInstance(null);
                if (rVar2 != null) {
                    rVar2.q(c0498q.a());
                    return rVar2;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + r.class.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e6) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + r.class.getName() + ")", e6);
            }
        }
        int i6 = r.f6606j0;
        C0497p c0497p = new C0497p();
        c0497p.f6587a = "main";
        c0497p.f6588b = null;
        c0497p.f6590d = "/";
        c0497p.f6591e = false;
        c0497p.f6592f = null;
        c0497p.f6593g = null;
        c0497p.f6594h = s4;
        c0497p.i = w4;
        c0497p.f6595j = true;
        c0497p.f6596k = false;
        c0497p.f6597l = false;
        c0497p.f6587a = getDartEntrypointFunctionName();
        c0497p.f6588b = getDartEntrypointLibraryUri();
        c0497p.f6589c = getDartEntrypointArgs();
        c0497p.f6590d = getInitialRoute();
        c0497p.f6592f = getAppBundlePath();
        c0497p.f6593g = e3.k.a(getIntent());
        c0497p.f6591e = shouldHandleDeeplinking();
        c0497p.f6594h = renderMode;
        c0497p.i = w5;
        c0497p.f6595j = shouldAttachEngineToActivity();
        c0497p.f6597l = z4;
        c0497p.f6596k = true;
        try {
            r rVar3 = (r) r.class.getDeclaredConstructor(null).newInstance(null);
            if (rVar3 != null) {
                rVar3.q(c0497p.a());
                return rVar3;
            }
            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + r.class.getCanonicalName() + ") does not match the expected return type.");
        } catch (Exception e7) {
            throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + r.class.getName() + ")", e7);
        }
    }

    public String getAppBundlePath() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public EnumC0493l getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? EnumC0493l.valueOf(getIntent().getStringExtra("background_mode")) : EnumC0493l.f6583l;
    }

    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public abstract String getCachedEngineId();

    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public String getDartEntrypointFunctionName() {
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

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

    public C0394c getFlutterEngine() {
        return this.flutterFragment.f6608g0.f6573b;
    }

    public abstract String getInitialRoute();

    public Bundle getMetaData() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public S getRenderMode() {
        return getBackgroundMode() == EnumC0493l.f6583l ? S.f6546l : S.f6547m;
    }

    @Override // androidx.fragment.app.AbstractActivityC0255w, androidx.activity.m, android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        super.onActivityResult(i, i5, intent);
        r rVar = this.flutterFragment;
        if (rVar.r("onActivityResult")) {
            rVar.f6608g0.e(i, i5, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        r rVar = this.flutterFragment;
        if (rVar.r("onBackPressed")) {
            C0492k c0492k = rVar.f6608g0;
            c0492k.c();
            C0394c c0394c = c0492k.f6573b;
            if (c0394c != null) {
                c0394c.i.f8672a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0255w, androidx.activity.m, t.AbstractActivityC0820i, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        try {
            Bundle metaData = getMetaData();
            if (metaData != null && (i = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        if (getBackgroundMode() == EnumC0493l.f6584m) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        FrameLayout frameLayoutProvideRootLayout = provideRootLayout(this);
        int i5 = FRAGMENT_CONTAINER_ID;
        frameLayoutProvideRootLayout.setId(i5);
        frameLayoutProvideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayoutProvideRootLayout);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            androidx.fragment.app.L supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0234a c0234a = new C0234a(supportFragmentManager);
            c0234a.b(i5, this.flutterFragment, TAG_FLUTTER_FRAGMENT);
            c0234a.d();
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onNewIntent(Intent intent) {
        r rVar = this.flutterFragment;
        if (rVar.r("onNewIntent")) {
            rVar.f6608g0.j(intent);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0255w, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        r rVar = this.flutterFragment;
        if (rVar.r("onPostResume")) {
            C0492k c0492k = rVar.f6608g0;
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

    @Override // androidx.fragment.app.AbstractActivityC0255w, androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        r rVar = this.flutterFragment;
        if (rVar.r("onRequestPermissionsResult")) {
            rVar.f6608g0.k(i, strArr, iArr);
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        this.flutterFragment.onTrimMemory(i);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        r rVar = this.flutterFragment;
        if (rVar.r("onUserLeaveHint")) {
            rVar.f6608g0.q();
        }
    }

    public FrameLayout provideRootLayout(Context context) {
        return new FrameLayout(context);
    }

    public r retrieveExistingFlutterFragmentIfPossible() {
        return (r) getSupportFragmentManager().C(TAG_FLUTTER_FRAGMENT);
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public abstract boolean shouldDestroyEngineWithHost();

    public abstract boolean shouldHandleDeeplinking();

    @Override // io.flutter.embedding.android.InterfaceC0494m
    public void cleanUpFlutterEngine(C0394c c0394c) {
    }
}
