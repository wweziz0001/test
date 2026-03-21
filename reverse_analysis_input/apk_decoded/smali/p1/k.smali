.class public abstract Lp1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr/k;

.field public static final b:Ljava/lang/Object;

.field public static c:Lp1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp1/k;->a:Lr/k;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lp1/k;->b:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, Lp1/k;->c:Lp1/b;

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
.end method

.method public static a(Landroid/content/Context;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x21

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, p0}, Lp1/i;->a(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 32
    .line 33
    return-wide v0
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

.method public static b()Lp1/b;
    .locals 2

    .line 1
    new-instance v0, Lp1/b;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lp1/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp1/k;->c:Lp1/b;

    .line 8
    .line 9
    sget-object v1, Lp1/k;->a:Lr/k;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lr/k;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Lp1/k;->c:Lp1/b;

    .line 15
    .line 16
    return-object v0
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

.method public static c(Landroid/content/Context;Z)V
    .locals 18

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lp1/k;->c:Lp1/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v1, Lp1/k;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    :try_start_0
    sget-object v0, Lp1/k;->c:Lp1/b;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    monitor-exit v1

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v2, 0x1c

    .line 25
    .line 26
    if-lt v0, v2, :cond_e

    .line 27
    .line 28
    const/16 v2, 0x1e

    .line 29
    .line 30
    if-ne v0, v2, :cond_2

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_2
    new-instance v0, Ljava/io/File;

    .line 35
    .line 36
    new-instance v2, Ljava/io/File;

    .line 37
    .line 38
    const-string v3, "/data/misc/profiles/ref/"

    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v3, "primary.prof"

    .line 48
    .line 49
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v4, 0x0

    .line 61
    const-wide/16 v5, 0x0

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    cmp-long v0, v2, v5

    .line 67
    .line 68
    if-lez v0, :cond_3

    .line 69
    .line 70
    move v0, v7

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move v0, v4

    .line 73
    :goto_0
    new-instance v8, Ljava/io/File;

    .line 74
    .line 75
    new-instance v9, Ljava/io/File;

    .line 76
    .line 77
    const-string v10, "/data/misc/profiles/cur/0/"

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v10, "primary.prof"

    .line 87
    .line 88
    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 92
    .line 93
    .line 94
    move-result-wide v16

    .line 95
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-eqz v8, :cond_4

    .line 100
    .line 101
    cmp-long v5, v16, v5

    .line 102
    .line 103
    if-lez v5, :cond_4

    .line 104
    .line 105
    move v5, v7

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    move v5, v4

    .line 108
    :goto_1
    :try_start_1
    invoke-static/range {p0 .. p0}, Lp1/k;->a(Landroid/content/Context;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v14
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :try_start_2
    new-instance v6, Ljava/io/File;

    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const-string v9, "profileInstalled"

    .line 119
    .line 120
    invoke-direct {v6, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 124
    .line 125
    .line 126
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    :try_start_3
    invoke-static {v6}, Lp1/j;->a(Ljava/io/File;)Lp1/j;

    .line 130
    .line 131
    .line 132
    move-result-object v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    goto :goto_2

    .line 134
    :catch_0
    :try_start_4
    invoke-static {}, Lp1/k;->b()Lp1/b;

    .line 135
    .line 136
    .line 137
    monitor-exit v1

    .line 138
    return-void

    .line 139
    :cond_5
    const/4 v8, 0x0

    .line 140
    :goto_2
    const/4 v9, 0x2

    .line 141
    if-eqz v8, :cond_7

    .line 142
    .line 143
    iget-wide v10, v8, Lp1/j;->c:J

    .line 144
    .line 145
    cmp-long v10, v10, v14

    .line 146
    .line 147
    if-nez v10, :cond_7

    .line 148
    .line 149
    iget v10, v8, Lp1/j;->b:I

    .line 150
    .line 151
    if-ne v10, v9, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move v4, v10

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 157
    .line 158
    move v4, v7

    .line 159
    goto :goto_4

    .line 160
    :cond_8
    if-eqz v5, :cond_9

    .line 161
    .line 162
    move v4, v9

    .line 163
    :cond_9
    :goto_4
    if-eqz p1, :cond_a

    .line 164
    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    if-eq v4, v7, :cond_a

    .line 168
    .line 169
    move v4, v9

    .line 170
    :cond_a
    if-eqz v8, :cond_b

    .line 171
    .line 172
    iget v0, v8, Lp1/j;->b:I

    .line 173
    .line 174
    if-ne v0, v9, :cond_b

    .line 175
    .line 176
    if-ne v4, v7, :cond_b

    .line 177
    .line 178
    iget-wide v9, v8, Lp1/j;->d:J

    .line 179
    .line 180
    cmp-long v0, v2, v9

    .line 181
    .line 182
    if-gez v0, :cond_b

    .line 183
    .line 184
    const/4 v0, 0x3

    .line 185
    move v13, v0

    .line 186
    goto :goto_5

    .line 187
    :cond_b
    move v13, v4

    .line 188
    :goto_5
    new-instance v0, Lp1/j;

    .line 189
    .line 190
    const/4 v12, 0x1

    .line 191
    move-object v11, v0

    .line 192
    invoke-direct/range {v11 .. v17}, Lp1/j;-><init>(IIJJ)V

    .line 193
    .line 194
    .line 195
    if-eqz v8, :cond_c

    .line 196
    .line 197
    invoke-virtual {v8, v0}, Lp1/j;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 201
    if-nez v2, :cond_d

    .line 202
    .line 203
    :cond_c
    :try_start_5
    invoke-virtual {v0, v6}, Lp1/j;->b(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 204
    .line 205
    .line 206
    :catch_1
    :cond_d
    :try_start_6
    invoke-static {}, Lp1/k;->b()Lp1/b;

    .line 207
    .line 208
    .line 209
    monitor-exit v1

    .line 210
    return-void

    .line 211
    :catch_2
    invoke-static {}, Lp1/k;->b()Lp1/b;

    .line 212
    .line 213
    .line 214
    monitor-exit v1

    .line 215
    return-void

    .line 216
    :cond_e
    :goto_6
    invoke-static {}, Lp1/k;->b()Lp1/b;

    .line 217
    .line 218
    .line 219
    monitor-exit v1

    .line 220
    return-void

    .line 221
    :goto_7
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 222
    throw v0
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
