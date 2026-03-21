.class public final Lz2/c;
.super Ls1/l;
.source "SourceFile"


# static fields
.field public static final e:Ly2/k;

.field public static final f:Ly2/k;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly3/H;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly3/H;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ly2/k;

    .line 9
    .line 10
    const-class v2, Lz2/a;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Ly2/k;-><init>(Ljava/lang/Class;Ly3/H;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Lz2/c;->e:Ly2/k;

    .line 16
    .line 17
    new-instance v0, Ly3/H;

    .line 18
    .line 19
    const/16 v1, 0x17

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ly3/H;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Ly2/k;

    .line 25
    .line 26
    const-class v2, Lz2/j;

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ly2/k;-><init>(Ljava/lang/Class;Ly3/H;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lz2/c;->f:Ly2/k;

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
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lz2/c;->d:I

    .line 2
    new-instance v0, Ls2/g;

    .line 3
    const-class v1, Lr2/j;

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Ls2/g;-><init>(Ljava/lang/Class;I)V

    .line 4
    filled-new-array {v0}, [Ls2/g;

    move-result-object v0

    const-class v1, LD2/Q;

    invoke-direct {p0, v1, v0}, Ls1/l;-><init>(Ljava/lang/Class;[Ls2/g;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;[Ls2/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lz2/c;->d:I

    invoke-direct {p0, p1, p2}, Ls1/l;-><init>(Ljava/lang/Class;[Ls2/g;)V

    return-void
.end method

.method public static l(IILD2/O;I)Ly2/d;
    .locals 4

    .line 1
    new-instance v0, Ly2/d;

    .line 2
    .line 3
    invoke-static {}, LD2/T;->D()LD2/S;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, LD2/V;->D()LD2/U;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 15
    .line 16
    check-cast v3, LD2/V;

    .line 17
    .line 18
    invoke-static {v3, p2}, LD2/V;->y(LD2/V;LD2/O;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 22
    .line 23
    .line 24
    iget-object p2, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 25
    .line 26
    check-cast p2, LD2/V;

    .line 27
    .line 28
    invoke-static {p2, p1}, LD2/V;->z(LD2/V;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LD2/V;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 38
    .line 39
    .line 40
    iget-object p2, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 41
    .line 42
    check-cast p2, LD2/T;

    .line 43
    .line 44
    invoke-static {p2, p1}, LD2/T;->y(LD2/T;LD2/V;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 48
    .line 49
    .line 50
    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 51
    .line 52
    check-cast p1, LD2/T;

    .line 53
    .line 54
    invoke-static {p1, p0}, LD2/T;->z(LD2/T;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, LD2/T;

    .line 62
    .line 63
    invoke-direct {v0, p0, p3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 64
    .line 65
    .line 66
    return-object v0
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
.end method

.method public static m(LD2/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LD2/f;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LD2/f;->A()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-gt p0, v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 19
    .line 20
    const-string v0, "tag size too long"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 27
    .line 28
    const-string v0, "tag size too short"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
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

.method public static n(LD2/V;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LD2/V;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_a

    .line 8
    .line 9
    invoke-virtual {p0}, LD2/V;->B()LD2/O;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const-string v2, "tag size too big"

    .line 19
    .line 20
    if-eq v0, v1, :cond_8

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq v0, v1, :cond_6

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, LD2/V;->C()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/16 v0, 0x1c

    .line 39
    .line 40
    if-gt p0, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 44
    .line 45
    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 50
    .line 51
    const-string v0, "unknown hash type"

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    invoke-virtual {p0}, LD2/V;->C()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    const/16 v0, 0x40

    .line 62
    .line 63
    if-gt p0, v0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_4
    invoke-virtual {p0}, LD2/V;->C()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    const/16 v0, 0x20

    .line 77
    .line 78
    if-gt p0, v0, :cond_5

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 82
    .line 83
    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_6
    invoke-virtual {p0}, LD2/V;->C()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    const/16 v0, 0x30

    .line 92
    .line 93
    if-gt p0, v0, :cond_7

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 97
    .line 98
    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_8
    invoke-virtual {p0}, LD2/V;->C()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const/16 v0, 0x14

    .line 107
    .line 108
    if-gt p0, v0, :cond_9

    .line 109
    .line 110
    :goto_0
    return-void

    .line 111
    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 112
    .line 113
    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 118
    .line 119
    const-string v0, "tag size too small"

    .line 120
    .line 121
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0
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
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lz2/c;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ls1/l;->d()I

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x2

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lz2/c;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final g()LL0/e;
    .locals 2

    .line 1
    iget v0, p0, Lz2/c;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls2/h;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ls2/h;-><init>(Lz2/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lz2/b;

    .line 13
    .line 14
    const-class v1, LD2/d;

    .line 15
    .line 16
    invoke-direct {v0, v1}, LL0/e;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final h()LD2/X;
    .locals 1

    .line 1
    iget v0, p0, Lz2/c;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LD2/X;->n:LD2/X;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    sget-object v0, LD2/X;->n:LD2/X;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final i(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/a;
    .locals 1

    .line 1
    iget v0, p0, Lz2/c;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1, v0}, LD2/Q;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/Q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, LD2/b;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final k(Lcom/google/crypto/tink/shaded/protobuf/a;)V
    .locals 2

    .line 1
    iget v0, p0, Lz2/c;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LD2/Q;

    .line 7
    .line 8
    invoke-virtual {p1}, LD2/Q;->E()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, LE2/o;->c(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LD2/Q;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x10

    .line 24
    .line 25
    if-lt v0, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, LD2/Q;->D()LD2/V;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lz2/c;->n(LD2/V;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 36
    .line 37
    const-string v0, "key too short"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    check-cast p1, LD2/b;

    .line 44
    .line 45
    invoke-virtual {p1}, LD2/b;->D()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, LE2/o;->c(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LD2/b;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/16 v1, 0x20

    .line 61
    .line 62
    if-ne v0, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, LD2/b;->C()LD2/f;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lz2/c;->m(LD2/f;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 73
    .line 74
    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
