.class public final synthetic Lh0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/e;->l:I

    iput-object p3, p0, Lh0/e;->n:Ljava/lang/Object;

    iput p1, p0, Lh0/e;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lh0/N;IZ)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput p3, p0, Lh0/e;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/e;->n:Ljava/lang/Object;

    iput p2, p0, Lh0/e;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lh0/e;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh0/e;->m:I

    .line 7
    .line 8
    and-int/lit8 v0, v0, 0x4

    .line 9
    .line 10
    iget-object v1, p0, Lh0/e;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lio/flutter/plugin/platform/e;

    .line 13
    .line 14
    iget-object v1, v1, Lio/flutter/plugin/platform/e;->b:Lio/flutter/plugin/platform/f;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const-string v3, "SystemChrome.systemUIChange"

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v1, Lio/flutter/plugin/platform/f;->b:LZ1/l;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    filled-new-array {v1}, [Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, LZ1/l;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ln3/q;

    .line 39
    .line 40
    invoke-virtual {v0, v3, v1, v2}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, v1, Lio/flutter/plugin/platform/f;->b:LZ1/l;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    filled-new-array {v1}, [Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v0, v0, LZ1/l;->l:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ln3/q;

    .line 62
    .line 63
    invoke-virtual {v0, v3, v1, v2}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :pswitch_0
    iget-object v0, p0, Lh0/e;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lh0/N;

    .line 70
    .line 71
    iget-object v1, v0, Lh0/N;->l:[Lh0/o0;

    .line 72
    .line 73
    iget v2, p0, Lh0/e;->m:I

    .line 74
    .line 75
    aget-object v1, v1, v2

    .line 76
    .line 77
    invoke-interface {v1}, Lh0/o0;->getTrackType()I

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, Lh0/N;->I:Li0/c;

    .line 81
    .line 82
    invoke-virtual {v0}, Li0/c;->k()Li0/a;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Lh0/y;

    .line 87
    .line 88
    const/16 v3, 0x15

    .line 89
    .line 90
    invoke-direct {v2, v3}, Lh0/y;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const/16 v3, 0x409

    .line 94
    .line 95
    invoke-virtual {v0, v1, v3, v2}, Li0/c;->l(Li0/a;ILd0/i;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_1
    iget-object v0, p0, Lh0/e;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lh0/f;

    .line 102
    .line 103
    iget-object v0, v0, Lh0/f;->m:Lh0/g;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    iget v2, p0, Lh0/e;->m:I

    .line 110
    .line 111
    const/4 v3, -0x3

    .line 112
    const/4 v4, -0x2

    .line 113
    if-eq v2, v3, :cond_4

    .line 114
    .line 115
    if-eq v2, v4, :cond_4

    .line 116
    .line 117
    const/4 v3, 0x2

    .line 118
    const/4 v4, -0x1

    .line 119
    if-eq v2, v4, :cond_2

    .line 120
    .line 121
    if-eq v2, v1, :cond_1

    .line 122
    .line 123
    const-string v0, "Unknown focus change type: "

    .line 124
    .line 125
    const-string v1, "AudioFocusManager"

    .line 126
    .line 127
    invoke-static {v2, v0, v1}, Lb3/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_1
    invoke-virtual {v0, v3}, Lh0/g;->c(I)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v0, Lh0/g;->c:Lh0/D;

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    iget-object v0, v0, Lh0/D;->l:Lh0/G;

    .line 139
    .line 140
    invoke-virtual {v0}, Lh0/G;->D()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v0, v1, v1, v2}, Lh0/G;->a0(IIZ)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_2
    iget-object v2, v0, Lh0/g;->c:Lh0/D;

    .line 149
    .line 150
    if-eqz v2, :cond_3

    .line 151
    .line 152
    iget-object v2, v2, Lh0/D;->l:Lh0/G;

    .line 153
    .line 154
    invoke-virtual {v2}, Lh0/G;->D()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-virtual {v2, v4, v3, v5}, Lh0/G;->a0(IIZ)V

    .line 159
    .line 160
    .line 161
    :cond_3
    invoke-virtual {v0}, Lh0/g;->a()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lh0/g;->c(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    const/4 v3, 0x0

    .line 169
    if-eq v2, v4, :cond_7

    .line 170
    .line 171
    iget-object v2, v0, Lh0/g;->d:La0/c;

    .line 172
    .line 173
    if-eqz v2, :cond_5

    .line 174
    .line 175
    iget v2, v2, La0/c;->a:I

    .line 176
    .line 177
    if-ne v2, v1, :cond_5

    .line 178
    .line 179
    move v2, v1

    .line 180
    goto :goto_1

    .line 181
    :cond_5
    move v2, v3

    .line 182
    :goto_1
    if-eqz v2, :cond_6

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    const/4 v1, 0x4

    .line 186
    invoke-virtual {v0, v1}, Lh0/g;->c(I)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    :goto_2
    iget-object v2, v0, Lh0/g;->c:Lh0/D;

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    iget-object v2, v2, Lh0/D;->l:Lh0/G;

    .line 195
    .line 196
    invoke-virtual {v2}, Lh0/G;->D()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-virtual {v2, v3, v1, v4}, Lh0/G;->a0(IIZ)V

    .line 201
    .line 202
    .line 203
    :cond_8
    const/4 v1, 0x3

    .line 204
    invoke-virtual {v0, v1}, Lh0/g;->c(I)V

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_3
    return-void

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
