.class public final synthetic Lcom/ryanheise/audioservice/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/t;


# instance fields
.field public final synthetic l:Lcom/ryanheise/audioservice/AudioServicePlugin;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/AudioServicePlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ryanheise/audioservice/a;->l:Lcom/ryanheise/audioservice/AudioServicePlugin;

    return-void
.end method


# virtual methods
.method public final onNewIntent(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->l:Lcom/ryanheise/audioservice/AudioServicePlugin;

    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/AudioServicePlugin;->a(Lcom/ryanheise/audioservice/AudioServicePlugin;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
