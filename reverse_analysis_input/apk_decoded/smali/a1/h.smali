.class public final La1/h;
.super La1/i;
.source "SourceFile"


# static fields
.field public static final o:[B

.field public static final p:[B


# instance fields
.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, La1/h;->o:[B

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, La1/h;->p:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
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

.method public static e(Ld0/p;[B)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld0/p;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    iget v0, p0, Ld0/p;->b:I

    .line 11
    .line 12
    array-length v1, p1

    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    array-length v3, p1

    .line 16
    invoke-virtual {p0, v1, v2, v3}, Ld0/p;->g([BII)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ld0/p;->H(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
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
.method public final b(Ld0/p;)J
    .locals 4

    .line 1
    iget-object p1, p1, Ld0/p;->a:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-byte v1, p1, v0

    .line 5
    .line 6
    array-length v2, p1

    .line 7
    const/4 v3, 0x1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    aget-byte v0, p1, v3

    .line 11
    .line 12
    :cond_0
    invoke-static {v1, v0}, LF0/b;->l(BB)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget p1, p0, La1/i;->i:I

    .line 17
    .line 18
    int-to-long v2, p1

    .line 19
    mul-long/2addr v2, v0

    .line 20
    const-wide/32 v0, 0xf4240

    .line 21
    .line 22
    .line 23
    div-long/2addr v2, v0

    .line 24
    return-wide v2
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

.method public final c(Ld0/p;JLZ1/l;)Z
    .locals 2

    .line 1
    sget-object p2, La1/h;->o:[B

    .line 2
    .line 3
    invoke-static {p1, p2}, La1/h;->e(Ld0/p;[B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p1, Ld0/p;->a:[B

    .line 11
    .line 12
    iget p1, p1, Ld0/p;->c:I

    .line 13
    .line 14
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 p2, 0x9

    .line 19
    .line 20
    aget-byte p2, p1, p2

    .line 21
    .line 22
    and-int/lit16 p2, p2, 0xff

    .line 23
    .line 24
    invoke-static {p1}, LF0/b;->c([B)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La0/p;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return p3

    .line 35
    :cond_0
    new-instance v0, La0/o;

    .line 36
    .line 37
    invoke-direct {v0}, La0/o;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "audio/opus"

    .line 41
    .line 42
    invoke-static {v1}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, v0, La0/o;->m:Ljava/lang/String;

    .line 47
    .line 48
    iput p2, v0, La0/o;->B:I

    .line 49
    .line 50
    const p2, 0xbb80

    .line 51
    .line 52
    .line 53
    iput p2, v0, La0/o;->C:I

    .line 54
    .line 55
    iput-object p1, v0, La0/o;->p:Ljava/util/List;

    .line 56
    .line 57
    new-instance p1, La0/p;

    .line 58
    .line 59
    invoke-direct {p1, v0}, La0/p;-><init>(La0/o;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 63
    .line 64
    return p3

    .line 65
    :cond_1
    sget-object p2, La1/h;->p:[B

    .line 66
    .line 67
    invoke-static {p1, p2}, La1/h;->e(Ld0/p;[B)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/4 v0, 0x0

    .line 72
    if-eqz p2, :cond_4

    .line 73
    .line 74
    iget-object p2, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, La0/p;

    .line 77
    .line 78
    invoke-static {p2}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-boolean p2, p0, La1/h;->n:Z

    .line 82
    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    return p3

    .line 86
    :cond_2
    iput-boolean p3, p0, La1/h;->n:Z

    .line 87
    .line 88
    const/16 p2, 0x8

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Ld0/p;->I(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v0, v0}, LF0/b;->x(Ld0/p;ZZ)LB0/d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, LB0/d;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, [Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p1}, Lm2/I;->q([Ljava/lang/Object;)Lm2/b0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1}, LF0/b;->u(Ljava/util/List;)La0/F;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    return p3

    .line 112
    :cond_3
    iget-object p2, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p2, La0/p;

    .line 115
    .line 116
    invoke-virtual {p2}, La0/p;->a()La0/o;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iget-object v0, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La0/p;

    .line 123
    .line 124
    iget-object v0, v0, La0/p;->l:La0/F;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, La0/F;->e(La0/F;)La0/F;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p2, La0/o;->k:La0/F;

    .line 131
    .line 132
    new-instance p1, La0/p;

    .line 133
    .line 134
    invoke-direct {p1, p2}, La0/p;-><init>(La0/o;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 138
    .line 139
    return p3

    .line 140
    :cond_4
    iget-object p1, p4, LZ1/l;->l:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, La0/p;

    .line 143
    .line 144
    invoke-static {p1}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return v0
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

.method public final d(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La1/i;->d(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, La1/h;->n:Z

    .line 8
    .line 9
    :cond_0
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
