.class public LN/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL/a;


# instance fields
.field public final a:Lg4/i;

.field public final b:Lg4/l;

.field public final c:LN/a;


# direct methods
.method public constructor <init>(Lg4/i;Lg4/l;)V
    .locals 1

    .line 1
    const-string v0, "fileSystem"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LN/c;->a:Lg4/i;

    .line 15
    .line 16
    iput-object p2, p0, LN/c;->b:Lg4/l;

    .line 17
    .line 18
    new-instance p1, LN/a;

    .line 19
    .line 20
    invoke-direct {p1}, LN/a;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LN/c;->c:LN/a;

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
.end method

.method public static a(LN/c;LG3/b;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, LN/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LN/b;

    .line 7
    .line 8
    iget v1, v0, LN/b;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN/b;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LN/b;-><init>(LN/c;LG3/b;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LN/b;->q:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF3/a;->l:LF3/a;

    .line 28
    .line 29
    iget v2, v0, LN/b;->s:I

    .line 30
    .line 31
    sget-object v3, LP/h;->a:LP/h;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, LN/b;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/io/Closeable;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    iget-object p0, v0, LN/b;->p:Lg4/p;

    .line 63
    .line 64
    iget-object v2, v0, LN/b;->o:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LN/c;

    .line 67
    .line 68
    :try_start_1
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p1

    .line 73
    goto :goto_4

    .line 74
    :cond_3
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, LN/c;->c:LN/a;

    .line 78
    .line 79
    iget-object p1, p1, LN/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_d

    .line 86
    .line 87
    :try_start_2
    iget-object p1, p0, LN/c;->a:Lg4/i;

    .line 88
    .line 89
    iget-object v2, p0, LN/c;->b:Lg4/l;

    .line 90
    .line 91
    invoke-virtual {p1, v2}, Lg4/i;->f(Lg4/l;)Lg4/t;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, LD1/b;->d(Lg4/t;)Lg4/p;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 99
    :try_start_3
    iput-object p0, v0, LN/b;->o:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p1, v0, LN/b;->p:Lg4/p;

    .line 102
    .line 103
    iput v5, v0, LN/b;->s:I

    .line 104
    .line 105
    invoke-virtual {v3, p1}, LP/h;->a(Lg4/p;)LP/b;

    .line 106
    .line 107
    .line 108
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 109
    if-ne v2, v1, :cond_4

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_4
    move-object v7, v2

    .line 113
    move-object v2, p0

    .line 114
    move-object p0, p1

    .line 115
    move-object p1, v7

    .line 116
    :goto_1
    if-eqz p0, :cond_5

    .line 117
    .line 118
    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception p0

    .line 123
    goto :goto_6

    .line 124
    :cond_5
    :goto_2
    move-object p0, v6

    .line 125
    goto :goto_6

    .line 126
    :goto_3
    move-object v7, v2

    .line 127
    move-object v2, p0

    .line 128
    move-object p0, p1

    .line 129
    move-object p1, v7

    .line 130
    goto :goto_4

    .line 131
    :catchall_3
    move-exception v2

    .line 132
    goto :goto_3

    .line 133
    :goto_4
    if-eqz p0, :cond_6

    .line 134
    .line 135
    :try_start_5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :catchall_4
    move-exception p0

    .line 140
    :try_start_6
    invoke-static {p1, p0}, La/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :catch_0
    move-object p0, v2

    .line 145
    goto :goto_7

    .line 146
    :cond_6
    :goto_5
    move-object p0, p1

    .line 147
    move-object p1, v6

    .line 148
    :goto_6
    if-nez p0, :cond_7

    .line 149
    .line 150
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_c

    .line 154
    :cond_7
    throw p0
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    .line 155
    :catch_1
    :goto_7
    iget-object p1, p0, LN/c;->a:Lg4/i;

    .line 156
    .line 157
    iget-object v2, p0, LN/c;->b:Lg4/l;

    .line 158
    .line 159
    invoke-virtual {p1, v2}, Lg4/f;->a(Lg4/l;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_c

    .line 164
    .line 165
    iget-object p0, p0, LN/c;->a:Lg4/i;

    .line 166
    .line 167
    invoke-virtual {p0, v2}, Lg4/i;->f(Lg4/l;)Lg4/t;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, LD1/b;->d(Lg4/t;)Lg4/p;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    :try_start_7
    iput-object p0, v0, LN/b;->o:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v6, v0, LN/b;->p:Lg4/p;

    .line 178
    .line 179
    iput v4, v0, LN/b;->s:I

    .line 180
    .line 181
    invoke-virtual {v3, p0}, LP/h;->a(Lg4/p;)LP/b;

    .line 182
    .line 183
    .line 184
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 185
    if-ne p1, v1, :cond_8

    .line 186
    .line 187
    return-object v1

    .line 188
    :cond_8
    :goto_8
    if-eqz p0, :cond_a

    .line 189
    .line 190
    :try_start_8
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 191
    .line 192
    .line 193
    goto :goto_b

    .line 194
    :catchall_5
    move-exception v6

    .line 195
    goto :goto_b

    .line 196
    :goto_9
    if-eqz p0, :cond_9

    .line 197
    .line 198
    :try_start_9
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 199
    .line 200
    .line 201
    goto :goto_a

    .line 202
    :catchall_6
    move-exception p0

    .line 203
    invoke-static {p1, p0}, La/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    :cond_9
    :goto_a
    move-object v7, v6

    .line 207
    move-object v6, p1

    .line 208
    move-object p1, v7

    .line 209
    :cond_a
    :goto_b
    if-nez v6, :cond_b

    .line 210
    .line 211
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_c

    .line 215
    :cond_b
    throw v6

    .line 216
    :cond_c
    new-instance p0, LP/b;

    .line 217
    .line 218
    invoke-direct {p0, v5}, LP/b;-><init>(Z)V

    .line 219
    .line 220
    .line 221
    move-object p1, p0

    .line 222
    :goto_c
    return-object p1

    .line 223
    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    const-string p1, "This scope has already been closed."

    .line 226
    .line 227
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p0
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


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/c;->c:LN/a;

    .line 2
    .line 3
    iget-object v0, v0, LN/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

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
.end method
