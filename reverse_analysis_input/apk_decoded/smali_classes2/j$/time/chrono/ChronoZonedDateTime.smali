.class public interface abstract Lj$/time/chrono/ChronoZonedDateTime;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D::",
        "Lj$/time/chrono/b;",
        ">",
        "Ljava/lang/Object;",
        "Lj$/time/temporal/m;",
        "Ljava/lang/Comparable<",
        "Lj$/time/chrono/ChronoZonedDateTime<",
        "*>;>;"
    }
.end annotation


# virtual methods
.method public abstract A()Lj$/time/chrono/e;
.end method

.method public abstract D()Lj$/time/z;
.end method

.method public abstract H(Lj$/time/ZoneId;)Lj$/time/chrono/ChronoZonedDateTime;
.end method

.method public N()J
    .locals 4

    .line 553
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->o()Lj$/time/chrono/b;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/b;->u()J

    move-result-wide v0

    const-wide/32 v2, 0x15180

    mul-long/2addr v0, v2

    .line 554
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/l;->l0()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 555
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->D()Lj$/time/z;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/z;->Y()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public abstract P()Lj$/time/ZoneId;
.end method

.method public a(Lj$/time/temporal/t;)Ljava/lang/Object;
    .locals 1

    .line 491
    invoke-static {}, Lj$/time/temporal/s;->f()Lj$/time/temporal/t;

    move-result-object v0

    if-eq p1, v0, :cond_5

    invoke-static {}, Lj$/time/temporal/s;->g()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 493
    :cond_0
    invoke-static {}, Lj$/time/temporal/s;->d()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 494
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->D()Lj$/time/z;

    move-result-object p1

    return-object p1

    .line 495
    :cond_1
    invoke-static {}, Lj$/time/temporal/s;->c()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 496
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object p1

    return-object p1

    .line 497
    :cond_2
    invoke-static {}, Lj$/time/temporal/s;->a()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 498
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->h()Lj$/time/chrono/l;

    move-result-object p1

    return-object p1

    .line 499
    :cond_3
    invoke-static {}, Lj$/time/temporal/s;->e()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 500
    sget-object p1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    return-object p1

    .line 504
    :cond_4
    invoke-interface {p1, p0}, Lj$/time/temporal/t;->j(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 492
    :cond_5
    :goto_0
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->P()Lj$/time/ZoneId;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(JLj$/time/temporal/r;)Lj$/time/chrono/ChronoZonedDateTime;
.end method

.method public bridge synthetic b(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoZonedDateTime;->b(JLj$/time/temporal/r;)Lj$/time/chrono/ChronoZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 122
    check-cast p1, Lj$/time/chrono/ChronoZonedDateTime;

    invoke-interface {p0, p1}, Lj$/time/chrono/ChronoZonedDateTime;->y(Lj$/time/chrono/ChronoZonedDateTime;)I

    move-result p1

    return p1
.end method

.method public abstract d(JLj$/time/temporal/u;)Lj$/time/chrono/ChronoZonedDateTime;
.end method

.method public bridge synthetic d(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoZonedDateTime;->d(JLj$/time/temporal/u;)Lj$/time/chrono/ChronoZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    check-cast p3, Lj$/time/temporal/b;

    invoke-interface {p0, p1, p2, p3}, Lj$/time/chrono/ChronoZonedDateTime;->k(JLj$/time/temporal/b;)Lj$/time/chrono/ChronoZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public g(Lj$/time/temporal/r;)J
    .locals 2

    .line 212
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 213
    sget-object v0, Lj$/time/chrono/i;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 217
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0

    .line 215
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->D()Lj$/time/z;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/z;->Y()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 214
    :cond_1
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v0

    return-wide v0

    .line 219
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->r(Lj$/time/temporal/TemporalAccessor;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()Lj$/time/chrono/l;
    .locals 1

    .line 265
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->o()Lj$/time/chrono/b;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/b;->h()Lj$/time/chrono/l;

    move-result-object v0

    return-object v0
.end method

.method public i(Lj$/time/temporal/r;)I
    .locals 2

    .line 198
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 199
    sget-object v0, Lj$/time/chrono/i;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 205
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/r;)I

    move-result p1

    return p1

    .line 203
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->D()Lj$/time/z;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/z;->Y()I

    move-result p1

    return p1

    .line 201
    :cond_1
    new-instance p1, Lj$/time/temporal/v;

    .line 88
    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 201
    throw p1

    .line 207
    :cond_2
    invoke-super {p0, p1}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public isBefore(Lj$/time/chrono/ChronoZonedDateTime;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/time/chrono/ChronoZonedDateTime<",
            "*>;)Z"
        }
    .end annotation

    .line 607
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v0

    .line 608
    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    .line 610
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/l;->Y()I

    move-result v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/l;->Y()I

    move-result p1

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic j(Lj$/time/h;)Lj$/time/temporal/m;
    .locals 0

    .line 122
    invoke-interface {p0, p1}, Lj$/time/chrono/ChronoZonedDateTime;->m(Lj$/time/temporal/n;)Lj$/time/chrono/ChronoZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public k(JLj$/time/temporal/b;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 1

    .line 466
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->h()Lj$/time/chrono/l;

    move-result-object v0

    invoke-super {p0, p1, p2, p3}, Lj$/time/temporal/m;->e(JLj$/time/temporal/u;)Lj$/time/temporal/m;

    move-result-object p1

    invoke-static {v0, p1}, Lj$/time/chrono/k;->r(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/k;

    move-result-object p1

    return-object p1
.end method

.method public l(Lj$/time/temporal/r;)Lj$/time/temporal/w;
    .locals 1

    .line 187
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 188
    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->l(Lj$/time/temporal/r;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1

    .line 189
    :cond_1
    :goto_0
    check-cast p1, Lj$/time/temporal/a;

    invoke-virtual {p1}, Lj$/time/temporal/a;->B()Lj$/time/temporal/w;

    move-result-object p1

    return-object p1

    .line 193
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1
.end method

.method public m(Lj$/time/temporal/n;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 1

    .line 420
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->h()Lj$/time/chrono/l;

    move-result-object v0

    .line 190
    invoke-interface {p1, p0}, Lj$/time/temporal/n;->c(Lj$/time/temporal/m;)Lj$/time/temporal/m;

    move-result-object p1

    .line 420
    invoke-static {v0, p1}, Lj$/time/chrono/k;->r(Lj$/time/chrono/l;Lj$/time/temporal/m;)Lj$/time/chrono/k;

    move-result-object p1

    return-object p1
.end method

.method public n()Lj$/time/l;
    .locals 1

    .line 243
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/e;->n()Lj$/time/l;

    move-result-object v0

    return-object v0
.end method

.method public o()Lj$/time/chrono/b;
    .locals 1

    .line 231
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/e;->o()Lj$/time/chrono/b;

    move-result-object v0

    return-object v0
.end method

.method public toInstant()Lj$/time/Instant;
    .locals 4

    .line 538
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v0

    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/l;->Y()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lj$/time/Instant;->V(JJ)Lj$/time/Instant;

    move-result-object v0

    return-object v0
.end method

.method public y(Lj$/time/chrono/ChronoZonedDateTime;)I
    .locals 4

    .line 577
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    .line 579
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/l;->Y()I

    move-result v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->n()Lj$/time/l;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/l;->Y()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 581
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->A()Lj$/time/chrono/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lj$/time/chrono/e;->W(Lj$/time/chrono/e;)I

    move-result v0

    if-nez v0, :cond_0

    .line 583
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->P()Lj$/time/ZoneId;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->P()Lj$/time/ZoneId;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->h()Lj$/time/chrono/l;

    move-result-object v0

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->h()Lj$/time/chrono/l;

    move-result-object p1

    check-cast v0, Lj$/time/chrono/a;

    .line 682
    invoke-interface {v0}, Lj$/time/chrono/l;->getId()Ljava/lang/String;

    move-result-object v0

    .line 682
    invoke-interface {p1}, Lj$/time/chrono/l;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :cond_0
    return v0
.end method
