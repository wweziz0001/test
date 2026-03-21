.class public final La1/c;
.super La1/i;
.source "SourceFile"


# instance fields
.field public n:LF0/w;

.field public o:LZ0/b;


# virtual methods
.method public final b(Ld0/p;)J
    .locals 4

    .line 1
    iget-object v0, p1, Ld0/p;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v2, v0, v1

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    if-ne v2, v3, :cond_2

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    aget-byte v0, v0, v2

    .line 11
    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    shr-int/2addr v0, v2

    .line 16
    const/4 v3, 0x6

    .line 17
    if-eq v0, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    if-ne v0, v3, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v2}, Ld0/p;->I(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ld0/p;->C()J

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {v0, p1}, LF0/b;->v(ILd0/p;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1, v1}, Ld0/p;->H(I)V

    .line 33
    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    return-wide v0

    .line 37
    :cond_2
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    return-wide v0
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

.method public final c(Ld0/p;JLZ1/l;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, Ld0/p;->a:[B

    .line 8
    .line 9
    iget-object v4, v0, La1/c;->n:LF0/w;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance v4, LF0/w;

    .line 15
    .line 16
    const/16 v6, 0x11

    .line 17
    .line 18
    invoke-direct {v4, v6, v3}, LF0/w;-><init>(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object v4, v0, La1/c;->n:LF0/w;

    .line 22
    .line 23
    iget v1, v1, Ld0/p;->c:I

    .line 24
    .line 25
    const/16 v6, 0x9

    .line 26
    .line 27
    invoke-static {v3, v6, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v4, v1, v3}, LF0/w;->c([BLa0/F;)La0/p;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v2, LZ1/l;->l:Ljava/lang/Object;

    .line 37
    .line 38
    return v5

    .line 39
    :cond_0
    const/4 v6, 0x0

    .line 40
    aget-byte v3, v3, v6

    .line 41
    .line 42
    and-int/lit8 v7, v3, 0x7f

    .line 43
    .line 44
    const/4 v8, 0x3

    .line 45
    if-ne v7, v8, :cond_1

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, LF0/b;->w(Ld0/p;)LZ1/l;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, LF0/w;

    .line 52
    .line 53
    iget-wide v6, v4, LF0/w;->j:J

    .line 54
    .line 55
    iget-object v3, v4, LF0/w;->l:La0/F;

    .line 56
    .line 57
    iget v10, v4, LF0/w;->a:I

    .line 58
    .line 59
    iget v11, v4, LF0/w;->b:I

    .line 60
    .line 61
    iget v12, v4, LF0/w;->c:I

    .line 62
    .line 63
    iget v13, v4, LF0/w;->d:I

    .line 64
    .line 65
    iget v14, v4, LF0/w;->e:I

    .line 66
    .line 67
    iget v15, v4, LF0/w;->g:I

    .line 68
    .line 69
    iget v4, v4, LF0/w;->h:I

    .line 70
    .line 71
    move-object v9, v2

    .line 72
    move/from16 v16, v4

    .line 73
    .line 74
    move-wide/from16 v17, v6

    .line 75
    .line 76
    move-object/from16 v19, v1

    .line 77
    .line 78
    move-object/from16 v20, v3

    .line 79
    .line 80
    invoke-direct/range {v9 .. v20}, LF0/w;-><init>(IIIIIIIJLZ1/l;La0/F;)V

    .line 81
    .line 82
    .line 83
    iput-object v2, v0, La1/c;->n:LF0/w;

    .line 84
    .line 85
    new-instance v3, LZ0/b;

    .line 86
    .line 87
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v2, v3, LZ0/b;->n:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v1, v3, LZ0/b;->o:Ljava/lang/Object;

    .line 93
    .line 94
    const-wide/16 v1, -0x1

    .line 95
    .line 96
    iput-wide v1, v3, LZ0/b;->l:J

    .line 97
    .line 98
    iput-wide v1, v3, LZ0/b;->m:J

    .line 99
    .line 100
    iput-object v3, v0, La1/c;->o:LZ0/b;

    .line 101
    .line 102
    return v5

    .line 103
    :cond_1
    const/4 v1, -0x1

    .line 104
    if-ne v3, v1, :cond_3

    .line 105
    .line 106
    iget-object v1, v0, La1/c;->o:LZ0/b;

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    move-wide/from16 v3, p2

    .line 111
    .line 112
    iput-wide v3, v1, LZ0/b;->l:J

    .line 113
    .line 114
    iput-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_2
    iget-object v1, v2, LZ1/l;->l:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, La0/p;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    return v6

    .line 124
    :cond_3
    return v5
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

.method public final d(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La1/i;->d(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, La1/c;->n:LF0/w;

    .line 8
    .line 9
    iput-object p1, p0, La1/c;->o:LZ0/b;

    .line 10
    .line 11
    :cond_0
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
.end method
