.class public final LY3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/g;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LY3/o;->l:I

    iput-object p1, p0, LY3/o;->m:Ljava/lang/Object;

    iput-object p3, p0, LY3/o;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(LY3/h;LE3/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LY3/o;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LY3/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LY3/q;

    .line 12
    .line 13
    iget v1, v0, LY3/q;->p:I

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
    iput v1, v0, LY3/q;->p:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LY3/q;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LY3/q;-><init>(LY3/o;LE3/d;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LY3/q;->o:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, LF3/a;->l:LF3/a;

    .line 33
    .line 34
    iget v2, v0, LY3/q;->p:I

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
    iget-object p1, v0, LY3/q;->r:LV1/i;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_0
    .catch LZ3/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, LY3/o;->m:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, LY3/o;

    .line 63
    .line 64
    new-instance v2, LV1/i;

    .line 65
    .line 66
    iget-object v4, p0, LY3/o;->n:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, LL/o;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-direct {v2, v4, v5, p1}, LV1/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :try_start_1
    iput-object v2, v0, LY3/q;->r:LV1/i;

    .line 75
    .line 76
    iput v3, v0, LY3/q;->p:I

    .line 77
    .line 78
    invoke-virtual {p2, v2, v0}, LY3/o;->b(LY3/h;LE3/d;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1
    :try_end_1
    .catch LZ3/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    if-ne p1, v1, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catch_1
    move-exception p2

    .line 86
    move-object p1, v2

    .line 87
    :goto_1
    iget-object v0, p2, LZ3/a;->l:LY3/h;

    .line 88
    .line 89
    if-ne v0, p1, :cond_4

    .line 90
    .line 91
    :cond_3
    :goto_2
    sget-object v1, LB3/g;->a:LB3/g;

    .line 92
    .line 93
    :goto_3
    return-object v1

    .line 94
    :cond_4
    throw p2

    .line 95
    :pswitch_0
    new-instance v0, LN3/m;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v1, LY3/e;

    .line 101
    .line 102
    iget-object v2, p0, LY3/o;->n:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, LL/p;

    .line 105
    .line 106
    invoke-direct {v1, v0, p1, v2}, LY3/e;-><init>(LN3/m;LY3/h;LL/p;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, LY3/o;->m:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, LY3/o;

    .line 112
    .line 113
    invoke-virtual {p1, v1, p2}, LY3/o;->b(LY3/h;LE3/d;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    sget-object p2, LF3/a;->l:LF3/a;

    .line 118
    .line 119
    if-ne p1, p2, :cond_5

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    sget-object p1, LB3/g;->a:LB3/g;

    .line 123
    .line 124
    :goto_4
    return-object p1

    .line 125
    :pswitch_1
    instance-of v0, p2, LY3/n;

    .line 126
    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    move-object v0, p2

    .line 130
    check-cast v0, LY3/n;

    .line 131
    .line 132
    iget v1, v0, LY3/n;->p:I

    .line 133
    .line 134
    const/high16 v2, -0x80000000

    .line 135
    .line 136
    and-int v3, v1, v2

    .line 137
    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    sub-int/2addr v1, v2

    .line 141
    iput v1, v0, LY3/n;->p:I

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    new-instance v0, LY3/n;

    .line 145
    .line 146
    invoke-direct {v0, p0, p2}, LY3/n;-><init>(LY3/o;LE3/d;)V

    .line 147
    .line 148
    .line 149
    :goto_5
    iget-object p2, v0, LY3/n;->o:Ljava/lang/Object;

    .line 150
    .line 151
    sget-object v1, LF3/a;->l:LF3/a;

    .line 152
    .line 153
    iget v2, v0, LY3/n;->p:I

    .line 154
    .line 155
    const/4 v3, 0x2

    .line 156
    const/4 v4, 0x1

    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    if-eq v2, v4, :cond_8

    .line 160
    .line 161
    if-ne v2, v3, :cond_7

    .line 162
    .line 163
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object v1, LB3/g;->a:LB3/g;

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 172
    .line 173
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_8
    iget-object p1, v0, LY3/n;->t:LZ3/s;

    .line 178
    .line 179
    iget-object v2, v0, LY3/n;->s:LY3/h;

    .line 180
    .line 181
    iget-object v4, v0, LY3/n;->r:LY3/o;

    .line 182
    .line 183
    :try_start_2
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :catchall_0
    move-exception p2

    .line 188
    goto :goto_8

    .line 189
    :cond_9
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    new-instance p2, LZ3/s;

    .line 193
    .line 194
    iget-object v2, v0, LG3/b;->m:LE3/i;

    .line 195
    .line 196
    invoke-static {v2}, LN3/h;->b(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p2, p1, v2}, LZ3/s;-><init>(LY3/h;LE3/i;)V

    .line 200
    .line 201
    .line 202
    :try_start_3
    iget-object v2, p0, LY3/o;->m:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, LL/n;

    .line 205
    .line 206
    iput-object p0, v0, LY3/n;->r:LY3/o;

    .line 207
    .line 208
    iput-object p1, v0, LY3/n;->s:LY3/h;

    .line 209
    .line 210
    iput-object p2, v0, LY3/n;->t:LZ3/s;

    .line 211
    .line 212
    iput v4, v0, LY3/n;->p:I

    .line 213
    .line 214
    invoke-virtual {v2, p2, v0}, LL/n;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 218
    if-ne v2, v1, :cond_a

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_a
    move-object v4, p0

    .line 222
    move-object v2, p1

    .line 223
    move-object p1, p2

    .line 224
    :goto_6
    invoke-virtual {p1}, LG3/b;->m()V

    .line 225
    .line 226
    .line 227
    iget-object p1, v4, LY3/o;->n:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, LY3/v;

    .line 230
    .line 231
    const/4 p2, 0x0

    .line 232
    iput-object p2, v0, LY3/n;->r:LY3/o;

    .line 233
    .line 234
    iput-object p2, v0, LY3/n;->s:LY3/h;

    .line 235
    .line 236
    iput-object p2, v0, LY3/n;->t:LZ3/s;

    .line 237
    .line 238
    iput v3, v0, LY3/n;->p:I

    .line 239
    .line 240
    invoke-virtual {p1, v2, v0}, LY3/v;->b(LY3/h;LE3/d;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    :goto_7
    return-object v1

    .line 244
    :catchall_1
    move-exception p1

    .line 245
    move-object v6, p2

    .line 246
    move-object p2, p1

    .line 247
    move-object p1, v6

    .line 248
    :goto_8
    invoke-virtual {p1}, LG3/b;->m()V

    .line 249
    .line 250
    .line 251
    throw p2

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
