package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9187d;

    public j(int i, int i5, long j5, long j6) {
        this.f9184a = i;
        this.f9185b = i5;
        this.f9186c = j5;
        this.f9187d = j6;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9184a);
            dataOutputStream.writeInt(this.f9185b);
            dataOutputStream.writeLong(this.f9186c);
            dataOutputStream.writeLong(this.f9187d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9185b == jVar.f9185b && this.f9186c == jVar.f9186c && this.f9184a == jVar.f9184a && this.f9187d == jVar.f9187d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9185b), Long.valueOf(this.f9186c), Integer.valueOf(this.f9184a), Long.valueOf(this.f9187d));
    }
}
