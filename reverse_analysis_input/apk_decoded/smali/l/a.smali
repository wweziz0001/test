.class public final Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final l:F

.field public final m:I

.field public final n:I

.field public final o:Landroid/view/View;

.field public p:Lm/V;

.field public q:Lm/V;

.field public r:Z

.field public s:I

.field public final t:[I

.field public final synthetic u:I

.field public final synthetic v:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    iput-object v1, p0, Ll/a;->t:[I

    .line 3
    iput-object p1, p0, Ll/a;->o:Landroid/view/View;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 5
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Ll/a;->l:F

    .line 7
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result p1

    iput p1, p0, Ll/a;->m:I

    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    add-int/2addr v1, p1

    div-int/2addr v1, v0

    iput v1, p0, Ll/a;->n:I

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/a;->u:I

    .line 9
    iput-object p1, p0, Ll/a;->v:Landroid/view/View;

    .line 10
    invoke-direct {p0, p1}, Ll/a;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lm/h;Lm/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/a;->u:I

    .line 11
    iput-object p1, p0, Ll/a;->v:Landroid/view/View;

    invoke-direct {p0, p2}, Ll/a;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll/a;->q:Lm/V;

    .line 2
    .line 3
    iget-object v1, p0, Ll/a;->o:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ll/a;->p:Lm/V;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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

.method public final b()Ll/j;
    .locals 2

    .line 1
    iget v0, p0, Ll/a;->u:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll/a;->v:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lm/h;

    .line 9
    .line 10
    iget-object v0, v0, Lm/h;->o:Lm/i;

    .line 11
    .line 12
    iget-object v0, v0, Lm/i;->C:Lm/f;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ll/m;->a()Ll/j;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, Ll/a;->v:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 26
    .line 27
    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->x:Ll/b;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast v0, Lm/g;

    .line 33
    .line 34
    iget-object v0, v0, Lm/g;->a:Lm/i;

    .line 35
    .line 36
    iget-object v0, v0, Lm/i;->D:Lm/f;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ll/m;->a()Ll/j;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    return-object v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget v0, p0, Ll/a;->u:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll/a;->v:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lm/h;

    .line 9
    .line 10
    iget-object v0, v0, Lm/h;->o:Lm/i;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm/i;->h()Z

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/a;->v:Landroid/view/View;

    .line 18
    .line 19
    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 20
    .line 21
    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->v:Ll/g;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->s:Ll/i;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ll/g;->a(Ll/i;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ll/a;->b()Ll/j;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ll/q;->g()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    :cond_0
    return v2

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 50
    .line 51
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    iget-boolean p1, p0, Ll/a;->r:Z

    .line 2
    .line 3
    iget-object v0, p0, Ll/a;->o:Landroid/view/View;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz p1, :cond_7

    .line 9
    .line 10
    invoke-virtual {p0}, Ll/a;->b()Ll/j;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-eqz v4, :cond_3

    .line 15
    .line 16
    invoke-interface {v4}, Ll/q;->g()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-interface {v4}, Ll/q;->h()Landroid/widget/ListView;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lm/T;

    .line 28
    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p2}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v6, p0, Ll/a;->t:[I

    .line 43
    .line 44
    invoke-virtual {v0, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 45
    .line 46
    .line 47
    aget v0, v6, v3

    .line 48
    .line 49
    int-to-float v0, v0

    .line 50
    aget v7, v6, v2

    .line 51
    .line 52
    int-to-float v7, v7

    .line 53
    invoke-virtual {v5, v0, v7}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 57
    .line 58
    .line 59
    aget v0, v6, v3

    .line 60
    .line 61
    neg-int v0, v0

    .line 62
    int-to-float v0, v0

    .line 63
    aget v6, v6, v2

    .line 64
    .line 65
    neg-int v6, v6

    .line 66
    int-to-float v6, v6

    .line 67
    invoke-virtual {v5, v0, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 68
    .line 69
    .line 70
    iget v0, p0, Ll/a;->s:I

    .line 71
    .line 72
    invoke-virtual {v4, v0, v5}, Lm/T;->b(ILandroid/view/MotionEvent;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eq p2, v2, :cond_2

    .line 84
    .line 85
    if-eq p2, v1, :cond_2

    .line 86
    .line 87
    move p2, v2

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move p2, v3

    .line 90
    :goto_0
    if-eqz v0, :cond_3

    .line 91
    .line 92
    if-eqz p2, :cond_3

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_3
    :goto_1
    iget p2, p0, Ll/a;->u:I

    .line 96
    .line 97
    packed-switch p2, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ll/a;->b()Ll/j;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    invoke-interface {p2}, Ll/q;->g()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    invoke-interface {p2}, Ll/q;->dismiss()V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_2
    const/4 p2, 0x1

    .line 116
    goto :goto_3

    .line 117
    :pswitch_0
    iget-object p2, p0, Ll/a;->v:Landroid/view/View;

    .line 118
    .line 119
    check-cast p2, Lm/h;

    .line 120
    .line 121
    iget-object p2, p2, Lm/h;->o:Lm/i;

    .line 122
    .line 123
    iget-object v0, p2, Lm/i;->E:LA/a;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    const/4 p2, 0x0

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-virtual {p2}, Lm/i;->g()Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :goto_3
    if-nez p2, :cond_6

    .line 134
    .line 135
    :goto_4
    move p2, v2

    .line 136
    goto/16 :goto_7

    .line 137
    .line 138
    :cond_6
    move p2, v3

    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_8

    .line 146
    .line 147
    goto/16 :goto_5

    .line 148
    .line 149
    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_c

    .line 154
    .line 155
    if-eq v4, v2, :cond_b

    .line 156
    .line 157
    const/4 v5, 0x2

    .line 158
    if-eq v4, v5, :cond_9

    .line 159
    .line 160
    if-eq v4, v1, :cond_b

    .line 161
    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_9
    iget v1, p0, Ll/a;->s:I

    .line 165
    .line 166
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-ltz v1, :cond_f

    .line 171
    .line 172
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    iget v1, p0, Ll/a;->l:F

    .line 181
    .line 182
    neg-float v5, v1

    .line 183
    cmpl-float v6, v4, v5

    .line 184
    .line 185
    if-ltz v6, :cond_a

    .line 186
    .line 187
    cmpl-float v5, p2, v5

    .line 188
    .line 189
    if-ltz v5, :cond_a

    .line 190
    .line 191
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    sub-int/2addr v5, v6

    .line 200
    int-to-float v5, v5

    .line 201
    add-float/2addr v5, v1

    .line 202
    cmpg-float v4, v4, v5

    .line 203
    .line 204
    if-gez v4, :cond_a

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    sub-int/2addr v4, v5

    .line 215
    int-to-float v4, v4

    .line 216
    add-float/2addr v4, v1

    .line 217
    cmpg-float p2, p2, v4

    .line 218
    .line 219
    if-gez p2, :cond_a

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    invoke-virtual {p0}, Ll/a;->a()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-interface {p2, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Ll/a;->c()Z

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    if-eqz p2, :cond_f

    .line 237
    .line 238
    move p2, v2

    .line 239
    goto :goto_6

    .line 240
    :cond_b
    invoke-virtual {p0}, Ll/a;->a()V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_c
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    iput p2, p0, Ll/a;->s:I

    .line 249
    .line 250
    iget-object p2, p0, Ll/a;->p:Lm/V;

    .line 251
    .line 252
    if-nez p2, :cond_d

    .line 253
    .line 254
    new-instance p2, Lm/V;

    .line 255
    .line 256
    const/4 v1, 0x0

    .line 257
    invoke-direct {p2, p0, v1}, Lm/V;-><init>(Ll/a;I)V

    .line 258
    .line 259
    .line 260
    iput-object p2, p0, Ll/a;->p:Lm/V;

    .line 261
    .line 262
    :cond_d
    iget-object p2, p0, Ll/a;->p:Lm/V;

    .line 263
    .line 264
    iget v1, p0, Ll/a;->m:I

    .line 265
    .line 266
    int-to-long v4, v1

    .line 267
    invoke-virtual {v0, p2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 268
    .line 269
    .line 270
    iget-object p2, p0, Ll/a;->q:Lm/V;

    .line 271
    .line 272
    if-nez p2, :cond_e

    .line 273
    .line 274
    new-instance p2, Lm/V;

    .line 275
    .line 276
    const/4 v1, 0x1

    .line 277
    invoke-direct {p2, p0, v1}, Lm/V;-><init>(Ll/a;I)V

    .line 278
    .line 279
    .line 280
    iput-object p2, p0, Ll/a;->q:Lm/V;

    .line 281
    .line 282
    :cond_e
    iget-object p2, p0, Ll/a;->q:Lm/V;

    .line 283
    .line 284
    iget v1, p0, Ll/a;->n:I

    .line 285
    .line 286
    int-to-long v4, v1

    .line 287
    invoke-virtual {v0, p2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 288
    .line 289
    .line 290
    :cond_f
    :goto_5
    move p2, v3

    .line 291
    :goto_6
    if-eqz p2, :cond_10

    .line 292
    .line 293
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 294
    .line 295
    .line 296
    move-result-wide v6

    .line 297
    const/4 v8, 0x3

    .line 298
    const/4 v9, 0x0

    .line 299
    const/4 v10, 0x0

    .line 300
    const/4 v11, 0x0

    .line 301
    move-wide v4, v6

    .line 302
    invoke-static/range {v4 .. v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 310
    .line 311
    .line 312
    :cond_10
    :goto_7
    iput-boolean p2, p0, Ll/a;->r:Z

    .line 313
    .line 314
    if-nez p2, :cond_12

    .line 315
    .line 316
    if-eqz p1, :cond_11

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_11
    move v2, v3

    .line 320
    :cond_12
    :goto_8
    return v2

    .line 321
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
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

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ll/a;->r:Z

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Ll/a;->s:I

    .line 6
    .line 7
    iget-object p1, p0, Ll/a;->p:Lm/V;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ll/a;->o:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
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
.end method
