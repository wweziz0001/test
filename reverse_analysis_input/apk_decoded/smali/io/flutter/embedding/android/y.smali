.class public final Lio/flutter/embedding/android/y;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/n;


# instance fields
.field public l:Z

.field public m:Z

.field public n:Lio/flutter/embedding/engine/renderer/l;

.field public final o:Lio/flutter/embedding/android/V;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lio/flutter/embedding/android/y;->l:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lio/flutter/embedding/android/y;->m:Z

    .line 9
    .line 10
    new-instance p1, Lio/flutter/embedding/android/x;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p1, p0, v0}, Lio/flutter/embedding/android/x;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lio/flutter/embedding/android/V;

    .line 17
    .line 18
    iget-object v1, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0, v1}, Lio/flutter/embedding/android/V;-><init>(Lio/flutter/embedding/android/x;Lio/flutter/embedding/android/y;Lio/flutter/embedding/engine/renderer/l;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lio/flutter/embedding/android/y;->o:Lio/flutter/embedding/android/V;

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 p2, -0x2

    .line 32
    invoke-interface {p1, p2}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    invoke-virtual {p0, p1}, Landroid/view/SurfaceView;->setZOrderOnTop(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 44
    .line 45
    .line 46
    return-void
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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "FlutterSurfaceView"

    .line 6
    .line 7
    const-string v1, "pause() invoked when no FlutterRenderer was attached."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lio/flutter/embedding/android/y;->m:Z

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
.end method

.method public final b(Lio/flutter/embedding/engine/renderer/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/l;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 9
    .line 10
    iget-object v0, p0, Lio/flutter/embedding/android/y;->o:Lio/flutter/embedding/android/V;

    .line 11
    .line 12
    iget-object v0, v0, Lio/flutter/embedding/android/V;->p:Lio/flutter/embedding/android/U;

    .line 13
    .line 14
    iget v1, v0, Lio/flutter/embedding/android/U;->a:I

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lio/flutter/embedding/android/U;->b:Lio/flutter/embedding/android/V;

    .line 20
    .line 21
    iget-object v1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v2, v0, Lio/flutter/embedding/android/V;->o:Lio/flutter/embedding/android/h;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/renderer/l;->g(Lio/flutter/embedding/engine/renderer/m;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iput-object p1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_0
    iget-object v0, v0, Lio/flutter/embedding/android/U;->b:Lio/flutter/embedding/android/V;

    .line 34
    .line 35
    iput-object p1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/y;->d()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/l;->h()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null."

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/android/y;->o:Lio/flutter/embedding/android/V;

    .line 28
    .line 29
    iget-object v0, v0, Lio/flutter/embedding/android/V;->p:Lio/flutter/embedding/android/U;

    .line 30
    .line 31
    iget v1, v0, Lio/flutter/embedding/android/U;->a:I

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lio/flutter/embedding/android/U;->b:Lio/flutter/embedding/android/V;

    .line 37
    .line 38
    iget-object v1, v0, Lio/flutter/embedding/android/V;->l:Lio/flutter/embedding/android/y;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v2, v0, Lio/flutter/embedding/android/V;->o:Lio/flutter/embedding/android/h;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/renderer/l;->g(Lio/flutter/embedding/engine/renderer/m;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    const/4 v1, 0x0

    .line 54
    iput-object v1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_0
    iget-object v0, v0, Lio/flutter/embedding/android/U;->b:Lio/flutter/embedding/android/V;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    iput-object v1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 61
    .line 62
    :goto_1
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const-string v0, "FlutterSurfaceView"

    .line 67
    .line 68
    const-string v1, "detachFromRenderer() invoked when no FlutterRenderer was attached."

    .line 69
    .line 70
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    :goto_2
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "FlutterSurfaceView"

    .line 6
    .line 7
    const-string v1, "resume() invoked when no FlutterRenderer was attached."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/y;->o:Lio/flutter/embedding/android/V;

    .line 14
    .line 15
    iget-object v0, v0, Lio/flutter/embedding/android/V;->p:Lio/flutter/embedding/android/U;

    .line 16
    .line 17
    iget v1, v0, Lio/flutter/embedding/android/U;->a:I

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lio/flutter/embedding/android/U;->b:Lio/flutter/embedding/android/V;

    .line 23
    .line 24
    iget-object v1, v0, Lio/flutter/embedding/android/V;->m:Lio/flutter/embedding/engine/renderer/l;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lio/flutter/embedding/android/V;->o:Lio/flutter/embedding/android/h;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/renderer/l;->a(Lio/flutter/embedding/engine/renderer/m;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :pswitch_0
    iget-boolean v0, p0, Lio/flutter/embedding/android/y;->l:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lio/flutter/embedding/android/y;->e()V

    .line 38
    .line 39
    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lio/flutter/embedding/android/y;->m:Z

    .line 42
    .line 43
    return-void

    .line 44
    nop

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

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-boolean v2, p0, Lio/flutter/embedding/android/y;->m:Z

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/l;->h()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v1, v0, Lio/flutter/embedding/engine/renderer/l;->c:Landroid/view/Surface;

    .line 29
    .line 30
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->onSurfaceWindowChanged(Landroid/view/Surface;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->onSurfaceCreated(Landroid/view/Surface;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
    .line 50
    .line 51
.end method

.method public final gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 17
    .line 18
    .line 19
    aget v3, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    aget v4, v0, v1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v3

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    sub-int v5, v2, v5

    .line 34
    .line 35
    aget v0, v0, v1

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v0

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sub-int v6, v2, v0

    .line 47
    .line 48
    sget-object v7, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 49
    .line 50
    move-object v2, p1

    .line 51
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 52
    .line 53
    .line 54
    return v1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public getAttachedRenderer()Lio/flutter/embedding/engine/renderer/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/engine/renderer/l;

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
