.class public interface abstract Lio/flutter/embedding/android/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/android/n;
.implements Lio/flutter/embedding/android/m;


# virtual methods
.method public abstract attachToEngineAutomatically()Z
.end method

.method public abstract cleanUpFlutterEngine(Le3/c;)V
.end method

.method public abstract configureFlutterEngine(Le3/c;)V
.end method

.method public abstract detachFromFlutterEngine()V
.end method

.method public abstract getActivity()Landroid/app/Activity;
.end method

.method public abstract getAppBundlePath()Ljava/lang/String;
.end method

.method public abstract getBackCallbackState()Z
.end method

.method public abstract getCachedEngineGroupId()Ljava/lang/String;
.end method

.method public abstract getCachedEngineId()Ljava/lang/String;
.end method

.method public abstract getContext()Landroid/content/Context;
.end method

.method public abstract getDartEntrypointArgs()Ljava/util/List;
.end method

.method public abstract getDartEntrypointFunctionName()Ljava/lang/String;
.end method

.method public abstract getDartEntrypointLibraryUri()Ljava/lang/String;
.end method

.method public abstract getFlutterShellArgs()Le3/k;
.end method

.method public abstract getInitialRoute()Ljava/lang/String;
.end method

.method public abstract getLifecycle()Landroidx/lifecycle/p;
.end method

.method public abstract getRenderMode()Lio/flutter/embedding/android/S;
.end method

.method public abstract getTransparencyMode()Lio/flutter/embedding/android/W;
.end method

.method public abstract onFlutterSurfaceViewCreated(Lio/flutter/embedding/android/y;)V
.end method

.method public abstract onFlutterTextureViewCreated(Lio/flutter/embedding/android/A;)V
.end method

.method public abstract onFlutterUiDisplayed()V
.end method

.method public abstract onFlutterUiNoLongerDisplayed()V
.end method

.method public abstract popSystemNavigator()Z
.end method

.method public abstract provideFlutterEngine(Landroid/content/Context;)Le3/c;
.end method

.method public abstract providePlatformPlugin(Landroid/app/Activity;Le3/c;)Lio/flutter/plugin/platform/f;
.end method

.method public abstract provideSensitiveContentPlugin(Landroid/app/Activity;Le3/c;)Lr3/a;
.end method

.method public abstract setFrameworkHandlesBack(Z)V
.end method

.method public abstract shouldAttachEngineToActivity()Z
.end method

.method public abstract shouldDestroyEngineWithHost()Z
.end method

.method public abstract shouldDispatchAppLifecycleState()Z
.end method

.method public abstract shouldHandleDeeplinking()Z
.end method

.method public abstract shouldRestoreAndSaveState()Z
.end method
