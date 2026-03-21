package androidx.datastore.preferences.protobuf;

import a.AbstractC0149a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4079a;

    static {
        char[] cArr = new char[80];
        f4079a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i5 = 80;
            if (i <= 80) {
                i5 = i;
            }
            sb.append(f4079a, 0, i5);
            i -= i5;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char cCharAt = str.charAt(i5);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0215g c0215g = C0215g.f4144n;
            sb.append(AbstractC0149a.q(new C0215g(((String) obj).getBytes(AbstractC0231x.f4217a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0215g) {
            sb.append(": \"");
            sb.append(AbstractC0149a.q((C0215g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0229v) {
            sb.append(" {");
            c((AbstractC0229v) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i + 2;
        b(sb, i6, "key", entry.getKey());
        b(sb, i6, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0229v r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.c(androidx.datastore.preferences.protobuf.v, java.lang.StringBuilder, int):void");
    }
}
