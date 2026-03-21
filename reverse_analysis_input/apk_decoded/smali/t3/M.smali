.class public final Lt3/M;
.super Ljava/io/ObjectInputStream;
.source "SourceFile"


# virtual methods
.method public final resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;
    .locals 4

    .line 1
    const-string v0, "java.util.Arrays$ArrayList"

    .line 2
    .line 3
    const-string v1, "java.util.ArrayList"

    .line 4
    .line 5
    const-string v2, "java.lang.String"

    .line 6
    .line 7
    const-string v3, "[Ljava.lang.String;"

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-static {v2}, LC3/r;->b0(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, LC3/e;->Y([Ljava/lang/Object;Ljava/util/AbstractCollection;)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/ObjectStreamClass;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/ClassNotFoundException;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/io/ObjectStreamClass;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_2
    :goto_1
    invoke-super {p0, p1}, Ljava/io/ObjectInputStream;->resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method
