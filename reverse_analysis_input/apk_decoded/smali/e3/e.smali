.class public final Le3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/U;


# instance fields
.field public l:Z

.field public m:Z

.field public final n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Le3/e;->l:Z

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Le3/e;->m:Z

    .line 8
    iput-object p1, p0, Le3/e;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh0/N;Ld0/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le3/e;->o:Ljava/lang/Object;

    .line 3
    new-instance p1, Lh0/u0;

    invoke-direct {p1, p2}, Lh0/u0;-><init>(Ld0/r;)V

    iput-object p1, p0, Le3/e;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Le3/e;->l:Z

    return-void
.end method


# virtual methods
.method public a(La0/J;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le3/e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh0/U;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lh0/U;->a(La0/J;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Le3/e;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lh0/U;

    .line 13
    .line 14
    invoke-interface {p1}, Lh0/U;->d()La0/J;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Le3/e;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lh0/u0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lh0/u0;->a(La0/J;)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public d()La0/J;
    .locals 1

    .line 1
    iget-object v0, p0, Le3/e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh0/U;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lh0/U;->d()La0/J;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Le3/e;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lh0/u0;

    .line 15
    .line 16
    iget-object v0, v0, Lh0/u0;->p:La0/J;

    .line 17
    .line 18
    :goto_0
    return-object v0
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

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le3/e;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le3/e;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lh0/u0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Le3/e;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lh0/U;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lh0/U;->f()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :goto_0
    return v0
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

.method public h()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Le3/e;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le3/e;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lh0/u0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lh0/u0;->h()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Le3/e;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lh0/U;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lh0/U;->h()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    return-wide v0
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
