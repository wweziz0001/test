.class public final synthetic Lc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM3/a;


# instance fields
.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lc;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lg;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Lg;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lt3/b;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, v1}, Lt3/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    const/high16 v0, 0x2000000

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_2
    new-instance v0, Lg;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lg;-><init>(I)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method
