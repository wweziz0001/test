.class public final LL/K;
.super LN3/i;
.source "SourceFile"

# interfaces
.implements LM3/l;


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LL/K;->m:I

    iput-object p1, p0, LL/K;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LN3/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LL/K;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, LL/K;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ld4/h;

    .line 11
    .line 12
    invoke-virtual {p1}, Ld4/h;->b()V

    .line 13
    .line 14
    .line 15
    sget-object p1, LB3/g;->a:LB3/g;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 19
    .line 20
    sget-object p1, LB3/g;->a:LB3/g;

    .line 21
    .line 22
    iget-object v0, p0, LL/K;->n:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LV3/f;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LV3/f;->j(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    iget-object v0, p0, LL/K;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LQ1/k;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, LQ1/k;->a:Lb2/k;

    .line 39
    .line 40
    invoke-virtual {p1}, Lb2/i;->isDone()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "Failed requirement."

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget-object p1, v0, LQ1/k;->a:Lb2/k;

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p1, v0}, Lb2/i;->cancel(Z)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v0, v0, LQ1/k;->a:Lb2/k;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move-object p1, v1

    .line 76
    :goto_0
    invoke-virtual {v0, p1}, Lb2/k;->k(Ljava/lang/Throwable;)Z

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object p1, LB3/g;->a:LB3/g;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 83
    .line 84
    iget-object v0, p0, LL/K;->n:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, LL/P;

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    iget-object v1, v0, LL/P;->s:LB0/d;

    .line 91
    .line 92
    new-instance v2, LL/Q;

    .line 93
    .line 94
    invoke-direct {v2, p1}, LL/Q;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, LB0/d;->u(LL/a0;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object p1, v0, LL/P;->u:LB3/e;

    .line 101
    .line 102
    iget-object p1, p1, LB3/e;->m:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v1, LB3/f;->a:LB3/f;

    .line 105
    .line 106
    if-eq p1, v1, :cond_5

    .line 107
    .line 108
    iget-object p1, v0, LL/P;->u:LB3/e;

    .line 109
    .line 110
    invoke-virtual {p1}, LB3/e;->a()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, LN/i;

    .line 115
    .line 116
    invoke-virtual {p1}, LN/i;->close()V

    .line 117
    .line 118
    .line 119
    :cond_5
    sget-object p1, LB3/g;->a:LB3/g;

    .line 120
    .line 121
    return-object p1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
