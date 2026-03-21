.class public final synthetic LD0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:LZ1/c;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(LZ1/c;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/z;->l:LZ1/c;

    iput-object p2, p0, LD0/z;->m:Ljava/lang/Object;

    iput-wide p3, p0, LD0/z;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LD0/z;->l:LZ1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Ld0/w;->a:I

    .line 7
    .line 8
    iget-object v0, v0, LZ1/c;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LD0/A;

    .line 11
    .line 12
    check-cast v0, Lh0/D;

    .line 13
    .line 14
    iget-object v0, v0, Lh0/D;->l:Lh0/G;

    .line 15
    .line 16
    iget-object v1, v0, Lh0/G;->r:Li0/c;

    .line 17
    .line 18
    invoke-virtual {v1}, Li0/c;->k()Li0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, LI2/g;

    .line 23
    .line 24
    iget-wide v4, p0, LD0/z;->n:J

    .line 25
    .line 26
    iget-object v6, p0, LD0/z;->m:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {v3, v2, v6, v4, v5}, LI2/g;-><init>(Li0/a;Ljava/lang/Object;J)V

    .line 29
    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    invoke-virtual {v1, v2, v4, v3}, Li0/c;->l(Li0/a;ILd0/i;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lh0/G;->N:Landroid/view/Surface;

    .line 37
    .line 38
    if-ne v1, v6, :cond_0

    .line 39
    .line 40
    new-instance v1, Lh0/y;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v1, v2}, Lh0/y;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v0, Lh0/G;->l:Ld0/l;

    .line 47
    .line 48
    invoke-virtual {v0, v4, v1}, Ld0/l;->e(ILd0/i;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method
