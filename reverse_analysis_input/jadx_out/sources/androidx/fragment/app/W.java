package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class W extends Writer {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f4324m = new StringBuilder(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4323l = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f4324m;
        if (sb.length() > 0) {
            Log.d(this.f4323l, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c5 = cArr[i + i6];
            if (c5 == '\n') {
                a();
            } else {
                this.f4324m.append(c5);
            }
        }
    }
}
