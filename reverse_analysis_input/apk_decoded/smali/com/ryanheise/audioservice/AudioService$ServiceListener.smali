.class public interface abstract Lcom/ryanheise/audioservice/AudioService$ServiceListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ServiceListener"
.end annotation


# virtual methods
.method public abstract onAddQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V
.end method

.method public abstract onAddQueueItemAt(Landroid/support/v4/media/MediaMetadataCompat;I)V
.end method

.method public abstract onAdjustVolume(I)V
.end method

.method public abstract onClick(Lcom/ryanheise/audioservice/MediaButton;)V
.end method

.method public abstract onClose()V
.end method

.method public abstract onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onDestroy()V
.end method

.method public abstract onFastForward()V
.end method

.method public abstract onLoadChildren(Ljava/lang/String;Landroidx/media/u;Landroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onLoadItem(Ljava/lang/String;Landroidx/media/u;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onPause()V
.end method

.method public abstract onPlay()V
.end method

.method public abstract onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
.end method

.method public abstract onPlayMediaItem(Landroid/support/v4/media/MediaMetadataCompat;)V
.end method

.method public abstract onPrepare()V
.end method

.method public abstract onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
.end method

.method public abstract onRemoveQueueItem(Landroid/support/v4/media/MediaMetadataCompat;)V
.end method

.method public abstract onRemoveQueueItemAt(I)V
.end method

.method public abstract onRewind()V
.end method

.method public abstract onSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/u;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/u;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onSeekTo(J)V
.end method

.method public abstract onSetCaptioningEnabled(Z)V
.end method

.method public abstract onSetPlaybackSpeed(F)V
.end method

.method public abstract onSetRating(Landroid/support/v4/media/RatingCompat;)V
.end method

.method public abstract onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
.end method

.method public abstract onSetRepeatMode(I)V
.end method

.method public abstract onSetShuffleMode(I)V
.end method

.method public abstract onSetVolumeTo(I)V
.end method

.method public abstract onSkipToNext()V
.end method

.method public abstract onSkipToPrevious()V
.end method

.method public abstract onSkipToQueueItem(J)V
.end method

.method public abstract onStop()V
.end method

.method public abstract onTaskRemoved()V
.end method
