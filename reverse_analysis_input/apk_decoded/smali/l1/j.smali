.class public final Ll1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/h;


# static fields
.field public static final q:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:LF0/K;

.field public final c:LZ1/e;

.field public final d:Ld0/p;

.field public final e:Lh0/K;

.field public final f:[Z

.field public final g:Ll1/i;

.field public h:J

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll1/j;->q:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
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

.method public constructor <init>(LZ1/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/j;->c:LZ1/e;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Z

    .line 8
    .line 9
    iput-object v0, p0, Ll1/j;->f:[Z

    .line 10
    .line 11
    new-instance v0, Ll1/i;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x80

    .line 17
    .line 18
    new-array v1, v1, [B

    .line 19
    .line 20
    iput-object v1, v0, Ll1/i;->d:[B

    .line 21
    .line 22
    iput-object v0, p0, Ll1/j;->g:Ll1/i;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lh0/K;

    .line 27
    .line 28
    const/16 v0, 0xb2

    .line 29
    .line 30
    invoke-direct {p1, v0}, Lh0/K;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Ll1/j;->e:Lh0/K;

    .line 34
    .line 35
    new-instance p1, Ld0/p;

    .line 36
    .line 37
    invoke-direct {p1}, Ld0/p;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ll1/j;->d:Ld0/p;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Ll1/j;->e:Lh0/K;

    .line 45
    .line 46
    iput-object p1, p0, Ll1/j;->d:Ld0/p;

    .line 47
    .line 48
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iput-wide v0, p0, Ll1/j;->l:J

    .line 54
    .line 55
    iput-wide v0, p0, Ll1/j;->n:J

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/j;->f:[Z

    .line 2
    .line 3
    invoke-static {v0}, Le0/n;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/j;->g:Ll1/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Ll1/i;->a:Z

    .line 10
    .line 11
    iput v1, v0, Ll1/i;->b:I

    .line 12
    .line 13
    iput v1, v0, Ll1/i;->c:I

    .line 14
    .line 15
    iget-object v0, p0, Ll1/j;->e:Lh0/K;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lh0/K;->d()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iput-wide v2, p0, Ll1/j;->h:J

    .line 25
    .line 26
    iput-boolean v1, p0, Ll1/j;->i:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, Ll1/j;->l:J

    .line 34
    .line 35
    iput-wide v0, p0, Ll1/j;->n:J

    .line 36
    .line 37
    return-void
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

.method public final b(Ld0/p;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v5, 0x3

    .line 7
    iget-object v6, v0, Ll1/j;->b:LF0/K;

    .line 8
    .line 9
    invoke-static {v6}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget v6, v1, Ld0/p;->b:I

    .line 13
    .line 14
    iget v7, v1, Ld0/p;->c:I

    .line 15
    .line 16
    iget-object v8, v1, Ld0/p;->a:[B

    .line 17
    .line 18
    iget-wide v9, v0, Ll1/j;->h:J

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    int-to-long v11, v11

    .line 25
    add-long/2addr v9, v11

    .line 26
    iput-wide v9, v0, Ll1/j;->h:J

    .line 27
    .line 28
    iget-object v9, v0, Ll1/j;->b:LF0/K;

    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    const/4 v11, 0x0

    .line 35
    invoke-interface {v9, v1, v10, v11}, LF0/K;->a(Ld0/p;II)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v9, v0, Ll1/j;->f:[Z

    .line 39
    .line 40
    invoke-static {v8, v6, v7, v9}, Le0/n;->b([BII[Z)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    iget-object v10, v0, Ll1/j;->g:Ll1/i;

    .line 45
    .line 46
    iget-object v12, v0, Ll1/j;->e:Lh0/K;

    .line 47
    .line 48
    if-ne v9, v7, :cond_2

    .line 49
    .line 50
    iget-boolean v1, v0, Ll1/j;->j:Z

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v10, v8, v6, v7}, Ll1/i;->a([BII)V

    .line 55
    .line 56
    .line 57
    :cond_0
    if-eqz v12, :cond_1

    .line 58
    .line 59
    invoke-virtual {v12, v8, v6, v7}, Lh0/K;->a([BII)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    iget-object v13, v1, Ld0/p;->a:[B

    .line 64
    .line 65
    add-int/lit8 v14, v9, 0x3

    .line 66
    .line 67
    aget-byte v13, v13, v14

    .line 68
    .line 69
    and-int/lit16 v13, v13, 0xff

    .line 70
    .line 71
    sub-int v15, v9, v6

    .line 72
    .line 73
    iget-boolean v4, v0, Ll1/j;->j:Z

    .line 74
    .line 75
    if-nez v4, :cond_d

    .line 76
    .line 77
    if-lez v15, :cond_3

    .line 78
    .line 79
    invoke-virtual {v10, v8, v6, v9}, Ll1/i;->a([BII)V

    .line 80
    .line 81
    .line 82
    :cond_3
    if-gez v15, :cond_4

    .line 83
    .line 84
    neg-int v4, v15

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    move v4, v11

    .line 87
    :goto_1
    iget-boolean v5, v10, Ll1/i;->a:Z

    .line 88
    .line 89
    if-eqz v5, :cond_b

    .line 90
    .line 91
    iget v5, v10, Ll1/i;->b:I

    .line 92
    .line 93
    sub-int/2addr v5, v4

    .line 94
    iput v5, v10, Ll1/i;->b:I

    .line 95
    .line 96
    iget v4, v10, Ll1/i;->c:I

    .line 97
    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    const/16 v4, 0xb5

    .line 101
    .line 102
    if-ne v13, v4, :cond_5

    .line 103
    .line 104
    iput v5, v10, Ll1/i;->c:I

    .line 105
    .line 106
    move/from16 v17, v7

    .line 107
    .line 108
    move/from16 v18, v14

    .line 109
    .line 110
    move v7, v6

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_5
    iput-boolean v11, v10, Ll1/i;->a:Z

    .line 114
    .line 115
    iget-object v4, v0, Ll1/j;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v5, v10, Ll1/i;->d:[B

    .line 121
    .line 122
    iget v11, v10, Ll1/i;->b:I

    .line 123
    .line 124
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    aget-byte v11, v5, v3

    .line 129
    .line 130
    and-int/lit16 v11, v11, 0xff

    .line 131
    .line 132
    const/16 v16, 0x5

    .line 133
    .line 134
    aget-byte v2, v5, v16

    .line 135
    .line 136
    and-int/lit16 v3, v2, 0xff

    .line 137
    .line 138
    const/16 v17, 0x6

    .line 139
    .line 140
    move/from16 v18, v14

    .line 141
    .line 142
    aget-byte v14, v5, v17

    .line 143
    .line 144
    and-int/lit16 v14, v14, 0xff

    .line 145
    .line 146
    move/from16 v17, v7

    .line 147
    .line 148
    const/4 v7, 0x4

    .line 149
    shl-int/2addr v11, v7

    .line 150
    shr-int/2addr v3, v7

    .line 151
    or-int/2addr v3, v11

    .line 152
    and-int/lit8 v2, v2, 0xf

    .line 153
    .line 154
    const/16 v11, 0x8

    .line 155
    .line 156
    shl-int/2addr v2, v11

    .line 157
    or-int/2addr v2, v14

    .line 158
    const/4 v14, 0x7

    .line 159
    aget-byte v11, v5, v14

    .line 160
    .line 161
    and-int/lit16 v11, v11, 0xf0

    .line 162
    .line 163
    shr-int/2addr v11, v7

    .line 164
    const/4 v14, 0x2

    .line 165
    if-eq v11, v14, :cond_8

    .line 166
    .line 167
    const/4 v14, 0x3

    .line 168
    if-eq v11, v14, :cond_7

    .line 169
    .line 170
    if-eq v11, v7, :cond_6

    .line 171
    .line 172
    const/high16 v7, 0x3f800000    # 1.0f

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    mul-int/lit8 v7, v2, 0x79

    .line 176
    .line 177
    int-to-float v7, v7

    .line 178
    mul-int/lit8 v11, v3, 0x64

    .line 179
    .line 180
    :goto_2
    int-to-float v11, v11

    .line 181
    div-float/2addr v7, v11

    .line 182
    goto :goto_3

    .line 183
    :cond_7
    mul-int/lit8 v7, v2, 0x10

    .line 184
    .line 185
    int-to-float v7, v7

    .line 186
    mul-int/lit8 v11, v3, 0x9

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    mul-int/lit8 v11, v2, 0x4

    .line 190
    .line 191
    int-to-float v11, v11

    .line 192
    const/4 v14, 0x3

    .line 193
    mul-int/lit8 v7, v3, 0x3

    .line 194
    .line 195
    int-to-float v7, v7

    .line 196
    div-float v7, v11, v7

    .line 197
    .line 198
    :goto_3
    new-instance v11, La0/o;

    .line 199
    .line 200
    invoke-direct {v11}, La0/o;-><init>()V

    .line 201
    .line 202
    .line 203
    iput-object v4, v11, La0/o;->a:Ljava/lang/String;

    .line 204
    .line 205
    const-string v4, "video/mpeg2"

    .line 206
    .line 207
    invoke-static {v4}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iput-object v4, v11, La0/o;->m:Ljava/lang/String;

    .line 212
    .line 213
    iput v3, v11, La0/o;->t:I

    .line 214
    .line 215
    iput v2, v11, La0/o;->u:I

    .line 216
    .line 217
    iput v7, v11, La0/o;->x:F

    .line 218
    .line 219
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    iput-object v2, v11, La0/o;->p:Ljava/util/List;

    .line 224
    .line 225
    new-instance v2, La0/p;

    .line 226
    .line 227
    invoke-direct {v2, v11}, La0/p;-><init>(La0/o;)V

    .line 228
    .line 229
    .line 230
    const/4 v3, 0x7

    .line 231
    aget-byte v3, v5, v3

    .line 232
    .line 233
    and-int/lit8 v3, v3, 0xf

    .line 234
    .line 235
    const/4 v4, 0x1

    .line 236
    sub-int/2addr v3, v4

    .line 237
    if-ltz v3, :cond_a

    .line 238
    .line 239
    const/16 v4, 0x8

    .line 240
    .line 241
    if-ge v3, v4, :cond_a

    .line 242
    .line 243
    sget-object v4, Ll1/j;->q:[D

    .line 244
    .line 245
    aget-wide v3, v4, v3

    .line 246
    .line 247
    iget v7, v10, Ll1/i;->c:I

    .line 248
    .line 249
    add-int/lit8 v7, v7, 0x9

    .line 250
    .line 251
    aget-byte v5, v5, v7

    .line 252
    .line 253
    and-int/lit8 v7, v5, 0x60

    .line 254
    .line 255
    shr-int/lit8 v7, v7, 0x5

    .line 256
    .line 257
    and-int/lit8 v5, v5, 0x1f

    .line 258
    .line 259
    if-eq v7, v5, :cond_9

    .line 260
    .line 261
    int-to-double v10, v7

    .line 262
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 263
    .line 264
    add-double v10, v10, v19

    .line 265
    .line 266
    const/4 v7, 0x1

    .line 267
    add-int/2addr v5, v7

    .line 268
    move v7, v6

    .line 269
    int-to-double v5, v5

    .line 270
    div-double/2addr v10, v5

    .line 271
    mul-double/2addr v3, v10

    .line 272
    goto :goto_4

    .line 273
    :cond_9
    move v7, v6

    .line 274
    :goto_4
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    div-double/2addr v5, v3

    .line 280
    double-to-long v3, v5

    .line 281
    goto :goto_5

    .line 282
    :cond_a
    move v7, v6

    .line 283
    const-wide/16 v3, 0x0

    .line 284
    .line 285
    :goto_5
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    iget-object v3, v0, Ll1/j;->b:LF0/K;

    .line 294
    .line 295
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v4, La0/p;

    .line 298
    .line 299
    invoke-interface {v3, v4}, LF0/K;->c(La0/p;)V

    .line 300
    .line 301
    .line 302
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v2, Ljava/lang/Long;

    .line 305
    .line 306
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 307
    .line 308
    .line 309
    move-result-wide v2

    .line 310
    iput-wide v2, v0, Ll1/j;->k:J

    .line 311
    .line 312
    const/4 v2, 0x1

    .line 313
    iput-boolean v2, v0, Ll1/j;->j:Z

    .line 314
    .line 315
    const/4 v4, 0x3

    .line 316
    goto :goto_7

    .line 317
    :cond_b
    move/from16 v17, v7

    .line 318
    .line 319
    move/from16 v18, v14

    .line 320
    .line 321
    const/4 v2, 0x1

    .line 322
    const/16 v3, 0xb3

    .line 323
    .line 324
    move v7, v6

    .line 325
    if-ne v13, v3, :cond_c

    .line 326
    .line 327
    iput-boolean v2, v10, Ll1/i;->a:Z

    .line 328
    .line 329
    :cond_c
    :goto_6
    sget-object v2, Ll1/i;->e:[B

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    const/4 v4, 0x3

    .line 333
    invoke-virtual {v10, v2, v3, v4}, Ll1/i;->a([BII)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_d
    move/from16 v17, v7

    .line 338
    .line 339
    move/from16 v18, v14

    .line 340
    .line 341
    const/4 v4, 0x3

    .line 342
    move v7, v6

    .line 343
    :goto_7
    if-eqz v12, :cond_10

    .line 344
    .line 345
    if-lez v15, :cond_e

    .line 346
    .line 347
    invoke-virtual {v12, v8, v7, v9}, Lh0/K;->a([BII)V

    .line 348
    .line 349
    .line 350
    const/4 v3, 0x0

    .line 351
    goto :goto_8

    .line 352
    :cond_e
    neg-int v3, v15

    .line 353
    :goto_8
    invoke-virtual {v12, v3}, Lh0/K;->b(I)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_f

    .line 358
    .line 359
    iget-object v2, v12, Lh0/K;->e:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v2, [B

    .line 362
    .line 363
    iget v3, v12, Lh0/K;->d:I

    .line 364
    .line 365
    invoke-static {v3, v2}, Le0/n;->k(I[B)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    sget v3, Ld0/w;->a:I

    .line 370
    .line 371
    iget-object v3, v12, Lh0/K;->e:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v3, [B

    .line 374
    .line 375
    iget-object v5, v0, Ll1/j;->d:Ld0/p;

    .line 376
    .line 377
    invoke-virtual {v5, v2, v3}, Ld0/p;->F(I[B)V

    .line 378
    .line 379
    .line 380
    iget-wide v2, v0, Ll1/j;->n:J

    .line 381
    .line 382
    iget-object v6, v0, Ll1/j;->c:LZ1/e;

    .line 383
    .line 384
    invoke-virtual {v6, v2, v3, v5}, LZ1/e;->f(JLd0/p;)V

    .line 385
    .line 386
    .line 387
    :cond_f
    const/16 v2, 0xb2

    .line 388
    .line 389
    if-ne v13, v2, :cond_10

    .line 390
    .line 391
    iget-object v2, v1, Ld0/p;->a:[B

    .line 392
    .line 393
    const/4 v3, 0x2

    .line 394
    add-int/lit8 v5, v9, 0x2

    .line 395
    .line 396
    aget-byte v2, v2, v5

    .line 397
    .line 398
    const/4 v5, 0x1

    .line 399
    if-ne v2, v5, :cond_11

    .line 400
    .line 401
    invoke-virtual {v12, v13}, Lh0/K;->e(I)V

    .line 402
    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_10
    const/4 v3, 0x2

    .line 406
    const/4 v5, 0x1

    .line 407
    :cond_11
    :goto_9
    if-eqz v13, :cond_14

    .line 408
    .line 409
    const/16 v2, 0xb3

    .line 410
    .line 411
    if-ne v13, v2, :cond_12

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_12
    const/16 v2, 0xb8

    .line 415
    .line 416
    if-ne v13, v2, :cond_13

    .line 417
    .line 418
    iput-boolean v5, v0, Ll1/j;->o:Z

    .line 419
    .line 420
    :cond_13
    const/4 v2, 0x0

    .line 421
    goto/16 :goto_f

    .line 422
    .line 423
    :cond_14
    :goto_a
    sub-int v7, v17, v9

    .line 424
    .line 425
    iget-boolean v2, v0, Ll1/j;->p:Z

    .line 426
    .line 427
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    if-eqz v2, :cond_15

    .line 433
    .line 434
    iget-boolean v2, v0, Ll1/j;->j:Z

    .line 435
    .line 436
    if-eqz v2, :cond_15

    .line 437
    .line 438
    iget-wide v9, v0, Ll1/j;->n:J

    .line 439
    .line 440
    cmp-long v2, v9, v5

    .line 441
    .line 442
    if-eqz v2, :cond_15

    .line 443
    .line 444
    iget-boolean v2, v0, Ll1/j;->o:Z

    .line 445
    .line 446
    iget-wide v11, v0, Ll1/j;->h:J

    .line 447
    .line 448
    iget-wide v14, v0, Ll1/j;->m:J

    .line 449
    .line 450
    sub-long/2addr v11, v14

    .line 451
    long-to-int v11, v11

    .line 452
    sub-int v23, v11, v7

    .line 453
    .line 454
    iget-object v11, v0, Ll1/j;->b:LF0/K;

    .line 455
    .line 456
    const/16 v25, 0x0

    .line 457
    .line 458
    move-object/from16 v19, v11

    .line 459
    .line 460
    move-wide/from16 v20, v9

    .line 461
    .line 462
    move/from16 v22, v2

    .line 463
    .line 464
    move/from16 v24, v7

    .line 465
    .line 466
    invoke-interface/range {v19 .. v25}, LF0/K;->b(JIIILF0/J;)V

    .line 467
    .line 468
    .line 469
    :cond_15
    iget-boolean v2, v0, Ll1/j;->i:Z

    .line 470
    .line 471
    if-eqz v2, :cond_17

    .line 472
    .line 473
    iget-boolean v2, v0, Ll1/j;->p:Z

    .line 474
    .line 475
    if-eqz v2, :cond_16

    .line 476
    .line 477
    goto :goto_b

    .line 478
    :cond_16
    const/4 v2, 0x0

    .line 479
    const/4 v5, 0x1

    .line 480
    goto :goto_d

    .line 481
    :cond_17
    :goto_b
    iget-wide v9, v0, Ll1/j;->h:J

    .line 482
    .line 483
    int-to-long v11, v7

    .line 484
    sub-long/2addr v9, v11

    .line 485
    iput-wide v9, v0, Ll1/j;->m:J

    .line 486
    .line 487
    iget-wide v9, v0, Ll1/j;->l:J

    .line 488
    .line 489
    cmp-long v2, v9, v5

    .line 490
    .line 491
    if-eqz v2, :cond_18

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_18
    iget-wide v9, v0, Ll1/j;->n:J

    .line 495
    .line 496
    cmp-long v2, v9, v5

    .line 497
    .line 498
    if-eqz v2, :cond_19

    .line 499
    .line 500
    iget-wide v11, v0, Ll1/j;->k:J

    .line 501
    .line 502
    add-long/2addr v9, v11

    .line 503
    goto :goto_c

    .line 504
    :cond_19
    move-wide v9, v5

    .line 505
    :goto_c
    iput-wide v9, v0, Ll1/j;->n:J

    .line 506
    .line 507
    const/4 v2, 0x0

    .line 508
    iput-boolean v2, v0, Ll1/j;->o:Z

    .line 509
    .line 510
    iput-wide v5, v0, Ll1/j;->l:J

    .line 511
    .line 512
    const/4 v5, 0x1

    .line 513
    iput-boolean v5, v0, Ll1/j;->i:Z

    .line 514
    .line 515
    :goto_d
    if-nez v13, :cond_1a

    .line 516
    .line 517
    move v6, v5

    .line 518
    goto :goto_e

    .line 519
    :cond_1a
    move v6, v2

    .line 520
    :goto_e
    iput-boolean v6, v0, Ll1/j;->p:Z

    .line 521
    .line 522
    :goto_f
    move v11, v2

    .line 523
    move v5, v4

    .line 524
    move/from16 v7, v17

    .line 525
    .line 526
    move/from16 v6, v18

    .line 527
    .line 528
    const/4 v3, 0x4

    .line 529
    goto/16 :goto_0
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
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
.end method

.method public final c(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/j;->b:LF0/K;

    .line 2
    .line 3
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v4, p0, Ll1/j;->o:Z

    .line 9
    .line 10
    iget-wide v0, p0, Ll1/j;->h:J

    .line 11
    .line 12
    iget-wide v2, p0, Ll1/j;->m:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    long-to-int v5, v0

    .line 16
    iget-object v1, p0, Ll1/j;->b:LF0/K;

    .line 17
    .line 18
    iget-wide v2, p0, Ll1/j;->n:J

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-interface/range {v1 .. v7}, LF0/K;->b(JIIILF0/J;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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

.method public final d(LF0/s;Ll1/E;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ll1/E;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ll1/E;->c()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Ll1/E;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Ll1/j;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ll1/E;->c()V

    .line 14
    .line 15
    .line 16
    iget v0, p2, Ll1/E;->c:I

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-interface {p1, v0, v1}, LF0/s;->k(II)LF0/K;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ll1/j;->b:LF0/K;

    .line 24
    .line 25
    iget-object v0, p0, Ll1/j;->c:LZ1/e;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, LZ1/e;->n(LF0/s;Ll1/E;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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

.method public final e(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/j;->l:J

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
