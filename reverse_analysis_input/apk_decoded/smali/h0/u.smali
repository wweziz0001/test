.class public final synthetic Lh0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/i;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lh0/i0;


# direct methods
.method public synthetic constructor <init>(Lh0/i0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/u;->l:I

    iput-object p1, p0, Lh0/u;->m:Lh0/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lh0/u;->l:I

    .line 2
    .line 3
    check-cast p1, La0/M;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 9
    .line 10
    iget-object v0, v0, Lh0/i0;->i:LA0/A;

    .line 11
    .line 12
    iget-object v0, v0, LA0/A;->d:La0/b0;

    .line 13
    .line 14
    invoke-interface {p1, v0}, La0/M;->onTracksChanged(La0/b0;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 19
    .line 20
    iget-object v0, v0, Lh0/i0;->f:Lh0/o;

    .line 21
    .line 22
    invoke-interface {p1, v0}, La0/M;->onPlayerError(La0/I;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 27
    .line 28
    iget-object v0, v0, Lh0/i0;->f:Lh0/o;

    .line 29
    .line 30
    invoke-interface {p1, v0}, La0/M;->onPlayerErrorChanged(La0/I;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 35
    .line 36
    iget-object v0, v0, Lh0/i0;->o:La0/J;

    .line 37
    .line 38
    invoke-interface {p1, v0}, La0/M;->onPlaybackParametersChanged(La0/J;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 43
    .line 44
    invoke-virtual {v0}, Lh0/i0;->k()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-interface {p1, v0}, La0/M;->onIsPlayingChanged(Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 53
    .line 54
    iget v0, v0, Lh0/i0;->n:I

    .line 55
    .line 56
    invoke-interface {p1, v0}, La0/M;->onPlaybackSuppressionReasonChanged(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_5
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 61
    .line 62
    iget-boolean v1, v0, Lh0/i0;->l:Z

    .line 63
    .line 64
    iget v0, v0, Lh0/i0;->m:I

    .line 65
    .line 66
    invoke-interface {p1, v1, v0}, La0/M;->onPlayWhenReadyChanged(ZI)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_6
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 71
    .line 72
    iget v0, v0, Lh0/i0;->e:I

    .line 73
    .line 74
    invoke-interface {p1, v0}, La0/M;->onPlaybackStateChanged(I)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_7
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 79
    .line 80
    iget-boolean v1, v0, Lh0/i0;->l:Z

    .line 81
    .line 82
    iget v0, v0, Lh0/i0;->e:I

    .line 83
    .line 84
    invoke-interface {p1, v1, v0}, La0/M;->onPlayerStateChanged(ZI)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_8
    iget-object v0, p0, Lh0/u;->m:Lh0/i0;

    .line 89
    .line 90
    iget-boolean v1, v0, Lh0/i0;->g:Z

    .line 91
    .line 92
    invoke-interface {p1, v1}, La0/M;->onLoadingChanged(Z)V

    .line 93
    .line 94
    .line 95
    iget-boolean v0, v0, Lh0/i0;->g:Z

    .line 96
    .line 97
    invoke-interface {p1, v0}, La0/M;->onIsLoadingChanged(Z)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
