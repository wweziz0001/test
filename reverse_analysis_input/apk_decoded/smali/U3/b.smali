.class public final LU3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LO3/a;


# instance fields
.field public l:I

.field public m:I

.field public n:I

.field public o:LR3/c;

.field public p:I

.field public final synthetic q:LU3/c;


# direct methods
.method public constructor <init>(LU3/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU3/b;->q:LU3/c;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, LU3/b;->l:I

    .line 8
    .line 9
    iget v0, p1, LU3/c;->b:I

    .line 10
    .line 11
    iget-object p1, p1, LU3/c;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ltz p1, :cond_2

    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-le v0, p1, :cond_1

    .line 24
    .line 25
    move v0, p1

    .line 26
    :cond_1
    :goto_0
    iput v0, p0, LU3/b;->m:I

    .line 27
    .line 28
    iput v0, p0, LU3/b;->n:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 34
    .line 35
    const-string v2, " is less than minimum 0."

    .line 36
    .line 37
    invoke-static {p1, v1, v2}, Lb3/a;->h(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
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
.method public final a()V
    .locals 8

    .line 1
    iget v0, p0, LU3/b;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, LU3/b;->l:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LU3/b;->o:LR3/c;

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, LU3/b;->q:LU3/c;

    .line 14
    .line 15
    iget v3, v2, LU3/c;->c:I

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    iget-object v5, v2, LU3/c;->a:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v6, -0x1

    .line 21
    if-lez v3, :cond_1

    .line 22
    .line 23
    iget v7, p0, LU3/b;->p:I

    .line 24
    .line 25
    add-int/2addr v7, v4

    .line 26
    iput v7, p0, LU3/b;->p:I

    .line 27
    .line 28
    if-ge v7, v3, :cond_2

    .line 29
    .line 30
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-le v0, v3, :cond_3

    .line 35
    .line 36
    :cond_2
    new-instance v0, LR3/c;

    .line 37
    .line 38
    iget v1, p0, LU3/b;->m:I

    .line 39
    .line 40
    invoke-static {v5}, LU3/l;->e0(Ljava/lang/CharSequence;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-direct {v0, v1, v2, v4}, LR3/a;-><init>(III)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LU3/b;->o:LR3/c;

    .line 48
    .line 49
    iput v6, p0, LU3/b;->n:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object v0, v2, LU3/c;->d:LU3/k;

    .line 53
    .line 54
    iget v2, p0, LU3/b;->n:I

    .line 55
    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v5, v2}, LU3/k;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, LB3/b;

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    new-instance v0, LR3/c;

    .line 69
    .line 70
    iget v1, p0, LU3/b;->m:I

    .line 71
    .line 72
    invoke-static {v5}, LU3/l;->e0(Ljava/lang/CharSequence;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-direct {v0, v1, v2, v4}, LR3/a;-><init>(III)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, LU3/b;->o:LR3/c;

    .line 80
    .line 81
    iput v6, p0, LU3/b;->n:I

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget-object v2, v0, LB3/b;->l:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v0, v0, LB3/b;->m:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget v3, p0, LU3/b;->m:I

    .line 101
    .line 102
    const/high16 v5, -0x80000000

    .line 103
    .line 104
    if-gt v2, v5, :cond_5

    .line 105
    .line 106
    sget-object v3, LR3/c;->o:LR3/c;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    new-instance v5, LR3/c;

    .line 110
    .line 111
    add-int/lit8 v6, v2, -0x1

    .line 112
    .line 113
    invoke-direct {v5, v3, v6, v4}, LR3/a;-><init>(III)V

    .line 114
    .line 115
    .line 116
    move-object v3, v5

    .line 117
    :goto_0
    iput-object v3, p0, LU3/b;->o:LR3/c;

    .line 118
    .line 119
    add-int/2addr v2, v0

    .line 120
    iput v2, p0, LU3/b;->m:I

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    move v1, v4

    .line 125
    :cond_6
    add-int/2addr v2, v1

    .line 126
    iput v2, p0, LU3/b;->n:I

    .line 127
    .line 128
    :goto_1
    iput v4, p0, LU3/b;->l:I

    .line 129
    .line 130
    :goto_2
    return-void
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

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LU3/b;->l:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LU3/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, LU3/b;->l:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 v1, 0x0

    .line 16
    :goto_0
    return v1
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

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LU3/b;->l:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LU3/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, LU3/b;->l:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LU3/b;->o:LR3/c;

    .line 14
    .line 15
    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    .line 16
    .line 17
    invoke-static {v0, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, LU3/b;->o:LR3/c;

    .line 22
    .line 23
    iput v1, p0, LU3/b;->l:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
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

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
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
