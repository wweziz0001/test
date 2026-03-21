.class public final Lj$/time/LocalDateTime;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/m;
.implements Lj$/time/temporal/n;
.implements Lj$/time/chrono/e;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj$/time/temporal/m;",
        "Lj$/time/temporal/n;",
        "Lj$/time/chrono/e;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final c:Lj$/time/LocalDateTime;

.field public static final d:Lj$/time/LocalDateTime;

.field private static final serialVersionUID:J = 0x56266aa6a95fff2eL


# instance fields
.field private final a:Lj$/time/h;

.field private final b:Lj$/time/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 144
    sget-object v0, Lj$/time/h;->d:Lj$/time/h;

    sget-object v1, Lj$/time/l;->e:Lj$/time/l;

    invoke-static {v0, v1}, Lj$/time/LocalDateTime;->g0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v0

    sput-object v0, Lj$/time/LocalDateTime;->c:Lj$/time/LocalDateTime;

    .line 151
    sget-object v0, Lj$/time/h;->e:Lj$/time/h;

    sget-object v1, Lj$/time/l;->f:Lj$/time/l;

    invoke-static {v0, v1}, Lj$/time/LocalDateTime;->g0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v0

    sput-object v0, Lj$/time/LocalDateTime;->d:Lj$/time/LocalDateTime;

    return-void
.end method

.method private constructor <init>(Lj$/time/h;Lj$/time/l;)V
    .locals 0

    .line 502
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 503
    iput-object p1, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    .line 504
    iput-object p2, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    return-void
.end method

.method public static B(Lj$/time/temporal/TemporalAccessor;)Lj$/time/LocalDateTime;
    .locals 5

    .line 448
    instance-of v0, p0, Lj$/time/LocalDateTime;

    if-eqz v0, :cond_0

    .line 449
    check-cast p0, Lj$/time/LocalDateTime;

    return-object p0

    .line 450
    :cond_0
    instance-of v0, p0, Lj$/time/ZonedDateTime;

    if-eqz v0, :cond_1

    .line 451
    check-cast p0, Lj$/time/ZonedDateTime;

    invoke-virtual {p0}, Lj$/time/ZonedDateTime;->V()Lj$/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 452
    :cond_1
    instance-of v0, p0, Lj$/time/r;

    if-eqz v0, :cond_2

    .line 453
    check-cast p0, Lj$/time/r;

    invoke-virtual {p0}, Lj$/time/r;->R()Lj$/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 456
    :cond_2
    :try_start_0
    invoke-static {p0}, Lj$/time/h;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/h;

    move-result-object v0

    .line 457
    invoke-static {p0}, Lj$/time/l;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/l;

    move-result-object v1

    .line 458
    new-instance v2, Lj$/time/LocalDateTime;

    invoke-direct {v2, v0, v1}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V
    :try_end_0
    .catch Lj$/time/c; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    .line 460
    new-instance v1, Lj$/time/c;

    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to obtain LocalDateTime from TemporalAccessor: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 461
    throw v1
.end method

.method public static e0(I)Lj$/time/LocalDateTime;
    .locals 2

    const/16 v0, 0xc

    const/16 v1, 0x1f

    .line 311
    invoke-static {p0, v0, v1}, Lj$/time/h;->f0(III)Lj$/time/h;

    move-result-object p0

    const/4 v0, 0x0

    .line 312
    invoke-static {v0}, Lj$/time/l;->a0(I)Lj$/time/l;

    move-result-object v0

    .line 313
    new-instance v1, Lj$/time/LocalDateTime;

    invoke-direct {v1, p0, v0}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V

    return-object v1
.end method

.method public static f0(IIIIIII)Lj$/time/LocalDateTime;
    .locals 0

    .line 361
    invoke-static {p0, p1, p2}, Lj$/time/h;->f0(III)Lj$/time/h;

    move-result-object p0

    .line 362
    invoke-static {p3, p4, p5, p6}, Lj$/time/l;->b0(IIII)Lj$/time/l;

    move-result-object p1

    .line 363
    new-instance p2, Lj$/time/LocalDateTime;

    invoke-direct {p2, p0, p1}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V

    return-object p2
.end method

.method public static g0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;
    .locals 1

    .line 374
    const-string v0, "date"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 375
    const-string v0, "time"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 376
    new-instance v0, Lj$/time/LocalDateTime;

    invoke-direct {v0, p0, p1}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V

    return-object v0
.end method

