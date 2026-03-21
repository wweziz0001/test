package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4218b;

    static {
        Charset.forName("US-ASCII");
        f4217a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4218b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0216h(bArr, 0, 0, false).l(0);
        } catch (C0233z e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }
}
