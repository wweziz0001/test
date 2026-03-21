.class public final Ls2/A;
.super Ls2/b;
.source "SourceFile"


# direct methods
.method public static b(Ls2/j;LB0/d;Ljava/lang/Integer;)Ls2/A;
    .locals 3

    .line 1
    sget-object v0, Ls2/j;->y:Ls2/j;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 9
    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v0, "For given Variant "

    .line 13
    .line 14
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, " the value of idRequirement must be non-null"

    .line 21
    .line 22
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    :goto_0
    if-ne p0, v0, :cond_3

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 39
    .line 40
    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_3
    :goto_1
    iget-object p1, p1, LB0/d;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, LF2/a;

    .line 49
    .line 50
    iget-object v1, p1, LF2/a;->a:[B

    .line 51
    .line 52
    array-length v1, v1

    .line 53
    const/16 v2, 0x20

    .line 54
    .line 55
    if-ne v1, v2, :cond_7

    .line 56
    .line 57
    new-instance p1, Ls2/A;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    if-ne p0, v0, :cond_4

    .line 61
    .line 62
    new-array p0, v1, [B

    .line 63
    .line 64
    invoke-static {p0}, LF2/a;->a([B)LF2/a;

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    sget-object v0, Ls2/j;->x:Ls2/j;

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    if-ne p0, v0, :cond_5

    .line 72
    .line 73
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, LF2/a;->a([B)LF2/a;

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v0, Ls2/j;->w:Ls2/j;

    .line 98
    .line 99
    if-ne p0, v0, :cond_6

    .line 100
    .line 101
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const/4 v0, 0x1

    .line 106
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, LF2/a;->a([B)LF2/a;

    .line 123
    .line 124
    .line 125
    :goto_2
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    new-instance p2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v0, "Unknown Variant: "

    .line 134
    .line 135
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 150
    .line 151
    new-instance p2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v0, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    .line 154
    .line 155
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p1, LF2/a;->a:[B

    .line 159
    .line 160
    array-length p1, p1

    .line 161
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p0
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
