.class public Landroidx/work/impl/background/systemalarm/RescheduleReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "RescheduleReceiver"

    .line 2
    .line 3
    invoke-static {v0}, LQ1/q;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;->a:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "Received intent "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {v0, v1, p2}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, LR1/q;->E0(Landroid/content/Context;)LR1/q;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, LR1/q;->o:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :try_start_1
    iget-object v1, p1, LR1/q;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    iput-object p2, p1, LR1/q;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 46
    .line 47
    iget-boolean v1, p1, LR1/q;->j:Z

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 52
    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    iput-object p2, p1, LR1/q;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 56
    .line 57
    :cond_1
    monitor-exit v0

    .line 58
    goto :goto_2

    .line 59
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    sget-object v0, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;->a:Ljava/lang/String;

    .line 67
    .line 68
    const-string v1, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."

    .line 69
    .line 70
    invoke-virtual {p2, v0, v1, p1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    return-void
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
