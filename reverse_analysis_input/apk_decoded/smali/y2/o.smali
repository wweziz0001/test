.class public abstract Ly2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp1/b;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lp1/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly2/o;->a:Lp1/b;

    .line 9
    .line 10
    return-void
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

.method public static a(LZ1/s;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LB2/a;->b:LB2/a;

    .line 7
    .line 8
    iget-object v1, p0, LZ1/s;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lr2/k;

    .line 47
    .line 48
    iget-object v4, v3, Lr2/k;->d:LD2/Z;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/4 v5, 0x1

    .line 55
    if-eq v4, v5, :cond_3

    .line 56
    .line 57
    const/4 v5, 0x2

    .line 58
    if-eq v4, v5, :cond_2

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    if-ne v4, v5, :cond_1

    .line 62
    .line 63
    sget-object v4, Lr2/f;->e:Lr2/f;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "Unknown key status"

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_2
    sget-object v4, Lr2/f;->d:Lr2/f;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sget-object v4, Lr2/f;->c:Lr2/f;

    .line 78
    .line 79
    :goto_1
    iget-object v5, v3, Lr2/k;->g:Ljava/lang/String;

    .line 80
    .line 81
    const-string v6, "type.googleapis.com/google.crypto."

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    const/16 v6, 0x22

    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :goto_2
    iget-object v6, v3, Lr2/k;->e:LD2/r0;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    new-instance v7, LB2/b;

    .line 103
    .line 104
    iget v3, v3, Lr2/k;->f:I

    .line 105
    .line 106
    invoke-direct {v7, v4, v3, v5, v6}, LB2/b;-><init>(Lr2/f;ILjava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    iget-object p0, p0, LZ1/s;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Lr2/k;

    .line 116
    .line 117
    if-eqz p0, :cond_6

    .line 118
    .line 119
    iget p0, p0, Lr2/k;->f:I

    .line 120
    .line 121
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/4 p0, 0x0

    .line 127
    :goto_3
    if-eqz p0, :cond_9

    .line 128
    .line 129
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, LB2/b;

    .line 148
    .line 149
    iget v2, v2, LB2/b;->b:I

    .line 150
    .line 151
    if-ne v2, p0, :cond_7

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 155
    .line 156
    const-string v0, "primary key ID is not present in entries"

    .line 157
    .line 158
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :catch_0
    move-exception p0

    .line 163
    goto :goto_5

    .line 164
    :cond_9
    :goto_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v0
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
