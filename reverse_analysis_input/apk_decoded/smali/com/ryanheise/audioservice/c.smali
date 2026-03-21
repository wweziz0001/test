.class public final synthetic Lcom/ryanheise/audioservice/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/ryanheise/audioservice/c;->l:I

    iput-object p1, p0, Lcom/ryanheise/audioservice/c;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/ryanheise/audioservice/c;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/c;->m:Ljava/lang/Object;

    check-cast v0, Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->a(Lcom/ryanheise/audioservice/AudioService;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/c;->m:Ljava/lang/Object;

    check-cast v0, Ln3/p;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->c(Ln3/p;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/ryanheise/audioservice/c;->m:Ljava/lang/Object;

    check-cast v0, Ln3/p;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->e(Ln3/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
