.class public final Lio/flutter/embedding/engine/renderer/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;
.implements Lio/flutter/view/o;


# instance fields
.field public final a:J

.field public final b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

.field public c:Z

.field public d:Lio/flutter/view/o;

.field public final synthetic e:Lio/flutter/embedding/engine/renderer/l;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/renderer/l;JLandroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/i;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 7
    .line 8
    new-instance p1, Lio/flutter/embedding/engine/renderer/d;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p0, p2}, Lio/flutter/embedding/engine/renderer/d;-><init>(Lio/flutter/view/o;I)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 15
    .line 16
    invoke-direct {p2, p4, p1}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;-><init>(Landroid/graphics/SurfaceTexture;Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lio/flutter/embedding/engine/renderer/i;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 20
    .line 21
    new-instance p1, Lio/flutter/embedding/engine/renderer/h;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lio/flutter/embedding/engine/renderer/h;-><init>(Lio/flutter/embedding/engine/renderer/i;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance p3, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 36
    .line 37
    .line 38
    return-void
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


# virtual methods
.method public final finalize()V
    .locals 5

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lio/flutter/embedding/engine/renderer/i;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/i;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 10
    .line 11
    iget-object v1, v0, Lio/flutter/embedding/engine/renderer/l;->e:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v2, Lio/flutter/embedding/engine/renderer/j;

    .line 14
    .line 15
    iget-wide v3, p0, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 16
    .line 17
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 18
    .line 19
    invoke-direct {v2, v3, v4, v0}, Lio/flutter/embedding/engine/renderer/j;-><init>(JLio/flutter/embedding/engine/FlutterJNI;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 31
    .line 32
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

.method public final id()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/flutter/embedding/engine/renderer/i;->a:J

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

.method public final onTrimMemory(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/i;->d:Lio/flutter/view/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/flutter/view/o;->onTrimMemory(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
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

.method public final release()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/flutter/embedding/engine/renderer/i;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/i;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->release()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/i;->e:Lio/flutter/embedding/engine/renderer/l;

    .line 12
    .line 13
    iget-object v1, v0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 14
    .line 15
    iget-wide v2, p0, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Lio/flutter/embedding/engine/FlutterJNI;->unregisterTexture(J)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/l;->f:Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-ne v3, p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lio/flutter/embedding/engine/renderer/i;->c:Z

    .line 49
    .line 50
    return-void
    .line 51
.end method

.method public final setOnFrameConsumedListener(Lio/flutter/view/n;)V
    .locals 0

    return-void
.end method

.method public final setOnTrimMemoryListener(Lio/flutter/view/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/i;->d:Lio/flutter/view/o;

    .line 2
    .line 3
    return-void
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

.method public final surfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/i;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
