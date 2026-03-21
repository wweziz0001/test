.class public abstract Lcom/google/crypto/tink/shaded/protobuf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/Q;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final l:Lcom/google/crypto/tink/shaded/protobuf/w;

.field public m:Lcom/google/crypto/tink/shaded/protobuf/w;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->l:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->s()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "Default instance must be immutable."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
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

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/Z;->c:Lcom/google/crypto/tink/shaded/protobuf/Z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/Z;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
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
.method public final b()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/w;->o(Lcom/google/crypto/tink/shaded/protobuf/w;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
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

.method public final c()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/Z;->c:Lcom/google/crypto/tink/shaded/protobuf/Z;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/Z;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->d(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->q()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 37
    .line 38
    return-object v0
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

.method public final d()Lcom/google/crypto/tink/shaded/protobuf/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->l:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->r()Lcom/google/crypto/tink/shaded/protobuf/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->c()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 12
    .line 13
    return-object v0
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

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->l:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->s()Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/u;->m:Lcom/google/crypto/tink/shaded/protobuf/w;

    .line 21
    .line 22
    :cond_0
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
