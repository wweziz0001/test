.class public final Lv3/c;
.super LL0/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv3/c;->b:I

    invoke-direct {p0, p1}, LL0/e;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final f()La0/A;
    .locals 15

    .line 1
    iget v0, p0, Lv3/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LF0/u;

    .line 7
    .line 8
    invoke-direct {v0}, LF0/u;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, LA0/b;

    .line 12
    .line 13
    invoke-direct {v1}, LA0/b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    sget-object v7, Lm2/b0;->p:Lm2/b0;

    .line 21
    .line 22
    new-instance v1, La0/u;

    .line 23
    .line 24
    invoke-direct {v1}, La0/u;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v14, La0/x;->a:La0/x;

    .line 28
    .line 29
    iget-object v2, p0, LL0/e;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    move-object v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    const/4 v5, 0x0

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    new-instance v11, La0/w;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    move-object v2, v11

    .line 56
    invoke-direct/range {v2 .. v10}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move-object v11, v5

    .line 61
    :goto_2
    new-instance v2, La0/A;

    .line 62
    .line 63
    new-instance v10, La0/t;

    .line 64
    .line 65
    invoke-direct {v10, v0}, La0/s;-><init>(LF0/u;)V

    .line 66
    .line 67
    .line 68
    new-instance v12, La0/v;

    .line 69
    .line 70
    invoke-direct {v12, v1}, La0/v;-><init>(La0/u;)V

    .line 71
    .line 72
    .line 73
    sget-object v13, La0/D;->B:La0/D;

    .line 74
    .line 75
    const-string v9, ""

    .line 76
    .line 77
    move-object v8, v2

    .line 78
    invoke-direct/range {v8 .. v14}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :pswitch_0
    new-instance v0, LF0/u;

    .line 83
    .line 84
    invoke-direct {v0}, LF0/u;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v1, LA0/b;

    .line 88
    .line 89
    invoke-direct {v1}, LA0/b;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    sget-object v7, Lm2/b0;->p:Lm2/b0;

    .line 97
    .line 98
    new-instance v1, La0/u;

    .line 99
    .line 100
    invoke-direct {v1}, La0/u;-><init>()V

    .line 101
    .line 102
    .line 103
    sget-object v14, La0/x;->a:La0/x;

    .line 104
    .line 105
    iget-object v2, p0, LL0/e;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    if-nez v2, :cond_2

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    :goto_3
    move-object v3, v2

    .line 113
    goto :goto_4

    .line 114
    :cond_2
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    goto :goto_3

    .line 119
    :goto_4
    const/4 v5, 0x0

    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    new-instance v11, La0/w;

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    move-object v2, v11

    .line 132
    invoke-direct/range {v2 .. v10}, La0/w;-><init>(Landroid/net/Uri;Ljava/lang/String;La/a;Ljava/util/List;Lm2/I;Ljava/lang/String;J)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_3
    move-object v11, v5

    .line 137
    :goto_5
    new-instance v2, La0/A;

    .line 138
    .line 139
    new-instance v10, La0/t;

    .line 140
    .line 141
    invoke-direct {v10, v0}, La0/s;-><init>(LF0/u;)V

    .line 142
    .line 143
    .line 144
    new-instance v12, La0/v;

    .line 145
    .line 146
    invoke-direct {v12, v1}, La0/v;-><init>(La0/u;)V

    .line 147
    .line 148
    .line 149
    sget-object v13, La0/D;->B:La0/D;

    .line 150
    .line 151
    const-string v9, ""

    .line 152
    .line 153
    move-object v8, v2

    .line 154
    invoke-direct/range {v8 .. v14}, La0/A;-><init>(Ljava/lang/String;La0/t;La0/w;La0/v;La0/D;La0/x;)V

    .line 155
    .line 156
    .line 157
    return-object v2

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final g(Landroid/content/Context;)Lx0/G;
    .locals 1

    .line 1
    iget v0, p0, Lv3/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance v0, Lx0/v;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lx0/v;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
