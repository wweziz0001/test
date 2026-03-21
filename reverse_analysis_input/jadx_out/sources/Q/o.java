package Q;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = z.d.f11118a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f1713j != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i5 = z.d.f11118a;
            Trace.endSection();
            throw th;
        }
    }
}
