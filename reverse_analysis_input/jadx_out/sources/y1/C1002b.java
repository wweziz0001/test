package y1;

import F0.p;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;
import x1.InterfaceC0989e;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1002b implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f10909n = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f10910o = new String[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SQLiteDatabase f10911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f10912m;

    public C1002b(SQLiteDatabase sQLiteDatabase) {
        N3.h.e(sQLiteDatabase, "delegate");
        this.f10911l = sQLiteDatabase;
        this.f10912m = sQLiteDatabase.getAttachedDbs();
    }

    public final void a() {
        this.f10911l.beginTransaction();
    }

    public final void b() {
        this.f10911l.beginTransactionNonExclusive();
    }

    public final h c(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f10911l.compileStatement(str);
        N3.h.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10911l.close();
    }

    public final void f() {
        this.f10911l.endTransaction();
    }

    public final void k(String str) {
        N3.h.e(str, "sql");
        this.f10911l.execSQL(str);
    }

    public final void l(Object[] objArr) {
        this.f10911l.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean n() {
        return this.f10911l.inTransaction();
    }

    public final boolean o() {
        SQLiteDatabase sQLiteDatabase = this.f10911l;
        N3.h.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor p(String str) {
        N3.h.e(str, "query");
        return q(new p(str, 3));
    }

    public final Cursor q(InterfaceC0989e interfaceC0989e) {
        Cursor cursorRawQueryWithFactory = this.f10911l.rawQueryWithFactory(new T2.c(new C1001a(interfaceC0989e), 2), interfaceC0989e.a(), f10910o, null);
        N3.h.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final void r() {
        this.f10911l.setTransactionSuccessful();
    }
}
