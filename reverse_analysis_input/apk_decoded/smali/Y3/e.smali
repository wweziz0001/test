.class public final LY3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/h;


# instance fields
.field public final synthetic l:I

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN3/m;LY3/h;LL/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LY3/e;->l:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY3/e;->n:Ljava/lang/Object;

    iput-object p2, p0, LY3/e;->m:Ljava/lang/Object;

    iput-object p3, p0, LY3/e;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY3/f;LN3/p;LY3/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LY3/e;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY3/e;->n:Ljava/lang/Object;

    iput-object p2, p0, LY3/e;->o:Ljava/lang/Object;

    iput-object p3, p0, LY3/e;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY3/h;LE3/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LY3/e;->l:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p2, p0, LY3/e;->n:Ljava/lang/Object;

    .line 6
    invoke-static {p2}, La4/a;->l(LE3/i;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LY3/e;->o:Ljava/lang/Object;

    .line 7
    new-instance p2, LZ3/y;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LZ3/y;-><init>(LY3/h;LE3/d;)V

    iput-object p2, p0, LY3/e;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY3/h;LP/d;Lt3/J;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LY3/e;->l:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY3/e;->m:Ljava/lang/Object;

    iput-object p2, p0, LY3/e;->n:Ljava/lang/Object;

    iput-object p3, p0, LY3/e;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LY3/e;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lt3/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lt3/p;

    .line 12
    .line 13
    iget v1, v0, Lt3/p;->p:I

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
    iput v1, v0, Lt3/p;->p:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lt3/p;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lt3/p;-><init>(LY3/e;LE3/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lt3/p;->o:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF3/a;->l:LF3/a;

    .line 33
    .line 34
    iget v2, v0, Lt3/p;->p:I

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
    iget-object p2, p0, LY3/e;->n:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, LP/d;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, LP/b;->c(LP/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p2, p0, LY3/e;->o:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Lt3/J;

    .line 69
    .line 70
    iget-object p2, p2, Lt3/J;->n:Lp1/b;

    .line 71
    .line 72
    invoke-static {p1, p2}, Lt3/K;->c(Ljava/lang/Object;Lp1/b;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/lang/Double;

    .line 77
    .line 78
    iput v3, v0, Lt3/p;->p:I

    .line 79
    .line 80
    iget-object p2, p0, LY3/e;->m:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, LY3/h;

    .line 83
    .line 84
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v1, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    :goto_1
    sget-object v1, LB3/g;->a:LB3/g;

    .line 92
    .line 93
    :goto_2
    return-object v1

    .line 94
    :pswitch_0
    iget-object v0, p0, LY3/e;->n:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, LE3/i;

    .line 97
    .line 98
    iget-object v1, p0, LY3/e;->o:Ljava/lang/Object;

    .line 99
    .line 100
    iget-object v2, p0, LY3/e;->m:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, LZ3/y;

    .line 103
    .line 104
    invoke-static {v0, p1, v1, v2, p2}, LZ3/q;->b(LE3/i;Ljava/lang/Object;Ljava/lang/Object;LM3/p;LE3/d;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object p2, LF3/a;->l:LF3/a;

    .line 109
    .line 110
    if-ne p1, p2, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    sget-object p1, LB3/g;->a:LB3/g;

    .line 114
    .line 115
    :goto_3
    return-object p1

    .line 116
    :pswitch_1
    instance-of v0, p2, LY3/p;

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    move-object v0, p2

    .line 121
    check-cast v0, LY3/p;

    .line 122
    .line 123
    iget v1, v0, LY3/p;->s:I

    .line 124
    .line 125
    const/high16 v2, -0x80000000

    .line 126
    .line 127
    and-int v3, v1, v2

    .line 128
    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    sub-int/2addr v1, v2

    .line 132
    iput v1, v0, LY3/p;->s:I

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    new-instance v0, LY3/p;

    .line 136
    .line 137
    invoke-direct {v0, p0, p2}, LY3/p;-><init>(LY3/e;LE3/d;)V

    .line 138
    .line 139
    .line 140
    :goto_4
    iget-object p2, v0, LY3/p;->q:Ljava/lang/Object;

    .line 141
    .line 142
    sget-object v1, LF3/a;->l:LF3/a;

    .line 143
    .line 144
    iget v2, v0, LY3/p;->s:I

    .line 145
    .line 146
    sget-object v3, LB3/g;->a:LB3/g;

    .line 147
    .line 148
    const/4 v4, 0x3

    .line 149
    const/4 v5, 0x2

    .line 150
    const/4 v6, 0x1

    .line 151
    if-eqz v2, :cond_9

    .line 152
    .line 153
    if-eq v2, v6, :cond_8

    .line 154
    .line 155
    if-eq v2, v5, :cond_7

    .line 156
    .line 157
    if-ne v2, v4, :cond_6

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 163
    .line 164
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_7
    iget-object p1, v0, LY3/p;->p:Ljava/lang/Object;

    .line 169
    .line 170
    iget-object v2, v0, LY3/p;->o:LY3/e;

    .line 171
    .line 172
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_8
    :goto_5
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p0, LY3/e;->n:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p2, LN3/m;

    .line 186
    .line 187
    iget-boolean p2, p2, LN3/m;->l:Z

    .line 188
    .line 189
    if-eqz p2, :cond_b

    .line 190
    .line 191
    iput v6, v0, LY3/p;->s:I

    .line 192
    .line 193
    iget-object p2, p0, LY3/e;->m:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p2, LY3/h;

    .line 196
    .line 197
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-ne p1, v1, :cond_a

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_a
    :goto_6
    move-object v1, v3

    .line 205
    goto :goto_8

    .line 206
    :cond_b
    iput-object p0, v0, LY3/p;->o:LY3/e;

    .line 207
    .line 208
    iput-object p1, v0, LY3/p;->p:Ljava/lang/Object;

    .line 209
    .line 210
    iput v5, v0, LY3/p;->s:I

    .line 211
    .line 212
    iget-object p2, p0, LY3/e;->o:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p2, LL/p;

    .line 215
    .line 216
    invoke-virtual {p2, p1, v0}, LL/p;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    if-ne p2, v1, :cond_c

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_c
    move-object v2, p0

    .line 224
    :goto_7
    check-cast p2, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-nez p2, :cond_a

    .line 231
    .line 232
    iget-object p2, v2, LY3/e;->n:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p2, LN3/m;

    .line 235
    .line 236
    iput-boolean v6, p2, LN3/m;->l:Z

    .line 237
    .line 238
    const/4 p2, 0x0

    .line 239
    iput-object p2, v0, LY3/p;->o:LY3/e;

    .line 240
    .line 241
    iput-object p2, v0, LY3/p;->p:Ljava/lang/Object;

    .line 242
    .line 243
    iput v4, v0, LY3/p;->s:I

    .line 244
    .line 245
    iget-object p2, v2, LY3/e;->m:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p2, LY3/h;

    .line 248
    .line 249
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-ne p1, v1, :cond_a

    .line 254
    .line 255
    :goto_8
    return-object v1

    .line 256
    :pswitch_2
    instance-of v0, p2, LY3/d;

    .line 257
    .line 258
    if-eqz v0, :cond_d

    .line 259
    .line 260
    move-object v0, p2

    .line 261
    check-cast v0, LY3/d;

    .line 262
    .line 263
    iget v1, v0, LY3/d;->q:I

    .line 264
    .line 265
    const/high16 v2, -0x80000000

    .line 266
    .line 267
    and-int v3, v1, v2

    .line 268
    .line 269
    if-eqz v3, :cond_d

    .line 270
    .line 271
    sub-int/2addr v1, v2

    .line 272
    iput v1, v0, LY3/d;->q:I

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_d
    new-instance v0, LY3/d;

    .line 276
    .line 277
    invoke-direct {v0, p0, p2}, LY3/d;-><init>(LY3/e;LE3/d;)V

    .line 278
    .line 279
    .line 280
    :goto_9
    iget-object p2, v0, LY3/d;->o:Ljava/lang/Object;

    .line 281
    .line 282
    sget-object v1, LF3/a;->l:LF3/a;

    .line 283
    .line 284
    iget v2, v0, LY3/d;->q:I

    .line 285
    .line 286
    sget-object v3, LB3/g;->a:LB3/g;

    .line 287
    .line 288
    const/4 v4, 0x1

    .line 289
    if-eqz v2, :cond_f

    .line 290
    .line 291
    if-ne v2, v4, :cond_e

    .line 292
    .line 293
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 298
    .line 299
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 300
    .line 301
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p1

    .line 305
    :cond_f
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object p2, p0, LY3/e;->n:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p2, LY3/f;

    .line 311
    .line 312
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object p2, p0, LY3/e;->o:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p2, LN3/p;

    .line 318
    .line 319
    iget-object v2, p2, LN3/p;->l:Ljava/lang/Object;

    .line 320
    .line 321
    sget-object v5, LZ3/q;->a:LF0/p;

    .line 322
    .line 323
    if-eq v2, v5, :cond_11

    .line 324
    .line 325
    sget-object v5, LY3/j;->m:LY3/j;

    .line 326
    .line 327
    invoke-virtual {v5, v2, p1}, LY3/j;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    check-cast v2, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-nez v2, :cond_10

    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_10
    :goto_a
    move-object v1, v3

    .line 341
    goto :goto_c

    .line 342
    :cond_11
    :goto_b
    iput-object p1, p2, LN3/p;->l:Ljava/lang/Object;

    .line 343
    .line 344
    iput v4, v0, LY3/d;->q:I

    .line 345
    .line 346
    iget-object p2, p0, LY3/e;->m:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p2, LY3/h;

    .line 349
    .line 350
    invoke-interface {p2, p1, v0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    if-ne p1, v1, :cond_10

    .line 355
    .line 356
    :goto_c
    return-object v1

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
