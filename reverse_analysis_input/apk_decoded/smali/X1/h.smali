.class public final LX1/h;
.super LX1/f;
.source "SourceFile"


# instance fields
.field public final f:Landroid/net/ConnectivityManager;

.field public final g:LW2/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;LZ1/i;)V
    .locals 1

    .line 1
    const-string v0, "taskExecutor"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LX1/f;-><init>(Landroid/content/Context;LZ1/i;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LX1/f;->b:Landroid/content/Context;

    .line 10
    .line 11
    const-string p2, "connectivity"

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 18
    .line 19
    invoke-static {p1, p2}, LN3/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 23
    .line 24
    iput-object p1, p0, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    new-instance p1, LW2/a;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, LW2/a;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, LX1/h;->g:LW2/a;

    .line 33
    .line 34
    return-void
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


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    invoke-static {v0}, LX1/i;->a(Landroid/net/ConnectivityManager;)LV1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final c()V
    .locals 4

    .line 1
    const-string v0, "Received exception while registering network callback"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LX1/i;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v3, "Registering network callback"

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    iget-object v2, p0, LX1/h;->g:LW2/a;

    .line 17
    .line 18
    invoke-static {v1, v2}, La2/m;->a(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :goto_0
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, LX1/i;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v3, v0, v1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :goto_1
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, LX1/i;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0, v1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final d()V
    .locals 4

    .line 1
    const-string v0, "Received exception while unregistering network callback"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LX1/i;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v3, "Unregistering network callback"

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LX1/h;->f:Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    iget-object v2, p0, LX1/h;->g:LW2/a;

    .line 17
    .line 18
    invoke-static {v1, v2}, La2/k;->c(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :goto_0
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, LX1/i;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v3, v0, v1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :goto_1
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, LX1/i;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0, v1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method
