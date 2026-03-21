.class public final La0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La0/b;

.field public static final d:La0/a;


# instance fields
.field public final a:I

.field public final b:[La0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La0/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [La0/a;

    .line 5
    .line 6
    invoke-direct {v0, v2}, La0/b;-><init>([La0/a;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La0/b;->c:La0/b;

    .line 10
    .line 11
    new-instance v0, La0/a;

    .line 12
    .line 13
    new-array v6, v1, [I

    .line 14
    .line 15
    new-array v7, v1, [La0/A;

    .line 16
    .line 17
    new-array v8, v1, [J

    .line 18
    .line 19
    const/4 v4, -0x1

    .line 20
    const/4 v5, -0x1

    .line 21
    move-object v3, v0

    .line 22
    invoke-direct/range {v3 .. v8}, La0/a;-><init>(II[I[La0/A;[J)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, La0/a;->e:[I

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-static {v7, v3, v4, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, La0/a;->f:[J

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v9, v2, v3, v10, v11}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, La0/a;->d:[La0/A;

    .line 60
    .line 61
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, [La0/A;

    .line 67
    .line 68
    new-instance v1, La0/a;

    .line 69
    .line 70
    iget v6, v0, La0/a;->b:I

    .line 71
    .line 72
    move-object v4, v1

    .line 73
    invoke-direct/range {v4 .. v9}, La0/a;-><init>(II[I[La0/A;[J)V

    .line 74
    .line 75
    .line 76
    sput-object v1, La0/b;->d:La0/a;

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x2

    .line 83
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x3

    .line 87
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x4

    .line 91
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 92
    .line 93
    .line 94
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public constructor <init>([La0/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    iput v0, p0, La0/b;->a:I

    .line 6
    .line 7
    iput-object p1, p0, La0/b;->b:[La0/a;

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


# virtual methods
.method public final a(I)La0/a;
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La0/b;->d:La0/a;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La0/b;->b:[La0/a;

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    :goto_0
    return-object p1
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

.method public final b(I)Z
    .locals 1

    .line 1
    iget v0, p0, La0/b;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La0/b;->a(I)La0/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

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
    const-class v3, La0/b;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, La0/b;

    .line 18
    .line 19
    sget v2, Ld0/w;->a:I

    .line 20
    .line 21
    iget v2, p0, La0/b;->a:I

    .line 22
    .line 23
    iget v3, p1, La0/b;->a:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, La0/b;->b:[La0/a;

    .line 28
    .line 29
    iget-object p1, p1, La0/b;->b:[La0/a;

    .line 30
    .line 31
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v0, v1

    .line 39
    :goto_0
    return v0

    .line 40
    :cond_3
    :goto_1
    return v1
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
    iget v0, p0, La0/b;->a:I

    .line 2
    .line 3
    mul-int/lit16 v0, v0, 0x3c1

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    long-to-int v1, v1

    .line 8
    add-int/2addr v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    long-to-int v1, v1

    .line 17
    add-int/2addr v0, v1

    .line 18
    mul-int/lit16 v0, v0, 0x3c1

    .line 19
    .line 20
    iget-object v1, p0, La0/b;->b:[La0/a;

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v1, v0

    .line 27
    return v1
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

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, La0/b;->b:[La0/a;

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    const-string v5, "])"

    .line 14
    .line 15
    if-ge v2, v4, :cond_8

    .line 16
    .line 17
    const-string v4, "adGroup(timeUs=0, ads=["

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    aget-object v4, v3, v2

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move v4, v1

    .line 28
    :goto_1
    aget-object v6, v3, v2

    .line 29
    .line 30
    iget-object v6, v6, La0/a;->e:[I

    .line 31
    .line 32
    array-length v6, v6

    .line 33
    const/4 v7, 0x1

    .line 34
    const-string v8, ", "

    .line 35
    .line 36
    if-ge v4, v6, :cond_6

    .line 37
    .line 38
    const-string v6, "ad(state="

    .line 39
    .line 40
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    aget-object v6, v3, v2

    .line 44
    .line 45
    iget-object v6, v6, La0/a;->e:[I

    .line 46
    .line 47
    aget v6, v6, v4

    .line 48
    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    if-eq v6, v7, :cond_3

    .line 52
    .line 53
    const/4 v9, 0x2

    .line 54
    if-eq v6, v9, :cond_2

    .line 55
    .line 56
    const/4 v9, 0x3

    .line 57
    if-eq v6, v9, :cond_1

    .line 58
    .line 59
    const/4 v9, 0x4

    .line 60
    if-eq v6, v9, :cond_0

    .line 61
    .line 62
    const/16 v6, 0x3f

    .line 63
    .line 64
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_0
    const/16 v6, 0x21

    .line 69
    .line 70
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    const/16 v6, 0x50

    .line 75
    .line 76
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/16 v6, 0x53

    .line 81
    .line 82
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const/16 v6, 0x52

    .line 87
    .line 88
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const/16 v6, 0x5f

    .line 93
    .line 94
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :goto_2
    const-string v6, ", durationUs="

    .line 98
    .line 99
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    aget-object v6, v3, v2

    .line 103
    .line 104
    iget-object v6, v6, La0/a;->f:[J

    .line 105
    .line 106
    aget-wide v9, v6, v4

    .line 107
    .line 108
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x29

    .line 112
    .line 113
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    aget-object v6, v3, v2

    .line 117
    .line 118
    iget-object v6, v6, La0/a;->e:[I

    .line 119
    .line 120
    array-length v6, v6

    .line 121
    sub-int/2addr v6, v7

    .line 122
    if-ge v4, v6, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    array-length v3, v3

    .line 134
    sub-int/2addr v3, v7

    .line 135
    if-ge v2, v3, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_8
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method