.method public static h0(JILj$/time/z;)Lj$/time/LocalDateTime;
    .locals 5

    .line 417
    const-string v0, "offset"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    sget-object v0, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lj$/time/temporal/a;->Z(J)V

    .line 419
    invoke-virtual {p3}, Lj$/time/z;->Y()I

    move-result p2

    int-to-long p2, p2

    add-long/2addr p0, p2

    const p2, 0x15180

    int-to-long p2, p2

    .line 0
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->floorDiv(JJ)J

    move-result-wide v3

    .line 0
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->floorMod(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    .line 422
    invoke-static {v3, v4}, Lj$/time/h;->h0(J)Lj$/time/h;

    move-result-object p1

    int-to-long p2, p0

    const-wide/32 v3, 0x3b9aca00

    mul-long/2addr p2, v3

    add-long/2addr p2, v1

    .line 423
    invoke-static {p2, p3}, Lj$/time/l;->c0(J)Lj$/time/l;

    move-result-object p0

    .line 424
    new-instance p2, Lj$/time/LocalDateTime;

    invoke-direct {p2, p1, p0}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V

    return-object p2
.end method

.method private k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    or-long v2, p2, p4

    or-long v2, v2, p6

    or-long v2, v2, p8

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    .line 1554
    iget-object v3, v0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    if-nez v2, :cond_0

    .line 1555
    invoke-direct {v0, v1, v3}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v1

    return-object v1

    :cond_0
    const-wide v4, 0x4e94914f0000L

    .line 1557
    div-long v6, p8, v4

    const-wide/32 v8, 0x15180

    div-long v10, p6, v8

    add-long/2addr v10, v6

    const-wide/16 v6, 0x5a0

    div-long v12, p4, v6

    add-long/2addr v12, v10

    const-wide/16 v10, 0x18

    div-long v14, p2, v10

    add-long/2addr v14, v12

    const/4 v2, 0x1

    int-to-long v12, v2

    mul-long/2addr v14, v12

    .line 1562
    rem-long v16, p8, v4

    rem-long v8, p6, v8

    const-wide/32 v18, 0x3b9aca00

    mul-long v8, v8, v18

    add-long v8, v8, v16

    rem-long v6, p4, v6

    const-wide v16, 0xdf8475800L

    mul-long v6, v6, v16

    add-long/2addr v6, v8

    rem-long v8, p2, v10

    const-wide v10, 0x34630b8a000L

    mul-long/2addr v8, v10

    add-long/2addr v8, v6

    .line 1566
    invoke-virtual {v3}, Lj$/time/l;->k0()J

    move-result-wide v6

    mul-long/2addr v8, v12

    add-long/2addr v8, v6

    .line 1568
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->floorDiv(JJ)J

    move-result-wide v10

    add-long/2addr v10, v14

    .line 1569
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->floorMod(JJ)J

    move-result-wide v4

    cmp-long v2, v4, v6

    if-nez v2, :cond_1

    goto :goto_0

    .line 1570
    :cond_1
    invoke-static {v4, v5}, Lj$/time/l;->c0(J)Lj$/time/l;

    move-result-object v3

    .line 1571
    :goto_0
    invoke-virtual {v1, v10, v11}, Lj$/time/h;->k0(J)Lj$/time/h;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v1

    return-object v1
.end method

.method private o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;
    .locals 1

    .line 516
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    if-ne v0, p2, :cond_0

    return-object p0

    .line 519
    :cond_0
    new-instance v0, Lj$/time/LocalDateTime;

    invoke-direct {v0, p1, p2}, Lj$/time/LocalDateTime;-><init>(Lj$/time/h;Lj$/time/l;)V

    return-object v0
.end method

.method public static parse(Ljava/lang/CharSequence;)Lj$/time/LocalDateTime;
    .locals 2

    .line 477
    sget-object v0, Lj$/time/format/DateTimeFormatter;->ISO_LOCAL_DATE_TIME:Lj$/time/format/DateTimeFormatter;

    .line 491
    const-string v1, "formatter"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 492
    new-instance v1, Lj$/time/i;

    .line 0
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 492
    invoke-virtual {v0, p0, v1}, Lj$/time/format/DateTimeFormatter;->d(Ljava/lang/CharSequence;Lj$/time/i;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/time/LocalDateTime;

    return-object p0
.end method

.method private r(Lj$/time/LocalDateTime;)I
    .locals 2

    .line 736
    iget-object v0, p1, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    .line 1827
    iget-object v1, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v1, v0}, Lj$/time/h;->r(Lj$/time/h;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1829
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    iget-object p1, p1, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0, p1}, Lj$/time/l;->r(Lj$/time/l;)I

    move-result v0

    :cond_0
    return v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1999
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1989
    new-instance v0, Lj$/time/u;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Lj$/time/u;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final G(Lj$/time/ZoneId;)Lj$/time/chrono/ChronoZonedDateTime;
    .locals 0

    .line 1800
    invoke-static {p0, p1}, Lj$/time/ZonedDateTime;->of(Lj$/time/LocalDateTime;Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final I()I
    .locals 1

    .line 790
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->S()I

    move-result v0

    return v0
.end method

.method public final R()Lj$/time/DayOfWeek;
    .locals 1

    .line 818
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->V()Lj$/time/DayOfWeek;

    move-result-object v0

    return-object v0
.end method

.method public final S()I
    .locals 1

    .line 841
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0}, Lj$/time/l;->S()I

    move-result v0

    return v0
.end method

.method public final V()I
    .locals 1

    .line 850
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0}, Lj$/time/l;->V()I

    move-result v0

    return v0
