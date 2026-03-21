.class public final Lj0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j0:Ljava/lang/Object;

.field public static k0:Ljava/util/concurrent/ScheduledExecutorService;

.field public static l0:I


# instance fields
.field public A:Lj0/q;

.field public B:Lj0/q;

.field public C:La0/J;

.field public D:Z

.field public E:Ljava/nio/ByteBuffer;

.field public F:I

.field public G:J

.field public H:J

.field public I:J

.field public J:J

.field public K:I

.field public L:Z

.field public M:Z

.field public N:J

.field public O:F

.field public P:Ljava/nio/ByteBuffer;

.field public Q:I

.field public R:Ljava/nio/ByteBuffer;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:La0/d;

.field public Z:Landroidx/lifecycle/E;

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public final b:LZ1/s;

.field public b0:J

.field public final c:Lj0/o;

.field public c0:J

.field public final d:Lj0/B;

.field public d0:Z

.field public final e:Lm2/b0;

.field public e0:Z

.field public final f:Lm2/b0;

.field public f0:Landroid/os/Looper;

.field public final g:Lj0/n;

.field public g0:J

.field public final h:Ljava/util/ArrayDeque;

.field public h0:J

.field public final i:Z

.field public i0:Landroid/os/Handler;

.field public j:I

.field public k:LZ1/s;

.field public final l:Lj0/s;

.field public final m:Lj0/s;

.field public final n:Lj0/w;

.field public final o:LZ1/e;

.field public final p:Lj0/w;

.field public q:Li0/j;

.field public r:Landroidx/lifecycle/E;

.field public s:Lj0/p;

.field public t:Lj0/p;

.field public u:Lb0/a;

.field public v:Landroid/media/AudioTrack;

.field public w:Lj0/b;

.field public x:Lj0/d;

.field public y:LZ1/m;

.field public z:La0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj0/v;->j0:Ljava/lang/Object;

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

