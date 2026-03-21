.class public final Landroidx/media/t;
.super Landroidx/media/s;
.source "SourceFile"


# instance fields
.field public final synthetic g:Landroidx/media/A;


# direct methods
.method public constructor <init>(Landroidx/media/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media/t;->g:Landroidx/media/A;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media/s;-><init>(Landroidx/media/A;)V

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


# virtual methods
.method public final a()Landroidx/media/B;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media/t;->g:Landroidx/media/A;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media/A;->mCurConnection:Landroidx/media/k;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media/A;->mConnectionFromFwk:Landroidx/media/k;

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/media/B;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media/q;->b:Landroidx/media/p;

    .line 14
    .line 15
    invoke-static {v1}, LS2/b;->j(Landroidx/media/p;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroidx/media/B;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v0, v1, Landroidx/media/k;->d:Landroidx/media/B;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
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