.end method

.method public final W(Lj$/time/chrono/e;)I
    .locals 1

    .line 1820
    instance-of v0, p1, Lj$/time/LocalDateTime;

    if-eqz v0, :cond_0

    .line 1821
    check-cast p1, Lj$/time/LocalDateTime;

    invoke-direct {p0, p1}, Lj$/time/LocalDateTime;->r(Lj$/time/LocalDateTime;)I

    move-result p1

    return p1

    .line 1823
    :cond_0
    invoke-super {p0, p1}, Lj$/time/chrono/e;->W(Lj$/time/chrono/e;)I

    move-result p1

    return p1
.end method

.method public final Y()I
    .locals 1

    .line 764
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->Z()I

    move-result v0

    return v0
.end method

.method public final Z()I
    .locals 1

    .line 868
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0}, Lj$/time/l;->Y()I

    move-result v0

    return v0
.end method

.method public final a(Lj$/time/temporal/t;)Ljava/lang/Object;
    .locals 1

    .line 1596
    invoke-static {}, Lj$/time/temporal/s;->b()Lj$/time/temporal/t;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 1597
    iget-object p1, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    return-object p1

    .line 1599
    :cond_0
    invoke-super {p0, p1}, Lj$/time/chrono/e;->a(Lj$/time/temporal/t;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a0()I
    .locals 1

    .line 859
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0}, Lj$/time/l;->Z()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic b(JLj$/time/temporal/r;)Lj$/time/temporal/m;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->m0(JLj$/time/temporal/r;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final b0()I
    .locals 1

    .line 750
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->a0()I

    move-result v0

    return v0
.end method

.method public final c0(Lj$/time/LocalDateTime;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    .line 1858
    invoke-direct {p0, p1}, Lj$/time/LocalDateTime;->r(Lj$/time/LocalDateTime;)I

    move-result p1

    if-lez p1, :cond_0

    move v0, v1

    :cond_0
    return v0

    .line 532
    :cond_1
    iget-object v2, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v2}, Lj$/time/h;->u()J

    move-result-wide v2

    .line 135
    iget-object v4, p1, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    .line 533
    invoke-virtual {v4}, Lj$/time/h;->u()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    if-nez v2, :cond_3

    .line 535
    iget-object v2, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v2}, Lj$/time/l;->k0()J

    move-result-wide v2

    iget-object p1, p1, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {p1}, Lj$/time/l;->k0()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-lez p1, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 135
    check-cast p1, Lj$/time/chrono/e;

    invoke-virtual {p0, p1}, Lj$/time/LocalDateTime;->W(Lj$/time/chrono/e;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic d(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Lj$/time/LocalDateTime;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    .line 1887
    invoke-direct {p0, p1}, Lj$/time/LocalDateTime;->r(Lj$/time/LocalDateTime;)I

    move-result p1

    if-gez p1, :cond_0

    move v0, v1

    :cond_0
    return v0

    .line 553
    :cond_1
    iget-object v2, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v2}, Lj$/time/h;->u()J

    move-result-wide v2

    .line 135
    iget-object v4, p1, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    .line 554
    invoke-virtual {v4}, Lj$/time/h;->u()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    if-nez v2, :cond_3

    .line 556
    iget-object v2, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v2}, Lj$/time/l;->k0()J

    move-result-wide v2

    iget-object p1, p1, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {p1}, Lj$/time/l;->k0()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-gez p1, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    return v0
.end method

