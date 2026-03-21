.class public final LA0/i;
.super LA0/s;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:I

.field public final B:Z

.field public final C:I

.field public final D:I

.field public final E:I

.field public final F:I

.field public final G:Z

.field public final H:Z

.field public final I:Z

.field public final p:I

.field public final q:Z

.field public final r:Ljava/lang/String;

.field public final s:LA0/m;

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:Z

.field public final y:Z

.field public final z:I


# direct methods
.method public constructor <init>(ILa0/V;ILA0/m;IZLA0/h;I)V
    .locals 6

    .line 1
    const/4 p8, 0x2

    .line 2
    const/4 v0, -0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {p0, p1, p2, p3}, LA0/s;-><init>(ILa0/V;I)V

    .line 6
    .line 7
    .line 8
    iput-object p4, p0, LA0/i;->s:LA0/m;

    .line 9
    .line 10
    iget-boolean p1, p4, LA0/m;->u:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 p1, 0x18

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p1, 0x10

    .line 18
    .line 19
    :goto_0
    iput-boolean v1, p0, LA0/i;->x:Z

    .line 20
    .line 21
    iget-object p2, p0, LA0/s;->o:La0/p;

    .line 22
    .line 23
    iget-object p2, p2, La0/p;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p2}, LA0/u;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, LA0/i;->r:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p5, v1}, Lh0/q0;->g(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iput-boolean p2, p0, LA0/i;->t:Z

    .line 36
    .line 37
    move p2, v1

    .line 38
    :goto_1
    iget-object p3, p4, La0/Z;->i:Lm2/b0;

    .line 39
    .line 40
    invoke-virtual {p3}, Lm2/b0;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const v4, 0x7fffffff

    .line 45
    .line 46
    .line 47
    if-ge p2, v3, :cond_2

    .line 48
    .line 49
    iget-object v3, p0, LA0/s;->o:La0/p;

    .line 50
    .line 51
    invoke-virtual {p3, p2}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    check-cast p3, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v3, p3, v1}, LA0/u;->c(La0/p;Ljava/lang/String;Z)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    if-lez p3, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    add-int/2addr p2, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move p3, v1

    .line 67
    move p2, v4

    .line 68
    :goto_2
    iput p2, p0, LA0/i;->v:I

    .line 69
    .line 70
    iput p3, p0, LA0/i;->u:I

    .line 71
    .line 72
    iget-object p2, p0, LA0/s;->o:La0/p;

    .line 73
    .line 74
    iget p2, p2, La0/p;->f:I

    .line 75
    .line 76
    invoke-static {p2, v1}, LA0/u;->b(II)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iput p2, p0, LA0/i;->w:I

    .line 81
    .line 82
    iget-object p2, p0, LA0/s;->o:La0/p;

    .line 83
    .line 84
    iget p3, p2, La0/p;->f:I

    .line 85
    .line 86
    if-eqz p3, :cond_4

    .line 87
    .line 88
    and-int/2addr p3, v2

    .line 89
    if-eqz p3, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move p3, v1

    .line 93
    goto :goto_4

    .line 94
    :cond_4
    :goto_3
    move p3, v2

    .line 95
    :goto_4
    iput-boolean p3, p0, LA0/i;->y:Z

    .line 96
    .line 97
    iget p3, p2, La0/p;->e:I

    .line 98
    .line 99
    and-int/2addr p3, v2

    .line 100
    if-eqz p3, :cond_5

    .line 101
    .line 102
    move p3, v2

    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move p3, v1

    .line 105
    :goto_5
    iput-boolean p3, p0, LA0/i;->B:Z

    .line 106
    .line 107
    iget-object p2, p2, La0/p;->n:Ljava/lang/String;

    .line 108
    .line 109
    if-nez p2, :cond_6

    .line 110
    .line 111
    :goto_6
    move p2, v1

    .line 112
    goto :goto_9

    .line 113
    :cond_6
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    sparse-switch p3, :sswitch_data_0

    .line 118
    .line 119
    .line 120
    :goto_7
    move p2, v0

    .line 121
    goto :goto_8

    .line 122
    :sswitch_0
    const-string p3, "audio/iamf"

    .line 123
    .line 124
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-nez p2, :cond_7

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_7
    move p2, p8

    .line 132
    goto :goto_8

    .line 133
    :sswitch_1
    const-string p3, "audio/ac4"

    .line 134
    .line 135
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-nez p2, :cond_8

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_8
    move p2, v2

    .line 143
    goto :goto_8

    .line 144
    :sswitch_2
    const-string p3, "audio/eac3-joc"

    .line 145
    .line 146
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-nez p2, :cond_9

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_9
    move p2, v1

    .line 154
    :goto_8
    packed-switch p2, :pswitch_data_0

    .line 155
    .line 156
    .line 157
    goto :goto_6

    .line 158
    :pswitch_0
    move p2, v2

    .line 159
    :goto_9
    iput-boolean p2, p0, LA0/i;->I:Z

    .line 160
    .line 161
    iget-object p2, p0, LA0/s;->o:La0/p;

    .line 162
    .line 163
    iget p3, p2, La0/p;->C:I

    .line 164
    .line 165
    iput p3, p0, LA0/i;->C:I

    .line 166
    .line 167
    iget v3, p2, La0/p;->D:I

    .line 168
    .line 169
    iput v3, p0, LA0/i;->D:I

    .line 170
    .line 171
    iget v3, p2, La0/p;->j:I

    .line 172
    .line 173
    iput v3, p0, LA0/i;->E:I

    .line 174
    .line 175
    if-eq v3, v0, :cond_a

    .line 176
    .line 177
    iget v5, p4, La0/Z;->k:I

    .line 178
    .line 179
    if-gt v3, v5, :cond_c

    .line 180
    .line 181
    :cond_a
    if-eq p3, v0, :cond_b

    .line 182
    .line 183
    iget v3, p4, La0/Z;->j:I

    .line 184
    .line 185
    if-gt p3, v3, :cond_c

    .line 186
    .line 187
    :cond_b
    invoke-virtual {p7, p2}, LA0/h;->apply(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_c

    .line 192
    .line 193
    move p2, v2

    .line 194
    goto :goto_a

    .line 195
    :cond_c
    move p2, v1

    .line 196
    :goto_a
    iput-boolean p2, p0, LA0/i;->q:Z

    .line 197
    .line 198
    invoke-static {}, Ld0/w;->C()[Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    move p3, v1

    .line 203
    :goto_b
    array-length p7, p2

    .line 204
    if-ge p3, p7, :cond_e

    .line 205
    .line 206
    iget-object p7, p0, LA0/s;->o:La0/p;

    .line 207
    .line 208
    aget-object v3, p2, p3

    .line 209
    .line 210
    invoke-static {p7, v3, v1}, LA0/u;->c(La0/p;Ljava/lang/String;Z)I

    .line 211
    .line 212
    .line 213
    move-result p7

    .line 214
    if-lez p7, :cond_d

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_d
    add-int/2addr p3, v2

    .line 218
    goto :goto_b

    .line 219
    :cond_e
    move p7, v1

    .line 220
    move p3, v4

    .line 221
    :goto_c
    iput p3, p0, LA0/i;->z:I

    .line 222
    .line 223
    iput p7, p0, LA0/i;->A:I

    .line 224
    .line 225
    move p2, v1

    .line 226
    :goto_d
    iget-object p3, p4, La0/Z;->l:Lm2/b0;

    .line 227
    .line 228
    invoke-virtual {p3}, Lm2/b0;->size()I

    .line 229
    .line 230
    .line 231
    move-result p7

    .line 232
    if-ge p2, p7, :cond_10

    .line 233
    .line 234
    iget-object p7, p0, LA0/s;->o:La0/p;

    .line 235
    .line 236
    iget-object p7, p7, La0/p;->n:Ljava/lang/String;

    .line 237
    .line 238
    if-eqz p7, :cond_f

    .line 239
    .line 240
    invoke-virtual {p3, p2}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    invoke-virtual {p7, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    if-eqz p3, :cond_f

    .line 249
    .line 250
    move v4, p2

    .line 251
    goto :goto_e

    .line 252
    :cond_f
    add-int/2addr p2, v2

    .line 253
    goto :goto_d

    .line 254
    :cond_10
    :goto_e
    iput v4, p0, LA0/i;->F:I

    .line 255
    .line 256
    invoke-static {p5}, Lh0/q0;->b(I)I

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    const/16 p3, 0x80

    .line 261
    .line 262
    if-ne p2, p3, :cond_11

    .line 263
    .line 264
    move p2, v2

    .line 265
    goto :goto_f

    .line 266
    :cond_11
    move p2, v1

    .line 267
    :goto_f
    iput-boolean p2, p0, LA0/i;->G:Z

    .line 268
    .line 269
    invoke-static {p5}, Lh0/q0;->c(I)I

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    const/16 p3, 0x40

    .line 274
    .line 275
    if-ne p2, p3, :cond_12

    .line 276
    .line 277
    move p2, v2

    .line 278
    goto :goto_10

    .line 279
    :cond_12
    move p2, v1

    .line 280
    :goto_10
    iput-boolean p2, p0, LA0/i;->H:Z

    .line 281
    .line 282
    iget-object p2, p0, LA0/i;->s:LA0/m;

    .line 283
    .line 284
    iget-boolean p3, p2, LA0/m;->w:Z

    .line 285
    .line 286
    invoke-static {p5, p3}, Lh0/q0;->g(IZ)Z

    .line 287
    .line 288
    .line 289
    move-result p3

    .line 290
    if-nez p3, :cond_13

    .line 291
    .line 292
    goto :goto_12

    .line 293
    :cond_13
    iget-boolean p3, p0, LA0/i;->q:Z

    .line 294
    .line 295
    if-nez p3, :cond_14

    .line 296
    .line 297
    iget-boolean p4, p2, LA0/m;->t:Z

    .line 298
    .line 299
    if-nez p4, :cond_14

    .line 300
    .line 301
    goto :goto_12

    .line 302
    :cond_14
    iget-object p4, p2, La0/Z;->m:La0/X;

    .line 303
    .line 304
    iget p7, p4, La0/X;->a:I

    .line 305
    .line 306
    iget-object v3, p0, LA0/s;->o:La0/p;

    .line 307
    .line 308
    if-ne p7, p8, :cond_15

    .line 309
    .line 310
    invoke-static {p2, p5, v3}, LA0/u;->g(LA0/m;ILa0/p;)Z

    .line 311
    .line 312
    .line 313
    move-result p7

    .line 314
    if-nez p7, :cond_15

    .line 315
    .line 316
    goto :goto_12

    .line 317
    :cond_15
    invoke-static {p5, v1}, Lh0/q0;->g(IZ)Z

    .line 318
    .line 319
    .line 320
    move-result p7

    .line 321
    if-eqz p7, :cond_17

    .line 322
    .line 323
    if-eqz p3, :cond_17

    .line 324
    .line 325
    iget p3, v3, La0/p;->j:I

    .line 326
    .line 327
    if-eq p3, v0, :cond_17

    .line 328
    .line 329
    iget-boolean p2, p2, LA0/m;->x:Z

    .line 330
    .line 331
    if-nez p2, :cond_16

    .line 332
    .line 333
    if-nez p6, :cond_17

    .line 334
    .line 335
    :cond_16
    iget p2, p4, La0/X;->a:I

    .line 336
    .line 337
    if-eq p2, p8, :cond_17

    .line 338
    .line 339
    and-int/2addr p1, p5

    .line 340
    if-eqz p1, :cond_17

    .line 341
    .line 342
    goto :goto_11

    .line 343
    :cond_17
    move p8, v2

    .line 344
    :goto_11
    move v1, p8

    .line 345
    :goto_12
    iput v1, p0, LA0/i;->p:I

    .line 346
    .line 347
    return-void

    .line 348
    nop

    .line 349
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59afdf4a -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LA0/i;->p:I

    .line 2
    .line 3
    return v0
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

.method public final b(LA0/s;)Z
    .locals 5

    .line 1
    check-cast p1, LA0/i;

    .line 2
    .line 3
    iget-object v0, p0, LA0/i;->s:LA0/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA0/s;->o:La0/p;

    .line 9
    .line 10
    iget v1, v0, La0/p;->C:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v3, p1, LA0/s;->o:La0/p;

    .line 16
    .line 17
    iget v4, v3, La0/p;->C:I

    .line 18
    .line 19
    if-ne v1, v4, :cond_1

    .line 20
    .line 21
    iget-boolean v1, p0, LA0/i;->x:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, La0/p;->n:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v4, v3, La0/p;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :cond_0
    iget v0, v0, La0/p;->D:I

    .line 38
    .line 39
    if-eq v0, v2, :cond_1

    .line 40
    .line 41
    iget v1, v3, La0/p;->D:I

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p1, LA0/i;->G:Z

    .line 46
    .line 47
    iget-boolean v1, p0, LA0/i;->G:Z

    .line 48
    .line 49
    if-ne v1, v0, :cond_1

    .line 50
    .line 51
    iget-boolean v0, p0, LA0/i;->H:Z

    .line 52
    .line 53
    iget-boolean p1, p1, LA0/i;->H:Z

    .line 54
    .line 55
    if-ne v0, p1, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 p1, 0x0

    .line 60
    :goto_0
    return p1
    .line 61
.end method

.method public final c(LA0/i;)I
    .locals 6

    .line 1
    iget-boolean v0, p0, LA0/i;->t:Z

    .line 2
    .line 3
    iget-boolean v1, p0, LA0/i;->q:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v2, LA0/u;->j:Lm2/a0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, LA0/u;->j:Lm2/a0;

    .line 13
    .line 14
    invoke-virtual {v2}, Lm2/a0;->a()Lm2/a0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    sget-object v3, Lm2/z;->a:Lm2/x;

    .line 19
    .line 20
    iget-boolean v4, p1, LA0/i;->t:Z

    .line 21
    .line 22
    invoke-virtual {v3, v0, v4}, Lm2/x;->c(ZZ)Lm2/z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v3, p0, LA0/i;->v:I

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v4, p1, LA0/i;->v:I

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v5, Lm2/Z;->l:Lm2/Z;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v5, Lm2/i0;->l:Lm2/i0;

    .line 44
    .line 45
    invoke-virtual {v0, v3, v4, v5}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v3, p0, LA0/i;->u:I

    .line 50
    .line 51
    iget v4, p1, LA0/i;->u:I

    .line 52
    .line 53
    invoke-virtual {v0, v3, v4}, Lm2/z;->a(II)Lm2/z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget v3, p0, LA0/i;->w:I

    .line 58
    .line 59
    iget v4, p1, LA0/i;->w:I

    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Lm2/z;->a(II)Lm2/z;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-boolean v3, p0, LA0/i;->B:Z

    .line 66
    .line 67
    iget-boolean v4, p1, LA0/i;->B:Z

    .line 68
    .line 69
    invoke-virtual {v0, v3, v4}, Lm2/z;->c(ZZ)Lm2/z;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-boolean v3, p0, LA0/i;->y:Z

    .line 74
    .line 75
    iget-boolean v4, p1, LA0/i;->y:Z

    .line 76
    .line 77
    invoke-virtual {v0, v3, v4}, Lm2/z;->c(ZZ)Lm2/z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v3, p0, LA0/i;->z:I

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget v4, p1, LA0/i;->z:I

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v0, v3, v4, v5}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget v3, p0, LA0/i;->A:I

    .line 98
    .line 99
    iget v4, p1, LA0/i;->A:I

    .line 100
    .line 101
    invoke-virtual {v0, v3, v4}, Lm2/z;->a(II)Lm2/z;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-boolean v3, p1, LA0/i;->q:Z

    .line 106
    .line 107
    invoke-virtual {v0, v1, v3}, Lm2/z;->c(ZZ)Lm2/z;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget v1, p0, LA0/i;->F:I

    .line 112
    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget v3, p1, LA0/i;->F:I

    .line 118
    .line 119
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v0, v1, v3, v5}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-object v1, p0, LA0/i;->s:LA0/m;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-boolean v1, p0, LA0/i;->G:Z

    .line 133
    .line 134
    iget-boolean v3, p1, LA0/i;->G:Z

    .line 135
    .line 136
    invoke-virtual {v0, v1, v3}, Lm2/z;->c(ZZ)Lm2/z;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-boolean v1, p0, LA0/i;->H:Z

    .line 141
    .line 142
    iget-boolean v3, p1, LA0/i;->H:Z

    .line 143
    .line 144
    invoke-virtual {v0, v1, v3}, Lm2/z;->c(ZZ)Lm2/z;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-boolean v1, p0, LA0/i;->I:Z

    .line 149
    .line 150
    iget-boolean v3, p1, LA0/i;->I:Z

    .line 151
    .line 152
    invoke-virtual {v0, v1, v3}, Lm2/z;->c(ZZ)Lm2/z;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget v1, p0, LA0/i;->C:I

    .line 157
    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget v3, p1, LA0/i;->C:I

    .line 163
    .line 164
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v0, v1, v3, v2}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget v1, p0, LA0/i;->D:I

    .line 173
    .line 174
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iget v3, p1, LA0/i;->D:I

    .line 179
    .line 180
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v0, v1, v3, v2}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget-object v1, p0, LA0/i;->r:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v3, p1, LA0/i;->r:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_1

    .line 197
    .line 198
    iget v1, p0, LA0/i;->E:I

    .line 199
    .line 200
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget p1, p1, LA0/i;->E:I

    .line 205
    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v0, v1, p1, v2}, Lm2/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lm2/z;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    :cond_1
    invoke-virtual {v0}, Lm2/z;->e()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    return p1
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
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LA0/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA0/i;->c(LA0/i;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
