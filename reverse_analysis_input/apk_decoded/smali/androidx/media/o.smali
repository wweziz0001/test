.class public final Landroidx/media/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Landroidx/media/o;->l:I

    iput-object p1, p0, Landroidx/media/o;->p:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/media/o;->n:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/media/o;->m:Ljava/lang/String;

    iput-object p4, p0, Landroidx/media/o;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media/o;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media/o;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media/a;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Messenger;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/media/o;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroidx/media/y;

    .line 21
    .line 22
    iget-object v2, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 23
    .line 24
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v2, v0, v3}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroidx/media/k;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media/o;->m:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "getMediaItem for callback that isn\'t registered id="

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "MBServiceCompat"

    .line 52
    .line 53
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v1, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 58
    .line 59
    iget-object v3, p0, Landroidx/media/o;->o:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lc/d;

    .line 62
    .line 63
    invoke-virtual {v1, v2, v0, v3}, Landroidx/media/A;->performLoadItem(Ljava/lang/String;Landroidx/media/k;Lc/d;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :pswitch_0
    iget-object v0, p0, Landroidx/media/o;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroidx/media/a;

    .line 70
    .line 71
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Landroid/os/Messenger;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v1, p0, Landroidx/media/o;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Landroidx/media/y;

    .line 82
    .line 83
    iget-object v2, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 84
    .line 85
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-virtual {v2, v0, v3}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Landroidx/media/k;

    .line 93
    .line 94
    const-string v2, "MBServiceCompat"

    .line 95
    .line 96
    iget-object v3, p0, Landroidx/media/o;->m:Ljava/lang/String;

    .line 97
    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v1, "removeSubscription for callback that isn\'t registered id="

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    iget-object v1, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 119
    .line 120
    iget-object v4, p0, Landroidx/media/o;->o:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, Landroid/os/IBinder;

    .line 123
    .line 124
    invoke-virtual {v1, v3, v0, v4}, Landroidx/media/A;->removeSubscription(Ljava/lang/String;Landroidx/media/k;Landroid/os/IBinder;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v1, "removeSubscription called for "

    .line 133
    .line 134
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, " which is not subscribed"

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_2
    :goto_1
    return-void

    .line 153
    :pswitch_1
    const/4 v0, 0x0

    .line 154
    :goto_2
    iget-object v1, p0, Landroidx/media/o;->p:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Landroidx/media/q;

    .line 157
    .line 158
    iget-object v2, v1, Landroidx/media/q;->d:Landroidx/media/A;

    .line 159
    .line 160
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 161
    .line 162
    iget v3, v2, Lq/i;->n:I

    .line 163
    .line 164
    if-ge v0, v3, :cond_4

    .line 165
    .line 166
    invoke-virtual {v2, v0}, Lq/i;->i(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Landroidx/media/k;

    .line 171
    .line 172
    iget-object v3, v2, Landroidx/media/k;->d:Landroidx/media/B;

    .line 173
    .line 174
    iget-object v4, p0, Landroidx/media/o;->n:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Landroidx/media/B;

    .line 177
    .line 178
    invoke-virtual {v3, v4}, Landroidx/media/B;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_3

    .line 183
    .line 184
    iget-object v3, p0, Landroidx/media/o;->m:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v4, p0, Landroidx/media/o;->o:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v4, Landroid/os/Bundle;

    .line 189
    .line 190
    invoke-virtual {v1, v2, v3, v4}, Landroidx/media/q;->f(Landroidx/media/k;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_4
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
