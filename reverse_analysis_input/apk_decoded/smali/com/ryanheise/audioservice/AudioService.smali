.class public Lcom/ryanheise/audioservice/AudioService;
.super Landroidx/media/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/AudioService$ServiceListener;,
        Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;
    }
.end annotation


# static fields
.field private static final AUTO_ENABLED_ACTIONS:J = 0x37fecfL

.field private static final BROWSABLE_ROOT_ID:Ljava/lang/String; = "root"

.field public static final CONTENT_STYLE_BROWSABLE_HINT:Ljava/lang/String; = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT"

.field public static final CONTENT_STYLE_CATEGORY_GRID_ITEM_HINT_VALUE:I = 0x4

.field public static final CONTENT_STYLE_CATEGORY_LIST_ITEM_HINT_VALUE:I = 0x3

.field public static final CONTENT_STYLE_GRID_ITEM_HINT_VALUE:I = 0x2

.field public static final CONTENT_STYLE_LIST_ITEM_HINT_VALUE:I = 0x1

.field public static final CONTENT_STYLE_PLAYABLE_HINT:Ljava/lang/String; = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT"

.field public static final CONTENT_STYLE_SUPPORTED:Ljava/lang/String; = "android.media.browse.CONTENT_STYLE_SUPPORTED"

.field public static final CUSTOM_ACTION_FAST_FORWARD:Ljava/lang/String; = "com.ryanheise.audioservice.action.FAST_FORWARD"

.field public static final CUSTOM_ACTION_REWIND:Ljava/lang/String; = "com.ryanheise.audioservice.action.REWIND"

.field public static final CUSTOM_ACTION_STOP:Ljava/lang/String; = "com.ryanheise.audioservice.action.STOP"

.field public static final KEYCODE_BYPASS_PAUSE:I = 0x82

.field public static final KEYCODE_BYPASS_PLAY:I = 0x5b

.field public static final MAX_COMPACT_ACTIONS:I = 0x3

.field public static final NOTIFICATION_CLICK_ACTION:Ljava/lang/String; = "com.ryanheise.audioservice.NOTIFICATION_CLICK"

.field private static final NOTIFICATION_ID:I = 0x464

.field private static final RECENT_ROOT_ID:Ljava/lang/String; = "recent"

.field private static final REQUEST_CONTENT_INTENT:I = 0x3e8

.field private static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "audio_service_preferences"

.field private static contentIntent:Landroid/app/PendingIntent;

.field static instance:Lcom/ryanheise/audioservice/AudioService;

.field private static listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

.field private static final mediaMetadataCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ">;"
        }
    .end annotation
.end field

.field private static queue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private artBitmap:Landroid/graphics/Bitmap;

.field private artBitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private compactActionIndices:[I

.field private config:Lcom/ryanheise/audioservice/AudioServiceConfig;

.field private controls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ryanheise/audioservice/MediaControl;",
            ">;"
        }
    .end annotation
.end field

.field private customActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;"
        }
    .end annotation
.end field

.field private flutterEngine:Le3/c;

.field private final handler:Landroid/os/Handler;

.field private mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

.field private mediaSession:Landroid/support/v4/media/session/y;

.field private mediaSessionCallback:Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;

.field private nativeActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt/l;",
            ">;"
        }
    .end annotation
.end field

.field private notificationChannelId:Ljava/lang/String;

.field private notificationCreated:Z

.field private playing:Z

.field private processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

.field private repeatMode:I

.field private shuffleMode:I

.field private volumeProvider:Landroidx/media/J;

.field private wakeLock:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->queue:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadataCache:Ljava/util/Map;

    .line 14
    .line 15
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media/A;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->controls:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->nativeActions:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->customActions:Ljava/util/List;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 27
    .line 28
    sget-object v0, Lcom/ryanheise/audioservice/AudioProcessingState;->idle:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 31
    .line 32
    new-instance v0, Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->handler:Landroid/os/Handler;

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
.end method

