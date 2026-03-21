.class public final Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/G;


# instance fields
.field public final a:Ljavax/net/SocketFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;->a:Ljavax/net/SocketFactory;

    .line 9
    .line 10
    return-void
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
.method public final a(La0/A;)Lx0/J;
    .locals 3

    .line 1
    iget-object v0, p1, La0/A;->b:La0/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lt0/t;

    .line 7
    .line 8
    new-instance v1, Lp1/b;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lp1/b;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;->a:Ljavax/net/SocketFactory;

    .line 16
    .line 17
    invoke-direct {v0, p1, v1, v2}, Lt0/t;-><init>(La0/A;Lp1/b;Ljavax/net/SocketFactory;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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
