.class public final LS2/f;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LS2/g;


# direct methods
.method public synthetic constructor <init>(LS2/g;I)V
    .locals 0

    .line 1
    iput p2, p0, LS2/f;->a:I

    iput-object p1, p0, LS2/f;->b:LS2/g;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget v0, p0, LS2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "intent"

    .line 12
    .line 13
    invoke-static {p2, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "android.media.extra.SCO_AUDIO_STATE"

    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v1, "android.media.extra.SCO_AUDIO_PREVIOUS_STATE"

    .line 28
    .line 29
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p2, p0, LS2/f;->b:LS2/g;

    .line 42
    .line 43
    const-string v0, "onScoAudioStateUpdated"

    .line 44
    .line 45
    invoke-virtual {p2, v0, p1}, LS2/g;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    const-string v0, "context"

    .line 50
    .line 51
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string p1, "intent"

    .line 55
    .line 56
    invoke-static {p2, p1}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string p2, "android.media.AUDIO_BECOMING_NOISY"

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    new-array p1, p1, [Ljava/lang/Object;

    .line 73
    .line 74
    iget-object p2, p0, LS2/f;->b:LS2/g;

    .line 75
    .line 76
    const-string v0, "onBecomingNoisy"

    .line 77
    .line 78
    invoke-virtual {p2, v0, p1}, LS2/g;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
