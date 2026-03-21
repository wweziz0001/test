.class public final LD/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:LD/b;


# direct methods
.method public constructor <init>(LD/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/a;->a:LD/b;

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
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 2

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v1, LB0/d;

    .line 13
    .line 14
    invoke-direct {v1, p1}, LB0/d;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v0

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object p1, v1, LB0/d;->l:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 25
    .line 26
    :cond_1
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

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LD/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

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

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-instance v3, LE/j;

    .line 7
    .line 8
    invoke-direct {v3, v1}, LE/j;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 9
    .line 10
    .line 11
    sget-object v4, LD/I;->a:Ljava/lang/reflect/Field;

    .line 12
    .line 13
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v5, 0x1c

    .line 16
    .line 17
    const-class v7, Ljava/lang/Boolean;

    .line 18
    .line 19
    if-lt v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, LD/D;->d(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v8, 0x7f0800c6

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v8, 0x0

    .line 45
    :goto_0
    check-cast v8, Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    if-eqz v8, :cond_2

    .line 49
    .line 50
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    move v8, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v8, v9

    .line 59
    :goto_1
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 60
    .line 61
    if-lt v4, v5, :cond_3

    .line 62
    .line 63
    invoke-static {v1, v8}, LB/b;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    if-eqz v11, :cond_4

    .line 72
    .line 73
    invoke-virtual {v11, v10, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    and-int/lit8 v12, v12, -0x2

    .line 78
    .line 79
    or-int/2addr v8, v12

    .line 80
    invoke-virtual {v11, v10, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_2
    if-lt v4, v5, :cond_5

    .line 84
    .line 85
    invoke-static/range {p1 .. p1}, LD/D;->c(Landroid/view/View;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    const v8, 0x7f0800c1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_6

    .line 106
    .line 107
    move-object v7, v8

    .line 108
    goto :goto_3

    .line 109
    :cond_6
    const/4 v7, 0x0

    .line 110
    :goto_3
    check-cast v7, Ljava/lang/Boolean;

    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_7

    .line 119
    .line 120
    move v7, v2

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v7, v9

    .line 123
    :goto_4
    if-lt v4, v5, :cond_8

    .line 124
    .line 125
    invoke-static {v1, v7}, LB/b;->z(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    if-eqz v8, :cond_a

    .line 134
    .line 135
    invoke-virtual {v8, v10, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    and-int/lit8 v11, v11, -0x3

    .line 140
    .line 141
    if-eqz v7, :cond_9

    .line 142
    .line 143
    const/4 v7, 0x2

    .line 144
    goto :goto_5

    .line 145
    :cond_9
    move v7, v9

    .line 146
    :goto_5
    or-int/2addr v7, v11

    .line 147
    invoke-virtual {v8, v10, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    :cond_a
    :goto_6
    const-class v7, Ljava/lang/CharSequence;

    .line 151
    .line 152
    if-lt v4, v5, :cond_b

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, LD/D;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    goto :goto_7

    .line 159
    :cond_b
    const v8, 0x7f0800c2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-eqz v10, :cond_c

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_c
    const/4 v8, 0x0

    .line 174
    :goto_7
    check-cast v8, Ljava/lang/CharSequence;

    .line 175
    .line 176
    if-lt v4, v5, :cond_d

    .line 177
    .line 178
    invoke-static {v1, v8}, LB/b;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_d
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 187
    .line 188
    invoke-virtual {v5, v10, v8}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    :goto_8
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 192
    .line 193
    const/16 v8, 0x1e

    .line 194
    .line 195
    if-lt v5, v8, :cond_e

    .line 196
    .line 197
    invoke-static/range {p1 .. p1}, LD/F;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    goto :goto_9

    .line 202
    :cond_e
    const v5, 0x7f0800c7

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v7, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-eqz v7, :cond_f

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_f
    const/4 v5, 0x0

    .line 217
    :goto_9
    check-cast v5, Ljava/lang/CharSequence;

    .line 218
    .line 219
    if-lt v4, v8, :cond_10

    .line 220
    .line 221
    invoke-static {v1, v5}, LE/d;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    :goto_a
    move-object/from16 v5, p0

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_10
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 232
    .line 233
    invoke-virtual {v7, v8, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 234
    .line 235
    .line 236
    goto :goto_a

    .line 237
    :goto_b
    iget-object v7, v5, LD/a;->a:LD/b;

    .line 238
    .line 239
    invoke-virtual {v7, v0, v3}, LD/b;->b(Landroid/view/View;LE/j;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    const/16 v8, 0x1a

    .line 247
    .line 248
    if-ge v4, v8, :cond_18

    .line 249
    .line 250
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 255
    .line 256
    invoke-virtual {v4, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 264
    .line 265
    invoke-virtual {v4, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 273
    .line 274
    invoke-virtual {v4, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 282
    .line 283
    invoke-virtual {v4, v12}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const v4, 0x7f0800c0

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    check-cast v13, Landroid/util/SparseArray;

    .line 294
    .line 295
    if-eqz v13, :cond_13

    .line 296
    .line 297
    new-instance v14, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 300
    .line 301
    .line 302
    move v15, v9

    .line 303
    :goto_c
    invoke-virtual {v13}, Landroid/util/SparseArray;->size()I

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    if-ge v15, v6, :cond_12

    .line 308
    .line 309
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    if-nez v6, :cond_11

    .line 320
    .line 321
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    :cond_11
    add-int/2addr v15, v2

    .line 329
    goto :goto_c

    .line 330
    :cond_12
    move v6, v9

    .line 331
    :goto_d
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-ge v6, v15, :cond_13

    .line 336
    .line 337
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    check-cast v15, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v15

    .line 347
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->remove(I)V

    .line 348
    .line 349
    .line 350
    add-int/2addr v6, v2

    .line 351
    goto :goto_d

    .line 352
    :cond_13
    instance-of v6, v7, Landroid/text/Spanned;

    .line 353
    .line 354
    if-eqz v6, :cond_14

    .line 355
    .line 356
    move-object v6, v7

    .line 357
    check-cast v6, Landroid/text/Spanned;

    .line 358
    .line 359
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    const-class v14, Landroid/text/style/ClickableSpan;

    .line 364
    .line 365
    invoke-interface {v6, v9, v13, v14}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    check-cast v6, [Landroid/text/style/ClickableSpan;

    .line 370
    .line 371
    goto :goto_e

    .line 372
    :cond_14
    const/4 v6, 0x0

    .line 373
    :goto_e
    if-eqz v6, :cond_18

    .line 374
    .line 375
    array-length v13, v6

    .line 376
    if-lez v13, :cond_18

    .line 377
    .line 378
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    const-string v13, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 383
    .line 384
    const v14, 0x7f080006

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    check-cast v1, Landroid/util/SparseArray;

    .line 395
    .line 396
    if-nez v1, :cond_15

    .line 397
    .line 398
    new-instance v1, Landroid/util/SparseArray;

    .line 399
    .line 400
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v4, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_15
    move v4, v9

    .line 407
    :goto_f
    array-length v13, v6

    .line 408
    if-ge v4, v13, :cond_18

    .line 409
    .line 410
    aget-object v13, v6, v4

    .line 411
    .line 412
    move v14, v9

    .line 413
    :goto_10
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 414
    .line 415
    .line 416
    move-result v15

    .line 417
    if-ge v14, v15, :cond_17

    .line 418
    .line 419
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v15

    .line 423
    check-cast v15, Ljava/lang/ref/WeakReference;

    .line 424
    .line 425
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    check-cast v15, Landroid/text/style/ClickableSpan;

    .line 430
    .line 431
    invoke-virtual {v13, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v15

    .line 435
    if-eqz v15, :cond_16

    .line 436
    .line 437
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->keyAt(I)I

    .line 438
    .line 439
    .line 440
    move-result v13

    .line 441
    goto :goto_11

    .line 442
    :cond_16
    add-int/2addr v14, v2

    .line 443
    goto :goto_10

    .line 444
    :cond_17
    sget v13, LE/j;->b:I

    .line 445
    .line 446
    add-int/lit8 v14, v13, 0x1

    .line 447
    .line 448
    sput v14, LE/j;->b:I

    .line 449
    .line 450
    :goto_11
    new-instance v14, Ljava/lang/ref/WeakReference;

    .line 451
    .line 452
    aget-object v15, v6, v4

    .line 453
    .line 454
    invoke-direct {v14, v15}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v13, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    aget-object v14, v6, v4

    .line 461
    .line 462
    move-object v15, v7

    .line 463
    check-cast v15, Landroid/text/Spanned;

    .line 464
    .line 465
    invoke-virtual {v3, v8}, LE/j;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 470
    .line 471
    .line 472
    move-result v16

    .line 473
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3, v10}, LE/j;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    invoke-virtual {v3, v11}, LE/j;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-interface {v15, v14}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    invoke-virtual {v3, v12}, LE/j;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    const/4 v2, 0x1

    .line 522
    add-int/2addr v4, v2

    .line 523
    const/4 v9, 0x0

    .line 524
    goto :goto_f

    .line 525
    :cond_18
    const v1, 0x7f0800bf

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, Ljava/util/List;

    .line 533
    .line 534
    if-nez v0, :cond_19

    .line 535
    .line 536
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    :cond_19
    const/4 v9, 0x0

    .line 541
    :goto_12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    if-ge v9, v1, :cond_1a

    .line 546
    .line 547
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, LE/c;

    .line 552
    .line 553
    iget-object v1, v1, LE/c;->a:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 556
    .line 557
    iget-object v2, v3, LE/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 558
    .line 559
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 560
    .line 561
    .line 562
    const/4 v1, 0x1

    .line 563
    add-int/2addr v9, v1

    .line 564
    goto :goto_12

    .line 565
    :cond_1a
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

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

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LD/b;->c(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

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

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

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
