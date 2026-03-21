.class public final Lt0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Closeable;


# instance fields
.field public final l:Landroid/os/Handler;

.field public final m:J

.field public n:Z

.field public final synthetic o:Lt0/l;


# direct methods
.method public constructor <init>(Lt0/l;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/k;->o:Lt0/l;

    .line 5
    .line 6
    iput-wide p2, p0, Lt0/k;->m:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Ld0/w;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lt0/k;->l:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lt0/k;->n:Z

    .line 3
    .line 4
    iget-object v0, p0, Lt0/k;->l:Landroid/os/Handler;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 7
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

.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt0/k;->o:Lt0/l;

    .line 2
    .line 3
    iget-object v1, v0, Lt0/l;->r:LD0/d;

    .line 4
    .line 5
    iget-object v2, v0, Lt0/l;->s:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v0, v0, Lt0/l;->v:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v3, Lm2/g0;->r:Lm2/g0;

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    invoke-virtual {v1, v4, v0, v3, v2}, LD0/d;->i(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lt0/z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, LD0/d;->r(Lt0/z;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lt0/k;->l:Landroid/os/Handler;

    .line 20
    .line 21
    iget-wide v1, p0, Lt0/k;->m:J

    .line 22
    .line 23
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 24
    .line 25
    .line 26
    return-void
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
