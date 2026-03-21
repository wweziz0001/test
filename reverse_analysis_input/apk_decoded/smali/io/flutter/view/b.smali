.class public final Lio/flutter/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;


# instance fields
.field public final synthetic a:Lio/flutter/view/k;


# direct methods
.method public constructor <init>(Lio/flutter/view/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/view/b;->a:Lio/flutter/view/k;

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
.method public final onAccessibilityStateChanged(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/flutter/view/b;->a:Lio/flutter/view/k;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/flutter/view/k;->t:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, v0, Lio/flutter/view/k;->b:LZ1/m;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v4, v0, Lio/flutter/view/k;->u:Lio/flutter/view/a;

    .line 15
    .line 16
    iput-object v4, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v5, v3, LZ1/m;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Lio/flutter/embedding/engine/FlutterJNI;

    .line 21
    .line 22
    invoke-virtual {v5, v4}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Le3/i;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, v3, LZ1/m;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lio/flutter/embedding/engine/FlutterJNI;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, v1}, Lio/flutter/view/k;->i(Z)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    iput-object v4, v3, LZ1/m;->o:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v5, v3, LZ1/m;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Lio/flutter/embedding/engine/FlutterJNI;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Le3/i;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, v3, LZ1/m;->n:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lio/flutter/embedding/engine/FlutterJNI;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v3, v0, Lio/flutter/view/k;->r:Landroidx/lifecycle/E;

    .line 54
    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    iget-object v0, v0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v3, v3, Landroidx/lifecycle/E;->m:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Lio/flutter/embedding/android/D;

    .line 66
    .line 67
    iget-object v4, v3, Lio/flutter/embedding/android/D;->s:Le3/c;

    .line 68
    .line 69
    iget-object v4, v4, Le3/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 70
    .line 71
    iget-object v4, v4, Lio/flutter/embedding/engine/renderer/l;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 72
    .line 73
    invoke-virtual {v4}, Lio/flutter/embedding/engine/FlutterJNI;->getIsSoftwareRenderingEnabled()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_3

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    move v1, v2

    .line 84
    :cond_2
    invoke-virtual {v3, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v3, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    return-void
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
