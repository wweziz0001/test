.class public final synthetic LD/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# instance fields
.field public final synthetic a:LD/i;

.field public final synthetic b:Landroidx/lifecycle/o;

.field public final synthetic c:LD/k;


# direct methods
.method public synthetic constructor <init>(LD/i;Landroidx/lifecycle/o;LD/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/f;->a:LD/i;

    iput-object p2, p0, LD/f;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, LD/f;->c:LD/k;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 5

    .line 1
    iget-object p1, p0, LD/f;->a:LD/i;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/n;->Companion:Landroidx/lifecycle/l;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LD/f;->b:Landroidx/lifecycle/o;

    .line 12
    .line 13
    const-string v1, "state"

    .line 14
    .line 15
    invoke-static {v0, v1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq v1, v2, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    if-eq v1, v2, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, Landroidx/lifecycle/n;->ON_RESUME:Landroidx/lifecycle/n;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v1, Landroidx/lifecycle/n;->ON_START:Landroidx/lifecycle/n;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v1, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 40
    .line 41
    :goto_0
    iget-object v2, p1, LD/i;->a:Ljava/lang/Runnable;

    .line 42
    .line 43
    iget-object v3, p1, LD/i;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 44
    .line 45
    iget-object v4, p0, LD/f;->c:LD/k;

    .line 46
    .line 47
    if-ne p2, v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    sget-object v1, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 57
    .line 58
    if-ne p2, v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1, v4}, LD/i;->b(LD/k;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/o;)Landroidx/lifecycle/n;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p2, p1, :cond_5

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 74
    .line 75
    .line 76
    :cond_5
    :goto_1
    return-void
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
