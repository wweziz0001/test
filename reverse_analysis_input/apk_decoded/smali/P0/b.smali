.class public final LP0/b;
.super LQ1/C;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LP0/b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static E0(Ld0/p;)LQ0/a;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ld0/p;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ld0/p;->q()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ld0/p;->p()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {p0}, Ld0/p;->p()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    iget-object v0, p0, Ld0/p;->a:[B

    .line 24
    .line 25
    iget v7, p0, Ld0/p;->b:I

    .line 26
    .line 27
    iget p0, p0, Ld0/p;->c:I

    .line 28
    .line 29
    invoke-static {v0, v7, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    new-instance p0, LQ0/a;

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    invoke-direct/range {v0 .. v7}, LQ0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 37
    .line 38
    .line 39
    return-object p0
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


# virtual methods
.method public final n(LO0/a;Ljava/nio/ByteBuffer;)La0/F;
    .locals 17

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget v4, v3, LP0/b;->c:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v2, La0/F;

    .line 13
    .line 14
    new-instance v4, Ld0/p;

    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-direct {v4, v6, v5}, Ld0/p;-><init>(I[B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v4}, LP0/b;->E0(Ld0/p;)LQ0/a;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-array v1, v1, [La0/E;

    .line 32
    .line 33
    aput-object v4, v1, v0

    .line 34
    .line 35
    invoke-direct {v2, v1}, La0/F;-><init>([La0/E;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_0
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x74

    .line 44
    .line 45
    if-ne v4, v5, :cond_7

    .line 46
    .line 47
    new-instance v4, LF0/M;

    .line 48
    .line 49
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-direct {v4, v7, v5}, LF0/M;-><init>(I[B)V

    .line 58
    .line 59
    .line 60
    const/16 v5, 0xc

    .line 61
    .line 62
    invoke-virtual {v4, v5}, LF0/M;->u(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, LF0/M;->i(I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v4}, LF0/M;->f()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    add-int/2addr v8, v7

    .line 74
    const/4 v7, 0x4

    .line 75
    sub-int/2addr v8, v7

    .line 76
    const/16 v9, 0x2c

    .line 77
    .line 78
    invoke-virtual {v4, v9}, LF0/M;->u(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, LF0/M;->i(I)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-virtual {v4, v9}, LF0/M;->v(I)V

    .line 86
    .line 87
    .line 88
    const/16 v9, 0x10

    .line 89
    .line 90
    invoke-virtual {v4, v9}, LF0/M;->u(I)V

    .line 91
    .line 92
    .line 93
    new-instance v10, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-virtual {v4}, LF0/M;->f()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    if-ge v11, v8, :cond_5

    .line 103
    .line 104
    const/16 v11, 0x30

    .line 105
    .line 106
    invoke-virtual {v4, v11}, LF0/M;->u(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    invoke-virtual {v4, v7}, LF0/M;->u(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v5}, LF0/M;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    invoke-virtual {v4}, LF0/M;->f()I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    add-int/2addr v13, v12

    .line 125
    const/4 v12, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    :goto_1
    invoke-virtual {v4}, LF0/M;->f()I

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    if-ge v15, v13, :cond_3

    .line 132
    .line 133
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {v4}, LF0/M;->f()I

    .line 142
    .line 143
    .line 144
    move-result v16

    .line 145
    add-int v5, v16, v0

    .line 146
    .line 147
    const/4 v6, 0x2

    .line 148
    if-ne v15, v6, :cond_1

    .line 149
    .line 150
    invoke-virtual {v4, v9}, LF0/M;->i(I)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {v4, v2}, LF0/M;->u(I)V

    .line 155
    .line 156
    .line 157
    const/4 v6, 0x3

    .line 158
    if-ne v0, v6, :cond_2

    .line 159
    .line 160
    :goto_2
    invoke-virtual {v4}, LF0/M;->f()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-ge v0, v5, :cond_2

    .line 165
    .line 166
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    sget-object v6, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 171
    .line 172
    new-array v12, v0, [B

    .line 173
    .line 174
    invoke-virtual {v4, v0, v12}, LF0/M;->l(I[B)V

    .line 175
    .line 176
    .line 177
    new-instance v0, Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v0, v12, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    const/4 v12, 0x0

    .line 187
    :goto_3
    if-ge v12, v6, :cond_0

    .line 188
    .line 189
    invoke-virtual {v4, v2}, LF0/M;->i(I)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    invoke-virtual {v4, v15}, LF0/M;->v(I)V

    .line 194
    .line 195
    .line 196
    add-int/2addr v12, v1

    .line 197
    goto :goto_3

    .line 198
    :cond_0
    move-object v12, v0

    .line 199
    goto :goto_2

    .line 200
    :cond_1
    const/16 v6, 0x15

    .line 201
    .line 202
    if-ne v15, v6, :cond_2

    .line 203
    .line 204
    sget-object v6, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 205
    .line 206
    new-array v14, v0, [B

    .line 207
    .line 208
    invoke-virtual {v4, v0, v14}, LF0/M;->l(I[B)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {v0, v14, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 214
    .line 215
    .line 216
    move-object v14, v0

    .line 217
    :cond_2
    mul-int/2addr v5, v2

    .line 218
    invoke-virtual {v4, v5}, LF0/M;->r(I)V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    const/16 v5, 0xc

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_3
    mul-int/2addr v13, v2

    .line 226
    invoke-virtual {v4, v13}, LF0/M;->r(I)V

    .line 227
    .line 228
    .line 229
    if-eqz v12, :cond_4

    .line 230
    .line 231
    if-eqz v14, :cond_4

    .line 232
    .line 233
    new-instance v0, LP0/a;

    .line 234
    .line 235
    invoke-virtual {v12, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-direct {v0, v5, v11}, LP0/a;-><init>(Ljava/lang/String;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_4
    const/4 v0, 0x0

    .line 246
    const/16 v5, 0xc

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_6

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_6
    new-instance v6, La0/F;

    .line 258
    .line 259
    invoke-direct {v6, v10}, La0/F;-><init>(Ljava/util/List;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_7
    :goto_4
    const/4 v6, 0x0

    .line 264
    :goto_5
    return-object v6

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
