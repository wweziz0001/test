.class public final Ld4/b;
.super LN3/i;
.source "SourceFile"

# interfaces
.implements LM3/l;


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ld4/b;->m:I

    iput-object p1, p0, Ld4/b;->n:Ljava/lang/Object;

    iput-object p3, p0, Ld4/b;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LN3/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ld4/b;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    iget-object p1, p0, Ld4/b;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LL/K;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LL/K;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ld4/b;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, LZ1/i;

    .line 20
    .line 21
    iget-object p1, v1, LZ1/i;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, LX3/d;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p1, v0, v2}, LX3/d;->h(Ljava/lang/Throwable;Z)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p1, v1, LZ1/i;->n:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LX3/d;

    .line 32
    .line 33
    invoke-virtual {p1}, LX3/d;->d()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of v2, p1, LX3/j;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p1, v3

    .line 44
    :goto_0
    sget-object v2, LB3/g;->a:LB3/g;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    sget-object v3, LL/L;->m:LL/L;

    .line 49
    .line 50
    invoke-virtual {v3, p1, v0}, LL/L;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-object v3, v2

    .line 54
    :cond_2
    if-nez v3, :cond_0

    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    sget-object p1, Ld4/d;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    iget-object v0, p0, Ld4/b;->o:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ld4/c;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Ld4/b;->n:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ld4/d;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ld4/d;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, LB3/g;->a:LB3/g;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 83
    .line 84
    iget-object p1, p0, Ld4/b;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ld4/c;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Ld4/b;->n:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Ld4/d;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-virtual {p1, v0}, Ld4/d;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, LB3/g;->a:LB3/g;

    .line 100
    .line 101
    return-object p1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
