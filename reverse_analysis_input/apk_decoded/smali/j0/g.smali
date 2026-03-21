.class public final synthetic Lj0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:LZ1/c;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(LZ1/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/g;->l:LZ1/c;

    iput-boolean p2, p0, Lj0/g;->m:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj0/g;->l:LZ1/c;

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
    check-cast v0, Lj0/h;

    .line 11
    .line 12
    check-cast v0, Lh0/D;

    .line 13
    .line 14
    iget-object v0, v0, Lh0/D;->l:Lh0/G;

    .line 15
    .line 16
    iget-boolean v1, v0, Lh0/G;->W:Z

    .line 17
    .line 18
    iget-boolean v2, p0, Lj0/g;->m:Z

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-boolean v2, v0, Lh0/G;->W:Z

    .line 24
    .line 25
    new-instance v1, Lh0/v;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-direct {v1, v3, v2}, Lh0/v;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x17

    .line 32
    .line 33
    iget-object v0, v0, Lh0/G;->l:Ld0/l;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ld0/l;->e(ILd0/i;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
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
