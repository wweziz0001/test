.class public abstract Ls1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls1/l;->a:Ljava/lang/Object;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ls1/l;->b:Ljava/lang/Object;

    .line 4
    new-instance p1, LG1/a;

    const/4 v0, 0x6

    invoke-direct {p1, p0, v0}, LG1/a;-><init>(Ljava/lang/Object;I)V

    .line 5
    new-instance v0, LB3/e;

    invoke-direct {v0, p1}, LB3/e;-><init>(LM3/a;)V

    .line 6
    iput-object v0, p0, Ls1/l;->c:Ljava/io/Serializable;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;[Ls2/g;)V
    .locals 6

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ls1/l;->a:Ljava/lang/Object;

    .line 9
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 11
    iget-object v4, v3, Ls2/g;->a:Ljava/lang/Class;

    .line 12
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v3, Ls2/g;->a:Ljava/lang/Class;

    if-nez v4, :cond_0

    .line 13
    invoke-virtual {p1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "KeyTypeManager constructed with duplicate factories for primitive "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_1
    array-length v0, p2

    if-lez v0, :cond_2

    .line 17
    aget-object p2, p2, v1

    .line 18
    iget-object p2, p2, Ls2/g;->a:Ljava/lang/Class;

    .line 19
    iput-object p2, p0, Ls1/l;->c:Ljava/io/Serializable;

    goto :goto_1

    .line 20
    :cond_2
    const-class p2, Ljava/lang/Void;

    iput-object p2, p0, Ls1/l;->c:Ljava/io/Serializable;

    .line 21
    :goto_1
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ls1/l;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ly1/h;
    .locals 3

    .line 1
    iget-object v0, p0, Ls1/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ls1/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Ls1/l;->c:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v0, LB3/e;

    .line 23
    .line 24
    invoke-virtual {v0}, LB3/e;->a()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ly1/h;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Ls1/l;->b()Ly1/h;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    return-object v0
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

.method public b()Ly1/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls1/l;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ls1/l;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->a()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Lx1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Lx1/c;->j()Ly1/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, v0}, Ly1/b;->c(Ljava/lang/String;)Ly1/h;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
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

.method public abstract c()Ljava/lang/String;
.end method

.method public d()I
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

.method public abstract e()Ljava/lang/String;
.end method

