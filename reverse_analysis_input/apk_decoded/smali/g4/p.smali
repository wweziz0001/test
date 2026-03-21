.class public final Lg4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/t;
.implements Ljava/nio/channels/ReadableByteChannel;


# instance fields
.field public final l:Lg4/t;

.field public final m:Lg4/a;

.field public n:Z


# direct methods
.method public constructor <init>(Lg4/t;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg4/p;->l:Lg4/t;

    .line 10
    .line 11
    new-instance p1, Lg4/a;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lg4/p;->m:Lg4/a;

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
.method public final a()I
    .locals 3

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lg4/p;->k(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lg4/a;->n()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, -0x1000000

    .line 13
    .line 14
    and-int/2addr v1, v0

    .line 15
    ushr-int/lit8 v1, v1, 0x18

    .line 16
    .line 17
    const/high16 v2, 0xff0000

    .line 18
    .line 19
    and-int/2addr v2, v0

    .line 20
    ushr-int/lit8 v2, v2, 0x8

    .line 21
    .line 22
    or-int/2addr v1, v2

    .line 23
    const v2, 0xff00

    .line 24
    .line 25
    .line 26
    and-int/2addr v2, v0

    .line 27
    shl-int/lit8 v2, v2, 0x8

    .line 28
    .line 29
    or-int/2addr v1, v2

    .line 30
    and-int/lit16 v0, v0, 0xff

    .line 31
    .line 32
    shl-int/lit8 v0, v0, 0x18

    .line 33
    .line 34
    or-int/2addr v0, v1

    .line 35
    return v0
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

.method public final b()J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lg4/p;->k(J)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lg4/p;->m:Lg4/a;

    .line 9
    .line 10
    iget-wide v2, v1, Lg4/a;->m:J

    .line 11
    .line 12
    const-wide/16 v4, 0x8

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    if-ltz v2, :cond_2

    .line 17
    .line 18
    iget-object v2, v1, Lg4/a;->l:Lg4/q;

    .line 19
    .line 20
    invoke-static {v2}, LN3/h;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget v3, v2, Lg4/q;->b:I

    .line 24
    .line 25
    iget v6, v2, Lg4/q;->c:I

    .line 26
    .line 27
    sub-int v7, v6, v3

    .line 28
    .line 29
    int-to-long v7, v7

    .line 30
    cmp-long v7, v7, v4

    .line 31
    .line 32
    const/16 v10, 0x28

    .line 33
    .line 34
    const/16 v11, 0x38

    .line 35
    .line 36
    const-wide/16 v12, 0xff

    .line 37
    .line 38
    const/16 v14, 0x20

    .line 39
    .line 40
    if-gez v7, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Lg4/a;->n()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-long v2, v2

    .line 47
    const-wide v4, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v2, v4

    .line 53
    shl-long/2addr v2, v14

    .line 54
    invoke-virtual {v1}, Lg4/a;->n()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-long v6, v1

    .line 59
    and-long/2addr v4, v6

    .line 60
    or-long v1, v2, v4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    add-int/lit8 v7, v3, 0x1

    .line 64
    .line 65
    iget-object v15, v2, Lg4/q;->a:[B

    .line 66
    .line 67
    aget-byte v4, v15, v3

    .line 68
    .line 69
    int-to-long v4, v4

    .line 70
    and-long/2addr v4, v12

    .line 71
    shl-long/2addr v4, v11

    .line 72
    add-int/lit8 v16, v3, 0x2

    .line 73
    .line 74
    aget-byte v7, v15, v7

    .line 75
    .line 76
    int-to-long v8, v7

    .line 77
    and-long v7, v8, v12

    .line 78
    .line 79
    const/16 v9, 0x30

    .line 80
    .line 81
    shl-long/2addr v7, v9

    .line 82
    or-long/2addr v4, v7

    .line 83
    add-int/lit8 v7, v3, 0x3

    .line 84
    .line 85
    aget-byte v8, v15, v16

    .line 86
    .line 87
    int-to-long v8, v8

    .line 88
    and-long/2addr v8, v12

    .line 89
    shl-long/2addr v8, v10

    .line 90
    or-long/2addr v4, v8

    .line 91
    add-int/lit8 v8, v3, 0x4

    .line 92
    .line 93
    aget-byte v7, v15, v7

    .line 94
    .line 95
    int-to-long v10, v7

    .line 96
    and-long/2addr v10, v12

    .line 97
    shl-long/2addr v10, v14

    .line 98
    or-long/2addr v4, v10

    .line 99
    add-int/lit8 v7, v3, 0x5

    .line 100
    .line 101
    aget-byte v8, v15, v8

    .line 102
    .line 103
    int-to-long v10, v8

    .line 104
    and-long/2addr v10, v12

    .line 105
    const/16 v8, 0x18

    .line 106
    .line 107
    shl-long/2addr v10, v8

    .line 108
    or-long/2addr v4, v10

    .line 109
    add-int/lit8 v8, v3, 0x6

    .line 110
    .line 111
    aget-byte v7, v15, v7

    .line 112
    .line 113
    int-to-long v10, v7

    .line 114
    and-long/2addr v10, v12

    .line 115
    const/16 v7, 0x10

    .line 116
    .line 117
    shl-long/2addr v10, v7

    .line 118
    or-long/2addr v4, v10

    .line 119
    add-int/lit8 v7, v3, 0x7

    .line 120
    .line 121
    aget-byte v8, v15, v8

    .line 122
    .line 123
    int-to-long v10, v8

    .line 124
    and-long/2addr v10, v12

    .line 125
    const/16 v8, 0x8

    .line 126
    .line 127
    shl-long/2addr v10, v8

    .line 128
    or-long/2addr v4, v10

    .line 129
    add-int/2addr v3, v8

    .line 130
    aget-byte v7, v15, v7

    .line 131
    .line 132
    int-to-long v7, v7

    .line 133
    and-long/2addr v7, v12

    .line 134
    or-long/2addr v4, v7

    .line 135
    iget-wide v7, v1, Lg4/a;->m:J

    .line 136
    .line 137
    const-wide/16 v10, 0x8

    .line 138
    .line 139
    sub-long/2addr v7, v10

    .line 140
    iput-wide v7, v1, Lg4/a;->m:J

    .line 141
    .line 142
    if-ne v3, v6, :cond_1

    .line 143
    .line 144
    invoke-virtual {v2}, Lg4/q;->a()Lg4/q;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iput-object v3, v1, Lg4/a;->l:Lg4/q;

    .line 149
    .line 150
    invoke-static {v2}, Lg4/r;->a(Lg4/q;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    iput v3, v2, Lg4/q;->b:I

    .line 155
    .line 156
    :goto_0
    move-wide v1, v4

    .line 157
    :goto_1
    const-wide/high16 v3, -0x100000000000000L

    .line 158
    .line 159
    and-long/2addr v3, v1

    .line 160
    const/16 v5, 0x38

    .line 161
    .line 162
    ushr-long/2addr v3, v5

    .line 163
    const-wide/high16 v5, 0xff000000000000L

    .line 164
    .line 165
    and-long/2addr v5, v1

    .line 166
    const/16 v7, 0x28

    .line 167
    .line 168
    ushr-long/2addr v5, v7

    .line 169
    or-long/2addr v3, v5

    .line 170
    const-wide v5, 0xff0000000000L

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    and-long/2addr v5, v1

    .line 176
    const/16 v7, 0x18

    .line 177
    .line 178
    ushr-long/2addr v5, v7

    .line 179
    or-long/2addr v3, v5

    .line 180
    const-wide v5, 0xff00000000L

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    and-long/2addr v5, v1

    .line 186
    const/16 v7, 0x8

    .line 187
    .line 188
    ushr-long/2addr v5, v7

    .line 189
    or-long/2addr v3, v5

    .line 190
    const-wide v5, 0xff000000L

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    and-long/2addr v5, v1

    .line 196
    shl-long/2addr v5, v7

    .line 197
    or-long/2addr v3, v5

    .line 198
    const-wide/32 v5, 0xff0000

    .line 199
    .line 200
    .line 201
    and-long/2addr v5, v1

    .line 202
    const/16 v7, 0x18

    .line 203
    .line 204
    shl-long/2addr v5, v7

    .line 205
    or-long/2addr v3, v5

    .line 206
    const-wide/32 v5, 0xff00

    .line 207
    .line 208
    .line 209
    and-long/2addr v5, v1

    .line 210
    const/16 v7, 0x28

    .line 211
    .line 212
    shl-long/2addr v5, v7

    .line 213
    or-long/2addr v3, v5

    .line 214
    and-long/2addr v1, v12

    .line 215
    const/16 v5, 0x38

    .line 216
    .line 217
    shl-long/2addr v1, v5

    .line 218
    or-long/2addr v1, v3

    .line 219
    return-wide v1

    .line 220
    :cond_2
    new-instance v1, Ljava/io/EOFException;

    .line 221
    .line 222
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 223
    .line 224
    .line 225
    throw v1
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

.method public final c()S
    .locals 10

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lg4/p;->k(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 7
    .line 8
    iget-wide v1, v0, Lg4/a;->m:J

    .line 9
    .line 10
    const-wide/16 v3, 0x2

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-ltz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, v0, Lg4/a;->l:Lg4/q;

    .line 17
    .line 18
    invoke-static {v1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget v2, v1, Lg4/q;->b:I

    .line 22
    .line 23
    iget v5, v1, Lg4/q;->c:I

    .line 24
    .line 25
    sub-int v6, v5, v2

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    if-ge v6, v7, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lg4/a;->f()B

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    and-int/lit16 v1, v1, 0xff

    .line 35
    .line 36
    shl-int/lit8 v1, v1, 0x8

    .line 37
    .line 38
    invoke-virtual {v0}, Lg4/a;->f()B

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    or-int/2addr v0, v1

    .line 45
    int-to-short v0, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v6, v2, 0x1

    .line 48
    .line 49
    iget-object v8, v1, Lg4/q;->a:[B

    .line 50
    .line 51
    aget-byte v9, v8, v2

    .line 52
    .line 53
    and-int/lit16 v9, v9, 0xff

    .line 54
    .line 55
    shl-int/lit8 v9, v9, 0x8

    .line 56
    .line 57
    add-int/2addr v2, v7

    .line 58
    aget-byte v6, v8, v6

    .line 59
    .line 60
    and-int/lit16 v6, v6, 0xff

    .line 61
    .line 62
    or-int/2addr v6, v9

    .line 63
    iget-wide v7, v0, Lg4/a;->m:J

    .line 64
    .line 65
    sub-long/2addr v7, v3

    .line 66
    iput-wide v7, v0, Lg4/a;->m:J

    .line 67
    .line 68
    if-ne v2, v5, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Lg4/q;->a()Lg4/q;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v0, Lg4/a;->l:Lg4/q;

    .line 75
    .line 76
    invoke-static {v1}, Lg4/r;->a(Lg4/q;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iput v2, v1, Lg4/q;->b:I

    .line 81
    .line 82
    :goto_0
    int-to-short v0, v6

    .line 83
    :goto_1
    const v1, 0xff00

    .line 84
    .line 85
    .line 86
    and-int/2addr v1, v0

    .line 87
    ushr-int/lit8 v1, v1, 0x8

    .line 88
    .line 89
    and-int/lit16 v0, v0, 0xff

    .line 90
    .line 91
    shl-int/lit8 v0, v0, 0x8

    .line 92
    .line 93
    or-int/2addr v0, v1

    .line 94
    int-to-short v0, v0

    .line 95
    return v0

    .line 96
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw v0
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

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg4/p;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lg4/p;->n:Z

    .line 7
    .line 8
    iget-object v0, p0, Lg4/p;->l:Lg4/t;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 14
    .line 15
    iget-wide v1, v0, Lg4/a;->m:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lg4/a;->o(J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public final d(Lg4/a;J)J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-ltz v2, :cond_2

    .line 6
    .line 7
    iget-boolean v2, p0, Lg4/p;->n:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lg4/p;->m:Lg4/a;

    .line 12
    .line 13
    iget-wide v3, v2, Lg4/a;->m:J

    .line 14
    .line 15
    cmp-long v0, v3, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lg4/p;->l:Lg4/t;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v2, v3, v4}, Lg4/t;->d(Lg4/a;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v3

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-wide v0, v2, Lg4/a;->m:J

    .line 35
    .line 36
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    invoke-virtual {v2, p1, p2, p3}, Lg4/a;->d(Lg4/a;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_0
    return-wide v3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "closed"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "byteCount < 0: "

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p2
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

.method public final f(J)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lg4/p;->k(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v1, LU3/a;->a:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    const-string v2, "charset"

    .line 12
    .line 13
    invoke-static {v1, v2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v2, p1, v2

    .line 19
    .line 20
    if-ltz v2, :cond_4

    .line 21
    .line 22
    const-wide/32 v3, 0x7fffffff

    .line 23
    .line 24
    .line 25
    cmp-long v3, p1, v3

    .line 26
    .line 27
    if-gtz v3, :cond_4

    .line 28
    .line 29
    iget-wide v3, v0, Lg4/a;->m:J

    .line 30
    .line 31
    cmp-long v3, v3, p1

    .line 32
    .line 33
    if-ltz v3, :cond_3

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    const-string p1, ""

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v2, v0, Lg4/a;->l:Lg4/q;

    .line 41
    .line 42
    invoke-static {v2}, LN3/h;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v3, v2, Lg4/q;->b:I

    .line 46
    .line 47
    int-to-long v4, v3

    .line 48
    add-long/2addr v4, p1

    .line 49
    iget v6, v2, Lg4/q;->c:I

    .line 50
    .line 51
    int-to-long v6, v6

    .line 52
    cmp-long v4, v4, v6

    .line 53
    .line 54
    if-lez v4, :cond_1

    .line 55
    .line 56
    new-instance v2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, p1, p2}, Lg4/a;->k(J)[B

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v2, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance v4, Ljava/lang/String;

    .line 68
    .line 69
    long-to-int v5, p1

    .line 70
    iget-object v6, v2, Lg4/q;->a:[B

    .line 71
    .line 72
    invoke-direct {v4, v6, v3, v5, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 73
    .line 74
    .line 75
    iget v1, v2, Lg4/q;->b:I

    .line 76
    .line 77
    add-int/2addr v1, v5

    .line 78
    iput v1, v2, Lg4/q;->b:I

    .line 79
    .line 80
    iget-wide v5, v0, Lg4/a;->m:J

    .line 81
    .line 82
    sub-long/2addr v5, p1

    .line 83
    iput-wide v5, v0, Lg4/a;->m:J

    .line 84
    .line 85
    iget p1, v2, Lg4/q;->c:I

    .line 86
    .line 87
    if-ne v1, p1, :cond_2

    .line 88
    .line 89
    invoke-virtual {v2}, Lg4/q;->a()Lg4/q;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, v0, Lg4/a;->l:Lg4/q;

    .line 94
    .line 95
    invoke-static {v2}, Lg4/r;->a(Lg4/q;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    move-object p1, v4

    .line 99
    :goto_0
    return-object p1

    .line 100
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "byteCount: "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p2
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

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg4/p;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
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

.method public final k(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lg4/p;->n:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 12
    .line 13
    iget-wide v1, v0, Lg4/a;->m:J

    .line 14
    .line 15
    cmp-long v1, v1, p1

    .line 16
    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lg4/p;->l:Lg4/t;

    .line 20
    .line 21
    const-wide/16 v2, 0x2000

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Lg4/t;->d(Lg4/a;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    return-void

    .line 41
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "closed"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "byteCount < 0: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p2
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

.method public final l(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lg4/p;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lg4/p;->m:Lg4/a;

    .line 12
    .line 13
    iget-wide v3, v2, Lg4/a;->m:J

    .line 14
    .line 15
    cmp-long v0, v3, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lg4/p;->l:Lg4/t;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v2, v3, v4}, Lg4/t;->d(Lg4/a;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v3

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_1
    iget-wide v0, v2, Lg4/a;->m:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v2, v0, v1}, Lg4/a;->o(J)V

    .line 47
    .line 48
    .line 49
    sub-long/2addr p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "closed"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
    .line 60
    .line 61
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/p;->m:Lg4/a;

    .line 7
    .line 8
    iget-wide v1, v0, Lg4/a;->m:J

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lg4/p;->l:Lg4/t;

    .line 17
    .line 18
    const-wide/16 v2, 0x2000

    .line 19
    .line 20
    invoke-interface {v1, v0, v2, v3}, Lg4/t;->d(Lg4/a;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const-wide/16 v3, -0x1

    .line 25
    .line 26
    cmp-long v1, v1, v3

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    return p1

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lg4/a;->read(Ljava/nio/ByteBuffer;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg4/p;->l:Lg4/t;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
