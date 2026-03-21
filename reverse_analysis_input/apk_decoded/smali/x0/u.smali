.class public final Lx0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LF0/n;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;

.field public d:LZ1/e;

.field public e:Z

.field public f:La0/z;


# direct methods
.method public constructor <init>(LF0/n;La0/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/u;->a:LF0/n;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/u;->f:La0/z;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx0/u;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lx0/u;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lx0/u;->e:Z

    .line 24
    .line 25
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
.method public final a(I)Ll2/h;
    .locals 5

    .line 1
    iget-object v0, p0, Lx0/u;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ll2/h;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    iget-object v1, p0, Lx0/u;->d:LZ1/e;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-class v2, Lx0/G;

    .line 22
    .line 23
    if-eqz p1, :cond_5

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq p1, v3, :cond_4

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    if-eq p1, v3, :cond_3

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    if-eq p1, v3, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    if-ne p1, v2, :cond_1

    .line 36
    .line 37
    new-instance v2, Lx0/t;

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-direct {v2, p0, v1, v3}, Lx0/t;-><init>(Ljava/lang/Object;LZ1/e;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string v1, "Unrecognized contentType: "

    .line 47
    .line 48
    invoke-static {v1, p1}, Lb3/a;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_2
    const-class v1, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v2, Lh0/p;

    .line 63
    .line 64
    const/4 v3, 0x4

    .line 65
    invoke-direct {v2, v1, v3}, Lh0/p;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const-class v3, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v3, Lx0/t;

    .line 76
    .line 77
    const/4 v4, 0x2

    .line 78
    invoke-direct {v3, v2, v1, v4}, Lx0/t;-><init>(Ljava/lang/Object;LZ1/e;I)V

    .line 79
    .line 80
    .line 81
    :goto_0
    move-object v2, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const-class v3, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, Lx0/t;

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    invoke-direct {v3, v2, v1, v4}, Lx0/t;-><init>(Ljava/lang/Object;LZ1/e;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    const-class v3, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, Lx0/t;

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-direct {v3, v2, v1, v4}, Lx0/t;-><init>(Ljava/lang/Object;LZ1/e;I)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    return-object v2
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
