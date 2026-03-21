.class public final Lio/flutter/view/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Lio/flutter/view/r;

.field public static f:LD0/t;


# instance fields
.field public a:J

.field public final b:Lio/flutter/embedding/engine/FlutterJNI;

.field public c:Lio/flutter/view/q;

.field public final d:Lio/flutter/view/a;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lio/flutter/view/r;->a:J

    .line 7
    .line 8
    new-instance v0, Lio/flutter/view/q;

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    invoke-direct {v0, p0, v1, v2}, Lio/flutter/view/q;-><init>(Lio/flutter/view/r;J)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/flutter/view/r;->c:Lio/flutter/view/q;

    .line 16
    .line 17
    new-instance v0, Lio/flutter/view/a;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lio/flutter/view/a;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lio/flutter/view/r;->d:Lio/flutter/view/a;

    .line 23
    .line 24
    iput-object p1, p0, Lio/flutter/view/r;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 25
    .line 26
    return-void
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
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static a(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/r;
    .locals 5

    .line 1
    sget-object v0, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/flutter/view/r;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lio/flutter/view/r;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lio/flutter/view/r;->f:LD0/t;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, LD0/t;

    .line 17
    .line 18
    sget-object v1, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v0, v1, p0, v2}, LD0/t;-><init>(Ljava/lang/Object;Landroid/hardware/display/DisplayManager;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lio/flutter/view/r;->f:LD0/t;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object v0, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 34
    .line 35
    iget-wide v0, v0, Lio/flutter/view/r;->a:J

    .line 36
    .line 37
    const-wide/16 v2, -0x1

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/view/Display;->getRefreshRate()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    sget-object v0, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 53
    .line 54
    const-wide v1, 0x41cdcd6500000000L    # 1.0E9

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    float-to-double v3, p0

    .line 60
    div-double/2addr v1, v3

    .line 61
    double-to-long v1, v1

    .line 62
    iput-wide v1, v0, Lio/flutter/view/r;->a:J

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lio/flutter/embedding/engine/FlutterJNI;->setRefreshRateFPS(F)V

    .line 65
    .line 66
    .line 67
    :cond_2
    sget-object p0, Lio/flutter/view/r;->e:Lio/flutter/view/r;

    .line 68
    .line 69
    return-object p0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