.method public final e(JLj$/time/temporal/u;)Lj$/time/temporal/m;
    .locals 2

    .line 135
    check-cast p3, Lj$/time/temporal/b;

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1395
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    goto :goto_0

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1936
    :cond_0
    instance-of v1, p1, Lj$/time/LocalDateTime;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1937
    check-cast p1, Lj$/time/LocalDateTime;

    .line 1938
    iget-object v1, p1, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    iget-object v3, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v3, v1}, Lj$/time/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    iget-object p1, p1, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v1, p1}, Lj$/time/l;->equals(Ljava/lang/Object;)Z

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
    .locals 3

    .line 575
    instance-of v0, p1, Lj$/time/temporal/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 576
    check-cast p1, Lj$/time/temporal/a;

    .line 577
    invoke-virtual {p1}, Lj$/time/temporal/a;->S()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lj$/time/temporal/a;->a0()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    return v1

    :cond_2
    if-eqz p1, :cond_3

    .line 579
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->V(Lj$/time/temporal/TemporalAccessor;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    return v1
.end method

.method public final g(Lj$/time/temporal/r;)J
    .locals 2

    .line 718
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    .line 719
    move-object v0, p1

    check-cast v0, Lj$/time/temporal/a;

    .line 720
    invoke-virtual {v0}, Lj$/time/temporal/a;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0, p1}, Lj$/time/l;->g(Lj$/time/temporal/r;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1}, Lj$/time/h;->g(Lj$/time/temporal/r;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    .line 722
    :cond_1
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->r(Lj$/time/temporal/TemporalAccessor;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1950
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->hashCode()I

    move-result v0

    iget-object v1, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v1}, Lj$/time/l;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Lj$/time/temporal/r;)I
    .locals 1

    .line 686
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    .line 687
    move-object v0, p1

    check-cast v0, Lj$/time/temporal/a;

    .line 688
    invoke-virtual {v0}, Lj$/time/temporal/a;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0, p1}, Lj$/time/l;->i(Lj$/time/temporal/r;)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1}, Lj$/time/h;->i(Lj$/time/temporal/r;)I

    move-result p1

    :goto_0
    return p1

    .line 690
    :cond_1
    invoke-super {p0, p1}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public final i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;
    .locals 21

    move-object/from16 v10, p0

    move-wide/from16 v8, p1

    move-object/from16 v0, p3

    .line 1183
    instance-of v1, v0, Lj$/time/temporal/b;

    if-eqz v1, :cond_0

    .line 1184
    move-object v1, v0

    check-cast v1, Lj$/time/temporal/b;

    .line 1185
    sget-object v2, Lj$/time/j;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 1194
    iget-object v1, v10, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v1, v8, v9, v0}, Lj$/time/h;->j0(JLj$/time/temporal/u;)Lj$/time/h;

    move-result-object v0

    iget-object v1, v10, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-direct {v10, v0, v1}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide/16 v0, 0x100

    .line 1192
    div-long v2, v8, v0

    invoke-virtual {v10, v2, v3}, Lj$/time/LocalDateTime;->plusDays(J)Lj$/time/LocalDateTime;

    move-result-object v11

    rem-long v0, v8, v0

    const-wide/16 v2, 0xc

    mul-long v13, v0, v2

    .line 1301
    iget-object v12, v11, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v19, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    .line 1301
    invoke-direct/range {v11 .. v20}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1301
    :pswitch_1
    iget-object v1, v10, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v11, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-wide v8, v11

    invoke-direct/range {v0 .. v9}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1314
    :pswitch_2
    iget-object v1, v10, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v11, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v4, p1

    move-wide v8, v11

    invoke-direct/range {v0 .. v9}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1189
    :pswitch_3
    invoke-virtual/range {p0 .. p2}, Lj$/time/LocalDateTime;->j0(J)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    .line 1188
    div-long v2, v8, v0

    invoke-virtual {v10, v2, v3}, Lj$/time/LocalDateTime;->plusDays(J)Lj$/time/LocalDateTime;

    move-result-object v11

    rem-long v0, v8, v0

    const-wide/32 v2, 0xf4240

    mul-long v19, v0, v2

    .line 1340
    iget-object v12, v11, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    .line 1340
    invoke-direct/range {v11 .. v20}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :pswitch_5
    const-wide v0, 0x141dd76000L

    .line 1187
    div-long v2, v8, v0

    invoke-virtual {v10, v2, v3}, Lj$/time/LocalDateTime;->plusDays(J)Lj$/time/LocalDateTime;

    move-result-object v11

    rem-long v0, v8, v0

    const-wide/16 v2, 0x3e8

    mul-long v19, v0, v2

    .line 1340
    iget-object v12, v11, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    .line 1340
    invoke-direct/range {v11 .. v20}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1340
    :pswitch_6
    iget-object v1, v10, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v6, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v8, p1

    invoke-direct/range {v0 .. v9}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1196
    :cond_0
    invoke-interface {v0, v10, v8, v9}, Lj$/time/temporal/u;->p(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object v0

    check-cast v0, Lj$/time/LocalDateTime;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lj$/time/h;)Lj$/time/temporal/m;
    .locals 1

    .line 920
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-direct {p0, p1, v0}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final j0(J)Lj$/time/LocalDateTime;
    .locals 10

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    .line 1327
    iget-object v1, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    const-wide/16 v8, 0x0

    move-object v0, p0

    move-wide v6, p1

    invoke-direct/range {v0 .. v9}, Lj$/time/LocalDateTime;->k0(Lj$/time/h;JJJJ)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final k(JLj$/time/temporal/b;)Lj$/time/chrono/e;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1395
    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    goto :goto_0

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lj$/time/LocalDateTime;->i0(JLj$/time/temporal/u;)Lj$/time/LocalDateTime;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final l(Lj$/time/temporal/r;)Lj$/time/temporal/w;
    .locals 1

    .line 649
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    .line 650
    move-object v0, p1

    check-cast v0, Lj$/time/temporal/a;

    .line 651
    invoke-virtual {v0}, Lj$/time/temporal/a;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-interface {v0, p1}, Lj$/time/temporal/TemporalAccessor;->l(Lj$/time/temporal/r;)Lj$/time/temporal/w;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1}, Lj$/time/h;->l(Lj$/time/temporal/r;)Lj$/time/temporal/w;

    move-result-object p1

    :goto_0
    return-object p1

    .line 653
    :cond_1
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1
.end method

