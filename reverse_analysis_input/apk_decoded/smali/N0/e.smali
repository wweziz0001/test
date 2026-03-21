.class public abstract LN0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "Camera:MicroVideo"

    .line 2
    .line 3
    const-string v1, "GCamera:MicroVideo"

    .line 4
    .line 5
    const-string v2, "Camera:MotionPhoto"

    .line 6
    .line 7
    const-string v3, "GCamera:MotionPhoto"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LN0/e;->a:[Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "Camera:MicroVideoPresentationTimestampUs"

    .line 16
    .line 17
    const-string v1, "GCamera:MicroVideoPresentationTimestampUs"

    .line 18
    .line 19
    const-string v2, "Camera:MotionPhotoPresentationTimestampUs"

    .line 20
    .line 21
    const-string v3, "GCamera:MotionPhotoPresentationTimestampUs"

    .line 22
    .line 23
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LN0/e;->b:[Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "Camera:MicroVideoOffset"

    .line 30
    .line 31
    const-string v1, "GCamera:MicroVideoOffset"

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, LN0/e;->c:[Ljava/lang/String;

    .line 38
    .line 39
    return-void
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

.method public static a(Ljava/lang/String;)LN0/c;
    .locals 21

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/io/StringReader;

    .line 12
    .line 13
    move-object/from16 v4, p0

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 22
    .line 23
    .line 24
    const-string v3, "x:xmpmeta"

    .line 25
    .line 26
    invoke-static {v2, v3}, Ld0/m;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v4, :cond_c

    .line 32
    .line 33
    sget-object v4, Lm2/I;->m:Lm2/G;

    .line 34
    .line 35
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 36
    .line 37
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    move-wide v8, v6

    .line 43
    :cond_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 44
    .line 45
    .line 46
    const-string v10, "rdf:Description"

    .line 47
    .line 48
    invoke-static {v2, v10}, Ld0/m;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_8

    .line 53
    .line 54
    sget-object v4, LN0/e;->a:[Ljava/lang/String;

    .line 55
    .line 56
    move v8, v0

    .line 57
    :goto_0
    const/4 v9, 0x4

    .line 58
    if-ge v8, v9, :cond_7

    .line 59
    .line 60
    aget-object v10, v4, v8

    .line 61
    .line 62
    invoke-static {v2, v10}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    if-eqz v10, :cond_6

    .line 67
    .line 68
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-ne v4, v1, :cond_7

    .line 73
    .line 74
    sget-object v4, LN0/e;->b:[Ljava/lang/String;

    .line 75
    .line 76
    move v8, v0

    .line 77
    :goto_1
    if-ge v8, v9, :cond_2

    .line 78
    .line 79
    aget-object v10, v4, v8

    .line 80
    .line 81
    invoke-static {v2, v10}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    if-eqz v10, :cond_1

    .line 86
    .line 87
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    const-wide/16 v10, -0x1

    .line 92
    .line 93
    cmp-long v4, v8, v10

    .line 94
    .line 95
    if-nez v4, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    add-int/2addr v8, v1

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    :goto_2
    move-wide v8, v6

    .line 101
    :cond_3
    sget-object v4, LN0/e;->c:[Ljava/lang/String;

    .line 102
    .line 103
    move v10, v0

    .line 104
    :goto_3
    const/4 v11, 0x2

    .line 105
    if-ge v10, v11, :cond_5

    .line 106
    .line 107
    aget-object v11, v4, v10

    .line 108
    .line 109
    invoke-static {v2, v11}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    if-eqz v11, :cond_4

    .line 114
    .line 115
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v13

    .line 119
    new-instance v4, LN0/b;

    .line 120
    .line 121
    const-wide/16 v16, 0x0

    .line 122
    .line 123
    const-wide/16 v18, 0x0

    .line 124
    .line 125
    const-string v20, "image/jpeg"

    .line 126
    .line 127
    move-object v15, v4

    .line 128
    invoke-direct/range {v15 .. v20}, LN0/b;-><init>(JJLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v10, LN0/b;

    .line 132
    .line 133
    const-wide/16 v15, 0x0

    .line 134
    .line 135
    const-string v17, "video/mp4"

    .line 136
    .line 137
    move-object v12, v10

    .line 138
    invoke-direct/range {v12 .. v17}, LN0/b;-><init>(JJLjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v10}, Lm2/I;->v(Ljava/lang/Object;Ljava/lang/Object;)Lm2/b0;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    goto :goto_4

    .line 146
    :cond_4
    add-int/2addr v10, v1

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    sget-object v4, Lm2/I;->m:Lm2/G;

    .line 149
    .line 150
    sget-object v4, Lm2/b0;->p:Lm2/b0;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    add-int/2addr v8, v1

    .line 154
    goto :goto_0

    .line 155
    :cond_7
    return-object v5

    .line 156
    :cond_8
    const-string v10, "Container:Directory"

    .line 157
    .line 158
    invoke-static {v2, v10}, Ld0/m;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-eqz v10, :cond_9

    .line 163
    .line 164
    const-string v4, "Container"

    .line 165
    .line 166
    const-string v10, "Item"

    .line 167
    .line 168
    invoke-static {v2, v4, v10}, LN0/e;->b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lm2/b0;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    goto :goto_4

    .line 173
    :cond_9
    const-string v10, "GContainer:Directory"

    .line 174
    .line 175
    invoke-static {v2, v10}, Ld0/m;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-eqz v10, :cond_a

    .line 180
    .line 181
    const-string v4, "GContainer"

    .line 182
    .line 183
    const-string v10, "GContainerItem"

    .line 184
    .line 185
    invoke-static {v2, v4, v10}, LN0/e;->b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lm2/b0;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    :cond_a
    :goto_4
    invoke-static {v2, v3}, Ld0/m;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_0

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    return-object v5

    .line 202
    :cond_b
    new-instance v1, LN0/c;

    .line 203
    .line 204
    invoke-direct {v1, v8, v9, v4, v0}, LN0/c;-><init>(JLjava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_c
    const-string v0, "Couldn\'t find xmp metadata"

    .line 209
    .line 210
    invoke-static {v5, v0}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    throw v0
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

.method public static b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lm2/b0;
    .locals 12

    .line 1
    invoke-static {}, Lm2/I;->n()Lm2/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ":Item"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ":Directory"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Ld0/m;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    const-string v2, ":Mime"

    .line 27
    .line 28
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, ":Semantic"

    .line 33
    .line 34
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, ":Length"

    .line 39
    .line 40
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, ":Padding"

    .line 45
    .line 46
    invoke-virtual {p2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p0, v2}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-static {p0, v3}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {p0, v4}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {p0, v5}, Ld0/m;->n(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v11, :cond_4

    .line 67
    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    new-instance v2, LN0/b;

    .line 72
    .line 73
    const-wide/16 v5, 0x0

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-wide v7, v5

    .line 83
    :goto_0
    if-eqz v4, :cond_3

    .line 84
    .line 85
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    move-wide v9, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move-wide v9, v5

    .line 92
    :goto_1
    move-object v6, v2

    .line 93
    invoke-direct/range {v6 .. v11}, LN0/b;-><init>(JJLjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    :goto_2
    sget-object p0, Lm2/b0;->p:Lm2/b0;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_5
    :goto_3
    invoke-static {p0, p1}, Ld0/m;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_0

    .line 108
    .line 109
    invoke-virtual {v0}, Lm2/F;->g()Lm2/b0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
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
