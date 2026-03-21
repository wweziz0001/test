.class public final synthetic Lcom/ryanheise/just_audio/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ln3/p;


# direct methods
.method public synthetic constructor <init>(Ln3/p;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/ryanheise/just_audio/a;->l:I

    iput-object p1, p0, Lcom/ryanheise/just_audio/a;->m:Ln3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/ryanheise/just_audio/a;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/ryanheise/just_audio/a;->m:Ln3/p;

    invoke-static {v0}, Lcom/ryanheise/just_audio/AudioPlayer;->d(Ln3/p;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/ryanheise/just_audio/a;->m:Ln3/p;

    invoke-static {v0}, Lcom/ryanheise/just_audio/AudioPlayer;->c(Ln3/p;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/ryanheise/just_audio/a;->m:Ln3/p;

    invoke-static {v0}, Lcom/ryanheise/just_audio/AudioPlayer;->a(Ln3/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
