.class public final Lf0/j;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final l:Lf0/h;

.field public final m:Lf0/l;

.field public final n:[B

.field public o:Z

.field public p:Z


# direct methods
.method public constructor <init>(Lf0/h;Lf0/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lf0/j;->o:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lf0/j;->p:Z

    .line 8
    .line 9
    iput-object p1, p0, Lf0/j;->l:Lf0/h;

    .line 10
    .line 11
    iput-object p2, p0, Lf0/j;->m:Lf0/l;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, Lf0/j;->n:[B

    .line 17
    .line 18
    return-void
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
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/j;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf0/j;->l:Lf0/h;

    .line 6
    .line 7
    invoke-interface {v0}, Lf0/h;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lf0/j;->p:Z

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final read()I
    .locals 4

    .line 1
    iget-object v0, p0, Lf0/j;->n:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lf0/j;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-byte v0, v0, v2

    and-int/lit16 v3, v0, 0xff

    :goto_0
    return v3
.end method

.method public final read([B)I
    .locals 2

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lf0/j;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 4
    iget-boolean v0, p0, Lf0/j;->p:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 5
    iget-boolean v0, p0, Lf0/j;->o:Z

    iget-object v2, p0, Lf0/j;->l:Lf0/h;

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lf0/j;->m:Lf0/l;

    invoke-interface {v2, v0}, Lf0/h;->p(Lf0/l;)J

    .line 7
    iput-boolean v1, p0, Lf0/j;->o:Z

    .line 8
    :cond_0
    invoke-interface {v2, p1, p2, p3}, La0/h;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    return p1
.end method
