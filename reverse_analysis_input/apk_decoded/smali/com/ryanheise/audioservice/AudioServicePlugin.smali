.class public Lcom/ryanheise/audioservice/AudioServicePlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;
.implements Lk3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;,
        Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;,
        Lcom/ryanheise/audioservice/AudioServicePlugin$MethodInvocation;
    }
.end annotation


# static fields
.field private static final CHANNEL_CLIENT:Ljava/lang/String; = "com.ryanheise.audio_service.client.methods"

.field private static final CHANNEL_HANDLER:Ljava/lang/String; = "com.ryanheise.audio_service.handler.methods"

.field private static audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface; = null

.field private static final bootTime:J

.field private static final clientInterfaces:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;",
            ">;"
        }
    .end annotation
.end field

.field private static configureResult:Ln3/p; = null

.field private static final controllerCallback:Landroid/support/v4/media/session/g;

.field private static flutterEngineId:Ljava/lang/String; = "audio_service_engine"

.field private static flutterReady:Z

.field private static mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

.field private static mediaBrowser:Landroid/support/v4/media/g;

.field private static mediaController:Landroid/support/v4/media/session/l;


# instance fields
.field private activityPluginBinding:Lk3/b;

.field private applicationContext:Landroid/content/Context;

.field private clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

.field private final connectionCallback:Landroid/support/v4/media/d;

.field private flutterPluginBinding:Lj3/a;

.field private newIntentListener:Ln3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterfaces:Ljava/util/Set;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr v0, v2

    .line 17
    sput-wide v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->bootTime:J

    .line 18
    .line 19
    new-instance v0, Lcom/ryanheise/audioservice/AudioServicePlugin$1;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$1;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->controllerCallback:Landroid/support/v4/media/session/g;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/ryanheise/audioservice/AudioServicePlugin$2;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->connectionCallback:Landroid/support/v4/media/d;

    .line 10
    .line 11
    return-void
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

