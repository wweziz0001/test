.class Lcom/ryanheise/audioservice/AudioServicePlugin$2;
.super Landroid/support/v4/media/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioServicePlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioServicePlugin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;->this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/support/v4/media/d;-><init>()V

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
.method public onConnected()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;->this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->b(Lcom/ryanheise/audioservice/AudioServicePlugin;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :try_start_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->j()Landroid/support/v4/media/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v1, v1, Landroid/support/v4/media/g;->a:Landroid/support/v4/media/e;

    .line 16
    .line 17
    iget-object v2, v1, Landroid/support/v4/media/e;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    iget-object v2, v1, Landroid/support/v4/media/e;->b:Landroid/media/browse/MediaBrowser;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 30
    .line 31
    invoke-direct {v3, v2, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/d;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v3, v0

    .line 36
    :goto_0
    iput-object v3, v1, Landroid/support/v4/media/e;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 37
    .line 38
    :cond_2
    iget-object v1, v1, Landroid/support/v4/media/e;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 39
    .line 40
    new-instance v2, Landroid/support/v4/media/session/l;

    .line 41
    .line 42
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;->this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 43
    .line 44
    invoke-static {v3}, Lcom/ryanheise/audioservice/AudioServicePlugin;->b(Lcom/ryanheise/audioservice/AudioServicePlugin;)Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v2, v3, v1}, Landroid/support/v4/media/session/l;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->p(Landroid/support/v4/media/session/l;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->i()Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->i()Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception v1

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object v1, v0

    .line 72
    :goto_1
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->k()Landroid/support/v4/media/session/l;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v1, v2}, Landroid/support/v4/media/session/l;->b(Landroid/app/Activity;Landroid/support/v4/media/session/l;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->k()Landroid/support/v4/media/session/l;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->g()Landroid/support/v4/media/session/g;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/l;->a(Landroid/support/v4/media/session/g;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v2, 0x0

    .line 103
    new-array v2, v2, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v1, v2}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->m(Ln3/p;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :goto_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 117
    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v4, "onConnected error: "

    .line 121
    .line 122
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v2, v1, v0, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;->this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 173
    .line 174
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->c(Lcom/ryanheise/audioservice/AudioServicePlugin;)Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const/4 v1, 0x1

    .line 179
    invoke-virtual {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->setServiceConnectionFailed(Z)V

    .line 180
    .line 181
    .line 182
    :cond_6
    :goto_3
    return-void
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

.method public onConnectionFailed()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->f()Ln3/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, v2, v2}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$2;->this$0:Lcom/ryanheise/audioservice/AudioServicePlugin;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->c(Lcom/ryanheise/audioservice/AudioServicePlugin;)Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->setServiceConnectionFailed(Z)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
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

.method public onConnectionSuspended()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "### UNHANDLED: onConnectionSuspended"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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
