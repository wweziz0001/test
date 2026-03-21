.class public final LZ0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ0/c;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILandroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LZ0/f;->a:I

    .line 3
    iput p2, p0, LZ0/f;->b:I

    .line 4
    iput-object p3, p0, LZ0/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le0/c;La0/p;)V
    .locals 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object p1, p1, Le0/c;->n:Ld0/p;

    iput-object p1, p0, LZ0/f;->c:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 7
    invoke-virtual {p1, v0}, Ld0/p;->H(I)V

    .line 8
    invoke-virtual {p1}, Ld0/p;->z()I

    move-result v0

    .line 9
    iget-object v1, p2, La0/p;->n:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    iget v1, p2, La0/p;->E:I

    iget p2, p2, La0/p;->C:I

    invoke-static {v1, p2}, Ld0/w;->A(II)I

    move-result p2

    if-eqz v0, :cond_0

    .line 11
    rem-int v1, v0, p2

    if-eqz v1, :cond_1

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BoxParsers"

    invoke-static {v1, v0}, Ld0/m;->y(Ljava/lang/String;Ljava/lang/String;)V

    move v0, p2

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 13
    :cond_2
    iput v0, p0, LZ0/f;->a:I

    .line 14
    invoke-virtual {p1}, Ld0/p;->z()I

    move-result p1

    iput p1, p0, LZ0/f;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LZ0/f;->a:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LZ0/f;->b:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public c()I
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, LZ0/f;->a:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LZ0/f;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ld0/p;

    .line 9
    .line 10
    invoke-virtual {v0}, Ld0/p;->z()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :cond_0
    return v1
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
