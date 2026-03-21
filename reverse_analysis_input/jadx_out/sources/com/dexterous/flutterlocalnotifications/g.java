package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NotificationDetails f5125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f5127n;

    public g(NotificationDetails notificationDetails, int i, ArrayList arrayList) {
        this.f5125l = notificationDetails;
        this.f5126m = i;
        this.f5127n = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f5125l + ", startMode=" + this.f5126m + ", foregroundServiceTypes=" + this.f5127n + '}';
    }
}
