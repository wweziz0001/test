.class public final synthetic Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/h;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/d;->l:I

    iput-object p1, p0, Lh0/d;->m:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh0/d;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx0/v;

    .line 7
    .line 8
    new-instance v1, LF0/n;

    .line 9
    .line 10
    invoke-direct {v1}, LF0/n;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lh0/d;->m:Landroid/content/Context;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lx0/v;-><init>(Landroid/content/Context;LF0/n;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lh0/n;

    .line 20
    .line 21
    iget-object v1, p0, Lh0/d;->m:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lh0/n;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    iget-object v0, p0, Lh0/d;->m:Landroid/content/Context;

    .line 28
    .line 29
    sget-object v1, LB0/i;->n:Lm2/b0;

    .line 30
    .line 31
    const-class v1, LB0/i;

    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    sget-object v2, LB0/i;->t:LB0/i;

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    new-instance v2, LB0/h;

    .line 39
    .line 40
    invoke-direct {v2, v0}, LB0/h;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, LB0/i;

    .line 44
    .line 45
    iget-object v5, v2, LB0/h;->b:Ljava/util/HashMap;

    .line 46
    .line 47
    iget-object v7, v2, LB0/h;->d:Ld0/r;

    .line 48
    .line 49
    iget-boolean v8, v2, LB0/h;->e:Z

    .line 50
    .line 51
    iget-object v4, v2, LB0/h;->a:Landroid/content/Context;

    .line 52
    .line 53
    iget v6, v2, LB0/h;->c:I

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    invoke-direct/range {v3 .. v8}, LB0/i;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILd0/r;Z)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LB0/i;->t:LB0/i;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    :goto_0
    sget-object v0, LB0/i;->t:LB0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit v1

    .line 67
    return-object v0

    .line 68
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw v0

    .line 70
    :pswitch_2
    new-instance v0, LA0/u;

    .line 71
    .line 72
    iget-object v1, p0, Lh0/d;->m:Landroid/content/Context;

    .line 73
    .line 74
    invoke-direct {v0, v1}, LA0/u;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_3
    new-instance v0, Lx0/v;

    .line 79
    .line 80
    new-instance v1, LF0/n;

    .line 81
    .line 82
    invoke-direct {v1}, LF0/n;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lh0/d;->m:Landroid/content/Context;

    .line 86
    .line 87
    invoke-direct {v0, v2, v1}, Lx0/v;-><init>(Landroid/content/Context;LF0/n;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_4
    iget-object v0, p0, Lh0/d;->m:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "audio"

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Landroid/media/AudioManager;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
