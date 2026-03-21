.class public final LT1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final m:I

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LT1/i;->l:I

    iput-object p1, p0, LT1/i;->o:Ljava/lang/Object;

    iput p2, p0, LT1/i;->m:I

    iput-object p3, p0, LT1/i;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LT1/i;->l:I

    iput-object p1, p0, LT1/i;->n:Ljava/lang/Object;

    iput-object p2, p0, LT1/i;->o:Ljava/lang/Object;

    iput p3, p0, LT1/i;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LT1/i;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT1/i;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/graphics/Typeface;

    .line 9
    .line 10
    iget v1, p0, LT1/i;->m:I

    .line 11
    .line 12
    iget-object v2, p0, LT1/i;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 32
    .line 33
    iget-object v2, p0, LT1/i;->n:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, LT1/i;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroidx/activity/f;

    .line 44
    .line 45
    iget v2, p0, LT1/i;->m:I

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v1, v2, v3, v0}, Le/i;->a(IILandroid/content/Intent;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, LT1/i;->n:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lf/a;

    .line 55
    .line 56
    iget-object v0, v0, Lf/a;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v1, p0, LT1/i;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Landroidx/activity/f;

    .line 61
    .line 62
    iget-object v2, v1, Le/i;->a:Ljava/util/HashMap;

    .line 63
    .line 64
    iget v3, p0, LT1/i;->m:I

    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/String;

    .line 75
    .line 76
    if-nez v2, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    iget-object v3, v1, Le/i;->e:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Le/g;

    .line 86
    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    iget-object v3, v3, Le/g;->a:Le/b;

    .line 90
    .line 91
    if-nez v3, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object v1, v1, Le/i;->d:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-interface {v3, v0}, Le/b;->a(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    :goto_0
    iget-object v3, v1, Le/i;->g:Landroid/os/Bundle;

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, v1, Le/i;->f:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    return-void

    .line 117
    :pswitch_2
    iget-object v0, p0, LT1/i;->o:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 120
    .line 121
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->p:Landroid/app/NotificationManager;

    .line 122
    .line 123
    iget v1, p0, LT1/i;->m:I

    .line 124
    .line 125
    iget-object v2, p0, LT1/i;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Landroid/app/Notification;

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_3
    iget-object v0, p0, LT1/i;->o:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Landroid/content/Intent;

    .line 136
    .line 137
    iget v1, p0, LT1/i;->m:I

    .line 138
    .line 139
    iget-object v2, p0, LT1/i;->n:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, LT1/j;

    .line 142
    .line 143
    invoke-virtual {v2, v0, v1}, LT1/j;->a(Landroid/content/Intent;I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
