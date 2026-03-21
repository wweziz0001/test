.class public abstract LA/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LA/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA/d;->a:LA/c;

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

.method public static a(Landroid/content/Context;LA/e;)LA/j;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, LA/e;->m:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    if-eqz v5, :cond_13

    .line 21
    .line 22
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v7, v0, LA/e;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_12

    .line 33
    .line 34
    iget-object v3, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 35
    .line 36
    const/16 v6, 0x40

    .line 37
    .line 38
    invoke-virtual {v1, v3, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    array-length v6, v1

    .line 50
    move v7, v4

    .line 51
    :goto_0
    if-ge v7, v6, :cond_0

    .line 52
    .line 53
    aget-object v8, v1, v7

    .line 54
    .line 55
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object v1, LA/d;->a:LA/c;

    .line 66
    .line 67
    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    .line 69
    .line 70
    iget-object v6, v0, LA/e;->q:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, Ljava/util/List;

    .line 73
    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static {v2, v4}, Lv/b;->f(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    :goto_1
    move v2, v4

    .line 82
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const/4 v8, 0x0

    .line 87
    if-ge v2, v7, :cond_4

    .line 88
    .line 89
    new-instance v7, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eq v9, v10, :cond_2

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_2
    move v9, v4

    .line 115
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-ge v9, v10, :cond_5

    .line 120
    .line 121
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    check-cast v10, [B

    .line 126
    .line 127
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, [B

    .line 132
    .line 133
    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_3

    .line 138
    .line 139
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    move-object v5, v8

    .line 146
    :cond_5
    const/4 v1, 0x1

    .line 147
    if-nez v5, :cond_6

    .line 148
    .line 149
    new-instance v0, LA/j;

    .line 150
    .line 151
    invoke-direct {v0, v1, v8}, LA/j;-><init>(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    iget-object v2, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v3, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v5, Landroid/net/Uri$Builder;

    .line 163
    .line 164
    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v6, "content"

    .line 168
    .line 169
    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    new-instance v7, Landroid/net/Uri$Builder;

    .line 182
    .line 183
    invoke-direct {v7}, Landroid/net/Uri$Builder;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {v6, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v6, "file"

    .line 195
    .line 196
    invoke-virtual {v2, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v6, v5}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    :try_start_0
    const-string v9, "_id"

    .line 213
    .line 214
    const-string v10, "file_id"

    .line 215
    .line 216
    const-string v11, "font_ttc_index"

    .line 217
    .line 218
    const-string v12, "font_variation_settings"

    .line 219
    .line 220
    const-string v13, "font_weight"

    .line 221
    .line 222
    const-string v14, "font_italic"

    .line 223
    .line 224
    const-string v15, "result_code"

    .line 225
    .line 226
    filled-new-array/range {v9 .. v15}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    const-string v12, "query = ?"

    .line 231
    .line 232
    iget-object v0, v0, LA/e;->o:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Ljava/lang/String;

    .line 235
    .line 236
    filled-new-array {v0}, [Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    if-nez v6, :cond_7

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_7
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    move-object v9, v6

    .line 246
    move-object v10, v5

    .line 247
    :try_start_1
    invoke-virtual/range {v9 .. v15}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 248
    .line 249
    .line 250
    move-result-object v8
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    goto :goto_5

    .line 252
    :catch_0
    move-exception v0

    .line 253
    move-object v7, v0

    .line 254
    :try_start_2
    const-string v0, "FontsProvider"

    .line 255
    .line 256
    const-string v9, "Unable to query the content provider"

    .line 257
    .line 258
    invoke-static {v0, v9, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 259
    .line 260
    .line 261
    :goto_5
    if-eqz v8, :cond_d

    .line 262
    .line 263
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-lez v0, :cond_d

    .line 268
    .line 269
    const-string v0, "result_code"

    .line 270
    .line 271
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    new-instance v3, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v7, "_id"

    .line 281
    .line 282
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    const-string v9, "file_id"

    .line 287
    .line 288
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    const-string v10, "font_ttc_index"

    .line 293
    .line 294
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    const-string v11, "font_weight"

    .line 299
    .line 300
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    const-string v12, "font_italic"

    .line 305
    .line 306
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    :goto_6
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    if-eqz v13, :cond_d

    .line 315
    .line 316
    const/4 v13, -0x1

    .line 317
    if-eq v0, v13, :cond_8

    .line 318
    .line 319
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    move/from16 v20, v14

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :catchall_0
    move-exception v0

    .line 327
    goto :goto_e

    .line 328
    :cond_8
    move/from16 v20, v4

    .line 329
    .line 330
    :goto_7
    if-eq v10, v13, :cond_9

    .line 331
    .line 332
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    move/from16 v17, v14

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_9
    move/from16 v17, v4

    .line 340
    .line 341
    :goto_8
    if-ne v9, v13, :cond_a

    .line 342
    .line 343
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 344
    .line 345
    .line 346
    move-result-wide v14

    .line 347
    invoke-static {v5, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    :goto_9
    move-object/from16 v16, v14

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_a
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 355
    .line 356
    .line 357
    move-result-wide v14

    .line 358
    invoke-static {v2, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    goto :goto_9

    .line 363
    :goto_a
    if-eq v11, v13, :cond_b

    .line 364
    .line 365
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 366
    .line 367
    .line 368
    move-result v14

    .line 369
    :goto_b
    move/from16 v18, v14

    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_b
    const/16 v14, 0x190

    .line 373
    .line 374
    goto :goto_b

    .line 375
    :goto_c
    if-eq v12, v13, :cond_c

    .line 376
    .line 377
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v13

    .line 381
    if-ne v13, v1, :cond_c

    .line 382
    .line 383
    move/from16 v19, v1

    .line 384
    .line 385
    goto :goto_d

    .line 386
    :cond_c
    move/from16 v19, v4

    .line 387
    .line 388
    :goto_d
    new-instance v13, LA/k;

    .line 389
    .line 390
    move-object v15, v13

    .line 391
    invoke-direct/range {v15 .. v20}, LA/k;-><init>(Landroid/net/Uri;IIZI)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 395
    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_d
    if-eqz v8, :cond_e

    .line 399
    .line 400
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 401
    .line 402
    .line 403
    :cond_e
    if-eqz v6, :cond_f

    .line 404
    .line 405
    invoke-virtual {v6}, Landroid/content/ContentProviderClient;->close()V

    .line 406
    .line 407
    .line 408
    :cond_f
    new-array v0, v4, [LA/k;

    .line 409
    .line 410
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    check-cast v0, [LA/k;

    .line 415
    .line 416
    new-instance v1, LA/j;

    .line 417
    .line 418
    invoke-direct {v1, v4, v0}, LA/j;-><init>(ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v1

    .line 422
    :goto_e
    if-eqz v8, :cond_10

    .line 423
    .line 424
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 425
    .line 426
    .line 427
    :cond_10
    if-eqz v6, :cond_11

    .line 428
    .line 429
    invoke-virtual {v6}, Landroid/content/ContentProviderClient;->close()V

    .line 430
    .line 431
    .line 432
    :cond_11
    throw v0

    .line 433
    :cond_12
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 434
    .line 435
    new-instance v1, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v2, "Found content provider "

    .line 438
    .line 439
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string v2, ", but package was not "

    .line 446
    .line 447
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :cond_13
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 462
    .line 463
    const-string v1, "No package found for authority: "

    .line 464
    .line 465
    invoke-static {v1, v3}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    throw v0
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
