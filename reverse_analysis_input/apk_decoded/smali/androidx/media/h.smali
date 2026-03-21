.class public final Landroidx/media/h;
.super Landroidx/media/u;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lc/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lc/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/media/h;->e:I

    iput-object p2, p0, Landroidx/media/h;->f:Lc/d;

    invoke-direct {p0, p1}, Landroidx/media/u;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media/h;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/media/u;->c(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Landroidx/media/h;->f:Lc/d;

    .line 11
    .line 12
    iget-object v0, v0, Lc/d;->l:Lc/b;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    :try_start_0
    invoke-interface {v0, v1, p1}, Lc/b;->a0(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :catch_0
    :cond_0
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
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

.method public final d(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media/h;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/Bundle;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media/h;->f:Lc/d;

    .line 9
    .line 10
    iget-object v0, v0, Lc/d;->l:Lc/b;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    invoke-interface {v0, v1, p1}, Lc/b;->a0(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    :cond_0
    return-void

    .line 19
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media/h;->f:Lc/d;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, v0, Lc/d;->l:Lc/b;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    const/4 v1, 0x0

    .line 31
    :try_start_1
    invoke-interface {p1, v0, v1}, Lc/b;->a0(ILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    new-array v3, v2, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 42
    .line 43
    invoke-interface {p1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, [Landroid/os/Parcelable;

    .line 48
    .line 49
    const-string v3, "search_results"

    .line 50
    .line 51
    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, v0, Lc/d;->l:Lc/b;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    :try_start_2
    invoke-interface {p1, v2, v1}, Lc/b;->a0(ILandroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 59
    .line 60
    .line 61
    :catch_1
    :cond_2
    :goto_0
    return-void

    .line 62
    :pswitch_1
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 63
    .line 64
    new-instance v0, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v1, "media_item"

    .line 70
    .line 71
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Landroidx/media/h;->f:Lc/d;

    .line 75
    .line 76
    iget-object p1, p1, Lc/d;->l:Lc/b;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    :try_start_3
    invoke-interface {p1, v1, v0}, Lc/b;->a0(ILandroid/os/Bundle;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    .line 82
    .line 83
    .line 84
    :catch_2
    :cond_3
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method
