.class public final LD0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD0/g;

.field public final b:LD0/v;

.field public c:Z

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:F

.field public k:Ld0/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;LD0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD0/s;->a:LD0/g;

    .line 5
    .line 6
    new-instance p2, LD0/v;

    .line 7
    .line 8
    invoke-direct {p2, p1}, LD0/v;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, LD0/s;->b:LD0/v;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, LD0/s;->d:I

    .line 15
    .line 16
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, LD0/s;->e:J

    .line 22
    .line 23
    iput-wide p1, p0, LD0/s;->g:J

    .line 24
    .line 25
    iput-wide p1, p0, LD0/s;->h:J

    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p1, p0, LD0/s;->j:F

    .line 30
    .line 31
    sget-object p1, Ld0/a;->a:Ld0/r;

    .line 32
    .line 33
    iput-object p1, p0, LD0/s;->k:Ld0/r;

    .line 34
    .line 35
    return-void
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


# virtual methods
.method public final a(JJJJZLD0/r;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v5, p10

    .line 8
    .line 9
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v6, v5, LD0/r;->a:J

    .line 15
    .line 16
    iput-wide v6, v5, LD0/r;->b:J

    .line 17
    .line 18
    iget-wide v8, v0, LD0/s;->e:J

    .line 19
    .line 20
    cmp-long v8, v8, v6

    .line 21
    .line 22
    if-nez v8, :cond_0

    .line 23
    .line 24
    iput-wide v3, v0, LD0/s;->e:J

    .line 25
    .line 26
    :cond_0
    iget-wide v8, v0, LD0/s;->g:J

    .line 27
    .line 28
    cmp-long v8, v8, v1

    .line 29
    .line 30
    const-wide/16 v9, -0x1

    .line 31
    .line 32
    const-wide/16 v13, 0x3e8

    .line 33
    .line 34
    const/4 v15, 0x0

    .line 35
    if-eqz v8, :cond_9

    .line 36
    .line 37
    iget-object v8, v0, LD0/s;->b:LD0/v;

    .line 38
    .line 39
    iget-wide v11, v8, LD0/v;->n:J

    .line 40
    .line 41
    cmp-long v18, v11, v9

    .line 42
    .line 43
    if-eqz v18, :cond_1

    .line 44
    .line 45
    iput-wide v11, v8, LD0/v;->p:J

    .line 46
    .line 47
    iget-wide v11, v8, LD0/v;->o:J

    .line 48
    .line 49
    iput-wide v11, v8, LD0/v;->q:J

    .line 50
    .line 51
    :cond_1
    iget-wide v11, v8, LD0/v;->m:J

    .line 52
    .line 53
    const-wide/16 v18, 0x1

    .line 54
    .line 55
    add-long v11, v11, v18

    .line 56
    .line 57
    iput-wide v11, v8, LD0/v;->m:J

    .line 58
    .line 59
    mul-long v11, v1, v13

    .line 60
    .line 61
    iget-object v9, v8, LD0/v;->a:LD0/b;

    .line 62
    .line 63
    iget-object v10, v9, LD0/b;->a:LD0/a;

    .line 64
    .line 65
    invoke-virtual {v10, v11, v12}, LD0/a;->b(J)V

    .line 66
    .line 67
    .line 68
    iget-object v10, v9, LD0/b;->a:LD0/a;

    .line 69
    .line 70
    invoke-virtual {v10}, LD0/a;->a()Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_2

    .line 75
    .line 76
    iput-boolean v15, v9, LD0/b;->c:Z

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_2
    iget-wide v13, v9, LD0/b;->d:J

    .line 80
    .line 81
    cmp-long v10, v13, v6

    .line 82
    .line 83
    if-eqz v10, :cond_6

    .line 84
    .line 85
    iget-boolean v10, v9, LD0/b;->c:Z

    .line 86
    .line 87
    if-eqz v10, :cond_5

    .line 88
    .line 89
    iget-object v10, v9, LD0/b;->b:LD0/a;

    .line 90
    .line 91
    iget-wide v13, v10, LD0/a;->d:J

    .line 92
    .line 93
    const-wide/16 v16, 0x0

    .line 94
    .line 95
    cmp-long v20, v13, v16

    .line 96
    .line 97
    if-nez v20, :cond_3

    .line 98
    .line 99
    move v10, v15

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    sub-long v13, v13, v18

    .line 102
    .line 103
    const-wide/16 v18, 0xf

    .line 104
    .line 105
    rem-long v13, v13, v18

    .line 106
    .line 107
    long-to-int v13, v13

    .line 108
    iget-object v10, v10, LD0/a;->g:[Z

    .line 109
    .line 110
    aget-boolean v10, v10, v13

    .line 111
    .line 112
    :goto_0
    if-eqz v10, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    :goto_1
    const/4 v10, 0x1

    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :goto_2
    iget-object v10, v9, LD0/b;->b:LD0/a;

    .line 118
    .line 119
    invoke-virtual {v10}, LD0/a;->c()V

    .line 120
    .line 121
    .line 122
    iget-object v10, v9, LD0/b;->b:LD0/a;

    .line 123
    .line 124
    iget-wide v13, v9, LD0/b;->d:J

    .line 125
    .line 126
    invoke-virtual {v10, v13, v14}, LD0/a;->b(J)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_3
    iput-boolean v10, v9, LD0/b;->c:Z

    .line 131
    .line 132
    iget-object v10, v9, LD0/b;->b:LD0/a;

    .line 133
    .line 134
    invoke-virtual {v10, v11, v12}, LD0/a;->b(J)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_4
    iget-boolean v10, v9, LD0/b;->c:Z

    .line 138
    .line 139
    if-eqz v10, :cond_7

    .line 140
    .line 141
    iget-object v10, v9, LD0/b;->b:LD0/a;

    .line 142
    .line 143
    invoke-virtual {v10}, LD0/a;->a()Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_7

    .line 148
    .line 149
    iget-object v10, v9, LD0/b;->a:LD0/a;

    .line 150
    .line 151
    iget-object v13, v9, LD0/b;->b:LD0/a;

    .line 152
    .line 153
    iput-object v13, v9, LD0/b;->a:LD0/a;

    .line 154
    .line 155
    iput-object v10, v9, LD0/b;->b:LD0/a;

    .line 156
    .line 157
    iput-boolean v15, v9, LD0/b;->c:Z

    .line 158
    .line 159
    :cond_7
    iput-wide v11, v9, LD0/b;->d:J

    .line 160
    .line 161
    iget-object v10, v9, LD0/b;->a:LD0/a;

    .line 162
    .line 163
    invoke-virtual {v10}, LD0/a;->a()Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-eqz v10, :cond_8

    .line 168
    .line 169
    move v10, v15

    .line 170
    goto :goto_5

    .line 171
    :cond_8
    iget v10, v9, LD0/b;->e:I

    .line 172
    .line 173
    const/4 v11, 0x1

    .line 174
    add-int/2addr v10, v11

    .line 175
    :goto_5
    iput v10, v9, LD0/b;->e:I

    .line 176
    .line 177
    invoke-virtual {v8}, LD0/v;->c()V

    .line 178
    .line 179
    .line 180
    iput-wide v1, v0, LD0/s;->g:J

    .line 181
    .line 182
    :cond_9
    sub-long/2addr v1, v3

    .line 183
    long-to-double v1, v1

    .line 184
    iget v8, v0, LD0/s;->j:F

    .line 185
    .line 186
    float-to-double v8, v8

    .line 187
    div-double/2addr v1, v8

    .line 188
    double-to-long v1, v1

    .line 189
    iget-boolean v8, v0, LD0/s;->c:Z

    .line 190
    .line 191
    if-eqz v8, :cond_a

    .line 192
    .line 193
    iget-object v8, v0, LD0/s;->k:Ld0/r;

    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    invoke-static {v8, v9}, Ld0/w;->M(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v8

    .line 206
    sub-long v8, v8, p5

    .line 207
    .line 208
    sub-long/2addr v1, v8

    .line 209
    :cond_a
    iput-wide v1, v5, LD0/r;->a:J

    .line 210
    .line 211
    iget-wide v8, v0, LD0/s;->h:J

    .line 212
    .line 213
    cmp-long v8, v8, v6

    .line 214
    .line 215
    const-wide/16 v9, -0x7530

    .line 216
    .line 217
    const/4 v11, 0x3

    .line 218
    const/4 v12, 0x2

    .line 219
    if-eqz v8, :cond_c

    .line 220
    .line 221
    iget-boolean v8, v0, LD0/s;->i:Z

    .line 222
    .line 223
    if-nez v8, :cond_c

    .line 224
    .line 225
    :cond_b
    move v1, v15

    .line 226
    goto :goto_7

    .line 227
    :cond_c
    iget v8, v0, LD0/s;->d:I

    .line 228
    .line 229
    if-eqz v8, :cond_10

    .line 230
    .line 231
    const/4 v13, 0x1

    .line 232
    if-eq v8, v13, :cond_f

    .line 233
    .line 234
    if-eq v8, v12, :cond_e

    .line 235
    .line 236
    if-ne v8, v11, :cond_d

    .line 237
    .line 238
    iget-object v8, v0, LD0/s;->k:Ld0/r;

    .line 239
    .line 240
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 244
    .line 245
    .line 246
    move-result-wide v13

    .line 247
    invoke-static {v13, v14}, Ld0/w;->M(J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v13

    .line 251
    iget-wide v11, v0, LD0/s;->f:J

    .line 252
    .line 253
    sub-long/2addr v13, v11

    .line 254
    iget-boolean v8, v0, LD0/s;->c:Z

    .line 255
    .line 256
    if-eqz v8, :cond_b

    .line 257
    .line 258
    cmp-long v1, v1, v9

    .line 259
    .line 260
    if-gez v1, :cond_b

    .line 261
    .line 262
    const-wide/32 v1, 0x186a0

    .line 263
    .line 264
    .line 265
    cmp-long v1, v13, v1

    .line 266
    .line 267
    if-lez v1, :cond_b

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 271
    .line 272
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_e
    cmp-long v1, v3, p7

    .line 277
    .line 278
    if-ltz v1, :cond_b

    .line 279
    .line 280
    :cond_f
    :goto_6
    const/4 v1, 0x1

    .line 281
    goto :goto_7

    .line 282
    :cond_10
    iget-boolean v1, v0, LD0/s;->c:Z

    .line 283
    .line 284
    :goto_7
    if-eqz v1, :cond_11

    .line 285
    .line 286
    return v15

    .line 287
    :cond_11
    iget-boolean v1, v0, LD0/s;->c:Z

    .line 288
    .line 289
    if-eqz v1, :cond_12

    .line 290
    .line 291
    iget-wide v11, v0, LD0/s;->e:J

    .line 292
    .line 293
    cmp-long v1, v3, v11

    .line 294
    .line 295
    if-nez v1, :cond_13

    .line 296
    .line 297
    :cond_12
    const/4 v1, 0x5

    .line 298
    goto/16 :goto_12

    .line 299
    .line 300
    :cond_13
    iget-object v1, v0, LD0/s;->k:Ld0/r;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 306
    .line 307
    .line 308
    move-result-wide v11

    .line 309
    iget-object v1, v0, LD0/s;->b:LD0/v;

    .line 310
    .line 311
    iget-wide v13, v5, LD0/r;->a:J

    .line 312
    .line 313
    const-wide/16 v18, 0x3e8

    .line 314
    .line 315
    mul-long v13, v13, v18

    .line 316
    .line 317
    add-long/2addr v13, v11

    .line 318
    iget-wide v9, v1, LD0/v;->p:J

    .line 319
    .line 320
    const-wide/16 v18, -0x1

    .line 321
    .line 322
    cmp-long v8, v9, v18

    .line 323
    .line 324
    if-eqz v8, :cond_17

    .line 325
    .line 326
    iget-object v8, v1, LD0/v;->a:LD0/b;

    .line 327
    .line 328
    iget-object v8, v8, LD0/b;->a:LD0/a;

    .line 329
    .line 330
    invoke-virtual {v8}, LD0/a;->a()Z

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-eqz v8, :cond_17

    .line 335
    .line 336
    iget-object v8, v1, LD0/v;->a:LD0/b;

    .line 337
    .line 338
    iget-object v9, v8, LD0/b;->a:LD0/a;

    .line 339
    .line 340
    invoke-virtual {v9}, LD0/a;->a()Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-eqz v9, :cond_15

    .line 345
    .line 346
    iget-object v8, v8, LD0/b;->a:LD0/a;

    .line 347
    .line 348
    iget-wide v9, v8, LD0/a;->e:J

    .line 349
    .line 350
    const-wide/16 v16, 0x0

    .line 351
    .line 352
    cmp-long v18, v9, v16

    .line 353
    .line 354
    if-nez v18, :cond_14

    .line 355
    .line 356
    const-wide/16 v2, 0x0

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_14
    iget-wide v2, v8, LD0/a;->f:J

    .line 360
    .line 361
    div-long/2addr v2, v9

    .line 362
    goto :goto_8

    .line 363
    :cond_15
    move-wide v2, v6

    .line 364
    :goto_8
    iget-wide v8, v1, LD0/v;->q:J

    .line 365
    .line 366
    iget-wide v6, v1, LD0/v;->m:J

    .line 367
    .line 368
    move-wide/from16 v20, v11

    .line 369
    .line 370
    iget-wide v10, v1, LD0/v;->p:J

    .line 371
    .line 372
    sub-long/2addr v6, v10

    .line 373
    mul-long/2addr v6, v2

    .line 374
    long-to-float v2, v6

    .line 375
    iget v3, v1, LD0/v;->i:F

    .line 376
    .line 377
    div-float/2addr v2, v3

    .line 378
    float-to-long v2, v2

    .line 379
    add-long/2addr v8, v2

    .line 380
    sub-long v2, v13, v8

    .line 381
    .line 382
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    const-wide/32 v6, 0x1312d00

    .line 387
    .line 388
    .line 389
    cmp-long v2, v2, v6

    .line 390
    .line 391
    if-gtz v2, :cond_16

    .line 392
    .line 393
    move-wide v13, v8

    .line 394
    goto :goto_9

    .line 395
    :cond_16
    const-wide/16 v2, 0x0

    .line 396
    .line 397
    iput-wide v2, v1, LD0/v;->m:J

    .line 398
    .line 399
    const-wide/16 v2, -0x1

    .line 400
    .line 401
    iput-wide v2, v1, LD0/v;->p:J

    .line 402
    .line 403
    iput-wide v2, v1, LD0/v;->n:J

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_17
    move-wide/from16 v20, v11

    .line 407
    .line 408
    :goto_9
    iget-wide v2, v1, LD0/v;->m:J

    .line 409
    .line 410
    iput-wide v2, v1, LD0/v;->n:J

    .line 411
    .line 412
    iput-wide v13, v1, LD0/v;->o:J

    .line 413
    .line 414
    iget-object v2, v1, LD0/v;->c:LD0/u;

    .line 415
    .line 416
    if-eqz v2, :cond_1c

    .line 417
    .line 418
    iget-wide v3, v1, LD0/v;->k:J

    .line 419
    .line 420
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    cmp-long v3, v3, v6

    .line 426
    .line 427
    if-nez v3, :cond_18

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_18
    iget-wide v2, v2, LD0/u;->l:J

    .line 431
    .line 432
    cmp-long v4, v2, v6

    .line 433
    .line 434
    if-nez v4, :cond_19

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_19
    iget-wide v6, v1, LD0/v;->k:J

    .line 438
    .line 439
    sub-long v8, v13, v2

    .line 440
    .line 441
    div-long/2addr v8, v6

    .line 442
    mul-long/2addr v8, v6

    .line 443
    add-long/2addr v8, v2

    .line 444
    cmp-long v2, v13, v8

    .line 445
    .line 446
    if-gtz v2, :cond_1a

    .line 447
    .line 448
    sub-long v2, v8, v6

    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_1a
    add-long/2addr v6, v8

    .line 452
    move-wide v2, v8

    .line 453
    move-wide v8, v6

    .line 454
    :goto_a
    sub-long v6, v8, v13

    .line 455
    .line 456
    sub-long/2addr v13, v2

    .line 457
    cmp-long v4, v6, v13

    .line 458
    .line 459
    if-gez v4, :cond_1b

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_1b
    move-wide v8, v2

    .line 463
    :goto_b
    iget-wide v1, v1, LD0/v;->l:J

    .line 464
    .line 465
    sub-long v13, v8, v1

    .line 466
    .line 467
    :cond_1c
    :goto_c
    iput-wide v13, v5, LD0/r;->b:J

    .line 468
    .line 469
    sub-long v13, v13, v20

    .line 470
    .line 471
    const-wide/16 v1, 0x3e8

    .line 472
    .line 473
    div-long/2addr v13, v1

    .line 474
    iput-wide v13, v5, LD0/r;->a:J

    .line 475
    .line 476
    iget-wide v1, v0, LD0/s;->h:J

    .line 477
    .line 478
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    cmp-long v1, v1, v3

    .line 484
    .line 485
    if-eqz v1, :cond_1d

    .line 486
    .line 487
    iget-boolean v1, v0, LD0/s;->i:Z

    .line 488
    .line 489
    if-nez v1, :cond_1d

    .line 490
    .line 491
    const/4 v10, 0x1

    .line 492
    goto :goto_d

    .line 493
    :cond_1d
    move v10, v15

    .line 494
    :goto_d
    iget-object v1, v0, LD0/s;->a:LD0/g;

    .line 495
    .line 496
    const-wide/32 v2, -0x7a120

    .line 497
    .line 498
    .line 499
    cmp-long v2, v13, v2

    .line 500
    .line 501
    if-gez v2, :cond_22

    .line 502
    .line 503
    if-nez p9, :cond_22

    .line 504
    .line 505
    iget-object v2, v1, Lh0/h;->t:Lx0/f0;

    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    iget-wide v3, v1, Lh0/h;->v:J

    .line 511
    .line 512
    sub-long v3, p3, v3

    .line 513
    .line 514
    invoke-interface {v2, v3, v4}, Lx0/f0;->d(J)I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    if-nez v2, :cond_1e

    .line 519
    .line 520
    goto :goto_f

    .line 521
    :cond_1e
    if-eqz v10, :cond_1f

    .line 522
    .line 523
    iget-object v3, v1, Lq0/r;->I0:Lh0/i;

    .line 524
    .line 525
    iget v4, v3, Lh0/i;->d:I

    .line 526
    .line 527
    add-int/2addr v4, v2

    .line 528
    iput v4, v3, Lh0/i;->d:I

    .line 529
    .line 530
    iget v2, v3, Lh0/i;->f:I

    .line 531
    .line 532
    iget v4, v1, LD0/g;->j1:I

    .line 533
    .line 534
    add-int/2addr v2, v4

    .line 535
    iput v2, v3, Lh0/i;->f:I

    .line 536
    .line 537
    goto :goto_e

    .line 538
    :cond_1f
    iget-object v3, v1, Lq0/r;->I0:Lh0/i;

    .line 539
    .line 540
    iget v4, v3, Lh0/i;->j:I

    .line 541
    .line 542
    const/4 v6, 0x1

    .line 543
    add-int/2addr v4, v6

    .line 544
    iput v4, v3, Lh0/i;->j:I

    .line 545
    .line 546
    iget v3, v1, LD0/g;->j1:I

    .line 547
    .line 548
    invoke-virtual {v1, v2, v3}, LD0/g;->w0(II)V

    .line 549
    .line 550
    .line 551
    :goto_e
    invoke-virtual {v1}, Lq0/r;->A()Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-eqz v2, :cond_20

    .line 556
    .line 557
    invoke-virtual {v1}, Lq0/r;->K()V

    .line 558
    .line 559
    .line 560
    :cond_20
    iget-object v1, v1, LD0/g;->X0:LD0/m;

    .line 561
    .line 562
    if-eqz v1, :cond_21

    .line 563
    .line 564
    invoke-virtual {v1, v15}, LD0/m;->a(Z)V

    .line 565
    .line 566
    .line 567
    :cond_21
    const/4 v1, 0x1

    .line 568
    goto :goto_10

    .line 569
    :cond_22
    :goto_f
    move v1, v15

    .line 570
    :goto_10
    if-eqz v1, :cond_23

    .line 571
    .line 572
    const/4 v1, 0x4

    .line 573
    return v1

    .line 574
    :cond_23
    iget-wide v1, v5, LD0/r;->a:J

    .line 575
    .line 576
    const-wide/16 v3, -0x7530

    .line 577
    .line 578
    cmp-long v3, v1, v3

    .line 579
    .line 580
    if-gez v3, :cond_24

    .line 581
    .line 582
    if-nez p9, :cond_24

    .line 583
    .line 584
    const/4 v15, 0x1

    .line 585
    :cond_24
    if-eqz v15, :cond_26

    .line 586
    .line 587
    if-eqz v10, :cond_25

    .line 588
    .line 589
    const/4 v11, 0x3

    .line 590
    goto :goto_11

    .line 591
    :cond_25
    const/4 v11, 0x2

    .line 592
    :goto_11
    return v11

    .line 593
    :cond_26
    const-wide/32 v3, 0xc350

    .line 594
    .line 595
    .line 596
    cmp-long v1, v1, v3

    .line 597
    .line 598
    if-lez v1, :cond_27

    .line 599
    .line 600
    const/4 v1, 0x5

    .line 601
    return v1

    .line 602
    :cond_27
    const/4 v1, 0x1

    .line 603
    :goto_12
    return v1
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
.end method

.method public final b(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, LD0/s;->d:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-ne p1, v3, :cond_0

    .line 13
    .line 14
    iput-wide v1, p0, LD0/s;->h:J

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-wide v3, p0, LD0/s;->h:J

    .line 18
    .line 19
    cmp-long p1, v3, v1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-object p1, p0, LD0/s;->k:Ld0/r;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    iget-wide v6, p0, LD0/s;->h:J

    .line 35
    .line 36
    cmp-long p1, v4, v6

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    return v0

    .line 41
    :cond_2
    iput-wide v1, p0, LD0/s;->h:J

    .line 42
    .line 43
    return v3
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

.method public final c(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, LD0/s;->i:Z

    .line 2
    .line 3
    iget-object p1, p0, LD0/s;->k:Ld0/r;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x1388

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p0, LD0/s;->h:J

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
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget v0, p0, LD0/s;->d:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, LD0/s;->d:I

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

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LD0/s;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, LD0/s;->k:Ld0/r;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Ld0/w;->M(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, p0, LD0/s;->f:J

    .line 18
    .line 19
    iget-object v1, p0, LD0/s;->b:LD0/v;

    .line 20
    .line 21
    iput-boolean v0, v1, LD0/v;->d:Z

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, v1, LD0/v;->m:J

    .line 26
    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    iput-wide v2, v1, LD0/v;->p:J

    .line 30
    .line 31
    iput-wide v2, v1, LD0/v;->n:J

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iget-object v2, v1, LD0/v;->b:LD0/t;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v3, v1, LD0/v;->c:LD0/u;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v3, v3, LD0/u;->m:Landroid/os/Handler;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-static {v3}, Ld0/w;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, v2, LD0/t;->b:Landroid/hardware/display/DisplayManager;

    .line 55
    .line 56
    invoke-virtual {v4, v2, v3}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v2, v2, LD0/t;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, LD0/v;

    .line 66
    .line 67
    invoke-static {v2, v3}, LD0/v;->a(LD0/v;Landroid/view/Display;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v1, v0}, LD0/v;->d(Z)V

    .line 71
    .line 72
    .line 73
    return-void
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

.method public final f()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LD0/s;->c:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, LD0/s;->h:J

    .line 10
    .line 11
    iget-object v1, p0, LD0/s;->b:LD0/v;

    .line 12
    .line 13
    iput-boolean v0, v1, LD0/v;->d:Z

    .line 14
    .line 15
    iget-object v0, v1, LD0/v;->b:LD0/t;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, LD0/t;->b:Landroid/hardware/display/DisplayManager;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, LD0/v;->c:LD0/u;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, LD0/u;->m:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, LD0/v;->b()V

    .line 36
    .line 37
    .line 38
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
.end method

.method public final g(F)V
    .locals 4

    .line 1
    iget-object v0, p0, LD0/s;->b:LD0/v;

    .line 2
    .line 3
    iput p1, v0, LD0/v;->f:F

    .line 4
    .line 5
    iget-object p1, v0, LD0/v;->a:LD0/b;

    .line 6
    .line 7
    iget-object v1, p1, LD0/b;->a:LD0/a;

    .line 8
    .line 9
    invoke-virtual {v1}, LD0/a;->c()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, LD0/b;->b:LD0/a;

    .line 13
    .line 14
    invoke-virtual {v1}, LD0/a;->c()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, p1, LD0/b;->c:Z

    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v2, p1, LD0/b;->d:J

    .line 26
    .line 27
    iput v1, p1, LD0/b;->e:I

    .line 28
    .line 29
    invoke-virtual {v0}, LD0/v;->c()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public final h(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Ld0/m;->c(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, LD0/s;->j:F

    .line 14
    .line 15
    cmpl-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iput p1, p0, LD0/s;->j:F

    .line 21
    .line 22
    iget-object v0, p0, LD0/s;->b:LD0/v;

    .line 23
    .line 24
    iput p1, v0, LD0/v;->i:F

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    iput-wide v2, v0, LD0/v;->m:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    iput-wide v2, v0, LD0/v;->p:J

    .line 33
    .line 34
    iput-wide v2, v0, LD0/v;->n:J

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LD0/v;->d(Z)V

    .line 37
    .line 38
    .line 39
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
