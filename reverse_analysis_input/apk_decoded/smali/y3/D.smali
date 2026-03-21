.class public final synthetic Ly3/D;
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
    iput p2, p0, Ly3/D;->l:I

    iput-object p1, p0, Ly3/D;->m:Ly3/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;LZ1/l;)V
    .locals 6

    .line 1
    iget v0, p0, Ly3/D;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

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
    move-result-object v2

    .line 20
    const-string v3, "null cannot be cast to non-null type android.view.View"

    .line 21
    .line 22
    invoke-static {v2, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v2, Landroid/view/View;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode"

    .line 33
    .line 34
    invoke-static {p1, v4}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ly3/u;

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-eq p1, v3, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    if-eq p1, v1, :cond_1

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    if-eq p1, v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p1, Ly3/u;->n:Ly3/u;

    .line 58
    .line 59
    iget-object v0, v0, Ly3/j;->a:LA/e;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, " doesn\'t represent a native value."

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 96
    .line 97
    .line 98
    :goto_0
    const/4 p1, 0x0

    .line 99
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_1
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_0
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

    .line 114
    .line 115
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 116
    .line 117
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "null cannot be cast to non-null type android.view.View"

    .line 128
    .line 129
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v1, Landroid/view/View;

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 140
    .line 141
    invoke-static {p1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast p1, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    goto :goto_2

    .line 162
    :catchall_1
    move-exception p1

    .line 163
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    :goto_2
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_1
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

    .line 172
    .line 173
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 174
    .line 175
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    check-cast p1, Ljava/util/List;

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const-string v2, "null cannot be cast to non-null type android.view.View"

    .line 186
    .line 187
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    check-cast v1, Landroid/view/View;

    .line 191
    .line 192
    const/4 v2, 0x1

    .line 193
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 198
    .line 199
    invoke-static {p1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    check-cast p1, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 212
    .line 213
    .line 214
    const/4 p1, 0x0

    .line 215
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 219
    goto :goto_3

    .line 220
    :catchall_2
    move-exception p1

    .line 221
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    :goto_3
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :pswitch_2
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

    .line 230
    .line 231
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 232
    .line 233
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    check-cast p1, Ljava/util/List;

    .line 237
    .line 238
    const/4 v1, 0x0

    .line 239
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 244
    .line 245
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    check-cast p1, Landroid/view/View;

    .line 249
    .line 250
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    new-instance v0, Ly3/X;

    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    int-to-long v1, v1

    .line 260
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    int-to-long v3, p1

    .line 265
    invoke-direct {v0, v1, v2, v3, v4}, Ly3/X;-><init>(JJ)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 272
    goto :goto_4

    .line 273
    :catchall_3
    move-exception p1

    .line 274
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    :goto_4
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_3
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

    .line 283
    .line 284
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 285
    .line 286
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    check-cast p1, Ljava/util/List;

    .line 290
    .line 291
    const/4 v1, 0x0

    .line 292
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    const-string v2, "null cannot be cast to non-null type android.view.View"

    .line 297
    .line 298
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    check-cast v1, Landroid/view/View;

    .line 302
    .line 303
    const/4 v2, 0x1

    .line 304
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const-string v3, "null cannot be cast to non-null type kotlin.Long"

    .line 309
    .line 310
    invoke-static {v2, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    check-cast v2, Ljava/lang/Long;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 316
    .line 317
    .line 318
    move-result-wide v4

    .line 319
    const/4 v2, 0x2

    .line 320
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    check-cast p1, Ljava/lang/Long;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 330
    .line 331
    .line 332
    move-result-wide v2

    .line 333
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    long-to-int p1, v4

    .line 337
    long-to-int v0, v2

    .line 338
    invoke-virtual {v1, p1, v0}, Landroid/view/View;->scrollBy(II)V

    .line 339
    .line 340
    .line 341
    const/4 p1, 0x0

    .line 342
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 346
    goto :goto_5

    .line 347
    :catchall_4
    move-exception p1

    .line 348
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    :goto_5
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_4
    iget-object v0, p0, Ly3/D;->m:Ly3/j;

    .line 357
    .line 358
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 359
    .line 360
    invoke-static {p1, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    check-cast p1, Ljava/util/List;

    .line 364
    .line 365
    const/4 v1, 0x0

    .line 366
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    const-string v2, "null cannot be cast to non-null type android.view.View"

    .line 371
    .line 372
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    check-cast v1, Landroid/view/View;

    .line 376
    .line 377
    const/4 v2, 0x1

    .line 378
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const-string v3, "null cannot be cast to non-null type kotlin.Long"

    .line 383
    .line 384
    invoke-static {v2, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    check-cast v2, Ljava/lang/Long;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 390
    .line 391
    .line 392
    move-result-wide v4

    .line 393
    const/4 v2, 0x2

    .line 394
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-static {p1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    check-cast p1, Ljava/lang/Long;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 404
    .line 405
    .line 406
    move-result-wide v2

    .line 407
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    long-to-int p1, v4

    .line 411
    long-to-int v0, v2

    .line 412
    invoke-virtual {v1, p1, v0}, Landroid/view/View;->scrollTo(II)V

    .line 413
    .line 414
    .line 415
    const/4 p1, 0x0

    .line 416
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 420
    goto :goto_6

    .line 421
    :catchall_5
    move-exception p1

    .line 422
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    :goto_6
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    nop

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
