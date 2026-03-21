.class public final La1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field public final synthetic a:La1/b;


# direct methods
.method public constructor <init>(La1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La1/a;->a:La1/b;

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


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public final g(J)LF0/D;
    .locals 17

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v3, v2, La1/a;->a:La1/b;

    .line 6
    .line 7
    iget-object v4, v3, La1/b;->o:La1/i;

    .line 8
    .line 9
    iget v4, v4, La1/i;->i:I

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    mul-long/2addr v4, v0

    .line 13
    const-wide/32 v6, 0xf4240

    .line 14
    .line 15
    .line 16
    div-long/2addr v4, v6

    .line 17
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-wide v5, v3, La1/b;->n:J

    .line 22
    .line 23
    iget-wide v7, v3, La1/b;->m:J

    .line 24
    .line 25
    sub-long v9, v5, v7

    .line 26
    .line 27
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-wide v9, v3, La1/b;->q:J

    .line 36
    .line 37
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/math/BigInteger;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    add-long/2addr v9, v7

    .line 50
    const-wide/16 v7, 0x7530

    .line 51
    .line 52
    sub-long v11, v9, v7

    .line 53
    .line 54
    const-wide/16 v7, 0x1

    .line 55
    .line 56
    sub-long v15, v5, v7

    .line 57
    .line 58
    iget-wide v13, v3, La1/b;->m:J

    .line 59
    .line 60
    invoke-static/range {v11 .. v16}, Ld0/w;->j(JJJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    new-instance v5, LF0/D;

    .line 65
    .line 66
    new-instance v6, LF0/F;

    .line 67
    .line 68
    invoke-direct {v6, v0, v1, v3, v4}, LF0/F;-><init>(JJ)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v5, v6, v6}, LF0/D;-><init>(LF0/F;LF0/F;)V

    .line 72
    .line 73
    .line 74
    return-object v5
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
    .locals 6

    .line 1
    iget-object v0, p0, La1/a;->a:La1/b;

    .line 2
    .line 3
    iget-object v1, v0, La1/b;->o:La1/i;

    .line 4
    .line 5
    iget-wide v2, v0, La1/b;->q:J

    .line 6
    .line 7
    const-wide/32 v4, 0xf4240

    .line 8
    .line 9
    .line 10
    mul-long/2addr v2, v4

    .line 11
    iget v0, v1, La1/i;->i:I

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    div-long/2addr v2, v0

    .line 15
    return-wide v2
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
