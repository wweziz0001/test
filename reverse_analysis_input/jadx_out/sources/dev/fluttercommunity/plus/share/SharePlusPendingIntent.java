package dev.fluttercommunity.plus.share;

import N3.h;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f5450a = "";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h.e(context, "context");
        h.e(intent, "intent");
        ComponentName componentName = Build.VERSION.SDK_INT >= 33 ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName != null) {
            f5450a = componentName.flattenToString();
        }
    }
}
