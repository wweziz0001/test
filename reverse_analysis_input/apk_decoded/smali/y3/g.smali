.class public final Ly3/g;
.super Lg;
.source "SourceFile"


# instance fields
.field public final e:LA/e;


# direct methods
.method public constructor <init>(LA/e;)V
    .locals 1

    .line 1
    const-string v0, "registrar"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Lg;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ly3/g;->e:LA/e;

    .line 11
    .line 12
    return-void
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

.method public static final l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Failed to create new Dart proxy instance of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ": "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ". "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "PigeonProxyApiBaseCodec"

    .line 32
    .line 33
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void
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
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, -0x80

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Ln3/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    .line 15
    .line 16
    invoke-static {p1, p2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iget-object v0, p0, Ly3/g;->e:LA/e;

    .line 26
    .line 27
    iget-object v0, v0, LA/e;->n:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ly3/c;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ly3/c;->e(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Failed to find instance with identifier: "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "PigeonProxyApiBaseCodec"

    .line 52
    .line 53
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    return-object v0

    .line 57
    :cond_1
    invoke-super {p0, p1, p2}, Lg;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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
.end method

.method public final k(Ln3/v;Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez v3, :cond_46

    .line 10
    .line 11
    instance-of v3, v2, [B

    .line 12
    .line 13
    if-nez v3, :cond_46

    .line 14
    .line 15
    instance-of v3, v2, Ljava/lang/Double;

    .line 16
    .line 17
    if-nez v3, :cond_46

    .line 18
    .line 19
    instance-of v3, v2, [D

    .line 20
    .line 21
    if-nez v3, :cond_46

    .line 22
    .line 23
    instance-of v3, v2, [F

    .line 24
    .line 25
    if-nez v3, :cond_46

    .line 26
    .line 27
    instance-of v3, v2, Ljava/lang/Integer;

    .line 28
    .line 29
    if-nez v3, :cond_46

    .line 30
    .line 31
    instance-of v3, v2, [I

    .line 32
    .line 33
    if-nez v3, :cond_46

    .line 34
    .line 35
    instance-of v3, v2, Ljava/util/List;

    .line 36
    .line 37
    if-nez v3, :cond_46

    .line 38
    .line 39
    instance-of v3, v2, Ljava/lang/Long;

    .line 40
    .line 41
    if-nez v3, :cond_46

    .line 42
    .line 43
    instance-of v3, v2, [J

    .line 44
    .line 45
    if-nez v3, :cond_46

    .line 46
    .line 47
    instance-of v3, v2, Ljava/util/Map;

    .line 48
    .line 49
    if-nez v3, :cond_46

    .line 50
    .line 51
    instance-of v3, v2, Ljava/lang/String;

    .line 52
    .line 53
    if-nez v3, :cond_46

    .line 54
    .line 55
    instance-of v3, v2, Ly3/q;

    .line 56
    .line 57
    if-nez v3, :cond_46

    .line 58
    .line 59
    instance-of v3, v2, Ly3/k;

    .line 60
    .line 61
    if-nez v3, :cond_46

    .line 62
    .line 63
    instance-of v3, v2, Ly3/u;

    .line 64
    .line 65
    if-nez v3, :cond_46

    .line 66
    .line 67
    instance-of v3, v2, Ly3/L;

    .line 68
    .line 69
    if-nez v3, :cond_46

    .line 70
    .line 71
    instance-of v3, v2, Ly3/t;

    .line 72
    .line 73
    if-nez v3, :cond_46

    .line 74
    .line 75
    if-nez v2, :cond_0

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_0
    instance-of v3, v2, Landroid/webkit/WebResourceRequest;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    iget-object v5, v0, Ly3/g;->e:LA/e;

    .line 83
    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-object v3, v2

    .line 90
    check-cast v3, Landroid/webkit/WebResourceRequest;

    .line 91
    .line 92
    new-instance v6, Ly3/f;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-direct {v6, v2, v7}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    iget-object v7, v5, LA/e;->n:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ly3/c;

    .line 101
    .line 102
    invoke-virtual {v7, v3}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_1

    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_1
    invoke-virtual {v7, v3}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v9}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    if-nez v13, :cond_2

    .line 143
    .line 144
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    :goto_0
    move-object/from16 v16, v3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    invoke-interface {v3}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    goto :goto_0

    .line 156
    :goto_1
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    new-instance v14, LZ1/i;

    .line 161
    .line 162
    iget-object v13, v5, LA/e;->m:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v13, Ln3/f;

    .line 165
    .line 166
    const-string v0, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance"

    .line 167
    .line 168
    invoke-direct {v14, v13, v0, v3, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    move-object v10, v0

    .line 188
    move-object v12, v3

    .line 189
    move-object v0, v14

    .line 190
    move-object v14, v4

    .line 191
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {v3}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    new-instance v4, Ly3/v;

    .line 200
    .line 201
    const/16 v7, 0x13

    .line 202
    .line 203
    invoke-direct {v4, v6, v7}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v3, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_4

    .line 210
    .line 211
    :cond_3
    instance-of v0, v2, Landroid/webkit/WebResourceResponse;

    .line 212
    .line 213
    if-eqz v0, :cond_5

    .line 214
    .line 215
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-object v0, v2

    .line 219
    check-cast v0, Landroid/webkit/WebResourceResponse;

    .line 220
    .line 221
    new-instance v3, Ly3/f;

    .line 222
    .line 223
    const/16 v6, 0x19

    .line 224
    .line 225
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 226
    .line 227
    .line 228
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Ly3/c;

    .line 231
    .line 232
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_4

    .line 237
    .line 238
    goto/16 :goto_4

    .line 239
    .line 240
    :cond_4
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 241
    .line 242
    .line 243
    move-result-wide v6

    .line 244
    invoke-virtual {v0}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    int-to-long v8, v0

    .line 249
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    new-instance v10, LZ1/i;

    .line 254
    .line 255
    iget-object v11, v5, LA/e;->m:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v11, Ln3/f;

    .line 258
    .line 259
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance"

    .line 260
    .line 261
    invoke-direct {v10, v11, v12, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    filled-new-array {v0, v4}, [Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v4, Ly3/v;

    .line 281
    .line 282
    const/16 v6, 0x14

    .line 283
    .line 284
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_4

    .line 291
    .line 292
    :cond_5
    instance-of v0, v2, Landroid/webkit/WebResourceError;

    .line 293
    .line 294
    if-eqz v0, :cond_7

    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-object v0, v2

    .line 300
    check-cast v0, Landroid/webkit/WebResourceError;

    .line 301
    .line 302
    new-instance v3, Ly3/f;

    .line 303
    .line 304
    const/16 v6, 0xc

    .line 305
    .line 306
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 307
    .line 308
    .line 309
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v6, Ly3/c;

    .line 312
    .line 313
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-eqz v7, :cond_6

    .line 318
    .line 319
    goto/16 :goto_4

    .line 320
    .line 321
    :cond_6
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 322
    .line 323
    .line 324
    move-result-wide v6

    .line 325
    invoke-virtual {v0}, Landroid/webkit/WebResourceError;->getErrorCode()I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    int-to-long v8, v8

    .line 330
    invoke-virtual {v0}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 339
    .line 340
    .line 341
    move-result-object v10

    .line 342
    new-instance v11, LZ1/i;

    .line 343
    .line 344
    iget-object v12, v5, LA/e;->m:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v12, Ln3/f;

    .line 347
    .line 348
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance"

    .line 349
    .line 350
    invoke-direct {v11, v12, v13, v10, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    filled-new-array {v4, v6, v0}, [Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    new-instance v4, Ly3/v;

    .line 370
    .line 371
    const/16 v6, 0x12

    .line 372
    .line 373
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v11, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_4

    .line 380
    .line 381
    :cond_7
    instance-of v0, v2, Ly3/X;

    .line 382
    .line 383
    if-eqz v0, :cond_9

    .line 384
    .line 385
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-object v0, v2

    .line 389
    check-cast v0, Ly3/X;

    .line 390
    .line 391
    new-instance v3, Ly3/f;

    .line 392
    .line 393
    const/16 v6, 0xd

    .line 394
    .line 395
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 396
    .line 397
    .line 398
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v6, Ly3/c;

    .line 401
    .line 402
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-eqz v7, :cond_8

    .line 407
    .line 408
    goto/16 :goto_4

    .line 409
    .line 410
    :cond_8
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v6

    .line 414
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    new-instance v9, LZ1/i;

    .line 419
    .line 420
    iget-object v10, v5, LA/e;->m:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v10, Ln3/f;

    .line 423
    .line 424
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance"

    .line 425
    .line 426
    invoke-direct {v9, v10, v11, v8, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    iget-wide v6, v0, Ly3/X;->a:J

    .line 434
    .line 435
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    iget-wide v7, v0, Ly3/X;->b:J

    .line 440
    .line 441
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    filled-new-array {v4, v6, v0}, [Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    new-instance v4, Ly3/v;

    .line 454
    .line 455
    const/16 v6, 0x1b

    .line 456
    .line 457
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v9, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_4

    .line 464
    .line 465
    :cond_9
    instance-of v0, v2, Landroid/webkit/ConsoleMessage;

    .line 466
    .line 467
    const/4 v3, 0x3

    .line 468
    const/4 v6, 0x1

    .line 469
    if-eqz v0, :cond_10

    .line 470
    .line 471
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-object v0, v2

    .line 475
    check-cast v0, Landroid/webkit/ConsoleMessage;

    .line 476
    .line 477
    new-instance v7, Ly3/f;

    .line 478
    .line 479
    const/16 v8, 0xe

    .line 480
    .line 481
    invoke-direct {v7, v2, v8}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 482
    .line 483
    .line 484
    iget-object v8, v5, LA/e;->n:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v8, Ly3/c;

    .line 487
    .line 488
    invoke-virtual {v8, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v9

    .line 492
    if-eqz v9, :cond_a

    .line 493
    .line 494
    goto/16 :goto_4

    .line 495
    .line 496
    :cond_a
    invoke-virtual {v8, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 497
    .line 498
    .line 499
    move-result-wide v8

    .line 500
    invoke-virtual {v0}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 501
    .line 502
    .line 503
    move-result v10

    .line 504
    int-to-long v10, v10

    .line 505
    invoke-virtual {v0}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v12

    .line 509
    sget-object v13, Ly3/l;->a:[I

    .line 510
    .line 511
    invoke-virtual {v0}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 512
    .line 513
    .line 514
    move-result-object v14

    .line 515
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 516
    .line 517
    .line 518
    move-result v14

    .line 519
    aget v13, v13, v14

    .line 520
    .line 521
    if-eq v13, v6, :cond_f

    .line 522
    .line 523
    const/4 v6, 0x2

    .line 524
    if-eq v13, v6, :cond_e

    .line 525
    .line 526
    if-eq v13, v3, :cond_d

    .line 527
    .line 528
    const/4 v3, 0x4

    .line 529
    if-eq v13, v3, :cond_c

    .line 530
    .line 531
    const/4 v3, 0x5

    .line 532
    if-eq v13, v3, :cond_b

    .line 533
    .line 534
    sget-object v3, Ly3/k;->s:Ly3/k;

    .line 535
    .line 536
    goto :goto_2

    .line 537
    :cond_b
    sget-object v3, Ly3/k;->n:Ly3/k;

    .line 538
    .line 539
    goto :goto_2

    .line 540
    :cond_c
    sget-object v3, Ly3/k;->o:Ly3/k;

    .line 541
    .line 542
    goto :goto_2

    .line 543
    :cond_d
    sget-object v3, Ly3/k;->r:Ly3/k;

    .line 544
    .line 545
    goto :goto_2

    .line 546
    :cond_e
    sget-object v3, Ly3/k;->p:Ly3/k;

    .line 547
    .line 548
    goto :goto_2

    .line 549
    :cond_f
    sget-object v3, Ly3/k;->q:Ly3/k;

    .line 550
    .line 551
    :goto_2
    invoke-virtual {v0}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    new-instance v13, LZ1/i;

    .line 560
    .line 561
    iget-object v14, v5, LA/e;->m:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v14, Ln3/f;

    .line 564
    .line 565
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance"

    .line 566
    .line 567
    invoke-direct {v13, v14, v15, v6, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 568
    .line 569
    .line 570
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 575
    .line 576
    .line 577
    move-result-object v6

    .line 578
    filled-new-array {v4, v6, v12, v3, v0}, [Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    new-instance v3, Ly3/v;

    .line 587
    .line 588
    const/4 v4, 0x1

    .line 589
    invoke-direct {v3, v7, v4}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v13, v0, v3}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_4

    .line 596
    .line 597
    :cond_10
    instance-of v0, v2, Landroid/webkit/CookieManager;

    .line 598
    .line 599
    if-eqz v0, :cond_12

    .line 600
    .line 601
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-object v0, v2

    .line 605
    check-cast v0, Landroid/webkit/CookieManager;

    .line 606
    .line 607
    new-instance v3, Ly3/f;

    .line 608
    .line 609
    const/16 v6, 0xf

    .line 610
    .line 611
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 612
    .line 613
    .line 614
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v6, Ly3/c;

    .line 617
    .line 618
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    if-eqz v7, :cond_11

    .line 623
    .line 624
    goto/16 :goto_4

    .line 625
    .line 626
    :cond_11
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 627
    .line 628
    .line 629
    move-result-wide v6

    .line 630
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    new-instance v8, LZ1/i;

    .line 635
    .line 636
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v9, Ln3/f;

    .line 639
    .line 640
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance"

    .line 641
    .line 642
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 643
    .line 644
    .line 645
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    new-instance v4, Ly3/v;

    .line 654
    .line 655
    const/4 v6, 0x2

    .line 656
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 660
    .line 661
    .line 662
    goto/16 :goto_4

    .line 663
    .line 664
    :cond_12
    instance-of v0, v2, Landroid/webkit/WebView;

    .line 665
    .line 666
    if-eqz v0, :cond_14

    .line 667
    .line 668
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-object v0, v2

    .line 672
    check-cast v0, Landroid/webkit/WebView;

    .line 673
    .line 674
    new-instance v3, Ly3/f;

    .line 675
    .line 676
    const/16 v6, 0x10

    .line 677
    .line 678
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v6, Ly3/c;

    .line 684
    .line 685
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    if-eqz v7, :cond_13

    .line 690
    .line 691
    goto/16 :goto_4

    .line 692
    .line 693
    :cond_13
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 694
    .line 695
    .line 696
    move-result-wide v6

    .line 697
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    new-instance v8, LZ1/i;

    .line 702
    .line 703
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v9, Ln3/f;

    .line 706
    .line 707
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"

    .line 708
    .line 709
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 710
    .line 711
    .line 712
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    new-instance v4, Ly3/v;

    .line 721
    .line 722
    const/16 v6, 0x18

    .line 723
    .line 724
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 728
    .line 729
    .line 730
    goto/16 :goto_4

    .line 731
    .line 732
    :cond_14
    instance-of v0, v2, Landroid/webkit/WebSettings;

    .line 733
    .line 734
    if-eqz v0, :cond_16

    .line 735
    .line 736
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    move-object v0, v2

    .line 740
    check-cast v0, Landroid/webkit/WebSettings;

    .line 741
    .line 742
    new-instance v3, Ly3/f;

    .line 743
    .line 744
    const/16 v6, 0x11

    .line 745
    .line 746
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 747
    .line 748
    .line 749
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v6, Ly3/c;

    .line 752
    .line 753
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    if-eqz v7, :cond_15

    .line 758
    .line 759
    goto/16 :goto_4

    .line 760
    .line 761
    :cond_15
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 762
    .line 763
    .line 764
    move-result-wide v6

    .line 765
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    new-instance v8, LZ1/i;

    .line 770
    .line 771
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v9, Ln3/f;

    .line 774
    .line 775
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance"

    .line 776
    .line 777
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 778
    .line 779
    .line 780
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    new-instance v4, Ly3/v;

    .line 789
    .line 790
    const/16 v6, 0x15

    .line 791
    .line 792
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_4

    .line 799
    .line 800
    :cond_16
    instance-of v0, v2, Ly3/s;

    .line 801
    .line 802
    const-string v7, "new-instance-error"

    .line 803
    .line 804
    const-string v8, ""

    .line 805
    .line 806
    if-eqz v0, :cond_18

    .line 807
    .line 808
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-object v0, v2

    .line 812
    check-cast v0, Ly3/s;

    .line 813
    .line 814
    iget-object v3, v5, LA/e;->n:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v3, Ly3/c;

    .line 817
    .line 818
    invoke-virtual {v3, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    const-string v3, "JavaScriptChannel"

    .line 823
    .line 824
    if-eqz v0, :cond_17

    .line 825
    .line 826
    goto/16 :goto_4

    .line 827
    .line 828
    :cond_17
    new-instance v0, Ly3/a;

    .line 829
    .line 830
    const-string v4, "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method."

    .line 831
    .line 832
    invoke-direct {v0, v7, v4, v8}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-static {v0}, LB3/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-static {v3, v2, v0}, Ly3/g;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 844
    .line 845
    .line 846
    goto/16 :goto_4

    .line 847
    .line 848
    :cond_18
    instance-of v0, v2, Landroid/webkit/WebViewClient;

    .line 849
    .line 850
    if-eqz v0, :cond_1a

    .line 851
    .line 852
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    move-object v0, v2

    .line 856
    check-cast v0, Landroid/webkit/WebViewClient;

    .line 857
    .line 858
    new-instance v3, Ly3/f;

    .line 859
    .line 860
    const/16 v6, 0xb

    .line 861
    .line 862
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 863
    .line 864
    .line 865
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v6, Ly3/c;

    .line 868
    .line 869
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v7

    .line 873
    if-eqz v7, :cond_19

    .line 874
    .line 875
    goto/16 :goto_4

    .line 876
    .line 877
    :cond_19
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 878
    .line 879
    .line 880
    move-result-wide v6

    .line 881
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    new-instance v8, LZ1/i;

    .line 886
    .line 887
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v9, Ln3/f;

    .line 890
    .line 891
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance"

    .line 892
    .line 893
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 894
    .line 895
    .line 896
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    new-instance v4, Ly3/v;

    .line 905
    .line 906
    const/16 v6, 0x19

    .line 907
    .line 908
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 912
    .line 913
    .line 914
    goto/16 :goto_4

    .line 915
    .line 916
    :cond_1a
    instance-of v0, v2, Landroid/webkit/DownloadListener;

    .line 917
    .line 918
    if-eqz v0, :cond_1c

    .line 919
    .line 920
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    move-object v0, v2

    .line 924
    check-cast v0, Landroid/webkit/DownloadListener;

    .line 925
    .line 926
    iget-object v3, v5, LA/e;->n:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v3, Ly3/c;

    .line 929
    .line 930
    invoke-virtual {v3, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    const-string v3, "DownloadListener"

    .line 935
    .line 936
    if-eqz v0, :cond_1b

    .line 937
    .line 938
    goto/16 :goto_4

    .line 939
    .line 940
    :cond_1b
    new-instance v0, Ly3/a;

    .line 941
    .line 942
    const-string v4, "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method."

    .line 943
    .line 944
    invoke-direct {v0, v7, v4, v8}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-static {v0}, LB3/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-static {v3, v2, v0}, Ly3/g;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_4

    .line 959
    .line 960
    :cond_1c
    instance-of v0, v2, Ly3/Q;

    .line 961
    .line 962
    if-eqz v0, :cond_1e

    .line 963
    .line 964
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    move-object v0, v2

    .line 968
    check-cast v0, Ly3/Q;

    .line 969
    .line 970
    iget-object v3, v5, LA/e;->n:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v3, Ly3/c;

    .line 973
    .line 974
    invoke-virtual {v3, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    const-string v3, "WebChromeClient"

    .line 979
    .line 980
    if-eqz v0, :cond_1d

    .line 981
    .line 982
    goto/16 :goto_4

    .line 983
    .line 984
    :cond_1d
    new-instance v0, Ly3/a;

    .line 985
    .line 986
    const-string v4, "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method."

    .line 987
    .line 988
    invoke-direct {v0, v7, v4, v8}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-static {v0}, LB3/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v3, v2, v0}, Ly3/g;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 1000
    .line 1001
    .line 1002
    goto/16 :goto_4

    .line 1003
    .line 1004
    :cond_1e
    instance-of v0, v2, Ly3/r;

    .line 1005
    .line 1006
    if-eqz v0, :cond_20

    .line 1007
    .line 1008
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    move-object v0, v2

    .line 1012
    check-cast v0, Ly3/r;

    .line 1013
    .line 1014
    new-instance v3, Ly3/f;

    .line 1015
    .line 1016
    const/16 v6, 0x12

    .line 1017
    .line 1018
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1019
    .line 1020
    .line 1021
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v6, Ly3/c;

    .line 1024
    .line 1025
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v7

    .line 1029
    if-eqz v7, :cond_1f

    .line 1030
    .line 1031
    goto/16 :goto_4

    .line 1032
    .line 1033
    :cond_1f
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1034
    .line 1035
    .line 1036
    move-result-wide v6

    .line 1037
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    new-instance v8, LZ1/i;

    .line 1042
    .line 1043
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v9, Ln3/f;

    .line 1046
    .line 1047
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance"

    .line 1048
    .line 1049
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    new-instance v4, Ly3/v;

    .line 1061
    .line 1062
    const/4 v6, 0x6

    .line 1063
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1067
    .line 1068
    .line 1069
    goto/16 :goto_4

    .line 1070
    .line 1071
    :cond_20
    instance-of v0, v2, Landroid/webkit/WebStorage;

    .line 1072
    .line 1073
    if-eqz v0, :cond_22

    .line 1074
    .line 1075
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    move-object v0, v2

    .line 1079
    check-cast v0, Landroid/webkit/WebStorage;

    .line 1080
    .line 1081
    new-instance v3, Ly3/f;

    .line 1082
    .line 1083
    const/16 v6, 0x13

    .line 1084
    .line 1085
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1086
    .line 1087
    .line 1088
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1089
    .line 1090
    check-cast v6, Ly3/c;

    .line 1091
    .line 1092
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v7

    .line 1096
    if-eqz v7, :cond_21

    .line 1097
    .line 1098
    goto/16 :goto_4

    .line 1099
    .line 1100
    :cond_21
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v6

    .line 1104
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    new-instance v8, LZ1/i;

    .line 1109
    .line 1110
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v9, Ln3/f;

    .line 1113
    .line 1114
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance"

    .line 1115
    .line 1116
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1117
    .line 1118
    .line 1119
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    new-instance v4, Ly3/v;

    .line 1128
    .line 1129
    const/16 v6, 0x16

    .line 1130
    .line 1131
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1135
    .line 1136
    .line 1137
    goto/16 :goto_4

    .line 1138
    .line 1139
    :cond_22
    instance-of v0, v2, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1140
    .line 1141
    if-eqz v0, :cond_27

    .line 1142
    .line 1143
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    move-object v0, v2

    .line 1147
    check-cast v0, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1148
    .line 1149
    new-instance v7, Ly3/f;

    .line 1150
    .line 1151
    const/16 v8, 0x14

    .line 1152
    .line 1153
    invoke-direct {v7, v2, v8}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v8, v5, LA/e;->n:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v8, Ly3/c;

    .line 1159
    .line 1160
    invoke-virtual {v8, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v9

    .line 1164
    if-eqz v9, :cond_23

    .line 1165
    .line 1166
    goto/16 :goto_4

    .line 1167
    .line 1168
    :cond_23
    invoke-virtual {v8, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v8

    .line 1172
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 1173
    .line 1174
    .line 1175
    move-result v10

    .line 1176
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v11

    .line 1180
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v11

    .line 1184
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 1185
    .line 1186
    .line 1187
    move-result v12

    .line 1188
    if-eqz v12, :cond_26

    .line 1189
    .line 1190
    if-eq v12, v6, :cond_25

    .line 1191
    .line 1192
    if-eq v12, v3, :cond_24

    .line 1193
    .line 1194
    sget-object v3, Ly3/q;->q:Ly3/q;

    .line 1195
    .line 1196
    goto :goto_3

    .line 1197
    :cond_24
    sget-object v3, Ly3/q;->p:Ly3/q;

    .line 1198
    .line 1199
    goto :goto_3

    .line 1200
    :cond_25
    sget-object v3, Ly3/q;->o:Ly3/q;

    .line 1201
    .line 1202
    goto :goto_3

    .line 1203
    :cond_26
    sget-object v3, Ly3/q;->n:Ly3/q;

    .line 1204
    .line 1205
    :goto_3
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient$FileChooserParams;->getFilenameHint()Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v6

    .line 1213
    new-instance v12, LZ1/i;

    .line 1214
    .line 1215
    iget-object v13, v5, LA/e;->m:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v13, Ln3/f;

    .line 1218
    .line 1219
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance"

    .line 1220
    .line 1221
    invoke-direct {v12, v13, v14, v6, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v4

    .line 1228
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v6

    .line 1232
    filled-new-array {v4, v6, v11, v3, v0}, [Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    new-instance v3, Ly3/v;

    .line 1241
    .line 1242
    const/4 v4, 0x5

    .line 1243
    invoke-direct {v3, v7, v4}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v12, v0, v3}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1247
    .line 1248
    .line 1249
    goto/16 :goto_4

    .line 1250
    .line 1251
    :cond_27
    instance-of v0, v2, Landroid/webkit/PermissionRequest;

    .line 1252
    .line 1253
    if-eqz v0, :cond_29

    .line 1254
    .line 1255
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    move-object v0, v2

    .line 1259
    check-cast v0, Landroid/webkit/PermissionRequest;

    .line 1260
    .line 1261
    new-instance v3, Ly3/f;

    .line 1262
    .line 1263
    const/16 v6, 0x15

    .line 1264
    .line 1265
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v6, Ly3/c;

    .line 1271
    .line 1272
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v7

    .line 1276
    if-eqz v7, :cond_28

    .line 1277
    .line 1278
    goto/16 :goto_4

    .line 1279
    .line 1280
    :cond_28
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1281
    .line 1282
    .line 1283
    move-result-wide v6

    .line 1284
    invoke-virtual {v0}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v8

    .line 1296
    new-instance v9, LZ1/i;

    .line 1297
    .line 1298
    iget-object v10, v5, LA/e;->m:Ljava/lang/Object;

    .line 1299
    .line 1300
    check-cast v10, Ln3/f;

    .line 1301
    .line 1302
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance"

    .line 1303
    .line 1304
    invoke-direct {v9, v10, v11, v8, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1305
    .line 1306
    .line 1307
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v4

    .line 1311
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    new-instance v4, Ly3/v;

    .line 1320
    .line 1321
    const/16 v6, 0xa

    .line 1322
    .line 1323
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v9, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1327
    .line 1328
    .line 1329
    goto/16 :goto_4

    .line 1330
    .line 1331
    :cond_29
    instance-of v0, v2, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1332
    .line 1333
    if-eqz v0, :cond_2b

    .line 1334
    .line 1335
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1336
    .line 1337
    .line 1338
    move-object v0, v2

    .line 1339
    check-cast v0, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1340
    .line 1341
    new-instance v3, Ly3/f;

    .line 1342
    .line 1343
    const/16 v6, 0x16

    .line 1344
    .line 1345
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1346
    .line 1347
    .line 1348
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v6, Ly3/c;

    .line 1351
    .line 1352
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v7

    .line 1356
    if-eqz v7, :cond_2a

    .line 1357
    .line 1358
    goto/16 :goto_4

    .line 1359
    .line 1360
    :cond_2a
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1361
    .line 1362
    .line 1363
    move-result-wide v6

    .line 1364
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    new-instance v8, LZ1/i;

    .line 1369
    .line 1370
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v9, Ln3/f;

    .line 1373
    .line 1374
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance"

    .line 1375
    .line 1376
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    new-instance v4, Ly3/v;

    .line 1388
    .line 1389
    const/4 v6, 0x3

    .line 1390
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1394
    .line 1395
    .line 1396
    goto/16 :goto_4

    .line 1397
    .line 1398
    :cond_2b
    instance-of v0, v2, Landroid/view/View;

    .line 1399
    .line 1400
    if-eqz v0, :cond_2d

    .line 1401
    .line 1402
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1403
    .line 1404
    .line 1405
    move-object v0, v2

    .line 1406
    check-cast v0, Landroid/view/View;

    .line 1407
    .line 1408
    new-instance v3, Ly3/f;

    .line 1409
    .line 1410
    const/16 v6, 0x17

    .line 1411
    .line 1412
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1413
    .line 1414
    .line 1415
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v6, Ly3/c;

    .line 1418
    .line 1419
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v7

    .line 1423
    if-eqz v7, :cond_2c

    .line 1424
    .line 1425
    goto/16 :goto_4

    .line 1426
    .line 1427
    :cond_2c
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1428
    .line 1429
    .line 1430
    move-result-wide v6

    .line 1431
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    new-instance v8, LZ1/i;

    .line 1436
    .line 1437
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v9, Ln3/f;

    .line 1440
    .line 1441
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance"

    .line 1442
    .line 1443
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1444
    .line 1445
    .line 1446
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    new-instance v4, Ly3/v;

    .line 1455
    .line 1456
    const/16 v6, 0x11

    .line 1457
    .line 1458
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1462
    .line 1463
    .line 1464
    goto/16 :goto_4

    .line 1465
    .line 1466
    :cond_2d
    instance-of v0, v2, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1467
    .line 1468
    if-eqz v0, :cond_2f

    .line 1469
    .line 1470
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1471
    .line 1472
    .line 1473
    move-object v0, v2

    .line 1474
    check-cast v0, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1475
    .line 1476
    new-instance v3, Ly3/f;

    .line 1477
    .line 1478
    const/16 v6, 0x18

    .line 1479
    .line 1480
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1481
    .line 1482
    .line 1483
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1484
    .line 1485
    check-cast v6, Ly3/c;

    .line 1486
    .line 1487
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v7

    .line 1491
    if-eqz v7, :cond_2e

    .line 1492
    .line 1493
    goto/16 :goto_4

    .line 1494
    .line 1495
    :cond_2e
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1496
    .line 1497
    .line 1498
    move-result-wide v6

    .line 1499
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    new-instance v8, LZ1/i;

    .line 1504
    .line 1505
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v9, Ln3/f;

    .line 1508
    .line 1509
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance"

    .line 1510
    .line 1511
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1512
    .line 1513
    .line 1514
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    new-instance v4, Ly3/v;

    .line 1523
    .line 1524
    const/4 v6, 0x7

    .line 1525
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1529
    .line 1530
    .line 1531
    goto/16 :goto_4

    .line 1532
    .line 1533
    :cond_2f
    instance-of v0, v2, Landroid/webkit/HttpAuthHandler;

    .line 1534
    .line 1535
    if-eqz v0, :cond_31

    .line 1536
    .line 1537
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1538
    .line 1539
    .line 1540
    move-object v0, v2

    .line 1541
    check-cast v0, Landroid/webkit/HttpAuthHandler;

    .line 1542
    .line 1543
    new-instance v3, Ly3/f;

    .line 1544
    .line 1545
    const/4 v6, 0x1

    .line 1546
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1547
    .line 1548
    .line 1549
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1550
    .line 1551
    check-cast v6, Ly3/c;

    .line 1552
    .line 1553
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1554
    .line 1555
    .line 1556
    move-result v7

    .line 1557
    if-eqz v7, :cond_30

    .line 1558
    .line 1559
    goto/16 :goto_4

    .line 1560
    .line 1561
    :cond_30
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1562
    .line 1563
    .line 1564
    move-result-wide v6

    .line 1565
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v0

    .line 1569
    new-instance v8, LZ1/i;

    .line 1570
    .line 1571
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1572
    .line 1573
    check-cast v9, Ln3/f;

    .line 1574
    .line 1575
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance"

    .line 1576
    .line 1577
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0

    .line 1588
    new-instance v4, Ly3/v;

    .line 1589
    .line 1590
    const/16 v6, 0x8

    .line 1591
    .line 1592
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1596
    .line 1597
    .line 1598
    goto/16 :goto_4

    .line 1599
    .line 1600
    :cond_31
    instance-of v0, v2, Landroid/os/Message;

    .line 1601
    .line 1602
    if-eqz v0, :cond_33

    .line 1603
    .line 1604
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1605
    .line 1606
    .line 1607
    move-object v0, v2

    .line 1608
    check-cast v0, Landroid/os/Message;

    .line 1609
    .line 1610
    new-instance v3, Ly3/f;

    .line 1611
    .line 1612
    const/4 v6, 0x2

    .line 1613
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1614
    .line 1615
    .line 1616
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v6, Ly3/c;

    .line 1619
    .line 1620
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1621
    .line 1622
    .line 1623
    move-result v7

    .line 1624
    if-eqz v7, :cond_32

    .line 1625
    .line 1626
    goto/16 :goto_4

    .line 1627
    .line 1628
    :cond_32
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1629
    .line 1630
    .line 1631
    move-result-wide v6

    .line 1632
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    new-instance v8, LZ1/i;

    .line 1637
    .line 1638
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1639
    .line 1640
    check-cast v9, Ln3/f;

    .line 1641
    .line 1642
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance"

    .line 1643
    .line 1644
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1645
    .line 1646
    .line 1647
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0

    .line 1655
    new-instance v4, LI2/g;

    .line 1656
    .line 1657
    const/16 v6, 0x1c

    .line 1658
    .line 1659
    invoke-direct {v4, v3, v6}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1663
    .line 1664
    .line 1665
    goto/16 :goto_4

    .line 1666
    .line 1667
    :cond_33
    instance-of v0, v2, Landroid/webkit/ClientCertRequest;

    .line 1668
    .line 1669
    if-eqz v0, :cond_35

    .line 1670
    .line 1671
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1672
    .line 1673
    .line 1674
    move-object v0, v2

    .line 1675
    check-cast v0, Landroid/webkit/ClientCertRequest;

    .line 1676
    .line 1677
    new-instance v3, Ly3/f;

    .line 1678
    .line 1679
    const/4 v6, 0x3

    .line 1680
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1681
    .line 1682
    .line 1683
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1684
    .line 1685
    check-cast v6, Ly3/c;

    .line 1686
    .line 1687
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v7

    .line 1691
    if-eqz v7, :cond_34

    .line 1692
    .line 1693
    goto/16 :goto_4

    .line 1694
    .line 1695
    :cond_34
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1696
    .line 1697
    .line 1698
    move-result-wide v6

    .line 1699
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    new-instance v8, LZ1/i;

    .line 1704
    .line 1705
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v9, Ln3/f;

    .line 1708
    .line 1709
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance"

    .line 1710
    .line 1711
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1712
    .line 1713
    .line 1714
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v0

    .line 1722
    new-instance v4, Ly3/v;

    .line 1723
    .line 1724
    const/4 v6, 0x0

    .line 1725
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1729
    .line 1730
    .line 1731
    goto/16 :goto_4

    .line 1732
    .line 1733
    :cond_35
    instance-of v0, v2, Ljava/security/PrivateKey;

    .line 1734
    .line 1735
    if-eqz v0, :cond_37

    .line 1736
    .line 1737
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1738
    .line 1739
    .line 1740
    move-object v0, v2

    .line 1741
    check-cast v0, Ljava/security/PrivateKey;

    .line 1742
    .line 1743
    new-instance v3, Ly3/f;

    .line 1744
    .line 1745
    const/4 v6, 0x4

    .line 1746
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1747
    .line 1748
    .line 1749
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1750
    .line 1751
    check-cast v6, Ly3/c;

    .line 1752
    .line 1753
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1754
    .line 1755
    .line 1756
    move-result v7

    .line 1757
    if-eqz v7, :cond_36

    .line 1758
    .line 1759
    goto/16 :goto_4

    .line 1760
    .line 1761
    :cond_36
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1762
    .line 1763
    .line 1764
    move-result-wide v6

    .line 1765
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    new-instance v8, LZ1/i;

    .line 1770
    .line 1771
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1772
    .line 1773
    check-cast v9, Ln3/f;

    .line 1774
    .line 1775
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance"

    .line 1776
    .line 1777
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1778
    .line 1779
    .line 1780
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v0

    .line 1788
    new-instance v4, Ly3/v;

    .line 1789
    .line 1790
    const/16 v6, 0xb

    .line 1791
    .line 1792
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1796
    .line 1797
    .line 1798
    goto/16 :goto_4

    .line 1799
    .line 1800
    :cond_37
    instance-of v0, v2, Ljava/security/cert/X509Certificate;

    .line 1801
    .line 1802
    if-eqz v0, :cond_39

    .line 1803
    .line 1804
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1805
    .line 1806
    .line 1807
    move-object v0, v2

    .line 1808
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1809
    .line 1810
    new-instance v3, Ly3/f;

    .line 1811
    .line 1812
    const/4 v6, 0x5

    .line 1813
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1814
    .line 1815
    .line 1816
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v6, Ly3/c;

    .line 1819
    .line 1820
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1821
    .line 1822
    .line 1823
    move-result v7

    .line 1824
    if-eqz v7, :cond_38

    .line 1825
    .line 1826
    goto/16 :goto_4

    .line 1827
    .line 1828
    :cond_38
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1829
    .line 1830
    .line 1831
    move-result-wide v6

    .line 1832
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v0

    .line 1836
    new-instance v8, LZ1/i;

    .line 1837
    .line 1838
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1839
    .line 1840
    check-cast v9, Ln3/f;

    .line 1841
    .line 1842
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance"

    .line 1843
    .line 1844
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1845
    .line 1846
    .line 1847
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v0

    .line 1851
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v0

    .line 1855
    new-instance v4, Ly3/v;

    .line 1856
    .line 1857
    const/16 v6, 0x1c

    .line 1858
    .line 1859
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1860
    .line 1861
    .line 1862
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1863
    .line 1864
    .line 1865
    goto/16 :goto_4

    .line 1866
    .line 1867
    :cond_39
    instance-of v0, v2, Landroid/webkit/SslErrorHandler;

    .line 1868
    .line 1869
    if-eqz v0, :cond_3b

    .line 1870
    .line 1871
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1872
    .line 1873
    .line 1874
    move-object v0, v2

    .line 1875
    check-cast v0, Landroid/webkit/SslErrorHandler;

    .line 1876
    .line 1877
    new-instance v3, Ly3/f;

    .line 1878
    .line 1879
    const/4 v6, 0x6

    .line 1880
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1881
    .line 1882
    .line 1883
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1884
    .line 1885
    check-cast v6, Ly3/c;

    .line 1886
    .line 1887
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v7

    .line 1891
    if-eqz v7, :cond_3a

    .line 1892
    .line 1893
    goto/16 :goto_4

    .line 1894
    .line 1895
    :cond_3a
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1896
    .line 1897
    .line 1898
    move-result-wide v6

    .line 1899
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    new-instance v8, LZ1/i;

    .line 1904
    .line 1905
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 1906
    .line 1907
    check-cast v9, Ln3/f;

    .line 1908
    .line 1909
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance"

    .line 1910
    .line 1911
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1912
    .line 1913
    .line 1914
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    new-instance v4, Ly3/v;

    .line 1923
    .line 1924
    const/16 v6, 0x10

    .line 1925
    .line 1926
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 1930
    .line 1931
    .line 1932
    goto/16 :goto_4

    .line 1933
    .line 1934
    :cond_3b
    instance-of v0, v2, Landroid/net/http/SslError;

    .line 1935
    .line 1936
    if-eqz v0, :cond_3d

    .line 1937
    .line 1938
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1939
    .line 1940
    .line 1941
    move-object v0, v2

    .line 1942
    check-cast v0, Landroid/net/http/SslError;

    .line 1943
    .line 1944
    new-instance v3, Ly3/f;

    .line 1945
    .line 1946
    const/4 v6, 0x7

    .line 1947
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 1948
    .line 1949
    .line 1950
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 1951
    .line 1952
    check-cast v6, Ly3/c;

    .line 1953
    .line 1954
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 1955
    .line 1956
    .line 1957
    move-result v7

    .line 1958
    if-eqz v7, :cond_3c

    .line 1959
    .line 1960
    goto/16 :goto_4

    .line 1961
    .line 1962
    :cond_3c
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 1963
    .line 1964
    .line 1965
    move-result-wide v6

    .line 1966
    invoke-virtual {v0}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v8

    .line 1970
    invoke-virtual {v0}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v9

    .line 1978
    new-instance v10, LZ1/i;

    .line 1979
    .line 1980
    iget-object v11, v5, LA/e;->m:Ljava/lang/Object;

    .line 1981
    .line 1982
    check-cast v11, Ln3/f;

    .line 1983
    .line 1984
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance"

    .line 1985
    .line 1986
    invoke-direct {v10, v11, v12, v9, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 1987
    .line 1988
    .line 1989
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v4

    .line 1993
    filled-new-array {v4, v8, v0}, [Ljava/lang/Object;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v0

    .line 1997
    invoke-static {v0}, LC3/g;->Q([Ljava/lang/Object;)Ljava/util/List;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    new-instance v4, Ly3/v;

    .line 2002
    .line 2003
    const/16 v6, 0xe

    .line 2004
    .line 2005
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 2006
    .line 2007
    .line 2008
    invoke-virtual {v10, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 2009
    .line 2010
    .line 2011
    goto/16 :goto_4

    .line 2012
    .line 2013
    :cond_3d
    instance-of v0, v2, Landroid/net/http/SslCertificate$DName;

    .line 2014
    .line 2015
    if-eqz v0, :cond_3f

    .line 2016
    .line 2017
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2018
    .line 2019
    .line 2020
    move-object v0, v2

    .line 2021
    check-cast v0, Landroid/net/http/SslCertificate$DName;

    .line 2022
    .line 2023
    new-instance v3, Ly3/f;

    .line 2024
    .line 2025
    const/16 v6, 0x8

    .line 2026
    .line 2027
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 2028
    .line 2029
    .line 2030
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 2031
    .line 2032
    check-cast v6, Ly3/c;

    .line 2033
    .line 2034
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 2035
    .line 2036
    .line 2037
    move-result v7

    .line 2038
    if-eqz v7, :cond_3e

    .line 2039
    .line 2040
    goto/16 :goto_4

    .line 2041
    .line 2042
    :cond_3e
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 2043
    .line 2044
    .line 2045
    move-result-wide v6

    .line 2046
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0

    .line 2050
    new-instance v8, LZ1/i;

    .line 2051
    .line 2052
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 2053
    .line 2054
    check-cast v9, Ln3/f;

    .line 2055
    .line 2056
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance"

    .line 2057
    .line 2058
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 2059
    .line 2060
    .line 2061
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v0

    .line 2065
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v0

    .line 2069
    new-instance v4, Ly3/v;

    .line 2070
    .line 2071
    const/16 v6, 0xd

    .line 2072
    .line 2073
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 2074
    .line 2075
    .line 2076
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 2077
    .line 2078
    .line 2079
    goto/16 :goto_4

    .line 2080
    .line 2081
    :cond_3f
    instance-of v0, v2, Landroid/net/http/SslCertificate;

    .line 2082
    .line 2083
    if-eqz v0, :cond_41

    .line 2084
    .line 2085
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2086
    .line 2087
    .line 2088
    move-object v0, v2

    .line 2089
    check-cast v0, Landroid/net/http/SslCertificate;

    .line 2090
    .line 2091
    new-instance v3, Ly3/f;

    .line 2092
    .line 2093
    const/16 v6, 0x9

    .line 2094
    .line 2095
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 2096
    .line 2097
    .line 2098
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 2099
    .line 2100
    check-cast v6, Ly3/c;

    .line 2101
    .line 2102
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 2103
    .line 2104
    .line 2105
    move-result v7

    .line 2106
    if-eqz v7, :cond_40

    .line 2107
    .line 2108
    goto :goto_4

    .line 2109
    :cond_40
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 2110
    .line 2111
    .line 2112
    move-result-wide v6

    .line 2113
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v0

    .line 2117
    new-instance v8, LZ1/i;

    .line 2118
    .line 2119
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 2120
    .line 2121
    check-cast v9, Ln3/f;

    .line 2122
    .line 2123
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance"

    .line 2124
    .line 2125
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 2126
    .line 2127
    .line 2128
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v0

    .line 2132
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v0

    .line 2136
    new-instance v4, Ly3/v;

    .line 2137
    .line 2138
    const/16 v6, 0xc

    .line 2139
    .line 2140
    invoke-direct {v4, v3, v6}, Ly3/v;-><init>(Ljava/lang/Object;I)V

    .line 2141
    .line 2142
    .line 2143
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 2144
    .line 2145
    .line 2146
    goto :goto_4

    .line 2147
    :cond_41
    instance-of v0, v2, Ljava/security/cert/Certificate;

    .line 2148
    .line 2149
    if-eqz v0, :cond_43

    .line 2150
    .line 2151
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2152
    .line 2153
    .line 2154
    move-object v0, v2

    .line 2155
    check-cast v0, Ljava/security/cert/Certificate;

    .line 2156
    .line 2157
    new-instance v3, Ly3/f;

    .line 2158
    .line 2159
    const/16 v6, 0xa

    .line 2160
    .line 2161
    invoke-direct {v3, v2, v6}, Ly3/f;-><init>(Ljava/lang/Object;I)V

    .line 2162
    .line 2163
    .line 2164
    iget-object v6, v5, LA/e;->n:Ljava/lang/Object;

    .line 2165
    .line 2166
    check-cast v6, Ly3/c;

    .line 2167
    .line 2168
    invoke-virtual {v6, v0}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 2169
    .line 2170
    .line 2171
    move-result v7

    .line 2172
    if-eqz v7, :cond_42

    .line 2173
    .line 2174
    goto :goto_4

    .line 2175
    :cond_42
    invoke-virtual {v6, v0}, Ly3/c;->b(Ljava/lang/Object;)J

    .line 2176
    .line 2177
    .line 2178
    move-result-wide v6

    .line 2179
    invoke-virtual {v5}, LA/e;->e()Ln3/m;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    new-instance v8, LZ1/i;

    .line 2184
    .line 2185
    iget-object v9, v5, LA/e;->m:Ljava/lang/Object;

    .line 2186
    .line 2187
    check-cast v9, Ln3/f;

    .line 2188
    .line 2189
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance"

    .line 2190
    .line 2191
    invoke-direct {v8, v9, v10, v0, v4}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 2192
    .line 2193
    .line 2194
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    invoke-static {v0}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    new-instance v4, LI2/g;

    .line 2203
    .line 2204
    const/16 v6, 0x1d

    .line 2205
    .line 2206
    invoke-direct {v4, v3, v6}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 2207
    .line 2208
    .line 2209
    invoke-virtual {v8, v0, v4}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 2210
    .line 2211
    .line 2212
    :cond_43
    :goto_4
    iget-object v0, v5, LA/e;->n:Ljava/lang/Object;

    .line 2213
    .line 2214
    check-cast v0, Ly3/c;

    .line 2215
    .line 2216
    invoke-virtual {v0, v2}, Ly3/c;->d(Ljava/lang/Object;)Z

    .line 2217
    .line 2218
    .line 2219
    move-result v0

    .line 2220
    if-eqz v0, :cond_45

    .line 2221
    .line 2222
    const/16 v0, 0x80

    .line 2223
    .line 2224
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 2225
    .line 2226
    .line 2227
    iget-object v0, v5, LA/e;->n:Ljava/lang/Object;

    .line 2228
    .line 2229
    check-cast v0, Ly3/c;

    .line 2230
    .line 2231
    invoke-virtual {v0}, Ly3/c;->f()V

    .line 2232
    .line 2233
    .line 2234
    iget-object v3, v0, Ly3/c;->b:Ljava/util/WeakHashMap;

    .line 2235
    .line 2236
    new-instance v4, Ly3/b;

    .line 2237
    .line 2238
    invoke-direct {v4, v2}, Ly3/b;-><init>(Ljava/lang/Object;)V

    .line 2239
    .line 2240
    .line 2241
    invoke-virtual {v3, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v3

    .line 2245
    check-cast v3, Ljava/lang/Long;

    .line 2246
    .line 2247
    if-eqz v3, :cond_44

    .line 2248
    .line 2249
    iget-object v0, v0, Ly3/c;->d:Ljava/util/HashMap;

    .line 2250
    .line 2251
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2252
    .line 2253
    .line 2254
    :cond_44
    move-object/from16 v0, p0

    .line 2255
    .line 2256
    invoke-virtual {v0, v1, v3}, Ly3/g;->k(Ln3/v;Ljava/lang/Object;)V

    .line 2257
    .line 2258
    .line 2259
    return-void

    .line 2260
    :cond_45
    move-object/from16 v0, p0

    .line 2261
    .line 2262
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 2263
    .line 2264
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v3

    .line 2268
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v3

    .line 2272
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2273
    .line 2274
    const-string v5, "Unsupported value: \'"

    .line 2275
    .line 2276
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2277
    .line 2278
    .line 2279
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2280
    .line 2281
    .line 2282
    const-string v2, "\' of type \'"

    .line 2283
    .line 2284
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2285
    .line 2286
    .line 2287
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2288
    .line 2289
    .line 2290
    const-string v2, "\'"

    .line 2291
    .line 2292
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2293
    .line 2294
    .line 2295
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v2

    .line 2299
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2300
    .line 2301
    .line 2302
    throw v1

    .line 2303
    :cond_46
    :goto_5
    invoke-super/range {p0 .. p2}, Lg;->k(Ln3/v;Ljava/lang/Object;)V

    .line 2304
    .line 2305
    .line 2306
    return-void
.end method
