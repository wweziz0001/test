.class public final La2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final n:Ljava/lang/String;


# instance fields
.field public final l:LR1/l;

.field public final m:LZ1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, LQ1/q;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La2/f;->n:Ljava/lang/String;

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

.method public constructor <init>(LR1/l;LZ1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La2/f;->l:LR1/l;

    .line 5
    .line 6
    iput-object p2, p0, La2/f;->m:LZ1/c;

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

.method public static a(LR1/l;)Z
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p0 .. p0}, LR1/l;->R(LR1/l;)Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, v0, LR1/l;->a:LR1/q;

    .line 20
    .line 21
    iget-object v4, v3, LR1/q;->d:LQ1/a;

    .line 22
    .line 23
    iget-object v4, v4, LQ1/a;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, LQ1/r;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    array-length v7, v1

    .line 37
    if-lez v7, :cond_0

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v7, v2

    .line 42
    :goto_0
    iget-object v8, v3, LR1/q;->e:Landroidx/work/impl/WorkDatabase;

    .line 43
    .line 44
    const/4 v9, 0x4

    .line 45
    const/4 v10, 0x3

    .line 46
    const/4 v11, 0x6

    .line 47
    if-eqz v7, :cond_6

    .line 48
    .line 49
    array-length v12, v1

    .line 50
    move v13, v2

    .line 51
    move v15, v13

    .line 52
    move/from16 v16, v15

    .line 53
    .line 54
    const/4 v14, 0x1

    .line 55
    :goto_1
    if-ge v13, v12, :cond_7

    .line 56
    .line 57
    aget-object v2, v1, v13

    .line 58
    .line 59
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v6, v2}, LZ1/q;->m(Ljava/lang/String;)LZ1/p;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v4, "Prerequisite "

    .line 76
    .line 77
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, " doesn\'t exist; not enqueuing"

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    sget-object v3, La2/f;->n:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v3, v2}, LQ1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_2
    const/4 v1, 0x1

    .line 98
    const/4 v2, 0x0

    .line 99
    goto/16 :goto_17

    .line 100
    .line 101
    :cond_2
    iget v2, v6, LZ1/p;->b:I

    .line 102
    .line 103
    if-ne v2, v10, :cond_3

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    const/4 v6, 0x0

    .line 108
    :goto_3
    and-int/2addr v14, v6

    .line 109
    if-ne v2, v9, :cond_4

    .line 110
    .line 111
    const/16 v16, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    if-ne v2, v11, :cond_5

    .line 115
    .line 116
    const/4 v15, 0x1

    .line 117
    :cond_5
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    const/4 v14, 0x1

    .line 122
    const/4 v15, 0x0

    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    :cond_7
    iget-object v2, v0, LR1/l;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_18

    .line 132
    .line 133
    if-nez v7, :cond_18

    .line 134
    .line 135
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    invoke-virtual {v12, v2}, LZ1/q;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    if-nez v13, :cond_18

    .line 148
    .line 149
    iget v13, v0, LR1/l;->c:I

    .line 150
    .line 151
    if-eq v13, v10, :cond_c

    .line 152
    .line 153
    if-ne v13, v9, :cond_8

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_8
    const/4 v10, 0x2

    .line 157
    if-ne v13, v10, :cond_a

    .line 158
    .line 159
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v18

    .line 167
    if-eqz v18, :cond_a

    .line 168
    .line 169
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v18

    .line 173
    move-object/from16 v11, v18

    .line 174
    .line 175
    check-cast v11, LZ1/n;

    .line 176
    .line 177
    iget v11, v11, LZ1/n;->b:I

    .line 178
    .line 179
    const/4 v9, 0x1

    .line 180
    if-eq v11, v9, :cond_1

    .line 181
    .line 182
    if-ne v11, v10, :cond_9

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    const/4 v9, 0x4

    .line 186
    const/4 v11, 0x6

    .line 187
    goto :goto_5

    .line 188
    :cond_a
    new-instance v9, La2/c;

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    invoke-direct {v9, v3, v2, v10}, La2/c;-><init>(LR1/q;Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9}, La2/e;->run()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    if-eqz v11, :cond_b

    .line 210
    .line 211
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    check-cast v11, LZ1/n;

    .line 216
    .line 217
    iget-object v11, v11, LZ1/n;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v9, v11}, LZ1/q;->c(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_b
    move/from16 v21, v6

    .line 224
    .line 225
    const/4 v6, 0x1

    .line 226
    goto/16 :goto_11

    .line 227
    .line 228
    :cond_c
    :goto_7
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->f()LZ1/c;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    new-instance v9, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    if-eqz v12, :cond_13

    .line 246
    .line 247
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    check-cast v12, LZ1/n;

    .line 252
    .line 253
    iget-object v10, v12, LZ1/n;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-object/from16 v20, v11

    .line 259
    .line 260
    const-string v11, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    .line 261
    .line 262
    move/from16 v21, v6

    .line 263
    .line 264
    const/4 v6, 0x1

    .line 265
    invoke-static {v11, v6}, Ls1/j;->c(Ljava/lang/String;I)Ls1/j;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    if-nez v10, :cond_d

    .line 270
    .line 271
    invoke-virtual {v11, v6}, Ls1/j;->g(I)V

    .line 272
    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_d
    invoke-virtual {v11, v10, v6}, Ls1/j;->h(Ljava/lang/String;I)V

    .line 276
    .line 277
    .line 278
    :goto_9
    iget-object v6, v7, LZ1/c;->l:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v6, Landroidx/work/impl/WorkDatabase_Impl;

    .line 281
    .line 282
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 283
    .line 284
    .line 285
    const/4 v10, 0x0

    .line 286
    invoke-static {v6, v11, v10}, LQ1/C;->l0(Landroidx/work/impl/WorkDatabase;Ls1/j;Z)Landroid/database/Cursor;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    :try_start_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 291
    .line 292
    .line 293
    move-result v17

    .line 294
    if-eqz v17, :cond_e

    .line 295
    .line 296
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 297
    .line 298
    .line 299
    move-result v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    if-eqz v17, :cond_e

    .line 301
    .line 302
    const/16 v17, 0x1

    .line 303
    .line 304
    goto :goto_a

    .line 305
    :catchall_0
    move-exception v0

    .line 306
    goto :goto_e

    .line 307
    :cond_e
    move/from16 v17, v10

    .line 308
    .line 309
    :goto_a
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11}, Ls1/j;->f()V

    .line 313
    .line 314
    .line 315
    if-nez v17, :cond_12

    .line 316
    .line 317
    iget v6, v12, LZ1/n;->b:I

    .line 318
    .line 319
    const/4 v11, 0x3

    .line 320
    if-ne v6, v11, :cond_f

    .line 321
    .line 322
    const/16 v17, 0x1

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_f
    move/from16 v17, v10

    .line 326
    .line 327
    :goto_b
    and-int v14, v14, v17

    .line 328
    .line 329
    const/4 v10, 0x4

    .line 330
    if-ne v6, v10, :cond_10

    .line 331
    .line 332
    const/16 v16, 0x1

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_10
    const/4 v10, 0x6

    .line 336
    if-ne v6, v10, :cond_11

    .line 337
    .line 338
    const/4 v15, 0x1

    .line 339
    :cond_11
    :goto_c
    iget-object v6, v12, LZ1/n;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_d

    .line 345
    :cond_12
    const/4 v11, 0x3

    .line 346
    :goto_d
    move v10, v11

    .line 347
    move-object/from16 v11, v20

    .line 348
    .line 349
    move/from16 v6, v21

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :goto_e
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v11}, Ls1/j;->f()V

    .line 356
    .line 357
    .line 358
    throw v0

    .line 359
    :cond_13
    move/from16 v21, v6

    .line 360
    .line 361
    const/4 v6, 0x4

    .line 362
    if-ne v13, v6, :cond_16

    .line 363
    .line 364
    if-nez v15, :cond_14

    .line 365
    .line 366
    if-eqz v16, :cond_16

    .line 367
    .line 368
    :cond_14
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    invoke-virtual {v6, v2}, LZ1/q;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    if-eqz v9, :cond_15

    .line 385
    .line 386
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    check-cast v9, LZ1/n;

    .line 391
    .line 392
    iget-object v9, v9, LZ1/n;->a:Ljava/lang/String;

    .line 393
    .line 394
    invoke-virtual {v6, v9}, LZ1/q;->c(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    const/4 v15, 0x0

    .line 403
    const/16 v16, 0x0

    .line 404
    .line 405
    :cond_16
    invoke-interface {v9, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, [Ljava/lang/String;

    .line 410
    .line 411
    array-length v6, v1

    .line 412
    if-lez v6, :cond_17

    .line 413
    .line 414
    const/4 v7, 0x1

    .line 415
    goto :goto_10

    .line 416
    :cond_17
    const/4 v7, 0x0

    .line 417
    :goto_10
    const/4 v6, 0x0

    .line 418
    goto :goto_11

    .line 419
    :cond_18
    move/from16 v21, v6

    .line 420
    .line 421
    goto :goto_10

    .line 422
    :goto_11
    iget-object v9, v0, LR1/l;->d:Ljava/util/List;

    .line 423
    .line 424
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-eqz v10, :cond_22

    .line 433
    .line 434
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    check-cast v10, LQ1/E;

    .line 439
    .line 440
    iget-object v11, v10, LQ1/E;->b:LZ1/p;

    .line 441
    .line 442
    if-eqz v7, :cond_1b

    .line 443
    .line 444
    if-nez v14, :cond_1b

    .line 445
    .line 446
    if-eqz v16, :cond_19

    .line 447
    .line 448
    const/4 v12, 0x4

    .line 449
    iput v12, v11, LZ1/p;->b:I

    .line 450
    .line 451
    const/4 v13, 0x6

    .line 452
    goto :goto_13

    .line 453
    :cond_19
    const/4 v12, 0x4

    .line 454
    if-eqz v15, :cond_1a

    .line 455
    .line 456
    const/4 v13, 0x6

    .line 457
    iput v13, v11, LZ1/p;->b:I

    .line 458
    .line 459
    goto :goto_13

    .line 460
    :cond_1a
    const/4 v13, 0x6

    .line 461
    const/4 v12, 0x5

    .line 462
    iput v12, v11, LZ1/p;->b:I

    .line 463
    .line 464
    goto :goto_13

    .line 465
    :cond_1b
    const/4 v13, 0x6

    .line 466
    iput-wide v4, v11, LZ1/p;->n:J

    .line 467
    .line 468
    :goto_13
    iget v12, v11, LZ1/p;->b:I

    .line 469
    .line 470
    const/4 v13, 0x1

    .line 471
    if-ne v12, v13, :cond_1c

    .line 472
    .line 473
    const/4 v6, 0x1

    .line 474
    :cond_1c
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    iget-object v13, v3, LR1/q;->g:Ljava/util/List;

    .line 479
    .line 480
    move-object/from16 v19, v3

    .line 481
    .line 482
    const-string v3, "schedulers"

    .line 483
    .line 484
    invoke-static {v13, v3}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 488
    .line 489
    const/16 v13, 0x1a

    .line 490
    .line 491
    if-ge v3, v13, :cond_1e

    .line 492
    .line 493
    iget-object v3, v11, LZ1/p;->j:LQ1/d;

    .line 494
    .line 495
    const-class v13, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 496
    .line 497
    move-wide/from16 v36, v4

    .line 498
    .line 499
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    iget-object v5, v11, LZ1/p;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {v5, v4}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    if-nez v4, :cond_1f

    .line 510
    .line 511
    iget-boolean v4, v3, LQ1/d;->d:Z

    .line 512
    .line 513
    if-nez v4, :cond_1d

    .line 514
    .line 515
    iget-boolean v3, v3, LQ1/d;->e:Z

    .line 516
    .line 517
    if-eqz v3, :cond_1f

    .line 518
    .line 519
    :cond_1d
    new-instance v3, Le3/g;

    .line 520
    .line 521
    const/4 v4, 0x1

    .line 522
    invoke-direct {v3, v4}, Le3/g;-><init>(I)V

    .line 523
    .line 524
    .line 525
    iget-object v4, v11, LZ1/p;->e:LQ1/g;

    .line 526
    .line 527
    iget-object v4, v4, LQ1/g;->a:Ljava/util/HashMap;

    .line 528
    .line 529
    invoke-virtual {v3, v4}, Le3/g;->c(Ljava/util/HashMap;)V

    .line 530
    .line 531
    .line 532
    iget-object v4, v3, Le3/g;->a:Ljava/util/HashMap;

    .line 533
    .line 534
    move/from16 v20, v6

    .line 535
    .line 536
    const-string v6, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 537
    .line 538
    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    new-instance v4, LQ1/g;

    .line 542
    .line 543
    iget-object v3, v3, Le3/g;->a:Ljava/util/HashMap;

    .line 544
    .line 545
    invoke-direct {v4, v3}, LQ1/g;-><init>(Ljava/util/HashMap;)V

    .line 546
    .line 547
    .line 548
    invoke-static {v4}, LQ1/g;->b(LQ1/g;)[B

    .line 549
    .line 550
    .line 551
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v25

    .line 555
    const/16 v31, 0x0

    .line 556
    .line 557
    const/16 v34, 0x0

    .line 558
    .line 559
    const/16 v23, 0x0

    .line 560
    .line 561
    const/16 v24, 0x0

    .line 562
    .line 563
    const/16 v27, 0x0

    .line 564
    .line 565
    const-wide/16 v28, 0x0

    .line 566
    .line 567
    const/16 v30, 0x0

    .line 568
    .line 569
    const-wide/16 v32, 0x0

    .line 570
    .line 571
    const v35, 0x7fffeb

    .line 572
    .line 573
    .line 574
    move-object/from16 v22, v11

    .line 575
    .line 576
    move-object/from16 v26, v4

    .line 577
    .line 578
    invoke-static/range {v22 .. v35}, LZ1/p;->b(LZ1/p;Ljava/lang/String;ILjava/lang/String;LQ1/g;IJIIJII)LZ1/p;

    .line 579
    .line 580
    .line 581
    move-result-object v11

    .line 582
    goto :goto_14

    .line 583
    :cond_1e
    move-wide/from16 v36, v4

    .line 584
    .line 585
    :cond_1f
    move/from16 v20, v6

    .line 586
    .line 587
    :goto_14
    iget-object v3, v12, LZ1/q;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 588
    .line 589
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 593
    .line 594
    .line 595
    :try_start_1
    iget-object v4, v12, LZ1/q;->b:LZ1/b;

    .line 596
    .line 597
    invoke-virtual {v4, v11}, LZ1/b;->m(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 601
    .line 602
    .line 603
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 604
    .line 605
    .line 606
    const-string v3, "id.toString()"

    .line 607
    .line 608
    iget-object v4, v10, LQ1/E;->a:Ljava/util/UUID;

    .line 609
    .line 610
    if-eqz v7, :cond_20

    .line 611
    .line 612
    array-length v5, v1

    .line 613
    const/4 v6, 0x0

    .line 614
    :goto_15
    if-ge v6, v5, :cond_20

    .line 615
    .line 616
    aget-object v11, v1, v6

    .line 617
    .line 618
    new-instance v12, LZ1/a;

    .line 619
    .line 620
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v13

    .line 624
    invoke-static {v13, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    invoke-direct {v12, v13, v11}, LZ1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->f()LZ1/c;

    .line 631
    .line 632
    .line 633
    move-result-object v11

    .line 634
    iget-object v13, v11, LZ1/c;->l:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v13, Landroidx/work/impl/WorkDatabase_Impl;

    .line 637
    .line 638
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 642
    .line 643
    .line 644
    :try_start_2
    iget-object v11, v11, LZ1/c;->m:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v11, LZ1/b;

    .line 647
    .line 648
    invoke-virtual {v11, v12}, LZ1/b;->m(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 652
    .line 653
    .line 654
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 655
    .line 656
    .line 657
    add-int/lit8 v6, v6, 0x1

    .line 658
    .line 659
    goto :goto_15

    .line 660
    :catchall_1
    move-exception v0

    .line 661
    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 662
    .line 663
    .line 664
    throw v0

    .line 665
    :cond_20
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()LZ1/s;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    invoke-static {v6, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    iget-object v10, v10, LQ1/E;->c:Ljava/util/LinkedHashSet;

    .line 677
    .line 678
    invoke-virtual {v5, v6, v10}, LZ1/s;->L(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 679
    .line 680
    .line 681
    if-nez v21, :cond_21

    .line 682
    .line 683
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->r()LZ1/l;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    new-instance v6, LZ1/k;

    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    invoke-static {v4, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-direct {v6, v2, v4}, LZ1/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    iget-object v3, v5, LZ1/l;->l:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 702
    .line 703
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 707
    .line 708
    .line 709
    :try_start_3
    iget-object v4, v5, LZ1/l;->m:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v4, LZ1/b;

    .line 712
    .line 713
    invoke-virtual {v4, v6}, LZ1/b;->m(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 717
    .line 718
    .line 719
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 720
    .line 721
    .line 722
    goto :goto_16

    .line 723
    :catchall_2
    move-exception v0

    .line 724
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 725
    .line 726
    .line 727
    throw v0

    .line 728
    :cond_21
    :goto_16
    move-object/from16 v3, v19

    .line 729
    .line 730
    move/from16 v6, v20

    .line 731
    .line 732
    move-wide/from16 v4, v36

    .line 733
    .line 734
    goto/16 :goto_12

    .line 735
    .line 736
    :catchall_3
    move-exception v0

    .line 737
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 738
    .line 739
    .line 740
    throw v0

    .line 741
    :cond_22
    move v2, v6

    .line 742
    const/4 v1, 0x1

    .line 743
    :goto_17
    iput-boolean v1, v0, LR1/l;->g:Z

    .line 744
    .line 745
    return v2
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


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, La2/f;->m:LZ1/c;

    .line 2
    .line 3
    iget-object v1, p0, La2/f;->l:LR1/l;

    .line 4
    .line 5
    const-string v2, "WorkContinuation has cycles ("

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, LR1/l;->a:LR1/q;

    .line 11
    .line 12
    :try_start_1
    new-instance v4, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v5, v1, LR1/l;->e:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {v4, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, LR1/l;->R(LR1/l;)Ljava/util/HashSet;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v5, v1, LR1/l;->e:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_0
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v2, v3, LR1/q;->e:Landroidx/work/impl/WorkDatabase;

    .line 59
    .line 60
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_2
    iget-object v4, v3, LR1/q;->d:LQ1/a;

    .line 64
    .line 65
    invoke-static {v2, v4, v1}, Li4/a;->k(Landroidx/work/impl/WorkDatabase;LQ1/a;LR1/l;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, La2/f;->a(LR1/l;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    .line 74
    .line 75
    :try_start_3
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    iget-object v1, v3, LR1/q;->c:Landroid/content/Context;

    .line 81
    .line 82
    const-class v2, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-static {v1, v2, v4}, La2/n;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v3, LR1/q;->d:LQ1/a;

    .line 89
    .line 90
    iget-object v2, v3, LR1/q;->e:Landroidx/work/impl/WorkDatabase;

    .line 91
    .line 92
    iget-object v3, v3, LR1/q;->g:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v1, v2, v3}, LR1/j;->b(LQ1/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    :goto_1
    sget-object v1, LQ1/x;->d:LQ1/w;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, LZ1/c;->i(LZ1/f;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_1
    move-exception v1

    .line 107
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :cond_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    new-instance v4, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, ")"

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 134
    :goto_2
    new-instance v2, LQ1/u;

    .line 135
    .line 136
    invoke-direct {v2, v1}, LQ1/u;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, LZ1/c;->i(LZ1/f;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    return-void
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
