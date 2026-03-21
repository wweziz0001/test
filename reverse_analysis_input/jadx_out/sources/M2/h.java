package M2;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f1514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f1515d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f1512a = z4;
        if (!z4) {
            f1513b = null;
            f1514c = null;
            f1515d = null;
        } else {
            new g(Date.class, 0);
            new g(Timestamp.class, 1);
            f1513b = b.f1505b;
            f1514c = d.f1507b;
            f1515d = f.f1509b;
        }
    }
}
