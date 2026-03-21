package H1;

import U3.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        N3.h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static i c(String str) {
        String strGroup;
        if (str != null && !l.i0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                int i = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    int i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    if (strGroup3 != null) {
                        int i6 = Integer.parseInt(strGroup3);
                        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                        N3.h.d(strGroup4, "description");
                        return new i(i, i5, i6, strGroup4);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, M3.l lVar);
}
