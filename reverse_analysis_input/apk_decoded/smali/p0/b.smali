.class public final Lp0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/e;
.implements Lg0/b;


# instance fields
.field public final a:Lg0/g;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayDeque;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:[Lg0/e;

.field public final f:[Lg0/f;

.field public g:I

.field public h:I

.field public i:Lg0/e;

.field public j:Lg0/c;

.field public k:Z

.field public l:Z

.field public m:J

.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc1/l;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, Lp0/b;->n:I

    const/4 v0, 0x2

    .line 1
    new-array v1, v0, [Lc1/i;

    new-array v0, v0, [Lc1/c;

    invoke-direct {p0, v1, v0}, Lp0/b;-><init>([Lg0/e;[Lg0/f;)V

    .line 2
    iget v0, p0, Lp0/b;->g:I

    iget-object v1, p0, Lp0/b;->e:[Lg0/e;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 3
    array-length v0, v1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v2, v1, v3

    const/16 v4, 0x400

    .line 4
    invoke-virtual {v2, v4}, Lg0/e;->j(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 5
    :cond_1
    iput-object p1, p0, Lp0/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0/b;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lp0/b;->n:I

    const/4 v0, 0x1

    .line 28
    new-array v1, v0, [Lg0/e;

    new-array v0, v0, [Lp0/a;

    invoke-direct {p0, v1, v0}, Lp0/b;-><init>([Lg0/e;[Lg0/f;)V

    .line 29
    iput-object p1, p0, Lp0/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Lg0/e;[Lg0/f;)V
    .locals 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide v0, p0, Lp0/b;->m:J

    .line 9
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 11
    iput-object p1, p0, Lp0/b;->e:[Lg0/e;

    .line 12
    array-length p1, p1

    iput p1, p0, Lp0/b;->g:I

    const/4 p1, 0x0

    move v0, p1

    .line 13
    :goto_0
    iget v1, p0, Lp0/b;->g:I

    if-ge v0, v1, :cond_0

    .line 14
    iget-object v1, p0, Lp0/b;->e:[Lg0/e;

    iget v2, p0, Lp0/b;->n:I

    packed-switch v2, :pswitch_data_0

    .line 15
    new-instance v2, Lc1/i;

    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Lg0/e;-><init>(I)V

    goto :goto_1

    .line 17
    :pswitch_0
    new-instance v2, Lg0/e;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lg0/e;-><init>(I)V

    .line 18
    :goto_1
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 19
    :cond_0
    iput-object p2, p0, Lp0/b;->f:[Lg0/f;

    .line 20
    array-length p2, p2

    iput p2, p0, Lp0/b;->h:I

    .line 21
    :goto_2
    iget p2, p0, Lp0/b;->h:I

    if-ge p1, p2, :cond_1

    .line 22
    iget-object p2, p0, Lp0/b;->f:[Lg0/f;

    iget v0, p0, Lp0/b;->n:I

    packed-switch v0, :pswitch_data_1

    .line 23
    new-instance v0, Lc1/c;

    invoke-direct {v0, p0}, Lc1/c;-><init>(Lp0/b;)V

    goto :goto_3

    .line 24
    :pswitch_1
    new-instance v0, Lp0/a;

    invoke-direct {v0, p0}, Lp0/a;-><init>(Lp0/b;)V

    .line 25
    :goto_3
    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 26
    :cond_1
    new-instance p1, Lg0/g;

    invoke-direct {p1, p0}, Lg0/g;-><init>(Lp0/b;)V

    iput-object p1, p0, Lp0/b;->a:Lg0/g;

    .line 27
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(J)V
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

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp0/b;->i()Lg0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final c()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp0/b;->j:Lg0/c;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lp0/b;->i:Lg0/e;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lp0/b;->g:I

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v3, p0, Lp0/b;->e:[Lg0/e;

    .line 26
    .line 27
    sub-int/2addr v1, v2

    .line 28
    iput v1, p0, Lp0/b;->g:I

    .line 29
    .line 30
    aget-object v1, v3, v1

    .line 31
    .line 32
    :goto_1
    iput-object v1, p0, Lp0/b;->i:Lg0/e;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    throw v1

    .line 39
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
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

.method public final bridge synthetic d(Lc1/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp0/b;->j(Lg0/e;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final e(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lp0/b;->g:I

    .line 5
    .line 6
    iget-object v2, p0, Lp0/b;->e:[Lg0/e;

    .line 7
    .line 8
    array-length v2, v2

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    iget-boolean v1, p0, Lp0/b;->k:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 21
    :goto_1
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lp0/b;->m:J

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
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

.method public final f(Ljava/lang/Throwable;)Lg0/c;
    .locals 2

    .line 1
    iget v0, p0, Lp0/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc1/f;

    .line 7
    .line 8
    const-string v1, "Unexpected decode error"

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lp0/d;

    .line 15
    .line 16
    const-string v1, "Unexpected decode error"

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lp0/b;->k:Z

    .line 6
    .line 7
    iget-object v1, p0, Lp0/b;->i:Lg0/e;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lg0/e;->f()V

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lp0/b;->g:I

    .line 15
    .line 16
    add-int/lit8 v3, v2, 0x1

    .line 17
    .line 18
    iput v3, p0, Lp0/b;->g:I

    .line 19
    .line 20
    iget-object v3, p0, Lp0/b;->e:[Lg0/e;

    .line 21
    .line 22
    aput-object v1, v3, v2

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-object v1, p0, Lp0/b;->i:Lg0/e;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    iget-object v1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lg0/e;

    .line 45
    .line 46
    invoke-virtual {v1}, Lg0/e;->f()V

    .line 47
    .line 48
    .line 49
    iget v2, p0, Lp0/b;->g:I

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    iput v3, p0, Lp0/b;->g:I

    .line 54
    .line 55
    iget-object v3, p0, Lp0/b;->e:[Lg0/e;

    .line 56
    .line 57
    aput-object v1, v3, v2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_1
    iget-object v1, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lg0/f;

    .line 75
    .line 76
    invoke-virtual {v1}, Lg0/f;->i()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    monitor-exit v0

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw v1
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

.method public final g(Lg0/e;Lg0/f;Z)Lg0/c;
    .locals 7

    .line 1
    iget v0, p0, Lp0/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc1/i;

    .line 7
    .line 8
    check-cast p2, Lc1/c;

    .line 9
    .line 10
    :try_start_0
    iget-object v0, p1, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, Lp0/b;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lc1/l;

    .line 26
    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, Lc1/l;->reset()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p3, 0x0

    .line 33
    invoke-interface {v2, v1, p3, v0}, Lc1/l;->v([BII)Lc1/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-wide v1, p1, Lg0/e;->r:J

    .line 38
    .line 39
    iget-wide v3, p1, Lc1/i;->u:J

    .line 40
    .line 41
    iput-wide v1, p2, Lg0/f;->n:J

    .line 42
    .line 43
    iput-object v0, p2, Lc1/c;->p:Lc1/d;

    .line 44
    .line 45
    const-wide v5, 0x7fffffffffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    cmp-long p1, v3, v5

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-wide v1, v3

    .line 56
    :goto_0
    iput-wide v1, p2, Lc1/c;->q:J

    .line 57
    .line 58
    iput-boolean p3, p2, Lg0/f;->o:Z
    :try_end_0
    .catch Lc1/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    :goto_1
    return-object p1

    .line 64
    :pswitch_0
    check-cast p2, Lp0/a;

    .line 65
    .line 66
    :try_start_1
    iget-object p3, p1, Lg0/e;->p:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const/4 v0, 0x0

    .line 87
    :goto_2
    invoke-static {v0}, Ld0/m;->c(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lp0/b;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Li0/b;

    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p3, v1}, Li0/b;->d(I[B)Landroid/graphics/Bitmap;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    iput-object p3, p2, Lp0/a;->p:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    iget-wide v0, p1, Lg0/e;->r:J

    .line 112
    .line 113
    iput-wide v0, p2, Lg0/f;->n:J
    :try_end_1
    .catch Lp0/d; {:try_start_1 .. :try_end_1} :catch_1

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    goto :goto_3

    .line 117
    :catch_1
    move-exception p1

    .line 118
    :goto_3
    return-object p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final h()Z
    .locals 13

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lp0/b;->l:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget v1, p0, Lp0/b;->h:I

    .line 19
    .line 20
    if-lez v1, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_1
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :cond_1
    iget-boolean v1, p0, Lp0/b;->l:Z

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return v2

    .line 42
    :cond_2
    iget-object v1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lg0/e;

    .line 49
    .line 50
    iget-object v4, p0, Lp0/b;->f:[Lg0/f;

    .line 51
    .line 52
    iget v5, p0, Lp0/b;->h:I

    .line 53
    .line 54
    sub-int/2addr v5, v3

    .line 55
    iput v5, p0, Lp0/b;->h:I

    .line 56
    .line 57
    aget-object v4, v4, v5

    .line 58
    .line 59
    iget-boolean v5, p0, Lp0/b;->k:Z

    .line 60
    .line 61
    iput-boolean v2, p0, Lp0/b;->k:Z

    .line 62
    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x4

    .line 65
    invoke-virtual {v1, v0}, Le0/d;->e(I)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4, v0}, Le0/d;->b(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_3
    iget-wide v6, v1, Lg0/e;->r:J

    .line 76
    .line 77
    iput-wide v6, v4, Lg0/f;->n:J

    .line 78
    .line 79
    const/high16 v0, 0x8000000

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Le0/d;->e(I)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Le0/d;->b(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    iget-wide v6, v1, Lg0/e;->r:J

    .line 91
    .line 92
    iget-object v8, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter v8

    .line 95
    :try_start_1
    iget-wide v9, p0, Lp0/b;->m:J

    .line 96
    .line 97
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    cmp-long v0, v9, v11

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    cmp-long v0, v6, v9

    .line 107
    .line 108
    if-ltz v0, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move v0, v2

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    :goto_2
    move v0, v3

    .line 114
    :goto_3
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    iput-boolean v3, v4, Lg0/f;->o:Z

    .line 118
    .line 119
    :cond_7
    :try_start_2
    invoke-virtual {p0, v1, v4, v5}, Lp0/b;->g(Lg0/e;Lg0/f;Z)Lg0/c;

    .line 120
    .line 121
    .line 122
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    goto :goto_4

    .line 124
    :catch_0
    move-exception v0

    .line 125
    invoke-virtual {p0, v0}, Lp0/b;->f(Ljava/lang/Throwable;)Lg0/c;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto :goto_4

    .line 130
    :catch_1
    move-exception v0

    .line 131
    invoke-virtual {p0, v0}, Lp0/b;->f(Ljava/lang/Throwable;)Lg0/c;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_4
    if-eqz v0, :cond_8

    .line 136
    .line 137
    iget-object v5, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 138
    .line 139
    monitor-enter v5

    .line 140
    :try_start_3
    iput-object v0, p0, Lp0/b;->j:Lg0/c;

    .line 141
    .line 142
    monitor-exit v5

    .line 143
    return v2

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    throw v0

    .line 147
    :cond_8
    :goto_5
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 148
    .line 149
    monitor-enter v0

    .line 150
    :try_start_4
    iget-boolean v2, p0, Lp0/b;->k:Z

    .line 151
    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    invoke-virtual {v4}, Lg0/f;->i()V

    .line 155
    .line 156
    .line 157
    goto :goto_6

    .line 158
    :catchall_2
    move-exception v1

    .line 159
    goto :goto_7

    .line 160
    :cond_9
    iget-boolean v2, v4, Lg0/f;->o:Z

    .line 161
    .line 162
    if-eqz v2, :cond_a

    .line 163
    .line 164
    invoke-virtual {v4}, Lg0/f;->i()V

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_a
    iget-object v2, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :goto_6
    invoke-virtual {v1}, Lg0/e;->f()V

    .line 174
    .line 175
    .line 176
    iget v2, p0, Lp0/b;->g:I

    .line 177
    .line 178
    add-int/lit8 v4, v2, 0x1

    .line 179
    .line 180
    iput v4, p0, Lp0/b;->g:I

    .line 181
    .line 182
    iget-object v4, p0, Lp0/b;->e:[Lg0/e;

    .line 183
    .line 184
    aput-object v1, v4, v2

    .line 185
    .line 186
    monitor-exit v0

    .line 187
    return v3

    .line 188
    :goto_7
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 189
    throw v1

    .line 190
    :catchall_3
    move-exception v0

    .line 191
    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 192
    throw v0

    .line 193
    :goto_8
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 194
    throw v1
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

.method public final i()Lg0/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp0/b;->j:Lg0/c;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lp0/b;->d:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lg0/f;

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object v1

    .line 31
    :cond_1
    throw v1

    .line 32
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw v1
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

.method public final j(Lg0/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp0/b;->j:Lg0/c;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lp0/b;->i:Lg0/e;

    .line 9
    .line 10
    if-ne p1, v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget p1, p0, Lp0/b;->h:I

    .line 32
    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lp0/b;->i:Lg0/e;

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    throw v1

    .line 48
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
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

.method public final k(Lg0/f;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lg0/f;->f()V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lp0/b;->h:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iput v2, p0, Lp0/b;->h:I

    .line 12
    .line 13
    iget-object v2, p0, Lp0/b;->f:[Lg0/f;

    .line 14
    .line 15
    aput-object p1, v2, v1

    .line 16
    .line 17
    iget-object p1, p0, Lp0/b;->c:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget p1, p0, Lp0/b;->h:I

    .line 26
    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 32
    .line 33
    .line 34
    :cond_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1
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

.method public final release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lp0/b;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, Lp0/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :try_start_1
    iget-object v0, p0, Lp0/b;->a:Lg0/g;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    throw v1
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
