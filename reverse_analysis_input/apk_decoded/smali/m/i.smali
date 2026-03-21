.class public final Lm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/o;


# instance fields
.field public A:Z

.field public final B:Landroid/util/SparseBooleanArray;

.field public C:Lm/f;

.field public D:Lm/f;

.field public E:LA/a;

.field public F:Lm/g;

.field public final G:Landroidx/lifecycle/E;

.field public final l:Landroid/content/Context;

.field public m:Landroid/content/Context;

.field public n:Ll/h;

.field public final o:Landroid/view/LayoutInflater;

.field public p:Ll/n;

.field public final q:I

.field public r:Landroidx/appcompat/widget/ActionMenuView;

.field public s:Lm/h;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/i;->l:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lm/i;->o:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    const p1, 0x7f0b0002

    .line 13
    .line 14
    .line 15
    iput p1, p0, Lm/i;->q:I

    .line 16
    .line 17
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lm/i;->B:Landroid/util/SparseBooleanArray;

    .line 23
    .line 24
    new-instance p1, Landroidx/lifecycle/E;

    .line 25
    .line 26
    const/16 v0, 0xf

    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lm/i;->G:Landroidx/lifecycle/E;

    .line 32
    .line 33
    return-void
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
.method public final a(Landroid/content/Context;Ll/h;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lm/i;->m:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lm/i;->n:Ll/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-boolean v0, p0, Lm/i;->w:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lm/i;->v:Z

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    div-int/2addr v0, v1

    .line 31
    iput v0, p0, Lm/i;->x:I

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget v0, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 42
    .line 43
    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 44
    .line 45
    iget p1, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 46
    .line 47
    const/16 v3, 0x258

    .line 48
    .line 49
    if-gt p1, v3, :cond_6

    .line 50
    .line 51
    if-gt v0, v3, :cond_6

    .line 52
    .line 53
    const/16 p1, 0x2d0

    .line 54
    .line 55
    const/16 v3, 0x3c0

    .line 56
    .line 57
    if-le v0, v3, :cond_1

    .line 58
    .line 59
    if-gt v2, p1, :cond_6

    .line 60
    .line 61
    :cond_1
    if-le v0, p1, :cond_2

    .line 62
    .line 63
    if-le v2, v3, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 p1, 0x1f4

    .line 67
    .line 68
    if-ge v0, p1, :cond_5

    .line 69
    .line 70
    const/16 p1, 0x1e0

    .line 71
    .line 72
    const/16 v3, 0x280

    .line 73
    .line 74
    if-le v0, v3, :cond_3

    .line 75
    .line 76
    if-gt v2, p1, :cond_5

    .line 77
    .line 78
    :cond_3
    if-le v0, p1, :cond_4

    .line 79
    .line 80
    if-le v2, v3, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const/16 p1, 0x168

    .line 84
    .line 85
    if-lt v0, p1, :cond_7

    .line 86
    .line 87
    const/4 v1, 0x3

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    :goto_0
    const/4 v1, 0x4

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    :goto_1
    const/4 v1, 0x5

    .line 92
    :cond_7
    :goto_2
    iput v1, p0, Lm/i;->z:I

    .line 93
    .line 94
    iget p1, p0, Lm/i;->x:I

    .line 95
    .line 96
    iget-boolean v0, p0, Lm/i;->v:Z

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    if-eqz v0, :cond_a

    .line 100
    .line 101
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 102
    .line 103
    if-nez v0, :cond_9

    .line 104
    .line 105
    new-instance v0, Lm/h;

    .line 106
    .line 107
    iget-object v2, p0, Lm/i;->l:Landroid/content/Context;

    .line 108
    .line 109
    invoke-direct {v0, p0, v2}, Lm/h;-><init>(Lm/i;Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lm/i;->s:Lm/h;

    .line 113
    .line 114
    iget-boolean v2, p0, Lm/i;->u:Z

    .line 115
    .line 116
    const/4 v3, 0x0

    .line 117
    if-eqz v2, :cond_8

    .line 118
    .line 119
    iget-object v2, p0, Lm/i;->t:Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lm/q;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 122
    .line 123
    .line 124
    iput-object v1, p0, Lm/i;->t:Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    iput-boolean v3, p0, Lm/i;->u:Z

    .line 127
    .line 128
    :cond_8
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget-object v1, p0, Lm/i;->s:Lm/h;

    .line 133
    .line 134
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 135
    .line 136
    .line 137
    :cond_9
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sub-int/2addr p1, v0

    .line 144
    goto :goto_3

    .line 145
    :cond_a
    iput-object v1, p0, Lm/i;->s:Lm/h;

    .line 146
    .line 147
    :goto_3
    iput p1, p0, Lm/i;->y:I

    .line 148
    .line 149
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 154
    .line 155
    return-void
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

.method public final b(Ll/h;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm/i;->g()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm/i;->D:Lm/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ll/m;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Ll/m;->i:Ll/j;

    .line 15
    .line 16
    invoke-interface {v0}, Ll/q;->dismiss()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lm/i;->p:Ll/n;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Ll/n;->b(Ll/h;Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
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
.end method

.method public final c(Ll/i;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuView;)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p1, Ll/i;->z:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ll/i;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    :cond_1
    instance-of v0, p2, Ll/p;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p2, Ll/p;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget p2, p0, Lm/i;->q:I

    .line 24
    .line 25
    iget-object v0, p0, Lm/i;->o:Landroid/view/LayoutInflater;

    .line 26
    .line 27
    invoke-virtual {v0, p2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Ll/p;

    .line 32
    .line 33
    :goto_1
    invoke-interface {p2, p1}, Ll/p;->b(Ll/i;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 37
    .line 38
    move-object v2, p2

    .line 39
    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Ll/g;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lm/i;->F:Lm/g;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    new-instance v0, Lm/g;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lm/g;-><init>(Lm/i;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lm/i;->F:Lm/g;

    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, Lm/i;->F:Lm/g;

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Ll/b;)V

    .line 58
    .line 59
    .line 60
    move-object v0, p2

    .line 61
    check-cast v0, Landroid/view/View;

    .line 62
    .line 63
    :cond_4
    iget-boolean p1, p1, Ll/i;->B:Z

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    :cond_5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of p2, p1, Lm/k;

    .line 80
    .line 81
    if-nez p2, :cond_6

    .line 82
    .line 83
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->i(Landroid/view/ViewGroup$LayoutParams;)Lm/k;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    return-object v0
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

.method public final d()Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lm/i;->n:Ll/h;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ll/h;->k()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget v5, v0, Lm/i;->z:I

    .line 20
    .line 21
    iget v6, v0, Lm/i;->y:I

    .line 22
    .line 23
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-object v8, v0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 28
    .line 29
    move v9, v3

    .line 30
    move v10, v9

    .line 31
    move v11, v10

    .line 32
    move v12, v11

    .line 33
    :goto_1
    const/4 v13, 0x2

    .line 34
    const/4 v14, 0x1

    .line 35
    if-ge v9, v4, :cond_4

    .line 36
    .line 37
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v15

    .line 41
    check-cast v15, Ll/i;

    .line 42
    .line 43
    iget v3, v15, Ll/i;->y:I

    .line 44
    .line 45
    and-int/lit8 v2, v3, 0x2

    .line 46
    .line 47
    if-ne v2, v13, :cond_1

    .line 48
    .line 49
    add-int/lit8 v11, v11, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    and-int/lit8 v2, v3, 0x1

    .line 53
    .line 54
    if-ne v2, v14, :cond_2

    .line 55
    .line 56
    add-int/lit8 v12, v12, 0x1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v10, v14

    .line 60
    :goto_2
    iget-boolean v2, v0, Lm/i;->A:Z

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-boolean v2, v15, Ll/i;->B:Z

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-boolean v2, v0, Lm/i;->v:Z

    .line 74
    .line 75
    if-eqz v2, :cond_6

    .line 76
    .line 77
    if-nez v10, :cond_5

    .line 78
    .line 79
    add-int/2addr v12, v11

    .line 80
    if-le v12, v5, :cond_6

    .line 81
    .line 82
    :cond_5
    add-int/lit8 v5, v5, -0x1

    .line 83
    .line 84
    :cond_6
    sub-int/2addr v5, v11

    .line 85
    iget-object v2, v0, Lm/i;->B:Landroid/util/SparseBooleanArray;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->clear()V

    .line 88
    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    :goto_3
    if-ge v3, v4, :cond_16

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    check-cast v10, Ll/i;

    .line 99
    .line 100
    iget v11, v10, Ll/i;->y:I

    .line 101
    .line 102
    and-int/lit8 v12, v11, 0x2

    .line 103
    .line 104
    if-ne v12, v13, :cond_7

    .line 105
    .line 106
    move v12, v14

    .line 107
    goto :goto_4

    .line 108
    :cond_7
    const/4 v12, 0x0

    .line 109
    :goto_4
    iget v15, v10, Ll/i;->b:I

    .line 110
    .line 111
    if-eqz v12, :cond_a

    .line 112
    .line 113
    const/4 v12, 0x0

    .line 114
    invoke-virtual {v0, v10, v12, v8}, Lm/i;->c(Ll/i;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuView;)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v11, v7, v7}, Landroid/view/View;->measure(II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    sub-int/2addr v6, v11

    .line 126
    if-nez v9, :cond_8

    .line 127
    .line 128
    move v9, v11

    .line 129
    :cond_8
    if-eqz v15, :cond_9

    .line 130
    .line 131
    invoke-virtual {v2, v15, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 132
    .line 133
    .line 134
    :cond_9
    invoke-virtual {v10, v14}, Ll/i;->f(Z)V

    .line 135
    .line 136
    .line 137
    :goto_5
    const/4 v11, 0x0

    .line 138
    goto/16 :goto_a

    .line 139
    .line 140
    :cond_a
    and-int/lit8 v11, v11, 0x1

    .line 141
    .line 142
    if-ne v11, v14, :cond_15

    .line 143
    .line 144
    invoke-virtual {v2, v15}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    if-gtz v5, :cond_b

    .line 149
    .line 150
    if-eqz v11, :cond_c

    .line 151
    .line 152
    :cond_b
    if-lez v6, :cond_c

    .line 153
    .line 154
    move v12, v14

    .line 155
    goto :goto_6

    .line 156
    :cond_c
    const/4 v12, 0x0

    .line 157
    :goto_6
    const/4 v13, 0x0

    .line 158
    if-eqz v12, :cond_f

    .line 159
    .line 160
    invoke-virtual {v0, v10, v13, v8}, Lm/i;->c(Ll/i;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuView;)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    invoke-virtual {v14, v7, v7}, Landroid/view/View;->measure(II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    sub-int/2addr v6, v14

    .line 172
    if-nez v9, :cond_d

    .line 173
    .line 174
    move v9, v14

    .line 175
    :cond_d
    add-int v14, v6, v9

    .line 176
    .line 177
    if-lez v14, :cond_e

    .line 178
    .line 179
    const/4 v14, 0x1

    .line 180
    goto :goto_7

    .line 181
    :cond_e
    const/4 v14, 0x0

    .line 182
    :goto_7
    and-int/2addr v12, v14

    .line 183
    :cond_f
    if-eqz v12, :cond_10

    .line 184
    .line 185
    if-eqz v15, :cond_10

    .line 186
    .line 187
    const/4 v14, 0x1

    .line 188
    invoke-virtual {v2, v15, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 189
    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_10
    if-eqz v11, :cond_13

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    invoke-virtual {v2, v15, v11}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 196
    .line 197
    .line 198
    const/4 v11, 0x0

    .line 199
    :goto_8
    if-ge v11, v3, :cond_13

    .line 200
    .line 201
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Ll/i;

    .line 206
    .line 207
    iget v13, v14, Ll/i;->b:I

    .line 208
    .line 209
    if-ne v13, v15, :cond_12

    .line 210
    .line 211
    invoke-virtual {v14}, Ll/i;->d()Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    if-eqz v13, :cond_11

    .line 216
    .line 217
    add-int/lit8 v5, v5, 0x1

    .line 218
    .line 219
    :cond_11
    const/4 v13, 0x0

    .line 220
    invoke-virtual {v14, v13}, Ll/i;->f(Z)V

    .line 221
    .line 222
    .line 223
    :cond_12
    add-int/lit8 v11, v11, 0x1

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    goto :goto_8

    .line 227
    :cond_13
    :goto_9
    if-eqz v12, :cond_14

    .line 228
    .line 229
    add-int/lit8 v5, v5, -0x1

    .line 230
    .line 231
    :cond_14
    invoke-virtual {v10, v12}, Ll/i;->f(Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_15
    const/4 v11, 0x0

    .line 236
    invoke-virtual {v10, v11}, Ll/i;->f(Z)V

    .line 237
    .line 238
    .line 239
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 240
    .line 241
    const/4 v13, 0x2

    .line 242
    const/4 v14, 0x1

    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :cond_16
    move v3, v14

    .line 246
    return v3
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
.end method

.method public final e()V
    .locals 11

    .line 1
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    iget-object v3, p0, Lm/i;->n:Ll/h;

    .line 10
    .line 11
    if-eqz v3, :cond_6

    .line 12
    .line 13
    invoke-virtual {v3}, Ll/h;->i()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lm/i;->n:Ll/h;

    .line 17
    .line 18
    invoke-virtual {v3}, Ll/h;->k()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    move v5, v2

    .line 27
    move v6, v5

    .line 28
    :goto_0
    if-ge v5, v4, :cond_7

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Ll/i;

    .line 35
    .line 36
    invoke-virtual {v7}, Ll/i;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_5

    .line 41
    .line 42
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    instance-of v9, v8, Ll/p;

    .line 47
    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    move-object v9, v8

    .line 51
    check-cast v9, Ll/p;

    .line 52
    .line 53
    invoke-interface {v9}, Ll/p;->getItemData()Ll/i;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v9, v1

    .line 59
    :goto_1
    invoke-virtual {p0, v7, v8, v0}, Lm/i;->c(Ll/i;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuView;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    if-eq v7, v9, :cond_2

    .line 64
    .line 65
    invoke-virtual {v10, v2}, Landroid/view/View;->setPressed(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 69
    .line 70
    .line 71
    :cond_2
    if-eq v10, v8, :cond_4

    .line 72
    .line 73
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Landroid/view/ViewGroup;

    .line 78
    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    iget-object v7, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 85
    .line 86
    invoke-virtual {v7, v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 87
    .line 88
    .line 89
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    move v6, v2

    .line 95
    :cond_7
    :goto_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-ge v6, v3, :cond_9

    .line 100
    .line 101
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v4, p0, Lm/i;->s:Lm/h;

    .line 106
    .line 107
    if-ne v3, v4, :cond_8

    .line 108
    .line 109
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_8
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_9
    :goto_3
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lm/i;->n:Ll/h;

    .line 122
    .line 123
    if-eqz v0, :cond_a

    .line 124
    .line 125
    invoke-virtual {v0}, Ll/h;->i()V

    .line 126
    .line 127
    .line 128
    iget-object v0, v0, Ll/h;->i:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    move v4, v2

    .line 135
    :goto_4
    if-ge v4, v3, :cond_a

    .line 136
    .line 137
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Ll/i;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    add-int/lit8 v4, v4, 0x1

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    iget-object v0, p0, Lm/i;->n:Ll/h;

    .line 150
    .line 151
    if-eqz v0, :cond_b

    .line 152
    .line 153
    invoke-virtual {v0}, Ll/h;->i()V

    .line 154
    .line 155
    .line 156
    iget-object v1, v0, Ll/h;->j:Ljava/util/ArrayList;

    .line 157
    .line 158
    :cond_b
    iget-boolean v0, p0, Lm/i;->v:Z

    .line 159
    .line 160
    const/4 v3, 0x1

    .line 161
    if-eqz v0, :cond_d

    .line 162
    .line 163
    if-eqz v1, :cond_d

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-ne v0, v3, :cond_c

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ll/i;

    .line 176
    .line 177
    iget-boolean v0, v0, Ll/i;->B:Z

    .line 178
    .line 179
    xor-int/lit8 v2, v0, 0x1

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_c
    if-lez v0, :cond_d

    .line 183
    .line 184
    move v2, v3

    .line 185
    :cond_d
    :goto_5
    if-eqz v2, :cond_10

    .line 186
    .line 187
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 188
    .line 189
    if-nez v0, :cond_e

    .line 190
    .line 191
    new-instance v0, Lm/h;

    .line 192
    .line 193
    iget-object v1, p0, Lm/i;->l:Landroid/content/Context;

    .line 194
    .line 195
    invoke-direct {v0, p0, v1}, Lm/h;-><init>(Lm/i;Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    iput-object v0, p0, Lm/i;->s:Lm/h;

    .line 199
    .line 200
    :cond_e
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Landroid/view/ViewGroup;

    .line 207
    .line 208
    iget-object v1, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 209
    .line 210
    if-eq v0, v1, :cond_11

    .line 211
    .line 212
    if-eqz v0, :cond_f

    .line 213
    .line 214
    iget-object v1, p0, Lm/i;->s:Lm/h;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    :cond_f
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 220
    .line 221
    iget-object v1, p0, Lm/i;->s:Lm/h;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->h()Lm/k;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iput-boolean v3, v2, Lm/k;->a:Z

    .line 231
    .line 232
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_10
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 237
    .line 238
    if-eqz v0, :cond_11

    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v1, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 245
    .line 246
    if-ne v0, v1, :cond_11

    .line 247
    .line 248
    iget-object v0, p0, Lm/i;->s:Lm/h;

    .line 249
    .line 250
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    :cond_11
    :goto_6
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 254
    .line 255
    iget-boolean v1, p0, Lm/i;->v:Z

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    .line 258
    .line 259
    .line 260
    return-void
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
.end method

.method public final f(Ll/s;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Ll/h;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    move-object v0, p1

    .line 10
    :goto_0
    iget-object v2, v0, Ll/s;->v:Ll/h;

    .line 11
    .line 12
    iget-object v3, p0, Lm/i;->n:Ll/h;

    .line 13
    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    move-object v0, v2

    .line 17
    check-cast v0, Ll/s;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v2, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    move v5, v1

    .line 31
    :goto_1
    if-ge v5, v4, :cond_4

    .line 32
    .line 33
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    instance-of v7, v6, Ll/p;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    move-object v7, v6

    .line 42
    check-cast v7, Ll/p;

    .line 43
    .line 44
    invoke-interface {v7}, Ll/p;->getItemData()Ll/i;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget-object v8, v0, Ll/s;->w:Ll/i;

    .line 49
    .line 50
    if-ne v7, v8, :cond_3

    .line 51
    .line 52
    move-object v3, v6

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 58
    .line 59
    return v1

    .line 60
    :cond_5
    iget-object v0, p1, Ll/s;->w:Ll/i;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, Ll/h;->f:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    move v2, v1

    .line 72
    :goto_3
    const/4 v4, 0x1

    .line 73
    if-ge v2, v0, :cond_7

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Ll/h;->getItem(I)Landroid/view/MenuItem;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    move v0, v4

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_7
    move v0, v1

    .line 97
    :goto_4
    new-instance v2, Lm/f;

    .line 98
    .line 99
    iget-object v5, p0, Lm/i;->m:Landroid/content/Context;

    .line 100
    .line 101
    invoke-direct {v2, p0, v5, p1, v3}, Lm/f;-><init>(Lm/i;Landroid/content/Context;Ll/s;Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, Lm/i;->D:Lm/f;

    .line 105
    .line 106
    iput-boolean v0, v2, Ll/m;->g:Z

    .line 107
    .line 108
    iget-object v2, v2, Ll/m;->i:Ll/j;

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    invoke-virtual {v2, v0}, Ll/j;->o(Z)V

    .line 113
    .line 114
    .line 115
    :cond_8
    iget-object v0, p0, Lm/i;->D:Lm/f;

    .line 116
    .line 117
    invoke-virtual {v0}, Ll/m;->b()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_9

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_9
    iget-object v2, v0, Ll/m;->e:Landroid/view/View;

    .line 125
    .line 126
    if-eqz v2, :cond_b

    .line 127
    .line 128
    invoke-virtual {v0, v1, v1, v1, v1}, Ll/m;->d(IIZZ)V

    .line 129
    .line 130
    .line 131
    :goto_5
    iget-object v0, p0, Lm/i;->p:Ll/n;

    .line 132
    .line 133
    if-eqz v0, :cond_a

    .line 134
    .line 135
    invoke-interface {v0, p1}, Ll/n;->g(Ll/h;)Z

    .line 136
    .line 137
    .line 138
    :cond_a
    return v4

    .line 139
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string v0, "MenuPopupHelper cannot be used without an anchor"

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final g()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lm/i;->E:LA/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lm/i;->E:LA/a;

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lm/i;->C:Lm/f;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ll/m;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, Ll/m;->i:Ll/j;

    .line 28
    .line 29
    invoke-interface {v0}, Ll/q;->dismiss()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return v1

    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    return v0
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

.method public final h()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lm/i;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lm/i;->C:Lm/f;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ll/m;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lm/i;->n:Ll/h;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lm/i;->E:LA/a;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ll/h;->i()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Ll/h;->j:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lm/f;

    .line 40
    .line 41
    iget-object v1, p0, Lm/i;->m:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v2, p0, Lm/i;->n:Ll/h;

    .line 44
    .line 45
    iget-object v3, p0, Lm/i;->s:Lm/h;

    .line 46
    .line 47
    invoke-direct {v0, p0, v1, v2, v3}, Lm/f;-><init>(Lm/i;Landroid/content/Context;Ll/h;Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, LA/a;

    .line 51
    .line 52
    const/16 v2, 0xa

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-direct {v1, p0, v0, v2, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lm/i;->E:LA/a;

    .line 59
    .line 60
    iget-object v0, p0, Lm/i;->r:Landroidx/appcompat/widget/ActionMenuView;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    return v0

    .line 67
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 68
    return v0
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
.end method

.method public final i(Ll/n;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final j(Ll/i;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
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

.method public final k(Ll/i;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
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
