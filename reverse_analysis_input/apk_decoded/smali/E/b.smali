.class public abstract synthetic LE/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b()Landroid/content/pm/PackageManager$ApplicationInfoFlags;
    .locals 2

    .line 1
    const-wide/16 v0, 0x80

    invoke-static {v0, v1}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic c()Landroid/content/pm/PackageManager$ResolveInfoFlags;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Landroid/content/pm/PackageManager$ResolveInfoFlags;->of(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic d(Landroid/media/Image;)Landroid/hardware/SyncFence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Image;->getFence()Landroid/hardware/SyncFence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(II)Landroid/media/ImageReader$Builder;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/ImageReader$Builder;

    invoke-direct {v0, p0, p1}, Landroid/media/ImageReader$Builder;-><init>(II)V

    return-object v0
.end method

.method public static bridge synthetic f(Landroid/media/ImageReader$Builder;)Landroid/media/ImageReader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/ImageReader$Builder;->build()Landroid/media/ImageReader;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    .locals 1

    .line 1
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SHOW_TEXT_SUGGESTIONS:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    return-object v0
.end method

.method public static bridge synthetic h(Lio/flutter/embedding/android/g;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Landroid/content/Intent;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "android.intent.extra.CHOSEN_COMPONENT"

    const-class v1, Landroid/content/ComponentName;

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getAudioDevicesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()V
    .locals 1

    .line 1
    new-instance v0, Landroid/media/ImageReader$Builder;

    return-void
.end method

.method public static bridge synthetic m(Landroid/hardware/SyncFence;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/hardware/SyncFence;->awaitForever()Z

    return-void
.end method

.method public static bridge synthetic n(Landroid/media/ImageReader$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Landroid/media/ImageReader$Builder;->setMaxImages(I)Landroid/media/ImageReader$Builder;

    return-void
.end method

.method public static bridge synthetic o(Landroid/view/SurfaceControl$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/SurfaceControl$Builder;->setHidden(Z)Landroid/view/SurfaceControl$Builder;

    return-void
.end method

.method public static bridge synthetic p(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAutoHandwritingEnabled(Z)V

    return-void
.end method

.method public static bridge synthetic q(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/InputMethodManager;->startStylusHandwriting(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic r(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public static bridge synthetic s(Landroid/content/Intent;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "notification"

    const-class v1, Landroid/app/Notification;

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic t(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getDirectProfilesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic u(Landroid/media/ImageReader$Builder;)V
    .locals 1

    .line 1
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Landroid/media/ImageReader$Builder;->setImageFormat(I)Landroid/media/ImageReader$Builder;

    return-void
.end method

.method public static bridge synthetic v(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public static bridge synthetic w(Landroid/media/ImageReader$Builder;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x100

    invoke-virtual {p0, v0, v1}, Landroid/media/ImageReader$Builder;->setUsage(J)Landroid/media/ImageReader$Builder;

    return-void
.end method

.method public static bridge synthetic x(Landroid/media/ImageReader$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/media/ImageReader$Builder;->setMaxImages(I)Landroid/media/ImageReader$Builder;

    return-void
.end method
