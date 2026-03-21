.class public final Lg4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final m:Ljava/lang/String;


# instance fields
.field public final l:Lg4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "separator"

    .line 4
    .line 5
    invoke-static {v0, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg4/l;->m:Ljava/lang/String;

    .line 9
    .line 10
    return-void
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

.method public constructor <init>(Lg4/b;)V
    .locals 1

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg4/l;->l:Lg4/b;

    .line 10
    .line 11
    return-void
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
.method public final a()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lh4/b;->a(Lg4/l;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    const/16 v3, 0x5c

    .line 12
    .line 13
    iget-object v4, p0, Lg4/l;->l:Lg4/b;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v4}, Lg4/b;->b()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4, v1}, Lg4/b;->g(I)B

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ne v2, v3, :cond_1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {v4}, Lg4/b;->b()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    move v5, v1

    .line 38
    :goto_1
    if-ge v1, v2, :cond_4

    .line 39
    .line 40
    invoke-virtual {v4, v1}, Lg4/b;->g(I)B

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/16 v7, 0x2f

    .line 45
    .line 46
    if-eq v6, v7, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4, v1}, Lg4/b;->g(I)B

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ne v6, v3, :cond_3

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v4, v5, v1}, Lg4/b;->l(II)Lg4/b;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v5, v1, 0x1

    .line 62
    .line 63
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {v4}, Lg4/b;->b()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ge v5, v1, :cond_5

    .line 71
    .line 72
    invoke-virtual {v4}, Lg4/b;->b()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v4, v5, v1}, Lg4/b;->l(II)Lg4/b;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_5
    return-object v0
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

