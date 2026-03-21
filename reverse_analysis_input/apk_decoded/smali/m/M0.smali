.class public final Lm/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm/M0;->l:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/M0;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm/S0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm/M0;->l:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/M0;->m:Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lm/S0;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lm/M0;->l:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm/M0;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lm/S0;

    .line 9
    .line 10
    iget-object v0, p1, Lm/S0;->k:Landroid/view/Window$Callback;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lm/M0;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->V:Lm/O0;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object p1, p1, Lm/O0;->m:Ll/i;

    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ll/i;->collapseActionView()Z

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
