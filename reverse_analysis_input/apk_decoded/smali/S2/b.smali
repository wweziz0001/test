.class public abstract synthetic LS2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic A(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getType()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic B(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getLocation()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic C(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getGroup()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic D(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getIndexInTheGroup()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic a(Landroid/media/AudioManager;III)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/media/AudioManager;->getStreamVolumeDb(III)F

    move-result p0

    return p0
.end method

.method public static bridge synthetic b(Landroid/media/MicrophoneInfo$Coordinate3F;)F
    .locals 0

    .line 1
    iget p0, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->x:F

    return p0
.end method

.method public static bridge synthetic c(Landroid/media/AudioManager;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getStreamMinVolume(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic d(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getDirectionality()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic e(Landroid/content/pm/PackageInfo;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic f(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    return-object p0
.end method

.method public static bridge synthetic g(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getPosition()Landroid/media/MicrophoneInfo$Coordinate3F;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h(Ljava/lang/Object;)Landroid/media/MicrophoneInfo;
    .locals 0

    .line 1
    check-cast p0, Landroid/media/MicrophoneInfo;

    return-object p0
.end method

.method public static bridge synthetic i(Landroid/media/session/MediaSession;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/session/MediaSession;->getCurrentControllerInfo()Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Landroidx/media/p;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/service/media/MediaBrowserService;->getCurrentBrowserInfo()Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic l(Landroid/media/MicrophoneInfo;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getDescription()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic m(Landroid/media/AudioManager;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/AudioManager;->getMicrophones()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n(Landroid/media/MicrophoneInfo;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getFrequencyResponse()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(ILjava/lang/String;I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    invoke-direct {v0, p1, p0, p2}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public static bridge synthetic p(Landroid/app/job/JobInfo$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/job/JobInfo$Builder;->setImportantWhileForeground(Z)Landroid/app/job/JobInfo$Builder;

    return-void
.end method

.method public static bridge synthetic q(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetwork(Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;

    return-void
.end method

.method public static bridge synthetic r(Landroid/content/pm/SigningInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/pm/SigningInfo;->hasMultipleSigners()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic s(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/pm/SigningInfo;->getApkContentsSigners()[Landroid/content/pm/Signature;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic t(Landroid/media/MicrophoneInfo$Coordinate3F;)F
    .locals 0

    .line 1
    iget p0, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->y:F

    return p0
.end method

.method public static bridge synthetic u(Landroid/media/MicrophoneInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getId()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic v(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getOrientation()Landroid/media/MicrophoneInfo$Coordinate3F;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic w(Landroid/media/MicrophoneInfo;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic x(Landroid/media/MicrophoneInfo;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MicrophoneInfo;->getChannelMapping()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic z(Landroid/media/MicrophoneInfo$Coordinate3F;)F
    .locals 0

    .line 1
    iget p0, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->z:F

    return p0
.end method
