.class public final LQ1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object v0, p0, LQ1/a;->i:Ljava/lang/Object;

    .line 18
    sget v1, Ld0/w;->a:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    new-instance v1, LZ1/c;

    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object v0, v1, LZ1/c;->l:Ljava/lang/Object;

    .line 21
    new-instance v0, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object v0, v1, LZ1/c;->m:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    iput-object v1, p0, LQ1/a;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LQ1/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, LQ1/C;->c(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, LQ1/a;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 3
    invoke-static {p1}, LQ1/C;->c(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, LQ1/a;->f:Ljava/lang/Object;

    .line 4
    new-instance p1, LQ1/r;

    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LQ1/a;->g:Ljava/lang/Object;

    .line 7
    new-instance p1, LQ1/F;

    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LQ1/a;->h:Ljava/lang/Object;

    .line 10
    sget-object p1, LQ1/r;->a:LQ1/r;

    iput-object p1, p0, LQ1/a;->i:Ljava/lang/Object;

    .line 11
    new-instance p1, LB0/d;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, LB0/d;-><init>(I)V

    iput-object p1, p0, LQ1/a;->j:Ljava/lang/Object;

    const/4 p1, 0x4

    .line 12
    iput p1, p0, LQ1/a;->a:I

    const p1, 0x7fffffff

    .line 13
    iput p1, p0, LQ1/a;->b:I

    const/16 p1, 0x14

    .line 14
    iput p1, p0, LQ1/a;->d:I

    const/16 p1, 0x8

    .line 15
    iput p1, p0, LQ1/a;->c:I

    return-void
.end method