.method public final b()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lh4/b;->a:Lg4/b;

    .line 2
    .line 3
    sget-object v0, Lh4/b;->a:Lg4/b;

    .line 4
    .line 5
    iget-object v1, p0, Lg4/l;->l:Lg4/b;

    .line 6
    .line 7
    invoke-static {v1, v0}, Lg4/b;->i(Lg4/b;Lg4/b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lh4/b;->b:Lg4/b;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lg4/b;->i(Lg4/b;Lg4/b;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    const/4 v3, 0x2

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v0, v2, v3}, Lg4/b;->m(Lg4/b;III)Lg4/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {p0}, Lg4/l;->g()Ljava/lang/Character;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v0, v3, :cond_2

    .line 43
    .line 44
    sget-object v1, Lg4/b;->o:Lg4/b;

    .line 45
    .line 46
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lg4/b;->n()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
    .line 51
.end method

.method public final c()Lg4/l;
    .locals 11

    .line 1
    sget-object v0, Lh4/b;->d:Lg4/b;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/l;->l:Lg4/b;

    .line 4
    .line 5
    invoke-static {v1, v0}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_b

    .line 11
    .line 12
    sget-object v2, Lh4/b;->a:Lg4/b;

    .line 13
    .line 14
    invoke-static {v1, v2}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_b

    .line 19
    .line 20
    sget-object v4, Lh4/b;->b:Lg4/b;

    .line 21
    .line 22
    invoke-static {v1, v4}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_b

    .line 27
    .line 28
    sget-object v5, Lh4/b;->e:Lg4/b;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v6, "suffix"

    .line 34
    .line 35
    invoke-static {v5, v6}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object v7, v5, Lg4/b;->l:[B

    .line 43
    .line 44
    array-length v8, v7

    .line 45
    sub-int/2addr v6, v8

    .line 46
    array-length v7, v7

    .line 47
    invoke-virtual {v1, v6, v5, v7}, Lg4/b;->k(ILg4/b;I)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const/4 v6, 0x3

    .line 52
    const/4 v7, 0x2

    .line 53
    const/4 v8, 0x1

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-ne v5, v7, :cond_0

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_0
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    sub-int/2addr v5, v6

    .line 69
    invoke-virtual {v1, v5, v2, v8}, Lg4/b;->k(ILg4/b;I)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    sub-int/2addr v5, v6

    .line 82
    invoke-virtual {v1, v5, v4, v8}, Lg4/b;->k(ILg4/b;I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :cond_2
    invoke-static {v1, v2}, Lg4/b;->i(Lg4/b;Lg4/b;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v5, -0x1

    .line 95
    if-eq v2, v5, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-static {v1, v4}, Lg4/b;->i(Lg4/b;Lg4/b;)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_0
    const/4 v9, 0x0

    .line 103
    if-ne v2, v7, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Lg4/l;->g()Ljava/lang/Character;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    if-eqz v10, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-ne v0, v6, :cond_4

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    new-instance v3, Lg4/l;

    .line 119
    .line 120
    invoke-static {v1, v9, v6, v8}, Lg4/b;->m(Lg4/b;III)Lg4/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {v3, v0}, Lg4/l;-><init>(Lg4/b;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    if-ne v2, v8, :cond_6

    .line 129
    .line 130
    const-string v6, "prefix"

    .line 131
    .line 132
    invoke-static {v4, v6}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v6, v4, Lg4/b;->l:[B

    .line 136
    .line 137
    array-length v6, v6

    .line 138
    invoke-virtual {v1, v9, v4, v6}, Lg4/b;->k(ILg4/b;I)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    if-ne v2, v5, :cond_8

    .line 146
    .line 147
    invoke-virtual {p0}, Lg4/l;->g()Ljava/lang/Character;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-eqz v4, :cond_8

    .line 152
    .line 153
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-ne v0, v7, :cond_7

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_7
    new-instance v3, Lg4/l;

    .line 161
    .line 162
    invoke-static {v1, v9, v7, v8}, Lg4/b;->m(Lg4/b;III)Lg4/b;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {v3, v0}, Lg4/l;-><init>(Lg4/b;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_8
    if-ne v2, v5, :cond_9

    .line 171
    .line 172
    new-instance v3, Lg4/l;

    .line 173
    .line 174
    invoke-direct {v3, v0}, Lg4/l;-><init>(Lg4/b;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_9
    if-nez v2, :cond_a

    .line 179
    .line 180
    new-instance v3, Lg4/l;

    .line 181
    .line 182
    invoke-static {v1, v9, v8, v8}, Lg4/b;->m(Lg4/b;III)Lg4/b;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-direct {v3, v0}, Lg4/l;-><init>(Lg4/b;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_a
    new-instance v3, Lg4/l;

    .line 191
    .line 192
    invoke-static {v1, v9, v2, v8}, Lg4/b;->m(Lg4/b;III)Lg4/b;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {v3, v0}, Lg4/l;-><init>(Lg4/b;)V

    .line 197
    .line 198
    .line 199
    :cond_b
    :goto_1
    return-object v3
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

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lg4/l;

    .line 2
    .line 3
    const-string v0, "other"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/l;->l:Lg4/b;

    .line 9
    .line 10
    iget-object p1, p1, Lg4/l;->l:Lg4/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lg4/b;->a(Lg4/b;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
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

.method public final d(Ljava/lang/String;)Lg4/l;
    .locals 1

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lg4/a;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lg4/a;->v(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-static {v0, p1}, Lh4/b;->d(Lg4/a;Z)Lg4/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0, p1}, Lh4/b;->b(Lg4/l;Lg4/l;Z)Lg4/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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

.method public final e()Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/l;->l:Lg4/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg4/b;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lg4/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lg4/l;

    .line 6
    .line 7
    iget-object p1, p1, Lg4/l;->l:Lg4/b;

    .line 8
    .line 9
    iget-object v0, p0, Lg4/l;->l:Lg4/b;

    .line 10
    .line 11
    invoke-static {p1, v0}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
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

.method public final f()Ljava/nio/file/Path;
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/l;->l:Lg4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg4/b;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/dexterous/flutterlocalnotifications/b;->q(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "get(toString())"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public final g()Ljava/lang/Character;
    .locals 4

    .line 1
    sget-object v0, Lh4/b;->a:Lg4/b;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/l;->l:Lg4/b;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lg4/b;->e(Lg4/b;Lg4/b;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v1}, Lg4/b;->b()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x2

    .line 19
    if-ge v0, v2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    invoke-virtual {v1, v0}, Lg4/b;->g(I)B

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v2, 0x3a

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    invoke-virtual {v1, v0}, Lg4/b;->g(I)B

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-char v0, v0

    .line 38
    const/16 v1, 0x61

    .line 39
    .line 40
    if-gt v1, v0, :cond_3

    .line 41
    .line 42
    const/16 v1, 0x7b

    .line 43
    .line 44
    if-ge v0, v1, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/16 v1, 0x41

    .line 48
    .line 49
    if-gt v1, v0, :cond_4

    .line 50
    .line 51
    const/16 v1, 0x5b

    .line 52
    .line 53
    if-ge v0, v1, :cond_4

    .line 54
    .line 55
    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_4
    :goto_1
    return-object v3
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/l;->l:Lg4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg4/b;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/l;->l:Lg4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg4/b;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
