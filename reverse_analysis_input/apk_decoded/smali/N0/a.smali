.class public final LN0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:Ld0/p;

.field public b:LF0/s;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:LU0/a;

.field public h:LF0/m;

.field public i:LN0/c;

.field public j:LZ0/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld0/p;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Ld0/p;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LN0/a;->a:Ld0/p;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, LN0/a;->f:J

    .line 15
    .line 16
    return-void
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
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LN0/a;->b:LF0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, LF0/s;->j()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LN0/a;->b:LF0/s;

    .line 10
    .line 11
    new-instance v1, LF0/v;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, LF0/v;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, LF0/s;->d(LF0/E;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    iput v0, p0, LN0/a;->c:I

    .line 26
    .line 27
    return-void
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

.method public final b(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, LN0/a;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, LN0/a;->j:LZ0/p;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, LN0/a;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LN0/a;->j:LZ0/p;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, LZ0/p;->b(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
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

.method public final d(LF0/r;LF0/u;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    iget v7, v0, LN0/a;->c:I

    .line 12
    .line 13
    const-wide/16 v8, -0x1

    .line 14
    .line 15
    iget-object v10, v0, LN0/a;->a:Ld0/p;

    .line 16
    .line 17
    const/4 v11, 0x4

    .line 18
    if-eqz v7, :cond_17

    .line 19
    .line 20
    if-eq v7, v4, :cond_16

    .line 21
    .line 22
    if-eq v7, v5, :cond_a

    .line 23
    .line 24
    const/4 v8, 0x5

    .line 25
    if-eq v7, v11, :cond_5

    .line 26
    .line 27
    if-eq v7, v8, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    if-ne v7, v1, :cond_0

    .line 31
    .line 32
    return v3

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    iget-object v3, v0, LN0/a;->i:LN0/c;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v0, LN0/a;->h:LF0/m;

    .line 44
    .line 45
    if-eq v1, v3, :cond_3

    .line 46
    .line 47
    :cond_2
    check-cast v1, LF0/m;

    .line 48
    .line 49
    iput-object v1, v0, LN0/a;->h:LF0/m;

    .line 50
    .line 51
    new-instance v3, LN0/c;

    .line 52
    .line 53
    iget-wide v5, v0, LN0/a;->f:J

    .line 54
    .line 55
    invoke-direct {v3, v1, v5, v6}, LN0/c;-><init>(LF0/m;J)V

    .line 56
    .line 57
    .line 58
    iput-object v3, v0, LN0/a;->i:LN0/c;

    .line 59
    .line 60
    :cond_3
    iget-object v1, v0, LN0/a;->j:LZ0/p;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v3, v0, LN0/a;->i:LN0/c;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v2}, LZ0/p;->d(LF0/r;LF0/u;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v4, :cond_4

    .line 72
    .line 73
    iget-wide v3, v2, LF0/u;->a:J

    .line 74
    .line 75
    iget-wide v5, v0, LN0/a;->f:J

    .line 76
    .line 77
    add-long/2addr v3, v5

    .line 78
    iput-wide v3, v2, LF0/u;->a:J

    .line 79
    .line 80
    :cond_4
    return v1

    .line 81
    :cond_5
    move-object v3, v1

    .line 82
    check-cast v3, LF0/m;

    .line 83
    .line 84
    iget-wide v12, v3, LF0/m;->o:J

    .line 85
    .line 86
    iget-wide v14, v0, LN0/a;->f:J

    .line 87
    .line 88
    cmp-long v3, v12, v14

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iput-wide v14, v2, LF0/u;->a:J

    .line 93
    .line 94
    return v4

    .line 95
    :cond_6
    iget-object v2, v10, Ld0/p;->a:[B

    .line 96
    .line 97
    check-cast v1, LF0/m;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v6, v4, v4}, LF0/m;->t([BIIZ)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, LN0/a;->a()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    iput v6, v1, LF0/m;->q:I

    .line 110
    .line 111
    iget-object v2, v0, LN0/a;->j:LZ0/p;

    .line 112
    .line 113
    if-nez v2, :cond_8

    .line 114
    .line 115
    new-instance v2, LZ0/p;

    .line 116
    .line 117
    sget-object v3, Lc1/j;->h:La0/z;

    .line 118
    .line 119
    const/16 v7, 0x8

    .line 120
    .line 121
    invoke-direct {v2, v3, v7}, LZ0/p;-><init>(Lc1/j;I)V

    .line 122
    .line 123
    .line 124
    iput-object v2, v0, LN0/a;->j:LZ0/p;

    .line 125
    .line 126
    :cond_8
    new-instance v2, LN0/c;

    .line 127
    .line 128
    iget-wide v9, v0, LN0/a;->f:J

    .line 129
    .line 130
    invoke-direct {v2, v1, v9, v10}, LN0/c;-><init>(LF0/m;J)V

    .line 131
    .line 132
    .line 133
    iput-object v2, v0, LN0/a;->i:LN0/c;

    .line 134
    .line 135
    iget-object v1, v0, LN0/a;->j:LZ0/p;

    .line 136
    .line 137
    invoke-virtual {v1, v2}, LZ0/p;->e(LF0/r;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    iget-object v1, v0, LN0/a;->j:LZ0/p;

    .line 144
    .line 145
    new-instance v2, LN0/c;

    .line 146
    .line 147
    iget-wide v9, v0, LN0/a;->f:J

    .line 148
    .line 149
    iget-object v3, v0, LN0/a;->b:LF0/s;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-direct {v2, v9, v10, v3, v5}, LN0/c;-><init>(JLjava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2}, LZ0/p;->j(LF0/s;)V

    .line 158
    .line 159
    .line 160
    iget-object v1, v0, LN0/a;->g:LU0/a;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, LN0/a;->b:LF0/s;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    const/16 v3, 0x400

    .line 171
    .line 172
    invoke-interface {v2, v3, v11}, LF0/s;->k(II)LF0/K;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    new-instance v3, La0/o;

    .line 177
    .line 178
    invoke-direct {v3}, La0/o;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v5, "image/jpeg"

    .line 182
    .line 183
    invoke-static {v5}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    iput-object v5, v3, La0/o;->l:Ljava/lang/String;

    .line 188
    .line 189
    new-instance v5, La0/F;

    .line 190
    .line 191
    new-array v4, v4, [La0/E;

    .line 192
    .line 193
    aput-object v1, v4, v6

    .line 194
    .line 195
    invoke-direct {v5, v4}, La0/F;-><init>([La0/E;)V

    .line 196
    .line 197
    .line 198
    iput-object v5, v3, La0/o;->k:La0/F;

    .line 199
    .line 200
    invoke-static {v3, v2}, Lm/B0;->k(La0/o;LF0/K;)V

    .line 201
    .line 202
    .line 203
    iput v8, v0, LN0/a;->c:I

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_9
    invoke-virtual/range {p0 .. p0}, LN0/a;->a()V

    .line 207
    .line 208
    .line 209
    :goto_0
    return v6

    .line 210
    :cond_a
    iget v2, v0, LN0/a;->d:I

    .line 211
    .line 212
    const v7, 0xffe1

    .line 213
    .line 214
    .line 215
    if-ne v2, v7, :cond_15

    .line 216
    .line 217
    new-instance v2, Ld0/p;

    .line 218
    .line 219
    iget v7, v0, LN0/a;->e:I

    .line 220
    .line 221
    invoke-direct {v2, v7}, Ld0/p;-><init>(I)V

    .line 222
    .line 223
    .line 224
    iget-object v7, v2, Ld0/p;->a:[B

    .line 225
    .line 226
    iget v10, v0, LN0/a;->e:I

    .line 227
    .line 228
    move-object v11, v1

    .line 229
    check-cast v11, LF0/m;

    .line 230
    .line 231
    invoke-virtual {v11, v7, v6, v10, v6}, LF0/m;->l([BIIZ)Z

    .line 232
    .line 233
    .line 234
    iget-object v7, v0, LN0/a;->g:LU0/a;

    .line 235
    .line 236
    if-nez v7, :cond_14

    .line 237
    .line 238
    const-string v7, "http://ns.adobe.com/xap/1.0/"

    .line 239
    .line 240
    invoke-virtual {v2}, Ld0/p;->q()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    if-eqz v7, :cond_14

    .line 249
    .line 250
    invoke-virtual {v2}, Ld0/p;->q()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    if-eqz v2, :cond_14

    .line 255
    .line 256
    check-cast v1, LF0/m;

    .line 257
    .line 258
    iget-wide v10, v1, LF0/m;->n:J

    .line 259
    .line 260
    cmp-long v1, v10, v8

    .line 261
    .line 262
    if-nez v1, :cond_c

    .line 263
    .line 264
    :cond_b
    :goto_1
    const/4 v7, 0x0

    .line 265
    goto/16 :goto_6

    .line 266
    .line 267
    :cond_c
    :try_start_0
    invoke-static {v2}, LN0/e;->a(Ljava/lang/String;)LN0/c;

    .line 268
    .line 269
    .line 270
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    goto :goto_2

    .line 272
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 273
    .line 274
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 275
    .line 276
    invoke-static {v1, v2}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const/4 v1, 0x0

    .line 280
    :goto_2
    if-nez v1, :cond_d

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_d
    iget-object v2, v1, LN0/c;->n:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v2, Lm2/b0;

    .line 286
    .line 287
    iget v12, v2, Lm2/b0;->o:I

    .line 288
    .line 289
    if-ge v12, v5, :cond_e

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_e
    sub-int/2addr v12, v4

    .line 293
    move v4, v6

    .line 294
    move-wide v14, v8

    .line 295
    move-wide/from16 v16, v14

    .line 296
    .line 297
    move-wide/from16 v20, v16

    .line 298
    .line 299
    move-wide/from16 v22, v20

    .line 300
    .line 301
    :goto_3
    if-ltz v12, :cond_12

    .line 302
    .line 303
    invoke-virtual {v2, v12}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    check-cast v5, LN0/b;

    .line 308
    .line 309
    iget-object v13, v5, LN0/b;->a:Ljava/lang/String;

    .line 310
    .line 311
    const-string v7, "video/mp4"

    .line 312
    .line 313
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    or-int/2addr v4, v7

    .line 318
    if-nez v12, :cond_f

    .line 319
    .line 320
    iget-wide v6, v5, LN0/b;->c:J

    .line 321
    .line 322
    sub-long/2addr v10, v6

    .line 323
    const-wide/16 v5, 0x0

    .line 324
    .line 325
    :goto_4
    move-wide/from16 v24, v5

    .line 326
    .line 327
    move-wide v5, v10

    .line 328
    move-wide/from16 v10, v24

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_f
    iget-wide v5, v5, LN0/b;->b:J

    .line 332
    .line 333
    sub-long v5, v10, v5

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :goto_5
    if-eqz v4, :cond_10

    .line 337
    .line 338
    cmp-long v7, v10, v5

    .line 339
    .line 340
    if-eqz v7, :cond_10

    .line 341
    .line 342
    sub-long v22, v5, v10

    .line 343
    .line 344
    move-wide/from16 v20, v10

    .line 345
    .line 346
    const/4 v4, 0x0

    .line 347
    :cond_10
    if-nez v12, :cond_11

    .line 348
    .line 349
    move-wide/from16 v16, v5

    .line 350
    .line 351
    move-wide v14, v10

    .line 352
    :cond_11
    add-int/2addr v12, v3

    .line 353
    const/4 v6, 0x0

    .line 354
    goto :goto_3

    .line 355
    :cond_12
    cmp-long v2, v20, v8

    .line 356
    .line 357
    if-eqz v2, :cond_b

    .line 358
    .line 359
    cmp-long v2, v22, v8

    .line 360
    .line 361
    if-eqz v2, :cond_b

    .line 362
    .line 363
    cmp-long v2, v14, v8

    .line 364
    .line 365
    if-eqz v2, :cond_b

    .line 366
    .line 367
    cmp-long v2, v16, v8

    .line 368
    .line 369
    if-nez v2, :cond_13

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :cond_13
    new-instance v7, LU0/a;

    .line 373
    .line 374
    iget-wide v1, v1, LN0/c;->m:J

    .line 375
    .line 376
    move-object v13, v7

    .line 377
    move-wide/from16 v18, v1

    .line 378
    .line 379
    invoke-direct/range {v13 .. v23}, LU0/a;-><init>(JJJJJ)V

    .line 380
    .line 381
    .line 382
    :goto_6
    iput-object v7, v0, LN0/a;->g:LU0/a;

    .line 383
    .line 384
    if-eqz v7, :cond_14

    .line 385
    .line 386
    iget-wide v1, v7, LU0/a;->o:J

    .line 387
    .line 388
    iput-wide v1, v0, LN0/a;->f:J

    .line 389
    .line 390
    :cond_14
    :goto_7
    const/4 v2, 0x0

    .line 391
    goto :goto_8

    .line 392
    :cond_15
    iget v2, v0, LN0/a;->e:I

    .line 393
    .line 394
    check-cast v1, LF0/m;

    .line 395
    .line 396
    invoke-virtual {v1, v2}, LF0/m;->f(I)V

    .line 397
    .line 398
    .line 399
    goto :goto_7

    .line 400
    :goto_8
    iput v2, v0, LN0/a;->c:I

    .line 401
    .line 402
    return v2

    .line 403
    :cond_16
    move v2, v6

    .line 404
    invoke-virtual {v10, v5}, Ld0/p;->E(I)V

    .line 405
    .line 406
    .line 407
    iget-object v3, v10, Ld0/p;->a:[B

    .line 408
    .line 409
    check-cast v1, LF0/m;

    .line 410
    .line 411
    invoke-virtual {v1, v3, v2, v5, v2}, LF0/m;->l([BIIZ)Z

    .line 412
    .line 413
    .line 414
    invoke-virtual {v10}, Ld0/p;->B()I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    sub-int/2addr v1, v5

    .line 419
    iput v1, v0, LN0/a;->e:I

    .line 420
    .line 421
    iput v5, v0, LN0/a;->c:I

    .line 422
    .line 423
    return v2

    .line 424
    :cond_17
    move v2, v6

    .line 425
    invoke-virtual {v10, v5}, Ld0/p;->E(I)V

    .line 426
    .line 427
    .line 428
    iget-object v3, v10, Ld0/p;->a:[B

    .line 429
    .line 430
    check-cast v1, LF0/m;

    .line 431
    .line 432
    invoke-virtual {v1, v3, v2, v5, v2}, LF0/m;->l([BIIZ)Z

    .line 433
    .line 434
    .line 435
    invoke-virtual {v10}, Ld0/p;->B()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    iput v1, v0, LN0/a;->d:I

    .line 440
    .line 441
    const v2, 0xffda

    .line 442
    .line 443
    .line 444
    if-ne v1, v2, :cond_1a

    .line 445
    .line 446
    iget-wide v1, v0, LN0/a;->f:J

    .line 447
    .line 448
    cmp-long v1, v1, v8

    .line 449
    .line 450
    if-eqz v1, :cond_19

    .line 451
    .line 452
    iput v11, v0, LN0/a;->c:I

    .line 453
    .line 454
    :cond_18
    :goto_9
    const/4 v1, 0x0

    .line 455
    goto :goto_a

    .line 456
    :cond_19
    invoke-virtual/range {p0 .. p0}, LN0/a;->a()V

    .line 457
    .line 458
    .line 459
    goto :goto_9

    .line 460
    :cond_1a
    const v2, 0xffd0

    .line 461
    .line 462
    .line 463
    if-lt v1, v2, :cond_1b

    .line 464
    .line 465
    const v2, 0xffd9

    .line 466
    .line 467
    .line 468
    if-le v1, v2, :cond_18

    .line 469
    .line 470
    :cond_1b
    const v2, 0xff01

    .line 471
    .line 472
    .line 473
    if-eq v1, v2, :cond_18

    .line 474
    .line 475
    iput v4, v0, LN0/a;->c:I

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :goto_a
    return v1
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

.method public final e(LF0/r;)Z
    .locals 6

    .line 1
    check-cast p1, LF0/m;

    .line 2
    .line 3
    iget-object v0, p0, LN0/a;->a:Ld0/p;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, Ld0/p;->E(I)V

    .line 7
    .line 8
    .line 9
    iget-object v2, v0, Ld0/p;->a:[B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v4, 0xffd8

    .line 20
    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    invoke-virtual {v0, v1}, Ld0/p;->E(I)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Ld0/p;->a:[B

    .line 29
    .line 30
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, LN0/a;->d:I

    .line 38
    .line 39
    const v4, 0xffe0

    .line 40
    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ld0/p;->E(I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Ld0/p;->a:[B

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    sub-int/2addr v2, v1

    .line 57
    invoke-virtual {p1, v2, v3}, LF0/m;->a(IZ)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ld0/p;->E(I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Ld0/p;->a:[B

    .line 64
    .line 65
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, p0, LN0/a;->d:I

    .line 73
    .line 74
    :cond_1
    iget v2, p0, LN0/a;->d:I

    .line 75
    .line 76
    const v4, 0xffe1

    .line 77
    .line 78
    .line 79
    if-eq v2, v4, :cond_2

    .line 80
    .line 81
    return v3

    .line 82
    :cond_2
    invoke-virtual {p1, v1, v3}, LF0/m;->a(IZ)Z

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    invoke-virtual {v0, v1}, Ld0/p;->E(I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, Ld0/p;->a:[B

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3, v1, v3}, LF0/m;->t([BIIZ)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ld0/p;->x()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    .line 99
    .line 100
    .line 101
    cmp-long p1, v1, v4

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Ld0/p;->B()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    const/4 v3, 0x1

    .line 112
    :cond_3
    return v3
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

.method public final j(LF0/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/a;->b:LF0/s;

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

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/a;->j:LZ0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
