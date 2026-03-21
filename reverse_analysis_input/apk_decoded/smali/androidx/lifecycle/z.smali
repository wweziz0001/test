.class public Landroidx/lifecycle/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lo/f;

.field public volatile c:Ljava/lang/Object;

.field public volatile d:Ljava/lang/Object;

.field public e:Z

.field public f:Z

.field public final g:LA/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/z;->h:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/lifecycle/z;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lo/f;

    .line 12
    .line 13
    invoke-direct {v0}, Lo/f;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/lifecycle/z;->b:Lo/f;

    .line 17
    .line 18
    sget-object v0, Landroidx/lifecycle/z;->h:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/lifecycle/z;->d:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v1, LA/b;

    .line 23
    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-direct {v1, p0, v2}, LA/b;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Landroidx/lifecycle/z;->g:LA/b;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/lifecycle/z;->c:Ljava/lang/Object;

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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {}, Ln/a;->X()Ln/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ln/a;->a:Ln/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne v0, v1, :cond_3

    .line 23
    .line 24
    iput-object p1, p0, Landroidx/lifecycle/z;->c:Ljava/lang/Object;

    .line 25
    .line 26
    iget-boolean p1, p0, Landroidx/lifecycle/z;->e:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iput-boolean v0, p0, Landroidx/lifecycle/z;->f:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v0, p0, Landroidx/lifecycle/z;->e:Z

    .line 35
    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Landroidx/lifecycle/z;->f:Z

    .line 38
    .line 39
    iget-object v0, p0, Landroidx/lifecycle/z;->b:Lo/f;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, Lo/d;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lo/d;-><init>(Lo/f;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lo/f;->n:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lo/d;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    iget-boolean v0, p0, Landroidx/lifecycle/z;->f:Z

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    iput-boolean p1, p0, Landroidx/lifecycle/z;->e:Z

    .line 67
    .line 68
    :goto_0
    return-void

    .line 69
    :cond_2
    invoke-virtual {v1}, Lo/d;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance p1, Ljava/lang/ClassCastException;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v0, "Cannot invoke setValue on a background thread"

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1
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
