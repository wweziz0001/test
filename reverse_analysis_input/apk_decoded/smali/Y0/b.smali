.class public final LY0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/f;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:LF0/B;


# direct methods
.method public constructor <init>(JJJ)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    move-wide v5, p1

    .line 3
    move-wide/from16 v1, p5

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v3, LF0/B;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    new-array v7, v4, [J

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    aput-wide p3, v7, v8

    .line 15
    .line 16
    const-wide/16 v9, 0x0

    .line 17
    .line 18
    new-array v4, v4, [J

    .line 19
    .line 20
    aput-wide v9, v4, v8

    .line 21
    .line 22
    invoke-direct {v3, p1, p2, v7, v4}, LF0/B;-><init>(J[J[J)V

    .line 23
    .line 24
    .line 25
    iput-object v3, v0, LY0/b;->c:LF0/B;

    .line 26
    .line 27
    iput-wide v1, v0, LY0/b;->a:J

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v3, v5, v3

    .line 35
    .line 36
    const v8, -0x7fffffff

    .line 37
    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    sub-long v1, p3, v1

    .line 42
    .line 43
    const-wide/16 v3, 0x8

    .line 44
    .line 45
    sget-object v7, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 46
    .line 47
    move-wide v5, p1

    .line 48
    invoke-static/range {v1 .. v7}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    cmp-long v3, v1, v9

    .line 53
    .line 54
    if-lez v3, :cond_0

    .line 55
    .line 56
    const-wide/32 v3, 0x7fffffff

    .line 57
    .line 58
    .line 59
    cmp-long v3, v1, v3

    .line 60
    .line 61
    if-gtz v3, :cond_0

    .line 62
    .line 63
    long-to-int v8, v1

    .line 64
    :cond_0
    iput v8, v0, LY0/b;->b:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iput v8, v0, LY0/b;->b:I

    .line 68
    .line 69
    :goto_0
    return-void
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
.method public final a(J)J
    .locals 3

    .line 1
    iget-object v0, p0, LY0/b;->c:LF0/B;

    .line 2
    .line 3
    iget-object v1, v0, LF0/B;->b:LA/j;

    .line 4
    .line 5
    iget v2, v1, LA/j;->l:I

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v0, LF0/B;->a:LA/j;

    .line 16
    .line 17
    invoke-static {v0, p1, p2}, Ld0/w;->b(LA/j;J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v1, p1}, LA/j;->i(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    return-wide p1
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

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY0/b;->c:LF0/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LF0/B;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/b;->a:J

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

.method public final g(J)LF0/D;
    .locals 1

    .line 1
    iget-object v0, p0, LY0/b;->c:LF0/B;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LF0/B;->g(J)LF0/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, LY0/b;->b:I

    .line 2
    .line 3
    return v0
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

.method public final i()J
    .locals 2

    .line 1
    iget-object v0, p0, LY0/b;->c:LF0/B;

    .line 2
    .line 3
    iget-wide v0, v0, LF0/B;->c:J

    .line 4
    .line 5
    return-wide v0
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
