.class public final LT0/c;
.super LT0/i;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LT0/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final m:Ljava/lang/String;

.field public final n:I

.field public final o:I

.field public final p:J

.field public final q:J

.field public final r:[LT0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD1/a;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LD1/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LT0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
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
    .locals 4

    .line 8
    const-string v0, "CHAP"

    invoke-direct {p0, v0}, LT0/i;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget v1, Ld0/w;->a:I

    iput-object v0, p0, LT0/c;->m:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LT0/c;->n:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LT0/c;->o:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, LT0/c;->p:J

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, LT0/c;->q:J

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 15
    new-array v1, v0, [LT0/i;

    iput-object v1, p0, LT0/c;->r:[LT0/i;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    iget-object v2, p0, LT0/c;->r:[LT0/i;

    const-class v3, LT0/i;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, LT0/i;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIJJ[LT0/i;)V
    .locals 1

    .line 1
    const-string v0, "CHAP"

    invoke-direct {p0, v0}, LT0/i;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, LT0/c;->m:Ljava/lang/String;

    .line 3
    iput p2, p0, LT0/c;->n:I

    .line 4
    iput p3, p0, LT0/c;->o:I

    .line 5
    iput-wide p4, p0, LT0/c;->p:J

    .line 6
    iput-wide p6, p0, LT0/c;->q:J

    .line 7
    iput-object p8, p0, LT0/c;->r:[LT0/i;

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
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, LT0/c;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, LT0/c;

    .line 18
    .line 19
    iget v2, p0, LT0/c;->n:I

    .line 20
    .line 21
    iget v3, p1, LT0/c;->n:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, LT0/c;->o:I

    .line 26
    .line 27
    iget v3, p1, LT0/c;->o:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget-wide v2, p0, LT0/c;->p:J

    .line 32
    .line 33
    iget-wide v4, p1, LT0/c;->p:J

    .line 34
    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    iget-wide v2, p0, LT0/c;->q:J

    .line 40
    .line 41
    iget-wide v4, p1, LT0/c;->q:J

    .line 42
    .line 43
    cmp-long v2, v2, v4

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    sget v2, Ld0/w;->a:I

    .line 48
    .line 49
    iget-object v2, p0, LT0/c;->m:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p1, LT0/c;->m:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, LT0/c;->r:[LT0/i;

    .line 60
    .line 61
    iget-object p1, p1, LT0/c;->r:[LT0/i;

    .line 62
    .line 63
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v0, v1

    .line 71
    :goto_0
    return v0

    .line 72
    :cond_3
    :goto_1
    return v1
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    iget v1, p0, LT0/c;->n:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, LT0/c;->o:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-wide v1, p0, LT0/c;->p:J

    .line 14
    .line 15
    long-to-int v1, v1

    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-wide v1, p0, LT0/c;->q:J

    .line 20
    .line 21
    long-to-int v1, v1

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget-object v1, p0, LT0/c;->m:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    add-int/2addr v0, v1

    .line 36
    return v0
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-object p2, p0, LT0/c;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, LT0/c;->n:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, LT0/c;->o:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, LT0/c;->p:J

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 19
    .line 20
    .line 21
    iget-wide v0, p0, LT0/c;->q:J

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, LT0/c;->r:[LT0/i;

    .line 27
    .line 28
    array-length v0, p2

    .line 29
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    array-length v0, p2

    .line 33
    const/4 v1, 0x0

    .line 34
    move v2, v1

    .line 35
    :goto_0
    if-ge v2, v0, :cond_0

    .line 36
    .line 37
    aget-object v3, p2, v2

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
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
