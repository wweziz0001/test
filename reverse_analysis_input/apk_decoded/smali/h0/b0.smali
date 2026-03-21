.class public final synthetic Lh0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lh0/d0;

.field public final synthetic n:Landroid/util/Pair;

.field public final synthetic o:Lx0/z;

.field public final synthetic p:Lu0/g;


# direct methods
.method public synthetic constructor <init>(Lh0/d0;Landroid/util/Pair;Lx0/z;Lu0/g;I)V
    .locals 0

    .line 1
    iput p5, p0, Lh0/b0;->l:I

    iput-object p1, p0, Lh0/b0;->m:Lh0/d0;

    iput-object p2, p0, Lh0/b0;->n:Landroid/util/Pair;

    iput-object p3, p0, Lh0/b0;->o:Lx0/z;

    iput-object p4, p0, Lh0/b0;->p:Lu0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lh0/b0;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/b0;->m:Lh0/d0;

    .line 7
    .line 8
    iget-object v0, v0, Lh0/d0;->m:Lh0/g0;

    .line 9
    .line 10
    iget-object v0, v0, Lh0/g0;->h:Li0/c;

    .line 11
    .line 12
    iget-object v1, p0, Lh0/b0;->n:Landroid/util/Pair;

    .line 13
    .line 14
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lx0/H;

    .line 25
    .line 26
    iget-object v3, p0, Lh0/b0;->o:Lx0/z;

    .line 27
    .line 28
    iget-object v4, p0, Lh0/b0;->p:Lu0/g;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1, v3, v4}, Li0/c;->d(ILx0/H;Lx0/z;Lu0/g;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, Lh0/b0;->m:Lh0/d0;

    .line 35
    .line 36
    iget-object v0, v0, Lh0/d0;->m:Lh0/g0;

    .line 37
    .line 38
    iget-object v0, v0, Lh0/g0;->h:Li0/c;

    .line 39
    .line 40
    iget-object v1, p0, Lh0/b0;->n:Landroid/util/Pair;

    .line 41
    .line 42
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lx0/H;

    .line 53
    .line 54
    iget-object v3, p0, Lh0/b0;->o:Lx0/z;

    .line 55
    .line 56
    iget-object v4, p0, Lh0/b0;->p:Lu0/g;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1, v3, v4}, Li0/c;->b(ILx0/H;Lx0/z;Lu0/g;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    iget-object v0, p0, Lh0/b0;->m:Lh0/d0;

    .line 63
    .line 64
    iget-object v0, v0, Lh0/d0;->m:Lh0/g0;

    .line 65
    .line 66
    iget-object v0, v0, Lh0/g0;->h:Li0/c;

    .line 67
    .line 68
    iget-object v1, p0, Lh0/b0;->n:Landroid/util/Pair;

    .line 69
    .line 70
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lx0/H;

    .line 81
    .line 82
    iget-object v3, p0, Lh0/b0;->o:Lx0/z;

    .line 83
    .line 84
    iget-object v4, p0, Lh0/b0;->p:Lu0/g;

    .line 85
    .line 86
    invoke-virtual {v0, v2, v1, v3, v4}, Li0/c;->a(ILx0/H;Lx0/z;Lu0/g;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
