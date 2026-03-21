.class public final LM2/g;
.super LJ2/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p2, p0, LM2/g;->b:I

    invoke-direct {p0, p1}, LJ2/g;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    .line 1
    iget v0, p0, LM2/g;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/sql/Timestamp;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Ljava/sql/Date;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-direct {v0, v1, v2}, Ljava/sql/Date;-><init>(J)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
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
