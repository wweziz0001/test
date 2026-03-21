.class public final Ls2/h;
.super LL0/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls1/l;


# direct methods
.method public constructor <init>(Ls2/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls2/h;->b:I

    .line 10
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/j;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;B)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Ls2/h;->b:I

    .line 7
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/n;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;BB)V
    .locals 0

    const/4 p2, 0x6

    iput p2, p0, Ls2/h;->b:I

    .line 1
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/n0;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;BC)V
    .locals 0

    const/4 p2, 0x7

    iput p2, p0, Ls2/h;->b:I

    .line 2
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/q0;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;BI)V
    .locals 0

    const/16 p2, 0x8

    iput p2, p0, Ls2/h;->b:I

    .line 8
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/v0;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;BS)V
    .locals 0

    const/16 p2, 0x9

    iput p2, p0, Ls2/h;->b:I

    .line 9
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/H;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;BZ)V
    .locals 0

    const/4 p2, 0x5

    iput p2, p0, Ls2/h;->b:I

    .line 4
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/L;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;C)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Ls2/h;->b:I

    .line 5
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/t;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;I)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, Ls2/h;->b:I

    .line 3
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/z;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ls2/i;S)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Ls2/h;->b:I

    .line 6
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/D;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lz2/c;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Ls2/h;->b:I

    .line 11
    iput-object p1, p0, Ls2/h;->c:Ls1/l;

    const-class p1, LD2/T;

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a;
    .locals 10

    .line 1
    iget v0, p0, Ls2/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LD2/T;

    .line 7
    .line 8
    invoke-static {}, LD2/Q;->F()LD2/P;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ls2/h;->c:Ls1/l;

    .line 13
    .line 14
    check-cast v1, Lz2/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 23
    .line 24
    check-cast v1, LD2/Q;

    .line 25
    .line 26
    invoke-static {v1}, LD2/Q;->y(LD2/Q;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, LD2/T;->C()LD2/V;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 37
    .line 38
    check-cast v2, LD2/Q;

    .line 39
    .line 40
    invoke-static {v2, v1}, LD2/Q;->z(LD2/Q;LD2/V;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, LD2/T;->B()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    array-length v1, p1

    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-static {p1, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 61
    .line 62
    check-cast v1, LD2/Q;

    .line 63
    .line 64
    invoke-static {v1, p1}, LD2/Q;->A(LD2/Q;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, LD2/Q;

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_0
    check-cast p1, LD2/H;

    .line 75
    .line 76
    invoke-static {}, LD2/F;->C()LD2/E;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1}, LD2/H;->z()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    array-length v1, p1

    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-static {p1, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 98
    .line 99
    check-cast v1, LD2/F;

    .line 100
    .line 101
    invoke-static {v1, p1}, LD2/F;->z(LD2/F;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 105
    .line 106
    check-cast p1, Ls2/i;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 112
    .line 113
    .line 114
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 115
    .line 116
    check-cast p1, LD2/F;

    .line 117
    .line 118
    invoke-static {p1}, LD2/F;->y(LD2/F;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, LD2/F;

    .line 126
    .line 127
    return-object p1

    .line 128
    :pswitch_1
    check-cast p1, LD2/v0;

    .line 129
    .line 130
    invoke-static {}, LD2/u0;->C()LD2/t0;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object v0, p0, Ls2/h;->c:Ls1/l;

    .line 135
    .line 136
    check-cast v0, Ls2/i;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 142
    .line 143
    .line 144
    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 145
    .line 146
    check-cast v0, LD2/u0;

    .line 147
    .line 148
    invoke-static {v0}, LD2/u0;->y(LD2/u0;)V

    .line 149
    .line 150
    .line 151
    const/16 v0, 0x20

    .line 152
    .line 153
    invoke-static {v0}, LE2/n;->a(I)[B

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    array-length v1, v0

    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-static {v0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 164
    .line 165
    .line 166
    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 167
    .line 168
    check-cast v1, LD2/u0;

    .line 169
    .line 170
    invoke-static {v1, v0}, LD2/u0;->z(LD2/u0;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, LD2/u0;

    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_2
    check-cast p1, LD2/q0;

    .line 181
    .line 182
    invoke-static {}, LD2/p0;->C()LD2/o0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 187
    .line 188
    .line 189
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 190
    .line 191
    check-cast v1, LD2/p0;

    .line 192
    .line 193
    invoke-static {v1, p1}, LD2/p0;->z(LD2/p0;LD2/q0;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 197
    .line 198
    check-cast p1, Ls2/i;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 204
    .line 205
    .line 206
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 207
    .line 208
    check-cast p1, LD2/p0;

    .line 209
    .line 210
    invoke-static {p1}, LD2/p0;->y(LD2/p0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, LD2/p0;

    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_3
    check-cast p1, LD2/n0;

    .line 221
    .line 222
    invoke-static {}, LD2/m0;->C()LD2/l0;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 227
    .line 228
    .line 229
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 230
    .line 231
    check-cast v1, LD2/m0;

    .line 232
    .line 233
    invoke-static {v1, p1}, LD2/m0;->z(LD2/m0;LD2/n0;)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 237
    .line 238
    check-cast p1, Ls2/i;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 244
    .line 245
    .line 246
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 247
    .line 248
    check-cast p1, LD2/m0;

    .line 249
    .line 250
    invoke-static {p1}, LD2/m0;->y(LD2/m0;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, LD2/m0;

    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_4
    check-cast p1, LD2/L;

    .line 261
    .line 262
    invoke-static {}, LD2/J;->C()LD2/I;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iget-object v0, p0, Ls2/h;->c:Ls1/l;

    .line 267
    .line 268
    check-cast v0, Ls2/i;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 274
    .line 275
    .line 276
    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 277
    .line 278
    check-cast v0, LD2/J;

    .line 279
    .line 280
    invoke-static {v0}, LD2/J;->y(LD2/J;)V

    .line 281
    .line 282
    .line 283
    const/16 v0, 0x20

    .line 284
    .line 285
    invoke-static {v0}, LE2/n;->a(I)[B

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    array-length v1, v0

    .line 290
    const/4 v2, 0x0

    .line 291
    invoke-static {v0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 296
    .line 297
    .line 298
    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 299
    .line 300
    check-cast v1, LD2/J;

    .line 301
    .line 302
    invoke-static {v1, v0}, LD2/J;->z(LD2/J;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    check-cast p1, LD2/J;

    .line 310
    .line 311
    return-object p1

    .line 312
    :pswitch_5
    check-cast p1, LD2/D;

    .line 313
    .line 314
    invoke-static {}, LD2/B;->C()LD2/A;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {p1}, LD2/D;->z()I

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    array-length v1, p1

    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-static {p1, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 333
    .line 334
    .line 335
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 336
    .line 337
    check-cast v1, LD2/B;

    .line 338
    .line 339
    invoke-static {v1, p1}, LD2/B;->z(LD2/B;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 340
    .line 341
    .line 342
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 343
    .line 344
    check-cast p1, Ls2/i;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 350
    .line 351
    .line 352
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 353
    .line 354
    check-cast p1, LD2/B;

    .line 355
    .line 356
    invoke-static {p1}, LD2/B;->y(LD2/B;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    check-cast p1, LD2/B;

    .line 364
    .line 365
    return-object p1

    .line 366
    :pswitch_6
    check-cast p1, LD2/z;

    .line 367
    .line 368
    invoke-static {}, LD2/x;->C()LD2/w;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {p1}, LD2/z;->z()I

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    array-length v1, p1

    .line 381
    const/4 v2, 0x0

    .line 382
    invoke-static {p1, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 387
    .line 388
    .line 389
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 390
    .line 391
    check-cast v1, LD2/x;

    .line 392
    .line 393
    invoke-static {v1, p1}, LD2/x;->z(LD2/x;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 394
    .line 395
    .line 396
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 397
    .line 398
    check-cast p1, Ls2/i;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 404
    .line 405
    .line 406
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 407
    .line 408
    check-cast p1, LD2/x;

    .line 409
    .line 410
    invoke-static {p1}, LD2/x;->y(LD2/x;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    check-cast p1, LD2/x;

    .line 418
    .line 419
    return-object p1

    .line 420
    :pswitch_7
    check-cast p1, LD2/t;

    .line 421
    .line 422
    invoke-static {}, LD2/r;->E()LD2/q;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {p1}, LD2/t;->A()I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    invoke-static {v1}, LE2/n;->a(I)[B

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    array-length v2, v1

    .line 435
    const/4 v3, 0x0

    .line 436
    invoke-static {v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 441
    .line 442
    .line 443
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 444
    .line 445
    check-cast v2, LD2/r;

    .line 446
    .line 447
    invoke-static {v2, v1}, LD2/r;->A(LD2/r;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {p1}, LD2/t;->B()LD2/v;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 455
    .line 456
    .line 457
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 458
    .line 459
    check-cast v1, LD2/r;

    .line 460
    .line 461
    invoke-static {v1, p1}, LD2/r;->z(LD2/r;LD2/v;)V

    .line 462
    .line 463
    .line 464
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 465
    .line 466
    check-cast p1, Ls2/i;

    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 472
    .line 473
    .line 474
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 475
    .line 476
    check-cast p1, LD2/r;

    .line 477
    .line 478
    invoke-static {p1}, LD2/r;->y(LD2/r;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    check-cast p1, LD2/r;

    .line 486
    .line 487
    return-object p1

    .line 488
    :pswitch_8
    check-cast p1, LD2/n;

    .line 489
    .line 490
    invoke-static {}, LD2/l;->F()LD2/k;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {p1}, LD2/n;->C()LD2/p;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 499
    .line 500
    .line 501
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 502
    .line 503
    check-cast v2, LD2/l;

    .line 504
    .line 505
    invoke-static {v2, v1}, LD2/l;->z(LD2/l;LD2/p;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p1}, LD2/n;->B()I

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    array-length v1, p1

    .line 517
    const/4 v2, 0x0

    .line 518
    invoke-static {p1, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 523
    .line 524
    .line 525
    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 526
    .line 527
    check-cast v1, LD2/l;

    .line 528
    .line 529
    invoke-static {v1, p1}, LD2/l;->A(LD2/l;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 530
    .line 531
    .line 532
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 533
    .line 534
    check-cast p1, Ls2/i;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 540
    .line 541
    .line 542
    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 543
    .line 544
    check-cast p1, LD2/l;

    .line 545
    .line 546
    invoke-static {p1}, LD2/l;->y(LD2/l;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    check-cast p1, LD2/l;

    .line 554
    .line 555
    return-object p1

    .line 556
    :pswitch_9
    check-cast p1, LD2/j;

    .line 557
    .line 558
    new-instance v0, Ls2/g;

    .line 559
    .line 560
    const-class v1, LE2/k;

    .line 561
    .line 562
    const/4 v2, 0x1

    .line 563
    invoke-direct {v0, v1, v2}, Ls2/g;-><init>(Ljava/lang/Class;I)V

    .line 564
    .line 565
    .line 566
    filled-new-array {v0}, [Ls2/g;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    new-instance v1, Ljava/util/HashMap;

    .line 571
    .line 572
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 573
    .line 574
    .line 575
    array-length v2, v0

    .line 576
    const/4 v3, 0x0

    .line 577
    move v4, v3

    .line 578
    :goto_0
    const-string v5, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 579
    .line 580
    if-ge v4, v2, :cond_1

    .line 581
    .line 582
    aget-object v6, v0, v4

    .line 583
    .line 584
    iget-object v7, v6, Ls2/g;->a:Ljava/lang/Class;

    .line 585
    .line 586
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v7

    .line 590
    iget-object v8, v6, Ls2/g;->a:Ljava/lang/Class;

    .line 591
    .line 592
    if-nez v7, :cond_0

    .line 593
    .line 594
    invoke-virtual {v1, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    add-int/lit8 v4, v4, 0x1

    .line 598
    .line 599
    goto :goto_0

    .line 600
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 601
    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    .line 603
    .line 604
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw p1

    .line 622
    :cond_1
    array-length v2, v0

    .line 623
    if-lez v2, :cond_2

    .line 624
    .line 625
    aget-object v0, v0, v3

    .line 626
    .line 627
    iget-object v0, v0, Ls2/g;->a:Ljava/lang/Class;

    .line 628
    .line 629
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 630
    .line 631
    .line 632
    invoke-virtual {p1}, LD2/j;->A()LD2/n;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-static {}, LD2/l;->F()LD2/k;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v0}, LD2/n;->C()LD2/p;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 645
    .line 646
    .line 647
    iget-object v4, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 648
    .line 649
    check-cast v4, LD2/l;

    .line 650
    .line 651
    invoke-static {v4, v2}, LD2/l;->z(LD2/l;LD2/p;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, LD2/n;->B()I

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    invoke-static {v0}, LE2/n;->a(I)[B

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    array-length v2, v0

    .line 663
    invoke-static {v0, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 668
    .line 669
    .line 670
    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 671
    .line 672
    check-cast v2, LD2/l;

    .line 673
    .line 674
    invoke-static {v2, v0}, LD2/l;->A(LD2/l;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 678
    .line 679
    .line 680
    iget-object v0, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 681
    .line 682
    check-cast v0, LD2/l;

    .line 683
    .line 684
    invoke-static {v0}, LD2/l;->y(LD2/l;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    check-cast v0, LD2/l;

    .line 692
    .line 693
    new-instance v1, Ls2/g;

    .line 694
    .line 695
    const-class v2, Lr2/j;

    .line 696
    .line 697
    const/16 v4, 0xb

    .line 698
    .line 699
    invoke-direct {v1, v2, v4}, Ls2/g;-><init>(Ljava/lang/Class;I)V

    .line 700
    .line 701
    .line 702
    filled-new-array {v1}, [Ls2/g;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    new-instance v2, Ljava/util/HashMap;

    .line 707
    .line 708
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 709
    .line 710
    .line 711
    array-length v4, v1

    .line 712
    move v6, v3

    .line 713
    :goto_1
    if-ge v6, v4, :cond_4

    .line 714
    .line 715
    aget-object v7, v1, v6

    .line 716
    .line 717
    iget-object v8, v7, Ls2/g;->a:Ljava/lang/Class;

    .line 718
    .line 719
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v8

    .line 723
    iget-object v9, v7, Ls2/g;->a:Ljava/lang/Class;

    .line 724
    .line 725
    if-nez v8, :cond_3

    .line 726
    .line 727
    invoke-virtual {v2, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    add-int/lit8 v6, v6, 0x1

    .line 731
    .line 732
    goto :goto_1

    .line 733
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 734
    .line 735
    new-instance v0, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    throw p1

    .line 755
    :cond_4
    array-length v4, v1

    .line 756
    if-lez v4, :cond_5

    .line 757
    .line 758
    aget-object v1, v1, v3

    .line 759
    .line 760
    iget-object v1, v1, Ls2/g;->a:Ljava/lang/Class;

    .line 761
    .line 762
    :cond_5
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 763
    .line 764
    .line 765
    invoke-virtual {p1}, LD2/j;->B()LD2/T;

    .line 766
    .line 767
    .line 768
    move-result-object p1

    .line 769
    invoke-static {}, LD2/Q;->F()LD2/P;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 774
    .line 775
    .line 776
    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 777
    .line 778
    check-cast v2, LD2/Q;

    .line 779
    .line 780
    invoke-static {v2}, LD2/Q;->y(LD2/Q;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {p1}, LD2/T;->C()LD2/V;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 788
    .line 789
    .line 790
    iget-object v4, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 791
    .line 792
    check-cast v4, LD2/Q;

    .line 793
    .line 794
    invoke-static {v4, v2}, LD2/Q;->z(LD2/Q;LD2/V;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p1}, LD2/T;->B()I

    .line 798
    .line 799
    .line 800
    move-result p1

    .line 801
    invoke-static {p1}, LE2/n;->a(I)[B

    .line 802
    .line 803
    .line 804
    move-result-object p1

    .line 805
    array-length v2, p1

    .line 806
    invoke-static {p1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->h([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 807
    .line 808
    .line 809
    move-result-object p1

    .line 810
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 811
    .line 812
    .line 813
    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 814
    .line 815
    check-cast v2, LD2/Q;

    .line 816
    .line 817
    invoke-static {v2, p1}, LD2/Q;->A(LD2/Q;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 821
    .line 822
    .line 823
    move-result-object p1

    .line 824
    check-cast p1, LD2/Q;

    .line 825
    .line 826
    invoke-static {}, LD2/h;->E()LD2/g;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 831
    .line 832
    .line 833
    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 834
    .line 835
    check-cast v2, LD2/h;

    .line 836
    .line 837
    invoke-static {v2, v0}, LD2/h;->z(LD2/h;LD2/l;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 841
    .line 842
    .line 843
    iget-object v0, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 844
    .line 845
    check-cast v0, LD2/h;

    .line 846
    .line 847
    invoke-static {v0, p1}, LD2/h;->A(LD2/h;LD2/Q;)V

    .line 848
    .line 849
    .line 850
    iget-object p1, p0, Ls2/h;->c:Ls1/l;

    .line 851
    .line 852
    check-cast p1, Ls2/i;

    .line 853
    .line 854
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 858
    .line 859
    .line 860
    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 861
    .line 862
    check-cast p1, LD2/h;

    .line 863
    .line 864
    invoke-static {p1}, LD2/h;->y(LD2/h;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 868
    .line 869
    .line 870
    move-result-object p1

    .line 871
    check-cast p1, LD2/h;

    .line 872
    .line 873
    return-object p1

    .line 874
    nop

    .line 875
    :pswitch_data_0
    .packed-switch 0x0
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
.end method

.method public k()Ljava/util/Map;
    .locals 9

    .line 1
    iget v0, p0, Ls2/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, LL0/e;->k()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, LD2/O;->p:LD2/O;

    .line 17
    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    const/16 v3, 0x10

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-static {v2, v3, v1, v4}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-string v6, "HMAC_SHA256_128BITTAG"

    .line 28
    .line 29
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    invoke-static {v2, v3, v1, v5}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    .line 38
    .line 39
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v2, v1, v4}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const-string v7, "HMAC_SHA256_256BITTAG"

    .line 47
    .line 48
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v2, v1, v5}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    .line 56
    .line 57
    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object v1, LD2/O;->q:LD2/O;

    .line 61
    .line 62
    const/16 v6, 0x40

    .line 63
    .line 64
    invoke-static {v6, v3, v1, v4}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v8, "HMAC_SHA512_128BITTAG"

    .line 69
    .line 70
    invoke-virtual {v0, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v3, v1, v5}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    .line 78
    .line 79
    invoke-virtual {v0, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v2, v1, v4}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v7, "HMAC_SHA512_256BITTAG"

    .line 87
    .line 88
    invoke-virtual {v0, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-static {v6, v2, v1, v5}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v3, "HMAC_SHA512_256BITTAG_RAW"

    .line 96
    .line 97
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-static {v6, v6, v1, v4}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "HMAC_SHA512_512BITTAG"

    .line 105
    .line 106
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-static {v6, v6, v1, v5}, Lz2/c;->l(IILD2/O;I)Ly2/d;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :pswitch_2
    new-instance v0, Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v1, Ly2/d;

    .line 129
    .line 130
    invoke-static {}, LD2/H;->A()LD2/G;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 135
    .line 136
    .line 137
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 138
    .line 139
    check-cast v3, LD2/H;

    .line 140
    .line 141
    invoke-static {v3}, LD2/H;->y(LD2/H;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, LD2/H;

    .line 149
    .line 150
    const/4 v3, 0x1

    .line 151
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 152
    .line 153
    .line 154
    const-string v2, "AES256_SIV"

    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    new-instance v1, Ly2/d;

    .line 160
    .line 161
    invoke-static {}, LD2/H;->A()LD2/G;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 166
    .line 167
    .line 168
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 169
    .line 170
    check-cast v3, LD2/H;

    .line 171
    .line 172
    invoke-static {v3}, LD2/H;->y(LD2/H;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, LD2/H;

    .line 180
    .line 181
    const/4 v3, 0x3

    .line 182
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 183
    .line 184
    .line 185
    const-string v2, "AES256_SIV_RAW"

    .line 186
    .line 187
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :pswitch_3
    new-instance v0, Ljava/util/HashMap;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    new-instance v1, Ly2/d;

    .line 201
    .line 202
    invoke-static {}, LD2/v0;->y()LD2/v0;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const/4 v3, 0x1

    .line 207
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 208
    .line 209
    .line 210
    const-string v2, "XCHACHA20_POLY1305"

    .line 211
    .line 212
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    new-instance v1, Ly2/d;

    .line 216
    .line 217
    invoke-static {}, LD2/v0;->y()LD2/v0;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/4 v3, 0x3

    .line 222
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 223
    .line 224
    .line 225
    const-string v2, "XCHACHA20_POLY1305_RAW"

    .line 226
    .line 227
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :pswitch_4
    new-instance v0, Ljava/util/HashMap;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 238
    .line 239
    .line 240
    new-instance v1, Ly2/d;

    .line 241
    .line 242
    invoke-static {}, LD2/L;->y()LD2/L;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const/4 v3, 0x1

    .line 247
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 248
    .line 249
    .line 250
    const-string v2, "CHACHA20_POLY1305"

    .line 251
    .line 252
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    new-instance v1, Ly2/d;

    .line 256
    .line 257
    invoke-static {}, LD2/L;->y()LD2/L;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const/4 v3, 0x3

    .line 262
    invoke-direct {v1, v2, v3}, Ly2/d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;I)V

    .line 263
    .line 264
    .line 265
    const-string v2, "CHACHA20_POLY1305_RAW"

    .line 266
    .line 267
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0

    .line 275
    :pswitch_5
    new-instance v0, Ljava/util/HashMap;

    .line 276
    .line 277
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 278
    .line 279
    .line 280
    const/16 v1, 0x10

    .line 281
    .line 282
    const/4 v2, 0x1

    .line 283
    invoke-static {v1, v2}, Ls2/i;->o(II)Ly2/d;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const-string v4, "AES128_GCM_SIV"

    .line 288
    .line 289
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    const/4 v3, 0x3

    .line 293
    invoke-static {v1, v3}, Ls2/i;->o(II)Ly2/d;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    const-string v4, "AES128_GCM_SIV_RAW"

    .line 298
    .line 299
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    const/16 v1, 0x20

    .line 303
    .line 304
    invoke-static {v1, v2}, Ls2/i;->o(II)Ly2/d;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const-string v4, "AES256_GCM_SIV"

    .line 309
    .line 310
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    invoke-static {v1, v3}, Ls2/i;->o(II)Ly2/d;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const-string v2, "AES256_GCM_SIV_RAW"

    .line 318
    .line 319
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :pswitch_6
    new-instance v0, Ljava/util/HashMap;

    .line 328
    .line 329
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 330
    .line 331
    .line 332
    const/16 v1, 0x10

    .line 333
    .line 334
    const/4 v2, 0x1

    .line 335
    invoke-static {v1, v2}, Ls2/i;->n(II)Ly2/d;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const-string v4, "AES128_GCM"

    .line 340
    .line 341
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    const/4 v3, 0x3

    .line 345
    invoke-static {v1, v3}, Ls2/i;->n(II)Ly2/d;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    const-string v4, "AES128_GCM_RAW"

    .line 350
    .line 351
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    const/16 v1, 0x20

    .line 355
    .line 356
    invoke-static {v1, v2}, Ls2/i;->n(II)Ly2/d;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const-string v4, "AES256_GCM"

    .line 361
    .line 362
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    invoke-static {v1, v3}, Ls2/i;->n(II)Ly2/d;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const-string v2, "AES256_GCM_RAW"

    .line 370
    .line 371
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    return-object v0

    .line 379
    :pswitch_7
    new-instance v0, Ljava/util/HashMap;

    .line 380
    .line 381
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 382
    .line 383
    .line 384
    const/16 v1, 0x10

    .line 385
    .line 386
    const/4 v2, 0x1

    .line 387
    invoke-static {v1, v2}, Ls2/i;->l(II)Ly2/d;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    const-string v4, "AES128_EAX"

    .line 392
    .line 393
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    const/4 v3, 0x3

    .line 397
    invoke-static {v1, v3}, Ls2/i;->l(II)Ly2/d;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    const-string v4, "AES128_EAX_RAW"

    .line 402
    .line 403
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    const/16 v1, 0x20

    .line 407
    .line 408
    invoke-static {v1, v2}, Ls2/i;->l(II)Ly2/d;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const-string v4, "AES256_EAX"

    .line 413
    .line 414
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    invoke-static {v1, v3}, Ls2/i;->l(II)Ly2/d;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    const-string v2, "AES256_EAX_RAW"

    .line 422
    .line 423
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    return-object v0

    .line 431
    :pswitch_8
    new-instance v0, Ljava/util/HashMap;

    .line 432
    .line 433
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 434
    .line 435
    .line 436
    const/16 v1, 0x10

    .line 437
    .line 438
    const/4 v2, 0x1

    .line 439
    invoke-static {v1, v1, v2}, Ls2/i;->m(III)Ly2/d;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    const-string v4, "AES128_CTR_HMAC_SHA256"

    .line 444
    .line 445
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    const/4 v3, 0x3

    .line 449
    invoke-static {v1, v1, v3}, Ls2/i;->m(III)Ly2/d;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    const-string v4, "AES128_CTR_HMAC_SHA256_RAW"

    .line 454
    .line 455
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    const/16 v1, 0x20

    .line 459
    .line 460
    invoke-static {v1, v1, v2}, Ls2/i;->m(III)Ly2/d;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    const-string v4, "AES256_CTR_HMAC_SHA256"

    .line 465
    .line 466
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    invoke-static {v1, v1, v3}, Ls2/i;->m(III)Ly2/d;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    .line 474
    .line 475
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    return-object v0

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
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

.method public final m(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/a;
    .locals 1

    .line 1
    iget v0, p0, Ls2/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1, v0}, LD2/T;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/T;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, LD2/H;->B(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/H;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1, v0}, LD2/v0;->z(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/v0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, LD2/q0;->C(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/q0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :pswitch_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p1, v0}, LD2/n0;->A(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/n0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :pswitch_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p1, v0}, LD2/L;->z(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/L;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1, v0}, LD2/D;->B(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/D;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p1, v0}, LD2/z;->B(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/z;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {p1, v0}, LD2/t;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/t;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :pswitch_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p1, v0}, LD2/n;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/n;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :pswitch_9
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {p1, v0}, LD2/j;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/j;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final o(Lcom/google/crypto/tink/shaded/protobuf/a;)V
    .locals 10

    .line 1
    iget v0, p0, Ls2/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LD2/T;

    .line 7
    .line 8
    invoke-virtual {p1}, LD2/T;->B()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, LD2/T;->C()LD2/V;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lz2/c;->n(LD2/V;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 25
    .line 26
    const-string v0, "key too short"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :pswitch_0
    check-cast p1, LD2/H;

    .line 33
    .line 34
    invoke-virtual {p1}, LD2/H;->z()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/16 v1, 0x40

    .line 39
    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "invalid key size: "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LD2/H;->z()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, ". Valid keys must have 64 bytes."

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :pswitch_1
    check-cast p1, LD2/v0;

    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    check-cast p1, LD2/q0;

    .line 76
    .line 77
    invoke-virtual {p1}, LD2/q0;->A()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    invoke-virtual {p1}, LD2/q0;->B()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 95
    .line 96
    const-string v0, "invalid key format: missing KEK URI or DEK template"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :pswitch_3
    check-cast p1, LD2/n0;

    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_4
    check-cast p1, LD2/L;

    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_5
    check-cast p1, LD2/D;

    .line 109
    .line 110
    invoke-virtual {p1}, LD2/D;->z()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, LE2/o;->a(I)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_6
    check-cast p1, LD2/z;

    .line 119
    .line 120
    invoke-virtual {p1}, LD2/z;->z()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {p1}, LE2/o;->a(I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_7
    check-cast p1, LD2/t;

    .line 129
    .line 130
    invoke-virtual {p1}, LD2/t;->A()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v0}, LE2/o;->a(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, LD2/t;->B()LD2/v;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, LD2/v;->A()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const/16 v1, 0xc

    .line 146
    .line 147
    if-eq v0, v1, :cond_4

    .line 148
    .line 149
    invoke-virtual {p1}, LD2/t;->B()LD2/v;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, LD2/v;->A()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    const/16 v0, 0x10

    .line 158
    .line 159
    if-ne p1, v0, :cond_3

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 163
    .line 164
    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    .line 165
    .line 166
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_4
    :goto_0
    return-void

    .line 171
    :pswitch_8
    check-cast p1, LD2/n;

    .line 172
    .line 173
    invoke-virtual {p1}, LD2/n;->B()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0}, LE2/o;->a(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, LD2/n;->C()LD2/p;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v0, p0, Ls2/h;->c:Ls1/l;

    .line 185
    .line 186
    check-cast v0, Ls2/i;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, LD2/p;->A()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    const/16 v1, 0xc

    .line 196
    .line 197
    if-lt v0, v1, :cond_5

    .line 198
    .line 199
    invoke-virtual {p1}, LD2/p;->A()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    const/16 v0, 0x10

    .line 204
    .line 205
    if-gt p1, v0, :cond_5

    .line 206
    .line 207
    return-void

    .line 208
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 209
    .line 210
    const-string v0, "invalid IV size"

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :pswitch_9
    check-cast p1, LD2/j;

    .line 217
    .line 218
    new-instance v0, Ls2/g;

    .line 219
    .line 220
    const-class v1, LE2/k;

    .line 221
    .line 222
    const/4 v2, 0x1

    .line 223
    invoke-direct {v0, v1, v2}, Ls2/g;-><init>(Ljava/lang/Class;I)V

    .line 224
    .line 225
    .line 226
    filled-new-array {v0}, [Ls2/g;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v1, Ljava/util/HashMap;

    .line 231
    .line 232
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 233
    .line 234
    .line 235
    array-length v2, v0

    .line 236
    const/4 v3, 0x0

    .line 237
    move v4, v3

    .line 238
    :goto_1
    const-string v5, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 239
    .line 240
    if-ge v4, v2, :cond_7

    .line 241
    .line 242
    aget-object v6, v0, v4

    .line 243
    .line 244
    iget-object v7, v6, Ls2/g;->a:Ljava/lang/Class;

    .line 245
    .line 246
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    iget-object v8, v6, Ls2/g;->a:Ljava/lang/Class;

    .line 251
    .line 252
    if-nez v7, :cond_6

    .line 253
    .line 254
    invoke-virtual {v1, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    add-int/lit8 v4, v4, 0x1

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 261
    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :cond_7
    array-length v2, v0

    .line 283
    if-lez v2, :cond_8

    .line 284
    .line 285
    aget-object v0, v0, v3

    .line 286
    .line 287
    iget-object v0, v0, Ls2/g;->a:Ljava/lang/Class;

    .line 288
    .line 289
    :cond_8
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, LD2/j;->A()LD2/n;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v0}, LD2/n;->B()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-static {v1}, LE2/o;->a(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, LD2/n;->C()LD2/p;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, LD2/p;->A()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    const/16 v2, 0xc

    .line 312
    .line 313
    if-lt v1, v2, :cond_d

    .line 314
    .line 315
    invoke-virtual {v0}, LD2/p;->A()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    const/16 v1, 0x10

    .line 320
    .line 321
    if-gt v0, v1, :cond_d

    .line 322
    .line 323
    new-instance v0, Ls2/g;

    .line 324
    .line 325
    const-class v2, Lr2/j;

    .line 326
    .line 327
    const/16 v4, 0xb

    .line 328
    .line 329
    invoke-direct {v0, v2, v4}, Ls2/g;-><init>(Ljava/lang/Class;I)V

    .line 330
    .line 331
    .line 332
    filled-new-array {v0}, [Ls2/g;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    new-instance v2, Ljava/util/HashMap;

    .line 337
    .line 338
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 339
    .line 340
    .line 341
    array-length v4, v0

    .line 342
    move v6, v3

    .line 343
    :goto_2
    if-ge v6, v4, :cond_a

    .line 344
    .line 345
    aget-object v7, v0, v6

    .line 346
    .line 347
    iget-object v8, v7, Ls2/g;->a:Ljava/lang/Class;

    .line 348
    .line 349
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    iget-object v9, v7, Ls2/g;->a:Ljava/lang/Class;

    .line 354
    .line 355
    if-nez v8, :cond_9

    .line 356
    .line 357
    invoke-virtual {v2, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    add-int/lit8 v6, v6, 0x1

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 364
    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw p1

    .line 385
    :cond_a
    array-length v4, v0

    .line 386
    if-lez v4, :cond_b

    .line 387
    .line 388
    aget-object v0, v0, v3

    .line 389
    .line 390
    iget-object v0, v0, Ls2/g;->a:Ljava/lang/Class;

    .line 391
    .line 392
    :cond_b
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1}, LD2/j;->B()LD2/T;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0}, LD2/T;->B()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-lt v2, v1, :cond_c

    .line 404
    .line 405
    invoke-virtual {v0}, LD2/T;->C()LD2/V;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lz2/c;->n(LD2/V;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1}, LD2/j;->A()LD2/n;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-virtual {p1}, LD2/n;->B()I

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    invoke-static {p1}, LE2/o;->a(I)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 425
    .line 426
    const-string v0, "key too short"

    .line 427
    .line 428
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw p1

    .line 432
    :cond_d
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 433
    .line 434
    const-string v0, "invalid IV size"

    .line 435
    .line 436
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw p1

    .line 440
    nop

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
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
.end method
