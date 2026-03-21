package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f5172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f5173b;

    static {
        V v4 = null;
        try {
            v4 = (V) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5172a = v4;
        f5173b = new V();
    }
}
