.class public final Ln0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/m;
.implements LB0/p;
.implements Lx0/h0;
.implements LF0/s;
.implements Lx0/d0;


# static fields
.field public static final j0:Ljava/util/Set;


# instance fields
.field public final A:Ln0/n;

.field public final B:Ln0/n;

.field public final C:Landroid/os/Handler;

.field public final D:Ljava/util/ArrayList;

.field public final E:Ljava/util/Map;

.field public F:Ly0/e;

.field public G:[Ln0/p;

.field public H:[I

.field public final I:Ljava/util/HashSet;

.field public final J:Landroid/util/SparseIntArray;

.field public K:Ln0/o;

.field public L:I

.field public M:I

.field public N:Z

.field public O:Z

.field public P:I

.field public Q:La0/p;

.field public R:La0/p;

.field public S:Z

.field public T:Lx0/q0;

.field public U:Ljava/util/Set;

.field public V:[I

.field public W:I

.field public X:Z

.field public Y:[Z

.field public Z:[Z

.field public a0:J

.field public b0:J

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:J

.field public h0:La0/l;

.field public i0:Ln0/j;

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:Lm3/i;

.field public final o:Ln0/i;

.field public final p:LB0/f;

.field public final q:La0/p;

.field public final r:Lm0/i;

.field public final s:Lm0/e;

.field public final t:LA0/b;

.field public final u:LB0/r;

.field public final v:Lm0/e;

.field public final w:I

.field public final x:Lh0/c;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x5

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v1, v2, v3}, [Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Ln0/q;->j0:Ljava/util/Set;

    .line 34
    .line 35
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILm3/i;Ln0/i;Ljava/util/Map;LB0/f;JLa0/p;Lm0/i;Lm0/e;LA0/b;Lm0/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln0/q;->l:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Ln0/q;->m:I

    .line 7
    .line 8
    iput-object p3, p0, Ln0/q;->n:Lm3/i;

    .line 9
    .line 10
    iput-object p4, p0, Ln0/q;->o:Ln0/i;

    .line 11
    .line 12
    iput-object p5, p0, Ln0/q;->E:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, Ln0/q;->p:LB0/f;

    .line 15
    .line 16
    iput-object p9, p0, Ln0/q;->q:La0/p;

    .line 17
    .line 18
    iput-object p10, p0, Ln0/q;->r:Lm0/i;

    .line 19
    .line 20
    iput-object p11, p0, Ln0/q;->s:Lm0/e;

    .line 21
    .line 22
    iput-object p12, p0, Ln0/q;->t:LA0/b;

    .line 23
    .line 24
    iput-object p13, p0, Ln0/q;->v:Lm0/e;

    .line 25
    .line 26
    iput p14, p0, Ln0/q;->w:I

    .line 27
    .line 28
    new-instance p1, LB0/r;

    .line 29
    .line 30
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 31
    .line 32
    invoke-direct {p1, p2}, LB0/r;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ln0/q;->u:LB0/r;

    .line 36
    .line 37
    new-instance p1, Lh0/c;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    iput-object p2, p1, Lh0/c;->b:Ljava/lang/Object;

    .line 44
    .line 45
    const/4 p3, 0x0

    .line 46
    iput-boolean p3, p1, Lh0/c;->a:Z

    .line 47
    .line 48
    iput-object p2, p1, Lh0/c;->c:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object p1, p0, Ln0/q;->x:Lh0/c;

    .line 51
    .line 52
    new-array p1, p3, [I

    .line 53
    .line 54
    iput-object p1, p0, Ln0/q;->H:[I

    .line 55
    .line 56
    new-instance p1, Ljava/util/HashSet;

    .line 57
    .line 58
    sget-object p4, Ln0/q;->j0:Ljava/util/Set;

    .line 59
    .line 60
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 61
    .line 62
    .line 63
    move-result p5

    .line 64
    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Ln0/q;->I:Ljava/util/HashSet;

    .line 68
    .line 69
    new-instance p1, Landroid/util/SparseIntArray;

    .line 70
    .line 71
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Ln0/q;->J:Landroid/util/SparseIntArray;

    .line 79
    .line 80
    new-array p1, p3, [Ln0/p;

    .line 81
    .line 82
    iput-object p1, p0, Ln0/q;->G:[Ln0/p;

    .line 83
    .line 84
    new-array p1, p3, [Z

    .line 85
    .line 86
    iput-object p1, p0, Ln0/q;->Z:[Z

    .line 87
    .line 88
    new-array p1, p3, [Z

    .line 89
    .line 90
    iput-object p1, p0, Ln0/q;->Y:[Z

    .line 91
    .line 92
    new-instance p1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Ln0/q;->z:Ljava/util/List;

    .line 104
    .line 105
    new-instance p1, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Ln0/q;->D:Ljava/util/ArrayList;

    .line 111
    .line 112
    new-instance p1, Ln0/n;

    .line 113
    .line 114
    const/4 p3, 0x0

    .line 115
    invoke-direct {p1, p0, p3}, Ln0/n;-><init>(Ln0/q;I)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Ln0/q;->A:Ln0/n;

    .line 119
    .line 120
    new-instance p1, Ln0/n;

    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    invoke-direct {p1, p0, p3}, Ln0/n;-><init>(Ln0/q;I)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Ln0/q;->B:Ln0/n;

    .line 127
    .line 128
    invoke-static {p2}, Ld0/w;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, p0, Ln0/q;->C:Landroid/os/Handler;

    .line 133
    .line 134
    iput-wide p7, p0, Ln0/q;->a0:J

    .line 135
    .line 136
    iput-wide p7, p0, Ln0/q;->b0:J

    .line 137
    .line 138
    return-void
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
.end method

.method public static B(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
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

.method public static w(II)LF0/o;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unmapped track with id "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " of type "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "HlsSampleStreamWrapper"

    .line 24
    .line 25
    invoke-static {p1, p0}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, LF0/o;

    .line 29
    .line 30
    invoke-direct {p0}, LF0/o;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p0
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

.method public static y(La0/p;La0/p;Z)La0/p;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p1, La0/p;->n:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, La0/G;->h(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, La0/p;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v1}, Ld0/w;->t(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-static {v2, v1}, Ld0/w;->u(Ljava/lang/String;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La0/G;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v2, v0}, La0/G;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v7, v2

    .line 33
    move-object v2, v0

    .line 34
    move-object v0, v7

    .line 35
    :goto_0
    invoke-virtual {p1}, La0/p;->a()La0/o;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v5, p0, La0/p;->a:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v5, v3, La0/o;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v5, p0, La0/p;->b:Ljava/lang/String;

    .line 44
    .line 45
    iput-object v5, v3, La0/o;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v5, p0, La0/p;->c:Lm2/I;

    .line 48
    .line 49
    invoke-static {v5}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iput-object v5, v3, La0/o;->c:Lm2/I;

    .line 54
    .line 55
    iget-object v5, p0, La0/p;->d:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v5, v3, La0/o;->d:Ljava/lang/String;

    .line 58
    .line 59
    iget v5, p0, La0/p;->e:I

    .line 60
    .line 61
    iput v5, v3, La0/o;->e:I

    .line 62
    .line 63
    iget v5, p0, La0/p;->f:I

    .line 64
    .line 65
    iput v5, v3, La0/o;->f:I

    .line 66
    .line 67
    const/4 v5, -0x1

    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    iget v6, p0, La0/p;->h:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move v6, v5

    .line 74
    :goto_1
    iput v6, v3, La0/o;->h:I

    .line 75
    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    iget p2, p0, La0/p;->i:I

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move p2, v5

    .line 82
    :goto_2
    iput p2, v3, La0/o;->i:I

    .line 83
    .line 84
    iput-object v0, v3, La0/o;->j:Ljava/lang/String;

    .line 85
    .line 86
    const/4 p2, 0x2

    .line 87
    if-ne v1, p2, :cond_4

    .line 88
    .line 89
    iget p2, p0, La0/p;->u:I

    .line 90
    .line 91
    iput p2, v3, La0/o;->t:I

    .line 92
    .line 93
    iget p2, p0, La0/p;->v:I

    .line 94
    .line 95
    iput p2, v3, La0/o;->u:I

    .line 96
    .line 97
    iget p2, p0, La0/p;->w:F

    .line 98
    .line 99
    iput p2, v3, La0/o;->v:F

    .line 100
    .line 101
    :cond_4
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {v3, v2}, La0/o;->g(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget p2, p0, La0/p;->C:I

    .line 107
    .line 108
    if-eq p2, v5, :cond_6

    .line 109
    .line 110
    if-ne v1, v4, :cond_6

    .line 111
    .line 112
    iput p2, v3, La0/o;->B:I

    .line 113
    .line 114
    :cond_6
    iget-object p0, p0, La0/p;->l:La0/F;

    .line 115
    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    iget-object p1, p1, La0/p;->l:La0/F;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    invoke-virtual {p1, p0}, La0/F;->e(La0/F;)La0/F;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :cond_7
    iput-object p0, v3, La0/o;->k:La0/F;

    .line 127
    .line 128
    :cond_8
    new-instance p0, La0/p;

    .line 129
    .line 130
    invoke-direct {p0, v3}, La0/p;-><init>(La0/o;)V

    .line 131
    .line 132
    .line 133
    return-object p0
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
.method public final A()Ln0/j;
    .locals 2

    .line 1
    iget-object v0, p0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ln0/j;

    .line 14
    .line 15
    return-object v0
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

.method public final C()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ln0/q;->b0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0
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

.method public final D()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, v0, Ln0/q;->S:Z

    .line 5
    .line 6
    if-nez v2, :cond_1a

    .line 7
    .line 8
    iget-object v2, v0, Ln0/q;->V:[I

    .line 9
    .line 10
    if-nez v2, :cond_1a

    .line 11
    .line 12
    iget-boolean v2, v0, Ln0/q;->N:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_12

    .line 17
    .line 18
    :cond_0
    iget-object v2, v0, Ln0/q;->G:[Ln0/p;

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v5, v3, :cond_2

    .line 24
    .line 25
    aget-object v6, v2, v5

    .line 26
    .line 27
    invoke-virtual {v6}, Lx0/e0;->q()La0/p;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    add-int/2addr v5, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget-object v2, v0, Ln0/q;->T:Lx0/q0;

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    const/4 v5, -0x1

    .line 40
    if-eqz v2, :cond_a

    .line 41
    .line 42
    iget v2, v2, Lx0/q0;->a:I

    .line 43
    .line 44
    new-array v6, v2, [I

    .line 45
    .line 46
    iput-object v6, v0, Ln0/q;->V:[I

    .line 47
    .line 48
    invoke-static {v6, v5}, Ljava/util/Arrays;->fill([II)V

    .line 49
    .line 50
    .line 51
    move v5, v4

    .line 52
    :goto_1
    if-ge v5, v2, :cond_9

    .line 53
    .line 54
    move v6, v4

    .line 55
    :goto_2
    iget-object v7, v0, Ln0/q;->G:[Ln0/p;

    .line 56
    .line 57
    array-length v8, v7

    .line 58
    if-ge v6, v8, :cond_8

    .line 59
    .line 60
    aget-object v7, v7, v6

    .line 61
    .line 62
    invoke-virtual {v7}, Lx0/e0;->q()La0/p;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v7}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v8, v0, Ln0/q;->T:Lx0/q0;

    .line 70
    .line 71
    invoke-virtual {v8, v5}, Lx0/q0;->a(I)La0/V;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget-object v8, v8, La0/V;->d:[La0/p;

    .line 76
    .line 77
    aget-object v8, v8, v4

    .line 78
    .line 79
    iget-object v9, v8, La0/p;->n:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v10, v7, La0/p;->n:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v10}, La0/G;->h(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-eq v11, v3, :cond_3

    .line 88
    .line 89
    invoke-static {v9}, La0/G;->h(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-ne v11, v7, :cond_7

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    sget v11, Ld0/w;->a:I

    .line 97
    .line 98
    invoke-static {v10, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-nez v9, :cond_4

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    const-string v9, "application/cea-608"

    .line 106
    .line 107
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-nez v9, :cond_5

    .line 112
    .line 113
    const-string v9, "application/cea-708"

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_6

    .line 120
    .line 121
    :cond_5
    iget v7, v7, La0/p;->H:I

    .line 122
    .line 123
    iget v8, v8, La0/p;->H:I

    .line 124
    .line 125
    if-ne v7, v8, :cond_7

    .line 126
    .line 127
    :cond_6
    :goto_3
    iget-object v7, v0, Ln0/q;->V:[I

    .line 128
    .line 129
    aput v6, v7, v5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    :goto_4
    add-int/2addr v6, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_8
    :goto_5
    add-int/2addr v5, v1

    .line 135
    goto :goto_1

    .line 136
    :cond_9
    iget-object v1, v0, Ln0/q;->D:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_1a

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Ln0/m;

    .line 153
    .line 154
    invoke-virtual {v2}, Ln0/m;->b()V

    .line 155
    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_a
    iget-object v2, v0, Ln0/q;->G:[Ln0/p;

    .line 159
    .line 160
    array-length v2, v2

    .line 161
    const/4 v6, -0x2

    .line 162
    move v7, v4

    .line 163
    move v9, v5

    .line 164
    move v8, v6

    .line 165
    :goto_7
    const/4 v10, 0x2

    .line 166
    if-ge v7, v2, :cond_10

    .line 167
    .line 168
    iget-object v11, v0, Ln0/q;->G:[Ln0/p;

    .line 169
    .line 170
    aget-object v11, v11, v7

    .line 171
    .line 172
    invoke-virtual {v11}, Lx0/e0;->q()La0/p;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-static {v11}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object v11, v11, La0/p;->n:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v11}, La0/G;->l(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v12, :cond_b

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_b
    invoke-static {v11}, La0/G;->i(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-eqz v10, :cond_c

    .line 193
    .line 194
    move v10, v1

    .line 195
    goto :goto_8

    .line 196
    :cond_c
    invoke-static {v11}, La0/G;->k(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-eqz v10, :cond_d

    .line 201
    .line 202
    move v10, v3

    .line 203
    goto :goto_8

    .line 204
    :cond_d
    move v10, v6

    .line 205
    :goto_8
    invoke-static {v10}, Ln0/q;->B(I)I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    invoke-static {v8}, Ln0/q;->B(I)I

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-le v11, v12, :cond_e

    .line 214
    .line 215
    move v9, v7

    .line 216
    move v8, v10

    .line 217
    goto :goto_9

    .line 218
    :cond_e
    if-ne v10, v8, :cond_f

    .line 219
    .line 220
    if-eq v9, v5, :cond_f

    .line 221
    .line 222
    move v9, v5

    .line 223
    :cond_f
    :goto_9
    add-int/2addr v7, v1

    .line 224
    goto :goto_7

    .line 225
    :cond_10
    iget-object v3, v0, Ln0/q;->o:Ln0/i;

    .line 226
    .line 227
    iget-object v3, v3, Ln0/i;->h:La0/V;

    .line 228
    .line 229
    iget v6, v3, La0/V;->a:I

    .line 230
    .line 231
    iput v5, v0, Ln0/q;->W:I

    .line 232
    .line 233
    new-array v5, v2, [I

    .line 234
    .line 235
    iput-object v5, v0, Ln0/q;->V:[I

    .line 236
    .line 237
    move v5, v4

    .line 238
    :goto_a
    if-ge v5, v2, :cond_11

    .line 239
    .line 240
    iget-object v7, v0, Ln0/q;->V:[I

    .line 241
    .line 242
    aput v5, v7, v5

    .line 243
    .line 244
    add-int/2addr v5, v1

    .line 245
    goto :goto_a

    .line 246
    :cond_11
    new-array v5, v2, [La0/V;

    .line 247
    .line 248
    move v7, v4

    .line 249
    :goto_b
    if-ge v7, v2, :cond_18

    .line 250
    .line 251
    iget-object v11, v0, Ln0/q;->G:[Ln0/p;

    .line 252
    .line 253
    aget-object v11, v11, v7

    .line 254
    .line 255
    invoke-virtual {v11}, Lx0/e0;->q()La0/p;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    invoke-static {v11}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object v12, v0, Ln0/q;->l:Ljava/lang/String;

    .line 263
    .line 264
    iget-object v13, v0, Ln0/q;->q:La0/p;

    .line 265
    .line 266
    if-ne v7, v9, :cond_15

    .line 267
    .line 268
    new-array v14, v6, [La0/p;

    .line 269
    .line 270
    move v15, v4

    .line 271
    :goto_c
    if-ge v15, v6, :cond_14

    .line 272
    .line 273
    iget-object v4, v3, La0/V;->d:[La0/p;

    .line 274
    .line 275
    aget-object v4, v4, v15

    .line 276
    .line 277
    if-ne v8, v1, :cond_12

    .line 278
    .line 279
    if-eqz v13, :cond_12

    .line 280
    .line 281
    invoke-virtual {v4, v13}, La0/p;->e(La0/p;)La0/p;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    :cond_12
    if-ne v6, v1, :cond_13

    .line 286
    .line 287
    invoke-virtual {v11, v4}, La0/p;->e(La0/p;)La0/p;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    goto :goto_d

    .line 292
    :cond_13
    invoke-static {v4, v11, v1}, Ln0/q;->y(La0/p;La0/p;Z)La0/p;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    :goto_d
    aput-object v4, v14, v15

    .line 297
    .line 298
    add-int/2addr v15, v1

    .line 299
    const/4 v4, 0x0

    .line 300
    goto :goto_c

    .line 301
    :cond_14
    new-instance v4, La0/V;

    .line 302
    .line 303
    invoke-direct {v4, v12, v14}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    .line 304
    .line 305
    .line 306
    aput-object v4, v5, v7

    .line 307
    .line 308
    iput v7, v0, Ln0/q;->W:I

    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    goto :goto_10

    .line 312
    :cond_15
    if-ne v8, v10, :cond_16

    .line 313
    .line 314
    iget-object v4, v11, La0/p;->n:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v4}, La0/G;->i(Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_16

    .line 321
    .line 322
    goto :goto_e

    .line 323
    :cond_16
    const/4 v13, 0x0

    .line 324
    :goto_e
    new-instance v4, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v12, ":muxed:"

    .line 333
    .line 334
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    if-ge v7, v9, :cond_17

    .line 338
    .line 339
    move v12, v7

    .line 340
    goto :goto_f

    .line 341
    :cond_17
    add-int/lit8 v12, v7, -0x1

    .line 342
    .line 343
    :goto_f
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    new-instance v12, La0/V;

    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    invoke-static {v13, v11, v14}, Ln0/q;->y(La0/p;La0/p;Z)La0/p;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    filled-new-array {v11}, [La0/p;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-direct {v12, v4, v11}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    .line 362
    .line 363
    .line 364
    aput-object v12, v5, v7

    .line 365
    .line 366
    :goto_10
    add-int/2addr v7, v1

    .line 367
    move v4, v14

    .line 368
    goto :goto_b

    .line 369
    :cond_18
    move v14, v4

    .line 370
    invoke-virtual {v0, v5}, Ln0/q;->x([La0/V;)Lx0/q0;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iput-object v2, v0, Ln0/q;->T:Lx0/q0;

    .line 375
    .line 376
    iget-object v2, v0, Ln0/q;->U:Ljava/util/Set;

    .line 377
    .line 378
    if-nez v2, :cond_19

    .line 379
    .line 380
    move v4, v1

    .line 381
    goto :goto_11

    .line 382
    :cond_19
    move v4, v14

    .line 383
    :goto_11
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 384
    .line 385
    .line 386
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    iput-object v2, v0, Ln0/q;->U:Ljava/util/Set;

    .line 391
    .line 392
    iput-boolean v1, v0, Ln0/q;->O:Z

    .line 393
    .line 394
    iget-object v1, v0, Ln0/q;->n:Lm3/i;

    .line 395
    .line 396
    invoke-virtual {v1}, Lm3/i;->r()V

    .line 397
    .line 398
    .line 399
    :cond_1a
    :goto_12
    return-void
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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

.method public final E()V
    .locals 3

    .line 1
    iget-object v0, p0, Ln0/q;->u:LB0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/r;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln0/q;->o:Ln0/i;

    .line 7
    .line 8
    iget-object v1, v0, Ln0/i;->n:Lx0/b;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, v0, Ln0/i;->o:Landroid/net/Uri;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-boolean v2, v0, Ln0/i;->s:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Ln0/i;->g:Lo0/c;

    .line 21
    .line 22
    iget-object v0, v0, Lo0/c;->o:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lo0/b;

    .line 29
    .line 30
    iget-object v1, v0, Lo0/b;->m:LB0/r;

    .line 31
    .line 32
    invoke-virtual {v1}, LB0/r;->a()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lo0/b;->u:Ljava/io/IOException;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    throw v0

    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :cond_2
    throw v1
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

.method public final varargs F([La0/V;[I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Ln0/q;->x([La0/V;)Lx0/q0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ln0/q;->T:Lx0/q0;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ln0/q;->U:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    if-ge v1, p1, :cond_0

    .line 18
    .line 19
    aget v2, p2, v1

    .line 20
    .line 21
    iget-object v3, p0, Ln0/q;->U:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v4, p0, Ln0/q;->T:Lx0/q0;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Lx0/q0;->a(I)La0/V;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p0, Ln0/q;->W:I

    .line 36
    .line 37
    iget-object p1, p0, Ln0/q;->C:Landroid/os/Handler;

    .line 38
    .line 39
    iget-object p2, p0, Ln0/q;->n:Lm3/i;

    .line 40
    .line 41
    new-instance v0, LA3/c;

    .line 42
    .line 43
    const/16 v1, 0x11

    .line 44
    .line 45
    invoke-direct {v0, p2, v1}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Ln0/q;->O:Z

    .line 53
    .line 54
    return-void
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

.method public final G()V
    .locals 6

    .line 1
    iget-object v0, p0, Ln0/q;->G:[Ln0/p;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, Ln0/q;->c0:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lx0/e0;->z(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, Ln0/q;->c0:Z

    .line 19
    .line 20
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

.method public final H(JZ)Z
    .locals 8

    .line 1
    iput-wide p1, p0, Ln0/q;->a0:J

    .line 2
    .line 3
    invoke-virtual {p0}, Ln0/q;->C()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, Ln0/q;->b0:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Ln0/q;->o:Ln0/i;

    .line 14
    .line 15
    iget-boolean v0, v0, Ln0/i;->p:Z

    .line 16
    .line 17
    iget-object v2, p0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    move v0, v4

    .line 24
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v0, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ln0/j;

    .line 35
    .line 36
    iget-wide v6, v5, Ly0/e;->r:J

    .line 37
    .line 38
    cmp-long v6, v6, p1

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v5, v3

    .line 47
    :goto_1
    iget-boolean v0, p0, Ln0/q;->N:Z

    .line 48
    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    if-nez p3, :cond_7

    .line 52
    .line 53
    iget-object p3, p0, Ln0/q;->G:[Ln0/p;

    .line 54
    .line 55
    array-length p3, p3

    .line 56
    move v0, v4

    .line 57
    :goto_2
    if-ge v0, p3, :cond_6

    .line 58
    .line 59
    iget-object v6, p0, Ln0/q;->G:[Ln0/p;

    .line 60
    .line 61
    aget-object v6, v6, v0

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ln0/j;->f(I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v6, v7}, Lx0/e0;->A(I)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-virtual {v6, p1, p2, v4}, Lx0/e0;->B(JZ)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    :goto_3
    if-nez v6, :cond_5

    .line 79
    .line 80
    iget-object v6, p0, Ln0/q;->Z:[Z

    .line 81
    .line 82
    aget-boolean v6, v6, v0

    .line 83
    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    iget-boolean v6, p0, Ln0/q;->X:Z

    .line 87
    .line 88
    if-nez v6, :cond_5

    .line 89
    .line 90
    :cond_4
    move p3, v4

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    move p3, v1

    .line 96
    :goto_4
    if-eqz p3, :cond_7

    .line 97
    .line 98
    return v4

    .line 99
    :cond_7
    iput-wide p1, p0, Ln0/q;->b0:J

    .line 100
    .line 101
    iput-boolean v4, p0, Ln0/q;->e0:Z

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Ln0/q;->u:LB0/r;

    .line 107
    .line 108
    invoke-virtual {p1}, LB0/r;->d()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_9

    .line 113
    .line 114
    iget-boolean p2, p0, Ln0/q;->N:Z

    .line 115
    .line 116
    if-eqz p2, :cond_8

    .line 117
    .line 118
    iget-object p2, p0, Ln0/q;->G:[Ln0/p;

    .line 119
    .line 120
    array-length p3, p2

    .line 121
    :goto_5
    if-ge v4, p3, :cond_8

    .line 122
    .line 123
    aget-object v0, p2, v4

    .line 124
    .line 125
    invoke-virtual {v0}, Lx0/e0;->g()V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    invoke-virtual {p1}, LB0/r;->b()V

    .line 132
    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_9
    iput-object v3, p1, LB0/r;->n:Ljava/io/IOException;

    .line 136
    .line 137
    invoke-virtual {p0}, Ln0/q;->G()V

    .line 138
    .line 139
    .line 140
    :goto_6
    return v1
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln0/q;->O:Z

    .line 2
    .line 3
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln0/q;->T:Lx0/q0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ln0/q;->U:Ljava/util/Set;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
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
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln0/q;->u:LB0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/r;->d()Z

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

.method public final d(LF0/E;)V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln0/q;->G:[Ln0/p;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lx0/e0;->y()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public final h()J
    .locals 7

    .line 1
    iget-boolean v0, p0, Ln0/q;->e0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ln0/q;->C()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Ln0/q;->b0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    iget-wide v0, p0, Ln0/q;->a0:J

    .line 18
    .line 19
    invoke-virtual {p0}, Ln0/q;->A()Ln0/j;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-boolean v3, v2, Ln0/j;->S:Z

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v2, p0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit8 v3, v3, -0x2

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ln0/j;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iget-wide v2, v2, Ly0/e;->s:J

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    :cond_4
    iget-boolean v2, p0, Ln0/q;->N:Z

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    iget-object v2, p0, Ln0/q;->G:[Ln0/p;

    .line 64
    .line 65
    array-length v3, v2

    .line 66
    const/4 v4, 0x0

    .line 67
    :goto_1
    if-ge v4, v3, :cond_5

    .line 68
    .line 69
    aget-object v5, v2, v4

    .line 70
    .line 71
    invoke-virtual {v5}, Lx0/e0;->l()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    return-wide v0
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

.method public final i(LB0/o;JJ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    check-cast v1, Ly0/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, Ln0/q;->F:Ly0/e;

    .line 7
    .line 8
    iget-object v2, v0, Ln0/q;->o:Ln0/i;

    .line 9
    .line 10
    instance-of v3, v1, Ln0/e;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    move-object v3, v1

    .line 15
    check-cast v3, Ln0/e;

    .line 16
    .line 17
    iget-object v4, v3, Ln0/e;->u:[B

    .line 18
    .line 19
    iput-object v4, v2, Ln0/i;->m:[B

    .line 20
    .line 21
    iget-object v4, v3, Ly0/e;->m:Lf0/l;

    .line 22
    .line 23
    iget-object v4, v4, Lf0/l;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v3, v3, Ln0/e;->w:[B

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, Ln0/i;->j:Lm3/i;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, v2, Lm3/i;->m:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ln0/d;

    .line 41
    .line 42
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, [B

    .line 47
    .line 48
    :cond_0
    new-instance v4, Lx0/z;

    .line 49
    .line 50
    iget-wide v2, v1, Ly0/e;->l:J

    .line 51
    .line 52
    iget-object v2, v1, Ly0/e;->t:Lf0/z;

    .line 53
    .line 54
    iget-object v2, v2, Lf0/z;->n:Landroid/net/Uri;

    .line 55
    .line 56
    move-wide/from16 v2, p4

    .line 57
    .line 58
    invoke-direct {v4, v2, v3}, Lx0/z;-><init>(J)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v0, Ln0/q;->t:LA0/b;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Ln0/q;->v:Lm0/e;

    .line 67
    .line 68
    iget-wide v10, v1, Ly0/e;->r:J

    .line 69
    .line 70
    iget-wide v12, v1, Ly0/e;->s:J

    .line 71
    .line 72
    iget v5, v1, Ly0/e;->n:I

    .line 73
    .line 74
    iget v6, v0, Ln0/q;->m:I

    .line 75
    .line 76
    iget-object v7, v1, Ly0/e;->o:La0/p;

    .line 77
    .line 78
    iget v8, v1, Ly0/e;->p:I

    .line 79
    .line 80
    iget-object v9, v1, Ly0/e;->q:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual/range {v3 .. v13}, Lm0/e;->e(Lx0/z;IILa0/p;ILjava/lang/Object;JJ)V

    .line 83
    .line 84
    .line 85
    iget-boolean v1, v0, Ln0/q;->O:Z

    .line 86
    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    new-instance v1, Lh0/S;

    .line 90
    .line 91
    invoke-direct {v1}, Lh0/S;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-wide v2, v0, Ln0/q;->a0:J

    .line 95
    .line 96
    iput-wide v2, v1, Lh0/S;->a:J

    .line 97
    .line 98
    new-instance v2, Lh0/T;

    .line 99
    .line 100
    invoke-direct {v2, v1}, Lh0/T;-><init>(Lh0/S;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v2}, Ln0/q;->v(Lh0/T;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    iget-object v1, v0, Ln0/q;->n:Lm3/i;

    .line 108
    .line 109
    invoke-virtual {v1, p0}, Lm3/i;->d(Lx0/h0;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    return-void
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

.method public final j()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln0/q;->f0:Z

    .line 3
    .line 4
    iget-object v0, p0, Ln0/q;->C:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Ln0/q;->B:Ln0/n;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final k(II)LF0/K;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Ln0/q;->j0:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v3, p0, Ln0/q;->I:Ljava/util/HashSet;

    .line 13
    .line 14
    iget-object v4, p0, Ln0/q;->J:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 29
    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-virtual {v4, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ne v2, v1, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Ln0/q;->H:[I

    .line 50
    .line 51
    aput p1, v1, v2

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Ln0/q;->H:[I

    .line 54
    .line 55
    aget v1, v1, v2

    .line 56
    .line 57
    if-ne v1, p1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Ln0/q;->G:[Ln0/p;

    .line 60
    .line 61
    aget-object v1, v1, v2

    .line 62
    .line 63
    :goto_0
    move-object v6, v1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-static {p1, p2}, Ln0/q;->w(II)LF0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move v1, v5

    .line 71
    :goto_1
    iget-object v2, p0, Ln0/q;->G:[Ln0/p;

    .line 72
    .line 73
    array-length v7, v2

    .line 74
    if-ge v1, v7, :cond_5

    .line 75
    .line 76
    iget-object v7, p0, Ln0/q;->H:[I

    .line 77
    .line 78
    aget v7, v7, v1

    .line 79
    .line 80
    if-ne v7, p1, :cond_4

    .line 81
    .line 82
    aget-object v6, v2, v1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    add-int/2addr v1, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    :goto_2
    if-nez v6, :cond_d

    .line 88
    .line 89
    iget-boolean v1, p0, Ln0/q;->f0:Z

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    invoke-static {p1, p2}, Ln0/q;->w(II)LF0/o;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_6
    iget-object v1, p0, Ln0/q;->G:[Ln0/p;

    .line 99
    .line 100
    array-length v1, v1

    .line 101
    if-eq p2, v0, :cond_7

    .line 102
    .line 103
    const/4 v2, 0x2

    .line 104
    if-ne p2, v2, :cond_8

    .line 105
    .line 106
    :cond_7
    move v5, v0

    .line 107
    :cond_8
    new-instance v6, Ln0/p;

    .line 108
    .line 109
    iget-object v2, p0, Ln0/q;->s:Lm0/e;

    .line 110
    .line 111
    iget-object v7, p0, Ln0/q;->p:LB0/f;

    .line 112
    .line 113
    iget-object v8, p0, Ln0/q;->E:Ljava/util/Map;

    .line 114
    .line 115
    iget-object v9, p0, Ln0/q;->r:Lm0/i;

    .line 116
    .line 117
    invoke-direct {v6, v7, v9, v2, v8}, Ln0/p;-><init>(LB0/f;Lm0/i;Lm0/e;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    iget-wide v7, p0, Ln0/q;->a0:J

    .line 121
    .line 122
    iput-wide v7, v6, Lx0/e0;->t:J

    .line 123
    .line 124
    if-eqz v5, :cond_9

    .line 125
    .line 126
    iget-object v2, p0, Ln0/q;->h0:La0/l;

    .line 127
    .line 128
    iput-object v2, v6, Ln0/p;->I:La0/l;

    .line 129
    .line 130
    iput-boolean v0, v6, Lx0/e0;->z:Z

    .line 131
    .line 132
    :cond_9
    iget-wide v7, p0, Ln0/q;->g0:J

    .line 133
    .line 134
    iget-wide v9, v6, Lx0/e0;->F:J

    .line 135
    .line 136
    cmp-long v2, v9, v7

    .line 137
    .line 138
    if-eqz v2, :cond_a

    .line 139
    .line 140
    iput-wide v7, v6, Lx0/e0;->F:J

    .line 141
    .line 142
    iput-boolean v0, v6, Lx0/e0;->z:Z

    .line 143
    .line 144
    :cond_a
    iget-object v2, p0, Ln0/q;->i0:Ln0/j;

    .line 145
    .line 146
    if-eqz v2, :cond_b

    .line 147
    .line 148
    iget v2, v2, Ln0/j;->v:I

    .line 149
    .line 150
    int-to-long v7, v2

    .line 151
    iput-wide v7, v6, Lx0/e0;->C:J

    .line 152
    .line 153
    :cond_b
    iput-object p0, v6, Lx0/e0;->f:Lx0/d0;

    .line 154
    .line 155
    iget-object v2, p0, Ln0/q;->H:[I

    .line 156
    .line 157
    add-int/lit8 v7, v1, 0x1

    .line 158
    .line 159
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iput-object v2, p0, Ln0/q;->H:[I

    .line 164
    .line 165
    aput p1, v2, v1

    .line 166
    .line 167
    iget-object p1, p0, Ln0/q;->G:[Ln0/p;

    .line 168
    .line 169
    sget v2, Ld0/w;->a:I

    .line 170
    .line 171
    array-length v2, p1

    .line 172
    add-int/2addr v2, v0

    .line 173
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    array-length p1, p1

    .line 178
    aput-object v6, v0, p1

    .line 179
    .line 180
    check-cast v0, [Ln0/p;

    .line 181
    .line 182
    iput-object v0, p0, Ln0/q;->G:[Ln0/p;

    .line 183
    .line 184
    iget-object p1, p0, Ln0/q;->Z:[Z

    .line 185
    .line 186
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, Ln0/q;->Z:[Z

    .line 191
    .line 192
    aput-boolean v5, p1, v1

    .line 193
    .line 194
    iget-boolean p1, p0, Ln0/q;->X:Z

    .line 195
    .line 196
    or-int/2addr p1, v5

    .line 197
    iput-boolean p1, p0, Ln0/q;->X:Z

    .line 198
    .line 199
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, p2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 207
    .line 208
    .line 209
    invoke-static {p2}, Ln0/q;->B(I)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iget v0, p0, Ln0/q;->L:I

    .line 214
    .line 215
    invoke-static {v0}, Ln0/q;->B(I)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-le p1, v0, :cond_c

    .line 220
    .line 221
    iput v1, p0, Ln0/q;->M:I

    .line 222
    .line 223
    iput p2, p0, Ln0/q;->L:I

    .line 224
    .line 225
    :cond_c
    iget-object p1, p0, Ln0/q;->Y:[Z

    .line 226
    .line 227
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Ln0/q;->Y:[Z

    .line 232
    .line 233
    :cond_d
    const/4 p1, 0x5

    .line 234
    if-ne p2, p1, :cond_f

    .line 235
    .line 236
    iget-object p1, p0, Ln0/q;->K:Ln0/o;

    .line 237
    .line 238
    if-nez p1, :cond_e

    .line 239
    .line 240
    new-instance p1, Ln0/o;

    .line 241
    .line 242
    iget p2, p0, Ln0/q;->w:I

    .line 243
    .line 244
    invoke-direct {p1, v6, p2}, Ln0/o;-><init>(LF0/K;I)V

    .line 245
    .line 246
    .line 247
    iput-object p1, p0, Ln0/q;->K:Ln0/o;

    .line 248
    .line 249
    :cond_e
    iget-object p1, p0, Ln0/q;->K:Ln0/o;

    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_f
    return-object v6
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln0/q;->C:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Ln0/q;->A:Ln0/n;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
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

.method public final n(LB0/o;JJLjava/io/IOException;I)LB0/k;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Ly0/e;

    .line 8
    .line 9
    instance-of v2, v1, Ln0/j;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Ln0/j;

    .line 15
    .line 16
    iget-boolean v3, v3, Ln0/j;->V:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    instance-of v3, v12, Lf0/v;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    move-object v3, v12

    .line 25
    check-cast v3, Lf0/v;

    .line 26
    .line 27
    iget v3, v3, Lf0/v;->o:I

    .line 28
    .line 29
    const/16 v4, 0x19a

    .line 30
    .line 31
    if-eq v3, v4, :cond_0

    .line 32
    .line 33
    const/16 v4, 0x194

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    :cond_0
    sget-object v1, LB0/r;->o:LB0/k;

    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    iget-object v3, v1, Ly0/e;->t:Lf0/z;

    .line 42
    .line 43
    iget-wide v3, v3, Lf0/z;->m:J

    .line 44
    .line 45
    new-instance v5, Lx0/z;

    .line 46
    .line 47
    iget-object v6, v1, Ly0/e;->t:Lf0/z;

    .line 48
    .line 49
    iget-object v6, v6, Lf0/z;->n:Landroid/net/Uri;

    .line 50
    .line 51
    move-wide/from16 v6, p4

    .line 52
    .line 53
    invoke-direct {v5, v6, v7}, Lx0/z;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-wide v6, v1, Ly0/e;->r:J

    .line 57
    .line 58
    invoke-static {v6, v7}, Ld0/w;->Z(J)J

    .line 59
    .line 60
    .line 61
    iget-wide v6, v1, Ly0/e;->s:J

    .line 62
    .line 63
    invoke-static {v6, v7}, Ld0/w;->Z(J)J

    .line 64
    .line 65
    .line 66
    new-instance v6, LA/j;

    .line 67
    .line 68
    move/from16 v7, p7

    .line 69
    .line 70
    invoke-direct {v6, v12, v7}, LA/j;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iget-object v7, v0, Ln0/q;->o:Ln0/i;

    .line 74
    .line 75
    iget-object v8, v7, Ln0/i;->q:LA0/w;

    .line 76
    .line 77
    invoke-static {v8}, LD1/b;->r(LA0/w;)LB0/j;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    iget-object v9, v0, Ln0/q;->t:LA0/b;

    .line 82
    .line 83
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v6}, LA0/b;->m(LB0/j;LA/j;)LB0/k;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const/4 v9, 0x0

    .line 91
    if-eqz v8, :cond_2

    .line 92
    .line 93
    iget v10, v8, LB0/k;->a:I

    .line 94
    .line 95
    const/4 v11, 0x2

    .line 96
    if-ne v10, v11, :cond_2

    .line 97
    .line 98
    iget-object v10, v7, Ln0/i;->q:LA0/w;

    .line 99
    .line 100
    iget-object v7, v7, Ln0/i;->h:La0/V;

    .line 101
    .line 102
    iget-object v11, v1, Ly0/e;->o:La0/p;

    .line 103
    .line 104
    invoke-virtual {v7, v11}, La0/V;->b(La0/p;)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-interface {v10, v7}, LA0/w;->t(I)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    iget-wide v13, v8, LB0/k;->b:J

    .line 113
    .line 114
    invoke-interface {v10, v13, v14, v7}, LA0/w;->q(JI)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    move v14, v7

    .line 119
    goto :goto_0

    .line 120
    :cond_2
    move v14, v9

    .line 121
    :goto_0
    if-eqz v14, :cond_6

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    const-wide/16 v6, 0x0

    .line 126
    .line 127
    cmp-long v2, v3, v6

    .line 128
    .line 129
    if-nez v2, :cond_5

    .line 130
    .line 131
    iget-object v2, v0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    const/4 v4, 0x1

    .line 138
    sub-int/2addr v3, v4

    .line 139
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ln0/j;

    .line 144
    .line 145
    if-ne v3, v1, :cond_3

    .line 146
    .line 147
    move v9, v4

    .line 148
    :cond_3
    invoke-static {v9}, Ld0/m;->h(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_4

    .line 156
    .line 157
    iget-wide v2, v0, Ln0/q;->a0:J

    .line 158
    .line 159
    iput-wide v2, v0, Ln0/q;->b0:J

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    invoke-static {v2}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Ln0/j;

    .line 167
    .line 168
    iput-boolean v4, v2, Ln0/j;->U:Z

    .line 169
    .line 170
    :cond_5
    :goto_1
    sget-object v2, LB0/r;->p:LB0/k;

    .line 171
    .line 172
    move-object v15, v2

    .line 173
    goto :goto_3

    .line 174
    :cond_6
    invoke-static {v6}, LA0/b;->p(LA/j;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v2

    .line 178
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    cmp-long v4, v2, v6

    .line 184
    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    new-instance v4, LB0/k;

    .line 188
    .line 189
    const/4 v6, 0x0

    .line 190
    invoke-direct {v4, v9, v2, v3, v6}, LB0/k;-><init>(IJZ)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_7
    sget-object v4, LB0/r;->q:LB0/k;

    .line 195
    .line 196
    :goto_2
    move-object v15, v4

    .line 197
    :goto_3
    invoke-virtual {v15}, LB0/k;->a()Z

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    xor-int/lit8 v13, v16, 0x1

    .line 202
    .line 203
    iget-object v2, v0, Ln0/q;->v:Lm0/e;

    .line 204
    .line 205
    iget-wide v8, v1, Ly0/e;->r:J

    .line 206
    .line 207
    iget-wide v10, v1, Ly0/e;->s:J

    .line 208
    .line 209
    iget v3, v1, Ly0/e;->n:I

    .line 210
    .line 211
    iget v4, v0, Ln0/q;->m:I

    .line 212
    .line 213
    iget-object v6, v1, Ly0/e;->o:La0/p;

    .line 214
    .line 215
    iget v7, v1, Ly0/e;->p:I

    .line 216
    .line 217
    iget-object v1, v1, Ly0/e;->q:Ljava/lang/Object;

    .line 218
    .line 219
    move-object/from16 v17, v1

    .line 220
    .line 221
    move-object v1, v2

    .line 222
    move-object v2, v5

    .line 223
    move-object v5, v6

    .line 224
    move v6, v7

    .line 225
    move-object/from16 v7, v17

    .line 226
    .line 227
    move-object/from16 v12, p6

    .line 228
    .line 229
    invoke-virtual/range {v1 .. v13}, Lm0/e;->f(Lx0/z;IILa0/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 230
    .line 231
    .line 232
    if-nez v16, :cond_8

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    iput-object v1, v0, Ln0/q;->F:Ly0/e;

    .line 236
    .line 237
    :cond_8
    if-eqz v14, :cond_a

    .line 238
    .line 239
    iget-boolean v1, v0, Ln0/q;->O:Z

    .line 240
    .line 241
    if-nez v1, :cond_9

    .line 242
    .line 243
    new-instance v1, Lh0/S;

    .line 244
    .line 245
    invoke-direct {v1}, Lh0/S;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-wide v2, v0, Ln0/q;->a0:J

    .line 249
    .line 250
    iput-wide v2, v1, Lh0/S;->a:J

    .line 251
    .line 252
    new-instance v2, Lh0/T;

    .line 253
    .line 254
    invoke-direct {v2, v1}, Lh0/T;-><init>(Lh0/S;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2}, Ln0/q;->v(Lh0/T;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_9
    iget-object v1, v0, Ln0/q;->n:Lm3/i;

    .line 262
    .line 263
    invoke-virtual {v1, v0}, Lm3/i;->d(Lx0/h0;)V

    .line 264
    .line 265
    .line 266
    :cond_a
    :goto_4
    move-object v1, v15

    .line 267
    :goto_5
    return-object v1
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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
.end method

.method public final q(LB0/o;JJZ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    check-cast v1, Ly0/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, Ln0/q;->F:Ly0/e;

    .line 7
    .line 8
    new-instance v4, Lx0/z;

    .line 9
    .line 10
    iget-wide v2, v1, Ly0/e;->l:J

    .line 11
    .line 12
    iget-object v2, v1, Ly0/e;->t:Lf0/z;

    .line 13
    .line 14
    iget-object v2, v2, Lf0/z;->n:Landroid/net/Uri;

    .line 15
    .line 16
    move-wide/from16 v2, p4

    .line 17
    .line 18
    invoke-direct {v4, v2, v3}, Lx0/z;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Ln0/q;->t:LA0/b;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Ln0/q;->v:Lm0/e;

    .line 27
    .line 28
    iget-wide v10, v1, Ly0/e;->r:J

    .line 29
    .line 30
    iget-wide v12, v1, Ly0/e;->s:J

    .line 31
    .line 32
    iget v5, v1, Ly0/e;->n:I

    .line 33
    .line 34
    iget v6, v0, Ln0/q;->m:I

    .line 35
    .line 36
    iget-object v7, v1, Ly0/e;->o:La0/p;

    .line 37
    .line 38
    iget v8, v1, Ly0/e;->p:I

    .line 39
    .line 40
    iget-object v9, v1, Ly0/e;->q:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual/range {v3 .. v13}, Lm0/e;->c(Lx0/z;IILa0/p;ILjava/lang/Object;JJ)V

    .line 43
    .line 44
    .line 45
    if-nez p6, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Ln0/q;->C()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    iget v1, v0, Ln0/q;->P:I

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    :cond_0
    invoke-virtual {p0}, Ln0/q;->G()V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget v1, v0, Ln0/q;->P:I

    .line 61
    .line 62
    if-lez v1, :cond_2

    .line 63
    .line 64
    iget-object v1, v0, Ln0/q;->n:Lm3/i;

    .line 65
    .line 66
    invoke-virtual {v1, p0}, Lm3/i;->d(Lx0/h0;)V

    .line 67
    .line 68
    .line 69
    :cond_2
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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
.end method

.method public final r()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln0/q;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Ln0/q;->b0:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Ln0/q;->e0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Ln0/q;->A()Ln0/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Ly0/e;->s:J

    .line 22
    .line 23
    :goto_0
    return-wide v0
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

.method public final u(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ln0/q;->u:LB0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/r;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_8

    .line 8
    .line 9
    invoke-virtual {p0}, Ln0/q;->C()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {v0}, LB0/r;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Ln0/q;->o:Ln0/i;

    .line 21
    .line 22
    iget-object v3, p0, Ln0/q;->z:Ljava/util/List;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object v1, p0, Ln0/q;->F:Ly0/e;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ln0/q;->F:Ly0/e;

    .line 32
    .line 33
    iget-object v4, v2, Ln0/i;->n:Lx0/b;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, v2, Ln0/i;->q:LA0/w;

    .line 40
    .line 41
    invoke-interface {v2, p1, p2, v1, v3}, LA0/w;->i(JLy0/e;Ljava/util/List;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_0
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, LB0/r;->b()V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void

    .line 51
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_1
    const/4 v1, 0x2

    .line 56
    if-lez v0, :cond_4

    .line 57
    .line 58
    add-int/lit8 v4, v0, -0x1

    .line 59
    .line 60
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ln0/j;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ln0/i;->b(Ln0/j;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ne v4, v1, :cond_4

    .line 71
    .line 72
    add-int/lit8 v0, v0, -0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ge v0, v4, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ln0/q;->z(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    iget-object v0, v2, Ln0/i;->n:Lx0/b;

    .line 85
    .line 86
    if-nez v0, :cond_7

    .line 87
    .line 88
    iget-object v0, v2, Ln0/i;->q:LA0/w;

    .line 89
    .line 90
    invoke-interface {v0}, LA0/w;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ge v0, v1, :cond_6

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    iget-object v0, v2, Ln0/i;->q:LA0/w;

    .line 98
    .line 99
    invoke-interface {v0, p1, p2, v3}, LA0/w;->n(JLjava/util/List;)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_3

    .line 104
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    :goto_3
    iget-object p2, p0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-ge p1, p2, :cond_8

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ln0/q;->z(I)V

    .line 117
    .line 118
    .line 119
    :cond_8
    :goto_4
    return-void
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

.method public final v(Lh0/T;)Z
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, v0, Ln0/q;->e0:Z

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Ln0/q;->u:LB0/r;

    .line 10
    .line 11
    invoke-virtual {v2}, LB0/r;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, LB0/r;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    move-object v1, v0

    .line 24
    move v0, v3

    .line 25
    goto/16 :goto_36

    .line 26
    .line 27
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ln0/q;->C()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-wide v5, v0, Ln0/q;->b0:J

    .line 38
    .line 39
    iget-object v7, v0, Ln0/q;->G:[Ln0/p;

    .line 40
    .line 41
    array-length v8, v7

    .line 42
    move v9, v3

    .line 43
    :goto_0
    if-ge v9, v8, :cond_2

    .line 44
    .line 45
    aget-object v10, v7, v9

    .line 46
    .line 47
    iget-wide v11, v0, Ln0/q;->b0:J

    .line 48
    .line 49
    iput-wide v11, v10, Lx0/e0;->t:J

    .line 50
    .line 51
    add-int/2addr v9, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    move-object v14, v4

    .line 54
    goto :goto_4

    .line 55
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ln0/q;->A()Ln0/j;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-boolean v5, v4, Ln0/j;->S:Z

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    iget-wide v4, v4, Ly0/e;->s:J

    .line 64
    .line 65
    :goto_2
    move-wide v5, v4

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    iget-wide v5, v0, Ln0/q;->a0:J

    .line 68
    .line 69
    iget-wide v7, v4, Ly0/e;->r:J

    .line 70
    .line 71
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    goto :goto_2

    .line 76
    :goto_3
    iget-object v4, v0, Ln0/q;->z:Ljava/util/List;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :goto_4
    iget-object v4, v0, Ln0/q;->x:Lh0/c;

    .line 80
    .line 81
    const/4 v15, 0x0

    .line 82
    iput-object v15, v4, Lh0/c;->b:Ljava/lang/Object;

    .line 83
    .line 84
    iput-boolean v3, v4, Lh0/c;->a:Z

    .line 85
    .line 86
    iput-object v15, v4, Lh0/c;->c:Ljava/lang/Object;

    .line 87
    .line 88
    iget-boolean v7, v0, Ln0/q;->O:Z

    .line 89
    .line 90
    if-nez v7, :cond_6

    .line 91
    .line 92
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-nez v7, :cond_5

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    move/from16 v16, v3

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    :goto_5
    move/from16 v16, v1

    .line 103
    .line 104
    :goto_6
    iget-object v12, v0, Ln0/q;->o:Ln0/i;

    .line 105
    .line 106
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_7

    .line 111
    .line 112
    move-object v13, v15

    .line 113
    goto :goto_7

    .line 114
    :cond_7
    invoke-static {v14}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Ln0/j;

    .line 119
    .line 120
    move-object v13, v7

    .line 121
    :goto_7
    if-nez v13, :cond_8

    .line 122
    .line 123
    move-object/from16 v7, p1

    .line 124
    .line 125
    const/4 v11, -0x1

    .line 126
    goto :goto_8

    .line 127
    :cond_8
    iget-object v7, v12, Ln0/i;->h:La0/V;

    .line 128
    .line 129
    iget-object v8, v13, Ly0/e;->o:La0/p;

    .line 130
    .line 131
    invoke-virtual {v7, v8}, La0/V;->b(La0/p;)I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    move v11, v7

    .line 136
    move-object/from16 v7, p1

    .line 137
    .line 138
    :goto_8
    iget-wide v8, v7, Lh0/T;->a:J

    .line 139
    .line 140
    sub-long v17, v5, v8

    .line 141
    .line 142
    move/from16 v20, v11

    .line 143
    .line 144
    iget-wide v10, v12, Ln0/i;->r:J

    .line 145
    .line 146
    move-object/from16 v21, v2

    .line 147
    .line 148
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    cmp-long v7, v10, v1

    .line 154
    .line 155
    if-eqz v7, :cond_9

    .line 156
    .line 157
    sub-long/2addr v10, v8

    .line 158
    goto :goto_9

    .line 159
    :cond_9
    move-wide v10, v1

    .line 160
    :goto_9
    if-eqz v13, :cond_b

    .line 161
    .line 162
    iget-boolean v7, v12, Ln0/i;->p:Z

    .line 163
    .line 164
    if-nez v7, :cond_b

    .line 165
    .line 166
    move-object/from16 v22, v4

    .line 167
    .line 168
    iget-wide v3, v13, Ly0/e;->s:J

    .line 169
    .line 170
    iget-wide v1, v13, Ly0/e;->r:J

    .line 171
    .line 172
    sub-long/2addr v3, v1

    .line 173
    sub-long v1, v17, v3

    .line 174
    .line 175
    move-object/from16 v23, v14

    .line 176
    .line 177
    const-wide/16 v14, 0x0

    .line 178
    .line 179
    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v1

    .line 183
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    cmp-long v7, v10, v17

    .line 189
    .line 190
    if-eqz v7, :cond_a

    .line 191
    .line 192
    sub-long/2addr v10, v3

    .line 193
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v3

    .line 197
    :goto_a
    move-wide v10, v1

    .line 198
    goto :goto_b

    .line 199
    :cond_a
    move-wide v3, v10

    .line 200
    goto :goto_a

    .line 201
    :cond_b
    move-object/from16 v22, v4

    .line 202
    .line 203
    move-object/from16 v23, v14

    .line 204
    .line 205
    move-wide v3, v10

    .line 206
    move-wide/from16 v10, v17

    .line 207
    .line 208
    :goto_b
    invoke-virtual {v12, v13, v5, v6}, Ln0/i;->a(Ln0/j;J)[Ly0/m;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    iget-object v7, v12, Ln0/i;->q:LA0/w;

    .line 213
    .line 214
    move/from16 v1, v20

    .line 215
    .line 216
    const/4 v2, -0x1

    .line 217
    move-object v14, v12

    .line 218
    move-object/from16 p1, v13

    .line 219
    .line 220
    move-wide v12, v3

    .line 221
    move-object v3, v14

    .line 222
    move-object/from16 v14, v23

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    invoke-interface/range {v7 .. v15}, LA0/w;->s(JJJLjava/util/List;[Ly0/m;)V

    .line 226
    .line 227
    .line 228
    iget-object v7, v3, Ln0/i;->q:LA0/w;

    .line 229
    .line 230
    invoke-interface {v7}, LA0/w;->a()I

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    if-eq v1, v12, :cond_c

    .line 235
    .line 236
    const/4 v13, 0x1

    .line 237
    goto :goto_c

    .line 238
    :cond_c
    const/4 v13, 0x0

    .line 239
    :goto_c
    iget-object v14, v3, Ln0/i;->e:[Landroid/net/Uri;

    .line 240
    .line 241
    aget-object v15, v14, v12

    .line 242
    .line 243
    iget-object v10, v3, Ln0/i;->g:Lo0/c;

    .line 244
    .line 245
    invoke-virtual {v10, v15}, Lo0/c;->c(Landroid/net/Uri;)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-nez v7, :cond_d

    .line 250
    .line 251
    move-object/from16 v7, v22

    .line 252
    .line 253
    iput-object v15, v7, Lh0/c;->c:Ljava/lang/Object;

    .line 254
    .line 255
    iget-boolean v1, v3, Ln0/i;->s:Z

    .line 256
    .line 257
    iget-object v2, v3, Ln0/i;->o:Landroid/net/Uri;

    .line 258
    .line 259
    invoke-virtual {v15, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    and-int/2addr v1, v2

    .line 264
    iput-boolean v1, v3, Ln0/i;->s:Z

    .line 265
    .line 266
    iput-object v15, v3, Ln0/i;->o:Landroid/net/Uri;

    .line 267
    .line 268
    move-object v0, v7

    .line 269
    goto/16 :goto_32

    .line 270
    .line 271
    :cond_d
    move-object/from16 v7, v22

    .line 272
    .line 273
    const/4 v8, 0x1

    .line 274
    invoke-virtual {v10, v8, v15}, Lo0/c;->a(ZLandroid/net/Uri;)Lo0/i;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    iget-boolean v8, v11, Lo0/m;->c:Z

    .line 282
    .line 283
    iput-boolean v8, v3, Ln0/i;->p:Z

    .line 284
    .line 285
    iget-boolean v8, v11, Lo0/i;->o:Z

    .line 286
    .line 287
    move-wide/from16 v17, v5

    .line 288
    .line 289
    iget-wide v4, v11, Lo0/i;->h:J

    .line 290
    .line 291
    if-eqz v8, :cond_e

    .line 292
    .line 293
    move-object v8, v3

    .line 294
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_e
    iget-wide v8, v11, Lo0/i;->u:J

    .line 301
    .line 302
    add-long/2addr v8, v4

    .line 303
    move-object/from16 v19, v3

    .line 304
    .line 305
    iget-wide v2, v10, Lo0/c;->y:J

    .line 306
    .line 307
    sub-long v2, v8, v2

    .line 308
    .line 309
    move-object/from16 v8, v19

    .line 310
    .line 311
    :goto_d
    iput-wide v2, v8, Ln0/i;->r:J

    .line 312
    .line 313
    iget-wide v2, v10, Lo0/c;->y:J

    .line 314
    .line 315
    sub-long v2, v4, v2

    .line 316
    .line 317
    move-object v9, v7

    .line 318
    const/4 v7, 0x0

    .line 319
    move-object v4, v8

    .line 320
    move-object/from16 v5, p1

    .line 321
    .line 322
    move v6, v13

    .line 323
    move/from16 v19, v12

    .line 324
    .line 325
    move-object v12, v7

    .line 326
    move-object v7, v11

    .line 327
    move-object/from16 v22, v8

    .line 328
    .line 329
    move-object v12, v9

    .line 330
    move-wide v8, v2

    .line 331
    move-wide/from16 v24, v2

    .line 332
    .line 333
    move-object v3, v10

    .line 334
    move-object v2, v11

    .line 335
    move-wide/from16 v10, v17

    .line 336
    .line 337
    invoke-virtual/range {v4 .. v11}, Ln0/i;->c(Ln0/j;ZLo0/i;JJ)Landroid/util/Pair;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v5, Ljava/lang/Long;

    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v5

    .line 349
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v4, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    iget-wide v7, v2, Lo0/i;->k:J

    .line 358
    .line 359
    cmp-long v7, v5, v7

    .line 360
    .line 361
    if-gez v7, :cond_10

    .line 362
    .line 363
    move-object/from16 v10, p1

    .line 364
    .line 365
    if-eqz v10, :cond_f

    .line 366
    .line 367
    if-eqz v13, :cond_f

    .line 368
    .line 369
    aget-object v15, v14, v1

    .line 370
    .line 371
    const/4 v2, 0x1

    .line 372
    invoke-virtual {v3, v2, v15}, Lo0/c;->a(ZLandroid/net/Uri;)Lo0/i;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    iget-wide v4, v3, Lo0/c;->y:J

    .line 380
    .line 381
    iget-wide v6, v13, Lo0/i;->h:J

    .line 382
    .line 383
    sub-long v24, v6, v4

    .line 384
    .line 385
    const/4 v6, 0x0

    .line 386
    move-object/from16 v4, v22

    .line 387
    .line 388
    move-object v5, v10

    .line 389
    move-object v7, v13

    .line 390
    move-wide/from16 v8, v24

    .line 391
    .line 392
    move-object v2, v10

    .line 393
    move-wide/from16 v10, v17

    .line 394
    .line 395
    invoke-virtual/range {v4 .. v11}, Ln0/i;->c(Ln0/j;ZLo0/i;JJ)Landroid/util/Pair;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v5, Ljava/lang/Long;

    .line 402
    .line 403
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 404
    .line 405
    .line 406
    move-result-wide v5

    .line 407
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v4, Ljava/lang/Integer;

    .line 410
    .line 411
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    move v11, v1

    .line 416
    move-object v7, v2

    .line 417
    move-object v2, v13

    .line 418
    goto :goto_f

    .line 419
    :cond_f
    move-object v7, v10

    .line 420
    goto :goto_e

    .line 421
    :cond_10
    move-object/from16 v7, p1

    .line 422
    .line 423
    :goto_e
    move/from16 v11, v19

    .line 424
    .line 425
    :goto_f
    if-eq v11, v1, :cond_11

    .line 426
    .line 427
    const/4 v8, -0x1

    .line 428
    if-eq v1, v8, :cond_11

    .line 429
    .line 430
    aget-object v1, v14, v1

    .line 431
    .line 432
    iget-object v3, v3, Lo0/c;->o:Ljava/util/HashMap;

    .line 433
    .line 434
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    check-cast v1, Lo0/b;

    .line 439
    .line 440
    if-eqz v1, :cond_11

    .line 441
    .line 442
    const/4 v3, 0x0

    .line 443
    iput-boolean v3, v1, Lo0/b;->v:Z

    .line 444
    .line 445
    :cond_11
    iget-wide v8, v2, Lo0/i;->k:J

    .line 446
    .line 447
    cmp-long v1, v5, v8

    .line 448
    .line 449
    if-gez v1, :cond_12

    .line 450
    .line 451
    new-instance v1, Lx0/b;

    .line 452
    .line 453
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 454
    .line 455
    .line 456
    move-object/from16 v3, v22

    .line 457
    .line 458
    iput-object v1, v3, Ln0/i;->n:Lx0/b;

    .line 459
    .line 460
    :goto_10
    move-object v0, v12

    .line 461
    goto/16 :goto_32

    .line 462
    .line 463
    :cond_12
    move-object/from16 v3, v22

    .line 464
    .line 465
    sub-long v13, v5, v8

    .line 466
    .line 467
    long-to-int v1, v13

    .line 468
    iget-object v10, v2, Lo0/i;->r:Lm2/I;

    .line 469
    .line 470
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 471
    .line 472
    .line 473
    move-result v13

    .line 474
    const-wide/16 v17, 0x1

    .line 475
    .line 476
    iget-object v14, v2, Lo0/i;->s:Lm2/I;

    .line 477
    .line 478
    if-ne v1, v13, :cond_15

    .line 479
    .line 480
    const/4 v13, -0x1

    .line 481
    if-eq v4, v13, :cond_13

    .line 482
    .line 483
    goto :goto_11

    .line 484
    :cond_13
    const/4 v4, 0x0

    .line 485
    :goto_11
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-ge v4, v1, :cond_14

    .line 490
    .line 491
    new-instance v1, Ln0/h;

    .line 492
    .line 493
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v13

    .line 497
    check-cast v13, Lo0/g;

    .line 498
    .line 499
    invoke-direct {v1, v13, v5, v6, v4}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 500
    .line 501
    .line 502
    goto :goto_12

    .line 503
    :cond_14
    const/4 v1, 0x0

    .line 504
    :goto_12
    move-object v0, v1

    .line 505
    goto :goto_13

    .line 506
    :cond_15
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    check-cast v13, Lo0/f;

    .line 511
    .line 512
    const/4 v0, -0x1

    .line 513
    if-ne v4, v0, :cond_16

    .line 514
    .line 515
    new-instance v1, Ln0/h;

    .line 516
    .line 517
    invoke-direct {v1, v13, v5, v6, v0}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 518
    .line 519
    .line 520
    goto :goto_12

    .line 521
    :cond_16
    iget-object v0, v13, Lo0/f;->x:Lm2/I;

    .line 522
    .line 523
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-ge v4, v0, :cond_17

    .line 528
    .line 529
    new-instance v0, Ln0/h;

    .line 530
    .line 531
    iget-object v1, v13, Lo0/f;->x:Lm2/I;

    .line 532
    .line 533
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    check-cast v1, Lo0/g;

    .line 538
    .line 539
    invoke-direct {v0, v1, v5, v6, v4}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 540
    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_17
    const/4 v0, 0x1

    .line 544
    add-int/2addr v1, v0

    .line 545
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-ge v1, v0, :cond_18

    .line 550
    .line 551
    new-instance v0, Ln0/h;

    .line 552
    .line 553
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    check-cast v1, Lo0/g;

    .line 558
    .line 559
    add-long v5, v5, v17

    .line 560
    .line 561
    const/4 v4, -0x1

    .line 562
    invoke-direct {v0, v1, v5, v6, v4}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 563
    .line 564
    .line 565
    goto :goto_13

    .line 566
    :cond_18
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-nez v0, :cond_19

    .line 571
    .line 572
    new-instance v0, Ln0/h;

    .line 573
    .line 574
    const/4 v1, 0x0

    .line 575
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    check-cast v4, Lo0/g;

    .line 580
    .line 581
    add-long v5, v5, v17

    .line 582
    .line 583
    invoke-direct {v0, v4, v5, v6, v1}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 584
    .line 585
    .line 586
    goto :goto_13

    .line 587
    :cond_19
    const/4 v0, 0x0

    .line 588
    :goto_13
    if-nez v0, :cond_1d

    .line 589
    .line 590
    iget-boolean v0, v2, Lo0/i;->o:Z

    .line 591
    .line 592
    if-nez v0, :cond_1a

    .line 593
    .line 594
    iput-object v15, v12, Lh0/c;->c:Ljava/lang/Object;

    .line 595
    .line 596
    iget-boolean v0, v3, Ln0/i;->s:Z

    .line 597
    .line 598
    iget-object v1, v3, Ln0/i;->o:Landroid/net/Uri;

    .line 599
    .line 600
    invoke-virtual {v15, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    and-int/2addr v0, v1

    .line 605
    iput-boolean v0, v3, Ln0/i;->s:Z

    .line 606
    .line 607
    iput-object v15, v3, Ln0/i;->o:Landroid/net/Uri;

    .line 608
    .line 609
    goto/16 :goto_10

    .line 610
    .line 611
    :cond_1a
    if-nez v16, :cond_1b

    .line 612
    .line 613
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-eqz v0, :cond_1c

    .line 618
    .line 619
    :cond_1b
    const/4 v0, 0x1

    .line 620
    goto :goto_14

    .line 621
    :cond_1c
    new-instance v0, Ln0/h;

    .line 622
    .line 623
    invoke-static {v10}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    check-cast v1, Lo0/g;

    .line 628
    .line 629
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    int-to-long v4, v4

    .line 634
    add-long/2addr v8, v4

    .line 635
    sub-long v8, v8, v17

    .line 636
    .line 637
    const/4 v4, -0x1

    .line 638
    invoke-direct {v0, v1, v8, v9, v4}, Ln0/h;-><init>(Lo0/g;JI)V

    .line 639
    .line 640
    .line 641
    :cond_1d
    const/4 v1, 0x0

    .line 642
    goto :goto_15

    .line 643
    :goto_14
    iput-boolean v0, v12, Lh0/c;->a:Z

    .line 644
    .line 645
    goto/16 :goto_10

    .line 646
    .line 647
    :goto_15
    iput-boolean v1, v3, Ln0/i;->s:Z

    .line 648
    .line 649
    const/4 v1, 0x0

    .line 650
    iput-object v1, v3, Ln0/i;->o:Landroid/net/Uri;

    .line 651
    .line 652
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 653
    .line 654
    .line 655
    iget-object v1, v0, Ln0/h;->a:Lo0/g;

    .line 656
    .line 657
    iget-object v4, v1, Lo0/g;->m:Lo0/f;

    .line 658
    .line 659
    iget-object v5, v2, Lo0/m;->a:Ljava/lang/String;

    .line 660
    .line 661
    if-eqz v4, :cond_1f

    .line 662
    .line 663
    iget-object v4, v4, Lo0/g;->r:Ljava/lang/String;

    .line 664
    .line 665
    if-nez v4, :cond_1e

    .line 666
    .line 667
    goto :goto_17

    .line 668
    :cond_1e
    invoke-static {v5, v4}, Ld0/m;->w(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    :goto_16
    const/4 v6, 0x1

    .line 673
    goto :goto_18

    .line 674
    :cond_1f
    :goto_17
    const/4 v4, 0x0

    .line 675
    goto :goto_16

    .line 676
    :goto_18
    invoke-virtual {v3, v4, v11, v6}, Ln0/i;->d(Landroid/net/Uri;IZ)Ln0/e;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    iput-object v8, v12, Lh0/c;->b:Ljava/lang/Object;

    .line 681
    .line 682
    if-eqz v8, :cond_20

    .line 683
    .line 684
    :goto_19
    goto/16 :goto_10

    .line 685
    .line 686
    :cond_20
    iget-object v6, v1, Lo0/g;->r:Ljava/lang/String;

    .line 687
    .line 688
    if-nez v6, :cond_21

    .line 689
    .line 690
    const/4 v6, 0x0

    .line 691
    :goto_1a
    const/4 v8, 0x0

    .line 692
    goto :goto_1b

    .line 693
    :cond_21
    invoke-static {v5, v6}, Ld0/m;->w(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    goto :goto_1a

    .line 698
    :goto_1b
    invoke-virtual {v3, v6, v11, v8}, Ln0/i;->d(Landroid/net/Uri;IZ)Ln0/e;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    iput-object v9, v12, Lh0/c;->b:Ljava/lang/Object;

    .line 703
    .line 704
    if-eqz v9, :cond_22

    .line 705
    .line 706
    goto :goto_19

    .line 707
    :cond_22
    iget-wide v8, v1, Lo0/g;->p:J

    .line 708
    .line 709
    if-nez v7, :cond_23

    .line 710
    .line 711
    sget-object v10, Ln0/j;->W:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 712
    .line 713
    :goto_1c
    move-wide/from16 v16, v8

    .line 714
    .line 715
    move-object/from16 v22, v12

    .line 716
    .line 717
    const/16 v55, 0x0

    .line 718
    .line 719
    goto :goto_21

    .line 720
    :cond_23
    iget-object v10, v7, Ln0/j;->x:Landroid/net/Uri;

    .line 721
    .line 722
    invoke-virtual {v15, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    move-result v10

    .line 726
    if-eqz v10, :cond_24

    .line 727
    .line 728
    iget-boolean v10, v7, Ln0/j;->S:Z

    .line 729
    .line 730
    if-eqz v10, :cond_24

    .line 731
    .line 732
    goto :goto_1c

    .line 733
    :cond_24
    add-long v13, v24, v8

    .line 734
    .line 735
    instance-of v10, v1, Lo0/d;

    .line 736
    .line 737
    move-object/from16 v22, v12

    .line 738
    .line 739
    iget-boolean v12, v2, Lo0/m;->c:Z

    .line 740
    .line 741
    if-eqz v10, :cond_27

    .line 742
    .line 743
    move-object v10, v1

    .line 744
    check-cast v10, Lo0/d;

    .line 745
    .line 746
    iget-boolean v10, v10, Lo0/d;->w:Z

    .line 747
    .line 748
    if-nez v10, :cond_26

    .line 749
    .line 750
    iget v10, v0, Ln0/h;->c:I

    .line 751
    .line 752
    if-nez v10, :cond_25

    .line 753
    .line 754
    if-eqz v12, :cond_25

    .line 755
    .line 756
    goto :goto_1d

    .line 757
    :cond_25
    const/4 v10, 0x0

    .line 758
    goto :goto_1e

    .line 759
    :cond_26
    :goto_1d
    const/4 v10, 0x1

    .line 760
    :goto_1e
    move v12, v10

    .line 761
    :cond_27
    move-wide/from16 v16, v8

    .line 762
    .line 763
    if-eqz v12, :cond_29

    .line 764
    .line 765
    iget-wide v8, v7, Ly0/e;->s:J

    .line 766
    .line 767
    cmp-long v8, v13, v8

    .line 768
    .line 769
    if-gez v8, :cond_28

    .line 770
    .line 771
    goto :goto_1f

    .line 772
    :cond_28
    const/4 v8, 0x0

    .line 773
    goto :goto_20

    .line 774
    :cond_29
    :goto_1f
    const/4 v8, 0x1

    .line 775
    :goto_20
    move/from16 v55, v8

    .line 776
    .line 777
    :goto_21
    iget-boolean v8, v0, Ln0/h;->d:Z

    .line 778
    .line 779
    if-eqz v55, :cond_2a

    .line 780
    .line 781
    if-eqz v8, :cond_2a

    .line 782
    .line 783
    move-object/from16 v0, v22

    .line 784
    .line 785
    goto/16 :goto_32

    .line 786
    .line 787
    :cond_2a
    iget-object v9, v3, Ln0/i;->f:[La0/p;

    .line 788
    .line 789
    aget-object v30, v9, v11

    .line 790
    .line 791
    iget-object v9, v3, Ln0/i;->q:LA0/w;

    .line 792
    .line 793
    invoke-interface {v9}, LA0/w;->e()I

    .line 794
    .line 795
    .line 796
    move-result v37

    .line 797
    iget-object v9, v3, Ln0/i;->q:LA0/w;

    .line 798
    .line 799
    invoke-interface {v9}, LA0/w;->l()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v38

    .line 803
    iget-boolean v9, v3, Ln0/i;->l:Z

    .line 804
    .line 805
    iget-object v10, v3, Ln0/i;->j:Lm3/i;

    .line 806
    .line 807
    if-nez v6, :cond_2b

    .line 808
    .line 809
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    const/4 v6, 0x0

    .line 813
    goto :goto_22

    .line 814
    :cond_2b
    iget-object v11, v10, Lm3/i;->m:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v11, Ln0/d;

    .line 817
    .line 818
    invoke-virtual {v11, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    check-cast v6, [B

    .line 823
    .line 824
    :goto_22
    if-nez v4, :cond_2c

    .line 825
    .line 826
    const/4 v4, 0x0

    .line 827
    goto :goto_23

    .line 828
    :cond_2c
    iget-object v10, v10, Lm3/i;->m:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v10, Ln0/d;

    .line 831
    .line 832
    invoke-virtual {v10, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    check-cast v4, [B

    .line 837
    .line 838
    :goto_23
    sget-object v10, Ln0/j;->W:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 839
    .line 840
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 841
    .line 842
    .line 843
    move-result-object v43

    .line 844
    iget-object v10, v1, Lo0/g;->l:Ljava/lang/String;

    .line 845
    .line 846
    invoke-static {v5, v10}, Ld0/m;->w(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 847
    .line 848
    .line 849
    move-result-object v10

    .line 850
    if-eqz v8, :cond_2d

    .line 851
    .line 852
    const/16 v11, 0x8

    .line 853
    .line 854
    move/from16 v49, v11

    .line 855
    .line 856
    goto :goto_24

    .line 857
    :cond_2d
    const/16 v49, 0x0

    .line 858
    .line 859
    :goto_24
    const-string v11, "The uri must be set."

    .line 860
    .line 861
    invoke-static {v10, v11}, Ld0/m;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    new-instance v29, Lf0/l;

    .line 865
    .line 866
    const/16 v42, 0x0

    .line 867
    .line 868
    const/16 v48, 0x0

    .line 869
    .line 870
    const/16 v41, 0x1

    .line 871
    .line 872
    iget-wide v12, v1, Lo0/g;->t:J

    .line 873
    .line 874
    move v14, v8

    .line 875
    move/from16 v18, v9

    .line 876
    .line 877
    iget-wide v8, v1, Lo0/g;->u:J

    .line 878
    .line 879
    move-object/from16 v39, v29

    .line 880
    .line 881
    move-object/from16 v40, v10

    .line 882
    .line 883
    move-wide/from16 v44, v12

    .line 884
    .line 885
    move-wide/from16 v46, v8

    .line 886
    .line 887
    invoke-direct/range {v39 .. v49}, Lf0/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 888
    .line 889
    .line 890
    if-eqz v6, :cond_2e

    .line 891
    .line 892
    const/16 v31, 0x1

    .line 893
    .line 894
    goto :goto_25

    .line 895
    :cond_2e
    const/16 v31, 0x0

    .line 896
    .line 897
    :goto_25
    if-eqz v31, :cond_2f

    .line 898
    .line 899
    iget-object v8, v1, Lo0/g;->s:Ljava/lang/String;

    .line 900
    .line 901
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    invoke-static {v8}, Ln0/j;->d(Ljava/lang/String;)[B

    .line 905
    .line 906
    .line 907
    move-result-object v8

    .line 908
    goto :goto_26

    .line 909
    :cond_2f
    const/4 v8, 0x0

    .line 910
    :goto_26
    iget-object v9, v3, Ln0/i;->b:Lf0/h;

    .line 911
    .line 912
    if-eqz v6, :cond_30

    .line 913
    .line 914
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    new-instance v10, Ln0/a;

    .line 918
    .line 919
    invoke-direct {v10, v9, v6, v8}, Ln0/a;-><init>(Lf0/h;[B[B)V

    .line 920
    .line 921
    .line 922
    move-object/from16 v28, v10

    .line 923
    .line 924
    goto :goto_27

    .line 925
    :cond_30
    move-object/from16 v28, v9

    .line 926
    .line 927
    :goto_27
    iget-object v6, v1, Lo0/g;->m:Lo0/f;

    .line 928
    .line 929
    if-eqz v6, :cond_34

    .line 930
    .line 931
    if-eqz v4, :cond_31

    .line 932
    .line 933
    const/4 v8, 0x1

    .line 934
    goto :goto_28

    .line 935
    :cond_31
    const/4 v8, 0x0

    .line 936
    :goto_28
    if-eqz v8, :cond_32

    .line 937
    .line 938
    iget-object v10, v6, Lo0/g;->s:Ljava/lang/String;

    .line 939
    .line 940
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    invoke-static {v10}, Ln0/j;->d(Ljava/lang/String;)[B

    .line 944
    .line 945
    .line 946
    move-result-object v10

    .line 947
    goto :goto_29

    .line 948
    :cond_32
    const/4 v10, 0x0

    .line 949
    :goto_29
    iget-object v12, v6, Lo0/g;->l:Ljava/lang/String;

    .line 950
    .line 951
    invoke-static {v5, v12}, Ld0/m;->w(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 952
    .line 953
    .line 954
    move-result-object v5

    .line 955
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 956
    .line 957
    .line 958
    move-result-object v43

    .line 959
    invoke-static {v5, v11}, Ld0/m;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    new-instance v11, Lf0/l;

    .line 963
    .line 964
    iget-wide v12, v6, Lo0/g;->t:J

    .line 965
    .line 966
    const/16 v49, 0x0

    .line 967
    .line 968
    const/16 v41, 0x1

    .line 969
    .line 970
    const/16 v42, 0x0

    .line 971
    .line 972
    move/from16 p1, v14

    .line 973
    .line 974
    move-object/from16 v19, v15

    .line 975
    .line 976
    iget-wide v14, v6, Lo0/g;->u:J

    .line 977
    .line 978
    const/16 v48, 0x0

    .line 979
    .line 980
    move-object/from16 v39, v11

    .line 981
    .line 982
    move-object/from16 v40, v5

    .line 983
    .line 984
    move-wide/from16 v44, v12

    .line 985
    .line 986
    move-wide/from16 v46, v14

    .line 987
    .line 988
    invoke-direct/range {v39 .. v49}, Lf0/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 989
    .line 990
    .line 991
    if-eqz v4, :cond_33

    .line 992
    .line 993
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    new-instance v5, Ln0/a;

    .line 997
    .line 998
    invoke-direct {v5, v9, v4, v10}, Ln0/a;-><init>(Lf0/h;[B[B)V

    .line 999
    .line 1000
    .line 1001
    move-object v15, v5

    .line 1002
    goto :goto_2a

    .line 1003
    :cond_33
    move-object v15, v9

    .line 1004
    :goto_2a
    move/from16 v34, v8

    .line 1005
    .line 1006
    move-object/from16 v32, v15

    .line 1007
    .line 1008
    goto :goto_2b

    .line 1009
    :cond_34
    move/from16 p1, v14

    .line 1010
    .line 1011
    move-object/from16 v19, v15

    .line 1012
    .line 1013
    const/4 v11, 0x0

    .line 1014
    const/16 v32, 0x0

    .line 1015
    .line 1016
    const/16 v34, 0x0

    .line 1017
    .line 1018
    :goto_2b
    add-long v39, v24, v16

    .line 1019
    .line 1020
    iget-wide v4, v1, Lo0/g;->n:J

    .line 1021
    .line 1022
    add-long v41, v39, v4

    .line 1023
    .line 1024
    iget v2, v2, Lo0/i;->j:I

    .line 1025
    .line 1026
    iget v4, v1, Lo0/g;->o:I

    .line 1027
    .line 1028
    add-int/2addr v2, v4

    .line 1029
    if-eqz v7, :cond_39

    .line 1030
    .line 1031
    iget-object v4, v7, Ln0/j;->B:Lf0/l;

    .line 1032
    .line 1033
    if-eq v11, v4, :cond_36

    .line 1034
    .line 1035
    if-eqz v11, :cond_35

    .line 1036
    .line 1037
    if-eqz v4, :cond_35

    .line 1038
    .line 1039
    iget-object v5, v11, Lf0/l;->a:Landroid/net/Uri;

    .line 1040
    .line 1041
    iget-object v6, v4, Lf0/l;->a:Landroid/net/Uri;

    .line 1042
    .line 1043
    invoke-virtual {v5, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v5

    .line 1047
    if-eqz v5, :cond_35

    .line 1048
    .line 1049
    iget-wide v5, v11, Lf0/l;->e:J

    .line 1050
    .line 1051
    iget-wide v8, v4, Lf0/l;->e:J

    .line 1052
    .line 1053
    cmp-long v4, v5, v8

    .line 1054
    .line 1055
    if-nez v4, :cond_35

    .line 1056
    .line 1057
    goto :goto_2c

    .line 1058
    :cond_35
    const/4 v4, 0x0

    .line 1059
    goto :goto_2d

    .line 1060
    :cond_36
    :goto_2c
    const/4 v4, 0x1

    .line 1061
    :goto_2d
    iget-object v5, v7, Ln0/j;->x:Landroid/net/Uri;

    .line 1062
    .line 1063
    move-object/from16 v15, v19

    .line 1064
    .line 1065
    invoke-virtual {v15, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v5

    .line 1069
    if-eqz v5, :cond_37

    .line 1070
    .line 1071
    iget-boolean v5, v7, Ln0/j;->S:Z

    .line 1072
    .line 1073
    if-eqz v5, :cond_37

    .line 1074
    .line 1075
    const/4 v5, 0x1

    .line 1076
    goto :goto_2e

    .line 1077
    :cond_37
    const/4 v5, 0x0

    .line 1078
    :goto_2e
    if-eqz v4, :cond_38

    .line 1079
    .line 1080
    if-eqz v5, :cond_38

    .line 1081
    .line 1082
    iget-boolean v4, v7, Ln0/j;->U:Z

    .line 1083
    .line 1084
    if-nez v4, :cond_38

    .line 1085
    .line 1086
    iget v4, v7, Ln0/j;->w:I

    .line 1087
    .line 1088
    if-ne v4, v2, :cond_38

    .line 1089
    .line 1090
    iget-object v4, v7, Ln0/j;->N:Ln0/b;

    .line 1091
    .line 1092
    goto :goto_2f

    .line 1093
    :cond_38
    const/4 v4, 0x0

    .line 1094
    :goto_2f
    iget-object v5, v7, Ln0/j;->J:LT0/h;

    .line 1095
    .line 1096
    iget-object v6, v7, Ln0/j;->K:Ld0/p;

    .line 1097
    .line 1098
    move-object/from16 v52, v4

    .line 1099
    .line 1100
    move-object/from16 v53, v5

    .line 1101
    .line 1102
    :goto_30
    move-object/from16 v54, v6

    .line 1103
    .line 1104
    goto :goto_31

    .line 1105
    :cond_39
    move-object/from16 v15, v19

    .line 1106
    .line 1107
    new-instance v4, LT0/h;

    .line 1108
    .line 1109
    const/4 v5, 0x0

    .line 1110
    invoke-direct {v4, v5}, LT0/h;-><init>(LB0/l;)V

    .line 1111
    .line 1112
    .line 1113
    new-instance v6, Ld0/p;

    .line 1114
    .line 1115
    const/16 v7, 0xa

    .line 1116
    .line 1117
    invoke-direct {v6, v7}, Ld0/p;-><init>(I)V

    .line 1118
    .line 1119
    .line 1120
    move-object/from16 v53, v4

    .line 1121
    .line 1122
    move-object/from16 v52, v5

    .line 1123
    .line 1124
    goto :goto_30

    .line 1125
    :goto_31
    new-instance v4, Ln0/j;

    .line 1126
    .line 1127
    const/4 v5, 0x1

    .line 1128
    xor-int/lit8 v46, p1, 0x1

    .line 1129
    .line 1130
    iget-object v5, v3, Ln0/i;->d:Lm3/i;

    .line 1131
    .line 1132
    iget-object v5, v5, Lm3/i;->m:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v5, Landroid/util/SparseArray;

    .line 1135
    .line 1136
    invoke-virtual {v5, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v6

    .line 1140
    check-cast v6, Ld0/u;

    .line 1141
    .line 1142
    if-nez v6, :cond_3a

    .line 1143
    .line 1144
    new-instance v6, Ld0/u;

    .line 1145
    .line 1146
    const-wide v7, 0x7ffffffffffffffeL

    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    invoke-direct {v6, v7, v8}, Ld0/u;-><init>(J)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v5, v2, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_3a
    move-object/from16 v50, v6

    .line 1158
    .line 1159
    iget v5, v0, Ln0/h;->c:I

    .line 1160
    .line 1161
    move/from16 v45, v5

    .line 1162
    .line 1163
    iget-boolean v5, v1, Lo0/g;->v:Z

    .line 1164
    .line 1165
    move/from16 v48, v5

    .line 1166
    .line 1167
    iget-object v5, v3, Ln0/i;->a:Ln0/c;

    .line 1168
    .line 1169
    move-object/from16 v27, v5

    .line 1170
    .line 1171
    iget-object v5, v3, Ln0/i;->i:Ljava/util/List;

    .line 1172
    .line 1173
    move-object/from16 v36, v5

    .line 1174
    .line 1175
    iget-wide v5, v0, Ln0/h;->b:J

    .line 1176
    .line 1177
    move-wide/from16 v43, v5

    .line 1178
    .line 1179
    iget-object v0, v1, Lo0/g;->q:La0/l;

    .line 1180
    .line 1181
    move-object/from16 v51, v0

    .line 1182
    .line 1183
    iget-object v0, v3, Ln0/i;->k:Li0/j;

    .line 1184
    .line 1185
    move-object/from16 v56, v0

    .line 1186
    .line 1187
    move-object/from16 v26, v4

    .line 1188
    .line 1189
    move-object/from16 v33, v11

    .line 1190
    .line 1191
    move-object/from16 v35, v15

    .line 1192
    .line 1193
    move/from16 v47, v2

    .line 1194
    .line 1195
    move/from16 v49, v18

    .line 1196
    .line 1197
    invoke-direct/range {v26 .. v56}, Ln0/j;-><init>(Ln0/c;Lf0/h;Lf0/l;La0/p;ZLf0/h;Lf0/l;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLd0/u;La0/l;Ln0/b;LT0/h;Ld0/p;ZLi0/j;)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v0, v22

    .line 1201
    .line 1202
    iput-object v4, v0, Lh0/c;->b:Ljava/lang/Object;

    .line 1203
    .line 1204
    :goto_32
    iget-boolean v1, v0, Lh0/c;->a:Z

    .line 1205
    .line 1206
    iget-object v2, v0, Lh0/c;->b:Ljava/lang/Object;

    .line 1207
    .line 1208
    check-cast v2, Ly0/e;

    .line 1209
    .line 1210
    iget-object v0, v0, Lh0/c;->c:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v0, Landroid/net/Uri;

    .line 1213
    .line 1214
    if-eqz v1, :cond_3b

    .line 1215
    .line 1216
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v1, p0

    .line 1222
    .line 1223
    iput-wide v3, v1, Ln0/q;->b0:J

    .line 1224
    .line 1225
    const/4 v0, 0x1

    .line 1226
    iput-boolean v0, v1, Ln0/q;->e0:Z

    .line 1227
    .line 1228
    return v0

    .line 1229
    :cond_3b
    move-object/from16 v1, p0

    .line 1230
    .line 1231
    if-nez v2, :cond_3d

    .line 1232
    .line 1233
    if-eqz v0, :cond_3c

    .line 1234
    .line 1235
    iget-object v2, v1, Ln0/q;->n:Lm3/i;

    .line 1236
    .line 1237
    iget-object v2, v2, Lm3/i;->m:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v2, Ln0/k;

    .line 1240
    .line 1241
    iget-object v2, v2, Ln0/k;->m:Lo0/c;

    .line 1242
    .line 1243
    iget-object v2, v2, Lo0/c;->o:Ljava/util/HashMap;

    .line 1244
    .line 1245
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    check-cast v0, Lo0/b;

    .line 1250
    .line 1251
    const/4 v2, 0x1

    .line 1252
    invoke-virtual {v0, v2}, Lo0/b;->c(Z)V

    .line 1253
    .line 1254
    .line 1255
    :cond_3c
    const/4 v0, 0x0

    .line 1256
    return v0

    .line 1257
    :cond_3d
    instance-of v0, v2, Ln0/j;

    .line 1258
    .line 1259
    if-eqz v0, :cond_40

    .line 1260
    .line 1261
    move-object v0, v2

    .line 1262
    check-cast v0, Ln0/j;

    .line 1263
    .line 1264
    iput-object v0, v1, Ln0/q;->i0:Ln0/j;

    .line 1265
    .line 1266
    iget-object v3, v0, Ly0/e;->o:La0/p;

    .line 1267
    .line 1268
    iput-object v3, v1, Ln0/q;->Q:La0/p;

    .line 1269
    .line 1270
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    iput-wide v3, v1, Ln0/q;->b0:J

    .line 1276
    .line 1277
    iget-object v3, v1, Ln0/q;->y:Ljava/util/ArrayList;

    .line 1278
    .line 1279
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    invoke-static {}, Lm2/I;->n()Lm2/F;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v3

    .line 1286
    iget-object v4, v1, Ln0/q;->G:[Ln0/p;

    .line 1287
    .line 1288
    array-length v5, v4

    .line 1289
    const/4 v6, 0x0

    .line 1290
    :goto_33
    if-ge v6, v5, :cond_3e

    .line 1291
    .line 1292
    aget-object v7, v4, v6

    .line 1293
    .line 1294
    iget v8, v7, Lx0/e0;->q:I

    .line 1295
    .line 1296
    iget v7, v7, Lx0/e0;->p:I

    .line 1297
    .line 1298
    add-int/2addr v8, v7

    .line 1299
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v7

    .line 1303
    invoke-virtual {v3, v7}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 1304
    .line 1305
    .line 1306
    const/4 v7, 0x1

    .line 1307
    add-int/2addr v6, v7

    .line 1308
    goto :goto_33

    .line 1309
    :cond_3e
    invoke-virtual {v3}, Lm2/F;->g()Lm2/b0;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v3

    .line 1313
    iput-object v1, v0, Ln0/j;->O:Ln0/q;

    .line 1314
    .line 1315
    iput-object v3, v0, Ln0/j;->T:Lm2/b0;

    .line 1316
    .line 1317
    iget-object v3, v1, Ln0/q;->G:[Ln0/p;

    .line 1318
    .line 1319
    array-length v4, v3

    .line 1320
    const/4 v5, 0x0

    .line 1321
    :goto_34
    if-ge v5, v4, :cond_40

    .line 1322
    .line 1323
    aget-object v6, v3, v5

    .line 1324
    .line 1325
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    iget v7, v0, Ln0/j;->v:I

    .line 1329
    .line 1330
    int-to-long v7, v7

    .line 1331
    iput-wide v7, v6, Lx0/e0;->C:J

    .line 1332
    .line 1333
    iget-boolean v7, v0, Ln0/j;->y:Z

    .line 1334
    .line 1335
    if-eqz v7, :cond_3f

    .line 1336
    .line 1337
    const/4 v7, 0x1

    .line 1338
    iput-boolean v7, v6, Lx0/e0;->G:Z

    .line 1339
    .line 1340
    goto :goto_35

    .line 1341
    :cond_3f
    const/4 v7, 0x1

    .line 1342
    :goto_35
    add-int/2addr v5, v7

    .line 1343
    goto :goto_34

    .line 1344
    :cond_40
    iput-object v2, v1, Ln0/q;->F:Ly0/e;

    .line 1345
    .line 1346
    iget-object v0, v1, Ln0/q;->t:LA0/b;

    .line 1347
    .line 1348
    iget v3, v2, Ly0/e;->n:I

    .line 1349
    .line 1350
    invoke-virtual {v0, v3}, LA0/b;->o(I)I

    .line 1351
    .line 1352
    .line 1353
    move-result v0

    .line 1354
    move-object/from16 v3, v21

    .line 1355
    .line 1356
    invoke-virtual {v3, v2, v1, v0}, LB0/r;->f(LB0/o;LB0/m;I)J

    .line 1357
    .line 1358
    .line 1359
    move-result-wide v8

    .line 1360
    new-instance v11, Lx0/z;

    .line 1361
    .line 1362
    iget-wide v5, v2, Ly0/e;->l:J

    .line 1363
    .line 1364
    iget-object v7, v2, Ly0/e;->m:Lf0/l;

    .line 1365
    .line 1366
    move-object v4, v11

    .line 1367
    invoke-direct/range {v4 .. v9}, Lx0/z;-><init>(JLf0/l;J)V

    .line 1368
    .line 1369
    .line 1370
    iget-object v10, v1, Ln0/q;->v:Lm0/e;

    .line 1371
    .line 1372
    iget v15, v2, Ly0/e;->p:I

    .line 1373
    .line 1374
    iget-object v0, v2, Ly0/e;->q:Ljava/lang/Object;

    .line 1375
    .line 1376
    iget v12, v2, Ly0/e;->n:I

    .line 1377
    .line 1378
    iget v13, v1, Ln0/q;->m:I

    .line 1379
    .line 1380
    iget-object v14, v2, Ly0/e;->o:La0/p;

    .line 1381
    .line 1382
    iget-wide v3, v2, Ly0/e;->r:J

    .line 1383
    .line 1384
    iget-wide v5, v2, Ly0/e;->s:J

    .line 1385
    .line 1386
    move-object/from16 v16, v0

    .line 1387
    .line 1388
    move-wide/from16 v17, v3

    .line 1389
    .line 1390
    move-wide/from16 v19, v5

    .line 1391
    .line 1392
    invoke-virtual/range {v10 .. v20}, Lm0/e;->h(Lx0/z;IILa0/p;ILjava/lang/Object;JJ)V

    .line 1393
    .line 1394
    .line 1395
    const/4 v0, 0x1

    .line 1396
    :goto_36
    return v0
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
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
.end method

.method public final x([La0/V;)Lx0/q0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, La0/V;->a:I

    .line 9
    .line 10
    new-array v3, v3, [La0/p;

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    iget v5, v2, La0/V;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, La0/V;->d:[La0/p;

    .line 18
    .line 19
    aget-object v5, v5, v4

    .line 20
    .line 21
    iget-object v6, p0, Ln0/q;->r:Lm0/i;

    .line 22
    .line 23
    invoke-interface {v6, v5}, Lm0/i;->b(La0/p;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, La0/p;->a()La0/o;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput v6, v5, La0/o;->K:I

    .line 32
    .line 33
    new-instance v6, La0/p;

    .line 34
    .line 35
    invoke-direct {v6, v5}, La0/p;-><init>(La0/o;)V

    .line 36
    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v4, La0/V;

    .line 44
    .line 45
    iget-object v2, v2, La0/V;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    .line 48
    .line 49
    .line 50
    aput-object v4, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lx0/q0;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lx0/q0;-><init>([La0/V;)V

    .line 58
    .line 59
    .line 60
    return-object v0
    .line 61
.end method

.method public final z(I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ln0/q;->u:LB0/r;

    .line 4
    .line 5
    invoke-virtual {v1}, LB0/r;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    xor-int/2addr v1, v2

    .line 11
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 12
    .line 13
    .line 14
    move/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, Ln0/q;->y:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    if-ge v1, v4, :cond_3

    .line 25
    .line 26
    move v4, v1

    .line 27
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-ge v4, v7, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, Ln0/j;

    .line 38
    .line 39
    iget-boolean v7, v7, Ln0/j;->y:Z

    .line 40
    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ln0/j;

    .line 52
    .line 53
    move v7, v6

    .line 54
    :goto_2
    iget-object v8, v0, Ln0/q;->G:[Ln0/p;

    .line 55
    .line 56
    array-length v8, v8

    .line 57
    if-ge v7, v8, :cond_4

    .line 58
    .line 59
    invoke-virtual {v4, v7}, Ln0/j;->f(I)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    iget-object v9, v0, Ln0/q;->G:[Ln0/p;

    .line 64
    .line 65
    aget-object v9, v9, v7

    .line 66
    .line 67
    invoke-virtual {v9}, Lx0/e0;->n()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-le v9, v8, :cond_2

    .line 72
    .line 73
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move v1, v5

    .line 80
    :cond_4
    if-ne v1, v5, :cond_5

    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ln0/q;->A()Ln0/j;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-wide v4, v4, Ly0/e;->s:J

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Ln0/j;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    invoke-static {v3, v1, v8}, Ld0/w;->R(Ljava/util/ArrayList;II)V

    .line 100
    .line 101
    .line 102
    move v1, v6

    .line 103
    :goto_4
    iget-object v8, v0, Ln0/q;->G:[Ln0/p;

    .line 104
    .line 105
    array-length v8, v8

    .line 106
    if-ge v1, v8, :cond_6

    .line 107
    .line 108
    invoke-virtual {v7, v1}, Ln0/j;->f(I)I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    iget-object v9, v0, Ln0/q;->G:[Ln0/p;

    .line 113
    .line 114
    aget-object v9, v9, v1

    .line 115
    .line 116
    invoke-virtual {v9, v8}, Lx0/e0;->i(I)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget-wide v1, v0, Ln0/q;->a0:J

    .line 129
    .line 130
    iput-wide v1, v0, Ln0/q;->b0:J

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_7
    invoke-static {v3}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Ln0/j;

    .line 138
    .line 139
    iput-boolean v2, v1, Ln0/j;->U:Z

    .line 140
    .line 141
    :goto_5
    iput-boolean v6, v0, Ln0/q;->e0:Z

    .line 142
    .line 143
    iget v10, v0, Ln0/q;->L:I

    .line 144
    .line 145
    iget-wide v1, v7, Ly0/e;->r:J

    .line 146
    .line 147
    iget-object v3, v0, Ln0/q;->v:Lm0/e;

    .line 148
    .line 149
    new-instance v6, Lu0/g;

    .line 150
    .line 151
    invoke-static {v1, v2}, Ld0/w;->Z(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v14

    .line 155
    invoke-static {v4, v5}, Ld0/w;->Z(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v16

    .line 159
    const/4 v9, 0x1

    .line 160
    const/4 v11, 0x0

    .line 161
    const/4 v12, 0x3

    .line 162
    const/4 v13, 0x0

    .line 163
    move-object v8, v6

    .line 164
    invoke-direct/range {v8 .. v17}, Lu0/g;-><init>(IILa0/p;ILjava/lang/Object;JJ)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v3, Lm0/e;->b:Lx0/H;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v2, Lx0/K;

    .line 173
    .line 174
    const/4 v4, 0x3

    .line 175
    invoke-direct {v2, v3, v1, v6, v4}, Lx0/K;-><init>(Lm0/e;Ljava/lang/Object;Lu0/g;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, Lm0/e;->a(Ld0/d;)V

    .line 179
    .line 180
    .line 181
    return-void
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
