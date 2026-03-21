.class public abstract enum LG2/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum l:LG2/l;

.field public static final enum m:LG2/m;

.field public static final synthetic n:[LG2/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LG2/l;

    .line 2
    .line 3
    invoke-direct {v0}, LG2/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LG2/p;->l:LG2/l;

    .line 7
    .line 8
    new-instance v1, LG2/m;

    .line 9
    .line 10
    invoke-direct {v1}, LG2/m;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LG2/p;->m:LG2/m;

    .line 14
    .line 15
    new-instance v2, LG2/n;

    .line 16
    .line 17
    invoke-direct {v2}, LG2/n;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, LG2/o;

    .line 21
    .line 22
    invoke-direct {v3}, LG2/o;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    new-array v4, v4, [LG2/p;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v4, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object v3, v4, v0

    .line 39
    .line 40
    sput-object v4, LG2/p;->n:[LG2/p;

    .line 41
    .line 42
    return-void
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

.method public static valueOf(Ljava/lang/String;)LG2/p;
    .locals 1

    .line 1
    const-class v0, LG2/p;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LG2/p;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method public static values()[LG2/p;
    .locals 1

    .line 1
    sget-object v0, LG2/p;->n:[LG2/p;

    .line 2
    .line 3
    invoke-virtual {v0}, [LG2/p;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LG2/p;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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


# virtual methods
.method public abstract a(LO2/a;)Ljava/lang/Number;
.end method
