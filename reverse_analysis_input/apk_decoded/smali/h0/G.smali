.class public final Lh0/G;
.super LL0/e;
.source "SourceFile"

# interfaces
.implements Lh0/s;


# instance fields
.field public final A:La0/z;

.field public final B:J

.field public C:I

.field public D:Z

.field public E:I

.field public F:I

.field public G:Z

.field public final H:Lh0/t0;

.field public I:Lx0/j0;

.field public final J:Lh0/r;

.field public K:La0/K;

.field public L:La0/D;

.field public M:La0/p;

.field public N:Landroid/view/Surface;

.field public O:Landroid/view/Surface;

.field public P:Landroid/view/SurfaceHolder;

.field public Q:Z

.field public final R:I

.field public S:Ld0/q;

.field public final T:I

.field public U:La0/c;

.field public V:F

.field public W:Z

.field public final X:Z

.field public Y:Z

.field public final Z:I

.field public a0:Z

.field public final b:LA0/A;

.field public b0:La0/e0;

.field public final c:La0/K;

.field public c0:La0/D;

.field public final d:LF0/N;

.field public d0:Lh0/i0;

.field public final e:Landroid/content/Context;

.field public e0:I

.field public final f:La0/O;

.field public f0:J

.field public final g:[Lh0/o0;

.field public final h:LA0/z;

.field public final i:Ld0/t;

.field public final j:Lh0/A;

.field public final k:Lh0/N;

.field public final l:Ld0/l;

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final n:La0/S;

.field public final o:Ljava/util/ArrayList;

.field public final p:Z

.field public final q:Lx0/G;

.field public final r:Li0/c;

.field public final s:Landroid/os/Looper;

.field public final t:LB0/e;

.field public final u:Ld0/r;

.field public final v:Lh0/D;

.field public final w:Lh0/E;

.field public final x:Lh0/c;

.field public final y:Lh0/g;

.field public final z:La0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, La0/B;->a(Ljava/lang/String;)V

    .line 4
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
.end method

.method public constructor <init>(Lh0/q;)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/16 v7, 0x14

    .line 8
    .line 9
    const/4 v8, 0x1

    .line 10
    const/4 v9, 0x0

    .line 11
    const-string v10, "audio"

    .line 12
    .line 13
    const-string v11, " [AndroidXMedia3/1.5.1] ["

    .line 14
    .line 15
    const-string v12, "Init "

    .line 16
    .line 17
    invoke-direct/range {p0 .. p0}, LL0/e;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v13, LF0/N;

    .line 21
    .line 22
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v13, v1, Lh0/G;->d:LF0/N;

    .line 26
    .line 27
    :try_start_0
    const-string v13, "ExoPlayerImpl"

    .line 28
    .line 29
    new-instance v14, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    invoke-static {v12}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v12

    .line 42
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    sget-object v11, Ld0/w;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v11, "]"

    .line 54
    .line 55
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    invoke-static {v13, v11}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v11, v0, Lh0/q;->a:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    iget-object v12, v0, Lh0/q;->i:Landroid/os/Looper;

    .line 68
    .line 69
    :try_start_1
    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    iput-object v13, v1, Lh0/G;->e:Landroid/content/Context;

    .line 74
    .line 75
    iget-object v13, v0, Lh0/q;->h:LB0/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    iget-object v14, v0, Lh0/q;->b:Ld0/r;

    .line 78
    .line 79
    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v13, Li0/c;

    .line 83
    .line 84
    invoke-direct {v13, v14}, Li0/c;-><init>(Ld0/a;)V

    .line 85
    .line 86
    .line 87
    iput-object v13, v1, Lh0/G;->r:Li0/c;

    .line 88
    .line 89
    iget v13, v0, Lh0/q;->j:I

    .line 90
    .line 91
    iput v13, v1, Lh0/G;->Z:I

    .line 92
    .line 93
    iget-object v13, v0, Lh0/q;->k:La0/c;

    .line 94
    .line 95
    iput-object v13, v1, Lh0/G;->U:La0/c;

    .line 96
    .line 97
    iget v13, v0, Lh0/q;->l:I

    .line 98
    .line 99
    iput v13, v1, Lh0/G;->R:I

    .line 100
    .line 101
    iput-boolean v9, v1, Lh0/G;->W:Z

    .line 102
    .line 103
    iget-wide v5, v0, Lh0/q;->q:J

    .line 104
    .line 105
    iput-wide v5, v1, Lh0/G;->B:J

    .line 106
    .line 107
    new-instance v5, Lh0/D;

    .line 108
    .line 109
    invoke-direct {v5, v1}, Lh0/D;-><init>(Lh0/G;)V

    .line 110
    .line 111
    .line 112
    iput-object v5, v1, Lh0/G;->v:Lh0/D;

    .line 113
    .line 114
    new-instance v6, Lh0/E;

    .line 115
    .line 116
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v6, v1, Lh0/G;->w:Lh0/E;

    .line 120
    .line 121
    new-instance v6, Landroid/os/Handler;

    .line 122
    .line 123
    invoke-direct {v6, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 124
    .line 125
    .line 126
    iget-object v13, v0, Lh0/q;->c:Ll2/h;

    .line 127
    .line 128
    invoke-interface {v13}, Ll2/h;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    move-object/from16 v16, v13

    .line 133
    .line 134
    check-cast v16, Lh0/s0;

    .line 135
    .line 136
    move-object/from16 v17, v6

    .line 137
    .line 138
    move-object/from16 v18, v5

    .line 139
    .line 140
    move-object/from16 v19, v5

    .line 141
    .line 142
    move-object/from16 v20, v5

    .line 143
    .line 144
    move-object/from16 v21, v5

    .line 145
    .line 146
    invoke-interface/range {v16 .. v21}, Lh0/s0;->a(Landroid/os/Handler;LD0/A;Lj0/h;Lz0/d;Lr0/b;)[Lh0/o0;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    iput-object v5, v1, Lh0/G;->g:[Lh0/o0;

    .line 151
    .line 152
    array-length v13, v5

    .line 153
    if-lez v13, :cond_0

    .line 154
    .line 155
    move v13, v8

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    move v13, v9

    .line 158
    :goto_0
    invoke-static {v13}, Ld0/m;->h(Z)V

    .line 159
    .line 160
    .line 161
    iget-object v13, v0, Lh0/q;->e:Lh0/d;

    .line 162
    .line 163
    invoke-virtual {v13}, Lh0/d;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    check-cast v13, LA0/z;

    .line 168
    .line 169
    iput-object v13, v1, Lh0/G;->h:LA0/z;

    .line 170
    .line 171
    iget-object v13, v0, Lh0/q;->d:Ll2/h;

    .line 172
    .line 173
    invoke-interface {v13}, Ll2/h;->get()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    check-cast v13, Lx0/G;

    .line 178
    .line 179
    iput-object v13, v1, Lh0/G;->q:Lx0/G;

    .line 180
    .line 181
    iget-object v13, v0, Lh0/q;->g:Lh0/d;

    .line 182
    .line 183
    invoke-virtual {v13}, Lh0/d;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    check-cast v13, LB0/e;

    .line 188
    .line 189
    iput-object v13, v1, Lh0/G;->t:LB0/e;

    .line 190
    .line 191
    iget-boolean v13, v0, Lh0/q;->m:Z

    .line 192
    .line 193
    iput-boolean v13, v1, Lh0/G;->p:Z

    .line 194
    .line 195
    iget-object v13, v0, Lh0/q;->n:Lh0/t0;

    .line 196
    .line 197
    iput-object v13, v1, Lh0/G;->H:Lh0/t0;

    .line 198
    .line 199
    iput-object v12, v1, Lh0/G;->s:Landroid/os/Looper;

    .line 200
    .line 201
    iput-object v14, v1, Lh0/G;->u:Ld0/r;

    .line 202
    .line 203
    iput-object v1, v1, Lh0/G;->f:La0/O;

    .line 204
    .line 205
    new-instance v13, Ld0/l;

    .line 206
    .line 207
    new-instance v15, Lh0/A;

    .line 208
    .line 209
    invoke-direct {v15, v1}, Lh0/A;-><init>(Lh0/G;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v13, v12, v14, v15}, Ld0/l;-><init>(Landroid/os/Looper;Ld0/a;Ld0/j;)V

    .line 213
    .line 214
    .line 215
    iput-object v13, v1, Lh0/G;->l:Ld0/l;

    .line 216
    .line 217
    new-instance v12, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 218
    .line 219
    invoke-direct {v12}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 220
    .line 221
    .line 222
    iput-object v12, v1, Lh0/G;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 223
    .line 224
    new-instance v12, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    iput-object v12, v1, Lh0/G;->o:Ljava/util/ArrayList;

    .line 230
    .line 231
    new-instance v12, Lx0/i0;

    .line 232
    .line 233
    invoke-direct {v12}, Lx0/i0;-><init>()V

    .line 234
    .line 235
    .line 236
    iput-object v12, v1, Lh0/G;->I:Lx0/j0;

    .line 237
    .line 238
    sget-object v12, Lh0/r;->a:Lh0/r;

    .line 239
    .line 240
    iput-object v12, v1, Lh0/G;->J:Lh0/r;

    .line 241
    .line 242
    new-instance v12, LA0/A;

    .line 243
    .line 244
    array-length v13, v5

    .line 245
    new-array v13, v13, [Lh0/r0;

    .line 246
    .line 247
    array-length v5, v5

    .line 248
    new-array v5, v5, [LA0/w;

    .line 249
    .line 250
    sget-object v14, La0/b0;->b:La0/b0;

    .line 251
    .line 252
    const/4 v15, 0x0

    .line 253
    invoke-direct {v12, v13, v5, v14, v15}, LA0/A;-><init>([Lh0/r0;[LA0/w;La0/b0;LA0/y;)V

    .line 254
    .line 255
    .line 256
    iput-object v12, v1, Lh0/G;->b:LA0/A;

    .line 257
    .line 258
    new-instance v5, La0/S;

    .line 259
    .line 260
    invoke-direct {v5}, La0/S;-><init>()V

    .line 261
    .line 262
    .line 263
    iput-object v5, v1, Lh0/G;->n:La0/S;

    .line 264
    .line 265
    new-instance v5, Landroid/util/SparseBooleanArray;

    .line 266
    .line 267
    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 268
    .line 269
    .line 270
    new-array v12, v7, [I

    .line 271
    .line 272
    fill-array-data v12, :array_0

    .line 273
    .line 274
    .line 275
    move v13, v9

    .line 276
    :goto_1
    if-ge v13, v7, :cond_1

    .line 277
    .line 278
    aget v14, v12, v13

    .line 279
    .line 280
    xor-int/lit8 v17, v9, 0x1

    .line 281
    .line 282
    invoke-static/range {v17 .. v17}, Ld0/m;->h(Z)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v14, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 286
    .line 287
    .line 288
    add-int/2addr v13, v8

    .line 289
    goto :goto_1

    .line 290
    :cond_1
    iget-object v7, v1, Lh0/G;->h:LA0/z;

    .line 291
    .line 292
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    xor-int/lit8 v7, v9, 0x1

    .line 296
    .line 297
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 298
    .line 299
    .line 300
    const/16 v7, 0x1d

    .line 301
    .line 302
    invoke-virtual {v5, v7, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 303
    .line 304
    .line 305
    new-instance v7, La0/K;

    .line 306
    .line 307
    xor-int/lit8 v12, v9, 0x1

    .line 308
    .line 309
    invoke-static {v12}, Ld0/m;->h(Z)V

    .line 310
    .line 311
    .line 312
    new-instance v12, La0/n;

    .line 313
    .line 314
    invoke-direct {v12, v5}, La0/n;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 315
    .line 316
    .line 317
    invoke-direct {v7, v12}, La0/K;-><init>(La0/n;)V

    .line 318
    .line 319
    .line 320
    iput-object v7, v1, Lh0/G;->c:La0/K;

    .line 321
    .line 322
    new-instance v5, Landroid/util/SparseBooleanArray;

    .line 323
    .line 324
    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 325
    .line 326
    .line 327
    move v7, v9

    .line 328
    :goto_2
    iget-object v13, v12, La0/n;->a:Landroid/util/SparseBooleanArray;

    .line 329
    .line 330
    invoke-virtual {v13}, Landroid/util/SparseBooleanArray;->size()I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    if-ge v7, v13, :cond_2

    .line 335
    .line 336
    invoke-virtual {v12, v7}, La0/n;->a(I)I

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    xor-int/lit8 v14, v9, 0x1

    .line 341
    .line 342
    invoke-static {v14}, Ld0/m;->h(Z)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5, v13, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 346
    .line 347
    .line 348
    add-int/2addr v7, v8

    .line 349
    goto :goto_2

    .line 350
    :cond_2
    xor-int/lit8 v7, v9, 0x1

    .line 351
    .line 352
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 353
    .line 354
    .line 355
    const/4 v7, 0x4

    .line 356
    invoke-virtual {v5, v7, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 357
    .line 358
    .line 359
    xor-int/lit8 v12, v9, 0x1

    .line 360
    .line 361
    invoke-static {v12}, Ld0/m;->h(Z)V

    .line 362
    .line 363
    .line 364
    const/16 v12, 0xa

    .line 365
    .line 366
    invoke-virtual {v5, v12, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 367
    .line 368
    .line 369
    new-instance v13, La0/K;

    .line 370
    .line 371
    xor-int/lit8 v14, v9, 0x1

    .line 372
    .line 373
    invoke-static {v14}, Ld0/m;->h(Z)V

    .line 374
    .line 375
    .line 376
    new-instance v14, La0/n;

    .line 377
    .line 378
    invoke-direct {v14, v5}, La0/n;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 379
    .line 380
    .line 381
    invoke-direct {v13, v14}, La0/K;-><init>(La0/n;)V

    .line 382
    .line 383
    .line 384
    iput-object v13, v1, Lh0/G;->K:La0/K;

    .line 385
    .line 386
    iget-object v5, v1, Lh0/G;->u:Ld0/r;

    .line 387
    .line 388
    iget-object v13, v1, Lh0/G;->s:Landroid/os/Looper;

    .line 389
    .line 390
    invoke-virtual {v5, v13, v15}, Ld0/r;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld0/t;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    iput-object v5, v1, Lh0/G;->i:Ld0/t;

    .line 395
    .line 396
    new-instance v5, Lh0/A;

    .line 397
    .line 398
    invoke-direct {v5, v1}, Lh0/A;-><init>(Lh0/G;)V

    .line 399
    .line 400
    .line 401
    iput-object v5, v1, Lh0/G;->j:Lh0/A;

    .line 402
    .line 403
    iget-object v13, v1, Lh0/G;->b:LA0/A;

    .line 404
    .line 405
    invoke-static {v13}, Lh0/i0;->i(LA0/A;)Lh0/i0;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    iput-object v13, v1, Lh0/G;->d0:Lh0/i0;

    .line 410
    .line 411
    iget-object v13, v1, Lh0/G;->r:Li0/c;

    .line 412
    .line 413
    iget-object v14, v1, Lh0/G;->f:La0/O;

    .line 414
    .line 415
    iget-object v3, v1, Lh0/G;->s:Landroid/os/Looper;

    .line 416
    .line 417
    invoke-virtual {v13, v14, v3}, Li0/c;->m(La0/O;Landroid/os/Looper;)V

    .line 418
    .line 419
    .line 420
    sget v3, Ld0/w;->a:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 421
    .line 422
    iget-object v13, v0, Lh0/q;->t:Ljava/lang/String;

    .line 423
    .line 424
    if-ge v3, v2, :cond_3

    .line 425
    .line 426
    :try_start_3
    new-instance v2, Li0/j;

    .line 427
    .line 428
    invoke-direct {v2, v13}, Li0/j;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :goto_3
    move-object/from16 v38, v2

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :catchall_0
    move-exception v0

    .line 435
    goto/16 :goto_7

    .line 436
    .line 437
    :cond_3
    iget-object v2, v1, Lh0/G;->e:Landroid/content/Context;

    .line 438
    .line 439
    iget-boolean v3, v0, Lh0/q;->r:Z

    .line 440
    .line 441
    invoke-static {v2, v1, v3, v13}, LQ1/C;->n0(Landroid/content/Context;Lh0/G;ZLjava/lang/String;)Li0/j;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    goto :goto_3

    .line 446
    :goto_4
    new-instance v2, Lh0/N;

    .line 447
    .line 448
    iget-object v3, v1, Lh0/G;->g:[Lh0/o0;

    .line 449
    .line 450
    iget-object v13, v1, Lh0/G;->h:LA0/z;

    .line 451
    .line 452
    iget-object v14, v1, Lh0/G;->b:LA0/A;

    .line 453
    .line 454
    iget-object v7, v0, Lh0/q;->f:Ll2/h;

    .line 455
    .line 456
    invoke-interface {v7}, Ll2/h;->get()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    move-object/from16 v26, v7

    .line 461
    .line 462
    check-cast v26, Lh0/Q;

    .line 463
    .line 464
    iget-object v7, v1, Lh0/G;->t:LB0/e;

    .line 465
    .line 466
    iget v12, v1, Lh0/G;->C:I

    .line 467
    .line 468
    iget-boolean v4, v1, Lh0/G;->D:Z

    .line 469
    .line 470
    iget-object v15, v1, Lh0/G;->r:Li0/c;

    .line 471
    .line 472
    iget-object v8, v1, Lh0/G;->H:Lh0/t0;

    .line 473
    .line 474
    iget-object v9, v0, Lh0/q;->o:Lh0/O;

    .line 475
    .line 476
    move-object/from16 v40, v10

    .line 477
    .line 478
    move-object/from16 v41, v11

    .line 479
    .line 480
    iget-wide v10, v0, Lh0/q;->p:J

    .line 481
    .line 482
    iget-object v0, v1, Lh0/G;->s:Landroid/os/Looper;

    .line 483
    .line 484
    move-object/from16 v42, v6

    .line 485
    .line 486
    iget-object v6, v1, Lh0/G;->u:Ld0/r;

    .line 487
    .line 488
    move-object/from16 v37, v5

    .line 489
    .line 490
    iget-object v5, v1, Lh0/G;->J:Lh0/r;

    .line 491
    .line 492
    move-object/from16 v22, v2

    .line 493
    .line 494
    move-object/from16 v23, v3

    .line 495
    .line 496
    move-object/from16 v24, v13

    .line 497
    .line 498
    move-object/from16 v25, v14

    .line 499
    .line 500
    move-object/from16 v27, v7

    .line 501
    .line 502
    move/from16 v28, v12

    .line 503
    .line 504
    move/from16 v29, v4

    .line 505
    .line 506
    move-object/from16 v30, v15

    .line 507
    .line 508
    move-object/from16 v31, v8

    .line 509
    .line 510
    move-object/from16 v32, v9

    .line 511
    .line 512
    move-wide/from16 v33, v10

    .line 513
    .line 514
    move-object/from16 v35, v0

    .line 515
    .line 516
    move-object/from16 v36, v6

    .line 517
    .line 518
    move-object/from16 v39, v5

    .line 519
    .line 520
    invoke-direct/range {v22 .. v39}, Lh0/N;-><init>([Lh0/o0;LA0/z;LA0/A;Lh0/Q;LB0/e;IZLi0/c;Lh0/t0;Lh0/O;JLandroid/os/Looper;Ld0/r;Lh0/A;Li0/j;Lh0/r;)V

    .line 521
    .line 522
    .line 523
    iput-object v2, v1, Lh0/G;->k:Lh0/N;

    .line 524
    .line 525
    const/high16 v0, 0x3f800000    # 1.0f

    .line 526
    .line 527
    iput v0, v1, Lh0/G;->V:F

    .line 528
    .line 529
    const/4 v0, 0x0

    .line 530
    iput v0, v1, Lh0/G;->C:I

    .line 531
    .line 532
    sget-object v0, La0/D;->B:La0/D;

    .line 533
    .line 534
    iput-object v0, v1, Lh0/G;->L:La0/D;

    .line 535
    .line 536
    iput-object v0, v1, Lh0/G;->c0:La0/D;

    .line 537
    .line 538
    const/4 v0, -0x1

    .line 539
    iput v0, v1, Lh0/G;->e0:I

    .line 540
    .line 541
    iget-object v2, v1, Lh0/G;->e:Landroid/content/Context;

    .line 542
    .line 543
    move-object/from16 v3, v40

    .line 544
    .line 545
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    check-cast v2, Landroid/media/AudioManager;

    .line 550
    .line 551
    if-nez v2, :cond_4

    .line 552
    .line 553
    move v2, v0

    .line 554
    goto :goto_5

    .line 555
    :cond_4
    invoke-virtual {v2}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    :goto_5
    iput v2, v1, Lh0/G;->T:I

    .line 560
    .line 561
    sget v3, Lc0/c;->b:I

    .line 562
    .line 563
    const/4 v3, 0x1

    .line 564
    iput-boolean v3, v1, Lh0/G;->X:Z

    .line 565
    .line 566
    iget-object v3, v1, Lh0/G;->r:Li0/c;

    .line 567
    .line 568
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    iget-object v4, v1, Lh0/G;->l:Ld0/l;

    .line 572
    .line 573
    invoke-virtual {v4, v3}, Ld0/l;->a(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    iget-object v3, v1, Lh0/G;->t:LB0/e;

    .line 577
    .line 578
    new-instance v4, Landroid/os/Handler;

    .line 579
    .line 580
    iget-object v5, v1, Lh0/G;->s:Landroid/os/Looper;

    .line 581
    .line 582
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 583
    .line 584
    .line 585
    iget-object v5, v1, Lh0/G;->r:Li0/c;

    .line 586
    .line 587
    check-cast v3, LB0/i;

    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v3, v3, LB0/i;->b:LB0/d;

    .line 596
    .line 597
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 598
    .line 599
    .line 600
    iget-object v3, v3, LB0/d;->l:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 603
    .line 604
    :try_start_4
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    :cond_5
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    if-eqz v7, :cond_6

    .line 613
    .line 614
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    check-cast v7, LB0/c;

    .line 619
    .line 620
    iget-object v8, v7, LB0/c;->b:Li0/c;

    .line 621
    .line 622
    if-ne v8, v5, :cond_5

    .line 623
    .line 624
    const/4 v8, 0x1

    .line 625
    iput-boolean v8, v7, LB0/c;->c:Z

    .line 626
    .line 627
    invoke-virtual {v3, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    goto :goto_6

    .line 631
    :cond_6
    new-instance v6, LB0/c;

    .line 632
    .line 633
    invoke-direct {v6, v4, v5}, LB0/c;-><init>(Landroid/os/Handler;Li0/c;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v3, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    iget-object v3, v1, Lh0/G;->v:Lh0/D;

    .line 640
    .line 641
    iget-object v4, v1, Lh0/G;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 642
    .line 643
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    new-instance v3, Lh0/c;

    .line 647
    .line 648
    iget-object v4, v1, Lh0/G;->v:Lh0/D;

    .line 649
    .line 650
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v41 .. v41}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    iput-object v5, v3, Lh0/c;->b:Ljava/lang/Object;

    .line 658
    .line 659
    new-instance v5, Lh0/b;

    .line 660
    .line 661
    move-object/from16 v6, v42

    .line 662
    .line 663
    invoke-direct {v5, v3, v6, v4}, Lh0/b;-><init>(Lh0/c;Landroid/os/Handler;Lh0/D;)V

    .line 664
    .line 665
    .line 666
    iput-object v5, v3, Lh0/c;->c:Ljava/lang/Object;

    .line 667
    .line 668
    iput-object v3, v1, Lh0/G;->x:Lh0/c;

    .line 669
    .line 670
    invoke-virtual {v3}, Lh0/c;->b()V

    .line 671
    .line 672
    .line 673
    new-instance v3, Lh0/g;

    .line 674
    .line 675
    iget-object v4, v1, Lh0/G;->v:Lh0/D;

    .line 676
    .line 677
    move-object/from16 v5, v41

    .line 678
    .line 679
    invoke-direct {v3, v5, v6, v4}, Lh0/g;-><init>(Landroid/content/Context;Landroid/os/Handler;Lh0/D;)V

    .line 680
    .line 681
    .line 682
    iput-object v3, v1, Lh0/G;->y:Lh0/g;

    .line 683
    .line 684
    const/4 v4, 0x0

    .line 685
    invoke-virtual {v3, v4}, Lh0/g;->b(La0/c;)V

    .line 686
    .line 687
    .line 688
    new-instance v3, La0/z;

    .line 689
    .line 690
    const/16 v4, 0xd

    .line 691
    .line 692
    invoke-direct {v3, v4}, La0/z;-><init>(I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 696
    .line 697
    .line 698
    iput-object v3, v1, Lh0/G;->z:La0/z;

    .line 699
    .line 700
    new-instance v3, La0/z;

    .line 701
    .line 702
    invoke-direct {v3, v5}, La0/z;-><init>(Landroid/content/Context;)V

    .line 703
    .line 704
    .line 705
    iput-object v3, v1, Lh0/G;->A:La0/z;

    .line 706
    .line 707
    new-instance v3, LD/o;

    .line 708
    .line 709
    const/4 v4, 0x1

    .line 710
    invoke-direct {v3, v4}, LD/o;-><init>(I)V

    .line 711
    .line 712
    .line 713
    const/4 v4, 0x0

    .line 714
    iput v4, v3, LD/o;->b:I

    .line 715
    .line 716
    iput v4, v3, LD/o;->c:I

    .line 717
    .line 718
    new-instance v4, La0/i;

    .line 719
    .line 720
    invoke-direct {v4, v3}, La0/i;-><init>(LD/o;)V

    .line 721
    .line 722
    .line 723
    sget-object v3, La0/e0;->d:La0/e0;

    .line 724
    .line 725
    iput-object v3, v1, Lh0/G;->b0:La0/e0;

    .line 726
    .line 727
    sget-object v3, Ld0/q;->c:Ld0/q;

    .line 728
    .line 729
    iput-object v3, v1, Lh0/G;->S:Ld0/q;

    .line 730
    .line 731
    iget-object v3, v1, Lh0/G;->h:LA0/z;

    .line 732
    .line 733
    iget-object v4, v1, Lh0/G;->U:La0/c;

    .line 734
    .line 735
    invoke-virtual {v3, v4}, LA0/z;->a(La0/c;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    const/16 v4, 0xa

    .line 743
    .line 744
    const/4 v5, 0x1

    .line 745
    invoke-virtual {v1, v5, v4, v3}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/4 v3, 0x2

    .line 753
    invoke-virtual {v1, v3, v4, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    iget-object v2, v1, Lh0/G;->U:La0/c;

    .line 757
    .line 758
    const/4 v4, 0x3

    .line 759
    invoke-virtual {v1, v5, v4, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    iget v2, v1, Lh0/G;->R:I

    .line 763
    .line 764
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    const/4 v4, 0x4

    .line 769
    invoke-virtual {v1, v3, v4, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    const/4 v2, 0x0

    .line 773
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    const/4 v4, 0x5

    .line 778
    invoke-virtual {v1, v3, v4, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    iget-boolean v2, v1, Lh0/G;->W:Z

    .line 782
    .line 783
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    const/16 v3, 0x9

    .line 788
    .line 789
    const/4 v4, 0x1

    .line 790
    invoke-virtual {v1, v4, v3, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    iget-object v2, v1, Lh0/G;->w:Lh0/E;

    .line 794
    .line 795
    const/4 v3, 0x7

    .line 796
    const/4 v4, 0x2

    .line 797
    invoke-virtual {v1, v4, v3, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    iget-object v2, v1, Lh0/G;->w:Lh0/E;

    .line 801
    .line 802
    const/4 v3, 0x6

    .line 803
    const/16 v4, 0x8

    .line 804
    .line 805
    invoke-virtual {v1, v3, v4, v2}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    iget v2, v1, Lh0/G;->Z:I

    .line 809
    .line 810
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    const/16 v3, 0x10

    .line 815
    .line 816
    invoke-virtual {v1, v0, v3, v2}, Lh0/G;->O(IILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 817
    .line 818
    .line 819
    iget-object v0, v1, Lh0/G;->d:LF0/N;

    .line 820
    .line 821
    invoke-virtual {v0}, LF0/N;->a()Z

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :goto_7
    iget-object v2, v1, Lh0/G;->d:LF0/N;

    .line 826
    .line 827
    invoke-virtual {v2}, LF0/N;->a()Z

    .line 828
    .line 829
    .line 830
    throw v0

    .line 831
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
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

.method public static F(Lh0/i0;)J
    .locals 6

    .line 1
    new-instance v0, La0/T;

    .line 2
    .line 3
    invoke-direct {v0}, La0/T;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La0/S;

    .line 7
    .line 8
    invoke-direct {v1}, La0/S;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lh0/i0;->a:La0/U;

    .line 12
    .line 13
    iget-object v3, p0, Lh0/i0;->b:Lx0/H;

    .line 14
    .line 15
    iget-object v3, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 18
    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v4, p0, Lh0/i0;->c:J

    .line 26
    .line 27
    cmp-long v2, v4, v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget v1, v1, La0/S;->c:I

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    iget-object p0, p0, Lh0/i0;->a:La0/U;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, La0/T;->l:J

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-wide v0, v1, La0/S;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v4

    .line 47
    :goto_0
    return-wide v0
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
.method public final A(Lh0/i0;)I
    .locals 2

    .line 1
    iget-object v0, p1, Lh0/i0;->a:La0/U;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/U;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lh0/G;->e0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, Lh0/i0;->b:Lx0/H;

    .line 13
    .line 14
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, Lh0/G;->n:La0/S;

    .line 17
    .line 18
    iget-object p1, p1, Lh0/i0;->a:La0/U;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, La0/S;->c:I

    .line 25
    .line 26
    return p1
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

.method public final B()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->G()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 11
    .line 12
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 13
    .line 14
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 15
    .line 16
    iget-object v2, v1, Lx0/H;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Lh0/G;->n:La0/S;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 21
    .line 22
    .line 23
    iget v0, v1, Lx0/H;->b:I

    .line 24
    .line 25
    iget v1, v1, Lx0/H;->c:I

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, La0/S;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lh0/G;->z()La0/U;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, La0/U;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p0}, Lh0/G;->w()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const-wide/16 v2, 0x0

    .line 57
    .line 58
    iget-object v4, p0, LL0/e;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, La0/T;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-wide v0, v0, La0/T;->m:J

    .line 67
    .line 68
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    :goto_0
    return-wide v0
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

.method public final C(La0/U;Lh0/n0;IJ)Landroid/util/Pair;
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    move-object v8, p2

    .line 3
    invoke-virtual {p1}, La0/U;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v11, -0x1

    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {p2}, La0/U;->p()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static/range {p4 .. p5}, Ld0/w;->M(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    iget-object v1, v0, LL0/e;->a:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v3, v1

    .line 29
    check-cast v3, La0/T;

    .line 30
    .line 31
    iget-object v4, v0, Lh0/G;->n:La0/S;

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    move v5, p3

    .line 35
    invoke-virtual/range {v2 .. v7}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p2, v5}, Lh0/a;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eq v2, v11, :cond_1

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    iget v3, v0, Lh0/G;->C:I

    .line 49
    .line 50
    iget-boolean v4, v0, Lh0/G;->D:Z

    .line 51
    .line 52
    iget-object v1, v0, LL0/e;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, La0/T;

    .line 55
    .line 56
    iget-object v2, v0, Lh0/G;->n:La0/S;

    .line 57
    .line 58
    move-object v6, p1

    .line 59
    move-object v7, p2

    .line 60
    invoke-static/range {v1 .. v7}, Lh0/N;->K(La0/T;La0/S;IZLjava/lang/Object;La0/U;La0/U;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eq v1, v11, :cond_2

    .line 65
    .line 66
    iget-object v2, v0, LL0/e;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, La0/T;

    .line 69
    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    invoke-virtual {p2, v1, v2, v3, v4}, Lh0/a;->m(ILa0/T;J)La0/T;

    .line 73
    .line 74
    .line 75
    iget-wide v2, v2, La0/T;->l:J

    .line 76
    .line 77
    invoke-static {v2, v3}, Ld0/w;->Z(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    invoke-virtual {p0, p2, v1, v2, v3}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    return-object v1

    .line 86
    :cond_2
    invoke-virtual {p0, p2, v11, v9, v10}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    return-object v1

    .line 91
    :cond_3
    :goto_0
    invoke-virtual {p1}, La0/U;->p()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    invoke-virtual {p2}, La0/U;->p()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const/4 v1, 0x0

    .line 106
    :goto_1
    if-eqz v1, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move v11, p3

    .line 110
    :goto_2
    if-eqz v1, :cond_6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move-wide/from16 v9, p4

    .line 114
    .line 115
    :goto_3
    invoke-virtual {p0, p2, v11, v9, v10}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    return-object v1
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

.method public final D()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    iget-boolean v0, v0, Lh0/i0;->l:Z

    .line 7
    .line 8
    return v0
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

.method public final E()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    iget v0, v0, Lh0/i0;->e:I

    .line 7
    .line 8
    return v0
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

.method public final G()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 7
    .line 8
    invoke-virtual {v0}, Lx0/H;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public final H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, La0/U;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, Lh0/i0;->a:La0/U;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Lh0/G;->t(Lh0/i0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    invoke-virtual/range {p1 .. p2}, Lh0/i0;->h(La0/U;)Lh0/i0;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual/range {p2 .. p2}, La0/U;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget-object v1, Lh0/i0;->u:Lx0/H;

    .line 43
    .line 44
    iget-wide v2, v0, Lh0/G;->f0:J

    .line 45
    .line 46
    invoke-static {v2, v3}, Ld0/w;->M(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v15

    .line 50
    sget-object v19, Lx0/q0;->d:Lx0/q0;

    .line 51
    .line 52
    iget-object v2, v0, Lh0/G;->b:LA0/A;

    .line 53
    .line 54
    sget-object v21, Lm2/b0;->p:Lm2/b0;

    .line 55
    .line 56
    const-wide/16 v17, 0x0

    .line 57
    .line 58
    move-object v10, v1

    .line 59
    move-wide v11, v15

    .line 60
    move-wide v13, v15

    .line 61
    move-object/from16 v20, v2

    .line 62
    .line 63
    invoke-virtual/range {v9 .. v21}, Lh0/i0;->c(Lx0/H;JJJJLx0/q0;LA0/A;Ljava/util/List;)Lh0/i0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v1}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-wide v2, v1, Lh0/i0;->s:J

    .line 72
    .line 73
    iput-wide v2, v1, Lh0/i0;->q:J

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_2
    iget-object v3, v9, Lh0/i0;->b:Lx0/H;

    .line 77
    .line 78
    iget-object v3, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-nez v10, :cond_3

    .line 87
    .line 88
    new-instance v11, Lx0/H;

    .line 89
    .line 90
    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-direct {v11, v12}, Lx0/H;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    move-object v15, v11

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iget-object v11, v9, Lh0/i0;->b:Lx0/H;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_3
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v13

    .line 108
    invoke-static {v7, v8}, Ld0/w;->M(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    invoke-virtual {v6}, La0/U;->p()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    iget-object v2, v0, Lh0/G;->n:La0/S;

    .line 119
    .line 120
    invoke-virtual {v6, v3, v2}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-wide v2, v2, La0/S;->e:J

    .line 125
    .line 126
    sub-long/2addr v7, v2

    .line 127
    :cond_4
    if-eqz v10, :cond_5

    .line 128
    .line 129
    cmp-long v2, v13, v7

    .line 130
    .line 131
    if-gez v2, :cond_6

    .line 132
    .line 133
    :cond_5
    move-wide v7, v13

    .line 134
    move-object v1, v15

    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :cond_6
    if-nez v2, :cond_9

    .line 138
    .line 139
    iget-object v2, v9, Lh0/i0;->k:Lx0/H;

    .line 140
    .line 141
    iget-object v2, v2, Lx0/H;->a:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, La0/U;->b(Ljava/lang/Object;)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v3, -0x1

    .line 148
    if-eq v2, v3, :cond_7

    .line 149
    .line 150
    iget-object v3, v0, Lh0/G;->n:La0/S;

    .line 151
    .line 152
    invoke-virtual {v1, v2, v3, v4}, La0/U;->f(ILa0/S;Z)La0/S;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget v2, v2, La0/S;->c:I

    .line 157
    .line 158
    iget-object v3, v15, Lx0/H;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v4, v0, Lh0/G;->n:La0/S;

    .line 161
    .line 162
    invoke-virtual {v1, v3, v4}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget v3, v3, La0/S;->c:I

    .line 167
    .line 168
    if-eq v2, v3, :cond_e

    .line 169
    .line 170
    :cond_7
    iget-object v2, v15, Lx0/H;->a:Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v3, v0, Lh0/G;->n:La0/S;

    .line 173
    .line 174
    invoke-virtual {v1, v2, v3}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15}, Lx0/H;->b()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_8

    .line 182
    .line 183
    iget-object v1, v0, Lh0/G;->n:La0/S;

    .line 184
    .line 185
    iget v2, v15, Lx0/H;->b:I

    .line 186
    .line 187
    iget v3, v15, Lx0/H;->c:I

    .line 188
    .line 189
    invoke-virtual {v1, v2, v3}, La0/S;->a(II)J

    .line 190
    .line 191
    .line 192
    move-result-wide v1

    .line 193
    goto :goto_4

    .line 194
    :cond_8
    iget-object v1, v0, Lh0/G;->n:La0/S;

    .line 195
    .line 196
    iget-wide v1, v1, La0/S;->d:J

    .line 197
    .line 198
    :goto_4
    iget-wide v11, v9, Lh0/i0;->s:J

    .line 199
    .line 200
    iget-wide v13, v9, Lh0/i0;->s:J

    .line 201
    .line 202
    iget-wide v3, v9, Lh0/i0;->d:J

    .line 203
    .line 204
    iget-wide v5, v9, Lh0/i0;->s:J

    .line 205
    .line 206
    sub-long v17, v1, v5

    .line 207
    .line 208
    iget-object v5, v9, Lh0/i0;->h:Lx0/q0;

    .line 209
    .line 210
    iget-object v6, v9, Lh0/i0;->i:LA0/A;

    .line 211
    .line 212
    iget-object v7, v9, Lh0/i0;->j:Ljava/util/List;

    .line 213
    .line 214
    move-object v10, v15

    .line 215
    move-object v8, v15

    .line 216
    move-wide v15, v3

    .line 217
    move-object/from16 v19, v5

    .line 218
    .line 219
    move-object/from16 v20, v6

    .line 220
    .line 221
    move-object/from16 v21, v7

    .line 222
    .line 223
    invoke-virtual/range {v9 .. v21}, Lh0/i0;->c(Lx0/H;JJJJLx0/q0;LA0/A;Ljava/util/List;)Lh0/i0;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3, v8}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    iput-wide v1, v9, Lh0/i0;->q:J

    .line 232
    .line 233
    goto/16 :goto_c

    .line 234
    .line 235
    :cond_9
    move-object v1, v15

    .line 236
    invoke-virtual {v1}, Lx0/H;->b()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    xor-int/2addr v2, v5

    .line 241
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 242
    .line 243
    .line 244
    iget-wide v2, v9, Lh0/i0;->r:J

    .line 245
    .line 246
    sub-long v4, v13, v7

    .line 247
    .line 248
    sub-long/2addr v2, v4

    .line 249
    const-wide/16 v4, 0x0

    .line 250
    .line 251
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v17

    .line 255
    iget-wide v2, v9, Lh0/i0;->q:J

    .line 256
    .line 257
    iget-object v4, v9, Lh0/i0;->k:Lx0/H;

    .line 258
    .line 259
    iget-object v5, v9, Lh0/i0;->b:Lx0/H;

    .line 260
    .line 261
    invoke-virtual {v4, v5}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_a

    .line 266
    .line 267
    add-long v2, v13, v17

    .line 268
    .line 269
    :cond_a
    iget-object v4, v9, Lh0/i0;->h:Lx0/q0;

    .line 270
    .line 271
    iget-object v5, v9, Lh0/i0;->i:LA0/A;

    .line 272
    .line 273
    iget-object v6, v9, Lh0/i0;->j:Ljava/util/List;

    .line 274
    .line 275
    move-object v10, v1

    .line 276
    move-wide v11, v13

    .line 277
    move-wide v7, v13

    .line 278
    move-wide v15, v7

    .line 279
    move-object/from16 v19, v4

    .line 280
    .line 281
    move-object/from16 v20, v5

    .line 282
    .line 283
    move-object/from16 v21, v6

    .line 284
    .line 285
    invoke-virtual/range {v9 .. v21}, Lh0/i0;->c(Lx0/H;JJJJLx0/q0;LA0/A;Ljava/util/List;)Lh0/i0;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    iput-wide v2, v9, Lh0/i0;->q:J

    .line 290
    .line 291
    goto :goto_c

    .line 292
    :goto_5
    invoke-virtual {v1}, Lx0/H;->b()Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    xor-int/2addr v2, v5

    .line 297
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 298
    .line 299
    .line 300
    if-nez v10, :cond_b

    .line 301
    .line 302
    sget-object v2, Lx0/q0;->d:Lx0/q0;

    .line 303
    .line 304
    :goto_6
    move-object/from16 v19, v2

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_b
    iget-object v2, v9, Lh0/i0;->h:Lx0/q0;

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :goto_7
    if-nez v10, :cond_c

    .line 311
    .line 312
    iget-object v2, v0, Lh0/G;->b:LA0/A;

    .line 313
    .line 314
    :goto_8
    move-object/from16 v20, v2

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_c
    iget-object v2, v9, Lh0/i0;->i:LA0/A;

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :goto_9
    if-nez v10, :cond_d

    .line 321
    .line 322
    sget-object v2, Lm2/I;->m:Lm2/G;

    .line 323
    .line 324
    sget-object v2, Lm2/b0;->p:Lm2/b0;

    .line 325
    .line 326
    :goto_a
    move-object/from16 v21, v2

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_d
    iget-object v2, v9, Lh0/i0;->j:Ljava/util/List;

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :goto_b
    const-wide/16 v17, 0x0

    .line 333
    .line 334
    move-object v10, v1

    .line 335
    move-wide v11, v7

    .line 336
    move-wide v13, v7

    .line 337
    move-wide v15, v7

    .line 338
    invoke-virtual/range {v9 .. v21}, Lh0/i0;->c(Lx0/H;JJJJLx0/q0;LA0/A;Ljava/util/List;)Lh0/i0;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v2, v1}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    iput-wide v7, v9, Lh0/i0;->q:J

    .line 347
    .line 348
    :cond_e
    :goto_c
    return-object v9
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
.end method

.method public final I(La0/U;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, La0/U;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, Lh0/G;->e0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p3, p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, Lh0/G;->f0:J

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, La0/U;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p2, p0, Lh0/G;->D:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, La0/U;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, LL0/e;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, La0/T;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, v1, v2}, La0/U;->m(ILa0/T;J)La0/T;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, La0/T;->l:J

    .line 52
    .line 53
    invoke-static {p3, p4}, Ld0/w;->Z(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    invoke-static {p3, p4}, Ld0/w;->M(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    iget-object p2, p0, LL0/e;->a:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v1, p2

    .line 65
    check-cast v1, La0/T;

    .line 66
    .line 67
    iget-object v2, p0, Lh0/G;->n:La0/S;

    .line 68
    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
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

.method public final J(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/G;->S:Ld0/q;

    .line 2
    .line 3
    iget v1, v0, Ld0/q;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Ld0/q;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ld0/q;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Ld0/q;-><init>(II)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh0/G;->S:Ld0/q;

    .line 17
    .line 18
    new-instance v0, Lh0/x;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lh0/x;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lh0/G;->l:Ld0/l;

    .line 24
    .line 25
    const/16 v2, 0x18

    .line 26
    .line 27
    invoke-virtual {v1, v2, v0}, Ld0/l;->e(ILd0/i;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ld0/q;

    .line 31
    .line 32
    invoke-direct {v0, p1, p2}, Ld0/q;-><init>(II)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    const/16 p2, 0xe

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v0}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
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

.method public final K()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lh0/G;->y:Lh0/g;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, Lh0/g;->d(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, -0x1

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    move v3, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v4

    .line 22
    :goto_0
    invoke-virtual {p0, v1, v3, v0}, Lh0/G;->a0(IIZ)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 26
    .line 27
    iget v1, v0, Lh0/i0;->e:I

    .line 28
    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Lh0/i0;->e(Lh0/o;)Lh0/i0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 38
    .line 39
    invoke-virtual {v1}, La0/U;->p()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    :cond_2
    invoke-virtual {v0, v2}, Lh0/i0;->g(I)Lh0/i0;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iget v0, p0, Lh0/G;->E:I

    .line 51
    .line 52
    add-int/2addr v0, v4

    .line 53
    iput v0, p0, Lh0/G;->E:I

    .line 54
    .line 55
    iget-object v0, p0, Lh0/G;->k:Lh0/N;

    .line 56
    .line 57
    iget-object v0, v0, Lh0/N;->t:Ld0/t;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v0, v0, Ld0/t;->a:Landroid/os/Handler;

    .line 67
    .line 68
    const/16 v2, 0x1d

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Ld0/s;->a:Landroid/os/Message;

    .line 75
    .line 76
    invoke-virtual {v1}, Ld0/s;->b()V

    .line 77
    .line 78
    .line 79
    const/4 v9, 0x5

    .line 80
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const/4 v7, 0x1

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v12, -0x1

    .line 88
    const/4 v13, 0x0

    .line 89
    move-object v5, p0

    .line 90
    invoke-virtual/range {v5 .. v13}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 91
    .line 92
    .line 93
    return-void
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

.method public final L()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "ExoPlayerImpl"

    .line 3
    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "Release "

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v3, " [AndroidXMedia3/1.5.1] ["

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    sget-object v3, Ld0/w;->e:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, "] ["

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v3, La0/B;->a:Ljava/util/HashSet;

    .line 38
    .line 39
    const-class v3, La0/B;

    .line 40
    .line 41
    monitor-enter v3

    .line 42
    :try_start_0
    sget-object v4, La0/B;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 43
    .line 44
    monitor-exit v3

    .line 45
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, "]"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v1, v2}, Ld0/m;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lh0/G;->x:Lh0/c;

    .line 64
    .line 65
    invoke-virtual {v1}, Lh0/c;->b()V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lh0/G;->z:La0/z;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lh0/G;->A:La0/z;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lh0/G;->y:Lh0/g;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    iput-object v2, v1, Lh0/g;->c:Lh0/D;

    .line 82
    .line 83
    invoke-virtual {v1}, Lh0/g;->a()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lh0/g;->c(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lh0/G;->k:Lh0/N;

    .line 90
    .line 91
    monitor-enter v1

    .line 92
    :try_start_1
    iget-boolean v3, v1, Lh0/N;->N:Z

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v3, v1, Lh0/N;->v:Landroid/os/Looper;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    iget-object v3, v1, Lh0/N;->t:Ld0/t;

    .line 111
    .line 112
    const/4 v5, 0x7

    .line 113
    invoke-virtual {v3, v5}, Ld0/t;->e(I)Z

    .line 114
    .line 115
    .line 116
    new-instance v3, Lh0/p;

    .line 117
    .line 118
    const/4 v5, 0x3

    .line 119
    invoke-direct {v3, v1, v5}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 120
    .line 121
    .line 122
    iget-wide v5, v1, Lh0/N;->G:J

    .line 123
    .line 124
    invoke-virtual {v1, v3, v5, v6}, Lh0/N;->n0(Lh0/p;J)V

    .line 125
    .line 126
    .line 127
    iget-boolean v3, v1, Lh0/N;->N:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    monitor-exit v1

    .line 130
    goto :goto_1

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    :cond_1
    :goto_0
    monitor-exit v1

    .line 135
    move v3, v4

    .line 136
    :goto_1
    if-nez v3, :cond_2

    .line 137
    .line 138
    iget-object v1, p0, Lh0/G;->l:Ld0/l;

    .line 139
    .line 140
    new-instance v3, Lh0/y;

    .line 141
    .line 142
    invoke-direct {v3, v0}, Lh0/y;-><init>(I)V

    .line 143
    .line 144
    .line 145
    const/16 v0, 0xa

    .line 146
    .line 147
    invoke-virtual {v1, v0, v3}, Ld0/l;->e(ILd0/i;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    iget-object v0, p0, Lh0/G;->l:Ld0/l;

    .line 151
    .line 152
    invoke-virtual {v0}, Ld0/l;->d()V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lh0/G;->i:Ld0/t;

    .line 156
    .line 157
    iget-object v0, v0, Ld0/t;->a:Landroid/os/Handler;

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object v0, p0, Lh0/G;->t:LB0/e;

    .line 163
    .line 164
    iget-object v1, p0, Lh0/G;->r:Li0/c;

    .line 165
    .line 166
    check-cast v0, LB0/i;

    .line 167
    .line 168
    iget-object v0, v0, LB0/i;->b:LB0/d;

    .line 169
    .line 170
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_4

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, LB0/c;

    .line 189
    .line 190
    iget-object v6, v5, LB0/c;->b:Li0/c;

    .line 191
    .line 192
    if-ne v6, v1, :cond_3

    .line 193
    .line 194
    iput-boolean v4, v5, LB0/c;->c:Z

    .line 195
    .line 196
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 201
    .line 202
    iget-boolean v1, v0, Lh0/i0;->p:Z

    .line 203
    .line 204
    if-eqz v1, :cond_5

    .line 205
    .line 206
    invoke-virtual {v0}, Lh0/i0;->a()Lh0/i0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iput-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 211
    .line 212
    :cond_5
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 213
    .line 214
    invoke-virtual {v0, v4}, Lh0/i0;->g(I)Lh0/i0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 219
    .line 220
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iput-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 227
    .line 228
    iget-wide v5, v0, Lh0/i0;->s:J

    .line 229
    .line 230
    iput-wide v5, v0, Lh0/i0;->q:J

    .line 231
    .line 232
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 233
    .line 234
    const-wide/16 v5, 0x0

    .line 235
    .line 236
    iput-wide v5, v0, Lh0/i0;->r:J

    .line 237
    .line 238
    iget-object v0, p0, Lh0/G;->r:Li0/c;

    .line 239
    .line 240
    iget-object v1, v0, Li0/c;->s:Ld0/t;

    .line 241
    .line 242
    invoke-static {v1}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance v3, LA3/c;

    .line 246
    .line 247
    const/16 v5, 0xe

    .line 248
    .line 249
    invoke-direct {v3, v0, v5}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v3}, Ld0/t;->c(Ljava/lang/Runnable;)Z

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lh0/G;->h:LA0/z;

    .line 256
    .line 257
    check-cast v0, LA0/u;

    .line 258
    .line 259
    iget-object v3, v0, LA0/u;->c:Ljava/lang/Object;

    .line 260
    .line 261
    monitor-enter v3

    .line 262
    :try_start_2
    sget v1, Ld0/w;->a:I

    .line 263
    .line 264
    const/16 v5, 0x20

    .line 265
    .line 266
    if-lt v1, v5, :cond_7

    .line 267
    .line 268
    iget-object v1, v0, LA0/u;->h:LA0/p;

    .line 269
    .line 270
    if-eqz v1, :cond_7

    .line 271
    .line 272
    iget-object v5, v1, LA0/p;->d:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v5, LA0/o;

    .line 275
    .line 276
    if-eqz v5, :cond_7

    .line 277
    .line 278
    iget-object v6, v1, LA0/p;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v6, Landroid/os/Handler;

    .line 281
    .line 282
    if-nez v6, :cond_6

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_6
    iget-object v6, v1, LA0/p;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v6, Landroid/media/Spatializer;

    .line 288
    .line 289
    invoke-static {v6, v5}, LA0/n;->e(Landroid/media/Spatializer;LA0/o;)V

    .line 290
    .line 291
    .line 292
    iget-object v5, v1, LA0/p;->c:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Landroid/os/Handler;

    .line 295
    .line 296
    invoke-virtual {v5, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iput-object v2, v1, LA0/p;->c:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v2, v1, LA0/p;->d:Ljava/lang/Object;

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    goto :goto_4

    .line 306
    :cond_7
    :goto_3
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 307
    iput-object v2, v0, LA0/z;->a:Lh0/N;

    .line 308
    .line 309
    iput-object v2, v0, LA0/z;->b:LB0/e;

    .line 310
    .line 311
    invoke-virtual {p0}, Lh0/G;->N()V

    .line 312
    .line 313
    .line 314
    iget-object v0, p0, Lh0/G;->O:Landroid/view/Surface;

    .line 315
    .line 316
    if-eqz v0, :cond_8

    .line 317
    .line 318
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 319
    .line 320
    .line 321
    iput-object v2, p0, Lh0/G;->O:Landroid/view/Surface;

    .line 322
    .line 323
    :cond_8
    sget v0, Lc0/c;->b:I

    .line 324
    .line 325
    iput-boolean v4, p0, Lh0/G;->a0:Z

    .line 326
    .line 327
    return-void

    .line 328
    :goto_4
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 329
    throw v0

    .line 330
    :goto_5
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 331
    throw v0

    .line 332
    :catchall_2
    move-exception v0

    .line 333
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 334
    throw v0
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

.method public final M(II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lh0/G;->o:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v2, :cond_4

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lh0/G;->d0:Lh0/i0;

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lh0/G;->A(Lh0/i0;)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    invoke-virtual {p0, v2}, Lh0/G;->t(Lh0/i0;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    iget v3, p0, Lh0/G;->E:I

    .line 46
    .line 47
    add-int/2addr v3, v0

    .line 48
    iput v3, p0, Lh0/G;->E:I

    .line 49
    .line 50
    add-int/lit8 v3, p2, -0x1

    .line 51
    .line 52
    :goto_1
    if-lt v3, p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, -0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object v3, p0, Lh0/G;->I:Lx0/j0;

    .line 61
    .line 62
    check-cast v3, Lx0/i0;

    .line 63
    .line 64
    invoke-virtual {v3, p1, p2}, Lx0/i0;->c(II)Lx0/i0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput-object v3, p0, Lh0/G;->I:Lx0/j0;

    .line 69
    .line 70
    new-instance v11, Lh0/n0;

    .line 71
    .line 72
    iget-object v3, p0, Lh0/G;->I:Lx0/j0;

    .line 73
    .line 74
    invoke-direct {v11, v1, v3}, Lh0/n0;-><init>(Ljava/util/ArrayList;Lx0/j0;)V

    .line 75
    .line 76
    .line 77
    iget-object v4, v2, Lh0/i0;->a:La0/U;

    .line 78
    .line 79
    move-object v3, p0

    .line 80
    move-object v5, v11

    .line 81
    move v6, v9

    .line 82
    invoke-virtual/range {v3 .. v8}, Lh0/G;->C(La0/U;Lh0/n0;IJ)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p0, v2, v11, v1}, Lh0/G;->H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget v2, v1, Lh0/i0;->e:I

    .line 91
    .line 92
    if-eq v2, v0, :cond_3

    .line 93
    .line 94
    const/4 v3, 0x4

    .line 95
    if-eq v2, v3, :cond_3

    .line 96
    .line 97
    if-ge p1, p2, :cond_3

    .line 98
    .line 99
    if-ne p2, v10, :cond_3

    .line 100
    .line 101
    iget-object v2, v1, Lh0/i0;->a:La0/U;

    .line 102
    .line 103
    invoke-virtual {v2}, La0/U;->o()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-lt v9, v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Lh0/i0;->g(I)Lh0/i0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_3
    move-object v3, v1

    .line 114
    iget-object v1, p0, Lh0/G;->I:Lx0/j0;

    .line 115
    .line 116
    iget-object v2, p0, Lh0/G;->k:Lh0/N;

    .line 117
    .line 118
    iget-object v2, v2, Lh0/N;->t:Ld0/t;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget-object v2, v2, Ld0/t;->a:Landroid/os/Handler;

    .line 128
    .line 129
    const/16 v5, 0x14

    .line 130
    .line 131
    invoke-virtual {v2, v5, p1, p2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, v4, Ld0/s;->a:Landroid/os/Message;

    .line 136
    .line 137
    invoke-virtual {v4}, Ld0/s;->b()V

    .line 138
    .line 139
    .line 140
    iget-object p1, v3, Lh0/i0;->b:Lx0/H;

    .line 141
    .line 142
    iget-object p1, p1, Lx0/H;->a:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object p2, p0, Lh0/G;->d0:Lh0/i0;

    .line 145
    .line 146
    iget-object p2, p2, Lh0/i0;->b:Lx0/H;

    .line 147
    .line 148
    iget-object p2, p2, Lx0/H;->a:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    xor-int/lit8 v5, p1, 0x1

    .line 155
    .line 156
    invoke-virtual {p0, v3}, Lh0/G;->y(Lh0/i0;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    const/4 v4, 0x0

    .line 161
    const/4 v6, 0x4

    .line 162
    const/4 v9, -0x1

    .line 163
    const/4 v10, 0x0

    .line 164
    move-object v2, p0

    .line 165
    invoke-virtual/range {v2 .. v10}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_2
    return-void
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

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/G;->P:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lh0/G;->v:Lh0/D;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lh0/G;->P:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final O(IILjava/lang/Object;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lh0/G;->g:[Lh0/o0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_3

    .line 7
    .line 8
    aget-object v6, v0, v3

    .line 9
    .line 10
    const/4 v4, -0x1

    .line 11
    if-eq p1, v4, :cond_0

    .line 12
    .line 13
    invoke-interface {v6}, Lh0/o0;->getTrackType()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ne v5, p1, :cond_2

    .line 18
    .line 19
    :cond_0
    iget-object v5, p0, Lh0/G;->d0:Lh0/i0;

    .line 20
    .line 21
    invoke-virtual {p0, v5}, Lh0/G;->A(Lh0/i0;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    new-instance v11, Lh0/l0;

    .line 26
    .line 27
    iget-object v7, p0, Lh0/G;->d0:Lh0/i0;

    .line 28
    .line 29
    iget-object v7, v7, Lh0/i0;->a:La0/U;

    .line 30
    .line 31
    if-ne v5, v4, :cond_1

    .line 32
    .line 33
    move v8, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v8, v5

    .line 36
    :goto_1
    iget-object v5, p0, Lh0/G;->k:Lh0/N;

    .line 37
    .line 38
    iget-object v10, v5, Lh0/N;->v:Landroid/os/Looper;

    .line 39
    .line 40
    iget-object v9, p0, Lh0/G;->u:Ld0/r;

    .line 41
    .line 42
    move-object v4, v11

    .line 43
    invoke-direct/range {v4 .. v10}, Lh0/l0;-><init>(Lh0/j0;Lh0/o0;La0/U;ILd0/r;Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v4, v11, Lh0/l0;->g:Z

    .line 47
    .line 48
    xor-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 51
    .line 52
    .line 53
    iput p2, v11, Lh0/l0;->d:I

    .line 54
    .line 55
    iget-boolean v4, v11, Lh0/l0;->g:Z

    .line 56
    .line 57
    xor-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 60
    .line 61
    .line 62
    iput-object p3, v11, Lh0/l0;->e:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v11}, Lh0/l0;->c()V

    .line 65
    .line 66
    .line 67
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-void
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

.method public final P(La0/c;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lh0/G;->a0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lh0/G;->U:La0/c;

    .line 10
    .line 11
    sget v1, Ld0/w;->a:I

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    iget-object v2, p0, Lh0/G;->l:Ld0/l;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iput-object p1, p0, Lh0/G;->U:La0/c;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-virtual {p0, v1, v0, p1}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, LI2/g;

    .line 29
    .line 30
    const/4 v3, 0x7

    .line 31
    invoke-direct {v0, p1, v3}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    const/16 v3, 0x14

    .line 35
    .line 36
    invoke-virtual {v2, v3, v0}, Ld0/l;->c(ILd0/i;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    if-eqz p2, :cond_2

    .line 40
    .line 41
    move-object p2, p1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 p2, 0x0

    .line 44
    :goto_0
    iget-object v0, p0, Lh0/G;->y:Lh0/g;

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Lh0/g;->b(La0/c;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lh0/G;->h:LA0/z;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, LA0/z;->a(La0/c;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lh0/G;->D()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p0}, Lh0/G;->E()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-virtual {v0, p2, p1}, Lh0/g;->d(IZ)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/4 v0, -0x1

    .line 67
    if-ne p2, v0, :cond_3

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    :cond_3
    invoke-virtual {p0, p2, v1, p1}, Lh0/G;->a0(IIZ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ld0/l;->b()V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public final Q(Ljava/util/List;IJZ)V
    .locals 16

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    iget-object v1, v9, Lh0/G;->d0:Lh0/i0;

    .line 6
    .line 7
    invoke-virtual {v9, v1}, Lh0/G;->A(Lh0/i0;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual/range {p0 .. p0}, Lh0/G;->x()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget v4, v9, Lh0/G;->E:I

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    add-int/2addr v4, v5

    .line 19
    iput v4, v9, Lh0/G;->E:I

    .line 20
    .line 21
    iget-object v4, v9, Lh0/G;->o:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    add-int/lit8 v8, v6, -0x1

    .line 35
    .line 36
    :goto_0
    if-ltz v8, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v8, v8, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v8, v9, Lh0/G;->I:Lx0/j0;

    .line 45
    .line 46
    check-cast v8, Lx0/i0;

    .line 47
    .line 48
    invoke-virtual {v8, v7, v6}, Lx0/i0;->c(II)Lx0/i0;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iput-object v6, v9, Lh0/G;->I:Lx0/j0;

    .line 53
    .line 54
    :cond_1
    move-object/from16 v6, p1

    .line 55
    .line 56
    invoke-virtual {v9, v7, v6}, Lh0/G;->p(ILjava/util/List;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    new-instance v6, Lh0/n0;

    .line 61
    .line 62
    iget-object v8, v9, Lh0/G;->I:Lx0/j0;

    .line 63
    .line 64
    invoke-direct {v6, v4, v8}, Lh0/n0;-><init>(Ljava/util/ArrayList;Lx0/j0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6}, La0/U;->p()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iget v8, v6, Lh0/n0;->e:I

    .line 72
    .line 73
    if-nez v4, :cond_3

    .line 74
    .line 75
    if-ge v0, v8, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    new-instance v0, LX3/n;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_3
    :goto_1
    const/4 v4, -0x1

    .line 85
    if-eqz p5, :cond_4

    .line 86
    .line 87
    iget-boolean v0, v9, Lh0/G;->D:Z

    .line 88
    .line 89
    invoke-virtual {v6, v0}, Lh0/a;->a(Z)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    :goto_2
    move v13, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    if-ne v0, v4, :cond_5

    .line 101
    .line 102
    move v13, v1

    .line 103
    move-wide v1, v2

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    move-wide/from16 v1, p3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :goto_3
    iget-object v0, v9, Lh0/G;->d0:Lh0/i0;

    .line 109
    .line 110
    invoke-virtual {v9, v6, v13, v1, v2}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v9, v0, v6, v3}, Lh0/G;->H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget v3, v0, Lh0/i0;->e:I

    .line 119
    .line 120
    if-eq v13, v4, :cond_8

    .line 121
    .line 122
    if-eq v3, v5, :cond_8

    .line 123
    .line 124
    invoke-virtual {v6}, La0/U;->p()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_7

    .line 129
    .line 130
    if-lt v13, v8, :cond_6

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    const/4 v3, 0x2

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    :goto_4
    const/4 v3, 0x4

    .line 136
    :cond_8
    :goto_5
    invoke-virtual {v0, v3}, Lh0/i0;->g(I)Lh0/i0;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-static {v1, v2}, Ld0/w;->M(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v14

    .line 144
    iget-object v12, v9, Lh0/G;->I:Lx0/j0;

    .line 145
    .line 146
    iget-object v0, v9, Lh0/G;->k:Lh0/N;

    .line 147
    .line 148
    iget-object v0, v0, Lh0/N;->t:Ld0/t;

    .line 149
    .line 150
    new-instance v1, Lh0/I;

    .line 151
    .line 152
    move-object v10, v1

    .line 153
    invoke-direct/range {v10 .. v15}, Lh0/I;-><init>(Ljava/util/ArrayList;Lx0/j0;IJ)V

    .line 154
    .line 155
    .line 156
    const/16 v2, 0x11

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ld0/s;->b()V

    .line 163
    .line 164
    .line 165
    iget-object v0, v9, Lh0/G;->d0:Lh0/i0;

    .line 166
    .line 167
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 168
    .line 169
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 170
    .line 171
    iget-object v1, v3, Lh0/i0;->b:Lx0/H;

    .line 172
    .line 173
    iget-object v1, v1, Lx0/H;->a:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_9

    .line 180
    .line 181
    iget-object v0, v9, Lh0/G;->d0:Lh0/i0;

    .line 182
    .line 183
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 184
    .line 185
    invoke-virtual {v0}, La0/U;->p()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_9

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_9
    move v5, v7

    .line 193
    :goto_6
    invoke-virtual {v9, v3}, Lh0/G;->y(Lh0/i0;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const/4 v2, 0x0

    .line 198
    const/4 v4, 0x4

    .line 199
    const/4 v8, -0x1

    .line 200
    const/4 v10, 0x0

    .line 201
    move-object/from16 v0, p0

    .line 202
    .line 203
    move-object v1, v3

    .line 204
    move v3, v5

    .line 205
    move-wide v5, v6

    .line 206
    move v7, v8

    .line 207
    move v8, v10

    .line 208
    invoke-virtual/range {v0 .. v8}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 209
    .line 210
    .line 211
    return-void
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

.method public final R(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->y:Lh0/g;

    .line 5
    .line 6
    invoke-virtual {p0}, Lh0/G;->E()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1, p1}, Lh0/g;->d(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Lh0/G;->a0(IIZ)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final S(La0/J;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    iget-object v0, v0, Lh0/i0;->o:La0/J;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, La0/J;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lh0/i0;->f(La0/J;)Lh0/i0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, Lh0/G;->E:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lh0/G;->E:I

    .line 26
    .line 27
    iget-object v0, p0, Lh0/G;->k:Lh0/N;

    .line 28
    .line 29
    iget-object v0, v0, Lh0/N;->t:Ld0/t;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-virtual {v0, v1, p1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ld0/s;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x5

    .line 40
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v8, -0x1

    .line 48
    const/4 v9, 0x0

    .line 49
    move-object v1, p0

    .line 50
    invoke-virtual/range {v1 .. v9}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final T(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh0/G;->C:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lh0/G;->C:I

    .line 9
    .line 10
    iget-object v0, p0, Lh0/G;->k:Lh0/N;

    .line 11
    .line 12
    iget-object v0, v0, Lh0/N;->t:Ld0/t;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Ld0/t;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Ld0/s;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Ld0/s;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lh0/z;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lh0/z;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 p1, 0x8

    .line 41
    .line 42
    iget-object v1, p0, Lh0/G;->l:Ld0/l;

    .line 43
    .line 44
    invoke-virtual {v1, p1, v0}, Ld0/l;->c(ILd0/i;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lh0/G;->Z()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ld0/l;->b()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final U(Lx0/j0;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    move-object v0, p1

    .line 5
    check-cast v0, Lx0/i0;

    .line 6
    .line 7
    iget-object v0, v0, Lx0/i0;->b:[I

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    iget-object v1, p0, Lh0/G;->o:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    move v0, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-static {v0}, Ld0/m;->c(Z)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lh0/G;->I:Lx0/j0;

    .line 26
    .line 27
    new-instance v0, Lh0/n0;

    .line 28
    .line 29
    iget-object v2, p0, Lh0/G;->I:Lx0/j0;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Lh0/n0;-><init>(Ljava/util/ArrayList;Lx0/j0;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lh0/G;->d0:Lh0/i0;

    .line 35
    .line 36
    invoke-virtual {p0}, Lh0/G;->w()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0}, Lh0/G;->x()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-virtual {p0, v0, v2, v4, v5}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p0, v1, v0, v2}, Lh0/G;->H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget v0, p0, Lh0/G;->E:I

    .line 53
    .line 54
    add-int/2addr v0, v3

    .line 55
    iput v0, p0, Lh0/G;->E:I

    .line 56
    .line 57
    iget-object v0, p0, Lh0/G;->k:Lh0/N;

    .line 58
    .line 59
    iget-object v0, v0, Lh0/N;->t:Ld0/t;

    .line 60
    .line 61
    const/16 v1, 0x15

    .line 62
    .line 63
    invoke-virtual {v0, v1, p1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ld0/s;->b()V

    .line 68
    .line 69
    .line 70
    const/4 v8, 0x5

    .line 71
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v11, -0x1

    .line 79
    const/4 v12, 0x0

    .line 80
    move-object v4, p0

    .line 81
    invoke-virtual/range {v4 .. v12}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 82
    .line 83
    .line 84
    return-void
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

.method public final V(Landroid/view/Surface;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lh0/G;->g:[Lh0/o0;

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    if-ge v6, v4, :cond_2

    .line 17
    .line 18
    aget-object v11, v3, v6

    .line 19
    .line 20
    invoke-interface {v11}, Lh0/o0;->getTrackType()I

    .line 21
    .line 22
    .line 23
    move-result v9

    .line 24
    if-ne v9, v7, :cond_1

    .line 25
    .line 26
    iget-object v7, v0, Lh0/G;->d0:Lh0/i0;

    .line 27
    .line 28
    invoke-virtual {v0, v7}, Lh0/G;->A(Lh0/i0;)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    new-instance v15, Lh0/l0;

    .line 33
    .line 34
    iget-object v9, v0, Lh0/G;->d0:Lh0/i0;

    .line 35
    .line 36
    iget-object v12, v9, Lh0/i0;->a:La0/U;

    .line 37
    .line 38
    const/4 v9, -0x1

    .line 39
    if-ne v7, v9, :cond_0

    .line 40
    .line 41
    const/4 v13, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    move v13, v7

    .line 44
    :goto_1
    iget-object v10, v0, Lh0/G;->k:Lh0/N;

    .line 45
    .line 46
    iget-object v7, v10, Lh0/N;->v:Landroid/os/Looper;

    .line 47
    .line 48
    iget-object v14, v0, Lh0/G;->u:Ld0/r;

    .line 49
    .line 50
    move-object v9, v15

    .line 51
    move-object v5, v15

    .line 52
    move-object v15, v7

    .line 53
    invoke-direct/range {v9 .. v15}, Lh0/l0;-><init>(Lh0/j0;Lh0/o0;La0/U;ILd0/r;Landroid/os/Looper;)V

    .line 54
    .line 55
    .line 56
    iget-boolean v7, v5, Lh0/l0;->g:Z

    .line 57
    .line 58
    xor-int/2addr v7, v8

    .line 59
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 60
    .line 61
    .line 62
    iput v8, v5, Lh0/l0;->d:I

    .line 63
    .line 64
    iget-boolean v7, v5, Lh0/l0;->g:Z

    .line 65
    .line 66
    xor-int/2addr v7, v8

    .line 67
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 68
    .line 69
    .line 70
    iput-object v1, v5, Lh0/l0;->e:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {v5}, Lh0/l0;->c()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object v3, v0, Lh0/G;->N:Landroid/view/Surface;

    .line 82
    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    if-eq v3, v1, :cond_4

    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lh0/l0;

    .line 102
    .line 103
    iget-wide v4, v0, Lh0/G;->B:J

    .line 104
    .line 105
    invoke-virtual {v3, v4, v5}, Lh0/l0;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catch_0
    move v5, v8

    .line 110
    goto :goto_3

    .line 111
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 116
    .line 117
    .line 118
    :cond_3
    const/4 v5, 0x0

    .line 119
    :goto_3
    iget-object v2, v0, Lh0/G;->N:Landroid/view/Surface;

    .line 120
    .line 121
    iget-object v3, v0, Lh0/G;->O:Landroid/view/Surface;

    .line 122
    .line 123
    if-ne v2, v3, :cond_5

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 126
    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    iput-object v2, v0, Lh0/G;->O:Landroid/view/Surface;

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    const/4 v5, 0x0

    .line 133
    :cond_5
    :goto_4
    iput-object v1, v0, Lh0/G;->N:Landroid/view/Surface;

    .line 134
    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    new-instance v1, LA1/c;

    .line 138
    .line 139
    const-string v2, "Detaching surface timed out."

    .line 140
    .line 141
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lh0/o;

    .line 145
    .line 146
    const/16 v3, 0x3eb

    .line 147
    .line 148
    invoke-direct {v2, v7, v1, v3}, Lh0/o;-><init>(ILjava/lang/Exception;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Lh0/G;->Y(Lh0/o;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    return-void
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

.method public final W(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->N()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lh0/G;->V(Landroid/view/Surface;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    invoke-virtual {p0, p1, p1}, Lh0/G;->J(II)V

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

.method public final X(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Ld0/w;->h(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lh0/G;->V:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Lh0/G;->V:F

    .line 19
    .line 20
    iget-object v0, p0, Lh0/G;->y:Lh0/g;

    .line 21
    .line 22
    iget v0, v0, Lh0/g;->g:F

    .line 23
    .line 24
    mul-float/2addr v0, p1

    .line 25
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-virtual {p0, v1, v2, v0}, Lh0/G;->O(IILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lh0/w;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lh0/w;-><init>(F)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lh0/G;->l:Ld0/l;

    .line 40
    .line 41
    const/16 v1, 0x16

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Ld0/l;->e(ILd0/i;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public final Y(Lh0/o;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Lh0/i0;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Lh0/i0;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lh0/i0;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lh0/i0;->g(I)Lh0/i0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lh0/i0;->e(Lh0/o;)Lh0/i0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Lh0/G;->E:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lh0/G;->E:I

    .line 33
    .line 34
    iget-object p1, p0, Lh0/G;->k:Lh0/N;

    .line 35
    .line 36
    iget-object p1, p1, Lh0/N;->t:Ld0/t;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, Ld0/t;->a:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v0, Ld0/s;->a:Landroid/os/Message;

    .line 53
    .line 54
    invoke-virtual {v0}, Ld0/s;->b()V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x5

    .line 58
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v9, -0x1

    .line 66
    const/4 v10, 0x0

    .line 67
    move-object v2, p0

    .line 68
    invoke-virtual/range {v2 .. v10}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 69
    .line 70
    .line 71
    return-void
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

.method public final Z()V
    .locals 15

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lh0/G;->K:La0/K;

    .line 3
    .line 4
    sget v2, Ld0/w;->a:I

    .line 5
    .line 6
    iget-object v2, p0, Lh0/G;->f:La0/O;

    .line 7
    .line 8
    check-cast v2, Lh0/G;

    .line 9
    .line 10
    invoke-virtual {v2}, Lh0/G;->G()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4}, La0/U;->p()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x0

    .line 23
    const-wide/16 v7, 0x0

    .line 24
    .line 25
    iget-object v9, v2, LL0/e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, La0/T;

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {v4, v5, v9, v7, v8}, La0/U;->m(ILa0/T;J)La0/T;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-boolean v4, v4, La0/T;->h:Z

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    move v4, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v4, v6

    .line 46
    :goto_0
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, La0/U;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    const/4 v11, -0x1

    .line 55
    if-eqz v10, :cond_1

    .line 56
    .line 57
    move v5, v11

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    invoke-virtual {v2}, Lh0/G;->d0()V

    .line 64
    .line 65
    .line 66
    iget v12, v2, Lh0/G;->C:I

    .line 67
    .line 68
    if-ne v12, v0, :cond_2

    .line 69
    .line 70
    move v12, v6

    .line 71
    :cond_2
    invoke-virtual {v2}, Lh0/G;->d0()V

    .line 72
    .line 73
    .line 74
    iget-boolean v13, v2, Lh0/G;->D:Z

    .line 75
    .line 76
    invoke-virtual {v5, v10, v12, v13}, La0/U;->k(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    :goto_1
    if-eq v5, v11, :cond_3

    .line 81
    .line 82
    move v5, v0

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move v5, v6

    .line 85
    :goto_2
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v10}, La0/U;->p()Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-eqz v12, :cond_4

    .line 94
    .line 95
    move v10, v11

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    invoke-virtual {v2}, Lh0/G;->d0()V

    .line 102
    .line 103
    .line 104
    iget v13, v2, Lh0/G;->C:I

    .line 105
    .line 106
    if-ne v13, v0, :cond_5

    .line 107
    .line 108
    move v13, v6

    .line 109
    :cond_5
    invoke-virtual {v2}, Lh0/G;->d0()V

    .line 110
    .line 111
    .line 112
    iget-boolean v14, v2, Lh0/G;->D:Z

    .line 113
    .line 114
    invoke-virtual {v10, v12, v13, v14}, La0/U;->e(IIZ)I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    :goto_3
    if-eq v10, v11, :cond_6

    .line 119
    .line 120
    move v10, v0

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    move v10, v6

    .line 123
    :goto_4
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v11}, La0/U;->p()Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-nez v12, :cond_7

    .line 132
    .line 133
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    invoke-virtual {v11, v12, v9, v7, v8}, La0/U;->m(ILa0/T;J)La0/T;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-virtual {v11}, La0/T;->a()Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_7

    .line 146
    .line 147
    move v11, v0

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    move v11, v6

    .line 150
    :goto_5
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-virtual {v12}, La0/U;->p()Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-nez v13, :cond_8

    .line 159
    .line 160
    invoke-virtual {v2}, Lh0/G;->w()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-virtual {v12, v13, v9, v7, v8}, La0/U;->m(ILa0/T;J)La0/T;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    iget-boolean v7, v7, La0/T;->i:Z

    .line 169
    .line 170
    if-eqz v7, :cond_8

    .line 171
    .line 172
    move v7, v0

    .line 173
    goto :goto_6

    .line 174
    :cond_8
    move v7, v6

    .line 175
    :goto_6
    invoke-virtual {v2}, Lh0/G;->z()La0/U;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, La0/U;->p()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    new-instance v8, LB0/d;

    .line 184
    .line 185
    const/16 v9, 0x1b

    .line 186
    .line 187
    invoke-direct {v8, v9}, LB0/d;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iget-object v9, p0, Lh0/G;->c:La0/K;

    .line 191
    .line 192
    iget-object v9, v9, La0/K;->a:La0/n;

    .line 193
    .line 194
    iget-object v12, v8, LB0/d;->l:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v12, La0/m;

    .line 197
    .line 198
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move v13, v6

    .line 202
    :goto_7
    iget-object v14, v9, La0/n;->a:Landroid/util/SparseBooleanArray;

    .line 203
    .line 204
    invoke-virtual {v14}, Landroid/util/SparseBooleanArray;->size()I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    if-ge v13, v14, :cond_9

    .line 209
    .line 210
    invoke-virtual {v9, v13}, La0/n;->a(I)I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    invoke-virtual {v12, v14}, La0/m;->a(I)V

    .line 215
    .line 216
    .line 217
    add-int/2addr v13, v0

    .line 218
    goto :goto_7

    .line 219
    :cond_9
    xor-int/lit8 v9, v3, 0x1

    .line 220
    .line 221
    const/4 v13, 0x4

    .line 222
    invoke-virtual {v8, v13, v9}, LB0/d;->c(IZ)V

    .line 223
    .line 224
    .line 225
    if-eqz v4, :cond_a

    .line 226
    .line 227
    if-nez v3, :cond_a

    .line 228
    .line 229
    move v13, v0

    .line 230
    goto :goto_8

    .line 231
    :cond_a
    move v13, v6

    .line 232
    :goto_8
    const/4 v14, 0x5

    .line 233
    invoke-virtual {v8, v14, v13}, LB0/d;->c(IZ)V

    .line 234
    .line 235
    .line 236
    if-eqz v5, :cond_b

    .line 237
    .line 238
    if-nez v3, :cond_b

    .line 239
    .line 240
    move v13, v0

    .line 241
    goto :goto_9

    .line 242
    :cond_b
    move v13, v6

    .line 243
    :goto_9
    const/4 v14, 0x6

    .line 244
    invoke-virtual {v8, v14, v13}, LB0/d;->c(IZ)V

    .line 245
    .line 246
    .line 247
    if-nez v2, :cond_d

    .line 248
    .line 249
    if-nez v5, :cond_c

    .line 250
    .line 251
    if-eqz v11, :cond_c

    .line 252
    .line 253
    if-eqz v4, :cond_d

    .line 254
    .line 255
    :cond_c
    if-nez v3, :cond_d

    .line 256
    .line 257
    move v5, v0

    .line 258
    goto :goto_a

    .line 259
    :cond_d
    move v5, v6

    .line 260
    :goto_a
    const/4 v13, 0x7

    .line 261
    invoke-virtual {v8, v13, v5}, LB0/d;->c(IZ)V

    .line 262
    .line 263
    .line 264
    if-eqz v10, :cond_e

    .line 265
    .line 266
    if-nez v3, :cond_e

    .line 267
    .line 268
    move v5, v0

    .line 269
    goto :goto_b

    .line 270
    :cond_e
    move v5, v6

    .line 271
    :goto_b
    const/16 v13, 0x8

    .line 272
    .line 273
    invoke-virtual {v8, v13, v5}, LB0/d;->c(IZ)V

    .line 274
    .line 275
    .line 276
    if-nez v2, :cond_10

    .line 277
    .line 278
    if-nez v10, :cond_f

    .line 279
    .line 280
    if-eqz v11, :cond_10

    .line 281
    .line 282
    if-eqz v7, :cond_10

    .line 283
    .line 284
    :cond_f
    if-nez v3, :cond_10

    .line 285
    .line 286
    move v2, v0

    .line 287
    goto :goto_c

    .line 288
    :cond_10
    move v2, v6

    .line 289
    :goto_c
    const/16 v5, 0x9

    .line 290
    .line 291
    invoke-virtual {v8, v5, v2}, LB0/d;->c(IZ)V

    .line 292
    .line 293
    .line 294
    const/16 v2, 0xa

    .line 295
    .line 296
    invoke-virtual {v8, v2, v9}, LB0/d;->c(IZ)V

    .line 297
    .line 298
    .line 299
    if-eqz v4, :cond_11

    .line 300
    .line 301
    if-nez v3, :cond_11

    .line 302
    .line 303
    move v2, v0

    .line 304
    goto :goto_d

    .line 305
    :cond_11
    move v2, v6

    .line 306
    :goto_d
    const/16 v5, 0xb

    .line 307
    .line 308
    invoke-virtual {v8, v5, v2}, LB0/d;->c(IZ)V

    .line 309
    .line 310
    .line 311
    if-eqz v4, :cond_12

    .line 312
    .line 313
    if-nez v3, :cond_12

    .line 314
    .line 315
    goto :goto_e

    .line 316
    :cond_12
    move v0, v6

    .line 317
    :goto_e
    const/16 v2, 0xc

    .line 318
    .line 319
    invoke-virtual {v8, v2, v0}, LB0/d;->c(IZ)V

    .line 320
    .line 321
    .line 322
    new-instance v0, La0/K;

    .line 323
    .line 324
    invoke-virtual {v12}, La0/m;->b()La0/n;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-direct {v0, v2}, La0/K;-><init>(La0/n;)V

    .line 329
    .line 330
    .line 331
    iput-object v0, p0, Lh0/G;->K:La0/K;

    .line 332
    .line 333
    invoke-virtual {v0, v1}, La0/K;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_13

    .line 338
    .line 339
    new-instance v0, Lh0/A;

    .line 340
    .line 341
    invoke-direct {v0, p0}, Lh0/A;-><init>(Lh0/G;)V

    .line 342
    .line 343
    .line 344
    iget-object v1, p0, Lh0/G;->l:Ld0/l;

    .line 345
    .line 346
    const/16 v2, 0xd

    .line 347
    .line 348
    invoke-virtual {v1, v2, v0}, Ld0/l;->c(ILd0/i;)V

    .line 349
    .line 350
    .line 351
    :cond_13
    return-void
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

.method public final a0(IIZ)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p3, -0x1

    .line 6
    if-eq p1, p3, :cond_0

    .line 7
    .line 8
    move p3, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p3, v0

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move v0, v1

    .line 14
    :cond_1
    iget-object p1, p0, Lh0/G;->d0:Lh0/i0;

    .line 15
    .line 16
    iget-boolean v1, p1, Lh0/i0;->l:Z

    .line 17
    .line 18
    if-ne v1, p3, :cond_2

    .line 19
    .line 20
    iget v1, p1, Lh0/i0;->n:I

    .line 21
    .line 22
    if-ne v1, v0, :cond_2

    .line 23
    .line 24
    iget p1, p1, Lh0/i0;->m:I

    .line 25
    .line 26
    if-ne p1, p2, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget p1, p0, Lh0/G;->E:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    add-int/2addr p1, v1

    .line 33
    iput p1, p0, Lh0/G;->E:I

    .line 34
    .line 35
    iget-object p1, p0, Lh0/G;->d0:Lh0/i0;

    .line 36
    .line 37
    iget-boolean v2, p1, Lh0/i0;->p:Z

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, Lh0/i0;->a()Lh0/i0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :cond_3
    invoke-virtual {p1, p2, v0, p3}, Lh0/i0;->d(IIZ)Lh0/i0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    shl-int/lit8 p1, v0, 0x4

    .line 50
    .line 51
    or-int/2addr p1, p2

    .line 52
    iget-object p2, p0, Lh0/G;->k:Lh0/N;

    .line 53
    .line 54
    iget-object p2, p2, Lh0/N;->t:Ld0/t;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object p2, p2, Ld0/t;->a:Landroid/os/Handler;

    .line 64
    .line 65
    invoke-virtual {p2, v1, p3, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, v0, Ld0/s;->a:Landroid/os/Message;

    .line 70
    .line 71
    invoke-virtual {v0}, Ld0/s;->b()V

    .line 72
    .line 73
    .line 74
    const/4 v6, 0x5

    .line 75
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v9, -0x1

    .line 83
    const/4 v10, 0x0

    .line 84
    move-object v2, p0

    .line 85
    invoke-virtual/range {v2 .. v10}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 86
    .line 87
    .line 88
    return-void
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

.method public final b0(Lh0/i0;IZIJIZ)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lh0/G;->d0:Lh0/i0;

    .line 8
    .line 9
    iput-object v1, v0, Lh0/G;->d0:Lh0/i0;

    .line 10
    .line 11
    iget-object v4, v3, Lh0/i0;->a:La0/U;

    .line 12
    .line 13
    iget-object v5, v1, Lh0/i0;->a:La0/U;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, La0/U;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v3, Lh0/i0;->a:La0/U;

    .line 20
    .line 21
    iget-object v6, v1, Lh0/i0;->a:La0/U;

    .line 22
    .line 23
    invoke-virtual {v6}, La0/U;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, -0x1

    .line 28
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const/4 v10, 0x1

    .line 33
    const/4 v12, 0x3

    .line 34
    const-wide/16 v13, 0x0

    .line 35
    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    invoke-virtual {v5}, La0/U;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_0

    .line 43
    .line 44
    new-instance v5, Landroid/util/Pair;

    .line 45
    .line 46
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v6}, La0/U;->p()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-virtual {v5}, La0/U;->p()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eq v7, v8, :cond_1

    .line 62
    .line 63
    new-instance v5, Landroid/util/Pair;

    .line 64
    .line 65
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_1
    iget-object v7, v3, Lh0/i0;->b:Lx0/H;

    .line 77
    .line 78
    iget-object v8, v7, Lx0/H;->a:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v12, v0, Lh0/G;->n:La0/S;

    .line 81
    .line 82
    invoke-virtual {v5, v8, v12}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget v8, v8, La0/S;->c:I

    .line 87
    .line 88
    iget-object v11, v0, LL0/e;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v11, La0/T;

    .line 91
    .line 92
    invoke-virtual {v5, v8, v11, v13, v14}, La0/U;->m(ILa0/T;J)La0/T;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    iget-object v5, v5, La0/T;->a:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v8, v1, Lh0/i0;->b:Lx0/H;

    .line 99
    .line 100
    iget-object v15, v8, Lx0/H;->a:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v6, v15, v12}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    iget v12, v12, La0/S;->c:I

    .line 107
    .line 108
    invoke-virtual {v6, v12, v11, v13, v14}, La0/U;->m(ILa0/T;J)La0/T;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    iget-object v6, v6, La0/T;->a:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-nez v5, :cond_5

    .line 119
    .line 120
    if-eqz p3, :cond_2

    .line 121
    .line 122
    if-nez v2, :cond_2

    .line 123
    .line 124
    move v5, v10

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    if-eqz p3, :cond_3

    .line 127
    .line 128
    if-ne v2, v10, :cond_3

    .line 129
    .line 130
    const/4 v5, 0x2

    .line 131
    goto :goto_0

    .line 132
    :cond_3
    if-nez v4, :cond_4

    .line 133
    .line 134
    const/4 v5, 0x3

    .line 135
    :goto_0
    new-instance v6, Landroid/util/Pair;

    .line 136
    .line 137
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v5, v6

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :cond_5
    if-eqz p3, :cond_6

    .line 155
    .line 156
    if-nez v2, :cond_6

    .line 157
    .line 158
    iget-wide v5, v7, Lx0/H;->d:J

    .line 159
    .line 160
    iget-wide v7, v8, Lx0/H;->d:J

    .line 161
    .line 162
    cmp-long v5, v5, v7

    .line 163
    .line 164
    if-gez v5, :cond_6

    .line 165
    .line 166
    new-instance v5, Landroid/util/Pair;

    .line 167
    .line 168
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_6
    if-eqz p3, :cond_7

    .line 180
    .line 181
    if-ne v2, v10, :cond_7

    .line 182
    .line 183
    if-eqz p8, :cond_7

    .line 184
    .line 185
    new-instance v5, Landroid/util/Pair;

    .line 186
    .line 187
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    const/4 v7, 0x2

    .line 190
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_7
    new-instance v5, Landroid/util/Pair;

    .line 199
    .line 200
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :goto_1
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v6, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v5, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-eqz v6, :cond_9

    .line 222
    .line 223
    iget-object v8, v1, Lh0/i0;->a:La0/U;

    .line 224
    .line 225
    invoke-virtual {v8}, La0/U;->p()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-nez v8, :cond_8

    .line 230
    .line 231
    iget-object v8, v1, Lh0/i0;->a:La0/U;

    .line 232
    .line 233
    iget-object v9, v1, Lh0/i0;->b:Lx0/H;

    .line 234
    .line 235
    iget-object v9, v9, Lx0/H;->a:Ljava/lang/Object;

    .line 236
    .line 237
    iget-object v11, v0, Lh0/G;->n:La0/S;

    .line 238
    .line 239
    invoke-virtual {v8, v9, v11}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    iget v8, v8, La0/S;->c:I

    .line 244
    .line 245
    iget-object v9, v1, Lh0/i0;->a:La0/U;

    .line 246
    .line 247
    iget-object v11, v0, LL0/e;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v11, La0/T;

    .line 250
    .line 251
    invoke-virtual {v9, v8, v11, v13, v14}, La0/U;->m(ILa0/T;J)La0/T;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    iget-object v8, v8, La0/T;->c:La0/A;

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    const/4 v8, 0x0

    .line 259
    :goto_2
    sget-object v9, La0/D;->B:La0/D;

    .line 260
    .line 261
    iput-object v9, v0, Lh0/G;->c0:La0/D;

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_9
    const/4 v8, 0x0

    .line 265
    :goto_3
    if-nez v6, :cond_a

    .line 266
    .line 267
    iget-object v9, v3, Lh0/i0;->j:Ljava/util/List;

    .line 268
    .line 269
    iget-object v11, v1, Lh0/i0;->j:Ljava/util/List;

    .line 270
    .line 271
    invoke-interface {v9, v11}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-nez v9, :cond_d

    .line 276
    .line 277
    :cond_a
    iget-object v9, v0, Lh0/G;->c0:La0/D;

    .line 278
    .line 279
    invoke-virtual {v9}, La0/D;->a()La0/C;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    iget-object v11, v1, Lh0/i0;->j:Ljava/util/List;

    .line 284
    .line 285
    const/4 v12, 0x0

    .line 286
    :goto_4
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v15

    .line 290
    if-ge v12, v15, :cond_c

    .line 291
    .line 292
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v15

    .line 296
    check-cast v15, La0/F;

    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    :goto_5
    iget-object v10, v15, La0/F;->l:[La0/E;

    .line 300
    .line 301
    array-length v13, v10

    .line 302
    if-ge v7, v13, :cond_b

    .line 303
    .line 304
    aget-object v10, v10, v7

    .line 305
    .line 306
    invoke-interface {v10, v9}, La0/E;->b(La0/C;)V

    .line 307
    .line 308
    .line 309
    add-int/lit8 v7, v7, 0x1

    .line 310
    .line 311
    const-wide/16 v13, 0x0

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 315
    .line 316
    const/4 v10, 0x1

    .line 317
    const-wide/16 v13, 0x0

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    new-instance v7, La0/D;

    .line 321
    .line 322
    invoke-direct {v7, v9}, La0/D;-><init>(La0/C;)V

    .line 323
    .line 324
    .line 325
    iput-object v7, v0, Lh0/G;->c0:La0/D;

    .line 326
    .line 327
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lh0/G;->r()La0/D;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    iget-object v9, v0, Lh0/G;->L:La0/D;

    .line 332
    .line 333
    invoke-virtual {v7, v9}, La0/D;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    iput-object v7, v0, Lh0/G;->L:La0/D;

    .line 338
    .line 339
    iget-boolean v7, v3, Lh0/i0;->l:Z

    .line 340
    .line 341
    iget-boolean v10, v1, Lh0/i0;->l:Z

    .line 342
    .line 343
    if-eq v7, v10, :cond_e

    .line 344
    .line 345
    const/4 v7, 0x1

    .line 346
    goto :goto_6

    .line 347
    :cond_e
    const/4 v7, 0x0

    .line 348
    :goto_6
    iget v10, v3, Lh0/i0;->e:I

    .line 349
    .line 350
    iget v11, v1, Lh0/i0;->e:I

    .line 351
    .line 352
    if-eq v10, v11, :cond_f

    .line 353
    .line 354
    const/4 v10, 0x1

    .line 355
    goto :goto_7

    .line 356
    :cond_f
    const/4 v10, 0x0

    .line 357
    :goto_7
    if-nez v10, :cond_10

    .line 358
    .line 359
    if-eqz v7, :cond_11

    .line 360
    .line 361
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lh0/G;->c0()V

    .line 362
    .line 363
    .line 364
    :cond_11
    iget-boolean v11, v3, Lh0/i0;->g:Z

    .line 365
    .line 366
    iget-boolean v12, v1, Lh0/i0;->g:Z

    .line 367
    .line 368
    if-eq v11, v12, :cond_12

    .line 369
    .line 370
    const/4 v11, 0x1

    .line 371
    goto :goto_8

    .line 372
    :cond_12
    const/4 v11, 0x0

    .line 373
    :goto_8
    if-nez v4, :cond_13

    .line 374
    .line 375
    iget-object v4, v0, Lh0/G;->l:Ld0/l;

    .line 376
    .line 377
    new-instance v12, Lh0/t;

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    move/from16 v14, p2

    .line 381
    .line 382
    invoke-direct {v12, v14, v13, v1}, Lh0/t;-><init>(IILjava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    invoke-virtual {v4, v13, v12}, Ld0/l;->c(ILd0/i;)V

    .line 387
    .line 388
    .line 389
    :cond_13
    if-eqz p3, :cond_1b

    .line 390
    .line 391
    new-instance v4, La0/S;

    .line 392
    .line 393
    invoke-direct {v4}, La0/S;-><init>()V

    .line 394
    .line 395
    .line 396
    iget-object v12, v3, Lh0/i0;->a:La0/U;

    .line 397
    .line 398
    invoke-virtual {v12}, La0/U;->p()Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-nez v12, :cond_14

    .line 403
    .line 404
    iget-object v12, v3, Lh0/i0;->b:Lx0/H;

    .line 405
    .line 406
    iget-object v12, v12, Lx0/H;->a:Ljava/lang/Object;

    .line 407
    .line 408
    iget-object v13, v3, Lh0/i0;->a:La0/U;

    .line 409
    .line 410
    invoke-virtual {v13, v12, v4}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 411
    .line 412
    .line 413
    iget v13, v4, La0/S;->c:I

    .line 414
    .line 415
    iget-object v14, v3, Lh0/i0;->a:La0/U;

    .line 416
    .line 417
    invoke-virtual {v14, v12}, La0/U;->b(Ljava/lang/Object;)I

    .line 418
    .line 419
    .line 420
    move-result v14

    .line 421
    iget-object v15, v3, Lh0/i0;->a:La0/U;

    .line 422
    .line 423
    move-object/from16 v16, v12

    .line 424
    .line 425
    iget-object v12, v0, LL0/e;->a:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v12, La0/T;

    .line 428
    .line 429
    move/from16 v17, v10

    .line 430
    .line 431
    move/from16 v18, v11

    .line 432
    .line 433
    const-wide/16 v10, 0x0

    .line 434
    .line 435
    invoke-virtual {v15, v13, v12, v10, v11}, La0/U;->m(ILa0/T;J)La0/T;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    iget-object v10, v12, La0/T;->a:Ljava/lang/Object;

    .line 440
    .line 441
    iget-object v11, v0, LL0/e;->a:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v11, La0/T;

    .line 444
    .line 445
    iget-object v11, v11, La0/T;->c:La0/A;

    .line 446
    .line 447
    move-object/from16 v20, v10

    .line 448
    .line 449
    move-object/from16 v22, v11

    .line 450
    .line 451
    move/from16 v21, v13

    .line 452
    .line 453
    move/from16 v24, v14

    .line 454
    .line 455
    move-object/from16 v23, v16

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_14
    move/from16 v17, v10

    .line 459
    .line 460
    move/from16 v18, v11

    .line 461
    .line 462
    move/from16 v21, p7

    .line 463
    .line 464
    const/16 v20, 0x0

    .line 465
    .line 466
    const/16 v22, 0x0

    .line 467
    .line 468
    const/16 v23, 0x0

    .line 469
    .line 470
    const/16 v24, -0x1

    .line 471
    .line 472
    :goto_9
    if-nez v2, :cond_17

    .line 473
    .line 474
    iget-object v10, v3, Lh0/i0;->b:Lx0/H;

    .line 475
    .line 476
    invoke-virtual {v10}, Lx0/H;->b()Z

    .line 477
    .line 478
    .line 479
    move-result v10

    .line 480
    if-eqz v10, :cond_15

    .line 481
    .line 482
    iget-object v10, v3, Lh0/i0;->b:Lx0/H;

    .line 483
    .line 484
    iget v11, v10, Lx0/H;->b:I

    .line 485
    .line 486
    iget v10, v10, Lx0/H;->c:I

    .line 487
    .line 488
    invoke-virtual {v4, v11, v10}, La0/S;->a(II)J

    .line 489
    .line 490
    .line 491
    move-result-wide v10

    .line 492
    invoke-static {v3}, Lh0/G;->F(Lh0/i0;)J

    .line 493
    .line 494
    .line 495
    move-result-wide v12

    .line 496
    goto :goto_c

    .line 497
    :cond_15
    iget-object v10, v3, Lh0/i0;->b:Lx0/H;

    .line 498
    .line 499
    iget v10, v10, Lx0/H;->e:I

    .line 500
    .line 501
    const/4 v11, -0x1

    .line 502
    if-eq v10, v11, :cond_16

    .line 503
    .line 504
    iget-object v4, v0, Lh0/G;->d0:Lh0/i0;

    .line 505
    .line 506
    invoke-static {v4}, Lh0/G;->F(Lh0/i0;)J

    .line 507
    .line 508
    .line 509
    move-result-wide v10

    .line 510
    :goto_a
    move-wide v12, v10

    .line 511
    goto :goto_c

    .line 512
    :cond_16
    iget-wide v10, v4, La0/S;->e:J

    .line 513
    .line 514
    iget-wide v12, v4, La0/S;->d:J

    .line 515
    .line 516
    :goto_b
    add-long/2addr v10, v12

    .line 517
    goto :goto_a

    .line 518
    :cond_17
    iget-object v10, v3, Lh0/i0;->b:Lx0/H;

    .line 519
    .line 520
    invoke-virtual {v10}, Lx0/H;->b()Z

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    if-eqz v10, :cond_18

    .line 525
    .line 526
    iget-wide v10, v3, Lh0/i0;->s:J

    .line 527
    .line 528
    invoke-static {v3}, Lh0/G;->F(Lh0/i0;)J

    .line 529
    .line 530
    .line 531
    move-result-wide v12

    .line 532
    goto :goto_c

    .line 533
    :cond_18
    iget-wide v10, v4, La0/S;->e:J

    .line 534
    .line 535
    iget-wide v12, v3, Lh0/i0;->s:J

    .line 536
    .line 537
    goto :goto_b

    .line 538
    :goto_c
    new-instance v4, La0/N;

    .line 539
    .line 540
    invoke-static {v10, v11}, Ld0/w;->Z(J)J

    .line 541
    .line 542
    .line 543
    move-result-wide v25

    .line 544
    invoke-static {v12, v13}, Ld0/w;->Z(J)J

    .line 545
    .line 546
    .line 547
    move-result-wide v27

    .line 548
    iget-object v10, v3, Lh0/i0;->b:Lx0/H;

    .line 549
    .line 550
    iget v11, v10, Lx0/H;->b:I

    .line 551
    .line 552
    iget v10, v10, Lx0/H;->c:I

    .line 553
    .line 554
    move-object/from16 v19, v4

    .line 555
    .line 556
    move/from16 v29, v11

    .line 557
    .line 558
    move/from16 v30, v10

    .line 559
    .line 560
    invoke-direct/range {v19 .. v30}, La0/N;-><init>(Ljava/lang/Object;ILa0/A;Ljava/lang/Object;IJJII)V

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {p0 .. p0}, Lh0/G;->w()I

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    iget-object v11, v0, Lh0/G;->d0:Lh0/i0;

    .line 568
    .line 569
    iget-object v11, v11, Lh0/i0;->a:La0/U;

    .line 570
    .line 571
    invoke-virtual {v11}, La0/U;->p()Z

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    if-nez v11, :cond_19

    .line 576
    .line 577
    iget-object v11, v0, Lh0/G;->d0:Lh0/i0;

    .line 578
    .line 579
    iget-object v12, v11, Lh0/i0;->b:Lx0/H;

    .line 580
    .line 581
    iget-object v12, v12, Lx0/H;->a:Ljava/lang/Object;

    .line 582
    .line 583
    iget-object v11, v11, Lh0/i0;->a:La0/U;

    .line 584
    .line 585
    iget-object v13, v0, Lh0/G;->n:La0/S;

    .line 586
    .line 587
    invoke-virtual {v11, v12, v13}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 588
    .line 589
    .line 590
    iget-object v11, v0, Lh0/G;->d0:Lh0/i0;

    .line 591
    .line 592
    iget-object v11, v11, Lh0/i0;->a:La0/U;

    .line 593
    .line 594
    invoke-virtual {v11, v12}, La0/U;->b(Ljava/lang/Object;)I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    iget-object v13, v0, Lh0/G;->d0:Lh0/i0;

    .line 599
    .line 600
    iget-object v13, v13, Lh0/i0;->a:La0/U;

    .line 601
    .line 602
    iget-object v14, v0, LL0/e;->a:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v14, La0/T;

    .line 605
    .line 606
    move/from16 p2, v11

    .line 607
    .line 608
    move-object v15, v12

    .line 609
    const-wide/16 v11, 0x0

    .line 610
    .line 611
    invoke-virtual {v13, v10, v14, v11, v12}, La0/U;->m(ILa0/T;J)La0/T;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    iget-object v11, v11, La0/T;->a:Ljava/lang/Object;

    .line 616
    .line 617
    iget-object v12, v14, La0/T;->c:La0/A;

    .line 618
    .line 619
    move/from16 v34, p2

    .line 620
    .line 621
    move-object/from16 v30, v11

    .line 622
    .line 623
    move-object/from16 v32, v12

    .line 624
    .line 625
    move-object/from16 v33, v15

    .line 626
    .line 627
    goto :goto_d

    .line 628
    :cond_19
    const/16 v30, 0x0

    .line 629
    .line 630
    const/16 v32, 0x0

    .line 631
    .line 632
    const/16 v33, 0x0

    .line 633
    .line 634
    const/16 v34, -0x1

    .line 635
    .line 636
    :goto_d
    invoke-static/range {p5 .. p6}, Ld0/w;->Z(J)J

    .line 637
    .line 638
    .line 639
    move-result-wide v35

    .line 640
    new-instance v11, La0/N;

    .line 641
    .line 642
    iget-object v12, v0, Lh0/G;->d0:Lh0/i0;

    .line 643
    .line 644
    iget-object v12, v12, Lh0/i0;->b:Lx0/H;

    .line 645
    .line 646
    invoke-virtual {v12}, Lx0/H;->b()Z

    .line 647
    .line 648
    .line 649
    move-result v12

    .line 650
    if-eqz v12, :cond_1a

    .line 651
    .line 652
    iget-object v12, v0, Lh0/G;->d0:Lh0/i0;

    .line 653
    .line 654
    invoke-static {v12}, Lh0/G;->F(Lh0/i0;)J

    .line 655
    .line 656
    .line 657
    move-result-wide v12

    .line 658
    invoke-static {v12, v13}, Ld0/w;->Z(J)J

    .line 659
    .line 660
    .line 661
    move-result-wide v12

    .line 662
    move-wide/from16 v37, v12

    .line 663
    .line 664
    goto :goto_e

    .line 665
    :cond_1a
    move-wide/from16 v37, v35

    .line 666
    .line 667
    :goto_e
    iget-object v12, v0, Lh0/G;->d0:Lh0/i0;

    .line 668
    .line 669
    iget-object v12, v12, Lh0/i0;->b:Lx0/H;

    .line 670
    .line 671
    iget v13, v12, Lx0/H;->b:I

    .line 672
    .line 673
    iget v12, v12, Lx0/H;->c:I

    .line 674
    .line 675
    move-object/from16 v29, v11

    .line 676
    .line 677
    move/from16 v31, v10

    .line 678
    .line 679
    move/from16 v39, v13

    .line 680
    .line 681
    move/from16 v40, v12

    .line 682
    .line 683
    invoke-direct/range {v29 .. v40}, La0/N;-><init>(Ljava/lang/Object;ILa0/A;Ljava/lang/Object;IJJII)V

    .line 684
    .line 685
    .line 686
    iget-object v10, v0, Lh0/G;->l:Ld0/l;

    .line 687
    .line 688
    new-instance v12, Lh0/B;

    .line 689
    .line 690
    invoke-direct {v12, v4, v11, v2}, Lh0/B;-><init>(La0/N;La0/N;I)V

    .line 691
    .line 692
    .line 693
    const/16 v2, 0xb

    .line 694
    .line 695
    invoke-virtual {v10, v2, v12}, Ld0/l;->c(ILd0/i;)V

    .line 696
    .line 697
    .line 698
    goto :goto_f

    .line 699
    :cond_1b
    move/from16 v17, v10

    .line 700
    .line 701
    move/from16 v18, v11

    .line 702
    .line 703
    :goto_f
    if-eqz v6, :cond_1c

    .line 704
    .line 705
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 706
    .line 707
    new-instance v4, Lh0/t;

    .line 708
    .line 709
    const/4 v6, 0x1

    .line 710
    invoke-direct {v4, v5, v6, v8}, Lh0/t;-><init>(IILjava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    const/4 v5, 0x1

    .line 714
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 715
    .line 716
    .line 717
    :cond_1c
    iget-object v2, v3, Lh0/i0;->f:Lh0/o;

    .line 718
    .line 719
    iget-object v4, v1, Lh0/i0;->f:Lh0/o;

    .line 720
    .line 721
    if-eq v2, v4, :cond_1d

    .line 722
    .line 723
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 724
    .line 725
    new-instance v4, Lh0/u;

    .line 726
    .line 727
    const/4 v5, 0x7

    .line 728
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 729
    .line 730
    .line 731
    const/16 v5, 0xa

    .line 732
    .line 733
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 734
    .line 735
    .line 736
    iget-object v2, v1, Lh0/i0;->f:Lh0/o;

    .line 737
    .line 738
    if-eqz v2, :cond_1d

    .line 739
    .line 740
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 741
    .line 742
    new-instance v4, Lh0/u;

    .line 743
    .line 744
    const/16 v6, 0x8

    .line 745
    .line 746
    invoke-direct {v4, v1, v6}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 750
    .line 751
    .line 752
    :cond_1d
    iget-object v2, v3, Lh0/i0;->i:LA0/A;

    .line 753
    .line 754
    iget-object v4, v1, Lh0/i0;->i:LA0/A;

    .line 755
    .line 756
    if-eq v2, v4, :cond_1e

    .line 757
    .line 758
    iget-object v2, v0, Lh0/G;->h:LA0/z;

    .line 759
    .line 760
    iget-object v4, v4, LA0/A;->e:LA0/y;

    .line 761
    .line 762
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 766
    .line 767
    new-instance v4, Lh0/u;

    .line 768
    .line 769
    const/16 v5, 0x9

    .line 770
    .line 771
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 772
    .line 773
    .line 774
    const/4 v5, 0x2

    .line 775
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 776
    .line 777
    .line 778
    :cond_1e
    if-nez v9, :cond_1f

    .line 779
    .line 780
    iget-object v2, v0, Lh0/G;->L:La0/D;

    .line 781
    .line 782
    iget-object v4, v0, Lh0/G;->l:Ld0/l;

    .line 783
    .line 784
    new-instance v5, LI2/g;

    .line 785
    .line 786
    const/4 v6, 0x6

    .line 787
    invoke-direct {v5, v2, v6}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 788
    .line 789
    .line 790
    const/16 v2, 0xe

    .line 791
    .line 792
    invoke-virtual {v4, v2, v5}, Ld0/l;->c(ILd0/i;)V

    .line 793
    .line 794
    .line 795
    :cond_1f
    if-eqz v18, :cond_20

    .line 796
    .line 797
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 798
    .line 799
    new-instance v4, Lh0/u;

    .line 800
    .line 801
    const/4 v5, 0x0

    .line 802
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 803
    .line 804
    .line 805
    const/4 v5, 0x3

    .line 806
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 807
    .line 808
    .line 809
    :cond_20
    if-nez v17, :cond_21

    .line 810
    .line 811
    if-eqz v7, :cond_22

    .line 812
    .line 813
    :cond_21
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 814
    .line 815
    new-instance v4, Lh0/u;

    .line 816
    .line 817
    const/4 v5, 0x1

    .line 818
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 819
    .line 820
    .line 821
    const/4 v5, -0x1

    .line 822
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 823
    .line 824
    .line 825
    :cond_22
    if-eqz v17, :cond_23

    .line 826
    .line 827
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 828
    .line 829
    new-instance v4, Lh0/u;

    .line 830
    .line 831
    const/4 v5, 0x2

    .line 832
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 833
    .line 834
    .line 835
    const/4 v5, 0x4

    .line 836
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 837
    .line 838
    .line 839
    :cond_23
    if-nez v7, :cond_24

    .line 840
    .line 841
    iget v2, v3, Lh0/i0;->m:I

    .line 842
    .line 843
    iget v4, v1, Lh0/i0;->m:I

    .line 844
    .line 845
    if-eq v2, v4, :cond_25

    .line 846
    .line 847
    :cond_24
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 848
    .line 849
    new-instance v4, Lh0/u;

    .line 850
    .line 851
    const/4 v5, 0x3

    .line 852
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 853
    .line 854
    .line 855
    const/4 v5, 0x5

    .line 856
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 857
    .line 858
    .line 859
    :cond_25
    iget v2, v3, Lh0/i0;->n:I

    .line 860
    .line 861
    iget v4, v1, Lh0/i0;->n:I

    .line 862
    .line 863
    if-eq v2, v4, :cond_26

    .line 864
    .line 865
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 866
    .line 867
    new-instance v4, Lh0/u;

    .line 868
    .line 869
    const/4 v5, 0x4

    .line 870
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 871
    .line 872
    .line 873
    const/4 v5, 0x6

    .line 874
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 875
    .line 876
    .line 877
    :cond_26
    invoke-virtual {v3}, Lh0/i0;->k()Z

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    invoke-virtual/range {p1 .. p1}, Lh0/i0;->k()Z

    .line 882
    .line 883
    .line 884
    move-result v4

    .line 885
    if-eq v2, v4, :cond_27

    .line 886
    .line 887
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 888
    .line 889
    new-instance v4, Lh0/u;

    .line 890
    .line 891
    const/4 v5, 0x5

    .line 892
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 893
    .line 894
    .line 895
    const/4 v5, 0x7

    .line 896
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 897
    .line 898
    .line 899
    :cond_27
    iget-object v2, v3, Lh0/i0;->o:La0/J;

    .line 900
    .line 901
    iget-object v4, v1, Lh0/i0;->o:La0/J;

    .line 902
    .line 903
    invoke-virtual {v2, v4}, La0/J;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    if-nez v2, :cond_28

    .line 908
    .line 909
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 910
    .line 911
    new-instance v4, Lh0/u;

    .line 912
    .line 913
    const/4 v5, 0x6

    .line 914
    invoke-direct {v4, v1, v5}, Lh0/u;-><init>(Lh0/i0;I)V

    .line 915
    .line 916
    .line 917
    const/16 v5, 0xc

    .line 918
    .line 919
    invoke-virtual {v2, v5, v4}, Ld0/l;->c(ILd0/i;)V

    .line 920
    .line 921
    .line 922
    :cond_28
    invoke-virtual/range {p0 .. p0}, Lh0/G;->Z()V

    .line 923
    .line 924
    .line 925
    iget-object v2, v0, Lh0/G;->l:Ld0/l;

    .line 926
    .line 927
    invoke-virtual {v2}, Ld0/l;->b()V

    .line 928
    .line 929
    .line 930
    iget-boolean v2, v3, Lh0/i0;->p:Z

    .line 931
    .line 932
    iget-boolean v1, v1, Lh0/i0;->p:Z

    .line 933
    .line 934
    if-eq v2, v1, :cond_29

    .line 935
    .line 936
    iget-object v1, v0, Lh0/G;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 937
    .line 938
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    if-eqz v2, :cond_29

    .line 947
    .line 948
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    check-cast v2, Lh0/D;

    .line 953
    .line 954
    iget-object v2, v2, Lh0/D;->l:Lh0/G;

    .line 955
    .line 956
    invoke-virtual {v2}, Lh0/G;->c0()V

    .line 957
    .line 958
    .line 959
    goto :goto_10

    .line 960
    :cond_29
    return-void
.end method

.method public final c0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh0/G;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lh0/G;->A:La0/z;

    .line 6
    .line 7
    iget-object v2, p0, Lh0/G;->z:La0/z;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eq v0, v3, :cond_2

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 32
    .line 33
    iget-boolean v0, v0, Lh0/i0;->p:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Lh0/G;->D()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lh0/G;->D()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void
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

.method public final d0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/G;->d:LF0/N;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    :try_start_0
    iget-boolean v2, v0, LF0/N;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_3

    .line 16
    :catch_0
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    :cond_1
    monitor-exit v0

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lh0/G;->s:Landroid/os/Looper;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eq v0, v1, :cond_4

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lh0/G;->s:Landroid/os/Looper;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v2, Ld0/w;->a:I

    .line 59
    .line 60
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 65
    .line 66
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "\'\nExpected thread: \'"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v1, p0, Lh0/G;->X:Z

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    const-string v1, "ExoPlayerImpl"

    .line 94
    .line 95
    iget-boolean v2, p0, Lh0/G;->Y:Z

    .line 96
    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-static {v1, v0, v2}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    iput-boolean v3, p0, Lh0/G;->Y:Z

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    :goto_2
    return-void

    .line 119
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    throw v1
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

.method public final n(IJZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v2, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v3, 0x0

    .line 14
    :goto_0
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lh0/G;->d0:Lh0/i0;

    .line 18
    .line 19
    iget-object v3, v3, Lh0/i0;->a:La0/U;

    .line 20
    .line 21
    invoke-virtual {v3}, La0/U;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    invoke-virtual {v3}, La0/U;->o()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-lt p1, v4, :cond_2

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    iget-object v4, p0, Lh0/G;->r:Li0/c;

    .line 35
    .line 36
    iget-boolean v5, v4, Li0/c;->t:Z

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, Li0/c;->g()Li0/a;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iput-boolean v2, v4, Li0/c;->t:Z

    .line 45
    .line 46
    new-instance v6, Lh0/y;

    .line 47
    .line 48
    const/16 v7, 0x1c

    .line 49
    .line 50
    invoke-direct {v6, v7}, Lh0/y;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5, v1, v6}, Li0/c;->l(Li0/a;ILd0/i;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget v1, p0, Lh0/G;->E:I

    .line 57
    .line 58
    add-int/2addr v1, v2

    .line 59
    iput v1, p0, Lh0/G;->E:I

    .line 60
    .line 61
    invoke-virtual {p0}, Lh0/G;->G()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    const-string v0, "ExoPlayerImpl"

    .line 68
    .line 69
    const-string v1, "seekTo ignored because an ad is playing"

    .line 70
    .line 71
    invoke-static {v0, v1}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Lh0/K;

    .line 75
    .line 76
    iget-object v1, p0, Lh0/G;->d0:Lh0/i0;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lh0/K;-><init>(Lh0/i0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lh0/K;->c(I)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lh0/G;->j:Lh0/A;

    .line 85
    .line 86
    iget-object v1, v1, Lh0/A;->l:Lh0/G;

    .line 87
    .line 88
    iget-object v2, v1, Lh0/G;->i:Ld0/t;

    .line 89
    .line 90
    new-instance v3, LD0/y;

    .line 91
    .line 92
    const/16 v4, 0xe

    .line 93
    .line 94
    invoke-direct {v3, v1, v4, v0}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ld0/t;->c(Ljava/lang/Runnable;)Z

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    iget-object v1, p0, Lh0/G;->d0:Lh0/i0;

    .line 102
    .line 103
    iget v2, v1, Lh0/i0;->e:I

    .line 104
    .line 105
    const/4 v4, 0x3

    .line 106
    if-eq v2, v4, :cond_5

    .line 107
    .line 108
    const/4 v5, 0x4

    .line 109
    if-ne v2, v5, :cond_6

    .line 110
    .line 111
    invoke-virtual {v3}, La0/U;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    :cond_5
    iget-object v1, p0, Lh0/G;->d0:Lh0/i0;

    .line 118
    .line 119
    const/4 v2, 0x2

    .line 120
    invoke-virtual {v1, v2}, Lh0/i0;->g(I)Lh0/i0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_6
    invoke-virtual {p0}, Lh0/G;->w()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    invoke-virtual {p0, v3, p1, p2, p3}, Lh0/G;->I(La0/U;IJ)Landroid/util/Pair;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {p0, v1, v3, v2}, Lh0/G;->H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {p2, p3}, Ld0/w;->M(J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    iget-object v2, p0, Lh0/G;->k:Lh0/N;

    .line 141
    .line 142
    iget-object v2, v2, Lh0/N;->t:Ld0/t;

    .line 143
    .line 144
    new-instance v8, Lh0/M;

    .line 145
    .line 146
    invoke-direct {v8, v3, p1, v5, v6}, Lh0/M;-><init>(La0/U;IJ)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4, v8}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Ld0/s;->b()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v1}, Lh0/G;->y(Lh0/i0;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    const/4 v2, 0x0

    .line 161
    const/4 v3, 0x1

    .line 162
    const/4 v4, 0x1

    .line 163
    move-object v0, p0

    .line 164
    move v8, p4

    .line 165
    invoke-virtual/range {v0 .. v8}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 166
    .line 167
    .line 168
    return-void
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

.method public final p(ILjava/util/List;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lh0/f0;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lx0/J;

    .line 20
    .line 21
    iget-boolean v4, p0, Lh0/G;->p:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lh0/f0;-><init>(Lx0/J;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lh0/G;->o:Ljava/util/ArrayList;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Lh0/F;

    .line 34
    .line 35
    iget-object v6, v2, Lh0/f0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Lh0/f0;->a:Lx0/D;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, Lh0/F;-><init>(Ljava/lang/Object;Lx0/D;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, Lh0/G;->I:Lx0/j0;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    check-cast p2, Lx0/i0;

    .line 55
    .line 56
    invoke-virtual {p2, p1, v1}, Lx0/i0;->b(II)Lx0/i0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lh0/G;->I:Lx0/j0;

    .line 61
    .line 62
    return-object v0
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

.method public final q(ILjava/util/List;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    invoke-static {v2}, Ld0/m;->c(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lh0/G;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    iget p1, p0, Lh0/G;->e0:I

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    if-ne p1, v2, :cond_1

    .line 34
    .line 35
    move v8, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v8, v0

    .line 38
    :goto_1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 39
    .line 40
    .line 41
    const/4 v5, -0x1

    .line 42
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    move-object v3, p0

    .line 48
    move-object v4, p2

    .line 49
    invoke-virtual/range {v3 .. v8}, Lh0/G;->Q(Ljava/util/List;IJZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object v3, p0, Lh0/G;->d0:Lh0/i0;

    .line 54
    .line 55
    iget-object v5, v3, Lh0/i0;->a:La0/U;

    .line 56
    .line 57
    iget v4, p0, Lh0/G;->E:I

    .line 58
    .line 59
    add-int/2addr v4, v1

    .line 60
    iput v4, p0, Lh0/G;->E:I

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lh0/G;->p(ILjava/util/List;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    new-instance v1, Lh0/n0;

    .line 67
    .line 68
    iget-object v4, p0, Lh0/G;->I:Lx0/j0;

    .line 69
    .line 70
    invoke-direct {v1, v2, v4}, Lh0/n0;-><init>(Ljava/util/ArrayList;Lx0/j0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v3}, Lh0/G;->A(Lh0/i0;)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    invoke-virtual {p0, v3}, Lh0/G;->t(Lh0/i0;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    move-object v4, p0

    .line 82
    move-object v6, v1

    .line 83
    invoke-virtual/range {v4 .. v9}, Lh0/G;->C(La0/U;Lh0/n0;IJ)Landroid/util/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p0, v3, v1, v2}, Lh0/G;->H(Lh0/i0;La0/U;Landroid/util/Pair;)Lh0/i0;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-object v8, p0, Lh0/G;->I:Lx0/j0;

    .line 92
    .line 93
    iget-object v1, p0, Lh0/G;->k:Lh0/N;

    .line 94
    .line 95
    iget-object v1, v1, Lh0/N;->t:Ld0/t;

    .line 96
    .line 97
    new-instance v2, Lh0/I;

    .line 98
    .line 99
    const/4 v9, -0x1

    .line 100
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    move-object v6, v2

    .line 106
    move-object v7, p2

    .line 107
    invoke-direct/range {v6 .. v11}, Lh0/I;-><init>(Ljava/util/ArrayList;Lx0/j0;IJ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Ld0/t;->b()Ld0/s;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-object v1, v1, Ld0/t;->a:Landroid/os/Handler;

    .line 118
    .line 119
    const/16 v3, 0x12

    .line 120
    .line 121
    invoke-virtual {v1, v3, p1, v0, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iput-object p1, p2, Ld0/s;->a:Landroid/os/Message;

    .line 126
    .line 127
    invoke-virtual {p2}, Ld0/s;->b()V

    .line 128
    .line 129
    .line 130
    const/4 v8, 0x5

    .line 131
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v11, -0x1

    .line 139
    const/4 v12, 0x0

    .line 140
    move-object v4, p0

    .line 141
    invoke-virtual/range {v4 .. v12}, Lh0/G;->b0(Lh0/i0;IZIJIZ)V

    .line 142
    .line 143
    .line 144
    return-void
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

.method public final r()La0/D;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh0/G;->z()La0/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/U;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lh0/G;->c0:La0/D;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lh0/G;->w()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, LL0/e;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, La0/T;

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3, v4}, La0/U;->m(ILa0/T;J)La0/T;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, La0/T;->c:La0/A;

    .line 29
    .line 30
    iget-object v1, p0, Lh0/G;->c0:La0/D;

    .line 31
    .line 32
    invoke-virtual {v1}, La0/D;->a()La0/C;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, La0/A;->d:La0/D;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, La0/D;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iput-object v2, v1, La0/C;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v2, v0, La0/D;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, v1, La0/C;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v2, v0, La0/D;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iput-object v2, v1, La0/C;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v2, v0, La0/D;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    iput-object v2, v1, La0/C;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v2, v0, La0/D;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iput-object v2, v1, La0/C;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v2, v0, La0/D;->f:[B

    .line 73
    .line 74
    if-eqz v2, :cond_8

    .line 75
    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    goto :goto_0

    .line 80
    :cond_7
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, [B

    .line 85
    .line 86
    :goto_0
    iput-object v2, v1, La0/C;->f:[B

    .line 87
    .line 88
    iget-object v2, v0, La0/D;->g:Ljava/lang/Integer;

    .line 89
    .line 90
    iput-object v2, v1, La0/C;->g:Ljava/lang/Integer;

    .line 91
    .line 92
    :cond_8
    iget-object v2, v0, La0/D;->h:Ljava/lang/Integer;

    .line 93
    .line 94
    if-eqz v2, :cond_9

    .line 95
    .line 96
    iput-object v2, v1, La0/C;->h:Ljava/lang/Integer;

    .line 97
    .line 98
    :cond_9
    iget-object v2, v0, La0/D;->i:Ljava/lang/Integer;

    .line 99
    .line 100
    if-eqz v2, :cond_a

    .line 101
    .line 102
    iput-object v2, v1, La0/C;->i:Ljava/lang/Integer;

    .line 103
    .line 104
    :cond_a
    iget-object v2, v0, La0/D;->j:Ljava/lang/Integer;

    .line 105
    .line 106
    if-eqz v2, :cond_b

    .line 107
    .line 108
    iput-object v2, v1, La0/C;->j:Ljava/lang/Integer;

    .line 109
    .line 110
    :cond_b
    iget-object v2, v0, La0/D;->k:Ljava/lang/Boolean;

    .line 111
    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    iput-object v2, v1, La0/C;->k:Ljava/lang/Boolean;

    .line 115
    .line 116
    :cond_c
    iget-object v2, v0, La0/D;->l:Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz v2, :cond_d

    .line 119
    .line 120
    iput-object v2, v1, La0/C;->l:Ljava/lang/Integer;

    .line 121
    .line 122
    :cond_d
    iget-object v2, v0, La0/D;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    if-eqz v2, :cond_e

    .line 125
    .line 126
    iput-object v2, v1, La0/C;->l:Ljava/lang/Integer;

    .line 127
    .line 128
    :cond_e
    iget-object v2, v0, La0/D;->n:Ljava/lang/Integer;

    .line 129
    .line 130
    if-eqz v2, :cond_f

    .line 131
    .line 132
    iput-object v2, v1, La0/C;->m:Ljava/lang/Integer;

    .line 133
    .line 134
    :cond_f
    iget-object v2, v0, La0/D;->o:Ljava/lang/Integer;

    .line 135
    .line 136
    if-eqz v2, :cond_10

    .line 137
    .line 138
    iput-object v2, v1, La0/C;->n:Ljava/lang/Integer;

    .line 139
    .line 140
    :cond_10
    iget-object v2, v0, La0/D;->p:Ljava/lang/Integer;

    .line 141
    .line 142
    if-eqz v2, :cond_11

    .line 143
    .line 144
    iput-object v2, v1, La0/C;->o:Ljava/lang/Integer;

    .line 145
    .line 146
    :cond_11
    iget-object v2, v0, La0/D;->q:Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v2, :cond_12

    .line 149
    .line 150
    iput-object v2, v1, La0/C;->p:Ljava/lang/Integer;

    .line 151
    .line 152
    :cond_12
    iget-object v2, v0, La0/D;->r:Ljava/lang/Integer;

    .line 153
    .line 154
    if-eqz v2, :cond_13

    .line 155
    .line 156
    iput-object v2, v1, La0/C;->q:Ljava/lang/Integer;

    .line 157
    .line 158
    :cond_13
    iget-object v2, v0, La0/D;->s:Ljava/lang/CharSequence;

    .line 159
    .line 160
    if-eqz v2, :cond_14

    .line 161
    .line 162
    iput-object v2, v1, La0/C;->r:Ljava/lang/CharSequence;

    .line 163
    .line 164
    :cond_14
    iget-object v2, v0, La0/D;->t:Ljava/lang/CharSequence;

    .line 165
    .line 166
    if-eqz v2, :cond_15

    .line 167
    .line 168
    iput-object v2, v1, La0/C;->s:Ljava/lang/CharSequence;

    .line 169
    .line 170
    :cond_15
    iget-object v2, v0, La0/D;->u:Ljava/lang/CharSequence;

    .line 171
    .line 172
    if-eqz v2, :cond_16

    .line 173
    .line 174
    iput-object v2, v1, La0/C;->t:Ljava/lang/CharSequence;

    .line 175
    .line 176
    :cond_16
    iget-object v2, v0, La0/D;->v:Ljava/lang/Integer;

    .line 177
    .line 178
    if-eqz v2, :cond_17

    .line 179
    .line 180
    iput-object v2, v1, La0/C;->u:Ljava/lang/Integer;

    .line 181
    .line 182
    :cond_17
    iget-object v2, v0, La0/D;->w:Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v2, :cond_18

    .line 185
    .line 186
    iput-object v2, v1, La0/C;->v:Ljava/lang/Integer;

    .line 187
    .line 188
    :cond_18
    iget-object v2, v0, La0/D;->x:Ljava/lang/CharSequence;

    .line 189
    .line 190
    if-eqz v2, :cond_19

    .line 191
    .line 192
    iput-object v2, v1, La0/C;->w:Ljava/lang/CharSequence;

    .line 193
    .line 194
    :cond_19
    iget-object v2, v0, La0/D;->y:Ljava/lang/CharSequence;

    .line 195
    .line 196
    if-eqz v2, :cond_1a

    .line 197
    .line 198
    iput-object v2, v1, La0/C;->x:Ljava/lang/CharSequence;

    .line 199
    .line 200
    :cond_1a
    iget-object v2, v0, La0/D;->z:Ljava/lang/Integer;

    .line 201
    .line 202
    if-eqz v2, :cond_1b

    .line 203
    .line 204
    iput-object v2, v1, La0/C;->y:Ljava/lang/Integer;

    .line 205
    .line 206
    :cond_1b
    iget-object v0, v0, La0/D;->A:Lm2/I;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-nez v2, :cond_1c

    .line 213
    .line 214
    invoke-static {v0}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, v1, La0/C;->z:Lm2/I;

    .line 219
    .line 220
    :cond_1c
    :goto_1
    new-instance v0, La0/D;

    .line 221
    .line 222
    invoke-direct {v0, v1}, La0/D;-><init>(La0/C;)V

    .line 223
    .line 224
    .line 225
    return-object v0
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

.method public final s()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->G()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 11
    .line 12
    iget-object v1, v0, Lh0/i0;->k:Lx0/H;

    .line 13
    .line 14
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 23
    .line 24
    iget-wide v0, v0, Lh0/i0;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lh0/G;->B()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 40
    .line 41
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 42
    .line 43
    invoke-virtual {v0}, La0/U;->p()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-wide v0, p0, Lh0/G;->f0:J

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 53
    .line 54
    iget-object v1, v0, Lh0/i0;->k:Lx0/H;

    .line 55
    .line 56
    iget-wide v1, v1, Lx0/H;->d:J

    .line 57
    .line 58
    iget-object v3, v0, Lh0/i0;->b:Lx0/H;

    .line 59
    .line 60
    iget-wide v3, v3, Lx0/H;->d:J

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 69
    .line 70
    invoke-virtual {p0}, Lh0/G;->w()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget-object v4, p0, LL0/e;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, La0/T;

    .line 77
    .line 78
    invoke-virtual {v0, v1, v4, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-wide v0, v0, La0/T;->m:J

    .line 83
    .line 84
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iget-wide v0, v0, Lh0/i0;->q:J

    .line 90
    .line 91
    iget-object v4, p0, Lh0/G;->d0:Lh0/i0;

    .line 92
    .line 93
    iget-object v4, v4, Lh0/i0;->k:Lx0/H;

    .line 94
    .line 95
    invoke-virtual {v4}, Lx0/H;->b()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 102
    .line 103
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 104
    .line 105
    iget-object v0, v0, Lh0/i0;->k:Lx0/H;

    .line 106
    .line 107
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v4, p0, Lh0/G;->n:La0/S;

    .line 110
    .line 111
    invoke-virtual {v1, v0, v4}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v1, p0, Lh0/G;->d0:Lh0/i0;

    .line 116
    .line 117
    iget-object v1, v1, Lh0/i0;->k:Lx0/H;

    .line 118
    .line 119
    iget v1, v1, Lx0/H;->b:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, La0/S;->d(I)J

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move-wide v2, v0

    .line 126
    :goto_1
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 127
    .line 128
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 129
    .line 130
    iget-object v0, v0, Lh0/i0;->k:Lx0/H;

    .line 131
    .line 132
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v4, p0, Lh0/G;->n:La0/S;

    .line 135
    .line 136
    invoke-virtual {v1, v0, v4}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 137
    .line 138
    .line 139
    iget-wide v0, v4, La0/S;->e:J

    .line 140
    .line 141
    add-long/2addr v2, v0

    .line 142
    invoke-static {v2, v3}, Ld0/w;->Z(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    :goto_2
    return-wide v0
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

.method public final t(Lh0/i0;)J
    .locals 7

    .line 1
    iget-object v0, p1, Lh0/i0;->b:Lx0/H;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/H;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Lh0/i0;->b:Lx0/H;

    .line 10
    .line 11
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p1, Lh0/i0;->a:La0/U;

    .line 14
    .line 15
    iget-object v2, p0, Lh0/G;->n:La0/S;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 18
    .line 19
    .line 20
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v5, p1, Lh0/i0;->c:J

    .line 26
    .line 27
    cmp-long v0, v5, v3

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lh0/G;->A(Lh0/i0;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    iget-object v0, p0, LL0/e;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La0/T;

    .line 40
    .line 41
    invoke-virtual {v1, p1, v0, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v0, p1, La0/T;->l:J

    .line 46
    .line 47
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-wide v0, v2, La0/S;->e:J

    .line 53
    .line 54
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-static {v5, v6}, Ld0/w;->Z(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    add-long/2addr v0, v2

    .line 63
    :goto_0
    return-wide v0

    .line 64
    :cond_1
    invoke-virtual {p0, p1}, Lh0/G;->y(Lh0/i0;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
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

.method public final u()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->G()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 11
    .line 12
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 13
    .line 14
    iget v0, v0, Lx0/H;->b:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    :goto_0
    return v0
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

.method public final v()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh0/G;->G()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 11
    .line 12
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 13
    .line 14
    iget v0, v0, Lx0/H;->c:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    :goto_0
    return v0
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

.method public final w()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lh0/G;->A(Lh0/i0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
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
.end method

.method public final x()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lh0/G;->y(Lh0/i0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public final y(Lh0/i0;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lh0/i0;->a:La0/U;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/U;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lh0/G;->f0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Ld0/w;->M(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, Lh0/i0;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lh0/i0;->j()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Lh0/i0;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Lh0/i0;->b:Lx0/H;

    .line 28
    .line 29
    invoke-virtual {v2}, Lx0/H;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Lh0/i0;->a:La0/U;

    .line 37
    .line 38
    iget-object p1, p1, Lh0/i0;->b:Lx0/H;

    .line 39
    .line 40
    iget-object p1, p1, Lx0/H;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v3, p0, Lh0/G;->n:La0/S;

    .line 43
    .line 44
    invoke-virtual {v2, p1, v3}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 45
    .line 46
    .line 47
    iget-wide v2, v3, La0/S;->e:J

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    return-wide v0
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

.method public final z()La0/U;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/G;->d0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/G;->d0:Lh0/i0;

    .line 5
    .line 6
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 7
    .line 8
    return-object v0
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
