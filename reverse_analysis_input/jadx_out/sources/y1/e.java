package y1;

import O.i;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m3.C0675i;
import z1.C1064a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10917s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f10918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0675i f10919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D0.d f10920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1064a f10923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10924r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, final C0675i c0675i, final D0.d dVar, boolean z4) {
        super(context, str, null, dVar.f394l, new DatabaseErrorHandler() { // from class: y1.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                N3.h.e(dVar, "$callback");
                C0675i c0675i2 = c0675i;
                int i = e.f10917s;
                N3.h.d(sQLiteDatabase, "dbObj");
                C1002b c1002bG = D1.b.G(c0675i2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c1002bG + ".path");
                SQLiteDatabase sQLiteDatabase2 = c1002bG.f10911l;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        D0.d.g(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = c1002bG.f10912m;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c1002bG.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            N3.h.d(obj, "p.second");
                            D0.d.g((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            D0.d.g(path2);
                        }
                    }
                }
            }
        });
        N3.h.e(dVar, "callback");
        this.f10918l = context;
        this.f10919m = c0675i;
        this.f10920n = dVar;
        this.f10921o = z4;
        if (str == null) {
            str = UUID.randomUUID().toString();
            N3.h.d(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        N3.h.d(cacheDir, "context.cacheDir");
        this.f10923q = new C1064a(str, cacheDir, false);
    }

    public final C1002b a(boolean z4) {
        C1064a c1064a = this.f10923q;
        try {
            c1064a.a((this.f10924r || getDatabaseName() == null) ? false : true);
            this.f10922p = false;
            SQLiteDatabase sQLiteDatabaseF = f(z4);
            if (!this.f10922p) {
                C1002b c1002bB = b(sQLiteDatabaseF);
                c1064a.b();
                return c1002bB;
            }
            close();
            C1002b c1002bA = a(z4);
            c1064a.b();
            return c1002bA;
        } catch (Throwable th) {
            c1064a.b();
            throw th;
        }
    }

    public final C1002b b(SQLiteDatabase sQLiteDatabase) {
        N3.h.e(sQLiteDatabase, "sqLiteDatabase");
        return D1.b.G(this.f10919m, sQLiteDatabase);
    }

    public final SQLiteDatabase c(boolean z4) {
        if (z4) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            N3.h.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        N3.h.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C1064a c1064a = this.f10923q;
        try {
            c1064a.a(c1064a.f11142a);
            super.close();
            this.f10919m.f8712m = null;
            this.f10924r = false;
        } finally {
            c1064a.b();
        }
    }

    public final SQLiteDatabase f(boolean z4) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f10918l;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return c(z4);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return c(z4);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C1004d) {
                    C1004d c1004d = th;
                    int iB = i.b(c1004d.f10915l);
                    Throwable th2 = c1004d.f10916m;
                    if (iB == 0 || iB == 1 || iB == 2 || iB == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f10921o) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return c(z4);
                } catch (C1004d e5) {
                    throw e5.f10916m;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        N3.h.e(sQLiteDatabase, "db");
        try {
            D0.d dVar = this.f10920n;
            b(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C1004d(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        N3.h.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f10920n.l(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1004d(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        N3.h.e(sQLiteDatabase, "db");
        this.f10922p = true;
        try {
            this.f10920n.n(b(sQLiteDatabase), i, i5);
        } catch (Throwable th) {
            throw new C1004d(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        N3.h.e(sQLiteDatabase, "db");
        if (!this.f10922p) {
            try {
                this.f10920n.m(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C1004d(5, th);
            }
        }
        this.f10924r = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        N3.h.e(sQLiteDatabase, "sqLiteDatabase");
        this.f10922p = true;
        try {
            this.f10920n.n(b(sQLiteDatabase), i, i5);
        } catch (Throwable th) {
            throw new C1004d(3, th);
        }
    }
}
