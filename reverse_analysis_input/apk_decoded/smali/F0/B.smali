.class public final LF0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field public final a:LA/j;

.field public final b:LA/j;

.field public c:J


# direct methods
.method public constructor <init>(J[J[J)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p3

    .line 5
    array-length v1, p4

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    invoke-static {v0}, Ld0/m;->c(Z)V

    .line 14
    .line 15
    .line 16
    array-length v0, p4

    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    aget-wide v1, p4, v2

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v1, v1, v4

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, LA/j;

    .line 28
    .line 29
    add-int/2addr v0, v3

    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-direct {v1, v0, v2}, LA/j;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LF0/B;->a:LA/j;

    .line 35
    .line 36
    new-instance v2, LA/j;

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    invoke-direct {v2, v0, v3}, LA/j;-><init>(II)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, LF0/B;->b:LA/j;

    .line 43
    .line 44
    invoke-virtual {v1, v4, v5}, LA/j;->f(J)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v4, v5}, LA/j;->f(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v1, LA/j;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v1, v0, v2}, LA/j;-><init>(II)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, LF0/B;->a:LA/j;

    .line 58
    .line 59
    new-instance v1, LA/j;

    .line 60
    .line 61
    invoke-direct {v1, v0, v2}, LA/j;-><init>(II)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, LF0/B;->b:LA/j;

    .line 65
    .line 66
    :goto_1
    iget-object v0, p0, LF0/B;->a:LA/j;

    .line 67
    .line 68
    invoke-virtual {v0, p3}, LA/j;->g([J)V

    .line 69
    .line 70
    .line 71
    iget-object p3, p0, LF0/B;->b:LA/j;

    .line 72
    .line 73
    invoke-virtual {p3, p4}, LA/j;->g([J)V

    .line 74
    .line 75
    .line 76
    iput-wide p1, p0, LF0/B;->c:J

    .line 77
    .line 78
    return-void
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
.method public final b(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, LF0/B;->b:LA/j;

    .line 2
    .line 3
    iget v1, v0, LA/j;->l:I

    .line 4
    .line 5
    iget-object v2, p0, LF0/B;->a:LA/j;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v1, p1, v3

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v3, v4}, LA/j;->f(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3, v4}, LA/j;->f(J)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v2, p3, p4}, LA/j;->f(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, LA/j;->f(J)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF0/B;->b:LA/j;

    .line 2
    .line 3
    iget v0, v0, LA/j;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
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

.method public final g(J)LF0/D;
    .locals 8

    .line 1
    iget-object v0, p0, LF0/B;->b:LA/j;

    .line 2
    .line 3
    iget v1, v0, LA/j;->l:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance p1, LF0/D;

    .line 8
    .line 9
    sget-object p2, LF0/F;->c:LF0/F;

    .line 10
    .line 11
    invoke-direct {p1, p2, p2}, LF0/D;-><init>(LF0/F;LF0/F;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-static {v0, p1, p2}, Ld0/w;->b(LA/j;J)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, LF0/F;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, LA/j;->i(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-object v5, p0, LF0/B;->a:LA/j;

    .line 26
    .line 27
    invoke-virtual {v5, v1}, LA/j;->i(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-direct {v2, v3, v4, v6, v7}, LF0/F;-><init>(JJ)V

    .line 32
    .line 33
    .line 34
    cmp-long p1, v3, p1

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget p1, v0, LA/j;->l:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, -0x1

    .line 41
    .line 42
    if-ne v1, p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p1, LF0/F;

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LA/j;->i(I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-virtual {v5, v1}, LA/j;->i(I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-direct {p1, v3, v4, v0, v1}, LF0/F;-><init>(JJ)V

    .line 58
    .line 59
    .line 60
    new-instance p2, LF0/D;

    .line 61
    .line 62
    invoke-direct {p2, v2, p1}, LF0/D;-><init>(LF0/F;LF0/F;)V

    .line 63
    .line 64
    .line 65
    return-object p2

    .line 66
    :cond_2
    :goto_0
    new-instance p1, LF0/D;

    .line 67
    .line 68
    invoke-direct {p1, v2, v2}, LF0/D;-><init>(LF0/F;LF0/F;)V

    .line 69
    .line 70
    .line 71
    return-object p1
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/B;->c:J

    .line 2
    .line 3
    return-wide v0
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
