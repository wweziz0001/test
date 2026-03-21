.class public final Ly3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/c;


# instance fields
.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, La0/z;

    const/4 v1, 0x7

    .line 3
    invoke-direct {v0, v1}, La0/z;-><init>(I)V

    .line 4
    iput-object v0, p0, Ly3/i;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly3/e;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Ly3/i;->b:Ljava/lang/Object;

    return-void
.end method
