.class public final LL/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/g;


# instance fields
.field public final synthetic l:I

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM3/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LL/t;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, LG3/f;

    iput-object p1, p0, LL/t;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LL/t;->l:I

    iput-object p1, p0, LL/t;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(LY3/h;LE3/d;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LL/t;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LL/s;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p1, v1}, LL/s;-><init>(LY3/h;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LL/t;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LY3/g;

    .line 15
    .line 16
    invoke-interface {p1, v0, p2}, LY3/g;->b(LY3/h;LE3/d;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, LF3/a;->l:LF3/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, LB3/g;->a:LB3/g;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    instance-of v0, p2, LY3/a;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, LY3/a;

    .line 34
    .line 35
    iget v1, v0, LY3/a;->r:I

    .line 36
    .line 37
    const/high16 v2, -0x80000000

    .line 38
    .line 39
    and-int v3, v1, v2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sub-int/2addr v1, v2

    .line 44
    iput v1, v0, LY3/a;->r:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v0, LY3/a;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, LY3/a;-><init>(LL/t;LE3/d;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object p2, v0, LY3/a;->p:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v1, LF3/a;->l:LF3/a;

    .line 55
    .line 56
    iget v2, v0, LY3/a;->r:I

    .line 57
    .line 58
    sget-object v3, LB3/g;->a:LB3/g;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    if-ne v2, v4, :cond_2

    .line 64
    .line 65
    iget-object p1, v0, LY3/a;->o:LZ3/s;

    .line 66
    .line 67
    :try_start_0
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :catchall_0
    move-exception p2

    .line 72
    goto :goto_6

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_3
    invoke-static {p2}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance p2, LZ3/s;

    .line 85
    .line 86
    iget-object v2, v0, LG3/b;->m:LE3/i;

    .line 87
    .line 88
    invoke-static {v2}, LN3/h;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p2, p1, v2}, LZ3/s;-><init>(LY3/h;LE3/i;)V

    .line 92
    .line 93
    .line 94
    :try_start_1
    iput-object p2, v0, LY3/a;->o:LZ3/s;

    .line 95
    .line 96
    iput v4, v0, LY3/a;->r:I

    .line 97
    .line 98
    iget-object p1, p0, LL/t;->m:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, LG3/f;

    .line 101
    .line 102
    invoke-interface {p1, p2, v0}, LM3/p;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object p1, v3

    .line 110
    :goto_2
    if-ne p1, v1, :cond_5

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    move-object p1, p2

    .line 114
    :goto_3
    invoke-virtual {p1}, LG3/b;->m()V

    .line 115
    .line 116
    .line 117
    move-object v1, v3

    .line 118
    :goto_4
    return-object v1

    .line 119
    :goto_5
    move-object v7, p2

    .line 120
    move-object p2, p1

    .line 121
    move-object p1, v7

    .line 122
    goto :goto_6

    .line 123
    :catchall_1
    move-exception p1

    .line 124
    goto :goto_5

    .line 125
    :goto_6
    invoke-virtual {p1}, LG3/b;->m()V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :pswitch_1
    new-instance v2, LG1/a;

    .line 130
    .line 131
    iget-object v0, p0, LL/t;->m:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v1, v0

    .line 134
    check-cast v1, [LY3/g;

    .line 135
    .line 136
    const/4 v0, 0x3

    .line 137
    invoke-direct {v2, v1, v0}, LG1/a;-><init>(Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    new-instance v3, LV1/g;

    .line 141
    .line 142
    const/4 v0, 0x3

    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-direct {v3, v0, v4}, LG3/f;-><init>(ILE3/d;)V

    .line 145
    .line 146
    .line 147
    new-instance v6, LZ3/l;

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    move-object v0, v6

    .line 151
    move-object v4, p1

    .line 152
    invoke-direct/range {v0 .. v5}, LZ3/l;-><init>([LY3/g;LG1/a;LV1/g;LY3/h;LE3/d;)V

    .line 153
    .line 154
    .line 155
    new-instance p1, LZ3/n;

    .line 156
    .line 157
    invoke-interface {p2}, LE3/d;->getContext()LE3/i;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {p1, p2, v0}, La4/t;-><init>(LE3/d;LE3/i;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, p1, v6}, La/a;->H(La4/t;La4/t;LM3/p;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    sget-object p2, LF3/a;->l:LF3/a;

    .line 169
    .line 170
    sget-object v0, LB3/g;->a:LB3/g;

    .line 171
    .line 172
    if-ne p1, p2, :cond_6

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_6
    move-object p1, v0

    .line 176
    :goto_7
    if-ne p1, p2, :cond_7

    .line 177
    .line 178
    move-object v0, p1

    .line 179
    :cond_7
    return-object v0

    .line 180
    :pswitch_2
    new-instance v0, LL/s;

    .line 181
    .line 182
    const/4 v1, 0x0

    .line 183
    invoke-direct {v0, p1, v1}, LL/s;-><init>(LY3/h;I)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, LL/t;->m:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p1, LY3/o;

    .line 189
    .line 190
    invoke-virtual {p1, v0, p2}, LY3/o;->b(LY3/h;LE3/d;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    sget-object p2, LF3/a;->l:LF3/a;

    .line 195
    .line 196
    if-ne p1, p2, :cond_8

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_8
    sget-object p1, LB3/g;->a:LB3/g;

    .line 200
    .line 201
    :goto_8
    return-object p1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
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
