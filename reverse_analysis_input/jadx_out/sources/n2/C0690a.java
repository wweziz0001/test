package n2;

import java.io.OutputStream;

/* JADX INFO: renamed from: n2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) {
        bArr.getClass();
        D1.b.p(i, i5 + i, bArr.length);
    }
}
