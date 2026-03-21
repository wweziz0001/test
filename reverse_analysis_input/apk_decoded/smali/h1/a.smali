.class public final Lh1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/l;


# static fields
.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;


# instance fields
.field public final l:Ljava/lang/StringBuilder;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ld0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lh1/a;->o:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\{\\\\.*?\\}"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lh1/a;->p:Ljava/util/regex/Pattern;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh1/a;->l:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh1/a;->m:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ld0/p;

    .line 19
    .line 20
    invoke-direct {v0}, Ld0/p;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lh1/a;->n:Ld0/p;

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
.end method

.method public static a(Landroid/text/Spanned;Ljava/lang/String;)Lc0/b;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/16 v17, 0x0

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const v13, -0x800001

    .line 7
    .line 8
    .line 9
    const/high16 v16, -0x80000000

    .line 10
    .line 11
    const/4 v14, 0x0

    .line 12
    const/high16 v15, -0x1000000

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v18, Lc0/b;

    .line 17
    .line 18
    move-object/from16 v0, v18

    .line 19
    .line 20
    move-object/from16 v1, p0

    .line 21
    .line 22
    move-object v2, v4

    .line 23
    move-object v3, v4

    .line 24
    move v5, v13

    .line 25
    move/from16 v6, v16

    .line 26
    .line 27
    move/from16 v7, v16

    .line 28
    .line 29
    move v8, v13

    .line 30
    move/from16 v9, v16

    .line 31
    .line 32
    move/from16 v10, v16

    .line 33
    .line 34
    move v11, v13

    .line 35
    move v12, v13

    .line 36
    invoke-direct/range {v0 .. v17}, Lc0/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 37
    .line 38
    .line 39
    return-object v18

    .line 40
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x2

    .line 45
    const/4 v3, 0x1

    .line 46
    const-string v5, "{\\an1}"

    .line 47
    .line 48
    const-string v7, "{\\an2}"

    .line 49
    .line 50
    const-string v8, "{\\an3}"

    .line 51
    .line 52
    const-string v9, "{\\an4}"

    .line 53
    .line 54
    const-string v11, "{\\an5}"

    .line 55
    .line 56
    const-string v12, "{\\an6}"

    .line 57
    .line 58
    const-string v6, "{\\an7}"

    .line 59
    .line 60
    const/16 v19, 0x8

    .line 61
    .line 62
    const-string v10, "{\\an8}"

    .line 63
    .line 64
    const-string v15, "{\\an9}"

    .line 65
    .line 66
    const/16 v20, -0x1

    .line 67
    .line 68
    const/16 v21, 0x0

    .line 69
    .line 70
    const/4 v14, 0x3

    .line 71
    const/4 v13, 0x4

    .line 72
    const/4 v4, 0x5

    .line 73
    sparse-switch v1, :sswitch_data_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :sswitch_0
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    move v1, v4

    .line 84
    goto :goto_1

    .line 85
    :sswitch_1
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    move/from16 v1, v19

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :sswitch_2
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    move v1, v2

    .line 101
    goto :goto_1

    .line 102
    :sswitch_3
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    move v1, v13

    .line 109
    goto :goto_1

    .line 110
    :sswitch_4
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    const/4 v1, 0x7

    .line 117
    goto :goto_1

    .line 118
    :sswitch_5
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_1

    .line 123
    .line 124
    move v1, v3

    .line 125
    goto :goto_1

    .line 126
    :sswitch_6
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    move v1, v14

    .line 133
    goto :goto_1

    .line 134
    :sswitch_7
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_1

    .line 139
    .line 140
    const/4 v1, 0x6

    .line 141
    goto :goto_1

    .line 142
    :sswitch_8
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_1

    .line 147
    .line 148
    move/from16 v1, v21

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    :goto_0
    move/from16 v1, v20

    .line 152
    .line 153
    :goto_1
    if-eqz v1, :cond_3

    .line 154
    .line 155
    if-eq v1, v3, :cond_3

    .line 156
    .line 157
    if-eq v1, v2, :cond_3

    .line 158
    .line 159
    if-eq v1, v14, :cond_2

    .line 160
    .line 161
    if-eq v1, v13, :cond_2

    .line 162
    .line 163
    if-eq v1, v4, :cond_2

    .line 164
    .line 165
    move v1, v3

    .line 166
    goto :goto_2

    .line 167
    :cond_2
    move v1, v2

    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move/from16 v1, v21

    .line 170
    .line 171
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    .line 172
    .line 173
    .line 174
    move-result v22

    .line 175
    sparse-switch v22, :sswitch_data_1

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :sswitch_9
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_4

    .line 184
    .line 185
    move v6, v4

    .line 186
    goto :goto_4

    .line 187
    :sswitch_a
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_4

    .line 192
    .line 193
    move v6, v13

    .line 194
    goto :goto_4

    .line 195
    :sswitch_b
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    move v6, v14

    .line 202
    goto :goto_4

    .line 203
    :sswitch_c
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_4

    .line 208
    .line 209
    move/from16 v6, v19

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :sswitch_d
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_4

    .line 217
    .line 218
    const/4 v6, 0x7

    .line 219
    goto :goto_4

    .line 220
    :sswitch_e
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_4

    .line 225
    .line 226
    const/4 v6, 0x6

    .line 227
    goto :goto_4

    .line 228
    :sswitch_f
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_4

    .line 233
    .line 234
    move v6, v2

    .line 235
    goto :goto_4

    .line 236
    :sswitch_10
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_4

    .line 241
    .line 242
    move v6, v3

    .line 243
    goto :goto_4

    .line 244
    :sswitch_11
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_4

    .line 249
    .line 250
    move/from16 v6, v21

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_4
    :goto_3
    move/from16 v6, v20

    .line 254
    .line 255
    :goto_4
    if-eqz v6, :cond_6

    .line 256
    .line 257
    if-eq v6, v3, :cond_6

    .line 258
    .line 259
    if-eq v6, v2, :cond_6

    .line 260
    .line 261
    if-eq v6, v14, :cond_5

    .line 262
    .line 263
    if-eq v6, v13, :cond_5

    .line 264
    .line 265
    if-eq v6, v4, :cond_5

    .line 266
    .line 267
    move v7, v3

    .line 268
    goto :goto_5

    .line 269
    :cond_5
    move/from16 v7, v21

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_6
    move v7, v2

    .line 273
    :goto_5
    const v0, 0x3da3d70a    # 0.08f

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x3f000000    # 0.5f

    .line 277
    .line 278
    const v5, 0x3f6b851f    # 0.92f

    .line 279
    .line 280
    .line 281
    if-eqz v1, :cond_9

    .line 282
    .line 283
    if-eq v1, v3, :cond_8

    .line 284
    .line 285
    if-ne v1, v2, :cond_7

    .line 286
    .line 287
    move v8, v5

    .line 288
    goto :goto_6

    .line 289
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 290
    .line 291
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_8
    move v8, v4

    .line 296
    goto :goto_6

    .line 297
    :cond_9
    move v8, v0

    .line 298
    :goto_6
    if-eqz v7, :cond_c

    .line 299
    .line 300
    if-eq v7, v3, :cond_b

    .line 301
    .line 302
    if-ne v7, v2, :cond_a

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 306
    .line 307
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_b
    move v5, v4

    .line 312
    goto :goto_7

    .line 313
    :cond_c
    move v5, v0

    .line 314
    :goto_7
    new-instance v18, Lc0/b;

    .line 315
    .line 316
    move-object/from16 v0, v18

    .line 317
    .line 318
    const/4 v6, 0x0

    .line 319
    move/from16 v21, v1

    .line 320
    .line 321
    move-object/from16 v1, p0

    .line 322
    .line 323
    const/4 v4, 0x0

    .line 324
    move-object v2, v4

    .line 325
    move-object v3, v4

    .line 326
    move/from16 v9, v21

    .line 327
    .line 328
    move/from16 v10, v16

    .line 329
    .line 330
    const v13, -0x800001

    .line 331
    .line 332
    .line 333
    move v11, v13

    .line 334
    move v12, v13

    .line 335
    const/4 v14, 0x0

    .line 336
    const/high16 v15, -0x1000000

    .line 337
    .line 338
    invoke-direct/range {v0 .. v17}, Lc0/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 339
    .line 340
    .line 341
    return-object v18

    .line 342
    nop

    .line 343
    :sswitch_data_0
    .sparse-switch
        -0x28ddbde6 -> :sswitch_8
        -0x28ddbdc7 -> :sswitch_7
        -0x28ddbda8 -> :sswitch_6
        -0x28ddbd89 -> :sswitch_5
        -0x28ddbd6a -> :sswitch_4
        -0x28ddbd4b -> :sswitch_3
        -0x28ddbd2c -> :sswitch_2
        -0x28ddbd0d -> :sswitch_1
        -0x28ddbcee -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x28ddbde6 -> :sswitch_11
        -0x28ddbdc7 -> :sswitch_10
        -0x28ddbda8 -> :sswitch_f
        -0x28ddbd89 -> :sswitch_e
        -0x28ddbd6a -> :sswitch_d
        -0x28ddbd4b -> :sswitch_c
        -0x28ddbd2c -> :sswitch_b
        -0x28ddbd0d -> :sswitch_a
        -0x28ddbcee -> :sswitch_9
    .end sparse-switch
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

