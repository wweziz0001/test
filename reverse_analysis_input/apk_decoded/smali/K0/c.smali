.class public final LK0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:[B

.field public final b:Ld0/p;

.field public final c:Z

.field public final d:LF0/u;

.field public e:LF0/s;

.field public f:LF0/K;

.field public g:I

.field public h:La0/F;

.field public i:LF0/w;

.field public j:I

.field public k:I

.field public l:LK0/b;

.field public m:I

.field public n:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, LK0/c;->a:[B

    .line 9
    .line 10
    new-instance v0, Ld0/p;

    .line 11
    .line 12
    const v1, 0x8000

    .line 13
    .line 14
    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v1}, Ld0/p;-><init>(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LK0/c;->b:Ld0/p;

    .line 22
    .line 23
    iput-boolean v2, p0, LK0/c;->c:Z

    .line 24
    .line 25
    new-instance v0, LF0/u;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LK0/c;->d:LF0/u;

    .line 31
    .line 32
    iput v2, p0, LK0/c;->g:I

    .line 33
    .line 34
    return-void
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
.method public final b(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, LK0/c;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, LK0/c;->l:LK0/b;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, LK0/b;->d(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, LK0/c;->n:J

    .line 26
    .line 27
    iput p2, p0, LK0/c;->m:I

    .line 28
    .line 29
    iget-object p1, p0, LK0/c;->b:Ld0/p;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ld0/p;->E(I)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public final d(LF0/r;LF0/u;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, v0, LK0/c;->g:I

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v4, :cond_28

    .line 10
    .line 11
    iget-object v6, v0, LK0/c;->a:[B

    .line 12
    .line 13
    if-eq v4, v3, :cond_27

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    if-eq v4, v1, :cond_25

    .line 18
    .line 19
    const/4 v9, 0x7

    .line 20
    const/4 v10, 0x6

    .line 21
    if-eq v4, v8, :cond_1c

    .line 22
    .line 23
    const-wide/16 v11, 0x0

    .line 24
    .line 25
    const-wide/16 v13, -0x1

    .line 26
    .line 27
    const/4 v6, 0x5

    .line 28
    if-eq v4, v7, :cond_16

    .line 29
    .line 30
    if-ne v4, v6, :cond_15

    .line 31
    .line 32
    iget-object v4, v0, LK0/c;->f:LF0/K;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v4, v0, LK0/c;->i:LF0/w;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, LK0/c;->l:LK0/b;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    iget-object v6, v4, LK0/b;->c:LF0/g;

    .line 47
    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    move-object/from16 v1, p1

    .line 51
    .line 52
    check-cast v1, LF0/m;

    .line 53
    .line 54
    move-object/from16 v2, p2

    .line 55
    .line 56
    invoke-virtual {v4, v1, v2}, LK0/b;->b(LF0/m;LF0/u;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    goto/16 :goto_d

    .line 61
    .line 62
    :cond_0
    iget-wide v6, v0, LK0/c;->n:J

    .line 63
    .line 64
    cmp-long v4, v6, v13

    .line 65
    .line 66
    const/4 v6, -0x1

    .line 67
    if-nez v4, :cond_7

    .line 68
    .line 69
    iget-object v4, v0, LK0/c;->i:LF0/w;

    .line 70
    .line 71
    move-object/from16 v7, p1

    .line 72
    .line 73
    check-cast v7, LF0/m;

    .line 74
    .line 75
    iput v2, v7, LF0/m;->q:I

    .line 76
    .line 77
    move-object/from16 v7, p1

    .line 78
    .line 79
    check-cast v7, LF0/m;

    .line 80
    .line 81
    invoke-virtual {v7, v3, v2}, LF0/m;->a(IZ)Z

    .line 82
    .line 83
    .line 84
    new-array v8, v3, [B

    .line 85
    .line 86
    invoke-virtual {v7, v8, v2, v3, v2}, LF0/m;->t([BIIZ)Z

    .line 87
    .line 88
    .line 89
    aget-byte v8, v8, v2

    .line 90
    .line 91
    and-int/2addr v8, v3

    .line 92
    if-ne v8, v3, :cond_1

    .line 93
    .line 94
    move v8, v3

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move v8, v2

    .line 97
    :goto_0
    invoke-virtual {v7, v1, v2}, LF0/m;->a(IZ)Z

    .line 98
    .line 99
    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    move v9, v10

    .line 104
    :goto_1
    new-instance v1, Ld0/p;

    .line 105
    .line 106
    invoke-direct {v1, v9}, Ld0/p;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iget-object v10, v1, Ld0/p;->a:[B

    .line 110
    .line 111
    move v13, v2

    .line 112
    :goto_2
    if-ge v13, v9, :cond_4

    .line 113
    .line 114
    sub-int v14, v9, v13

    .line 115
    .line 116
    invoke-virtual {v7, v10, v13, v14}, LF0/m;->d([BII)I

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    if-ne v14, v6, :cond_3

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    add-int/2addr v13, v14

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    :goto_3
    invoke-virtual {v1, v13}, Ld0/p;->G(I)V

    .line 126
    .line 127
    .line 128
    iput v2, v7, LF0/m;->q:I

    .line 129
    .line 130
    :try_start_0
    invoke-virtual {v1}, Ld0/p;->C()J

    .line 131
    .line 132
    .line 133
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    if-eqz v8, :cond_5

    .line 135
    .line 136
    :goto_4
    move-wide v11, v6

    .line 137
    goto :goto_5

    .line 138
    :cond_5
    iget v1, v4, LF0/w;->b:I

    .line 139
    .line 140
    int-to-long v8, v1

    .line 141
    mul-long/2addr v6, v8

    .line 142
    goto :goto_4

    .line 143
    :catch_0
    move v3, v2

    .line 144
    :goto_5
    if-eqz v3, :cond_6

    .line 145
    .line 146
    iput-wide v11, v0, LK0/c;->n:J

    .line 147
    .line 148
    goto/16 :goto_d

    .line 149
    .line 150
    :cond_6
    invoke-static {v5, v5}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    throw v1

    .line 155
    :cond_7
    iget-object v1, v0, LK0/c;->b:Ld0/p;

    .line 156
    .line 157
    iget v4, v1, Ld0/p;->c:I

    .line 158
    .line 159
    const-wide/32 v7, 0xf4240

    .line 160
    .line 161
    .line 162
    const v5, 0x8000

    .line 163
    .line 164
    .line 165
    if-ge v4, v5, :cond_a

    .line 166
    .line 167
    iget-object v9, v1, Ld0/p;->a:[B

    .line 168
    .line 169
    sub-int/2addr v5, v4

    .line 170
    move-object/from16 v10, p1

    .line 171
    .line 172
    check-cast v10, LF0/m;

    .line 173
    .line 174
    invoke-virtual {v10, v9, v4, v5}, LF0/m;->read([BII)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-ne v5, v6, :cond_8

    .line 179
    .line 180
    move v9, v3

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    move v9, v2

    .line 183
    :goto_6
    if-nez v9, :cond_9

    .line 184
    .line 185
    add-int/2addr v4, v5

    .line 186
    invoke-virtual {v1, v4}, Ld0/p;->G(I)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-nez v4, :cond_b

    .line 195
    .line 196
    iget-wide v1, v0, LK0/c;->n:J

    .line 197
    .line 198
    mul-long/2addr v1, v7

    .line 199
    iget-object v3, v0, LK0/c;->i:LF0/w;

    .line 200
    .line 201
    sget v4, Ld0/w;->a:I

    .line 202
    .line 203
    iget v3, v3, LF0/w;->e:I

    .line 204
    .line 205
    int-to-long v3, v3

    .line 206
    div-long v8, v1, v3

    .line 207
    .line 208
    iget-object v7, v0, LK0/c;->f:LF0/K;

    .line 209
    .line 210
    iget v11, v0, LK0/c;->m:I

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const/4 v10, 0x1

    .line 214
    const/4 v12, 0x0

    .line 215
    invoke-interface/range {v7 .. v13}, LF0/K;->b(JIIILF0/J;)V

    .line 216
    .line 217
    .line 218
    move v2, v6

    .line 219
    goto/16 :goto_d

    .line 220
    .line 221
    :cond_a
    move v9, v2

    .line 222
    :cond_b
    :goto_7
    iget v4, v1, Ld0/p;->b:I

    .line 223
    .line 224
    iget v5, v0, LK0/c;->m:I

    .line 225
    .line 226
    iget v6, v0, LK0/c;->j:I

    .line 227
    .line 228
    if-ge v5, v6, :cond_c

    .line 229
    .line 230
    sub-int/2addr v6, v5

    .line 231
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    invoke-virtual {v1, v5}, Ld0/p;->I(I)V

    .line 240
    .line 241
    .line 242
    :cond_c
    iget-object v5, v0, LK0/c;->i:LF0/w;

    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget v5, v1, Ld0/p;->b:I

    .line 248
    .line 249
    :goto_8
    iget v6, v1, Ld0/p;->c:I

    .line 250
    .line 251
    const/16 v10, 0x10

    .line 252
    .line 253
    sub-int/2addr v6, v10

    .line 254
    iget-object v11, v0, LK0/c;->d:LF0/u;

    .line 255
    .line 256
    if-gt v5, v6, :cond_e

    .line 257
    .line 258
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 259
    .line 260
    .line 261
    iget-object v6, v0, LK0/c;->i:LF0/w;

    .line 262
    .line 263
    iget v12, v0, LK0/c;->k:I

    .line 264
    .line 265
    invoke-static {v1, v6, v12, v11}, LF0/b;->d(Ld0/p;LF0/w;ILF0/u;)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_d

    .line 270
    .line 271
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 272
    .line 273
    .line 274
    iget-wide v5, v11, LF0/u;->a:J

    .line 275
    .line 276
    goto :goto_c

    .line 277
    :cond_d
    add-int/2addr v5, v3

    .line 278
    goto :goto_8

    .line 279
    :cond_e
    if-eqz v9, :cond_12

    .line 280
    .line 281
    :goto_9
    iget v6, v1, Ld0/p;->c:I

    .line 282
    .line 283
    iget v9, v0, LK0/c;->j:I

    .line 284
    .line 285
    sub-int v9, v6, v9

    .line 286
    .line 287
    if-gt v5, v9, :cond_11

    .line 288
    .line 289
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 290
    .line 291
    .line 292
    :try_start_1
    iget-object v6, v0, LK0/c;->i:LF0/w;

    .line 293
    .line 294
    iget v9, v0, LK0/c;->k:I

    .line 295
    .line 296
    invoke-static {v1, v6, v9, v11}, LF0/b;->d(Ld0/p;LF0/w;ILF0/u;)Z

    .line 297
    .line 298
    .line 299
    move-result v6
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 300
    goto :goto_a

    .line 301
    :catch_1
    move v6, v2

    .line 302
    :goto_a
    iget v9, v1, Ld0/p;->b:I

    .line 303
    .line 304
    iget v12, v1, Ld0/p;->c:I

    .line 305
    .line 306
    if-le v9, v12, :cond_f

    .line 307
    .line 308
    move v6, v2

    .line 309
    :cond_f
    if-eqz v6, :cond_10

    .line 310
    .line 311
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 312
    .line 313
    .line 314
    iget-wide v5, v11, LF0/u;->a:J

    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_10
    add-int/2addr v5, v3

    .line 318
    goto :goto_9

    .line 319
    :cond_11
    invoke-virtual {v1, v6}, Ld0/p;->H(I)V

    .line 320
    .line 321
    .line 322
    goto :goto_b

    .line 323
    :cond_12
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 324
    .line 325
    .line 326
    :goto_b
    move-wide v5, v13

    .line 327
    :goto_c
    iget v3, v1, Ld0/p;->b:I

    .line 328
    .line 329
    sub-int/2addr v3, v4

    .line 330
    invoke-virtual {v1, v4}, Ld0/p;->H(I)V

    .line 331
    .line 332
    .line 333
    iget-object v4, v0, LK0/c;->f:LF0/K;

    .line 334
    .line 335
    invoke-interface {v4, v1, v3, v2}, LF0/K;->a(Ld0/p;II)V

    .line 336
    .line 337
    .line 338
    iget v4, v0, LK0/c;->m:I

    .line 339
    .line 340
    add-int/2addr v3, v4

    .line 341
    iput v3, v0, LK0/c;->m:I

    .line 342
    .line 343
    cmp-long v4, v5, v13

    .line 344
    .line 345
    if-eqz v4, :cond_13

    .line 346
    .line 347
    iget-wide v11, v0, LK0/c;->n:J

    .line 348
    .line 349
    mul-long/2addr v11, v7

    .line 350
    iget-object v4, v0, LK0/c;->i:LF0/w;

    .line 351
    .line 352
    sget v7, Ld0/w;->a:I

    .line 353
    .line 354
    iget v4, v4, LF0/w;->e:I

    .line 355
    .line 356
    int-to-long v7, v4

    .line 357
    div-long v16, v11, v7

    .line 358
    .line 359
    iget-object v15, v0, LK0/c;->f:LF0/K;

    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    const/16 v18, 0x1

    .line 364
    .line 365
    const/16 v20, 0x0

    .line 366
    .line 367
    move/from16 v19, v3

    .line 368
    .line 369
    invoke-interface/range {v15 .. v21}, LF0/K;->b(JIIILF0/J;)V

    .line 370
    .line 371
    .line 372
    iput v2, v0, LK0/c;->m:I

    .line 373
    .line 374
    iput-wide v5, v0, LK0/c;->n:J

    .line 375
    .line 376
    :cond_13
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-ge v3, v10, :cond_14

    .line 381
    .line 382
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    iget-object v4, v1, Ld0/p;->a:[B

    .line 387
    .line 388
    iget v5, v1, Ld0/p;->b:I

    .line 389
    .line 390
    invoke-static {v4, v5, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v2}, Ld0/p;->H(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v3}, Ld0/p;->G(I)V

    .line 397
    .line 398
    .line 399
    :cond_14
    :goto_d
    return v2

    .line 400
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 401
    .line 402
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :cond_16
    move-object/from16 v3, p1

    .line 407
    .line 408
    check-cast v3, LF0/m;

    .line 409
    .line 410
    iput v2, v3, LF0/m;->q:I

    .line 411
    .line 412
    new-instance v3, Ld0/p;

    .line 413
    .line 414
    invoke-direct {v3, v1}, Ld0/p;-><init>(I)V

    .line 415
    .line 416
    .line 417
    iget-object v4, v3, Ld0/p;->a:[B

    .line 418
    .line 419
    move-object/from16 v7, p1

    .line 420
    .line 421
    check-cast v7, LF0/m;

    .line 422
    .line 423
    invoke-virtual {v7, v4, v2, v1, v2}, LF0/m;->t([BIIZ)Z

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Ld0/p;->B()I

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    shr-int/lit8 v4, v3, 0x2

    .line 431
    .line 432
    const/16 v8, 0x3ffe

    .line 433
    .line 434
    if-ne v4, v8, :cond_1b

    .line 435
    .line 436
    iput v2, v7, LF0/m;->q:I

    .line 437
    .line 438
    iput v3, v0, LK0/c;->k:I

    .line 439
    .line 440
    iget-object v3, v0, LK0/c;->e:LF0/s;

    .line 441
    .line 442
    sget v4, Ld0/w;->a:I

    .line 443
    .line 444
    iget-wide v4, v7, LF0/m;->o:J

    .line 445
    .line 446
    iget-object v8, v0, LK0/c;->i:LF0/w;

    .line 447
    .line 448
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget-object v8, v0, LK0/c;->i:LF0/w;

    .line 452
    .line 453
    iget-object v9, v8, LF0/w;->k:LZ1/l;

    .line 454
    .line 455
    if-eqz v9, :cond_17

    .line 456
    .line 457
    new-instance v1, LF0/v;

    .line 458
    .line 459
    invoke-direct {v1, v8, v4, v5, v2}, LF0/v;-><init>(Ljava/lang/Object;JI)V

    .line 460
    .line 461
    .line 462
    move-object v2, v3

    .line 463
    goto/16 :goto_11

    .line 464
    .line 465
    :cond_17
    iget-wide v6, v7, LF0/m;->n:J

    .line 466
    .line 467
    cmp-long v9, v6, v13

    .line 468
    .line 469
    if-eqz v9, :cond_1a

    .line 470
    .line 471
    iget-wide v13, v8, LF0/w;->j:J

    .line 472
    .line 473
    cmp-long v9, v13, v11

    .line 474
    .line 475
    if-lez v9, :cond_1a

    .line 476
    .line 477
    new-instance v9, LK0/b;

    .line 478
    .line 479
    iget v11, v0, LK0/c;->k:I

    .line 480
    .line 481
    new-instance v12, LI2/g;

    .line 482
    .line 483
    invoke-direct {v12, v8, v1}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 484
    .line 485
    .line 486
    new-instance v1, LK0/a;

    .line 487
    .line 488
    invoke-direct {v1, v8, v11}, LK0/a;-><init>(LF0/w;I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v8}, LF0/w;->b()J

    .line 492
    .line 493
    .line 494
    move-result-wide v18

    .line 495
    iget v11, v8, LF0/w;->c:I

    .line 496
    .line 497
    iget v13, v8, LF0/w;->d:I

    .line 498
    .line 499
    if-lez v13, :cond_18

    .line 500
    .line 501
    int-to-long v13, v13

    .line 502
    move-object/from16 p1, v3

    .line 503
    .line 504
    int-to-long v2, v11

    .line 505
    add-long/2addr v13, v2

    .line 506
    const-wide/16 v2, 0x2

    .line 507
    .line 508
    div-long/2addr v13, v2

    .line 509
    const-wide/16 v2, 0x1

    .line 510
    .line 511
    add-long/2addr v13, v2

    .line 512
    move-wide/from16 v26, v13

    .line 513
    .line 514
    goto :goto_f

    .line 515
    :cond_18
    move-object/from16 p1, v3

    .line 516
    .line 517
    iget v2, v8, LF0/w;->b:I

    .line 518
    .line 519
    iget v3, v8, LF0/w;->a:I

    .line 520
    .line 521
    if-ne v3, v2, :cond_19

    .line 522
    .line 523
    if-lez v3, :cond_19

    .line 524
    .line 525
    int-to-long v2, v3

    .line 526
    goto :goto_e

    .line 527
    :cond_19
    const-wide/16 v2, 0x1000

    .line 528
    .line 529
    :goto_e
    iget v13, v8, LF0/w;->g:I

    .line 530
    .line 531
    int-to-long v13, v13

    .line 532
    mul-long/2addr v2, v13

    .line 533
    iget v13, v8, LF0/w;->h:I

    .line 534
    .line 535
    int-to-long v13, v13

    .line 536
    mul-long/2addr v2, v13

    .line 537
    const-wide/16 v13, 0x8

    .line 538
    .line 539
    div-long/2addr v2, v13

    .line 540
    const-wide/16 v13, 0x40

    .line 541
    .line 542
    add-long/2addr v2, v13

    .line 543
    move-wide/from16 v26, v2

    .line 544
    .line 545
    :goto_f
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 546
    .line 547
    .line 548
    move-result v28

    .line 549
    iget-wide v2, v8, LF0/w;->j:J

    .line 550
    .line 551
    move-object v15, v9

    .line 552
    move-object/from16 v16, v12

    .line 553
    .line 554
    move-object/from16 v17, v1

    .line 555
    .line 556
    move-wide/from16 v20, v2

    .line 557
    .line 558
    move-wide/from16 v22, v4

    .line 559
    .line 560
    move-wide/from16 v24, v6

    .line 561
    .line 562
    invoke-direct/range {v15 .. v28}, LK0/b;-><init>(LF0/h;LF0/j;JJJJJI)V

    .line 563
    .line 564
    .line 565
    iput-object v9, v0, LK0/c;->l:LK0/b;

    .line 566
    .line 567
    iget-object v1, v9, LK0/b;->a:LF0/f;

    .line 568
    .line 569
    :goto_10
    move-object/from16 v2, p1

    .line 570
    .line 571
    goto :goto_11

    .line 572
    :cond_1a
    move-object/from16 p1, v3

    .line 573
    .line 574
    new-instance v1, LF0/v;

    .line 575
    .line 576
    invoke-virtual {v8}, LF0/w;->b()J

    .line 577
    .line 578
    .line 579
    move-result-wide v2

    .line 580
    invoke-direct {v1, v2, v3}, LF0/v;-><init>(J)V

    .line 581
    .line 582
    .line 583
    goto :goto_10

    .line 584
    :goto_11
    invoke-interface {v2, v1}, LF0/s;->d(LF0/E;)V

    .line 585
    .line 586
    .line 587
    const/4 v1, 0x5

    .line 588
    iput v1, v0, LK0/c;->g:I

    .line 589
    .line 590
    const/4 v1, 0x0

    .line 591
    return v1

    .line 592
    :cond_1b
    move v1, v2

    .line 593
    iput v1, v7, LF0/m;->q:I

    .line 594
    .line 595
    const-string v1, "First frame does not start with sync code."

    .line 596
    .line 597
    invoke-static {v5, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    throw v1

    .line 602
    :cond_1c
    move v1, v2

    .line 603
    iget-object v2, v0, LK0/c;->i:LF0/w;

    .line 604
    .line 605
    move/from16 v29, v1

    .line 606
    .line 607
    :goto_12
    if-nez v29, :cond_24

    .line 608
    .line 609
    move-object/from16 v3, p1

    .line 610
    .line 611
    check-cast v3, LF0/m;

    .line 612
    .line 613
    iput v1, v3, LF0/m;->q:I

    .line 614
    .line 615
    new-instance v3, LF0/M;

    .line 616
    .line 617
    new-array v4, v7, [B

    .line 618
    .line 619
    invoke-direct {v3, v7, v4}, LF0/M;-><init>(I[B)V

    .line 620
    .line 621
    .line 622
    move-object/from16 v5, p1

    .line 623
    .line 624
    check-cast v5, LF0/m;

    .line 625
    .line 626
    invoke-virtual {v5, v4, v1, v7, v1}, LF0/m;->t([BIIZ)Z

    .line 627
    .line 628
    .line 629
    invoke-virtual {v3}, LF0/M;->h()Z

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    invoke-virtual {v3, v9}, LF0/M;->i(I)I

    .line 634
    .line 635
    .line 636
    move-result v11

    .line 637
    const/16 v12, 0x18

    .line 638
    .line 639
    invoke-virtual {v3, v12}, LF0/M;->i(I)I

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    add-int/2addr v3, v7

    .line 644
    if-nez v11, :cond_1d

    .line 645
    .line 646
    const/16 v2, 0x26

    .line 647
    .line 648
    new-array v3, v2, [B

    .line 649
    .line 650
    invoke-virtual {v5, v3, v1, v2, v1}, LF0/m;->l([BIIZ)Z

    .line 651
    .line 652
    .line 653
    new-instance v1, LF0/w;

    .line 654
    .line 655
    invoke-direct {v1, v7, v3}, LF0/w;-><init>(I[B)V

    .line 656
    .line 657
    .line 658
    :goto_13
    move-object v2, v1

    .line 659
    goto/16 :goto_18

    .line 660
    .line 661
    :cond_1d
    if-eqz v2, :cond_23

    .line 662
    .line 663
    if-ne v11, v8, :cond_1e

    .line 664
    .line 665
    new-instance v1, Ld0/p;

    .line 666
    .line 667
    invoke-direct {v1, v3}, Ld0/p;-><init>(I)V

    .line 668
    .line 669
    .line 670
    iget-object v11, v1, Ld0/p;->a:[B

    .line 671
    .line 672
    const/4 v12, 0x0

    .line 673
    invoke-virtual {v5, v11, v12, v3, v12}, LF0/m;->l([BIIZ)Z

    .line 674
    .line 675
    .line 676
    invoke-static {v1}, LF0/b;->w(Ld0/p;)LZ1/l;

    .line 677
    .line 678
    .line 679
    move-result-object v23

    .line 680
    new-instance v1, LF0/w;

    .line 681
    .line 682
    iget-wide v11, v2, LF0/w;->j:J

    .line 683
    .line 684
    iget-object v3, v2, LF0/w;->l:La0/F;

    .line 685
    .line 686
    iget v14, v2, LF0/w;->a:I

    .line 687
    .line 688
    iget v15, v2, LF0/w;->b:I

    .line 689
    .line 690
    iget v5, v2, LF0/w;->c:I

    .line 691
    .line 692
    iget v13, v2, LF0/w;->d:I

    .line 693
    .line 694
    iget v9, v2, LF0/w;->e:I

    .line 695
    .line 696
    iget v8, v2, LF0/w;->g:I

    .line 697
    .line 698
    iget v2, v2, LF0/w;->h:I

    .line 699
    .line 700
    move/from16 v17, v13

    .line 701
    .line 702
    move-object v13, v1

    .line 703
    move/from16 v16, v5

    .line 704
    .line 705
    move/from16 v18, v9

    .line 706
    .line 707
    move/from16 v19, v8

    .line 708
    .line 709
    move/from16 v20, v2

    .line 710
    .line 711
    move-wide/from16 v21, v11

    .line 712
    .line 713
    move-object/from16 v24, v3

    .line 714
    .line 715
    invoke-direct/range {v13 .. v24}, LF0/w;-><init>(IIIIIIIJLZ1/l;La0/F;)V

    .line 716
    .line 717
    .line 718
    goto :goto_13

    .line 719
    :cond_1e
    iget-object v1, v2, LF0/w;->l:La0/F;

    .line 720
    .line 721
    if-ne v11, v7, :cond_20

    .line 722
    .line 723
    new-instance v8, Ld0/p;

    .line 724
    .line 725
    invoke-direct {v8, v3}, Ld0/p;-><init>(I)V

    .line 726
    .line 727
    .line 728
    iget-object v9, v8, Ld0/p;->a:[B

    .line 729
    .line 730
    const/4 v11, 0x0

    .line 731
    invoke-virtual {v5, v9, v11, v3, v11}, LF0/m;->l([BIIZ)Z

    .line 732
    .line 733
    .line 734
    invoke-virtual {v8, v7}, Ld0/p;->I(I)V

    .line 735
    .line 736
    .line 737
    invoke-static {v8, v11, v11}, LF0/b;->x(Ld0/p;ZZ)LB0/d;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    iget-object v3, v3, LB0/d;->l:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v3, [Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-static {v3}, LF0/b;->u(Ljava/util/List;)La0/F;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    if-nez v1, :cond_1f

    .line 754
    .line 755
    :goto_14
    move-object/from16 v22, v3

    .line 756
    .line 757
    goto :goto_15

    .line 758
    :cond_1f
    invoke-virtual {v1, v3}, La0/F;->e(La0/F;)La0/F;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    goto :goto_14

    .line 763
    :goto_15
    new-instance v1, LF0/w;

    .line 764
    .line 765
    iget-wide v8, v2, LF0/w;->j:J

    .line 766
    .line 767
    iget-object v3, v2, LF0/w;->k:LZ1/l;

    .line 768
    .line 769
    iget v12, v2, LF0/w;->a:I

    .line 770
    .line 771
    iget v13, v2, LF0/w;->b:I

    .line 772
    .line 773
    iget v14, v2, LF0/w;->c:I

    .line 774
    .line 775
    iget v15, v2, LF0/w;->d:I

    .line 776
    .line 777
    iget v5, v2, LF0/w;->e:I

    .line 778
    .line 779
    iget v11, v2, LF0/w;->g:I

    .line 780
    .line 781
    iget v2, v2, LF0/w;->h:I

    .line 782
    .line 783
    move/from16 v17, v11

    .line 784
    .line 785
    move-object v11, v1

    .line 786
    move/from16 v16, v5

    .line 787
    .line 788
    move/from16 v18, v2

    .line 789
    .line 790
    move-wide/from16 v19, v8

    .line 791
    .line 792
    move-object/from16 v21, v3

    .line 793
    .line 794
    invoke-direct/range {v11 .. v22}, LF0/w;-><init>(IIIIIIIJLZ1/l;La0/F;)V

    .line 795
    .line 796
    .line 797
    goto/16 :goto_13

    .line 798
    .line 799
    :cond_20
    if-ne v11, v10, :cond_22

    .line 800
    .line 801
    new-instance v8, Ld0/p;

    .line 802
    .line 803
    invoke-direct {v8, v3}, Ld0/p;-><init>(I)V

    .line 804
    .line 805
    .line 806
    iget-object v9, v8, Ld0/p;->a:[B

    .line 807
    .line 808
    const/4 v11, 0x0

    .line 809
    invoke-virtual {v5, v9, v11, v3, v11}, LF0/m;->l([BIIZ)Z

    .line 810
    .line 811
    .line 812
    invoke-virtual {v8, v7}, Ld0/p;->I(I)V

    .line 813
    .line 814
    .line 815
    invoke-static {v8}, LR0/a;->d(Ld0/p;)LR0/a;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    invoke-static {v3}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    new-instance v5, La0/F;

    .line 824
    .line 825
    invoke-direct {v5, v3}, La0/F;-><init>(Ljava/util/List;)V

    .line 826
    .line 827
    .line 828
    if-nez v1, :cond_21

    .line 829
    .line 830
    :goto_16
    move-object/from16 v22, v5

    .line 831
    .line 832
    goto :goto_17

    .line 833
    :cond_21
    invoke-virtual {v1, v5}, La0/F;->e(La0/F;)La0/F;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    goto :goto_16

    .line 838
    :goto_17
    new-instance v1, LF0/w;

    .line 839
    .line 840
    iget-wide v8, v2, LF0/w;->j:J

    .line 841
    .line 842
    iget-object v3, v2, LF0/w;->k:LZ1/l;

    .line 843
    .line 844
    iget v12, v2, LF0/w;->a:I

    .line 845
    .line 846
    iget v13, v2, LF0/w;->b:I

    .line 847
    .line 848
    iget v14, v2, LF0/w;->c:I

    .line 849
    .line 850
    iget v15, v2, LF0/w;->d:I

    .line 851
    .line 852
    iget v5, v2, LF0/w;->e:I

    .line 853
    .line 854
    iget v11, v2, LF0/w;->g:I

    .line 855
    .line 856
    iget v2, v2, LF0/w;->h:I

    .line 857
    .line 858
    move/from16 v17, v11

    .line 859
    .line 860
    move-object v11, v1

    .line 861
    move/from16 v16, v5

    .line 862
    .line 863
    move/from16 v18, v2

    .line 864
    .line 865
    move-wide/from16 v19, v8

    .line 866
    .line 867
    move-object/from16 v21, v3

    .line 868
    .line 869
    invoke-direct/range {v11 .. v22}, LF0/w;-><init>(IIIIIIIJLZ1/l;La0/F;)V

    .line 870
    .line 871
    .line 872
    goto/16 :goto_13

    .line 873
    .line 874
    :cond_22
    invoke-virtual {v5, v3}, LF0/m;->f(I)V

    .line 875
    .line 876
    .line 877
    :goto_18
    sget v1, Ld0/w;->a:I

    .line 878
    .line 879
    iput-object v2, v0, LK0/c;->i:LF0/w;

    .line 880
    .line 881
    move/from16 v29, v4

    .line 882
    .line 883
    const/4 v1, 0x0

    .line 884
    const/4 v8, 0x3

    .line 885
    const/4 v9, 0x7

    .line 886
    goto/16 :goto_12

    .line 887
    .line 888
    :cond_23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 889
    .line 890
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 891
    .line 892
    .line 893
    throw v1

    .line 894
    :cond_24
    iget-object v1, v0, LK0/c;->i:LF0/w;

    .line 895
    .line 896
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    iget-object v1, v0, LK0/c;->i:LF0/w;

    .line 900
    .line 901
    iget v1, v1, LF0/w;->c:I

    .line 902
    .line 903
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    iput v1, v0, LK0/c;->j:I

    .line 908
    .line 909
    iget-object v1, v0, LK0/c;->f:LF0/K;

    .line 910
    .line 911
    sget v2, Ld0/w;->a:I

    .line 912
    .line 913
    iget-object v2, v0, LK0/c;->i:LF0/w;

    .line 914
    .line 915
    iget-object v3, v0, LK0/c;->h:La0/F;

    .line 916
    .line 917
    invoke-virtual {v2, v6, v3}, LF0/w;->c([BLa0/F;)La0/p;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    invoke-interface {v1, v2}, LF0/K;->c(La0/p;)V

    .line 922
    .line 923
    .line 924
    iput v7, v0, LK0/c;->g:I

    .line 925
    .line 926
    const/4 v2, 0x0

    .line 927
    return v2

    .line 928
    :cond_25
    new-instance v1, Ld0/p;

    .line 929
    .line 930
    invoke-direct {v1, v7}, Ld0/p;-><init>(I)V

    .line 931
    .line 932
    .line 933
    iget-object v3, v1, Ld0/p;->a:[B

    .line 934
    .line 935
    move-object/from16 v4, p1

    .line 936
    .line 937
    check-cast v4, LF0/m;

    .line 938
    .line 939
    invoke-virtual {v4, v3, v2, v7, v2}, LF0/m;->l([BIIZ)Z

    .line 940
    .line 941
    .line 942
    invoke-virtual {v1}, Ld0/p;->x()J

    .line 943
    .line 944
    .line 945
    move-result-wide v3

    .line 946
    const-wide/32 v6, 0x664c6143

    .line 947
    .line 948
    .line 949
    cmp-long v1, v3, v6

    .line 950
    .line 951
    if-nez v1, :cond_26

    .line 952
    .line 953
    const/4 v1, 0x3

    .line 954
    iput v1, v0, LK0/c;->g:I

    .line 955
    .line 956
    return v2

    .line 957
    :cond_26
    const-string v1, "Failed to read FLAC stream marker."

    .line 958
    .line 959
    invoke-static {v5, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    throw v1

    .line 964
    :cond_27
    array-length v3, v6

    .line 965
    move-object/from16 v4, p1

    .line 966
    .line 967
    check-cast v4, LF0/m;

    .line 968
    .line 969
    invoke-virtual {v4, v6, v2, v3, v2}, LF0/m;->t([BIIZ)Z

    .line 970
    .line 971
    .line 972
    move-object/from16 v3, p1

    .line 973
    .line 974
    check-cast v3, LF0/m;

    .line 975
    .line 976
    iput v2, v3, LF0/m;->q:I

    .line 977
    .line 978
    iput v1, v0, LK0/c;->g:I

    .line 979
    .line 980
    return v2

    .line 981
    :cond_28
    move-object/from16 v1, p1

    .line 982
    .line 983
    check-cast v1, LF0/m;

    .line 984
    .line 985
    iput v2, v1, LF0/m;->q:I

    .line 986
    .line 987
    move-object/from16 v1, p1

    .line 988
    .line 989
    check-cast v1, LF0/m;

    .line 990
    .line 991
    invoke-virtual {v1}, LF0/m;->w()J

    .line 992
    .line 993
    .line 994
    move-result-wide v6

    .line 995
    iget-boolean v4, v0, LK0/c;->c:Z

    .line 996
    .line 997
    if-nez v4, :cond_29

    .line 998
    .line 999
    move-object v4, v5

    .line 1000
    goto :goto_19

    .line 1001
    :cond_29
    sget-object v4, LT0/h;->d:LB0/l;

    .line 1002
    .line 1003
    :goto_19
    new-instance v8, LF0/A;

    .line 1004
    .line 1005
    invoke-direct {v8, v2}, LF0/A;-><init>(I)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v8, v1, v4}, LF0/A;->a(LF0/m;LB0/l;)La0/F;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    if-eqz v2, :cond_2b

    .line 1013
    .line 1014
    iget-object v4, v2, La0/F;->l:[La0/E;

    .line 1015
    .line 1016
    array-length v4, v4

    .line 1017
    if-nez v4, :cond_2a

    .line 1018
    .line 1019
    goto :goto_1a

    .line 1020
    :cond_2a
    move-object v5, v2

    .line 1021
    :cond_2b
    :goto_1a
    invoke-virtual {v1}, LF0/m;->w()J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v8

    .line 1025
    sub-long/2addr v8, v6

    .line 1026
    long-to-int v2, v8

    .line 1027
    invoke-virtual {v1, v2}, LF0/m;->f(I)V

    .line 1028
    .line 1029
    .line 1030
    iput-object v5, v0, LK0/c;->h:La0/F;

    .line 1031
    .line 1032
    iput v3, v0, LK0/c;->g:I

    .line 1033
    .line 1034
    const/4 v1, 0x0

    .line 1035
    return v1
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
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

.method public final e(LF0/r;)Z
    .locals 6

    .line 1
    check-cast p1, LF0/m;

    .line 2
    .line 3
    sget-object v0, LT0/h;->d:LB0/l;

    .line 4
    .line 5
    new-instance v1, LF0/A;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, LF0/A;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, LF0/A;->a(LF0/m;LB0/l;)La0/F;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, La0/F;->l:[La0/E;

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    :cond_0
    new-instance v0, Ld0/p;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-direct {v0, v1}, Ld0/p;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Ld0/p;->a:[B

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ld0/p;->x()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/32 v4, 0x664c6143

    .line 37
    .line 38
    .line 39
    cmp-long p1, v0, v4

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    :cond_1
    return v3
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

.method public final j(LF0/s;)V
    .locals 2

    .line 1
    iput-object p1, p0, LK0/c;->e:LF0/s;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, LF0/s;->k(II)LF0/K;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LK0/c;->f:LF0/K;

    .line 10
    .line 11
    invoke-interface {p1}, LF0/s;->j()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final release()V
    .locals 0

    .line 1
    return-void
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
