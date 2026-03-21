package t0;

import android.net.Uri;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: t0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0838B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f9808c;

    public C0838B(int i, long j5, Uri uri) {
        this.f9806a = j5;
        this.f9807b = i;
        this.f9808c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m2.b0 a(android.net.Uri r18, java.lang.String r19) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0838B.a(android.net.Uri, java.lang.String):m2.b0");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC0360m.c(scheme.equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        String host = uri3.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? uri3 : string.endsWith("/") ? AbstractC0360m.w(string, str) : AbstractC0360m.w(string.concat("/"), str);
    }
}
