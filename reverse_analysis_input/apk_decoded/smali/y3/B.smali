.class public final synthetic Ly3/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/b;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ly3/j;


# direct methods
.method public synthetic constructor <init>(Ly3/j;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly3/B;->l:I

    iput-object p1, p0, Ly3/B;->m:Ly3/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;LZ1/l;)V
    .locals 3

    .line 1
    iget v0, p0, Ly3/B;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly3/B;->m:Ly3/j;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v2, "null cannot be cast to non-null type android.net.http.SslCertificate"

    .line 21
    .line 22
    invoke-static {p1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Landroid/net/http/SslCertificate;

    .line 26
    .line 27
    :try_start_0
    iget-object v0, v0, Ly3/j;->a:LA/e;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v2, 0x1d

    .line 35
    .line 36
    if-lt v0, v2, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    :cond_0
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lq0/s;->a(Landroid/net/http/SslCertificate;)Ljava/security/cert/X509Certificate;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string p1, "SslCertificateProxyApi"

    .line 47
    .line 48
    const-string v0, "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q."

    .line 49
    .line 50
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    :goto_0
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_1
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_0
    iget-object v0, p0, Ly3/B;->m:Ly3/j;

    .line 69
    .line 70
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 71
    .line 72
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    check-cast p1, Ljava/util/List;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate"

    .line 83
    .line 84
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    check-cast p1, Landroid/net/http/SslCertificate;

    .line 88
    .line 89
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/net/http/SslCertificate;->getValidNotBeforeDate()Ljava/util/Date;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    const/4 p1, 0x0

    .line 108
    :goto_2
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    goto :goto_3

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_3
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_1
    iget-object v0, p0, Ly3/B;->m:Ly3/j;

    .line 123
    .line 124
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 125
    .line 126
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    check-cast p1, Ljava/util/List;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate"

    .line 137
    .line 138
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    check-cast p1, Landroid/net/http/SslCertificate;

    .line 142
    .line 143
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/net/http/SslCertificate;->getValidNotAfterDate()Ljava/util/Date;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_3

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 153
    .line 154
    .line 155
    move-result-wide v0

    .line 156
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    goto :goto_4

    .line 161
    :cond_3
    const/4 p1, 0x0

    .line 162
    :goto_4
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 166
    goto :goto_5

    .line 167
    :catchall_2
    move-exception p1

    .line 168
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :goto_5
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_2
    iget-object v0, p0, Ly3/B;->m:Ly3/j;

    .line 177
    .line 178
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 179
    .line 180
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    check-cast p1, Ljava/util/List;

    .line 184
    .line 185
    const/4 v1, 0x0

    .line 186
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate"

    .line 191
    .line 192
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    check-cast p1, Landroid/net/http/SslCertificate;

    .line 196
    .line 197
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/net/http/SslCertificate;->getIssuedTo()Landroid/net/http/SslCertificate$DName;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 208
    goto :goto_6

    .line 209
    :catchall_3
    move-exception p1

    .line 210
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    :goto_6
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_3
    iget-object v0, p0, Ly3/B;->m:Ly3/j;

    .line 219
    .line 220
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 221
    .line 222
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    check-cast p1, Ljava/util/List;

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate"

    .line 233
    .line 234
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    check-cast p1, Landroid/net/http/SslCertificate;

    .line 238
    .line 239
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/net/http/SslCertificate;->getIssuedBy()Landroid/net/http/SslCertificate$DName;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 250
    goto :goto_7

    .line 251
    :catchall_4
    move-exception p1

    .line 252
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    :goto_7
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
