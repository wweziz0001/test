.class public abstract Lq0/r;
.super Lh0/h;
.source "SourceFile"


# static fields
.field public static final M0:[B


# instance fields
.field public A0:Z

.field public B0:J

.field public final C:Lq0/k;

.field public C0:J

.field public final D:Lq0/j;

.field public D0:Z

.field public final E:F

.field public E0:Z

.field public final F:Lg0/e;

.field public F0:Z

.field public final G:Lg0/e;

.field public G0:Z

.field public final H:Lg0/e;

.field public H0:Lh0/o;

.field public final I:Lq0/h;

.field public I0:Lh0/i;

.field public final J:Landroid/media/MediaCodec$BufferInfo;

.field public J0:Lq0/q;

.field public final K:Ljava/util/ArrayDeque;

.field public K0:J

.field public final L:Lj0/y;

.field public L0:Z

.field public M:La0/p;

.field public N:La0/p;

.field public O:Landroidx/lifecycle/E;

.field public P:Landroidx/lifecycle/E;

.field public Q:Lh0/H;

.field public R:Landroid/media/MediaCrypto;

.field public final S:J

.field public T:F

.field public U:F

.field public V:Lq0/l;

.field public W:La0/p;

.field public X:Landroid/media/MediaFormat;

.field public Y:Z

.field public Z:F

.field public a0:Ljava/util/ArrayDeque;

.field public b0:Lq0/p;

.field public c0:Lq0/o;

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:J

.field public l0:J

.field public m0:I

.field public n0:I

.field public o0:Ljava/nio/ByteBuffer;

.field public p0:Z

.field public q0:Z

.field public r0:Z

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:I

.field public w0:I

.field public x0:I

.field public y0:Z

.field public z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lq0/r;->M0:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
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

.method public constructor <init>(ILq0/k;F)V
    .locals 3

    .line 1
    sget-object v0, Lq0/j;->m:Lq0/j;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lh0/h;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lq0/r;->C:Lq0/k;

    .line 7
    .line 8
    iput-object v0, p0, Lq0/r;->D:Lq0/j;

    .line 9
    .line 10
    iput p3, p0, Lq0/r;->E:F

    .line 11
    .line 12
    new-instance p1, Lg0/e;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, Lg0/e;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lq0/r;->F:Lg0/e;

    .line 19
    .line 20
    new-instance p1, Lg0/e;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Lg0/e;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lq0/r;->G:Lg0/e;

    .line 26
    .line 27
    new-instance p1, Lg0/e;

    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    invoke-direct {p1, p3}, Lg0/e;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lq0/r;->H:Lg0/e;

    .line 34
    .line 35
    new-instance p1, Lq0/h;

    .line 36
    .line 37
    invoke-direct {p1, p3}, Lg0/e;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 v0, 0x20

    .line 41
    .line 42
    iput v0, p1, Lq0/h;->w:I

    .line 43
    .line 44
    iput-object p1, p0, Lq0/r;->I:Lq0/h;

    .line 45
    .line 46
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lq0/r;->J:Landroid/media/MediaCodec$BufferInfo;

    .line 52
    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    iput v0, p0, Lq0/r;->T:F

    .line 56
    .line 57
    iput v0, p0, Lq0/r;->U:F

    .line 58
    .line 59
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    iput-wide v0, p0, Lq0/r;->S:J

    .line 65
    .line 66
    new-instance v2, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 72
    .line 73
    sget-object v2, Lq0/q;->e:Lq0/q;

    .line 74
    .line 75
    iput-object v2, p0, Lq0/r;->J0:Lq0/q;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lg0/e;->j(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    new-instance p1, Lj0/y;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    sget-object v2, Lb0/d;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iput-object v2, p1, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    iput p2, p1, Lj0/y;->c:I

    .line 99
    .line 100
    iput p3, p1, Lj0/y;->b:I

    .line 101
    .line 102
    iput-object p1, p0, Lq0/r;->L:Lj0/y;

    .line 103
    .line 104
    const/high16 p1, -0x40800000    # -1.0f

    .line 105
    .line 106
    iput p1, p0, Lq0/r;->Z:F

    .line 107
    .line 108
    iput p2, p0, Lq0/r;->d0:I

    .line 109
    .line 110
    iput p2, p0, Lq0/r;->v0:I

    .line 111
    .line 112
    const/4 p1, -0x1

    .line 113
    iput p1, p0, Lq0/r;->m0:I

    .line 114
    .line 115
    iput p1, p0, Lq0/r;->n0:I

    .line 116
    .line 117
    iput-wide v0, p0, Lq0/r;->l0:J

    .line 118
    .line 119
    iput-wide v0, p0, Lq0/r;->B0:J

    .line 120
    .line 121
    iput-wide v0, p0, Lq0/r;->C0:J

    .line 122
    .line 123
    iput-wide v0, p0, Lq0/r;->K0:J

    .line 124
    .line 125
    iput-wide v0, p0, Lq0/r;->k0:J

    .line 126
    .line 127
    iput p2, p0, Lq0/r;->w0:I

    .line 128
    .line 129
    iput p2, p0, Lq0/r;->x0:I

    .line 130
    .line 131
    new-instance p1, Lh0/i;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lq0/r;->I0:Lh0/i;

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
.end method


# virtual methods
.method public final A()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lq0/r;->x0:I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    iget-boolean v2, p0, Lq0/r;->e0:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Lq0/r;->A0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    :cond_1
    iget-boolean v2, p0, Lq0/r;->f0:Z

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-boolean v2, p0, Lq0/r;->z0:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v2, 0x2

    .line 31
    if-ne v0, v2, :cond_4

    .line 32
    .line 33
    sget v0, Ld0/w;->a:I

    .line 34
    .line 35
    const/16 v2, 0x17

    .line 36
    .line 37
    if-lt v0, v2, :cond_3

    .line 38
    .line 39
    move v4, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_0
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 43
    .line 44
    .line 45
    if-lt v0, v2, :cond_4

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p0}, Lq0/r;->k0()V
    :try_end_0
    .catch Lh0/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    const-string v1, "MediaCodecRenderer"

    .line 53
    .line 54
    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 55
    .line 56
    invoke-static {v1, v2, v0}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 60
    .line 61
    .line 62
    return v3

    .line 63
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lq0/r;->z()V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 68
    .line 69
    .line 70
    return v3
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

.method public final B(Z)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/r;->M:La0/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq0/r;->D:Lq0/j;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0, p1}, Lq0/r;->F(Lq0/j;La0/p;Z)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0, p1}, Lq0/r;->F(Lq0/j;La0/p;Z)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "Drm session requires secure decoder for "

    .line 34
    .line 35
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, La0/p;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "."

    .line 52
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
    const-string v0, "MediaCodecRenderer"

    .line 61
    .line 62
    invoke-static {v0, p1}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-object v2
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

