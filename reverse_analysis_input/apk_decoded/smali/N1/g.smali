.class public final synthetic LN1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/a;


# instance fields
.field public final synthetic a:LN1/j;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(LN1/j;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN1/g;->a:LN1/j;

    iput-object p2, p0, LN1/g;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/content/res/Configuration;

    .line 2
    .line 3
    const-string p1, "this$0"

    .line 4
    .line 5
    iget-object v0, p0, LN1/g;->a:LN1/j;

    .line 6
    .line 7
    invoke-static {v0, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "$activity"

    .line 11
    .line 12
    iget-object v1, p0, LN1/g;->b:Landroid/app/Activity;

    .line 13
    .line 14
    invoke-static {v1, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v0, LN1/j;->e:LZ1/m;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, LN1/j;->e(Landroid/app/Activity;)LK1/l;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v1, v0}, LZ1/m;->C(Landroid/app/Activity;LK1/l;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
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
