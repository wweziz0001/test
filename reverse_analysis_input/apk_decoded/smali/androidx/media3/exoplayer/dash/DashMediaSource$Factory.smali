.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/G;


# instance fields
.field public final a:LD0/d;

.field public final b:Lf0/g;

.field public final c:Lf/a;

.field public final d:Lp1/b;

.field public final e:LA0/b;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Lf0/g;)V
    .locals 3

    .line 1
    new-instance v0, LD0/d;

    .line 2
    .line 3
    sget-object v1, Ly0/d;->u:La0/m;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, LD0/d;->n:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, v0, LD0/d;->m:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iput v1, v0, LD0/d;->l:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LD0/d;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lf0/g;

    .line 21
    .line 22
    new-instance p1, Lf/a;

    .line 23
    .line 24
    invoke-direct {p1}, Lf/a;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lf/a;

    .line 28
    .line 29
    new-instance p1, LA0/b;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {p1, v1}, LA0/b;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:LA0/b;

    .line 36
    .line 37
    const-wide/16 v1, 0x7530

    .line 38
    .line 39
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 40
    .line 41
    const-wide/32 v1, 0x4c4b40

    .line 42
    .line 43
    .line 44
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 45
    .line 46
    new-instance p1, Lp1/b;

    .line 47
    .line 48
    const/16 v1, 0x11

    .line 49
    .line 50
    invoke-direct {p1, v1}, Lp1/b;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lp1/b;

    .line 54
    .line 55
    iget-object p1, v0, LD0/d;->n:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, La0/m;

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p1, La0/m;->a:Z

    .line 61
    .line 62
    return-void
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
.end method


# virtual methods
.method public final bridge synthetic a(La0/A;)Lx0/J;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d(La0/A;)Lk0/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LD0/d;

    .line 2
    .line 3
    iget-object v0, v0, LD0/d;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La0/m;

    .line 6
    .line 7
    iput-boolean p1, v0, La0/m;->a:Z

    .line 8
    .line 9
    return-void
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

.method public final c(La0/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LD0/d;

    .line 2
    .line 3
    iget-object v0, v0, LD0/d;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La0/m;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La0/m;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
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

.method public final d(La0/A;)Lk0/g;
    .locals 13

    .line 1
    iget-object v0, p1, La0/A;->b:La0/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll0/e;

    .line 7
    .line 8
    invoke-direct {v0}, Ll0/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, La0/A;->b:La0/w;

    .line 12
    .line 13
    iget-object v2, v2, La0/w;->c:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    new-instance v3, LZ1/e;

    .line 22
    .line 23
    const/16 v4, 0x14

    .line 24
    .line 25
    invoke-direct {v3, v0, v4, v2}, LZ1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v0

    .line 30
    :goto_0
    new-instance v12, Lk0/g;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lf/a;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lf/a;->b(La0/A;)Lm0/i;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:LA0/b;

    .line 39
    .line 40
    iget-wide v10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 41
    .line 42
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lp1/b;

    .line 43
    .line 44
    iget-wide v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 45
    .line 46
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lf0/g;

    .line 47
    .line 48
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LD0/d;

    .line 49
    .line 50
    move-object v0, v12

    .line 51
    move-object v1, p1

    .line 52
    invoke-direct/range {v0 .. v11}, Lk0/g;-><init>(La0/A;Lf0/g;LB0/t;LD0/d;Lp1/b;Lm0/i;LA0/b;JJ)V

    .line 53
    .line 54
    .line 55
    return-object v12
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
