package J2;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends G2.r {
    @Override // G2.r
    public final Object b(O2.a aVar) {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.C(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        bVar.y(locale == null ? null : locale.toString());
    }
}
