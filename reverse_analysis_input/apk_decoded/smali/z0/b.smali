.class public final Lz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/a;


# static fields
.field public static final b:Lm2/A;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lm2/Z;->l:Lm2/Z;

    .line 2
    .line 3
    new-instance v1, Ly3/H;

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ly3/H;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, Lm2/q;

    .line 14
    .line 15
    invoke-direct {v2, v1, v0}, Lm2/q;-><init>(Ll2/d;Lm2/a0;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lm2/i0;->l:Lm2/i0;

    .line 19
    .line 20
    new-instance v1, Ly3/H;

    .line 21
    .line 22
    const/16 v3, 0x14

    .line 23
    .line 24
    invoke-direct {v1, v3}, Ly3/H;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, Lm2/q;

    .line 31
    .line 32
    invoke-direct {v3, v1, v0}, Lm2/q;-><init>(Ll2/d;Lm2/a0;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lm2/A;

    .line 36
    .line 37
    invoke-direct {v0, v2, v3}, Lm2/A;-><init>(Lm2/q;Lm2/q;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lz0/b;->b:Lm2/A;

    .line 41
    .line 42
    return-void
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

.method public constructor <init>()V
    .locals 1

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
    iput-object v0, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final a(J)Lm2/I;
    .locals 7

    .line 1
    iget-object v0, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_5

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lc1/a;

    .line 15
    .line 16
    iget-wide v2, v2, Lc1/a;->b:J

    .line 17
    .line 18
    cmp-long v2, p1, v2

    .line 19
    .line 20
    if-gez v2, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    move v3, v1

    .line 29
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ge v3, v4, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lc1/a;

    .line 40
    .line 41
    iget-wide v5, v4, Lc1/a;->b:J

    .line 42
    .line 43
    cmp-long v5, p1, v5

    .line 44
    .line 45
    if-ltz v5, :cond_1

    .line 46
    .line 47
    iget-wide v5, v4, Lc1/a;->d:J

    .line 48
    .line 49
    cmp-long v5, p1, v5

    .line 50
    .line 51
    if-gez v5, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-wide v4, v4, Lc1/a;->b:J

    .line 57
    .line 58
    cmp-long v4, p1, v4

    .line 59
    .line 60
    if-gez v4, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :goto_1
    sget-object p1, Lz0/b;->b:Lm2/A;

    .line 67
    .line 68
    invoke-static {p1, v2}, Lm2/I;->x(Lm2/a0;Ljava/util/List;)Lm2/b0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {}, Lm2/I;->n()Lm2/F;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :goto_2
    invoke-virtual {p1}, Lm2/b0;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-ge v1, v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lc1/a;

    .line 87
    .line 88
    iget-object v0, v0, Lc1/a;->a:Lm2/I;

    .line 89
    .line 90
    invoke-virtual {p2, v0}, Lm2/C;->d(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {p2}, Lm2/F;->g()Lm2/b0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_5
    :goto_3
    invoke-static {}, Lm2/I;->s()Lm2/b0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1
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

.method public final b(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lc1/a;

    .line 15
    .line 16
    iget-wide v2, v2, Lc1/a;->b:J

    .line 17
    .line 18
    cmp-long v2, p1, v2

    .line 19
    .line 20
    if-gez v2, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lc1/a;

    .line 28
    .line 29
    iget-wide v2, v2, Lc1/a;->b:J

    .line 30
    .line 31
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v1, v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lc1/a;

    .line 42
    .line 43
    iget-wide v4, v4, Lc1/a;->b:J

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lc1/a;

    .line 50
    .line 51
    iget-wide v6, v6, Lc1/a;->d:J

    .line 52
    .line 53
    cmp-long v8, v6, p1

    .line 54
    .line 55
    if-gtz v8, :cond_1

    .line 56
    .line 57
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    cmp-long v6, v4, p1

    .line 63
    .line 64
    if-gtz v6, :cond_2

    .line 65
    .line 66
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-wide v2

    .line 74
    :cond_3
    :goto_2
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    return-wide p1
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

.method public final c(J)J
    .locals 10

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move-wide v3, v0

    .line 8
    :goto_0
    iget-object v5, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    if-ge v2, v6, :cond_4

    .line 15
    .line 16
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Lc1/a;

    .line 21
    .line 22
    iget-wide v6, v6, Lc1/a;->b:J

    .line 23
    .line 24
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lc1/a;

    .line 29
    .line 30
    iget-wide v8, v5, Lc1/a;->d:J

    .line 31
    .line 32
    cmp-long v5, p1, v6

    .line 33
    .line 34
    if-gez v5, :cond_1

    .line 35
    .line 36
    cmp-long p1, v3, v0

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    move-wide v3, v6

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    move-wide v3, p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    cmp-long v5, p1, v8

    .line 49
    .line 50
    if-gez v5, :cond_3

    .line 51
    .line 52
    cmp-long v5, v3, v0

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    move-wide v3, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    :goto_2
    cmp-long p1, v3, v0

    .line 66
    .line 67
    if-eqz p1, :cond_5

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    const-wide/high16 v3, -0x8000000000000000L

    .line 71
    .line 72
    :goto_3
    return-wide v3
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

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

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

.method public final d(Lc1/a;J)Z
    .locals 9

    .line 1
    iget-wide v0, p1, Lc1/a;->b:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    move v4, v6

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v5

    .line 17
    :goto_0
    invoke-static {v4}, Ld0/m;->c(Z)V

    .line 18
    .line 19
    .line 20
    iget-wide v7, p1, Lc1/a;->c:J

    .line 21
    .line 22
    cmp-long v2, v7, v2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v2, v6

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v5

    .line 29
    :goto_1
    invoke-static {v2}, Ld0/m;->c(Z)V

    .line 30
    .line 31
    .line 32
    cmp-long v2, v0, p2

    .line 33
    .line 34
    if-gtz v2, :cond_2

    .line 35
    .line 36
    iget-wide v2, p1, Lc1/a;->d:J

    .line 37
    .line 38
    cmp-long p2, p2, v2

    .line 39
    .line 40
    if-gez p2, :cond_2

    .line 41
    .line 42
    move p2, v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move p2, v5

    .line 45
    :goto_2
    iget-object p3, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sub-int/2addr v2, v6

    .line 52
    :goto_3
    if-ltz v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lc1/a;

    .line 59
    .line 60
    iget-wide v3, v3, Lc1/a;->b:J

    .line 61
    .line 62
    cmp-long v3, v0, v3

    .line 63
    .line 64
    if-ltz v3, :cond_3

    .line 65
    .line 66
    add-int/2addr v2, v6

    .line 67
    invoke-virtual {p3, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return p2

    .line 71
    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {p3, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return p2
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

.method public final e(J)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lz0/b;->a:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_2

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lc1/a;

    .line 15
    .line 16
    iget-wide v2, v2, Lc1/a;->b:J

    .line 17
    .line 18
    cmp-long v2, p1, v2

    .line 19
    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lc1/a;

    .line 27
    .line 28
    iget-wide v3, v3, Lc1/a;->d:J

    .line 29
    .line 30
    cmp-long v3, p1, v3

    .line 31
    .line 32
    if-lez v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-gez v2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_2
    return-void
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
