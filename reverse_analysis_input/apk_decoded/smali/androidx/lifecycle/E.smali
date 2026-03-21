.class public Landroidx/lifecycle/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/d;
.implements Ln3/f;
.implements Lm/f0;
.implements Lk0/h;
.implements Ll/n;
.implements Lm/y;
.implements Ln3/b;
.implements Ln3/o;


# instance fields
.field public final synthetic l:I

.field public m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Landroidx/lifecycle/E;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lf3/b;)V
    .locals 5

    const/16 v0, 0x1a

    iput v0, p0, Landroidx/lifecycle/E;->l:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Landroidx/lifecycle/E;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 5
    new-instance v1, Ln3/q;

    sget-object v2, Ln3/x;->a:Ln3/x;

    const/4 v3, 0x0

    .line 6
    const-string v4, "flutter/mousecursor"

    invoke-direct {v1, p1, v4, v2, v3}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V

    .line 7
    invoke-virtual {v1, v0}, Ln3/q;->b(Ln3/o;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Landroidx/lifecycle/E;->l:I

    iput-object p1, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm/m;)V
    .locals 7

    const/16 v0, 0x11

    iput v0, p0, Landroidx/lifecycle/E;->l:I

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v1, LB0/d;

    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v2, LZ1/c;

    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, v2, LZ1/c;->l:Ljava/lang/Object;

    .line 14
    new-instance v3, LS/i;

    invoke-direct {v3, p1}, LS/i;-><init>(Lm/m;)V

    iput-object v3, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 15
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 16
    sget-object v3, LS/a;->b:LS/a;

    if-nez v3, :cond_1

    .line 17
    sget-object v3, LS/a;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 18
    :try_start_0
    sget-object v4, LS/a;->b:LS/a;

    if-nez v4, :cond_0

    .line 19
    new-instance v4, LS/a;

    .line 20
    invoke-direct {v4}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    const-string v5, "android.text.DynamicLayout$ChangeWatcher"

    .line 22
    const-class v6, LS/a;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-static {v5, v0, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LS/a;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :catchall_0
    :try_start_2
    sput-object v4, LS/a;->b:LS/a;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v3

    goto :goto_2

    :goto_1
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 25
    :cond_1
    :goto_2
    sget-object v0, LS/a;->b:LS/a;

    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 27
    iput-object v2, v1, LB0/d;->l:Ljava/lang/Object;

    .line 28
    iput-object v1, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln3/f;)V
    .locals 5

    const/16 v0, 0x17

    iput v0, p0, Landroidx/lifecycle/E;->l:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, LZ1/c;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 32
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 33
    new-instance v1, Ln3/q;

    sget-object v2, Ln3/x;->a:Ln3/x;

    const/4 v3, 0x0

    .line 34
    const-string v4, "flutter/keyboard"

    invoke-direct {v1, p1, v4, v2, v3}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V

    .line 35
    invoke-virtual {v1, v0}, Ln3/q;->b(Ln3/o;)V

    return-void
.end method

