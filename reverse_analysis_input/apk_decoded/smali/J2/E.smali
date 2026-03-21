.class public final LJ2/E;
.super LG2/r;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LG2/e;LG2/r;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ2/E;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ2/E;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LJ2/E;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LJ2/E;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJ2/E;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LJ2/E;->d:Ljava/lang/Object;

    iput-object p2, p0, LJ2/E;->b:Ljava/lang/Object;

    iput-object p3, p0, LJ2/E;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(LO2/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LJ2/E;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LI2/d;->i(LO2/a;)LG2/g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, LG2/g;->g()LG2/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LJ2/E;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v0, v0, LG2/j;->l:LI2/p;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, LI2/p;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LG2/g;

    .line 29
    .line 30
    const-string v2, "cannot deserialize "

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, LG2/g;->h()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v3, p0, LJ2/E;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, LG2/r;

    .line 47
    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    :try_start_0
    new-instance v0, LJ2/o;

    .line 51
    .line 52
    sget-object v1, LJ2/o;->E:LJ2/n;

    .line 53
    .line 54
    invoke-direct {v0, v1}, LO2/a;-><init>(Ljava/io/Reader;)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x20

    .line 58
    .line 59
    new-array v2, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v2, v0, LJ2/o;->A:[Ljava/lang/Object;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    iput v2, v0, LJ2/o;->B:I

    .line 65
    .line 66
    new-array v2, v1, [Ljava/lang/String;

    .line 67
    .line 68
    iput-object v2, v0, LJ2/o;->C:[Ljava/lang/String;

    .line 69
    .line 70
    new-array v1, v1, [I

    .line 71
    .line 72
    iput-object v1, v0, LJ2/o;->D:[I

    .line 73
    .line 74
    invoke-virtual {v0, p1}, LJ2/o;->T(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v0}, LG2/r;->b(LO2/a;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    return-object p1

    .line 82
    :catch_0
    move-exception p1

    .line 83
    new-instance v0, LG2/h;

    .line 84
    .line 85
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_0
    new-instance p1, LA1/c;

    .line 90
    .line 91
    new-instance v3, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->a(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, " subtype named "

    .line 104
    .line 105
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, "; did you forget to register a subtype?"

    .line 112
    .line 113
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_1
    new-instance p1, LA1/c;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->a(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v2, " because it does not define a field named "

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :pswitch_0
    iget-object v0, p0, LJ2/E;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, LG2/r;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, LG2/r;->b(LO2/a;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c(LO2/b;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LJ2/E;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LJ2/E;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->b(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p0, LJ2/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, LG2/r;

    .line 33
    .line 34
    const-string v4, "cannot serialize "

    .line 35
    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    :try_start_0
    new-instance v5, LJ2/q;

    .line 42
    .line 43
    invoke-direct {v5}, LJ2/q;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v5, p2}, LG2/r;->c(LO2/b;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, v5, LJ2/q;->z:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object p2, v5, LJ2/q;->B:LG2/g;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    invoke-virtual {p2}, LG2/g;->g()LG2/j;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object p2, p2, LG2/j;->l:LI2/p;

    .line 68
    .line 69
    invoke-virtual {p2, v3}, LI2/p;->containsKey(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    new-instance v0, LG2/j;

    .line 76
    .line 77
    invoke-direct {v0}, LG2/j;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v3, LG2/k;

    .line 85
    .line 86
    invoke-direct {v3, v2}, LG2/k;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, LG2/j;->l:LI2/p;

    .line 90
    .line 91
    invoke-virtual {v2, v1, v3}, LI2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, LI2/p;->entrySet()Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, LI2/n;

    .line 99
    .line 100
    invoke-virtual {p2}, LI2/n;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    :goto_0
    move-object v1, p2

    .line 105
    check-cast v1, LI2/m;

    .line 106
    .line 107
    invoke-virtual {v1}, LI2/m;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    move-object v1, p2

    .line 114
    check-cast v1, LI2/m;

    .line 115
    .line 116
    invoke-virtual {v1}, LI2/m;->b()LI2/o;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, LG2/g;

    .line 131
    .line 132
    if-nez v1, :cond_0

    .line 133
    .line 134
    sget-object v1, LG2/i;->l:LG2/i;

    .line 135
    .line 136
    :cond_0
    invoke-virtual {v2, v3, v1}, LI2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    sget-object p2, LJ2/j0;->z:LJ2/m;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {p1, v0}, LJ2/m;->e(LO2/b;LG2/g;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    new-instance p1, LA1/c;

    .line 150
    .line 151
    new-instance p2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v0, " because it already defines a field named "

    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_3
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, "Expected one JSON element but was "

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 203
    :catch_0
    move-exception p1

    .line 204
    new-instance p2, LG2/h;

    .line 205
    .line 206
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw p2

    .line 210
    :cond_4
    new-instance p1, LA1/c;

    .line 211
    .line 212
    new-instance p2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v0, "; did you forget to register a subtype?"

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1

    .line 237
    :pswitch_0
    iget-object v0, p0, LJ2/E;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Ljava/lang/reflect/Type;

    .line 240
    .line 241
    if-eqz p2, :cond_6

    .line 242
    .line 243
    instance-of v1, v0, Ljava/lang/Class;

    .line 244
    .line 245
    if-nez v1, :cond_5

    .line 246
    .line 247
    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    .line 248
    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    goto :goto_1

    .line 256
    :cond_6
    move-object v1, v0

    .line 257
    :goto_1
    iget-object v2, p0, LJ2/E;->c:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, LG2/r;

    .line 260
    .line 261
    if-eq v1, v0, :cond_b

    .line 262
    .line 263
    new-instance v0, LN2/a;

    .line 264
    .line 265
    invoke-direct {v0, v1}, LN2/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 266
    .line 267
    .line 268
    iget-object v1, p0, LJ2/E;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v1, LG2/e;

    .line 271
    .line 272
    invoke-virtual {v1, v0}, LG2/e;->c(LN2/a;)LG2/r;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    instance-of v1, v0, LJ2/w;

    .line 277
    .line 278
    if-nez v1, :cond_7

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_7
    move-object v1, v2

    .line 282
    :goto_2
    instance-of v3, v1, LJ2/B;

    .line 283
    .line 284
    if-eqz v3, :cond_9

    .line 285
    .line 286
    move-object v3, v1

    .line 287
    check-cast v3, LJ2/B;

    .line 288
    .line 289
    invoke-virtual {v3}, LJ2/B;->d()LG2/r;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    if-ne v3, v1, :cond_8

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_8
    move-object v1, v3

    .line 297
    goto :goto_2

    .line 298
    :cond_9
    :goto_3
    instance-of v1, v1, LJ2/w;

    .line 299
    .line 300
    if-nez v1, :cond_a

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_a
    :goto_4
    move-object v2, v0

    .line 304
    :cond_b
    :goto_5
    invoke-virtual {v2, p1, p2}, LG2/r;->c(LO2/b;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
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
