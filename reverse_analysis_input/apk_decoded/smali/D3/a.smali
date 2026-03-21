.class public final LD3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements LO3/a;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:LC3/a;


# direct methods
.method public constructor <init>(LD3/b;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LD3/a;->l:I

    const-string v0, "list"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LD3/a;->p:LC3/a;

    .line 8
    iput p2, p0, LD3/a;->m:I

    const/4 p2, -0x1

    .line 9
    iput p2, p0, LD3/a;->n:I

    .line 10
    invoke-static {p1}, LD3/b;->h(LD3/b;)I

    move-result p1

    iput p1, p0, LD3/a;->o:I

    return-void
.end method

.method public constructor <init>(LD3/c;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LD3/a;->l:I

    const-string v0, "list"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LD3/a;->p:LC3/a;

    .line 3
    iput p2, p0, LD3/a;->m:I

    const/4 p2, -0x1

    .line 4
    iput p2, p0, LD3/a;->n:I

    .line 5
    invoke-static {p1}, LD3/c;->h(LD3/c;)I

    move-result p1

    iput p1, p0, LD3/a;->o:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LD3/a;->p:LC3/a;

    .line 2
    .line 3
    check-cast v0, LD3/b;

    .line 4
    .line 5
    iget-object v0, v0, LD3/b;->p:LD3/c;

    .line 6
    .line 7
    invoke-static {v0}, LD3/c;->h(LD3/c;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, LD3/a;->o:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
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

.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LD3/a;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LD3/a;->m:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    iput v1, p0, LD3/a;->m:I

    .line 14
    .line 15
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 16
    .line 17
    check-cast v1, LD3/c;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1}, LD3/c;->add(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, LD3/a;->n:I

    .line 24
    .line 25
    invoke-static {v1}, LD3/c;->h(LD3/c;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, LD3/a;->o:I

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    invoke-virtual {p0}, LD3/a;->a()V

    .line 33
    .line 34
    .line 35
    iget v0, p0, LD3/a;->m:I

    .line 36
    .line 37
    add-int/lit8 v1, v0, 0x1

    .line 38
    .line 39
    iput v1, p0, LD3/a;->m:I

    .line 40
    .line 41
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 42
    .line 43
    check-cast v1, LD3/b;

    .line 44
    .line 45
    invoke-virtual {v1, v0, p1}, LD3/b;->add(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, p0, LD3/a;->n:I

    .line 50
    .line 51
    invoke-static {v1}, LD3/b;->h(LD3/b;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, LD3/a;->o:I

    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 60
    .line 61
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, LD3/a;->p:LC3/a;

    .line 2
    .line 3
    check-cast v0, LD3/c;

    .line 4
    .line 5
    invoke-static {v0}, LD3/c;->h(LD3/c;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LD3/a;->o:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
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

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LD3/a;->m:I

    .line 7
    .line 8
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 9
    .line 10
    check-cast v1, LD3/c;

    .line 11
    .line 12
    iget v1, v1, LD3/c;->m:I

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    return v0

    .line 20
    :pswitch_0
    iget v0, p0, LD3/a;->m:I

    .line 21
    .line 22
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 23
    .line 24
    check-cast v1, LD3/b;

    .line 25
    .line 26
    iget v1, v1, LD3/b;->n:I

    .line 27
    .line 28
    if-ge v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_1
    return v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LD3/a;->m:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return v0

    .line 14
    :pswitch_0
    iget v0, p0, LD3/a;->m:I

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_1
    return v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LD3/a;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LD3/a;->m:I

    .line 10
    .line 11
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 12
    .line 13
    check-cast v1, LD3/c;

    .line 14
    .line 15
    iget v2, v1, LD3/c;->m:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, LD3/a;->m:I

    .line 22
    .line 23
    iput v0, p0, LD3/a;->n:I

    .line 24
    .line 25
    iget-object v1, v1, LD3/c;->l:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v1, v0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    invoke-virtual {p0}, LD3/a;->a()V

    .line 37
    .line 38
    .line 39
    iget v0, p0, LD3/a;->m:I

    .line 40
    .line 41
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 42
    .line 43
    check-cast v1, LD3/b;

    .line 44
    .line 45
    iget v2, v1, LD3/b;->n:I

    .line 46
    .line 47
    if-ge v0, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v0, 0x1

    .line 50
    .line 51
    iput v2, p0, LD3/a;->m:I

    .line 52
    .line 53
    iput v0, p0, LD3/a;->n:I

    .line 54
    .line 55
    iget-object v2, v1, LD3/b;->l:[Ljava/lang/Object;

    .line 56
    .line 57
    iget v1, v1, LD3/b;->m:I

    .line 58
    .line 59
    add-int/2addr v1, v0

    .line 60
    aget-object v0, v2, v1

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LD3/a;->m:I

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget v0, p0, LD3/a;->m:I

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LD3/a;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LD3/a;->m:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, LD3/a;->m:I

    .line 16
    .line 17
    iput v0, p0, LD3/a;->n:I

    .line 18
    .line 19
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 20
    .line 21
    check-cast v1, LD3/c;

    .line 22
    .line 23
    iget-object v1, v1, LD3/c;->l:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object v0, v1, v0

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :pswitch_0
    invoke-virtual {p0}, LD3/a;->a()V

    .line 35
    .line 36
    .line 37
    iget v0, p0, LD3/a;->m:I

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    iput v0, p0, LD3/a;->m:I

    .line 44
    .line 45
    iput v0, p0, LD3/a;->n:I

    .line 46
    .line 47
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 48
    .line 49
    check-cast v1, LD3/b;

    .line 50
    .line 51
    iget-object v2, v1, LD3/b;->l:[Ljava/lang/Object;

    .line 52
    .line 53
    iget v1, v1, LD3/b;->m:I

    .line 54
    .line 55
    add-int/2addr v1, v0

    .line 56
    aget-object v0, v2, v1

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LD3/a;->m:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget v0, p0, LD3/a;->m:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LD3/a;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LD3/a;->n:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, LD3/a;->p:LC3/a;

    .line 15
    .line 16
    check-cast v2, LD3/c;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, LD3/c;->g(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget v0, p0, LD3/a;->n:I

    .line 22
    .line 23
    iput v0, p0, LD3/a;->m:I

    .line 24
    .line 25
    iput v1, p0, LD3/a;->n:I

    .line 26
    .line 27
    invoke-static {v2}, LD3/c;->h(LD3/c;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, LD3/a;->o:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :pswitch_0
    invoke-virtual {p0}, LD3/a;->a()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, LD3/a;->n:I

    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    if-eq v0, v1, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, LD3/a;->p:LC3/a;

    .line 51
    .line 52
    check-cast v2, LD3/b;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, LD3/b;->g(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget v0, p0, LD3/a;->n:I

    .line 58
    .line 59
    iput v0, p0, LD3/a;->m:I

    .line 60
    .line 61
    iput v1, p0, LD3/a;->n:I

    .line 62
    .line 63
    invoke-static {v2}, LD3/b;->h(LD3/b;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput v0, p0, LD3/a;->o:I

    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LD3/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LD3/a;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LD3/a;->n:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 15
    .line 16
    check-cast v1, LD3/c;

    .line 17
    .line 18
    invoke-virtual {v1, v0, p1}, LD3/c;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :pswitch_0
    invoke-virtual {p0}, LD3/a;->a()V

    .line 31
    .line 32
    .line 33
    iget v0, p0, LD3/a;->n:I

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, LD3/a;->p:LC3/a;

    .line 39
    .line 40
    check-cast v1, LD3/b;

    .line 41
    .line 42
    invoke-virtual {v1, v0, p1}, LD3/b;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
