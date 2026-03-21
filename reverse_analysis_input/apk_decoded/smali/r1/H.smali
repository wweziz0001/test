.class public final Lr1/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/a;


# instance fields
.field public a:Ljava/util/ArrayList;


# virtual methods
.method public a(J)Lm2/I;
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Lr1/H;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lm2/I;->m:Lm2/G;

    .line 8
    .line 9
    sget-object p1, Lm2/b0;->p:Lm2/b0;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v1, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lc1/a;

    .line 21
    .line 22
    iget-wide v1, v0, Lc1/a;->d:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v3, v1, v3

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    cmp-long p1, p1, v1

    .line 34
    .line 35
    if-gez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object p1, Lm2/I;->m:Lm2/G;

    .line 39
    .line 40
    sget-object p1, Lm2/b0;->p:Lm2/b0;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    iget-object p1, v0, Lc1/a;->a:Lm2/I;

    .line 44
    .line 45
    :goto_1
    return-object p1
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

.method public b(J)J
    .locals 8

    .line 1
    iget-object v0, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-nez v1, :cond_7

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lc1/a;

    .line 20
    .line 21
    iget-wide v4, v1, Lc1/a;->b:J

    .line 22
    .line 23
    cmp-long v1, p1, v4

    .line 24
    .line 25
    if-gez v1, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const/4 v1, 0x1

    .line 29
    move v4, v1

    .line 30
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v4, v5, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lc1/a;

    .line 41
    .line 42
    iget-wide v5, v5, Lc1/a;->b:J

    .line 43
    .line 44
    cmp-long v7, p1, v5

    .line 45
    .line 46
    if-nez v7, :cond_1

    .line 47
    .line 48
    return-wide v5

    .line 49
    :cond_1
    if-gez v7, :cond_3

    .line 50
    .line 51
    sub-int/2addr v4, v1

    .line 52
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lc1/a;

    .line 57
    .line 58
    iget-wide v4, v0, Lc1/a;->d:J

    .line 59
    .line 60
    cmp-long v1, v4, v2

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    cmp-long p1, v4, p1

    .line 65
    .line 66
    if-gtz p1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-wide v4, v0, Lc1/a;->b:J

    .line 70
    .line 71
    :goto_1
    return-wide v4

    .line 72
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-static {v0}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lc1/a;

    .line 80
    .line 81
    iget-wide v4, v0, Lc1/a;->d:J

    .line 82
    .line 83
    cmp-long v1, v4, v2

    .line 84
    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    cmp-long p1, p1, v4

    .line 88
    .line 89
    if-gez p1, :cond_6

    .line 90
    .line 91
    :cond_5
    iget-wide v4, v0, Lc1/a;->b:J

    .line 92
    .line 93
    :cond_6
    return-wide v4

    .line 94
    :cond_7
    :goto_2
    return-wide v2
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public c(J)J
    .locals 10

    .line 1
    iget-object v0, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lc1/a;

    .line 18
    .line 19
    iget-wide v4, v4, Lc1/a;->b:J

    .line 20
    .line 21
    cmp-long v4, p1, v4

    .line 22
    .line 23
    if-gez v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lc1/a;

    .line 30
    .line 31
    iget-wide p1, p1, Lc1/a;->b:J

    .line 32
    .line 33
    return-wide p1

    .line 34
    :cond_1
    const/4 v1, 0x1

    .line 35
    move v4, v1

    .line 36
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-ge v4, v5, :cond_4

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Lc1/a;

    .line 52
    .line 53
    iget-wide v8, v5, Lc1/a;->b:J

    .line 54
    .line 55
    cmp-long v8, p1, v8

    .line 56
    .line 57
    if-gez v8, :cond_3

    .line 58
    .line 59
    sub-int/2addr v4, v1

    .line 60
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lc1/a;

    .line 65
    .line 66
    iget-wide v0, v0, Lc1/a;->d:J

    .line 67
    .line 68
    cmp-long v2, v0, v6

    .line 69
    .line 70
    iget-wide v3, v5, Lc1/a;->b:J

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    cmp-long p1, v0, p1

    .line 75
    .line 76
    if-lez p1, :cond_2

    .line 77
    .line 78
    cmp-long p1, v0, v3

    .line 79
    .line 80
    if-gez p1, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-wide v0, v3

    .line 84
    :goto_1
    return-wide v0

    .line 85
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    invoke-static {v0}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lc1/a;

    .line 93
    .line 94
    iget-wide v0, v0, Lc1/a;->d:J

    .line 95
    .line 96
    cmp-long v4, v0, v6

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    cmp-long p1, p1, v0

    .line 101
    .line 102
    if-gez p1, :cond_5

    .line 103
    .line 104
    move-wide v2, v0

    .line 105
    :cond_5
    return-wide v2
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

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public d(Lc1/a;J)Z
    .locals 9

    .line 1
    iget-wide v0, p1, Lc1/a;->b:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    move v4, v6

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v5

    .line 17
    :goto_0
    invoke-static {v4}, Ld0/m;->c(Z)V

    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, p2

    .line 21
    .line 22
    if-gtz v4, :cond_2

    .line 23
    .line 24
    iget-wide v7, p1, Lc1/a;->d:J

    .line 25
    .line 26
    cmp-long v2, v7, v2

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    cmp-long v2, p2, v7

    .line 31
    .line 32
    if-gez v2, :cond_2

    .line 33
    .line 34
    :cond_1
    move v2, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v2, v5

    .line 37
    :goto_1
    iget-object v3, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    sub-int/2addr v4, v6

    .line 44
    :goto_2
    if-ltz v4, :cond_5

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Lc1/a;

    .line 51
    .line 52
    iget-wide v7, v7, Lc1/a;->b:J

    .line 53
    .line 54
    cmp-long v7, v0, v7

    .line 55
    .line 56
    if-ltz v7, :cond_3

    .line 57
    .line 58
    add-int/2addr v4, v6

    .line 59
    invoke-virtual {v3, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return v2

    .line 63
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Lc1/a;

    .line 68
    .line 69
    iget-wide v7, v7, Lc1/a;->b:J

    .line 70
    .line 71
    cmp-long v7, v7, p2

    .line 72
    .line 73
    if-gtz v7, :cond_4

    .line 74
    .line 75
    move v2, v5

    .line 76
    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    invoke-virtual {v3, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return v2
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

.method public e(J)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lr1/H;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    add-int/lit8 v2, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lc1/a;

    .line 17
    .line 18
    iget-wide v2, v2, Lc1/a;->d:J

    .line 19
    .line 20
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v4, v2, v4

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    cmp-long p1, v2, p1

    .line 30
    .line 31
    if-ltz p1, :cond_2

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public f(J)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lr1/H;->a:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lc1/a;

    .line 15
    .line 16
    iget-wide v1, v1, Lc1/a;->b:J

    .line 17
    .line 18
    cmp-long v1, p1, v1

    .line 19
    .line 20
    if-gez v1, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
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
