.class public final Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/G;


# instance fields
.field public final a:Lh0/c;

.field public final b:Lf0/g;

.field public final c:Lp1/b;

.field public final d:Lf/a;

.field public final e:LA0/b;

.field public final f:J


# direct methods
.method public constructor <init>(Lf0/g;)V
    .locals 3

    .line 1
    new-instance v0, Lh0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lh0/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, La0/z;

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-direct {v1, v2}, La0/z;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lh0/c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lh0/c;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->b:Lf0/g;

    .line 22
    .line 23
    new-instance p1, Lf/a;

    .line 24
    .line 25
    invoke-direct {p1}, Lf/a;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->d:Lf/a;

    .line 29
    .line 30
    new-instance p1, LA0/b;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {p1, v1}, LA0/b;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->e:LA0/b;

    .line 37
    .line 38
    const-wide/16 v1, 0x7530

    .line 39
    .line 40
    iput-wide v1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->f:J

    .line 41
    .line 42
    new-instance p1, Lp1/b;

    .line 43
    .line 44
    const/16 v1, 0x11

    .line 45
    .line 46
    invoke-direct {p1, v1}, Lp1/b;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->c:Lp1/b;

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, v0, Lh0/c;->a:Z

    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final a(La0/A;)Lx0/J;
    .locals 14

    .line 1
    iget-object v0, p1, La0/A;->b:La0/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm3/i;

    .line 7
    .line 8
    const/16 v1, 0x1c

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lm3/i;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, La0/A;->b:La0/w;

    .line 14
    .line 15
    iget-object v1, v1, La0/w;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, LZ1/e;

    .line 24
    .line 25
    const/16 v3, 0x14

    .line 26
    .line 27
    invoke-direct {v2, v0, v3, v1}, LZ1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v7, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v7, v0

    .line 33
    :goto_0
    new-instance v0, Lv0/c;

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->d:Lf/a;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lf/a;->b(La0/A;)Lm0/i;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    iget-object v11, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->e:LA0/b;

    .line 42
    .line 43
    iget-object v9, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->c:Lp1/b;

    .line 44
    .line 45
    iget-object v8, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lh0/c;

    .line 46
    .line 47
    iget-wide v12, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->f:J

    .line 48
    .line 49
    iget-object v6, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->b:Lf0/g;

    .line 50
    .line 51
    move-object v4, v0

    .line 52
    move-object v5, p1

    .line 53
    invoke-direct/range {v4 .. v13}, Lv0/c;-><init>(La0/A;Lf0/g;LB0/t;Lh0/c;Lp1/b;Lm0/i;LA0/b;J)V

    .line 54
    .line 55
    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lh0/c;

    .line 2
    .line 3
    iput-boolean p1, v0, Lh0/c;->a:Z

    .line 4
    .line 5
    return-void
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

.method public final c(La0/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lh0/c;

    .line 2
    .line 3
    iput-object p1, v0, Lh0/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
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
