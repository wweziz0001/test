.class public LO2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final l:Ljava/io/Reader;

.field public final m:[C

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:J

.field public t:I

.field public u:Ljava/lang/String;

.field public v:[I

.field public w:I

.field public x:[Ljava/lang/String;

.field public y:[I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA0/b;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA0/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LA0/b;->m:LA0/b;

    .line 9
    .line 10
    return-void
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

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, LO2/a;->z:I

    .line 6
    .line 7
    const/16 v0, 0x400

    .line 8
    .line 9
    new-array v0, v0, [C

    .line 10
    .line 11
    iput-object v0, p0, LO2/a;->m:[C

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, LO2/a;->n:I

    .line 15
    .line 16
    iput v0, p0, LO2/a;->o:I

    .line 17
    .line 18
    iput v0, p0, LO2/a;->p:I

    .line 19
    .line 20
    iput v0, p0, LO2/a;->q:I

    .line 21
    .line 22
    iput v0, p0, LO2/a;->r:I

    .line 23
    .line 24
    const/16 v1, 0x20

    .line 25
    .line 26
    new-array v2, v1, [I

    .line 27
    .line 28
    iput-object v2, p0, LO2/a;->v:[I

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    iput v3, p0, LO2/a;->w:I

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    aput v3, v2, v0

    .line 35
    .line 36
    new-array v0, v1, [Ljava/lang/String;

    .line 37
    .line 38
    iput-object v0, p0, LO2/a;->x:[Ljava/lang/String;

    .line 39
    .line 40
    new-array v0, v1, [I

    .line 41
    .line 42
    iput-object v0, p0, LO2/a;->y:[I

    .line 43
    .line 44
    const-string v0, "in == null"

    .line 45
    .line 46
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LO2/a;->l:Ljava/io/Reader;

    .line 50
    .line 51
    return-void
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
.method public A()V
    .locals 3

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x7

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, LO2/a;->r:I

    .line 14
    .line 15
    iget-object v0, p0, LO2/a;->y:[I

    .line 16
    .line 17
    iget v1, p0, LO2/a;->w:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    aget v2, v0, v1

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    aput v2, v0, v1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string v0, "null"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0
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

.method public final B(C)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget v2, p0, LO2/a;->n:I

    .line 4
    .line 5
    iget v3, p0, LO2/a;->o:I

    .line 6
    .line 7
    :goto_1
    move v4, v3

    .line 8
    move v3, v2

    .line 9
    :goto_2
    iget-object v5, p0, LO2/a;->m:[C

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/16 v7, 0x10

    .line 13
    .line 14
    if-ge v2, v4, :cond_7

    .line 15
    .line 16
    add-int/lit8 v8, v2, 0x1

    .line 17
    .line 18
    aget-char v2, v5, v2

    .line 19
    .line 20
    iget v9, p0, LO2/a;->z:I

    .line 21
    .line 22
    const/4 v10, 0x3

    .line 23
    if-ne v9, v10, :cond_1

    .line 24
    .line 25
    const/16 v9, 0x20

    .line 26
    .line 27
    if-lt v2, v9, :cond_0

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    const-string p1, "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"

    .line 31
    .line 32
    invoke-virtual {p0, p1}, LO2/a;->L(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :goto_3
    if-ne v2, p1, :cond_3

    .line 37
    .line 38
    iput v8, p0, LO2/a;->n:I

    .line 39
    .line 40
    sub-int/2addr v8, v3

    .line 41
    sub-int/2addr v8, v6

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    new-instance p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {p1, v5, v3, v8}, Ljava/lang/String;-><init>([CII)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-virtual {v1, v5, v3, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_3
    const/16 v9, 0x5c

    .line 59
    .line 60
    if-ne v2, v9, :cond_5

    .line 61
    .line 62
    iput v8, p0, LO2/a;->n:I

    .line 63
    .line 64
    sub-int/2addr v8, v3

    .line 65
    add-int/lit8 v2, v8, -0x1

    .line 66
    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    mul-int/lit8 v8, v8, 0x2

    .line 70
    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {v1, v5, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, LO2/a;->G()C

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v2, p0, LO2/a;->n:I

    .line 91
    .line 92
    iget v3, p0, LO2/a;->o:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    const/16 v5, 0xa

    .line 96
    .line 97
    if-ne v2, v5, :cond_6

    .line 98
    .line 99
    iget v2, p0, LO2/a;->p:I

    .line 100
    .line 101
    add-int/2addr v2, v6

    .line 102
    iput v2, p0, LO2/a;->p:I

    .line 103
    .line 104
    iput v8, p0, LO2/a;->q:I

    .line 105
    .line 106
    :cond_6
    move v2, v8

    .line 107
    goto :goto_2

    .line 108
    :cond_7
    if-nez v1, :cond_8

    .line 109
    .line 110
    sub-int v1, v2, v3

    .line 111
    .line 112
    mul-int/lit8 v1, v1, 0x2

    .line 113
    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 121
    .line 122
    .line 123
    move-object v1, v4

    .line 124
    :cond_8
    sub-int v4, v2, v3

    .line 125
    .line 126
    invoke-virtual {v1, v5, v3, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iput v2, p0, LO2/a;->n:I

    .line 130
    .line 131
    invoke-virtual {p0, v6}, LO2/a;->n(I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_9

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_9
    const-string p1, "Unterminated string"

    .line 140
    .line 141
    invoke-virtual {p0, p1}, LO2/a;->L(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0
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

.method public C()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LO2/a;->D()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0x9

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/16 v1, 0xb

    .line 41
    .line 42
    if-ne v0, v1, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    iput-object v1, p0, LO2/a;->u:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const/16 v1, 0xf

    .line 51
    .line 52
    if-ne v0, v1, :cond_5

    .line 53
    .line 54
    iget-wide v0, p0, LO2/a;->s:J

    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_5
    const/16 v1, 0x10

    .line 62
    .line 63
    if-ne v0, v1, :cond_6

    .line 64
    .line 65
    new-instance v0, Ljava/lang/String;

    .line 66
    .line 67
    iget v1, p0, LO2/a;->n:I

    .line 68
    .line 69
    iget v2, p0, LO2/a;->t:I

    .line 70
    .line 71
    iget-object v3, p0, LO2/a;->m:[C

    .line 72
    .line 73
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 74
    .line 75
    .line 76
    iget v1, p0, LO2/a;->n:I

    .line 77
    .line 78
    iget v2, p0, LO2/a;->t:I

    .line 79
    .line 80
    add-int/2addr v1, v2

    .line 81
    iput v1, p0, LO2/a;->n:I

    .line 82
    .line 83
    :goto_0
    const/4 v1, 0x0

    .line 84
    iput v1, p0, LO2/a;->r:I

    .line 85
    .line 86
    iget-object v1, p0, LO2/a;->y:[I

    .line 87
    .line 88
    iget v2, p0, LO2/a;->w:I

    .line 89
    .line 90
    add-int/lit8 v2, v2, -0x1

    .line 91
    .line 92
    aget v3, v1, v2

    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    aput v3, v1, v2

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_6
    const-string v0, "a string"

    .line 100
    .line 101
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    throw v0
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

.method public final D()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :cond_0
    move v2, v1

    .line 4
    :goto_0
    iget v3, p0, LO2/a;->n:I

    .line 5
    .line 6
    add-int v4, v3, v2

    .line 7
    .line 8
    iget v5, p0, LO2/a;->o:I

    .line 9
    .line 10
    iget-object v6, p0, LO2/a;->m:[C

    .line 11
    .line 12
    if-ge v4, v5, :cond_2

    .line 13
    .line 14
    add-int/2addr v3, v2

    .line 15
    aget-char v3, v6, v3

    .line 16
    .line 17
    const/16 v4, 0x9

    .line 18
    .line 19
    if-eq v3, v4, :cond_3

    .line 20
    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    if-eq v3, v4, :cond_3

    .line 24
    .line 25
    const/16 v4, 0xc

    .line 26
    .line 27
    if-eq v3, v4, :cond_3

    .line 28
    .line 29
    const/16 v4, 0xd

    .line 30
    .line 31
    if-eq v3, v4, :cond_3

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    if-eq v3, v4, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x23

    .line 38
    .line 39
    if-eq v3, v4, :cond_1

    .line 40
    .line 41
    const/16 v4, 0x2c

    .line 42
    .line 43
    if-eq v3, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0x2f

    .line 46
    .line 47
    if-eq v3, v4, :cond_1

    .line 48
    .line 49
    const/16 v4, 0x3d

    .line 50
    .line 51
    if-eq v3, v4, :cond_1

    .line 52
    .line 53
    const/16 v4, 0x7b

    .line 54
    .line 55
    if-eq v3, v4, :cond_3

    .line 56
    .line 57
    const/16 v4, 0x7d

    .line 58
    .line 59
    if-eq v3, v4, :cond_3

    .line 60
    .line 61
    const/16 v4, 0x3a

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    const/16 v4, 0x3b

    .line 66
    .line 67
    if-eq v3, v4, :cond_1

    .line 68
    .line 69
    packed-switch v3, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, LO2/a;->c()V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    array-length v3, v6

    .line 80
    if-ge v2, v3, :cond_4

    .line 81
    .line 82
    add-int/lit8 v3, v2, 0x1

    .line 83
    .line 84
    invoke-virtual {p0, v3}, LO2/a;->n(I)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    :goto_1
    :pswitch_1
    move v1, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    if-nez v0, :cond_5

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const/16 v3, 0x10

    .line 98
    .line 99
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget v3, p0, LO2/a;->n:I

    .line 107
    .line 108
    invoke-virtual {v0, v6, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget v3, p0, LO2/a;->n:I

    .line 112
    .line 113
    add-int/2addr v3, v2

    .line 114
    iput v3, p0, LO2/a;->n:I

    .line 115
    .line 116
    const/4 v2, 0x1

    .line 117
    invoke-virtual {p0, v2}, LO2/a;->n(I)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_0

    .line 122
    .line 123
    :goto_2
    if-nez v0, :cond_6

    .line 124
    .line 125
    new-instance v0, Ljava/lang/String;

    .line 126
    .line 127
    iget v2, p0, LO2/a;->n:I

    .line 128
    .line 129
    invoke-direct {v0, v6, v2, v1}, Ljava/lang/String;-><init>([CII)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    iget v2, p0, LO2/a;->n:I

    .line 134
    .line 135
    invoke-virtual {v0, v6, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_3
    iget v2, p0, LO2/a;->n:I

    .line 143
    .line 144
    add-int/2addr v2, v1

    .line 145
    iput v2, p0, LO2/a;->n:I

    .line 146
    .line 147
    return-object v0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :pswitch_0
    const/16 v0, 0xa

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_1
    const/4 v0, 0x7

    .line 22
    return v0

    .line 23
    :pswitch_2
    const/4 v0, 0x5

    .line 24
    return v0

    .line 25
    :pswitch_3
    const/4 v0, 0x6

    .line 26
    return v0

    .line 27
    :pswitch_4
    const/16 v0, 0x9

    .line 28
    .line 29
    return v0

    .line 30
    :pswitch_5
    const/16 v0, 0x8

    .line 31
    .line 32
    return v0

    .line 33
    :pswitch_6
    const/4 v0, 0x2

    .line 34
    return v0

    .line 35
    :pswitch_7
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :pswitch_8
    const/4 v0, 0x4

    .line 38
    return v0

    .line 39
    :pswitch_9
    const/4 v0, 0x3

    .line 40
    return v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final F(I)V
    .locals 3

    .line 1
    iget v0, p0, LO2/a;->w:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    const/16 v2, 0xff

    .line 6
    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, LO2/a;->v:[I

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    mul-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, LO2/a;->v:[I

    .line 21
    .line 22
    iget-object v1, p0, LO2/a;->y:[I

    .line 23
    .line 24
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, LO2/a;->y:[I

    .line 29
    .line 30
    iget-object v1, p0, LO2/a;->x:[Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, [Ljava/lang/String;

    .line 37
    .line 38
    iput-object v0, p0, LO2/a;->x:[Ljava/lang/String;

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, LO2/a;->v:[I

    .line 41
    .line 42
    iget v1, p0, LO2/a;->w:I

    .line 43
    .line 44
    add-int/lit8 v2, v1, 0x1

    .line 45
    .line 46
    iput v2, p0, LO2/a;->w:I

    .line 47
    .line 48
    aput p1, v0, v1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance p1, LO2/c;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "Nesting limit 255 reached"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
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

.method public final G()C
    .locals 9

    .line 1
    iget v0, p0, LO2/a;->n:I

    .line 2
    .line 3
    iget v1, p0, LO2/a;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "Unterminated escape sequence"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v4}, LO2/a;->n(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v3}, LO2/a;->L(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v2

    .line 22
    :cond_1
    :goto_0
    iget v0, p0, LO2/a;->n:I

    .line 23
    .line 24
    add-int/lit8 v1, v0, 0x1

    .line 25
    .line 26
    iput v1, p0, LO2/a;->n:I

    .line 27
    .line 28
    iget-object v5, p0, LO2/a;->m:[C

    .line 29
    .line 30
    aget-char v6, v5, v0

    .line 31
    .line 32
    const/4 v7, 0x3

    .line 33
    const/16 v8, 0xa

    .line 34
    .line 35
    if-eq v6, v8, :cond_e

    .line 36
    .line 37
    const/16 v1, 0x22

    .line 38
    .line 39
    if-eq v6, v1, :cond_10

    .line 40
    .line 41
    const/16 v1, 0x27

    .line 42
    .line 43
    if-eq v6, v1, :cond_f

    .line 44
    .line 45
    const/16 v1, 0x2f

    .line 46
    .line 47
    if-eq v6, v1, :cond_10

    .line 48
    .line 49
    const/16 v1, 0x5c

    .line 50
    .line 51
    if-eq v6, v1, :cond_10

    .line 52
    .line 53
    const/16 v1, 0x62

    .line 54
    .line 55
    if-eq v6, v1, :cond_d

    .line 56
    .line 57
    const/16 v1, 0x66

    .line 58
    .line 59
    if-eq v6, v1, :cond_c

    .line 60
    .line 61
    const/16 v4, 0x6e

    .line 62
    .line 63
    if-eq v6, v4, :cond_b

    .line 64
    .line 65
    const/16 v4, 0x72

    .line 66
    .line 67
    if-eq v6, v4, :cond_a

    .line 68
    .line 69
    const/16 v4, 0x74

    .line 70
    .line 71
    if-eq v6, v4, :cond_9

    .line 72
    .line 73
    const/16 v4, 0x75

    .line 74
    .line 75
    if-ne v6, v4, :cond_8

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x5

    .line 78
    .line 79
    iget v4, p0, LO2/a;->o:I

    .line 80
    .line 81
    const/4 v6, 0x4

    .line 82
    if-le v0, v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, v6}, LO2/a;->n(I)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {p0, v3}, LO2/a;->L(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v2

    .line 95
    :cond_3
    :goto_1
    iget v0, p0, LO2/a;->n:I

    .line 96
    .line 97
    add-int/lit8 v3, v0, 0x4

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    :goto_2
    if-ge v0, v3, :cond_7

    .line 101
    .line 102
    aget-char v7, v5, v0

    .line 103
    .line 104
    shl-int/lit8 v4, v4, 0x4

    .line 105
    .line 106
    const/16 v8, 0x30

    .line 107
    .line 108
    if-lt v7, v8, :cond_4

    .line 109
    .line 110
    const/16 v8, 0x39

    .line 111
    .line 112
    if-gt v7, v8, :cond_4

    .line 113
    .line 114
    add-int/lit8 v7, v7, -0x30

    .line 115
    .line 116
    :goto_3
    add-int/2addr v7, v4

    .line 117
    move v4, v7

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    const/16 v8, 0x61

    .line 120
    .line 121
    if-lt v7, v8, :cond_5

    .line 122
    .line 123
    if-gt v7, v1, :cond_5

    .line 124
    .line 125
    add-int/lit8 v7, v7, -0x57

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    const/16 v8, 0x41

    .line 129
    .line 130
    if-lt v7, v8, :cond_6

    .line 131
    .line 132
    const/16 v8, 0x46

    .line 133
    .line 134
    if-gt v7, v8, :cond_6

    .line 135
    .line 136
    add-int/lit8 v7, v7, -0x37

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    new-instance v0, Ljava/lang/String;

    .line 143
    .line 144
    iget v1, p0, LO2/a;->n:I

    .line 145
    .line 146
    invoke-direct {v0, v5, v1, v6}, Ljava/lang/String;-><init>([CII)V

    .line 147
    .line 148
    .line 149
    const-string v1, "Malformed Unicode escape \\u"

    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v2

    .line 159
    :cond_7
    iget v0, p0, LO2/a;->n:I

    .line 160
    .line 161
    add-int/2addr v0, v6

    .line 162
    iput v0, p0, LO2/a;->n:I

    .line 163
    .line 164
    int-to-char v0, v4

    .line 165
    return v0

    .line 166
    :cond_8
    const-string v0, "Invalid escape sequence"

    .line 167
    .line 168
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v2

    .line 172
    :cond_9
    const/16 v0, 0x9

    .line 173
    .line 174
    return v0

    .line 175
    :cond_a
    const/16 v0, 0xd

    .line 176
    .line 177
    return v0

    .line 178
    :cond_b
    return v8

    .line 179
    :cond_c
    const/16 v0, 0xc

    .line 180
    .line 181
    return v0

    .line 182
    :cond_d
    const/16 v0, 0x8

    .line 183
    .line 184
    return v0

    .line 185
    :cond_e
    iget v0, p0, LO2/a;->z:I

    .line 186
    .line 187
    if-eq v0, v7, :cond_12

    .line 188
    .line 189
    iget v0, p0, LO2/a;->p:I

    .line 190
    .line 191
    add-int/2addr v0, v4

    .line 192
    iput v0, p0, LO2/a;->p:I

    .line 193
    .line 194
    iput v1, p0, LO2/a;->q:I

    .line 195
    .line 196
    :cond_f
    iget v0, p0, LO2/a;->z:I

    .line 197
    .line 198
    if-eq v0, v7, :cond_11

    .line 199
    .line 200
    :cond_10
    return v6

    .line 201
    :cond_11
    const-string v0, "Invalid escaped character \"\'\" in strict mode"

    .line 202
    .line 203
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v2

    .line 207
    :cond_12
    const-string v0, "Cannot escape a newline character in strict mode"

    .line 208
    .line 209
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v2
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

.method public final H(C)V
    .locals 5

    .line 1
    :goto_0
    iget v0, p0, LO2/a;->n:I

    .line 2
    .line 3
    iget v1, p0, LO2/a;->o:I

    .line 4
    .line 5
    :goto_1
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_3

    .line 7
    .line 8
    add-int/lit8 v3, v0, 0x1

    .line 9
    .line 10
    iget-object v4, p0, LO2/a;->m:[C

    .line 11
    .line 12
    aget-char v0, v4, v0

    .line 13
    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput v3, p0, LO2/a;->n:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/16 v4, 0x5c

    .line 20
    .line 21
    if-ne v0, v4, :cond_1

    .line 22
    .line 23
    iput v3, p0, LO2/a;->n:I

    .line 24
    .line 25
    invoke-virtual {p0}, LO2/a;->G()C

    .line 26
    .line 27
    .line 28
    iget v0, p0, LO2/a;->n:I

    .line 29
    .line 30
    iget v1, p0, LO2/a;->o:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v4, 0xa

    .line 34
    .line 35
    if-ne v0, v4, :cond_2

    .line 36
    .line 37
    iget v0, p0, LO2/a;->p:I

    .line 38
    .line 39
    add-int/2addr v0, v2

    .line 40
    iput v0, p0, LO2/a;->p:I

    .line 41
    .line 42
    iput v3, p0, LO2/a;->q:I

    .line 43
    .line 44
    :cond_2
    move v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iput v0, p0, LO2/a;->n:I

    .line 47
    .line 48
    invoke-virtual {p0, v2}, LO2/a;->n(I)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    const-string p1, "Unterminated string"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, LO2/a;->L(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    throw p1
.end method

.method public final I()V
    .locals 4

    .line 1
    :cond_0
    iget v0, p0, LO2/a;->n:I

    .line 2
    .line 3
    iget v1, p0, LO2/a;->o:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v2}, LO2/a;->n(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    :cond_1
    iget v0, p0, LO2/a;->n:I

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0x1

    .line 17
    .line 18
    iput v1, p0, LO2/a;->n:I

    .line 19
    .line 20
    iget-object v3, p0, LO2/a;->m:[C

    .line 21
    .line 22
    aget-char v0, v3, v0

    .line 23
    .line 24
    const/16 v3, 0xa

    .line 25
    .line 26
    if-ne v0, v3, :cond_2

    .line 27
    .line 28
    iget v0, p0, LO2/a;->p:I

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    iput v0, p0, LO2/a;->p:I

    .line 32
    .line 33
    iput v1, p0, LO2/a;->q:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/16 v1, 0xd

    .line 37
    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    :cond_3
    :goto_0
    return-void
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

.method public final J()V
    .locals 4

    .line 1
    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, LO2/a;->n:I

    .line 3
    .line 4
    add-int v2, v1, v0

    .line 5
    .line 6
    iget v3, p0, LO2/a;->o:I

    .line 7
    .line 8
    if-ge v2, v3, :cond_3

    .line 9
    .line 10
    iget-object v2, p0, LO2/a;->m:[C

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    aget-char v1, v2, v1

    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    const/16 v2, 0xd

    .line 28
    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    const/16 v2, 0x23

    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    const/16 v2, 0x2c

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    const/16 v2, 0x2f

    .line 44
    .line 45
    if-eq v1, v2, :cond_1

    .line 46
    .line 47
    const/16 v2, 0x3d

    .line 48
    .line 49
    if-eq v1, v2, :cond_1

    .line 50
    .line 51
    const/16 v2, 0x7b

    .line 52
    .line 53
    if-eq v1, v2, :cond_2

    .line 54
    .line 55
    const/16 v2, 0x7d

    .line 56
    .line 57
    if-eq v1, v2, :cond_2

    .line 58
    .line 59
    const/16 v2, 0x3a

    .line 60
    .line 61
    if-eq v1, v2, :cond_2

    .line 62
    .line 63
    const/16 v2, 0x3b

    .line 64
    .line 65
    if-eq v1, v2, :cond_1

    .line 66
    .line 67
    packed-switch v1, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, LO2/a;->c()V

    .line 74
    .line 75
    .line 76
    :cond_2
    :pswitch_1
    iget v1, p0, LO2/a;->n:I

    .line 77
    .line 78
    add-int/2addr v1, v0

    .line 79
    iput v1, p0, LO2/a;->n:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    add-int/2addr v1, v0

    .line 83
    iput v1, p0, LO2/a;->n:I

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-virtual {p0, v0}, LO2/a;->n(I)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_0

    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public K()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    iget v2, p0, LO2/a;->r:I

    .line 4
    .line 5
    if-nez v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LO2/a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :cond_1
    const/16 v3, 0x27

    .line 12
    .line 13
    const/16 v4, 0x22

    .line 14
    .line 15
    const-string v5, "<skipped>"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    :pswitch_0
    goto :goto_2

    .line 22
    :pswitch_1
    return-void

    .line 23
    :pswitch_2
    iget v2, p0, LO2/a;->n:I

    .line 24
    .line 25
    iget v3, p0, LO2/a;->t:I

    .line 26
    .line 27
    add-int/2addr v2, v3

    .line 28
    iput v2, p0, LO2/a;->n:I

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :pswitch_3
    invoke-virtual {p0}, LO2/a;->J()V

    .line 32
    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, LO2/a;->x:[Ljava/lang/String;

    .line 37
    .line 38
    iget v3, p0, LO2/a;->w:I

    .line 39
    .line 40
    sub-int/2addr v3, v6

    .line 41
    aput-object v5, v2, v3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_4
    invoke-virtual {p0, v4}, LO2/a;->H(C)V

    .line 45
    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v2, p0, LO2/a;->x:[Ljava/lang/String;

    .line 50
    .line 51
    iget v3, p0, LO2/a;->w:I

    .line 52
    .line 53
    sub-int/2addr v3, v6

    .line 54
    aput-object v5, v2, v3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :pswitch_5
    invoke-virtual {p0, v3}, LO2/a;->H(C)V

    .line 58
    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget-object v2, p0, LO2/a;->x:[Ljava/lang/String;

    .line 63
    .line 64
    iget v3, p0, LO2/a;->w:I

    .line 65
    .line 66
    sub-int/2addr v3, v6

    .line 67
    aput-object v5, v2, v3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :pswitch_6
    invoke-virtual {p0}, LO2/a;->J()V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :pswitch_7
    invoke-virtual {p0, v4}, LO2/a;->H(C)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :pswitch_8
    invoke-virtual {p0, v3}, LO2/a;->H(C)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_9
    iget v2, p0, LO2/a;->w:I

    .line 83
    .line 84
    sub-int/2addr v2, v6

    .line 85
    iput v2, p0, LO2/a;->w:I

    .line 86
    .line 87
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :pswitch_a
    invoke-virtual {p0, v6}, LO2/a;->F(I)V

    .line 91
    .line 92
    .line 93
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :pswitch_b
    if-nez v1, :cond_2

    .line 97
    .line 98
    iget-object v2, p0, LO2/a;->x:[Ljava/lang/String;

    .line 99
    .line 100
    iget v3, p0, LO2/a;->w:I

    .line 101
    .line 102
    sub-int/2addr v3, v6

    .line 103
    const/4 v4, 0x0

    .line 104
    aput-object v4, v2, v3

    .line 105
    .line 106
    :cond_2
    iget v2, p0, LO2/a;->w:I

    .line 107
    .line 108
    sub-int/2addr v2, v6

    .line 109
    iput v2, p0, LO2/a;->w:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_c
    const/4 v2, 0x3

    .line 113
    invoke-virtual {p0, v2}, LO2/a;->F(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    :goto_2
    iput v0, p0, LO2/a;->r:I

    .line 118
    .line 119
    if-gtz v1, :cond_0

    .line 120
    .line 121
    iget-object v0, p0, LO2/a;->y:[I

    .line 122
    .line 123
    iget v1, p0, LO2/a;->w:I

    .line 124
    .line 125
    sub-int/2addr v1, v6

    .line 126
    aget v2, v0, v1

    .line 127
    .line 128
    add-int/2addr v2, v6

    .line 129
    aput v2, v0, v1

    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public final L(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, LO2/c;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, "\nSee "

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 24
    .line 25
    const-string v2, "malformed-json"

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
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

.method public final M(Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 4

    .line 1
    invoke-virtual {p0}, LO2/a;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "adapter-not-null-safe"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "unexpected-json-structure"

    .line 13
    .line 14
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v2, "Expected "

    .line 17
    .line 18
    const-string v3, " but was "

    .line 19
    .line 20
    invoke-static {v2, p1, v3}, Lb3/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, LO2/a;->E()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Lb3/a;->t(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "\nSee "

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v1
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public a()V
    .locals 3

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, LO2/a;->F(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LO2/a;->y:[I

    .line 17
    .line 18
    iget v2, p0, LO2/a;->w:I

    .line 19
    .line 20
    sub-int/2addr v2, v0

    .line 21
    const/4 v0, 0x0

    .line 22
    aput v0, v1, v2

    .line 23
    .line 24
    iput v0, p0, LO2/a;->r:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string v0, "BEGIN_ARRAY"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    throw v0
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

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-virtual {p0, v0}, LO2/a;->F(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, LO2/a;->r:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string v0, "BEGIN_OBJECT"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    throw v0
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

.method public final c()V
    .locals 2

    .line 1
    iget v0, p0, LO2/a;->z:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string v0, "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    throw v0
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

.method public close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LO2/a;->r:I

    .line 3
    .line 4
    iget-object v1, p0, LO2/a;->v:[I

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    aput v2, v1, v0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput v0, p0, LO2/a;->w:I

    .line 12
    .line 13
    iget-object v0, p0, LO2/a;->l:Ljava/io/Reader;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final f()I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LO2/a;->v:[I

    .line 4
    .line 5
    iget v2, v0, LO2/a;->w:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sub-int/2addr v2, v3

    .line 9
    aget v4, v1, v2

    .line 10
    .line 11
    iget-object v5, v0, LO2/a;->m:[C

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v11, 0x27

    .line 15
    .line 16
    const/4 v12, 0x6

    .line 17
    const/16 v13, 0x5d

    .line 18
    .line 19
    const/16 v14, 0x3b

    .line 20
    .line 21
    const/16 v15, 0x2c

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    const/4 v10, 0x4

    .line 25
    const/4 v8, 0x5

    .line 26
    const/4 v9, 0x2

    .line 27
    if-ne v4, v3, :cond_1

    .line 28
    .line 29
    aput v9, v1, v2

    .line 30
    .line 31
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    if-ne v4, v9, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0, v3}, LO2/a;->z(Z)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v1, v15, :cond_0

    .line 41
    .line 42
    if-eq v1, v14, :cond_3

    .line 43
    .line 44
    if-ne v1, v13, :cond_2

    .line 45
    .line 46
    iput v10, v0, LO2/a;->r:I

    .line 47
    .line 48
    return v10

    .line 49
    :cond_2
    const-string v1, "Unterminated array"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, LO2/a;->L(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v6

    .line 55
    :cond_3
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const/16 v9, 0x7d

    .line 60
    .line 61
    if-eq v4, v7, :cond_43

    .line 62
    .line 63
    if-ne v4, v8, :cond_5

    .line 64
    .line 65
    move v3, v10

    .line 66
    goto/16 :goto_1a

    .line 67
    .line 68
    :cond_5
    if-ne v4, v10, :cond_8

    .line 69
    .line 70
    aput v8, v1, v2

    .line 71
    .line 72
    invoke-virtual {v0, v3}, LO2/a;->z(Z)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v2, 0x3a

    .line 77
    .line 78
    if-eq v1, v2, :cond_0

    .line 79
    .line 80
    const/16 v2, 0x3d

    .line 81
    .line 82
    if-ne v1, v2, :cond_7

    .line 83
    .line 84
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 85
    .line 86
    .line 87
    iget v1, v0, LO2/a;->n:I

    .line 88
    .line 89
    iget v2, v0, LO2/a;->o:I

    .line 90
    .line 91
    if-lt v1, v2, :cond_6

    .line 92
    .line 93
    invoke-virtual {v0, v3}, LO2/a;->n(I)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    :cond_6
    iget v1, v0, LO2/a;->n:I

    .line 100
    .line 101
    aget-char v2, v5, v1

    .line 102
    .line 103
    const/16 v9, 0x3e

    .line 104
    .line 105
    if-ne v2, v9, :cond_0

    .line 106
    .line 107
    add-int/2addr v1, v3

    .line 108
    iput v1, v0, LO2/a;->n:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_7
    const-string v1, "Expected \':\'"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, LO2/a;->L(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v6

    .line 117
    :cond_8
    if-ne v4, v12, :cond_c

    .line 118
    .line 119
    iget v1, v0, LO2/a;->z:I

    .line 120
    .line 121
    if-ne v1, v3, :cond_b

    .line 122
    .line 123
    invoke-virtual {v0, v3}, LO2/a;->z(Z)I

    .line 124
    .line 125
    .line 126
    iget v1, v0, LO2/a;->n:I

    .line 127
    .line 128
    add-int/lit8 v2, v1, -0x1

    .line 129
    .line 130
    iput v2, v0, LO2/a;->n:I

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x4

    .line 133
    .line 134
    iget v2, v0, LO2/a;->o:I

    .line 135
    .line 136
    if-le v1, v2, :cond_9

    .line 137
    .line 138
    invoke-virtual {v0, v8}, LO2/a;->n(I)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_9

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_9
    iget v1, v0, LO2/a;->n:I

    .line 146
    .line 147
    aget-char v2, v5, v1

    .line 148
    .line 149
    const/16 v6, 0x29

    .line 150
    .line 151
    if-ne v2, v6, :cond_b

    .line 152
    .line 153
    add-int/lit8 v2, v1, 0x1

    .line 154
    .line 155
    aget-char v2, v5, v2

    .line 156
    .line 157
    if-ne v2, v13, :cond_b

    .line 158
    .line 159
    add-int/lit8 v2, v1, 0x2

    .line 160
    .line 161
    aget-char v2, v5, v2

    .line 162
    .line 163
    if-ne v2, v9, :cond_b

    .line 164
    .line 165
    add-int/lit8 v2, v1, 0x3

    .line 166
    .line 167
    aget-char v2, v5, v2

    .line 168
    .line 169
    if-ne v2, v11, :cond_b

    .line 170
    .line 171
    add-int/lit8 v2, v1, 0x4

    .line 172
    .line 173
    aget-char v2, v5, v2

    .line 174
    .line 175
    const/16 v6, 0xa

    .line 176
    .line 177
    if-eq v2, v6, :cond_a

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_a
    add-int/2addr v1, v8

    .line 181
    iput v1, v0, LO2/a;->n:I

    .line 182
    .line 183
    :cond_b
    :goto_1
    iget-object v1, v0, LO2/a;->v:[I

    .line 184
    .line 185
    iget v2, v0, LO2/a;->w:I

    .line 186
    .line 187
    sub-int/2addr v2, v3

    .line 188
    const/4 v6, 0x7

    .line 189
    aput v6, v1, v2

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_c
    const/4 v6, 0x7

    .line 194
    if-ne v4, v6, :cond_e

    .line 195
    .line 196
    const/4 v1, 0x0

    .line 197
    invoke-virtual {v0, v1}, LO2/a;->z(Z)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    const/4 v6, -0x1

    .line 202
    if-ne v2, v6, :cond_d

    .line 203
    .line 204
    const/16 v1, 0x11

    .line 205
    .line 206
    iput v1, v0, LO2/a;->r:I

    .line 207
    .line 208
    return v1

    .line 209
    :cond_d
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 210
    .line 211
    .line 212
    iget v2, v0, LO2/a;->n:I

    .line 213
    .line 214
    sub-int/2addr v2, v3

    .line 215
    iput v2, v0, LO2/a;->n:I

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_e
    const/4 v1, 0x0

    .line 219
    const/16 v2, 0x8

    .line 220
    .line 221
    if-eq v4, v2, :cond_42

    .line 222
    .line 223
    :goto_2
    invoke-virtual {v0, v3}, LO2/a;->z(Z)I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    const/16 v6, 0x22

    .line 228
    .line 229
    if-eq v2, v6, :cond_41

    .line 230
    .line 231
    if-eq v2, v11, :cond_40

    .line 232
    .line 233
    if-eq v2, v15, :cond_3c

    .line 234
    .line 235
    if-eq v2, v14, :cond_3c

    .line 236
    .line 237
    const/16 v6, 0x5b

    .line 238
    .line 239
    if-eq v2, v6, :cond_3b

    .line 240
    .line 241
    if-eq v2, v13, :cond_3a

    .line 242
    .line 243
    const/16 v4, 0x7b

    .line 244
    .line 245
    if-eq v2, v4, :cond_39

    .line 246
    .line 247
    iget v2, v0, LO2/a;->n:I

    .line 248
    .line 249
    sub-int/2addr v2, v3

    .line 250
    iput v2, v0, LO2/a;->n:I

    .line 251
    .line 252
    aget-char v2, v5, v2

    .line 253
    .line 254
    const/16 v4, 0x74

    .line 255
    .line 256
    if-eq v2, v4, :cond_14

    .line 257
    .line 258
    const/16 v4, 0x54

    .line 259
    .line 260
    if-ne v2, v4, :cond_f

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_f
    const/16 v4, 0x66

    .line 264
    .line 265
    if-eq v2, v4, :cond_13

    .line 266
    .line 267
    const/16 v4, 0x46

    .line 268
    .line 269
    if-ne v2, v4, :cond_10

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_10
    const/16 v4, 0x6e

    .line 273
    .line 274
    if-eq v2, v4, :cond_12

    .line 275
    .line 276
    const/16 v4, 0x4e

    .line 277
    .line 278
    if-ne v2, v4, :cond_11

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_11
    :goto_3
    move v6, v1

    .line 282
    goto/16 :goto_a

    .line 283
    .line 284
    :cond_12
    :goto_4
    const-string v2, "null"

    .line 285
    .line 286
    const-string v4, "NULL"

    .line 287
    .line 288
    const/4 v6, 0x7

    .line 289
    goto :goto_7

    .line 290
    :cond_13
    :goto_5
    const-string v2, "false"

    .line 291
    .line 292
    const-string v4, "FALSE"

    .line 293
    .line 294
    move v6, v12

    .line 295
    goto :goto_7

    .line 296
    :cond_14
    :goto_6
    const-string v2, "true"

    .line 297
    .line 298
    const-string v4, "TRUE"

    .line 299
    .line 300
    move v6, v8

    .line 301
    :goto_7
    iget v9, v0, LO2/a;->z:I

    .line 302
    .line 303
    if-eq v9, v7, :cond_15

    .line 304
    .line 305
    move v9, v3

    .line 306
    goto :goto_8

    .line 307
    :cond_15
    move v9, v1

    .line 308
    :goto_8
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    move v13, v1

    .line 313
    :goto_9
    if-ge v13, v11, :cond_18

    .line 314
    .line 315
    iget v14, v0, LO2/a;->n:I

    .line 316
    .line 317
    add-int/2addr v14, v13

    .line 318
    iget v15, v0, LO2/a;->o:I

    .line 319
    .line 320
    if-lt v14, v15, :cond_16

    .line 321
    .line 322
    add-int/lit8 v14, v13, 0x1

    .line 323
    .line 324
    invoke-virtual {v0, v14}, LO2/a;->n(I)Z

    .line 325
    .line 326
    .line 327
    move-result v14

    .line 328
    if-nez v14, :cond_16

    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_16
    iget v14, v0, LO2/a;->n:I

    .line 332
    .line 333
    add-int/2addr v14, v13

    .line 334
    aget-char v14, v5, v14

    .line 335
    .line 336
    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    if-eq v14, v15, :cond_17

    .line 341
    .line 342
    if-eqz v9, :cond_11

    .line 343
    .line 344
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    if-ne v14, v15, :cond_11

    .line 349
    .line 350
    :cond_17
    add-int/lit8 v13, v13, 0x1

    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_18
    iget v2, v0, LO2/a;->n:I

    .line 354
    .line 355
    add-int/2addr v2, v11

    .line 356
    iget v4, v0, LO2/a;->o:I

    .line 357
    .line 358
    if-lt v2, v4, :cond_19

    .line 359
    .line 360
    add-int/lit8 v2, v11, 0x1

    .line 361
    .line 362
    invoke-virtual {v0, v2}, LO2/a;->n(I)Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-eqz v2, :cond_1a

    .line 367
    .line 368
    :cond_19
    iget v2, v0, LO2/a;->n:I

    .line 369
    .line 370
    add-int/2addr v2, v11

    .line 371
    aget-char v2, v5, v2

    .line 372
    .line 373
    invoke-virtual {v0, v2}, LO2/a;->s(C)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_1a

    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_1a
    iget v2, v0, LO2/a;->n:I

    .line 381
    .line 382
    add-int/2addr v2, v11

    .line 383
    iput v2, v0, LO2/a;->n:I

    .line 384
    .line 385
    iput v6, v0, LO2/a;->r:I

    .line 386
    .line 387
    :goto_a
    if-eqz v6, :cond_1b

    .line 388
    .line 389
    return v6

    .line 390
    :cond_1b
    iget v2, v0, LO2/a;->n:I

    .line 391
    .line 392
    iget v4, v0, LO2/a;->o:I

    .line 393
    .line 394
    const-wide/16 v13, 0x0

    .line 395
    .line 396
    move v6, v1

    .line 397
    move v9, v6

    .line 398
    move v15, v9

    .line 399
    move v11, v3

    .line 400
    move-wide v7, v13

    .line 401
    :goto_b
    add-int v1, v2, v9

    .line 402
    .line 403
    if-ne v1, v4, :cond_1f

    .line 404
    .line 405
    array-length v1, v5

    .line 406
    if-ne v9, v1, :cond_1d

    .line 407
    .line 408
    :cond_1c
    :goto_c
    const/4 v10, 0x0

    .line 409
    goto/16 :goto_18

    .line 410
    .line 411
    :cond_1d
    add-int/lit8 v1, v9, 0x1

    .line 412
    .line 413
    invoke-virtual {v0, v1}, LO2/a;->n(I)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_1e

    .line 418
    .line 419
    :goto_d
    const/4 v1, 0x2

    .line 420
    goto/16 :goto_12

    .line 421
    .line 422
    :cond_1e
    iget v1, v0, LO2/a;->n:I

    .line 423
    .line 424
    iget v2, v0, LO2/a;->o:I

    .line 425
    .line 426
    move v4, v2

    .line 427
    move v2, v1

    .line 428
    :cond_1f
    add-int v1, v2, v9

    .line 429
    .line 430
    aget-char v1, v5, v1

    .line 431
    .line 432
    const/16 v10, 0x2b

    .line 433
    .line 434
    if-eq v1, v10, :cond_35

    .line 435
    .line 436
    const/16 v10, 0x45

    .line 437
    .line 438
    if-eq v1, v10, :cond_33

    .line 439
    .line 440
    const/16 v10, 0x65

    .line 441
    .line 442
    if-eq v1, v10, :cond_33

    .line 443
    .line 444
    const/16 v10, 0x2d

    .line 445
    .line 446
    if-eq v1, v10, :cond_31

    .line 447
    .line 448
    const/16 v10, 0x2e

    .line 449
    .line 450
    if-eq v1, v10, :cond_30

    .line 451
    .line 452
    const/16 v10, 0x30

    .line 453
    .line 454
    if-lt v1, v10, :cond_29

    .line 455
    .line 456
    const/16 v10, 0x39

    .line 457
    .line 458
    if-le v1, v10, :cond_20

    .line 459
    .line 460
    goto :goto_11

    .line 461
    :cond_20
    if-eq v6, v3, :cond_21

    .line 462
    .line 463
    if-nez v6, :cond_22

    .line 464
    .line 465
    :cond_21
    move/from16 v16, v4

    .line 466
    .line 467
    goto :goto_10

    .line 468
    :cond_22
    const/4 v10, 0x2

    .line 469
    if-ne v6, v10, :cond_26

    .line 470
    .line 471
    cmp-long v10, v7, v13

    .line 472
    .line 473
    if-nez v10, :cond_23

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :cond_23
    const-wide/16 v17, 0xa

    .line 477
    .line 478
    mul-long v17, v17, v7

    .line 479
    .line 480
    add-int/lit8 v1, v1, -0x30

    .line 481
    .line 482
    move/from16 v16, v4

    .line 483
    .line 484
    int-to-long v3, v1

    .line 485
    sub-long v17, v17, v3

    .line 486
    .line 487
    const-wide v3, -0xcccccccccccccccL

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    cmp-long v1, v7, v3

    .line 493
    .line 494
    if-gtz v1, :cond_25

    .line 495
    .line 496
    if-nez v1, :cond_24

    .line 497
    .line 498
    cmp-long v1, v17, v7

    .line 499
    .line 500
    if-gez v1, :cond_24

    .line 501
    .line 502
    goto :goto_e

    .line 503
    :cond_24
    const/4 v1, 0x0

    .line 504
    goto :goto_f

    .line 505
    :cond_25
    :goto_e
    const/4 v1, 0x1

    .line 506
    :goto_f
    and-int/2addr v11, v1

    .line 507
    move-wide/from16 v7, v17

    .line 508
    .line 509
    goto/16 :goto_17

    .line 510
    .line 511
    :cond_26
    move/from16 v16, v4

    .line 512
    .line 513
    const/4 v1, 0x3

    .line 514
    if-ne v6, v1, :cond_27

    .line 515
    .line 516
    const/4 v6, 0x4

    .line 517
    goto/16 :goto_17

    .line 518
    .line 519
    :cond_27
    const/4 v1, 0x5

    .line 520
    if-eq v6, v1, :cond_28

    .line 521
    .line 522
    if-ne v6, v12, :cond_36

    .line 523
    .line 524
    :cond_28
    const/4 v6, 0x7

    .line 525
    goto/16 :goto_17

    .line 526
    .line 527
    :goto_10
    add-int/lit8 v1, v1, -0x30

    .line 528
    .line 529
    neg-int v1, v1

    .line 530
    int-to-long v7, v1

    .line 531
    const/4 v6, 0x2

    .line 532
    goto/16 :goto_17

    .line 533
    .line 534
    :cond_29
    :goto_11
    invoke-virtual {v0, v1}, LO2/a;->s(C)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-nez v1, :cond_1c

    .line 539
    .line 540
    goto :goto_d

    .line 541
    :goto_12
    if-ne v6, v1, :cond_2e

    .line 542
    .line 543
    if-eqz v11, :cond_2a

    .line 544
    .line 545
    const-wide/high16 v1, -0x8000000000000000L

    .line 546
    .line 547
    cmp-long v1, v7, v1

    .line 548
    .line 549
    if-nez v1, :cond_2b

    .line 550
    .line 551
    if-eqz v15, :cond_2a

    .line 552
    .line 553
    goto :goto_13

    .line 554
    :cond_2a
    const/4 v1, 0x2

    .line 555
    goto :goto_15

    .line 556
    :cond_2b
    :goto_13
    cmp-long v1, v7, v13

    .line 557
    .line 558
    if-nez v1, :cond_2c

    .line 559
    .line 560
    if-nez v15, :cond_2a

    .line 561
    .line 562
    :cond_2c
    if-eqz v15, :cond_2d

    .line 563
    .line 564
    goto :goto_14

    .line 565
    :cond_2d
    neg-long v7, v7

    .line 566
    :goto_14
    iput-wide v7, v0, LO2/a;->s:J

    .line 567
    .line 568
    iget v1, v0, LO2/a;->n:I

    .line 569
    .line 570
    add-int/2addr v1, v9

    .line 571
    iput v1, v0, LO2/a;->n:I

    .line 572
    .line 573
    const/16 v10, 0xf

    .line 574
    .line 575
    iput v10, v0, LO2/a;->r:I

    .line 576
    .line 577
    goto :goto_18

    .line 578
    :cond_2e
    :goto_15
    if-eq v6, v1, :cond_2f

    .line 579
    .line 580
    const/4 v1, 0x4

    .line 581
    if-eq v6, v1, :cond_2f

    .line 582
    .line 583
    const/4 v1, 0x7

    .line 584
    if-ne v6, v1, :cond_1c

    .line 585
    .line 586
    :cond_2f
    iput v9, v0, LO2/a;->t:I

    .line 587
    .line 588
    const/16 v10, 0x10

    .line 589
    .line 590
    iput v10, v0, LO2/a;->r:I

    .line 591
    .line 592
    goto :goto_18

    .line 593
    :cond_30
    move/from16 v16, v4

    .line 594
    .line 595
    const/4 v1, 0x2

    .line 596
    if-ne v6, v1, :cond_1c

    .line 597
    .line 598
    const/4 v6, 0x3

    .line 599
    goto :goto_17

    .line 600
    :cond_31
    move/from16 v16, v4

    .line 601
    .line 602
    const/4 v1, 0x2

    .line 603
    if-nez v6, :cond_32

    .line 604
    .line 605
    const/4 v6, 0x1

    .line 606
    const/4 v15, 0x1

    .line 607
    goto :goto_17

    .line 608
    :cond_32
    const/4 v3, 0x5

    .line 609
    if-ne v6, v3, :cond_1c

    .line 610
    .line 611
    :goto_16
    move v6, v12

    .line 612
    goto :goto_17

    .line 613
    :cond_33
    move/from16 v16, v4

    .line 614
    .line 615
    const/4 v1, 0x2

    .line 616
    const/4 v3, 0x5

    .line 617
    if-eq v6, v1, :cond_34

    .line 618
    .line 619
    const/4 v1, 0x4

    .line 620
    if-ne v6, v1, :cond_1c

    .line 621
    .line 622
    :cond_34
    move v6, v3

    .line 623
    goto :goto_17

    .line 624
    :cond_35
    move/from16 v16, v4

    .line 625
    .line 626
    const/4 v3, 0x5

    .line 627
    if-ne v6, v3, :cond_1c

    .line 628
    .line 629
    goto :goto_16

    .line 630
    :cond_36
    :goto_17
    add-int/lit8 v9, v9, 0x1

    .line 631
    .line 632
    move/from16 v4, v16

    .line 633
    .line 634
    const/4 v3, 0x1

    .line 635
    const/4 v10, 0x4

    .line 636
    goto/16 :goto_b

    .line 637
    .line 638
    :goto_18
    if-eqz v10, :cond_37

    .line 639
    .line 640
    return v10

    .line 641
    :cond_37
    iget v1, v0, LO2/a;->n:I

    .line 642
    .line 643
    aget-char v1, v5, v1

    .line 644
    .line 645
    invoke-virtual {v0, v1}, LO2/a;->s(C)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_38

    .line 650
    .line 651
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 652
    .line 653
    .line 654
    const/16 v1, 0xa

    .line 655
    .line 656
    iput v1, v0, LO2/a;->r:I

    .line 657
    .line 658
    return v1

    .line 659
    :cond_38
    const-string v1, "Expected value"

    .line 660
    .line 661
    invoke-virtual {v0, v1}, LO2/a;->L(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    const/4 v1, 0x0

    .line 665
    throw v1

    .line 666
    :cond_39
    move v1, v3

    .line 667
    iput v1, v0, LO2/a;->r:I

    .line 668
    .line 669
    return v1

    .line 670
    :cond_3a
    move v1, v3

    .line 671
    if-ne v4, v1, :cond_3d

    .line 672
    .line 673
    const/4 v2, 0x4

    .line 674
    iput v2, v0, LO2/a;->r:I

    .line 675
    .line 676
    return v2

    .line 677
    :cond_3b
    move v2, v7

    .line 678
    iput v2, v0, LO2/a;->r:I

    .line 679
    .line 680
    return v2

    .line 681
    :cond_3c
    move v1, v3

    .line 682
    :cond_3d
    if-eq v4, v1, :cond_3f

    .line 683
    .line 684
    const/4 v2, 0x2

    .line 685
    if-ne v4, v2, :cond_3e

    .line 686
    .line 687
    goto :goto_19

    .line 688
    :cond_3e
    const-string v1, "Unexpected value"

    .line 689
    .line 690
    invoke-virtual {v0, v1}, LO2/a;->L(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    const/4 v1, 0x0

    .line 694
    throw v1

    .line 695
    :cond_3f
    :goto_19
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 696
    .line 697
    .line 698
    iget v2, v0, LO2/a;->n:I

    .line 699
    .line 700
    sub-int/2addr v2, v1

    .line 701
    iput v2, v0, LO2/a;->n:I

    .line 702
    .line 703
    const/4 v1, 0x7

    .line 704
    iput v1, v0, LO2/a;->r:I

    .line 705
    .line 706
    return v1

    .line 707
    :cond_40
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 708
    .line 709
    .line 710
    const/16 v1, 0x8

    .line 711
    .line 712
    iput v1, v0, LO2/a;->r:I

    .line 713
    .line 714
    return v1

    .line 715
    :cond_41
    const/16 v1, 0x9

    .line 716
    .line 717
    iput v1, v0, LO2/a;->r:I

    .line 718
    .line 719
    return v1

    .line 720
    :cond_42
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 721
    .line 722
    const-string v2, "JsonReader is closed"

    .line 723
    .line 724
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    throw v1

    .line 728
    :cond_43
    const/4 v3, 0x4

    .line 729
    :goto_1a
    aput v3, v1, v2

    .line 730
    .line 731
    const/4 v1, 0x5

    .line 732
    if-ne v4, v1, :cond_46

    .line 733
    .line 734
    const/4 v1, 0x1

    .line 735
    invoke-virtual {v0, v1}, LO2/a;->z(Z)I

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eq v2, v15, :cond_46

    .line 740
    .line 741
    if-eq v2, v14, :cond_45

    .line 742
    .line 743
    if-ne v2, v9, :cond_44

    .line 744
    .line 745
    const/4 v1, 0x2

    .line 746
    iput v1, v0, LO2/a;->r:I

    .line 747
    .line 748
    return v1

    .line 749
    :cond_44
    const-string v1, "Unterminated object"

    .line 750
    .line 751
    invoke-virtual {v0, v1}, LO2/a;->L(Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    const/4 v1, 0x0

    .line 755
    throw v1

    .line 756
    :cond_45
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 757
    .line 758
    .line 759
    :cond_46
    const/4 v1, 0x1

    .line 760
    invoke-virtual {v0, v1}, LO2/a;->z(Z)I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    const/16 v3, 0x22

    .line 765
    .line 766
    if-eq v2, v3, :cond_4b

    .line 767
    .line 768
    if-eq v2, v11, :cond_4a

    .line 769
    .line 770
    const-string v3, "Expected name"

    .line 771
    .line 772
    if-eq v2, v9, :cond_48

    .line 773
    .line 774
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 775
    .line 776
    .line 777
    iget v4, v0, LO2/a;->n:I

    .line 778
    .line 779
    sub-int/2addr v4, v1

    .line 780
    iput v4, v0, LO2/a;->n:I

    .line 781
    .line 782
    int-to-char v1, v2

    .line 783
    invoke-virtual {v0, v1}, LO2/a;->s(C)Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v1, :cond_47

    .line 788
    .line 789
    const/16 v1, 0xe

    .line 790
    .line 791
    iput v1, v0, LO2/a;->r:I

    .line 792
    .line 793
    return v1

    .line 794
    :cond_47
    invoke-virtual {v0, v3}, LO2/a;->L(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    const/4 v1, 0x0

    .line 798
    throw v1

    .line 799
    :cond_48
    const/4 v1, 0x0

    .line 800
    const/4 v2, 0x5

    .line 801
    if-eq v4, v2, :cond_49

    .line 802
    .line 803
    const/4 v2, 0x2

    .line 804
    iput v2, v0, LO2/a;->r:I

    .line 805
    .line 806
    return v2

    .line 807
    :cond_49
    invoke-virtual {v0, v3}, LO2/a;->L(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    throw v1

    .line 811
    :cond_4a
    invoke-virtual/range {p0 .. p0}, LO2/a;->c()V

    .line 812
    .line 813
    .line 814
    const/16 v1, 0xc

    .line 815
    .line 816
    iput v1, v0, LO2/a;->r:I

    .line 817
    .line 818
    return v1

    .line 819
    :cond_4b
    const/16 v1, 0xd

    .line 820
    .line 821
    iput v1, v0, LO2/a;->r:I

    .line 822
    .line 823
    return v1
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
.end method

.method public k()V
    .locals 3

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x4

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, LO2/a;->w:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    iput v1, p0, LO2/a;->w:I

    .line 17
    .line 18
    iget-object v1, p0, LO2/a;->y:[I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x2

    .line 21
    .line 22
    aget v2, v1, v0

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v1, v0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, LO2/a;->r:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string v0, "END_ARRAY"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    throw v0
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

.method public l()V
    .locals 5

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x2

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, LO2/a;->w:I

    .line 13
    .line 14
    add-int/lit8 v2, v0, -0x1

    .line 15
    .line 16
    iput v2, p0, LO2/a;->w:I

    .line 17
    .line 18
    iget-object v3, p0, LO2/a;->x:[Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput-object v4, v3, v2

    .line 22
    .line 23
    iget-object v2, p0, LO2/a;->y:[I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    aget v1, v2, v0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    aput v1, v2, v0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, LO2/a;->r:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string v0, "END_OBJECT"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    throw v0
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

.method public final n(I)Z
    .locals 7

    .line 1
    iget v0, p0, LO2/a;->q:I

    .line 2
    .line 3
    iget v1, p0, LO2/a;->n:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iput v0, p0, LO2/a;->q:I

    .line 7
    .line 8
    iget v0, p0, LO2/a;->o:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, LO2/a;->m:[C

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iput v0, p0, LO2/a;->o:I

    .line 17
    .line 18
    invoke-static {v3, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput v2, p0, LO2/a;->o:I

    .line 23
    .line 24
    :goto_0
    iput v2, p0, LO2/a;->n:I

    .line 25
    .line 26
    :cond_1
    iget v0, p0, LO2/a;->o:I

    .line 27
    .line 28
    array-length v1, v3

    .line 29
    sub-int/2addr v1, v0

    .line 30
    iget-object v4, p0, LO2/a;->l:Ljava/io/Reader;

    .line 31
    .line 32
    invoke-virtual {v4, v3, v0, v1}, Ljava/io/Reader;->read([CII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, -0x1

    .line 37
    if-eq v0, v1, :cond_3

    .line 38
    .line 39
    iget v1, p0, LO2/a;->o:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    iput v1, p0, LO2/a;->o:I

    .line 43
    .line 44
    iget v0, p0, LO2/a;->p:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    iget v0, p0, LO2/a;->q:I

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    if-lez v1, :cond_2

    .line 54
    .line 55
    aget-char v5, v3, v2

    .line 56
    .line 57
    const v6, 0xfeff

    .line 58
    .line 59
    .line 60
    if-ne v5, v6, :cond_2

    .line 61
    .line 62
    iget v5, p0, LO2/a;->n:I

    .line 63
    .line 64
    add-int/2addr v5, v4

    .line 65
    iput v5, p0, LO2/a;->n:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    iput v0, p0, LO2/a;->q:I

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    :cond_2
    if-lt v1, p1, :cond_1

    .line 74
    .line 75
    return v4

    .line 76
    :cond_3
    return v2
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

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LO2/a;->p(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method public final p(Z)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, LO2/a;->w:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    iget-object v3, p0, LO2/a;->v:[I

    .line 14
    .line 15
    aget v3, v3, v1

    .line 16
    .line 17
    packed-switch v3, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/lang/AssertionError;

    .line 21
    .line 22
    const-string v0, "Unknown scope value: "

    .line 23
    .line 24
    invoke-static {v0, v3}, Lb3/a;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :pswitch_0
    const/16 v2, 0x2e

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, LO2/a;->x:[Ljava/lang/String;

    .line 38
    .line 39
    aget-object v2, v2, v1

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :pswitch_1
    iget-object v3, p0, LO2/a;->y:[I

    .line 48
    .line 49
    aget v3, v3, v1

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    if-lez v3, :cond_0

    .line 54
    .line 55
    add-int/lit8 v2, v2, -0x1

    .line 56
    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    .line 59
    add-int/lit8 v3, v3, -0x1

    .line 60
    .line 61
    :cond_0
    const/16 v2, 0x5b

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x5d

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_1
    :pswitch_2
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
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

.method public q()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LO2/a;->p(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method public r()Z
    .locals 2

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x11

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0
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

.method public final s(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0xd

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x20

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x23

    .line 22
    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x2c

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x2f

    .line 30
    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    const/16 v0, 0x3d

    .line 34
    .line 35
    if-eq p1, v0, :cond_0

    .line 36
    .line 37
    const/16 v0, 0x7b

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x7d

    .line 42
    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    const/16 v0, 0x3a

    .line 46
    .line 47
    if-eq p1, v0, :cond_1

    .line 48
    .line 49
    const/16 v0, 0x3b

    .line 50
    .line 51
    if-eq p1, v0, :cond_0

    .line 52
    .line 53
    packed-switch p1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_0
    :pswitch_0
    invoke-virtual {p0}, LO2/a;->c()V

    .line 59
    .line 60
    .line 61
    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    .line 62
    return p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method final t()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LO2/a;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, LO2/a;->n:I

    .line 6
    .line 7
    iget v2, p0, LO2/a;->q:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, " at line "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, " column "

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, " path "

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LO2/a;->o()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public u()Z
    .locals 5

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, LO2/a;->r:I

    .line 15
    .line 16
    iget-object v0, p0, LO2/a;->y:[I

    .line 17
    .line 18
    iget v1, p0, LO2/a;->w:I

    .line 19
    .line 20
    sub-int/2addr v1, v3

    .line 21
    aget v2, v0, v1

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    aput v2, v0, v1

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    const/4 v1, 0x6

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    iput v2, p0, LO2/a;->r:I

    .line 31
    .line 32
    iget-object v0, p0, LO2/a;->y:[I

    .line 33
    .line 34
    iget v1, p0, LO2/a;->w:I

    .line 35
    .line 36
    sub-int/2addr v1, v3

    .line 37
    aget v4, v0, v1

    .line 38
    .line 39
    add-int/2addr v4, v3

    .line 40
    aput v4, v0, v1

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    const-string v0, "a boolean"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    throw v0
    .line 50
    .line 51
.end method

.method public v()D
    .locals 7

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    const/16 v2, 0xf

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iput v3, p0, LO2/a;->r:I

    .line 16
    .line 17
    iget-object v0, p0, LO2/a;->y:[I

    .line 18
    .line 19
    iget v2, p0, LO2/a;->w:I

    .line 20
    .line 21
    sub-int/2addr v2, v1

    .line 22
    aget v3, v0, v2

    .line 23
    .line 24
    add-int/2addr v3, v1

    .line 25
    aput v3, v0, v2

    .line 26
    .line 27
    iget-wide v0, p0, LO2/a;->s:J

    .line 28
    .line 29
    long-to-double v0, v0

    .line 30
    return-wide v0

    .line 31
    :cond_1
    const/16 v2, 0x10

    .line 32
    .line 33
    const/16 v4, 0xb

    .line 34
    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    iget v2, p0, LO2/a;->n:I

    .line 40
    .line 41
    iget v5, p0, LO2/a;->t:I

    .line 42
    .line 43
    iget-object v6, p0, LO2/a;->m:[C

    .line 44
    .line 45
    invoke-direct {v0, v6, v2, v5}, Ljava/lang/String;-><init>([CII)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 49
    .line 50
    iget v0, p0, LO2/a;->n:I

    .line 51
    .line 52
    iget v2, p0, LO2/a;->t:I

    .line 53
    .line 54
    add-int/2addr v0, v2

    .line 55
    iput v0, p0, LO2/a;->n:I

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v2, 0x8

    .line 59
    .line 60
    if-eq v0, v2, :cond_6

    .line 61
    .line 62
    const/16 v5, 0x9

    .line 63
    .line 64
    if-ne v0, v5, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/16 v2, 0xa

    .line 68
    .line 69
    if-ne v0, v2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, LO2/a;->D()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    if-ne v0, v4, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    const-string v0, "a double"

    .line 82
    .line 83
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    throw v0

    .line 88
    :cond_6
    :goto_0
    if-ne v0, v2, :cond_7

    .line 89
    .line 90
    const/16 v0, 0x27

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_7
    const/16 v0, 0x22

    .line 94
    .line 95
    :goto_1
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 100
    .line 101
    :goto_2
    iput v4, p0, LO2/a;->r:I

    .line 102
    .line 103
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    iget v0, p0, LO2/a;->z:I

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    if-eq v0, v1, :cond_9

    .line 113
    .line 114
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v1, "JSON forbids NaN and infinities: "

    .line 130
    .line 131
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0, v0}, LO2/a;->L(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v2

    .line 145
    :cond_9
    :goto_3
    iput-object v2, p0, LO2/a;->u:Ljava/lang/String;

    .line 146
    .line 147
    iput v3, p0, LO2/a;->r:I

    .line 148
    .line 149
    iget-object v0, p0, LO2/a;->y:[I

    .line 150
    .line 151
    iget v2, p0, LO2/a;->w:I

    .line 152
    .line 153
    sub-int/2addr v2, v1

    .line 154
    aget v3, v0, v2

    .line 155
    .line 156
    add-int/2addr v3, v1

    .line 157
    aput v3, v0, v2

    .line 158
    .line 159
    return-wide v4
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

.method public w()I
    .locals 7

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xf

    .line 10
    .line 11
    const-string v2, "Expected an int but was "

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne v0, v1, :cond_2

    .line 15
    .line 16
    iget-wide v0, p0, LO2/a;->s:J

    .line 17
    .line 18
    long-to-int v4, v0

    .line 19
    int-to-long v5, v4

    .line 20
    cmp-long v0, v0, v5

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput v3, p0, LO2/a;->r:I

    .line 25
    .line 26
    iget-object v0, p0, LO2/a;->y:[I

    .line 27
    .line 28
    iget v1, p0, LO2/a;->w:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    aget v2, v0, v1

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    aput v2, v0, v1

    .line 37
    .line 38
    return v4

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v2, p0, LO2/a;->s:J

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    const/16 v1, 0x10

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    new-instance v0, Ljava/lang/String;

    .line 71
    .line 72
    iget v1, p0, LO2/a;->n:I

    .line 73
    .line 74
    iget v4, p0, LO2/a;->t:I

    .line 75
    .line 76
    iget-object v5, p0, LO2/a;->m:[C

    .line 77
    .line 78
    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 82
    .line 83
    iget v0, p0, LO2/a;->n:I

    .line 84
    .line 85
    iget v1, p0, LO2/a;->t:I

    .line 86
    .line 87
    add-int/2addr v0, v1

    .line 88
    iput v0, p0, LO2/a;->n:I

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    const/16 v1, 0xa

    .line 92
    .line 93
    const/16 v4, 0x8

    .line 94
    .line 95
    if-eq v0, v4, :cond_5

    .line 96
    .line 97
    const/16 v5, 0x9

    .line 98
    .line 99
    if-eq v0, v5, :cond_5

    .line 100
    .line 101
    if-ne v0, v1, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    const-string v0, "an int"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    throw v0

    .line 111
    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0}, LO2/a;->D()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    if-ne v0, v4, :cond_7

    .line 121
    .line 122
    const/16 v0, 0x27

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    const/16 v0, 0x22

    .line 126
    .line 127
    :goto_1
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 132
    .line 133
    :goto_2
    :try_start_0
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iput v3, p0, LO2/a;->r:I

    .line 140
    .line 141
    iget-object v1, p0, LO2/a;->y:[I

    .line 142
    .line 143
    iget v4, p0, LO2/a;->w:I

    .line 144
    .line 145
    add-int/lit8 v4, v4, -0x1

    .line 146
    .line 147
    aget v5, v1, v4

    .line 148
    .line 149
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    aput v5, v1, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    return v0

    .line 154
    :catch_0
    :goto_3
    const/16 v0, 0xb

    .line 155
    .line 156
    iput v0, p0, LO2/a;->r:I

    .line 157
    .line 158
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    double-to-int v4, v0

    .line 165
    int-to-double v5, v4

    .line 166
    cmpl-double v0, v5, v0

    .line 167
    .line 168
    if-nez v0, :cond_8

    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 172
    .line 173
    iput v3, p0, LO2/a;->r:I

    .line 174
    .line 175
    iget-object v0, p0, LO2/a;->y:[I

    .line 176
    .line 177
    iget v1, p0, LO2/a;->w:I

    .line 178
    .line 179
    add-int/lit8 v1, v1, -0x1

    .line 180
    .line 181
    aget v2, v0, v1

    .line 182
    .line 183
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    aput v2, v0, v1

    .line 186
    .line 187
    return v4

    .line 188
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iget-object v2, p0, LO2/a;->u:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v0
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

.method public x()J
    .locals 7

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xf

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, LO2/a;->r:I

    .line 15
    .line 16
    iget-object v0, p0, LO2/a;->y:[I

    .line 17
    .line 18
    iget v1, p0, LO2/a;->w:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    aget v2, v0, v1

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v0, v1

    .line 27
    .line 28
    iget-wide v0, p0, LO2/a;->s:J

    .line 29
    .line 30
    return-wide v0

    .line 31
    :cond_1
    const/16 v1, 0x10

    .line 32
    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/lang/String;

    .line 36
    .line 37
    iget v1, p0, LO2/a;->n:I

    .line 38
    .line 39
    iget v3, p0, LO2/a;->t:I

    .line 40
    .line 41
    iget-object v4, p0, LO2/a;->m:[C

    .line 42
    .line 43
    invoke-direct {v0, v4, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 47
    .line 48
    iget v0, p0, LO2/a;->n:I

    .line 49
    .line 50
    iget v1, p0, LO2/a;->t:I

    .line 51
    .line 52
    add-int/2addr v0, v1

    .line 53
    iput v0, p0, LO2/a;->n:I

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    const/16 v1, 0xa

    .line 57
    .line 58
    const/16 v3, 0x8

    .line 59
    .line 60
    if-eq v0, v3, :cond_4

    .line 61
    .line 62
    const/16 v4, 0x9

    .line 63
    .line 64
    if-eq v0, v4, :cond_4

    .line 65
    .line 66
    if-ne v0, v1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const-string v0, "a long"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    throw v0

    .line 76
    :cond_4
    :goto_0
    if-ne v0, v1, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0}, LO2/a;->D()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    if-ne v0, v3, :cond_6

    .line 86
    .line 87
    const/16 v0, 0x27

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    const/16 v0, 0x22

    .line 91
    .line 92
    :goto_1
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 97
    .line 98
    :goto_2
    :try_start_0
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    iput v2, p0, LO2/a;->r:I

    .line 105
    .line 106
    iget-object v3, p0, LO2/a;->y:[I

    .line 107
    .line 108
    iget v4, p0, LO2/a;->w:I

    .line 109
    .line 110
    add-int/lit8 v4, v4, -0x1

    .line 111
    .line 112
    aget v5, v3, v4

    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    aput v5, v3, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    return-wide v0

    .line 119
    :catch_0
    :goto_3
    const/16 v0, 0xb

    .line 120
    .line 121
    iput v0, p0, LO2/a;->r:I

    .line 122
    .line 123
    iget-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    double-to-long v3, v0

    .line 130
    long-to-double v5, v3

    .line 131
    cmpl-double v0, v5, v0

    .line 132
    .line 133
    if-nez v0, :cond_7

    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    iput-object v0, p0, LO2/a;->u:Ljava/lang/String;

    .line 137
    .line 138
    iput v2, p0, LO2/a;->r:I

    .line 139
    .line 140
    iget-object v0, p0, LO2/a;->y:[I

    .line 141
    .line 142
    iget v1, p0, LO2/a;->w:I

    .line 143
    .line 144
    add-int/lit8 v1, v1, -0x1

    .line 145
    .line 146
    aget v2, v0, v1

    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    aput v2, v0, v1

    .line 151
    .line 152
    return-wide v3

    .line 153
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 154
    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v2, "Expected a long but was "

    .line 158
    .line 159
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v2, p0, LO2/a;->u:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0
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

.method public y()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LO2/a;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LO2/a;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xe

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LO2/a;->D()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0xc

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0xd

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-virtual {p0, v0}, LO2/a;->B(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    const/4 v1, 0x0

    .line 40
    iput v1, p0, LO2/a;->r:I

    .line 41
    .line 42
    iget-object v1, p0, LO2/a;->x:[Ljava/lang/String;

    .line 43
    .line 44
    iget v2, p0, LO2/a;->w:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, -0x1

    .line 47
    .line 48
    aput-object v0, v1, v2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    const-string v0, "a name"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, LO2/a;->M(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    throw v0
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

.method public final z(Z)I
    .locals 9

    .line 1
    iget v0, p0, LO2/a;->n:I

    .line 2
    .line 3
    iget v1, p0, LO2/a;->o:I

    .line 4
    .line 5
    :goto_0
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iput v0, p0, LO2/a;->n:I

    .line 9
    .line 10
    invoke-virtual {p0, v2}, LO2/a;->n(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "End of input"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LO2/a;->t()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iget v0, p0, LO2/a;->n:I

    .line 45
    .line 46
    iget v1, p0, LO2/a;->o:I

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 49
    .line 50
    iget-object v4, p0, LO2/a;->m:[C

    .line 51
    .line 52
    aget-char v5, v4, v0

    .line 53
    .line 54
    const/16 v6, 0xa

    .line 55
    .line 56
    if-ne v5, v6, :cond_3

    .line 57
    .line 58
    iget v0, p0, LO2/a;->p:I

    .line 59
    .line 60
    add-int/2addr v0, v2

    .line 61
    iput v0, p0, LO2/a;->p:I

    .line 62
    .line 63
    iput v3, p0, LO2/a;->q:I

    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_3
    const/16 v7, 0x20

    .line 68
    .line 69
    if-eq v5, v7, :cond_f

    .line 70
    .line 71
    const/16 v7, 0xd

    .line 72
    .line 73
    if-eq v5, v7, :cond_f

    .line 74
    .line 75
    const/16 v7, 0x9

    .line 76
    .line 77
    if-ne v5, v7, :cond_4

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_4
    const/16 v7, 0x2f

    .line 82
    .line 83
    if-ne v5, v7, :cond_d

    .line 84
    .line 85
    iput v3, p0, LO2/a;->n:I

    .line 86
    .line 87
    const/4 v8, 0x2

    .line 88
    if-ne v3, v1, :cond_5

    .line 89
    .line 90
    iput v0, p0, LO2/a;->n:I

    .line 91
    .line 92
    invoke-virtual {p0, v8}, LO2/a;->n(I)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v1, p0, LO2/a;->n:I

    .line 97
    .line 98
    add-int/2addr v1, v2

    .line 99
    iput v1, p0, LO2/a;->n:I

    .line 100
    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    return v5

    .line 104
    :cond_5
    invoke-virtual {p0}, LO2/a;->c()V

    .line 105
    .line 106
    .line 107
    iget v0, p0, LO2/a;->n:I

    .line 108
    .line 109
    aget-char v1, v4, v0

    .line 110
    .line 111
    const/16 v3, 0x2a

    .line 112
    .line 113
    if-eq v1, v3, :cond_7

    .line 114
    .line 115
    if-eq v1, v7, :cond_6

    .line 116
    .line 117
    return v5

    .line 118
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    iput v0, p0, LO2/a;->n:I

    .line 121
    .line 122
    invoke-virtual {p0}, LO2/a;->I()V

    .line 123
    .line 124
    .line 125
    iget v0, p0, LO2/a;->n:I

    .line 126
    .line 127
    iget v1, p0, LO2/a;->o:I

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 131
    .line 132
    iput v0, p0, LO2/a;->n:I

    .line 133
    .line 134
    :goto_1
    iget v0, p0, LO2/a;->n:I

    .line 135
    .line 136
    add-int/2addr v0, v8

    .line 137
    iget v1, p0, LO2/a;->o:I

    .line 138
    .line 139
    if-le v0, v1, :cond_9

    .line 140
    .line 141
    invoke-virtual {p0, v8}, LO2/a;->n(I)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_8
    const-string p1, "Unterminated comment"

    .line 149
    .line 150
    invoke-virtual {p0, p1}, LO2/a;->L(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x0

    .line 154
    throw p1

    .line 155
    :cond_9
    :goto_2
    iget v0, p0, LO2/a;->n:I

    .line 156
    .line 157
    aget-char v1, v4, v0

    .line 158
    .line 159
    if-ne v1, v6, :cond_a

    .line 160
    .line 161
    iget v1, p0, LO2/a;->p:I

    .line 162
    .line 163
    add-int/2addr v1, v2

    .line 164
    iput v1, p0, LO2/a;->p:I

    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    iput v0, p0, LO2/a;->q:I

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_a
    const/4 v0, 0x0

    .line 172
    :goto_3
    if-ge v0, v8, :cond_c

    .line 173
    .line 174
    iget v1, p0, LO2/a;->n:I

    .line 175
    .line 176
    add-int/2addr v1, v0

    .line 177
    aget-char v1, v4, v1

    .line 178
    .line 179
    const-string v3, "*/"

    .line 180
    .line 181
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eq v1, v3, :cond_b

    .line 186
    .line 187
    :goto_4
    iget v0, p0, LO2/a;->n:I

    .line 188
    .line 189
    add-int/2addr v0, v2

    .line 190
    iput v0, p0, LO2/a;->n:I

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_c
    iget v0, p0, LO2/a;->n:I

    .line 197
    .line 198
    add-int/2addr v0, v8

    .line 199
    iget v1, p0, LO2/a;->o:I

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_d
    const/16 v0, 0x23

    .line 204
    .line 205
    if-ne v5, v0, :cond_e

    .line 206
    .line 207
    iput v3, p0, LO2/a;->n:I

    .line 208
    .line 209
    invoke-virtual {p0}, LO2/a;->c()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, LO2/a;->I()V

    .line 213
    .line 214
    .line 215
    iget v0, p0, LO2/a;->n:I

    .line 216
    .line 217
    iget v1, p0, LO2/a;->o:I

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_e
    iput v3, p0, LO2/a;->n:I

    .line 222
    .line 223
    return v5

    .line 224
    :cond_f
    :goto_5
    move v0, v3

    .line 225
    goto/16 :goto_0
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
