.class public final Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/os/Bundle;

.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public final c:[Lt/c0;

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:Z

.field public final h:I

.field public final i:Ljava/lang/CharSequence;

.field public final j:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lt/c0;[Lt/c0;ZIZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p6, 0x1

    .line 5
    iput-boolean p6, p0, Lt/l;->e:Z

    .line 6
    .line 7
    iput-object p1, p0, Lt/l;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget p6, p1, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    if-ne p6, v0, :cond_0

    .line 15
    .line 16
    iget-object p6, p1, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p6}, Lx/b;->c(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p6

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    if-ne p6, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->h()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lt/l;->h:I

    .line 30
    .line 31
    :cond_1
    invoke-static {p2}, Lt/r;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lt/l;->i:Ljava/lang/CharSequence;

    .line 36
    .line 37
    iput-object p3, p0, Lt/l;->j:Landroid/app/PendingIntent;

    .line 38
    .line 39
    if-eqz p4, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance p4, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 45
    .line 46
    .line 47
    :goto_0
    iput-object p4, p0, Lt/l;->a:Landroid/os/Bundle;

    .line 48
    .line 49
    iput-object p5, p0, Lt/l;->c:[Lt/c0;

    .line 50
    .line 51
    iput-boolean p7, p0, Lt/l;->d:Z

    .line 52
    .line 53
    iput p8, p0, Lt/l;->f:I

    .line 54
    .line 55
    iput-boolean p9, p0, Lt/l;->e:Z

    .line 56
    .line 57
    iput-boolean p10, p0, Lt/l;->g:Z

    .line 58
    .line 59
    return-void
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
.end method


# virtual methods
.method public final a()Landroidx/core/graphics/drawable/IconCompat;
    .locals 3

    .line 1
    iget-object v0, p0, Lt/l;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lt/l;->h:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, ""

    .line 11
    .line 12
    invoke-static {v1, v2, v0}, Landroidx/core/graphics/drawable/IconCompat;->g(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lt/l;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lt/l;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 19
    .line 20
    return-object v0
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
