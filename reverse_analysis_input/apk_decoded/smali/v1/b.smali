.class public final Lv1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv1/b;->a:I

    iput-object p1, p0, Lv1/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 5

    .line 1
    iget v0, p0, Lv1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 7
    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Landroidx/lifecycle/u;->getLifecycle()Landroidx/lifecycle/p;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lv1/b;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Landroidx/lifecycle/N;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/lifecycle/N;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2

    .line 49
    :pswitch_0
    new-instance p1, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lv1/b;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, [Landroidx/lifecycle/i;

    .line 57
    .line 58
    array-length p2, p1

    .line 59
    const/4 v0, 0x0

    .line 60
    const/4 v1, 0x0

    .line 61
    if-gtz p2, :cond_2

    .line 62
    .line 63
    array-length p2, p1

    .line 64
    if-gtz p2, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    aget-object p1, p1, v1

    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    aget-object p1, p1, v1

    .line 71
    .line 72
    throw v0

    .line 73
    :pswitch_1
    sget-object p1, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 74
    .line 75
    if-ne p2, p1, :cond_3

    .line 76
    .line 77
    iget-object p1, p0, Lv1/b;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Landroidx/fragment/app/r;

    .line 80
    .line 81
    iget-object p1, p1, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void

    .line 89
    :pswitch_2
    sget-object v0, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 90
    .line 91
    if-ne p2, v0, :cond_9

    .line 92
    .line 93
    invoke-interface {p1}, Landroidx/lifecycle/u;->getLifecycle()Landroidx/lifecycle/p;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lv1/b;->b:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-interface {p1}, Lv1/h;->getSavedStateRegistry()Lv1/f;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const-string v0, "androidx.savedstate.Restarter"

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Lv1/f;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-nez p2, :cond_4

    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :cond_4
    const-string v0, "classes_to_restore"

    .line 117
    .line 118
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-eqz p2, :cond_8

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    :cond_5
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/String;

    .line 139
    .line 140
    const-string v1, "Class "

    .line 141
    .line 142
    :try_start_0
    const-class v2, Lv1/b;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const-class v3, Lv1/d;

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    const-string v3, "{\n                Class.\u2026class.java)\n            }"

    .line 160
    .line 161
    invoke-static {v2, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 162
    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 166
    .line 167
    .line 168
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 169
    const/4 v2, 0x1

    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 171
    .line 172
    .line 173
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    const-string v2, "{\n                constr\u2026wInstance()\n            }"

    .line 178
    .line 179
    invoke-static {v1, v2}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    check-cast v1, Lv1/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 183
    .line 184
    move-object v0, p1

    .line 185
    check-cast v0, Landroidx/lifecycle/Z;

    .line 186
    .line 187
    invoke-interface {v0}, Landroidx/lifecycle/Z;->getViewModelStore()Landroidx/lifecycle/Y;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {p1}, Lv1/h;->getSavedStateRegistry()Lv1/f;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v2, Ljava/util/HashSet;

    .line 199
    .line 200
    iget-object v0, v0, Landroidx/lifecycle/Y;->a:Ljava/util/LinkedHashMap;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_6

    .line 218
    .line 219
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Ljava/lang/String;

    .line 224
    .line 225
    const-string v4, "key"

    .line 226
    .line 227
    invoke-static {v3, v4}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    check-cast v3, Landroidx/lifecycle/T;

    .line 235
    .line 236
    invoke-static {v3}, LN3/h;->b(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p1}, Landroidx/lifecycle/u;->getLifecycle()Landroidx/lifecycle/p;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-static {v3, v1, v4}, Landroidx/lifecycle/M;->a(Landroidx/lifecycle/T;Lv1/f;Landroidx/lifecycle/p;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_6
    new-instance v2, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_5

    .line 261
    .line 262
    invoke-virtual {v1}, Lv1/f;->d()V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :catch_0
    move-exception p1

    .line 268
    new-instance p2, Ljava/lang/RuntimeException;

    .line 269
    .line 270
    const-string v1, "Failed to instantiate "

    .line 271
    .line 272
    invoke-static {v1, v0}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    throw p2

    .line 280
    :catch_1
    move-exception p1

    .line 281
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    throw p2

    .line 308
    :catch_2
    move-exception p1

    .line 309
    new-instance p2, Ljava/lang/RuntimeException;

    .line 310
    .line 311
    const-string v2, " wasn\'t found"

    .line 312
    .line 313
    invoke-static {v1, v0, v2}, Lb3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    throw p2

    .line 321
    :cond_7
    :goto_2
    return-void

    .line 322
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 325
    .line 326
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw p1

    .line 330
    :cond_9
    new-instance p1, Ljava/lang/AssertionError;

    .line 331
    .line 332
    const-string p2, "Next event must be ON_CREATE"

    .line 333
    .line 334
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    throw p1

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
