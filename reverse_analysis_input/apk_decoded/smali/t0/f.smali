.class public final Lt0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:Lu0/i;

.field public final b:Ld0/p;

.field public final c:Ld0/p;

.field public final d:I

.field public final e:Ljava/lang/Object;

.field public final f:Lm3/c;

.field public g:LF0/s;

.field public h:Z

.field public volatile i:J

.field public volatile j:I

.field public k:Z

.field public l:J

.field public m:J


# direct methods
.method public constructor <init>(Lt0/j;I)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p2, p0, Lt0/f;->d:I

    .line 8
    .line 9
    iget-object p2, p1, Lt0/j;->c:La0/p;

    .line 10
    .line 11
    iget-object p2, p2, La0/p;->n:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sparse-switch v3, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    :goto_0
    move p2, v0

    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :sswitch_0
    const-string v3, "audio/g711-mlaw"

    .line 27
    .line 28
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 p2, 0xd

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :sswitch_1
    const-string v3, "audio/g711-alaw"

    .line 40
    .line 41
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/16 p2, 0xc

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :sswitch_2
    const-string v3, "video/x-vnd.on2.vp9"

    .line 53
    .line 54
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/16 p2, 0xb

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :sswitch_3
    const-string v3, "video/x-vnd.on2.vp8"

    .line 66
    .line 67
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/16 p2, 0xa

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :sswitch_4
    const-string v3, "audio/opus"

    .line 79
    .line 80
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/16 p2, 0x9

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :sswitch_5
    const-string v3, "audio/3gpp"

    .line 92
    .line 93
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-nez p2, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    const/16 p2, 0x8

    .line 101
    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :sswitch_6
    const-string v3, "video/avc"

    .line 105
    .line 106
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    const/4 p2, 0x7

    .line 114
    goto :goto_1

    .line 115
    :sswitch_7
    const-string v3, "video/mp4v-es"

    .line 116
    .line 117
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-nez p2, :cond_7

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    const/4 p2, 0x6

    .line 125
    goto :goto_1

    .line 126
    :sswitch_8
    const-string v3, "audio/raw"

    .line 127
    .line 128
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    const/4 p2, 0x5

    .line 136
    goto :goto_1

    .line 137
    :sswitch_9
    const-string v3, "audio/ac3"

    .line 138
    .line 139
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_9

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_9
    const/4 p2, 0x4

    .line 147
    goto :goto_1

    .line 148
    :sswitch_a
    const-string v3, "audio/mp4a-latm"

    .line 149
    .line 150
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    if-nez p2, :cond_a

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_a
    const/4 p2, 0x3

    .line 159
    goto :goto_1

    .line 160
    :sswitch_b
    const-string v3, "audio/amr-wb"

    .line 161
    .line 162
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-nez p2, :cond_b

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_b
    const/4 p2, 0x2

    .line 171
    goto :goto_1

    .line 172
    :sswitch_c
    const-string v3, "video/hevc"

    .line 173
    .line 174
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-nez p2, :cond_c

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_c
    move p2, v1

    .line 183
    goto :goto_1

    .line 184
    :sswitch_d
    const-string v3, "video/3gpp"

    .line 185
    .line 186
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    if-nez p2, :cond_d

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_d
    move p2, v2

    .line 195
    :goto_1
    packed-switch p2, :pswitch_data_0

    .line 196
    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    goto :goto_3

    .line 200
    :pswitch_0
    new-instance p2, Lu0/d;

    .line 201
    .line 202
    invoke-direct {p2, p1, v1}, Lu0/d;-><init>(Lt0/j;I)V

    .line 203
    .line 204
    .line 205
    :goto_2
    move-object p1, p2

    .line 206
    goto :goto_3

    .line 207
    :pswitch_1
    new-instance p2, Lu0/k;

    .line 208
    .line 209
    invoke-direct {p2, p1}, Lu0/k;-><init>(Lt0/j;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :pswitch_2
    new-instance p2, Lu0/h;

    .line 214
    .line 215
    invoke-direct {p2, p1}, Lu0/h;-><init>(Lt0/j;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :pswitch_3
    new-instance p2, Lu0/e;

    .line 220
    .line 221
    invoke-direct {p2, p1, v2}, Lu0/e;-><init>(Lt0/j;I)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :pswitch_4
    new-instance p2, Lu0/g;

    .line 226
    .line 227
    invoke-direct {p2, p1}, Lu0/g;-><init>(Lt0/j;)V

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :pswitch_5
    new-instance p2, Lu0/j;

    .line 232
    .line 233
    invoke-direct {p2, p1}, Lu0/j;-><init>(Lt0/j;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :pswitch_6
    new-instance p2, Lu0/b;

    .line 238
    .line 239
    invoke-direct {p2, p1}, Lu0/b;-><init>(Lt0/j;)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :pswitch_7
    iget-object p2, p1, Lt0/j;->e:Ljava/lang/String;

    .line 244
    .line 245
    const-string v1, "MP4A-LATM"

    .line 246
    .line 247
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p2

    .line 251
    if-eqz p2, :cond_e

    .line 252
    .line 253
    new-instance p2, Lu0/f;

    .line 254
    .line 255
    invoke-direct {p2, p1}, Lu0/f;-><init>(Lt0/j;)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_e
    new-instance p2, Lu0/a;

    .line 260
    .line 261
    invoke-direct {p2, p1}, Lu0/a;-><init>(Lt0/j;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :pswitch_8
    new-instance p2, Lu0/c;

    .line 266
    .line 267
    invoke-direct {p2, p1}, Lu0/c;-><init>(Lt0/j;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :pswitch_9
    new-instance p2, Lu0/e;

    .line 272
    .line 273
    invoke-direct {p2, p1, v1}, Lu0/e;-><init>(Lt0/j;I)V

    .line 274
    .line 275
    .line 276
    goto :goto_2

    .line 277
    :pswitch_a
    new-instance p2, Lu0/d;

    .line 278
    .line 279
    invoke-direct {p2, p1, v2}, Lu0/d;-><init>(Lt0/j;I)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iput-object p1, p0, Lt0/f;->a:Lu0/i;

    .line 287
    .line 288
    new-instance p1, Ld0/p;

    .line 289
    .line 290
    const p2, 0xffe3

    .line 291
    .line 292
    .line 293
    invoke-direct {p1, p2}, Ld0/p;-><init>(I)V

    .line 294
    .line 295
    .line 296
    iput-object p1, p0, Lt0/f;->b:Ld0/p;

    .line 297
    .line 298
    new-instance p1, Ld0/p;

    .line 299
    .line 300
    invoke-direct {p1}, Ld0/p;-><init>()V

    .line 301
    .line 302
    .line 303
    iput-object p1, p0, Lt0/f;->c:Ld0/p;

    .line 304
    .line 305
    new-instance p1, Ljava/lang/Object;

    .line 306
    .line 307
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 308
    .line 309
    .line 310
    iput-object p1, p0, Lt0/f;->e:Ljava/lang/Object;

    .line 311
    .line 312
    new-instance p1, Lm3/c;

    .line 313
    .line 314
    invoke-direct {p1}, Lm3/c;-><init>()V

    .line 315
    .line 316
    .line 317
    iput-object p1, p0, Lt0/f;->f:Lm3/c;

    .line 318
    .line 319
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    iput-wide p1, p0, Lt0/f;->i:J

    .line 325
    .line 326
    iput v0, p0, Lt0/f;->j:I

    .line 327
    .line 328
    iput-wide p1, p0, Lt0/f;->l:J

    .line 329
    .line 330
    iput-wide p1, p0, Lt0/f;->m:J

    .line 331
    .line 332
    return-void

    .line 333
    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_d
        -0x63185e82 -> :sswitch_c
        -0x5fc6f775 -> :sswitch_b
        -0x3313c2e -> :sswitch_a
        0xb269698 -> :sswitch_9
        0xb26d66f -> :sswitch_8
        0x46cdc642 -> :sswitch_7
        0x4f62373a -> :sswitch_6
        0x59976a2d -> :sswitch_5
        0x59b2d2d8 -> :sswitch_4
        0x5f50bed8 -> :sswitch_3
        0x5f50bed9 -> :sswitch_2
        0x71710385 -> :sswitch_1
        0x717677f9 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_5
    .end packed-switch
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


# virtual methods
.method public final b(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lt0/f;->k:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lt0/f;->k:Z

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iput-wide p1, p0, Lt0/f;->l:J

    .line 15
    .line 16
    iput-wide p3, p0, Lt0/f;->m:J

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
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
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lt0/f;->g:LF0/s;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lt0/f;->b:Ld0/p;

    .line 9
    .line 10
    iget-object v0, v0, Ld0/p;->a:[B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const v3, 0xffe3

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    invoke-interface {v4, v0, v2, v3}, La0/h;->read([BII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v3, -0x1

    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    return v3

    .line 26
    :cond_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    iget-object v4, v1, Lt0/f;->b:Ld0/p;

    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ld0/p;->H(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v1, Lt0/f;->b:Ld0/p;

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ld0/p;->G(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v1, Lt0/f;->b:Ld0/p;

    .line 40
    .line 41
    invoke-virtual {v0}, Ld0/p;->a()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, 0x1

    .line 46
    const/16 v6, 0xc

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    if-ge v4, v6, :cond_2

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_2
    invoke-virtual {v0}, Ld0/p;->v()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    shr-int/lit8 v6, v4, 0x6

    .line 58
    .line 59
    int-to-byte v6, v6

    .line 60
    and-int/lit8 v8, v4, 0xf

    .line 61
    .line 62
    int-to-byte v8, v8

    .line 63
    const/4 v9, 0x4

    .line 64
    shr-int/2addr v4, v9

    .line 65
    and-int/2addr v4, v5

    .line 66
    if-ne v4, v5, :cond_3

    .line 67
    .line 68
    move v4, v5

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move v4, v2

    .line 71
    :goto_0
    const/4 v10, 0x2

    .line 72
    if-eq v6, v10, :cond_4

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v0}, Ld0/p;->v()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    shr-int/lit8 v7, v6, 0x7

    .line 81
    .line 82
    and-int/2addr v7, v5

    .line 83
    if-ne v7, v5, :cond_5

    .line 84
    .line 85
    move v7, v5

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    move v7, v2

    .line 88
    :goto_1
    and-int/lit8 v6, v6, 0x7f

    .line 89
    .line 90
    int-to-byte v6, v6

    .line 91
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    invoke-virtual {v0}, Ld0/p;->x()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    invoke-virtual {v0}, Ld0/p;->i()I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    sget-object v15, Lt0/h;->g:[B

    .line 104
    .line 105
    if-lez v8, :cond_6

    .line 106
    .line 107
    mul-int/lit8 v3, v8, 0x4

    .line 108
    .line 109
    new-array v3, v3, [B

    .line 110
    .line 111
    move v5, v2

    .line 112
    :goto_2
    if-ge v5, v8, :cond_7

    .line 113
    .line 114
    mul-int/lit8 v2, v5, 0x4

    .line 115
    .line 116
    invoke-virtual {v0, v3, v2, v9}, Ld0/p;->g([BII)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    move-object v3, v15

    .line 124
    :cond_7
    if-eqz v4, :cond_8

    .line 125
    .line 126
    invoke-virtual {v0, v10}, Ld0/p;->I(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ld0/p;->s()S

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_8

    .line 134
    .line 135
    mul-int/2addr v2, v9

    .line 136
    invoke-virtual {v0, v2}, Ld0/p;->I(I)V

    .line 137
    .line 138
    .line 139
    :cond_8
    invoke-virtual {v0}, Ld0/p;->a()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    new-array v2, v2, [B

    .line 144
    .line 145
    invoke-virtual {v0}, Ld0/p;->a()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-virtual {v0, v2, v5, v4}, Ld0/p;->g([BII)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lt0/g;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v15, v0, Lt0/g;->f:[B

    .line 159
    .line 160
    iput-object v15, v0, Lt0/g;->g:[B

    .line 161
    .line 162
    iput-boolean v7, v0, Lt0/g;->a:Z

    .line 163
    .line 164
    iput-byte v6, v0, Lt0/g;->b:B

    .line 165
    .line 166
    const v4, 0xffff

    .line 167
    .line 168
    .line 169
    if-ltz v11, :cond_9

    .line 170
    .line 171
    if-gt v11, v4, :cond_9

    .line 172
    .line 173
    const/4 v5, 0x1

    .line 174
    goto :goto_3

    .line 175
    :cond_9
    const/4 v5, 0x0

    .line 176
    :goto_3
    invoke-static {v5}, Ld0/m;->c(Z)V

    .line 177
    .line 178
    .line 179
    and-int/2addr v4, v11

    .line 180
    iput v4, v0, Lt0/g;->c:I

    .line 181
    .line 182
    iput-wide v12, v0, Lt0/g;->d:J

    .line 183
    .line 184
    iput v14, v0, Lt0/g;->e:I

    .line 185
    .line 186
    iput-object v3, v0, Lt0/g;->f:[B

    .line 187
    .line 188
    iput-object v2, v0, Lt0/g;->g:[B

    .line 189
    .line 190
    new-instance v7, Lt0/h;

    .line 191
    .line 192
    invoke-direct {v7, v0}, Lt0/h;-><init>(Lt0/g;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    if-nez v7, :cond_a

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    return v0

    .line 199
    :cond_a
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 200
    .line 201
    .line 202
    move-result-wide v2

    .line 203
    const-wide/16 v4, 0x1e

    .line 204
    .line 205
    sub-long v4, v2, v4

    .line 206
    .line 207
    iget-object v6, v1, Lt0/f;->f:Lm3/c;

    .line 208
    .line 209
    monitor-enter v6

    .line 210
    :try_start_0
    iget-object v0, v6, Lm3/c;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Ljava/util/TreeSet;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const/16 v8, 0x1388

    .line 219
    .line 220
    if-ge v0, v8, :cond_14

    .line 221
    .line 222
    iget v0, v7, Lt0/h;->c:I

    .line 223
    .line 224
    iget-boolean v8, v6, Lm3/c;->c:Z

    .line 225
    .line 226
    if-nez v8, :cond_b

    .line 227
    .line 228
    invoke-virtual {v6}, Lm3/c;->d()V

    .line 229
    .line 230
    .line 231
    const/4 v8, 0x1

    .line 232
    sub-int/2addr v0, v8

    .line 233
    invoke-static {v0}, La/a;->A(I)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    iput v0, v6, Lm3/c;->b:I

    .line 238
    .line 239
    iput-boolean v8, v6, Lm3/c;->c:Z

    .line 240
    .line 241
    new-instance v0, Lt0/i;

    .line 242
    .line 243
    invoke-direct {v0, v7, v2, v3}, Lt0/i;-><init>(Lt0/h;J)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6, v0}, Lm3/c;->a(Lt0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    .line 248
    .line 249
    monitor-exit v6

    .line 250
    goto :goto_5

    .line 251
    :catchall_0
    move-exception v0

    .line 252
    goto/16 :goto_8

    .line 253
    .line 254
    :cond_b
    :try_start_1
    iget v8, v6, Lm3/c;->a:I

    .line 255
    .line 256
    invoke-static {v8}, Lt0/h;->a(I)I

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    invoke-static {v0, v8}, Lm3/c;->b(II)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    const/16 v9, 0x3e8

    .line 269
    .line 270
    if-ge v8, v9, :cond_d

    .line 271
    .line 272
    iget v8, v6, Lm3/c;->b:I

    .line 273
    .line 274
    invoke-static {v0, v8}, Lm3/c;->b(II)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-lez v0, :cond_c

    .line 279
    .line 280
    new-instance v0, Lt0/i;

    .line 281
    .line 282
    invoke-direct {v0, v7, v2, v3}, Lt0/i;-><init>(Lt0/h;J)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6, v0}, Lm3/c;->a(Lt0/i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    .line 287
    .line 288
    monitor-exit v6

    .line 289
    goto :goto_5

    .line 290
    :cond_c
    monitor-exit v6

    .line 291
    goto :goto_5

    .line 292
    :cond_d
    const/4 v8, 0x1

    .line 293
    sub-int/2addr v0, v8

    .line 294
    :try_start_2
    invoke-static {v0}, La/a;->A(I)I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    iput v0, v6, Lm3/c;->b:I

    .line 299
    .line 300
    iget-object v0, v6, Lm3/c;->d:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Ljava/util/TreeSet;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lt0/i;

    .line 308
    .line 309
    invoke-direct {v0, v7, v2, v3}, Lt0/i;-><init>(Lt0/h;J)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v6, v0}, Lm3/c;->a(Lt0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 313
    .line 314
    .line 315
    monitor-exit v6

    .line 316
    :goto_5
    iget-object v0, v1, Lt0/f;->f:Lm3/c;

    .line 317
    .line 318
    invoke-virtual {v0, v4, v5}, Lm3/c;->c(J)Lt0/h;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-nez v0, :cond_e

    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    return v2

    .line 326
    :cond_e
    iget-boolean v2, v1, Lt0/f;->h:Z

    .line 327
    .line 328
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    if-nez v2, :cond_11

    .line 334
    .line 335
    iget-wide v2, v1, Lt0/f;->i:J

    .line 336
    .line 337
    cmp-long v2, v2, v6

    .line 338
    .line 339
    if-nez v2, :cond_f

    .line 340
    .line 341
    iget-wide v2, v0, Lt0/h;->d:J

    .line 342
    .line 343
    iput-wide v2, v1, Lt0/f;->i:J

    .line 344
    .line 345
    :cond_f
    iget v2, v1, Lt0/f;->j:I

    .line 346
    .line 347
    const/4 v3, -0x1

    .line 348
    if-ne v2, v3, :cond_10

    .line 349
    .line 350
    iget v2, v0, Lt0/h;->c:I

    .line 351
    .line 352
    iput v2, v1, Lt0/f;->j:I

    .line 353
    .line 354
    :cond_10
    iget-object v2, v1, Lt0/f;->a:Lu0/i;

    .line 355
    .line 356
    iget-wide v8, v1, Lt0/f;->i:J

    .line 357
    .line 358
    invoke-interface {v2, v8, v9}, Lu0/i;->c(J)V

    .line 359
    .line 360
    .line 361
    const/4 v2, 0x1

    .line 362
    iput-boolean v2, v1, Lt0/f;->h:Z

    .line 363
    .line 364
    :cond_11
    iget-object v2, v1, Lt0/f;->e:Ljava/lang/Object;

    .line 365
    .line 366
    monitor-enter v2

    .line 367
    :try_start_3
    iget-boolean v3, v1, Lt0/f;->k:Z

    .line 368
    .line 369
    if-eqz v3, :cond_12

    .line 370
    .line 371
    iget-wide v3, v1, Lt0/f;->l:J

    .line 372
    .line 373
    cmp-long v0, v3, v6

    .line 374
    .line 375
    if-eqz v0, :cond_13

    .line 376
    .line 377
    iget-wide v3, v1, Lt0/f;->m:J

    .line 378
    .line 379
    cmp-long v0, v3, v6

    .line 380
    .line 381
    if-eqz v0, :cond_13

    .line 382
    .line 383
    iget-object v0, v1, Lt0/f;->f:Lm3/c;

    .line 384
    .line 385
    invoke-virtual {v0}, Lm3/c;->d()V

    .line 386
    .line 387
    .line 388
    iget-object v0, v1, Lt0/f;->a:Lu0/i;

    .line 389
    .line 390
    iget-wide v3, v1, Lt0/f;->l:J

    .line 391
    .line 392
    iget-wide v8, v1, Lt0/f;->m:J

    .line 393
    .line 394
    invoke-interface {v0, v3, v4, v8, v9}, Lu0/i;->b(JJ)V

    .line 395
    .line 396
    .line 397
    const/4 v0, 0x0

    .line 398
    iput-boolean v0, v1, Lt0/f;->k:Z

    .line 399
    .line 400
    iput-wide v6, v1, Lt0/f;->l:J

    .line 401
    .line 402
    iput-wide v6, v1, Lt0/f;->m:J

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :catchall_1
    move-exception v0

    .line 406
    goto :goto_7

    .line 407
    :cond_12
    iget-object v3, v1, Lt0/f;->c:Ld0/p;

    .line 408
    .line 409
    iget-object v6, v0, Lt0/h;->f:[B

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    array-length v7, v6

    .line 415
    invoke-virtual {v3, v7, v6}, Ld0/p;->F(I[B)V

    .line 416
    .line 417
    .line 418
    iget-object v8, v1, Lt0/f;->a:Lu0/i;

    .line 419
    .line 420
    iget-object v9, v1, Lt0/f;->c:Ld0/p;

    .line 421
    .line 422
    iget-wide v10, v0, Lt0/h;->d:J

    .line 423
    .line 424
    iget v12, v0, Lt0/h;->c:I

    .line 425
    .line 426
    iget-boolean v13, v0, Lt0/h;->a:Z

    .line 427
    .line 428
    invoke-interface/range {v8 .. v13}, Lu0/i;->a(Ld0/p;JIZ)V

    .line 429
    .line 430
    .line 431
    iget-object v0, v1, Lt0/f;->f:Lm3/c;

    .line 432
    .line 433
    invoke-virtual {v0, v4, v5}, Lm3/c;->c(J)Lt0/h;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    if-nez v0, :cond_12

    .line 438
    .line 439
    :cond_13
    :goto_6
    monitor-exit v2

    .line 440
    const/4 v3, 0x0

    .line 441
    return v3

    .line 442
    :goto_7
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 443
    throw v0

    .line 444
    :cond_14
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 445
    .line 446
    const-string v2, "Queue size limit of 5000 reached."

    .line 447
    .line 448
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :goto_8
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 453
    throw v0
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
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "RTP packets are transmitted in a packet stream do not support sniffing."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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

.method public final j(LF0/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/f;->a:Lu0/i;

    .line 2
    .line 3
    iget v1, p0, Lt0/f;->d:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lu0/i;->d(LF0/s;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, LF0/s;->j()V

    .line 9
    .line 10
    .line 11
    new-instance v0, LF0/v;

    .line 12
    .line 13
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, LF0/v;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, LF0/s;->d(LF0/E;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lt0/f;->g:LF0/s;

    .line 25
    .line 26
    return-void
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
