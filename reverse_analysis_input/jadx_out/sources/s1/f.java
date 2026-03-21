package s1;

import A0.p;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C0715f;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f9570m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f9571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f9574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9575e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f9576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile y1.h f9577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f9578h;
    public final C0715f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f9579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f9580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A.b f9581l;

    public f(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f9571a = workDatabase_Impl;
        this.f9572b = map;
        this.f9578h = new p(strArr.length);
        N3.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new C0715f();
        this.f9579j = new Object();
        this.f9580k = new Object();
        this.f9573c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            N3.h.d(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            N3.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f9573c.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f9572b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                N3.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f9574d = strArr2;
        for (Map.Entry entry : this.f9572b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            N3.h.d(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            N3.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f9573c.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                N3.h.d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f9573c;
                N3.h.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.f9581l = new A.b(this, 12);
    }

    public final boolean a() {
        C1002b c1002b = this.f9571a.f4783a;
        if (!N3.h.a(c1002b != null ? Boolean.valueOf(c1002b.f10911l.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f9576f) {
            this.f9571a.h().j();
        }
        if (this.f9576f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C1002b c1002b, int i) {
        c1002b.k("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f9574d[i];
        String[] strArr = f9570m;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Z1.f.u(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            N3.h.d(str3, "StringBuilder().apply(builderAction).toString()");
            c1002b.k(str3);
        }
    }

    public final void c(C1002b c1002b) {
        N3.h.e(c1002b, "database");
        if (c1002b.n()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f9571a.f4790h.readLock();
            N3.h.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f9579j) {
                    int[] iArrB = this.f9578h.b();
                    if (iArrB == null) {
                        return;
                    }
                    if (c1002b.o()) {
                        c1002b.b();
                    } else {
                        c1002b.a();
                    }
                    try {
                        int length = iArrB.length;
                        int i = 0;
                        int i5 = 0;
                        while (i < length) {
                            int i6 = iArrB[i];
                            int i7 = i5 + 1;
                            if (i6 == 1) {
                                b(c1002b, i5);
                            } else if (i6 == 2) {
                                String str = this.f9574d[i5];
                                String[] strArr = f9570m;
                                for (int i8 = 0; i8 < 3; i8++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + Z1.f.u(str, strArr[i8]);
                                    N3.h.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    c1002b.k(str2);
                                }
                            }
                            i++;
                            i5 = i7;
                        }
                        c1002b.r();
                        c1002b.f();
                    } catch (Throwable th) {
                        c1002b.f();
                        throw th;
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e5) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
        } catch (IllegalStateException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        }
    }
}
