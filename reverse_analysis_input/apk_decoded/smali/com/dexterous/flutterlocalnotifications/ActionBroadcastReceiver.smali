.class public Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static b:LZ1/c;

.field public static c:Le3/c;


# instance fields
.field public a:LQ/n;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation build Lg/a;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
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


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:LQ/n;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, LQ/n;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p1, v1}, LQ/n;-><init>(Landroid/content/Context;B)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:LQ/n;

    .line 25
    .line 26
    invoke-static {p2}, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;->extractNotificationResponseMap(Landroid/content/Intent;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "cancelNotification"

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    const-string p2, "notificationId"

    .line 41
    .line 42
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const-string v3, "notificationTag"

    .line 53
    .line 54
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    instance-of v4, v3, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    new-instance v4, Lt/V;

    .line 63
    .line 64
    invoke-direct {v4, p1}, Lt/V;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, v3, p2}, Lt/V;->a(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance v3, Lt/V;

    .line 74
    .line 75
    invoke-direct {v3, p1}, Lt/V;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v1, p2}, Lt/V;->a(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_0
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LZ1/c;

    .line 82
    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    new-instance p2, LZ1/c;

    .line 86
    .line 87
    const/16 v3, 0x8

    .line 88
    .line 89
    invoke-direct {p2, v3}, LZ1/c;-><init>(I)V

    .line 90
    .line 91
    .line 92
    sput-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LZ1/c;

    .line 93
    .line 94
    :cond_4
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LZ1/c;

    .line 95
    .line 96
    iget-object v3, p2, LZ1/c;->m:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Ln3/h;

    .line 99
    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    invoke-virtual {v3, v0}, Ln3/h;->success(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget-object p2, p2, LZ1/c;->l:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Le3/c;

    .line 114
    .line 115
    const-string v0, "ActionBroadcastReceiver"

    .line 116
    .line 117
    if-eqz p2, :cond_6

    .line 118
    .line 119
    const-string p1, "Engine is already initialised"

    .line 120
    .line 121
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    invoke-static {}, LZ1/m;->z()LZ1/m;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    iget-object p2, p2, LZ1/m;->m:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p2, Lh3/f;

    .line 132
    .line 133
    invoke-virtual {p2, p1}, Lh3/f;->c(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, p1, v1}, Lh3/f;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v1, Le3/c;

    .line 140
    .line 141
    invoke-direct {v1, p1}, Le3/c;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    sput-object v1, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Le3/c;

    .line 145
    .line 146
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:LQ/n;

    .line 147
    .line 148
    const-string v3, "flutter_local_notifications_plugin"

    .line 149
    .line 150
    iget-object v1, v1, LQ/n;->l:Landroid/content/Context;

    .line 151
    .line 152
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY"

    .line 157
    .line 158
    const-wide/16 v3, -0x1

    .line 159
    .line 160
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v1

    .line 164
    invoke-static {v1, v2}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-nez v1, :cond_7

    .line 169
    .line 170
    const-string p1, "Callback information could not be retrieved"

    .line 171
    .line 172
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    sget-object v0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Le3/c;

    .line 177
    .line 178
    iget-object v0, v0, Le3/c;->c:Lf3/b;

    .line 179
    .line 180
    new-instance v2, LZ1/s;

    .line 181
    .line 182
    iget-object v3, v0, Lf3/b;->p:Landroidx/lifecycle/E;

    .line 183
    .line 184
    const-string v4, "dexterous.com/flutter/local_notifications/actions"

    .line 185
    .line 186
    invoke-direct {v2, v3, v4}, LZ1/s;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sget-object v3, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LZ1/c;

    .line 190
    .line 191
    invoke-virtual {v2, v3}, LZ1/s;->Q(Ln3/i;)V

    .line 192
    .line 193
    .line 194
    iget-object p2, p2, Lh3/f;->d:Lh3/b;

    .line 195
    .line 196
    iget-object p2, p2, Lh3/b;->b:Ljava/lang/String;

    .line 197
    .line 198
    new-instance v2, LZ1/s;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const/4 v3, 0x5

    .line 205
    invoke-direct {v2, p1, p2, v1, v3}, LZ1/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2}, Lf3/b;->a(LZ1/s;)V

    .line 209
    .line 210
    .line 211
    :goto_2
    return-void
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
