.class public final LP2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP2/c;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LP2/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, LP2/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LP2/c;->a:I

    iput-object p1, p0, LP2/c;->c:Ljava/lang/Object;

    iput-object p3, p0, LP2/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method


# virtual methods
.method public final error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, LP2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZ1/e;

    .line 9
    .line 10
    iget-object v0, v0, LZ1/e;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ln3/q;

    .line 13
    .line 14
    iget-object v0, v0, Ln3/q;->c:Ln3/r;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Ln3/r;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, LP2/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lf3/g;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lf3/g;->a(Ljava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Error "

    .line 31
    .line 32
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " while sending restoration data to framework: "

    .line 39
    .line 40
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "RestorationChannel"

    .line 51
    .line 52
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    iget-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Landroid/os/Handler;

    .line 59
    .line 60
    new-instance v7, LP2/b;

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    move-object v1, v7

    .line 64
    move-object v2, p0

    .line 65
    move-object v3, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v5, p3

    .line 68
    invoke-direct/range {v1 .. v6}, LP2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final notImplemented()V
    .locals 4

    .line 1
    iget v0, p0, LP2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP2/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lf3/g;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lf3/g;->a(Ljava/nio/ByteBuffer;)V

    .line 12
    .line 13
    .line 14
    :pswitch_0
    return-void

    .line 15
    :pswitch_1
    iget-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/os/Handler;

    .line 18
    .line 19
    iget-object v1, p0, LP2/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LP2/c;

    .line 22
    .line 23
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v2, LA3/c;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v2, v1, v3}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

.method public final success(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LP2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZ1/e;

    .line 9
    .line 10
    iget-object v0, v0, LZ1/e;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ln3/q;

    .line 13
    .line 14
    iget-object v0, v0, Ln3/q;->c:Ln3/r;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ln3/r;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, LP2/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lf3/g;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lf3/g;->a(Ljava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, LP2/c;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lm3/j;

    .line 31
    .line 32
    iget-object v0, p0, LP2/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, [B

    .line 35
    .line 36
    iput-object v0, p1, Lm3/j;->b:[B

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    iget-object v0, p0, LP2/c;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v1, LD0/y;

    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    invoke-direct {v1, p0, v2, p1}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
