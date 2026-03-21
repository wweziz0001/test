.class public final Lio/flutter/view/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Ljava/lang/reflect/Method;

.field public final d:Ljava/lang/reflect/Method;

.field public final e:Ljava/lang/reflect/Field;

.field public final f:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const-string v0, "getSourceNodeId"

    .line 2
    .line 3
    const-class v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    const-string v2, "AccessibilityBridge"

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v1, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const-string v4, "can\'t invoke AccessibilityNodeInfo#getSourceNodeId with reflection"

    .line 17
    .line 18
    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-object v4, v3

    .line 22
    :goto_0
    :try_start_1
    const-class v5, Landroid/view/accessibility/AccessibilityRecord;

    .line 23
    .line 24
    invoke-virtual {v5, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    goto :goto_1

    .line 29
    :catch_1
    const-string v0, "can\'t invoke AccessibiiltyRecord#getSourceNodeId with reflection"

    .line 30
    .line 31
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-object v0, v3

    .line 35
    :goto_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 v6, 0x1a

    .line 38
    .line 39
    if-gt v5, v6, :cond_0

    .line 40
    .line 41
    :try_start_2
    const-string v5, "getParentNodeId"

    .line 42
    .line 43
    invoke-virtual {v1, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 47
    goto :goto_2

    .line 48
    :catch_2
    const-string v5, "can\'t invoke getParentNodeId with reflection"

    .line 49
    .line 50
    invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-object v5, v3

    .line 54
    :goto_2
    :try_start_3
    const-string v6, "getChildId"

    .line 55
    .line 56
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3

    .line 66
    move-object v2, v3

    .line 67
    :goto_3
    move-object v3, v5

    .line 68
    :goto_4
    move-object v5, v2

    .line 69
    goto :goto_5

    .line 70
    :catch_3
    const-string v1, "can\'t invoke getChildId with reflection"

    .line 71
    .line 72
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-object v1, v3

    .line 76
    move-object v2, v1

    .line 77
    goto :goto_3

    .line 78
    :cond_0
    :try_start_4
    const-string v5, "mChildNodeIds"

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 86
    .line 87
    .line 88
    const-string v5, "android.util.LongArray"

    .line 89
    .line 90
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "get"

    .line 95
    .line 96
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_4

    .line 106
    move-object v5, v2

    .line 107
    move-object v2, v1

    .line 108
    move-object v1, v3

    .line 109
    goto :goto_5

    .line 110
    :catch_4
    const-string v1, "can\'t access childNodeIdsField with reflection"

    .line 111
    .line 112
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    move-object v2, v1

    .line 117
    goto :goto_4

    .line 118
    :goto_5
    iput-object v4, p0, Lio/flutter/view/l;->a:Ljava/lang/reflect/Method;

    .line 119
    .line 120
    iput-object v3, p0, Lio/flutter/view/l;->b:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    iput-object v0, p0, Lio/flutter/view/l;->c:Ljava/lang/reflect/Method;

    .line 123
    .line 124
    iput-object v1, p0, Lio/flutter/view/l;->d:Ljava/lang/reflect/Method;

    .line 125
    .line 126
    iput-object v2, p0, Lio/flutter/view/l;->e:Ljava/lang/reflect/Field;

    .line 127
    .line 128
    iput-object v5, p0, Lio/flutter/view/l;->f:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    return-void
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

.method public static a(Lio/flutter/view/l;Landroid/view/accessibility/AccessibilityRecord;)Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "AccessibilityBridge"

    .line 2
    .line 3
    iget-object p0, p0, Lio/flutter/view/l;->c:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    goto :goto_2

    .line 17
    :catch_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    const-string p1, "The getRecordSourceNodeId method threw an exception when invoked."

    .line 22
    .line 23
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :goto_1
    const-string p1, "Failed to access the getRecordSourceNodeId method."

    .line 28
    .line 29
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 30
    .line 31
    .line 32
    :goto_2
    return-object v1
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

.method public static b(JI)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    shl-long/2addr v0, p2

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
