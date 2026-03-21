.class public final Lj$/time/ZonedDateTime;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Lj$/time/chrono/ChronoZonedDateTime;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj$/time/temporal/m;",
        "Lj$/time/chrono/ChronoZonedDateTime<",
        "Lj$/time/h;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x56e37a54888537c2L


# instance fields
.field private final a:Lj$/time/LocalDateTime;

.field private final b:Lj$/time/z;

.field private final c:Lj$/time/ZoneId;


# direct methods
.method private constructor <init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V
    .locals 0

    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 610
    iput-object p1, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    .line 611
    iput-object p3, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    .line 612
    iput-object p2, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    return-void
.end method

.method public static B(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;
    .locals 2

    .line 407
    const-string v0, "instant"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 408
    const-string v0, "zone"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 409
    invoke-virtual {p0}, Lj$/time/Instant;->B()J

    move-result-wide v0

    invoke-virtual {p0}, Lj$/time/Instant;->I()I

    move-result p0

    invoke-static {v0, v1, p0, p1}, Lj$/time/ZonedDateTime;->r(JILj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;
    .locals 5

    .line 367
    const-string v0, "localDateTime"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 368
    const-string v0, "zone"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 369
    instance-of v0, p1, Lj$/time/z;

    if-eqz v0, :cond_0

    .line 370
    new-instance p2, Lj$/time/ZonedDateTime;

    move-object v0, p1

    check-cast v0, Lj$/time/z;

    invoke-direct {p2, p0, p1, v0}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    return-object p2

    .line 372
    :cond_0
    invoke-virtual {p1}, Lj$/time/ZoneId;->r()Lj$/time/zone/f;

    move-result-object v0

    .line 373
    invoke-virtual {v0, p0}, Lj$/time/zone/f;->g(Lj$/time/LocalDateTime;)Ljava/util/List;

    move-result-object v1

    .line 375
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    .line 376
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj$/time/z;

    goto :goto_0

    .line 377
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_2

    .line 378
    invoke-virtual {v0, p0}, Lj$/time/zone/f;->f(Lj$/time/LocalDateTime;)Lj$/time/zone/b;

    move-result-object p2

    .line 379
    invoke-virtual {p2}, Lj$/time/zone/b;->B()Lj$/time/Duration;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/Duration;->I()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lj$/time/LocalDateTime;->j0(J)Lj$/time/LocalDateTime;

    move-result-object p0

    .line 380
    invoke-virtual {p2}, Lj$/time/zone/b;->I()Lj$/time/z;

    move-result-object p2

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    .line 382
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 385
    :cond_3
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj$/time/z;

    const-string v0, "offset"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 388
    :goto_0
    new-instance v0, Lj$/time/ZonedDateTime;

    invoke-direct {v0, p0, p1, p2}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    return-object v0
.end method

.method static S(Ljava/io/ObjectInput;)Lj$/time/ZonedDateTime;
    .locals 3

    .line 2259
    sget-object v0, Lj$/time/LocalDateTime;->c:Lj$/time/LocalDateTime;

    .line 2008
    sget-object v0, Lj$/time/h;->d:Lj$/time/h;

    .line 2224
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    .line 2225
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v1

    .line 2226
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v2

    .line 2227
    invoke-static {v0, v1, v2}, Lj$/time/h;->f0(III)Lj$/time/h;

    move-result-object v0

    .line 2009
    invoke-static {p0}, Lj$/time/l;->j0(Ljava/io/ObjectInput;)Lj$/time/l;

    move-result-object v1

    .line 2010
    invoke-static {v0, v1}, Lj$/time/LocalDateTime;->g0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v0

    .line 2260
    invoke-static {p0}, Lj$/time/z;->d0(Ljava/io/ObjectInput;)Lj$/time/z;

    move-result-object v1

    .line 2261
    invoke-static {p0}, Lj$/time/u;->a(Ljava/io/ObjectInput;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Lj$/time/ZoneId;

    .line 519
    const-string v2, "zone"

    invoke-static {p0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 520
    instance-of v2, p0, Lj$/time/z;

    if-eqz v2, :cond_1

    invoke-virtual {v1, p0}, Lj$/time/z;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 521
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ZoneId must match ZoneOffset"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 523
    :cond_1
    :goto_0
    new-instance v2, Lj$/time/ZonedDateTime;

    invoke-direct {v2, v0, p0, v1}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    return-object v2
.end method

.method public static now(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;
    .locals 2

    .line 202
    const-string v0, "zone"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    sget-object v0, Lj$/time/z;->f:Lj$/time/z;

    if-ne p0, v0, :cond_0

    .line 204
    sget-object p0, Lj$/time/a;->b:Lj$/time/a;

    goto :goto_0

    .line 206
    :cond_0
    new-instance v0, Lj$/time/a;

    invoke-direct {v0, p0}, Lj$/time/a;-><init>(Lj$/time/ZoneId;)V

    move-object p0, v0

    .line 232
    :goto_0
    const-string v0, "clock"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 520
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 525
    invoke-static {v0, v1}, Lj$/time/Instant;->R(J)Lj$/time/Instant;

    move-result-object v0

    .line 234
    invoke-virtual {p0}, Lj$/time/a;->a()Lj$/time/ZoneId;

    move-result-object p0

    invoke-static {v0, p0}, Lj$/time/ZonedDateTime;->B(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static of(IIIIIIILj$/time/ZoneId;)Lj$/time/ZonedDateTime;
    .locals 0

    .line 339
    invoke-static/range {p0 .. p6}, Lj$/time/LocalDateTime;->f0(IIIIIII)Lj$/time/LocalDateTime;

    move-result-object p0

    const/4 p1, 0x0

    .line 340
    invoke-static {p0, p7, p1}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lj$/time/LocalDateTime;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;
    .locals 1

    const/4 v0, 0x0

    .line 293
    invoke-static {p0, p1, v0}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method private static r(JILj$/time/ZoneId;)Lj$/time/ZonedDateTime;
    .locals 3

    .line 453
    invoke-virtual {p3}, Lj$/time/ZoneId;->r()Lj$/time/zone/f;

    move-result-object v0

    int-to-long v1, p2

    .line 454
    invoke-static {p0, p1, v1, v2}, Lj$/time/Instant;->V(JJ)Lj$/time/Instant;

    move-result-object v1

    .line 455
    invoke-virtual {v0, v1}, Lj$/time/zone/f;->d(Lj$/time/Instant;)Lj$/time/z;

    move-result-object v0

    .line 456
    invoke-static {p0, p1, p2, v0}, Lj$/time/LocalDateTime;->h0(JILj$/time/z;)Lj$/time/LocalDateTime;

    move-result-object p0

    .line 457
    new-instance p1, Lj$/time/ZonedDateTime;

    invoke-direct {p1, p0, p3, v0}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    return-object p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 2249
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 2239
    new-instance v0, Lj$/time/u;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Lj$/time/u;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final A()Lj$/time/chrono/e;
    .locals 1

    .line 164
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    return-object v0
.end method

.method public final D()Lj$/time/z;
    .locals 1

    .line 871
    iget-object v0, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    return-object v0
.end method

.method public final H(Lj$/time/ZoneId;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 2

    .line 968
    const-string v0, "zone"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 969
    iget-object v0, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    invoke-virtual {v0, p1}, Lj$/time/ZoneId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    iget-object v1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-static {v0, p1, v1}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final P()Lj$/time/ZoneId;
    .locals 1

    .line 946
    iget-object v0, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    return-object v0
.end method

.method public final R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;
    .locals 5

    .line 1601
    instance-of v0, p3, Lj$/time/temporal/b;

    if-eqz v0, :cond_2

    .line 1602
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/b;

    .line 241
    sget-object v1, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    .line 241
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    .line 241
    iget-object v2, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    iget-object v3, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    iget-object v4, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    if-ltz v1, :cond_0

    sget-object v1, Lj$/time/temporal/b;->FOREVER:Lj$/time/temporal/b;

    if-eq v0, v1, :cond_0

    .line 1603
    invoke-virtual {v4, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    .line 622
    invoke-static {p1, v3, v2}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1

    .line 1605
    :cond_0
    invoke-virtual {v4, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    .line 433
    const-string p2, "localDateTime"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 434
    const-string p2, "offset"

    invoke-static {v2, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 435
    const-string p2, "zone"

    invoke-static {v3, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 436
    invoke-virtual {v3}, Lj$/time/ZoneId;->r()Lj$/time/zone/f;

    move-result-object p2

    .line 952
    invoke-virtual {p2, p1}, Lj$/time/zone/f;->g(Lj$/time/LocalDateTime;)Ljava/util/List;

    move-result-object p2

    .line 952
    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 437
    new-instance p2, Lj$/time/ZonedDateTime;

    invoke-direct {p2, p1, v3, v2}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    goto :goto_0

    .line 439
    :cond_1
    invoke-interface {p1, v2}, Lj$/time/chrono/e;->X(Lj$/time/z;)J

    move-result-wide p2

    invoke-virtual {p1}, Lj$/time/LocalDateTime;->Z()I

    move-result p1

    invoke-static {p2, p3, p1, v3}, Lj$/time/ZonedDateTime;->r(JILj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p2

    :goto_0
    return-object p2

    .line 1608
    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/u;->p(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/ZonedDateTime;

    return-object p1
.end method

.method public final V()Lj$/time/LocalDateTime;
    .locals 1

    .line 1028
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    return-object v0
.end method

.method public final Y(JLj$/time/temporal/r;)Lj$/time/ZonedDateTime;
    .locals 6

    .line 1303
    instance-of v0, p3, Lj$/time/temporal/a;

    if-eqz v0, :cond_3

    .line 1304
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/a;

    .line 1305
    sget-object v1, Lj$/time/B;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    iget-object v4, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    iget-object v5, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    if-eq v1, v2, :cond_0

    .line 1312
    invoke-virtual {v5, p1, p2, p3}, Lj$/time/LocalDateTime;->m0(JLj$/time/temporal/r;)Lj$/time/LocalDateTime;

    move-result-object p1

    .line 622
    invoke-static {p1, v3, v4}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1

    .line 1309
    :cond_0
    invoke-virtual {v0, p1, p2}, Lj$/time/temporal/a;->Y(J)I

    move-result p1

    invoke-static {p1}, Lj$/time/z;->b0(I)Lj$/time/z;

    move-result-object p1

    .line 644
    invoke-virtual {p1, v4}, Lj$/time/z;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v3}, Lj$/time/ZoneId;->r()Lj$/time/zone/f;

    move-result-object p2

    .line 952
    invoke-virtual {p2, v5}, Lj$/time/zone/f;->g(Lj$/time/LocalDateTime;)Ljava/util/List;

    move-result-object p2

    .line 952
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 645
    new-instance p2, Lj$/time/ZonedDateTime;

    invoke-direct {p2, v5, v3, p1}, Lj$/time/ZonedDateTime;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)V

    goto :goto_0

    :cond_1
    move-object p2, p0

    :goto_0
    return-object p2

    .line 1307
    :cond_2
    invoke-virtual {p0}, Lj$/time/ZonedDateTime;->getNano()I

    move-result p3

    invoke-static {p1, p2, p3, v3}, Lj$/time/ZonedDateTime;->r(JILj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1

    .line 1314
    :cond_3
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/r;->p(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/ZonedDateTime;

    return-object p1
.end method

.method public final Z(Lj$/time/h;)Lj$/time/ZonedDateTime;
    .locals 2

    .line 1232
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->n()Lj$/time/l;

    move-result-object v0

    invoke-static {p1, v0}, Lj$/time/LocalDateTime;->g0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    .line 622
    iget-object v0, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    iget-object v1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-static {p1, v0, v1}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lj$/time/temporal/t;)Ljava/lang/Object;
    .locals 1

    .line 2056
    invoke-static {}, Lj$/time/temporal/s;->b()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 1042
    iget-object p1, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {p1}, Lj$/time/LocalDateTime;->l0()Lj$/time/h;

    move-result-object p1

    return-object p1

    .line 2059
    :cond_0
    invoke-super {p0, p1}, Lj$/time/chrono/ChronoZonedDateTime;->a(Lj$/time/temporal/t;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final a0(Ljava/io/DataOutput;)V
    .locals 1

    .line 2253
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->p0(Ljava/io/DataOutput;)V

    .line 2254
    iget-object v0, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-virtual {v0, p1}, Lj$/time/z;->e0(Ljava/io/DataOutput;)V

    .line 2255
    iget-object v0, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    check-cast p1, Ljava/io/ObjectOutput;

    invoke-virtual {v0, p1}, Lj$/time/ZoneId;->S(Ljava/io/ObjectOutput;)V

    return-void
.end method

.method public final bridge synthetic b(JLj$/time/temporal/r;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->Y(JLj$/time/temporal/r;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->Y(JLj$/time/temporal/r;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(JLj$/time/temporal/u;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 0

    .line 164
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final e(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 2

    .line 164
    check-cast p3, Lj$/time/temporal/b;

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1854
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    goto :goto_0

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2185
    :cond_0
    instance-of v1, p1, Lj$/time/ZonedDateTime;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2186
    check-cast p1, Lj$/time/ZonedDateTime;

    .line 2187
    iget-object v1, p1, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    iget-object v3, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v3, v1}, Lj$/time/LocalDateTime;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    iget-object v3, p1, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    .line 2188
    invoke-virtual {v1, v3}, Lj$/time/z;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    iget-object p1, p1, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    .line 2189
    invoke-virtual {v1, p1}, Lj$/time/ZoneId;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final f(Lj$/time/temporal/r;)Z
    .locals 1

    .line 705
    instance-of v0, p1, Lj$/time/temporal/a;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lj$/time/temporal/r;->V(Lj$/time/temporal/TemporalAccessor;)Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public final g(Lj$/time/temporal/r;)J
    .locals 2

    .line 851
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 852
    sget-object v0, Lj$/time/B;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 856
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->g(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0

    .line 854
    :cond_0
    iget-object p1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-virtual {p1}, Lj$/time/z;->Y()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 853
    :cond_1
    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->N()J

    move-result-wide v0

    return-wide v0

    .line 858
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->r(Lj$/time/temporal/TemporalAccessor;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDayOfMonth()I
    .locals 1

    .line 1096
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->I()I

    move-result v0

    return v0
.end method

.method public getDayOfWeek()Lj$/time/DayOfWeek;
    .locals 1

    .line 1124
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->R()Lj$/time/DayOfWeek;

    move-result-object v0

    return-object v0
.end method

.method public getHour()I
    .locals 1

    .line 1147
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->S()I

    move-result v0

    return v0
.end method

.method public getMinute()I
    .locals 1

    .line 1156
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->V()I

    move-result v0

    return v0
.end method

.method public getMonthValue()I
    .locals 1

    .line 1070
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->Y()I

    move-result v0

    return v0
.end method

.method public getNano()I
    .locals 1

    .line 1174
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->Z()I

    move-result v0

    return v0
.end method

.method public getSecond()I
    .locals 1

    .line 1165
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->a0()I

    move-result v0

    return v0
.end method

.method public getYear()I
    .locals 1

    .line 1056
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->b0()I

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 2201
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->hashCode()I

    move-result v0

    iget-object v1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-virtual {v1}, Lj$/time/z;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    invoke-virtual {v1}, Lj$/time/ZoneId;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Lj$/time/temporal/r;)I
    .locals 2

    .line 814
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 815
    sget-object v0, Lj$/time/B;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 821
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->i(Lj$/time/temporal/r;)I

    move-result p1

    return p1

    .line 819
    :cond_0
    iget-object p1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-virtual {p1}, Lj$/time/z;->Y()I

    move-result p1

    return p1

    .line 817
    :cond_1
    new-instance p1, Lj$/time/temporal/v;

    .line 88
    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 817
    throw p1

    .line 823
    :cond_2
    invoke-super {p0, p1}, Lj$/time/chrono/ChronoZonedDateTime;->i(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic j(Lj$/time/h;)Lj$/time/temporal/m;
    .locals 0

    .line 164
    invoke-virtual {p0, p1}, Lj$/time/ZonedDateTime;->Z(Lj$/time/h;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final k(JLj$/time/temporal/b;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1854
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    goto :goto_0

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/ZonedDateTime;->R(JLj$/time/temporal/u;)Lj$/time/ZonedDateTime;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final l(Lj$/time/temporal/r;)Lj$/time/temporal/w;
    .locals 1

    .line 775
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    .line 776
    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 779
    :cond_0
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->l(Lj$/time/temporal/r;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1

    .line 777
    :cond_1
    :goto_0
    check-cast p1, Lj$/time/temporal/a;

    invoke-virtual {p1}, Lj$/time/temporal/a;->B()Lj$/time/temporal/w;

    move-result-object p1

    return-object p1

    .line 781
    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic m(Lj$/time/temporal/n;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 0

    .line 164
    check-cast p1, Lj$/time/h;

    invoke-virtual {p0, p1}, Lj$/time/ZonedDateTime;->Z(Lj$/time/h;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final n()Lj$/time/l;
    .locals 1

    .line 1138
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->n()Lj$/time/l;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lj$/time/chrono/b;
    .locals 1

    .line 1042
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->l0()Lj$/time/h;

    move-result-object v0

    return-object v0
.end method

.method public plusDays(J)Lj$/time/ZonedDateTime;
    .locals 1

    .line 1697
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1, p2}, Lj$/time/LocalDateTime;->plusDays(J)Lj$/time/LocalDateTime;

    move-result-object p1

    .line 622
    iget-object p2, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    iget-object v0, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-static {p1, p2, v0}, Lj$/time/ZonedDateTime;->I(Lj$/time/LocalDateTime;Lj$/time/ZoneId;Lj$/time/z;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 2217
    iget-object v0, p0, Lj$/time/ZonedDateTime;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj$/time/ZonedDateTime;->b:Lj$/time/z;

    invoke-virtual {v1}, Lj$/time/z;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2218
    iget-object v2, p0, Lj$/time/ZonedDateTime;->c:Lj$/time/ZoneId;

    if-eq v1, v2, :cond_0

    .line 2219
    invoke-virtual {v2}, Lj$/time/ZoneId;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
