.class public final synthetic Lcom/ryanheise/audioservice/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

.field public final synthetic n:Ljava/util/Map;

.field public final synthetic o:Ln3/p;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/ryanheise/audioservice/b;->l:I

    iput-object p1, p0, Lcom/ryanheise/audioservice/b;->m:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    iput-object p2, p0, Lcom/ryanheise/audioservice/b;->n:Ljava/util/Map;

    iput-object p3, p0, Lcom/ryanheise/audioservice/b;->o:Ln3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/ryanheise/audioservice/b;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->n:Ljava/util/Map;

    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->o:Ln3/p;

    iget-object v2, p0, Lcom/ryanheise/audioservice/b;->m:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    invoke-static {v2, v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->f(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->n:Ljava/util/Map;

    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->o:Ln3/p;

    iget-object v2, p0, Lcom/ryanheise/audioservice/b;->m:Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;

    invoke-static {v2, v0, v1}, Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;->a(Lcom/ryanheise/audioservice/AudioServicePlugin$AudioHandlerInterface;Ljava/util/Map;Ln3/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
