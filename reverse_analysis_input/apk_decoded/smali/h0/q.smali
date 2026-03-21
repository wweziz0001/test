.class public final Lh0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ld0/r;

.field public final c:Ll2/h;

.field public d:Ll2/h;

.field public final e:Lh0/d;

.field public f:Ll2/h;

.field public final g:Lh0/d;

.field public final h:LB0/l;

.field public final i:Landroid/os/Looper;

.field public final j:I

.field public final k:La0/c;

.field public final l:I

.field public m:Z

.field public final n:Lh0/t0;

.field public o:Lh0/O;

.field public final p:J

.field public final q:J

.field public final r:Z

.field public s:Z

.field public final t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Lh0/d;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lh0/d;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lh0/d;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lh0/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, p1, v0, v1}, Lh0/q;-><init>(Landroid/content/Context;Ll2/h;Ll2/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll2/h;Ll2/h;)V
    .locals 12

    const/4 v0, 0x1

    .line 2
    new-instance v1, Lh0/d;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lh0/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, LD0/n;

    invoke-direct {v2, v0}, LD0/n;-><init>(I)V

    new-instance v3, Lh0/d;

    const/4 v4, 0x3

    invoke-direct {v3, p1, v4}, Lh0/d;-><init>(Landroid/content/Context;I)V

    new-instance v4, LB0/l;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, LB0/l;-><init>(I)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object p1, p0, Lh0/q;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lh0/q;->c:Ll2/h;

    .line 7
    iput-object p3, p0, Lh0/q;->d:Ll2/h;

    .line 8
    iput-object v1, p0, Lh0/q;->e:Lh0/d;

    .line 9
    iput-object v2, p0, Lh0/q;->f:Ll2/h;

    .line 10
    iput-object v3, p0, Lh0/q;->g:Lh0/d;

    .line 11
    iput-object v4, p0, Lh0/q;->h:LB0/l;

    .line 12
    sget p1, Ld0/w;->a:I

    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, Lh0/q;->i:Landroid/os/Looper;

    .line 16
    sget-object p1, La0/c;->e:La0/c;

    iput-object p1, p0, Lh0/q;->k:La0/c;

    .line 17
    iput v0, p0, Lh0/q;->l:I

    .line 18
    iput-boolean v0, p0, Lh0/q;->m:Z

    .line 19
    sget-object p1, Lh0/t0;->c:Lh0/t0;

    iput-object p1, p0, Lh0/q;->n:Lh0/t0;

    const-wide/16 p1, 0x14

    .line 20
    invoke-static {p1, p2}, Ld0/w;->M(J)J

    move-result-wide v7

    const-wide/16 p1, 0x1f4

    .line 21
    invoke-static {p1, p2}, Ld0/w;->M(J)J

    move-result-wide v9

    .line 22
    new-instance p3, Lh0/k;

    const v3, 0x3f83d70a    # 1.03f

    const-wide/16 v4, 0x3e8

    const v2, 0x3f7851ec    # 0.97f

    const v6, 0x33d6bf95    # 1.0E-7f

    const v11, 0x3f7fbe77    # 0.999f

    move-object v1, p3

    invoke-direct/range {v1 .. v11}, Lh0/k;-><init>(FFJFJJF)V

    .line 23
    iput-object p3, p0, Lh0/q;->o:Lh0/O;

    .line 24
    sget-object p3, Ld0/a;->a:Ld0/r;

    iput-object p3, p0, Lh0/q;->b:Ld0/r;

    .line 25
    iput-wide p1, p0, Lh0/q;->p:J

    const-wide/16 p1, 0x7d0

    .line 26
    iput-wide p1, p0, Lh0/q;->q:J

    .line 27
    iput-boolean v0, p0, Lh0/q;->r:Z

    .line 28
    const-string p1, ""

    iput-object p1, p0, Lh0/q;->t:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 29
    iput p1, p0, Lh0/q;->j:I

    return-void
.end method


# virtual methods
.method public final a()Lh0/G;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh0/q;->s:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lh0/q;->s:Z

    .line 9
    .line 10
    sget v0, Ld0/w;->a:I

    .line 11
    .line 12
    new-instance v0, Lh0/G;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lh0/G;-><init>(Lh0/q;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
