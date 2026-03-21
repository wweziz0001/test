.class public final LS2/e;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LS2/e;->a:I

    iput-object p1, p0, LS2/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 4

    .line 1
    iget v0, p0, LS2/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LS2/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lj0/d;

    .line 9
    .line 10
    iget-object v0, p1, Lj0/d;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p1, Lj0/d;->i:La0/c;

    .line 13
    .line 14
    iget-object v2, p1, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lj0/b;->b(Landroid/content/Context;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Lj0/d;->a(Lj0/b;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    const-string v0, "addedDevices"

    .line 25
    .line 26
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    array-length v1, p1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    array-length v1, p1

    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-ge v2, v1, :cond_0

    .line 38
    .line 39
    aget-object v3, p1, v2

    .line 40
    .line 41
    invoke-static {v3}, Li4/a;->t(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, LS2/e;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LS2/g;

    .line 58
    .line 59
    const-string v1, "onAudioDevicesAdded"

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1}, LS2/g;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 4

    .line 1
    iget v0, p0, LS2/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS2/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/d;

    .line 9
    .line 10
    iget-object v1, v0, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 11
    .line 12
    invoke-static {p1, v1}, Ld0/w;->k([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, v0, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 20
    .line 21
    :cond_0
    iget-object p1, v0, Lj0/d;->a:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v1, v0, Lj0/d;->i:La0/c;

    .line 24
    .line 25
    iget-object v2, v0, Lj0/d;->h:Landroidx/lifecycle/E;

    .line 26
    .line 27
    invoke-static {p1, v1, v2}, Lj0/b;->b(Landroid/content/Context;La0/c;Landroidx/lifecycle/E;)Lj0/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Lj0/d;->a(Lj0/b;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    const-string v0, "removedDevices"

    .line 36
    .line 37
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    array-length v1, p1

    .line 43
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    array-length v1, p1

    .line 47
    const/4 v2, 0x0

    .line 48
    :goto_0
    if-ge v2, v1, :cond_1

    .line 49
    .line 50
    aget-object v3, p1, v2

    .line 51
    .line 52
    invoke-static {v3}, Li4/a;->t(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v0, p0, LS2/e;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LS2/g;

    .line 69
    .line 70
    const-string v1, "onAudioDevicesRemoved"

    .line 71
    .line 72
    invoke-virtual {v0, v1, p1}, LS2/g;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method
