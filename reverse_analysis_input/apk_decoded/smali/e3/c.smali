.class public final Le3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/b;


# static fields
.field public static x:J = 0x1L

.field public static final y:Ljava/util/HashMap;


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Lio/flutter/embedding/engine/renderer/l;

.field public final c:Lf3/b;

.field public final d:LD0/k;

.field public final e:Lo3/a;

.field public final f:LZ1/m;

.field public final g:Lm3/c;

.field public final h:Landroidx/lifecycle/E;

.field public final i:Lm3/a;

.field public final j:Lm3/a;

.field public final k:Lm3/j;

.field public final l:LZ1/l;

.field public final m:Lm3/i;

.field public final n:Lm3/i;

.field public final o:Lm3/l;

.field public final p:Lm3/i;

.field public final q:Lm3/b;

.field public final r:LZ1/e;

.field public final s:Lio/flutter/plugin/platform/p;

.field public final t:Lio/flutter/plugin/platform/o;

.field public final u:Ljava/util/HashSet;

.field public final v:J

.field public final w:Le3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le3/c;->y:Ljava/util/HashMap;

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v3, Lio/flutter/plugin/platform/p;

    invoke-direct {v3}, Lio/flutter/plugin/platform/p;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Le3/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/p;ZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/p;ZZ)V
    .locals 9

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le3/c;->u:Ljava/util/HashSet;

    .line 5
    new-instance v0, Le3/a;

    invoke-direct {v0, p0}, Le3/a;-><init>(Le3/c;)V

    iput-object v0, p0, Le3/c;->w:Le3/a;

    .line 6
    sget-wide v0, Le3/c;->x:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    sput-wide v2, Le3/c;->x:J

    iput-wide v0, p0, Le3/c;->v:J

    .line 7
    sget-object v2, Le3/c;->y:Ljava/util/HashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 9
    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 10
    :goto_0
    invoke-static {}, LZ1/m;->z()LZ1/m;

    move-result-object v1

    if-nez p2, :cond_0

    .line 11
    iget-object p2, v1, LZ1/m;->n:Ljava/lang/Object;

    check-cast p2, La0/z;

    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    new-instance p2, Lio/flutter/embedding/engine/FlutterJNI;

    invoke-direct {p2}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 14
    :cond_0
    iput-object p2, p0, Le3/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 15
    new-instance v2, Lf3/b;

    iget-wide v3, p0, Le3/c;->v:J

    invoke-direct {v2, p2, v0, v3, v4}, Lf3/b;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;J)V

    iput-object v2, p0, Le3/c;->c:Lf3/b;

    .line 16
    iget-object v0, v2, Lf3/b;->o:Lf3/j;

    invoke-virtual {p2, v0}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lf3/k;)V

    .line 17
    invoke-static {}, LZ1/m;->z()LZ1/m;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    new-instance v0, LZ1/m;

    invoke-direct {v0, v2, p2}, LZ1/m;-><init>(Lf3/b;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v0, p0, Le3/c;->f:LZ1/m;

    .line 19
    new-instance v0, La0/z;

    invoke-direct {v0, v2}, La0/z;-><init>(Lf3/b;)V

    .line 20
    new-instance v0, Lm3/c;

    invoke-direct {v0, v2}, Lm3/c;-><init>(Lf3/b;)V

    iput-object v0, p0, Le3/c;->g:Lm3/c;

    .line 21
    new-instance v0, LZ1/e;

    const/16 v3, 0xf

    invoke-direct {v0, v2, v3}, LZ1/e;-><init>(Lf3/b;I)V

    .line 22
    new-instance v3, Landroidx/lifecycle/E;

    invoke-direct {v3, v2}, Landroidx/lifecycle/E;-><init>(Lf3/b;)V

    iput-object v3, p0, Le3/c;->h:Landroidx/lifecycle/E;

    .line 23
    new-instance v3, Lm3/a;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lm3/a;-><init>(Lf3/b;I)V

    iput-object v3, p0, Le3/c;->i:Lm3/a;

    .line 24
    new-instance v3, Lm3/a;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lm3/a;-><init>(Lf3/b;I)V

    iput-object v3, p0, Le3/c;->j:Lm3/a;

    .line 25
    new-instance v3, LZ1/l;

    .line 26
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v4, Landroidx/lifecycle/E;

    const/16 v5, 0x1b

    invoke-direct {v4, v3, v5}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;I)V

    .line 28
    new-instance v5, Ln3/q;

    sget-object v6, Ln3/l;->a:Ln3/l;

    const/4 v7, 0x0

    .line 29
    const-string v8, "flutter/platform"

    invoke-direct {v5, v2, v8, v6, v7}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V

    .line 30
    iput-object v5, v3, LZ1/l;->l:Ljava/lang/Object;

    .line 31
    invoke-virtual {v5, v4}, Ln3/q;->b(Ln3/o;)V

    .line 32
    iput-object v3, p0, Le3/c;->l:LZ1/l;

    .line 33
    new-instance v3, LZ1/l;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 34
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v5, Lm3/i;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6}, Lm3/i;-><init>(Ljava/lang/Object;I)V

    .line 36
    iput-object v4, v3, LZ1/l;->l:Ljava/lang/Object;

    .line 37
    new-instance v4, Ln3/q;

    sget-object v6, Ln3/x;->a:Ln3/x;

    const/4 v7, 0x0

    .line 38
    const-string v8, "flutter/processtext"

    invoke-direct {v4, v2, v8, v6, v7}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;Ln3/r;La0/z;)V

    .line 39
    invoke-virtual {v4, v5}, Ln3/q;->b(Ln3/o;)V

    .line 40
    new-instance v4, Lm3/j;

    invoke-direct {v4, v2, p5}, Lm3/j;-><init>(Lf3/b;Z)V

    iput-object v4, p0, Le3/c;->k:Lm3/j;

    .line 41
    new-instance p5, Lm3/i;

    const/4 v4, 0x3

    invoke-direct {p5, v2, v4}, Lm3/i;-><init>(Lf3/b;I)V

    iput-object p5, p0, Le3/c;->m:Lm3/i;

    .line 42
    new-instance p5, Lm3/i;

    const/4 v4, 0x5

    invoke-direct {p5, v2, v4}, Lm3/i;-><init>(Lf3/b;I)V

    iput-object p5, p0, Le3/c;->n:Lm3/i;

    .line 43
    new-instance p5, Lm3/l;

    invoke-direct {p5, v2}, Lm3/l;-><init>(Lf3/b;)V

    iput-object p5, p0, Le3/c;->o:Lm3/l;

    .line 44
    new-instance p5, Lm3/i;

    const/4 v4, 0x7

    invoke-direct {p5, v2, v4}, Lm3/i;-><init>(Lf3/b;I)V

    iput-object p5, p0, Le3/c;->p:Lm3/i;

    .line 45
    new-instance p5, Lm3/b;

    invoke-direct {p5, v2}, Lm3/b;-><init>(Lf3/b;)V

    iput-object p5, p0, Le3/c;->q:Lm3/b;

    .line 46
    new-instance p5, LZ1/e;

    const/16 v4, 0x11

    invoke-direct {p5, v2, v4}, LZ1/e;-><init>(Lf3/b;I)V

    iput-object p5, p0, Le3/c;->r:LZ1/e;

    .line 47
    new-instance p5, Lo3/a;

    invoke-direct {p5, p1, v0}, Lo3/a;-><init>(Landroid/content/Context;LZ1/e;)V

    iput-object p5, p0, Le3/c;->e:Lo3/a;

    .line 48
    iget-object v0, v1, LZ1/m;->m:Ljava/lang/Object;

    check-cast v0, Lh3/f;

    .line 49
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_1

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lh3/f;->c(Landroid/content/Context;)V

    .line 51
    invoke-virtual {v0, p1, v4}, Lh3/f;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 52
    :cond_1
    new-instance v2, Lio/flutter/plugin/platform/o;

    invoke-direct {v2}, Lio/flutter/plugin/platform/o;-><init>()V

    .line 53
    iget-object v5, p3, Lio/flutter/plugin/platform/p;->a:Lio/flutter/plugin/platform/m;

    iput-object v5, v2, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/m;

    .line 54
    iput-object p2, v2, Lio/flutter/plugin/platform/o;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 55
    iput-object p2, p3, Lio/flutter/plugin/platform/p;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 56
    iget-object v5, p0, Le3/c;->w:Le3/a;

    invoke-virtual {p2, v5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Le3/b;)V

    .line 57
    invoke-virtual {p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/p;)V

    .line 58
    invoke-virtual {p2, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController2(Lio/flutter/plugin/platform/o;)V

    .line 59
    invoke-virtual {p2, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Lo3/a;)V

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v4}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lg3/a;)V

    .line 61
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v1

    if-nez v1, :cond_3

    .line 62
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    .line 63
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 64
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_3
    :goto_1
    new-instance v1, Lio/flutter/embedding/engine/renderer/l;

    invoke-direct {v1, p2}, Lio/flutter/embedding/engine/renderer/l;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v1, p0, Le3/c;->b:Lio/flutter/embedding/engine/renderer/l;

    .line 66
    iput-object p3, p0, Le3/c;->s:Lio/flutter/plugin/platform/p;

    .line 67
    iput-object v2, p0, Le3/c;->t:Lio/flutter/plugin/platform/o;

    .line 68
    new-instance p2, LD0/k;

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, v0}, LD0/k;-><init>(Landroid/content/Context;Le3/c;Lh3/f;)V

    iput-object p2, p0, Le3/c;->d:LD0/k;

    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-virtual {p5, p3}, Lo3/a;->b(Landroid/content/res/Configuration;)V

    if-eqz p4, :cond_4

    .line 71
    iget-object p3, v0, Lh3/f;->d:Lh3/b;

    .line 72
    iget-boolean p3, p3, Lh3/b;->e:Z

    if-eqz p3, :cond_4

    .line 73
    invoke-static {p0}, LZ1/f;->H(Le3/c;)V

    .line 74
    :cond_4
    invoke-static {p1, p0}, Li4/a;->e(Landroid/content/Context;Lz3/b;)V

    .line 75
    new-instance p1, Lq3/a;

    invoke-direct {p1, v3}, Lq3/a;-><init>(LZ1/l;)V

    .line 76
    invoke-virtual {p2, p1}, LD0/k;->a(Lj3/b;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Le3/c;->u:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Le3/b;

    .line 18
    .line 19
    invoke-interface {v1}, Le3/b;->onEngineWillDestroy()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Le3/c;->d:LD0/k;

    .line 24
    .line 25
    invoke-virtual {v0}, LD0/k;->e()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/HashSet;

    .line 29
    .line 30
    iget-object v2, v0, LD0/k;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Lj3/b;

    .line 62
    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "FlutterEngineConnectionRegistry#remove "

    .line 71
    .line 72
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5}, Lz3/a;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    instance-of v5, v4, Lk3/a;

    .line 80
    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    invoke-virtual {v0}, LD0/k;->f()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    move-object v5, v4

    .line 90
    check-cast v5, Lk3/a;

    .line 91
    .line 92
    invoke-interface {v5}, Lk3/a;->onDetachedFromActivity()V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    :goto_2
    iget-object v5, v0, LD0/k;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    iget-object v5, v0, LD0/k;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lj3/a;

    .line 108
    .line 109
    invoke-interface {v4, v5}, Lj3/b;->onDetachedFromEngine(Lj3/a;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :goto_3
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :catchall_1
    move-exception v1

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    throw v0

    .line 128
    :cond_4
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 129
    .line 130
    .line 131
    :goto_5
    iget-object v0, p0, Le3/c;->s:Lio/flutter/plugin/platform/p;

    .line 132
    .line 133
    iget-object v1, v0, Lio/flutter/plugin/platform/p;->l:Landroid/util/SparseArray;

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    const/4 v3, 0x0

    .line 140
    if-lez v2, :cond_5

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->w:Lio/flutter/plugin/platform/m;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/m;->e(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_5
    :goto_6
    iget-object v0, p0, Le3/c;->t:Lio/flutter/plugin/platform/o;

    .line 153
    .line 154
    iget-object v1, v0, Lio/flutter/plugin/platform/o;->i:Landroid/util/SparseArray;

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-lez v2, :cond_6

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->p:Lio/flutter/plugin/platform/m;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/m;->e(I)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_6
    iget-object v0, p0, Le3/c;->c:Lf3/b;

    .line 173
    .line 174
    iget-object v0, v0, Lf3/b;->l:Lio/flutter/embedding/engine/FlutterJNI;

    .line 175
    .line 176
    const/4 v1, 0x0

    .line 177
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lf3/k;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Le3/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 181
    .line 182
    iget-object v2, p0, Le3/c;->w:Le3/a;

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Le3/b;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lg3/a;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    .line 191
    .line 192
    .line 193
    invoke-static {}, LZ1/m;->z()LZ1/m;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v0, Le3/c;->y:Ljava/util/HashMap;

    .line 201
    .line 202
    iget-wide v1, p0, Le3/c;->v:J

    .line 203
    .line 204
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    return-void
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
