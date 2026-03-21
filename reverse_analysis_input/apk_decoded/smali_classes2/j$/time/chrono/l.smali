.class public interface abstract Lj$/time/chrono/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public static E(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/l;
    .locals 1

    .line 183
    const-string v0, "temporal"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    invoke-static {}, Lj$/time/temporal/s;->a()Lj$/time/temporal/t;

    move-result-object v0

    invoke-interface {p0, v0}, Lj$/time/temporal/TemporalAccessor;->a(Lj$/time/temporal/t;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/time/chrono/l;

    .line 185
    sget-object v0, Lj$/time/chrono/s;->d:Lj$/time/chrono/s;

    if-eqz p0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    const-string p0, "defaultObj"

    invoke-static {v0, p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public abstract C()Ljava/util/List;
.end method

.method public abstract F(III)Lj$/time/chrono/b;
.end method

.method public abstract K()Lj$/time/chrono/b;
.end method

.method public abstract M(I)Lj$/time/chrono/m;
.end method

.method public abstract O(Ljava/util/Map;Lj$/time/format/y;)Lj$/time/chrono/b;
.end method

.method public abstract Q()Ljava/lang/String;
.end method

.method public abstract T(Lj$/time/temporal/a;)Lj$/time/temporal/w;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract q(J)Lj$/time/chrono/b;
.end method

.method public abstract s(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/b;
.end method

.method public abstract v(Lj$/time/chrono/m;I)I
.end method

.method public w(Lj$/time/LocalDateTime;)Lj$/time/chrono/e;
    .locals 3

    .line 477
    :try_start_0
    invoke-interface {p0, p1}, Lj$/time/chrono/l;->s(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/b;

    move-result-object v0

    invoke-static {p1}, Lj$/time/l;->I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/l;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/time/chrono/b;->J(Lj$/time/l;)Lj$/time/chrono/e;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/c; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 479
    new-instance v0, Lj$/time/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain ChronoLocalDateTime from TemporalAccessor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lj$/time/LocalDateTime;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 479
    throw v0
.end method

.method public abstract x(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/chrono/ChronoZonedDateTime;
.end method

.method public abstract z(II)Lj$/time/chrono/b;
.end method
