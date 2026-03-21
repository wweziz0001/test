.class public final Ll1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/F;


# instance fields
.field public final a:Ll1/h;

.field public final b:LF0/M;

.field public c:I

.field public d:I

.field public e:Ld0/u;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Ll1/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/w;->a:Ll1/h;

    .line 5
    .line 6
    new-instance p1, LF0/M;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, LF0/M;-><init>(I[B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ll1/w;->b:LF0/M;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Ll1/w;->c:I

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


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll1/w;->c:I

    .line 3
    .line 4
    iput v0, p0, Ll1/w;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, Ll1/w;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1/w;->a:Ll1/h;

    .line 9
    .line 10
    invoke-interface {v0}, Ll1/h;->a()V

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

.method public final b(ILd0/p;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ll1/w;->e:Ld0/u;

    .line 6
    .line 7
    invoke-static {v2}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    iget-object v3, v0, Ll1/w;->a:Ll1/h;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const-string v5, "PesReader"

    .line 16
    .line 17
    const/4 v6, -0x1

    .line 18
    const/4 v7, 0x3

    .line 19
    const/4 v8, 0x2

    .line 20
    const/4 v9, 0x0

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    iget v2, v0, Ll1/w;->c:I

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    if-eq v2, v4, :cond_4

    .line 28
    .line 29
    if-eq v2, v8, :cond_3

    .line 30
    .line 31
    if-ne v2, v7, :cond_2

    .line 32
    .line 33
    iget v2, v0, Ll1/w;->j:I

    .line 34
    .line 35
    if-eq v2, v6, :cond_0

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v10, "Unexpected start indicator: expected "

    .line 40
    .line 41
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v10, v0, Ll1/w;->j:I

    .line 45
    .line 46
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v10, " more bytes"

    .line 50
    .line 51
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v5, v2}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget v2, v1, Ld0/p;->c:I

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    move v2, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v2, v9

    .line 68
    :goto_0
    invoke-interface {v3, v2}, Ll1/h;->c(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_3
    const-string v2, "Unexpected start indicator reading extended header"

    .line 79
    .line 80
    invoke-static {v5, v2}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    iput v4, v0, Ll1/w;->c:I

    .line 84
    .line 85
    iput v9, v0, Ll1/w;->d:I

    .line 86
    .line 87
    :cond_5
    move/from16 v2, p1

    .line 88
    .line 89
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ld0/p;->a()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-lez v10, :cond_15

    .line 94
    .line 95
    iget v10, v0, Ll1/w;->c:I

    .line 96
    .line 97
    if-eqz v10, :cond_14

    .line 98
    .line 99
    iget-object v11, v0, Ll1/w;->b:LF0/M;

    .line 100
    .line 101
    if-eq v10, v4, :cond_f

    .line 102
    .line 103
    if-eq v10, v8, :cond_a

    .line 104
    .line 105
    if-ne v10, v7, :cond_9

    .line 106
    .line 107
    invoke-virtual/range {p2 .. p2}, Ld0/p;->a()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget v11, v0, Ll1/w;->j:I

    .line 112
    .line 113
    if-ne v11, v6, :cond_6

    .line 114
    .line 115
    move v11, v9

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    sub-int v11, v10, v11

    .line 118
    .line 119
    :goto_3
    if-lez v11, :cond_7

    .line 120
    .line 121
    sub-int/2addr v10, v11

    .line 122
    iget v11, v1, Ld0/p;->b:I

    .line 123
    .line 124
    add-int/2addr v11, v10

    .line 125
    invoke-virtual {v1, v11}, Ld0/p;->G(I)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-interface {v3, v1}, Ll1/h;->b(Ld0/p;)V

    .line 129
    .line 130
    .line 131
    iget v11, v0, Ll1/w;->j:I

    .line 132
    .line 133
    if-eq v11, v6, :cond_8

    .line 134
    .line 135
    sub-int/2addr v11, v10

    .line 136
    iput v11, v0, Ll1/w;->j:I

    .line 137
    .line 138
    if-nez v11, :cond_8

    .line 139
    .line 140
    invoke-interface {v3, v9}, Ll1/h;->c(Z)V

    .line 141
    .line 142
    .line 143
    iput v4, v0, Ll1/w;->c:I

    .line 144
    .line 145
    iput v9, v0, Ll1/w;->d:I

    .line 146
    .line 147
    :cond_8
    move/from16 v17, v7

    .line 148
    .line 149
    move v7, v6

    .line 150
    move/from16 v6, v17

    .line 151
    .line 152
    move/from16 v18, v9

    .line 153
    .line 154
    move v9, v8

    .line 155
    move/from16 v8, v18

    .line 156
    .line 157
    goto/16 :goto_7

    .line 158
    .line 159
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_a
    const/16 v10, 0xa

    .line 166
    .line 167
    iget v12, v0, Ll1/w;->i:I

    .line 168
    .line 169
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    iget-object v12, v11, LF0/M;->b:[B

    .line 174
    .line 175
    invoke-virtual {v0, v1, v12, v10}, Ll1/w;->d(Ld0/p;[BI)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-eqz v10, :cond_e

    .line 180
    .line 181
    const/4 v10, 0x0

    .line 182
    iget v12, v0, Ll1/w;->i:I

    .line 183
    .line 184
    invoke-virtual {v0, v1, v10, v12}, Ll1/w;->d(Ld0/p;[BI)Z

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    if-eqz v10, :cond_e

    .line 189
    .line 190
    invoke-virtual {v11, v9}, LF0/M;->r(I)V

    .line 191
    .line 192
    .line 193
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    iput-wide v12, v0, Ll1/w;->l:J

    .line 199
    .line 200
    iget-boolean v10, v0, Ll1/w;->f:Z

    .line 201
    .line 202
    const/4 v12, 0x4

    .line 203
    if-eqz v10, :cond_c

    .line 204
    .line 205
    invoke-virtual {v11, v12}, LF0/M;->u(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11, v7}, LF0/M;->i(I)I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    int-to-long v13, v10

    .line 213
    const/16 v10, 0x1e

    .line 214
    .line 215
    shl-long/2addr v13, v10

    .line 216
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 217
    .line 218
    .line 219
    const/16 v15, 0xf

    .line 220
    .line 221
    invoke-virtual {v11, v15}, LF0/M;->i(I)I

    .line 222
    .line 223
    .line 224
    move-result v16

    .line 225
    shl-int/lit8 v8, v16, 0xf

    .line 226
    .line 227
    int-to-long v9, v8

    .line 228
    or-long v8, v13, v9

    .line 229
    .line 230
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11, v15}, LF0/M;->i(I)I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    int-to-long v13, v10

    .line 238
    or-long/2addr v8, v13

    .line 239
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 240
    .line 241
    .line 242
    iget-boolean v10, v0, Ll1/w;->h:Z

    .line 243
    .line 244
    if-nez v10, :cond_b

    .line 245
    .line 246
    iget-boolean v10, v0, Ll1/w;->g:Z

    .line 247
    .line 248
    if-eqz v10, :cond_b

    .line 249
    .line 250
    invoke-virtual {v11, v12}, LF0/M;->u(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, v7}, LF0/M;->i(I)I

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    int-to-long v13, v10

    .line 258
    const/16 v10, 0x1e

    .line 259
    .line 260
    shl-long/2addr v13, v10

    .line 261
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v15}, LF0/M;->i(I)I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    shl-int/2addr v10, v15

    .line 269
    int-to-long v6, v10

    .line 270
    or-long/2addr v6, v13

    .line 271
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11, v15}, LF0/M;->i(I)I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    int-to-long v13, v10

    .line 279
    or-long/2addr v6, v13

    .line 280
    invoke-virtual {v11, v4}, LF0/M;->u(I)V

    .line 281
    .line 282
    .line 283
    iget-object v10, v0, Ll1/w;->e:Ld0/u;

    .line 284
    .line 285
    invoke-virtual {v10, v6, v7}, Ld0/u;->b(J)J

    .line 286
    .line 287
    .line 288
    iput-boolean v4, v0, Ll1/w;->h:Z

    .line 289
    .line 290
    :cond_b
    iget-object v6, v0, Ll1/w;->e:Ld0/u;

    .line 291
    .line 292
    invoke-virtual {v6, v8, v9}, Ld0/u;->b(J)J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    iput-wide v6, v0, Ll1/w;->l:J

    .line 297
    .line 298
    :cond_c
    iget-boolean v6, v0, Ll1/w;->k:Z

    .line 299
    .line 300
    if-eqz v6, :cond_d

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_d
    const/4 v12, 0x0

    .line 304
    :goto_4
    or-int/2addr v2, v12

    .line 305
    iget-wide v6, v0, Ll1/w;->l:J

    .line 306
    .line 307
    invoke-interface {v3, v6, v7, v2}, Ll1/h;->e(JI)V

    .line 308
    .line 309
    .line 310
    const/4 v6, 0x3

    .line 311
    iput v6, v0, Ll1/w;->c:I

    .line 312
    .line 313
    const/4 v7, 0x0

    .line 314
    iput v7, v0, Ll1/w;->d:I

    .line 315
    .line 316
    move v9, v7

    .line 317
    const/4 v8, 0x2

    .line 318
    move v7, v6

    .line 319
    const/4 v6, -0x1

    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :cond_e
    move v6, v7

    .line 323
    const/4 v7, -0x1

    .line 324
    move/from16 v17, v9

    .line 325
    .line 326
    move v9, v8

    .line 327
    move/from16 v8, v17

    .line 328
    .line 329
    goto/16 :goto_7

    .line 330
    .line 331
    :cond_f
    move v6, v7

    .line 332
    move v7, v9

    .line 333
    iget-object v8, v11, LF0/M;->b:[B

    .line 334
    .line 335
    const/16 v9, 0x9

    .line 336
    .line 337
    invoke-virtual {v0, v1, v8, v9}, Ll1/w;->d(Ld0/p;[BI)Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-eqz v8, :cond_13

    .line 342
    .line 343
    invoke-virtual {v11, v7}, LF0/M;->r(I)V

    .line 344
    .line 345
    .line 346
    const/16 v7, 0x18

    .line 347
    .line 348
    invoke-virtual {v11, v7}, LF0/M;->i(I)I

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    if-eq v7, v4, :cond_10

    .line 353
    .line 354
    const-string v8, "Unexpected start code prefix: "

    .line 355
    .line 356
    invoke-static {v7, v8, v5}, Lb3/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    const/4 v7, -0x1

    .line 360
    iput v7, v0, Ll1/w;->j:I

    .line 361
    .line 362
    const/4 v7, -0x1

    .line 363
    const/4 v8, 0x0

    .line 364
    const/4 v9, 0x2

    .line 365
    goto :goto_6

    .line 366
    :cond_10
    const/16 v7, 0x8

    .line 367
    .line 368
    invoke-virtual {v11, v7}, LF0/M;->u(I)V

    .line 369
    .line 370
    .line 371
    const/16 v8, 0x10

    .line 372
    .line 373
    invoke-virtual {v11, v8}, LF0/M;->i(I)I

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    const/4 v9, 0x5

    .line 378
    invoke-virtual {v11, v9}, LF0/M;->u(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v11}, LF0/M;->h()Z

    .line 382
    .line 383
    .line 384
    move-result v9

    .line 385
    iput-boolean v9, v0, Ll1/w;->k:Z

    .line 386
    .line 387
    const/4 v9, 0x2

    .line 388
    invoke-virtual {v11, v9}, LF0/M;->u(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v11}, LF0/M;->h()Z

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    iput-boolean v10, v0, Ll1/w;->f:Z

    .line 396
    .line 397
    invoke-virtual {v11}, LF0/M;->h()Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    iput-boolean v10, v0, Ll1/w;->g:Z

    .line 402
    .line 403
    const/4 v10, 0x6

    .line 404
    invoke-virtual {v11, v10}, LF0/M;->u(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v11, v7}, LF0/M;->i(I)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    iput v7, v0, Ll1/w;->i:I

    .line 412
    .line 413
    if-nez v8, :cond_11

    .line 414
    .line 415
    const/4 v10, -0x1

    .line 416
    iput v10, v0, Ll1/w;->j:I

    .line 417
    .line 418
    move v7, v10

    .line 419
    goto :goto_5

    .line 420
    :cond_11
    add-int/lit8 v8, v8, -0x3

    .line 421
    .line 422
    sub-int/2addr v8, v7

    .line 423
    iput v8, v0, Ll1/w;->j:I

    .line 424
    .line 425
    if-gez v8, :cond_12

    .line 426
    .line 427
    new-instance v7, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v8, "Found negative packet payload size: "

    .line 430
    .line 431
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    iget v8, v0, Ll1/w;->j:I

    .line 435
    .line 436
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    invoke-static {v5, v7}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    const/4 v7, -0x1

    .line 447
    iput v7, v0, Ll1/w;->j:I

    .line 448
    .line 449
    goto :goto_5

    .line 450
    :cond_12
    const/4 v7, -0x1

    .line 451
    :goto_5
    move v8, v9

    .line 452
    :goto_6
    iput v8, v0, Ll1/w;->c:I

    .line 453
    .line 454
    const/4 v8, 0x0

    .line 455
    iput v8, v0, Ll1/w;->d:I

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_13
    move v8, v7

    .line 459
    const/4 v7, -0x1

    .line 460
    const/4 v9, 0x2

    .line 461
    goto :goto_7

    .line 462
    :cond_14
    move/from16 v17, v7

    .line 463
    .line 464
    move v7, v6

    .line 465
    move/from16 v6, v17

    .line 466
    .line 467
    move/from16 v18, v9

    .line 468
    .line 469
    move v9, v8

    .line 470
    move/from16 v8, v18

    .line 471
    .line 472
    invoke-virtual/range {p2 .. p2}, Ld0/p;->a()I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    invoke-virtual {v1, v10}, Ld0/p;->I(I)V

    .line 477
    .line 478
    .line 479
    :goto_7
    move/from16 v17, v7

    .line 480
    .line 481
    move v7, v6

    .line 482
    move/from16 v6, v17

    .line 483
    .line 484
    move/from16 v18, v9

    .line 485
    .line 486
    move v9, v8

    .line 487
    move/from16 v8, v18

    .line 488
    .line 489
    goto/16 :goto_2

    .line 490
    .line 491
    :cond_15
    return-void
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

.method public final c(Ld0/u;LF0/s;Ll1/E;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/w;->e:Ld0/u;

    .line 2
    .line 3
    iget-object p1, p0, Ll1/w;->a:Ll1/h;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Ll1/h;->d(LF0/s;Ll1/E;)V

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

.method public final d(Ld0/p;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ld0/p;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/w;->d:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ld0/p;->I(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, Ll1/w;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, Ld0/p;->g([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, Ll1/w;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Ll1/w;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/4 v1, 0x0

    .line 37
    :goto_1
    return v1
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
