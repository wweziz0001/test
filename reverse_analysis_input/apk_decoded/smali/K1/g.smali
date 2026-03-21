.class public final LK1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:LK1/g;

.field public static final b:LB3/e;

.field public static final c:LK1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK1/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK1/g;->a:LK1/g;

    .line 7
    .line 8
    const-class v0, LK1/h;

    .line 9
    .line 10
    invoke-static {v0}, LN3/q;->a(Ljava/lang/Class;)LN3/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LN3/e;->b()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    sget-object v0, LK1/f;->m:LK1/f;

    .line 18
    .line 19
    new-instance v1, LB3/e;

    .line 20
    .line 21
    invoke-direct {v1, v0}, LB3/e;-><init>(LM3/a;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, LK1/g;->b:LB3/e;

    .line 25
    .line 26
    sget-object v0, LK1/a;->a:LK1/a;

    .line 27
    .line 28
    sput-object v0, LK1/g;->c:LK1/a;

    .line 29
    .line 30
    return-void
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

.method public static a(Landroid/content/Context;)LK1/b;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK1/g;->b:LB3/e;

    .line 7
    .line 8
    invoke-virtual {v0}, LB3/e;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LL1/a;

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    sget-object v0, LN1/l;->c:LN1/l;

    .line 17
    .line 18
    sget-object v0, LN1/l;->c:LN1/l;

    .line 19
    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    sget-object v0, LN1/l;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v1, LN1/l;->c:LN1/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :try_start_1
    invoke-static {}, LN1/h;->c()LH1/i;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v3, LH1/i;->q:LH1/i;

    .line 40
    .line 41
    const-string v4, "other"

    .line 42
    .line 43
    invoke-static {v3, v4}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, LH1/i;->p:LB3/e;

    .line 47
    .line 48
    invoke-virtual {v2}, LB3/e;->a()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "<get-bigInteger>(...)"

    .line 53
    .line 54
    invoke-static {v2, v4}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v2, Ljava/math/BigInteger;

    .line 58
    .line 59
    iget-object v3, v3, LH1/i;->p:LB3/e;

    .line 60
    .line 61
    invoke-virtual {v3}, LB3/e;->a()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3, v4}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    check-cast v3, Ljava/math/BigInteger;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ltz v2, :cond_2

    .line 75
    .line 76
    new-instance v2, LN1/j;

    .line 77
    .line 78
    invoke-direct {v2, p0}, LN1/j;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, LN1/j;->i()Z

    .line 82
    .line 83
    .line 84
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    if-nez p0, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object v1, v2

    .line 89
    :catchall_0
    :cond_2
    :goto_0
    :try_start_2
    new-instance p0, LN1/l;

    .line 90
    .line 91
    invoke-direct {p0, v1}, LN1/l;-><init>(LN1/j;)V

    .line 92
    .line 93
    .line 94
    sput-object p0, LN1/l;->c:LN1/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 104
    .line 105
    .line 106
    throw p0

    .line 107
    :cond_4
    :goto_3
    sget-object v0, LN1/l;->c:LN1/l;

    .line 108
    .line 109
    invoke-static {v0}, LN3/h;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    new-instance p0, LK1/b;

    .line 113
    .line 114
    sget v1, LK1/o;->b:I

    .line 115
    .line 116
    invoke-direct {p0, v0}, LK1/b;-><init>(LL1/a;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, LK1/g;->c:LK1/a;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    return-object p0
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
