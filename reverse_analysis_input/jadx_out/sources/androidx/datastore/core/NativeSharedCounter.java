package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i);

    public final native int nativeGetCounterValue(long j5);

    public final native int nativeIncrementAndGetCounterValue(long j5);

    public final native int nativeTruncateFile(int i);
}
