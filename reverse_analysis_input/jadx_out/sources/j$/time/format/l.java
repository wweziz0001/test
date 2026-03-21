package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f7081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f7082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char f7083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected l f7084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected l f7085e;

    /* synthetic */ l(String str, String str2, l lVar, int i) {
        this(str, str2, lVar);
    }

    protected boolean b(char c5, char c6) {
        return c5 == c6;
    }

    private l(String str, String str2, l lVar) {
        this.f7081a = str;
        this.f7082b = str2;
        this.f7084d = lVar;
        if (str.isEmpty()) {
            this.f7083c = (char) 65535;
        } else {
            this.f7083c = this.f7081a.charAt(0);
        }
    }

    public static l e(Set set, q qVar) {
        l lVar = qVar.j() ? new l("", null, null) : new k("", null, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lVar.a(str, str);
        }
        return lVar;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!f(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f7081a.length() + index;
        l lVar = this.f7084d;
        if (lVar != null && length2 != length) {
            while (true) {
                if (b(lVar.f7083c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = lVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    lVar = lVar.f7085e;
                    if (lVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f7082b;
    }

    protected l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar);
    }

    protected boolean f(CharSequence charSequence, int i, int i5) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f7081a, i);
        }
        int length = this.f7081a.length();
        if (length > i5 - i) {
            return false;
        }
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i8 = i6 + 1;
            int i9 = i + 1;
            if (!b(this.f7081a.charAt(i6), charSequence.charAt(i))) {
                return false;
            }
            i = i9;
            length = i7;
            i6 = i8;
        }
    }

    private boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f7081a.length() && b(str.charAt(i), this.f7081a.charAt(i))) {
            i++;
        }
        if (i == this.f7081a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (l lVar = this.f7084d; lVar != null; lVar = lVar.f7085e) {
                    if (b(lVar.f7083c, strSubstring.charAt(0))) {
                        return lVar.a(strSubstring, str2);
                    }
                }
                l lVarD = d(strSubstring, str2, null);
                lVarD.f7085e = this.f7084d;
                this.f7084d = lVarD;
                return true;
            }
            this.f7082b = str2;
            return true;
        }
        l lVarD2 = d(this.f7081a.substring(i), this.f7082b, this.f7084d);
        this.f7081a = str.substring(0, i);
        this.f7084d = lVarD2;
        if (i < str.length()) {
            this.f7084d.f7085e = d(str.substring(i), str2, null);
            this.f7082b = null;
        } else {
            this.f7082b = str2;
        }
        return true;
    }
}
