package h0;

import a0.C0190p;

/* JADX INFO: loaded from: classes.dex */
public interface q0 {
    static int b(int i) {
        return i & 384;
    }

    static int c(int i) {
        return i & 64;
    }

    static int e(int i, int i5, int i6, int i7) {
        return i | i5 | i6 | 128 | i7;
    }

    static boolean g(int i, boolean z4) {
        int i5 = i & 7;
        return i5 == 4 || (z4 && i5 == 3);
    }

    void clearListener();

    String getName();

    int getTrackType();

    void setListener(p0 p0Var);

    int supportsFormat(C0190p c0190p);

    int supportsMixedMimeTypeAdaptation();
}
