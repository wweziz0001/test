package T2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;
import x1.InterfaceC0989e;
import y1.C1001a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2191b;

    public /* synthetic */ c(Object obj, int i) {
        this.f2190a = i;
        this.f2191b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f2190a) {
            case 0:
                List list = ((o) this.f2191b).f2253b;
                if (list != null) {
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        Object objA = o.a(list.get(i));
                        int i5 = i + 1;
                        if (objA == null) {
                            sQLiteQuery.bindNull(i5);
                        } else if (objA instanceof byte[]) {
                            sQLiteQuery.bindBlob(i5, (byte[]) objA);
                        } else if (objA instanceof Double) {
                            sQLiteQuery.bindDouble(i5, ((Double) objA).doubleValue());
                        } else if (objA instanceof Integer) {
                            sQLiteQuery.bindLong(i5, ((Integer) objA).intValue());
                        } else if (objA instanceof Long) {
                            sQLiteQuery.bindLong(i5, ((Long) objA).longValue());
                        } else if (objA instanceof String) {
                            sQLiteQuery.bindString(i5, (String) objA);
                        } else {
                            if (!(objA instanceof Boolean)) {
                                throw new IllegalArgumentException("Could not bind " + objA + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                            }
                            sQLiteQuery.bindLong(i5, ((Boolean) objA).booleanValue() ? 1L : 0L);
                        }
                        i = i5;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 1:
                InterfaceC0989e interfaceC0989e = (InterfaceC0989e) this.f2191b;
                N3.h.b(sQLiteQuery);
                interfaceC0989e.b(new y1.g(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                C1001a c1001a = (C1001a) this.f2191b;
                N3.h.b(sQLiteQuery);
                c1001a.f10908m.b(new y1.g(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
