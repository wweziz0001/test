.class public final Lt0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final r:Ljava/nio/charset/Charset;


# instance fields
.field public final l:LZ1/l;

.field public final m:LB0/r;

.field public final n:Ljava/util/Map;

.field public o:Lt0/w;

.field public p:Ljava/net/Socket;

.field public volatile q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    sput-object v0, Lt0/x;->r:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    return-void
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

.method public constructor <init>(LZ1/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/x;->l:LZ1/l;

    .line 5
    .line 6
    new-instance p1, LB0/r;

    .line 7
    .line 8
    const-string v0, "ExoPlayer:RtspMessageChannel:ReceiverLoader"

    .line 9
    .line 10
    invoke-direct {p1, v0}, LB0/r;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lt0/x;->m:LB0/r;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lt0/x;->n:Ljava/util/Map;

    .line 25
    .line 26
    return-void
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


# virtual methods
.method public final a(Ljava/net/Socket;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lt0/x;->p:Ljava/net/Socket;

    .line 2
    .line 3
    new-instance v0, Lt0/w;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Lt0/w;-><init>(Lt0/x;Ljava/io/OutputStream;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lt0/x;->o:Lt0/w;

    .line 13
    .line 14
    new-instance v0, Lt0/v;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p0, p1}, Lt0/v;-><init>(Lt0/x;Ljava/io/InputStream;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lm3/i;

    .line 24
    .line 25
    const/16 v1, 0x18

    .line 26
    .line 27
    invoke-direct {p1, p0, v1}, Lm3/i;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iget-object v2, p0, Lt0/x;->m:LB0/r;

    .line 32
    .line 33
    invoke-virtual {v2, v0, p1, v1}, LB0/r;->f(LB0/o;LB0/m;I)J

    .line 34
    .line 35
    .line 36
    return-void
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

.method public final b(Lm2/b0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lt0/x;->o:Lt0/w;

    .line 2
    .line 3
    invoke-static {v0}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/x;->o:Lt0/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, LF0/p;

    .line 12
    .line 13
    sget-object v2, Lt0/y;->h:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-direct {v1, v2, v3}, LF0/p;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, LF0/p;->d(Ljava/util/List;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lt0/x;->r:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, v0, Lt0/w;->n:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v3, LD0/y;

    .line 32
    .line 33
    const/16 v4, 0x16

    .line 34
    .line 35
    invoke-direct {v3, v0, v1, p1, v4}, LD0/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void
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

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lt0/x;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    :try_start_0
    iget-object v1, p0, Lt0/x;->o:Lt0/w;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Lt0/w;->close()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    iget-object v1, p0, Lt0/x;->m:LB0/r;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, LB0/r;->e(LB0/p;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lt0/x;->p:Ljava/net/Socket;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_2
    iput-boolean v0, p0, Lt0/x;->q:Z

    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    iput-boolean v0, p0, Lt0/x;->q:Z

    .line 34
    .line 35
    throw v1
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
