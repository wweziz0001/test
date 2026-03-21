package r0;

import Q1.C;
import T0.h;
import a0.C0190p;
import b3.AbstractC0307a;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0748a f9408a = new C0748a();

    public final C a(C0190p c0190p) {
        String str = c0190p.f3424n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new P0.b(0);
                case "application/x-icy":
                    return new S0.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new P0.b(1);
                case "application/x-scte35":
                    return new V0.c();
            }
        }
        throw new IllegalArgumentException(AbstractC0307a.j("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C0190p c0190p) {
        String str = c0190p.f3424n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
