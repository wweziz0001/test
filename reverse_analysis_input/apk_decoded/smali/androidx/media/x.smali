.class public final Landroidx/media/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Landroidx/media/a;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Landroid/os/Bundle;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Landroidx/media/y;


# direct methods
.method public synthetic constructor <init>(Landroidx/media/y;Landroidx/media/a;Ljava/lang/String;Landroid/os/Bundle;Lc/d;I)V
    .locals 0

    .line 1
    iput p6, p0, Landroidx/media/x;->l:I

    iput-object p1, p0, Landroidx/media/x;->q:Landroidx/media/y;

    iput-object p2, p0, Landroidx/media/x;->m:Landroidx/media/a;

    iput-object p3, p0, Landroidx/media/x;->n:Ljava/lang/String;

    iput-object p4, p0, Landroidx/media/x;->o:Landroid/os/Bundle;

    iput-object p5, p0, Landroidx/media/x;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/media/y;Landroidx/media/a;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/media/x;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media/x;->q:Landroidx/media/y;

    iput-object p2, p0, Landroidx/media/x;->m:Landroidx/media/a;

    iput-object p3, p0, Landroidx/media/x;->n:Ljava/lang/String;

    iput-object p4, p0, Landroidx/media/x;->p:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/media/x;->o:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media/x;->m:Landroidx/media/a;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/os/Messenger;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Landroidx/media/x;->q:Landroidx/media/y;

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 19
    .line 20
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v2, v0, v3}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroidx/media/k;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media/x;->n:Ljava/lang/String;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, "addSubscription for callback that isn\'t registered id="

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "MBServiceCompat"

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v1, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 54
    .line 55
    iget-object v3, p0, Landroidx/media/x;->p:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Landroid/os/IBinder;

    .line 58
    .line 59
    iget-object v4, p0, Landroidx/media/x;->o:Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-virtual {v1, v2, v0, v3, v4}, Landroidx/media/A;->addSubscription(Ljava/lang/String;Landroidx/media/k;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_0
    iget-object v0, p0, Landroidx/media/x;->m:Landroidx/media/a;

    .line 66
    .line 67
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroid/os/Messenger;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Landroidx/media/x;->q:Landroidx/media/y;

    .line 76
    .line 77
    iget-object v2, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 78
    .line 79
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-virtual {v2, v0, v3}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Landroidx/media/k;

    .line 87
    .line 88
    iget-object v2, p0, Landroidx/media/x;->o:Landroid/os/Bundle;

    .line 89
    .line 90
    iget-object v3, p0, Landroidx/media/x;->n:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v1, "sendCustomAction for callback that isn\'t registered action="

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", extras="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "MBServiceCompat"

    .line 117
    .line 118
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    iget-object v1, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 123
    .line 124
    iget-object v4, p0, Landroidx/media/x;->p:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v4, Lc/d;

    .line 127
    .line 128
    invoke-virtual {v1, v3, v2, v0, v4}, Landroidx/media/A;->performCustomAction(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/k;Lc/d;)V

    .line 129
    .line 130
    .line 131
    :goto_1
    return-void

    .line 132
    :pswitch_1
    iget-object v0, p0, Landroidx/media/x;->m:Landroidx/media/a;

    .line 133
    .line 134
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Landroid/os/Messenger;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object v1, p0, Landroidx/media/x;->q:Landroidx/media/y;

    .line 143
    .line 144
    iget-object v2, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 145
    .line 146
    iget-object v2, v2, Landroidx/media/A;->mConnections:Lq/e;

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-virtual {v2, v0, v3}, Lq/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Landroidx/media/k;

    .line 154
    .line 155
    iget-object v2, p0, Landroidx/media/x;->n:Ljava/lang/String;

    .line 156
    .line 157
    if-nez v0, :cond_2

    .line 158
    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v1, "search for callback that isn\'t registered query="

    .line 162
    .line 163
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v1, "MBServiceCompat"

    .line 174
    .line 175
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_2
    iget-object v1, v1, Landroidx/media/y;->a:Landroidx/media/A;

    .line 180
    .line 181
    iget-object v3, p0, Landroidx/media/x;->o:Landroid/os/Bundle;

    .line 182
    .line 183
    iget-object v4, p0, Landroidx/media/x;->p:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, Lc/d;

    .line 186
    .line 187
    invoke-virtual {v1, v2, v3, v0, v4}, Landroidx/media/A;->performSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/k;Lc/d;)V

    .line 188
    .line 189
    .line 190
    :goto_2
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
