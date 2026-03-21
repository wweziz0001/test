.class public abstract LZ0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Ld0/w;->a:I

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LZ0/h;->a:[B

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

.method public static a(ILd0/p;)LZ0/b;
    .locals 12

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ld0/p;->H(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Ld0/p;->I(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LZ0/h;->b(Ld0/p;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, Ld0/p;->I(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ld0/p;->v()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ld0/p;->I(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ld0/p;->v()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, Ld0/p;->I(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ld0/p;->I(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, Ld0/p;->I(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, LZ0/h;->b(Ld0/p;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ld0/p;->v()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, La0/G;->e(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, Ld0/p;->I(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ld0/p;->x()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, Ld0/p;->x()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, Ld0/p;->I(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, LZ0/h;->b(Ld0/p;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    new-array v5, p0, [B

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-virtual {p1, v5, v6, p0}, Ld0/p;->g([BII)V

    .line 108
    .line 109
    .line 110
    new-instance p0, LZ0/b;

    .line 111
    .line 112
    const-wide/16 v6, 0x0

    .line 113
    .line 114
    cmp-long p1, v3, v6

    .line 115
    .line 116
    const-wide/16 v8, -0x1

    .line 117
    .line 118
    if-lez p1, :cond_4

    .line 119
    .line 120
    move-wide v10, v3

    .line 121
    goto :goto_0

    .line 122
    :cond_4
    move-wide v10, v8

    .line 123
    :goto_0
    cmp-long p1, v0, v6

    .line 124
    .line 125
    if-lez p1, :cond_5

    .line 126
    .line 127
    move-wide v6, v0

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move-wide v6, v8

    .line 130
    :goto_1
    move-object v1, p0

    .line 131
    move-object v3, v5

    .line 132
    move-wide v4, v10

    .line 133
    invoke-direct/range {v1 .. v7}, LZ0/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_6
    :goto_2
    new-instance p0, LZ0/b;

    .line 138
    .line 139
    const-wide/16 v4, -0x1

    .line 140
    .line 141
    const-wide/16 v6, -0x1

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    move-object v1, p0

    .line 145
    invoke-direct/range {v1 .. v7}, LZ0/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 146
    .line 147
    .line 148
    return-object p0
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
.end method

.method public static b(Ld0/p;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld0/p;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ld0/p;->v()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
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

.method public static c(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
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

.method public static d(Ld0/p;)Le0/f;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld0/p;->H(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ld0/p;->i()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LZ0/h;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ld0/p;->x()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Ld0/p;->x()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Ld0/p;->p()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Ld0/p;->p()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Ld0/p;->x()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance p0, Le0/f;

    .line 41
    .line 42
    move-object v4, p0

    .line 43
    invoke-direct/range {v4 .. v10}, Le0/f;-><init>(JJJ)V

    .line 44
    .line 45
    .line 46
    return-object p0
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

.method public static e(Ld0/p;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ld0/p;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ld0/p;->H(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v5

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v10, v5

    .line 43
    move v9, v8

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    :goto_2
    sub-int v12, v7, v1

    .line 47
    .line 48
    const/4 v13, 0x4

    .line 49
    if-ge v12, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Ld0/p;->H(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const v3, 0x66726d61

    .line 63
    .line 64
    .line 65
    if-ne v14, v3, :cond_1

    .line 66
    .line 67
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    goto :goto_3

    .line 76
    :cond_1
    const v3, 0x7363686d

    .line 77
    .line 78
    .line 79
    if-ne v14, v3, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0, v13}, Ld0/p;->I(I)V

    .line 82
    .line 83
    .line 84
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 85
    .line 86
    invoke-virtual {v0, v13, v3}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    const v3, 0x73636869

    .line 92
    .line 93
    .line 94
    if-ne v14, v3, :cond_3

    .line 95
    .line 96
    move v9, v7

    .line 97
    move v10, v12

    .line 98
    :cond_3
    :goto_3
    add-int/2addr v7, v12

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const-string v3, "cenc"

    .line 101
    .line 102
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_6

    .line 107
    .line 108
    const-string v3, "cbc1"

    .line 109
    .line 110
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_6

    .line 115
    .line 116
    const-string v3, "cens"

    .line 117
    .line 118
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_6

    .line 123
    .line 124
    const-string v3, "cbcs"

    .line 125
    .line 126
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    const/4 v3, 0x0

    .line 134
    goto/16 :goto_c

    .line 135
    .line 136
    :cond_6
    :goto_4
    if-eqz v15, :cond_7

    .line 137
    .line 138
    move v3, v6

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move v3, v5

    .line 141
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 142
    .line 143
    invoke-static {v7, v3}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    if-eq v9, v8, :cond_8

    .line 147
    .line 148
    move v3, v6

    .line 149
    goto :goto_6

    .line 150
    :cond_8
    move v3, v5

    .line 151
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 152
    .line 153
    invoke-static {v7, v3}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v3, v9, 0x8

    .line 157
    .line 158
    :goto_7
    sub-int v7, v3, v9

    .line 159
    .line 160
    if-ge v7, v10, :cond_d

    .line 161
    .line 162
    invoke-virtual {v0, v3}, Ld0/p;->H(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    const v12, 0x74656e63

    .line 174
    .line 175
    .line 176
    if-ne v8, v12, :cond_c

    .line 177
    .line 178
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-static {v3}, LZ0/h;->c(I)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    invoke-virtual {v0, v6}, Ld0/p;->I(I)V

    .line 187
    .line 188
    .line 189
    if-nez v3, :cond_9

    .line 190
    .line 191
    invoke-virtual {v0, v6}, Ld0/p;->I(I)V

    .line 192
    .line 193
    .line 194
    move v3, v5

    .line 195
    move v14, v3

    .line 196
    goto :goto_8

    .line 197
    :cond_9
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    and-int/lit16 v7, v3, 0xf0

    .line 202
    .line 203
    shr-int/2addr v7, v13

    .line 204
    and-int/lit8 v3, v3, 0xf

    .line 205
    .line 206
    move v14, v7

    .line 207
    :goto_8
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-ne v7, v6, :cond_a

    .line 212
    .line 213
    move v10, v6

    .line 214
    goto :goto_9

    .line 215
    :cond_a
    move v10, v5

    .line 216
    :goto_9
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    const/16 v7, 0x10

    .line 221
    .line 222
    new-array v13, v7, [B

    .line 223
    .line 224
    invoke-virtual {v0, v13, v5, v7}, Ld0/p;->g([BII)V

    .line 225
    .line 226
    .line 227
    if-eqz v10, :cond_b

    .line 228
    .line 229
    if-nez v12, :cond_b

    .line 230
    .line 231
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    new-array v8, v7, [B

    .line 236
    .line 237
    invoke-virtual {v0, v8, v5, v7}, Ld0/p;->g([BII)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v16, v8

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_b
    const/16 v16, 0x0

    .line 244
    .line 245
    :goto_a
    new-instance v7, LZ0/u;

    .line 246
    .line 247
    move-object v9, v7

    .line 248
    move-object v8, v15

    .line 249
    move v15, v3

    .line 250
    invoke-direct/range {v9 .. v16}, LZ0/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 251
    .line 252
    .line 253
    move-object v3, v7

    .line 254
    goto :goto_b

    .line 255
    :cond_c
    move-object v8, v15

    .line 256
    add-int/2addr v3, v7

    .line 257
    goto :goto_7

    .line 258
    :cond_d
    move-object v8, v15

    .line 259
    const/4 v3, 0x0

    .line 260
    :goto_b
    if-eqz v3, :cond_e

    .line 261
    .line 262
    move v5, v6

    .line 263
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 264
    .line 265
    invoke-static {v6, v5}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 266
    .line 267
    .line 268
    sget v5, Ld0/w;->a:I

    .line 269
    .line 270
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    :goto_c
    if-eqz v3, :cond_f

    .line 275
    .line 276
    return-object v3

    .line 277
    :cond_f
    add-int/2addr v1, v2

    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_10
    const/4 v1, 0x0

    .line 281
    return-object v1
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
.end method

.method public static f(Ld0/p;IILjava/lang/String;La0/l;Z)LZ0/e;
    .locals 61

    move-object/from16 v9, p0

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    .line 1
    const-string v6, "audio/mhm1"

    const-string v16, "audio/ac4"

    const-string v17, "audio/eac3"

    const-wide/16 v18, 0x0

    const/4 v3, 0x0

    const/16 v12, 0xc

    invoke-virtual {v9, v12}, Ld0/p;->H(I)V

    .line 2
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v12

    .line 3
    new-instance v13, LZ0/e;

    .line 4
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 5
    new-array v8, v12, [LZ0/u;

    iput-object v8, v13, LZ0/e;->c:Ljava/lang/Object;

    .line 6
    iput v3, v13, LZ0/e;->b:I

    move v8, v3

    :goto_0
    if-ge v8, v12, :cond_9e

    .line 7
    iget v14, v9, Ld0/p;->b:I

    .line 8
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v15

    if-lez v15, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    move v7, v3

    .line 9
    :goto_1
    const-string v1, "childAtomSize must be positive"

    invoke-static {v1, v7}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 10
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v7

    const v5, 0x61766331

    if-eq v7, v5, :cond_1

    const v5, 0x61766333

    if-eq v7, v5, :cond_1

    const v5, 0x656e6376

    if-eq v7, v5, :cond_1

    const v5, 0x6d317620

    if-eq v7, v5, :cond_1

    const v5, 0x6d703476

    if-eq v7, v5, :cond_1

    const v5, 0x68766331

    if-eq v7, v5, :cond_1

    const v5, 0x68657631

    if-eq v7, v5, :cond_1

    const v5, 0x73323633

    if-eq v7, v5, :cond_1

    const v5, 0x48323633

    if-eq v7, v5, :cond_1

    const v5, 0x68323633

    if-eq v7, v5, :cond_1

    const v5, 0x76703038

    if-eq v7, v5, :cond_1

    const v5, 0x76703039

    if-eq v7, v5, :cond_1

    const v5, 0x61763031

    if-eq v7, v5, :cond_1

    const v5, 0x64766176

    if-eq v7, v5, :cond_1

    const v5, 0x64766131

    if-eq v7, v5, :cond_1

    const v5, 0x64766865

    if-eq v7, v5, :cond_1

    const v5, 0x64766831

    if-ne v7, v5, :cond_2

    :cond_1
    move-object/from16 v40, v6

    move/from16 v34, v8

    move-object v11, v10

    move/from16 v35, v12

    move-object v12, v13

    move/from16 v39, v14

    move/from16 v38, v15

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object v13, v9

    const/16 v9, 0x10

    goto/16 :goto_5c

    :cond_2
    const v5, 0x6d703461

    const v4, 0x65632d33

    const v2, 0x61632d33

    const v3, 0x656e6361

    const v0, 0x616c6163

    if-eq v7, v5, :cond_3

    if-eq v7, v3, :cond_3

    if-eq v7, v2, :cond_3

    if-eq v7, v4, :cond_3

    const v5, 0x61632d34

    if-eq v7, v5, :cond_3

    const v5, 0x6d6c7061

    if-eq v7, v5, :cond_3

    const v5, 0x64747363

    if-eq v7, v5, :cond_3

    const v5, 0x64747365

    if-eq v7, v5, :cond_3

    const v5, 0x64747368

    if-eq v7, v5, :cond_3

    const v5, 0x6474736c

    if-eq v7, v5, :cond_3

    const v5, 0x64747378

    if-eq v7, v5, :cond_3

    const v5, 0x73616d72

    if-eq v7, v5, :cond_3

    const v5, 0x73617762

    if-eq v7, v5, :cond_3

    const v5, 0x6c70636d

    if-eq v7, v5, :cond_3

    const v5, 0x736f7774

    if-eq v7, v5, :cond_3

    const v5, 0x74776f73

    if-eq v7, v5, :cond_3

    const v5, 0x2e6d7032

    if-eq v7, v5, :cond_3

    const v5, 0x2e6d7033

    if-eq v7, v5, :cond_3

    const v5, 0x6d686131

    if-eq v7, v5, :cond_3

    const v5, 0x6d686d31

    if-eq v7, v5, :cond_3

    if-eq v7, v0, :cond_3

    const v5, 0x616c6177

    if-eq v7, v5, :cond_3

    const v5, 0x756c6177

    if-eq v7, v5, :cond_3

    const v5, 0x4f707573

    if-eq v7, v5, :cond_3

    const v5, 0x664c6143

    if-eq v7, v5, :cond_3

    const v5, 0x69616d66

    if-ne v7, v5, :cond_4

    :cond_3
    const/16 v5, 0x10

    goto/16 :goto_8

    :cond_4
    const v0, 0x63363038

    const v1, 0x73747070

    const v2, 0x77767474

    const v3, 0x74783367

    const v4, 0x54544d4c

    if-eq v7, v4, :cond_5

    if-eq v7, v3, :cond_5

    if-eq v7, v2, :cond_5

    if-eq v7, v1, :cond_5

    if-ne v7, v0, :cond_6

    :cond_5
    const/16 v33, 0x10

    goto/16 :goto_4

    :cond_6
    const v5, 0x6d657474

    if-ne v7, v5, :cond_8

    const/16 v0, 0x10

    add-int/lit8 v1, v14, 0x10

    .line 11
    invoke-virtual {v9, v1}, Ld0/p;->H(I)V

    if-ne v7, v5, :cond_7

    .line 12
    invoke-virtual/range {p0 .. p0}, Ld0/p;->q()Ljava/lang/String;

    .line 13
    invoke-virtual/range {p0 .. p0}, Ld0/p;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 14
    new-instance v1, La0/o;

    invoke-direct {v1}, La0/o;-><init>()V

    .line 15
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, La0/o;->a:Ljava/lang/String;

    .line 16
    invoke-static {v0}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, La0/o;->m:Ljava/lang/String;

    .line 17
    new-instance v0, La0/p;

    invoke-direct {v0, v1}, La0/p;-><init>(La0/o;)V

    .line 18
    iput-object v0, v13, LZ0/e;->d:Ljava/lang/Object;

    :cond_7
    :goto_2
    move/from16 v26, v5

    move-object/from16 v31, v6

    move/from16 v25, v8

    move-object v11, v10

    move/from16 v35, v12

    move-object v12, v13

    move/from16 v39, v14

    move/from16 v38, v15

    const/4 v10, 0x2

    const/4 v14, 0x1

    const/16 v15, 0xff

    const/16 v20, 0x8

    const/16 v21, 0xa

    const/16 v22, 0x0

    const/16 v24, 0x9

    :goto_3
    const/16 v28, 0x5

    const/16 v30, 0x0

    const/16 v32, 0x7

    move-object v13, v9

    const/16 v9, 0x10

    goto/16 :goto_5d

    :cond_8
    const v0, 0x63616d6d

    if-ne v7, v0, :cond_7

    .line 19
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 20
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->a:Ljava/lang/String;

    .line 21
    const-string v1, "application/x-camera-motion"

    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->m:Ljava/lang/String;

    .line 22
    new-instance v1, La0/p;

    invoke-direct {v1, v0}, La0/p;-><init>(La0/o;)V

    .line 23
    iput-object v1, v13, LZ0/e;->d:Ljava/lang/Object;

    goto :goto_2

    :goto_4
    add-int/lit8 v5, v14, 0x10

    .line 24
    invoke-virtual {v9, v5}, Ld0/p;->H(I)V

    .line 25
    const-string v5, "application/ttml+xml"

    const-wide v34, 0x7fffffffffffffffL

    if-ne v7, v4, :cond_9

    :goto_5
    move-wide/from16 v1, v34

    :goto_6
    const/4 v0, 0x0

    goto :goto_7

    :cond_9
    if-ne v7, v3, :cond_a

    add-int/lit8 v0, v15, -0x10

    .line 26
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 27
    invoke-virtual {v9, v1, v2, v0}, Ld0/p;->g([BII)V

    .line 28
    invoke-static {v1}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    .line 29
    const-string v5, "application/x-quicktime-tx3g"

    move-wide/from16 v1, v34

    goto :goto_7

    :cond_a
    if-ne v7, v2, :cond_b

    .line 30
    const-string v5, "application/x-mp4-vtt"

    goto :goto_5

    :cond_b
    if-ne v7, v1, :cond_c

    move-wide/from16 v1, v18

    goto :goto_6

    :cond_c
    if-ne v7, v0, :cond_d

    const/4 v0, 0x1

    .line 31
    iput v0, v13, LZ0/e;->b:I

    const-string v5, "application/x-mp4-cea-608"

    goto :goto_5

    .line 32
    :goto_7
    new-instance v3, La0/o;

    invoke-direct {v3}, La0/o;-><init>()V

    .line 33
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, La0/o;->a:Ljava/lang/String;

    .line 34
    invoke-static {v5}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, La0/o;->m:Ljava/lang/String;

    .line 35
    iput-object v10, v3, La0/o;->d:Ljava/lang/String;

    .line 36
    iput-wide v1, v3, La0/o;->r:J

    .line 37
    iput-object v0, v3, La0/o;->p:Ljava/util/List;

    .line 38
    new-instance v0, La0/p;

    invoke-direct {v0, v3}, La0/p;-><init>(La0/o;)V

    .line 39
    iput-object v0, v13, LZ0/e;->d:Ljava/lang/Object;

    move-object/from16 v31, v6

    move/from16 v25, v8

    move-object v11, v10

    move/from16 v35, v12

    move-object v12, v13

    move/from16 v39, v14

    move/from16 v38, v15

    const/4 v10, 0x2

    const/4 v14, 0x1

    const/16 v15, 0xff

    const/16 v20, 0x8

    const/16 v21, 0xa

    const/16 v22, 0x0

    const/16 v24, 0x9

    const v26, 0x6d657474

    goto/16 :goto_3

    .line 40
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :goto_8
    add-int/lit8 v0, v14, 0x10

    .line 41
    invoke-virtual {v9, v0}, Ld0/p;->H(I)V

    const/4 v0, 0x6

    if-eqz p5, :cond_e

    .line 42
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v5

    .line 43
    invoke-virtual {v9, v0}, Ld0/p;->I(I)V

    goto :goto_9

    :cond_e
    const/16 v5, 0x8

    .line 44
    invoke-virtual {v9, v5}, Ld0/p;->I(I)V

    const/4 v5, 0x0

    :goto_9
    const/16 v53, 0x15

    const/16 v4, 0x18

    const/high16 v54, 0x10000000

    const/4 v2, 0x4

    if-eqz v5, :cond_f

    const/4 v3, 0x1

    if-ne v5, v3, :cond_10

    :cond_f
    move-object v3, v1

    goto/16 :goto_e

    :cond_10
    const/4 v3, 0x2

    if-ne v5, v3, :cond_1b

    const/16 v3, 0x10

    .line 45
    invoke-virtual {v9, v3}, Ld0/p;->I(I)V

    .line 46
    invoke-virtual/range {p0 .. p0}, Ld0/p;->p()J

    move-result-wide v56

    invoke-static/range {v56 .. v57}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v56

    move-object v3, v1

    .line 47
    invoke-static/range {v56 .. v57}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    .line 48
    invoke-virtual/range {p0 .. p0}, Ld0/p;->z()I

    move-result v1

    .line 49
    invoke-virtual {v9, v2}, Ld0/p;->I(I)V

    .line 50
    invoke-virtual/range {p0 .. p0}, Ld0/p;->z()I

    move-result v5

    .line 51
    invoke-virtual/range {p0 .. p0}, Ld0/p;->z()I

    move-result v56

    const/16 v31, 0x1

    and-int/lit8 v57, v56, 0x1

    const/16 v29, 0x2

    if-eqz v57, :cond_11

    const/16 v57, 0x1

    goto :goto_a

    :cond_11
    const/16 v57, 0x0

    :goto_a
    and-int/lit8 v56, v56, 0x2

    if-eqz v56, :cond_12

    const/16 v56, 0x1

    goto :goto_b

    :cond_12
    const/16 v56, 0x0

    :goto_b
    if-nez v57, :cond_19

    const/16 v2, 0x8

    if-ne v5, v2, :cond_13

    move v5, v2

    const/4 v2, 0x3

    goto :goto_d

    :cond_13
    const/16 v2, 0x10

    if-ne v5, v2, :cond_15

    if-eqz v56, :cond_14

    move/from16 v2, v54

    goto :goto_c

    :cond_14
    const/4 v2, 0x2

    :goto_c
    const/16 v5, 0x8

    goto :goto_d

    :cond_15
    if-ne v5, v4, :cond_17

    if-eqz v56, :cond_16

    const/high16 v2, 0x50000000

    goto :goto_c

    :cond_16
    move/from16 v2, v53

    goto :goto_c

    :cond_17
    const/16 v2, 0x20

    if-ne v5, v2, :cond_1a

    if-eqz v56, :cond_18

    const/high16 v2, 0x60000000

    goto :goto_c

    :cond_18
    const/16 v2, 0x16

    goto :goto_c

    :cond_19
    const/16 v2, 0x20

    if-ne v5, v2, :cond_1a

    const/4 v2, 0x4

    goto :goto_c

    :cond_1a
    const/4 v2, -0x1

    goto :goto_c

    .line 52
    :goto_d
    invoke-virtual {v9, v5}, Ld0/p;->I(I)V

    move v4, v0

    move v0, v2

    const/4 v2, 0x0

    const v5, 0x69616d66

    goto :goto_f

    :cond_1b
    move/from16 v22, v3

    move-object/from16 v40, v6

    move/from16 v34, v8

    move-object v11, v10

    move/from16 v35, v12

    move-object v12, v13

    move/from16 v39, v14

    move/from16 v38, v15

    const/4 v3, 0x0

    const/16 v25, 0x7

    move-object v13, v9

    goto/16 :goto_5b

    .line 53
    :goto_e
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v0

    const/4 v1, 0x6

    .line 54
    invoke-virtual {v9, v1}, Ld0/p;->I(I)V

    .line 55
    invoke-virtual/range {p0 .. p0}, Ld0/p;->w()I

    move-result v1

    .line 56
    iget v2, v9, Ld0/p;->b:I

    const/16 v56, 0x4

    add-int/lit8 v2, v2, -0x4

    .line 57
    invoke-virtual {v9, v2}, Ld0/p;->H(I)V

    .line 58
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v2

    const/4 v4, 0x1

    if-ne v5, v4, :cond_1c

    const/16 v4, 0x10

    .line 59
    invoke-virtual {v9, v4}, Ld0/p;->I(I)V

    :cond_1c
    move v4, v1

    const v5, 0x69616d66

    move v1, v0

    const/4 v0, -0x1

    :goto_f
    if-ne v7, v5, :cond_1d

    const/4 v1, -0x1

    const/4 v4, -0x1

    .line 60
    :cond_1d
    iget v5, v9, Ld0/p;->b:I

    move/from16 v57, v1

    const v1, 0x656e6361

    if-ne v7, v1, :cond_20

    .line 61
    invoke-static {v9, v14, v15}, LZ0/h;->e(Ld0/p;II)Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_1f

    .line 62
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v11, :cond_1e

    move/from16 v55, v4

    const/4 v4, 0x0

    goto :goto_10

    :cond_1e
    move/from16 v55, v4

    .line 63
    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, LZ0/u;

    iget-object v4, v4, LZ0/u;->b:Ljava/lang/String;

    invoke-virtual {v11, v4}, La0/l;->d(Ljava/lang/String;)La0/l;

    move-result-object v4

    .line 64
    :goto_10
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, LZ0/u;

    move-object/from16 v58, v4

    iget-object v4, v13, LZ0/e;->c:Ljava/lang/Object;

    check-cast v4, [LZ0/u;

    aput-object v1, v4, v8

    move-object/from16 v4, v58

    goto :goto_11

    :cond_1f
    move/from16 v55, v4

    move-object v4, v11

    .line 65
    :goto_11
    invoke-virtual {v9, v5}, Ld0/p;->H(I)V

    goto :goto_12

    :cond_20
    move/from16 v55, v4

    move-object v4, v11

    .line 66
    :goto_12
    const-string v1, "audio/ac3"

    move/from16 v58, v5

    const v5, 0x61632d33

    if-ne v7, v5, :cond_21

    move-object v5, v1

    goto/16 :goto_16

    :cond_21
    const v5, 0x65632d33

    if-ne v7, v5, :cond_22

    move-object/from16 v5, v17

    goto/16 :goto_16

    :cond_22
    const v5, 0x61632d34

    if-ne v7, v5, :cond_23

    move-object/from16 v5, v16

    goto/16 :goto_16

    :cond_23
    const v5, 0x64747363

    if-ne v7, v5, :cond_24

    .line 67
    const-string v5, "audio/vnd.dts"

    goto/16 :goto_16

    :cond_24
    const v5, 0x64747368

    if-eq v7, v5, :cond_39

    const v5, 0x6474736c

    if-ne v7, v5, :cond_25

    goto/16 :goto_15

    :cond_25
    const v5, 0x64747365

    if-ne v7, v5, :cond_26

    .line 68
    const-string v5, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_16

    :cond_26
    const v5, 0x64747378

    if-ne v7, v5, :cond_27

    .line 69
    const-string v5, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_16

    :cond_27
    const v5, 0x73616d72

    if-ne v7, v5, :cond_28

    .line 70
    const-string v5, "audio/3gpp"

    goto/16 :goto_16

    :cond_28
    const v5, 0x73617762

    if-ne v7, v5, :cond_29

    .line 71
    const-string v5, "audio/amr-wb"

    goto/16 :goto_16

    .line 72
    :cond_29
    const-string v5, "audio/raw"

    move-object/from16 v46, v5

    const v5, 0x736f7774

    if-ne v7, v5, :cond_2a

    :goto_13
    move-object/from16 v5, v46

    const/4 v0, 0x2

    goto/16 :goto_16

    :cond_2a
    const v5, 0x74776f73

    if-ne v7, v5, :cond_2b

    move-object/from16 v5, v46

    move/from16 v0, v54

    goto/16 :goto_16

    :cond_2b
    const v5, 0x6c70636d

    if-ne v7, v5, :cond_2d

    const/4 v5, -0x1

    if-ne v0, v5, :cond_2c

    goto :goto_13

    :cond_2c
    move-object/from16 v5, v46

    goto/16 :goto_16

    :cond_2d
    const v5, 0x2e6d7032

    if-eq v7, v5, :cond_38

    const v5, 0x2e6d7033

    if-ne v7, v5, :cond_2e

    goto :goto_14

    :cond_2e
    const v5, 0x6d686131

    if-ne v7, v5, :cond_2f

    .line 73
    const-string v5, "audio/mha1"

    goto :goto_16

    :cond_2f
    const v5, 0x6d686d31

    if-ne v7, v5, :cond_30

    move-object v5, v6

    goto :goto_16

    :cond_30
    const v5, 0x616c6163

    if-ne v7, v5, :cond_31

    .line 74
    const-string v5, "audio/alac"

    goto :goto_16

    :cond_31
    const v5, 0x616c6177

    if-ne v7, v5, :cond_32

    .line 75
    const-string v5, "audio/g711-alaw"

    goto :goto_16

    :cond_32
    const v5, 0x756c6177

    if-ne v7, v5, :cond_33

    .line 76
    const-string v5, "audio/g711-mlaw"

    goto :goto_16

    :cond_33
    const v5, 0x4f707573

    if-ne v7, v5, :cond_34

    .line 77
    const-string v5, "audio/opus"

    goto :goto_16

    :cond_34
    const v5, 0x664c6143

    if-ne v7, v5, :cond_35

    .line 78
    const-string v5, "audio/flac"

    goto :goto_16

    :cond_35
    const v5, 0x6d6c7061

    if-ne v7, v5, :cond_36

    .line 79
    const-string v5, "audio/true-hd"

    goto :goto_16

    :cond_36
    const v5, 0x69616d66

    if-ne v7, v5, :cond_37

    .line 80
    const-string v5, "audio/iamf"

    goto :goto_16

    :cond_37
    const/4 v5, 0x0

    goto :goto_16

    .line 81
    :cond_38
    :goto_14
    const-string v5, "audio/mpeg"

    goto :goto_16

    .line 82
    :cond_39
    :goto_15
    const-string v5, "audio/vnd.dts.hd"

    :goto_16
    move/from16 v36, v0

    move-object v11, v5

    move/from16 v34, v8

    move/from16 v35, v12

    move/from16 v7, v55

    move/from16 v5, v57

    move/from16 v8, v58

    const/4 v0, 0x0

    const/16 v37, 0x0

    const/16 v59, 0x0

    :goto_17
    sub-int v12, v8, v14

    if-ge v12, v15, :cond_9b

    .line 83
    invoke-virtual {v9, v8}, Ld0/p;->H(I)V

    .line 84
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v12

    move/from16 v38, v15

    if-lez v12, :cond_3a

    const/4 v15, 0x1

    goto :goto_18

    :cond_3a
    const/4 v15, 0x0

    .line 85
    :goto_18
    invoke-static {v3, v15}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 86
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v15

    move/from16 v39, v14

    const v14, 0x6d686143

    if-ne v15, v14, :cond_3e

    const/16 v14, 0x8

    add-int/lit8 v15, v8, 0x8

    .line 87
    invoke-virtual {v9, v15}, Ld0/p;->H(I)V

    const/4 v14, 0x1

    .line 88
    invoke-virtual {v9, v14}, Ld0/p;->I(I)V

    .line 89
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v15

    .line 90
    invoke-virtual {v9, v14}, Ld0/p;->I(I)V

    .line 91
    invoke-static {v11, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3b

    .line 92
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    const-string v15, "mhm1.%02X"

    invoke-static {v15, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_19

    .line 93
    :cond_3b
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    const-string v15, "mha1.%02X"

    invoke-static {v15, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 94
    :goto_19
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v15

    move-object/from16 v40, v6

    .line 95
    new-array v6, v15, [B

    move-object/from16 v37, v14

    const/4 v14, 0x0

    .line 96
    invoke-virtual {v9, v6, v14, v15}, Ld0/p;->g([BII)V

    if-nez v0, :cond_3c

    .line 97
    invoke-static {v6}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    goto :goto_1a

    .line 98
    :cond_3c
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v6, v0}, Lm2/I;->v(Ljava/lang/Object;Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    :cond_3d
    :goto_1a
    move-object/from16 v41, v0

    move-object/from16 v43, v1

    move/from16 v51, v2

    move/from16 v44, v7

    move v0, v8

    move-object/from16 v46, v11

    move v7, v12

    move-object v12, v13

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object v13, v9

    move-object v11, v10

    move-object v9, v3

    :goto_1b
    const/4 v3, 0x0

    goto/16 :goto_5a

    :cond_3e
    move-object/from16 v40, v6

    const v6, 0x6d686150

    if-ne v15, v6, :cond_40

    const/16 v6, 0x8

    add-int/lit8 v14, v8, 0x8

    .line 99
    invoke-virtual {v9, v14}, Ld0/p;->H(I)V

    .line 100
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v6

    if-lez v6, :cond_3d

    .line 101
    new-array v14, v6, [B

    const/4 v15, 0x0

    .line 102
    invoke-virtual {v9, v14, v15, v6}, Ld0/p;->g([BII)V

    if-nez v0, :cond_3f

    .line 103
    invoke-static {v14}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    goto :goto_1a

    .line 104
    :cond_3f
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0, v14}, Lm2/I;->v(Ljava/lang/Object;Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    goto :goto_1a

    :cond_40
    const v6, 0x65736473

    if-eq v15, v6, :cond_41

    if-eqz p5, :cond_42

    const v14, 0x77617665

    if-ne v15, v14, :cond_42

    :cond_41
    move-object/from16 v41, v0

    move-object/from16 v43, v1

    move v1, v2

    move-object/from16 v42, v3

    move v2, v5

    move v5, v7

    move/from16 v49, v8

    move-object/from16 v46, v11

    move/from16 v50, v12

    move-object v12, v13

    const/4 v0, 0x4

    const/16 v3, 0x9

    const/4 v7, 0x3

    const/4 v8, 0x5

    const/16 v14, 0xc

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object v13, v9

    move-object v11, v10

    const/16 v9, 0x42

    const/16 v10, 0xd

    goto/16 :goto_4f

    :cond_42
    const v6, 0x64616333

    if-ne v15, v6, :cond_44

    const/16 v6, 0x8

    add-int/lit8 v14, v8, 0x8

    .line 105
    invoke-virtual {v9, v14}, Ld0/p;->H(I)V

    .line 106
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    .line 107
    new-instance v15, LF0/M;

    invoke-direct {v15}, LF0/M;-><init>()V

    .line 108
    invoke-virtual {v15, v9}, LF0/M;->q(Ld0/p;)V

    const/4 v6, 0x2

    .line 109
    invoke-virtual {v15, v6}, LF0/M;->i(I)I

    move-result v41

    .line 110
    sget-object v6, LF0/b;->d:[I

    aget v6, v6, v41

    move-object/from16 v41, v0

    const/16 v0, 0x8

    .line 111
    invoke-virtual {v15, v0}, LF0/M;->u(I)V

    .line 112
    sget-object v0, LF0/b;->f:[I

    move-object/from16 v42, v3

    const/4 v3, 0x3

    invoke-virtual {v15, v3}, LF0/M;->i(I)I

    move-result v43

    aget v0, v0, v43

    const/4 v3, 0x1

    .line 113
    invoke-virtual {v15, v3}, LF0/M;->i(I)I

    move-result v31

    if-eqz v31, :cond_43

    add-int/2addr v0, v3

    :cond_43
    const/4 v3, 0x5

    .line 114
    invoke-virtual {v15, v3}, LF0/M;->i(I)I

    move-result v43

    .line 115
    sget-object v3, LF0/b;->g:[I

    aget v3, v3, v43

    mul-int/lit16 v3, v3, 0x3e8

    .line 116
    invoke-virtual {v15}, LF0/M;->c()V

    .line 117
    invoke-virtual {v15}, LF0/M;->f()I

    move-result v15

    invoke-virtual {v9, v15}, Ld0/p;->H(I)V

    .line 118
    new-instance v15, La0/o;

    invoke-direct {v15}, La0/o;-><init>()V

    .line 119
    iput-object v14, v15, La0/o;->a:Ljava/lang/String;

    .line 120
    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v15, La0/o;->m:Ljava/lang/String;

    .line 121
    iput v0, v15, La0/o;->B:I

    .line 122
    iput v6, v15, La0/o;->C:I

    .line 123
    iput-object v4, v15, La0/o;->q:La0/l;

    .line 124
    iput-object v10, v15, La0/o;->d:Ljava/lang/String;

    .line 125
    iput v3, v15, La0/o;->h:I

    .line 126
    iput v3, v15, La0/o;->i:I

    .line 127
    new-instance v0, La0/p;

    invoke-direct {v0, v15}, La0/p;-><init>(La0/o;)V

    .line 128
    iput-object v0, v13, LZ0/e;->d:Ljava/lang/Object;

    move-object/from16 v43, v1

    move v1, v2

    move v2, v5

    move v5, v7

    move/from16 v49, v8

    move-object/from16 v46, v11

    move/from16 v50, v12

    move-object v12, v13

    :goto_1c
    const/16 v3, 0x9

    const/4 v7, 0x3

    const/4 v8, 0x5

    const/16 v14, 0xc

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object v13, v9

    move-object v11, v10

    const/16 v9, 0x42

    const/16 v10, 0xd

    goto/16 :goto_4d

    :cond_44
    move-object/from16 v41, v0

    move-object/from16 v42, v3

    const v0, 0x64656333

    if-ne v15, v0, :cond_49

    const/16 v0, 0x8

    add-int/lit8 v3, v8, 0x8

    .line 129
    invoke-virtual {v9, v3}, Ld0/p;->H(I)V

    .line 130
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 131
    new-instance v3, LF0/M;

    invoke-direct {v3}, LF0/M;-><init>()V

    .line 132
    invoke-virtual {v3, v9}, LF0/M;->q(Ld0/p;)V

    const/16 v6, 0xd

    .line 133
    invoke-virtual {v3, v6}, LF0/M;->i(I)I

    move-result v14

    mul-int/lit16 v14, v14, 0x3e8

    const/4 v6, 0x3

    .line 134
    invoke-virtual {v3, v6}, LF0/M;->u(I)V

    const/4 v15, 0x2

    .line 135
    invoke-virtual {v3, v15}, LF0/M;->i(I)I

    move-result v43

    .line 136
    sget-object v15, LF0/b;->d:[I

    aget v15, v15, v43

    const/16 v6, 0xa

    .line 137
    invoke-virtual {v3, v6}, LF0/M;->u(I)V

    .line 138
    sget-object v6, LF0/b;->f:[I

    move-object/from16 v43, v1

    const/4 v1, 0x3

    invoke-virtual {v3, v1}, LF0/M;->i(I)I

    move-result v44

    aget v6, v6, v44

    const/4 v1, 0x1

    .line 139
    invoke-virtual {v3, v1}, LF0/M;->i(I)I

    move-result v31

    if-eqz v31, :cond_45

    add-int/2addr v6, v1

    :cond_45
    const/4 v1, 0x3

    .line 140
    invoke-virtual {v3, v1}, LF0/M;->u(I)V

    const/4 v1, 0x4

    .line 141
    invoke-virtual {v3, v1}, LF0/M;->i(I)I

    move-result v44

    const/4 v1, 0x1

    .line 142
    invoke-virtual {v3, v1}, LF0/M;->u(I)V

    if-lez v44, :cond_47

    move/from16 v44, v7

    const/4 v7, 0x6

    .line 143
    invoke-virtual {v3, v7}, LF0/M;->u(I)V

    .line 144
    invoke-virtual {v3, v1}, LF0/M;->i(I)I

    move-result v7

    if-eqz v7, :cond_46

    const/4 v7, 0x2

    add-int/2addr v6, v7

    .line 145
    :cond_46
    invoke-virtual {v3, v1}, LF0/M;->u(I)V

    goto :goto_1d

    :cond_47
    move/from16 v44, v7

    .line 146
    :goto_1d
    invoke-virtual {v3}, LF0/M;->b()I

    move-result v7

    const/4 v1, 0x7

    if-le v7, v1, :cond_48

    .line 147
    invoke-virtual {v3, v1}, LF0/M;->u(I)V

    const/4 v1, 0x1

    .line 148
    invoke-virtual {v3, v1}, LF0/M;->i(I)I

    move-result v7

    if-eqz v7, :cond_48

    .line 149
    const-string v1, "audio/eac3-joc"

    goto :goto_1e

    :cond_48
    move-object/from16 v1, v17

    .line 150
    :goto_1e
    invoke-virtual {v3}, LF0/M;->c()V

    .line 151
    invoke-virtual {v3}, LF0/M;->f()I

    move-result v3

    invoke-virtual {v9, v3}, Ld0/p;->H(I)V

    .line 152
    new-instance v3, La0/o;

    invoke-direct {v3}, La0/o;-><init>()V

    .line 153
    iput-object v0, v3, La0/o;->a:Ljava/lang/String;

    .line 154
    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, La0/o;->m:Ljava/lang/String;

    .line 155
    iput v6, v3, La0/o;->B:I

    .line 156
    iput v15, v3, La0/o;->C:I

    .line 157
    iput-object v4, v3, La0/o;->q:La0/l;

    .line 158
    iput-object v10, v3, La0/o;->d:Ljava/lang/String;

    .line 159
    iput v14, v3, La0/o;->i:I

    .line 160
    new-instance v0, La0/p;

    invoke-direct {v0, v3}, La0/p;-><init>(La0/o;)V

    .line 161
    iput-object v0, v13, LZ0/e;->d:Ljava/lang/Object;

    move v1, v2

    move v2, v5

    move/from16 v49, v8

    move-object/from16 v46, v11

    move/from16 v50, v12

    move-object v12, v13

    move/from16 v5, v44

    goto/16 :goto_1c

    :cond_49
    move-object/from16 v43, v1

    move/from16 v44, v7

    const v0, 0x64616334

    if-ne v15, v0, :cond_83

    const/16 v0, 0x8

    add-int/lit8 v1, v8, 0x8

    .line 162
    invoke-virtual {v9, v1}, Ld0/p;->H(I)V

    .line 163
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 164
    new-instance v1, LF0/M;

    invoke-direct {v1}, LF0/M;-><init>()V

    .line 165
    invoke-virtual {v1, v9}, LF0/M;->q(Ld0/p;)V

    .line 166
    invoke-virtual {v1}, LF0/M;->b()I

    move-result v3

    const/4 v6, 0x3

    .line 167
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v7

    const/4 v6, 0x1

    if-gt v7, v6, :cond_82

    const/4 v14, 0x7

    .line 168
    invoke-virtual {v1, v14}, LF0/M;->i(I)I

    move-result v15

    .line 169
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v14

    if-eqz v14, :cond_4a

    const v14, 0xbb80

    :goto_1f
    const/4 v6, 0x4

    goto :goto_20

    :cond_4a
    const v14, 0xac44

    goto :goto_1f

    .line 170
    :goto_20
    invoke-virtual {v1, v6}, LF0/M;->u(I)V

    move/from16 v45, v5

    const/16 v6, 0x9

    .line 171
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v5

    const/4 v6, 0x1

    if-le v15, v6, :cond_4d

    if-eqz v7, :cond_4c

    .line 172
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_4b

    const/16 v6, 0x10

    .line 173
    invoke-virtual {v1, v6}, LF0/M;->u(I)V

    .line 174
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_4b

    const/16 v6, 0x80

    .line 175
    invoke-virtual {v1, v6}, LF0/M;->u(I)V

    :cond_4b
    const/4 v6, 0x1

    goto :goto_21

    .line 176
    :cond_4c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_4d
    :goto_21
    if-ne v7, v6, :cond_4f

    .line 177
    invoke-virtual {v1}, LF0/M;->b()I

    move-result v6

    const/16 v15, 0x42

    if-lt v6, v15, :cond_4e

    .line 178
    invoke-virtual {v1, v15}, LF0/M;->u(I)V

    .line 179
    invoke-virtual {v1}, LF0/M;->c()V

    goto :goto_22

    .line 180
    :cond_4e
    const-string v0, "Invalid AC-4 DSI bitrate."

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    .line 181
    :cond_4f
    :goto_22
    new-instance v6, LF0/d;

    .line 182
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x1

    .line 183
    iput-boolean v15, v6, LF0/d;->d:Z

    const/4 v15, -0x1

    .line 184
    iput v15, v6, LF0/d;->a:I

    .line 185
    iput v15, v6, LF0/d;->b:I

    const/4 v15, 0x1

    .line 186
    iput-boolean v15, v6, LF0/d;->e:Z

    const/4 v15, 0x2

    .line 187
    iput v15, v6, LF0/d;->c:I

    const/4 v15, 0x0

    .line 188
    iput v15, v6, LF0/d;->f:I

    move-object/from16 v46, v11

    const/4 v15, 0x0

    :goto_23
    if-ge v15, v5, :cond_76

    if-nez v7, :cond_50

    .line 189
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v5

    const/4 v11, 0x5

    .line 190
    invoke-virtual {v1, v11}, LF0/M;->i(I)I

    move-result v48

    .line 191
    invoke-virtual {v1, v11}, LF0/M;->i(I)I

    move-result v49

    move/from16 v51, v2

    move/from16 v50, v12

    move/from16 v12, v49

    const/4 v9, 0x0

    const/4 v11, 0x0

    move/from16 v49, v8

    move/from16 v8, v48

    const/16 v48, 0x0

    goto :goto_27

    :cond_50
    move/from16 v30, v5

    const/16 v11, 0x8

    .line 192
    invoke-virtual {v1, v11}, LF0/M;->i(I)I

    move-result v5

    .line 193
    invoke-virtual {v1, v11}, LF0/M;->i(I)I

    move-result v9

    const/16 v11, 0xff

    if-ne v9, v11, :cond_51

    const/16 v11, 0x10

    .line 194
    invoke-virtual {v1, v11}, LF0/M;->i(I)I

    move-result v49

    add-int v49, v49, v9

    :goto_24
    const/4 v9, 0x2

    goto :goto_25

    :cond_51
    move/from16 v49, v9

    goto :goto_24

    :goto_25
    if-le v5, v9, :cond_52

    const/16 v9, 0x8

    mul-int/lit8 v5, v49, 0x8

    .line 195
    invoke-virtual {v1, v5}, LF0/M;->u(I)V

    const/4 v5, 0x1

    add-int/2addr v15, v5

    move-object/from16 v9, p0

    move/from16 v5, v30

    goto :goto_23

    :cond_52
    const/16 v9, 0x8

    .line 196
    invoke-virtual {v1}, LF0/M;->b()I

    move-result v11

    sub-int v11, v3, v11

    div-int/2addr v11, v9

    move/from16 v48, v5

    const/4 v9, 0x5

    .line 197
    invoke-virtual {v1, v9}, LF0/M;->i(I)I

    move-result v5

    const/16 v9, 0x1f

    if-ne v5, v9, :cond_53

    const/4 v9, 0x1

    goto :goto_26

    :cond_53
    const/4 v9, 0x0

    :goto_26
    move/from16 v51, v2

    move/from16 v50, v12

    move/from16 v12, v48

    move/from16 v48, v11

    move/from16 v11, v49

    move/from16 v49, v8

    move v8, v5

    const/4 v5, 0x0

    :goto_27
    if-nez v5, :cond_54

    if-nez v9, :cond_54

    const/4 v2, 0x6

    if-ne v8, v2, :cond_54

    move-object/from16 v52, v13

    const/4 v2, 0x1

    goto/16 :goto_3b

    :cond_54
    move-object/from16 v52, v13

    const/4 v2, 0x3

    .line 198
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v13

    iput v13, v6, LF0/d;->f:I

    .line 199
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    if-eqz v2, :cond_55

    const/4 v2, 0x5

    .line 200
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    :cond_55
    const/4 v2, 0x2

    .line 201
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    const/4 v13, 0x1

    if-ne v7, v13, :cond_56

    if-eq v12, v13, :cond_57

    if-ne v12, v2, :cond_56

    goto :goto_29

    :cond_56
    :goto_28
    const/4 v2, 0x5

    goto :goto_2a

    .line 202
    :cond_57
    :goto_29
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    goto :goto_28

    .line 203
    :goto_2a
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    const/16 v2, 0xa

    .line 204
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    if-ne v7, v13, :cond_61

    if-lez v12, :cond_58

    .line 205
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    iput-boolean v2, v6, LF0/d;->d:Z

    .line 206
    :cond_58
    iget-boolean v2, v6, LF0/d;->d:Z

    if-eqz v2, :cond_5d

    if-eq v12, v13, :cond_59

    const/4 v2, 0x2

    if-ne v12, v2, :cond_5a

    :cond_59
    const/4 v2, 0x5

    goto :goto_2c

    :cond_5a
    :goto_2b
    const/16 v13, 0x18

    goto :goto_2d

    .line 207
    :goto_2c
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v13

    if-ltz v13, :cond_5b

    const/16 v2, 0xf

    if-gt v13, v2, :cond_5b

    .line 208
    iput v13, v6, LF0/d;->a:I

    :cond_5b
    const/16 v2, 0xb

    if-lt v13, v2, :cond_5c

    const/16 v2, 0xe

    if-gt v13, v2, :cond_5c

    .line 209
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    iput-boolean v2, v6, LF0/d;->e:Z

    const/4 v2, 0x2

    .line 210
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v13

    iput v13, v6, LF0/d;->c:I

    goto :goto_2b

    :cond_5c
    const/4 v2, 0x2

    goto :goto_2b

    .line 211
    :goto_2d
    invoke-virtual {v1, v13}, LF0/M;->u(I)V

    :goto_2e
    const/4 v13, 0x1

    goto :goto_2f

    :cond_5d
    const/4 v2, 0x2

    goto :goto_2e

    :goto_2f
    if-eq v12, v13, :cond_5f

    if-ne v12, v2, :cond_5e

    goto :goto_30

    :cond_5e
    const/4 v2, 0x1

    goto :goto_32

    .line 212
    :cond_5f
    :goto_30
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v13

    if-eqz v13, :cond_60

    .line 213
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v13

    if-eqz v13, :cond_60

    .line 214
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    .line 215
    :cond_60
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    if-eqz v2, :cond_5e

    .line 216
    invoke-virtual {v1}, LF0/M;->t()V

    const/16 v2, 0x8

    .line 217
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v13

    const/4 v10, 0x0

    :goto_31
    if-ge v10, v13, :cond_5e

    .line 218
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    const/4 v2, 0x1

    add-int/2addr v10, v2

    const/16 v2, 0x8

    goto :goto_31

    :cond_61
    move v2, v13

    :goto_32
    if-nez v5, :cond_69

    if-eqz v9, :cond_62

    goto/16 :goto_39

    .line 219
    :cond_62
    invoke-virtual {v1}, LF0/M;->t()V

    if-eqz v8, :cond_67

    if-eq v8, v2, :cond_67

    const/4 v5, 0x2

    if-eq v8, v5, :cond_67

    const/4 v5, 0x3

    if-eq v8, v5, :cond_65

    const/4 v5, 0x4

    if-eq v8, v5, :cond_65

    const/4 v5, 0x5

    if-eq v8, v5, :cond_63

    const/4 v5, 0x7

    .line 220
    invoke-virtual {v1, v5}, LF0/M;->i(I)I

    move-result v8

    const/4 v5, 0x0

    :goto_33
    if-ge v5, v8, :cond_6b

    const/16 v9, 0x8

    .line 221
    invoke-virtual {v1, v9}, LF0/M;->u(I)V

    add-int/2addr v5, v2

    goto :goto_33

    :cond_63
    if-nez v12, :cond_64

    .line 222
    invoke-static {v1, v6}, LF0/b;->r(LF0/M;LF0/d;)V

    goto :goto_3a

    :cond_64
    const/4 v5, 0x3

    .line 223
    invoke-virtual {v1, v5}, LF0/M;->i(I)I

    move-result v8

    const/4 v5, 0x0

    :goto_34
    const/4 v9, 0x2

    add-int/lit8 v10, v8, 0x2

    if-ge v5, v10, :cond_6b

    .line 224
    invoke-static {v1, v6}, LF0/b;->s(LF0/M;LF0/d;)V

    add-int/2addr v5, v2

    goto :goto_34

    :cond_65
    if-nez v12, :cond_66

    const/4 v5, 0x0

    const/4 v8, 0x3

    :goto_35
    if-ge v5, v8, :cond_6b

    .line 225
    invoke-static {v1, v6}, LF0/b;->r(LF0/M;LF0/d;)V

    add-int/2addr v5, v2

    goto :goto_35

    :cond_66
    const/4 v8, 0x3

    const/4 v5, 0x0

    :goto_36
    if-ge v5, v8, :cond_6b

    .line 226
    invoke-static {v1, v6}, LF0/b;->s(LF0/M;LF0/d;)V

    add-int/2addr v5, v2

    const/4 v8, 0x3

    goto :goto_36

    :cond_67
    if-nez v12, :cond_68

    const/4 v5, 0x0

    const/4 v8, 0x2

    :goto_37
    if-ge v5, v8, :cond_6b

    .line 227
    invoke-static {v1, v6}, LF0/b;->r(LF0/M;LF0/d;)V

    add-int/2addr v5, v2

    goto :goto_37

    :cond_68
    const/4 v8, 0x2

    const/4 v5, 0x0

    :goto_38
    if-ge v5, v8, :cond_6b

    .line 228
    invoke-static {v1, v6}, LF0/b;->s(LF0/M;LF0/d;)V

    add-int/2addr v5, v2

    const/4 v8, 0x2

    goto :goto_38

    :cond_69
    :goto_39
    if-nez v12, :cond_6a

    .line 229
    invoke-static {v1, v6}, LF0/b;->r(LF0/M;LF0/d;)V

    goto :goto_3a

    .line 230
    :cond_6a
    invoke-static {v1, v6}, LF0/b;->s(LF0/M;LF0/d;)V

    .line 231
    :cond_6b
    :goto_3a
    invoke-virtual {v1}, LF0/M;->t()V

    .line 232
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    :goto_3b
    if-eqz v2, :cond_6c

    const/4 v2, 0x7

    .line 233
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v5

    const/4 v2, 0x0

    :goto_3c
    if-ge v2, v5, :cond_6c

    const/16 v8, 0xf

    .line 234
    invoke-virtual {v1, v8}, LF0/M;->u(I)V

    const/4 v9, 0x1

    add-int/2addr v2, v9

    goto :goto_3c

    :cond_6c
    if-lez v12, :cond_72

    .line 235
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    if-eqz v2, :cond_6f

    .line 236
    invoke-virtual {v1}, LF0/M;->b()I

    move-result v2

    const/16 v9, 0x42

    if-ge v2, v9, :cond_6d

    const/4 v2, 0x0

    goto :goto_3d

    .line 237
    :cond_6d
    invoke-virtual {v1, v9}, LF0/M;->u(I)V

    const/4 v2, 0x1

    :goto_3d
    if-eqz v2, :cond_6e

    goto :goto_3e

    .line 238
    :cond_6e
    const-string v0, "Can\'t parse bitrate DSI."

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_6f
    const/16 v9, 0x42

    .line 239
    :goto_3e
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    if-eqz v2, :cond_71

    .line 240
    invoke-virtual {v1}, LF0/M;->c()V

    const/16 v2, 0x10

    .line 241
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v5

    .line 242
    invoke-virtual {v1, v5}, LF0/M;->v(I)V

    const/4 v8, 0x5

    .line 243
    invoke-virtual {v1, v8}, LF0/M;->i(I)I

    move-result v5

    const/4 v10, 0x0

    :goto_3f
    if-ge v10, v5, :cond_70

    const/4 v12, 0x3

    .line 244
    invoke-virtual {v1, v12}, LF0/M;->u(I)V

    const/16 v12, 0x8

    .line 245
    invoke-virtual {v1, v12}, LF0/M;->u(I)V

    const/4 v13, 0x1

    add-int/2addr v10, v13

    goto :goto_3f

    :cond_70
    :goto_40
    const/16 v12, 0x8

    const/4 v13, 0x1

    goto :goto_41

    :cond_71
    const/16 v2, 0x10

    const/4 v8, 0x5

    goto :goto_40

    :cond_72
    const/16 v2, 0x10

    const/4 v8, 0x5

    const/16 v9, 0x42

    goto :goto_40

    .line 246
    :goto_41
    invoke-virtual {v1}, LF0/M;->c()V

    if-ne v7, v13, :cond_74

    .line 247
    invoke-virtual {v1}, LF0/M;->b()I

    move-result v5

    sub-int/2addr v3, v5

    div-int/2addr v3, v12

    sub-int v3, v3, v48

    if-lt v11, v3, :cond_73

    sub-int/2addr v11, v3

    .line 248
    invoke-virtual {v1, v11}, LF0/M;->v(I)V

    goto :goto_42

    .line 249
    :cond_73
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    .line 250
    :cond_74
    :goto_42
    iget-boolean v1, v6, LF0/d;->d:Z

    if-eqz v1, :cond_77

    iget v1, v6, LF0/d;->a:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_75

    goto :goto_43

    .line 251
    :cond_75
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_76
    move/from16 v51, v2

    move/from16 v49, v8

    move/from16 v50, v12

    move-object/from16 v52, v13

    const/16 v2, 0x10

    const/4 v8, 0x5

    const/16 v9, 0x42

    .line 252
    :cond_77
    :goto_43
    iget-boolean v1, v6, LF0/d;->d:Z

    if-eqz v1, :cond_7e

    .line 253
    iget v1, v6, LF0/d;->a:I

    iget-boolean v3, v6, LF0/d;->e:Z

    iget v5, v6, LF0/d;->c:I

    packed-switch v1, :pswitch_data_0

    const/16 v6, 0xb

    const/16 v47, -0x1

    goto :goto_44

    :pswitch_0
    const/16 v6, 0xb

    const/16 v47, 0x18

    goto :goto_44

    :pswitch_1
    const/16 v6, 0xb

    const/16 v47, 0xe

    goto :goto_44

    :pswitch_2
    const/16 v6, 0xb

    const/16 v47, 0xd

    goto :goto_44

    :pswitch_3
    const/16 v6, 0xb

    const/16 v47, 0xc

    goto :goto_44

    :pswitch_4
    const/16 v6, 0xb

    const/16 v47, 0xb

    goto :goto_44

    :pswitch_5
    const/16 v6, 0xb

    const/16 v47, 0x8

    goto :goto_44

    :pswitch_6
    const/16 v6, 0xb

    const/16 v47, 0x7

    goto :goto_44

    :pswitch_7
    const/16 v6, 0xb

    const/16 v47, 0x6

    goto :goto_44

    :pswitch_8
    move/from16 v47, v8

    const/16 v6, 0xb

    goto :goto_44

    :pswitch_9
    const/16 v6, 0xb

    const/16 v47, 0x3

    goto :goto_44

    :pswitch_a
    const/16 v6, 0xb

    const/16 v47, 0x2

    goto :goto_44

    :pswitch_b
    const/16 v6, 0xb

    const/16 v47, 0x1

    :goto_44
    if-eq v1, v6, :cond_79

    const/16 v6, 0xc

    if-eq v1, v6, :cond_79

    const/16 v10, 0xd

    if-eq v1, v10, :cond_7a

    const/16 v6, 0xe

    if-ne v1, v6, :cond_78

    goto :goto_45

    :cond_78
    const/4 v1, 0x1

    goto :goto_46

    :cond_79
    const/16 v10, 0xd

    :cond_7a
    :goto_45
    if-nez v3, :cond_7b

    add-int/lit8 v47, v47, -0x2

    :cond_7b
    if-eqz v5, :cond_7d

    const/4 v1, 0x1

    if-eq v5, v1, :cond_7c

    goto :goto_46

    :cond_7c
    add-int/lit8 v47, v47, -0x2

    goto :goto_46

    :cond_7d
    const/4 v1, 0x1

    add-int/lit8 v47, v47, -0x4

    :goto_46
    move/from16 v3, v47

    goto :goto_47

    :cond_7e
    const/4 v1, 0x1

    const/16 v10, 0xd

    .line 254
    iget v3, v6, LF0/d;->b:I

    add-int/2addr v3, v1

    .line 255
    iget v1, v6, LF0/d;->f:I

    const/4 v5, 0x4

    if-ne v1, v5, :cond_80

    const/16 v1, 0x11

    if-ne v3, v1, :cond_7f

    move/from16 v47, v53

    goto :goto_46

    :cond_7f
    move/from16 v47, v3

    goto :goto_46

    :cond_80
    :goto_47
    if-lez v3, :cond_81

    .line 256
    new-instance v1, La0/o;

    invoke-direct {v1}, La0/o;-><init>()V

    .line 257
    iput-object v0, v1, La0/o;->a:Ljava/lang/String;

    .line 258
    invoke-static/range {v16 .. v16}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, La0/o;->m:Ljava/lang/String;

    .line 259
    iput v3, v1, La0/o;->B:I

    .line 260
    iput v14, v1, La0/o;->C:I

    .line 261
    iput-object v4, v1, La0/o;->q:La0/l;

    move-object/from16 v11, p3

    .line 262
    iput-object v11, v1, La0/o;->d:Ljava/lang/String;

    .line 263
    new-instance v0, La0/p;

    invoke-direct {v0, v1}, La0/p;-><init>(La0/o;)V

    move-object/from16 v12, v52

    .line 264
    iput-object v0, v12, LZ0/e;->d:Ljava/lang/Object;

    move/from16 v5, v44

    move/from16 v2, v45

    move/from16 v1, v51

    const/16 v3, 0x9

    const/4 v7, 0x3

    const/16 v14, 0xc

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object/from16 v13, p0

    goto/16 :goto_4d

    .line 265
    :cond_81
    const-string v0, "Can\'t determine channel count of presentation."

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    .line 266
    :cond_82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La0/H;->c(Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_83
    move/from16 v51, v2

    move/from16 v45, v5

    move/from16 v49, v8

    move-object/from16 v46, v11

    move/from16 v50, v12

    move-object v12, v13

    const/16 v2, 0x10

    const/4 v8, 0x5

    const/16 v9, 0x42

    move-object v11, v10

    const/16 v10, 0xd

    const v0, 0x646d6c70

    if-ne v15, v0, :cond_85

    if-lez v51, :cond_84

    move-object/from16 v9, v42

    move/from16 v0, v49

    move/from16 v7, v50

    move/from16 v44, v51

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object/from16 v13, p0

    goto/16 :goto_5a

    .line 267
    :cond_84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_85
    move/from16 v1, v51

    const v0, 0x64647473

    if-eq v15, v0, :cond_86

    const v0, 0x75647473

    if-ne v15, v0, :cond_87

    :cond_86
    const/16 v3, 0x9

    const/4 v7, 0x3

    const/16 v14, 0xc

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object/from16 v13, p0

    goto/16 :goto_4c

    :cond_87
    const v0, 0x644f7073

    if-ne v15, v0, :cond_88

    const/16 v5, 0x8

    add-int/lit8 v0, v50, -0x8

    .line 268
    sget-object v3, LZ0/h;->a:[B

    array-length v6, v3

    add-int/2addr v6, v0

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    add-int/lit8 v7, v49, 0x8

    move-object/from16 v13, p0

    .line 269
    invoke-virtual {v13, v7}, Ld0/p;->H(I)V

    .line 270
    array-length v3, v3

    invoke-virtual {v13, v6, v3, v0}, Ld0/p;->g([BII)V

    .line 271
    invoke-static {v6}, LF0/b;->c([B)Ljava/util/ArrayList;

    move-result-object v0

    move-object/from16 v41, v0

    move/from16 v51, v1

    move-object/from16 v9, v42

    move/from16 v5, v45

    move/from16 v0, v49

    move/from16 v7, v50

    const/4 v3, 0x0

    const/16 v22, 0x2

    :goto_48
    const/16 v25, 0x7

    goto/16 :goto_5a

    :cond_88
    const/16 v5, 0x8

    move-object/from16 v13, p0

    const v0, 0x64664c61

    if-ne v15, v0, :cond_89

    const/16 v14, 0xc

    add-int/lit8 v0, v50, -0xc

    add-int/lit8 v3, v50, -0x8

    .line 272
    new-array v3, v3, [B

    const/16 v6, 0x66

    const/4 v7, 0x0

    .line 273
    aput-byte v6, v3, v7

    const/16 v6, 0x4c

    const/4 v7, 0x1

    .line 274
    aput-byte v6, v3, v7

    const/16 v6, 0x61

    const/16 v22, 0x2

    .line 275
    aput-byte v6, v3, v22

    const/16 v6, 0x43

    const/4 v7, 0x3

    .line 276
    aput-byte v6, v3, v7

    add-int/lit8 v6, v49, 0xc

    .line 277
    invoke-virtual {v13, v6}, Ld0/p;->H(I)V

    const/4 v6, 0x4

    .line 278
    invoke-virtual {v13, v3, v6, v0}, Ld0/p;->g([BII)V

    .line 279
    invoke-static {v3}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    move-object/from16 v41, v0

    move/from16 v51, v1

    move-object/from16 v9, v42

    move/from16 v5, v45

    :goto_49
    move/from16 v0, v49

    move/from16 v7, v50

    const/4 v3, 0x0

    goto :goto_48

    :cond_89
    const v0, 0x616c6163

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/16 v14, 0xc

    const/16 v22, 0x2

    if-ne v15, v0, :cond_8a

    add-int/lit8 v3, v50, -0xc

    .line 280
    new-array v15, v3, [B

    add-int/lit8 v0, v49, 0xc

    .line 281
    invoke-virtual {v13, v0}, Ld0/p;->H(I)V

    const/4 v0, 0x0

    .line 282
    invoke-virtual {v13, v15, v0, v3}, Ld0/p;->g([BII)V

    .line 283
    sget-object v0, Ld0/b;->a:[B

    .line 284
    new-instance v0, Ld0/p;

    invoke-direct {v0, v15}, Ld0/p;-><init>([B)V

    const/16 v3, 0x9

    .line 285
    invoke-virtual {v0, v3}, Ld0/p;->H(I)V

    .line 286
    invoke-virtual {v0}, Ld0/p;->v()I

    move-result v3

    const/16 v2, 0x14

    .line 287
    invoke-virtual {v0, v2}, Ld0/p;->H(I)V

    .line 288
    invoke-virtual {v0}, Ld0/p;->z()I

    move-result v0

    .line 289
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 290
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 291
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 292
    invoke-static {v15}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    move-object/from16 v41, v0

    move/from16 v51, v1

    move/from16 v44, v2

    move v5, v3

    move-object/from16 v9, v42

    goto :goto_49

    :cond_8a
    const v0, 0x69616362

    const/16 v3, 0x9

    if-ne v15, v0, :cond_8e

    add-int/lit8 v0, v49, 0x9

    .line 293
    invoke-virtual {v13, v0}, Ld0/p;->H(I)V

    move-wide/from16 v23, v18

    const/4 v0, 0x0

    :goto_4a
    if-ge v0, v3, :cond_8d

    .line 294
    iget v2, v13, Ld0/p;->b:I

    iget v15, v13, Ld0/p;->c:I

    if-eq v2, v15, :cond_8c

    .line 295
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v2

    int-to-long v5, v2

    const-wide/16 v27, 0x7f

    and-long v27, v5, v27

    const/16 v25, 0x7

    mul-int/lit8 v2, v0, 0x7

    shl-long v27, v27, v2

    or-long v23, v23, v27

    const-wide/16 v27, 0x80

    and-long v5, v5, v27

    cmp-long v2, v5, v18

    if-nez v2, :cond_8b

    goto :goto_4b

    :cond_8b
    const/4 v2, 0x1

    add-int/2addr v0, v2

    const/16 v5, 0x8

    const/4 v6, 0x4

    goto :goto_4a

    .line 296
    :cond_8c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to read a byte over the limit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8d
    const/16 v25, 0x7

    .line 297
    :goto_4b
    invoke-static/range {v23 .. v24}, LQ1/C;->g(J)I

    move-result v0

    .line 298
    new-array v2, v0, [B

    const/4 v5, 0x0

    .line 299
    invoke-virtual {v13, v2, v5, v0}, Ld0/p;->g([BII)V

    .line 300
    invoke-static {v2}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v0

    move-object/from16 v41, v0

    move/from16 v51, v1

    move-object/from16 v9, v42

    move/from16 v5, v45

    move/from16 v0, v49

    move/from16 v7, v50

    goto/16 :goto_1b

    :cond_8e
    const/16 v25, 0x7

    move/from16 v5, v44

    move/from16 v2, v45

    goto :goto_4d

    .line 301
    :goto_4c
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 302
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, La0/o;->a:Ljava/lang/String;

    .line 303
    invoke-static/range {v46 .. v46}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, La0/o;->m:Ljava/lang/String;

    move/from16 v2, v45

    .line 304
    iput v2, v0, La0/o;->B:I

    move/from16 v5, v44

    .line 305
    iput v5, v0, La0/o;->C:I

    .line 306
    iput-object v4, v0, La0/o;->q:La0/l;

    .line 307
    iput-object v11, v0, La0/o;->d:Ljava/lang/String;

    .line 308
    new-instance v6, La0/p;

    invoke-direct {v6, v0}, La0/p;-><init>(La0/o;)V

    .line 309
    iput-object v6, v12, LZ0/e;->d:Ljava/lang/Object;

    :goto_4d
    move/from16 v51, v1

    move/from16 v44, v5

    move-object/from16 v9, v42

    move/from16 v0, v49

    move/from16 v7, v50

    const/4 v3, 0x0

    :goto_4e
    move v5, v2

    goto/16 :goto_5a

    :goto_4f
    if-ne v15, v6, :cond_8f

    move-object/from16 v9, v42

    move/from16 v0, v49

    move v15, v0

    move/from16 v7, v50

    :goto_50
    const/4 v3, -0x1

    goto :goto_55

    .line 310
    :cond_8f
    iget v15, v13, Ld0/p;->b:I

    move/from16 v0, v49

    if-lt v15, v0, :cond_90

    const/4 v3, 0x1

    :goto_51
    const/4 v8, 0x0

    goto :goto_52

    :cond_90
    const/4 v3, 0x0

    goto :goto_51

    .line 311
    :goto_52
    invoke-static {v8, v3}, LF0/b;->e(Ljava/lang/String;Z)V

    :goto_53
    sub-int v3, v15, v0

    move/from16 v7, v50

    if-ge v3, v7, :cond_93

    .line 312
    invoke-virtual {v13, v15}, Ld0/p;->H(I)V

    .line 313
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v3

    move-object/from16 v9, v42

    if-lez v3, :cond_91

    const/4 v8, 0x1

    goto :goto_54

    :cond_91
    const/4 v8, 0x0

    .line 314
    :goto_54
    invoke-static {v9, v8}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 315
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v8

    if-ne v8, v6, :cond_92

    goto :goto_50

    :cond_92
    add-int/2addr v15, v3

    move/from16 v50, v7

    move-object/from16 v42, v9

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/16 v9, 0x42

    goto :goto_53

    :cond_93
    move-object/from16 v9, v42

    const/4 v15, -0x1

    goto :goto_50

    :goto_55
    if-eq v15, v3, :cond_9a

    .line 316
    invoke-static {v15, v13}, LZ0/h;->a(ILd0/p;)LZ0/b;

    move-result-object v6

    .line 317
    iget-object v8, v6, LZ0/b;->n:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v15, v6, LZ0/b;->o:Ljava/lang/Object;

    check-cast v15, [B

    if-eqz v15, :cond_99

    .line 318
    const-string v3, "audio/vorbis"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_97

    .line 319
    new-instance v3, Ld0/p;

    invoke-direct {v3, v15}, Ld0/p;-><init>([B)V

    const/4 v10, 0x1

    .line 320
    invoke-virtual {v3, v10}, Ld0/p;->I(I)V

    const/4 v14, 0x0

    .line 321
    :goto_56
    invoke-virtual {v3}, Ld0/p;->a()I

    move-result v31

    if-lez v31, :cond_94

    invoke-virtual {v3}, Ld0/p;->f()I

    move-result v10

    move-object/from16 v42, v6

    const/16 v6, 0xff

    if-ne v10, v6, :cond_95

    add-int/2addr v14, v6

    const/4 v10, 0x1

    .line 322
    invoke-virtual {v3, v10}, Ld0/p;->I(I)V

    move-object/from16 v6, v42

    goto :goto_56

    :cond_94
    move-object/from16 v42, v6

    const/16 v6, 0xff

    .line 323
    :cond_95
    invoke-virtual {v3}, Ld0/p;->v()I

    move-result v10

    add-int/2addr v10, v14

    const/4 v14, 0x0

    .line 324
    :goto_57
    invoke-virtual {v3}, Ld0/p;->a()I

    move-result v21

    move/from16 v51, v1

    if-lez v21, :cond_96

    invoke-virtual {v3}, Ld0/p;->f()I

    move-result v1

    if-ne v1, v6, :cond_96

    add-int/2addr v14, v6

    const/4 v1, 0x1

    .line 325
    invoke-virtual {v3, v1}, Ld0/p;->I(I)V

    move/from16 v1, v51

    goto :goto_57

    :cond_96
    const/4 v1, 0x1

    .line 326
    invoke-virtual {v3}, Ld0/p;->v()I

    move-result v21

    add-int v21, v21, v14

    .line 327
    new-array v14, v10, [B

    .line 328
    iget v3, v3, Ld0/p;->b:I

    const/4 v1, 0x0

    .line 329
    invoke-static {v15, v3, v14, v1, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v10

    add-int v3, v3, v21

    .line 330
    array-length v10, v15

    sub-int/2addr v10, v3

    .line 331
    new-array v6, v10, [B

    .line 332
    invoke-static {v15, v3, v6, v1, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 333
    invoke-static {v14, v6}, Lm2/I;->v(Ljava/lang/Object;Ljava/lang/Object;)Lm2/b0;

    move-result-object v1

    move-object/from16 v41, v1

    move-object/from16 v59, v42

    const/4 v3, 0x0

    goto :goto_59

    :cond_97
    move/from16 v51, v1

    move-object/from16 v42, v6

    .line 334
    const-string v1, "audio/mp4a-latm"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_98

    .line 335
    new-instance v1, LF0/M;

    .line 336
    array-length v2, v15

    invoke-direct {v1, v2, v15}, LF0/M;-><init>(I[B)V

    const/4 v3, 0x0

    .line 337
    invoke-static {v1, v3}, LF0/b;->q(LF0/M;Z)LF0/a;

    move-result-object v1

    .line 338
    iget v2, v1, LF0/a;->b:I

    iget v5, v1, LF0/a;->c:I

    iget-object v1, v1, LF0/a;->a:Ljava/lang/String;

    goto :goto_58

    :cond_98
    const/4 v3, 0x0

    move-object/from16 v1, v37

    move/from16 v60, v5

    move v5, v2

    move/from16 v2, v60

    .line 339
    :goto_58
    invoke-static {v15}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v6

    move-object/from16 v37, v1

    move-object/from16 v41, v6

    move-object/from16 v59, v42

    move/from16 v60, v5

    move v5, v2

    move/from16 v2, v60

    goto :goto_59

    :cond_99
    move/from16 v51, v1

    move-object/from16 v42, v6

    const/4 v3, 0x0

    move-object/from16 v59, v42

    goto :goto_59

    :cond_9a
    move/from16 v51, v1

    const/4 v3, 0x0

    move-object/from16 v8, v46

    :goto_59
    move/from16 v44, v5

    move-object/from16 v46, v8

    goto/16 :goto_4e

    :goto_5a
    add-int v8, v0, v7

    move-object v3, v9

    move-object v10, v11

    move-object v9, v13

    move/from16 v15, v38

    move/from16 v14, v39

    move-object/from16 v6, v40

    move-object/from16 v0, v41

    move-object/from16 v1, v43

    move/from16 v7, v44

    move-object/from16 v11, v46

    move/from16 v2, v51

    move-object v13, v12

    goto/16 :goto_17

    :cond_9b
    move-object/from16 v41, v0

    move v2, v5

    move-object/from16 v40, v6

    move v5, v7

    move-object/from16 v46, v11

    move-object v12, v13

    move/from16 v39, v14

    move/from16 v38, v15

    const/4 v3, 0x0

    const/16 v22, 0x2

    const/16 v25, 0x7

    move-object v13, v9

    move-object v11, v10

    .line 340
    iget-object v0, v12, LZ0/e;->d:Ljava/lang/Object;

    check-cast v0, La0/p;

    if-nez v0, :cond_9d

    if-eqz v46, :cond_9d

    .line 341
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 342
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->a:Ljava/lang/String;

    .line 343
    invoke-static/range {v46 .. v46}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->m:Ljava/lang/String;

    move-object/from16 v1, v37

    .line 344
    iput-object v1, v0, La0/o;->j:Ljava/lang/String;

    .line 345
    iput v2, v0, La0/o;->B:I

    .line 346
    iput v5, v0, La0/o;->C:I

    move/from16 v1, v36

    .line 347
    iput v1, v0, La0/o;->D:I

    move-object/from16 v1, v41

    .line 348
    iput-object v1, v0, La0/o;->p:Ljava/util/List;

    .line 349
    iput-object v4, v0, La0/o;->q:La0/l;

    .line 350
    iput-object v11, v0, La0/o;->d:Ljava/lang/String;

    move-object/from16 v1, v59

    if-eqz v1, :cond_9c

    .line 351
    iget-wide v4, v1, LZ0/b;->l:J

    invoke-static {v4, v5}, LQ1/C;->o0(J)I

    move-result v2

    .line 352
    iput v2, v0, La0/o;->h:I

    .line 353
    iget-wide v1, v1, LZ0/b;->m:J

    invoke-static {v1, v2}, LQ1/C;->o0(J)I

    move-result v1

    .line 354
    iput v1, v0, La0/o;->i:I

    .line 355
    :cond_9c
    new-instance v1, La0/p;

    invoke-direct {v1, v0}, La0/p;-><init>(La0/o;)V

    .line 356
    iput-object v1, v12, LZ0/e;->d:Ljava/lang/Object;

    :cond_9d
    :goto_5b
    move/from16 v10, v22

    move/from16 v32, v25

    move/from16 v25, v34

    move-object/from16 v31, v40

    const/16 v9, 0x10

    const/4 v14, 0x1

    const/16 v15, 0xff

    const/16 v20, 0x8

    const/16 v21, 0xa

    const/16 v24, 0x9

    const v26, 0x6d657474

    const/16 v28, 0x5

    const/16 v30, 0x0

    move/from16 v22, v3

    goto :goto_5d

    :goto_5c
    move-object/from16 v0, p0

    move/from16 v10, v22

    const/4 v2, 0x1

    move v1, v7

    move v14, v2

    const/16 v15, 0xff

    const/16 v21, 0xa

    move/from16 v2, v39

    move/from16 v22, v3

    const/16 v24, 0x9

    move/from16 v3, v38

    const v26, 0x6d657474

    move/from16 v4, p1

    const/16 v20, 0x8

    const/16 v30, 0x0

    move/from16 v5, p2

    move-object/from16 v31, v40

    move-object/from16 v6, p4

    const/16 v28, 0x5

    move-object v7, v12

    move/from16 v32, v25

    move/from16 v25, v34

    move/from16 v8, v25

    .line 357
    invoke-static/range {v0 .. v8}, LZ0/h;->h(Ld0/p;IIIIILa0/l;LZ0/e;I)V

    :goto_5d
    add-int v0, v39, v38

    .line 358
    invoke-virtual {v13, v0}, Ld0/p;->H(I)V

    add-int/lit8 v8, v25, 0x1

    move-object v10, v11

    move-object v9, v13

    move/from16 v3, v22

    move-object/from16 v6, v31

    move-object/from16 v11, p4

    move-object v13, v12

    move/from16 v12, v35

    goto/16 :goto_0

    :cond_9e
    move-object v12, v13

    return-object v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Le0/b;LF0/y;JLa0/l;ZZLl2/d;)Ljava/util/ArrayList;
    .locals 75

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, -0x1

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    .line 2
    :goto_0
    iget-object v8, v0, Le0/b;->p:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v7, v9, :cond_5e

    .line 3
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le0/b;

    .line 4
    iget v9, v8, Le0/d;->m:I

    const v10, 0x7472616b

    if-eq v9, v10, :cond_0

    move-object v0, v5

    move/from16 v40, v7

    :goto_1
    const/4 v1, 0x1

    goto/16 :goto_4f

    :cond_0
    const v9, 0x6d766864

    .line 5
    invoke-virtual {v0, v9}, Le0/b;->i(I)Le0/c;

    move-result-object v9

    .line 6
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x6d646961

    .line 7
    invoke-virtual {v8, v10}, Le0/b;->f(I)Le0/b;

    move-result-object v11

    .line 8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v12, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v11, v12}, Le0/b;->i(I)Le0/c;

    move-result-object v12

    .line 10
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v12, v12, Le0/c;->n:Ld0/p;

    const/16 v13, 0x10

    invoke-virtual {v12, v13}, Ld0/p;->H(I)V

    .line 12
    invoke-virtual {v12}, Ld0/p;->i()I

    move-result v12

    const v14, 0x736f756e

    if-ne v12, v14, :cond_1

    const/4 v12, 0x1

    goto :goto_3

    :cond_1
    const v14, 0x76696465

    if-ne v12, v14, :cond_2

    const/4 v12, 0x2

    goto :goto_3

    :cond_2
    const v14, 0x74657874

    if-eq v12, v14, :cond_5

    const v14, 0x7362746c

    if-eq v12, v14, :cond_5

    const v14, 0x73756274

    if-eq v12, v14, :cond_5

    const v14, 0x636c6370

    if-ne v12, v14, :cond_3

    goto :goto_2

    :cond_3
    const v14, 0x6d657461

    if-ne v12, v14, :cond_4

    const/4 v12, 0x5

    goto :goto_3

    :cond_4
    move v12, v3

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v12, 0x3

    .line 13
    :goto_3
    const-string v14, ""

    const-wide/16 v34, 0x0

    const/4 v15, 0x4

    if-ne v12, v3, :cond_6

    move-object/from16 v0, p7

    move-object/from16 v41, v5

    move/from16 v40, v7

    move-object/from16 v42, v8

    const/4 v5, 0x0

    goto/16 :goto_1b

    :cond_6
    const v2, 0x746b6864

    .line 14
    invoke-virtual {v8, v2}, Le0/b;->i(I)Le0/c;

    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object v2, v2, Le0/c;->n:Ld0/p;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Ld0/p;->H(I)V

    .line 17
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v16

    .line 18
    invoke-static/range {v16 .. v16}, LZ0/h;->c(I)I

    move-result v16

    if-nez v16, :cond_7

    goto :goto_4

    :cond_7
    move v6, v13

    .line 19
    :goto_4
    invoke-virtual {v2, v6}, Ld0/p;->I(I)V

    .line 20
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v6

    .line 21
    invoke-virtual {v2, v15}, Ld0/p;->I(I)V

    .line 22
    iget v10, v2, Ld0/p;->b:I

    if-nez v16, :cond_8

    goto :goto_5

    :cond_8
    const/16 v15, 0x8

    :goto_5
    const/4 v13, 0x0

    :goto_6
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v13, v15, :cond_c

    .line 23
    iget-object v4, v2, Ld0/p;->a:[B

    add-int v21, v10, v13

    .line 24
    aget-byte v4, v4, v21

    if-eq v4, v3, :cond_b

    if-nez v16, :cond_9

    .line 25
    invoke-virtual {v2}, Ld0/p;->x()J

    move-result-wide v15

    goto :goto_7

    :cond_9
    invoke-virtual {v2}, Ld0/p;->A()J

    move-result-wide v15

    :goto_7
    cmp-long v4, v15, v34

    if-nez v4, :cond_a

    :goto_8
    move-wide/from16 v15, v19

    :cond_a
    const/16 v4, 0x10

    goto :goto_9

    :cond_b
    const/4 v4, 0x1

    add-int/2addr v13, v4

    goto :goto_6

    .line 26
    :cond_c
    invoke-virtual {v2, v15}, Ld0/p;->I(I)V

    goto :goto_8

    .line 27
    :goto_9
    invoke-virtual {v2, v4}, Ld0/p;->I(I)V

    .line 28
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v10

    .line 29
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v13

    const/4 v4, 0x4

    .line 30
    invoke-virtual {v2, v4}, Ld0/p;->I(I)V

    .line 31
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v4

    .line 32
    invoke-virtual {v2}, Ld0/p;->i()I

    move-result v2

    const/high16 v3, 0x10000

    if-nez v10, :cond_d

    if-ne v13, v3, :cond_d

    const/high16 v3, -0x10000

    if-ne v4, v3, :cond_e

    if-nez v2, :cond_e

    const/16 v2, 0x5a

    goto :goto_a

    :cond_d
    const/high16 v3, -0x10000

    :cond_e
    if-nez v10, :cond_10

    if-ne v13, v3, :cond_10

    const/high16 v3, 0x10000

    if-ne v4, v3, :cond_f

    if-nez v2, :cond_f

    const/16 v2, 0x10e

    goto :goto_a

    :cond_f
    const/high16 v3, -0x10000

    :cond_10
    if-ne v10, v3, :cond_11

    if-nez v13, :cond_11

    if-nez v4, :cond_11

    if-ne v2, v3, :cond_11

    const/16 v2, 0xb4

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    :goto_a
    cmp-long v3, p2, v19

    if-nez v3, :cond_12

    move-wide/from16 v21, v15

    goto :goto_b

    :cond_12
    move-wide/from16 v21, p2

    .line 33
    :goto_b
    iget-object v3, v9, Le0/c;->n:Ld0/p;

    invoke-static {v3}, LZ0/h;->d(Ld0/p;)Le0/f;

    move-result-object v3

    cmp-long v4, v21, v19

    .line 34
    iget-wide v9, v3, Le0/f;->n:J

    if-nez v4, :cond_13

    move-wide/from16 v3, v19

    :goto_c
    const v13, 0x6d696e66

    goto :goto_d

    .line 35
    :cond_13
    sget v3, Ld0/w;->a:I

    .line 36
    sget-object v27, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v23, 0xf4240

    move-wide/from16 v25, v9

    invoke-static/range {v21 .. v27}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    goto :goto_c

    .line 37
    :goto_d
    invoke-virtual {v11, v13}, Le0/b;->f(I)Le0/b;

    move-result-object v15

    .line 38
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v13, 0x7374626c

    .line 39
    invoke-virtual {v15, v13}, Le0/b;->f(I)Le0/b;

    move-result-object v15

    .line 40
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v13, 0x6d646864

    .line 41
    invoke-virtual {v11, v13}, Le0/b;->i(I)Le0/c;

    move-result-object v11

    .line 42
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    iget-object v11, v11, Le0/c;->n:Ld0/p;

    const/16 v13, 0x8

    invoke-virtual {v11, v13}, Ld0/p;->H(I)V

    .line 44
    invoke-virtual {v11}, Ld0/p;->i()I

    move-result v13

    .line 45
    invoke-static {v13}, LZ0/h;->c(I)I

    move-result v13

    if-nez v13, :cond_14

    const/16 v0, 0x8

    goto :goto_e

    :cond_14
    const/16 v0, 0x10

    .line 46
    :goto_e
    invoke-virtual {v11, v0}, Ld0/p;->I(I)V

    .line 47
    invoke-virtual {v11}, Ld0/p;->x()J

    move-result-wide v31

    .line 48
    iget v0, v11, Ld0/p;->b:I

    move/from16 v40, v7

    if-nez v13, :cond_15

    const/4 v7, 0x4

    goto :goto_f

    :cond_15
    const/16 v7, 0x8

    :goto_f
    move-object/from16 v41, v5

    const/4 v5, 0x0

    :goto_10
    if-ge v5, v7, :cond_19

    .line 49
    iget-object v1, v11, Ld0/p;->a:[B

    add-int v16, v0, v5

    .line 50
    aget-byte v1, v1, v16

    move/from16 v16, v0

    const/4 v0, -0x1

    if-eq v1, v0, :cond_18

    if-nez v13, :cond_16

    .line 51
    invoke-virtual {v11}, Ld0/p;->x()J

    move-result-wide v0

    :goto_11
    move-wide/from16 v21, v0

    goto :goto_12

    :cond_16
    invoke-virtual {v11}, Ld0/p;->A()J

    move-result-wide v0

    goto :goto_11

    :goto_12
    cmp-long v0, v21, v34

    if-nez v0, :cond_17

    :goto_13
    move-wide/from16 v25, v19

    goto :goto_14

    .line 52
    :cond_17
    sget v0, Ld0/w;->a:I

    .line 53
    sget-object v27, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v23, 0xf4240

    move-wide/from16 v25, v31

    invoke-static/range {v21 .. v27}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    move-wide/from16 v25, v0

    goto :goto_14

    :cond_18
    const/4 v0, 0x1

    add-int/2addr v5, v0

    move-object/from16 v1, p1

    move/from16 v0, v16

    goto :goto_10

    .line 54
    :cond_19
    invoke-virtual {v11, v7}, Ld0/p;->I(I)V

    goto :goto_13

    .line 55
    :goto_14
    invoke-virtual {v11}, Ld0/p;->B()I

    move-result v0

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v5, v0, 0xa

    and-int/lit8 v5, v5, 0x1f

    add-int/lit8 v5, v5, 0x60

    int-to-char v5, v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v5, 0x5

    shr-int/lit8 v7, v0, 0x5

    and-int/lit8 v7, v7, 0x1f

    add-int/lit8 v7, v7, 0x60

    int-to-char v7, v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x60

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    const v0, 0x73747364

    .line 57
    invoke-virtual {v15, v0}, Le0/b;->i(I)Le0/c;

    move-result-object v0

    if-eqz v0, :cond_5d

    .line 58
    iget-object v0, v0, Le0/c;->n:Ld0/p;

    move-object/from16 v18, v0

    move/from16 v19, v6

    move/from16 v20, v2

    move-object/from16 v22, p4

    move/from16 v23, p6

    invoke-static/range {v18 .. v23}, LZ0/h;->f(Ld0/p;IILjava/lang/String;La0/l;Z)LZ0/e;

    move-result-object v0

    if-nez p5, :cond_1f

    const v1, 0x65647473

    .line 59
    invoke-virtual {v8, v1}, Le0/b;->f(I)Le0/b;

    move-result-object v1

    if-eqz v1, :cond_1f

    const v2, 0x656c7374

    .line 60
    invoke-virtual {v1, v2}, Le0/b;->i(I)Le0/c;

    move-result-object v1

    if-nez v1, :cond_1a

    move-object/from16 v42, v8

    const/4 v1, 0x0

    goto :goto_18

    .line 61
    :cond_1a
    iget-object v1, v1, Le0/c;->n:Ld0/p;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ld0/p;->H(I)V

    .line 62
    invoke-virtual {v1}, Ld0/p;->i()I

    move-result v2

    .line 63
    invoke-static {v2}, LZ0/h;->c(I)I

    move-result v2

    .line 64
    invoke-virtual {v1}, Ld0/p;->z()I

    move-result v7

    .line 65
    new-array v11, v7, [J

    .line 66
    new-array v13, v7, [J

    const/4 v15, 0x0

    :goto_15
    if-ge v15, v7, :cond_1e

    const/4 v5, 0x1

    if-ne v2, v5, :cond_1b

    .line 67
    invoke-virtual {v1}, Ld0/p;->A()J

    move-result-wide v16

    goto :goto_16

    :cond_1b
    invoke-virtual {v1}, Ld0/p;->x()J

    move-result-wide v16

    :goto_16
    aput-wide v16, v11, v15

    if-ne v2, v5, :cond_1c

    .line 68
    invoke-virtual {v1}, Ld0/p;->p()J

    move-result-wide v16

    move-object/from16 v42, v8

    move-wide/from16 v73, v16

    move/from16 v16, v7

    move-wide/from16 v7, v73

    goto :goto_17

    :cond_1c
    invoke-virtual {v1}, Ld0/p;->i()I

    move-result v5

    move/from16 v16, v7

    move-object/from16 v42, v8

    int-to-long v7, v5

    :goto_17
    aput-wide v7, v13, v15

    .line 69
    invoke-virtual {v1}, Ld0/p;->s()S

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_1d

    const/4 v5, 0x2

    .line 70
    invoke-virtual {v1, v5}, Ld0/p;->I(I)V

    add-int/2addr v15, v7

    move/from16 v7, v16

    move-object/from16 v8, v42

    const/4 v5, 0x5

    goto :goto_15

    .line 71
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    move-object/from16 v42, v8

    .line 72
    invoke-static {v11, v13}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    :goto_18
    if-eqz v1, :cond_20

    .line 73
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, [J

    .line 74
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [J

    goto :goto_19

    :cond_1f
    move-object/from16 v42, v8

    :cond_20
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 75
    :goto_19
    iget-object v5, v0, LZ0/e;->d:Ljava/lang/Object;

    move-object/from16 v27, v5

    check-cast v27, La0/p;

    if-nez v27, :cond_21

    const/4 v5, 0x0

    goto :goto_1a

    .line 76
    :cond_21
    new-instance v5, LZ0/t;

    .line 77
    iget v7, v0, LZ0/e;->b:I

    move/from16 v28, v7

    iget-object v7, v0, LZ0/e;->c:Ljava/lang/Object;

    move-object/from16 v29, v7

    check-cast v29, [LZ0/u;

    iget v0, v0, LZ0/e;->a:I

    move/from16 v30, v0

    move-object/from16 v16, v5

    move/from16 v17, v6

    move/from16 v18, v12

    move-wide/from16 v19, v31

    move-wide/from16 v21, v9

    move-wide/from16 v23, v3

    move-object/from16 v31, v2

    move-object/from16 v32, v1

    invoke-direct/range {v16 .. v32}, LZ0/t;-><init>(IIJJJJLa0/p;I[LZ0/u;I[J[J)V

    :goto_1a
    move-object/from16 v0, p7

    .line 78
    :goto_1b
    invoke-interface {v0, v5}, Ll2/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LZ0/t;

    if-nez v3, :cond_22

    move-object/from16 v0, v41

    goto/16 :goto_1

    :cond_22
    move-object/from16 v8, v42

    const v1, 0x6d646961

    .line 79
    invoke-virtual {v8, v1}, Le0/b;->f(I)Le0/b;

    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x6d696e66

    .line 81
    invoke-virtual {v1, v2}, Le0/b;->f(I)Le0/b;

    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7374626c

    .line 83
    invoke-virtual {v1, v2}, Le0/b;->f(I)Le0/b;

    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7374737a

    .line 85
    invoke-virtual {v1, v2}, Le0/b;->i(I)Le0/c;

    move-result-object v2

    .line 86
    iget-object v4, v3, LZ0/t;->g:La0/p;

    if-eqz v2, :cond_23

    .line 87
    new-instance v5, LZ0/f;

    invoke-direct {v5, v2, v4}, LZ0/f;-><init>(Le0/c;La0/p;)V

    goto :goto_1c

    :cond_23
    const v2, 0x73747a32

    .line 88
    invoke-virtual {v1, v2}, Le0/b;->i(I)Le0/c;

    move-result-object v2

    if-eqz v2, :cond_5c

    .line 89
    new-instance v5, LZ0/g;

    invoke-direct {v5, v2}, LZ0/g;-><init>(Le0/c;)V

    .line 90
    :goto_1c
    invoke-interface {v5}, LZ0/c;->b()I

    move-result v2

    if-nez v2, :cond_24

    .line 91
    new-instance v1, LZ0/w;

    const/4 v2, 0x0

    new-array v4, v2, [J

    new-array v5, v2, [I

    new-array v7, v2, [J

    new-array v8, v2, [I

    const-wide/16 v9, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, LZ0/w;-><init>(LZ0/t;[J[II[J[IJ)V

    :goto_1d
    move-object/from16 v0, v41

    goto/16 :goto_4e

    .line 92
    :cond_24
    iget v6, v3, LZ0/t;->b:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_25

    iget-wide v6, v3, LZ0/t;->f:J

    cmp-long v8, v6, v34

    if-lez v8, :cond_25

    int-to-float v8, v2

    long-to-float v6, v6

    const v7, 0x49742400    # 1000000.0f

    div-float/2addr v6, v7

    div-float/2addr v8, v6

    .line 93
    invoke-virtual {v4}, La0/p;->a()La0/o;

    move-result-object v4

    .line 94
    iput v8, v4, La0/o;->v:F

    .line 95
    new-instance v6, La0/p;

    invoke-direct {v6, v4}, La0/p;-><init>(La0/o;)V

    .line 96
    new-instance v4, LZ0/t;

    move-object v15, v4

    iget-object v7, v3, LZ0/t;->i:[J

    move-object/from16 v30, v7

    iget-object v7, v3, LZ0/t;->j:[J

    move-object/from16 v31, v7

    iget v7, v3, LZ0/t;->a:I

    move/from16 v16, v7

    iget v7, v3, LZ0/t;->b:I

    move/from16 v17, v7

    iget-wide v7, v3, LZ0/t;->c:J

    move-wide/from16 v18, v7

    iget-wide v7, v3, LZ0/t;->d:J

    move-wide/from16 v20, v7

    iget-wide v7, v3, LZ0/t;->e:J

    move-wide/from16 v22, v7

    iget-wide v7, v3, LZ0/t;->f:J

    move-wide/from16 v24, v7

    iget v7, v3, LZ0/t;->h:I

    move/from16 v27, v7

    iget-object v7, v3, LZ0/t;->l:[LZ0/u;

    move-object/from16 v28, v7

    iget v3, v3, LZ0/t;->k:I

    move/from16 v29, v3

    move-object/from16 v26, v6

    invoke-direct/range {v15 .. v31}, LZ0/t;-><init>(IIJJJJLa0/p;I[LZ0/u;I[J[J)V

    move-object v3, v4

    :cond_25
    const v4, 0x7374636f

    .line 97
    invoke-virtual {v1, v4}, Le0/b;->i(I)Le0/c;

    move-result-object v4

    if-nez v4, :cond_26

    const v4, 0x636f3634

    .line 98
    invoke-virtual {v1, v4}, Le0/b;->i(I)Le0/c;

    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    goto :goto_1e

    :cond_26
    const/4 v6, 0x0

    :goto_1e
    const v7, 0x73747363

    .line 100
    invoke-virtual {v1, v7}, Le0/b;->i(I)Le0/c;

    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, 0x73747473

    .line 102
    invoke-virtual {v1, v8}, Le0/b;->i(I)Le0/c;

    move-result-object v8

    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x73747373

    .line 104
    invoke-virtual {v1, v9}, Le0/b;->i(I)Le0/c;

    move-result-object v9

    if-eqz v9, :cond_27

    .line 105
    iget-object v9, v9, Le0/c;->n:Ld0/p;

    goto :goto_1f

    :cond_27
    const/4 v9, 0x0

    :goto_1f
    const v10, 0x63747473

    .line 106
    invoke-virtual {v1, v10}, Le0/b;->i(I)Le0/c;

    move-result-object v1

    if-eqz v1, :cond_28

    .line 107
    iget-object v1, v1, Le0/c;->n:Ld0/p;

    goto :goto_20

    :cond_28
    const/4 v1, 0x0

    .line 108
    :goto_20
    new-instance v10, LZ0/a;

    iget-object v7, v7, Le0/c;->n:Ld0/p;

    iget-object v4, v4, Le0/c;->n:Ld0/p;

    invoke-direct {v10, v7, v4, v6}, LZ0/a;-><init>(Ld0/p;Ld0/p;Z)V

    .line 109
    iget-object v4, v8, Le0/c;->n:Ld0/p;

    const/16 v6, 0xc

    invoke-virtual {v4, v6}, Ld0/p;->H(I)V

    .line 110
    invoke-virtual {v4}, Ld0/p;->z()I

    move-result v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    .line 111
    invoke-virtual {v4}, Ld0/p;->z()I

    move-result v8

    .line 112
    invoke-virtual {v4}, Ld0/p;->z()I

    move-result v11

    if-eqz v1, :cond_29

    .line 113
    invoke-virtual {v1, v6}, Ld0/p;->H(I)V

    .line 114
    invoke-virtual {v1}, Ld0/p;->z()I

    move-result v12

    goto :goto_21

    :cond_29
    const/4 v12, 0x0

    :goto_21
    if-eqz v9, :cond_2b

    .line 115
    invoke-virtual {v9, v6}, Ld0/p;->H(I)V

    .line 116
    invoke-virtual {v9}, Ld0/p;->z()I

    move-result v6

    if-lez v6, :cond_2a

    .line 117
    invoke-virtual {v9}, Ld0/p;->z()I

    move-result v13

    const/4 v15, 0x1

    sub-int/2addr v13, v15

    goto :goto_23

    :cond_2a
    const/4 v9, 0x0

    :goto_22
    const/4 v13, -0x1

    goto :goto_23

    :cond_2b
    const/4 v6, 0x0

    goto :goto_22

    .line 118
    :goto_23
    invoke-interface {v5}, LZ0/c;->a()I

    move-result v15

    .line 119
    iget-object v0, v3, LZ0/t;->g:La0/p;

    move/from16 v16, v8

    iget-object v8, v0, La0/p;->n:Ljava/lang/String;

    move/from16 v17, v13

    const/4 v13, -0x1

    if-eq v15, v13, :cond_31

    .line 120
    const-string v13, "audio/raw"

    .line 121
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2c

    const-string v13, "audio/g711-mlaw"

    .line 122
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2c

    const-string v13, "audio/g711-alaw"

    .line 123
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_31

    :cond_2c
    if-nez v7, :cond_31

    if-nez v12, :cond_31

    if-nez v6, :cond_31

    .line 124
    iget v1, v10, LZ0/a;->a:I

    new-array v4, v1, [J

    .line 125
    new-array v5, v1, [I

    .line 126
    :goto_24
    invoke-virtual {v10}, LZ0/a;->a()Z

    move-result v6

    if-eqz v6, :cond_2d

    .line 127
    iget v6, v10, LZ0/a;->b:I

    iget-wide v7, v10, LZ0/a;->d:J

    aput-wide v7, v4, v6

    .line 128
    iget v7, v10, LZ0/a;->c:I

    aput v7, v5, v6

    goto :goto_24

    :cond_2d
    int-to-long v6, v11

    const/16 v8, 0x2000

    .line 129
    div-int/2addr v8, v15

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_25
    if-ge v9, v1, :cond_2e

    .line 130
    aget v11, v5, v9

    .line 131
    invoke-static {v11, v8}, Ld0/w;->f(II)I

    move-result v11

    add-int/2addr v10, v11

    const/4 v11, 0x1

    add-int/2addr v9, v11

    goto :goto_25

    .line 132
    :cond_2e
    new-array v9, v10, [J

    .line 133
    new-array v11, v10, [I

    .line 134
    new-array v12, v10, [J

    .line 135
    new-array v10, v10, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_26
    if-ge v13, v1, :cond_30

    .line 136
    aget v18, v5, v13

    .line 137
    aget-wide v19, v4, v13

    move/from16 v73, v17

    move/from16 v17, v1

    move/from16 v1, v16

    move/from16 v16, v73

    move/from16 v74, v18

    move-object/from16 v18, v4

    move/from16 v4, v74

    :goto_27
    if-lez v4, :cond_2f

    .line 138
    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    move-result v21

    .line 139
    aput-wide v19, v9, v16

    move-object/from16 v22, v5

    mul-int v5, v15, v21

    .line 140
    aput v5, v11, v16

    .line 141
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v5, v8

    move-object/from16 v23, v9

    int-to-long v8, v14

    mul-long/2addr v8, v6

    .line 142
    aput-wide v8, v12, v16

    const/4 v8, 0x1

    .line 143
    aput v8, v10, v16

    .line 144
    aget v9, v11, v16

    int-to-long v8, v9

    add-long v19, v19, v8

    add-int v14, v14, v21

    sub-int v4, v4, v21

    const/4 v8, 0x1

    add-int/lit8 v16, v16, 0x1

    move v8, v5

    move-object/from16 v5, v22

    move-object/from16 v9, v23

    goto :goto_27

    :cond_2f
    move-object/from16 v22, v5

    move v5, v8

    move-object/from16 v23, v9

    const/4 v8, 0x1

    add-int/2addr v13, v8

    move v8, v5

    move-object/from16 v4, v18

    move-object/from16 v5, v22

    move/from16 v73, v16

    move/from16 v16, v1

    move/from16 v1, v17

    move/from16 v17, v73

    goto :goto_26

    :cond_30
    move-object/from16 v23, v9

    int-to-long v4, v14

    mul-long/2addr v6, v4

    move-object/from16 v18, v0

    move-object v9, v3

    move-object v3, v10

    move-object v0, v11

    move-object v1, v12

    move/from16 v46, v16

    move-object/from16 v8, v23

    goto/16 :goto_36

    .line 145
    :cond_31
    new-array v8, v2, [J

    .line 146
    new-array v13, v2, [I

    .line 147
    new-array v15, v2, [J

    move/from16 v18, v6

    .line 148
    new-array v6, v2, [I

    move-object/from16 v19, v3

    move-object/from16 v21, v4

    move/from16 v26, v7

    move/from16 v7, v18

    move-wide/from16 v22, v34

    move-wide/from16 v24, v22

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v20, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    move-object/from16 v18, v0

    move/from16 v0, v17

    move/from16 v17, v12

    move/from16 v12, v16

    move-object/from16 v16, v14

    move v14, v11

    .line 149
    :goto_28
    const-string v11, "BoxParsers"

    if-ge v3, v2, :cond_3b

    const/16 v27, 0x1

    :goto_29
    if-nez v20, :cond_32

    .line 150
    invoke-virtual {v10}, LZ0/a;->a()Z

    move-result v27

    if-eqz v27, :cond_32

    move/from16 v29, v4

    move-object/from16 v28, v5

    .line 151
    iget-wide v4, v10, LZ0/a;->d:J

    move/from16 v30, v2

    .line 152
    iget v2, v10, LZ0/a;->c:I

    move/from16 v20, v2

    move-wide/from16 v24, v4

    move-object/from16 v5, v28

    move/from16 v4, v29

    move/from16 v2, v30

    goto :goto_29

    :cond_32
    move/from16 v30, v2

    move/from16 v29, v4

    move-object/from16 v28, v5

    if-nez v27, :cond_33

    .line 153
    const-string v0, "Unexpected end of chunk data"

    invoke-static {v11, v0}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v8

    .line 155
    invoke-static {v13, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v13

    .line 156
    invoke-static {v15, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v15

    .line 157
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    move v2, v3

    move/from16 v0, v20

    move/from16 v5, v29

    :goto_2a
    move/from16 v3, v51

    goto/16 :goto_30

    :cond_33
    if-eqz v1, :cond_35

    :goto_2b
    if-nez v52, :cond_34

    if-lez v17, :cond_34

    .line 158
    invoke-virtual {v1}, Ld0/p;->z()I

    move-result v52

    .line 159
    invoke-virtual {v1}, Ld0/p;->i()I

    move-result v51

    const/4 v2, -0x1

    add-int/lit8 v17, v17, -0x1

    goto :goto_2b

    :cond_34
    const/4 v2, -0x1

    add-int/lit8 v52, v52, -0x1

    :cond_35
    move/from16 v2, v51

    .line 160
    aput-wide v24, v8, v3

    .line 161
    invoke-interface/range {v28 .. v28}, LZ0/c;->c()I

    move-result v4

    aput v4, v13, v3

    move/from16 v5, v29

    if-le v4, v5, :cond_36

    move v11, v4

    goto :goto_2c

    :cond_36
    move v11, v5

    :goto_2c
    int-to-long v4, v2

    add-long v4, v22, v4

    .line 162
    aput-wide v4, v15, v3

    if-nez v9, :cond_37

    const/4 v4, 0x1

    goto :goto_2d

    :cond_37
    const/4 v4, 0x0

    .line 163
    :goto_2d
    aput v4, v6, v3

    if-ne v3, v0, :cond_39

    const/4 v4, 0x1

    .line 164
    aput v4, v6, v3

    const/4 v5, -0x1

    add-int/2addr v7, v5

    if-lez v7, :cond_38

    .line 165
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    invoke-virtual {v9}, Ld0/p;->z()I

    move-result v0

    sub-int/2addr v0, v4

    :cond_38
    :goto_2e
    move-object v4, v6

    move/from16 v27, v7

    goto :goto_2f

    :cond_39
    const/4 v5, -0x1

    goto :goto_2e

    :goto_2f
    int-to-long v6, v14

    add-long v22, v22, v6

    add-int/2addr v12, v5

    if-nez v12, :cond_3a

    if-lez v26, :cond_3a

    .line 167
    invoke-virtual/range {v21 .. v21}, Ld0/p;->z()I

    move-result v6

    .line 168
    invoke-virtual/range {v21 .. v21}, Ld0/p;->i()I

    move-result v7

    add-int/lit8 v26, v26, -0x1

    move v12, v6

    move v14, v7

    .line 169
    :cond_3a
    aget v6, v13, v3

    int-to-long v6, v6

    add-long v24, v24, v6

    add-int/lit8 v20, v20, -0x1

    const/4 v5, 0x1

    add-int/2addr v3, v5

    move/from16 v51, v2

    move-object v6, v4

    move v4, v11

    move/from16 v7, v27

    move-object/from16 v5, v28

    move/from16 v2, v30

    goto/16 :goto_28

    :cond_3b
    move/from16 v30, v2

    move v5, v4

    move-object v4, v6

    move/from16 v0, v20

    goto :goto_2a

    :goto_30
    int-to-long v3, v3

    add-long v3, v22, v3

    if-eqz v1, :cond_3d

    :goto_31
    if-lez v17, :cond_3d

    .line 170
    invoke-virtual {v1}, Ld0/p;->z()I

    move-result v9

    if-eqz v9, :cond_3c

    const/4 v1, 0x0

    const/4 v9, -0x1

    goto :goto_32

    .line 171
    :cond_3c
    invoke-virtual {v1}, Ld0/p;->i()I

    const/4 v9, -0x1

    add-int/lit8 v17, v17, -0x1

    goto :goto_31

    :cond_3d
    const/4 v9, -0x1

    const/4 v1, 0x1

    :goto_32
    if-nez v7, :cond_3f

    if-nez v12, :cond_3f

    if-nez v0, :cond_3f

    if-nez v26, :cond_3f

    move/from16 v10, v52

    if-nez v10, :cond_40

    if-nez v1, :cond_3e

    goto :goto_33

    :cond_3e
    move/from16 v17, v2

    move-object/from16 v9, v19

    goto :goto_35

    :cond_3f
    move/from16 v10, v52

    .line 172
    :cond_40
    :goto_33
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v9, "Inconsistent stbl box for track "

    invoke-direct {v14, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v17, v2

    move-object/from16 v9, v19

    iget v2, v9, LZ0/t;->a:I

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": remainingSynchronizationSamples "

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", remainingSamplesInChunk "

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingTimestampDeltaChanges "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v26

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v1, :cond_41

    .line 173
    const-string v0, ", ctts invalid"

    goto :goto_34

    :cond_41
    move-object/from16 v0, v16

    :goto_34
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {v11, v0}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    :goto_35
    move/from16 v46, v5

    move-object v0, v13

    move-object v1, v15

    move/from16 v2, v17

    move-wide/from16 v73, v3

    move-object v3, v6

    move-wide/from16 v6, v73

    .line 175
    :goto_36
    sget-object v4, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v12, 0xf4240

    iget-wide v14, v9, LZ0/t;->c:J

    move-wide v10, v6

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v49

    .line 176
    iget-wide v14, v9, LZ0/t;->c:J

    iget-object v5, v9, LZ0/t;->i:[J

    if-nez v5, :cond_42

    .line 177
    invoke-static {v1, v14, v15}, Ld0/w;->T([JJ)V

    .line 178
    new-instance v2, LZ0/w;

    move-object/from16 v42, v2

    move-object/from16 v43, v9

    move-object/from16 v44, v8

    move-object/from16 v45, v0

    move-object/from16 v47, v1

    move-object/from16 v48, v3

    invoke-direct/range {v42 .. v50}, LZ0/w;-><init>(LZ0/t;[J[II[J[IJ)V

    move-object v1, v2

    goto/16 :goto_1d

    .line 179
    :cond_42
    array-length v10, v5

    iget v12, v9, LZ0/t;->b:I

    iget-object v13, v9, LZ0/t;->j:[J

    const/4 v11, 0x1

    if-ne v10, v11, :cond_47

    if-ne v12, v11, :cond_47

    array-length v10, v1

    const/4 v11, 0x2

    if-lt v10, v11, :cond_47

    .line 180
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    .line 181
    aget-wide v19, v13, v10

    .line 182
    aget-wide v16, v5, v10

    .line 183
    iget-wide v10, v9, LZ0/t;->c:J

    move-wide/from16 v21, v14

    iget-wide v14, v9, LZ0/t;->d:J

    move-wide/from16 v23, v10

    move-wide/from16 v10, v16

    move/from16 v17, v2

    move v2, v12

    move-object/from16 v25, v13

    move-wide/from16 v12, v23

    move/from16 v24, v2

    move-object/from16 v23, v3

    move-wide/from16 v2, v21

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    add-long v10, v19, v10

    .line 184
    array-length v12, v1

    const/4 v13, 0x1

    sub-int/2addr v12, v13

    const/4 v13, 0x0

    const/4 v14, 0x4

    .line 185
    invoke-static {v14, v13, v12}, Ld0/w;->i(III)I

    move-result v15

    move-object/from16 v21, v0

    .line 186
    array-length v0, v1

    sub-int/2addr v0, v14

    .line 187
    invoke-static {v0, v13, v12}, Ld0/w;->i(III)I

    move-result v0

    .line 188
    aget-wide v26, v1, v13

    cmp-long v12, v26, v19

    if-gtz v12, :cond_43

    aget-wide v12, v1, v15

    cmp-long v12, v19, v12

    if-gez v12, :cond_43

    aget-wide v12, v1, v0

    cmp-long v0, v12, v10

    if-gez v0, :cond_43

    cmp-long v0, v10, v6

    if-gtz v0, :cond_43

    const/4 v0, 0x1

    goto :goto_37

    :cond_43
    const/4 v0, 0x0

    :goto_37
    if-eqz v0, :cond_46

    sub-long v28, v6, v10

    sub-long v10, v19, v26

    move-object/from16 v0, v18

    .line 189
    iget v12, v0, La0/p;->D:I

    int-to-long v14, v12

    .line 190
    iget-wide v12, v9, LZ0/t;->c:J

    move-wide/from16 v18, v12

    move-wide v12, v14

    move-wide/from16 v26, v14

    move-wide/from16 v14, v18

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v14

    .line 191
    iget-wide v12, v9, LZ0/t;->c:J

    move-wide/from16 v10, v28

    move-wide/from16 v18, v12

    move-wide/from16 v12, v26

    move-wide/from16 v26, v6

    move-wide v6, v14

    move-wide/from16 v14, v18

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    cmp-long v12, v6, v34

    if-nez v12, :cond_45

    cmp-long v12, v10, v34

    if-eqz v12, :cond_44

    goto :goto_39

    :cond_44
    :goto_38
    move-object/from16 v6, p1

    goto :goto_3c

    :cond_45
    :goto_39
    const-wide/32 v12, 0x7fffffff

    cmp-long v14, v6, v12

    if-gtz v14, :cond_44

    cmp-long v12, v10, v12

    if-gtz v12, :cond_44

    long-to-int v0, v6

    move-object/from16 v6, p1

    .line 192
    iput v0, v6, LF0/y;->a:I

    long-to-int v0, v10

    .line 193
    iput v0, v6, LF0/y;->b:I

    .line 194
    invoke-static {v1, v2, v3}, Ld0/w;->T([JJ)V

    const/4 v0, 0x0

    .line 195
    aget-wide v10, v5, v0

    const-wide/32 v12, 0xf4240

    .line 196
    iget-wide v14, v9, LZ0/t;->d:J

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v49

    .line 197
    new-instance v0, LZ0/w;

    move-object/from16 v42, v0

    move-object/from16 v43, v9

    move-object/from16 v44, v8

    move-object/from16 v45, v21

    move-object/from16 v47, v1

    move-object/from16 v48, v23

    invoke-direct/range {v42 .. v50}, LZ0/w;-><init>(LZ0/t;[J[II[J[IJ)V

    :goto_3a
    move-object v1, v0

    goto/16 :goto_1d

    :cond_46
    move-wide/from16 v26, v6

    :goto_3b
    move-object/from16 v0, v18

    goto :goto_38

    :cond_47
    move-object/from16 v21, v0

    move/from16 v17, v2

    move-object/from16 v23, v3

    move-wide/from16 v26, v6

    move/from16 v24, v12

    move-object/from16 v25, v13

    goto :goto_3b

    .line 198
    :goto_3c
    array-length v2, v5

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4a

    const/4 v2, 0x0

    aget-wide v3, v5, v2

    cmp-long v3, v3, v34

    if-nez v3, :cond_49

    .line 199
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    aget-wide v3, v25, v2

    move v0, v2

    .line 201
    :goto_3d
    array-length v5, v1

    if-ge v0, v5, :cond_48

    .line 202
    aget-wide v10, v1, v0

    sub-long v12, v10, v3

    .line 203
    sget-object v18, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v14, 0xf4240

    iget-wide v10, v9, LZ0/t;->c:J

    move-wide/from16 v16, v10

    invoke-static/range {v12 .. v18}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    .line 204
    aput-wide v10, v1, v0

    const/4 v5, 0x1

    add-int/2addr v0, v5

    goto :goto_3d

    :cond_48
    sub-long v10, v26, v3

    .line 205
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v12, 0xf4240

    iget-wide v14, v9, LZ0/t;->c:J

    invoke-static/range {v10 .. v16}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v49

    .line 206
    new-instance v0, LZ0/w;

    move-object/from16 v42, v0

    move-object/from16 v43, v9

    move-object/from16 v44, v8

    move-object/from16 v45, v21

    move-object/from16 v47, v1

    move-object/from16 v48, v23

    invoke-direct/range {v42 .. v50}, LZ0/w;-><init>(LZ0/t;[J[II[J[IJ)V

    goto :goto_3a

    :cond_49
    move/from16 v3, v24

    const/4 v4, 0x1

    goto :goto_3e

    :cond_4a
    const/4 v2, 0x0

    move v4, v3

    move/from16 v3, v24

    :goto_3e
    if-ne v3, v4, :cond_4b

    const/4 v4, 0x1

    goto :goto_3f

    :cond_4b
    move v4, v2

    .line 207
    :goto_3f
    array-length v7, v5

    new-array v7, v7, [I

    .line 208
    array-length v10, v5

    new-array v10, v10, [I

    .line 209
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v11, v2

    move v12, v11

    move v13, v12

    move v14, v13

    .line 210
    :goto_40
    array-length v15, v5

    if-ge v11, v15, :cond_50

    move/from16 v24, v3

    .line 211
    aget-wide v2, v25, v11

    const-wide/16 v15, -0x1

    cmp-long v15, v2, v15

    if-eqz v15, :cond_4f

    .line 212
    aget-wide v26, v5, v11

    .line 213
    sget-object v32, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-object v15, v5

    iget-wide v5, v9, LZ0/t;->c:J

    move/from16 v16, v14

    move-object/from16 v18, v15

    iget-wide v14, v9, LZ0/t;->d:J

    move-wide/from16 v28, v5

    move-wide/from16 v30, v14

    invoke-static/range {v26 .. v32}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    const/4 v14, 0x1

    .line 214
    invoke-static {v1, v2, v3, v14}, Ld0/w;->e([JJZ)I

    move-result v15

    aput v15, v7, v11

    .line 215
    :goto_41
    aget v15, v7, v11

    if-ltz v15, :cond_4c

    aget v19, v23, v15

    and-int/lit8 v19, v19, 0x1

    if-nez v19, :cond_4c

    sub-int/2addr v15, v14

    .line 216
    aput v15, v7, v11

    const/4 v14, 0x1

    goto :goto_41

    :cond_4c
    add-long/2addr v2, v5

    .line 217
    invoke-static {v1, v2, v3, v4}, Ld0/w;->a([JJZ)I

    move-result v5

    aput v5, v10, v11

    move/from16 v6, v24

    const/4 v5, 0x2

    if-ne v6, v5, :cond_4d

    .line 218
    :goto_42
    aget v14, v10, v11

    array-length v15, v1

    const/16 v19, 0x1

    add-int/lit8 v15, v15, -0x1

    if-ge v14, v15, :cond_4d

    add-int/lit8 v14, v14, 0x1

    aget-wide v19, v1, v14

    cmp-long v15, v19, v2

    if-gtz v15, :cond_4d

    .line 219
    aput v14, v10, v11

    goto :goto_42

    .line 220
    :cond_4d
    aget v2, v10, v11

    aget v3, v7, v11

    sub-int v14, v2, v3

    add-int/2addr v14, v13

    move/from16 v15, v16

    if-eq v15, v3, :cond_4e

    const/4 v3, 0x1

    goto :goto_43

    :cond_4e
    const/4 v3, 0x0

    :goto_43
    or-int/2addr v3, v12

    move v12, v3

    move v13, v14

    move v14, v2

    :goto_44
    const/4 v2, 0x1

    goto :goto_45

    :cond_4f
    move-object/from16 v18, v5

    move v15, v14

    move/from16 v6, v24

    const/4 v5, 0x2

    goto :goto_44

    :goto_45
    add-int/2addr v11, v2

    move v3, v6

    move-object/from16 v5, v18

    const/4 v2, 0x0

    move-object/from16 v6, p1

    goto :goto_40

    :cond_50
    move-object/from16 v18, v5

    move/from16 v2, v17

    if-eq v13, v2, :cond_51

    const/4 v2, 0x1

    goto :goto_46

    :cond_51
    const/4 v2, 0x0

    :goto_46
    or-int/2addr v2, v12

    if-eqz v2, :cond_52

    .line 221
    new-array v3, v13, [J

    goto :goto_47

    :cond_52
    move-object v3, v8

    :goto_47
    if-eqz v2, :cond_53

    .line 222
    new-array v4, v13, [I

    goto :goto_48

    :cond_53
    move-object/from16 v4, v21

    :goto_48
    if-eqz v2, :cond_54

    const/16 v46, 0x0

    :cond_54
    if-eqz v2, :cond_55

    .line 223
    new-array v5, v13, [I

    goto :goto_49

    :cond_55
    move-object/from16 v5, v23

    .line 224
    :goto_49
    new-array v6, v13, [J

    move-object/from16 v14, v18

    move-wide/from16 v15, v34

    move/from16 v51, v46

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v18, v0

    .line 225
    :goto_4a
    array-length v0, v14

    if-ge v11, v0, :cond_5a

    .line 226
    aget-wide v19, v25, v11

    .line 227
    aget v0, v7, v11

    move-object/from16 v17, v7

    .line 228
    aget v7, v10, v11

    if-eqz v2, :cond_56

    move-object/from16 v22, v10

    sub-int v10, v7, v0

    .line 229
    invoke-static {v8, v0, v3, v13, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v24, v8

    move-object/from16 v8, v21

    .line 230
    invoke-static {v8, v0, v4, v13, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v21, v3

    move-object/from16 v3, v23

    .line 231
    invoke-static {v3, v0, v5, v13, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4b

    :cond_56
    move-object/from16 v24, v8

    move-object/from16 v22, v10

    move-object/from16 v8, v21

    move-object/from16 v21, v3

    move-object/from16 v3, v23

    :goto_4b
    move/from16 v10, v51

    :goto_4c
    if-ge v0, v7, :cond_59

    .line 232
    sget-object v23, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v28, 0xf4240

    move/from16 v33, v11

    move/from16 v36, v12

    iget-wide v11, v9, LZ0/t;->d:J

    move-wide/from16 v26, v15

    move-wide/from16 v30, v11

    move-object/from16 v32, v23

    invoke-static/range {v26 .. v32}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    .line 233
    aget-wide v26, v1, v0

    sub-long v26, v26, v19

    const-wide/32 v28, 0xf4240

    move-object/from16 v37, v14

    move-wide/from16 v38, v15

    .line 234
    iget-wide v14, v9, LZ0/t;->c:J

    move-wide/from16 v30, v14

    move-object/from16 v32, v23

    invoke-static/range {v26 .. v32}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v14

    cmp-long v16, v14, v34

    if-gez v16, :cond_57

    const/16 v36, 0x1

    :cond_57
    add-long/2addr v11, v14

    .line 235
    aput-wide v11, v6, v13

    if-eqz v2, :cond_58

    .line 236
    aget v11, v4, v13

    if-le v11, v10, :cond_58

    .line 237
    aget v10, v8, v0

    :cond_58
    const/4 v11, 0x1

    add-int/2addr v13, v11

    add-int/2addr v0, v11

    move/from16 v11, v33

    move/from16 v12, v36

    move-object/from16 v14, v37

    move-wide/from16 v15, v38

    goto :goto_4c

    :cond_59
    move/from16 v33, v11

    move/from16 v36, v12

    move-object/from16 v37, v14

    move-wide/from16 v38, v15

    const/4 v11, 0x1

    .line 238
    aget-wide v14, v37, v33

    add-long v15, v38, v14

    add-int/lit8 v0, v33, 0x1

    move v11, v0

    move-object/from16 v23, v3

    move/from16 v51, v10

    move-object/from16 v7, v17

    move-object/from16 v3, v21

    move-object/from16 v10, v22

    move-object/from16 v14, v37

    move-object/from16 v21, v8

    move-object/from16 v8, v24

    goto/16 :goto_4a

    :cond_5a
    move-object/from16 v21, v3

    move-wide/from16 v38, v15

    .line 239
    sget-object v32, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v28, 0xf4240

    iget-wide v0, v9, LZ0/t;->d:J

    move-wide/from16 v26, v38

    move-wide/from16 v30, v0

    invoke-static/range {v26 .. v32}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    move-result-wide v54

    if-eqz v12, :cond_5b

    .line 240
    invoke-virtual/range {v18 .. v18}, La0/p;->a()La0/o;

    move-result-object v0

    const/4 v1, 0x1

    .line 241
    iput-boolean v1, v0, La0/o;->s:Z

    .line 242
    new-instance v1, La0/p;

    invoke-direct {v1, v0}, La0/p;-><init>(La0/o;)V

    .line 243
    new-instance v0, LZ0/t;

    move-object/from16 v56, v0

    iget-object v2, v9, LZ0/t;->i:[J

    move-object/from16 v71, v2

    iget-object v2, v9, LZ0/t;->j:[J

    move-object/from16 v72, v2

    iget v2, v9, LZ0/t;->a:I

    move/from16 v57, v2

    iget v2, v9, LZ0/t;->b:I

    move/from16 v58, v2

    iget-wide v2, v9, LZ0/t;->c:J

    move-wide/from16 v59, v2

    iget-wide v2, v9, LZ0/t;->d:J

    move-wide/from16 v61, v2

    iget-wide v2, v9, LZ0/t;->e:J

    move-wide/from16 v63, v2

    iget-wide v2, v9, LZ0/t;->f:J

    move-wide/from16 v65, v2

    iget v2, v9, LZ0/t;->h:I

    move/from16 v68, v2

    iget-object v2, v9, LZ0/t;->l:[LZ0/u;

    move-object/from16 v69, v2

    iget v2, v9, LZ0/t;->k:I

    move/from16 v70, v2

    move-object/from16 v67, v1

    invoke-direct/range {v56 .. v72}, LZ0/t;-><init>(IIJJJJLa0/p;I[LZ0/u;I[J[J)V

    move-object/from16 v48, v0

    goto :goto_4d

    :cond_5b
    move-object/from16 v48, v9

    .line 244
    :goto_4d
    new-instance v1, LZ0/w;

    move-object/from16 v47, v1

    move-object/from16 v49, v21

    move-object/from16 v50, v4

    move-object/from16 v52, v6

    move-object/from16 v53, v5

    invoke-direct/range {v47 .. v55}, LZ0/w;-><init>(LZ0/t;[J[II[J[IJ)V

    goto/16 :goto_1d

    .line 245
    :goto_4e
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :goto_4f
    add-int/lit8 v7, v40, 0x1

    move-object/from16 v1, p1

    move-object v5, v0

    const/4 v3, -0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 246
    :cond_5c
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v1, v0}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_5d
    const/4 v1, 0x0

    .line 247
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    invoke-static {v1, v0}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_5e
    move-object v0, v5

    return-object v0
.end method

.method public static h(Ld0/p;IIIIILa0/l;LZ0/e;I)V
    .locals 45

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const/16 v5, 0x10

    add-int/lit8 v6, v1, 0x10

    .line 1
    invoke-virtual {v0, v6}, Ld0/p;->H(I)V

    .line 2
    invoke-virtual {v0, v5}, Ld0/p;->I(I)V

    .line 3
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v5

    .line 4
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v6

    const/16 v8, 0x32

    .line 5
    invoke-virtual {v0, v8}, Ld0/p;->I(I)V

    .line 6
    iget v8, v0, Ld0/p;->b:I

    const v10, 0x656e6376

    move/from16 v11, p1

    if-ne v11, v10, :cond_2

    .line 7
    invoke-static {v0, v1, v2}, LZ0/h;->e(Ld0/p;II)Landroid/util/Pair;

    move-result-object v10

    if-eqz v10, :cond_1

    .line 8
    iget-object v11, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v12, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, LZ0/u;

    iget-object v12, v12, LZ0/u;->b:Ljava/lang/String;

    invoke-virtual {v3, v12}, La0/l;->d(Ljava/lang/String;)La0/l;

    move-result-object v3

    .line 10
    :goto_0
    iget-object v12, v4, LZ0/e;->c:Ljava/lang/Object;

    check-cast v12, [LZ0/u;

    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, LZ0/u;

    aput-object v10, v12, p8

    .line 11
    :cond_1
    invoke-virtual {v0, v8}, Ld0/p;->H(I)V

    :cond_2
    const v10, 0x6d317620

    .line 12
    const-string v12, "video/3gpp"

    if-ne v11, v10, :cond_3

    .line 13
    const-string v10, "video/mpeg"

    goto :goto_1

    :cond_3
    const v10, 0x48323633

    if-ne v11, v10, :cond_4

    move-object v10, v12

    goto :goto_1

    :cond_4
    const/4 v10, 0x0

    :goto_1
    const/high16 v18, 0x3f800000    # 1.0f

    move/from16 v19, v18

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, -0x1

    const/16 v24, -0x1

    const/16 v25, -0x1

    const/16 v26, -0x1

    const/16 v27, -0x1

    const/16 v28, 0x8

    const/16 v29, 0x8

    const/16 v30, 0x0

    const/16 v31, 0x0

    :goto_2
    sub-int v14, v8, v1

    if-ge v14, v2, :cond_5

    .line 14
    invoke-virtual {v0, v8}, Ld0/p;->H(I)V

    .line 15
    iget v14, v0, Ld0/p;->b:I

    .line 16
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v9

    if-nez v9, :cond_6

    .line 17
    iget v15, v0, Ld0/p;->b:I

    sub-int/2addr v15, v1

    if-ne v15, v2, :cond_6

    :cond_5
    move/from16 v32, v5

    move-object/from16 p8, v20

    move/from16 v2, v25

    move/from16 v20, v26

    move/from16 v12, v27

    move/from16 v25, v28

    move/from16 v26, v29

    const/4 v4, 0x0

    move-object/from16 v27, v3

    move/from16 v28, v6

    move/from16 v3, v23

    goto/16 :goto_49

    :cond_6
    if-lez v9, :cond_7

    const/4 v15, 0x1

    goto :goto_3

    :cond_7
    const/4 v15, 0x0

    .line 18
    :goto_3
    const-string v7, "childAtomSize must be positive"

    invoke-static {v7, v15}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 19
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v15

    const v1, 0x61766343

    if-ne v15, v1, :cond_a

    if-nez v10, :cond_8

    const/4 v1, 0x1

    :goto_4
    const/4 v7, 0x0

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    goto :goto_4

    .line 20
    :goto_5
    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    const/16 v1, 0x8

    add-int/2addr v14, v1

    .line 21
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    .line 22
    invoke-static/range {p0 .. p0}, LF0/e;->a(Ld0/p;)LF0/e;

    move-result-object v1

    .line 23
    iget v7, v1, LF0/e;->b:I

    iput v7, v4, LZ0/e;->a:I

    if-nez v31, :cond_9

    .line 24
    iget v7, v1, LF0/e;->k:F

    move/from16 v19, v7

    .line 25
    :cond_9
    iget-object v7, v1, LF0/e;->a:Ljava/util/ArrayList;

    const-string v10, "video/avc"

    iget-object v14, v1, LF0/e;->l:Ljava/lang/String;

    iget v15, v1, LF0/e;->j:I

    iget v2, v1, LF0/e;->g:I

    move/from16 v20, v2

    iget v2, v1, LF0/e;->h:I

    move/from16 v21, v2

    iget v2, v1, LF0/e;->i:I

    move/from16 v24, v2

    iget v2, v1, LF0/e;->e:I

    iget v1, v1, LF0/e;->f:I

    move/from16 v29, v1

    move-object/from16 v27, v3

    move/from16 v32, v5

    move/from16 v28, v6

    move/from16 v33, v8

    move-object/from16 p6, v12

    move/from16 v25, v20

    move/from16 v26, v21

    move/from16 v3, v23

    move/from16 v12, v24

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v8, -0x1

    move-object/from16 v20, v7

    move/from16 v23, v11

    move-object/from16 v21, v14

    move/from16 v24, v15

    const/4 v7, 0x1

    const/4 v11, 0x2

    move v15, v2

    goto/16 :goto_48

    :cond_a
    const v1, 0x68766343

    const-string v2, "video/hevc"

    if-ne v15, v1, :cond_e

    if-nez v10, :cond_b

    const/4 v1, 0x1

    :goto_6
    const/4 v7, 0x0

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    goto :goto_6

    .line 26
    :goto_7
    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    const/16 v1, 0x8

    add-int/2addr v14, v1

    .line 27
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    const/4 v1, 0x0

    .line 28
    invoke-static {v0, v1, v7}, LF0/z;->a(Ld0/p;ZLZ1/i;)LF0/z;

    move-result-object v10

    .line 29
    iget v1, v10, LF0/z;->b:I

    iput v1, v4, LZ0/e;->a:I

    if-nez v31, :cond_c

    .line 30
    iget v1, v10, LF0/z;->i:F

    move/from16 v19, v1

    .line 31
    :cond_c
    iget v1, v10, LF0/z;->h:I

    const/4 v7, -0x1

    if-eq v1, v7, :cond_d

    move/from16 v23, v1

    .line 32
    :cond_d
    iget-object v1, v10, LF0/z;->a:Ljava/util/List;

    iget v7, v10, LF0/z;->j:I

    iget-object v13, v10, LF0/z;->k:Ljava/lang/String;

    iget v14, v10, LF0/z;->e:I

    iget v15, v10, LF0/z;->f:I

    move-object/from16 v20, v1

    iget v1, v10, LF0/z;->g:I

    move/from16 v21, v1

    iget v1, v10, LF0/z;->c:I

    move/from16 v24, v1

    iget v1, v10, LF0/z;->d:I

    iget-object v10, v10, LF0/z;->l:LZ1/i;

    move/from16 v29, v1

    move-object/from16 v27, v3

    move/from16 v32, v5

    move/from16 v28, v6

    move/from16 v33, v8

    move-object/from16 p6, v12

    move/from16 v25, v14

    move/from16 v26, v15

    move/from16 v12, v21

    move/from16 v3, v23

    move/from16 v15, v24

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v8, -0x1

    move/from16 v24, v7

    move/from16 v23, v11

    move-object/from16 v21, v13

    const/4 v7, 0x1

    const/4 v11, 0x2

    move-object v13, v10

    move-object v10, v2

    goto/16 :goto_48

    :cond_e
    const v1, 0x6c687643

    if-ne v15, v1, :cond_1a

    .line 33
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "lhvC must follow hvcC atom"

    .line 34
    invoke-static {v2, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    if-eqz v13, :cond_f

    .line 35
    iget-object v1, v13, LZ1/i;->l:Ljava/lang/Object;

    check-cast v1, Lm2/I;

    .line 36
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_f

    const/4 v1, 0x1

    goto :goto_8

    :cond_f
    const/4 v1, 0x0

    :goto_8
    const-string v2, "must have at least two layers"

    .line 37
    invoke-static {v2, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    const/16 v1, 0x8

    add-int/2addr v14, v1

    .line 38
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    .line 39
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 40
    invoke-static {v0, v1, v13}, LF0/z;->a(Ld0/p;ZLZ1/i;)LF0/z;

    move-result-object v2

    .line 41
    iget v1, v4, LZ0/e;->a:I

    iget v7, v2, LF0/z;->b:I

    if-ne v1, v7, :cond_10

    const/4 v1, 0x1

    goto :goto_9

    :cond_10
    const/4 v1, 0x0

    :goto_9
    const-string v7, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 42
    iget v1, v2, LF0/z;->e:I

    const/4 v7, -0x1

    move/from16 v10, v25

    if-eq v1, v7, :cond_12

    if-ne v10, v1, :cond_11

    const/4 v1, 0x1

    goto :goto_a

    :cond_11
    const/4 v1, 0x0

    .line 43
    :goto_a
    const-string v14, "colorSpace must be the same for both views"

    invoke-static {v14, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 44
    :cond_12
    iget v1, v2, LF0/z;->f:I

    move/from16 v14, v26

    if-eq v1, v7, :cond_14

    if-ne v14, v1, :cond_13

    const/4 v1, 0x1

    goto :goto_b

    :cond_13
    const/4 v1, 0x0

    .line 45
    :goto_b
    const-string v15, "colorRange must be the same for both views"

    invoke-static {v15, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 46
    :cond_14
    iget v1, v2, LF0/z;->g:I

    if-eq v1, v7, :cond_16

    move/from16 v7, v27

    if-ne v7, v1, :cond_15

    const/4 v1, 0x1

    goto :goto_c

    :cond_15
    const/4 v1, 0x0

    .line 47
    :goto_c
    const-string v15, "colorTransfer must be the same for both views"

    invoke-static {v15, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    goto :goto_d

    :cond_16
    move/from16 v7, v27

    .line 48
    :goto_d
    iget v1, v2, LF0/z;->c:I

    move/from16 v15, v28

    move/from16 v21, v7

    if-ne v15, v1, :cond_17

    const/4 v1, 0x1

    goto :goto_e

    :cond_17
    const/4 v1, 0x0

    :goto_e
    const-string v7, "bitdepthLuma must be the same for both views"

    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 49
    iget v1, v2, LF0/z;->d:I

    move/from16 v7, v29

    move/from16 v25, v7

    if-ne v7, v1, :cond_18

    const/4 v1, 0x1

    goto :goto_f

    :cond_18
    const/4 v1, 0x0

    :goto_f
    const-string v7, "bitdepthChroma must be the same for both views"

    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    move-object/from16 v1, v20

    if-eqz v1, :cond_19

    .line 50
    invoke-static {}, Lm2/I;->n()Lm2/F;

    move-result-object v7

    .line 51
    invoke-virtual {v7, v1}, Lm2/C;->d(Ljava/util/List;)V

    .line 52
    iget-object v1, v2, LF0/z;->a:Ljava/util/List;

    invoke-virtual {v7, v1}, Lm2/C;->d(Ljava/util/List;)V

    .line 53
    invoke-virtual {v7}, Lm2/F;->g()Lm2/b0;

    move-result-object v20

    .line 54
    const-string v1, "video/mv-hevc"

    iget-object v2, v2, LF0/z;->k:Ljava/lang/String;

    move-object/from16 v27, v3

    move/from16 v32, v5

    move/from16 v28, v6

    move/from16 v33, v8

    move-object/from16 p6, v12

    move/from16 v26, v14

    move/from16 v12, v21

    move/from16 v3, v23

    move/from16 v29, v25

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    move-object/from16 v21, v2

    move/from16 v25, v10

    move/from16 v23, v11

    const/4 v11, 0x2

    move-object v10, v1

    const/16 v1, 0x8

    goto/16 :goto_48

    .line 55
    :cond_19
    const-string v0, "initializationData must be already set from hvcC atom"

    const/4 v1, 0x0

    invoke-static {v1, v0}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    move-result-object v0

    throw v0

    :cond_1a
    move-object/from16 p6, v12

    move-object/from16 v1, v20

    move/from16 v2, v25

    move/from16 v20, v26

    move/from16 v12, v27

    move/from16 v25, v28

    move/from16 v26, v29

    const v4, 0x76657875

    if-ne v15, v4, :cond_2a

    const/16 v4, 0x8

    add-int/lit8 v15, v14, 0x8

    .line 56
    invoke-virtual {v0, v15}, Ld0/p;->H(I)V

    .line 57
    iget v4, v0, Ld0/p;->b:I

    move-object/from16 v27, v3

    const/4 v15, 0x0

    :goto_10
    sub-int v3, v4, v14

    if-ge v3, v9, :cond_23

    .line 58
    invoke-virtual {v0, v4}, Ld0/p;->H(I)V

    .line 59
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v3

    move-object/from16 p8, v1

    if-lez v3, :cond_1b

    const/4 v1, 0x1

    goto :goto_11

    :cond_1b
    const/4 v1, 0x0

    .line 60
    :goto_11
    invoke-static {v7, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 61
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v1

    move/from16 v28, v6

    const v6, 0x65796573

    if-ne v1, v6, :cond_22

    const/16 v1, 0x8

    add-int/lit8 v15, v4, 0x8

    .line 62
    invoke-virtual {v0, v15}, Ld0/p;->H(I)V

    .line 63
    iget v1, v0, Ld0/p;->b:I

    :goto_12
    sub-int v6, v1, v4

    if-ge v6, v3, :cond_21

    .line 64
    invoke-virtual {v0, v1}, Ld0/p;->H(I)V

    .line 65
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v6

    if-lez v6, :cond_1c

    const/4 v15, 0x1

    goto :goto_13

    :cond_1c
    const/4 v15, 0x0

    .line 66
    :goto_13
    invoke-static {v7, v15}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 67
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v15

    move-object/from16 v29, v7

    const v7, 0x73747269

    if-ne v15, v7, :cond_20

    const/4 v7, 0x4

    .line 68
    invoke-virtual {v0, v7}, Ld0/p;->I(I)V

    .line 69
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v1

    .line 70
    new-instance v6, LB0/d;

    new-instance v7, LZ0/d;

    move/from16 v32, v5

    const/4 v15, 0x1

    and-int/lit8 v5, v1, 0x1

    move/from16 v33, v8

    if-ne v5, v15, :cond_1d

    const/4 v5, 0x1

    :goto_14
    const/4 v15, 0x2

    goto :goto_15

    :cond_1d
    const/4 v5, 0x0

    goto :goto_14

    :goto_15
    and-int/lit8 v8, v1, 0x2

    if-ne v8, v15, :cond_1e

    const/4 v8, 0x1

    :goto_16
    const/16 v15, 0x8

    goto :goto_17

    :cond_1e
    const/4 v8, 0x0

    goto :goto_16

    :goto_17
    and-int/2addr v1, v15

    if-ne v1, v15, :cond_1f

    const/4 v1, 0x1

    goto :goto_18

    :cond_1f
    const/4 v1, 0x0

    .line 71
    :goto_18
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-boolean v5, v7, LZ0/d;->a:Z

    .line 73
    iput-boolean v8, v7, LZ0/d;->b:Z

    .line 74
    iput-boolean v1, v7, LZ0/d;->c:Z

    .line 75
    invoke-direct {v6, v7}, LB0/d;-><init>(Ljava/lang/Object;)V

    goto :goto_19

    :cond_20
    move/from16 v32, v5

    move/from16 v33, v8

    add-int/2addr v1, v6

    move-object/from16 v7, v29

    goto :goto_12

    :cond_21
    move/from16 v32, v5

    move-object/from16 v29, v7

    move/from16 v33, v8

    const/4 v6, 0x0

    :goto_19
    move-object v15, v6

    goto :goto_1a

    :cond_22
    move/from16 v32, v5

    move-object/from16 v29, v7

    move/from16 v33, v8

    :goto_1a
    add-int/2addr v4, v3

    move-object/from16 v1, p8

    move/from16 v6, v28

    move-object/from16 v7, v29

    move/from16 v5, v32

    move/from16 v8, v33

    goto/16 :goto_10

    :cond_23
    move-object/from16 p8, v1

    move/from16 v32, v5

    move/from16 v28, v6

    move/from16 v33, v8

    if-nez v15, :cond_24

    const/4 v1, 0x0

    goto :goto_1b

    .line 76
    :cond_24
    new-instance v1, LB0/d;

    invoke-direct {v1, v15}, LB0/d;-><init>(Ljava/lang/Object;)V

    :goto_1b
    if-eqz v1, :cond_26

    .line 77
    iget-object v1, v1, LB0/d;->l:Ljava/lang/Object;

    check-cast v1, LB0/d;

    .line 78
    iget-object v1, v1, LB0/d;->l:Ljava/lang/Object;

    check-cast v1, LZ0/d;

    if-eqz v13, :cond_27

    iget-object v3, v13, LZ1/i;->l:Ljava/lang/Object;

    check-cast v3, Lm2/I;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_27

    .line 79
    iget-boolean v3, v1, LZ0/d;->a:Z

    if-eqz v3, :cond_25

    .line 80
    iget-boolean v3, v1, LZ0/d;->b:Z

    if-eqz v3, :cond_25

    const/4 v3, 0x1

    goto :goto_1c

    :cond_25
    const/4 v3, 0x0

    .line 81
    :goto_1c
    const-string v4, "both eye views must be marked as available"

    .line 82
    invoke-static {v4, v3}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 83
    iget-boolean v1, v1, LZ0/d;->c:Z

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    const-string v3, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 84
    invoke-static {v3, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    :cond_26
    move/from16 v3, v23

    goto :goto_1e

    :cond_27
    move/from16 v3, v23

    const/4 v4, -0x1

    if-ne v3, v4, :cond_29

    .line 85
    iget-boolean v1, v1, LZ0/d;->c:Z

    if-eqz v1, :cond_28

    const/4 v1, 0x5

    goto :goto_1d

    :cond_28
    const/4 v1, 0x4

    :goto_1d
    move/from16 v23, v1

    goto :goto_1f

    :cond_29
    :goto_1e
    move/from16 v23, v3

    :goto_1f
    move/from16 v3, v23

    move/from16 v15, v25

    move/from16 v29, v26

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    move/from16 v25, v2

    move/from16 v23, v11

    move/from16 v26, v20

    const/4 v11, 0x2

    :goto_20
    move-object/from16 v20, p8

    goto/16 :goto_48

    :cond_2a
    move-object/from16 p8, v1

    move-object/from16 v27, v3

    move/from16 v32, v5

    move/from16 v28, v6

    move/from16 v33, v8

    move/from16 v3, v23

    const v1, 0x64766343

    if-eq v15, v1, :cond_2b

    const v1, 0x64767643

    if-ne v15, v1, :cond_2c

    :cond_2b
    move/from16 v23, v11

    move-object/from16 v29, v13

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    goto/16 :goto_47

    :cond_2c
    const v1, 0x76706343

    if-ne v15, v1, :cond_32

    if-nez v10, :cond_2d

    const/4 v1, 0x1

    :goto_21
    const/4 v2, 0x0

    goto :goto_22

    :cond_2d
    const/4 v1, 0x0

    goto :goto_21

    .line 86
    :goto_22
    invoke-static {v2, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    const v1, 0x76703038

    .line 87
    const-string v2, "video/x-vnd.on2.vp9"

    if-ne v11, v1, :cond_2e

    const-string v1, "video/x-vnd.on2.vp8"

    :goto_23
    const/16 v4, 0xc

    goto :goto_24

    :cond_2e
    move-object v1, v2

    goto :goto_23

    :goto_24
    add-int/2addr v14, v4

    .line 88
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    .line 89
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v4

    int-to-byte v4, v4

    .line 90
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v5

    int-to-byte v5, v5

    .line 91
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v6

    const/4 v7, 0x4

    shr-int/lit8 v8, v6, 0x4

    const/4 v7, 0x1

    shr-int/lit8 v10, v6, 0x1

    const/4 v12, 0x7

    and-int/2addr v10, v12

    int-to-byte v10, v10

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    int-to-byte v2, v8

    .line 93
    sget-object v12, Ld0/b;->a:[B

    const/16 v12, 0xc

    .line 94
    new-array v14, v12, [B

    const/4 v12, 0x0

    aput-byte v7, v14, v12

    aput-byte v7, v14, v7

    const/4 v12, 0x2

    aput-byte v4, v14, v12

    const/4 v4, 0x3

    aput-byte v12, v14, v4

    const/4 v12, 0x4

    aput-byte v7, v14, v12

    const/4 v15, 0x5

    aput-byte v5, v14, v15

    const/4 v5, 0x6

    aput-byte v4, v14, v5

    const/4 v4, 0x7

    aput-byte v7, v14, v4

    const/16 v4, 0x8

    aput-byte v2, v14, v4

    const/16 v2, 0x9

    aput-byte v12, v14, v2

    const/16 v4, 0xa

    aput-byte v7, v14, v4

    const/16 v2, 0xb

    aput-byte v10, v14, v2

    invoke-static {v14}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v20

    goto :goto_25

    :cond_2f
    const/16 v4, 0xa

    move-object/from16 v20, p8

    :goto_25
    and-int/lit8 v2, v6, 0x1

    if-eqz v2, :cond_30

    const/4 v2, 0x1

    goto :goto_26

    :cond_30
    const/4 v2, 0x0

    .line 95
    :goto_26
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v5

    .line 96
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v6

    .line 97
    invoke-static {v5}, La0/g;->f(I)I

    move-result v25

    if-eqz v2, :cond_31

    const/4 v2, 0x1

    goto :goto_27

    :cond_31
    const/4 v2, 0x2

    .line 98
    :goto_27
    invoke-static {v6}, La0/g;->g(I)I

    move-result v5

    move-object v10, v1

    move/from16 v26, v2

    move v12, v5

    move v15, v8

    move/from16 v29, v15

    move/from16 v23, v11

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    goto/16 :goto_48

    :cond_32
    const/16 v4, 0xa

    const v1, 0x61763143

    .line 99
    const-string v5, "BoxParsers"

    if-ne v15, v1, :cond_4c

    const/16 v1, 0x8

    add-int/lit8 v2, v9, -0x8

    .line 100
    new-array v6, v2, [B

    const/4 v7, 0x0

    .line 101
    invoke-virtual {v0, v6, v7, v2}, Ld0/p;->g([BII)V

    .line 102
    invoke-static {v6}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v20

    add-int/2addr v14, v1

    .line 103
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    .line 104
    new-instance v1, LF0/M;

    .line 105
    iget-object v2, v0, Ld0/p;->a:[B

    .line 106
    array-length v6, v2

    invoke-direct {v1, v6, v2}, LF0/M;-><init>(I[B)V

    .line 107
    iget v2, v0, Ld0/p;->b:I

    const/16 v6, 0x8

    mul-int/2addr v2, v6

    .line 108
    invoke-virtual {v1, v2}, LF0/M;->r(I)V

    const/4 v2, 0x1

    .line 109
    invoke-virtual {v1, v2}, LF0/M;->v(I)V

    const/4 v2, 0x3

    .line 110
    invoke-virtual {v1, v2}, LF0/M;->i(I)I

    move-result v6

    const/4 v8, 0x6

    .line 111
    invoke-virtual {v1, v8}, LF0/M;->u(I)V

    .line 112
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v2

    .line 113
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v10

    const/16 v37, -0x1

    const/4 v12, 0x2

    if-ne v6, v12, :cond_35

    if-eqz v2, :cond_35

    if-eqz v10, :cond_33

    const/16 v2, 0xc

    goto :goto_28

    :cond_33
    move v2, v4

    :goto_28
    if-eqz v10, :cond_34

    const/16 v6, 0xc

    goto :goto_29

    :cond_34
    move v6, v4

    :goto_29
    move/from16 v42, v2

    move/from16 v43, v6

    goto :goto_2c

    :cond_35
    if-gt v6, v12, :cond_38

    if-eqz v2, :cond_36

    move v6, v4

    goto :goto_2a

    :cond_36
    const/16 v6, 0x8

    :goto_2a
    if-eqz v2, :cond_37

    move v2, v4

    goto :goto_2b

    :cond_37
    const/16 v2, 0x8

    :goto_2b
    move/from16 v43, v2

    move/from16 v42, v6

    goto :goto_2c

    :cond_38
    move/from16 v42, v37

    move/from16 v43, v42

    :goto_2c
    const/16 v2, 0xd

    .line 114
    invoke-virtual {v1, v2}, LF0/M;->u(I)V

    .line 115
    invoke-virtual {v1}, LF0/M;->t()V

    const/4 v6, 0x4

    .line 116
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v10

    const/16 v44, 0x0

    const/4 v6, 0x1

    if-eq v10, v6, :cond_39

    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported obu_type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    :goto_2d
    const/4 v6, 0x5

    const/4 v12, 0x4

    const/16 v14, 0xc

    goto/16 :goto_36

    .line 119
    :cond_39
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_3a

    .line 120
    const-string v1, "Unsupported obu_extension_flag"

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    goto :goto_2d

    .line 122
    :cond_3a
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    .line 123
    invoke-virtual {v1}, LF0/M;->t()V

    if-eqz v6, :cond_3b

    const/16 v6, 0x8

    .line 124
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v10

    const/16 v6, 0x7f

    if-le v10, v6, :cond_3b

    .line 125
    const-string v1, "Excessive obu_size"

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    goto :goto_2d

    :cond_3b
    const/4 v6, 0x3

    .line 127
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v10

    .line 128
    invoke-virtual {v1}, LF0/M;->t()V

    .line 129
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_3c

    .line 130
    const-string v1, "Unsupported reduced_still_picture_header"

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    goto :goto_2d

    .line 132
    :cond_3c
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_3d

    .line 133
    const-string v1, "Unsupported timing_info_present_flag"

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    goto/16 :goto_2d

    .line 135
    :cond_3d
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v6

    if-eqz v6, :cond_3e

    .line 136
    const-string v1, "Unsupported initial_display_delay_present_flag"

    invoke-static {v5, v1}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v1, La0/g;

    move-object/from16 v34, v1

    move/from16 v35, v37

    move/from16 v36, v37

    move/from16 v38, v42

    move/from16 v39, v43

    move-object/from16 v40, v44

    invoke-direct/range {v34 .. v40}, La0/g;-><init>(IIIII[B)V

    goto/16 :goto_2d

    :cond_3e
    const/4 v6, 0x5

    .line 138
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v5

    move v12, v7

    :goto_2e
    if-gt v12, v5, :cond_40

    const/16 v14, 0xc

    .line 139
    invoke-virtual {v1, v14}, LF0/M;->u(I)V

    .line 140
    invoke-virtual {v1, v6}, LF0/M;->i(I)I

    move-result v15

    const/4 v4, 0x7

    if-le v15, v4, :cond_3f

    .line 141
    invoke-virtual {v1}, LF0/M;->t()V

    :cond_3f
    const/4 v4, 0x1

    add-int/2addr v12, v4

    const/16 v4, 0xa

    goto :goto_2e

    :cond_40
    const/4 v4, 0x1

    const/4 v12, 0x4

    const/16 v14, 0xc

    .line 142
    invoke-virtual {v1, v12}, LF0/M;->i(I)I

    move-result v5

    .line 143
    invoke-virtual {v1, v12}, LF0/M;->i(I)I

    move-result v15

    add-int/2addr v5, v4

    .line 144
    invoke-virtual {v1, v5}, LF0/M;->u(I)V

    add-int/2addr v15, v4

    .line 145
    invoke-virtual {v1, v15}, LF0/M;->u(I)V

    .line 146
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v4

    if-eqz v4, :cond_41

    const/4 v4, 0x7

    .line 147
    invoke-virtual {v1, v4}, LF0/M;->u(I)V

    goto :goto_2f

    :cond_41
    const/4 v4, 0x7

    .line 148
    :goto_2f
    invoke-virtual {v1, v4}, LF0/M;->u(I)V

    .line 149
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v5

    if-eqz v5, :cond_42

    const/4 v15, 0x2

    .line 150
    invoke-virtual {v1, v15}, LF0/M;->u(I)V

    .line 151
    :cond_42
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v15

    if-eqz v15, :cond_43

    const/4 v15, 0x1

    const/16 v16, 0x2

    goto :goto_30

    :cond_43
    const/4 v15, 0x1

    .line 152
    invoke-virtual {v1, v15}, LF0/M;->i(I)I

    move-result v16

    :goto_30
    if-lez v16, :cond_44

    .line 153
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v16

    if-nez v16, :cond_44

    .line 154
    invoke-virtual {v1, v15}, LF0/M;->u(I)V

    :cond_44
    if-eqz v5, :cond_45

    const/4 v5, 0x3

    .line 155
    invoke-virtual {v1, v5}, LF0/M;->u(I)V

    goto :goto_31

    :cond_45
    const/4 v5, 0x3

    .line 156
    :goto_31
    invoke-virtual {v1, v5}, LF0/M;->u(I)V

    .line 157
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v5

    const/4 v15, 0x2

    if-ne v10, v15, :cond_46

    if-eqz v5, :cond_46

    .line 158
    invoke-virtual {v1}, LF0/M;->t()V

    :cond_46
    const/4 v5, 0x1

    if-eq v10, v5, :cond_47

    .line 159
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v5

    if-eqz v5, :cond_47

    const/4 v5, 0x1

    goto :goto_32

    :cond_47
    move v5, v7

    .line 160
    :goto_32
    invoke-virtual {v1}, LF0/M;->h()Z

    move-result v10

    if-eqz v10, :cond_4b

    const/16 v10, 0x8

    .line 161
    invoke-virtual {v1, v10}, LF0/M;->i(I)I

    move-result v15

    .line 162
    invoke-virtual {v1, v10}, LF0/M;->i(I)I

    move-result v4

    .line 163
    invoke-virtual {v1, v10}, LF0/M;->i(I)I

    move-result v16

    if-nez v5, :cond_48

    const/4 v5, 0x1

    if-ne v15, v5, :cond_49

    if-ne v4, v2, :cond_49

    if-nez v16, :cond_49

    move v1, v5

    goto :goto_33

    :cond_48
    const/4 v5, 0x1

    .line 164
    :cond_49
    invoke-virtual {v1, v5}, LF0/M;->i(I)I

    move-result v17

    move/from16 v1, v17

    .line 165
    :goto_33
    invoke-static {v15}, La0/g;->f(I)I

    move-result v37

    if-ne v1, v5, :cond_4a

    const/4 v1, 0x1

    goto :goto_34

    :cond_4a
    const/4 v1, 0x2

    .line 166
    :goto_34
    invoke-static {v4}, La0/g;->g(I)I

    move-result v2

    move/from16 v40, v1

    move/from16 v41, v2

    move/from16 v39, v37

    goto :goto_35

    :cond_4b
    move/from16 v39, v37

    move/from16 v40, v39

    move/from16 v41, v40

    .line 167
    :goto_35
    new-instance v1, La0/g;

    move-object/from16 v38, v1

    invoke-direct/range {v38 .. v44}, La0/g;-><init>(IIIII[B)V

    .line 168
    :goto_36
    const-string v2, "video/av01"

    iget v4, v1, La0/g;->e:I

    iget v5, v1, La0/g;->f:I

    iget v10, v1, La0/g;->a:I

    iget v15, v1, La0/g;->b:I

    iget v1, v1, La0/g;->c:I

    move v12, v1

    move/from16 v29, v5

    move/from16 v25, v10

    move/from16 v23, v11

    move/from16 v26, v15

    const/16 v1, 0x8

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    move-object v10, v2

    move v15, v4

    const/4 v4, 0x0

    goto/16 :goto_48

    :cond_4c
    const/16 v4, 0xc

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v8, 0x6

    const v1, 0x636c6c69

    const/16 v16, 0x19

    if-ne v15, v1, :cond_4e

    if-nez v18, :cond_4d

    .line 169
    invoke-static/range {v16 .. v16}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v18

    :cond_4d
    move-object/from16 v1, v18

    const/16 v5, 0x15

    .line 170
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 171
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v5

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 172
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v5

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v18, v1

    move/from16 v23, v11

    move/from16 v15, v25

    move/from16 v29, v26

    const/16 v1, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    move/from16 v25, v2

    :goto_37
    move/from16 v26, v20

    goto/16 :goto_20

    :cond_4e
    const v1, 0x6d646376

    if-ne v15, v1, :cond_50

    if-nez v18, :cond_4f

    .line 173
    invoke-static/range {v16 .. v16}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v18

    :cond_4f
    move-object/from16 v1, v18

    .line 174
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v5

    .line 175
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v14

    .line 176
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v15

    .line 177
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v4

    .line 178
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v6

    .line 179
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v7

    .line 180
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v8

    move/from16 v23, v11

    .line 181
    invoke-virtual/range {p0 .. p0}, Ld0/p;->s()S

    move-result v11

    .line 182
    invoke-virtual/range {p0 .. p0}, Ld0/p;->x()J

    move-result-wide v34

    .line 183
    invoke-virtual/range {p0 .. p0}, Ld0/p;->x()J

    move-result-wide v36

    move-object/from16 v29, v13

    const/4 v13, 0x1

    .line 184
    invoke-virtual {v1, v13}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 185
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 186
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 187
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 188
    invoke-virtual {v1, v14}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 189
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 190
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 191
    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 192
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x2710

    .line 193
    div-long v6, v34, v4

    long-to-int v6, v6

    int-to-short v6, v6

    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 194
    div-long v4, v36, v4

    long-to-int v4, v4

    int-to-short v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v18, v1

    move/from16 v15, v25

    move-object/from16 v13, v29

    const/16 v1, 0x8

    const/4 v4, 0x0

    :goto_38
    const/4 v6, 0x3

    const/4 v7, 0x1

    :goto_39
    const/4 v8, -0x1

    const/4 v11, 0x2

    :goto_3a
    move/from16 v25, v2

    move/from16 v29, v26

    goto/16 :goto_37

    :cond_50
    move/from16 v23, v11

    move-object/from16 v29, v13

    const v1, 0x64323633

    if-ne v15, v1, :cond_52

    if-nez v10, :cond_51

    const/4 v1, 0x1

    :goto_3b
    const/4 v4, 0x0

    goto :goto_3c

    :cond_51
    const/4 v1, 0x0

    goto :goto_3b

    .line 195
    :goto_3c
    invoke-static {v4, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    move-object/from16 v10, p6

    move/from16 v15, v25

    move-object/from16 v13, v29

    const/16 v1, 0x8

    goto :goto_38

    :cond_52
    const/4 v4, 0x0

    const v1, 0x65736473

    if-ne v15, v1, :cond_55

    if-nez v10, :cond_53

    const/4 v1, 0x1

    goto :goto_3d

    :cond_53
    const/4 v1, 0x0

    .line 196
    :goto_3d
    invoke-static {v4, v1}, LF0/b;->e(Ljava/lang/String;Z)V

    .line 197
    invoke-static {v14, v0}, LZ0/h;->a(ILd0/p;)LZ0/b;

    move-result-object v1

    .line 198
    iget-object v5, v1, LZ0/b;->o:Ljava/lang/Object;

    check-cast v5, [B

    if-eqz v5, :cond_54

    .line 199
    invoke-static {v5}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    move-result-object v5

    goto :goto_3e

    :cond_54
    move-object/from16 v5, p8

    .line 200
    :goto_3e
    iget-object v6, v1, LZ0/b;->n:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    move-object/from16 v30, v1

    move-object v10, v6

    move/from16 v15, v25

    move-object/from16 v13, v29

    const/16 v1, 0x8

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    move/from16 v25, v2

    move/from16 v29, v26

    move/from16 v26, v20

    move-object/from16 v20, v5

    goto/16 :goto_48

    :cond_55
    const v1, 0x70617370

    if-ne v15, v1, :cond_56

    const/16 v1, 0x8

    add-int/2addr v14, v1

    .line 201
    invoke-virtual {v0, v14}, Ld0/p;->H(I)V

    .line 202
    invoke-virtual/range {p0 .. p0}, Ld0/p;->z()I

    move-result v5

    .line 203
    invoke-virtual/range {p0 .. p0}, Ld0/p;->z()I

    move-result v6

    int-to-float v5, v5

    int-to-float v6, v6

    div-float/2addr v5, v6

    move/from16 v19, v5

    move/from16 v15, v25

    move-object/from16 v13, v29

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v11, 0x2

    const/16 v31, 0x1

    goto :goto_3a

    :cond_56
    const/16 v1, 0x8

    const v6, 0x73763364

    if-ne v15, v6, :cond_59

    add-int/lit8 v15, v14, 0x8

    :goto_3f
    sub-int v5, v15, v14

    if-ge v5, v9, :cond_58

    .line 204
    invoke-virtual {v0, v15}, Ld0/p;->H(I)V

    .line 205
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v5

    .line 206
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v6

    const v7, 0x70726f6a

    if-ne v6, v7, :cond_57

    .line 207
    iget-object v6, v0, Ld0/p;->a:[B

    add-int/2addr v5, v15

    .line 208
    invoke-static {v6, v15, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    move-object/from16 v22, v5

    goto :goto_40

    :cond_57
    add-int/2addr v15, v5

    goto :goto_3f

    :cond_58
    move-object/from16 v22, v4

    :goto_40
    move/from16 v15, v25

    move-object/from16 v13, v29

    goto/16 :goto_38

    :cond_59
    const v6, 0x73743364

    if-ne v15, v6, :cond_5f

    .line 209
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v5

    const/4 v6, 0x3

    .line 210
    invoke-virtual {v0, v6}, Ld0/p;->I(I)V

    if-nez v5, :cond_5e

    .line 211
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v5

    if-eqz v5, :cond_5d

    const/4 v7, 0x1

    if-eq v5, v7, :cond_5c

    const/4 v8, 0x2

    if-eq v5, v8, :cond_5b

    if-eq v5, v6, :cond_5a

    goto :goto_41

    :cond_5a
    move v3, v6

    goto :goto_41

    :cond_5b
    const/4 v3, 0x2

    goto :goto_41

    :cond_5c
    move v3, v7

    goto :goto_41

    :cond_5d
    const/4 v7, 0x1

    const/4 v3, 0x0

    goto :goto_41

    :cond_5e
    const/4 v7, 0x1

    :goto_41
    move/from16 v15, v25

    move-object/from16 v13, v29

    goto/16 :goto_39

    :cond_5f
    const/4 v6, 0x3

    const/4 v7, 0x1

    const v8, 0x636f6c72

    if-ne v15, v8, :cond_65

    const/4 v8, -0x1

    if-ne v2, v8, :cond_61

    if-ne v12, v8, :cond_61

    .line 212
    invoke-virtual/range {p0 .. p0}, Ld0/p;->i()I

    move-result v11

    const v13, 0x6e636c78

    if-eq v11, v13, :cond_62

    const v13, 0x6e636c63

    if-ne v11, v13, :cond_60

    goto :goto_43

    .line 213
    :cond_60
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Unsupported color type: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v11}, Le0/d;->c(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v11}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    :cond_61
    :goto_42
    const/4 v11, 0x2

    goto :goto_46

    .line 214
    :cond_62
    :goto_43
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v2

    .line 215
    invoke-virtual/range {p0 .. p0}, Ld0/p;->B()I

    move-result v5

    const/4 v11, 0x2

    .line 216
    invoke-virtual {v0, v11}, Ld0/p;->I(I)V

    const/16 v12, 0x13

    if-ne v9, v12, :cond_63

    .line 217
    invoke-virtual/range {p0 .. p0}, Ld0/p;->v()I

    move-result v12

    and-int/lit16 v12, v12, 0x80

    if-eqz v12, :cond_63

    move v12, v7

    goto :goto_44

    :cond_63
    const/4 v12, 0x0

    .line 218
    :goto_44
    invoke-static {v2}, La0/g;->f(I)I

    move-result v2

    if-eqz v12, :cond_64

    move v12, v7

    goto :goto_45

    :cond_64
    move v12, v11

    .line 219
    :goto_45
    invoke-static {v5}, La0/g;->g(I)I

    move-result v5

    move-object/from16 v20, p8

    move/from16 v15, v25

    move-object/from16 v13, v29

    move/from16 v25, v2

    move/from16 v29, v26

    move/from16 v26, v12

    move v12, v5

    goto :goto_48

    :cond_65
    const/4 v8, -0x1

    goto :goto_42

    :cond_66
    :goto_46
    move/from16 v15, v25

    move-object/from16 v13, v29

    goto/16 :goto_3a

    .line 220
    :goto_47
    invoke-static/range {p0 .. p0}, LF0/p;->e(Ld0/p;)LF0/p;

    move-result-object v5

    if-eqz v5, :cond_66

    .line 221
    iget-object v5, v5, LF0/p;->m:Ljava/lang/String;

    const-string v10, "video/dolby-vision"

    move-object/from16 v21, v5

    goto :goto_46

    :goto_48
    add-int v2, v33, v9

    move/from16 v1, p2

    move-object/from16 v4, p7

    move v8, v2

    move/from16 v11, v23

    move/from16 v6, v28

    move/from16 v5, v32

    move/from16 v2, p3

    move/from16 v23, v3

    move/from16 v28, v15

    move-object/from16 v3, v27

    move/from16 v27, v12

    move-object/from16 v12, p6

    goto/16 :goto_2

    :goto_49
    if-nez v10, :cond_67

    return-void

    .line 222
    :cond_67
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 223
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->a:Ljava/lang/String;

    .line 224
    invoke-static {v10}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, La0/o;->m:Ljava/lang/String;

    move-object/from16 v7, v21

    .line 225
    iput-object v7, v0, La0/o;->j:Ljava/lang/String;

    move/from16 v1, v32

    .line 226
    iput v1, v0, La0/o;->t:I

    move/from16 v1, v28

    .line 227
    iput v1, v0, La0/o;->u:I

    move/from16 v1, v19

    .line 228
    iput v1, v0, La0/o;->x:F

    move/from16 v1, p5

    .line 229
    iput v1, v0, La0/o;->w:I

    move-object/from16 v7, v22

    .line 230
    iput-object v7, v0, La0/o;->y:[B

    .line 231
    iput v3, v0, La0/o;->z:I

    move-object/from16 v7, p8

    .line 232
    iput-object v7, v0, La0/o;->p:Ljava/util/List;

    move/from16 v14, v24

    .line 233
    iput v14, v0, La0/o;->o:I

    move-object/from16 v3, v27

    .line 234
    iput-object v3, v0, La0/o;->q:La0/l;

    if-eqz v18, :cond_68

    .line 235
    invoke-virtual/range {v18 .. v18}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    goto :goto_4a

    :cond_68
    move-object v7, v4

    .line 236
    :goto_4a
    new-instance v1, La0/g;

    move-object/from16 p0, v1

    move/from16 p1, v2

    move/from16 p2, v20

    move/from16 p3, v12

    move/from16 p4, v25

    move/from16 p5, v26

    move-object/from16 p6, v7

    invoke-direct/range {p0 .. p6}, La0/g;-><init>(IIIII[B)V

    .line 237
    iput-object v1, v0, La0/o;->A:La0/g;

    move-object/from16 v7, v30

    if-eqz v7, :cond_69

    .line 238
    iget-wide v1, v7, LZ0/b;->l:J

    invoke-static {v1, v2}, LQ1/C;->o0(J)I

    move-result v1

    .line 239
    iput v1, v0, La0/o;->h:I

    .line 240
    iget-wide v1, v7, LZ0/b;->m:J

    invoke-static {v1, v2}, LQ1/C;->o0(J)I

    move-result v1

    .line 241
    iput v1, v0, La0/o;->i:I

    .line 242
    :cond_69
    new-instance v1, La0/p;

    invoke-direct {v1, v0}, La0/p;-><init>(La0/o;)V

    move-object/from16 v0, p7

    .line 243
    iput-object v1, v0, LZ0/e;->d:Ljava/lang/Object;

    return-void
.end method