.method public static synthetic a(Lcom/ryanheise/audioservice/AudioServicePlugin;Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->lambda$registerOnNewIntentListener$0(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method private static addExtrasToMediaDescription(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaDescriptionCompat;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v8, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->r:Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v8, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapToBundle(Ljava/util/Map;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v8, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 30
    .line 31
    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->m:Ljava/lang/CharSequence;

    .line 34
    .line 35
    iget-object v4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->n:Ljava/lang/CharSequence;

    .line 36
    .line 37
    iget-object v5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->o:Ljava/lang/CharSequence;

    .line 38
    .line 39
    iget-object v6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->p:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object v7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->q:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v9, p0, Landroid/support/v4/media/MediaDescriptionCompat;->s:Landroid/net/Uri;

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    invoke-direct/range {v1 .. v9}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    :goto_0
    return-object p0
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

.method public static audioHandlerInterface()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;
    .locals 2

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 7
    .line 8
    const-string v1, "Background audio task not running"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
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

.method public static bridge synthetic b(Lcom/ryanheise/audioservice/AudioServicePlugin;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    return-object p0
.end method

.method public static bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-object v0
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

.method public static bridge synthetic c(Lcom/ryanheise/audioservice/AudioServicePlugin;)Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    return-object p0
.end method

.method private connect()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/support/v4/media/g;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    .line 8
    .line 9
    new-instance v2, Landroid/content/ComponentName;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    .line 12
    .line 13
    const-class v4, Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->connectionCallback:Landroid/support/v4/media/d;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/media/g;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/d;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 24
    .line 25
    const-string v1, "MediaBrowserCompat"

    .line 26
    .line 27
    const-string v2, "Connecting to a MediaBrowserService."

    .line 28
    .line 29
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Landroid/support/v4/media/g;->a:Landroid/support/v4/media/e;

    .line 33
    .line 34
    iget-object v0, v0, Landroid/support/v4/media/e;->b:Landroid/media/browse/MediaBrowser;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
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

.method private static createMediaMetadata(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaMetadataCompat;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "title"

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "album"

    .line 20
    .line 21
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "artist"

    .line 28
    .line 29
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "genre"

    .line 36
    .line 37
    invoke-interface {p0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/lang/String;

    .line 42
    .line 43
    const-string v6, "duration"

    .line 44
    .line 45
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-string v7, "artUri"

    .line 54
    .line 55
    invoke-interface {p0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljava/lang/String;

    .line 60
    .line 61
    const-string v8, "playable"

    .line 62
    .line 63
    invoke-interface {p0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    check-cast v8, Ljava/lang/Boolean;

    .line 68
    .line 69
    const-string v9, "displayTitle"

    .line 70
    .line 71
    invoke-interface {p0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Ljava/lang/String;

    .line 76
    .line 77
    const-string v10, "displaySubtitle"

    .line 78
    .line 79
    invoke-interface {p0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    check-cast v10, Ljava/lang/String;

    .line 84
    .line 85
    const-string v11, "displayDescription"

    .line 86
    .line 87
    invoke-interface {p0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    check-cast v11, Ljava/lang/String;

    .line 92
    .line 93
    const-string v12, "rating"

    .line 94
    .line 95
    invoke-interface {p0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    check-cast v12, Ljava/util/Map;

    .line 100
    .line 101
    invoke-static {v12}, Lcom/ryanheise/audioservice/AudioServicePlugin;->raw2rating(Ljava/util/Map;)Landroid/support/v4/media/RatingCompat;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    const-string v13, "extras"

    .line 106
    .line 107
    invoke-interface {p0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    move-object v13, p0

    .line 112
    check-cast v13, Ljava/util/Map;

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v13}, Lcom/ryanheise/audioservice/AudioService;->createMediaMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/support/v4/media/RatingCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public static bridge synthetic d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    return-object v0
.end method

.method private disconnect()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v2, Landroid/content/Intent;

    .line 15
    .line 16
    const-string v3, "android.intent.action.MAIN"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->controllerCallback:Landroid/support/v4/media/session/g;

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    iget-object v3, v0, Landroid/support/v4/media/session/l;->c:Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    const-string v0, "MediaControllerCompat"

    .line 41
    .line 42
    const-string v2, "the callback has never been registered"

    .line 43
    .line 44
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :try_start_0
    iget-object v0, v0, Landroid/support/v4/media/session/l;->a:Landroid/support/v4/media/session/i;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/i;->b(Landroid/support/v4/media/session/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/g;->setHandler(Landroid/os/Handler;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    sput-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/g;->setHandler(Landroid/os/Handler;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v1, "callback must not be null"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_4
    :goto_2
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/support/v4/media/g;->a()V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 80
    .line 81
    :cond_5
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public static declared-synchronized disposeFlutterEngine()V
    .locals 4

    .line 1
    const-class v0, Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterfaces:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 21
    .line 22
    invoke-static {v2}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :try_start_1
    invoke-static {}, Le3/g;->a()Le3/g;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, v1, Le3/g;->a:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Le3/c;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Le3/c;->a()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Le3/g;->a()Le3/g;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v1, v2, v3}, Le3/g;->b(Ljava/lang/String;Le3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_2
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    throw v1
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
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public static bridge synthetic e()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->bootTime:J

    return-wide v0
.end method

.method public static bridge synthetic f()Ln3/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->configureResult:Ln3/p;

    return-object v0
.end method

.method public static bridge synthetic g()Landroid/support/v4/media/session/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->controllerCallback:Landroid/support/v4/media/session/g;

    return-object v0
.end method

.method public static declared-synchronized getFlutterEngine(Landroid/content/Context;)Le3/c;
    .locals 5

    .line 1
    const-class v0, Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Le3/g;->a()Le3/g;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, v1, Le3/g;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Le3/c;

    .line 17
    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    new-instance v1, Le3/c;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, v2}, Le3/c;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    instance-of v2, p0, Lio/flutter/embedding/android/g;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    check-cast p0, Lio/flutter/embedding/android/g;

    .line 35
    .line 36
    invoke-virtual {p0}, Lio/flutter/embedding/android/g;->getInitialRoute()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lio/flutter/embedding/android/g;->shouldHandleDeeplinking()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v2, "?"

    .line 87
    .line 88
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_1

    .line 105
    :cond_0
    instance-of v2, p0, Lcom/ryanheise/audioservice/AudioServiceFragmentActivity;

    .line 106
    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    check-cast p0, Lcom/ryanheise/audioservice/AudioServiceFragmentActivity;

    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioServiceFragmentActivity;->getInitialRoute()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_2

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioServiceFragmentActivity;->shouldHandleDeeplinking()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_2

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-eqz v4, :cond_2

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_2

    .line 152
    .line 153
    new-instance v4, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v2, "?"

    .line 162
    .line 163
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    goto :goto_0

    .line 178
    :cond_1
    move-object v2, v3

    .line 179
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 180
    .line 181
    const-string v2, "/"

    .line 182
    .line 183
    :cond_3
    iget-object p0, v1, Le3/c;->i:Lm3/a;

    .line 184
    .line 185
    iget-object p0, p0, Lm3/a;->a:Ln3/q;

    .line 186
    .line 187
    const-string v4, "setInitialRoute"

    .line 188
    .line 189
    invoke-virtual {p0, v4, v2, v3}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, v1, Le3/c;->c:Lf3/b;

    .line 193
    .line 194
    invoke-static {}, Lf3/a;->a()Lf3/a;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {p0, v2, v3}, Lf3/b;->b(Lf3/a;Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    invoke-static {}, Le3/g;->a()Le3/g;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p0, v2, v1}, Le3/g;->b(Ljava/lang/String;Le3/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    .line 209
    .line 210
    :cond_4
    monitor-exit v0

    .line 211
    return-object v1

    .line 212
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    throw p0
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public static getFlutterEngineId()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public static getInt(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p0, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-int p0, v0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Integer;

    .line 21
    .line 22
    :goto_1
    return-object p0
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

.method public static getLong(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v0, p0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 21
    .line 22
    :goto_1
    return-object p0
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

.method public static bridge synthetic h()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterReady:Z

    return v0
.end method

.method public static bridge synthetic i()Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    return-object v0
.end method

.method public static bridge synthetic j()Landroid/support/v4/media/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    return-object v0
.end method

.method public static bridge synthetic k()Landroid/support/v4/media/session/l;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    return-object v0
.end method

.method public static bridge synthetic l(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    return-void
.end method

.method private synthetic lambda$registerOnNewIntentListener$0(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->sendNotificationClicked()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
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

.method public static bridge synthetic m(Ln3/p;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->configureResult:Ln3/p;

    return-void
.end method

.method public static varargs mapOf([Ljava/lang/Object;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    aget-object v3, p0, v3

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
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

.method public static mapToBundle(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_6

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v4, v3, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    check-cast v3, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    check-cast v3, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    instance-of v4, v3, Ljava/lang/Double;

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    check-cast v3, Ljava/lang/Double;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 77
    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    check-cast v3, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    instance-of v4, v3, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    return-object v0
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static mediaItems2raw(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "**>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 21
    .line 22
    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->m:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 23
    .line 24
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaMetadata2raw(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
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

.method private static mediaMetadata2raw(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ")",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "id"

    .line 15
    .line 16
    iget-object v4, v1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string v3, "android.media.metadata.TITLE"

    .line 22
    .line 23
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "title"

    .line 28
    .line 29
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const-string v3, "android.media.metadata.ALBUM"

    .line 33
    .line 34
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "album"

    .line 39
    .line 40
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->q:Landroid/net/Uri;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v3, "artUri"

    .line 52
    .line 53
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string v1, "android.media.metadata.ARTIST"

    .line 57
    .line 58
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v3, "artist"

    .line 63
    .line 64
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const-string v1, "android.media.metadata.GENRE"

    .line 68
    .line 69
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v3, "genre"

    .line 74
    .line 75
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->l:Landroid/os/Bundle;

    .line 79
    .line 80
    const-string v3, "android.media.metadata.DURATION"

    .line 81
    .line 82
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const-wide/16 v5, 0x0

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v4, "duration"

    .line 99
    .line 100
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_2
    const-string v3, "playable_long"

    .line 104
    .line 105
    invoke-virtual {v1, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    cmp-long v3, v3, v5

    .line 110
    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    const/4 v3, 0x1

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const/4 v3, 0x0

    .line 116
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const-string v4, "playable"

    .line 121
    .line 122
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const-string v3, "android.media.metadata.DISPLAY_TITLE"

    .line 126
    .line 127
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const-string v4, "displayTitle"

    .line 132
    .line 133
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-string v3, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 137
    .line 138
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const-string v4, "displaySubtitle"

    .line 143
    .line 144
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    const-string v3, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 148
    .line 149
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    const-string v3, "displayDescription"

    .line 154
    .line 155
    invoke-virtual {v2, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    const-string p0, "android.media.metadata.RATING"

    .line 159
    .line 160
    invoke-virtual {v1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_4

    .line 165
    .line 166
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->d(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_1

    .line 175
    :catch_0
    move-exception p0

    .line 176
    const-string v3, "MediaMetadata"

    .line 177
    .line 178
    const-string v4, "Failed to retrieve a key as Rating."

    .line 179
    .line 180
    invoke-static {v3, v4, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 181
    .line 182
    .line 183
    :goto_1
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->rating2raw(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    const-string v0, "rating"

    .line 188
    .line 189
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_4
    new-instance p0, Landroid/os/Bundle;

    .line 193
    .line 194
    invoke-direct {p0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->bundleToMap(Landroid/os/Bundle;)Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-lez v0, :cond_5

    .line 206
    .line 207
    const-string v0, "extras"

    .line 208
    .line 209
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_5
    return-object v2
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static metadataToString(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->l:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
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

.method public static bridge synthetic n()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    sput-boolean v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterReady:Z

    return-void
.end method

.method public static bridge synthetic o(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    return-void
.end method

.method public static bridge synthetic p(Landroid/support/v4/media/session/l;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    return-void
.end method

.method public static bridge synthetic q(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->createMediaMetadata(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method private static queue2raw(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "**>;>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 25
    .line 26
    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->l:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 27
    .line 28
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaMetadata2raw(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v0
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

.method public static bridge synthetic r(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaMetadata2raw(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static rating2raw(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/RatingCompat;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Landroid/support/v4/media/RatingCompat;->l:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "type"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "value"

    .line 23
    .line 24
    if-eqz v1, :cond_8

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const/high16 v4, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/high16 v6, -0x40800000    # -1.0f

    .line 31
    .line 32
    iget v7, p0, Landroid/support/v4/media/RatingCompat;->m:F

    .line 33
    .line 34
    iget v8, p0, Landroid/support/v4/media/RatingCompat;->l:I

    .line 35
    .line 36
    packed-switch v8, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :pswitch_0
    const/4 v1, 0x6

    .line 42
    if-ne v8, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v6, v7

    .line 52
    :cond_1
    :goto_0
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_6

    .line 60
    :pswitch_1
    const/4 v1, 0x3

    .line 61
    if-eq v8, v1, :cond_2

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    if-eq v8, v1, :cond_2

    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    if-eq v8, v1, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    move v6, v7

    .line 77
    :cond_3
    :goto_1
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v0, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :pswitch_2
    const/4 p0, 0x2

    .line 86
    if-eq v8, p0, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    cmpl-float p0, v7, v4

    .line 90
    .line 91
    if-nez p0, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    move v1, v5

    .line 95
    :goto_2
    move v5, v1

    .line 96
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_6

    .line 104
    :pswitch_3
    if-eq v8, v1, :cond_6

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    cmpl-float p0, v7, v4

    .line 108
    .line 109
    if-nez p0, :cond_7

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    move v1, v5

    .line 113
    :goto_4
    move v5, v1

    .line 114
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {v0, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :pswitch_4
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_8
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :goto_6
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static raw2queue(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "**>;>;)",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->createMediaMetadata(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "extras"

    .line 32
    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {v3, v2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->addExtrasToMediaDescription(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 44
    .line 45
    int-to-long v4, v1

    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-direct {v3, v6, v2, v4, v5}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/media/session/MediaSession$QueueItem;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static raw2rating(Ljava/util/Map;)Landroid/support/v4/media/RatingCompat;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/RatingCompat;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "type"

    .line 6
    .line 7
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    const-string v2, "value"

    .line 14
    .line 15
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/high16 v2, -0x40800000    # -1.0f

    .line 20
    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    const/high16 v5, 0x3f800000    # 1.0f

    .line 29
    .line 30
    packed-switch v3, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    packed-switch p0, :pswitch_data_1

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_0
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 42
    .line 43
    invoke-direct {v0, v2, p0}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-object v0

    .line 47
    :pswitch_1
    check-cast p0, Ljava/lang/Double;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Double;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->f(F)Landroid/support/v4/media/RatingCompat;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    check-cast p0, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    int-to-float p0, p0

    .line 69
    invoke-static {p0, v0}, Landroid/support/v4/media/RatingCompat;->g(FI)Landroid/support/v4/media/RatingCompat;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 81
    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    move v4, v5

    .line 85
    :cond_1
    const/4 p0, 0x2

    .line 86
    invoke-direct {v0, v4, p0}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_4
    check-cast p0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 97
    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    move v4, v5

    .line 101
    :cond_2
    const/4 p0, 0x1

    .line 102
    invoke-direct {v0, v4, p0}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    packed-switch p0, :pswitch_data_2

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_5
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 115
    .line 116
    invoke-direct {v0, v2, p0}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 117
    .line 118
    .line 119
    :goto_1
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static rawToMediaItem(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->createMediaMetadata(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "extras"

    .line 10
    .line 11
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/Map;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->addExtrasToMediaDescription(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "playable"

    .line 22
    .line 23
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Boolean;

    .line 28
    .line 29
    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p0, 0x1

    .line 40
    :goto_0
    invoke-direct {v1, v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 41
    .line 42
    .line 43
    return-object v1
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

.method private registerOnNewIntentListener()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 2
    .line 3
    new-instance v1, Lcom/ryanheise/audioservice/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/ryanheise/audioservice/a;-><init>(Lcom/ryanheise/audioservice/AudioServicePlugin;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->newIntentListener:Ln3/t;

    .line 9
    .line 10
    check-cast v0, Ly2/n;

    .line 11
    .line 12
    iget-object v0, v0, Ly2/n;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
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

.method public static bridge synthetic s(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->rating2raw(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method private sendNotificationClicked()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sget-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "clicked"

    .line 42
    .line 43
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "onNotificationClicked"

    .line 52
    .line 53
    invoke-virtual {v1, v2, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public static setFlutterEngineId(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterEngineId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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

.method public static bridge synthetic t(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->raw2queue(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic u(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->rawToMediaItem(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onAttachedToActivity(Lk3/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Ly2/n;

    .line 7
    .line 8
    iget-object v1, v1, Ly2/n;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->b(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 16
    .line 17
    check-cast p1, Ly2/n;

    .line 18
    .line 19
    iget-object p1, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getFlutterEngine(Landroid/content/Context;)Le3/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 33
    .line 34
    iget-object v1, v1, Lj3/a;->c:Ln3/f;

    .line 35
    .line 36
    iget-object p1, p1, Le3/c;->c:Lf3/b;

    .line 37
    .line 38
    if-eq v1, p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->setWrongEngineDetected(Z)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 47
    .line 48
    sput-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->registerOnNewIntentListener()V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaController:Landroid/support/v4/media/session/l;

    .line 64
    .line 65
    invoke-static {p1, v0}, Landroid/support/v4/media/session/l;->b(Landroid/app/Activity;Landroid/support/v4/media/session/l;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->connect()V

    .line 73
    .line 74
    .line 75
    :cond_2
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->wasLaunchedFromRecents()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    new-instance v0, Landroid/content/Intent;

    .line 90
    .line 91
    const-string v1, "android.intent.action.MAIN"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->sendNotificationClicked()V

    .line 100
    .line 101
    .line 102
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public onAttachedToEngine(Lj3/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 2
    .line 3
    new-instance v0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 4
    .line 5
    iget-object p1, p1, Lj3/a;->c:Ln3/f;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;-><init>(Ln3/f;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 11
    .line 12
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 13
    .line 14
    iget-object p1, p1, Lj3/a;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterfaces:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 31
    .line 32
    iget-object p1, p1, Lj3/a;->a:Landroid/content/Context;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    .line 35
    .line 36
    :cond_0
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    new-instance p1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 43
    .line 44
    iget-object v0, v0, Lj3/a;->c:Ln3/f;

    .line 45
    .line 46
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;-><init>(Ln3/f;)V

    .line 47
    .line 48
    .line 49
    sput-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->init(Lcom/ryanheise/audioservice/AudioService$ServiceListener;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->mediaBrowser:Landroid/support/v4/media/g;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->connect()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->newIntentListener:Ln3/t;

    .line 4
    .line 5
    check-cast v0, Ly2/n;

    .line 6
    .line 7
    iget-object v0, v0, Ly2/n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->newIntentListener:Ln3/t;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->b(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 27
    .line 28
    iget-object v2, v2, Lj3/a;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v1, v2}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterfaces:Ljava/util/Set;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne v1, v2, :cond_0

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->disconnect()V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 46
    .line 47
    sget-object v2, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 48
    .line 49
    if-ne v1, v2, :cond_1

    .line 50
    .line 51
    sput-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->mainClientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 52
    .line 53
    :cond_1
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->newIntentListener:Ln3/t;

    .line 4
    .line 5
    check-cast v0, Ly2/n;

    .line 6
    .line 7
    iget-object v0, v0, Ly2/n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->b(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 25
    .line 26
    iget-object v1, v1, Lj3/a;->a:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public onDetachedFromEngine(Lj3/a;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterfaces:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->disconnect()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->applicationContext:Landroid/content/Context;

    .line 27
    .line 28
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->messenger:Ln3/f;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 35
    .line 36
    iget-object v1, v1, Lj3/a;->c:Ln3/f;

    .line 37
    .line 38
    if-ne p1, v1, :cond_1

    .line 39
    .line 40
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 41
    .line 42
    const-string v1, "### destroying audio handler interface"

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->g(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/ryanheise/audioservice/AudioServicePlugin;->audioHandlerInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 53
    .line 54
    :cond_1
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->flutterPluginBinding:Lj3/a;

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public onReattachedToActivityForConfigChanges(Lk3/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->activityPluginBinding:Lk3/b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Ly2/n;

    .line 7
    .line 8
    iget-object v1, v1, Ly2/n;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->b(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin;->clientInterface:Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 16
    .line 17
    check-cast p1, Ly2/n;

    .line 18
    .line 19
    iget-object p1, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->registerOnNewIntentListener()V

    .line 27
    .line 28
    .line 29
    return-void
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
