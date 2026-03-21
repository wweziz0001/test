.class public final LW/c;
.super LW/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LW/a;->b:LW/a;

    invoke-direct {p0, v0}, LW/c;-><init>(LW/b;)V

    return-void
.end method

.method public constructor <init>(LW/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, LW/b;-><init>()V

    .line 3
    iget-object v0, p0, LW/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, LW/b;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
