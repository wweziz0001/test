.class public abstract Lr2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

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
.end method

.method public static a(LD2/g0;)LD2/k0;
    .locals 5

    .line 1
    invoke-static {}, LD2/k0;->B()LD2/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LD2/g0;->D()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 13
    .line 14
    check-cast v2, LD2/k0;

    .line 15
    .line 16
    invoke-static {v2, v1}, LD2/k0;->y(LD2/k0;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LD2/g0;->C()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, LD2/f0;

    .line 38
    .line 39
    invoke-static {}, LD2/j0;->D()LD2/i0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1}, LD2/f0;->C()LD2/Y;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, LD2/Y;->D()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 52
    .line 53
    .line 54
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 55
    .line 56
    check-cast v4, LD2/j0;

    .line 57
    .line 58
    invoke-static {v4, v3}, LD2/j0;->y(LD2/j0;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, LD2/f0;->F()LD2/Z;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 66
    .line 67
    .line 68
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 69
    .line 70
    check-cast v4, LD2/j0;

    .line 71
    .line 72
    invoke-static {v4, v3}, LD2/j0;->A(LD2/j0;LD2/Z;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, LD2/f0;->E()LD2/r0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 80
    .line 81
    .line 82
    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 83
    .line 84
    check-cast v4, LD2/j0;

    .line 85
    .line 86
    invoke-static {v4, v3}, LD2/j0;->z(LD2/j0;LD2/r0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, LD2/f0;->D()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 94
    .line 95
    .line 96
    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 97
    .line 98
    check-cast v3, LD2/j0;

    .line 99
    .line 100
    invoke-static {v3, v1}, LD2/j0;->B(LD2/j0;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, LD2/j0;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->e()V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 113
    .line 114
    check-cast v2, LD2/k0;

    .line 115
    .line 116
    invoke-static {v2, v1}, LD2/k0;->z(LD2/k0;LD2/j0;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->b()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, LD2/k0;

    .line 125
    .line 126
    return-object p0
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
