package T2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f2192n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2197e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f2200h;
    public SQLiteDatabase i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f2203l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2198f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2199g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2201j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2202k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2204m = 0;

    public e(Context context, String str, int i, boolean z4, int i5) {
        this.f2197e = context;
        this.f2194b = str;
        this.f2193a = z4;
        this.f2195c = i;
        this.f2196d = i5;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i = 0; i < columnCount; i++) {
                int type = cursor.getType(i);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i) : cursor.getString(i) : Double.valueOf(cursor.getDouble(i)) : Long.valueOf(cursor.getLong(i)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void a() {
        HashMap map = this.f2199g;
        if (!map.isEmpty() && a.a(this.f2196d)) {
            Log.d("Sqflite", h() + map.size() + " cursor(s) are left opened");
        }
        this.i.close();
    }

    public final void b(j jVar) {
        try {
            int i = jVar.f2220a;
            if (a.b(this.f2196d)) {
                Log.d("Sqflite", h() + "closing cursor " + i);
            }
            this.f2199g.remove(Integer.valueOf(i));
            jVar.f2222c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(Z1.f r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.d(Z1.f):boolean");
    }

    public final boolean e(Z1.f fVar) throws Throwable {
        Cursor cursorRawQueryWithFactory;
        Integer num = (Integer) fVar.p("cursorPageSize");
        String str = (String) fVar.p("sql");
        o oVar = new o(str, (List) fVar.p("arguments"));
        if (a.a(this.f2196d)) {
            Log.d("Sqflite", h() + oVar);
        }
        j jVar = null;
        try {
            cursorRawQueryWithFactory = this.i.rawQueryWithFactory(new c(oVar, 0), str, a.f2186a, null);
            try {
                try {
                    HashMap mapC = c(cursorRawQueryWithFactory, num);
                    if (num != null && !cursorRawQueryWithFactory.isLast() && !cursorRawQueryWithFactory.isAfterLast()) {
                        int i = this.f2204m + 1;
                        this.f2204m = i;
                        mapC.put("cursorId", Integer.valueOf(i));
                        j jVar2 = new j(i, num.intValue(), cursorRawQueryWithFactory);
                        try {
                            this.f2199g.put(Integer.valueOf(i), jVar2);
                            jVar = jVar2;
                        } catch (Exception e5) {
                            e = e5;
                            jVar = jVar2;
                            i(e, fVar);
                            if (jVar != null) {
                                b(jVar);
                            }
                            if (jVar != null || cursorRawQueryWithFactory == null) {
                                return false;
                            }
                            cursorRawQueryWithFactory.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            jVar = jVar2;
                            if (jVar == null && cursorRawQueryWithFactory != null) {
                                cursorRawQueryWithFactory.close();
                            }
                            throw th;
                        }
                    }
                    fVar.d(mapC);
                    if (jVar == null) {
                        cursorRawQueryWithFactory.close();
                    }
                    return true;
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
            cursorRawQueryWithFactory = null;
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryWithFactory = null;
        }
    }

    public final boolean f(Z1.f fVar) throws Throwable {
        if (!g(fVar)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (fVar.r()) {
                fVar.d(null);
                return true;
            }
            try {
                Cursor cursorRawQuery = this.i.rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i = cursorRawQuery.getInt(0);
                            if (a.a(this.f2196d)) {
                                Log.d("Sqflite", h() + "changed " + i);
                            }
                            fVar.d(Integer.valueOf(i));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        cursor = cursorRawQuery;
                        i(e, fVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                fVar.d(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final boolean g(Z1.f fVar) {
        String str = (String) fVar.p("sql");
        o oVar = new o(str, (List) fVar.p("arguments"));
        if (a.a(this.f2196d)) {
            Log.d("Sqflite", h() + oVar);
        }
        Object objP = fVar.p("inTransaction");
        Boolean bool = objP instanceof Boolean ? (Boolean) objP : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.i;
            ArrayList arrayList = new ArrayList();
            List list = oVar.f2253b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(o.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f2201j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f2201j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e5) {
            i(e5, fVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        sb.append(this.f2195c + "," + threadCurrentThread.getName() + "(" + p.a(threadCurrentThread) + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, Z1.f fVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.b("open_failed " + this.f2194b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) fVar.p("sql");
            Collection arrayList = (List) fVar.p("arguments");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("sql", str);
            map.put("arguments", arrayList);
            fVar.b(message, map);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) fVar.p("sql");
        Collection arrayList2 = (List) fVar.p("arguments");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        HashMap map2 = new HashMap();
        map2.put("sql", str2);
        map2.put("arguments", arrayList2);
        fVar.b(message2, map2);
    }

    public final synchronized boolean j() {
        return this.f2201j > 0;
    }

    public final void k() {
        if (f2192n == null) {
            Context context = this.f2197e;
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            f2192n = Boolean.valueOf(z4);
            if (z4 && a.b(this.f2196d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.f2194b, null, f2192n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(U2.c cVar, Runnable runnable) {
        Integer num = (Integer) cVar.p("transactionId");
        Integer num2 = this.f2203l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f2198f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new U2.e(runnable));
            return;
        }
        runnable.run();
        if (this.f2203l != null || arrayList.isEmpty()) {
            return;
        }
        this.f2200h.a(this, new A3.c(this, 5));
    }
}
