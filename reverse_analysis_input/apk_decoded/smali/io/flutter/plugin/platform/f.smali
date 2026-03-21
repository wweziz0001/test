.class public final Lio/flutter/plugin/platform/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:LZ1/l;

.field public final c:Ljava/lang/Object;

.field public d:LT2/i;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;LZ1/l;Lio/flutter/embedding/android/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/plugin/platform/m;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lio/flutter/plugin/platform/m;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p2, p0, Lio/flutter/plugin/platform/f;->b:LZ1/l;

    .line 13
    .line 14
    iput-object v0, p2, LZ1/l;->m:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, p0, Lio/flutter/plugin/platform/f;->c:Ljava/lang/Object;

    .line 17
    .line 18
    const/16 p1, 0x500

    .line 19
    .line 20
    iput p1, p0, Lio/flutter/plugin/platform/f;->e:I

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
.method public final a(LT2/i;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    const/16 v3, 0x1e

    .line 15
    .line 16
    if-lt v1, v3, :cond_0

    .line 17
    .line 18
    new-instance v1, LD/e0;

    .line 19
    .line 20
    invoke-direct {v1, v0}, LD/e0;-><init>(Landroid/view/Window;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-lt v1, v2, :cond_1

    .line 25
    .line 26
    new-instance v1, LD/d0;

    .line 27
    .line 28
    invoke-direct {v1, v0}, LD/c0;-><init>(Landroid/view/Window;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v1, LD/c0;

    .line 33
    .line 34
    invoke-direct {v1, v0}, LD/c0;-><init>(Landroid/view/Window;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    if-ge v4, v3, :cond_2

    .line 40
    .line 41
    const/high16 v3, -0x80000000

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 44
    .line 45
    .line 46
    const/high16 v3, 0xc000000

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget v3, p1, LT2/i;->l:I

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x1

    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    invoke-static {v3}, LO/i;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    if-eq v3, v6, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {v1, v6}, LZ1/f;->J(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {v1, v5}, LZ1/f;->J(Z)V

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_1
    iget-object v3, p1, LT2/i;->n:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Ljava/lang/Integer;

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 84
    .line 85
    .line 86
    :cond_6
    iget-object v3, p1, LT2/i;->o:Ljava/io/Serializable;

    .line 87
    .line 88
    check-cast v3, Ljava/lang/Boolean;

    .line 89
    .line 90
    const/16 v7, 0x1d

    .line 91
    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    if-lt v4, v7, :cond_7

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v0, v3}, LD/Q;->s(Landroid/view/Window;Z)V

    .line 101
    .line 102
    .line 103
    :cond_7
    if-lt v4, v2, :cond_b

    .line 104
    .line 105
    iget v2, p1, LT2/i;->m:I

    .line 106
    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    invoke-static {v2}, LO/i;->b(I)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_9

    .line 114
    .line 115
    if-eq v2, v6, :cond_8

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_8
    invoke-virtual {v1, v6}, LZ1/f;->I(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_9
    invoke-virtual {v1, v5}, LZ1/f;->I(Z)V

    .line 123
    .line 124
    .line 125
    :cond_a
    :goto_2
    iget-object v1, p1, LT2/i;->p:Ljava/io/Serializable;

    .line 126
    .line 127
    check-cast v1, Ljava/lang/Integer;

    .line 128
    .line 129
    if-eqz v1, :cond_b

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 136
    .line 137
    .line 138
    :cond_b
    iget-object v1, p1, LT2/i;->q:Ljava/io/Serializable;

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Integer;

    .line 141
    .line 142
    if-eqz v1, :cond_c

    .line 143
    .line 144
    const/16 v2, 0x1c

    .line 145
    .line 146
    if-lt v4, v2, :cond_c

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v0, v1}, Landroidx/media/C;->o(Landroid/view/Window;I)V

    .line 153
    .line 154
    .line 155
    :cond_c
    iget-object v1, p1, LT2/i;->r:Ljava/io/Serializable;

    .line 156
    .line 157
    check-cast v1, Ljava/lang/Boolean;

    .line 158
    .line 159
    if-eqz v1, :cond_d

    .line 160
    .line 161
    if-lt v4, v7, :cond_d

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-static {v0, v1}, LD/Q;->y(Landroid/view/Window;Z)V

    .line 168
    .line 169
    .line 170
    :cond_d
    iput-object p1, p0, Lio/flutter/plugin/platform/f;->d:LT2/i;

    .line 171
    .line 172
    return-void
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

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lio/flutter/plugin/platform/f;->e:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->d:LT2/i;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/f;->a(LT2/i;)V

    .line 21
    .line 22
    .line 23
    :cond_0
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
.end method
