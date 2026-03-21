.class public Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;
.super Landroid/support/v4/media/session/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MediaSessionCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ryanheise/audioservice/AudioService;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/support/v4/media/session/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method

.method private eventToButton(Landroid/view/KeyEvent;)Lcom/ryanheise/audioservice/MediaButton;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x4f

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x55

    .line 10
    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x57

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x58

    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    sget-object p1, Lcom/ryanheise/audioservice/MediaButton;->media:Lcom/ryanheise/audioservice/MediaButton;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lcom/ryanheise/audioservice/MediaButton;->previous:Lcom/ryanheise/audioservice/MediaButton;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/MediaButton;->next:Lcom/ryanheise/audioservice/MediaButton;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    sget-object p1, Lcom/ryanheise/audioservice/MediaButton;->media:Lcom/ryanheise/audioservice/MediaButton;

    .line 31
    .line 32
    return-object p1
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


# virtual methods
.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    .line 3
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onAddQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void
.end method

.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .locals 1

    .line 5
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    .line 7
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onAddQueueItemAt(Landroid/support/v4/media/MediaMetadataCompat;I)V

    return-void
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "com.ryanheise.audioservice.action.STOP"

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onStop()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string v0, "com.ryanheise.audioservice.action.FAST_FORWARD"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onFastForward()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-string v0, "com.ryanheise.audioservice.action.REWIND"

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onRewind()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    return-void
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

.method public onFastForward()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onFastForward()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onMediaButtonEvent(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/KeyEvent;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0x4f

    .line 32
    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x82

    .line 36
    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x7e

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    const/16 v1, 0x7f

    .line 44
    .line 45
    if-eq v0, v1, :cond_2

    .line 46
    .line 47
    packed-switch v0, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onPlay()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onFastForward()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_2
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onRewind()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_3
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onStop()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->onPause()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    :pswitch_4
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->eventToButton(Landroid/view/KeyEvent;)Lcom/ryanheise/audioservice/MediaButton;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onClick(Lcom/ryanheise/audioservice/MediaButton;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_2
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

.method public onPause()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPause()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onPlay()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPlay()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onPlayMediaItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPlayMediaItem(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public onPrepare()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPrepare()V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$MediaSessionCallback;->this$0:Lcom/ryanheise/audioservice/AudioService;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->b(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/y;->c(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->getMediaMetadata(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onRemoveQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public onRewind()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onRewind()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onSeekTo(J)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSeekTo(J)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onSetCaptioningEnabled(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetCaptioningEnabled(Z)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onSetPlaybackSpeed(F)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetPlaybackSpeed(F)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onSetRating(Landroid/support/v4/media/RatingCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetRating(Landroid/support/v4/media/RatingCompat;)V

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    return-void
.end method

.method public onSetRepeatMode(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetRepeatMode(I)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onSetShuffleMode(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSetShuffleMode(I)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onSkipToNext()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSkipToNext()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onSkipToPrevious()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSkipToPrevious()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method public onSkipToQueueItem(J)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onSkipToQueueItem(J)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->c()Lcom/ryanheise/audioservice/AudioService$ServiceListener;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$ServiceListener;->onStop()V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method
