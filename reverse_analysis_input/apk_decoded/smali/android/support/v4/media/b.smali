.class public final Landroid/support/v4/media/b;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/support/v4/media/d;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/support/v4/media/b;->a:Landroid/support/v4/media/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

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


# virtual methods
.method public final onConnected()V
    .locals 10

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/b;->a:Landroid/support/v4/media/d;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/support/v4/media/d;->mConnectionCallbackInternal:Landroid/support/v4/media/c;

    .line 4
    .line 5
    if-eqz v1, :cond_5

    .line 6
    .line 7
    check-cast v1, Landroid/support/v4/media/e;

    .line 8
    .line 9
    const-string v2, "MediaBrowserCompat"

    .line 10
    .line 11
    iget-object v3, v1, Landroid/support/v4/media/e;->b:Landroid/media/browse/MediaBrowser;

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    const-string v5, "extra_service_version"

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    const-string v5, "extra_messenger"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    new-instance v6, LZ1/c;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v7, Landroid/os/Messenger;

    .line 41
    .line 42
    invoke-direct {v7, v5}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 43
    .line 44
    .line 45
    iput-object v7, v6, LZ1/c;->l:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v5, v1, Landroid/support/v4/media/e;->c:Landroid/os/Bundle;

    .line 48
    .line 49
    iput-object v5, v6, LZ1/c;->m:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v6, v1, Landroid/support/v4/media/e;->f:LZ1/c;

    .line 52
    .line 53
    new-instance v5, Landroid/os/Messenger;

    .line 54
    .line 55
    iget-object v6, v1, Landroid/support/v4/media/e;->d:Landroid/support/v4/media/a;

    .line 56
    .line 57
    invoke-direct {v5, v6}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 58
    .line 59
    .line 60
    iput-object v5, v1, Landroid/support/v4/media/e;->g:Landroid/os/Messenger;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-direct {v7, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v7, v6, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    :try_start_1
    iget-object v5, v1, Landroid/support/v4/media/e;->f:LZ1/c;

    .line 73
    .line 74
    iget-object v6, v1, Landroid/support/v4/media/e;->a:Landroid/content/Context;

    .line 75
    .line 76
    iget-object v7, v1, Landroid/support/v4/media/e;->g:Landroid/os/Messenger;

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v8, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v9, "data_package_name"

    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v6, "data_calling_pid"

    .line 96
    .line 97
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v8, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    const-string v6, "data_root_hints"

    .line 105
    .line 106
    iget-object v9, v5, LZ1/c;->m:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v9, Landroid/os/Bundle;

    .line 109
    .line 110
    invoke-virtual {v8, v6, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    const/4 v6, 0x6

    .line 114
    invoke-virtual {v5, v6, v8, v7}, LZ1/c;->l(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catch_0
    const-string v5, "Remote error registering client messenger."

    .line 119
    .line 120
    invoke-static {v2, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_1
    :goto_0
    const-string v2, "extra_session_binder"

    .line 124
    .line 125
    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget v4, Landroid/support/v4/media/session/r;->d:I

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    if-nez v2, :cond_2

    .line 133
    .line 134
    move-object v5, v4

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    const-string v5, "android.support.v4.media.session.IMediaSession"

    .line 137
    .line 138
    invoke-interface {v2, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-eqz v5, :cond_3

    .line 143
    .line 144
    instance-of v6, v5, Landroid/support/v4/media/session/d;

    .line 145
    .line 146
    if-eqz v6, :cond_3

    .line 147
    .line 148
    check-cast v5, Landroid/support/v4/media/session/d;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    new-instance v5, Landroid/support/v4/media/session/c;

    .line 152
    .line 153
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v2, v5, Landroid/support/v4/media/session/c;->c:Landroid/os/IBinder;

    .line 157
    .line 158
    :goto_1
    if-eqz v5, :cond_5

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    new-instance v4, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 167
    .line 168
    invoke-direct {v4, v2, v5}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/d;)V

    .line 169
    .line 170
    .line 171
    :cond_4
    iput-object v4, v1, Landroid/support/v4/media/e;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :catch_1
    move-exception v1

    .line 175
    const-string v3, "Unexpected IllegalStateException"

    .line 176
    .line 177
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 178
    .line 179
    .line 180
    :cond_5
    :goto_2
    invoke-virtual {v0}, Landroid/support/v4/media/d;->onConnected()V

    .line 181
    .line 182
    .line 183
    return-void
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

.method public final onConnectionFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/b;->a:Landroid/support/v4/media/d;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/support/v4/media/d;->mConnectionCallbackInternal:Landroid/support/v4/media/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/d;->onConnectionFailed()V

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

.method public final onConnectionSuspended()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/b;->a:Landroid/support/v4/media/d;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/support/v4/media/d;->mConnectionCallbackInternal:Landroid/support/v4/media/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v1, Landroid/support/v4/media/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, Landroid/support/v4/media/e;->f:LZ1/c;

    .line 11
    .line 12
    iput-object v2, v1, Landroid/support/v4/media/e;->g:Landroid/os/Messenger;

    .line 13
    .line 14
    iput-object v2, v1, Landroid/support/v4/media/e;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 15
    .line 16
    iget-object v1, v1, Landroid/support/v4/media/e;->d:Landroid/support/v4/media/a;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v3, v1, Landroid/support/v4/media/a;->b:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/d;->onConnectionSuspended()V

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
