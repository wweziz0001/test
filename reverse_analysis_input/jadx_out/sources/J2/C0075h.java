package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: renamed from: J2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075h extends G2.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0072e f1127c = new C0072e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0074g f1128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1129b;

    public C0075h(AbstractC0074g abstractC0074g) {
        ArrayList arrayList = new ArrayList();
        this.f1129b = arrayList;
        Objects.requireNonNull(abstractC0074g);
        this.f1128a = abstractC0074g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (I2.j.f1044a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        Date dateB;
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        synchronized (this.f1129b) {
            try {
                Iterator it = this.f1129b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = K2.a.b(strC, new ParsePosition(0));
                            break;
                        } catch (ParseException e5) {
                            StringBuilder sbM = AbstractC0307a.m("Failed parsing '", strC, "' as Date; at path ");
                            sbM.append(aVar.q());
                            throw new G2.h(sbM.toString(), e5);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strC);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1128a.a(dateB);
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.p();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f1129b.get(0);
        synchronized (this.f1129b) {
            str = dateFormat.format(date);
        }
        bVar.y(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f1129b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
