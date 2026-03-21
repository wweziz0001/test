.class public final Ln0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# static fields
.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ld0/u;

.field public final c:Ld0/p;

.field public final d:La0/z;

.field public final e:Z

.field public f:LF0/s;

.field public g:[B

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "LOCAL:([^,]+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ln0/t;->i:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "MPEGTS:(-?\\d+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ln0/t;->j:Ljava/util/regex/Pattern;

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
.end method

.method public constructor <init>(Ljava/lang/String;Ld0/u;La0/z;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln0/t;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ln0/t;->b:Ld0/u;

    .line 7
    .line 8
    new-instance p1, Ld0/p;

    .line 9
    .line 10
    invoke-direct {p1}, Ld0/p;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ln0/t;->c:Ld0/p;

    .line 14
    .line 15
    const/16 p1, 0x400

    .line 16
    .line 17
    new-array p1, p1, [B

    .line 18
    .line 19
    iput-object p1, p0, Ln0/t;->g:[B

    .line 20
    .line 21
    iput-object p3, p0, Ln0/t;->d:La0/z;

    .line 22
    .line 23
    iput-boolean p4, p0, Ln0/t;->e:Z

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public final a(J)LF0/K;
    .locals 3

    .line 1
    iget-object v0, p0, Ln0/t;->f:LF0/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-interface {v0, v1, v2}, LF0/s;->k(II)LF0/K;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La0/o;

    .line 10
    .line 11
    invoke-direct {v1}, La0/o;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "text/vtt"

    .line 15
    .line 16
    invoke-static {v2}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v1, La0/o;->m:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Ln0/t;->a:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v2, v1, La0/o;->d:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide p1, v1, La0/o;->r:J

    .line 27
    .line 28
    invoke-static {v1, v0}, Lm/B0;->k(La0/o;LF0/K;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ln0/t;->f:LF0/s;

    .line 32
    .line 33
    invoke-interface {p1}, LF0/s;->j()V

    .line 34
    .line 35
    .line 36
    return-object v0
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

.method public final b(JJ)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
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

.method public final d(LF0/r;LF0/u;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln0/t;->f:LF0/s;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LF0/m;

    .line 11
    .line 12
    iget-wide v1, v1, LF0/m;->n:J

    .line 13
    .line 14
    long-to-int v1, v1

    .line 15
    iget v2, v0, Ln0/t;->h:I

    .line 16
    .line 17
    iget-object v3, v0, Ln0/t;->g:[B

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    const/4 v5, -0x1

    .line 21
    if-ne v2, v4, :cond_1

    .line 22
    .line 23
    if-eq v1, v5, :cond_0

    .line 24
    .line 25
    move v2, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    array-length v2, v3

    .line 28
    :goto_0
    mul-int/lit8 v2, v2, 0x3

    .line 29
    .line 30
    div-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, v0, Ln0/t;->g:[B

    .line 37
    .line 38
    :cond_1
    iget-object v2, v0, Ln0/t;->g:[B

    .line 39
    .line 40
    iget v3, v0, Ln0/t;->h:I

    .line 41
    .line 42
    array-length v4, v2

    .line 43
    sub-int/2addr v4, v3

    .line 44
    move-object/from16 v6, p1

    .line 45
    .line 46
    check-cast v6, LF0/m;

    .line 47
    .line 48
    invoke-virtual {v6, v2, v3, v4}, LF0/m;->read([BII)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x0

    .line 53
    if-eq v2, v5, :cond_3

    .line 54
    .line 55
    iget v4, v0, Ln0/t;->h:I

    .line 56
    .line 57
    add-int/2addr v4, v2

    .line 58
    iput v4, v0, Ln0/t;->h:I

    .line 59
    .line 60
    if-eq v1, v5, :cond_2

    .line 61
    .line 62
    if-eq v4, v1, :cond_3

    .line 63
    .line 64
    :cond_2
    return v3

    .line 65
    :cond_3
    new-instance v1, Ld0/p;

    .line 66
    .line 67
    iget-object v2, v0, Ln0/t;->g:[B

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ld0/p;-><init>([B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lk1/i;->d(Ld0/p;)V

    .line 73
    .line 74
    .line 75
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-wide/16 v6, 0x0

    .line 82
    .line 83
    move-wide v8, v6

    .line 84
    move-wide v10, v8

    .line 85
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    const/4 v12, 0x1

    .line 90
    const/4 v13, 0x0

    .line 91
    if-nez v4, :cond_7

    .line 92
    .line 93
    const-string v4, "X-TIMESTAMP-MAP"

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    sget-object v4, Ln0/t;->i:Ljava/util/regex/Pattern;

    .line 102
    .line 103
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_5

    .line 112
    .line 113
    sget-object v8, Ln0/t;->j:Ljava/util/regex/Pattern;

    .line 114
    .line 115
    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    invoke-virtual {v4, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lk1/i;->c(Ljava/lang/String;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    invoke-virtual {v8, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v12

    .line 147
    sget v2, Ld0/w;->a:I

    .line 148
    .line 149
    sget-object v18, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 150
    .line 151
    const-wide/32 v14, 0xf4240

    .line 152
    .line 153
    .line 154
    const-wide/32 v16, 0x15f90

    .line 155
    .line 156
    .line 157
    invoke-static/range {v12 .. v18}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    goto :goto_2

    .line 162
    :cond_4
    const-string v1, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v13, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    throw v1

    .line 173
    :cond_5
    const-string v1, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v13, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    throw v1

    .line 184
    :cond_6
    :goto_2
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    goto :goto_1

    .line 191
    :cond_7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_9

    .line 198
    .line 199
    sget-object v4, Lk1/i;->a:Ljava/util/regex/Pattern;

    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    :goto_3
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    if-eqz v2, :cond_7

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-nez v2, :cond_7

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_8
    sget-object v4, Lk1/h;->a:Ljava/util/regex/Pattern;

    .line 227
    .line 228
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_7

    .line 237
    .line 238
    move-object v13, v2

    .line 239
    :cond_9
    if-nez v13, :cond_a

    .line 240
    .line 241
    invoke-virtual {v0, v6, v7}, Ln0/t;->a(J)LF0/K;

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_a
    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {v1}, Lk1/i;->c(Ljava/lang/String;)J

    .line 253
    .line 254
    .line 255
    move-result-wide v1

    .line 256
    add-long/2addr v8, v1

    .line 257
    sub-long v12, v8, v10

    .line 258
    .line 259
    sget v4, Ld0/w;->a:I

    .line 260
    .line 261
    sget-object v18, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 262
    .line 263
    const-wide/32 v14, 0x15f90

    .line 264
    .line 265
    .line 266
    const-wide/32 v16, 0xf4240

    .line 267
    .line 268
    .line 269
    invoke-static/range {v12 .. v18}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 270
    .line 271
    .line 272
    move-result-wide v6

    .line 273
    const-wide v8, 0x200000000L

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    rem-long/2addr v6, v8

    .line 279
    iget-object v4, v0, Ln0/t;->b:Ld0/u;

    .line 280
    .line 281
    invoke-virtual {v4, v6, v7}, Ld0/u;->b(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v9

    .line 285
    sub-long v1, v9, v1

    .line 286
    .line 287
    invoke-virtual {v0, v1, v2}, Ln0/t;->a(J)LF0/K;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    iget-object v1, v0, Ln0/t;->g:[B

    .line 292
    .line 293
    iget v2, v0, Ln0/t;->h:I

    .line 294
    .line 295
    iget-object v4, v0, Ln0/t;->c:Ld0/p;

    .line 296
    .line 297
    invoke-virtual {v4, v2, v1}, Ld0/p;->F(I[B)V

    .line 298
    .line 299
    .line 300
    iget v1, v0, Ln0/t;->h:I

    .line 301
    .line 302
    invoke-interface {v8, v4, v1, v3}, LF0/K;->a(Ld0/p;II)V

    .line 303
    .line 304
    .line 305
    iget v12, v0, Ln0/t;->h:I

    .line 306
    .line 307
    const/4 v11, 0x1

    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    invoke-interface/range {v8 .. v14}, LF0/K;->b(JIIILF0/J;)V

    .line 311
    .line 312
    .line 313
    :goto_4
    return v5
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

.method public final e(LF0/r;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ln0/t;->g:[B

    .line 2
    .line 3
    check-cast p1, LF0/m;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x6

    .line 7
    invoke-virtual {p1, v0, v1, v2, v1}, LF0/m;->t([BIIZ)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ln0/t;->g:[B

    .line 11
    .line 12
    iget-object v3, p0, Ln0/t;->c:Ld0/p;

    .line 13
    .line 14
    invoke-virtual {v3, v2, v0}, Ld0/p;->F(I[B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lk1/i;->a(Ld0/p;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    iget-object v0, p0, Ln0/t;->g:[B

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-virtual {p1, v0, v2, v4, v1}, LF0/m;->t([BIIZ)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ln0/t;->g:[B

    .line 32
    .line 33
    const/16 v0, 0x9

    .line 34
    .line 35
    invoke-virtual {v3, v0, p1}, Ld0/p;->F(I[B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Lk1/i;->a(Ld0/p;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
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

.method public final j(LF0/s;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ln0/t;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LZ1/s;

    .line 6
    .line 7
    iget-object v1, p0, Ln0/t;->d:La0/z;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, LZ1/s;-><init>(LF0/s;Lc1/j;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Ln0/t;->f:LF0/s;

    .line 14
    .line 15
    new-instance v0, LF0/v;

    .line 16
    .line 17
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, LF0/v;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, LF0/s;->d(LF0/E;)V

    .line 26
    .line 27
    .line 28
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

.method public final release()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
