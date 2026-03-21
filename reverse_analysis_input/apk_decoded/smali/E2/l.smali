.class public final LE2/l;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ld0/o;


# direct methods
.method public constructor <init>(Ld0/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE2/l;->a:Ld0/o;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LE2/l;->a:Ld0/o;

    .line 2
    .line 3
    :try_start_0
    sget-object v1, LE2/j;->c:LE2/j;

    .line 4
    .line 5
    iget-object v2, v0, Ld0/o;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, v1, LE2/j;->a:LE2/i;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, LE2/i;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljavax/crypto/Mac;

    .line 16
    .line 17
    iget-object v0, v0, Ld0/o;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :catch_0
    move-exception v0

    .line 26
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v1
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
