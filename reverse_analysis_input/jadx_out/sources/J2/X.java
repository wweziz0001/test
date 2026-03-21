package J2;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class X extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        int iW;
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        aVar.b();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (aVar.E() != 4) {
            String strY = aVar.y();
            iW = aVar.w();
            strY.getClass();
            switch (strY) {
                case "dayOfMonth":
                    i6 = iW;
                    break;
                case "minute":
                    i8 = iW;
                    break;
                case "second":
                    i9 = iW;
                    break;
                case "year":
                    i = iW;
                    break;
                case "month":
                    i5 = iW;
                    break;
                case "hourOfDay":
                    i7 = iW;
                    break;
            }
        }
        aVar.l();
        return new GregorianCalendar(i, i5, i6, i7, i8, i9);
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            bVar.p();
            return;
        }
        bVar.c();
        bVar.n("year");
        bVar.v(r4.get(1));
        bVar.n("month");
        bVar.v(r4.get(2));
        bVar.n("dayOfMonth");
        bVar.v(r4.get(5));
        bVar.n("hourOfDay");
        bVar.v(r4.get(11));
        bVar.n("minute");
        bVar.v(r4.get(12));
        bVar.n("second");
        bVar.v(r4.get(13));
        bVar.l();
    }
}
