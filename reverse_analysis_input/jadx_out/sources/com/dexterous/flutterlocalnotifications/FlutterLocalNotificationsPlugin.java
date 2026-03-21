package com.dexterous.flutterlocalnotifications;

import G2.p;
import I2.i;
import J2.C;
import Z1.m;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import b3.AbstractC0307a;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import g.InterfaceC0434a;
import g2.C0438a;
import g2.C0439b;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j3.C0524a;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import n3.InterfaceC0709s;
import n3.t;
import n3.u;
import t.AbstractC0815d;
import t.AbstractC0816e;
import t.AbstractC0828q;
import t.C0807E;
import t.C0808F;
import t.C0822k;
import t.C0826o;
import t.C0827p;
import t.O;
import t.P;
import t.V;
import t.X;
import t.Z;
import t.c0;
import t.r;
import x.AbstractC0953b;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class FlutterLocalNotificationsPlugin implements InterfaceC0705o, t, u, InterfaceC0709s, j3.b, InterfaceC0541a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = "cancelAllPendingNotifications";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = "hasNotificationPolicyAccess";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = "requestNotificationPolicyAccess";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static G2.e gson;
    private Context applicationContext;
    private h callback;
    private C0707q channel;
    private Activity mainActivity;
    private e permissionRequestProgress = e.f5119l;

    public class a extends N2.a<ArrayList<NotificationDetails>> {
    }

    private static void applyGrouping(NotificationDetails notificationDetails, r rVar) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        rVar.f9786s = notificationDetails.groupKey;
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            rVar.f9787t = true;
        }
        rVar.f9764D = notificationDetails.groupAlertBehavior.intValue();
    }

    private void areNotificationsEnabled(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(Boolean.valueOf(O.a(getNotificationManager(this.applicationContext).f9724b)));
    }

    public static G2.e buildGson() {
        if (gson == null) {
            RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            i iVar = i.f1041n;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            G2.a aVar = G2.e.f895h;
            p pVar = G2.e.i;
            p pVar2 = G2.e.f896j;
            ArrayDeque arrayDeque = new ArrayDeque();
            C0439b c0439b = new C0439b();
            N2.a aVar2 = new N2.a(ScheduleMode.class);
            arrayList.add(new C(c0439b, aVar2, aVar2.f1602b == aVar2.f1601a ? true : $assertionsDisabled));
            Objects.requireNonNull(runtimeTypeAdapterFactoryRegisterSubtype);
            arrayList.add(runtimeTypeAdapterFactoryRegisterSubtype);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z4 = M2.h.f1512a;
            HashMap map2 = new HashMap(map);
            new ArrayList(arrayList);
            new ArrayList(arrayList2);
            gson = new G2.e(iVar, map2, aVar, arrayList3, pVar, pVar2, new ArrayList(arrayDeque));
        }
        return gson;
    }

    private static X buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        IconCompat iconFromSource = (obj == null || (iconSource = personDetails.iconBitmapSource) == null) ? null : getIconFromSource(context, obj, iconSource);
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str = personDetails.key;
        if (str == null) {
            str = null;
        }
        String str2 = personDetails.name;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.uri;
        String str4 = str3 != null ? str3 : null;
        X x4 = new X();
        x4.f9725a = str2;
        x4.f9726b = iconFromSource;
        x4.f9727c = str4;
        x4.f9728d = str;
        x4.f9729e = value;
        x4.f9730f = value2;
        return x4;
    }

    private static long calculateNextNotificationTrigger(long j5, long j6) {
        while (j5 < System.currentTimeMillis()) {
            j5 += j6;
        }
        return j5;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        if (notificationDetails.repeatIntervalMilliseconds != null) {
            return r0.intValue();
        }
        int i = c.f5115a[notificationDetails.repeatInterval.ordinal()];
        if (i == 1) {
            return 60000L;
        }
        if (i == 2) {
            return 3600000L;
        }
        if (i != 3) {
            return i != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.id);
        return Boolean.valueOf((!(notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) && (notificationChannel == null || notificationChannelDetails.channelAction != NotificationChannelAction.Update)) ? $assertionsDisabled : true);
    }

    private void cancel(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Map map = (Map) c0704n.f8939b;
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        interfaceC0706p.success(null);
    }

    private void cancelAllNotifications(InterfaceC0706p interfaceC0706p) {
        getNotificationManager(this.applicationContext).f9724b.cancelAll();
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            interfaceC0706p.success(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        interfaceC0706p.success(null);
    }

    private void cancelAllPendingNotifications(InterfaceC0706p interfaceC0706p) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            interfaceC0706p.success(null);
            return;
        }
        AlarmManager alarmManager = getAlarmManager(this.applicationContext);
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        interfaceC0706p.success(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        V notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.a(null, num.intValue());
        } else {
            notificationManager.a(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = (byte) ((Double) arrayList.get(i)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new d();
        }
    }

    private static C0807E createMessage(Context context, MessageDetails messageDetails) {
        String str;
        C0807E c0807e = new C0807E(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            Uri uri = Uri.parse(str2);
            c0807e.f9697e = str;
            c0807e.f9698f = uri;
        }
        return c0807e;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails notificationChannelDetailsFromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, notificationChannelDetailsFromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, notificationChannelDetailsFromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        r rVar = new r(context, notificationDetails.channelId);
        rVar.f9773e = r.b(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        rVar.f9774f = r.b(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        rVar.f9766F.tickerText = r.b(notificationDetails.ticker);
        rVar.c(16, BooleanUtils.getValue(notificationDetails.autoCancel));
        rVar.f9775g = activity;
        rVar.f9778k = notificationDetails.priority.intValue();
        rVar.c(2, BooleanUtils.getValue(notificationDetails.ongoing));
        rVar.f9767G = BooleanUtils.getValue(notificationDetails.silent);
        rVar.c(8, BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        int i5 = 0;
        if (notificationDetails.actions != null) {
            int iIntValue = notificationDetails.id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<C0438a> list = notificationAction.actionInputs;
                int i6 = (list == null || list.isEmpty()) ? 201326592 : Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i = iIntValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, i6);
                } else {
                    i = iIntValue + 1;
                    broadcast = PendingIntent.getActivity(context, iIntValue, intent, i6);
                }
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), i5, spannableString.length(), i5);
                }
                C0822k c0822k = new C0822k(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c0822k.i = bool3.booleanValue();
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c0822k.f9745h = bool4.booleanValue();
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c0822k.f9741d = bool5.booleanValue();
                }
                Integer num = notificationAction.semanticAction;
                if (num != null) {
                    c0822k.f9744g = num.intValue();
                }
                List<C0438a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (C0438a c0438a : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str = c0438a.f5827n;
                        Boolean bool6 = c0438a.f5826m;
                        boolean zBooleanValue = bool6 != null ? bool6.booleanValue() : true;
                        List list3 = c0438a.f5828o;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                hashSet.add((String) it.next());
                            }
                        }
                        List list4 = c0438a.f5825l;
                        c0 c0Var = new c0(str, list4 != null ? (CharSequence[]) list4.toArray(new CharSequence[0]) : null, zBooleanValue, bundle, hashSet);
                        if (c0822k.f9743f == null) {
                            c0822k.f9743f = new ArrayList();
                        }
                        c0822k.f9743f.add(c0Var);
                        i5 = 0;
                    }
                }
                int i7 = i5;
                if (notificationAction.invisible.booleanValue()) {
                    rVar.f9772d.add(c0822k.a());
                } else {
                    rVar.f9770b.add(c0822k.a());
                }
                i5 = i7;
                iIntValue = i;
            }
        }
        int i8 = i5;
        setSmallIcon(context, notificationDetails, rVar);
        rVar.d(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num2 = notificationDetails.color;
        if (num2 != null) {
            rVar.y = num2.intValue();
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            rVar.f9788u = bool7.booleanValue();
            rVar.f9789v = true;
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            rVar.f9779l = BooleanUtils.getValue(bool8);
        }
        Long l3 = notificationDetails.when;
        if (l3 != null) {
            rVar.f9766F.when = l3.longValue();
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            rVar.f9780m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null) {
            boolean zBooleanValue2 = bool10.booleanValue();
            if (rVar.f9791x == null) {
                rVar.f9791x = new Bundle();
            }
            rVar.f9791x.putBoolean("android.chronometerCountDown", zBooleanValue2);
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            rVar.f9776h = activity;
            rVar.c(128, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            rVar.f9762B = notificationDetails.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            rVar.f9782o = r.b(notificationDetails.subText);
        }
        Integer num3 = notificationDetails.number;
        if (num3 != null) {
            rVar.f9777j = num3.intValue();
        }
        setVisibility(notificationDetails, rVar);
        applyGrouping(notificationDetails, rVar);
        setSound(context, notificationDetails, rVar);
        setVibrationPattern(notificationDetails, rVar);
        setLights(notificationDetails, rVar);
        setStyle(context, notificationDetails, rVar);
        setProgress(notificationDetails, rVar);
        setCategory(notificationDetails, rVar);
        setTimeoutAfter(notificationDetails, rVar);
        Notification notificationA = rVar.a();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i9 = i8; i9 < length; i9++) {
                notificationA.flags = iArr[i9] | notificationA.flags;
            }
        }
        return notificationA;
    }

    private void createNotificationChannel(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) c0704n.f8939b));
        interfaceC0706p.success(null);
    }

    private void createNotificationChannelGroup(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationChannelGroupDetails notificationChannelGroupDetailsFrom = NotificationChannelGroupDetails.from((Map) c0704n.f8939b);
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            b.B();
            NotificationChannelGroup notificationChannelGroupH = b.h(notificationChannelGroupDetailsFrom.id, notificationChannelGroupDetailsFrom.name);
            if (i >= 28) {
                notificationChannelGroupH.setDescription(notificationChannelGroupDetailsFrom.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroupH);
        }
        interfaceC0706p.success(null);
    }

    private void deleteNotificationChannel(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) c0704n.f8939b);
        }
        interfaceC0706p.success(null);
    }

    private void deleteNotificationChannelGroup(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) c0704n.f8939b);
        }
        interfaceC0706p.success(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int iC = iconCompat.f4018a;
        if (iC == -1) {
            iC = AbstractC0953b.c(iconCompat.f4019b);
        }
        if (iC == 2) {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.h());
        } else {
            if (iC != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.i().toString();
        }
        HashMap map = new HashMap();
        map.put("source", Integer.valueOf(iconSource.ordinal()));
        map.put("data", resourceEntryName);
        return map;
    }

    private Map<String, Object> describePerson(X x4) {
        if (x4 == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("key", x4.f9728d);
        map.put("name", x4.f9725a);
        map.put("uri", x4.f9727c);
        map.put("bot", Boolean.valueOf(x4.f9729e));
        map.put("important", Boolean.valueOf(x4.f9730f));
        map.put("icon", describeIcon(x4.f9726b));
        return map;
    }

    private NotificationDetails extractNotificationDetails(InterfaceC0706p interfaceC0706p, Map<String, Object> map) {
        NotificationDetails notificationDetailsFrom = NotificationDetails.from(map);
        if (hasInvalidIcon(interfaceC0706p, notificationDetailsFrom.icon) || hasInvalidLargeIcon(interfaceC0706p, notificationDetailsFrom.largeIcon, notificationDetailsFrom.largeIconBitmapSource) || hasInvalidBigPictureResources(interfaceC0706p, notificationDetailsFrom) || hasInvalidRawSoundResource(interfaceC0706p, notificationDetailsFrom) || hasInvalidLedDetails(interfaceC0706p, notificationDetailsFrom)) {
            return null;
        }
        return notificationDetailsFrom;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap map = new HashMap();
        map.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        map.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        map.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        map.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle bundleB = Z.b(intent);
        if (bundleB != null) {
            map.put(INPUT, bundleB.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return map;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) c0704n.f8939b;
            int iIntValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != iIntValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                interfaceC0706p.success(null);
                return;
            }
            C0808F c0808fJ = C0808F.j(notification);
            if (c0808fJ == null) {
                interfaceC0706p.success(null);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("groupConversation", Boolean.valueOf(c0808fJ.k()));
            map2.put("person", describePerson(c0808fJ.f9701g));
            map2.put("conversationTitle", c0808fJ.f9702h);
            ArrayList arrayList = new ArrayList();
            for (C0807E c0807e : c0808fJ.f9699e) {
                HashMap map3 = new HashMap();
                map3.put("text", c0807e.f9693a);
                map3.put("timestamp", Long.valueOf(c0807e.f9694b));
                map3.put("person", describePerson(c0807e.f9695c));
                Uri uri = c0807e.f9698f;
                if (uri != null) {
                    map3.put("dataUri", uri.toString());
                }
                String str2 = c0807e.f9697e;
                if (str2 != null) {
                    map3.put("dataMimeType", str2);
                }
                arrayList.add(map3);
            }
            map2.put("messages", arrayList);
            interfaceC0706p.success(map2);
        } catch (Throwable th) {
            interfaceC0706p.error(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(InterfaceC0706p interfaceC0706p) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap map = new HashMap();
                map.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    map.put("channelId", notification.getChannelId());
                }
                map.put(CANCEL_TAG, statusBarNotification.getTag());
                map.put("groupKey", notification.getGroup());
                map.put("title", notification.extras.getCharSequence("android.title"));
                map.put("body", notification.extras.getCharSequence("android.text"));
                map.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(map);
            }
            interfaceC0706p.success(arrayList);
        } catch (Throwable th) {
            interfaceC0706p.error(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(bArrCastObjectToByteArray, 0, bArrCastObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, intent, 201326592);
    }

    private void getCallbackHandle(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(Long.valueOf(this.applicationContext.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1L)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        IconCompat iconCompatF;
        int i = c.f5116b[iconSource.ordinal()];
        if (i == 1) {
            int drawableResourceId = getDrawableResourceId(context, (String) obj);
            PorterDuff.Mode mode = IconCompat.f4017k;
            context.getClass();
            return IconCompat.g(context.getResources(), context.getPackageName(), drawableResourceId);
        }
        if (i == 2) {
            return IconCompat.f(BitmapFactory.decodeFile((String) obj));
        }
        if (i == 3) {
            String str = (String) obj;
            PorterDuff.Mode mode2 = IconCompat.f4017k;
            str.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f4019b = str;
            return iconCompat;
        }
        if (i == 4) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(((h3.f) m.z().f3024m).b((String) obj));
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                iconCompatF = IconCompat.f(BitmapFactory.decodeStream(fileInputStreamCreateInputStream));
                fileInputStreamCreateInputStream.close();
                assetFileDescriptorOpenFd.close();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } else {
            if (i != 5) {
                return null;
            }
            byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
            int length = bArrCastObjectToByteArray.length;
            iconCompatF = new IconCompat(3);
            iconCompatF.f4019b = bArrCastObjectToByteArray;
            iconCompatF.f4022e = 0;
            iconCompatF.f4023f = length;
        }
        return iconCompatF;
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        HashMap<String, Object> map = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            map.put(CANCEL_ID, notificationChannel.getId());
            map.put("name", notificationChannel.getName());
            map.put("description", notificationChannel.getDescription());
            map.put("groupId", notificationChannel.getGroup());
            map.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            map.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                map.put("sound", null);
                map.put("playSound", Boolean.FALSE);
            } else {
                map.put("playSound", Boolean.TRUE);
                List listAsList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String str = sound.toString().split("/")[r1.length - 1];
                    Integer numTryParseInt = tryParseInt(str);
                    if (numTryParseInt == null) {
                        map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                        map.put("sound", str);
                    } else {
                        try {
                            String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(numTryParseInt.intValue());
                            if (resourceEntryName != null) {
                                map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                                map.put("sound", resourceEntryName);
                            }
                        } catch (Exception unused) {
                            map.put("sound", null);
                            map.put("playSound", Boolean.FALSE);
                        }
                    }
                } else {
                    map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.Uri)));
                    map.put("sound", sound.toString());
                }
            }
            map.put("bypassDnd", Boolean.valueOf(notificationChannel.canBypassDnd()));
            map.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            map.put("vibrationPattern", notificationChannel.getVibrationPattern());
            map.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            map.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
            AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
            map.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        }
        return map;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId zoneIdOf = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), zoneIdOf);
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(zoneIdOf);
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(zonedDateTimeNow.getYear(), zonedDateTimeNow.getMonthValue(), zonedDateTimeNow.getDayOfMonth(), zonedDateTimeOf.getHour(), zonedDateTimeOf.getMinute(), zonedDateTimeOf.getSecond(), zonedDateTimeOf.getNano(), zoneIdOf);
        while (zonedDateTimeOf2.isBefore(zonedDateTimeNow)) {
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (zonedDateTimeOf2.getDayOfWeek() != zonedDateTimeOf.getDayOfWeek()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (zonedDateTimeOf2.getDayOfMonth() != zonedDateTimeOf.getDayOfMonth()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (zonedDateTimeOf2.getMonthValue() == zonedDateTimeOf.getMonthValue() && zonedDateTimeOf2.getDayOfMonth() == zonedDateTimeOf.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
            }
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(InterfaceC0706p interfaceC0706p) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z4 = (intent == null || !(SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) || launchedActivityFromHistory(intent)) ? $assertionsDisabled : true;
            Boolean boolValueOf = Boolean.valueOf(z4);
            if (z4) {
                map.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = boolValueOf;
        }
        map.put(NOTIFICATION_LAUNCHED_APP, bool);
        interfaceC0706p.success(map);
    }

    private void getNotificationChannels(InterfaceC0706p interfaceC0706p) {
        List<NotificationChannel> listEmptyList;
        try {
            V notificationManager = getNotificationManager(this.applicationContext);
            if (Build.VERSION.SDK_INT >= 26) {
                listEmptyList = P.k(notificationManager.f9724b);
            } else {
                notificationManager.getClass();
                listEmptyList = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(b.e(it.next())));
            }
            interfaceC0706p.success(arrayList);
        } catch (Throwable th) {
            interfaceC0706p.error(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static V getNotificationManager(Context context) {
        return new V(context);
    }

    private boolean hasInvalidBigPictureResources(InterfaceC0706p interfaceC0706p, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return $assertionsDisabled;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(interfaceC0706p, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            if (!StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, interfaceC0706p, INVALID_BIG_PICTURE_ERROR_CODE)) {
                return $assertionsDisabled;
            }
            return true;
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return $assertionsDisabled;
        }
        byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        return $assertionsDisabled;
    }

    private boolean hasInvalidIcon(InterfaceC0706p interfaceC0706p, String str) {
        if (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, interfaceC0706p, INVALID_ICON_ERROR_CODE)) {
            return $assertionsDisabled;
        }
        return true;
    }

    private boolean hasInvalidLargeIcon(InterfaceC0706p interfaceC0706p, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            if (bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0) {
                return true;
            }
            return $assertionsDisabled;
        }
        String str = (String) obj;
        if (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, interfaceC0706p, INVALID_LARGE_ICON_ERROR_CODE)) {
            return $assertionsDisabled;
        }
        return true;
    }

    private boolean hasInvalidLedDetails(InterfaceC0706p interfaceC0706p, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return $assertionsDisabled;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return $assertionsDisabled;
        }
        interfaceC0706p.error(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(InterfaceC0706p interfaceC0706p, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return $assertionsDisabled;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return $assertionsDisabled;
        }
        interfaceC0706p.error(INVALID_SOUND_ERROR_CODE, AbstractC0307a.k("The resource ", notificationDetails.sound, " could not be found. Please make sure it has been added as a raw resource to your Android head project."), null);
        return true;
    }

    private void initialize(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        String str = (String) ((Map) c0704n.f8939b).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, interfaceC0706p, INVALID_ICON_ERROR_CODE)) {
            Long lF = Z1.f.F(c0704n.a(DISPATCHER_HANDLE));
            Long lF2 = Z1.f.F(c0704n.a(CALLBACK_HANDLE));
            if (lF != null && lF2 != null) {
                Context context = this.applicationContext;
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", lF.longValue()).apply();
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", lF2.longValue()).apply();
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            interfaceC0706p.success(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, InterfaceC0706p interfaceC0706p, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        interfaceC0706p.error(str2, AbstractC0307a.k("The resource ", str, " could not be found. Please make sure it has been added as a drawable resource to your Android head project."), null);
        return $assertionsDisabled;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        if (intent == null || (intent.getFlags() & 1048576) != 1048576) {
            return $assertionsDisabled;
        }
        return true;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().b(string, new a().f1602b) : arrayList;
    }

    private void pendingNotificationRequests(InterfaceC0706p interfaceC0706p) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails : arrayListLoadScheduledNotifications) {
            HashMap map = new HashMap();
            map.put(CANCEL_ID, notificationDetails.id);
            map.put("title", notificationDetails.title);
            map.put("body", notificationDetails.body);
            map.put(PAYLOAD, notificationDetails.payload);
            arrayList.add(map);
        }
        interfaceC0706p.success(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, $assertionsDisabled)) {
            new V(this.applicationContext).a(null, ((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, arrayListLoadScheduledNotifications);
    }

    private void repeat(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC0706p, (Map) c0704n.f8939b);
        if (notificationDetailsExtractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                interfaceC0706p.success(null);
            } catch (d e5) {
                interfaceC0706p.error(e5.f5118l, e5.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long jCalculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long jLongValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            jLongValue = calendar.getTimeInMillis();
        }
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(jLongValue, jCalculateRepeatIntervalMilliseconds);
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, jCalculateNextNotificationTrigger, jCalculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        for (NotificationDetails notificationDetails : loadScheduledNotifications(context)) {
            try {
                if (notificationDetails.repeatInterval != null || notificationDetails.repeatIntervalMilliseconds != null) {
                    repeatNotification(context, notificationDetails, Boolean.FALSE);
                } else if (notificationDetails.timeZoneName != null) {
                    zonedScheduleNotification(context, notificationDetails, Boolean.FALSE);
                } else {
                    scheduleNotification(context, notificationDetails, Boolean.FALSE);
                }
            } catch (d e5) {
                Log.e(TAG, e5.getMessage());
                removeNotificationFromCache(context, notificationDetails.id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails2 : arrayListLoadScheduledNotifications) {
            if (!notificationDetails2.id.equals(notificationDetails.id)) {
                arrayList.add(notificationDetails2);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().f(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
            } else if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
            } else if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.id);
            } else {
                scheduleNextRepeatingNotification(context, notificationDetails);
            }
        } catch (d e5) {
            Log.e(TAG, e5.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> mapExtractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, mapExtractNotificationResponseMap);
        }
        this.channel.a("didReceiveNotificationResponse", mapExtractNotificationResponseMap, null);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, r rVar) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        C0826o c0826o = new C0826o();
        if (bigPictureStyleInformation.contentTitle != null) {
            c0826o.f1789c = r.b(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            c0826o.f1790d = r.b(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
            c0826o.f1787a = true;
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            c0826o.f9756f = null;
            c0826o.f9757g = true;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                Bitmap bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
                c0826o.f9756f = bitmapFromSource == null ? null : IconCompat.f(bitmapFromSource);
                c0826o.f9757g = true;
            }
        }
        Bitmap bitmapFromSource2 = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        c0826o.f9755e = bitmapFromSource2 != null ? IconCompat.f(bitmapFromSource2) : null;
        rVar.e(c0826o);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, r rVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C0827p c0827p = new C0827p(0);
        if (bigTextStyleInformation.bigText != null) {
            c0827p.f9760f = r.b(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            c0827p.f1789c = r.b(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            c0827p.f1790d = r.b(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
            c0827p.f1787a = true;
        }
        rVar.e(c0827p);
    }

    private void setCanScheduleExactNotifications(InterfaceC0706p interfaceC0706p) {
        if (Build.VERSION.SDK_INT < 31) {
            interfaceC0706p.success(Boolean.TRUE);
        } else {
            interfaceC0706p.success(Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, r rVar) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        rVar.f9790w = str;
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, r rVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C0827p c0827p = new C0827p(1);
        if (inboxStyleInformation.contentTitle != null) {
            c0827p.f1789c = r.b(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            c0827p.f1790d = r.b(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
            c0827p.f1787a = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            for (String str : arrayList) {
                CharSequence charSequenceFromHtml = str;
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequenceFromHtml = fromHtml(str);
                }
                if (charSequenceFromHtml != null) {
                    ((ArrayList) c0827p.f9760f).add(r.b(charSequenceFromHtml));
                }
            }
        }
        rVar.e(c0827p);
    }

    private static void setLights(NotificationDetails notificationDetails, r rVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        int iIntValue = notificationDetails.ledColor.intValue();
        int iIntValue2 = notificationDetails.ledOnMs.intValue();
        int iIntValue3 = notificationDetails.ledOffMs.intValue();
        Notification notification = rVar.f9766F;
        notification.ledARGB = iIntValue;
        notification.ledOnMS = iIntValue2;
        notification.ledOffMS = iIntValue3;
        notification.flags = ((iIntValue2 == 0 || iIntValue3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    private static void setMediaStyle(r rVar) {
        rVar.e(new Y.c());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, r rVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        C0808F c0808f = new C0808F(buildPerson(context, messagingStyleInformation.person));
        c0808f.i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            c0808f.f9702h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                C0807E c0807eCreateMessage = createMessage(context, it.next());
                if (c0807eCreateMessage != null) {
                    ArrayList arrayList2 = c0808f.f9699e;
                    arrayList2.add(c0807eCreateMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        rVar.e(c0808f);
    }

    private static void setProgress(NotificationDetails notificationDetails, r rVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            int iIntValue = notificationDetails.maxProgress.intValue();
            int iIntValue2 = notificationDetails.progress.intValue();
            boolean zBooleanValue = notificationDetails.indeterminate.booleanValue();
            rVar.f9783p = iIntValue;
            rVar.f9784q = iIntValue2;
            rVar.f9785r = zBooleanValue;
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, r rVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            rVar.f9766F.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            rVar.f9766F.icon = notificationDetails.iconResourceId.intValue();
        } else {
            rVar.f9766F.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, r rVar) {
        if (!BooleanUtils.getValue(notificationDetails.playSound)) {
            Notification notification = rVar.f9766F;
            notification.sound = null;
            notification.audioStreamType = -1;
            notification.audioAttributes = AbstractC0828q.a(AbstractC0828q.e(AbstractC0828q.c(AbstractC0828q.b(), 4), 5));
            return;
        }
        Uri uriRetrieveSoundResourceUri = retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource);
        Notification notification2 = rVar.f9766F;
        notification2.sound = uriRetrieveSoundResourceUri;
        notification2.audioStreamType = -1;
        notification2.audioAttributes = AbstractC0828q.a(AbstractC0828q.e(AbstractC0828q.c(AbstractC0828q.b(), 4), 5));
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, r rVar) {
        int i = c.f5117c[notificationDetails.style.ordinal()];
        if (i == 1) {
            setBigPictureStyle(context, notificationDetails, rVar);
            return;
        }
        if (i == 2) {
            setBigTextStyle(notificationDetails, rVar);
            return;
        }
        if (i == 3) {
            setInboxStyle(notificationDetails, rVar);
        } else if (i == 4) {
            setMessagingStyle(context, notificationDetails, rVar);
        } else {
            if (i != 5) {
                return;
            }
            setMediaStyle(rVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, r rVar) {
        Long l3 = notificationDetails.timeoutAfter;
        if (l3 == null) {
            return;
        }
        rVar.f9763C = l3.longValue();
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, r rVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            rVar.f9766F.vibrate = new long[]{0};
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        rVar.f9766F.vibrate = jArr;
    }

    private static void setVisibility(NotificationDetails notificationDetails, r rVar) {
        int i;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            i = 1;
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
                i = -1;
            }
        } else {
            i = 0;
        }
        rVar.f9792z = i;
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j5, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j5, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j5, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j5, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            AbstractC0815d.b(alarmManager, AbstractC0815d.a(j5, pendingIntent), pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j5, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            AbstractC0816e.b(alarmManager, 0, j5, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            AbstractC0816e.a(alarmManager, 0, j5, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            AbstractC0815d.b(alarmManager, AbstractC0815d.a(j5, pendingIntent), pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            b.r();
            NotificationChannel notificationChannelF = b.f(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannelF.setDescription(notificationChannelDetails.description);
            notificationChannelF.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                notificationChannelF.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
            } else {
                notificationChannelF.setSound(null, null);
            }
            if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
                if (notificationManager.isNotificationPolicyAccessGranted()) {
                    notificationChannelF.setBypassDnd(true);
                } else {
                    Log.w(TAG, "Channel '" + notificationChannelDetails.name + "' was set to bypass Do Not Disturb but the OS prevents it.");
                }
            }
            notificationChannelF.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannelF.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannelF.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannelF.setLightColor(num.intValue());
            }
            notificationChannelF.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannelF);
        }
    }

    private void show(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC0706p, (Map) c0704n.f8939b);
        if (notificationDetailsExtractNotificationDetails != null) {
            showNotification(this.applicationContext, notificationDetailsExtractNotificationDetails);
            interfaceC0706p.success(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification notificationCreateNotification = createNotification(context, notificationDetails);
        V notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.b(str, notificationDetails.id.intValue(), notificationCreateNotification);
        } else {
            notificationManager.b(null, notificationDetails.id.intValue(), notificationCreateNotification);
        }
    }

    private void startForegroundService(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Map<String, Object> map = (Map) c0704n.a("notificationData");
        Integer num = (Integer) c0704n.a("startType");
        ArrayList arrayList = (ArrayList) c0704n.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            interfaceC0706p.error("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", null);
            return;
        }
        if (map == null || num == null) {
            interfaceC0706p.error("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", null);
            return;
        }
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC0706p, map);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.id.intValue() == 0) {
                interfaceC0706p.error("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", null);
                return;
            }
            g gVar = new g(notificationDetailsExtractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) f.class);
            intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", gVar);
            i4.a.X(this.applicationContext, intent);
            interfaceC0706p.success(null);
        }
    }

    private void stopForegroundService(InterfaceC0706p interfaceC0706p) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) f.class));
        interfaceC0706p.success(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC0706p, (Map) c0704n.f8939b);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.matchDateTimeComponents != null) {
                notificationDetailsExtractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(notificationDetailsExtractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                interfaceC0706p.success(null);
            } catch (d e5) {
                interfaceC0706p.error(e5.f5118l, e5.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(InterfaceC0706p interfaceC0706p) {
        interfaceC0706p.success(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()));
    }

    @Override // n3.InterfaceC0709s
    public boolean onActivityResult(int i, int i5, Intent intent) {
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return $assertionsDisabled;
        }
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5122o;
        e eVar3 = e.f5119l;
        if (eVar == eVar2 && i == 2 && Build.VERSION.SDK_INT >= 31) {
            this.callback.a(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = eVar3;
        }
        if (this.permissionRequestProgress == e.f5123p && i == 3 && Build.VERSION.SDK_INT >= 34) {
            this.callback.a(((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent());
            this.permissionRequestProgress = eVar3;
        }
        if (this.permissionRequestProgress == e.f5121n && i == 4) {
            this.callback.a(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = eVar3;
        }
        return true;
    }

    @Override // k3.InterfaceC0541a
    public void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        n nVar = (n) interfaceC0542b;
        ((HashSet) nVar.f10957d).add(this);
        ((HashSet) nVar.f10955b).add(this);
        nVar.a(this);
        Activity activity = (Activity) nVar.f10954a;
        this.mainActivity = activity;
        Intent intent = activity.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    @Override // j3.b
    public void onAttachedToEngine(C0524a c0524a) {
        this.applicationContext = c0524a.f7453a;
        C0707q c0707q = new C0707q(c0524a.f7455c, METHOD_CHANNEL);
        this.channel = c0707q;
        c0707q.b(this);
    }

    @Override // k3.InterfaceC0541a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // k3.InterfaceC0541a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // j3.b
    public void onDetachedFromEngine(C0524a c0524a) {
        this.channel.b(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        String str = c0704n.f8938a;
        str.getClass();
        switch (str) {
            case "stopForegroundService":
                stopForegroundService(interfaceC0706p);
                break;
            case "getNotificationChannels":
                getNotificationChannels(interfaceC0706p);
                break;
            case "deleteNotificationChannelGroup":
                deleteNotificationChannelGroup(c0704n, interfaceC0706p);
                break;
            case "requestNotificationsPermission":
                requestNotificationsPermission(new U2.b(interfaceC0706p, 1));
                break;
            case "hasNotificationPolicyAccess":
                hasNotificationPolicyAccess(interfaceC0706p);
                break;
            case "cancel":
                cancel(c0704n, interfaceC0706p);
                break;
            case "requestExactAlarmsPermission":
                requestExactAlarmsPermission(new U2.b(interfaceC0706p, 2));
                break;
            case "requestFullScreenIntentPermission":
                requestFullScreenIntentPermission(new U2.b(interfaceC0706p, 3));
                break;
            case "pendingNotificationRequests":
                pendingNotificationRequests(interfaceC0706p);
                break;
            case "cancelAllPendingNotifications":
                cancelAllPendingNotifications(interfaceC0706p);
                break;
            case "getNotificationAppLaunchDetails":
                getNotificationAppLaunchDetails(interfaceC0706p);
                break;
            case "show":
                show(c0704n, interfaceC0706p);
                break;
            case "periodicallyShow":
                repeat(c0704n, interfaceC0706p);
                break;
            case "getActiveNotificationMessagingStyle":
                getActiveNotificationMessagingStyle(c0704n, interfaceC0706p);
                break;
            case "cancelAll":
                cancelAllNotifications(interfaceC0706p);
                break;
            case "zonedSchedule":
                zonedSchedule(c0704n, interfaceC0706p);
                break;
            case "createNotificationChannelGroup":
                createNotificationChannelGroup(c0704n, interfaceC0706p);
                break;
            case "getCallbackHandle":
                getCallbackHandle(interfaceC0706p);
                break;
            case "initialize":
                initialize(c0704n, interfaceC0706p);
                break;
            case "areNotificationsEnabled":
                areNotificationsEnabled(interfaceC0706p);
                break;
            case "canScheduleExactNotifications":
                setCanScheduleExactNotifications(interfaceC0706p);
                break;
            case "deleteNotificationChannel":
                deleteNotificationChannel(c0704n, interfaceC0706p);
                break;
            case "startForegroundService":
                startForegroundService(c0704n, interfaceC0706p);
                break;
            case "getActiveNotifications":
                getActiveNotifications(interfaceC0706p);
                break;
            case "createNotificationChannel":
                createNotificationChannel(c0704n, interfaceC0706p);
                break;
            case "requestNotificationPolicyAccess":
                requestNotificationPolicyAccess(new U2.b(interfaceC0706p, 4));
                break;
            case "periodicallyShowWithDuration":
                repeat(c0704n, interfaceC0706p);
                break;
            default:
                interfaceC0706p.notImplemented();
                break;
        }
    }

    @Override // n3.t
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean zBooleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (zBooleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return zBooleanValue;
    }

    @Override // k3.InterfaceC0541a
    public void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        n nVar = (n) interfaceC0542b;
        ((HashSet) nVar.f10957d).add(this);
        ((HashSet) nVar.f10955b).add(this);
        nVar.a(this);
        this.mainActivity = (Activity) nVar.f10954a;
    }

    @Override // n3.u
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5120m;
        boolean z4 = $assertionsDisabled;
        if (eVar == eVar2 && i == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z4 = true;
            }
            this.callback.a(z4);
            this.permissionRequestProgress = e.f5119l;
        }
        return z4;
    }

    public void requestExactAlarmsPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5119l;
        if (eVar != eVar2) {
            hVar.c();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a(true);
            return;
        }
        if (getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.callback.a(true);
            this.permissionRequestProgress = eVar2;
            return;
        }
        this.permissionRequestProgress = e.f5122o;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5119l;
        if (eVar != eVar2) {
            hVar.c();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT < 34) {
            hVar.a(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        getAlarmManager(this.applicationContext);
        if (notificationManager.canUseFullScreenIntent()) {
            this.callback.a(true);
            this.permissionRequestProgress = eVar2;
            return;
        }
        this.permissionRequestProgress = e.f5123p;
        this.mainActivity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationPolicyAccess(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5119l;
        if (eVar != eVar2) {
            hVar.c();
            return;
        }
        this.callback = hVar;
        if (((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            this.callback.a(true);
            this.permissionRequestProgress = eVar2;
        } else {
            this.permissionRequestProgress = e.f5121n;
            this.mainActivity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 4);
        }
    }

    public void requestNotificationsPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f5119l;
        if (eVar != eVar2) {
            hVar.c();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.a(O.a(new V(this.mainActivity).f9724b));
        } else if (i4.a.m(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.a(true);
            this.permissionRequestProgress = eVar2;
        } else {
            this.permissionRequestProgress = e.f5120m;
            i4.a.Q(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
