.class public final LA/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/d;


# instance fields
.field public final synthetic l:I

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, LA/e;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZ2/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/e;->l:I

    const-string v0, "context"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LA/e;->n:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LA/e;->o:Ljava/lang/Object;

    .line 6
    new-instance p1, LZ2/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LZ2/a;-><init>(Ljava/lang/Object;I)V

    .line 7
    new-instance p2, LB3/e;

    invoke-direct {p2, p1}, LB3/e;-><init>(LM3/a;)V

    .line 8
    iput-object p2, p0, LA/e;->p:Ljava/lang/Object;

    .line 9
    new-instance p1, Lc;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lc;-><init>(I)V

    .line 10
    new-instance p2, LB3/e;

    invoke-direct {p2, p1}, LB3/e;-><init>(LM3/a;)V

    .line 11
    iput-object p2, p0, LA/e;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ln3/f;LI2/g;LI2/g;Lio/flutter/embedding/engine/renderer/l;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA/e;->l:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, LA/e;->n:Ljava/lang/Object;

    .line 44
    iput-object p3, p0, LA/e;->o:Ljava/lang/Object;

    .line 45
    iput-object p4, p0, LA/e;->p:Ljava/lang/Object;

    .line 46
    iput-object p5, p0, LA/e;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li1/c;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LA/e;->l:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    .line 22
    iput-object p3, p0, LA/e;->p:Ljava/lang/Object;

    .line 23
    iput-object p4, p0, LA/e;->q:Ljava/lang/Object;

    .line 24
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, LA/e;->o:Ljava/lang/Object;

    .line 25
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 26
    invoke-virtual {p1, p2, p3}, Li1/c;->d(Ljava/util/TreeSet;Z)V

    .line 27
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 28
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 29
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 30
    :cond_0
    iput-object p1, p0, LA/e;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA/e;->l:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LA/e;->o:Ljava/lang/Object;

    .line 50
    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    .line 51
    sget-object p1, LB2/a;->b:LB2/a;

    iput-object p1, p0, LA/e;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/e;->l:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    iput-object p2, p0, LA/e;->n:Ljava/lang/Object;

    .line 36
    iput-object p3, p0, LA/e;->o:Ljava/lang/Object;

    .line 37
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    iput-object p4, p0, LA/e;->q:Ljava/lang/Object;

    .line 39
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 40
    iput-object p1, p0, LA/e;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln3/f;Landroid/content/Context;Ly3/r;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LA/e;->l:I

    .line 12
    const-string v0, "binaryMessenger"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/e;->m:Ljava/lang/Object;

    .line 14
    new-instance v0, Ly3/e;

    invoke-direct {v0, p1}, Ly3/e;-><init>(Ln3/f;)V

    .line 15
    new-instance p1, Ly3/i;

    invoke-direct {p1, v0}, Ly3/i;-><init>(Ly3/e;)V

    .line 16
    new-instance v0, Ly3/c;

    invoke-direct {v0, p1}, Ly3/c;-><init>(Ly3/i;)V

    .line 17
    iput-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 18
    iput-object p2, p0, LA/e;->p:Ljava/lang/Object;

    .line 19
    iput-object p3, p0, LA/e;->q:Ljava/lang/Object;

    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "/"

    .line 4
    .line 5
    invoke-static {p0, v0}, LU3/l;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x6

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1, p0, v0, v2}, LU3/l;->g0(IILjava/lang/CharSequence;Ljava/lang/String;Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 23
    .line 24
    invoke-static {p0, v0}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const-string p0, "*"

    .line 29
    .line 30
    :goto_1
    return-object p0
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

.method public static k(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", Message: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ", Stacktrace: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v0, "WebChromeClientImpl"

    .line 46
    .line 47
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    return-void
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
.method public a(J)I
    .locals 2

    .line 1
    iget-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, p2, v1}, Ld0/w;->a([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p2, v0

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    return p1
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

.method public b(Ljava/lang/Object;Ljava/lang/Object;LD2/f0;Z)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, LA/e;->n:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    if-eqz v1, :cond_c

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 14
    .line 15
    const-string v2, "at least one of the `fullPrimitive` or `primitive` must be set"

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1

    .line 21
    :cond_1
    :goto_0
    invoke-virtual {p3}, LD2/f0;->F()LD2/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, LD2/Z;->n:LD2/Z;

    .line 26
    .line 27
    if-ne v1, v2, :cond_b

    .line 28
    .line 29
    invoke-virtual {p3}, LD2/f0;->D()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p3}, LD2/f0;->E()LD2/r0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v3, LD2/r0;->p:LD2/r0;

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    move-object v1, v11

    .line 47
    :cond_2
    sget-object v2, Ly2/h;->b:Ly2/h;

    .line 48
    .line 49
    invoke-virtual {p3}, LD2/f0;->C()LD2/Y;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, LD2/Y;->D()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {p3}, LD2/f0;->C()LD2/Y;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, LD2/Y;->E()Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {p3}, LD2/f0;->C()LD2/Y;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, LD2/Y;->C()LD2/X;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {p3}, LD2/f0;->E()LD2/r0;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {v3, v4, v5, v6, v1}, Ly2/n;->d(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;LD2/X;LD2/r0;Ljava/lang/Integer;)Ly2/n;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v2, v1}, Ly2/h;->a(Ly2/n;)Lr2/b;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    new-instance v1, Lr2/k;

    .line 86
    .line 87
    invoke-virtual {p3}, LD2/f0;->E()LD2/r0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v3, 0x5

    .line 96
    const/4 v4, 0x1

    .line 97
    if-eq v2, v4, :cond_6

    .line 98
    .line 99
    const/4 v4, 0x2

    .line 100
    if-eq v2, v4, :cond_5

    .line 101
    .line 102
    const/4 v4, 0x3

    .line 103
    if-eq v2, v4, :cond_4

    .line 104
    .line 105
    const/4 v4, 0x4

    .line 106
    if-ne v2, v4, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 110
    .line 111
    const-string v2, "unknown output prefix type"

    .line 112
    .line 113
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :cond_4
    sget-object v2, Lr2/b;->a:[B

    .line 118
    .line 119
    :goto_1
    move-object v5, v2

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    :goto_2
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/4 v3, 0x0

    .line 126
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p3}, LD2/f0;->D()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    goto :goto_1

    .line 143
    :cond_6
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {p3}, LD2/f0;->D()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    goto :goto_1

    .line 164
    :goto_3
    invoke-virtual {p3}, LD2/f0;->F()LD2/Z;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {p3}, LD2/f0;->E()LD2/r0;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {p3}, LD2/f0;->D()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    invoke-virtual {p3}, LD2/f0;->C()LD2/Y;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, LD2/Y;->D()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    move-object v2, v1

    .line 185
    move-object v3, p1

    .line 186
    move-object v4, p2

    .line 187
    invoke-direct/range {v2 .. v10}, Lr2/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLD2/Z;LD2/r0;ILjava/lang/String;Lr2/b;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, v0, LA/e;->n:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 193
    .line 194
    iget-object v3, v0, LA/e;->o:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v3, Ljava/util/ArrayList;

    .line 197
    .line 198
    new-instance v4, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    new-instance v5, Lr2/l;

    .line 207
    .line 208
    iget-object v6, v1, Lr2/k;->c:[B

    .line 209
    .line 210
    if-nez v6, :cond_7

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    array-length v7, v6

    .line 214
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    :goto_4
    invoke-direct {v5, v11}, Lr2/l;-><init>([B)V

    .line 219
    .line 220
    .line 221
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v2, v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Ljava/util/List;

    .line 230
    .line 231
    if-eqz v4, :cond_8

    .line 232
    .line 233
    new-instance v6, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v2, v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_8
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    if-eqz p4, :cond_a

    .line 255
    .line 256
    iget-object v2, v0, LA/e;->p:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v2, Lr2/k;

    .line 259
    .line 260
    if-nez v2, :cond_9

    .line 261
    .line 262
    iput-object v1, v0, LA/e;->p:Ljava/lang/Object;

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 266
    .line 267
    const-string v2, "you cannot set two primary primitives"

    .line 268
    .line 269
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v1

    .line 273
    :cond_a
    :goto_5
    return-void

    .line 274
    :cond_b
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 275
    .line 276
    const-string v2, "only ENABLED key is allowed"

    .line 277
    .line 278
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 283
    .line 284
    const-string v2, "addPrimitive cannot be called after build"

    .line 285
    .line 286
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1
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
.end method

.method public c()Ls2/k;
    .locals 9

    .line 1
    iget-object v0, p0, LA/e;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    iget-object v0, p0, LA/e;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    iget-object v1, p0, LA/e;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ls2/j;

    .line 22
    .line 23
    if-eqz v1, :cond_b

    .line 24
    .line 25
    iget-object v1, p0, LA/e;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ls2/j;

    .line 28
    .line 29
    if-eqz v1, :cond_a

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, LA/e;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ls2/j;

    .line 38
    .line 39
    sget-object v3, Ls2/j;->c:Ls2/j;

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    const/16 v2, 0x14

    .line 44
    .line 45
    if-gt v1, v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 49
    .line 50
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 55
    .line 56
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_1
    sget-object v3, Ls2/j;->d:Ls2/j;

    .line 65
    .line 66
    if-ne v2, v3, :cond_3

    .line 67
    .line 68
    const/16 v2, 0x1c

    .line 69
    .line 70
    if-gt v1, v2, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 74
    .line 75
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 80
    .line 81
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_3
    sget-object v3, Ls2/j;->e:Ls2/j;

    .line 90
    .line 91
    if-ne v2, v3, :cond_5

    .line 92
    .line 93
    const/16 v2, 0x20

    .line 94
    .line 95
    if-gt v1, v2, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 105
    .line 106
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_5
    sget-object v3, Ls2/j;->f:Ls2/j;

    .line 115
    .line 116
    if-ne v2, v3, :cond_7

    .line 117
    .line 118
    const/16 v2, 0x30

    .line 119
    .line 120
    if-gt v1, v2, :cond_6

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 124
    .line 125
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 130
    .line 131
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_7
    sget-object v3, Ls2/j;->g:Ls2/j;

    .line 140
    .line 141
    if-ne v2, v3, :cond_9

    .line 142
    .line 143
    const/16 v2, 0x40

    .line 144
    .line 145
    if-gt v1, v2, :cond_8

    .line 146
    .line 147
    :goto_0
    new-instance v0, Ls2/k;

    .line 148
    .line 149
    iget-object v1, p0, LA/e;->m:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    iget-object v1, p0, LA/e;->n:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    iget-object v1, p0, LA/e;->o:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    iget-object v1, p0, LA/e;->q:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v7, v1

    .line 176
    check-cast v7, Ls2/j;

    .line 177
    .line 178
    iget-object v1, p0, LA/e;->p:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v8, v1

    .line 181
    check-cast v8, Ls2/j;

    .line 182
    .line 183
    move-object v3, v0

    .line 184
    invoke-direct/range {v3 .. v8}, Ls2/k;-><init>(IIILs2/j;Ls2/j;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 189
    .line 190
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 195
    .line 196
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v1

    .line 204
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 205
    .line 206
    const-string v1, "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"

    .line 207
    .line 208
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v0

    .line 212
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 213
    .line 214
    const-string v1, "variant is not set"

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 221
    .line 222
    const-string v1, "hash type is not set"

    .line 223
    .line 224
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 229
    .line 230
    const-string v1, "tag size is not set"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 237
    .line 238
    const-string v1, "HMAC key size is not set"

    .line 239
    .line 240
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 245
    .line 246
    const-string v1, "AES key size is not set"

    .line 247
    .line 248
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0
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

.method public d(J)Ljava/util/List;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LA/e;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li1/c;

    .line 6
    .line 7
    new-instance v9, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Li1/c;->h:Ljava/lang/String;

    .line 13
    .line 14
    move-wide/from16 v10, p1

    .line 15
    .line 16
    invoke-virtual {v1, v10, v11, v2, v9}, Li1/c;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 17
    .line 18
    .line 19
    new-instance v12, Ljava/util/TreeMap;

    .line 20
    .line 21
    invoke-direct {v12}, Ljava/util/TreeMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    iget-object v6, v1, Li1/c;->h:Ljava/lang/String;

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    move-wide/from16 v3, p1

    .line 29
    .line 30
    move-object v7, v12

    .line 31
    invoke-virtual/range {v2 .. v7}, Li1/c;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, LA/e;->p:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v13, v2

    .line 37
    check-cast v13, Ljava/util/HashMap;

    .line 38
    .line 39
    iget-object v2, v0, LA/e;->o:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v5, v2

    .line 42
    check-cast v5, Ljava/util/Map;

    .line 43
    .line 44
    iget-object v7, v1, Li1/c;->h:Ljava/lang/String;

    .line 45
    .line 46
    move-object v2, v1

    .line 47
    move-object v6, v13

    .line 48
    move-object v8, v12

    .line 49
    invoke-virtual/range {v2 .. v8}, Li1/c;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/4 v4, 0x0

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Landroid/util/Pair;

    .line 73
    .line 74
    iget-object v5, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v6, v0, LA/e;->q:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    if-nez v5, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-static {v5, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    array-length v6, v5

    .line 94
    invoke-static {v5, v4, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 95
    .line 96
    .line 97
    move-result-object v18

    .line 98
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {v13, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Li1/f;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v4, Lc0/b;

    .line 110
    .line 111
    move-object v14, v4

    .line 112
    const/16 v28, 0x0

    .line 113
    .line 114
    const/high16 v29, -0x1000000

    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    move-object/from16 v15, v16

    .line 119
    .line 120
    move-object/from16 v17, v16

    .line 121
    .line 122
    iget v5, v3, Li1/f;->c:F

    .line 123
    .line 124
    move/from16 v19, v5

    .line 125
    .line 126
    const/16 v20, 0x0

    .line 127
    .line 128
    iget v5, v3, Li1/f;->e:I

    .line 129
    .line 130
    move/from16 v21, v5

    .line 131
    .line 132
    iget v5, v3, Li1/f;->b:F

    .line 133
    .line 134
    move/from16 v22, v5

    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const/high16 v24, -0x80000000

    .line 139
    .line 140
    const v25, -0x800001

    .line 141
    .line 142
    .line 143
    iget v5, v3, Li1/f;->f:F

    .line 144
    .line 145
    move/from16 v26, v5

    .line 146
    .line 147
    iget v5, v3, Li1/f;->g:F

    .line 148
    .line 149
    move/from16 v27, v5

    .line 150
    .line 151
    iget v3, v3, Li1/f;->j:I

    .line 152
    .line 153
    move/from16 v30, v3

    .line 154
    .line 155
    const/16 v31, 0x0

    .line 156
    .line 157
    invoke-direct/range {v14 .. v31}, Lc0/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    invoke-virtual {v12}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_d

    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/util/Map$Entry;

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v13, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Li1/f;

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Lc0/a;

    .line 202
    .line 203
    iget-object v6, v3, Lc0/a;->a:Ljava/lang/CharSequence;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    check-cast v6, Landroid/text/SpannableStringBuilder;

    .line 209
    .line 210
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    const-class v8, Li1/a;

    .line 215
    .line 216
    invoke-virtual {v6, v4, v7, v8}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, [Li1/a;

    .line 221
    .line 222
    array-length v8, v7

    .line 223
    move v9, v4

    .line 224
    :goto_2
    if-ge v9, v8, :cond_2

    .line 225
    .line 226
    aget-object v10, v7, v9

    .line 227
    .line 228
    invoke-virtual {v6, v10}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    invoke-virtual {v6, v10}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    const-string v12, ""

    .line 237
    .line 238
    invoke-virtual {v6, v11, v10, v12}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 239
    .line 240
    .line 241
    add-int/lit8 v9, v9, 0x1

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_2
    move v7, v4

    .line 245
    :goto_3
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    const/16 v9, 0x20

    .line 250
    .line 251
    if-ge v7, v8, :cond_5

    .line 252
    .line 253
    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-ne v8, v9, :cond_4

    .line 258
    .line 259
    add-int/lit8 v8, v7, 0x1

    .line 260
    .line 261
    move v10, v8

    .line 262
    :goto_4
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    if-ge v10, v11, :cond_3

    .line 267
    .line 268
    invoke-virtual {v6, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    if-ne v11, v9, :cond_3

    .line 273
    .line 274
    add-int/lit8 v10, v10, 0x1

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_3
    sub-int/2addr v10, v8

    .line 278
    if-lez v10, :cond_4

    .line 279
    .line 280
    add-int/2addr v10, v7

    .line 281
    invoke-virtual {v6, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 282
    .line 283
    .line 284
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_5
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    const/4 v8, 0x1

    .line 292
    if-lez v7, :cond_6

    .line 293
    .line 294
    invoke-virtual {v6, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    if-ne v7, v9, :cond_6

    .line 299
    .line 300
    invoke-virtual {v6, v4, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 301
    .line 302
    .line 303
    :cond_6
    move v7, v4

    .line 304
    :goto_5
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    sub-int/2addr v10, v8

    .line 309
    const/16 v11, 0xa

    .line 310
    .line 311
    if-ge v7, v10, :cond_8

    .line 312
    .line 313
    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    if-ne v10, v11, :cond_7

    .line 318
    .line 319
    add-int/lit8 v10, v7, 0x1

    .line 320
    .line 321
    invoke-virtual {v6, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-ne v11, v9, :cond_7

    .line 326
    .line 327
    add-int/lit8 v11, v7, 0x2

    .line 328
    .line 329
    invoke-virtual {v6, v10, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 330
    .line 331
    .line 332
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_8
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-lez v7, :cond_9

    .line 340
    .line 341
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    sub-int/2addr v7, v8

    .line 346
    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-ne v7, v9, :cond_9

    .line 351
    .line 352
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    sub-int/2addr v7, v8

    .line 357
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    invoke-virtual {v6, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 362
    .line 363
    .line 364
    :cond_9
    move v7, v4

    .line 365
    :goto_6
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    sub-int/2addr v10, v8

    .line 370
    if-ge v7, v10, :cond_b

    .line 371
    .line 372
    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    if-ne v10, v9, :cond_a

    .line 377
    .line 378
    add-int/lit8 v10, v7, 0x1

    .line 379
    .line 380
    invoke-virtual {v6, v10}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 381
    .line 382
    .line 383
    move-result v12

    .line 384
    if-ne v12, v11, :cond_a

    .line 385
    .line 386
    invoke-virtual {v6, v7, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 387
    .line 388
    .line 389
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_b
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-lez v7, :cond_c

    .line 397
    .line 398
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    sub-int/2addr v7, v8

    .line 403
    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    if-ne v7, v11, :cond_c

    .line 408
    .line 409
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    sub-int/2addr v7, v8

    .line 414
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    invoke-virtual {v6, v7, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 419
    .line 420
    .line 421
    :cond_c
    iget v6, v5, Li1/f;->c:F

    .line 422
    .line 423
    iput v6, v3, Lc0/a;->e:F

    .line 424
    .line 425
    iget v6, v5, Li1/f;->d:I

    .line 426
    .line 427
    iput v6, v3, Lc0/a;->f:I

    .line 428
    .line 429
    iget v6, v5, Li1/f;->e:I

    .line 430
    .line 431
    iput v6, v3, Lc0/a;->g:I

    .line 432
    .line 433
    iget v6, v5, Li1/f;->b:F

    .line 434
    .line 435
    iput v6, v3, Lc0/a;->h:F

    .line 436
    .line 437
    iget v6, v5, Li1/f;->f:F

    .line 438
    .line 439
    iput v6, v3, Lc0/a;->l:F

    .line 440
    .line 441
    iget v6, v5, Li1/f;->i:F

    .line 442
    .line 443
    iput v6, v3, Lc0/a;->k:F

    .line 444
    .line 445
    iget v6, v5, Li1/f;->h:I

    .line 446
    .line 447
    iput v6, v3, Lc0/a;->j:I

    .line 448
    .line 449
    iget v5, v5, Li1/f;->j:I

    .line 450
    .line 451
    iput v5, v3, Lc0/a;->p:I

    .line 452
    .line 453
    invoke-virtual {v3}, Lc0/a;->a()Lc0/b;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :cond_d
    return-object v1
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
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
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
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
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

.method public e()Ln3/m;
    .locals 1

    .line 1
    iget-object v0, p0, LA/e;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly3/g;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ly3/g;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ly3/g;-><init>(LA/e;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LA/e;->o:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LA/e;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ly3/g;

    .line 17
    .line 18
    invoke-static {v0}, LN3/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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

.method public f()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, LN3/h;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, LA/e;->m:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    :goto_0
    return-object v0
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

.method public g(I)J
    .locals 3

    .line 1
    iget-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    aget-wide v1, v0, p1

    .line 6
    .line 7
    return-wide v1
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

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, LA/e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    return v0
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

.method public j()Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, LA/e;->f()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "share_plus"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public l(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LA/e;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    instance-of v1, v0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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

.method public m(Ljava/util/Map;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "arguments"

    .line 6
    .line 7
    invoke-static {v0, v2}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, LA/e;->j()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    array-length v4, v3

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    array-length v4, v3

    .line 31
    const/4 v6, 0x0

    .line 32
    :goto_0
    if-ge v6, v4, :cond_1

    .line 33
    .line 34
    aget-object v7, v3, v6

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    const-string v2, "text"

    .line 46
    .line 47
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    const-string v3, "uri"

    .line 54
    .line 55
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    .line 61
    const-string v4, "subject"

    .line 62
    .line 63
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    const-string v6, "title"

    .line 70
    .line 71
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ljava/lang/String;

    .line 76
    .line 77
    const-string v7, "paths"

    .line 78
    .line 79
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Ljava/util/List;

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    new-instance v9, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-eqz v10, :cond_5

    .line 102
    .line 103
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    instance-of v11, v10, Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v11, :cond_3

    .line 110
    .line 111
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move-object v9, v8

    .line 116
    :cond_5
    const-string v7, "mimeTypes"

    .line 117
    .line 118
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/util/List;

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    new-instance v7, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-eqz v10, :cond_8

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    instance-of v11, v10, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v11, :cond_6

    .line 148
    .line 149
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move-object v7, v8

    .line 154
    :cond_8
    if-eqz v9, :cond_11

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_12

    .line 174
    .line 175
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    check-cast v10, Ljava/lang/String;

    .line 180
    .line 181
    new-instance v11, Ljava/io/File;

    .line 182
    .line 183
    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :try_start_0
    invoke-virtual {v11}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-static {v10}, LN3/h;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, LA/e;->j()Ljava/io/File;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v12}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    const-string v13, "getCanonicalPath(...)"

    .line 202
    .line 203
    invoke-static {v12, v13}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    goto :goto_5

    .line 211
    :catch_0
    const/4 v10, 0x0

    .line 212
    :goto_5
    if-nez v10, :cond_10

    .line 213
    .line 214
    invoke-virtual/range {p0 .. p0}, LA/e;->j()Ljava/io/File;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-nez v12, :cond_9

    .line 223
    .line 224
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 225
    .line 226
    .line 227
    :cond_9
    new-instance v12, Ljava/io/File;

    .line 228
    .line 229
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    invoke-direct {v12, v10, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-eqz v10, :cond_f

    .line 241
    .line 242
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    if-eqz v10, :cond_b

    .line 247
    .line 248
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_a

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_a
    new-instance v0, LK3/a;

    .line 256
    .line 257
    const-string v2, "Tried to overwrite the destination, but failed to delete it."

    .line 258
    .line 259
    invoke-direct {v0, v11, v12, v2}, LK3/b;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_b
    :goto_6
    invoke-virtual {v11}, Ljava/io/File;->isDirectory()Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_d

    .line 268
    .line 269
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    if-eqz v10, :cond_c

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_c
    new-instance v0, LK3/b;

    .line 277
    .line 278
    const-string v2, "Failed to create target directory."

    .line 279
    .line 280
    invoke-direct {v0, v11, v12, v2}, LK3/b;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_d
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    if-eqz v10, :cond_e

    .line 289
    .line 290
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 291
    .line 292
    .line 293
    :cond_e
    new-instance v10, Ljava/io/FileInputStream;

    .line 294
    .line 295
    invoke-direct {v10, v11}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 296
    .line 297
    .line 298
    :try_start_1
    new-instance v11, Ljava/io/FileOutputStream;

    .line 299
    .line 300
    invoke-direct {v11, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 301
    .line 302
    .line 303
    const/16 v13, 0x2000

    .line 304
    .line 305
    :try_start_2
    invoke-static {v10, v11, v13}, LQ1/C;->k(Ljava/io/FileInputStream;Ljava/io/OutputStream;I)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 306
    .line 307
    .line 308
    :try_start_3
    invoke-static {v11, v8}, LZ1/f;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 309
    .line 310
    .line 311
    invoke-static {v10, v8}, LZ1/f;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    :goto_7
    invoke-virtual/range {p0 .. p0}, LA/e;->f()Landroid/content/Context;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    iget-object v11, v1, LA/e;->p:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v11, LB3/e;

    .line 321
    .line 322
    invoke-virtual {v11}, LB3/e;->a()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    check-cast v11, Ljava/lang/String;

    .line 327
    .line 328
    invoke-static {v10, v11, v12}, Lu/h;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto/16 :goto_4

    .line 336
    .line 337
    :catchall_0
    move-exception v0

    .line 338
    move-object v2, v0

    .line 339
    goto :goto_8

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    move-object v2, v0

    .line 342
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 343
    :catchall_2
    move-exception v0

    .line 344
    move-object v3, v0

    .line 345
    :try_start_5
    invoke-static {v11, v2}, LZ1/f;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 349
    :goto_8
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 350
    :catchall_3
    move-exception v0

    .line 351
    move-object v3, v0

    .line 352
    invoke-static {v10, v2}, LZ1/f;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 353
    .line 354
    .line 355
    throw v3

    .line 356
    :cond_f
    new-instance v0, LK3/a;

    .line 357
    .line 358
    const-string v2, "The source file doesn\'t exist."

    .line 359
    .line 360
    invoke-direct {v0, v11, v8, v2}, LK3/b;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 365
    .line 366
    invoke-virtual/range {p0 .. p0}, LA/e;->j()Ljava/io/File;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const-string v3, "Shared file can not be located in \'"

    .line 375
    .line 376
    const-string v4, "\'"

    .line 377
    .line 378
    invoke-static {v3, v2, v4}, Lb3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v0

    .line 386
    :cond_11
    move-object v0, v8

    .line 387
    :cond_12
    new-instance v9, Landroid/content/Intent;

    .line 388
    .line 389
    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 390
    .line 391
    .line 392
    const/4 v10, 0x1

    .line 393
    const-string v11, "android.intent.extra.TITLE"

    .line 394
    .line 395
    const-string v12, "android.intent.extra.SUBJECT"

    .line 396
    .line 397
    const-string v13, "android.intent.extra.TEXT"

    .line 398
    .line 399
    const-string v14, "android.intent.action.SEND"

    .line 400
    .line 401
    if-nez v0, :cond_19

    .line 402
    .line 403
    invoke-virtual {v9, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    const-string v7, "text/plain"

    .line 407
    .line 408
    invoke-virtual {v9, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 409
    .line 410
    .line 411
    if-nez v3, :cond_13

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_13
    move-object v2, v3

    .line 415
    :goto_9
    invoke-virtual {v9, v13, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 416
    .line 417
    .line 418
    if-eqz v4, :cond_15

    .line 419
    .line 420
    invoke-static {v4}, LU3/l;->i0(Ljava/lang/CharSequence;)Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-eqz v2, :cond_14

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_14
    const/4 v2, 0x0

    .line 428
    goto :goto_b

    .line 429
    :cond_15
    :goto_a
    move v2, v10

    .line 430
    :goto_b
    if-nez v2, :cond_16

    .line 431
    .line 432
    invoke-virtual {v9, v12, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    :cond_16
    if-eqz v6, :cond_18

    .line 436
    .line 437
    invoke-static {v6}, LU3/l;->i0(Ljava/lang/CharSequence;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-eqz v2, :cond_17

    .line 442
    .line 443
    goto :goto_c

    .line 444
    :cond_17
    const/4 v2, 0x0

    .line 445
    goto :goto_d

    .line 446
    :cond_18
    :goto_c
    move v2, v10

    .line 447
    :goto_d
    if-nez v2, :cond_2b

    .line 448
    .line 449
    invoke-virtual {v9, v11, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 450
    .line 451
    .line 452
    goto/16 :goto_1a

    .line 453
    .line 454
    :cond_19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-nez v3, :cond_30

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    const-string v15, "android.intent.extra.STREAM"

    .line 465
    .line 466
    const-string v16, "*/*"

    .line 467
    .line 468
    if-ne v3, v10, :cond_1d

    .line 469
    .line 470
    if-eqz v7, :cond_1b

    .line 471
    .line 472
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    if-eqz v3, :cond_1a

    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_1a
    const/4 v3, 0x0

    .line 480
    goto :goto_f

    .line 481
    :cond_1b
    :goto_e
    move v3, v10

    .line 482
    :goto_f
    if-nez v3, :cond_1c

    .line 483
    .line 484
    invoke-static {v7}, LC3/f;->T(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    move-object/from16 v16, v3

    .line 489
    .line 490
    check-cast v16, Ljava/lang/String;

    .line 491
    .line 492
    :cond_1c
    move-object/from16 v3, v16

    .line 493
    .line 494
    invoke-virtual {v9, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v9, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 498
    .line 499
    .line 500
    invoke-static {v0}, LC3/f;->T(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    check-cast v3, Landroid/os/Parcelable;

    .line 505
    .line 506
    invoke-virtual {v9, v15, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 507
    .line 508
    .line 509
    goto :goto_13

    .line 510
    :cond_1d
    const-string v3, "android.intent.action.SEND_MULTIPLE"

    .line 511
    .line 512
    invoke-virtual {v9, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 513
    .line 514
    .line 515
    if-eqz v7, :cond_1e

    .line 516
    .line 517
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    if-nez v3, :cond_1e

    .line 522
    .line 523
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    if-ne v3, v10, :cond_1f

    .line 528
    .line 529
    invoke-static {v7}, LC3/f;->T(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    move-object/from16 v16, v3

    .line 534
    .line 535
    check-cast v16, Ljava/lang/String;

    .line 536
    .line 537
    :cond_1e
    :goto_10
    move-object/from16 v3, v16

    .line 538
    .line 539
    goto :goto_12

    .line 540
    :cond_1f
    invoke-static {v7}, LC3/f;->T(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    check-cast v3, Ljava/lang/String;

    .line 545
    .line 546
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 547
    .line 548
    .line 549
    move-result v14

    .line 550
    sub-int/2addr v14, v10

    .line 551
    if-gt v10, v14, :cond_21

    .line 552
    .line 553
    move v8, v10

    .line 554
    :goto_11
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    invoke-static {v3, v5}, LN3/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    if-nez v5, :cond_20

    .line 563
    .line 564
    invoke-static {v3}, LA/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    check-cast v5, Ljava/lang/String;

    .line 573
    .line 574
    invoke-static {v5}, LA/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-eqz v3, :cond_1e

    .line 583
    .line 584
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    check-cast v3, Ljava/lang/String;

    .line 589
    .line 590
    invoke-static {v3}, LA/e;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    const-string v5, "/*"

    .line 595
    .line 596
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    :cond_20
    if-eq v8, v14, :cond_21

    .line 601
    .line 602
    add-int/lit8 v8, v8, 0x1

    .line 603
    .line 604
    goto :goto_11

    .line 605
    :cond_21
    move-object/from16 v16, v3

    .line 606
    .line 607
    goto :goto_10

    .line 608
    :goto_12
    invoke-virtual {v9, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v9, v15, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 612
    .line 613
    .line 614
    :goto_13
    if-eqz v2, :cond_23

    .line 615
    .line 616
    invoke-static {v2}, LU3/l;->i0(Ljava/lang/CharSequence;)Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-eqz v3, :cond_22

    .line 621
    .line 622
    goto :goto_14

    .line 623
    :cond_22
    const/4 v3, 0x0

    .line 624
    goto :goto_15

    .line 625
    :cond_23
    :goto_14
    move v3, v10

    .line 626
    :goto_15
    if-nez v3, :cond_24

    .line 627
    .line 628
    invoke-virtual {v9, v13, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 629
    .line 630
    .line 631
    :cond_24
    if-eqz v4, :cond_26

    .line 632
    .line 633
    invoke-static {v4}, LU3/l;->i0(Ljava/lang/CharSequence;)Z

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    if-eqz v2, :cond_25

    .line 638
    .line 639
    goto :goto_16

    .line 640
    :cond_25
    const/4 v2, 0x0

    .line 641
    goto :goto_17

    .line 642
    :cond_26
    :goto_16
    move v2, v10

    .line 643
    :goto_17
    if-nez v2, :cond_27

    .line 644
    .line 645
    invoke-virtual {v9, v12, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 646
    .line 647
    .line 648
    :cond_27
    if-eqz v6, :cond_29

    .line 649
    .line 650
    invoke-static {v6}, LU3/l;->i0(Ljava/lang/CharSequence;)Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_28

    .line 655
    .line 656
    goto :goto_18

    .line 657
    :cond_28
    const/4 v2, 0x0

    .line 658
    goto :goto_19

    .line 659
    :cond_29
    :goto_18
    move v2, v10

    .line 660
    :goto_19
    if-nez v2, :cond_2a

    .line 661
    .line 662
    invoke-virtual {v9, v11, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 663
    .line 664
    .line 665
    :cond_2a
    invoke-virtual {v9, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 666
    .line 667
    .line 668
    :cond_2b
    :goto_1a
    new-instance v2, Landroid/content/Intent;

    .line 669
    .line 670
    const-class v3, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent;

    .line 671
    .line 672
    iget-object v4, v1, LA/e;->m:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v4, Landroid/content/Context;

    .line 675
    .line 676
    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 677
    .line 678
    .line 679
    iget-object v3, v1, LA/e;->q:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v3, LB3/e;

    .line 682
    .line 683
    invoke-virtual {v3}, LB3/e;->a()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    check-cast v3, Ljava/lang/Number;

    .line 688
    .line 689
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result v3

    .line 693
    const/high16 v5, 0x8000000

    .line 694
    .line 695
    or-int/2addr v3, v5

    .line 696
    const/4 v5, 0x0

    .line 697
    invoke-static {v4, v5, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    invoke-virtual {v2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-static {v9, v6, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    if-eqz v0, :cond_2d

    .line 710
    .line 711
    invoke-virtual/range {p0 .. p0}, LA/e;->f()Landroid/content/Context;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    const/high16 v5, 0x10000

    .line 720
    .line 721
    invoke-virtual {v3, v2, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    const-string v5, "queryIntentActivities(...)"

    .line 726
    .line 727
    invoke-static {v3, v5}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    :cond_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 735
    .line 736
    .line 737
    move-result v5

    .line 738
    if-eqz v5, :cond_2d

    .line 739
    .line 740
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 745
    .line 746
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 747
    .line 748
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 749
    .line 750
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    :goto_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    if-eqz v7, :cond_2c

    .line 759
    .line 760
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    check-cast v7, Landroid/net/Uri;

    .line 765
    .line 766
    invoke-virtual/range {p0 .. p0}, LA/e;->f()Landroid/content/Context;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    const/4 v9, 0x3

    .line 771
    invoke-virtual {v8, v5, v7, v9}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 772
    .line 773
    .line 774
    goto :goto_1b

    .line 775
    :cond_2d
    invoke-static {v2}, LN3/h;->b(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    iget-object v0, v1, LA/e;->n:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, Landroid/app/Activity;

    .line 781
    .line 782
    if-eqz v0, :cond_2e

    .line 783
    .line 784
    const/16 v3, 0x5873

    .line 785
    .line 786
    invoke-virtual {v0, v2, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 787
    .line 788
    .line 789
    goto :goto_1c

    .line 790
    :cond_2e
    const/high16 v0, 0x10000000

    .line 791
    .line 792
    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 793
    .line 794
    .line 795
    iget-object v0, v1, LA/e;->o:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, LZ2/c;

    .line 798
    .line 799
    iget-object v3, v0, LZ2/c;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 800
    .line 801
    const/4 v5, 0x0

    .line 802
    invoke-virtual {v3, v5, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    if-eqz v3, :cond_2f

    .line 807
    .line 808
    iget-object v3, v0, LZ2/c;->l:LP2/c;

    .line 809
    .line 810
    if-eqz v3, :cond_2f

    .line 811
    .line 812
    const-string v5, "dev.fluttercommunity.plus/share/unavailable"

    .line 813
    .line 814
    invoke-virtual {v3, v5}, LP2/c;->success(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    const/4 v3, 0x0

    .line 818
    iput-object v3, v0, LZ2/c;->l:LP2/c;

    .line 819
    .line 820
    :cond_2f
    invoke-virtual {v4, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 821
    .line 822
    .line 823
    :goto_1c
    return-void

    .line 824
    :cond_30
    new-instance v0, Ljava/io/IOException;

    .line 825
    .line 826
    const-string v2, "Error sharing files: No files found"

    .line 827
    .line 828
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    throw v0
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
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
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

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, LA/e;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "FontRequest {mProviderAuthority: "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, LA/e;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ", mProviderPackage: "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, LA/e;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, ", mQuery: "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, LA/e;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, ", mCertificates:"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    move v2, v1

    .line 68
    :goto_0
    iget-object v3, p0, LA/e;->q:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-ge v2, v4, :cond_1

    .line 77
    .line 78
    const-string v4, " ["

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Ljava/util/List;

    .line 88
    .line 89
    move v4, v1

    .line 90
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-ge v4, v5, :cond_0

    .line 95
    .line 96
    const-string v5, " \""

    .line 97
    .line 98
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, [B

    .line 106
    .line 107
    invoke-static {v5, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v5, "\""

    .line 115
    .line 116
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    const-string v3, " ]"

    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    const-string v1, "}mCertificatesArray: 0"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
