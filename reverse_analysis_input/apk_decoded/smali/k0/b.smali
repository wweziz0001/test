.class public final Lk0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/F;
.implements Lx0/g0;


# static fields
.field public static final K:Ljava/util/regex/Pattern;

.field public static final L:Ljava/util/regex/Pattern;


# instance fields
.field public final A:Lm0/e;

.field public B:Lx0/E;

.field public C:[Ly0/h;

.field public D:[Lk0/l;

.field public E:Lx0/m;

.field public F:Ll0/c;

.field public G:I

.field public H:Ljava/util/List;

.field public I:Z

.field public J:J

.field public final l:I

.field public final m:LD0/d;

.field public final n:Lf0/A;

.field public final o:Lm0/i;

.field public final p:LA0/b;

.field public final q:LZ1/i;

.field public final r:J

.field public final s:LB0/s;

.field public final t:LB0/f;

.field public final u:Lx0/q0;

.field public final v:[Lk0/a;

.field public final w:Lp1/b;

.field public final x:Lk0/o;

.field public final y:Ljava/util/IdentityHashMap;

.field public final z:Lm0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CC([1-4])=(.+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lk0/b;->K:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lk0/b;->L:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
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

.method public constructor <init>(ILl0/c;LZ1/i;ILD0/d;Lf0/A;Lm0/i;Lm0/e;LA0/b;Lm0/e;JLB0/s;LB0/f;Lp1/b;Lk0/d;Li0/j;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    move-object/from16 v5, p14

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move/from16 v6, p1

    .line 2
    iput v6, v0, Lk0/b;->l:I

    .line 3
    iput-object v1, v0, Lk0/b;->F:Ll0/c;

    move-object/from16 v6, p3

    .line 4
    iput-object v6, v0, Lk0/b;->q:LZ1/i;

    .line 5
    iput v2, v0, Lk0/b;->G:I

    .line 6
    iput-object v3, v0, Lk0/b;->m:LD0/d;

    move-object/from16 v6, p6

    .line 7
    iput-object v6, v0, Lk0/b;->n:Lf0/A;

    .line 8
    iput-object v4, v0, Lk0/b;->o:Lm0/i;

    move-object/from16 v6, p8

    .line 9
    iput-object v6, v0, Lk0/b;->A:Lm0/e;

    move-object/from16 v6, p9

    .line 10
    iput-object v6, v0, Lk0/b;->p:LA0/b;

    move-object/from16 v6, p10

    .line 11
    iput-object v6, v0, Lk0/b;->z:Lm0/e;

    move-wide/from16 v6, p11

    .line 12
    iput-wide v6, v0, Lk0/b;->r:J

    move-object/from16 v6, p13

    .line 13
    iput-object v6, v0, Lk0/b;->s:LB0/s;

    .line 14
    iput-object v5, v0, Lk0/b;->t:LB0/f;

    move-object/from16 v6, p15

    .line 15
    iput-object v6, v0, Lk0/b;->w:Lp1/b;

    const/4 v7, 0x1

    .line 16
    iput-boolean v7, v0, Lk0/b;->I:Z

    .line 17
    new-instance v8, Lk0/o;

    move-object/from16 v9, p16

    invoke-direct {v8, v1, v9, v5}, Lk0/o;-><init>(Ll0/c;Lk0/d;LB0/f;)V

    iput-object v8, v0, Lk0/b;->x:Lk0/o;

    const/4 v5, 0x0

    .line 18
    new-array v8, v5, [Ly0/h;

    .line 19
    iput-object v8, v0, Lk0/b;->C:[Ly0/h;

    .line 20
    new-array v8, v5, [Lk0/l;

    iput-object v8, v0, Lk0/b;->D:[Lk0/l;

    .line 21
    new-instance v8, Ljava/util/IdentityHashMap;

    invoke-direct {v8}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v8, v0, Lk0/b;->y:Ljava/util/IdentityHashMap;

    .line 22
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v6, Lx0/m;

    sget-object v8, Lm2/I;->m:Lm2/G;

    .line 24
    sget-object v8, Lm2/b0;->p:Lm2/b0;

    .line 25
    invoke-direct {v6, v8, v8}, Lx0/m;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 26
    iput-object v6, v0, Lk0/b;->E:Lx0/m;

    .line 27
    invoke-virtual {v1, v2}, Ll0/c;->b(I)Ll0/h;

    move-result-object v1

    .line 28
    iget-object v2, v1, Ll0/h;->d:Ljava/util/List;

    iput-object v2, v0, Lk0/b;->H:Ljava/util/List;

    .line 29
    iget-object v1, v1, Ll0/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    .line 30
    new-instance v8, Ljava/util/HashMap;

    invoke-static {v6}, Lm2/r;->b(I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 31
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    new-instance v10, Landroid/util/SparseArray;

    invoke-direct {v10, v6}, Landroid/util/SparseArray;-><init>(I)V

    move v11, v5

    :goto_0
    if-ge v11, v6, :cond_0

    .line 33
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll0/a;

    iget-wide v12, v12, Ll0/a;->a:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 35
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-virtual {v10, v11, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/2addr v11, v7

    goto :goto_0

    :cond_0
    move v11, v5

    :goto_1
    const/4 v12, -0x1

    if-ge v11, v6, :cond_6

    .line 38
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll0/a;

    .line 39
    iget-object v14, v13, Ll0/a;->e:Ljava/util/List;

    .line 40
    const-string v15, "http://dashif.org/guidelines/trickmode"

    invoke-static {v15, v14}, Lk0/b;->g(Ljava/lang/String;Ljava/util/List;)Ll0/f;

    move-result-object v14

    .line 41
    iget-object v13, v13, Ll0/a;->f:Ljava/util/List;

    if-nez v14, :cond_1

    .line 42
    invoke-static {v15, v13}, Lk0/b;->g(Ljava/lang/String;Ljava/util/List;)Ll0/f;

    move-result-object v14

    :cond_1
    if-eqz v14, :cond_2

    .line 43
    iget-object v14, v14, Ll0/f;->b:Ljava/lang/String;

    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 44
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v8, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    if-eqz v14, :cond_2

    .line 45
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_2

    :cond_2
    move v14, v11

    :goto_2
    if-ne v14, v11, :cond_4

    .line 46
    const-string v15, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-static {v15, v13}, Lk0/b;->g(Ljava/lang/String;Ljava/util/List;)Ll0/f;

    move-result-object v13

    if-eqz v13, :cond_4

    .line 47
    sget v15, Ld0/w;->a:I

    .line 48
    iget-object v13, v13, Ll0/f;->b:Ljava/lang/String;

    const-string v15, ","

    invoke-virtual {v13, v15, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    .line 49
    array-length v13, v12

    move v15, v5

    :goto_3
    if-ge v15, v13, :cond_4

    aget-object v16, v12, v15

    .line 50
    invoke-static/range {v16 .. v16}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_3

    .line 51
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v14, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v14, v5

    :cond_3
    add-int/2addr v15, v7

    const/4 v5, 0x0

    goto :goto_3

    :cond_4
    if-eq v14, v11, :cond_5

    .line 52
    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 53
    invoke-virtual {v10, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 54
    invoke-interface {v12, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 55
    invoke-virtual {v10, v11, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/2addr v11, v7

    const/4 v5, 0x0

    goto/16 :goto_1

    .line 57
    :cond_6
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v6, v5, [[I

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v5, :cond_7

    .line 58
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-static {v10}, LQ1/C;->x0(Ljava/util/Collection;)[I

    move-result-object v10

    aput-object v10, v6, v8

    .line 59
    invoke-static {v10}, Ljava/util/Arrays;->sort([I)V

    add-int/2addr v8, v7

    goto :goto_4

    .line 60
    :cond_7
    new-array v8, v5, [Z

    .line 61
    new-array v9, v5, [[La0/p;

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_5
    if-ge v10, v5, :cond_10

    .line 62
    aget-object v13, v6, v10

    .line 63
    array-length v14, v13

    const/4 v15, 0x0

    :goto_6
    if-ge v15, v14, :cond_a

    aget v12, v13, v15

    .line 64
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll0/a;

    iget-object v12, v12, Ll0/a;->c:Ljava/util/List;

    move-object/from16 p4, v13

    const/4 v7, 0x0

    .line 65
    :goto_7
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-ge v7, v13, :cond_9

    .line 66
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll0/m;

    .line 67
    iget-object v13, v13, Ll0/m;->o:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_8

    const/4 v13, 0x1

    .line 68
    aput-boolean v13, v8, v10

    add-int/2addr v11, v13

    goto :goto_8

    :cond_8
    const/4 v13, 0x1

    add-int/2addr v7, v13

    goto :goto_7

    :cond_9
    const/4 v13, 0x1

    add-int/2addr v15, v13

    move v7, v13

    const/4 v12, -0x1

    move-object/from16 v13, p4

    goto :goto_6

    .line 69
    :cond_a
    :goto_8
    aget-object v7, v6, v10

    .line 70
    array-length v12, v7

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v12, :cond_e

    aget v14, v7, v13

    .line 71
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll0/a;

    .line 72
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll0/a;

    iget-object v14, v14, Ll0/a;->d:Ljava/util/List;

    move-object/from16 p4, v7

    move/from16 v16, v12

    const/4 v7, 0x0

    .line 73
    :goto_a
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    if-ge v7, v12, :cond_d

    .line 74
    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll0/f;

    move-object/from16 v17, v14

    .line 75
    iget-object v14, v12, Ll0/f;->a:Ljava/lang/String;

    const-string v0, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 76
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 77
    const-string v7, "application/cea-608"

    invoke-static {v7}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, La0/o;->m:Ljava/lang/String;

    .line 78
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v13, v15, Ll0/a;->a:J

    invoke-virtual {v7, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v13, ":cea608"

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 79
    iput-object v7, v0, La0/o;->a:Ljava/lang/String;

    .line 80
    new-instance v7, La0/p;

    invoke-direct {v7, v0}, La0/p;-><init>(La0/o;)V

    .line 81
    sget-object v0, Lk0/b;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v7}, Lk0/b;->k(Ll0/f;Ljava/util/regex/Pattern;La0/p;)[La0/p;

    move-result-object v0

    :goto_b
    move-object v12, v0

    const/4 v0, 0x1

    goto :goto_c

    .line 82
    :cond_b
    const-string v0, "urn:scte:dash:cc:cea-708:2015"

    iget-object v14, v12, Ll0/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 83
    new-instance v0, La0/o;

    invoke-direct {v0}, La0/o;-><init>()V

    .line 84
    const-string v7, "application/cea-708"

    invoke-static {v7}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, La0/o;->m:Ljava/lang/String;

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v13, v15, Ll0/a;->a:J

    invoke-virtual {v7, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v13, ":cea708"

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 86
    iput-object v7, v0, La0/o;->a:Ljava/lang/String;

    .line 87
    new-instance v7, La0/p;

    invoke-direct {v7, v0}, La0/p;-><init>(La0/o;)V

    .line 88
    sget-object v0, Lk0/b;->L:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v7}, Lk0/b;->k(Ll0/f;Ljava/util/regex/Pattern;La0/p;)[La0/p;

    move-result-object v0

    goto :goto_b

    :cond_c
    const/4 v0, 0x1

    add-int/2addr v7, v0

    move-object/from16 v0, p0

    move-object/from16 v14, v17

    goto/16 :goto_a

    :cond_d
    const/4 v0, 0x1

    add-int/2addr v13, v0

    move-object/from16 v0, p0

    move-object/from16 v7, p4

    move/from16 v12, v16

    goto/16 :goto_9

    :cond_e
    const/4 v0, 0x1

    const/4 v7, 0x0

    .line 89
    new-array v12, v7, [La0/p;

    .line 90
    :goto_c
    aput-object v12, v9, v10

    .line 91
    array-length v7, v12

    if-eqz v7, :cond_f

    add-int/2addr v11, v0

    :cond_f
    add-int/2addr v10, v0

    const/4 v12, -0x1

    move v7, v0

    move-object/from16 v0, p0

    goto/16 :goto_5

    :cond_10
    add-int/2addr v11, v5

    .line 92
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v11

    .line 93
    new-array v7, v0, [La0/V;

    .line 94
    new-array v0, v0, [Lk0/a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 95
    :goto_d
    const-string v12, "application/x-emsg"

    if-ge v10, v5, :cond_18

    .line 96
    aget-object v13, v6, v10

    .line 97
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 98
    array-length v15, v13

    move/from16 p4, v5

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v15, :cond_11

    move-object/from16 v16, v6

    aget v6, v13, v5

    .line 99
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll0/a;

    iget-object v6, v6, Ll0/a;->c:Ljava/util/List;

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v6, 0x1

    add-int/2addr v5, v6

    move-object/from16 v6, v16

    goto :goto_e

    :cond_11
    move-object/from16 v16, v6

    .line 100
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v6, v5, [La0/p;

    const/4 v15, 0x0

    :goto_f
    if-ge v15, v5, :cond_12

    .line 101
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 p6, v5

    move-object/from16 v5, v17

    check-cast v5, Ll0/m;

    iget-object v5, v5, Ll0/m;->l:La0/p;

    move-object/from16 p8, v14

    .line 102
    invoke-virtual {v5}, La0/p;->a()La0/o;

    move-result-object v14

    .line 103
    invoke-interface {v4, v5}, Lm0/i;->b(La0/p;)I

    move-result v5

    .line 104
    iput v5, v14, La0/o;->K:I

    .line 105
    new-instance v5, La0/p;

    invoke-direct {v5, v14}, La0/p;-><init>(La0/o;)V

    .line 106
    aput-object v5, v6, v15

    const/4 v5, 0x1

    add-int/2addr v15, v5

    move/from16 v5, p6

    move-object/from16 v14, p8

    goto :goto_f

    :cond_12
    const/4 v5, 0x0

    .line 107
    aget v14, v13, v5

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/a;

    .line 108
    iget-wide v14, v5, Ll0/a;->a:J

    const-wide/16 v17, -0x1

    cmp-long v17, v14, v17

    if-eqz v17, :cond_13

    .line 109
    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    :goto_10
    const/4 v15, 0x1

    goto :goto_11

    .line 110
    :cond_13
    const-string v14, "unset:"

    .line 111
    invoke-static {v14, v10}, Lb3/a;->i(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    goto :goto_10

    :goto_11
    add-int/lit8 v17, v11, 0x1

    .line 112
    aget-boolean v18, v8, v10

    if-eqz v18, :cond_14

    add-int/lit8 v18, v11, 0x2

    move/from16 p6, v17

    move/from16 v17, v18

    goto :goto_12

    :cond_14
    const/16 p6, -0x1

    .line 113
    :goto_12
    aget-object v15, v9, v10

    array-length v15, v15

    if-eqz v15, :cond_15

    const/4 v15, 0x1

    add-int/lit8 v18, v17, 0x1

    move/from16 v15, v17

    move/from16 v17, v18

    goto :goto_13

    :cond_15
    const/4 v15, -0x1

    .line 114
    :goto_13
    invoke-static {v3, v6}, Lk0/b;->j(LD0/d;[La0/p;)V

    move-object/from16 v18, v1

    .line 115
    new-instance v1, La0/V;

    invoke-direct {v1, v14, v6}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    aput-object v1, v7, v11

    .line 116
    new-instance v1, Lk0/a;

    .line 117
    sget-object v6, Lm2/I;->m:Lm2/G;

    .line 118
    sget-object v6, Lm2/b0;->p:Lm2/b0;

    const/16 v19, 0x0

    const/16 v20, -0x1

    .line 119
    iget v5, v5, Ll0/a;->b:I

    move-object/from16 p8, v1

    move/from16 p9, v5

    move/from16 p10, v19

    move-object/from16 p11, v13

    move/from16 p12, v11

    move/from16 p13, p6

    move/from16 p14, v15

    move/from16 p15, v20

    move-object/from16 p16, v6

    invoke-direct/range {p8 .. p16}, Lk0/a;-><init>(II[IIIIILm2/b0;)V

    .line 120
    aput-object v1, v0, v11

    move/from16 v5, p6

    const/4 v1, -0x1

    if-eq v5, v1, :cond_16

    .line 121
    const-string v1, ":emsg"

    .line 122
    invoke-static {v14, v1}, Lm/B0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 123
    new-instance v4, La0/o;

    invoke-direct {v4}, La0/o;-><init>()V

    .line 124
    iput-object v1, v4, La0/o;->a:Ljava/lang/String;

    .line 125
    invoke-static {v12}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v4, La0/o;->m:Ljava/lang/String;

    .line 126
    new-instance v12, La0/p;

    invoke-direct {v12, v4}, La0/p;-><init>(La0/o;)V

    .line 127
    new-instance v4, La0/V;

    filled-new-array {v12}, [La0/p;

    move-result-object v12

    invoke-direct {v4, v1, v12}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    aput-object v4, v7, v5

    .line 128
    new-instance v1, Lk0/a;

    const/4 v4, 0x1

    const/4 v12, -0x1

    const/16 v19, 0x5

    const/16 v20, -0x1

    const/16 v21, -0x1

    move-object/from16 p8, v1

    move/from16 p9, v19

    move/from16 p10, v4

    move-object/from16 p11, v13

    move/from16 p12, v11

    move/from16 p13, v12

    move/from16 p14, v20

    move/from16 p15, v21

    move-object/from16 p16, v6

    .line 129
    invoke-direct/range {p8 .. p16}, Lk0/a;-><init>(II[IIIIILm2/b0;)V

    .line 130
    aput-object v1, v0, v5

    const/4 v1, -0x1

    :cond_16
    if-eq v15, v1, :cond_17

    .line 131
    const-string v4, ":cc"

    .line 132
    invoke-static {v14, v4}, Lm/B0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 133
    aget-object v5, v9, v10

    .line 134
    invoke-static {v5}, Lm2/I;->q([Ljava/lang/Object;)Lm2/b0;

    move-result-object v5

    .line 135
    new-instance v6, Lk0/a;

    const/4 v12, -0x1

    const/4 v14, -0x1

    const/16 v19, 0x3

    const/16 v20, 0x1

    const/16 v21, -0x1

    move-object/from16 p8, v6

    move/from16 p9, v19

    move/from16 p10, v20

    move-object/from16 p11, v13

    move/from16 p12, v11

    move/from16 p13, v21

    move/from16 p14, v12

    move/from16 p15, v14

    move-object/from16 p16, v5

    invoke-direct/range {p8 .. p16}, Lk0/a;-><init>(II[IIIIILm2/b0;)V

    .line 136
    aput-object v6, v0, v15

    .line 137
    aget-object v5, v9, v10

    invoke-static {v3, v5}, Lk0/b;->j(LD0/d;[La0/p;)V

    .line 138
    new-instance v5, La0/V;

    aget-object v6, v9, v10

    invoke-direct {v5, v4, v6}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    aput-object v5, v7, v15

    :cond_17
    const/4 v4, 0x1

    add-int/2addr v10, v4

    move/from16 v5, p4

    move-object/from16 v4, p7

    move-object/from16 v6, v16

    move/from16 v11, v17

    move-object/from16 v1, v18

    goto/16 :goto_d

    :cond_18
    const/4 v1, 0x0

    .line 139
    :goto_14
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_19

    .line 140
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/g;

    .line 141
    new-instance v4, La0/o;

    invoke-direct {v4}, La0/o;-><init>()V

    .line 142
    invoke-virtual {v3}, Ll0/g;->a()Ljava/lang/String;

    move-result-object v5

    .line 143
    iput-object v5, v4, La0/o;->a:Ljava/lang/String;

    .line 144
    invoke-static {v12}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, La0/o;->m:Ljava/lang/String;

    .line 145
    new-instance v5, La0/p;

    invoke-direct {v5, v4}, La0/p;-><init>(La0/o;)V

    .line 146
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ll0/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 147
    new-instance v4, La0/V;

    filled-new-array {v5}, [La0/p;

    move-result-object v5

    invoke-direct {v4, v3, v5}, La0/V;-><init>(Ljava/lang/String;[La0/p;)V

    aput-object v4, v7, v11

    const/4 v3, 0x1

    add-int/lit8 v4, v11, 0x1

    .line 148
    new-instance v3, Lk0/a;

    const/4 v5, 0x0

    new-array v6, v5, [I

    .line 149
    sget-object v8, Lm2/I;->m:Lm2/G;

    .line 150
    sget-object v8, Lm2/b0;->p:Lm2/b0;

    const/4 v9, 0x2

    const/4 v10, -0x1

    const/4 v13, 0x5

    const/4 v14, -0x1

    const/4 v15, -0x1

    move-object/from16 p5, v3

    move/from16 p6, v13

    move/from16 p7, v9

    move-object/from16 p8, v6

    move/from16 p9, v10

    move/from16 p10, v14

    move/from16 p11, v15

    move/from16 p12, v1

    move-object/from16 p13, v8

    .line 151
    invoke-direct/range {p5 .. p13}, Lk0/a;-><init>(II[IIIIILm2/b0;)V

    .line 152
    aput-object v3, v0, v11

    const/4 v3, 0x1

    add-int/2addr v1, v3

    move v11, v4

    goto :goto_14

    .line 153
    :cond_19
    new-instance v1, Lx0/q0;

    invoke-direct {v1, v7}, Lx0/q0;-><init>([La0/V;)V

    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 154
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lx0/q0;

    move-object/from16 v2, p0

    iput-object v1, v2, Lk0/b;->u:Lx0/q0;

    .line 155
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [Lk0/a;

    iput-object v0, v2, Lk0/b;->v:[Lk0/a;

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/util/List;)Ll0/f;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ll0/f;

    .line 13
    .line 14
    iget-object v2, v1, Ll0/f;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method public static j(LD0/d;[La0/p;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_2

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    iget-object v2, p0, LD0/d;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La0/m;

    .line 10
    .line 11
    iget-boolean v3, v2, La0/m;->a:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v3, v2, La0/m;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La0/z;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, La0/z;->supportsFormat(La0/p;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, La0/p;->a()La0/o;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "application/x-media3-cues"

    .line 30
    .line 31
    invoke-static {v4}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iput-object v4, v3, La0/o;->m:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, v2, La0/m;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La0/z;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, La0/z;->d(La0/p;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iput v2, v3, La0/o;->H:I

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v4, v1, La0/p;->n:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, v1, La0/p;->k:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    const-string v4, " "

    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    const-string v1, ""

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v3, La0/o;->j:Ljava/lang/String;

    .line 78
    .line 79
    const-wide v1, 0x7fffffffffffffffL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide v1, v3, La0/o;->r:J

    .line 85
    .line 86
    new-instance v1, La0/p;

    .line 87
    .line 88
    invoke-direct {v1, v3}, La0/p;-><init>(La0/o;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    aput-object v1, p1, v0

    .line 92
    .line 93
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-void
.end method

.method public static k(Ll0/f;Ljava/util/regex/Pattern;La0/p;)[La0/p;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Ll0/f;->b:Ljava/lang/String;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    filled-new-array {p2}, [La0/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget v1, Ld0/w;->a:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, ";"

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    array-length v1, p0

    .line 21
    new-array v1, v1, [La0/p;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    array-length v3, p0

    .line 25
    if-ge v2, v3, :cond_2

    .line 26
    .line 27
    aget-object v3, p0, v2

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    filled-new-array {p2}, [La0/p;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {p2}, La0/p;->a()La0/o;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v7, p2, La0/p;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v7, ":"

    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    iput-object v6, v5, La0/o;->a:Ljava/lang/String;

    .line 79
    .line 80
    iput v4, v5, La0/o;->G:I

    .line 81
    .line 82
    const/4 v4, 0x2

    .line 83
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, v5, La0/o;->d:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v3, La0/p;

    .line 90
    .line 91
    invoke-direct {v3, v5}, La0/p;-><init>(La0/o;)V

    .line 92
    .line 93
    .line 94
    aput-object v3, v1, v2

    .line 95
    .line 96
    add-int/2addr v2, v0

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    return-object v1
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


# virtual methods
.method public final b(JLh0/t0;)J
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/b;->C:[Ly0/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Ly0/h;->l:I

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    iget-object v0, v3, Ly0/h;->p:Ly0/i;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Ly0/i;->b(JLh0/t0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-wide p1
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

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b;->E:Lx0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/m;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final d(Lx0/h0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk0/b;->B:Lx0/E;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lx0/g0;->d(Lx0/h0;)V

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

.method public final e()Lx0/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b;->u:Lx0/q0;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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

.method public final f([LA0/w;[Z[Lx0/f0;[ZJ)J
    .locals 39

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v14, p3

    .line 6
    .line 7
    move-wide/from16 v12, p5

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    new-array v11, v1, [I

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    move v1, v10

    .line 14
    :goto_0
    array-length v2, v0

    .line 15
    const/4 v8, -0x1

    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    aget-object v2, v0, v1

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-object v3, v15, Lk0/b;->u:Lx0/q0;

    .line 23
    .line 24
    invoke-interface {v2}, LA0/w;->b()La0/V;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v3, v2}, Lx0/q0;->b(La0/V;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    aput v2, v11, v1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    aput v8, v11, v1

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v10

    .line 41
    :goto_2
    array-length v2, v0

    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    if-ge v1, v2, :cond_6

    .line 45
    .line 46
    aget-object v2, v0, v1

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    aget-boolean v2, p2, v1

    .line 51
    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    :cond_2
    aget-object v2, v14, v1

    .line 55
    .line 56
    instance-of v3, v2, Ly0/h;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    check-cast v2, Ly0/h;

    .line 61
    .line 62
    invoke-virtual {v2, v15}, Ly0/h;->A(Lk0/b;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    instance-of v3, v2, Ly0/g;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    check-cast v2, Ly0/g;

    .line 71
    .line 72
    invoke-virtual {v2}, Ly0/g;->c()V

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_3
    aput-object v16, v14, v1

    .line 76
    .line 77
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_6
    move v1, v10

    .line 81
    :goto_4
    array-length v2, v0

    .line 82
    const/4 v9, 0x1

    .line 83
    if-ge v1, v2, :cond_c

    .line 84
    .line 85
    aget-object v2, v14, v1

    .line 86
    .line 87
    instance-of v3, v2, Lx0/w;

    .line 88
    .line 89
    if-nez v3, :cond_7

    .line 90
    .line 91
    instance-of v2, v2, Ly0/g;

    .line 92
    .line 93
    if-eqz v2, :cond_b

    .line 94
    .line 95
    :cond_7
    invoke-virtual {v15, v11, v1}, Lk0/b;->i([II)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ne v2, v8, :cond_8

    .line 100
    .line 101
    aget-object v2, v14, v1

    .line 102
    .line 103
    instance-of v2, v2, Lx0/w;

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_8
    aget-object v3, v14, v1

    .line 107
    .line 108
    instance-of v4, v3, Ly0/g;

    .line 109
    .line 110
    if-eqz v4, :cond_9

    .line 111
    .line 112
    check-cast v3, Ly0/g;

    .line 113
    .line 114
    iget-object v3, v3, Ly0/g;->l:Ly0/h;

    .line 115
    .line 116
    aget-object v2, v14, v2

    .line 117
    .line 118
    if-ne v3, v2, :cond_9

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_9
    move v9, v10

    .line 122
    :goto_5
    move v2, v9

    .line 123
    :goto_6
    if-nez v2, :cond_b

    .line 124
    .line 125
    aget-object v2, v14, v1

    .line 126
    .line 127
    instance-of v3, v2, Ly0/g;

    .line 128
    .line 129
    if-eqz v3, :cond_a

    .line 130
    .line 131
    check-cast v2, Ly0/g;

    .line 132
    .line 133
    invoke-virtual {v2}, Ly0/g;->c()V

    .line 134
    .line 135
    .line 136
    :cond_a
    aput-object v16, v14, v1

    .line 137
    .line 138
    :cond_b
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_c
    move v7, v10

    .line 142
    :goto_7
    array-length v1, v0

    .line 143
    if-ge v7, v1, :cond_19

    .line 144
    .line 145
    aget-object v1, v0, v7

    .line 146
    .line 147
    if-nez v1, :cond_d

    .line 148
    .line 149
    move/from16 v33, v7

    .line 150
    .line 151
    move v3, v10

    .line 152
    move-object/from16 v37, v11

    .line 153
    .line 154
    move-object v0, v14

    .line 155
    goto/16 :goto_e

    .line 156
    .line 157
    :cond_d
    aget-object v2, v14, v7

    .line 158
    .line 159
    if-nez v2, :cond_17

    .line 160
    .line 161
    aput-boolean v9, p4, v7

    .line 162
    .line 163
    aget v2, v11, v7

    .line 164
    .line 165
    iget-object v3, v15, Lk0/b;->v:[Lk0/a;

    .line 166
    .line 167
    aget-object v2, v3, v2

    .line 168
    .line 169
    iget v3, v2, Lk0/a;->c:I

    .line 170
    .line 171
    if-nez v3, :cond_16

    .line 172
    .line 173
    iget v3, v2, Lk0/a;->f:I

    .line 174
    .line 175
    if-eq v3, v8, :cond_e

    .line 176
    .line 177
    move/from16 v30, v9

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_e
    move/from16 v30, v10

    .line 181
    .line 182
    :goto_8
    if-eqz v30, :cond_f

    .line 183
    .line 184
    iget-object v4, v15, Lk0/b;->u:Lx0/q0;

    .line 185
    .line 186
    invoke-virtual {v4, v3}, Lx0/q0;->a(I)La0/V;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    move v4, v9

    .line 191
    goto :goto_9

    .line 192
    :cond_f
    move v4, v10

    .line 193
    move-object/from16 v3, v16

    .line 194
    .line 195
    :goto_9
    iget v5, v2, Lk0/a;->g:I

    .line 196
    .line 197
    if-eq v5, v8, :cond_10

    .line 198
    .line 199
    iget-object v6, v15, Lk0/b;->v:[Lk0/a;

    .line 200
    .line 201
    aget-object v5, v6, v5

    .line 202
    .line 203
    iget-object v5, v5, Lk0/a;->h:Lm2/b0;

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_10
    invoke-static {}, Lm2/I;->s()Lm2/b0;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    :goto_a
    invoke-virtual {v5}, Lm2/b0;->size()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    add-int/2addr v6, v4

    .line 215
    new-array v4, v6, [La0/p;

    .line 216
    .line 217
    new-array v6, v6, [I

    .line 218
    .line 219
    if-eqz v30, :cond_11

    .line 220
    .line 221
    invoke-virtual {v3, v10}, La0/V;->a(I)La0/p;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    aput-object v3, v4, v10

    .line 226
    .line 227
    const/4 v3, 0x5

    .line 228
    aput v3, v6, v10

    .line 229
    .line 230
    move v3, v9

    .line 231
    goto :goto_b

    .line 232
    :cond_11
    move v3, v10

    .line 233
    :goto_b
    new-instance v8, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    :goto_c
    invoke-virtual {v5}, Lm2/b0;->size()I

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    if-ge v10, v9, :cond_12

    .line 243
    .line 244
    invoke-virtual {v5, v10}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    check-cast v9, La0/p;

    .line 249
    .line 250
    aput-object v9, v4, v3

    .line 251
    .line 252
    const/16 v17, 0x3

    .line 253
    .line 254
    aput v17, v6, v3

    .line 255
    .line 256
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    const/4 v9, 0x1

    .line 260
    add-int/2addr v3, v9

    .line 261
    add-int/lit8 v10, v10, 0x1

    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_12
    const/4 v9, 0x1

    .line 265
    iget-object v3, v15, Lk0/b;->F:Ll0/c;

    .line 266
    .line 267
    iget-boolean v3, v3, Ll0/c;->d:Z

    .line 268
    .line 269
    if-eqz v3, :cond_13

    .line 270
    .line 271
    if-eqz v30, :cond_13

    .line 272
    .line 273
    iget-object v3, v15, Lk0/b;->x:Lk0/o;

    .line 274
    .line 275
    new-instance v5, Lk0/n;

    .line 276
    .line 277
    iget-object v10, v3, Lk0/o;->l:LB0/f;

    .line 278
    .line 279
    invoke-direct {v5, v3, v10}, Lk0/n;-><init>(Lk0/o;LB0/f;)V

    .line 280
    .line 281
    .line 282
    move-object v10, v5

    .line 283
    goto :goto_d

    .line 284
    :cond_13
    move-object/from16 v10, v16

    .line 285
    .line 286
    :goto_d
    iget-object v3, v15, Lk0/b;->m:LD0/d;

    .line 287
    .line 288
    iget-object v5, v15, Lk0/b;->s:LB0/s;

    .line 289
    .line 290
    iget-object v9, v15, Lk0/b;->F:Ll0/c;

    .line 291
    .line 292
    move/from16 v33, v7

    .line 293
    .line 294
    iget-object v7, v15, Lk0/b;->q:LZ1/i;

    .line 295
    .line 296
    move-object/from16 v34, v11

    .line 297
    .line 298
    iget v11, v15, Lk0/b;->G:I

    .line 299
    .line 300
    iget-object v12, v2, Lk0/a;->a:[I

    .line 301
    .line 302
    iget v13, v2, Lk0/a;->b:I

    .line 303
    .line 304
    move/from16 v25, v13

    .line 305
    .line 306
    iget-wide v13, v15, Lk0/b;->r:J

    .line 307
    .line 308
    iget-object v0, v15, Lk0/b;->n:Lf0/A;

    .line 309
    .line 310
    move-object/from16 v35, v4

    .line 311
    .line 312
    iget-object v4, v3, LD0/d;->m:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v4, Lf0/g;

    .line 315
    .line 316
    invoke-interface {v4}, Lf0/g;->a()Lf0/h;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    if-eqz v0, :cond_14

    .line 321
    .line 322
    invoke-interface {v4, v0}, Lf0/h;->b(Lf0/A;)V

    .line 323
    .line 324
    .line 325
    :cond_14
    new-instance v0, Lk0/k;

    .line 326
    .line 327
    move-object/from16 v36, v6

    .line 328
    .line 329
    iget-object v6, v3, LD0/d;->n:Ljava/lang/Object;

    .line 330
    .line 331
    move-object/from16 v18, v6

    .line 332
    .line 333
    check-cast v18, La0/m;

    .line 334
    .line 335
    iget v3, v3, LD0/d;->l:I

    .line 336
    .line 337
    move-object/from16 v17, v0

    .line 338
    .line 339
    move-object/from16 v19, v5

    .line 340
    .line 341
    move-object/from16 v20, v9

    .line 342
    .line 343
    move-object/from16 v21, v7

    .line 344
    .line 345
    move/from16 v22, v11

    .line 346
    .line 347
    move-object/from16 v23, v12

    .line 348
    .line 349
    move-object/from16 v24, v1

    .line 350
    .line 351
    move-object/from16 v26, v4

    .line 352
    .line 353
    move-wide/from16 v27, v13

    .line 354
    .line 355
    move/from16 v29, v3

    .line 356
    .line 357
    move-object/from16 v31, v8

    .line 358
    .line 359
    move-object/from16 v32, v10

    .line 360
    .line 361
    invoke-direct/range {v17 .. v32}, Lk0/k;-><init>(La0/m;LB0/s;Ll0/c;LZ1/i;I[ILA0/w;ILf0/h;JIZLjava/util/ArrayList;Lk0/n;)V

    .line 362
    .line 363
    .line 364
    new-instance v14, Ly0/h;

    .line 365
    .line 366
    iget v2, v2, Lk0/a;->b:I

    .line 367
    .line 368
    iget-object v7, v15, Lk0/b;->t:LB0/f;

    .line 369
    .line 370
    iget-object v11, v15, Lk0/b;->o:Lm0/i;

    .line 371
    .line 372
    iget-object v12, v15, Lk0/b;->A:Lm0/e;

    .line 373
    .line 374
    iget-object v13, v15, Lk0/b;->p:LA0/b;

    .line 375
    .line 376
    iget-object v8, v15, Lk0/b;->z:Lm0/e;

    .line 377
    .line 378
    iget-boolean v9, v15, Lk0/b;->I:Z

    .line 379
    .line 380
    move-object v1, v14

    .line 381
    move-object/from16 v3, v36

    .line 382
    .line 383
    move-object/from16 v4, v35

    .line 384
    .line 385
    move-object v5, v0

    .line 386
    move-object/from16 v6, p0

    .line 387
    .line 388
    move/from16 v0, v33

    .line 389
    .line 390
    move-object/from16 v17, v8

    .line 391
    .line 392
    move/from16 v18, v9

    .line 393
    .line 394
    move-wide/from16 v8, p5

    .line 395
    .line 396
    move-object v0, v10

    .line 397
    move-object v10, v11

    .line 398
    move-object/from16 v37, v34

    .line 399
    .line 400
    move-object v11, v12

    .line 401
    move-object v12, v13

    .line 402
    move-object/from16 v13, v17

    .line 403
    .line 404
    move-object/from16 v38, v14

    .line 405
    .line 406
    move/from16 v14, v18

    .line 407
    .line 408
    invoke-direct/range {v1 .. v14}, Ly0/h;-><init>(I[I[La0/p;Ly0/i;Lx0/g0;LB0/f;JLm0/i;Lm0/e;LA0/b;Lm0/e;Z)V

    .line 409
    .line 410
    .line 411
    monitor-enter p0

    .line 412
    :try_start_0
    iget-object v1, v15, Lk0/b;->y:Ljava/util/IdentityHashMap;

    .line 413
    .line 414
    move-object/from16 v2, v38

    .line 415
    .line 416
    invoke-virtual {v1, v2, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    move-object/from16 v0, p3

    .line 421
    .line 422
    aput-object v2, v0, v33

    .line 423
    .line 424
    :cond_15
    const/4 v3, 0x0

    .line 425
    goto :goto_e

    .line 426
    :catchall_0
    move-exception v0

    .line 427
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    throw v0

    .line 429
    :cond_16
    move/from16 v33, v7

    .line 430
    .line 431
    move-object/from16 v37, v11

    .line 432
    .line 433
    move-object v0, v14

    .line 434
    const/4 v4, 0x2

    .line 435
    if-ne v3, v4, :cond_15

    .line 436
    .line 437
    iget-object v3, v15, Lk0/b;->H:Ljava/util/List;

    .line 438
    .line 439
    iget v2, v2, Lk0/a;->d:I

    .line 440
    .line 441
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Ll0/g;

    .line 446
    .line 447
    invoke-interface {v1}, LA0/w;->b()La0/V;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    const/4 v3, 0x0

    .line 452
    invoke-virtual {v1, v3}, La0/V;->a(I)La0/p;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    new-instance v4, Lk0/l;

    .line 457
    .line 458
    iget-object v5, v15, Lk0/b;->F:Ll0/c;

    .line 459
    .line 460
    iget-boolean v5, v5, Ll0/c;->d:Z

    .line 461
    .line 462
    invoke-direct {v4, v2, v1, v5}, Lk0/l;-><init>(Ll0/g;La0/p;Z)V

    .line 463
    .line 464
    .line 465
    aput-object v4, v0, v33

    .line 466
    .line 467
    goto :goto_e

    .line 468
    :cond_17
    move/from16 v33, v7

    .line 469
    .line 470
    move v3, v10

    .line 471
    move-object/from16 v37, v11

    .line 472
    .line 473
    move-object v0, v14

    .line 474
    instance-of v4, v2, Ly0/h;

    .line 475
    .line 476
    if-eqz v4, :cond_18

    .line 477
    .line 478
    check-cast v2, Ly0/h;

    .line 479
    .line 480
    iget-object v2, v2, Ly0/h;->p:Ly0/i;

    .line 481
    .line 482
    check-cast v2, Lk0/k;

    .line 483
    .line 484
    iput-object v1, v2, Lk0/k;->j:LA0/w;

    .line 485
    .line 486
    :cond_18
    :goto_e
    add-int/lit8 v7, v33, 0x1

    .line 487
    .line 488
    move-wide/from16 v12, p5

    .line 489
    .line 490
    move-object v14, v0

    .line 491
    move v10, v3

    .line 492
    move-object/from16 v11, v37

    .line 493
    .line 494
    const/4 v8, -0x1

    .line 495
    const/4 v9, 0x1

    .line 496
    move-object/from16 v0, p1

    .line 497
    .line 498
    goto/16 :goto_7

    .line 499
    .line 500
    :cond_19
    move v3, v10

    .line 501
    move-object/from16 v37, v11

    .line 502
    .line 503
    move-object v0, v14

    .line 504
    move-object/from16 v1, p1

    .line 505
    .line 506
    :goto_f
    array-length v2, v1

    .line 507
    if-ge v10, v2, :cond_1f

    .line 508
    .line 509
    aget-object v2, v0, v10

    .line 510
    .line 511
    if-nez v2, :cond_1e

    .line 512
    .line 513
    aget-object v2, v1, v10

    .line 514
    .line 515
    if-eqz v2, :cond_1e

    .line 516
    .line 517
    move-object/from16 v2, v37

    .line 518
    .line 519
    aget v4, v2, v10

    .line 520
    .line 521
    iget-object v5, v15, Lk0/b;->v:[Lk0/a;

    .line 522
    .line 523
    aget-object v4, v5, v4

    .line 524
    .line 525
    iget v5, v4, Lk0/a;->c:I

    .line 526
    .line 527
    const/4 v6, 0x1

    .line 528
    if-ne v5, v6, :cond_1d

    .line 529
    .line 530
    invoke-virtual {v15, v2, v10}, Lk0/b;->i([II)I

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    const/4 v7, -0x1

    .line 535
    if-ne v5, v7, :cond_1a

    .line 536
    .line 537
    new-instance v4, Lx0/w;

    .line 538
    .line 539
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    aput-object v4, v0, v10

    .line 543
    .line 544
    move-wide/from16 v13, p5

    .line 545
    .line 546
    goto :goto_12

    .line 547
    :cond_1a
    aget-object v5, v0, v5

    .line 548
    .line 549
    check-cast v5, Ly0/h;

    .line 550
    .line 551
    iget v4, v4, Lk0/a;->b:I

    .line 552
    .line 553
    const/4 v8, 0x0

    .line 554
    :goto_10
    iget-object v9, v5, Ly0/h;->y:[Lx0/e0;

    .line 555
    .line 556
    array-length v11, v9

    .line 557
    if-ge v8, v11, :cond_1c

    .line 558
    .line 559
    iget-object v11, v5, Ly0/h;->m:[I

    .line 560
    .line 561
    aget v11, v11, v8

    .line 562
    .line 563
    if-ne v11, v4, :cond_1b

    .line 564
    .line 565
    iget-object v4, v5, Ly0/h;->o:[Z

    .line 566
    .line 567
    aget-boolean v11, v4, v8

    .line 568
    .line 569
    const/4 v12, 0x1

    .line 570
    xor-int/2addr v11, v12

    .line 571
    invoke-static {v11}, Ld0/m;->h(Z)V

    .line 572
    .line 573
    .line 574
    aput-boolean v12, v4, v8

    .line 575
    .line 576
    aget-object v4, v9, v8

    .line 577
    .line 578
    move-wide/from16 v13, p5

    .line 579
    .line 580
    invoke-virtual {v4, v13, v14, v12}, Lx0/e0;->B(JZ)Z

    .line 581
    .line 582
    .line 583
    new-instance v4, Ly0/g;

    .line 584
    .line 585
    aget-object v9, v9, v8

    .line 586
    .line 587
    invoke-direct {v4, v5, v5, v9, v8}, Ly0/g;-><init>(Ly0/h;Ly0/h;Lx0/e0;I)V

    .line 588
    .line 589
    .line 590
    aput-object v4, v0, v10

    .line 591
    .line 592
    goto :goto_12

    .line 593
    :cond_1b
    move-wide/from16 v13, p5

    .line 594
    .line 595
    add-int/lit8 v8, v8, 0x1

    .line 596
    .line 597
    goto :goto_10

    .line 598
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 599
    .line 600
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 601
    .line 602
    .line 603
    throw v0

    .line 604
    :cond_1d
    move-wide/from16 v13, p5

    .line 605
    .line 606
    :goto_11
    const/4 v7, -0x1

    .line 607
    goto :goto_12

    .line 608
    :cond_1e
    move-wide/from16 v13, p5

    .line 609
    .line 610
    move-object/from16 v2, v37

    .line 611
    .line 612
    const/4 v6, 0x1

    .line 613
    goto :goto_11

    .line 614
    :goto_12
    add-int/lit8 v10, v10, 0x1

    .line 615
    .line 616
    move-object/from16 v37, v2

    .line 617
    .line 618
    goto :goto_f

    .line 619
    :cond_1f
    move-wide/from16 v13, p5

    .line 620
    .line 621
    new-instance v1, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 624
    .line 625
    .line 626
    new-instance v2, Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 629
    .line 630
    .line 631
    array-length v4, v0

    .line 632
    move v10, v3

    .line 633
    :goto_13
    if-ge v10, v4, :cond_22

    .line 634
    .line 635
    aget-object v5, v0, v10

    .line 636
    .line 637
    instance-of v6, v5, Ly0/h;

    .line 638
    .line 639
    if-eqz v6, :cond_20

    .line 640
    .line 641
    check-cast v5, Ly0/h;

    .line 642
    .line 643
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    goto :goto_14

    .line 647
    :cond_20
    instance-of v6, v5, Lk0/l;

    .line 648
    .line 649
    if-eqz v6, :cond_21

    .line 650
    .line 651
    check-cast v5, Lk0/l;

    .line 652
    .line 653
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    :cond_21
    :goto_14
    add-int/lit8 v10, v10, 0x1

    .line 657
    .line 658
    goto :goto_13

    .line 659
    :cond_22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    new-array v0, v0, [Ly0/h;

    .line 664
    .line 665
    iput-object v0, v15, Lk0/b;->C:[Ly0/h;

    .line 666
    .line 667
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    new-array v0, v0, [Lk0/l;

    .line 675
    .line 676
    iput-object v0, v15, Lk0/b;->D:[Lk0/l;

    .line 677
    .line 678
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    iget-object v0, v15, Lk0/b;->w:Lp1/b;

    .line 682
    .line 683
    new-instance v2, Li0/b;

    .line 684
    .line 685
    const/16 v4, 0x15

    .line 686
    .line 687
    invoke-direct {v2, v4}, Li0/b;-><init>(I)V

    .line 688
    .line 689
    .line 690
    invoke-static {v1, v2}, Lm2/r;->w(Ljava/util/List;Ll2/d;)Ljava/util/AbstractList;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    new-instance v0, Lx0/m;

    .line 698
    .line 699
    invoke-direct {v0, v1, v2}, Lx0/m;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 700
    .line 701
    .line 702
    iput-object v0, v15, Lk0/b;->E:Lx0/m;

    .line 703
    .line 704
    iget-boolean v0, v15, Lk0/b;->I:Z

    .line 705
    .line 706
    if-eqz v0, :cond_23

    .line 707
    .line 708
    iput-boolean v3, v15, Lk0/b;->I:Z

    .line 709
    .line 710
    iput-wide v13, v15, Lk0/b;->J:J

    .line 711
    .line 712
    :cond_23
    return-wide v13
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/b;->E:Lx0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/m;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public final i([II)I
    .locals 4

    .line 1
    aget p2, p1, p2

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v1, p0, Lk0/b;->v:[Lk0/a;

    .line 8
    .line 9
    aget-object p2, v1, p2

    .line 10
    .line 11
    iget p2, p2, Lk0/a;->e:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    array-length v3, p1

    .line 15
    if-ge v2, v3, :cond_2

    .line 16
    .line 17
    aget v3, p1, v2

    .line 18
    .line 19
    if-ne v3, p2, :cond_1

    .line 20
    .line 21
    aget-object v3, v1, v3

    .line 22
    .line 23
    iget v3, v3, Lk0/a;->c:I

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0
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

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b;->s:LB0/s;

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

.method public final o(J)J
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/b;->C:[Ly0/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2}, Ly0/h;->B(J)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lk0/b;->D:[Lk0/l;

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    :goto_1
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    iget-object v4, v3, Lk0/l;->n:[J

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v4, p1, p2, v5}, Ld0/w;->a([JJZ)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iput v4, v3, Lk0/l;->r:I

    .line 31
    .line 32
    iget-boolean v5, v3, Lk0/l;->o:Z

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v5, v3, Lk0/l;->n:[J

    .line 37
    .line 38
    array-length v5, v5

    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    move-wide v4, p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    :goto_2
    iput-wide v4, v3, Lk0/l;->s:J

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-wide p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final p(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/b;->C:[Ly0/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Ly0/h;->p(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public final r()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/b;->E:Lx0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/m;->r()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public final s()J
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/b;->C:[Ly0/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-boolean v5, v4, Ly0/h;->I:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iput-boolean v2, v4, Ly0/h;->I:Z

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget-wide v0, p0, Lk0/b;->J:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    iput-boolean v2, v4, Ly0/h;->I:Z

    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    return-wide v0
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

.method public final t(Lx0/E;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/b;->B:Lx0/E;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lx0/E;->a(Lx0/F;)V

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

.method public final u(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b;->E:Lx0/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx0/m;->u(J)V

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

.method public final v(Lh0/T;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b;->E:Lx0/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/m;->v(Lh0/T;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
