package X;

import Z1.m;
import androidx.lifecycle.InterfaceC0278u;
import androidx.lifecycle.Y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0278u f2485a;

    public c(InterfaceC0278u interfaceC0278u, Y y) {
        this.f2485a = interfaceC0278u;
        m mVar = new m(y, b.f2483e);
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0278u interfaceC0278u = this.f2485a;
        if (interfaceC0278u == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0278u.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC0278u.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0278u)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
