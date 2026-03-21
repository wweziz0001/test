.class public final LI2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LI2/l;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, LI2/l;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr1/g;

    .line 7
    .line 8
    check-cast p2, Lr1/g;

    .line 9
    .line 10
    iget-object v0, p1, Lr1/g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v3, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v1

    .line 19
    :goto_0
    iget-object v4, p2, Lr1/g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    move v4, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v4, v1

    .line 26
    :goto_1
    const/4 v5, -0x1

    .line 27
    if-eq v3, v4, :cond_4

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_2
    move v1, v2

    .line 32
    goto :goto_3

    .line 33
    :cond_3
    :goto_2
    move v1, v5

    .line 34
    goto :goto_3

    .line 35
    :cond_4
    iget-boolean v0, p1, Lr1/g;->a:Z

    .line 36
    .line 37
    iget-boolean v3, p2, Lr1/g;->a:Z

    .line 38
    .line 39
    if-eq v0, v3, :cond_5

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_5
    iget v0, p2, Lr1/g;->b:I

    .line 45
    .line 46
    iget v2, p1, Lr1/g;->b:I

    .line 47
    .line 48
    sub-int/2addr v0, v2

    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    move v1, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_6
    iget p1, p1, Lr1/g;->c:I

    .line 54
    .line 55
    iget p2, p2, Lr1/g;->c:I

    .line 56
    .line 57
    sub-int/2addr p1, p2

    .line 58
    if-eqz p1, :cond_7

    .line 59
    .line 60
    move v1, p1

    .line 61
    :cond_7
    :goto_3
    return v1

    .line 62
    :pswitch_0
    check-cast p1, Lh4/d;

    .line 63
    .line 64
    iget-object p1, p1, Lh4/d;->a:Lg4/l;

    .line 65
    .line 66
    check-cast p2, Lh4/d;

    .line 67
    .line 68
    iget-object p2, p2, Lh4/d;->a:Lg4/l;

    .line 69
    .line 70
    if-ne p1, p2, :cond_8

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    goto :goto_4

    .line 74
    :cond_8
    if-nez p1, :cond_9

    .line 75
    .line 76
    const/4 p1, -0x1

    .line 77
    goto :goto_4

    .line 78
    :cond_9
    if-nez p2, :cond_a

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    goto :goto_4

    .line 82
    :cond_a
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :goto_4
    return p1

    .line 87
    :pswitch_1
    check-cast p1, Ljava/lang/Comparable;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/Comparable;

    .line 90
    .line 91
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1

    .line 96
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
