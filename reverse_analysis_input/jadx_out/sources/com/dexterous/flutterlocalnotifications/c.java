package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f5117c;

    static {
        int[] iArr = new int[NotificationStyle.values().length];
        f5117c = iArr;
        try {
            iArr[NotificationStyle.BigPicture.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5117c[NotificationStyle.BigText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5117c[NotificationStyle.Inbox.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5117c[NotificationStyle.Messaging.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5117c[NotificationStyle.Media.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[IconSource.values().length];
        f5116b = iArr2;
        try {
            iArr2[IconSource.DrawableResource.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5116b[IconSource.BitmapFilePath.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5116b[IconSource.ContentUri.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f5116b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f5116b[IconSource.ByteArray.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr3 = new int[RepeatInterval.values().length];
        f5115a = iArr3;
        try {
            iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f5115a[RepeatInterval.Hourly.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f5115a[RepeatInterval.Daily.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f5115a[RepeatInterval.Weekly.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
