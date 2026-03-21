.class public final Landroidx/media/m;
.super Landroidx/media/u;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Landroidx/media/a;


# direct methods
.method public constructor <init>(Landroidx/media/s;Ljava/lang/String;Landroidx/media/a;Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Landroidx/media/m;->e:I

    .line 2
    iput-object p3, p0, Landroidx/media/m;->f:Landroidx/media/a;

    invoke-direct {p0, p2}, Landroidx/media/u;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/media/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/media/m;->e:I

    iput-object p2, p0, Landroidx/media/m;->f:Landroidx/media/a;

    invoke-direct {p0, p1}, Landroidx/media/u;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media/m;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService$Result;->detach()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService$Result;->detach()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/media/a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService$Result;->detach()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media/m;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Landroidx/media/a;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 41
    .line 42
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0, v1}, Landroidx/media/a;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    :pswitch_0
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 59
    .line 60
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-virtual {v0, p1}, Landroidx/media/a;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {p1, v1, v2}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroidx/media/a;->d(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    return-void

    .line 81
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    if-nez p1, :cond_3

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    goto :goto_4

    .line 87
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 111
    .line 112
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    move-object p1, v0

    .line 125
    :goto_4
    iget-object v0, p0, Landroidx/media/m;->f:Landroidx/media/a;

    .line 126
    .line 127
    invoke-virtual {v0, p1}, Landroidx/media/a;->d(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
