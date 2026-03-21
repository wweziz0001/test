.class public final LA3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;


# instance fields
.field public l:Ln3/q;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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
.end method


# virtual methods
.method public final onAttachedToEngine(Lj3/a;)V
    .locals 3

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "getBinaryMessenger(...)"

    .line 7
    .line 8
    iget-object v1, p1, Lj3/a;->c:Ln3/f;

    .line 9
    .line 10
    invoke-static {v1, v0}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "getApplicationContext(...)"

    .line 14
    .line 15
    iget-object p1, p1, Lj3/a;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {p1, v0}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ln3/q;

    .line 21
    .line 22
    const-string v2, "PonnamKarthik/fluttertoast"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LA3/a;->l:Ln3/q;

    .line 28
    .line 29
    new-instance v0, LZ1/e;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v2, v1}, LZ1/e;-><init>(CI)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, LZ1/e;->m:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object p1, p0, LA3/a;->l:Ln3/q;

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ln3/q;->b(Ln3/o;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
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

.method public final onDetachedFromEngine(Lj3/a;)V
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LA3/a;->l:Ln3/q;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ln3/q;->b(Ln3/o;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object v0, p0, LA3/a;->l:Ln3/q;

    .line 15
    .line 16
    return-void
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
