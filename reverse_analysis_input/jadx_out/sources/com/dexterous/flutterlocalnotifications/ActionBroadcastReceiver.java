package com.dexterous.flutterlocalnotifications;

import Q.n;
import Z1.m;
import Z1.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import e3.C0394c;
import g.InterfaceC0434a;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Map;
import n3.C0698h;
import t.V;

/* JADX INFO: loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Z1.c f5112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0394c f5113c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f5114a;

    @InterfaceC0434a
    public ActionBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            n nVar = this.f5114a;
            if (nVar == null) {
                nVar = new n(context, (byte) 0);
            }
            this.f5114a = nVar;
            Map<String, Object> mapExtractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int iIntValue = ((Integer) mapExtractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = mapExtractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    new V(context).a((String) obj, iIntValue);
                } else {
                    new V(context).a(null, iIntValue);
                }
            }
            if (f5112b == null) {
                f5112b = new Z1.c(8);
            }
            Z1.c cVar = f5112b;
            C0698h c0698h = (C0698h) cVar.f2997m;
            if (c0698h != null) {
                c0698h.success(mapExtractNotificationResponseMap);
            } else {
                ((ArrayList) cVar.f2996l).add(mapExtractNotificationResponseMap);
            }
            if (f5113c != null) {
                Log.e("ActionBroadcastReceiver", "Engine is already initialised");
                return;
            }
            h3.f fVar = (h3.f) m.z().f3024m;
            fVar.c(context);
            fVar.a(context, null);
            f5113c = new C0394c(context);
            FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f5114a.f1730l.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
            if (flutterCallbackInformationLookupCallbackInformation == null) {
                Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
                return;
            }
            f3.b bVar = f5113c.f5607c;
            new s(bVar.f5751p, "dexterous.com/flutter/local_notifications/actions").Q(f5112b);
            bVar.a(new s(context.getAssets(), fVar.f6324d.f6308b, flutterCallbackInformationLookupCallbackInformation, 5));
        }
    }
}
