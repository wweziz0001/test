.class public final synthetic Ly3/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:Ly3/V;

.field public final synthetic m:Landroid/webkit/WebView;

.field public final synthetic n:F

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(Ly3/V;Landroid/webkit/WebView;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/U;->l:Ly3/V;

    iput-object p2, p0, Ly3/U;->m:Landroid/webkit/WebView;

    iput p3, p0, Ly3/U;->n:F

    iput p4, p0, Ly3/U;->o:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Ly3/U;->n:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    iget v2, p0, Ly3/U;->o:F

    .line 5
    .line 6
    float-to-double v2, v2

    .line 7
    new-instance v4, Ly3/o;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    invoke-direct {v4, v5}, Ly3/o;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v5, p0, Ly3/U;->l:Ly3/V;

    .line 14
    .line 15
    iget-object v6, v5, Ly3/V;->a:Ly3/j;

    .line 16
    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v7, p0, Ly3/U;->m:Landroid/webkit/WebView;

    .line 21
    .line 22
    const-string v8, "viewArg"

    .line 23
    .line 24
    invoke-static {v7, v8}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v6, v6, Ly3/j;->a:LA/e;

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v8, v6, LA/e;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v8, Ly3/c;

    .line 35
    .line 36
    invoke-virtual {v8, v5}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-nez v8, :cond_0

    .line 41
    .line 42
    const-string v0, ""

    .line 43
    .line 44
    const-string v1, "missing-instance-error"

    .line 45
    .line 46
    const-string v2, "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager."

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v6}, LA/e;->e()Ln3/m;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    new-instance v9, LZ1/i;

    .line 57
    .line 58
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged"

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    iget-object v6, v6, LA/e;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Ln3/f;

    .line 64
    .line 65
    invoke-direct {v9, v6, v10, v8, v11}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    filled-new-array {v5, v7, v0, v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Ly3/H;

    .line 85
    .line 86
    const/16 v2, 0xf

    .line 87
    .line 88
    invoke-direct {v1, v4, v2}, Ly3/H;-><init>(Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v0, v1}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 92
    .line 93
    .line 94
    :goto_0
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