.method public f(Lcom/google/crypto/tink/shaded/protobuf/a;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ls1/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ls2/g;

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    iget p2, v0, Ls2/g;->b:I

    .line 14
    .line 15
    packed-switch p2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, LD2/Q;

    .line 19
    .line 20
    invoke-virtual {p1}, LD2/Q;->D()LD2/V;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, LD2/V;->B()LD2/O;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1}, LD2/Q;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 37
    .line 38
    const-string v2, "HMAC"

    .line 39
    .line 40
    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, LD2/Q;->D()LD2/V;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, LD2/V;->C()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p2, v0, :cond_4

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    if-eq p2, v0, :cond_3

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    if-eq p2, v0, :cond_2

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    if-eq p2, v0, :cond_1

    .line 66
    .line 67
    const/4 v0, 0x5

    .line 68
    if-ne p2, v0, :cond_0

    .line 69
    .line 70
    new-instance p2, LE2/m;

    .line 71
    .line 72
    new-instance v0, Ld0/o;

    .line 73
    .line 74
    const-string v2, "HMACSHA224"

    .line 75
    .line 76
    invoke-direct {v0, v2, v1}, Ld0/o;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 85
    .line 86
    const-string p2, "unknown hash"

    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_1
    new-instance p2, LE2/m;

    .line 93
    .line 94
    new-instance v0, Ld0/o;

    .line 95
    .line 96
    const-string v2, "HMACSHA512"

    .line 97
    .line 98
    invoke-direct {v0, v2, v1}, Ld0/o;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_2
    new-instance p2, LE2/m;

    .line 107
    .line 108
    new-instance v0, Ld0/o;

    .line 109
    .line 110
    const-string v2, "HMACSHA256"

    .line 111
    .line 112
    invoke-direct {v0, v2, v1}, Ld0/o;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_3
    new-instance p2, LE2/m;

    .line 121
    .line 122
    new-instance v0, Ld0/o;

    .line 123
    .line 124
    const-string v2, "HMACSHA384"

    .line 125
    .line 126
    invoke-direct {v0, v2, v1}, Ld0/o;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_4
    new-instance p2, LE2/m;

    .line 135
    .line 136
    new-instance v0, Ld0/o;

    .line 137
    .line 138
    const-string v2, "HMACSHA1"

    .line 139
    .line 140
    invoke-direct {v0, v2, v1}, Ld0/o;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :pswitch_0
    check-cast p1, LD2/b;

    .line 149
    .line 150
    new-instance p2, LE2/m;

    .line 151
    .line 152
    new-instance v0, LZ1/m;

    .line 153
    .line 154
    invoke-virtual {p1}, LD2/b;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-direct {v0, v1}, LZ1/m;-><init>([B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, LD2/b;->C()LD2/f;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, LD2/f;->A()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    invoke-direct {p2, v0, p1}, LE2/m;-><init>(LC2/a;I)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :pswitch_1
    check-cast p1, LD2/F;

    .line 179
    .line 180
    new-instance p2, LE2/e;

    .line 181
    .line 182
    invoke-virtual {p1}, LD2/F;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-direct {p2, p1}, LE2/e;-><init>([B)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :pswitch_2
    check-cast p1, LD2/u0;

    .line 196
    .line 197
    new-instance p2, LE2/d;

    .line 198
    .line 199
    invoke-virtual {p1}, LD2/u0;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    const/4 v0, 0x2

    .line 208
    invoke-direct {p2, v0, p1}, LE2/d;-><init>(I[B)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_3
    check-cast p1, LD2/p0;

    .line 214
    .line 215
    invoke-virtual {p1}, LD2/p0;->A()LD2/q0;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-virtual {p2}, LD2/q0;->A()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-static {p2}, Lr2/i;->a(Ljava/lang/String;)Lx2/c;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0, p2}, Lx2/c;->c(Ljava/lang/String;)Lx2/b;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    new-instance v0, Ls2/z;

    .line 232
    .line 233
    invoke-virtual {p1}, LD2/p0;->A()LD2/q0;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1}, LD2/q0;->z()LD2/b0;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-direct {v0, p1, p2}, Ls2/z;-><init>(LD2/b0;Lx2/b;)V

    .line 242
    .line 243
    .line 244
    move-object p2, v0

    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :pswitch_4
    check-cast p1, LD2/m0;

    .line 248
    .line 249
    invoke-virtual {p1}, LD2/m0;->A()LD2/n0;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, LD2/n0;->z()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-static {p1}, Lr2/i;->a(Ljava/lang/String;)Lx2/c;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p2, p1}, Lx2/c;->c(Ljava/lang/String;)Lx2/b;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :pswitch_5
    check-cast p1, LD2/J;

    .line 268
    .line 269
    new-instance p2, LE2/d;

    .line 270
    .line 271
    invoke-virtual {p1}, LD2/J;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const/4 v0, 0x1

    .line 280
    invoke-direct {p2, v0, p1}, LE2/d;-><init>(I[B)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :pswitch_6
    check-cast p1, LD2/B;

    .line 286
    .line 287
    new-instance p2, Lu2/a;

    .line 288
    .line 289
    invoke-virtual {p1}, LD2/B;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-direct {p2, p1}, Lu2/a;-><init>([B)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :pswitch_7
    check-cast p1, LD2/x;

    .line 303
    .line 304
    new-instance p2, LE2/d;

    .line 305
    .line 306
    invoke-virtual {p1}, LD2/x;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const/4 v0, 0x0

    .line 315
    invoke-direct {p2, v0, p1}, LE2/d;-><init>(I[B)V

    .line 316
    .line 317
    .line 318
    goto :goto_0

    .line 319
    :pswitch_8
    check-cast p1, LD2/r;

    .line 320
    .line 321
    new-instance p2, LE2/c;

    .line 322
    .line 323
    invoke-virtual {p1}, LD2/r;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {p1}, LD2/r;->C()LD2/v;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, LD2/v;->A()I

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    invoke-direct {p2, p1, v0}, LE2/c;-><init>(I[B)V

    .line 340
    .line 341
    .line 342
    goto :goto_0

    .line 343
    :pswitch_9
    check-cast p1, LD2/l;

    .line 344
    .line 345
    new-instance p2, LE2/b;

    .line 346
    .line 347
    invoke-virtual {p1}, LD2/l;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p1}, LD2/l;->D()LD2/p;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {p1}, LD2/p;->A()I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    invoke-direct {p2, p1, v0}, LE2/b;-><init>(I[B)V

    .line 364
    .line 365
    .line 366
    goto :goto_0

    .line 367
    :pswitch_a
    check-cast p1, LD2/h;

    .line 368
    .line 369
    new-instance p2, LE2/h;

    .line 370
    .line 371
    new-instance v0, Ls2/i;

    .line 372
    .line 373
    const/4 v1, 0x1

    .line 374
    invoke-direct {v0, v1}, Ls2/i;-><init>(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1}, LD2/h;->B()LD2/l;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    const-class v2, LE2/k;

    .line 382
    .line 383
    invoke-virtual {v0, v1, v2}, Ls1/l;->f(Lcom/google/crypto/tink/shaded/protobuf/a;Ljava/lang/Class;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, LE2/k;

    .line 388
    .line 389
    new-instance v1, Lz2/c;

    .line 390
    .line 391
    invoke-direct {v1}, Lz2/c;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1}, LD2/h;->C()LD2/Q;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const-class v3, Lr2/j;

    .line 399
    .line 400
    invoke-virtual {v1, v2, v3}, Ls1/l;->f(Lcom/google/crypto/tink/shaded/protobuf/a;Ljava/lang/Class;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    check-cast v1, Lr2/j;

    .line 405
    .line 406
    invoke-virtual {p1}, LD2/h;->C()LD2/Q;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {p1}, LD2/Q;->D()LD2/V;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {p1}, LD2/V;->C()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    invoke-direct {p2, v0, v1, p1}, LE2/h;-><init>(LE2/k;Lr2/j;I)V

    .line 419
    .line 420
    .line 421
    :goto_0
    return-object p2

    .line 422
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 423
    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v1, "Requested primitive class "

    .line 427
    .line 428
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p2

    .line 435
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const-string p2, " not supported."

    .line 439
    .line 440
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw p1

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
.end method

.method public abstract g()LL0/e;
.end method

.method public abstract h()LD2/X;
.end method

.method public abstract i(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/a;
.end method

.method public j(Ly1/h;)V
    .locals 1

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls1/l;->c:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, LB3/e;

    .line 9
    .line 10
    invoke-virtual {v0}, LB3/e;->a()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ly1/h;

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Ls1/l;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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

.method public abstract k(Lcom/google/crypto/tink/shaded/protobuf/a;)V
.end method
