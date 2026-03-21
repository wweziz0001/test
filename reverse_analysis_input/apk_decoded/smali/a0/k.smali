.class public final La0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La0/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public l:I

.field public final m:Ljava/util/UUID;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La0/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La0/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La0/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, La0/k;->m:Ljava/util/UUID;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La0/k;->n:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget v1, Ld0/w;->a:I

    iput-object v0, p0, La0/k;->o:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, La0/k;->p:[B

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, La0/k;->m:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, La0/k;->n:Ljava/lang/String;

    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-static {p3}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La0/k;->o:Ljava/lang/String;

    .line 7
    iput-object p4, p0, La0/k;->p:[B

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, La0/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    check-cast p1, La0/k;

    .line 12
    .line 13
    iget-object v2, p1, La0/k;->n:Ljava/lang/String;

    .line 14
    .line 15
    sget v3, Ld0/w;->a:I

    .line 16
    .line 17
    iget-object v3, p0, La0/k;->n:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, La0/k;->o:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, La0/k;->o:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, La0/k;->m:Ljava/util/UUID;

    .line 36
    .line 37
    iget-object v3, p1, La0/k;->m:Ljava/util/UUID;

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, La0/k;->p:[B

    .line 46
    .line 47
    iget-object p1, p1, La0/k;->p:[B

    .line 48
    .line 49
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    move v1, v0

    .line 56
    :cond_2
    return v1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La0/k;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La0/k;->m:Ljava/util/UUID;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-object v2, p0, La0/k;->n:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_0
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La0/k;->o:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v2, v1}, Lb3/a;->e(ILjava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, La0/k;->p:[B

    .line 33
    .line 34
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v0

    .line 39
    iput v1, p0, La0/k;->l:I

    .line 40
    .line 41
    :cond_1
    iget v0, p0, La0/k;->l:I

    .line 42
    .line 43
    return v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, La0/k;->m:Ljava/util/UUID;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, La0/k;->n:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, La0/k;->o:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, La0/k;->p:[B

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 30
    .line 31
    .line 32
    return-void
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
