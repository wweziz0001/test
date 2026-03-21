.class public final LZ1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU2/d;
.implements Lc1/l;


# instance fields
.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    sparse-switch p1, :sswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 9
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->o:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_1
    new-instance p1, La0/z;

    const/16 v0, 0x14

    .line 11
    invoke-direct {p1, v0}, La0/z;-><init>(I)V

    .line 12
    new-instance v0, La0/z;

    const/16 v1, 0x13

    .line 13
    invoke-direct {v0, v1}, La0/z;-><init>(I)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 16
    iput-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 17
    iput-object v0, p0, LZ1/i;->n:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_2
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 21
    iput-object p1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 22
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 23
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ld0/p;

    invoke-direct {p1}, Ld0/p;-><init>()V

    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 26
    new-instance p1, Ld0/p;

    invoke-direct {p1}, Ld0/p;-><init>()V

    iput-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 27
    new-instance p1, Lf1/a;

    invoke-direct {p1}, Lf1/a;-><init>()V

    iput-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_3
        0xb -> :sswitch_2
        0xc -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;LR/b;)V
    .locals 5

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 48
    iput-object p2, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 49
    new-instance p1, LQ/t;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, LQ/t;-><init>(I)V

    iput-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 50
    invoke-virtual {p2, p1}, LD/w;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 51
    iget v2, p2, LD/w;->l:I

    add-int/2addr v0, v2

    .line 52
    iget-object v2, p2, LD/w;->o:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 53
    iget-object v0, p2, LD/w;->o:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 54
    new-array v0, v0, [C

    iput-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 55
    invoke-virtual {p2, p1}, LD/w;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 56
    iget v0, p2, LD/w;->l:I

    add-int/2addr p1, v0

    .line 57
    iget-object v0, p2, LD/w;->o:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 58
    iget-object p1, p2, LD/w;->o:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_5

    .line 59
    new-instance v0, LQ/p;

    invoke-direct {v0, p0, p2}, LQ/p;-><init>(LZ1/i;I)V

    .line 60
    invoke-virtual {v0}, LQ/p;->c()LR/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 61
    invoke-virtual {v2, v3}, LD/w;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, LD/w;->o:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, LD/w;->l:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    mul-int/lit8 v3, p2, 0x2

    .line 62
    iget-object v4, p0, LZ1/i;->m:Ljava/lang/Object;

    check-cast v4, [C

    invoke-static {v2, v4, v3}, Ljava/lang/Character;->toChars(I[CI)I

    .line 63
    invoke-virtual {v0}, LQ/p;->b()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    if-eqz v2, :cond_4

    .line 64
    invoke-virtual {v0}, LQ/p;->b()I

    move-result v2

    sub-int/2addr v2, v3

    iget-object v3, p0, LZ1/i;->n:Ljava/lang/Object;

    check-cast v3, LQ/t;

    invoke-virtual {v3, v0, v1, v2}, LQ/t;->a(LQ/p;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 65
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid metadata codepoint length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method

.method public constructor <init>(Lm2/b0;LZ1/e;LZ1/l;LZ1/c;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 67
    invoke-static {p1}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lm2/I;->m:Lm2/G;

    .line 68
    sget-object p1, Lm2/b0;->p:Lm2/b0;

    .line 69
    :goto_0
    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 70
    iput-object p2, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 71
    iput-object p3, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 72
    iput-object p4, p0, LZ1/i;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 44
    iput-object p3, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 45
    iput-object p4, p0, LZ1/i;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly2/r;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    iget-object v1, p1, Ly2/r;->a:Ljava/util/HashMap;

    .line 31
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 32
    new-instance v0, Ljava/util/HashMap;

    .line 33
    iget-object v1, p1, Ly2/r;->b:Ljava/util/HashMap;

    .line 34
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    iget-object v1, p1, Ly2/r;->c:Ljava/util/HashMap;

    .line 37
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    .line 39
    iget-object p1, p1, Ly2/r;->d:Ljava/util/HashMap;

    .line 40
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LZ1/i;->o:Ljava/lang/Object;

    return-void
.end method

.method public static A(JLjava/util/HashMap;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    cmp-long v3, v3, p0

    .line 37
    .line 38
    if-gtz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-ge p0, p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    add-int/lit8 p0, p0, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return-void
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
.method public B(LG3/b;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, LL/U;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LL/U;

    .line 7
    .line 8
    iget v1, v0, LL/U;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LL/U;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LL/U;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LL/U;-><init>(LZ1/i;LG3/b;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LL/U;->q:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF3/a;->l:LF3/a;

    .line 28
    .line 29
    iget v2, v0, LL/U;->s:I

    .line 30
    .line 31
    sget-object v3, LB3/g;->a:LB3/g;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, LL/U;->p:Ld4/a;

    .line 43
    .line 44
    iget-object v0, v0, LL/U;->o:LZ1/i;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object v2, v0, LL/U;->p:Ld4/a;

    .line 61
    .line 62
    iget-object v5, v0, LL/U;->o:LZ1/i;

    .line 63
    .line 64
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object p1, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, LV3/l;

    .line 75
    .line 76
    invoke-virtual {p1}, LV3/Z;->F()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    instance-of p1, p1, LV3/L;

    .line 81
    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    return-object v3

    .line 85
    :cond_4
    iput-object p0, v0, LL/U;->o:LZ1/i;

    .line 86
    .line 87
    iget-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Ld4/d;

    .line 90
    .line 91
    iput-object p1, v0, LL/U;->p:Ld4/a;

    .line 92
    .line 93
    iput v5, v0, LL/U;->s:I

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Ld4/d;->c(LG3/b;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-ne v2, v1, :cond_5

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_5
    move-object v5, p0

    .line 103
    :goto_1
    :try_start_1
    iget-object v2, v5, LZ1/i;->m:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, LV3/l;

    .line 106
    .line 107
    invoke-virtual {v2}, LV3/Z;->F()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    instance-of v2, v2, LV3/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    check-cast p1, Ld4/d;

    .line 116
    .line 117
    invoke-virtual {p1, v6}, Ld4/d;->e(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v3

    .line 121
    :cond_6
    :try_start_2
    iput-object v5, v0, LL/U;->o:LZ1/i;

    .line 122
    .line 123
    iput-object p1, v0, LL/U;->p:Ld4/a;

    .line 124
    .line 125
    iput v4, v0, LL/U;->s:I

    .line 126
    .line 127
    invoke-virtual {v5, v0}, LZ1/i;->g(LG3/b;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    if-ne v0, v1, :cond_7

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_7
    move-object v1, p1

    .line 135
    move-object v0, v5

    .line 136
    :goto_2
    :try_start_3
    iget-object p1, v0, LZ1/i;->m:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, LV3/l;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, LV3/Z;->L(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    .line 142
    .line 143
    check-cast v1, Ld4/d;

    .line 144
    .line 145
    invoke-virtual {v1, v6}, Ld4/d;->e(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-object v3

    .line 149
    :goto_3
    move-object v1, p1

    .line 150
    move-object p1, v0

    .line 151
    goto :goto_4

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_3

    .line 154
    :goto_4
    check-cast v1, Ld4/d;

    .line 155
    .line 156
    invoke-virtual {v1, v6}, Ld4/d;->e(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    throw p1
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

.method public C(Ljava/util/List;)Ll0/b;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, LZ1/i;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0}, Lm2/r;->k(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ll0/b;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance v0, LA/c;

    .line 21
    .line 22
    const/16 v1, 0xc

    .line 23
    .line 24
    invoke-direct {v0, v1}, LA/c;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ll0/b;

    .line 41
    .line 42
    iget v2, v2, Ll0/b;->c:I

    .line 43
    .line 44
    move v3, v1

    .line 45
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-ge v3, v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ll0/b;

    .line 56
    .line 57
    iget v5, v4, Ll0/b;->c:I

    .line 58
    .line 59
    if-eq v2, v5, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/4 v3, 0x1

    .line 66
    if-ne v2, v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ll0/b;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_1
    new-instance v5, Landroid/util/Pair;

    .line 76
    .line 77
    iget v6, v4, Ll0/b;->d:I

    .line 78
    .line 79
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    iget-object v4, v4, Ll0/b;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v5, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iget-object v2, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ll0/b;

    .line 103
    .line 104
    if-nez v3, :cond_6

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {p1, v1, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    move v3, v1

    .line 115
    move v4, v3

    .line 116
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-ge v3, v5, :cond_3

    .line 121
    .line 122
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ll0/b;

    .line 127
    .line 128
    iget v5, v5, Ll0/b;->d:I

    .line 129
    .line 130
    add-int/2addr v4, v5

    .line 131
    add-int/lit8 v3, v3, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    iget-object v3, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v3, Ljava/util/Random;

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    move v4, v1

    .line 143
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-ge v1, v5, :cond_5

    .line 148
    .line 149
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Ll0/b;

    .line 154
    .line 155
    iget v6, v5, Ll0/b;->d:I

    .line 156
    .line 157
    add-int/2addr v4, v6

    .line 158
    if-ge v3, v4, :cond_4

    .line 159
    .line 160
    move-object v3, v5

    .line 161
    goto :goto_3

    .line 162
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-static {p1}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Ll0/b;

    .line 170
    .line 171
    move-object v3, p1

    .line 172
    :goto_3
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_6
    return-object v3
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

.method public D(Ljava/lang/Object;Ln3/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln3/m;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ln3/m;->b(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ln3/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1, p2}, Ln3/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object p2, v0

    .line 20
    :goto_0
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ln3/f;

    .line 23
    .line 24
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {v0, v1, p1, p2}, Ln3/f;->h(Ljava/lang/String;Ljava/nio/ByteBuffer;Ln3/e;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public E(Ln3/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln3/f;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, La0/z;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, LZ1/c;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v2, p0, p1, v4}, LZ1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {v1, v0, v2, v3}, Ln3/f;->d(Ljava/lang/String;Ln3/d;La0/z;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    if-nez p1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance v2, LZ1/c;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v2, p0, p1, v3}, LZ1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-interface {v1, v0, v2}, Ln3/f;->k(Ljava/lang/String;Ln3/d;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    return-void
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

.method public F(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/os/Bundle;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/os/Bundle;

    .line 19
    .line 20
    return-object p1
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

.method public a(Landroidx/fragment/app/r;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p1, Landroidx/fragment/app/r;->v:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Fragment already added: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
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

.method public b(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    .line 1
    const-string v0, "sqlite_error"

    .line 2
    .line 3
    iput-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p2, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
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

.method public c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, LZ1/i;->A(JLjava/util/HashMap;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {v0, v1, v3}, LZ1/i;->A(JLjava/util/HashMap;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ge v1, v4, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ll0/b;

    .line 36
    .line 37
    iget-object v5, v4, Ll0/b;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    iget v5, v4, Ll0/b;->c:I

    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-object v0
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public d(Ljava/io/Serializable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
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

.method public e()Ls2/f;
    .locals 4

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/k;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LB0/d;

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget-object v2, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, LB0/d;

    .line 16
    .line 17
    if-eqz v2, :cond_9

    .line 18
    .line 19
    iget-object v1, v1, LB0/d;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LF2/a;

    .line 22
    .line 23
    iget-object v1, v1, LF2/a;->a:[B

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    iget v3, v0, Ls2/k;->b:I

    .line 27
    .line 28
    if-ne v3, v1, :cond_8

    .line 29
    .line 30
    iget-object v1, v2, LB0/d;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LF2/a;

    .line 33
    .line 34
    iget-object v1, v1, LF2/a;->a:[B

    .line 35
    .line 36
    array-length v1, v1

    .line 37
    iget v2, v0, Ls2/k;->c:I

    .line 38
    .line 39
    if-ne v2, v1, :cond_7

    .line 40
    .line 41
    sget-object v1, Ls2/j;->j:Ls2/j;

    .line 42
    .line 43
    iget-object v0, v0, Ls2/k;->e:Ls2/j;

    .line 44
    .line 45
    if-eq v0, v1, :cond_1

    .line 46
    .line 47
    iget-object v2, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 55
    .line 56
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object v2, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/Integer;

    .line 68
    .line 69
    if-nez v2, :cond_6

    .line 70
    .line 71
    :goto_1
    const/4 v2, 0x0

    .line 72
    if-ne v0, v1, :cond_3

    .line 73
    .line 74
    new-array v0, v2, [B

    .line 75
    .line 76
    invoke-static {v0}, LF2/a;->a([B)LF2/a;

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    sget-object v1, Ls2/j;->i:Ls2/j;

    .line 81
    .line 82
    const/4 v3, 0x5

    .line 83
    if-ne v0, v1, :cond_4

    .line 84
    .line 85
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, LF2/a;->a([B)LF2/a;

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    sget-object v1, Ls2/j;->h:Ls2/j;

    .line 114
    .line 115
    if-ne v0, v1, :cond_5

    .line 116
    .line 117
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, LF2/a;->a([B)LF2/a;

    .line 143
    .line 144
    .line 145
    :goto_2
    new-instance v0, Ls2/f;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    .line 156
    .line 157
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Ls2/k;

    .line 163
    .line 164
    iget-object v2, v2, Ls2/k;->e:Ls2/j;

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 178
    .line 179
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 186
    .line 187
    const-string v1, "HMAC key size mismatch"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 194
    .line 195
    const-string v1, "AES key size mismatch"

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 202
    .line 203
    const-string v1, "Cannot build without key material"

    .line 204
    .line 205
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 210
    .line 211
    const-string v1, "Cannot build without parameters"

    .line 212
    .line 213
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0
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

.method public f()Lz2/k;
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v1, :cond_e

    .line 12
    .line 13
    iget-object v1, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lz2/d;

    .line 16
    .line 17
    if-eqz v1, :cond_d

    .line 18
    .line 19
    iget-object v1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lz2/d;

    .line 22
    .line 23
    if-eqz v1, :cond_c

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x10

    .line 30
    .line 31
    if-lt v0, v1, :cond_b

    .line 32
    .line 33
    iget-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lz2/d;

    .line 44
    .line 45
    const/16 v3, 0xa

    .line 46
    .line 47
    if-lt v1, v3, :cond_a

    .line 48
    .line 49
    sget-object v3, Lz2/d;->g:Lz2/d;

    .line 50
    .line 51
    if-ne v2, v3, :cond_1

    .line 52
    .line 53
    const/16 v2, 0x14

    .line 54
    .line 55
    if-gt v1, v2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 59
    .line 60
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 65
    .line 66
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_1
    sget-object v3, Lz2/d;->h:Lz2/d;

    .line 75
    .line 76
    if-ne v2, v3, :cond_3

    .line 77
    .line 78
    const/16 v2, 0x1c

    .line 79
    .line 80
    if-gt v1, v2, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 84
    .line 85
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 90
    .line 91
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_3
    sget-object v3, Lz2/d;->i:Lz2/d;

    .line 100
    .line 101
    if-ne v2, v3, :cond_5

    .line 102
    .line 103
    const/16 v2, 0x20

    .line 104
    .line 105
    if-gt v1, v2, :cond_4

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 109
    .line 110
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 115
    .line 116
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v1

    .line 124
    :cond_5
    sget-object v3, Lz2/d;->j:Lz2/d;

    .line 125
    .line 126
    if-ne v2, v3, :cond_7

    .line 127
    .line 128
    const/16 v2, 0x30

    .line 129
    .line 130
    if-gt v1, v2, :cond_6

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 134
    .line 135
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 140
    .line 141
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v1

    .line 149
    :cond_7
    sget-object v3, Lz2/d;->k:Lz2/d;

    .line 150
    .line 151
    if-ne v2, v3, :cond_9

    .line 152
    .line 153
    const/16 v2, 0x40

    .line 154
    .line 155
    if-gt v1, v2, :cond_8

    .line 156
    .line 157
    :goto_0
    new-instance v0, Lz2/k;

    .line 158
    .line 159
    iget-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    iget-object v2, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    iget-object v3, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Lz2/d;

    .line 178
    .line 179
    iget-object v4, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Lz2/d;

    .line 182
    .line 183
    invoke-direct {v0, v1, v2, v3, v4}, Lz2/k;-><init>(IILz2/d;Lz2/d;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 188
    .line 189
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 194
    .line 195
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 204
    .line 205
    const-string v1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    .line 206
    .line 207
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 212
    .line 213
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const-string v2, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 218
    .line 219
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v1

    .line 227
    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 228
    .line 229
    iget-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Ljava/lang/Integer;

    .line 232
    .line 233
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    .line 238
    .line 239
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 248
    .line 249
    const-string v1, "variant is not set"

    .line 250
    .line 251
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 256
    .line 257
    const-string v1, "hash type is not set"

    .line 258
    .line 259
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 264
    .line 265
    const-string v1, "tag size is not set"

    .line 266
    .line 267
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 272
    .line 273
    const-string v1, "key size is not set"

    .line 274
    .line 275
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0
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

.method public g(LG3/b;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LL/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LL/i;

    .line 7
    .line 8
    iget v1, v0, LL/i;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LL/i;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LL/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LL/i;-><init>(LZ1/i;LG3/b;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LL/i;->p:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF3/a;->l:LF3/a;

    .line 28
    .line 29
    iget v2, v0, LL/i;->r:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, LL/i;->o:LZ1/i;

    .line 40
    .line 41
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v0, v0, LL/i;->o:LZ1/i;

    .line 54
    .line 55
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-static {p1}, Li4/a;->Y(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/util/List;

    .line 65
    .line 66
    iget-object v2, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LL/P;

    .line 69
    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {v2}, LL/P;->g()LL/Z;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v4, LL/l;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v4, v2, p0, v5}, LL/l;-><init>(LL/P;LZ1/i;LE3/d;)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v0, LL/i;->o:LZ1/i;

    .line 90
    .line 91
    iput v3, v0, LL/i;->r:I

    .line 92
    .line 93
    invoke-virtual {p1, v4, v0}, LL/Z;->b(LM3/l;LG3/b;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v1, :cond_5

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_5
    move-object v0, p0

    .line 101
    :goto_1
    check-cast p1, LL/c;

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    :goto_2
    iput-object p0, v0, LL/i;->o:LZ1/i;

    .line 105
    .line 106
    iput v4, v0, LL/i;->r:I

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    invoke-static {v2, p1, v0}, LL/P;->f(LL/P;ZLG3/b;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v1, :cond_7

    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_7
    move-object v0, p0

    .line 117
    :goto_3
    check-cast p1, LL/c;

    .line 118
    .line 119
    :goto_4
    iget-object v0, v0, LZ1/i;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, LL/P;

    .line 122
    .line 123
    iget-object v0, v0, LL/P;->s:LB0/d;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, LB0/d;->u(LL/a0;)V

    .line 126
    .line 127
    .line 128
    sget-object p1, LB3/g;->a:LB3/g;

    .line 129
    .line 130
    return-object p1
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

.method public h(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/p;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La2/p;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public i(Ljava/lang/String;)Landroidx/fragment/app/r;
    .locals 1

    .line 1
    iget-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/fragment/app/T;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
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

.method public j(Ljava/lang/String;)Landroidx/fragment/app/r;
    .locals 3

    .line 1
    iget-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/fragment/app/T;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/r;->p:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/r;->F:Landroidx/fragment/app/M;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/fragment/app/L;->c:LZ1/i;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, LZ1/i;->j(Ljava/lang/String;)Landroidx/fragment/app/r;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return-object p1
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

.method public k()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/fragment/app/T;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
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

.method public l()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/fragment/app/T;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public m()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v2, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-object v1

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1
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

.method public n(LZ1/j;)LZ1/g;
    .locals 6

    .line 1
    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ls1/j;->c(Ljava/lang/String;I)Ls1/j;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p1, LZ1/j;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ls1/j;->g(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, v2, v3}, Ls1/j;->h(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget p1, p1, LZ1/j;->b:I

    .line 21
    .line 22
    int-to-long v2, p1

    .line 23
    invoke-virtual {v0, v2, v3, v1}, Ls1/j;->m(JI)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {p1, v0, v1}, LQ1/C;->l0(Landroidx/work/impl/WorkDatabase;Ls1/j;Z)Landroid/database/Cursor;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :try_start_0
    const-string v1, "work_spec_id"

    .line 39
    .line 40
    invoke-static {p1, v1}, LD1/b;->C(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-string v2, "generation"

    .line 45
    .line 46
    invoke-static {p1, v2}, LD1/b;->C(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v3, "system_id"

    .line 51
    .line 52
    invoke-static {p1, v3}, LD1/b;->C(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x0

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    new-instance v3, LZ1/g;

    .line 83
    .line 84
    invoke-direct {v3, v1, v5, v2}, LZ1/g;-><init>(ILjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    move-object v5, v3

    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception v1

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ls1/j;->f()V

    .line 95
    .line 96
    .line 97
    return-object v5

    .line 98
    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ls1/j;->f()V

    .line 102
    .line 103
    .line 104
    throw v1
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

.method public o()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
    .line 3
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

.method public p(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La0/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "flutter"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    const-string v2, "lib"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
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

.method public q(LZ1/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LZ1/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, LZ1/b;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 27
    .line 28
    .line 29
    throw p1
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

.method public varargs r(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, LB0/l;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lio/flutter/embedding/engine/FlutterJNI;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public s(Landroidx/fragment/app/T;)V
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/r;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/r;->p:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string p1, "FragmentManager"

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "Added fragment to active set "

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
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

.method public t(Landroidx/fragment/app/T;)V
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/r;->M:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroidx/fragment/app/O;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroidx/fragment/app/O;->f(Landroidx/fragment/app/r;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v2, v0, Landroidx/fragment/app/r;->p:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eq v2, p1, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/r;->p:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroidx/fragment/app/T;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string p1, "FragmentManager"

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v2, "Removed fragment from active set "

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public u(Ly2/a;)V
    .locals 3

    .line 1
    new-instance v0, Ly2/p;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Ly2/a;->a:LF2/a;

    .line 7
    .line 8
    const-class v2, Ly2/n;

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Ly2/p;-><init>(Ljava/lang/Class;LF2/a;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LZ1/i;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ly2/a;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public w(Ly2/c;)V
    .locals 3

    .line 1
    new-instance v0, Ly2/q;

    .line 2
    .line 3
    iget-object v1, p1, Ly2/c;->a:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Ly2/n;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ly2/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LZ1/i;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly2/c;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public x([BIILc1/k;Ld0/d;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0x80

    .line 7
    .line 8
    add-int v5, v0, p3

    .line 9
    .line 10
    iget-object v6, v1, LZ1/i;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v6, Ld0/p;

    .line 13
    .line 14
    move-object/from16 v7, p1

    .line 15
    .line 16
    invoke-virtual {v6, v5, v7}, Ld0/p;->F(I[B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v0}, Ld0/p;->H(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v7, 0x2

    .line 28
    if-lez v0, :cond_8

    .line 29
    .line 30
    invoke-virtual {v6}, Ld0/p;->f()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v8, 0x78

    .line 35
    .line 36
    if-ne v0, v8, :cond_8

    .line 37
    .line 38
    iget-object v0, v1, LZ1/i;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/zip/Inflater;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    new-instance v0, Ljava/util/zip/Inflater;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, v1, LZ1/i;->o:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_0
    iget-object v0, v1, LZ1/i;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/util/zip/Inflater;

    .line 54
    .line 55
    sget v8, Ld0/w;->a:I

    .line 56
    .line 57
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-gtz v8, :cond_1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    iget-object v8, v1, LZ1/i;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v8, Ld0/p;

    .line 67
    .line 68
    iget-object v9, v8, Ld0/p;->a:[B

    .line 69
    .line 70
    array-length v9, v9

    .line 71
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-ge v9, v10, :cond_2

    .line 76
    .line 77
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    mul-int/2addr v9, v7

    .line 82
    invoke-virtual {v8, v9}, Ld0/p;->b(I)V

    .line 83
    .line 84
    .line 85
    :cond_2
    if-nez v0, :cond_3

    .line 86
    .line 87
    new-instance v0, Ljava/util/zip/Inflater;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 90
    .line 91
    .line 92
    :cond_3
    move-object v9, v0

    .line 93
    iget-object v0, v6, Ld0/p;->a:[B

    .line 94
    .line 95
    iget v10, v6, Ld0/p;->b:I

    .line 96
    .line 97
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    invoke-virtual {v9, v0, v10, v11}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 102
    .line 103
    .line 104
    move v0, v5

    .line 105
    :cond_4
    :goto_0
    :try_start_0
    iget-object v10, v8, Ld0/p;->a:[B

    .line 106
    .line 107
    array-length v11, v10

    .line 108
    sub-int/2addr v11, v0

    .line 109
    invoke-virtual {v9, v10, v0, v11}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    add-int/2addr v0, v10

    .line 114
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->finished()Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_5

    .line 119
    .line 120
    invoke-virtual {v8, v0}, Ld0/p;->G(I)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 124
    .line 125
    .line 126
    iget-object v0, v8, Ld0/p;->a:[B

    .line 127
    .line 128
    iget v8, v8, Ld0/p;->c:I

    .line 129
    .line 130
    invoke-virtual {v6, v8, v0}, Ld0/p;->F(I[B)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    :try_start_1
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-nez v10, :cond_7

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-eqz v10, :cond_6

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    iget-object v10, v8, Ld0/p;->a:[B

    .line 150
    .line 151
    array-length v11, v10

    .line 152
    if-ne v0, v11, :cond_4

    .line 153
    .line 154
    array-length v10, v10

    .line 155
    mul-int/2addr v10, v7

    .line 156
    invoke-virtual {v8, v10}, Ld0/p;->b(I)V
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :catch_0
    :cond_7
    :goto_1
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :goto_2
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_8
    :goto_3
    iget-object v0, v1, LZ1/i;->n:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lf1/a;

    .line 171
    .line 172
    iput v5, v0, Lf1/a;->d:I

    .line 173
    .line 174
    iput v5, v0, Lf1/a;->e:I

    .line 175
    .line 176
    iput v5, v0, Lf1/a;->f:I

    .line 177
    .line 178
    iput v5, v0, Lf1/a;->g:I

    .line 179
    .line 180
    iput v5, v0, Lf1/a;->h:I

    .line 181
    .line 182
    iput v5, v0, Lf1/a;->i:I

    .line 183
    .line 184
    iget-object v8, v0, Lf1/a;->a:Ld0/p;

    .line 185
    .line 186
    invoke-virtual {v8, v5}, Ld0/p;->E(I)V

    .line 187
    .line 188
    .line 189
    iput-boolean v5, v0, Lf1/a;->c:Z

    .line 190
    .line 191
    new-instance v10, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    :goto_4
    invoke-virtual {v6}, Ld0/p;->a()I

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    const/4 v11, 0x3

    .line 201
    if-lt v9, v11, :cond_1d

    .line 202
    .line 203
    iget v9, v6, Ld0/p;->c:I

    .line 204
    .line 205
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    iget v14, v6, Ld0/p;->b:I

    .line 214
    .line 215
    add-int/2addr v14, v13

    .line 216
    const/4 v15, 0x0

    .line 217
    if-le v14, v9, :cond_9

    .line 218
    .line 219
    invoke-virtual {v6, v9}, Ld0/p;->H(I)V

    .line 220
    .line 221
    .line 222
    move v11, v3

    .line 223
    move v3, v5

    .line 224
    move-object v2, v6

    .line 225
    move-object v1, v8

    .line 226
    const/4 v6, 0x1

    .line 227
    goto/16 :goto_11

    .line 228
    .line 229
    :cond_9
    iget-object v9, v0, Lf1/a;->b:[I

    .line 230
    .line 231
    if-eq v12, v3, :cond_13

    .line 232
    .line 233
    packed-switch v12, :pswitch_data_0

    .line 234
    .line 235
    .line 236
    :cond_a
    :goto_5
    move-object v2, v6

    .line 237
    move-object/from16 p2, v8

    .line 238
    .line 239
    goto/16 :goto_8

    .line 240
    .line 241
    :pswitch_0
    const/16 v9, 0x13

    .line 242
    .line 243
    if-ge v13, v9, :cond_b

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_b
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    iput v9, v0, Lf1/a;->d:I

    .line 251
    .line 252
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    iput v9, v0, Lf1/a;->e:I

    .line 257
    .line 258
    const/16 v9, 0xb

    .line 259
    .line 260
    invoke-virtual {v6, v9}, Ld0/p;->I(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    iput v9, v0, Lf1/a;->f:I

    .line 268
    .line 269
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    iput v9, v0, Lf1/a;->g:I

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :pswitch_1
    if-ge v13, v2, :cond_c

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_c
    invoke-virtual {v6, v11}, Ld0/p;->I(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    and-int/2addr v9, v3

    .line 287
    if-eqz v9, :cond_d

    .line 288
    .line 289
    const/4 v9, 0x1

    .line 290
    goto :goto_6

    .line 291
    :cond_d
    move v9, v5

    .line 292
    :goto_6
    add-int/lit8 v11, v13, -0x4

    .line 293
    .line 294
    if-eqz v9, :cond_10

    .line 295
    .line 296
    const/4 v9, 0x7

    .line 297
    if-ge v11, v9, :cond_e

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_e
    invoke-virtual {v6}, Ld0/p;->y()I

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    if-ge v9, v2, :cond_f

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_f
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    iput v11, v0, Lf1/a;->h:I

    .line 312
    .line 313
    invoke-virtual {v6}, Ld0/p;->B()I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    iput v11, v0, Lf1/a;->i:I

    .line 318
    .line 319
    sub-int/2addr v9, v2

    .line 320
    invoke-virtual {v8, v9}, Ld0/p;->E(I)V

    .line 321
    .line 322
    .line 323
    add-int/lit8 v11, v13, -0xb

    .line 324
    .line 325
    :cond_10
    iget v9, v8, Ld0/p;->b:I

    .line 326
    .line 327
    iget v12, v8, Ld0/p;->c:I

    .line 328
    .line 329
    if-ge v9, v12, :cond_a

    .line 330
    .line 331
    if-lez v11, :cond_a

    .line 332
    .line 333
    sub-int/2addr v12, v9

    .line 334
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    iget-object v12, v8, Ld0/p;->a:[B

    .line 339
    .line 340
    invoke-virtual {v6, v12, v9, v11}, Ld0/p;->g([BII)V

    .line 341
    .line 342
    .line 343
    add-int/2addr v9, v11

    .line 344
    invoke-virtual {v8, v9}, Ld0/p;->H(I)V

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :pswitch_2
    rem-int/lit8 v11, v13, 0x5

    .line 349
    .line 350
    if-eq v11, v7, :cond_11

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_11
    invoke-virtual {v6, v7}, Ld0/p;->I(I)V

    .line 354
    .line 355
    .line 356
    invoke-static {v9, v5}, Ljava/util/Arrays;->fill([II)V

    .line 357
    .line 358
    .line 359
    div-int/lit8 v13, v13, 0x5

    .line 360
    .line 361
    move v11, v5

    .line 362
    :goto_7
    if-ge v11, v13, :cond_12

    .line 363
    .line 364
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 373
    .line 374
    .line 375
    move-result v16

    .line 376
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 377
    .line 378
    .line 379
    move-result v17

    .line 380
    invoke-virtual {v6}, Ld0/p;->v()I

    .line 381
    .line 382
    .line 383
    move-result v18

    .line 384
    move-object/from16 p2, v8

    .line 385
    .line 386
    int-to-double v7, v2

    .line 387
    add-int/lit8 v2, v16, -0x80

    .line 388
    .line 389
    int-to-double v4, v2

    .line 390
    const-wide v19, 0x3ff66e978d4fdf3bL    # 1.402

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    mul-double v19, v19, v4

    .line 396
    .line 397
    add-double v1, v19, v7

    .line 398
    .line 399
    double-to-int v1, v1

    .line 400
    add-int/lit8 v2, v17, -0x80

    .line 401
    .line 402
    move-wide/from16 v19, v4

    .line 403
    .line 404
    int-to-double v3, v2

    .line 405
    const-wide v21, 0x3fd60663c74fb54aL    # 0.34414

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    mul-double v21, v21, v3

    .line 411
    .line 412
    sub-double v21, v7, v21

    .line 413
    .line 414
    const-wide v23, 0x3fe6da3c21187e7cL    # 0.71414

    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    mul-double v19, v19, v23

    .line 420
    .line 421
    move-object v2, v6

    .line 422
    sub-double v5, v21, v19

    .line 423
    .line 424
    double-to-int v5, v5

    .line 425
    const-wide v19, 0x3ffc5a1cac083127L    # 1.772

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    mul-double v3, v3, v19

    .line 431
    .line 432
    add-double/2addr v3, v7

    .line 433
    double-to-int v3, v3

    .line 434
    shl-int/lit8 v4, v18, 0x18

    .line 435
    .line 436
    const/16 v6, 0xff

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    invoke-static {v1, v7, v6}, Ld0/w;->i(III)I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    shl-int/lit8 v1, v1, 0x10

    .line 444
    .line 445
    or-int/2addr v1, v4

    .line 446
    invoke-static {v5, v7, v6}, Ld0/w;->i(III)I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    shl-int/lit8 v4, v4, 0x8

    .line 451
    .line 452
    or-int/2addr v1, v4

    .line 453
    invoke-static {v3, v7, v6}, Ld0/w;->i(III)I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    or-int/2addr v1, v3

    .line 458
    aput v1, v9, v12

    .line 459
    .line 460
    const/4 v1, 0x1

    .line 461
    add-int/2addr v11, v1

    .line 462
    move-object/from16 v1, p0

    .line 463
    .line 464
    move-object/from16 v8, p2

    .line 465
    .line 466
    move-object v6, v2

    .line 467
    const/4 v2, 0x4

    .line 468
    const/16 v3, 0x80

    .line 469
    .line 470
    const/4 v5, 0x0

    .line 471
    const/4 v7, 0x2

    .line 472
    goto :goto_7

    .line 473
    :cond_12
    move-object v2, v6

    .line 474
    move-object/from16 p2, v8

    .line 475
    .line 476
    const/4 v1, 0x1

    .line 477
    iput-boolean v1, v0, Lf1/a;->c:Z

    .line 478
    .line 479
    :goto_8
    move-object/from16 v1, p2

    .line 480
    .line 481
    const/4 v3, 0x0

    .line 482
    const/4 v6, 0x1

    .line 483
    const/16 v11, 0x80

    .line 484
    .line 485
    goto/16 :goto_10

    .line 486
    .line 487
    :cond_13
    move-object v2, v6

    .line 488
    move-object/from16 p2, v8

    .line 489
    .line 490
    iget v1, v0, Lf1/a;->d:I

    .line 491
    .line 492
    if-eqz v1, :cond_1b

    .line 493
    .line 494
    iget v1, v0, Lf1/a;->e:I

    .line 495
    .line 496
    if-eqz v1, :cond_1b

    .line 497
    .line 498
    iget v1, v0, Lf1/a;->h:I

    .line 499
    .line 500
    if-eqz v1, :cond_1b

    .line 501
    .line 502
    iget v1, v0, Lf1/a;->i:I

    .line 503
    .line 504
    if-eqz v1, :cond_1b

    .line 505
    .line 506
    move-object/from16 v1, p2

    .line 507
    .line 508
    iget v3, v1, Ld0/p;->c:I

    .line 509
    .line 510
    if-eqz v3, :cond_14

    .line 511
    .line 512
    iget v4, v1, Ld0/p;->b:I

    .line 513
    .line 514
    if-ne v4, v3, :cond_14

    .line 515
    .line 516
    iget-boolean v3, v0, Lf1/a;->c:Z

    .line 517
    .line 518
    if-nez v3, :cond_15

    .line 519
    .line 520
    :cond_14
    :goto_9
    const/4 v6, 0x1

    .line 521
    const/16 v11, 0x80

    .line 522
    .line 523
    goto/16 :goto_e

    .line 524
    .line 525
    :cond_15
    const/4 v3, 0x0

    .line 526
    invoke-virtual {v1, v3}, Ld0/p;->H(I)V

    .line 527
    .line 528
    .line 529
    iget v3, v0, Lf1/a;->h:I

    .line 530
    .line 531
    iget v4, v0, Lf1/a;->i:I

    .line 532
    .line 533
    mul-int/2addr v3, v4

    .line 534
    new-array v4, v3, [I

    .line 535
    .line 536
    const/4 v7, 0x0

    .line 537
    :goto_a
    if-ge v7, v3, :cond_1a

    .line 538
    .line 539
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    if-eqz v5, :cond_17

    .line 544
    .line 545
    const/4 v6, 0x1

    .line 546
    add-int/lit8 v8, v7, 0x1

    .line 547
    .line 548
    aget v5, v9, v5

    .line 549
    .line 550
    aput v5, v4, v7

    .line 551
    .line 552
    move v7, v8

    .line 553
    :cond_16
    const/16 v11, 0x80

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_17
    const/4 v6, 0x1

    .line 557
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 558
    .line 559
    .line 560
    move-result v5

    .line 561
    if-eqz v5, :cond_16

    .line 562
    .line 563
    and-int/lit8 v8, v5, 0x40

    .line 564
    .line 565
    if-nez v8, :cond_18

    .line 566
    .line 567
    and-int/lit8 v8, v5, 0x3f

    .line 568
    .line 569
    :goto_b
    const/16 v11, 0x80

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_18
    and-int/lit8 v8, v5, 0x3f

    .line 573
    .line 574
    shl-int/lit8 v8, v8, 0x8

    .line 575
    .line 576
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    or-int/2addr v8, v11

    .line 581
    goto :goto_b

    .line 582
    :goto_c
    and-int/2addr v5, v11

    .line 583
    if-nez v5, :cond_19

    .line 584
    .line 585
    const/4 v5, 0x0

    .line 586
    aget v12, v9, v5

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_19
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 590
    .line 591
    .line 592
    move-result v5

    .line 593
    aget v12, v9, v5

    .line 594
    .line 595
    :goto_d
    add-int/2addr v8, v7

    .line 596
    invoke-static {v4, v7, v8, v12}, Ljava/util/Arrays;->fill([IIII)V

    .line 597
    .line 598
    .line 599
    move v7, v8

    .line 600
    goto :goto_a

    .line 601
    :cond_1a
    const/4 v6, 0x1

    .line 602
    const/16 v11, 0x80

    .line 603
    .line 604
    iget v3, v0, Lf1/a;->h:I

    .line 605
    .line 606
    iget v5, v0, Lf1/a;->i:I

    .line 607
    .line 608
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 609
    .line 610
    invoke-static {v4, v3, v5, v7}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 611
    .line 612
    .line 613
    move-result-object v19

    .line 614
    iget v3, v0, Lf1/a;->f:I

    .line 615
    .line 616
    int-to-float v3, v3

    .line 617
    iget v4, v0, Lf1/a;->d:I

    .line 618
    .line 619
    int-to-float v4, v4

    .line 620
    div-float v23, v3, v4

    .line 621
    .line 622
    iget v3, v0, Lf1/a;->g:I

    .line 623
    .line 624
    int-to-float v3, v3

    .line 625
    iget v5, v0, Lf1/a;->e:I

    .line 626
    .line 627
    int-to-float v5, v5

    .line 628
    div-float v20, v3, v5

    .line 629
    .line 630
    iget v3, v0, Lf1/a;->h:I

    .line 631
    .line 632
    int-to-float v3, v3

    .line 633
    div-float v27, v3, v4

    .line 634
    .line 635
    iget v3, v0, Lf1/a;->i:I

    .line 636
    .line 637
    int-to-float v3, v3

    .line 638
    div-float v28, v3, v5

    .line 639
    .line 640
    new-instance v3, Lc0/b;

    .line 641
    .line 642
    move-object v15, v3

    .line 643
    const/high16 v30, -0x1000000

    .line 644
    .line 645
    const/16 v32, 0x0

    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    move-object/from16 v18, v17

    .line 650
    .line 651
    move-object/from16 v16, v17

    .line 652
    .line 653
    const/16 v21, 0x0

    .line 654
    .line 655
    const/16 v22, 0x0

    .line 656
    .line 657
    const/16 v24, 0x0

    .line 658
    .line 659
    const/high16 v31, -0x80000000

    .line 660
    .line 661
    move/from16 v25, v31

    .line 662
    .line 663
    const v26, -0x800001

    .line 664
    .line 665
    .line 666
    const/16 v29, 0x0

    .line 667
    .line 668
    invoke-direct/range {v15 .. v32}, Lc0/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 669
    .line 670
    .line 671
    move-object v15, v3

    .line 672
    :goto_e
    const/4 v3, 0x0

    .line 673
    goto :goto_f

    .line 674
    :cond_1b
    move-object/from16 v1, p2

    .line 675
    .line 676
    goto/16 :goto_9

    .line 677
    .line 678
    :goto_f
    iput v3, v0, Lf1/a;->d:I

    .line 679
    .line 680
    iput v3, v0, Lf1/a;->e:I

    .line 681
    .line 682
    iput v3, v0, Lf1/a;->f:I

    .line 683
    .line 684
    iput v3, v0, Lf1/a;->g:I

    .line 685
    .line 686
    iput v3, v0, Lf1/a;->h:I

    .line 687
    .line 688
    iput v3, v0, Lf1/a;->i:I

    .line 689
    .line 690
    invoke-virtual {v1, v3}, Ld0/p;->E(I)V

    .line 691
    .line 692
    .line 693
    iput-boolean v3, v0, Lf1/a;->c:Z

    .line 694
    .line 695
    :goto_10
    invoke-virtual {v2, v14}, Ld0/p;->H(I)V

    .line 696
    .line 697
    .line 698
    :goto_11
    if-eqz v15, :cond_1c

    .line 699
    .line 700
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    :cond_1c
    move-object v8, v1

    .line 704
    move-object v6, v2

    .line 705
    move v5, v3

    .line 706
    move v3, v11

    .line 707
    const/4 v2, 0x4

    .line 708
    const/4 v7, 0x2

    .line 709
    move-object/from16 v1, p0

    .line 710
    .line 711
    goto/16 :goto_4

    .line 712
    .line 713
    :cond_1d
    new-instance v0, Lc1/a;

    .line 714
    .line 715
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    move-object v9, v0

    .line 726
    invoke-direct/range {v9 .. v14}, Lc1/a;-><init>(Ljava/util/List;JJ)V

    .line 727
    .line 728
    .line 729
    move-object/from16 v1, p5

    .line 730
    .line 731
    invoke-interface {v1, v0}, Ld0/d;->accept(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-void

    .line 735
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public y(Ly2/i;)V
    .locals 3

    .line 1
    new-instance v0, Ly2/p;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Ly2/i;->a:LF2/a;

    .line 7
    .line 8
    const-class v2, Ly2/o;

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Ly2/p;-><init>(Ljava/lang/Class;LF2/a;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LZ1/i;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ly2/i;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public z(Ly2/j;)V
    .locals 3

    .line 1
    new-instance v0, Ly2/q;

    .line 2
    .line 3
    iget-object v1, p1, Ly2/j;->a:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Ly2/o;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ly2/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LZ1/i;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly2/j;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void
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
    .line 231
    .line 232
    .line 233
    .line 234
.end method
