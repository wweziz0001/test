.class public final Lu0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/i;


# instance fields
.field public final a:Lt0/j;

.field public b:LF0/K;

.field public c:J

.field public d:J

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lt0/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/h;->a:Lt0/j;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Lu0/h;->c:J

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lu0/h;->e:I

    .line 12
    .line 13
    return-void
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
.method public final a(Ld0/p;JIZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lu0/h;->b:LF0/K;

    .line 8
    .line 9
    invoke-static {v3}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v0, Lu0/h;->f:Z

    .line 13
    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget v3, v1, Ld0/p;->b:I

    .line 21
    .line 22
    iget v7, v1, Ld0/p;->c:I

    .line 23
    .line 24
    const/16 v8, 0x12

    .line 25
    .line 26
    if-le v7, v8, :cond_0

    .line 27
    .line 28
    move v7, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v7, v5

    .line 31
    :goto_0
    const-string v8, "ID Header has insufficient data"

    .line 32
    .line 33
    invoke-static {v8, v7}, Ld0/m;->b(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    invoke-virtual {v1, v4, v7}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v7, "OpusHead"

    .line 43
    .line 44
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const-string v7, "ID Header missing"

    .line 49
    .line 50
    invoke-static {v7, v4}, Ld0/m;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Ld0/p;->v()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ne v4, v6, :cond_1

    .line 58
    .line 59
    move v5, v6

    .line 60
    :cond_1
    const-string v4, "version number must always be 1"

    .line 61
    .line 62
    invoke-static {v4, v5}, Ld0/m;->b(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ld0/p;->H(I)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, Ld0/p;->a:[B

    .line 69
    .line 70
    invoke-static {v1}, LF0/b;->c([B)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v3, v0, Lu0/h;->a:Lt0/j;

    .line 75
    .line 76
    iget-object v3, v3, Lt0/j;->c:La0/p;

    .line 77
    .line 78
    invoke-virtual {v3}, La0/p;->a()La0/o;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v1, v3, La0/o;->p:Ljava/util/List;

    .line 83
    .line 84
    iget-object v1, v0, Lu0/h;->b:LF0/K;

    .line 85
    .line 86
    invoke-static {v3, v1}, Lm/B0;->k(La0/o;LF0/K;)V

    .line 87
    .line 88
    .line 89
    iput-boolean v6, v0, Lu0/h;->f:Z

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    iget-boolean v3, v0, Lu0/h;->g:Z

    .line 93
    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    iget v3, v1, Ld0/p;->c:I

    .line 97
    .line 98
    if-lt v3, v4, :cond_3

    .line 99
    .line 100
    move v5, v6

    .line 101
    :cond_3
    const-string v3, "Comment Header has insufficient data"

    .line 102
    .line 103
    invoke-static {v3, v5}, Ld0/m;->b(Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 107
    .line 108
    invoke-virtual {v1, v4, v3}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, "OpusTags"

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    const-string v3, "Comment Header should follow ID Header"

    .line 119
    .line 120
    invoke-static {v3, v1}, Ld0/m;->b(Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    iput-boolean v6, v0, Lu0/h;->g:Z

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    iget v3, v0, Lu0/h;->e:I

    .line 127
    .line 128
    invoke-static {v3}, Lt0/h;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eq v2, v3, :cond_5

    .line 133
    .line 134
    sget v4, Ld0/w;->a:I

    .line 135
    .line 136
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 137
    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v6, "Received RTP packet with unexpected sequence number. Expected: "

    .line 141
    .line 142
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v3, "; received: "

    .line 149
    .line 150
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v3, "."

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v4, "RtpOpusReader"

    .line 166
    .line 167
    invoke-static {v4, v3}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    iget-object v3, v0, Lu0/h;->b:LF0/K;

    .line 175
    .line 176
    invoke-interface {v3, v1, v10, v5}, LF0/K;->a(Ld0/p;II)V

    .line 177
    .line 178
    .line 179
    iget-wide v11, v0, Lu0/h;->d:J

    .line 180
    .line 181
    iget-wide v3, v0, Lu0/h;->c:J

    .line 182
    .line 183
    const v17, 0xbb80

    .line 184
    .line 185
    .line 186
    move-wide/from16 v13, p2

    .line 187
    .line 188
    move-wide v15, v3

    .line 189
    invoke-static/range {v11 .. v17}, Li4/a;->Z(JJJI)J

    .line 190
    .line 191
    .line 192
    move-result-wide v7

    .line 193
    iget-object v6, v0, Lu0/h;->b:LF0/K;

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v9, 0x1

    .line 197
    const/4 v11, 0x0

    .line 198
    invoke-interface/range {v6 .. v12}, LF0/K;->b(JIIILF0/J;)V

    .line 199
    .line 200
    .line 201
    :goto_1
    iput v2, v0, Lu0/h;->e:I

    .line 202
    .line 203
    return-void
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

.method public final b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lu0/h;->c:J

    .line 2
    .line 3
    iput-wide p3, p0, Lu0/h;->d:J

    .line 4
    .line 5
    return-void
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

.method public final c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lu0/h;->c:J

    .line 2
    .line 3
    return-void
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

.method public final d(LF0/s;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, LF0/s;->k(II)LF0/K;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, Lu0/h;->b:LF0/K;

    .line 7
    .line 8
    iget-object p2, p0, Lu0/h;->a:Lt0/j;

    .line 9
    .line 10
    iget-object p2, p2, Lt0/j;->c:La0/p;

    .line 11
    .line 12
    invoke-interface {p1, p2}, LF0/K;->c(La0/p;)V

    .line 13
    .line 14
    .line 15
    return-void
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
