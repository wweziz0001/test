package t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0295b;
import b.C0294a;
import b.InterfaceC0296c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f9714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f9715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f9716n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashSet f9717o = new HashSet();

    public U(Context context) {
        this.f9714l = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f9715m = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(T t4) {
        boolean z4;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = t4.f9709a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + t4.f9712d.size() + " queued tasks");
        }
        if (t4.f9712d.isEmpty()) {
            return;
        }
        if (t4.f9710b) {
            z4 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f9714l;
            boolean zBindService = context.bindService(component, this, 33);
            t4.f9710b = zBindService;
            if (zBindService) {
                t4.f9713e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z4 = t4.f9710b;
        }
        if (!z4 || t4.f9711c == null) {
            b(t4);
            return;
        }
        while (true) {
            arrayDeque = t4.f9712d;
            Q q4 = (Q) arrayDeque.peek();
            if (q4 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + q4);
                }
                q4.a(t4.f9711c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e5) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e5);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(t4);
    }

    public final void b(T t4) {
        Handler handler = this.f9715m;
        ComponentName componentName = t4.f9709a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = t4.f9713e;
        int i5 = i + 1;
        t4.f9713e = i5;
        if (i5 <= 6) {
            int i6 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i6);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = t4.f9712d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(t4.f9713e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC0296c interfaceC0296c = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    T t4 = (T) this.f9716n.get((ComponentName) message.obj);
                    if (t4 != null) {
                        a(t4);
                    }
                    return true;
                }
                T t5 = (T) this.f9716n.get((ComponentName) message.obj);
                if (t5 != null) {
                    if (t5.f9710b) {
                        this.f9714l.unbindService(this);
                        t5.f9710b = false;
                    }
                    t5.f9711c = null;
                }
                return true;
            }
            S s4 = (S) message.obj;
            ComponentName componentName = s4.f9707a;
            IBinder iBinder = s4.f9708b;
            T t6 = (T) this.f9716n.get(componentName);
            if (t6 != null) {
                int i5 = AbstractBinderC0295b.f4823c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0296c.f4824a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0296c)) {
                        C0294a c0294a = new C0294a();
                        c0294a.f4822c = iBinder;
                        interfaceC0296c = c0294a;
                    } else {
                        interfaceC0296c = (InterfaceC0296c) iInterfaceQueryLocalInterface;
                    }
                }
                t6.f9711c = interfaceC0296c;
                t6.f9713e = 0;
                a(t6);
            }
            return true;
        }
        Q q4 = (Q) message.obj;
        String string = Settings.Secure.getString(this.f9714l.getContentResolver(), "enabled_notification_listeners");
        synchronized (V.f9718c) {
            if (string != null) {
                try {
                    if (!string.equals(V.f9719d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        V.f9720e = hashSet2;
                        V.f9719d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = V.f9720e;
        }
        if (!hashSet.equals(this.f9717o)) {
            this.f9717o = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.f9714l.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet3) {
                if (!this.f9716n.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f9716n.put(componentName3, new T(componentName3));
                }
            }
            Iterator it = this.f9716n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    T t7 = (T) entry.getValue();
                    if (t7.f9710b) {
                        this.f9714l.unbindService(this);
                        t7.f9710b = false;
                    }
                    t7.f9711c = null;
                    it.remove();
                }
            }
        }
        for (T t8 : this.f9716n.values()) {
            t8.f9712d.add(q4);
            a(t8);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f9715m.obtainMessage(1, new S(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f9715m.obtainMessage(2, componentName).sendToTarget();
    }
}
