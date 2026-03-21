.class public final La0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:LF0/u;

.field public e:LA0/b;

.field public f:Ljava/util/List;

.field public g:Lm2/I;

.field public h:Ljava/lang/String;

.field public i:J

.field public j:La0/D;

.field public k:La0/u;

.field public l:La0/x;


# virtual methods
.method public final a()La0/A;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La0/r;->e:LA0/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v3, v0, La0/r;->b:Landroid/net/Uri;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v1, La0/w;

    .line 14
    .line 15
    iget-object v4, v0, La0/r;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, v0, La0/r;->e:LA0/b;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v7, v0, La0/r;->g:Lm2/I;

    .line 23
    .line 24
    iget-object v8, v0, La0/r;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget-wide v9, v0, La0/r;->i:J

    .line 27
    .line 28
    iget-object v6, v0, La0/r;->f:Ljava/util/List;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    invoke-direct/range {v2 .. v10}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 32
    .line 33
    .line 34
    move-object v14, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v14, v5

    .line 37
    :goto_0
    new-instance v1, La0/A;

    .line 38
    .line 39
    iget-object v2, v0, La0/r;->a:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    :goto_1
    move-object v12, v2

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v2, ""

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :goto_2
    iget-object v2, v0, La0/r;->d:LF0/u;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v13, La0/t;

    .line 54
    .line 55
    invoke-direct {v13, v2}, La0/s;-><init>(LF0/u;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, La0/r;->k:La0/u;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v15, La0/v;

    .line 64
    .line 65
    invoke-direct {v15, v2}, La0/v;-><init>(La0/u;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, La0/r;->j:La0/D;

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    :goto_3
    move-object/from16 v16, v2

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_2
    sget-object v2, La0/D;->B:La0/D;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :goto_4
    iget-object v2, v0, La0/r;->l:La0/x;

    .line 79
    .line 80
    move-object v11, v1

    .line 81
    move-object/from16 v17, v2

    .line 82
    .line 83
    invoke-direct/range {v11 .. v17}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 84
    .line 85
    .line 86
    return-object v1
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
