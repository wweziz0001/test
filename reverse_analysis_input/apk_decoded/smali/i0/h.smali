.class public final Li0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public final a:Landroid/content/Context;

.field public final b:Li0/e;

.field public final c:Landroid/media/metrics/PlaybackSession;

.field public final d:J

.field public final e:La0/T;

.field public final f:La0/S;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public i:Ljava/lang/String;

.field public j:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public k:I

.field public l:I

.field public m:I

.field public n:Lh0/o;

.field public o:LD0/d;

.field public p:LD0/d;

.field public q:LD0/d;

.field public r:La0/p;

.field public s:La0/p;

.field public t:La0/p;

.field public u:Z

.field public v:I

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Li0/h;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Li0/h;->c:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    new-instance p1, La0/T;

    .line 13
    .line 14
    invoke-direct {p1}, La0/T;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Li0/h;->e:La0/T;

    .line 18
    .line 19
    new-instance p1, La0/S;

    .line 20
    .line 21
    invoke-direct {p1}, La0/S;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Li0/h;->f:La0/S;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Li0/h;->h:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Li0/h;->g:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Li0/h;->d:J

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    iput p1, p0, Li0/h;->l:I

    .line 48
    .line 49
    iput p1, p0, Li0/h;->m:I

    .line 50
    .line 51
    new-instance p1, Li0/e;

    .line 52
    .line 53
    invoke-direct {p1}, Li0/e;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Li0/h;->b:Li0/e;

    .line 57
    .line 58
    iput-object p0, p1, Li0/e;->d:Li0/h;

    .line 59
    .line 60
    return-void
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
.method public final a(LD0/d;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, LD0/d;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Li0/h;->b:Li0/e;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, v0, Li0/e;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    return p1
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

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Li0/h;->A:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Li0/h;->z:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Li0/f;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Li0/h;->x:I

    .line 18
    .line 19
    invoke-static {v0, v2}, Li0/f;->A(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Li0/h;->y:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Li0/f;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Li0/h;->g:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Li0/h;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, Li0/f;->r(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Li0/h;->h:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Li0/h;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, Li0/f;->z(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, Li0/f;->C(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Li0/h;->c:Landroid/media/metrics/PlaybackSession;

    .line 96
    .line 97
    iget-object v2, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 98
    .line 99
    invoke-static {v2}, Li0/f;->l(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v0, v2}, Li0/f;->u(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 108
    .line 109
    iput-object v0, p0, Li0/h;->i:Ljava/lang/String;

    .line 110
    .line 111
    iput v1, p0, Li0/h;->z:I

    .line 112
    .line 113
    iput v1, p0, Li0/h;->x:I

    .line 114
    .line 115
    iput v1, p0, Li0/h;->y:I

    .line 116
    .line 117
    iput-object v0, p0, Li0/h;->r:La0/p;

    .line 118
    .line 119
    iput-object v0, p0, Li0/h;->s:La0/p;

    .line 120
    .line 121
    iput-object v0, p0, Li0/h;->t:La0/p;

    .line 122
    .line 123
    iput-boolean v1, p0, Li0/h;->A:Z

    .line 124
    .line 125
    return-void
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

.method public final c(La0/U;Lx0/H;)V
    .locals 8

    .line 1
    iget-object v0, p0, Li0/h;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p2, p2, Lx0/H;->a:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, La0/U;->b(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, Li0/h;->f:La0/S;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, p2, v1, v2}, La0/U;->f(ILa0/S;Z)La0/S;

    .line 20
    .line 21
    .line 22
    iget p2, v1, La0/S;->c:I

    .line 23
    .line 24
    iget-object v1, p0, Li0/h;->e:La0/T;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v1}, La0/U;->n(ILa0/T;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, La0/T;->c:La0/A;

    .line 30
    .line 31
    iget-object p1, p1, La0/A;->b:La0/w;

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v2, p1, La0/w;->a:Landroid/net/Uri;

    .line 39
    .line 40
    iget-object p1, p1, La0/w;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, p1}, Ld0/w;->F(Landroid/net/Uri;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    if-eq p1, v3, :cond_4

    .line 49
    .line 50
    if-eq p1, p2, :cond_3

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v2, 0x4

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/4 v2, 0x5

    .line 57
    goto :goto_0

    .line 58
    :cond_5
    const/4 v2, 0x3

    .line 59
    :goto_0
    invoke-static {v0, v2}, Li0/f;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 60
    .line 61
    .line 62
    iget-wide v4, v1, La0/T;->m:J

    .line 63
    .line 64
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long p1, v4, v6

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    iget-boolean p1, v1, La0/T;->k:Z

    .line 74
    .line 75
    if-nez p1, :cond_6

    .line 76
    .line 77
    iget-boolean p1, v1, La0/T;->i:Z

    .line 78
    .line 79
    if-nez p1, :cond_6

    .line 80
    .line 81
    invoke-virtual {v1}, La0/T;->a()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    iget-wide v4, v1, La0/T;->m:J

    .line 88
    .line 89
    invoke-static {v4, v5}, Ld0/w;->Z(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v0, v4, v5}, Li0/g;->o(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-virtual {v1}, La0/T;->a()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_7
    move p2, v3

    .line 104
    :goto_1
    invoke-static {v0, p2}, Li0/g;->n(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, Li0/h;->A:Z

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

.method public final d(Li0/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p1, Li0/a;->d:Lx0/H;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lx0/H;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Li0/h;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Li0/h;->b()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    iget-object p1, p0, Li0/h;->g:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Li0/h;->h:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
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

.method public final e(IJLa0/p;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Li0/f;->p(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Li0/h;->d:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, Li0/g;->g(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_d

    .line 14
    .line 15
    invoke-static {p1}, LS2/c;->x(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    if-eq p5, p2, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-eq p5, p3, :cond_2

    .line 23
    .line 24
    if-eq p5, v0, :cond_0

    .line 25
    .line 26
    move v0, p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, p3

    .line 31
    :cond_2
    :goto_0
    invoke-static {p1, v0}, LS2/c;->p(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 32
    .line 33
    .line 34
    iget-object p5, p4, La0/p;->m:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p5, :cond_3

    .line 37
    .line 38
    invoke-static {p1, p5}, LS2/c;->q(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    iget-object p5, p4, La0/p;->n:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p5, :cond_4

    .line 44
    .line 45
    invoke-static {p1, p5}, LS2/c;->z(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_4
    iget-object p5, p4, La0/p;->k:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz p5, :cond_5

    .line 51
    .line 52
    invoke-static {p1, p5}, LS2/c;->B(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_5
    const/4 p5, -0x1

    .line 56
    iget v0, p4, La0/p;->j:I

    .line 57
    .line 58
    if-eq v0, p5, :cond_6

    .line 59
    .line 60
    invoke-static {p1, v0}, LS2/c;->y(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 61
    .line 62
    .line 63
    :cond_6
    iget v0, p4, La0/p;->u:I

    .line 64
    .line 65
    if-eq v0, p5, :cond_7

    .line 66
    .line 67
    invoke-static {p1, v0}, LS2/c;->A(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 68
    .line 69
    .line 70
    :cond_7
    iget v0, p4, La0/p;->v:I

    .line 71
    .line 72
    if-eq v0, p5, :cond_8

    .line 73
    .line 74
    invoke-static {p1, v0}, LS2/c;->C(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_8
    iget v0, p4, La0/p;->C:I

    .line 78
    .line 79
    if-eq v0, p5, :cond_9

    .line 80
    .line 81
    invoke-static {p1, v0}, LS2/c;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 82
    .line 83
    .line 84
    :cond_9
    iget v0, p4, La0/p;->D:I

    .line 85
    .line 86
    if-eq v0, p5, :cond_a

    .line 87
    .line 88
    invoke-static {p1, v0}, Li0/g;->p(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 89
    .line 90
    .line 91
    :cond_a
    iget-object v0, p4, La0/p;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v0, :cond_c

    .line 94
    .line 95
    sget v1, Ld0/w;->a:I

    .line 96
    .line 97
    const-string v1, "-"

    .line 98
    .line 99
    invoke-virtual {v0, v1, p5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    const/4 v0, 0x0

    .line 104
    aget-object v0, p5, v0

    .line 105
    .line 106
    array-length v1, p5

    .line 107
    if-lt v1, p3, :cond_b

    .line 108
    .line 109
    aget-object p3, p5, p2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_b
    const/4 p3, 0x0

    .line 113
    :goto_1
    invoke-static {v0, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p5, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {p1, p5}, Li0/g;->q(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz p3, :cond_c

    .line 127
    .line 128
    check-cast p3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {p1, p3}, Li0/g;->z(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_c
    iget p3, p4, La0/p;->w:F

    .line 134
    .line 135
    const/high16 p4, -0x40800000    # -1.0f

    .line 136
    .line 137
    cmpl-float p4, p3, p4

    .line 138
    .line 139
    if-eqz p4, :cond_e

    .line 140
    .line 141
    invoke-static {p1, p3}, LS2/c;->o(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_d
    invoke-static {p1}, LS2/c;->n(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 146
    .line 147
    .line 148
    :cond_e
    :goto_2
    iput-boolean p2, p0, Li0/h;->A:Z

    .line 149
    .line 150
    iget-object p2, p0, Li0/h;->c:Landroid/media/metrics/PlaybackSession;

    .line 151
    .line 152
    invoke-static {p1}, LS2/c;->h(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p2, p1}, LS2/c;->m(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 157
    .line 158
    .line 159
    return-void
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
