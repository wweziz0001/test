package y3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: y3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031b extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11048a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1031b(Object obj) {
        this(obj, null);
        N3.h.e(obj, "instance");
    }

    public final boolean equals(Object obj) {
        T t4 = get();
        return t4 != 0 ? (obj instanceof C1031b) && ((C1031b) obj).get() == t4 : obj == this;
    }

    public final int hashCode() {
        return this.f11048a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031b(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        N3.h.e(obj, "instance");
        this.f11048a = System.identityHashCode(obj);
    }
}
