.class public final LI1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/h;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LI1/a;->l:I

    iput-object p1, p0, LI1/a;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;LE3/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LI1/a;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LI1/a;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, LN3/p;

    .line 9
    .line 10
    iput-object p1, p2, LN3/p;->l:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, LZ3/a;

    .line 13
    .line 14
    invoke-direct {p1, p0}, LZ3/a;-><init>(LY3/h;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    check-cast p1, LB3/g;

    .line 19
    .line 20
    iget-object p1, p0, LI1/a;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LL/P;

    .line 23
    .line 24
    iget-object v0, p1, LL/P;->s:LB0/d;

    .line 25
    .line 26
    invoke-virtual {v0}, LB0/d;->k()LL/a0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v0, v0, LL/Q;

    .line 31
    .line 32
    sget-object v1, LB3/g;->a:LB3/g;

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {p1, v0, p2}, LL/P;->e(LL/P;ZLE3/d;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object p2, LF3/a;->l:LF3/a;

    .line 42
    .line 43
    if-ne p1, p2, :cond_0

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    :cond_0
    return-object v1

    .line 47
    :pswitch_1
    iget-object p2, p0, LI1/a;->m:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, LK1/i;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, LK1/i;->accept(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, LB3/g;->a:LB3/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