.method public static b(Ljava/util/regex/Matcher;I)J
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/32 v2, 0x36ee80

    .line 14
    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, p1, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/32 v4, 0xea60

    .line 34
    .line 35
    .line 36
    mul-long/2addr v2, v4

    .line 37
    add-long/2addr v2, v0

    .line 38
    add-int/lit8 v0, p1, 0x3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v4, 0x3e8

    .line 52
    .line 53
    mul-long/2addr v0, v4

    .line 54
    add-long/2addr v0, v2

    .line 55
    add-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    add-long/2addr v0, p0

    .line 68
    :cond_1
    mul-long/2addr v0, v4

    .line 69
    return-wide v0
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
.method public final o()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public final x([BIILc1/k;Ld0/d;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "SubripParser"

    .line 10
    .line 11
    add-int v5, v1, p3

    .line 12
    .line 13
    iget-object v6, v0, Lh1/a;->n:Ld0/p;

    .line 14
    .line 15
    move-object/from16 v7, p1

    .line 16
    .line 17
    invoke-virtual {v6, v5, v7}, Ld0/p;->F(I[B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v1}, Ld0/p;->H(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v6}, Ld0/p;->D()Ljava/nio/charset/Charset;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    :goto_0
    iget-wide v7, v2, Lc1/k;->a:J

    .line 33
    .line 34
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmp-long v5, v7, v9

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    iget-boolean v2, v2, Lc1/k;->b:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v2, 0x0

    .line 54
    :goto_1
    invoke-virtual {v6, v1}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    if-nez v12, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v1}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-nez v5, :cond_4

    .line 75
    .line 76
    const-string v1, "Unexpected end"

    .line 77
    .line 78
    invoke-static {v4, v1}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    move-object v0, v3

    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_4
    sget-object v12, Lh1/a;->o:Ljava/util/regex/Pattern;

    .line 85
    .line 86
    invoke-virtual {v12, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eqz v13, :cond_d

    .line 95
    .line 96
    const/4 v5, 0x1

    .line 97
    invoke-static {v12, v5}, Lh1/a;->b(Ljava/util/regex/Matcher;I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v15

    .line 101
    const/4 v5, 0x6

    .line 102
    invoke-static {v12, v5}, Lh1/a;->b(Ljava/util/regex/Matcher;I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    iget-object v5, v0, Lh1/a;->l:Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 110
    .line 111
    .line 112
    iget-object v11, v0, Lh1/a;->m:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v1}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    :goto_2
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v18

    .line 125
    if-nez v18, :cond_7

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 128
    .line 129
    .line 130
    move-result v18

    .line 131
    if-lez v18, :cond_5

    .line 132
    .line 133
    const-string v14, "<br>"

    .line 134
    .line 135
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    new-instance v9, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v9, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sget-object v10, Lh1/a;->p:Ljava/util/regex/Pattern;

    .line 148
    .line 149
    invoke-virtual {v10, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const/4 v14, 0x0

    .line 154
    :goto_3
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    .line 155
    .line 156
    .line 157
    move-result v17

    .line 158
    if-eqz v17, :cond_6

    .line 159
    .line 160
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->start()I

    .line 168
    .line 169
    .line 170
    move-result v17

    .line 171
    move-object/from16 p3, v10

    .line 172
    .line 173
    sub-int v10, v17, v14

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    move-object/from16 v19, v4

    .line 180
    .line 181
    add-int v4, v10, v0

    .line 182
    .line 183
    const-string v3, ""

    .line 184
    .line 185
    invoke-virtual {v9, v10, v4, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    add-int/2addr v14, v0

    .line 189
    move-object/from16 v0, p0

    .line 190
    .line 191
    move-object/from16 v10, p3

    .line 192
    .line 193
    move-object/from16 v3, p5

    .line 194
    .line 195
    move-object/from16 v4, v19

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    move-object/from16 v19, v4

    .line 199
    .line 200
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6, v1}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v17

    .line 211
    move-object/from16 v0, p0

    .line 212
    .line 213
    move-object/from16 v3, p5

    .line 214
    .line 215
    move-object/from16 v4, v19

    .line 216
    .line 217
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    goto :goto_2

    .line 224
    :cond_7
    move-object/from16 v19, v4

    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const/4 v14, 0x0

    .line 235
    :goto_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-ge v14, v3, :cond_9

    .line 240
    .line 241
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Ljava/lang/String;

    .line 246
    .line 247
    const-string v4, "\\{\\\\an[1-9]\\}"

    .line 248
    .line 249
    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_8

    .line 254
    .line 255
    :goto_5
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_8
    add-int/lit8 v14, v14, 0x1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_9
    const/4 v3, 0x0

    .line 265
    goto :goto_5

    .line 266
    :goto_6
    cmp-long v4, v7, v9

    .line 267
    .line 268
    if-eqz v4, :cond_c

    .line 269
    .line 270
    cmp-long v4, v15, v7

    .line 271
    .line 272
    if-ltz v4, :cond_a

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_a
    if-eqz v2, :cond_b

    .line 276
    .line 277
    new-instance v4, Lc1/a;

    .line 278
    .line 279
    invoke-static {v0, v3}, Lh1/a;->a(Landroid/text/Spanned;Ljava/lang/String;)Lc0/b;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    sub-long v17, v12, v15

    .line 288
    .line 289
    move-object v13, v4

    .line 290
    invoke-direct/range {v13 .. v18}, Lc1/a;-><init>(Ljava/util/List;JJ)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    :cond_b
    move-object/from16 v0, p5

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_c
    :goto_7
    new-instance v4, Lc1/a;

    .line 300
    .line 301
    invoke-static {v0, v3}, Lh1/a;->a(Landroid/text/Spanned;Ljava/lang/String;)Lc0/b;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    sub-long v17, v12, v15

    .line 310
    .line 311
    move-object v13, v4

    .line 312
    invoke-direct/range {v13 .. v18}, Lc1/a;-><init>(Ljava/util/List;JJ)V

    .line 313
    .line 314
    .line 315
    move-object/from16 v0, p5

    .line 316
    .line 317
    invoke-interface {v0, v4}, Ld0/d;->accept(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :goto_8
    move-object v3, v0

    .line 321
    move-object/from16 v4, v19

    .line 322
    .line 323
    :goto_9
    move-object/from16 v0, p0

    .line 324
    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_d
    move-object v0, v3

    .line 328
    move-object/from16 v19, v4

    .line 329
    .line 330
    const-string v3, "Skipping invalid timing: "

    .line 331
    .line 332
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {v4, v3}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :goto_a
    move-object v3, v0

    .line 340
    goto :goto_9

    .line 341
    :catch_0
    move-object v0, v3

    .line 342
    const-string v3, "Skipping invalid index: "

    .line 343
    .line 344
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-static {v4, v3}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    goto :goto_a

    .line 352
    :goto_b
    if-eqz v2, :cond_e

    .line 353
    .line 354
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    if-eqz v2, :cond_e

    .line 363
    .line 364
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Lc1/a;

    .line 369
    .line 370
    invoke-interface {v0, v2}, Ld0/d;->accept(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_e
    return-void
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
