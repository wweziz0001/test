package f0;

import a.AbstractC0149a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: f0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0425t extends C0414i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5723n;

    public C0425t() {
        super(2008);
        this.f5723n = 1;
    }

    public static int a(int i, int i5) {
        if (i == 2000 && i5 == 1) {
            return 2001;
        }
        return i;
    }

    public static C0425t b(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0149a.I(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i5 == 2007 ? new C0424s("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new C0425t(iOException, i5, i);
    }

    public C0425t(String str, int i) {
        super(str, a(i, 1));
        this.f5723n = 1;
    }

    public C0425t(IOException iOException, int i, int i5) {
        super(iOException, a(i, i5));
        this.f5723n = i5;
    }

    public C0425t(String str, IOException iOException, int i) {
        super(str, iOException, a(i, 1));
        this.f5723n = 1;
    }
}
