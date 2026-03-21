.class public Lcom/ryanheise/just_audio/AudioPlayer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;
.implements La0/M;
.implements Lr0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;,
        Lcom/ryanheise/just_audio/AudioPlayer$ObserverRenderer;
    }
.end annotation


# static fields
.field public static final ERROR_ABORT:I = 0x989680

.field static final TAG:Ljava/lang/String; = "AudioPlayer"

.field private static random:Ljava/util/Random;


# instance fields
.field private audioEffects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/media/audiofx/AudioEffect;",
            ">;"
        }
    .end annotation
.end field

.field private audioEffectsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/media/audiofx/AudioEffect;",
            ">;"
        }
    .end annotation
.end field

.field private audioOffloadPreferences:La0/X;

.field private audioSessionId:Ljava/lang/Integer;

.field private final bufferWatcher:Ljava/lang/Runnable;

.field private bufferedPosition:J

.field private final context:Landroid/content/Context;

.field private currentIndex:Ljava/lang/Integer;

.field private final dataEventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

.field private errorCode:Ljava/lang/Integer;

.field private errorMessage:Ljava/lang/String;

.field private final eventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

.field private final handler:Landroid/os/Handler;

.field private icyHeaders:LS0/b;

.field private icyInfo:LS0/c;

.field private lastPlaylistLength:I

.field private livePlaybackSpeedControl:Lh0/O;

.field private loadControl:Lh0/Q;

.field private mediaSources:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx0/J;",
            ">;"
        }
    .end annotation
.end field

.field private final methodChannel:Ln3/q;

.field private offloadSchedulingEnabled:Z

.field private pendingAudioAttributes:La0/c;

.field private pendingPlaybackEvent:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private playResult:Ln3/p;

.field private player:Lh0/s;

.field private prepareResult:Ln3/p;

.field private processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

.field private rawAudioEffects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private seekPos:Ljava/lang/Long;

.field private seekResult:Ln3/p;

.field private updatePosition:J

.field private updateTime:J

.field private useLazyPreparation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ryanheise/just_audio/AudioPlayer;->random:Ljava/util/Random;

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

.method public constructor <init>(Landroid/content/Context;Ln3/f;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Z)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln3/f;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/lang/Boolean;",
            "Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v5, v0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 20
    .line 21
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v5, v0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffects:Ljava/util/List;

    .line 27
    .line 28
    new-instance v5, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v5, v0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    iput v5, v0, Lcom/ryanheise/just_audio/AudioPlayer;->lastPlaylistLength:I

    .line 37
    .line 38
    new-instance v6, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    iput-object v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v6, Lcom/ryanheise/just_audio/AudioPlayer$1;

    .line 50
    .line 51
    invoke-direct {v6, v0}, Lcom/ryanheise/just_audio/AudioPlayer$1;-><init>(Lcom/ryanheise/just_audio/AudioPlayer;)V

    .line 52
    .line 53
    .line 54
    iput-object v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferWatcher:Ljava/lang/Runnable;

    .line 55
    .line 56
    move-object/from16 v6, p1

    .line 57
    .line 58
    iput-object v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->context:Landroid/content/Context;

    .line 59
    .line 60
    move-object/from16 v6, p5

    .line 61
    .line 62
    iput-object v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->rawAudioEffects:Ljava/util/List;

    .line 63
    .line 64
    if-eqz p7, :cond_0

    .line 65
    .line 66
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move v6, v5

    .line 72
    :goto_0
    iput-boolean v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->offloadSchedulingEnabled:Z

    .line 73
    .line 74
    move/from16 v6, p8

    .line 75
    .line 76
    iput-boolean v6, v0, Lcom/ryanheise/just_audio/AudioPlayer;->useLazyPreparation:Z

    .line 77
    .line 78
    const/4 v6, 0x1

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    new-instance v7, La0/W;

    .line 82
    .line 83
    invoke-direct {v7}, La0/W;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v8, "isGaplessSupportRequired"

    .line 87
    .line 88
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    iput-boolean v8, v7, La0/W;->b:Z

    .line 99
    .line 100
    const-string v8, "isSpeedChangeSupportRequired"

    .line 101
    .line 102
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    iput-boolean v8, v7, La0/W;->c:Z

    .line 113
    .line 114
    const-string v8, "audioOffloadMode"

    .line 115
    .line 116
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    iput v4, v7, La0/W;->a:I

    .line 127
    .line 128
    new-instance v4, La0/X;

    .line 129
    .line 130
    invoke-direct {v4, v7}, La0/X;-><init>(La0/W;)V

    .line 131
    .line 132
    .line 133
    iput-object v4, v0, Lcom/ryanheise/just_audio/AudioPlayer;->audioOffloadPreferences:La0/X;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    new-instance v7, La0/W;

    .line 141
    .line 142
    invoke-direct {v7}, La0/W;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    xor-int/2addr v8, v6

    .line 150
    iput-boolean v8, v7, La0/W;->b:Z

    .line 151
    .line 152
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    xor-int/2addr v8, v6

    .line 157
    iput-boolean v8, v7, La0/W;->c:Z

    .line 158
    .line 159
    iput v4, v7, La0/W;->a:I

    .line 160
    .line 161
    new-instance v4, La0/X;

    .line 162
    .line 163
    invoke-direct {v4, v7}, La0/X;-><init>(La0/W;)V

    .line 164
    .line 165
    .line 166
    iput-object v4, v0, Lcom/ryanheise/just_audio/AudioPlayer;->audioOffloadPreferences:La0/X;

    .line 167
    .line 168
    :goto_1
    new-instance v4, Ln3/q;

    .line 169
    .line 170
    const-string v7, "com.ryanheise.just_audio.methods."

    .line 171
    .line 172
    invoke-static {v7, v2}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-direct {v4, v1, v7}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iput-object v4, v0, Lcom/ryanheise/just_audio/AudioPlayer;->methodChannel:Ln3/q;

    .line 180
    .line 181
    invoke-virtual {v4, v0}, Ln3/q;->b(Ln3/o;)V

    .line 182
    .line 183
    .line 184
    new-instance v4, Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 185
    .line 186
    const-string v7, "com.ryanheise.just_audio.events."

    .line 187
    .line 188
    invoke-static {v7, v2}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-direct {v4, v1, v7}, Lcom/ryanheise/just_audio/BetterEventChannel;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-object v4, v0, Lcom/ryanheise/just_audio/AudioPlayer;->eventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 196
    .line 197
    new-instance v4, Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 198
    .line 199
    const-string v7, "com.ryanheise.just_audio.data."

    .line 200
    .line 201
    invoke-static {v7, v2}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-direct {v4, v1, v2}, Lcom/ryanheise/just_audio/BetterEventChannel;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    iput-object v4, v0, Lcom/ryanheise/just_audio/AudioPlayer;->dataEventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 209
    .line 210
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 211
    .line 212
    iput-object v1, v0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 213
    .line 214
    if-eqz v3, :cond_b

    .line 215
    .line 216
    const-string v1, "androidLoadControl"

    .line 217
    .line 218
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Ljava/util/Map;

    .line 223
    .line 224
    const-wide/16 v7, 0x3e8

    .line 225
    .line 226
    if-eqz v1, :cond_3

    .line 227
    .line 228
    const-string v2, "minBufferDuration"

    .line 229
    .line 230
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide v9

    .line 242
    div-long/2addr v9, v7

    .line 243
    long-to-int v13, v9

    .line 244
    const-string v2, "maxBufferDuration"

    .line 245
    .line 246
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    div-long/2addr v9, v7

    .line 259
    long-to-int v14, v9

    .line 260
    const-string v2, "bufferForPlaybackDuration"

    .line 261
    .line 262
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v9

    .line 274
    div-long/2addr v9, v7

    .line 275
    long-to-int v15, v9

    .line 276
    const-string v2, "bufferForPlaybackAfterRebufferDuration"

    .line 277
    .line 278
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    div-long/2addr v9, v7

    .line 291
    long-to-int v2, v9

    .line 292
    const-string v4, "bufferForPlaybackMs"

    .line 293
    .line 294
    const-string v9, "0"

    .line 295
    .line 296
    invoke-static {v15, v5, v4, v9}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    const-string v10, "bufferForPlaybackAfterRebufferMs"

    .line 300
    .line 301
    invoke-static {v2, v5, v10, v9}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    const-string v11, "minBufferMs"

    .line 305
    .line 306
    invoke-static {v13, v15, v11, v4}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v13, v2, v11, v10}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    const-string v4, "maxBufferMs"

    .line 313
    .line 314
    invoke-static {v14, v13, v4, v11}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const-string v4, "prioritizeTimeOverSizeThresholds"

    .line 318
    .line 319
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    check-cast v4, Ljava/lang/Boolean;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 326
    .line 327
    .line 328
    move-result v18

    .line 329
    const-string v4, "backBufferDuration"

    .line 330
    .line 331
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-static {v4}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v10

    .line 343
    div-long/2addr v10, v7

    .line 344
    long-to-int v4, v10

    .line 345
    const-string v10, "backBufferDurationMs"

    .line 346
    .line 347
    invoke-static {v4, v5, v10, v9}, Lh0/m;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    const-string v9, "targetBufferBytes"

    .line 351
    .line 352
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    if-eqz v10, :cond_2

    .line 357
    .line 358
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    :goto_2
    move/from16 v17, v1

    .line 369
    .line 370
    goto :goto_3

    .line 371
    :cond_2
    const/4 v1, -0x1

    .line 372
    goto :goto_2

    .line 373
    :goto_3
    new-instance v12, LB0/f;

    .line 374
    .line 375
    invoke-direct {v12}, LB0/f;-><init>()V

    .line 376
    .line 377
    .line 378
    new-instance v1, Lh0/m;

    .line 379
    .line 380
    move-object v11, v1

    .line 381
    move/from16 v16, v2

    .line 382
    .line 383
    move/from16 v19, v4

    .line 384
    .line 385
    invoke-direct/range {v11 .. v19}, Lh0/m;-><init>(LB0/f;IIIIIZI)V

    .line 386
    .line 387
    .line 388
    iput-object v1, v0, Lcom/ryanheise/just_audio/AudioPlayer;->loadControl:Lh0/Q;

    .line 389
    .line 390
    :cond_3
    const-string v1, "androidLivePlaybackSpeedControl"

    .line 391
    .line 392
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    check-cast v1, Ljava/util/Map;

    .line 397
    .line 398
    if-eqz v1, :cond_b

    .line 399
    .line 400
    sget v2, Ld0/w;->a:I

    .line 401
    .line 402
    const-string v2, "fallbackMinPlaybackSpeed"

    .line 403
    .line 404
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Ljava/lang/Double;

    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 411
    .line 412
    .line 413
    move-result-wide v2

    .line 414
    double-to-float v10, v2

    .line 415
    const/4 v2, 0x0

    .line 416
    cmpg-float v3, v2, v10

    .line 417
    .line 418
    const/high16 v4, 0x3f800000    # 1.0f

    .line 419
    .line 420
    if-gez v3, :cond_4

    .line 421
    .line 422
    cmpg-float v3, v10, v4

    .line 423
    .line 424
    if-gtz v3, :cond_4

    .line 425
    .line 426
    move v3, v6

    .line 427
    goto :goto_4

    .line 428
    :cond_4
    move v3, v5

    .line 429
    :goto_4
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 430
    .line 431
    .line 432
    const-string v3, "fallbackMaxPlaybackSpeed"

    .line 433
    .line 434
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    check-cast v3, Ljava/lang/Double;

    .line 439
    .line 440
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 441
    .line 442
    .line 443
    move-result-wide v11

    .line 444
    double-to-float v11, v11

    .line 445
    cmpl-float v3, v11, v4

    .line 446
    .line 447
    if-ltz v3, :cond_5

    .line 448
    .line 449
    move v3, v6

    .line 450
    goto :goto_5

    .line 451
    :cond_5
    move v3, v5

    .line 452
    :goto_5
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 453
    .line 454
    .line 455
    const-string v3, "minUpdateInterval"

    .line 456
    .line 457
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-static {v3}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 466
    .line 467
    .line 468
    move-result-wide v12

    .line 469
    div-long/2addr v12, v7

    .line 470
    const-wide/16 v14, 0x0

    .line 471
    .line 472
    cmp-long v3, v12, v14

    .line 473
    .line 474
    if-lez v3, :cond_6

    .line 475
    .line 476
    move v3, v6

    .line 477
    goto :goto_6

    .line 478
    :cond_6
    move v3, v5

    .line 479
    :goto_6
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 480
    .line 481
    .line 482
    const-string v3, "proportionalControlFactor"

    .line 483
    .line 484
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    check-cast v3, Ljava/lang/Double;

    .line 489
    .line 490
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 491
    .line 492
    .line 493
    move-result-wide v5

    .line 494
    double-to-float v3, v5

    .line 495
    cmpl-float v5, v3, v2

    .line 496
    .line 497
    if-lez v5, :cond_7

    .line 498
    .line 499
    const/4 v5, 0x1

    .line 500
    goto :goto_7

    .line 501
    :cond_7
    const/4 v5, 0x0

    .line 502
    :goto_7
    invoke-static {v5}, Ld0/m;->c(Z)V

    .line 503
    .line 504
    .line 505
    const v5, 0x49742400    # 1000000.0f

    .line 506
    .line 507
    .line 508
    div-float/2addr v3, v5

    .line 509
    const-string v5, "maxLiveOffsetErrorForUnitSpeed"

    .line 510
    .line 511
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-static {v5}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 520
    .line 521
    .line 522
    move-result-wide v5

    .line 523
    div-long/2addr v5, v7

    .line 524
    cmp-long v16, v5, v14

    .line 525
    .line 526
    if-lez v16, :cond_8

    .line 527
    .line 528
    const/16 v16, 0x1

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_8
    const/16 v16, 0x0

    .line 532
    .line 533
    :goto_8
    invoke-static/range {v16 .. v16}, Ld0/m;->c(Z)V

    .line 534
    .line 535
    .line 536
    invoke-static {v5, v6}, Ld0/w;->M(J)J

    .line 537
    .line 538
    .line 539
    move-result-wide v5

    .line 540
    const-string v9, "targetLiveOffsetIncrementOnRebuffer"

    .line 541
    .line 542
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    invoke-static {v9}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 551
    .line 552
    .line 553
    move-result-wide v16

    .line 554
    div-long v16, v16, v7

    .line 555
    .line 556
    cmp-long v7, v16, v14

    .line 557
    .line 558
    if-ltz v7, :cond_9

    .line 559
    .line 560
    const/4 v7, 0x1

    .line 561
    goto :goto_9

    .line 562
    :cond_9
    const/4 v7, 0x0

    .line 563
    :goto_9
    invoke-static {v7}, Ld0/m;->c(Z)V

    .line 564
    .line 565
    .line 566
    invoke-static/range {v16 .. v17}, Ld0/w;->M(J)J

    .line 567
    .line 568
    .line 569
    move-result-wide v17

    .line 570
    const-string v7, "minPossibleLiveOffsetSmoothingFactor"

    .line 571
    .line 572
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Ljava/lang/Double;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 579
    .line 580
    .line 581
    move-result-wide v7

    .line 582
    double-to-float v1, v7

    .line 583
    cmpl-float v2, v1, v2

    .line 584
    .line 585
    if-ltz v2, :cond_a

    .line 586
    .line 587
    cmpg-float v2, v1, v4

    .line 588
    .line 589
    if-gez v2, :cond_a

    .line 590
    .line 591
    const/4 v2, 0x1

    .line 592
    goto :goto_a

    .line 593
    :cond_a
    const/4 v2, 0x0

    .line 594
    :goto_a
    invoke-static {v2}, Ld0/m;->c(Z)V

    .line 595
    .line 596
    .line 597
    new-instance v2, Lh0/k;

    .line 598
    .line 599
    move-object v9, v2

    .line 600
    move v14, v3

    .line 601
    move-wide v15, v5

    .line 602
    move/from16 v19, v1

    .line 603
    .line 604
    invoke-direct/range {v9 .. v19}, Lh0/k;-><init>(FFJFJJF)V

    .line 605
    .line 606
    .line 607
    iput-object v2, v0, Lcom/ryanheise/just_audio/AudioPlayer;->livePlaybackSpeedControl:Lh0/O;

    .line 608
    .line 609
    :cond_b
    return-void
