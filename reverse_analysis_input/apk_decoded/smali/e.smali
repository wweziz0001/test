.class public final Le;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Le;

.field public static final b:LB3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le;->a:Le;

    .line 7
    .line 8
    new-instance v0, Lc;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lc;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LB3/e;

    .line 15
    .line 16
    invoke-direct {v1, v0}, LB3/e;-><init>(LM3/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Le;->b:LB3/e;

    .line 20
    .line 21
    return-void
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

.method public static a()Ln3/m;
    .locals 1

    .line 1
    sget-object v0, Le;->b:LB3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LB3/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ln3/m;

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

.method public static b(Le;Ln3/f;La3/a;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "binaryMessenger"

    .line 5
    .line 6
    invoke-static {p1, p0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "."

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    new-instance v0, LZ1/i;

    .line 24
    .line 25
    const-string v1, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle"

    .line 26
    .line 27
    invoke-static {v1, p0}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {}, Le;->a()Ln3/m;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v0, p1, v1, v2, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 37
    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    new-instance v1, Ld;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v1, p2, v2}, Ld;-><init>(La3/a;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, LZ1/i;->E(Ln3/b;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    new-instance v0, LZ1/i;

    .line 55
    .line 56
    const-string v1, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled"

    .line 57
    .line 58
    invoke-static {v1, p0}, Lb3/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {}, Le;->a()Ln3/m;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, p1, p0, v1, v3}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 67
    .line 68
    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    new-instance p0, Ld;

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-direct {p0, p2, p1}, Ld;-><init>(La3/a;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0}, LZ1/i;->E(Ln3/b;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v0, v3}, LZ1/i;->E(Ln3/b;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void
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
