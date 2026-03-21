.class public final LV1/g;
.super LG3/f;
.source "SourceFile"

# interfaces
.implements LM3/q;


# instance fields
.field public p:I

.field public synthetic q:LY3/h;

.field public synthetic r:[Ljava/lang/Object;


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LF3/a;->l:LF3/a;

    .line 2
    .line 3
    iget v1, p0, LV1/g;->p:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LV1/g;->q:LY3/h;

    .line 26
    .line 27
    iget-object v1, p0, LV1/g;->r:[Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, [LV1/c;

    .line 30
    .line 31
    array-length v3, v1

    .line 32
    const/4 v4, 0x0

    .line 33
    :goto_0
    sget-object v5, LV1/a;->a:LV1/a;

    .line 34
    .line 35
    if-ge v4, v3, :cond_3

    .line 36
    .line 37
    aget-object v6, v1, v4

    .line 38
    .line 39
    invoke-static {v6, v5}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-nez v7, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/4 v6, 0x0

    .line 50
    :goto_1
    if-nez v6, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    move-object v5, v6

    .line 54
    :goto_2
    iput v2, p0, LV1/g;->p:I

    .line 55
    .line 56
    invoke-interface {p1, v5, p0}, LY3/h;->k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_5
    :goto_3
    sget-object p1, LB3/g;->a:LB3/g;

    .line 64
    .line 65
    return-object p1
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method
