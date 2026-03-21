.class public final Landroidx/fragment/app/f;
.super Landroidx/fragment/app/X;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/fragment/app/g;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

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
.method public final a(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    .line 7
    .line 8
    iget-object v0, v0, LL0/e;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroidx/fragment/app/Y;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/fragment/app/Y;->c:Landroidx/fragment/app/r;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Y;->c(Landroidx/fragment/app/X;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    const-string v1, "FragmentManager"

    .line 27
    .line 28
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "Animation from operation "

    .line 37
    .line 38
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, " has been cancelled."

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/g;

    .line 7
    .line 8
    invoke-virtual {v0}, LL0/e;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, v0, LL0/e;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroidx/fragment/app/Y;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Landroidx/fragment/app/Y;->c(Landroidx/fragment/app/X;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v3, v2, Landroidx/fragment/app/Y;->c:Landroidx/fragment/app/r;

    .line 27
    .line 28
    iget-object v3, v3, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    .line 29
    .line 30
    const-string v4, "context"

    .line 31
    .line 32
    invoke-static {v1, v4}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/fragment/app/g;->p(Landroid/content/Context;)LZ1/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Required value was null."

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-object v0, v0, LZ1/e;->m:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Landroid/view/animation/Animation;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget v1, v2, Landroidx/fragment/app/Y;->a:I

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    if-eq v1, v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p0}, Landroidx/fragment/app/Y;->c(Landroidx/fragment/app/X;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Landroidx/fragment/app/x;

    .line 65
    .line 66
    invoke-direct {v1, v0, p1, v3}, Landroidx/fragment/app/x;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Lio/flutter/embedding/android/D;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Landroidx/fragment/app/e;

    .line 70
    .line 71
    invoke-direct {v0, v2, p1, v3, p0}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/Y;Landroid/view/ViewGroup;Lio/flutter/embedding/android/D;Landroidx/fragment/app/f;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x2

    .line 81
    const-string v0, "FragmentManager"

    .line 82
    .line 83
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    new-instance p1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "Animation from operation "

    .line 92
    .line 93
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " has started."

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :cond_2
    :goto_0
    return-void

    .line 112
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
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
