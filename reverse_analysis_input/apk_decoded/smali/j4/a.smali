.class public abstract synthetic Lj4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    const/4 v3, 0x3

    move-object v0, p0

    move-wide v1, p1

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
