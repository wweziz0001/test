.class public final synthetic Lio/flutter/plugin/platform/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugin/platform/p;

.field public final synthetic c:Lm3/f;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/p;Lm3/f;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio/flutter/plugin/platform/k;->a:I

    iput-object p1, p0, Lio/flutter/plugin/platform/k;->b:Lio/flutter/plugin/platform/p;

    iput-object p2, p0, Lio/flutter/plugin/platform/k;->c:Lm3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget p1, p0, Lio/flutter/plugin/platform/k;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/flutter/plugin/platform/k;->b:Lio/flutter/plugin/platform/p;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p1, p1, Lio/flutter/plugin/platform/p;->h:LZ1/e;

    .line 11
    .line 12
    iget-object p2, p0, Lio/flutter/plugin/platform/k;->c:Lm3/f;

    .line 13
    .line 14
    iget-object p1, p1, LZ1/e;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ln3/q;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget p2, p2, Lm3/f;->a:I

    .line 22
    .line 23
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    iget-object p1, p0, Lio/flutter/plugin/platform/k;->c:Lm3/f;

    .line 39
    .line 40
    iget-object v0, p0, Lio/flutter/plugin/platform/k;->b:Lio/flutter/plugin/platform/p;

    .line 41
    .line 42
    iget p1, p1, Lm3/f;->a:I

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    iget-object p2, v0, Lio/flutter/plugin/platform/p;->h:LZ1/e;

    .line 47
    .line 48
    iget-object p2, p2, LZ1/e;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p2, Ln3/q;

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 v0, 0x0

    .line 60
    const-string v1, "viewFocused"

    .line 61
    .line 62
    invoke-virtual {p2, v1, p1, v0}, Ln3/q;->a(Ljava/lang/String;Ljava/lang/Object;Ln3/p;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object p2, v0, Lio/flutter/plugin/platform/p;->g:Lio/flutter/plugin/editing/i;

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lio/flutter/plugin/editing/i;->b(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_1
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
