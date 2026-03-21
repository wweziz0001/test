.class public final Ld1/g;
.super Lc1/i;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public v:J


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 9

    .line 1
    check-cast p1, Ld1/g;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-virtual {p0, v0}, Le0/d;->e(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1, v0}, Le0/d;->e(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, -0x1

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Le0/d;->e(I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :goto_0
    move v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-wide v0, p0, Lg0/e;->r:J

    .line 25
    .line 26
    iget-wide v5, p1, Lg0/e;->r:J

    .line 27
    .line 28
    sub-long/2addr v0, v5

    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    cmp-long v2, v0, v5

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-wide v0, p0, Ld1/g;->v:J

    .line 36
    .line 37
    iget-wide v7, p1, Ld1/g;->v:J

    .line 38
    .line 39
    sub-long/2addr v0, v7

    .line 40
    cmp-long p1, v0, v5

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    cmp-long p1, v0, v5

    .line 47
    .line 48
    if-lez p1, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    return v3
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
