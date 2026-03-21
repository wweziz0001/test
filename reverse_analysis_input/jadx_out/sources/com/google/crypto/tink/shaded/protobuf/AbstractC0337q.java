package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0337q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0336p f5241a = new C0336p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0336p f5242b;

    static {
        C0336p c0336p = null;
        try {
            c0336p = (C0336p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5242b = c0336p;
    }
}
