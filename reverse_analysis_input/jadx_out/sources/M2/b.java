package M2;

import G2.r;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1505b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f1506a;

    public /* synthetic */ b(int i) {
        this();
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        Date date;
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        synchronized (this) {
            TimeZone timeZone = this.f1506a.getTimeZone();
            try {
                try {
                    date = new Date(this.f1506a.parse(strC).getTime());
                } catch (ParseException e5) {
                    throw new G2.h("Failed parsing '" + strC + "' as SQL Date; at path " + aVar.q(), e5);
                }
            } finally {
                this.f1506a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.p();
            return;
        }
        synchronized (this) {
            str = this.f1506a.format((java.util.Date) date);
        }
        bVar.y(str);
    }

    private b() {
        this.f1506a = new SimpleDateFormat("MMM d, yyyy");
    }
}
