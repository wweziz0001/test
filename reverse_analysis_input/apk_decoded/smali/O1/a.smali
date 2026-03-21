.class public final LO1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LO1/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO1/a;->a:LO1/a;

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
.end method


# virtual methods
.method public final a(Landroid/content/Context;)LD/b0;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Landroid/view/WindowManager;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/view/WindowManager;

    .line 13
    .line 14
    invoke-static {p1}, LA3/b;->x(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, LA3/b;->k(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "context.getSystemService\u2026indowMetrics.windowInsets"

    .line 23
    .line 24
    invoke-static {p1, v0}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0}, LD/b0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/b0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