.method public final l0()Lj$/time/h;
    .locals 1

    .line 736
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    return-object v0
.end method

.method public final m0(JLj$/time/temporal/r;)Lj$/time/LocalDateTime;
    .locals 3

    .line 965
    instance-of v0, p3, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    .line 966
    move-object v0, p3

    check-cast v0, Lj$/time/temporal/a;

    .line 967
    invoke-virtual {v0}, Lj$/time/temporal/a;->a0()Z

    move-result v0

    iget-object v1, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    iget-object v2, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    if-eqz v0, :cond_0

    .line 968
    invoke-virtual {v1, p1, p2, p3}, Lj$/time/l;->m0(JLj$/time/temporal/r;)Lj$/time/l;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1

    .line 970
    :cond_0
    invoke-virtual {v2, p1, p2, p3}, Lj$/time/h;->p0(JLj$/time/temporal/r;)Lj$/time/h;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1

    .line 973
    :cond_1
    invoke-interface {p3, p0, p1, p2}, Lj$/time/temporal/r;->p(Lj$/time/temporal/m;J)Lj$/time/temporal/m;

    move-result-object p1

    check-cast p1, Lj$/time/LocalDateTime;

    return-object p1
.end method

.method public final n()Lj$/time/l;
    .locals 1

    .line 832
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    return-object v0
.end method

.method public final n0(Lj$/time/h;)Lj$/time/LocalDateTime;
    .locals 1

    .line 920
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-direct {p0, p1, v0}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final o()Lj$/time/chrono/b;
    .locals 1

    .line 135
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    return-object v0
.end method

.method final p0(Ljava/io/DataOutput;)V
    .locals 1

    .line 2003
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1}, Lj$/time/h;->t0(Ljava/io/DataOutput;)V

    .line 2004
    iget-object v0, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v0, p1}, Lj$/time/l;->o0(Ljava/io/DataOutput;)V

    return-void
.end method

.method public plusDays(J)Lj$/time/LocalDateTime;
    .locals 1

    .line 1286
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1, p2}, Lj$/time/h;->k0(J)Lj$/time/h;

    move-result-object p1

    .line 1287
    iget-object p2, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-direct {p0, p1, p2}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public plusWeeks(J)Lj$/time/LocalDateTime;
    .locals 1

    .line 1266
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0, p1, p2}, Lj$/time/h;->m0(J)Lj$/time/h;

    move-result-object p1

    .line 1267
    iget-object p2, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-direct {p0, p1, p2}, Lj$/time/LocalDateTime;->o0(Lj$/time/h;Lj$/time/l;)Lj$/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1972
    iget-object v0, p0, Lj$/time/LocalDateTime;->a:Lj$/time/h;

    invoke-virtual {v0}, Lj$/time/h;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj$/time/LocalDateTime;->b:Lj$/time/l;

    invoke-virtual {v1}, Lj$/time/l;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "T"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
