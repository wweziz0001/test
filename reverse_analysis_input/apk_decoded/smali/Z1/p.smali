.class public final LZ1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final x:Ljava/lang/String;

.field public static final y:LB0/l;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public e:LQ1/g;

.field public final f:LQ1/g;

.field public g:J

.field public h:J

.field public i:J

.field public j:LQ1/d;

.field public final k:I

.field public l:I

.field public m:J

.field public n:J

.field public final o:J

.field public final p:J

.field public q:Z

.field public r:I

.field public final s:I

.field public final t:I

.field public u:J

.field public v:I

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "WorkSpec"

    .line 2
    .line 3
    invoke-static {v0}, LQ1/q;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "tagWithPrefix(\"WorkSpec\")"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LZ1/p;->x:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, LB0/l;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, LB0/l;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LZ1/p;->y:LB0/l;

    .line 21
    .line 22
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIIJII)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p13

    move/from16 v8, p15

    move/from16 v9, p25

    const-string v10, "id"

    invoke-static {p1, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "state"

    invoke-static {v10, p2}, Lb3/a;->r(Ljava/lang/String;I)V

    const-string v10, "workerClassName"

    invoke-static {p3, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "inputMergerClassName"

    invoke-static {p4, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "input"

    invoke-static {v5, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "output"

    invoke-static {v6, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "constraints"

    invoke-static {v7, v10}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "backoffPolicy"

    invoke-static {v10, v8}, Lb3/a;->r(Ljava/lang/String;I)V

    const-string v10, "outOfQuotaPolicy"

    invoke-static {v10, v9}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, LZ1/p;->a:Ljava/lang/String;

    .line 3
    iput v2, v0, LZ1/p;->b:I

    .line 4
    iput-object v3, v0, LZ1/p;->c:Ljava/lang/String;

    .line 5
    iput-object v4, v0, LZ1/p;->d:Ljava/lang/String;

    .line 6
    iput-object v5, v0, LZ1/p;->e:LQ1/g;

    .line 7
    iput-object v6, v0, LZ1/p;->f:LQ1/g;

    move-wide/from16 v1, p7

    .line 8
    iput-wide v1, v0, LZ1/p;->g:J

    move-wide/from16 v1, p9

    .line 9
    iput-wide v1, v0, LZ1/p;->h:J

    move-wide/from16 v1, p11

    .line 10
    iput-wide v1, v0, LZ1/p;->i:J

    .line 11
    iput-object v7, v0, LZ1/p;->j:LQ1/d;

    move/from16 v1, p14

    .line 12
    iput v1, v0, LZ1/p;->k:I

    .line 13
    iput v8, v0, LZ1/p;->l:I

    move-wide/from16 v1, p16

    .line 14
    iput-wide v1, v0, LZ1/p;->m:J

    move-wide/from16 v1, p18

    .line 15
    iput-wide v1, v0, LZ1/p;->n:J

    move-wide/from16 v1, p20

    .line 16
    iput-wide v1, v0, LZ1/p;->o:J

    move-wide/from16 v1, p22

    .line 17
    iput-wide v1, v0, LZ1/p;->p:J

    move/from16 v1, p24

    .line 18
    iput-boolean v1, v0, LZ1/p;->q:Z

    .line 19
    iput v9, v0, LZ1/p;->r:I

    move/from16 v1, p26

    .line 20
    iput v1, v0, LZ1/p;->s:I

    move/from16 v1, p27

    .line 21
    iput v1, v0, LZ1/p;->t:I

    move-wide/from16 v1, p28

    .line 22
    iput-wide v1, v0, LZ1/p;->u:J

    move/from16 v1, p30

    .line 23
    iput v1, v0, LZ1/p;->v:I

    move/from16 v1, p31

    .line 24
    iput v1, v0, LZ1/p;->w:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIJIII)V
    .locals 35

    move/from16 v0, p31

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 25
    const-class v1, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 26
    const-string v3, "EMPTY"

    if-eqz v1, :cond_2

    .line 27
    sget-object v1, LQ1/g;->c:LQ1/g;

    invoke-static {v1, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 28
    sget-object v1, LQ1/g;->c:LQ1/g;

    invoke-static {v1, v3}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_4

    move-wide v10, v3

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-wide v12, v3

    goto :goto_5

    :cond_5
    move-wide/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-wide v14, v3

    goto :goto_6

    :cond_6
    move-wide/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    .line 29
    sget-object v1, LQ1/d;->i:LQ1/d;

    move-object/from16 v16, v1

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    and-int/lit16 v1, v0, 0x400

    const/4 v6, 0x0

    if-eqz v1, :cond_8

    move/from16 v17, v6

    goto :goto_8

    :cond_8
    move/from16 v17, p14

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move/from16 v18, v2

    goto :goto_9

    :cond_9
    move/from16 v18, p15

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    const-wide/16 v19, 0x7530

    goto :goto_a

    :cond_a
    move-wide/from16 v19, p16

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    const-wide/16 v21, -0x1

    if-eqz v1, :cond_b

    move-wide/from16 v23, v21

    goto :goto_b

    :cond_b
    move-wide/from16 v23, p18

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-wide/from16 v25, v3

    goto :goto_c

    :cond_c
    move-wide/from16 v25, p20

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-wide/from16 v27, v21

    goto :goto_d

    :cond_d
    move-wide/from16 v27, p22

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move v1, v6

    goto :goto_e

    :cond_e
    move/from16 v1, p24

    :goto_e
    const/high16 v3, 0x20000

    and-int/2addr v3, v0

    if-eqz v3, :cond_f

    goto :goto_f

    :cond_f
    move/from16 v2, p25

    :goto_f
    const/high16 v3, 0x40000

    and-int/2addr v3, v0

    if-eqz v3, :cond_10

    move/from16 v29, v6

    goto :goto_10

    :cond_10
    move/from16 v29, p26

    :goto_10
    const/high16 v3, 0x100000

    and-int/2addr v3, v0

    if-eqz v3, :cond_11

    const-wide v3, 0x7fffffffffffffffL

    move-wide/from16 v31, v3

    goto :goto_11

    :cond_11
    move-wide/from16 v31, p27

    :goto_11
    const/high16 v3, 0x200000

    and-int/2addr v3, v0

    if-eqz v3, :cond_12

    move/from16 v33, v6

    goto :goto_12

    :cond_12
    move/from16 v33, p29

    :goto_12
    const/high16 v3, 0x400000

    and-int/2addr v0, v3

    if-eqz v0, :cond_13

    const/16 v0, -0x100

    move/from16 v34, v0

    goto :goto_13

    :cond_13
    move/from16 v34, p30

    :goto_13
    const/16 v30, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-wide/from16 v21, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v27

    move/from16 v27, v1

    move/from16 v28, v2

    .line 30
    invoke-direct/range {v3 .. v34}, LZ1/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIIJII)V

    return-void
.end method

.method public static b(LZ1/p;Ljava/lang/String;ILjava/lang/String;LQ1/g;IJIIJII)LZ1/p;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p13

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, LZ1/p;->a:Ljava/lang/String;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget v2, v0, LZ1/p;->b:I

    .line 20
    .line 21
    move v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, LZ1/p;->c:Ljava/lang/String;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    iget-object v7, v0, LZ1/p;->d:Ljava/lang/String;

    .line 36
    .line 37
    and-int/lit8 v2, v1, 0x10

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-object v2, v0, LZ1/p;->e:LQ1/g;

    .line 42
    .line 43
    move-object v8, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move-object/from16 v8, p4

    .line 46
    .line 47
    :goto_3
    iget-object v9, v0, LZ1/p;->f:LQ1/g;

    .line 48
    .line 49
    iget-wide v10, v0, LZ1/p;->g:J

    .line 50
    .line 51
    iget-wide v12, v0, LZ1/p;->h:J

    .line 52
    .line 53
    iget-wide v14, v0, LZ1/p;->i:J

    .line 54
    .line 55
    iget-object v2, v0, LZ1/p;->j:LQ1/d;

    .line 56
    .line 57
    and-int/lit16 v3, v1, 0x400

    .line 58
    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    iget v3, v0, LZ1/p;->k:I

    .line 62
    .line 63
    move/from16 v17, v3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    move/from16 v17, p5

    .line 67
    .line 68
    :goto_4
    iget v3, v0, LZ1/p;->l:I

    .line 69
    .line 70
    move-wide/from16 v18, v14

    .line 71
    .line 72
    iget-wide v14, v0, LZ1/p;->m:J

    .line 73
    .line 74
    move-wide/from16 v20, v14

    .line 75
    .line 76
    and-int/lit16 v14, v1, 0x2000

    .line 77
    .line 78
    if-eqz v14, :cond_5

    .line 79
    .line 80
    iget-wide v14, v0, LZ1/p;->n:J

    .line 81
    .line 82
    move-wide/from16 v22, v14

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move-wide/from16 v22, p6

    .line 86
    .line 87
    :goto_5
    iget-wide v14, v0, LZ1/p;->o:J

    .line 88
    .line 89
    move-wide/from16 v24, v14

    .line 90
    .line 91
    iget-wide v14, v0, LZ1/p;->p:J

    .line 92
    .line 93
    move-wide/from16 v26, v14

    .line 94
    .line 95
    iget-boolean v14, v0, LZ1/p;->q:Z

    .line 96
    .line 97
    iget v15, v0, LZ1/p;->r:I

    .line 98
    .line 99
    const/high16 v16, 0x40000

    .line 100
    .line 101
    and-int v16, v1, v16

    .line 102
    .line 103
    if-eqz v16, :cond_6

    .line 104
    .line 105
    move/from16 v16, v14

    .line 106
    .line 107
    iget v14, v0, LZ1/p;->s:I

    .line 108
    .line 109
    move/from16 v29, v14

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_6
    move/from16 v16, v14

    .line 113
    .line 114
    move/from16 v29, p8

    .line 115
    .line 116
    :goto_6
    const/high16 v14, 0x80000

    .line 117
    .line 118
    and-int/2addr v14, v1

    .line 119
    if-eqz v14, :cond_7

    .line 120
    .line 121
    iget v14, v0, LZ1/p;->t:I

    .line 122
    .line 123
    move/from16 v30, v14

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_7
    move/from16 v30, p9

    .line 127
    .line 128
    :goto_7
    const/high16 v14, 0x100000

    .line 129
    .line 130
    and-int/2addr v14, v1

    .line 131
    move-wide/from16 v31, v12

    .line 132
    .line 133
    if-eqz v14, :cond_8

    .line 134
    .line 135
    iget-wide v12, v0, LZ1/p;->u:J

    .line 136
    .line 137
    move-wide/from16 v33, v12

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_8
    move-wide/from16 v33, p10

    .line 141
    .line 142
    :goto_8
    const/high16 v12, 0x200000

    .line 143
    .line 144
    and-int/2addr v1, v12

    .line 145
    if-eqz v1, :cond_9

    .line 146
    .line 147
    iget v1, v0, LZ1/p;->v:I

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_9
    move/from16 v1, p12

    .line 151
    .line 152
    :goto_9
    iget v14, v0, LZ1/p;->w:I

    .line 153
    .line 154
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const-string v0, "id"

    .line 158
    .line 159
    invoke-static {v4, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v0, "state"

    .line 163
    .line 164
    invoke-static {v0, v5}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    const-string v0, "workerClassName"

    .line 168
    .line 169
    invoke-static {v6, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v0, "inputMergerClassName"

    .line 173
    .line 174
    invoke-static {v7, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v0, "input"

    .line 178
    .line 179
    invoke-static {v8, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v0, "output"

    .line 183
    .line 184
    invoke-static {v9, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v0, "constraints"

    .line 188
    .line 189
    invoke-static {v2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v0, "backoffPolicy"

    .line 193
    .line 194
    invoke-static {v0, v3}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    const-string v0, "outOfQuotaPolicy"

    .line 198
    .line 199
    invoke-static {v0, v15}, Lb3/a;->r(Ljava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    new-instance v0, LZ1/p;

    .line 203
    .line 204
    move/from16 v28, v3

    .line 205
    .line 206
    move-object v3, v0

    .line 207
    move-wide/from16 v12, v31

    .line 208
    .line 209
    move/from16 v35, v14

    .line 210
    .line 211
    move/from16 v32, v15

    .line 212
    .line 213
    move/from16 v31, v16

    .line 214
    .line 215
    move-wide/from16 v14, v18

    .line 216
    .line 217
    move-object/from16 v16, v2

    .line 218
    .line 219
    move/from16 v18, v28

    .line 220
    .line 221
    move-wide/from16 v19, v20

    .line 222
    .line 223
    move-wide/from16 v21, v22

    .line 224
    .line 225
    move-wide/from16 v23, v24

    .line 226
    .line 227
    move-wide/from16 v25, v26

    .line 228
    .line 229
    move/from16 v27, v31

    .line 230
    .line 231
    move/from16 v28, v32

    .line 232
    .line 233
    move-wide/from16 v31, v33

    .line 234
    .line 235
    move/from16 v33, v1

    .line 236
    .line 237
    move/from16 v34, v35

    .line 238
    .line 239
    invoke-direct/range {v3 .. v34}, LZ1/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LQ1/g;LQ1/g;JJJLQ1/d;IIJJJJZIIIJII)V

    .line 240
    .line 241
    .line 242
    return-object v0
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
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
.end method


# virtual methods
.method public final a()J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LZ1/p;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    iget v1, v0, LZ1/p;->k:I

    .line 9
    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    :goto_0
    move v3, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget v5, v0, LZ1/p;->l:I

    .line 17
    .line 18
    iget-wide v6, v0, LZ1/p;->m:J

    .line 19
    .line 20
    iget-wide v8, v0, LZ1/p;->n:J

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p0}, LZ1/p;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v11

    .line 26
    iget-wide v12, v0, LZ1/p;->g:J

    .line 27
    .line 28
    iget-wide v14, v0, LZ1/p;->i:J

    .line 29
    .line 30
    iget-wide v1, v0, LZ1/p;->h:J

    .line 31
    .line 32
    move-wide/from16 v16, v1

    .line 33
    .line 34
    iget-wide v1, v0, LZ1/p;->u:J

    .line 35
    .line 36
    move-wide/from16 v18, v1

    .line 37
    .line 38
    iget v4, v0, LZ1/p;->k:I

    .line 39
    .line 40
    iget v10, v0, LZ1/p;->s:I

    .line 41
    .line 42
    invoke-static/range {v3 .. v19}, Li4/a;->f(ZIIJJIZJJJJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    return-wide v1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final c()Z
    .locals 2

    .line 1
    sget-object v0, LQ1/d;->i:LQ1/d;

    .line 2
    .line 3
    iget-object v1, p0, LZ1/p;->j:LQ1/d;

    .line 4
    .line 5
    invoke-static {v0, v1}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
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

.method public final d()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LZ1/p;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LZ1/p;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LZ1/p;

    .line 12
    .line 13
    iget-object v1, p1, LZ1/p;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, LZ1/p;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v1}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, LZ1/p;->b:I

    .line 25
    .line 26
    iget v3, p1, LZ1/p;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, LZ1/p;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, LZ1/p;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, LZ1/p;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, LZ1/p;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, LZ1/p;->e:LQ1/g;

    .line 54
    .line 55
    iget-object v3, p1, LZ1/p;->e:LQ1/g;

    .line 56
    .line 57
    invoke-static {v1, v3}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, LZ1/p;->f:LQ1/g;

    .line 65
    .line 66
    iget-object v3, p1, LZ1/p;->f:LQ1/g;

    .line 67
    .line 68
    invoke-static {v1, v3}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-wide v3, p0, LZ1/p;->g:J

    .line 76
    .line 77
    iget-wide v5, p1, LZ1/p;->g:J

    .line 78
    .line 79
    cmp-long v1, v3, v5

    .line 80
    .line 81
    if-eqz v1, :cond_8

    .line 82
    .line 83
    return v2

    .line 84
    :cond_8
    iget-wide v3, p0, LZ1/p;->h:J

    .line 85
    .line 86
    iget-wide v5, p1, LZ1/p;->h:J

    .line 87
    .line 88
    cmp-long v1, v3, v5

    .line 89
    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-wide v3, p0, LZ1/p;->i:J

    .line 94
    .line 95
    iget-wide v5, p1, LZ1/p;->i:J

    .line 96
    .line 97
    cmp-long v1, v3, v5

    .line 98
    .line 99
    if-eqz v1, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    iget-object v1, p0, LZ1/p;->j:LQ1/d;

    .line 103
    .line 104
    iget-object v3, p1, LZ1/p;->j:LQ1/d;

    .line 105
    .line 106
    invoke-static {v1, v3}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_b

    .line 111
    .line 112
    return v2

    .line 113
    :cond_b
    iget v1, p0, LZ1/p;->k:I

    .line 114
    .line 115
    iget v3, p1, LZ1/p;->k:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_c

    .line 118
    .line 119
    return v2

    .line 120
    :cond_c
    iget v1, p0, LZ1/p;->l:I

    .line 121
    .line 122
    iget v3, p1, LZ1/p;->l:I

    .line 123
    .line 124
    if-eq v1, v3, :cond_d

    .line 125
    .line 126
    return v2

    .line 127
    :cond_d
    iget-wide v3, p0, LZ1/p;->m:J

    .line 128
    .line 129
    iget-wide v5, p1, LZ1/p;->m:J

    .line 130
    .line 131
    cmp-long v1, v3, v5

    .line 132
    .line 133
    if-eqz v1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-wide v3, p0, LZ1/p;->n:J

    .line 137
    .line 138
    iget-wide v5, p1, LZ1/p;->n:J

    .line 139
    .line 140
    cmp-long v1, v3, v5

    .line 141
    .line 142
    if-eqz v1, :cond_f

    .line 143
    .line 144
    return v2

    .line 145
    :cond_f
    iget-wide v3, p0, LZ1/p;->o:J

    .line 146
    .line 147
    iget-wide v5, p1, LZ1/p;->o:J

    .line 148
    .line 149
    cmp-long v1, v3, v5

    .line 150
    .line 151
    if-eqz v1, :cond_10

    .line 152
    .line 153
    return v2

    .line 154
    :cond_10
    iget-wide v3, p0, LZ1/p;->p:J

    .line 155
    .line 156
    iget-wide v5, p1, LZ1/p;->p:J

    .line 157
    .line 158
    cmp-long v1, v3, v5

    .line 159
    .line 160
    if-eqz v1, :cond_11

    .line 161
    .line 162
    return v2

    .line 163
    :cond_11
    iget-boolean v1, p0, LZ1/p;->q:Z

    .line 164
    .line 165
    iget-boolean v3, p1, LZ1/p;->q:Z

    .line 166
    .line 167
    if-eq v1, v3, :cond_12

    .line 168
    .line 169
    return v2

    .line 170
    :cond_12
    iget v1, p0, LZ1/p;->r:I

    .line 171
    .line 172
    iget v3, p1, LZ1/p;->r:I

    .line 173
    .line 174
    if-eq v1, v3, :cond_13

    .line 175
    .line 176
    return v2

    .line 177
    :cond_13
    iget v1, p0, LZ1/p;->s:I

    .line 178
    .line 179
    iget v3, p1, LZ1/p;->s:I

    .line 180
    .line 181
    if-eq v1, v3, :cond_14

    .line 182
    .line 183
    return v2

    .line 184
    :cond_14
    iget v1, p0, LZ1/p;->t:I

    .line 185
    .line 186
    iget v3, p1, LZ1/p;->t:I

    .line 187
    .line 188
    if-eq v1, v3, :cond_15

    .line 189
    .line 190
    return v2

    .line 191
    :cond_15
    iget-wide v3, p0, LZ1/p;->u:J

    .line 192
    .line 193
    iget-wide v5, p1, LZ1/p;->u:J

    .line 194
    .line 195
    cmp-long v1, v3, v5

    .line 196
    .line 197
    if-eqz v1, :cond_16

    .line 198
    .line 199
    return v2

    .line 200
    :cond_16
    iget v1, p0, LZ1/p;->v:I

    .line 201
    .line 202
    iget v3, p1, LZ1/p;->v:I

    .line 203
    .line 204
    if-eq v1, v3, :cond_17

    .line 205
    .line 206
    return v2

    .line 207
    :cond_17
    iget v1, p0, LZ1/p;->w:I

    .line 208
    .line 209
    iget p1, p1, LZ1/p;->w:I

    .line 210
    .line 211
    if-eq v1, p1, :cond_18

    .line 212
    .line 213
    return v2

    .line 214
    :cond_18
    return v0
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

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/p;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, LZ1/p;->b:I

    .line 11
    .line 12
    invoke-static {v2}, LO/i;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, LZ1/p;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lb3/a;->e(ILjava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, LZ1/p;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Lb3/a;->e(ILjava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, LZ1/p;->e:LQ1/g;

    .line 31
    .line 32
    invoke-virtual {v2}, LQ1/g;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, LZ1/p;->f:LQ1/g;

    .line 39
    .line 40
    invoke-virtual {v0}, LQ1/g;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-wide v2, p0, LZ1/p;->g:J

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, LZ1/p;->h:J

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, LZ1/p;->i:J

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, LZ1/p;->j:LQ1/d;

    .line 65
    .line 66
    invoke-virtual {v2}, LQ1/d;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget v0, p0, LZ1/p;->k:I

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v2

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget v2, p0, LZ1/p;->l:I

    .line 81
    .line 82
    invoke-static {v2}, LO/i;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    add-int/2addr v2, v0

    .line 87
    mul-int/2addr v2, v1

    .line 88
    iget-wide v3, p0, LZ1/p;->m:J

    .line 89
    .line 90
    invoke-static {v3, v4, v2, v1}, Lb3/a;->f(JII)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-wide v2, p0, LZ1/p;->n:J

    .line 95
    .line 96
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-wide v2, p0, LZ1/p;->o:J

    .line 101
    .line 102
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-wide v2, p0, LZ1/p;->p:J

    .line 107
    .line 108
    invoke-static {v2, v3, v0, v1}, Lb3/a;->f(JII)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-boolean v2, p0, LZ1/p;->q:Z

    .line 113
    .line 114
    if-eqz v2, :cond_0

    .line 115
    .line 116
    const/4 v2, 0x1

    .line 117
    :cond_0
    add-int/2addr v0, v2

    .line 118
    mul-int/2addr v0, v1

    .line 119
    iget v2, p0, LZ1/p;->r:I

    .line 120
    .line 121
    invoke-static {v2}, LO/i;->b(I)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    add-int/2addr v2, v0

    .line 126
    mul-int/2addr v2, v1

    .line 127
    iget v0, p0, LZ1/p;->s:I

    .line 128
    .line 129
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    add-int/2addr v0, v2

    .line 134
    mul-int/2addr v0, v1

    .line 135
    iget v2, p0, LZ1/p;->t:I

    .line 136
    .line 137
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    add-int/2addr v2, v0

    .line 142
    mul-int/2addr v2, v1

    .line 143
    iget-wide v3, p0, LZ1/p;->u:J

    .line 144
    .line 145
    invoke-static {v3, v4, v2, v1}, Lb3/a;->f(JII)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iget v2, p0, LZ1/p;->v:I

    .line 150
    .line 151
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    add-int/2addr v2, v0

    .line 156
    mul-int/2addr v2, v1

    .line 157
    iget v0, p0, LZ1/p;->w:I

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    add-int/2addr v0, v2

    .line 164
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{WorkSpec: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LZ1/p;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
