.class public abstract Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/j;

.field public static final b:Ly2/i;

.field public static final c:Ly2/c;

.field public static final d:Ly2/a;

.field public static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 2
    .line 3
    invoke-static {v0}, Ly2/s;->b(Ljava/lang/String;)LF2/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ly2/j;

    .line 8
    .line 9
    const-class v2, Lw2/c;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ly2/j;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lw2/d;->a:Ly2/j;

    .line 15
    .line 16
    new-instance v1, Ly2/i;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ly2/i;-><init>(LF2/a;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lw2/d;->b:Ly2/i;

    .line 22
    .line 23
    new-instance v1, Ly2/c;

    .line 24
    .line 25
    const-class v2, Lw2/a;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ly2/c;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lw2/d;->c:Ly2/c;

    .line 31
    .line 32
    new-instance v1, Ls2/l;

    .line 33
    .line 34
    const/4 v2, 0x7

    .line 35
    invoke-direct {v1, v2}, Ls2/l;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ly2/a;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, Ly2/a;-><init>(LF2/a;Ly2/b;)V

    .line 41
    .line 42
    .line 43
    sput-object v2, Lw2/d;->d:Ly2/a;

    .line 44
    .line 45
    new-instance v0, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lw2/b;->d:Lw2/b;

    .line 51
    .line 52
    sget-object v2, LD2/r0;->p:LD2/r0;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v3, Lw2/b;->b:Lw2/b;

    .line 58
    .line 59
    sget-object v4, LD2/r0;->n:LD2/r0;

    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v5, Lw2/b;->c:Lw2/b;

    .line 65
    .line 66
    sget-object v6, LD2/r0;->q:LD2/r0;

    .line 67
    .line 68
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/EnumMap;

    .line 75
    .line 76
    const-class v7, LD2/r0;

    .line 77
    .line 78
    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v4, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v6, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object v1, LD2/r0;->o:LD2/r0;

    .line 91
    .line 92
    invoke-virtual {v0, v1, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lw2/d;->e:Ljava/util/Map;

    .line 100
    .line 101
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method
