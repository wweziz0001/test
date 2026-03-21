.class public final Ll1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/h;


# static fields
.field public static final w:[B


# instance fields
.field public final a:Z

.field public final b:LF0/M;

.field public final c:Ld0/p;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public f:Ljava/lang/String;

.field public g:LF0/K;

.field public h:LF0/K;

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:LF0/K;

.field public v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll1/e;->w:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
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

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF0/M;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, LF0/M;-><init>(I[B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ll1/e;->b:LF0/M;

    .line 13
    .line 14
    new-instance v0, Ld0/p;

    .line 15
    .line 16
    sget-object v1, Ll1/e;->w:[B

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Ld0/p;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ll1/e;->c:Ld0/p;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput v0, p0, Ll1/e;->i:I

    .line 31
    .line 32
    iput v0, p0, Ll1/e;->j:I

    .line 33
    .line 34
    const/16 v0, 0x100

    .line 35
    .line 36
    iput v0, p0, Ll1/e;->k:I

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    iput v0, p0, Ll1/e;->n:I

    .line 40
    .line 41
    iput v0, p0, Ll1/e;->o:I

    .line 42
    .line 43
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide v0, p0, Ll1/e;->r:J

    .line 49
    .line 50
    iput-wide v0, p0, Ll1/e;->t:J

    .line 51
    .line 52
    iput-boolean p3, p0, Ll1/e;->a:Z

    .line 53
    .line 54
    iput-object p2, p0, Ll1/e;->d:Ljava/lang/String;

    .line 55
    .line 56
    iput p1, p0, Ll1/e;->e:I

    .line 57
    .line 58
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ll1/e;->t:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Ll1/e;->m:Z

    .line 10
    .line 11
    iput v0, p0, Ll1/e;->i:I

    .line 12
    .line 13
    iput v0, p0, Ll1/e;->j:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, Ll1/e;->k:I

    .line 18
    .line 19
    return-void
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

.method public final b(Ld0/p;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x7

    .line 7
    const/4 v5, 0x1

    .line 8
    iget-object v6, v0, Ll1/e;->g:LF0/K;

    .line 9
    .line 10
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget v6, Ld0/w;->a:I

    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-lez v6, :cond_27

    .line 20
    .line 21
    iget v6, v0, Ll1/e;->i:I

    .line 22
    .line 23
    iget-object v7, v0, Ll1/e;->b:LF0/M;

    .line 24
    .line 25
    const/16 v8, 0x100

    .line 26
    .line 27
    const/4 v9, 0x4

    .line 28
    const/4 v10, 0x3

    .line 29
    const/4 v11, 0x0

    .line 30
    const/16 v12, 0xd

    .line 31
    .line 32
    iget-object v13, v0, Ll1/e;->c:Ld0/p;

    .line 33
    .line 34
    if-eqz v6, :cond_d

    .line 35
    .line 36
    if-eq v6, v5, :cond_9

    .line 37
    .line 38
    const/16 v14, 0xa

    .line 39
    .line 40
    if-eq v6, v2, :cond_8

    .line 41
    .line 42
    if-eq v6, v10, :cond_3

    .line 43
    .line 44
    if-ne v6, v9, :cond_2

    .line 45
    .line 46
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    iget v7, v0, Ll1/e;->s:I

    .line 51
    .line 52
    iget v9, v0, Ll1/e;->j:I

    .line 53
    .line 54
    sub-int/2addr v7, v9

    .line 55
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    iget-object v7, v0, Ll1/e;->u:LF0/K;

    .line 60
    .line 61
    invoke-interface {v7, v1, v6, v11}, LF0/K;->a(Ld0/p;II)V

    .line 62
    .line 63
    .line 64
    iget v7, v0, Ll1/e;->j:I

    .line 65
    .line 66
    add-int/2addr v7, v6

    .line 67
    iput v7, v0, Ll1/e;->j:I

    .line 68
    .line 69
    iget v6, v0, Ll1/e;->s:I

    .line 70
    .line 71
    if-ne v7, v6, :cond_0

    .line 72
    .line 73
    iget-wide v6, v0, Ll1/e;->t:J

    .line 74
    .line 75
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v6, v6, v9

    .line 81
    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    move v6, v5

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    move v6, v11

    .line 87
    :goto_1
    invoke-static {v6}, Ld0/m;->h(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v12, v0, Ll1/e;->u:LF0/K;

    .line 91
    .line 92
    iget-wide v13, v0, Ll1/e;->t:J

    .line 93
    .line 94
    iget v6, v0, Ll1/e;->s:I

    .line 95
    .line 96
    const/4 v15, 0x1

    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    move/from16 v16, v6

    .line 102
    .line 103
    invoke-interface/range {v12 .. v18}, LF0/K;->b(JIIILF0/J;)V

    .line 104
    .line 105
    .line 106
    iget-wide v6, v0, Ll1/e;->t:J

    .line 107
    .line 108
    iget-wide v9, v0, Ll1/e;->v:J

    .line 109
    .line 110
    add-long/2addr v6, v9

    .line 111
    iput-wide v6, v0, Ll1/e;->t:J

    .line 112
    .line 113
    iput v11, v0, Ll1/e;->i:I

    .line 114
    .line 115
    iput v11, v0, Ll1/e;->j:I

    .line 116
    .line 117
    iput v8, v0, Ll1/e;->k:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_3
    iget-boolean v6, v0, Ll1/e;->l:Z

    .line 127
    .line 128
    const/4 v8, 0x5

    .line 129
    if-eqz v6, :cond_4

    .line 130
    .line 131
    move v6, v4

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move v6, v8

    .line 134
    :goto_2
    iget-object v13, v7, LF0/M;->b:[B

    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    iget v3, v0, Ll1/e;->j:I

    .line 141
    .line 142
    sub-int v3, v6, v3

    .line 143
    .line 144
    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    iget v15, v0, Ll1/e;->j:I

    .line 149
    .line 150
    invoke-virtual {v1, v13, v15, v3}, Ld0/p;->g([BII)V

    .line 151
    .line 152
    .line 153
    iget v13, v0, Ll1/e;->j:I

    .line 154
    .line 155
    add-int/2addr v13, v3

    .line 156
    iput v13, v0, Ll1/e;->j:I

    .line 157
    .line 158
    if-ne v13, v6, :cond_0

    .line 159
    .line 160
    invoke-virtual {v7, v11}, LF0/M;->r(I)V

    .line 161
    .line 162
    .line 163
    iget-boolean v3, v0, Ll1/e;->q:Z

    .line 164
    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    invoke-virtual {v7, v2}, LF0/M;->i(I)I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    add-int/2addr v3, v5

    .line 172
    if-eq v3, v2, :cond_5

    .line 173
    .line 174
    new-instance v6, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v13, "Detected audio object type: "

    .line 177
    .line 178
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v3, ", but assuming AAC LC."

    .line 185
    .line 186
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v6, "AdtsReader"

    .line 194
    .line 195
    invoke-static {v6, v3}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    move v3, v2

    .line 199
    :cond_5
    invoke-virtual {v7, v8}, LF0/M;->u(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v10}, LF0/M;->i(I)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iget v8, v0, Ll1/e;->o:I

    .line 207
    .line 208
    invoke-static {v3, v8, v6}, LF0/b;->b(III)[B

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v6, LF0/M;

    .line 213
    .line 214
    invoke-direct {v6, v2, v3}, LF0/M;-><init>(I[B)V

    .line 215
    .line 216
    .line 217
    invoke-static {v6, v11}, LF0/b;->q(LF0/M;Z)LF0/a;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    new-instance v8, La0/o;

    .line 222
    .line 223
    invoke-direct {v8}, La0/o;-><init>()V

    .line 224
    .line 225
    .line 226
    iget-object v10, v0, Ll1/e;->f:Ljava/lang/String;

    .line 227
    .line 228
    iput-object v10, v8, La0/o;->a:Ljava/lang/String;

    .line 229
    .line 230
    const-string v10, "audio/mp4a-latm"

    .line 231
    .line 232
    invoke-static {v10}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    iput-object v10, v8, La0/o;->m:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v10, v6, LF0/a;->a:Ljava/lang/String;

    .line 239
    .line 240
    iput-object v10, v8, La0/o;->j:Ljava/lang/String;

    .line 241
    .line 242
    iget v10, v6, LF0/a;->c:I

    .line 243
    .line 244
    iput v10, v8, La0/o;->B:I

    .line 245
    .line 246
    iget v6, v6, LF0/a;->b:I

    .line 247
    .line 248
    iput v6, v8, La0/o;->C:I

    .line 249
    .line 250
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    iput-object v3, v8, La0/o;->p:Ljava/util/List;

    .line 255
    .line 256
    iget-object v3, v0, Ll1/e;->d:Ljava/lang/String;

    .line 257
    .line 258
    iput-object v3, v8, La0/o;->d:Ljava/lang/String;

    .line 259
    .line 260
    iget v3, v0, Ll1/e;->e:I

    .line 261
    .line 262
    iput v3, v8, La0/o;->f:I

    .line 263
    .line 264
    new-instance v3, La0/p;

    .line 265
    .line 266
    invoke-direct {v3, v8}, La0/p;-><init>(La0/o;)V

    .line 267
    .line 268
    .line 269
    iget v6, v3, La0/p;->D:I

    .line 270
    .line 271
    int-to-long v13, v6

    .line 272
    const-wide/32 v17, 0x3d090000

    .line 273
    .line 274
    .line 275
    div-long v13, v17, v13

    .line 276
    .line 277
    iput-wide v13, v0, Ll1/e;->r:J

    .line 278
    .line 279
    iget-object v6, v0, Ll1/e;->g:LF0/K;

    .line 280
    .line 281
    invoke-interface {v6, v3}, LF0/K;->c(La0/p;)V

    .line 282
    .line 283
    .line 284
    iput-boolean v5, v0, Ll1/e;->q:Z

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_6
    invoke-virtual {v7, v14}, LF0/M;->u(I)V

    .line 288
    .line 289
    .line 290
    :goto_3
    invoke-virtual {v7, v9}, LF0/M;->u(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v12}, LF0/M;->i(I)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    add-int/lit8 v6, v3, -0x7

    .line 298
    .line 299
    iget-boolean v7, v0, Ll1/e;->l:Z

    .line 300
    .line 301
    if-eqz v7, :cond_7

    .line 302
    .line 303
    add-int/lit8 v6, v3, -0x9

    .line 304
    .line 305
    :cond_7
    iget-object v3, v0, Ll1/e;->g:LF0/K;

    .line 306
    .line 307
    iget-wide v7, v0, Ll1/e;->r:J

    .line 308
    .line 309
    iput v9, v0, Ll1/e;->i:I

    .line 310
    .line 311
    iput v11, v0, Ll1/e;->j:I

    .line 312
    .line 313
    iput-object v3, v0, Ll1/e;->u:LF0/K;

    .line 314
    .line 315
    iput-wide v7, v0, Ll1/e;->v:J

    .line 316
    .line 317
    iput v6, v0, Ll1/e;->s:I

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_8
    iget-object v3, v13, Ld0/p;->a:[B

    .line 322
    .line 323
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    iget v7, v0, Ll1/e;->j:I

    .line 328
    .line 329
    rsub-int/lit8 v7, v7, 0xa

    .line 330
    .line 331
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    iget v7, v0, Ll1/e;->j:I

    .line 336
    .line 337
    invoke-virtual {v1, v3, v7, v6}, Ld0/p;->g([BII)V

    .line 338
    .line 339
    .line 340
    iget v3, v0, Ll1/e;->j:I

    .line 341
    .line 342
    add-int/2addr v3, v6

    .line 343
    iput v3, v0, Ll1/e;->j:I

    .line 344
    .line 345
    if-ne v3, v14, :cond_0

    .line 346
    .line 347
    iget-object v3, v0, Ll1/e;->h:LF0/K;

    .line 348
    .line 349
    invoke-interface {v3, v13, v14, v11}, LF0/K;->a(Ld0/p;II)V

    .line 350
    .line 351
    .line 352
    const/4 v3, 0x6

    .line 353
    invoke-virtual {v13, v3}, Ld0/p;->H(I)V

    .line 354
    .line 355
    .line 356
    iget-object v3, v0, Ll1/e;->h:LF0/K;

    .line 357
    .line 358
    invoke-virtual {v13}, Ld0/p;->u()I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    add-int/2addr v6, v14

    .line 363
    iput v9, v0, Ll1/e;->i:I

    .line 364
    .line 365
    iput v14, v0, Ll1/e;->j:I

    .line 366
    .line 367
    iput-object v3, v0, Ll1/e;->u:LF0/K;

    .line 368
    .line 369
    const-wide/16 v7, 0x0

    .line 370
    .line 371
    iput-wide v7, v0, Ll1/e;->v:J

    .line 372
    .line 373
    iput v6, v0, Ll1/e;->s:I

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-nez v3, :cond_a

    .line 382
    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :cond_a
    iget-object v3, v7, LF0/M;->b:[B

    .line 386
    .line 387
    iget-object v6, v1, Ld0/p;->a:[B

    .line 388
    .line 389
    iget v12, v1, Ld0/p;->b:I

    .line 390
    .line 391
    aget-byte v6, v6, v12

    .line 392
    .line 393
    aput-byte v6, v3, v11

    .line 394
    .line 395
    invoke-virtual {v7, v2}, LF0/M;->r(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v7, v9}, LF0/M;->i(I)I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    iget v6, v0, Ll1/e;->o:I

    .line 403
    .line 404
    const/4 v7, -0x1

    .line 405
    if-eq v6, v7, :cond_b

    .line 406
    .line 407
    if-eq v3, v6, :cond_b

    .line 408
    .line 409
    iput-boolean v11, v0, Ll1/e;->m:Z

    .line 410
    .line 411
    iput v11, v0, Ll1/e;->i:I

    .line 412
    .line 413
    iput v11, v0, Ll1/e;->j:I

    .line 414
    .line 415
    iput v8, v0, Ll1/e;->k:I

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_b
    iget-boolean v6, v0, Ll1/e;->m:Z

    .line 420
    .line 421
    if-nez v6, :cond_c

    .line 422
    .line 423
    iput-boolean v5, v0, Ll1/e;->m:Z

    .line 424
    .line 425
    iget v6, v0, Ll1/e;->p:I

    .line 426
    .line 427
    iput v6, v0, Ll1/e;->n:I

    .line 428
    .line 429
    iput v3, v0, Ll1/e;->o:I

    .line 430
    .line 431
    :cond_c
    iput v10, v0, Ll1/e;->i:I

    .line 432
    .line 433
    iput v11, v0, Ll1/e;->j:I

    .line 434
    .line 435
    goto/16 :goto_0

    .line 436
    .line 437
    :cond_d
    iget-object v3, v1, Ld0/p;->a:[B

    .line 438
    .line 439
    iget v6, v1, Ld0/p;->b:I

    .line 440
    .line 441
    iget v14, v1, Ld0/p;->c:I

    .line 442
    .line 443
    :goto_4
    if-ge v6, v14, :cond_26

    .line 444
    .line 445
    add-int/lit8 v15, v6, 0x1

    .line 446
    .line 447
    aget-byte v8, v3, v6

    .line 448
    .line 449
    and-int/lit16 v10, v8, 0xff

    .line 450
    .line 451
    iget v4, v0, Ll1/e;->k:I

    .line 452
    .line 453
    const/16 v12, 0x200

    .line 454
    .line 455
    if-ne v4, v12, :cond_1f

    .line 456
    .line 457
    int-to-byte v4, v10

    .line 458
    and-int/lit16 v4, v4, 0xff

    .line 459
    .line 460
    const v19, 0xff00

    .line 461
    .line 462
    .line 463
    or-int v4, v19, v4

    .line 464
    .line 465
    const v20, 0xfff6

    .line 466
    .line 467
    .line 468
    and-int v4, v4, v20

    .line 469
    .line 470
    const v12, 0xfff0

    .line 471
    .line 472
    .line 473
    if-ne v4, v12, :cond_1f

    .line 474
    .line 475
    iget-boolean v4, v0, Ll1/e;->m:Z

    .line 476
    .line 477
    if-nez v4, :cond_1c

    .line 478
    .line 479
    const/4 v4, -0x1

    .line 480
    add-int/lit8 v21, v6, -0x1

    .line 481
    .line 482
    invoke-virtual {v1, v6}, Ld0/p;->H(I)V

    .line 483
    .line 484
    .line 485
    iget-object v4, v7, LF0/M;->b:[B

    .line 486
    .line 487
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 488
    .line 489
    .line 490
    move-result v12

    .line 491
    if-ge v12, v5, :cond_e

    .line 492
    .line 493
    goto/16 :goto_a

    .line 494
    .line 495
    :cond_e
    invoke-virtual {v1, v4, v11, v5}, Ld0/p;->g([BII)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v7, v9}, LF0/M;->r(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v7, v5}, LF0/M;->i(I)I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    iget v12, v0, Ll1/e;->n:I

    .line 506
    .line 507
    const/4 v9, -0x1

    .line 508
    if-eq v12, v9, :cond_f

    .line 509
    .line 510
    if-eq v4, v12, :cond_f

    .line 511
    .line 512
    move-object/from16 v22, v3

    .line 513
    .line 514
    move v3, v9

    .line 515
    goto/16 :goto_b

    .line 516
    .line 517
    :cond_f
    iget v12, v0, Ll1/e;->o:I

    .line 518
    .line 519
    if-eq v12, v9, :cond_12

    .line 520
    .line 521
    iget-object v9, v7, LF0/M;->b:[B

    .line 522
    .line 523
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 524
    .line 525
    .line 526
    move-result v12

    .line 527
    if-ge v12, v5, :cond_10

    .line 528
    .line 529
    goto/16 :goto_6

    .line 530
    .line 531
    :cond_10
    invoke-virtual {v1, v9, v11, v5}, Ld0/p;->g([BII)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v7, v2}, LF0/M;->r(I)V

    .line 535
    .line 536
    .line 537
    const/4 v9, 0x4

    .line 538
    invoke-virtual {v7, v9}, LF0/M;->i(I)I

    .line 539
    .line 540
    .line 541
    move-result v12

    .line 542
    iget v2, v0, Ll1/e;->o:I

    .line 543
    .line 544
    if-eq v12, v2, :cond_11

    .line 545
    .line 546
    goto/16 :goto_a

    .line 547
    .line 548
    :cond_11
    invoke-virtual {v1, v15}, Ld0/p;->H(I)V

    .line 549
    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_12
    const/4 v9, 0x4

    .line 553
    :goto_5
    iget-object v2, v7, LF0/M;->b:[B

    .line 554
    .line 555
    invoke-virtual/range {p1 .. p1}, Ld0/p;->a()I

    .line 556
    .line 557
    .line 558
    move-result v12

    .line 559
    if-ge v12, v9, :cond_13

    .line 560
    .line 561
    goto :goto_6

    .line 562
    :cond_13
    invoke-virtual {v1, v2, v11, v9}, Ld0/p;->g([BII)V

    .line 563
    .line 564
    .line 565
    const/16 v2, 0xe

    .line 566
    .line 567
    invoke-virtual {v7, v2}, LF0/M;->r(I)V

    .line 568
    .line 569
    .line 570
    const/16 v2, 0xd

    .line 571
    .line 572
    invoke-virtual {v7, v2}, LF0/M;->i(I)I

    .line 573
    .line 574
    .line 575
    move-result v12

    .line 576
    const/4 v2, 0x7

    .line 577
    if-ge v12, v2, :cond_14

    .line 578
    .line 579
    goto/16 :goto_a

    .line 580
    .line 581
    :cond_14
    iget-object v2, v1, Ld0/p;->a:[B

    .line 582
    .line 583
    iget v9, v1, Ld0/p;->c:I

    .line 584
    .line 585
    add-int v12, v21, v12

    .line 586
    .line 587
    if-lt v12, v9, :cond_15

    .line 588
    .line 589
    goto :goto_6

    .line 590
    :cond_15
    aget-byte v11, v2, v12

    .line 591
    .line 592
    move-object/from16 v22, v3

    .line 593
    .line 594
    const/4 v3, -0x1

    .line 595
    if-ne v11, v3, :cond_17

    .line 596
    .line 597
    add-int/2addr v12, v5

    .line 598
    if-ne v12, v9, :cond_16

    .line 599
    .line 600
    goto :goto_7

    .line 601
    :cond_16
    aget-byte v2, v2, v12

    .line 602
    .line 603
    and-int/lit16 v9, v2, 0xff

    .line 604
    .line 605
    or-int v9, v19, v9

    .line 606
    .line 607
    and-int v9, v9, v20

    .line 608
    .line 609
    const v11, 0xfff0

    .line 610
    .line 611
    .line 612
    if-ne v9, v11, :cond_20

    .line 613
    .line 614
    and-int/lit8 v2, v2, 0x8

    .line 615
    .line 616
    const/4 v9, 0x3

    .line 617
    shr-int/2addr v2, v9

    .line 618
    if-ne v2, v4, :cond_20

    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_17
    const/16 v4, 0x49

    .line 622
    .line 623
    if-eq v11, v4, :cond_18

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_18
    add-int/lit8 v4, v12, 0x1

    .line 627
    .line 628
    if-ne v4, v9, :cond_19

    .line 629
    .line 630
    goto :goto_7

    .line 631
    :cond_19
    aget-byte v4, v2, v4

    .line 632
    .line 633
    const/16 v11, 0x44

    .line 634
    .line 635
    if-eq v4, v11, :cond_1a

    .line 636
    .line 637
    goto :goto_b

    .line 638
    :cond_1a
    const/4 v4, 0x2

    .line 639
    add-int/2addr v12, v4

    .line 640
    if-ne v12, v9, :cond_1b

    .line 641
    .line 642
    goto :goto_7

    .line 643
    :cond_1b
    aget-byte v2, v2, v12

    .line 644
    .line 645
    const/16 v4, 0x33

    .line 646
    .line 647
    if-ne v2, v4, :cond_20

    .line 648
    .line 649
    goto :goto_7

    .line 650
    :cond_1c
    :goto_6
    const/4 v3, -0x1

    .line 651
    :goto_7
    and-int/lit8 v2, v8, 0x8

    .line 652
    .line 653
    const/4 v4, 0x3

    .line 654
    shr-int/2addr v2, v4

    .line 655
    iput v2, v0, Ll1/e;->p:I

    .line 656
    .line 657
    and-int/lit8 v2, v8, 0x1

    .line 658
    .line 659
    if-nez v2, :cond_1d

    .line 660
    .line 661
    move v2, v5

    .line 662
    goto :goto_8

    .line 663
    :cond_1d
    const/4 v2, 0x0

    .line 664
    :goto_8
    iput-boolean v2, v0, Ll1/e;->l:Z

    .line 665
    .line 666
    iget-boolean v2, v0, Ll1/e;->m:Z

    .line 667
    .line 668
    if-nez v2, :cond_1e

    .line 669
    .line 670
    iput v5, v0, Ll1/e;->i:I

    .line 671
    .line 672
    const/4 v2, 0x0

    .line 673
    iput v2, v0, Ll1/e;->j:I

    .line 674
    .line 675
    goto :goto_9

    .line 676
    :cond_1e
    const/4 v2, 0x0

    .line 677
    const/4 v4, 0x3

    .line 678
    iput v4, v0, Ll1/e;->i:I

    .line 679
    .line 680
    iput v2, v0, Ll1/e;->j:I

    .line 681
    .line 682
    :goto_9
    invoke-virtual {v1, v15}, Ld0/p;->H(I)V

    .line 683
    .line 684
    .line 685
    const/4 v2, 0x2

    .line 686
    goto :goto_e

    .line 687
    :cond_1f
    :goto_a
    move-object/from16 v22, v3

    .line 688
    .line 689
    const/4 v3, -0x1

    .line 690
    :cond_20
    :goto_b
    iget v2, v0, Ll1/e;->k:I

    .line 691
    .line 692
    or-int v4, v2, v10

    .line 693
    .line 694
    const/16 v8, 0x149

    .line 695
    .line 696
    if-eq v4, v8, :cond_25

    .line 697
    .line 698
    const/16 v8, 0x1ff

    .line 699
    .line 700
    if-eq v4, v8, :cond_24

    .line 701
    .line 702
    const/16 v8, 0x344

    .line 703
    .line 704
    if-eq v4, v8, :cond_23

    .line 705
    .line 706
    const/16 v8, 0x433

    .line 707
    .line 708
    if-eq v4, v8, :cond_22

    .line 709
    .line 710
    const/16 v4, 0x100

    .line 711
    .line 712
    if-eq v2, v4, :cond_21

    .line 713
    .line 714
    iput v4, v0, Ll1/e;->k:I

    .line 715
    .line 716
    const/4 v2, 0x2

    .line 717
    const/4 v8, 0x3

    .line 718
    const/4 v9, 0x0

    .line 719
    goto :goto_d

    .line 720
    :cond_21
    const/4 v2, 0x2

    .line 721
    const/4 v8, 0x3

    .line 722
    const/4 v9, 0x0

    .line 723
    goto :goto_c

    .line 724
    :cond_22
    const/4 v2, 0x2

    .line 725
    iput v2, v0, Ll1/e;->i:I

    .line 726
    .line 727
    const/4 v8, 0x3

    .line 728
    iput v8, v0, Ll1/e;->j:I

    .line 729
    .line 730
    const/4 v9, 0x0

    .line 731
    iput v9, v0, Ll1/e;->s:I

    .line 732
    .line 733
    invoke-virtual {v13, v9}, Ld0/p;->H(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1, v15}, Ld0/p;->H(I)V

    .line 737
    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_23
    const/4 v2, 0x2

    .line 741
    const/16 v4, 0x100

    .line 742
    .line 743
    const/4 v8, 0x3

    .line 744
    const/4 v9, 0x0

    .line 745
    const/16 v6, 0x400

    .line 746
    .line 747
    iput v6, v0, Ll1/e;->k:I

    .line 748
    .line 749
    goto :goto_c

    .line 750
    :cond_24
    const/4 v2, 0x2

    .line 751
    const/16 v4, 0x100

    .line 752
    .line 753
    const/16 v6, 0x200

    .line 754
    .line 755
    const/4 v8, 0x3

    .line 756
    const/4 v9, 0x0

    .line 757
    iput v6, v0, Ll1/e;->k:I

    .line 758
    .line 759
    goto :goto_c

    .line 760
    :cond_25
    const/4 v2, 0x2

    .line 761
    const/16 v4, 0x100

    .line 762
    .line 763
    const/4 v8, 0x3

    .line 764
    const/4 v9, 0x0

    .line 765
    const/16 v6, 0x300

    .line 766
    .line 767
    iput v6, v0, Ll1/e;->k:I

    .line 768
    .line 769
    :goto_c
    move v6, v15

    .line 770
    :goto_d
    move v10, v8

    .line 771
    move v11, v9

    .line 772
    move-object/from16 v3, v22

    .line 773
    .line 774
    const/4 v9, 0x4

    .line 775
    const/16 v12, 0xd

    .line 776
    .line 777
    move v8, v4

    .line 778
    const/4 v4, 0x7

    .line 779
    goto/16 :goto_4

    .line 780
    .line 781
    :cond_26
    const/4 v3, -0x1

    .line 782
    invoke-virtual {v1, v6}, Ld0/p;->H(I)V

    .line 783
    .line 784
    .line 785
    :goto_e
    const/4 v4, 0x7

    .line 786
    goto/16 :goto_0

    .line 787
    .line 788
    :cond_27
    return-void
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
    iput-object v0, p0, Ll1/e;->f:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ll1/E;->c()V

    .line 14
    .line 15
    .line 16
    iget v0, p2, Ll1/E;->c:I

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-interface {p1, v0, v1}, LF0/s;->k(II)LF0/K;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ll1/e;->g:LF0/K;

    .line 24
    .line 25
    iput-object v0, p0, Ll1/e;->u:LF0/K;

    .line 26
    .line 27
    iget-boolean v0, p0, Ll1/e;->a:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Ll1/E;->a()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ll1/E;->c()V

    .line 35
    .line 36
    .line 37
    iget v0, p2, Ll1/E;->c:I

    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    invoke-interface {p1, v0, v1}, LF0/s;->k(II)LF0/K;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Ll1/e;->h:LF0/K;

    .line 45
    .line 46
    new-instance v0, La0/o;

    .line 47
    .line 48
    invoke-direct {v0}, La0/o;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ll1/E;->c()V

    .line 52
    .line 53
    .line 54
    iget-object p2, p2, Ll1/E;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Ljava/lang/String;

    .line 57
    .line 58
    iput-object p2, v0, La0/o;->a:Ljava/lang/String;

    .line 59
    .line 60
    const-string p2, "application/id3"

    .line 61
    .line 62
    invoke-static {p2}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, v0, La0/o;->m:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, p1}, Lm/B0;->k(La0/o;LF0/K;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, LF0/o;

    .line 73
    .line 74
    invoke-direct {p1}, LF0/o;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Ll1/e;->h:LF0/K;

    .line 78
    .line 79
    :goto_0
    return-void
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
    iput-wide p1, p0, Ll1/e;->t:J

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
