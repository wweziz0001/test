.class public final La0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, La0/m;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p2, p0, La0/m;->a:Z

    .line 5
    iput-object p1, p0, La0/m;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La0/m;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La0/m;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 13
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
.end method

.method public b()La0/n;
    .locals 2

    .line 1
    iget-boolean v0, p0, La0/m;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, La0/m;->a:Z

    .line 9
    .line 10
    new-instance v0, La0/n;

    .line 11
    .line 12
    iget-object v1, p0, La0/m;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/util/SparseBooleanArray;

    .line 15
    .line 16
    invoke-direct {v0, v1}, La0/n;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public c(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, La0/m;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La0/m;->a:Z

    .line 7
    .line 8
    iget-object v1, p0, La0/m;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lio/flutter/embedding/android/K;

    .line 11
    .line 12
    iget v2, v1, Lio/flutter/embedding/android/K;->b:I

    .line 13
    .line 14
    sub-int/2addr v2, v0

    .line 15
    iput v2, v1, Lio/flutter/embedding/android/K;->b:I

    .line 16
    .line 17
    iget-boolean v0, v1, Lio/flutter/embedding/android/K;->c:Z

    .line 18
    .line 19
    or-int/2addr p1, v0

    .line 20
    iput-boolean p1, v1, Lio/flutter/embedding/android/K;->c:Z

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-object p1, v1, Lio/flutter/embedding/android/K;->d:LZ1/m;

    .line 27
    .line 28
    iget-object v0, v1, Lio/flutter/embedding/android/K;->a:Landroid/view/KeyEvent;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, LZ1/m;->B(Landroid/view/KeyEvent;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "The onKeyEventHandledCallback should be called exactly once."

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
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
