package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f5128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5129b;

    static {
        Charset.forName("US-ASCII");
        f5128a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5129b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC0218j.h(bArr, 0, 0, false);
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
