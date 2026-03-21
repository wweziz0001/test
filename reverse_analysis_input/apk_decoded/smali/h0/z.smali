.class public final synthetic Lh0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/i;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lh0/z;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh0/z;->m:I

    return-void
.end method

.method public synthetic constructor <init>(Li0/a;ILa0/N;La0/N;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput p1, p0, Lh0/z;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lh0/z;->m:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lh0/z;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lh0/z;->m:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iput-boolean v1, p1, Li0/h;->u:Z

    .line 17
    .line 18
    :cond_0
    iput v0, p1, Li0/h;->k:I

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p1, La0/M;

    .line 22
    .line 23
    iget v0, p0, Lh0/z;->m:I

    .line 24
    .line 25
    invoke-interface {p1, v0}, La0/M;->onRepeatModeChanged(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
