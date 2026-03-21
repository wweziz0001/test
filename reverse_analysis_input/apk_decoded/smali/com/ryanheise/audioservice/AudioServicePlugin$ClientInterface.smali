.class Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioServicePlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClientInterface"
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;

.field private final channel:Ln3/q;

.field private context:Landroid/content/Context;

.field public final messenger:Ln3/f;

.field private serviceConnectionFailed:Z

.field private wrongEngineDetected:Z


# direct methods
.method public constructor <init>(Ln3/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->messenger:Ln3/f;

    .line 5
    .line 6
    new-instance v0, Ln3/q;

    .line 7
    .line 8
    const-string v1, "com.ryanheise.audio_service.client.methods"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->channel:Ln3/q;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ln3/q;->b(Ln3/o;)V

    .line 16
    .line 17
    .line 18
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

.method public static bridge synthetic a(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->setActivity(Landroid/app/Activity;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->setContext(Landroid/content/Context;)V

    return-void
.end method

.method private setActivity(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->activity:Landroid/app/Activity;

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

.method private setContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->context:Landroid/content/Context;

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


# virtual methods
.method public onMethodCall(Ln3/n;Ln3/p;)V
    .locals 6

    .line 1
    const-string v0, "artDownscaleHeight"

    .line 2
    .line 3
    const-string v1, "artDownscaleWidth"

    .line 4
    .line 5
    const-string v2, "notificationColor"

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->wrongEngineDetected:Z

    .line 8
    .line 9
    if-nez v3, :cond_a

    .line 10
    .line 11
    iget-object v3, p1, Ln3/n;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const v5, -0x2ff29d1a

    .line 18
    .line 19
    .line 20
    if-eq v4, v5, :cond_0

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    const-string v4, "configure"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_b

    .line 31
    .line 32
    iget-boolean v3, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->serviceConnectionFailed:Z

    .line 33
    .line 34
    if-nez v3, :cond_9

    .line 35
    .line 36
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->n()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Ln3/n;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Map;

    .line 42
    .line 43
    const-string v3, "config"

    .line 44
    .line 45
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/util/Map;

    .line 50
    .line 51
    new-instance v3, Lcom/ryanheise/audioservice/AudioServiceConfig;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->context:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-direct {v3, v4}, Lcom/ryanheise/audioservice/AudioServiceConfig;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    const-string v4, "androidNotificationClickStartsActivity"

    .line 63
    .line 64
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    iput-boolean v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationClickStartsActivity:Z

    .line 75
    .line 76
    const-string v4, "androidNotificationOngoing"

    .line 77
    .line 78
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    iput-boolean v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationOngoing:Z

    .line 89
    .line 90
    const-string v4, "androidResumeOnClick"

    .line 91
    .line 92
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iput-boolean v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidResumeOnClick:Z

    .line 103
    .line 104
    const-string v4, "androidNotificationChannelId"

    .line 105
    .line 106
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Ljava/lang/String;

    .line 111
    .line 112
    iput-object v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelId:Ljava/lang/String;

    .line 113
    .line 114
    const-string v4, "androidNotificationChannelName"

    .line 115
    .line 116
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/String;

    .line 121
    .line 122
    iput-object v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelName:Ljava/lang/String;

    .line 123
    .line 124
    const-string v4, "androidNotificationChannelDescription"

    .line 125
    .line 126
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Ljava/lang/String;

    .line 131
    .line 132
    iput-object v4, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationChannelDescription:Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    const/4 v5, -0x1

    .line 139
    if-nez v4, :cond_1

    .line 140
    .line 141
    move v2, v5

    .line 142
    goto :goto_0

    .line 143
    :cond_1
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->getInt(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    :goto_0
    iput v2, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->notificationColor:I

    .line 156
    .line 157
    const-string v2, "androidNotificationIcon"

    .line 158
    .line 159
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Ljava/lang/String;

    .line 164
    .line 165
    iput-object v2, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidNotificationIcon:Ljava/lang/String;

    .line 166
    .line 167
    const-string v2, "androidShowNotificationBadge"

    .line 168
    .line 169
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iput-boolean v2, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidShowNotificationBadge:Z

    .line 180
    .line 181
    const-string v2, "androidStopForegroundOnPause"

    .line 182
    .line 183
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    iput-boolean v2, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->androidStopForegroundOnPause:Z

    .line 194
    .line 195
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-eqz v2, :cond_2

    .line 200
    .line 201
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    goto :goto_1

    .line 212
    :catch_0
    move-exception p1

    .line 213
    goto/16 :goto_3

    .line 214
    .line 215
    :cond_2
    move v1, v5

    .line 216
    :goto_1
    iput v1, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleWidth:I

    .line 217
    .line 218
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_3

    .line 223
    .line 224
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    :cond_3
    iput v5, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->artDownscaleHeight:I

    .line 235
    .line 236
    const-string v0, "androidBrowsableRootExtras"

    .line 237
    .line 238
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Ljava/util/Map;

    .line 243
    .line 244
    invoke-virtual {v3, p1}, Lcom/ryanheise/audioservice/AudioServiceConfig;->setBrowsableRootExtras(Ljava/util/Map;)V

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->activity:Landroid/app/Activity;

    .line 248
    .line 249
    if-eqz p1, :cond_4

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iput-object p1, v3, Lcom/ryanheise/audioservice/AudioServiceConfig;->activityClassName:Ljava/lang/String;

    .line 260
    .line 261
    :cond_4
    invoke-virtual {v3}, Lcom/ryanheise/audioservice/AudioServiceConfig;->save()V

    .line 262
    .line 263
    .line 264
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->instance:Lcom/ryanheise/audioservice/AudioService;

    .line 265
    .line 266
    if-eqz p1, :cond_5

    .line 267
    .line 268
    invoke-virtual {p1, v3}, Lcom/ryanheise/audioservice/AudioService;->configure(Lcom/ryanheise/audioservice/AudioServiceConfig;)V

    .line 269
    .line 270
    .line 271
    :cond_5
    invoke-static {p0}, Lcom/ryanheise/audioservice/AudioServicePlugin;->o(Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;)V

    .line 272
    .line 273
    .line 274
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    if-nez p1, :cond_6

    .line 279
    .line 280
    new-instance p1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 281
    .line 282
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->messenger:Ln3/f;

    .line 283
    .line 284
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;-><init>(Ln3/f;)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->l(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;)V

    .line 288
    .line 289
    .line 290
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->init(Lcom/ryanheise/audioservice/AudioService$ServiceListener;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_6
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    iget-object p1, p1, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->messenger:Ln3/f;

    .line 303
    .line 304
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->messenger:Ln3/f;

    .line 305
    .line 306
    if-eq p1, v0, :cond_7

    .line 307
    .line 308
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->messenger:Ln3/f;

    .line 313
    .line 314
    invoke-virtual {p1, v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->switchToMessenger(Ln3/f;)V

    .line 315
    .line 316
    .line 317
    :cond_7
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->d()Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->invokePendingMethods()V

    .line 322
    .line 323
    .line 324
    :goto_2
    invoke-static {}, Lcom/ryanheise/audioservice/AudioServicePlugin;->k()Landroid/support/v4/media/session/l;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    if-eqz p1, :cond_8

    .line 329
    .line 330
    const/4 p1, 0x0

    .line 331
    new-array p1, p1, [Ljava/lang/Object;

    .line 332
    .line 333
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-interface {p2, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_8
    invoke-static {p2}, Lcom/ryanheise/audioservice/AudioServicePlugin;->m(Ln3/p;)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 346
    .line 347
    const-string v0, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    .line 348
    .line 349
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw p1

    .line 353
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 354
    .line 355
    const-string v0, "The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions."

    .line 356
    .line 357
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    const/4 v0, 0x0

    .line 369
    invoke-interface {p2, p1, v0, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_b
    :goto_4
    return-void
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

.method public setServiceConnectionFailed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->serviceConnectionFailed:Z

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

.method public setWrongEngineDetected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->wrongEngineDetected:Z

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

.method public wasLaunchedFromRecents()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioServicePlugin$ClientInterface;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x100000

    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    return v0
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
