package Z;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.g;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.l;
import android.support.v4.media.session.y;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.A;
import b3.AbstractC0307a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbM = AbstractC0307a.m("Expected 1 service that handles ", str, ", found ");
        sbM.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbM.toString());
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j5) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent != null) {
            return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j5);
        }
        Log.w(TAG, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    public static KeyEvent handleIntent(y yVar, Intent intent) {
        if (yVar == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        l lVar = yVar.f3733b;
        if (keyEvent != null) {
            lVar.f3711a.f3706a.dispatchMediaButtonEvent(keyEvent);
            return keyEvent;
        }
        lVar.getClass();
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public void onForegroundServiceStartNotAllowedException(Intent intent, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            try {
                i4.a.X(context, intent);
                return;
            } catch (IllegalStateException e5) {
                if (Build.VERSION.SDK_INT < 31 || !a.b(e5)) {
                    throw e5;
                }
                onForegroundServiceStartNotAllowedException(intent, a.a(e5));
                return;
            }
        }
        ComponentName componentNameA2 = a(context, A.SERVICE_INTERFACE);
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(pendingResultGoAsync, applicationContext, intent);
        g gVar = new g(applicationContext, componentNameA2, bVar);
        bVar.f2819d = gVar;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        gVar.f3668a.f3660b.connect();
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j5) {
        if (componentName == null) {
            Log.w(TAG, "The component name of media button receiver should be provided.");
            return null;
        }
        int iD = PlaybackStateCompat.d(j5);
        if (iD == 0) {
            Log.w(TAG, "Cannot build a media button pending intent with the given action: " + j5);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, iD));
        int i = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, iD, intent, i >= 31 ? 33554432 : 0);
    }
}
