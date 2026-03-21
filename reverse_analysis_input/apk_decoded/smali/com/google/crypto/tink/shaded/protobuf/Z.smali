.class public final Lcom/google/crypto/tink/shaded/protobuf/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/Z;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/L;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/Z;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/Z;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/Z;->c:Lcom/google/crypto/tink/shaded/protobuf/Z;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/Z;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/L;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/L;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/Z;->a:Lcom/google/crypto/tink/shaded/protobuf/L;

    .line 17
    .line 18
    return-void
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
.method public final a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/c0;
    .locals 9

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/A;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/Z;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    .line 13
    .line 14
    if-nez v1, :cond_9

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/Z;->a:Lcom/google/crypto/tink/shaded/protobuf/L;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/d0;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v2, Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/d0;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/L;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/K;

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/K;->b(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v1, v3, Lcom/google/crypto/tink/shaded/protobuf/b0;->d:I

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    and-int/2addr v1, v4

    .line 62
    const-string v5, "Protobuf runtime is not correctly loaded."

    .line 63
    .line 64
    if-ne v1, v4, :cond_4

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget-object v2, v3, Lcom/google/crypto/tink/shaded/protobuf/b0;->a:Lcom/google/crypto/tink/shaded/protobuf/a;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/d0;->d:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 75
    .line 76
    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/q;->a:Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 77
    .line 78
    new-instance v4, Lcom/google/crypto/tink/shaded/protobuf/U;

    .line 79
    .line 80
    invoke-direct {v4, v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/U;-><init>(Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/a;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    move-object v1, v4

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/d0;->b:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 86
    .line 87
    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/q;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 88
    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    new-instance v4, Lcom/google/crypto/tink/shaded/protobuf/U;

    .line 92
    .line 93
    invoke-direct {v4, v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/U;-><init>(Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/a;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x1

    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-ne v1, v2, :cond_5

    .line 115
    .line 116
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/W;->b:Lcom/google/crypto/tink/shaded/protobuf/V;

    .line 117
    .line 118
    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/I;->b:Lcom/google/crypto/tink/shaded/protobuf/H;

    .line 119
    .line 120
    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/d0;->d:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 121
    .line 122
    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/q;->a:Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 123
    .line 124
    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/O;->b:Lcom/google/crypto/tink/shaded/protobuf/N;

    .line 125
    .line 126
    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/T;->C(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/I;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/N;)Lcom/google/crypto/tink/shaded/protobuf/T;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/W;->b:Lcom/google/crypto/tink/shaded/protobuf/V;

    .line 132
    .line 133
    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/I;->b:Lcom/google/crypto/tink/shaded/protobuf/H;

    .line 134
    .line 135
    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/d0;->d:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 136
    .line 137
    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/O;->b:Lcom/google/crypto/tink/shaded/protobuf/N;

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/T;->C(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/I;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/N;)Lcom/google/crypto/tink/shaded/protobuf/T;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-ne v1, v2, :cond_8

    .line 150
    .line 151
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/W;->a:Lcom/google/crypto/tink/shaded/protobuf/V;

    .line 152
    .line 153
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/I;->a:Lcom/google/crypto/tink/shaded/protobuf/G;

    .line 154
    .line 155
    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/d0;->b:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 156
    .line 157
    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/q;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 158
    .line 159
    if-eqz v7, :cond_7

    .line 160
    .line 161
    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/O;->a:Lcom/google/crypto/tink/shaded/protobuf/N;

    .line 162
    .line 163
    move-object v5, v1

    .line 164
    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/T;->C(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/I;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/N;)Lcom/google/crypto/tink/shaded/protobuf/T;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_2

    .line 169
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_8
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/W;->a:Lcom/google/crypto/tink/shaded/protobuf/V;

    .line 176
    .line 177
    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/I;->a:Lcom/google/crypto/tink/shaded/protobuf/G;

    .line 178
    .line 179
    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/d0;->c:Lcom/google/crypto/tink/shaded/protobuf/g0;

    .line 180
    .line 181
    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/O;->a:Lcom/google/crypto/tink/shaded/protobuf/N;

    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/T;->C(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/I;Lcom/google/crypto/tink/shaded/protobuf/g0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/N;)Lcom/google/crypto/tink/shaded/protobuf/T;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :goto_2
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    .line 193
    .line 194
    if-eqz p1, :cond_9

    .line 195
    .line 196
    move-object v1, p1

    .line 197
    :cond_9
    return-object v1
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
