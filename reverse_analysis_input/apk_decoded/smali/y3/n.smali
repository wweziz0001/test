.class public final synthetic Ly3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:Ly3/p;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Ly3/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/n;->l:Ly3/p;

    iput-object p2, p0, Ly3/n;->m:Ljava/lang/String;

    iput-object p3, p0, Ly3/n;->n:Ljava/lang/String;

    iput-object p4, p0, Ly3/n;->o:Ljava/lang/String;

    iput-object p5, p0, Ly3/n;->p:Ljava/lang/String;

    iput-wide p6, p0, Ly3/n;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    new-instance v0, Ly3/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly3/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Ly3/n;->l:Ly3/p;

    .line 8
    .line 9
    iget-object v1, v2, Ly3/p;->a:Ly3/j;

    .line 10
    .line 11
    iget-object v3, p0, Ly3/n;->m:Ljava/lang/String;

    .line 12
    .line 13
    const-string v4, "urlArg"

    .line 14
    .line 15
    invoke-static {v3, v4}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, Ly3/n;->n:Ljava/lang/String;

    .line 19
    .line 20
    const-string v5, "userAgentArg"

    .line 21
    .line 22
    invoke-static {v4, v5}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Ly3/n;->o:Ljava/lang/String;

    .line 26
    .line 27
    const-string v6, "contentDispositionArg"

    .line 28
    .line 29
    invoke-static {v5, v6}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v6, p0, Ly3/n;->p:Ljava/lang/String;

    .line 33
    .line 34
    const-string v7, "mimetypeArg"

    .line 35
    .line 36
    invoke-static {v6, v7}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Ly3/j;->a:LA/e;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v7, v1, LA/e;->n:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Ly3/c;

    .line 47
    .line 48
    invoke-virtual {v7, v2}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-nez v7, :cond_0

    .line 53
    .line 54
    const-string v0, ""

    .line 55
    .line 56
    const-string v1, "missing-instance-error"

    .line 57
    .line 58
    const-string v2, "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager."

    .line 59
    .line 60
    invoke-static {v1, v2, v0}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v1}, LA/e;->e()Ln3/m;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    new-instance v8, LZ1/i;

    .line 69
    .line 70
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart"

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    iget-object v1, v1, LA/e;->m:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ln3/f;

    .line 76
    .line 77
    invoke-direct {v8, v1, v9, v7, v10}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 78
    .line 79
    .line 80
    iget-wide v9, p0, Ly3/n;->q:J

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Ls2/l;

    .line 95
    .line 96
    const/16 v3, 0xf

    .line 97
    .line 98
    invoke-direct {v2, v0, v3}, Ls2/l;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v1, v2}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 102
    .line 103
    .line 104
    :goto_0
    return-void
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
