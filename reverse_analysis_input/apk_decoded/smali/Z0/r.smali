.class public final LZ0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LD0/d;

.field public static final e:LD0/d;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ll2/b;

    .line 2
    .line 3
    const/16 v1, 0x3a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll2/b;-><init>(C)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LD0/d;

    .line 9
    .line 10
    new-instance v2, Landroidx/lifecycle/E;

    .line 11
    .line 12
    const/16 v3, 0xe

    .line 13
    .line 14
    invoke-direct {v2, v0, v3}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, LD0/d;-><init>(Landroidx/lifecycle/E;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, LZ0/r;->d:LD0/d;

    .line 21
    .line 22
    new-instance v0, Ll2/b;

    .line 23
    .line 24
    const/16 v1, 0x2a

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ll2/b;-><init>(C)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LD0/d;

    .line 30
    .line 31
    new-instance v2, Landroidx/lifecycle/E;

    .line 32
    .line 33
    const/16 v3, 0xe

    .line 34
    .line 35
    invoke-direct {v2, v0, v3}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2}, LD0/d;-><init>(Landroidx/lifecycle/E;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, LZ0/r;->e:LD0/d;

    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZ0/r;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, LZ0/r;->b:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method
