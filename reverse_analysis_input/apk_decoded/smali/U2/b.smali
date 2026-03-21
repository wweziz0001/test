.class public final LU2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU2/d;
.implements Lcom/dexterous/flutterlocalnotifications/h;


# instance fields
.field public final synthetic l:I

.field public final m:Ln3/p;


# direct methods
.method public synthetic constructor <init>(Ln3/p;I)V
    .locals 0

    .line 1
    iput p2, p0, LU2/b;->l:I

    iput-object p1, p0, LU2/b;->m:Ln3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget v0, p0, LU2/b;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LU2/b;->m:Ln3/p;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, LU2/b;->m:Ln3/p;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LU2/b;->m:Ln3/p;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LU2/b;->m:Ln3/p;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public b(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2

    .line 1
    const-string v0, "sqlite_error"

    .line 2
    .line 3
    iget-object v1, p0, LU2/b;->m:Ln3/p;

    .line 4
    .line 5
    invoke-interface {v1, v0, p1, p2}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public c()V
    .locals 4

    .line 1
    iget v0, p0, LU2/b;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LU2/b;->m:Ln3/p;

    .line 8
    .line 9
    const-string v2, "permissionRequestInProgress"

    .line 10
    .line 11
    const-string v3, "Another permission request is already in progress"

    .line 12
    .line 13
    invoke-interface {v1, v2, v3, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    iget-object v1, p0, LU2/b;->m:Ln3/p;

    .line 19
    .line 20
    const-string v2, "permissionRequestInProgress"

    .line 21
    .line 22
    const-string v3, "Another permission request is already in progress"

    .line 23
    .line 24
    invoke-interface {v1, v2, v3, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    const/4 v0, 0x0

    .line 29
    iget-object v1, p0, LU2/b;->m:Ln3/p;

    .line 30
    .line 31
    const-string v2, "permissionRequestInProgress"

    .line 32
    .line 33
    const-string v3, "Another permission request is already in progress"

    .line 34
    .line 35
    invoke-interface {v1, v2, v3, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    const/4 v0, 0x0

    .line 40
    iget-object v1, p0, LU2/b;->m:Ln3/p;

    .line 41
    .line 42
    const-string v2, "permissionRequestInProgress"

    .line 43
    .line 44
    const-string v3, "Another permission request is already in progress"

    .line 45
    .line 46
    invoke-interface {v1, v2, v3, v0}, Ln3/p;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU2/b;->m:Ln3/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln3/p;->success(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
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
