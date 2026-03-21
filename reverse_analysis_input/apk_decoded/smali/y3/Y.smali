.class public final synthetic Ly3/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:Ly3/Z;

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Ly3/Z;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/Y;->l:Ly3/Z;

    iput p2, p0, Ly3/Y;->m:I

    iput p3, p0, Ly3/Y;->n:I

    iput p4, p0, Ly3/Y;->o:I

    iput p5, p0, Ly3/Y;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Ly3/Y;->m:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget v2, p0, Ly3/Y;->n:I

    .line 5
    .line 6
    int-to-long v2, v2

    .line 7
    iget v4, p0, Ly3/Y;->o:I

    .line 8
    .line 9
    int-to-long v4, v4

    .line 10
    iget v6, p0, Ly3/Y;->p:I

    .line 11
    .line 12
    int-to-long v6, v6

    .line 13
    new-instance v8, Ly3/o;

    .line 14
    .line 15
    const/4 v9, 0x3

    .line 16
    invoke-direct {v8, v9}, Ly3/o;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v9, p0, Ly3/Y;->l:Ly3/Z;

    .line 20
    .line 21
    iget-object v10, v9, Ly3/Z;->l:Ly3/j;

    .line 22
    .line 23
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v10, v10, Ly3/j;->a:LA/e;

    .line 27
    .line 28
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v11, v10, LA/e;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v11, Ly3/c;

    .line 34
    .line 35
    invoke-virtual {v11, v9}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    if-nez v11, :cond_0

    .line 40
    .line 41
    const-string v0, ""

    .line 42
    .line 43
    const-string v1, "missing-instance-error"

    .line 44
    .line 45
    const-string v2, "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager."

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v10}, LA/e;->e()Ln3/m;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    new-instance v12, LZ1/i;

    .line 56
    .line 57
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    iget-object v10, v10, LA/e;->m:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Ln3/f;

    .line 63
    .line 64
    invoke-direct {v12, v10, v13, v11, v14}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    filled-new-array {v9, v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Ly3/H;

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-direct {v1, v8, v2}, Ly3/H;-><init>(Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v0, v1}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    return-void
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
