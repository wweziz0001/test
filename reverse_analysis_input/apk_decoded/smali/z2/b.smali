.class public final Lz2/b;
.super LL0/e;
.source "SourceFile"


# virtual methods
.method public final a(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a;
    .locals 4

    .line 1
    check-cast p1, LD2/d;

    .line 2
    .line 3
    invoke-static {}, LD2/b;->E()LD2/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 11
    .line 12
    check-cast v1, LD2/b;

    .line 13
    .line 14
    invoke-static {v1}, LD2/b;->y(LD2/b;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, LD2/d;->A()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, LE2/n;->a(I)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 35
    .line 36
    check-cast v2, LD2/b;

    .line 37
    .line 38
    invoke-static {v2, v1}, LD2/b;->z(LD2/b;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, LD2/d;->B()LD2/f;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 49
    .line 50
    check-cast v1, LD2/b;

    .line 51
    .line 52
    invoke-static {v1, p1}, LD2/b;->A(LD2/b;LD2/f;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, LD2/b;

    .line 60
    .line 61
    return-object p1
.end method

.method public final k()Ljava/util/Map;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ly2/d;

    .line 7
    .line 8
    invoke-static {}, LD2/d;->C()LD2/c;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 16
    .line 17
    check-cast v3, LD2/d;

    .line 18
    .line 19
    invoke-static {v3}, LD2/d;->y(LD2/d;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, LD2/f;->B()LD2/e;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 27
    .line 28
    .line 29
    iget-object v4, v3, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 30
    .line 31
    check-cast v4, LD2/f;

    .line 32
    .line 33
    invoke-static {v4}, LD2/f;->y(LD2/f;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, LD2/f;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 43
    .line 44
    .line 45
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 46
    .line 47
    check-cast v4, LD2/d;

    .line 48
    .line 49
    invoke-static {v4, v3}, LD2/d;->z(LD2/d;LD2/f;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, LD2/d;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 60
    .line 61
    .line 62
    const-string v2, "AES_CMAC"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    new-instance v1, Ly2/d;

    .line 68
    .line 69
    invoke-static {}, LD2/d;->C()LD2/c;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 74
    .line 75
    .line 76
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 77
    .line 78
    check-cast v4, LD2/d;

    .line 79
    .line 80
    invoke-static {v4}, LD2/d;->y(LD2/d;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, LD2/f;->B()LD2/e;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 88
    .line 89
    .line 90
    iget-object v5, v4, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 91
    .line 92
    check-cast v5, LD2/f;

    .line 93
    .line 94
    invoke-static {v5}, LD2/f;->y(LD2/f;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, LD2/f;

    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 104
    .line 105
    .line 106
    iget-object v5, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 107
    .line 108
    check-cast v5, LD2/d;

    .line 109
    .line 110
    invoke-static {v5, v4}, LD2/d;->z(LD2/d;LD2/f;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, LD2/d;

    .line 118
    .line 119
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 120
    .line 121
    .line 122
    const-string v2, "AES256_CMAC"

    .line 123
    .line 124
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    new-instance v1, Ly2/d;

    .line 128
    .line 129
    invoke-static {}, LD2/d;->C()LD2/c;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 134
    .line 135
    .line 136
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 137
    .line 138
    check-cast v3, LD2/d;

    .line 139
    .line 140
    invoke-static {v3}, LD2/d;->y(LD2/d;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, LD2/f;->B()LD2/e;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 148
    .line 149
    .line 150
    iget-object v4, v3, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 151
    .line 152
    check-cast v4, LD2/f;

    .line 153
    .line 154
    invoke-static {v4}, LD2/f;->y(LD2/f;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, LD2/f;

    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 164
    .line 165
    .line 166
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 167
    .line 168
    check-cast v4, LD2/d;

    .line 169
    .line 170
    invoke-static {v4, v3}, LD2/d;->z(LD2/d;LD2/f;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, LD2/d;

    .line 178
    .line 179
    const/4 v3, 0x3

    .line 180
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 181
    .line 182
    .line 183
    const-string v2, "AES256_CMAC_RAW"

    .line 184
    .line 185
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0
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

.method public final m(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, LD2/d;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public final o(Lcom/google/crypto/tink/shaded/protobuf/a;)V
    .locals 1

    .line 1
    check-cast p1, LD2/d;

    .line 2
    .line 3
    invoke-virtual {p1}, LD2/d;->B()LD2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lz2/c;->m(LD2/f;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, LD2/d;->A()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 20
    .line 21
    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
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
