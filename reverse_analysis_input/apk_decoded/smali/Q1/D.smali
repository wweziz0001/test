.class public abstract LQ1/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, LQ1/D;->a:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 35

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    const-string v2, "randomUUID()"

    invoke-static {v1, v2}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LQ1/D;->b:Ljava/lang/Object;

    .line 3
    new-instance v1, LZ1/p;

    iget-object v2, v0, LQ1/D;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "id.toString()"

    invoke-static {v4, v2}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v18, 0x0

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0x7ffffa

    move-object v3, v1

    .line 4
    invoke-direct/range {v3 .. v34}, LZ1/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIJIII)V

    .line 5
    iput-object v1, v0, LQ1/D;->c:Ljava/lang/Object;

    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/LinkedHashSet;

    const/4 v3, 0x1

    invoke-static {v3}, LC3/r;->b0(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {v1, v2}, LC3/e;->Y([Ljava/lang/Object;Ljava/util/AbstractCollection;)V

    .line 8
    iput-object v2, v0, LQ1/D;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LQ1/D;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "android.summaryText"

    .line 6
    .line 7
    iget-object v1, p0, LQ1/D;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LQ1/D;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v1, "android.title.big"

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, LQ1/D;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void
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

.method public abstract b(La1/j;)V
.end method

.method public c()LQ1/E;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LQ1/D;->d()LQ1/E;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, LQ1/D;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LZ1/p;

    .line 10
    .line 11
    iget-object v2, v2, LZ1/p;->j:LQ1/d;

    .line 12
    .line 13
    iget-object v3, v2, LQ1/d;->h:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget-boolean v3, v2, LQ1/d;->d:Z

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v2, LQ1/d;->b:Z

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-boolean v2, v2, LQ1/d;->c:Z

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 37
    :goto_1
    iget-object v3, v0, LQ1/D;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, LZ1/p;

    .line 40
    .line 41
    iget-boolean v4, v3, LZ1/p;->q:Z

    .line 42
    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    iget-wide v2, v3, LZ1/p;->g:J

    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    cmp-long v2, v2, v4

    .line 52
    .line 53
    if-gtz v2, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string v2, "Expedited jobs cannot be delayed"

    .line 59
    .line 60
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v2, "Expedited jobs only support network and storage constraints"

    .line 67
    .line 68
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "randomUUID()"

    .line 77
    .line 78
    invoke-static {v2, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, LQ1/D;->b:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance v3, LZ1/p;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v2, "id.toString()"

    .line 90
    .line 91
    invoke-static {v5, v2}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, v0, LQ1/D;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, LZ1/p;

    .line 97
    .line 98
    const-string v4, "other"

    .line 99
    .line 100
    invoke-static {v2, v4}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget v6, v2, LZ1/p;->b:I

    .line 104
    .line 105
    new-instance v4, LQ1/g;

    .line 106
    .line 107
    move-object v9, v4

    .line 108
    iget-object v7, v2, LZ1/p;->e:LQ1/g;

    .line 109
    .line 110
    invoke-direct {v4, v7}, LQ1/g;-><init>(LQ1/g;)V

    .line 111
    .line 112
    .line 113
    new-instance v4, LQ1/g;

    .line 114
    .line 115
    move-object v10, v4

    .line 116
    iget-object v7, v2, LZ1/p;->f:LQ1/g;

    .line 117
    .line 118
    invoke-direct {v4, v7}, LQ1/g;-><init>(LQ1/g;)V

    .line 119
    .line 120
    .line 121
    iget-wide v11, v2, LZ1/p;->g:J

    .line 122
    .line 123
    iget-wide v13, v2, LZ1/p;->h:J

    .line 124
    .line 125
    iget-wide v7, v2, LZ1/p;->i:J

    .line 126
    .line 127
    move-wide v15, v7

    .line 128
    new-instance v4, LQ1/d;

    .line 129
    .line 130
    move-object/from16 v17, v4

    .line 131
    .line 132
    iget-object v7, v2, LZ1/p;->j:LQ1/d;

    .line 133
    .line 134
    invoke-direct {v4, v7}, LQ1/d;-><init>(LQ1/d;)V

    .line 135
    .line 136
    .line 137
    iget v4, v2, LZ1/p;->l:I

    .line 138
    .line 139
    move/from16 v19, v4

    .line 140
    .line 141
    iget-wide v7, v2, LZ1/p;->m:J

    .line 142
    .line 143
    move-wide/from16 v20, v7

    .line 144
    .line 145
    iget-wide v7, v2, LZ1/p;->n:J

    .line 146
    .line 147
    move-wide/from16 v22, v7

    .line 148
    .line 149
    iget-boolean v4, v2, LZ1/p;->q:Z

    .line 150
    .line 151
    move/from16 v28, v4

    .line 152
    .line 153
    iget v4, v2, LZ1/p;->r:I

    .line 154
    .line 155
    move/from16 v29, v4

    .line 156
    .line 157
    iget-wide v7, v2, LZ1/p;->u:J

    .line 158
    .line 159
    move-wide/from16 v31, v7

    .line 160
    .line 161
    iget v4, v2, LZ1/p;->v:I

    .line 162
    .line 163
    move/from16 v33, v4

    .line 164
    .line 165
    iget-object v7, v2, LZ1/p;->c:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v8, v2, LZ1/p;->d:Ljava/lang/String;

    .line 168
    .line 169
    iget v4, v2, LZ1/p;->k:I

    .line 170
    .line 171
    move/from16 v18, v4

    .line 172
    .line 173
    move-object/from16 v36, v1

    .line 174
    .line 175
    iget-wide v0, v2, LZ1/p;->o:J

    .line 176
    .line 177
    move-wide/from16 v24, v0

    .line 178
    .line 179
    iget-wide v0, v2, LZ1/p;->p:J

    .line 180
    .line 181
    move-wide/from16 v26, v0

    .line 182
    .line 183
    iget v0, v2, LZ1/p;->s:I

    .line 184
    .line 185
    move/from16 v30, v0

    .line 186
    .line 187
    iget v0, v2, LZ1/p;->w:I

    .line 188
    .line 189
    move/from16 v34, v0

    .line 190
    .line 191
    const/high16 v35, 0x80000

    .line 192
    .line 193
    move-object v4, v3

    .line 194
    invoke-direct/range {v4 .. v35}, LZ1/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIJIII)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v0, p0

    .line 198
    .line 199
    iput-object v3, v0, LQ1/D;->c:Ljava/lang/Object;

    .line 200
    .line 201
    return-object v36
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
.end method

.method public abstract d()LQ1/E;
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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

.method public abstract f()LQ1/D;
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "android.summaryText"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LQ1/D;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LQ1/D;->a:Z

    .line 17
    .line 18
    :cond_0
    const-string v0, "android.title.big"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, LQ1/D;->c:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
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

.method public h(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    .line 1
    const-string v0, "backoffPolicy"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeUnit"

    .line 7
    .line 8
    invoke-static {p4, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, LQ1/D;->a:Z

    .line 13
    .line 14
    iget-object v0, p0, LQ1/D;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LZ1/p;

    .line 17
    .line 18
    iput p1, v0, LZ1/p;->l:I

    .line 19
    .line 20
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const-wide/32 p1, 0x112a880

    .line 25
    .line 26
    .line 27
    cmp-long p1, v1, p1

    .line 28
    .line 29
    sget-object p2, LZ1/p;->x:Ljava/lang/String;

    .line 30
    .line 31
    if-lez p1, :cond_0

    .line 32
    .line 33
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p3, "Backoff delay duration exceeds maximum value"

    .line 38
    .line 39
    invoke-virtual {p1, p2, p3}, LQ1/q;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    const-wide/16 p3, 0x2710

    .line 43
    .line 44
    cmp-long p1, v1, p3

    .line 45
    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p3, "Backoff delay duration less than minimum value"

    .line 53
    .line 54
    invoke-virtual {p1, p2, p3}, LQ1/q;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    const-wide/16 v3, 0x2710

    .line 58
    .line 59
    const-wide/32 v5, 0x112a880

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, LZ1/f;->h(JJJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    iput-wide p1, v0, LZ1/p;->m:J

    .line 67
    .line 68
    return-void
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

.method public i(JLjava/util/concurrent/TimeUnit;)LQ1/D;
    .locals 2

    .line 1
    const-string v0, "timeUnit"

    .line 2
    .line 3
    invoke-static {p3, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ1/D;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZ1/p;

    .line 9
    .line 10
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, v0, LZ1/p;->g:J

    .line 15
    .line 16
    const-wide p1, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    sub-long/2addr p1, v0

    .line 26
    iget-object p3, p0, LQ1/D;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p3, LZ1/p;

    .line 29
    .line 30
    iget-wide v0, p3, LZ1/p;->g:J

    .line 31
    .line 32
    cmp-long p1, p1, v0

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, LQ1/D;->f()LQ1/D;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string p2, "The given initial delay is too large and will cause an overflow!"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
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
