package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import b3.AbstractC0307a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4627l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0284a f4628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f4631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f4632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f4633r;

    public v(y yVar, C0284a c0284a, String str, int i, int i5, Bundle bundle) {
        this.f4633r = yVar;
        this.f4628m = c0284a;
        this.f4630o = str;
        this.f4629n = i;
        this.f4631p = i5;
        this.f4632q = bundle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        switch (this.f4627l) {
            case 0:
                C0284a c0284a = this.f4628m;
                IBinder binder = ((Messenger) c0284a.f4576a).getBinder();
                y yVar = this.f4633r;
                yVar.f4643a.mConnections.remove(binder);
                k kVar2 = new k(yVar.f4643a, this.f4630o, this.f4629n, this.f4631p, this.f4632q, c0284a);
                A a5 = yVar.f4643a;
                a5.mCurConnection = kVar2;
                String str = this.f4630o;
                C0292i c0292iOnGetRoot = a5.onGetRoot(str, this.f4631p, this.f4632q);
                kVar2.f4602h = c0292iOnGetRoot;
                a5.mCurConnection = null;
                if (c0292iOnGetRoot == null) {
                    StringBuilder sbM = AbstractC0307a.m("No root for client ", str, " from service ");
                    sbM.append(v.class.getName());
                    Log.i("MBServiceCompat", sbM.toString());
                    try {
                        c0284a.c(2, null);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                        return;
                    }
                } else {
                    try {
                        a5.mConnections.put(binder, kVar2);
                        binder.linkToDeath(kVar2, 0);
                        MediaSessionCompat$Token mediaSessionCompat$Token = a5.mSession;
                        if (mediaSessionCompat$Token != null) {
                            C0292i c0292i = kVar2.f4602h;
                            String str2 = c0292i.f4592a;
                            Bundle bundle = c0292i.f4593b;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putInt("extra_service_version", 2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", str2);
                            bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                            bundle2.putBundle("data_root_hints", bundle);
                            c0284a.c(1, bundle2);
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                        a5.mConnections.remove(binder);
                        return;
                    }
                }
                break;
            default:
                IBinder binder2 = ((Messenger) this.f4628m.f4576a).getBinder();
                y yVar2 = this.f4633r;
                yVar2.f4643a.mConnections.remove(binder2);
                Iterator<k> it = yVar2.f4643a.mPendingConnections.iterator();
                while (true) {
                    if (it.hasNext()) {
                        k next = it.next();
                        if (next.f4597c == this.f4629n) {
                            kVar = (TextUtils.isEmpty(this.f4630o) || this.f4631p <= 0) ? new k(yVar2.f4643a, next.f4595a, next.f4596b, next.f4597c, this.f4632q, this.f4628m) : null;
                            it.remove();
                        }
                    }
                }
                if (kVar == null) {
                    kVar = new k(yVar2.f4643a, this.f4630o, this.f4631p, this.f4629n, this.f4632q, this.f4628m);
                }
                yVar2.f4643a.mConnections.put(binder2, kVar);
                try {
                    binder2.linkToDeath(kVar, 0);
                } catch (RemoteException unused3) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
                break;
        }
    }

    public v(y yVar, C0284a c0284a, int i, String str, int i5, Bundle bundle) {
        this.f4633r = yVar;
        this.f4628m = c0284a;
        this.f4629n = i;
        this.f4630o = str;
        this.f4631p = i5;
        this.f4632q = bundle;
    }
}
