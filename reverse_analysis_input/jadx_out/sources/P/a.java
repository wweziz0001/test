package P;

import M3.l;
import N3.i;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f1664m = new a(1);

    @Override // M3.l
    public final Object c(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        N3.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            N3.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i = 0;
            for (byte b4 : bArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b4));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f1670a + " = " + strValueOf;
    }
}
