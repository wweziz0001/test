package V3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class X implements L {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2398m = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2399n = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2400o = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f2401l;

    public X(a0 a0Var, Throwable th) {
        this.f2401l = a0Var;
        this._rootCause = th;
    }

    @Override // V3.L
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            f2399n.set(this, th);
            return;
        }
        if (th == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2400o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable c() {
        return (Throwable) f2399n.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return f2398m.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2400o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0144v.f2451g);
        return arrayList;
    }

    @Override // V3.L
    public final a0 g() {
        return this.f2401l;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f2400o.get(this) + ", list=" + this.f2401l + ']';
    }
}
