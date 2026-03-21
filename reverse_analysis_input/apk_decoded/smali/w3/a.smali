.class public final Lw3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/g;


# instance fields
.field public final synthetic l:I

.field public final m:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh0/s;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lw3/a;->l:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lw3/a;->m:Landroid/view/View;

    .line 3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne p1, v1, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    new-instance v0, Lio/flutter/embedding/android/x;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lio/flutter/embedding/android/x;-><init>(Ljava/lang/Object;I)V

    .line 5
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    const/4 v2, 0x1

    if-gt p1, v1, :cond_1

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    .line 7
    :cond_1
    check-cast p2, Lh0/G;

    .line 8
    invoke-virtual {p2}, Lh0/G;->d0()V

    .line 9
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 10
    invoke-virtual {p2}, Lh0/G;->d0()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 11
    invoke-virtual {p2}, Lh0/G;->d0()V

    .line 12
    invoke-virtual {p2}, Lh0/G;->N()V

    .line 13
    invoke-virtual {p2, v0}, Lh0/G;->V(Landroid/view/Surface;)V

    .line 14
    invoke-virtual {p2, v1, v1}, Lh0/G;->J(II)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p2}, Lh0/G;->N()V

    .line 16
    iput-boolean v2, p2, Lh0/G;->Q:Z

    .line 17
    iput-object p1, p2, Lh0/G;->P:Landroid/view/SurfaceHolder;

    .line 18
    iget-object v2, p2, Lh0/G;->v:Lh0/D;

    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 19
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 20
    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 21
    invoke-virtual {p2, v2}, Lh0/G;->V(Landroid/view/Surface;)V

    .line 22
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lh0/G;->J(II)V

    goto :goto_0

    .line 24
    :cond_3
    invoke-virtual {p2, v0}, Lh0/G;->V(Landroid/view/Surface;)V

    .line 25
    invoke-virtual {p2, v1, v1}, Lh0/G;->J(II)V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw3/a;->l:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/a;->m:Landroid/view/View;

    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget v0, p0, Lw3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lw3/a;->m:Landroid/view/View;

    .line 8
    .line 9
    check-cast v0, Landroid/view/SurfaceView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 1
    iget v0, p0, Lw3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw3/a;->m:Landroid/view/View;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lw3/a;->m:Landroid/view/View;

    .line 10
    .line 11
    check-cast v0, Landroid/view/SurfaceView;

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method
