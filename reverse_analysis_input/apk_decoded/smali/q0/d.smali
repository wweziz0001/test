.class public final Lq0/d;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lq0/f;


# direct methods
.method public constructor <init>(Lq0/f;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/d;->a:Lq0/f;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lq0/d;->a:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_9

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v1, v2, :cond_6

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-eq v1, v2, :cond_5

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    iget-object v1, v0, Lq0/f;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    iget p1, p1, Landroid/os/Message;->what:I

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroid/os/Bundle;

    .line 53
    .line 54
    :try_start_0
    iget-object v1, v0, Lq0/f;->a:Landroid/media/MediaCodec;

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :catch_0
    move-exception p1

    .line 62
    iget-object v1, v0, Lq0/f;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v1, v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    iget-object p1, v0, Lq0/f;->e:LF0/N;

    .line 79
    .line 80
    invoke-virtual {p1}, LF0/N;->a()Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v1, p1

    .line 87
    check-cast v1, Lq0/e;

    .line 88
    .line 89
    iget v5, v1, Lq0/e;->a:I

    .line 90
    .line 91
    iget-object v7, v1, Lq0/e;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 92
    .line 93
    iget-wide v8, v1, Lq0/e;->d:J

    .line 94
    .line 95
    iget v10, v1, Lq0/e;->e:I

    .line 96
    .line 97
    :try_start_1
    sget-object p1, Lq0/f;->h:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 100
    :try_start_2
    iget-object v4, v0, Lq0/f;->a:Landroid/media/MediaCodec;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 104
    .line 105
    .line 106
    monitor-exit p1

    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v2

    .line 109
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    :try_start_3
    throw v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 111
    :catch_1
    move-exception p1

    .line 112
    move-object v2, p1

    .line 113
    iget-object v4, v0, Lq0/f;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 114
    .line 115
    :cond_7
    invoke-virtual {v4, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_8

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_8
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    :goto_0
    move-object v3, v1

    .line 129
    goto :goto_2

    .line 130
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Lq0/e;

    .line 133
    .line 134
    iget v5, p1, Lq0/e;->a:I

    .line 135
    .line 136
    iget v7, p1, Lq0/e;->b:I

    .line 137
    .line 138
    iget-wide v8, p1, Lq0/e;->d:J

    .line 139
    .line 140
    iget v10, p1, Lq0/e;->e:I

    .line 141
    .line 142
    :try_start_4
    iget-object v4, v0, Lq0/f;->a:Landroid/media/MediaCodec;

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catch_2
    move-exception v1

    .line 150
    iget-object v0, v0, Lq0/f;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 151
    .line 152
    :cond_a
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_b

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_b
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    :goto_1
    move-object v3, p1

    .line 166
    :goto_2
    if-eqz v3, :cond_c

    .line 167
    .line 168
    sget-object p1, Lq0/f;->g:Ljava/util/ArrayDeque;

    .line 169
    .line 170
    monitor-enter p1

    .line 171
    :try_start_5
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    monitor-exit p1

    .line 175
    goto :goto_3

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 178
    throw v0

    .line 179
    :cond_c
    :goto_3
    return-void
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
