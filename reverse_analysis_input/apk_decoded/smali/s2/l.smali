.class public final synthetic Ls2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/b;
.implements Ll2/d;
.implements Ld0/d;
.implements Ln3/b;
.implements Ln3/c;


# instance fields
.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls2/l;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Ls2/l;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ly2/n;)Lr2/b;
    .locals 5

    .line 1
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 2
    .line 3
    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    .line 4
    .line 5
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, LD2/u0;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/u0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, LD2/u0;->B()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_4

    .line 32
    .line 33
    iget-object v2, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, LD2/r0;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v4, 0x1

    .line 42
    if-eq v3, v4, :cond_3

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    if-eq v3, v4, :cond_1

    .line 49
    .line 50
    const/4 v4, 0x4

    .line 51
    if-ne v3, v4, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, LD2/r0;->b()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_1
    sget-object v2, Ls2/j;->y:Ls2/j;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_0
    sget-object v2, Ls2/j;->x:Ls2/j;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    sget-object v2, Ls2/j;->w:Ls2/j;

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v1}, LD2/u0;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-static {v2, v0, p1}, Ls2/A;->b(Ls2/j;LB0/d;Ljava/lang/Integer;)Ls2/A;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 108
    .line 109
    const-string v0, "Only version 0 keys are accepted"

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 116
    .line 117
    const-string v0, "Parsing XChaCha20Poly1305Key failed"

    .line 118
    .line 119
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    const-string v0, "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
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


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lx0/c0;

    .line 2
    .line 3
    iget-object p1, p1, Lx0/c0;->b:Lm0/h;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
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

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ls2/l;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, La0/V;

    .line 7
    .line 8
    iget p1, p1, La0/V;->c:I

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_1
    check-cast p1, Lx0/F;

    .line 16
    .line 17
    invoke-interface {p1}, Lx0/F;->e()Lx0/q0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Ls2/l;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ls2/l;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lx0/q0;->b:Lm2/b0;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lm2/r;->w(Ljava/util/List;Ll2/d;)Ljava/util/AbstractList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :pswitch_2
    check-cast p1, LF0/q;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_3
    check-cast p1, Ly0/h;

    .line 54
    .line 55
    iget p1, p1, Ly0/h;->l:I

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public b(Ly2/n;)Lr2/b;
    .locals 9

    .line 1
    iget v0, p0, Ls2/l;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 7
    .line 8
    const-string v1, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 9
    .line 10
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 23
    .line 24
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v1, v2}, LD2/F;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/F;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, LD2/F;->B()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1}, LD2/F;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v3, 0x20

    .line 47
    .line 48
    if-eq v2, v3, :cond_1

    .line 49
    .line 50
    const/16 v3, 0x30

    .line 51
    .line 52
    if-eq v2, v3, :cond_1

    .line 53
    .line 54
    const/16 v3, 0x40

    .line 55
    .line 56
    if-ne v2, v3, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported"

    .line 70
    .line 71
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_1
    :goto_0
    iget-object v3, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, LD2/r0;

    .line 82
    .line 83
    sget-object v4, Lw2/d;->e:Ljava/util/Map;

    .line 84
    .line 85
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lw2/b;

    .line 96
    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    new-instance v4, Lw2/c;

    .line 100
    .line 101
    invoke-direct {v4, v2, v3}, Lw2/c;-><init>(ILw2/b;)V

    .line 102
    .line 103
    .line 104
    new-instance v2, LZ1/s;

    .line 105
    .line 106
    const/16 v3, 0x12

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    invoke-direct {v2, v3, v5}, LZ1/s;-><init>(IZ)V

    .line 110
    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    iput-object v3, v2, LZ1/s;->n:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v3, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v4, v2, LZ1/s;->m:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {v1}, LD2/F;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, v2, LZ1/s;->n:Ljava/lang/Object;

    .line 132
    .line 133
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Ljava/lang/Integer;

    .line 136
    .line 137
    iput-object p1, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v2}, LZ1/s;->t()Lw2/a;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 145
    .line 146
    const-string v0, "Variant is not set"

    .line 147
    .line 148
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 153
    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 157
    .line 158
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, LD2/r0;->b()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 177
    .line 178
    const-string v0, "Only version 0 keys are accepted"

    .line 179
    .line 180
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 185
    .line 186
    const-string v0, "Parsing AesSivKey failed"

    .line 187
    .line 188
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 193
    .line 194
    const-string v0, "Wrong type URL in call to AesSivParameters.parseParameters"

    .line 195
    .line 196
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :pswitch_0
    invoke-direct {p0, p1}, Ls2/l;->a(Ly2/n;)Lr2/b;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :pswitch_1
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 206
    .line 207
    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 208
    .line 209
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_b

    .line 218
    .line 219
    :try_start_1
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 222
    .line 223
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v1, v2}, LD2/J;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/J;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, LD2/J;->B()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_a

    .line 236
    .line 237
    iget-object v2, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v2, LD2/r0;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    const/4 v4, 0x1

    .line 246
    if-eq v3, v4, :cond_9

    .line 247
    .line 248
    const/4 v4, 0x2

    .line 249
    if-eq v3, v4, :cond_8

    .line 250
    .line 251
    const/4 v4, 0x3

    .line 252
    if-eq v3, v4, :cond_7

    .line 253
    .line 254
    const/4 v4, 0x4

    .line 255
    if-ne v3, v4, :cond_6

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 259
    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 263
    .line 264
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, LD2/r0;->b()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :cond_7
    sget-object v2, Ls2/j;->v:Ls2/j;

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_8
    :goto_1
    sget-object v2, Ls2/j;->u:Ls2/j;

    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_9
    sget-object v2, Ls2/j;->t:Ls2/j;

    .line 289
    .line 290
    :goto_2
    invoke-virtual {v1}, LD2/J;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p1, Ljava/lang/Integer;

    .line 305
    .line 306
    invoke-static {v2, v0, p1}, Ls2/w;->b(Ls2/j;LB0/d;Ljava/lang/Integer;)Ls2/w;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    return-object p1

    .line 311
    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 312
    .line 313
    const-string v0, "Only version 0 keys are accepted"

    .line 314
    .line 315
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_1 .. :try_end_1} :catch_1

    .line 319
    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 320
    .line 321
    const-string v0, "Parsing ChaCha20Poly1305Key failed"

    .line 322
    .line 323
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw p1

    .line 327
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 328
    .line 329
    const-string v0, "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters"

    .line 330
    .line 331
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw p1

    .line 335
    :pswitch_2
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 336
    .line 337
    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 338
    .line 339
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v2, Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_13

    .line 348
    .line 349
    :try_start_2
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 352
    .line 353
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-static {v1, v2}, LD2/B;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/B;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v1}, LD2/B;->B()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-nez v2, :cond_12

    .line 366
    .line 367
    sget-object v2, Ls2/j;->s:Ls2/j;

    .line 368
    .line 369
    invoke-virtual {v1}, LD2/B;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    const/16 v4, 0x10

    .line 378
    .line 379
    if-eq v3, v4, :cond_d

    .line 380
    .line 381
    const/16 v4, 0x20

    .line 382
    .line 383
    if-ne v3, v4, :cond_c

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :cond_c
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 387
    .line 388
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const-string v1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    .line 397
    .line 398
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw p1

    .line 406
    :cond_d
    :goto_3
    iget-object v4, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v4, LD2/r0;

    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    const/4 v6, 0x1

    .line 415
    if-eq v5, v6, :cond_10

    .line 416
    .line 417
    const/4 v6, 0x2

    .line 418
    if-eq v5, v6, :cond_f

    .line 419
    .line 420
    const/4 v6, 0x3

    .line 421
    if-eq v5, v6, :cond_11

    .line 422
    .line 423
    const/4 v2, 0x4

    .line 424
    if-ne v5, v2, :cond_e

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 428
    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 432
    .line 433
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, LD2/r0;->b()I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw p1

    .line 451
    :cond_f
    :goto_4
    sget-object v2, Ls2/j;->r:Ls2/j;

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_10
    sget-object v2, Ls2/j;->q:Ls2/j;

    .line 455
    .line 456
    :cond_11
    :goto_5
    new-instance v4, Ls2/u;

    .line 457
    .line 458
    invoke-direct {v4, v3, v2}, Ls2/u;-><init>(ILs2/j;)V

    .line 459
    .line 460
    .line 461
    new-instance v2, LZ1/m;

    .line 462
    .line 463
    const/16 v3, 0x11

    .line 464
    .line 465
    invoke-direct {v2, v3}, LZ1/m;-><init>(I)V

    .line 466
    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    iput-object v3, v2, LZ1/m;->n:Ljava/lang/Object;

    .line 470
    .line 471
    iput-object v3, v2, LZ1/m;->o:Ljava/lang/Object;

    .line 472
    .line 473
    iput-object v4, v2, LZ1/m;->m:Ljava/lang/Object;

    .line 474
    .line 475
    invoke-virtual {v1}, LD2/B;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    iput-object v0, v2, LZ1/m;->n:Ljava/lang/Object;

    .line 488
    .line 489
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast p1, Ljava/lang/Integer;

    .line 492
    .line 493
    iput-object p1, v2, LZ1/m;->o:Ljava/lang/Object;

    .line 494
    .line 495
    invoke-virtual {v2}, LZ1/m;->j()Ls2/t;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    return-object p1

    .line 500
    :cond_12
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 501
    .line 502
    const-string v0, "Only version 0 keys are accepted"

    .line 503
    .line 504
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_2 .. :try_end_2} :catch_2

    .line 508
    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 509
    .line 510
    const-string v0, "Parsing AesGcmSivKey failed"

    .line 511
    .line 512
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw p1

    .line 516
    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 517
    .line 518
    const-string v0, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    .line 519
    .line 520
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    throw p1

    .line 524
    :pswitch_3
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 525
    .line 526
    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 527
    .line 528
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v2, Ljava/lang/String;

    .line 531
    .line 532
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    if-eqz v1, :cond_1b

    .line 537
    .line 538
    :try_start_3
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 541
    .line 542
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-static {v1, v2}, LD2/x;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/x;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-virtual {v1}, LD2/x;->B()I

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    if-nez v2, :cond_1a

    .line 555
    .line 556
    sget-object v2, Ls2/j;->p:Ls2/j;

    .line 557
    .line 558
    invoke-virtual {v1}, LD2/x;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    const/16 v4, 0x10

    .line 567
    .line 568
    if-eq v3, v4, :cond_15

    .line 569
    .line 570
    const/16 v5, 0x18

    .line 571
    .line 572
    if-eq v3, v5, :cond_15

    .line 573
    .line 574
    const/16 v5, 0x20

    .line 575
    .line 576
    if-ne v3, v5, :cond_14

    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_14
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 580
    .line 581
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 590
    .line 591
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    throw p1

    .line 599
    :cond_15
    :goto_6
    iget-object v5, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v5, LD2/r0;

    .line 602
    .line 603
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 604
    .line 605
    .line 606
    move-result v6

    .line 607
    const/4 v7, 0x1

    .line 608
    if-eq v6, v7, :cond_18

    .line 609
    .line 610
    const/4 v7, 0x2

    .line 611
    if-eq v6, v7, :cond_17

    .line 612
    .line 613
    const/4 v7, 0x3

    .line 614
    if-eq v6, v7, :cond_19

    .line 615
    .line 616
    const/4 v2, 0x4

    .line 617
    if-ne v6, v2, :cond_16

    .line 618
    .line 619
    goto :goto_7

    .line 620
    :cond_16
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 621
    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 625
    .line 626
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v5}, LD2/r0;->b()I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw p1

    .line 644
    :cond_17
    :goto_7
    sget-object v2, Ls2/j;->o:Ls2/j;

    .line 645
    .line 646
    goto :goto_8

    .line 647
    :cond_18
    sget-object v2, Ls2/j;->n:Ls2/j;

    .line 648
    .line 649
    :cond_19
    :goto_8
    new-instance v5, Ls2/r;

    .line 650
    .line 651
    const/16 v6, 0xc

    .line 652
    .line 653
    invoke-direct {v5, v3, v6, v4, v2}, Ls2/r;-><init>(IIILs2/j;)V

    .line 654
    .line 655
    .line 656
    new-instance v2, LZ1/s;

    .line 657
    .line 658
    const/16 v3, 0x10

    .line 659
    .line 660
    const/4 v4, 0x0

    .line 661
    invoke-direct {v2, v3, v4}, LZ1/s;-><init>(IZ)V

    .line 662
    .line 663
    .line 664
    const/4 v3, 0x0

    .line 665
    iput-object v3, v2, LZ1/s;->n:Ljava/lang/Object;

    .line 666
    .line 667
    iput-object v3, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 668
    .line 669
    iput-object v5, v2, LZ1/s;->m:Ljava/lang/Object;

    .line 670
    .line 671
    invoke-virtual {v1}, LD2/x;->A()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    iput-object v0, v2, LZ1/s;->n:Ljava/lang/Object;

    .line 684
    .line 685
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast p1, Ljava/lang/Integer;

    .line 688
    .line 689
    iput-object p1, v2, LZ1/s;->o:Ljava/lang/Object;

    .line 690
    .line 691
    invoke-virtual {v2}, LZ1/s;->s()Ls2/q;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    return-object p1

    .line 696
    :cond_1a
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 697
    .line 698
    const-string v0, "Only version 0 keys are accepted"

    .line 699
    .line 700
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    throw p1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_3 .. :try_end_3} :catch_3

    .line 704
    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 705
    .line 706
    const-string v0, "Parsing AesGcmKey failed"

    .line 707
    .line 708
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw p1

    .line 712
    :cond_1b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 713
    .line 714
    const-string v0, "Wrong type URL in call to AesGcmParameters.parseParameters"

    .line 715
    .line 716
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    throw p1

    .line 720
    :pswitch_4
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 721
    .line 722
    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 723
    .line 724
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v2, Ljava/lang/String;

    .line 727
    .line 728
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-eqz v1, :cond_25

    .line 733
    .line 734
    :try_start_4
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 737
    .line 738
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-static {v1, v2}, LD2/r;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/r;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-virtual {v1}, LD2/r;->D()I

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    if-nez v2, :cond_24

    .line 751
    .line 752
    sget-object v2, Ls2/j;->m:Ls2/j;

    .line 753
    .line 754
    invoke-virtual {v1}, LD2/r;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 759
    .line 760
    .line 761
    move-result v3

    .line 762
    const/16 v4, 0x10

    .line 763
    .line 764
    if-eq v3, v4, :cond_1d

    .line 765
    .line 766
    const/16 v5, 0x18

    .line 767
    .line 768
    if-eq v3, v5, :cond_1d

    .line 769
    .line 770
    const/16 v5, 0x20

    .line 771
    .line 772
    if-ne v3, v5, :cond_1c

    .line 773
    .line 774
    goto :goto_9

    .line 775
    :cond_1c
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 776
    .line 777
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 786
    .line 787
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    throw p1

    .line 795
    :cond_1d
    :goto_9
    invoke-virtual {v1}, LD2/r;->C()LD2/v;

    .line 796
    .line 797
    .line 798
    move-result-object v5

    .line 799
    invoke-virtual {v5}, LD2/v;->A()I

    .line 800
    .line 801
    .line 802
    move-result v5

    .line 803
    const/16 v6, 0xc

    .line 804
    .line 805
    if-eq v5, v6, :cond_1f

    .line 806
    .line 807
    if-ne v5, v4, :cond_1e

    .line 808
    .line 809
    goto :goto_a

    .line 810
    :cond_1e
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 811
    .line 812
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    const-string v1, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    .line 821
    .line 822
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    throw p1

    .line 830
    :cond_1f
    :goto_a
    iget-object v6, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v6, LD2/r0;

    .line 833
    .line 834
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 835
    .line 836
    .line 837
    move-result v7

    .line 838
    const/4 v8, 0x1

    .line 839
    if-eq v7, v8, :cond_22

    .line 840
    .line 841
    const/4 v8, 0x2

    .line 842
    if-eq v7, v8, :cond_21

    .line 843
    .line 844
    const/4 v8, 0x3

    .line 845
    if-eq v7, v8, :cond_23

    .line 846
    .line 847
    const/4 v2, 0x4

    .line 848
    if-ne v7, v2, :cond_20

    .line 849
    .line 850
    goto :goto_b

    .line 851
    :cond_20
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 852
    .line 853
    new-instance v0, Ljava/lang/StringBuilder;

    .line 854
    .line 855
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 856
    .line 857
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v6}, LD2/r0;->b()I

    .line 861
    .line 862
    .line 863
    move-result v1

    .line 864
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw p1

    .line 875
    :cond_21
    :goto_b
    sget-object v2, Ls2/j;->l:Ls2/j;

    .line 876
    .line 877
    goto :goto_c

    .line 878
    :cond_22
    sget-object v2, Ls2/j;->k:Ls2/j;

    .line 879
    .line 880
    :cond_23
    :goto_c
    new-instance v6, Ls2/o;

    .line 881
    .line 882
    invoke-direct {v6, v3, v5, v4, v2}, Ls2/o;-><init>(IIILs2/j;)V

    .line 883
    .line 884
    .line 885
    new-instance v2, LZ1/m;

    .line 886
    .line 887
    const/16 v3, 0x10

    .line 888
    .line 889
    invoke-direct {v2, v3}, LZ1/m;-><init>(I)V

    .line 890
    .line 891
    .line 892
    const/4 v3, 0x0

    .line 893
    iput-object v3, v2, LZ1/m;->n:Ljava/lang/Object;

    .line 894
    .line 895
    iput-object v3, v2, LZ1/m;->o:Ljava/lang/Object;

    .line 896
    .line 897
    iput-object v6, v2, LZ1/m;->m:Ljava/lang/Object;

    .line 898
    .line 899
    invoke-virtual {v1}, LD2/r;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    iput-object v0, v2, LZ1/m;->n:Ljava/lang/Object;

    .line 912
    .line 913
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast p1, Ljava/lang/Integer;

    .line 916
    .line 917
    iput-object p1, v2, LZ1/m;->o:Ljava/lang/Object;

    .line 918
    .line 919
    invoke-virtual {v2}, LZ1/m;->i()Ls2/n;

    .line 920
    .line 921
    .line 922
    move-result-object p1

    .line 923
    return-object p1

    .line 924
    :cond_24
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 925
    .line 926
    const-string v0, "Only version 0 keys are accepted"

    .line 927
    .line 928
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    throw p1
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_4 .. :try_end_4} :catch_4

    .line 932
    :catch_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 933
    .line 934
    const-string v0, "Parsing AesEaxcKey failed"

    .line 935
    .line 936
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    throw p1

    .line 940
    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 941
    .line 942
    const-string v0, "Wrong type URL in call to AesEaxParameters.parseParameters"

    .line 943
    .line 944
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw p1

    .line 948
    :pswitch_5
    sget-object v0, Lr2/o;->a:Lr2/o;

    .line 949
    .line 950
    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 951
    .line 952
    iget-object v2, p1, Ly2/n;->a:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v2, Ljava/lang/String;

    .line 955
    .line 956
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result v1

    .line 960
    if-eqz v1, :cond_2f

    .line 961
    .line 962
    :try_start_5
    iget-object v1, p1, Ly2/n;->c:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 965
    .line 966
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/o;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    invoke-static {v1, v2}, LD2/h;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/o;)LD2/h;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    invoke-virtual {v1}, LD2/h;->D()I

    .line 975
    .line 976
    .line 977
    move-result v2

    .line 978
    if-nez v2, :cond_2e

    .line 979
    .line 980
    new-instance v2, LA/e;

    .line 981
    .line 982
    invoke-direct {v2}, LA/e;-><init>()V

    .line 983
    .line 984
    .line 985
    const/4 v3, 0x0

    .line 986
    iput-object v3, v2, LA/e;->m:Ljava/lang/Object;

    .line 987
    .line 988
    iput-object v3, v2, LA/e;->n:Ljava/lang/Object;

    .line 989
    .line 990
    iput-object v3, v2, LA/e;->o:Ljava/lang/Object;

    .line 991
    .line 992
    iput-object v3, v2, LA/e;->p:Ljava/lang/Object;

    .line 993
    .line 994
    sget-object v4, Ls2/j;->j:Ls2/j;

    .line 995
    .line 996
    iput-object v4, v2, LA/e;->q:Ljava/lang/Object;

    .line 997
    .line 998
    invoke-virtual {v1}, LD2/h;->B()LD2/l;

    .line 999
    .line 1000
    .line 1001
    move-result-object v5

    .line 1002
    invoke-virtual {v5}, LD2/l;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v5

    .line 1006
    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    const/16 v6, 0x10

    .line 1011
    .line 1012
    if-eq v5, v6, :cond_27

    .line 1013
    .line 1014
    const/16 v7, 0x18

    .line 1015
    .line 1016
    if-eq v5, v7, :cond_27

    .line 1017
    .line 1018
    const/16 v7, 0x20

    .line 1019
    .line 1020
    if-ne v5, v7, :cond_26

    .line 1021
    .line 1022
    goto :goto_d

    .line 1023
    :cond_26
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 1024
    .line 1025
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 1034
    .line 1035
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    throw p1

    .line 1043
    :cond_27
    :goto_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v5

    .line 1047
    iput-object v5, v2, LA/e;->m:Ljava/lang/Object;

    .line 1048
    .line 1049
    invoke-virtual {v1}, LD2/h;->C()LD2/Q;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v5

    .line 1053
    invoke-virtual {v5}, LD2/Q;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v5

    .line 1057
    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    .line 1058
    .line 1059
    .line 1060
    move-result v5

    .line 1061
    if-lt v5, v6, :cond_2d

    .line 1062
    .line 1063
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v5

    .line 1067
    iput-object v5, v2, LA/e;->n:Ljava/lang/Object;

    .line 1068
    .line 1069
    invoke-virtual {v1}, LD2/h;->C()LD2/Q;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    invoke-virtual {v5}, LD2/Q;->D()LD2/V;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    invoke-virtual {v5}, LD2/V;->C()I

    .line 1078
    .line 1079
    .line 1080
    move-result v5

    .line 1081
    const/16 v6, 0xa

    .line 1082
    .line 1083
    if-lt v5, v6, :cond_2c

    .line 1084
    .line 1085
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v5

    .line 1089
    iput-object v5, v2, LA/e;->o:Ljava/lang/Object;

    .line 1090
    .line 1091
    invoke-virtual {v1}, LD2/h;->C()LD2/Q;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v5

    .line 1095
    invoke-virtual {v5}, LD2/Q;->D()LD2/V;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v5

    .line 1099
    invoke-virtual {v5}, LD2/V;->B()LD2/O;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v5

    .line 1103
    invoke-static {v5}, Ls2/m;->a(LD2/O;)Ls2/j;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v5

    .line 1107
    iput-object v5, v2, LA/e;->p:Ljava/lang/Object;

    .line 1108
    .line 1109
    iget-object v5, p1, Ly2/n;->e:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v5, LD2/r0;

    .line 1112
    .line 1113
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1114
    .line 1115
    .line 1116
    move-result v6

    .line 1117
    const/4 v7, 0x1

    .line 1118
    if-eq v6, v7, :cond_2a

    .line 1119
    .line 1120
    const/4 v7, 0x2

    .line 1121
    if-eq v6, v7, :cond_29

    .line 1122
    .line 1123
    const/4 v7, 0x3

    .line 1124
    if-eq v6, v7, :cond_2b

    .line 1125
    .line 1126
    const/4 v4, 0x4

    .line 1127
    if-ne v6, v4, :cond_28

    .line 1128
    .line 1129
    goto :goto_e

    .line 1130
    :cond_28
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 1131
    .line 1132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 1135
    .line 1136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v5}, LD2/r0;->b()I

    .line 1140
    .line 1141
    .line 1142
    move-result v1

    .line 1143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    throw p1

    .line 1154
    :cond_29
    :goto_e
    sget-object v4, Ls2/j;->i:Ls2/j;

    .line 1155
    .line 1156
    goto :goto_f

    .line 1157
    :cond_2a
    sget-object v4, Ls2/j;->h:Ls2/j;

    .line 1158
    .line 1159
    :cond_2b
    :goto_f
    iput-object v4, v2, LA/e;->q:Ljava/lang/Object;

    .line 1160
    .line 1161
    invoke-virtual {v2}, LA/e;->c()Ls2/k;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    new-instance v4, LZ1/i;

    .line 1166
    .line 1167
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1168
    .line 1169
    .line 1170
    iput-object v3, v4, LZ1/i;->m:Ljava/lang/Object;

    .line 1171
    .line 1172
    iput-object v3, v4, LZ1/i;->n:Ljava/lang/Object;

    .line 1173
    .line 1174
    iput-object v3, v4, LZ1/i;->o:Ljava/lang/Object;

    .line 1175
    .line 1176
    iput-object v2, v4, LZ1/i;->l:Ljava/lang/Object;

    .line 1177
    .line 1178
    invoke-virtual {v1}, LD2/h;->B()LD2/l;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    invoke-virtual {v2}, LD2/l;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    invoke-static {v2, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    iput-object v2, v4, LZ1/i;->m:Ljava/lang/Object;

    .line 1195
    .line 1196
    invoke-virtual {v1}, LD2/h;->C()LD2/Q;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    invoke-virtual {v1}, LD2/Q;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->j()[B

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-static {v1, v0}, LB0/d;->e([BLr2/o;)LB0/d;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    iput-object v0, v4, LZ1/i;->n:Ljava/lang/Object;

    .line 1213
    .line 1214
    iget-object p1, p1, Ly2/n;->f:Ljava/lang/Object;

    .line 1215
    .line 1216
    check-cast p1, Ljava/lang/Integer;

    .line 1217
    .line 1218
    iput-object p1, v4, LZ1/i;->o:Ljava/lang/Object;

    .line 1219
    .line 1220
    invoke-virtual {v4}, LZ1/i;->e()Ls2/f;

    .line 1221
    .line 1222
    .line 1223
    move-result-object p1

    .line 1224
    return-object p1

    .line 1225
    :cond_2c
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 1226
    .line 1227
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    const-string v1, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 1236
    .line 1237
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1242
    .line 1243
    .line 1244
    throw p1

    .line 1245
    :cond_2d
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    .line 1246
    .line 1247
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    const-string v1, "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"

    .line 1256
    .line 1257
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 1262
    .line 1263
    .line 1264
    throw p1

    .line 1265
    :cond_2e
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 1266
    .line 1267
    const-string v0, "Only version 0 keys are accepted"

    .line 1268
    .line 1269
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    throw p1
    :try_end_5
    .catch Lcom/google/crypto/tink/shaded/protobuf/C; {:try_start_5 .. :try_end_5} :catch_5

    .line 1273
    :catch_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 1274
    .line 1275
    const-string v0, "Parsing AesCtrHmacAeadKey failed"

    .line 1276
    .line 1277
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    throw p1

    .line 1281
    :cond_2f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1282
    .line 1283
    const-string v0, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    .line 1284
    .line 1285
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1286
    .line 1287
    .line 1288
    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public t(Ljava/lang/Object;LZ1/l;)V
    .locals 5

    .line 1
    iget v0, p0, Ls2/l;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 19
    .line 20
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 44
    .line 45
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 56
    .line 57
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_2
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 81
    .line 82
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "null cannot be cast to non-null type android.net.http.SslError"

    .line 93
    .line 94
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast p1, Landroid/net/http/SslError;

    .line 98
    .line 99
    :try_start_2
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    if-eq p1, v0, :cond_4

    .line 107
    .line 108
    const/4 v0, 0x2

    .line 109
    if-eq p1, v0, :cond_3

    .line 110
    .line 111
    const/4 v0, 0x3

    .line 112
    if-eq p1, v0, :cond_2

    .line 113
    .line 114
    const/4 v0, 0x4

    .line 115
    if-eq p1, v0, :cond_1

    .line 116
    .line 117
    const/4 v0, 0x5

    .line 118
    if-eq p1, v0, :cond_0

    .line 119
    .line 120
    sget-object p1, Ly3/L;->t:Ly3/L;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_0
    sget-object p1, Ly3/L;->q:Ly3/L;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    sget-object p1, Ly3/L;->n:Ly3/L;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    sget-object p1, Ly3/L;->s:Ly3/L;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    sget-object p1, Ly3/L;->p:Ly3/L;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    sget-object p1, Ly3/L;->o:Ly3/L;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    sget-object p1, Ly3/L;->r:Ly3/L;

    .line 139
    .line 140
    :goto_2
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 144
    goto :goto_3

    .line 145
    :catchall_2
    move-exception p1

    .line 146
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_3
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_3
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 155
    .line 156
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    check-cast p1, Ljava/util/List;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const-string v0, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 167
    .line 168
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    check-cast p1, Landroid/webkit/PermissionRequest;

    .line 172
    .line 173
    :try_start_3
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 174
    .line 175
    .line 176
    const/4 p1, 0x0

    .line 177
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 181
    goto :goto_4

    .line 182
    :catchall_3
    move-exception p1

    .line 183
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_4
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_4
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 192
    .line 193
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    check-cast p1, Ljava/util/List;

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    const-string v2, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 204
    .line 205
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    check-cast v1, Landroid/webkit/PermissionRequest;

    .line 209
    .line 210
    const/4 v2, 0x1

    .line 211
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 216
    .line 217
    invoke-static {p1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    check-cast p1, Ljava/util/List;

    .line 221
    .line 222
    :try_start_4
    new-array v0, v0, [Ljava/lang/String;

    .line 223
    .line 224
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    check-cast p1, [Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v1, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const/4 p1, 0x0

    .line 234
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 238
    goto :goto_5

    .line 239
    :catchall_4
    move-exception p1

    .line 240
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    :goto_5
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_5
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 249
    .line 250
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    check-cast p1, Ljava/util/List;

    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v1, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback"

    .line 261
    .line 262
    invoke-static {v0, v1}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    check-cast v0, Landroid/webkit/GeolocationPermissions$Callback;

    .line 266
    .line 267
    const/4 v1, 0x1

    .line 268
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 273
    .line 274
    invoke-static {v1, v2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v1, Ljava/lang/String;

    .line 278
    .line 279
    const/4 v2, 0x2

    .line 280
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 285
    .line 286
    invoke-static {v2, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    check-cast v2, Ljava/lang/Boolean;

    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    const/4 v4, 0x3

    .line 296
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-static {p1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    check-cast p1, Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    :try_start_5
    invoke-interface {v0, v1, v2, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 310
    .line 311
    .line 312
    const/4 p1, 0x0

    .line 313
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 317
    goto :goto_6

    .line 318
    :catchall_5
    move-exception p1

    .line 319
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :goto_6
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_6
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 328
    .line 329
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    check-cast p1, Ljava/util/List;

    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    const-string v0, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback"

    .line 340
    .line 341
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    check-cast p1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 345
    .line 346
    :try_start_6
    invoke-interface {p1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 347
    .line 348
    .line 349
    const/4 p1, 0x0

    .line 350
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 354
    goto :goto_7

    .line 355
    :catchall_6
    move-exception p1

    .line 356
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    :goto_7
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_7
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 365
    .line 366
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    check-cast p1, Ljava/util/List;

    .line 370
    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    const-string v0, "null cannot be cast to non-null type java.security.cert.Certificate"

    .line 377
    .line 378
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    check-cast p1, Ljava/security/cert/Certificate;

    .line 382
    .line 383
    :try_start_7
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 384
    .line 385
    .line 386
    move-result-object p1
    :try_end_7
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 387
    :try_start_8
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    goto :goto_9

    .line 392
    :catchall_7
    move-exception p1

    .line 393
    goto :goto_8

    .line 394
    :catch_0
    move-exception p1

    .line 395
    new-instance v0, Ljava/lang/RuntimeException;

    .line 396
    .line 397
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 401
    :goto_8
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    :goto_9
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_8
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 410
    .line 411
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    check-cast p1, Ljava/util/List;

    .line 415
    .line 416
    const/4 v0, 0x0

    .line 417
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    const-string v0, "null cannot be cast to non-null type android.os.Message"

    .line 422
    .line 423
    invoke-static {p1, v0}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    check-cast p1, Landroid/os/Message;

    .line 427
    .line 428
    :try_start_9
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 429
    .line 430
    .line 431
    const/4 p1, 0x0

    .line 432
    invoke-static {p1}, La/a;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 436
    goto :goto_a

    .line 437
    :catchall_8
    move-exception p1

    .line 438
    invoke-static {p1}, LZ1/f;->Q(Ljava/lang/Throwable;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    :goto_a
    invoke-virtual {p2, p1}, LZ1/l;->u(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
.end method

.method public u(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v0, "channel-error"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, Ls2/l;->l:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    instance-of v6, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, v5, :cond_0

    .line 26
    .line 27
    new-instance v0, Ly3/a;

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 57
    .line 58
    .line 59
    sget p1, Ly3/Q;->h:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget p1, Ly3/Q;->h:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt\'."

    .line 66
    .line 67
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget p1, Ly3/Q;->h:I

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    instance-of v6, p1, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-le v0, v5, :cond_2

    .line 84
    .line 85
    new-instance v0, Ly3/a;

    .line 86
    .line 87
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 115
    .line 116
    .line 117
    sget p1, Ly3/Q;->h:I

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sget p1, Ly3/Q;->h:I

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt\'."

    .line 124
    .line 125
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget p1, Ly3/Q;->h:I

    .line 129
    .line 130
    :goto_1
    return-void

    .line 131
    :pswitch_2
    instance-of v6, p1, Ljava/util/List;

    .line 132
    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-le v0, v5, :cond_4

    .line 142
    .line 143
    new-instance v0, Ly3/a;

    .line 144
    .line 145
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v4, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 173
    .line 174
    .line 175
    sget p1, Ly3/Q;->h:I

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    sget p1, Ly3/Q;->h:I

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage\'."

    .line 182
    .line 183
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget p1, Ly3/Q;->h:I

    .line 187
    .line 188
    :goto_2
    return-void

    .line 189
    :pswitch_3
    instance-of v6, p1, Ljava/util/List;

    .line 190
    .line 191
    if-eqz v6, :cond_7

    .line 192
    .line 193
    check-cast p1, Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-le v0, v5, :cond_6

    .line 200
    .line 201
    new-instance v0, Ly3/a;

    .line 202
    .line 203
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast v4, Ljava/lang/String;

    .line 220
    .line 221
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 231
    .line 232
    .line 233
    sget p1, Ly3/Q;->h:I

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    sget p1, Ly3/Q;->h:I

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView\'."

    .line 240
    .line 241
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget p1, Ly3/Q;->h:I

    .line 245
    .line 246
    :goto_3
    return-void

    .line 247
    :pswitch_4
    instance-of v6, p1, Ljava/util/List;

    .line 248
    .line 249
    if-eqz v6, :cond_9

    .line 250
    .line 251
    check-cast p1, Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-le v0, v5, :cond_8

    .line 258
    .line 259
    new-instance v0, Ly3/a;

    .line 260
    .line 261
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v4, Ljava/lang/String;

    .line 278
    .line 279
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 289
    .line 290
    .line 291
    sget p1, Ly3/Q;->h:I

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    sget p1, Ly3/Q;->h:I

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest\'."

    .line 298
    .line 299
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget p1, Ly3/Q;->h:I

    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_5
    instance-of v6, p1, Ljava/util/List;

    .line 306
    .line 307
    if-eqz v6, :cond_b

    .line 308
    .line 309
    check-cast p1, Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-le v0, v5, :cond_a

    .line 316
    .line 317
    new-instance v0, Ly3/a;

    .line 318
    .line 319
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v1, Ljava/lang/String;

    .line 327
    .line 328
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    check-cast v4, Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 347
    .line 348
    .line 349
    sget p1, Ly3/Q;->h:I

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_a
    sget p1, Ly3/Q;->h:I

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged\'."

    .line 356
    .line 357
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sget p1, Ly3/Q;->h:I

    .line 361
    .line 362
    :goto_5
    return-void

    .line 363
    :pswitch_6
    instance-of v6, p1, Ljava/util/List;

    .line 364
    .line 365
    if-eqz v6, :cond_d

    .line 366
    .line 367
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-le v0, v5, :cond_c

    .line 374
    .line 375
    new-instance v0, Ly3/a;

    .line 376
    .line 377
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    check-cast v4, Ljava/lang/String;

    .line 394
    .line 395
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 405
    .line 406
    .line 407
    sget p1, Ly3/Q;->h:I

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_c
    sget p1, Ly3/Q;->h:I

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView\'."

    .line 414
    .line 415
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    sget p1, Ly3/Q;->h:I

    .line 419
    .line 420
    :goto_6
    return-void

    .line 421
    :pswitch_7
    instance-of v6, p1, Ljava/util/List;

    .line 422
    .line 423
    if-eqz v6, :cond_e

    .line 424
    .line 425
    check-cast p1, Ljava/util/List;

    .line 426
    .line 427
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-le v0, v5, :cond_f

    .line 432
    .line 433
    new-instance v0, Ly3/a;

    .line 434
    .line 435
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    check-cast v1, Ljava/lang/String;

    .line 443
    .line 444
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    check-cast v4, Ljava/lang/String;

    .line 452
    .line 453
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    check-cast p1, Ljava/lang/String;

    .line 458
    .line 459
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_e
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage\'."

    .line 467
    .line 468
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    :cond_f
    :goto_7
    return-void

    .line 472
    :pswitch_8
    instance-of v6, p1, Ljava/util/List;

    .line 473
    .line 474
    if-eqz v6, :cond_10

    .line 475
    .line 476
    check-cast p1, Ljava/util/List;

    .line 477
    .line 478
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-le v0, v5, :cond_11

    .line 483
    .line 484
    new-instance v0, Ly3/a;

    .line 485
    .line 486
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-static {v1, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    check-cast v1, Ljava/lang/String;

    .line 494
    .line 495
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {v4, v3}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    check-cast v4, Ljava/lang/String;

    .line 503
    .line 504
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    check-cast p1, Ljava/lang/String;

    .line 509
    .line 510
    invoke-direct {v0, v1, v4, p1}, Ly3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v0}, Li4/a;->p(Ljava/lang/Throwable;)LB3/c;

    .line 514
    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_10
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart\'."

    .line 518
    .line 519
    invoke-static {v0, p1, v1}, Lm/B0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :cond_11
    :goto_8
    return-void

    .line 523
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
.end method
