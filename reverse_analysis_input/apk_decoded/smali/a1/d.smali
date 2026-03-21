.class public final La1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public a:LF0/s;

.field public b:La1/i;

.field public c:Z


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


# virtual methods
.method public final a(LF0/m;)Z
    .locals 8

    .line 1
    new-instance v0, La1/f;

    .line 2
    .line 3
    invoke-direct {v0}, La1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, La1/f;->a(LF0/m;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, La1/f;->a:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget v0, v0, La1/f;->e:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Ld0/p;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Ld0/p;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, Ld0/p;->a:[B

    .line 35
    .line 36
    invoke-virtual {p1, v4, v3, v0, v3}, LF0/m;->t([BIIZ)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ld0/p;->H(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ld0/p;->a()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 v0, 0x5

    .line 47
    if-lt p1, v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Ld0/p;->v()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 v0, 0x7f

    .line 54
    .line 55
    if-ne p1, v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Ld0/p;->x()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/32 v6, 0x464c4143

    .line 62
    .line 63
    .line 64
    cmp-long p1, v4, v6

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    new-instance p1, La1/c;

    .line 69
    .line 70
    invoke-direct {p1}, La1/i;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, La1/d;->b:La1/i;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v2, v3}, Ld0/p;->H(I)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {v1, v2, v1}, LF0/b;->z(ILd0/p;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p1
    :try_end_0
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move p1, v3

    .line 85
    :goto_0
    if-eqz p1, :cond_2

    .line 86
    .line 87
    new-instance p1, La1/k;

    .line 88
    .line 89
    invoke-direct {p1}, La1/i;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, La1/d;->b:La1/i;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v2, v3}, Ld0/p;->H(I)V

    .line 96
    .line 97
    .line 98
    sget-object p1, La1/h;->o:[B

    .line 99
    .line 100
    invoke-static {v2, p1}, La1/h;->e(Ld0/p;[B)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    new-instance p1, La1/h;

    .line 107
    .line 108
    invoke-direct {p1}, La1/i;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, La1/d;->b:La1/i;

    .line 112
    .line 113
    :goto_1
    return v1

    .line 114
    :cond_3
    :goto_2
    return v3
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

.method public final b(JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, La1/d;->b:La1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, La1/i;->a:La1/e;

    .line 6
    .line 7
    iget-object v2, v1, La1/e;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La1/f;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput v3, v2, La1/f;->a:I

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    iput-wide v4, v2, La1/f;->b:J

    .line 17
    .line 18
    iput v3, v2, La1/f;->c:I

    .line 19
    .line 20
    iput v3, v2, La1/f;->d:I

    .line 21
    .line 22
    iput v3, v2, La1/f;->e:I

    .line 23
    .line 24
    iget-object v2, v1, La1/e;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ld0/p;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ld0/p;->E(I)V

    .line 29
    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    iput v2, v1, La1/e;->l:I

    .line 33
    .line 34
    iput-boolean v3, v1, La1/e;->n:Z

    .line 35
    .line 36
    cmp-long p1, p1, v4

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    iget-boolean p1, v0, La1/i;->l:Z

    .line 41
    .line 42
    xor-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    invoke-virtual {v0, p1}, La1/i;->d(Z)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget p1, v0, La1/i;->h:I

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    iget p1, v0, La1/i;->i:I

    .line 53
    .line 54
    int-to-long p1, p1

    .line 55
    mul-long/2addr p1, p3

    .line 56
    const-wide/32 p3, 0xf4240

    .line 57
    .line 58
    .line 59
    div-long/2addr p1, p3

    .line 60
    iput-wide p1, v0, La1/i;->e:J

    .line 61
    .line 62
    iget-object p3, v0, La1/i;->d:La1/g;

    .line 63
    .line 64
    sget p4, Ld0/w;->a:I

    .line 65
    .line 66
    invoke-interface {p3, p1, p2}, La1/g;->j(J)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x2

    .line 70
    iput p1, v0, La1/i;->h:I

    .line 71
    .line 72
    :cond_1
    :goto_0
    return-void
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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, La1/d;->a:LF0/s;

    .line 5
    .line 6
    invoke-static {v2}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, v0, La1/d;->b:La1/i;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    move-object/from16 v2, p1

    .line 15
    .line 16
    check-cast v2, LF0/m;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, La1/d;->a(LF0/m;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    iput v3, v2, LF0/m;->q:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "Failed to determine bitstream type"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v2, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    throw v1

    .line 35
    :cond_1
    :goto_0
    iget-boolean v2, v0, La1/d;->c:Z

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    iget-object v2, v0, La1/d;->a:LF0/s;

    .line 40
    .line 41
    invoke-interface {v2, v3, v1}, LF0/s;->k(II)LF0/K;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v4, v0, La1/d;->a:LF0/s;

    .line 46
    .line 47
    invoke-interface {v4}, LF0/s;->j()V

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, La1/d;->b:La1/i;

    .line 51
    .line 52
    iget-object v5, v0, La1/d;->a:LF0/s;

    .line 53
    .line 54
    iput-object v5, v4, La1/i;->c:LF0/s;

    .line 55
    .line 56
    iput-object v2, v4, La1/i;->b:LF0/K;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, La1/i;->d(Z)V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, v0, La1/d;->c:Z

    .line 62
    .line 63
    :cond_2
    iget-object v2, v0, La1/d;->b:La1/i;

    .line 64
    .line 65
    iget-object v4, v2, La1/i;->b:LF0/K;

    .line 66
    .line 67
    invoke-static {v4}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget v4, Ld0/w;->a:I

    .line 71
    .line 72
    iget v4, v2, La1/i;->h:I

    .line 73
    .line 74
    iget-object v5, v2, La1/i;->a:La1/e;

    .line 75
    .line 76
    const-wide/16 v6, -0x1

    .line 77
    .line 78
    const/4 v8, -0x1

    .line 79
    const/4 v9, 0x3

    .line 80
    const/4 v14, 0x2

    .line 81
    if-eqz v4, :cond_c

    .line 82
    .line 83
    if-eq v4, v1, :cond_b

    .line 84
    .line 85
    if-eq v4, v14, :cond_4

    .line 86
    .line 87
    if-ne v4, v9, :cond_3

    .line 88
    .line 89
    :goto_1
    move v3, v8

    .line 90
    goto/16 :goto_9

    .line 91
    .line 92
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_4
    iget-object v4, v2, La1/i;->d:La1/g;

    .line 99
    .line 100
    move-object/from16 v10, p1

    .line 101
    .line 102
    check-cast v10, LF0/m;

    .line 103
    .line 104
    invoke-interface {v4, v10}, La1/g;->k(LF0/m;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    const-wide/16 v13, 0x0

    .line 109
    .line 110
    cmp-long v4, v11, v13

    .line 111
    .line 112
    if-ltz v4, :cond_5

    .line 113
    .line 114
    move-object/from16 v4, p2

    .line 115
    .line 116
    iput-wide v11, v4, LF0/u;->a:J

    .line 117
    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_5
    cmp-long v4, v11, v6

    .line 121
    .line 122
    if-gez v4, :cond_6

    .line 123
    .line 124
    const-wide/16 v15, 0x2

    .line 125
    .line 126
    add-long/2addr v11, v15

    .line 127
    neg-long v11, v11

    .line 128
    invoke-virtual {v2, v11, v12}, La1/i;->a(J)V

    .line 129
    .line 130
    .line 131
    :cond_6
    iget-boolean v4, v2, La1/i;->l:Z

    .line 132
    .line 133
    if-nez v4, :cond_7

    .line 134
    .line 135
    iget-object v4, v2, La1/i;->d:La1/g;

    .line 136
    .line 137
    invoke-interface {v4}, La1/g;->e()LF0/E;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v11, v2, La1/i;->c:LF0/s;

    .line 145
    .line 146
    invoke-interface {v11, v4}, LF0/s;->d(LF0/E;)V

    .line 147
    .line 148
    .line 149
    iput-boolean v1, v2, La1/i;->l:Z

    .line 150
    .line 151
    :cond_7
    iget-wide v11, v2, La1/i;->k:J

    .line 152
    .line 153
    cmp-long v1, v11, v13

    .line 154
    .line 155
    if-gtz v1, :cond_9

    .line 156
    .line 157
    invoke-virtual {v5, v10}, La1/e;->c(LF0/m;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    iput v9, v2, La1/i;->h:I

    .line 165
    .line 166
    move v1, v8

    .line 167
    goto :goto_3

    .line 168
    :cond_9
    :goto_2
    iput-wide v13, v2, La1/i;->k:J

    .line 169
    .line 170
    iget-object v1, v5, La1/e;->p:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Ld0/p;

    .line 173
    .line 174
    invoke-virtual {v2, v1}, La1/i;->b(Ld0/p;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    cmp-long v8, v4, v13

    .line 179
    .line 180
    if-ltz v8, :cond_a

    .line 181
    .line 182
    iget-wide v8, v2, La1/i;->g:J

    .line 183
    .line 184
    add-long v10, v8, v4

    .line 185
    .line 186
    iget-wide v12, v2, La1/i;->e:J

    .line 187
    .line 188
    cmp-long v10, v10, v12

    .line 189
    .line 190
    if-ltz v10, :cond_a

    .line 191
    .line 192
    const-wide/32 v10, 0xf4240

    .line 193
    .line 194
    .line 195
    mul-long/2addr v8, v10

    .line 196
    iget v10, v2, La1/i;->i:I

    .line 197
    .line 198
    int-to-long v10, v10

    .line 199
    div-long v13, v8, v10

    .line 200
    .line 201
    iget-object v8, v2, La1/i;->b:LF0/K;

    .line 202
    .line 203
    iget v9, v1, Ld0/p;->c:I

    .line 204
    .line 205
    invoke-interface {v8, v1, v9, v3}, LF0/K;->a(Ld0/p;II)V

    .line 206
    .line 207
    .line 208
    iget-object v12, v2, La1/i;->b:LF0/K;

    .line 209
    .line 210
    iget v1, v1, Ld0/p;->c:I

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    const/4 v15, 0x1

    .line 217
    move/from16 v16, v1

    .line 218
    .line 219
    invoke-interface/range {v12 .. v18}, LF0/K;->b(JIIILF0/J;)V

    .line 220
    .line 221
    .line 222
    iput-wide v6, v2, La1/i;->e:J

    .line 223
    .line 224
    :cond_a
    iget-wide v6, v2, La1/i;->g:J

    .line 225
    .line 226
    add-long/2addr v6, v4

    .line 227
    iput-wide v6, v2, La1/i;->g:J

    .line 228
    .line 229
    move v1, v3

    .line 230
    :goto_3
    move v3, v1

    .line 231
    goto/16 :goto_9

    .line 232
    .line 233
    :cond_b
    iget-wide v4, v2, La1/i;->f:J

    .line 234
    .line 235
    long-to-int v1, v4

    .line 236
    move-object/from16 v4, p1

    .line 237
    .line 238
    check-cast v4, LF0/m;

    .line 239
    .line 240
    invoke-virtual {v4, v1}, LF0/m;->f(I)V

    .line 241
    .line 242
    .line 243
    iput v14, v2, La1/i;->h:I

    .line 244
    .line 245
    goto/16 :goto_9

    .line 246
    .line 247
    :cond_c
    :goto_4
    move-object/from16 v4, p1

    .line 248
    .line 249
    check-cast v4, LF0/m;

    .line 250
    .line 251
    invoke-virtual {v5, v4}, La1/e;->c(LF0/m;)Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-nez v10, :cond_d

    .line 256
    .line 257
    iput v9, v2, La1/i;->h:I

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :cond_d
    iget-wide v10, v4, LF0/m;->o:J

    .line 262
    .line 263
    iget-wide v12, v2, La1/i;->f:J

    .line 264
    .line 265
    sub-long/2addr v10, v12

    .line 266
    iput-wide v10, v2, La1/i;->k:J

    .line 267
    .line 268
    iget-object v4, v2, La1/i;->j:LZ1/l;

    .line 269
    .line 270
    iget-object v10, v5, La1/e;->p:Ljava/lang/Object;

    .line 271
    .line 272
    move-object v15, v10

    .line 273
    check-cast v15, Ld0/p;

    .line 274
    .line 275
    invoke-virtual {v2, v15, v12, v13, v4}, La1/i;->c(Ld0/p;JLZ1/l;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_e

    .line 280
    .line 281
    move-object/from16 v4, p1

    .line 282
    .line 283
    check-cast v4, LF0/m;

    .line 284
    .line 285
    iget-wide v10, v4, LF0/m;->o:J

    .line 286
    .line 287
    iput-wide v10, v2, La1/i;->f:J

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_e
    iget-object v4, v2, La1/i;->j:LZ1/l;

    .line 291
    .line 292
    iget-object v4, v4, LZ1/l;->l:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v4, La0/p;

    .line 295
    .line 296
    iget v8, v4, La0/p;->D:I

    .line 297
    .line 298
    iput v8, v2, La1/i;->i:I

    .line 299
    .line 300
    iget-boolean v8, v2, La1/i;->m:Z

    .line 301
    .line 302
    if-nez v8, :cond_f

    .line 303
    .line 304
    iget-object v8, v2, La1/i;->b:LF0/K;

    .line 305
    .line 306
    invoke-interface {v8, v4}, LF0/K;->c(La0/p;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v1, v2, La1/i;->m:Z

    .line 310
    .line 311
    :cond_f
    iget-object v4, v2, La1/i;->j:LZ1/l;

    .line 312
    .line 313
    iget-object v4, v4, LZ1/l;->m:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v4, LZ0/b;

    .line 316
    .line 317
    if-eqz v4, :cond_10

    .line 318
    .line 319
    iput-object v4, v2, La1/i;->d:La1/g;

    .line 320
    .line 321
    :goto_5
    move v3, v14

    .line 322
    move-object/from16 v19, v15

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_10
    move-object/from16 v4, p1

    .line 326
    .line 327
    check-cast v4, LF0/m;

    .line 328
    .line 329
    iget-wide v10, v4, LF0/m;->n:J

    .line 330
    .line 331
    cmp-long v4, v10, v6

    .line 332
    .line 333
    if-nez v4, :cond_11

    .line 334
    .line 335
    new-instance v4, La0/z;

    .line 336
    .line 337
    invoke-direct {v4, v1}, La0/z;-><init>(I)V

    .line 338
    .line 339
    .line 340
    iput-object v4, v2, La1/i;->d:La1/g;

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_11
    iget-object v4, v5, La1/e;->o:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v4, La1/f;

    .line 346
    .line 347
    iget v5, v4, La1/f;->a:I

    .line 348
    .line 349
    and-int/lit8 v5, v5, 0x4

    .line 350
    .line 351
    if-eqz v5, :cond_12

    .line 352
    .line 353
    move/from16 v16, v1

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_12
    move/from16 v16, v3

    .line 357
    .line 358
    :goto_6
    new-instance v1, La1/b;

    .line 359
    .line 360
    iget-wide v8, v2, La1/i;->f:J

    .line 361
    .line 362
    iget v5, v4, La1/f;->d:I

    .line 363
    .line 364
    iget v6, v4, La1/f;->e:I

    .line 365
    .line 366
    add-int/2addr v5, v6

    .line 367
    int-to-long v12, v5

    .line 368
    iget-wide v4, v4, La1/f;->b:J

    .line 369
    .line 370
    move-object v6, v1

    .line 371
    move-object v7, v2

    .line 372
    move v3, v14

    .line 373
    move-object/from16 v19, v15

    .line 374
    .line 375
    move-wide v14, v4

    .line 376
    invoke-direct/range {v6 .. v16}, La1/b;-><init>(La1/i;JJJJZ)V

    .line 377
    .line 378
    .line 379
    iput-object v1, v2, La1/i;->d:La1/g;

    .line 380
    .line 381
    :goto_7
    iput v3, v2, La1/i;->h:I

    .line 382
    .line 383
    move-object/from16 v10, v19

    .line 384
    .line 385
    iget-object v1, v10, Ld0/p;->a:[B

    .line 386
    .line 387
    array-length v2, v1

    .line 388
    const v3, 0xfe01

    .line 389
    .line 390
    .line 391
    if-ne v2, v3, :cond_13

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_13
    iget v2, v10, Ld0/p;->c:I

    .line 395
    .line 396
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget v2, v10, Ld0/p;->c:I

    .line 405
    .line 406
    invoke-virtual {v10, v2, v1}, Ld0/p;->F(I[B)V

    .line 407
    .line 408
    .line 409
    :goto_8
    const/4 v3, 0x0

    .line 410
    :goto_9
    return v3
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
    :try_start_0
    check-cast p1, LF0/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La1/d;->a(LF0/m;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    const/4 p1, 0x0

    .line 9
    return p1
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
    .locals 0

    .line 1
    iput-object p1, p0, La1/d;->a:LF0/s;

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
