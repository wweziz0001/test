.class public abstract synthetic Landroidx/media/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPid()I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/String;I)Landroid/app/ActivityManager$TaskDescription;
    .locals 2

    .line 1
    new-instance v0, Landroid/app/ActivityManager$TaskDescription;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method

.method public static bridge synthetic c(Landroid/os/Parcelable;)Landroid/app/Person;
    .locals 0

    .line 1
    check-cast p0, Landroid/app/Person;

    return-object p0
.end method

.method public static bridge synthetic d(Landroid/graphics/ImageDecoder$Source;Le3/h;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f(Landroid/media/Image;)Landroid/hardware/HardwareBuffer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/Image;->getHardwareBuffer()Landroid/hardware/HardwareBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Landroid/view/DisplayCutout;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getBoundingRects()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Landroid/app/NotificationChannelGroup;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/NotificationChannelGroup;->setDescription(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Landroid/graphics/ImageDecoder;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    return-void
.end method

.method public static bridge synthetic m(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    return-void
.end method

.method public static bridge synthetic n(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static bridge synthetic o(Landroid/view/Window;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/Window;->setNavigationBarDividerColor(I)V

    return-void
.end method

.method public static bridge synthetic p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTooltipText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static bridge synthetic q(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getUid()I

    move-result p0

    return p0
.end method
