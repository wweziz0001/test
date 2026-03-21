.class public final synthetic LR1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1/c;


# instance fields
.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:LQ1/a;

.field public final synthetic o:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/List;LQ1/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR1/i;->l:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LR1/i;->m:Ljava/util/List;

    iput-object p3, p0, LR1/i;->n:LQ1/a;

    iput-object p4, p0, LR1/i;->o:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final c(LZ1/j;Z)V
    .locals 6

    .line 1
    new-instance p2, LP2/b;

    .line 2
    .line 3
    iget-object v1, p0, LR1/i;->m:Ljava/util/List;

    .line 4
    .line 5
    iget-object v3, p0, LR1/i;->n:LQ1/a;

    .line 6
    .line 7
    iget-object v4, p0, LR1/i;->o:Landroidx/work/impl/WorkDatabase;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    move-object v0, p2

    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v5}, LP2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LR1/i;->l:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
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
