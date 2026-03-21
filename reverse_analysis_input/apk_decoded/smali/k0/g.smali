.class public final Lk0/g;
.super Lx0/a;
.source "SourceFile"


# instance fields
.field public final A:J

.field public final B:Lm0/e;

.field public final C:LB0/t;

.field public final D:Lk0/d;

.field public final E:Ljava/lang/Object;

.field public final F:Landroid/util/SparseArray;

.field public final G:Lk0/c;

.field public final H:Lk0/c;

.field public final I:Lk0/d;

.field public final J:LB0/s;

.field public K:Lf0/h;

.field public L:LB0/r;

.field public M:Lf0/A;

.field public N:LK3/b;

.field public O:Landroid/os/Handler;

.field public P:La0/v;

.field public Q:Landroid/net/Uri;

.field public final R:Landroid/net/Uri;

.field public S:Ll0/c;

.field public T:Z

.field public U:J

.field public V:J

.field public W:J

.field public X:I

.field public Y:J

.field public Z:I

.field public a0:La0/A;

.field public final s:Z

.field public final t:Lf0/g;

.field public final u:LD0/d;

.field public final v:Lp1/b;

.field public final w:Lm0/i;

.field public final x:LA0/b;

.field public final y:LZ1/i;

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.dash"

    .line 2
    .line 3
    invoke-static {v0}, La0/B;->a(Ljava/lang/String;)V

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

