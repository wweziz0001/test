.class public final Lh0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lh0/t0;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lh0/t0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, v1, v2}, Lh0/t0;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    new-instance v3, Lh0/t0;

    .line 9
    .line 10
    const-wide v4, 0x7fffffffffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {v3, v4, v5, v4, v5}, Lh0/t0;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lh0/t0;

    .line 19
    .line 20
    invoke-direct {v3, v4, v5, v1, v2}, Lh0/t0;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lh0/t0;

    .line 24
    .line 25
    invoke-direct {v3, v1, v2, v4, v5}, Lh0/t0;-><init>(JJ)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lh0/t0;->c:Lh0/t0;

    .line 29
    .line 30
    return-void
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

.method public constructor <init>(JJ)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ltz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Ld0/m;->c(Z)V

    .line 16
    .line 17
    .line 18
    cmp-long v0, p3, v0

    .line 19
    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    move v3, v4

    .line 23
    :cond_1
    invoke-static {v3}, Ld0/m;->c(Z)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lh0/t0;->a:J

    .line 27
    .line 28
    iput-wide p3, p0, Lh0/t0;->b:J

    .line 29
    .line 30
    return-void
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
.method public final a(JJJ)J
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    iget-wide v1, v0, Lh0/t0;->a:J

    .line 3
    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmp-long v5, v1, v3

    .line 7
    .line 8
    iget-wide v6, v0, Lh0/t0;->b:J

    .line 9
    .line 10
    if-nez v5, :cond_0

    .line 11
    .line 12
    cmp-long v5, v6, v3

    .line 13
    .line 14
    if-nez v5, :cond_0

    .line 15
    .line 16
    return-wide p1

    .line 17
    :cond_0
    sget v5, Ld0/w;->a:I

    .line 18
    .line 19
    sub-long v8, p1, v1

    .line 20
    .line 21
    xor-long/2addr v1, p1

    .line 22
    xor-long v10, p1, v8

    .line 23
    .line 24
    and-long/2addr v1, v10

    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-gez v1, :cond_1

    .line 28
    .line 29
    const-wide/high16 v8, -0x8000000000000000L

    .line 30
    .line 31
    :cond_1
    add-long v1, p1, v6

    .line 32
    .line 33
    xor-long v10, p1, v1

    .line 34
    .line 35
    xor-long v5, v6, v1

    .line 36
    .line 37
    and-long/2addr v5, v10

    .line 38
    cmp-long v3, v5, v3

    .line 39
    .line 40
    if-gez v3, :cond_2

    .line 41
    .line 42
    const-wide v1, 0x7fffffffffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    :cond_2
    cmp-long v3, v8, p3

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    if-gtz v3, :cond_3

    .line 52
    .line 53
    cmp-long v3, p3, v1

    .line 54
    .line 55
    if-gtz v3, :cond_3

    .line 56
    .line 57
    move v3, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move v3, v4

    .line 60
    :goto_0
    cmp-long v6, v8, p5

    .line 61
    .line 62
    if-gtz v6, :cond_4

    .line 63
    .line 64
    cmp-long v1, p5, v1

    .line 65
    .line 66
    if-gtz v1, :cond_4

    .line 67
    .line 68
    move v4, v5

    .line 69
    :cond_4
    if-eqz v3, :cond_6

    .line 70
    .line 71
    if-eqz v4, :cond_6

    .line 72
    .line 73
    sub-long v1, p3, p1

    .line 74
    .line 75
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    sub-long v3, p5, p1

    .line 80
    .line 81
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    cmp-long v1, v1, v3

    .line 86
    .line 87
    if-gtz v1, :cond_5

    .line 88
    .line 89
    return-wide p3

    .line 90
    :cond_5
    return-wide p5

    .line 91
    :cond_6
    if-eqz v3, :cond_7

    .line 92
    .line 93
    return-wide p3

    .line 94
    :cond_7
    if-eqz v4, :cond_8

    .line 95
    .line 96
    return-wide p5

    .line 97
    :cond_8
    return-wide v8
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lh0/t0;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lh0/t0;

    .line 18
    .line 19
    iget-wide v2, p0, Lh0/t0;->a:J

    .line 20
    .line 21
    iget-wide v4, p1, Lh0/t0;->a:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-wide v2, p0, Lh0/t0;->b:J

    .line 28
    .line 29
    iget-wide v4, p1, Lh0/t0;->b:J

    .line 30
    .line 31
    cmp-long p1, v2, v4

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v0, v1

    .line 37
    :goto_0
    return v0

    .line 38
    :cond_3
    :goto_1
    return v1
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

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lh0/t0;->a:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    mul-int/lit8 v0, v0, 0x1f

    .line 5
    .line 6
    iget-wide v1, p0, Lh0/t0;->b:J

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
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
