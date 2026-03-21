package V3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends CancellationException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Z f2390l;

    public Q(String str, Throwable th, Z z4) {
        super(str);
        this.f2390l = z4;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Q) {
                Q q4 = (Q) obj;
                if (!N3.h.a(q4.getMessage(), getMessage()) || !N3.h.a(q4.f2390l, this.f2390l) || !N3.h.a(q4.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        N3.h.b(message);
        int iHashCode = (this.f2390l.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f2390l;
    }
}
