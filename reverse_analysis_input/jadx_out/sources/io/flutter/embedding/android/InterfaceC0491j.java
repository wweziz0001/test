package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC0274p;
import e3.C0394c;
import java.util.List;
import r3.C0782a;

/* JADX INFO: renamed from: io.flutter.embedding.android.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0491j extends InterfaceC0495n, InterfaceC0494m {
    boolean attachToEngineAutomatically();

    void cleanUpFlutterEngine(C0394c c0394c);

    void configureFlutterEngine(C0394c c0394c);

    void detachFromFlutterEngine();

    Activity getActivity();

    String getAppBundlePath();

    boolean getBackCallbackState();

    String getCachedEngineGroupId();

    String getCachedEngineId();

    Context getContext();

    List getDartEntrypointArgs();

    String getDartEntrypointFunctionName();

    String getDartEntrypointLibraryUri();

    e3.k getFlutterShellArgs();

    String getInitialRoute();

    AbstractC0274p getLifecycle();

    S getRenderMode();

    W getTransparencyMode();

    void onFlutterSurfaceViewCreated(y yVar);

    void onFlutterTextureViewCreated(A a5);

    void onFlutterUiDisplayed();

    void onFlutterUiNoLongerDisplayed();

    boolean popSystemNavigator();

    @Override // io.flutter.embedding.android.InterfaceC0495n
    C0394c provideFlutterEngine(Context context);

    io.flutter.plugin.platform.f providePlatformPlugin(Activity activity, C0394c c0394c);

    C0782a provideSensitiveContentPlugin(Activity activity, C0394c c0394c);

    void setFrameworkHandlesBack(boolean z4);

    boolean shouldAttachEngineToActivity();

    boolean shouldDestroyEngineWithHost();

    boolean shouldDispatchAppLifecycleState();

    boolean shouldHandleDeeplinking();

    boolean shouldRestoreAndSaveState();
}
