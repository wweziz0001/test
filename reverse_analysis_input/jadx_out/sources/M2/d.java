package M2;

import G2.r;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1507b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f1508a;

    public /* synthetic */ d(int i) {
        this();
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        Time time;
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        synchronized (this) {
            TimeZone timeZone = this.f1508a.getTimeZone();
            try {
                try {
                    time = new Time(this.f1508a.parse(strC).getTime());
                } catch (ParseException e5) {
                    throw new G2.h("Failed parsing '" + strC + "' as SQL Time; at path " + aVar.q(), e5);
                }
            } finally {
                this.f1508a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.p();
            return;
        }
        synchronized (this) {
            str = this.f1508a.format((Date) time);
        }
        bVar.y(str);
    }

    private d() {
        this.f1508a = new SimpleDateFormat("hh:mm:ss a");
    }
}
