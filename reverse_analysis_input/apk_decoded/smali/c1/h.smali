.class public final Lc1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:Lc1/l;

.field public final b:La0/p;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ld0/p;

.field public e:[B

.field public f:LF0/K;

.field public g:I

.field public h:I

.field public i:[J

.field public j:J


# direct methods
.method public constructor <init>(Lc1/l;La0/p;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1/h;->a:Lc1/l;

    .line 5
    .line 6
    sget-object v0, Ld0/w;->f:[B

    .line 7
    .line 8
    iput-object v0, p0, Lc1/h;->e:[B

    .line 9
    .line 10
    new-instance v0, Ld0/p;

    .line 11
    .line 12
    invoke-direct {v0}, Ld0/p;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lc1/h;->d:Ld0/p;

    .line 16
    .line 17
    invoke-virtual {p2}, La0/p;->a()La0/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "application/x-media3-cues"

    .line 22
    .line 23
    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, La0/o;->m:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p2, p2, La0/p;->n:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, v0, La0/o;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1}, Lc1/l;->o()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, v0, La0/o;->H:I

    .line 38
    .line 39
    new-instance p1, La0/p;

    .line 40
    .line 41
    invoke-direct {p1, v0}, La0/p;-><init>(La0/o;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lc1/h;->b:La0/p;

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lc1/h;->c:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput p1, p0, Lc1/h;->h:I

    .line 55
    .line 56
    sget-object p1, Ld0/w;->g:[J

    .line 57
    .line 58
    iput-object p1, p0, Lc1/h;->i:[J

    .line 59
    .line 60
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iput-wide p1, p0, Lc1/h;->j:J

    .line 66
    .line 67
    return-void
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


# virtual methods
.method public final a(Lc1/g;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc1/h;->f:LF0/K;

    .line 2
    .line 3
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lc1/g;->m:[B

    .line 7
    .line 8
    array-length v5, v0

    .line 9
    iget-object v1, p0, Lc1/h;->d:Ld0/p;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    invoke-virtual {v1, v2, v0}, Ld0/p;->F(I[B)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lc1/h;->f:LF0/K;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v1, v5, v2}, LF0/K;->a(Ld0/p;II)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lc1/h;->f:LF0/K;

    .line 25
    .line 26
    iget-wide v2, p1, Lc1/g;->l:J

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    invoke-interface/range {v1 .. v7}, LF0/K;->b(JIIILF0/J;)V

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
.end method

.method public final b(JJ)V
    .locals 1

    .line 1
    iget p1, p0, Lc1/h;->h:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    move p1, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-static {p1}, Ld0/m;->h(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p3, p0, Lc1/h;->j:J

    .line 16
    .line 17
    iget p1, p0, Lc1/h;->h:I

    .line 18
    .line 19
    const/4 p3, 0x2

    .line 20
    if-ne p1, p3, :cond_1

    .line 21
    .line 22
    iput p2, p0, Lc1/h;->h:I

    .line 23
    .line 24
    :cond_1
    iget p1, p0, Lc1/h;->h:I

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    if-ne p1, p2, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iput p1, p0, Lc1/h;->h:I

    .line 31
    .line 32
    :cond_2
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

.method public final d(LF0/r;LF0/u;)I
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc1/h;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    if-eq v0, v4, :cond_0

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 16
    .line 17
    .line 18
    iget v0, v1, Lc1/h;->h:I

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const/16 v5, 0x400

    .line 22
    .line 23
    const-wide/16 v6, -0x1

    .line 24
    .line 25
    if-ne v0, v3, :cond_3

    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, LF0/m;

    .line 30
    .line 31
    iget-wide v8, v0, LF0/m;->n:J

    .line 32
    .line 33
    cmp-long v0, v8, v6

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, LF0/m;

    .line 40
    .line 41
    iget-wide v8, v0, LF0/m;->n:J

    .line 42
    .line 43
    invoke-static {v8, v9}, LQ1/C;->g(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v0, v5

    .line 49
    :goto_1
    iget-object v8, v1, Lc1/h;->e:[B

    .line 50
    .line 51
    array-length v8, v8

    .line 52
    if-le v0, v8, :cond_2

    .line 53
    .line 54
    new-array v0, v0, [B

    .line 55
    .line 56
    iput-object v0, v1, Lc1/h;->e:[B

    .line 57
    .line 58
    :cond_2
    iput v2, v1, Lc1/h;->g:I

    .line 59
    .line 60
    iput v4, v1, Lc1/h;->h:I

    .line 61
    .line 62
    :cond_3
    iget v0, v1, Lc1/h;->h:I

    .line 63
    .line 64
    iget-object v8, v1, Lc1/h;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    const/4 v12, -0x1

    .line 73
    if-ne v0, v4, :cond_a

    .line 74
    .line 75
    iget-object v0, v1, Lc1/h;->e:[B

    .line 76
    .line 77
    array-length v4, v0

    .line 78
    iget v13, v1, Lc1/h;->g:I

    .line 79
    .line 80
    if-ne v4, v13, :cond_4

    .line 81
    .line 82
    array-length v4, v0

    .line 83
    add-int/2addr v4, v5

    .line 84
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, v1, Lc1/h;->e:[B

    .line 89
    .line 90
    :cond_4
    iget-object v0, v1, Lc1/h;->e:[B

    .line 91
    .line 92
    iget v4, v1, Lc1/h;->g:I

    .line 93
    .line 94
    array-length v13, v0

    .line 95
    sub-int/2addr v13, v4

    .line 96
    move-object/from16 v14, p1

    .line 97
    .line 98
    check-cast v14, LF0/m;

    .line 99
    .line 100
    invoke-virtual {v14, v0, v4, v13}, LF0/m;->read([BII)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eq v0, v12, :cond_5

    .line 105
    .line 106
    iget v4, v1, Lc1/h;->g:I

    .line 107
    .line 108
    add-int/2addr v4, v0

    .line 109
    iput v4, v1, Lc1/h;->g:I

    .line 110
    .line 111
    :cond_5
    iget-wide v13, v14, LF0/m;->n:J

    .line 112
    .line 113
    cmp-long v4, v13, v6

    .line 114
    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    iget v4, v1, Lc1/h;->g:I

    .line 118
    .line 119
    int-to-long v5, v4

    .line 120
    cmp-long v4, v5, v13

    .line 121
    .line 122
    if-eqz v4, :cond_7

    .line 123
    .line 124
    :cond_6
    if-ne v0, v12, :cond_a

    .line 125
    .line 126
    :cond_7
    :try_start_0
    iget-wide v4, v1, Lc1/h;->j:J

    .line 127
    .line 128
    cmp-long v0, v4, v9

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    new-instance v0, Lc1/k;

    .line 133
    .line 134
    invoke-direct {v0, v4, v5, v3}, Lc1/k;-><init>(JZ)V

    .line 135
    .line 136
    .line 137
    :goto_2
    move-object/from16 v19, v0

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    sget-object v0, Lc1/k;->c:Lc1/k;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :goto_3
    iget-object v0, v1, Lc1/h;->a:Lc1/l;

    .line 144
    .line 145
    iget-object v4, v1, Lc1/h;->e:[B

    .line 146
    .line 147
    iget v5, v1, Lc1/h;->g:I

    .line 148
    .line 149
    new-instance v6, LI2/g;

    .line 150
    .line 151
    const/4 v7, 0x3

    .line 152
    invoke-direct {v6, v1, v7}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 153
    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    move-object v15, v0

    .line 158
    move-object/from16 v16, v4

    .line 159
    .line 160
    move/from16 v18, v5

    .line 161
    .line 162
    move-object/from16 v20, v6

    .line 163
    .line 164
    invoke-interface/range {v15 .. v20}, Lc1/l;->x([BIILc1/k;Ld0/d;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v8}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    new-array v0, v0, [J

    .line 175
    .line 176
    iput-object v0, v1, Lc1/h;->i:[J

    .line 177
    .line 178
    move v0, v2

    .line 179
    :goto_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-ge v0, v4, :cond_9

    .line 184
    .line 185
    iget-object v4, v1, Lc1/h;->i:[J

    .line 186
    .line 187
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    check-cast v5, Lc1/g;

    .line 192
    .line 193
    iget-wide v5, v5, Lc1/g;->l:J

    .line 194
    .line 195
    aput-wide v5, v4, v0

    .line 196
    .line 197
    add-int/lit8 v0, v0, 0x1

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :catch_0
    move-exception v0

    .line 201
    goto :goto_5

    .line 202
    :cond_9
    sget-object v0, Ld0/w;->f:[B

    .line 203
    .line 204
    iput-object v0, v1, Lc1/h;->e:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    .line 206
    iput v11, v1, Lc1/h;->h:I

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :goto_5
    const-string v2, "SubtitleParser failed."

    .line 210
    .line 211
    invoke-static {v0, v2}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    throw v0

    .line 216
    :cond_a
    :goto_6
    iget v0, v1, Lc1/h;->h:I

    .line 217
    .line 218
    const/4 v4, 0x3

    .line 219
    if-ne v0, v4, :cond_e

    .line 220
    .line 221
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, LF0/m;

    .line 224
    .line 225
    iget-wide v4, v0, LF0/m;->n:J

    .line 226
    .line 227
    const-wide/16 v6, -0x1

    .line 228
    .line 229
    cmp-long v0, v4, v6

    .line 230
    .line 231
    if-eqz v0, :cond_b

    .line 232
    .line 233
    move-object/from16 v0, p1

    .line 234
    .line 235
    check-cast v0, LF0/m;

    .line 236
    .line 237
    iget-wide v4, v0, LF0/m;->n:J

    .line 238
    .line 239
    invoke-static {v4, v5}, LQ1/C;->g(J)I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    goto :goto_7

    .line 244
    :cond_b
    const/16 v5, 0x400

    .line 245
    .line 246
    :goto_7
    move-object/from16 v0, p1

    .line 247
    .line 248
    check-cast v0, LF0/m;

    .line 249
    .line 250
    invoke-virtual {v0, v5}, LF0/m;->j(I)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-ne v0, v12, :cond_e

    .line 255
    .line 256
    iget-wide v4, v1, Lc1/h;->j:J

    .line 257
    .line 258
    cmp-long v0, v4, v9

    .line 259
    .line 260
    if-nez v0, :cond_c

    .line 261
    .line 262
    move v0, v2

    .line 263
    goto :goto_8

    .line 264
    :cond_c
    iget-object v0, v1, Lc1/h;->i:[J

    .line 265
    .line 266
    invoke-static {v0, v4, v5, v3}, Ld0/w;->e([JJZ)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    :goto_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-ge v0, v3, :cond_d

    .line 275
    .line 276
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Lc1/g;

    .line 281
    .line 282
    invoke-virtual {v1, v3}, Lc1/h;->a(Lc1/g;)V

    .line 283
    .line 284
    .line 285
    add-int/lit8 v0, v0, 0x1

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_d
    iput v11, v1, Lc1/h;->h:I

    .line 289
    .line 290
    :cond_e
    iget v0, v1, Lc1/h;->h:I

    .line 291
    .line 292
    if-ne v0, v11, :cond_f

    .line 293
    .line 294
    return v12

    .line 295
    :cond_f
    return v2
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

.method public final e(LF0/r;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

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

.method public final j(LF0/s;)V
    .locals 7

    .line 1
    iget v0, p0, Lc1/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v1, v0}, LF0/s;->k(II)LF0/K;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lc1/h;->f:LF0/K;

    .line 19
    .line 20
    iget-object v3, p0, Lc1/h;->b:La0/p;

    .line 21
    .line 22
    invoke-interface {v0, v3}, LF0/K;->c(La0/p;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, LF0/s;->j()V

    .line 26
    .line 27
    .line 28
    new-instance v0, LF0/B;

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    new-array v5, v2, [J

    .line 33
    .line 34
    aput-wide v3, v5, v1

    .line 35
    .line 36
    new-array v6, v2, [J

    .line 37
    .line 38
    aput-wide v3, v6, v1

    .line 39
    .line 40
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v3, v4, v5, v6}, LF0/B;-><init>(J[J[J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, LF0/s;->d(LF0/E;)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, Lc1/h;->h:I

    .line 52
    .line 53
    return-void
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
    .locals 2

    .line 1
    iget v0, p0, Lc1/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lc1/h;->a:Lc1/l;

    .line 8
    .line 9
    invoke-interface {v0}, Lc1/l;->reset()V

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lc1/h;->h:I

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
.end method
