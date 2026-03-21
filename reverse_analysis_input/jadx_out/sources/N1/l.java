package N1;

import C3.n;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class l implements L1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f1597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1598d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1600b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f1599a = jVar;
        if (jVar != null) {
            jVar.h(new B0.d(this));
        }
    }

    @Override // L1.a
    public final void a(K1.i iVar) {
        synchronized (f1598d) {
            try {
                if (this.f1599a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (k kVar : this.f1600b) {
                    if (kVar.f1595b == iVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f1600b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((k) it.next()).f1594a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1600b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()).f1594a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    j jVar = this.f1599a;
                    if (jVar != null) {
                        jVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
    @Override // L1.a
    public final void b(Context context, D0.j jVar, K1.i iVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        B3.g gVar = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        n nVar = n.f291l;
        if (activity != null) {
            ReentrantLock reentrantLock = f1598d;
            reentrantLock.lock();
            try {
                j jVar2 = this.f1599a;
                if (jVar2 == null) {
                    iVar.accept(new K1.l(nVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1600b;
                boolean z4 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f1594a.equals(activity)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, jVar, iVar);
                copyOnWriteArrayList.add(kVar);
                if (z4) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (activity.equals(((k) next).f1594a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) next;
                    K1.l lVar = kVar2 != null ? kVar2.f1596c : null;
                    if (lVar != null) {
                        kVar.f1596c = lVar;
                        kVar.f1595b.accept(lVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar2.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar2, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = B3.g.f275a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            iVar.accept(new K1.l(nVar));
        }
    }
}
