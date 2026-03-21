.class public final synthetic Lh0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic l:Lh0/d0;

.field public final synthetic m:Landroid/util/Pair;

.field public final synthetic n:Lx0/z;

.field public final synthetic o:Lu0/g;

.field public final synthetic p:Ljava/io/IOException;

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(Lh0/d0;Landroid/util/Pair;Lx0/z;Lu0/g;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/c0;->l:Lh0/d0;

    iput-object p2, p0, Lh0/c0;->m:Landroid/util/Pair;

    iput-object p3, p0, Lh0/c0;->n:Lx0/z;

    iput-object p4, p0, Lh0/c0;->o:Lu0/g;

    iput-object p5, p0, Lh0/c0;->p:Ljava/io/IOException;

    iput-boolean p6, p0, Lh0/c0;->q:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lh0/c0;->l:Lh0/d0;

    .line 2
    .line 3
    iget-object v0, v0, Lh0/d0;->m:Lh0/g0;

    .line 4
    .line 5
    iget-object v1, v0, Lh0/g0;->h:Li0/c;

    .line 6
    .line 7
    iget-object v0, p0, Lh0/c0;->m:Landroid/util/Pair;

    .line 8
    .line 9
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Lx0/H;

    .line 21
    .line 22
    iget-object v4, p0, Lh0/c0;->n:Lx0/z;

    .line 23
    .line 24
    iget-object v5, p0, Lh0/c0;->o:Lu0/g;

    .line 25
    .line 26
    iget-object v6, p0, Lh0/c0;->p:Ljava/io/IOException;

    .line 27
    .line 28
    iget-boolean v7, p0, Lh0/c0;->q:Z

    .line 29
    .line 30
    invoke-virtual/range {v1 .. v7}, Li0/c;->e(ILx0/H;Lx0/z;Lu0/g;Ljava/io/IOException;Z)V

    .line 31
    .line 32
    .line 33
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
.end method
