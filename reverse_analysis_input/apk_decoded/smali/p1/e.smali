.class public final synthetic Lp1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp1/e;->l:I

    iput-object p1, p0, Lp1/e;->m:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lp1/e;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LD0/j;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, v1}, LD0/j;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lp1/d;->a:La0/z;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Lp1/e;->m:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v3, v0, v1, v2}, Lp1/d;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Lp1/c;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 26
    .line 27
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x1

    .line 32
    const-wide/16 v7, 0x0

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lp1/e;

    .line 39
    .line 40
    iget-object v2, p0, Lp1/e;->m:Landroid/content/Context;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v1, v2, v3}, Lp1/e;-><init>(Landroid/content/Context;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
