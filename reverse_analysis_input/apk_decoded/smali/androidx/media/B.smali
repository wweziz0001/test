.class public final Landroidx/media/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/media/E;


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_2

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Landroidx/media/D;

    .line 5
    invoke-direct {v0, p1, p2, p3}, Landroidx/media/E;-><init>(ILjava/lang/String;I)V

    .line 6
    invoke-static {p1, p2, p3}, LS2/b;->o(ILjava/lang/String;I)V

    .line 7
    iput-object v0, p0, Landroidx/media/B;->a:Landroidx/media/E;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroidx/media/E;

    invoke-direct {v0, p1, p2, p3}, Landroidx/media/E;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Landroidx/media/B;->a:Landroidx/media/E;

    :goto_0
    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "packageName should be nonempty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "package shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V
    .locals 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {p1}, Landroidx/media/C;->h(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 14
    new-instance v0, Landroidx/media/D;

    .line 15
    invoke-static {p1}, Landroidx/media/C;->h(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroidx/media/C;->a(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    move-result v2

    .line 16
    invoke-static {p1}, Landroidx/media/C;->q(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    move-result p1

    .line 17
    invoke-direct {v0, v2, v1, p1}, Landroidx/media/E;-><init>(ILjava/lang/String;I)V

    .line 18
    iput-object v0, p0, Landroidx/media/B;->a:Landroidx/media/E;

    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "packageName should be nonempty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "package shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/media/B;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Landroidx/media/B;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/media/B;->a:Landroidx/media/E;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media/B;->a:Landroidx/media/E;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/media/E;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media/B;->a:Landroidx/media/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media/E;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
