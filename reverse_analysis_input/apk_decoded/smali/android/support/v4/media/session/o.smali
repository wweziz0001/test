.class public final Landroid/support/v4/media/session/o;
.super Landroid/media/session/MediaSession$Callback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/support/v4/media/session/p;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/session/MediaSession$Callback;-><init>()V

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

.method public static b(Landroid/support/v4/media/session/s;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroid/support/v4/media/session/s;->a:Landroid/media/session/MediaSession;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "getCallingPackage"

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    move-object v1, v0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    const-string v2, "MediaSessionCompat"

    .line 31
    .line 32
    const-string v3, "Cannot execute MediaSession.getCallingPackage()"

    .line 33
    .line 34
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string v1, "android.media.session.MediaController"

    .line 44
    .line 45
    :cond_1
    new-instance v0, Landroidx/media/B;

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-direct {v0, v2, v1, v2}, Landroidx/media/B;-><init>(ILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, v0}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final a()Landroid/support/v4/media/session/s;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/support/v4/media/session/p;->mLock:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 7
    .line 8
    iget-object v1, v1, Landroid/support/v4/media/session/p;->mSessionImpl:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/support/v4/media/session/s;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/support/v4/media/session/s;->a()Landroid/support/v4/media/session/p;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
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

.method public final onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    const-string v2, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    new-instance p1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object p2, v0, Landroid/support/v4/media/session/s;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->d()Landroid/support/v4/media/session/d;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "android.support.v4.media.session.EXTRA_BINDER"

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 45
    .line 46
    .line 47
    const-string v2, "android.support.v4.media.session.SESSION_TOKEN2"

    .line 48
    .line 49
    iget-object v3, p2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->l:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter v3
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    :try_start_1
    iget-object p2, p2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->o:LD1/e;

    .line 53
    .line 54
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :try_start_2
    new-instance v3, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v4, Landroidx/versionedparcelable/ParcelImpl;

    .line 64
    .line 65
    invoke-direct {v4, p2}, Landroidx/versionedparcelable/ParcelImpl;-><init>(LD1/e;)V

    .line 66
    .line 67
    .line 68
    const-string p2, "a"

    .line 69
    .line 70
    invoke-virtual {v3, p2, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    const/4 p2, 0x0

    .line 77
    invoke-virtual {p3, p2, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/BadParcelableException; {:try_start_2 .. :try_end_2} :catch_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    :try_start_4
    throw p1

    .line 85
    :cond_3
    const-string v2, "android.support.v4.media.session.command.ADD_QUEUE_ITEM"

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    iget-object p1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 94
    .line 95
    const-string p3, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 96
    .line 97
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/p;->onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_4
    const-string v2, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    .line 109
    .line 110
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    iget-object p1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 117
    .line 118
    const-string p3, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 119
    .line 120
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    check-cast p3, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 125
    .line 126
    const-string v2, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 127
    .line 128
    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-virtual {p1, p3, p2}, Landroid/support/v4/media/session/p;->onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    const-string v2, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_6

    .line 143
    .line 144
    iget-object p1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 145
    .line 146
    const-string p3, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 147
    .line 148
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/p;->onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    const-string v2, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    iget-object p1, v0, Landroid/support/v4/media/session/s;->g:Ljava/util/List;

    .line 167
    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    const-string p1, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 171
    .line 172
    const/4 p3, -0x1

    .line 173
    invoke-virtual {p2, p1, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-ltz p1, :cond_7

    .line 178
    .line 179
    iget-object p2, v0, Landroid/support/v4/media/session/s;->g:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-ge p1, p2, :cond_7

    .line 186
    .line 187
    iget-object p2, v0, Landroid/support/v4/media/session/s;->g:Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_7
    move-object p1, v1

    .line 197
    :goto_2
    if-eqz p1, :cond_9

    .line 198
    .line 199
    iget-object p2, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 200
    .line 201
    iget-object p1, p1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->l:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 202
    .line 203
    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/p;->onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    iget-object v2, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 208
    .line 209
    invoke-virtual {v2, p1, p2, p3}, Landroid/support/v4/media/session/p;->onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    :try_end_4
    .catch Landroid/os/BadParcelableException; {:try_start_4 .. :try_end_4} :catch_0

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catch_0
    const-string p1, "MediaSessionCompat"

    .line 214
    .line 215
    const-string p2, "Could not unparcel the extra data."

    .line 216
    .line 217
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    :cond_9
    :goto_3
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

    .line 221
    .line 222
    .line 223
    return-void
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
.end method

.method public final onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    const-string v1, "android.support.v4.media.session.action.PLAY_FROM_URI"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    const-string v2, "android.support.v4.media.session.action.ARGUMENT_URI"

    .line 21
    .line 22
    const-string v3, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 23
    .line 24
    iget-object v4, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/net/Uri;

    .line 33
    .line 34
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_1
    const-string v1, "android.support.v4.media.session.action.PREPARE"

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v4}, Landroid/support/v4/media/session/p;->onPrepare()V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_2
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_3
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_QUERY"

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_4
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_URI"

    .line 112
    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Landroid/net/Uri;

    .line 124
    .line 125
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_5
    const-string v1, "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"

    .line 138
    .line 139
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"

    .line 146
    .line 147
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-virtual {v4, p1}, Landroid/support/v4/media/session/p;->onSetCaptioningEnabled(Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_6
    const-string v1, "android.support.v4.media.session.action.SET_REPEAT_MODE"

    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"

    .line 164
    .line 165
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    invoke-virtual {v4, p1}, Landroid/support/v4/media/session/p;->onSetRepeatMode(I)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_7
    const-string v1, "android.support.v4.media.session.action.SET_SHUFFLE_MODE"

    .line 174
    .line 175
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_8

    .line 180
    .line 181
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"

    .line 182
    .line 183
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    invoke-virtual {v4, p1}, Landroid/support/v4/media/session/p;->onSetShuffleMode(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_8
    const-string v1, "android.support.v4.media.session.action.SET_RATING"

    .line 192
    .line 193
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_9

    .line 198
    .line 199
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_RATING"

    .line 200
    .line 201
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Landroid/support/v4/media/RatingCompat;

    .line 206
    .line 207
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_9
    const-string v1, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"

    .line 219
    .line 220
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"

    .line 227
    .line 228
    const/high16 v1, 0x3f800000    # 1.0f

    .line 229
    .line 230
    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    invoke-virtual {v4, p1}, Landroid/support/v4/media/session/p;->onSetPlaybackSpeed(F)V

    .line 235
    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_a
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/media/session/p;->onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    .line 241
    goto :goto_0

    .line 242
    :catch_0
    const-string p1, "MediaSessionCompat"

    .line 243
    .line 244
    const-string p2, "Could not unparcel the data."

    .line 245
    .line 246
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    :goto_0
    const/4 p1, 0x0

    .line 250
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

    .line 251
    .line 252
    .line 253
    return-void
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

.method public final onFastForward()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onFastForward()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onMediaButtonEvent(Landroid/content/Intent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroid/support/v4/media/session/p;->onMediaButtonEvent(Landroid/content/Intent;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-interface {v0, v3}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

    .line 20
    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-super {p0, p1}, Landroid/media/session/MediaSession$Callback;->onMediaButtonEvent(Landroid/content/Intent;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 v1, 0x1

    .line 31
    :cond_2
    return v1
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

.method public final onPause()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onPause()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onPlay()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onPlay()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onPrepare()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onPrepare()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onRewind()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onRewind()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onSeekTo(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onSeekTo(J)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onSetPlaybackSpeed(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/p;->onSetPlaybackSpeed(F)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onSetRating(Landroid/media/Rating;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-static {p1}, Landroid/support/v4/media/RatingCompat;->d(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/p;->onSetRating(Landroid/support/v4/media/RatingCompat;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onSkipToNext()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onSkipToNext()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onSkipToPrevious()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onSkipToPrevious()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method

.method public final onSkipToQueueItem(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/p;->onSkipToQueueItem(J)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {v0, p1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/support/v4/media/session/o;->a()Landroid/support/v4/media/session/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Landroid/support/v4/media/session/o;->b(Landroid/support/v4/media/session/s;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/o;->a:Landroid/support/v4/media/session/p;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/session/p;->onStop()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Landroid/support/v4/media/session/q;->d(Landroidx/media/B;)V

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
.end method
