.class public final LI2/n;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:LI2/p;


# direct methods
.method public synthetic constructor <init>(LI2/p;I)V
    .locals 0

    .line 1
    iput p2, p0, LI2/n;->l:I

    iput-object p1, p0, LI2/n;->m:LI2/p;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, LI2/n;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 7
    .line 8
    invoke-virtual {v0}, LI2/p;->clear()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 13
    .line 14
    invoke-virtual {v0}, LI2/p;->clear()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, LI2/n;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LI2/p;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p1, Ljava/util/Map$Entry;

    .line 19
    .line 20
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0, v2, v1}, LI2/p;->a(Ljava/lang/Object;Z)LI2/o;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    :cond_0
    move-object v0, v3

    .line 38
    :goto_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v2, v0, LI2/o;->s:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    move-object v3, v0

    .line 53
    :cond_1
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    :cond_2
    return v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, LI2/n;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LI2/m;

    .line 7
    .line 8
    iget-object v1, p0, LI2/n;->m:LI2/p;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, v2}, LI2/m;-><init>(LI2/p;I)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, LI2/m;

    .line 16
    .line 17
    iget-object v1, p0, LI2/n;->m:LI2/p;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, LI2/m;-><init>(LI2/p;I)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget v0, p0, LI2/n;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0, p1, v1}, LI2/p;->a(Ljava/lang/Object;Z)LI2/o;

    .line 16
    .line 17
    .line 18
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    :cond_0
    const/4 p1, 0x1

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v2, p1}, LI2/p;->c(LI2/o;Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz v2, :cond_2

    .line 26
    .line 27
    move v1, p1

    .line 28
    :cond_2
    return v1

    .line 29
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0, v2, v1}, LI2/p;->a(Ljava/lang/Object;Z)LI2/o;

    .line 50
    .line 51
    .line 52
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    goto :goto_0

    .line 54
    :catch_1
    :cond_4
    move-object v2, v3

    .line 55
    :goto_0
    if-eqz v2, :cond_5

    .line 56
    .line 57
    iget-object v4, v2, LI2/o;->s:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v4, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_5

    .line 68
    .line 69
    move-object v3, v2

    .line 70
    :cond_5
    if-nez v3, :cond_6

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const/4 v1, 0x1

    .line 74
    invoke-virtual {v0, v3, v1}, LI2/p;->c(LI2/o;Z)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return v1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LI2/n;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 7
    .line 8
    iget v0, v0, LI2/p;->o:I

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LI2/n;->m:LI2/p;

    .line 12
    .line 13
    iget v0, v0, LI2/p;->o:I

    .line 14
    .line 15
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
