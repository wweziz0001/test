.class public abstract synthetic Lcom/dexterous/flutterlocalnotifications/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/window/BackEvent;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/window/BackEvent;->getTouchX()F

    move-result p0

    return p0
.end method

.method public static bridge synthetic b(Landroid/window/BackEvent;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/window/BackEvent;->getSwipeEdge()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic c(Landroid/app/NotificationManager;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/NotificationManager;->canUseFullScreenIntent()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic d(Landroid/view/inputmethod/InputMethodManager;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/inputmethod/InputMethodManager;->isStylusHandwritingAvailable()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic e(Landroid/window/BackEvent;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/window/BackEvent;->getTouchY()F

    move-result p0

    return p0
.end method

.method public static bridge synthetic f(Landroid/window/BackEvent;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/window/BackEvent;->getProgress()F

    move-result p0

    return p0
.end method
