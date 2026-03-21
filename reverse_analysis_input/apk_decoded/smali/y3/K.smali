.class public final Ly3/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/webkit/WebSettings;Z)V
    .locals 3

    .line 1
    sget-object v0, LF1/j;->b:LF1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LF1/c;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    sget-object v0, LF1/k;->a:LB0/d;

    .line 10
    .line 11
    new-instance v1, LB0/d;

    .line 12
    .line 13
    iget-object v0, v0, LB0/d;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSettings(Landroid/webkit/WebSettings;)Ljava/lang/reflect/InvocationHandler;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v2, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 22
    .line 23
    invoke-static {v2, v0}, Li4/a;->j(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 28
    .line 29
    invoke-direct {v1, v0}, LB0/d;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1e

    .line 37
    .line 38
    if-ne v1, v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v1, "android.webkit.WebSettingsWrapper"

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    const-string p0, "WebSettingsCompat"

    .line 57
    .line 58
    const-string v1, "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."

    .line 59
    .line 60
    invoke-static {p0, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 61
    .line 62
    .line 63
    new-instance v1, LF1/g;

    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    invoke-direct {v1, p0}, LB0/d;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {v1, p1}, LB0/d;->s(Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    throw v0

    .line 74
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 75
    .line 76
    const-string p1, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
