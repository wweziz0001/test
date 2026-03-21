.class public final Lm/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Landroid/graphics/PorterDuff$Mode;

.field public static c:Lm/n;


# instance fields
.field public a:Lm/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lm/n;->b:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-void
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

.method public static declared-synchronized b()V
    .locals 3

    .line 1
    const-class v0, Lm/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lm/n;->c:Lm/n;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lm/n;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lm/n;->c:Lm/n;

    .line 14
    .line 15
    invoke-static {}, Lm/m0;->b()Lm/m0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, v1, Lm/n;->a:Lm/m0;

    .line 20
    .line 21
    sget-object v1, Lm/n;->c:Lm/n;

    .line 22
    .line 23
    iget-object v1, v1, Lm/n;->a:Lm/m0;

    .line 24
    .line 25
    new-instance v2, Ly2/n;

    .line 26
    .line 27
    invoke-direct {v2}, Ly2/n;-><init>()V

    .line 28
    .line 29
    .line 30
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    iput-object v2, v1, Lm/m0;->e:Ly2/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v2

    .line 36
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 37
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 43
    throw v1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public static c(Landroid/graphics/drawable/Drawable;Lm/I0;[I)V
    .locals 4

    .line 1
    sget-object v0, Lm/m0;->f:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lm/M;->a:[I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v1, p0, :cond_7

    .line 14
    .line 15
    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-array v1, v2, [I

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-boolean v0, p1, Lm/I0;->d:Z

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-boolean v1, p1, Lm/I0;->c:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p1, Lm/I0;->a:Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v0, v1

    .line 54
    :goto_1
    iget-boolean v3, p1, Lm/I0;->c:Z

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object p1, p1, Lm/I0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    sget-object p1, Lm/m0;->f:Landroid/graphics/PorterDuff$Mode;

    .line 62
    .line 63
    :goto_2
    if-eqz v0, :cond_6

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_5
    invoke-virtual {v0, p2, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2, p1}, Lm/m0;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_7
    const-string p0, "ResourceManagerInternal"

    .line 81
    .line 82
    const-string p1, "Mutated drawable is not the same instance as the input."

    .line 83
    .line 84
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :goto_4
    return-void
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
.method public final declared-synchronized a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm/n;->a:Lm/m0;

    .line 3
    .line 4
    invoke-virtual {v0, p1, p2}, Lm/m0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
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
