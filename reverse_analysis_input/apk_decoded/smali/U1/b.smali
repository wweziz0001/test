.class public final LU1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1/h;


# static fields
.field public static final q:Ljava/lang/String;


# instance fields
.field public final l:Landroid/content/Context;

.field public final m:Landroid/app/job/JobScheduler;

.field public final n:LU1/a;

.field public final o:Landroidx/work/impl/WorkDatabase;

.field public final p:LQ1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, LQ1/q;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LU1/b;->q:Ljava/lang/String;

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

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;LQ1/a;)V
    .locals 3

    .line 1
    const-string v0, "jobscheduler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 8
    .line 9
    new-instance v1, LU1/a;

    .line 10
    .line 11
    iget-object v2, p3, LQ1/a;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, LQ1/r;

    .line 14
    .line 15
    invoke-direct {v1, p1, v2}, LU1/a;-><init>(Landroid/content/Context;LQ1/r;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LU1/b;->l:Landroid/content/Context;

    .line 22
    .line 23
    iput-object v0, p0, LU1/b;->m:Landroid/app/job/JobScheduler;

    .line 24
    .line 25
    iput-object v1, p0, LU1/b;->n:LU1/a;

    .line 26
    .line 27
    iput-object p2, p0, LU1/b;->o:Landroidx/work/impl/WorkDatabase;

    .line 28
    .line 29
    iput-object p3, p0, LU1/b;->p:LQ1/a;

    .line 30
    .line 31
    return-void
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

.method public static c(Landroid/app/job/JobScheduler;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v2, "Exception while trying to cancel job (%d)"

    .line 23
    .line 24
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v1, LU1/b;->q:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1, p0}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
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

.method public static e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, LU1/b;->q:Ljava/lang/String;

    .line 13
    .line 14
    const-string v3, "getAllPendingJobs() is not reliable on this device."

    .line 15
    .line 16
    invoke-virtual {v1, v2, v3, p1}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :goto_0
    if-nez p1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/content/ComponentName;

    .line 33
    .line 34
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroid/app/job/JobInfo;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    return-object v0
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

.method public static f(Landroid/app/job/JobInfo;)LZ1/j;
    .locals 3

    .line 1
    const-string v0, "EXTRA_WORK_SPEC_ID"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, LZ1/j;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, p0, v1}, LZ1/j;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
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


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, LU1/b;->l:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LU1/b;->m:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1}, LU1/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroid/app/job/JobInfo;

    .line 34
    .line 35
    invoke-static {v3}, LU1/b;->f(Landroid/app/job/JobInfo;)LZ1/j;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object v4, v4, LZ1/j;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v0, v2

    .line 62
    :goto_1
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v1, v2}, LU1/b;->c(Landroid/app/job/JobScheduler;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    iget-object v0, p0, LU1/b;->o:Landroidx/work/impl/WorkDatabase;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()LZ1/i;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, v0, LZ1/i;->l:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()V

    .line 105
    .line 106
    .line 107
    iget-object v0, v0, LZ1/i;->o:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, LZ1/h;

    .line 110
    .line 111
    invoke-virtual {v0}, Ls1/l;->a()Ly1/h;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const/4 v3, 0x1

    .line 116
    if-nez p1, :cond_4

    .line 117
    .line 118
    invoke-interface {v2, v3}, Lx1/d;->g(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-interface {v2, p1, v3}, Lx1/d;->h(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-virtual {v2}, Ly1/h;->a()I

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ls1/l;->j(Ly1/h;)V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catchall_0
    move-exception p1

    .line 142
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ls1/l;->j(Ly1/h;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_5
    :goto_4
    return-void
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

.method public final varargs b([LZ1/p;)V
    .locals 11

    .line 1
    iget-object v0, p0, LU1/b;->p:LQ1/a;

    .line 2
    .line 3
    new-instance v1, La2/j;

    .line 4
    .line 5
    iget-object v2, p0, LU1/b;->o:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3}, La2/j;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 9
    .line 10
    .line 11
    array-length v3, p1

    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_0
    if-ge v4, v3, :cond_4

    .line 14
    .line 15
    aget-object v5, p1, v4

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget-object v7, v5, LZ1/p;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v6, v7}, LZ1/q;->m(Ljava/lang/String;)LZ1/p;

    .line 27
    .line 28
    .line 29
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    const-string v7, "Skipping scheduling "

    .line 31
    .line 32
    sget-object v8, LU1/b;->q:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v9, v5, LZ1/p;->a:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    :try_start_1
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v7, " because it\'s no longer in the DB"

    .line 54
    .line 55
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v5, v8, v6}, LQ1/q;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_4

    .line 74
    :cond_0
    :try_start_2
    iget v6, v6, LZ1/p;->b:I

    .line 75
    .line 76
    const/4 v10, 0x1

    .line 77
    if-eq v6, v10, :cond_1

    .line 78
    .line 79
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    new-instance v6, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v7, " because it is no longer enqueued"

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v8, v6}, LQ1/q;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->o()V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    invoke-static {v5}, LD1/b;->z(LZ1/p;)LZ1/j;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()LZ1/i;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7, v6}, LZ1/i;->n(LZ1/j;)LZ1/g;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-eqz v7, :cond_2

    .line 123
    .line 124
    iget v8, v7, LZ1/g;->c:I

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget v8, v0, LQ1/a;->b:I

    .line 131
    .line 132
    new-instance v9, La2/i;

    .line 133
    .line 134
    invoke-direct {v9, v1, v8}, La2/i;-><init>(La2/j;I)V

    .line 135
    .line 136
    .line 137
    iget-object v8, v1, La2/j;->a:Landroidx/work/impl/WorkDatabase;

    .line 138
    .line 139
    invoke-virtual {v8, v9}, Landroidx/work/impl/WorkDatabase;->n(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    const-string v9, "workDatabase.runInTransa\u2026            id\n        })"

    .line 144
    .line 145
    invoke-static {v8, v9}, LN3/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast v8, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    :goto_2
    if-nez v7, :cond_3

    .line 155
    .line 156
    new-instance v7, LZ1/g;

    .line 157
    .line 158
    iget-object v9, v6, LZ1/j;->a:Ljava/lang/String;

    .line 159
    .line 160
    iget v6, v6, LZ1/j;->b:I

    .line 161
    .line 162
    invoke-direct {v7, v6, v9, v8}, LZ1/g;-><init>(ILjava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()LZ1/i;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v6, v7}, LZ1/i;->q(LZ1/g;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    invoke-virtual {p0, v5, v8}, LU1/b;->g(LZ1/p;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :goto_4
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_4
    return-void
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

.method public final d()Z
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

.method public final g(LZ1/p;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    iget-object v3, v1, LU1/b;->m:Landroid/app/job/JobScheduler;

    .line 8
    .line 9
    iget-object v4, v1, LU1/b;->n:LU1/a;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v5, v2, LZ1/p;->j:LQ1/d;

    .line 15
    .line 16
    new-instance v6, Landroid/os/PersistableBundle;

    .line 17
    .line 18
    invoke-direct {v6}, Landroid/os/PersistableBundle;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v7, "EXTRA_WORK_SPEC_ID"

    .line 22
    .line 23
    iget-object v8, v2, LZ1/p;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v7, "EXTRA_WORK_SPEC_GENERATION"

    .line 29
    .line 30
    iget v9, v2, LZ1/p;->t:I

    .line 31
    .line 32
    invoke-virtual {v6, v7, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const-string v7, "EXTRA_IS_PERIODIC"

    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, LZ1/p;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-virtual {v6, v7, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Landroid/app/job/JobInfo$Builder;

    .line 45
    .line 46
    iget-object v9, v4, LU1/a;->a:Landroid/content/ComponentName;

    .line 47
    .line 48
    invoke-direct {v7, v0, v9}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 49
    .line 50
    .line 51
    iget-boolean v9, v5, LQ1/d;->b:Z

    .line 52
    .line 53
    invoke-virtual {v7, v9}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iget-boolean v9, v5, LQ1/d;->c:Z

    .line 58
    .line 59
    invoke-virtual {v7, v9}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v7, v6}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/4 v10, 0x2

    .line 70
    const/4 v11, 0x1

    .line 71
    const/4 v12, 0x0

    .line 72
    const/16 v13, 0x1e

    .line 73
    .line 74
    const/16 v14, 0x1a

    .line 75
    .line 76
    iget v15, v5, LQ1/d;->a:I

    .line 77
    .line 78
    if-lt v7, v13, :cond_0

    .line 79
    .line 80
    const/4 v13, 0x6

    .line 81
    if-ne v15, v13, :cond_0

    .line 82
    .line 83
    new-instance v13, Landroid/net/NetworkRequest$Builder;

    .line 84
    .line 85
    invoke-direct {v13}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 86
    .line 87
    .line 88
    const/16 v15, 0x19

    .line 89
    .line 90
    invoke-virtual {v13, v15}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    invoke-virtual {v13}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    invoke-static {v6, v13}, LS2/b;->q(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_0
    invoke-static {v15}, LO/i;->b(I)I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_5

    .line 107
    .line 108
    if-eq v13, v11, :cond_3

    .line 109
    .line 110
    if-eq v13, v10, :cond_4

    .line 111
    .line 112
    const/4 v11, 0x3

    .line 113
    if-eq v13, v11, :cond_6

    .line 114
    .line 115
    const/4 v11, 0x4

    .line 116
    if-eq v13, v11, :cond_1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    if-lt v7, v14, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    :goto_0
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-static {v15}, Lb3/a;->v(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    const-string v15, "API version too low. Cannot convert network type value "

    .line 131
    .line 132
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    sget-object v15, LU1/a;->c:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v11, v15, v13}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    const/4 v11, 0x1

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    move v11, v10

    .line 144
    goto :goto_1

    .line 145
    :cond_5
    move v11, v12

    .line 146
    :cond_6
    :goto_1
    invoke-virtual {v6, v11}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 147
    .line 148
    .line 149
    :goto_2
    if-nez v9, :cond_8

    .line 150
    .line 151
    iget v9, v2, LZ1/p;->l:I

    .line 152
    .line 153
    if-ne v9, v10, :cond_7

    .line 154
    .line 155
    move v9, v12

    .line 156
    goto :goto_3

    .line 157
    :cond_7
    const/4 v9, 0x1

    .line 158
    :goto_3
    iget-wide v10, v2, LZ1/p;->m:J

    .line 159
    .line 160
    invoke-virtual {v6, v10, v11, v9}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 161
    .line 162
    .line 163
    :cond_8
    invoke-virtual/range {p1 .. p1}, LZ1/p;->a()J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    iget-object v4, v4, LU1/a;->b:LQ1/r;

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 173
    .line 174
    .line 175
    move-result-wide v16

    .line 176
    sub-long v9, v9, v16

    .line 177
    .line 178
    const-wide/16 v14, 0x0

    .line 179
    .line 180
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 181
    .line 182
    .line 183
    move-result-wide v9

    .line 184
    const/16 v11, 0x1c

    .line 185
    .line 186
    if-gt v7, v11, :cond_9

    .line 187
    .line 188
    invoke-virtual {v6, v9, v10}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    cmp-long v7, v9, v14

    .line 193
    .line 194
    if-lez v7, :cond_a

    .line 195
    .line 196
    invoke-virtual {v6, v9, v10}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_a
    iget-boolean v7, v2, LZ1/p;->q:Z

    .line 201
    .line 202
    if-nez v7, :cond_b

    .line 203
    .line 204
    invoke-static {v6}, LS2/b;->p(Landroid/app/job/JobInfo$Builder;)V

    .line 205
    .line 206
    .line 207
    :cond_b
    :goto_4
    iget-object v7, v5, LQ1/d;->h:Ljava/util/Set;

    .line 208
    .line 209
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    if-nez v11, :cond_d

    .line 214
    .line 215
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    if-eqz v11, :cond_c

    .line 224
    .line 225
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    check-cast v11, LQ1/c;

    .line 230
    .line 231
    iget-boolean v13, v11, LQ1/c;->b:Z

    .line 232
    .line 233
    new-instance v4, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 234
    .line 235
    iget-object v11, v11, LQ1/c;->a:Landroid/net/Uri;

    .line 236
    .line 237
    invoke-direct {v4, v11, v13}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6, v4}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_c
    iget-wide v14, v5, LQ1/d;->f:J

    .line 245
    .line 246
    invoke-virtual {v6, v14, v15}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 247
    .line 248
    .line 249
    iget-wide v13, v5, LQ1/d;->g:J

    .line 250
    .line 251
    invoke-virtual {v6, v13, v14}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 252
    .line 253
    .line 254
    :cond_d
    invoke-virtual {v6, v12}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 255
    .line 256
    .line 257
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 258
    .line 259
    const/16 v7, 0x1a

    .line 260
    .line 261
    if-lt v4, v7, :cond_e

    .line 262
    .line 263
    iget-boolean v7, v5, LQ1/d;->d:Z

    .line 264
    .line 265
    invoke-static {v6, v7}, LB/a;->r(Landroid/app/job/JobInfo$Builder;Z)V

    .line 266
    .line 267
    .line 268
    iget-boolean v5, v5, LQ1/d;->e:Z

    .line 269
    .line 270
    invoke-static {v6, v5}, LB/a;->z(Landroid/app/job/JobInfo$Builder;Z)V

    .line 271
    .line 272
    .line 273
    :cond_e
    iget v5, v2, LZ1/p;->k:I

    .line 274
    .line 275
    if-lez v5, :cond_f

    .line 276
    .line 277
    const/4 v5, 0x1

    .line 278
    :goto_6
    const-wide/16 v13, 0x0

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_f
    move v5, v12

    .line 282
    goto :goto_6

    .line 283
    :goto_7
    cmp-long v7, v9, v13

    .line 284
    .line 285
    if-lez v7, :cond_10

    .line 286
    .line 287
    const/4 v7, 0x1

    .line 288
    goto :goto_8

    .line 289
    :cond_10
    move v7, v12

    .line 290
    :goto_8
    const/16 v9, 0x1f

    .line 291
    .line 292
    if-lt v4, v9, :cond_11

    .line 293
    .line 294
    iget-boolean v4, v2, LZ1/p;->q:Z

    .line 295
    .line 296
    if-eqz v4, :cond_11

    .line 297
    .line 298
    if-nez v5, :cond_11

    .line 299
    .line 300
    if-nez v7, :cond_11

    .line 301
    .line 302
    invoke-static {v6}, LS2/c;->k(Landroid/app/job/JobInfo$Builder;)V

    .line 303
    .line 304
    .line 305
    :cond_11
    invoke-virtual {v6}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    new-instance v6, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v7, "Scheduling work ID "

    .line 316
    .line 317
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v7, "Job ID "

    .line 324
    .line 325
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    sget-object v7, LU1/b;->q:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v5, v7, v6}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :try_start_0
    invoke-virtual {v3, v4}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-nez v4, :cond_12

    .line 345
    .line 346
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    new-instance v5, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const-string v6, "Unable to schedule work ID "

    .line 356
    .line 357
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v4, v7, v5}, LQ1/q;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-boolean v4, v2, LZ1/p;->q:Z

    .line 371
    .line 372
    if-eqz v4, :cond_12

    .line 373
    .line 374
    iget v4, v2, LZ1/p;->r:I

    .line 375
    .line 376
    const/4 v5, 0x1

    .line 377
    if-ne v4, v5, :cond_12

    .line 378
    .line 379
    iput-boolean v12, v2, LZ1/p;->q:Z

    .line 380
    .line 381
    new-instance v4, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    const-string v5, "Scheduling a non-expedited job (work ID "

    .line 387
    .line 388
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v5, ")"

    .line 395
    .line 396
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v5, v7, v4}, LQ1/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {p0 .. p2}, LU1/b;->g(LZ1/p;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :catchall_0
    move-exception v0

    .line 415
    goto :goto_9

    .line 416
    :catch_0
    move-exception v0

    .line 417
    goto :goto_b

    .line 418
    :goto_9
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    new-instance v4, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    const-string v5, "Unable to schedule "

    .line 425
    .line 426
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-virtual {v3, v7, v2, v0}, LQ1/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 437
    .line 438
    .line 439
    :cond_12
    :goto_a
    return-void

    .line 440
    :goto_b
    iget-object v2, v1, LU1/b;->l:Landroid/content/Context;

    .line 441
    .line 442
    invoke-static {v2, v3}, LU1/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    if-eqz v2, :cond_13

    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 449
    .line 450
    .line 451
    move-result v12

    .line 452
    :cond_13
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    iget-object v4, v1, LU1/b;->o:Landroidx/work/impl/WorkDatabase;

    .line 461
    .line 462
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->t()LZ1/q;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-virtual {v4}, LZ1/q;->i()Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    iget-object v5, v1, LU1/b;->p:LQ1/a;

    .line 479
    .line 480
    iget v5, v5, LQ1/a;->d:I

    .line 481
    .line 482
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    const-string v4, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    .line 491
    .line 492
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-static {}, LQ1/q;->d()LQ1/q;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-virtual {v3, v7, v2}, LQ1/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 504
    .line 505
    invoke-direct {v3, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 506
    .line 507
    .line 508
    throw v3
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
