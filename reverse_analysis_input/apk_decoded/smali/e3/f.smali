.class public final Le3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le3/f;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {}, LZ1/m;->z()LZ1/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, LZ1/m;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lh3/f;

    .line 18
    .line 19
    iget-boolean v1, v0, Lh3/f;->a:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lh3/f;->c(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1, p2}, Lh3/f;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method


# virtual methods
.method public final a(Le3/e;)Le3/c;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Le3/e;->n:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, v2

    .line 8
    check-cast v4, Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, v1, Le3/e;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lf3/a;

    .line 13
    .line 14
    iget-object v3, v1, Le3/e;->p:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v9, v3

    .line 17
    check-cast v9, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, v1, Le3/e;->q:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v10, v3

    .line 22
    check-cast v10, Ljava/util/List;

    .line 23
    .line 24
    new-instance v12, Lio/flutter/plugin/platform/p;

    .line 25
    .line 26
    invoke-direct {v12}, Lio/flutter/plugin/platform/p;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-boolean v13, v1, Le3/e;->l:Z

    .line 30
    .line 31
    iget-boolean v1, v1, Le3/e;->m:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-static {}, Lf3/a;->a()Lf3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :cond_0
    iget-object v14, v0, Le3/f;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    new-instance v11, Le3/c;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v3, v11

    .line 51
    move-object v6, v12

    .line 52
    move v7, v13

    .line 53
    move v8, v1

    .line 54
    invoke-direct/range {v3 .. v8}, Le3/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/p;ZZ)V

    .line 55
    .line 56
    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    iget-object v1, v11, Le3/c;->i:Lm3/a;

    .line 60
    .line 61
    iget-object v1, v1, Lm3/a;->a:Ln3/q;

    .line 62
    .line 63
    const-string v3, "setInitialRoute"

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-virtual {v1, v3, v9, v4}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget-object v1, v11, Le3/c;->c:Lf3/b;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v10}, Lf3/b;->b(Lf3/a;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v3, 0x0

    .line 76
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Le3/c;

    .line 81
    .line 82
    iget-object v5, v3, Le3/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 83
    .line 84
    invoke-virtual {v5}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    sget-wide v15, Le3/c;->x:J

    .line 91
    .line 92
    iget-object v6, v2, Lf3/a;->c:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v7, v2, Lf3/a;->b:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v5, v3, Le3/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 97
    .line 98
    move-object v8, v9

    .line 99
    move-object v9, v10

    .line 100
    move-wide v10, v15

    .line 101
    invoke-virtual/range {v5 .. v11}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lio/flutter/embedding/engine/FlutterJNI;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    new-instance v11, Le3/c;

    .line 106
    .line 107
    move-object v3, v11

    .line 108
    move-object v6, v12

    .line 109
    move v7, v13

    .line 110
    move v8, v1

    .line 111
    invoke-direct/range {v3 .. v8}, Le3/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/p;ZZ)V

    .line 112
    .line 113
    .line 114
    :goto_0
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    new-instance v1, Le3/d;

    .line 118
    .line 119
    invoke-direct {v1, v0, v11}, Le3/d;-><init>(Le3/f;Le3/c;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v11, Le3/c;->u:Ljava/util/HashSet;

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-object v11

    .line 128
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    const-string v2, "Spawn can only be called on a fully constructed FlutterEngine"

    .line 131
    .line 132
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v1
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
