.class public final synthetic LT2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:LP2/c;

.field public final synthetic o:Ljava/lang/Boolean;

.field public final synthetic p:LT2/e;

.field public final synthetic q:Ln3/n;

.field public final synthetic r:Z

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;LP2/c;Ljava/lang/Boolean;LT2/e;Ln3/n;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LT2/l;->l:Z

    iput-object p2, p0, LT2/l;->m:Ljava/lang/String;

    iput-object p3, p0, LT2/l;->n:LP2/c;

    iput-object p4, p0, LT2/l;->o:Ljava/lang/Boolean;

    iput-object p5, p0, LT2/l;->p:LT2/e;

    iput-object p6, p0, LT2/l;->q:Ln3/n;

    iput-boolean p7, p0, LT2/l;->r:Z

    iput p8, p0, LT2/l;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-boolean v0, p0, LT2/l;->l:Z

    .line 2
    .line 3
    iget-object v1, p0, LT2/l;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LT2/l;->n:LP2/c;

    .line 6
    .line 7
    iget-object v3, p0, LT2/l;->o:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v4, p0, LT2/l;->p:LT2/e;

    .line 10
    .line 11
    iget-object v5, p0, LT2/l;->q:Ln3/n;

    .line 12
    .line 13
    iget-boolean v6, p0, LT2/l;->r:Z

    .line 14
    .line 15
    iget v7, p0, LT2/l;->s:I

    .line 16
    .line 17
    const-string v8, "open_failed "

    .line 18
    .line 19
    sget-object v9, LT2/n;->q:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v9

    .line 22
    const/4 v10, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v11, Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "sqlite_error"

    .line 58
    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v2, v0, v1, v10}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_4

    .line 79
    .line 80
    :cond_0
    :try_start_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    new-instance v0, LT2/d;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v3, v4, LT2/e;->b:Ljava/lang/String;

    .line 94
    .line 95
    const/4 v8, 0x1

    .line 96
    invoke-static {v3, v10, v8, v0}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)Landroid/database/sqlite/SQLiteDatabase;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, v4, LT2/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v4}, LT2/e;->k()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    :goto_0
    :try_start_2
    sget-object v0, LT2/n;->p:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    :try_start_3
    sget-object v3, LT2/n;->n:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v3, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :catchall_1
    move-exception v1

    .line 122
    goto :goto_2

    .line 123
    :cond_2
    :goto_1
    sget-object v3, LT2/n;->o:Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 133
    :try_start_4
    iget v0, v4, LT2/e;->d:I

    .line 134
    .line 135
    invoke-static {v0}, LT2/a;->a(I)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    const-string v0, "Sqflite"

    .line 142
    .line 143
    new-instance v3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, LT2/e;->h()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v4, "opened "

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v4, " "

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    :cond_3
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 179
    const/4 v0, 0x0

    .line 180
    invoke-static {v7, v0, v0}, LT2/n;->c(IZZ)Ljava/util/HashMap;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v2, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 189
    :try_start_6
    throw v1

    .line 190
    :catch_0
    move-exception v0

    .line 191
    new-instance v1, LU2/c;

    .line 192
    .line 193
    invoke-direct {v1, v5, v2}, LU2/c;-><init>(Ln3/n;Ln3/p;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v0, v1}, LT2/e;->i(Ljava/lang/Exception;LZ1/f;)V

    .line 197
    .line 198
    .line 199
    monitor-exit v9

    .line 200
    :goto_3
    return-void

    .line 201
    :goto_4
    monitor-exit v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 202
    throw v0
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
