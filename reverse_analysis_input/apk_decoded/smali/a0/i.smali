.class public final La0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LD/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LD/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget v1, v0, LD/o;->b:I

    .line 8
    .line 9
    iget v2, v0, LD/o;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-gt v1, v2, :cond_0

    .line 14
    .line 15
    move v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v4

    .line 18
    :goto_0
    invoke-static {v1}, Ld0/m;->c(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La0/i;

    .line 22
    .line 23
    invoke-direct {v1, v0}, La0/i;-><init>(LD/o;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, Ld0/w;->G(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Ld0/w;->G(I)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-static {v0}, Ld0/w;->G(I)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public constructor <init>(LD/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p1, LD/o;->b:I

    .line 8
    .line 9
    iput v0, p0, La0/i;->a:I

    .line 10
    .line 11
    iget p1, p1, LD/o;->c:I

    .line 12
    .line 13
    iput p1, p0, La0/i;->b:I

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La0/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La0/i;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, p0, La0/i;->a:I

    .line 17
    .line 18
    iget v3, p1, La0/i;->a:I

    .line 19
    .line 20
    if-ne v1, v3, :cond_2

    .line 21
    .line 22
    iget v1, p0, La0/i;->b:I

    .line 23
    .line 24
    iget p1, p1, La0/i;->b:I

    .line 25
    .line 26
    if-ne v1, p1, :cond_2

    .line 27
    .line 28
    sget p1, Ld0/w;->a:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :goto_0
    return v0
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

.method public final hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x3fd1

    .line 2
    .line 3
    iget v1, p0, La0/i;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, La0/i;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    return v0
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
