.class public final LS2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# static fields
.field public static m:LS2/g;


# instance fields
.field public l:Ln3/q;


# virtual methods
.method public final onMethodCall(Ln3/n;Ln3/p;)V
    .locals 11

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    iget-object v1, p1, Ln3/n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<*>"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    iget-object p1, p1, Ln3/n;->a:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_36

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/16 v5, 0x1c

    .line 28
    .line 29
    const/16 v6, 0x1d

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/16 v8, 0x1f

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const-string v10, "null cannot be cast to non-null type kotlin.Int"

    .line 36
    .line 37
    sparse-switch v2, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :sswitch_0
    :try_start_1
    const-string v1, "generateAudioSessionId"

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_0
    sget-object p1, LS2/a;->m:LS2/g;

    .line 53
    .line 54
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 58
    .line 59
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    move-object v1, p2

    .line 71
    check-cast v1, LP2/c;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :catch_0
    move-exception p1

    .line 79
    goto/16 :goto_2

    .line 80
    .line 81
    :sswitch_1
    const-string v1, "isVolumeFixed"

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_1
    sget-object p1, LS2/a;->m:LS2/g;

    .line 92
    .line 93
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 97
    .line 98
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/media/AudioManager;->isVolumeFixed()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    move-object v1, p2

    .line 110
    check-cast v1, LP2/c;

    .line 111
    .line 112
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :sswitch_2
    const-string v2, "setMode"

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_2

    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_2
    sget-object p1, LS2/a;->m:LS2/g;

    .line 128
    .line 129
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    check-cast v1, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 146
    .line 147
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 151
    .line 152
    .line 153
    move-object p1, p2

    .line 154
    check-cast p1, LP2/c;

    .line 155
    .line 156
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_3

    .line 160
    .line 161
    :sswitch_3
    const-string v1, "getAvailableCommunicationDevices"

    .line 162
    .line 163
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_3

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 172
    .line 173
    if-lt p1, v8, :cond_4

    .line 174
    .line 175
    sget-object p1, LS2/a;->m:LS2/g;

    .line 176
    .line 177
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, LS2/g;->e()Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    move-object v1, p2

    .line 185
    check-cast v1, LP2/c;

    .line 186
    .line 187
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    :cond_4
    new-instance p1, LA1/c;

    .line 193
    .line 194
    invoke-direct {p1, v8}, LA1/c;-><init>(I)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :sswitch_4
    const-string v2, "playSoundEffect"

    .line 199
    .line 200
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_5

    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :cond_5
    sget-object p1, LS2/a;->m:LS2/g;

    .line 209
    .line 210
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    check-cast v2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/lang/Double;

    .line 231
    .line 232
    if-eqz v1, :cond_6

    .line 233
    .line 234
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 235
    .line 236
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 240
    .line 241
    .line 242
    move-result-wide v3

    .line 243
    double-to-float v1, v3

    .line 244
    invoke-virtual {p1, v2, v1}, Landroid/media/AudioManager;->playSoundEffect(IF)V

    .line 245
    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_6
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 249
    .line 250
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v2}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 254
    .line 255
    .line 256
    :goto_0
    move-object p1, p2

    .line 257
    check-cast p1, LP2/c;

    .line 258
    .line 259
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_3

    .line 263
    .line 264
    :sswitch_5
    const-string v2, "setRingerMode"

    .line 265
    .line 266
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-nez p1, :cond_7

    .line 271
    .line 272
    goto/16 :goto_1

    .line 273
    .line 274
    :cond_7
    sget-object p1, LS2/a;->m:LS2/g;

    .line 275
    .line 276
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    check-cast v1, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 293
    .line 294
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setRingerMode(I)V

    .line 298
    .line 299
    .line 300
    move-object p1, p2

    .line 301
    check-cast p1, LP2/c;

    .line 302
    .line 303
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_3

    .line 307
    .line 308
    :sswitch_6
    const-string v1, "unloadSoundEffects"

    .line 309
    .line 310
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-nez p1, :cond_8

    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :cond_8
    sget-object p1, LS2/a;->m:LS2/g;

    .line 319
    .line 320
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 324
    .line 325
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Landroid/media/AudioManager;->unloadSoundEffects()V

    .line 329
    .line 330
    .line 331
    move-object p1, p2

    .line 332
    check-cast p1, LP2/c;

    .line 333
    .line 334
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :sswitch_7
    const-string v1, "abandonAudioFocus"

    .line 340
    .line 341
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-nez p1, :cond_9

    .line 346
    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :cond_9
    sget-object p1, LS2/a;->m:LS2/g;

    .line 350
    .line 351
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1}, LS2/g;->a()Z

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    move-object v1, p2

    .line 363
    check-cast v1, LP2/c;

    .line 364
    .line 365
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_3

    .line 369
    .line 370
    :sswitch_8
    const-string v2, "adjustSuggestedStreamVolume"

    .line 371
    .line 372
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    if-nez p1, :cond_a

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :cond_a
    sget-object p1, LS2/a;->m:LS2/g;

    .line 381
    .line 382
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    check-cast v2, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-static {v3, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    check-cast v3, Ljava/lang/Integer;

    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    check-cast v1, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 425
    .line 426
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 430
    .line 431
    .line 432
    move-object p1, p2

    .line 433
    check-cast p1, LP2/c;

    .line 434
    .line 435
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_3

    .line 439
    .line 440
    :sswitch_9
    const-string v1, "clearCommunicationDevice"

    .line 441
    .line 442
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    if-nez p1, :cond_b

    .line 447
    .line 448
    goto/16 :goto_1

    .line 449
    .line 450
    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 451
    .line 452
    if-lt p1, v8, :cond_c

    .line 453
    .line 454
    sget-object p1, LS2/a;->m:LS2/g;

    .line 455
    .line 456
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 460
    .line 461
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-static {p1}, LS2/c;->l(Landroid/media/AudioManager;)V

    .line 465
    .line 466
    .line 467
    move-object p1, p2

    .line 468
    check-cast p1, LP2/c;

    .line 469
    .line 470
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_3

    .line 474
    .line 475
    :cond_c
    new-instance p1, LA1/c;

    .line 476
    .line 477
    invoke-direct {p1, v8}, LA1/c;-><init>(I)V

    .line 478
    .line 479
    .line 480
    throw p1

    .line 481
    :sswitch_a
    const-string v2, "setStreamVolume"

    .line 482
    .line 483
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    if-nez p1, :cond_d

    .line 488
    .line 489
    goto/16 :goto_1

    .line 490
    .line 491
    :cond_d
    sget-object p1, LS2/a;->m:LS2/g;

    .line 492
    .line 493
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    check-cast v2, Ljava/lang/Integer;

    .line 504
    .line 505
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-static {v3, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    check-cast v3, Ljava/lang/Integer;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    check-cast v1, Ljava/lang/Integer;

    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 536
    .line 537
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 541
    .line 542
    .line 543
    move-object p1, p2

    .line 544
    check-cast p1, LP2/c;

    .line 545
    .line 546
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    goto/16 :goto_3

    .line 550
    .line 551
    :sswitch_b
    const-string v1, "getAllowedCapturePolicy"

    .line 552
    .line 553
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result p1

    .line 557
    if-nez p1, :cond_e

    .line 558
    .line 559
    goto/16 :goto_1

    .line 560
    .line 561
    :cond_e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 562
    .line 563
    if-lt p1, v6, :cond_f

    .line 564
    .line 565
    sget-object p1, LS2/a;->m:LS2/g;

    .line 566
    .line 567
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 571
    .line 572
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-static {p1}, LD/Q;->a(Landroid/media/AudioManager;)I

    .line 576
    .line 577
    .line 578
    move-result p1

    .line 579
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    move-object v1, p2

    .line 584
    check-cast v1, LP2/c;

    .line 585
    .line 586
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_3

    .line 590
    .line 591
    :cond_f
    new-instance p1, LA1/c;

    .line 592
    .line 593
    invoke-direct {p1, v6}, LA1/c;-><init>(I)V

    .line 594
    .line 595
    .line 596
    throw p1

    .line 597
    :sswitch_c
    const-string v2, "getProperty"

    .line 598
    .line 599
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result p1

    .line 603
    if-nez p1, :cond_10

    .line 604
    .line 605
    goto/16 :goto_1

    .line 606
    .line 607
    :cond_10
    sget-object p1, LS2/a;->m:LS2/g;

    .line 608
    .line 609
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Ljava/lang/String;

    .line 617
    .line 618
    iget-object p1, p1, LS2/g;->f:Landroid/media/AudioManager;

    .line 619
    .line 620
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    const-string v1, "getProperty(...)"

    .line 628
    .line 629
    invoke-static {p1, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    move-object v1, p2

    .line 633
    check-cast v1, LP2/c;

    .line 634
    .line 635
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    goto/16 :goto_3

    .line 639
    .line 640
    :sswitch_d
    const-string v2, "isStreamMute"

    .line 641
    .line 642
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result p1

    .line 646
    if-nez p1, :cond_11

    .line 647
    .line 648
    goto/16 :goto_1

    .line 649
    .line 650
    :cond_11
    sget-object p1, LS2/a;->m:LS2/g;

    .line 651
    .line 652
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    check-cast v1, Ljava/lang/Integer;

    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    invoke-virtual {p1, v1}, LS2/g;->w(I)Ljava/lang/Boolean;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    move-object v1, p2

    .line 673
    check-cast v1, LP2/c;

    .line 674
    .line 675
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_3

    .line 679
    .line 680
    :sswitch_e
    const-string v2, "adjustVolume"

    .line 681
    .line 682
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result p1

    .line 686
    if-nez p1, :cond_12

    .line 687
    .line 688
    goto/16 :goto_1

    .line 689
    .line 690
    :cond_12
    sget-object p1, LS2/a;->m:LS2/g;

    .line 691
    .line 692
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    check-cast v2, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    check-cast v1, Ljava/lang/Integer;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    invoke-virtual {p1, v2, v1}, LS2/g;->c(II)V

    .line 722
    .line 723
    .line 724
    move-object p1, p2

    .line 725
    check-cast p1, LP2/c;

    .line 726
    .line 727
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    goto/16 :goto_3

    .line 731
    .line 732
    :sswitch_f
    const-string v2, "setParameters"

    .line 733
    .line 734
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result p1

    .line 738
    if-nez p1, :cond_13

    .line 739
    .line 740
    goto/16 :goto_1

    .line 741
    .line 742
    :cond_13
    sget-object p1, LS2/a;->m:LS2/g;

    .line 743
    .line 744
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    check-cast v1, Ljava/lang/String;

    .line 752
    .line 753
    invoke-virtual {p1, v1}, LS2/g;->D(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    move-object p1, p2

    .line 757
    check-cast p1, LP2/c;

    .line 758
    .line 759
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_3

    .line 763
    .line 764
    :sswitch_10
    const-string v1, "getRingerMode"

    .line 765
    .line 766
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result p1

    .line 770
    if-nez p1, :cond_14

    .line 771
    .line 772
    goto/16 :goto_1

    .line 773
    .line 774
    :cond_14
    sget-object p1, LS2/a;->m:LS2/g;

    .line 775
    .line 776
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {p1}, LS2/g;->k()Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object p1

    .line 783
    move-object v1, p2

    .line 784
    check-cast v1, LP2/c;

    .line 785
    .line 786
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    goto/16 :goto_3

    .line 790
    .line 791
    :sswitch_11
    const-string v1, "isBluetoothScoAvailableOffCall"

    .line 792
    .line 793
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result p1

    .line 797
    if-nez p1, :cond_15

    .line 798
    .line 799
    goto/16 :goto_1

    .line 800
    .line 801
    :cond_15
    sget-object p1, LS2/a;->m:LS2/g;

    .line 802
    .line 803
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {p1}, LS2/g;->q()Ljava/lang/Boolean;

    .line 807
    .line 808
    .line 809
    move-result-object p1

    .line 810
    move-object v1, p2

    .line 811
    check-cast v1, LP2/c;

    .line 812
    .line 813
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    goto/16 :goto_3

    .line 817
    .line 818
    :sswitch_12
    const-string v2, "getStreamVolume"

    .line 819
    .line 820
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result p1

    .line 824
    if-nez p1, :cond_16

    .line 825
    .line 826
    goto/16 :goto_1

    .line 827
    .line 828
    :cond_16
    sget-object p1, LS2/a;->m:LS2/g;

    .line 829
    .line 830
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    check-cast v1, Ljava/lang/Integer;

    .line 841
    .line 842
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 843
    .line 844
    .line 845
    move-result v1

    .line 846
    invoke-virtual {p1, v1}, LS2/g;->n(I)Ljava/lang/Integer;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    move-object v1, p2

    .line 851
    check-cast v1, LP2/c;

    .line 852
    .line 853
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    goto/16 :goto_3

    .line 857
    .line 858
    :sswitch_13
    const-string v1, "stopBluetoothSco"

    .line 859
    .line 860
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result p1

    .line 864
    if-nez p1, :cond_17

    .line 865
    .line 866
    goto/16 :goto_1

    .line 867
    .line 868
    :cond_17
    sget-object p1, LS2/a;->m:LS2/g;

    .line 869
    .line 870
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {p1}, LS2/g;->G()V

    .line 874
    .line 875
    .line 876
    move-object p1, p2

    .line 877
    check-cast p1, LP2/c;

    .line 878
    .line 879
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    goto/16 :goto_3

    .line 883
    .line 884
    :sswitch_14
    const-string v2, "getParameters"

    .line 885
    .line 886
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result p1

    .line 890
    if-nez p1, :cond_18

    .line 891
    .line 892
    goto/16 :goto_1

    .line 893
    .line 894
    :cond_18
    sget-object p1, LS2/a;->m:LS2/g;

    .line 895
    .line 896
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    check-cast v1, Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {p1, v1}, LS2/g;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object p1

    .line 909
    move-object v1, p2

    .line 910
    check-cast v1, LP2/c;

    .line 911
    .line 912
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    goto/16 :goto_3

    .line 916
    .line 917
    :sswitch_15
    const-string v2, "dispatchMediaKeyEvent"

    .line 918
    .line 919
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result p1

    .line 923
    if-nez p1, :cond_19

    .line 924
    .line 925
    goto/16 :goto_1

    .line 926
    .line 927
    :cond_19
    sget-object p1, LS2/a;->m:LS2/g;

    .line 928
    .line 929
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    .line 937
    .line 938
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    check-cast v1, Ljava/util/Map;

    .line 942
    .line 943
    invoke-virtual {p1, v1}, LS2/g;->d(Ljava/util/Map;)V

    .line 944
    .line 945
    .line 946
    move-object p1, p2

    .line 947
    check-cast p1, LP2/c;

    .line 948
    .line 949
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    goto/16 :goto_3

    .line 953
    .line 954
    :sswitch_16
    const-string v1, "getMode"

    .line 955
    .line 956
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result p1

    .line 960
    if-nez p1, :cond_1a

    .line 961
    .line 962
    goto/16 :goto_1

    .line 963
    .line 964
    :cond_1a
    sget-object p1, LS2/a;->m:LS2/g;

    .line 965
    .line 966
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {p1}, LS2/g;->i()Ljava/lang/Integer;

    .line 970
    .line 971
    .line 972
    move-result-object p1

    .line 973
    move-object v1, p2

    .line 974
    check-cast v1, LP2/c;

    .line 975
    .line 976
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_3

    .line 980
    .line 981
    :sswitch_17
    const-string v2, "getStreamVolumeDb"

    .line 982
    .line 983
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result p1

    .line 987
    if-nez p1, :cond_1b

    .line 988
    .line 989
    goto/16 :goto_1

    .line 990
    .line 991
    :cond_1b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 992
    .line 993
    if-lt p1, v5, :cond_1c

    .line 994
    .line 995
    sget-object p1, LS2/a;->m:LS2/g;

    .line 996
    .line 997
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    check-cast v2, Ljava/lang/Integer;

    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    invoke-static {v3, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    check-cast v3, Ljava/lang/Integer;

    .line 1021
    .line 1022
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    check-cast v1, Ljava/lang/Integer;

    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1036
    .line 1037
    .line 1038
    move-result v1

    .line 1039
    invoke-virtual {p1, v2, v3, v1}, LS2/g;->o(III)Ljava/lang/Float;

    .line 1040
    .line 1041
    .line 1042
    move-result-object p1

    .line 1043
    move-object v1, p2

    .line 1044
    check-cast v1, LP2/c;

    .line 1045
    .line 1046
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1047
    .line 1048
    .line 1049
    goto/16 :goto_3

    .line 1050
    .line 1051
    :cond_1c
    new-instance p1, LA1/c;

    .line 1052
    .line 1053
    invoke-direct {p1, v5}, LA1/c;-><init>(I)V

    .line 1054
    .line 1055
    .line 1056
    throw p1

    .line 1057
    :sswitch_18
    const-string v2, "setCommunicationDevice"

    .line 1058
    .line 1059
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result p1

    .line 1063
    if-nez p1, :cond_1d

    .line 1064
    .line 1065
    goto/16 :goto_1

    .line 1066
    .line 1067
    :cond_1d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1068
    .line 1069
    if-lt p1, v8, :cond_1e

    .line 1070
    .line 1071
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1072
    .line 1073
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    check-cast v1, Ljava/lang/Integer;

    .line 1084
    .line 1085
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1086
    .line 1087
    .line 1088
    move-result v1

    .line 1089
    invoke-virtual {p1, v1}, LS2/g;->B(I)Z

    .line 1090
    .line 1091
    .line 1092
    move-result p1

    .line 1093
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    move-object v1, p2

    .line 1098
    check-cast v1, LP2/c;

    .line 1099
    .line 1100
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    goto/16 :goto_3

    .line 1104
    .line 1105
    :cond_1e
    new-instance p1, LA1/c;

    .line 1106
    .line 1107
    invoke-direct {p1, v8}, LA1/c;-><init>(I)V

    .line 1108
    .line 1109
    .line 1110
    throw p1

    .line 1111
    :sswitch_19
    const-string v1, "startBluetoothSco"

    .line 1112
    .line 1113
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result p1

    .line 1117
    if-nez p1, :cond_1f

    .line 1118
    .line 1119
    goto/16 :goto_1

    .line 1120
    .line 1121
    :cond_1f
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1122
    .line 1123
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {p1}, LS2/g;->F()V

    .line 1127
    .line 1128
    .line 1129
    move-object p1, p2

    .line 1130
    check-cast p1, LP2/c;

    .line 1131
    .line 1132
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1133
    .line 1134
    .line 1135
    goto/16 :goto_3

    .line 1136
    .line 1137
    :sswitch_1a
    const-string v1, "isMusicActive"

    .line 1138
    .line 1139
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result p1

    .line 1143
    if-nez p1, :cond_20

    .line 1144
    .line 1145
    goto/16 :goto_1

    .line 1146
    .line 1147
    :cond_20
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1148
    .line 1149
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {p1}, LS2/g;->u()Ljava/lang/Boolean;

    .line 1153
    .line 1154
    .line 1155
    move-result-object p1

    .line 1156
    move-object v1, p2

    .line 1157
    check-cast v1, LP2/c;

    .line 1158
    .line 1159
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1160
    .line 1161
    .line 1162
    goto/16 :goto_3

    .line 1163
    .line 1164
    :sswitch_1b
    const-string v1, "loadSoundEffects"

    .line 1165
    .line 1166
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result p1

    .line 1170
    if-nez p1, :cond_21

    .line 1171
    .line 1172
    goto/16 :goto_1

    .line 1173
    .line 1174
    :cond_21
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1175
    .line 1176
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {p1}, LS2/g;->x()V

    .line 1180
    .line 1181
    .line 1182
    move-object p1, p2

    .line 1183
    check-cast p1, LP2/c;

    .line 1184
    .line 1185
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1186
    .line 1187
    .line 1188
    goto/16 :goto_3

    .line 1189
    .line 1190
    :sswitch_1c
    const-string v2, "getStreamMinVolume"

    .line 1191
    .line 1192
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result p1

    .line 1196
    if-nez p1, :cond_22

    .line 1197
    .line 1198
    goto/16 :goto_1

    .line 1199
    .line 1200
    :cond_22
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1201
    .line 1202
    if-lt p1, v5, :cond_23

    .line 1203
    .line 1204
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1205
    .line 1206
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    check-cast v1, Ljava/lang/Integer;

    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    invoke-virtual {p1, v1}, LS2/g;->m(I)Ljava/lang/Integer;

    .line 1223
    .line 1224
    .line 1225
    move-result-object p1

    .line 1226
    move-object v1, p2

    .line 1227
    check-cast v1, LP2/c;

    .line 1228
    .line 1229
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    goto/16 :goto_3

    .line 1233
    .line 1234
    :cond_23
    new-instance p1, LA1/c;

    .line 1235
    .line 1236
    invoke-direct {p1, v5}, LA1/c;-><init>(I)V

    .line 1237
    .line 1238
    .line 1239
    throw p1

    .line 1240
    :sswitch_1d
    const-string v2, "setBluetoothScoOn"

    .line 1241
    .line 1242
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result p1

    .line 1246
    if-nez p1, :cond_24

    .line 1247
    .line 1248
    goto/16 :goto_1

    .line 1249
    .line 1250
    :cond_24
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1251
    .line 1252
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1253
    .line 1254
    .line 1255
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    check-cast v1, Ljava/lang/Boolean;

    .line 1263
    .line 1264
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1265
    .line 1266
    .line 1267
    move-result v1

    .line 1268
    invoke-virtual {p1, v1}, LS2/g;->A(Z)V

    .line 1269
    .line 1270
    .line 1271
    move-object p1, p2

    .line 1272
    check-cast p1, LP2/c;

    .line 1273
    .line 1274
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1275
    .line 1276
    .line 1277
    goto/16 :goto_3

    .line 1278
    .line 1279
    :sswitch_1e
    const-string v2, "setAllowedCapturePolicy"

    .line 1280
    .line 1281
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result p1

    .line 1285
    if-nez p1, :cond_25

    .line 1286
    .line 1287
    goto/16 :goto_1

    .line 1288
    .line 1289
    :cond_25
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1290
    .line 1291
    if-lt p1, v6, :cond_26

    .line 1292
    .line 1293
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1294
    .line 1295
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    check-cast v1, Ljava/lang/Integer;

    .line 1306
    .line 1307
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1308
    .line 1309
    .line 1310
    move-result v1

    .line 1311
    invoke-virtual {p1, v1}, LS2/g;->z(I)V

    .line 1312
    .line 1313
    .line 1314
    move-object p1, p2

    .line 1315
    check-cast p1, LP2/c;

    .line 1316
    .line 1317
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1318
    .line 1319
    .line 1320
    goto/16 :goto_3

    .line 1321
    .line 1322
    :cond_26
    new-instance p1, LA1/c;

    .line 1323
    .line 1324
    invoke-direct {p1, v6}, LA1/c;-><init>(I)V

    .line 1325
    .line 1326
    .line 1327
    throw p1

    .line 1328
    :sswitch_1f
    const-string v1, "getMicrophones"

    .line 1329
    .line 1330
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result p1

    .line 1334
    if-nez p1, :cond_27

    .line 1335
    .line 1336
    goto/16 :goto_1

    .line 1337
    .line 1338
    :cond_27
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1339
    .line 1340
    if-lt p1, v5, :cond_28

    .line 1341
    .line 1342
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1343
    .line 1344
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {p1}, LS2/g;->h()Ljava/util/ArrayList;

    .line 1348
    .line 1349
    .line 1350
    move-result-object p1

    .line 1351
    move-object v1, p2

    .line 1352
    check-cast v1, LP2/c;

    .line 1353
    .line 1354
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    goto/16 :goto_3

    .line 1358
    .line 1359
    :cond_28
    new-instance p1, LA1/c;

    .line 1360
    .line 1361
    invoke-direct {p1, v5}, LA1/c;-><init>(I)V

    .line 1362
    .line 1363
    .line 1364
    throw p1

    .line 1365
    :sswitch_20
    const-string v2, "adjustStreamVolume"

    .line 1366
    .line 1367
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result p1

    .line 1371
    if-nez p1, :cond_29

    .line 1372
    .line 1373
    goto/16 :goto_1

    .line 1374
    .line 1375
    :cond_29
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1376
    .line 1377
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v2

    .line 1384
    invoke-static {v2, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    check-cast v2, Ljava/lang/Integer;

    .line 1388
    .line 1389
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1390
    .line 1391
    .line 1392
    move-result v2

    .line 1393
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    invoke-static {v3, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    check-cast v3, Ljava/lang/Integer;

    .line 1401
    .line 1402
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1403
    .line 1404
    .line 1405
    move-result v3

    .line 1406
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1411
    .line 1412
    .line 1413
    check-cast v1, Ljava/lang/Integer;

    .line 1414
    .line 1415
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1416
    .line 1417
    .line 1418
    move-result v1

    .line 1419
    invoke-virtual {p1, v2, v3, v1}, LS2/g;->b(III)V

    .line 1420
    .line 1421
    .line 1422
    move-object p1, p2

    .line 1423
    check-cast p1, LP2/c;

    .line 1424
    .line 1425
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    goto/16 :goto_3

    .line 1429
    .line 1430
    :sswitch_21
    const-string v1, "isBluetoothScoOn"

    .line 1431
    .line 1432
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result p1

    .line 1436
    if-nez p1, :cond_2a

    .line 1437
    .line 1438
    goto/16 :goto_1

    .line 1439
    .line 1440
    :cond_2a
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1441
    .line 1442
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {p1}, LS2/g;->r()Ljava/lang/Boolean;

    .line 1446
    .line 1447
    .line 1448
    move-result-object p1

    .line 1449
    move-object v1, p2

    .line 1450
    check-cast v1, LP2/c;

    .line 1451
    .line 1452
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1453
    .line 1454
    .line 1455
    goto/16 :goto_3

    .line 1456
    .line 1457
    :sswitch_22
    const-string v2, "setSpeakerphoneOn"

    .line 1458
    .line 1459
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1460
    .line 1461
    .line 1462
    move-result p1

    .line 1463
    if-nez p1, :cond_2b

    .line 1464
    .line 1465
    goto/16 :goto_1

    .line 1466
    .line 1467
    :cond_2b
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1468
    .line 1469
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1470
    .line 1471
    .line 1472
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v1

    .line 1476
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1477
    .line 1478
    .line 1479
    check-cast v1, Ljava/lang/Boolean;

    .line 1480
    .line 1481
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v1

    .line 1485
    invoke-virtual {p1, v1}, LS2/g;->E(Z)V

    .line 1486
    .line 1487
    .line 1488
    move-object p1, p2

    .line 1489
    check-cast p1, LP2/c;

    .line 1490
    .line 1491
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1492
    .line 1493
    .line 1494
    goto/16 :goto_3

    .line 1495
    .line 1496
    :sswitch_23
    const-string v2, "setMicrophoneMute"

    .line 1497
    .line 1498
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result p1

    .line 1502
    if-nez p1, :cond_2c

    .line 1503
    .line 1504
    goto/16 :goto_1

    .line 1505
    .line 1506
    :cond_2c
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1507
    .line 1508
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    check-cast v1, Ljava/lang/Boolean;

    .line 1519
    .line 1520
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1521
    .line 1522
    .line 1523
    move-result v1

    .line 1524
    invoke-virtual {p1, v1}, LS2/g;->C(Z)V

    .line 1525
    .line 1526
    .line 1527
    move-object p1, p2

    .line 1528
    check-cast p1, LP2/c;

    .line 1529
    .line 1530
    invoke-virtual {p1, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1531
    .line 1532
    .line 1533
    goto/16 :goto_3

    .line 1534
    .line 1535
    :sswitch_24
    const-string v2, "requestAudioFocus"

    .line 1536
    .line 1537
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result p1

    .line 1541
    if-nez p1, :cond_2d

    .line 1542
    .line 1543
    goto/16 :goto_1

    .line 1544
    .line 1545
    :cond_2d
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1546
    .line 1547
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {p1, v1}, LS2/g;->y(Ljava/util/List;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result p1

    .line 1554
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1555
    .line 1556
    .line 1557
    move-result-object p1

    .line 1558
    move-object v1, p2

    .line 1559
    check-cast v1, LP2/c;

    .line 1560
    .line 1561
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1562
    .line 1563
    .line 1564
    goto/16 :goto_3

    .line 1565
    .line 1566
    :sswitch_25
    const-string v1, "isHapticPlaybackSupported"

    .line 1567
    .line 1568
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1569
    .line 1570
    .line 1571
    move-result p1

    .line 1572
    if-nez p1, :cond_2e

    .line 1573
    .line 1574
    goto/16 :goto_1

    .line 1575
    .line 1576
    :cond_2e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1577
    .line 1578
    if-lt p1, v6, :cond_2f

    .line 1579
    .line 1580
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1581
    .line 1582
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1583
    .line 1584
    .line 1585
    invoke-static {}, LS2/g;->s()Ljava/lang/Boolean;

    .line 1586
    .line 1587
    .line 1588
    move-result-object p1

    .line 1589
    move-object v1, p2

    .line 1590
    check-cast v1, LP2/c;

    .line 1591
    .line 1592
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1593
    .line 1594
    .line 1595
    goto/16 :goto_3

    .line 1596
    .line 1597
    :cond_2f
    new-instance p1, LA1/c;

    .line 1598
    .line 1599
    invoke-direct {p1, v6}, LA1/c;-><init>(I)V

    .line 1600
    .line 1601
    .line 1602
    throw p1

    .line 1603
    :sswitch_26
    const-string v1, "isSpeakerphoneOn"

    .line 1604
    .line 1605
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result p1

    .line 1609
    if-nez p1, :cond_30

    .line 1610
    .line 1611
    goto/16 :goto_1

    .line 1612
    .line 1613
    :cond_30
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1614
    .line 1615
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {p1}, LS2/g;->v()Ljava/lang/Boolean;

    .line 1619
    .line 1620
    .line 1621
    move-result-object p1

    .line 1622
    move-object v1, p2

    .line 1623
    check-cast v1, LP2/c;

    .line 1624
    .line 1625
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1626
    .line 1627
    .line 1628
    goto/16 :goto_3

    .line 1629
    .line 1630
    :sswitch_27
    const-string v2, "getStreamMaxVolume"

    .line 1631
    .line 1632
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1633
    .line 1634
    .line 1635
    move-result p1

    .line 1636
    if-nez p1, :cond_31

    .line 1637
    .line 1638
    goto/16 :goto_1

    .line 1639
    .line 1640
    :cond_31
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1641
    .line 1642
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1643
    .line 1644
    .line 1645
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v1

    .line 1649
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1650
    .line 1651
    .line 1652
    check-cast v1, Ljava/lang/Integer;

    .line 1653
    .line 1654
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1655
    .line 1656
    .line 1657
    move-result v1

    .line 1658
    invoke-virtual {p1, v1}, LS2/g;->l(I)Ljava/lang/Integer;

    .line 1659
    .line 1660
    .line 1661
    move-result-object p1

    .line 1662
    move-object v1, p2

    .line 1663
    check-cast v1, LP2/c;

    .line 1664
    .line 1665
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1666
    .line 1667
    .line 1668
    goto/16 :goto_3

    .line 1669
    .line 1670
    :sswitch_28
    const-string v1, "isMicrophoneMute"

    .line 1671
    .line 1672
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result p1

    .line 1676
    if-nez p1, :cond_32

    .line 1677
    .line 1678
    goto :goto_1

    .line 1679
    :cond_32
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1680
    .line 1681
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {p1}, LS2/g;->t()Ljava/lang/Boolean;

    .line 1685
    .line 1686
    .line 1687
    move-result-object p1

    .line 1688
    move-object v1, p2

    .line 1689
    check-cast v1, LP2/c;

    .line 1690
    .line 1691
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1692
    .line 1693
    .line 1694
    goto :goto_3

    .line 1695
    :sswitch_29
    const-string v2, "getDevices"

    .line 1696
    .line 1697
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result p1

    .line 1701
    if-nez p1, :cond_33

    .line 1702
    .line 1703
    goto :goto_1

    .line 1704
    :cond_33
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1705
    .line 1706
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1707
    .line 1708
    .line 1709
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v1

    .line 1713
    invoke-static {v1, v10}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1714
    .line 1715
    .line 1716
    check-cast v1, Ljava/lang/Integer;

    .line 1717
    .line 1718
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1719
    .line 1720
    .line 1721
    move-result v1

    .line 1722
    invoke-virtual {p1, v1}, LS2/g;->g(I)Ljava/util/ArrayList;

    .line 1723
    .line 1724
    .line 1725
    move-result-object p1

    .line 1726
    move-object v1, p2

    .line 1727
    check-cast v1, LP2/c;

    .line 1728
    .line 1729
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1730
    .line 1731
    .line 1732
    goto :goto_3

    .line 1733
    :sswitch_2a
    const-string v1, "getCommunicationDevice"

    .line 1734
    .line 1735
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1736
    .line 1737
    .line 1738
    move-result p1

    .line 1739
    if-nez p1, :cond_34

    .line 1740
    .line 1741
    goto :goto_1

    .line 1742
    :cond_34
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1743
    .line 1744
    if-lt p1, v8, :cond_35

    .line 1745
    .line 1746
    sget-object p1, LS2/a;->m:LS2/g;

    .line 1747
    .line 1748
    invoke-static {p1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {p1}, LS2/g;->f()Ljava/util/Map;

    .line 1752
    .line 1753
    .line 1754
    move-result-object p1

    .line 1755
    move-object v1, p2

    .line 1756
    check-cast v1, LP2/c;

    .line 1757
    .line 1758
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1759
    .line 1760
    .line 1761
    goto :goto_3

    .line 1762
    :cond_35
    new-instance p1, LA1/c;

    .line 1763
    .line 1764
    invoke-direct {p1, v8}, LA1/c;-><init>(I)V

    .line 1765
    .line 1766
    .line 1767
    throw p1

    .line 1768
    :cond_36
    :goto_1
    move-object p1, p2

    .line 1769
    check-cast p1, LP2/c;

    .line 1770
    .line 1771
    invoke-virtual {p1}, LP2/c;->notImplemented()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1772
    .line 1773
    .line 1774
    goto :goto_3

    .line 1775
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1776
    .line 1777
    .line 1778
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1779
    .line 1780
    const-string v2, "Error: "

    .line 1781
    .line 1782
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object p1

    .line 1792
    check-cast p2, LP2/c;

    .line 1793
    .line 1794
    invoke-virtual {p2, p1, v0, v0}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1795
    .line 1796
    .line 1797
    :goto_3
    return-void

    .line 1798
    nop

    .line 1799
    :sswitch_data_0
    .sparse-switch
        -0x68d7016a -> :sswitch_2a
        -0x653a1759 -> :sswitch_29
        -0x641dbdd3 -> :sswitch_28
        -0x5e4f1038 -> :sswitch_27
        -0x5d286128 -> :sswitch_26
        -0x5adb498e -> :sswitch_25
        -0x59af196f -> :sswitch_24
        -0x543b109b -> :sswitch_23
        -0x4d45b3f0 -> :sswitch_22
        -0x4c9a73e6 -> :sswitch_21
        -0x4759d017 -> :sswitch_20
        -0x410d2cad -> :sswitch_1f
        -0x4054a92e -> :sswitch_1e
        -0x3cb7c6ae -> :sswitch_1d
        -0x3043f9ca -> :sswitch_1c
        -0x2d824707 -> :sswitch_1b
        -0x2963f9ff -> :sswitch_1a
        -0x22a10fed -> :sswitch_19
        -0x1a9241f6 -> :sswitch_18
        -0x16b26e32 -> :sswitch_17
        -0x47d5de7 -> :sswitch_16
        0x9153925 -> :sswitch_15
        0x99879e0 -> :sswitch_14
        0xb21c3b3 -> :sswitch_13
        0x107e1530 -> :sswitch_12
        0x1bf5d05f -> :sswitch_11
        0x252e5a16 -> :sswitch_10
        0x37bcc7ec -> :sswitch_f
        0x38dee389 -> :sswitch_e
        0x3a315283 -> :sswitch_d
        0x40a81b4b -> :sswitch_c
        0x455827c6 -> :sswitch_b
        0x46c7103c -> :sswitch_a
        0x49fcee3f -> :sswitch_9
        0x4afd9d2e -> :sswitch_8
        0x50e69af7 -> :sswitch_7
        0x52277592 -> :sswitch_6
        0x5352a822 -> :sswitch_5
        0x59acfbac -> :sswitch_4
        0x5da380da -> :sswitch_3
        0x764d6925 -> :sswitch_2
        0x766c0cf0 -> :sswitch_1
        0x7ccf63f0 -> :sswitch_0
    .end sparse-switch
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method
