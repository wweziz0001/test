.class public final Lx0/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/G;


# instance fields
.field public final a:LZ1/e;

.field public final b:LI2/g;

.field public final c:Lf/a;

.field public final d:LA0/b;

.field public final e:I


# direct methods
.method public constructor <init>(LZ1/e;LF0/n;)V
    .locals 3

    .line 1
    new-instance v0, LI2/g;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, LI2/g;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lf/a;

    .line 9
    .line 10
    invoke-direct {p2}, Lf/a;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, LA0/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2}, LA0/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lx0/Z;->a:LZ1/e;

    .line 23
    .line 24
    iput-object v0, p0, Lx0/Z;->b:LI2/g;

    .line 25
    .line 26
    iput-object p2, p0, Lx0/Z;->c:Lf/a;

    .line 27
    .line 28
    iput-object v1, p0, Lx0/Z;->d:LA0/b;

    .line 29
    .line 30
    const/high16 p1, 0x100000

    .line 31
    .line 32
    iput p1, p0, Lx0/Z;->e:I

    .line 33
    .line 34
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
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


# virtual methods
.method public final a(La0/A;)Lx0/J;
    .locals 9

    .line 1
    iget-object v0, p1, La0/A;->b:La0/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx0/a0;

    .line 7
    .line 8
    iget-object v1, p0, Lx0/Z;->c:Lf/a;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lf/a;->b(La0/A;)Lm0/i;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-object v6, p0, Lx0/Z;->d:LA0/b;

    .line 15
    .line 16
    iget-object v4, p0, Lx0/Z;->b:LI2/g;

    .line 17
    .line 18
    iget v7, p0, Lx0/Z;->e:I

    .line 19
    .line 20
    iget-object v3, p0, Lx0/Z;->a:LZ1/e;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v1, v0

    .line 24
    move-object v2, p1

    .line 25
    invoke-direct/range {v1 .. v8}, Lx0/a0;-><init>(La0/A;Lf0/g;LI2/g;Lm0/i;LA0/b;IZ)V

    .line 26
    .line 27
    .line 28
    return-object v0
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
