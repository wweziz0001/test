.class public final synthetic Ly3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM3/l;


# instance fields
.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly3/o;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    iget v1, p0, Ly3/o;->l:I

    check-cast p1, LB3/d;

    packed-switch v1, :pswitch_data_0

    sget p1, Ly3/Z;->o:I

    return-object v0

    :pswitch_0
    sget p1, Ly3/V;->c:I

    return-object v0

    :pswitch_1
    sget p1, Ly3/Q;->h:I

    :pswitch_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
