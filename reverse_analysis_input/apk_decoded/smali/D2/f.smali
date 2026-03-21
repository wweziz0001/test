.class public final LD2/f;
.super Lcom/google/crypto/tink/shaded/protobuf/w;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:LD2/f;

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/X; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/X;"
        }
    .end annotation
.end field

.field public static final TAG_SIZE_FIELD_NUMBER:I = 0x1


# instance fields
.field private tagSize_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD2/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 7
    .line 8
    const-class v1, LD2/f;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->v(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/w;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public static B()LD2/e;
    .locals 1

    .line 1
    sget-object v0, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->j()Lcom/google/crypto/tink/shaded/protobuf/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LD2/e;

    .line 8
    .line 9
    return-object v0
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

.method public static y(LD2/f;)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    iput v0, p0, LD2/f;->tagSize_:I

    .line 4
    .line 5
    return-void
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

.method public static z()LD2/f;
    .locals 1

    .line 1
    sget-object v0, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 2
    .line 3
    return-object v0
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
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, LD2/f;->tagSize_:I

    .line 2
    .line 3
    return v0
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

.method public final k(I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, LO/i;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    sget-object p1, LD2/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    const-class v0, LD2/f;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    sget-object p1, LD2/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/v;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object p1, LD2/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v0

    .line 36
    goto :goto_2

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1

    .line 39
    :cond_1
    :goto_2
    return-object p1

    .line 40
    :pswitch_1
    sget-object p1, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_2
    new-instance p1, LD2/e;

    .line 44
    .line 45
    sget-object v0, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/u;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    new-instance p1, LD2/f;

    .line 52
    .line 53
    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "tagSize_"

    .line 58
    .line 59
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"

    .line 64
    .line 65
    sget-object v1, LD2/f;->DEFAULT_INSTANCE:LD2/f;

    .line 66
    .line 67
    new-instance v2, Lcom/google/crypto/tink/shaded/protobuf/b0;

    .line 68
    .line 69
    invoke-direct {v2, v1, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/b0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_5
    const/4 p1, 0x0

    .line 74
    return-object p1

    .line 75
    :pswitch_6
    const/4 p1, 0x1

    .line 76
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
