.class Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;
.implements Lcom/ryanheise/audioservice/AudioService$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioServicePlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioHandlerInterface"
.end annotation


# static fields
.field private static final SILENCE_SAMPLE_RATE:I = 0xac44


# instance fields
.field public channel:Ln3/q;

.field private final handler:Landroid/os/Handler;

.field public messenger:Ln3/f;

.field private methodInvocationQueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;",
            ">;"
        }
    .end annotation
.end field

.field private silenceAudioTrack:Landroid/media/AudioTrack;


# direct methods
.method public constructor <init>(Ln3/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->handler:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->methodInvocationQueue:Ljava/util/List;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->messenger:Ln3/f;

    .line 23
    .line 24
    new-instance v0, Ln3/q;

    .line 25
    .line 26
    const-string v1, "com.ryanheise.audio_service.handler.methods"

    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->channel:Ln3/q;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ln3/q;->b(Ln3/o;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public static synthetic a(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$2(Ljava/util/Map;Ln3/p;)V

    return-void
.end method

.method public static synthetic b(Ln3/p;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$4(Ln3/p;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic c(Ln3/p;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$0(Ln3/p;)V

    return-void
.end method

.method public static synthetic d(Ln3/p;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$1(Ln3/p;Ljava/lang/Exception;)V

    return-void
.end method

.method private destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->silenceAudioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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

.method public static synthetic e(Ln3/p;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$3(Ln3/p;)V

    return-void
.end method

.method public static synthetic f(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->lambda$onMethodCall$5(Ljava/util/Map;Ln3/p;)V

    return-void
.end method

.method public static bridge synthetic g(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->destroy()V

    return-void
.end method

.method private static synthetic lambda$onMethodCall$0(Ln3/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method private static synthetic lambda$onMethodCall$1(Ln3/p;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "Unexpected error"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "UNEXPECTED_ERROR"

    .line 8
    .line 9
    invoke-interface {p0, v1, v0, p1}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method private synthetic lambda$onMethodCall$2(Ljava/util/Map;Ln3/p;)V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "mediaItem"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->q(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioService;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->handler:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Lcom/ryanheise/audioservice/c;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p2, v1}, Lcom/ryanheise/audioservice/c;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->handler:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v1, Lcom/ryanheise/audioservice/d;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p2, p1, v2}, Lcom/ryanheise/audioservice/d;-><init>(Ln3/p;Ljava/lang/Exception;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method private static synthetic lambda$onMethodCall$3(Ln3/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method private static synthetic lambda$onMethodCall$4(Ln3/p;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "Unexpected error"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "UNEXPECTED_ERROR"

    .line 8
    .line 9
    invoke-interface {p0, v1, v0, p1}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method private synthetic lambda$onMethodCall$5(Ljava/util/Map;Ln3/p;)V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "queue"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->t(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioService;->setQueue(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->handler:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Lcom/ryanheise/audioservice/c;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p2, v1}, Lcom/ryanheise/audioservice/c;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->handler:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v1, Lcom/ryanheise/audioservice/d;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p2, p1, v2}, Lcom/ryanheise/audioservice/d;-><init>(Ln3/p;Ljava/lang/Exception;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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


# virtual methods
.method public invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    return-void
.end method

.method public invokeMethod(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V
    .locals 2

    .line 2
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->channel:Ln3/q;

    invoke-virtual {v0, p1, p2, p3}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->methodInvocationQueue:Ljava/util/List;

    new-instance v1, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;

    invoke-direct {v1, p1, p2, p3}, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;-><init>(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public invokePendingMethods()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->methodInvocationQueue:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->channel:Ln3/q;

    .line 20
    .line 21
    iget-object v3, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;->method:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;->arg:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;->result:Ln3/p;

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4, v1}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->methodInvocationQueue:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public onAddQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 1

    .line 1
    const-string v0, "mediaItem"

    .line 2
    .line 3
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->r(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "addQueueItem"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onAddQueueItemAt(Landroid/support/v4/media/MediaMetadataCompat;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->r(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "mediaItem"

    .line 10
    .line 11
    const-string v1, "index"

    .line 12
    .line 13
    filled-new-array {v0, p1, v1, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "insertQueueItem"

    .line 22
    .line 23
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onAdjustVolume(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "direction"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "androidAdjustRemoteVolume"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onClick(Lcom/ryanheise/audioservice/MediaButton;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "button"

    .line 10
    .line 11
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "click"

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onClose()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "onNotificationDeleted"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "name"

    .line 8
    .line 9
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "customAction"

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->disposeFlutterEngine()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public onFastForward()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "fastForward"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/u;Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "parentMediaId"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string p1, "options"

    .line 18
    .line 19
    invoke-static {p3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p3, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$1;

    .line 31
    .line 32
    invoke-direct {p3, p0, p2}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$1;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Landroidx/media/u;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "getChildren"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0, p3}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p2}, Landroidx/media/u;->a()V

    .line 41
    .line 42
    .line 43
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
.end method

.method public onLoadItem(Ljava/lang/String;Landroidx/media/u;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "mediaId"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$2;

    .line 22
    .line 23
    invoke-direct {v1, p0, p2}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$2;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Landroidx/media/u;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "getMediaItem"

    .line 27
    .line 28
    invoke-virtual {p1, v2, v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p2}, Landroidx/media/u;->a()V

    .line 32
    .line 33
    .line 34
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onMethodCall(Ln3/n;Ln3/p;)V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "updateTime"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    iget-object v5, v0, Ln3/n;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v5, Ljava/util/Map;

    .line 13
    .line 14
    iget-object v0, v0, Ln3/n;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    sparse-switch v6, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v6, "notifyChildrenChanged"

    .line 27
    .line 28
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :sswitch_1
    const-string v6, "setState"

    .line 40
    .line 41
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    goto :goto_1

    .line 49
    :sswitch_2
    const-string v6, "setQueue"

    .line 50
    .line 51
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    move v0, v9

    .line 58
    goto :goto_1

    .line 59
    :sswitch_3
    const-string v6, "stopService"

    .line 60
    .line 61
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const/4 v0, 0x6

    .line 68
    goto :goto_1

    .line 69
    :sswitch_4
    const-string v6, "setAndroidPlaybackInfo"

    .line 70
    .line 71
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    goto :goto_1

    .line 79
    :sswitch_5
    const-string v6, "androidForceEnableMediaButtons"

    .line 80
    .line 81
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    const/4 v0, 0x5

    .line 88
    goto :goto_1

    .line 89
    :sswitch_6
    const-string v6, "setMediaItem"

    .line 90
    .line 91
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    move v0, v8

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    :goto_0
    const/4 v0, -0x1

    .line 100
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    goto/16 :goto_8

    .line 104
    .line 105
    :pswitch_0
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 106
    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/ryanheise/audioservice/AudioService;->stop()V

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-interface {v2, v4}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :pswitch_1
    iget-object v0, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->silenceAudioTrack:Landroid/media/AudioTrack;

    .line 118
    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    const/16 v0, 0x800

    .line 122
    .line 123
    new-array v3, v0, [B

    .line 124
    .line 125
    new-instance v5, Landroid/media/AudioTrack;

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    const/4 v10, 0x3

    .line 129
    const v11, 0xac44

    .line 130
    .line 131
    .line 132
    const/4 v12, 0x2

    .line 133
    const/4 v13, 0x3

    .line 134
    move-object v9, v5

    .line 135
    move v14, v0

    .line 136
    invoke-direct/range {v9 .. v15}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 137
    .line 138
    .line 139
    iput-object v5, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->silenceAudioTrack:Landroid/media/AudioTrack;

    .line 140
    .line 141
    invoke-virtual {v5, v3, v8, v0}, Landroid/media/AudioTrack;->write([BII)I

    .line 142
    .line 143
    .line 144
    :cond_2
    iget-object v0, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->silenceAudioTrack:Landroid/media/AudioTrack;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/media/AudioTrack;->reloadStaticData()I

    .line 147
    .line 148
    .line 149
    iget-object v0, v1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->silenceAudioTrack:Landroid/media/AudioTrack;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v2, v4}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :pswitch_2
    const-string v0, "parentMediaId"

    .line 160
    .line 161
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    const-string v3, "options"

    .line 168
    .line 169
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Ljava/util/Map;

    .line 174
    .line 175
    sget-object v5, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 176
    .line 177
    invoke-static {v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapToBundle(Ljava/util/Map;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v5, v0, v3}, Landroidx/media/A;->notifyChildrenChanged(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v2, v4}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_8

    .line 188
    .line 189
    :pswitch_3
    const-string v0, "playbackInfo"

    .line 190
    .line 191
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Ljava/util/Map;

    .line 196
    .line 197
    const-string v3, "playbackType"

    .line 198
    .line 199
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    const-string v5, "volumeControlType"

    .line 210
    .line 211
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    check-cast v5, Ljava/lang/Integer;

    .line 216
    .line 217
    const-string v6, "maxVolume"

    .line 218
    .line 219
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Ljava/lang/Integer;

    .line 224
    .line 225
    const-string v7, "volume"

    .line 226
    .line 227
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/lang/Integer;

    .line 232
    .line 233
    sget-object v7, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 234
    .line 235
    invoke-virtual {v7, v3, v5, v6, v0}, Lcom/ryanheise/audioservice/AudioService;->setPlaybackInfo(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v4}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_8

    .line 242
    .line 243
    :pswitch_4
    const-string v0, "state"

    .line 244
    .line 245
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Ljava/util/Map;

    .line 250
    .line 251
    invoke-static {}, Lcom/ryanheise/audioservice/AudioProcessingState;->values()[Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    const-string v6, "processingState"

    .line 256
    .line 257
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    aget-object v15, v5, v6

    .line 268
    .line 269
    const-string v5, "playing"

    .line 270
    .line 271
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    check-cast v5, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v16

    .line 281
    const-string v5, "controls"

    .line 282
    .line 283
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    check-cast v5, Ljava/util/List;

    .line 288
    .line 289
    const-string v6, "androidCompactActionIndices"

    .line 290
    .line 291
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Ljava/util/List;

    .line 296
    .line 297
    const-string v10, "systemActions"

    .line 298
    .line 299
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    check-cast v10, Ljava/util/List;

    .line 304
    .line 305
    const-string v11, "updatePosition"

    .line 306
    .line 307
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    invoke-static {v11}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 316
    .line 317
    .line 318
    move-result-wide v17

    .line 319
    const-string v11, "bufferedPosition"

    .line 320
    .line 321
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    invoke-static {v11}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 330
    .line 331
    .line 332
    move-result-wide v19

    .line 333
    const-string v11, "speed"

    .line 334
    .line 335
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    check-cast v11, Ljava/lang/Double;

    .line 340
    .line 341
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 342
    .line 343
    .line 344
    move-result-wide v11

    .line 345
    double-to-float v14, v11

    .line 346
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    if-nez v11, :cond_3

    .line 351
    .line 352
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 353
    .line 354
    .line 355
    move-result-wide v11

    .line 356
    goto :goto_2

    .line 357
    :cond_3
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-static {v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v11

    .line 369
    :goto_2
    const-string v3, "errorCode"

    .line 370
    .line 371
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    move-object/from16 v24, v3

    .line 376
    .line 377
    check-cast v24, Ljava/lang/Integer;

    .line 378
    .line 379
    const-string v3, "errorMessage"

    .line 380
    .line 381
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    move-object/from16 v25, v3

    .line 386
    .line 387
    check-cast v25, Ljava/lang/String;

    .line 388
    .line 389
    const-string v3, "repeatMode"

    .line 390
    .line 391
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    check-cast v3, Ljava/lang/Integer;

    .line 396
    .line 397
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v26

    .line 401
    const-string v3, "shuffleMode"

    .line 402
    .line 403
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Ljava/lang/Integer;

    .line 408
    .line 409
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result v27

    .line 413
    const-string v3, "queueIndex"

    .line 414
    .line 415
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 420
    .line 421
    .line 422
    move-result-object v29

    .line 423
    const-string v3, "captioningEnabled"

    .line 424
    .line 425
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, Ljava/lang/Boolean;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 432
    .line 433
    .line 434
    move-result v28

    .line 435
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->e()J

    .line 436
    .line 437
    .line 438
    move-result-wide v21

    .line 439
    sub-long v22, v11, v21

    .line 440
    .line 441
    new-instance v11, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-wide/16 v12, 0x0

    .line 451
    .line 452
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_5

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    check-cast v3, Ljava/util/Map;

    .line 463
    .line 464
    const-string v5, "androidIcon"

    .line 465
    .line 466
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    move-object/from16 v31, v5

    .line 471
    .line 472
    check-cast v31, Ljava/lang/String;

    .line 473
    .line 474
    const-string v5, "label"

    .line 475
    .line 476
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    move-object/from16 v32, v5

    .line 481
    .line 482
    check-cast v32, Ljava/lang/String;

    .line 483
    .line 484
    const-string v5, "action"

    .line 485
    .line 486
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    check-cast v5, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    shl-int v5, v9, v5

    .line 497
    .line 498
    int-to-long v4, v5

    .line 499
    or-long/2addr v12, v4

    .line 500
    const-string v8, "customAction"

    .line 501
    .line 502
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    check-cast v3, Ljava/util/Map;

    .line 507
    .line 508
    if-eqz v3, :cond_4

    .line 509
    .line 510
    const-string v8, "name"

    .line 511
    .line 512
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    check-cast v8, Ljava/lang/String;

    .line 517
    .line 518
    const-string v7, "extras"

    .line 519
    .line 520
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Ljava/util/Map;

    .line 525
    .line 526
    new-instance v7, Lcom/ryanheise/audioservice/CustomMediaAction;

    .line 527
    .line 528
    invoke-direct {v7, v8, v3}, Lcom/ryanheise/audioservice/CustomMediaAction;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 529
    .line 530
    .line 531
    move-object/from16 v35, v7

    .line 532
    .line 533
    goto :goto_4

    .line 534
    :cond_4
    const/16 v35, 0x0

    .line 535
    .line 536
    :goto_4
    new-instance v3, Lcom/ryanheise/audioservice/MediaControl;

    .line 537
    .line 538
    move-object/from16 v30, v3

    .line 539
    .line 540
    move-wide/from16 v33, v4

    .line 541
    .line 542
    invoke-direct/range {v30 .. v35}, Lcom/ryanheise/audioservice/MediaControl;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/ryanheise/audioservice/CustomMediaAction;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    const/4 v4, 0x0

    .line 549
    const/4 v8, 0x0

    .line 550
    goto :goto_3

    .line 551
    :cond_5
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-eqz v3, :cond_6

    .line 560
    .line 561
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    check-cast v3, Ljava/lang/Integer;

    .line 566
    .line 567
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    shl-int v3, v9, v3

    .line 572
    .line 573
    int-to-long v3, v3

    .line 574
    or-long/2addr v12, v3

    .line 575
    goto :goto_5

    .line 576
    :cond_6
    if-eqz v6, :cond_7

    .line 577
    .line 578
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    const/4 v3, 0x3

    .line 583
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    new-array v3, v0, [I

    .line 588
    .line 589
    const/4 v8, 0x0

    .line 590
    :goto_6
    if-ge v8, v0, :cond_8

    .line 591
    .line 592
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    check-cast v4, Ljava/lang/Integer;

    .line 597
    .line 598
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    aput v4, v3, v8

    .line 603
    .line 604
    add-int/lit8 v8, v8, 0x1

    .line 605
    .line 606
    goto :goto_6

    .line 607
    :cond_7
    const/4 v3, 0x0

    .line 608
    :cond_8
    sget-object v10, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 609
    .line 610
    move v0, v14

    .line 611
    move-object v14, v3

    .line 612
    move/from16 v21, v0

    .line 613
    .line 614
    invoke-virtual/range {v10 .. v29}, Lcom/ryanheise/audioservice/AudioService;->setState(Ljava/util/List;J[ILcom/ryanheise/audioservice/AudioProcessingState;ZJJFJLjava/lang/Integer;Ljava/lang/String;IIZLjava/lang/Long;)V

    .line 615
    .line 616
    .line 617
    const/4 v3, 0x0

    .line 618
    invoke-interface {v2, v3}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    goto :goto_8

    .line 622
    :pswitch_5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    new-instance v3, Lcom/ryanheise/audioservice/b;

    .line 627
    .line 628
    const/4 v4, 0x1

    .line 629
    invoke-direct {v3, v1, v5, v2, v4}, Lcom/ryanheise/audioservice/b;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;I)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 633
    .line 634
    .line 635
    goto :goto_8

    .line 636
    :pswitch_6
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    new-instance v3, Lcom/ryanheise/audioservice/b;

    .line 641
    .line 642
    const/4 v4, 0x0

    .line 643
    invoke-direct {v3, v1, v5, v2, v4}, Lcom/ryanheise/audioservice/b;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;I)V

    .line 644
    .line 645
    .line 646
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 647
    .line 648
    .line 649
    goto :goto_8

    .line 650
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    const/4 v3, 0x0

    .line 658
    invoke-interface {v2, v0, v3, v3}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :goto_8
    return-void

    .line 662
    nop

    .line 663
    :sswitch_data_0
    .sparse-switch
        -0x24af012b -> :sswitch_6
        -0x325d04 -> :sswitch_5
        0x1fdd21b6 -> :sswitch_4
        0x29afb053 -> :sswitch_3
        0x539ad9cf -> :sswitch_2
        0x53b6854f -> :sswitch_1
        0x67d5352c -> :sswitch_0
    .end sparse-switch

    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method

.method public onPause()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "pause"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onPlay()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "play"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "mediaId"

    .line 8
    .line 9
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "playFromMediaId"

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "query"

    .line 8
    .line 9
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "playFromSearch"

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "extras"

    .line 6
    .line 7
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v1, "uri"

    .line 12
    .line 13
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "playFromUri"

    .line 22
    .line 23
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onPlayMediaItem(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 1

    .line 1
    const-string v0, "mediaItem"

    .line 2
    .line 3
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->r(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "playMediaItem"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onPrepare()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "prepare"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "mediaId"

    .line 8
    .line 9
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "prepareFromMediaId"

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "extras"

    .line 2
    .line 3
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "query"

    .line 8
    .line 9
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "prepareFromSearch"

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "extras"

    .line 6
    .line 7
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v1, "uri"

    .line 12
    .line 13
    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "prepareFromUri"

    .line 22
    .line 23
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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

.method public onRemoveQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 1

    .line 1
    const-string v0, "mediaItem"

    .line 2
    .line 3
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->r(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "removeQueueItem"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onRemoveQueueItemAt(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "index"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "removeQueueItemAt"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onRewind()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "rewind"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/u;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "query"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string p1, "extras"

    .line 18
    .line 19
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$3;

    .line 31
    .line 32
    invoke-direct {p2, p0, p3}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface$3;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Landroidx/media/u;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "search"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0, p2}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p3}, Landroidx/media/u;->a()V

    .line 41
    .line 42
    .line 43
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
.end method

.method public onSeekTo(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    mul-long/2addr p1, v0

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "position"

    .line 9
    .line 10
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "seek"

    .line 19
    .line 20
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public onSetCaptioningEnabled(Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "enabled"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "setCaptioningEnabled"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onSetPlaybackSpeed(F)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "speed"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "setSpeed"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onSetRating(Landroid/support/v4/media/RatingCompat;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->s(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "extras"

    const/4 v1, 0x0

    const-string v2, "rating"

    filled-new-array {v2, p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setRating"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 2

    .line 3
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->s(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "extras"

    .line 4
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const-string v1, "rating"

    filled-new-array {v1, p1, v0, p2}, [Ljava/lang/Object;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "setRating"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onSetRepeatMode(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "repeatMode"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "setRepeatMode"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onSetShuffleMode(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "shuffleMode"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "setShuffleMode"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onSetVolumeTo(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "volumeIndex"

    .line 6
    .line 7
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "androidSetRemoteVolume"

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onSkipToNext()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "skipToNext"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onSkipToPrevious()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "skipToPrevious"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onSkipToQueueItem(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "index"

    .line 6
    .line 7
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "skipToQueueItem"

    .line 16
    .line 17
    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public onStop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "stop"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onTaskRemoved()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "onTaskRemoved"

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public switchToMessenger(Ln3/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->channel:Ln3/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ln3/q;->b(Ln3/o;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->messenger:Ln3/f;

    .line 8
    .line 9
    new-instance v0, Ln3/q;

    .line 10
    .line 11
    const-string v1, "com.ryanheise.audio_service.handler.methods"

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->channel:Ln3/q;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ln3/q;->b(Ln3/o;)V

    .line 19
    .line 20
    .line 21
    return-void
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
