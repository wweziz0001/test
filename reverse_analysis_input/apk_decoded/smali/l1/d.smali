.class public final Ll1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:I

.field public final b:Ll1/e;

.field public final c:Ld0/p;

.field public final d:Ld0/p;

.field public final e:LF0/M;

.field public f:LF0/s;

.field public g:J

.field public h:J

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z


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

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x2

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    :cond_0
    iput p1, p0, Ll1/d;->a:I

    .line 11
    .line 12
    new-instance p1, Ll1/e;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {p1, v1, v0, v2}, Ll1/e;-><init>(ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ll1/d;->b:Ll1/e;

    .line 21
    .line 22
    new-instance p1, Ld0/p;

    .line 23
    .line 24
    const/16 v0, 0x800

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ld0/p;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ll1/d;->c:Ld0/p;

    .line 30
    .line 31
    const/4 p1, -0x1

    .line 32
    iput p1, p0, Ll1/d;->i:I

    .line 33
    .line 34
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    iput-wide v0, p0, Ll1/d;->h:J

    .line 37
    .line 38
    new-instance p1, Ld0/p;

    .line 39
    .line 40
    const/16 v0, 0xa

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ld0/p;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ll1/d;->d:Ld0/p;

    .line 46
    .line 47
    new-instance v0, LF0/M;

    .line 48
    .line 49
    iget-object p1, p1, Ld0/p;->a:[B

    .line 50
    .line 51
    array-length v1, p1

    .line 52
    invoke-direct {v0, v1, p1}, LF0/M;-><init>(I[B)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Ll1/d;->e:LF0/M;

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final a(LF0/m;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Ll1/d;->d:Ld0/p;

    .line 4
    .line 5
    iget-object v3, v2, Ld0/p;->a:[B

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    invoke-virtual {p1, v3, v0, v4, v0}, LF0/m;->t([BIIZ)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ld0/p;->H(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ld0/p;->y()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x494433

    .line 20
    .line 21
    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    iput v0, p1, LF0/m;->q:I

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, LF0/m;->a(IZ)Z

    .line 27
    .line 28
    .line 29
    iget-wide v2, p0, Ll1/d;->h:J

    .line 30
    .line 31
    const-wide/16 v4, -0x1

    .line 32
    .line 33
    cmp-long p1, v2, v4

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    int-to-long v2, v1

    .line 38
    iput-wide v2, p0, Ll1/d;->h:J

    .line 39
    .line 40
    :cond_0
    return v1

    .line 41
    :cond_1
    const/4 v3, 0x3

    .line 42
    invoke-virtual {v2, v3}, Ld0/p;->I(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ld0/p;->u()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    add-int/lit8 v3, v2, 0xa

    .line 50
    .line 51
    add-int/2addr v1, v3

    .line 52
    invoke-virtual {p1, v2, v0}, LF0/m;->a(IZ)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final b(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ll1/d;->k:Z

    .line 3
    .line 4
    iget-object p1, p0, Ll1/d;->b:Ll1/e;

    .line 5
    .line 6
    invoke-virtual {p1}, Ll1/e;->a()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Ll1/d;->g:J

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ll1/d;->f:LF0/s;

    .line 4
    .line 5
    invoke-static {v1}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LF0/m;

    .line 11
    .line 12
    iget-wide v3, v1, LF0/m;->n:J

    .line 13
    .line 14
    iget v1, v0, Ll1/d;->a:I

    .line 15
    .line 16
    and-int/lit8 v2, v1, 0x2

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x1

    .line 20
    const/4 v12, -0x1

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    and-int/lit8 v5, v1, 0x1

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const-wide/16 v5, -0x1

    .line 28
    .line 29
    cmp-long v5, v3, v5

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    move v5, v12

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_1
    :goto_1
    iget-object v5, v0, Ll1/d;->e:LF0/M;

    .line 38
    .line 39
    iget-object v6, v0, Ll1/d;->d:Ld0/p;

    .line 40
    .line 41
    iget-boolean v7, v0, Ll1/d;->j:Z

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iput v12, v0, Ll1/d;->i:I

    .line 47
    .line 48
    move-object/from16 v7, p1

    .line 49
    .line 50
    check-cast v7, LF0/m;

    .line 51
    .line 52
    iput v10, v7, LF0/m;->q:I

    .line 53
    .line 54
    iget-wide v8, v7, LF0/m;->o:J

    .line 55
    .line 56
    const-wide/16 v13, 0x0

    .line 57
    .line 58
    cmp-long v8, v8, v13

    .line 59
    .line 60
    if-nez v8, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, v7}, Ll1/d;->a(LF0/m;)I

    .line 63
    .line 64
    .line 65
    :cond_3
    move v8, v10

    .line 66
    :goto_2
    :try_start_0
    iget-object v9, v6, Ld0/p;->a:[B

    .line 67
    .line 68
    move-object/from16 v15, p1

    .line 69
    .line 70
    check-cast v15, LF0/m;

    .line 71
    .line 72
    const/4 v12, 0x2

    .line 73
    invoke-virtual {v15, v9, v10, v12, v11}, LF0/m;->t([BIIZ)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_a

    .line 78
    .line 79
    invoke-virtual {v6, v10}, Ld0/p;->H(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const v12, 0xfff6

    .line 87
    .line 88
    .line 89
    and-int/2addr v9, v12

    .line 90
    const v12, 0xfff0

    .line 91
    .line 92
    .line 93
    if-ne v9, v12, :cond_4

    .line 94
    .line 95
    move v9, v11

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v9, v10

    .line 98
    :goto_3
    if-nez v9, :cond_5

    .line 99
    .line 100
    move v8, v10

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    iget-object v9, v6, Ld0/p;->a:[B

    .line 103
    .line 104
    const/4 v12, 0x4

    .line 105
    invoke-virtual {v15, v9, v10, v12, v11}, LF0/m;->t([BIIZ)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    const/16 v9, 0xe

    .line 113
    .line 114
    invoke-virtual {v5, v9}, LF0/M;->r(I)V

    .line 115
    .line 116
    .line 117
    const/16 v9, 0xd

    .line 118
    .line 119
    invoke-virtual {v5, v9}, LF0/M;->i(I)I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    const/4 v12, 0x6

    .line 124
    if-le v9, v12, :cond_9

    .line 125
    .line 126
    int-to-long v10, v9

    .line 127
    add-long/2addr v13, v10

    .line 128
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    const/16 v10, 0x3e8

    .line 131
    .line 132
    if-ne v8, v10, :cond_7

    .line 133
    .line 134
    const/4 v10, 0x1

    .line 135
    goto :goto_4

    .line 136
    :cond_7
    add-int/lit8 v9, v9, -0x6

    .line 137
    .line 138
    const/4 v10, 0x1

    .line 139
    invoke-virtual {v15, v9, v10}, LF0/m;->a(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-nez v9, :cond_8

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    move v11, v10

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v12, -0x1

    .line 149
    goto :goto_2

    .line 150
    :cond_9
    move v10, v11

    .line 151
    iput-boolean v10, v0, Ll1/d;->j:Z

    .line 152
    .line 153
    const-string v5, "Malformed ADTS stream"

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    invoke-static {v6, v5}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    throw v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    :catch_0
    :cond_a
    :goto_4
    const/4 v5, 0x0

    .line 162
    iput v5, v7, LF0/m;->q:I

    .line 163
    .line 164
    if-lez v8, :cond_b

    .line 165
    .line 166
    int-to-long v5, v8

    .line 167
    div-long/2addr v13, v5

    .line 168
    long-to-int v5, v13

    .line 169
    iput v5, v0, Ll1/d;->i:I

    .line 170
    .line 171
    const/4 v5, -0x1

    .line 172
    :goto_5
    const/4 v6, 0x1

    .line 173
    goto :goto_6

    .line 174
    :cond_b
    const/4 v5, -0x1

    .line 175
    iput v5, v0, Ll1/d;->i:I

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :goto_6
    iput-boolean v6, v0, Ll1/d;->j:Z

    .line 179
    .line 180
    :goto_7
    iget-object v10, v0, Ll1/d;->c:Ld0/p;

    .line 181
    .line 182
    iget-object v6, v10, Ld0/p;->a:[B

    .line 183
    .line 184
    const/16 v7, 0x800

    .line 185
    .line 186
    move-object/from16 v8, p1

    .line 187
    .line 188
    check-cast v8, LF0/m;

    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    invoke-virtual {v8, v6, v9, v7}, LF0/m;->read([BII)I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-ne v11, v5, :cond_c

    .line 196
    .line 197
    const/4 v13, 0x1

    .line 198
    goto :goto_8

    .line 199
    :cond_c
    const/4 v13, 0x0

    .line 200
    :goto_8
    iget-boolean v5, v0, Ll1/d;->l:Z

    .line 201
    .line 202
    iget-object v14, v0, Ll1/d;->b:Ll1/e;

    .line 203
    .line 204
    if-eqz v5, :cond_d

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_d
    const/4 v5, 0x1

    .line 208
    and-int/2addr v1, v5

    .line 209
    if-eqz v1, :cond_e

    .line 210
    .line 211
    iget v1, v0, Ll1/d;->i:I

    .line 212
    .line 213
    if-lez v1, :cond_e

    .line 214
    .line 215
    const/4 v1, 0x1

    .line 216
    goto :goto_9

    .line 217
    :cond_e
    const/4 v1, 0x0

    .line 218
    :goto_9
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    if-eqz v1, :cond_f

    .line 224
    .line 225
    iget-wide v7, v14, Ll1/e;->r:J

    .line 226
    .line 227
    cmp-long v7, v7, v5

    .line 228
    .line 229
    if-nez v7, :cond_f

    .line 230
    .line 231
    if-nez v13, :cond_f

    .line 232
    .line 233
    goto :goto_d

    .line 234
    :cond_f
    if-eqz v1, :cond_11

    .line 235
    .line 236
    iget-wide v7, v14, Ll1/e;->r:J

    .line 237
    .line 238
    cmp-long v1, v7, v5

    .line 239
    .line 240
    if-eqz v1, :cond_11

    .line 241
    .line 242
    iget-object v1, v0, Ll1/d;->f:LF0/s;

    .line 243
    .line 244
    if-eqz v2, :cond_10

    .line 245
    .line 246
    const/4 v9, 0x1

    .line 247
    goto :goto_a

    .line 248
    :cond_10
    const/4 v9, 0x0

    .line 249
    :goto_a
    iget v15, v0, Ll1/d;->i:I

    .line 250
    .line 251
    int-to-long v5, v15

    .line 252
    const-wide/32 v16, 0x7a1200

    .line 253
    .line 254
    .line 255
    mul-long v5, v5, v16

    .line 256
    .line 257
    div-long/2addr v5, v7

    .line 258
    long-to-int v7, v5

    .line 259
    new-instance v8, LF0/l;

    .line 260
    .line 261
    iget-wide v5, v0, Ll1/d;->h:J

    .line 262
    .line 263
    move-object v2, v8

    .line 264
    move-object v12, v8

    .line 265
    move v8, v15

    .line 266
    invoke-direct/range {v2 .. v9}, LF0/l;-><init>(JJIIZ)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v1, v12}, LF0/s;->d(LF0/E;)V

    .line 270
    .line 271
    .line 272
    :goto_b
    const/4 v1, 0x1

    .line 273
    goto :goto_c

    .line 274
    :cond_11
    iget-object v1, v0, Ll1/d;->f:LF0/s;

    .line 275
    .line 276
    new-instance v2, LF0/v;

    .line 277
    .line 278
    invoke-direct {v2, v5, v6}, LF0/v;-><init>(J)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v1, v2}, LF0/s;->d(LF0/E;)V

    .line 282
    .line 283
    .line 284
    goto :goto_b

    .line 285
    :goto_c
    iput-boolean v1, v0, Ll1/d;->l:Z

    .line 286
    .line 287
    :goto_d
    if-eqz v13, :cond_12

    .line 288
    .line 289
    const/4 v1, -0x1

    .line 290
    return v1

    .line 291
    :cond_12
    const/4 v1, 0x0

    .line 292
    invoke-virtual {v10, v1}, Ld0/p;->H(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, v11}, Ld0/p;->G(I)V

    .line 296
    .line 297
    .line 298
    iget-boolean v1, v0, Ll1/d;->k:Z

    .line 299
    .line 300
    if-nez v1, :cond_13

    .line 301
    .line 302
    iget-wide v1, v0, Ll1/d;->g:J

    .line 303
    .line 304
    iput-wide v1, v14, Ll1/e;->t:J

    .line 305
    .line 306
    const/4 v1, 0x1

    .line 307
    iput-boolean v1, v0, Ll1/d;->k:Z

    .line 308
    .line 309
    :cond_13
    invoke-virtual {v14, v10}, Ll1/e;->b(Ld0/p;)V

    .line 310
    .line 311
    .line 312
    const/4 v1, 0x0

    .line 313
    return v1
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
    .locals 9

    .line 1
    check-cast p1, LF0/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll1/d;->a(LF0/m;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v3, v0

    .line 9
    move v2, v1

    .line 10
    move v4, v2

    .line 11
    :cond_0
    iget-object v5, p0, Ll1/d;->d:Ld0/p;

    .line 12
    .line 13
    iget-object v6, v5, Ld0/p;->a:[B

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    invoke-virtual {p1, v6, v1, v7, v1}, LF0/m;->t([BIIZ)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v1}, Ld0/p;->H(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ld0/p;->B()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const v7, 0xfff6

    .line 27
    .line 28
    .line 29
    and-int/2addr v6, v7

    .line 30
    const v7, 0xfff0

    .line 31
    .line 32
    .line 33
    if-ne v6, v7, :cond_3

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    add-int/2addr v2, v6

    .line 37
    const/4 v7, 0x4

    .line 38
    if-lt v2, v7, :cond_1

    .line 39
    .line 40
    const/16 v8, 0xbc

    .line 41
    .line 42
    if-le v4, v8, :cond_1

    .line 43
    .line 44
    return v6

    .line 45
    :cond_1
    iget-object v5, v5, Ld0/p;->a:[B

    .line 46
    .line 47
    invoke-virtual {p1, v5, v1, v7, v1}, LF0/m;->t([BIIZ)Z

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Ll1/d;->e:LF0/M;

    .line 51
    .line 52
    const/16 v6, 0xe

    .line 53
    .line 54
    invoke-virtual {v5, v6}, LF0/M;->r(I)V

    .line 55
    .line 56
    .line 57
    const/16 v6, 0xd

    .line 58
    .line 59
    invoke-virtual {v5, v6}, LF0/M;->i(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const/4 v6, 0x6

    .line 64
    if-gt v5, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    iput v1, p1, LF0/m;->q:I

    .line 69
    .line 70
    invoke-virtual {p1, v3, v1}, LF0/m;->a(IZ)Z

    .line 71
    .line 72
    .line 73
    :goto_0
    move v2, v1

    .line 74
    move v4, v2

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    add-int/lit8 v6, v5, -0x6

    .line 77
    .line 78
    invoke-virtual {p1, v6, v1}, LF0/m;->a(IZ)Z

    .line 79
    .line 80
    .line 81
    add-int/2addr v4, v5

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    iput v1, p1, LF0/m;->q:I

    .line 86
    .line 87
    invoke-virtual {p1, v3, v1}, LF0/m;->a(IZ)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    sub-int v5, v3, v0

    .line 92
    .line 93
    const/16 v6, 0x2000

    .line 94
    .line 95
    if-lt v5, v6, :cond_0

    .line 96
    .line 97
    return v1
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

.method public final j(LF0/s;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ll1/d;->f:LF0/s;

    .line 2
    .line 3
    new-instance v0, Ll1/E;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-direct {v0, v1, v2}, Ll1/E;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Ll1/d;->b:Ll1/e;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, Ll1/e;->d(LF0/s;Ll1/E;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, LF0/s;->j()V

    .line 16
    .line 17
    .line 18
    return-void
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
