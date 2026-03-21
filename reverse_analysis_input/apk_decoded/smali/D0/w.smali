.class public final LD0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/d;

.field public final b:LD0/s;

.field public final c:LD0/r;

.field public final d:LZ0/e;

.field public final e:LZ0/e;

.field public final f:Landroidx/datastore/preferences/protobuf/k;

.field public g:La0/e0;

.field public h:La0/e0;

.field public i:J

.field public j:J


# direct methods
.method public constructor <init>(LB0/d;LD0/s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/w;->a:LB0/d;

    .line 5
    .line 6
    iput-object p2, p0, LD0/w;->b:LD0/s;

    .line 7
    .line 8
    new-instance p1, LD0/r;

    .line 9
    .line 10
    invoke-direct {p1}, LD0/r;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LD0/w;->c:LD0/r;

    .line 14
    .line 15
    new-instance p1, LZ0/e;

    .line 16
    .line 17
    invoke-direct {p1}, LZ0/e;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LD0/w;->d:LZ0/e;

    .line 21
    .line 22
    new-instance p1, LZ0/e;

    .line 23
    .line 24
    invoke-direct {p1}, LZ0/e;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LD0/w;->e:LZ0/e;

    .line 28
    .line 29
    new-instance p1, Landroidx/datastore/preferences/protobuf/k;

    .line 30
    .line 31
    const/4 p2, 0x2

    .line 32
    invoke-direct {p1, p2}, Landroidx/datastore/preferences/protobuf/k;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/16 p2, 0x10

    .line 36
    .line 37
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    if-eq v0, v1, :cond_0

    .line 43
    .line 44
    const/16 p2, 0xf

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    shl-int/2addr p2, v1

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    iput v0, p1, Landroidx/datastore/preferences/protobuf/k;->b:I

    .line 53
    .line 54
    iput v0, p1, Landroidx/datastore/preferences/protobuf/k;->c:I

    .line 55
    .line 56
    new-array v0, p2, [J

    .line 57
    .line 58
    iput-object v0, p1, Landroidx/datastore/preferences/protobuf/k;->e:Ljava/lang/Object;

    .line 59
    .line 60
    sub-int/2addr p2, v1

    .line 61
    iput p2, p1, Landroidx/datastore/preferences/protobuf/k;->d:I

    .line 62
    .line 63
    iput-object p1, p0, LD0/w;->f:Landroidx/datastore/preferences/protobuf/k;

    .line 64
    .line 65
    sget-object p1, La0/e0;->d:La0/e0;

    .line 66
    .line 67
    iput-object p1, p0, LD0/w;->h:La0/e0;

    .line 68
    .line 69
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    iput-wide p1, p0, LD0/w;->j:J

    .line 75
    .line 76
    return-void
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
