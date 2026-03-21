.class public final synthetic Landroidx/activity/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/d;->a:I

    iput-object p1, p0, Landroidx/activity/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/activity/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/J;

    invoke-static {v0}, Landroidx/lifecycle/J;->a(Landroidx/lifecycle/J;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/w;

    invoke-static {v0}, Landroidx/activity/m;->b(Landroidx/fragment/app/w;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
