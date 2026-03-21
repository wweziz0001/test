package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f5151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f5152b;

    static {
        N n4 = null;
        try {
            n4 = (N) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5151a = n4;
        f5152b = new N();
    }
}