.method public constructor <init>(LD0/k;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LD0/k;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    iput-object v0, p0, Lj0/v;->a:Landroid/content/Context;

    .line 9
    .line 10
    sget-object v1, La0/c;->e:La0/c;

    .line 11
    .line 12
    iput-object v1, p0, Lj0/v;->z:La0/c;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v2, Lj0/b;->c:Lj0/b;

    .line 17
    .line 18
    sget v2, Ld0/w;->a:I

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Lj0/b;->b(Landroid/content/Context;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p1, LD0/k;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lj0/b;

    .line 29
    .line 30
    :goto_0
    iput-object v0, p0, Lj0/v;->w:Lj0/b;

    .line 31
    .line 32
    iget-object v0, p1, LD0/k;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LZ1/s;

    .line 35
    .line 36
    iput-object v0, p0, Lj0/v;->b:LZ1/s;

    .line 37
    .line 38
    sget v0, Ld0/w;->a:I

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lj0/v;->i:Z

    .line 42
    .line 43
    iput v0, p0, Lj0/v;->j:I

    .line 44
    .line 45
    iget-object v1, p1, LD0/k;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lj0/w;

    .line 48
    .line 49
    iput-object v1, p0, Lj0/v;->n:Lj0/w;

    .line 50
    .line 51
    iget-object v1, p1, LD0/k;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, LZ1/e;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lj0/v;->o:LZ1/e;

    .line 59
    .line 60
    new-instance v1, Lj0/n;

    .line 61
    .line 62
    new-instance v2, Landroidx/lifecycle/E;

    .line 63
    .line 64
    const/16 v3, 0xa

    .line 65
    .line 66
    invoke-direct {v2, p0, v3}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v2}, Lj0/n;-><init>(Landroidx/lifecycle/E;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Lj0/v;->g:Lj0/n;

    .line 73
    .line 74
    new-instance v1, Lj0/o;

    .line 75
    .line 76
    invoke-direct {v1}, Lb0/e;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, Lj0/v;->c:Lj0/o;

    .line 80
    .line 81
    new-instance v2, Lj0/B;

    .line 82
    .line 83
    invoke-direct {v2}, Lb0/e;-><init>()V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ld0/w;->f:[B

    .line 87
    .line 88
    iput-object v3, v2, Lj0/B;->m:[B

    .line 89
    .line 90
    iput-object v2, p0, Lj0/v;->d:Lj0/B;

    .line 91
    .line 92
    new-instance v3, Lb0/h;

    .line 93
    .line 94
    invoke-direct {v3}, Lb0/e;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v1, v2}, Lm2/I;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lm2/b0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, p0, Lj0/v;->e:Lm2/b0;

    .line 102
    .line 103
    new-instance v1, Lj0/A;

    .line 104
    .line 105
    invoke-direct {v1}, Lb0/e;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, Lj0/v;->f:Lm2/b0;

    .line 113
    .line 114
    const/high16 v1, 0x3f800000    # 1.0f

    .line 115
    .line 116
    iput v1, p0, Lj0/v;->O:F

    .line 117
    .line 118
    iput v0, p0, Lj0/v;->X:I

    .line 119
    .line 120
    new-instance v1, La0/d;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v1, p0, Lj0/v;->Y:La0/d;

    .line 126
    .line 127
    new-instance v1, Lj0/q;

    .line 128
    .line 129
    sget-object v8, La0/J;->d:La0/J;

    .line 130
    .line 131
    const-wide/16 v4, 0x0

    .line 132
    .line 133
    const-wide/16 v6, 0x0

    .line 134
    .line 135
    move-object v2, v1

    .line 136
    move-object v3, v8

    .line 137
    invoke-direct/range {v2 .. v7}, Lj0/q;-><init>(La0/J;JJ)V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, Lj0/v;->B:Lj0/q;

    .line 141
    .line 142
    iput-object v8, p0, Lj0/v;->C:La0/J;

    .line 143
    .line 144
    iput-boolean v0, p0, Lj0/v;->D:Z

    .line 145
    .line 146
    new-instance v0, Ljava/util/ArrayDeque;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v0, p0, Lj0/v;->h:Ljava/util/ArrayDeque;

    .line 152
    .line 153
    new-instance v0, Lj0/s;

    .line 154
    .line 155
    invoke-direct {v0}, Lj0/s;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, Lj0/v;->l:Lj0/s;

    .line 159
    .line 160
    new-instance v0, Lj0/s;

    .line 161
    .line 162
    invoke-direct {v0}, Lj0/s;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, Lj0/v;->m:Lj0/s;

    .line 166
    .line 167
    iget-object p1, p1, LD0/k;->f:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p1, Lj0/w;

    .line 170
    .line 171
    iput-object p1, p0, Lj0/v;->p:Lj0/w;

    .line 172
    .line 173
    return-void
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

.method public static p(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Ld0/w;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lio/flutter/plugin/platform/n;->v(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    return p0
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
.method public final a(J)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lj0/v;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lj0/v;->b:LZ1/s;

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-boolean v0, p0, Lj0/v;->a0:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 14
    .line 15
    iget v2, v0, Lj0/p;->c:I

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, Lj0/p;->a:La0/p;

    .line 20
    .line 21
    iget v0, v0, La0/p;->E:I

    .line 22
    .line 23
    iget-object v0, p0, Lj0/v;->C:La0/J;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget v2, v0, La0/J;->a:F

    .line 29
    .line 30
    iget-object v3, v1, LZ1/s;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lb0/g;

    .line 33
    .line 34
    iget v4, v3, Lb0/g;->c:F

    .line 35
    .line 36
    cmpl-float v4, v4, v2

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iput v2, v3, Lb0/g;->c:F

    .line 42
    .line 43
    iput-boolean v5, v3, Lb0/g;->i:Z

    .line 44
    .line 45
    :cond_0
    iget v2, v3, Lb0/g;->d:F

    .line 46
    .line 47
    iget v4, v0, La0/J;->b:F

    .line 48
    .line 49
    cmpl-float v2, v2, v4

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iput v4, v3, Lb0/g;->d:F

    .line 54
    .line 55
    iput-boolean v5, v3, Lb0/g;->i:Z

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v0, La0/J;->d:La0/J;

    .line 59
    .line 60
    :cond_2
    :goto_0
    iput-object v0, p0, Lj0/v;->C:La0/J;

    .line 61
    .line 62
    :goto_1
    move-object v3, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    sget-object v0, La0/J;->d:La0/J;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :goto_2
    iget-boolean v0, p0, Lj0/v;->a0:Z

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 72
    .line 73
    iget v2, v0, Lj0/p;->c:I

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    iget-object v0, v0, Lj0/p;->a:La0/p;

    .line 78
    .line 79
    iget v0, v0, La0/p;->E:I

    .line 80
    .line 81
    iget-boolean v0, p0, Lj0/v;->D:Z

    .line 82
    .line 83
    iget-object v1, v1, LZ1/s;->n:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Lj0/z;

    .line 86
    .line 87
    iput-boolean v0, v1, Lj0/z;->o:Z

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 v0, 0x0

    .line 91
    :goto_3
    iput-boolean v0, p0, Lj0/v;->D:Z

    .line 92
    .line 93
    iget-object v0, p0, Lj0/v;->h:Ljava/util/ArrayDeque;

    .line 94
    .line 95
    new-instance v1, Lj0/q;

    .line 96
    .line 97
    const-wide/16 v4, 0x0

    .line 98
    .line 99
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v4

    .line 103
    iget-object p1, p0, Lj0/v;->t:Lj0/p;

    .line 104
    .line 105
    invoke-virtual {p0}, Lj0/v;->k()J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    iget p1, p1, Lj0/p;->e:I

    .line 110
    .line 111
    invoke-static {v6, v7, p1}, Ld0/w;->S(JI)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    move-object v2, v1

    .line 116
    invoke-direct/range {v2 .. v7}, Lj0/q;-><init>(La0/J;JJ)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lj0/v;->t:Lj0/p;

    .line 123
    .line 124
    iget-object p1, p1, Lj0/p;->i:Lb0/a;

    .line 125
    .line 126
    iput-object p1, p0, Lj0/v;->u:Lb0/a;

    .line 127
    .line 128
    invoke-virtual {p1}, Lb0/a;->b()V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 132
    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    iget-boolean p2, p0, Lj0/v;->D:Z

    .line 136
    .line 137
    iget-object p1, p1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Lj0/x;

    .line 140
    .line 141
    iget-object p1, p1, Lj0/x;->O0:LZ1/c;

    .line 142
    .line 143
    iget-object v0, p1, LZ1/c;->l:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Landroid/os/Handler;

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    new-instance v1, Lj0/g;

    .line 150
    .line 151
    invoke-direct {v1, p1, p2}, Lj0/g;-><init>(LZ1/c;Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 155
    .line 156
    .line 157
    :cond_5
    return-void
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

.method public final b(LF0/d;La0/c;ILa0/p;)Landroid/media/AudioTrack;
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lj0/v;->p:Lj0/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lj0/w;->a(LF0/d;La0/c;I)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 p3, 0x1

    .line 12
    if-ne v1, p3, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    new-instance p2, Lj0/j;

    .line 19
    .line 20
    iget v3, p1, LF0/d;->c:I

    .line 21
    .line 22
    iget v4, p1, LF0/d;->a:I

    .line 23
    .line 24
    iget v2, p1, LF0/d;->b:I

    .line 25
    .line 26
    iget-boolean v6, p1, LF0/d;->e:Z

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v0, p2

    .line 30
    move-object v5, p4

    .line 31
    invoke-direct/range {v0 .. v7}, Lj0/j;-><init>(IIIILa0/p;ZLjava/lang/RuntimeException;)V

    .line 32
    .line 33
    .line 34
    throw p2

    .line 35
    :goto_0
    move-object v7, p2

    .line 36
    goto :goto_1

    .line 37
    :catch_1
    move-exception p2

    .line 38
    goto :goto_0

    .line 39
    :catch_2
    move-exception p2

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    new-instance p2, Lj0/j;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget v3, p1, LF0/d;->c:I

    .line 45
    .line 46
    iget v2, p1, LF0/d;->b:I

    .line 47
    .line 48
    iget v4, p1, LF0/d;->a:I

    .line 49
    .line 50
    iget-boolean v6, p1, LF0/d;->e:Z

    .line 51
    .line 52
    move-object v0, p2

    .line 53
    move-object v5, p4

    .line 54
    invoke-direct/range {v0 .. v7}, Lj0/j;-><init>(IIIILa0/p;ZLjava/lang/RuntimeException;)V

    .line 55
    .line 56
    .line 57
    throw p2
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

.method public final c(Lj0/p;)Landroid/media/AudioTrack;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lj0/p;->a()LF0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lj0/v;->z:La0/c;

    .line 6
    .line 7
    iget v2, p0, Lj0/v;->X:I

    .line 8
    .line 9
    iget-object p1, p1, Lj0/p;->a:La0/p;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2, p1}, Lj0/v;->b(LF0/d;La0/c;ILa0/p;)Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Lj0/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object v0, p0, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/lifecycle/E;->G(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p1
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

.method public final d(La0/p;[I)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lj0/v;->q()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, La0/p;->n:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "audio/raw"

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v4, v1, Lj0/v;->i:Z

    .line 17
    .line 18
    const/4 v5, -0x1

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    iget-object v8, v3, La0/p;->n:Ljava/lang/String;

    .line 22
    .line 23
    iget v9, v3, La0/p;->D:I

    .line 24
    .line 25
    iget v10, v3, La0/p;->C:I

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget v0, v3, La0/p;->E:I

    .line 30
    .line 31
    invoke-static {v0}, Ld0/w;->H(I)Z

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    invoke-static {v11}, Ld0/m;->c(Z)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v10}, Ld0/w;->A(II)I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    new-instance v12, Lm2/F;

    .line 43
    .line 44
    const/4 v13, 0x4

    .line 45
    invoke-direct {v12, v13}, Lm2/C;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iget-object v13, v1, Lj0/v;->e:Lm2/b0;

    .line 49
    .line 50
    invoke-virtual {v12, v13}, Lm2/C;->d(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    iget-object v13, v1, Lj0/v;->b:LZ1/s;

    .line 54
    .line 55
    iget-object v13, v13, LZ1/s;->m:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v13, [Lb0/d;

    .line 58
    .line 59
    array-length v14, v13

    .line 60
    invoke-static {v14, v13}, Lm2/r;->c(I[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v12, v14}, Lm2/C;->e(I)V

    .line 64
    .line 65
    .line 66
    iget-object v15, v12, Lm2/C;->a:[Ljava/lang/Object;

    .line 67
    .line 68
    iget v2, v12, Lm2/C;->b:I

    .line 69
    .line 70
    invoke-static {v13, v7, v15, v2, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    .line 72
    .line 73
    iget v2, v12, Lm2/C;->b:I

    .line 74
    .line 75
    add-int/2addr v2, v14

    .line 76
    iput v2, v12, Lm2/C;->b:I

    .line 77
    .line 78
    new-instance v2, Lb0/a;

    .line 79
    .line 80
    invoke-virtual {v12}, Lm2/F;->g()Lm2/b0;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-direct {v2, v12}, Lb0/a;-><init>(Lm2/b0;)V

    .line 85
    .line 86
    .line 87
    iget-object v12, v1, Lj0/v;->u:Lb0/a;

    .line 88
    .line 89
    invoke-virtual {v2, v12}, Lb0/a;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-eqz v12, :cond_0

    .line 94
    .line 95
    iget-object v2, v1, Lj0/v;->u:Lb0/a;

    .line 96
    .line 97
    :cond_0
    iget v12, v3, La0/p;->F:I

    .line 98
    .line 99
    iget-object v13, v1, Lj0/v;->d:Lj0/B;

    .line 100
    .line 101
    iput v12, v13, Lj0/B;->i:I

    .line 102
    .line 103
    iget v12, v3, La0/p;->G:I

    .line 104
    .line 105
    iput v12, v13, Lj0/B;->j:I

    .line 106
    .line 107
    iget-object v12, v1, Lj0/v;->c:Lj0/o;

    .line 108
    .line 109
    move-object/from16 v13, p2

    .line 110
    .line 111
    iput-object v13, v12, Lj0/o;->i:[I

    .line 112
    .line 113
    new-instance v12, Lb0/b;

    .line 114
    .line 115
    invoke-direct {v12, v9, v10, v0}, Lb0/b;-><init>(III)V

    .line 116
    .line 117
    .line 118
    :try_start_0
    invoke-virtual {v2, v12}, Lb0/a;->a(Lb0/b;)Lb0/b;

    .line 119
    .line 120
    .line 121
    move-result-object v0
    :try_end_0
    .catch Lb0/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    iget v9, v0, Lb0/b;->b:I

    .line 123
    .line 124
    invoke-static {v9}, Ld0/w;->r(I)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    iget v12, v0, Lb0/b;->c:I

    .line 129
    .line 130
    invoke-static {v12, v9}, Ld0/w;->A(II)I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    iget v0, v0, Lb0/b;->a:I

    .line 135
    .line 136
    move-object v13, v2

    .line 137
    move v14, v4

    .line 138
    move v15, v7

    .line 139
    move v4, v11

    .line 140
    move v11, v10

    .line 141
    move v10, v0

    .line 142
    move v0, v15

    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :catch_0
    move-exception v0

    .line 146
    move-object v2, v0

    .line 147
    new-instance v0, Lj0/i;

    .line 148
    .line 149
    invoke-direct {v0, v2, v3}, Lj0/i;-><init>(Lb0/c;La0/p;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_1
    new-instance v0, Lb0/a;

    .line 154
    .line 155
    sget-object v2, Lm2/b0;->p:Lm2/b0;

    .line 156
    .line 157
    invoke-direct {v0, v2}, Lb0/a;-><init>(Lm2/b0;)V

    .line 158
    .line 159
    .line 160
    iget v2, v1, Lj0/v;->j:I

    .line 161
    .line 162
    if-eqz v2, :cond_2

    .line 163
    .line 164
    invoke-virtual/range {p0 .. p1}, Lj0/v;->h(La0/p;)Lj0/e;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_0

    .line 169
    :cond_2
    sget-object v2, Lj0/e;->d:Lj0/e;

    .line 170
    .line 171
    :goto_0
    iget v11, v1, Lj0/v;->j:I

    .line 172
    .line 173
    if-eqz v11, :cond_3

    .line 174
    .line 175
    iget-boolean v11, v2, Lj0/e;->a:Z

    .line 176
    .line 177
    if-eqz v11, :cond_3

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v4, v3, La0/p;->k:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v8, v4}, La0/G;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-static {v10}, Ld0/w;->r(I)I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    iget-boolean v2, v2, Lj0/e;->b:Z

    .line 193
    .line 194
    move-object v13, v0

    .line 195
    move v15, v2

    .line 196
    move v12, v4

    .line 197
    move v4, v5

    .line 198
    move v0, v6

    .line 199
    move v14, v0

    .line 200
    move v11, v10

    .line 201
    :goto_1
    move v10, v9

    .line 202
    move v9, v4

    .line 203
    goto :goto_2

    .line 204
    :cond_3
    iget-object v2, v1, Lj0/v;->w:Lj0/b;

    .line 205
    .line 206
    iget-object v10, v1, Lj0/v;->z:La0/c;

    .line 207
    .line 208
    invoke-virtual {v2, v10, v3}, Lj0/b;->d(La0/c;La0/p;)Landroid/util/Pair;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-eqz v2, :cond_18

    .line 213
    .line 214
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v10, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v2, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    move-object v13, v0

    .line 231
    move v11, v2

    .line 232
    move v14, v4

    .line 233
    move v4, v5

    .line 234
    move v15, v7

    .line 235
    move v12, v10

    .line 236
    const/4 v0, 0x2

    .line 237
    goto :goto_1

    .line 238
    :goto_2
    const-string v2, ") for: "

    .line 239
    .line 240
    if-eqz v12, :cond_17

    .line 241
    .line 242
    if-eqz v11, :cond_16

    .line 243
    .line 244
    const-string v2, "audio/vnd.dts.hd;profile=lbr"

    .line 245
    .line 246
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    iget v8, v3, La0/p;->j:I

    .line 251
    .line 252
    if-eqz v2, :cond_4

    .line 253
    .line 254
    if-ne v8, v5, :cond_4

    .line 255
    .line 256
    const v8, 0xbb800

    .line 257
    .line 258
    .line 259
    :cond_4
    invoke-static {v10, v11, v12}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    const/4 v7, -0x2

    .line 264
    if-eq v2, v7, :cond_5

    .line 265
    .line 266
    move v7, v6

    .line 267
    goto :goto_3

    .line 268
    :cond_5
    const/4 v7, 0x0

    .line 269
    :goto_3
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 270
    .line 271
    .line 272
    if-eq v9, v5, :cond_6

    .line 273
    .line 274
    move v7, v9

    .line 275
    goto :goto_4

    .line 276
    :cond_6
    move v7, v6

    .line 277
    :goto_4
    if-eqz v14, :cond_7

    .line 278
    .line 279
    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_7
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 283
    .line 284
    :goto_5
    iget-object v5, v1, Lj0/v;->n:Lj0/w;

    .line 285
    .line 286
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    const-wide/32 v20, 0xf4240

    .line 290
    .line 291
    .line 292
    if-eqz v0, :cond_14

    .line 293
    .line 294
    if-eq v0, v6, :cond_13

    .line 295
    .line 296
    const/4 v5, 0x2

    .line 297
    if-ne v0, v5, :cond_12

    .line 298
    .line 299
    const/4 v5, 0x5

    .line 300
    const/16 v6, 0x8

    .line 301
    .line 302
    if-ne v12, v5, :cond_8

    .line 303
    .line 304
    const v5, 0x7a120

    .line 305
    .line 306
    .line 307
    :goto_6
    const/4 v6, -0x1

    .line 308
    goto :goto_7

    .line 309
    :cond_8
    if-ne v12, v6, :cond_9

    .line 310
    .line 311
    const v5, 0xf4240

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_9
    const v5, 0x3d090

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :goto_7
    if-eq v8, v6, :cond_11

    .line 320
    .line 321
    sget-object v6, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    div-int/lit8 v22, v8, 0x8

    .line 327
    .line 328
    const/16 v19, 0x8

    .line 329
    .line 330
    mul-int v23, v19, v22

    .line 331
    .line 332
    sub-int v23, v8, v23

    .line 333
    .line 334
    if-nez v23, :cond_a

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_a
    xor-int/lit8 v8, v8, 0x8

    .line 338
    .line 339
    shr-int/lit8 v8, v8, 0x1f

    .line 340
    .line 341
    const/16 v16, 0x1

    .line 342
    .line 343
    or-int/lit8 v8, v8, 0x1

    .line 344
    .line 345
    sget-object v24, Lo2/d;->a:[I

    .line 346
    .line 347
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 348
    .line 349
    .line 350
    move-result v25

    .line 351
    aget v24, v24, v25

    .line 352
    .line 353
    packed-switch v24, :pswitch_data_0

    .line 354
    .line 355
    .line 356
    new-instance v0, Ljava/lang/AssertionError;

    .line 357
    .line 358
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :pswitch_0
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(I)I

    .line 363
    .line 364
    .line 365
    move-result v23

    .line 366
    const/16 v19, 0x8

    .line 367
    .line 368
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    .line 369
    .line 370
    .line 371
    move-result v19

    .line 372
    sub-int v19, v19, v23

    .line 373
    .line 374
    sub-int v23, v23, v19

    .line 375
    .line 376
    if-nez v23, :cond_d

    .line 377
    .line 378
    sget-object v3, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 379
    .line 380
    if-eq v6, v3, :cond_e

    .line 381
    .line 382
    sget-object v3, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 383
    .line 384
    if-ne v6, v3, :cond_b

    .line 385
    .line 386
    const/4 v3, 0x1

    .line 387
    goto :goto_8

    .line 388
    :cond_b
    const/4 v3, 0x0

    .line 389
    :goto_8
    and-int/lit8 v6, v22, 0x1

    .line 390
    .line 391
    if-eqz v6, :cond_c

    .line 392
    .line 393
    const/4 v6, 0x1

    .line 394
    goto :goto_9

    .line 395
    :cond_c
    const/4 v6, 0x0

    .line 396
    :goto_9
    and-int/2addr v3, v6

    .line 397
    if-eqz v3, :cond_f

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_d
    if-lez v23, :cond_f

    .line 401
    .line 402
    goto :goto_a

    .line 403
    :pswitch_1
    if-lez v8, :cond_f

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :pswitch_2
    if-gez v8, :cond_f

    .line 407
    .line 408
    :cond_e
    :goto_a
    :pswitch_3
    add-int v22, v22, v8

    .line 409
    .line 410
    goto :goto_b

    .line 411
    :pswitch_4
    if-nez v23, :cond_10

    .line 412
    .line 413
    :cond_f
    :goto_b
    :pswitch_5
    move/from16 v3, v22

    .line 414
    .line 415
    goto :goto_c

    .line 416
    :cond_10
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 417
    .line 418
    const-string v2, "mode was UNNECESSARY, but rounding was necessary"

    .line 419
    .line 420
    invoke-direct {v0, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v0

    .line 424
    :cond_11
    invoke-static {v12}, Lj0/w;->c(I)I

    .line 425
    .line 426
    .line 427
    move-result v22

    .line 428
    goto :goto_b

    .line 429
    :goto_c
    int-to-long v5, v5

    .line 430
    move/from16 v19, v14

    .line 431
    .line 432
    move/from16 v22, v15

    .line 433
    .line 434
    int-to-long v14, v3

    .line 435
    mul-long/2addr v5, v14

    .line 436
    div-long v5, v5, v20

    .line 437
    .line 438
    invoke-static {v5, v6}, LQ1/C;->g(J)I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    :goto_d
    move v8, v10

    .line 443
    move/from16 v24, v11

    .line 444
    .line 445
    move/from16 p2, v12

    .line 446
    .line 447
    move-object/from16 v23, v13

    .line 448
    .line 449
    goto :goto_e

    .line 450
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 451
    .line 452
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 453
    .line 454
    .line 455
    throw v0

    .line 456
    :cond_13
    move/from16 v19, v14

    .line 457
    .line 458
    move/from16 v22, v15

    .line 459
    .line 460
    invoke-static {v12}, Lj0/w;->c(I)I

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    const v5, 0x2faf080

    .line 465
    .line 466
    .line 467
    int-to-long v5, v5

    .line 468
    int-to-long v14, v3

    .line 469
    mul-long/2addr v5, v14

    .line 470
    div-long v5, v5, v20

    .line 471
    .line 472
    invoke-static {v5, v6}, LQ1/C;->g(J)I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    goto :goto_d

    .line 477
    :cond_14
    move/from16 v19, v14

    .line 478
    .line 479
    move/from16 v22, v15

    .line 480
    .line 481
    mul-int/lit8 v3, v2, 0x4

    .line 482
    .line 483
    const v5, 0x3d090

    .line 484
    .line 485
    .line 486
    int-to-long v5, v5

    .line 487
    int-to-long v14, v10

    .line 488
    mul-long/2addr v5, v14

    .line 489
    move/from16 p2, v12

    .line 490
    .line 491
    move-object/from16 v23, v13

    .line 492
    .line 493
    int-to-long v12, v7

    .line 494
    mul-long/2addr v5, v12

    .line 495
    div-long v5, v5, v20

    .line 496
    .line 497
    invoke-static {v5, v6}, LQ1/C;->g(J)I

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    const v6, 0xb71b0

    .line 502
    .line 503
    .line 504
    move v8, v10

    .line 505
    move/from16 v24, v11

    .line 506
    .line 507
    int-to-long v10, v6

    .line 508
    mul-long/2addr v10, v14

    .line 509
    mul-long/2addr v10, v12

    .line 510
    div-long v10, v10, v20

    .line 511
    .line 512
    invoke-static {v10, v11}, LQ1/C;->g(J)I

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    invoke-static {v3, v5, v6}, Ld0/w;->i(III)I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    :goto_e
    int-to-double v5, v3

    .line 521
    mul-double v5, v5, v17

    .line 522
    .line 523
    double-to-int v3, v5

    .line 524
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    add-int/2addr v2, v7

    .line 529
    const/4 v3, 0x1

    .line 530
    sub-int/2addr v2, v3

    .line 531
    div-int/2addr v2, v7

    .line 532
    mul-int v10, v2, v7

    .line 533
    .line 534
    const/4 v2, 0x0

    .line 535
    iput-boolean v2, v1, Lj0/v;->d0:Z

    .line 536
    .line 537
    new-instance v15, Lj0/p;

    .line 538
    .line 539
    iget-boolean v14, v1, Lj0/v;->a0:Z

    .line 540
    .line 541
    move-object v2, v15

    .line 542
    move-object/from16 v3, p1

    .line 543
    .line 544
    move v5, v0

    .line 545
    move v6, v9

    .line 546
    move v7, v8

    .line 547
    move/from16 v8, v24

    .line 548
    .line 549
    move/from16 v9, p2

    .line 550
    .line 551
    move-object/from16 v11, v23

    .line 552
    .line 553
    move/from16 v12, v19

    .line 554
    .line 555
    move/from16 v13, v22

    .line 556
    .line 557
    invoke-direct/range {v2 .. v14}, Lj0/p;-><init>(La0/p;IIIIIIILb0/a;ZZZ)V

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {p0 .. p0}, Lj0/v;->o()Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_15

    .line 565
    .line 566
    iput-object v15, v1, Lj0/v;->s:Lj0/p;

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :cond_15
    iput-object v15, v1, Lj0/v;->t:Lj0/p;

    .line 570
    .line 571
    :goto_f
    return-void

    .line 572
    :cond_16
    new-instance v3, Lj0/i;

    .line 573
    .line 574
    new-instance v4, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    const-string v5, "Invalid output channel config (mode="

    .line 577
    .line 578
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    move-object/from16 v5, p1

    .line 588
    .line 589
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-direct {v3, v0, v5}, Lj0/i;-><init>(Ljava/lang/String;La0/p;)V

    .line 597
    .line 598
    .line 599
    throw v3

    .line 600
    :cond_17
    move-object v5, v3

    .line 601
    new-instance v3, Lj0/i;

    .line 602
    .line 603
    new-instance v4, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const-string v6, "Invalid output encoding (mode="

    .line 606
    .line 607
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-direct {v3, v0, v5}, Lj0/i;-><init>(Ljava/lang/String;La0/p;)V

    .line 624
    .line 625
    .line 626
    throw v3

    .line 627
    :cond_18
    move-object v5, v3

    .line 628
    new-instance v0, Lj0/i;

    .line 629
    .line 630
    new-instance v2, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    const-string v3, "Unable to configure passthrough for: "

    .line 633
    .line 634
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-direct {v0, v2, v5}, Lj0/i;-><init>(Ljava/lang/String;La0/p;)V

    .line 645
    .line 646
    .line 647
    throw v0

    .line 648
    nop

    .line 649
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final e(J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lj0/v;->m:Lj0/s;

    .line 7
    .line 8
    iget-object v1, v0, Lj0/s;->a:Ljava/lang/Exception;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    sget-object v1, Lj0/v;->j0:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    sget v4, Lj0/v;->l0:I

    .line 19
    .line 20
    if-lez v4, :cond_2

    .line 21
    .line 22
    move v4, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move v4, v2

    .line 25
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz v4, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    iget-wide v6, v0, Lj0/s;->c:J

    .line 34
    .line 35
    cmp-long v1, v4, v6

    .line 36
    .line 37
    if-gez v1, :cond_4

    .line 38
    .line 39
    :goto_1
    return-void

    .line 40
    :cond_4
    :goto_2
    iget-object v1, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-boolean v4, p0, Lj0/v;->a0:Z

    .line 47
    .line 48
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    if-eqz v4, :cond_d

    .line 54
    .line 55
    cmp-long v4, p1, v10

    .line 56
    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    move v4, v3

    .line 60
    goto :goto_3

    .line 61
    :cond_5
    move v4, v2

    .line 62
    :goto_3
    invoke-static {v4}, Ld0/m;->h(Z)V

    .line 63
    .line 64
    .line 65
    const-wide/high16 v4, -0x8000000000000000L

    .line 66
    .line 67
    cmp-long v4, p1, v4

    .line 68
    .line 69
    if-nez v4, :cond_6

    .line 70
    .line 71
    iget-wide p1, p0, Lj0/v;->b0:J

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    iput-wide p1, p0, Lj0/v;->b0:J

    .line 75
    .line 76
    :goto_4
    iget-object v4, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 77
    .line 78
    iget-object v5, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    sget v6, Ld0/w;->a:I

    .line 81
    .line 82
    const/16 v7, 0x1a

    .line 83
    .line 84
    const-wide/16 v8, 0x3e8

    .line 85
    .line 86
    if-lt v6, v7, :cond_7

    .line 87
    .line 88
    const/4 v7, 0x1

    .line 89
    mul-long/2addr v8, p1

    .line 90
    move v6, v1

    .line 91
    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_5

    .line 96
    :cond_7
    iget-object v6, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    if-nez v6, :cond_8

    .line 99
    .line 100
    const/16 v6, 0x10

    .line 101
    .line 102
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iput-object v6, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 109
    .line 110
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    iget-object v6, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    const v7, 0x55550001

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    :cond_8
    iget v6, p0, Lj0/v;->F:I

    .line 122
    .line 123
    if-nez v6, :cond_9

    .line 124
    .line 125
    iget-object v6, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 126
    .line 127
    const/4 v7, 0x4

    .line 128
    invoke-virtual {v6, v7, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    iget-object v6, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 132
    .line 133
    const/16 v7, 0x8

    .line 134
    .line 135
    mul-long/2addr p1, v8

    .line 136
    invoke-virtual {v6, v7, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 142
    .line 143
    .line 144
    iput v1, p0, Lj0/v;->F:I

    .line 145
    .line 146
    :cond_9
    iget-object p1, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-lez p1, :cond_b

    .line 153
    .line 154
    iget-object p2, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    invoke-virtual {v4, p2, p1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-gez p2, :cond_a

    .line 161
    .line 162
    iput v2, p0, Lj0/v;->F:I

    .line 163
    .line 164
    move p1, p2

    .line 165
    goto :goto_5

    .line 166
    :cond_a
    if-ge p2, p1, :cond_b

    .line 167
    .line 168
    move p1, v2

    .line 169
    goto :goto_5

    .line 170
    :cond_b
    invoke-virtual {v4, v5, v1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-gez p1, :cond_c

    .line 175
    .line 176
    iput v2, p0, Lj0/v;->F:I

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_c
    iget p2, p0, Lj0/v;->F:I

    .line 180
    .line 181
    sub-int/2addr p2, p1

    .line 182
    iput p2, p0, Lj0/v;->F:I

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_d
    iget-object p1, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 186
    .line 187
    iget-object p2, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    invoke-virtual {p1, p2, v1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    :goto_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 194
    .line 195
    .line 196
    move-result-wide v4

    .line 197
    iput-wide v4, p0, Lj0/v;->c0:J

    .line 198
    .line 199
    const-wide/16 v4, 0x0

    .line 200
    .line 201
    if-gez p1, :cond_15

    .line 202
    .line 203
    sget p2, Ld0/w;->a:I

    .line 204
    .line 205
    const/16 v1, 0x18

    .line 206
    .line 207
    if-lt p2, v1, :cond_e

    .line 208
    .line 209
    const/4 p2, -0x6

    .line 210
    if-eq p1, p2, :cond_f

    .line 211
    .line 212
    :cond_e
    const/16 p2, -0x20

    .line 213
    .line 214
    if-ne p1, p2, :cond_12

    .line 215
    .line 216
    :cond_f
    invoke-virtual {p0}, Lj0/v;->k()J

    .line 217
    .line 218
    .line 219
    move-result-wide v6

    .line 220
    cmp-long p2, v6, v4

    .line 221
    .line 222
    if-lez p2, :cond_11

    .line 223
    .line 224
    :cond_10
    :goto_6
    move v2, v3

    .line 225
    goto :goto_7

    .line 226
    :cond_11
    iget-object p2, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 227
    .line 228
    invoke-static {p2}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    if-eqz p2, :cond_12

    .line 233
    .line 234
    iget-object p2, p0, Lj0/v;->t:Lj0/p;

    .line 235
    .line 236
    iget p2, p2, Lj0/p;->c:I

    .line 237
    .line 238
    if-ne p2, v3, :cond_10

    .line 239
    .line 240
    iput-boolean v3, p0, Lj0/v;->d0:Z

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_12
    :goto_7
    new-instance p2, Lj0/k;

    .line 244
    .line 245
    iget-object v1, p0, Lj0/v;->t:Lj0/p;

    .line 246
    .line 247
    iget-object v1, v1, Lj0/p;->a:La0/p;

    .line 248
    .line 249
    invoke-direct {p2, p1, v1, v2}, Lj0/k;-><init>(ILa0/p;Z)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 253
    .line 254
    if-eqz p1, :cond_13

    .line 255
    .line 256
    invoke-virtual {p1, p2}, Landroidx/lifecycle/E;->G(Ljava/lang/Exception;)V

    .line 257
    .line 258
    .line 259
    :cond_13
    iget-boolean p1, p2, Lj0/k;->m:Z

    .line 260
    .line 261
    if-nez p1, :cond_14

    .line 262
    .line 263
    invoke-virtual {v0, p2}, Lj0/s;->a(Ljava/lang/Exception;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_14
    sget-object p1, Lj0/b;->c:Lj0/b;

    .line 268
    .line 269
    iput-object p1, p0, Lj0/v;->w:Lj0/b;

    .line 270
    .line 271
    throw p2

    .line 272
    :cond_15
    const/4 p2, 0x0

    .line 273
    iput-object p2, v0, Lj0/s;->a:Ljava/lang/Exception;

    .line 274
    .line 275
    iput-wide v10, v0, Lj0/s;->b:J

    .line 276
    .line 277
    iput-wide v10, v0, Lj0/s;->c:J

    .line 278
    .line 279
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 280
    .line 281
    invoke-static {v0}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_17

    .line 286
    .line 287
    iget-wide v6, p0, Lj0/v;->J:J

    .line 288
    .line 289
    cmp-long v0, v6, v4

    .line 290
    .line 291
    if-lez v0, :cond_16

    .line 292
    .line 293
    iput-boolean v2, p0, Lj0/v;->e0:Z

    .line 294
    .line 295
    :cond_16
    iget-boolean v0, p0, Lj0/v;->V:Z

    .line 296
    .line 297
    if-eqz v0, :cond_17

    .line 298
    .line 299
    iget-object v0, p0, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 300
    .line 301
    if-eqz v0, :cond_17

    .line 302
    .line 303
    if-ge p1, v1, :cond_17

    .line 304
    .line 305
    iget-boolean v4, p0, Lj0/v;->e0:Z

    .line 306
    .line 307
    if-nez v4, :cond_17

    .line 308
    .line 309
    iget-object v0, v0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lj0/x;

    .line 312
    .line 313
    iget-object v0, v0, Lq0/r;->Q:Lh0/H;

    .line 314
    .line 315
    if-eqz v0, :cond_17

    .line 316
    .line 317
    iget-object v0, v0, Lh0/H;->a:Lh0/N;

    .line 318
    .line 319
    iput-boolean v3, v0, Lh0/N;->W:Z

    .line 320
    .line 321
    :cond_17
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 322
    .line 323
    iget v0, v0, Lj0/p;->c:I

    .line 324
    .line 325
    if-nez v0, :cond_18

    .line 326
    .line 327
    iget-wide v4, p0, Lj0/v;->I:J

    .line 328
    .line 329
    int-to-long v6, p1

    .line 330
    add-long/2addr v4, v6

    .line 331
    iput-wide v4, p0, Lj0/v;->I:J

    .line 332
    .line 333
    :cond_18
    if-ne p1, v1, :cond_1b

    .line 334
    .line 335
    if-eqz v0, :cond_1a

    .line 336
    .line 337
    iget-object p1, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 338
    .line 339
    iget-object v0, p0, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    if-ne p1, v0, :cond_19

    .line 342
    .line 343
    move v2, v3

    .line 344
    :cond_19
    invoke-static {v2}, Ld0/m;->h(Z)V

    .line 345
    .line 346
    .line 347
    iget-wide v0, p0, Lj0/v;->J:J

    .line 348
    .line 349
    iget p1, p0, Lj0/v;->K:I

    .line 350
    .line 351
    int-to-long v2, p1

    .line 352
    iget p1, p0, Lj0/v;->Q:I

    .line 353
    .line 354
    int-to-long v4, p1

    .line 355
    mul-long/2addr v2, v4

    .line 356
    add-long/2addr v2, v0

    .line 357
    iput-wide v2, p0, Lj0/v;->J:J

    .line 358
    .line 359
    :cond_1a
    iput-object p2, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 360
    .line 361
    :cond_1b
    return-void

    .line 362
    :catchall_0
    move-exception p1

    .line 363
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 364
    throw p1
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

.method public final f()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb0/a;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, Lj0/v;->e(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move v3, v4

    .line 21
    :cond_0
    return v3

    .line 22
    :cond_1
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 23
    .line 24
    invoke-virtual {v0}, Lb0/a;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_3

    .line 29
    .line 30
    iget-boolean v5, v0, Lb0/a;->d:Z

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iput-boolean v4, v0, Lb0/a;->d:Z

    .line 36
    .line 37
    iget-object v0, v0, Lb0/a;->b:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lb0/d;

    .line 44
    .line 45
    invoke-interface {v0}, Lb0/d;->c()V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    invoke-virtual {p0, v1, v2}, Lj0/v;->t(J)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 52
    .line 53
    invoke-virtual {v0}, Lb0/a;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object v0, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    :cond_4
    move v3, v4

    .line 70
    :cond_5
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

.method public final g()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lj0/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iput-wide v1, p0, Lj0/v;->G:J

    .line 11
    .line 12
    iput-wide v1, p0, Lj0/v;->H:J

    .line 13
    .line 14
    iput-wide v1, p0, Lj0/v;->I:J

    .line 15
    .line 16
    iput-wide v1, p0, Lj0/v;->J:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lj0/v;->e0:Z

    .line 20
    .line 21
    iput v0, p0, Lj0/v;->K:I

    .line 22
    .line 23
    new-instance v10, Lj0/q;

    .line 24
    .line 25
    iget-object v5, p0, Lj0/v;->C:La0/J;

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    move-object v4, v10

    .line 32
    invoke-direct/range {v4 .. v9}, Lj0/q;-><init>(La0/J;JJ)V

    .line 33
    .line 34
    .line 35
    iput-object v10, p0, Lj0/v;->B:Lj0/q;

    .line 36
    .line 37
    iput-wide v1, p0, Lj0/v;->N:J

    .line 38
    .line 39
    iput-object v3, p0, Lj0/v;->A:Lj0/q;

    .line 40
    .line 41
    iget-object v4, p0, Lj0/v;->h:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    iput-object v3, p0, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    iput v0, p0, Lj0/v;->Q:I

    .line 49
    .line 50
    iput-object v3, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    iput-boolean v0, p0, Lj0/v;->T:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Lj0/v;->S:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lj0/v;->U:Z

    .line 57
    .line 58
    iput-object v3, p0, Lj0/v;->E:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    iput v0, p0, Lj0/v;->F:I

    .line 61
    .line 62
    iget-object v0, p0, Lj0/v;->d:Lj0/B;

    .line 63
    .line 64
    iput-wide v1, v0, Lj0/B;->o:J

    .line 65
    .line 66
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 67
    .line 68
    iget-object v0, v0, Lj0/p;->i:Lb0/a;

    .line 69
    .line 70
    iput-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 71
    .line 72
    invoke-virtual {v0}, Lb0/a;->b()V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lj0/v;->g:Lj0/n;

    .line 76
    .line 77
    iget-object v0, v0, Lj0/n;->c:Landroid/media/AudioTrack;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/4 v4, 0x3

    .line 87
    if-ne v0, v4, :cond_0

    .line 88
    .line 89
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 92
    .line 93
    .line 94
    :cond_0
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 95
    .line 96
    invoke-static {v0}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    iget-object v0, p0, Lj0/v;->k:LZ1/s;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v4, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 108
    .line 109
    iget-object v5, v0, LZ1/s;->n:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, Lj0/u;

    .line 112
    .line 113
    invoke-static {v4, v5}, Lio/flutter/plugin/platform/n;->q(Landroid/media/AudioTrack;Lj0/u;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v0, LZ1/s;->m:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Landroid/os/Handler;

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 124
    .line 125
    invoke-virtual {v0}, Lj0/p;->a()LF0/d;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    iget-object v0, p0, Lj0/v;->s:Lj0/p;

    .line 130
    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    iput-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 134
    .line 135
    iput-object v3, p0, Lj0/v;->s:Lj0/p;

    .line 136
    .line 137
    :cond_2
    iget-object v0, p0, Lj0/v;->g:Lj0/n;

    .line 138
    .line 139
    invoke-virtual {v0}, Lj0/n;->d()V

    .line 140
    .line 141
    .line 142
    iput-object v3, v0, Lj0/n;->c:Landroid/media/AudioTrack;

    .line 143
    .line 144
    iput-object v3, v0, Lj0/n;->e:Lj0/m;

    .line 145
    .line 146
    sget v0, Ld0/w;->a:I

    .line 147
    .line 148
    const/16 v4, 0x18

    .line 149
    .line 150
    if-lt v0, v4, :cond_3

    .line 151
    .line 152
    iget-object v0, p0, Lj0/v;->y:LZ1/m;

    .line 153
    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    iget-object v4, v0, LZ1/m;->o:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Lj0/r;

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v5, v0, LZ1/m;->m:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v5, Landroid/media/AudioTrack;

    .line 166
    .line 167
    invoke-virtual {v5, v4}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 168
    .line 169
    .line 170
    iput-object v3, v0, LZ1/m;->o:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v3, p0, Lj0/v;->y:LZ1/m;

    .line 173
    .line 174
    :cond_3
    iget-object v5, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 175
    .line 176
    iget-object v6, p0, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 177
    .line 178
    new-instance v7, Landroid/os/Handler;

    .line 179
    .line 180
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lj0/v;->j0:Ljava/lang/Object;

    .line 188
    .line 189
    monitor-enter v0

    .line 190
    :try_start_0
    sget-object v4, Lj0/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 191
    .line 192
    if-nez v4, :cond_4

    .line 193
    .line 194
    new-instance v4, Ld0/v;

    .line 195
    .line 196
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-static {v4}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    sput-object v4, Lj0/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :catchall_0
    move-exception v1

    .line 207
    goto :goto_1

    .line 208
    :cond_4
    :goto_0
    sget v4, Lj0/v;->l0:I

    .line 209
    .line 210
    add-int/lit8 v4, v4, 0x1

    .line 211
    .line 212
    sput v4, Lj0/v;->l0:I

    .line 213
    .line 214
    sget-object v10, Lj0/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 215
    .line 216
    new-instance v11, LP2/b;

    .line 217
    .line 218
    const/4 v9, 0x2

    .line 219
    move-object v4, v11

    .line 220
    invoke-direct/range {v4 .. v9}, LP2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 221
    .line 222
    .line 223
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 224
    .line 225
    const-wide/16 v5, 0x14

    .line 226
    .line 227
    invoke-interface {v10, v11, v5, v6, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 228
    .line 229
    .line 230
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    iput-object v3, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    throw v1

    .line 236
    :cond_5
    :goto_2
    iget-object v0, p0, Lj0/v;->m:Lj0/s;

    .line 237
    .line 238
    iput-object v3, v0, Lj0/s;->a:Ljava/lang/Exception;

    .line 239
    .line 240
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    iput-wide v4, v0, Lj0/s;->b:J

    .line 246
    .line 247
    iput-wide v4, v0, Lj0/s;->c:J

    .line 248
    .line 249
    iget-object v0, p0, Lj0/v;->l:Lj0/s;

    .line 250
    .line 251
    iput-object v3, v0, Lj0/s;->a:Ljava/lang/Exception;

    .line 252
    .line 253
    iput-wide v4, v0, Lj0/s;->b:J

    .line 254
    .line 255
    iput-wide v4, v0, Lj0/s;->c:J

    .line 256
    .line 257
    iput-wide v1, p0, Lj0/v;->g0:J

    .line 258
    .line 259
    iput-wide v1, p0, Lj0/v;->h0:J

    .line 260
    .line 261
    iget-object v0, p0, Lj0/v;->i0:Landroid/os/Handler;

    .line 262
    .line 263
    if-eqz v0, :cond_6

    .line 264
    .line 265
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_6
    return-void
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

.method public final h(La0/p;)Lj0/e;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lj0/v;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lj0/v;->z:La0/c;

    .line 9
    .line 10
    iget-object v1, p0, Lj0/v;->o:LZ1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget v2, Ld0/w;->a:I

    .line 22
    .line 23
    const/16 v3, 0x1d

    .line 24
    .line 25
    if-lt v2, v3, :cond_d

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    iget v4, p1, La0/p;->D:I

    .line 29
    .line 30
    if-ne v4, v3, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    iget-object v3, v1, LZ1/e;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Boolean;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget-object v3, v1, LZ1/e;->m:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Landroid/content/Context;

    .line 50
    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    const-string v7, "audio"

    .line 54
    .line 55
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Landroid/media/AudioManager;

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const-string v7, "offloadVariableRateSupported"

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    const-string v7, "offloadVariableRateSupported=1"

    .line 72
    .line 73
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    move v3, v6

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move v3, v5

    .line 82
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iput-object v3, v1, LZ1/e;->n:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v3, v1, LZ1/e;->n:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-object v3, v1, LZ1/e;->n:Ljava/lang/Object;

    .line 97
    .line 98
    :goto_1
    iget-object v1, v1, LZ1/e;->n:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :goto_2
    iget-object v3, p1, La0/p;->n:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v7, p1, La0/p;->k:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v3, v7}, La0/G;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_c

    .line 118
    .line 119
    invoke-static {v3}, Ld0/w;->p(I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-ge v2, v7, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    iget p1, p1, La0/p;->C:I

    .line 127
    .line 128
    invoke-static {p1}, Ld0/w;->r(I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_7

    .line 133
    .line 134
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :try_start_0
    invoke-static {v4, p1, v3}, Ld0/w;->q(III)Landroid/media/AudioFormat;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    const/16 v3, 0x1f

    .line 142
    .line 143
    if-lt v2, v3, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, La0/c;->a()LB0/d;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Landroid/media/AudioAttributes;

    .line 152
    .line 153
    invoke-static {p1, v0}, Li0/g;->b(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_8

    .line 158
    .line 159
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    new-instance v0, LZ0/d;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    const/16 v3, 0x20

    .line 168
    .line 169
    if-le v2, v3, :cond_9

    .line 170
    .line 171
    const/4 v2, 0x2

    .line 172
    if-ne p1, v2, :cond_9

    .line 173
    .line 174
    move v5, v6

    .line 175
    :cond_9
    iput-boolean v6, v0, LZ0/d;->a:Z

    .line 176
    .line 177
    iput-boolean v5, v0, LZ0/d;->b:Z

    .line 178
    .line 179
    iput-boolean v1, v0, LZ0/d;->c:Z

    .line 180
    .line 181
    invoke-virtual {v0}, LZ0/d;->a()Lj0/e;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto :goto_5

    .line 186
    :cond_a
    invoke-virtual {v0}, La0/c;->a()LB0/d;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Landroid/media/AudioAttributes;

    .line 193
    .line 194
    invoke-static {p1, v0}, Lio/flutter/plugin/platform/n;->A(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_b

    .line 199
    .line 200
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_b
    new-instance p1, LZ0/d;

    .line 204
    .line 205
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    iput-boolean v6, p1, LZ0/d;->a:Z

    .line 209
    .line 210
    iput-boolean v1, p1, LZ0/d;->c:Z

    .line 211
    .line 212
    invoke-virtual {p1}, LZ0/d;->a()Lj0/e;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    goto :goto_5

    .line 217
    :catch_0
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_c
    :goto_3
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_d
    :goto_4
    sget-object p1, Lj0/e;->d:Lj0/e;

    .line 224
    .line 225
    :goto_5
    return-object p1
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

.method public final i(La0/p;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj0/v;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La0/p;->n:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget p1, p1, La0/p;->E:I

    .line 17
    .line 18
    invoke-static {p1}, Ld0/w;->H(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "Invalid PCM encoding: "

    .line 25
    .line 26
    const-string v2, "DefaultAudioSink"

    .line 27
    .line 28
    invoke-static {p1, v0, v2}, Lb3/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    if-eq p1, v2, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    iget-object v0, p0, Lj0/v;->w:Lj0/b;

    .line 38
    .line 39
    iget-object v3, p0, Lj0/v;->z:La0/c;

    .line 40
    .line 41
    invoke-virtual {v0, v3, p1}, Lj0/b;->d(La0/c;La0/p;)Landroid/util/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    return v1
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

.method public final j()J
    .locals 5

    .line 1
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 2
    .line 3
    iget v1, v0, Lj0/p;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lj0/v;->G:J

    .line 8
    .line 9
    iget v0, v0, Lj0/p;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-wide v1, p0, Lj0/v;->H:J

    .line 15
    .line 16
    :goto_0
    return-wide v1
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

.method public final k()J
    .locals 7

    .line 1
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 2
    .line 3
    iget v1, v0, Lj0/p;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lj0/v;->I:J

    .line 8
    .line 9
    iget v0, v0, Lj0/p;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    sget v0, Ld0/w;->a:I

    .line 13
    .line 14
    add-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x1

    .line 16
    .line 17
    sub-long/2addr v1, v5

    .line 18
    div-long/2addr v1, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide v1, p0, Lj0/v;->J:J

    .line 21
    .line 22
    :goto_0
    return-wide v1
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

.method public final l(JLjava/nio/ByteBuffer;I)Z
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Ld0/m;->c(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lj0/v;->s:Lj0/p;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x3

    .line 28
    iget-object v10, v1, Lj0/v;->g:Lj0/n;

    .line 29
    .line 30
    if-eqz v5, :cond_7

    .line 31
    .line 32
    invoke-virtual/range {p0 .. p0}, Lj0/v;->f()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    return v7

    .line 39
    :cond_2
    iget-object v5, v1, Lj0/v;->s:Lj0/p;

    .line 40
    .line 41
    iget-object v11, v1, Lj0/v;->t:Lj0/p;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget v12, v11, Lj0/p;->c:I

    .line 47
    .line 48
    iget v13, v5, Lj0/p;->c:I

    .line 49
    .line 50
    if-ne v12, v13, :cond_4

    .line 51
    .line 52
    iget v12, v11, Lj0/p;->g:I

    .line 53
    .line 54
    iget v13, v5, Lj0/p;->g:I

    .line 55
    .line 56
    if-ne v12, v13, :cond_4

    .line 57
    .line 58
    iget v12, v11, Lj0/p;->e:I

    .line 59
    .line 60
    iget v13, v5, Lj0/p;->e:I

    .line 61
    .line 62
    if-ne v12, v13, :cond_4

    .line 63
    .line 64
    iget v12, v11, Lj0/p;->f:I

    .line 65
    .line 66
    iget v13, v5, Lj0/p;->f:I

    .line 67
    .line 68
    if-ne v12, v13, :cond_4

    .line 69
    .line 70
    iget v12, v11, Lj0/p;->d:I

    .line 71
    .line 72
    iget v13, v5, Lj0/p;->d:I

    .line 73
    .line 74
    if-ne v12, v13, :cond_4

    .line 75
    .line 76
    iget-boolean v12, v11, Lj0/p;->j:Z

    .line 77
    .line 78
    iget-boolean v13, v5, Lj0/p;->j:Z

    .line 79
    .line 80
    if-ne v12, v13, :cond_4

    .line 81
    .line 82
    iget-boolean v11, v11, Lj0/p;->k:Z

    .line 83
    .line 84
    iget-boolean v5, v5, Lj0/p;->k:Z

    .line 85
    .line 86
    if-ne v11, v5, :cond_4

    .line 87
    .line 88
    iget-object v5, v1, Lj0/v;->s:Lj0/p;

    .line 89
    .line 90
    iput-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 91
    .line 92
    iput-object v8, v1, Lj0/v;->s:Lj0/p;

    .line 93
    .line 94
    iget-object v5, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 95
    .line 96
    if-eqz v5, :cond_6

    .line 97
    .line 98
    invoke-static {v5}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    iget-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 105
    .line 106
    iget-boolean v5, v5, Lj0/p;->k:Z

    .line 107
    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    iget-object v5, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 111
    .line 112
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-ne v5, v9, :cond_3

    .line 117
    .line 118
    iget-object v5, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 119
    .line 120
    invoke-static {v5}, Lio/flutter/plugin/platform/n;->n(Landroid/media/AudioTrack;)V

    .line 121
    .line 122
    .line 123
    iput-boolean v6, v10, Lj0/n;->G:Z

    .line 124
    .line 125
    iget-object v5, v10, Lj0/n;->e:Lj0/m;

    .line 126
    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    iget-object v5, v5, Lj0/m;->a:Lj0/l;

    .line 130
    .line 131
    if-eqz v5, :cond_3

    .line 132
    .line 133
    iput-boolean v6, v5, Lj0/l;->f:Z

    .line 134
    .line 135
    :cond_3
    iget-object v5, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 136
    .line 137
    iget-object v11, v1, Lj0/v;->t:Lj0/p;

    .line 138
    .line 139
    iget-object v11, v11, Lj0/p;->a:La0/p;

    .line 140
    .line 141
    iget v12, v11, La0/p;->F:I

    .line 142
    .line 143
    iget v11, v11, La0/p;->G:I

    .line 144
    .line 145
    invoke-static {v5, v12, v11}, Lio/flutter/plugin/platform/n;->o(Landroid/media/AudioTrack;II)V

    .line 146
    .line 147
    .line 148
    iput-boolean v6, v1, Lj0/v;->e0:Z

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lj0/v;->s()V

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {p0 .. p0}, Lj0/v;->m()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_5

    .line 159
    .line 160
    return v7

    .line 161
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lj0/v;->g()V

    .line 162
    .line 163
    .line 164
    :cond_6
    :goto_2
    invoke-virtual/range {p0 .. p2}, Lj0/v;->a(J)V

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lj0/v;->o()Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    iget-object v11, v1, Lj0/v;->l:Lj0/s;

    .line 172
    .line 173
    if-nez v5, :cond_9

    .line 174
    .line 175
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lj0/v;->n()Z

    .line 176
    .line 177
    .line 178
    move-result v5
    :try_end_0
    .catch Lj0/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    if-nez v5, :cond_9

    .line 180
    .line 181
    return v7

    .line 182
    :catch_0
    move-exception v0

    .line 183
    move-object v2, v0

    .line 184
    iget-boolean v0, v2, Lj0/j;->m:Z

    .line 185
    .line 186
    if-nez v0, :cond_8

    .line 187
    .line 188
    invoke-virtual {v11, v2}, Lj0/s;->a(Ljava/lang/Exception;)V

    .line 189
    .line 190
    .line 191
    return v7

    .line 192
    :cond_8
    throw v2

    .line 193
    :cond_9
    iput-object v8, v11, Lj0/s;->a:Ljava/lang/Exception;

    .line 194
    .line 195
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    iput-wide v12, v11, Lj0/s;->b:J

    .line 201
    .line 202
    iput-wide v12, v11, Lj0/s;->c:J

    .line 203
    .line 204
    iget-boolean v5, v1, Lj0/v;->M:Z

    .line 205
    .line 206
    const-wide/16 v14, 0x0

    .line 207
    .line 208
    if-eqz v5, :cond_b

    .line 209
    .line 210
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v12

    .line 214
    iput-wide v12, v1, Lj0/v;->N:J

    .line 215
    .line 216
    iput-boolean v7, v1, Lj0/v;->L:Z

    .line 217
    .line 218
    iput-boolean v7, v1, Lj0/v;->M:Z

    .line 219
    .line 220
    invoke-virtual/range {p0 .. p0}, Lj0/v;->x()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_a

    .line 225
    .line 226
    invoke-virtual/range {p0 .. p0}, Lj0/v;->v()V

    .line 227
    .line 228
    .line 229
    :cond_a
    invoke-virtual/range {p0 .. p2}, Lj0/v;->a(J)V

    .line 230
    .line 231
    .line 232
    iget-boolean v5, v1, Lj0/v;->V:Z

    .line 233
    .line 234
    if-eqz v5, :cond_b

    .line 235
    .line 236
    invoke-virtual/range {p0 .. p0}, Lj0/v;->r()V

    .line 237
    .line 238
    .line 239
    :cond_b
    invoke-virtual/range {p0 .. p0}, Lj0/v;->k()J

    .line 240
    .line 241
    .line 242
    move-result-wide v11

    .line 243
    iget-object v5, v10, Lj0/n;->c:Landroid/media/AudioTrack;

    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    iget-boolean v13, v10, Lj0/n;->g:Z

    .line 253
    .line 254
    const/4 v8, 0x2

    .line 255
    if-eqz v13, :cond_d

    .line 256
    .line 257
    if-ne v5, v8, :cond_c

    .line 258
    .line 259
    iput-boolean v7, v10, Lj0/n;->o:Z

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_c
    if-ne v5, v6, :cond_d

    .line 263
    .line 264
    invoke-virtual {v10}, Lj0/n;->b()J

    .line 265
    .line 266
    .line 267
    move-result-wide v16

    .line 268
    cmp-long v13, v16, v14

    .line 269
    .line 270
    if-nez v13, :cond_d

    .line 271
    .line 272
    :goto_3
    return v7

    .line 273
    :cond_d
    iget-boolean v13, v10, Lj0/n;->o:Z

    .line 274
    .line 275
    invoke-virtual {v10, v11, v12}, Lj0/n;->c(J)Z

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    iput-boolean v11, v10, Lj0/n;->o:Z

    .line 280
    .line 281
    if-eqz v13, :cond_e

    .line 282
    .line 283
    if-nez v11, :cond_e

    .line 284
    .line 285
    if-eq v5, v6, :cond_e

    .line 286
    .line 287
    iget v5, v10, Lj0/n;->d:I

    .line 288
    .line 289
    iget-wide v11, v10, Lj0/n;->h:J

    .line 290
    .line 291
    invoke-static {v11, v12}, Ld0/w;->Z(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v19

    .line 295
    iget-object v11, v10, Lj0/n;->a:Landroidx/lifecycle/E;

    .line 296
    .line 297
    iget-object v11, v11, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v11, Lj0/v;

    .line 300
    .line 301
    iget-object v12, v11, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 302
    .line 303
    if-eqz v12, :cond_e

    .line 304
    .line 305
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 306
    .line 307
    .line 308
    move-result-wide v12

    .line 309
    iget-wide v14, v11, Lj0/v;->c0:J

    .line 310
    .line 311
    sub-long v21, v12, v14

    .line 312
    .line 313
    iget-object v11, v11, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 314
    .line 315
    iget-object v11, v11, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v11, Lj0/x;

    .line 318
    .line 319
    iget-object v11, v11, Lj0/x;->O0:LZ1/c;

    .line 320
    .line 321
    iget-object v12, v11, LZ1/c;->l:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v12, Landroid/os/Handler;

    .line 324
    .line 325
    if-eqz v12, :cond_e

    .line 326
    .line 327
    new-instance v13, Lj0/f;

    .line 328
    .line 329
    move-object/from16 v16, v13

    .line 330
    .line 331
    move-object/from16 v17, v11

    .line 332
    .line 333
    move/from16 v18, v5

    .line 334
    .line 335
    invoke-direct/range {v16 .. v22}, Lj0/f;-><init>(LZ1/c;IJJ)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 339
    .line 340
    .line 341
    :cond_e
    iget-object v5, v1, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 342
    .line 343
    if-nez v5, :cond_37

    .line 344
    .line 345
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 350
    .line 351
    if-ne v5, v11, :cond_f

    .line 352
    .line 353
    move v5, v6

    .line 354
    goto :goto_4

    .line 355
    :cond_f
    move v5, v7

    .line 356
    :goto_4
    invoke-static {v5}, Ld0/m;->c(Z)V

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-nez v5, :cond_10

    .line 364
    .line 365
    return v6

    .line 366
    :cond_10
    iget-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 367
    .line 368
    iget v11, v5, Lj0/p;->c:I

    .line 369
    .line 370
    if-eqz v11, :cond_2f

    .line 371
    .line 372
    iget v11, v1, Lj0/v;->K:I

    .line 373
    .line 374
    if-nez v11, :cond_2f

    .line 375
    .line 376
    const/16 v11, 0x14

    .line 377
    .line 378
    const/4 v12, 0x5

    .line 379
    iget v5, v5, Lj0/p;->g:I

    .line 380
    .line 381
    if-eq v5, v11, :cond_29

    .line 382
    .line 383
    const/16 v11, 0x1e

    .line 384
    .line 385
    const/4 v13, -0x2

    .line 386
    const/16 v14, 0x400

    .line 387
    .line 388
    const/4 v15, -0x1

    .line 389
    if-eq v5, v11, :cond_21

    .line 390
    .line 391
    const/16 v11, 0xa

    .line 392
    .line 393
    packed-switch v5, :pswitch_data_0

    .line 394
    .line 395
    .line 396
    const/16 v8, 0x10

    .line 397
    .line 398
    packed-switch v5, :pswitch_data_1

    .line 399
    .line 400
    .line 401
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 402
    .line 403
    const-string v2, "Unexpected audio encoding: "

    .line 404
    .line 405
    invoke-static {v2, v5}, Lb3/a;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :pswitch_0
    new-array v5, v8, [B

    .line 414
    .line 415
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 423
    .line 424
    .line 425
    new-instance v9, LF0/M;

    .line 426
    .line 427
    invoke-direct {v9, v8, v5}, LF0/M;-><init>(I[B)V

    .line 428
    .line 429
    .line 430
    invoke-static {v9}, LF0/b;->p(LF0/M;)LD0/e;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    iget v14, v5, LD0/e;->c:I

    .line 435
    .line 436
    goto/16 :goto_19

    .line 437
    .line 438
    :pswitch_1
    const/16 v14, 0x200

    .line 439
    .line 440
    goto/16 :goto_19

    .line 441
    .line 442
    :pswitch_2
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->limit()I

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    sub-int/2addr v9, v11

    .line 451
    move v11, v5

    .line 452
    :goto_5
    if-gt v11, v9, :cond_13

    .line 453
    .line 454
    add-int/lit8 v12, v11, 0x4

    .line 455
    .line 456
    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 457
    .line 458
    .line 459
    move-result v12

    .line 460
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 461
    .line 462
    .line 463
    move-result-object v14

    .line 464
    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 465
    .line 466
    if-ne v14, v7, :cond_11

    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_11
    invoke-static {v12}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 470
    .line 471
    .line 472
    move-result v12

    .line 473
    :goto_6
    and-int/lit8 v7, v12, -0x2

    .line 474
    .line 475
    const v12, -0x78d9046

    .line 476
    .line 477
    .line 478
    if-ne v7, v12, :cond_12

    .line 479
    .line 480
    sub-int/2addr v11, v5

    .line 481
    goto :goto_7

    .line 482
    :cond_12
    add-int/lit8 v11, v11, 0x1

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    goto :goto_5

    .line 486
    :cond_13
    move v11, v15

    .line 487
    :goto_7
    if-ne v11, v15, :cond_14

    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    goto/16 :goto_19

    .line 491
    .line 492
    :cond_14
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    add-int/2addr v5, v11

    .line 497
    add-int/lit8 v5, v5, 0x7

    .line 498
    .line 499
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    and-int/lit16 v5, v5, 0xff

    .line 504
    .line 505
    const/16 v7, 0xbb

    .line 506
    .line 507
    if-ne v5, v7, :cond_15

    .line 508
    .line 509
    move v5, v6

    .line 510
    goto :goto_8

    .line 511
    :cond_15
    const/4 v5, 0x0

    .line 512
    :goto_8
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    add-int/2addr v7, v11

    .line 517
    if-eqz v5, :cond_16

    .line 518
    .line 519
    const/16 v5, 0x9

    .line 520
    .line 521
    goto :goto_9

    .line 522
    :cond_16
    const/16 v5, 0x8

    .line 523
    .line 524
    :goto_9
    add-int/2addr v7, v5

    .line 525
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    shr-int/lit8 v5, v5, 0x4

    .line 530
    .line 531
    and-int/lit8 v5, v5, 0x7

    .line 532
    .line 533
    const/16 v7, 0x28

    .line 534
    .line 535
    shl-int v5, v7, v5

    .line 536
    .line 537
    mul-int/2addr v5, v8

    .line 538
    :goto_a
    move v14, v5

    .line 539
    goto/16 :goto_19

    .line 540
    .line 541
    :pswitch_3
    const/16 v14, 0x800

    .line 542
    .line 543
    goto/16 :goto_19

    .line 544
    .line 545
    :pswitch_4
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 554
    .line 555
    .line 556
    move-result-object v7

    .line 557
    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 558
    .line 559
    if-ne v7, v12, :cond_17

    .line 560
    .line 561
    goto :goto_b

    .line 562
    :cond_17
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    :goto_b
    const/high16 v7, -0x200000

    .line 567
    .line 568
    and-int v12, v5, v7

    .line 569
    .line 570
    if-ne v12, v7, :cond_18

    .line 571
    .line 572
    ushr-int/lit8 v7, v5, 0x13

    .line 573
    .line 574
    and-int/2addr v7, v9

    .line 575
    if-ne v7, v6, :cond_19

    .line 576
    .line 577
    :cond_18
    :goto_c
    move v14, v15

    .line 578
    goto :goto_e

    .line 579
    :cond_19
    ushr-int/lit8 v12, v5, 0x11

    .line 580
    .line 581
    and-int/2addr v12, v9

    .line 582
    if-nez v12, :cond_1a

    .line 583
    .line 584
    goto :goto_c

    .line 585
    :cond_1a
    ushr-int/lit8 v13, v5, 0xc

    .line 586
    .line 587
    const/16 v14, 0xf

    .line 588
    .line 589
    and-int/2addr v13, v14

    .line 590
    ushr-int/2addr v5, v11

    .line 591
    and-int/2addr v5, v9

    .line 592
    if-eqz v13, :cond_18

    .line 593
    .line 594
    if-eq v13, v14, :cond_18

    .line 595
    .line 596
    if-ne v5, v9, :cond_1b

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_1b
    const/16 v5, 0x480

    .line 600
    .line 601
    if-eq v12, v6, :cond_1d

    .line 602
    .line 603
    if-eq v12, v8, :cond_1f

    .line 604
    .line 605
    if-ne v12, v9, :cond_1c

    .line 606
    .line 607
    const/16 v5, 0x180

    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 611
    .line 612
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 613
    .line 614
    .line 615
    throw v0

    .line 616
    :cond_1d
    if-ne v7, v9, :cond_1e

    .line 617
    .line 618
    goto :goto_d

    .line 619
    :cond_1e
    const/16 v5, 0x240

    .line 620
    .line 621
    :cond_1f
    :goto_d
    move v14, v5

    .line 622
    :goto_e
    if-eq v14, v15, :cond_20

    .line 623
    .line 624
    goto/16 :goto_19

    .line 625
    .line 626
    :cond_20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 627
    .line 628
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 629
    .line 630
    .line 631
    throw v0

    .line 632
    :cond_21
    :pswitch_5
    move v5, v7

    .line 633
    goto :goto_10

    .line 634
    :pswitch_6
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    add-int/2addr v5, v12

    .line 639
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    and-int/lit16 v5, v5, 0xf8

    .line 644
    .line 645
    shr-int/2addr v5, v9

    .line 646
    if-le v5, v11, :cond_23

    .line 647
    .line 648
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    add-int/lit8 v5, v5, 0x4

    .line 653
    .line 654
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    and-int/lit16 v5, v5, 0xc0

    .line 659
    .line 660
    shr-int/lit8 v5, v5, 0x6

    .line 661
    .line 662
    if-ne v5, v9, :cond_22

    .line 663
    .line 664
    goto :goto_f

    .line 665
    :cond_22
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 666
    .line 667
    .line 668
    move-result v5

    .line 669
    add-int/lit8 v5, v5, 0x4

    .line 670
    .line 671
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    and-int/lit8 v5, v5, 0x30

    .line 676
    .line 677
    shr-int/lit8 v9, v5, 0x4

    .line 678
    .line 679
    :goto_f
    sget-object v5, LF0/b;->c:[I

    .line 680
    .line 681
    aget v5, v5, v9

    .line 682
    .line 683
    mul-int/lit16 v5, v5, 0x100

    .line 684
    .line 685
    goto/16 :goto_a

    .line 686
    .line 687
    :cond_23
    const/16 v5, 0x600

    .line 688
    .line 689
    goto/16 :goto_a

    .line 690
    .line 691
    :goto_10
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    const v9, -0xde4bec0

    .line 696
    .line 697
    .line 698
    if-eq v7, v9, :cond_2e

    .line 699
    .line 700
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    const v9, -0x17bd3b8f

    .line 705
    .line 706
    .line 707
    if-ne v7, v9, :cond_24

    .line 708
    .line 709
    goto/16 :goto_19

    .line 710
    .line 711
    :cond_24
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    const v5, 0x25205864

    .line 716
    .line 717
    .line 718
    if-ne v7, v5, :cond_25

    .line 719
    .line 720
    const/16 v14, 0x1000

    .line 721
    .line 722
    goto/16 :goto_19

    .line 723
    .line 724
    :cond_25
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 725
    .line 726
    .line 727
    move-result v5

    .line 728
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 729
    .line 730
    .line 731
    move-result v7

    .line 732
    if-eq v7, v13, :cond_28

    .line 733
    .line 734
    if-eq v7, v15, :cond_27

    .line 735
    .line 736
    const/16 v9, 0x1f

    .line 737
    .line 738
    if-eq v7, v9, :cond_26

    .line 739
    .line 740
    add-int/lit8 v7, v5, 0x4

    .line 741
    .line 742
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 743
    .line 744
    .line 745
    move-result v7

    .line 746
    and-int/2addr v7, v6

    .line 747
    shl-int/lit8 v7, v7, 0x6

    .line 748
    .line 749
    add-int/2addr v5, v12

    .line 750
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    :goto_11
    and-int/lit16 v5, v5, 0xfc

    .line 755
    .line 756
    :goto_12
    shr-int/2addr v5, v8

    .line 757
    or-int/2addr v5, v7

    .line 758
    goto :goto_14

    .line 759
    :cond_26
    add-int/lit8 v7, v5, 0x5

    .line 760
    .line 761
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    and-int/lit8 v7, v7, 0x7

    .line 766
    .line 767
    shl-int/lit8 v7, v7, 0x4

    .line 768
    .line 769
    add-int/lit8 v5, v5, 0x6

    .line 770
    .line 771
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    :goto_13
    and-int/lit8 v5, v5, 0x3c

    .line 776
    .line 777
    goto :goto_12

    .line 778
    :cond_27
    add-int/lit8 v7, v5, 0x4

    .line 779
    .line 780
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    and-int/lit8 v7, v7, 0x7

    .line 785
    .line 786
    shl-int/lit8 v7, v7, 0x4

    .line 787
    .line 788
    add-int/lit8 v5, v5, 0x7

    .line 789
    .line 790
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 791
    .line 792
    .line 793
    move-result v5

    .line 794
    goto :goto_13

    .line 795
    :cond_28
    add-int/lit8 v7, v5, 0x5

    .line 796
    .line 797
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    and-int/2addr v7, v6

    .line 802
    shl-int/lit8 v7, v7, 0x6

    .line 803
    .line 804
    add-int/lit8 v5, v5, 0x4

    .line 805
    .line 806
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 807
    .line 808
    .line 809
    move-result v5

    .line 810
    goto :goto_11

    .line 811
    :goto_14
    add-int/2addr v5, v6

    .line 812
    mul-int/lit8 v14, v5, 0x20

    .line 813
    .line 814
    goto :goto_19

    .line 815
    :cond_29
    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    and-int/2addr v5, v8

    .line 820
    if-nez v5, :cond_2a

    .line 821
    .line 822
    const/4 v5, 0x0

    .line 823
    goto :goto_17

    .line 824
    :cond_2a
    const/16 v5, 0x1a

    .line 825
    .line 826
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 827
    .line 828
    .line 829
    move-result v5

    .line 830
    const/16 v7, 0x1c

    .line 831
    .line 832
    move v9, v7

    .line 833
    const/4 v8, 0x0

    .line 834
    :goto_15
    if-ge v8, v5, :cond_2b

    .line 835
    .line 836
    add-int/lit8 v11, v8, 0x1b

    .line 837
    .line 838
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 839
    .line 840
    .line 841
    move-result v11

    .line 842
    add-int/2addr v9, v11

    .line 843
    add-int/lit8 v8, v8, 0x1

    .line 844
    .line 845
    goto :goto_15

    .line 846
    :cond_2b
    add-int/lit8 v5, v9, 0x1a

    .line 847
    .line 848
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    const/4 v8, 0x0

    .line 853
    :goto_16
    if-ge v8, v5, :cond_2c

    .line 854
    .line 855
    add-int/lit8 v11, v9, 0x1b

    .line 856
    .line 857
    add-int/2addr v11, v8

    .line 858
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 859
    .line 860
    .line 861
    move-result v11

    .line 862
    add-int/2addr v7, v11

    .line 863
    add-int/lit8 v8, v8, 0x1

    .line 864
    .line 865
    goto :goto_16

    .line 866
    :cond_2c
    add-int v5, v9, v7

    .line 867
    .line 868
    :goto_17
    add-int/lit8 v7, v5, 0x1a

    .line 869
    .line 870
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 871
    .line 872
    .line 873
    move-result v7

    .line 874
    add-int/lit8 v7, v7, 0x1b

    .line 875
    .line 876
    add-int/2addr v7, v5

    .line 877
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 878
    .line 879
    .line 880
    move-result v5

    .line 881
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->limit()I

    .line 882
    .line 883
    .line 884
    move-result v8

    .line 885
    sub-int/2addr v8, v7

    .line 886
    if-le v8, v6, :cond_2d

    .line 887
    .line 888
    add-int/2addr v7, v6

    .line 889
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 890
    .line 891
    .line 892
    move-result v7

    .line 893
    goto :goto_18

    .line 894
    :cond_2d
    const/4 v7, 0x0

    .line 895
    :goto_18
    invoke-static {v5, v7}, LF0/b;->l(BB)J

    .line 896
    .line 897
    .line 898
    move-result-wide v7

    .line 899
    const-wide/32 v11, 0xbb80

    .line 900
    .line 901
    .line 902
    mul-long/2addr v7, v11

    .line 903
    const-wide/32 v11, 0xf4240

    .line 904
    .line 905
    .line 906
    div-long/2addr v7, v11

    .line 907
    long-to-int v14, v7

    .line 908
    :cond_2e
    :goto_19
    :pswitch_7
    iput v14, v1, Lj0/v;->K:I

    .line 909
    .line 910
    if-nez v14, :cond_2f

    .line 911
    .line 912
    return v6

    .line 913
    :cond_2f
    iget-object v5, v1, Lj0/v;->A:Lj0/q;

    .line 914
    .line 915
    if-eqz v5, :cond_31

    .line 916
    .line 917
    invoke-virtual/range {p0 .. p0}, Lj0/v;->f()Z

    .line 918
    .line 919
    .line 920
    move-result v5

    .line 921
    if-nez v5, :cond_30

    .line 922
    .line 923
    const/4 v5, 0x0

    .line 924
    return v5

    .line 925
    :cond_30
    invoke-virtual/range {p0 .. p2}, Lj0/v;->a(J)V

    .line 926
    .line 927
    .line 928
    const/4 v5, 0x0

    .line 929
    iput-object v5, v1, Lj0/v;->A:Lj0/q;

    .line 930
    .line 931
    :cond_31
    iget-wide v7, v1, Lj0/v;->N:J

    .line 932
    .line 933
    iget-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 934
    .line 935
    invoke-virtual/range {p0 .. p0}, Lj0/v;->j()J

    .line 936
    .line 937
    .line 938
    move-result-wide v11

    .line 939
    iget-object v9, v1, Lj0/v;->d:Lj0/B;

    .line 940
    .line 941
    iget-wide v13, v9, Lj0/B;->o:J

    .line 942
    .line 943
    sub-long/2addr v11, v13

    .line 944
    iget-object v5, v5, Lj0/p;->a:La0/p;

    .line 945
    .line 946
    iget v5, v5, La0/p;->D:I

    .line 947
    .line 948
    invoke-static {v11, v12, v5}, Ld0/w;->S(JI)J

    .line 949
    .line 950
    .line 951
    move-result-wide v11

    .line 952
    add-long/2addr v11, v7

    .line 953
    iget-boolean v5, v1, Lj0/v;->L:Z

    .line 954
    .line 955
    if-nez v5, :cond_33

    .line 956
    .line 957
    sub-long v7, v11, v2

    .line 958
    .line 959
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 960
    .line 961
    .line 962
    move-result-wide v7

    .line 963
    const-wide/32 v13, 0x30d40

    .line 964
    .line 965
    .line 966
    cmp-long v5, v7, v13

    .line 967
    .line 968
    if-lez v5, :cond_33

    .line 969
    .line 970
    iget-object v5, v1, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 971
    .line 972
    if-eqz v5, :cond_32

    .line 973
    .line 974
    new-instance v7, LH1/j;

    .line 975
    .line 976
    new-instance v8, Ljava/lang/StringBuilder;

    .line 977
    .line 978
    const-string v9, "Unexpected audio track timestamp discontinuity: expected "

    .line 979
    .line 980
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 984
    .line 985
    .line 986
    const-string v9, ", got "

    .line 987
    .line 988
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v8

    .line 998
    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v5, v7}, Landroidx/lifecycle/E;->G(Ljava/lang/Exception;)V

    .line 1002
    .line 1003
    .line 1004
    :cond_32
    iput-boolean v6, v1, Lj0/v;->L:Z

    .line 1005
    .line 1006
    :cond_33
    iget-boolean v5, v1, Lj0/v;->L:Z

    .line 1007
    .line 1008
    if-eqz v5, :cond_35

    .line 1009
    .line 1010
    invoke-virtual/range {p0 .. p0}, Lj0/v;->f()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v5

    .line 1014
    if-nez v5, :cond_34

    .line 1015
    .line 1016
    const/4 v5, 0x0

    .line 1017
    return v5

    .line 1018
    :cond_34
    const/4 v5, 0x0

    .line 1019
    sub-long v7, v2, v11

    .line 1020
    .line 1021
    iget-wide v11, v1, Lj0/v;->N:J

    .line 1022
    .line 1023
    add-long/2addr v11, v7

    .line 1024
    iput-wide v11, v1, Lj0/v;->N:J

    .line 1025
    .line 1026
    iput-boolean v5, v1, Lj0/v;->L:Z

    .line 1027
    .line 1028
    invoke-virtual/range {p0 .. p2}, Lj0/v;->a(J)V

    .line 1029
    .line 1030
    .line 1031
    iget-object v5, v1, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 1032
    .line 1033
    if-eqz v5, :cond_35

    .line 1034
    .line 1035
    const-wide/16 v11, 0x0

    .line 1036
    .line 1037
    cmp-long v7, v7, v11

    .line 1038
    .line 1039
    if-eqz v7, :cond_35

    .line 1040
    .line 1041
    iget-object v5, v5, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v5, Lj0/x;

    .line 1044
    .line 1045
    iput-boolean v6, v5, Lj0/x;->X0:Z

    .line 1046
    .line 1047
    :cond_35
    iget-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 1048
    .line 1049
    iget v5, v5, Lj0/p;->c:I

    .line 1050
    .line 1051
    if-nez v5, :cond_36

    .line 1052
    .line 1053
    iget-wide v7, v1, Lj0/v;->G:J

    .line 1054
    .line 1055
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->remaining()I

    .line 1056
    .line 1057
    .line 1058
    move-result v5

    .line 1059
    int-to-long v11, v5

    .line 1060
    add-long/2addr v7, v11

    .line 1061
    iput-wide v7, v1, Lj0/v;->G:J

    .line 1062
    .line 1063
    goto :goto_1a

    .line 1064
    :cond_36
    iget-wide v7, v1, Lj0/v;->H:J

    .line 1065
    .line 1066
    iget v5, v1, Lj0/v;->K:I

    .line 1067
    .line 1068
    int-to-long v11, v5

    .line 1069
    int-to-long v13, v4

    .line 1070
    mul-long/2addr v11, v13

    .line 1071
    add-long/2addr v11, v7

    .line 1072
    iput-wide v11, v1, Lj0/v;->H:J

    .line 1073
    .line 1074
    :goto_1a
    iput-object v0, v1, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 1075
    .line 1076
    iput v4, v1, Lj0/v;->Q:I

    .line 1077
    .line 1078
    :cond_37
    invoke-virtual/range {p0 .. p2}, Lj0/v;->t(J)V

    .line 1079
    .line 1080
    .line 1081
    iget-object v0, v1, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 1082
    .line 1083
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-nez v0, :cond_38

    .line 1088
    .line 1089
    const/4 v0, 0x0

    .line 1090
    iput-object v0, v1, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 1091
    .line 1092
    const/4 v2, 0x0

    .line 1093
    iput v2, v1, Lj0/v;->Q:I

    .line 1094
    .line 1095
    return v6

    .line 1096
    :cond_38
    invoke-virtual/range {p0 .. p0}, Lj0/v;->k()J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v2

    .line 1100
    iget-wide v4, v10, Lj0/n;->y:J

    .line 1101
    .line 1102
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    cmp-long v0, v4, v7

    .line 1108
    .line 1109
    if-eqz v0, :cond_39

    .line 1110
    .line 1111
    const-wide/16 v4, 0x0

    .line 1112
    .line 1113
    cmp-long v0, v2, v4

    .line 1114
    .line 1115
    if-lez v0, :cond_39

    .line 1116
    .line 1117
    iget-object v0, v10, Lj0/n;->I:Ld0/r;

    .line 1118
    .line 1119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1123
    .line 1124
    .line 1125
    move-result-wide v2

    .line 1126
    iget-wide v4, v10, Lj0/n;->y:J

    .line 1127
    .line 1128
    sub-long/2addr v2, v4

    .line 1129
    const-wide/16 v4, 0xc8

    .line 1130
    .line 1131
    cmp-long v0, v2, v4

    .line 1132
    .line 1133
    if-ltz v0, :cond_39

    .line 1134
    .line 1135
    const-string v0, "DefaultAudioSink"

    .line 1136
    .line 1137
    const-string v2, "Resetting stalled audio track"

    .line 1138
    .line 1139
    invoke-static {v0, v2}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual/range {p0 .. p0}, Lj0/v;->g()V

    .line 1143
    .line 1144
    .line 1145
    return v6

    .line 1146
    :cond_39
    const/4 v2, 0x0

    .line 1147
    return v2

    .line 1148
    nop

    .line 1149
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_6
    .end packed-switch
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

.method public final m()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj0/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Ld0/w;->a:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, Lio/flutter/plugin/platform/n;->v(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lj0/v;->U:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lj0/v;->g:Lj0/n;

    .line 26
    .line 27
    invoke-virtual {p0}, Lj0/v;->k()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Lj0/n;->c(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    :goto_0
    return v0
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

.method public final n()Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lj0/v;->l:Lj0/s;

    .line 4
    .line 5
    iget-object v2, v0, Lj0/s;->a:Ljava/lang/Exception;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    :cond_0
    move v0, v3

    .line 12
    goto :goto_2

    .line 13
    :cond_1
    sget-object v2, Lj0/v;->j0:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    sget v5, Lj0/v;->l0:I

    .line 17
    .line 18
    if-lez v5, :cond_2

    .line 19
    .line 20
    move v5, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move v5, v3

    .line 23
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz v5, :cond_3

    .line 25
    .line 26
    :goto_1
    move v0, v4

    .line 27
    goto :goto_2

    .line 28
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iget-wide v7, v0, Lj0/s;->c:J

    .line 33
    .line 34
    cmp-long v0, v5, v7

    .line 35
    .line 36
    if-gez v0, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :goto_2
    if-eqz v0, :cond_4

    .line 40
    .line 41
    return v3

    .line 42
    :cond_4
    :try_start_1
    iget-object v0, v1, Lj0/v;->t:Lj0/p;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lj0/v;->c(Lj0/p;)Landroid/media/AudioTrack;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_1
    .catch Lj0/j; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    goto :goto_3

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object v2, v0

    .line 54
    iget-object v0, v1, Lj0/v;->t:Lj0/p;

    .line 55
    .line 56
    iget v5, v0, Lj0/p;->h:I

    .line 57
    .line 58
    const v6, 0xf4240

    .line 59
    .line 60
    .line 61
    if-le v5, v6, :cond_10

    .line 62
    .line 63
    new-instance v5, Lj0/p;

    .line 64
    .line 65
    iget-boolean v6, v0, Lj0/p;->l:Z

    .line 66
    .line 67
    iget-object v8, v0, Lj0/p;->a:La0/p;

    .line 68
    .line 69
    iget v9, v0, Lj0/p;->b:I

    .line 70
    .line 71
    iget v10, v0, Lj0/p;->c:I

    .line 72
    .line 73
    iget v11, v0, Lj0/p;->d:I

    .line 74
    .line 75
    iget v12, v0, Lj0/p;->e:I

    .line 76
    .line 77
    iget v13, v0, Lj0/p;->f:I

    .line 78
    .line 79
    iget v14, v0, Lj0/p;->g:I

    .line 80
    .line 81
    iget-object v15, v0, Lj0/p;->i:Lb0/a;

    .line 82
    .line 83
    iget-boolean v7, v0, Lj0/p;->j:Z

    .line 84
    .line 85
    iget-boolean v0, v0, Lj0/p;->k:Z

    .line 86
    .line 87
    const v16, 0xf4240

    .line 88
    .line 89
    .line 90
    move/from16 v17, v7

    .line 91
    .line 92
    move-object v7, v5

    .line 93
    move-object/from16 v18, v15

    .line 94
    .line 95
    move/from16 v15, v16

    .line 96
    .line 97
    move-object/from16 v16, v18

    .line 98
    .line 99
    move/from16 v18, v0

    .line 100
    .line 101
    move/from16 v19, v6

    .line 102
    .line 103
    invoke-direct/range {v7 .. v19}, Lj0/p;-><init>(La0/p;IIIIIIILb0/a;ZZZ)V

    .line 104
    .line 105
    .line 106
    :try_start_2
    invoke-virtual {v1, v5}, Lj0/v;->c(Lj0/p;)Landroid/media/AudioTrack;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v5, v1, Lj0/v;->t:Lj0/p;
    :try_end_2
    .catch Lj0/j; {:try_start_2 .. :try_end_2} :catch_1

    .line 111
    .line 112
    :goto_3
    iput-object v0, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 113
    .line 114
    invoke-static {v0}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    iget-object v0, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 121
    .line 122
    iget-object v2, v1, Lj0/v;->k:LZ1/s;

    .line 123
    .line 124
    if-nez v2, :cond_5

    .line 125
    .line 126
    new-instance v2, LZ1/s;

    .line 127
    .line 128
    invoke-direct {v2, v1}, LZ1/s;-><init>(Lj0/v;)V

    .line 129
    .line 130
    .line 131
    iput-object v2, v1, Lj0/v;->k:LZ1/s;

    .line 132
    .line 133
    :cond_5
    iget-object v2, v1, Lj0/v;->k:LZ1/s;

    .line 134
    .line 135
    iget-object v5, v2, LZ1/s;->m:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, Landroid/os/Handler;

    .line 138
    .line 139
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    new-instance v6, Lj0/t;

    .line 143
    .line 144
    invoke-direct {v6, v5}, Lj0/t;-><init>(Landroid/os/Handler;)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v2, LZ1/s;->n:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Lj0/u;

    .line 150
    .line 151
    invoke-static {v0, v6, v2}, Lio/flutter/plugin/platform/n;->p(Landroid/media/AudioTrack;Lj0/t;Lj0/u;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v1, Lj0/v;->t:Lj0/p;

    .line 155
    .line 156
    iget-boolean v2, v0, Lj0/p;->k:Z

    .line 157
    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    iget-object v2, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 161
    .line 162
    iget-object v0, v0, Lj0/p;->a:La0/p;

    .line 163
    .line 164
    iget v5, v0, La0/p;->F:I

    .line 165
    .line 166
    iget v0, v0, La0/p;->G:I

    .line 167
    .line 168
    invoke-static {v2, v5, v0}, Lio/flutter/plugin/platform/n;->o(Landroid/media/AudioTrack;II)V

    .line 169
    .line 170
    .line 171
    :cond_6
    sget v0, Ld0/w;->a:I

    .line 172
    .line 173
    const/16 v2, 0x1f

    .line 174
    .line 175
    if-lt v0, v2, :cond_7

    .line 176
    .line 177
    iget-object v2, v1, Lj0/v;->q:Li0/j;

    .line 178
    .line 179
    if-eqz v2, :cond_7

    .line 180
    .line 181
    iget-object v5, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 182
    .line 183
    iget-object v2, v2, Li0/j;->b:Li0/i;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v2, v2, Li0/i;->a:Landroid/media/metrics/LogSessionId;

    .line 189
    .line 190
    invoke-static {}, LS2/c;->d()Landroid/media/metrics/LogSessionId;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v2, v6}, Li0/g;->u(Landroid/media/metrics/LogSessionId;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_7

    .line 199
    .line 200
    invoke-static {v5, v2}, Li0/g;->m(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 201
    .line 202
    .line 203
    :cond_7
    iget-object v2, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 204
    .line 205
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    iput v2, v1, Lj0/v;->X:I

    .line 210
    .line 211
    iget-object v2, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 212
    .line 213
    iget-object v5, v1, Lj0/v;->t:Lj0/p;

    .line 214
    .line 215
    iget v6, v5, Lj0/p;->c:I

    .line 216
    .line 217
    const/4 v7, 0x2

    .line 218
    if-ne v6, v7, :cond_8

    .line 219
    .line 220
    move v6, v4

    .line 221
    goto :goto_4

    .line 222
    :cond_8
    move v6, v3

    .line 223
    :goto_4
    iget v7, v5, Lj0/p;->g:I

    .line 224
    .line 225
    iget v8, v5, Lj0/p;->d:I

    .line 226
    .line 227
    iget v5, v5, Lj0/p;->h:I

    .line 228
    .line 229
    iget-object v9, v1, Lj0/v;->g:Lj0/n;

    .line 230
    .line 231
    iput-object v2, v9, Lj0/n;->c:Landroid/media/AudioTrack;

    .line 232
    .line 233
    iput v5, v9, Lj0/n;->d:I

    .line 234
    .line 235
    new-instance v10, Lj0/m;

    .line 236
    .line 237
    invoke-direct {v10, v2}, Lj0/m;-><init>(Landroid/media/AudioTrack;)V

    .line 238
    .line 239
    .line 240
    iput-object v10, v9, Lj0/n;->e:Lj0/m;

    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    iput v2, v9, Lj0/n;->f:I

    .line 247
    .line 248
    const/16 v2, 0x17

    .line 249
    .line 250
    if-eqz v6, :cond_a

    .line 251
    .line 252
    if-ge v0, v2, :cond_a

    .line 253
    .line 254
    const/4 v6, 0x5

    .line 255
    if-eq v7, v6, :cond_9

    .line 256
    .line 257
    const/4 v6, 0x6

    .line 258
    if-ne v7, v6, :cond_a

    .line 259
    .line 260
    :cond_9
    move v6, v4

    .line 261
    goto :goto_5

    .line 262
    :cond_a
    move v6, v3

    .line 263
    :goto_5
    iput-boolean v6, v9, Lj0/n;->g:Z

    .line 264
    .line 265
    invoke-static {v7}, Ld0/w;->H(I)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    iput-boolean v6, v9, Lj0/n;->p:Z

    .line 270
    .line 271
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    if-eqz v6, :cond_b

    .line 277
    .line 278
    div-int/2addr v5, v8

    .line 279
    int-to-long v5, v5

    .line 280
    iget v7, v9, Lj0/n;->f:I

    .line 281
    .line 282
    invoke-static {v5, v6, v7}, Ld0/w;->S(JI)J

    .line 283
    .line 284
    .line 285
    move-result-wide v5

    .line 286
    goto :goto_6

    .line 287
    :cond_b
    move-wide v5, v10

    .line 288
    :goto_6
    iput-wide v5, v9, Lj0/n;->h:J

    .line 289
    .line 290
    const-wide/16 v5, 0x0

    .line 291
    .line 292
    iput-wide v5, v9, Lj0/n;->s:J

    .line 293
    .line 294
    iput-wide v5, v9, Lj0/n;->t:J

    .line 295
    .line 296
    iput-boolean v3, v9, Lj0/n;->G:Z

    .line 297
    .line 298
    iput-wide v5, v9, Lj0/n;->H:J

    .line 299
    .line 300
    iput-wide v5, v9, Lj0/n;->u:J

    .line 301
    .line 302
    iput-boolean v3, v9, Lj0/n;->o:Z

    .line 303
    .line 304
    iput-wide v10, v9, Lj0/n;->x:J

    .line 305
    .line 306
    iput-wide v10, v9, Lj0/n;->y:J

    .line 307
    .line 308
    iput-wide v5, v9, Lj0/n;->q:J

    .line 309
    .line 310
    iput-wide v5, v9, Lj0/n;->n:J

    .line 311
    .line 312
    const/high16 v3, 0x3f800000    # 1.0f

    .line 313
    .line 314
    iput v3, v9, Lj0/n;->i:F

    .line 315
    .line 316
    invoke-virtual/range {p0 .. p0}, Lj0/v;->o()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_c

    .line 321
    .line 322
    iget-object v3, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 323
    .line 324
    iget v5, v1, Lj0/v;->O:F

    .line 325
    .line 326
    invoke-virtual {v3, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 327
    .line 328
    .line 329
    :cond_c
    iget-object v3, v1, Lj0/v;->Y:La0/d;

    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    iget-object v3, v1, Lj0/v;->Z:Landroidx/lifecycle/E;

    .line 335
    .line 336
    if-eqz v3, :cond_d

    .line 337
    .line 338
    if-lt v0, v2, :cond_d

    .line 339
    .line 340
    iget-object v2, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 341
    .line 342
    iget-object v3, v3, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 345
    .line 346
    invoke-virtual {v2, v3}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 347
    .line 348
    .line 349
    iget-object v2, v1, Lj0/v;->x:Lj0/d;

    .line 350
    .line 351
    if-eqz v2, :cond_d

    .line 352
    .line 353
    iget-object v3, v1, Lj0/v;->Z:Landroidx/lifecycle/E;

    .line 354
    .line 355
    iget-object v3, v3, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 358
    .line 359
    invoke-virtual {v2, v3}, Lj0/d;->b(Landroid/media/AudioDeviceInfo;)V

    .line 360
    .line 361
    .line 362
    :cond_d
    const/16 v2, 0x18

    .line 363
    .line 364
    if-lt v0, v2, :cond_e

    .line 365
    .line 366
    iget-object v0, v1, Lj0/v;->x:Lj0/d;

    .line 367
    .line 368
    if-eqz v0, :cond_e

    .line 369
    .line 370
    new-instance v2, LZ1/m;

    .line 371
    .line 372
    iget-object v3, v1, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 373
    .line 374
    invoke-direct {v2, v3, v0}, LZ1/m;-><init>(Landroid/media/AudioTrack;Lj0/d;)V

    .line 375
    .line 376
    .line 377
    iput-object v2, v1, Lj0/v;->y:LZ1/m;

    .line 378
    .line 379
    :cond_e
    iput-boolean v4, v1, Lj0/v;->M:Z

    .line 380
    .line 381
    iget-object v0, v1, Lj0/v;->r:Landroidx/lifecycle/E;

    .line 382
    .line 383
    if-eqz v0, :cond_f

    .line 384
    .line 385
    iget-object v2, v1, Lj0/v;->t:Lj0/p;

    .line 386
    .line 387
    invoke-virtual {v2}, Lj0/p;->a()LF0/d;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    iget-object v0, v0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Lj0/x;

    .line 394
    .line 395
    iget-object v0, v0, Lj0/x;->O0:LZ1/c;

    .line 396
    .line 397
    iget-object v3, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v3, Landroid/os/Handler;

    .line 400
    .line 401
    if-eqz v3, :cond_f

    .line 402
    .line 403
    new-instance v5, Lj0/f;

    .line 404
    .line 405
    const/4 v6, 0x1

    .line 406
    invoke-direct {v5, v0, v2, v6}, Lj0/f;-><init>(LZ1/c;Ljava/lang/Object;I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 410
    .line 411
    .line 412
    :cond_f
    return v4

    .line 413
    :catch_1
    move-exception v0

    .line 414
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 415
    .line 416
    .line 417
    :cond_10
    iget-object v0, v1, Lj0/v;->t:Lj0/p;

    .line 418
    .line 419
    iget v0, v0, Lj0/p;->c:I

    .line 420
    .line 421
    if-ne v0, v4, :cond_11

    .line 422
    .line 423
    iput-boolean v4, v1, Lj0/v;->d0:Z

    .line 424
    .line 425
    :cond_11
    throw v2

    .line 426
    :catchall_0
    move-exception v0

    .line 427
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 428
    throw v0
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

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
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

.method public final q()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj0/v;->x:Lj0/d;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lj0/v;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lj0/v;->f0:Landroid/os/Looper;

    .line 14
    .line 15
    new-instance v1, Lj0/d;

    .line 16
    .line 17
    new-instance v2, LI2/g;

    .line 18
    .line 19
    const/16 v3, 0x12

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lj0/v;->z:La0/c;

    .line 25
    .line 26
    iget-object v4, p0, Lj0/v;->Z:Landroidx/lifecycle/E;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2, v3, v4}, Lj0/d;-><init>(Landroid/content/Context;LI2/g;La0/c;Landroidx/lifecycle/E;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lj0/v;->x:Lj0/d;

    .line 32
    .line 33
    iget-boolean v0, v1, Lj0/d;->j:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, v1, Lj0/d;->g:Lj0/b;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x1

    .line 44
    iput-boolean v0, v1, Lj0/d;->j:Z

    .line 45
    .line 46
    iget-object v0, v1, Lj0/d;->f:Lj0/c;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v2, v0, Lj0/c;->a:Landroid/content/ContentResolver;

    .line 51
    .line 52
    iget-object v3, v0, Lj0/c;->b:Landroid/net/Uri;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-virtual {v2, v3, v4, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    sget v0, Ld0/w;->a:I

    .line 59
    .line 60
    iget-object v2, v1, Lj0/d;->c:Landroid/os/Handler;

    .line 61
    .line 62
    const/16 v3, 0x17

    .line 63
    .line 64
    iget-object v4, v1, Lj0/d;->a:Landroid/content/Context;

    .line 65
    .line 66
    if-lt v0, v3, :cond_2

    .line 67
    .line 68
    iget-object v0, v1, Lj0/d;->d:LS2/e;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    const-string v3, "audio"

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/media/AudioManager;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v0, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    new-instance v0, Landroid/content/IntentFilter;

    .line 87
    .line 88
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 89
    .line 90
    invoke-direct {v0, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    iget-object v5, v1, Lj0/d;->e:LX1/d;

    .line 95
    .line 96
    invoke-virtual {v4, v5, v0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v2, v1, Lj0/d;->i:La0/c;

    .line 101
    .line 102
    iget-object v3, v1, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 103
    .line 104
    invoke-static {v4, v0, v2, v3}, Lj0/b;->c(Landroid/content/Context;Landroid/content/Intent;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, v1, Lj0/d;->g:Lj0/b;

    .line 109
    .line 110
    :goto_0
    iput-object v0, p0, Lj0/v;->w:Lj0/b;

    .line 111
    .line 112
    :cond_3
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

.method public final r()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj0/v;->V:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lj0/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lj0/v;->g:Lj0/n;

    .line 11
    .line 12
    iget-wide v1, v0, Lj0/n;->x:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Lj0/n;->I:Ld0/r;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Ld0/w;->M(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iput-wide v1, v0, Lj0/n;->x:J

    .line 37
    .line 38
    :cond_0
    iget-object v0, v0, Lj0/n;->e:Lj0/m;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lj0/m;->a()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final s()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj0/v;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lj0/v;->T:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lj0/v;->k()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lj0/v;->g:Lj0/n;

    .line 13
    .line 14
    invoke-virtual {v2}, Lj0/n;->b()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v2, Lj0/n;->z:J

    .line 19
    .line 20
    iget-object v3, v2, Lj0/n;->I:Ld0/r;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v3, v4}, Ld0/w;->M(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput-wide v3, v2, Lj0/n;->x:J

    .line 34
    .line 35
    iput-wide v0, v2, Lj0/n;->A:J

    .line 36
    .line 37
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-static {v0}, Lj0/v;->p(Landroid/media/AudioTrack;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iput-boolean v1, p0, Lj0/v;->U:Z

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 51
    .line 52
    .line 53
    iput v1, p0, Lj0/v;->F:I

    .line 54
    .line 55
    :cond_1
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

.method public final t(J)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj0/v;->e(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lb0/a;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lj0/v;->w(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lj0/v;->e(J)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void

    .line 28
    :cond_2
    :goto_0
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 29
    .line 30
    invoke-virtual {v0}, Lb0/a;->d()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_9

    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 37
    .line 38
    invoke-virtual {v0}, Lb0/a;->e()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    sget-object v0, Lb0/d;->a:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    iget-object v1, v0, Lb0/a;->c:[Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    invoke-virtual {v0}, Lb0/a;->c()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    aget-object v1, v1, v2

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    move-object v0, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_5
    sget-object v1, Lb0/d;->a:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lb0/a;->f(Ljava/nio/ByteBuffer;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lb0/a;->c:[Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    invoke-virtual {v0}, Lb0/a;->c()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    aget-object v0, v1, v0

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lj0/v;->w(Ljava/nio/ByteBuffer;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Lj0/v;->e(J)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    iget-object v0, p0, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    if-eqz v0, :cond_9

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_7

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_7
    iget-object v0, p0, Lj0/v;->u:Lb0/a;

    .line 105
    .line 106
    iget-object v1, p0, Lj0/v;->P:Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    invoke-virtual {v0}, Lb0/a;->e()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    iget-boolean v2, v0, Lb0/a;->d:Z

    .line 115
    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    invoke-virtual {v0, v1}, Lb0/a;->f(Ljava/nio/ByteBuffer;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_9
    :goto_2
    return-void
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

.method public final u()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lj0/v;->g()V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lj0/v;->e:Lm2/b0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lm2/I;->r(I)Lm2/G;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-virtual {v1}, Lm2/G;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lm2/G;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb0/d;

    .line 22
    .line 23
    invoke-interface {v2}, Lb0/d;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, p0, Lj0/v;->f:Lm2/b0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lm2/I;->r(I)Lm2/G;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_1
    invoke-virtual {v1}, Lm2/G;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Lm2/G;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lb0/d;

    .line 44
    .line 45
    invoke-interface {v2}, Lb0/d;->reset()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, Lj0/v;->u:Lb0/a;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    move v2, v0

    .line 54
    :goto_2
    iget-object v3, v1, Lb0/a;->a:Lm2/b0;

    .line 55
    .line 56
    invoke-virtual {v3}, Lm2/b0;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ge v2, v4, :cond_2

    .line 61
    .line 62
    invoke-virtual {v3, v2}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lb0/d;

    .line 67
    .line 68
    invoke-interface {v3}, Lb0/d;->flush()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v3}, Lb0/d;->reset()V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-array v2, v0, [Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    iput-object v2, v1, Lb0/a;->c:[Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    sget-object v2, Lb0/b;->e:Lb0/b;

    .line 82
    .line 83
    iput-boolean v0, v1, Lb0/a;->d:Z

    .line 84
    .line 85
    :cond_3
    iput-boolean v0, p0, Lj0/v;->V:Z

    .line 86
    .line 87
    iput-boolean v0, p0, Lj0/v;->d0:Z

    .line 88
    .line 89
    return-void
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

.method public final v()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj0/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lj0/v;->C:La0/J;

    .line 17
    .line 18
    iget v1, v1, La0/J;->a:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lj0/v;->C:La0/J;

    .line 25
    .line 26
    iget v1, v1, La0/J;->b:F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    iget-object v1, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v1, "DefaultAudioSink"

    .line 45
    .line 46
    const-string v2, "Failed to set playback params"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v0, La0/J;

    .line 52
    .line 53
    iget-object v1, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Lj0/v;->v:Landroid/media/AudioTrack;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {v0, v1, v2}, La0/J;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lj0/v;->C:La0/J;

    .line 77
    .line 78
    iget-object v1, p0, Lj0/v;->g:Lj0/n;

    .line 79
    .line 80
    iget v0, v0, La0/J;->a:F

    .line 81
    .line 82
    iput v0, v1, Lj0/n;->i:F

    .line 83
    .line 84
    iget-object v0, v1, Lj0/n;->e:Lj0/m;

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    invoke-virtual {v0}, Lj0/m;->a()V

    .line 89
    .line 90
    .line 91
    :cond_0
    invoke-virtual {v1}, Lj0/n;->d()V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
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

.method public final w(Ljava/nio/ByteBuffer;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, v0, Lj0/v;->t:Lj0/p;

    .line 21
    .line 22
    iget v1, v1, Lj0/p;->c:I

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    :goto_1
    move-object/from16 v3, p1

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_2
    const-wide/16 v1, 0x14

    .line 31
    .line 32
    invoke-static {v1, v2}, Ld0/w;->M(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-object v1, v0, Lj0/v;->t:Lj0/p;

    .line 37
    .line 38
    iget v1, v1, Lj0/p;->e:I

    .line 39
    .line 40
    int-to-long v5, v1

    .line 41
    const-wide/32 v7, 0xf4240

    .line 42
    .line 43
    .line 44
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 45
    .line 46
    invoke-static/range {v3 .. v9}, Ld0/w;->U(JJJLjava/math/RoundingMode;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    long-to-int v1, v1

    .line 51
    invoke-virtual/range {p0 .. p0}, Lj0/v;->k()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    int-to-long v4, v1

    .line 56
    cmp-long v6, v2, v4

    .line 57
    .line 58
    if-ltz v6, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-object v6, v0, Lj0/v;->t:Lj0/p;

    .line 62
    .line 63
    iget v7, v6, Lj0/p;->g:I

    .line 64
    .line 65
    long-to-int v2, v2

    .line 66
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_17

    .line 91
    .line 92
    if-ge v2, v1, :cond_17

    .line 93
    .line 94
    const/high16 v12, 0x50000000

    .line 95
    .line 96
    const/high16 v13, 0x10000000

    .line 97
    .line 98
    const/16 v14, 0x16

    .line 99
    .line 100
    const/16 v15, 0x15

    .line 101
    .line 102
    const/4 v9, 0x4

    .line 103
    const/4 v10, 0x3

    .line 104
    const/4 v11, 0x2

    .line 105
    if-eq v7, v11, :cond_d

    .line 106
    .line 107
    if-eq v7, v10, :cond_c

    .line 108
    .line 109
    if-eq v7, v9, :cond_a

    .line 110
    .line 111
    if-eq v7, v15, :cond_9

    .line 112
    .line 113
    if-eq v7, v14, :cond_8

    .line 114
    .line 115
    if-eq v7, v13, :cond_7

    .line 116
    .line 117
    if-eq v7, v12, :cond_6

    .line 118
    .line 119
    const/high16 v12, 0x60000000

    .line 120
    .line 121
    if-ne v7, v12, :cond_5

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    and-int/lit16 v12, v12, 0xff

    .line 128
    .line 129
    shl-int/lit8 v12, v12, 0x18

    .line 130
    .line 131
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    and-int/lit16 v13, v13, 0xff

    .line 136
    .line 137
    shl-int/lit8 v13, v13, 0x10

    .line 138
    .line 139
    or-int/2addr v12, v13

    .line 140
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    and-int/lit16 v13, v13, 0xff

    .line 145
    .line 146
    shl-int/lit8 v13, v13, 0x8

    .line 147
    .line 148
    or-int/2addr v12, v13

    .line 149
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    and-int/lit16 v13, v13, 0xff

    .line 154
    .line 155
    :goto_3
    or-int/2addr v12, v13

    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 159
    .line 160
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    and-int/lit16 v12, v12, 0xff

    .line 169
    .line 170
    shl-int/lit8 v12, v12, 0x18

    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    and-int/lit16 v13, v13, 0xff

    .line 177
    .line 178
    shl-int/lit8 v13, v13, 0x10

    .line 179
    .line 180
    or-int/2addr v12, v13

    .line 181
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    and-int/lit16 v13, v13, 0xff

    .line 186
    .line 187
    shl-int/lit8 v13, v13, 0x8

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    and-int/lit16 v12, v12, 0xff

    .line 195
    .line 196
    shl-int/lit8 v12, v12, 0x18

    .line 197
    .line 198
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    and-int/lit16 v13, v13, 0xff

    .line 203
    .line 204
    shl-int/lit8 v13, v13, 0x10

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    and-int/lit16 v12, v12, 0xff

    .line 212
    .line 213
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    and-int/lit16 v13, v13, 0xff

    .line 218
    .line 219
    shl-int/lit8 v13, v13, 0x8

    .line 220
    .line 221
    or-int/2addr v12, v13

    .line 222
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    and-int/lit16 v13, v13, 0xff

    .line 227
    .line 228
    shl-int/lit8 v13, v13, 0x10

    .line 229
    .line 230
    or-int/2addr v12, v13

    .line 231
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    :goto_4
    and-int/lit16 v13, v13, 0xff

    .line 236
    .line 237
    shl-int/lit8 v13, v13, 0x18

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    and-int/lit16 v12, v12, 0xff

    .line 245
    .line 246
    shl-int/lit8 v12, v12, 0x8

    .line 247
    .line 248
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    and-int/lit16 v13, v13, 0xff

    .line 253
    .line 254
    shl-int/lit8 v13, v13, 0x10

    .line 255
    .line 256
    or-int/2addr v12, v13

    .line 257
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    goto :goto_4

    .line 262
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    const/high16 v13, -0x40800000    # -1.0f

    .line 267
    .line 268
    const/high16 v14, 0x3f800000    # 1.0f

    .line 269
    .line 270
    invoke-static {v12, v13, v14}, Ld0/w;->h(FFF)F

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    const/4 v13, 0x0

    .line 275
    cmpg-float v13, v12, v13

    .line 276
    .line 277
    if-gez v13, :cond_b

    .line 278
    .line 279
    neg-float v12, v12

    .line 280
    const/high16 v13, -0x31000000

    .line 281
    .line 282
    :goto_5
    mul-float/2addr v12, v13

    .line 283
    float-to-int v12, v12

    .line 284
    goto :goto_6

    .line 285
    :cond_b
    const/high16 v13, 0x4f000000

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    and-int/lit16 v12, v12, 0xff

    .line 293
    .line 294
    shl-int/lit8 v12, v12, 0x18

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    and-int/lit16 v12, v12, 0xff

    .line 302
    .line 303
    shl-int/lit8 v12, v12, 0x10

    .line 304
    .line 305
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    goto :goto_4

    .line 310
    :goto_6
    int-to-long v12, v12

    .line 311
    int-to-long v9, v2

    .line 312
    mul-long/2addr v12, v9

    .line 313
    div-long/2addr v12, v4

    .line 314
    long-to-int v9, v12

    .line 315
    if-eq v7, v11, :cond_16

    .line 316
    .line 317
    const/4 v10, 0x3

    .line 318
    if-eq v7, v10, :cond_15

    .line 319
    .line 320
    const/4 v10, 0x4

    .line 321
    if-eq v7, v10, :cond_13

    .line 322
    .line 323
    if-eq v7, v15, :cond_12

    .line 324
    .line 325
    const/16 v10, 0x16

    .line 326
    .line 327
    if-eq v7, v10, :cond_11

    .line 328
    .line 329
    const/high16 v10, 0x10000000

    .line 330
    .line 331
    if-eq v7, v10, :cond_10

    .line 332
    .line 333
    const/high16 v10, 0x50000000

    .line 334
    .line 335
    if-eq v7, v10, :cond_f

    .line 336
    .line 337
    const/high16 v10, 0x60000000

    .line 338
    .line 339
    if-ne v7, v10, :cond_e

    .line 340
    .line 341
    shr-int/lit8 v10, v9, 0x18

    .line 342
    .line 343
    int-to-byte v10, v10

    .line 344
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 345
    .line 346
    .line 347
    shr-int/lit8 v10, v9, 0x10

    .line 348
    .line 349
    int-to-byte v10, v10

    .line 350
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 351
    .line 352
    .line 353
    shr-int/lit8 v10, v9, 0x8

    .line 354
    .line 355
    int-to-byte v10, v10

    .line 356
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 357
    .line 358
    .line 359
    int-to-byte v9, v9

    .line 360
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    .line 363
    goto/16 :goto_7

    .line 364
    .line 365
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 368
    .line 369
    .line 370
    throw v1

    .line 371
    :cond_f
    shr-int/lit8 v10, v9, 0x18

    .line 372
    .line 373
    int-to-byte v10, v10

    .line 374
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 375
    .line 376
    .line 377
    shr-int/lit8 v10, v9, 0x10

    .line 378
    .line 379
    int-to-byte v10, v10

    .line 380
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 381
    .line 382
    .line 383
    shr-int/lit8 v9, v9, 0x8

    .line 384
    .line 385
    int-to-byte v9, v9

    .line 386
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_10
    shr-int/lit8 v10, v9, 0x18

    .line 391
    .line 392
    int-to-byte v10, v10

    .line 393
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    .line 396
    shr-int/lit8 v9, v9, 0x10

    .line 397
    .line 398
    int-to-byte v9, v9

    .line 399
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_11
    int-to-byte v10, v9

    .line 404
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 405
    .line 406
    .line 407
    shr-int/lit8 v10, v9, 0x8

    .line 408
    .line 409
    int-to-byte v10, v10

    .line 410
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    .line 413
    shr-int/lit8 v10, v9, 0x10

    .line 414
    .line 415
    int-to-byte v10, v10

    .line 416
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 417
    .line 418
    .line 419
    shr-int/lit8 v9, v9, 0x18

    .line 420
    .line 421
    int-to-byte v9, v9

    .line 422
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_12
    shr-int/lit8 v10, v9, 0x8

    .line 427
    .line 428
    int-to-byte v10, v10

    .line 429
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 430
    .line 431
    .line 432
    shr-int/lit8 v10, v9, 0x10

    .line 433
    .line 434
    int-to-byte v10, v10

    .line 435
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 436
    .line 437
    .line 438
    shr-int/lit8 v9, v9, 0x18

    .line 439
    .line 440
    int-to-byte v9, v9

    .line 441
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 442
    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_13
    if-gez v9, :cond_14

    .line 446
    .line 447
    int-to-float v9, v9

    .line 448
    neg-float v9, v9

    .line 449
    const/high16 v10, -0x31000000

    .line 450
    .line 451
    div-float/2addr v9, v10

    .line 452
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_14
    int-to-float v9, v9

    .line 457
    const/high16 v10, 0x4f000000

    .line 458
    .line 459
    div-float/2addr v9, v10

    .line 460
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 461
    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_15
    shr-int/lit8 v9, v9, 0x18

    .line 465
    .line 466
    int-to-byte v9, v9

    .line 467
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 468
    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_16
    shr-int/lit8 v10, v9, 0x10

    .line 472
    .line 473
    int-to-byte v10, v10

    .line 474
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 475
    .line 476
    .line 477
    shr-int/lit8 v9, v9, 0x18

    .line 478
    .line 479
    int-to-byte v9, v9

    .line 480
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 481
    .line 482
    .line 483
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 484
    .line 485
    .line 486
    move-result v9

    .line 487
    iget v10, v6, Lj0/p;->d:I

    .line 488
    .line 489
    add-int/2addr v10, v8

    .line 490
    if-ne v9, v10, :cond_4

    .line 491
    .line 492
    add-int/lit8 v2, v2, 0x1

    .line 493
    .line 494
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    goto/16 :goto_2

    .line 499
    .line 500
    :cond_17
    move-object/from16 v1, p1

    .line 501
    .line 502
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 506
    .line 507
    .line 508
    :goto_8
    iput-object v3, v0, Lj0/v;->R:Ljava/nio/ByteBuffer;

    .line 509
    .line 510
    return-void
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

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj0/v;->t:Lj0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, v0, Lj0/p;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Ld0/w;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

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
