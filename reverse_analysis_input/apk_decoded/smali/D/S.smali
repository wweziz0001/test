.class public LD/S;
.super LD/U;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LD/U;-><init>()V

    .line 2
    invoke-static {}, LD/Q;->i()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LD/S;->a:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LD/b0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LD/U;-><init>(LD/b0;)V

    .line 4
    invoke-virtual {p1}, LD/b0;->b()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LD/Q;->j(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LD/Q;->i()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LD/S;->a:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LD/b0;
    .locals 3

    .line 1
    invoke-virtual {p0}, LD/U;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LD/S;->a:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, LD/Q;->k(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, LD/b0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, LD/b0;->a:LD/a0;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, LD/a0;->k([Lw/c;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public c(Lw/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/S;->a:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/c;->b()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/Q;->z(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public d(Lw/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/S;->a:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/c;->b()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/Q;->t(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
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
