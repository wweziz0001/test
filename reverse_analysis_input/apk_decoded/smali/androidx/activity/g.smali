.class public final Landroidx/activity/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/m;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/g;->a:I

    iput-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/activity/g;->a:I

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
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v0, 0x21

    .line 13
    .line 14
    if-lt p2, v0, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 17
    .line 18
    invoke-static {p2}, Landroidx/activity/m;->access$100(Landroidx/activity/m;)Landroidx/activity/x;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p1, Landroidx/activity/m;

    .line 23
    .line 24
    invoke-static {p1}, Landroidx/activity/i;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string v0, "invoker"

    .line 32
    .line 33
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p2, Landroidx/activity/x;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 37
    .line 38
    iget-boolean p1, p2, Landroidx/activity/x;->g:Z

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Landroidx/activity/x;->c(Z)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    :pswitch_0
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 45
    .line 46
    check-cast p1, Landroidx/fragment/app/w;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/activity/m;->ensureViewModelStore()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/activity/m;->getLifecycle()Landroidx/lifecycle/p;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    sget-object p1, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 60
    .line 61
    if-ne p2, p1, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 64
    .line 65
    check-cast p1, Landroidx/fragment/app/w;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 p1, 0x0

    .line 79
    :goto_0
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void

    .line 85
    :pswitch_2
    sget-object p1, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 86
    .line 87
    if-ne p2, p1, :cond_4

    .line 88
    .line 89
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 90
    .line 91
    check-cast p1, Landroidx/fragment/app/w;

    .line 92
    .line 93
    iget-object p1, p1, Landroidx/activity/m;->mContextAwareHelper:Ld/a;

    .line 94
    .line 95
    const/4 p2, 0x0

    .line 96
    iput-object p2, p1, Ld/a;->b:Landroidx/activity/m;

    .line 97
    .line 98
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 99
    .line 100
    check-cast p1, Landroidx/fragment/app/w;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_3

    .line 107
    .line 108
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 109
    .line 110
    check-cast p1, Landroidx/fragment/app/w;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroidx/activity/m;->getViewModelStore()Landroidx/lifecycle/Y;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroidx/lifecycle/Y;->a()V

    .line 117
    .line 118
    .line 119
    :cond_3
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/m;

    .line 120
    .line 121
    check-cast p1, Landroidx/fragment/app/w;

    .line 122
    .line 123
    iget-object p1, p1, Landroidx/activity/m;->mReportFullyDrawnExecutor:Landroidx/activity/k;

    .line 124
    .line 125
    check-cast p1, Landroidx/activity/l;

    .line 126
    .line 127
    iget-object p2, p1, Landroidx/activity/l;->o:Landroidx/fragment/app/w;

    .line 128
    .line 129
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
