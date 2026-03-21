.class public final Lr1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public l:I

.field public m:I

.field public n:Landroid/widget/OverScroller;

.field public o:Landroid/view/animation/Interpolator;

.field public p:Z

.field public q:Z

.field public final synthetic r:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr1/C;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lr1/m;

    .line 7
    .line 8
    iput-object v0, p0, Lr1/C;->o:Landroid/view/animation/Interpolator;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lr1/C;->p:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Lr1/C;->q:Z

    .line 14
    .line 15
    new-instance v1, Landroid/widget/OverScroller;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lr1/C;->n:Landroid/widget/OverScroller;

    .line 25
    .line 26
    return-void
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
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr1/C;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lr1/C;->q:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lr1/C;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    sget-object v1, LD/I;->a:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
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

.method public final run()V
    .locals 14

    .line 1
    iget-object v0, p0, Lr1/C;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Lr1/s;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lr1/C;->n:Landroid/widget/OverScroller;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lr1/C;->q:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput-boolean v2, p0, Lr1/C;->p:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Lr1/C;->n:Landroid/widget/OverScroller;

    .line 26
    .line 27
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Lr1/s;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_c

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget v6, p0, Lr1/C;->l:I

    .line 47
    .line 48
    sub-int v6, v4, v6

    .line 49
    .line 50
    iget v7, p0, Lr1/C;->m:I

    .line 51
    .line 52
    sub-int v13, v5, v7

    .line 53
    .line 54
    iput v4, p0, Lr1/C;->l:I

    .line 55
    .line 56
    iput v5, p0, Lr1/C;->m:I

    .line 57
    .line 58
    const/4 v10, 0x1

    .line 59
    iget-object v7, p0, Lr1/C;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:[I

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move v8, v6

    .line 65
    move v9, v13

    .line 66
    move-object v11, v4

    .line 67
    invoke-virtual/range {v7 .. v12}, Landroidx/recyclerview/widget/RecyclerView;->f(III[I[I)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    aget v5, v4, v1

    .line 74
    .line 75
    sub-int/2addr v6, v5

    .line 76
    aget v4, v4, v2

    .line 77
    .line 78
    sub-int/2addr v13, v4

    .line 79
    :cond_1
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->u:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    const/4 v5, 0x2

    .line 95
    if-eq v4, v5, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0, v6, v13}, Landroidx/recyclerview/widget/RecyclerView;->c(II)V

    .line 98
    .line 99
    .line 100
    :cond_3
    const/4 v4, 0x0

    .line 101
    invoke-virtual {v0, v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->g([II)Z

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 111
    .line 112
    .line 113
    :cond_4
    if-eqz v13, :cond_5

    .line 114
    .line 115
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Lr1/s;

    .line 116
    .line 117
    invoke-virtual {v4}, Lr1/s;->c()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_5

    .line 122
    .line 123
    if-nez v13, :cond_5

    .line 124
    .line 125
    move v4, v2

    .line 126
    goto :goto_0

    .line 127
    :cond_5
    move v4, v1

    .line 128
    :goto_0
    if-eqz v6, :cond_6

    .line 129
    .line 130
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Lr1/s;

    .line 131
    .line 132
    invoke-virtual {v5}, Lr1/s;->b()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_6

    .line 137
    .line 138
    if-nez v6, :cond_6

    .line 139
    .line 140
    move v5, v2

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    move v5, v1

    .line 143
    :goto_1
    if-nez v6, :cond_7

    .line 144
    .line 145
    if-eqz v13, :cond_9

    .line 146
    .line 147
    :cond_7
    if-nez v5, :cond_9

    .line 148
    .line 149
    if-eqz v4, :cond_8

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_8
    move v4, v1

    .line 153
    goto :goto_3

    .line 154
    :cond_9
    :goto_2
    move v4, v2

    .line 155
    :goto_3
    invoke-virtual {v3}, Landroid/widget/OverScroller;->isFinished()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_b

    .line 160
    .line 161
    if-nez v4, :cond_a

    .line 162
    .line 163
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->k()Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    invoke-virtual {p0}, Lr1/C;->a()V

    .line 171
    .line 172
    .line 173
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:Lr1/h;

    .line 174
    .line 175
    if-eqz v2, :cond_c

    .line 176
    .line 177
    invoke-virtual {v2, v0, v6, v13}, Lr1/h;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_b
    :goto_4
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 182
    .line 183
    .line 184
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:LD0/e;

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iput v1, v3, LD0/e;->c:I

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->s(I)V

    .line 192
    .line 193
    .line 194
    :cond_c
    :goto_5
    iput-boolean v1, p0, Lr1/C;->p:Z

    .line 195
    .line 196
    iget-boolean v0, p0, Lr1/C;->q:Z

    .line 197
    .line 198
    if-eqz v0, :cond_d

    .line 199
    .line 200
    invoke-virtual {p0}, Lr1/C;->a()V

    .line 201
    .line 202
    .line 203
    :cond_d
    return-void
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
