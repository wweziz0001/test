.class public final Lio/flutter/embedding/android/D;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lp3/a;
.implements Lio/flutter/embedding/android/M;


# instance fields
.field public A:Lio/flutter/view/k;

.field public B:Landroid/view/textservice/TextServicesManager;

.field public C:Landroidx/lifecycle/E;

.field public final D:Lio/flutter/embedding/engine/renderer/k;

.field public final E:Landroidx/lifecycle/E;

.field public final F:LJ/a;

.field public final G:Lio/flutter/embedding/android/h;

.field public H:LK1/i;

.field public I:Lio/flutter/embedding/android/F;

.field public final l:Lio/flutter/embedding/android/y;

.field public final m:Lio/flutter/embedding/android/A;

.field public n:Lio/flutter/embedding/android/w;

.field public o:Landroid/view/View;

.field public p:Landroid/view/View;

.field public final q:Ljava/util/HashSet;

.field public r:Z

.field public s:Le3/c;

.field public final t:Ljava/util/HashSet;

.field public u:LZ1/c;

.field public v:Lio/flutter/plugin/editing/i;

.field public w:Lio/flutter/plugin/editing/g;

.field public x:Lo3/a;

.field public y:LZ1/m;

.field public z:Lio/flutter/embedding/android/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/android/A;)V
    .locals 2

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->q:Ljava/util/HashSet;

    .line 17
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->t:Ljava/util/HashSet;

    .line 18
    new-instance p1, Lio/flutter/embedding/engine/renderer/k;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/k;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 19
    new-instance p1, Landroidx/lifecycle/E;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->E:Landroidx/lifecycle/E;

    .line 20
    new-instance p1, LJ/a;

    new-instance v0, Landroid/os/Handler;

    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, LJ/a;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->F:LJ/a;

    .line 22
    new-instance p1, Lio/flutter/embedding/android/h;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lio/flutter/embedding/android/h;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->G:Lio/flutter/embedding/android/h;

    .line 23
    new-instance p1, Lio/flutter/embedding/android/F;

    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lio/flutter/embedding/android/D;->I:Lio/flutter/embedding/android/F;

    .line 26
    iput-object p2, p0, Lio/flutter/embedding/android/D;->m:Lio/flutter/embedding/android/A;

    .line 27
    iput-object p2, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 28
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->b()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/android/y;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->q:Ljava/util/HashSet;

    .line 3
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->t:Ljava/util/HashSet;

    .line 4
    new-instance p1, Lio/flutter/embedding/engine/renderer/k;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/k;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 5
    new-instance p1, Landroidx/lifecycle/E;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->E:Landroidx/lifecycle/E;

    .line 6
    new-instance p1, LJ/a;

    new-instance v0, Landroid/os/Handler;

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, LJ/a;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->F:LJ/a;

    .line 8
    new-instance p1, Lio/flutter/embedding/android/h;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lio/flutter/embedding/android/h;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/flutter/embedding/android/D;->G:Lio/flutter/embedding/android/h;

    .line 9
    new-instance p1, Lio/flutter/embedding/android/F;

    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lio/flutter/embedding/android/D;->I:Lio/flutter/embedding/android/F;

    .line 12
    iput-object p2, p0, Lio/flutter/embedding/android/D;->l:Lio/flutter/embedding/android/y;

    .line 13
    iput-object p2, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 14
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/D;->t:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_e

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lio/flutter/embedding/android/D;->F:LJ/a;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 39
    .line 40
    iget-object v0, v0, Le3/c;->s:Lio/flutter/plugin/platform/p;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v2, v1

    .line 44
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->o:Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-ge v2, v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lio/flutter/plugin/platform/i;

    .line 57
    .line 58
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->d:Lio/flutter/embedding/android/D;

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v2, v1

    .line 67
    :goto_1
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->m:Landroid/util/SparseArray;

    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ge v2, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Li3/b;

    .line 80
    .line 81
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->d:Lio/flutter/embedding/android/D;

    .line 82
    .line 83
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v0}, Lio/flutter/plugin/platform/p;->c()V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lio/flutter/plugin/platform/p;->d:Lio/flutter/embedding/android/D;

    .line 93
    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    const-string v2, "PlatformViewsController"

    .line 97
    .line 98
    const-string v3, "removeOverlaySurfaces called while flutter view is null"

    .line 99
    .line 100
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move v2, v1

    .line 105
    :goto_2
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->n:Landroid/util/SparseArray;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-ge v2, v4, :cond_4

    .line 112
    .line 113
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->d:Lio/flutter/embedding/android/D;

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Landroid/view/View;

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 128
    .line 129
    .line 130
    :goto_3
    const/4 v2, 0x0

    .line 131
    iput-object v2, v0, Lio/flutter/plugin/platform/p;->d:Lio/flutter/embedding/android/D;

    .line 132
    .line 133
    iput-boolean v1, v0, Lio/flutter/plugin/platform/p;->q:Z

    .line 134
    .line 135
    move v3, v1

    .line 136
    :goto_4
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->l:Landroid/util/SparseArray;

    .line 137
    .line 138
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-ge v3, v5, :cond_5

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lio/flutter/plugin/platform/g;

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_5
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 157
    .line 158
    iget-object v0, v0, Le3/c;->t:Lio/flutter/plugin/platform/o;

    .line 159
    .line 160
    move v3, v1

    .line 161
    :goto_5
    iget-object v4, v0, Lio/flutter/plugin/platform/o;->j:Landroid/util/SparseArray;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-ge v3, v5, :cond_6

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Li3/b;

    .line 174
    .line 175
    iget-object v5, v0, Lio/flutter/plugin/platform/o;->d:Lio/flutter/embedding/android/D;

    .line 176
    .line 177
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    iget-object v3, v0, Lio/flutter/plugin/platform/o;->n:Landroid/view/Surface;

    .line 184
    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 188
    .line 189
    .line 190
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->n:Landroid/view/Surface;

    .line 191
    .line 192
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->o:Landroid/view/SurfaceControl;

    .line 193
    .line 194
    :cond_7
    iput-object v2, v0, Lio/flutter/plugin/platform/o;->d:Lio/flutter/embedding/android/D;

    .line 195
    .line 196
    move v3, v1

    .line 197
    :goto_6
    iget-object v4, v0, Lio/flutter/plugin/platform/o;->i:Landroid/util/SparseArray;

    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-ge v3, v5, :cond_8

    .line 204
    .line 205
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Lio/flutter/plugin/platform/g;

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    add-int/lit8 v3, v3, 0x1

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_8
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 218
    .line 219
    iget-object v0, v0, Le3/c;->s:Lio/flutter/plugin/platform/p;

    .line 220
    .line 221
    invoke-virtual {v0}, Lio/flutter/plugin/platform/p;->d()V

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 225
    .line 226
    iget-object v0, v0, Le3/c;->t:Lio/flutter/plugin/platform/o;

    .line 227
    .line 228
    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->a()V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lio/flutter/embedding/android/D;->A:Lio/flutter/view/k;

    .line 232
    .line 233
    const/4 v3, 0x1

    .line 234
    iput-boolean v3, v0, Lio/flutter/view/k;->t:Z

    .line 235
    .line 236
    iget-object v3, v0, Lio/flutter/view/k;->e:LZ1/l;

    .line 237
    .line 238
    iget-object v4, v3, LZ1/l;->l:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v4, Lio/flutter/plugin/platform/p;

    .line 241
    .line 242
    invoke-virtual {v4}, Lio/flutter/plugin/platform/p;->d()V

    .line 243
    .line 244
    .line 245
    iget-object v3, v3, LZ1/l;->m:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 248
    .line 249
    invoke-virtual {v3}, Lio/flutter/plugin/platform/o;->a()V

    .line 250
    .line 251
    .line 252
    iput-object v2, v0, Lio/flutter/view/k;->r:Landroidx/lifecycle/E;

    .line 253
    .line 254
    iget-object v3, v0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 255
    .line 256
    iget-object v4, v0, Lio/flutter/view/k;->v:Lio/flutter/view/b;

    .line 257
    .line 258
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 259
    .line 260
    .line 261
    iget-object v4, v0, Lio/flutter/view/k;->w:Lio/flutter/view/c;

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 264
    .line 265
    .line 266
    iget-object v3, v0, Lio/flutter/view/k;->x:LJ/a;

    .line 267
    .line 268
    iget-object v4, v0, Lio/flutter/view/k;->f:Landroid/content/ContentResolver;

    .line 269
    .line 270
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, v0, Lio/flutter/view/k;->b:LZ1/m;

    .line 274
    .line 275
    iput-object v2, v0, LZ1/m;->o:Ljava/lang/Object;

    .line 276
    .line 277
    iget-object v0, v0, LZ1/m;->n:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 280
    .line 281
    invoke-virtual {v0, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Le3/i;)V

    .line 282
    .line 283
    .line 284
    iput-object v2, p0, Lio/flutter/embedding/android/D;->A:Lio/flutter/view/k;

    .line 285
    .line 286
    iget-object v0, p0, Lio/flutter/embedding/android/D;->v:Lio/flutter/plugin/editing/i;

    .line 287
    .line 288
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 289
    .line 290
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, p0, Lio/flutter/embedding/android/D;->v:Lio/flutter/plugin/editing/i;

    .line 294
    .line 295
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->c()V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Lio/flutter/embedding/android/D;->y:LZ1/m;

    .line 299
    .line 300
    iget-object v0, v0, LZ1/m;->n:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Ljava/util/HashSet;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-lez v0, :cond_9

    .line 309
    .line 310
    new-instance v3, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    const-string v4, "A KeyboardManager was destroyed with "

    .line 313
    .line 314
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v0, " unhandled redispatch event(s)."

    .line 325
    .line 326
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    const-string v3, "KeyboardManager"

    .line 334
    .line 335
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    :cond_9
    iget-object v0, p0, Lio/flutter/embedding/android/D;->w:Lio/flutter/plugin/editing/g;

    .line 339
    .line 340
    if-eqz v0, :cond_a

    .line 341
    .line 342
    iget-object v3, v0, Lio/flutter/plugin/editing/g;->a:Lm3/i;

    .line 343
    .line 344
    iput-object v2, v3, Lm3/i;->m:Ljava/lang/Object;

    .line 345
    .line 346
    iget-object v0, v0, Lio/flutter/plugin/editing/g;->c:Landroid/view/textservice/SpellCheckerSession;

    .line 347
    .line 348
    if-eqz v0, :cond_a

    .line 349
    .line 350
    invoke-virtual {v0}, Landroid/view/textservice/SpellCheckerSession;->close()V

    .line 351
    .line 352
    .line 353
    :cond_a
    iget-object v0, p0, Lio/flutter/embedding/android/D;->u:LZ1/c;

    .line 354
    .line 355
    if-eqz v0, :cond_b

    .line 356
    .line 357
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Landroidx/lifecycle/E;

    .line 360
    .line 361
    iput-object v2, v0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 362
    .line 363
    :cond_b
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 364
    .line 365
    iget-object v0, v0, Le3/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 366
    .line 367
    iput-boolean v1, p0, Lio/flutter/embedding/android/D;->r:Z

    .line 368
    .line 369
    iget-object v3, p0, Lio/flutter/embedding/android/D;->G:Lio/flutter/embedding/android/h;

    .line 370
    .line 371
    invoke-virtual {v0, v3}, Lio/flutter/embedding/engine/renderer/l;->g(Lio/flutter/embedding/engine/renderer/m;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/l;->h()V

    .line 375
    .line 376
    .line 377
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 378
    .line 379
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 380
    .line 381
    .line 382
    iget-object v0, p0, Lio/flutter/embedding/android/D;->p:Landroid/view/View;

    .line 383
    .line 384
    if-eqz v0, :cond_c

    .line 385
    .line 386
    iget-object v1, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 387
    .line 388
    iget-object v3, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

    .line 389
    .line 390
    if-ne v1, v3, :cond_c

    .line 391
    .line 392
    iput-object v0, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 393
    .line 394
    :cond_c
    iget-object v0, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 395
    .line 396
    invoke-interface {v0}, Lio/flutter/embedding/engine/renderer/n;->c()V

    .line 397
    .line 398
    .line 399
    iget-object v0, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

    .line 400
    .line 401
    if-eqz v0, :cond_d

    .line 402
    .line 403
    iget-object v0, v0, Lio/flutter/embedding/android/w;->l:Landroid/media/ImageReader;

    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 406
    .line 407
    .line 408
    iget-object v0, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

    .line 409
    .line 410
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 411
    .line 412
    .line 413
    iput-object v2, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

    .line 414
    .line 415
    :cond_d
    iput-object v2, p0, Lio/flutter/embedding/android/D;->p:Landroid/view/View;

    .line 416
    .line 417
    iput-object v2, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 418
    .line 419
    return-void

    .line 420
    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    new-instance v0, Ljava/lang/ClassCastException;

    .line 428
    .line 429
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 430
    .line 431
    .line 432
    throw v0
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
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lio/flutter/embedding/android/D;->v:Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v4, 0x1a

    .line 8
    .line 9
    if-ge v3, v4, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 17
    .line 18
    if-eqz v3, :cond_7

    .line 19
    .line 20
    iget-object v4, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 21
    .line 22
    if-eqz v4, :cond_7

    .line 23
    .line 24
    iget-object v3, v3, Lm3/m;->j:LZ1/i;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    move v5, v1

    .line 36
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-ge v5, v6, :cond_5

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lm3/m;

    .line 53
    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    iget-object v6, v6, Lm3/m;->j:LZ1/i;

    .line 57
    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7}, Lio/flutter/embedding/android/B;->b(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7}, Lio/flutter/embedding/android/B;->e(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    new-instance v7, Lm3/n;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    const/4 v12, -0x1

    .line 88
    const/4 v13, -0x1

    .line 89
    move-object v8, v7

    .line 90
    invoke-direct/range {v8 .. v13}, Lm3/n;-><init>(Ljava/lang/String;IIII)V

    .line 91
    .line 92
    .line 93
    iget-object v8, v3, LZ1/i;->l:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v8, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v6, v6, LZ1/i;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v6, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_3

    .line 106
    .line 107
    iget-object v6, v2, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 108
    .line 109
    invoke-virtual {v6, v7}, Lio/flutter/plugin/editing/f;->f(Lm3/n;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_1
    add-int/2addr v5, v0

    .line 117
    goto :goto_0

    .line 118
    :cond_5
    iget-object p1, v2, Lio/flutter/plugin/editing/i;->e:LD/o;

    .line 119
    .line 120
    iget p1, p1, LD/o;->c:I

    .line 121
    .line 122
    iget-object v2, v2, Lio/flutter/plugin/editing/i;->d:LZ1/e;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    new-instance v3, Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_6

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Ljava/util/Map$Entry;

    .line 158
    .line 159
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Lm3/n;

    .line 164
    .line 165
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Ljava/lang/String;

    .line 170
    .line 171
    iget-object v7, v6, Lm3/n;->a:Ljava/lang/String;

    .line 172
    .line 173
    const/4 v8, -0x1

    .line 174
    iget v9, v6, Lm3/n;->b:I

    .line 175
    .line 176
    iget v6, v6, Lm3/n;->c:I

    .line 177
    .line 178
    invoke-static {v7, v9, v6, v8, v8}, LZ1/e;->m(Ljava/lang/String;IIII)Ljava/util/HashMap;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const/4 v4, 0x2

    .line 191
    new-array v4, v4, [Ljava/io/Serializable;

    .line 192
    .line 193
    aput-object p1, v4, v1

    .line 194
    .line 195
    aput-object v3, v4, v0

    .line 196
    .line 197
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-string v0, "TextInputClient.updateEditingStateWithTag"

    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    iget-object v2, v2, LZ1/e;->m:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v2, Ln3/q;

    .line 207
    .line 208
    invoke-virtual {v2, v0, p1, v1}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    :goto_3
    return-void
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

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->l:Lio/flutter/embedding/android/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/D;->m:Lio/flutter/embedding/android/A;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 27
    .line 28
    .line 29
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v1, 0x1a

    .line 32
    .line 33
    if-lt v0, v1, :cond_2

    .line 34
    .line 35
    invoke-static {p0}, Lio/flutter/embedding/android/B;->r(Lio/flutter/embedding/android/D;)V

    .line 36
    .line 37
    .line 38
    :cond_2
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
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/n;->getAttachedRenderer()Lio/flutter/embedding/engine/renderer/l;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, v0, Le3/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
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

.method public final checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, v0, Le3/c;->s:Lio/flutter/plugin/platform/p;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->k:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/view/View;

    .line 36
    .line 37
    if-ne v0, p1, :cond_2

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/View;->checkInputConnectionProxy(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->checkInputConnectionProxy(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_0
    return v1
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

.method public final d()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x30

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    :goto_0
    iget-object v1, p0, Lio/flutter/embedding/android/D;->B:Landroid/view/textservice/TextServicesManager;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v5, 0x1f

    .line 29
    .line 30
    if-lt v4, v5, :cond_3

    .line 31
    .line 32
    invoke-static {v1}, Li0/g;->k(Landroid/view/textservice/TextServicesManager;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Landroid/view/textservice/SpellCheckerInfo;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/textservice/SpellCheckerInfo;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v5, "com.google.android.inputmethod.latin"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    move v1, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v1, v3

    .line 67
    :goto_1
    iget-object v4, p0, Lio/flutter/embedding/android/D;->B:Landroid/view/textservice/TextServicesManager;

    .line 68
    .line 69
    invoke-static {v4}, Li0/g;->w(Landroid/view/textservice/TextServicesManager;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    :cond_3
    move v1, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v1, v3

    .line 80
    :goto_2
    iget-object v4, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 81
    .line 82
    iget-object v4, v4, Le3/c;->o:Lm3/l;

    .line 83
    .line 84
    iget-object v4, v4, Lm3/l;->a:LZ1/i;

    .line 85
    .line 86
    new-instance v5, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget v6, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const-string v7, "textScaleFactor"

    .line 106
    .line 107
    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v8, "nativeSpellCheckServiceDefined"

    .line 123
    .line 124
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v8, "show_password"

    .line 136
    .line 137
    invoke-static {v1, v8, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-ne v1, v2, :cond_5

    .line 142
    .line 143
    move v1, v2

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v1, v3

    .line 146
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const-string v8, "brieflyShowPassword"

    .line 151
    .line 152
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const-string v8, "alwaysUse24HourFormat"

    .line 168
    .line 169
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    if-eq v0, v1, :cond_7

    .line 174
    .line 175
    const/4 v1, 0x2

    .line 176
    if-ne v0, v1, :cond_6

    .line 177
    .line 178
    const-string v0, "dark"

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_6
    const/4 v0, 0x0

    .line 182
    throw v0

    .line 183
    :cond_7
    const-string v0, "light"

    .line 184
    .line 185
    :goto_4
    const-string v1, "platformBrightness"

    .line 186
    .line 187
    invoke-virtual {v5, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 212
    .line 213
    const/16 v1, 0x22

    .line 214
    .line 215
    if-lt v0, v1, :cond_8

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_8
    move v2, v3

    .line 219
    :goto_5
    const/4 v0, 0x0

    .line 220
    if-eqz v2, :cond_b

    .line 221
    .line 222
    if-nez v6, :cond_9

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_9
    new-instance v1, Lm3/k;

    .line 226
    .line 227
    invoke-direct {v1, v6}, Lm3/k;-><init>(Landroid/util/DisplayMetrics;)V

    .line 228
    .line 229
    .line 230
    sget-object v2, Lm3/l;->b:LZ1/s;

    .line 231
    .line 232
    iget-object v3, v2, LZ1/s;->m:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 235
    .line 236
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    iget-object v3, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v3, Lm3/k;

    .line 242
    .line 243
    iput-object v1, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 244
    .line 245
    if-nez v3, :cond_a

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_a
    new-instance v0, LZ1/c;

    .line 249
    .line 250
    const/4 v6, 0x0

    .line 251
    invoke-direct {v0, v2, v3, v6}, LZ1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 252
    .line 253
    .line 254
    :goto_6
    iget v1, v1, Lm3/k;->a:I

    .line 255
    .line 256
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    const-string v2, "configurationId"

    .line 261
    .line 262
    invoke-virtual {v5, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v5, v0}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 266
    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_b
    :goto_7
    invoke-virtual {v4, v5, v0}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 270
    .line 271
    .line 272
    :goto_8
    return-void
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

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lio/flutter/embedding/android/D;->y:LZ1/m;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, LZ1/m;->w(Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/4 v1, 0x0

    .line 57
    :cond_4
    :goto_1
    return v1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final e()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "FlutterView"

    .line 10
    .line 11
    const-string v2, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine."

    .line 12
    .line 13
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 26
    .line 27
    iget-object v2, v0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 28
    .line 29
    iput v1, v2, Lio/flutter/embedding/engine/renderer/k;->a:F

    .line 30
    .line 31
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iput v1, v2, Lio/flutter/embedding/engine/renderer/k;->p:I

    .line 44
    .line 45
    iget-object v1, v0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 46
    .line 47
    iget-object v1, v1, Le3/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->b:I

    .line 53
    .line 54
    if-lez v3, :cond_3

    .line 55
    .line 56
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->c:I

    .line 57
    .line 58
    if-lez v3, :cond_3

    .line 59
    .line 60
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->a:F

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    cmpl-float v3, v3, v4

    .line 64
    .line 65
    if-lez v3, :cond_3

    .line 66
    .line 67
    iget-object v3, v2, Lio/flutter/embedding/engine/renderer/k;->q:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    iget-object v4, v2, Lio/flutter/embedding/engine/renderer/k;->r:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    add-int/2addr v6, v5

    .line 86
    mul-int/lit8 v5, v6, 0x4

    .line 87
    .line 88
    new-array v5, v5, [I

    .line 89
    .line 90
    new-array v7, v6, [I

    .line 91
    .line 92
    new-array v6, v6, [I

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    move v9, v8

    .line 96
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-ge v9, v10, :cond_1

    .line 101
    .line 102
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    check-cast v10, Lio/flutter/embedding/engine/renderer/c;

    .line 107
    .line 108
    mul-int/lit8 v11, v9, 0x4

    .line 109
    .line 110
    iget-object v12, v10, Lio/flutter/embedding/engine/renderer/c;->a:Landroid/graphics/Rect;

    .line 111
    .line 112
    iget v13, v12, Landroid/graphics/Rect;->left:I

    .line 113
    .line 114
    aput v13, v5, v11

    .line 115
    .line 116
    add-int/lit8 v13, v11, 0x1

    .line 117
    .line 118
    iget v14, v12, Landroid/graphics/Rect;->top:I

    .line 119
    .line 120
    aput v14, v5, v13

    .line 121
    .line 122
    add-int/lit8 v13, v11, 0x2

    .line 123
    .line 124
    iget v14, v12, Landroid/graphics/Rect;->right:I

    .line 125
    .line 126
    aput v14, v5, v13

    .line 127
    .line 128
    add-int/lit8 v11, v11, 0x3

    .line 129
    .line 130
    iget v12, v12, Landroid/graphics/Rect;->bottom:I

    .line 131
    .line 132
    aput v12, v5, v11

    .line 133
    .line 134
    iget v11, v10, Lio/flutter/embedding/engine/renderer/c;->b:I

    .line 135
    .line 136
    invoke-static {v11}, LO/i;->b(I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    aput v11, v7, v9

    .line 141
    .line 142
    iget v10, v10, Lio/flutter/embedding/engine/renderer/c;->c:I

    .line 143
    .line 144
    invoke-static {v10}, LO/i;->b(I)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    aput v10, v6, v9

    .line 149
    .line 150
    add-int/lit8 v9, v9, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    mul-int/lit8 v9, v9, 0x4

    .line 158
    .line 159
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-ge v8, v10, :cond_2

    .line 164
    .line 165
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    check-cast v10, Lio/flutter/embedding/engine/renderer/c;

    .line 170
    .line 171
    mul-int/lit8 v11, v8, 0x4

    .line 172
    .line 173
    add-int/2addr v11, v9

    .line 174
    iget-object v12, v10, Lio/flutter/embedding/engine/renderer/c;->a:Landroid/graphics/Rect;

    .line 175
    .line 176
    iget v13, v12, Landroid/graphics/Rect;->left:I

    .line 177
    .line 178
    aput v13, v5, v11

    .line 179
    .line 180
    add-int/lit8 v13, v11, 0x1

    .line 181
    .line 182
    iget v14, v12, Landroid/graphics/Rect;->top:I

    .line 183
    .line 184
    aput v14, v5, v13

    .line 185
    .line 186
    add-int/lit8 v13, v11, 0x2

    .line 187
    .line 188
    iget v14, v12, Landroid/graphics/Rect;->right:I

    .line 189
    .line 190
    aput v14, v5, v13

    .line 191
    .line 192
    add-int/lit8 v11, v11, 0x3

    .line 193
    .line 194
    iget v12, v12, Landroid/graphics/Rect;->bottom:I

    .line 195
    .line 196
    aput v12, v5, v11

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    add-int/2addr v11, v8

    .line 203
    iget v12, v10, Lio/flutter/embedding/engine/renderer/c;->b:I

    .line 204
    .line 205
    invoke-static {v12}, LO/i;->b(I)I

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    aput v12, v7, v11

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    add-int/2addr v11, v8

    .line 216
    iget v10, v10, Lio/flutter/embedding/engine/renderer/c;->c:I

    .line 217
    .line 218
    invoke-static {v10}, LO/i;->b(I)I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    aput v10, v6, v11

    .line 223
    .line 224
    add-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_2
    iget v8, v2, Lio/flutter/embedding/engine/renderer/k;->a:F

    .line 228
    .line 229
    iget v9, v2, Lio/flutter/embedding/engine/renderer/k;->b:I

    .line 230
    .line 231
    iget v10, v2, Lio/flutter/embedding/engine/renderer/k;->c:I

    .line 232
    .line 233
    iget v11, v2, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 234
    .line 235
    iget v12, v2, Lio/flutter/embedding/engine/renderer/k;->e:I

    .line 236
    .line 237
    iget v13, v2, Lio/flutter/embedding/engine/renderer/k;->f:I

    .line 238
    .line 239
    iget v14, v2, Lio/flutter/embedding/engine/renderer/k;->g:I

    .line 240
    .line 241
    iget v15, v2, Lio/flutter/embedding/engine/renderer/k;->h:I

    .line 242
    .line 243
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->i:I

    .line 244
    .line 245
    move/from16 v16, v3

    .line 246
    .line 247
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->j:I

    .line 248
    .line 249
    move/from16 v17, v3

    .line 250
    .line 251
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->k:I

    .line 252
    .line 253
    move/from16 v18, v3

    .line 254
    .line 255
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->l:I

    .line 256
    .line 257
    move/from16 v19, v3

    .line 258
    .line 259
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->m:I

    .line 260
    .line 261
    move/from16 v20, v3

    .line 262
    .line 263
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->n:I

    .line 264
    .line 265
    move/from16 v21, v3

    .line 266
    .line 267
    iget v3, v2, Lio/flutter/embedding/engine/renderer/k;->o:I

    .line 268
    .line 269
    move/from16 v22, v3

    .line 270
    .line 271
    iget v2, v2, Lio/flutter/embedding/engine/renderer/k;->p:I

    .line 272
    .line 273
    move/from16 v23, v2

    .line 274
    .line 275
    iget-object v1, v1, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 276
    .line 277
    move-object v2, v7

    .line 278
    move-object v7, v1

    .line 279
    move-object/from16 v24, v5

    .line 280
    .line 281
    move-object/from16 v25, v2

    .line 282
    .line 283
    move-object/from16 v26, v6

    .line 284
    .line 285
    invoke-virtual/range {v7 .. v26}, Lio/flutter/embedding/engine/FlutterJNI;->setViewportMetrics(FIIIIIIIIIIIIIII[I[I[I)V

    .line 286
    .line 287
    .line 288
    :cond_3
    return-void
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->A:Lio/flutter/view/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/flutter/embedding/android/D;->A:Lio/flutter/view/k;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
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

.method public getAttachedFlutterEngine()Le3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

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

.method public getBinaryMessenger()Ln3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 2
    .line 3
    iget-object v0, v0, Le3/c;->c:Lf3/b;

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

.method public getCurrentImageSurface()Lio/flutter/embedding/android/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->n:Lio/flutter/embedding/android/w;

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

.method public getViewportMetrics()Lio/flutter/embedding/engine/renderer/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

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

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v4, 0x1d

    .line 11
    .line 12
    iget-object v5, v0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, LD/Q;->e(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->y(Landroid/graphics/Insets;)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    iput v6, v5, Lio/flutter/embedding/engine/renderer/k;->l:I

    .line 25
    .line 26
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->B(Landroid/graphics/Insets;)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    iput v6, v5, Lio/flutter/embedding/engine/renderer/k;->m:I

    .line 31
    .line 32
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->D(Landroid/graphics/Insets;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iput v6, v5, Lio/flutter/embedding/engine/renderer/k;->n:I

    .line 37
    .line 38
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->a(Landroid/graphics/Insets;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->o:I

    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v6, 0x4

    .line 49
    and-int/2addr v4, v6

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x1

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    move v4, v8

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v4, v7

    .line 57
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    const/4 v10, 0x2

    .line 62
    and-int/2addr v9, v10

    .line 63
    if-nez v9, :cond_2

    .line 64
    .line 65
    move v9, v8

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move v9, v7

    .line 68
    :goto_1
    const/16 v11, 0x1e

    .line 69
    .line 70
    if-lt v3, v11, :cond_3

    .line 71
    .line 72
    invoke-static {}, LA3/b;->A()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v1, v4}, LA3/b;->h(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->y(Landroid/graphics/Insets;)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 85
    .line 86
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->B(Landroid/graphics/Insets;)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->e:I

    .line 91
    .line 92
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->D(Landroid/graphics/Insets;)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->f:I

    .line 97
    .line 98
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->a(Landroid/graphics/Insets;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->g:I

    .line 103
    .line 104
    invoke-static {}, LA3/b;->a()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-static {v1, v4}, LA3/b;->h(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->y(Landroid/graphics/Insets;)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->h:I

    .line 117
    .line 118
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->B(Landroid/graphics/Insets;)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->i:I

    .line 123
    .line 124
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->D(Landroid/graphics/Insets;)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->j:I

    .line 129
    .line 130
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->a(Landroid/graphics/Insets;)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->k:I

    .line 135
    .line 136
    invoke-static {}, LA3/b;->w()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-static {v1, v4}, LA3/b;->h(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->y(Landroid/graphics/Insets;)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->l:I

    .line 149
    .line 150
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->B(Landroid/graphics/Insets;)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->m:I

    .line 155
    .line 156
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->D(Landroid/graphics/Insets;)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    iput v7, v5, Lio/flutter/embedding/engine/renderer/k;->n:I

    .line 161
    .line 162
    invoke-static {v4}, Lio/flutter/plugin/platform/n;->a(Landroid/graphics/Insets;)I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->o:I

    .line 167
    .line 168
    invoke-static/range {p1 .. p1}, LB/b;->j(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-eqz v4, :cond_10

    .line 173
    .line 174
    invoke-static {v4}, LA3/b;->g(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    iget v9, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 179
    .line 180
    invoke-static {v7}, Lio/flutter/plugin/platform/n;->y(Landroid/graphics/Insets;)I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-static {v4}, LB/b;->w(Landroid/view/DisplayCutout;)I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    iput v9, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 197
    .line 198
    iget v9, v5, Lio/flutter/embedding/engine/renderer/k;->e:I

    .line 199
    .line 200
    invoke-static {v7}, Lio/flutter/plugin/platform/n;->B(Landroid/graphics/Insets;)I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    invoke-static {v4}, LB/b;->D(Landroid/view/DisplayCutout;)I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    iput v9, v5, Lio/flutter/embedding/engine/renderer/k;->e:I

    .line 217
    .line 218
    iget v9, v5, Lio/flutter/embedding/engine/renderer/k;->f:I

    .line 219
    .line 220
    invoke-static {v7}, Lio/flutter/plugin/platform/n;->D(Landroid/graphics/Insets;)I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    invoke-static {v4}, LB/b;->C(Landroid/view/DisplayCutout;)I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    iput v9, v5, Lio/flutter/embedding/engine/renderer/k;->f:I

    .line 237
    .line 238
    iget v9, v5, Lio/flutter/embedding/engine/renderer/k;->g:I

    .line 239
    .line 240
    invoke-static {v7}, Lio/flutter/plugin/platform/n;->a(Landroid/graphics/Insets;)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    invoke-static {v4}, LB/b;->B(Landroid/view/DisplayCutout;)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->g:I

    .line 257
    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :cond_3
    const/4 v11, 0x3

    .line 261
    if-nez v9, :cond_7

    .line 262
    .line 263
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    invoke-virtual {v13}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    iget v13, v13, Landroid/content/res/Configuration;->orientation:I

    .line 276
    .line 277
    if-ne v13, v10, :cond_7

    .line 278
    .line 279
    const-string v13, "display"

    .line 280
    .line 281
    invoke-virtual {v12, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    check-cast v12, Landroid/hardware/display/DisplayManager;

    .line 286
    .line 287
    invoke-virtual {v12, v7}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-virtual {v12}, Landroid/view/Display;->getRotation()I

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-ne v12, v8, :cond_4

    .line 296
    .line 297
    move v12, v11

    .line 298
    goto :goto_2

    .line 299
    :cond_4
    if-ne v12, v11, :cond_5

    .line 300
    .line 301
    move v12, v10

    .line 302
    goto :goto_2

    .line 303
    :cond_5
    if-eqz v12, :cond_6

    .line 304
    .line 305
    if-ne v12, v10, :cond_7

    .line 306
    .line 307
    :cond_6
    move v12, v6

    .line 308
    goto :goto_2

    .line 309
    :cond_7
    move v12, v8

    .line 310
    :goto_2
    if-eqz v4, :cond_8

    .line 311
    .line 312
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    goto :goto_3

    .line 317
    :cond_8
    move v4, v7

    .line 318
    :goto_3
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 319
    .line 320
    if-eq v12, v11, :cond_a

    .line 321
    .line 322
    if-ne v12, v6, :cond_9

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    goto :goto_5

    .line 330
    :cond_a
    :goto_4
    move v4, v7

    .line 331
    :goto_5
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->e:I

    .line 332
    .line 333
    const-wide v13, 0x3fc70a3d70a3d70aL    # 0.18

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    if-eqz v9, :cond_c

    .line 339
    .line 340
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    int-to-double v8, v9

    .line 353
    int-to-double v6, v4

    .line 354
    mul-double/2addr v6, v13

    .line 355
    cmpg-double v4, v8, v6

    .line 356
    .line 357
    if-gez v4, :cond_b

    .line 358
    .line 359
    const/4 v4, 0x0

    .line 360
    goto :goto_6

    .line 361
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    :goto_6
    if-nez v4, :cond_c

    .line 366
    .line 367
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    goto :goto_7

    .line 372
    :cond_c
    const/4 v4, 0x0

    .line 373
    :goto_7
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->f:I

    .line 374
    .line 375
    if-eq v12, v10, :cond_e

    .line 376
    .line 377
    const/4 v4, 0x4

    .line 378
    if-ne v12, v4, :cond_d

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    goto :goto_9

    .line 386
    :cond_e
    :goto_8
    const/4 v4, 0x0

    .line 387
    :goto_9
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->g:I

    .line 388
    .line 389
    const/4 v4, 0x0

    .line 390
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->h:I

    .line 391
    .line 392
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->i:I

    .line 393
    .line 394
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    int-to-double v6, v6

    .line 407
    int-to-double v8, v4

    .line 408
    mul-double/2addr v8, v13

    .line 409
    cmpg-double v4, v6, v8

    .line 410
    .line 411
    if-gez v4, :cond_f

    .line 412
    .line 413
    const/4 v4, 0x0

    .line 414
    goto :goto_a

    .line 415
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    :goto_a
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->j:I

    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    iput v4, v5, Lio/flutter/embedding/engine/renderer/k;->k:I

    .line 423
    .line 424
    :cond_10
    :goto_b
    new-instance v4, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    const/16 v6, 0x1c

    .line 430
    .line 431
    if-lt v3, v6, :cond_11

    .line 432
    .line 433
    invoke-static/range {p1 .. p1}, LB/b;->j(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-eqz v1, :cond_11

    .line 438
    .line 439
    invoke-static {v1}, Landroidx/media/C;->i(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_11

    .line 452
    .line 453
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    check-cast v3, Landroid/graphics/Rect;

    .line 458
    .line 459
    invoke-virtual {v3}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    new-instance v6, Lio/flutter/embedding/engine/renderer/c;

    .line 463
    .line 464
    const/4 v7, 0x4

    .line 465
    const/4 v8, 0x1

    .line 466
    invoke-direct {v6, v3, v7, v8}, Lio/flutter/embedding/engine/renderer/c;-><init>(Landroid/graphics/Rect;II)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_11
    iget-object v1, v5, Lio/flutter/embedding/engine/renderer/k;->r:Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 479
    .line 480
    .line 481
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 482
    .line 483
    const/16 v3, 0x23

    .line 484
    .line 485
    if-lt v1, v3, :cond_16

    .line 486
    .line 487
    iget-object v1, v0, Lio/flutter/embedding/android/D;->I:Lio/flutter/embedding/android/F;

    .line 488
    .line 489
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-static {v3}, Li4/a;->y(Landroid/content/Context;)Landroid/app/Activity;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    const/4 v3, 0x0

    .line 501
    if-nez v1, :cond_12

    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_12
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    if-nez v1, :cond_13

    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_13
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    :goto_d
    if-nez v3, :cond_14

    .line 520
    .line 521
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    goto :goto_e

    .line 526
    :cond_14
    invoke-static {}, LA3/b;->C()I

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    invoke-static {v3, v1}, Lio/flutter/embedding/android/E;->c(Landroid/view/WindowInsets;I)Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    :goto_e
    iget v3, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 535
    .line 536
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-eqz v4, :cond_15

    .line 545
    .line 546
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    check-cast v4, Landroid/graphics/Rect;

    .line 551
    .line 552
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 553
    .line 554
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    goto :goto_f

    .line 559
    :cond_15
    iput v3, v5, Lio/flutter/embedding/engine/renderer/k;->d:I

    .line 560
    .line 561
    :cond_16
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->e()V

    .line 562
    .line 563
    .line 564
    return-object v2
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

.method public final onAttachedToWindow()V
    .locals 10

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 5
    .line 6
    .line 7
    :try_start_0
    new-instance v3, Landroidx/lifecycle/E;

    .line 8
    .line 9
    new-instance v4, LZ1/l;

    .line 10
    .line 11
    sget-object v5, LK1/h;->c:LK1/g;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v6}, LK1/g;->a(Landroid/content/Context;)LK1/b;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    new-instance v6, LZ1/c;

    .line 25
    .line 26
    const/4 v7, 0x3

    .line 27
    invoke-direct {v6, v7}, LZ1/c;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v5, v4, LZ1/l;->l:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v6, v4, LZ1/l;->m:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {v3, v4, v0}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-object v3, v1

    .line 42
    :goto_0
    iput-object v3, p0, Lio/flutter/embedding/android/D;->C:Landroidx/lifecycle/E;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, Li4/a;->y(Landroid/content/Context;)Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v4, p0, Lio/flutter/embedding/android/D;->C:Landroidx/lifecycle/E;

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    new-instance v5, LK1/i;

    .line 59
    .line 60
    invoke-direct {v5, p0, v2}, LK1/i;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    iput-object v5, p0, Lio/flutter/embedding/android/D;->H:LK1/i;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 70
    .line 71
    const/16 v7, 0x1c

    .line 72
    .line 73
    if-lt v6, v7, :cond_0

    .line 74
    .line 75
    invoke-static {v5}, Lu/d;->a(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    new-instance v6, Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lc2/a;

    .line 90
    .line 91
    invoke-direct {v5, v6, v2}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v6, p0, Lio/flutter/embedding/android/D;->H:LK1/i;

    .line 95
    .line 96
    iget-object v4, v4, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, LZ1/l;

    .line 99
    .line 100
    const-string v7, "executor"

    .line 101
    .line 102
    invoke-static {v5, v7}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v7, "consumer"

    .line 106
    .line 107
    invoke-static {v6, v7}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v7, v4, LZ1/l;->l:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v7, LK1/b;

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v8, LK1/k;

    .line 118
    .line 119
    invoke-direct {v8, v7, v3, v1}, LK1/k;-><init>(LK1/b;Landroid/app/Activity;LE3/d;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, LY3/c;

    .line 123
    .line 124
    sget-object v7, LE3/j;->l:LE3/j;

    .line 125
    .line 126
    const/4 v9, -0x2

    .line 127
    invoke-direct {v3, v8, v7, v9, v2}, LY3/c;-><init>(LM3/p;LE3/i;II)V

    .line 128
    .line 129
    .line 130
    sget-object v2, LV3/B;->a:Lc4/d;

    .line 131
    .line 132
    sget-object v2, La4/o;->a:LW3/c;

    .line 133
    .line 134
    sget-object v8, LV3/t;->m:LV3/t;

    .line 135
    .line 136
    invoke-virtual {v2, v8}, LV3/s;->l(LE3/h;)LE3/g;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    if-nez v8, :cond_3

    .line 141
    .line 142
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_1
    const/4 v7, 0x0

    .line 150
    invoke-static {v3, v2, v7, v7, v0}, LZ3/q;->a(LZ3/o;LW3/c;III)LY3/g;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    :goto_2
    iget-object v0, v4, LZ1/l;->m:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, LZ1/c;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-string v2, "flow"

    .line 162
    .line 163
    invoke-static {v3, v2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 171
    .line 172
    .line 173
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 176
    .line 177
    :try_start_1
    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-nez v4, :cond_2

    .line 182
    .line 183
    new-instance v4, LV3/J;

    .line 184
    .line 185
    invoke-direct {v4, v5}, LV3/J;-><init>(Ljava/util/concurrent/Executor;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v4}, LV3/v;->a(LE3/i;)La4/e;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    new-instance v5, LI1/b;

    .line 193
    .line 194
    invoke-direct {v5, v3, v6, v1}, LI1/b;-><init>(LY3/g;LK1/i;LE3/d;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v4, v5}, LV3/v;->j(LV3/u;LM3/p;)LV3/e0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto :goto_4

    .line 207
    :cond_2
    :goto_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :goto_4
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, "Flow context cannot contain job in it. Had "

    .line 218
    .line 219
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v1

    .line 239
    :cond_4
    :goto_5
    return-void
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

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/flutter/embedding/android/D;->x:Lo3/a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lo3/a;->b(Landroid/content/res/Configuration;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->d()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 21
    .line 22
    invoke-static {p1, v0}, Li4/a;->e(Landroid/content/Context;Lz3/b;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/D;->v:Lio/flutter/plugin/editing/i;

    .line 13
    .line 14
    iget-object v5, p0, Lio/flutter/embedding/android/D;->y:LZ1/m;

    .line 15
    .line 16
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->e:LD/o;

    .line 17
    .line 18
    iget v2, v1, LD/o;->b:I

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    iput-object v4, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_1
    const/4 v6, 0x4

    .line 29
    if-ne v2, v6, :cond_2

    .line 30
    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_2
    const/4 v4, 0x3

    .line 34
    if-ne v2, v4, :cond_4

    .line 35
    .line 36
    iget-boolean v2, v0, Lio/flutter/plugin/editing/i;->p:Z

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 41
    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :cond_3
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->k:Lio/flutter/plugin/platform/p;

    .line 45
    .line 46
    iget v1, v1, LD/o;->c:I

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Lio/flutter/plugin/platform/p;->h(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iput-object v4, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_4
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 61
    .line 62
    iget-object v2, v1, Lm3/m;->g:La0/W;

    .line 63
    .line 64
    const/4 v7, 0x2

    .line 65
    iget v8, v2, La0/W;->a:I

    .line 66
    .line 67
    if-ne v8, v7, :cond_5

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_5
    const/4 v9, 0x5

    .line 72
    if-ne v8, v9, :cond_9

    .line 73
    .line 74
    iget-boolean v4, v2, La0/W;->b:Z

    .line 75
    .line 76
    if-eqz v4, :cond_6

    .line 77
    .line 78
    const/16 v7, 0x1002

    .line 79
    .line 80
    :cond_6
    iget-boolean v2, v2, La0/W;->c:Z

    .line 81
    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    or-int/lit16 v2, v7, 0x2000

    .line 85
    .line 86
    :cond_7
    :goto_0
    move v6, v2

    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_8
    move v6, v7

    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_9
    const/4 v2, 0x6

    .line 93
    if-ne v8, v2, :cond_a

    .line 94
    .line 95
    move v6, v4

    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_a
    const/16 v2, 0xb

    .line 99
    .line 100
    if-ne v8, v2, :cond_b

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_b
    const/4 v2, 0x7

    .line 106
    if-ne v8, v2, :cond_c

    .line 107
    .line 108
    const v2, 0x20001

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_c
    const/16 v2, 0x8

    .line 113
    .line 114
    if-eq v8, v2, :cond_13

    .line 115
    .line 116
    const/16 v2, 0xd

    .line 117
    .line 118
    if-ne v8, v2, :cond_d

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_d
    const/16 v2, 0x9

    .line 122
    .line 123
    if-eq v8, v2, :cond_12

    .line 124
    .line 125
    const/16 v2, 0xc

    .line 126
    .line 127
    if-ne v8, v2, :cond_e

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_e
    const/16 v2, 0xa

    .line 131
    .line 132
    if-ne v8, v2, :cond_f

    .line 133
    .line 134
    const/16 v2, 0x91

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_f
    if-ne v8, v4, :cond_10

    .line 138
    .line 139
    const/16 v2, 0x61

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_10
    if-ne v8, v6, :cond_11

    .line 143
    .line 144
    const/16 v2, 0x71

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_11
    move v2, v3

    .line 148
    goto :goto_3

    .line 149
    :cond_12
    :goto_1
    const/16 v2, 0x11

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_13
    :goto_2
    const/16 v2, 0x21

    .line 153
    .line 154
    :goto_3
    iget-boolean v6, v1, Lm3/m;->a:Z

    .line 155
    .line 156
    if-eqz v6, :cond_14

    .line 157
    .line 158
    const v6, 0x80080

    .line 159
    .line 160
    .line 161
    :goto_4
    or-int/2addr v2, v6

    .line 162
    goto :goto_5

    .line 163
    :cond_14
    iget-boolean v6, v1, Lm3/m;->b:Z

    .line 164
    .line 165
    if-eqz v6, :cond_15

    .line 166
    .line 167
    const v6, 0x8000

    .line 168
    .line 169
    .line 170
    or-int/2addr v2, v6

    .line 171
    :cond_15
    iget-boolean v6, v1, Lm3/m;->c:Z

    .line 172
    .line 173
    if-nez v6, :cond_16

    .line 174
    .line 175
    const v6, 0x80090

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_16
    :goto_5
    iget v6, v1, Lm3/m;->f:I

    .line 180
    .line 181
    if-ne v6, v3, :cond_17

    .line 182
    .line 183
    or-int/lit16 v2, v2, 0x1000

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_17
    if-ne v6, v7, :cond_18

    .line 187
    .line 188
    or-int/lit16 v2, v2, 0x2000

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_18
    if-ne v6, v4, :cond_7

    .line 192
    .line 193
    or-int/lit16 v2, v2, 0x4000

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :goto_6
    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 197
    .line 198
    const/high16 v2, 0x2000000

    .line 199
    .line 200
    iput v2, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 201
    .line 202
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 203
    .line 204
    const/16 v4, 0x1a

    .line 205
    .line 206
    if-lt v2, v4, :cond_19

    .line 207
    .line 208
    iget-boolean v4, v1, Lm3/m;->d:Z

    .line 209
    .line 210
    if-nez v4, :cond_19

    .line 211
    .line 212
    const/high16 v4, 0x3000000

    .line 213
    .line 214
    iput v4, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 215
    .line 216
    :cond_19
    iget-object v1, v1, Lm3/m;->h:Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 223
    .line 224
    iget-object v6, v4, Lm3/m;->i:Ljava/lang/String;

    .line 225
    .line 226
    if-eqz v6, :cond_1a

    .line 227
    .line 228
    iput-object v6, p1, Landroid/view/inputmethod/EditorInfo;->actionLabel:Ljava/lang/CharSequence;

    .line 229
    .line 230
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->actionId:I

    .line 231
    .line 232
    :cond_1a
    iget v6, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 233
    .line 234
    or-int/2addr v1, v6

    .line 235
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 236
    .line 237
    iget-object v1, v4, Lm3/m;->m:[Ljava/util/Locale;

    .line 238
    .line 239
    if-eqz v1, :cond_1b

    .line 240
    .line 241
    new-instance v1, Landroid/os/LocaleList;

    .line 242
    .line 243
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 244
    .line 245
    iget-object v4, v4, Lm3/m;->m:[Ljava/util/Locale;

    .line 246
    .line 247
    invoke-direct {v1, v4}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 248
    .line 249
    .line 250
    iput-object v1, p1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    .line 251
    .line 252
    :cond_1b
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 253
    .line 254
    iget-object v1, v1, Lm3/m;->k:[Ljava/lang/String;

    .line 255
    .line 256
    if-eqz v1, :cond_1e

    .line 257
    .line 258
    const/16 v4, 0x19

    .line 259
    .line 260
    if-lt v2, v4, :cond_1c

    .line 261
    .line 262
    invoke-static {p1, v1}, LH/a;->c(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_1c
    iget-object v4, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 267
    .line 268
    if-nez v4, :cond_1d

    .line 269
    .line 270
    new-instance v4, Landroid/os/Bundle;

    .line 271
    .line 272
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 273
    .line 274
    .line 275
    iput-object v4, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 276
    .line 277
    :cond_1d
    iget-object v4, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 278
    .line 279
    const-string v6, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"

    .line 280
    .line 281
    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object v4, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 285
    .line 286
    const-string v6, "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"

    .line 287
    .line 288
    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :cond_1e
    :goto_7
    const/16 v1, 0x22

    .line 292
    .line 293
    if-lt v2, v1, :cond_20

    .line 294
    .line 295
    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 296
    .line 297
    if-nez v1, :cond_1f

    .line 298
    .line 299
    new-instance v1, Landroid/os/Bundle;

    .line 300
    .line 301
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 302
    .line 303
    .line 304
    iput-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 305
    .line 306
    :cond_1f
    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 307
    .line 308
    const-string v2, "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"

    .line 309
    .line 310
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 311
    .line 312
    .line 313
    :cond_20
    new-instance v8, Lio/flutter/plugin/editing/c;

    .line 314
    .line 315
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->e:LD/o;

    .line 316
    .line 317
    iget v3, v1, LD/o;->c:I

    .line 318
    .line 319
    iget-object v6, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 320
    .line 321
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->d:LZ1/e;

    .line 322
    .line 323
    move-object v1, v8

    .line 324
    move-object v2, p0

    .line 325
    move-object v7, p1

    .line 326
    invoke-direct/range {v1 .. v7}, Lio/flutter/plugin/editing/c;-><init>(Lio/flutter/embedding/android/D;ILZ1/e;LZ1/m;Lio/flutter/plugin/editing/f;Landroid/view/inputmethod/EditorInfo;)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 339
    .line 340
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 350
    .line 351
    iput-object v8, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 352
    .line 353
    move-object v4, v8

    .line 354
    :goto_8
    return-object v4
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

.method public final onDetachedFromWindow()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/D;->C:Landroidx/lifecycle/E;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lio/flutter/embedding/android/D;->H:LK1/i;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LZ1/l;

    .line 13
    .line 14
    iget-object v0, v0, LZ1/l;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LZ1/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, LZ1/c;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ljava/util/concurrent/locks/ReentrantLock;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LV3/P;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-interface {v4, v1}, LV3/P;->b(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LV3/P;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    :goto_0
    iput-object v1, p0, Lio/flutter/embedding/android/D;->H:LK1/i;

    .line 59
    .line 60
    iput-object v1, p0, Lio/flutter/embedding/android/D;->C:Landroidx/lifecycle/E;

    .line 61
    .line 62
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 63
    .line 64
    .line 65
    return-void
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
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/embedding/android/D;->z:Lio/flutter/embedding/android/a;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x7

    .line 26
    const/4 v9, 0x1

    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v2, v9

    .line 41
    :goto_1
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Lio/flutter/embedding/android/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    mul-int/lit16 v1, v1, 0x120

    .line 58
    .line 59
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    invoke-virtual {v10, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    sget-object v6, Lio/flutter/embedding/android/a;->f:Landroid/graphics/Matrix;

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    move-object v1, v0

    .line 76
    move-object v2, p1

    .line 77
    move-object v7, v10

    .line 78
    invoke-virtual/range {v1 .. v8}, Lio/flutter/embedding/android/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    rem-int/lit16 p1, p1, 0x120

    .line 86
    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget-object v0, v0, Lio/flutter/embedding/android/a;->a:Lio/flutter/embedding/engine/renderer/l;

    .line 94
    .line 95
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 96
    .line 97
    invoke-virtual {v0, v10, p1}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 102
    .line 103
    const-string v0, "Packet position is not on field boundary."

    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    :goto_2
    return v9
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

.method public final onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/D;->A:Lio/flutter/view/k;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/k;->e(Landroid/view/MotionEvent;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Landroid/widget/FrameLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    iget-object v2, v1, Lio/flutter/embedding/android/D;->v:Lio/flutter/plugin/editing/i;

    .line 9
    .line 10
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v4, 0x1a

    .line 13
    .line 14
    if-lt v3, v4, :cond_4

    .line 15
    .line 16
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 17
    .line 18
    if-eqz v3, :cond_5

    .line 19
    .line 20
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->f:Lm3/m;

    .line 21
    .line 22
    iget-object v3, v3, Lm3/m;->j:LZ1/i;

    .line 23
    .line 24
    iget-object v3, v3, LZ1/i;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewStructure;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    :goto_0
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-ge v6, v7, :cond_5

    .line 41
    .line 42
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 43
    .line 44
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->keyAt(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    iget-object v8, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Lm3/m;

    .line 55
    .line 56
    iget-object v8, v8, Lm3/m;->j:LZ1/i;

    .line 57
    .line 58
    if-nez v8, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const/4 v9, 0x1

    .line 62
    invoke-virtual {v0, v9}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 66
    .line 67
    .line 68
    move-result-object v15

    .line 69
    invoke-virtual {v15, v4, v7}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 70
    .line 71
    .line 72
    iget-object v10, v8, LZ1/i;->m:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, [Ljava/lang/String;

    .line 75
    .line 76
    array-length v11, v10

    .line 77
    if-lez v11, :cond_1

    .line 78
    .line 79
    invoke-virtual {v15, v10}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v15, v9}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v15, v5}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v8, LZ1/i;->o:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v9, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v9, :cond_2

    .line 93
    .line 94
    invoke-virtual {v15, v9}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-ne v9, v7, :cond_3

    .line 102
    .line 103
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 104
    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    iget v11, v7, Landroid/graphics/Rect;->left:I

    .line 108
    .line 109
    iget v12, v7, Landroid/graphics/Rect;->top:I

    .line 110
    .line 111
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    iget-object v8, v2, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 116
    .line 117
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    .line 118
    .line 119
    .line 120
    move-result v16

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    move-object v10, v15

    .line 124
    move-object v9, v15

    .line 125
    move v15, v7

    .line 126
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 127
    .line 128
    .line 129
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/f;

    .line 130
    .line 131
    invoke-static {v7}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v9, v7}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move-object v9, v15

    .line 140
    const/4 v15, 0x1

    .line 141
    const/16 v16, 0x1

    .line 142
    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    move-object v10, v9

    .line 148
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 149
    .line 150
    .line 151
    iget-object v7, v8, LZ1/i;->n:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v7, Lm3/n;

    .line 154
    .line 155
    iget-object v7, v7, Lm3/n;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v7}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v9, v7}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    :cond_5
    return-void
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

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 5
    .line 6
    iput p1, p3, Lio/flutter/embedding/engine/renderer/k;->b:I

    .line 7
    .line 8
    iput p2, p3, Lio/flutter/embedding/engine/renderer/k;->c:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->e()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/flutter/embedding/android/D;->z:Lio/flutter/embedding/android/a;

    .line 16
    .line 17
    sget-object v1, Lio/flutter/embedding/android/a;->f:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lio/flutter/embedding/android/a;->d(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1
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

.method public setDelegate(Lio/flutter/embedding/android/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/android/D;->I:Lio/flutter/embedding/android/F;

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

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/D;->o:Landroid/view/View;

    .line 5
    .line 6
    instance-of v1, v0, Lio/flutter/embedding/android/y;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lio/flutter/embedding/android/y;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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

.method public setWindowInfoListenerDisplayFeatures(LK1/l;)V
    .locals 7

    .line 1
    iget-object p1, p1, LK1/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LK1/c;

    .line 23
    .line 24
    iget-object v2, v1, LK1/c;->a:LH1/b;

    .line 25
    .line 26
    invoke-virtual {v2}, LH1/b;->c()Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, LK1/c;->a:LH1/b;

    .line 34
    .line 35
    invoke-virtual {v2}, LH1/b;->b()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sget-object v4, LK1/b;->o:LK1/b;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, LH1/b;->a()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move-object v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    sget-object v3, LK1/b;->n:LK1/b;

    .line 53
    .line 54
    :goto_2
    const/4 v5, 0x2

    .line 55
    const/4 v6, 0x3

    .line 56
    if-ne v3, v4, :cond_2

    .line 57
    .line 58
    move v3, v6

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    move v3, v5

    .line 61
    :goto_3
    sget-object v4, LK1/b;->p:LK1/b;

    .line 62
    .line 63
    iget-object v1, v1, LK1/c;->c:LK1/b;

    .line 64
    .line 65
    if-ne v1, v4, :cond_3

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    sget-object v4, LK1/b;->q:LK1/b;

    .line 69
    .line 70
    if-ne v1, v4, :cond_4

    .line 71
    .line 72
    move v5, v6

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    const/4 v5, 0x1

    .line 75
    :goto_4
    new-instance v1, Lio/flutter/embedding/engine/renderer/c;

    .line 76
    .line 77
    invoke-virtual {v2}, LH1/b;->c()Landroid/graphics/Rect;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2, v3, v5}, Lio/flutter/embedding/engine/renderer/c;-><init>(Landroid/graphics/Rect;II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    iget-object p1, p0, Lio/flutter/embedding/android/D;->D:Lio/flutter/embedding/engine/renderer/k;

    .line 89
    .line 90
    iget-object p1, p1, Lio/flutter/embedding/engine/renderer/k;->q:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lio/flutter/embedding/android/D;->e()V

    .line 99
    .line 100
    .line 101
    return-void
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
