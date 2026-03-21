.class public final Ls1/g;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic c:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/g;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p1, "androidx.room.IMultiInstanceInvalidationService"

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
    .line 2
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
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7

    .line 1
    const-string v0, "androidx.room.IMultiInstanceInvalidationService"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-eq p1, v2, :cond_e

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eq p1, v1, :cond_9

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p1, v2, :cond_6

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string p3, "tables"

    .line 42
    .line 43
    invoke-static {p2, p3}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p3, p0, Ls1/g;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 47
    .line 48
    iget-object p4, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 49
    .line 50
    monitor-enter p4

    .line 51
    :try_start_0
    iget-object v0, p3, Landroidx/room/MultiInstanceInvalidationService;->m:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    const-string p1, "ROOM"

    .line 66
    .line 67
    const-string p2, "Remote invalidation client ID not registered"

    .line 68
    .line 69
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    monitor-exit p4

    .line 73
    goto/16 :goto_8

    .line 74
    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    :try_start_1
    iget-object v2, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 80
    .line 81
    .line 82
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    const/4 v3, 0x0

    .line 84
    :goto_0
    if-ge v3, v2, :cond_5

    .line 85
    .line 86
    :try_start_2
    iget-object v4, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 87
    .line 88
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-string v5, "null cannot be cast to non-null type kotlin.Int"

    .line 93
    .line 94
    invoke-static {v4, v5}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast v4, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    iget-object v6, p3, Landroidx/room/MultiInstanceInvalidationService;->m:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/String;

    .line 110
    .line 111
    if-eq p1, v5, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    if-nez v4, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    :try_start_3
    iget-object v4, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 121
    .line 122
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Ls1/d;

    .line 127
    .line 128
    invoke-virtual {v4, p2}, Ls1/d;->e0([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catchall_1
    move-exception p1

    .line 133
    goto :goto_2

    .line 134
    :catch_0
    move-exception v4

    .line 135
    :try_start_4
    const-string v5, "ROOM"

    .line 136
    .line 137
    const-string v6, "Error invoking a remote callback"

    .line 138
    .line 139
    invoke-static {v5, v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :goto_2
    :try_start_5
    iget-object p2, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_5
    iget-object p1, p3, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 154
    .line 155
    .line 156
    monitor-exit p4

    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :goto_3
    monitor-exit p4

    .line 160
    throw p1

    .line 161
    :cond_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-nez p1, :cond_7

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 169
    .line 170
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 171
    .line 172
    .line 173
    move-result-object p4

    .line 174
    if-eqz p4, :cond_8

    .line 175
    .line 176
    instance-of v0, p4, Ls1/d;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    move-object v0, p4

    .line 181
    check-cast v0, Ls1/d;

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    new-instance v0, Ls1/d;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object p1, v0, Ls1/d;->c:Landroid/os/IBinder;

    .line 190
    .line 191
    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    const-string p2, "callback"

    .line 196
    .line 197
    invoke-static {v0, p2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p0, Ls1/g;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 201
    .line 202
    iget-object p4, p2, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 203
    .line 204
    monitor-enter p4

    .line 205
    :try_start_6
    iget-object v2, p2, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 206
    .line 207
    invoke-virtual {v2, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 208
    .line 209
    .line 210
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->m:Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 221
    .line 222
    monitor-exit p4

    .line 223
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :catchall_2
    move-exception p1

    .line 228
    monitor-exit p4

    .line 229
    throw p1

    .line 230
    :cond_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-nez p1, :cond_a

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_a
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 238
    .line 239
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 240
    .line 241
    .line 242
    move-result-object p4

    .line 243
    if-eqz p4, :cond_b

    .line 244
    .line 245
    instance-of v0, p4, Ls1/d;

    .line 246
    .line 247
    if-eqz v0, :cond_b

    .line 248
    .line 249
    move-object v0, p4

    .line 250
    check-cast v0, Ls1/d;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_b
    new-instance v0, Ls1/d;

    .line 254
    .line 255
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 256
    .line 257
    .line 258
    iput-object p1, v0, Ls1/d;->c:Landroid/os/IBinder;

    .line 259
    .line 260
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    const-string p2, "callback"

    .line 265
    .line 266
    invoke-static {v0, p2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    const/4 p2, 0x0

    .line 270
    if-nez p1, :cond_c

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_c
    iget-object p4, p0, Ls1/g;->c:Landroidx/room/MultiInstanceInvalidationService;

    .line 274
    .line 275
    iget-object v2, p4, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 276
    .line 277
    monitor-enter v2

    .line 278
    :try_start_7
    iget v3, p4, Landroidx/room/MultiInstanceInvalidationService;->l:I

    .line 279
    .line 280
    add-int/lit8 v3, v3, 0x1

    .line 281
    .line 282
    iput v3, p4, Landroidx/room/MultiInstanceInvalidationService;->l:I

    .line 283
    .line 284
    iget-object v4, p4, Landroidx/room/MultiInstanceInvalidationService;->n:Ls1/h;

    .line 285
    .line 286
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-virtual {v4, v0, v5}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_d

    .line 295
    .line 296
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    iget-object p4, p4, Landroidx/room/MultiInstanceInvalidationService;->m:Ljava/util/LinkedHashMap;

    .line 301
    .line 302
    invoke-interface {p4, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move p2, v3

    .line 306
    goto :goto_6

    .line 307
    :catchall_3
    move-exception p1

    .line 308
    goto :goto_9

    .line 309
    :cond_d
    iget p1, p4, Landroidx/room/MultiInstanceInvalidationService;->l:I

    .line 310
    .line 311
    add-int/lit8 p1, p1, -0x1

    .line 312
    .line 313
    iput p1, p4, Landroidx/room/MultiInstanceInvalidationService;->l:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 314
    .line 315
    :goto_6
    monitor-exit v2

    .line 316
    :goto_7
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 320
    .line 321
    .line 322
    :goto_8
    return v1

    .line 323
    :goto_9
    monitor-exit v2

    .line 324
    throw p1

    .line 325
    :cond_e
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return v1
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
.end method
