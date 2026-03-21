.class public abstract Ls2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/j;

.field public static final b:Ly2/i;

.field public static final c:Ly2/c;

.field public static final d:Ly2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

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
    const-class v2, Ls2/x;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ly2/j;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Ls2/y;->a:Ly2/j;

    .line 15
    .line 16
    new-instance v1, Ly2/i;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ly2/i;-><init>(LF2/a;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ls2/y;->b:Ly2/i;

    .line 22
    .line 23
    new-instance v1, Ly2/c;

    .line 24
    .line 25
    const-class v2, Ls2/w;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ly2/c;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Ls2/y;->c:Ly2/c;

    .line 31
    .line 32
    new-instance v1, Ls2/l;

    .line 33
    .line 34
    const/4 v2, 0x4

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
    sput-object v2, Ls2/y;->d:Ly2/a;

    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
.end method
