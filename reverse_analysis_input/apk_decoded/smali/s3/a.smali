.class public final synthetic Ls3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/b;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ls3/d;


# direct methods
.method public synthetic constructor <init>(Ls3/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls3/a;->l:I

    iput-object p1, p0, Ls3/a;->m:Ls3/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;LZ1/l;)V
    .locals 6

    .line 1
    iget v0, p0, Ls3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls3/a;->m:Ls3/d;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ls3/c;

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0, p1}, Ls3/d;->a(Ls3/c;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-virtual {p2, v1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    array-length v2, p1

    .line 61
    const/4 v3, 0x0

    .line 62
    move v4, v3

    .line 63
    :goto_1
    if-ge v4, v2, :cond_1

    .line 64
    .line 65
    aget-object v5, p1, v4

    .line 66
    .line 67
    if-eqz v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v0, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 93
    .line 94
    new-instance v0, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    :try_start_2
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-virtual {p1, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_2

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :goto_3
    const/4 p1, 0x0

    .line 114
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :catchall_2
    move-exception p1

    .line 119
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_4
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_2
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 128
    .line 129
    new-instance v0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    :try_start_3
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 v1, 0x0

    .line 145
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :catchall_3
    move-exception p1

    .line 150
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :goto_5
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_3
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 159
    .line 160
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    :try_start_4
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 166
    .line 167
    const-string v1, "flutter"

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-nez v1, :cond_3

    .line 175
    .line 176
    new-instance v1, Ljava/io/File;

    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string v3, "app_flutter"

    .line 187
    .line 188
    invoke-direct {v1, p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :catchall_4
    move-exception p1

    .line 200
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_6
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_4
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 209
    .line 210
    new-instance v0, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    :try_start_5
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    if-nez v1, :cond_4

    .line 222
    .line 223
    new-instance v1, Ljava/io/File;

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const-string v2, "files"

    .line 234
    .line 235
    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const/4 v1, 0x0

    .line 243
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :catchall_5
    move-exception p1

    .line 248
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_7
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_5
    iget-object p1, p0, Ls3/a;->m:Ls3/d;

    .line 257
    .line 258
    new-instance v0, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    :try_start_6
    iget-object p1, p1, Ls3/d;->l:Landroid/content/Context;

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    const/4 v1, 0x0

    .line 274
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :catchall_6
    move-exception p1

    .line 279
    invoke-static {p1}, La/a;->K(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    :goto_8
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