.method public C(Lg0/e;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public D()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public abstract E(F[La0/p;)F
.end method

.method public abstract F(Lq0/j;La0/p;Z)Ljava/util/ArrayList;
.end method

.method public abstract G(Lq0/o;La0/p;Landroid/media/MediaCrypto;F)Ly2/n;
.end method

.method public abstract H(Lg0/e;)V
.end method

.method public final I(Lq0/o;Landroid/media/MediaCrypto;)V
    .locals 12

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iget-object v1, p0, Lq0/r;->M:La0/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v7, p1, Lq0/o;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget v2, Ld0/w;->a:I

    .line 11
    .line 12
    const/high16 v3, -0x40800000    # -1.0f

    .line 13
    .line 14
    const/16 v4, 0x17

    .line 15
    .line 16
    if-ge v2, v4, :cond_0

    .line 17
    .line 18
    move v5, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v5, p0, Lq0/r;->U:F

    .line 21
    .line 22
    iget-object v6, p0, Lh0/h;->u:[La0/p;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v5, v6}, Lq0/r;->E(F[La0/p;)F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    :goto_0
    iget v6, p0, Lq0/r;->E:F

    .line 32
    .line 33
    cmpg-float v6, v5, v6

    .line 34
    .line 35
    if-gtz v6, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v3, v5

    .line 39
    :goto_1
    invoke-virtual {p0, v1}, Lq0/r;->V(La0/p;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lh0/h;->r:Ld0/r;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    invoke-virtual {p0, p1, v1, p2, v3}, Lq0/r;->G(Lq0/o;La0/p;Landroid/media/MediaCrypto;F)Ly2/n;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const/16 v8, 0x1f

    .line 56
    .line 57
    if-lt v2, v8, :cond_2

    .line 58
    .line 59
    iget-object v8, p0, Lh0/h;->q:Li0/j;

    .line 60
    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v8, v8, Li0/j;->b:Li0/i;

    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v8, v8, Li0/i;->a:Landroid/media/metrics/LogSessionId;

    .line 70
    .line 71
    invoke-static {}, LS2/c;->d()Landroid/media/metrics/LogSessionId;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-static {v8, v9}, Li0/g;->u(Landroid/media/metrics/LogSessionId;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_2

    .line 80
    .line 81
    iget-object v9, p2, Ly2/n;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Landroid/media/MediaFormat;

    .line 84
    .line 85
    const-string v10, "log-session-id"

    .line 86
    .line 87
    invoke-static {v8}, Li0/g;->j(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lq0/r;->C:Lq0/k;

    .line 110
    .line 111
    invoke-interface {v0, p2}, Lq0/k;->i(Ly2/n;)Lq0/l;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iput-object p2, p0, Lq0/r;->V:Lq0/l;

    .line 116
    .line 117
    new-instance v0, Lm3/i;

    .line 118
    .line 119
    const/16 v8, 0x11

    .line 120
    .line 121
    invoke-direct {v0, p0, v8}, Lm3/i;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2, v0}, Lq0/l;->f(Lm3/i;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    .line 127
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Lh0/h;->r:Ld0/r;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    invoke-virtual {p1, v1}, Lq0/o;->d(La0/p;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_3

    .line 144
    .line 145
    invoke-static {v1}, La0/p;->d(La0/p;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v10, "Format exceeds selected codec\'s capabilities ["

    .line 154
    .line 155
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p2, ", "

    .line 162
    .line 163
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p2, "]"

    .line 170
    .line 171
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const-string v0, "MediaCodecRenderer"

    .line 179
    .line 180
    invoke-static {v0, p2}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    iput-object p1, p0, Lq0/r;->c0:Lq0/o;

    .line 184
    .line 185
    iput v3, p0, Lq0/r;->Z:F

    .line 186
    .line 187
    iput-object v1, p0, Lq0/r;->W:La0/p;

    .line 188
    .line 189
    const/4 p2, 0x2

    .line 190
    const/16 v0, 0x19

    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    const/4 v3, 0x1

    .line 194
    if-gt v2, v0, :cond_5

    .line 195
    .line 196
    const-string v10, "OMX.Exynos.avc.dec.secure"

    .line 197
    .line 198
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_5

    .line 203
    .line 204
    sget-object v10, Ld0/w;->d:Ljava/lang/String;

    .line 205
    .line 206
    const-string v11, "SM-T585"

    .line 207
    .line 208
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-nez v11, :cond_4

    .line 213
    .line 214
    const-string v11, "SM-A510"

    .line 215
    .line 216
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    if-nez v11, :cond_4

    .line 221
    .line 222
    const-string v11, "SM-A520"

    .line 223
    .line 224
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-nez v11, :cond_4

    .line 229
    .line 230
    const-string v11, "SM-J700"

    .line 231
    .line 232
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_5

    .line 237
    .line 238
    :cond_4
    move v10, p2

    .line 239
    goto :goto_2

    .line 240
    :cond_5
    const/16 v10, 0x18

    .line 241
    .line 242
    if-ge v2, v10, :cond_8

    .line 243
    .line 244
    const-string v10, "OMX.Nvidia.h264.decode"

    .line 245
    .line 246
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-nez v10, :cond_6

    .line 251
    .line 252
    const-string v10, "OMX.Nvidia.h264.decode.secure"

    .line 253
    .line 254
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-eqz v10, :cond_8

    .line 259
    .line 260
    :cond_6
    sget-object v10, Ld0/w;->b:Ljava/lang/String;

    .line 261
    .line 262
    const-string v11, "flounder"

    .line 263
    .line 264
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    if-nez v11, :cond_7

    .line 269
    .line 270
    const-string v11, "flounder_lte"

    .line 271
    .line 272
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    if-nez v11, :cond_7

    .line 277
    .line 278
    const-string v11, "grouper"

    .line 279
    .line 280
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-nez v11, :cond_7

    .line 285
    .line 286
    const-string v11, "tilapia"

    .line 287
    .line 288
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-eqz v10, :cond_8

    .line 293
    .line 294
    :cond_7
    move v10, v3

    .line 295
    goto :goto_2

    .line 296
    :cond_8
    move v10, v1

    .line 297
    :goto_2
    iput v10, p0, Lq0/r;->d0:I

    .line 298
    .line 299
    const/16 v10, 0x1d

    .line 300
    .line 301
    if-ne v2, v10, :cond_9

    .line 302
    .line 303
    const-string v11, "c2.android.aac.decoder"

    .line 304
    .line 305
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-eqz v11, :cond_9

    .line 310
    .line 311
    move v11, v3

    .line 312
    goto :goto_3

    .line 313
    :cond_9
    move v11, v1

    .line 314
    :goto_3
    iput-boolean v11, p0, Lq0/r;->e0:Z

    .line 315
    .line 316
    if-gt v2, v4, :cond_a

    .line 317
    .line 318
    const-string v4, "OMX.google.vorbis.decoder"

    .line 319
    .line 320
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-eqz v4, :cond_a

    .line 325
    .line 326
    move v4, v3

    .line 327
    goto :goto_4

    .line 328
    :cond_a
    move v4, v1

    .line 329
    :goto_4
    iput-boolean v4, p0, Lq0/r;->f0:Z

    .line 330
    .line 331
    const/16 v4, 0x15

    .line 332
    .line 333
    if-ne v2, v4, :cond_b

    .line 334
    .line 335
    const-string v4, "OMX.google.aac.decoder"

    .line 336
    .line 337
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    if-eqz v4, :cond_b

    .line 342
    .line 343
    move v4, v3

    .line 344
    goto :goto_5

    .line 345
    :cond_b
    move v4, v1

    .line 346
    :goto_5
    iput-boolean v4, p0, Lq0/r;->g0:Z

    .line 347
    .line 348
    iget-object v4, p1, Lq0/o;->a:Ljava/lang/String;

    .line 349
    .line 350
    if-gt v2, v0, :cond_c

    .line 351
    .line 352
    const-string v0, "OMX.rk.video_decoder.avc"

    .line 353
    .line 354
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-nez v0, :cond_f

    .line 359
    .line 360
    :cond_c
    if-gt v2, v10, :cond_d

    .line 361
    .line 362
    const-string v0, "OMX.broadcom.video_decoder.tunnel"

    .line 363
    .line 364
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_f

    .line 369
    .line 370
    const-string v0, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 371
    .line 372
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_f

    .line 377
    .line 378
    const-string v0, "OMX.bcm.vdec.avc.tunnel"

    .line 379
    .line 380
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_f

    .line 385
    .line 386
    const-string v0, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 387
    .line 388
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-nez v0, :cond_f

    .line 393
    .line 394
    const-string v0, "OMX.bcm.vdec.hevc.tunnel"

    .line 395
    .line 396
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_f

    .line 401
    .line 402
    const-string v0, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 403
    .line 404
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_f

    .line 409
    .line 410
    :cond_d
    const-string v0, "Amazon"

    .line 411
    .line 412
    sget-object v2, Ld0/w;->c:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_e

    .line 419
    .line 420
    const-string v0, "AFTS"

    .line 421
    .line 422
    sget-object v2, Ld0/w;->d:Ljava/lang/String;

    .line 423
    .line 424
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-eqz v0, :cond_e

    .line 429
    .line 430
    iget-boolean p1, p1, Lq0/o;->f:Z

    .line 431
    .line 432
    if-eqz p1, :cond_e

    .line 433
    .line 434
    goto :goto_6

    .line 435
    :cond_e
    invoke-virtual {p0}, Lq0/r;->D()Z

    .line 436
    .line 437
    .line 438
    move-result p1

    .line 439
    if-eqz p1, :cond_10

    .line 440
    .line 441
    :cond_f
    :goto_6
    move v1, v3

    .line 442
    :cond_10
    iput-boolean v1, p0, Lq0/r;->j0:Z

    .line 443
    .line 444
    iget-object p1, p0, Lq0/r;->V:Lq0/l;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget p1, p0, Lh0/h;->s:I

    .line 450
    .line 451
    if-ne p1, p2, :cond_11

    .line 452
    .line 453
    iget-object p1, p0, Lh0/h;->r:Ld0/r;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 459
    .line 460
    .line 461
    move-result-wide p1

    .line 462
    const-wide/16 v0, 0x3e8

    .line 463
    .line 464
    add-long/2addr p1, v0

    .line 465
    iput-wide p1, p0, Lq0/r;->l0:J

    .line 466
    .line 467
    :cond_11
    iget-object p1, p0, Lq0/r;->I0:Lh0/i;

    .line 468
    .line 469
    iget p2, p1, Lh0/i;->a:I

    .line 470
    .line 471
    add-int/2addr p2, v3

    .line 472
    iput p2, p1, Lh0/i;->a:I

    .line 473
    .line 474
    sub-long v5, v8, v5

    .line 475
    .line 476
    move-object v2, p0

    .line 477
    move-wide v3, v8

    .line 478
    invoke-virtual/range {v2 .. v7}, Lq0/r;->N(JJLjava/lang/String;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :catchall_0
    move-exception p1

    .line 483
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 484
    .line 485
    .line 486
    throw p1
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

.method public final J(JJ)Z
    .locals 2

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq0/r;->N:La0/p;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, La0/p;->n:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/opus"

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sub-long/2addr p1, p3

    .line 20
    const-wide/32 p3, 0x13880

    .line 21
    .line 22
    .line 23
    cmp-long p1, p1, p3

    .line 24
    .line 25
    if-gtz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    :goto_1
    return p1
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

.method public final K()V
    .locals 8

    .line 1
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    iget-boolean v0, p0, Lq0/r;->r0:Z

    .line 6
    .line 7
    if-nez v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lq0/r;->M:La0/p;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lq0/r;->h0(La0/p;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, v2

    .line 30
    :goto_0
    iget-object v4, v0, La0/p;->n:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lq0/r;->v()V

    .line 35
    .line 36
    .line 37
    const-string v0, "audio/mp4a-latm"

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lq0/r;->I:Lq0/h;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "audio/mpeg"

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const-string v0, "audio/opus"

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iput v3, v1, Lq0/h;->w:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/16 v0, 0x20

    .line 73
    .line 74
    iput v0, v1, Lq0/h;->w:I

    .line 75
    .line 76
    :goto_1
    iput-boolean v3, p0, Lq0/r;->r0:Z

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    iget-object v1, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 85
    .line 86
    const/4 v5, 0x4

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    iget-object v1, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 90
    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    move v1, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v1, v2

    .line 96
    :goto_2
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroidx/lifecycle/E;->y()Lg0/a;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    sget-boolean v7, Lm0/j;->a:Z

    .line 106
    .line 107
    if-eqz v7, :cond_6

    .line 108
    .line 109
    instance-of v7, v6, Lm0/j;

    .line 110
    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    invoke-virtual {v1}, Landroidx/lifecycle/E;->E()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eq v7, v3, :cond_5

    .line 118
    .line 119
    if-eq v7, v5, :cond_6

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    invoke-virtual {v1}, Landroidx/lifecycle/E;->z()Lm0/c;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lq0/r;->M:La0/p;

    .line 130
    .line 131
    iget v3, v0, Lm0/c;->l:I

    .line 132
    .line 133
    invoke-virtual {p0, v0, v1, v2, v3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_6
    if-nez v6, :cond_7

    .line 139
    .line 140
    invoke-virtual {v1}, Landroidx/lifecycle/E;->z()Lm0/c;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    instance-of v1, v6, Lm0/j;

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    check-cast v6, Lm0/j;

    .line 152
    .line 153
    :try_start_0
    new-instance v1, Landroid/media/MediaCrypto;

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    invoke-direct {v1, v6, v7}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 158
    .line 159
    .line 160
    iput-object v1, p0, Lq0/r;->R:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catch_0
    move-exception v0

    .line 164
    iget-object v1, p0, Lq0/r;->M:La0/p;

    .line 165
    .line 166
    const/16 v3, 0x1776

    .line 167
    .line 168
    invoke-virtual {p0, v0, v1, v2, v3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    throw v0

    .line 173
    :cond_8
    :goto_3
    :try_start_1
    iget-object v1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 174
    .line 175
    if-eqz v1, :cond_a

    .line 176
    .line 177
    invoke-virtual {v1}, Landroidx/lifecycle/E;->E()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/4 v6, 0x3

    .line 182
    if-eq v1, v6, :cond_9

    .line 183
    .line 184
    iget-object v1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroidx/lifecycle/E;->E()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-ne v1, v5, :cond_a

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catch_1
    move-exception v1

    .line 194
    goto :goto_7

    .line 195
    :cond_9
    :goto_4
    iget-object v1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 196
    .line 197
    invoke-static {v4}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v4}, Landroidx/lifecycle/E;->J(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    move v3, v2

    .line 208
    :goto_5
    iget-object v1, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 209
    .line 210
    invoke-virtual {p0, v1, v3}, Lq0/r;->L(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lq0/p; {:try_start_1 .. :try_end_1} :catch_1

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_6
    iget-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 214
    .line 215
    if-eqz v0, :cond_c

    .line 216
    .line 217
    iget-object v1, p0, Lq0/r;->V:Lq0/l;

    .line 218
    .line 219
    if-nez v1, :cond_c

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    iput-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 226
    .line 227
    :cond_c
    return-void

    .line 228
    :goto_7
    const/16 v3, 0xfa1

    .line 229
    .line 230
    invoke-virtual {p0, v1, v0, v2, v3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    throw v0

    .line 235
    :cond_d
    :goto_8
    return-void
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

.method public final L(Landroid/media/MediaCrypto;Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lq0/r;->M:La0/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, p2}, Lq0/r;->B(Z)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v3, Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v3, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    iget-object v3, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lq0/o;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    iput-object v2, p0, Lq0/r;->b0:Lq0/p;
    :try_end_0
    .catch Lq0/v; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_1
    new-instance v1, Lq0/p;

    .line 47
    .line 48
    const v2, -0xc34e

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v0, p1, p2, v2}, Lq0/p;-><init>(La0/p;Lq0/v;ZI)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    :goto_2
    iget-object v1, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_7

    .line 62
    .line 63
    iget-object v1, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :goto_3
    iget-object v3, p0, Lq0/r;->V:Lq0/l;

    .line 69
    .line 70
    if-nez v3, :cond_6

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    move-object v9, v3

    .line 77
    check-cast v9, Lq0/o;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v9}, Lq0/r;->f0(Lq0/o;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_2

    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    :try_start_1
    invoke-virtual {p0, v9, p1}, Lq0/r;->I(Lq0/o;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :catch_1
    move-exception v6

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v4, "Failed to initialize decoder: "

    .line 97
    .line 98
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const-string v4, "MediaCodecRenderer"

    .line 109
    .line 110
    invoke-static {v4, v3, v6}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    new-instance v3, Lq0/p;

    .line 117
    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v5, "Decoder init failed: "

    .line 121
    .line 122
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v5, v9, Lq0/o;->a:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v5, ", "

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    instance-of v4, v6, Landroid/media/MediaCodec$CodecException;

    .line 143
    .line 144
    if-eqz v4, :cond_3

    .line 145
    .line 146
    move-object v4, v6

    .line 147
    check-cast v4, Landroid/media/MediaCodec$CodecException;

    .line 148
    .line 149
    invoke-virtual {v4}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    move-object v10, v4

    .line 154
    goto :goto_4

    .line 155
    :cond_3
    move-object v10, v2

    .line 156
    :goto_4
    iget-object v7, v0, La0/p;->n:Ljava/lang/String;

    .line 157
    .line 158
    move-object v4, v3

    .line 159
    move v8, p2

    .line 160
    invoke-direct/range {v4 .. v10}, Lq0/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLq0/o;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lq0/r;->M(Ljava/lang/Exception;)V

    .line 164
    .line 165
    .line 166
    iget-object v4, p0, Lq0/r;->b0:Lq0/p;

    .line 167
    .line 168
    if-nez v4, :cond_4

    .line 169
    .line 170
    iput-object v3, p0, Lq0/r;->b0:Lq0/p;

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_4
    new-instance v3, Lq0/p;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    iget-object v8, v4, Lq0/p;->l:Ljava/lang/String;

    .line 184
    .line 185
    iget-boolean v9, v4, Lq0/p;->m:Z

    .line 186
    .line 187
    iget-object v10, v4, Lq0/p;->n:Lq0/o;

    .line 188
    .line 189
    iget-object v11, v4, Lq0/p;->o:Ljava/lang/String;

    .line 190
    .line 191
    move-object v5, v3

    .line 192
    invoke-direct/range {v5 .. v11}, Lq0/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLq0/o;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-object v3, p0, Lq0/r;->b0:Lq0/p;

    .line 196
    .line 197
    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_5

    .line 202
    .line 203
    goto/16 :goto_3

    .line 204
    .line 205
    :cond_5
    iget-object p1, p0, Lq0/r;->b0:Lq0/p;

    .line 206
    .line 207
    throw p1

    .line 208
    :cond_6
    iput-object v2, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 209
    .line 210
    return-void

    .line 211
    :cond_7
    new-instance p1, Lq0/p;

    .line 212
    .line 213
    const v1, -0xc34f

    .line 214
    .line 215
    .line 216
    invoke-direct {p1, v0, v2, p2, v1}, Lq0/p;-><init>(La0/p;Lq0/v;ZI)V

    .line 217
    .line 218
    .line 219
    throw p1
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

.method public abstract M(Ljava/lang/Exception;)V
.end method

.method public abstract N(JJLjava/lang/String;)V
.end method

.method public abstract O(Ljava/lang/String;)V
.end method

.method public P(LZ1/e;)Lh0/j;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq0/r;->F0:Z

    .line 3
    .line 4
    iget-object v1, p1, LZ1/e;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, La0/p;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, v1, La0/p;->n:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v3, :cond_24

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v3, v1, La0/p;->q:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, La0/p;->a()La0/o;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v4, v1, La0/o;->p:Ljava/util/List;

    .line 38
    .line 39
    new-instance v3, La0/p;

    .line 40
    .line 41
    invoke-direct {v3, v1}, La0/p;-><init>(La0/o;)V

    .line 42
    .line 43
    .line 44
    move-object v8, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v8, v1

    .line 47
    :goto_0
    iget-object p1, p1, LZ1/e;->m:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroidx/lifecycle/E;

    .line 50
    .line 51
    iget-object v1, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 52
    .line 53
    if-ne v1, p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1, v4}, Landroidx/lifecycle/E;->w(Lm0/e;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, v4}, Landroidx/lifecycle/E;->I(Lm0/e;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    iput-object p1, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 67
    .line 68
    iput-object v8, p0, Lq0/r;->M:La0/p;

    .line 69
    .line 70
    iget-boolean p1, p0, Lq0/r;->r0:Z

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    iput-boolean v0, p0, Lq0/r;->t0:Z

    .line 75
    .line 76
    return-object v4

    .line 77
    :cond_4
    iget-object p1, p0, Lq0/r;->V:Lq0/l;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    iput-object v4, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 84
    .line 85
    .line 86
    return-object v4

    .line 87
    :cond_5
    iget-object v1, p0, Lq0/r;->c0:Lq0/o;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v7, p0, Lq0/r;->W:La0/p;

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 98
    .line 99
    iget-object v4, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 100
    .line 101
    const/4 v5, 0x3

    .line 102
    const/16 v6, 0x17

    .line 103
    .line 104
    const/4 v9, 0x2

    .line 105
    if-ne v3, v4, :cond_6

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_6
    if-eqz v4, :cond_22

    .line 110
    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_7
    invoke-virtual {v4}, Landroidx/lifecycle/E;->y()Lg0/a;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_8

    .line 120
    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :cond_8
    invoke-virtual {v3}, Landroidx/lifecycle/E;->y()Lg0/a;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    if-eqz v11, :cond_22

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_9

    .line 142
    .line 143
    goto/16 :goto_a

    .line 144
    .line 145
    :cond_9
    instance-of v10, v10, Lm0/j;

    .line 146
    .line 147
    if-nez v10, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-virtual {v4}, Landroidx/lifecycle/E;->D()Ljava/util/UUID;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v3}, Landroidx/lifecycle/E;->D()Ljava/util/UUID;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_b

    .line 163
    .line 164
    goto/16 :goto_a

    .line 165
    .line 166
    :cond_b
    sget v10, Ld0/w;->a:I

    .line 167
    .line 168
    if-ge v10, v6, :cond_c

    .line 169
    .line 170
    goto/16 :goto_a

    .line 171
    .line 172
    :cond_c
    sget-object v10, La0/e;->e:Ljava/util/UUID;

    .line 173
    .line 174
    invoke-virtual {v3}, Landroidx/lifecycle/E;->D()Ljava/util/UUID;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v10, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_22

    .line 183
    .line 184
    invoke-virtual {v4}, Landroidx/lifecycle/E;->D()Ljava/util/UUID;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v10, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_d

    .line 193
    .line 194
    goto/16 :goto_a

    .line 195
    .line 196
    :cond_d
    iget-boolean v3, v1, Lq0/o;->f:Z

    .line 197
    .line 198
    if-nez v3, :cond_f

    .line 199
    .line 200
    invoke-virtual {v4}, Landroidx/lifecycle/E;->E()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eq v3, v9, :cond_22

    .line 205
    .line 206
    invoke-virtual {v4}, Landroidx/lifecycle/E;->E()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eq v3, v5, :cond_e

    .line 211
    .line 212
    invoke-virtual {v4}, Landroidx/lifecycle/E;->E()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/4 v10, 0x4

    .line 217
    if-ne v3, v10, :cond_f

    .line 218
    .line 219
    :cond_e
    iget-object v3, v8, La0/p;->n:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v3}, Landroidx/lifecycle/E;->J(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_f

    .line 229
    .line 230
    goto/16 :goto_a

    .line 231
    .line 232
    :cond_f
    :goto_2
    iget-object v3, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 233
    .line 234
    iget-object v4, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 235
    .line 236
    if-eq v3, v4, :cond_10

    .line 237
    .line 238
    move v3, v0

    .line 239
    goto :goto_3

    .line 240
    :cond_10
    move v3, v2

    .line 241
    :goto_3
    if-eqz v3, :cond_12

    .line 242
    .line 243
    sget v4, Ld0/w;->a:I

    .line 244
    .line 245
    if-lt v4, v6, :cond_11

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_11
    move v4, v2

    .line 249
    goto :goto_5

    .line 250
    :cond_12
    :goto_4
    move v4, v0

    .line 251
    :goto_5
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, v1, v7, v8}, Lq0/r;->t(Lq0/o;La0/p;La0/p;)Lh0/j;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget v6, v4, Lh0/j;->d:I

    .line 259
    .line 260
    if-eqz v6, :cond_1d

    .line 261
    .line 262
    const/16 v10, 0x10

    .line 263
    .line 264
    if-eq v6, v0, :cond_19

    .line 265
    .line 266
    if-eq v6, v9, :cond_15

    .line 267
    .line 268
    if-ne v6, v5, :cond_14

    .line 269
    .line 270
    invoke-virtual {p0, v8}, Lq0/r;->j0(La0/p;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_13

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_13
    iput-object v8, p0, Lq0/r;->W:La0/p;

    .line 279
    .line 280
    if-eqz v3, :cond_1f

    .line 281
    .line 282
    invoke-virtual {p0}, Lq0/r;->w()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_1f

    .line 287
    .line 288
    :goto_6
    move v10, v9

    .line 289
    goto/16 :goto_9

    .line 290
    .line 291
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_15
    invoke-virtual {p0, v8}, Lq0/r;->j0(La0/p;)Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-nez v11, :cond_16

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_16
    iput-boolean v0, p0, Lq0/r;->u0:Z

    .line 305
    .line 306
    iput v0, p0, Lq0/r;->v0:I

    .line 307
    .line 308
    iget v10, p0, Lq0/r;->d0:I

    .line 309
    .line 310
    if-eq v10, v9, :cond_18

    .line 311
    .line 312
    if-ne v10, v0, :cond_17

    .line 313
    .line 314
    iget v10, v8, La0/p;->u:I

    .line 315
    .line 316
    iget v11, v7, La0/p;->u:I

    .line 317
    .line 318
    if-ne v10, v11, :cond_17

    .line 319
    .line 320
    iget v10, v8, La0/p;->v:I

    .line 321
    .line 322
    iget v11, v7, La0/p;->v:I

    .line 323
    .line 324
    if-ne v10, v11, :cond_17

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_17
    move v0, v2

    .line 328
    :cond_18
    :goto_7
    iput-boolean v0, p0, Lq0/r;->h0:Z

    .line 329
    .line 330
    iput-object v8, p0, Lq0/r;->W:La0/p;

    .line 331
    .line 332
    if-eqz v3, :cond_1f

    .line 333
    .line 334
    invoke-virtual {p0}, Lq0/r;->w()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-nez v0, :cond_1f

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_19
    invoke-virtual {p0, v8}, Lq0/r;->j0(La0/p;)Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-nez v11, :cond_1a

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_1a
    iput-object v8, p0, Lq0/r;->W:La0/p;

    .line 349
    .line 350
    if-eqz v3, :cond_1b

    .line 351
    .line 352
    invoke-virtual {p0}, Lq0/r;->w()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_1f

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_1b
    iget-boolean v3, p0, Lq0/r;->y0:Z

    .line 360
    .line 361
    if-eqz v3, :cond_1f

    .line 362
    .line 363
    iput v0, p0, Lq0/r;->w0:I

    .line 364
    .line 365
    iget-boolean v3, p0, Lq0/r;->f0:Z

    .line 366
    .line 367
    if-eqz v3, :cond_1c

    .line 368
    .line 369
    iput v5, p0, Lq0/r;->x0:I

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_1c
    iput v0, p0, Lq0/r;->x0:I

    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_1d
    iget-boolean v3, p0, Lq0/r;->y0:Z

    .line 376
    .line 377
    if-eqz v3, :cond_1e

    .line 378
    .line 379
    iput v0, p0, Lq0/r;->w0:I

    .line 380
    .line 381
    iput v5, p0, Lq0/r;->x0:I

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_1e
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 388
    .line 389
    .line 390
    :cond_1f
    :goto_8
    move v10, v2

    .line 391
    :goto_9
    if-eqz v6, :cond_21

    .line 392
    .line 393
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 394
    .line 395
    if-ne v0, p1, :cond_20

    .line 396
    .line 397
    iget p1, p0, Lq0/r;->x0:I

    .line 398
    .line 399
    if-ne p1, v5, :cond_21

    .line 400
    .line 401
    :cond_20
    new-instance p1, Lh0/j;

    .line 402
    .line 403
    iget-object v6, v1, Lq0/o;->a:Ljava/lang/String;

    .line 404
    .line 405
    const/4 v9, 0x0

    .line 406
    move-object v5, p1

    .line 407
    invoke-direct/range {v5 .. v10}, Lh0/j;-><init>(Ljava/lang/String;La0/p;La0/p;II)V

    .line 408
    .line 409
    .line 410
    return-object p1

    .line 411
    :cond_21
    return-object v4

    .line 412
    :cond_22
    :goto_a
    iget-boolean p1, p0, Lq0/r;->y0:Z

    .line 413
    .line 414
    if-eqz p1, :cond_23

    .line 415
    .line 416
    iput v0, p0, Lq0/r;->w0:I

    .line 417
    .line 418
    iput v5, p0, Lq0/r;->x0:I

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_23
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 425
    .line 426
    .line 427
    :goto_b
    new-instance p1, Lh0/j;

    .line 428
    .line 429
    const/16 v10, 0x80

    .line 430
    .line 431
    iget-object v6, v1, Lq0/o;->a:Ljava/lang/String;

    .line 432
    .line 433
    const/4 v9, 0x0

    .line 434
    move-object v5, p1

    .line 435
    invoke-direct/range {v5 .. v10}, Lh0/j;-><init>(Ljava/lang/String;La0/p;La0/p;II)V

    .line 436
    .line 437
    .line 438
    return-object p1

    .line 439
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 440
    .line 441
    const-string v0, "Sample MIME type is null."

    .line 442
    .line 443
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    const/16 v0, 0xfa5

    .line 447
    .line 448
    invoke-virtual {p0, p1, v1, v2, v0}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    throw p1
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

.method public abstract Q(La0/p;Landroid/media/MediaFormat;)V
.end method

.method public R()V
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
.end method

.method public S(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Lq0/r;->K0:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lq0/q;

    .line 16
    .line 17
    iget-wide v1, v1, Lq0/q;->a:J

    .line 18
    .line 19
    cmp-long v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lq0/q;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lq0/r;->e0(Lq0/q;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lq0/r;->T()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
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

.method public abstract T()V
.end method

.method public U(Lg0/e;)V
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

.method public V(La0/p;)V
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

.method public final W()V
    .locals 3

    .line 1
    iget v0, p0, Lq0/r;->x0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lq0/r;->E0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lq0/r;->a0()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lq0/r;->z()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lq0/r;->k0()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {p0}, Lq0/r;->z()V

    .line 33
    .line 34
    .line 35
    :goto_0
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

.method public abstract X(JJLq0/l;Ljava/nio/ByteBuffer;IIIJZZLa0/p;)Z
.end method

.method public final Y(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/h;->n:LZ1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ1/e;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq0/r;->F:Lg0/e;

    .line 7
    .line 8
    invoke-virtual {v1}, Lg0/e;->f()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lh0/h;->r(LZ1/e;Lg0/e;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lq0/r;->P(LZ1/e;)Lh0/j;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Le0/d;->e(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, Lq0/r;->D0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lq0/r;->W()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
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

.method public final Z()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lq0/r;->V:Lq0/l;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Lq0/l;->release()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lq0/r;->I0:Lh0/i;

    .line 10
    .line 11
    iget v2, v1, Lh0/i;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lh0/i;->b:I

    .line 16
    .line 17
    iget-object v1, p0, Lq0/r;->c0:Lq0/o;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lq0/o;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lq0/r;->O(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :goto_0
    iput-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 31
    .line 32
    :try_start_1
    iget-object v1, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    iput-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lq0/r;->c0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_2
    iput-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lq0/r;->c0()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_3
    iput-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 61
    .line 62
    :try_start_2
    iget-object v2, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_5

    .line 72
    :cond_2
    :goto_4
    iput-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lq0/r;->c0()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :goto_5
    iput-object v0, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lq0/r;->c0()V

    .line 87
    .line 88
    .line 89
    throw v1
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

.method public a0()V
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
.end method

.method public b0()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lq0/r;->m0:I

    .line 3
    .line 4
    iget-object v1, p0, Lq0/r;->G:Lg0/e;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Lq0/r;->n0:I

    .line 10
    .line 11
    iput-object v2, p0, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lq0/r;->l0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, Lq0/r;->z0:Z

    .line 22
    .line 23
    iput-wide v0, p0, Lq0/r;->k0:J

    .line 24
    .line 25
    iput-boolean v2, p0, Lq0/r;->y0:Z

    .line 26
    .line 27
    iput-boolean v2, p0, Lq0/r;->h0:Z

    .line 28
    .line 29
    iput-boolean v2, p0, Lq0/r;->i0:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Lq0/r;->p0:Z

    .line 32
    .line 33
    iput-boolean v2, p0, Lq0/r;->q0:Z

    .line 34
    .line 35
    iput-wide v0, p0, Lq0/r;->B0:J

    .line 36
    .line 37
    iput-wide v0, p0, Lq0/r;->C0:J

    .line 38
    .line 39
    iput-wide v0, p0, Lq0/r;->K0:J

    .line 40
    .line 41
    iput v2, p0, Lq0/r;->w0:I

    .line 42
    .line 43
    iput v2, p0, Lq0/r;->x0:I

    .line 44
    .line 45
    iget-boolean v0, p0, Lq0/r;->u0:Z

    .line 46
    .line 47
    iput v0, p0, Lq0/r;->v0:I

    .line 48
    .line 49
    return-void
    .line 50
    .line 51
.end method

.method public final c0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lq0/r;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lq0/r;->H0:Lh0/o;

    .line 6
    .line 7
    iput-object v0, p0, Lq0/r;->a0:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, Lq0/r;->c0:Lq0/o;

    .line 10
    .line 11
    iput-object v0, p0, Lq0/r;->W:La0/p;

    .line 12
    .line 13
    iput-object v0, p0, Lq0/r;->X:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lq0/r;->Y:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lq0/r;->A0:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, Lq0/r;->Z:F

    .line 23
    .line 24
    iput v0, p0, Lq0/r;->d0:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lq0/r;->e0:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lq0/r;->f0:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lq0/r;->g0:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lq0/r;->j0:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lq0/r;->u0:Z

    .line 35
    .line 36
    iput v0, p0, Lq0/r;->v0:I

    .line 37
    .line 38
    return-void
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

.method public final d0(Landroidx/lifecycle/E;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroidx/lifecycle/E;->w(Lm0/e;)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/E;->I(Lm0/e;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    iput-object p1, p0, Lq0/r;->O:Landroidx/lifecycle/E;

    .line 18
    .line 19
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
.end method

.method public final e0(Lq0/q;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lq0/r;->J0:Lq0/q;

    .line 2
    .line 3
    iget-wide v0, p1, Lq0/q;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lq0/r;->L0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lq0/r;->R()V

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

.method public f0(Lq0/o;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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

.method public g0(Lg0/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public h0(La0/p;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public abstract i0(Lq0/j;La0/p;)I
.end method

.method public isReady()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lq0/r;->M:La0/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Lh0/h;->hasReadStreamToEnd()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lh0/h;->y:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lh0/h;->t:Lx0/f0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lx0/f0;->isReady()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, Lq0/r;->n0:I

    .line 28
    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v1

    .line 34
    :goto_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-wide v3, p0, Lq0/r;->l0:J

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v3, v5

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Lh0/h;->r:Ld0/r;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    iget-wide v5, p0, Lq0/r;->l0:J

    .line 57
    .line 58
    cmp-long v0, v3, v5

    .line 59
    .line 60
    if-gez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    move v1, v2

    .line 63
    :cond_3
    return v1
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

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq0/r;->M:La0/p;

    .line 3
    .line 4
    sget-object v0, Lq0/q;->e:Lq0/q;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lq0/r;->e0(Lq0/q;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lq0/r;->A()Z

    .line 15
    .line 16
    .line 17
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
.end method

.method public final j0(La0/p;)Z
    .locals 5

    .line 1
    sget v0, Ld0/w;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 10
    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    iget v0, p0, Lq0/r;->x0:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_7

    .line 17
    .line 18
    iget v0, p0, Lh0/h;->s:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    iget v0, p0, Lq0/r;->U:F

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lh0/h;->u:[La0/p;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0, p1}, Lq0/r;->E(F[La0/p;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget v0, p0, Lq0/r;->Z:F

    .line 38
    .line 39
    cmpl-float v3, v0, p1

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    return v2

    .line 44
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 45
    .line 46
    cmpl-float v4, p1, v3

    .line 47
    .line 48
    if-nez v4, :cond_4

    .line 49
    .line 50
    iget-boolean p1, p0, Lq0/r;->y0:Z

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iput v2, p0, Lq0/r;->w0:I

    .line 55
    .line 56
    iput v1, p0, Lq0/r;->x0:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 63
    .line 64
    .line 65
    :goto_0
    const/4 p1, 0x0

    .line 66
    return p1

    .line 67
    :cond_4
    cmpl-float v0, v0, v3

    .line 68
    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    iget v0, p0, Lq0/r;->E:F

    .line 72
    .line 73
    cmpl-float v0, p1, v0

    .line 74
    .line 75
    if-lez v0, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    return v2

    .line 79
    :cond_6
    :goto_1
    new-instance v0, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "operating-rate"

    .line 85
    .line 86
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lq0/r;->V:Lq0/l;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v0}, Lq0/l;->a(Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    iput p1, p0, Lq0/r;->Z:F

    .line 98
    .line 99
    :cond_7
    :goto_2
    return v2
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

.method public final k0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/lifecycle/E;->y()Lg0/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lm0/j;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lq0/r;->R:Landroid/media/MediaCrypto;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Lm0/j;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    iget-object v1, p0, Lq0/r;->M:La0/p;

    .line 32
    .line 33
    const/16 v3, 0x1776

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1, v2, v3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    throw v0

    .line 40
    :cond_0
    :goto_0
    iget-object v0, p0, Lq0/r;->P:Landroidx/lifecycle/E;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lq0/r;->d0(Landroidx/lifecycle/E;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Lq0/r;->w0:I

    .line 46
    .line 47
    iput v2, p0, Lq0/r;->x0:I

    .line 48
    .line 49
    return-void
    .line 50
    .line 51
.end method

.method public l(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lq0/r;->D0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lq0/r;->E0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Lq0/r;->G0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, Lq0/r;->r0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lq0/r;->I:Lq0/h;

    .line 13
    .line 14
    invoke-virtual {p2}, Lq0/h;->f()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lq0/r;->H:Lg0/e;

    .line 18
    .line 19
    invoke-virtual {p2}, Lg0/e;->f()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, Lq0/r;->s0:Z

    .line 23
    .line 24
    iget-object p2, p0, Lq0/r;->L:Lj0/y;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object p3, Lb0/d;->a:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iput-object p3, p2, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iput p1, p2, Lj0/y;->c:I

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    iput p1, p2, Lj0/y;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lq0/r;->A()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lq0/r;->J0:Lq0/q;

    .line 49
    .line 50
    iget-object p1, p1, Lq0/q;->d:LZ0/e;

    .line 51
    .line 52
    invoke-virtual {p1}, LZ0/e;->i()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-lez p1, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lq0/r;->F0:Z

    .line 60
    .line 61
    :cond_2
    iget-object p1, p0, Lq0/r;->J0:Lq0/q;

    .line 62
    .line 63
    iget-object p1, p1, Lq0/q;->d:LZ0/e;

    .line 64
    .line 65
    invoke-virtual {p1}, LZ0/e;->c()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 71
    .line 72
    .line 73
    return-void
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

.method public final l0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/r;->J0:Lq0/q;

    .line 2
    .line 3
    iget-object v0, v0, Lq0/q;->d:LZ0/e;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LZ0/e;->g(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La0/p;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Lq0/r;->L0:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lq0/r;->X:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lq0/r;->J0:Lq0/q;

    .line 22
    .line 23
    iget-object p1, p1, Lq0/q;->d:LZ0/e;

    .line 24
    .line 25
    invoke-virtual {p1}, LZ0/e;->f()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La0/p;

    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-object p1, p0, Lq0/r;->N:La0/p;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-boolean p1, p0, Lq0/r;->Y:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lq0/r;->N:La0/p;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Lq0/r;->N:La0/p;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lq0/r;->X:Landroid/media/MediaFormat;

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lq0/r;->Q(La0/p;Landroid/media/MediaFormat;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lq0/r;->Y:Z

    .line 56
    .line 57
    iput-boolean p1, p0, Lq0/r;->L0:Z

    .line 58
    .line 59
    :cond_2
    return-void
    .line 60
    .line 61
.end method

.method public q([La0/p;JJLx0/H;)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, Lq0/r;->J0:Lq0/q;

    .line 3
    .line 4
    iget-wide v1, v1, Lq0/q;->c:J

    .line 5
    .line 6
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v1, v1, v3

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lq0/q;

    .line 16
    .line 17
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    move-object v5, v1

    .line 23
    move-wide v8, p2

    .line 24
    move-wide/from16 v10, p4

    .line 25
    .line 26
    invoke-direct/range {v5 .. v11}, Lq0/q;-><init>(JJJ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lq0/r;->e0(Lq0/q;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, v0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iget-wide v5, v0, Lq0/r;->B0:J

    .line 42
    .line 43
    cmp-long v2, v5, v3

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-wide v7, v0, Lq0/r;->K0:J

    .line 48
    .line 49
    cmp-long v2, v7, v3

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    cmp-long v2, v7, v5

    .line 54
    .line 55
    if-ltz v2, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v1, Lq0/q;

    .line 58
    .line 59
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    move-object v5, v1

    .line 65
    move-wide v8, p2

    .line 66
    move-wide/from16 v10, p4

    .line 67
    .line 68
    invoke-direct/range {v5 .. v11}, Lq0/q;-><init>(JJJ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lq0/r;->e0(Lq0/q;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lq0/r;->J0:Lq0/q;

    .line 75
    .line 76
    iget-wide v1, v1, Lq0/q;->c:J

    .line 77
    .line 78
    cmp-long v1, v1, v3

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0}, Lq0/r;->T()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    new-instance v9, Lq0/q;

    .line 87
    .line 88
    iget-wide v3, v0, Lq0/r;->B0:J

    .line 89
    .line 90
    move-object v2, v9

    .line 91
    move-wide v5, p2

    .line 92
    move-wide/from16 v7, p4

    .line 93
    .line 94
    invoke-direct/range {v2 .. v8}, Lq0/q;-><init>(JJJ)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_0
    return-void
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

.method public render(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lq0/r;->G0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lq0/r;->G0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lq0/r;->W()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lq0/r;->H0:Lh0/o;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, Lq0/r;->E0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lq0/r;->a0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto/16 :goto_b

    .line 29
    .line 30
    :cond_1
    iget-object v2, p0, Lq0/r;->M:La0/p;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p0, v2}, Lq0/r;->Y(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Lq0/r;->K()V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p0, Lq0/r;->r0:Z

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    const-string v2, "bypassRender"

    .line 50
    .line 51
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lq0/r;->s(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_4
    iget-object v2, p0, Lq0/r;->V:Lq0/l;

    .line 67
    .line 68
    if-eqz v2, :cond_b

    .line 69
    .line 70
    iget-object v2, p0, Lh0/h;->r:Ld0/r;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    const-string v4, "drainAndFeed"

    .line 80
    .line 81
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lq0/r;->x(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-wide v7, p0, Lq0/r;->S:J

    .line 96
    .line 97
    cmp-long v4, v7, v5

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    iget-object v4, p0, Lh0/h;->r:Ld0/r;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    sub-long/2addr v9, v2

    .line 111
    cmp-long v4, v9, v7

    .line 112
    .line 113
    if-gez v4, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    move v4, v1

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    :goto_2
    move v4, v0

    .line 119
    :goto_3
    if-eqz v4, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    :goto_4
    invoke-virtual {p0}, Lq0/r;->y()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    iget-wide p1, p0, Lq0/r;->S:J

    .line 129
    .line 130
    cmp-long p3, p1, v5

    .line 131
    .line 132
    if-eqz p3, :cond_9

    .line 133
    .line 134
    iget-object p3, p0, Lh0/h;->r:Ld0/r;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 140
    .line 141
    .line 142
    move-result-wide p3

    .line 143
    sub-long/2addr p3, v2

    .line 144
    cmp-long p1, p3, p1

    .line 145
    .line 146
    if-gez p1, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move p1, v1

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    :goto_5
    move p1, v0

    .line 152
    :goto_6
    if-eqz p1, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    iget-object p3, p0, Lq0/r;->I0:Lh0/i;

    .line 160
    .line 161
    iget p4, p3, Lh0/i;->d:I

    .line 162
    .line 163
    iget-object v2, p0, Lh0/h;->t:Lx0/f0;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-wide v3, p0, Lh0/h;->v:J

    .line 169
    .line 170
    sub-long/2addr p1, v3

    .line 171
    invoke-interface {v2, p1, p2}, Lx0/f0;->d(J)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    add-int/2addr p4, p1

    .line 176
    iput p4, p3, Lh0/i;->d:I

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lq0/r;->Y(I)Z

    .line 179
    .line 180
    .line 181
    :goto_7
    iget-object p1, p0, Lq0/r;->I0:Lh0/i;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    return-void

    .line 186
    :goto_8
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 187
    .line 188
    if-eqz p2, :cond_c

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    array-length p4, p3

    .line 196
    if-lez p4, :cond_10

    .line 197
    .line 198
    aget-object p3, p3, v1

    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    const-string p4, "android.media.MediaCodec"

    .line 205
    .line 206
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_10

    .line 211
    .line 212
    :goto_9
    invoke-virtual {p0, p1}, Lq0/r;->M(Ljava/lang/Exception;)V

    .line 213
    .line 214
    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    move-object p2, p1

    .line 218
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 219
    .line 220
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_d

    .line 225
    .line 226
    move v1, v0

    .line 227
    :cond_d
    if-eqz v1, :cond_e

    .line 228
    .line 229
    invoke-virtual {p0}, Lq0/r;->Z()V

    .line 230
    .line 231
    .line 232
    :cond_e
    iget-object p2, p0, Lq0/r;->c0:Lq0/o;

    .line 233
    .line 234
    invoke-virtual {p0, p1, p2}, Lq0/r;->u(Ljava/lang/IllegalStateException;Lq0/o;)Lq0/n;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget p2, p1, Lq0/n;->l:I

    .line 239
    .line 240
    const/16 p3, 0x44d

    .line 241
    .line 242
    if-ne p2, p3, :cond_f

    .line 243
    .line 244
    const/16 p2, 0xfa6

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_f
    const/16 p2, 0xfa3

    .line 248
    .line 249
    :goto_a
    iget-object p3, p0, Lq0/r;->M:La0/p;

    .line 250
    .line 251
    invoke-virtual {p0, p1, p3, v1, p2}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    throw p1

    .line 256
    :cond_10
    throw p1

    .line 257
    :goto_b
    iget-object p2, p0, Lq0/r;->M:La0/p;

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    invoke-static {p3}, Ld0/w;->v(I)I

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    invoke-virtual {p0, p1, p2, v1, p3}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    throw p1

    .line 272
    :cond_11
    const/4 p1, 0x0

    .line 273
    iput-object p1, p0, Lq0/r;->H0:Lh0/o;

    .line 274
    .line 275
    throw v0
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

.method public final s(JJ)Z
    .locals 26

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    iget-boolean v0, v15, Lq0/r;->E0:Z

    .line 4
    .line 5
    const/4 v14, 0x1

    .line 6
    xor-int/2addr v0, v14

    .line 7
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v13, v15, Lq0/r;->I:Lq0/h;

    .line 11
    .line 12
    invoke-virtual {v13}, Lq0/h;->m()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v12, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v6, v13, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v7, v15, Lq0/r;->n0:I

    .line 22
    .line 23
    iget v9, v13, Lq0/h;->v:I

    .line 24
    .line 25
    iget-wide v3, v13, Lg0/e;->r:J

    .line 26
    .line 27
    iget-wide v0, v15, Lh0/h;->w:J

    .line 28
    .line 29
    iget-wide v10, v13, Lq0/h;->u:J

    .line 30
    .line 31
    invoke-virtual {v15, v0, v1, v10, v11}, Lq0/r;->J(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v17

    .line 35
    const/4 v10, 0x4

    .line 36
    invoke-virtual {v13, v10}, Le0/d;->e(I)Z

    .line 37
    .line 38
    .line 39
    move-result v16

    .line 40
    iget-object v11, v15, Lq0/r;->N:La0/p;

    .line 41
    .line 42
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    move-object/from16 v0, p0

    .line 48
    .line 49
    move-wide/from16 v1, p1

    .line 50
    .line 51
    move-wide/from16 v18, v3

    .line 52
    .line 53
    move-wide/from16 v3, p3

    .line 54
    .line 55
    move-object/from16 v20, v11

    .line 56
    .line 57
    move-wide/from16 v10, v18

    .line 58
    .line 59
    move/from16 v12, v17

    .line 60
    .line 61
    move-object/from16 v22, v13

    .line 62
    .line 63
    move/from16 v13, v16

    .line 64
    .line 65
    move-object/from16 v14, v20

    .line 66
    .line 67
    invoke-virtual/range {v0 .. v14}, Lq0/r;->X(JJLq0/l;Ljava/nio/ByteBuffer;IIIJZZLa0/p;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    move-object/from16 v0, v22

    .line 74
    .line 75
    iget-wide v1, v0, Lq0/h;->u:J

    .line 76
    .line 77
    invoke-virtual {v15, v1, v2}, Lq0/r;->S(J)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lq0/h;->f()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const/4 v1, 0x0

    .line 86
    return v1

    .line 87
    :cond_1
    move v1, v12

    .line 88
    move-object v0, v13

    .line 89
    :goto_0
    iget-boolean v2, v15, Lq0/r;->D0:Z

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    iput-boolean v2, v15, Lq0/r;->E0:Z

    .line 95
    .line 96
    return v1

    .line 97
    :cond_2
    const/4 v2, 0x1

    .line 98
    iget-boolean v3, v15, Lq0/r;->s0:Z

    .line 99
    .line 100
    iget-object v4, v15, Lq0/r;->H:Lg0/e;

    .line 101
    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {v0, v4}, Lq0/h;->l(Lg0/e;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 109
    .line 110
    .line 111
    iput-boolean v1, v15, Lq0/r;->s0:Z

    .line 112
    .line 113
    :cond_3
    iget-boolean v3, v15, Lq0/r;->t0:Z

    .line 114
    .line 115
    if-eqz v3, :cond_5

    .line 116
    .line 117
    invoke-virtual {v0}, Lq0/h;->m()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    return v2

    .line 124
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lq0/r;->v()V

    .line 125
    .line 126
    .line 127
    iput-boolean v1, v15, Lq0/r;->t0:Z

    .line 128
    .line 129
    invoke-virtual/range {p0 .. p0}, Lq0/r;->K()V

    .line 130
    .line 131
    .line 132
    iget-boolean v3, v15, Lq0/r;->r0:Z

    .line 133
    .line 134
    if-nez v3, :cond_5

    .line 135
    .line 136
    return v1

    .line 137
    :cond_5
    iget-boolean v3, v15, Lq0/r;->D0:Z

    .line 138
    .line 139
    xor-int/2addr v3, v2

    .line 140
    invoke-static {v3}, Ld0/m;->h(Z)V

    .line 141
    .line 142
    .line 143
    iget-object v3, v15, Lh0/h;->n:LZ1/e;

    .line 144
    .line 145
    invoke-virtual {v3}, LZ1/e;->c()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Lg0/e;->f()V

    .line 149
    .line 150
    .line 151
    :goto_1
    invoke-virtual {v4}, Lg0/e;->f()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v15, v3, v4, v1}, Lh0/h;->r(LZ1/e;Lg0/e;I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/4 v6, -0x5

    .line 159
    if-eq v5, v6, :cond_21

    .line 160
    .line 161
    const/4 v6, -0x4

    .line 162
    if-eq v5, v6, :cond_8

    .line 163
    .line 164
    const/4 v3, -0x3

    .line 165
    if-ne v5, v3, :cond_7

    .line 166
    .line 167
    invoke-virtual/range {p0 .. p0}, Lh0/h;->hasReadStreamToEnd()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_6

    .line 172
    .line 173
    iget-wide v3, v15, Lq0/r;->B0:J

    .line 174
    .line 175
    iput-wide v3, v15, Lq0/r;->C0:J

    .line 176
    .line 177
    :cond_6
    :goto_2
    move v7, v1

    .line 178
    move v1, v2

    .line 179
    goto/16 :goto_14

    .line 180
    .line 181
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_8
    const/4 v5, 0x4

    .line 188
    invoke-virtual {v4, v5}, Le0/d;->e(I)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_9

    .line 193
    .line 194
    iput-boolean v2, v15, Lq0/r;->D0:Z

    .line 195
    .line 196
    iget-wide v3, v15, Lq0/r;->B0:J

    .line 197
    .line 198
    iput-wide v3, v15, Lq0/r;->C0:J

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_9
    iget-wide v6, v15, Lq0/r;->B0:J

    .line 202
    .line 203
    iget-wide v8, v4, Lg0/e;->r:J

    .line 204
    .line 205
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    iput-wide v6, v15, Lq0/r;->B0:J

    .line 210
    .line 211
    invoke-virtual/range {p0 .. p0}, Lh0/h;->hasReadStreamToEnd()Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-nez v6, :cond_a

    .line 216
    .line 217
    iget-object v6, v15, Lq0/r;->G:Lg0/e;

    .line 218
    .line 219
    const/high16 v7, 0x20000000

    .line 220
    .line 221
    invoke-virtual {v6, v7}, Le0/d;->e(I)Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-eqz v6, :cond_b

    .line 226
    .line 227
    :cond_a
    iget-wide v6, v15, Lq0/r;->B0:J

    .line 228
    .line 229
    iput-wide v6, v15, Lq0/r;->C0:J

    .line 230
    .line 231
    :cond_b
    iget-boolean v6, v15, Lq0/r;->F0:Z

    .line 232
    .line 233
    const/16 v7, 0x8

    .line 234
    .line 235
    const/16 v8, 0xff

    .line 236
    .line 237
    const/4 v9, 0x0

    .line 238
    const-string v10, "audio/opus"

    .line 239
    .line 240
    if-eqz v6, :cond_d

    .line 241
    .line 242
    iget-object v6, v15, Lq0/r;->M:La0/p;

    .line 243
    .line 244
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iput-object v6, v15, Lq0/r;->N:La0/p;

    .line 248
    .line 249
    iget-object v6, v6, La0/p;->n:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v6, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_c

    .line 256
    .line 257
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 258
    .line 259
    iget-object v6, v6, La0/p;->q:Ljava/util/List;

    .line 260
    .line 261
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-nez v6, :cond_c

    .line 266
    .line 267
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 268
    .line 269
    iget-object v6, v6, La0/p;->q:Ljava/util/List;

    .line 270
    .line 271
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    check-cast v6, [B

    .line 276
    .line 277
    const/16 v11, 0xb

    .line 278
    .line 279
    aget-byte v11, v6, v11

    .line 280
    .line 281
    and-int/2addr v11, v8

    .line 282
    shl-int/2addr v11, v7

    .line 283
    const/16 v12, 0xa

    .line 284
    .line 285
    aget-byte v6, v6, v12

    .line 286
    .line 287
    and-int/2addr v6, v8

    .line 288
    or-int/2addr v6, v11

    .line 289
    iget-object v11, v15, Lq0/r;->N:La0/p;

    .line 290
    .line 291
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v11}, La0/p;->a()La0/o;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    iput v6, v11, La0/o;->E:I

    .line 299
    .line 300
    new-instance v6, La0/p;

    .line 301
    .line 302
    invoke-direct {v6, v11}, La0/p;-><init>(La0/o;)V

    .line 303
    .line 304
    .line 305
    iput-object v6, v15, Lq0/r;->N:La0/p;

    .line 306
    .line 307
    :cond_c
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 308
    .line 309
    invoke-virtual {v15, v6, v9}, Lq0/r;->Q(La0/p;Landroid/media/MediaFormat;)V

    .line 310
    .line 311
    .line 312
    iput-boolean v1, v15, Lq0/r;->F0:Z

    .line 313
    .line 314
    :cond_d
    invoke-virtual {v4}, Lg0/e;->k()V

    .line 315
    .line 316
    .line 317
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 318
    .line 319
    if-eqz v6, :cond_1d

    .line 320
    .line 321
    iget-object v6, v6, La0/p;->n:Ljava/lang/String;

    .line 322
    .line 323
    invoke-static {v6, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    if-eqz v6, :cond_1d

    .line 328
    .line 329
    const/high16 v6, 0x10000000

    .line 330
    .line 331
    invoke-virtual {v4, v6}, Le0/d;->e(I)Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-eqz v6, :cond_e

    .line 336
    .line 337
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 338
    .line 339
    iput-object v6, v4, Lg0/e;->n:La0/p;

    .line 340
    .line 341
    invoke-virtual {v15, v4}, Lq0/r;->H(Lg0/e;)V

    .line 342
    .line 343
    .line 344
    :cond_e
    iget-wide v10, v15, Lh0/h;->w:J

    .line 345
    .line 346
    iget-wide v12, v4, Lg0/e;->r:J

    .line 347
    .line 348
    sub-long/2addr v10, v12

    .line 349
    const-wide/32 v12, 0x13880

    .line 350
    .line 351
    .line 352
    cmp-long v6, v10, v12

    .line 353
    .line 354
    if-gtz v6, :cond_1d

    .line 355
    .line 356
    iget-object v6, v15, Lq0/r;->N:La0/p;

    .line 357
    .line 358
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v10, v15, Lq0/r;->L:Lj0/y;

    .line 362
    .line 363
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v11, v4, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 367
    .line 368
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object v11, v4, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 372
    .line 373
    invoke-virtual {v11}, Ljava/nio/Buffer;->limit()I

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    iget-object v12, v4, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    invoke-virtual {v12}, Ljava/nio/Buffer;->position()I

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    sub-int/2addr v11, v12

    .line 384
    if-nez v11, :cond_f

    .line 385
    .line 386
    goto/16 :goto_10

    .line 387
    .line 388
    :cond_f
    iget v11, v10, Lj0/y;->b:I

    .line 389
    .line 390
    const/4 v12, 0x2

    .line 391
    if-ne v11, v12, :cond_11

    .line 392
    .line 393
    iget-object v6, v6, La0/p;->q:Ljava/util/List;

    .line 394
    .line 395
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    if-eq v11, v2, :cond_10

    .line 400
    .line 401
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    const/4 v13, 0x3

    .line 406
    if-ne v11, v13, :cond_11

    .line 407
    .line 408
    :cond_10
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    move-object v9, v6

    .line 413
    check-cast v9, [B

    .line 414
    .line 415
    :cond_11
    iget-object v6, v4, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 416
    .line 417
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 422
    .line 423
    .line 424
    move-result v13

    .line 425
    sub-int v14, v13, v11

    .line 426
    .line 427
    add-int/lit16 v5, v14, 0xff

    .line 428
    .line 429
    div-int/2addr v5, v8

    .line 430
    add-int/lit8 v16, v5, 0x1b

    .line 431
    .line 432
    add-int v16, v16, v14

    .line 433
    .line 434
    iget v8, v10, Lj0/y;->b:I

    .line 435
    .line 436
    if-ne v8, v12, :cond_13

    .line 437
    .line 438
    if-eqz v9, :cond_12

    .line 439
    .line 440
    array-length v8, v9

    .line 441
    add-int/lit8 v8, v8, 0x1c

    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_12
    const/16 v8, 0x2f

    .line 445
    .line 446
    :goto_3
    add-int/lit8 v17, v8, 0x2c

    .line 447
    .line 448
    add-int v16, v17, v16

    .line 449
    .line 450
    :goto_4
    move/from16 v2, v16

    .line 451
    .line 452
    goto :goto_5

    .line 453
    :cond_13
    move v8, v1

    .line 454
    goto :goto_4

    .line 455
    :goto_5
    iget-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-ge v1, v2, :cond_14

    .line 462
    .line 463
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 468
    .line 469
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    iput-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 474
    .line 475
    goto :goto_6

    .line 476
    :cond_14
    iget-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 479
    .line 480
    .line 481
    :goto_6
    iget-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 482
    .line 483
    iget v2, v10, Lj0/y;->b:I

    .line 484
    .line 485
    if-ne v2, v12, :cond_17

    .line 486
    .line 487
    if-eqz v9, :cond_16

    .line 488
    .line 489
    const-wide/16 v21, 0x0

    .line 490
    .line 491
    const/16 v23, 0x0

    .line 492
    .line 493
    const/16 v24, 0x1

    .line 494
    .line 495
    const/16 v25, 0x1

    .line 496
    .line 497
    move-object/from16 v20, v1

    .line 498
    .line 499
    invoke-static/range {v20 .. v25}, Lj0/y;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 500
    .line 501
    .line 502
    array-length v2, v9

    .line 503
    move/from16 v17, v13

    .line 504
    .line 505
    int-to-long v12, v2

    .line 506
    const/16 v2, 0x8

    .line 507
    .line 508
    shr-long v18, v12, v2

    .line 509
    .line 510
    const-wide/16 v20, 0x0

    .line 511
    .line 512
    cmp-long v2, v18, v20

    .line 513
    .line 514
    if-nez v2, :cond_15

    .line 515
    .line 516
    const/4 v2, 0x1

    .line 517
    goto :goto_7

    .line 518
    :cond_15
    const/4 v2, 0x0

    .line 519
    :goto_7
    const-string v7, "out of range: %s"

    .line 520
    .line 521
    invoke-static {v2, v7, v12, v13}, LD1/b;->k(ZLjava/lang/String;J)V

    .line 522
    .line 523
    .line 524
    long-to-int v2, v12

    .line 525
    int-to-byte v2, v2

    .line 526
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    array-length v12, v9

    .line 541
    add-int/lit8 v12, v12, 0x1c

    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    invoke-static {v7, v12, v13, v2}, Ld0/w;->l(III[B)I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    const/16 v7, 0x16

    .line 549
    .line 550
    invoke-virtual {v1, v7, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 551
    .line 552
    .line 553
    array-length v2, v9

    .line 554
    add-int/lit8 v2, v2, 0x1c

    .line 555
    .line 556
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 557
    .line 558
    .line 559
    goto :goto_8

    .line 560
    :cond_16
    move/from16 v17, v13

    .line 561
    .line 562
    sget-object v2, Lj0/y;->d:[B

    .line 563
    .line 564
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 565
    .line 566
    .line 567
    :goto_8
    sget-object v2, Lj0/y;->e:[B

    .line 568
    .line 569
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 570
    .line 571
    .line 572
    :goto_9
    const/4 v2, 0x0

    .line 573
    goto :goto_a

    .line 574
    :cond_17
    move/from16 v17, v13

    .line 575
    .line 576
    goto :goto_9

    .line 577
    :goto_a
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 578
    .line 579
    .line 580
    move-result v7

    .line 581
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    const/4 v9, 0x1

    .line 586
    if-le v2, v9, :cond_18

    .line 587
    .line 588
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 589
    .line 590
    .line 591
    move-result v12

    .line 592
    goto :goto_b

    .line 593
    :cond_18
    const/4 v12, 0x0

    .line 594
    :goto_b
    invoke-static {v7, v12}, LF0/b;->l(BB)J

    .line 595
    .line 596
    .line 597
    move-result-wide v12

    .line 598
    const-wide/32 v18, 0xbb80

    .line 599
    .line 600
    .line 601
    mul-long v12, v12, v18

    .line 602
    .line 603
    const-wide/32 v18, 0xf4240

    .line 604
    .line 605
    .line 606
    div-long v12, v12, v18

    .line 607
    .line 608
    long-to-int v2, v12

    .line 609
    iget v7, v10, Lj0/y;->c:I

    .line 610
    .line 611
    add-int/2addr v7, v2

    .line 612
    iput v7, v10, Lj0/y;->c:I

    .line 613
    .line 614
    int-to-long v12, v7

    .line 615
    iget v2, v10, Lj0/y;->b:I

    .line 616
    .line 617
    const/16 v25, 0x0

    .line 618
    .line 619
    move-object/from16 v20, v1

    .line 620
    .line 621
    move-wide/from16 v21, v12

    .line 622
    .line 623
    move/from16 v23, v2

    .line 624
    .line 625
    move/from16 v24, v5

    .line 626
    .line 627
    invoke-static/range {v20 .. v25}, Lj0/y;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 628
    .line 629
    .line 630
    const/4 v12, 0x0

    .line 631
    :goto_c
    if-ge v12, v5, :cond_1a

    .line 632
    .line 633
    const/16 v2, 0xff

    .line 634
    .line 635
    if-lt v14, v2, :cond_19

    .line 636
    .line 637
    const/4 v7, -0x1

    .line 638
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 639
    .line 640
    .line 641
    add-int/lit16 v7, v14, -0xff

    .line 642
    .line 643
    move v14, v7

    .line 644
    goto :goto_d

    .line 645
    :cond_19
    int-to-byte v7, v14

    .line 646
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 647
    .line 648
    .line 649
    const/4 v14, 0x0

    .line 650
    :goto_d
    add-int/lit8 v12, v12, 0x1

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :cond_1a
    move/from16 v2, v17

    .line 654
    .line 655
    :goto_e
    if-ge v11, v2, :cond_1b

    .line 656
    .line 657
    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 658
    .line 659
    .line 660
    move-result v5

    .line 661
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 662
    .line 663
    .line 664
    add-int/lit8 v11, v11, 0x1

    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_1b
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 675
    .line 676
    .line 677
    iget v2, v10, Lj0/y;->b:I

    .line 678
    .line 679
    const/4 v5, 0x2

    .line 680
    if-ne v2, v5, :cond_1c

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    add-int/2addr v5, v8

    .line 691
    add-int/lit8 v5, v5, 0x2c

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    sub-int/2addr v6, v7

    .line 702
    const/4 v7, 0x0

    .line 703
    invoke-static {v5, v6, v7, v2}, Ld0/w;->l(III[B)I

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    add-int/lit8 v8, v8, 0x42

    .line 708
    .line 709
    invoke-virtual {v1, v8, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 710
    .line 711
    .line 712
    goto :goto_f

    .line 713
    :cond_1c
    const/4 v7, 0x0

    .line 714
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 719
    .line 720
    .line 721
    move-result v5

    .line 722
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 723
    .line 724
    .line 725
    move-result v6

    .line 726
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 727
    .line 728
    .line 729
    move-result v8

    .line 730
    sub-int/2addr v6, v8

    .line 731
    invoke-static {v5, v6, v7, v2}, Ld0/w;->l(III[B)I

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    const/16 v5, 0x16

    .line 736
    .line 737
    invoke-virtual {v1, v5, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 738
    .line 739
    .line 740
    :goto_f
    iget v2, v10, Lj0/y;->b:I

    .line 741
    .line 742
    const/4 v5, 0x1

    .line 743
    add-int/2addr v2, v5

    .line 744
    iput v2, v10, Lj0/y;->b:I

    .line 745
    .line 746
    iput-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 747
    .line 748
    invoke-virtual {v4}, Lg0/e;->f()V

    .line 749
    .line 750
    .line 751
    iget-object v1, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 752
    .line 753
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    invoke-virtual {v4, v1}, Lg0/e;->j(I)V

    .line 758
    .line 759
    .line 760
    iget-object v1, v4, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 761
    .line 762
    iget-object v2, v10, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 763
    .line 764
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4}, Lg0/e;->k()V

    .line 768
    .line 769
    .line 770
    goto :goto_11

    .line 771
    :cond_1d
    :goto_10
    move v7, v1

    .line 772
    :goto_11
    invoke-virtual {v0}, Lq0/h;->m()Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-nez v1, :cond_1e

    .line 777
    .line 778
    goto :goto_12

    .line 779
    :cond_1e
    iget-wide v1, v15, Lh0/h;->w:J

    .line 780
    .line 781
    iget-wide v5, v0, Lq0/h;->u:J

    .line 782
    .line 783
    invoke-virtual {v15, v1, v2, v5, v6}, Lq0/r;->J(JJ)Z

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    iget-wide v8, v4, Lg0/e;->r:J

    .line 788
    .line 789
    invoke-virtual {v15, v1, v2, v8, v9}, Lq0/r;->J(JJ)Z

    .line 790
    .line 791
    .line 792
    move-result v1

    .line 793
    if-ne v5, v1, :cond_1f

    .line 794
    .line 795
    :goto_12
    invoke-virtual {v0, v4}, Lq0/h;->l(Lg0/e;)Z

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    if-nez v1, :cond_20

    .line 800
    .line 801
    :cond_1f
    const/4 v1, 0x1

    .line 802
    goto :goto_13

    .line 803
    :cond_20
    move v1, v7

    .line 804
    const/4 v2, 0x1

    .line 805
    goto/16 :goto_1

    .line 806
    .line 807
    :goto_13
    iput-boolean v1, v15, Lq0/r;->s0:Z

    .line 808
    .line 809
    goto :goto_14

    .line 810
    :cond_21
    move v7, v1

    .line 811
    move v1, v2

    .line 812
    invoke-virtual {v15, v3}, Lq0/r;->P(LZ1/e;)Lh0/j;

    .line 813
    .line 814
    .line 815
    :goto_14
    invoke-virtual {v0}, Lq0/h;->m()Z

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    if-eqz v2, :cond_22

    .line 820
    .line 821
    invoke-virtual {v0}, Lg0/e;->k()V

    .line 822
    .line 823
    .line 824
    :cond_22
    invoke-virtual {v0}, Lq0/h;->m()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-nez v0, :cond_24

    .line 829
    .line 830
    iget-boolean v0, v15, Lq0/r;->D0:Z

    .line 831
    .line 832
    if-nez v0, :cond_24

    .line 833
    .line 834
    iget-boolean v0, v15, Lq0/r;->t0:Z

    .line 835
    .line 836
    if-eqz v0, :cond_23

    .line 837
    .line 838
    goto :goto_15

    .line 839
    :cond_23
    move v14, v7

    .line 840
    goto :goto_16

    .line 841
    :cond_24
    :goto_15
    move v14, v1

    .line 842
    :goto_16
    return v14
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

.method public setPlaybackSpeed(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lq0/r;->T:F

    .line 2
    .line 3
    iput p2, p0, Lq0/r;->U:F

    .line 4
    .line 5
    iget-object p1, p0, Lq0/r;->W:La0/p;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq0/r;->j0(La0/p;)Z

    .line 8
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

.method public final supportsFormat(La0/p;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lq0/r;->D:Lq0/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lq0/r;->i0(Lq0/j;La0/p;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Lq0/v; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v0, p1, v2, v1}, Lh0/h;->i(Ljava/lang/Exception;La0/p;ZI)Lh0/o;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
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

.method public final supportsMixedMimeTypeAdaptation()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
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

.method public abstract t(Lq0/o;La0/p;La0/p;)Lh0/j;
.end method

.method public u(Ljava/lang/IllegalStateException;Lq0/o;)Lq0/n;
    .locals 1

    .line 1
    new-instance v0, Lq0/n;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lq0/n;-><init>(Ljava/lang/IllegalStateException;Lq0/o;)V

    .line 4
    .line 5
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

.method public final v()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lq0/r;->t0:Z

    .line 3
    .line 4
    iget-object v1, p0, Lq0/r;->I:Lq0/h;

    .line 5
    .line 6
    invoke-virtual {v1}, Lq0/h;->f()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lq0/r;->H:Lg0/e;

    .line 10
    .line 11
    invoke-virtual {v1}, Lg0/e;->f()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lq0/r;->s0:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lq0/r;->r0:Z

    .line 17
    .line 18
    iget-object v1, p0, Lq0/r;->L:Lj0/y;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v2, Lb0/d;->a:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iput-object v2, v1, Lj0/y;->a:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    iput v0, v1, Lj0/y;->c:I

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    iput v0, v1, Lj0/y;->b:I

    .line 31
    .line 32
    return-void
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

.method public final w()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq0/r;->y0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput v1, p0, Lq0/r;->w0:I

    .line 7
    .line 8
    iget-boolean v0, p0, Lq0/r;->f0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iput v0, p0, Lq0/r;->x0:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    iput v0, p0, Lq0/r;->x0:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lq0/r;->k0()V

    .line 22
    .line 23
    .line 24
    :goto_0
    return v1
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

.method public final x(JJ)Z
    .locals 21

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    iget-object v5, v15, Lq0/r;->V:Lq0/l;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v0, v15, Lq0/r;->n0:I

    .line 9
    .line 10
    const/4 v14, 0x0

    .line 11
    const/4 v13, 0x1

    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    move v0, v13

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v14

    .line 17
    :goto_0
    iget-object v12, v15, Lq0/r;->J:Landroid/media/MediaCodec$BufferInfo;

    .line 18
    .line 19
    if-nez v0, :cond_e

    .line 20
    .line 21
    iget-boolean v0, v15, Lq0/r;->g0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-boolean v0, v15, Lq0/r;->z0:Z

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :try_start_0
    invoke-interface {v5, v12}, Lq0/l;->d(Landroid/media/MediaCodec$BufferInfo;)I

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_1

    .line 34
    :catch_0
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, v15, Lq0/r;->E0:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lq0/r;->Z()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return v14

    .line 45
    :cond_2
    invoke-interface {v5, v12}, Lq0/l;->d(Landroid/media/MediaCodec$BufferInfo;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    if-gez v0, :cond_8

    .line 55
    .line 56
    const/4 v3, -0x2

    .line 57
    if-ne v0, v3, :cond_4

    .line 58
    .line 59
    iput-boolean v13, v15, Lq0/r;->A0:Z

    .line 60
    .line 61
    iget-object v0, v15, Lq0/r;->V:Lq0/l;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Lq0/l;->w()Landroid/media/MediaFormat;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget v1, v15, Lq0/r;->d0:I

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    const-string v1, "width"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v2, 0x20

    .line 81
    .line 82
    if-ne v1, v2, :cond_3

    .line 83
    .line 84
    const-string v1, "height"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-ne v1, v2, :cond_3

    .line 91
    .line 92
    iput-boolean v13, v15, Lq0/r;->i0:Z

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iput-object v0, v15, Lq0/r;->X:Landroid/media/MediaFormat;

    .line 96
    .line 97
    iput-boolean v13, v15, Lq0/r;->Y:Z

    .line 98
    .line 99
    :goto_2
    return v13

    .line 100
    :cond_4
    iget-boolean v0, v15, Lq0/r;->j0:Z

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    iget-boolean v0, v15, Lq0/r;->D0:Z

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    iget v0, v15, Lq0/r;->w0:I

    .line 109
    .line 110
    const/4 v3, 0x2

    .line 111
    if-ne v0, v3, :cond_6

    .line 112
    .line 113
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 114
    .line 115
    .line 116
    :cond_6
    iget-wide v3, v15, Lq0/r;->k0:J

    .line 117
    .line 118
    cmp-long v0, v3, v1

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    const-wide/16 v0, 0x64

    .line 123
    .line 124
    add-long/2addr v3, v0

    .line 125
    iget-object v0, v15, Lh0/h;->r:Ld0/r;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    cmp-long v0, v3, v0

    .line 135
    .line 136
    if-gez v0, :cond_7

    .line 137
    .line 138
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 139
    .line 140
    .line 141
    :cond_7
    return v14

    .line 142
    :cond_8
    iget-boolean v3, v15, Lq0/r;->i0:Z

    .line 143
    .line 144
    if-eqz v3, :cond_9

    .line 145
    .line 146
    iput-boolean v14, v15, Lq0/r;->i0:Z

    .line 147
    .line 148
    invoke-interface {v5, v0}, Lq0/l;->k(I)V

    .line 149
    .line 150
    .line 151
    return v13

    .line 152
    :cond_9
    iget v3, v12, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 153
    .line 154
    if-nez v3, :cond_a

    .line 155
    .line 156
    iget v3, v12, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 157
    .line 158
    and-int/lit8 v3, v3, 0x4

    .line 159
    .line 160
    if-eqz v3, :cond_a

    .line 161
    .line 162
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 163
    .line 164
    .line 165
    return v14

    .line 166
    :cond_a
    iput v0, v15, Lq0/r;->n0:I

    .line 167
    .line 168
    invoke-interface {v5, v0}, Lq0/l;->l(I)Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, v15, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    if-eqz v0, :cond_b

    .line 175
    .line 176
    iget v3, v12, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 179
    .line 180
    .line 181
    iget-object v0, v15, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    iget v3, v12, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 184
    .line 185
    iget v4, v12, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 186
    .line 187
    add-int/2addr v3, v4

    .line 188
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 189
    .line 190
    .line 191
    :cond_b
    iget-wide v3, v12, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 192
    .line 193
    iget-wide v6, v15, Lh0/h;->w:J

    .line 194
    .line 195
    cmp-long v0, v3, v6

    .line 196
    .line 197
    if-gez v0, :cond_c

    .line 198
    .line 199
    move v0, v13

    .line 200
    goto :goto_3

    .line 201
    :cond_c
    move v0, v14

    .line 202
    :goto_3
    iput-boolean v0, v15, Lq0/r;->p0:Z

    .line 203
    .line 204
    iget-wide v6, v15, Lq0/r;->C0:J

    .line 205
    .line 206
    cmp-long v0, v6, v1

    .line 207
    .line 208
    if-eqz v0, :cond_d

    .line 209
    .line 210
    cmp-long v0, v6, v3

    .line 211
    .line 212
    if-gtz v0, :cond_d

    .line 213
    .line 214
    move v0, v13

    .line 215
    goto :goto_4

    .line 216
    :cond_d
    move v0, v14

    .line 217
    :goto_4
    iput-boolean v0, v15, Lq0/r;->q0:Z

    .line 218
    .line 219
    invoke-virtual {v15, v3, v4}, Lq0/r;->l0(J)V

    .line 220
    .line 221
    .line 222
    :cond_e
    iget-boolean v0, v15, Lq0/r;->g0:Z

    .line 223
    .line 224
    if-eqz v0, :cond_10

    .line 225
    .line 226
    iget-boolean v0, v15, Lq0/r;->z0:Z

    .line 227
    .line 228
    if-eqz v0, :cond_10

    .line 229
    .line 230
    :try_start_1
    iget-object v6, v15, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 231
    .line 232
    iget v7, v15, Lq0/r;->n0:I

    .line 233
    .line 234
    iget v8, v12, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 235
    .line 236
    iget-wide v10, v12, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 237
    .line 238
    iget-boolean v9, v15, Lq0/r;->p0:Z

    .line 239
    .line 240
    iget-boolean v3, v15, Lq0/r;->q0:Z

    .line 241
    .line 242
    iget-object v4, v15, Lq0/r;->N:La0/p;

    .line 243
    .line 244
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 245
    .line 246
    .line 247
    const/16 v16, 0x1

    .line 248
    .line 249
    move-object/from16 v0, p0

    .line 250
    .line 251
    move-wide/from16 v1, p1

    .line 252
    .line 253
    move/from16 v17, v3

    .line 254
    .line 255
    move-object/from16 v18, v4

    .line 256
    .line 257
    move-wide/from16 v3, p3

    .line 258
    .line 259
    move/from16 v19, v9

    .line 260
    .line 261
    move/from16 v9, v16

    .line 262
    .line 263
    move-object/from16 v20, v12

    .line 264
    .line 265
    move/from16 v12, v19

    .line 266
    .line 267
    move/from16 v16, v13

    .line 268
    .line 269
    move/from16 v13, v17

    .line 270
    .line 271
    move/from16 v17, v14

    .line 272
    .line 273
    move-object/from16 v14, v18

    .line 274
    .line 275
    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lq0/r;->X(JJLq0/l;Ljava/nio/ByteBuffer;IIIJZZLa0/p;)Z

    .line 276
    .line 277
    .line 278
    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 279
    move-object/from16 v15, v20

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :catch_1
    move/from16 v17, v14

    .line 283
    .line 284
    :catch_2
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 285
    .line 286
    .line 287
    iget-boolean v0, v15, Lq0/r;->E0:Z

    .line 288
    .line 289
    if-eqz v0, :cond_f

    .line 290
    .line 291
    invoke-virtual/range {p0 .. p0}, Lq0/r;->Z()V

    .line 292
    .line 293
    .line 294
    :cond_f
    return v17

    .line 295
    :cond_10
    move-object/from16 v20, v12

    .line 296
    .line 297
    move/from16 v16, v13

    .line 298
    .line 299
    move/from16 v17, v14

    .line 300
    .line 301
    iget-object v6, v15, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 302
    .line 303
    iget v7, v15, Lq0/r;->n0:I

    .line 304
    .line 305
    move-object/from16 v14, v20

    .line 306
    .line 307
    iget v8, v14, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 308
    .line 309
    iget-wide v10, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 310
    .line 311
    iget-boolean v12, v15, Lq0/r;->p0:Z

    .line 312
    .line 313
    iget-boolean v13, v15, Lq0/r;->q0:Z

    .line 314
    .line 315
    iget-object v9, v15, Lq0/r;->N:La0/p;

    .line 316
    .line 317
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    const/16 v18, 0x1

    .line 321
    .line 322
    move-object/from16 v0, p0

    .line 323
    .line 324
    move-wide/from16 v1, p1

    .line 325
    .line 326
    move-wide/from16 v3, p3

    .line 327
    .line 328
    move-object/from16 v19, v9

    .line 329
    .line 330
    move/from16 v9, v18

    .line 331
    .line 332
    move-object v15, v14

    .line 333
    move-object/from16 v14, v19

    .line 334
    .line 335
    invoke-virtual/range {v0 .. v14}, Lq0/r;->X(JJLq0/l;Ljava/nio/ByteBuffer;IIIJZZLa0/p;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    :goto_5
    if-eqz v0, :cond_14

    .line 340
    .line 341
    iget-wide v0, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 342
    .line 343
    move-object/from16 v2, p0

    .line 344
    .line 345
    move-object v3, v15

    .line 346
    invoke-virtual {v2, v0, v1}, Lq0/r;->S(J)V

    .line 347
    .line 348
    .line 349
    iget v0, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 350
    .line 351
    and-int/lit8 v0, v0, 0x4

    .line 352
    .line 353
    if-eqz v0, :cond_11

    .line 354
    .line 355
    move/from16 v14, v16

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_11
    move/from16 v14, v17

    .line 359
    .line 360
    :goto_6
    if-nez v14, :cond_12

    .line 361
    .line 362
    iget-boolean v0, v2, Lq0/r;->z0:Z

    .line 363
    .line 364
    if-eqz v0, :cond_12

    .line 365
    .line 366
    iget-boolean v0, v2, Lq0/r;->q0:Z

    .line 367
    .line 368
    if-eqz v0, :cond_12

    .line 369
    .line 370
    iget-object v0, v2, Lh0/h;->r:Ld0/r;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 376
    .line 377
    .line 378
    move-result-wide v0

    .line 379
    iput-wide v0, v2, Lq0/r;->k0:J

    .line 380
    .line 381
    :cond_12
    const/4 v0, -0x1

    .line 382
    iput v0, v2, Lq0/r;->n0:I

    .line 383
    .line 384
    const/4 v0, 0x0

    .line 385
    iput-object v0, v2, Lq0/r;->o0:Ljava/nio/ByteBuffer;

    .line 386
    .line 387
    if-nez v14, :cond_13

    .line 388
    .line 389
    return v16

    .line 390
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lq0/r;->W()V

    .line 391
    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_14
    move-object/from16 v2, p0

    .line 395
    .line 396
    :goto_7
    return v17
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

.method public final y()Z
    .locals 14

    .line 1
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    if-eqz v0, :cond_1c

    .line 5
    .line 6
    iget v1, p0, Lq0/r;->w0:I

    .line 7
    .line 8
    const/4 v7, 0x2

    .line 9
    if-eq v1, v7, :cond_1c

    .line 10
    .line 11
    iget-boolean v1, p0, Lq0/r;->D0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    iget v1, p0, Lq0/r;->m0:I

    .line 18
    .line 19
    iget-object v8, p0, Lq0/r;->G:Lg0/e;

    .line 20
    .line 21
    if-gez v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Lq0/l;->p()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, p0, Lq0/r;->m0:I

    .line 28
    .line 29
    if-gez v1, :cond_1

    .line 30
    .line 31
    return v6

    .line 32
    :cond_1
    invoke-interface {v0, v1}, Lq0/l;->i(I)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    invoke-virtual {v8}, Lg0/e;->f()V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget v1, p0, Lq0/r;->w0:I

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, -0x1

    .line 46
    if-ne v1, v9, :cond_4

    .line 47
    .line 48
    iget-boolean v1, p0, Lq0/r;->j0:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    iput-boolean v9, p0, Lq0/r;->z0:Z

    .line 54
    .line 55
    iget v1, p0, Lq0/r;->m0:I

    .line 56
    .line 57
    const/4 v5, 0x4

    .line 58
    const/4 v2, 0x0

    .line 59
    const-wide/16 v3, 0x0

    .line 60
    .line 61
    invoke-interface/range {v0 .. v5}, Lq0/l;->c(IIJI)V

    .line 62
    .line 63
    .line 64
    iput v11, p0, Lq0/r;->m0:I

    .line 65
    .line 66
    iput-object v10, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    :goto_0
    iput v7, p0, Lq0/r;->w0:I

    .line 69
    .line 70
    return v6

    .line 71
    :cond_4
    iget-boolean v1, p0, Lq0/r;->h0:Z

    .line 72
    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    iput-boolean v6, p0, Lq0/r;->h0:Z

    .line 76
    .line 77
    iget-object v1, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v2, Lq0/r;->M0:[B

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    .line 87
    iget v1, p0, Lq0/r;->m0:I

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/16 v2, 0x26

    .line 91
    .line 92
    const-wide/16 v3, 0x0

    .line 93
    .line 94
    invoke-interface/range {v0 .. v5}, Lq0/l;->c(IIJI)V

    .line 95
    .line 96
    .line 97
    iput v11, p0, Lq0/r;->m0:I

    .line 98
    .line 99
    iput-object v10, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    iput-boolean v9, p0, Lq0/r;->y0:Z

    .line 102
    .line 103
    return v9

    .line 104
    :cond_5
    iget v1, p0, Lq0/r;->v0:I

    .line 105
    .line 106
    if-ne v1, v9, :cond_7

    .line 107
    .line 108
    move v1, v6

    .line 109
    :goto_1
    iget-object v2, p0, Lq0/r;->W:La0/p;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v2, v2, La0/p;->q:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-ge v1, v2, :cond_6

    .line 121
    .line 122
    iget-object v2, p0, Lq0/r;->W:La0/p;

    .line 123
    .line 124
    iget-object v2, v2, La0/p;->q:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, [B

    .line 131
    .line 132
    iget-object v3, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    iput v7, p0, Lq0/r;->v0:I

    .line 144
    .line 145
    :cond_7
    iget-object v1, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    iget-object v2, p0, Lh0/h;->n:LZ1/e;

    .line 155
    .line 156
    invoke-virtual {v2}, LZ1/e;->c()V

    .line 157
    .line 158
    .line 159
    :try_start_0
    invoke-virtual {p0, v2, v8, v6}, Lh0/h;->r(LZ1/e;Lg0/e;I)I

    .line 160
    .line 161
    .line 162
    move-result v3
    :try_end_0
    .catch Lg0/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    const/4 v4, -0x3

    .line 164
    if-ne v3, v4, :cond_9

    .line 165
    .line 166
    invoke-virtual {p0}, Lh0/h;->hasReadStreamToEnd()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_8

    .line 171
    .line 172
    iget-wide v0, p0, Lq0/r;->B0:J

    .line 173
    .line 174
    iput-wide v0, p0, Lq0/r;->C0:J

    .line 175
    .line 176
    :cond_8
    return v6

    .line 177
    :cond_9
    const/4 v4, -0x5

    .line 178
    if-ne v3, v4, :cond_b

    .line 179
    .line 180
    iget v0, p0, Lq0/r;->v0:I

    .line 181
    .line 182
    if-ne v0, v7, :cond_a

    .line 183
    .line 184
    invoke-virtual {v8}, Lg0/e;->f()V

    .line 185
    .line 186
    .line 187
    iput v9, p0, Lq0/r;->v0:I

    .line 188
    .line 189
    :cond_a
    invoke-virtual {p0, v2}, Lq0/r;->P(LZ1/e;)Lh0/j;

    .line 190
    .line 191
    .line 192
    return v9

    .line 193
    :cond_b
    const/4 v2, 0x4

    .line 194
    invoke-virtual {v8, v2}, Le0/d;->e(I)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_f

    .line 199
    .line 200
    iget-wide v1, p0, Lq0/r;->B0:J

    .line 201
    .line 202
    iput-wide v1, p0, Lq0/r;->C0:J

    .line 203
    .line 204
    iget v1, p0, Lq0/r;->v0:I

    .line 205
    .line 206
    if-ne v1, v7, :cond_c

    .line 207
    .line 208
    invoke-virtual {v8}, Lg0/e;->f()V

    .line 209
    .line 210
    .line 211
    iput v9, p0, Lq0/r;->v0:I

    .line 212
    .line 213
    :cond_c
    iput-boolean v9, p0, Lq0/r;->D0:Z

    .line 214
    .line 215
    iget-boolean v1, p0, Lq0/r;->y0:Z

    .line 216
    .line 217
    if-nez v1, :cond_d

    .line 218
    .line 219
    invoke-virtual {p0}, Lq0/r;->W()V

    .line 220
    .line 221
    .line 222
    return v6

    .line 223
    :cond_d
    iget-boolean v1, p0, Lq0/r;->j0:Z

    .line 224
    .line 225
    if-eqz v1, :cond_e

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_e
    iput-boolean v9, p0, Lq0/r;->z0:Z

    .line 229
    .line 230
    iget v1, p0, Lq0/r;->m0:I

    .line 231
    .line 232
    const/4 v5, 0x4

    .line 233
    const/4 v2, 0x0

    .line 234
    const-wide/16 v3, 0x0

    .line 235
    .line 236
    invoke-interface/range {v0 .. v5}, Lq0/l;->c(IIJI)V

    .line 237
    .line 238
    .line 239
    iput v11, p0, Lq0/r;->m0:I

    .line 240
    .line 241
    iput-object v10, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 242
    .line 243
    :goto_2
    return v6

    .line 244
    :cond_f
    iget-boolean v2, p0, Lq0/r;->y0:Z

    .line 245
    .line 246
    if-nez v2, :cond_11

    .line 247
    .line 248
    invoke-virtual {v8, v9}, Le0/d;->e(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-nez v2, :cond_11

    .line 253
    .line 254
    invoke-virtual {v8}, Lg0/e;->f()V

    .line 255
    .line 256
    .line 257
    iget v0, p0, Lq0/r;->v0:I

    .line 258
    .line 259
    if-ne v0, v7, :cond_10

    .line 260
    .line 261
    iput v9, p0, Lq0/r;->v0:I

    .line 262
    .line 263
    :cond_10
    return v9

    .line 264
    :cond_11
    invoke-virtual {p0, v8}, Lq0/r;->g0(Lg0/e;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_12

    .line 269
    .line 270
    invoke-virtual {v8}, Lg0/e;->f()V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lq0/r;->I0:Lh0/i;

    .line 274
    .line 275
    iget v1, v0, Lh0/i;->d:I

    .line 276
    .line 277
    add-int/2addr v1, v9

    .line 278
    iput v1, v0, Lh0/i;->d:I

    .line 279
    .line 280
    return v9

    .line 281
    :cond_12
    const/high16 v2, 0x40000000    # 2.0f

    .line 282
    .line 283
    invoke-virtual {v8, v2}, Le0/d;->e(I)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_15

    .line 288
    .line 289
    iget-object v3, v8, Lg0/e;->o:LQ1/a;

    .line 290
    .line 291
    if-nez v1, :cond_13

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_13
    iget-object v4, v3, LQ1/a;->g:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v4, [I

    .line 300
    .line 301
    if-nez v4, :cond_14

    .line 302
    .line 303
    new-array v4, v9, [I

    .line 304
    .line 305
    iput-object v4, v3, LQ1/a;->g:Ljava/lang/Object;

    .line 306
    .line 307
    iget-object v5, v3, LQ1/a;->i:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v5, Landroid/media/MediaCodec$CryptoInfo;

    .line 310
    .line 311
    iput-object v4, v5, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 312
    .line 313
    :cond_14
    iget-object v3, v3, LQ1/a;->g:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, [I

    .line 316
    .line 317
    aget v4, v3, v6

    .line 318
    .line 319
    add-int/2addr v4, v1

    .line 320
    aput v4, v3, v6

    .line 321
    .line 322
    :cond_15
    :goto_3
    iget-wide v3, v8, Lg0/e;->r:J

    .line 323
    .line 324
    iget-boolean v1, p0, Lq0/r;->F0:Z

    .line 325
    .line 326
    if-eqz v1, :cond_17

    .line 327
    .line 328
    iget-object v1, p0, Lq0/r;->K:Ljava/util/ArrayDeque;

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    if-nez v5, :cond_16

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, Lq0/q;

    .line 341
    .line 342
    iget-object v1, v1, Lq0/q;->d:LZ0/e;

    .line 343
    .line 344
    iget-object v5, p0, Lq0/r;->M:La0/p;

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v3, v4, v5}, LZ0/e;->a(JLjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_4

    .line 353
    :cond_16
    iget-object v1, p0, Lq0/r;->J0:Lq0/q;

    .line 354
    .line 355
    iget-object v1, v1, Lq0/q;->d:LZ0/e;

    .line 356
    .line 357
    iget-object v5, p0, Lq0/r;->M:La0/p;

    .line 358
    .line 359
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v3, v4, v5}, LZ0/e;->a(JLjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :goto_4
    iput-boolean v6, p0, Lq0/r;->F0:Z

    .line 366
    .line 367
    :cond_17
    iget-wide v12, p0, Lq0/r;->B0:J

    .line 368
    .line 369
    invoke-static {v12, v13, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 370
    .line 371
    .line 372
    move-result-wide v12

    .line 373
    iput-wide v12, p0, Lq0/r;->B0:J

    .line 374
    .line 375
    invoke-virtual {p0}, Lh0/h;->hasReadStreamToEnd()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_18

    .line 380
    .line 381
    const/high16 v1, 0x20000000

    .line 382
    .line 383
    invoke-virtual {v8, v1}, Le0/d;->e(I)Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    if-eqz v1, :cond_19

    .line 388
    .line 389
    :cond_18
    iget-wide v12, p0, Lq0/r;->B0:J

    .line 390
    .line 391
    iput-wide v12, p0, Lq0/r;->C0:J

    .line 392
    .line 393
    :cond_19
    invoke-virtual {v8}, Lg0/e;->k()V

    .line 394
    .line 395
    .line 396
    const/high16 v1, 0x10000000

    .line 397
    .line 398
    invoke-virtual {v8, v1}, Le0/d;->e(I)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_1a

    .line 403
    .line 404
    invoke-virtual {p0, v8}, Lq0/r;->H(Lg0/e;)V

    .line 405
    .line 406
    .line 407
    :cond_1a
    invoke-virtual {p0, v8}, Lq0/r;->U(Lg0/e;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0, v8}, Lq0/r;->C(Lg0/e;)I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-eqz v2, :cond_1b

    .line 415
    .line 416
    iget v1, p0, Lq0/r;->m0:I

    .line 417
    .line 418
    iget-object v2, v8, Lg0/e;->o:LQ1/a;

    .line 419
    .line 420
    invoke-interface/range {v0 .. v5}, Lq0/l;->b(ILQ1/a;JI)V

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_1b
    iget v1, p0, Lq0/r;->m0:I

    .line 425
    .line 426
    iget-object v2, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 427
    .line 428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    invoke-interface/range {v0 .. v5}, Lq0/l;->c(IIJI)V

    .line 436
    .line 437
    .line 438
    :goto_5
    iput v11, p0, Lq0/r;->m0:I

    .line 439
    .line 440
    iput-object v10, v8, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 441
    .line 442
    iput-boolean v9, p0, Lq0/r;->y0:Z

    .line 443
    .line 444
    iput v6, p0, Lq0/r;->v0:I

    .line 445
    .line 446
    iget-object v0, p0, Lq0/r;->I0:Lh0/i;

    .line 447
    .line 448
    iget v1, v0, Lh0/i;->c:I

    .line 449
    .line 450
    add-int/2addr v1, v9

    .line 451
    iput v1, v0, Lh0/i;->c:I

    .line 452
    .line 453
    return v9

    .line 454
    :catch_0
    move-exception v0

    .line 455
    invoke-virtual {p0, v0}, Lq0/r;->M(Ljava/lang/Exception;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p0, v6}, Lq0/r;->Y(I)Z

    .line 459
    .line 460
    .line 461
    invoke-virtual {p0}, Lq0/r;->z()V

    .line 462
    .line 463
    .line 464
    return v9

    .line 465
    :cond_1c
    :goto_6
    return v6
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

.method public final z()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lq0/r;->V:Lq0/l;

    .line 2
    .line 3
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lq0/l;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lq0/r;->b0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-virtual {p0}, Lq0/r;->b0()V

    .line 15
    .line 16
    .line 17
    throw v0
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
