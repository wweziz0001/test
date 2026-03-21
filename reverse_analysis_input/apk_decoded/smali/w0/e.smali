.class public final Lw0/e;
.super Lw0/d;
.source "SourceFile"


# instance fields
.field public e:Z

.field public f:Ljava/util/UUID;

.field public g:[B


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 13

    .line 1
    new-instance v0, Lw0/a;

    .line 2
    .line 3
    iget-object v1, p0, Lw0/e;->f:Ljava/util/UUID;

    .line 4
    .line 5
    iget-object v2, p0, Lw0/e;->g:[B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v1, v3, v2}, LZ0/s;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Lw0/e;->g:[B

    .line 13
    .line 14
    new-instance v12, LZ0/u;

    .line 15
    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    move v6, v5

    .line 23
    :goto_0
    array-length v7, v3

    .line 24
    if-ge v6, v7, :cond_0

    .line 25
    .line 26
    aget-byte v7, v3, v6

    .line 27
    .line 28
    int-to-char v7, v7

    .line 29
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v6, v6, 0x2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "<KID>"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v6, 0x5

    .line 46
    add-int/2addr v4, v6

    .line 47
    const-string v7, "</KID>"

    .line 48
    .line 49
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {v3, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    aget-byte v3, v8, v5

    .line 62
    .line 63
    const/4 v4, 0x3

    .line 64
    aget-byte v7, v8, v4

    .line 65
    .line 66
    aput-byte v7, v8, v5

    .line 67
    .line 68
    aput-byte v3, v8, v4

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    aget-byte v4, v8, v3

    .line 72
    .line 73
    const/4 v5, 0x2

    .line 74
    aget-byte v7, v8, v5

    .line 75
    .line 76
    aput-byte v7, v8, v3

    .line 77
    .line 78
    aput-byte v4, v8, v5

    .line 79
    .line 80
    const/4 v3, 0x4

    .line 81
    aget-byte v4, v8, v3

    .line 82
    .line 83
    aget-byte v5, v8, v6

    .line 84
    .line 85
    aput-byte v5, v8, v3

    .line 86
    .line 87
    aput-byte v4, v8, v6

    .line 88
    .line 89
    const/4 v3, 0x6

    .line 90
    aget-byte v4, v8, v3

    .line 91
    .line 92
    const/4 v5, 0x7

    .line 93
    aget-byte v6, v8, v5

    .line 94
    .line 95
    aput-byte v6, v8, v3

    .line 96
    .line 97
    aput-byte v4, v8, v5

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v5, 0x1

    .line 102
    const/4 v6, 0x0

    .line 103
    const/16 v7, 0x8

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    move-object v4, v12

    .line 107
    invoke-direct/range {v4 .. v11}, LZ0/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 108
    .line 109
    .line 110
    filled-new-array {v12}, [LZ0/u;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-direct {v0, v1, v2, v3}, Lw0/a;-><init>(Ljava/util/UUID;[B[LZ0/u;)V

    .line 115
    .line 116
    .line 117
    return-object v0
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

.method public final d(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "ProtectionHeader"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final f(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    const-string v0, "ProtectionHeader"

    .line 2
    .line 3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lw0/e;->e:Z

    .line 15
    .line 16
    :cond_0
    return-void
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

.method public final j(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ProtectionHeader"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lw0/e;->e:Z

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, "SystemID"

    .line 18
    .line 19
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x7b

    .line 29
    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-int/2addr v1, v0

    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/16 v2, 0x7d

    .line 42
    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    sub-int/2addr v1, v0

    .line 50
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :cond_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lw0/e;->f:Ljava/util/UUID;

    .line 59
    .line 60
    :cond_1
    return-void
    .line 61
.end method

.method public final k(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw0/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lw0/e;->g:[B

    .line 15
    .line 16
    :cond_0
    return-void
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
