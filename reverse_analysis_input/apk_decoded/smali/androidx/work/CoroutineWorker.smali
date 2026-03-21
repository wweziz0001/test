.class public abstract Landroidx/work/CoroutineWorker;
.super LQ1/p;
.source "SourceFile"


# instance fields
.field public final p:LV3/T;

.field public final q:Lb2/k;

.field public final r:Lc4/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LQ1/p;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, LV3/v;->b()LV3/T;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/work/CoroutineWorker;->p:LV3/T;

    .line 19
    .line 20
    new-instance p1, Lb2/k;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/work/CoroutineWorker;->q:Lb2/k;

    .line 26
    .line 27
    new-instance v0, LA3/c;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, p0, v1}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p2, Landroidx/work/WorkerParameters;->d:LZ1/i;

    .line 34
    .line 35
    iget-object p2, p2, LZ1/i;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, La2/p;

    .line 38
    .line 39
    invoke-virtual {p1, v0, p2}, Lb2/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, LV3/B;->a:Lc4/d;

    .line 43
    .line 44
    iput-object p1, p0, Landroidx/work/CoroutineWorker;->r:Lc4/d;

    .line 45
    .line 46
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
.method public final a()Lq2/b;
    .locals 4

    .line 1
    invoke-static {}, LV3/v;->b()LV3/T;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/work/CoroutineWorker;->r:Lc4/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, LD1/b;->K(LE3/g;LE3/i;)LE3/i;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, LV3/v;->a(LE3/i;)La4/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LQ1/k;

    .line 19
    .line 20
    invoke-direct {v2, v0}, LQ1/k;-><init>(LV3/T;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, LQ1/e;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v0, v2, p0, v3}, LQ1/e;-><init>(LQ1/k;Landroidx/work/CoroutineWorker;LE3/d;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, LV3/v;->j(LV3/u;LM3/p;)LV3/e0;

    .line 30
    .line 31
    .line 32
    return-object v2
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

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->q:Lb2/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lb2/i;->cancel(Z)Z

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final c()Lq2/b;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->p:LV3/T;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/work/CoroutineWorker;->r:Lc4/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, LD1/b;->K(LE3/g;LE3/i;)LE3/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LV3/v;->a(LE3/i;)La4/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, LQ1/f;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p0, v2}, LQ1/f;-><init>(Landroidx/work/CoroutineWorker;LE3/d;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, LV3/v;->j(LV3/u;LM3/p;)LV3/e0;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->q:Lb2/k;

    .line 26
    .line 27
    return-object v0
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

.method public abstract f()Ljava/lang/Object;
.end method
