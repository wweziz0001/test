.class public final Lh0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lx0/E;
.implements Lh0/j0;


# static fields
.field public static final h0:J


# instance fields
.field public final A:Ljava/util/ArrayList;

.field public final B:Ld0/r;

.field public final C:Lh0/A;

.field public final D:Lh0/X;

.field public final E:Lh0/g0;

.field public final F:Lh0/O;

.field public final G:J

.field public final H:Li0/j;

.field public final I:Li0/c;

.field public final J:Ld0/t;

.field public K:Lh0/t0;

.field public L:Lh0/i0;

.field public M:Lh0/K;

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:J

.field public S:Z

.field public T:I

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:I

.field public Z:Lh0/M;

.field public a0:J

.field public b0:J

.field public c0:I

.field public d0:Z

.field public e0:Lh0/o;

.field public f0:J

.field public g0:Lh0/r;

.field public final l:[Lh0/o0;

.field public final m:Ljava/util/Set;

.field public final n:[Lh0/q0;

.field public final o:[Z

.field public final p:LA0/z;

.field public final q:LA0/A;

.field public final r:Lh0/Q;

.field public final s:LB0/e;

.field public final t:Ld0/t;

.field public final u:Ld0/o;

.field public final v:Landroid/os/Looper;

.field public final w:La0/T;

.field public final x:La0/S;

.field public final y:J

.field public final z:Le3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Ld0/w;->Z(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lh0/N;->h0:J

    .line 8
    .line 9
    return-void
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

.method public constructor <init>([Lh0/o0;LA0/z;LA0/A;Lh0/Q;LB0/e;IZLi0/c;Lh0/t0;Lh0/O;JLandroid/os/Looper;Ld0/r;Lh0/A;Li0/j;Lh0/r;)V
    .locals 13

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p8

    move-object/from16 v6, p14

    move-object/from16 v7, p16

    move-object/from16 v8, p17

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v9, p15

    .line 2
    iput-object v9, v1, Lh0/N;->C:Lh0/A;

    .line 3
    iput-object v0, v1, Lh0/N;->l:[Lh0/o0;

    .line 4
    iput-object v2, v1, Lh0/N;->p:LA0/z;

    move-object/from16 v9, p3

    .line 5
    iput-object v9, v1, Lh0/N;->q:LA0/A;

    .line 6
    iput-object v3, v1, Lh0/N;->r:Lh0/Q;

    .line 7
    iput-object v4, v1, Lh0/N;->s:LB0/e;

    move/from16 v10, p6

    .line 8
    iput v10, v1, Lh0/N;->T:I

    move/from16 v10, p7

    .line 9
    iput-boolean v10, v1, Lh0/N;->U:Z

    move-object/from16 v10, p9

    .line 10
    iput-object v10, v1, Lh0/N;->K:Lh0/t0;

    move-object/from16 v10, p10

    .line 11
    iput-object v10, v1, Lh0/N;->F:Lh0/O;

    move-wide/from16 v10, p11

    .line 12
    iput-wide v10, v1, Lh0/N;->G:J

    const/4 v10, 0x0

    .line 13
    iput-boolean v10, v1, Lh0/N;->O:Z

    .line 14
    iput-object v6, v1, Lh0/N;->B:Ld0/r;

    .line 15
    iput-object v7, v1, Lh0/N;->H:Li0/j;

    .line 16
    iput-object v8, v1, Lh0/N;->g0:Lh0/r;

    .line 17
    iput-object v5, v1, Lh0/N;->I:Li0/c;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    iput-wide v11, v1, Lh0/N;->f0:J

    .line 19
    iput-wide v11, v1, Lh0/N;->R:J

    .line 20
    check-cast v3, Lh0/m;

    .line 21
    iget-wide v11, v3, Lh0/m;->h:J

    .line 22
    iput-wide v11, v1, Lh0/N;->y:J

    .line 23
    sget-object v3, La0/U;->a:La0/Q;

    .line 24
    invoke-static/range {p3 .. p3}, Lh0/i0;->i(LA0/A;)Lh0/i0;

    move-result-object v3

    iput-object v3, v1, Lh0/N;->L:Lh0/i0;

    .line 25
    new-instance v9, Lh0/K;

    invoke-direct {v9, v3}, Lh0/K;-><init>(Lh0/i0;)V

    iput-object v9, v1, Lh0/N;->M:Lh0/K;

    .line 26
    array-length v3, v0

    new-array v3, v3, [Lh0/q0;

    iput-object v3, v1, Lh0/N;->n:[Lh0/q0;

    .line 27
    array-length v3, v0

    new-array v3, v3, [Z

    iput-object v3, v1, Lh0/N;->o:[Z

    .line 28
    move-object v3, v2

    check-cast v3, LA0/u;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v9, v10

    .line 29
    :goto_0
    array-length v11, v0

    if-ge v9, v11, :cond_0

    .line 30
    aget-object v11, v0, v9

    invoke-interface {v11, v9, v7, v6}, Lh0/o0;->init(ILi0/j;Ld0/a;)V

    .line 31
    iget-object v11, v1, Lh0/N;->n:[Lh0/q0;

    aget-object v12, v0, v9

    invoke-interface {v12}, Lh0/o0;->getCapabilities()Lh0/q0;

    move-result-object v12

    aput-object v12, v11, v9

    .line 32
    iget-object v11, v1, Lh0/N;->n:[Lh0/q0;

    aget-object v11, v11, v9

    invoke-interface {v11, v3}, Lh0/q0;->setListener(Lh0/p0;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Le3/e;

    invoke-direct {v0, p0, v6}, Le3/e;-><init>(Lh0/N;Ld0/r;)V

    iput-object v0, v1, Lh0/N;->z:Le3/e;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lh0/N;->A:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 36
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    .line 37
    iput-object v0, v1, Lh0/N;->m:Ljava/util/Set;

    .line 38
    new-instance v0, La0/T;

    invoke-direct {v0}, La0/T;-><init>()V

    iput-object v0, v1, Lh0/N;->w:La0/T;

    .line 39
    new-instance v0, La0/S;

    invoke-direct {v0}, La0/S;-><init>()V

    iput-object v0, v1, Lh0/N;->x:La0/S;

    .line 40
    iput-object v1, v2, LA0/z;->a:Lh0/N;

    .line 41
    iput-object v4, v2, LA0/z;->b:LB0/e;

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, v1, Lh0/N;->d0:Z

    const/4 v2, 0x0

    move-object/from16 v3, p13

    .line 43
    invoke-virtual {v6, v3, v2}, Ld0/r;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld0/t;

    move-result-object v2

    iput-object v2, v1, Lh0/N;->J:Ld0/t;

    .line 44
    new-instance v3, Lh0/X;

    new-instance v4, LI2/g;

    const/16 v9, 0xc

    invoke-direct {v4, p0, v9}, LI2/g;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v3, v5, v2, v4, v8}, Lh0/X;-><init>(Li0/c;Ld0/t;LI2/g;Lh0/r;)V

    iput-object v3, v1, Lh0/N;->D:Lh0/X;

    .line 45
    new-instance v3, Lh0/g0;

    invoke-direct {v3, p0, v5, v2, v7}, Lh0/g0;-><init>(Lh0/N;Li0/c;Ld0/t;Li0/j;)V

    iput-object v3, v1, Lh0/N;->E:Lh0/g0;

    .line 46
    new-instance v2, Ld0/o;

    invoke-direct {v2}, Ld0/o;-><init>()V

    iput-object v2, v1, Lh0/N;->u:Ld0/o;

    .line 47
    iget-object v3, v2, Ld0/o;->o:Ljava/lang/Object;

    monitor-enter v3

    .line 48
    :try_start_0
    iget-object v4, v2, Ld0/o;->m:Ljava/lang/Object;

    check-cast v4, Landroid/os/Looper;

    if-nez v4, :cond_2

    .line 49
    iget v4, v2, Ld0/o;->l:I

    if-nez v4, :cond_1

    iget-object v4, v2, Ld0/o;->n:Ljava/lang/Object;

    check-cast v4, Landroid/os/HandlerThread;

    if-nez v4, :cond_1

    move v10, v0

    :cond_1
    invoke-static {v10}, Ld0/m;->h(Z)V

    .line 50
    new-instance v4, Landroid/os/HandlerThread;

    const-string v5, "ExoPlayer:Playback"

    const/16 v7, -0x10

    invoke-direct {v4, v5, v7}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v4, v2, Ld0/o;->n:Ljava/lang/Object;

    .line 51
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 52
    iget-object v4, v2, Ld0/o;->n:Ljava/lang/Object;

    check-cast v4, Landroid/os/HandlerThread;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iput-object v4, v2, Ld0/o;->m:Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    iget v4, v2, Ld0/o;->l:I

    add-int/2addr v4, v0

    iput v4, v2, Ld0/o;->l:I

    .line 54
    iget-object v0, v2, Ld0/o;->m:Ljava/lang/Object;

    check-cast v0, Landroid/os/Looper;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iput-object v0, v1, Lh0/N;->v:Landroid/os/Looper;

    .line 56
    invoke-virtual {v6, v0, p0}, Ld0/r;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld0/t;

    move-result-object v0

    iput-object v0, v1, Lh0/N;->t:Ld0/t;

    return-void

    .line 57
    :goto_2
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static J(La0/U;Lh0/M;ZIZLa0/T;La0/S;)Landroid/util/Pair;
    .locals 13

    .line 1
    move-object v7, p0

    .line 2
    move-object v0, p1

    .line 3
    move-object/from16 v8, p6

    .line 4
    .line 5
    iget-object v1, v0, Lh0/M;->a:La0/U;

    .line 6
    .line 7
    invoke-virtual {p0}, La0/U;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return-object v9

    .line 15
    :cond_0
    invoke-virtual {v1}, La0/U;->p()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    move-object v10, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v10, v1

    .line 24
    :goto_0
    :try_start_0
    iget v4, v0, Lh0/M;->b:I

    .line 25
    .line 26
    iget-wide v5, v0, Lh0/M;->c:J

    .line 27
    .line 28
    move-object v1, v10

    .line 29
    move-object/from16 v2, p5

    .line 30
    .line 31
    move-object/from16 v3, p6

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v6}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    invoke-virtual {p0, v10}, La0/U;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, La0/U;->b(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v11, -0x1

    .line 51
    if-eq v2, v11, :cond_4

    .line 52
    .line 53
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v10, v2, v8}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-boolean v2, v2, La0/S;->f:Z

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    iget v2, v8, La0/S;->c:I

    .line 64
    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    move-object/from16 v12, p5

    .line 68
    .line 69
    invoke-virtual {v10, v2, v12, v3, v4}, La0/U;->m(ILa0/T;J)La0/T;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget v2, v2, La0/T;->n:I

    .line 74
    .line 75
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {v10, v3}, La0/U;->b(Ljava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v2, v3, :cond_3

    .line 82
    .line 83
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0, v1, v8}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget v3, v1, La0/S;->c:I

    .line 90
    .line 91
    iget-wide v4, v0, Lh0/M;->c:J

    .line 92
    .line 93
    move-object v0, p0

    .line 94
    move-object/from16 v1, p5

    .line 95
    .line 96
    move-object/from16 v2, p6

    .line 97
    .line 98
    invoke-virtual/range {v0 .. v5}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_3
    return-object v1

    .line 103
    :cond_4
    move-object/from16 v12, p5

    .line 104
    .line 105
    if-eqz p2, :cond_5

    .line 106
    .line 107
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 108
    .line 109
    move-object/from16 v0, p5

    .line 110
    .line 111
    move-object/from16 v1, p6

    .line 112
    .line 113
    move/from16 v2, p3

    .line 114
    .line 115
    move/from16 v3, p4

    .line 116
    .line 117
    move-object v5, v10

    .line 118
    move-object v6, p0

    .line 119
    invoke-static/range {v0 .. v6}, Lh0/N;->K(La0/T;La0/S;IZLjava/lang/Object;La0/U;La0/U;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eq v3, v11, :cond_5

    .line 124
    .line 125
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    move-object v0, p0

    .line 131
    move-object/from16 v1, p5

    .line 132
    .line 133
    move-object/from16 v2, p6

    .line 134
    .line 135
    invoke-virtual/range {v0 .. v5}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :catch_0
    :cond_5
    return-object v9
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
.end method

.method public static K(La0/T;La0/S;IZLjava/lang/Object;La0/U;La0/U;)I
    .locals 15

    .line 1
    move-object v6, p0

    .line 2
    move-object/from16 v7, p1

    .line 3
    .line 4
    move-object/from16 v0, p4

    .line 5
    .line 6
    move-object/from16 v8, p5

    .line 7
    .line 8
    move-object/from16 v9, p6

    .line 9
    .line 10
    invoke-virtual {v8, v0, v7}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v1, v1, La0/S;->c:I

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    invoke-virtual {v8, v1, p0, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La0/T;->a:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    move v4, v10

    .line 26
    :goto_0
    invoke-virtual/range {p6 .. p6}, La0/U;->o()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ge v4, v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v9, v4, p0, v2, v3}, La0/U;->m(ILa0/T;J)La0/T;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v5, v5, La0/T;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    return v4

    .line 45
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v8, v0}, La0/U;->b(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual/range {p5 .. p5}, La0/U;->h()I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    const/4 v12, -0x1

    .line 57
    move v1, v0

    .line 58
    move v13, v10

    .line 59
    move v14, v12

    .line 60
    :goto_1
    if-ge v13, v11, :cond_3

    .line 61
    .line 62
    if-ne v14, v12, :cond_3

    .line 63
    .line 64
    move-object/from16 v0, p5

    .line 65
    .line 66
    move-object/from16 v2, p1

    .line 67
    .line 68
    move-object v3, p0

    .line 69
    move/from16 v4, p2

    .line 70
    .line 71
    move/from16 v5, p3

    .line 72
    .line 73
    invoke-virtual/range {v0 .. v5}, La0/U;->d(ILa0/S;La0/T;IZ)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-ne v1, v12, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v8, v1}, La0/U;->l(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v9, v0}, La0/U;->b(Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    add-int/lit8 v13, v13, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_2
    if-ne v14, v12, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-virtual {v9, v14, v7, v10}, La0/U;->f(ILa0/S;Z)La0/S;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget v12, v0, La0/S;->c:I

    .line 99
    .line 100
    :goto_3
    return v12
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
.end method

.method public static R(Lh0/o0;J)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lh0/o0;->setCurrentStreamFinal()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lz0/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lz0/e;

    .line 9
    .line 10
    iget-boolean v0, p0, Lh0/h;->y:Z

    .line 11
    .line 12
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lz0/e;->U:J

    .line 16
    .line 17
    :cond_0
    return-void
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

.method public static r(Lh0/V;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v2, p0, Lh0/V;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lx0/F;->l()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Lh0/V;->c:[Lx0/f0;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v5}, Lx0/f0;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, Lh0/V;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-interface {v1}, Lx0/h0;->r()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    :catch_0
    :cond_4
    return v0
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

.method public static s(Lh0/o0;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lh0/o0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    :goto_0
    return p0
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
.method public final A(Lh0/J;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lh0/J;->a:I

    .line 8
    .line 9
    iget-object v2, p0, Lh0/N;->E:Lh0/g0;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    iget v5, p1, Lh0/J;->b:I

    .line 18
    .line 19
    iget v6, p1, Lh0/J;->c:I

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    if-gt v0, v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-gt v5, v7, :cond_0

    .line 30
    .line 31
    if-ltz v6, :cond_0

    .line 32
    .line 33
    move v7, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v4

    .line 36
    :goto_0
    invoke-static {v7}, Ld0/m;->c(Z)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Lh0/J;->d:Lx0/j0;

    .line 40
    .line 41
    iput-object p1, v2, Lh0/g0;->j:Lx0/j0;

    .line 42
    .line 43
    if-eq v0, v5, :cond_3

    .line 44
    .line 45
    if-ne v0, v6, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    sub-int v7, v5, v0

    .line 53
    .line 54
    add-int/2addr v7, v6

    .line 55
    sub-int/2addr v7, v1

    .line 56
    add-int/lit8 v1, v5, -0x1

    .line 57
    .line 58
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lh0/f0;

    .line 67
    .line 68
    iget v7, v7, Lh0/f0;->d:I

    .line 69
    .line 70
    invoke-static {v3, v0, v5, v6}, Ld0/w;->L(Ljava/util/ArrayList;III)V

    .line 71
    .line 72
    .line 73
    :goto_1
    if-gt p1, v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lh0/f0;

    .line 80
    .line 81
    iput v7, v0, Lh0/f0;->d:I

    .line 82
    .line 83
    iget-object v0, v0, Lh0/f0;->a:Lx0/D;

    .line 84
    .line 85
    iget-object v0, v0, Lx0/D;->z:Lx0/B;

    .line 86
    .line 87
    iget-object v0, v0, Lx0/x;->b:La0/U;

    .line 88
    .line 89
    invoke-virtual {v0}, La0/U;->o()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    add-int/2addr v7, v0

    .line 94
    add-int/lit8 p1, p1, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v2}, Lh0/g0;->b()La0/U;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :goto_2
    invoke-virtual {v2}, Lh0/g0;->b()La0/U;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_3
    invoke-virtual {p0, p1, v4}, Lh0/N;->n(La0/U;Z)V

    .line 107
    .line 108
    .line 109
    return-void
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

.method public final B()V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lh0/N;->F(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lh0/N;->r:Lh0/Q;

    .line 12
    .line 13
    check-cast v2, Lh0/m;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    iget-wide v5, v2, Lh0/m;->j:J

    .line 27
    .line 28
    const-wide/16 v7, -0x1

    .line 29
    .line 30
    cmp-long v7, v5, v7

    .line 31
    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    cmp-long v5, v5, v3

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move v5, v1

    .line 42
    :goto_1
    const-string v6, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 43
    .line 44
    invoke-static {v6, v5}, Ld0/m;->g(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    iput-wide v3, v2, Lh0/m;->j:J

    .line 48
    .line 49
    iget-object v3, v2, Lh0/m;->i:Ljava/util/HashMap;

    .line 50
    .line 51
    iget-object v4, p0, Lh0/N;->H:Li0/j;

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_2

    .line 58
    .line 59
    new-instance v5, Lh0/l;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lh0/l;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const/4 v4, -0x1

    .line 77
    iget v2, v2, Lh0/m;->f:I

    .line 78
    .line 79
    if-ne v2, v4, :cond_3

    .line 80
    .line 81
    const/high16 v2, 0xc80000

    .line 82
    .line 83
    :cond_3
    iput v2, v3, Lh0/l;->b:I

    .line 84
    .line 85
    iput-boolean v0, v3, Lh0/l;->a:Z

    .line 86
    .line 87
    iget-object v2, p0, Lh0/N;->L:Lh0/i0;

    .line 88
    .line 89
    iget-object v2, v2, Lh0/i0;->a:La0/U;

    .line 90
    .line 91
    invoke-virtual {v2}, La0/U;->p()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v3, 0x2

    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    const/4 v2, 0x4

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move v2, v3

    .line 101
    :goto_2
    invoke-virtual {p0, v2}, Lh0/N;->b0(I)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lh0/N;->s:LB0/e;

    .line 105
    .line 106
    check-cast v2, LB0/i;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v4, p0, Lh0/N;->E:Lh0/g0;

    .line 112
    .line 113
    iget-boolean v5, v4, Lh0/g0;->k:Z

    .line 114
    .line 115
    xor-int/2addr v5, v1

    .line 116
    invoke-static {v5}, Ld0/m;->h(Z)V

    .line 117
    .line 118
    .line 119
    iput-object v2, v4, Lh0/g0;->l:Lf0/A;

    .line 120
    .line 121
    :goto_3
    iget-object v2, v4, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-ge v0, v5, :cond_5

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lh0/f0;

    .line 134
    .line 135
    invoke-virtual {v4, v2}, Lh0/g0;->e(Lh0/f0;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, v4, Lh0/g0;->g:Ljava/util/HashSet;

    .line 139
    .line 140
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    iput-boolean v1, v4, Lh0/g0;->k:Z

    .line 147
    .line 148
    iget-object v0, p0, Lh0/N;->t:Ld0/t;

    .line 149
    .line 150
    invoke-virtual {v0, v3}, Ld0/t;->e(I)Z

    .line 151
    .line 152
    .line 153
    return-void
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

.method public final C()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v0, v1, v0, v1}, Lh0/N;->F(ZZZZ)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v2, p0, Lh0/N;->l:[Lh0/o0;

    .line 7
    .line 8
    array-length v3, v2

    .line 9
    if-ge v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lh0/N;->n:[Lh0/q0;

    .line 12
    .line 13
    aget-object v3, v3, v1

    .line 14
    .line 15
    invoke-interface {v3}, Lh0/q0;->clearListener()V

    .line 16
    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    invoke-interface {v2}, Lh0/o0;->release()V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Lh0/N;->r:Lh0/Q;

    .line 27
    .line 28
    iget-object v2, p0, Lh0/N;->H:Li0/j;

    .line 29
    .line 30
    check-cast v1, Lh0/m;

    .line 31
    .line 32
    iget-object v3, v1, Lh0/m;->i:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1}, Lh0/m;->d()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v2, v1, Lh0/m;->i:Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const-wide/16 v2, -0x1

    .line 52
    .line 53
    iput-wide v2, v1, Lh0/m;->j:J

    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0, v0}, Lh0/N;->b0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lh0/N;->u:Ld0/o;

    .line 59
    .line 60
    invoke-virtual {v1}, Ld0/o;->g()V

    .line 61
    .line 62
    .line 63
    monitor-enter p0

    .line 64
    :try_start_1
    iput-boolean v0, p0, Lh0/N;->N:Z

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 67
    .line 68
    .line 69
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw v0

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    iget-object v2, p0, Lh0/N;->u:Ld0/o;

    .line 76
    .line 77
    invoke-virtual {v2}, Ld0/o;->g()V

    .line 78
    .line 79
    .line 80
    monitor-enter p0

    .line 81
    :try_start_2
    iput-boolean v0, p0, Lh0/N;->N:Z

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 84
    .line 85
    .line 86
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    throw v1

    .line 88
    :catchall_2
    move-exception v0

    .line 89
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 90
    throw v0
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

.method public final D(IILx0/j0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh0/N;->E:Lh0/g0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-gt p2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, Lh0/g0;->j:Lx0/j0;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lh0/g0;->g(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lh0/g0;->b()La0/U;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1, v2}, Lh0/N;->n(La0/U;Z)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public final E()V
    .locals 20

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    iget-object v0, v10, Lh0/N;->z:Le3/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Le3/e;->d()La0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, La0/J;->a:F

    .line 10
    .line 11
    iget-object v1, v10, Lh0/N;->D:Lh0/X;

    .line 12
    .line 13
    iget-object v2, v1, Lh0/X;->i:Lh0/V;

    .line 14
    .line 15
    iget-object v1, v1, Lh0/X;->j:Lh0/V;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v4, v2

    .line 19
    const/4 v2, 0x1

    .line 20
    :goto_0
    if-eqz v4, :cond_e

    .line 21
    .line 22
    iget-boolean v5, v4, Lh0/V;->e:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_9

    .line 27
    .line 28
    :cond_0
    iget-object v5, v10, Lh0/N;->L:Lh0/i0;

    .line 29
    .line 30
    iget-object v6, v5, Lh0/i0;->a:La0/U;

    .line 31
    .line 32
    iget-boolean v5, v5, Lh0/i0;->l:Z

    .line 33
    .line 34
    invoke-virtual {v4, v0, v6, v5}, Lh0/V;->j(FLa0/U;Z)LA0/A;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v10, Lh0/N;->D:Lh0/X;

    .line 39
    .line 40
    iget-object v6, v6, Lh0/X;->i:Lh0/V;

    .line 41
    .line 42
    if-ne v4, v6, :cond_1

    .line 43
    .line 44
    move-object v13, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v13, v3

    .line 47
    :goto_1
    iget-object v3, v4, Lh0/V;->o:LA0/A;

    .line 48
    .line 49
    const/16 v18, 0x0

    .line 50
    .line 51
    if-eqz v3, :cond_6

    .line 52
    .line 53
    iget-object v6, v3, LA0/A;->c:[LA0/w;

    .line 54
    .line 55
    array-length v6, v6

    .line 56
    iget-object v7, v5, LA0/A;->c:[LA0/w;

    .line 57
    .line 58
    array-length v8, v7

    .line 59
    if-eq v6, v8, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    move/from16 v6, v18

    .line 63
    .line 64
    :goto_2
    array-length v8, v7

    .line 65
    if-ge v6, v8, :cond_4

    .line 66
    .line 67
    invoke-virtual {v5, v3, v6}, LA0/A;->a(LA0/A;I)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-nez v8, :cond_3

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    if-ne v4, v1, :cond_5

    .line 78
    .line 79
    move/from16 v2, v18

    .line 80
    .line 81
    :cond_5
    iget-object v4, v4, Lh0/V;->m:Lh0/V;

    .line 82
    .line 83
    move-object v3, v13

    .line 84
    goto :goto_0

    .line 85
    :cond_6
    :goto_3
    const/4 v9, 0x4

    .line 86
    if-eqz v2, :cond_d

    .line 87
    .line 88
    iget-object v0, v10, Lh0/N;->D:Lh0/X;

    .line 89
    .line 90
    iget-object v8, v0, Lh0/X;->i:Lh0/V;

    .line 91
    .line 92
    invoke-virtual {v0, v8}, Lh0/X;->l(Lh0/V;)Z

    .line 93
    .line 94
    .line 95
    move-result v16

    .line 96
    iget-object v0, v10, Lh0/N;->l:[Lh0/o0;

    .line 97
    .line 98
    array-length v0, v0

    .line 99
    new-array v6, v0, [Z

    .line 100
    .line 101
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 105
    .line 106
    iget-wide v14, v0, Lh0/i0;->s:J

    .line 107
    .line 108
    move-object v12, v8

    .line 109
    move-object/from16 v17, v6

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v17}, Lh0/V;->a(LA0/A;JZ[Z)J

    .line 112
    .line 113
    .line 114
    move-result-wide v12

    .line 115
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 116
    .line 117
    iget v1, v0, Lh0/i0;->e:I

    .line 118
    .line 119
    if-eq v1, v9, :cond_7

    .line 120
    .line 121
    iget-wide v0, v0, Lh0/i0;->s:J

    .line 122
    .line 123
    cmp-long v0, v12, v0

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    const/4 v14, 0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_7
    move/from16 v14, v18

    .line 130
    .line 131
    :goto_4
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 132
    .line 133
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 134
    .line 135
    iget-wide v4, v0, Lh0/i0;->c:J

    .line 136
    .line 137
    iget-wide v2, v0, Lh0/i0;->d:J

    .line 138
    .line 139
    const/4 v15, 0x5

    .line 140
    move-object/from16 v0, p0

    .line 141
    .line 142
    move-wide/from16 v16, v2

    .line 143
    .line 144
    move-wide v2, v12

    .line 145
    move-object/from16 v19, v6

    .line 146
    .line 147
    move-wide/from16 v6, v16

    .line 148
    .line 149
    move-object v11, v8

    .line 150
    move v8, v14

    .line 151
    move v9, v15

    .line 152
    invoke-virtual/range {v0 .. v9}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 157
    .line 158
    if-eqz v14, :cond_8

    .line 159
    .line 160
    invoke-virtual {v10, v12, v13}, Lh0/N;->H(J)V

    .line 161
    .line 162
    .line 163
    :cond_8
    iget-object v0, v10, Lh0/N;->l:[Lh0/o0;

    .line 164
    .line 165
    array-length v0, v0

    .line 166
    new-array v0, v0, [Z

    .line 167
    .line 168
    move/from16 v1, v18

    .line 169
    .line 170
    :goto_5
    iget-object v2, v10, Lh0/N;->l:[Lh0/o0;

    .line 171
    .line 172
    array-length v3, v2

    .line 173
    if-ge v1, v3, :cond_b

    .line 174
    .line 175
    aget-object v2, v2, v1

    .line 176
    .line 177
    invoke-static {v2}, Lh0/N;->s(Lh0/o0;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    aput-boolean v3, v0, v1

    .line 182
    .line 183
    iget-object v4, v11, Lh0/V;->c:[Lx0/f0;

    .line 184
    .line 185
    aget-object v4, v4, v1

    .line 186
    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    invoke-interface {v2}, Lh0/o0;->getStream()Lx0/f0;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    if-eq v4, v3, :cond_9

    .line 194
    .line 195
    invoke-virtual {v10, v1}, Lh0/N;->c(I)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_9
    aget-boolean v3, v19, v1

    .line 200
    .line 201
    if-eqz v3, :cond_a

    .line 202
    .line 203
    iget-wide v3, v10, Lh0/N;->a0:J

    .line 204
    .line 205
    invoke-interface {v2, v3, v4}, Lh0/o0;->resetPosition(J)V

    .line 206
    .line 207
    .line 208
    :cond_a
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_b
    iget-wide v1, v10, Lh0/N;->a0:J

    .line 212
    .line 213
    invoke-virtual {v10, v0, v1, v2}, Lh0/N;->f([ZJ)V

    .line 214
    .line 215
    .line 216
    :cond_c
    :goto_7
    const/4 v0, 0x1

    .line 217
    goto :goto_8

    .line 218
    :cond_d
    iget-object v0, v10, Lh0/N;->D:Lh0/X;

    .line 219
    .line 220
    invoke-virtual {v0, v4}, Lh0/X;->l(Lh0/V;)Z

    .line 221
    .line 222
    .line 223
    iget-boolean v0, v4, Lh0/V;->e:Z

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    iget-object v0, v4, Lh0/V;->g:Lh0/W;

    .line 228
    .line 229
    iget-wide v0, v0, Lh0/W;->b:J

    .line 230
    .line 231
    iget-wide v2, v10, Lh0/N;->a0:J

    .line 232
    .line 233
    iget-wide v6, v4, Lh0/V;->p:J

    .line 234
    .line 235
    sub-long/2addr v2, v6

    .line 236
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    iget-object v0, v4, Lh0/V;->j:[Lh0/q0;

    .line 241
    .line 242
    array-length v0, v0

    .line 243
    new-array v9, v0, [Z

    .line 244
    .line 245
    const/4 v8, 0x0

    .line 246
    invoke-virtual/range {v4 .. v9}, Lh0/V;->a(LA0/A;JZ[Z)J

    .line 247
    .line 248
    .line 249
    goto :goto_7

    .line 250
    :goto_8
    invoke-virtual {v10, v0}, Lh0/N;->m(Z)V

    .line 251
    .line 252
    .line 253
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 254
    .line 255
    iget v0, v0, Lh0/i0;->e:I

    .line 256
    .line 257
    const/4 v1, 0x4

    .line 258
    if-eq v0, v1, :cond_e

    .line 259
    .line 260
    invoke-virtual/range {p0 .. p0}, Lh0/N;->u()V

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {p0 .. p0}, Lh0/N;->k0()V

    .line 264
    .line 265
    .line 266
    iget-object v0, v10, Lh0/N;->t:Ld0/t;

    .line 267
    .line 268
    const/4 v1, 0x2

    .line 269
    invoke-virtual {v0, v1}, Ld0/t;->e(I)Z

    .line 270
    .line 271
    .line 272
    :cond_e
    :goto_9
    return-void
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

.method public final F(ZZZZ)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lh0/N;->t:Ld0/t;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-virtual {v0, v2}, Ld0/t;->d(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, Lh0/N;->e0:Lh0/o;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-virtual {v1, v3, v4}, Lh0/N;->m0(ZZ)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lh0/N;->z:Le3/e;

    .line 18
    .line 19
    iput-boolean v3, v0, Le3/e;->m:Z

    .line 20
    .line 21
    iget-object v0, v0, Le3/e;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lh0/u0;

    .line 24
    .line 25
    iget-boolean v5, v0, Lh0/u0;->m:Z

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lh0/u0;->h()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v0, v5, v6}, Lh0/u0;->b(J)V

    .line 34
    .line 35
    .line 36
    iput-boolean v3, v0, Lh0/u0;->m:Z

    .line 37
    .line 38
    :cond_0
    const-wide v5, 0xe8d4a51000L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iput-wide v5, v1, Lh0/N;->a0:J

    .line 44
    .line 45
    move v5, v3

    .line 46
    :goto_0
    iget-object v6, v1, Lh0/N;->l:[Lh0/o0;

    .line 47
    .line 48
    array-length v0, v6

    .line 49
    const-string v7, "ExoPlayerImplInternal"

    .line 50
    .line 51
    if-ge v5, v0, :cond_1

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v1, v5}, Lh0/N;->c(I)V
    :try_end_0
    .catch Lh0/o; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    :goto_1
    const-string v6, "Disable failed."

    .line 61
    .line 62
    invoke-static {v7, v6, v0}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    add-int/2addr v5, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    if-eqz p1, :cond_3

    .line 68
    .line 69
    array-length v5, v6

    .line 70
    move v8, v3

    .line 71
    :goto_3
    if-ge v8, v5, :cond_3

    .line 72
    .line 73
    aget-object v0, v6, v8

    .line 74
    .line 75
    iget-object v9, v1, Lh0/N;->m:Ljava/util/Set;

    .line 76
    .line 77
    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_2

    .line 82
    .line 83
    :try_start_1
    invoke-interface {v0}, Lh0/o0;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :catch_2
    move-exception v0

    .line 88
    move-object v9, v0

    .line 89
    const-string v0, "Reset failed."

    .line 90
    .line 91
    invoke-static {v7, v0, v9}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_4
    add-int/2addr v8, v4

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    iput v3, v1, Lh0/N;->Y:I

    .line 97
    .line 98
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 99
    .line 100
    iget-object v5, v0, Lh0/i0;->b:Lx0/H;

    .line 101
    .line 102
    iget-wide v6, v0, Lh0/i0;->s:J

    .line 103
    .line 104
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 105
    .line 106
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 107
    .line 108
    invoke-virtual {v0}, Lx0/H;->b()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 115
    .line 116
    iget-object v8, v1, Lh0/N;->x:La0/S;

    .line 117
    .line 118
    iget-object v9, v0, Lh0/i0;->b:Lx0/H;

    .line 119
    .line 120
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 121
    .line 122
    invoke-virtual {v0}, La0/U;->p()Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-nez v10, :cond_5

    .line 127
    .line 128
    iget-object v9, v9, Lx0/H;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v0, v9, v8}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-boolean v0, v0, La0/S;->f:Z

    .line 135
    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 140
    .line 141
    iget-wide v8, v0, Lh0/i0;->s:J

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_5
    :goto_5
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 145
    .line 146
    iget-wide v8, v0, Lh0/i0;->c:J

    .line 147
    .line 148
    :goto_6
    if-eqz p2, :cond_6

    .line 149
    .line 150
    iput-object v2, v1, Lh0/N;->Z:Lh0/M;

    .line 151
    .line 152
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 153
    .line 154
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lh0/N;->i(La0/U;)Landroid/util/Pair;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v5, Lx0/H;

    .line 163
    .line 164
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ljava/lang/Long;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    iget-object v0, v1, Lh0/N;->L:Lh0/i0;

    .line 173
    .line 174
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 175
    .line 176
    invoke-virtual {v5, v0}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    if-nez v0, :cond_6

    .line 186
    .line 187
    move v0, v4

    .line 188
    :goto_7
    move-wide/from16 v28, v6

    .line 189
    .line 190
    move-wide v9, v8

    .line 191
    goto :goto_8

    .line 192
    :cond_6
    move v0, v3

    .line 193
    goto :goto_7

    .line 194
    :goto_8
    iget-object v6, v1, Lh0/N;->D:Lh0/X;

    .line 195
    .line 196
    invoke-virtual {v6}, Lh0/X;->b()V

    .line 197
    .line 198
    .line 199
    iput-boolean v3, v1, Lh0/N;->S:Z

    .line 200
    .line 201
    iget-object v6, v1, Lh0/N;->L:Lh0/i0;

    .line 202
    .line 203
    iget-object v6, v6, Lh0/i0;->a:La0/U;

    .line 204
    .line 205
    if-eqz p3, :cond_9

    .line 206
    .line 207
    instance-of v7, v6, Lh0/n0;

    .line 208
    .line 209
    if-eqz v7, :cond_9

    .line 210
    .line 211
    check-cast v6, Lh0/n0;

    .line 212
    .line 213
    iget-object v7, v1, Lh0/N;->E:Lh0/g0;

    .line 214
    .line 215
    iget-object v7, v7, Lh0/g0;->j:Lx0/j0;

    .line 216
    .line 217
    iget-object v8, v6, Lh0/n0;->i:[La0/U;

    .line 218
    .line 219
    array-length v11, v8

    .line 220
    new-array v11, v11, [La0/U;

    .line 221
    .line 222
    move v12, v3

    .line 223
    :goto_9
    array-length v13, v8

    .line 224
    if-ge v12, v13, :cond_7

    .line 225
    .line 226
    new-instance v13, Lh0/m0;

    .line 227
    .line 228
    aget-object v14, v8, v12

    .line 229
    .line 230
    invoke-direct {v13, v14}, Lh0/m0;-><init>(La0/U;)V

    .line 231
    .line 232
    .line 233
    aput-object v13, v11, v12

    .line 234
    .line 235
    add-int/2addr v12, v4

    .line 236
    goto :goto_9

    .line 237
    :cond_7
    new-instance v8, Lh0/n0;

    .line 238
    .line 239
    iget-object v6, v6, Lh0/n0;->j:[Ljava/lang/Object;

    .line 240
    .line 241
    invoke-direct {v8, v11, v6, v7}, Lh0/n0;-><init>([La0/U;[Ljava/lang/Object;Lx0/j0;)V

    .line 242
    .line 243
    .line 244
    iget v6, v5, Lx0/H;->b:I

    .line 245
    .line 246
    const/4 v7, -0x1

    .line 247
    if-eq v6, v7, :cond_8

    .line 248
    .line 249
    iget-object v6, v5, Lx0/H;->a:Ljava/lang/Object;

    .line 250
    .line 251
    iget-object v7, v1, Lh0/N;->x:La0/S;

    .line 252
    .line 253
    invoke-virtual {v8, v6, v7}, Lh0/a;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 254
    .line 255
    .line 256
    iget-object v6, v1, Lh0/N;->x:La0/S;

    .line 257
    .line 258
    iget v6, v6, La0/S;->c:I

    .line 259
    .line 260
    iget-object v7, v1, Lh0/N;->w:La0/T;

    .line 261
    .line 262
    const-wide/16 v11, 0x0

    .line 263
    .line 264
    invoke-virtual {v8, v6, v7, v11, v12}, Lh0/a;->m(ILa0/T;J)La0/T;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7}, La0/T;->a()Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_8

    .line 272
    .line 273
    new-instance v6, Lx0/H;

    .line 274
    .line 275
    iget-object v7, v5, Lx0/H;->a:Ljava/lang/Object;

    .line 276
    .line 277
    iget-wide v11, v5, Lx0/H;->d:J

    .line 278
    .line 279
    invoke-direct {v6, v11, v12, v7}, Lx0/H;-><init>(JLjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v19, v6

    .line 283
    .line 284
    :goto_a
    move-object v7, v8

    .line 285
    goto :goto_b

    .line 286
    :cond_8
    move-object/from16 v19, v5

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_9
    move-object/from16 v19, v5

    .line 290
    .line 291
    move-object v7, v6

    .line 292
    :goto_b
    new-instance v5, Lh0/i0;

    .line 293
    .line 294
    iget-object v6, v1, Lh0/N;->L:Lh0/i0;

    .line 295
    .line 296
    iget v13, v6, Lh0/i0;->e:I

    .line 297
    .line 298
    if-eqz p4, :cond_a

    .line 299
    .line 300
    move-object v14, v2

    .line 301
    goto :goto_c

    .line 302
    :cond_a
    iget-object v8, v6, Lh0/i0;->f:Lh0/o;

    .line 303
    .line 304
    move-object v14, v8

    .line 305
    :goto_c
    if-eqz v0, :cond_b

    .line 306
    .line 307
    sget-object v8, Lx0/q0;->d:Lx0/q0;

    .line 308
    .line 309
    :goto_d
    move-object/from16 v16, v8

    .line 310
    .line 311
    goto :goto_e

    .line 312
    :cond_b
    iget-object v8, v6, Lh0/i0;->h:Lx0/q0;

    .line 313
    .line 314
    goto :goto_d

    .line 315
    :goto_e
    if-eqz v0, :cond_c

    .line 316
    .line 317
    iget-object v8, v1, Lh0/N;->q:LA0/A;

    .line 318
    .line 319
    :goto_f
    move-object/from16 v17, v8

    .line 320
    .line 321
    goto :goto_10

    .line 322
    :cond_c
    iget-object v8, v6, Lh0/i0;->i:LA0/A;

    .line 323
    .line 324
    goto :goto_f

    .line 325
    :goto_10
    if-eqz v0, :cond_d

    .line 326
    .line 327
    sget-object v0, Lm2/I;->m:Lm2/G;

    .line 328
    .line 329
    sget-object v0, Lm2/b0;->p:Lm2/b0;

    .line 330
    .line 331
    :goto_11
    move-object/from16 v18, v0

    .line 332
    .line 333
    goto :goto_12

    .line 334
    :cond_d
    iget-object v0, v6, Lh0/i0;->j:Ljava/util/List;

    .line 335
    .line 336
    goto :goto_11

    .line 337
    :goto_12
    iget-boolean v0, v6, Lh0/i0;->l:Z

    .line 338
    .line 339
    move/from16 v20, v0

    .line 340
    .line 341
    iget v0, v6, Lh0/i0;->m:I

    .line 342
    .line 343
    move/from16 v21, v0

    .line 344
    .line 345
    iget v0, v6, Lh0/i0;->n:I

    .line 346
    .line 347
    move/from16 v22, v0

    .line 348
    .line 349
    iget-object v0, v6, Lh0/i0;->o:La0/J;

    .line 350
    .line 351
    move-object/from16 v23, v0

    .line 352
    .line 353
    const/4 v15, 0x0

    .line 354
    const-wide/16 v26, 0x0

    .line 355
    .line 356
    const-wide/16 v30, 0x0

    .line 357
    .line 358
    const/16 v32, 0x0

    .line 359
    .line 360
    move-object v6, v5

    .line 361
    move-object/from16 v8, v19

    .line 362
    .line 363
    move-wide/from16 v11, v28

    .line 364
    .line 365
    move-wide/from16 v24, v28

    .line 366
    .line 367
    invoke-direct/range {v6 .. v32}, Lh0/i0;-><init>(La0/U;Lx0/H;JJILh0/o;ZLx0/q0;LA0/A;Ljava/util/List;Lx0/H;ZIILa0/J;JJJJZ)V

    .line 368
    .line 369
    .line 370
    iput-object v5, v1, Lh0/N;->L:Lh0/i0;

    .line 371
    .line 372
    if-eqz p3, :cond_11

    .line 373
    .line 374
    iget-object v0, v1, Lh0/N;->D:Lh0/X;

    .line 375
    .line 376
    iget-object v5, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-nez v5, :cond_f

    .line 383
    .line 384
    new-instance v5, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    move v6, v3

    .line 390
    :goto_13
    iget-object v7, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-ge v6, v7, :cond_e

    .line 397
    .line 398
    iget-object v7, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    check-cast v7, Lh0/V;

    .line 405
    .line 406
    invoke-virtual {v7}, Lh0/V;->i()V

    .line 407
    .line 408
    .line 409
    add-int/2addr v6, v4

    .line 410
    goto :goto_13

    .line 411
    :cond_e
    iput-object v5, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 412
    .line 413
    iput-object v2, v0, Lh0/X;->l:Lh0/V;

    .line 414
    .line 415
    invoke-virtual {v0}, Lh0/X;->j()V

    .line 416
    .line 417
    .line 418
    :cond_f
    iget-object v2, v1, Lh0/N;->E:Lh0/g0;

    .line 419
    .line 420
    iget-object v4, v2, Lh0/g0;->f:Ljava/util/HashMap;

    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_10

    .line 435
    .line 436
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    move-object v6, v0

    .line 441
    check-cast v6, Lh0/e0;

    .line 442
    .line 443
    :try_start_2
    iget-object v0, v6, Lh0/e0;->a:Lx0/J;

    .line 444
    .line 445
    iget-object v7, v6, Lh0/e0;->b:Lh0/Z;

    .line 446
    .line 447
    check-cast v0, Lx0/a;

    .line 448
    .line 449
    invoke-virtual {v0, v7}, Lx0/a;->s(Lx0/I;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 450
    .line 451
    .line 452
    goto :goto_15

    .line 453
    :catch_3
    move-exception v0

    .line 454
    const-string v7, "MediaSourceList"

    .line 455
    .line 456
    const-string v8, "Failed to release child source."

    .line 457
    .line 458
    invoke-static {v7, v8, v0}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 459
    .line 460
    .line 461
    :goto_15
    iget-object v0, v6, Lh0/e0;->a:Lx0/J;

    .line 462
    .line 463
    check-cast v0, Lx0/a;

    .line 464
    .line 465
    iget-object v7, v6, Lh0/e0;->c:Lh0/d0;

    .line 466
    .line 467
    invoke-virtual {v0, v7}, Lx0/a;->v(Lx0/N;)V

    .line 468
    .line 469
    .line 470
    iget-object v0, v6, Lh0/e0;->a:Lx0/J;

    .line 471
    .line 472
    check-cast v0, Lx0/a;

    .line 473
    .line 474
    invoke-virtual {v0, v7}, Lx0/a;->u(Lm0/f;)V

    .line 475
    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_10
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 479
    .line 480
    .line 481
    iget-object v0, v2, Lh0/g0;->g:Ljava/util/HashSet;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 484
    .line 485
    .line 486
    iput-boolean v3, v2, Lh0/g0;->k:Z

    .line 487
    .line 488
    :cond_11
    return-void
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
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
.end method

.method public final G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lh0/V;->g:Lh0/W;

    .line 8
    .line 9
    iget-boolean v0, v0, Lh0/W;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lh0/N;->O:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lh0/N;->P:Z

    .line 21
    .line 22
    return-void
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

.method public final H(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/X;->i:Lh0/V;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v1, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v1, v1, Lh0/V;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, Lh0/N;->a0:J

    .line 18
    .line 19
    iget-object v1, p0, Lh0/N;->z:Le3/e;

    .line 20
    .line 21
    iget-object v1, v1, Le3/e;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lh0/u0;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lh0/u0;->b(J)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lh0/N;->l:[Lh0/o0;

    .line 29
    .line 30
    array-length p2, p1

    .line 31
    const/4 v1, 0x0

    .line 32
    move v2, v1

    .line 33
    :goto_2
    if-ge v2, p2, :cond_2

    .line 34
    .line 35
    aget-object v3, p1, v2

    .line 36
    .line 37
    invoke-static {v3}, Lh0/N;->s(Lh0/o0;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-wide v4, p0, Lh0/N;->a0:J

    .line 44
    .line 45
    invoke-interface {v3, v4, v5}, Lh0/o0;->resetPosition(J)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object p1, v0, Lh0/X;->i:Lh0/V;

    .line 52
    .line 53
    :goto_3
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object p2, p1, Lh0/V;->o:LA0/A;

    .line 56
    .line 57
    iget-object p2, p2, LA0/A;->c:[LA0/w;

    .line 58
    .line 59
    array-length v0, p2

    .line 60
    move v2, v1

    .line 61
    :goto_4
    if-ge v2, v0, :cond_4

    .line 62
    .line 63
    aget-object v3, p2, v2

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v3}, LA0/w;->m()V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object p1, p1, Lh0/V;->m:Lh0/V;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
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

.method public final I(La0/U;La0/U;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, La0/U;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, La0/U;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lh0/N;->A:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/lit8 p2, p2, -0x1

    .line 21
    .line 22
    if-gez p2, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lb3/a;->q(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
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

.method public final L(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 2
    .line 3
    iget v0, v0, Lh0/i0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lh0/N;->c0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-wide v0, Lh0/N;->h0:J

    .line 18
    .line 19
    :goto_0
    add-long/2addr p1, v0

    .line 20
    iget-object v0, p0, Lh0/N;->t:Ld0/t;

    .line 21
    .line 22
    iget-object v0, v0, Ld0/t;->a:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final M(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 4
    .line 5
    iget-object v0, v0, Lh0/V;->g:Lh0/W;

    .line 6
    .line 7
    iget-object v0, v0, Lh0/W;->a:Lx0/H;

    .line 8
    .line 9
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 10
    .line 11
    iget-wide v3, v1, Lh0/i0;->s:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, v0

    .line 17
    invoke-virtual/range {v1 .. v6}, Lh0/N;->O(Lx0/H;JZZ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 22
    .line 23
    iget-wide v1, v1, Lh0/i0;->s:J

    .line 24
    .line 25
    cmp-long v1, v3, v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 30
    .line 31
    iget-wide v5, v1, Lh0/i0;->c:J

    .line 32
    .line 33
    iget-wide v7, v1, Lh0/i0;->d:J

    .line 34
    .line 35
    const/4 v10, 0x5

    .line 36
    move-object v1, p0

    .line 37
    move-object v2, v0

    .line 38
    move v9, p1

    .line 39
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 44
    .line 45
    :cond_0
    return-void
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

.method public final N(Lh0/M;)V
    .locals 18

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v1, v11, Lh0/N;->M:Lh0/K;

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    invoke-virtual {v1, v8}, Lh0/K;->c(I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 12
    .line 13
    iget-object v1, v1, Lh0/i0;->a:La0/U;

    .line 14
    .line 15
    iget v4, v11, Lh0/N;->T:I

    .line 16
    .line 17
    iget-boolean v5, v11, Lh0/N;->U:Z

    .line 18
    .line 19
    iget-object v6, v11, Lh0/N;->w:La0/T;

    .line 20
    .line 21
    iget-object v7, v11, Lh0/N;->x:La0/S;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    invoke-static/range {v1 .. v7}, Lh0/N;->J(La0/U;Lh0/M;ZIZLa0/T;La0/S;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    iget-object v6, v11, Lh0/N;->L:Lh0/i0;

    .line 41
    .line 42
    iget-object v6, v6, Lh0/i0;->a:La0/U;

    .line 43
    .line 44
    invoke-virtual {v11, v6}, Lh0/N;->i(La0/U;)Landroid/util/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget-object v9, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Lx0/H;

    .line 51
    .line 52
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v12

    .line 60
    iget-object v6, v11, Lh0/N;->L:Lh0/i0;

    .line 61
    .line 62
    iget-object v6, v6, Lh0/i0;->a:La0/U;

    .line 63
    .line 64
    invoke-virtual {v6}, La0/U;->p()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    xor-int/2addr v6, v8

    .line 69
    move v10, v6

    .line 70
    move-wide v14, v12

    .line 71
    move-wide v12, v4

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v9, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    iget-wide v9, v0, Lh0/M;->c:J

    .line 84
    .line 85
    cmp-long v9, v9, v4

    .line 86
    .line 87
    if-nez v9, :cond_1

    .line 88
    .line 89
    move-wide v9, v4

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move-wide v9, v12

    .line 92
    :goto_0
    iget-object v14, v11, Lh0/N;->D:Lh0/X;

    .line 93
    .line 94
    iget-object v15, v11, Lh0/N;->L:Lh0/i0;

    .line 95
    .line 96
    iget-object v15, v15, Lh0/i0;->a:La0/U;

    .line 97
    .line 98
    invoke-virtual {v14, v15, v6, v12, v13}, Lh0/X;->n(La0/U;Ljava/lang/Object;J)Lx0/H;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Lx0/H;->b()Z

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    if-eqz v14, :cond_3

    .line 107
    .line 108
    iget-object v4, v11, Lh0/N;->L:Lh0/i0;

    .line 109
    .line 110
    iget-object v4, v4, Lh0/i0;->a:La0/U;

    .line 111
    .line 112
    iget-object v5, v6, Lx0/H;->a:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v12, v11, Lh0/N;->x:La0/S;

    .line 115
    .line 116
    invoke-virtual {v4, v5, v12}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 117
    .line 118
    .line 119
    iget-object v4, v11, Lh0/N;->x:La0/S;

    .line 120
    .line 121
    iget v5, v6, Lx0/H;->b:I

    .line 122
    .line 123
    invoke-virtual {v4, v5}, La0/S;->e(I)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    iget v5, v6, Lx0/H;->c:I

    .line 128
    .line 129
    if-ne v4, v5, :cond_2

    .line 130
    .line 131
    iget-object v4, v11, Lh0/N;->x:La0/S;

    .line 132
    .line 133
    iget-object v4, v4, La0/S;->g:La0/b;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    :cond_2
    move-wide v14, v2

    .line 139
    move-wide v12, v9

    .line 140
    move-object v9, v6

    .line 141
    move v10, v8

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-wide v14, v0, Lh0/M;->c:J

    .line 144
    .line 145
    cmp-long v4, v14, v4

    .line 146
    .line 147
    if-nez v4, :cond_4

    .line 148
    .line 149
    move v4, v8

    .line 150
    goto :goto_1

    .line 151
    :cond_4
    move v4, v7

    .line 152
    :goto_1
    move-wide v14, v12

    .line 153
    move-wide v12, v9

    .line 154
    move v10, v4

    .line 155
    move-object v9, v6

    .line 156
    :goto_2
    :try_start_0
    iget-object v4, v11, Lh0/N;->L:Lh0/i0;

    .line 157
    .line 158
    iget-object v4, v4, Lh0/i0;->a:La0/U;

    .line 159
    .line 160
    invoke-virtual {v4}, La0/U;->p()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_5

    .line 165
    .line 166
    iput-object v0, v11, Lh0/N;->Z:Lh0/M;

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    move-wide v7, v14

    .line 171
    goto/16 :goto_a

    .line 172
    .line 173
    :cond_5
    const/4 v0, 0x4

    .line 174
    if-nez v1, :cond_7

    .line 175
    .line 176
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 177
    .line 178
    iget v1, v1, Lh0/i0;->e:I

    .line 179
    .line 180
    if-eq v1, v8, :cond_6

    .line 181
    .line 182
    invoke-virtual {v11, v0}, Lh0/N;->b0(I)V

    .line 183
    .line 184
    .line 185
    :cond_6
    invoke-virtual {v11, v7, v8, v7, v8}, Lh0/N;->F(ZZZZ)V

    .line 186
    .line 187
    .line 188
    :goto_3
    move-wide v7, v14

    .line 189
    goto/16 :goto_9

    .line 190
    .line 191
    :cond_7
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 192
    .line 193
    iget-object v1, v1, Lh0/i0;->b:Lx0/H;

    .line 194
    .line 195
    invoke-virtual {v9, v1}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 202
    .line 203
    iget-object v1, v1, Lh0/X;->i:Lh0/V;

    .line 204
    .line 205
    if-eqz v1, :cond_8

    .line 206
    .line 207
    iget-boolean v4, v1, Lh0/V;->e:Z

    .line 208
    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    cmp-long v2, v14, v2

    .line 212
    .line 213
    if-eqz v2, :cond_8

    .line 214
    .line 215
    iget-object v1, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v2, v11, Lh0/N;->K:Lh0/t0;

    .line 218
    .line 219
    invoke-interface {v1, v14, v15, v2}, Lx0/F;->b(JLh0/t0;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v1

    .line 223
    goto :goto_4

    .line 224
    :cond_8
    move-wide v1, v14

    .line 225
    :goto_4
    invoke-static {v1, v2}, Ld0/w;->Z(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v3

    .line 229
    iget-object v5, v11, Lh0/N;->L:Lh0/i0;

    .line 230
    .line 231
    iget-wide v5, v5, Lh0/i0;->s:J

    .line 232
    .line 233
    invoke-static {v5, v6}, Ld0/w;->Z(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v5

    .line 237
    cmp-long v3, v3, v5

    .line 238
    .line 239
    if-nez v3, :cond_a

    .line 240
    .line 241
    iget-object v3, v11, Lh0/N;->L:Lh0/i0;

    .line 242
    .line 243
    iget v4, v3, Lh0/i0;->e:I

    .line 244
    .line 245
    const/4 v5, 0x2

    .line 246
    if-eq v4, v5, :cond_9

    .line 247
    .line 248
    const/4 v5, 0x3

    .line 249
    if-ne v4, v5, :cond_a

    .line 250
    .line 251
    :cond_9
    iget-wide v7, v3, Lh0/i0;->s:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    .line 253
    const/4 v0, 0x2

    .line 254
    move-object/from16 v1, p0

    .line 255
    .line 256
    move-object v2, v9

    .line 257
    move-wide v3, v7

    .line 258
    move-wide v5, v12

    .line 259
    move v9, v10

    .line 260
    move v10, v0

    .line 261
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 266
    .line 267
    return-void

    .line 268
    :cond_a
    move-wide v3, v1

    .line 269
    goto :goto_5

    .line 270
    :cond_b
    move-wide v3, v14

    .line 271
    :goto_5
    :try_start_1
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 272
    .line 273
    iget v1, v1, Lh0/i0;->e:I

    .line 274
    .line 275
    if-ne v1, v0, :cond_c

    .line 276
    .line 277
    move v6, v8

    .line 278
    goto :goto_6

    .line 279
    :cond_c
    move v6, v7

    .line 280
    :goto_6
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 281
    .line 282
    iget-object v1, v0, Lh0/X;->i:Lh0/V;

    .line 283
    .line 284
    iget-object v0, v0, Lh0/X;->j:Lh0/V;

    .line 285
    .line 286
    if-eq v1, v0, :cond_d

    .line 287
    .line 288
    move v5, v8

    .line 289
    goto :goto_7

    .line 290
    :cond_d
    move v5, v7

    .line 291
    :goto_7
    move-object/from16 v1, p0

    .line 292
    .line 293
    move-object v2, v9

    .line 294
    invoke-virtual/range {v1 .. v6}, Lh0/N;->O(Lx0/H;JZZ)J

    .line 295
    .line 296
    .line 297
    move-result-wide v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 298
    cmp-long v0, v14, v16

    .line 299
    .line 300
    if-eqz v0, :cond_e

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_e
    move v8, v7

    .line 304
    :goto_8
    or-int/2addr v10, v8

    .line 305
    :try_start_2
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 306
    .line 307
    iget-object v4, v0, Lh0/i0;->a:La0/U;

    .line 308
    .line 309
    iget-object v5, v0, Lh0/i0;->b:Lx0/H;

    .line 310
    .line 311
    const/4 v8, 0x1

    .line 312
    move-object/from16 v1, p0

    .line 313
    .line 314
    move-object v2, v4

    .line 315
    move-object v3, v9

    .line 316
    move-wide v6, v12

    .line 317
    invoke-virtual/range {v1 .. v8}, Lh0/N;->l0(La0/U;Lx0/H;La0/U;Lx0/H;JZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 318
    .line 319
    .line 320
    move-wide/from16 v7, v16

    .line 321
    .line 322
    :goto_9
    const/4 v0, 0x2

    .line 323
    move-object/from16 v1, p0

    .line 324
    .line 325
    move-object v2, v9

    .line 326
    move-wide v3, v7

    .line 327
    move-wide v5, v12

    .line 328
    move v9, v10

    .line 329
    move v10, v0

    .line 330
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iput-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 335
    .line 336
    return-void

    .line 337
    :catchall_1
    move-exception v0

    .line 338
    move-wide/from16 v7, v16

    .line 339
    .line 340
    :goto_a
    const/4 v14, 0x2

    .line 341
    move-object/from16 v1, p0

    .line 342
    .line 343
    move-object v2, v9

    .line 344
    move-wide v3, v7

    .line 345
    move-wide v5, v12

    .line 346
    move v9, v10

    .line 347
    move v10, v14

    .line 348
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 353
    .line 354
    throw v0
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
.end method

.method public final O(Lx0/H;JZZ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh0/N;->g0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Lh0/N;->m0(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Lh0/N;->L:Lh0/i0;

    .line 13
    .line 14
    iget p5, p5, Lh0/i0;->e:I

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-ne p5, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v1}, Lh0/N;->b0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Lh0/N;->D:Lh0/X;

    .line 23
    .line 24
    iget-object v2, p5, Lh0/X;->i:Lh0/V;

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget-object v4, v3, Lh0/V;->g:Lh0/W;

    .line 30
    .line 31
    iget-object v4, v4, Lh0/W;->a:Lx0/H;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v3, v3, Lh0/V;->m:Lh0/V;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 44
    .line 45
    if-ne v2, v3, :cond_4

    .line 46
    .line 47
    if-eqz v3, :cond_7

    .line 48
    .line 49
    iget-wide v4, v3, Lh0/V;->p:J

    .line 50
    .line 51
    add-long/2addr v4, p2

    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmp-long p1, v4, v6

    .line 55
    .line 56
    if-gez p1, :cond_7

    .line 57
    .line 58
    :cond_4
    move p1, v0

    .line 59
    :goto_2
    iget-object p4, p0, Lh0/N;->l:[Lh0/o0;

    .line 60
    .line 61
    array-length v2, p4

    .line 62
    if-ge p1, v2, :cond_5

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lh0/N;->c(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz v3, :cond_7

    .line 71
    .line 72
    :goto_3
    iget-object p1, p5, Lh0/X;->i:Lh0/V;

    .line 73
    .line 74
    if-eq p1, v3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p5}, Lh0/X;->a()Lh0/V;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    invoke-virtual {p5, v3}, Lh0/X;->l(Lh0/V;)Z

    .line 81
    .line 82
    .line 83
    const-wide v4, 0xe8d4a51000L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    iput-wide v4, v3, Lh0/V;->p:J

    .line 89
    .line 90
    array-length p1, p4

    .line 91
    new-array p1, p1, [Z

    .line 92
    .line 93
    iget-object p4, p5, Lh0/X;->j:Lh0/V;

    .line 94
    .line 95
    invoke-virtual {p4}, Lh0/V;->e()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-virtual {p0, p1, v4, v5}, Lh0/N;->f([ZJ)V

    .line 100
    .line 101
    .line 102
    :cond_7
    if-eqz v3, :cond_a

    .line 103
    .line 104
    invoke-virtual {p5, v3}, Lh0/X;->l(Lh0/V;)Z

    .line 105
    .line 106
    .line 107
    iget-boolean p1, v3, Lh0/V;->e:Z

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    iget-object p1, v3, Lh0/V;->g:Lh0/W;

    .line 112
    .line 113
    invoke-virtual {p1, p2, p3}, Lh0/W;->b(J)Lh0/W;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v3, Lh0/V;->g:Lh0/W;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    iget-boolean p1, v3, Lh0/V;->f:Z

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iget-object p1, v3, Lh0/V;->a:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-interface {p1, p2, p3}, Lx0/F;->o(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide p2

    .line 130
    iget-wide p4, p0, Lh0/N;->y:J

    .line 131
    .line 132
    sub-long p4, p2, p4

    .line 133
    .line 134
    invoke-interface {p1, p4, p5}, Lx0/F;->p(J)V

    .line 135
    .line 136
    .line 137
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lh0/N;->H(J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lh0/N;->u()V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_a
    invoke-virtual {p5}, Lh0/X;->b()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p2, p3}, Lh0/N;->H(J)V

    .line 148
    .line 149
    .line 150
    :goto_5
    invoke-virtual {p0, v0}, Lh0/N;->m(Z)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lh0/N;->t:Ld0/t;

    .line 154
    .line 155
    invoke-virtual {p1, v1}, Ld0/t;->e(I)Z

    .line 156
    .line 157
    .line 158
    return-wide p2
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

.method public final P(Lh0/l0;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lh0/l0;->f:Landroid/os/Looper;

    .line 2
    .line 3
    iget-object v1, p0, Lh0/N;->v:Landroid/os/Looper;

    .line 4
    .line 5
    iget-object v2, p0, Lh0/N;->t:Ld0/t;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    monitor-exit p1

    .line 11
    const/4 v0, 0x1

    .line 12
    :try_start_0
    iget-object v1, p1, Lh0/l0;->a:Lh0/o0;

    .line 13
    .line 14
    iget v3, p1, Lh0/l0;->d:I

    .line 15
    .line 16
    iget-object v4, p1, Lh0/l0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v1, v3, v4}, Lh0/k0;->handleMessage(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lh0/l0;->b(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 25
    .line 26
    iget p1, p1, Lh0/i0;->e:I

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    if-ne p1, v1, :cond_2

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v2, v1}, Ld0/t;->e(I)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    invoke-virtual {p1, v0}, Lh0/l0;->b(Z)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    const/16 v0, 0xf

    .line 44
    .line 45
    invoke-virtual {v2, v0, p1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ld0/s;->b()V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-void
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

.method public final Q(Lh0/l0;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lh0/l0;->f:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "TAG"

    .line 14
    .line 15
    const-string v1, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {v0, v1}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lh0/l0;->b(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, Lh0/N;->B:Ld0/r;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Ld0/r;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld0/t;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, LD0/y;

    .line 33
    .line 34
    const/16 v2, 0xf

    .line 35
    .line 36
    invoke-direct {v1, p0, v2, p1}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ld0/t;->c(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
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

.method public final S(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lh0/N;->V:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lh0/N;->V:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lh0/N;->l:[Lh0/o0;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, Lh0/N;->s(Lh0/o0;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lh0/N;->m:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, Lh0/o0;->reset()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    const/4 p1, 0x1

    .line 41
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_1
    return-void
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

.method public final T(Lh0/I;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lh0/I;->c:I

    .line 8
    .line 9
    iget-object v1, p1, Lh0/I;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iget-object v3, p1, Lh0/I;->b:Lx0/j0;

    .line 13
    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, Lh0/M;

    .line 17
    .line 18
    new-instance v2, Lh0/n0;

    .line 19
    .line 20
    invoke-direct {v2, v1, v3}, Lh0/n0;-><init>(Ljava/util/ArrayList;Lx0/j0;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, Lh0/I;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, Lh0/I;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v2, v4, v5, v6}, Lh0/M;-><init>(La0/U;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lh0/N;->Z:Lh0/M;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lh0/N;->E:Lh0/g0;

    .line 33
    .line 34
    iget-object v0, p1, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {p1, v4, v2}, Lh0/g0;->g(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0, v1, v3}, Lh0/g0;->a(ILjava/util/ArrayList;Lx0/j0;)La0/U;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1, v4}, Lh0/N;->n(La0/U;Z)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final U(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lh0/N;->O:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lh0/N;->G()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lh0/N;->P:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lh0/N;->D:Lh0/X;

    .line 11
    .line 12
    iget-object v0, p1, Lh0/X;->j:Lh0/V;

    .line 13
    .line 14
    iget-object p1, p1, Lh0/X;->i:Lh0/V;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lh0/N;->M(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lh0/N;->m(Z)V

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

.method public final V(IIZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Lh0/K;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, Lh0/N;->L:Lh0/i0;

    .line 7
    .line 8
    invoke-virtual {p4, p2, p1, p3}, Lh0/i0;->d(IIZ)Lh0/i0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1, p1}, Lh0/N;->m0(ZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lh0/N;->D:Lh0/X;

    .line 19
    .line 20
    iget-object p2, p2, Lh0/X;->i:Lh0/V;

    .line 21
    .line 22
    :goto_0
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iget-object p4, p2, Lh0/V;->o:LA0/A;

    .line 25
    .line 26
    iget-object p4, p4, LA0/A;->c:[LA0/w;

    .line 27
    .line 28
    array-length v0, p4

    .line 29
    move v1, p1

    .line 30
    :goto_1
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    aget-object v2, p4, v1

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v2, p3}, LA0/w;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object p2, p2, Lh0/V;->m:Lh0/V;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Lh0/N;->c0()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lh0/N;->g0()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lh0/N;->k0()V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    iget-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 59
    .line 60
    iget p1, p1, Lh0/i0;->e:I

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    iget-object p3, p0, Lh0/N;->t:Ld0/t;

    .line 64
    .line 65
    const/4 p4, 0x2

    .line 66
    if-ne p1, p2, :cond_4

    .line 67
    .line 68
    iget-object p1, p0, Lh0/N;->z:Le3/e;

    .line 69
    .line 70
    const/4 p2, 0x1

    .line 71
    iput-boolean p2, p1, Le3/e;->m:Z

    .line 72
    .line 73
    iget-object p1, p1, Le3/e;->n:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lh0/u0;

    .line 76
    .line 77
    invoke-virtual {p1}, Lh0/u0;->c()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lh0/N;->e0()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3, p4}, Ld0/t;->e(I)Z

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    if-ne p1, p4, :cond_5

    .line 88
    .line 89
    invoke-virtual {p3, p4}, Ld0/t;->e(I)Z

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_2
    return-void
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

.method public final W(La0/J;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->t:Ld0/t;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ld0/t;->d(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh0/N;->z:Le3/e;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Le3/e;->a(La0/J;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Le3/e;->d()La0/J;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v0, p1, La0/J;->a:F

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, p1, v0, v1, v1}, Lh0/N;->p(La0/J;FZZ)V

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

.method public final X(Lh0/r;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lh0/N;->g0:Lh0/r;

    .line 2
    .line 3
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 4
    .line 5
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 6
    .line 7
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    iget-object v2, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v1, v2, :cond_0

    .line 36
    .line 37
    iget-object v2, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lh0/V;

    .line 44
    .line 45
    invoke-virtual {v2}, Lh0/V;->i()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p1, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, v0, Lh0/X;->l:Lh0/V;

    .line 55
    .line 56
    invoke-virtual {v0}, Lh0/X;->j()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
    .line 60
    .line 61
.end method

.method public final Y(I)V
    .locals 2

    .line 1
    iput p1, p0, Lh0/N;->T:I

    .line 2
    .line 3
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 4
    .line 5
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 6
    .line 7
    iget-object v1, p0, Lh0/N;->D:Lh0/X;

    .line 8
    .line 9
    iput p1, v1, Lh0/X;->g:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lh0/X;->p(La0/U;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lh0/N;->M(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lh0/N;->m(Z)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public final Z(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lh0/N;->U:Z

    .line 2
    .line 3
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 4
    .line 5
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 6
    .line 7
    iget-object v1, p0, Lh0/N;->D:Lh0/X;

    .line 8
    .line 9
    iput-boolean p1, v1, Lh0/X;->h:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lh0/X;->p(La0/U;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lh0/N;->M(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lh0/N;->m(Z)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public final a(Lx0/F;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->t:Ld0/t;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ld0/s;->b()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final a0(Lx0/j0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh0/N;->E:Lh0/g0;

    .line 8
    .line 9
    iget-object v1, v0, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, Lx0/i0;

    .line 17
    .line 18
    iget-object v3, v2, Lx0/i0;->b:[I

    .line 19
    .line 20
    array-length v3, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eq v3, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Lx0/i0;->a()Lx0/i0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v4, v1}, Lx0/i0;->b(II)Lx0/i0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_0
    iput-object p1, v0, Lh0/g0;->j:Lx0/j0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lh0/g0;->b()La0/U;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v4}, Lh0/N;->n(La0/U;Z)V

    .line 39
    .line 40
    .line 41
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
.end method

.method public final b(Lh0/I;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, Lh0/N;->E:Lh0/g0;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :cond_0
    iget-object v0, p1, Lh0/I;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p1, p1, Lh0/I;->b:Lx0/j0;

    .line 21
    .line 22
    invoke-virtual {v1, p2, v0, p1}, Lh0/g0;->a(ILjava/util/ArrayList;Lx0/j0;)La0/U;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, p2}, Lh0/N;->n(La0/U;Z)V

    .line 28
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

.method public final b0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 2
    .line 3
    iget v1, v0, Lh0/i0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Lh0/N;->f0:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lh0/i0;->g(I)Lh0/i0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 22
    .line 23
    :cond_1
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

.method public final c(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/N;->l:[Lh0/o0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-static {v0}, Lh0/N;->s(Lh0/o0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, p1, v1}, Lh0/N;->y(IZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lh0/N;->z:Le3/e;

    .line 17
    .line 18
    iget-object v1, p1, Le3/e;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lh0/o0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, p1, Le3/e;->q:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v1, p1, Le3/e;->p:Ljava/lang/Object;

    .line 29
    .line 30
    iput-boolean v2, p1, Le3/e;->l:Z

    .line 31
    .line 32
    :cond_1
    invoke-interface {v0}, Lh0/o0;->getState()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v1, 0x2

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Lh0/o0;->stop()V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-interface {v0}, Lh0/o0;->disable()V

    .line 43
    .line 44
    .line 45
    iget p1, p0, Lh0/N;->Y:I

    .line 46
    .line 47
    sub-int/2addr p1, v2

    .line 48
    iput p1, p0, Lh0/N;->Y:I

    .line 49
    .line 50
    return-void
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

.method public final c0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lh0/i0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lh0/i0;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
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

.method public final d(Lx0/h0;)V
    .locals 2

    .line 1
    check-cast p1, Lx0/F;

    .line 2
    .line 3
    iget-object v0, p0, Lh0/N;->t:Ld0/t;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ld0/s;->b()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final d0(La0/U;Lx0/H;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Lx0/H;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, La0/U;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p2, Lx0/H;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lh0/N;->x:La0/S;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, La0/S;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Lh0/N;->w:La0/T;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, La0/U;->n(ILa0/T;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La0/T;->a()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-boolean p1, v0, La0/T;->i:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-wide p1, v0, La0/T;->f:J

    .line 41
    .line 42
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long p1, p1, v2

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    :cond_1
    :goto_0
    return v1
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

.method public final e()V
    .locals 61

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-object v0, v11, Lh0/N;->B:Ld0/r;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v12

    .line 12
    iget-object v0, v11, Lh0/N;->t:Ld0/t;

    .line 13
    .line 14
    const/4 v14, 0x2

    .line 15
    invoke-virtual {v0, v14}, Ld0/t;->d(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 19
    .line 20
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 21
    .line 22
    invoke-virtual {v0}, La0/U;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const/4 v15, 0x0

    .line 32
    const/4 v6, 0x1

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, v11, Lh0/N;->E:Lh0/g0;

    .line 36
    .line 37
    iget-boolean v0, v0, Lh0/g0;->k:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    const/4 v2, 0x3

    .line 42
    const/4 v14, 0x0

    .line 43
    goto/16 :goto_21

    .line 44
    .line 45
    :cond_1
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 46
    .line 47
    iget-wide v1, v11, Lh0/N;->a0:J

    .line 48
    .line 49
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v3, v0, Lh0/V;->m:Lh0/V;

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    move v3, v6

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v3, 0x0

    .line 60
    :goto_0
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 61
    .line 62
    .line 63
    iget-boolean v3, v0, Lh0/V;->e:Z

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    iget-object v3, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 68
    .line 69
    iget-wide v4, v0, Lh0/V;->p:J

    .line 70
    .line 71
    sub-long/2addr v1, v4

    .line 72
    invoke-interface {v3, v1, v2}, Lx0/h0;->u(J)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 76
    .line 77
    iget-object v1, v0, Lh0/X;->k:Lh0/V;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    iget-object v2, v1, Lh0/V;->g:Lh0/W;

    .line 82
    .line 83
    iget-boolean v2, v2, Lh0/W;->i:Z

    .line 84
    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v1}, Lh0/V;->g()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    iget-object v1, v0, Lh0/X;->k:Lh0/V;

    .line 94
    .line 95
    iget-object v1, v1, Lh0/V;->g:Lh0/W;

    .line 96
    .line 97
    iget-wide v1, v1, Lh0/W;->e:J

    .line 98
    .line 99
    cmp-long v1, v1, v9

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    iget v0, v0, Lh0/X;->m:I

    .line 104
    .line 105
    const/16 v1, 0x64

    .line 106
    .line 107
    if-ge v0, v1, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const/4 v0, 0x0

    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :cond_5
    :goto_1
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 114
    .line 115
    iget-wide v1, v11, Lh0/N;->a0:J

    .line 116
    .line 117
    iget-object v3, v11, Lh0/N;->L:Lh0/i0;

    .line 118
    .line 119
    iget-object v4, v0, Lh0/X;->k:Lh0/V;

    .line 120
    .line 121
    if-nez v4, :cond_6

    .line 122
    .line 123
    iget-object v1, v3, Lh0/i0;->a:La0/U;

    .line 124
    .line 125
    iget-object v2, v3, Lh0/i0;->b:Lx0/H;

    .line 126
    .line 127
    iget-wide v4, v3, Lh0/i0;->c:J

    .line 128
    .line 129
    iget-wide v7, v3, Lh0/i0;->s:J

    .line 130
    .line 131
    move-object/from16 v16, v0

    .line 132
    .line 133
    move-object/from16 v17, v1

    .line 134
    .line 135
    move-object/from16 v18, v2

    .line 136
    .line 137
    move-wide/from16 v19, v4

    .line 138
    .line 139
    move-wide/from16 v21, v7

    .line 140
    .line 141
    invoke-virtual/range {v16 .. v22}, Lh0/X;->d(La0/U;Lx0/H;JJ)Lh0/W;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_2

    .line 146
    :cond_6
    iget-object v3, v3, Lh0/i0;->a:La0/U;

    .line 147
    .line 148
    invoke-virtual {v0, v3, v4, v1, v2}, Lh0/X;->c(La0/U;Lh0/V;J)Lh0/W;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_2
    if-eqz v0, :cond_4

    .line 153
    .line 154
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 155
    .line 156
    iget-object v2, v1, Lh0/X;->k:Lh0/V;

    .line 157
    .line 158
    if-nez v2, :cond_7

    .line 159
    .line 160
    const-wide v2, 0xe8d4a51000L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    iget-wide v3, v2, Lh0/V;->p:J

    .line 167
    .line 168
    iget-object v2, v2, Lh0/V;->g:Lh0/W;

    .line 169
    .line 170
    iget-wide v7, v2, Lh0/W;->e:J

    .line 171
    .line 172
    add-long/2addr v3, v7

    .line 173
    iget-wide v7, v0, Lh0/W;->b:J

    .line 174
    .line 175
    sub-long/2addr v3, v7

    .line 176
    move-wide v2, v3

    .line 177
    :goto_3
    const/4 v4, 0x0

    .line 178
    :goto_4
    iget-object v5, v1, Lh0/X;->p:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-ge v4, v5, :cond_a

    .line 185
    .line 186
    iget-object v5, v1, Lh0/X;->p:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lh0/V;

    .line 193
    .line 194
    iget-object v5, v5, Lh0/V;->g:Lh0/W;

    .line 195
    .line 196
    iget-wide v7, v5, Lh0/W;->e:J

    .line 197
    .line 198
    cmp-long v16, v7, v9

    .line 199
    .line 200
    if-eqz v16, :cond_8

    .line 201
    .line 202
    iget-wide v9, v0, Lh0/W;->e:J

    .line 203
    .line 204
    cmp-long v7, v7, v9

    .line 205
    .line 206
    if-nez v7, :cond_9

    .line 207
    .line 208
    :cond_8
    iget-wide v7, v5, Lh0/W;->b:J

    .line 209
    .line 210
    iget-wide v9, v0, Lh0/W;->b:J

    .line 211
    .line 212
    cmp-long v7, v7, v9

    .line 213
    .line 214
    if-nez v7, :cond_9

    .line 215
    .line 216
    iget-object v5, v5, Lh0/W;->a:Lx0/H;

    .line 217
    .line 218
    iget-object v7, v0, Lh0/W;->a:Lx0/H;

    .line 219
    .line 220
    invoke-virtual {v5, v7}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_9

    .line 225
    .line 226
    iget-object v5, v1, Lh0/X;->p:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, Lh0/V;

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 236
    .line 237
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_a
    move-object v4, v15

    .line 244
    :goto_5
    if-nez v4, :cond_b

    .line 245
    .line 246
    iget-object v4, v1, Lh0/X;->e:LI2/g;

    .line 247
    .line 248
    new-instance v5, Lh0/V;

    .line 249
    .line 250
    iget-object v4, v4, LI2/g;->m:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, Lh0/N;

    .line 253
    .line 254
    iget-object v7, v4, Lh0/N;->r:Lh0/Q;

    .line 255
    .line 256
    check-cast v7, Lh0/m;

    .line 257
    .line 258
    iget-object v7, v7, Lh0/m;->a:LB0/f;

    .line 259
    .line 260
    iget-object v8, v4, Lh0/N;->g0:Lh0/r;

    .line 261
    .line 262
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v8, v4, Lh0/N;->E:Lh0/g0;

    .line 266
    .line 267
    iget-object v9, v4, Lh0/N;->q:LA0/A;

    .line 268
    .line 269
    iget-object v10, v4, Lh0/N;->n:[Lh0/q0;

    .line 270
    .line 271
    iget-object v4, v4, Lh0/N;->p:LA0/z;

    .line 272
    .line 273
    move-object/from16 v25, v5

    .line 274
    .line 275
    move-object/from16 v26, v10

    .line 276
    .line 277
    move-wide/from16 v27, v2

    .line 278
    .line 279
    move-object/from16 v29, v4

    .line 280
    .line 281
    move-object/from16 v30, v7

    .line 282
    .line 283
    move-object/from16 v31, v8

    .line 284
    .line 285
    move-object/from16 v32, v0

    .line 286
    .line 287
    move-object/from16 v33, v9

    .line 288
    .line 289
    invoke-direct/range {v25 .. v33}, Lh0/V;-><init>([Lh0/q0;JLA0/z;LB0/f;Lh0/g0;Lh0/W;LA0/A;)V

    .line 290
    .line 291
    .line 292
    move-object v4, v5

    .line 293
    goto :goto_6

    .line 294
    :cond_b
    iput-object v0, v4, Lh0/V;->g:Lh0/W;

    .line 295
    .line 296
    iput-wide v2, v4, Lh0/V;->p:J

    .line 297
    .line 298
    :goto_6
    iget-object v2, v1, Lh0/X;->k:Lh0/V;

    .line 299
    .line 300
    if-eqz v2, :cond_d

    .line 301
    .line 302
    iget-object v3, v2, Lh0/V;->m:Lh0/V;

    .line 303
    .line 304
    if-ne v4, v3, :cond_c

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_c
    invoke-virtual {v2}, Lh0/V;->b()V

    .line 308
    .line 309
    .line 310
    iput-object v4, v2, Lh0/V;->m:Lh0/V;

    .line 311
    .line 312
    invoke-virtual {v2}, Lh0/V;->c()V

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_d
    iput-object v4, v1, Lh0/X;->i:Lh0/V;

    .line 317
    .line 318
    iput-object v4, v1, Lh0/X;->j:Lh0/V;

    .line 319
    .line 320
    :goto_7
    iput-object v15, v1, Lh0/X;->n:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v4, v1, Lh0/X;->k:Lh0/V;

    .line 323
    .line 324
    iget v2, v1, Lh0/X;->m:I

    .line 325
    .line 326
    add-int/2addr v2, v6

    .line 327
    iput v2, v1, Lh0/X;->m:I

    .line 328
    .line 329
    invoke-virtual {v1}, Lh0/X;->k()V

    .line 330
    .line 331
    .line 332
    iget-boolean v1, v4, Lh0/V;->d:Z

    .line 333
    .line 334
    if-nez v1, :cond_e

    .line 335
    .line 336
    iget-wide v1, v0, Lh0/W;->b:J

    .line 337
    .line 338
    iput-boolean v6, v4, Lh0/V;->d:Z

    .line 339
    .line 340
    iget-object v3, v4, Lh0/V;->a:Ljava/lang/Object;

    .line 341
    .line 342
    invoke-interface {v3, v11, v1, v2}, Lx0/F;->t(Lx0/E;J)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_e
    iget-boolean v1, v4, Lh0/V;->e:Z

    .line 347
    .line 348
    if-eqz v1, :cond_f

    .line 349
    .line 350
    iget-object v1, v11, Lh0/N;->t:Ld0/t;

    .line 351
    .line 352
    iget-object v2, v4, Lh0/V;->a:Ljava/lang/Object;

    .line 353
    .line 354
    const/16 v3, 0x8

    .line 355
    .line 356
    invoke-virtual {v1, v3, v2}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v1}, Ld0/s;->b()V

    .line 361
    .line 362
    .line 363
    :cond_f
    :goto_8
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 364
    .line 365
    iget-object v1, v1, Lh0/X;->i:Lh0/V;

    .line 366
    .line 367
    if-ne v1, v4, :cond_10

    .line 368
    .line 369
    iget-wide v0, v0, Lh0/W;->b:J

    .line 370
    .line 371
    invoke-virtual {v11, v0, v1}, Lh0/N;->H(J)V

    .line 372
    .line 373
    .line 374
    :cond_10
    const/4 v0, 0x0

    .line 375
    invoke-virtual {v11, v0}, Lh0/N;->m(Z)V

    .line 376
    .line 377
    .line 378
    :goto_9
    iget-boolean v1, v11, Lh0/N;->S:Z

    .line 379
    .line 380
    if-eqz v1, :cond_11

    .line 381
    .line 382
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 383
    .line 384
    iget-object v1, v1, Lh0/X;->k:Lh0/V;

    .line 385
    .line 386
    invoke-static {v1}, Lh0/N;->r(Lh0/V;)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    iput-boolean v1, v11, Lh0/N;->S:Z

    .line 391
    .line 392
    invoke-virtual/range {p0 .. p0}, Lh0/N;->h0()V

    .line 393
    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_11
    invoke-virtual/range {p0 .. p0}, Lh0/N;->u()V

    .line 397
    .line 398
    .line 399
    :goto_a
    iget-object v9, v11, Lh0/N;->D:Lh0/X;

    .line 400
    .line 401
    iget-object v1, v9, Lh0/X;->j:Lh0/V;

    .line 402
    .line 403
    if-nez v1, :cond_14

    .line 404
    .line 405
    :cond_12
    :goto_b
    move v14, v0

    .line 406
    :cond_13
    :goto_c
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    goto/16 :goto_15

    .line 412
    .line 413
    :cond_14
    iget-object v2, v1, Lh0/V;->m:Lh0/V;

    .line 414
    .line 415
    iget-object v10, v11, Lh0/N;->l:[Lh0/o0;

    .line 416
    .line 417
    if-eqz v2, :cond_15

    .line 418
    .line 419
    iget-boolean v2, v11, Lh0/N;->P:Z

    .line 420
    .line 421
    if-eqz v2, :cond_16

    .line 422
    .line 423
    :cond_15
    move v14, v0

    .line 424
    goto/16 :goto_11

    .line 425
    .line 426
    :cond_16
    iget-boolean v2, v1, Lh0/V;->e:Z

    .line 427
    .line 428
    if-nez v2, :cond_17

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_17
    move v2, v0

    .line 432
    :goto_d
    array-length v3, v10

    .line 433
    if-ge v2, v3, :cond_19

    .line 434
    .line 435
    aget-object v3, v10, v2

    .line 436
    .line 437
    iget-object v4, v1, Lh0/V;->c:[Lx0/f0;

    .line 438
    .line 439
    aget-object v4, v4, v2

    .line 440
    .line 441
    invoke-interface {v3}, Lh0/o0;->getStream()Lx0/f0;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    if-ne v5, v4, :cond_12

    .line 446
    .line 447
    if-eqz v4, :cond_18

    .line 448
    .line 449
    invoke-interface {v3}, Lh0/o0;->hasReadStreamToEnd()Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    if-nez v4, :cond_18

    .line 454
    .line 455
    iget-object v4, v1, Lh0/V;->m:Lh0/V;

    .line 456
    .line 457
    iget-object v5, v1, Lh0/V;->g:Lh0/W;

    .line 458
    .line 459
    iget-boolean v5, v5, Lh0/W;->f:Z

    .line 460
    .line 461
    if-eqz v5, :cond_12

    .line 462
    .line 463
    iget-boolean v5, v4, Lh0/V;->e:Z

    .line 464
    .line 465
    if-eqz v5, :cond_12

    .line 466
    .line 467
    instance-of v5, v3, Lz0/e;

    .line 468
    .line 469
    if-nez v5, :cond_18

    .line 470
    .line 471
    instance-of v5, v3, Lr0/c;

    .line 472
    .line 473
    if-nez v5, :cond_18

    .line 474
    .line 475
    invoke-interface {v3}, Lh0/o0;->getReadingPositionUs()J

    .line 476
    .line 477
    .line 478
    move-result-wide v7

    .line 479
    invoke-virtual {v4}, Lh0/V;->e()J

    .line 480
    .line 481
    .line 482
    move-result-wide v3

    .line 483
    cmp-long v3, v7, v3

    .line 484
    .line 485
    if-ltz v3, :cond_12

    .line 486
    .line 487
    :cond_18
    add-int/lit8 v2, v2, 0x1

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_19
    iget-object v2, v1, Lh0/V;->m:Lh0/V;

    .line 491
    .line 492
    iget-boolean v3, v2, Lh0/V;->e:Z

    .line 493
    .line 494
    if-nez v3, :cond_1a

    .line 495
    .line 496
    iget-wide v3, v11, Lh0/N;->a0:J

    .line 497
    .line 498
    invoke-virtual {v2}, Lh0/V;->e()J

    .line 499
    .line 500
    .line 501
    move-result-wide v7

    .line 502
    cmp-long v2, v3, v7

    .line 503
    .line 504
    if-gez v2, :cond_1a

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_1a
    iget-object v8, v1, Lh0/V;->o:LA0/A;

    .line 508
    .line 509
    iget-object v2, v9, Lh0/X;->j:Lh0/V;

    .line 510
    .line 511
    invoke-static {v2}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    iget-object v2, v2, Lh0/V;->m:Lh0/V;

    .line 515
    .line 516
    iput-object v2, v9, Lh0/X;->j:Lh0/V;

    .line 517
    .line 518
    invoke-virtual {v9}, Lh0/X;->k()V

    .line 519
    .line 520
    .line 521
    iget-object v7, v9, Lh0/X;->j:Lh0/V;

    .line 522
    .line 523
    invoke-static {v7}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    iget-object v5, v7, Lh0/V;->o:LA0/A;

    .line 527
    .line 528
    iget-object v2, v11, Lh0/N;->L:Lh0/i0;

    .line 529
    .line 530
    iget-object v4, v2, Lh0/i0;->a:La0/U;

    .line 531
    .line 532
    iget-object v2, v7, Lh0/V;->g:Lh0/W;

    .line 533
    .line 534
    iget-object v3, v2, Lh0/W;->a:Lx0/H;

    .line 535
    .line 536
    iget-object v1, v1, Lh0/V;->g:Lh0/W;

    .line 537
    .line 538
    iget-object v2, v1, Lh0/W;->a:Lx0/H;

    .line 539
    .line 540
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    const/16 v20, 0x0

    .line 546
    .line 547
    move-object/from16 v1, p0

    .line 548
    .line 549
    move-object/from16 v21, v2

    .line 550
    .line 551
    move-object v2, v4

    .line 552
    move-object v0, v5

    .line 553
    move-object/from16 v5, v21

    .line 554
    .line 555
    move-object v15, v7

    .line 556
    move-wide/from16 v6, v18

    .line 557
    .line 558
    move-object/from16 v34, v8

    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    move/from16 v8, v20

    .line 562
    .line 563
    invoke-virtual/range {v1 .. v8}, Lh0/N;->l0(La0/U;Lx0/H;La0/U;Lx0/H;JZ)V

    .line 564
    .line 565
    .line 566
    iget-boolean v1, v15, Lh0/V;->e:Z

    .line 567
    .line 568
    if-eqz v1, :cond_1d

    .line 569
    .line 570
    iget-object v1, v15, Lh0/V;->a:Ljava/lang/Object;

    .line 571
    .line 572
    invoke-interface {v1}, Lx0/F;->s()J

    .line 573
    .line 574
    .line 575
    move-result-wide v1

    .line 576
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    cmp-long v1, v1, v3

    .line 582
    .line 583
    if-eqz v1, :cond_1d

    .line 584
    .line 585
    invoke-virtual {v15}, Lh0/V;->e()J

    .line 586
    .line 587
    .line 588
    move-result-wide v0

    .line 589
    array-length v2, v10

    .line 590
    move v8, v14

    .line 591
    :goto_e
    if-ge v8, v2, :cond_1c

    .line 592
    .line 593
    aget-object v3, v10, v8

    .line 594
    .line 595
    invoke-interface {v3}, Lh0/o0;->getStream()Lx0/f0;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    if-eqz v4, :cond_1b

    .line 600
    .line 601
    invoke-static {v3, v0, v1}, Lh0/N;->R(Lh0/o0;J)V

    .line 602
    .line 603
    .line 604
    :cond_1b
    add-int/lit8 v8, v8, 0x1

    .line 605
    .line 606
    goto :goto_e

    .line 607
    :cond_1c
    invoke-virtual {v15}, Lh0/V;->g()Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-nez v0, :cond_13

    .line 612
    .line 613
    invoke-virtual {v9, v15}, Lh0/X;->l(Lh0/V;)Z

    .line 614
    .line 615
    .line 616
    invoke-virtual {v11, v14}, Lh0/N;->m(Z)V

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {p0 .. p0}, Lh0/N;->u()V

    .line 620
    .line 621
    .line 622
    goto/16 :goto_c

    .line 623
    .line 624
    :cond_1d
    move v8, v14

    .line 625
    :goto_f
    array-length v1, v10

    .line 626
    if-ge v8, v1, :cond_13

    .line 627
    .line 628
    move-object/from16 v1, v34

    .line 629
    .line 630
    invoke-virtual {v1, v8}, LA0/A;->b(I)Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    invoke-virtual {v0, v8}, LA0/A;->b(I)Z

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    if-eqz v2, :cond_20

    .line 639
    .line 640
    aget-object v2, v10, v8

    .line 641
    .line 642
    invoke-interface {v2}, Lh0/o0;->isCurrentStreamFinal()Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-nez v2, :cond_20

    .line 647
    .line 648
    iget-object v2, v11, Lh0/N;->n:[Lh0/q0;

    .line 649
    .line 650
    aget-object v2, v2, v8

    .line 651
    .line 652
    invoke-interface {v2}, Lh0/q0;->getTrackType()I

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    const/4 v4, -0x2

    .line 657
    if-ne v2, v4, :cond_1e

    .line 658
    .line 659
    const/4 v2, 0x1

    .line 660
    goto :goto_10

    .line 661
    :cond_1e
    move v2, v14

    .line 662
    :goto_10
    iget-object v4, v1, LA0/A;->b:[Lh0/r0;

    .line 663
    .line 664
    aget-object v4, v4, v8

    .line 665
    .line 666
    iget-object v5, v0, LA0/A;->b:[Lh0/r0;

    .line 667
    .line 668
    aget-object v5, v5, v8

    .line 669
    .line 670
    if-eqz v3, :cond_1f

    .line 671
    .line 672
    invoke-virtual {v5, v4}, Lh0/r0;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    if-eqz v3, :cond_1f

    .line 677
    .line 678
    if-eqz v2, :cond_20

    .line 679
    .line 680
    :cond_1f
    aget-object v2, v10, v8

    .line 681
    .line 682
    invoke-virtual {v15}, Lh0/V;->e()J

    .line 683
    .line 684
    .line 685
    move-result-wide v3

    .line 686
    invoke-static {v2, v3, v4}, Lh0/N;->R(Lh0/o0;J)V

    .line 687
    .line 688
    .line 689
    :cond_20
    add-int/lit8 v8, v8, 0x1

    .line 690
    .line 691
    move-object/from16 v34, v1

    .line 692
    .line 693
    goto :goto_f

    .line 694
    :goto_11
    iget-object v0, v1, Lh0/V;->g:Lh0/W;

    .line 695
    .line 696
    iget-boolean v0, v0, Lh0/W;->i:Z

    .line 697
    .line 698
    if-nez v0, :cond_21

    .line 699
    .line 700
    iget-boolean v0, v11, Lh0/N;->P:Z

    .line 701
    .line 702
    if-eqz v0, :cond_13

    .line 703
    .line 704
    :cond_21
    move v8, v14

    .line 705
    :goto_12
    array-length v0, v10

    .line 706
    if-ge v8, v0, :cond_13

    .line 707
    .line 708
    aget-object v0, v10, v8

    .line 709
    .line 710
    iget-object v2, v1, Lh0/V;->c:[Lx0/f0;

    .line 711
    .line 712
    aget-object v2, v2, v8

    .line 713
    .line 714
    if-eqz v2, :cond_23

    .line 715
    .line 716
    invoke-interface {v0}, Lh0/o0;->getStream()Lx0/f0;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    if-ne v3, v2, :cond_23

    .line 721
    .line 722
    invoke-interface {v0}, Lh0/o0;->hasReadStreamToEnd()Z

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    if-eqz v2, :cond_23

    .line 727
    .line 728
    iget-object v2, v1, Lh0/V;->g:Lh0/W;

    .line 729
    .line 730
    iget-wide v2, v2, Lh0/W;->e:J

    .line 731
    .line 732
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    cmp-long v4, v2, v15

    .line 738
    .line 739
    if-eqz v4, :cond_22

    .line 740
    .line 741
    const-wide/high16 v4, -0x8000000000000000L

    .line 742
    .line 743
    cmp-long v4, v2, v4

    .line 744
    .line 745
    if-eqz v4, :cond_22

    .line 746
    .line 747
    iget-wide v4, v1, Lh0/V;->p:J

    .line 748
    .line 749
    add-long v3, v4, v2

    .line 750
    .line 751
    goto :goto_13

    .line 752
    :cond_22
    move-wide v3, v15

    .line 753
    :goto_13
    invoke-static {v0, v3, v4}, Lh0/N;->R(Lh0/o0;J)V

    .line 754
    .line 755
    .line 756
    goto :goto_14

    .line 757
    :cond_23
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 763
    .line 764
    goto :goto_12

    .line 765
    :goto_15
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 766
    .line 767
    iget-object v1, v0, Lh0/X;->j:Lh0/V;

    .line 768
    .line 769
    if-eqz v1, :cond_2f

    .line 770
    .line 771
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 772
    .line 773
    if-eq v0, v1, :cond_2f

    .line 774
    .line 775
    iget-boolean v0, v1, Lh0/V;->h:Z

    .line 776
    .line 777
    if-eqz v0, :cond_24

    .line 778
    .line 779
    goto/16 :goto_1b

    .line 780
    .line 781
    :cond_24
    iget-object v0, v1, Lh0/V;->o:LA0/A;

    .line 782
    .line 783
    move v2, v14

    .line 784
    move v8, v2

    .line 785
    :goto_16
    iget-object v3, v11, Lh0/N;->l:[Lh0/o0;

    .line 786
    .line 787
    array-length v4, v3

    .line 788
    if-ge v8, v4, :cond_2e

    .line 789
    .line 790
    aget-object v23, v3, v8

    .line 791
    .line 792
    invoke-static/range {v23 .. v23}, Lh0/N;->s(Lh0/o0;)Z

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    if-nez v3, :cond_25

    .line 797
    .line 798
    goto/16 :goto_1a

    .line 799
    .line 800
    :cond_25
    invoke-interface/range {v23 .. v23}, Lh0/o0;->getStream()Lx0/f0;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    iget-object v4, v1, Lh0/V;->c:[Lx0/f0;

    .line 805
    .line 806
    aget-object v5, v4, v8

    .line 807
    .line 808
    if-eq v3, v5, :cond_26

    .line 809
    .line 810
    const/4 v3, 0x1

    .line 811
    goto :goto_17

    .line 812
    :cond_26
    move v3, v14

    .line 813
    :goto_17
    invoke-virtual {v0, v8}, LA0/A;->b(I)Z

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    if-eqz v5, :cond_27

    .line 818
    .line 819
    if-nez v3, :cond_27

    .line 820
    .line 821
    goto :goto_1a

    .line 822
    :cond_27
    invoke-interface/range {v23 .. v23}, Lh0/o0;->isCurrentStreamFinal()Z

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    if-nez v3, :cond_2b

    .line 827
    .line 828
    iget-object v3, v0, LA0/A;->c:[LA0/w;

    .line 829
    .line 830
    aget-object v3, v3, v8

    .line 831
    .line 832
    if-eqz v3, :cond_28

    .line 833
    .line 834
    invoke-interface {v3}, LA0/w;->length()I

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    goto :goto_18

    .line 839
    :cond_28
    move v5, v14

    .line 840
    :goto_18
    new-array v6, v5, [La0/p;

    .line 841
    .line 842
    move v7, v14

    .line 843
    :goto_19
    if-ge v7, v5, :cond_29

    .line 844
    .line 845
    invoke-interface {v3, v7}, LA0/w;->g(I)La0/p;

    .line 846
    .line 847
    .line 848
    move-result-object v9

    .line 849
    aput-object v9, v6, v7

    .line 850
    .line 851
    add-int/lit8 v7, v7, 0x1

    .line 852
    .line 853
    goto :goto_19

    .line 854
    :cond_29
    aget-object v25, v4, v8

    .line 855
    .line 856
    invoke-virtual {v1}, Lh0/V;->e()J

    .line 857
    .line 858
    .line 859
    move-result-wide v26

    .line 860
    iget-wide v3, v1, Lh0/V;->p:J

    .line 861
    .line 862
    iget-object v5, v1, Lh0/V;->g:Lh0/W;

    .line 863
    .line 864
    iget-object v5, v5, Lh0/W;->a:Lx0/H;

    .line 865
    .line 866
    move-object/from16 v24, v6

    .line 867
    .line 868
    move-wide/from16 v28, v3

    .line 869
    .line 870
    move-object/from16 v30, v5

    .line 871
    .line 872
    invoke-interface/range {v23 .. v30}, Lh0/o0;->replaceStream([La0/p;Lx0/f0;JJLx0/H;)V

    .line 873
    .line 874
    .line 875
    iget-boolean v3, v11, Lh0/N;->X:Z

    .line 876
    .line 877
    if-eqz v3, :cond_2d

    .line 878
    .line 879
    if-nez v3, :cond_2a

    .line 880
    .line 881
    goto :goto_1a

    .line 882
    :cond_2a
    iput-boolean v14, v11, Lh0/N;->X:Z

    .line 883
    .line 884
    iget-object v3, v11, Lh0/N;->L:Lh0/i0;

    .line 885
    .line 886
    iget-boolean v3, v3, Lh0/i0;->p:Z

    .line 887
    .line 888
    if-eqz v3, :cond_2d

    .line 889
    .line 890
    iget-object v3, v11, Lh0/N;->t:Ld0/t;

    .line 891
    .line 892
    const/4 v4, 0x2

    .line 893
    invoke-virtual {v3, v4}, Ld0/t;->e(I)Z

    .line 894
    .line 895
    .line 896
    goto :goto_1a

    .line 897
    :cond_2b
    invoke-interface/range {v23 .. v23}, Lh0/o0;->isEnded()Z

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    if-eqz v3, :cond_2c

    .line 902
    .line 903
    invoke-virtual {v11, v8}, Lh0/N;->c(I)V

    .line 904
    .line 905
    .line 906
    goto :goto_1a

    .line 907
    :cond_2c
    const/4 v2, 0x1

    .line 908
    :cond_2d
    :goto_1a
    add-int/lit8 v8, v8, 0x1

    .line 909
    .line 910
    goto :goto_16

    .line 911
    :cond_2e
    if-nez v2, :cond_2f

    .line 912
    .line 913
    array-length v0, v3

    .line 914
    new-array v0, v0, [Z

    .line 915
    .line 916
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 917
    .line 918
    iget-object v1, v1, Lh0/X;->j:Lh0/V;

    .line 919
    .line 920
    invoke-virtual {v1}, Lh0/V;->e()J

    .line 921
    .line 922
    .line 923
    move-result-wide v1

    .line 924
    invoke-virtual {v11, v0, v1, v2}, Lh0/N;->f([ZJ)V

    .line 925
    .line 926
    .line 927
    :cond_2f
    :goto_1b
    move v8, v14

    .line 928
    :goto_1c
    invoke-virtual/range {p0 .. p0}, Lh0/N;->c0()Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-nez v0, :cond_31

    .line 933
    .line 934
    :cond_30
    :goto_1d
    const/4 v2, 0x3

    .line 935
    goto/16 :goto_20

    .line 936
    .line 937
    :cond_31
    iget-boolean v0, v11, Lh0/N;->P:Z

    .line 938
    .line 939
    if-eqz v0, :cond_32

    .line 940
    .line 941
    goto :goto_1d

    .line 942
    :cond_32
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 943
    .line 944
    iget-object v1, v0, Lh0/X;->i:Lh0/V;

    .line 945
    .line 946
    if-nez v1, :cond_33

    .line 947
    .line 948
    goto :goto_1d

    .line 949
    :cond_33
    iget-object v1, v1, Lh0/V;->m:Lh0/V;

    .line 950
    .line 951
    if-eqz v1, :cond_30

    .line 952
    .line 953
    iget-wide v2, v11, Lh0/N;->a0:J

    .line 954
    .line 955
    invoke-virtual {v1}, Lh0/V;->e()J

    .line 956
    .line 957
    .line 958
    move-result-wide v4

    .line 959
    cmp-long v2, v2, v4

    .line 960
    .line 961
    if-ltz v2, :cond_30

    .line 962
    .line 963
    iget-boolean v1, v1, Lh0/V;->h:Z

    .line 964
    .line 965
    if-eqz v1, :cond_30

    .line 966
    .line 967
    if-eqz v8, :cond_34

    .line 968
    .line 969
    invoke-virtual/range {p0 .. p0}, Lh0/N;->w()V

    .line 970
    .line 971
    .line 972
    :cond_34
    invoke-virtual {v0}, Lh0/X;->a()Lh0/V;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    iget-object v2, v11, Lh0/N;->L:Lh0/i0;

    .line 980
    .line 981
    iget-object v2, v2, Lh0/i0;->b:Lx0/H;

    .line 982
    .line 983
    iget-object v2, v2, Lx0/H;->a:Ljava/lang/Object;

    .line 984
    .line 985
    iget-object v3, v1, Lh0/V;->g:Lh0/W;

    .line 986
    .line 987
    iget-object v3, v3, Lh0/W;->a:Lx0/H;

    .line 988
    .line 989
    iget-object v3, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 990
    .line 991
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v2

    .line 995
    if-eqz v2, :cond_35

    .line 996
    .line 997
    iget-object v2, v11, Lh0/N;->L:Lh0/i0;

    .line 998
    .line 999
    iget-object v2, v2, Lh0/i0;->b:Lx0/H;

    .line 1000
    .line 1001
    iget v3, v2, Lx0/H;->b:I

    .line 1002
    .line 1003
    const/4 v4, -0x1

    .line 1004
    if-ne v3, v4, :cond_35

    .line 1005
    .line 1006
    iget-object v3, v1, Lh0/V;->g:Lh0/W;

    .line 1007
    .line 1008
    iget-object v3, v3, Lh0/W;->a:Lx0/H;

    .line 1009
    .line 1010
    iget v5, v3, Lx0/H;->b:I

    .line 1011
    .line 1012
    if-ne v5, v4, :cond_35

    .line 1013
    .line 1014
    iget v2, v2, Lx0/H;->e:I

    .line 1015
    .line 1016
    iget v3, v3, Lx0/H;->e:I

    .line 1017
    .line 1018
    if-eq v2, v3, :cond_35

    .line 1019
    .line 1020
    const/4 v8, 0x1

    .line 1021
    goto :goto_1e

    .line 1022
    :cond_35
    move v8, v14

    .line 1023
    :goto_1e
    iget-object v1, v1, Lh0/V;->g:Lh0/W;

    .line 1024
    .line 1025
    iget-object v2, v1, Lh0/W;->a:Lx0/H;

    .line 1026
    .line 1027
    iget-wide v9, v1, Lh0/W;->b:J

    .line 1028
    .line 1029
    iget-wide v5, v1, Lh0/W;->c:J

    .line 1030
    .line 1031
    const/4 v1, 0x1

    .line 1032
    xor-int/lit8 v17, v8, 0x1

    .line 1033
    .line 1034
    const/16 v19, 0x0

    .line 1035
    .line 1036
    move-object/from16 v1, p0

    .line 1037
    .line 1038
    move-wide v3, v9

    .line 1039
    move-wide v7, v9

    .line 1040
    move/from16 v9, v17

    .line 1041
    .line 1042
    move/from16 v10, v19

    .line 1043
    .line 1044
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1049
    .line 1050
    invoke-virtual/range {p0 .. p0}, Lh0/N;->G()V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {p0 .. p0}, Lh0/N;->k0()V

    .line 1054
    .line 1055
    .line 1056
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1057
    .line 1058
    iget v1, v1, Lh0/i0;->e:I

    .line 1059
    .line 1060
    const/4 v2, 0x3

    .line 1061
    if-ne v1, v2, :cond_36

    .line 1062
    .line 1063
    invoke-virtual/range {p0 .. p0}, Lh0/N;->e0()V

    .line 1064
    .line 1065
    .line 1066
    :cond_36
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 1067
    .line 1068
    iget-object v0, v0, Lh0/V;->o:LA0/A;

    .line 1069
    .line 1070
    move v8, v14

    .line 1071
    :goto_1f
    iget-object v1, v11, Lh0/N;->l:[Lh0/o0;

    .line 1072
    .line 1073
    array-length v3, v1

    .line 1074
    if-ge v8, v3, :cond_38

    .line 1075
    .line 1076
    invoke-virtual {v0, v8}, LA0/A;->b(I)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v3

    .line 1080
    if-eqz v3, :cond_37

    .line 1081
    .line 1082
    aget-object v1, v1, v8

    .line 1083
    .line 1084
    invoke-interface {v1}, Lh0/o0;->enableMayRenderStartOfStream()V

    .line 1085
    .line 1086
    .line 1087
    :cond_37
    add-int/lit8 v8, v8, 0x1

    .line 1088
    .line 1089
    goto :goto_1f

    .line 1090
    :cond_38
    const/4 v8, 0x1

    .line 1091
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    goto/16 :goto_1c

    .line 1097
    .line 1098
    :goto_20
    iget-object v0, v11, Lh0/N;->g0:Lh0/r;

    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    :goto_21
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 1104
    .line 1105
    iget v0, v0, Lh0/i0;->e:I

    .line 1106
    .line 1107
    const/4 v1, 0x1

    .line 1108
    if-eq v0, v1, :cond_6c

    .line 1109
    .line 1110
    const/4 v1, 0x4

    .line 1111
    if-ne v0, v1, :cond_39

    .line 1112
    .line 1113
    goto/16 :goto_3c

    .line 1114
    .line 1115
    :cond_39
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 1116
    .line 1117
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 1118
    .line 1119
    if-nez v0, :cond_3a

    .line 1120
    .line 1121
    invoke-virtual {v11, v12, v13}, Lh0/N;->L(J)V

    .line 1122
    .line 1123
    .line 1124
    return-void

    .line 1125
    :cond_3a
    const-string v3, "doSomeWork"

    .line 1126
    .line 1127
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual/range {p0 .. p0}, Lh0/N;->k0()V

    .line 1131
    .line 1132
    .line 1133
    iget-boolean v3, v0, Lh0/V;->e:Z

    .line 1134
    .line 1135
    if-eqz v3, :cond_43

    .line 1136
    .line 1137
    iget-object v3, v11, Lh0/N;->B:Ld0/r;

    .line 1138
    .line 1139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v3

    .line 1146
    invoke-static {v3, v4}, Ld0/w;->M(J)J

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v3

    .line 1150
    iput-wide v3, v11, Lh0/N;->b0:J

    .line 1151
    .line 1152
    iget-object v3, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 1153
    .line 1154
    iget-object v4, v11, Lh0/N;->L:Lh0/i0;

    .line 1155
    .line 1156
    iget-wide v4, v4, Lh0/i0;->s:J

    .line 1157
    .line 1158
    iget-wide v6, v11, Lh0/N;->y:J

    .line 1159
    .line 1160
    sub-long/2addr v4, v6

    .line 1161
    invoke-interface {v3, v4, v5}, Lx0/F;->p(J)V

    .line 1162
    .line 1163
    .line 1164
    move v8, v14

    .line 1165
    const/4 v3, 0x1

    .line 1166
    const/4 v6, 0x1

    .line 1167
    :goto_22
    iget-object v4, v11, Lh0/N;->l:[Lh0/o0;

    .line 1168
    .line 1169
    array-length v5, v4

    .line 1170
    if-ge v8, v5, :cond_44

    .line 1171
    .line 1172
    aget-object v4, v4, v8

    .line 1173
    .line 1174
    invoke-static {v4}, Lh0/N;->s(Lh0/o0;)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v5

    .line 1178
    if-nez v5, :cond_3b

    .line 1179
    .line 1180
    invoke-virtual {v11, v8, v14}, Lh0/N;->y(IZ)V

    .line 1181
    .line 1182
    .line 1183
    goto :goto_29

    .line 1184
    :cond_3b
    iget-wide v9, v11, Lh0/N;->a0:J

    .line 1185
    .line 1186
    iget-wide v1, v11, Lh0/N;->b0:J

    .line 1187
    .line 1188
    invoke-interface {v4, v9, v10, v1, v2}, Lh0/o0;->render(JJ)V

    .line 1189
    .line 1190
    .line 1191
    if-eqz v6, :cond_3c

    .line 1192
    .line 1193
    invoke-interface {v4}, Lh0/o0;->isEnded()Z

    .line 1194
    .line 1195
    .line 1196
    move-result v1

    .line 1197
    if-eqz v1, :cond_3c

    .line 1198
    .line 1199
    const/4 v1, 0x1

    .line 1200
    goto :goto_23

    .line 1201
    :cond_3c
    move v1, v14

    .line 1202
    :goto_23
    iget-object v2, v0, Lh0/V;->c:[Lx0/f0;

    .line 1203
    .line 1204
    aget-object v2, v2, v8

    .line 1205
    .line 1206
    invoke-interface {v4}, Lh0/o0;->getStream()Lx0/f0;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v6

    .line 1210
    if-eq v2, v6, :cond_3d

    .line 1211
    .line 1212
    const/4 v2, 0x1

    .line 1213
    goto :goto_24

    .line 1214
    :cond_3d
    move v2, v14

    .line 1215
    :goto_24
    if-nez v2, :cond_3e

    .line 1216
    .line 1217
    invoke-interface {v4}, Lh0/o0;->hasReadStreamToEnd()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v6

    .line 1221
    if-eqz v6, :cond_3e

    .line 1222
    .line 1223
    const/4 v6, 0x1

    .line 1224
    goto :goto_25

    .line 1225
    :cond_3e
    move v6, v14

    .line 1226
    :goto_25
    if-nez v2, :cond_40

    .line 1227
    .line 1228
    if-nez v6, :cond_40

    .line 1229
    .line 1230
    invoke-interface {v4}, Lh0/o0;->isReady()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    if-nez v2, :cond_40

    .line 1235
    .line 1236
    invoke-interface {v4}, Lh0/o0;->isEnded()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    if-eqz v2, :cond_3f

    .line 1241
    .line 1242
    goto :goto_26

    .line 1243
    :cond_3f
    move v2, v14

    .line 1244
    goto :goto_27

    .line 1245
    :cond_40
    :goto_26
    const/4 v2, 0x1

    .line 1246
    :goto_27
    invoke-virtual {v11, v8, v2}, Lh0/N;->y(IZ)V

    .line 1247
    .line 1248
    .line 1249
    if-eqz v3, :cond_41

    .line 1250
    .line 1251
    if-eqz v2, :cond_41

    .line 1252
    .line 1253
    const/4 v3, 0x1

    .line 1254
    goto :goto_28

    .line 1255
    :cond_41
    move v3, v14

    .line 1256
    :goto_28
    if-nez v2, :cond_42

    .line 1257
    .line 1258
    invoke-virtual {v11, v8}, Lh0/N;->x(I)V

    .line 1259
    .line 1260
    .line 1261
    :cond_42
    move v6, v1

    .line 1262
    :goto_29
    add-int/lit8 v8, v8, 0x1

    .line 1263
    .line 1264
    const/4 v1, 0x4

    .line 1265
    const/4 v2, 0x3

    .line 1266
    goto :goto_22

    .line 1267
    :cond_43
    iget-object v1, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 1268
    .line 1269
    invoke-interface {v1}, Lx0/F;->l()V

    .line 1270
    .line 1271
    .line 1272
    const/4 v3, 0x1

    .line 1273
    const/4 v6, 0x1

    .line 1274
    :cond_44
    iget-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 1275
    .line 1276
    iget-wide v1, v1, Lh0/W;->e:J

    .line 1277
    .line 1278
    if-eqz v6, :cond_46

    .line 1279
    .line 1280
    iget-boolean v4, v0, Lh0/V;->e:Z

    .line 1281
    .line 1282
    if-eqz v4, :cond_46

    .line 1283
    .line 1284
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    cmp-long v4, v1, v6

    .line 1290
    .line 1291
    if-eqz v4, :cond_45

    .line 1292
    .line 1293
    iget-object v4, v11, Lh0/N;->L:Lh0/i0;

    .line 1294
    .line 1295
    iget-wide v8, v4, Lh0/i0;->s:J

    .line 1296
    .line 1297
    cmp-long v1, v1, v8

    .line 1298
    .line 1299
    if-gtz v1, :cond_47

    .line 1300
    .line 1301
    :cond_45
    const/4 v8, 0x1

    .line 1302
    goto :goto_2a

    .line 1303
    :cond_46
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    :cond_47
    move v8, v14

    .line 1309
    :goto_2a
    if-eqz v8, :cond_48

    .line 1310
    .line 1311
    iget-boolean v1, v11, Lh0/N;->P:Z

    .line 1312
    .line 1313
    if-eqz v1, :cond_48

    .line 1314
    .line 1315
    iput-boolean v14, v11, Lh0/N;->P:Z

    .line 1316
    .line 1317
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1318
    .line 1319
    iget v1, v1, Lh0/i0;->n:I

    .line 1320
    .line 1321
    const/4 v2, 0x5

    .line 1322
    invoke-virtual {v11, v1, v2, v14, v14}, Lh0/N;->V(IIZZ)V

    .line 1323
    .line 1324
    .line 1325
    :cond_48
    if-eqz v8, :cond_4a

    .line 1326
    .line 1327
    iget-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 1328
    .line 1329
    iget-boolean v1, v1, Lh0/W;->i:Z

    .line 1330
    .line 1331
    if-eqz v1, :cond_4a

    .line 1332
    .line 1333
    const/4 v1, 0x4

    .line 1334
    invoke-virtual {v11, v1}, Lh0/N;->b0(I)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual/range {p0 .. p0}, Lh0/N;->g0()V

    .line 1338
    .line 1339
    .line 1340
    :cond_49
    const/4 v2, 0x1

    .line 1341
    goto/16 :goto_35

    .line 1342
    .line 1343
    :cond_4a
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1344
    .line 1345
    iget v2, v1, Lh0/i0;->e:I

    .line 1346
    .line 1347
    const/4 v4, 0x2

    .line 1348
    if-ne v2, v4, :cond_56

    .line 1349
    .line 1350
    iget v2, v11, Lh0/N;->Y:I

    .line 1351
    .line 1352
    if-nez v2, :cond_4b

    .line 1353
    .line 1354
    invoke-virtual/range {p0 .. p0}, Lh0/N;->t()Z

    .line 1355
    .line 1356
    .line 1357
    move-result v8

    .line 1358
    goto/16 :goto_31

    .line 1359
    .line 1360
    :cond_4b
    if-nez v3, :cond_4d

    .line 1361
    .line 1362
    :cond_4c
    move v8, v14

    .line 1363
    goto/16 :goto_31

    .line 1364
    .line 1365
    :cond_4d
    iget-boolean v2, v1, Lh0/i0;->g:Z

    .line 1366
    .line 1367
    if-nez v2, :cond_4f

    .line 1368
    .line 1369
    :cond_4e
    :goto_2b
    const/4 v8, 0x1

    .line 1370
    goto/16 :goto_31

    .line 1371
    .line 1372
    :cond_4f
    iget-object v2, v11, Lh0/N;->D:Lh0/X;

    .line 1373
    .line 1374
    iget-object v4, v2, Lh0/X;->i:Lh0/V;

    .line 1375
    .line 1376
    iget-object v1, v1, Lh0/i0;->a:La0/U;

    .line 1377
    .line 1378
    iget-object v4, v4, Lh0/V;->g:Lh0/W;

    .line 1379
    .line 1380
    iget-object v4, v4, Lh0/W;->a:Lx0/H;

    .line 1381
    .line 1382
    invoke-virtual {v11, v1, v4}, Lh0/N;->d0(La0/U;Lx0/H;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v1

    .line 1386
    if-eqz v1, :cond_50

    .line 1387
    .line 1388
    iget-object v1, v11, Lh0/N;->F:Lh0/O;

    .line 1389
    .line 1390
    check-cast v1, Lh0/k;

    .line 1391
    .line 1392
    iget-wide v9, v1, Lh0/k;->m:J

    .line 1393
    .line 1394
    goto :goto_2c

    .line 1395
    :cond_50
    move-wide v9, v6

    .line 1396
    :goto_2c
    iget-object v1, v2, Lh0/X;->k:Lh0/V;

    .line 1397
    .line 1398
    invoke-virtual {v1}, Lh0/V;->g()Z

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    if-eqz v2, :cond_51

    .line 1403
    .line 1404
    iget-object v2, v1, Lh0/V;->g:Lh0/W;

    .line 1405
    .line 1406
    iget-boolean v2, v2, Lh0/W;->i:Z

    .line 1407
    .line 1408
    if-eqz v2, :cond_51

    .line 1409
    .line 1410
    const/4 v8, 0x1

    .line 1411
    goto :goto_2d

    .line 1412
    :cond_51
    move v8, v14

    .line 1413
    :goto_2d
    iget-object v2, v1, Lh0/V;->g:Lh0/W;

    .line 1414
    .line 1415
    iget-object v2, v2, Lh0/W;->a:Lx0/H;

    .line 1416
    .line 1417
    invoke-virtual {v2}, Lx0/H;->b()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v2

    .line 1421
    if-eqz v2, :cond_52

    .line 1422
    .line 1423
    iget-boolean v2, v1, Lh0/V;->e:Z

    .line 1424
    .line 1425
    if-nez v2, :cond_52

    .line 1426
    .line 1427
    const/4 v2, 0x1

    .line 1428
    goto :goto_2e

    .line 1429
    :cond_52
    move v2, v14

    .line 1430
    :goto_2e
    if-nez v8, :cond_4e

    .line 1431
    .line 1432
    if-eqz v2, :cond_53

    .line 1433
    .line 1434
    goto :goto_2b

    .line 1435
    :cond_53
    invoke-virtual {v1}, Lh0/V;->d()J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v1

    .line 1439
    invoke-virtual {v11, v1, v2}, Lh0/N;->j(J)J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v1

    .line 1443
    iget-object v4, v11, Lh0/N;->L:Lh0/i0;

    .line 1444
    .line 1445
    iget-object v4, v4, Lh0/i0;->a:La0/U;

    .line 1446
    .line 1447
    iget-object v4, v11, Lh0/N;->z:Le3/e;

    .line 1448
    .line 1449
    invoke-virtual {v4}, Le3/e;->d()La0/J;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v4

    .line 1453
    iget v4, v4, La0/J;->a:F

    .line 1454
    .line 1455
    iget-object v8, v11, Lh0/N;->L:Lh0/i0;

    .line 1456
    .line 1457
    iget-boolean v8, v8, Lh0/i0;->l:Z

    .line 1458
    .line 1459
    iget-boolean v8, v11, Lh0/N;->Q:Z

    .line 1460
    .line 1461
    iget-object v15, v11, Lh0/N;->r:Lh0/Q;

    .line 1462
    .line 1463
    check-cast v15, Lh0/m;

    .line 1464
    .line 1465
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1466
    .line 1467
    .line 1468
    invoke-static {v1, v2, v4}, Ld0/w;->B(JF)J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v1

    .line 1472
    if-eqz v8, :cond_54

    .line 1473
    .line 1474
    iget-wide v5, v15, Lh0/m;->e:J

    .line 1475
    .line 1476
    :goto_2f
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    goto :goto_30

    .line 1482
    :cond_54
    iget-wide v5, v15, Lh0/m;->d:J

    .line 1483
    .line 1484
    goto :goto_2f

    .line 1485
    :goto_30
    cmp-long v16, v9, v7

    .line 1486
    .line 1487
    if-eqz v16, :cond_55

    .line 1488
    .line 1489
    const-wide/16 v7, 0x2

    .line 1490
    .line 1491
    div-long/2addr v9, v7

    .line 1492
    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 1493
    .line 1494
    .line 1495
    move-result-wide v5

    .line 1496
    :cond_55
    const-wide/16 v7, 0x0

    .line 1497
    .line 1498
    cmp-long v7, v5, v7

    .line 1499
    .line 1500
    if-lez v7, :cond_4e

    .line 1501
    .line 1502
    cmp-long v1, v1, v5

    .line 1503
    .line 1504
    if-gez v1, :cond_4e

    .line 1505
    .line 1506
    iget-boolean v1, v15, Lh0/m;->g:Z

    .line 1507
    .line 1508
    if-nez v1, :cond_4c

    .line 1509
    .line 1510
    iget-object v1, v15, Lh0/m;->a:LB0/f;

    .line 1511
    .line 1512
    monitor-enter v1

    .line 1513
    :try_start_0
    iget v2, v1, LB0/f;->d:I

    .line 1514
    .line 1515
    iget v5, v1, LB0/f;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1516
    .line 1517
    mul-int/2addr v2, v5

    .line 1518
    monitor-exit v1

    .line 1519
    invoke-virtual {v15}, Lh0/m;->b()I

    .line 1520
    .line 1521
    .line 1522
    move-result v1

    .line 1523
    if-lt v2, v1, :cond_4c

    .line 1524
    .line 1525
    goto/16 :goto_2b

    .line 1526
    .line 1527
    :catchall_0
    move-exception v0

    .line 1528
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1529
    throw v0

    .line 1530
    :goto_31
    if-eqz v8, :cond_56

    .line 1531
    .line 1532
    const/4 v1, 0x3

    .line 1533
    invoke-virtual {v11, v1}, Lh0/N;->b0(I)V

    .line 1534
    .line 1535
    .line 1536
    const/4 v1, 0x0

    .line 1537
    iput-object v1, v11, Lh0/N;->e0:Lh0/o;

    .line 1538
    .line 1539
    invoke-virtual/range {p0 .. p0}, Lh0/N;->c0()Z

    .line 1540
    .line 1541
    .line 1542
    move-result v1

    .line 1543
    if-eqz v1, :cond_49

    .line 1544
    .line 1545
    invoke-virtual {v11, v14, v14}, Lh0/N;->m0(ZZ)V

    .line 1546
    .line 1547
    .line 1548
    iget-object v1, v11, Lh0/N;->z:Le3/e;

    .line 1549
    .line 1550
    const/4 v2, 0x1

    .line 1551
    iput-boolean v2, v1, Le3/e;->m:Z

    .line 1552
    .line 1553
    iget-object v1, v1, Le3/e;->n:Ljava/lang/Object;

    .line 1554
    .line 1555
    check-cast v1, Lh0/u0;

    .line 1556
    .line 1557
    invoke-virtual {v1}, Lh0/u0;->c()V

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual/range {p0 .. p0}, Lh0/N;->e0()V

    .line 1561
    .line 1562
    .line 1563
    goto :goto_35

    .line 1564
    :cond_56
    const/4 v2, 0x1

    .line 1565
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1566
    .line 1567
    iget v1, v1, Lh0/i0;->e:I

    .line 1568
    .line 1569
    const/4 v5, 0x3

    .line 1570
    if-ne v1, v5, :cond_5f

    .line 1571
    .line 1572
    iget v1, v11, Lh0/N;->Y:I

    .line 1573
    .line 1574
    if-nez v1, :cond_57

    .line 1575
    .line 1576
    invoke-virtual/range {p0 .. p0}, Lh0/N;->t()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v1

    .line 1580
    if-eqz v1, :cond_58

    .line 1581
    .line 1582
    goto :goto_35

    .line 1583
    :cond_57
    if-nez v3, :cond_5f

    .line 1584
    .line 1585
    :cond_58
    invoke-virtual/range {p0 .. p0}, Lh0/N;->c0()Z

    .line 1586
    .line 1587
    .line 1588
    move-result v1

    .line 1589
    invoke-virtual {v11, v1, v14}, Lh0/N;->m0(ZZ)V

    .line 1590
    .line 1591
    .line 1592
    const/4 v1, 0x2

    .line 1593
    invoke-virtual {v11, v1}, Lh0/N;->b0(I)V

    .line 1594
    .line 1595
    .line 1596
    iget-boolean v1, v11, Lh0/N;->Q:Z

    .line 1597
    .line 1598
    if-eqz v1, :cond_5e

    .line 1599
    .line 1600
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 1601
    .line 1602
    iget-object v1, v1, Lh0/X;->i:Lh0/V;

    .line 1603
    .line 1604
    :goto_32
    if-eqz v1, :cond_5b

    .line 1605
    .line 1606
    iget-object v3, v1, Lh0/V;->o:LA0/A;

    .line 1607
    .line 1608
    iget-object v3, v3, LA0/A;->c:[LA0/w;

    .line 1609
    .line 1610
    array-length v5, v3

    .line 1611
    move v8, v14

    .line 1612
    :goto_33
    if-ge v8, v5, :cond_5a

    .line 1613
    .line 1614
    aget-object v6, v3, v8

    .line 1615
    .line 1616
    if-eqz v6, :cond_59

    .line 1617
    .line 1618
    invoke-interface {v6}, LA0/w;->r()V

    .line 1619
    .line 1620
    .line 1621
    :cond_59
    add-int/lit8 v8, v8, 0x1

    .line 1622
    .line 1623
    goto :goto_33

    .line 1624
    :cond_5a
    iget-object v1, v1, Lh0/V;->m:Lh0/V;

    .line 1625
    .line 1626
    goto :goto_32

    .line 1627
    :cond_5b
    iget-object v1, v11, Lh0/N;->F:Lh0/O;

    .line 1628
    .line 1629
    check-cast v1, Lh0/k;

    .line 1630
    .line 1631
    iget-wide v5, v1, Lh0/k;->m:J

    .line 1632
    .line 1633
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    cmp-long v3, v5, v7

    .line 1639
    .line 1640
    if-nez v3, :cond_5c

    .line 1641
    .line 1642
    goto :goto_34

    .line 1643
    :cond_5c
    iget-wide v9, v1, Lh0/k;->f:J

    .line 1644
    .line 1645
    add-long/2addr v5, v9

    .line 1646
    iput-wide v5, v1, Lh0/k;->m:J

    .line 1647
    .line 1648
    iget-wide v9, v1, Lh0/k;->l:J

    .line 1649
    .line 1650
    cmp-long v3, v9, v7

    .line 1651
    .line 1652
    if-eqz v3, :cond_5d

    .line 1653
    .line 1654
    cmp-long v3, v5, v9

    .line 1655
    .line 1656
    if-lez v3, :cond_5d

    .line 1657
    .line 1658
    iput-wide v9, v1, Lh0/k;->m:J

    .line 1659
    .line 1660
    :cond_5d
    iput-wide v7, v1, Lh0/k;->q:J

    .line 1661
    .line 1662
    :cond_5e
    :goto_34
    invoke-virtual/range {p0 .. p0}, Lh0/N;->g0()V

    .line 1663
    .line 1664
    .line 1665
    :cond_5f
    :goto_35
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1666
    .line 1667
    iget v1, v1, Lh0/i0;->e:I

    .line 1668
    .line 1669
    const/4 v3, 0x2

    .line 1670
    if-ne v1, v3, :cond_62

    .line 1671
    .line 1672
    move v8, v14

    .line 1673
    :goto_36
    iget-object v1, v11, Lh0/N;->l:[Lh0/o0;

    .line 1674
    .line 1675
    array-length v3, v1

    .line 1676
    if-ge v8, v3, :cond_61

    .line 1677
    .line 1678
    aget-object v1, v1, v8

    .line 1679
    .line 1680
    invoke-static {v1}, Lh0/N;->s(Lh0/o0;)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v1

    .line 1684
    if-eqz v1, :cond_60

    .line 1685
    .line 1686
    iget-object v1, v11, Lh0/N;->l:[Lh0/o0;

    .line 1687
    .line 1688
    aget-object v1, v1, v8

    .line 1689
    .line 1690
    invoke-interface {v1}, Lh0/o0;->getStream()Lx0/f0;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v1

    .line 1694
    iget-object v3, v0, Lh0/V;->c:[Lx0/f0;

    .line 1695
    .line 1696
    aget-object v3, v3, v8

    .line 1697
    .line 1698
    if-ne v1, v3, :cond_60

    .line 1699
    .line 1700
    invoke-virtual {v11, v8}, Lh0/N;->x(I)V

    .line 1701
    .line 1702
    .line 1703
    :cond_60
    add-int/lit8 v8, v8, 0x1

    .line 1704
    .line 1705
    goto :goto_36

    .line 1706
    :cond_61
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 1707
    .line 1708
    iget-boolean v1, v0, Lh0/i0;->g:Z

    .line 1709
    .line 1710
    if-nez v1, :cond_62

    .line 1711
    .line 1712
    iget-wide v0, v0, Lh0/i0;->r:J

    .line 1713
    .line 1714
    const-wide/32 v5, 0x7a120

    .line 1715
    .line 1716
    .line 1717
    cmp-long v0, v0, v5

    .line 1718
    .line 1719
    if-gez v0, :cond_62

    .line 1720
    .line 1721
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 1722
    .line 1723
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 1724
    .line 1725
    invoke-static {v0}, Lh0/N;->r(Lh0/V;)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v0

    .line 1729
    if-eqz v0, :cond_62

    .line 1730
    .line 1731
    move v8, v2

    .line 1732
    goto :goto_37

    .line 1733
    :cond_62
    move v8, v14

    .line 1734
    :goto_37
    if-nez v8, :cond_63

    .line 1735
    .line 1736
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    iput-wide v0, v11, Lh0/N;->f0:J

    .line 1742
    .line 1743
    goto :goto_38

    .line 1744
    :cond_63
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    iget-wide v5, v11, Lh0/N;->f0:J

    .line 1750
    .line 1751
    cmp-long v0, v5, v0

    .line 1752
    .line 1753
    if-nez v0, :cond_64

    .line 1754
    .line 1755
    iget-object v0, v11, Lh0/N;->B:Ld0/r;

    .line 1756
    .line 1757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1758
    .line 1759
    .line 1760
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1761
    .line 1762
    .line 1763
    move-result-wide v0

    .line 1764
    iput-wide v0, v11, Lh0/N;->f0:J

    .line 1765
    .line 1766
    goto :goto_38

    .line 1767
    :cond_64
    iget-object v0, v11, Lh0/N;->B:Ld0/r;

    .line 1768
    .line 1769
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1770
    .line 1771
    .line 1772
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1773
    .line 1774
    .line 1775
    move-result-wide v0

    .line 1776
    iget-wide v5, v11, Lh0/N;->f0:J

    .line 1777
    .line 1778
    sub-long/2addr v0, v5

    .line 1779
    const-wide/16 v5, 0xfa0

    .line 1780
    .line 1781
    cmp-long v0, v0, v5

    .line 1782
    .line 1783
    if-gez v0, :cond_6b

    .line 1784
    .line 1785
    :goto_38
    invoke-virtual/range {p0 .. p0}, Lh0/N;->c0()Z

    .line 1786
    .line 1787
    .line 1788
    move-result v0

    .line 1789
    if-eqz v0, :cond_65

    .line 1790
    .line 1791
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 1792
    .line 1793
    iget v0, v0, Lh0/i0;->e:I

    .line 1794
    .line 1795
    const/4 v1, 0x3

    .line 1796
    if-ne v0, v1, :cond_65

    .line 1797
    .line 1798
    move v8, v2

    .line 1799
    goto :goto_39

    .line 1800
    :cond_65
    move v8, v14

    .line 1801
    :goto_39
    iget-boolean v0, v11, Lh0/N;->X:Z

    .line 1802
    .line 1803
    if-eqz v0, :cond_66

    .line 1804
    .line 1805
    iget-boolean v0, v11, Lh0/N;->W:Z

    .line 1806
    .line 1807
    if-eqz v0, :cond_66

    .line 1808
    .line 1809
    if-eqz v8, :cond_66

    .line 1810
    .line 1811
    goto :goto_3a

    .line 1812
    :cond_66
    move v2, v14

    .line 1813
    :goto_3a
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 1814
    .line 1815
    iget-boolean v1, v0, Lh0/i0;->p:Z

    .line 1816
    .line 1817
    if-eq v1, v2, :cond_67

    .line 1818
    .line 1819
    new-instance v1, Lh0/i0;

    .line 1820
    .line 1821
    move-object/from16 v34, v1

    .line 1822
    .line 1823
    iget-object v3, v0, Lh0/i0;->a:La0/U;

    .line 1824
    .line 1825
    move-object/from16 v35, v3

    .line 1826
    .line 1827
    iget-object v3, v0, Lh0/i0;->b:Lx0/H;

    .line 1828
    .line 1829
    move-object/from16 v36, v3

    .line 1830
    .line 1831
    iget-wide v5, v0, Lh0/i0;->c:J

    .line 1832
    .line 1833
    move-wide/from16 v37, v5

    .line 1834
    .line 1835
    iget-wide v5, v0, Lh0/i0;->d:J

    .line 1836
    .line 1837
    move-wide/from16 v39, v5

    .line 1838
    .line 1839
    iget v3, v0, Lh0/i0;->e:I

    .line 1840
    .line 1841
    move/from16 v41, v3

    .line 1842
    .line 1843
    iget-object v3, v0, Lh0/i0;->f:Lh0/o;

    .line 1844
    .line 1845
    move-object/from16 v42, v3

    .line 1846
    .line 1847
    iget-boolean v3, v0, Lh0/i0;->g:Z

    .line 1848
    .line 1849
    move/from16 v43, v3

    .line 1850
    .line 1851
    iget-object v3, v0, Lh0/i0;->h:Lx0/q0;

    .line 1852
    .line 1853
    move-object/from16 v44, v3

    .line 1854
    .line 1855
    iget-object v3, v0, Lh0/i0;->i:LA0/A;

    .line 1856
    .line 1857
    move-object/from16 v45, v3

    .line 1858
    .line 1859
    iget-object v3, v0, Lh0/i0;->j:Ljava/util/List;

    .line 1860
    .line 1861
    move-object/from16 v46, v3

    .line 1862
    .line 1863
    iget-object v3, v0, Lh0/i0;->k:Lx0/H;

    .line 1864
    .line 1865
    move-object/from16 v47, v3

    .line 1866
    .line 1867
    iget-boolean v3, v0, Lh0/i0;->l:Z

    .line 1868
    .line 1869
    move/from16 v48, v3

    .line 1870
    .line 1871
    iget v3, v0, Lh0/i0;->m:I

    .line 1872
    .line 1873
    move/from16 v49, v3

    .line 1874
    .line 1875
    iget v3, v0, Lh0/i0;->n:I

    .line 1876
    .line 1877
    move/from16 v50, v3

    .line 1878
    .line 1879
    iget-object v3, v0, Lh0/i0;->o:La0/J;

    .line 1880
    .line 1881
    move-object/from16 v51, v3

    .line 1882
    .line 1883
    iget-wide v5, v0, Lh0/i0;->q:J

    .line 1884
    .line 1885
    move-wide/from16 v52, v5

    .line 1886
    .line 1887
    iget-wide v5, v0, Lh0/i0;->r:J

    .line 1888
    .line 1889
    move-wide/from16 v54, v5

    .line 1890
    .line 1891
    iget-wide v5, v0, Lh0/i0;->s:J

    .line 1892
    .line 1893
    move-wide/from16 v56, v5

    .line 1894
    .line 1895
    iget-wide v5, v0, Lh0/i0;->t:J

    .line 1896
    .line 1897
    move-wide/from16 v58, v5

    .line 1898
    .line 1899
    move/from16 v60, v2

    .line 1900
    .line 1901
    invoke-direct/range {v34 .. v60}, Lh0/i0;-><init>(La0/U;Lx0/H;JJILh0/o;ZLx0/q0;LA0/A;Ljava/util/List;Lx0/H;ZIILa0/J;JJJJZ)V

    .line 1902
    .line 1903
    .line 1904
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 1905
    .line 1906
    :cond_67
    iput-boolean v14, v11, Lh0/N;->W:Z

    .line 1907
    .line 1908
    if-nez v2, :cond_6a

    .line 1909
    .line 1910
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 1911
    .line 1912
    iget v0, v0, Lh0/i0;->e:I

    .line 1913
    .line 1914
    const/4 v1, 0x4

    .line 1915
    if-ne v0, v1, :cond_68

    .line 1916
    .line 1917
    goto :goto_3b

    .line 1918
    :cond_68
    if-nez v8, :cond_69

    .line 1919
    .line 1920
    const/4 v1, 0x2

    .line 1921
    if-eq v0, v1, :cond_69

    .line 1922
    .line 1923
    const/4 v1, 0x3

    .line 1924
    if-ne v0, v1, :cond_6a

    .line 1925
    .line 1926
    iget v0, v11, Lh0/N;->Y:I

    .line 1927
    .line 1928
    if-eqz v0, :cond_6a

    .line 1929
    .line 1930
    :cond_69
    invoke-virtual {v11, v12, v13}, Lh0/N;->L(J)V

    .line 1931
    .line 1932
    .line 1933
    :cond_6a
    :goto_3b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1934
    .line 1935
    .line 1936
    return-void

    .line 1937
    :cond_6b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1938
    .line 1939
    const-string v1, "Playback stuck buffering and not loading"

    .line 1940
    .line 1941
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1942
    .line 1943
    .line 1944
    throw v0

    .line 1945
    :cond_6c
    :goto_3c
    return-void
.end method

.method public final e0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, v0, Lh0/V;->o:LA0/A;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Lh0/N;->l:[Lh0/o0;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LA0/A;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    aget-object v3, v2, v1

    .line 23
    .line 24
    invoke-interface {v3}, Lh0/o0;->getState()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x1

    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    aget-object v2, v2, v1

    .line 32
    .line 33
    invoke-interface {v2}, Lh0/o0;->start()V

    .line 34
    .line 35
    .line 36
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void
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

.method public final f([ZJ)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lh0/N;->D:Lh0/X;

    .line 4
    .line 5
    iget-object v2, v1, Lh0/X;->j:Lh0/V;

    .line 6
    .line 7
    iget-object v3, v2, Lh0/V;->o:LA0/A;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :goto_0
    iget-object v6, v0, Lh0/N;->l:[Lh0/o0;

    .line 11
    .line 12
    array-length v7, v6

    .line 13
    iget-object v8, v0, Lh0/N;->m:Ljava/util/Set;

    .line 14
    .line 15
    if-ge v5, v7, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, LA0/A;->b(I)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    aget-object v7, v6, v5

    .line 24
    .line 25
    invoke-interface {v8, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    aget-object v6, v6, v5

    .line 32
    .line 33
    invoke-interface {v6}, Lh0/o0;->reset()V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v5, 0x0

    .line 40
    :goto_1
    array-length v7, v6

    .line 41
    const/4 v9, 0x1

    .line 42
    if-ge v5, v7, :cond_c

    .line 43
    .line 44
    invoke-virtual {v3, v5}, LA0/A;->b(I)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_a

    .line 49
    .line 50
    aget-boolean v7, p1, v5

    .line 51
    .line 52
    aget-object v14, v6, v5

    .line 53
    .line 54
    invoke-static {v14}, Lh0/N;->s(Lh0/o0;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_2
    iget-object v10, v1, Lh0/X;->j:Lh0/V;

    .line 63
    .line 64
    iget-object v11, v1, Lh0/X;->i:Lh0/V;

    .line 65
    .line 66
    if-ne v10, v11, :cond_3

    .line 67
    .line 68
    move/from16 v23, v9

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const/16 v23, 0x0

    .line 72
    .line 73
    :goto_2
    iget-object v11, v10, Lh0/V;->o:LA0/A;

    .line 74
    .line 75
    iget-object v12, v11, LA0/A;->b:[Lh0/r0;

    .line 76
    .line 77
    aget-object v12, v12, v5

    .line 78
    .line 79
    iget-object v11, v11, LA0/A;->c:[LA0/w;

    .line 80
    .line 81
    aget-object v11, v11, v5

    .line 82
    .line 83
    if-eqz v11, :cond_4

    .line 84
    .line 85
    invoke-interface {v11}, LA0/w;->length()I

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 v13, 0x0

    .line 91
    :goto_3
    new-array v15, v13, [La0/p;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    :goto_4
    if-ge v4, v13, :cond_5

    .line 95
    .line 96
    invoke-interface {v11, v4}, LA0/w;->g(I)La0/p;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    aput-object v16, v15, v4

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lh0/N;->c0()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    iget-object v4, v0, Lh0/N;->L:Lh0/i0;

    .line 112
    .line 113
    iget v4, v4, Lh0/i0;->e:I

    .line 114
    .line 115
    const/4 v11, 0x3

    .line 116
    if-ne v4, v11, :cond_6

    .line 117
    .line 118
    move v4, v9

    .line 119
    goto :goto_5

    .line 120
    :cond_6
    const/4 v4, 0x0

    .line 121
    :goto_5
    if-nez v7, :cond_7

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    move/from16 v16, v9

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    const/16 v16, 0x0

    .line 129
    .line 130
    :goto_6
    iget v7, v0, Lh0/N;->Y:I

    .line 131
    .line 132
    add-int/2addr v7, v9

    .line 133
    iput v7, v0, Lh0/N;->Y:I

    .line 134
    .line 135
    invoke-interface {v8, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget-object v7, v10, Lh0/V;->c:[Lx0/f0;

    .line 139
    .line 140
    aget-object v13, v7, v5

    .line 141
    .line 142
    move-object/from16 v24, v6

    .line 143
    .line 144
    iget-wide v6, v0, Lh0/N;->a0:J

    .line 145
    .line 146
    move-object/from16 v25, v8

    .line 147
    .line 148
    iget-wide v8, v10, Lh0/V;->p:J

    .line 149
    .line 150
    iget-object v10, v10, Lh0/V;->g:Lh0/W;

    .line 151
    .line 152
    iget-object v11, v10, Lh0/W;->a:Lx0/H;

    .line 153
    .line 154
    move-object v10, v14

    .line 155
    move-object/from16 v22, v11

    .line 156
    .line 157
    move-object v11, v12

    .line 158
    move-object v12, v15

    .line 159
    move-object/from16 v26, v1

    .line 160
    .line 161
    move-object v1, v14

    .line 162
    move-wide v14, v6

    .line 163
    move/from16 v17, v23

    .line 164
    .line 165
    move-wide/from16 v18, p2

    .line 166
    .line 167
    move-wide/from16 v20, v8

    .line 168
    .line 169
    invoke-interface/range {v10 .. v22}, Lh0/o0;->enable(Lh0/r0;[La0/p;Lx0/f0;JZZJJLx0/H;)V

    .line 170
    .line 171
    .line 172
    new-instance v6, Lh0/H;

    .line 173
    .line 174
    invoke-direct {v6, v0}, Lh0/H;-><init>(Lh0/N;)V

    .line 175
    .line 176
    .line 177
    const/16 v7, 0xb

    .line 178
    .line 179
    invoke-interface {v1, v7, v6}, Lh0/k0;->handleMessage(ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object v6, v0, Lh0/N;->z:Le3/e;

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Lh0/o0;->getMediaClock()Lh0/U;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-eqz v7, :cond_9

    .line 192
    .line 193
    iget-object v8, v6, Le3/e;->q:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v8, Lh0/U;

    .line 196
    .line 197
    if-eq v7, v8, :cond_9

    .line 198
    .line 199
    if-nez v8, :cond_8

    .line 200
    .line 201
    iput-object v7, v6, Le3/e;->q:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v1, v6, Le3/e;->p:Ljava/lang/Object;

    .line 204
    .line 205
    iget-object v6, v6, Le3/e;->n:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v6, Lh0/u0;

    .line 208
    .line 209
    iget-object v6, v6, Lh0/u0;->p:La0/J;

    .line 210
    .line 211
    invoke-interface {v7, v6}, Lh0/U;->a(La0/J;)V

    .line 212
    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 216
    .line 217
    const-string v2, "Multiple renderer media clocks enabled."

    .line 218
    .line 219
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance v2, Lh0/o;

    .line 223
    .line 224
    const/4 v3, 0x2

    .line 225
    const/16 v4, 0x3e8

    .line 226
    .line 227
    invoke-direct {v2, v3, v1, v4}, Lh0/o;-><init>(ILjava/lang/Exception;I)V

    .line 228
    .line 229
    .line 230
    throw v2

    .line 231
    :cond_9
    :goto_7
    if-eqz v4, :cond_b

    .line 232
    .line 233
    if-eqz v23, :cond_b

    .line 234
    .line 235
    invoke-interface {v1}, Lh0/o0;->start()V

    .line 236
    .line 237
    .line 238
    goto :goto_9

    .line 239
    :cond_a
    :goto_8
    move-object/from16 v26, v1

    .line 240
    .line 241
    move-object/from16 v24, v6

    .line 242
    .line 243
    move-object/from16 v25, v8

    .line 244
    .line 245
    :cond_b
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 246
    .line 247
    move-object/from16 v6, v24

    .line 248
    .line 249
    move-object/from16 v8, v25

    .line 250
    .line 251
    move-object/from16 v1, v26

    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :cond_c
    iput-boolean v9, v2, Lh0/V;->h:Z

    .line 256
    .line 257
    return-void
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

.method public final f0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lh0/N;->V:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v0

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v1, v0, v1}, Lh0/N;->F(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lh0/N;->M:Lh0/K;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/K;->c(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lh0/N;->r:Lh0/Q;

    .line 22
    .line 23
    check-cast p1, Lh0/m;

    .line 24
    .line 25
    iget-object p2, p0, Lh0/N;->H:Li0/j;

    .line 26
    .line 27
    iget-object v1, p1, Lh0/m;->i:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lh0/m;->d()V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0, v0}, Lh0/N;->b0(I)V

    .line 39
    .line 40
    .line 41
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

.method public final g(La0/U;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/N;->x:La0/S;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, La0/S;->c:I

    .line 8
    .line 9
    iget-object v1, p0, Lh0/N;->w:La0/T;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, La0/U;->n(ILa0/T;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, v1, La0/T;->f:J

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long p1, p1, v2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, La0/T;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-boolean p1, v1, La0/T;->i:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide p1, v1, La0/T;->g:J

    .line 37
    .line 38
    invoke-static {p1, p2}, Ld0/w;->y(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    iget-wide v1, v1, La0/T;->f:J

    .line 43
    .line 44
    sub-long/2addr p1, v1

    .line 45
    invoke-static {p1, p2}, Ld0/w;->M(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-wide v0, v0, La0/S;->e:J

    .line 50
    .line 51
    add-long/2addr p3, v0

    .line 52
    sub-long/2addr p1, p3

    .line 53
    return-wide p1

    .line 54
    :cond_1
    :goto_0
    return-wide v2
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

.method public final g0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lh0/N;->z:Le3/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Le3/e;->m:Z

    .line 5
    .line 6
    iget-object v0, v0, Le3/e;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh0/u0;

    .line 9
    .line 10
    iget-boolean v2, v0, Lh0/u0;->m:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lh0/u0;->h()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0, v2, v3}, Lh0/u0;->b(J)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, v0, Lh0/u0;->m:Z

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lh0/N;->l:[Lh0/o0;

    .line 24
    .line 25
    array-length v2, v0

    .line 26
    :goto_0
    if-ge v1, v2, :cond_2

    .line 27
    .line 28
    aget-object v3, v0, v1

    .line 29
    .line 30
    invoke-static {v3}, Lh0/N;->s(Lh0/o0;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v3}, Lh0/o0;->getState()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x2

    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, Lh0/o0;->stop()V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
    .line 50
    .line 51
.end method

.method public final h()J
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->j:Lh0/V;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-wide v1, v0, Lh0/V;->p:J

    .line 11
    .line 12
    iget-boolean v3, v0, Lh0/V;->e:Z

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    return-wide v1

    .line 17
    :cond_1
    const/4 v3, 0x0

    .line 18
    :goto_0
    iget-object v4, p0, Lh0/N;->l:[Lh0/o0;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_5

    .line 22
    .line 23
    aget-object v5, v4, v3

    .line 24
    .line 25
    invoke-static {v5}, Lh0/N;->s(Lh0/o0;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_4

    .line 30
    .line 31
    aget-object v5, v4, v3

    .line 32
    .line 33
    invoke-interface {v5}, Lh0/o0;->getStream()Lx0/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, v0, Lh0/V;->c:[Lx0/f0;

    .line 38
    .line 39
    aget-object v6, v6, v3

    .line 40
    .line 41
    if-eq v5, v6, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    aget-object v4, v4, v3

    .line 45
    .line 46
    invoke-interface {v4}, Lh0/o0;->getReadingPositionUs()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    const-wide/high16 v6, -0x8000000000000000L

    .line 51
    .line 52
    cmp-long v8, v4, v6

    .line 53
    .line 54
    if-nez v8, :cond_3

    .line 55
    .line 56
    return-wide v6

    .line 57
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_5
    return-wide v1
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

.method public final h0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lh0/N;->D:Lh0/X;

    .line 4
    .line 5
    iget-object v1, v1, Lh0/X;->k:Lh0/V;

    .line 6
    .line 7
    iget-boolean v2, v0, Lh0/N;->S:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Lx0/h0;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    move v11, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :goto_2
    iget-object v1, v0, Lh0/N;->L:Lh0/i0;

    .line 28
    .line 29
    iget-boolean v2, v1, Lh0/i0;->g:Z

    .line 30
    .line 31
    if-eq v11, v2, :cond_2

    .line 32
    .line 33
    new-instance v15, Lh0/i0;

    .line 34
    .line 35
    move-object v2, v15

    .line 36
    iget-object v3, v1, Lh0/i0;->a:La0/U;

    .line 37
    .line 38
    iget-object v4, v1, Lh0/i0;->b:Lx0/H;

    .line 39
    .line 40
    iget-wide v5, v1, Lh0/i0;->c:J

    .line 41
    .line 42
    iget-wide v7, v1, Lh0/i0;->d:J

    .line 43
    .line 44
    iget v9, v1, Lh0/i0;->e:I

    .line 45
    .line 46
    iget-object v10, v1, Lh0/i0;->f:Lh0/o;

    .line 47
    .line 48
    iget-object v12, v1, Lh0/i0;->h:Lx0/q0;

    .line 49
    .line 50
    iget-object v13, v1, Lh0/i0;->i:LA0/A;

    .line 51
    .line 52
    iget-object v14, v1, Lh0/i0;->j:Ljava/util/List;

    .line 53
    .line 54
    move-object/from16 v16, v15

    .line 55
    .line 56
    iget-object v15, v1, Lh0/i0;->k:Lx0/H;

    .line 57
    .line 58
    move-object/from16 v29, v16

    .line 59
    .line 60
    iget-boolean v0, v1, Lh0/i0;->l:Z

    .line 61
    .line 62
    move/from16 v16, v0

    .line 63
    .line 64
    iget v0, v1, Lh0/i0;->m:I

    .line 65
    .line 66
    move/from16 v17, v0

    .line 67
    .line 68
    iget v0, v1, Lh0/i0;->n:I

    .line 69
    .line 70
    move/from16 v18, v0

    .line 71
    .line 72
    iget-object v0, v1, Lh0/i0;->o:La0/J;

    .line 73
    .line 74
    move-object/from16 v19, v0

    .line 75
    .line 76
    move-object v0, v2

    .line 77
    move-object/from16 v30, v3

    .line 78
    .line 79
    iget-wide v2, v1, Lh0/i0;->q:J

    .line 80
    .line 81
    move-wide/from16 v20, v2

    .line 82
    .line 83
    iget-wide v2, v1, Lh0/i0;->r:J

    .line 84
    .line 85
    move-wide/from16 v22, v2

    .line 86
    .line 87
    iget-wide v2, v1, Lh0/i0;->s:J

    .line 88
    .line 89
    move-wide/from16 v24, v2

    .line 90
    .line 91
    iget-wide v2, v1, Lh0/i0;->t:J

    .line 92
    .line 93
    move-wide/from16 v26, v2

    .line 94
    .line 95
    iget-boolean v1, v1, Lh0/i0;->p:Z

    .line 96
    .line 97
    move/from16 v28, v1

    .line 98
    .line 99
    move-object v2, v0

    .line 100
    move-object/from16 v3, v30

    .line 101
    .line 102
    invoke-direct/range {v2 .. v28}, Lh0/i0;-><init>(La0/U;Lx0/H;JJILh0/o;ZLx0/q0;LA0/A;Ljava/util/List;Lx0/H;ZIILa0/J;JJJJZ)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v0, p0

    .line 106
    .line 107
    move-object/from16 v1, v29

    .line 108
    .line 109
    iput-object v1, v0, Lh0/N;->L:Lh0/i0;

    .line 110
    .line 111
    :cond_2
    return-void
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

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 27

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "Playback error"

    .line 6
    .line 7
    const-string v3, "ExoPlayerImplInternal"

    .line 8
    .line 9
    const/4 v12, 0x1

    .line 10
    const/16 v4, 0x3e8

    .line 11
    .line 12
    const/4 v13, 0x0

    .line 13
    :try_start_0
    iget v5, v1, Landroid/os/Message;->what:I

    .line 14
    .line 15
    packed-switch v5, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    return v13

    .line 19
    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Lh0/N;->B()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :catch_0
    move-exception v0

    .line 25
    move-object v1, v0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :catch_1
    move-exception v0

    .line 29
    move-object v1, v0

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :catch_2
    move-exception v0

    .line 33
    move-object v1, v0

    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :catch_3
    move-exception v0

    .line 37
    move-object v1, v0

    .line 38
    goto/16 :goto_8

    .line 39
    .line 40
    :catch_4
    move-exception v0

    .line 41
    move-object v1, v0

    .line 42
    goto/16 :goto_9

    .line 43
    .line 44
    :catch_5
    move-exception v0

    .line 45
    move-object v1, v0

    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :catch_6
    move-exception v0

    .line 49
    move-object v1, v0

    .line 50
    goto/16 :goto_d

    .line 51
    .line 52
    :pswitch_2
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lh0/r;

    .line 55
    .line 56
    invoke-virtual {v11, v1}, Lh0/N;->X(Lh0/r;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :pswitch_3
    iget v5, v1, Landroid/os/Message;->arg1:I

    .line 62
    .line 63
    iget v6, v1, Landroid/os/Message;->arg2:I

    .line 64
    .line 65
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/util/List;

    .line 68
    .line 69
    invoke-virtual {v11, v5, v6, v1}, Lh0/N;->j0(IILjava/util/List;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Lh0/N;->E()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v11, v12}, Lh0/N;->M(Z)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Lh0/N;->E()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11, v12}, Lh0/N;->M(Z)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :pswitch_6
    iget v1, v1, Landroid/os/Message;->arg1:I

    .line 91
    .line 92
    if-eqz v1, :cond_0

    .line 93
    .line 94
    move v1, v12

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    move v1, v13

    .line 97
    :goto_0
    invoke-virtual {v11, v1}, Lh0/N;->U(Z)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :pswitch_7
    invoke-virtual/range {p0 .. p0}, Lh0/N;->z()V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :pswitch_8
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lx0/j0;

    .line 110
    .line 111
    invoke-virtual {v11, v1}, Lh0/N;->a0(Lx0/j0;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :pswitch_9
    iget v5, v1, Landroid/os/Message;->arg1:I

    .line 117
    .line 118
    iget v6, v1, Landroid/os/Message;->arg2:I

    .line 119
    .line 120
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lx0/j0;

    .line 123
    .line 124
    invoke-virtual {v11, v5, v6, v1}, Lh0/N;->D(IILx0/j0;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_4

    .line 128
    .line 129
    :pswitch_a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Lh0/J;

    .line 132
    .line 133
    invoke-virtual {v11, v1}, Lh0/N;->A(Lh0/J;)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :pswitch_b
    iget-object v5, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v5, Lh0/I;

    .line 141
    .line 142
    iget v1, v1, Landroid/os/Message;->arg1:I

    .line 143
    .line 144
    invoke-virtual {v11, v5, v1}, Lh0/N;->b(Lh0/I;I)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :pswitch_c
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lh0/I;

    .line 152
    .line 153
    invoke-virtual {v11, v1}, Lh0/N;->T(Lh0/I;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_4

    .line 157
    .line 158
    :pswitch_d
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, La0/J;

    .line 161
    .line 162
    iget v5, v1, La0/J;->a:F

    .line 163
    .line 164
    invoke-virtual {v11, v1, v5, v12, v13}, Lh0/N;->p(La0/J;FZZ)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_4

    .line 168
    .line 169
    :pswitch_e
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Lh0/l0;

    .line 172
    .line 173
    invoke-virtual {v11, v1}, Lh0/N;->Q(Lh0/l0;)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_4

    .line 177
    .line 178
    :pswitch_f
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Lh0/l0;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11, v1}, Lh0/N;->P(Lh0/l0;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :pswitch_10
    iget v5, v1, Landroid/os/Message;->arg1:I

    .line 191
    .line 192
    if-eqz v5, :cond_1

    .line 193
    .line 194
    move v5, v12

    .line 195
    goto :goto_1

    .line 196
    :cond_1
    move v5, v13

    .line 197
    :goto_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 200
    .line 201
    invoke-virtual {v11, v5, v1}, Lh0/N;->S(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :pswitch_11
    iget v1, v1, Landroid/os/Message;->arg1:I

    .line 206
    .line 207
    if-eqz v1, :cond_2

    .line 208
    .line 209
    move v1, v12

    .line 210
    goto :goto_2

    .line 211
    :cond_2
    move v1, v13

    .line 212
    :goto_2
    invoke-virtual {v11, v1}, Lh0/N;->Z(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :pswitch_12
    iget v1, v1, Landroid/os/Message;->arg1:I

    .line 217
    .line 218
    invoke-virtual {v11, v1}, Lh0/N;->Y(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Lh0/N;->E()V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :pswitch_14
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, Lx0/F;

    .line 229
    .line 230
    invoke-virtual {v11, v1}, Lh0/N;->k(Lx0/F;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :pswitch_15
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Lx0/F;

    .line 237
    .line 238
    invoke-virtual {v11, v1}, Lh0/N;->o(Lx0/F;)V

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :pswitch_16
    invoke-virtual/range {p0 .. p0}, Lh0/N;->C()V

    .line 243
    .line 244
    .line 245
    return v12

    .line 246
    :pswitch_17
    invoke-virtual {v11, v13, v12}, Lh0/N;->f0(ZZ)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :pswitch_18
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Lh0/t0;

    .line 253
    .line 254
    iput-object v1, v11, Lh0/N;->K:Lh0/t0;

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :pswitch_19
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, La0/J;

    .line 260
    .line 261
    invoke-virtual {v11, v1}, Lh0/N;->W(La0/J;)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :pswitch_1a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, Lh0/M;

    .line 268
    .line 269
    invoke-virtual {v11, v1}, Lh0/N;->N(Lh0/M;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_1b
    invoke-virtual/range {p0 .. p0}, Lh0/N;->e()V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :pswitch_1c
    iget v5, v1, Landroid/os/Message;->arg1:I

    .line 278
    .line 279
    if-eqz v5, :cond_3

    .line 280
    .line 281
    move v5, v12

    .line 282
    goto :goto_3

    .line 283
    :cond_3
    move v5, v13

    .line 284
    :goto_3
    iget v1, v1, Landroid/os/Message;->arg2:I

    .line 285
    .line 286
    shr-int/lit8 v6, v1, 0x4

    .line 287
    .line 288
    and-int/lit8 v1, v1, 0xf

    .line 289
    .line 290
    invoke-virtual {v11, v6, v1, v5, v12}, Lh0/N;->V(IIZZ)V
    :try_end_0
    .catch Lh0/o; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lm0/c; {:try_start_0 .. :try_end_0} :catch_5
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lf0/i; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lx0/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 291
    .line 292
    .line 293
    :goto_4
    move v1, v12

    .line 294
    goto/16 :goto_13

    .line 295
    .line 296
    :goto_5
    instance-of v5, v1, Ljava/lang/IllegalStateException;

    .line 297
    .line 298
    if-nez v5, :cond_4

    .line 299
    .line 300
    instance-of v5, v1, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    if-eqz v5, :cond_5

    .line 303
    .line 304
    :cond_4
    const/16 v4, 0x3ec

    .line 305
    .line 306
    :cond_5
    new-instance v5, Lh0/o;

    .line 307
    .line 308
    const/4 v6, 0x2

    .line 309
    invoke-direct {v5, v6, v1, v4}, Lh0/o;-><init>(ILjava/lang/Exception;I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v3, v2, v5}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v11, v12, v13}, Lh0/N;->f0(ZZ)V

    .line 316
    .line 317
    .line 318
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 319
    .line 320
    invoke-virtual {v1, v5}, Lh0/i0;->e(Lh0/o;)Lh0/i0;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :goto_6
    const/16 v2, 0x7d0

    .line 328
    .line 329
    invoke-virtual {v11, v1, v2}, Lh0/N;->l(Ljava/io/IOException;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :goto_7
    const/16 v2, 0x3ea

    .line 334
    .line 335
    invoke-virtual {v11, v1, v2}, Lh0/N;->l(Ljava/io/IOException;I)V

    .line 336
    .line 337
    .line 338
    goto :goto_4

    .line 339
    :goto_8
    iget v2, v1, Lf0/i;->l:I

    .line 340
    .line 341
    invoke-virtual {v11, v1, v2}, Lh0/N;->l(Ljava/io/IOException;I)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :goto_9
    iget-boolean v2, v1, La0/H;->l:Z

    .line 346
    .line 347
    iget v3, v1, La0/H;->m:I

    .line 348
    .line 349
    if-ne v3, v12, :cond_7

    .line 350
    .line 351
    if-eqz v2, :cond_6

    .line 352
    .line 353
    const/16 v2, 0xbb9

    .line 354
    .line 355
    :goto_a
    move v4, v2

    .line 356
    goto :goto_b

    .line 357
    :cond_6
    const/16 v2, 0xbbb

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_7
    const/4 v5, 0x4

    .line 361
    if-ne v3, v5, :cond_9

    .line 362
    .line 363
    if-eqz v2, :cond_8

    .line 364
    .line 365
    const/16 v2, 0xbba

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_8
    const/16 v2, 0xbbc

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_9
    :goto_b
    invoke-virtual {v11, v1, v4}, Lh0/N;->l(Ljava/io/IOException;I)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :goto_c
    iget v2, v1, Lm0/c;->l:I

    .line 376
    .line 377
    invoke-virtual {v11, v1, v2}, Lh0/N;->l(Ljava/io/IOException;I)V

    .line 378
    .line 379
    .line 380
    goto :goto_4

    .line 381
    :goto_d
    iget v4, v1, Lh0/o;->n:I

    .line 382
    .line 383
    iget-object v5, v11, Lh0/N;->D:Lh0/X;

    .line 384
    .line 385
    if-ne v4, v12, :cond_a

    .line 386
    .line 387
    iget-object v4, v5, Lh0/X;->j:Lh0/V;

    .line 388
    .line 389
    if-eqz v4, :cond_a

    .line 390
    .line 391
    iget-object v4, v4, Lh0/V;->g:Lh0/W;

    .line 392
    .line 393
    new-instance v6, Lh0/o;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 400
    .line 401
    .line 402
    move-result-object v16

    .line 403
    iget-wide v7, v1, La0/I;->m:J

    .line 404
    .line 405
    iget-boolean v9, v1, Lh0/o;->t:Z

    .line 406
    .line 407
    iget v10, v1, La0/I;->l:I

    .line 408
    .line 409
    iget v14, v1, Lh0/o;->n:I

    .line 410
    .line 411
    iget-object v13, v1, Lh0/o;->o:Ljava/lang/String;

    .line 412
    .line 413
    iget v12, v1, Lh0/o;->p:I

    .line 414
    .line 415
    move-object/from16 p1, v5

    .line 416
    .line 417
    iget-object v5, v1, Lh0/o;->q:La0/p;

    .line 418
    .line 419
    iget v1, v1, Lh0/o;->r:I

    .line 420
    .line 421
    iget-object v4, v4, Lh0/W;->a:Lx0/H;

    .line 422
    .line 423
    move/from16 v18, v14

    .line 424
    .line 425
    move-object v14, v6

    .line 426
    move/from16 v17, v10

    .line 427
    .line 428
    move-object/from16 v19, v13

    .line 429
    .line 430
    move/from16 v20, v12

    .line 431
    .line 432
    move-object/from16 v21, v5

    .line 433
    .line 434
    move/from16 v22, v1

    .line 435
    .line 436
    move-object/from16 v23, v4

    .line 437
    .line 438
    move-wide/from16 v24, v7

    .line 439
    .line 440
    move/from16 v26, v9

    .line 441
    .line 442
    invoke-direct/range {v14 .. v26}, Lh0/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILa0/p;ILx0/H;JZ)V

    .line 443
    .line 444
    .line 445
    move-object v1, v6

    .line 446
    goto :goto_e

    .line 447
    :cond_a
    move-object/from16 p1, v5

    .line 448
    .line 449
    :goto_e
    iget-boolean v4, v1, Lh0/o;->t:Z

    .line 450
    .line 451
    if-eqz v4, :cond_d

    .line 452
    .line 453
    iget-object v4, v11, Lh0/N;->e0:Lh0/o;

    .line 454
    .line 455
    if-eqz v4, :cond_b

    .line 456
    .line 457
    const/16 v4, 0x138c

    .line 458
    .line 459
    iget v5, v1, La0/I;->l:I

    .line 460
    .line 461
    if-eq v5, v4, :cond_b

    .line 462
    .line 463
    const/16 v4, 0x138b

    .line 464
    .line 465
    if-ne v5, v4, :cond_d

    .line 466
    .line 467
    :cond_b
    const-string v2, "Recoverable renderer error"

    .line 468
    .line 469
    invoke-static {v3, v2, v1}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 470
    .line 471
    .line 472
    iget-object v2, v11, Lh0/N;->e0:Lh0/o;

    .line 473
    .line 474
    if-eqz v2, :cond_c

    .line 475
    .line 476
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    iget-object v1, v11, Lh0/N;->e0:Lh0/o;

    .line 480
    .line 481
    goto :goto_f

    .line 482
    :cond_c
    iput-object v1, v11, Lh0/N;->e0:Lh0/o;

    .line 483
    .line 484
    :goto_f
    const/16 v2, 0x19

    .line 485
    .line 486
    iget-object v3, v11, Lh0/N;->t:Ld0/t;

    .line 487
    .line 488
    invoke-virtual {v3, v2, v1}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object v2, v1, Ld0/s;->a:Landroid/os/Message;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget-object v3, v3, Ld0/t;->a:Landroid/os/Handler;

    .line 501
    .line 502
    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1}, Ld0/s;->a()V

    .line 506
    .line 507
    .line 508
    const/4 v1, 0x1

    .line 509
    goto :goto_13

    .line 510
    :cond_d
    iget-object v4, v11, Lh0/N;->e0:Lh0/o;

    .line 511
    .line 512
    if-eqz v4, :cond_e

    .line 513
    .line 514
    invoke-virtual {v4, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    iget-object v1, v11, Lh0/N;->e0:Lh0/o;

    .line 518
    .line 519
    :cond_e
    move-object v12, v1

    .line 520
    invoke-static {v3, v2, v12}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    iget v1, v12, Lh0/o;->n:I

    .line 524
    .line 525
    const/4 v2, 0x1

    .line 526
    if-ne v1, v2, :cond_11

    .line 527
    .line 528
    move-object/from16 v1, p1

    .line 529
    .line 530
    iget-object v2, v1, Lh0/X;->i:Lh0/V;

    .line 531
    .line 532
    iget-object v3, v1, Lh0/X;->j:Lh0/V;

    .line 533
    .line 534
    if-eq v2, v3, :cond_10

    .line 535
    .line 536
    :goto_10
    iget-object v2, v1, Lh0/X;->i:Lh0/V;

    .line 537
    .line 538
    iget-object v3, v1, Lh0/X;->j:Lh0/V;

    .line 539
    .line 540
    if-eq v2, v3, :cond_f

    .line 541
    .line 542
    invoke-virtual {v1}, Lh0/X;->a()Lh0/V;

    .line 543
    .line 544
    .line 545
    goto :goto_10

    .line 546
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {p0 .. p0}, Lh0/N;->w()V

    .line 550
    .line 551
    .line 552
    iget-object v1, v2, Lh0/V;->g:Lh0/W;

    .line 553
    .line 554
    const/4 v9, 0x1

    .line 555
    const/4 v10, 0x0

    .line 556
    iget-object v2, v1, Lh0/W;->a:Lx0/H;

    .line 557
    .line 558
    iget-wide v7, v1, Lh0/W;->b:J

    .line 559
    .line 560
    iget-wide v5, v1, Lh0/W;->c:J

    .line 561
    .line 562
    move-object/from16 v1, p0

    .line 563
    .line 564
    move-wide v3, v7

    .line 565
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 570
    .line 571
    :cond_10
    const/4 v1, 0x1

    .line 572
    :goto_11
    const/4 v2, 0x0

    .line 573
    goto :goto_12

    .line 574
    :cond_11
    move v1, v2

    .line 575
    goto :goto_11

    .line 576
    :goto_12
    invoke-virtual {v11, v1, v2}, Lh0/N;->f0(ZZ)V

    .line 577
    .line 578
    .line 579
    iget-object v2, v11, Lh0/N;->L:Lh0/i0;

    .line 580
    .line 581
    invoke-virtual {v2, v12}, Lh0/i0;->e(Lh0/o;)Lh0/i0;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    iput-object v2, v11, Lh0/N;->L:Lh0/i0;

    .line 586
    .line 587
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lh0/N;->w()V

    .line 588
    .line 589
    .line 590
    return v1

    .line 591
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public final i(La0/U;)Landroid/util/Pair;
    .locals 9

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
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lh0/i0;->u:Lx0/H;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, Lh0/N;->U:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, La0/U;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-object v4, p0, Lh0/N;->w:La0/T;

    .line 32
    .line 33
    iget-object v5, p0, Lh0/N;->x:La0/S;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v3, p0, Lh0/N;->D:Lh0/X;

    .line 41
    .line 42
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v3, p1, v4, v1, v2}, Lh0/X;->n(La0/U;Ljava/lang/Object;J)Lx0/H;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v3}, Lx0/H;->b()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v0, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, Lh0/N;->x:La0/S;

    .line 65
    .line 66
    invoke-virtual {p1, v0, v4}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 67
    .line 68
    .line 69
    iget p1, v3, Lx0/H;->b:I

    .line 70
    .line 71
    invoke-virtual {v4, p1}, La0/S;->e(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget v0, v3, Lx0/H;->c:I

    .line 76
    .line 77
    if-ne v0, p1, :cond_2

    .line 78
    .line 79
    iget-object p1, v4, La0/S;->g:La0/b;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-wide v1, v4

    .line 86
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1
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

.method public final i0(LA0/A;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lh0/V;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {p0, v1, v2}, Lh0/N;->j(J)J

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 16
    .line 17
    iget-object v1, v1, Lh0/i0;->a:La0/U;

    .line 18
    .line 19
    iget-object v0, v0, Lh0/V;->g:Lh0/W;

    .line 20
    .line 21
    iget-object v0, v0, Lh0/W;->a:Lx0/H;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lh0/N;->d0(La0/U;Lx0/H;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lh0/N;->F:Lh0/O;

    .line 30
    .line 31
    check-cast v0, Lh0/k;

    .line 32
    .line 33
    iget-wide v0, v0, Lh0/k;->m:J

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 36
    .line 37
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 38
    .line 39
    iget-object v0, p0, Lh0/N;->z:Le3/e;

    .line 40
    .line 41
    invoke-virtual {v0}, Le3/e;->d()La0/J;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v0, v0, La0/J;->a:F

    .line 46
    .line 47
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 48
    .line 49
    iget-boolean v0, v0, Lh0/i0;->l:Z

    .line 50
    .line 51
    iget-object p1, p1, LA0/A;->c:[LA0/w;

    .line 52
    .line 53
    iget-object v0, p0, Lh0/N;->r:Lh0/Q;

    .line 54
    .line 55
    check-cast v0, Lh0/m;

    .line 56
    .line 57
    iget-object v1, v0, Lh0/m;->i:Ljava/util/HashMap;

    .line 58
    .line 59
    iget-object v2, p0, Lh0/N;->H:Li0/j;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lh0/l;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 v2, -0x1

    .line 71
    iget v3, v0, Lh0/m;->f:I

    .line 72
    .line 73
    if-ne v3, v2, :cond_3

    .line 74
    .line 75
    array-length v2, p1

    .line 76
    const/4 v3, 0x0

    .line 77
    move v4, v3

    .line 78
    move v5, v4

    .line 79
    :goto_0
    const/high16 v6, 0xc80000

    .line 80
    .line 81
    if-ge v4, v2, :cond_2

    .line 82
    .line 83
    aget-object v7, p1, v4

    .line 84
    .line 85
    if-eqz v7, :cond_1

    .line 86
    .line 87
    invoke-interface {v7}, LA0/w;->b()La0/V;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget v7, v7, La0/V;->c:I

    .line 92
    .line 93
    const/high16 v8, 0x20000

    .line 94
    .line 95
    packed-switch v7, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :pswitch_0
    move v6, v8

    .line 105
    goto :goto_1

    .line 106
    :pswitch_1
    const/high16 v6, 0x7d00000

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_2
    const/high16 v6, 0x89a0000

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_3
    move v6, v3

    .line 113
    :goto_1
    :pswitch_4
    add-int/2addr v5, v6

    .line 114
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    :cond_3
    iput v3, v1, Lh0/l;->b:I

    .line 122
    .line 123
    invoke-virtual {v0}, Lh0/m;->d()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final j(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, Lh0/N;->a0:J

    .line 11
    .line 12
    iget-wide v5, v0, Lh0/V;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1
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

.method public final j0(IILjava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lh0/K;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh0/N;->E:Lh0/g0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lh0/g0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    if-gt p1, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-gt p2, v4, :cond_0

    .line 24
    .line 25
    move v4, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v3

    .line 28
    :goto_0
    invoke-static {v4}, Ld0/m;->c(Z)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int v5, p2, p1

    .line 36
    .line 37
    if-ne v4, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v1, v3

    .line 41
    :goto_1
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 42
    .line 43
    .line 44
    move v1, p1

    .line 45
    :goto_2
    if-ge v1, p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lh0/f0;

    .line 52
    .line 53
    iget-object v4, v4, Lh0/f0;->a:Lx0/D;

    .line 54
    .line 55
    sub-int v5, v1, p1

    .line 56
    .line 57
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, La0/A;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Lx0/D;->b(La0/A;)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v0}, Lh0/g0;->b()La0/U;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1, v3}, Lh0/N;->n(La0/U;Z)V

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

.method public final k(Lx0/F;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/X;->k:Lh0/V;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v2, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v2, p1, :cond_2

    .line 10
    .line 11
    iget-wide v2, p0, Lh0/N;->a0:J

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object p1, v1, Lh0/V;->m:Lh0/V;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    invoke-static {p1}, Ld0/m;->h(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v1, Lh0/V;->e:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-wide v0, v1, Lh0/V;->p:J

    .line 32
    .line 33
    sub-long/2addr v2, v0

    .line 34
    invoke-interface {p1, v2, v3}, Lx0/h0;->u(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Lh0/N;->u()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v0, v0, Lh0/X;->l:Lh0/V;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object v0, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 46
    .line 47
    if-ne v0, p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lh0/N;->v()V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_1
    return-void
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

.method public final k0()V
    .locals 24

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    const/4 v11, 0x3

    .line 4
    const/4 v12, 0x2

    .line 5
    const/4 v13, 0x0

    .line 6
    const/4 v14, 0x1

    .line 7
    iget-object v0, v10, Lh0/N;->D:Lh0/X;

    .line 8
    .line 9
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v1, v0, Lh0/V;->e:Z

    .line 15
    .line 16
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-interface {v1}, Lx0/F;->s()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    move-wide v6, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-wide v6, v15

    .line 32
    :goto_0
    cmp-long v1, v6, v15

    .line 33
    .line 34
    const/16 v9, 0x10

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v0}, Lh0/V;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    iget-object v1, v10, Lh0/N;->D:Lh0/X;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lh0/X;->l(Lh0/V;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v10, v13}, Lh0/N;->m(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p0 .. p0}, Lh0/N;->u()V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v10, v6, v7}, Lh0/N;->H(J)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 59
    .line 60
    iget-wide v0, v0, Lh0/i0;->s:J

    .line 61
    .line 62
    cmp-long v0, v6, v0

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 67
    .line 68
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 69
    .line 70
    iget-wide v4, v0, Lh0/i0;->c:J

    .line 71
    .line 72
    const/4 v8, 0x1

    .line 73
    const/16 v17, 0x5

    .line 74
    .line 75
    move-object/from16 v0, p0

    .line 76
    .line 77
    move-wide v2, v6

    .line 78
    move v15, v9

    .line 79
    move/from16 v9, v17

    .line 80
    .line 81
    invoke-virtual/range {v0 .. v9}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 86
    .line 87
    goto/16 :goto_7

    .line 88
    .line 89
    :cond_3
    move v15, v9

    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_4
    move v15, v9

    .line 93
    iget-object v1, v10, Lh0/N;->z:Le3/e;

    .line 94
    .line 95
    iget-object v2, v10, Lh0/N;->D:Lh0/X;

    .line 96
    .line 97
    iget-object v2, v2, Lh0/X;->j:Lh0/V;

    .line 98
    .line 99
    if-eq v0, v2, :cond_5

    .line 100
    .line 101
    move v2, v14

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move v2, v13

    .line 104
    :goto_1
    iget-object v3, v1, Le3/e;->p:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Lh0/o0;

    .line 107
    .line 108
    iget-object v4, v1, Le3/e;->n:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v4, Lh0/u0;

    .line 111
    .line 112
    if-eqz v3, :cond_a

    .line 113
    .line 114
    invoke-interface {v3}, Lh0/o0;->isEnded()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_a

    .line 119
    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    iget-object v3, v1, Le3/e;->p:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lh0/o0;

    .line 125
    .line 126
    invoke-interface {v3}, Lh0/o0;->getState()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-ne v3, v12, :cond_a

    .line 131
    .line 132
    :cond_6
    iget-object v3, v1, Le3/e;->p:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Lh0/o0;

    .line 135
    .line 136
    invoke-interface {v3}, Lh0/o0;->isReady()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_7

    .line 141
    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    iget-object v2, v1, Le3/e;->p:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Lh0/o0;

    .line 147
    .line 148
    invoke-interface {v2}, Lh0/o0;->hasReadStreamToEnd()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    iget-object v2, v1, Le3/e;->q:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Lh0/U;

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-interface {v2}, Lh0/U;->h()J

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    iget-boolean v3, v1, Le3/e;->l:Z

    .line 167
    .line 168
    if-eqz v3, :cond_9

    .line 169
    .line 170
    invoke-virtual {v4}, Lh0/u0;->h()J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    cmp-long v3, v5, v7

    .line 175
    .line 176
    if-gez v3, :cond_8

    .line 177
    .line 178
    iget-boolean v2, v4, Lh0/u0;->m:Z

    .line 179
    .line 180
    if-eqz v2, :cond_b

    .line 181
    .line 182
    invoke-virtual {v4}, Lh0/u0;->h()J

    .line 183
    .line 184
    .line 185
    move-result-wide v2

    .line 186
    invoke-virtual {v4, v2, v3}, Lh0/u0;->b(J)V

    .line 187
    .line 188
    .line 189
    iput-boolean v13, v4, Lh0/u0;->m:Z

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    iput-boolean v13, v1, Le3/e;->l:Z

    .line 193
    .line 194
    iget-boolean v3, v1, Le3/e;->m:Z

    .line 195
    .line 196
    if-eqz v3, :cond_9

    .line 197
    .line 198
    invoke-virtual {v4}, Lh0/u0;->c()V

    .line 199
    .line 200
    .line 201
    :cond_9
    invoke-virtual {v4, v5, v6}, Lh0/u0;->b(J)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v2}, Lh0/U;->d()La0/J;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v3, v4, Lh0/u0;->p:La0/J;

    .line 209
    .line 210
    invoke-virtual {v2, v3}, La0/J;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_b

    .line 215
    .line 216
    invoke-virtual {v4, v2}, Lh0/u0;->a(La0/J;)V

    .line 217
    .line 218
    .line 219
    iget-object v3, v1, Le3/e;->o:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v3, Lh0/N;

    .line 222
    .line 223
    iget-object v3, v3, Lh0/N;->t:Ld0/t;

    .line 224
    .line 225
    invoke-virtual {v3, v15, v2}, Ld0/t;->a(ILjava/lang/Object;)Ld0/s;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v2}, Ld0/s;->b()V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_a
    :goto_2
    iput-boolean v14, v1, Le3/e;->l:Z

    .line 234
    .line 235
    iget-boolean v2, v1, Le3/e;->m:Z

    .line 236
    .line 237
    if-eqz v2, :cond_b

    .line 238
    .line 239
    invoke-virtual {v4}, Lh0/u0;->c()V

    .line 240
    .line 241
    .line 242
    :cond_b
    :goto_3
    invoke-virtual {v1}, Le3/e;->h()J

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    iput-wide v1, v10, Lh0/N;->a0:J

    .line 247
    .line 248
    iget-wide v3, v0, Lh0/V;->p:J

    .line 249
    .line 250
    sub-long v6, v1, v3

    .line 251
    .line 252
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 253
    .line 254
    iget-wide v0, v0, Lh0/i0;->s:J

    .line 255
    .line 256
    iget-object v0, v10, Lh0/N;->A:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_12

    .line 263
    .line 264
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 265
    .line 266
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 267
    .line 268
    invoke-virtual {v0}, Lx0/H;->b()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_c

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_c
    iget-boolean v0, v10, Lh0/N;->d0:Z

    .line 276
    .line 277
    if-eqz v0, :cond_d

    .line 278
    .line 279
    iput-boolean v13, v10, Lh0/N;->d0:Z

    .line 280
    .line 281
    :cond_d
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 282
    .line 283
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 284
    .line 285
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 286
    .line 287
    iget-object v0, v0, Lx0/H;->a:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-virtual {v1, v0}, La0/U;->b(Ljava/lang/Object;)I

    .line 290
    .line 291
    .line 292
    iget v0, v10, Lh0/N;->c0:I

    .line 293
    .line 294
    iget-object v1, v10, Lh0/N;->A:Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-lez v0, :cond_f

    .line 305
    .line 306
    iget-object v1, v10, Lh0/N;->A:Ljava/util/ArrayList;

    .line 307
    .line 308
    add-int/lit8 v2, v0, -0x1

    .line 309
    .line 310
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-nez v1, :cond_e

    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_e
    new-instance v0, Ljava/lang/ClassCastException;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :cond_f
    :goto_4
    iget-object v1, v10, Lh0/N;->A:Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-ge v0, v1, :cond_11

    .line 330
    .line 331
    iget-object v1, v10, Lh0/N;->A:Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    if-nez v1, :cond_10

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_10
    new-instance v0, Ljava/lang/ClassCastException;

    .line 341
    .line 342
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 343
    .line 344
    .line 345
    throw v0

    .line 346
    :cond_11
    :goto_5
    iput v0, v10, Lh0/N;->c0:I

    .line 347
    .line 348
    :cond_12
    :goto_6
    iget-object v0, v10, Lh0/N;->z:Le3/e;

    .line 349
    .line 350
    invoke-virtual {v0}, Le3/e;->f()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_13

    .line 355
    .line 356
    iget-object v0, v10, Lh0/N;->M:Lh0/K;

    .line 357
    .line 358
    iget-boolean v0, v0, Lh0/K;->c:Z

    .line 359
    .line 360
    xor-int/lit8 v8, v0, 0x1

    .line 361
    .line 362
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 363
    .line 364
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 365
    .line 366
    iget-wide v4, v0, Lh0/i0;->c:J

    .line 367
    .line 368
    const/4 v9, 0x6

    .line 369
    move-object/from16 v0, p0

    .line 370
    .line 371
    move-wide v2, v6

    .line 372
    invoke-virtual/range {v0 .. v9}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iput-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_13
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 380
    .line 381
    iput-wide v6, v0, Lh0/i0;->s:J

    .line 382
    .line 383
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 384
    .line 385
    .line 386
    move-result-wide v1

    .line 387
    iput-wide v1, v0, Lh0/i0;->t:J

    .line 388
    .line 389
    :goto_7
    iget-object v0, v10, Lh0/N;->D:Lh0/X;

    .line 390
    .line 391
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 392
    .line 393
    iget-object v1, v10, Lh0/N;->L:Lh0/i0;

    .line 394
    .line 395
    invoke-virtual {v0}, Lh0/V;->d()J

    .line 396
    .line 397
    .line 398
    move-result-wide v2

    .line 399
    iput-wide v2, v1, Lh0/i0;->q:J

    .line 400
    .line 401
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 402
    .line 403
    iget-wide v1, v0, Lh0/i0;->q:J

    .line 404
    .line 405
    invoke-virtual {v10, v1, v2}, Lh0/N;->j(J)J

    .line 406
    .line 407
    .line 408
    move-result-wide v1

    .line 409
    iput-wide v1, v0, Lh0/i0;->r:J

    .line 410
    .line 411
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 412
    .line 413
    iget-boolean v1, v0, Lh0/i0;->l:Z

    .line 414
    .line 415
    if-eqz v1, :cond_1c

    .line 416
    .line 417
    iget v1, v0, Lh0/i0;->e:I

    .line 418
    .line 419
    if-ne v1, v11, :cond_1c

    .line 420
    .line 421
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 422
    .line 423
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 424
    .line 425
    invoke-virtual {v10, v1, v0}, Lh0/N;->d0(La0/U;Lx0/H;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_1c

    .line 430
    .line 431
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 432
    .line 433
    iget-object v1, v0, Lh0/i0;->o:La0/J;

    .line 434
    .line 435
    iget v1, v1, La0/J;->a:F

    .line 436
    .line 437
    const/high16 v2, 0x3f800000    # 1.0f

    .line 438
    .line 439
    cmpl-float v1, v1, v2

    .line 440
    .line 441
    if-nez v1, :cond_1c

    .line 442
    .line 443
    iget-object v1, v10, Lh0/N;->F:Lh0/O;

    .line 444
    .line 445
    iget-object v3, v0, Lh0/i0;->a:La0/U;

    .line 446
    .line 447
    iget-object v4, v0, Lh0/i0;->b:Lx0/H;

    .line 448
    .line 449
    iget-object v4, v4, Lx0/H;->a:Ljava/lang/Object;

    .line 450
    .line 451
    iget-wide v5, v0, Lh0/i0;->s:J

    .line 452
    .line 453
    invoke-virtual {v10, v3, v4, v5, v6}, Lh0/N;->g(La0/U;Ljava/lang/Object;J)J

    .line 454
    .line 455
    .line 456
    move-result-wide v3

    .line 457
    iget-object v0, v10, Lh0/N;->L:Lh0/i0;

    .line 458
    .line 459
    iget-wide v5, v0, Lh0/i0;->r:J

    .line 460
    .line 461
    check-cast v1, Lh0/k;

    .line 462
    .line 463
    iget-wide v7, v1, Lh0/k;->h:J

    .line 464
    .line 465
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    cmp-long v0, v7, v16

    .line 471
    .line 472
    if-nez v0, :cond_14

    .line 473
    .line 474
    goto/16 :goto_c

    .line 475
    .line 476
    :cond_14
    sub-long v5, v3, v5

    .line 477
    .line 478
    iget-wide v7, v1, Lh0/k;->r:J

    .line 479
    .line 480
    cmp-long v0, v7, v16

    .line 481
    .line 482
    if-nez v0, :cond_15

    .line 483
    .line 484
    iput-wide v5, v1, Lh0/k;->r:J

    .line 485
    .line 486
    const-wide/16 v5, 0x0

    .line 487
    .line 488
    iput-wide v5, v1, Lh0/k;->s:J

    .line 489
    .line 490
    goto :goto_8

    .line 491
    :cond_15
    iget v0, v1, Lh0/k;->g:F

    .line 492
    .line 493
    long-to-float v7, v7

    .line 494
    mul-float/2addr v7, v0

    .line 495
    sub-float v8, v2, v0

    .line 496
    .line 497
    long-to-float v9, v5

    .line 498
    mul-float/2addr v9, v8

    .line 499
    add-float/2addr v9, v7

    .line 500
    float-to-long v14, v9

    .line 501
    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 502
    .line 503
    .line 504
    move-result-wide v14

    .line 505
    iput-wide v14, v1, Lh0/k;->r:J

    .line 506
    .line 507
    sub-long/2addr v5, v14

    .line 508
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 509
    .line 510
    .line 511
    move-result-wide v5

    .line 512
    iget-wide v14, v1, Lh0/k;->s:J

    .line 513
    .line 514
    long-to-float v9, v14

    .line 515
    mul-float/2addr v0, v9

    .line 516
    long-to-float v5, v5

    .line 517
    mul-float/2addr v8, v5

    .line 518
    add-float/2addr v8, v0

    .line 519
    float-to-long v5, v8

    .line 520
    iput-wide v5, v1, Lh0/k;->s:J

    .line 521
    .line 522
    :goto_8
    iget-wide v5, v1, Lh0/k;->q:J

    .line 523
    .line 524
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    cmp-long v0, v5, v8

    .line 530
    .line 531
    iget-wide v5, v1, Lh0/k;->c:J

    .line 532
    .line 533
    if-eqz v0, :cond_16

    .line 534
    .line 535
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 536
    .line 537
    .line 538
    move-result-wide v8

    .line 539
    iget-wide v14, v1, Lh0/k;->q:J

    .line 540
    .line 541
    sub-long/2addr v8, v14

    .line 542
    cmp-long v0, v8, v5

    .line 543
    .line 544
    if-gez v0, :cond_16

    .line 545
    .line 546
    iget v2, v1, Lh0/k;->p:F

    .line 547
    .line 548
    goto/16 :goto_c

    .line 549
    .line 550
    :cond_16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 551
    .line 552
    .line 553
    move-result-wide v8

    .line 554
    iput-wide v8, v1, Lh0/k;->q:J

    .line 555
    .line 556
    iget-wide v8, v1, Lh0/k;->r:J

    .line 557
    .line 558
    const-wide/16 v14, 0x3

    .line 559
    .line 560
    iget-wide v12, v1, Lh0/k;->s:J

    .line 561
    .line 562
    mul-long/2addr v12, v14

    .line 563
    add-long v22, v12, v8

    .line 564
    .line 565
    iget-wide v8, v1, Lh0/k;->m:J

    .line 566
    .line 567
    cmp-long v8, v8, v22

    .line 568
    .line 569
    iget v9, v1, Lh0/k;->d:F

    .line 570
    .line 571
    if-lez v8, :cond_19

    .line 572
    .line 573
    invoke-static {v5, v6}, Ld0/w;->M(J)J

    .line 574
    .line 575
    .line 576
    move-result-wide v5

    .line 577
    iget v8, v1, Lh0/k;->p:F

    .line 578
    .line 579
    sub-float/2addr v8, v2

    .line 580
    long-to-float v5, v5

    .line 581
    mul-float/2addr v8, v5

    .line 582
    float-to-long v12, v8

    .line 583
    iget v6, v1, Lh0/k;->n:F

    .line 584
    .line 585
    sub-float/2addr v6, v2

    .line 586
    mul-float/2addr v6, v5

    .line 587
    float-to-long v5, v6

    .line 588
    add-long/2addr v12, v5

    .line 589
    iget-wide v5, v1, Lh0/k;->j:J

    .line 590
    .line 591
    iget-wide v14, v1, Lh0/k;->m:J

    .line 592
    .line 593
    sub-long/2addr v14, v12

    .line 594
    new-array v8, v11, [J

    .line 595
    .line 596
    const/4 v0, 0x0

    .line 597
    aput-wide v22, v8, v0

    .line 598
    .line 599
    const/4 v7, 0x1

    .line 600
    aput-wide v5, v8, v7

    .line 601
    .line 602
    const/4 v5, 0x2

    .line 603
    aput-wide v14, v8, v5

    .line 604
    .line 605
    aget-wide v5, v8, v0

    .line 606
    .line 607
    move v12, v7

    .line 608
    :goto_9
    if-ge v12, v11, :cond_18

    .line 609
    .line 610
    aget-wide v13, v8, v12

    .line 611
    .line 612
    cmp-long v15, v13, v5

    .line 613
    .line 614
    if-lez v15, :cond_17

    .line 615
    .line 616
    move-wide v5, v13

    .line 617
    :cond_17
    add-int/2addr v12, v7

    .line 618
    goto :goto_9

    .line 619
    :cond_18
    iput-wide v5, v1, Lh0/k;->m:J

    .line 620
    .line 621
    goto :goto_a

    .line 622
    :cond_19
    iget v5, v1, Lh0/k;->p:F

    .line 623
    .line 624
    sub-float/2addr v5, v2

    .line 625
    const/4 v6, 0x0

    .line 626
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    div-float/2addr v5, v9

    .line 631
    float-to-long v5, v5

    .line 632
    sub-long v18, v3, v5

    .line 633
    .line 634
    iget-wide v5, v1, Lh0/k;->m:J

    .line 635
    .line 636
    move-wide/from16 v20, v5

    .line 637
    .line 638
    invoke-static/range {v18 .. v23}, Ld0/w;->j(JJJ)J

    .line 639
    .line 640
    .line 641
    move-result-wide v5

    .line 642
    iput-wide v5, v1, Lh0/k;->m:J

    .line 643
    .line 644
    iget-wide v7, v1, Lh0/k;->l:J

    .line 645
    .line 646
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    cmp-long v11, v7, v11

    .line 652
    .line 653
    if-eqz v11, :cond_1a

    .line 654
    .line 655
    cmp-long v5, v5, v7

    .line 656
    .line 657
    if-lez v5, :cond_1a

    .line 658
    .line 659
    iput-wide v7, v1, Lh0/k;->m:J

    .line 660
    .line 661
    :cond_1a
    :goto_a
    iget-wide v5, v1, Lh0/k;->m:J

    .line 662
    .line 663
    sub-long/2addr v3, v5

    .line 664
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 665
    .line 666
    .line 667
    move-result-wide v5

    .line 668
    iget-wide v7, v1, Lh0/k;->e:J

    .line 669
    .line 670
    cmp-long v5, v5, v7

    .line 671
    .line 672
    if-gez v5, :cond_1b

    .line 673
    .line 674
    iput v2, v1, Lh0/k;->p:F

    .line 675
    .line 676
    goto :goto_b

    .line 677
    :cond_1b
    long-to-float v3, v3

    .line 678
    mul-float/2addr v9, v3

    .line 679
    add-float/2addr v9, v2

    .line 680
    iget v2, v1, Lh0/k;->o:F

    .line 681
    .line 682
    iget v3, v1, Lh0/k;->n:F

    .line 683
    .line 684
    invoke-static {v9, v2, v3}, Ld0/w;->h(FFF)F

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    iput v2, v1, Lh0/k;->p:F

    .line 689
    .line 690
    :goto_b
    iget v2, v1, Lh0/k;->p:F

    .line 691
    .line 692
    :goto_c
    iget-object v1, v10, Lh0/N;->z:Le3/e;

    .line 693
    .line 694
    invoke-virtual {v1}, Le3/e;->d()La0/J;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    iget v1, v1, La0/J;->a:F

    .line 699
    .line 700
    cmpl-float v1, v1, v2

    .line 701
    .line 702
    if-eqz v1, :cond_1c

    .line 703
    .line 704
    iget-object v1, v10, Lh0/N;->L:Lh0/i0;

    .line 705
    .line 706
    iget-object v1, v1, Lh0/i0;->o:La0/J;

    .line 707
    .line 708
    new-instance v3, La0/J;

    .line 709
    .line 710
    iget v1, v1, La0/J;->b:F

    .line 711
    .line 712
    invoke-direct {v3, v2, v1}, La0/J;-><init>(FF)V

    .line 713
    .line 714
    .line 715
    iget-object v1, v10, Lh0/N;->t:Ld0/t;

    .line 716
    .line 717
    const/16 v2, 0x10

    .line 718
    .line 719
    invoke-virtual {v1, v2}, Ld0/t;->d(I)V

    .line 720
    .line 721
    .line 722
    iget-object v1, v10, Lh0/N;->z:Le3/e;

    .line 723
    .line 724
    invoke-virtual {v1, v3}, Le3/e;->a(La0/J;)V

    .line 725
    .line 726
    .line 727
    iget-object v1, v10, Lh0/N;->L:Lh0/i0;

    .line 728
    .line 729
    iget-object v1, v1, Lh0/i0;->o:La0/J;

    .line 730
    .line 731
    iget-object v2, v10, Lh0/N;->z:Le3/e;

    .line 732
    .line 733
    invoke-virtual {v2}, Le3/e;->d()La0/J;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    iget v2, v2, La0/J;->a:F

    .line 738
    .line 739
    const/4 v0, 0x0

    .line 740
    invoke-virtual {v10, v1, v2, v0, v0}, Lh0/N;->p(La0/J;FZZ)V

    .line 741
    .line 742
    .line 743
    :cond_1c
    return-void
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

.method public final l(Ljava/io/IOException;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lh0/o;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object/from16 v3, p1

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v1, v2, v3, v4}, Lh0/o;-><init>(ILjava/lang/Exception;I)V

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Lh0/N;->D:Lh0/X;

    .line 14
    .line 15
    iget-object v3, v3, Lh0/X;->i:Lh0/V;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v3, Lh0/V;->g:Lh0/W;

    .line 20
    .line 21
    new-instance v17, Lh0/o;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-wide v14, v1, La0/I;->m:J

    .line 32
    .line 33
    iget-boolean v13, v1, Lh0/o;->t:Z

    .line 34
    .line 35
    iget v7, v1, La0/I;->l:I

    .line 36
    .line 37
    iget v8, v1, Lh0/o;->n:I

    .line 38
    .line 39
    iget-object v9, v1, Lh0/o;->o:Ljava/lang/String;

    .line 40
    .line 41
    iget v10, v1, Lh0/o;->p:I

    .line 42
    .line 43
    iget-object v11, v1, Lh0/o;->q:La0/p;

    .line 44
    .line 45
    iget v12, v1, Lh0/o;->r:I

    .line 46
    .line 47
    iget-object v1, v3, Lh0/W;->a:Lx0/H;

    .line 48
    .line 49
    move-object/from16 v4, v17

    .line 50
    .line 51
    move v3, v13

    .line 52
    move-object v13, v1

    .line 53
    move/from16 v16, v3

    .line 54
    .line 55
    invoke-direct/range {v4 .. v16}, Lh0/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILa0/p;ILx0/H;JZ)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v1, v17

    .line 59
    .line 60
    :cond_0
    const-string v3, "ExoPlayerImplInternal"

    .line 61
    .line 62
    const-string v4, "Playback error"

    .line 63
    .line 64
    invoke-static {v3, v4, v1}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2, v2}, Lh0/N;->f0(ZZ)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Lh0/N;->L:Lh0/i0;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lh0/i0;->e(Lh0/o;)Lh0/i0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, v0, Lh0/N;->L:Lh0/i0;

    .line 77
    .line 78
    return-void
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

.method public final l0(La0/U;Lx0/H;La0/U;Lx0/H;JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lh0/N;->d0(La0/U;Lx0/H;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p2}, Lx0/H;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, La0/J;->d:La0/J;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 17
    .line 18
    iget-object p1, p1, Lh0/i0;->o:La0/J;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Lh0/N;->z:Le3/e;

    .line 21
    .line 22
    invoke-virtual {p2}, Le3/e;->d()La0/J;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3, p1}, La0/J;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_1

    .line 31
    .line 32
    iget-object p3, p0, Lh0/N;->t:Ld0/t;

    .line 33
    .line 34
    const/16 p4, 0x10

    .line 35
    .line 36
    invoke-virtual {p3, p4}, Ld0/t;->d(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, Le3/e;->a(La0/J;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lh0/N;->L:Lh0/i0;

    .line 43
    .line 44
    iget-object p2, p2, Lh0/i0;->o:La0/J;

    .line 45
    .line 46
    iget p1, p1, La0/J;->a:F

    .line 47
    .line 48
    const/4 p3, 0x0

    .line 49
    invoke-virtual {p0, p2, p1, p3, p3}, Lh0/N;->p(La0/J;FZZ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void

    .line 53
    :cond_2
    iget-object p2, p2, Lx0/H;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, p0, Lh0/N;->x:La0/S;

    .line 56
    .line 57
    invoke-virtual {p1, p2, v0}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget v1, v1, La0/S;->c:I

    .line 62
    .line 63
    iget-object v2, p0, Lh0/N;->w:La0/T;

    .line 64
    .line 65
    invoke-virtual {p1, v1, v2}, La0/U;->n(ILa0/T;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v2, La0/T;->j:La0/v;

    .line 69
    .line 70
    iget-object v3, p0, Lh0/N;->F:Lh0/O;

    .line 71
    .line 72
    check-cast v3, Lh0/k;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-wide v4, v1, La0/v;->a:J

    .line 78
    .line 79
    invoke-static {v4, v5}, Ld0/w;->M(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    iput-wide v4, v3, Lh0/k;->h:J

    .line 84
    .line 85
    iget-wide v4, v1, La0/v;->b:J

    .line 86
    .line 87
    invoke-static {v4, v5}, Ld0/w;->M(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    iput-wide v4, v3, Lh0/k;->k:J

    .line 92
    .line 93
    iget-wide v4, v1, La0/v;->c:J

    .line 94
    .line 95
    invoke-static {v4, v5}, Ld0/w;->M(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    iput-wide v4, v3, Lh0/k;->l:J

    .line 100
    .line 101
    iget v4, v1, La0/v;->d:F

    .line 102
    .line 103
    const v5, -0x800001

    .line 104
    .line 105
    .line 106
    cmpl-float v6, v4, v5

    .line 107
    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget v4, v3, Lh0/k;->a:F

    .line 112
    .line 113
    :goto_1
    iput v4, v3, Lh0/k;->o:F

    .line 114
    .line 115
    iget v1, v1, La0/v;->e:F

    .line 116
    .line 117
    cmpl-float v5, v1, v5

    .line 118
    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    iget v1, v3, Lh0/k;->b:F

    .line 123
    .line 124
    :goto_2
    iput v1, v3, Lh0/k;->n:F

    .line 125
    .line 126
    const/high16 v5, 0x3f800000    # 1.0f

    .line 127
    .line 128
    cmpl-float v4, v4, v5

    .line 129
    .line 130
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    if-nez v4, :cond_5

    .line 136
    .line 137
    cmpl-float v1, v1, v5

    .line 138
    .line 139
    if-nez v1, :cond_5

    .line 140
    .line 141
    iput-wide v6, v3, Lh0/k;->h:J

    .line 142
    .line 143
    :cond_5
    invoke-virtual {v3}, Lh0/k;->a()V

    .line 144
    .line 145
    .line 146
    cmp-long v1, p5, v6

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0, p1, p2, p5, p6}, Lh0/N;->g(La0/U;Ljava/lang/Object;J)J

    .line 151
    .line 152
    .line 153
    move-result-wide p1

    .line 154
    iput-wide p1, v3, Lh0/k;->i:J

    .line 155
    .line 156
    invoke-virtual {v3}, Lh0/k;->a()V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    iget-object p1, v2, La0/T;->a:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {p3}, La0/U;->p()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-nez p2, :cond_7

    .line 167
    .line 168
    iget-object p2, p4, Lx0/H;->a:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {p3, p2, v0}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    iget p2, p2, La0/S;->c:I

    .line 175
    .line 176
    const-wide/16 p4, 0x0

    .line 177
    .line 178
    invoke-virtual {p3, p2, v2, p4, p5}, La0/U;->m(ILa0/T;J)La0/T;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    iget-object p2, p2, La0/T;->a:Ljava/lang/Object;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    const/4 p2, 0x0

    .line 186
    :goto_3
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    if-eqz p7, :cond_9

    .line 193
    .line 194
    :cond_8
    iput-wide v6, v3, Lh0/k;->i:J

    .line 195
    .line 196
    invoke-virtual {v3}, Lh0/k;->a()V

    .line 197
    .line 198
    .line 199
    :cond_9
    :goto_4
    return-void
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
.end method

.method public final m(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->k:Lh0/V;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 8
    .line 9
    iget-object v1, v1, Lh0/i0;->b:Lx0/H;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 13
    .line 14
    iget-object v1, v1, Lh0/W;->a:Lx0/H;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lh0/N;->L:Lh0/i0;

    .line 17
    .line 18
    iget-object v2, v2, Lh0/i0;->k:Lx0/H;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Lh0/N;->L:Lh0/i0;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lh0/i0;->b(Lx0/H;)Lh0/i0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, Lh0/i0;->s:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Lh0/V;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, Lh0/i0;->q:J

    .line 46
    .line 47
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 48
    .line 49
    iget-wide v3, v1, Lh0/i0;->q:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, Lh0/N;->j(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Lh0/i0;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Lh0/V;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Lh0/V;->o:LA0/A;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lh0/N;->i0(LA0/A;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void
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

.method public final m0(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh0/N;->Q:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lh0/N;->B:Ld0/r;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_0
    iput-wide p1, p0, Lh0/N;->R:J

    .line 23
    .line 24
    return-void
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

.method public final n(La0/U;Z)V
    .locals 37

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 6
    .line 7
    iget-object v8, v11, Lh0/N;->Z:Lh0/M;

    .line 8
    .line 9
    iget-object v9, v11, Lh0/N;->D:Lh0/X;

    .line 10
    .line 11
    iget v4, v11, Lh0/N;->T:I

    .line 12
    .line 13
    iget-boolean v10, v11, Lh0/N;->U:Z

    .line 14
    .line 15
    iget-object v13, v11, Lh0/N;->w:La0/T;

    .line 16
    .line 17
    iget-object v14, v11, Lh0/N;->x:La0/S;

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, La0/U;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Lh0/L;

    .line 31
    .line 32
    sget-object v19, Lh0/i0;->u:Lx0/H;

    .line 33
    .line 34
    const/16 v25, 0x1

    .line 35
    .line 36
    const/16 v26, 0x0

    .line 37
    .line 38
    const-wide/16 v20, 0x0

    .line 39
    .line 40
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/16 v24, 0x0

    .line 46
    .line 47
    move-object/from16 v18, v0

    .line 48
    .line 49
    invoke-direct/range {v18 .. v26}, Lh0/L;-><init>(Lx0/H;JJZZZ)V

    .line 50
    .line 51
    .line 52
    move-object v7, v0

    .line 53
    const/4 v8, 0x4

    .line 54
    const/4 v9, -0x1

    .line 55
    goto/16 :goto_16

    .line 56
    .line 57
    :cond_0
    iget-object v3, v0, Lh0/i0;->b:Lx0/H;

    .line 58
    .line 59
    iget-object v2, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 62
    .line 63
    invoke-virtual {v1}, La0/U;->p()Z

    .line 64
    .line 65
    .line 66
    move-result v18

    .line 67
    if-nez v18, :cond_2

    .line 68
    .line 69
    iget-object v5, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v1, v5, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-boolean v1, v1, La0/S;->f:Z

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/16 v19, 0x0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :goto_0
    const/16 v19, 0x1

    .line 84
    .line 85
    :goto_1
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 86
    .line 87
    invoke-virtual {v1}, Lx0/H;->b()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    if-eqz v19, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    iget-wide v6, v0, Lh0/i0;->s:J

    .line 97
    .line 98
    :goto_2
    move-wide/from16 v22, v6

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    :goto_3
    iget-wide v6, v0, Lh0/i0;->c:J

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :goto_4
    const-wide/16 v6, 0x0

    .line 105
    .line 106
    if-eqz v8, :cond_8

    .line 107
    .line 108
    const/4 v5, 0x1

    .line 109
    move-object/from16 v1, p1

    .line 110
    .line 111
    move-object v15, v2

    .line 112
    move-object v2, v8

    .line 113
    move-object v11, v3

    .line 114
    move v3, v5

    .line 115
    move v5, v10

    .line 116
    const/4 v7, -0x1

    .line 117
    move-object v6, v13

    .line 118
    move-object/from16 v18, v9

    .line 119
    .line 120
    move v9, v7

    .line 121
    move-object v7, v14

    .line 122
    invoke-static/range {v1 .. v7}, Lh0/N;->J(La0/U;Lh0/M;ZIZLa0/T;La0/S;)Landroid/util/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {v12, v10}, La0/U;->a(Z)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    move-object v2, v15

    .line 133
    move-wide/from16 v3, v22

    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v7, 0x1

    .line 138
    const/4 v8, 0x4

    .line 139
    goto :goto_7

    .line 140
    :cond_5
    iget-wide v2, v8, Lh0/M;->c:J

    .line 141
    .line 142
    cmp-long v2, v2, v16

    .line 143
    .line 144
    if-nez v2, :cond_6

    .line 145
    .line 146
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v12, v1, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget v6, v1, La0/S;->c:I

    .line 153
    .line 154
    move-object v2, v15

    .line 155
    move-wide/from16 v3, v22

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    goto :goto_5

    .line 159
    :cond_6
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Ljava/lang/Long;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    move v6, v9

    .line 170
    const/4 v7, 0x1

    .line 171
    :goto_5
    iget v1, v0, Lh0/i0;->e:I

    .line 172
    .line 173
    const/4 v8, 0x4

    .line 174
    if-ne v1, v8, :cond_7

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    goto :goto_6

    .line 178
    :cond_7
    const/4 v1, 0x0

    .line 179
    :goto_6
    move v5, v7

    .line 180
    const/4 v7, 0x0

    .line 181
    move/from16 v36, v6

    .line 182
    .line 183
    move v6, v1

    .line 184
    move/from16 v1, v36

    .line 185
    .line 186
    :goto_7
    move/from16 v35, v5

    .line 187
    .line 188
    move/from16 v33, v6

    .line 189
    .line 190
    move/from16 v34, v7

    .line 191
    .line 192
    const-wide/16 v25, 0x0

    .line 193
    .line 194
    move v5, v1

    .line 195
    goto/16 :goto_d

    .line 196
    .line 197
    :cond_8
    move-object v15, v2

    .line 198
    move-object v11, v3

    .line 199
    move-object/from16 v18, v9

    .line 200
    .line 201
    const/4 v8, 0x4

    .line 202
    const/4 v9, -0x1

    .line 203
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 204
    .line 205
    invoke-virtual {v1}, La0/U;->p()Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_9

    .line 210
    .line 211
    invoke-virtual {v12, v10}, La0/U;->a(Z)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    :goto_8
    move v5, v1

    .line 216
    move-object v2, v15

    .line 217
    move-wide/from16 v3, v22

    .line 218
    .line 219
    const-wide/16 v25, 0x0

    .line 220
    .line 221
    :goto_9
    const/16 v33, 0x0

    .line 222
    .line 223
    const/16 v34, 0x0

    .line 224
    .line 225
    :goto_a
    const/16 v35, 0x0

    .line 226
    .line 227
    goto/16 :goto_d

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v12, v15}, La0/U;->b(Ljava/lang/Object;)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-ne v1, v9, :cond_b

    .line 234
    .line 235
    iget-object v6, v0, Lh0/i0;->a:La0/U;

    .line 236
    .line 237
    move-object v1, v13

    .line 238
    move-object v2, v14

    .line 239
    move v3, v4

    .line 240
    move v4, v10

    .line 241
    move-object v5, v15

    .line 242
    move-object/from16 v7, p1

    .line 243
    .line 244
    invoke-static/range {v1 .. v7}, Lh0/N;->K(La0/T;La0/S;IZLjava/lang/Object;La0/U;La0/U;)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-ne v1, v9, :cond_a

    .line 249
    .line 250
    invoke-virtual {v12, v10}, La0/U;->a(Z)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    const/4 v7, 0x1

    .line 255
    goto :goto_b

    .line 256
    :cond_a
    const/4 v7, 0x0

    .line 257
    :goto_b
    move v5, v1

    .line 258
    move/from16 v34, v7

    .line 259
    .line 260
    move-object v2, v15

    .line 261
    move-wide/from16 v3, v22

    .line 262
    .line 263
    const-wide/16 v25, 0x0

    .line 264
    .line 265
    const/16 v33, 0x0

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_b
    cmp-long v1, v22, v16

    .line 269
    .line 270
    if-nez v1, :cond_c

    .line 271
    .line 272
    invoke-virtual {v12, v15, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget v1, v1, La0/S;->c:I

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_c
    if-eqz v19, :cond_e

    .line 280
    .line 281
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 282
    .line 283
    iget-object v2, v11, Lx0/H;->a:Ljava/lang/Object;

    .line 284
    .line 285
    invoke-virtual {v1, v2, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 286
    .line 287
    .line 288
    iget-object v1, v0, Lh0/i0;->a:La0/U;

    .line 289
    .line 290
    iget v2, v14, La0/S;->c:I

    .line 291
    .line 292
    const-wide/16 v5, 0x0

    .line 293
    .line 294
    invoke-virtual {v1, v2, v13, v5, v6}, La0/U;->m(ILa0/T;J)La0/T;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    iget v1, v1, La0/T;->n:I

    .line 299
    .line 300
    iget-object v2, v0, Lh0/i0;->a:La0/U;

    .line 301
    .line 302
    iget-object v3, v11, Lx0/H;->a:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-virtual {v2, v3}, La0/U;->b(Ljava/lang/Object;)I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-ne v1, v2, :cond_d

    .line 309
    .line 310
    iget-wide v1, v14, La0/S;->e:J

    .line 311
    .line 312
    add-long v20, v22, v1

    .line 313
    .line 314
    invoke-virtual {v12, v15, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    iget v4, v1, La0/S;->c:I

    .line 319
    .line 320
    move-object/from16 v1, p1

    .line 321
    .line 322
    move-object v2, v13

    .line 323
    move-object v3, v14

    .line 324
    move-wide/from16 v25, v5

    .line 325
    .line 326
    move-wide/from16 v5, v20

    .line 327
    .line 328
    invoke-virtual/range {v1 .. v6}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 333
    .line 334
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v1, Ljava/lang/Long;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 339
    .line 340
    .line 341
    move-result-wide v3

    .line 342
    goto :goto_c

    .line 343
    :cond_d
    move-wide/from16 v25, v5

    .line 344
    .line 345
    move-object v2, v15

    .line 346
    move-wide/from16 v3, v22

    .line 347
    .line 348
    :goto_c
    move v5, v9

    .line 349
    const/16 v33, 0x0

    .line 350
    .line 351
    const/16 v34, 0x0

    .line 352
    .line 353
    const/16 v35, 0x1

    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_e
    const-wide/16 v25, 0x0

    .line 357
    .line 358
    move v5, v9

    .line 359
    move-object v2, v15

    .line 360
    move-wide/from16 v3, v22

    .line 361
    .line 362
    goto/16 :goto_9

    .line 363
    .line 364
    :goto_d
    if-eq v5, v9, :cond_f

    .line 365
    .line 366
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    move-object/from16 v1, p1

    .line 372
    .line 373
    move-object v2, v13

    .line 374
    move-object v3, v14

    .line 375
    move v4, v5

    .line 376
    move-wide v5, v6

    .line 377
    invoke-virtual/range {v1 .. v6}, La0/U;->i(La0/T;La0/S;IJ)Landroid/util/Pair;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 382
    .line 383
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v1, Ljava/lang/Long;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 388
    .line 389
    .line 390
    move-result-wide v3

    .line 391
    move-wide v6, v3

    .line 392
    move-wide/from16 v31, v16

    .line 393
    .line 394
    :goto_e
    move-object/from16 v1, v18

    .line 395
    .line 396
    goto :goto_f

    .line 397
    :cond_f
    move-wide v6, v3

    .line 398
    move-wide/from16 v31, v6

    .line 399
    .line 400
    goto :goto_e

    .line 401
    :goto_f
    invoke-virtual {v1, v12, v2, v6, v7}, Lh0/X;->n(La0/U;Ljava/lang/Object;J)Lx0/H;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    iget v1, v3, Lx0/H;->e:I

    .line 406
    .line 407
    if-eq v1, v9, :cond_11

    .line 408
    .line 409
    iget v4, v11, Lx0/H;->e:I

    .line 410
    .line 411
    if-eq v4, v9, :cond_10

    .line 412
    .line 413
    if-lt v1, v4, :cond_10

    .line 414
    .line 415
    goto :goto_10

    .line 416
    :cond_10
    const/4 v1, 0x0

    .line 417
    goto :goto_11

    .line 418
    :cond_11
    :goto_10
    const/4 v1, 0x1

    .line 419
    :goto_11
    iget-object v4, v11, Lx0/H;->a:Ljava/lang/Object;

    .line 420
    .line 421
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-eqz v4, :cond_12

    .line 426
    .line 427
    invoke-virtual {v11}, Lx0/H;->b()Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-nez v4, :cond_12

    .line 432
    .line 433
    invoke-virtual {v3}, Lx0/H;->b()Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-nez v4, :cond_12

    .line 438
    .line 439
    if-eqz v1, :cond_12

    .line 440
    .line 441
    const/4 v1, 0x1

    .line 442
    goto :goto_12

    .line 443
    :cond_12
    const/4 v1, 0x0

    .line 444
    :goto_12
    invoke-virtual {v12, v2, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    if-nez v19, :cond_15

    .line 449
    .line 450
    cmp-long v4, v22, v31

    .line 451
    .line 452
    if-nez v4, :cond_15

    .line 453
    .line 454
    iget-object v4, v11, Lx0/H;->a:Ljava/lang/Object;

    .line 455
    .line 456
    iget-object v5, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 457
    .line 458
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_13

    .line 463
    .line 464
    goto :goto_13

    .line 465
    :cond_13
    invoke-virtual {v11}, Lx0/H;->b()Z

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    if-eqz v4, :cond_14

    .line 470
    .line 471
    iget v4, v11, Lx0/H;->b:I

    .line 472
    .line 473
    invoke-virtual {v2, v4}, La0/S;->g(I)Z

    .line 474
    .line 475
    .line 476
    :cond_14
    invoke-virtual {v3}, Lx0/H;->b()Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_15

    .line 481
    .line 482
    iget v4, v3, Lx0/H;->b:I

    .line 483
    .line 484
    invoke-virtual {v2, v4}, La0/S;->g(I)Z

    .line 485
    .line 486
    .line 487
    :cond_15
    :goto_13
    if-nez v1, :cond_16

    .line 488
    .line 489
    goto :goto_14

    .line 490
    :cond_16
    move-object v3, v11

    .line 491
    :goto_14
    invoke-virtual {v3}, Lx0/H;->b()Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-eqz v1, :cond_17

    .line 496
    .line 497
    invoke-virtual {v3, v11}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_18

    .line 502
    .line 503
    iget-wide v6, v0, Lh0/i0;->s:J

    .line 504
    .line 505
    :cond_17
    move-wide/from16 v29, v6

    .line 506
    .line 507
    goto :goto_15

    .line 508
    :cond_18
    iget-object v0, v3, Lx0/H;->a:Ljava/lang/Object;

    .line 509
    .line 510
    invoke-virtual {v12, v0, v14}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 511
    .line 512
    .line 513
    iget v0, v3, Lx0/H;->c:I

    .line 514
    .line 515
    iget v1, v3, Lx0/H;->b:I

    .line 516
    .line 517
    invoke-virtual {v14, v1}, La0/S;->e(I)I

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-ne v0, v1, :cond_19

    .line 522
    .line 523
    iget-object v0, v14, La0/S;->g:La0/b;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    :cond_19
    move-wide/from16 v29, v25

    .line 529
    .line 530
    :goto_15
    new-instance v0, Lh0/L;

    .line 531
    .line 532
    move-object/from16 v27, v0

    .line 533
    .line 534
    move-object/from16 v28, v3

    .line 535
    .line 536
    invoke-direct/range {v27 .. v35}, Lh0/L;-><init>(Lx0/H;JJZZZ)V

    .line 537
    .line 538
    .line 539
    move-object v7, v0

    .line 540
    :goto_16
    iget-object v10, v7, Lh0/L;->a:Lx0/H;

    .line 541
    .line 542
    iget-wide v13, v7, Lh0/L;->c:J

    .line 543
    .line 544
    iget-boolean v6, v7, Lh0/L;->d:Z

    .line 545
    .line 546
    iget-wide v3, v7, Lh0/L;->b:J

    .line 547
    .line 548
    move-object/from16 v11, p0

    .line 549
    .line 550
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 551
    .line 552
    iget-object v0, v0, Lh0/i0;->b:Lx0/H;

    .line 553
    .line 554
    invoke-virtual {v0, v10}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-eqz v0, :cond_1b

    .line 559
    .line 560
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 561
    .line 562
    iget-wide v0, v0, Lh0/i0;->s:J

    .line 563
    .line 564
    cmp-long v0, v3, v0

    .line 565
    .line 566
    if-eqz v0, :cond_1a

    .line 567
    .line 568
    goto :goto_17

    .line 569
    :cond_1a
    const/4 v15, 0x0

    .line 570
    goto :goto_18

    .line 571
    :cond_1b
    :goto_17
    const/4 v15, 0x1

    .line 572
    :goto_18
    const/16 v18, 0x3

    .line 573
    .line 574
    :try_start_0
    iget-boolean v0, v7, Lh0/L;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 575
    .line 576
    if-eqz v0, :cond_1d

    .line 577
    .line 578
    :try_start_1
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 579
    .line 580
    iget v0, v0, Lh0/i0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 581
    .line 582
    const/4 v1, 0x1

    .line 583
    if-eq v0, v1, :cond_1c

    .line 584
    .line 585
    :try_start_2
    invoke-virtual {v11, v8}, Lh0/N;->b0(I)V

    .line 586
    .line 587
    .line 588
    :cond_1c
    const/4 v2, 0x0

    .line 589
    goto :goto_1b

    .line 590
    :catchall_0
    move-exception v0

    .line 591
    :goto_19
    move/from16 v23, v1

    .line 592
    .line 593
    move-wide/from16 v25, v3

    .line 594
    .line 595
    :goto_1a
    move/from16 v19, v8

    .line 596
    .line 597
    const/4 v6, 0x2

    .line 598
    const/4 v8, 0x0

    .line 599
    goto/16 :goto_23

    .line 600
    .line 601
    :goto_1b
    invoke-virtual {v11, v2, v2, v2, v1}, Lh0/N;->F(ZZZZ)V

    .line 602
    .line 603
    .line 604
    goto :goto_1c

    .line 605
    :catchall_1
    move-exception v0

    .line 606
    const/4 v1, 0x1

    .line 607
    goto :goto_19

    .line 608
    :cond_1d
    const/4 v1, 0x1

    .line 609
    :goto_1c
    iget-object v0, v11, Lh0/N;->l:[Lh0/o0;

    .line 610
    .line 611
    array-length v2, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 612
    const/4 v1, 0x0

    .line 613
    :goto_1d
    if-ge v1, v2, :cond_1e

    .line 614
    .line 615
    :try_start_3
    aget-object v5, v0, v1

    .line 616
    .line 617
    invoke-interface {v5, v12}, Lh0/o0;->setTimeline(La0/U;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 618
    .line 619
    .line 620
    add-int/lit8 v1, v1, 0x1

    .line 621
    .line 622
    goto :goto_1d

    .line 623
    :catchall_2
    move-exception v0

    .line 624
    move-wide/from16 v25, v3

    .line 625
    .line 626
    move/from16 v19, v8

    .line 627
    .line 628
    const/4 v6, 0x2

    .line 629
    const/4 v8, 0x0

    .line 630
    const/16 v23, 0x1

    .line 631
    .line 632
    goto/16 :goto_23

    .line 633
    .line 634
    :cond_1e
    if-nez v15, :cond_1f

    .line 635
    .line 636
    :try_start_4
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 637
    .line 638
    iget-wide v5, v11, Lh0/N;->a0:J

    .line 639
    .line 640
    invoke-virtual/range {p0 .. p0}, Lh0/N;->h()J

    .line 641
    .line 642
    .line 643
    move-result-wide v21
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 644
    const/16 v23, 0x1

    .line 645
    .line 646
    move-object/from16 v2, p1

    .line 647
    .line 648
    move-wide/from16 v25, v3

    .line 649
    .line 650
    move-wide v3, v5

    .line 651
    move-wide/from16 v5, v21

    .line 652
    .line 653
    :try_start_5
    invoke-virtual/range {v1 .. v6}, Lh0/X;->q(La0/U;JJ)Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-nez v0, :cond_23

    .line 658
    .line 659
    const/4 v1, 0x0

    .line 660
    invoke-virtual {v11, v1}, Lh0/N;->M(Z)V

    .line 661
    .line 662
    .line 663
    goto :goto_20

    .line 664
    :catchall_3
    move-exception v0

    .line 665
    goto :goto_1a

    .line 666
    :catchall_4
    move-exception v0

    .line 667
    move-wide/from16 v25, v3

    .line 668
    .line 669
    const/16 v23, 0x1

    .line 670
    .line 671
    goto :goto_1a

    .line 672
    :cond_1f
    move-wide/from16 v25, v3

    .line 673
    .line 674
    const/16 v23, 0x1

    .line 675
    .line 676
    invoke-virtual/range {p1 .. p1}, La0/U;->p()Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-nez v0, :cond_23

    .line 681
    .line 682
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 683
    .line 684
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 685
    .line 686
    :goto_1e
    if-eqz v0, :cond_21

    .line 687
    .line 688
    iget-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 689
    .line 690
    iget-object v1, v1, Lh0/W;->a:Lx0/H;

    .line 691
    .line 692
    invoke-virtual {v1, v10}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    if-eqz v1, :cond_20

    .line 697
    .line 698
    iget-object v1, v11, Lh0/N;->D:Lh0/X;

    .line 699
    .line 700
    iget-object v2, v0, Lh0/V;->g:Lh0/W;

    .line 701
    .line 702
    invoke-virtual {v1, v12, v2}, Lh0/X;->g(La0/U;Lh0/W;)Lh0/W;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    iput-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 707
    .line 708
    invoke-virtual {v0}, Lh0/V;->k()V

    .line 709
    .line 710
    .line 711
    :cond_20
    iget-object v0, v0, Lh0/V;->m:Lh0/V;

    .line 712
    .line 713
    goto :goto_1e

    .line 714
    :cond_21
    iget-object v0, v11, Lh0/N;->D:Lh0/X;

    .line 715
    .line 716
    iget-object v1, v0, Lh0/X;->i:Lh0/V;

    .line 717
    .line 718
    iget-object v0, v0, Lh0/X;->j:Lh0/V;

    .line 719
    .line 720
    if-eq v1, v0, :cond_22

    .line 721
    .line 722
    move/from16 v5, v23

    .line 723
    .line 724
    goto :goto_1f

    .line 725
    :cond_22
    const/4 v5, 0x0

    .line 726
    :goto_1f
    move-object/from16 v1, p0

    .line 727
    .line 728
    move-object v2, v10

    .line 729
    move-wide/from16 v3, v25

    .line 730
    .line 731
    invoke-virtual/range {v1 .. v6}, Lh0/N;->O(Lx0/H;JZZ)J

    .line 732
    .line 733
    .line 734
    move-result-wide v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 735
    move-wide/from16 v25, v0

    .line 736
    .line 737
    :cond_23
    :goto_20
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 738
    .line 739
    iget-object v4, v0, Lh0/i0;->a:La0/U;

    .line 740
    .line 741
    iget-object v5, v0, Lh0/i0;->b:Lx0/H;

    .line 742
    .line 743
    iget-boolean v0, v7, Lh0/L;->f:Z

    .line 744
    .line 745
    if-eqz v0, :cond_24

    .line 746
    .line 747
    move-wide/from16 v6, v25

    .line 748
    .line 749
    goto :goto_21

    .line 750
    :cond_24
    move-wide/from16 v6, v16

    .line 751
    .line 752
    :goto_21
    const/4 v0, 0x0

    .line 753
    move-object/from16 v1, p0

    .line 754
    .line 755
    move-object/from16 v2, p1

    .line 756
    .line 757
    move-object v3, v10

    .line 758
    move/from16 v19, v8

    .line 759
    .line 760
    move v8, v0

    .line 761
    invoke-virtual/range {v1 .. v8}, Lh0/N;->l0(La0/U;Lx0/H;La0/U;Lx0/H;JZ)V

    .line 762
    .line 763
    .line 764
    if-nez v15, :cond_25

    .line 765
    .line 766
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 767
    .line 768
    iget-wide v0, v0, Lh0/i0;->c:J

    .line 769
    .line 770
    cmp-long v0, v13, v0

    .line 771
    .line 772
    if-eqz v0, :cond_28

    .line 773
    .line 774
    :cond_25
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 775
    .line 776
    iget-object v1, v0, Lh0/i0;->b:Lx0/H;

    .line 777
    .line 778
    iget-object v1, v1, Lx0/H;->a:Ljava/lang/Object;

    .line 779
    .line 780
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 781
    .line 782
    if-eqz v15, :cond_26

    .line 783
    .line 784
    if-eqz p2, :cond_26

    .line 785
    .line 786
    invoke-virtual {v0}, La0/U;->p()Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-nez v2, :cond_26

    .line 791
    .line 792
    iget-object v2, v11, Lh0/N;->x:La0/S;

    .line 793
    .line 794
    invoke-virtual {v0, v1, v2}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    iget-boolean v0, v0, La0/S;->f:Z

    .line 799
    .line 800
    if-nez v0, :cond_26

    .line 801
    .line 802
    goto :goto_22

    .line 803
    :cond_26
    const/16 v23, 0x0

    .line 804
    .line 805
    :goto_22
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 806
    .line 807
    iget-wide v7, v0, Lh0/i0;->d:J

    .line 808
    .line 809
    invoke-virtual {v12, v1}, La0/U;->b(Ljava/lang/Object;)I

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    if-ne v0, v9, :cond_27

    .line 814
    .line 815
    move/from16 v18, v19

    .line 816
    .line 817
    :cond_27
    move-object/from16 v1, p0

    .line 818
    .line 819
    move-object v2, v10

    .line 820
    move-wide/from16 v3, v25

    .line 821
    .line 822
    move-wide v5, v13

    .line 823
    move/from16 v9, v23

    .line 824
    .line 825
    move/from16 v10, v18

    .line 826
    .line 827
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    iput-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 832
    .line 833
    :cond_28
    invoke-virtual/range {p0 .. p0}, Lh0/N;->G()V

    .line 834
    .line 835
    .line 836
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 837
    .line 838
    iget-object v0, v0, Lh0/i0;->a:La0/U;

    .line 839
    .line 840
    invoke-virtual {v11, v12, v0}, Lh0/N;->I(La0/U;La0/U;)V

    .line 841
    .line 842
    .line 843
    iget-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 844
    .line 845
    invoke-virtual {v0, v12}, Lh0/i0;->h(La0/U;)Lh0/i0;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iput-object v0, v11, Lh0/N;->L:Lh0/i0;

    .line 850
    .line 851
    invoke-virtual/range {p1 .. p1}, La0/U;->p()Z

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    if-nez v0, :cond_29

    .line 856
    .line 857
    const/4 v8, 0x0

    .line 858
    iput-object v8, v11, Lh0/N;->Z:Lh0/M;

    .line 859
    .line 860
    :cond_29
    const/4 v1, 0x0

    .line 861
    invoke-virtual {v11, v1}, Lh0/N;->m(Z)V

    .line 862
    .line 863
    .line 864
    iget-object v0, v11, Lh0/N;->t:Ld0/t;

    .line 865
    .line 866
    const/4 v6, 0x2

    .line 867
    invoke-virtual {v0, v6}, Ld0/t;->e(I)Z

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :goto_23
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 872
    .line 873
    iget-object v4, v1, Lh0/i0;->a:La0/U;

    .line 874
    .line 875
    iget-object v5, v1, Lh0/i0;->b:Lx0/H;

    .line 876
    .line 877
    iget-boolean v1, v7, Lh0/L;->f:Z

    .line 878
    .line 879
    if-eqz v1, :cond_2a

    .line 880
    .line 881
    move-wide/from16 v16, v25

    .line 882
    .line 883
    :cond_2a
    const/16 v20, 0x0

    .line 884
    .line 885
    move-object/from16 v1, p0

    .line 886
    .line 887
    move-object/from16 v2, p1

    .line 888
    .line 889
    move-object v3, v10

    .line 890
    move-wide/from16 v6, v16

    .line 891
    .line 892
    move/from16 v8, v20

    .line 893
    .line 894
    invoke-virtual/range {v1 .. v8}, Lh0/N;->l0(La0/U;Lx0/H;La0/U;Lx0/H;JZ)V

    .line 895
    .line 896
    .line 897
    if-nez v15, :cond_2b

    .line 898
    .line 899
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 900
    .line 901
    iget-wide v1, v1, Lh0/i0;->c:J

    .line 902
    .line 903
    cmp-long v1, v13, v1

    .line 904
    .line 905
    if-eqz v1, :cond_2e

    .line 906
    .line 907
    :cond_2b
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 908
    .line 909
    iget-object v2, v1, Lh0/i0;->b:Lx0/H;

    .line 910
    .line 911
    iget-object v2, v2, Lx0/H;->a:Ljava/lang/Object;

    .line 912
    .line 913
    iget-object v1, v1, Lh0/i0;->a:La0/U;

    .line 914
    .line 915
    if-eqz v15, :cond_2c

    .line 916
    .line 917
    if-eqz p2, :cond_2c

    .line 918
    .line 919
    invoke-virtual {v1}, La0/U;->p()Z

    .line 920
    .line 921
    .line 922
    move-result v3

    .line 923
    if-nez v3, :cond_2c

    .line 924
    .line 925
    iget-object v3, v11, Lh0/N;->x:La0/S;

    .line 926
    .line 927
    invoke-virtual {v1, v2, v3}, La0/U;->g(Ljava/lang/Object;La0/S;)La0/S;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    iget-boolean v1, v1, La0/S;->f:Z

    .line 932
    .line 933
    if-nez v1, :cond_2c

    .line 934
    .line 935
    goto :goto_24

    .line 936
    :cond_2c
    const/16 v23, 0x0

    .line 937
    .line 938
    :goto_24
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 939
    .line 940
    iget-wide v7, v1, Lh0/i0;->d:J

    .line 941
    .line 942
    invoke-virtual {v12, v2}, La0/U;->b(Ljava/lang/Object;)I

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    if-ne v1, v9, :cond_2d

    .line 947
    .line 948
    move/from16 v18, v19

    .line 949
    .line 950
    :cond_2d
    move-object/from16 v1, p0

    .line 951
    .line 952
    move-object v2, v10

    .line 953
    move-wide/from16 v3, v25

    .line 954
    .line 955
    move-wide v5, v13

    .line 956
    move/from16 v9, v23

    .line 957
    .line 958
    move/from16 v10, v18

    .line 959
    .line 960
    invoke-virtual/range {v1 .. v10}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 965
    .line 966
    :cond_2e
    invoke-virtual/range {p0 .. p0}, Lh0/N;->G()V

    .line 967
    .line 968
    .line 969
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 970
    .line 971
    iget-object v1, v1, Lh0/i0;->a:La0/U;

    .line 972
    .line 973
    invoke-virtual {v11, v12, v1}, Lh0/N;->I(La0/U;La0/U;)V

    .line 974
    .line 975
    .line 976
    iget-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 977
    .line 978
    invoke-virtual {v1, v12}, Lh0/i0;->h(La0/U;)Lh0/i0;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    iput-object v1, v11, Lh0/N;->L:Lh0/i0;

    .line 983
    .line 984
    invoke-virtual/range {p1 .. p1}, La0/U;->p()Z

    .line 985
    .line 986
    .line 987
    move-result v1

    .line 988
    if-nez v1, :cond_2f

    .line 989
    .line 990
    const/4 v1, 0x0

    .line 991
    iput-object v1, v11, Lh0/N;->Z:Lh0/M;

    .line 992
    .line 993
    :cond_2f
    const/4 v1, 0x0

    .line 994
    invoke-virtual {v11, v1}, Lh0/N;->m(Z)V

    .line 995
    .line 996
    .line 997
    iget-object v1, v11, Lh0/N;->t:Ld0/t;

    .line 998
    .line 999
    const/4 v2, 0x2

    .line 1000
    invoke-virtual {v1, v2}, Ld0/t;->e(I)Z

    .line 1001
    .line 1002
    .line 1003
    throw v0
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
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method

.method public final declared-synchronized n0(Lh0/p;J)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lh0/N;->B:Ld0/r;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-long/2addr v0, p2

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Lh0/p;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v3, p2, v3

    .line 28
    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    :try_start_1
    iget-object v3, p0, Lh0/N;->B:Ld0/r;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    const/4 p2, 0x1

    .line 43
    move v2, p2

    .line 44
    :goto_1
    :try_start_2
    iget-object p2, p0, Lh0/N;->B:Ld0/r;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    sub-long p2, v0, p2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_1
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p1
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

.method public final o(Lx0/F;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/X;->k:Lh0/V;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v4, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v4, p1, :cond_0

    .line 12
    .line 13
    move v4, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v2

    .line 16
    :goto_0
    iget-object v5, p0, Lh0/N;->z:Le3/e;

    .line 17
    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-boolean p1, v1, Lh0/V;->e:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5}, Le3/e;->d()La0/J;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget p1, p1, La0/J;->a:F

    .line 32
    .line 33
    iget-object v2, p0, Lh0/N;->L:Lh0/i0;

    .line 34
    .line 35
    iget-object v3, v2, Lh0/i0;->a:La0/U;

    .line 36
    .line 37
    iget-boolean v2, v2, Lh0/i0;->l:Z

    .line 38
    .line 39
    invoke-virtual {v1, p1, v3, v2}, Lh0/V;->f(FLa0/U;Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, v1, Lh0/V;->o:LA0/A;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lh0/N;->i0(LA0/A;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, Lh0/X;->i:Lh0/V;

    .line 48
    .line 49
    if-ne v1, p1, :cond_2

    .line 50
    .line 51
    iget-object p1, v1, Lh0/V;->g:Lh0/W;

    .line 52
    .line 53
    iget-wide v2, p1, Lh0/W;->b:J

    .line 54
    .line 55
    invoke-virtual {p0, v2, v3}, Lh0/N;->H(J)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lh0/N;->l:[Lh0/o0;

    .line 59
    .line 60
    array-length p1, p1

    .line 61
    new-array p1, p1, [Z

    .line 62
    .line 63
    iget-object v0, v0, Lh0/X;->j:Lh0/V;

    .line 64
    .line 65
    invoke-virtual {v0}, Lh0/V;->e()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-virtual {p0, p1, v2, v3}, Lh0/N;->f([ZJ)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 73
    .line 74
    iget-object v3, p1, Lh0/i0;->b:Lx0/H;

    .line 75
    .line 76
    iget-object v0, v1, Lh0/V;->g:Lh0/W;

    .line 77
    .line 78
    const/4 v11, 0x5

    .line 79
    iget-wide v6, p1, Lh0/i0;->c:J

    .line 80
    .line 81
    iget-wide v8, v0, Lh0/W;->b:J

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    move-object v2, p0

    .line 85
    move-wide v4, v8

    .line 86
    invoke-virtual/range {v2 .. v11}, Lh0/N;->q(Lx0/H;JJJZI)Lh0/i0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 91
    .line 92
    :cond_2
    invoke-virtual {p0}, Lh0/N;->u()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    :goto_1
    iget-object v1, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-ge v2, v1, :cond_5

    .line 103
    .line 104
    iget-object v1, v0, Lh0/X;->p:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lh0/V;

    .line 111
    .line 112
    iget-object v4, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 113
    .line 114
    if-ne v4, p1, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    const/4 v1, 0x0

    .line 121
    :goto_2
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget-boolean v2, v1, Lh0/V;->e:Z

    .line 124
    .line 125
    xor-int/2addr v2, v3

    .line 126
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Le3/e;->d()La0/J;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iget v2, v2, La0/J;->a:F

    .line 134
    .line 135
    iget-object v3, p0, Lh0/N;->L:Lh0/i0;

    .line 136
    .line 137
    iget-object v4, v3, Lh0/i0;->a:La0/U;

    .line 138
    .line 139
    iget-boolean v3, v3, Lh0/i0;->l:Z

    .line 140
    .line 141
    invoke-virtual {v1, v2, v4, v3}, Lh0/V;->f(FLa0/U;Z)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Lh0/X;->l:Lh0/V;

    .line 145
    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    iget-object v0, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 149
    .line 150
    if-ne v0, p1, :cond_6

    .line 151
    .line 152
    invoke-virtual {p0}, Lh0/N;->v()V

    .line 153
    .line 154
    .line 155
    :cond_6
    :goto_3
    return-void
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

.method public final p(La0/J;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lh0/N;->M:Lh0/K;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lh0/K;->c(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lh0/N;->L:Lh0/i0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lh0/i0;->f(La0/J;)Lh0/i0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lh0/N;->L:Lh0/i0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, La0/J;->a:F

    .line 20
    .line 21
    iget-object p4, p0, Lh0/N;->D:Lh0/X;

    .line 22
    .line 23
    iget-object p4, p4, Lh0/X;->i:Lh0/V;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, Lh0/V;->o:LA0/A;

    .line 29
    .line 30
    iget-object v1, v1, LA0/A;->c:[LA0/w;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    aget-object v3, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v3, p3}, LA0/w;->j(F)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object p4, p4, Lh0/V;->m:Lh0/V;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, Lh0/N;->l:[Lh0/o0;

    .line 49
    .line 50
    array-length p4, p3

    .line 51
    :goto_2
    if-ge v0, p4, :cond_6

    .line 52
    .line 53
    aget-object v1, p3, v0

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iget v2, p1, La0/J;->a:F

    .line 58
    .line 59
    invoke-interface {v1, p2, v2}, Lh0/o0;->setPlaybackSpeed(FF)V

    .line 60
    .line 61
    .line 62
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    return-void
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

.method public final q(Lx0/H;JJJZI)Lh0/i0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Lh0/N;->d0:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lh0/N;->L:Lh0/i0;

    .line 15
    .line 16
    iget-wide v8, v3, Lh0/i0;->s:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, Lh0/N;->L:Lh0/i0;

    .line 23
    .line 24
    iget-object v3, v3, Lh0/i0;->b:Lx0/H;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, Lh0/N;->d0:Z

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Lh0/N;->G()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lh0/N;->L:Lh0/i0;

    .line 42
    .line 43
    iget-object v8, v3, Lh0/i0;->h:Lx0/q0;

    .line 44
    .line 45
    iget-object v9, v3, Lh0/i0;->i:LA0/A;

    .line 46
    .line 47
    iget-object v10, v3, Lh0/i0;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, Lh0/N;->E:Lh0/g0;

    .line 50
    .line 51
    iget-boolean v11, v11, Lh0/g0;->k:Z

    .line 52
    .line 53
    if-eqz v11, :cond_10

    .line 54
    .line 55
    iget-object v3, v0, Lh0/N;->D:Lh0/X;

    .line 56
    .line 57
    iget-object v3, v3, Lh0/X;->i:Lh0/V;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Lx0/q0;->d:Lx0/q0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, Lh0/V;->n:Lx0/q0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, Lh0/N;->q:LA0/A;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, Lh0/V;->o:LA0/A;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, LA0/A;->c:[LA0/w;

    .line 74
    .line 75
    new-instance v11, Lm2/F;

    .line 76
    .line 77
    const/4 v12, 0x4

    .line 78
    invoke-direct {v11, v12}, Lm2/C;-><init>(I)V

    .line 79
    .line 80
    .line 81
    array-length v12, v10

    .line 82
    move v13, v4

    .line 83
    move v14, v13

    .line 84
    :goto_4
    if-ge v13, v12, :cond_6

    .line 85
    .line 86
    aget-object v15, v10, v13

    .line 87
    .line 88
    if-eqz v15, :cond_5

    .line 89
    .line 90
    invoke-interface {v15, v4}, LA0/w;->g(I)La0/p;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    iget-object v15, v15, La0/p;->l:La0/F;

    .line 95
    .line 96
    if-nez v15, :cond_4

    .line 97
    .line 98
    new-instance v15, La0/F;

    .line 99
    .line 100
    new-array v7, v4, [La0/E;

    .line 101
    .line 102
    invoke-direct {v15, v7}, La0/F;-><init>([La0/E;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v15}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_4
    invoke-virtual {v11, v15}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 v7, 0x1

    .line 113
    const/4 v14, 0x1

    .line 114
    goto :goto_6

    .line 115
    :cond_5
    :goto_5
    const/4 v7, 0x1

    .line 116
    :goto_6
    add-int/2addr v13, v7

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    if-eqz v14, :cond_7

    .line 119
    .line 120
    invoke-virtual {v11}, Lm2/F;->g()Lm2/b0;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    goto :goto_7

    .line 125
    :cond_7
    sget-object v7, Lm2/I;->m:Lm2/G;

    .line 126
    .line 127
    sget-object v7, Lm2/b0;->p:Lm2/b0;

    .line 128
    .line 129
    :goto_7
    if-eqz v3, :cond_8

    .line 130
    .line 131
    iget-object v10, v3, Lh0/V;->g:Lh0/W;

    .line 132
    .line 133
    iget-wide v11, v10, Lh0/W;->c:J

    .line 134
    .line 135
    cmp-long v11, v11, v5

    .line 136
    .line 137
    if-eqz v11, :cond_8

    .line 138
    .line 139
    invoke-virtual {v10, v5, v6}, Lh0/W;->a(J)Lh0/W;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    iput-object v10, v3, Lh0/V;->g:Lh0/W;

    .line 144
    .line 145
    :cond_8
    iget-object v3, v0, Lh0/N;->D:Lh0/X;

    .line 146
    .line 147
    iget-object v3, v3, Lh0/X;->i:Lh0/V;

    .line 148
    .line 149
    if-eqz v3, :cond_f

    .line 150
    .line 151
    iget-object v3, v3, Lh0/V;->o:LA0/A;

    .line 152
    .line 153
    move v10, v4

    .line 154
    move v11, v10

    .line 155
    :goto_8
    iget-object v12, v0, Lh0/N;->l:[Lh0/o0;

    .line 156
    .line 157
    array-length v13, v12

    .line 158
    if-ge v11, v13, :cond_c

    .line 159
    .line 160
    invoke-virtual {v3, v11}, LA0/A;->b(I)Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_a

    .line 165
    .line 166
    aget-object v12, v12, v11

    .line 167
    .line 168
    invoke-interface {v12}, Lh0/o0;->getTrackType()I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    const/4 v13, 0x1

    .line 173
    if-eq v12, v13, :cond_9

    .line 174
    .line 175
    move v3, v4

    .line 176
    goto :goto_a

    .line 177
    :cond_9
    iget-object v12, v3, LA0/A;->b:[Lh0/r0;

    .line 178
    .line 179
    aget-object v12, v12, v11

    .line 180
    .line 181
    iget v12, v12, Lh0/r0;->a:I

    .line 182
    .line 183
    if-eqz v12, :cond_b

    .line 184
    .line 185
    move v10, v13

    .line 186
    goto :goto_9

    .line 187
    :cond_a
    const/4 v13, 0x1

    .line 188
    :cond_b
    :goto_9
    add-int/2addr v11, v13

    .line 189
    goto :goto_8

    .line 190
    :cond_c
    const/4 v3, 0x1

    .line 191
    :goto_a
    if-eqz v10, :cond_d

    .line 192
    .line 193
    if-eqz v3, :cond_d

    .line 194
    .line 195
    const/4 v3, 0x1

    .line 196
    goto :goto_b

    .line 197
    :cond_d
    move v3, v4

    .line 198
    :goto_b
    iget-boolean v10, v0, Lh0/N;->X:Z

    .line 199
    .line 200
    if-ne v3, v10, :cond_e

    .line 201
    .line 202
    goto :goto_c

    .line 203
    :cond_e
    iput-boolean v3, v0, Lh0/N;->X:Z

    .line 204
    .line 205
    if-nez v3, :cond_f

    .line 206
    .line 207
    iget-object v3, v0, Lh0/N;->L:Lh0/i0;

    .line 208
    .line 209
    iget-boolean v3, v3, Lh0/i0;->p:Z

    .line 210
    .line 211
    if-eqz v3, :cond_f

    .line 212
    .line 213
    iget-object v3, v0, Lh0/N;->t:Ld0/t;

    .line 214
    .line 215
    const/4 v10, 0x2

    .line 216
    invoke-virtual {v3, v10}, Ld0/t;->e(I)Z

    .line 217
    .line 218
    .line 219
    :cond_f
    :goto_c
    move-object v13, v7

    .line 220
    move-object v11, v8

    .line 221
    move-object v12, v9

    .line 222
    goto :goto_d

    .line 223
    :cond_10
    iget-object v3, v3, Lh0/i0;->b:Lx0/H;

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Lx0/H;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-nez v3, :cond_11

    .line 230
    .line 231
    sget-object v3, Lx0/q0;->d:Lx0/q0;

    .line 232
    .line 233
    iget-object v7, v0, Lh0/N;->q:LA0/A;

    .line 234
    .line 235
    sget-object v8, Lm2/b0;->p:Lm2/b0;

    .line 236
    .line 237
    move-object v11, v3

    .line 238
    move-object v12, v7

    .line 239
    move-object v13, v8

    .line 240
    goto :goto_d

    .line 241
    :cond_11
    move-object v11, v8

    .line 242
    move-object v12, v9

    .line 243
    move-object v13, v10

    .line 244
    :goto_d
    if-eqz p8, :cond_14

    .line 245
    .line 246
    iget-object v3, v0, Lh0/N;->M:Lh0/K;

    .line 247
    .line 248
    iget-boolean v7, v3, Lh0/K;->c:Z

    .line 249
    .line 250
    if-eqz v7, :cond_13

    .line 251
    .line 252
    iget v7, v3, Lh0/K;->d:I

    .line 253
    .line 254
    const/4 v8, 0x5

    .line 255
    if-eq v7, v8, :cond_13

    .line 256
    .line 257
    if-ne v1, v8, :cond_12

    .line 258
    .line 259
    const/4 v4, 0x1

    .line 260
    :cond_12
    invoke-static {v4}, Ld0/m;->c(Z)V

    .line 261
    .line 262
    .line 263
    goto :goto_e

    .line 264
    :cond_13
    const/4 v4, 0x1

    .line 265
    iput-boolean v4, v3, Lh0/K;->b:Z

    .line 266
    .line 267
    iput-boolean v4, v3, Lh0/K;->c:Z

    .line 268
    .line 269
    iput v1, v3, Lh0/K;->d:I

    .line 270
    .line 271
    :cond_14
    :goto_e
    iget-object v1, v0, Lh0/N;->L:Lh0/i0;

    .line 272
    .line 273
    iget-wide v3, v1, Lh0/i0;->q:J

    .line 274
    .line 275
    invoke-virtual {v0, v3, v4}, Lh0/N;->j(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v9

    .line 279
    move-object/from16 v2, p1

    .line 280
    .line 281
    move-wide/from16 v3, p2

    .line 282
    .line 283
    move-wide/from16 v5, p4

    .line 284
    .line 285
    move-wide/from16 v7, p6

    .line 286
    .line 287
    invoke-virtual/range {v1 .. v13}, Lh0/i0;->c(Lx0/H;JJJJLx0/q0;LA0/A;Ljava/util/List;)Lh0/i0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    return-object v1
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
.end method

.method public final t()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 4
    .line 5
    iget-object v1, v0, Lh0/V;->g:Lh0/W;

    .line 6
    .line 7
    iget-wide v1, v1, Lh0/W;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Lh0/V;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lh0/N;->L:Lh0/i0;

    .line 23
    .line 24
    iget-wide v3, v0, Lh0/i0;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lh0/N;->c0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    return v0
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

.method public final u()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lh0/N;->D:Lh0/X;

    .line 4
    .line 5
    iget-object v1, v1, Lh0/X;->k:Lh0/V;

    .line 6
    .line 7
    invoke-static {v1}, Lh0/N;->r(Lh0/V;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v9, v6

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, Lh0/N;->D:Lh0/X;

    .line 25
    .line 26
    iget-object v1, v1, Lh0/X;->k:Lh0/V;

    .line 27
    .line 28
    iget-boolean v7, v1, Lh0/V;->e:Z

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v7, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v7}, Lx0/h0;->r()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_0
    invoke-virtual {v0, v7, v8}, Lh0/N;->j(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    iget-object v9, v0, Lh0/N;->D:Lh0/X;

    .line 45
    .line 46
    iget-object v9, v9, Lh0/X;->i:Lh0/V;

    .line 47
    .line 48
    iget-object v9, v0, Lh0/N;->L:Lh0/i0;

    .line 49
    .line 50
    iget-object v9, v9, Lh0/i0;->a:La0/U;

    .line 51
    .line 52
    iget-object v1, v1, Lh0/V;->g:Lh0/W;

    .line 53
    .line 54
    iget-object v1, v1, Lh0/W;->a:Lx0/H;

    .line 55
    .line 56
    invoke-virtual {v0, v9, v1}, Lh0/N;->d0(La0/U;Lx0/H;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v1, v0, Lh0/N;->F:Lh0/O;

    .line 63
    .line 64
    check-cast v1, Lh0/k;

    .line 65
    .line 66
    iget-wide v9, v1, Lh0/k;->m:J

    .line 67
    .line 68
    move-wide v15, v9

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-wide v15, v2

    .line 71
    :goto_1
    new-instance v1, Lh0/P;

    .line 72
    .line 73
    iget-object v10, v0, Lh0/N;->H:Li0/j;

    .line 74
    .line 75
    iget-object v9, v0, Lh0/N;->L:Lh0/i0;

    .line 76
    .line 77
    iget-object v9, v9, Lh0/i0;->a:La0/U;

    .line 78
    .line 79
    iget-object v9, v0, Lh0/N;->z:Le3/e;

    .line 80
    .line 81
    invoke-virtual {v9}, Le3/e;->d()La0/J;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iget v13, v9, La0/J;->a:F

    .line 86
    .line 87
    iget-object v9, v0, Lh0/N;->L:Lh0/i0;

    .line 88
    .line 89
    iget-boolean v9, v9, Lh0/i0;->l:Z

    .line 90
    .line 91
    iget-boolean v14, v0, Lh0/N;->Q:Z

    .line 92
    .line 93
    move-object v9, v1

    .line 94
    move-wide v11, v7

    .line 95
    invoke-direct/range {v9 .. v16}, Lh0/P;-><init>(Li0/j;JFZJ)V

    .line 96
    .line 97
    .line 98
    iget-object v9, v0, Lh0/N;->r:Lh0/Q;

    .line 99
    .line 100
    check-cast v9, Lh0/m;

    .line 101
    .line 102
    invoke-virtual {v9, v1}, Lh0/m;->c(Lh0/P;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    iget-object v10, v0, Lh0/N;->D:Lh0/X;

    .line 107
    .line 108
    iget-object v10, v10, Lh0/X;->i:Lh0/V;

    .line 109
    .line 110
    if-nez v9, :cond_4

    .line 111
    .line 112
    iget-boolean v11, v10, Lh0/V;->e:Z

    .line 113
    .line 114
    if-eqz v11, :cond_4

    .line 115
    .line 116
    const-wide/32 v11, 0x7a120

    .line 117
    .line 118
    .line 119
    cmp-long v7, v7, v11

    .line 120
    .line 121
    if-gez v7, :cond_4

    .line 122
    .line 123
    iget-wide v7, v0, Lh0/N;->y:J

    .line 124
    .line 125
    cmp-long v7, v7, v4

    .line 126
    .line 127
    if-gtz v7, :cond_3

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    iget-object v7, v10, Lh0/V;->a:Ljava/lang/Object;

    .line 131
    .line 132
    iget-object v8, v0, Lh0/N;->L:Lh0/i0;

    .line 133
    .line 134
    iget-wide v8, v8, Lh0/i0;->s:J

    .line 135
    .line 136
    invoke-interface {v7, v8, v9}, Lx0/F;->p(J)V

    .line 137
    .line 138
    .line 139
    iget-object v7, v0, Lh0/N;->r:Lh0/Q;

    .line 140
    .line 141
    check-cast v7, Lh0/m;

    .line 142
    .line 143
    invoke-virtual {v7, v1}, Lh0/m;->c(Lh0/P;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    :cond_4
    :goto_2
    iput-boolean v9, v0, Lh0/N;->S:Z

    .line 148
    .line 149
    if-eqz v9, :cond_a

    .line 150
    .line 151
    iget-object v1, v0, Lh0/N;->D:Lh0/X;

    .line 152
    .line 153
    iget-object v1, v1, Lh0/X;->k:Lh0/V;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v7, Lh0/S;

    .line 159
    .line 160
    invoke-direct {v7}, Lh0/S;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-wide v8, v0, Lh0/N;->a0:J

    .line 164
    .line 165
    iget-wide v10, v1, Lh0/V;->p:J

    .line 166
    .line 167
    sub-long/2addr v8, v10

    .line 168
    iput-wide v8, v7, Lh0/S;->a:J

    .line 169
    .line 170
    iget-object v8, v0, Lh0/N;->z:Le3/e;

    .line 171
    .line 172
    invoke-virtual {v8}, Le3/e;->d()La0/J;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iget v8, v8, La0/J;->a:F

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    cmpl-float v9, v8, v9

    .line 180
    .line 181
    const/4 v10, 0x1

    .line 182
    if-gtz v9, :cond_6

    .line 183
    .line 184
    const v9, -0x800001

    .line 185
    .line 186
    .line 187
    cmpl-float v9, v8, v9

    .line 188
    .line 189
    if-nez v9, :cond_5

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_5
    move v9, v6

    .line 193
    goto :goto_4

    .line 194
    :cond_6
    :goto_3
    move v9, v10

    .line 195
    :goto_4
    invoke-static {v9}, Ld0/m;->c(Z)V

    .line 196
    .line 197
    .line 198
    iput v8, v7, Lh0/S;->b:F

    .line 199
    .line 200
    iget-wide v8, v0, Lh0/N;->R:J

    .line 201
    .line 202
    cmp-long v4, v8, v4

    .line 203
    .line 204
    if-gez v4, :cond_8

    .line 205
    .line 206
    cmp-long v2, v8, v2

    .line 207
    .line 208
    if-nez v2, :cond_7

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_7
    move v2, v6

    .line 212
    goto :goto_6

    .line 213
    :cond_8
    :goto_5
    move v2, v10

    .line 214
    :goto_6
    invoke-static {v2}, Ld0/m;->c(Z)V

    .line 215
    .line 216
    .line 217
    iput-wide v8, v7, Lh0/S;->c:J

    .line 218
    .line 219
    new-instance v2, Lh0/T;

    .line 220
    .line 221
    invoke-direct {v2, v7}, Lh0/T;-><init>(Lh0/S;)V

    .line 222
    .line 223
    .line 224
    iget-object v3, v1, Lh0/V;->m:Lh0/V;

    .line 225
    .line 226
    if-nez v3, :cond_9

    .line 227
    .line 228
    move v6, v10

    .line 229
    :cond_9
    invoke-static {v6}, Ld0/m;->h(Z)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v1, Lh0/V;->a:Ljava/lang/Object;

    .line 233
    .line 234
    invoke-interface {v1, v2}, Lx0/h0;->v(Lh0/T;)Z

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-virtual/range {p0 .. p0}, Lh0/N;->h0()V

    .line 238
    .line 239
    .line 240
    return-void
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

.method public final v()V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh0/X;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lh0/X;->l:Lh0/V;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    iget-boolean v1, v0, Lh0/V;->d:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, v0, Lh0/V;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_a

    .line 17
    .line 18
    :cond_0
    iget-object v1, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v1}, Lx0/h0;->c()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_a

    .line 25
    .line 26
    iget-object v2, p0, Lh0/N;->L:Lh0/i0;

    .line 27
    .line 28
    iget-object v2, v2, Lh0/i0;->a:La0/U;

    .line 29
    .line 30
    iget-boolean v2, v0, Lh0/V;->e:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lx0/h0;->h()J

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, Lh0/N;->r:Lh0/Q;

    .line 38
    .line 39
    check-cast v2, Lh0/m;

    .line 40
    .line 41
    iget-object v2, v2, Lh0/m;->i:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lh0/l;

    .line 62
    .line 63
    iget-boolean v3, v3, Lh0/l;->a:Z

    .line 64
    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_3
    iget-boolean v2, v0, Lh0/V;->d:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    iget-object v2, v0, Lh0/V;->g:Lh0/W;

    .line 75
    .line 76
    iput-boolean v3, v0, Lh0/V;->d:Z

    .line 77
    .line 78
    iget-wide v2, v2, Lh0/W;->b:J

    .line 79
    .line 80
    invoke-interface {v1, p0, v2, v3}, Lx0/F;->t(Lx0/E;J)V

    .line 81
    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_4
    new-instance v2, Lh0/S;

    .line 85
    .line 86
    invoke-direct {v2}, Lh0/S;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-wide v4, p0, Lh0/N;->a0:J

    .line 90
    .line 91
    iget-wide v6, v0, Lh0/V;->p:J

    .line 92
    .line 93
    sub-long/2addr v4, v6

    .line 94
    iput-wide v4, v2, Lh0/S;->a:J

    .line 95
    .line 96
    iget-object v4, p0, Lh0/N;->z:Le3/e;

    .line 97
    .line 98
    invoke-virtual {v4}, Le3/e;->d()La0/J;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iget v4, v4, La0/J;->a:F

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    cmpl-float v5, v4, v5

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    if-gtz v5, :cond_6

    .line 109
    .line 110
    const v5, -0x800001

    .line 111
    .line 112
    .line 113
    cmpl-float v5, v4, v5

    .line 114
    .line 115
    if-nez v5, :cond_5

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    move v5, v6

    .line 119
    goto :goto_1

    .line 120
    :cond_6
    :goto_0
    move v5, v3

    .line 121
    :goto_1
    invoke-static {v5}, Ld0/m;->c(Z)V

    .line 122
    .line 123
    .line 124
    iput v4, v2, Lh0/S;->b:F

    .line 125
    .line 126
    iget-wide v4, p0, Lh0/N;->R:J

    .line 127
    .line 128
    const-wide/16 v7, 0x0

    .line 129
    .line 130
    cmp-long v7, v4, v7

    .line 131
    .line 132
    if-gez v7, :cond_8

    .line 133
    .line 134
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    cmp-long v7, v4, v7

    .line 140
    .line 141
    if-nez v7, :cond_7

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    move v7, v6

    .line 145
    goto :goto_3

    .line 146
    :cond_8
    :goto_2
    move v7, v3

    .line 147
    :goto_3
    invoke-static {v7}, Ld0/m;->c(Z)V

    .line 148
    .line 149
    .line 150
    iput-wide v4, v2, Lh0/S;->c:J

    .line 151
    .line 152
    new-instance v4, Lh0/T;

    .line 153
    .line 154
    invoke-direct {v4, v2}, Lh0/T;-><init>(Lh0/S;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, Lh0/V;->m:Lh0/V;

    .line 158
    .line 159
    if-nez v0, :cond_9

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    move v3, v6

    .line 163
    :goto_4
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v4}, Lx0/h0;->v(Lh0/T;)Z

    .line 167
    .line 168
    .line 169
    :cond_a
    :goto_5
    return-void
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

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 2
    .line 3
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 4
    .line 5
    iget-boolean v2, v0, Lh0/K;->b:Z

    .line 6
    .line 7
    iget-object v3, v0, Lh0/K;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lh0/i0;

    .line 10
    .line 11
    if-eq v3, v1, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    or-int/2addr v2, v3

    .line 17
    iput-boolean v2, v0, Lh0/K;->b:Z

    .line 18
    .line 19
    iput-object v1, v0, Lh0/K;->e:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lh0/N;->C:Lh0/A;

    .line 24
    .line 25
    iget-object v1, v1, Lh0/A;->l:Lh0/G;

    .line 26
    .line 27
    iget-object v2, v1, Lh0/G;->i:Ld0/t;

    .line 28
    .line 29
    new-instance v3, LD0/y;

    .line 30
    .line 31
    const/16 v4, 0xe

    .line 32
    .line 33
    invoke-direct {v3, v1, v4, v0}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ld0/t;->c(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    new-instance v0, Lh0/K;

    .line 40
    .line 41
    iget-object v1, p0, Lh0/N;->L:Lh0/i0;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lh0/K;-><init>(Lh0/i0;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lh0/N;->M:Lh0/K;

    .line 47
    .line 48
    :cond_1
    return-void
    .line 49
    .line 50
    .line 51
.end method

.method public final x(I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lh0/N;->l:[Lh0/o0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0}, Lh0/o0;->maybeThrowStreamError()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_2

    .line 9
    :catch_0
    move-exception v1

    .line 10
    goto :goto_0

    .line 11
    :catch_1
    move-exception v1

    .line 12
    :goto_0
    invoke-interface {v0}, Lh0/o0;->getTrackType()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    throw v1

    .line 24
    :cond_1
    :goto_1
    iget-object v0, p0, Lh0/N;->D:Lh0/X;

    .line 25
    .line 26
    iget-object v0, v0, Lh0/X;->i:Lh0/V;

    .line 27
    .line 28
    iget-object v0, v0, Lh0/V;->o:LA0/A;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "Disabling track due to error: "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v0, LA0/A;->c:[LA0/w;

    .line 38
    .line 39
    aget-object v3, v3, p1

    .line 40
    .line 41
    invoke-interface {v3}, LA0/w;->d()La0/p;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, La0/p;->d(La0/p;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "ExoPlayerImplInternal"

    .line 57
    .line 58
    invoke-static {v3, v2, v1}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    new-instance v5, LA0/A;

    .line 62
    .line 63
    iget-object v1, v0, LA0/A;->b:[Lh0/r0;

    .line 64
    .line 65
    invoke-virtual {v1}, [Lh0/r0;->clone()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, [Lh0/r0;

    .line 70
    .line 71
    iget-object v2, v0, LA0/A;->c:[LA0/w;

    .line 72
    .line 73
    invoke-virtual {v2}, [LA0/w;->clone()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, [LA0/w;

    .line 78
    .line 79
    iget-object v3, v0, LA0/A;->d:La0/b0;

    .line 80
    .line 81
    iget-object v0, v0, LA0/A;->e:LA0/y;

    .line 82
    .line 83
    invoke-direct {v5, v1, v2, v3, v0}, LA0/A;-><init>([Lh0/r0;[LA0/w;La0/b0;LA0/y;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v5, LA0/A;->b:[Lh0/r0;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    aput-object v1, v0, p1

    .line 90
    .line 91
    iget-object v0, v5, LA0/A;->c:[LA0/w;

    .line 92
    .line 93
    aput-object v1, v0, p1

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lh0/N;->c(I)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lh0/N;->D:Lh0/X;

    .line 99
    .line 100
    iget-object v4, p1, Lh0/X;->i:Lh0/V;

    .line 101
    .line 102
    iget-object p1, p0, Lh0/N;->L:Lh0/i0;

    .line 103
    .line 104
    iget-wide v6, p1, Lh0/i0;->s:J

    .line 105
    .line 106
    iget-object p1, v4, Lh0/V;->j:[Lh0/q0;

    .line 107
    .line 108
    array-length p1, p1

    .line 109
    new-array v9, p1, [Z

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    invoke-virtual/range {v4 .. v9}, Lh0/V;->a(LA0/A;JZ[Z)J

    .line 113
    .line 114
    .line 115
    :goto_2
    return-void
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

.method public final y(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->o:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, Lh0/e;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lh0/e;-><init>(Lh0/N;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lh0/N;->J:Ld0/t;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ld0/t;->c(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/N;->E:Lh0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh0/g0;->b()La0/U;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lh0/N;->n(La0/U;Z)V

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
