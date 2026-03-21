.class public final Lt3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/h;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:LY3/h;

.field public final synthetic n:LP/d;


# direct methods
.method public synthetic constructor <init>(LY3/h;LP/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lt3/m;->l:I

    iput-object p1, p0, Lt3/m;->m:LY3/h;

    iput-object p2, p0, Lt3/m;->n:LP/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lt3/m;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lt3/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lt3/y;

    .line 12
    .line 13
    iget v1, v0, Lt3/y;->p:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lt3/y;->p:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lt3/y;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lt3/y;-><init>(Lt3/m;LE3/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lt3/y;->o:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF3/a;->l:LF3/a;

    .line 33
    .line 34
    iget v2, v0, Lt3/y;->p:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, LP/b;

    .line 57
    .line 58
    iget-object p2, p0, Lt3/m;->n:LP/d;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, LP/b;->c(LP/d;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput v3, v0, Lt3/y;->p:I

    .line 65
    .line 66
    iget-object p2, p0, Lt3/m;->m:LY3/h;

    .line 67
    .line 68
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v1, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_1
    sget-object v1, LB3/g;->a:LB3/g;

    .line 76
    .line 77
    :goto_2
    return-object v1

    .line 78
    :pswitch_0
    instance-of v0, p2, Lt3/w;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    check-cast v0, Lt3/w;

    .line 84
    .line 85
    iget v1, v0, Lt3/w;->p:I

    .line 86
    .line 87
    const/high16 v2, -0x80000000

    .line 88
    .line 89
    and-int v3, v1, v2

    .line 90
    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    sub-int/2addr v1, v2

    .line 94
    iput v1, v0, Lt3/w;->p:I

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    new-instance v0, Lt3/w;

    .line 98
    .line 99
    invoke-direct {v0, p0, p2}, Lt3/w;-><init>(Lt3/m;LE3/d;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    iget-object p2, v0, Lt3/w;->o:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v1, LF3/a;->l:LF3/a;

    .line 105
    .line 106
    iget v2, v0, Lt3/w;->p:I

    .line 107
    .line 108
    const/4 v3, 0x1

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    if-ne v2, v3, :cond_5

    .line 112
    .line 113
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_6
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    check-cast p1, LP/b;

    .line 129
    .line 130
    iget-object p2, p0, Lt3/m;->n:LP/d;

    .line 131
    .line 132
    invoke-virtual {p1, p2}, LP/b;->c(LP/d;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput v3, v0, Lt3/w;->p:I

    .line 137
    .line 138
    iget-object p2, p0, Lt3/m;->m:LY3/h;

    .line 139
    .line 140
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-ne p1, v1, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    :goto_4
    sget-object v1, LB3/g;->a:LB3/g;

    .line 148
    .line 149
    :goto_5
    return-object v1

    .line 150
    :pswitch_1
    instance-of v0, p2, Lt3/s;

    .line 151
    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    move-object v0, p2

    .line 155
    check-cast v0, Lt3/s;

    .line 156
    .line 157
    iget v1, v0, Lt3/s;->p:I

    .line 158
    .line 159
    const/high16 v2, -0x80000000

    .line 160
    .line 161
    and-int v3, v1, v2

    .line 162
    .line 163
    if-eqz v3, :cond_8

    .line 164
    .line 165
    sub-int/2addr v1, v2

    .line 166
    iput v1, v0, Lt3/s;->p:I

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_8
    new-instance v0, Lt3/s;

    .line 170
    .line 171
    invoke-direct {v0, p0, p2}, Lt3/s;-><init>(Lt3/m;LE3/d;)V

    .line 172
    .line 173
    .line 174
    :goto_6
    iget-object p2, v0, Lt3/s;->o:Ljava/lang/Object;

    .line 175
    .line 176
    sget-object v1, LF3/a;->l:LF3/a;

    .line 177
    .line 178
    iget v2, v0, Lt3/s;->p:I

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    if-eqz v2, :cond_a

    .line 182
    .line 183
    if-ne v2, v3, :cond_9

    .line 184
    .line 185
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 190
    .line 191
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 192
    .line 193
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_a
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    check-cast p1, LP/b;

    .line 201
    .line 202
    iget-object p2, p0, Lt3/m;->n:LP/d;

    .line 203
    .line 204
    invoke-virtual {p1, p2}, LP/b;->c(LP/d;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iput v3, v0, Lt3/s;->p:I

    .line 209
    .line 210
    iget-object p2, p0, Lt3/m;->m:LY3/h;

    .line 211
    .line 212
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-ne p1, v1, :cond_b

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_b
    :goto_7
    sget-object v1, LB3/g;->a:LB3/g;

    .line 220
    .line 221
    :goto_8
    return-object v1

    .line 222
    :pswitch_2
    instance-of v0, p2, Lt3/l;

    .line 223
    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    move-object v0, p2

    .line 227
    check-cast v0, Lt3/l;

    .line 228
    .line 229
    iget v1, v0, Lt3/l;->p:I

    .line 230
    .line 231
    const/high16 v2, -0x80000000

    .line 232
    .line 233
    and-int v3, v1, v2

    .line 234
    .line 235
    if-eqz v3, :cond_c

    .line 236
    .line 237
    sub-int/2addr v1, v2

    .line 238
    iput v1, v0, Lt3/l;->p:I

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_c
    new-instance v0, Lt3/l;

    .line 242
    .line 243
    invoke-direct {v0, p0, p2}, Lt3/l;-><init>(Lt3/m;LE3/d;)V

    .line 244
    .line 245
    .line 246
    :goto_9
    iget-object p2, v0, Lt3/l;->o:Ljava/lang/Object;

    .line 247
    .line 248
    sget-object v1, LF3/a;->l:LF3/a;

    .line 249
    .line 250
    iget v2, v0, Lt3/l;->p:I

    .line 251
    .line 252
    const/4 v3, 0x1

    .line 253
    if-eqz v2, :cond_e

    .line 254
    .line 255
    if-ne v2, v3, :cond_d

    .line 256
    .line 257
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 262
    .line 263
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 264
    .line 265
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_e
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    check-cast p1, LP/b;

    .line 273
    .line 274
    iget-object p2, p0, Lt3/m;->n:LP/d;

    .line 275
    .line 276
    invoke-virtual {p1, p2}, LP/b;->c(LP/d;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iput v3, v0, Lt3/l;->p:I

    .line 281
    .line 282
    iget-object p2, p0, Lt3/m;->m:LY3/h;

    .line 283
    .line 284
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    if-ne p1, v1, :cond_f

    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_f
    :goto_a
    sget-object v1, LB3/g;->a:LB3/g;

    .line 292
    .line 293
    :goto_b
    return-object v1

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