.method public static F(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x23

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x2a

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 21
    :goto_1
    return p0
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

.method private final H(Ln3/n;Ln3/p;)V
    .locals 12

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    const-string v1, "No such clipboard content format: "

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LZ1/l;

    .line 8
    .line 9
    iget-object v3, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lio/flutter/plugin/platform/m;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v3, p1, Ln3/n;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x3

    .line 24
    const/4 v7, 0x4

    .line 25
    const/4 v8, 0x2

    .line 26
    const/4 v9, 0x1

    .line 27
    const/4 v10, 0x0

    .line 28
    sparse-switch v5, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_0
    const-string v5, "SystemChrome.setPreferredOrientations"

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    move v3, v8

    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto/16 :goto_c

    .line 46
    .line 47
    :sswitch_1
    const-string v5, "SystemChrome.setEnabledSystemUIOverlays"

    .line 48
    .line 49
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move v3, v7

    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :sswitch_2
    const-string v5, "Clipboard.getData"

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    const/16 v3, 0xb

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :sswitch_3
    const-string v5, "SystemChrome.setSystemUIOverlayStyle"

    .line 71
    .line 72
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    const/16 v3, 0x8

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :sswitch_4
    const-string v5, "SystemChrome.setEnabledSystemUIMode"

    .line 83
    .line 84
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    const/4 v3, 0x5

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :sswitch_5
    const-string v5, "Clipboard.hasStrings"

    .line 94
    .line 95
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    const/16 v3, 0xd

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_6
    const-string v5, "SystemChrome.restoreSystemUIOverlays"

    .line 106
    .line 107
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    const/4 v3, 0x7

    .line 114
    goto :goto_1

    .line 115
    :sswitch_7
    const-string v5, "SystemSound.play"

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_1

    .line 122
    .line 123
    move v3, v10

    .line 124
    goto :goto_1

    .line 125
    :sswitch_8
    const-string v5, "HapticFeedback.vibrate"

    .line 126
    .line 127
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_1

    .line 132
    .line 133
    move v3, v9

    .line 134
    goto :goto_1

    .line 135
    :sswitch_9
    const-string v5, "SystemChrome.setApplicationSwitcherDescription"

    .line 136
    .line 137
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    move v3, v6

    .line 144
    goto :goto_1

    .line 145
    :sswitch_a
    const-string v5, "SystemChrome.setSystemUIChangeListener"

    .line 146
    .line 147
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_1

    .line 152
    .line 153
    const/4 v3, 0x6

    .line 154
    goto :goto_1

    .line 155
    :sswitch_b
    const-string v5, "Clipboard.setData"

    .line 156
    .line 157
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_1

    .line 162
    .line 163
    const/16 v3, 0xc

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :sswitch_c
    const-string v5, "SystemNavigator.pop"

    .line 167
    .line 168
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_1

    .line 173
    .line 174
    const/16 v3, 0xa

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :sswitch_d
    const-string v5, "Share.invoke"

    .line 178
    .line 179
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_1

    .line 184
    .line 185
    const/16 v3, 0xe

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :sswitch_e
    const-string v5, "SystemNavigator.setFrameworkHandlesBack"

    .line 189
    .line 190
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    if-eqz v3, :cond_1

    .line 195
    .line 196
    const/16 v3, 0x9

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    :goto_0
    const/4 v3, -0x1

    .line 200
    :goto_1
    const-string v5, "text"

    .line 201
    .line 202
    const-string v11, "clipboard"

    .line 203
    .line 204
    iget-object p1, p1, Ln3/n;->b:Ljava/lang/Object;

    .line 205
    .line 206
    packed-switch v3, :pswitch_data_0

    .line 207
    .line 208
    .line 209
    :try_start_1
    move-object p1, p2

    .line 210
    check-cast p1, LP2/c;

    .line 211
    .line 212
    invoke-virtual {p1}, LP2/c;->notImplemented()V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_d

    .line 216
    .line 217
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 218
    .line 219
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 222
    .line 223
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    new-instance v2, Landroid/content/Intent;

    .line 231
    .line 232
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v3, "android.intent.action.SEND"

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    .line 239
    .line 240
    const-string v3, "text/plain"

    .line 241
    .line 242
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 243
    .line 244
    .line 245
    const-string v3, "android.intent.extra.TEXT"

    .line 246
    .line 247
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    .line 249
    .line 250
    invoke-static {v2, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 255
    .line 256
    invoke-virtual {v1, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 257
    .line 258
    .line 259
    move-object p1, p2

    .line 260
    check-cast p1, LP2/c;

    .line 261
    .line 262
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_d

    .line 266
    .line 267
    :pswitch_1
    iget-object p1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p1, Lio/flutter/plugin/platform/m;

    .line 270
    .line 271
    iget-object p1, p1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 274
    .line 275
    iget-object p1, p1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 276
    .line 277
    invoke-virtual {p1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    check-cast p1, Landroid/content/ClipboardManager;

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_2

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_2
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    if-nez p1, :cond_3

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_3
    const-string v1, "text/*"

    .line 298
    .line 299
    invoke-virtual {p1, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    :goto_2
    new-instance p1, Lorg/json/JSONObject;

    .line 304
    .line 305
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 306
    .line 307
    .line 308
    const-string v1, "value"

    .line 309
    .line 310
    invoke-virtual {p1, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    move-object v1, p2

    .line 314
    check-cast v1, LP2/c;

    .line 315
    .line 316
    invoke-virtual {v1, p1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_d

    .line 320
    .line 321
    :pswitch_2
    check-cast p1, Lorg/json/JSONObject;

    .line 322
    .line 323
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 330
    .line 331
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 334
    .line 335
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 336
    .line 337
    invoke-virtual {v1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, Landroid/content/ClipboardManager;

    .line 342
    .line 343
    const-string v2, "text label?"

    .line 344
    .line 345
    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 350
    .line 351
    .line 352
    move-object p1, p2

    .line 353
    check-cast p1, LP2/c;

    .line 354
    .line 355
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_d

    .line 359
    .line 360
    :pswitch_3
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 361
    .line 362
    if-eqz p1, :cond_4

    .line 363
    .line 364
    :try_start_2
    invoke-static {p1}, Lm3/d;->a(Ljava/lang/String;)Lm3/d;

    .line 365
    .line 366
    .line 367
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 368
    goto :goto_3

    .line 369
    :catch_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    move-object v1, p2

    .line 374
    check-cast v1, LP2/c;

    .line 375
    .line 376
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_4
    move-object p1, v4

    .line 380
    :goto_3
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 383
    .line 384
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/m;->f(Lm3/d;)Ljava/lang/CharSequence;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    if-eqz p1, :cond_5

    .line 389
    .line 390
    new-instance v1, Lorg/json/JSONObject;

    .line 391
    .line 392
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 396
    .line 397
    .line 398
    move-object p1, p2

    .line 399
    check-cast p1, LP2/c;

    .line 400
    .line 401
    invoke-virtual {p1, v1}, LP2/c;->success(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_d

    .line 405
    .line 406
    :cond_5
    move-object p1, p2

    .line 407
    check-cast p1, LP2/c;

    .line 408
    .line 409
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_d

    .line 413
    .line 414
    :pswitch_4
    iget-object p1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast p1, Lio/flutter/plugin/platform/m;

    .line 417
    .line 418
    iget-object p1, p1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 421
    .line 422
    iget-object v1, p1, Lio/flutter/plugin/platform/f;->c:Ljava/lang/Object;

    .line 423
    .line 424
    invoke-interface {v1}, Lio/flutter/embedding/android/j;->popSystemNavigator()Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_6

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_6
    iget-object p1, p1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 432
    .line 433
    instance-of v1, p1, Landroidx/activity/y;

    .line 434
    .line 435
    if-eqz v1, :cond_7

    .line 436
    .line 437
    check-cast p1, Landroidx/activity/y;

    .line 438
    .line 439
    invoke-interface {p1}, Landroidx/activity/y;->getOnBackPressedDispatcher()Landroidx/activity/x;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    invoke-virtual {p1}, Landroidx/activity/x;->b()V

    .line 444
    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_7
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 448
    .line 449
    .line 450
    :goto_4
    move-object p1, p2

    .line 451
    check-cast p1, LP2/c;

    .line 452
    .line 453
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_d

    .line 457
    .line 458
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 467
    .line 468
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 471
    .line 472
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->c:Ljava/lang/Object;

    .line 473
    .line 474
    invoke-interface {v1, p1}, Lio/flutter/embedding/android/j;->setFrameworkHandlesBack(Z)V

    .line 475
    .line 476
    .line 477
    move-object p1, p2

    .line 478
    check-cast p1, LP2/c;

    .line 479
    .line 480
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 481
    .line 482
    .line 483
    goto/16 :goto_d

    .line 484
    .line 485
    :pswitch_6
    :try_start_4
    check-cast p1, Lorg/json/JSONObject;

    .line 486
    .line 487
    invoke-static {v2, p1}, LZ1/l;->B(LZ1/l;Lorg/json/JSONObject;)LT2/i;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 494
    .line 495
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 498
    .line 499
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/f;->a(LT2/i;)V

    .line 500
    .line 501
    .line 502
    move-object p1, p2

    .line 503
    check-cast p1, LP2/c;

    .line 504
    .line 505
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    .line 506
    .line 507
    .line 508
    goto/16 :goto_d

    .line 509
    .line 510
    :catch_2
    move-exception p1

    .line 511
    goto :goto_5

    .line 512
    :catch_3
    move-exception p1

    .line 513
    :goto_5
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    move-object v1, p2

    .line 518
    check-cast v1, LP2/c;

    .line 519
    .line 520
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_d

    .line 524
    .line 525
    :pswitch_7
    iget-object p1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast p1, Lio/flutter/plugin/platform/m;

    .line 528
    .line 529
    iget-object p1, p1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 532
    .line 533
    invoke-virtual {p1}, Lio/flutter/plugin/platform/f;->b()V

    .line 534
    .line 535
    .line 536
    move-object p1, p2

    .line 537
    check-cast p1, LP2/c;

    .line 538
    .line 539
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_d

    .line 543
    .line 544
    :pswitch_8
    iget-object p1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast p1, Lio/flutter/plugin/platform/m;

    .line 547
    .line 548
    iget-object p1, p1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p1, Lio/flutter/plugin/platform/f;

    .line 551
    .line 552
    iget-object v1, p1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 553
    .line 554
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    new-instance v2, Lio/flutter/plugin/platform/e;

    .line 563
    .line 564
    invoke-direct {v2, p1, v1}, Lio/flutter/plugin/platform/e;-><init>(Lio/flutter/plugin/platform/f;Landroid/view/View;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 568
    .line 569
    .line 570
    move-object p1, p2

    .line 571
    check-cast p1, LP2/c;

    .line 572
    .line 573
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 574
    .line 575
    .line 576
    goto/16 :goto_d

    .line 577
    .line 578
    :pswitch_9
    :try_start_6
    check-cast p1, Ljava/lang/String;

    .line 579
    .line 580
    invoke-static {v2, p1}, LZ1/l;->A(LZ1/l;Ljava/lang/String;)I

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 587
    .line 588
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    if-ne p1, v9, :cond_8

    .line 596
    .line 597
    const/16 p1, 0x706

    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_8
    if-ne p1, v8, :cond_9

    .line 601
    .line 602
    const/16 p1, 0xf06

    .line 603
    .line 604
    goto :goto_6

    .line 605
    :cond_9
    if-ne p1, v6, :cond_a

    .line 606
    .line 607
    const/16 p1, 0x1706

    .line 608
    .line 609
    goto :goto_6

    .line 610
    :cond_a
    if-ne p1, v7, :cond_b

    .line 611
    .line 612
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 613
    .line 614
    const/16 v2, 0x1d

    .line 615
    .line 616
    if-lt p1, v2, :cond_b

    .line 617
    .line 618
    const/16 p1, 0x700

    .line 619
    .line 620
    :goto_6
    iput p1, v1, Lio/flutter/plugin/platform/f;->e:I

    .line 621
    .line 622
    invoke-virtual {v1}, Lio/flutter/plugin/platform/f;->b()V

    .line 623
    .line 624
    .line 625
    :cond_b
    move-object p1, p2

    .line 626
    check-cast p1, LP2/c;

    .line 627
    .line 628
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_4

    .line 629
    .line 630
    .line 631
    goto/16 :goto_d

    .line 632
    .line 633
    :catch_4
    move-exception p1

    .line 634
    goto :goto_7

    .line 635
    :catch_5
    move-exception p1

    .line 636
    :goto_7
    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object p1

    .line 640
    move-object v1, p2

    .line 641
    check-cast v1, LP2/c;

    .line 642
    .line 643
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 644
    .line 645
    .line 646
    goto/16 :goto_d

    .line 647
    .line 648
    :pswitch_a
    :try_start_8
    check-cast p1, Lorg/json/JSONArray;

    .line 649
    .line 650
    invoke-static {v2, p1}, LZ1/l;->z(LZ1/l;Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 657
    .line 658
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/m;->l(Ljava/util/ArrayList;)V

    .line 659
    .line 660
    .line 661
    move-object p1, p2

    .line 662
    check-cast p1, LP2/c;

    .line 663
    .line 664
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_6

    .line 665
    .line 666
    .line 667
    goto/16 :goto_d

    .line 668
    .line 669
    :catch_6
    move-exception p1

    .line 670
    goto :goto_8

    .line 671
    :catch_7
    move-exception p1

    .line 672
    :goto_8
    :try_start_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    move-object v1, p2

    .line 677
    check-cast v1, LP2/c;

    .line 678
    .line 679
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 680
    .line 681
    .line 682
    goto/16 :goto_d

    .line 683
    .line 684
    :pswitch_b
    :try_start_a
    check-cast p1, Lorg/json/JSONObject;

    .line 685
    .line 686
    const-string v1, "primaryColor"

    .line 687
    .line 688
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    if-eqz v1, :cond_c

    .line 693
    .line 694
    const/high16 v3, -0x1000000

    .line 695
    .line 696
    or-int/2addr v1, v3

    .line 697
    :cond_c
    const-string v3, "label"

    .line 698
    .line 699
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    iget-object v2, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 706
    .line 707
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 708
    .line 709
    iget-object v2, v2, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v2, Lio/flutter/plugin/platform/f;

    .line 712
    .line 713
    iget-object v2, v2, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 714
    .line 715
    const/16 v5, 0x1c

    .line 716
    .line 717
    if-ge v3, v5, :cond_d

    .line 718
    .line 719
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 720
    .line 721
    invoke-direct {v3, p1, v4, v1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v3}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 725
    .line 726
    .line 727
    goto :goto_9

    .line 728
    :cond_d
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 729
    .line 730
    invoke-static {p1, v1}, Landroidx/media/C;->b(Ljava/lang/String;I)Landroid/app/ActivityManager$TaskDescription;

    .line 731
    .line 732
    .line 733
    move-result-object p1

    .line 734
    invoke-virtual {v2, p1}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 735
    .line 736
    .line 737
    :goto_9
    move-object p1, p2

    .line 738
    check-cast p1, LP2/c;

    .line 739
    .line 740
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_8

    .line 741
    .line 742
    .line 743
    goto/16 :goto_d

    .line 744
    .line 745
    :catch_8
    move-exception p1

    .line 746
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object p1

    .line 750
    move-object v1, p2

    .line 751
    check-cast v1, LP2/c;

    .line 752
    .line 753
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 754
    .line 755
    .line 756
    goto/16 :goto_d

    .line 757
    .line 758
    :pswitch_c
    :try_start_c
    check-cast p1, Lorg/json/JSONArray;

    .line 759
    .line 760
    invoke-static {v2, p1}, LZ1/l;->y(LZ1/l;Lorg/json/JSONArray;)I

    .line 761
    .line 762
    .line 763
    move-result p1

    .line 764
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 767
    .line 768
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 771
    .line 772
    iget-object v1, v1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 773
    .line 774
    invoke-virtual {v1, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 775
    .line 776
    .line 777
    move-object p1, p2

    .line 778
    check-cast p1, LP2/c;

    .line 779
    .line 780
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_9

    .line 781
    .line 782
    .line 783
    goto/16 :goto_d

    .line 784
    .line 785
    :catch_9
    move-exception p1

    .line 786
    goto :goto_a

    .line 787
    :catch_a
    move-exception p1

    .line 788
    :goto_a
    :try_start_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    move-object v1, p2

    .line 793
    check-cast v1, LP2/c;

    .line 794
    .line 795
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    .line 796
    .line 797
    .line 798
    goto :goto_d

    .line 799
    :pswitch_d
    :try_start_e
    check-cast p1, Ljava/lang/String;

    .line 800
    .line 801
    invoke-static {p1}, Lm/B0;->c(Ljava/lang/String;)I

    .line 802
    .line 803
    .line 804
    move-result p1

    .line 805
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 808
    .line 809
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/m;->m(I)V

    .line 810
    .line 811
    .line 812
    move-object p1, p2

    .line 813
    check-cast p1, LP2/c;

    .line 814
    .line 815
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_b
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    .line 816
    .line 817
    .line 818
    goto :goto_d

    .line 819
    :catch_b
    move-exception p1

    .line 820
    :try_start_f
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object p1

    .line 824
    move-object v1, p2

    .line 825
    check-cast v1, LP2/c;

    .line 826
    .line 827
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    .line 828
    .line 829
    .line 830
    goto :goto_d

    .line 831
    :pswitch_e
    :try_start_10
    check-cast p1, Ljava/lang/String;

    .line 832
    .line 833
    invoke-static {p1}, Lm/B0;->d(Ljava/lang/String;)I

    .line 834
    .line 835
    .line 836
    move-result p1

    .line 837
    iget-object v1, v2, LZ1/l;->m:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v1, Lio/flutter/plugin/platform/m;

    .line 840
    .line 841
    iget-object v1, v1, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 844
    .line 845
    if-ne p1, v9, :cond_e

    .line 846
    .line 847
    iget-object p1, v1, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 848
    .line 849
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    invoke-virtual {p1, v10}, Landroid/view/View;->playSoundEffect(I)V

    .line 858
    .line 859
    .line 860
    goto :goto_b

    .line 861
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    :goto_b
    move-object p1, p2

    .line 865
    check-cast p1, LP2/c;

    .line 866
    .line 867
    invoke-virtual {p1, v4}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    .line 868
    .line 869
    .line 870
    goto :goto_d

    .line 871
    :catch_c
    move-exception p1

    .line 872
    :try_start_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object p1

    .line 876
    move-object v1, p2

    .line 877
    check-cast v1, LP2/c;

    .line 878
    .line 879
    invoke-virtual {v1, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    .line 880
    .line 881
    .line 882
    goto :goto_d

    .line 883
    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    const-string v2, "JSON error: "

    .line 886
    .line 887
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object p1

    .line 901
    check-cast p2, LP2/c;

    .line 902
    .line 903
    invoke-virtual {p2, v0, p1, v4}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    :goto_d
    return-void

    .line 907
    :sswitch_data_0
    .sparse-switch
        -0x59804db0 -> :sswitch_e
        -0x3789da79 -> :sswitch_d
        -0x2dad73d5 -> :sswitch_c
        -0x2af4a94c -> :sswitch_b
        -0x2267c49c -> :sswitch_a
        -0x20b0f718 -> :sswitch_9
        -0xebc6f23 -> :sswitch_8
        -0xcd4cf9e -> :sswitch_7
        0xe6a45af -> :sswitch_6
        0x3436a200 -> :sswitch_5
        0x4341194a -> :sswitch_4
        0x52e10221 -> :sswitch_3
        0x5a408fa8 -> :sswitch_2
        0x63cbfa4a -> :sswitch_1
        0x7e576127 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method


# virtual methods
.method public A(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LB0/d;

    .line 8
    .line 9
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LZ1/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v0, p1, LS/e;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    new-instance v0, LS/e;

    .line 31
    .line 32
    invoke-direct {v0, p1}, LS/e;-><init>(Landroid/text/method/KeyListener;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v0

    .line 36
    :cond_3
    :goto_0
    return-object p1
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

.method public B(JJ)J
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide p1
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

.method public C(J)Ll0/j;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ll0/j;

    .line 4
    .line 5
    return-object p1
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

.method public D()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, La0/e;->a:Ljava/util/UUID;

    .line 2
    .line 3
    return-object v0
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

.method public E()I
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

.method public G(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lj0/x;

    .line 11
    .line 12
    iget-object v0, v0, Lj0/x;->O0:LZ1/c;

    .line 13
    .line 14
    iget-object v1, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v2, Lj0/f;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-direct {v2, v0, p1, v3}, Lj0/f;-><init>(LZ1/c;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
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

.method public I(Lm0/e;)V
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

.method public J(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public K(ILm3/m;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 9
    .line 10
    new-instance v1, LD/o;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x6

    .line 14
    invoke-direct {v1, v2, p1, v3}, LD/o;-><init>(III)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lio/flutter/plugin/editing/i;->e:LD/o;

    .line 18
    .line 19
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/f;->e(Lio/flutter/plugin/editing/e;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lio/flutter/plugin/editing/f;

    .line 25
    .line 26
    iget-object v1, p2, Lm3/m;->j:LZ1/i;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v1, LZ1/i;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lm3/n;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v1, v2

    .line 37
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/editing/i;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-direct {p1, v1, v3}, Lio/flutter/plugin/editing/f;-><init>(Lm3/n;Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Lio/flutter/plugin/editing/i;->e(Lm3/m;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 49
    .line 50
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->e:LD/o;

    .line 51
    .line 52
    iget p1, p1, LD/o;->b:I

    .line 53
    .line 54
    const/4 p2, 0x3

    .line 55
    if-ne p1, p2, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, v0, Lio/flutter/plugin/editing/i;->p:Z

    .line 59
    .line 60
    :cond_1
    iput-object v2, v0, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/f;->a(Lio/flutter/plugin/editing/e;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public L(DD[D)V
    .locals 19

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v4, p5

    .line 6
    .line 7
    move-object/from16 v5, p0

    .line 8
    .line 9
    iget-object v6, v5, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v6, Lio/flutter/plugin/editing/i;

    .line 12
    .line 13
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    new-array v7, v7, [D

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    aget-wide v9, v4, v8

    .line 21
    .line 22
    const-wide/16 v11, 0x0

    .line 23
    .line 24
    cmpl-double v9, v9, v11

    .line 25
    .line 26
    const/16 v10, 0xf

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x1

    .line 30
    if-nez v9, :cond_0

    .line 31
    .line 32
    const/4 v9, 0x7

    .line 33
    aget-wide v15, v4, v9

    .line 34
    .line 35
    cmpl-double v9, v15, v11

    .line 36
    .line 37
    if-nez v9, :cond_0

    .line 38
    .line 39
    aget-wide v15, v4, v10

    .line 40
    .line 41
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 42
    .line 43
    cmpl-double v9, v15, v17

    .line 44
    .line 45
    if-nez v9, :cond_0

    .line 46
    .line 47
    move v9, v14

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v9, v13

    .line 50
    :goto_0
    const/16 v15, 0xc

    .line 51
    .line 52
    aget-wide v15, v4, v15

    .line 53
    .line 54
    aget-wide v17, v4, v10

    .line 55
    .line 56
    div-double v15, v15, v17

    .line 57
    .line 58
    aput-wide v15, v7, v14

    .line 59
    .line 60
    aput-wide v15, v7, v13

    .line 61
    .line 62
    const/16 v10, 0xd

    .line 63
    .line 64
    aget-wide v15, v4, v10

    .line 65
    .line 66
    div-double v15, v15, v17

    .line 67
    .line 68
    aput-wide v15, v7, v8

    .line 69
    .line 70
    const/4 v10, 0x2

    .line 71
    aput-wide v15, v7, v10

    .line 72
    .line 73
    new-instance v15, Lh0/c;

    .line 74
    .line 75
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-boolean v9, v15, Lh0/c;->a:Z

    .line 79
    .line 80
    iput-object v4, v15, Lh0/c;->b:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v7, v15, Lh0/c;->c:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v15, v0, v1, v11, v12}, Lh0/c;->a(DD)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v15, v0, v1, v2, v3}, Lh0/c;->a(DD)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v15, v11, v12, v2, v3}, Lh0/c;->a(DD)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v6, Lio/flutter/plugin/editing/i;->a:Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 108
    .line 109
    new-instance v1, Landroid/graphics/Rect;

    .line 110
    .line 111
    aget-wide v2, v7, v13

    .line 112
    .line 113
    float-to-double v11, v0

    .line 114
    mul-double/2addr v2, v11

    .line 115
    double-to-int v0, v2

    .line 116
    aget-wide v2, v7, v10

    .line 117
    .line 118
    mul-double/2addr v2, v11

    .line 119
    double-to-int v2, v2

    .line 120
    aget-wide v3, v7, v14

    .line 121
    .line 122
    mul-double/2addr v3, v11

    .line 123
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    double-to-int v3, v3

    .line 128
    aget-wide v8, v7, v8

    .line 129
    .line 130
    mul-double/2addr v8, v11

    .line 131
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    double-to-int v4, v7

    .line 136
    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 137
    .line 138
    .line 139
    iput-object v1, v6, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 140
    .line 141
    return-void
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

.method public M(Lm3/n;)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->a:Landroid/view/View;

    .line 6
    .line 7
    iget-boolean v2, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_3

    .line 11
    .line 12
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->o:Lm3/n;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget v4, v2, Lm3/n;->d:I

    .line 17
    .line 18
    if-ltz v4, :cond_3

    .line 19
    .line 20
    iget v5, v2, Lm3/n;->e:I

    .line 21
    .line 22
    if-le v5, v4, :cond_3

    .line 23
    .line 24
    sub-int/2addr v5, v4

    .line 25
    iget v6, p1, Lm3/n;->e:I

    .line 26
    .line 27
    iget v7, p1, Lm3/n;->d:I

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v5, v6, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v6, v3

    .line 35
    :goto_0
    if-ge v6, v5, :cond_2

    .line 36
    .line 37
    iget-object v9, v2, Lm3/n;->a:Ljava/lang/String;

    .line 38
    .line 39
    add-int v10, v6, v4

    .line 40
    .line 41
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    iget-object v10, p1, Lm3/n;->a:Ljava/lang/String;

    .line 46
    .line 47
    add-int v11, v6, v7

    .line 48
    .line 49
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eq v9, v10, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v8, v3

    .line 60
    :goto_1
    iput-boolean v8, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 61
    .line 62
    :cond_3
    iput-object p1, v0, Lio/flutter/plugin/editing/i;->o:Lm3/n;

    .line 63
    .line 64
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Lio/flutter/plugin/editing/f;->f(Lm3/n;)V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v3, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 79
    .line 80
    :cond_4
    return-void
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

.method public N(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB0/d;

    .line 4
    .line 5
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LZ1/c;

    .line 8
    .line 9
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LS/i;

    .line 12
    .line 13
    iget-boolean v1, v0, LS/i;->n:Z

    .line 14
    .line 15
    if-eq v1, p1, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, LS/i;->m:LS/h;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {}, LQ/j;->a()LQ/j;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, v0, LS/i;->m:LS/h;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v3, "initCallback cannot be null"

    .line 31
    .line 32
    invoke-static {v2, v3}, LD1/b;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, LQ/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object v1, v1, LQ/j;->b:Lq/f;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lq/f;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_0
    :goto_0
    iput-boolean p1, v0, LS/i;->n:Z

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-static {}, LQ/j;->a()LQ/j;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, LQ/j;->b()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget-object v0, v0, LS/i;->l:Lm/m;

    .line 79
    .line 80
    invoke-static {v0, p1}, LS/i;->a(Landroid/widget/EditText;I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
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

.method public a(J)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
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

.method public b(Ll/h;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Ll/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll/s;

    .line 7
    .line 8
    iget-object v0, v0, Ll/s;->v:Ll/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll/h;->j()Ll/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ll/h;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lm/i;

    .line 21
    .line 22
    iget-object v0, v0, Lm/i;->p:Ll/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Ll/n;->b(Ll/h;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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

.method public c(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
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

.method public d(Ljava/lang/String;Ln3/d;La0/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf3/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lf3/j;->d(Ljava/lang/String;Ln3/d;La0/z;)V

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

.method public e(Ljava/nio/ByteBuffer;Lf3/g;)V
    .locals 0

    .line 1
    sget-object p2, Ln3/y;->b:Ln3/y;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ln3/y;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lf3/b;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
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

.method public f(Ll/h;Ll/i;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll/e;

    .line 4
    .line 5
    iget-object v1, v0, Ll/e;->q:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Ll/e;->s:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Ll/d;

    .line 26
    .line 27
    iget-object v6, v6, Ll/d;->b:Ll/h;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Ll/d;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v1, LT2/m;

    .line 56
    .line 57
    const/4 v8, 0x1

    .line 58
    move-object v3, v1

    .line 59
    move-object v4, p0

    .line 60
    move-object v6, p2

    .line 61
    move-object v7, p1

    .line 62
    invoke-direct/range {v3 .. v8}, LT2/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const-wide/16 v4, 0xc8

    .line 70
    .line 71
    add-long/2addr v2, v4

    .line 72
    iget-object p2, v0, Ll/e;->q:Landroid/os/Handler;

    .line 73
    .line 74
    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 75
    .line 76
    .line 77
    return-void
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

.method public g(Ll/h;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/i;

    .line 4
    .line 5
    iget-object v1, v0, Lm/i;->n:Ll/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Ll/s;

    .line 13
    .line 14
    iget-object v1, v1, Ll/s;->w:Ll/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lm/i;->p:Ll/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ll/n;->g(Ll/h;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :cond_1
    return v2
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

.method public h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ln3/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf3/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lf3/j;->h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ln3/e;)V

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

.method public i()Z
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

.method public j(Ln3/l;)La0/z;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf3/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf3/j;->j(Ln3/l;)La0/z;

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

.method public k(Ljava/lang/String;Ln3/d;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Lf3/j;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2, v0}, Lf3/j;->d(Ljava/lang/String;Ln3/d;La0/z;)V

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

.method public l(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf3/j;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lf3/j;->h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ln3/e;)V

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

.method public m(JJ)J
    .locals 0

    .line 1
    return-wide p3
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

.method public n()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
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

.method public o(I)V
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

.method public onMethodCall(Ln3/n;Ln3/p;)V
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v6, "dispose"

    .line 6
    .line 7
    const-string v7, "setDirection"

    .line 8
    .line 9
    const-string v8, "touch"

    .line 10
    .line 11
    const-string v9, "clearFocus"

    .line 12
    .line 13
    const-string v10, "create"

    .line 14
    .line 15
    const-string v12, "id"

    .line 16
    .line 17
    const-string v13, "direction"

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v14, 0x0

    .line 22
    const-string v15, "error"

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    iget v2, v1, Landroidx/lifecycle/E;->l:I

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    iget-object v2, v1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, LZ1/c;

    .line 33
    .line 34
    iget-object v3, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lio/flutter/plugin/platform/m;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    iget-object v3, v0, Ln3/n;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Ln3/n;->b:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v17

    .line 53
    sparse-switch v17, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    :goto_0
    const/16 v16, -0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :sswitch_0
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/16 v16, 0x5

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :sswitch_1
    const-string v6, "isSurfaceControlEnabled"

    .line 70
    .line 71
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/16 v16, 0x4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :sswitch_2
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    const/16 v16, 0x3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :sswitch_3
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    move/from16 v16, v4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :sswitch_4
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move/from16 v16, v5

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :sswitch_5
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    move/from16 v16, v11

    .line 119
    .line 120
    :goto_1
    packed-switch v16, :pswitch_data_1

    .line 121
    .line 122
    .line 123
    move-object/from16 v0, p2

    .line 124
    .line 125
    check-cast v0, LP2/c;

    .line 126
    .line 127
    invoke-virtual {v0}, LP2/c;->notImplemented()V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :pswitch_1
    check-cast v0, Ljava/util/Map;

    .line 133
    .line 134
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    :try_start_0
    iget-object v2, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/m;->e(I)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v0, p2

    .line 152
    .line 153
    check-cast v0, LP2/c;

    .line 154
    .line 155
    invoke-virtual {v0, v14}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :catch_0
    move-exception v0

    .line 161
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    move-object/from16 v2, p2

    .line 166
    .line 167
    check-cast v2, LP2/c;

    .line 168
    .line 169
    invoke-virtual {v2, v15, v0, v14}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_5

    .line 173
    .line 174
    :pswitch_2
    iget-object v0, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 177
    .line 178
    iget-object v0, v0, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 181
    .line 182
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 183
    .line 184
    if-nez v0, :cond_7

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_7
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    :goto_2
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    move-object/from16 v2, p2

    .line 196
    .line 197
    check-cast v2, LP2/c;

    .line 198
    .line 199
    invoke-virtual {v2, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_5

    .line 203
    .line 204
    :pswitch_3
    check-cast v0, Ljava/util/Map;

    .line 205
    .line 206
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    :try_start_1
    iget-object v2, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 229
    .line 230
    invoke-virtual {v2, v3, v0}, Lio/flutter/plugin/platform/m;->k(II)V

    .line 231
    .line 232
    .line 233
    move-object/from16 v0, p2

    .line 234
    .line 235
    check-cast v0, LP2/c;

    .line 236
    .line 237
    invoke-virtual {v0, v14}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 238
    .line 239
    .line 240
    goto/16 :goto_5

    .line 241
    .line 242
    :catch_1
    move-exception v0

    .line 243
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    move-object/from16 v2, p2

    .line 248
    .line 249
    check-cast v2, LP2/c;

    .line 250
    .line 251
    invoke-virtual {v2, v15, v0, v14}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_5

    .line 255
    .line 256
    :pswitch_4
    check-cast v0, Ljava/util/List;

    .line 257
    .line 258
    new-instance v3, Lm3/h;

    .line 259
    .line 260
    move-object/from16 v17, v3

    .line 261
    .line 262
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, Ljava/lang/Integer;

    .line 267
    .line 268
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v18

    .line 272
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    move-object/from16 v19, v5

    .line 277
    .line 278
    check-cast v19, Ljava/lang/Number;

    .line 279
    .line 280
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    move-object/from16 v20, v4

    .line 285
    .line 286
    check-cast v20, Ljava/lang/Number;

    .line 287
    .line 288
    const/4 v4, 0x3

    .line 289
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    check-cast v4, Ljava/lang/Integer;

    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v21

    .line 299
    const/4 v4, 0x4

    .line 300
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, Ljava/lang/Integer;

    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result v22

    .line 310
    const/4 v4, 0x5

    .line 311
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v23

    .line 315
    const/4 v4, 0x6

    .line 316
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v24

    .line 320
    const/4 v4, 0x7

    .line 321
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    check-cast v4, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v25

    .line 331
    const/16 v4, 0x8

    .line 332
    .line 333
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    check-cast v4, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v26

    .line 343
    const/16 v4, 0x9

    .line 344
    .line 345
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    check-cast v4, Ljava/lang/Double;

    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 352
    .line 353
    .line 354
    move-result-wide v4

    .line 355
    double-to-float v4, v4

    .line 356
    move/from16 v27, v4

    .line 357
    .line 358
    const/16 v4, 0xa

    .line 359
    .line 360
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    check-cast v4, Ljava/lang/Double;

    .line 365
    .line 366
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 367
    .line 368
    .line 369
    move-result-wide v4

    .line 370
    double-to-float v4, v4

    .line 371
    move/from16 v28, v4

    .line 372
    .line 373
    const/16 v4, 0xb

    .line 374
    .line 375
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    check-cast v4, Ljava/lang/Integer;

    .line 380
    .line 381
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v29

    .line 385
    const/16 v4, 0xc

    .line 386
    .line 387
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v30

    .line 397
    const/16 v4, 0xd

    .line 398
    .line 399
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    check-cast v4, Ljava/lang/Integer;

    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v31

    .line 409
    const/16 v4, 0xe

    .line 410
    .line 411
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    check-cast v4, Ljava/lang/Integer;

    .line 416
    .line 417
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 418
    .line 419
    .line 420
    move-result v32

    .line 421
    const/16 v4, 0xf

    .line 422
    .line 423
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, Ljava/lang/Number;

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 430
    .line 431
    .line 432
    move-result-wide v33

    .line 433
    invoke-direct/range {v17 .. v34}, Lm3/h;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 434
    .line 435
    .line 436
    :try_start_2
    iget-object v0, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 439
    .line 440
    invoke-virtual {v0, v3}, Lio/flutter/plugin/platform/m;->i(Lm3/h;)V

    .line 441
    .line 442
    .line 443
    move-object/from16 v0, p2

    .line 444
    .line 445
    check-cast v0, LP2/c;

    .line 446
    .line 447
    invoke-virtual {v0, v14}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 448
    .line 449
    .line 450
    goto/16 :goto_5

    .line 451
    .line 452
    :catch_2
    move-exception v0

    .line 453
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    move-object/from16 v2, p2

    .line 458
    .line 459
    check-cast v2, LP2/c;

    .line 460
    .line 461
    invoke-virtual {v2, v15, v0, v14}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_5

    .line 465
    .line 466
    :pswitch_5
    check-cast v0, Ljava/lang/Integer;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    :try_start_3
    iget-object v2, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 475
    .line 476
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/m;->c(I)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v0, p2

    .line 480
    .line 481
    check-cast v0, LP2/c;

    .line 482
    .line 483
    invoke-virtual {v0, v14}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 484
    .line 485
    .line 486
    goto/16 :goto_5

    .line 487
    .line 488
    :catch_3
    move-exception v0

    .line 489
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    move-object/from16 v2, p2

    .line 494
    .line 495
    check-cast v2, LP2/c;

    .line 496
    .line 497
    invoke-virtual {v2, v15, v0, v14}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    goto/16 :goto_5

    .line 501
    .line 502
    :pswitch_6
    check-cast v0, Ljava/util/Map;

    .line 503
    .line 504
    const-string v3, "params"

    .line 505
    .line 506
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    if-eqz v4, :cond_8

    .line 511
    .line 512
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, [B

    .line 517
    .line 518
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    goto :goto_3

    .line 523
    :cond_8
    move-object v3, v14

    .line 524
    :goto_3
    :try_start_4
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    check-cast v4, Ljava/lang/Integer;

    .line 529
    .line 530
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    const-string v5, "viewType"

    .line 535
    .line 536
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    check-cast v5, Ljava/lang/String;

    .line 541
    .line 542
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    iget-object v2, v2, LZ1/c;->m:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 555
    .line 556
    iget-object v2, v2, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v2, Lio/flutter/plugin/platform/o;

    .line 559
    .line 560
    iget-object v6, v2, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/m;

    .line 561
    .line 562
    iget-object v6, v6, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v6, Ljava/util/HashMap;

    .line 565
    .line 566
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    check-cast v6, Lw3/b;

    .line 571
    .line 572
    if-eqz v6, :cond_b

    .line 573
    .line 574
    if-eqz v3, :cond_9

    .line 575
    .line 576
    iget-object v5, v6, Lw3/b;->a:Ln3/w;

    .line 577
    .line 578
    invoke-virtual {v5, v3}, Ln3/w;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    goto :goto_4

    .line 583
    :cond_9
    move-object v3, v14

    .line 584
    :goto_4
    iget-object v5, v2, Lio/flutter/plugin/platform/o;->c:Landroid/app/Activity;

    .line 585
    .line 586
    invoke-virtual {v6, v5, v3}, Lw3/b;->a(Landroid/content/Context;Ljava/lang/Object;)Lio/flutter/plugin/platform/g;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-interface {v3}, Lio/flutter/plugin/platform/g;->getView()Landroid/view/View;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    if-eqz v5, :cond_a

    .line 595
    .line 596
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 597
    .line 598
    .line 599
    iget-object v0, v2, Lio/flutter/plugin/platform/o;->i:Landroid/util/SparseArray;

    .line 600
    .line 601
    invoke-virtual {v0, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v0, p2

    .line 605
    .line 606
    check-cast v0, LP2/c;

    .line 607
    .line 608
    invoke-virtual {v0, v14}, LP2/c;->success(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    goto :goto_5

    .line 612
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 613
    .line 614
    const-string v2, "PlatformView#getView() returned null, but an Android view reference was expected."

    .line 615
    .line 616
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    throw v0

    .line 620
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 621
    .line 622
    new-instance v2, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    const-string v3, "Trying to create a platform view of unregistered type: "

    .line 625
    .line 626
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 640
    :catch_4
    move-exception v0

    .line 641
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    move-object/from16 v2, p2

    .line 646
    .line 647
    check-cast v2, LP2/c;

    .line 648
    .line 649
    invoke-virtual {v2, v15, v0, v14}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    :goto_5
    return-void

    .line 653
    :pswitch_7
    iget-object v2, v1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v2, LZ1/e;

    .line 656
    .line 657
    iget-object v3, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v3, Lio/flutter/plugin/platform/m;

    .line 660
    .line 661
    if-nez v3, :cond_c

    .line 662
    .line 663
    goto/16 :goto_e

    .line 664
    .line 665
    :cond_c
    iget-object v3, v0, Ln3/n;->a:Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    const-string v4, "left"

    .line 671
    .line 672
    const-string v5, "top"

    .line 673
    .line 674
    const-string v11, "height"

    .line 675
    .line 676
    const-string v14, "width"

    .line 677
    .line 678
    iget-object v0, v0, Ln3/n;->b:Ljava/lang/Object;

    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 681
    .line 682
    .line 683
    move-result v21

    .line 684
    sparse-switch v21, :sswitch_data_1

    .line 685
    .line 686
    .line 687
    :goto_6
    const/16 v16, -0x1

    .line 688
    .line 689
    goto :goto_7

    .line 690
    :sswitch_6
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v3

    .line 694
    if-nez v3, :cond_d

    .line 695
    .line 696
    goto :goto_6

    .line 697
    :cond_d
    const/16 v16, 0x7

    .line 698
    .line 699
    goto :goto_7

    .line 700
    :sswitch_7
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    if-nez v3, :cond_e

    .line 705
    .line 706
    goto :goto_6

    .line 707
    :cond_e
    const/16 v16, 0x6

    .line 708
    .line 709
    goto :goto_7

    .line 710
    :sswitch_8
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    if-nez v3, :cond_f

    .line 715
    .line 716
    goto :goto_6

    .line 717
    :cond_f
    const/16 v16, 0x5

    .line 718
    .line 719
    goto :goto_7

    .line 720
    :sswitch_9
    const-string v6, "synchronizeToNativeViewHierarchy"

    .line 721
    .line 722
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-nez v3, :cond_10

    .line 727
    .line 728
    goto :goto_6

    .line 729
    :cond_10
    const/16 v16, 0x4

    .line 730
    .line 731
    goto :goto_7

    .line 732
    :sswitch_a
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    if-nez v3, :cond_11

    .line 737
    .line 738
    goto :goto_6

    .line 739
    :cond_11
    const/16 v16, 0x3

    .line 740
    .line 741
    goto :goto_7

    .line 742
    :sswitch_b
    const-string v6, "resize"

    .line 743
    .line 744
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-nez v3, :cond_12

    .line 749
    .line 750
    goto :goto_6

    .line 751
    :cond_12
    const/16 v16, 0x2

    .line 752
    .line 753
    goto :goto_7

    .line 754
    :sswitch_c
    const-string v6, "offset"

    .line 755
    .line 756
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-nez v3, :cond_13

    .line 761
    .line 762
    goto :goto_6

    .line 763
    :cond_13
    const/16 v16, 0x1

    .line 764
    .line 765
    goto :goto_7

    .line 766
    :sswitch_d
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    if-nez v3, :cond_14

    .line 771
    .line 772
    goto :goto_6

    .line 773
    :cond_14
    const/16 v16, 0x0

    .line 774
    .line 775
    :goto_7
    packed-switch v16, :pswitch_data_2

    .line 776
    .line 777
    .line 778
    move-object/from16 v0, p2

    .line 779
    .line 780
    check-cast v0, LP2/c;

    .line 781
    .line 782
    invoke-virtual {v0}, LP2/c;->notImplemented()V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_e

    .line 786
    .line 787
    :pswitch_8
    check-cast v0, Ljava/util/Map;

    .line 788
    .line 789
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    check-cast v0, Ljava/lang/Integer;

    .line 794
    .line 795
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    :try_start_5
    iget-object v2, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 802
    .line 803
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/m;->e(I)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v0, p2

    .line 807
    .line 808
    check-cast v0, LP2/c;

    .line 809
    .line 810
    const/4 v2, 0x0

    .line 811
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 812
    .line 813
    .line 814
    goto/16 :goto_e

    .line 815
    .line 816
    :catch_5
    move-exception v0

    .line 817
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    move-object/from16 v2, p2

    .line 822
    .line 823
    check-cast v2, LP2/c;

    .line 824
    .line 825
    const/4 v3, 0x0

    .line 826
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    goto/16 :goto_e

    .line 830
    .line 831
    :pswitch_9
    check-cast v0, Ljava/util/Map;

    .line 832
    .line 833
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    check-cast v3, Ljava/lang/Integer;

    .line 838
    .line 839
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    check-cast v0, Ljava/lang/Integer;

    .line 848
    .line 849
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    :try_start_6
    iget-object v2, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 856
    .line 857
    invoke-virtual {v2, v3, v0}, Lio/flutter/plugin/platform/m;->k(II)V

    .line 858
    .line 859
    .line 860
    move-object/from16 v0, p2

    .line 861
    .line 862
    check-cast v0, LP2/c;

    .line 863
    .line 864
    const/4 v2, 0x0

    .line 865
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6

    .line 866
    .line 867
    .line 868
    goto/16 :goto_e

    .line 869
    .line 870
    :catch_6
    move-exception v0

    .line 871
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    move-object/from16 v2, p2

    .line 876
    .line 877
    check-cast v2, LP2/c;

    .line 878
    .line 879
    const/4 v3, 0x0

    .line 880
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_e

    .line 884
    .line 885
    :pswitch_a
    check-cast v0, Ljava/util/List;

    .line 886
    .line 887
    new-instance v3, Lm3/h;

    .line 888
    .line 889
    move-object/from16 v21, v3

    .line 890
    .line 891
    const/4 v4, 0x0

    .line 892
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    check-cast v4, Ljava/lang/Integer;

    .line 897
    .line 898
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 899
    .line 900
    .line 901
    move-result v22

    .line 902
    const/4 v6, 0x1

    .line 903
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v4

    .line 907
    move-object/from16 v23, v4

    .line 908
    .line 909
    check-cast v23, Ljava/lang/Number;

    .line 910
    .line 911
    const/4 v7, 0x2

    .line 912
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    move-object/from16 v24, v4

    .line 917
    .line 918
    check-cast v24, Ljava/lang/Number;

    .line 919
    .line 920
    const/4 v4, 0x3

    .line 921
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    check-cast v4, Ljava/lang/Integer;

    .line 926
    .line 927
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 928
    .line 929
    .line 930
    move-result v25

    .line 931
    const/4 v4, 0x4

    .line 932
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v4

    .line 936
    check-cast v4, Ljava/lang/Integer;

    .line 937
    .line 938
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 939
    .line 940
    .line 941
    move-result v26

    .line 942
    const/4 v4, 0x5

    .line 943
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v27

    .line 947
    const/4 v4, 0x6

    .line 948
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v28

    .line 952
    const/4 v4, 0x7

    .line 953
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    check-cast v4, Ljava/lang/Integer;

    .line 958
    .line 959
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 960
    .line 961
    .line 962
    move-result v29

    .line 963
    const/16 v4, 0x8

    .line 964
    .line 965
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    check-cast v4, Ljava/lang/Integer;

    .line 970
    .line 971
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 972
    .line 973
    .line 974
    move-result v30

    .line 975
    const/16 v4, 0x9

    .line 976
    .line 977
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    check-cast v4, Ljava/lang/Double;

    .line 982
    .line 983
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 984
    .line 985
    .line 986
    move-result-wide v4

    .line 987
    double-to-float v4, v4

    .line 988
    move/from16 v31, v4

    .line 989
    .line 990
    const/16 v4, 0xa

    .line 991
    .line 992
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v4

    .line 996
    check-cast v4, Ljava/lang/Double;

    .line 997
    .line 998
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 999
    .line 1000
    .line 1001
    move-result-wide v4

    .line 1002
    double-to-float v4, v4

    .line 1003
    move/from16 v32, v4

    .line 1004
    .line 1005
    const/16 v4, 0xb

    .line 1006
    .line 1007
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    check-cast v4, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v33

    .line 1017
    const/16 v4, 0xc

    .line 1018
    .line 1019
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    check-cast v4, Ljava/lang/Integer;

    .line 1024
    .line 1025
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1026
    .line 1027
    .line 1028
    move-result v34

    .line 1029
    const/16 v4, 0xd

    .line 1030
    .line 1031
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v4

    .line 1035
    check-cast v4, Ljava/lang/Integer;

    .line 1036
    .line 1037
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1038
    .line 1039
    .line 1040
    move-result v35

    .line 1041
    const/16 v4, 0xe

    .line 1042
    .line 1043
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    check-cast v4, Ljava/lang/Integer;

    .line 1048
    .line 1049
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1050
    .line 1051
    .line 1052
    move-result v36

    .line 1053
    const/16 v4, 0xf

    .line 1054
    .line 1055
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    check-cast v0, Ljava/lang/Number;

    .line 1060
    .line 1061
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v37

    .line 1065
    invoke-direct/range {v21 .. v38}, Lm3/h;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 1066
    .line 1067
    .line 1068
    :try_start_7
    iget-object v0, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 1071
    .line 1072
    invoke-virtual {v0, v3}, Lio/flutter/plugin/platform/m;->h(Lm3/h;)V

    .line 1073
    .line 1074
    .line 1075
    move-object/from16 v0, p2

    .line 1076
    .line 1077
    check-cast v0, LP2/c;

    .line 1078
    .line 1079
    const/4 v2, 0x0

    .line 1080
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1081
    .line 1082
    .line 1083
    goto/16 :goto_e

    .line 1084
    .line 1085
    :catch_7
    move-exception v0

    .line 1086
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    move-object/from16 v2, p2

    .line 1091
    .line 1092
    check-cast v2, LP2/c;

    .line 1093
    .line 1094
    const/4 v3, 0x0

    .line 1095
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    goto/16 :goto_e

    .line 1099
    .line 1100
    :pswitch_b
    check-cast v0, Ljava/lang/Boolean;

    .line 1101
    .line 1102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    :try_start_8
    iget-object v2, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 1109
    .line 1110
    iget-object v2, v2, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v2, Lio/flutter/plugin/platform/p;

    .line 1113
    .line 1114
    iput-boolean v0, v2, Lio/flutter/plugin/platform/p;->r:Z

    .line 1115
    .line 1116
    move-object/from16 v0, p2

    .line 1117
    .line 1118
    check-cast v0, LP2/c;

    .line 1119
    .line 1120
    const/4 v2, 0x0

    .line 1121
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1122
    .line 1123
    .line 1124
    goto/16 :goto_e

    .line 1125
    .line 1126
    :catch_8
    move-exception v0

    .line 1127
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    move-object/from16 v2, p2

    .line 1132
    .line 1133
    check-cast v2, LP2/c;

    .line 1134
    .line 1135
    const/4 v3, 0x0

    .line 1136
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1137
    .line 1138
    .line 1139
    goto/16 :goto_e

    .line 1140
    .line 1141
    :pswitch_c
    check-cast v0, Ljava/lang/Integer;

    .line 1142
    .line 1143
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1144
    .line 1145
    .line 1146
    move-result v0

    .line 1147
    :try_start_9
    iget-object v2, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v2, Lio/flutter/plugin/platform/m;

    .line 1150
    .line 1151
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/m;->c(I)V

    .line 1152
    .line 1153
    .line 1154
    move-object/from16 v0, p2

    .line 1155
    .line 1156
    check-cast v0, LP2/c;

    .line 1157
    .line 1158
    const/4 v2, 0x0

    .line 1159
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1160
    .line 1161
    .line 1162
    goto/16 :goto_e

    .line 1163
    .line 1164
    :catch_9
    move-exception v0

    .line 1165
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    move-object/from16 v2, p2

    .line 1170
    .line 1171
    check-cast v2, LP2/c;

    .line 1172
    .line 1173
    const/4 v3, 0x0

    .line 1174
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    goto/16 :goto_e

    .line 1178
    .line 1179
    :pswitch_d
    check-cast v0, Ljava/util/Map;

    .line 1180
    .line 1181
    new-instance v9, Lm3/g;

    .line 1182
    .line 1183
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v3

    .line 1187
    check-cast v3, Ljava/lang/Integer;

    .line 1188
    .line 1189
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1190
    .line 1191
    .line 1192
    move-result v4

    .line 1193
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v3

    .line 1197
    check-cast v3, Ljava/lang/Double;

    .line 1198
    .line 1199
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v5

    .line 1203
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    check-cast v0, Ljava/lang/Double;

    .line 1208
    .line 1209
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v7

    .line 1213
    move-object v3, v9

    .line 1214
    invoke-direct/range {v3 .. v8}, Lm3/g;-><init>(IDD)V

    .line 1215
    .line 1216
    .line 1217
    :try_start_a
    iget-object v0, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 1220
    .line 1221
    new-instance v2, LI2/g;

    .line 1222
    .line 1223
    move-object/from16 v3, p2

    .line 1224
    .line 1225
    check-cast v3, LP2/c;

    .line 1226
    .line 1227
    const/16 v4, 0x15

    .line 1228
    .line 1229
    invoke-direct {v2, v3, v4}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v0, v9, v2}, Lio/flutter/plugin/platform/m;->j(Lm3/g;LI2/g;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_a

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_e

    .line 1236
    .line 1237
    :catch_a
    move-exception v0

    .line 1238
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    move-object/from16 v2, p2

    .line 1243
    .line 1244
    check-cast v2, LP2/c;

    .line 1245
    .line 1246
    const/4 v3, 0x0

    .line 1247
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1248
    .line 1249
    .line 1250
    goto/16 :goto_e

    .line 1251
    .line 1252
    :pswitch_e
    check-cast v0, Ljava/util/Map;

    .line 1253
    .line 1254
    :try_start_b
    iget-object v2, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1255
    .line 1256
    move-object v6, v2

    .line 1257
    check-cast v6, Lio/flutter/plugin/platform/m;

    .line 1258
    .line 1259
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    check-cast v2, Ljava/lang/Integer;

    .line 1264
    .line 1265
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1266
    .line 1267
    .line 1268
    move-result v7

    .line 1269
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v2

    .line 1273
    check-cast v2, Ljava/lang/Double;

    .line 1274
    .line 1275
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1276
    .line 1277
    .line 1278
    move-result-wide v8

    .line 1279
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    check-cast v0, Ljava/lang/Double;

    .line 1284
    .line 1285
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1286
    .line 1287
    .line 1288
    move-result-wide v10

    .line 1289
    invoke-virtual/range {v6 .. v11}, Lio/flutter/plugin/platform/m;->g(IDD)V

    .line 1290
    .line 1291
    .line 1292
    move-object/from16 v0, p2

    .line 1293
    .line 1294
    check-cast v0, LP2/c;

    .line 1295
    .line 1296
    const/4 v2, 0x0

    .line 1297
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_b

    .line 1298
    .line 1299
    .line 1300
    goto/16 :goto_e

    .line 1301
    .line 1302
    :catch_b
    move-exception v0

    .line 1303
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    move-object/from16 v2, p2

    .line 1308
    .line 1309
    check-cast v2, LP2/c;

    .line 1310
    .line 1311
    const/4 v3, 0x0

    .line 1312
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1313
    .line 1314
    .line 1315
    goto/16 :goto_e

    .line 1316
    .line 1317
    :pswitch_f
    const/4 v6, 0x1

    .line 1318
    const/4 v7, 0x2

    .line 1319
    const-string v3, "hybridFallback"

    .line 1320
    .line 1321
    check-cast v0, Ljava/util/Map;

    .line 1322
    .line 1323
    const-string v8, "hybrid"

    .line 1324
    .line 1325
    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v9

    .line 1329
    if-eqz v9, :cond_15

    .line 1330
    .line 1331
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v8

    .line 1335
    check-cast v8, Ljava/lang/Boolean;

    .line 1336
    .line 1337
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1338
    .line 1339
    .line 1340
    move-result v8

    .line 1341
    if-eqz v8, :cond_15

    .line 1342
    .line 1343
    move v8, v6

    .line 1344
    goto :goto_8

    .line 1345
    :cond_15
    const/4 v8, 0x0

    .line 1346
    :goto_8
    const-string v9, "params"

    .line 1347
    .line 1348
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v10

    .line 1352
    if-eqz v10, :cond_16

    .line 1353
    .line 1354
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v9

    .line 1358
    check-cast v9, [B

    .line 1359
    .line 1360
    invoke-static {v9}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v9

    .line 1364
    move-object/from16 v34, v9

    .line 1365
    .line 1366
    goto :goto_9

    .line 1367
    :cond_16
    const/16 v34, 0x0

    .line 1368
    .line 1369
    :goto_9
    const-string v9, "viewType"

    .line 1370
    .line 1371
    if-eqz v8, :cond_19

    .line 1372
    .line 1373
    :try_start_c
    new-instance v3, Lm3/f;

    .line 1374
    .line 1375
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v4

    .line 1379
    check-cast v4, Ljava/lang/Integer;

    .line 1380
    .line 1381
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1382
    .line 1383
    .line 1384
    move-result v22

    .line 1385
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v4

    .line 1389
    move-object/from16 v23, v4

    .line 1390
    .line 1391
    check-cast v23, Ljava/lang/String;

    .line 1392
    .line 1393
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    check-cast v0, Ljava/lang/Integer;

    .line 1398
    .line 1399
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1400
    .line 1401
    .line 1402
    move-result v32

    .line 1403
    const-wide/16 v24, 0x0

    .line 1404
    .line 1405
    const-wide/16 v26, 0x0

    .line 1406
    .line 1407
    const/16 v33, 0x3

    .line 1408
    .line 1409
    const-wide/16 v28, 0x0

    .line 1410
    .line 1411
    const-wide/16 v30, 0x0

    .line 1412
    .line 1413
    move-object/from16 v21, v3

    .line 1414
    .line 1415
    invoke-direct/range {v21 .. v34}, Lm3/f;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1416
    .line 1417
    .line 1418
    iget-object v0, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 1421
    .line 1422
    iget-object v0, v0, Lio/flutter/plugin/platform/m;->b:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 1425
    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    const/16 v2, 0x13

    .line 1430
    .line 1431
    invoke-static {v2}, Lio/flutter/plugin/platform/p;->e(I)V

    .line 1432
    .line 1433
    .line 1434
    invoke-static {v0, v3}, Lio/flutter/plugin/platform/p;->a(Lio/flutter/plugin/platform/p;Lm3/f;)V

    .line 1435
    .line 1436
    .line 1437
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1438
    .line 1439
    invoke-virtual {v4}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    .line 1440
    .line 1441
    .line 1442
    move-result v4
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_c

    .line 1443
    const-string v5, "Trying to create a Hybrid Composition view with HC++ enabled."

    .line 1444
    .line 1445
    if-nez v4, :cond_18

    .line 1446
    .line 1447
    const/4 v8, 0x0

    .line 1448
    :try_start_d
    invoke-virtual {v0, v3, v8}, Lio/flutter/plugin/platform/p;->b(Lm3/f;Z)Lio/flutter/plugin/platform/g;

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v2}, Lio/flutter/plugin/platform/p;->e(I)V

    .line 1452
    .line 1453
    .line 1454
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1455
    .line 1456
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    .line 1457
    .line 1458
    .line 1459
    move-result v0

    .line 1460
    if-nez v0, :cond_17

    .line 1461
    .line 1462
    move-object/from16 v0, p2

    .line 1463
    .line 1464
    check-cast v0, LP2/c;

    .line 1465
    .line 1466
    const/4 v2, 0x0

    .line 1467
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1468
    .line 1469
    .line 1470
    goto/16 :goto_e

    .line 1471
    .line 1472
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1473
    .line 1474
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1475
    .line 1476
    .line 1477
    throw v0

    .line 1478
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1479
    .line 1480
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1481
    .line 1482
    .line 1483
    throw v0

    .line 1484
    :catch_c
    move-exception v0

    .line 1485
    goto/16 :goto_d

    .line 1486
    .line 1487
    :cond_19
    const/4 v8, 0x0

    .line 1488
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v10

    .line 1492
    if-eqz v10, :cond_1a

    .line 1493
    .line 1494
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v3

    .line 1498
    check-cast v3, Ljava/lang/Boolean;

    .line 1499
    .line 1500
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v3

    .line 1504
    if-eqz v3, :cond_1a

    .line 1505
    .line 1506
    move v8, v6

    .line 1507
    :cond_1a
    if-eqz v8, :cond_1b

    .line 1508
    .line 1509
    move/from16 v33, v7

    .line 1510
    .line 1511
    goto :goto_a

    .line 1512
    :cond_1b
    move/from16 v33, v6

    .line 1513
    .line 1514
    :goto_a
    new-instance v3, Lm3/f;

    .line 1515
    .line 1516
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v6

    .line 1520
    check-cast v6, Ljava/lang/Integer;

    .line 1521
    .line 1522
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1523
    .line 1524
    .line 1525
    move-result v22

    .line 1526
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v6

    .line 1530
    move-object/from16 v23, v6

    .line 1531
    .line 1532
    check-cast v23, Ljava/lang/String;

    .line 1533
    .line 1534
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v6

    .line 1538
    const-wide/16 v9, 0x0

    .line 1539
    .line 1540
    if-eqz v6, :cond_1c

    .line 1541
    .line 1542
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v5

    .line 1546
    check-cast v5, Ljava/lang/Double;

    .line 1547
    .line 1548
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1549
    .line 1550
    .line 1551
    move-result-wide v5

    .line 1552
    move-wide/from16 v24, v5

    .line 1553
    .line 1554
    goto :goto_b

    .line 1555
    :cond_1c
    move-wide/from16 v24, v9

    .line 1556
    .line 1557
    :goto_b
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v5

    .line 1561
    if-eqz v5, :cond_1d

    .line 1562
    .line 1563
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v4

    .line 1567
    check-cast v4, Ljava/lang/Double;

    .line 1568
    .line 1569
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1570
    .line 1571
    .line 1572
    move-result-wide v4

    .line 1573
    move-wide/from16 v26, v4

    .line 1574
    .line 1575
    goto :goto_c

    .line 1576
    :cond_1d
    move-wide/from16 v26, v9

    .line 1577
    .line 1578
    :goto_c
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v4

    .line 1582
    check-cast v4, Ljava/lang/Double;

    .line 1583
    .line 1584
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1585
    .line 1586
    .line 1587
    move-result-wide v28

    .line 1588
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v4

    .line 1592
    check-cast v4, Ljava/lang/Double;

    .line 1593
    .line 1594
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1595
    .line 1596
    .line 1597
    move-result-wide v30

    .line 1598
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    check-cast v0, Ljava/lang/Integer;

    .line 1603
    .line 1604
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1605
    .line 1606
    .line 1607
    move-result v32

    .line 1608
    move-object/from16 v21, v3

    .line 1609
    .line 1610
    invoke-direct/range {v21 .. v34}, Lm3/f;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1611
    .line 1612
    .line 1613
    iget-object v0, v2, LZ1/e;->n:Ljava/lang/Object;

    .line 1614
    .line 1615
    check-cast v0, Lio/flutter/plugin/platform/m;

    .line 1616
    .line 1617
    invoke-virtual {v0, v3}, Lio/flutter/plugin/platform/m;->d(Lm3/f;)J

    .line 1618
    .line 1619
    .line 1620
    move-result-wide v2

    .line 1621
    const-wide/16 v4, -0x2

    .line 1622
    .line 1623
    cmp-long v0, v2, v4

    .line 1624
    .line 1625
    if-nez v0, :cond_1f

    .line 1626
    .line 1627
    if-eqz v8, :cond_1e

    .line 1628
    .line 1629
    move-object/from16 v0, p2

    .line 1630
    .line 1631
    check-cast v0, LP2/c;

    .line 1632
    .line 1633
    const/4 v2, 0x0

    .line 1634
    invoke-virtual {v0, v2}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    goto :goto_e

    .line 1638
    :cond_1e
    new-instance v0, Ljava/lang/AssertionError;

    .line 1639
    .line 1640
    const-string v2, "Platform view attempted to fall back to hybrid mode when not requested."

    .line 1641
    .line 1642
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1643
    .line 1644
    .line 1645
    throw v0

    .line 1646
    :cond_1f
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    move-object/from16 v2, p2

    .line 1651
    .line 1652
    check-cast v2, LP2/c;

    .line 1653
    .line 1654
    invoke-virtual {v2, v0}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_c

    .line 1655
    .line 1656
    .line 1657
    goto :goto_e

    .line 1658
    :goto_d
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    move-object/from16 v2, p2

    .line 1663
    .line 1664
    check-cast v2, LP2/c;

    .line 1665
    .line 1666
    const/4 v3, 0x0

    .line 1667
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1668
    .line 1669
    .line 1670
    :goto_e
    return-void

    .line 1671
    :pswitch_10
    invoke-direct/range {p0 .. p2}, Landroidx/lifecycle/E;->H(Ln3/n;Ln3/p;)V

    .line 1672
    .line 1673
    .line 1674
    return-void

    .line 1675
    :pswitch_11
    const-string v2, "Error when setting cursors: "

    .line 1676
    .line 1677
    iget-object v3, v1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1678
    .line 1679
    check-cast v3, Landroidx/lifecycle/E;

    .line 1680
    .line 1681
    iget-object v4, v3, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1682
    .line 1683
    check-cast v4, Lm3/i;

    .line 1684
    .line 1685
    if-nez v4, :cond_20

    .line 1686
    .line 1687
    goto :goto_10

    .line 1688
    :cond_20
    iget-object v4, v0, Ln3/n;->a:Ljava/lang/String;

    .line 1689
    .line 1690
    :try_start_e
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 1691
    .line 1692
    .line 1693
    move-result v5

    .line 1694
    const v6, -0x4de8d908

    .line 1695
    .line 1696
    .line 1697
    if-eq v5, v6, :cond_21

    .line 1698
    .line 1699
    goto :goto_10

    .line 1700
    :cond_21
    const-string v5, "activateSystemCursor"

    .line 1701
    .line 1702
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1703
    .line 1704
    .line 1705
    move-result v4

    .line 1706
    if-eqz v4, :cond_22

    .line 1707
    .line 1708
    iget-object v0, v0, Ln3/n;->b:Ljava/lang/Object;

    .line 1709
    .line 1710
    check-cast v0, Ljava/util/HashMap;

    .line 1711
    .line 1712
    const-string v4, "kind"

    .line 1713
    .line 1714
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    check-cast v0, Ljava/lang/String;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d

    .line 1719
    .line 1720
    :try_start_f
    iget-object v3, v3, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v3, Lm3/i;

    .line 1723
    .line 1724
    invoke-virtual {v3, v0}, Lm3/i;->b(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e

    .line 1725
    .line 1726
    .line 1727
    :try_start_10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1728
    .line 1729
    move-object/from16 v2, p2

    .line 1730
    .line 1731
    check-cast v2, LP2/c;

    .line 1732
    .line 1733
    invoke-virtual {v2, v0}, LP2/c;->success(Ljava/lang/Object;)V

    .line 1734
    .line 1735
    .line 1736
    goto :goto_10

    .line 1737
    :catch_d
    move-exception v0

    .line 1738
    goto :goto_f

    .line 1739
    :catch_e
    move-exception v0

    .line 1740
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v0

    .line 1749
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    move-object/from16 v2, p2

    .line 1757
    .line 1758
    check-cast v2, LP2/c;

    .line 1759
    .line 1760
    const/4 v3, 0x0

    .line 1761
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_d

    .line 1762
    .line 1763
    .line 1764
    goto :goto_10

    .line 1765
    :goto_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1766
    .line 1767
    const-string v3, "Unhandled error: "

    .line 1768
    .line 1769
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v0

    .line 1783
    move-object/from16 v2, p2

    .line 1784
    .line 1785
    check-cast v2, LP2/c;

    .line 1786
    .line 1787
    const/4 v3, 0x0

    .line 1788
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    :cond_22
    :goto_10
    return-void

    .line 1792
    :pswitch_12
    const-string v2, "locale"

    .line 1793
    .line 1794
    iget-object v3, v1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast v3, LZ1/e;

    .line 1797
    .line 1798
    iget-object v4, v3, LZ1/e;->n:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v4, Lm3/i;

    .line 1801
    .line 1802
    if-nez v4, :cond_23

    .line 1803
    .line 1804
    goto :goto_13

    .line 1805
    :cond_23
    iget-object v4, v0, Ln3/n;->a:Ljava/lang/String;

    .line 1806
    .line 1807
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1808
    .line 1809
    .line 1810
    const-string v5, "Localization.getStringResource"

    .line 1811
    .line 1812
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v4

    .line 1816
    if-nez v4, :cond_24

    .line 1817
    .line 1818
    move-object/from16 v0, p2

    .line 1819
    .line 1820
    check-cast v0, LP2/c;

    .line 1821
    .line 1822
    invoke-virtual {v0}, LP2/c;->notImplemented()V

    .line 1823
    .line 1824
    .line 1825
    goto :goto_13

    .line 1826
    :cond_24
    iget-object v0, v0, Ln3/n;->b:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v0, Lorg/json/JSONObject;

    .line 1829
    .line 1830
    :try_start_11
    const-string v4, "key"

    .line 1831
    .line 1832
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v4

    .line 1836
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1837
    .line 1838
    .line 1839
    move-result v5

    .line 1840
    if-eqz v5, :cond_25

    .line 1841
    .line 1842
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v2

    .line 1846
    goto :goto_11

    .line 1847
    :catch_f
    move-exception v0

    .line 1848
    goto :goto_12

    .line 1849
    :cond_25
    const/4 v2, 0x0

    .line 1850
    :goto_11
    iget-object v0, v3, LZ1/e;->n:Ljava/lang/Object;

    .line 1851
    .line 1852
    check-cast v0, Lm3/i;

    .line 1853
    .line 1854
    invoke-virtual {v0, v4, v2}, Lm3/i;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    move-object/from16 v2, p2

    .line 1859
    .line 1860
    check-cast v2, LP2/c;

    .line 1861
    .line 1862
    invoke-virtual {v2, v0}, LP2/c;->success(Ljava/lang/Object;)V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_f

    .line 1863
    .line 1864
    .line 1865
    goto :goto_13

    .line 1866
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    move-object/from16 v2, p2

    .line 1871
    .line 1872
    check-cast v2, LP2/c;

    .line 1873
    .line 1874
    const/4 v3, 0x0

    .line 1875
    invoke-virtual {v2, v15, v0, v3}, LP2/c;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1876
    .line 1877
    .line 1878
    :goto_13
    return-void

    .line 1879
    :pswitch_13
    iget-object v0, v1, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 1880
    .line 1881
    check-cast v0, La0/z;

    .line 1882
    .line 1883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1884
    .line 1885
    .line 1886
    return-void

    .line 1887
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_7
    .end packed-switch

    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    :sswitch_data_0
    .sparse-switch
        -0x509a5f04 -> :sswitch_5
        -0x2d106975 -> :sswitch_4
        0x696df3f -> :sswitch_3
        0x2261393d -> :sswitch_2
        0x2cc8f227 -> :sswitch_1
        0x63a5261f -> :sswitch_0
    .end sparse-switch

    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    :sswitch_data_1
    .sparse-switch
        -0x509a5f04 -> :sswitch_d
        -0x3cc89b6d -> :sswitch_c
        -0x37b2634c -> :sswitch_b
        -0x2d106975 -> :sswitch_a
        -0x126acbb2 -> :sswitch_9
        0x696df3f -> :sswitch_8
        0x2261393d -> :sswitch_7
        0x63a5261f -> :sswitch_6
    .end sparse-switch

    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method

.method public p(I)V
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

.method public r(Ll/h;Ll/i;)V
    .locals 0

    .line 1
    iget-object p2, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Ll/e;

    .line 4
    .line 5
    iget-object p2, p2, Ll/e;->q:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public s(J)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x1

    .line 2
    .line 3
    return-wide p1
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

.method public t(Ljava/lang/Object;LZ1/l;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v3, LZ1/m;

    .line 7
    .line 8
    iget-object v4, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v4, Lio/flutter/view/a;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v5}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    check-cast p1, Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v4, "type"

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    const-string v6, "data"

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v7, "message"

    .line 41
    .line 42
    const-string v8, "nodeId"

    .line 43
    .line 44
    const/4 v9, -0x1

    .line 45
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    sparse-switch v10, :sswitch_data_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_0
    const-string v10, "longPress"

    .line 54
    .line 55
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v9, 0x4

    .line 63
    goto :goto_0

    .line 64
    :sswitch_1
    const-string v10, "focus"

    .line 65
    .line 66
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const/4 v9, 0x3

    .line 74
    goto :goto_0

    .line 75
    :sswitch_2
    const-string v10, "tap"

    .line 76
    .line 77
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move v9, v0

    .line 85
    goto :goto_0

    .line 86
    :sswitch_3
    const-string v10, "announce"

    .line 87
    .line 88
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    move v9, v1

    .line 96
    goto :goto_0

    .line 97
    :sswitch_4
    const-string v10, "tooltip"

    .line 98
    .line 99
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    move v9, v2

    .line 107
    :goto_0
    packed-switch v9, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :pswitch_0
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    iget-object v1, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lio/flutter/view/a;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iget-object v1, v1, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lio/flutter/view/k;

    .line 131
    .line 132
    invoke-virtual {v1, p1, v0}, Lio/flutter/view/k;->g(II)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_1
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    iget-object v0, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lio/flutter/view/a;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lio/flutter/view/k;

    .line 156
    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/k;->g(II)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_2
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    iget-object v0, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lio/flutter/view/a;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lio/flutter/view/k;

    .line 182
    .line 183
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/k;->g(II)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_3
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    iget-object v0, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lio/flutter/view/a;

    .line 198
    .line 199
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    const/16 v2, 0x24

    .line 202
    .line 203
    if-lt v1, v2, :cond_6

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const-string v1, "AccessibilityBridge"

    .line 209
    .line 210
    const-string v2, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)"

    .line 211
    .line 212
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_6
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lio/flutter/view/k;

    .line 218
    .line 219
    iget-object v0, v0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 220
    .line 221
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_4
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Ljava/lang/String;

    .line 230
    .line 231
    if-eqz p1, :cond_8

    .line 232
    .line 233
    iget-object v0, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lio/flutter/view/a;

    .line 236
    .line 237
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 238
    .line 239
    const/16 v3, 0x1c

    .line 240
    .line 241
    if-lt v1, v3, :cond_7

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_7
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lio/flutter/view/k;

    .line 250
    .line 251
    const/16 v1, 0x20

    .line 252
    .line 253
    invoke-virtual {v0, v2, v1}, Lio/flutter/view/k;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Lio/flutter/view/k;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    :goto_1
    invoke-virtual {p2, v5}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :sswitch_data_0
    .sparse-switch
        -0x43f42ffd -> :sswitch_4
        -0x26b86b97 -> :sswitch_3
        0x1bfa3 -> :sswitch_2
        0x5d154d8 -> :sswitch_1
        0x6ce9b27 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public u(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x1

    .line 2
    .line 3
    return-wide p1
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

.method public v(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
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

.method public w(Lm0/e;)V
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

.method public x()Lm2/Y;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm2/r;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm2/r;->f()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lm2/X;

    .line 10
    .line 11
    invoke-direct {v1}, Lm2/X;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lm2/Y;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Lm2/Y;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v2, Lm2/Y;->q:Lm2/X;

    .line 20
    .line 21
    return-object v2
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

.method public y()Lg0/a;
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

.method public z()Lm0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/c;

    .line 4
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
