package y1;

import android.database.sqlite.SQLiteProgram;
import x1.InterfaceC0988d;

/* JADX INFO: loaded from: classes.dex */
public class g implements InterfaceC0988d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SQLiteProgram f10932l;

    public g(SQLiteProgram sQLiteProgram) {
        N3.h.e(sQLiteProgram, "delegate");
        this.f10932l = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10932l.close();
    }

    @Override // x1.InterfaceC0988d
    public final void e(int i, byte[] bArr) {
        this.f10932l.bindBlob(i, bArr);
    }

    @Override // x1.InterfaceC0988d
    public final void g(int i) {
        this.f10932l.bindNull(i);
    }

    @Override // x1.InterfaceC0988d
    public final void h(String str, int i) {
        N3.h.e(str, "value");
        this.f10932l.bindString(i, str);
    }

    @Override // x1.InterfaceC0988d
    public final void i(int i, double d5) {
        this.f10932l.bindDouble(i, d5);
    }

    @Override // x1.InterfaceC0988d
    public final void m(long j5, int i) {
        this.f10932l.bindLong(i, j5);
    }
}
