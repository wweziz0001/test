.class public final synthetic Lv3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/b;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lv3/o;


# direct methods
.method public synthetic constructor <init>(Lv3/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv3/k;->l:I

    iput-object p1, p0, Lv3/k;->m:Lv3/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;LZ1/l;)V
    .locals 7

    .line 1
    iget v0, p0, Lv3/k;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lv3/k;->m:Lv3/o;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object p1, p1, Lv3/o;->d:Lh0/s;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, Lh0/G;

    .line 17
    .line 18
    invoke-virtual {v1}, Lh0/G;->x()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast p1, Lh0/G;

    .line 27
    .line 28
    invoke-virtual {p1}, Lh0/G;->s()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v2, Lv3/j;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, v2, Lv3/j;->a:Ljava/lang/Long;

    .line 42
    .line 43
    iput-object p1, v2, Lv3/j;->b:Ljava/lang/Long;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    iget-object v0, p0, Lv3/k;->m:Lv3/o;

    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    check-cast p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/Long;

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iget-object p1, v0, Lv3/o;->d:Lh0/s;

    .line 83
    .line 84
    check-cast p1, LL0/e;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, Lh0/G;

    .line 91
    .line 92
    invoke-virtual {v0}, Lh0/G;->w()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p1, v0, v3, v4, v2}, LL0/e;->n(IJZ)V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_1
    move-exception p1

    .line 105
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_1
    invoke-virtual {p2, v1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    iget-object p1, p0, Lv3/k;->m:Lv3/o;

    .line 114
    .line 115
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    :try_start_2
    iget-object p1, p1, Lv3/o;->d:Lh0/s;

    .line 121
    .line 122
    check-cast p1, LL0/e;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast p1, Lh0/G;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-virtual {p1, v1}, Lh0/G;->R(Z)V

    .line 131
    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_2
    move-exception p1

    .line 139
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_2
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_2
    iget-object p1, p0, Lv3/k;->m:Lv3/o;

    .line 148
    .line 149
    new-instance v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    :try_start_3
    iget-object p1, p1, Lv3/o;->d:Lh0/s;

    .line 155
    .line 156
    check-cast p1, LL0/e;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast p1, Lh0/G;

    .line 162
    .line 163
    const/4 v1, 0x1

    .line 164
    invoke-virtual {p1, v1}, Lh0/G;->R(Z)V

    .line 165
    .line 166
    .line 167
    const/4 p1, 0x0

    .line 168
    const/4 v1, 0x0

    .line 169
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catchall_3
    move-exception p1

    .line 174
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_3
    invoke-virtual {p2, v0}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_3
    iget-object v0, p0, Lv3/k;->m:Lv3/o;

    .line 183
    .line 184
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    check-cast p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Ljava/lang/Double;

    .line 197
    .line 198
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v3, La0/J;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-direct {v3, p1}, La0/J;-><init>(F)V

    .line 208
    .line 209
    .line 210
    iget-object p1, v0, Lv3/o;->d:Lh0/s;

    .line 211
    .line 212
    check-cast p1, Lh0/G;

    .line 213
    .line 214
    invoke-virtual {p1, v3}, Lh0/G;->S(La0/J;)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :catchall_4
    move-exception p1

    .line 223
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    :goto_4
    invoke-virtual {p2, v1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_4
    iget-object v0, p0, Lv3/k;->m:Lv3/o;

    .line 232
    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    check-cast p1, Ljava/util/ArrayList;

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Ljava/lang/Double;

    .line 246
    .line 247
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 255
    .line 256
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    const-wide/16 v5, 0x0

    .line 261
    .line 262
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    double-to-float p1, v3

    .line 267
    iget-object v0, v0, Lv3/o;->d:Lh0/s;

    .line 268
    .line 269
    check-cast v0, Lh0/G;

    .line 270
    .line 271
    invoke-virtual {v0, p1}, Lh0/G;->X(F)V

    .line 272
    .line 273
    .line 274
    const/4 p1, 0x0

    .line 275
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :catchall_5
    move-exception p1

    .line 280
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    :goto_5
    invoke-virtual {p2, v1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_5
    iget-object v0, p0, Lv3/k;->m:Lv3/o;

    .line 289
    .line 290
    new-instance v1, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    check-cast p1, Ljava/util/ArrayList;

    .line 296
    .line 297
    const/4 v2, 0x0

    .line 298
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    check-cast p1, Ljava/lang/Boolean;

    .line 303
    .line 304
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_0

    .line 312
    .line 313
    const/4 p1, 0x2

    .line 314
    goto :goto_6

    .line 315
    :cond_0
    move p1, v2

    .line 316
    :goto_6
    iget-object v0, v0, Lv3/o;->d:Lh0/s;

    .line 317
    .line 318
    check-cast v0, Lh0/G;

    .line 319
    .line 320
    invoke-virtual {v0, p1}, Lh0/G;->T(I)V

    .line 321
    .line 322
    .line 323
    const/4 p1, 0x0

    .line 324
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catchall_6
    move-exception p1

    .line 329
    invoke-static {p1}, LQ1/C;->C0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    :goto_7
    invoke-virtual {p2, v1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
