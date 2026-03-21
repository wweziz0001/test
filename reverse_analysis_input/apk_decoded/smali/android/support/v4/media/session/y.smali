.class public final Landroid/support/v4/media/session/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:I


# instance fields
.field public final a:Landroid/support/v4/media/session/s;

.field public final b:Landroid/support/v4/media/session/l;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Landroid/support/v4/media/session/y;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const-string v0, "media-session"

    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_7

    .line 18
    .line 19
    invoke-static {p1}, LZ/c;->getMediaButtonReceiverComponent(Landroid/content/Context;)Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v1, "MediaSessionCompat"

    .line 26
    .line 27
    const-string v2, "Couldn\'t find a unique registered media button receiver in the given context."

    .line 28
    .line 29
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    if-eqz v0, :cond_2

    .line 33
    .line 34
    new-instance v1, Landroid/content/Intent;

    .line 35
    .line 36
    const-string v2, "android.intent.action.MEDIA_BUTTON"

    .line 37
    .line 38
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v2, 0x1f

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-lt v0, v2, :cond_1

    .line 50
    .line 51
    const/high16 v0, 0x2000000

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v0, v3

    .line 55
    :goto_0
    invoke-static {p1, v3, v1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v0, 0x0

    .line 61
    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v2, 0x1d

    .line 64
    .line 65
    if-lt v1, v2, :cond_3

    .line 66
    .line 67
    new-instance v1, Landroid/support/v4/media/session/u;

    .line 68
    .line 69
    invoke-direct {v1, p1}, Landroid/support/v4/media/session/s;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const/16 v2, 0x1c

    .line 76
    .line 77
    if-lt v1, v2, :cond_4

    .line 78
    .line 79
    new-instance v1, Landroid/support/v4/media/session/t;

    .line 80
    .line 81
    invoke-direct {v1, p1}, Landroid/support/v4/media/session/s;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    new-instance v1, Landroid/support/v4/media/session/s;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Landroid/support/v4/media/session/s;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 93
    .line 94
    :goto_2
    new-instance v1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :goto_3
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 112
    .line 113
    .line 114
    new-instance v2, Landroid/support/v4/media/session/m;

    .line 115
    .line 116
    invoke-direct {v2}, Landroid/support/v4/media/session/p;-><init>()V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 120
    .line 121
    invoke-virtual {v3, v2, v1}, Landroid/support/v4/media/session/s;->f(Landroid/support/v4/media/session/p;Landroid/os/Handler;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 125
    .line 126
    iget-object v1, v1, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Landroid/support/v4/media/session/l;

    .line 132
    .line 133
    iget-object v1, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 134
    .line 135
    iget-object v1, v1, Landroid/support/v4/media/session/s;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 136
    .line 137
    invoke-direct {v0, p1, v1}, Landroid/support/v4/media/session/l;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Landroid/support/v4/media/session/y;->b:Landroid/support/v4/media/session/l;

    .line 141
    .line 142
    sget v0, Landroid/support/v4/media/session/y;->d:I

    .line 143
    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const/4 v0, 0x1

    .line 155
    const/high16 v1, 0x43a00000    # 320.0f

    .line 156
    .line 157
    invoke-static {v0, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    const/high16 v0, 0x3f000000    # 0.5f

    .line 162
    .line 163
    add-float/2addr p1, v0

    .line 164
    float-to-int p1, p1

    .line 165
    sput p1, Landroid/support/v4/media/session/y;->d:I

    .line 166
    .line 167
    :cond_6
    return-void

    .line 168
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    const-string v0, "tag must not be null or empty"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1
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

.method public static a(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, Landroid/support/v4/media/session/y;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    :cond_0
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
.end method

.method public static f(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p0}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :catch_0
    const-string p0, "MediaSessionCompat"

    .line 13
    .line 14
    const-string v1, "Could not unparcel the data."

    .line 15
    .line 16
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-object v0
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


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/session/MediaSession;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public final c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroid/support/v4/media/session/y;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p1, Ljava/lang/ClassCastException;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method public final d(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    iput-object p1, v0, Landroid/support/v4/media/session/s;->f:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 4
    .line 5
    iget-object v1, v0, Landroid/support/v4/media/session/s;->d:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/lit8 v2, v2, -0x1

    .line 15
    .line 16
    :goto_0
    if-ltz v2, :cond_0

    .line 17
    .line 18
    iget-object v3, v0, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/support/v4/media/session/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    :try_start_1
    invoke-interface {v3, p1}, Landroid/support/v4/media/session/b;->V(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_3

    .line 32
    :catch_0
    :goto_1
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :try_start_2
    iget-object v2, v0, Landroid/support/v4/media/session/s;->e:Landroid/os/RemoteCallbackList;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 38
    .line 39
    .line 40
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 42
    .line 43
    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->w:Landroid/media/session/PlaybackState;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    invoke-static {}, Landroid/support/v4/media/session/z;->d()Landroid/media/session/PlaybackState$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v6, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->o:F

    .line 52
    .line 53
    iget-wide v7, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->s:J

    .line 54
    .line 55
    iget v3, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->l:I

    .line 56
    .line 57
    iget-wide v4, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->m:J

    .line 58
    .line 59
    move-object v2, v1

    .line 60
    invoke-static/range {v2 .. v8}, Landroid/support/v4/media/session/z;->x(Landroid/media/session/PlaybackState$Builder;IJFJ)V

    .line 61
    .line 62
    .line 63
    iget-wide v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Landroid/support/v4/media/session/z;->u(Landroid/media/session/PlaybackState$Builder;J)V

    .line 66
    .line 67
    .line 68
    iget-wide v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->p:J

    .line 69
    .line 70
    invoke-static {v1, v2, v3}, Landroid/support/v4/media/session/z;->s(Landroid/media/session/PlaybackState$Builder;J)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->r:Ljava/lang/CharSequence;

    .line 74
    .line 75
    invoke-static {v1, v2}, Landroid/support/v4/media/session/z;->v(Landroid/media/session/PlaybackState$Builder;Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->t:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 95
    .line 96
    iget-object v4, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->p:Landroid/media/session/PlaybackState$CustomAction;

    .line 97
    .line 98
    if-nez v4, :cond_1

    .line 99
    .line 100
    iget v4, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->n:I

    .line 101
    .line 102
    iget-object v5, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->l:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v6, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->m:Ljava/lang/CharSequence;

    .line 105
    .line 106
    invoke-static {v5, v6, v4}, Landroid/support/v4/media/session/z;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/media/session/PlaybackState$CustomAction$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iget-object v3, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->o:Landroid/os/Bundle;

    .line 111
    .line 112
    invoke-static {v4, v3}, Landroid/support/v4/media/session/z;->w(Landroid/media/session/PlaybackState$CustomAction$Builder;Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v4}, Landroid/support/v4/media/session/z;->b(Landroid/media/session/PlaybackState$CustomAction$Builder;)Landroid/media/session/PlaybackState$CustomAction;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :cond_1
    invoke-static {v1, v4}, Landroid/support/v4/media/session/z;->a(Landroid/media/session/PlaybackState$Builder;Landroid/media/session/PlaybackState$CustomAction;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_2
    iget-wide v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->u:J

    .line 124
    .line 125
    invoke-static {v1, v2, v3}, Landroid/support/v4/media/session/z;->t(Landroid/media/session/PlaybackState$Builder;J)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->v:Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-static {v1, v2}, Landroid/support/v4/media/session/A;->b(Landroid/media/session/PlaybackState$Builder;Landroid/os/Bundle;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Landroid/support/v4/media/session/z;->c(Landroid/media/session/PlaybackState$Builder;)Landroid/media/session/PlaybackState;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->w:Landroid/media/session/PlaybackState;

    .line 138
    .line 139
    :cond_3
    iget-object p1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->w:Landroid/media/session/PlaybackState;

    .line 140
    .line 141
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    throw p1
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

.method public final e(Ljava/util/List;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-wide v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->m:J

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v5, "Found duplicate queue id: "

    .line 41
    .line 42
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v5, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v6, "id of each queue item should be unique"

    .line 55
    .line 56
    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v6, "MediaSessionCompat"

    .line 60
    .line 61
    invoke-static {v6, v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string v0, "queue shouldn\'t have null items"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    iget-object v0, p0, Landroid/support/v4/media/session/y;->a:Landroid/support/v4/media/session/s;

    .line 81
    .line 82
    iput-object p1, v0, Landroid/support/v4/media/session/s;->g:Ljava/util/List;

    .line 83
    .line 84
    iget-object v0, v0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 85
    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 117
    .line 118
    iget-object v3, v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->n:Landroid/media/session/MediaSession$QueueItem;

    .line 119
    .line 120
    if-nez v3, :cond_4

    .line 121
    .line 122
    iget-object v3, v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->l:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 123
    .line 124
    invoke-virtual {v3}, Landroid/support/v4/media/MediaDescriptionCompat;->e()Landroid/media/MediaDescription;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iget-wide v4, v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->m:J

    .line 129
    .line 130
    invoke-static {v3, v4, v5}, Landroid/support/v4/media/session/w;->a(Landroid/media/MediaDescription;J)Landroid/media/session/MediaSession$QueueItem;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iput-object v3, v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->n:Landroid/media/session/MediaSession$QueueItem;

    .line 135
    .line 136
    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    return-void
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