.end method

.method public static synthetic a(Ln3/p;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->lambda$onMethodCall$0(Ln3/p;)V

    return-void
.end method

.method private abortExistingConnection(Z)V
    .locals 3

    .line 1
    const-string v0, "Connection aborted"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x989680

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v2, v0, v1, p1}, Lcom/ryanheise/just_audio/AudioPlayer;->sendError(ILjava/lang/String;Ljava/lang/Object;Z)V

    .line 8
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

.method private abortSeek()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ln3/p;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

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

.method private audioEffectSetEnabled(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/media/audiofx/AudioEffect;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

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

.method public static synthetic b(Lcom/ryanheise/just_audio/AudioPlayer;Landroid/os/Handler;Lh0/D;Lh0/D;Lh0/D;Lh0/D;)[Lh0/o0;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/ryanheise/just_audio/AudioPlayer;->lambda$ensurePlayerInitialized$3(Landroid/os/Handler;LD0/A;Lj0/h;Lz0/d;Lr0/b;)[Lh0/o0;

    move-result-object p0

    return-object p0
.end method

.method private broadcastImmediatePlaybackEvent()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastPendingPlaybackEvent()V

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

.method private broadcastPendingPlaybackEvent()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingPlaybackEvent:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->eventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/ryanheise/just_audio/BetterEventChannel;->success(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingPlaybackEvent:Ljava/util/Map;

    .line 12
    .line 13
    :cond_0
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

.method private buildDataSourceFactory(Ljava/util/Map;)Lf0/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Lf0/g;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1}, Lcom/ryanheise/just_audio/AudioPlayer;->castToStringMap(Ljava/util/Map;)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v1, "User-Agent"

    .line 9
    .line 10
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, "user-agent"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->context:Landroid/content/Context;

    .line 31
    .line 32
    sget v2, Ld0/w;->a:I

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catch_0
    const-string v1, "?"

    .line 51
    .line 52
    :goto_1
    const-string v2, "just_audio/"

    .line 53
    .line 54
    const-string v3, " (Linux;Android "

    .line 55
    .line 56
    invoke-static {v2, v1, v3}, Lb3/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 61
    .line 62
    const-string v3, ") AndroidXMedia3/1.5.1"

    .line 63
    .line 64
    invoke-static {v1, v2, v3}, Lm/B0;->i(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :cond_2
    new-instance v2, La1/e;

    .line 69
    .line 70
    invoke-direct {v2, v0}, La1/e;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v1, v2, La1/e;->p:Ljava/lang/Object;

    .line 74
    .line 75
    iput-boolean v0, v2, La1/e;->n:Z

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-lez v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {v2, p1}, La1/e;->d(Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    new-instance p1, LZ1/e;

    .line 89
    .line 90
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->context:Landroid/content/Context;

    .line 91
    .line 92
    invoke-direct {p1, v0, v2}, LZ1/e;-><init>(Landroid/content/Context;La1/e;)V

    .line 93
    .line 94
    .line 95
    return-object p1
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

.method private buildExtractorsFactory(Ljava/util/Map;)LF0/n;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "LF0/n;"
        }
    .end annotation

    .line 1
    new-instance v0, LF0/n;

    .line 2
    .line 3
    invoke-direct {v0}, LF0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v1, "androidExtractorOptions"

    .line 9
    .line 10
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string v1, "constantBitrateSeekingEnabled"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-string v2, "constantBitrateSeekingAlwaysEnabled"

    .line 31
    .line 32
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "mp3Flags"

    .line 43
    .line 44
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v1, 0x1

    .line 56
    const/4 v2, 0x0

    .line 57
    move p1, v2

    .line 58
    :goto_0
    monitor-enter v0

    .line 59
    :try_start_0
    iput-boolean v1, v0, LF0/n;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    monitor-enter v0

    .line 63
    :try_start_1
    iput-boolean v2, v0, LF0/n;->m:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    monitor-enter v0

    .line 67
    :try_start_2
    iput p1, v0, LF0/n;->n:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-object v0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    throw p1

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 76
    throw p1

    .line 77
    :catchall_2
    move-exception p1

    .line 78
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 79
    throw p1
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

.method public static synthetic c(Ln3/p;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->lambda$onMethodCall$1(Ln3/p;)V

    return-void
.end method

.method public static castToStringMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
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

.method private clearAudioEffects()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffects:Ljava/util/List;

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
    check-cast v1, Landroid/media/audiofx/AudioEffect;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/media/audiofx/AudioEffect;->release()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Map;->clear()V

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

.method private collectIcyMetadata()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
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
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyInfo:LS0/c;

    .line 7
    .line 8
    const-string v2, "url"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyInfo:LS0/c;

    .line 18
    .line 19
    iget-object v3, v3, LS0/c;->m:Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "title"

    .line 22
    .line 23
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyInfo:LS0/c;

    .line 27
    .line 28
    iget-object v3, v3, LS0/c;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v3, "info"

    .line 34
    .line 35
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 48
    .line 49
    iget v3, v3, LS0/b;->l:I

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string v4, "bitrate"

    .line 56
    .line 57
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 61
    .line 62
    iget-object v3, v3, LS0/b;->m:Ljava/lang/String;

    .line 63
    .line 64
    const-string v4, "genre"

    .line 65
    .line 66
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 70
    .line 71
    iget-object v3, v3, LS0/b;->n:Ljava/lang/String;

    .line 72
    .line 73
    const-string v4, "name"

    .line 74
    .line 75
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 79
    .line 80
    iget v3, v3, LS0/b;->q:I

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v4, "metadataInterval"

    .line 87
    .line 88
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 92
    .line 93
    iget-object v3, v3, LS0/b;->o:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 99
    .line 100
    iget-boolean v2, v2, LS0/b;->p:Z

    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "isPublic"

    .line 107
    .line 108
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const-string v2, "headers"

    .line 112
    .line 113
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_1
    return-object v0
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

.method private completeSeek()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 5
    .line 6
    new-instance v2, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, v2}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 15
    .line 16
    return-void
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

.method private concatenating(Ljava/lang/Object;)Lx0/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lx0/s;

    .line 10
    .line 11
    return-object p1
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

.method private createPlaybackEvent()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
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
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    const-wide/16 v2, 0x3e8

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    mul-long/2addr v4, v2

    .line 28
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    iget-object v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    check-cast v4, Lh0/G;

    .line 37
    .line 38
    invoke-virtual {v4}, Lh0/G;->s()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    :goto_1
    iput-wide v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferedPosition:J

    .line 46
    .line 47
    iget-object v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const-string v5, "processingState"

    .line 58
    .line 59
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-wide v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition:J

    .line 63
    .line 64
    mul-long/2addr v4, v2

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const-string v5, "updatePosition"

    .line 70
    .line 71
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-wide v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updateTime:J

    .line 75
    .line 76
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "updateTime"

    .line 81
    .line 82
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-wide v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition:J

    .line 86
    .line 87
    iget-wide v6, p0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferedPosition:J

    .line 88
    .line 89
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    mul-long/2addr v4, v2

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-string v3, "bufferedPosition"

    .line 99
    .line 100
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v2, "icyMetadata"

    .line 104
    .line 105
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->collectIcyMetadata()Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    const-string v2, "duration"

    .line 113
    .line 114
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v1, "currentIndex"

    .line 118
    .line 119
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    const-string v1, "androidAudioSessionId"

    .line 125
    .line 126
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioSessionId:Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    const-string v1, "errorCode"

    .line 132
    .line 133
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-string v1, "errorMessage"

    .line 139
    .line 140
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    return-object v0
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

.method public static synthetic d(Ln3/p;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->lambda$onMethodCall$2(Ln3/p;)V

    return-void
.end method

.method private decodeAudioEffect(Ljava/lang/Object;I)Landroid/media/audiofx/AudioEffect;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "type"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v2, "AndroidEqualizer"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const-string v2, "AndroidLoudnessEnhancer"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const-string v0, "targetGain"

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Double;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 43
    .line 44
    mul-double/2addr v0, v2

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    long-to-int p1, v0

    .line 50
    new-instance v0, Landroid/media/audiofx/LoudnessEnhancer;

    .line 51
    .line 52
    invoke-direct {v0, p2}, Landroid/media/audiofx/LoudnessEnhancer;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v2, "Unknown AudioEffect type: "

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_1
    new-instance p1, Landroid/media/audiofx/Equalizer;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {p1, v0, p2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 87
    .line 88
    .line 89
    return-object p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method private decodeAudioSource(Ljava/lang/Object;)Lx0/J;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    check-cast v2, Ljava/util/Map;

    .line 7
    .line 8
    const-string v3, "id"

    .line 9
    .line 10
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    move-object v10, v3

    .line 15
    check-cast v10, Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "type"

    .line 18
    .line 19
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v5, "child"

    .line 29
    .line 30
    const-string v6, "uri"

    .line 31
    .line 32
    const-string v7, "headers"

    .line 33
    .line 34
    const-wide/16 v8, 0x0

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v15, 0x0

    .line 38
    const/4 v12, -0x1

    .line 39
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    sparse-switch v13, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_0
    const-string v13, "silence"

    .line 48
    .line 49
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v12, 0x6

    .line 57
    goto :goto_0

    .line 58
    :sswitch_1
    const-string v13, "progressive"

    .line 59
    .line 60
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v12, 0x5

    .line 68
    goto :goto_0

    .line 69
    :sswitch_2
    const-string v13, "clipping"

    .line 70
    .line 71
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v12, 0x4

    .line 79
    goto :goto_0

    .line 80
    :sswitch_3
    const-string v13, "looping"

    .line 81
    .line 82
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v12, 0x3

    .line 90
    goto :goto_0

    .line 91
    :sswitch_4
    const-string v13, "dash"

    .line 92
    .line 93
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const/4 v12, 0x2

    .line 101
    goto :goto_0

    .line 102
    :sswitch_5
    const-string v13, "hls"

    .line 103
    .line 104
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_5

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    move v12, v1

    .line 112
    goto :goto_0

    .line 113
    :sswitch_6
    const-string v13, "concatenating"

    .line 114
    .line 115
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_6

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_6
    move v12, v11

    .line 123
    :goto_0
    packed-switch v12, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    new-instance v4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v5, "Unknown AudioSource type: "

    .line 131
    .line 132
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :pswitch_0
    const-string v3, "duration"

    .line 151
    .line 152
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    cmp-long v4, v2, v8

    .line 165
    .line 166
    if-lez v4, :cond_7

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    move v1, v11

    .line 170
    :goto_1
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 171
    .line 172
    .line 173
    new-instance v1, Lx0/m0;

    .line 174
    .line 175
    sget-object v4, Lx0/m0;->v:La0/A;

    .line 176
    .line 177
    invoke-virtual {v4}, La0/A;->a()La0/r;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iput-object v10, v4, La0/r;->h:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v4}, La0/r;->a()La0/A;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-direct {v1, v2, v3, v4}, Lx0/m0;-><init>(JLa0/A;)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_1
    invoke-static {v2, v7}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    check-cast v3, Ljava/util/Map;

    .line 196
    .line 197
    invoke-direct {v0, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->buildDataSourceFactory(Ljava/util/Map;)Lf0/g;

    .line 198
    .line 199
    .line 200
    move-result-object v18

    .line 201
    const-string v3, "options"

    .line 202
    .line 203
    invoke-static {v2, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Ljava/util/Map;

    .line 208
    .line 209
    invoke-direct {v0, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->buildExtractorsFactory(Ljava/util/Map;)LF0/n;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    new-instance v13, LI2/g;

    .line 214
    .line 215
    const/16 v4, 0x1a

    .line 216
    .line 217
    invoke-direct {v13, v3, v4}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    new-instance v3, LA0/b;

    .line 221
    .line 222
    invoke-direct {v3, v1}, LA0/b;-><init>(I)V

    .line 223
    .line 224
    .line 225
    new-instance v1, LF0/u;

    .line 226
    .line 227
    invoke-direct {v1}, LF0/u;-><init>()V

    .line 228
    .line 229
    .line 230
    sget-object v4, Lm2/I;->m:Lm2/G;

    .line 231
    .line 232
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 233
    .line 234
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    sget-object v9, Lm2/b0;->p:Lm2/b0;

    .line 239
    .line 240
    new-instance v14, La0/u;

    .line 241
    .line 242
    invoke-direct {v14}, La0/u;-><init>()V

    .line 243
    .line 244
    .line 245
    sget-object v25, La0/x;->a:La0/x;

    .line 246
    .line 247
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    if-eqz v5, :cond_8

    .line 258
    .line 259
    new-instance v2, La0/w;

    .line 260
    .line 261
    const/4 v6, 0x0

    .line 262
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    move-object v4, v2

    .line 268
    move-object v7, v15

    .line 269
    invoke-direct/range {v4 .. v12}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 270
    .line 271
    .line 272
    move-object v15, v2

    .line 273
    :cond_8
    new-instance v2, La0/A;

    .line 274
    .line 275
    new-instance v4, La0/t;

    .line 276
    .line 277
    invoke-direct {v4, v1}, La0/s;-><init>(LF0/u;)V

    .line 278
    .line 279
    .line 280
    new-instance v1, La0/v;

    .line 281
    .line 282
    invoke-direct {v1, v14}, La0/v;-><init>(La0/u;)V

    .line 283
    .line 284
    .line 285
    sget-object v24, La0/D;->B:La0/D;

    .line 286
    .line 287
    const-string v20, ""

    .line 288
    .line 289
    move-object/from16 v19, v2

    .line 290
    .line 291
    move-object/from16 v21, v4

    .line 292
    .line 293
    move-object/from16 v22, v15

    .line 294
    .line 295
    move-object/from16 v23, v1

    .line 296
    .line 297
    invoke-direct/range {v19 .. v25}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 298
    .line 299
    .line 300
    iget-object v1, v2, La0/A;->b:La0/w;

    .line 301
    .line 302
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    new-instance v4, Lx0/a0;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    sget-object v20, Lm0/i;->a:Lm0/g;

    .line 314
    .line 315
    const/high16 v22, 0x100000

    .line 316
    .line 317
    const/16 v23, 0x0

    .line 318
    .line 319
    move-object/from16 v16, v4

    .line 320
    .line 321
    move-object/from16 v17, v2

    .line 322
    .line 323
    move-object/from16 v19, v13

    .line 324
    .line 325
    move-object/from16 v21, v3

    .line 326
    .line 327
    invoke-direct/range {v16 .. v23}, Lx0/a0;-><init>(La0/A;Lf0/g;LI2/g;Lm0/i;LA0/b;IZ)V

    .line 328
    .line 329
    .line 330
    return-object v4

    .line 331
    :pswitch_2
    const-string v1, "start"

    .line 332
    .line 333
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v1}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    const-string v3, "end"

    .line 342
    .line 343
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-static {v3}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    new-instance v4, Lx0/g;

    .line 352
    .line 353
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-direct {v0, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSource(Ljava/lang/Object;)Lx0/J;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    if-eqz v1, :cond_9

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 364
    .line 365
    .line 366
    move-result-wide v8

    .line 367
    :cond_9
    move-wide v12, v8

    .line 368
    if-eqz v3, :cond_a

    .line 369
    .line 370
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 371
    .line 372
    .line 373
    move-result-wide v1

    .line 374
    :goto_2
    move-wide v14, v1

    .line 375
    goto :goto_3

    .line 376
    :cond_a
    const-wide/high16 v1, -0x8000000000000000L

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :goto_3
    const/16 v16, 0x1

    .line 380
    .line 381
    move-object v10, v4

    .line 382
    invoke-direct/range {v10 .. v16}, Lx0/g;-><init>(Lx0/J;JJZ)V

    .line 383
    .line 384
    .line 385
    return-object v4

    .line 386
    :pswitch_3
    const-string v3, "count"

    .line 387
    .line 388
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-direct {v0, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSource(Ljava/lang/Object;)Lx0/J;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    new-array v4, v3, [Lx0/J;

    .line 407
    .line 408
    move v5, v11

    .line 409
    :goto_4
    if-ge v5, v3, :cond_b

    .line 410
    .line 411
    aput-object v2, v4, v5

    .line 412
    .line 413
    add-int/2addr v5, v1

    .line 414
    goto :goto_4

    .line 415
    :cond_b
    new-instance v1, Lx0/s;

    .line 416
    .line 417
    new-instance v2, Lx0/i0;

    .line 418
    .line 419
    invoke-direct {v2}, Lx0/i0;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-direct {v1, v11, v2, v4}, Lx0/s;-><init>(ZLx0/j0;[Lx0/J;)V

    .line 423
    .line 424
    .line 425
    return-object v1

    .line 426
    :pswitch_4
    new-instance v1, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 427
    .line 428
    invoke-static {v2, v7}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    check-cast v3, Ljava/util/Map;

    .line 433
    .line 434
    invoke-direct {v0, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->buildDataSourceFactory(Ljava/util/Map;)Lf0/g;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    invoke-direct {v1, v3}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;-><init>(Lf0/g;)V

    .line 439
    .line 440
    .line 441
    new-instance v3, LF0/u;

    .line 442
    .line 443
    invoke-direct {v3}, LF0/u;-><init>()V

    .line 444
    .line 445
    .line 446
    sget-object v4, Lm2/I;->m:Lm2/G;

    .line 447
    .line 448
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 449
    .line 450
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    sget-object v9, Lm2/b0;->p:Lm2/b0;

    .line 455
    .line 456
    new-instance v13, La0/u;

    .line 457
    .line 458
    invoke-direct {v13}, La0/u;-><init>()V

    .line 459
    .line 460
    .line 461
    sget-object v22, La0/x;->a:La0/x;

    .line 462
    .line 463
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, Ljava/lang/String;

    .line 468
    .line 469
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    if-eqz v5, :cond_c

    .line 474
    .line 475
    new-instance v2, La0/w;

    .line 476
    .line 477
    const-string v6, "application/dash+xml"

    .line 478
    .line 479
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    move-object v4, v2

    .line 485
    move-object v7, v15

    .line 486
    invoke-direct/range {v4 .. v12}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v19, v2

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_c
    move-object/from16 v19, v15

    .line 493
    .line 494
    :goto_5
    new-instance v2, La0/A;

    .line 495
    .line 496
    new-instance v4, La0/t;

    .line 497
    .line 498
    invoke-direct {v4, v3}, La0/s;-><init>(LF0/u;)V

    .line 499
    .line 500
    .line 501
    new-instance v3, La0/v;

    .line 502
    .line 503
    invoke-direct {v3, v13}, La0/v;-><init>(La0/u;)V

    .line 504
    .line 505
    .line 506
    sget-object v21, La0/D;->B:La0/D;

    .line 507
    .line 508
    const-string v17, ""

    .line 509
    .line 510
    move-object/from16 v16, v2

    .line 511
    .line 512
    move-object/from16 v18, v4

    .line 513
    .line 514
    move-object/from16 v20, v3

    .line 515
    .line 516
    invoke-direct/range {v16 .. v22}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d(La0/A;)Lk0/g;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    return-object v1

    .line 524
    :pswitch_5
    new-instance v1, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 525
    .line 526
    invoke-static {v2, v7}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    check-cast v3, Ljava/util/Map;

    .line 531
    .line 532
    invoke-direct {v0, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->buildDataSourceFactory(Ljava/util/Map;)Lf0/g;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-direct {v1, v3}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Lf0/g;)V

    .line 537
    .line 538
    .line 539
    new-instance v3, LF0/u;

    .line 540
    .line 541
    invoke-direct {v3}, LF0/u;-><init>()V

    .line 542
    .line 543
    .line 544
    sget-object v4, Lm2/I;->m:Lm2/G;

    .line 545
    .line 546
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 547
    .line 548
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v16

    .line 552
    sget-object v17, Lm2/b0;->p:Lm2/b0;

    .line 553
    .line 554
    new-instance v4, La0/u;

    .line 555
    .line 556
    invoke-direct {v4}, La0/u;-><init>()V

    .line 557
    .line 558
    .line 559
    sget-object v5, La0/x;->a:La0/x;

    .line 560
    .line 561
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    check-cast v2, Ljava/lang/String;

    .line 566
    .line 567
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    if-eqz v13, :cond_d

    .line 572
    .line 573
    new-instance v2, La0/w;

    .line 574
    .line 575
    const-string v14, "application/x-mpegURL"

    .line 576
    .line 577
    const/16 v18, 0x0

    .line 578
    .line 579
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    move-object v12, v2

    .line 585
    invoke-direct/range {v12 .. v20}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 586
    .line 587
    .line 588
    move-object v10, v2

    .line 589
    goto :goto_6

    .line 590
    :cond_d
    move-object v10, v15

    .line 591
    :goto_6
    new-instance v2, La0/A;

    .line 592
    .line 593
    new-instance v9, La0/t;

    .line 594
    .line 595
    invoke-direct {v9, v3}, La0/s;-><init>(LF0/u;)V

    .line 596
    .line 597
    .line 598
    new-instance v11, La0/v;

    .line 599
    .line 600
    invoke-direct {v11, v4}, La0/v;-><init>(La0/u;)V

    .line 601
    .line 602
    .line 603
    sget-object v12, La0/D;->B:La0/D;

    .line 604
    .line 605
    const-string v8, ""

    .line 606
    .line 607
    move-object v7, v2

    .line 608
    move-object v13, v5

    .line 609
    invoke-direct/range {v7 .. v13}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d(La0/A;)Ln0/l;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    return-object v1

    .line 617
    :pswitch_6
    new-instance v1, Lx0/s;

    .line 618
    .line 619
    const-string v3, "useLazyPreparation"

    .line 620
    .line 621
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    check-cast v3, Ljava/lang/Boolean;

    .line 626
    .line 627
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    const-string v4, "shuffleOrder"

    .line 632
    .line 633
    invoke-static {v2, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    check-cast v4, Ljava/util/List;

    .line 638
    .line 639
    invoke-direct {v0, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    const-string v5, "children"

    .line 644
    .line 645
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-direct {v0, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSourcesArray(Ljava/lang/Object;)[Lx0/J;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-direct {v1, v3, v4, v2}, Lx0/s;-><init>(ZLx0/j0;[Lx0/J;)V

    .line 654
    .line 655
    .line 656
    return-object v1

    .line 657
    :sswitch_data_0
    .sparse-switch
        -0x1a9425ce -> :sswitch_6
        0x193ef -> :sswitch_5
        0x2eef92 -> :sswitch_4
        0x14db9ebe -> :sswitch_3
        0x36c0fcc2 -> :sswitch_2
        0x43720b8b -> :sswitch_1
        0x7cbaf4a1 -> :sswitch_0
    .end sparse-switch

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
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
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
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
.end method

.method private decodeShuffleOrder(Ljava/util/List;)Lx0/j0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lx0/j0;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aput v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lx0/i0;

    .line 26
    .line 27
    sget-object v2, Lcom/ryanheise/just_audio/AudioPlayer;->random:Ljava/util/Random;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ljava/util/Random;

    .line 38
    .line 39
    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v0, v1}, Lx0/i0;-><init>([ILjava/util/Random;)V

    .line 43
    .line 44
    .line 45
    return-object p1
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

.method public static bridge synthetic e(Lcom/ryanheise/just_audio/AudioPlayer;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferedPosition:J

    return-wide v0
.end method

.method private enqueuePlaybackEvent()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->createPlaybackEvent()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingPlaybackEvent:Ljava/util/Map;

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

.method private ensurePlayerInitialized()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    new-instance v0, Lcom/ryanheise/just_audio/b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/ryanheise/just_audio/b;-><init>(Lcom/ryanheise/just_audio/AudioPlayer;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lh0/q;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->context:Landroid/content/Context;

    .line 13
    .line 14
    new-instance v3, Lh0/p;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-direct {v3, v0, v4}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lh0/d;

    .line 21
    .line 22
    invoke-direct {v0, v2, v4}, Lh0/d;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2, v3, v0}, Lh0/q;-><init>(Landroid/content/Context;Ll2/h;Ll2/h;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->useLazyPreparation:Z

    .line 29
    .line 30
    iget-boolean v2, v1, Lh0/q;->s:Z

    .line 31
    .line 32
    xor-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 35
    .line 36
    .line 37
    iput-boolean v0, v1, Lh0/q;->m:Z

    .line 38
    .line 39
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->loadControl:Lh0/Q;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-boolean v2, v1, Lh0/q;->s:Z

    .line 44
    .line 45
    xor-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lh0/p;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, v0, v3}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v1, Lh0/q;->f:Ll2/h;

    .line 57
    .line 58
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->livePlaybackSpeedControl:Lh0/O;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-boolean v2, v1, Lh0/q;->s:Z

    .line 63
    .line 64
    xor-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 67
    .line 68
    .line 69
    iput-object v0, v1, Lh0/q;->o:Lh0/O;

    .line 70
    .line 71
    :cond_1
    invoke-virtual {v1}, Lh0/q;->a()Lh0/G;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 76
    .line 77
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, Lh0/G;->h:LA0/z;

    .line 81
    .line 82
    move-object v2, v1

    .line 83
    check-cast v2, LA0/u;

    .line 84
    .line 85
    invoke-virtual {v2}, LA0/u;->d()LA0/m;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v3, LA0/l;

    .line 93
    .line 94
    invoke-direct {v3, v2}, LA0/l;-><init>(LA0/m;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioOffloadPreferences:La0/X;

    .line 98
    .line 99
    iput-object v2, v3, La0/Y;->m:La0/X;

    .line 100
    .line 101
    new-instance v2, LA0/m;

    .line 102
    .line 103
    invoke-direct {v2, v3}, LA0/m;-><init>(LA0/l;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast v1, LA0/u;

    .line 113
    .line 114
    invoke-virtual {v1}, LA0/u;->d()LA0/m;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v2, v3}, LA0/m;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {v1, v2}, LA0/u;->i(LA0/m;)V

    .line 126
    .line 127
    .line 128
    new-instance v3, LA0/l;

    .line 129
    .line 130
    invoke-virtual {v1}, LA0/u;->d()LA0/m;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-direct {v3, v4}, LA0/l;-><init>(LA0/m;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, La0/Y;->a(LA0/m;)V

    .line 138
    .line 139
    .line 140
    new-instance v4, LA0/m;

    .line 141
    .line 142
    invoke-direct {v4, v3}, LA0/m;-><init>(LA0/l;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v4}, LA0/u;->i(LA0/m;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, LA0/e;

    .line 149
    .line 150
    invoke-direct {v1, v2}, LA0/e;-><init>(LA0/m;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, Lh0/G;->l:Ld0/l;

    .line 154
    .line 155
    const/16 v2, 0x13

    .line 156
    .line 157
    invoke-virtual {v0, v2, v1}, Ld0/l;->e(ILd0/i;)V

    .line 158
    .line 159
    .line 160
    :goto_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 161
    .line 162
    check-cast v0, Lh0/G;

    .line 163
    .line 164
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 165
    .line 166
    .line 167
    iget v0, v0, Lh0/G;->T:I

    .line 168
    .line 169
    invoke-direct {p0, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->setAudioSessionId(I)V

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 173
    .line 174
    check-cast v0, Lh0/G;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Lh0/G;->l:Ld0/l;

    .line 180
    .line 181
    invoke-virtual {v0, p0}, Ld0/l;->a(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_3
    return-void
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

.method private equalizerAudioEffectGetParameters()Ljava/util/Map;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 4
    .line 5
    const-string v2, "AndroidEqualizer"

    .line 6
    .line 7
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/media/audiofx/Equalizer;

    .line 12
    .line 13
    new-instance v7, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    if-ge v3, v4, :cond_0

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-virtual {v1, v3}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    aget v4, v4, v2

    .line 38
    .line 39
    int-to-double v11, v4

    .line 40
    const-wide v13, 0x408f400000000000L    # 1000.0

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    div-double/2addr v11, v13

    .line 46
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    invoke-virtual {v1, v3}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    aget v4, v4, v8

    .line 55
    .line 56
    int-to-double v8, v4

    .line 57
    div-double/2addr v8, v13

    .line 58
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v1, v3}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    int-to-double v8, v8

    .line 67
    div-double/2addr v8, v13

    .line 68
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 69
    .line 70
    .line 71
    move-result-object v16

    .line 72
    invoke-virtual {v1, v3}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    int-to-double v8, v8

    .line 77
    div-double/2addr v8, v5

    .line 78
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 79
    .line 80
    .line 81
    move-result-object v18

    .line 82
    const-string v9, "index"

    .line 83
    .line 84
    const-string v11, "lowerFrequency"

    .line 85
    .line 86
    const-string v13, "upperFrequency"

    .line 87
    .line 88
    const-string v15, "centerFrequency"

    .line 89
    .line 90
    const-string v17, "gain"

    .line 91
    .line 92
    move-object v14, v4

    .line 93
    filled-new-array/range {v9 .. v18}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {v4}, Lcom/ryanheise/just_audio/AudioPlayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    int-to-short v3, v3

    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    aget-short v2, v3, v2

    .line 113
    .line 114
    int-to-double v2, v2

    .line 115
    div-double/2addr v2, v5

    .line 116
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    aget-short v1, v1, v8

    .line 125
    .line 126
    int-to-double v1, v1

    .line 127
    div-double/2addr v1, v5

    .line 128
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    const-string v6, "bands"

    .line 133
    .line 134
    const-string v2, "minDecibels"

    .line 135
    .line 136
    const-string v4, "maxDecibels"

    .line 137
    .line 138
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v2, "parameters"

    .line 147
    .line 148
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    return-object v1
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

.method private equalizerBandSetGain(ID)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 2
    .line 3
    const-string v1, "AndroidEqualizer"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/media/audiofx/Equalizer;

    .line 10
    .line 11
    int-to-short p1, p1

    .line 12
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    .line 13
    .line 14
    mul-double/2addr p2, v1

    .line 15
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 16
    .line 17
    .line 18
    move-result-wide p2

    .line 19
    long-to-int p2, p2

    .line 20
    int-to-short p2, p2

    .line 21
    invoke-virtual {v0, p1, p2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

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

.method public static bridge synthetic f(Lcom/ryanheise/just_audio/AudioPlayer;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/ryanheise/just_audio/AudioPlayer;)Lh0/s;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    return-object p0
.end method

.method private getAudioSource(Ljava/lang/Object;)Lx0/J;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/J;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeAudioSource(Ljava/lang/Object;)Lx0/J;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object v1
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

.method private getAudioSources(Ljava/lang/Object;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lx0/J;",
            ">;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {p0, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSource(Ljava/lang/Object;)Lx0/J;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "List expected: "

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private getAudioSourcesArray(Ljava/lang/Object;)[Lx0/J;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSources(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Lx0/J;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method private getCurrentPosition()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 2
    .line 3
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 37
    .line 38
    check-cast v0, Lh0/G;

    .line 39
    .line 40
    invoke-virtual {v0}, Lh0/G;->x()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0

    .line 45
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 46
    .line 47
    check-cast v0, Lh0/G;

    .line 48
    .line 49
    invoke-virtual {v0}, Lh0/G;->x()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    cmp-long v4, v0, v2

    .line 56
    .line 57
    if-gez v4, :cond_3

    .line 58
    .line 59
    move-wide v0, v2

    .line 60
    :cond_3
    return-wide v0
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

.method private getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 2
    .line 3
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast v0, Lh0/G;

    .line 17
    .line 18
    invoke-virtual {v0}, Lh0/G;->B()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    return-wide v0
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

.method private getLowerCaseExtension(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "."

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    const-string p1, "^.*\\."

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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

.method public static bridge synthetic h(Lcom/ryanheise/just_audio/AudioPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    return-void
.end method

.method public static bridge synthetic i(Lcom/ryanheise/just_audio/AudioPlayer;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePositionIfChanged()Z

    move-result p0

    return p0
.end method

.method private synthetic lambda$ensurePlayerInitialized$3(Landroid/os/Handler;LD0/A;Lj0/h;Lz0/d;Lr0/b;)[Lh0/o0;
    .locals 6

    .line 1
    new-instance v0, Lh0/n;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh0/n;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move-object v5, p5

    .line 13
    invoke-virtual/range {v0 .. v5}, Lh0/n;->a(Landroid/os/Handler;LD0/A;Lj0/h;Lz0/d;Lr0/b;)[Lh0/o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    array-length p2, p1

    .line 18
    add-int/lit8 p2, p2, 0x1

    .line 19
    .line 20
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, [Lh0/o0;

    .line 25
    .line 26
    array-length p1, p1

    .line 27
    new-instance p3, Lcom/ryanheise/just_audio/AudioPlayer$ObserverRenderer;

    .line 28
    .line 29
    invoke-direct {p3, p0}, Lcom/ryanheise/just_audio/AudioPlayer$ObserverRenderer;-><init>(Lcom/ryanheise/just_audio/AudioPlayer;)V

    .line 30
    .line 31
    .line 32
    aput-object p3, p2, p1

    .line 33
    .line 34
    return-object p2
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
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
.end method

.method private static synthetic lambda$onMethodCall$0(Ln3/p;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ln3/p;->success(Ljava/lang/Object;)V

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

.method private static synthetic lambda$onMethodCall$1(Ln3/p;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ln3/p;->success(Ljava/lang/Object;)V

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

.method private static synthetic lambda$onMethodCall$2(Ln3/p;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ln3/p;->success(Ljava/lang/Object;)V

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

.method private load(Ljava/util/List;Lx0/j0;JLjava/lang/Integer;Ln3/p;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx0/J;",
            ">;",
            "Lx0/j0;",
            "J",
            "Ljava/lang/Integer;",
            "Ln3/p;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p5, :cond_0

    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 29
    .line 30
    check-cast v1, Lh0/G;

    .line 31
    .line 32
    invoke-virtual {v1}, Lh0/G;->d0()V

    .line 33
    .line 34
    .line 35
    iget-object v4, v1, Lh0/G;->y:Lh0/g;

    .line 36
    .line 37
    invoke-virtual {v1}, Lh0/G;->D()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {v4, v3, v5}, Lh0/g;->d(IZ)I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lh0/G;->Y(Lh0/o;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lc0/c;

    .line 48
    .line 49
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 50
    .line 51
    iget-object v1, v1, Lh0/G;->d0:Lh0/i0;

    .line 52
    .line 53
    iget-wide v5, v1, Lh0/i0;->s:J

    .line 54
    .line 55
    invoke-direct {v3, v4}, Lc0/c;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-direct {p0, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->abortExistingConnection(Z)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 63
    .line 64
    check-cast v1, Lh0/G;

    .line 65
    .line 66
    invoke-virtual {v1}, Lh0/G;->d0()V

    .line 67
    .line 68
    .line 69
    iget-object v4, v1, Lh0/G;->y:Lh0/g;

    .line 70
    .line 71
    invoke-virtual {v1}, Lh0/G;->D()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v3, v5}, Lh0/g;->d(IZ)I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Lh0/G;->Y(Lh0/o;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Lc0/c;

    .line 82
    .line 83
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 84
    .line 85
    iget-object v1, v1, Lh0/G;->d0:Lh0/i0;

    .line 86
    .line 87
    iget-wide v5, v1, Lh0/i0;->s:J

    .line 88
    .line 89
    invoke-direct {v3, v4}, Lc0/c;-><init>(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_1
    iput-object p6, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 93
    .line 94
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 95
    .line 96
    .line 97
    sget-object p6, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 98
    .line 99
    iput-object p6, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 100
    .line 101
    iput-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 102
    .line 103
    iput-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

    .line 106
    .line 107
    .line 108
    if-eqz p5, :cond_3

    .line 109
    .line 110
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :cond_3
    move v3, v0

    .line 115
    iget-object p5, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 116
    .line 117
    move-object v1, p5

    .line 118
    check-cast v1, Lh0/G;

    .line 119
    .line 120
    invoke-virtual {v1}, Lh0/G;->d0()V

    .line 121
    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    move-object v2, p1

    .line 125
    move-wide v4, p3

    .line 126
    invoke-virtual/range {v1 .. v6}, Lh0/G;->Q(Ljava/util/List;IJZ)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 130
    .line 131
    check-cast p1, Lh0/G;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lh0/G;->U(Lx0/j0;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 137
    .line 138
    check-cast p1, Lh0/G;

    .line 139
    .line 140
    invoke-virtual {p1}, Lh0/G;->K()V

    .line 141
    .line 142
    .line 143
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
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
.end method

.method private loudnessEnhancerSetTargetGain(D)V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 2
    .line 3
    mul-double/2addr p1, v0

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    long-to-int p1, p1

    .line 9
    iget-object p2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 10
    .line 11
    const-string v0, "AndroidLoudnessEnhancer"

    .line 12
    .line 13
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Landroid/media/audiofx/LoudnessEnhancer;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

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
.end method

.method public static mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
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

.method private sendError(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->sendError(ILjava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method private sendError(ILjava/lang/String;Ljava/lang/Object;Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->eventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lcom/ryanheise/just_audio/BetterEventChannel;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    if-eqz p4, :cond_0

    .line 5
    sget-object p4, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    iput-object p4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 7
    iget-object p4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    if-eqz p4, :cond_1

    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p1, p2, p3}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    :cond_1
    return-void
.end method

.method private setAudioAttributes(III)V
    .locals 1

    .line 1
    new-instance v0, La0/c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, La0/c;-><init>(III)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 7
    .line 8
    sget-object p2, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingAudioAttributes:La0/c;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 16
    .line 17
    check-cast p1, Lh0/G;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, v0, p2}, Lh0/G;->P(La0/c;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
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

.method private setAudioSessionId(I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioSessionId:Ljava/lang/Integer;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioSessionId:Ljava/lang/Integer;

    .line 12
    .line 13
    :goto_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->clearAudioEffects()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioSessionId:Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->rawAudioEffects:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Ljava/util/Map;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioSessionId:Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-direct {p0, v0, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeAudioEffect(Ljava/lang/Object;I)Landroid/media/audiofx/AudioEffect;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "enabled"

    .line 50
    .line 51
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-virtual {v0, v2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffects:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectsMap:Ljava/util/Map;

    .line 73
    .line 74
    const-string v3, "type"

    .line 75
    .line 76
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

    .line 87
    .line 88
    .line 89
    return-void
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

.method private setShuffleOrder(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx0/J;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string v1, "type"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v2, "concatenating"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v0, "looping"

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "child"

    .line 51
    .line 52
    invoke-static {p1, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lcom/ryanheise/just_audio/AudioPlayer;->setShuffleOrder(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    check-cast v0, Lx0/s;

    .line 61
    .line 62
    const-string v1, "shuffleOrder"

    .line 63
    .line 64
    invoke-static {p1, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-direct {p0, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lx0/s;->M(Lx0/j0;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "children"

    .line 78
    .line 79
    invoke-static {p1, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p0, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->setShuffleOrder(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    :goto_1
    return-void
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

.method private startWatchingBuffer()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferWatcher:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->bufferWatcher:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
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

.method private updateCurrentIndex()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->w()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
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

.method private updatePosition()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getCurrentPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updateTime:J

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

.method private updatePositionIfChanged()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast v0, Lh0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh0/G;->D()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 16
    .line 17
    sget-object v2, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->ready:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 18
    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getCurrentPosition()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget-wide v4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition:J

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getCurrentPosition()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition:J

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->updateTime:J

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method


# virtual methods
.method public dispose()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 2
    .line 3
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, v0}, Lcom/ryanheise/just_audio/AudioPlayer;->abortExistingConnection(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance v2, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v2}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->mediaSources:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->clearAudioEffects()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    check-cast v0, Lh0/G;

    .line 39
    .line 40
    invoke-virtual {v0}, Lh0/G;->L()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 44
    .line 45
    sget-object v0, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 48
    .line 49
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->eventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/ryanheise/just_audio/BetterEventChannel;->endOfStream()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->dataEventChannel:Lcom/ryanheise/just_audio/BetterEventChannel;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/ryanheise/just_audio/BetterEventChannel;->endOfStream()V

    .line 60
    .line 61
    .line 62
    return-void
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

.method public bridge synthetic onAudioAttributesChanged(La0/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onAudioSessionIdChanged(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/just_audio/AudioPlayer;->setAudioSessionId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastPendingPlaybackEvent()V

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

.method public bridge synthetic onAvailableCommandsChanged(La0/K;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onCues(Lc0/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onCues(Ljava/util/List;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    return-void
.end method

.method public bridge synthetic onDeviceInfoChanged(La0/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onDeviceVolumeChanged(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onEvents(La0/O;La0/L;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onIsLoadingChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onIsPlayingChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onLoadingChanged(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic onMaxSeekToPreviousPositionChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onMediaItemTransition(La0/A;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onMediaMetadataChanged(La0/D;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onMetadata(La0/F;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, La0/F;->l:[La0/E;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    instance-of v2, v1, LS0/c;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, LS0/c;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyInfo:LS0/c;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
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

.method public onMethodCall(Ln3/n;Ln3/p;)V
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    const-string v10, "Illegal state: "

    .line 8
    .line 9
    const-string v11, "Error: "

    .line 10
    .line 11
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/just_audio/AudioPlayer;->ensurePlayerInitialized()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v2, v1, Ln3/n;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v5, 0x1

    .line 21
    sparse-switch v3, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :sswitch_0
    const-string v3, "audioEffectSetEnabled"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const/16 v2, 0x12

    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object v1, v0

    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object v1, v0

    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :catch_1
    move-exception v0

    .line 47
    move-object v1, v0

    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :sswitch_1
    const-string v3, "setAutomaticallyWaitsToMinimizeStalling"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    const/16 v2, 0xa

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :sswitch_2
    const-string v3, "androidEqualizerGetParameters"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    const/16 v2, 0x14

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :sswitch_3
    const-string v3, "setPreferredPeakBitRate"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    const/16 v2, 0xc

    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :sswitch_4
    const-string v3, "setSpeed"

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_0

    .line 93
    .line 94
    const/4 v2, 0x4

    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :sswitch_5
    const-string v3, "setPitch"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_0

    .line 104
    .line 105
    const/4 v2, 0x5

    .line 106
    goto/16 :goto_1

    .line 107
    .line 108
    :sswitch_6
    const-string v3, "concatenatingMove"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_0

    .line 115
    .line 116
    const/16 v2, 0x10

    .line 117
    .line 118
    goto/16 :goto_1

    .line 119
    .line 120
    :sswitch_7
    const-string v3, "concatenatingRemoveRange"

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_0

    .line 127
    .line 128
    const/16 v2, 0xf

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :sswitch_8
    const-string v3, "setVolume"

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_0

    .line 139
    .line 140
    const/4 v2, 0x3

    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :sswitch_9
    const-string v3, "pause"

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_0

    .line 150
    .line 151
    const/4 v2, 0x2

    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :sswitch_a
    const-string v3, "seek"

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_0

    .line 161
    .line 162
    const/16 v2, 0xd

    .line 163
    .line 164
    goto/16 :goto_1

    .line 165
    .line 166
    :sswitch_b
    const-string v3, "play"

    .line 167
    .line 168
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_0

    .line 173
    .line 174
    move v2, v5

    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :sswitch_c
    const-string v3, "load"

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_0

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    :sswitch_d
    const-string v3, "setLoopMode"

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_0

    .line 195
    .line 196
    const/4 v2, 0x7

    .line 197
    goto :goto_1

    .line 198
    :sswitch_e
    const-string v3, "setAndroidAudioAttributes"

    .line 199
    .line 200
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_0

    .line 205
    .line 206
    const/16 v2, 0x11

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :sswitch_f
    const-string v3, "androidLoudnessEnhancerSetTargetGain"

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_0

    .line 216
    .line 217
    const/16 v2, 0x13

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :sswitch_10
    const-string v3, "setCanUseNetworkResourcesForLiveStreamingWhilePaused"

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_0

    .line 227
    .line 228
    const/16 v2, 0xb

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :sswitch_11
    const-string v3, "setShuffleOrder"

    .line 232
    .line 233
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_0

    .line 238
    .line 239
    const/16 v2, 0x9

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :sswitch_12
    const-string v3, "concatenatingInsertAll"

    .line 243
    .line 244
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_0

    .line 249
    .line 250
    const/16 v2, 0xe

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :sswitch_13
    const-string v3, "setSkipSilence"

    .line 254
    .line 255
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_0

    .line 260
    .line 261
    const/4 v2, 0x6

    .line 262
    goto :goto_1

    .line 263
    :sswitch_14
    const-string v3, "setShuffleMode"

    .line 264
    .line 265
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_0

    .line 270
    .line 271
    const/16 v2, 0x8

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :sswitch_15
    const-string v3, "androidEqualizerBandSetGain"

    .line 275
    .line 276
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    if-eqz v2, :cond_0

    .line 281
    .line 282
    const/16 v2, 0x15

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_0
    :goto_0
    const/4 v2, -0x1

    .line 286
    :goto_1
    const-string v3, "audioSource"

    .line 287
    .line 288
    const-wide/16 v6, 0x3e8

    .line 289
    .line 290
    const-string v15, "enabled"

    .line 291
    .line 292
    const-string v4, "children"

    .line 293
    .line 294
    const-string v13, "index"

    .line 295
    .line 296
    const-string v14, "shuffleOrder"

    .line 297
    .line 298
    const-string v12, "id"

    .line 299
    .line 300
    packed-switch v2, :pswitch_data_0

    .line 301
    .line 302
    .line 303
    :try_start_1
    invoke-interface/range {p2 .. p2}, Ln3/p;->notImplemented()V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_5

    .line 307
    .line 308
    :pswitch_0
    const-string v2, "bandIndex"

    .line 309
    .line 310
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    const-string v3, "gain"

    .line 321
    .line 322
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Ljava/lang/Double;

    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 329
    .line 330
    .line 331
    move-result-wide v3

    .line 332
    invoke-direct {v8, v2, v3, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->equalizerBandSetGain(ID)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Ljava/util/HashMap;

    .line 336
    .line 337
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :pswitch_1
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/just_audio/AudioPlayer;->equalizerAudioEffectGetParameters()Ljava/util/Map;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_5

    .line 353
    .line 354
    :pswitch_2
    const-string v2, "targetGain"

    .line 355
    .line 356
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    check-cast v1, Ljava/lang/Double;

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 363
    .line 364
    .line 365
    move-result-wide v1

    .line 366
    invoke-direct {v8, v1, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->loudnessEnhancerSetTargetGain(D)V

    .line 367
    .line 368
    .line 369
    new-instance v1, Ljava/util/HashMap;

    .line 370
    .line 371
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    goto/16 :goto_5

    .line 378
    .line 379
    :pswitch_3
    const-string v2, "type"

    .line 380
    .line 381
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {v1, v15}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, Ljava/lang/Boolean;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    invoke-direct {v8, v2, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->audioEffectSetEnabled(Ljava/lang/String;Z)V

    .line 398
    .line 399
    .line 400
    new-instance v1, Ljava/util/HashMap;

    .line 401
    .line 402
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_5

    .line 409
    .line 410
    :pswitch_4
    const-string v2, "contentType"

    .line 411
    .line 412
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    check-cast v2, Ljava/lang/Integer;

    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    const-string v3, "flags"

    .line 423
    .line 424
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    check-cast v3, Ljava/lang/Integer;

    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    const-string v4, "usage"

    .line 435
    .line 436
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    check-cast v1, Ljava/lang/Integer;

    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    invoke-direct {v8, v2, v3, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setAudioAttributes(III)V

    .line 447
    .line 448
    .line 449
    new-instance v1, Ljava/util/HashMap;

    .line 450
    .line 451
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_5

    .line 458
    .line 459
    :pswitch_5
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    check-cast v2, Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 466
    .line 467
    .line 468
    move-result v2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 469
    const-string v3, "newIndex"

    .line 470
    .line 471
    const-string v4, "currentIndex"

    .line 472
    .line 473
    if-nez v2, :cond_1

    .line 474
    .line 475
    :try_start_2
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 476
    .line 477
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    check-cast v4, Ljava/lang/Integer;

    .line 482
    .line 483
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    check-cast v3, Ljava/lang/Integer;

    .line 492
    .line 493
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    check-cast v2, LL0/e;

    .line 498
    .line 499
    invoke-virtual {v2, v4, v3}, LL0/e;->l(II)V

    .line 500
    .line 501
    .line 502
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 503
    .line 504
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    check-cast v1, Ljava/util/List;

    .line 509
    .line 510
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    check-cast v2, Lh0/G;

    .line 515
    .line 516
    invoke-virtual {v2, v1}, Lh0/G;->U(Lx0/j0;)V

    .line 517
    .line 518
    .line 519
    new-instance v1, Ljava/util/HashMap;

    .line 520
    .line 521
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_5

    .line 528
    .line 529
    :cond_1
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    check-cast v4, Ljava/lang/Integer;

    .line 542
    .line 543
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    check-cast v3, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    iget-object v5, v8, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 558
    .line 559
    new-instance v6, Lcom/ryanheise/just_audio/a;

    .line 560
    .line 561
    const/4 v7, 0x2

    .line 562
    invoke-direct {v6, v9, v7}, Lcom/ryanheise/just_audio/a;-><init>(Ln3/p;I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2, v4, v3, v5, v6}, Lx0/s;->I(IILandroid/os/Handler;Lcom/ryanheise/just_audio/a;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    check-cast v1, Ljava/util/List;

    .line 581
    .line 582
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-virtual {v2, v1}, Lx0/s;->M(Lx0/j0;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_5

    .line 590
    .line 591
    :pswitch_6
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    check-cast v2, Ljava/lang/String;

    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 598
    .line 599
    .line 600
    move-result v2
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 601
    const-string v3, "endIndex"

    .line 602
    .line 603
    const-string v4, "startIndex"

    .line 604
    .line 605
    if-nez v2, :cond_2

    .line 606
    .line 607
    :try_start_3
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 608
    .line 609
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    check-cast v4, Ljava/lang/Integer;

    .line 614
    .line 615
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    check-cast v3, Ljava/lang/Integer;

    .line 624
    .line 625
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    check-cast v2, Lh0/G;

    .line 630
    .line 631
    invoke-virtual {v2, v4, v3}, Lh0/G;->M(II)V

    .line 632
    .line 633
    .line 634
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 635
    .line 636
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    check-cast v1, Ljava/util/List;

    .line 641
    .line 642
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    check-cast v2, Lh0/G;

    .line 647
    .line 648
    invoke-virtual {v2, v1}, Lh0/G;->U(Lx0/j0;)V

    .line 649
    .line 650
    .line 651
    new-instance v1, Ljava/util/HashMap;

    .line 652
    .line 653
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 654
    .line 655
    .line 656
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    goto/16 :goto_5

    .line 660
    .line 661
    :cond_2
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    check-cast v4, Ljava/lang/Integer;

    .line 674
    .line 675
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 676
    .line 677
    .line 678
    move-result v4

    .line 679
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    check-cast v3, Ljava/lang/Integer;

    .line 684
    .line 685
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    iget-object v5, v8, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 690
    .line 691
    new-instance v6, Lcom/ryanheise/just_audio/a;

    .line 692
    .line 693
    const/4 v7, 0x1

    .line 694
    invoke-direct {v6, v9, v7}, Lcom/ryanheise/just_audio/a;-><init>(Ln3/p;I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2, v4, v3, v5, v6}, Lx0/s;->J(IILandroid/os/Handler;Lcom/ryanheise/just_audio/a;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    check-cast v1, Ljava/util/List;

    .line 713
    .line 714
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-virtual {v2, v1}, Lx0/s;->M(Lx0/j0;)V

    .line 719
    .line 720
    .line 721
    goto/16 :goto_5

    .line 722
    .line 723
    :pswitch_7
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    check-cast v2, Ljava/lang/String;

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    if-nez v2, :cond_3

    .line 734
    .line 735
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 736
    .line 737
    invoke-virtual {v1, v13}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    check-cast v3, Ljava/lang/Integer;

    .line 742
    .line 743
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 744
    .line 745
    .line 746
    move-result v3

    .line 747
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    invoke-direct {v8, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSources(Ljava/lang/Object;)Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    check-cast v2, Lh0/G;

    .line 756
    .line 757
    invoke-virtual {v2, v3, v4}, Lh0/G;->q(ILjava/util/List;)V

    .line 758
    .line 759
    .line 760
    iget-object v2, v8, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 761
    .line 762
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    check-cast v1, Ljava/util/List;

    .line 767
    .line 768
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    check-cast v2, Lh0/G;

    .line 773
    .line 774
    invoke-virtual {v2, v1}, Lh0/G;->U(Lx0/j0;)V

    .line 775
    .line 776
    .line 777
    new-instance v1, Ljava/util/HashMap;

    .line 778
    .line 779
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_5

    .line 786
    .line 787
    :cond_3
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    invoke-virtual {v1, v13}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    check-cast v3, Ljava/lang/Integer;

    .line 800
    .line 801
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    invoke-virtual {v1, v4}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v4

    .line 809
    invoke-direct {v8, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSources(Ljava/lang/Object;)Ljava/util/List;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    iget-object v5, v8, Lcom/ryanheise/just_audio/AudioPlayer;->handler:Landroid/os/Handler;

    .line 814
    .line 815
    new-instance v6, Lcom/ryanheise/just_audio/a;

    .line 816
    .line 817
    const/4 v7, 0x0

    .line 818
    invoke-direct {v6, v9, v7}, Lcom/ryanheise/just_audio/a;-><init>(Ln3/p;I)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2, v3, v4, v5, v6}, Lx0/s;->B(ILjava/util/List;Landroid/os/Handler;Lcom/ryanheise/just_audio/a;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, v12}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    invoke-direct {v8, v2}, Lcom/ryanheise/just_audio/AudioPlayer;->concatenating(Ljava/lang/Object;)Lx0/s;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v1, v14}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    check-cast v1, Ljava/util/List;

    .line 837
    .line 838
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    invoke-virtual {v2, v1}, Lx0/s;->M(Lx0/j0;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_5

    .line 846
    .line 847
    :pswitch_8
    const-string v2, "position"

    .line 848
    .line 849
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    invoke-virtual {v1, v13}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    check-cast v1, Ljava/lang/Integer;

    .line 862
    .line 863
    if-nez v2, :cond_4

    .line 864
    .line 865
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    goto :goto_2

    .line 871
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 872
    .line 873
    .line 874
    move-result-wide v2

    .line 875
    div-long v13, v2, v6

    .line 876
    .line 877
    :goto_2
    invoke-virtual {v8, v13, v14, v1, v9}, Lcom/ryanheise/just_audio/AudioPlayer;->seek(JLjava/lang/Integer;Ln3/p;)V

    .line 878
    .line 879
    .line 880
    goto/16 :goto_5

    .line 881
    .line 882
    :pswitch_9
    new-instance v1, Ljava/util/HashMap;

    .line 883
    .line 884
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 885
    .line 886
    .line 887
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_5

    .line 891
    .line 892
    :pswitch_a
    new-instance v1, Ljava/util/HashMap;

    .line 893
    .line 894
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 895
    .line 896
    .line 897
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    goto/16 :goto_5

    .line 901
    .line 902
    :pswitch_b
    new-instance v1, Ljava/util/HashMap;

    .line 903
    .line 904
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 905
    .line 906
    .line 907
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 908
    .line 909
    .line 910
    goto/16 :goto_5

    .line 911
    .line 912
    :pswitch_c
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setShuffleOrder(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    new-instance v1, Ljava/util/HashMap;

    .line 920
    .line 921
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 922
    .line 923
    .line 924
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    goto/16 :goto_5

    .line 928
    .line 929
    :pswitch_d
    const-string v2, "shuffleMode"

    .line 930
    .line 931
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    check-cast v1, Ljava/lang/Integer;

    .line 936
    .line 937
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-ne v1, v5, :cond_5

    .line 942
    .line 943
    move v4, v5

    .line 944
    goto :goto_3

    .line 945
    :cond_5
    const/4 v4, 0x0

    .line 946
    :goto_3
    invoke-virtual {v8, v4}, Lcom/ryanheise/just_audio/AudioPlayer;->setShuffleModeEnabled(Z)V

    .line 947
    .line 948
    .line 949
    new-instance v1, Ljava/util/HashMap;

    .line 950
    .line 951
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 952
    .line 953
    .line 954
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    goto/16 :goto_5

    .line 958
    .line 959
    :pswitch_e
    const-string v2, "loopMode"

    .line 960
    .line 961
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    check-cast v1, Ljava/lang/Integer;

    .line 966
    .line 967
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 968
    .line 969
    .line 970
    move-result v1

    .line 971
    invoke-virtual {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setLoopMode(I)V

    .line 972
    .line 973
    .line 974
    new-instance v1, Ljava/util/HashMap;

    .line 975
    .line 976
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 977
    .line 978
    .line 979
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_5

    .line 983
    .line 984
    :pswitch_f
    invoke-virtual {v1, v15}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    check-cast v1, Ljava/lang/Boolean;

    .line 989
    .line 990
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    invoke-virtual {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setSkipSilenceEnabled(Z)V

    .line 995
    .line 996
    .line 997
    new-instance v1, Ljava/util/HashMap;

    .line 998
    .line 999
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1000
    .line 1001
    .line 1002
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    goto/16 :goto_5

    .line 1006
    .line 1007
    :pswitch_10
    const-string v2, "pitch"

    .line 1008
    .line 1009
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, Ljava/lang/Double;

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1016
    .line 1017
    .line 1018
    move-result-wide v1

    .line 1019
    double-to-float v1, v1

    .line 1020
    invoke-virtual {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setPitch(F)V

    .line 1021
    .line 1022
    .line 1023
    new-instance v1, Ljava/util/HashMap;

    .line 1024
    .line 1025
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    goto/16 :goto_5

    .line 1032
    .line 1033
    :pswitch_11
    const-string v2, "speed"

    .line 1034
    .line 1035
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    check-cast v1, Ljava/lang/Double;

    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1042
    .line 1043
    .line 1044
    move-result-wide v1

    .line 1045
    double-to-float v1, v1

    .line 1046
    invoke-virtual {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setSpeed(F)V

    .line 1047
    .line 1048
    .line 1049
    new-instance v1, Ljava/util/HashMap;

    .line 1050
    .line 1051
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1052
    .line 1053
    .line 1054
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_5

    .line 1058
    .line 1059
    :pswitch_12
    const-string v2, "volume"

    .line 1060
    .line 1061
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    check-cast v1, Ljava/lang/Double;

    .line 1066
    .line 1067
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1068
    .line 1069
    .line 1070
    move-result-wide v1

    .line 1071
    double-to-float v1, v1

    .line 1072
    invoke-virtual {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->setVolume(F)V

    .line 1073
    .line 1074
    .line 1075
    new-instance v1, Ljava/util/HashMap;

    .line 1076
    .line 1077
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1078
    .line 1079
    .line 1080
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_5

    .line 1084
    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/just_audio/AudioPlayer;->pause()V

    .line 1085
    .line 1086
    .line 1087
    new-instance v1, Ljava/util/HashMap;

    .line 1088
    .line 1089
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1090
    .line 1091
    .line 1092
    invoke-interface {v9, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    goto :goto_5

    .line 1096
    :pswitch_14
    invoke-virtual {v8, v9}, Lcom/ryanheise/just_audio/AudioPlayer;->play(Ln3/p;)V

    .line 1097
    .line 1098
    .line 1099
    goto :goto_5

    .line 1100
    :pswitch_15
    const-string v2, "initialPosition"

    .line 1101
    .line 1102
    invoke-virtual {v1, v2}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    invoke-static {v2}, Lcom/ryanheise/just_audio/AudioPlayer;->getLong(Ljava/lang/Object;)Ljava/lang/Long;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    const-string v5, "initialIndex"

    .line 1111
    .line 1112
    invoke-virtual {v1, v5}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v5

    .line 1116
    move-object v12, v5

    .line 1117
    check-cast v12, Ljava/lang/Integer;

    .line 1118
    .line 1119
    invoke-virtual {v1, v3}, Ln3/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v1

    .line 1123
    check-cast v1, Ljava/util/Map;

    .line 1124
    .line 1125
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    invoke-direct {v8, v3}, Lcom/ryanheise/just_audio/AudioPlayer;->getAudioSourcesArray(Ljava/lang/Object;)[Lx0/J;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v3

    .line 1133
    invoke-static {v1, v14}, Lcom/ryanheise/just_audio/AudioPlayer;->mapGet(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    check-cast v1, Ljava/util/List;

    .line 1138
    .line 1139
    invoke-direct {v8, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->decodeShuffleOrder(Ljava/util/List;)Lx0/j0;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v4

    .line 1143
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v3

    .line 1147
    if-nez v2, :cond_6

    .line 1148
    .line 1149
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    goto :goto_4

    .line 1155
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1156
    .line 1157
    .line 1158
    move-result-wide v1

    .line 1159
    div-long/2addr v1, v6

    .line 1160
    move-wide/from16 v16, v1

    .line 1161
    .line 1162
    :goto_4
    move-object/from16 v1, p0

    .line 1163
    .line 1164
    move-object v2, v3

    .line 1165
    move-object v3, v4

    .line 1166
    move-wide/from16 v4, v16

    .line 1167
    .line 1168
    move-object v6, v12

    .line 1169
    move-object/from16 v7, p2

    .line 1170
    .line 1171
    invoke-direct/range {v1 .. v7}, Lcom/ryanheise/just_audio/AudioPlayer;->load(Ljava/util/List;Lx0/j0;JLjava/lang/Integer;Ln3/p;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1172
    .line 1173
    .line 1174
    :goto_5
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastPendingPlaybackEvent()V

    .line 1175
    .line 1176
    .line 1177
    goto :goto_8

    .line 1178
    :goto_6
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1179
    .line 1180
    .line 1181
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1182
    .line 1183
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v2

    .line 1193
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    const/4 v3, 0x0

    .line 1198
    invoke-interface {v9, v2, v1, v3}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    goto :goto_5

    .line 1202
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1203
    .line 1204
    .line 1205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    const/4 v3, 0x0

    .line 1226
    invoke-interface {v9, v2, v1, v3}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1227
    .line 1228
    .line 1229
    goto :goto_5

    .line 1230
    :goto_8
    return-void

    .line 1231
    :goto_9
    invoke-direct/range {p0 .. p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastPendingPlaybackEvent()V

    .line 1232
    .line 1233
    .line 1234
    throw v1

    .line 1235
    :sswitch_data_0
    .sparse-switch
        -0x7aad3a17 -> :sswitch_15
        -0x76787586 -> :sswitch_14
        -0x6fccfba0 -> :sswitch_13
        -0x5bd749ea -> :sswitch_12
        -0x5878aea9 -> :sswitch_11
        -0x29f8037e -> :sswitch_10
        -0x1494f7ca -> :sswitch_f
        -0x64229a0 -> :sswitch_e
        -0x2e1df17 -> :sswitch_d
        0x32c4e6 -> :sswitch_c
        0x348b34 -> :sswitch_b
        0x35ce78 -> :sswitch_a
        0x65825f6 -> :sswitch_9
        0x27f73e1c -> :sswitch_8
        0x3264dd87 -> :sswitch_7
        0x3ad42123 -> :sswitch_6
        0x538783fe -> :sswitch_5
        0x53b4c105 -> :sswitch_4
        0x56b389ef -> :sswitch_3
        0x60da657d -> :sswitch_2
        0x613a0038 -> :sswitch_1
        0x7e381ce6 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public bridge synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPlaybackParametersChanged(La0/J;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_8

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    const/4 v2, 0x0

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-string v7, "duration"

    .line 15
    .line 16
    if-eq p1, v0, :cond_4

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 24
    .line 25
    sget-object v0, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->completed:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    new-instance p1, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    cmp-long v0, v8, v5

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    move-object v0, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    mul-long/2addr v5, v3

    .line 65
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    invoke-virtual {p1, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 73
    .line 74
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 78
    .line 79
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingAudioAttributes:La0/c;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 84
    .line 85
    check-cast v0, Lh0/G;

    .line 86
    .line 87
    invoke-virtual {v0, p1, v2}, Lh0/G;->P(La0/c;Z)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingAudioAttributes:La0/c;

    .line 91
    .line 92
    :cond_3
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 93
    .line 94
    if-eqz p1, :cond_a

    .line 95
    .line 96
    new-instance v0, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, v0}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 108
    .line 109
    check-cast p1, Lh0/G;

    .line 110
    .line 111
    invoke-virtual {p1}, Lh0/G;->D()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 118
    .line 119
    .line 120
    :cond_5
    sget-object p1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->ready:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 121
    .line 122
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 123
    .line 124
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 125
    .line 126
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 132
    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    new-instance p1, Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 141
    .line 142
    .line 143
    move-result-wide v8

    .line 144
    cmp-long v0, v8, v5

    .line 145
    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    move-object v0, v1

    .line 149
    goto :goto_1

    .line 150
    :cond_6
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->getDuration()J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    mul-long/2addr v5, v3

    .line 155
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :goto_1
    invoke-virtual {p1, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 163
    .line 164
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->prepareResult:Ln3/p;

    .line 168
    .line 169
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingAudioAttributes:La0/c;

    .line 170
    .line 171
    if-eqz p1, :cond_7

    .line 172
    .line 173
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 174
    .line 175
    check-cast v0, Lh0/G;

    .line 176
    .line 177
    invoke-virtual {v0, p1, v2}, Lh0/G;->P(La0/c;Z)V

    .line 178
    .line 179
    .line 180
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->pendingAudioAttributes:La0/c;

    .line 181
    .line 182
    :cond_7
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 183
    .line 184
    if-eqz p1, :cond_a

    .line 185
    .line 186
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->completeSeek()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePositionIfChanged()Z

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 194
    .line 195
    sget-object v0, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->buffering:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 196
    .line 197
    if-eq p1, v0, :cond_9

    .line 198
    .line 199
    sget-object v2, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 200
    .line 201
    if-eq p1, v2, :cond_9

    .line 202
    .line 203
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 204
    .line 205
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorCode:Ljava/lang/Integer;

    .line 206
    .line 207
    iput-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->errorMessage:Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 210
    .line 211
    .line 212
    :cond_9
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->startWatchingBuffer()V

    .line 213
    .line 214
    .line 215
    :cond_a
    :goto_2
    return-void
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

.method public bridge synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPlayerError(La0/I;)V
    .locals 9

    .line 1
    instance-of v0, p1, Lh0/o;

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    const-string v2, "AudioPlayer"

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    check-cast p1, Lh0/o;

    .line 10
    .line 11
    iget v0, p1, Lh0/o;->n:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    if-eq v0, v3, :cond_3

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    iget v6, p1, Lh0/o;->n:I

    .line 21
    .line 22
    if-eq v0, v5, :cond_1

    .line 23
    .line 24
    new-instance v7, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v8, "default ExoPlaybackException: "

    .line 27
    .line 28
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    if-ne v6, v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v4

    .line 35
    :goto_0
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast v3, Ljava/lang/RuntimeException;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v8, "TYPE_UNEXPECTED: "

    .line 66
    .line 67
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    if-ne v6, v5, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move v3, v4

    .line 74
    :goto_1
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    check-cast v3, Ljava/lang/RuntimeException;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v6, "TYPE_RENDERER: "

    .line 104
    .line 105
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    if-ne v0, v3, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move v3, v4

    .line 112
    :goto_2
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    check-cast v3, Ljava/lang/Exception;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v6, "TYPE_SOURCE: "

    .line 142
    .line 143
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move v3, v4

    .line 150
    :goto_3
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v3, Ljava/io/IOException;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 181
    .line 182
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-direct {p0, v0, p1, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->sendError(ILjava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v3, "default PlaybackException: "

    .line 197
    .line 198
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->currentIndex:Ljava/lang/Integer;

    .line 220
    .line 221
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-static {v1}, Lcom/ryanheise/just_audio/AudioPlayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget p1, p1, La0/I;->l:I

    .line 230
    .line 231
    invoke-direct {p0, p1, v0, v1}, Lcom/ryanheise/just_audio/AudioPlayer;->sendError(ILjava/lang/String;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :goto_5
    return-void
.end method

.method public bridge synthetic onPlayerErrorChanged(La0/I;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPlayerStateChanged(ZI)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic onPlaylistMetadataChanged(La0/D;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onPositionDiscontinuity(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public onPositionDiscontinuity(La0/N;La0/N;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    if-eq p3, p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updateCurrentIndex()Z

    .line 4
    :goto_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    return-void
.end method

.method public bridge synthetic onRenderedFirstFrame()V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onRepeatModeChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSeekBackIncrementChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSeekForwardIncrementChanged(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSkipSilenceEnabledChanged(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onSurfaceSizeChanged(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTimelineChanged(La0/U;I)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updateCurrentIndex()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 11
    .line 12
    check-cast p1, Lh0/G;

    .line 13
    .line 14
    invoke-virtual {p1}, Lh0/G;->E()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x4

    .line 19
    if-ne p1, p2, :cond_a

    .line 20
    .line 21
    :try_start_0
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 22
    .line 23
    check-cast p1, Lh0/G;

    .line 24
    .line 25
    invoke-virtual {p1}, Lh0/G;->D()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 p2, 0x0

    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    if-eqz p1, :cond_9

    .line 33
    .line 34
    iget p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->lastPlaylistLength:I

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 39
    .line 40
    check-cast p1, LL0/e;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, Lh0/G;

    .line 46
    .line 47
    invoke-virtual {p1}, Lh0/G;->z()La0/U;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, La0/U;->o()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-lez p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 58
    .line 59
    check-cast p1, LL0/e;

    .line 60
    .line 61
    invoke-virtual {p1, p2, v0, v1, p2}, LL0/e;->n(IJZ)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :catch_0
    move-exception p1

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_1
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 70
    .line 71
    check-cast p1, LL0/e;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast p1, Lh0/G;

    .line 77
    .line 78
    invoke-virtual {p1}, Lh0/G;->z()La0/U;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, La0/U;->p()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v2, -0x1

    .line 87
    const/4 v3, 0x1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    move p1, v2

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {p1}, Lh0/G;->w()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {p1}, Lh0/G;->d0()V

    .line 97
    .line 98
    .line 99
    iget v4, p1, Lh0/G;->C:I

    .line 100
    .line 101
    if-ne v4, v3, :cond_3

    .line 102
    .line 103
    move v4, p2

    .line 104
    :cond_3
    invoke-virtual {p1}, Lh0/G;->d0()V

    .line 105
    .line 106
    .line 107
    iget-boolean p1, p1, Lh0/G;->D:Z

    .line 108
    .line 109
    invoke-virtual {v0, v1, v4, p1}, La0/U;->e(IIZ)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    :goto_0
    if-eq p1, v2, :cond_4

    .line 114
    .line 115
    move p1, v3

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move p1, p2

    .line 118
    :goto_1
    if-eqz p1, :cond_a

    .line 119
    .line 120
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 121
    .line 122
    check-cast p1, LL0/e;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-object v0, p1

    .line 128
    check-cast v0, Lh0/G;

    .line 129
    .line 130
    invoke-virtual {v0}, Lh0/G;->z()La0/U;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, La0/U;->p()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_5

    .line 139
    .line 140
    move v0, v2

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-virtual {v0}, Lh0/G;->w()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 147
    .line 148
    .line 149
    iget v5, v0, Lh0/G;->C:I

    .line 150
    .line 151
    if-ne v5, v3, :cond_6

    .line 152
    .line 153
    move v5, p2

    .line 154
    :cond_6
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 155
    .line 156
    .line 157
    iget-boolean v0, v0, Lh0/G;->D:Z

    .line 158
    .line 159
    invoke-virtual {v1, v4, v5, v0}, La0/U;->e(IIZ)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    :goto_2
    if-ne v0, v2, :cond_7

    .line 164
    .line 165
    check-cast p1, Lh0/G;

    .line 166
    .line 167
    invoke-virtual {p1}, Lh0/G;->d0()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_7
    move-object v1, p1

    .line 172
    check-cast v1, Lh0/G;

    .line 173
    .line 174
    invoke-virtual {v1}, Lh0/G;->w()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    if-ne v0, v2, :cond_8

    .line 184
    .line 185
    invoke-virtual {v1}, Lh0/G;->w()I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-virtual {p1, p2, v4, v5, v3}, LL0/e;->n(IJZ)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_8
    invoke-virtual {p1, v0, v4, v5, p2}, LL0/e;->n(IJZ)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_9
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 198
    .line 199
    check-cast p1, Lh0/G;

    .line 200
    .line 201
    invoke-virtual {p1}, Lh0/G;->w()I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    iget-object v2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 206
    .line 207
    check-cast v2, LL0/e;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    check-cast v2, Lh0/G;

    .line 213
    .line 214
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, La0/U;->o()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-ge p1, v2, :cond_a

    .line 223
    .line 224
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 225
    .line 226
    move-object v2, p1

    .line 227
    check-cast v2, Lh0/G;

    .line 228
    .line 229
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    check-cast p1, LL0/e;

    .line 234
    .line 235
    invoke-virtual {p1, v2, v0, v1, p2}, LL0/e;->n(IJZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 240
    .line 241
    .line 242
    :cond_a
    :goto_4
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 243
    .line 244
    check-cast p1, LL0/e;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    check-cast p1, Lh0/G;

    .line 250
    .line 251
    invoke-virtual {p1}, Lh0/G;->z()La0/U;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p1}, La0/U;->o()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    iput p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->lastPlaylistLength:I

    .line 260
    .line 261
    return-void
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

.method public bridge synthetic onTrackSelectionParametersChanged(La0/Z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTracksChanged(La0/b0;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, La0/b0;->a()Lm2/I;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, La0/b0;->a()Lm2/I;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La0/a0;

    .line 22
    .line 23
    iget-object v2, v2, La0/a0;->b:La0/V;

    .line 24
    .line 25
    move v3, v0

    .line 26
    :goto_1
    iget v4, v2, La0/V;->a:I

    .line 27
    .line 28
    if-ge v3, v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2, v3}, La0/V;->a(I)La0/p;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object v4, v4, La0/p;->l:La0/F;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move v5, v0

    .line 39
    :goto_2
    invoke-virtual {v4}, La0/F;->g()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-ge v5, v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, v5}, La0/F;->f(I)La0/E;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    instance-of v7, v6, LS0/b;

    .line 50
    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    check-cast v6, LS0/b;

    .line 54
    .line 55
    iput-object v6, p0, Lcom/ryanheise/just_audio/AudioPlayer;->icyHeaders:LS0/b;

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->broadcastImmediatePlaybackEvent()V

    .line 58
    .line 59
    .line 60
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-void
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
.end method

.method public bridge synthetic onVideoSizeChanged(La0/e0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onVolumeChanged(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->D()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    check-cast v0, Lh0/G;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lh0/G;->R(Z)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v1, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 40
    .line 41
    :cond_1
    return-void
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

.method public play(Ln3/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->D()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    new-instance v1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 33
    .line 34
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    check-cast p1, Lh0/G;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lh0/G;->R(Z)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 46
    .line 47
    sget-object v0, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->completed:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 48
    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    iput-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->playResult:Ln3/p;

    .line 65
    .line 66
    :cond_2
    return-void
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
.end method

.method public seek(JLjava/lang/Integer;Ln3/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->processingState:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 2
    .line 3
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->idle:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    sget-object v1, Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;->loading:Lcom/ryanheise/just_audio/AudioPlayer$ProcessingState;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->abortSeek()V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

    .line 20
    .line 21
    iput-object p4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object p3, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 33
    .line 34
    check-cast p3, Lh0/G;

    .line 35
    .line 36
    invoke-virtual {p3}, Lh0/G;->w()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    :goto_0
    iget-object p4, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 41
    .line 42
    check-cast p4, LL0/e;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p4, p3, p1, p2, v0}, LL0/e;->n(IJZ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    const/4 p2, 0x0

    .line 50
    iput-object p2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekResult:Ln3/p;

    .line 51
    .line 52
    iput-object p2, p0, Lcom/ryanheise/just_audio/AudioPlayer;->seekPos:Ljava/lang/Long;

    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p4, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 61
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
.end method

.method public setLoopMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lh0/G;->T(I)V

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

.method public setPitch(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lh0/G;->d0:Lh0/i0;

    .line 9
    .line 10
    iget-object v0, v0, Lh0/i0;->o:La0/J;

    .line 11
    .line 12
    iget v1, v0, La0/J;->b:F

    .line 13
    .line 14
    cmpl-float v1, v1, p1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 20
    .line 21
    new-instance v2, La0/J;

    .line 22
    .line 23
    iget v0, v0, La0/J;->a:F

    .line 24
    .line 25
    invoke-direct {v2, v0, p1}, La0/J;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    check-cast v1, Lh0/G;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lh0/G;->S(La0/J;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

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

.method public setShuffleModeEnabled(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lh0/G;->D:Z

    .line 9
    .line 10
    if-eq v1, p1, :cond_0

    .line 11
    .line 12
    iput-boolean p1, v0, Lh0/G;->D:Z

    .line 13
    .line 14
    iget-object v1, v0, Lh0/G;->k:Lh0/N;

    .line 15
    .line 16
    iget-object v1, v1, Lh0/N;->t:Ld0/t;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v1, v1, Ld0/t;->a:Landroid/os/Handler;

    .line 26
    .line 27
    const/16 v3, 0xc

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-virtual {v1, v3, p1, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v2, Ld0/s;->a:Landroid/os/Message;

    .line 35
    .line 36
    invoke-virtual {v2}, Ld0/s;->b()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lh0/v;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {v1, v2, p1}, Lh0/v;-><init>(IZ)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Lh0/G;->l:Ld0/l;

    .line 46
    .line 47
    const/16 v2, 0x9

    .line 48
    .line 49
    invoke-virtual {p1, v2, v1}, Ld0/l;->c(ILd0/i;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lh0/G;->Z()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ld0/l;->b()V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method public setSkipSilenceEnabled(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lh0/G;->W:Z

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-boolean p1, v0, Lh0/G;->W:Z

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/16 v3, 0x9

    .line 21
    .line 22
    invoke-virtual {v0, v2, v3, v1}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lh0/v;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, v2, p1}, Lh0/v;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v0, Lh0/G;->l:Ld0/l;

    .line 32
    .line 33
    const/16 v0, 0x17

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Ld0/l;->e(ILd0/i;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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

.method public setSpeed(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/G;->d0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lh0/G;->d0:Lh0/i0;

    .line 9
    .line 10
    iget-object v0, v0, Lh0/i0;->o:La0/J;

    .line 11
    .line 12
    iget v1, v0, La0/J;->a:F

    .line 13
    .line 14
    cmpl-float v1, v1, p1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 20
    .line 21
    new-instance v2, La0/J;

    .line 22
    .line 23
    iget v0, v0, La0/J;->b:F

    .line 24
    .line 25
    invoke-direct {v2, p1, v0}, La0/J;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    check-cast v1, Lh0/G;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lh0/G;->S(La0/J;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 34
    .line 35
    check-cast p1, Lh0/G;

    .line 36
    .line 37
    invoke-virtual {p1}, Lh0/G;->D()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->updatePosition()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-direct {p0}, Lcom/ryanheise/just_audio/AudioPlayer;->enqueuePlaybackEvent()V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public setVolume(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/just_audio/AudioPlayer;->player:Lh0/s;

    .line 2
    .line 3
    check-cast v0, Lh0/G;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lh0/G;->X(F)V

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
