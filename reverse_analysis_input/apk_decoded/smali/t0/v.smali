.class public final Lt0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/o;


# instance fields
.field public final l:Ljava/io/DataInputStream;

.field public final m:Lcom/google/crypto/tink/shaded/protobuf/d;

.field public volatile n:Z

.field public final synthetic o:Lt0/x;


# direct methods
.method public constructor <init>(Lt0/x;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/v;->o:Lt0/x;

    .line 5
    .line 6
    new-instance p1, Ljava/io/DataInputStream;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 12
    .line 13
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/d;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p1, Lcom/google/crypto/tink/shaded/protobuf/d;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    iput p2, p1, Lcom/google/crypto/tink/shaded/protobuf/d;->a:I

    .line 27
    .line 28
    iput-object p1, p0, Lt0/v;->m:Lcom/google/crypto/tink/shaded/protobuf/d;

    .line 29
    .line 30
    return-void
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


# virtual methods
.method public final e()V
    .locals 12

    .line 1
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lt0/v;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x24

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    new-array v3, v1, [B

    .line 29
    .line 30
    iget-object v4, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 31
    .line 32
    invoke-virtual {v4, v3, v2, v1}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lt0/v;->o:Lt0/x;

    .line 36
    .line 37
    iget-object v1, v1, Lt0/x;->n:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lt0/F;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object v1, p0, Lt0/v;->o:Lt0/x;

    .line 52
    .line 53
    iget-boolean v1, v1, Lt0/x;->q:Z

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    iget-object v0, v0, Lt0/F;->p:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v1, p0, Lt0/v;->o:Lt0/x;

    .line 64
    .line 65
    iget-boolean v1, v1, Lt0/x;->q:Z

    .line 66
    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    iget-object v1, p0, Lt0/v;->o:Lt0/x;

    .line 70
    .line 71
    iget-object v1, v1, Lt0/x;->l:LZ1/l;

    .line 72
    .line 73
    iget-object v3, p0, Lt0/v;->m:Lcom/google/crypto/tink/shaded/protobuf/d;

    .line 74
    .line 75
    iget-object v4, p0, Lt0/v;->l:Ljava/io/DataInputStream;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v4}, Lcom/google/crypto/tink/shaded/protobuf/d;->b(BLjava/io/DataInputStream;)[B

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/d;->a([B)Lm2/I;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_1
    if-nez v0, :cond_8

    .line 89
    .line 90
    iget v0, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->a:I

    .line 91
    .line 92
    const/4 v5, 0x3

    .line 93
    if-ne v0, v5, :cond_7

    .line 94
    .line 95
    iget-wide v6, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->b:J

    .line 96
    .line 97
    const-wide/16 v8, 0x0

    .line 98
    .line 99
    cmp-long v0, v6, v8

    .line 100
    .line 101
    if-lez v0, :cond_6

    .line 102
    .line 103
    invoke-static {v6, v7}, LQ1/C;->g(J)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v6, -0x1

    .line 108
    const/4 v7, 0x1

    .line 109
    if-eq v0, v6, :cond_2

    .line 110
    .line 111
    move v6, v7

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move v6, v2

    .line 114
    :goto_2
    invoke-static {v6}, Ld0/m;->h(Z)V

    .line 115
    .line 116
    .line 117
    new-array v6, v0, [B

    .line 118
    .line 119
    invoke-virtual {v4, v6, v2, v0}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 120
    .line 121
    .line 122
    iget v10, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->a:I

    .line 123
    .line 124
    if-ne v10, v5, :cond_3

    .line 125
    .line 126
    move v5, v7

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move v5, v2

    .line 129
    :goto_3
    invoke-static {v5}, Ld0/m;->h(Z)V

    .line 130
    .line 131
    .line 132
    if-lez v0, :cond_5

    .line 133
    .line 134
    add-int/lit8 v5, v0, -0x1

    .line 135
    .line 136
    aget-byte v10, v6, v5

    .line 137
    .line 138
    const/16 v11, 0xa

    .line 139
    .line 140
    if-ne v10, v11, :cond_5

    .line 141
    .line 142
    if-le v0, v7, :cond_4

    .line 143
    .line 144
    add-int/lit8 v0, v0, -0x2

    .line 145
    .line 146
    aget-byte v10, v6, v0

    .line 147
    .line 148
    const/16 v11, 0xd

    .line 149
    .line 150
    if-ne v10, v11, :cond_4

    .line 151
    .line 152
    new-instance v5, Ljava/lang/String;

    .line 153
    .line 154
    sget-object v10, Lt0/x;->r:Ljava/nio/charset/Charset;

    .line 155
    .line 156
    invoke-direct {v5, v6, v2, v0, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_4
    new-instance v0, Ljava/lang/String;

    .line 161
    .line 162
    sget-object v10, Lt0/x;->r:Ljava/nio/charset/Charset;

    .line 163
    .line 164
    invoke-direct {v0, v6, v2, v5, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 165
    .line 166
    .line 167
    move-object v5, v0

    .line 168
    :goto_4
    iget-object v0, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->c:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-static {v0}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v5, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v5, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 184
    .line 185
    .line 186
    iput v7, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->a:I

    .line 187
    .line 188
    iput-wide v8, v3, Lcom/google/crypto/tink/shaded/protobuf/d;->b:J

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 192
    .line 193
    const-string v1, "Message body is empty or does not end with a LF."

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string v1, "Expects a greater than zero Content-Length."

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_7
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readByte()B

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-static {v0, v4}, Lcom/google/crypto/tink/shaded/protobuf/d;->b(BLjava/io/DataInputStream;)[B

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/d;->a([B)Lm2/I;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :cond_8
    iget-object v2, v1, LZ1/l;->l:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, Landroid/os/Handler;

    .line 224
    .line 225
    new-instance v3, LD0/y;

    .line 226
    .line 227
    const/16 v4, 0x15

    .line 228
    .line 229
    invoke-direct {v3, v1, v4, v0}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_9
    return-void
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

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lt0/v;->n:Z

    .line 3
    .line 4
    return-void
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
