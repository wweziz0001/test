.class public final Ln3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln3/f;

.field public final b:Ljava/lang/String;

.field public final c:Ln3/r;

.field public final d:La0/z;


# direct methods
.method public constructor <init>(Ln3/f;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ln3/x;->a:Ln3/x;

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v1}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V

    return-void
.end method

.method public constructor <init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ln3/q;->a:Ln3/f;

    .line 5
    iput-object p2, p0, Ln3/q;->b:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Ln3/q;->c:Ln3/r;

    .line 7
    iput-object p4, p0, Ln3/q;->d:La0/z;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V
    .locals 1

    .line 1
    new-instance v0, Ln3/n;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Ln3/n;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ln3/q;->c:Ln3/r;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ln3/r;->d(Ln3/n;)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p2, Ln3/a;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p2, p0, v0, p3}, Ln3/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p3, p0, Ln3/q;->a:Ln3/f;

    .line 23
    .line 24
    iget-object v0, p0, Ln3/q;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p3, v0, p1, p2}, Ln3/f;->h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ln3/e;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final b(Ln3/o;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ln3/q;->b:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v2, p0, Ln3/q;->a:Ln3/f;

    .line 5
    .line 6
    iget-object v3, p0, Ln3/q;->d:La0/z;

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, LZ1/e;

    .line 14
    .line 15
    const/16 v4, 0x12

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v4, v5}, LZ1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v2, v1, v0, v3}, Ln3/f;->d(Ljava/lang/String;Ln3/d;La0/z;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    new-instance v0, LZ1/e;

    .line 29
    .line 30
    const/16 v3, 0x12

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v0, p0, p1, v3, v4}, LZ1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-interface {v2, v1, v0}, Ln3/f;->k(Ljava/lang/String;Ln3/d;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    return-void
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
