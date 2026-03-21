.class public abstract Lt0/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "([a-z])=\\s?(.+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lt0/E;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^([a-z])=$"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lt0/E;->b:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lt0/E;->c:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lt0/E;->d:Ljava/util/regex/Pattern;

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
.end method

.method public static a(Ljava/lang/String;)Lt0/D;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Lt0/C;

    .line 5
    .line 6
    invoke-direct {v2}, Lt0/C;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v3, Lt0/y;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v3, Lt0/y;->g:Ljava/lang/String;

    .line 19
    .line 20
    :goto_0
    sget v4, Ld0/w;->a:I

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    array-length v5, v3

    .line 28
    const/4 v6, 0x0

    .line 29
    move-object v0, v6

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    :goto_1
    iget-object v10, v2, Lt0/C;->b:Lm2/F;

    .line 33
    .line 34
    if-ge v8, v5, :cond_16

    .line 35
    .line 36
    aget-object v11, v3, v8

    .line 37
    .line 38
    const-string v12, ""

    .line 39
    .line 40
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    if-eqz v13, :cond_1

    .line 45
    .line 46
    :goto_2
    move v10, v4

    .line 47
    goto/16 :goto_b

    .line 48
    .line 49
    :cond_1
    sget-object v13, Lt0/E;->a:Ljava/util/regex/Pattern;

    .line 50
    .line 51
    invoke-virtual {v13, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    const-string v15, "i"

    .line 60
    .line 61
    if-nez v14, :cond_3

    .line 62
    .line 63
    sget-object v10, Lt0/E;->b:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    invoke-virtual {v10, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-eqz v12, :cond_2

    .line 74
    .line 75
    invoke-virtual {v10, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-static {v10, v15}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "Malformed SDP line: "

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0, v6}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    throw v0

    .line 105
    :cond_3
    invoke-virtual {v13, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const/4 v7, 0x2

    .line 113
    invoke-virtual {v13, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v16

    .line 124
    const/4 v4, 0x4

    .line 125
    packed-switch v16, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    :pswitch_0
    goto/16 :goto_3

    .line 129
    .line 130
    :pswitch_1
    const-string v15, "z"

    .line 131
    .line 132
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    if-eqz v14, :cond_4

    .line 137
    .line 138
    const/16 v14, 0xe

    .line 139
    .line 140
    goto/16 :goto_4

    .line 141
    .line 142
    :pswitch_2
    const-string v15, "v"

    .line 143
    .line 144
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-eqz v14, :cond_4

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    goto/16 :goto_4

    .line 152
    .line 153
    :pswitch_3
    const-string v15, "u"

    .line 154
    .line 155
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-eqz v14, :cond_4

    .line 160
    .line 161
    move v14, v4

    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :pswitch_4
    const-string v15, "t"

    .line 165
    .line 166
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_4

    .line 171
    .line 172
    const/16 v14, 0x9

    .line 173
    .line 174
    goto/16 :goto_4

    .line 175
    .line 176
    :pswitch_5
    const-string v15, "s"

    .line 177
    .line 178
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_4

    .line 183
    .line 184
    move v14, v7

    .line 185
    goto/16 :goto_4

    .line 186
    .line 187
    :pswitch_6
    const-string v15, "r"

    .line 188
    .line 189
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    if-eqz v14, :cond_4

    .line 194
    .line 195
    const/16 v14, 0xd

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :pswitch_7
    const-string v15, "p"

    .line 199
    .line 200
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-eqz v14, :cond_4

    .line 205
    .line 206
    const/4 v14, 0x6

    .line 207
    goto :goto_4

    .line 208
    :pswitch_8
    const-string v15, "o"

    .line 209
    .line 210
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_4

    .line 215
    .line 216
    move v14, v1

    .line 217
    goto :goto_4

    .line 218
    :pswitch_9
    const-string v15, "m"

    .line 219
    .line 220
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    if-eqz v14, :cond_4

    .line 225
    .line 226
    const/16 v14, 0xc

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :pswitch_a
    const-string v15, "k"

    .line 230
    .line 231
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    if-eqz v14, :cond_4

    .line 236
    .line 237
    const/16 v14, 0xa

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :pswitch_b
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-eqz v14, :cond_4

    .line 245
    .line 246
    const/4 v14, 0x3

    .line 247
    goto :goto_4

    .line 248
    :pswitch_c
    const-string v15, "e"

    .line 249
    .line 250
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    if-eqz v14, :cond_4

    .line 255
    .line 256
    const/4 v14, 0x5

    .line 257
    goto :goto_4

    .line 258
    :pswitch_d
    const-string v15, "c"

    .line 259
    .line 260
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-eqz v14, :cond_4

    .line 265
    .line 266
    const/4 v14, 0x7

    .line 267
    goto :goto_4

    .line 268
    :pswitch_e
    const-string v15, "b"

    .line 269
    .line 270
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-eqz v14, :cond_4

    .line 275
    .line 276
    const/16 v14, 0x8

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :pswitch_f
    const-string v15, "a"

    .line 280
    .line 281
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    if-eqz v14, :cond_4

    .line 286
    .line 287
    const/16 v14, 0xb

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_4
    :goto_3
    const/4 v14, -0x1

    .line 291
    :goto_4
    packed-switch v14, :pswitch_data_1

    .line 292
    .line 293
    .line 294
    goto :goto_8

    .line 295
    :pswitch_10
    if-eqz v0, :cond_5

    .line 296
    .line 297
    :try_start_0
    invoke-virtual {v0}, Lt0/a;->a()Lt0/c;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v10, v0}, Lm2/C;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :catch_0
    move-exception v0

    .line 306
    goto :goto_5

    .line 307
    :catch_1
    move-exception v0

    .line 308
    :goto_5
    invoke-static {v6, v0}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    throw v0

    .line 313
    :cond_5
    :goto_6
    sget-object v0, Lt0/E;->d:Ljava/util/regex/Pattern;

    .line 314
    .line 315
    invoke-virtual {v0, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    const-string v10, "Malformed SDP media description line: "

    .line 324
    .line 325
    if-eqz v9, :cond_7

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const/4 v11, 0x3

    .line 342
    invoke-virtual {v0, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    :try_start_1
    new-instance v4, Lt0/a;

    .line 357
    .line 358
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    invoke-direct {v4, v7, v0, v9, v11}, Lt0/a;-><init>(IILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    .line 367
    .line 368
    .line 369
    move-object v0, v4

    .line 370
    goto :goto_7

    .line 371
    :catch_2
    move-exception v0

    .line 372
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    const-string v7, "SDPParser"

    .line 377
    .line 378
    invoke-static {v7, v4, v0}, Ld0/m;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object v0, v6

    .line 382
    :goto_7
    if-nez v0, :cond_6

    .line 383
    .line 384
    move v9, v1

    .line 385
    goto :goto_8

    .line 386
    :cond_6
    const/4 v9, 0x0

    .line 387
    :goto_8
    const/4 v10, -0x1

    .line 388
    goto/16 :goto_b

    .line 389
    .line 390
    :cond_7
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v0, v6}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    throw v0

    .line 399
    :pswitch_11
    if-eqz v9, :cond_8

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_8
    sget-object v4, Lt0/E;->c:Ljava/util/regex/Pattern;

    .line 403
    .line 404
    invoke-virtual {v4, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    if-eqz v10, :cond_b

    .line 413
    .line 414
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-nez v4, :cond_9

    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_9
    move-object v12, v4

    .line 429
    :goto_9
    if-nez v0, :cond_a

    .line 430
    .line 431
    iget-object v4, v2, Lt0/C;->a:Ljava/util/HashMap;

    .line 432
    .line 433
    invoke-virtual {v4, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_a
    iget-object v4, v0, Lt0/a;->e:Ljava/util/HashMap;

    .line 438
    .line 439
    invoke-virtual {v4, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    const-string v1, "Malformed Attribute line: "

    .line 446
    .line 447
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v0, v6}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    throw v0

    .line 462
    :pswitch_12
    if-eqz v9, :cond_c

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_c
    if-nez v0, :cond_d

    .line 466
    .line 467
    iput-object v13, v2, Lt0/C;->i:Ljava/lang/String;

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_d
    iput-object v13, v0, Lt0/a;->i:Ljava/lang/String;

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :pswitch_13
    iput-object v13, v2, Lt0/C;->f:Ljava/lang/String;

    .line 474
    .line 475
    goto :goto_8

    .line 476
    :pswitch_14
    if-eqz v9, :cond_e

    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_e
    const-string v4, ":\\s?"

    .line 480
    .line 481
    const/4 v10, -0x1

    .line 482
    invoke-virtual {v13, v4, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    array-length v11, v4

    .line 487
    if-ne v11, v7, :cond_f

    .line 488
    .line 489
    move v7, v1

    .line 490
    goto :goto_a

    .line 491
    :cond_f
    const/4 v7, 0x0

    .line 492
    :goto_a
    invoke-static {v7}, Ld0/m;->c(Z)V

    .line 493
    .line 494
    .line 495
    aget-object v4, v4, v1

    .line 496
    .line 497
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    if-nez v0, :cond_10

    .line 502
    .line 503
    mul-int/lit16 v4, v4, 0x3e8

    .line 504
    .line 505
    iput v4, v2, Lt0/C;->c:I

    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_10
    mul-int/lit16 v4, v4, 0x3e8

    .line 509
    .line 510
    iput v4, v0, Lt0/a;->f:I

    .line 511
    .line 512
    goto :goto_b

    .line 513
    :pswitch_15
    const/4 v10, -0x1

    .line 514
    if-eqz v9, :cond_11

    .line 515
    .line 516
    goto :goto_b

    .line 517
    :cond_11
    if-nez v0, :cond_12

    .line 518
    .line 519
    iput-object v13, v2, Lt0/C;->h:Ljava/lang/String;

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_12
    iput-object v13, v0, Lt0/a;->h:Ljava/lang/String;

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :pswitch_16
    const/4 v10, -0x1

    .line 526
    iput-object v13, v2, Lt0/C;->l:Ljava/lang/String;

    .line 527
    .line 528
    goto :goto_b

    .line 529
    :pswitch_17
    const/4 v10, -0x1

    .line 530
    iput-object v13, v2, Lt0/C;->k:Ljava/lang/String;

    .line 531
    .line 532
    goto :goto_b

    .line 533
    :pswitch_18
    const/4 v10, -0x1

    .line 534
    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    iput-object v4, v2, Lt0/C;->g:Landroid/net/Uri;

    .line 539
    .line 540
    goto :goto_b

    .line 541
    :pswitch_19
    const/4 v10, -0x1

    .line 542
    if-eqz v9, :cond_13

    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_13
    if-nez v0, :cond_14

    .line 546
    .line 547
    iput-object v13, v2, Lt0/C;->j:Ljava/lang/String;

    .line 548
    .line 549
    goto :goto_b

    .line 550
    :cond_14
    iput-object v13, v0, Lt0/a;->g:Ljava/lang/String;

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :pswitch_1a
    const/4 v10, -0x1

    .line 554
    iput-object v13, v2, Lt0/C;->d:Ljava/lang/String;

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :pswitch_1b
    const/4 v10, -0x1

    .line 558
    iput-object v13, v2, Lt0/C;->e:Ljava/lang/String;

    .line 559
    .line 560
    goto :goto_b

    .line 561
    :pswitch_1c
    const/4 v10, -0x1

    .line 562
    const-string v4, "0"

    .line 563
    .line 564
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eqz v4, :cond_15

    .line 569
    .line 570
    :goto_b
    add-int/2addr v8, v1

    .line 571
    move v4, v10

    .line 572
    goto/16 :goto_1

    .line 573
    .line 574
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    const-string v1, "SDP version "

    .line 577
    .line 578
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string v1, " is not supported."

    .line 585
    .line 586
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-static {v0, v6}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    throw v0

    .line 598
    :cond_16
    if-eqz v0, :cond_17

    .line 599
    .line 600
    :try_start_2
    invoke-virtual {v0}, Lt0/a;->a()Lt0/c;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v10, v0}, Lm2/C;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3

    .line 605
    .line 606
    .line 607
    goto :goto_d

    .line 608
    :catch_3
    move-exception v0

    .line 609
    goto :goto_c

    .line 610
    :catch_4
    move-exception v0

    .line 611
    :goto_c
    invoke-static {v6, v0}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    throw v0

    .line 616
    :cond_17
    :goto_d
    :try_start_3
    new-instance v0, Lt0/D;

    .line 617
    .line 618
    invoke-direct {v0, v2}, Lt0/D;-><init>(Lt0/C;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_5

    .line 619
    .line 620
    .line 621
    return-object v0

    .line 622
    :catch_5
    move-exception v0

    .line 623
    goto :goto_e

    .line 624
    :catch_6
    move-exception v0

    .line 625
    :goto_e
    invoke-static {v6, v0}, La0/H;->b(Ljava/lang/String;Ljava/lang/Exception;)La0/H;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    throw v0

    .line 630
    nop

    .line 631
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
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
