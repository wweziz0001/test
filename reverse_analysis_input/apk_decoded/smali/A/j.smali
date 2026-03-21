.class public final LA/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/w;
.implements Lx0/f0;


# instance fields
.field public l:I

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IB)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ld0/p;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Ld0/p;-><init>(I)V

    iput-object p1, p0, LA/j;->m:Ljava/lang/Object;

    return-void

    :pswitch_0
    const/16 p1, 0x20

    const/4 p2, 0x4

    .line 5
    invoke-direct {p0, p1, p2}, LA/j;-><init>(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LA/j;->m:Ljava/lang/Object;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The max pool size must be > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-array p1, p1, [J

    iput-object p1, p0, LA/j;->m:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/j;->l:I

    iput-object p2, p0, LA/j;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput-object p1, p0, LA/j;->m:Ljava/lang/Object;

    iput p2, p0, LA/j;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/q;

    .line 4
    .line 5
    iget-object v0, v0, Lt0/q;->w:LK3/b;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    throw v0
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

.method public b(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureRequired(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public c()I
    .locals 2

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Landroid/media/MediaCodecInfo;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/MediaCodecList;

    .line 8
    .line 9
    iget v1, p0, LA/j;->l:I

    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, [Landroid/media/MediaCodecInfo;

    .line 23
    .line 24
    array-length v0, v0

    .line 25
    return v0
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

.method public d(J)I
    .locals 2

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/q;

    .line 4
    .line 5
    iget-boolean v1, v0, Lt0/q;->B:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, v0, Lt0/q;->p:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget v1, p0, LA/j;->l:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lt0/p;

    .line 20
    .line 21
    iget-object v1, v0, Lt0/p;->c:Lx0/e0;

    .line 22
    .line 23
    iget-boolean v0, v0, Lt0/p;->d:Z

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2, v0}, Lx0/e0;->p(JZ)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {v1, p1}, Lx0/e0;->C(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return p1
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

.method public e(I)Landroid/media/MediaCodecInfo;
    .locals 2

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Landroid/media/MediaCodecInfo;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/MediaCodecList;

    .line 8
    .line 9
    iget v1, p0, LA/j;->l:I

    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, [Landroid/media/MediaCodecInfo;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    return-object p1
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

.method public f(J)V
    .locals 3

    .line 1
    iget v0, p0, LA/j;->l:I

    .line 2
    .line 3
    iget-object v1, p0, LA/j;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [J

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    mul-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, [J

    .line 21
    .line 22
    iget v1, p0, LA/j;->l:I

    .line 23
    .line 24
    add-int/lit8 v2, v1, 0x1

    .line 25
    .line 26
    iput v2, p0, LA/j;->l:I

    .line 27
    .line 28
    aput-wide p1, v0, v1

    .line 29
    .line 30
    return-void
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

.method public g([J)V
    .locals 5

    .line 1
    iget v0, p0, LA/j;->l:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget-object v1, p0, LA/j;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-le v0, v2, :cond_0

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    mul-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, LA/j;->m:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, LA/j;->m:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, [J

    .line 28
    .line 29
    iget v2, p0, LA/j;->l:I

    .line 30
    .line 31
    array-length v3, p1

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {p1, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iput v0, p0, LA/j;->l:I

    .line 37
    .line 38
    return-void
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

.method public h(ILd0/o;)Ll1/F;
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    iget-object v2, p2, Ld0/o;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    if-eq p1, v1, :cond_d

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p1, v1, :cond_d

    .line 13
    .line 14
    const/16 v3, 0x15

    .line 15
    .line 16
    if-eq p1, v3, :cond_c

    .line 17
    .line 18
    const/16 v3, 0x1b

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eq p1, v3, :cond_a

    .line 22
    .line 23
    const/16 v1, 0x24

    .line 24
    .line 25
    if-eq p1, v1, :cond_9

    .line 26
    .line 27
    const/16 v1, 0x2d

    .line 28
    .line 29
    if-eq p1, v1, :cond_8

    .line 30
    .line 31
    const/16 v1, 0x59

    .line 32
    .line 33
    if-eq p1, v1, :cond_7

    .line 34
    .line 35
    const/16 v1, 0xac

    .line 36
    .line 37
    if-eq p1, v1, :cond_6

    .line 38
    .line 39
    const/16 v1, 0x101

    .line 40
    .line 41
    if-eq p1, v1, :cond_5

    .line 42
    .line 43
    const/16 v1, 0x8a

    .line 44
    .line 45
    if-eq p1, v1, :cond_4

    .line 46
    .line 47
    const/16 v1, 0x8b

    .line 48
    .line 49
    if-eq p1, v1, :cond_3

    .line 50
    .line 51
    packed-switch p1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    packed-switch p1, :pswitch_data_1

    .line 55
    .line 56
    .line 57
    packed-switch p1, :pswitch_data_2

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_0
    const/16 p1, 0x10

    .line 62
    .line 63
    invoke-virtual {p0, p1}, LA/j;->n(I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    new-instance v4, Ll1/B;

    .line 71
    .line 72
    new-instance p1, LZ1/m;

    .line 73
    .line 74
    const-string p2, "application/x-scte35"

    .line 75
    .line 76
    invoke-direct {p1, p2}, LZ1/m;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v4, p1}, Ll1/B;-><init>(Ll1/A;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    return-object v4

    .line 83
    :pswitch_1
    const/16 p1, 0x40

    .line 84
    .line 85
    invoke-virtual {p0, p1}, LA/j;->n(I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    return-object v4

    .line 92
    :pswitch_2
    new-instance p1, Ll1/w;

    .line 93
    .line 94
    new-instance v0, Ll1/b;

    .line 95
    .line 96
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v0, p2, v2, v1}, Ll1/b;-><init>(ILjava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_3
    invoke-virtual {p0, v0}, LA/j;->n(I)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    new-instance v4, Ll1/w;

    .line 116
    .line 117
    new-instance p1, Ll1/s;

    .line 118
    .line 119
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-direct {p1, v2, p2}, Ll1/s;-><init>(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v4, p1}, Ll1/w;-><init>(Ll1/h;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    return-object v4

    .line 130
    :pswitch_4
    new-instance p1, Ll1/w;

    .line 131
    .line 132
    new-instance v0, Ll1/m;

    .line 133
    .line 134
    new-instance v1, LZ1/e;

    .line 135
    .line 136
    invoke-virtual {p0, p2}, LA/j;->m(Ld0/o;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-direct {v1, p2}, LZ1/e;-><init>(Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v0, v1}, Ll1/m;-><init>(LZ1/e;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 147
    .line 148
    .line 149
    return-object p1

    .line 150
    :pswitch_5
    invoke-virtual {p0, v0}, LA/j;->n(I)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_2

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_2
    new-instance v4, Ll1/w;

    .line 158
    .line 159
    new-instance p1, Ll1/e;

    .line 160
    .line 161
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-direct {p1, p2, v2, v0}, Ll1/e;-><init>(ILjava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    invoke-direct {v4, p1}, Ll1/w;-><init>(Ll1/h;)V

    .line 170
    .line 171
    .line 172
    :goto_2
    return-object v4

    .line 173
    :cond_3
    new-instance p1, Ll1/w;

    .line 174
    .line 175
    new-instance v0, Ll1/f;

    .line 176
    .line 177
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    const/16 v1, 0x1520

    .line 182
    .line 183
    invoke-direct {v0, p2, v2, v1}, Ll1/f;-><init>(ILjava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_4
    :pswitch_6
    new-instance p1, Ll1/w;

    .line 191
    .line 192
    new-instance v0, Ll1/f;

    .line 193
    .line 194
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    const/16 v1, 0x1000

    .line 199
    .line 200
    invoke-direct {v0, p2, v2, v1}, Ll1/f;-><init>(ILjava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 204
    .line 205
    .line 206
    return-object p1

    .line 207
    :cond_5
    new-instance p1, Ll1/B;

    .line 208
    .line 209
    new-instance p2, LZ1/m;

    .line 210
    .line 211
    const-string v0, "application/vnd.dvb.ait"

    .line 212
    .line 213
    invoke-direct {p2, v0}, LZ1/m;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {p1, p2}, Ll1/B;-><init>(Ll1/A;)V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_6
    new-instance p1, Ll1/w;

    .line 221
    .line 222
    new-instance v0, Ll1/b;

    .line 223
    .line 224
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    const/4 v1, 0x1

    .line 229
    invoke-direct {v0, p2, v2, v1}, Ll1/b;-><init>(ILjava/lang/String;I)V

    .line 230
    .line 231
    .line 232
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 233
    .line 234
    .line 235
    return-object p1

    .line 236
    :cond_7
    new-instance p1, Ll1/w;

    .line 237
    .line 238
    new-instance v0, Ll1/g;

    .line 239
    .line 240
    iget-object p2, p2, Ld0/o;->n:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p2, Ljava/util/List;

    .line 243
    .line 244
    invoke-direct {v0, p2}, Ll1/g;-><init>(Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 248
    .line 249
    .line 250
    return-object p1

    .line 251
    :cond_8
    new-instance p1, Ll1/w;

    .line 252
    .line 253
    new-instance p2, Ll1/u;

    .line 254
    .line 255
    invoke-direct {p2}, Ll1/u;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-direct {p1, p2}, Ll1/w;-><init>(Ll1/h;)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :cond_9
    new-instance p1, Ll1/w;

    .line 263
    .line 264
    new-instance v0, Ll1/r;

    .line 265
    .line 266
    new-instance v1, LZ1/s;

    .line 267
    .line 268
    invoke-virtual {p0, p2}, LA/j;->m(Ld0/o;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-direct {v1, p2}, LZ1/s;-><init>(Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    invoke-direct {v0, v1}, Ll1/r;-><init>(LZ1/s;)V

    .line 276
    .line 277
    .line 278
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 279
    .line 280
    .line 281
    return-object p1

    .line 282
    :cond_a
    invoke-virtual {p0, v1}, LA/j;->n(I)Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_b

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_b
    new-instance v4, Ll1/w;

    .line 290
    .line 291
    new-instance p1, Ll1/p;

    .line 292
    .line 293
    new-instance v0, LZ1/s;

    .line 294
    .line 295
    invoke-virtual {p0, p2}, LA/j;->m(Ld0/o;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    invoke-direct {v0, p2}, LZ1/s;-><init>(Ljava/util/List;)V

    .line 300
    .line 301
    .line 302
    const/4 p2, 0x1

    .line 303
    invoke-virtual {p0, p2}, LA/j;->n(I)Z

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    const/16 v1, 0x8

    .line 308
    .line 309
    invoke-virtual {p0, v1}, LA/j;->n(I)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-direct {p1, v0, p2, v1}, Ll1/p;-><init>(LZ1/s;ZZ)V

    .line 314
    .line 315
    .line 316
    invoke-direct {v4, p1}, Ll1/w;-><init>(Ll1/h;)V

    .line 317
    .line 318
    .line 319
    :goto_3
    return-object v4

    .line 320
    :cond_c
    new-instance p1, Ll1/w;

    .line 321
    .line 322
    new-instance p2, Ll1/g;

    .line 323
    .line 324
    invoke-direct {p2}, Ll1/g;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-direct {p1, p2}, Ll1/w;-><init>(Ll1/h;)V

    .line 328
    .line 329
    .line 330
    return-object p1

    .line 331
    :cond_d
    new-instance p1, Ll1/w;

    .line 332
    .line 333
    new-instance v0, Ll1/t;

    .line 334
    .line 335
    invoke-virtual {p2}, Ld0/o;->e()I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    invoke-direct {v0, v2, p2}, Ll1/t;-><init>(Ljava/lang/String;I)V

    .line 340
    .line 341
    .line 342
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :cond_e
    :pswitch_7
    new-instance p1, Ll1/w;

    .line 347
    .line 348
    new-instance v0, Ll1/j;

    .line 349
    .line 350
    new-instance v1, LZ1/e;

    .line 351
    .line 352
    invoke-virtual {p0, p2}, LA/j;->m(Ld0/o;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    invoke-direct {v1, p2}, LZ1/e;-><init>(Ljava/util/List;)V

    .line 357
    .line 358
    .line 359
    invoke-direct {v0, v1}, Ll1/j;-><init>(LZ1/e;)V

    .line 360
    .line 361
    .line 362
    invoke-direct {p1, v0}, Ll1/w;-><init>(Ll1/h;)V

    .line 363
    .line 364
    .line 365
    return-object p1

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_7
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    :pswitch_data_2
    .packed-switch 0x86
        :pswitch_0
        :pswitch_2
        :pswitch_6
    .end packed-switch
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
.end method

.method public i(I)J
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, LA/j;->l:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, [J

    .line 10
    .line 11
    aget-wide v1, v0, p1

    .line 12
    .line 13
    return-wide v1

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 15
    .line 16
    const-string v1, "Invalid index "

    .line 17
    .line 18
    const-string v2, ", size is "

    .line 19
    .line 20
    invoke-static {p1, v1, v2}, Lm/B0;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget v1, p0, LA/j;->l:I

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method public isReady()Z
    .locals 2

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/q;

    .line 4
    .line 5
    iget-boolean v1, v0, Lt0/q;->B:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lt0/q;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget v1, p0, LA/j;->l:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lt0/p;

    .line 18
    .line 19
    iget-object v1, v0, Lt0/p;->c:Lx0/e0;

    .line 20
    .line 21
    iget-boolean v0, v0, Lt0/p;->d:Z

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lx0/e0;->s(Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

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
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    .line 1
    invoke-virtual {p3, p1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public k(LZ1/e;Lg0/e;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/q;

    .line 4
    .line 5
    iget-boolean v1, v0, Lt0/q;->B:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, v0, Lt0/q;->p:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget v1, p0, LA/j;->l:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lt0/p;

    .line 20
    .line 21
    iget-object v1, v0, Lt0/p;->c:Lx0/e0;

    .line 22
    .line 23
    iget-boolean v0, v0, Lt0/p;->d:Z

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2, p3, v0}, Lx0/e0;->x(LZ1/e;Lg0/e;IZ)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    :goto_0
    return p1
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
.end method

.method public l()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

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

.method public m(Ld0/o;)Ljava/util/List;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    invoke-virtual {p0, v1}, LA/j;->n(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    iget-object v2, p0, LA/j;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/List;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    new-instance v1, Ld0/p;

    .line 16
    .line 17
    iget-object p1, p1, Ld0/o;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, [B

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ld0/p;-><init>([B)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-lez p1, :cond_8

    .line 29
    .line 30
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v4, v1, Ld0/p;->b:I

    .line 39
    .line 40
    add-int/2addr v4, v3

    .line 41
    const/16 v3, 0x86

    .line 42
    .line 43
    if-ne p1, v3, :cond_7

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    and-int/lit8 v2, v2, 0x1f

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    move v5, v3

    .line 58
    :goto_1
    if-ge v5, v2, :cond_6

    .line 59
    .line 60
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 61
    .line 62
    const/4 v7, 0x3

    .line 63
    invoke-virtual {v1, v7, v6}, Ld0/p;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    and-int/lit16 v8, v7, 0x80

    .line 72
    .line 73
    if-eqz v8, :cond_1

    .line 74
    .line 75
    move v8, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move v8, v3

    .line 78
    :goto_2
    if-eqz v8, :cond_2

    .line 79
    .line 80
    and-int/lit8 v7, v7, 0x3f

    .line 81
    .line 82
    const-string v9, "application/cea-708"

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    const-string v9, "application/cea-608"

    .line 86
    .line 87
    move v7, v0

    .line 88
    :goto_3
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    int-to-byte v10, v10

    .line 93
    invoke-virtual {v1, v0}, Ld0/p;->I(I)V

    .line 94
    .line 95
    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    and-int/lit8 v8, v10, 0x40

    .line 99
    .line 100
    if-eqz v8, :cond_3

    .line 101
    .line 102
    move v8, v0

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    move v8, v3

    .line 105
    :goto_4
    sget-object v10, Ld0/b;->a:[B

    .line 106
    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    new-array v8, v0, [B

    .line 110
    .line 111
    aput-byte v0, v8, v3

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_4
    new-array v8, v0, [B

    .line 115
    .line 116
    aput-byte v3, v8, v3

    .line 117
    .line 118
    :goto_5
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    goto :goto_6

    .line 123
    :cond_5
    const/4 v8, 0x0

    .line 124
    :goto_6
    new-instance v10, La0/o;

    .line 125
    .line 126
    invoke-direct {v10}, La0/o;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-static {v9}, La0/G;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    iput-object v9, v10, La0/o;->m:Ljava/lang/String;

    .line 134
    .line 135
    iput-object v6, v10, La0/o;->d:Ljava/lang/String;

    .line 136
    .line 137
    iput v7, v10, La0/o;->G:I

    .line 138
    .line 139
    iput-object v8, v10, La0/o;->p:Ljava/util/List;

    .line 140
    .line 141
    new-instance v6, La0/p;

    .line 142
    .line 143
    invoke-direct {v6, v10}, La0/p;-><init>(La0/o;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    add-int/2addr v5, v0

    .line 150
    goto :goto_1

    .line 151
    :cond_6
    move-object v2, p1

    .line 152
    :cond_7
    invoke-virtual {v1, v4}, Ld0/p;->H(I)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_8
    return-object v2
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

.method public n(I)Z
    .locals 1

    .line 1
    iget v0, p0, LA/j;->l:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    return p1
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

.method public o(LF0/m;)J
    .locals 7

    .line 1
    iget-object v0, p0, LA/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld0/p;

    .line 4
    .line 5
    iget-object v1, v0, Ld0/p;->a:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {p1, v1, v2, v3, v2}, LF0/m;->t([BIIZ)Z

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Ld0/p;->a:[B

    .line 13
    .line 14
    aget-byte v1, v1, v2

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/high16 v0, -0x8000000000000000L

    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_0
    const/16 v4, 0x80

    .line 24
    .line 25
    move v5, v2

    .line 26
    :goto_0
    and-int v6, v1, v4

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    shr-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    not-int v4, v4

    .line 36
    and-int/2addr v1, v4

    .line 37
    iget-object v4, v0, Ld0/p;->a:[B

    .line 38
    .line 39
    invoke-virtual {p1, v4, v3, v5, v2}, LF0/m;->t([BIIZ)Z

    .line 40
    .line 41
    .line 42
    :goto_1
    if-ge v2, v5, :cond_2

    .line 43
    .line 44
    shl-int/lit8 p1, v1, 0x8

    .line 45
    .line 46
    iget-object v1, v0, Ld0/p;->a:[B

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    aget-byte v1, v1, v2

    .line 51
    .line 52
    and-int/lit16 v1, v1, 0xff

    .line 53
    .line 54
    add-int/2addr v1, p1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget p1, p0, LA/j;->l:I

    .line 57
    .line 58
    add-int/2addr v5, v3

    .line 59
    add-int/2addr v5, p1

    .line 60
    iput v5, p0, LA/j;->l:I

    .line 61
    .line 62
    int-to-long v0, v1

    .line 63
    return-wide v0
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
