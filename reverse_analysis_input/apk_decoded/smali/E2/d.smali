.class public final LE2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    .line 1
    iput p1, p0, LE2/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-static {p1}, Lm/B0;->f(I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance p1, Lt2/b;

    .line 17
    .line 18
    invoke-direct {p1, p2}, Lt2/b;-><init>([B)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LE2/d;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 25
    .line 26
    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lt2/d;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    invoke-direct {p1, v0, p2}, Lt2/d;-><init>(I[B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LE2/d;->b:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lt2/d;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {p1, v0, p2}, Lt2/d;-><init>(I[B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LE2/d;->b:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final a([B[B)[B
    .locals 11

    .line 1
    iget v0, p0, LE2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    add-int/lit8 v0, v0, 0x28

    .line 8
    .line 9
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x18

    .line 14
    .line 15
    invoke-static {v1}, LE2/n;->a(I)[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, LE2/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lt2/d;

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1, p1, p2}, Lt2/d;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :pswitch_0
    array-length v0, p1

    .line 35
    add-int/lit8 v0, v0, 0x1c

    .line 36
    .line 37
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 v1, 0xc

    .line 42
    .line 43
    invoke-static {v1}, LE2/n;->a(I)[B

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, LE2/d;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lt2/d;

    .line 53
    .line 54
    invoke-virtual {v2, v0, v1, p1, p2}, Lt2/d;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_1
    const/16 v0, 0xc

    .line 63
    .line 64
    invoke-static {v0}, LE2/n;->a(I)[B

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v2, p0, LE2/d;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lt2/b;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    array-length v3, v1

    .line 76
    if-ne v3, v0, :cond_6

    .line 77
    .line 78
    array-length v3, p1

    .line 79
    const v4, 0x7fffffe3

    .line 80
    .line 81
    .line 82
    if-gt v3, v4, :cond_5

    .line 83
    .line 84
    iget-boolean v3, v2, Lt2/b;->b:Z

    .line 85
    .line 86
    if-eqz v3, :cond_0

    .line 87
    .line 88
    array-length v4, p1

    .line 89
    add-int/lit8 v4, v4, 0x1c

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    array-length v4, p1

    .line 93
    add-int/lit8 v4, v4, 0x10

    .line 94
    .line 95
    :goto_0
    new-array v4, v4, [B

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    if-eqz v3, :cond_1

    .line 99
    .line 100
    invoke-static {v1, v5, v4, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-static {v1}, Lt2/b;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v6, Lt2/b;->c:LE2/a;

    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, Ljavax/crypto/Cipher;

    .line 114
    .line 115
    iget-object v2, v2, Lt2/b;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 116
    .line 117
    const/4 v8, 0x1

    .line 118
    invoke-virtual {v7, v8, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 119
    .line 120
    .line 121
    if-eqz p2, :cond_2

    .line 122
    .line 123
    array-length v1, p2

    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljavax/crypto/Cipher;

    .line 131
    .line 132
    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 133
    .line 134
    .line 135
    :cond_2
    if-eqz v3, :cond_3

    .line 136
    .line 137
    move v10, v0

    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move v10, v5

    .line 140
    :goto_1
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    move-object v5, p2

    .line 145
    check-cast v5, Ljavax/crypto/Cipher;

    .line 146
    .line 147
    const/4 v7, 0x0

    .line 148
    array-length v8, p1

    .line 149
    move-object v6, p1

    .line 150
    move-object v9, v4

    .line 151
    invoke-virtual/range {v5 .. v10}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    array-length v0, p1

    .line 156
    add-int/lit8 v0, v0, 0x10

    .line 157
    .line 158
    if-ne p2, v0, :cond_4

    .line 159
    .line 160
    return-object v4

    .line 161
    :cond_4
    array-length p1, p1

    .line 162
    sub-int/2addr p2, p1

    .line 163
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 164
    .line 165
    const-string v0, "encryption failed; GCM tag must be 16 bytes, but got only "

    .line 166
    .line 167
    const-string v1, " bytes"

    .line 168
    .line 169
    invoke-static {p2, v0, v1}, Lb3/a;->h(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 178
    .line 179
    const-string p2, "plaintext too long"

    .line 180
    .line 181
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 186
    .line 187
    const-string p2, "iv is wrong size"

    .line 188
    .line 189
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final b([B[B)[B
    .locals 8

    .line 1
    iget v0, p0, LE2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/16 v1, 0x28

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x18

    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v2, p1

    .line 18
    sub-int/2addr v2, v0

    .line 19
    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, LE2/d;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lt2/d;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1, p2}, Lt2/d;->a(Ljava/nio/ByteBuffer;[B[B)[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 33
    .line 34
    const-string p2, "ciphertext too short"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :pswitch_0
    array-length v0, p1

    .line 41
    const/16 v1, 0x1c

    .line 42
    .line 43
    if-lt v0, v1, :cond_1

    .line 44
    .line 45
    const/16 v0, 0xc

    .line 46
    .line 47
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    array-length v2, p1

    .line 52
    sub-int/2addr v2, v0

    .line 53
    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v0, p0, LE2/d;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lt2/d;

    .line 60
    .line 61
    invoke-virtual {v0, p1, v1, p2}, Lt2/d;->a(Ljava/nio/ByteBuffer;[B[B)[B

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    const-string p2, "ciphertext too short"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :pswitch_1
    const/16 v0, 0xc

    .line 75
    .line 76
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, LE2/d;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lt2/b;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    array-length v3, v1

    .line 88
    if-ne v3, v0, :cond_9

    .line 89
    .line 90
    iget-boolean v3, v2, Lt2/b;->b:Z

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    const/16 v4, 0x1c

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const/16 v4, 0x10

    .line 98
    .line 99
    :goto_0
    array-length v5, p1

    .line 100
    if-lt v5, v4, :cond_8

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {p1, v4, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 121
    .line 122
    const-string p2, "iv does not match prepended iv"

    .line 123
    .line 124
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_4
    :goto_1
    invoke-static {v1}, Lt2/b;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v5, Lt2/b;->c:LE2/a;

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Ljavax/crypto/Cipher;

    .line 139
    .line 140
    iget-object v2, v2, Lt2/b;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 141
    .line 142
    const/4 v7, 0x2

    .line 143
    invoke-virtual {v6, v7, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 144
    .line 145
    .line 146
    if-eqz p2, :cond_5

    .line 147
    .line 148
    array-length v1, p2

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljavax/crypto/Cipher;

    .line 156
    .line 157
    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 158
    .line 159
    .line 160
    :cond_5
    if-eqz v3, :cond_6

    .line 161
    .line 162
    move v4, v0

    .line 163
    :cond_6
    array-length p2, p1

    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    sub-int/2addr p2, v0

    .line 167
    :cond_7
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljavax/crypto/Cipher;

    .line 172
    .line 173
    invoke-virtual {v0, p1, v4, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 179
    .line 180
    const-string p2, "ciphertext too short"

    .line 181
    .line 182
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 187
    .line 188
    const-string p2, "iv is wrong size"

    .line 189
    .line 190
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
