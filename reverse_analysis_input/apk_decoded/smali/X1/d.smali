.class public final LX1/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LX1/d;->a:I

    iput-object p1, p0, LX1/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 1
    iget v0, p0, LX1/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p2, "close action"

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, LX1/d;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lio/flutter/plugins/urllauncher/WebViewActivity;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, LX1/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lj0/d;

    .line 35
    .line 36
    iget-object v1, v0, Lj0/d;->i:La0/c;

    .line 37
    .line 38
    iget-object v2, v0, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 39
    .line 40
    invoke-static {p1, p2, v1, v2}, Lj0/b;->c(Landroid/content/Context;Landroid/content/Intent;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Lj0/d;->a(Lj0/b;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void

    .line 48
    :pswitch_1
    const-string p2, "connectivity"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Landroid/net/ConnectivityManager;

    .line 55
    .line 56
    const/4 v0, 0x5

    .line 57
    const/4 v1, 0x0

    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :try_start_0
    invoke-virtual {p2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 62
    .line 63
    .line 64
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    const/4 v2, 0x1

    .line 66
    if-eqz p2, :cond_8

    .line 67
    .line 68
    invoke-virtual {p2}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {p2}, Landroid/net/NetworkInfo;->getType()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x2

    .line 80
    const/16 v5, 0x9

    .line 81
    .line 82
    const/4 v6, 0x6

    .line 83
    const/4 v7, 0x4

    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    if-eq v3, v2, :cond_6

    .line 87
    .line 88
    if-eq v3, v7, :cond_7

    .line 89
    .line 90
    if-eq v3, v0, :cond_7

    .line 91
    .line 92
    if-eq v3, v6, :cond_5

    .line 93
    .line 94
    if-eq v3, v5, :cond_4

    .line 95
    .line 96
    const/16 v1, 0x8

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const/4 v1, 0x7

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    :pswitch_2
    move v1, v0

    .line 102
    goto :goto_1

    .line 103
    :cond_6
    :pswitch_3
    move v1, v4

    .line 104
    goto :goto_1

    .line 105
    :cond_7
    invoke-virtual {p2}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    packed-switch p2, :pswitch_data_1

    .line 110
    .line 111
    .line 112
    :pswitch_4
    move v1, v6

    .line 113
    goto :goto_1

    .line 114
    :pswitch_5
    sget p2, Ld0/w;->a:I

    .line 115
    .line 116
    const/16 v2, 0x1d

    .line 117
    .line 118
    if-lt p2, v2, :cond_9

    .line 119
    .line 120
    move v1, v5

    .line 121
    goto :goto_1

    .line 122
    :pswitch_6
    move v1, v7

    .line 123
    goto :goto_1

    .line 124
    :pswitch_7
    const/4 p2, 0x3

    .line 125
    move v1, p2

    .line 126
    goto :goto_1

    .line 127
    :cond_8
    :goto_0
    move v1, v2

    .line 128
    :catch_0
    :cond_9
    :goto_1
    sget p2, Ld0/w;->a:I

    .line 129
    .line 130
    const/16 v2, 0x1f

    .line 131
    .line 132
    iget-object v3, p0, LX1/d;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Ld0/o;

    .line 135
    .line 136
    if-lt p2, v2, :cond_a

    .line 137
    .line 138
    if-ne v1, v0, :cond_a

    .line 139
    .line 140
    :try_start_1
    const-string p2, "phone"

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Landroid/telephony/TelephonyManager;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance v1, Ld0/n;

    .line 152
    .line 153
    invoke-direct {v1, v3}, Ld0/n;-><init>(Ld0/o;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, Landroidx/media/C;->j(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p2, p1, v1}, LS2/c;->s(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Ld0/n;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p2, v1}, LS2/c;->r(Landroid/telephony/TelephonyManager;Ld0/n;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_1
    invoke-static {v0, v3}, Ld0/o;->a(ILd0/o;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_a
    invoke-static {v1, v3}, Ld0/o;->a(ILd0/o;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    return-void

    .line 175
    :pswitch_8
    const-string v0, "context"

    .line 176
    .line 177
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string p1, "intent"

    .line 181
    .line 182
    invoke-static {p2, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, LX1/d;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, LX1/a;

    .line 188
    .line 189
    iget v0, p1, LX1/a;->g:I

    .line 190
    .line 191
    packed-switch v0, :pswitch_data_2

    .line 192
    .line 193
    .line 194
    const-string v0, "intent"

    .line 195
    .line 196
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-nez v0, :cond_b

    .line 204
    .line 205
    goto/16 :goto_3

    .line 206
    .line 207
    :cond_b
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, LX1/j;->a:Ljava/lang/String;

    .line 212
    .line 213
    new-instance v2, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v3, "Received "

    .line 216
    .line 217
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v0, v1, v2}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    if-eqz p2, :cond_1a

    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    const v1, -0x46671f94

    .line 245
    .line 246
    .line 247
    if-eq v0, v1, :cond_e

    .line 248
    .line 249
    const v1, -0x2b8fb65c

    .line 250
    .line 251
    .line 252
    if-eq v0, v1, :cond_c

    .line 253
    .line 254
    goto/16 :goto_3

    .line 255
    .line 256
    :cond_c
    const-string v0, "android.intent.action.DEVICE_STORAGE_OK"

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    if-nez p2, :cond_d

    .line 263
    .line 264
    goto/16 :goto_3

    .line 265
    .line 266
    :cond_d
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :cond_e
    const-string v0, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 274
    .line 275
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    if-nez p2, :cond_f

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_f
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :pswitch_9
    const-string v0, "intent"

    .line 291
    .line 292
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-nez v0, :cond_10

    .line 300
    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :cond_10
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sget-object v1, LX1/c;->a:Ljava/lang/String;

    .line 308
    .line 309
    new-instance v2, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v3, "Received "

    .line 312
    .line 313
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v0, v1, v2}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    if-eqz p2, :cond_1a

    .line 335
    .line 336
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    const v1, -0x7606c095    # -6.0004207E-33f

    .line 341
    .line 342
    .line 343
    if-eq v0, v1, :cond_13

    .line 344
    .line 345
    const v1, 0x1d398bfd

    .line 346
    .line 347
    .line 348
    if-eq v0, v1, :cond_11

    .line 349
    .line 350
    goto/16 :goto_3

    .line 351
    .line 352
    :cond_11
    const-string v0, "android.intent.action.BATTERY_LOW"

    .line 353
    .line 354
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result p2

    .line 358
    if-nez p2, :cond_12

    .line 359
    .line 360
    goto/16 :goto_3

    .line 361
    .line 362
    :cond_12
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_3

    .line 368
    .line 369
    :cond_13
    const-string v0, "android.intent.action.BATTERY_OKAY"

    .line 370
    .line 371
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result p2

    .line 375
    if-nez p2, :cond_14

    .line 376
    .line 377
    goto/16 :goto_3

    .line 378
    .line 379
    :cond_14
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto :goto_3

    .line 385
    :pswitch_a
    const-string v0, "intent"

    .line 386
    .line 387
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    if-nez p2, :cond_15

    .line 395
    .line 396
    goto :goto_3

    .line 397
    :cond_15
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sget-object v1, LX1/b;->a:Ljava/lang/String;

    .line 402
    .line 403
    const-string v2, "Received "

    .line 404
    .line 405
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v0, v1, v2}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    sparse-switch v0, :sswitch_data_0

    .line 417
    .line 418
    .line 419
    goto :goto_3

    .line 420
    :sswitch_0
    const-string v0, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 421
    .line 422
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    if-nez p2, :cond_16

    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_16
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 430
    .line 431
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto :goto_3

    .line 435
    :sswitch_1
    const-string v0, "android.os.action.CHARGING"

    .line 436
    .line 437
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    if-nez p2, :cond_17

    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_17
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 445
    .line 446
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    goto :goto_3

    .line 450
    :sswitch_2
    const-string v0, "android.os.action.DISCHARGING"

    .line 451
    .line 452
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result p2

    .line 456
    if-nez p2, :cond_18

    .line 457
    .line 458
    goto :goto_3

    .line 459
    :cond_18
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    goto :goto_3

    .line 465
    :sswitch_3
    const-string v0, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 466
    .line 467
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result p2

    .line 471
    if-nez p2, :cond_19

    .line 472
    .line 473
    goto :goto_3

    .line 474
    :cond_19
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_1a
    :goto_3
    return-void

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    :sswitch_data_0
    .sparse-switch
        -0x7073f927 -> :sswitch_3
        -0x3465cce -> :sswitch_2
        0x388694fe -> :sswitch_1
        0x3cbf870b -> :sswitch_0
    .end sparse-switch
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
