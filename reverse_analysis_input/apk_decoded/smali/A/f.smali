.class public final LA/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:LA/e;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;LA/e;II)V
    .locals 0

    .line 1
    iput p5, p0, LA/f;->a:I

    iput-object p1, p0, LA/f;->b:Ljava/lang/String;

    iput-object p2, p0, LA/f;->c:Landroid/content/Context;

    iput-object p3, p0, LA/f;->d:LA/e;

    iput p4, p0, LA/f;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LA/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, LA/f;->c:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, p0, LA/f;->d:LA/e;

    .line 11
    .line 12
    iget v3, p0, LA/f;->e:I

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, LA/i;->a(Ljava/lang/String;Landroid/content/Context;LA/e;I)LA/h;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    new-instance v0, LA/h;

    .line 20
    .line 21
    const/4 v1, -0x3

    .line 22
    invoke-direct {v0, v1}, LA/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, LA/f;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, LA/f;->c:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v2, p0, LA/f;->d:LA/e;

    .line 31
    .line 32
    iget v3, p0, LA/f;->e:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, LA/i;->a(Ljava/lang/String;Landroid/content/Context;LA/e;I)LA/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
