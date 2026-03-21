.class public LZ1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK1/h;
.implements Lio/flutter/embedding/android/L;
.implements Lc1/l;
.implements LF0/j;
.implements Ln3/c;
.implements Lo0/p;
.implements Lq0/l;


# instance fields
.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    sparse-switch p1, :sswitch_data_0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    return-void

    .line 31
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    return-void

    .line 34
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance p1, Ld0/p;

    invoke-direct {p1}, Ld0/p;-><init>()V

    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 36
    new-instance p1, Lk1/a;

    invoke-direct {p1}, Lk1/a;-><init>()V

    iput-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(LR1/f;LZ1/i;)V
    .locals 1

    const-string v0, "processor"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workTaskExecutor"

    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, LZ1/l;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 4
    invoke-virtual {p0}, LZ1/l;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 5
    const-string v0, "AndroidKeyStore"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 7
    invoke-virtual {v1, p1, v2}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object p1

    if-nez p1, :cond_0

    .line 8
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    .line 9
    :try_start_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v1}, LZ1/l;->d0(Ljava/util/Locale;)V

    .line 10
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 11
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/4 v3, 0x1

    const/16 v4, 0x19

    .line 12
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 13
    const-string v3, "RSA"

    invoke-static {v3, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    .line 14
    invoke-virtual {p0, v1, v2}, LZ1/l;->V(Ljava/util/Calendar;Ljava/util/Calendar;)Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 16
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {p0, p1}, LZ1/l;->d0(Ljava/util/Locale;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0, p1}, LZ1/l;->d0(Ljava/util/Locale;)V

    .line 18
    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;LZ1/s;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 40
    sget v0, Ld0/w;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_1

    if-eqz p2, :cond_1

    .line 41
    iget-object v0, p2, LZ1/s;->o:Ljava/lang/Object;

    check-cast v0, Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lio/flutter/embedding/android/E;->h(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    iget-object p2, p2, LZ1/s;->m:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ld0/m;->h(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    iput-object p2, p0, LZ1/l;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lt0/l;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 44
    invoke-static {p1}, Ld0/w;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    .line 45
    iput-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly2/m;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    iget-object v1, p1, Ly2/m;->a:Ljava/util/HashMap;

    .line 22
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    .line 24
    iget-object p1, p1, Ly2/m;->b:Ljava/util/HashMap;

    .line 25
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    return-void
.end method

.method public static A(LZ1/l;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-static {p0}, LO/i;->c(I)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_8

    .line 12
    .line 13
    aget v3, v0, v2

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v3, v4, :cond_3

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eq v3, v4, :cond_2

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    const-string v4, "SystemUiMode.edgeToEdge"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    throw p0

    .line 32
    :cond_1
    const-string v4, "SystemUiMode.immersiveSticky"

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const-string v4, "SystemUiMode.immersive"

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-string v4, "SystemUiMode.leanBack"

    .line 39
    .line 40
    :goto_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_7

    .line 45
    .line 46
    invoke-static {v3}, LO/i;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-eqz p1, :cond_6

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    if-eq p1, v0, :cond_5

    .line 55
    .line 56
    if-eq p1, v1, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/4 p0, 0x3

    .line 60
    goto :goto_2

    .line 61
    :cond_5
    move p0, v1

    .line 62
    goto :goto_2

    .line 63
    :cond_6
    move p0, v0

    .line 64
    :goto_2
    return p0

    .line 65
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 69
    .line 70
    const-string v0, "No such SystemUiMode: "

    .line 71
    .line 72
    invoke-static {v0, p1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0
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

.method public static B(LZ1/l;Lorg/json/JSONObject;)LT2/i;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "statusBarColor"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, v1

    .line 24
    :goto_0
    const-string p0, "statusBarIconBrightness"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lm/B0;->b(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    move v4, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v4, v2

    .line 44
    :goto_1
    const-string p0, "systemStatusBarContrastEnforced"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v5, p0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v5, v1

    .line 63
    :goto_2
    const-string p0, "systemNavigationBarColor"

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v6, p0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object v6, v1

    .line 82
    :goto_3
    const-string p0, "systemNavigationBarIconBrightness"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lm/B0;->b(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    move v7, p0

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    move v7, v2

    .line 101
    :goto_4
    const-string p0, "systemNavigationBarDividerColor"

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    move-object v8, p0

    .line 118
    goto :goto_5

    .line 119
    :cond_5
    move-object v8, v1

    .line 120
    :goto_5
    const-string p0, "systemNavigationBarContrastEnforced"

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    :cond_6
    move-object v9, v1

    .line 137
    new-instance p0, LT2/i;

    .line 138
    .line 139
    move-object v2, p0

    .line 140
    invoke-direct/range {v2 .. v9}, LT2/i;-><init>(Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Boolean;)V

    .line 141
    .line 142
    .line 143
    return-object p0
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

.method public static y(LZ1/l;Lorg/json/JSONArray;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    move v0, p0

    .line 6
    move v1, v0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x1

    .line 15
    if-ge v0, v3, :cond_b

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v5}, LO/i;->c(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    array-length v7, v5

    .line 26
    move v8, p0

    .line 27
    :goto_1
    if-ge v8, v7, :cond_a

    .line 28
    .line 29
    aget v9, v5, v8

    .line 30
    .line 31
    const/4 v10, 0x1

    .line 32
    if-eq v9, v10, :cond_3

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v9, v10, :cond_2

    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    if-eq v9, v10, :cond_1

    .line 39
    .line 40
    const/4 v10, 0x4

    .line 41
    if-ne v9, v10, :cond_0

    .line 42
    .line 43
    const-string v10, "DeviceOrientation.landscapeRight"

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_1
    const-string v10, "DeviceOrientation.landscapeLeft"

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const-string v10, "DeviceOrientation.portraitDown"

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const-string v10, "DeviceOrientation.portraitUp"

    .line 55
    .line 56
    :goto_2
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    if-eqz v10, :cond_9

    .line 61
    .line 62
    invoke-static {v9}, LO/i;->b(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_7

    .line 67
    .line 68
    if-eq v3, v6, :cond_6

    .line 69
    .line 70
    if-eq v3, v4, :cond_5

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    if-eq v3, v4, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    or-int/lit8 v1, v1, 0x8

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    or-int/lit8 v1, v1, 0x2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    or-int/lit8 v1, v1, 0x4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    or-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    :goto_3
    if-nez v2, :cond_8

    .line 88
    .line 89
    move v2, v1

    .line 90
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_a
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 97
    .line 98
    const-string p1, "No such DeviceOrientation: "

    .line 99
    .line 100
    invoke-static {p1, v3}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_b
    if-eqz v1, :cond_e

    .line 109
    .line 110
    const/16 p1, 0x8

    .line 111
    .line 112
    const/16 v0, 0x9

    .line 113
    .line 114
    packed-switch v1, :pswitch_data_0

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :pswitch_0
    const/16 p0, 0xd

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :pswitch_1
    move p0, v4

    .line 122
    goto :goto_5

    .line 123
    :pswitch_2
    const/16 p0, 0xb

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_c
    :pswitch_3
    move p0, p1

    .line 127
    goto :goto_5

    .line 128
    :pswitch_4
    const/16 p0, 0xc

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_d
    :pswitch_5
    move p0, v0

    .line 132
    goto :goto_5

    .line 133
    :pswitch_6
    if-eq v2, v4, :cond_f

    .line 134
    .line 135
    if-eq v2, v5, :cond_d

    .line 136
    .line 137
    if-eq v2, p1, :cond_c

    .line 138
    .line 139
    :goto_4
    move p0, v6

    .line 140
    goto :goto_5

    .line 141
    :cond_e
    const/4 p0, -0x1

    .line 142
    :cond_f
    :goto_5
    :pswitch_7
    return p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_0
    .end packed-switch
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

.method public static z(LZ1/l;Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lm3/e;->values()[Lm3/e;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    array-length v4, v3

    .line 26
    move v5, v0

    .line 27
    :goto_1
    if-ge v5, v4, :cond_3

    .line 28
    .line 29
    aget-object v6, v3, v5

    .line 30
    .line 31
    iget-object v7, v6, Lm3/e;->l:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v2, v3, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    sget-object v2, Lm3/e;->n:Lm3/e;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    sget-object v2, Lm3/e;->m:Lm3/e;

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 67
    .line 68
    const-string p1, "No such SystemUiOverlay: "

    .line 69
    .line 70
    invoke-static {p1, v2}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_4
    return-object p0
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
.method public C()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ".FlutterSecureStoragePluginKey"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
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

.method public D(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->D(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public E(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/fragment/app/L;->v:Landroidx/fragment/app/v;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/fragment/app/v;->r:Landroidx/fragment/app/w;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, LZ1/l;->E(Landroidx/fragment/app/r;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    return-void
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

.method public F(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->F(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public G(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->G(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public H(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->H(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public I(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->I(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public J(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/fragment/app/L;->v:Landroidx/fragment/app/v;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/fragment/app/v;->r:Landroidx/fragment/app/w;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, LZ1/l;->J(Landroidx/fragment/app/r;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    return-void
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

.method public K(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->K(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public L(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->L(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public M(Landroidx/fragment/app/r;Landroid/os/Bundle;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, v1}, LZ1/l;->M(Landroidx/fragment/app/r;Landroid/os/Bundle;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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
.end method

.method public N(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->N(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public O(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->O(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public P(Landroidx/fragment/app/r;Lio/flutter/embedding/android/D;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "v"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/fragment/app/L;

    .line 14
    .line 15
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2, v1}, LZ1/l;->P(Landroidx/fragment/app/r;Lio/flutter/embedding/android/D;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    if-eqz p3, :cond_1

    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    throw p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
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
.end method

.method public Q(Landroidx/fragment/app/r;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/L;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/L;->x:Landroidx/fragment/app/r;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/r;->e()Landroidx/fragment/app/L;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    iget-object v0, v0, Landroidx/fragment/app/L;->n:LZ1/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LZ1/l;->Q(Landroidx/fragment/app/r;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
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

.method public R()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public S(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/o;->b(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/o;->b(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/p;->h(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    return-object p1
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

.method public T()Ljavax/crypto/Cipher;
    .locals 2

    .line 1
    const-string v0, "RSA/ECB/PKCS1Padding"

    .line 2
    .line 3
    const-string v1, "AndroidKeyStoreBCWorkaround"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public declared-synchronized U()Ljava/util/Map;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
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

.method public V(Ljava/util/Calendar;Ljava/util/Calendar;)Landroid/security/keystore/KeyGenParameterSpec;
    .locals 4

    .line 1
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 2
    .line 3
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v0, v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljavax/security/auth/x500/X500Principal;

    .line 12
    .line 13
    const-string v3, "CN="

    .line 14
    .line 15
    invoke-static {v3, v1}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v2, v1}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "SHA-256"

    .line 27
    .line 28
    filled-new-array {v1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "ECB"

    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "PKCS1Padding"

    .line 47
    .line 48
    filled-new-array {v1}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-wide/16 v1, 0x1

    .line 57
    .line 58
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateSerialNumber(Ljava/math/BigInteger;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateNotBefore(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateNotAfter(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1
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

.method public W(LZ1/c;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lt0/A;->c:Lt0/A;

    .line 4
    .line 5
    iget-object v3, p1, LZ1/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, Lt0/D;

    .line 8
    .line 9
    iget-object v3, v3, Lt0/D;->a:Lm2/g0;

    .line 10
    .line 11
    const-string v4, "range"

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lm2/g0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lt0/l;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static {v3}, Lt0/A;->a(Ljava/lang/String;)Lt0/A;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_0
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    iget-object v0, v4, Lt0/l;->l:Lm3/i;

    .line 32
    .line 33
    const-string v1, "SDP format error."

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Lm3/i;->s(Ljava/lang/String;Ljava/io/IOException;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    :goto_0
    iget-object v3, v4, Lt0/l;->s:Landroid/net/Uri;

    .line 40
    .line 41
    new-instance v5, Lm2/F;

    .line 42
    .line 43
    invoke-direct {v5}, Lm2/F;-><init>()V

    .line 44
    .line 45
    .line 46
    move v6, v0

    .line 47
    :goto_1
    iget-object v7, p1, LZ1/c;->m:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Lt0/D;

    .line 50
    .line 51
    iget-object v8, v7, Lt0/D;->b:Lm2/b0;

    .line 52
    .line 53
    invoke-virtual {v8}, Lm2/b0;->size()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-ge v6, v8, :cond_13

    .line 58
    .line 59
    iget-object v7, v7, Lt0/D;->b:Lm2/b0;

    .line 60
    .line 61
    invoke-virtual {v7, v6}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Lt0/c;

    .line 66
    .line 67
    iget-object v8, v7, Lt0/c;->j:Lt0/b;

    .line 68
    .line 69
    iget-object v8, v8, Lt0/b;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v8}, La/a;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 v9, -0x1

    .line 79
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    sparse-switch v10, :sswitch_data_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :sswitch_0
    const-string v10, "H263-2000"

    .line 89
    .line 90
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_1

    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_1
    const/16 v9, 0x10

    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :sswitch_1
    const-string v10, "H263-1998"

    .line 103
    .line 104
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-nez v8, :cond_2

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :cond_2
    const/16 v9, 0xf

    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :sswitch_2
    const-string v10, "MP4V-ES"

    .line 117
    .line 118
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_3

    .line 123
    .line 124
    goto/16 :goto_2

    .line 125
    .line 126
    :cond_3
    const/16 v9, 0xe

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :sswitch_3
    const-string v10, "AMR-WB"

    .line 131
    .line 132
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v8, :cond_4

    .line 137
    .line 138
    goto/16 :goto_2

    .line 139
    .line 140
    :cond_4
    const/16 v9, 0xd

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :sswitch_4
    const-string v10, "MP4A-LATM"

    .line 145
    .line 146
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-nez v8, :cond_5

    .line 151
    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :cond_5
    const/16 v9, 0xc

    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :sswitch_5
    const-string v10, "PCMU"

    .line 159
    .line 160
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-nez v8, :cond_6

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_6
    const/16 v9, 0xb

    .line 169
    .line 170
    goto/16 :goto_2

    .line 171
    .line 172
    :sswitch_6
    const-string v10, "PCMA"

    .line 173
    .line 174
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-nez v8, :cond_7

    .line 179
    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_7
    const/16 v9, 0xa

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :sswitch_7
    const-string v10, "OPUS"

    .line 187
    .line 188
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-nez v8, :cond_8

    .line 193
    .line 194
    goto/16 :goto_2

    .line 195
    .line 196
    :cond_8
    const/16 v9, 0x9

    .line 197
    .line 198
    goto/16 :goto_2

    .line 199
    .line 200
    :sswitch_8
    const-string v10, "H265"

    .line 201
    .line 202
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-nez v8, :cond_9

    .line 207
    .line 208
    goto/16 :goto_2

    .line 209
    .line 210
    :cond_9
    const/16 v9, 0x8

    .line 211
    .line 212
    goto/16 :goto_2

    .line 213
    .line 214
    :sswitch_9
    const-string v10, "H264"

    .line 215
    .line 216
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    if-nez v8, :cond_a

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_a
    const/4 v9, 0x7

    .line 224
    goto :goto_2

    .line 225
    :sswitch_a
    const-string v10, "VP9"

    .line 226
    .line 227
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_b

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_b
    const/4 v9, 0x6

    .line 235
    goto :goto_2

    .line 236
    :sswitch_b
    const-string v10, "VP8"

    .line 237
    .line 238
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-nez v8, :cond_c

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_c
    const/4 v9, 0x5

    .line 246
    goto :goto_2

    .line 247
    :sswitch_c
    const-string v10, "L16"

    .line 248
    .line 249
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-nez v8, :cond_d

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_d
    const/4 v9, 0x4

    .line 257
    goto :goto_2

    .line 258
    :sswitch_d
    const-string v10, "AMR"

    .line 259
    .line 260
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-nez v8, :cond_e

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_e
    const/4 v9, 0x3

    .line 268
    goto :goto_2

    .line 269
    :sswitch_e
    const-string v10, "AC3"

    .line 270
    .line 271
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-nez v8, :cond_f

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_f
    const/4 v9, 0x2

    .line 279
    goto :goto_2

    .line 280
    :sswitch_f
    const-string v10, "L8"

    .line 281
    .line 282
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-nez v8, :cond_10

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_10
    move v9, v1

    .line 290
    goto :goto_2

    .line 291
    :sswitch_10
    const-string v10, "MPEG4-GENERIC"

    .line 292
    .line 293
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-nez v8, :cond_11

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_11
    move v9, v0

    .line 301
    :goto_2
    packed-switch v9, :pswitch_data_0

    .line 302
    .line 303
    .line 304
    move v8, v0

    .line 305
    goto :goto_3

    .line 306
    :pswitch_0
    move v8, v1

    .line 307
    :goto_3
    if-eqz v8, :cond_12

    .line 308
    .line 309
    new-instance v8, Lt0/u;

    .line 310
    .line 311
    iget-object v9, p1, LZ1/c;->l:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v9, Lt0/m;

    .line 314
    .line 315
    invoke-direct {v8, v9, v7, v3}, Lt0/u;-><init>(Lt0/m;Lt0/c;Landroid/net/Uri;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v8}, Lm2/F;->c(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    add-int/2addr v6, v1

    .line 322
    goto/16 :goto_1

    .line 323
    .line 324
    :cond_13
    invoke-virtual {v5}, Lm2/F;->g()Lm2/b0;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    iget-object v5, v4, Lt0/l;->l:Lm3/i;

    .line 333
    .line 334
    if-eqz v3, :cond_14

    .line 335
    .line 336
    const/4 p1, 0x0

    .line 337
    const-string v0, "No playable track."

    .line 338
    .line 339
    invoke-virtual {v5, v0, p1}, Lm3/i;->s(Ljava/lang/String;Ljava/io/IOException;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move v3, v0

    .line 347
    :goto_4
    invoke-virtual {p1}, Lm2/b0;->size()I

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    iget-object v7, v5, Lm3/i;->m:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v7, Lt0/q;

    .line 354
    .line 355
    if-ge v3, v6, :cond_15

    .line 356
    .line 357
    invoke-virtual {p1, v3}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    check-cast v6, Lt0/u;

    .line 362
    .line 363
    new-instance v8, Lt0/p;

    .line 364
    .line 365
    iget-object v9, v7, Lt0/q;->s:Lp1/b;

    .line 366
    .line 367
    invoke-direct {v8, v7, v6, v3, v9}, Lt0/p;-><init>(Lt0/q;Lt0/u;ILp1/b;)V

    .line 368
    .line 369
    .line 370
    iget-object v6, v7, Lt0/q;->p:Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    invoke-virtual {v8}, Lt0/p;->b()V

    .line 376
    .line 377
    .line 378
    add-int/2addr v3, v1

    .line 379
    goto :goto_4

    .line 380
    :cond_15
    invoke-static {v7}, Lt0/q;->k(Lt0/q;)Lm3/i;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    iget-wide v5, v2, Lt0/A;->a:J

    .line 388
    .line 389
    iget-wide v2, v2, Lt0/A;->b:J

    .line 390
    .line 391
    sub-long v5, v2, v5

    .line 392
    .line 393
    invoke-static {v5, v6}, Ld0/w;->M(J)J

    .line 394
    .line 395
    .line 396
    move-result-wide v5

    .line 397
    iget-object p1, p1, Lm3/i;->m:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast p1, Lt0/t;

    .line 400
    .line 401
    iput-wide v5, p1, Lt0/t;->w:J

    .line 402
    .line 403
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    cmp-long v7, v2, v5

    .line 409
    .line 410
    if-nez v7, :cond_16

    .line 411
    .line 412
    move v7, v1

    .line 413
    goto :goto_5

    .line 414
    :cond_16
    move v7, v0

    .line 415
    :goto_5
    xor-int/2addr v7, v1

    .line 416
    iput-boolean v7, p1, Lt0/t;->x:Z

    .line 417
    .line 418
    cmp-long v2, v2, v5

    .line 419
    .line 420
    if-nez v2, :cond_17

    .line 421
    .line 422
    move v2, v1

    .line 423
    goto :goto_6

    .line 424
    :cond_17
    move v2, v0

    .line 425
    :goto_6
    iput-boolean v2, p1, Lt0/t;->y:Z

    .line 426
    .line 427
    iput-boolean v0, p1, Lt0/t;->z:Z

    .line 428
    .line 429
    invoke-virtual {p1}, Lt0/t;->w()V

    .line 430
    .line 431
    .line 432
    iput-boolean v1, v4, Lt0/l;->A:Z

    .line 433
    .line 434
    return-void

    .line 435
    :sswitch_data_0
    .sparse-switch
        -0x7290cac7 -> :sswitch_10
        0x96c -> :sswitch_f
        0xfc51 -> :sswitch_e
        0xfda6 -> :sswitch_d
        0x12371 -> :sswitch_c
        0x14cbe -> :sswitch_b
        0x14cbf -> :sswitch_a
        0x217d28 -> :sswitch_9
        0x217d29 -> :sswitch_8
        0x25203f -> :sswitch_7
        0x2562c7 -> :sswitch_6
        0x2562db -> :sswitch_5
        0x3f401eeb -> :sswitch_4
        0x734e0c52 -> :sswitch_3
        0x74c813f6 -> :sswitch_2
        0x7f62e82d -> :sswitch_1
        0x7f6339a4 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public X(Lm3/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/l;

    .line 4
    .line 5
    iget-object v1, v0, Lt0/l;->x:Lt0/k;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p1, Lm3/i;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm2/I;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, Lm2/I;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p1, v0, Lt0/l;->l:Lm3/i;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    const-string v1, "DESCRIBE not supported."

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Lm3/i;->s(Ljava/lang/String;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    iget-object p1, v0, Lt0/l;->s:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v1, v0, Lt0/l;->v:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, v0, Lt0/l;->r:LD0/d;

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, LD0/d;->q(Landroid/net/Uri;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    return-void
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

.method public Y()V
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/l;

    .line 4
    .line 5
    iget v1, v0, Lt0/l;->z:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    move v1, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v3

    .line 15
    :goto_0
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 16
    .line 17
    .line 18
    iput v4, v0, Lt0/l;->z:I

    .line 19
    .line 20
    iput-boolean v3, v0, Lt0/l;->C:Z

    .line 21
    .line 22
    iget-wide v1, v0, Lt0/l;->D:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v3, v1, v3

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v1, v2}, Ld0/w;->Z(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, Lt0/l;->o(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
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

.method public Z(LZ1/c;)V
    .locals 13

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/l;

    .line 4
    .line 5
    iget v1, v0, Lt0/l;->z:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move v1, v3

    .line 17
    :goto_1
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 18
    .line 19
    .line 20
    iput v2, v0, Lt0/l;->z:I

    .line 21
    .line 22
    iget-object v1, v0, Lt0/l;->x:Lt0/k;

    .line 23
    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    new-instance v1, Lt0/k;

    .line 27
    .line 28
    iget-wide v4, v0, Lt0/l;->w:J

    .line 29
    .line 30
    const-wide/16 v6, 0x2

    .line 31
    .line 32
    div-long/2addr v4, v6

    .line 33
    invoke-direct {v1, v0, v4, v5}, Lt0/k;-><init>(Lt0/l;J)V

    .line 34
    .line 35
    .line 36
    iput-object v1, v0, Lt0/l;->x:Lt0/k;

    .line 37
    .line 38
    iget-boolean v2, v1, Lt0/k;->n:Z

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iput-boolean v3, v1, Lt0/k;->n:Z

    .line 44
    .line 45
    iget-object v2, v1, Lt0/k;->l:Landroid/os/Handler;

    .line 46
    .line 47
    invoke-virtual {v2, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iput-wide v1, v0, Lt0/l;->D:J

    .line 56
    .line 57
    iget-object v0, v0, Lt0/l;->m:Lm3/i;

    .line 58
    .line 59
    iget-object v1, p1, LZ1/c;->l:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lt0/A;

    .line 62
    .line 63
    iget-wide v1, v1, Lt0/A;->a:J

    .line 64
    .line 65
    invoke-static {v1, v2}, Ld0/w;->M(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    iget-object p1, p1, LZ1/c;->m:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lm2/I;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v3, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    move v5, v4

    .line 87
    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-ge v5, v6, :cond_4

    .line 92
    .line 93
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lt0/B;

    .line 98
    .line 99
    iget-object v6, v6, Lt0/B;->c:Landroid/net/Uri;

    .line 100
    .line 101
    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v6}, Ld0/m;->f(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    add-int/lit8 v5, v5, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move v5, v4

    .line 115
    :goto_4
    iget-object v6, v0, Lm3/i;->m:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, Lt0/q;

    .line 118
    .line 119
    invoke-static {v6}, Lt0/q;->j(Lt0/q;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-ge v5, v7, :cond_6

    .line 128
    .line 129
    invoke-static {v6}, Lt0/q;->j(Lt0/q;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    check-cast v7, Lt0/o;

    .line 138
    .line 139
    invoke-virtual {v7}, Lt0/o;->a()Landroid/net/Uri;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v7}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-nez v7, :cond_5

    .line 152
    .line 153
    invoke-static {v6}, Lt0/q;->k(Lt0/q;)Lm3/i;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    iget-object v7, v7, Lm3/i;->m:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v7, Lt0/t;

    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    iput-boolean v8, v7, Lt0/t;->x:Z

    .line 163
    .line 164
    invoke-virtual {v7}, Lt0/t;->w()V

    .line 165
    .line 166
    .line 167
    invoke-static {v6}, Lt0/q;->m(Lt0/q;)Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-eqz v7, :cond_5

    .line 172
    .line 173
    const/4 v7, 0x1

    .line 174
    iput-boolean v7, v6, Lt0/q;->B:Z

    .line 175
    .line 176
    invoke-static {v6}, Lt0/q;->d(Lt0/q;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v6}, Lt0/q;->q(Lt0/q;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v6}, Lt0/q;->i(Lt0/q;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    :goto_5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-ge v4, v0, :cond_e

    .line 193
    .line 194
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lt0/B;

    .line 199
    .line 200
    iget-object v3, v0, Lt0/B;->c:Landroid/net/Uri;

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    :goto_6
    iget-object v7, v6, Lt0/q;->p:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-ge v5, v8, :cond_8

    .line 210
    .line 211
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    check-cast v8, Lt0/p;

    .line 216
    .line 217
    iget-boolean v8, v8, Lt0/p;->d:Z

    .line 218
    .line 219
    if-nez v8, :cond_7

    .line 220
    .line 221
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    check-cast v7, Lt0/p;

    .line 226
    .line 227
    iget-object v7, v7, Lt0/p;->a:Lt0/o;

    .line 228
    .line 229
    invoke-virtual {v7}, Lt0/o;->a()Landroid/net/Uri;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v8, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eqz v8, :cond_7

    .line 238
    .line 239
    iget-object v3, v7, Lt0/o;->b:Lt0/e;

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_8
    const/4 v3, 0x0

    .line 246
    :goto_7
    if-nez v3, :cond_9

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_9
    iget-wide v7, v0, Lt0/B;->a:J

    .line 250
    .line 251
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    cmp-long v5, v7, v9

    .line 257
    .line 258
    if-eqz v5, :cond_a

    .line 259
    .line 260
    iget-object v5, v3, Lt0/e;->s:Lt0/f;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-boolean v5, v5, Lt0/f;->h:Z

    .line 266
    .line 267
    if-nez v5, :cond_b

    .line 268
    .line 269
    iget-object v5, v3, Lt0/e;->s:Lt0/f;

    .line 270
    .line 271
    iput-wide v7, v5, Lt0/f;->i:J

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    :cond_b
    :goto_8
    iget v0, v0, Lt0/B;->b:I

    .line 278
    .line 279
    iget-object v5, v3, Lt0/e;->s:Lt0/f;

    .line 280
    .line 281
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-boolean v5, v5, Lt0/f;->h:Z

    .line 285
    .line 286
    if-nez v5, :cond_c

    .line 287
    .line 288
    iget-object v5, v3, Lt0/e;->s:Lt0/f;

    .line 289
    .line 290
    iput v0, v5, Lt0/f;->j:I

    .line 291
    .line 292
    :cond_c
    invoke-static {v6}, Lt0/q;->m(Lt0/q;)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_d

    .line 297
    .line 298
    invoke-static {v6}, Lt0/q;->a(Lt0/q;)J

    .line 299
    .line 300
    .line 301
    move-result-wide v9

    .line 302
    invoke-static {v6}, Lt0/q;->n(Lt0/q;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v11

    .line 306
    cmp-long v0, v9, v11

    .line 307
    .line 308
    if-nez v0, :cond_d

    .line 309
    .line 310
    iput-wide v1, v3, Lt0/e;->v:J

    .line 311
    .line 312
    iput-wide v7, v3, Lt0/e;->w:J

    .line 313
    .line 314
    :cond_d
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 315
    .line 316
    goto/16 :goto_5

    .line 317
    .line 318
    :cond_e
    invoke-static {v6}, Lt0/q;->m(Lt0/q;)Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_10

    .line 323
    .line 324
    invoke-static {v6}, Lt0/q;->a(Lt0/q;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v0

    .line 328
    invoke-static {v6}, Lt0/q;->n(Lt0/q;)J

    .line 329
    .line 330
    .line 331
    move-result-wide v2

    .line 332
    cmp-long p1, v0, v2

    .line 333
    .line 334
    if-nez p1, :cond_f

    .line 335
    .line 336
    invoke-static {v6}, Lt0/q;->d(Lt0/q;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v6}, Lt0/q;->q(Lt0/q;)V

    .line 340
    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_f
    invoke-static {v6}, Lt0/q;->d(Lt0/q;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v6}, Lt0/q;->n(Lt0/q;)J

    .line 347
    .line 348
    .line 349
    move-result-wide v0

    .line 350
    invoke-virtual {v6, v0, v1}, Lt0/q;->o(J)J

    .line 351
    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_10
    invoke-static {v6}, Lt0/q;->g(Lt0/q;)J

    .line 355
    .line 356
    .line 357
    move-result-wide v0

    .line 358
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    cmp-long p1, v0, v2

    .line 364
    .line 365
    if-eqz p1, :cond_11

    .line 366
    .line 367
    iget-boolean p1, v6, Lt0/q;->G:Z

    .line 368
    .line 369
    if-eqz p1, :cond_11

    .line 370
    .line 371
    invoke-static {v6}, Lt0/q;->g(Lt0/q;)J

    .line 372
    .line 373
    .line 374
    move-result-wide v0

    .line 375
    invoke-virtual {v6, v0, v1}, Lt0/q;->o(J)J

    .line 376
    .line 377
    .line 378
    invoke-static {v6}, Lt0/q;->i(Lt0/q;)V

    .line 379
    .line 380
    .line 381
    :cond_11
    :goto_a
    return-void
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

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 6
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
.end method

.method public a0(Lm3/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/l;

    .line 4
    .line 5
    iget v1, v0, Lt0/l;->z:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    move v1, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-static {v1}, Ld0/m;->h(Z)V

    .line 15
    .line 16
    .line 17
    iput v3, v0, Lt0/l;->z:I

    .line 18
    .line 19
    iget-object p1, p1, Lm3/i;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, LN0/c;

    .line 22
    .line 23
    iget-object v1, p1, LN0/c;->n:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iput-object v1, v0, Lt0/l;->v:Ljava/lang/String;

    .line 28
    .line 29
    iget-wide v1, p1, LN0/c;->m:J

    .line 30
    .line 31
    iput-wide v1, v0, Lt0/l;->w:J

    .line 32
    .line 33
    invoke-virtual {v0}, Lt0/l;->k()V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public b(ILQ1/a;JI)V
    .locals 7

    .line 1
    iget-object p2, p2, LQ1/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v3, p2

    .line 4
    check-cast v3, Landroid/media/MediaCodec$CryptoInfo;

    .line 5
    .line 6
    iget-object p2, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Landroid/media/MediaCodec;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move v1, p1

    .line 13
    move-wide v4, p3

    .line 14
    move v6, p5

    .line 15
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public b0(Ly2/k;)V
    .locals 3

    .line 1
    new-instance v0, Ly2/l;

    .line 2
    .line 3
    iget-object v1, p1, Ly2/k;->a:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Lz2/g;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ly2/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly2/k;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void
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
.end method

.method public c(IIJI)V
    .locals 8

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/media/MediaCodec;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    move v2, p1

    .line 8
    move v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    move v7, p5

    .line 11
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 12
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

.method public c0(Lr2/m;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Lr2/m;->c()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lr2/m;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 61
    .line 62
    const-string v0, "wrapper must be non-null"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
.end method

.method public d(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return v0
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

.method public d0(Ljava/util/Locale;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    return-void
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

.method public e(LF0/m;J)LF0/i;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v5, v1, LF0/m;->o:J

    .line 6
    .line 7
    iget-wide v2, v1, LF0/m;->n:J

    .line 8
    .line 9
    sub-long/2addr v2, v5

    .line 10
    const-wide/16 v7, 0x4e20

    .line 11
    .line 12
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    long-to-int v2, v2

    .line 17
    iget-object v3, v0, LZ1/l;->m:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ld0/p;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ld0/p;->E(I)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v3, Ld0/p;->a:[B

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-virtual {v1, v4, v7, v2, v7}, LF0/m;->t([BIIZ)Z

    .line 28
    .line 29
    .line 30
    const/4 v1, -0x1

    .line 31
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    move v2, v1

    .line 37
    move-wide v11, v7

    .line 38
    :goto_0
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v9, 0x4

    .line 43
    if-lt v4, v9, :cond_e

    .line 44
    .line 45
    iget-object v4, v3, Ld0/p;->a:[B

    .line 46
    .line 47
    iget v10, v3, Ld0/p;->b:I

    .line 48
    .line 49
    invoke-static {v10, v4}, LK0/b;->a(I[B)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v10, 0x1

    .line 54
    const/16 v13, 0x1ba

    .line 55
    .line 56
    if-eq v4, v13, :cond_0

    .line 57
    .line 58
    invoke-virtual {v3, v10}, Ld0/p;->I(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v3, v9}, Ld0/p;->I(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ll1/x;->c(Ld0/p;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    cmp-long v1, v14, v7

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    iget-object v1, v0, LZ1/l;->l:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ld0/u;

    .line 76
    .line 77
    invoke-virtual {v1, v14, v15}, Ld0/u;->b(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v14

    .line 81
    cmp-long v1, v14, p2

    .line 82
    .line 83
    if-lez v1, :cond_2

    .line 84
    .line 85
    cmp-long v1, v11, v7

    .line 86
    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    new-instance v7, LF0/i;

    .line 90
    .line 91
    const/4 v2, -0x1

    .line 92
    move-object v1, v7

    .line 93
    move-wide v3, v14

    .line 94
    invoke-direct/range {v1 .. v6}, LF0/i;-><init>(IJJ)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_1
    int-to-long v1, v2

    .line 100
    add-long v11, v5, v1

    .line 101
    .line 102
    new-instance v1, LF0/i;

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    move-object v7, v1

    .line 111
    invoke-direct/range {v7 .. v12}, LF0/i;-><init>(IJJ)V

    .line 112
    .line 113
    .line 114
    :goto_1
    move-object v7, v1

    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_2
    const-wide/32 v1, 0x186a0

    .line 118
    .line 119
    .line 120
    add-long/2addr v1, v14

    .line 121
    cmp-long v1, v1, p2

    .line 122
    .line 123
    if-lez v1, :cond_3

    .line 124
    .line 125
    iget v1, v3, Ld0/p;->b:I

    .line 126
    .line 127
    int-to-long v1, v1

    .line 128
    add-long v11, v5, v1

    .line 129
    .line 130
    new-instance v1, LF0/i;

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    move-object v7, v1

    .line 139
    invoke-direct/range {v7 .. v12}, LF0/i;-><init>(IJJ)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    iget v1, v3, Ld0/p;->b:I

    .line 144
    .line 145
    move v2, v1

    .line 146
    move-wide v11, v14

    .line 147
    :cond_4
    iget v1, v3, Ld0/p;->c:I

    .line 148
    .line 149
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    const/16 v14, 0xa

    .line 154
    .line 155
    if-ge v4, v14, :cond_5

    .line 156
    .line 157
    invoke-virtual {v3, v1}, Ld0/p;->H(I)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_5
    const/16 v4, 0x9

    .line 163
    .line 164
    invoke-virtual {v3, v4}, Ld0/p;->I(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ld0/p;->v()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    and-int/lit8 v4, v4, 0x7

    .line 172
    .line 173
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-ge v14, v4, :cond_6

    .line 178
    .line 179
    invoke-virtual {v3, v1}, Ld0/p;->H(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    invoke-virtual {v3, v4}, Ld0/p;->I(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-ge v4, v9, :cond_7

    .line 191
    .line 192
    invoke-virtual {v3, v1}, Ld0/p;->H(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    iget-object v4, v3, Ld0/p;->a:[B

    .line 197
    .line 198
    iget v14, v3, Ld0/p;->b:I

    .line 199
    .line 200
    invoke-static {v14, v4}, LK0/b;->a(I[B)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const/16 v14, 0x1bb

    .line 205
    .line 206
    if-ne v4, v14, :cond_9

    .line 207
    .line 208
    invoke-virtual {v3, v9}, Ld0/p;->I(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ld0/p;->B()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-ge v14, v4, :cond_8

    .line 220
    .line 221
    invoke-virtual {v3, v1}, Ld0/p;->H(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    invoke-virtual {v3, v4}, Ld0/p;->I(I)V

    .line 226
    .line 227
    .line 228
    :cond_9
    :goto_2
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-lt v4, v9, :cond_d

    .line 233
    .line 234
    iget-object v4, v3, Ld0/p;->a:[B

    .line 235
    .line 236
    iget v14, v3, Ld0/p;->b:I

    .line 237
    .line 238
    invoke-static {v14, v4}, LK0/b;->a(I[B)I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eq v4, v13, :cond_d

    .line 243
    .line 244
    const/16 v14, 0x1b9

    .line 245
    .line 246
    if-ne v4, v14, :cond_a

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_a
    ushr-int/lit8 v4, v4, 0x8

    .line 250
    .line 251
    if-eq v4, v10, :cond_b

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_b
    invoke-virtual {v3, v9}, Ld0/p;->I(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3}, Ld0/p;->a()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    const/4 v14, 0x2

    .line 262
    if-ge v4, v14, :cond_c

    .line 263
    .line 264
    invoke-virtual {v3, v1}, Ld0/p;->H(I)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_c
    invoke-virtual {v3}, Ld0/p;->B()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    iget v14, v3, Ld0/p;->c:I

    .line 273
    .line 274
    iget v15, v3, Ld0/p;->b:I

    .line 275
    .line 276
    add-int/2addr v15, v4

    .line 277
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    invoke-virtual {v3, v4}, Ld0/p;->H(I)V

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_d
    :goto_3
    iget v1, v3, Ld0/p;->b:I

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_e
    cmp-long v2, v11, v7

    .line 290
    .line 291
    if-eqz v2, :cond_f

    .line 292
    .line 293
    int-to-long v1, v1

    .line 294
    add-long v13, v5, v1

    .line 295
    .line 296
    new-instance v7, LF0/i;

    .line 297
    .line 298
    const/4 v10, -0x2

    .line 299
    move-object v9, v7

    .line 300
    invoke-direct/range {v9 .. v14}, LF0/i;-><init>(IJJ)V

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_f
    sget-object v7, LF0/i;->d:LF0/i;

    .line 305
    .line 306
    :goto_4
    return-object v7
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

.method public e0(LR1/k;I)V
    .locals 3

    .line 1
    const-string v0, "workSpecId"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La2/q;

    .line 7
    .line 8
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LR1/f;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, p1, v2, p2}, La2/q;-><init>(LR1/f;LR1/k;ZI)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LZ1/i;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LZ1/i;->h(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public f0([B)Ljava/security/Key;
    .locals 4

    .line 1
    const-string v0, "AndroidKeyStore"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    instance-of v1, v0, Ljava/security/PrivateKey;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Ljava/security/PrivateKey;

    .line 26
    .line 27
    invoke-virtual {p0}, LZ1/l;->T()Ljavax/crypto/Cipher;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0}, LZ1/l;->R()Ljava/security/spec/AlgorithmParameterSpec;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x4

    .line 36
    invoke-virtual {v1, v3, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    const-string v2, "AES"

    .line 41
    .line 42
    invoke-virtual {v1, p1, v2, v0}, Ljavax/crypto/Cipher;->unwrap([BLjava/lang/String;I)Ljava/security/Key;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 48
    .line 49
    const-string v0, "Not an instance of a PrivateKey"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    .line 56
    .line 57
    const-string v0, "No key found under alias: "

    .line 58
    .line 59
    invoke-static {v0, v2}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
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
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 6
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
.end method

.method public g(JI)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p3, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
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

.method public g0(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/o;->b(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/p;->n(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    return p1
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

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {v0}, Lio/flutter/embedding/android/E;->f(Landroid/media/MediaCodec;)V

    .line 6
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
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 6
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
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 7
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

.method public l(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public m()LB0/t;
    .locals 4

    .line 1
    new-instance v0, LZ1/e;

    .line 2
    .line 3
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La0/z;

    .line 6
    .line 7
    invoke-virtual {v1}, La0/z;->m()LB0/t;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    const/16 v3, 0x14

    .line 16
    .line 17
    invoke-direct {v0, v1, v3, v2}, LZ1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public n(Lo0/l;Lo0/i;)LB0/t;
    .locals 2

    .line 1
    new-instance v0, LZ1/e;

    .line 2
    .line 3
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La0/z;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lo0/o;

    .line 11
    .line 12
    invoke-direct {v1, p1, p2}, Lo0/o;-><init>(Lo0/l;Lo0/i;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    const/16 p2, 0x14

    .line 20
    .line 21
    invoke-direct {v0, v1, p2, p1}, LZ1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public o()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public p()I
    .locals 3

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
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
.end method

.method public r(Landroid/view/KeyEvent;La0/m;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v2}, La0/m;->c(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v3, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lc4/i;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v3, v4}, Lc4/i;->a(I)Ljava/lang/Character;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v1, v2

    .line 31
    :goto_0
    new-instance v0, LI2/g;

    .line 32
    .line 33
    const/16 v4, 0x11

    .line 34
    .line 35
    invoke-direct {v0, p2, v4}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p2, Lm3/b;

    .line 41
    .line 42
    new-instance v4, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    const-string v1, "keyup"

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string v1, "keydown"

    .line 53
    .line 54
    :goto_1
    const-string v5, "type"

    .line 55
    .line 56
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    const-string v1, "keymap"

    .line 60
    .line 61
    const-string v5, "android"

    .line 62
    .line 63
    invoke-virtual {v4, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v5, "flags"

    .line 75
    .line 76
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->getUnicodeChar(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "plainCodePoint"

    .line 88
    .line 89
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, "codePoint"

    .line 101
    .line 102
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "keyCode"

    .line 114
    .line 115
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v2, "scanCode"

    .line 127
    .line 128
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, "metaState"

    .line 140
    .line 141
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const-string v1, "character"

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const-string v2, "source"

    .line 162
    .line 163
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const-string v2, "deviceId"

    .line 175
    .line 176
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    const-string v1, "repeatCount"

    .line 188
    .line 189
    invoke-virtual {v4, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    new-instance p1, LI2/g;

    .line 193
    .line 194
    const/16 v1, 0x14

    .line 195
    .line 196
    invoke-direct {p1, v0, v1}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 197
    .line 198
    .line 199
    iget-object p2, p2, Lm3/b;->a:LZ1/i;

    .line 200
    .line 201
    invoke-virtual {p2, v4, p1}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 202
    .line 203
    .line 204
    return-void
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

.method public release()V
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LZ1/s;

    .line 4
    .line 5
    iget-object v1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/media/MediaCodec;

    .line 8
    .line 9
    const/16 v2, 0x23

    .line 10
    .line 11
    :try_start_0
    sget v3, Ld0/w;->a:I

    .line 12
    .line 13
    const/16 v4, 0x1e

    .line 14
    .line 15
    if-lt v3, v4, :cond_0

    .line 16
    .line 17
    const/16 v4, 0x21

    .line 18
    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    if-lt v3, v2, :cond_1

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, LZ1/s;->P(Landroid/media/MediaCodec;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    sget v4, Ld0/w;->a:I

    .line 39
    .line 40
    if-lt v4, v2, :cond_2

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LZ1/s;->P(Landroid/media/MediaCodec;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 48
    .line 49
    .line 50
    throw v3
    .line 51
.end method

.method public s(LD0/f;Landroid/os/Handler;)V
    .locals 2

    .line 1
    new-instance v0, Lq0/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lq0/a;-><init>(Lq0/l;LD0/f;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/media/MediaCodec;

    .line 10
    .line 11
    invoke-virtual {p1, v0, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 12
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

.method public t()V
    .locals 3

    .line 1
    sget-object v0, Ld0/w;->f:[B

    .line 2
    .line 3
    iget-object v1, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ld0/p;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v2, v0

    .line 11
    invoke-virtual {v1, v2, v0}, Ld0/p;->F(I[B)V

    .line 12
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

.method public u(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LZ1/c;

    .line 4
    .line 5
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LZ1/i;

    .line 8
    .line 9
    iget-object v0, v0, LZ1/i;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ln3/m;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ln3/m;->b(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lf3/g;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lf3/g;->a(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public w()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/l;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public x([BIILc1/k;Ld0/d;)V
    .locals 19

    move-object/from16 v1, p0

    move/from16 v0, p2

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    add-int v6, v0, p3

    .line 1
    iget-object v7, v1, LZ1/l;->l:Ljava/lang/Object;

    check-cast v7, Ld0/p;

    move-object/from16 v8, p1

    invoke-virtual {v7, v6, v8}, Ld0/p;->F(I[B)V

    .line 2
    invoke-virtual {v7, v0}, Ld0/p;->H(I)V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    :try_start_0
    invoke-static {v7}, Lk1/i;->d(Ld0/p;)V
    :try_end_0
    .catch La0/H; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :goto_0
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v6}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_1
    move v9, v3

    move v8, v4

    :goto_2
    if-ne v8, v4, :cond_5

    .line 8
    iget v9, v7, Ld0/p;->b:I

    .line 9
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v8}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_2

    move v8, v3

    goto :goto_2

    .line 10
    :cond_2
    const-string v11, "STYLE"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    move v8, v2

    goto :goto_2

    .line 11
    :cond_3
    const-string v11, "NOTE"

    invoke-virtual {v8, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    const/4 v8, 0x3

    goto :goto_2

    .line 12
    :cond_5
    invoke-virtual {v7, v9}, Ld0/p;->H(I)V

    if-eqz v8, :cond_3d

    if-ne v8, v5, :cond_6

    .line 13
    :goto_3
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v8}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    .line 14
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    if-ne v8, v2, :cond_38

    .line 15
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_37

    .line 16
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v8}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 17
    iget-object v8, v1, LZ1/l;->m:Ljava/lang/Object;

    check-cast v8, Lk1/a;

    iget-object v11, v8, Lk1/a;->b:Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 19
    iget v12, v7, Ld0/p;->b:I

    .line 20
    :goto_4
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v13}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v13

    .line 21
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_36

    .line 22
    iget-object v13, v7, Ld0/p;->a:[B

    .line 23
    iget v14, v7, Ld0/p;->b:I

    .line 24
    iget-object v8, v8, Lk1/a;->a:Ld0/p;

    invoke-virtual {v8, v14, v13}, Ld0/p;->F(I[B)V

    .line 25
    invoke-virtual {v8, v12}, Ld0/p;->H(I)V

    .line 26
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :goto_5
    invoke-static {v8}, Lk1/a;->c(Ld0/p;)V

    .line 28
    invoke-virtual {v8}, Ld0/p;->a()I

    move-result v13

    const-string v14, "{"

    const-string v15, ""

    const/4 v10, 0x5

    if-ge v13, v10, :cond_7

    :goto_6
    move-object v2, v9

    goto/16 :goto_a

    .line 29
    :cond_7
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v10, v13}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v10

    .line 30
    const-string v13, "::cue"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    goto :goto_6

    .line 31
    :cond_8
    iget v10, v8, Ld0/p;->b:I

    .line 32
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_9

    goto :goto_6

    .line 33
    :cond_9
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    .line 34
    invoke-virtual {v8, v10}, Ld0/p;->H(I)V

    move-object v2, v15

    goto :goto_a

    .line 35
    :cond_a
    const-string v10, "("

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 36
    iget v10, v8, Ld0/p;->b:I

    .line 37
    iget v13, v8, Ld0/p;->c:I

    move/from16 v16, v3

    :goto_7
    if-ge v10, v13, :cond_c

    if-nez v16, :cond_c

    .line 38
    iget-object v2, v8, Ld0/p;->a:[B

    add-int/lit8 v17, v10, 0x1

    .line 39
    aget-byte v2, v2, v10

    int-to-char v2, v2

    const/16 v10, 0x29

    if-ne v2, v10, :cond_b

    move v2, v5

    goto :goto_8

    :cond_b
    move v2, v3

    :goto_8
    move/from16 v16, v2

    move/from16 v10, v17

    const/4 v2, 0x2

    goto :goto_7

    :cond_c
    add-int/2addr v10, v4

    .line 40
    iget v2, v8, Ld0/p;->b:I

    sub-int/2addr v10, v2

    .line 41
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v10, v2}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_d
    move-object v2, v9

    .line 43
    :goto_9
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    .line 44
    const-string v13, ")"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_6

    :cond_e
    :goto_a
    if-eqz v2, :cond_f

    .line 45
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    move v1, v5

    const/4 v3, 0x2

    goto/16 :goto_1f

    .line 46
    :cond_10
    new-instance v10, Lk1/b;

    .line 47
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object v15, v10, Lk1/b;->a:Ljava/lang/String;

    .line 49
    iput-object v15, v10, Lk1/b;->b:Ljava/lang/String;

    .line 50
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v13

    iput-object v13, v10, Lk1/b;->c:Ljava/util/Set;

    .line 51
    iput-object v15, v10, Lk1/b;->d:Ljava/lang/String;

    .line 52
    iput-object v9, v10, Lk1/b;->e:Ljava/lang/String;

    .line 53
    iput-boolean v3, v10, Lk1/b;->g:Z

    .line 54
    iput-boolean v3, v10, Lk1/b;->i:Z

    .line 55
    iput v4, v10, Lk1/b;->j:I

    .line 56
    iput v4, v10, Lk1/b;->k:I

    .line 57
    iput v4, v10, Lk1/b;->l:I

    .line 58
    iput v4, v10, Lk1/b;->m:I

    .line 59
    iput v4, v10, Lk1/b;->n:I

    .line 60
    iput v4, v10, Lk1/b;->p:I

    .line 61
    iput-boolean v3, v10, Lk1/b;->q:Z

    .line 62
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    goto :goto_d

    :cond_11
    const/16 v13, 0x5b

    .line 63
    invoke-virtual {v2, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-eq v13, v4, :cond_13

    .line 64
    sget-object v14, Lk1/a;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 65
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    if-eqz v14, :cond_12

    .line 66
    invoke-virtual {v9, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    .line 67
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    iput-object v9, v10, Lk1/b;->d:Ljava/lang/String;

    .line 69
    :cond_12
    invoke-virtual {v2, v3, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 70
    :cond_13
    sget v9, Ld0/w;->a:I

    .line 71
    const-string v9, "\\."

    invoke-virtual {v2, v9, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 72
    aget-object v9, v2, v3

    const/16 v13, 0x23

    .line 73
    invoke-virtual {v9, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-eq v13, v4, :cond_14

    .line 74
    invoke-virtual {v9, v3, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 75
    iput-object v14, v10, Lk1/b;->b:Ljava/lang/String;

    add-int/2addr v13, v5

    .line 76
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 77
    iput-object v9, v10, Lk1/b;->a:Ljava/lang/String;

    goto :goto_b

    .line 78
    :cond_14
    iput-object v9, v10, Lk1/b;->b:Ljava/lang/String;

    .line 79
    :goto_b
    array-length v9, v2

    if-le v9, v5, :cond_16

    .line 80
    array-length v9, v2

    .line 81
    array-length v13, v2

    if-gt v9, v13, :cond_15

    move v13, v5

    goto :goto_c

    :cond_15
    move v13, v3

    :goto_c
    invoke-static {v13}, Ld0/m;->c(Z)V

    .line 82
    invoke-static {v2, v5, v9}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v2

    .line 83
    check-cast v2, [Ljava/lang/String;

    .line 84
    new-instance v9, Ljava/util/HashSet;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v9, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v9, v10, Lk1/b;->c:Ljava/util/Set;

    :cond_16
    :goto_d
    move v2, v3

    const/4 v9, 0x0

    .line 85
    :goto_e
    const-string v13, "}"

    if-nez v2, :cond_33

    .line 86
    iget v2, v8, Ld0/p;->b:I

    .line 87
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_18

    .line 88
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_17

    goto :goto_f

    :cond_17
    move v14, v3

    goto :goto_10

    :cond_18
    :goto_f
    move v14, v5

    :goto_10
    if-nez v14, :cond_32

    .line 89
    invoke-virtual {v8, v2}, Ld0/p;->H(I)V

    .line 90
    invoke-static {v8}, Lk1/a;->c(Ld0/p;)V

    .line 91
    invoke-static {v8, v11}, Lk1/a;->a(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    .line 92
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    goto/16 :goto_1c

    .line 93
    :cond_19
    const-string v3, ":"

    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    goto/16 :goto_1c

    .line 94
    :cond_1a
    invoke-static {v8}, Lk1/a;->c(Ld0/p;)V

    .line 95
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    .line 96
    :goto_11
    const-string v5, ";"

    if-nez v4, :cond_1e

    .line 97
    iget v1, v8, Ld0/p;->b:I

    move/from16 p3, v4

    .line 98
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1b

    const/4 v1, 0x0

    goto :goto_13

    .line 99
    :cond_1b
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_1d

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    goto :goto_12

    .line 100
    :cond_1c
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p0

    move/from16 v4, p3

    goto :goto_11

    .line 101
    :cond_1d
    :goto_12
    invoke-virtual {v8, v1}, Ld0/p;->H(I)V

    const/4 v4, 0x1

    move-object/from16 v1, p0

    goto :goto_11

    .line 102
    :cond_1e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_13
    if-eqz v1, :cond_2d

    .line 103
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1f

    goto/16 :goto_18

    .line 104
    :cond_1f
    iget v3, v8, Ld0/p;->b:I

    .line 105
    invoke-static {v8, v11}, Lk1/a;->b(Ld0/p;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    .line 106
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_14

    .line 107
    :cond_20
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    .line 108
    invoke-virtual {v8, v3}, Ld0/p;->H(I)V

    .line 109
    :goto_14
    const-string v3, "color"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_22

    const/4 v3, 0x1

    .line 110
    invoke-static {v1, v3}, Ld0/c;->a(Ljava/lang/String;Z)I

    move-result v1

    .line 111
    iput v1, v10, Lk1/b;->f:I

    .line 112
    iput-boolean v3, v10, Lk1/b;->g:Z

    :cond_21
    :goto_15
    move v1, v3

    goto/16 :goto_1d

    :cond_22
    const/4 v3, 0x1

    .line 113
    const-string v4, "background-color"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    .line 114
    invoke-static {v1, v3}, Ld0/c;->a(Ljava/lang/String;Z)I

    move-result v1

    .line 115
    iput v1, v10, Lk1/b;->h:I

    .line 116
    iput-boolean v3, v10, Lk1/b;->i:Z

    goto :goto_15

    .line 117
    :cond_23
    const-string v4, "ruby-position"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    .line 118
    const-string v2, "over"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    .line 119
    iput v3, v10, Lk1/b;->p:I

    goto/16 :goto_18

    .line 120
    :cond_24
    const-string v2, "under"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    const/4 v1, 0x2

    .line 121
    iput v1, v10, Lk1/b;->p:I

    goto/16 :goto_18

    .line 122
    :cond_25
    const-string v3, "text-combine-upright"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 123
    const-string v2, "all"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    const-string v2, "digits"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_16

    :cond_26
    const/4 v1, 0x0

    goto :goto_17

    :cond_27
    :goto_16
    const/4 v1, 0x1

    .line 124
    :goto_17
    iput-boolean v1, v10, Lk1/b;->q:Z

    goto/16 :goto_18

    .line 125
    :cond_28
    const-string v3, "text-decoration"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    .line 126
    const-string v2, "underline"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    const/4 v1, 0x1

    .line 127
    iput v1, v10, Lk1/b;->k:I

    goto :goto_18

    .line 128
    :cond_29
    const-string v3, "font-family"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 129
    invoke-static {v1}, La/a;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 130
    iput-object v1, v10, Lk1/b;->e:Ljava/lang/String;

    goto :goto_18

    .line 131
    :cond_2a
    const-string v3, "font-weight"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 132
    const-string v2, "bold"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    const/4 v3, 0x1

    .line 133
    iput v3, v10, Lk1/b;->l:I

    goto/16 :goto_15

    :cond_2b
    const/4 v3, 0x1

    .line 134
    const-string v4, "font-style"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    .line 135
    const-string v2, "italic"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 136
    iput v3, v10, Lk1/b;->m:I

    goto :goto_18

    .line 137
    :cond_2c
    const-string v3, "font-size"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 138
    invoke-static {v1}, La/a;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lk1/a;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_2e

    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid font-size: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WebvttCssParser"

    invoke-static {v2, v1}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2d
    :goto_18
    const/4 v1, 0x1

    goto :goto_1d

    :cond_2e
    const/4 v1, 0x2

    .line 141
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :goto_19
    const/4 v3, -0x1

    goto :goto_1a

    :sswitch_0
    const-string v1, "px"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto :goto_19

    :cond_2f
    const/4 v3, 0x2

    goto :goto_1a

    :sswitch_1
    const-string v1, "em"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_19

    :cond_30
    const/4 v3, 0x1

    goto :goto_1a

    :sswitch_2
    const-string v1, "%"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto :goto_19

    :cond_31
    const/4 v3, 0x0

    :goto_1a
    packed-switch v3, :pswitch_data_0

    .line 144
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_0
    const/4 v1, 0x1

    .line 145
    iput v1, v10, Lk1/b;->n:I

    const/4 v3, 0x2

    goto :goto_1b

    :pswitch_1
    const/4 v1, 0x1

    const/4 v3, 0x2

    .line 146
    iput v3, v10, Lk1/b;->n:I

    goto :goto_1b

    :pswitch_2
    const/4 v1, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x3

    .line 147
    iput v4, v10, Lk1/b;->n:I

    .line 148
    :goto_1b
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 151
    iput v2, v10, Lk1/b;->o:F

    goto :goto_1e

    :cond_32
    :goto_1c
    move v1, v5

    :goto_1d
    const/4 v3, 0x2

    :goto_1e
    move v5, v1

    move v2, v14

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v1, p0

    goto/16 :goto_e

    :cond_33
    move v1, v5

    const/4 v3, 0x2

    .line 152
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 153
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_34
    move v5, v1

    move v2, v3

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v9, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_5

    .line 154
    :goto_1f
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_35
    :goto_20
    move v5, v1

    move v2, v3

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_36
    move-object/from16 v1, p0

    goto/16 :goto_4

    .line 155
    :cond_37
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A style block was found after the first cue."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    move v3, v2

    move v1, v5

    const/4 v2, 0x3

    if-ne v8, v2, :cond_35

    .line 156
    sget-object v2, Lk1/h;->a:Ljava/util/regex/Pattern;

    .line 157
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_39

    const/4 v9, 0x0

    goto :goto_21

    .line 158
    :cond_39
    sget-object v5, Lk1/h;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    .line 159
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    move-result v9

    if-eqz v9, :cond_3a

    const/4 v9, 0x0

    .line 160
    invoke-static {v9, v8, v7, v0}, Lk1/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Ld0/p;Ljava/util/ArrayList;)Lk1/c;

    move-result-object v9

    goto :goto_21

    :cond_3a
    const/4 v9, 0x0

    .line 161
    invoke-virtual {v7, v2}, Ld0/p;->j(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3b

    goto :goto_21

    .line 162
    :cond_3b
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_3c

    .line 164
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2, v7, v0}, Lk1/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Ld0/p;Ljava/util/ArrayList;)Lk1/c;

    move-result-object v9

    :cond_3c
    :goto_21
    if-eqz v9, :cond_35

    .line 165
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 166
    :cond_3d
    new-instance v0, LZ1/m;

    invoke-direct {v0, v6}, LZ1/m;-><init>(Ljava/util/ArrayList;)V

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    .line 167
    invoke-static {v0, v1, v2}, LD1/b;->S(Lc1/d;Lc1/k;Ld0/d;)V

    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 168
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
