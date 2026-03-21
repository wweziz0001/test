.class public final Ll1/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/F;


# instance fields
.field public final a:Ll1/A;

.field public final b:Ld0/p;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ll1/A;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/B;->a:Ll1/A;

    .line 5
    .line 6
    new-instance p1, Ld0/p;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ld0/p;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ll1/B;->b:Ld0/p;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll1/B;->f:Z

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

.method public final b(ILd0/p;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v1

    .line 9
    :goto_0
    const/4 v2, -0x1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2}, Ld0/p;->v()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget v4, p2, Ld0/p;->b:I

    .line 17
    .line 18
    add-int/2addr v4, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v4, v2

    .line 21
    :goto_1
    iget-boolean v3, p0, Ll1/B;->f:Z

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    iput-boolean v1, p0, Ll1/B;->f:Z

    .line 29
    .line 30
    invoke-virtual {p2, v4}, Ld0/p;->H(I)V

    .line 31
    .line 32
    .line 33
    iput v1, p0, Ll1/B;->d:I

    .line 34
    .line 35
    :cond_3
    :goto_2
    invoke-virtual {p2}, Ld0/p;->a()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-lez p1, :cond_9

    .line 40
    .line 41
    iget p1, p0, Ll1/B;->d:I

    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    iget-object v4, p0, Ll1/B;->b:Ld0/p;

    .line 45
    .line 46
    if-ge p1, v3, :cond_6

    .line 47
    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p2}, Ld0/p;->v()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget v5, p2, Ld0/p;->b:I

    .line 55
    .line 56
    sub-int/2addr v5, v0

    .line 57
    invoke-virtual {p2, v5}, Ld0/p;->H(I)V

    .line 58
    .line 59
    .line 60
    const/16 v5, 0xff

    .line 61
    .line 62
    if-ne p1, v5, :cond_4

    .line 63
    .line 64
    iput-boolean v0, p0, Ll1/B;->f:Z

    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    invoke-virtual {p2}, Ld0/p;->a()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget v5, p0, Ll1/B;->d:I

    .line 72
    .line 73
    rsub-int/lit8 v5, v5, 0x3

    .line 74
    .line 75
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object v5, v4, Ld0/p;->a:[B

    .line 80
    .line 81
    iget v6, p0, Ll1/B;->d:I

    .line 82
    .line 83
    invoke-virtual {p2, v5, v6, p1}, Ld0/p;->g([BII)V

    .line 84
    .line 85
    .line 86
    iget v5, p0, Ll1/B;->d:I

    .line 87
    .line 88
    add-int/2addr v5, p1

    .line 89
    iput v5, p0, Ll1/B;->d:I

    .line 90
    .line 91
    if-ne v5, v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {v4, v1}, Ld0/p;->H(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ld0/p;->G(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v0}, Ld0/p;->I(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ld0/p;->v()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {v4}, Ld0/p;->v()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    and-int/lit16 v6, p1, 0x80

    .line 111
    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    move v6, v0

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move v6, v1

    .line 117
    :goto_3
    iput-boolean v6, p0, Ll1/B;->e:Z

    .line 118
    .line 119
    and-int/lit8 p1, p1, 0xf

    .line 120
    .line 121
    shl-int/lit8 p1, p1, 0x8

    .line 122
    .line 123
    or-int/2addr p1, v5

    .line 124
    add-int/2addr p1, v3

    .line 125
    iput p1, p0, Ll1/B;->c:I

    .line 126
    .line 127
    iget-object v3, v4, Ld0/p;->a:[B

    .line 128
    .line 129
    array-length v5, v3

    .line 130
    if-ge v5, p1, :cond_3

    .line 131
    .line 132
    array-length v3, v3

    .line 133
    mul-int/lit8 v3, v3, 0x2

    .line 134
    .line 135
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    const/16 v3, 0x1002

    .line 140
    .line 141
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {v4, p1}, Ld0/p;->b(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    invoke-virtual {p2}, Ld0/p;->a()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget v3, p0, Ll1/B;->c:I

    .line 154
    .line 155
    iget v5, p0, Ll1/B;->d:I

    .line 156
    .line 157
    sub-int/2addr v3, v5

    .line 158
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    iget-object v3, v4, Ld0/p;->a:[B

    .line 163
    .line 164
    iget v5, p0, Ll1/B;->d:I

    .line 165
    .line 166
    invoke-virtual {p2, v3, v5, p1}, Ld0/p;->g([BII)V

    .line 167
    .line 168
    .line 169
    iget v3, p0, Ll1/B;->d:I

    .line 170
    .line 171
    add-int/2addr v3, p1

    .line 172
    iput v3, p0, Ll1/B;->d:I

    .line 173
    .line 174
    iget p1, p0, Ll1/B;->c:I

    .line 175
    .line 176
    if-ne v3, p1, :cond_3

    .line 177
    .line 178
    iget-boolean v3, p0, Ll1/B;->e:Z

    .line 179
    .line 180
    if-eqz v3, :cond_8

    .line 181
    .line 182
    iget-object v3, v4, Ld0/p;->a:[B

    .line 183
    .line 184
    invoke-static {v1, p1, v2, v3}, Ld0/w;->l(III[B)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_7

    .line 189
    .line 190
    iput-boolean v0, p0, Ll1/B;->f:Z

    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    iget p1, p0, Ll1/B;->c:I

    .line 194
    .line 195
    add-int/lit8 p1, p1, -0x4

    .line 196
    .line 197
    invoke-virtual {v4, p1}, Ld0/p;->G(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    invoke-virtual {v4, p1}, Ld0/p;->G(I)V

    .line 202
    .line 203
    .line 204
    :goto_4
    invoke-virtual {v4, v1}, Ld0/p;->H(I)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Ll1/B;->a:Ll1/A;

    .line 208
    .line 209
    invoke-interface {p1, v4}, Ll1/A;->b(Ld0/p;)V

    .line 210
    .line 211
    .line 212
    iput v1, p0, Ll1/B;->d:I

    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_9
    return-void
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

.method public final c(Ld0/u;LF0/s;Ll1/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/B;->a:Ll1/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ll1/A;->c(Ld0/u;LF0/s;Ll1/E;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ll1/B;->f:Z

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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
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
.end method
