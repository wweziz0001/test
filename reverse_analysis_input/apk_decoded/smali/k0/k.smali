.class public final Lk0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/i;


# instance fields
.field public final a:LB0/s;

.field public final b:LZ1/i;

.field public final c:[I

.field public final d:I

.field public final e:Lf0/h;

.field public final f:J

.field public final g:I

.field public final h:Lk0/n;

.field public final i:[Lk0/i;

.field public j:LA0/w;

.field public k:Ll0/c;

.field public l:I

.field public m:Lx0/b;

.field public n:Z


# direct methods
.method public constructor <init>(La0/m;LB0/s;Ll0/c;LZ1/i;I[ILA0/w;ILf0/h;JIZLjava/util/ArrayList;Lk0/n;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p7

    move/from16 v6, p8

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v7, p2

    .line 2
    iput-object v7, v0, Lk0/k;->a:LB0/s;

    .line 3
    iput-object v2, v0, Lk0/k;->k:Ll0/c;

    .line 4
    iput-object v3, v0, Lk0/k;->b:LZ1/i;

    move-object/from16 v7, p6

    .line 5
    iput-object v7, v0, Lk0/k;->c:[I

    .line 6
    iput-object v5, v0, Lk0/k;->j:LA0/w;

    .line 7
    iput v6, v0, Lk0/k;->d:I

    move-object/from16 v7, p9

    .line 8
    iput-object v7, v0, Lk0/k;->e:Lf0/h;

    .line 9
    iput v4, v0, Lk0/k;->l:I

    move-wide/from16 v7, p10

    .line 10
    iput-wide v7, v0, Lk0/k;->f:J

    move/from16 v7, p12

    .line 11
    iput v7, v0, Lk0/k;->g:I

    move-object/from16 v14, p15

    .line 12
    iput-object v14, v0, Lk0/k;->h:Lk0/n;

    .line 13
    invoke-virtual {v2, v4}, Ll0/c;->d(I)J

    move-result-wide v24

    .line 14
    invoke-virtual/range {p0 .. p0}, Lk0/k;->h()Ljava/util/ArrayList;

    move-result-object v2

    .line 15
    invoke-interface/range {p7 .. p7}, LA0/w;->length()I

    move-result v4

    new-array v4, v4, [Lk0/i;

    iput-object v4, v0, Lk0/k;->i:[Lk0/i;

    const/4 v4, 0x0

    move v15, v4

    .line 16
    :goto_0
    iget-object v7, v0, Lk0/k;->i:[Lk0/i;

    array-length v7, v7

    if-ge v15, v7, :cond_b

    .line 17
    invoke-interface {v5, v15}, LA0/w;->k(I)I

    move-result v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Ll0/m;

    .line 18
    iget-object v7, v13, Ll0/m;->m:Lm2/I;

    invoke-virtual {v3, v7}, LZ1/i;->C(Ljava/util/List;)Ll0/b;

    move-result-object v7

    .line 19
    iget-object v12, v0, Lk0/k;->i:[Lk0/i;

    new-instance v26, Lk0/i;

    if-eqz v7, :cond_0

    :goto_1
    move-object/from16 v19, v7

    goto :goto_2

    .line 20
    :cond_0
    iget-object v7, v13, Ll0/m;->m:Lm2/I;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll0/b;

    goto :goto_1

    :goto_2
    iget-object v11, v13, Ll0/m;->l:La0/p;

    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iget-object v7, v11, La0/p;->m:Ljava/lang/String;

    .line 23
    invoke-static {v7}, La0/G;->k(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 24
    iget-boolean v7, v1, La0/m;->a:Z

    if-nez v7, :cond_1

    const/4 v7, 0x0

    move-object/from16 v20, v7

    move-object/from16 v27, v12

    move-object/from16 v18, v13

    goto/16 :goto_8

    .line 25
    :cond_1
    new-instance v7, Lc1/h;

    iget-object v8, v1, La0/m;->b:Ljava/lang/Object;

    check-cast v8, La0/z;

    .line 26
    invoke-virtual {v8, v11}, La0/z;->a(La0/p;)Lc1/l;

    move-result-object v8

    invoke-direct {v7, v8, v11}, Lc1/h;-><init>(Lc1/l;La0/p;)V

    :goto_3
    move-object v4, v11

    move-object/from16 v27, v12

    move-object/from16 v18, v13

    goto/16 :goto_7

    :cond_2
    const/4 v8, 0x1

    if-nez v7, :cond_3

    goto :goto_4

    .line 27
    :cond_3
    const-string v9, "video/webm"

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "audio/webm"

    .line 28
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "application/webm"

    .line 29
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "video/x-matroska"

    .line 30
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "audio/x-matroska"

    .line 31
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "application/x-matroska"

    .line 32
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    :cond_4
    move-object v4, v11

    move-object/from16 v27, v12

    move-object/from16 v18, v13

    goto :goto_6

    .line 33
    :cond_5
    :goto_4
    const-string v9, "image/jpeg"

    invoke-static {v7, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 34
    new-instance v7, LJ0/a;

    invoke-direct {v7, v8}, LJ0/a;-><init>(I)V

    goto :goto_3

    .line 35
    :cond_6
    const-string v8, "image/png"

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 36
    new-instance v7, LJ0/a;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, LJ0/a;-><init>(IB)V

    goto :goto_3

    :cond_7
    if-eqz p13, :cond_8

    const/4 v7, 0x4

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    .line 37
    :goto_5
    iget-boolean v8, v1, La0/m;->a:Z

    if-nez v8, :cond_9

    or-int/lit8 v7, v7, 0x20

    :cond_9
    move v9, v7

    .line 38
    new-instance v16, LZ0/m;

    iget-object v7, v1, La0/m;->b:Ljava/lang/Object;

    move-object v8, v7

    check-cast v8, La0/z;

    const/4 v10, 0x0

    const/16 v17, 0x0

    move-object/from16 v7, v16

    move-object v4, v11

    move-object/from16 v11, v17

    move-object/from16 v27, v12

    move-object/from16 v12, p14

    move-object/from16 v18, v13

    move-object/from16 v13, p15

    invoke-direct/range {v7 .. v13}, LZ0/m;-><init>(Lc1/j;ILd0/u;LZ0/t;Ljava/util/List;Lk0/n;)V

    goto :goto_7

    .line 39
    :goto_6
    iget-boolean v7, v1, La0/m;->a:Z

    if-nez v7, :cond_a

    const/4 v8, 0x3

    .line 40
    :cond_a
    new-instance v7, LX0/d;

    iget-object v9, v1, La0/m;->b:Ljava/lang/Object;

    check-cast v9, La0/z;

    invoke-direct {v7, v9, v8}, LX0/d;-><init>(Lc1/j;I)V

    .line 41
    :goto_7
    new-instance v8, Ly0/d;

    invoke-direct {v8, v7, v6, v4}, Ly0/d;-><init>(LF0/q;ILa0/p;)V

    move-object/from16 v20, v8

    :goto_8
    const-wide/16 v21, 0x0

    .line 42
    invoke-virtual/range {v18 .. v18}, Ll0/m;->d()Lk0/h;

    move-result-object v23

    move v4, v15

    move-object/from16 v15, v26

    move-wide/from16 v16, v24

    invoke-direct/range {v15 .. v23}, Lk0/i;-><init>(JLl0/m;Ll0/b;Ly0/d;JLk0/h;)V

    aput-object v26, v27, v4

    add-int/lit8 v15, v4, 0x1

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_b
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/k;->m:Lx0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk0/k;->a:LB0/s;

    .line 6
    .line 7
    invoke-interface {v0}, LB0/s;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
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

.method public final b(JLh0/t0;)J
    .locals 18

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, Lk0/k;->i:[Lk0/i;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, Lk0/i;->d:Lk0/h;

    .line 14
    .line 15
    if-eqz v6, :cond_3

    .line 16
    .line 17
    invoke-virtual {v5}, Lk0/i;->d()J

    .line 18
    .line 19
    .line 20
    move-result-wide v8

    .line 21
    const-wide/16 v10, 0x0

    .line 22
    .line 23
    cmp-long v6, v8, v10

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget-object v0, v5, Lk0/i;->d:Lk0/h;

    .line 29
    .line 30
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-wide v3, v5, Lk0/i;->e:J

    .line 34
    .line 35
    invoke-interface {v0, v1, v2, v3, v4}, Lk0/h;->c(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iget-wide v10, v5, Lk0/i;->f:J

    .line 40
    .line 41
    add-long/2addr v3, v10

    .line 42
    invoke-virtual {v5, v3, v4}, Lk0/i;->f(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v12

    .line 46
    cmp-long v6, v12, v1

    .line 47
    .line 48
    if-gez v6, :cond_2

    .line 49
    .line 50
    const-wide/16 v14, -0x1

    .line 51
    .line 52
    cmp-long v6, v8, v14

    .line 53
    .line 54
    const-wide/16 v14, 0x1

    .line 55
    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Lk0/h;->n()J

    .line 62
    .line 63
    .line 64
    move-result-wide v16

    .line 65
    add-long v16, v16, v10

    .line 66
    .line 67
    add-long v16, v16, v8

    .line 68
    .line 69
    sub-long v16, v16, v14

    .line 70
    .line 71
    cmp-long v0, v3, v16

    .line 72
    .line 73
    if-gez v0, :cond_2

    .line 74
    .line 75
    :cond_1
    add-long/2addr v3, v14

    .line 76
    invoke-virtual {v5, v3, v4}, Lk0/i;->f(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    move-wide v5, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move-wide v5, v12

    .line 83
    :goto_1
    move-object/from16 v0, p3

    .line 84
    .line 85
    move-wide/from16 v1, p1

    .line 86
    .line 87
    move-wide v3, v12

    .line 88
    invoke-virtual/range {v0 .. v6}, Lh0/t0;->a(JJJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    return-wide v0

    .line 93
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    return-wide v1
.end method

.method public final c(JLy0/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/k;->m:Lx0/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Lk0/k;->j:LA0/w;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, LA0/w;->i(JLy0/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public final d(Ly0/e;ZLA/j;LA0/b;)Z
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    iget-object p2, p0, Lk0/k;->h:Lk0/n;

    .line 7
    .line 8
    if-eqz p2, :cond_5

    .line 9
    .line 10
    iget-wide v2, p2, Lk0/n;->d:J

    .line 11
    .line 12
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    iget-wide v4, p1, Ly0/e;->r:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-gez v2, :cond_1

    .line 26
    .line 27
    move v2, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v1

    .line 30
    :goto_0
    iget-object p2, p2, Lk0/n;->e:Lk0/o;

    .line 31
    .line 32
    iget-object v3, p2, Lk0/o;->q:Ll0/c;

    .line 33
    .line 34
    iget-boolean v3, v3, Ll0/c;->d:Z

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-boolean v3, p2, Lk0/o;->s:Z

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    if-eqz v2, :cond_5

    .line 45
    .line 46
    iget-boolean p1, p2, Lk0/o;->r:Z

    .line 47
    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    iput-boolean v0, p2, Lk0/o;->s:Z

    .line 52
    .line 53
    iput-boolean v1, p2, Lk0/o;->r:Z

    .line 54
    .line 55
    iget-object p1, p2, Lk0/o;->m:Lk0/d;

    .line 56
    .line 57
    iget-object p1, p1, Lk0/d;->m:Lk0/g;

    .line 58
    .line 59
    iget-object p2, p1, Lk0/g;->O:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object p3, p1, Lk0/g;->H:Lk0/c;

    .line 62
    .line 63
    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lk0/g;->B()V

    .line 67
    .line 68
    .line 69
    :goto_1
    return v0

    .line 70
    :cond_5
    :goto_2
    iget-object p2, p0, Lk0/k;->k:Ll0/c;

    .line 71
    .line 72
    iget-boolean p2, p2, Ll0/c;->d:Z

    .line 73
    .line 74
    iget-object v2, p0, Lk0/k;->i:[Lk0/i;

    .line 75
    .line 76
    if-nez p2, :cond_6

    .line 77
    .line 78
    instance-of p2, p1, Ly0/l;

    .line 79
    .line 80
    if-eqz p2, :cond_6

    .line 81
    .line 82
    iget-object p2, p3, LA/j;->m:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Ljava/io/IOException;

    .line 85
    .line 86
    instance-of v3, p2, Lf0/v;

    .line 87
    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    check-cast p2, Lf0/v;

    .line 91
    .line 92
    iget p2, p2, Lf0/v;->o:I

    .line 93
    .line 94
    const/16 v3, 0x194

    .line 95
    .line 96
    if-ne p2, v3, :cond_6

    .line 97
    .line 98
    iget-object p2, p0, Lk0/k;->j:LA0/w;

    .line 99
    .line 100
    iget-object v3, p1, Ly0/e;->o:La0/p;

    .line 101
    .line 102
    invoke-interface {p2, v3}, LA0/w;->p(La0/p;)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    aget-object p2, v2, p2

    .line 107
    .line 108
    invoke-virtual {p2}, Lk0/i;->d()J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    const-wide/16 v5, -0x1

    .line 113
    .line 114
    cmp-long v5, v3, v5

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    const-wide/16 v5, 0x0

    .line 119
    .line 120
    cmp-long v5, v3, v5

    .line 121
    .line 122
    if-eqz v5, :cond_6

    .line 123
    .line 124
    iget-object v5, p2, Lk0/i;->d:Lk0/h;

    .line 125
    .line 126
    invoke-static {v5}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v5}, Lk0/h;->n()J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    iget-wide v7, p2, Lk0/i;->f:J

    .line 134
    .line 135
    add-long/2addr v5, v7

    .line 136
    add-long/2addr v5, v3

    .line 137
    const-wide/16 v3, 0x1

    .line 138
    .line 139
    sub-long/2addr v5, v3

    .line 140
    move-object p2, p1

    .line 141
    check-cast p2, Ly0/l;

    .line 142
    .line 143
    invoke-virtual {p2}, Ly0/l;->a()J

    .line 144
    .line 145
    .line 146
    move-result-wide v3

    .line 147
    cmp-long p2, v3, v5

    .line 148
    .line 149
    if-lez p2, :cond_6

    .line 150
    .line 151
    iput-boolean v0, p0, Lk0/k;->n:Z

    .line 152
    .line 153
    return v0

    .line 154
    :cond_6
    iget-object p2, p0, Lk0/k;->j:LA0/w;

    .line 155
    .line 156
    iget-object v3, p1, Ly0/e;->o:La0/p;

    .line 157
    .line 158
    invoke-interface {p2, v3}, LA0/w;->p(La0/p;)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    aget-object p2, v2, p2

    .line 163
    .line 164
    iget-object v2, p2, Lk0/i;->b:Ll0/m;

    .line 165
    .line 166
    iget-object v2, v2, Ll0/m;->m:Lm2/I;

    .line 167
    .line 168
    iget-object v3, p0, Lk0/k;->b:LZ1/i;

    .line 169
    .line 170
    invoke-virtual {v3, v2}, LZ1/i;->C(Ljava/util/List;)Ll0/b;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iget-object v4, p2, Lk0/i;->c:Ll0/b;

    .line 175
    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    invoke-virtual {v4, v2}, Ll0/b;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_7

    .line 183
    .line 184
    return v0

    .line 185
    :cond_7
    iget-object v2, p0, Lk0/k;->j:LA0/w;

    .line 186
    .line 187
    iget-object p2, p2, Lk0/i;->b:Ll0/m;

    .line 188
    .line 189
    iget-object p2, p2, Ll0/m;->m:Lm2/I;

    .line 190
    .line 191
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    invoke-interface {v2}, LA0/w;->length()I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    move v8, v1

    .line 200
    move v9, v8

    .line 201
    :goto_3
    if-ge v8, v7, :cond_9

    .line 202
    .line 203
    invoke-interface {v2, v5, v6, v8}, LA0/w;->o(JI)Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    if-eqz v10, :cond_8

    .line 208
    .line 209
    add-int/2addr v9, v0

    .line 210
    :cond_8
    add-int/2addr v8, v0

    .line 211
    goto :goto_3

    .line 212
    :cond_9
    new-instance v2, Ljava/util/HashSet;

    .line 213
    .line 214
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 215
    .line 216
    .line 217
    move v5, v1

    .line 218
    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-ge v5, v6, :cond_a

    .line 223
    .line 224
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    check-cast v6, Ll0/b;

    .line 229
    .line 230
    iget v6, v6, Ll0/b;->c:I

    .line 231
    .line 232
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    add-int/2addr v5, v0

    .line 240
    goto :goto_4

    .line 241
    :cond_a
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    new-instance v5, LB0/j;

    .line 246
    .line 247
    new-instance v6, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, p2}, LZ1/i;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    move v8, v1

    .line 257
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-ge v8, v10, :cond_b

    .line 262
    .line 263
    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    check-cast v10, Ll0/b;

    .line 268
    .line 269
    iget v10, v10, Ll0/b;->c:I

    .line 270
    .line 271
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    add-int/2addr v8, v0

    .line 279
    goto :goto_5

    .line 280
    :cond_b
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    sub-int p2, v2, p2

    .line 285
    .line 286
    invoke-direct {v5, v2, p2, v7, v9}, LB0/j;-><init>(IIII)V

    .line 287
    .line 288
    .line 289
    const/4 p2, 0x2

    .line 290
    invoke-virtual {v5, p2}, LB0/j;->a(I)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-nez v2, :cond_c

    .line 295
    .line 296
    invoke-virtual {v5, v0}, LB0/j;->a(I)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-nez v2, :cond_c

    .line 301
    .line 302
    return v1

    .line 303
    :cond_c
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v5, p3}, LA0/b;->m(LB0/j;LA/j;)LB0/k;

    .line 307
    .line 308
    .line 309
    move-result-object p3

    .line 310
    if-eqz p3, :cond_13

    .line 311
    .line 312
    iget p4, p3, LB0/k;->a:I

    .line 313
    .line 314
    invoke-virtual {v5, p4}, LB0/j;->a(I)Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-nez v2, :cond_d

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_d
    iget-wide v5, p3, LB0/k;->b:J

    .line 322
    .line 323
    if-ne p4, p2, :cond_e

    .line 324
    .line 325
    iget-object p2, p0, Lk0/k;->j:LA0/w;

    .line 326
    .line 327
    iget-object p1, p1, Ly0/e;->o:La0/p;

    .line 328
    .line 329
    invoke-interface {p2, p1}, LA0/w;->p(La0/p;)I

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    invoke-interface {p2, v5, v6, p1}, LA0/w;->q(JI)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    goto :goto_7

    .line 338
    :cond_e
    if-ne p4, v0, :cond_11

    .line 339
    .line 340
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 341
    .line 342
    .line 343
    move-result-wide p1

    .line 344
    add-long/2addr p1, v5

    .line 345
    iget-object p3, v4, Ll0/b;->b:Ljava/lang/String;

    .line 346
    .line 347
    iget-object p4, v3, LZ1/i;->l:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p4, Ljava/util/HashMap;

    .line 350
    .line 351
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_f

    .line 356
    .line 357
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Ljava/lang/Long;

    .line 362
    .line 363
    sget v2, Ld0/w;->a:I

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v1

    .line 369
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 370
    .line 371
    .line 372
    move-result-wide v1

    .line 373
    goto :goto_6

    .line 374
    :cond_f
    move-wide v1, p1

    .line 375
    :goto_6
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {p4, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    const/high16 p3, -0x80000000

    .line 383
    .line 384
    iget p4, v4, Ll0/b;->c:I

    .line 385
    .line 386
    if-eq p4, p3, :cond_12

    .line 387
    .line 388
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object p3

    .line 392
    iget-object p4, v3, LZ1/i;->m:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast p4, Ljava/util/HashMap;

    .line 395
    .line 396
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_10

    .line 401
    .line 402
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    check-cast v1, Ljava/lang/Long;

    .line 407
    .line 408
    sget v2, Ld0/w;->a:I

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 411
    .line 412
    .line 413
    move-result-wide v1

    .line 414
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 415
    .line 416
    .line 417
    move-result-wide p1

    .line 418
    :cond_10
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-virtual {p4, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_11
    move v0, v1

    .line 427
    :cond_12
    :goto_7
    return v0

    .line 428
    :cond_13
    :goto_8
    return v1
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

.method public final e(Lh0/T;JLjava/util/List;La0/m;)V
    .locals 60

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v4, v0, Lk0/k;->m:Lx0/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    move-object/from16 v4, p1

    .line 13
    .line 14
    iget-wide v5, v4, Lh0/T;->a:J

    .line 15
    .line 16
    sub-long v7, v1, v5

    .line 17
    .line 18
    iget-object v4, v0, Lk0/k;->k:Ll0/c;

    .line 19
    .line 20
    iget-wide v9, v4, Ll0/c;->a:J

    .line 21
    .line 22
    invoke-static {v9, v10}, Ld0/w;->M(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v9

    .line 26
    iget-object v4, v0, Lk0/k;->k:Ll0/c;

    .line 27
    .line 28
    iget v11, v0, Lk0/k;->l:I

    .line 29
    .line 30
    invoke-virtual {v4, v11}, Ll0/c;->b(I)Ll0/h;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-wide v11, v4, Ll0/h;->b:J

    .line 35
    .line 36
    invoke-static {v11, v12}, Ld0/w;->M(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v11

    .line 40
    add-long/2addr v11, v9

    .line 41
    add-long/2addr v11, v1

    .line 42
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iget-object v4, v0, Lk0/k;->h:Lk0/n;

    .line 48
    .line 49
    if-eqz v4, :cond_8

    .line 50
    .line 51
    iget-object v4, v4, Lk0/n;->e:Lk0/o;

    .line 52
    .line 53
    iget-object v10, v4, Lk0/o;->q:Ll0/c;

    .line 54
    .line 55
    iget-boolean v13, v10, Ll0/c;->d:Z

    .line 56
    .line 57
    if-nez v13, :cond_1

    .line 58
    .line 59
    move-wide/from16 v17, v7

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-boolean v13, v4, Lk0/o;->s:Z

    .line 64
    .line 65
    if-eqz v13, :cond_2

    .line 66
    .line 67
    move-wide/from16 v17, v7

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v13, v4, Lk0/o;->p:Ljava/util/TreeMap;

    .line 72
    .line 73
    iget-wide v9, v10, Ll0/c;->h:J

    .line 74
    .line 75
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v13, v9}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    iget-object v10, v4, Lk0/o;->m:Lk0/d;

    .line 84
    .line 85
    if-eqz v9, :cond_5

    .line 86
    .line 87
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    check-cast v13, Ljava/lang/Long;

    .line 92
    .line 93
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v17

    .line 97
    cmp-long v11, v17, v11

    .line 98
    .line 99
    if-gez v11, :cond_5

    .line 100
    .line 101
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    check-cast v9, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    iget-object v9, v10, Lk0/d;->m:Lk0/g;

    .line 112
    .line 113
    move-wide/from16 v17, v7

    .line 114
    .line 115
    iget-wide v7, v9, Lk0/g;->Y:J

    .line 116
    .line 117
    cmp-long v13, v7, v14

    .line 118
    .line 119
    if-eqz v13, :cond_3

    .line 120
    .line 121
    cmp-long v7, v7, v11

    .line 122
    .line 123
    if-gez v7, :cond_4

    .line 124
    .line 125
    :cond_3
    iput-wide v11, v9, Lk0/g;->Y:J

    .line 126
    .line 127
    :cond_4
    const/4 v7, 0x1

    .line 128
    goto :goto_0

    .line 129
    :cond_5
    move-wide/from16 v17, v7

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    :goto_0
    if-eqz v7, :cond_7

    .line 133
    .line 134
    iget-boolean v8, v4, Lk0/o;->r:Z

    .line 135
    .line 136
    if-nez v8, :cond_6

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    const/4 v8, 0x1

    .line 140
    iput-boolean v8, v4, Lk0/o;->s:Z

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    iput-boolean v8, v4, Lk0/o;->r:Z

    .line 144
    .line 145
    iget-object v4, v10, Lk0/d;->m:Lk0/g;

    .line 146
    .line 147
    iget-object v8, v4, Lk0/g;->O:Landroid/os/Handler;

    .line 148
    .line 149
    iget-object v9, v4, Lk0/g;->H:Lk0/c;

    .line 150
    .line 151
    invoke-virtual {v8, v9}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Lk0/g;->B()V

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_1
    if-eqz v7, :cond_9

    .line 158
    .line 159
    return-void

    .line 160
    :cond_8
    move-wide/from16 v17, v7

    .line 161
    .line 162
    :cond_9
    iget-wide v7, v0, Lk0/k;->f:J

    .line 163
    .line 164
    invoke-static {v7, v8}, Ld0/w;->y(J)J

    .line 165
    .line 166
    .line 167
    move-result-wide v7

    .line 168
    invoke-static {v7, v8}, Ld0/w;->M(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    iget-object v4, v0, Lk0/k;->k:Ll0/c;

    .line 173
    .line 174
    iget-wide v7, v4, Ll0/c;->a:J

    .line 175
    .line 176
    cmp-long v9, v7, v14

    .line 177
    .line 178
    if-nez v9, :cond_a

    .line 179
    .line 180
    move-wide v9, v14

    .line 181
    goto :goto_2

    .line 182
    :cond_a
    iget v9, v0, Lk0/k;->l:I

    .line 183
    .line 184
    invoke-virtual {v4, v9}, Ll0/c;->b(I)Ll0/h;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    iget-wide v9, v4, Ll0/h;->b:J

    .line 189
    .line 190
    add-long/2addr v7, v9

    .line 191
    invoke-static {v7, v8}, Ld0/w;->M(J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v7

    .line 195
    sub-long v7, v12, v7

    .line 196
    .line 197
    move-wide v9, v7

    .line 198
    :goto_2
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    if-eqz v4, :cond_b

    .line 205
    .line 206
    move-object/from16 v7, p4

    .line 207
    .line 208
    move-object/from16 v16, v19

    .line 209
    .line 210
    const/4 v11, 0x1

    .line 211
    goto :goto_3

    .line 212
    :cond_b
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    const/4 v11, 0x1

    .line 217
    sub-int/2addr v4, v11

    .line 218
    move-object/from16 v7, p4

    .line 219
    .line 220
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Ly0/l;

    .line 225
    .line 226
    move-object/from16 v16, v4

    .line 227
    .line 228
    :goto_3
    iget-object v4, v0, Lk0/k;->j:LA0/w;

    .line 229
    .line 230
    invoke-interface {v4}, LA0/w;->length()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    new-array v8, v4, [Ly0/m;

    .line 235
    .line 236
    const/4 v11, 0x0

    .line 237
    :goto_4
    iget-object v14, v0, Lk0/k;->i:[Lk0/i;

    .line 238
    .line 239
    if-ge v11, v4, :cond_f

    .line 240
    .line 241
    aget-object v14, v14, v11

    .line 242
    .line 243
    iget-object v15, v14, Lk0/i;->d:Lk0/h;

    .line 244
    .line 245
    sget-object v23, Ly0/m;->k:Lp1/b;

    .line 246
    .line 247
    if-nez v15, :cond_c

    .line 248
    .line 249
    aput-object v23, v8, v11

    .line 250
    .line 251
    move-wide/from16 v34, v9

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_c
    invoke-virtual {v14, v12, v13}, Lk0/i;->b(J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v30

    .line 258
    invoke-virtual {v14, v12, v13}, Lk0/i;->c(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v32

    .line 262
    if-eqz v16, :cond_d

    .line 263
    .line 264
    invoke-virtual/range {v16 .. v16}, Ly0/l;->a()J

    .line 265
    .line 266
    .line 267
    move-result-wide v14

    .line 268
    move-wide/from16 v34, v9

    .line 269
    .line 270
    move-wide/from16 v26, v14

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_d
    iget-object v15, v14, Lk0/i;->d:Lk0/h;

    .line 274
    .line 275
    invoke-static {v15}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    move-wide/from16 v34, v9

    .line 279
    .line 280
    iget-wide v9, v14, Lk0/i;->e:J

    .line 281
    .line 282
    invoke-interface {v15, v1, v2, v9, v10}, Lk0/h;->c(JJ)J

    .line 283
    .line 284
    .line 285
    move-result-wide v9

    .line 286
    iget-wide v14, v14, Lk0/i;->f:J

    .line 287
    .line 288
    add-long v24, v9, v14

    .line 289
    .line 290
    move-wide/from16 v26, v30

    .line 291
    .line 292
    move-wide/from16 v28, v32

    .line 293
    .line 294
    invoke-static/range {v24 .. v29}, Ld0/w;->j(JJJ)J

    .line 295
    .line 296
    .line 297
    move-result-wide v9

    .line 298
    move-wide/from16 v26, v9

    .line 299
    .line 300
    :goto_5
    cmp-long v9, v26, v30

    .line 301
    .line 302
    if-gez v9, :cond_e

    .line 303
    .line 304
    aput-object v23, v8, v11

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_e
    invoke-virtual {v0, v11}, Lk0/k;->i(I)Lk0/i;

    .line 308
    .line 309
    .line 310
    move-result-object v25

    .line 311
    new-instance v9, Lk0/j;

    .line 312
    .line 313
    move-object/from16 v24, v9

    .line 314
    .line 315
    move-wide/from16 v28, v32

    .line 316
    .line 317
    invoke-direct/range {v24 .. v29}, Lk0/j;-><init>(Lk0/i;JJ)V

    .line 318
    .line 319
    .line 320
    aput-object v9, v8, v11

    .line 321
    .line 322
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 323
    .line 324
    move-wide/from16 v9, v34

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_f
    move-wide/from16 v34, v9

    .line 328
    .line 329
    iget-object v4, v0, Lk0/k;->k:Ll0/c;

    .line 330
    .line 331
    iget-boolean v4, v4, Ll0/c;->d:Z

    .line 332
    .line 333
    const-wide/16 v9, 0x0

    .line 334
    .line 335
    if-eqz v4, :cond_10

    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    aget-object v11, v14, v4

    .line 339
    .line 340
    invoke-virtual {v11}, Lk0/i;->d()J

    .line 341
    .line 342
    .line 343
    move-result-wide v23

    .line 344
    cmp-long v11, v23, v9

    .line 345
    .line 346
    if-nez v11, :cond_11

    .line 347
    .line 348
    :cond_10
    move-object v11, v8

    .line 349
    goto :goto_8

    .line 350
    :cond_11
    aget-object v11, v14, v4

    .line 351
    .line 352
    invoke-virtual {v11, v12, v13}, Lk0/i;->c(J)J

    .line 353
    .line 354
    .line 355
    move-result-wide v9

    .line 356
    aget-object v11, v14, v4

    .line 357
    .line 358
    invoke-virtual {v11, v9, v10}, Lk0/i;->e(J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v9

    .line 362
    iget-object v4, v0, Lk0/k;->k:Ll0/c;

    .line 363
    .line 364
    iget-wide v14, v4, Ll0/c;->a:J

    .line 365
    .line 366
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    cmp-long v11, v14, v21

    .line 372
    .line 373
    if-nez v11, :cond_12

    .line 374
    .line 375
    move-object v11, v8

    .line 376
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_12
    iget v11, v0, Lk0/k;->l:I

    .line 383
    .line 384
    invoke-virtual {v4, v11}, Ll0/c;->b(I)Ll0/h;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    move-object v11, v8

    .line 389
    iget-wide v7, v4, Ll0/h;->b:J

    .line 390
    .line 391
    add-long/2addr v14, v7

    .line 392
    invoke-static {v14, v15}, Ld0/w;->M(J)J

    .line 393
    .line 394
    .line 395
    move-result-wide v7

    .line 396
    sub-long v7, v12, v7

    .line 397
    .line 398
    :goto_7
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 399
    .line 400
    .line 401
    move-result-wide v7

    .line 402
    sub-long/2addr v7, v5

    .line 403
    const-wide/16 v9, 0x0

    .line 404
    .line 405
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 406
    .line 407
    .line 408
    move-result-wide v7

    .line 409
    move-wide v14, v7

    .line 410
    goto :goto_9

    .line 411
    :goto_8
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    :goto_9
    iget-object v4, v0, Lk0/k;->j:LA0/w;

    .line 417
    .line 418
    move-object/from16 v23, v11

    .line 419
    .line 420
    move-wide/from16 v7, v17

    .line 421
    .line 422
    move-wide/from16 v17, v9

    .line 423
    .line 424
    move-wide/from16 v36, v34

    .line 425
    .line 426
    const/4 v11, 0x1

    .line 427
    move-wide v9, v14

    .line 428
    move v14, v11

    .line 429
    move-object/from16 v11, p4

    .line 430
    .line 431
    move-wide/from16 v38, v12

    .line 432
    .line 433
    move-object/from16 v12, v23

    .line 434
    .line 435
    invoke-interface/range {v4 .. v12}, LA0/w;->s(JJJLjava/util/List;[Ly0/m;)V

    .line 436
    .line 437
    .line 438
    iget-object v4, v0, Lk0/k;->j:LA0/w;

    .line 439
    .line 440
    invoke-interface {v4}, LA0/w;->f()I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v4}, Lk0/k;->i(I)Lk0/i;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    iget-object v5, v4, Lk0/i;->d:Lk0/h;

    .line 452
    .line 453
    iget-object v6, v4, Lk0/i;->c:Ll0/b;

    .line 454
    .line 455
    iget-object v7, v4, Lk0/i;->a:Ly0/d;

    .line 456
    .line 457
    iget-object v8, v4, Lk0/i;->b:Ll0/m;

    .line 458
    .line 459
    if-eqz v7, :cond_15

    .line 460
    .line 461
    iget-object v9, v7, Ly0/d;->t:[La0/p;

    .line 462
    .line 463
    if-nez v9, :cond_13

    .line 464
    .line 465
    iget-object v9, v8, Ll0/m;->p:Ll0/j;

    .line 466
    .line 467
    goto :goto_a

    .line 468
    :cond_13
    move-object/from16 v9, v19

    .line 469
    .line 470
    :goto_a
    if-nez v5, :cond_14

    .line 471
    .line 472
    invoke-virtual {v8}, Ll0/m;->e()Ll0/j;

    .line 473
    .line 474
    .line 475
    move-result-object v19

    .line 476
    :cond_14
    move-object/from16 v10, v19

    .line 477
    .line 478
    if-nez v9, :cond_16

    .line 479
    .line 480
    if-eqz v10, :cond_15

    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_15
    const/4 v10, 0x0

    .line 484
    goto :goto_d

    .line 485
    :cond_16
    :goto_b
    iget-object v1, v0, Lk0/k;->j:LA0/w;

    .line 486
    .line 487
    invoke-interface {v1}, LA0/w;->d()La0/p;

    .line 488
    .line 489
    .line 490
    move-result-object v14

    .line 491
    iget-object v1, v0, Lk0/k;->j:LA0/w;

    .line 492
    .line 493
    invoke-interface {v1}, LA0/w;->e()I

    .line 494
    .line 495
    .line 496
    move-result v15

    .line 497
    iget-object v1, v0, Lk0/k;->j:LA0/w;

    .line 498
    .line 499
    invoke-interface {v1}, LA0/w;->l()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v16

    .line 503
    if-eqz v9, :cond_18

    .line 504
    .line 505
    iget-object v1, v6, Ll0/b;->a:Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v9, v10, v1}, Ll0/j;->a(Ll0/j;Ljava/lang/String;)Ll0/j;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    if-nez v1, :cond_17

    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_17
    move-object v9, v1

    .line 515
    goto :goto_c

    .line 516
    :cond_18
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-object v9, v10

    .line 520
    :goto_c
    iget-object v1, v6, Ll0/b;->a:Ljava/lang/String;

    .line 521
    .line 522
    const/4 v10, 0x0

    .line 523
    invoke-static {v8, v1, v9, v10}, LD1/b;->f(Ll0/m;Ljava/lang/String;Ll0/j;I)Lf0/l;

    .line 524
    .line 525
    .line 526
    move-result-object v13

    .line 527
    new-instance v1, Ly0/k;

    .line 528
    .line 529
    iget-object v2, v4, Lk0/i;->a:Ly0/d;

    .line 530
    .line 531
    iget-object v12, v0, Lk0/k;->e:Lf0/h;

    .line 532
    .line 533
    move-object v11, v1

    .line 534
    move-object/from16 v17, v2

    .line 535
    .line 536
    invoke-direct/range {v11 .. v17}, Ly0/k;-><init>(Lf0/h;Lf0/l;La0/p;ILjava/lang/Object;Ly0/d;)V

    .line 537
    .line 538
    .line 539
    iput-object v1, v3, La0/m;->b:Ljava/lang/Object;

    .line 540
    .line 541
    return-void

    .line 542
    :goto_d
    iget-object v9, v0, Lk0/k;->k:Ll0/c;

    .line 543
    .line 544
    iget-boolean v11, v9, Ll0/c;->d:Z

    .line 545
    .line 546
    if-eqz v11, :cond_19

    .line 547
    .line 548
    iget v11, v0, Lk0/k;->l:I

    .line 549
    .line 550
    iget-object v9, v9, Ll0/c;->m:Ljava/util/List;

    .line 551
    .line 552
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 553
    .line 554
    .line 555
    move-result v9

    .line 556
    sub-int/2addr v9, v14

    .line 557
    if-ne v11, v9, :cond_19

    .line 558
    .line 559
    move v9, v14

    .line 560
    goto :goto_e

    .line 561
    :cond_19
    move v9, v10

    .line 562
    :goto_e
    iget-wide v11, v4, Lk0/i;->e:J

    .line 563
    .line 564
    if-eqz v9, :cond_1b

    .line 565
    .line 566
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    cmp-long v13, v11, v19

    .line 572
    .line 573
    if-eqz v13, :cond_1a

    .line 574
    .line 575
    goto :goto_f

    .line 576
    :cond_1a
    move v13, v10

    .line 577
    goto :goto_10

    .line 578
    :cond_1b
    :goto_f
    move v13, v14

    .line 579
    :goto_10
    invoke-virtual {v4}, Lk0/i;->d()J

    .line 580
    .line 581
    .line 582
    move-result-wide v19

    .line 583
    cmp-long v15, v19, v17

    .line 584
    .line 585
    if-nez v15, :cond_1c

    .line 586
    .line 587
    iput-boolean v13, v3, La0/m;->a:Z

    .line 588
    .line 589
    return-void

    .line 590
    :cond_1c
    move-wide/from16 v14, v38

    .line 591
    .line 592
    invoke-virtual {v4, v14, v15}, Lk0/i;->b(J)J

    .line 593
    .line 594
    .line 595
    move-result-wide v17

    .line 596
    invoke-virtual {v4, v14, v15}, Lk0/i;->c(J)J

    .line 597
    .line 598
    .line 599
    move-result-wide v14

    .line 600
    if-eqz v9, :cond_1e

    .line 601
    .line 602
    invoke-virtual {v4, v14, v15}, Lk0/i;->e(J)J

    .line 603
    .line 604
    .line 605
    move-result-wide v23

    .line 606
    invoke-virtual {v4, v14, v15}, Lk0/i;->f(J)J

    .line 607
    .line 608
    .line 609
    move-result-wide v25

    .line 610
    sub-long v25, v23, v25

    .line 611
    .line 612
    add-long v25, v25, v23

    .line 613
    .line 614
    cmp-long v9, v25, v11

    .line 615
    .line 616
    if-ltz v9, :cond_1d

    .line 617
    .line 618
    const/4 v9, 0x1

    .line 619
    goto :goto_11

    .line 620
    :cond_1d
    move v9, v10

    .line 621
    :goto_11
    and-int/2addr v13, v9

    .line 622
    :cond_1e
    move-wide/from16 v29, v11

    .line 623
    .line 624
    iget-wide v10, v4, Lk0/i;->f:J

    .line 625
    .line 626
    if-eqz v16, :cond_1f

    .line 627
    .line 628
    invoke-virtual/range {v16 .. v16}, Ly0/l;->a()J

    .line 629
    .line 630
    .line 631
    move-result-wide v23

    .line 632
    move-object v12, v8

    .line 633
    move-wide/from16 v1, v23

    .line 634
    .line 635
    move-wide/from16 v8, v29

    .line 636
    .line 637
    goto :goto_12

    .line 638
    :cond_1f
    invoke-static {v5}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    move-object v12, v8

    .line 642
    move-wide/from16 v8, v29

    .line 643
    .line 644
    invoke-interface {v5, v1, v2, v8, v9}, Lk0/h;->c(JJ)J

    .line 645
    .line 646
    .line 647
    move-result-wide v23

    .line 648
    add-long v23, v23, v10

    .line 649
    .line 650
    move-wide/from16 v25, v17

    .line 651
    .line 652
    move-wide/from16 v27, v14

    .line 653
    .line 654
    invoke-static/range {v23 .. v28}, Ld0/w;->j(JJJ)J

    .line 655
    .line 656
    .line 657
    move-result-wide v23

    .line 658
    move-wide/from16 v1, v23

    .line 659
    .line 660
    :goto_12
    cmp-long v16, v1, v17

    .line 661
    .line 662
    if-gez v16, :cond_20

    .line 663
    .line 664
    new-instance v1, Lx0/b;

    .line 665
    .line 666
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 667
    .line 668
    .line 669
    iput-object v1, v0, Lk0/k;->m:Lx0/b;

    .line 670
    .line 671
    return-void

    .line 672
    :cond_20
    cmp-long v16, v1, v14

    .line 673
    .line 674
    if-gtz v16, :cond_2c

    .line 675
    .line 676
    move-object/from16 v17, v12

    .line 677
    .line 678
    iget-boolean v12, v0, Lk0/k;->n:Z

    .line 679
    .line 680
    if-eqz v12, :cond_21

    .line 681
    .line 682
    if-ltz v16, :cond_21

    .line 683
    .line 684
    goto/16 :goto_1b

    .line 685
    .line 686
    :cond_21
    if-eqz v13, :cond_22

    .line 687
    .line 688
    invoke-virtual {v4, v1, v2}, Lk0/i;->f(J)J

    .line 689
    .line 690
    .line 691
    move-result-wide v12

    .line 692
    cmp-long v12, v12, v8

    .line 693
    .line 694
    if-ltz v12, :cond_22

    .line 695
    .line 696
    const/4 v12, 0x1

    .line 697
    iput-boolean v12, v3, La0/m;->a:Z

    .line 698
    .line 699
    return-void

    .line 700
    :cond_22
    iget v12, v0, Lk0/k;->g:I

    .line 701
    .line 702
    int-to-long v12, v12

    .line 703
    sub-long/2addr v14, v1

    .line 704
    const-wide/16 v18, 0x1

    .line 705
    .line 706
    add-long v14, v14, v18

    .line 707
    .line 708
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 709
    .line 710
    .line 711
    move-result-wide v12

    .line 712
    long-to-int v12, v12

    .line 713
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    cmp-long v15, v8, v13

    .line 719
    .line 720
    if-eqz v15, :cond_23

    .line 721
    .line 722
    :goto_13
    const/4 v13, 0x1

    .line 723
    if-le v12, v13, :cond_23

    .line 724
    .line 725
    int-to-long v13, v12

    .line 726
    add-long/2addr v13, v1

    .line 727
    sub-long v13, v13, v18

    .line 728
    .line 729
    invoke-virtual {v4, v13, v14}, Lk0/i;->f(J)J

    .line 730
    .line 731
    .line 732
    move-result-wide v13

    .line 733
    cmp-long v13, v13, v8

    .line 734
    .line 735
    if-ltz v13, :cond_23

    .line 736
    .line 737
    add-int/lit8 v12, v12, -0x1

    .line 738
    .line 739
    goto :goto_13

    .line 740
    :cond_23
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 741
    .line 742
    .line 743
    move-result v13

    .line 744
    if-eqz v13, :cond_24

    .line 745
    .line 746
    move-wide/from16 v48, p2

    .line 747
    .line 748
    goto :goto_14

    .line 749
    :cond_24
    const-wide v48, -0x7fffffffffffffffL    # -4.9E-324

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    :goto_14
    iget-object v13, v0, Lk0/k;->j:LA0/w;

    .line 755
    .line 756
    invoke-interface {v13}, LA0/w;->d()La0/p;

    .line 757
    .line 758
    .line 759
    move-result-object v13

    .line 760
    iget-object v14, v0, Lk0/k;->j:LA0/w;

    .line 761
    .line 762
    invoke-interface {v14}, LA0/w;->e()I

    .line 763
    .line 764
    .line 765
    move-result v42

    .line 766
    iget-object v14, v0, Lk0/k;->j:LA0/w;

    .line 767
    .line 768
    invoke-interface {v14}, LA0/w;->l()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v43

    .line 772
    invoke-virtual {v4, v1, v2}, Lk0/i;->f(J)J

    .line 773
    .line 774
    .line 775
    move-result-wide v44

    .line 776
    invoke-static {v5}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    move-wide/from16 v29, v8

    .line 780
    .line 781
    sub-long v8, v1, v10

    .line 782
    .line 783
    invoke-interface {v5, v8, v9}, Lk0/h;->C(J)Ll0/j;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    iget-object v9, v0, Lk0/k;->e:Lf0/h;

    .line 788
    .line 789
    if-nez v7, :cond_26

    .line 790
    .line 791
    invoke-virtual {v4, v1, v2}, Lk0/i;->e(J)J

    .line 792
    .line 793
    .line 794
    move-result-wide v46

    .line 795
    move-wide/from16 v10, v36

    .line 796
    .line 797
    invoke-virtual {v4, v1, v2, v10, v11}, Lk0/i;->g(JJ)Z

    .line 798
    .line 799
    .line 800
    move-result v4

    .line 801
    if-eqz v4, :cond_25

    .line 802
    .line 803
    const/4 v14, 0x0

    .line 804
    goto :goto_15

    .line 805
    :cond_25
    const/16 v14, 0x8

    .line 806
    .line 807
    :goto_15
    iget-object v4, v6, Ll0/b;->a:Ljava/lang/String;

    .line 808
    .line 809
    move-object/from16 v7, v17

    .line 810
    .line 811
    invoke-static {v7, v4, v8, v14}, LD1/b;->f(Ll0/m;Ljava/lang/String;Ll0/j;I)Lf0/l;

    .line 812
    .line 813
    .line 814
    move-result-object v40

    .line 815
    new-instance v4, Ly0/n;

    .line 816
    .line 817
    iget v5, v0, Lk0/k;->d:I

    .line 818
    .line 819
    move-object/from16 v38, v4

    .line 820
    .line 821
    move-object/from16 v39, v9

    .line 822
    .line 823
    move-object/from16 v41, v13

    .line 824
    .line 825
    move-wide/from16 v48, v1

    .line 826
    .line 827
    move/from16 v50, v5

    .line 828
    .line 829
    move-object/from16 v51, v13

    .line 830
    .line 831
    invoke-direct/range {v38 .. v51}, Ly0/n;-><init>(Lf0/h;Lf0/l;La0/p;ILjava/lang/Object;JJJILa0/p;)V

    .line 832
    .line 833
    .line 834
    goto/16 :goto_1a

    .line 835
    .line 836
    :cond_26
    move-object/from16 v7, v17

    .line 837
    .line 838
    move-wide/from16 v58, v36

    .line 839
    .line 840
    const/4 v0, 0x1

    .line 841
    const/4 v14, 0x1

    .line 842
    :goto_16
    if-ge v14, v12, :cond_28

    .line 843
    .line 844
    move/from16 v16, v12

    .line 845
    .line 846
    move-object/from16 p3, v13

    .line 847
    .line 848
    int-to-long v12, v14

    .line 849
    add-long/2addr v12, v1

    .line 850
    invoke-static {v5}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    sub-long/2addr v12, v10

    .line 854
    invoke-interface {v5, v12, v13}, Lk0/h;->C(J)Ll0/j;

    .line 855
    .line 856
    .line 857
    move-result-object v12

    .line 858
    iget-object v13, v6, Ll0/b;->a:Ljava/lang/String;

    .line 859
    .line 860
    invoke-virtual {v8, v12, v13}, Ll0/j;->a(Ll0/j;Ljava/lang/String;)Ll0/j;

    .line 861
    .line 862
    .line 863
    move-result-object v12

    .line 864
    if-nez v12, :cond_27

    .line 865
    .line 866
    goto :goto_17

    .line 867
    :cond_27
    add-int/lit8 v0, v0, 0x1

    .line 868
    .line 869
    add-int/lit8 v14, v14, 0x1

    .line 870
    .line 871
    move-object/from16 v13, p3

    .line 872
    .line 873
    move-object v8, v12

    .line 874
    move/from16 v12, v16

    .line 875
    .line 876
    goto :goto_16

    .line 877
    :cond_28
    move-object/from16 p3, v13

    .line 878
    .line 879
    :goto_17
    int-to-long v10, v0

    .line 880
    add-long/2addr v10, v1

    .line 881
    sub-long v10, v10, v18

    .line 882
    .line 883
    invoke-virtual {v4, v10, v11}, Lk0/i;->e(J)J

    .line 884
    .line 885
    .line 886
    move-result-wide v46

    .line 887
    if-eqz v15, :cond_29

    .line 888
    .line 889
    cmp-long v5, v29, v46

    .line 890
    .line 891
    if-gtz v5, :cond_29

    .line 892
    .line 893
    move-wide/from16 v50, v29

    .line 894
    .line 895
    move-wide/from16 v14, v58

    .line 896
    .line 897
    goto :goto_18

    .line 898
    :cond_29
    move-wide/from16 v14, v58

    .line 899
    .line 900
    const-wide v50, -0x7fffffffffffffffL    # -4.9E-324

    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    :goto_18
    invoke-virtual {v4, v10, v11, v14, v15}, Lk0/i;->g(JJ)Z

    .line 906
    .line 907
    .line 908
    move-result v5

    .line 909
    if-eqz v5, :cond_2a

    .line 910
    .line 911
    const/4 v13, 0x0

    .line 912
    goto :goto_19

    .line 913
    :cond_2a
    const/16 v13, 0x8

    .line 914
    .line 915
    :goto_19
    iget-object v5, v6, Ll0/b;->a:Ljava/lang/String;

    .line 916
    .line 917
    invoke-static {v7, v5, v8, v13}, LD1/b;->f(Ll0/m;Ljava/lang/String;Ll0/j;I)Lf0/l;

    .line 918
    .line 919
    .line 920
    move-result-object v40

    .line 921
    iget-wide v5, v7, Ll0/m;->n:J

    .line 922
    .line 923
    neg-long v5, v5

    .line 924
    move-object/from16 v7, p3

    .line 925
    .line 926
    iget-object v8, v7, La0/p;->n:Ljava/lang/String;

    .line 927
    .line 928
    invoke-static {v8}, La0/G;->j(Ljava/lang/String;)Z

    .line 929
    .line 930
    .line 931
    move-result v8

    .line 932
    if-eqz v8, :cond_2b

    .line 933
    .line 934
    add-long v5, v5, v44

    .line 935
    .line 936
    :cond_2b
    move-wide/from16 v55, v5

    .line 937
    .line 938
    new-instance v5, Ly0/j;

    .line 939
    .line 940
    move-object/from16 v38, v5

    .line 941
    .line 942
    iget-object v4, v4, Lk0/i;->a:Ly0/d;

    .line 943
    .line 944
    move-object/from16 v57, v4

    .line 945
    .line 946
    move-object/from16 v39, v9

    .line 947
    .line 948
    move-object/from16 v41, v7

    .line 949
    .line 950
    move-wide/from16 v52, v1

    .line 951
    .line 952
    move/from16 v54, v0

    .line 953
    .line 954
    invoke-direct/range {v38 .. v57}, Ly0/j;-><init>(Lf0/h;Lf0/l;La0/p;ILjava/lang/Object;JJJJJIJLy0/f;)V

    .line 955
    .line 956
    .line 957
    move-object v4, v5

    .line 958
    :goto_1a
    iput-object v4, v3, La0/m;->b:Ljava/lang/Object;

    .line 959
    .line 960
    return-void

    .line 961
    :cond_2c
    :goto_1b
    iput-boolean v13, v3, La0/m;->a:Z

    .line 962
    .line 963
    return-void
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
.end method

.method public final f(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/k;->m:Lx0/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk0/k;->j:LA0/w;

    .line 6
    .line 7
    invoke-interface {v0}, LA0/w;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lk0/k;->j:LA0/w;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, LA0/w;->n(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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

.method public final g(Ly0/e;)V
    .locals 13

    .line 1
    instance-of v0, p1, Ly0/k;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ly0/k;

    .line 7
    .line 8
    iget-object v1, p0, Lk0/k;->j:LA0/w;

    .line 9
    .line 10
    iget-object v0, v0, Ly0/e;->o:La0/p;

    .line 11
    .line 12
    invoke-interface {v1, v0}, LA0/w;->p(La0/p;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lk0/k;->i:[Lk0/i;

    .line 17
    .line 18
    aget-object v2, v1, v0

    .line 19
    .line 20
    iget-object v3, v2, Lk0/i;->d:Lk0/h;

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v2, Lk0/i;->a:Ly0/d;

    .line 25
    .line 26
    invoke-static {v3}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v3, Ly0/d;->s:LF0/E;

    .line 30
    .line 31
    instance-of v4, v3, LF0/k;

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    check-cast v3, LF0/k;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-eqz v3, :cond_1

    .line 40
    .line 41
    new-instance v12, LN0/c;

    .line 42
    .line 43
    iget-object v7, v2, Lk0/i;->b:Ll0/m;

    .line 44
    .line 45
    iget-wide v4, v7, Ll0/m;->n:J

    .line 46
    .line 47
    const/4 v6, 0x3

    .line 48
    invoke-direct {v12, v3, v4, v5, v6}, LN0/c;-><init>(Ljava/lang/Object;JI)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Lk0/i;

    .line 52
    .line 53
    iget-object v9, v2, Lk0/i;->a:Ly0/d;

    .line 54
    .line 55
    iget-wide v10, v2, Lk0/i;->f:J

    .line 56
    .line 57
    iget-wide v5, v2, Lk0/i;->e:J

    .line 58
    .line 59
    iget-object v8, v2, Lk0/i;->c:Ll0/b;

    .line 60
    .line 61
    move-object v4, v3

    .line 62
    invoke-direct/range {v4 .. v12}, Lk0/i;-><init>(JLl0/m;Ll0/b;Ly0/d;JLk0/h;)V

    .line 63
    .line 64
    .line 65
    aput-object v3, v1, v0

    .line 66
    .line 67
    :cond_1
    iget-object v0, p0, Lk0/k;->h:Lk0/n;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-wide v1, v0, Lk0/n;->d:J

    .line 72
    .line 73
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    cmp-long v3, v1, v3

    .line 79
    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    iget-wide v3, p1, Ly0/e;->s:J

    .line 83
    .line 84
    cmp-long v1, v3, v1

    .line 85
    .line 86
    if-lez v1, :cond_3

    .line 87
    .line 88
    :cond_2
    iget-wide v1, p1, Ly0/e;->s:J

    .line 89
    .line 90
    iput-wide v1, v0, Lk0/n;->d:J

    .line 91
    .line 92
    :cond_3
    const/4 p1, 0x1

    .line 93
    iget-object v0, v0, Lk0/n;->e:Lk0/o;

    .line 94
    .line 95
    iput-boolean p1, v0, Lk0/o;->r:Z

    .line 96
    .line 97
    :cond_4
    return-void
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

.method public final h()Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/k;->k:Ll0/c;

    .line 2
    .line 3
    iget v1, p0, Lk0/k;->l:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ll0/c;->b(I)Ll0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Ll0/h;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lk0/k;->c:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_0

    .line 21
    .line 22
    aget v5, v2, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Ll0/a;

    .line 29
    .line 30
    iget-object v5, v5, Ll0/a;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
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

.method public final i(I)Lk0/i;
    .locals 13

    .line 1
    iget-object v0, p0, Lk0/k;->i:[Lk0/i;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lk0/i;->b:Ll0/m;

    .line 6
    .line 7
    iget-object v2, v2, Ll0/m;->m:Lm2/I;

    .line 8
    .line 9
    iget-object v3, p0, Lk0/k;->b:LZ1/i;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, LZ1/i;->C(Ljava/util/List;)Ll0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    if-eqz v8, :cond_0

    .line 16
    .line 17
    iget-object v2, v1, Lk0/i;->c:Ll0/b;

    .line 18
    .line 19
    invoke-virtual {v8, v2}, Ll0/b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Lk0/i;

    .line 26
    .line 27
    iget-wide v10, v1, Lk0/i;->f:J

    .line 28
    .line 29
    iget-object v12, v1, Lk0/i;->d:Lk0/h;

    .line 30
    .line 31
    iget-wide v5, v1, Lk0/i;->e:J

    .line 32
    .line 33
    iget-object v7, v1, Lk0/i;->b:Ll0/m;

    .line 34
    .line 35
    iget-object v9, v1, Lk0/i;->a:Ly0/d;

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    invoke-direct/range {v4 .. v12}, Lk0/i;-><init>(JLl0/m;Ll0/b;Ly0/d;JLk0/h;)V

    .line 39
    .line 40
    .line 41
    aput-object v2, v0, p1

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    return-object v1
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
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/k;->i:[Lk0/i;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v3, v3, Lk0/i;->a:Ly0/d;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-object v3, v3, Ly0/d;->l:LF0/q;

    .line 14
    .line 15
    invoke-interface {v3}, LF0/q;->release()V

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
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
