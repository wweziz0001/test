.class public final LW2/a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LW2/a;->a:I

    iput-object p1, p0, LW2/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, LW2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LW2/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LW2/b;

    .line 13
    .line 14
    iget-object v1, v0, LW2/b;->l:LB0/d;

    .line 15
    .line 16
    iget-object v1, v1, LB0/d;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LB0/d;->j(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, LD0/y;

    .line 29
    .line 30
    const/16 v2, 0x9

    .line 31
    .line 32
    invoke-direct {v1, v0, v2, p1}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v0, LW2/b;->n:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    .line 1
    iget v0, p0, LW2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "network"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "capabilities"

    .line 12
    .line 13
    invoke-static {p2, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, LX1/i;->a:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Network capabilities changed: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, v0, p2}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LW2/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LX1/h;

    .line 42
    .line 43
    iget-object p2, p1, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 44
    .line 45
    invoke-static {p2}, LX1/i;->a(Landroid/net/ConnectivityManager;)LV1/d;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, LX1/f;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    iget-object p1, p0, LW2/a;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, LW2/b;

    .line 56
    .line 57
    iget-object v0, p1, LW2/b;->l:LB0/d;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, LB0/d;->j(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    new-instance v0, LD0/y;

    .line 67
    .line 68
    const/16 v1, 0x9

    .line 69
    .line 70
    invoke-direct {v0, p1, v1, p2}, LD0/y;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p1, LW2/b;->n:Landroid/os/Handler;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final onLost(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, LW2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "network"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, LX1/i;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "Network connection lost"

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LW2/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, LX1/h;

    .line 25
    .line 26
    iget-object v0, p1, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 27
    .line 28
    invoke-static {v0}, LX1/i;->a(Landroid/net/ConnectivityManager;)LV1/d;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, LX1/f;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    iget-object p1, p0, LW2/a;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LW2/b;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, LA3/c;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {v0, p1, v1}, LA3/c;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, LW2/b;->n:Landroid/os/Handler;

    .line 50
    .line 51
    const-wide/16 v1, 0x1f4

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
.end method