.method public constructor <init>(La0/A;Lf0/g;LB0/t;LD0/d;Lp1/b;Lm0/i;LA0/b;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lx0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/g;->a0:La0/A;

    .line 5
    .line 6
    iget-object v0, p1, La0/A;->c:La0/v;

    .line 7
    .line 8
    iput-object v0, p0, Lk0/g;->P:La0/v;

    .line 9
    .line 10
    iget-object p1, p1, La0/A;->b:La0/w;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, La0/w;->a:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p1, p0, Lk0/g;->Q:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, Lk0/g;->R:Landroid/net/Uri;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lk0/g;->S:Ll0/c;

    .line 23
    .line 24
    iput-object p2, p0, Lk0/g;->t:Lf0/g;

    .line 25
    .line 26
    iput-object p3, p0, Lk0/g;->C:LB0/t;

    .line 27
    .line 28
    iput-object p4, p0, Lk0/g;->u:LD0/d;

    .line 29
    .line 30
    iput-object p6, p0, Lk0/g;->w:Lm0/i;

    .line 31
    .line 32
    iput-object p7, p0, Lk0/g;->x:LA0/b;

    .line 33
    .line 34
    iput-wide p8, p0, Lk0/g;->z:J

    .line 35
    .line 36
    iput-wide p10, p0, Lk0/g;->A:J

    .line 37
    .line 38
    iput-object p5, p0, Lk0/g;->v:Lp1/b;

    .line 39
    .line 40
    new-instance p2, LZ1/i;

    .line 41
    .line 42
    const/16 p3, 0xb

    .line 43
    .line 44
    invoke-direct {p2, p3}, LZ1/i;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lk0/g;->y:LZ1/i;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    iput-boolean p2, p0, Lk0/g;->s:Z

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lx0/a;->h(Lx0/H;)Lm0/e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lk0/g;->B:Lm0/e;

    .line 57
    .line 58
    new-instance p1, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lk0/g;->E:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lk0/g;->F:Landroid/util/SparseArray;

    .line 71
    .line 72
    new-instance p1, Lk0/d;

    .line 73
    .line 74
    const/4 p2, 0x1

    .line 75
    invoke-direct {p1, p0, p2}, Lk0/d;-><init>(Lk0/g;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lk0/g;->I:Lk0/d;

    .line 79
    .line 80
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    iput-wide p1, p0, Lk0/g;->Y:J

    .line 86
    .line 87
    iput-wide p1, p0, Lk0/g;->W:J

    .line 88
    .line 89
    new-instance p1, Lk0/d;

    .line 90
    .line 91
    const/4 p2, 0x2

    .line 92
    invoke-direct {p1, p0, p2}, Lk0/d;-><init>(Lk0/g;I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lk0/g;->D:Lk0/d;

    .line 96
    .line 97
    new-instance p1, Lk0/d;

    .line 98
    .line 99
    const/4 p2, 0x3

    .line 100
    invoke-direct {p1, p0, p2}, Lk0/d;-><init>(Lk0/g;I)V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Lk0/g;->J:LB0/s;

    .line 104
    .line 105
    new-instance p1, Lk0/c;

    .line 106
    .line 107
    const/4 p2, 0x0

    .line 108
    invoke-direct {p1, p0, p2}, Lk0/c;-><init>(Lk0/g;I)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lk0/g;->G:Lk0/c;

    .line 112
    .line 113
    new-instance p1, Lk0/c;

    .line 114
    .line 115
    const/4 p2, 0x1

    .line 116
    invoke-direct {p1, p0, p2}, Lk0/c;-><init>(Lk0/g;I)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lk0/g;->H:Lk0/c;

    .line 120
    .line 121
    return-void
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
.end method

.method public static w(Ll0/h;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Ll0/h;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ll0/a;

    .line 16
    .line 17
    iget v2, v2, Ll0/a;->b:I

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return v3

    .line 30
    :cond_2
    return v0
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


# virtual methods
.method public final A(Z)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :goto_0
    iget-object v0, v1, Lk0/g;->F:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-ge v3, v4, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v6, v1, Lk0/g;->Z:I

    .line 18
    .line 19
    if-lt v4, v6, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, Lk0/b;

    .line 27
    .line 28
    iget-object v7, v1, Lk0/g;->S:Ll0/c;

    .line 29
    .line 30
    iget v0, v1, Lk0/g;->Z:I

    .line 31
    .line 32
    sub-int/2addr v4, v0

    .line 33
    iput-object v7, v6, Lk0/b;->F:Ll0/c;

    .line 34
    .line 35
    iput v4, v6, Lk0/b;->G:I

    .line 36
    .line 37
    iget-object v0, v6, Lk0/b;->x:Lk0/o;

    .line 38
    .line 39
    iput-boolean v2, v0, Lk0/o;->s:Z

    .line 40
    .line 41
    iput-object v7, v0, Lk0/o;->q:Ll0/c;

    .line 42
    .line 43
    iget-object v8, v0, Lk0/o;->p:Ljava/util/TreeMap;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v11, v0, Lk0/o;->q:Ll0/c;

    .line 76
    .line 77
    iget-wide v11, v11, Ll0/c;->h:J

    .line 78
    .line 79
    cmp-long v9, v9, v11

    .line 80
    .line 81
    if-gez v9, :cond_0

    .line 82
    .line 83
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v8, v6, Lk0/b;->C:[Ly0/h;

    .line 88
    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    array-length v9, v8

    .line 92
    move v10, v2

    .line 93
    :goto_2
    if-ge v10, v9, :cond_3

    .line 94
    .line 95
    aget-object v0, v8, v10

    .line 96
    .line 97
    iget-object v0, v0, Ly0/h;->p:Ly0/i;

    .line 98
    .line 99
    move-object v11, v0

    .line 100
    check-cast v11, Lk0/k;

    .line 101
    .line 102
    iget-object v0, v11, Lk0/k;->i:[Lk0/i;

    .line 103
    .line 104
    :try_start_0
    iput-object v7, v11, Lk0/k;->k:Ll0/c;

    .line 105
    .line 106
    iput v4, v11, Lk0/k;->l:I

    .line 107
    .line 108
    invoke-virtual {v7, v4}, Ll0/c;->d(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    invoke-virtual {v11}, Lk0/k;->h()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    move v15, v2

    .line 117
    :goto_3
    array-length v2, v0

    .line 118
    if-ge v15, v2, :cond_2

    .line 119
    .line 120
    iget-object v2, v11, Lk0/k;->j:LA0/w;

    .line 121
    .line 122
    invoke-interface {v2, v15}, LA0/w;->k(I)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ll0/m;

    .line 131
    .line 132
    aget-object v5, v0, v15

    .line 133
    .line 134
    invoke-virtual {v5, v12, v13, v2}, Lk0/i;->a(JLl0/m;)Lk0/i;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    aput-object v2, v0, v15
    :try_end_0
    .catch Lx0/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    add-int/lit8 v15, v15, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :catch_0
    move-exception v0

    .line 144
    iput-object v0, v11, Lk0/k;->m:Lx0/b;

    .line 145
    .line 146
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    goto :goto_2

    .line 150
    :cond_3
    iget-object v0, v6, Lk0/b;->B:Lx0/E;

    .line 151
    .line 152
    invoke-interface {v0, v6}, Lx0/g0;->d(Lx0/h0;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {v7, v4}, Ll0/c;->b(I)Ll0/h;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v0, v0, Ll0/h;->d:Ljava/util/List;

    .line 160
    .line 161
    iput-object v0, v6, Lk0/b;->H:Ljava/util/List;

    .line 162
    .line 163
    iget-object v0, v6, Lk0/b;->D:[Lk0/l;

    .line 164
    .line 165
    array-length v2, v0

    .line 166
    const/4 v5, 0x0

    .line 167
    :goto_4
    if-ge v5, v2, :cond_8

    .line 168
    .line 169
    aget-object v8, v0, v5

    .line 170
    .line 171
    iget-object v9, v6, Lk0/b;->H:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_7

    .line 182
    .line 183
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, Ll0/g;

    .line 188
    .line 189
    invoke-virtual {v10}, Ll0/g;->a()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    iget-object v12, v8, Lk0/l;->p:Ll0/g;

    .line 194
    .line 195
    invoke-virtual {v12}, Ll0/g;->a()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-eqz v11, :cond_5

    .line 204
    .line 205
    iget-object v9, v7, Ll0/c;->m:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    const/4 v11, 0x1

    .line 212
    sub-int/2addr v9, v11

    .line 213
    iget-boolean v11, v7, Ll0/c;->d:Z

    .line 214
    .line 215
    if-eqz v11, :cond_6

    .line 216
    .line 217
    if-ne v4, v9, :cond_6

    .line 218
    .line 219
    const/4 v9, 0x1

    .line 220
    goto :goto_5

    .line 221
    :cond_6
    const/4 v9, 0x0

    .line 222
    :goto_5
    invoke-virtual {v8, v10, v9}, Lk0/l;->b(Ll0/g;Z)V

    .line 223
    .line 224
    .line 225
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_9
    iget-object v0, v1, Lk0/g;->S:Ll0/c;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-virtual {v0, v2}, Ll0/c;->b(I)Ll0/h;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v2, v1, Lk0/g;->S:Ll0/c;

    .line 241
    .line 242
    iget-object v2, v2, Ll0/c;->m:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/4 v3, 0x1

    .line 249
    sub-int/2addr v2, v3

    .line 250
    iget-object v3, v1, Lk0/g;->S:Ll0/c;

    .line 251
    .line 252
    invoke-virtual {v3, v2}, Ll0/c;->b(I)Ll0/h;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    iget-object v4, v1, Lk0/g;->S:Ll0/c;

    .line 257
    .line 258
    invoke-virtual {v4, v2}, Ll0/c;->d(I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v4

    .line 262
    iget-wide v6, v1, Lk0/g;->W:J

    .line 263
    .line 264
    invoke-static {v6, v7}, Ld0/w;->y(J)J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    invoke-static {v6, v7}, Ld0/w;->M(J)J

    .line 269
    .line 270
    .line 271
    move-result-wide v6

    .line 272
    iget-object v2, v1, Lk0/g;->S:Ll0/c;

    .line 273
    .line 274
    const/4 v8, 0x0

    .line 275
    invoke-virtual {v2, v8}, Ll0/c;->d(I)J

    .line 276
    .line 277
    .line 278
    move-result-wide v9

    .line 279
    iget-wide v11, v0, Ll0/h;->b:J

    .line 280
    .line 281
    invoke-static {v11, v12}, Ld0/w;->M(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v11

    .line 285
    invoke-static {v0}, Lk0/g;->w(Ll0/h;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    move-wide v13, v11

    .line 290
    const/4 v8, 0x0

    .line 291
    :goto_6
    iget-object v15, v0, Ll0/h;->c:Ljava/util/List;

    .line 292
    .line 293
    move-object/from16 v17, v0

    .line 294
    .line 295
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    move/from16 v18, v2

    .line 300
    .line 301
    if-ge v8, v0, :cond_10

    .line 302
    .line 303
    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, Ll0/a;

    .line 308
    .line 309
    iget-object v15, v0, Ll0/a;->c:Ljava/util/List;

    .line 310
    .line 311
    iget v0, v0, Ll0/a;->b:I

    .line 312
    .line 313
    const/4 v1, 0x1

    .line 314
    if-eq v0, v1, :cond_a

    .line 315
    .line 316
    const/4 v1, 0x2

    .line 317
    if-eq v0, v1, :cond_a

    .line 318
    .line 319
    const/4 v0, 0x1

    .line 320
    goto :goto_7

    .line 321
    :cond_a
    const/4 v0, 0x0

    .line 322
    :goto_7
    if-eqz v18, :cond_b

    .line 323
    .line 324
    if-nez v0, :cond_f

    .line 325
    .line 326
    :cond_b
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_c

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_c
    const/4 v1, 0x0

    .line 334
    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Ll0/m;

    .line 339
    .line 340
    invoke-virtual {v0}, Ll0/m;->d()Lk0/h;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-nez v0, :cond_d

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_d
    invoke-interface {v0, v9, v10, v6, v7}, Lk0/h;->u(JJ)J

    .line 348
    .line 349
    .line 350
    move-result-wide v1

    .line 351
    const-wide/16 v20, 0x0

    .line 352
    .line 353
    cmp-long v1, v1, v20

    .line 354
    .line 355
    if-nez v1, :cond_e

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_e
    invoke-interface {v0, v9, v10, v6, v7}, Lk0/h;->v(JJ)J

    .line 359
    .line 360
    .line 361
    move-result-wide v1

    .line 362
    invoke-interface {v0, v1, v2}, Lk0/h;->a(J)J

    .line 363
    .line 364
    .line 365
    move-result-wide v0

    .line 366
    add-long/2addr v0, v11

    .line 367
    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 368
    .line 369
    .line 370
    move-result-wide v13

    .line 371
    :cond_f
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 372
    .line 373
    move-object/from16 v1, p0

    .line 374
    .line 375
    move-object/from16 v0, v17

    .line 376
    .line 377
    move/from16 v2, v18

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_10
    move-wide v11, v13

    .line 381
    :goto_9
    iget-wide v0, v3, Ll0/h;->b:J

    .line 382
    .line 383
    invoke-static {v0, v1}, Ld0/w;->M(J)J

    .line 384
    .line 385
    .line 386
    move-result-wide v0

    .line 387
    invoke-static {v3}, Lk0/g;->w(Ll0/h;)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    const-wide v8, 0x7fffffffffffffffL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    const/4 v10, 0x0

    .line 397
    :goto_a
    iget-object v13, v3, Ll0/h;->c:Ljava/util/List;

    .line 398
    .line 399
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    if-ge v10, v14, :cond_18

    .line 404
    .line 405
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    check-cast v14, Ll0/a;

    .line 410
    .line 411
    iget-object v15, v14, Ll0/a;->c:Ljava/util/List;

    .line 412
    .line 413
    iget v14, v14, Ll0/a;->b:I

    .line 414
    .line 415
    move-object/from16 v18, v3

    .line 416
    .line 417
    const/4 v3, 0x1

    .line 418
    if-eq v14, v3, :cond_11

    .line 419
    .line 420
    const/4 v3, 0x2

    .line 421
    if-eq v14, v3, :cond_12

    .line 422
    .line 423
    const/4 v14, 0x1

    .line 424
    goto :goto_b

    .line 425
    :cond_11
    const/4 v3, 0x2

    .line 426
    :cond_12
    const/4 v14, 0x0

    .line 427
    :goto_b
    if-eqz v2, :cond_13

    .line 428
    .line 429
    if-nez v14, :cond_14

    .line 430
    .line 431
    :cond_13
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v14

    .line 435
    if-eqz v14, :cond_15

    .line 436
    .line 437
    :cond_14
    move-wide/from16 v24, v0

    .line 438
    .line 439
    move-wide v0, v4

    .line 440
    goto :goto_d

    .line 441
    :cond_15
    const/4 v14, 0x0

    .line 442
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v15

    .line 446
    check-cast v15, Ll0/m;

    .line 447
    .line 448
    invoke-virtual {v15}, Ll0/m;->d()Lk0/h;

    .line 449
    .line 450
    .line 451
    move-result-object v14

    .line 452
    if-nez v14, :cond_16

    .line 453
    .line 454
    add-long/2addr v0, v4

    .line 455
    :goto_c
    move-object/from16 v2, p0

    .line 456
    .line 457
    goto :goto_e

    .line 458
    :cond_16
    invoke-interface {v14, v4, v5, v6, v7}, Lk0/h;->u(JJ)J

    .line 459
    .line 460
    .line 461
    move-result-wide v22

    .line 462
    const-wide/16 v19, 0x0

    .line 463
    .line 464
    cmp-long v15, v22, v19

    .line 465
    .line 466
    if-nez v15, :cond_17

    .line 467
    .line 468
    goto :goto_c

    .line 469
    :cond_17
    invoke-interface {v14, v4, v5, v6, v7}, Lk0/h;->v(JJ)J

    .line 470
    .line 471
    .line 472
    move-result-wide v24

    .line 473
    add-long v24, v24, v22

    .line 474
    .line 475
    const-wide/16 v22, 0x1

    .line 476
    .line 477
    move-wide/from16 v26, v4

    .line 478
    .line 479
    sub-long v3, v24, v22

    .line 480
    .line 481
    invoke-interface {v14, v3, v4}, Lk0/h;->a(J)J

    .line 482
    .line 483
    .line 484
    move-result-wide v22

    .line 485
    add-long v22, v22, v0

    .line 486
    .line 487
    move-wide/from16 v24, v0

    .line 488
    .line 489
    move-wide/from16 v0, v26

    .line 490
    .line 491
    invoke-interface {v14, v3, v4, v0, v1}, Lk0/h;->m(JJ)J

    .line 492
    .line 493
    .line 494
    move-result-wide v3

    .line 495
    add-long v3, v3, v22

    .line 496
    .line 497
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 498
    .line 499
    .line 500
    move-result-wide v3

    .line 501
    move-wide v8, v3

    .line 502
    :goto_d
    add-int/lit8 v10, v10, 0x1

    .line 503
    .line 504
    move-wide v4, v0

    .line 505
    move-object/from16 v3, v18

    .line 506
    .line 507
    move-wide/from16 v0, v24

    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_18
    move-object/from16 v2, p0

    .line 511
    .line 512
    move-wide v0, v8

    .line 513
    :goto_e
    iget-object v3, v2, Lk0/g;->S:Ll0/c;

    .line 514
    .line 515
    iget-boolean v3, v3, Ll0/c;->d:Z

    .line 516
    .line 517
    if-eqz v3, :cond_1b

    .line 518
    .line 519
    const/4 v3, 0x0

    .line 520
    :goto_f
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-ge v3, v4, :cond_1a

    .line 525
    .line 526
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    check-cast v4, Ll0/a;

    .line 531
    .line 532
    iget-object v4, v4, Ll0/a;->c:Ljava/util/List;

    .line 533
    .line 534
    const/4 v5, 0x0

    .line 535
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Ll0/m;

    .line 540
    .line 541
    invoke-virtual {v4}, Ll0/m;->d()Lk0/h;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    if-eqz v4, :cond_1b

    .line 546
    .line 547
    invoke-interface {v4}, Lk0/h;->i()Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_19

    .line 552
    .line 553
    goto :goto_10

    .line 554
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 555
    .line 556
    goto :goto_f

    .line 557
    :cond_1a
    const/4 v3, 0x1

    .line 558
    goto :goto_11

    .line 559
    :cond_1b
    :goto_10
    const/4 v3, 0x0

    .line 560
    :goto_11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    if-eqz v3, :cond_1c

    .line 566
    .line 567
    iget-object v8, v2, Lk0/g;->S:Ll0/c;

    .line 568
    .line 569
    iget-wide v8, v8, Ll0/c;->f:J

    .line 570
    .line 571
    cmp-long v10, v8, v4

    .line 572
    .line 573
    if-eqz v10, :cond_1c

    .line 574
    .line 575
    invoke-static {v8, v9}, Ld0/w;->M(J)J

    .line 576
    .line 577
    .line 578
    move-result-wide v8

    .line 579
    sub-long v8, v0, v8

    .line 580
    .line 581
    invoke-static {v11, v12, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 582
    .line 583
    .line 584
    move-result-wide v11

    .line 585
    :cond_1c
    sub-long v32, v0, v11

    .line 586
    .line 587
    iget-object v0, v2, Lk0/g;->S:Ll0/c;

    .line 588
    .line 589
    iget-boolean v1, v0, Ll0/c;->d:Z

    .line 590
    .line 591
    if-eqz v1, :cond_32

    .line 592
    .line 593
    iget-wide v0, v0, Ll0/c;->a:J

    .line 594
    .line 595
    cmp-long v0, v0, v4

    .line 596
    .line 597
    if-eqz v0, :cond_1d

    .line 598
    .line 599
    const/4 v0, 0x1

    .line 600
    goto :goto_12

    .line 601
    :cond_1d
    const/4 v0, 0x0

    .line 602
    :goto_12
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 603
    .line 604
    .line 605
    iget-object v0, v2, Lk0/g;->S:Ll0/c;

    .line 606
    .line 607
    iget-wide v0, v0, Ll0/c;->a:J

    .line 608
    .line 609
    invoke-static {v0, v1}, Ld0/w;->M(J)J

    .line 610
    .line 611
    .line 612
    move-result-wide v0

    .line 613
    sub-long/2addr v6, v0

    .line 614
    sub-long/2addr v6, v11

    .line 615
    invoke-virtual/range {p0 .. p0}, Lk0/g;->a()La0/A;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-object v0, v0, La0/A;->c:La0/v;

    .line 620
    .line 621
    invoke-static {v6, v7}, Ld0/w;->Z(J)J

    .line 622
    .line 623
    .line 624
    move-result-wide v8

    .line 625
    iget-wide v13, v0, La0/v;->c:J

    .line 626
    .line 627
    cmp-long v1, v13, v4

    .line 628
    .line 629
    if-eqz v1, :cond_1e

    .line 630
    .line 631
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 632
    .line 633
    .line 634
    move-result-wide v13

    .line 635
    goto :goto_13

    .line 636
    :cond_1e
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 637
    .line 638
    iget-object v1, v1, Ll0/c;->j:La0/u;

    .line 639
    .line 640
    if-eqz v1, :cond_1f

    .line 641
    .line 642
    iget-wide v13, v1, La0/u;->c:J

    .line 643
    .line 644
    cmp-long v1, v13, v4

    .line 645
    .line 646
    if-eqz v1, :cond_1f

    .line 647
    .line 648
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 649
    .line 650
    .line 651
    move-result-wide v13

    .line 652
    goto :goto_13

    .line 653
    :cond_1f
    move-wide v13, v8

    .line 654
    :goto_13
    sub-long v18, v6, v32

    .line 655
    .line 656
    invoke-static/range {v18 .. v19}, Ld0/w;->Z(J)J

    .line 657
    .line 658
    .line 659
    move-result-wide v18

    .line 660
    const-wide/16 v20, 0x0

    .line 661
    .line 662
    cmp-long v1, v18, v20

    .line 663
    .line 664
    if-gez v1, :cond_20

    .line 665
    .line 666
    cmp-long v1, v13, v20

    .line 667
    .line 668
    if-lez v1, :cond_20

    .line 669
    .line 670
    const-wide/16 v18, 0x0

    .line 671
    .line 672
    :cond_20
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 673
    .line 674
    move-wide/from16 v28, v11

    .line 675
    .line 676
    iget-wide v10, v1, Ll0/c;->c:J

    .line 677
    .line 678
    cmp-long v1, v10, v4

    .line 679
    .line 680
    if-eqz v1, :cond_21

    .line 681
    .line 682
    add-long v10, v18, v10

    .line 683
    .line 684
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 685
    .line 686
    .line 687
    move-result-wide v10

    .line 688
    move-wide/from16 v24, v10

    .line 689
    .line 690
    goto :goto_14

    .line 691
    :cond_21
    move-wide/from16 v24, v18

    .line 692
    .line 693
    :goto_14
    iget-wide v10, v0, La0/v;->b:J

    .line 694
    .line 695
    cmp-long v1, v10, v4

    .line 696
    .line 697
    if-eqz v1, :cond_23

    .line 698
    .line 699
    move-wide/from16 v22, v10

    .line 700
    .line 701
    move-wide/from16 v26, v8

    .line 702
    .line 703
    invoke-static/range {v22 .. v27}, Ld0/w;->j(JJJ)J

    .line 704
    .line 705
    .line 706
    move-result-wide v24

    .line 707
    :cond_22
    :goto_15
    move-wide/from16 v8, v24

    .line 708
    .line 709
    goto :goto_16

    .line 710
    :cond_23
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 711
    .line 712
    iget-object v1, v1, Ll0/c;->j:La0/u;

    .line 713
    .line 714
    if-eqz v1, :cond_22

    .line 715
    .line 716
    iget-wide v10, v1, La0/u;->b:J

    .line 717
    .line 718
    cmp-long v1, v10, v4

    .line 719
    .line 720
    if-eqz v1, :cond_22

    .line 721
    .line 722
    move-wide/from16 v22, v10

    .line 723
    .line 724
    move-wide/from16 v26, v8

    .line 725
    .line 726
    invoke-static/range {v22 .. v27}, Ld0/w;->j(JJJ)J

    .line 727
    .line 728
    .line 729
    move-result-wide v24

    .line 730
    goto :goto_15

    .line 731
    :goto_16
    cmp-long v1, v8, v13

    .line 732
    .line 733
    if-lez v1, :cond_24

    .line 734
    .line 735
    move-wide v13, v8

    .line 736
    :cond_24
    iget-object v1, v2, Lk0/g;->P:La0/v;

    .line 737
    .line 738
    iget-wide v10, v1, La0/v;->a:J

    .line 739
    .line 740
    cmp-long v1, v10, v4

    .line 741
    .line 742
    if-eqz v1, :cond_25

    .line 743
    .line 744
    goto :goto_17

    .line 745
    :cond_25
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 746
    .line 747
    iget-object v10, v1, Ll0/c;->j:La0/u;

    .line 748
    .line 749
    if-eqz v10, :cond_26

    .line 750
    .line 751
    iget-wide v10, v10, La0/u;->a:J

    .line 752
    .line 753
    cmp-long v12, v10, v4

    .line 754
    .line 755
    if-eqz v12, :cond_26

    .line 756
    .line 757
    goto :goto_17

    .line 758
    :cond_26
    iget-wide v10, v1, Ll0/c;->g:J

    .line 759
    .line 760
    cmp-long v1, v10, v4

    .line 761
    .line 762
    if-eqz v1, :cond_27

    .line 763
    .line 764
    goto :goto_17

    .line 765
    :cond_27
    iget-wide v10, v2, Lk0/g;->z:J

    .line 766
    .line 767
    :goto_17
    cmp-long v1, v10, v8

    .line 768
    .line 769
    if-gez v1, :cond_28

    .line 770
    .line 771
    move-wide v10, v8

    .line 772
    :cond_28
    cmp-long v1, v10, v13

    .line 773
    .line 774
    iget-wide v4, v2, Lk0/g;->A:J

    .line 775
    .line 776
    const-wide/16 v22, 0x2

    .line 777
    .line 778
    if-lez v1, :cond_29

    .line 779
    .line 780
    div-long v10, v32, v22

    .line 781
    .line 782
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 783
    .line 784
    .line 785
    move-result-wide v10

    .line 786
    sub-long v10, v6, v10

    .line 787
    .line 788
    invoke-static {v10, v11}, Ld0/w;->Z(J)J

    .line 789
    .line 790
    .line 791
    move-result-wide v34

    .line 792
    move-wide/from16 v36, v8

    .line 793
    .line 794
    move-wide/from16 v38, v13

    .line 795
    .line 796
    invoke-static/range {v34 .. v39}, Ld0/w;->j(JJJ)J

    .line 797
    .line 798
    .line 799
    move-result-wide v10

    .line 800
    :cond_29
    iget v1, v0, La0/v;->d:F

    .line 801
    .line 802
    const v12, -0x800001

    .line 803
    .line 804
    .line 805
    cmpl-float v15, v1, v12

    .line 806
    .line 807
    if-eqz v15, :cond_2a

    .line 808
    .line 809
    goto :goto_18

    .line 810
    :cond_2a
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 811
    .line 812
    iget-object v1, v1, Ll0/c;->j:La0/u;

    .line 813
    .line 814
    if-eqz v1, :cond_2b

    .line 815
    .line 816
    iget v1, v1, La0/u;->d:F

    .line 817
    .line 818
    goto :goto_18

    .line 819
    :cond_2b
    move v1, v12

    .line 820
    :goto_18
    iget v0, v0, La0/v;->e:F

    .line 821
    .line 822
    cmpl-float v15, v0, v12

    .line 823
    .line 824
    if-eqz v15, :cond_2c

    .line 825
    .line 826
    goto :goto_19

    .line 827
    :cond_2c
    iget-object v0, v2, Lk0/g;->S:Ll0/c;

    .line 828
    .line 829
    iget-object v0, v0, Ll0/c;->j:La0/u;

    .line 830
    .line 831
    if-eqz v0, :cond_2d

    .line 832
    .line 833
    iget v0, v0, La0/u;->e:F

    .line 834
    .line 835
    goto :goto_19

    .line 836
    :cond_2d
    move v0, v12

    .line 837
    :goto_19
    cmpl-float v15, v1, v12

    .line 838
    .line 839
    if-nez v15, :cond_2f

    .line 840
    .line 841
    cmpl-float v12, v0, v12

    .line 842
    .line 843
    if-nez v12, :cond_2f

    .line 844
    .line 845
    iget-object v12, v2, Lk0/g;->S:Ll0/c;

    .line 846
    .line 847
    iget-object v12, v12, Ll0/c;->j:La0/u;

    .line 848
    .line 849
    if-eqz v12, :cond_2e

    .line 850
    .line 851
    move/from16 v24, v0

    .line 852
    .line 853
    move v15, v1

    .line 854
    iget-wide v0, v12, La0/u;->a:J

    .line 855
    .line 856
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    cmp-long v0, v0, v18

    .line 862
    .line 863
    if-nez v0, :cond_30

    .line 864
    .line 865
    :cond_2e
    const/high16 v1, 0x3f800000    # 1.0f

    .line 866
    .line 867
    move v0, v1

    .line 868
    goto :goto_1a

    .line 869
    :cond_2f
    move/from16 v24, v0

    .line 870
    .line 871
    move v15, v1

    .line 872
    :cond_30
    move v1, v15

    .line 873
    move/from16 v0, v24

    .line 874
    .line 875
    :goto_1a
    new-instance v12, La0/u;

    .line 876
    .line 877
    invoke-direct {v12}, La0/u;-><init>()V

    .line 878
    .line 879
    .line 880
    iput-wide v10, v12, La0/u;->a:J

    .line 881
    .line 882
    iput-wide v8, v12, La0/u;->b:J

    .line 883
    .line 884
    iput-wide v13, v12, La0/u;->c:J

    .line 885
    .line 886
    iput v1, v12, La0/u;->d:F

    .line 887
    .line 888
    iput v0, v12, La0/u;->e:F

    .line 889
    .line 890
    new-instance v0, La0/v;

    .line 891
    .line 892
    invoke-direct {v0, v12}, La0/v;-><init>(La0/u;)V

    .line 893
    .line 894
    .line 895
    iput-object v0, v2, Lk0/g;->P:La0/v;

    .line 896
    .line 897
    iget-object v0, v2, Lk0/g;->S:Ll0/c;

    .line 898
    .line 899
    iget-wide v0, v0, Ll0/c;->a:J

    .line 900
    .line 901
    invoke-static/range {v28 .. v29}, Ld0/w;->Z(J)J

    .line 902
    .line 903
    .line 904
    move-result-wide v8

    .line 905
    add-long/2addr v8, v0

    .line 906
    iget-object v0, v2, Lk0/g;->P:La0/v;

    .line 907
    .line 908
    iget-wide v0, v0, La0/v;->a:J

    .line 909
    .line 910
    invoke-static {v0, v1}, Ld0/w;->M(J)J

    .line 911
    .line 912
    .line 913
    move-result-wide v0

    .line 914
    sub-long v0, v6, v0

    .line 915
    .line 916
    div-long v6, v32, v22

    .line 917
    .line 918
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 919
    .line 920
    .line 921
    move-result-wide v4

    .line 922
    cmp-long v6, v0, v4

    .line 923
    .line 924
    if-gez v6, :cond_31

    .line 925
    .line 926
    move-wide/from16 v34, v4

    .line 927
    .line 928
    :goto_1b
    move-wide/from16 v25, v8

    .line 929
    .line 930
    move-object/from16 v0, v17

    .line 931
    .line 932
    goto :goto_1c

    .line 933
    :cond_31
    move-wide/from16 v34, v0

    .line 934
    .line 935
    goto :goto_1b

    .line 936
    :cond_32
    move-wide/from16 v28, v11

    .line 937
    .line 938
    move-object/from16 v0, v17

    .line 939
    .line 940
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    const-wide/16 v34, 0x0

    .line 946
    .line 947
    :goto_1c
    iget-wide v0, v0, Ll0/h;->b:J

    .line 948
    .line 949
    invoke-static {v0, v1}, Ld0/w;->M(J)J

    .line 950
    .line 951
    .line 952
    move-result-wide v0

    .line 953
    sub-long v30, v28, v0

    .line 954
    .line 955
    new-instance v0, Lk0/e;

    .line 956
    .line 957
    iget-object v1, v2, Lk0/g;->S:Ll0/c;

    .line 958
    .line 959
    iget-wide v4, v1, Ll0/c;->a:J

    .line 960
    .line 961
    iget-wide v6, v2, Lk0/g;->W:J

    .line 962
    .line 963
    iget v8, v2, Lk0/g;->Z:I

    .line 964
    .line 965
    invoke-virtual/range {p0 .. p0}, Lk0/g;->a()La0/A;

    .line 966
    .line 967
    .line 968
    move-result-object v37

    .line 969
    iget-object v9, v2, Lk0/g;->S:Ll0/c;

    .line 970
    .line 971
    iget-boolean v9, v9, Ll0/c;->d:Z

    .line 972
    .line 973
    if-eqz v9, :cond_33

    .line 974
    .line 975
    iget-object v9, v2, Lk0/g;->P:La0/v;

    .line 976
    .line 977
    :goto_1d
    move-object/from16 v38, v9

    .line 978
    .line 979
    goto :goto_1e

    .line 980
    :cond_33
    const/4 v9, 0x0

    .line 981
    goto :goto_1d

    .line 982
    :goto_1e
    move-object/from16 v22, v0

    .line 983
    .line 984
    move-wide/from16 v23, v4

    .line 985
    .line 986
    move-wide/from16 v27, v6

    .line 987
    .line 988
    move/from16 v29, v8

    .line 989
    .line 990
    move-object/from16 v36, v1

    .line 991
    .line 992
    invoke-direct/range {v22 .. v38}, Lk0/e;-><init>(JJJIJJJLl0/c;La0/A;La0/v;)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v2, v0}, Lx0/a;->r(La0/U;)V

    .line 996
    .line 997
    .line 998
    iget-boolean v0, v2, Lk0/g;->s:Z

    .line 999
    .line 1000
    if-nez v0, :cond_3b

    .line 1001
    .line 1002
    iget-object v0, v2, Lk0/g;->O:Landroid/os/Handler;

    .line 1003
    .line 1004
    iget-object v1, v2, Lk0/g;->H:Lk0/c;

    .line 1005
    .line 1006
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1007
    .line 1008
    .line 1009
    const-wide/16 v4, 0x1388

    .line 1010
    .line 1011
    if-eqz v3, :cond_38

    .line 1012
    .line 1013
    iget-object v0, v2, Lk0/g;->O:Landroid/os/Handler;

    .line 1014
    .line 1015
    iget-object v3, v2, Lk0/g;->S:Ll0/c;

    .line 1016
    .line 1017
    iget-wide v6, v2, Lk0/g;->W:J

    .line 1018
    .line 1019
    invoke-static {v6, v7}, Ld0/w;->y(J)J

    .line 1020
    .line 1021
    .line 1022
    move-result-wide v6

    .line 1023
    iget-object v8, v3, Ll0/c;->m:Ljava/util/List;

    .line 1024
    .line 1025
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1026
    .line 1027
    .line 1028
    move-result v8

    .line 1029
    const/4 v9, 0x1

    .line 1030
    sub-int/2addr v8, v9

    .line 1031
    invoke-virtual {v3, v8}, Ll0/c;->b(I)Ll0/h;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v9

    .line 1035
    iget-wide v10, v9, Ll0/h;->b:J

    .line 1036
    .line 1037
    invoke-static {v10, v11}, Ld0/w;->M(J)J

    .line 1038
    .line 1039
    .line 1040
    move-result-wide v10

    .line 1041
    invoke-virtual {v3, v8}, Ll0/c;->d(I)J

    .line 1042
    .line 1043
    .line 1044
    move-result-wide v12

    .line 1045
    invoke-static {v6, v7}, Ld0/w;->M(J)J

    .line 1046
    .line 1047
    .line 1048
    move-result-wide v6

    .line 1049
    iget-wide v14, v3, Ll0/c;->a:J

    .line 1050
    .line 1051
    invoke-static {v14, v15}, Ld0/w;->M(J)J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v14

    .line 1055
    invoke-static {v4, v5}, Ld0/w;->M(J)J

    .line 1056
    .line 1057
    .line 1058
    move-result-wide v16

    .line 1059
    move-wide/from16 v4, v16

    .line 1060
    .line 1061
    const/4 v3, 0x0

    .line 1062
    :goto_1f
    iget-object v8, v9, Ll0/h;->c:Ljava/util/List;

    .line 1063
    .line 1064
    move-object/from16 v22, v9

    .line 1065
    .line 1066
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1067
    .line 1068
    .line 1069
    move-result v9

    .line 1070
    if-ge v3, v9, :cond_37

    .line 1071
    .line 1072
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v8

    .line 1076
    check-cast v8, Ll0/a;

    .line 1077
    .line 1078
    iget-object v8, v8, Ll0/a;->c:Ljava/util/List;

    .line 1079
    .line 1080
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v9

    .line 1084
    if-eqz v9, :cond_34

    .line 1085
    .line 1086
    const/4 v9, 0x0

    .line 1087
    goto :goto_20

    .line 1088
    :cond_34
    const/4 v9, 0x0

    .line 1089
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v8

    .line 1093
    check-cast v8, Ll0/m;

    .line 1094
    .line 1095
    invoke-virtual {v8}, Ll0/m;->d()Lk0/h;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v8

    .line 1099
    if-eqz v8, :cond_36

    .line 1100
    .line 1101
    add-long v23, v14, v10

    .line 1102
    .line 1103
    invoke-interface {v8, v12, v13, v6, v7}, Lk0/h;->B(JJ)J

    .line 1104
    .line 1105
    .line 1106
    move-result-wide v25

    .line 1107
    add-long v25, v25, v23

    .line 1108
    .line 1109
    sub-long v25, v25, v6

    .line 1110
    .line 1111
    const-wide/32 v23, 0x186a0

    .line 1112
    .line 1113
    .line 1114
    sub-long v27, v4, v23

    .line 1115
    .line 1116
    cmp-long v8, v25, v27

    .line 1117
    .line 1118
    if-ltz v8, :cond_35

    .line 1119
    .line 1120
    cmp-long v8, v25, v4

    .line 1121
    .line 1122
    if-lez v8, :cond_36

    .line 1123
    .line 1124
    add-long v23, v4, v23

    .line 1125
    .line 1126
    cmp-long v8, v25, v23

    .line 1127
    .line 1128
    if-gez v8, :cond_36

    .line 1129
    .line 1130
    :cond_35
    move-wide/from16 v4, v25

    .line 1131
    .line 1132
    :cond_36
    :goto_20
    add-int/lit8 v3, v3, 0x1

    .line 1133
    .line 1134
    move-object/from16 v9, v22

    .line 1135
    .line 1136
    goto :goto_1f

    .line 1137
    :cond_37
    const-wide/16 v6, 0x3e8

    .line 1138
    .line 1139
    sget-object v3, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1140
    .line 1141
    invoke-static {v4, v5, v6, v7, v3}, Li4/a;->r(JJLjava/math/RoundingMode;)J

    .line 1142
    .line 1143
    .line 1144
    move-result-wide v3

    .line 1145
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1146
    .line 1147
    .line 1148
    :cond_38
    iget-boolean v0, v2, Lk0/g;->T:Z

    .line 1149
    .line 1150
    if-eqz v0, :cond_39

    .line 1151
    .line 1152
    invoke-virtual/range {p0 .. p0}, Lk0/g;->B()V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_21

    .line 1156
    :cond_39
    if-eqz p1, :cond_3b

    .line 1157
    .line 1158
    iget-object v0, v2, Lk0/g;->S:Ll0/c;

    .line 1159
    .line 1160
    iget-boolean v1, v0, Ll0/c;->d:Z

    .line 1161
    .line 1162
    if-eqz v1, :cond_3b

    .line 1163
    .line 1164
    iget-wide v0, v0, Ll0/c;->e:J

    .line 1165
    .line 1166
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    cmp-long v3, v0, v3

    .line 1172
    .line 1173
    if-eqz v3, :cond_3b

    .line 1174
    .line 1175
    const-wide/16 v3, 0x0

    .line 1176
    .line 1177
    cmp-long v5, v0, v3

    .line 1178
    .line 1179
    if-nez v5, :cond_3a

    .line 1180
    .line 1181
    const-wide/16 v0, 0x1388

    .line 1182
    .line 1183
    :cond_3a
    iget-wide v5, v2, Lk0/g;->U:J

    .line 1184
    .line 1185
    add-long/2addr v5, v0

    .line 1186
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v0

    .line 1190
    sub-long/2addr v5, v0

    .line 1191
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1192
    .line 1193
    .line 1194
    move-result-wide v0

    .line 1195
    iget-object v3, v2, Lk0/g;->O:Landroid/os/Handler;

    .line 1196
    .line 1197
    iget-object v4, v2, Lk0/g;->G:Lk0/c;

    .line 1198
    .line 1199
    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1200
    .line 1201
    .line 1202
    :cond_3b
    :goto_21
    return-void
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

.method public final B()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lk0/g;->O:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v2, v1, Lk0/g;->G:Lk0/c;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lk0/g;->L:LB0/r;

    .line 11
    .line 12
    invoke-virtual {v0}, LB0/r;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, v1, Lk0/g;->L:LB0/r;

    .line 20
    .line 21
    invoke-virtual {v0}, LB0/r;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, v1, Lk0/g;->T:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v2, v1, Lk0/g;->E:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v2

    .line 34
    :try_start_0
    iget-object v0, v1, Lk0/g;->Q:Landroid/net/Uri;

    .line 35
    .line 36
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    const/4 v2, 0x0

    .line 38
    iput-boolean v2, v1, Lk0/g;->T:Z

    .line 39
    .line 40
    new-instance v2, LB0/u;

    .line 41
    .line 42
    iget-object v3, v1, Lk0/g;->K:Lf0/h;

    .line 43
    .line 44
    iget-object v4, v1, Lk0/g;->C:LB0/t;

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    invoke-direct {v2, v3, v0, v5, v4}, LB0/u;-><init>(Lf0/h;Landroid/net/Uri;ILB0/t;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v1, Lk0/g;->D:Lk0/d;

    .line 51
    .line 52
    iget-object v3, v1, Lk0/g;->x:LA0/b;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    iget-object v4, v1, Lk0/g;->L:LB0/r;

    .line 59
    .line 60
    invoke-virtual {v4, v2, v0, v3}, LB0/r;->f(LB0/o;LB0/m;I)J

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    new-instance v12, Lx0/z;

    .line 65
    .line 66
    iget-wide v6, v2, LB0/u;->l:J

    .line 67
    .line 68
    iget-object v8, v2, LB0/u;->m:Lf0/l;

    .line 69
    .line 70
    move-object v5, v12

    .line 71
    invoke-direct/range {v5 .. v10}, Lx0/z;-><init>(JLf0/l;J)V

    .line 72
    .line 73
    .line 74
    iget-object v11, v1, Lk0/g;->B:Lm0/e;

    .line 75
    .line 76
    iget v13, v2, LB0/u;->n:I

    .line 77
    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const/4 v14, -0x1

    .line 83
    const/4 v15, 0x0

    .line 84
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v11 .. v21}, Lm0/e;->h(Lx0/z;IILa0/p;ILjava/lang/Object;JJ)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    throw v0
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public final declared-synchronized a()La0/A;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk0/g;->a0:La0/A;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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

.method public final declared-synchronized b(La0/A;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lk0/g;->a0:La0/A;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
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

.method public final c(Lx0/H;LB0/f;J)Lx0/F;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lx0/H;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, v0, Lk0/g;->Z:I

    .line 14
    .line 15
    sub-int v8, v2, v3

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p1}, Lx0/a;->h(Lx0/H;)Lm0/e;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    new-instance v12, Lm0/e;

    .line 22
    .line 23
    iget-object v2, v0, Lx0/a;->o:Lm0/e;

    .line 24
    .line 25
    iget-object v2, v2, Lm0/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v12, v2, v3, v1}, Lm0/e;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/H;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lk0/b;

    .line 32
    .line 33
    iget v2, v0, Lk0/g;->Z:I

    .line 34
    .line 35
    add-int/2addr v2, v8

    .line 36
    iget-object v6, v0, Lk0/g;->S:Ll0/c;

    .line 37
    .line 38
    iget-object v10, v0, Lk0/g;->M:Lf0/A;

    .line 39
    .line 40
    iget-wide v3, v0, Lk0/g;->W:J

    .line 41
    .line 42
    iget-object v15, v0, Lx0/a;->r:Li0/j;

    .line 43
    .line 44
    invoke-static {v15}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v5, v0, Lk0/g;->v:Lp1/b;

    .line 48
    .line 49
    move-object/from16 v19, v5

    .line 50
    .line 51
    iget-object v5, v0, Lk0/g;->I:Lk0/d;

    .line 52
    .line 53
    move-object/from16 v20, v5

    .line 54
    .line 55
    iget-object v7, v0, Lk0/g;->y:LZ1/i;

    .line 56
    .line 57
    iget-object v9, v0, Lk0/g;->u:LD0/d;

    .line 58
    .line 59
    iget-object v11, v0, Lk0/g;->w:Lm0/i;

    .line 60
    .line 61
    iget-object v13, v0, Lk0/g;->x:LA0/b;

    .line 62
    .line 63
    iget-object v5, v0, Lk0/g;->J:LB0/s;

    .line 64
    .line 65
    move-object/from16 v17, v5

    .line 66
    .line 67
    move-wide/from16 v21, v3

    .line 68
    .line 69
    move-object v4, v1

    .line 70
    move v5, v2

    .line 71
    move-object v3, v15

    .line 72
    move-wide/from16 v15, v21

    .line 73
    .line 74
    move-object/from16 v18, p2

    .line 75
    .line 76
    move-object/from16 v21, v3

    .line 77
    .line 78
    invoke-direct/range {v4 .. v21}, Lk0/b;-><init>(ILl0/c;LZ1/i;ILD0/d;Lf0/A;Lm0/i;Lm0/e;LA0/b;Lm0/e;JLB0/s;LB0/f;Lp1/b;Lk0/d;Li0/j;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, v0, Lk0/g;->F:Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-virtual {v3, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v1
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
.end method

.method public final d(Lx0/F;)V
    .locals 5

    .line 1
    check-cast p1, Lk0/b;

    .line 2
    .line 3
    iget-object v0, p1, Lk0/b;->x:Lk0/o;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lk0/o;->t:Z

    .line 7
    .line 8
    iget-object v0, v0, Lk0/o;->o:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Lk0/b;->C:[Ly0/h;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Ly0/h;->A(Lk0/b;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v1, p1, Lk0/b;->B:Lx0/E;

    .line 29
    .line 30
    iget-object v0, p0, Lk0/g;->F:Landroid/util/SparseArray;

    .line 31
    .line 32
    iget p1, p1, Lk0/b;->l:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
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
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/g;->J:LB0/s;

    .line 2
    .line 3
    invoke-interface {v0}, LB0/s;->a()V

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

.method public final p(Lf0/A;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk0/g;->M:Lf0/A;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lx0/a;->r:Li0/j;

    .line 8
    .line 9
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lk0/g;->w:Lm0/i;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, Lm0/i;->a(Landroid/os/Looper;Li0/j;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lm0/i;->c()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Lk0/g;->s:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lk0/g;->A(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p1, p0, Lk0/g;->t:Lf0/g;

    .line 30
    .line 31
    invoke-interface {p1}, Lf0/g;->a()Lf0/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lk0/g;->K:Lf0/h;

    .line 36
    .line 37
    new-instance p1, LB0/r;

    .line 38
    .line 39
    const-string v0, "DashMediaSource"

    .line 40
    .line 41
    invoke-direct {p1, v0}, LB0/r;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lk0/g;->L:LB0/r;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, Ld0/w;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lk0/g;->O:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-virtual {p0}, Lk0/g;->B()V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final t()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk0/g;->T:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lk0/g;->K:Lf0/h;

    .line 6
    .line 7
    iget-object v2, p0, Lk0/g;->L:LB0/r;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, LB0/r;->e(LB0/p;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lk0/g;->L:LB0/r;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, Lk0/g;->U:J

    .line 19
    .line 20
    iput-wide v2, p0, Lk0/g;->V:J

    .line 21
    .line 22
    iget-object v2, p0, Lk0/g;->R:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v2, p0, Lk0/g;->Q:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object v1, p0, Lk0/g;->N:LK3/b;

    .line 27
    .line 28
    iget-object v2, p0, Lk0/g;->O:Landroid/os/Handler;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lk0/g;->O:Landroid/os/Handler;

    .line 36
    .line 37
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v1, p0, Lk0/g;->W:J

    .line 43
    .line 44
    iput v0, p0, Lk0/g;->X:I

    .line 45
    .line 46
    iput-wide v1, p0, Lk0/g;->Y:J

    .line 47
    .line 48
    iget-object v0, p0, Lk0/g;->F:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lk0/g;->y:LZ1/i;

    .line 54
    .line 55
    iget-object v1, v0, LZ1/i;->l:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, LZ1/i;->m:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, LZ1/i;->n:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lk0/g;->w:Lm0/i;

    .line 77
    .line 78
    invoke-interface {v0}, Lm0/i;->release()V

    .line 79
    .line 80
    .line 81
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/g;->L:LB0/r;

    .line 2
    .line 3
    new-instance v1, Lk0/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lk0/d;-><init>(Lk0/g;I)V

    .line 7
    .line 8
    .line 9
    sget-object v2, LC0/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    sget-boolean v3, LC0/b;->c:Z

    .line 13
    .line 14
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lk0/d;->b()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, LB0/r;

    .line 24
    .line 25
    const-string v2, "SntpClient"

    .line 26
    .line 27
    invoke-direct {v0, v2}, LB0/r;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance v2, LA0/b;

    .line 31
    .line 32
    const/4 v3, 0x3

    .line 33
    invoke-direct {v2, v3}, LA0/b;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, LB0/d;

    .line 37
    .line 38
    invoke-direct {v3, v1}, LB0/d;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v2, v3, v1}, LB0/r;->f(LB0/o;LB0/m;I)J

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
    .line 49
    .line 50
    .line 51
.end method

.method public final y(LB0/u;JJ)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    new-instance v2, Lx0/z;

    .line 4
    .line 5
    iget-wide v3, v1, LB0/u;->l:J

    .line 6
    .line 7
    iget-object v3, v1, LB0/u;->o:Lf0/z;

    .line 8
    .line 9
    iget-object v3, v3, Lf0/z;->n:Landroid/net/Uri;

    .line 10
    .line 11
    move-wide/from16 v3, p4

    .line 12
    .line 13
    invoke-direct {v2, v3, v4}, Lx0/z;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lk0/g;->x:LA0/b;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-object v3, v0, Lk0/g;->B:Lm0/e;

    .line 32
    .line 33
    iget v4, v1, LB0/u;->n:I

    .line 34
    .line 35
    const/4 v5, -0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    move-object v1, v3

    .line 40
    move v3, v4

    .line 41
    move v4, v5

    .line 42
    move-object v5, v6

    .line 43
    move v6, v7

    .line 44
    move-object v7, v12

    .line 45
    invoke-virtual/range {v1 .. v11}, Lm0/e;->c(Lx0/z;IILa0/p;ILjava/lang/Object;JJ)V

    .line 46
    .line 47
    .line 48
    return-void
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
.end method

.method public final z(Ljava/io/IOException;)V
    .locals 4

    .line 1
    const-string v0, "DashMediaSource"

    .line 2
    .line 3
    const-string v1, "Failed to resolve time offset."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr v0, v2

    .line 17
    iput-wide v0, p0, Lk0/g;->W:J

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lk0/g;->A(Z)V

    .line 21
    .line 22
    .line 23
    return-void
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
