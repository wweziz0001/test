.class public final Li3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Landroid/view/View$OnFocusChangeListener;

.field public final synthetic n:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/view/View$OnFocusChangeListener;Li3/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li3/a;->l:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a;->m:Landroid/view/View$OnFocusChangeListener;

    iput-object p2, p0, Li3/a;->n:Landroid/widget/FrameLayout;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugin/platform/i;Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li3/a;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a;->n:Landroid/widget/FrameLayout;

    iput-object p2, p0, Li3/a;->m:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method


# virtual methods
.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Li3/a;->l:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ly3/H;

    .line 7
    .line 8
    const/16 p2, 0x19

    .line 9
    .line 10
    invoke-direct {p1, p2}, Ly3/H;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Li3/a;->n:Landroid/widget/FrameLayout;

    .line 14
    .line 15
    check-cast p2, Lio/flutter/plugin/platform/i;

    .line 16
    .line 17
    invoke-static {p2, p1}, Li4/a;->a0(Landroid/view/View;Lz3/c;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Li3/a;->m:Landroid/view/View$OnFocusChangeListener;

    .line 22
    .line 23
    invoke-interface {v0, p2, p1}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object p1, p0, Li3/a;->n:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    check-cast p1, Li3/b;

    .line 30
    .line 31
    new-instance p2, Ly3/H;

    .line 32
    .line 33
    const/16 v0, 0x19

    .line 34
    .line 35
    invoke-direct {p2, v0}, Ly3/H;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Li4/a;->a0(Landroid/view/View;Lz3/c;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object v0, p0, Li3/a;->m:Landroid/view/View$OnFocusChangeListener;

    .line 43
    .line 44
    invoke-interface {v0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
