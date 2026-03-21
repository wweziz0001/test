.class public final La4/x;
.super LN3/i;
.source "SourceFile"

# interfaces
.implements LM3/p;


# static fields
.field public static final n:La4/x;

.field public static final o:La4/x;

.field public static final p:La4/x;


# instance fields
.field public final synthetic m:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La4/x;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, La4/x;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La4/x;->n:La4/x;

    .line 9
    .line 10
    new-instance v0, La4/x;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, La4/x;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La4/x;->o:La4/x;

    .line 18
    .line 19
    new-instance v0, La4/x;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, La4/x;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La4/x;->p:La4/x;

    .line 27
    .line 28
    return-void
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
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, La4/x;->m:I

    invoke-direct {p0, p1}, LN3/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, La4/x;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La4/z;

    .line 7
    .line 8
    check-cast p2, LE3/g;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, LV3/g0;

    .line 12
    .line 13
    check-cast p2, LE3/g;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of p1, p2, LV3/g0;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    check-cast p2, LV3/g0;

    .line 23
    .line 24
    move-object p1, p2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_1
    check-cast p2, LE3/g;

    .line 29
    .line 30
    instance-of v0, p2, LV3/g0;

    .line 31
    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    instance-of v0, p1, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    :goto_1
    const/4 v0, 0x1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move p1, v0

    .line 51
    :goto_2
    if-nez p1, :cond_4

    .line 52
    .line 53
    move-object p1, p2

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    add-int/2addr p1, v0

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_5
    :goto_3
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
