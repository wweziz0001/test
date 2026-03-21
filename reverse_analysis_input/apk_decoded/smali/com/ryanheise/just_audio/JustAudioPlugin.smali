.class public Lcom/ryanheise/just_audio/JustAudioPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;


# instance fields
.field private channel:Ln3/q;

.field private methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static bridge synthetic a(Lcom/ryanheise/just_audio/JustAudioPlugin;)Lcom/ryanheise/just_audio/MainMethodCallHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;

    return-object p0
.end method


# virtual methods
.method public onAttachedToEngine(Lj3/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lj3/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Lcom/ryanheise/just_audio/MainMethodCallHandler;

    .line 4
    .line 5
    iget-object v2, p1, Lj3/a;->c:Ln3/f;

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Lcom/ryanheise/just_audio/MainMethodCallHandler;-><init>(Landroid/content/Context;Ln3/f;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;

    .line 11
    .line 12
    new-instance v0, Ln3/q;

    .line 13
    .line 14
    const-string v1, "com.ryanheise.just_audio.methods"

    .line 15
    .line 16
    invoke-direct {v0, v2, v1}, Ln3/q;-><init>(Ln3/f;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->channel:Ln3/q;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ln3/q;->b(Ln3/o;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/ryanheise/just_audio/JustAudioPlugin$1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lcom/ryanheise/just_audio/JustAudioPlugin$1;-><init>(Lcom/ryanheise/just_audio/JustAudioPlugin;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lj3/a;->b:Le3/c;

    .line 32
    .line 33
    iget-object p1, p1, Le3/c;->u:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
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

.method public onDetachedFromEngine(Lj3/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/ryanheise/just_audio/MainMethodCallHandler;->dispose()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->methodCallHandler:Lcom/ryanheise/just_audio/MainMethodCallHandler;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ryanheise/just_audio/JustAudioPlugin;->channel:Ln3/q;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ln3/q;->b(Ln3/o;)V

    .line 12
    .line 13
    .line 14
    return-void
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
