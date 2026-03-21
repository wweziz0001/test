.class public final synthetic LR1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LR1/f;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LR1/f;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR1/e;->a:LR1/f;

    iput-object p2, p0, LR1/e;->b:Ljava/util/ArrayList;

    iput-object p3, p0, LR1/e;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LR1/e;->a:LR1/f;

    .line 2
    .line 3
    iget-object v0, v0, LR1/f;->e:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LZ1/s;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LR1/e;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, LZ1/s;->I(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v3, p0, LR1/e;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v2}, LZ1/q;->m(Ljava/lang/String;)LZ1/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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
