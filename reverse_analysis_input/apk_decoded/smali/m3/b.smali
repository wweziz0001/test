.class public final Lm3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ1/i;


# direct methods
.method public constructor <init>(Lf3/b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LZ1/i;

    sget-object v1, Ln3/k;->a:Ln3/k;

    const/4 v2, 0x0

    .line 3
    const-string v3, "flutter/system"

    invoke-direct {v0, p1, v3, v1, v2}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 4
    iput-object v0, p0, Lm3/b;->a:LZ1/i;

    return-void
.end method

.method public constructor <init>(Ln3/f;)V
    .locals 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LZ1/i;

    sget-object v1, Ln3/k;->a:Ln3/k;

    const/4 v2, 0x0

    .line 7
    const-string v3, "flutter/keyevent"

    invoke-direct {v0, p1, v3, v1, v2}, LZ1/i;-><init>(Ln3/f;Ljava/lang/String;Ln3/m;La0/z;)V

    .line 8
    iput-object v0, p0, Lm3/b;->a:LZ1/i;

    return-void
.end method
