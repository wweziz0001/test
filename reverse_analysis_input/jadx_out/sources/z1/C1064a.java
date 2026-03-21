package z1;

import N3.h;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: z1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f11141e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f11144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f11145d;

    public C1064a(String str, File file, boolean z4) {
        Lock lock;
        this.f11142a = z4;
        File file2 = new File(file, str.concat(".lck"));
        this.f11143b = file2;
        String absolutePath = file2.getAbsolutePath();
        h.d(absolutePath, "lockFile.absolutePath");
        HashMap map = f11141e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11144c = lock;
    }

    public final void a(boolean z4) {
        this.f11144c.lock();
        if (z4) {
            File file = this.f11143b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f11145d = channel;
            } catch (IOException e5) {
                this.f11145d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f11145d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f11144c.unlock();
    }
}
