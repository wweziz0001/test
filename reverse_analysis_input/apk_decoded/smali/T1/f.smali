.class public final synthetic LT1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:LT1/g;


# direct methods
.method public synthetic constructor <init>(LT1/g;I)V
    .locals 0

    .line 1
    iput p2, p0, LT1/f;->l:I

    iput-object p1, p0, LT1/f;->m:LT1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, LT1/f;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LT1/f;->m:LT1/g;

    invoke-static {v0}, LT1/g;->b(LT1/g;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LT1/f;->m:LT1/g;

    invoke-static {v0}, LT1/g;->a(LT1/g;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
