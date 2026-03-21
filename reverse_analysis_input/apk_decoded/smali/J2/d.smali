.class public final LJ2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/s;


# instance fields
.field public final synthetic l:I

.field public final m:LZ1/e;


# direct methods
.method public synthetic constructor <init>(LZ1/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ2/d;->l:I

    iput-object p1, p0, LJ2/d;->m:LZ1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(LG2/e;LN2/a;)LG2/r;
    .locals 12

    .line 1
    iget-object v1, p0, LJ2/d;->m:LZ1/e;

    .line 2
    .line 3
    const-class v3, Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    iget v8, p0, LJ2/d;->l:I

    .line 10
    .line 11
    packed-switch v8, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v8, p2, LN2/a;->b:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    const-class v9, Ljava/util/Map;

    .line 17
    .line 18
    iget-object v10, p2, LN2/a;->a:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    if-nez v11, :cond_0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    const-class v5, Ljava/util/Properties;

    .line 29
    .line 30
    invoke-virtual {v5, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    new-array v3, v4, [Ljava/lang/reflect/Type;

    .line 37
    .line 38
    const-class v4, Ljava/lang/String;

    .line 39
    .line 40
    aput-object v4, v3, v7

    .line 41
    .line 42
    aput-object v4, v3, v6

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v5, v8, Ljava/lang/reflect/WildcardType;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    check-cast v8, Ljava/lang/reflect/WildcardType;

    .line 50
    .line 51
    invoke-interface {v8}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    aget-object v8, v5, v7

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-static {v5}, LI2/d;->b(Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {v8, v10, v9}, LI2/d;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    new-instance v9, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v8, v10, v5, v9}, LI2/d;->k(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    instance-of v8, v5, Ljava/lang/reflect/ParameterizedType;

    .line 78
    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    new-array v4, v4, [Ljava/lang/reflect/Type;

    .line 89
    .line 90
    aput-object v3, v4, v7

    .line 91
    .line 92
    aput-object v3, v4, v6

    .line 93
    .line 94
    move-object v3, v4

    .line 95
    :goto_0
    aget-object v4, v3, v7

    .line 96
    .line 97
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    if-eq v4, v5, :cond_5

    .line 100
    .line 101
    const-class v5, Ljava/lang/Boolean;

    .line 102
    .line 103
    if-ne v4, v5, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    new-instance v5, LN2/a;

    .line 107
    .line 108
    invoke-direct {v5, v4}, LN2/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v5}, LG2/e;->c(LN2/a;)LG2/r;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    goto :goto_2

    .line 116
    :cond_5
    :goto_1
    sget-object v4, LJ2/j0;->c:LJ2/d0;

    .line 117
    .line 118
    :goto_2
    aget-object v5, v3, v6

    .line 119
    .line 120
    new-instance v8, LN2/a;

    .line 121
    .line 122
    invoke-direct {v8, v5}, LN2/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v8}, LG2/e;->c(LN2/a;)LG2/r;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v1, p2}, LZ1/e;->p(LN2/a;)LI2/q;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    new-instance v10, LJ2/r;

    .line 134
    .line 135
    aget-object v5, v3, v7

    .line 136
    .line 137
    aget-object v6, v3, v6

    .line 138
    .line 139
    move-object v0, v10

    .line 140
    move-object v1, p0

    .line 141
    move-object v2, p1

    .line 142
    move-object v3, v5

    .line 143
    move-object v5, v6

    .line 144
    move-object v6, v8

    .line 145
    move-object v7, v9

    .line 146
    invoke-direct/range {v0 .. v7}, LJ2/r;-><init>(LJ2/d;LG2/e;Ljava/lang/reflect/Type;LG2/r;Ljava/lang/reflect/Type;LG2/r;LI2/q;)V

    .line 147
    .line 148
    .line 149
    move-object v5, v10

    .line 150
    :goto_3
    return-object v5

    .line 151
    :pswitch_0
    iget-object v4, p2, LN2/a;->b:Ljava/lang/reflect/Type;

    .line 152
    .line 153
    const-class v6, Ljava/util/Collection;

    .line 154
    .line 155
    iget-object v8, p2, LN2/a;->a:Ljava/lang/Class;

    .line 156
    .line 157
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-nez v9, :cond_6

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    instance-of v5, v4, Ljava/lang/reflect/WildcardType;

    .line 165
    .line 166
    if-eqz v5, :cond_7

    .line 167
    .line 168
    check-cast v4, Ljava/lang/reflect/WildcardType;

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    aget-object v4, v4, v7

    .line 175
    .line 176
    :cond_7
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-static {v5}, LI2/d;->b(Z)V

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v8, v6}, LI2/d;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    new-instance v6, Ljava/util/HashMap;

    .line 188
    .line 189
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-static {v4, v8, v5, v6}, LI2/d;->k(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    .line 197
    .line 198
    if-eqz v5, :cond_8

    .line 199
    .line 200
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 201
    .line 202
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    aget-object v3, v3, v7

    .line 207
    .line 208
    :cond_8
    new-instance v4, LN2/a;

    .line 209
    .line 210
    invoke-direct {v4, v3}, LN2/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v4}, LG2/e;->c(LN2/a;)LG2/r;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v1, p2}, LZ1/e;->p(LN2/a;)LI2/q;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v5, LJ2/c;

    .line 222
    .line 223
    invoke-direct {v5, p1, v3, v4, v0}, LJ2/c;-><init>(LG2/e;Ljava/lang/reflect/Type;LG2/r;LI2/q;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    return-object v5

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
