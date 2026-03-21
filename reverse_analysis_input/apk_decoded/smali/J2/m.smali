.class public final LJ2/m;
.super LG2/r;
.source "SourceFile"


# static fields
.field public static final a:LJ2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ2/m;

    .line 2
    .line 3
    invoke-direct {v0}, LJ2/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ2/m;->a:LJ2/m;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static d(LO2/a;I)LG2/g;
    .locals 2

    .line 1
    invoke-static {p1}, LO/i;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LO2/a;->A()V

    .line 19
    .line 20
    .line 21
    sget-object p0, LG2/i;->l:LG2/i;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-static {p1}, Lb3/a;->t(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "Unexpected token: "

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    new-instance p1, LG2/k;

    .line 41
    .line 42
    invoke-virtual {p0}, LO2/a;->u()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {p1, p0}, LG2/k;-><init>(Ljava/lang/Boolean;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    invoke-virtual {p0}, LO2/a;->C()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, LG2/k;

    .line 59
    .line 60
    new-instance v0, LI2/k;

    .line 61
    .line 62
    invoke-direct {v0, p0}, LI2/k;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, LG2/k;-><init>(Ljava/lang/Number;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    new-instance p1, LG2/k;

    .line 70
    .line 71
    invoke-virtual {p0}, LO2/a;->C()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {p1, p0}, LG2/k;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p1
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

.method public static e(LO2/b;LG2/g;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    instance-of v0, p1, LG2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, LG2/k;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p1, LG2/k;

    .line 16
    .line 17
    iget-object v0, p1, LG2/k;->l:Ljava/io/Serializable;

    .line 18
    .line 19
    instance-of v1, v0, Ljava/lang/Number;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LG2/k;->k()Ljava/lang/Number;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, LO2/b;->x(Ljava/lang/Number;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, LG2/k;->f()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {p0, p1}, LO2/b;->z(Z)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_2
    invoke-virtual {p1}, LG2/k;->h()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, LO2/b;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Not a JSON Primitive: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_4
    instance-of v0, p1, LG2/f;

    .line 75
    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {p0}, LO2/b;->b()V

    .line 79
    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    check-cast p1, LG2/f;

    .line 84
    .line 85
    iget-object p1, p1, LG2/f;->l:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, LG2/g;

    .line 102
    .line 103
    invoke-static {p0, v0}, LJ2/m;->e(LO2/b;LG2/g;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    invoke-virtual {p0}, LO2/b;->k()V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v1, "Not a JSON Array: "

    .line 116
    .line 117
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :cond_7
    instance-of v0, p1, LG2/j;

    .line 132
    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0}, LO2/b;->c()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, LG2/g;->g()LG2/j;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, LG2/j;->l:LI2/p;

    .line 143
    .line 144
    invoke-virtual {p1}, LI2/p;->entrySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, LI2/n;

    .line 149
    .line 150
    invoke-virtual {p1}, LI2/n;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    :goto_1
    move-object v0, p1

    .line 155
    check-cast v0, LI2/m;

    .line 156
    .line 157
    invoke-virtual {v0}, LI2/m;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    move-object v0, p1

    .line 164
    check-cast v0, LI2/m;

    .line 165
    .line 166
    invoke-virtual {v0}, LI2/m;->b()LI2/o;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {p0, v1}, LO2/b;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, LG2/g;

    .line 184
    .line 185
    invoke-static {p0, v0}, LJ2/m;->e(LO2/b;LG2/g;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_8
    invoke-virtual {p0}, LO2/b;->l()V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 194
    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v1, "Couldn\'t write "

    .line 198
    .line 199
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :cond_a
    :goto_2
    invoke-virtual {p0}, LO2/b;->p()LO2/b;

    .line 218
    .line 219
    .line 220
    :goto_3
    return-void
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


# virtual methods
.method public final b(LO2/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, LJ2/o;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, LJ2/o;

    .line 7
    .line 8
    invoke-virtual {p1}, LJ2/o;->E()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x5

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, LJ2/o;->R()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LG2/g;

    .line 29
    .line 30
    invoke-virtual {p1}, LJ2/o;->K()V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Unexpected "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lb3/a;->t(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, " when reading a JsonElement."

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_1
    invoke-virtual {p1}, LO2/a;->E()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, LO/i;->b(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x0

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    if-eq v2, v1, :cond_2

    .line 76
    .line 77
    move-object v2, v3

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p1}, LO2/a;->b()V

    .line 80
    .line 81
    .line 82
    new-instance v2, LG2/j;

    .line 83
    .line 84
    invoke-direct {v2}, LG2/j;-><init>()V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {p1}, LO2/a;->a()V

    .line 89
    .line 90
    .line 91
    new-instance v2, LG2/f;

    .line 92
    .line 93
    invoke-direct {v2}, LG2/f;-><init>()V

    .line 94
    .line 95
    .line 96
    :goto_0
    if-nez v2, :cond_4

    .line 97
    .line 98
    invoke-static {p1, v0}, LJ2/m;->d(LO2/a;I)LG2/g;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_1
    invoke-virtual {p1}, LO2/a;->r()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_c

    .line 114
    .line 115
    instance-of v4, v2, LG2/j;

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    invoke-virtual {p1}, LO2/a;->y()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    goto :goto_2

    .line 124
    :cond_6
    move-object v4, v3

    .line 125
    :goto_2
    invoke-virtual {p1}, LO2/a;->E()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-static {v5}, LO/i;->b(I)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_8

    .line 134
    .line 135
    if-eq v6, v1, :cond_7

    .line 136
    .line 137
    move-object v6, v3

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    invoke-virtual {p1}, LO2/a;->b()V

    .line 140
    .line 141
    .line 142
    new-instance v6, LG2/j;

    .line 143
    .line 144
    invoke-direct {v6}, LG2/j;-><init>()V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    invoke-virtual {p1}, LO2/a;->a()V

    .line 149
    .line 150
    .line 151
    new-instance v6, LG2/f;

    .line 152
    .line 153
    invoke-direct {v6}, LG2/f;-><init>()V

    .line 154
    .line 155
    .line 156
    :goto_3
    if-eqz v6, :cond_9

    .line 157
    .line 158
    const/4 v7, 0x1

    .line 159
    goto :goto_4

    .line 160
    :cond_9
    const/4 v7, 0x0

    .line 161
    :goto_4
    if-nez v6, :cond_a

    .line 162
    .line 163
    invoke-static {p1, v5}, LJ2/m;->d(LO2/a;I)LG2/g;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    :cond_a
    instance-of v5, v2, LG2/f;

    .line 168
    .line 169
    if-eqz v5, :cond_b

    .line 170
    .line 171
    move-object v4, v2

    .line 172
    check-cast v4, LG2/f;

    .line 173
    .line 174
    iget-object v4, v4, LG2/f;->l:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_b
    move-object v5, v2

    .line 181
    check-cast v5, LG2/j;

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v5, v5, LG2/j;->l:LI2/p;

    .line 187
    .line 188
    invoke-virtual {v5, v4, v6}, LI2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :goto_5
    if-eqz v7, :cond_5

    .line 192
    .line 193
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object v2, v6

    .line 197
    goto :goto_1

    .line 198
    :cond_c
    instance-of v4, v2, LG2/f;

    .line 199
    .line 200
    if-eqz v4, :cond_d

    .line 201
    .line 202
    invoke-virtual {p1}, LO2/a;->k()V

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_d
    invoke-virtual {p1}, LO2/a;->l()V

    .line 207
    .line 208
    .line 209
    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_e

    .line 214
    .line 215
    move-object v0, v2

    .line 216
    :goto_7
    return-object v0

    .line 217
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, LG2/g;

    .line 222
    .line 223
    goto :goto_1
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

.method public final bridge synthetic c(LO2/b;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LG2/g;

    .line 2
    .line 3
    invoke-static {p1, p2}, LJ2/m;->e(LO2/b;LG2/g;)V

    .line 4
    .line 5
    .line 6
    return-void
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
