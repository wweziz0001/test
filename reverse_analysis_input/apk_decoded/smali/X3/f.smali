.class public abstract LX3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX3/l;

.field public static final b:I

.field public static final c:I

.field public static final d:LF0/p;

.field public static final e:LF0/p;

.field public static final f:LF0/p;

.field public static final g:LF0/p;

.field public static final h:LF0/p;

.field public static final i:LF0/p;

.field public static final j:LF0/p;

.field public static final k:LF0/p;

.field public static final l:LF0/p;

.field public static final m:LF0/p;

.field public static final n:LF0/p;

.field public static final o:LF0/p;

.field public static final p:LF0/p;

.field public static final q:LF0/p;

.field public static final r:LF0/p;

.field public static final s:LF0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v6, LX3/l;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v0, v6

    .line 9
    invoke-direct/range {v0 .. v5}, LX3/l;-><init>(JLX3/l;LX3/d;I)V

    .line 10
    .line 11
    .line 12
    sput-object v6, LX3/f;->a:LX3/l;

    .line 13
    .line 14
    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 15
    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v3, 0xc

    .line 20
    .line 21
    invoke-static {v0, v1, v2, v2, v3}, La4/a;->k(Ljava/lang/String;IIII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, LX3/f;->b:I

    .line 26
    .line 27
    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    .line 28
    .line 29
    const/16 v1, 0x2710

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v2, v3}, La4/a;->k(Ljava/lang/String;IIII)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, LX3/f;->c:I

    .line 36
    .line 37
    new-instance v0, LF0/p;

    .line 38
    .line 39
    const-string v1, "BUFFERED"

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LX3/f;->d:LF0/p;

    .line 47
    .line 48
    new-instance v0, LF0/p;

    .line 49
    .line 50
    const-string v1, "SHOULD_BUFFER"

    .line 51
    .line 52
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LX3/f;->e:LF0/p;

    .line 56
    .line 57
    new-instance v0, LF0/p;

    .line 58
    .line 59
    const-string v1, "S_RESUMING_BY_RCV"

    .line 60
    .line 61
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    sput-object v0, LX3/f;->f:LF0/p;

    .line 65
    .line 66
    new-instance v0, LF0/p;

    .line 67
    .line 68
    const-string v1, "RESUMING_BY_EB"

    .line 69
    .line 70
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    sput-object v0, LX3/f;->g:LF0/p;

    .line 74
    .line 75
    new-instance v0, LF0/p;

    .line 76
    .line 77
    const-string v1, "POISONED"

    .line 78
    .line 79
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    sput-object v0, LX3/f;->h:LF0/p;

    .line 83
    .line 84
    new-instance v0, LF0/p;

    .line 85
    .line 86
    const-string v1, "DONE_RCV"

    .line 87
    .line 88
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    sput-object v0, LX3/f;->i:LF0/p;

    .line 92
    .line 93
    new-instance v0, LF0/p;

    .line 94
    .line 95
    const-string v1, "INTERRUPTED_SEND"

    .line 96
    .line 97
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    sput-object v0, LX3/f;->j:LF0/p;

    .line 101
    .line 102
    new-instance v0, LF0/p;

    .line 103
    .line 104
    const-string v1, "INTERRUPTED_RCV"

    .line 105
    .line 106
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    sput-object v0, LX3/f;->k:LF0/p;

    .line 110
    .line 111
    new-instance v0, LF0/p;

    .line 112
    .line 113
    const-string v1, "CHANNEL_CLOSED"

    .line 114
    .line 115
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    sput-object v0, LX3/f;->l:LF0/p;

    .line 119
    .line 120
    new-instance v0, LF0/p;

    .line 121
    .line 122
    const-string v1, "SUSPEND"

    .line 123
    .line 124
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    sput-object v0, LX3/f;->m:LF0/p;

    .line 128
    .line 129
    new-instance v0, LF0/p;

    .line 130
    .line 131
    const-string v1, "SUSPEND_NO_WAITER"

    .line 132
    .line 133
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    sput-object v0, LX3/f;->n:LF0/p;

    .line 137
    .line 138
    new-instance v0, LF0/p;

    .line 139
    .line 140
    const-string v1, "FAILED"

    .line 141
    .line 142
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    sput-object v0, LX3/f;->o:LF0/p;

    .line 146
    .line 147
    new-instance v0, LF0/p;

    .line 148
    .line 149
    const-string v1, "NO_RECEIVE_RESULT"

    .line 150
    .line 151
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    sput-object v0, LX3/f;->p:LF0/p;

    .line 155
    .line 156
    new-instance v0, LF0/p;

    .line 157
    .line 158
    const-string v1, "CLOSE_HANDLER_CLOSED"

    .line 159
    .line 160
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 161
    .line 162
    .line 163
    sput-object v0, LX3/f;->q:LF0/p;

    .line 164
    .line 165
    new-instance v0, LF0/p;

    .line 166
    .line 167
    const-string v1, "CLOSE_HANDLER_INVOKED"

    .line 168
    .line 169
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    sput-object v0, LX3/f;->r:LF0/p;

    .line 173
    .line 174
    new-instance v0, LF0/p;

    .line 175
    .line 176
    const-string v1, "NO_CLOSE_CAUSE"

    .line 177
    .line 178
    invoke-direct {v0, v2, v1, v3}, LF0/p;-><init>(ILjava/lang/String;Z)V

    .line 179
    .line 180
    .line 181
    sput-object v0, LX3/f;->s:LF0/p;

    .line 182
    .line 183
    return-void
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

.method public static final a(LV3/e;Ljava/lang/Object;LM3/l;)Z
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, LV3/e;->h(Ljava/lang/Object;LM3/l;)LF0/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, LV3/e;->p(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    return p0
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
.end method
