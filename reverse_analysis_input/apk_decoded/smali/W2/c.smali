.class public LW2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;


# instance fields
.field public l:Ln3/q;

.field public m:LZ1/s;

.field public n:LW2/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public final onAttachedToEngine(Lj3/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lj3/a;->c:Ln3/f;

    .line 2
    .line 3
    new-instance v1, Ln3/q;

    .line 4
    .line 5
    const-string v2, "dev.fluttercommunity.plus/connectivity"

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, LW2/c;->l:Ln3/q;

    .line 11
    .line 12
    new-instance v1, LZ1/s;

    .line 13
    .line 14
    const-string v2, "dev.fluttercommunity.plus/connectivity_status"

    .line 15
    .line 16
    invoke-direct {v1, v0, v2}, LZ1/s;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, LW2/c;->m:LZ1/s;

    .line 20
    .line 21
    iget-object p1, p1, Lj3/a;->a:Landroid/content/Context;

    .line 22
    .line 23
    const-string v0, "connectivity"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 30
    .line 31
    new-instance v1, LB0/d;

    .line 32
    .line 33
    invoke-direct {v1, v0}, LB0/d;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, LB0/d;

    .line 37
    .line 38
    invoke-direct {v0, v1}, LB0/d;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, LW2/b;

    .line 42
    .line 43
    invoke-direct {v2, p1, v1}, LW2/b;-><init>(Landroid/content/Context;LB0/d;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, LW2/c;->n:LW2/b;

    .line 47
    .line 48
    iget-object p1, p0, LW2/c;->l:Ln3/q;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ln3/q;->b(Ln3/o;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LW2/c;->m:LZ1/s;

    .line 54
    .line 55
    iget-object v0, p0, LW2/c;->n:LW2/b;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, LZ1/s;->Q(Ln3/i;)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method public final onDetachedFromEngine(Lj3/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LW2/c;->l:Ln3/q;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Ln3/q;->b(Ln3/o;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LW2/c;->m:LZ1/s;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LZ1/s;->Q(Ln3/i;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LW2/c;->n:LW2/b;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LW2/b;->onCancel(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LW2/c;->l:Ln3/q;

    .line 18
    .line 19
    iput-object v0, p0, LW2/c;->m:LZ1/s;

    .line 20
    .line 21
    iput-object v0, p0, LW2/c;->n:LW2/b;

    .line 22
    .line 23
    return-void
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
