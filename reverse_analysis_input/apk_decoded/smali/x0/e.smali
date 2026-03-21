.class public final Lx0/e;
.super Lx0/x;
.source "SourceFile"


# instance fields
.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z


# direct methods
.method public constructor <init>(La0/U;JJ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-wide/from16 v1, p4

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lx0/x;-><init>(La0/U;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, La0/U;->h()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-ne v3, v5, :cond_9

    .line 14
    .line 15
    new-instance v3, La0/T;

    .line 16
    .line 17
    invoke-direct {v3}, La0/T;-><init>()V

    .line 18
    .line 19
    .line 20
    const-wide/16 v6, 0x0

    .line 21
    .line 22
    move-object v8, p1

    .line 23
    invoke-virtual {p1, v4, v3, v6, v7}, La0/U;->m(ILa0/T;J)La0/T;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    move-wide/from16 v8, p2

    .line 28
    .line 29
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v10

    .line 33
    iget-boolean v8, v3, La0/T;->k:Z

    .line 34
    .line 35
    if-nez v8, :cond_1

    .line 36
    .line 37
    cmp-long v8, v10, v6

    .line 38
    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    iget-boolean v8, v3, La0/T;->h:Z

    .line 42
    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v1, Lx0/f;

    .line 47
    .line 48
    invoke-direct {v1, v5}, Lx0/f;-><init>(I)V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :cond_1
    :goto_0
    const-wide/high16 v8, -0x8000000000000000L

    .line 53
    .line 54
    cmp-long v8, v1, v8

    .line 55
    .line 56
    if-nez v8, :cond_2

    .line 57
    .line 58
    iget-wide v1, v3, La0/T;->m:J

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    :goto_1
    iget-wide v6, v3, La0/T;->m:J

    .line 66
    .line 67
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    cmp-long v12, v6, v8

    .line 73
    .line 74
    if-eqz v12, :cond_5

    .line 75
    .line 76
    cmp-long v13, v1, v6

    .line 77
    .line 78
    if-lez v13, :cond_3

    .line 79
    .line 80
    move-wide v1, v6

    .line 81
    :cond_3
    cmp-long v13, v10, v1

    .line 82
    .line 83
    if-gtz v13, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    new-instance v3, Lx0/f;

    .line 87
    .line 88
    const/4 v9, 0x2

    .line 89
    move-object v8, v3

    .line 90
    move-wide v12, v1

    .line 91
    invoke-direct/range {v8 .. v13}, Lx0/f;-><init>(IJJ)V

    .line 92
    .line 93
    .line 94
    throw v3

    .line 95
    :cond_5
    :goto_2
    iput-wide v10, v0, Lx0/e;->c:J

    .line 96
    .line 97
    iput-wide v1, v0, Lx0/e;->d:J

    .line 98
    .line 99
    cmp-long v13, v1, v8

    .line 100
    .line 101
    if-nez v13, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    sub-long v8, v1, v10

    .line 105
    .line 106
    :goto_3
    iput-wide v8, v0, Lx0/e;->e:J

    .line 107
    .line 108
    iget-boolean v3, v3, La0/T;->i:Z

    .line 109
    .line 110
    if-eqz v3, :cond_8

    .line 111
    .line 112
    if-eqz v13, :cond_7

    .line 113
    .line 114
    if-eqz v12, :cond_8

    .line 115
    .line 116
    cmp-long v1, v1, v6

    .line 117
    .line 118
    if-nez v1, :cond_8

    .line 119
    .line 120
    :cond_7
    move v4, v5

    .line 121
    :cond_8
    iput-boolean v4, v0, Lx0/e;->f:Z

    .line 122
    .line 123
    return-void

    .line 124
    :cond_9
    new-instance v1, Lx0/f;

    .line 125
    .line 126
    invoke-direct {v1, v4}, Lx0/f;-><init>(I)V

    .line 127
    .line 128
    .line 129
    throw v1
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
.method public final f(ILa0/S;Z)La0/S;
    .locals 10

    .line 1
    iget-object v0, p0, Lx0/x;->b:La0/U;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p2, p3}, La0/U;->f(ILa0/S;Z)La0/S;

    .line 5
    .line 6
    .line 7
    iget-wide v0, p2, La0/S;->e:J

    .line 8
    .line 9
    iget-wide v2, p0, Lx0/e;->c:J

    .line 10
    .line 11
    sub-long v6, v0, v2

    .line 12
    .line 13
    iget-wide v0, p0, Lx0/e;->e:J

    .line 14
    .line 15
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move-wide v4, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sub-long/2addr v0, v6

    .line 27
    move-wide v4, v0

    .line 28
    :goto_0
    iget-object v1, p2, La0/S;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p2, La0/S;->b:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v8, La0/b;->c:La0/b;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    move-object v0, p2

    .line 37
    invoke-virtual/range {v0 .. v9}, La0/S;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLa0/b;Z)V

    .line 38
    .line 39
    .line 40
    return-object p2
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

.method public final m(ILa0/T;J)La0/T;
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const-wide/16 p3, 0x0

    .line 3
    .line 4
    iget-object v0, p0, Lx0/x;->b:La0/U;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3, p4}, La0/U;->m(ILa0/T;J)La0/T;

    .line 7
    .line 8
    .line 9
    iget-wide p3, p2, La0/T;->p:J

    .line 10
    .line 11
    iget-wide v0, p0, Lx0/e;->c:J

    .line 12
    .line 13
    add-long/2addr p3, v0

    .line 14
    iput-wide p3, p2, La0/T;->p:J

    .line 15
    .line 16
    iget-wide p3, p0, Lx0/e;->e:J

    .line 17
    .line 18
    iput-wide p3, p2, La0/T;->m:J

    .line 19
    .line 20
    iget-boolean p1, p0, Lx0/e;->f:Z

    .line 21
    .line 22
    iput-boolean p1, p2, La0/T;->i:Z

    .line 23
    .line 24
    iget-wide p3, p2, La0/T;->l:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long p1, p3, v2

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iput-wide p3, p2, La0/T;->l:J

    .line 40
    .line 41
    iget-wide v4, p0, Lx0/e;->d:J

    .line 42
    .line 43
    cmp-long p1, v4, v2

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3, p4, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :goto_0
    sub-long/2addr p3, v0

    .line 53
    iput-wide p3, p2, La0/T;->l:J

    .line 54
    .line 55
    :cond_1
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p3

    .line 59
    iget-wide v0, p2, La0/T;->e:J

    .line 60
    .line 61
    cmp-long p1, v0, v2

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    add-long/2addr v0, p3

    .line 66
    iput-wide v0, p2, La0/T;->e:J

    .line 67
    .line 68
    :cond_2
    iget-wide v0, p2, La0/T;->f:J

    .line 69
    .line 70
    cmp-long p1, v0, v2

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    add-long/2addr v0, p3

    .line 75
    iput-wide v0, p2, La0/T;->f:J

    .line 76
    .line 77
    :cond_3
    return-object p2
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
