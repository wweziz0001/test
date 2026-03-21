package a1;

import F0.C;
import F0.s;
import Q1.D;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import com.example.hqp_mobile_app.R;
import d0.C0368u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l1.E;
import l1.InterfaceC0568A;
import q.C0736f;
import t.AbstractC0809G;
import t.AbstractC0810H;
import t.AbstractC0811I;
import t.C0823l;
import t.C0833w;
import t.J;
import t.K;
import t.L;
import t.M;
import t.N;
import t.W;
import t.X;
import t.c0;
import t.r;
import x.AbstractC0953b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0568A {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f3516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f3519p;

    public j(r rVar) {
        Notification notification;
        String str;
        ArrayList<X> arrayList;
        Bundle[] bundleArr;
        Notification notification2;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        C0823l c0823lJ;
        int i;
        j jVar = this;
        new ArrayList();
        jVar.f3519p = new Bundle();
        jVar.f3518o = rVar;
        Context context = rVar.f9769a;
        jVar.f3516m = context;
        int i5 = Build.VERSION.SDK_INT;
        String str3 = rVar.f9761A;
        if (i5 >= 26) {
            jVar.f3517n = K.a(context, str3);
        } else {
            jVar.f3517n = new Notification.Builder(rVar.f9769a);
        }
        Notification notification3 = rVar.f9766F;
        ((Notification.Builder) jVar.f3517n).setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(rVar.f9773e).setContentText(rVar.f9774f).setContentInfo(null).setContentIntent(rVar.f9775g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(rVar.f9776h, (notification3.flags & 128) != 0).setNumber(rVar.f9777j).setProgress(rVar.f9783p, rVar.f9784q, rVar.f9785r);
        Notification.Builder builder = (Notification.Builder) jVar.f3517n;
        IconCompat iconCompat = rVar.i;
        AbstractC0811I.b(builder, iconCompat == null ? null : AbstractC0953b.f(iconCompat, context));
        ((Notification.Builder) jVar.f3517n).setSubText(rVar.f9782o).setUsesChronometer(rVar.f9780m).setPriority(rVar.f9778k);
        D d5 = rVar.f9781n;
        if (d5 instanceof C0833w) {
            C0833w c0833w = (C0833w) d5;
            PendingIntent pendingIntent = c0833w.f9796h;
            C0823l c0823lJ2 = pendingIntent == null ? c0833w.j(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, c0833w.f9799l, R.color.call_notification_decline_color, c0833w.i) : c0833w.j(R.drawable.ic_call_decline, R.string.call_notification_decline_action, c0833w.f9799l, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = c0833w.f9795g;
            if (pendingIntent2 == null) {
                c0823lJ = null;
            } else {
                boolean z4 = c0833w.f9797j;
                c0823lJ = c0833w.j(z4 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z4 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, c0833w.f9798k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(c0823lJ2);
            ArrayList<C0823l> arrayList5 = ((r) c0833w.f1788b).f9770b;
            if (arrayList5 != null) {
                i = 2;
                for (C0823l c0823l : arrayList5) {
                    if (c0823l.f9752g) {
                        arrayList4.add(c0823l);
                    } else if (!c0823l.f9746a.getBoolean("key_action_priority") && i > 1) {
                        arrayList4.add(c0823l);
                        i--;
                    }
                    if (c0823lJ != null && i == 1) {
                        arrayList4.add(c0823lJ);
                        i--;
                    }
                }
            } else {
                i = 2;
            }
            if (c0823lJ != null && i >= 1) {
                arrayList4.add(c0823lJ);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                jVar.a((C0823l) it.next());
            }
        } else {
            Iterator it2 = rVar.f9770b.iterator();
            while (it2.hasNext()) {
                jVar.a((C0823l) it2.next());
            }
        }
        Bundle bundle = rVar.f9791x;
        if (bundle != null) {
            ((Bundle) jVar.f3519p).putAll(bundle);
        }
        int i6 = Build.VERSION.SDK_INT;
        ((Notification.Builder) jVar.f3517n).setShowWhen(rVar.f9779l);
        AbstractC0809G.i((Notification.Builder) jVar.f3517n, false);
        AbstractC0809G.g((Notification.Builder) jVar.f3517n, rVar.f9786s);
        AbstractC0809G.j((Notification.Builder) jVar.f3517n, null);
        AbstractC0809G.h((Notification.Builder) jVar.f3517n, rVar.f9787t);
        jVar.f3515l = rVar.f9764D;
        AbstractC0810H.b((Notification.Builder) jVar.f3517n, rVar.f9790w);
        AbstractC0810H.c((Notification.Builder) jVar.f3517n, rVar.y);
        AbstractC0810H.f((Notification.Builder) jVar.f3517n, rVar.f9792z);
        AbstractC0810H.d((Notification.Builder) jVar.f3517n, null);
        AbstractC0810H.e((Notification.Builder) jVar.f3517n, notification3.sound, notification3.audioAttributes);
        ArrayList arrayList6 = rVar.f9768H;
        ArrayList<X> arrayList7 = rVar.f9771c;
        if (i6 < 28) {
            if (arrayList7 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList7.size());
                for (X x4 : arrayList7) {
                    String str4 = x4.f9727c;
                    if (str4 == null) {
                        CharSequence charSequence = x4.f9725a;
                        str4 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList3.add(str4);
                }
            }
            if (arrayList3 != null) {
                if (arrayList6 == null) {
                    arrayList6 = arrayList3;
                } else {
                    C0736f c0736f = new C0736f(arrayList6.size() + arrayList3.size());
                    c0736f.addAll(arrayList3);
                    c0736f.addAll(arrayList6);
                    arrayList6 = new ArrayList(c0736f);
                }
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                AbstractC0810H.a((Notification.Builder) jVar.f3517n, (String) it3.next());
            }
        }
        ArrayList arrayList8 = rVar.f9772d;
        if (arrayList8.size() > 0) {
            if (rVar.f9791x == null) {
                rVar.f9791x = new Bundle();
            }
            Bundle bundle2 = rVar.f9791x.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList8.size()) {
                String string = Integer.toString(i7);
                C0823l c0823l2 = (C0823l) arrayList8.get(i7);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = c0823l2.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.h() : 0);
                bundle5.putCharSequence("title", c0823l2.i);
                bundle5.putParcelable("actionIntent", c0823l2.f9754j);
                Bundle bundle6 = c0823l2.f9746a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                ArrayList arrayList9 = arrayList8;
                bundle7.putBoolean("android.support.allowGeneratedReplies", c0823l2.f9749d);
                bundle5.putBundle("extras", bundle7);
                c0[] c0VarArr = c0823l2.f9748c;
                if (c0VarArr == null) {
                    notification2 = notification3;
                    str2 = str3;
                    arrayList2 = arrayList7;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[c0VarArr.length];
                    notification2 = notification3;
                    arrayList2 = arrayList7;
                    int i8 = 0;
                    while (i8 < c0VarArr.length) {
                        c0 c0Var = c0VarArr[i8];
                        c0[] c0VarArr2 = c0VarArr;
                        Bundle bundle8 = new Bundle();
                        c0Var.getClass();
                        String str5 = str3;
                        bundle8.putString("resultKey", "FlutterLocalNotificationsPluginInputResult");
                        bundle8.putCharSequence("label", c0Var.f9732a);
                        bundle8.putCharSequenceArray("choices", c0Var.f9733b);
                        bundle8.putBoolean("allowFreeFormInput", c0Var.f9734c);
                        bundle8.putBundle("extras", c0Var.f9735d);
                        HashSet hashSet = c0Var.f9736e;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList10.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i8] = bundle8;
                        i8++;
                        c0VarArr = c0VarArr2;
                        str3 = str5;
                    }
                    str2 = str3;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", c0823l2.f9750e);
                bundle5.putInt("semanticAction", c0823l2.f9751f);
                bundle4.putBundle(string, bundle5);
                i7++;
                arrayList8 = arrayList9;
                notification3 = notification2;
                arrayList7 = arrayList2;
                str3 = str2;
            }
            notification = notification3;
            str = str3;
            arrayList = arrayList7;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (rVar.f9791x == null) {
                rVar.f9791x = new Bundle();
            }
            rVar.f9791x.putBundle("android.car.EXTENSIONS", bundle2);
            jVar = this;
            ((Bundle) jVar.f3519p).putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            notification = notification3;
            str = str3;
            arrayList = arrayList7;
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) jVar.f3517n).setExtras(rVar.f9791x);
        J.e((Notification.Builder) jVar.f3517n, null);
        if (i9 >= 26) {
            K.b((Notification.Builder) jVar.f3517n, 0);
            K.e((Notification.Builder) jVar.f3517n, null);
            K.f((Notification.Builder) jVar.f3517n, rVar.f9762B);
            K.g((Notification.Builder) jVar.f3517n, rVar.f9763C);
            K.d((Notification.Builder) jVar.f3517n, rVar.f9764D);
            if (rVar.f9789v) {
                K.c((Notification.Builder) jVar.f3517n, rVar.f9788u);
            }
            if (!TextUtils.isEmpty(str)) {
                ((Notification.Builder) jVar.f3517n).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            for (X x5 : arrayList) {
                Notification.Builder builder2 = (Notification.Builder) jVar.f3517n;
                x5.getClass();
                L.a(builder2, W.b(x5));
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            M.a((Notification.Builder) jVar.f3517n, rVar.f9765E);
            M.b((Notification.Builder) jVar.f3517n, null);
        }
        if (rVar.f9767G) {
            if (((r) jVar.f3518o).f9787t) {
                jVar.f3515l = 2;
            } else {
                jVar.f3515l = 1;
            }
            ((Notification.Builder) jVar.f3517n).setVibrate(null);
            ((Notification.Builder) jVar.f3517n).setSound(null);
            Notification notification4 = notification;
            int i11 = notification4.defaults & (-4);
            notification4.defaults = i11;
            ((Notification.Builder) jVar.f3517n).setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(((r) jVar.f3518o).f9786s)) {
                    AbstractC0809G.g((Notification.Builder) jVar.f3517n, "silent");
                }
                K.d((Notification.Builder) jVar.f3517n, jVar.f3515l);
            }
        }
    }

    public void a(C0823l c0823l) {
        IconCompat iconCompatA = c0823l.a();
        Notification.Action.Builder builderA = AbstractC0811I.a(iconCompatA != null ? AbstractC0953b.f(iconCompatA, null) : null, c0823l.i, c0823l.f9754j);
        c0[] c0VarArr = c0823l.f9748c;
        if (c0VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[c0VarArr.length];
            for (int i = 0; i < c0VarArr.length; i++) {
                remoteInputArr[i] = c0.a(c0VarArr[i]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                AbstractC0809G.c(builderA, remoteInput);
            }
        }
        Bundle bundle = c0823l.f9746a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z4 = c0823l.f9749d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
        int i5 = Build.VERSION.SDK_INT;
        J.a(builderA, z4);
        int i6 = c0823l.f9751f;
        bundle2.putInt("android.support.action.semanticAction", i6);
        if (i5 >= 28) {
            L.b(builderA, i6);
        }
        if (i5 >= 29) {
            M.c(builderA, c0823l.f9752g);
        }
        if (i5 >= 31) {
            N.a(builderA, false);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", c0823l.f9750e);
        AbstractC0809G.b(builderA, bundle2);
        AbstractC0809G.a((Notification.Builder) this.f3517n, AbstractC0809G.d(builderA));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    @Override // l1.InterfaceC0568A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(d0.C0363p r36) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.j.b(d0.p):void");
    }

    public j(C c5, B0.d dVar, byte[] bArr, F0.N[] nArr, int i) {
        this.f3516m = c5;
        this.f3517n = dVar;
        this.f3518o = bArr;
        this.f3519p = nArr;
        this.f3515l = i;
    }

    public j(l1.C c5, int i) {
        this.f3519p = c5;
        this.f3516m = new F0.M(5, new byte[5]);
        this.f3517n = new SparseArray();
        this.f3518o = new SparseIntArray();
        this.f3515l = i;
    }

    @Override // l1.InterfaceC0568A
    public void c(C0368u c0368u, s sVar, E e5) {
    }
}
