.class public final synthetic LB0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:LB0/c;

.field public final synthetic m:I

.field public final synthetic n:J

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(LB0/c;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/b;->l:LB0/c;

    iput p2, p0, LB0/b;->m:I

    iput-wide p3, p0, LB0/b;->n:J

    iput-wide p5, p0, LB0/b;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, LB0/b;->l:LB0/c;

    .line 2
    .line 3
    iget-object v0, v0, LB0/c;->b:Li0/c;

    .line 4
    .line 5
    iget-object v1, v0, Li0/c;->o:Ly2/n;

    .line 6
    .line 7
    iget-object v2, v1, Ly2/n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lm2/I;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, v1, Ly2/n;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lm2/I;

    .line 22
    .line 23
    invoke-static {v1}, Lm2/r;->l(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lx0/H;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Li0/c;->i(Lx0/H;)Li0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v9, Lc1/m;

    .line 34
    .line 35
    iget v4, p0, LB0/b;->m:I

    .line 36
    .line 37
    iget-wide v5, p0, LB0/b;->n:J

    .line 38
    .line 39
    iget-wide v7, p0, LB0/b;->o:J

    .line 40
    .line 41
    move-object v2, v9

    .line 42
    move-object v3, v1

    .line 43
    invoke-direct/range {v2 .. v8}, Lc1/m;-><init>(Li0/a;IJJ)V

    .line 44
    .line 45
    .line 46
    const/16 v2, 0x3ee

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2, v9}, Li0/c;->l(Li0/a;ILd0/i;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
