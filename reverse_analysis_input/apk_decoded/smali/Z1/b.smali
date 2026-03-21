.class public final LZ1/b;
.super Ls1/l;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ1/b;->d:I

    invoke-direct {p0, p1}, Ls1/l;-><init>(Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LZ1/b;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final l(Ly1/h;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, LZ1/b;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, LZ1/r;

    .line 7
    .line 8
    iget-object v0, p2, LZ1/r;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, v1}, Lx1/d;->g(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1, v0, v1}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x2

    .line 21
    iget-object p2, p2, LZ1/r;->b:Ljava/lang/String;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lx1/d;->g(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {p1, p2, v0}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    :goto_1
    return-void

    .line 33
    :pswitch_0
    check-cast p2, LZ1/p;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iget-object v1, p2, LZ1/p;->a:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lx1/d;->g(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-interface {p1, v1, v0}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    :goto_2
    iget v1, p2, LZ1/p;->b:I

    .line 48
    .line 49
    invoke-static {v1}, LQ1/C;->v0(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x2

    .line 54
    int-to-long v3, v1

    .line 55
    invoke-interface {p1, v3, v4, v2}, Lx1/d;->m(JI)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p2, LZ1/p;->c:Ljava/lang/String;

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    invoke-interface {p1, v2}, Lx1/d;->g(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-interface {p1, v1, v2}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    :goto_3
    iget-object v1, p2, LZ1/p;->d:Ljava/lang/String;

    .line 71
    .line 72
    const/4 v2, 0x4

    .line 73
    if-nez v1, :cond_4

    .line 74
    .line 75
    invoke-interface {p1, v2}, Lx1/d;->g(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-interface {p1, v1, v2}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object v1, p2, LZ1/p;->e:LQ1/g;

    .line 83
    .line 84
    invoke-static {v1}, LQ1/g;->b(LQ1/g;)[B

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const/4 v2, 0x5

    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    invoke-interface {p1, v2}, Lx1/d;->g(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_5
    invoke-interface {p1, v2, v1}, Lx1/d;->e(I[B)V

    .line 96
    .line 97
    .line 98
    :goto_5
    iget-object v1, p2, LZ1/p;->f:LQ1/g;

    .line 99
    .line 100
    invoke-static {v1}, LQ1/g;->b(LQ1/g;)[B

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v2, 0x6

    .line 105
    if-nez v1, :cond_6

    .line 106
    .line 107
    invoke-interface {p1, v2}, Lx1/d;->g(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    invoke-interface {p1, v2, v1}, Lx1/d;->e(I[B)V

    .line 112
    .line 113
    .line 114
    :goto_6
    const/4 v1, 0x7

    .line 115
    iget-wide v2, p2, LZ1/p;->g:J

    .line 116
    .line 117
    invoke-interface {p1, v2, v3, v1}, Lx1/d;->m(JI)V

    .line 118
    .line 119
    .line 120
    const/16 v1, 0x8

    .line 121
    .line 122
    iget-wide v2, p2, LZ1/p;->h:J

    .line 123
    .line 124
    invoke-interface {p1, v2, v3, v1}, Lx1/d;->m(JI)V

    .line 125
    .line 126
    .line 127
    const/16 v1, 0x9

    .line 128
    .line 129
    iget-wide v2, p2, LZ1/p;->i:J

    .line 130
    .line 131
    invoke-interface {p1, v2, v3, v1}, Lx1/d;->m(JI)V

    .line 132
    .line 133
    .line 134
    iget v1, p2, LZ1/p;->k:I

    .line 135
    .line 136
    int-to-long v1, v1

    .line 137
    const/16 v3, 0xa

    .line 138
    .line 139
    invoke-interface {p1, v1, v2, v3}, Lx1/d;->m(JI)V

    .line 140
    .line 141
    .line 142
    iget v1, p2, LZ1/p;->l:I

    .line 143
    .line 144
    const-string v2, "backoffPolicy"

    .line 145
    .line 146
    invoke-static {v2, v1}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, LO/i;->b(I)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    const/4 v2, 0x0

    .line 154
    if-eqz v1, :cond_8

    .line 155
    .line 156
    if-ne v1, v0, :cond_7

    .line 157
    .line 158
    move v1, v0

    .line 159
    goto :goto_7

    .line 160
    :cond_7
    new-instance p1, LA1/c;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_8
    move v1, v2

    .line 167
    :goto_7
    const/16 v3, 0xb

    .line 168
    .line 169
    int-to-long v4, v1

    .line 170
    invoke-interface {p1, v4, v5, v3}, Lx1/d;->m(JI)V

    .line 171
    .line 172
    .line 173
    const/16 v1, 0xc

    .line 174
    .line 175
    iget-wide v3, p2, LZ1/p;->m:J

    .line 176
    .line 177
    invoke-interface {p1, v3, v4, v1}, Lx1/d;->m(JI)V

    .line 178
    .line 179
    .line 180
    const/16 v1, 0xd

    .line 181
    .line 182
    iget-wide v3, p2, LZ1/p;->n:J

    .line 183
    .line 184
    invoke-interface {p1, v3, v4, v1}, Lx1/d;->m(JI)V

    .line 185
    .line 186
    .line 187
    const/16 v1, 0xe

    .line 188
    .line 189
    iget-wide v3, p2, LZ1/p;->o:J

    .line 190
    .line 191
    invoke-interface {p1, v3, v4, v1}, Lx1/d;->m(JI)V

    .line 192
    .line 193
    .line 194
    const/16 v1, 0xf

    .line 195
    .line 196
    iget-wide v3, p2, LZ1/p;->p:J

    .line 197
    .line 198
    invoke-interface {p1, v3, v4, v1}, Lx1/d;->m(JI)V

    .line 199
    .line 200
    .line 201
    iget-boolean v1, p2, LZ1/p;->q:Z

    .line 202
    .line 203
    const/16 v3, 0x10

    .line 204
    .line 205
    int-to-long v4, v1

    .line 206
    invoke-interface {p1, v4, v5, v3}, Lx1/d;->m(JI)V

    .line 207
    .line 208
    .line 209
    iget v1, p2, LZ1/p;->r:I

    .line 210
    .line 211
    const-string v3, "policy"

    .line 212
    .line 213
    invoke-static {v3, v1}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1}, LO/i;->b(I)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_a

    .line 221
    .line 222
    if-ne v1, v0, :cond_9

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_9
    new-instance p1, LA1/c;

    .line 226
    .line 227
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 228
    .line 229
    .line 230
    throw p1

    .line 231
    :cond_a
    move v0, v2

    .line 232
    :goto_8
    const/16 v1, 0x11

    .line 233
    .line 234
    int-to-long v2, v0

    .line 235
    invoke-interface {p1, v2, v3, v1}, Lx1/d;->m(JI)V

    .line 236
    .line 237
    .line 238
    iget v0, p2, LZ1/p;->s:I

    .line 239
    .line 240
    int-to-long v0, v0

    .line 241
    const/16 v2, 0x12

    .line 242
    .line 243
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 244
    .line 245
    .line 246
    iget v0, p2, LZ1/p;->t:I

    .line 247
    .line 248
    int-to-long v0, v0

    .line 249
    const/16 v2, 0x13

    .line 250
    .line 251
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 252
    .line 253
    .line 254
    iget-wide v0, p2, LZ1/p;->u:J

    .line 255
    .line 256
    const/16 v2, 0x14

    .line 257
    .line 258
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 259
    .line 260
    .line 261
    iget v0, p2, LZ1/p;->v:I

    .line 262
    .line 263
    int-to-long v0, v0

    .line 264
    const/16 v2, 0x15

    .line 265
    .line 266
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 267
    .line 268
    .line 269
    iget v0, p2, LZ1/p;->w:I

    .line 270
    .line 271
    int-to-long v0, v0

    .line 272
    const/16 v2, 0x16

    .line 273
    .line 274
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 275
    .line 276
    .line 277
    iget-object p2, p2, LZ1/p;->j:LQ1/d;

    .line 278
    .line 279
    const/16 v0, 0x1e

    .line 280
    .line 281
    const/16 v1, 0x1d

    .line 282
    .line 283
    const/16 v2, 0x1c

    .line 284
    .line 285
    const/16 v3, 0x1b

    .line 286
    .line 287
    const/16 v4, 0x1a

    .line 288
    .line 289
    const/16 v5, 0x19

    .line 290
    .line 291
    const/16 v6, 0x18

    .line 292
    .line 293
    const/16 v7, 0x17

    .line 294
    .line 295
    if-eqz p2, :cond_b

    .line 296
    .line 297
    iget v8, p2, LQ1/d;->a:I

    .line 298
    .line 299
    invoke-static {v8}, LQ1/C;->k0(I)I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    int-to-long v8, v8

    .line 304
    invoke-interface {p1, v8, v9, v7}, Lx1/d;->m(JI)V

    .line 305
    .line 306
    .line 307
    iget-boolean v7, p2, LQ1/d;->b:Z

    .line 308
    .line 309
    int-to-long v7, v7

    .line 310
    invoke-interface {p1, v7, v8, v6}, Lx1/d;->m(JI)V

    .line 311
    .line 312
    .line 313
    iget-boolean v6, p2, LQ1/d;->c:Z

    .line 314
    .line 315
    int-to-long v6, v6

    .line 316
    invoke-interface {p1, v6, v7, v5}, Lx1/d;->m(JI)V

    .line 317
    .line 318
    .line 319
    iget-boolean v5, p2, LQ1/d;->d:Z

    .line 320
    .line 321
    int-to-long v5, v5

    .line 322
    invoke-interface {p1, v5, v6, v4}, Lx1/d;->m(JI)V

    .line 323
    .line 324
    .line 325
    iget-boolean v4, p2, LQ1/d;->e:Z

    .line 326
    .line 327
    int-to-long v4, v4

    .line 328
    invoke-interface {p1, v4, v5, v3}, Lx1/d;->m(JI)V

    .line 329
    .line 330
    .line 331
    iget-wide v3, p2, LQ1/d;->f:J

    .line 332
    .line 333
    invoke-interface {p1, v3, v4, v2}, Lx1/d;->m(JI)V

    .line 334
    .line 335
    .line 336
    iget-wide v2, p2, LQ1/d;->g:J

    .line 337
    .line 338
    invoke-interface {p1, v2, v3, v1}, Lx1/d;->m(JI)V

    .line 339
    .line 340
    .line 341
    iget-object p2, p2, LQ1/d;->h:Ljava/util/Set;

    .line 342
    .line 343
    invoke-static {p2}, LQ1/C;->p0(Ljava/util/Set;)[B

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-interface {p1, v0, p2}, Lx1/d;->e(I[B)V

    .line 348
    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_b
    invoke-interface {p1, v7}, Lx1/d;->g(I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {p1, v6}, Lx1/d;->g(I)V

    .line 355
    .line 356
    .line 357
    invoke-interface {p1, v5}, Lx1/d;->g(I)V

    .line 358
    .line 359
    .line 360
    invoke-interface {p1, v4}, Lx1/d;->g(I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {p1, v3}, Lx1/d;->g(I)V

    .line 364
    .line 365
    .line 366
    invoke-interface {p1, v2}, Lx1/d;->g(I)V

    .line 367
    .line 368
    .line 369
    invoke-interface {p1, v1}, Lx1/d;->g(I)V

    .line 370
    .line 371
    .line 372
    invoke-interface {p1, v0}, Lx1/d;->g(I)V

    .line 373
    .line 374
    .line 375
    :goto_9
    return-void

    .line 376
    :pswitch_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 377
    .line 378
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 379
    .line 380
    .line 381
    throw p1

    .line 382
    :pswitch_2
    check-cast p2, LZ1/k;

    .line 383
    .line 384
    iget-object v0, p2, LZ1/k;->a:Ljava/lang/String;

    .line 385
    .line 386
    const/4 v1, 0x1

    .line 387
    if-nez v0, :cond_c

    .line 388
    .line 389
    invoke-interface {p1, v1}, Lx1/d;->g(I)V

    .line 390
    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_c
    invoke-interface {p1, v0, v1}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 394
    .line 395
    .line 396
    :goto_a
    iget-object p2, p2, LZ1/k;->b:Ljava/lang/String;

    .line 397
    .line 398
    const/4 v0, 0x2

    .line 399
    invoke-interface {p1, p2, v0}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :pswitch_3
    check-cast p2, LZ1/g;

    .line 404
    .line 405
    iget-object v0, p2, LZ1/g;->a:Ljava/lang/String;

    .line 406
    .line 407
    const/4 v1, 0x1

    .line 408
    if-nez v0, :cond_d

    .line 409
    .line 410
    invoke-interface {p1, v1}, Lx1/d;->g(I)V

    .line 411
    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_d
    invoke-interface {p1, v0, v1}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 415
    .line 416
    .line 417
    :goto_b
    iget v0, p2, LZ1/g;->b:I

    .line 418
    .line 419
    int-to-long v0, v0

    .line 420
    const/4 v2, 0x2

    .line 421
    invoke-interface {p1, v0, v1, v2}, Lx1/d;->m(JI)V

    .line 422
    .line 423
    .line 424
    iget p2, p2, LZ1/g;->c:I

    .line 425
    .line 426
    int-to-long v0, p2

    .line 427
    const/4 p2, 0x3

    .line 428
    invoke-interface {p1, v0, v1, p2}, Lx1/d;->m(JI)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :pswitch_4
    check-cast p2, LZ1/d;

    .line 433
    .line 434
    iget-object v0, p2, LZ1/d;->a:Ljava/lang/String;

    .line 435
    .line 436
    const/4 v1, 0x1

    .line 437
    invoke-interface {p1, v0, v1}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 438
    .line 439
    .line 440
    iget-object p2, p2, LZ1/d;->b:Ljava/lang/Long;

    .line 441
    .line 442
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 443
    .line 444
    .line 445
    move-result-wide v0

    .line 446
    const/4 p2, 0x2

    .line 447
    invoke-interface {p1, v0, v1, p2}, Lx1/d;->m(JI)V

    .line 448
    .line 449
    .line 450
    return-void

    .line 451
    :pswitch_5
    check-cast p2, LZ1/a;

    .line 452
    .line 453
    iget-object v0, p2, LZ1/a;->a:Ljava/lang/String;

    .line 454
    .line 455
    const/4 v1, 0x1

    .line 456
    invoke-interface {p1, v0, v1}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 457
    .line 458
    .line 459
    const/4 v0, 0x2

    .line 460
    iget-object p2, p2, LZ1/a;->b:Ljava/lang/String;

    .line 461
    .line 462
    if-nez p2, :cond_e

    .line 463
    .line 464
    invoke-interface {p1, v0}, Lx1/d;->g(I)V

    .line 465
    .line 466
    .line 467
    goto :goto_c

    .line 468
    :cond_e
    invoke-interface {p1, p2, v0}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 469
    .line 470
    .line 471
    :goto_c
    return-void

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls1/l;->a()Ly1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, v0, p1}, LZ1/b;->l(Ly1/h;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, v0, Ly1/h;->m:Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ls1/l;->j(Ly1/h;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-virtual {p0, v0}, Ls1/l;->j(Ly1/h;)V

    .line 19
    .line 20
    .line 21
    throw p1
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
