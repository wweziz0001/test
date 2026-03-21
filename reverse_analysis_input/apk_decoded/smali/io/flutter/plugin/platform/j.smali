.class public final synthetic Lio/flutter/plugin/platform/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lio/flutter/plugin/platform/j;->a:I

    iput-object p3, p0, Lio/flutter/plugin/platform/j;->c:Ljava/lang/Object;

    iput p1, p0, Lio/flutter/plugin/platform/j;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget p1, p0, Lio/flutter/plugin/platform/j;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/flutter/plugin/platform/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lio/flutter/plugin/platform/o;

    .line 9
    .line 10
    iget v0, p0, Lio/flutter/plugin/platform/j;->b:I

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Lio/flutter/plugin/platform/o;->g:LZ1/c;

    .line 15
    .line 16
    iget-object p1, p1, LZ1/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ln3/q;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    const-string v1, "viewFocused"

    .line 29
    .line 30
    invoke-virtual {p1, v1, p2, v0}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p1, Lio/flutter/plugin/platform/o;->f:Lio/flutter/plugin/editing/i;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/i;->b(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void

    .line 42
    :pswitch_0
    iget-object p1, p0, Lio/flutter/plugin/platform/j;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lio/flutter/plugin/platform/p;

    .line 45
    .line 46
    iget v0, p0, Lio/flutter/plugin/platform/j;->b:I

    .line 47
    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    iget-object p1, p1, Lio/flutter/plugin/platform/p;->h:LZ1/e;

    .line 51
    .line 52
    iget-object p1, p1, LZ1/e;->m:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ln3/q;

    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/4 v0, 0x0

    .line 64
    const-string v1, "viewFocused"

    .line 65
    .line 66
    invoke-virtual {p1, v1, p2, v0}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    iget-object p1, p1, Lio/flutter/plugin/platform/p;->g:Lio/flutter/plugin/editing/i;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/i;->b(I)V

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
