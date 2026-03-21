.class public final Lx0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/f0;


# instance fields
.field public final l:Lx0/f0;

.field public m:Z

.field public final synthetic n:Lx0/d;


# direct methods
.method public constructor <init>(Lx0/d;Lx0/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/c;->n:Lx0/d;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/c;->l:Lx0/f0;

    .line 7
    .line 8
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
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/c;->l:Lx0/f0;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/f0;->a()V

    .line 4
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
.end method

.method public final d(J)I
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/c;->n:Lx0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/d;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x3

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, Lx0/c;->l:Lx0/f0;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Lx0/f0;->d(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public final isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/c;->n:Lx0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/d;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lx0/c;->l:Lx0/f0;

    .line 10
    .line 11
    invoke-interface {v0}, Lx0/f0;->isReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
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

.method public final k(LZ1/e;Lg0/e;I)I
    .locals 11

    .line 1
    iget-object v0, p0, Lx0/c;->n:Lx0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/d;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x3

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget-boolean v1, p0, Lx0/c;->m:Z

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    const/4 v4, -0x4

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput v3, p2, Le0/d;->m:I

    .line 18
    .line 19
    return v4

    .line 20
    :cond_1
    invoke-virtual {v0}, Lx0/d;->h()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    iget-object v1, p0, Lx0/c;->l:Lx0/f0;

    .line 25
    .line 26
    invoke-interface {v1, p1, p2, p3}, Lx0/f0;->k(LZ1/e;Lg0/e;I)I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    const/4 v1, -0x5

    .line 31
    const-wide/high16 v7, -0x8000000000000000L

    .line 32
    .line 33
    if-ne p3, v1, :cond_6

    .line 34
    .line 35
    iget-object p2, p1, LZ1/e;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, La0/p;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget p3, p2, La0/p;->G:I

    .line 43
    .line 44
    iget v2, p2, La0/p;->F:I

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    if-eqz p3, :cond_5

    .line 49
    .line 50
    :cond_2
    iget-wide v3, v0, Lx0/d;->p:J

    .line 51
    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    cmp-long v3, v3, v5

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    move v2, v4

    .line 60
    :cond_3
    iget-wide v5, v0, Lx0/d;->q:J

    .line 61
    .line 62
    cmp-long v0, v5, v7

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    move p3, v4

    .line 67
    :cond_4
    invoke-virtual {p2}, La0/p;->a()La0/o;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput v2, p2, La0/o;->E:I

    .line 72
    .line 73
    iput p3, p2, La0/o;->F:I

    .line 74
    .line 75
    new-instance p3, La0/p;

    .line 76
    .line 77
    invoke-direct {p3, p2}, La0/p;-><init>(La0/o;)V

    .line 78
    .line 79
    .line 80
    iput-object p3, p1, LZ1/e;->n:Ljava/lang/Object;

    .line 81
    .line 82
    :cond_5
    return v1

    .line 83
    :cond_6
    iget-wide v0, v0, Lx0/d;->q:J

    .line 84
    .line 85
    cmp-long p1, v0, v7

    .line 86
    .line 87
    if-eqz p1, :cond_9

    .line 88
    .line 89
    if-ne p3, v4, :cond_7

    .line 90
    .line 91
    iget-wide v9, p2, Lg0/e;->r:J

    .line 92
    .line 93
    cmp-long p1, v9, v0

    .line 94
    .line 95
    if-gez p1, :cond_8

    .line 96
    .line 97
    :cond_7
    if-ne p3, v2, :cond_9

    .line 98
    .line 99
    cmp-long p1, v5, v7

    .line 100
    .line 101
    if-nez p1, :cond_9

    .line 102
    .line 103
    iget-boolean p1, p2, Lg0/e;->q:Z

    .line 104
    .line 105
    if-nez p1, :cond_9

    .line 106
    .line 107
    :cond_8
    invoke-virtual {p2}, Lg0/e;->f()V

    .line 108
    .line 109
    .line 110
    iput v3, p2, Le0/d;->m:I

    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    iput-boolean p1, p0, Lx0/c;->m:Z

    .line 114
    .line 115
    return v4

    .line 116
    :cond_9
    return p3
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
