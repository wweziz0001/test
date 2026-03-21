.class public final Landroid/support/v4/media/session/f;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/support/v4/media/session/g;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/g;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/support/v4/media/session/f;->b:Landroid/support/v4/media/session/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroid/support/v4/media/session/f;->a:Z

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroid/support/v4/media/session/f;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    iget-object v1, p0, Landroid/support/v4/media/session/f;->b:Landroid/support/v4/media/session/g;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :pswitch_0
    goto/16 :goto_0

    .line 14
    .line 15
    :pswitch_1
    invoke-virtual {v1}, Landroid/support/v4/media/session/g;->onSessionReady()V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onShuffleModeChanged(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onCaptioningEnabledChanged(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onRepeatModeChanged(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_5
    invoke-virtual {v1}, Landroid/support/v4/media/session/g;->onSessionDestroyed()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-static {p1}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onExtrasChanged(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/CharSequence;

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onQueueTitleChanged(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onQueueChanged(Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Landroid/support/v4/media/session/k;

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onAudioInfoChanged(Landroid/support/v4/media/session/k;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 106
    .line 107
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/g;->onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_c
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Landroid/support/v4/media/session/y;->a(Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v1, p1, v0}, Landroid/support/v4/media/session/g;->onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 123
    .line 124
    .line 125
    :goto_0
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
