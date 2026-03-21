.class public abstract Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "DiagnosticsWrkr"

    .line 2
    .line 3
    invoke-static {v0}, LQ1/q;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "tagWithPrefix(\"DiagnosticsWrkr\")"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ld2/b;->a:Ljava/lang/String;

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
.end method

.method public static final a(LZ1/l;LZ1/s;LZ1/i;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 17

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LZ1/p;

    .line 23
    .line 24
    invoke-static {v2}, LD1/b;->z(LZ1/p;)LZ1/j;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object/from16 v4, p2

    .line 29
    .line 30
    invoke-virtual {v4, v3}, LZ1/i;->n(LZ1/j;)LZ1/g;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    iget v3, v3, LZ1/g;->c:I

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-object v3, v5

    .line 45
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v6, "SELECT name FROM workname WHERE work_spec_id=?"

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-static {v6, v7}, Ls1/j;->c(Ljava/lang/String;I)Ls1/j;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object v8, v2, LZ1/p;->a:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v8, :cond_1

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ls1/j;->g(I)V

    .line 60
    .line 61
    .line 62
    :goto_2
    move-object/from16 v7, p0

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_1
    invoke-virtual {v6, v8, v7}, Ls1/j;->h(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    iget-object v9, v7, LZ1/l;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Landroidx/work/impl/WorkDatabase_Impl;

    .line 72
    .line 73
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 74
    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    invoke-static {v9, v6, v10}, LQ1/C;->l0(Landroidx/work/impl/WorkDatabase;Ls1/j;Z)Landroid/database/Cursor;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    :try_start_0
    new-instance v11, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    :goto_4
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-eqz v12, :cond_3

    .line 95
    .line 96
    invoke-interface {v9, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_2

    .line 101
    .line 102
    move-object v12, v5

    .line 103
    goto :goto_5

    .line 104
    :cond_2
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    :goto_5
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    goto :goto_7

    .line 114
    :cond_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Ls1/j;->f()V

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const/16 v16, 0x3e

    .line 122
    .line 123
    const-string v12, ","

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    invoke-static/range {v11 .. v16}, LC3/f;->V(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM3/l;I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    move-object/from16 v10, p1

    .line 132
    .line 133
    invoke-virtual {v10, v8}, LZ1/s;->I(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    const-string v12, ","

    .line 138
    .line 139
    invoke-static/range {v11 .. v16}, LC3/f;->V(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM3/l;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const-string v9, "\n"

    .line 144
    .line 145
    const-string v11, "\t "

    .line 146
    .line 147
    invoke-static {v9, v8, v11}, Lb3/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    iget-object v9, v2, LZ1/p;->c:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget v2, v2, LZ1/p;->b:I

    .line 166
    .line 167
    packed-switch v2, :pswitch_data_0

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    throw v0

    .line 172
    :pswitch_0
    const-string v2, "CANCELLED"

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :pswitch_1
    const-string v2, "BLOCKED"

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :pswitch_2
    const-string v2, "FAILED"

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :pswitch_3
    const-string v2, "SUCCEEDED"

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :pswitch_4
    const-string v2, "RUNNING"

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :pswitch_5
    const-string v2, "ENQUEUED"

    .line 188
    .line 189
    :goto_6
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const/16 v2, 0x9

    .line 205
    .line 206
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :goto_7
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6}, Ls1/j;->f()V

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 230
    .line 231
    invoke-static {v0, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
