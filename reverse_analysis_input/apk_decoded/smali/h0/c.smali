.class public final Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# virtual methods
.method public a(DD)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lh0/c;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lh0/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [D

    .line 6
    .line 7
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    aget-wide v5, v1, v4

    .line 14
    .line 15
    mul-double/2addr v5, p1

    .line 16
    const/4 v0, 0x7

    .line 17
    aget-wide v7, v1, v0

    .line 18
    .line 19
    mul-double/2addr v7, p3

    .line 20
    add-double/2addr v7, v5

    .line 21
    const/16 v0, 0xf

    .line 22
    .line 23
    aget-wide v5, v1, v0

    .line 24
    .line 25
    add-double/2addr v7, v5

    .line 26
    div-double/2addr v2, v7

    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    aget-wide v5, v1, v0

    .line 29
    .line 30
    mul-double/2addr v5, p1

    .line 31
    const/4 v7, 0x4

    .line 32
    aget-wide v7, v1, v7

    .line 33
    .line 34
    mul-double/2addr v7, p3

    .line 35
    add-double/2addr v7, v5

    .line 36
    const/16 v5, 0xc

    .line 37
    .line 38
    aget-wide v5, v1, v5

    .line 39
    .line 40
    add-double/2addr v7, v5

    .line 41
    mul-double/2addr v7, v2

    .line 42
    const/4 v5, 0x1

    .line 43
    aget-wide v9, v1, v5

    .line 44
    .line 45
    mul-double/2addr v9, p1

    .line 46
    const/4 p1, 0x5

    .line 47
    aget-wide p1, v1, p1

    .line 48
    .line 49
    mul-double/2addr p1, p3

    .line 50
    add-double/2addr p1, v9

    .line 51
    const/16 p3, 0xd

    .line 52
    .line 53
    aget-wide p3, v1, p3

    .line 54
    .line 55
    add-double/2addr p1, p3

    .line 56
    mul-double/2addr p1, v2

    .line 57
    iget-object p3, p0, Lh0/c;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p3, [D

    .line 60
    .line 61
    aget-wide v1, p3, v0

    .line 62
    .line 63
    cmpg-double p4, v7, v1

    .line 64
    .line 65
    if-gez p4, :cond_1

    .line 66
    .line 67
    aput-wide v7, p3, v0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    aget-wide v0, p3, v5

    .line 71
    .line 72
    cmpl-double p4, v7, v0

    .line 73
    .line 74
    if-lez p4, :cond_2

    .line 75
    .line 76
    aput-wide v7, p3, v5

    .line 77
    .line 78
    :cond_2
    :goto_1
    const/4 p4, 0x2

    .line 79
    aget-wide v0, p3, p4

    .line 80
    .line 81
    cmpg-double v0, p1, v0

    .line 82
    .line 83
    if-gez v0, :cond_3

    .line 84
    .line 85
    aput-wide p1, p3, p4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    aget-wide v0, p3, v4

    .line 89
    .line 90
    cmpl-double p4, p1, v0

    .line 91
    .line 92
    if-lez p4, :cond_4

    .line 93
    .line 94
    aput-wide p1, p3, v4

    .line 95
    .line 96
    :cond_4
    :goto_2
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh0/c;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh0/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, p0, Lh0/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lh0/b;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lh0/c;->a:Z

    .line 18
    .line 19
    :cond_0
    return-void
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
