.class public final Ldev/fluttercommunity/workmanager/BackgroundWorker;
.super LQ1/p;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# static fields
.field public static final w:Lh3/f;


# instance fields
.field public final p:Landroidx/work/WorkerParameters;

.field public q:Ln3/q;

.field public final r:I

.field public s:Le3/c;

.field public t:J

.field public final u:Lr/h;

.field public final v:Lr/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lh3/f;

    .line 2
    .line 3
    invoke-static {}, LZ1/m;->z()LZ1/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LZ1/m;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La0/z;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 15
    .line 16
    invoke-direct {v1}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LZ1/m;->z()LZ1/m;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, LZ1/m;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lh3/f;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->w:Lh3/f;

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

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 3

    .line 1
    const-string v0, "applicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LQ1/p;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->p:Landroidx/work/WorkerParameters;

    .line 15
    .line 16
    new-instance p1, Ljava/util/Random;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/Random;->nextInt()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->r:I

    .line 26
    .line 27
    new-instance p1, Lr/h;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lr/k;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p1, Lr/h;->c:Lr/k;

    .line 38
    .line 39
    new-instance p2, Lr/j;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Lr/j;-><init>(Lr/h;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p1, Lr/h;->b:Lr/j;

    .line 45
    .line 46
    const-class v0, Lb3/a;

    .line 47
    .line 48
    iput-object v0, p1, Lr/h;->a:Ljava/lang/Class;

    .line 49
    .line 50
    :try_start_0
    iput-object p1, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->u:Lr/h;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception p1

    .line 54
    iget-object v0, p2, Lr/j;->b:Lr/i;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v1, Lr/b;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Lr/b;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lr/g;->f:LD1/b;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {p1, v0, v2, v1}, LD1/b;->i(Lr/g;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    invoke-static {v0}, Lr/g;->c(Lr/g;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    :goto_0
    iput-object p2, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->v:Lr/j;

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


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldev/fluttercommunity/workmanager/BackgroundWorker;->f(LQ1/o;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final c()Lq2/b;
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->t:J

    .line 6
    .line 7
    new-instance v0, Le3/c;

    .line 8
    .line 9
    iget-object v1, p0, LQ1/p;->l:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Le3/c;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->s:Le3/c;

    .line 15
    .line 16
    sget-object v0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->w:Lh3/f;

    .line 17
    .line 18
    iget-boolean v2, v0, Lh3/f;->a:Z

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lh3/f;->c(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v5, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v5, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lb3/b;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v6, p0, v1}, Lb3/b;-><init>(Ldev/fluttercommunity/workmanager/BackgroundWorker;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-ne v1, v2, :cond_3

    .line 49
    .line 50
    iget-object v1, v0, Lh3/f;->b:La0/z;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-boolean v1, v0, Lh3/f;->a:Z

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance v1, Lh3/c;

    .line 63
    .line 64
    iget-object v4, p0, LQ1/p;->l:Landroid/content/Context;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    move-object v2, v1

    .line 68
    move-object v3, v0

    .line 69
    invoke-direct/range {v2 .. v7}, Lh3/c;-><init>(Lh3/f;Landroid/content/Context;Landroid/os/Handler;Lb3/b;I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, Lh3/f;->f:Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iget-object v0, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->v:Lr/j;

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "ensureInitializationComplete must be called after startInitialization"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v1, "ensureInitializationComplete must be called on the main thread"

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0
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

.method public final f(LQ1/o;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    iget-wide v3, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->t:J

    .line 7
    .line 8
    sub-long/2addr v1, v3

    .line 9
    iget-object v3, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->p:Landroidx/work/WorkerParameters;

    .line 10
    .line 11
    iget-object v4, v3, Landroidx/work/WorkerParameters;->b:LQ1/g;

    .line 12
    .line 13
    iget-object v4, v4, LQ1/g;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    const-string v5, "be.tramckrijte.workmanager.IS_IN_DEBUG_MODE_KEY"

    .line 16
    .line 17
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    check-cast v4, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v4, v0

    .line 33
    :goto_0
    const/4 v5, 0x0

    .line 34
    if-eqz v4, :cond_7

    .line 35
    .line 36
    sget-object v4, Lb3/e;->a:Ljava/text/DateFormat;

    .line 37
    .line 38
    iget-object v4, p0, LQ1/p;->l:Landroid/content/Context;

    .line 39
    .line 40
    const-string v6, "getApplicationContext(...)"

    .line 41
    .line 42
    invoke-static {v4, v6}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v6, v3, Landroidx/work/WorkerParameters;->b:LQ1/g;

    .line 46
    .line 47
    iget-object v6, v6, LQ1/g;->a:Ljava/util/HashMap;

    .line 48
    .line 49
    const-string v7, "be.tramckrijte.workmanager.DART_TASK"

    .line 50
    .line 51
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    instance-of v7, v6, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object v6, v5

    .line 63
    :goto_1
    invoke-static {v6}, LN3/h;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, v3, Landroidx/work/WorkerParameters;->b:LQ1/g;

    .line 67
    .line 68
    iget-object v3, v3, LQ1/g;->a:Ljava/util/HashMap;

    .line 69
    .line 70
    const-string v7, "be.tramckrijte.workmanager.INPUT_DATA"

    .line 71
    .line 72
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    instance-of v7, v3, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move-object v3, v5

    .line 84
    :goto_2
    if-nez p1, :cond_3

    .line 85
    .line 86
    new-instance v7, LQ1/l;

    .line 87
    .line 88
    invoke-direct {v7}, LQ1/l;-><init>()V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move-object v7, p1

    .line 93
    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v9, "\ud83d\udc77\u200d\u2640\ufe0f"

    .line 99
    .line 100
    const-string v10, "\ud83d\udc77\u200d\u2642\ufe0f"

    .line 101
    .line 102
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-static {v9}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    sget-object v10, LP3/d;->l:LP3/c;

    .line 111
    .line 112
    const-string v11, "random"

    .line 113
    .line 114
    invoke-static {v10, v11}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_6

    .line 122
    .line 123
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    sget-object v11, LP3/d;->m:LP3/a;

    .line 128
    .line 129
    invoke-virtual {v11, v10}, LP3/a;->b(I)I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    check-cast v9, Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const/16 v9, 0x20

    .line 143
    .line 144
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    new-instance v10, Ljava/util/Date;

    .line 148
    .line 149
    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 150
    .line 151
    .line 152
    sget-object v11, Lb3/e;->a:Ljava/text/DateFormat;

    .line 153
    .line 154
    invoke-virtual {v11, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    new-instance v10, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v11, "\n            \u2022 Result: "

    .line 168
    .line 169
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    instance-of v11, v7, LQ1/n;

    .line 173
    .line 174
    if-eqz v11, :cond_4

    .line 175
    .line 176
    const-string v11, "\ud83c\udf89"

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    const-string v11, "\ud83d\udd25"

    .line 180
    .line 181
    :goto_4
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v7, "\n            \u2022 dartTask: "

    .line 199
    .line 200
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v6, "\n            \u2022 inputData: "

    .line 207
    .line 208
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    if-nez v3, :cond_5

    .line 212
    .line 213
    const-string v3, "not found"

    .line 214
    .line 215
    :cond_5
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v3, "\n            \u2022 Elapsed time: "

    .line 219
    .line 220
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    new-instance v3, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 229
    .line 230
    invoke-virtual {v6, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v1, " seconds."

    .line 238
    .line 239
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v1, "\n            "

    .line 250
    .line 251
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static {v1}, LU3/e;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget v2, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->r:I

    .line 263
    .line 264
    invoke-static {v4, v2, v8, v1}, Lb3/e;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_6
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 269
    .line 270
    const-string v0, "Collection is empty."

    .line 271
    .line 272
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    :cond_7
    :goto_5
    if-eqz p1, :cond_9

    .line 277
    .line 278
    iget-object v1, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->u:Lr/h;

    .line 279
    .line 280
    if-eqz v1, :cond_9

    .line 281
    .line 282
    const/4 v2, 0x1

    .line 283
    iput-boolean v2, v1, Lr/h;->d:Z

    .line 284
    .line 285
    iget-object v3, v1, Lr/h;->b:Lr/j;

    .line 286
    .line 287
    if-eqz v3, :cond_9

    .line 288
    .line 289
    iget-object v3, v3, Lr/j;->b:Lr/i;

    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v4, Lr/g;->f:LD1/b;

    .line 295
    .line 296
    invoke-virtual {v4, v3, v5, p1}, LD1/b;->i(Lr/g;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-eqz p1, :cond_8

    .line 301
    .line 302
    invoke-static {v3}, Lr/g;->c(Lr/g;)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_8
    move v2, v0

    .line 307
    :goto_6
    if-eqz v2, :cond_9

    .line 308
    .line 309
    iput-object v5, v1, Lr/h;->a:Ljava/lang/Class;

    .line 310
    .line 311
    iput-object v5, v1, Lr/h;->b:Lr/j;

    .line 312
    .line 313
    iput-object v5, v1, Lr/h;->c:Lr/k;

    .line 314
    .line 315
    :cond_9
    new-instance p1, Landroid/os/Handler;

    .line 316
    .line 317
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 322
    .line 323
    .line 324
    new-instance v1, Lb3/b;

    .line 325
    .line 326
    invoke-direct {v1, p0, v0}, Lb3/b;-><init>(Ldev/fluttercommunity/workmanager/BackgroundWorker;I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 330
    .line 331
    .line 332
    return-void
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

.method public final onMethodCall(Ln3/n;Ln3/p;)V
    .locals 4

    .line 1
    const-string p2, "call"

    .line 2
    .line 3
    invoke-static {p1, p2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Ln3/n;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string p2, "backgroundChannelInitialized"

    .line 9
    .line 10
    invoke-static {p1, p2}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    iget-object p1, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->q:Ln3/q;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Ldev/fluttercommunity/workmanager/BackgroundWorker;->p:Landroidx/work/WorkerParameters;

    .line 22
    .line 23
    iget-object v1, v0, Landroidx/work/WorkerParameters;->b:LQ1/g;

    .line 24
    .line 25
    iget-object v1, v1, LQ1/g;->a:Ljava/util/HashMap;

    .line 26
    .line 27
    const-string v2, "be.tramckrijte.workmanager.DART_TASK"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    instance-of v3, v1, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, p2

    .line 41
    :goto_0
    invoke-static {v1}, LN3/h;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, LB3/b;

    .line 45
    .line 46
    invoke-direct {v3, v2, v1}, LB3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:LQ1/g;

    .line 50
    .line 51
    iget-object v0, v0, LQ1/g;->a:Ljava/util/HashMap;

    .line 52
    .line 53
    const-string v1, "be.tramckrijte.workmanager.INPUT_DATA"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    instance-of v2, v0, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    move-object p2, v0

    .line 64
    check-cast p2, Ljava/lang/String;

    .line 65
    .line 66
    :cond_1
    new-instance v0, LB3/b;

    .line 67
    .line 68
    invoke-direct {v0, v1, p2}, LB3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    filled-new-array {v3, v0}, [LB3/b;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-static {p2}, LC3/r;->c0([LB3/b;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance v0, Lb3/c;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lb3/c;-><init>(Ldev/fluttercommunity/workmanager/BackgroundWorker;)V

    .line 82
    .line 83
    .line 84
    const-string v1, "onResultSend"

    .line 85
    .line 86
    invoke-virtual {p1, v1, p2, v0}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-string p1, "backgroundChannel"

    .line 91
    .line 92
    invoke-static {p1}, LN3/h;->g(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p2

    .line 96
    :cond_3
    :goto_1
    return-void
.end method
