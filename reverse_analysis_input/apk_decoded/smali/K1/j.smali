.class public final LK1/j;
.super LN3/i;
.source "SourceFile"

# interfaces
.implements LM3/a;


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LK1/j;->m:I

    iput-object p1, p0, LK1/j;->n:Ljava/lang/Object;

    iput-object p3, p0, LK1/j;->o:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LN3/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LK1/j;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK1/j;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LW1/d;

    .line 9
    .line 10
    iget-object v0, v0, LW1/d;->a:LX1/f;

    .line 11
    .line 12
    iget-object v1, p0, LK1/j;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LW1/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v2, "listener"

    .line 20
    .line 21
    invoke-static {v1, v2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, LX1/f;->c:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v2

    .line 27
    :try_start_0
    iget-object v3, v0, LX1/f;->d:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v1, v0, LX1/f;->d:Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, LX1/f;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit v2

    .line 50
    sget-object v0, LB3/g;->a:LB3/g;

    .line 51
    .line 52
    return-object v0

    .line 53
    :goto_1
    monitor-exit v2

    .line 54
    throw v0

    .line 55
    :pswitch_0
    iget-object v0, p0, LK1/j;->n:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Landroid/content/Context;

    .line 58
    .line 59
    iget-object v1, p0, LK1/j;->o:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LO/b;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string v1, ".preferences_pb"

    .line 67
    .line 68
    const-string v2, "FlutterSharedPreferences"

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "fileName"

    .line 75
    .line 76
    invoke-static {v1, v2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v3, "datastore/"

    .line 90
    .line 91
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :pswitch_1
    iget-object v0, p0, LK1/j;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, LK1/b;

    .line 102
    .line 103
    iget-object v0, v0, LK1/b;->m:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, LL1/a;

    .line 106
    .line 107
    iget-object v1, p0, LK1/j;->o:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, LK1/i;

    .line 110
    .line 111
    invoke-interface {v0, v1}, LL1/a;->a(LK1/i;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, LB3/g;->a:LB3/g;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
