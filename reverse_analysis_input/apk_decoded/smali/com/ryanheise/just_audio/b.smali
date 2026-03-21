.class public final synthetic Lcom/ryanheise/just_audio/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/s0;


# instance fields
.field public final synthetic a:Lcom/ryanheise/just_audio/AudioPlayer;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/just_audio/AudioPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ryanheise/just_audio/b;->a:Lcom/ryanheise/just_audio/AudioPlayer;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;LD0/A;Lj0/h;Lz0/d;Lr0/b;)[Lh0/o0;
    .locals 6

    .line 1
    move-object v2, p2

    check-cast v2, Lh0/D;

    move-object v3, p3

    check-cast v3, Lh0/D;

    move-object v4, p4

    check-cast v4, Lh0/D;

    move-object v5, p5

    check-cast v5, Lh0/D;

    iget-object v0, p0, Lcom/ryanheise/just_audio/b;->a:Lcom/ryanheise/just_audio/AudioPlayer;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/ryanheise/just_audio/AudioPlayer;->b(Lcom/ryanheise/just_audio/AudioPlayer;Landroid/os/Handler;Lh0/D;Lh0/D;Lh0/D;Lh0/D;)[Lh0/o0;

    move-result-object p1

    return-object p1
.end method