.method public static synthetic a(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->updateNotification()V

    return-void
.end method

.method private acquireWakeLock()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method private activateMediaSession()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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

.method public static bridge synthetic b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    return-object p0
.end method

.method private buildNotification()Landroid/app/Notification;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->compactActionIndices:[I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->nativeActions:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-array v1, v0, [I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_0

    .line 20
    .line 21
    aput v2, v1, v2

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v1

    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->getNotificationBuilder()Lt/r;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

    .line 32
    .line 33
    if-eqz v2, :cond_6

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v2, Landroid/support/v4/media/MediaDescriptionCompat;->m:Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Lt/r;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, v1, Lt/r;->e:Ljava/lang/CharSequence;

    .line 51
    .line 52
    :cond_2
    iget-object v3, v2, Landroid/support/v4/media/MediaDescriptionCompat;->n:Ljava/lang/CharSequence;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Lt/r;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iput-object v3, v1, Lt/r;->f:Ljava/lang/CharSequence;

    .line 64
    .line 65
    :cond_3
    iget-object v2, v2, Landroid/support/v4/media/MediaDescriptionCompat;->o:Ljava/lang/CharSequence;

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, Lt/r;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v1, Lt/r;->o:Ljava/lang/CharSequence;

    .line 77
    .line 78
    :cond_4
    monitor-enter p0

    .line 79
    :try_start_0
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lt/r;->d(Landroid/graphics/Bitmap;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    :goto_1
    monitor-exit p0

    .line 90
    goto :goto_3

    .line 91
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    throw v0

    .line 93
    :cond_6
    :goto_3
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 94
    .line 95
    iget-boolean v2, v2, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationClickStartsActivity:Z

    .line 96
    .line 97
    if-eqz v2, :cond_7

    .line 98
    .line 99
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 100
    .line 101
    iget-object v2, v2, Landroid/support/v4/media/session/y;->b:Landroid/support/v4/media/session/l;

    .line 102
    .line 103
    iget-object v2, v2, Landroid/support/v4/media/session/l;->a:Landroid/support/v4/media/session/i;

    .line 104
    .line 105
    iget-object v2, v2, Landroid/support/v4/media/session/i;->a:Landroid/media/session/MediaController;

    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/media/session/MediaController;->getSessionActivity()Landroid/app/PendingIntent;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iput-object v2, v1, Lt/r;->g:Landroid/app/PendingIntent;

    .line 112
    .line 113
    :cond_7
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 114
    .line 115
    iget v2, v2, Lcom/ryanheise/audioservice/AudioServiceConfig;->notificationColor:I

    .line 116
    .line 117
    const/4 v3, -0x1

    .line 118
    if-eq v2, v3, :cond_8

    .line 119
    .line 120
    iput v2, v1, Lt/r;->y:I

    .line 121
    .line 122
    :cond_8
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->nativeActions:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lt/l;

    .line 139
    .line 140
    if-eqz v3, :cond_9

    .line 141
    .line 142
    iget-object v4, v1, Lt/r;->b:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_a
    new-instance v2, LY/c;

    .line 153
    .line 154
    invoke-direct {v2}, LY/c;-><init>()V

    .line 155
    .line 156
    .line 157
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 158
    .line 159
    iget-object v3, v3, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 160
    .line 161
    iget-object v3, v3, Landroid/support/v4/media/session/s;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 162
    .line 163
    iput-object v3, v2, LY/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 164
    .line 165
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 166
    .line 167
    const/16 v4, 0x21

    .line 168
    .line 169
    if-ge v3, v4, :cond_b

    .line 170
    .line 171
    iput-object v0, v2, LY/c;->e:[I

    .line 172
    .line 173
    :cond_b
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 174
    .line 175
    iget-boolean v0, v0, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationOngoing:Z

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    const-wide/16 v3, 0x1

    .line 180
    .line 181
    invoke-virtual {p0, v3, v4}, Lcom/ryanheise/audioservice/AudioService;->buildMediaButtonPendingIntent(J)Landroid/app/PendingIntent;

    .line 182
    .line 183
    .line 184
    const/4 v0, 0x2

    .line 185
    const/4 v3, 0x1

    .line 186
    invoke-virtual {v1, v0, v3}, Lt/r;->c(IZ)V

    .line 187
    .line 188
    .line 189
    :cond_c
    invoke-virtual {v1, v2}, Lt/r;->e(LQ1/D;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lt/r;->a()Landroid/app/Notification;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    return-object v0
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

.method public static bridge synthetic c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    return-object v0
.end method

.method private static calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 3

    .line 1
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 2
    .line 3
    iget p0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-gt v0, p2, :cond_0

    .line 7
    .line 8
    if-le p0, p1, :cond_1

    .line 9
    .line 10
    :cond_0
    div-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    div-int/lit8 p0, p0, 0x2

    .line 13
    .line 14
    :goto_0
    div-int v2, v0, v1

    .line 15
    .line 16
    if-lt v2, p2, :cond_1

    .line 17
    .line 18
    div-int v2, p0, v1

    .line 19
    .line 20
    if-lt v2, p1, :cond_1

    .line 21
    .line 22
    mul-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v1
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

.method private createChannel()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->getNotificationManager()Landroid/app/NotificationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->notificationChannelId:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/dexterous/flutterlocalnotifications/b;->d(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/dexterous/flutterlocalnotifications/b;->r()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->notificationChannelId:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelName:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1, v2}, Lcom/dexterous/flutterlocalnotifications/b;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 27
    .line 28
    iget-boolean v2, v2, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidShowNotificationBadge:Z

    .line 29
    .line 30
    invoke-static {v1, v2}, LB/a;->C(Landroid/app/NotificationChannel;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 34
    .line 35
    iget-object v2, v2, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelDescription:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-static {v1, v2}, Lcom/dexterous/flutterlocalnotifications/b;->t(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v0, v1}, Lcom/dexterous/flutterlocalnotifications/b;->u(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method private deactivateMediaSession()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->getNotificationManager()Landroid/app/NotificationManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/16 v1, 0x464

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

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
.end method

.method private enterPlayingState()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lcom/ryanheise/audioservice/AudioService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Li4/a;->X(Landroid/content/Context;Landroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->acquireWakeLock()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 29
    .line 30
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->contentIntent:Landroid/app/PendingIntent;

    .line 31
    .line 32
    iget-object v0, v0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 33
    .line 34
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setSessionActivity(Landroid/app/PendingIntent;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->internalStartForeground()V

    .line 40
    .line 41
    .line 42
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
.end method

.method private exitForegroundState()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Lt/d0;->a(Landroid/app/Service;I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->releaseWakeLock()V

    .line 6
    .line 7
    .line 8
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

.method private exitPlayingState()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidStopForegroundOnPause:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->exitForegroundState()V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method public static getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadataCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 8
    .line 9
    return-object p0
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

.method private getNotificationBuilder()Lt/r;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->createChannel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lt/r;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->notificationChannelId:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lt/r;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput v1, v0, Lt/r;->z:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, v0, Lt/r;->l:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->buildDeletePendingIntent()Landroid/app/PendingIntent;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, v0, Lt/r;->F:Landroid/app/Notification;

    .line 28
    .line 29
    iput-object v1, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 32
    .line 33
    iget-object v1, v1, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationIcon:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/ryanheise/audioservice/AudioService;->getResourceId(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, v0, Lt/r;->F:Landroid/app/Notification;

    .line 40
    .line 41
    iput v1, v2, Landroid/app/Notification;->icon:I

    .line 42
    .line 43
    return-object v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method private getNotificationManager()Landroid/app/NotificationManager;
    .locals 1

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/NotificationManager;

    .line 8
    .line 9
    return-object v0
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

.method public static init(Lcom/ryanheise/audioservice/AudioService$ServiceListener;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

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

.method private internalStartForeground()V
    .locals 2

    .line 1
    const/16 v0, 0x464

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->buildNotification()Landroid/app/Notification;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->notificationCreated:Z

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

.method private mapToBundle(Ljava/util/Map;)Landroid/os/Bundle;
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
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    instance-of v3, v1, Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    check-cast v1, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    instance-of v3, v1, Ljava/lang/Long;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Long;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-object v0
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
.end method

.method private needCustomMediaControl(Lcom/ryanheise/audioservice/MediaControl;)Z
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/ryanheise/audioservice/MediaControl;->customAction:Lcom/ryanheise/audioservice/CustomMediaAction;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
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

.method private putArtToMetadata(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 2

    .line 1
    new-instance v0, LB0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    iget-object p1, p1, Landroid/support/v4/media/MediaMetadataCompat;->l:Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, LB0/d;->l:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "android.media.metadata.ALBUM_ART"

    .line 19
    .line 20
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, LB0/d;->o(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 23
    .line 24
    .line 25
    const-string p1, "android.media.metadata.DISPLAY_ICON"

    .line 26
    .line 27
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, LB0/d;->o(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 33
    .line 34
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    return-object p1
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

.method private releaseMediaSession()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->deactivateMediaSession()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 10
    .line 11
    iget-object v0, v0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 12
    .line 13
    iget-object v1, v0, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->kill()V

    .line 16
    .line 17
    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/16 v3, 0x1b

    .line 22
    .line 23
    iget-object v4, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 24
    .line 25
    if-ne v1, v3, :cond_1

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v3, "mCallback"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/os/Handler;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    const-string v3, "MediaSessionCompat"

    .line 55
    .line 56
    const-string v5, "Exception happened while accessing MediaSession.mCallback."

    .line 57
    .line 58
    invoke-static {v3, v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    invoke-virtual {v4, v2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Landroid/support/v4/media/session/s;->b:Landroid/support/v4/media/session/r;

    .line 65
    .line 66
    iget-object v0, v0, Landroid/support/v4/media/session/r;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/media/session/MediaSession;->release()V

    .line 72
    .line 73
    .line 74
    iput-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 75
    .line 76
    return-void
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

.method private releaseWakeLock()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public static toKeyCode(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x5b

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const-wide/16 v0, 0x2

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/16 p0, 0x82

    .line 17
    .line 18
    return p0

    .line 19
    :cond_1
    invoke-static {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->d(J)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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

.method private updateNotification()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->notificationCreated:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->getNotificationManager()Landroid/app/NotificationManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x464

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->buildNotification()Landroid/app/Notification;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
.method public buildDeletePendingIntent()Landroid/app/PendingIntent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/high16 v2, 0x4000000

    .line 15
    .line 16
    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

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
.end method

.method public buildMediaButtonPendingIntent(J)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lcom/ryanheise/audioservice/AudioService;->toKeyCode(J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance p2, Landroid/content/Intent;

    .line 10
    .line 11
    const-class v0, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    .line 12
    .line 13
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "android.intent.action.MEDIA_BUTTON"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/view/KeyEvent;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 25
    .line 26
    .line 27
    const-string v1, "android.intent.extra.KEY_EVENT"

    .line 28
    .line 29
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    const/high16 v0, 0x4000000

    .line 33
    .line 34
    invoke-static {p0, p1, p2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method public configure(Lcom/ryanheise/audioservice/AudioServiceConfig;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelId:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ".channel"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->notificationChannelId:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p1, Lcom/ryanheise/audioservice/AudioServiceConfig;->activityClassName:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, Landroid/content/Intent;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/content/ComponentName;

    .line 50
    .line 51
    iget-object v4, p1, Lcom/ryanheise/audioservice/AudioServiceConfig;->activityClassName:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v3, v0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    const-string v3, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    const/16 v3, 0x3e8

    .line 65
    .line 66
    const/high16 v4, 0xc000000

    .line 67
    .line 68
    invoke-static {v0, v3, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->contentIntent:Landroid/app/PendingIntent;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->contentIntent:Landroid/app/PendingIntent;

    .line 76
    .line 77
    :goto_1
    iget-boolean p1, p1, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidResumeOnClick:Z

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 82
    .line 83
    iget-object p1, p1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 84
    .line 85
    iget-object p1, p1, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
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
.end method

.method public createAction(Ljava/lang/String;Ljava/lang/String;J)Lt/l;
    .locals 14

    .line 1
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->getResourceId(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v12, Lt/l;

    .line 6
    .line 7
    move-object v13, p0

    .line 8
    move-wide/from16 v1, p3

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lcom/ryanheise/audioservice/AudioService;->buildMediaButtonPendingIntent(J)Landroid/app/PendingIntent;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    move-object v2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v2, ""

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroidx/core/graphics/drawable/IconCompat;->g(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v2, v0

    .line 26
    :goto_0
    new-instance v5, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x1

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x1

    .line 36
    const/4 v11, 0x0

    .line 37
    move-object v1, v12

    .line 38
    move-object/from16 v3, p2

    .line 39
    .line 40
    invoke-direct/range {v1 .. v11}, Lt/l;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lt/c0;[Lt/c0;ZIZZ)V

    .line 41
    .line 42
    .line 43
    return-object v12
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

.method public createCustomAction(Lcom/ryanheise/audioservice/MediaControl;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .locals 11

    .line 1
    iget-object v0, p1, Lcom/ryanheise/audioservice/MediaControl;->icon:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/ryanheise/audioservice/AudioService;->getResourceId(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Lcom/ryanheise/audioservice/MediaControl;->customAction:Lcom/ryanheise/audioservice/CustomMediaAction;

    .line 8
    .line 9
    const-string v2, "You must specify an action to build a CustomAction"

    .line 10
    .line 11
    const-string v3, "You must specify a name to build a CustomAction"

    .line 12
    .line 13
    const-string v4, "You must specify an icon resource id to build a CustomAction"

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-object v1, v1, Lcom/ryanheise/audioservice/CustomMediaAction;->name:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p1, Lcom/ryanheise/audioservice/MediaControl;->label:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_2

    .line 26
    .line 27
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object p1, p1, Lcom/ryanheise/audioservice/MediaControl;->customAction:Lcom/ryanheise/audioservice/CustomMediaAction;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/ryanheise/audioservice/CustomMediaAction;->extras:Ljava/util/Map;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->mapToBundle(Ljava/util/Map;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 44
    .line 45
    invoke-direct {v2, v1, v5, v0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v5, 0x21

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    if-lt v1, v5, :cond_f

    .line 73
    .line 74
    iget-wide v7, p1, Lcom/ryanheise/audioservice/MediaControl;->actionCode:J

    .line 75
    .line 76
    const-wide/16 v9, 0x1

    .line 77
    .line 78
    cmp-long v1, v7, v9

    .line 79
    .line 80
    if-nez v1, :cond_7

    .line 81
    .line 82
    iget-object p1, p1, Lcom/ryanheise/audioservice/MediaControl;->label:Ljava/lang/String;

    .line 83
    .line 84
    const-string v1, "com.ryanheise.audioservice.action.STOP"

    .line 85
    .line 86
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_6

    .line 91
    .line 92
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 101
    .line 102
    invoke-direct {v2, v1, p1, v0, v6}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_7
    const-wide/16 v9, 0x40

    .line 125
    .line 126
    cmp-long v1, v7, v9

    .line 127
    .line 128
    if-nez v1, :cond_b

    .line 129
    .line 130
    iget-object p1, p1, Lcom/ryanheise/audioservice/MediaControl;->label:Ljava/lang/String;

    .line 131
    .line 132
    const-string v1, "com.ryanheise.audioservice.action.FAST_FORWARD"

    .line 133
    .line 134
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_a

    .line 139
    .line 140
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-nez v2, :cond_9

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 149
    .line 150
    invoke-direct {v2, v1, p1, v0, v6}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 151
    .line 152
    .line 153
    return-object v2

    .line 154
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 155
    .line 156
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 161
    .line 162
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 167
    .line 168
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_b
    const-wide/16 v9, 0x8

    .line 173
    .line 174
    cmp-long v1, v7, v9

    .line 175
    .line 176
    if-nez v1, :cond_f

    .line 177
    .line 178
    iget-object p1, p1, Lcom/ryanheise/audioservice/MediaControl;->label:Ljava/lang/String;

    .line 179
    .line 180
    const-string v1, "com.ryanheise.audioservice.action.REWIND"

    .line 181
    .line 182
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-nez v5, :cond_e

    .line 187
    .line 188
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_d

    .line 193
    .line 194
    if-eqz v0, :cond_c

    .line 195
    .line 196
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 197
    .line 198
    invoke-direct {v2, v1, p1, v0, v6}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 199
    .line 200
    .line 201
    return-object v2

    .line 202
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 203
    .line 204
    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p1

    .line 208
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1

    .line 214
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p1

    .line 220
    :cond_f
    return-object v6
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

.method public createMediaMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/support/v4/media/RatingCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/support/v4/media/RatingCompat;",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaMetadataCompat;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move-object/from16 v5, p9

    .line 12
    .line 13
    move-object/from16 v6, p10

    .line 14
    .line 15
    move-object/from16 v7, p11

    .line 16
    .line 17
    move-object/from16 v8, p12

    .line 18
    .line 19
    move-object/from16 v9, p13

    .line 20
    .line 21
    new-instance v10, LB0/d;

    .line 22
    .line 23
    const/16 v11, 0x1d

    .line 24
    .line 25
    invoke-direct {v10, v11}, LB0/d;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const-string v11, "android.media.metadata.MEDIA_ID"

    .line 29
    .line 30
    invoke-virtual {v10, v11, v0}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v11, "android.media.metadata.TITLE"

    .line 34
    .line 35
    move-object/from16 v12, p2

    .line 36
    .line 37
    invoke-virtual {v10, v11, v12}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const-string v11, "android.media.metadata.ALBUM"

    .line 43
    .line 44
    invoke-virtual {v10, v11, v1}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    if-eqz v2, :cond_1

    .line 48
    .line 49
    const-string v1, "android.media.metadata.ARTIST"

    .line 50
    .line 51
    invoke-virtual {v10, v1, v2}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz v3, :cond_2

    .line 55
    .line 56
    const-string v1, "android.media.metadata.GENRE"

    .line 57
    .line 58
    invoke-virtual {v10, v1, v3}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    if-eqz p6, :cond_3

    .line 62
    .line 63
    const-string v1, "android.media.metadata.DURATION"

    .line 64
    .line 65
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-virtual {v10, v1, v2, v3}, LB0/d;->p(Ljava/lang/String;J)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-eqz v4, :cond_4

    .line 73
    .line 74
    const-string v1, "android.media.metadata.DISPLAY_ICON_URI"

    .line 75
    .line 76
    invoke-virtual {v10, v1, v4}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    const-wide/16 v3, 0x1

    .line 80
    .line 81
    if-eqz p8, :cond_6

    .line 82
    .line 83
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-eqz v11, :cond_5

    .line 88
    .line 89
    move-wide v11, v3

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    :goto_0
    const-string v13, "playable_long"

    .line 94
    .line 95
    invoke-virtual {v10, v13, v11, v12}, LB0/d;->p(Ljava/lang/String;J)V

    .line 96
    .line 97
    .line 98
    :cond_6
    if-eqz v5, :cond_7

    .line 99
    .line 100
    const-string v11, "android.media.metadata.DISPLAY_TITLE"

    .line 101
    .line 102
    invoke-virtual {v10, v11, v5}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_7
    if-eqz v6, :cond_8

    .line 106
    .line 107
    const-string v5, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 108
    .line 109
    invoke-virtual {v10, v5, v6}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_8
    if-eqz v7, :cond_9

    .line 113
    .line 114
    const-string v5, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 115
    .line 116
    invoke-virtual {v10, v5, v7}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_9
    iget-object v5, v10, LB0/d;->l:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Landroid/os/Bundle;

    .line 122
    .line 123
    if-eqz v8, :cond_16

    .line 124
    .line 125
    sget-object v6, Landroid/support/v4/media/MediaMetadataCompat;->o:Lq/e;

    .line 126
    .line 127
    const-string v7, "android.media.metadata.RATING"

    .line 128
    .line 129
    invoke-virtual {v6, v7}, Lq/i;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    const/4 v12, 0x3

    .line 134
    const/4 v13, 0x0

    .line 135
    if-eqz v11, :cond_b

    .line 136
    .line 137
    invoke-virtual {v6, v7, v13}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-ne v6, v12, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    const-string v1, "The android.media.metadata.RATING key cannot be used to put a Rating"

    .line 153
    .line 154
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_b
    :goto_1
    iget-object v6, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 159
    .line 160
    if-nez v6, :cond_15

    .line 161
    .line 162
    invoke-virtual/range {p12 .. p12}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    iget v11, v8, Landroid/support/v4/media/RatingCompat;->l:I

    .line 167
    .line 168
    if-eqz v6, :cond_14

    .line 169
    .line 170
    const/4 v6, 0x1

    .line 171
    const/high16 v14, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v15, 0x0

    .line 174
    const/high16 v16, -0x40800000    # -1.0f

    .line 175
    .line 176
    iget v1, v8, Landroid/support/v4/media/RatingCompat;->m:F

    .line 177
    .line 178
    packed-switch v11, :pswitch_data_0

    .line 179
    .line 180
    .line 181
    goto/16 :goto_a

    .line 182
    .line 183
    :pswitch_0
    const/4 v2, 0x6

    .line 184
    if-ne v11, v2, :cond_d

    .line 185
    .line 186
    invoke-virtual/range {p12 .. p12}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_c

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_c
    move/from16 v16, v1

    .line 194
    .line 195
    :cond_d
    :goto_2
    invoke-static/range {v16 .. v16}, Landroid/support/v4/media/j;->h(F)Landroid/media/Rating;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iput-object v1, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :pswitch_1
    if-eq v11, v12, :cond_e

    .line 203
    .line 204
    const/4 v2, 0x4

    .line 205
    if-eq v11, v2, :cond_e

    .line 206
    .line 207
    const/4 v2, 0x5

    .line 208
    if-eq v11, v2, :cond_e

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_e
    invoke-virtual/range {p12 .. p12}, Landroid/support/v4/media/RatingCompat;->e()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_f

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_f
    :goto_3
    move/from16 v1, v16

    .line 219
    .line 220
    :goto_4
    invoke-static {v11, v1}, Landroid/support/v4/media/j;->i(IF)Landroid/media/Rating;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    iput-object v1, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :pswitch_2
    const/4 v2, 0x2

    .line 228
    if-eq v11, v2, :cond_10

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_10
    cmpl-float v1, v1, v14

    .line 232
    .line 233
    if-nez v1, :cond_11

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_11
    move v6, v15

    .line 237
    :goto_5
    move v15, v6

    .line 238
    :goto_6
    invoke-static {v15}, Landroid/support/v4/media/j;->j(Z)Landroid/media/Rating;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    iput-object v1, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :pswitch_3
    if-eq v11, v6, :cond_12

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_12
    cmpl-float v1, v1, v14

    .line 249
    .line 250
    if-nez v1, :cond_13

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_13
    move v6, v15

    .line 254
    :goto_7
    move v15, v6

    .line 255
    :goto_8
    invoke-static {v15}, Landroid/support/v4/media/j;->g(Z)Landroid/media/Rating;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput-object v1, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_14
    invoke-static {v11}, Landroid/support/v4/media/j;->k(I)Landroid/media/Rating;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iput-object v1, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 267
    .line 268
    :cond_15
    :goto_9
    iget-object v13, v8, Landroid/support/v4/media/RatingCompat;->n:Ljava/lang/Object;

    .line 269
    .line 270
    :goto_a
    check-cast v13, Landroid/os/Parcelable;

    .line 271
    .line 272
    invoke-virtual {v5, v7, v13}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 273
    .line 274
    .line 275
    :cond_16
    if-eqz v9, :cond_1d

    .line 276
    .line 277
    invoke-interface/range {p13 .. p13}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    :cond_17
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_1d

    .line 290
    .line 291
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Ljava/lang/String;

    .line 296
    .line 297
    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    instance-of v7, v6, Ljava/lang/Long;

    .line 302
    .line 303
    if-eqz v7, :cond_18

    .line 304
    .line 305
    check-cast v6, Ljava/lang/Long;

    .line 306
    .line 307
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    invoke-virtual {v10, v2, v6, v7}, LB0/d;->p(Ljava/lang/String;J)V

    .line 312
    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_18
    instance-of v7, v6, Ljava/lang/Integer;

    .line 316
    .line 317
    if-eqz v7, :cond_19

    .line 318
    .line 319
    check-cast v6, Ljava/lang/Integer;

    .line 320
    .line 321
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    int-to-long v6, v6

    .line 326
    invoke-virtual {v10, v2, v6, v7}, LB0/d;->p(Ljava/lang/String;J)V

    .line 327
    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_19
    instance-of v7, v6, Ljava/lang/String;

    .line 331
    .line 332
    if-eqz v7, :cond_1a

    .line 333
    .line 334
    check-cast v6, Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v10, v2, v6}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_1a
    instance-of v7, v6, Ljava/lang/Boolean;

    .line 341
    .line 342
    if-eqz v7, :cond_1c

    .line 343
    .line 344
    check-cast v6, Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-eqz v6, :cond_1b

    .line 351
    .line 352
    move-wide v6, v3

    .line 353
    goto :goto_c

    .line 354
    :cond_1b
    const-wide/16 v6, 0x0

    .line 355
    .line 356
    :goto_c
    invoke-virtual {v10, v2, v6, v7}, LB0/d;->p(Ljava/lang/String;J)V

    .line 357
    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_1c
    instance-of v7, v6, Ljava/lang/Double;

    .line 361
    .line 362
    if-eqz v7, :cond_17

    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v10, v2, v6}, LB0/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_1d
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 373
    .line 374
    invoke-direct {v1, v5}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 375
    .line 376
    .line 377
    sget-object v2, Lcom/ryanheise/audioservice/AudioService;->mediaMetadataCache:Ljava/util/Map;

    .line 378
    .line 379
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getConfig()Lcom/ryanheise/audioservice/AudioServiceConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

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

.method public getPlaybackState()I
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService$3;->$SwitchMap$com$ryanheise$audioservice$AudioProcessingState:[I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_6

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    const/4 v3, 0x3

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    if-eq v0, v4, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x5

    .line 22
    if-eq v0, v4, :cond_1

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x7

    .line 29
    return v0

    .line 30
    :cond_1
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    move v1, v3

    .line 35
    :cond_2
    return v1

    .line 36
    :cond_3
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    move v1, v3

    .line 41
    :cond_4
    return v1

    .line 42
    :cond_5
    return v2

    .line 43
    :cond_6
    const/16 v0, 0x8

    .line 44
    .line 45
    return v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public getProcessingState()Lcom/ryanheise/audioservice/AudioProcessingState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

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

.method public getRepeatMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ryanheise/audioservice/AudioService;->repeatMode:I

    .line 2
    .line 3
    return v0
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

.method public getResourceId(Ljava/lang/String;)I
    .locals 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    aget-object v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget-object p1, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
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

.method public getShuffleMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ryanheise/audioservice/AudioService;->shuffleMode:I

    .line 2
    .line 3
    return v0
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

.method public handleDeleteNotification()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onClose()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 2
    .line 3
    return v0
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

.method public loadArtBitmap(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmapCache:Landroid/util/LruCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Bitmap;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "content"

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    const/4 v4, -0x1

    .line 28
    if-eqz v3, :cond_5

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    :try_start_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v5, 0x1d

    .line 35
    .line 36
    if-lt p2, v5, :cond_3

    .line 37
    .line 38
    new-instance p2, Landroid/util/Size;

    .line 39
    .line 40
    const/16 v0, 0xc0

    .line 41
    .line 42
    invoke-direct {p2, v0, v0}, Landroid/util/Size;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v5, Landroid/util/Size;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 52
    .line 53
    iget v6, v6, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleWidth:I

    .line 54
    .line 55
    if-ne v6, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    :goto_0
    iget-object v7, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 66
    .line 67
    iget v7, v7, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleHeight:I

    .line 68
    .line 69
    if-ne v7, v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    :cond_2
    invoke-direct {v5, v6, v7}, Landroid/util/Size;-><init>(II)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v2, v5}, LD/Q;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/util/Size;)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    const-string v5, "r"

    .line 90
    .line 91
    invoke-virtual {p2, v2, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 98
    .line 99
    .line 100
    move-result-object p2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    goto :goto_1

    .line 102
    :catch_1
    :cond_4
    return-object v1

    .line 103
    :cond_5
    move-object p2, v1

    .line 104
    :goto_1
    if-eqz v3, :cond_6

    .line 105
    .line 106
    if-eqz p2, :cond_b

    .line 107
    .line 108
    :cond_6
    :try_start_2
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 109
    .line 110
    iget v0, v0, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleWidth:I

    .line 111
    .line 112
    if-eq v0, v4, :cond_9

    .line 113
    .line 114
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 115
    .line 116
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 117
    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 121
    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {v3, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    :goto_2
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 136
    .line 137
    iget v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleWidth:I

    .line 138
    .line 139
    iget v3, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleHeight:I

    .line 140
    .line 141
    invoke-static {v0, v4, v3}, Lcom/ryanheise/audioservice/AudioService;->calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 149
    .line 150
    if-eqz p2, :cond_8

    .line 151
    .line 152
    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    :goto_3
    move-object v0, p2

    .line 157
    goto :goto_4

    .line 158
    :cond_8
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-static {p2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    goto :goto_3

    .line 167
    :cond_9
    if-eqz p2, :cond_a

    .line 168
    .line 169
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    goto :goto_4

    .line 174
    :cond_a
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :cond_b
    :goto_4
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmapCache:Landroid/util/LruCache;

    .line 183
    .line 184
    invoke-virtual {p2, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 189
    .line 190
    .line 191
    return-object v1
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
.end method

.method public onCreate()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p0}, Landroidx/media/A;->onCreate()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput v1, v0, Lcom/ryanheise/audioservice/AudioService;->repeatMode:I

    .line 10
    .line 11
    iput v1, v0, Lcom/ryanheise/audioservice/AudioService;->shuffleMode:I

    .line 12
    .line 13
    iput-boolean v1, v0, Lcom/ryanheise/audioservice/AudioService;->notificationCreated:Z

    .line 14
    .line 15
    iput-boolean v1, v0, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 16
    .line 17
    sget-object v1, Lcom/ryanheise/audioservice/AudioProcessingState;->idle:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 18
    .line 19
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 20
    .line 21
    new-instance v1, Landroid/support/v4/media/session/y;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Landroid/support/v4/media/session/y;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 27
    .line 28
    new-instance v1, Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 29
    .line 30
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2}, Lcom/ryanheise/audioservice/AudioServiceConfig;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/ryanheise/audioservice/AudioService;->configure(Lcom/ryanheise/audioservice/AudioServiceConfig;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 41
    .line 42
    iget-object v1, v1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 43
    .line 44
    const/4 v2, 0x7

    .line 45
    iget-object v1, v1, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 48
    .line 49
    .line 50
    new-instance v16, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 56
    .line 57
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 58
    .line 59
    move-object v3, v2

    .line 60
    const-wide/16 v17, -0x1

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    const-wide/16 v5, 0x0

    .line 66
    .line 67
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    const-wide/32 v10, 0x37fecf

    .line 71
    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    const-wide/16 v14, 0x0

    .line 76
    .line 77
    invoke-direct/range {v3 .. v19}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/y;->d(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 84
    .line 85
    new-instance v2, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;

    .line 86
    .line 87
    invoke-direct {v2, v0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 88
    .line 89
    .line 90
    iput-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSessionCallback:Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;

    .line 91
    .line 92
    iget-object v1, v1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 93
    .line 94
    new-instance v3, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/session/s;->f(Landroid/support/v4/media/session/p;Landroid/os/Handler;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 103
    .line 104
    iget-object v1, v1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 105
    .line 106
    iget-object v1, v1, Landroid/support/v4/media/session/s;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroidx/media/A;->setSessionToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 112
    .line 113
    sget-object v2, Lcom/ryanheise/audioservice/AudioService;->queue:Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/y;->e(Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    const-string v1, "power"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Landroid/os/PowerManager;

    .line 125
    .line 126
    const-class v2, Lcom/ryanheise/audioservice/AudioService;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const/4 v3, 0x1

    .line 133
    invoke-virtual {v1, v3, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    .line 138
    .line 139
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    .line 144
    .line 145
    .line 146
    move-result-wide v1

    .line 147
    const-wide/16 v3, 0x400

    .line 148
    .line 149
    div-long/2addr v1, v3

    .line 150
    long-to-int v1, v1

    .line 151
    div-int/lit8 v1, v1, 0x8

    .line 152
    .line 153
    new-instance v2, Lcom/ryanheise/audioservice/AudioService$1;

    .line 154
    .line 155
    invoke-direct {v2, v0, v1}, Lcom/ryanheise/audioservice/AudioService$1;-><init>(Lcom/ryanheise/audioservice/AudioService;I)V

    .line 156
    .line 157
    .line 158
    iput-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->artBitmapCache:Landroid/util/LruCache;

    .line 159
    .line 160
    invoke-static/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getFlutterEngine(Landroid/content/Context;)Le3/c;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->flutterEngine:Le3/c;

    .line 165
    .line 166
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 167
    .line 168
    const-string v2, "flutterEngine warmed up"

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-void
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

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/media/A;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onDestroy()V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 13
    .line 14
    :cond_0
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->queue:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadataCache:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->controls:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmapCache:Landroid/util/LruCache;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->compactActionIndices:[I

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->releaseMediaSession()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 44
    .line 45
    iget-boolean v0, v0, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidResumeOnClick:Z

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v0, 0x1

    .line 52
    :goto_0
    invoke-static {p0, v0}, Lt/d0;->a(Landroid/app/Service;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->releaseWakeLock()V

    .line 56
    .line 57
    .line 58
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->notificationCreated:Z

    .line 62
    .line 63
    return-void
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

.method public onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/i;
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const-string p1, "android.service.media.extra.RECENT"

    .line 6
    .line 7
    invoke-virtual {p3, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_1
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->config:Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/ryanheise/audioservice/AudioServiceConfig;->getBrowsableRootExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance p3, Landroidx/media/i;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const-string p1, "recent"

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const-string p1, "root"

    .line 37
    .line 38
    :goto_1
    invoke-direct {p3, p1, p2}, Landroidx/media/i;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    return-object p3
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

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/ryanheise/audioservice/AudioService;->onLoadChildren(Ljava/lang/String;Landroidx/media/u;Landroid/os/Bundle;)V

    return-void
.end method

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/u;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    if-nez v0, :cond_0

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2, p1}, Landroidx/media/u;->f(Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onLoadChildren(Ljava/lang/String;Landroidx/media/u;Landroid/os/Bundle;)V

    return-void
.end method

.method public onLoadItem(Ljava/lang/String;Landroidx/media/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p1}, Landroidx/media/u;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onLoadItem(Ljava/lang/String;Landroidx/media/u;)V

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

.method public onSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/u;)V
    .locals 1
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
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p1}, Landroidx/media/u;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/u;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    invoke-static {p2, p1}, LZ/c;->handleIntent(Landroid/support/v4/media/session/y;Landroid/content/Intent;)Landroid/view/KeyEvent;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    return p1
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

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->listener:Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onTaskRemoved()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    .line 9
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

.method public playMediaItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSessionCallback:Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onPlayMediaItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public declared-synchronized setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "artCacheFile"

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/ryanheise/audioservice/AudioService;->loadArtBitmap(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->putArtToMetadata(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-string v0, "android.media.metadata.DISPLAY_ICON_URI"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const-string v2, "content:"

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const-string v2, "loadThumbnailUri"

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {p0, v0, v2}, Lcom/ryanheise/audioservice/AudioService;->loadArtBitmap(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->putArtToMetadata(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->artBitmap:Landroid/graphics/Bitmap;

    .line 58
    .line 59
    :goto_0
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 62
    .line 63
    iget-object v0, v0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 64
    .line 65
    iput-object p1, v0, Landroid/support/v4/media/session/s;->h:Landroid/support/v4/media/MediaMetadataCompat;

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v2, p1, Landroid/support/v4/media/MediaMetadataCompat;->m:Landroid/media/MediaMetadata;

    .line 72
    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-virtual {p1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat;->writeToParcel(Landroid/os/Parcel;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Landroid/media/MediaMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Landroid/media/MediaMetadata;

    .line 93
    .line 94
    iput-object v3, p1, Landroid/support/v4/media/MediaMetadataCompat;->m:Landroid/media/MediaMetadata;

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 97
    .line 98
    .line 99
    :cond_3
    iget-object p1, p1, Landroid/support/v4/media/MediaMetadataCompat;->m:Landroid/media/MediaMetadata;

    .line 100
    .line 101
    :goto_1
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->handler:Landroid/os/Handler;

    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->handler:Landroid/os/Handler;

    .line 112
    .line 113
    new-instance v0, Lcom/ryanheise/audioservice/c;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-direct {v0, p0, v1}, Lcom/ryanheise/audioservice/c;-><init>(Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-void

    .line 124
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    throw p1
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

.method public setPlaybackInfo(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 5
    .line 6
    iget-object p1, p1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroid/media/AudioAttributes$Builder;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p3, 0x3

    .line 17
    invoke-virtual {p2, p3}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Landroid/media/session/MediaSession;->setPlaybackToLocal(Landroid/media/AudioAttributes;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    if-ne p1, v0, :cond_4

    .line 35
    .line 36
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/media/J;->getVolumeControl()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/media/J;->getMaxVolume()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eq p1, v0, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 66
    .line 67
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p1, p2}, Landroidx/media/J;->setCurrentVolume(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    new-instance p1, Lcom/ryanheise/audioservice/AudioService$2;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    invoke-direct {p1, p0, p2, p3, p4}, Lcom/ryanheise/audioservice/AudioService$2;-><init>(Lcom/ryanheise/audioservice/AudioService;III)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 93
    .line 94
    :goto_1
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 95
    .line 96
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->volumeProvider:Landroidx/media/J;

    .line 97
    .line 98
    if-eqz p2, :cond_3

    .line 99
    .line 100
    iget-object p1, p1, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Landroidx/media/J;->getVolumeProvider()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Landroid/media/VolumeProvider;

    .line 110
    .line 111
    iget-object p1, p1, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Landroid/media/session/MediaSession;->setPlaybackToRemote(Landroid/media/VolumeProvider;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    const-string p2, "volumeProvider may not be null!"

    .line 123
    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_4
    :goto_2
    return-void
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
.end method

.method public declared-synchronized setQueue(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sput-object p1, Lcom/ryanheise/audioservice/AudioService;->queue:Ljava/util/List;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/y;->e(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p1
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

.method public setState(Ljava/util/List;J[ILcom/ryanheise/audioservice/AudioProcessingState;ZJJFJLjava/lang/Integer;Ljava/lang/String;IIZLjava/lang/Long;)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ryanheise/audioservice/MediaControl;",
            ">;J[I",
            "Lcom/ryanheise/audioservice/AudioProcessingState;",
            "ZJJFJ",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "IIZ",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move/from16 v5, p16

    move/from16 v6, p17

    move/from16 v7, p18

    .line 1
    iget-object v8, v1, Lcom/ryanheise/audioservice/AudioService;->compactActionIndices:[I

    invoke-static {v2, v8}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v8

    const/4 v9, 0x1

    xor-int/2addr v8, v9

    .line 2
    iget-object v10, v1, Lcom/ryanheise/audioservice/AudioService;->controls:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    move v8, v9

    .line 3
    :cond_0
    iput-object v0, v1, Lcom/ryanheise/audioservice/AudioService;->controls:Ljava/util/List;

    .line 4
    iget-object v10, v1, Lcom/ryanheise/audioservice/AudioService;->nativeActions:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->clear()V

    .line 5
    iget-object v10, v1, Lcom/ryanheise/audioservice/AudioService;->customActions:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->clear()V

    .line 6
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ryanheise/audioservice/MediaControl;

    .line 7
    invoke-virtual {v1, v10}, Lcom/ryanheise/audioservice/AudioService;->createCustomAction(Lcom/ryanheise/audioservice/MediaControl;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object v11

    if-eqz v11, :cond_1

    .line 8
    iget-object v10, v1, Lcom/ryanheise/audioservice/AudioService;->customActions:Ljava/util/List;

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    iget-object v11, v1, Lcom/ryanheise/audioservice/AudioService;->nativeActions:Ljava/util/List;

    iget-object v12, v10, Lcom/ryanheise/audioservice/MediaControl;->icon:Ljava/lang/String;

    iget-object v13, v10, Lcom/ryanheise/audioservice/MediaControl;->label:Ljava/lang/String;

    iget-wide v14, v10, Lcom/ryanheise/audioservice/MediaControl;->actionCode:J

    invoke-virtual {v1, v12, v13, v14, v15}, Lcom/ryanheise/audioservice/AudioService;->createAction(Ljava/lang/String;Ljava/lang/String;J)Lt/l;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_2
    iput-object v2, v1, Lcom/ryanheise/audioservice/AudioService;->compactActionIndices:[I

    .line 11
    iget-boolean v0, v1, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 12
    iget-object v2, v1, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 13
    iput-object v3, v1, Lcom/ryanheise/audioservice/AudioService;->processingState:Lcom/ryanheise/audioservice/AudioProcessingState;

    .line 14
    iput-boolean v4, v1, Lcom/ryanheise/audioservice/AudioService;->playing:Z

    .line 15
    iput v5, v1, Lcom/ryanheise/audioservice/AudioService;->repeatMode:I

    .line 16
    iput v6, v1, Lcom/ryanheise/audioservice/AudioService;->shuffleMode:I

    .line 17
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const-wide/32 v10, 0x37fecf

    or-long v17, p2, v10

    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->getPlaybackState()I

    move-result v11

    .line 19
    iget-object v10, v1, Lcom/ryanheise/audioservice/AudioService;->customActions:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    if-eqz v12, :cond_3

    .line 20
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 21
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "You may not add a null CustomAction to PlaybackStateCompat"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-eqz p19, :cond_5

    .line 22
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    :goto_2
    move-wide/from16 v24, v12

    goto :goto_3

    :cond_5
    const-wide/16 v12, -0x1

    goto :goto_2

    :goto_3
    const/4 v10, 0x0

    if-eqz p14, :cond_6

    if-eqz p15, :cond_6

    .line 23
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Integer;->intValue()I

    move-result v12

    :goto_4
    move-object/from16 v20, p15

    :goto_5
    move/from16 v19, v12

    goto :goto_6

    :cond_6
    if-eqz p15, :cond_7

    const v12, -0xf1206

    goto :goto_4

    :cond_7
    const/4 v12, 0x0

    move-object/from16 v20, v10

    goto :goto_5

    .line 24
    :goto_6
    iget-object v12, v1, Lcom/ryanheise/audioservice/AudioService;->mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

    if-eqz v12, :cond_8

    .line 25
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 26
    const-string v12, "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"

    iget-object v13, v1, Lcom/ryanheise/audioservice/AudioService;->mediaMetadata:Landroid/support/v4/media/MediaMetadataCompat;

    invoke-virtual {v13}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v13

    .line 27
    iget-object v13, v13, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 28
    invoke-virtual {v10, v12, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    move-object/from16 v26, v10

    .line 29
    iget-object v15, v1, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 30
    new-instance v12, Landroid/support/v4/media/session/PlaybackStateCompat;

    move-object v10, v12

    move-object v9, v12

    move-wide/from16 v12, p7

    move/from16 v27, v8

    move-object/from16 v23, v14

    move-object v8, v15

    move-wide/from16 v14, p9

    move/from16 v16, p11

    move-wide/from16 v21, p12

    invoke-direct/range {v10 .. v26}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 31
    invoke-virtual {v8, v9}, Landroid/support/v4/media/session/y;->d(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 32
    iget-object v8, v1, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 33
    iget-object v8, v8, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 34
    iget v9, v8, Landroid/support/v4/media/session/s;->j:I

    if-eq v9, v5, :cond_a

    .line 35
    iput v5, v8, Landroid/support/v4/media/session/s;->j:I

    .line 36
    iget-object v9, v8, Landroid/support/v4/media/session/s;->d:Ljava/lang/Object;

    monitor-enter v9

    .line 37
    :try_start_0
    iget-object v10, v8, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v10}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v10

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    :goto_7
    if-ltz v10, :cond_9

    .line 38
    iget-object v11, v8, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v11, v10}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v11

    check-cast v11, Landroid/support/v4/media/session/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :try_start_1
    invoke-interface {v11, v5}, Landroid/support/v4/media/session/b;->onRepeatModeChanged(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :catch_0
    :goto_8
    add-int/lit8 v10, v10, -0x1

    goto :goto_7

    .line 40
    :cond_9
    :try_start_2
    iget-object v5, v8, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v5}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 41
    monitor-exit v9

    goto :goto_a

    :goto_9
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 42
    :cond_a
    :goto_a
    iget-object v5, v1, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 43
    iget-object v5, v5, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 44
    iget v8, v5, Landroid/support/v4/media/session/s;->k:I

    if-eq v8, v6, :cond_c

    .line 45
    iput v6, v5, Landroid/support/v4/media/session/s;->k:I

    .line 46
    iget-object v8, v5, Landroid/support/v4/media/session/s;->d:Ljava/lang/Object;

    monitor-enter v8

    .line 47
    :try_start_3
    iget-object v9, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v9}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v9

    const/4 v10, 0x1

    sub-int/2addr v9, v10

    :goto_b
    if-ltz v9, :cond_b

    .line 48
    iget-object v10, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v10, v9}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v10

    check-cast v10, Landroid/support/v4/media/session/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    :try_start_4
    invoke-interface {v10, v6}, Landroid/support/v4/media/session/b;->T(I)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    goto :goto_d

    :catch_1
    :goto_c
    add-int/lit8 v9, v9, -0x1

    goto :goto_b

    .line 50
    :cond_b
    :try_start_5
    iget-object v5, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v5}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 51
    monitor-exit v8

    goto :goto_e

    :goto_d
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    .line 52
    :cond_c
    :goto_e
    iget-object v5, v1, Lcom/ryanheise/audioservice/AudioService;->mediaSession:Landroid/support/v4/media/session/y;

    .line 53
    iget-object v5, v5, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 54
    iget-boolean v6, v5, Landroid/support/v4/media/session/s;->i:Z

    if-eq v6, v7, :cond_e

    .line 55
    iput-boolean v7, v5, Landroid/support/v4/media/session/s;->i:Z

    .line 56
    iget-object v6, v5, Landroid/support/v4/media/session/s;->d:Ljava/lang/Object;

    monitor-enter v6

    .line 57
    :try_start_6
    iget-object v8, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v8}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_f
    if-ltz v8, :cond_d

    .line 58
    iget-object v9, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v9, v8}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v9

    check-cast v9, Landroid/support/v4/media/session/b;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 59
    :try_start_7
    invoke-interface {v9, v7}, Landroid/support/v4/media/session/b;->N(Z)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_10

    :catchall_2
    move-exception v0

    goto :goto_11

    :catch_2
    :goto_10
    add-int/lit8 v8, v8, -0x1

    goto :goto_f

    .line 60
    :cond_d
    :try_start_8
    iget-object v5, v5, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    invoke-virtual {v5}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 61
    monitor-exit v6

    goto :goto_12

    :goto_11
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    :cond_e
    :goto_12
    if-nez v0, :cond_f

    if-eqz v4, :cond_f

    .line 62
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->enterPlayingState()V

    goto :goto_13

    :cond_f
    if-eqz v0, :cond_10

    if-nez v4, :cond_10

    .line 63
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->exitPlayingState()V

    .line 64
    :cond_10
    :goto_13
    sget-object v0, Lcom/ryanheise/audioservice/AudioProcessingState;->idle:Lcom/ryanheise/audioservice/AudioProcessingState;

    if-eq v2, v0, :cond_11

    if-ne v3, v0, :cond_11

    .line 65
    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->stop()V

    goto :goto_14

    :cond_11
    if-eq v3, v0, :cond_12

    if-eqz v27, :cond_12

    .line 66
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->updateNotification()V

    :cond_12
    :goto_14
    return-void
.end method

.method public stop()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/audioservice/AudioService;->deactivateMediaSession()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 5
    .line 6
    .line 7
    return-void
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
