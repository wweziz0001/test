package d0;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: d0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0349b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5271a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5272b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f5273c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, int i5, int i6) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static String b(int i, boolean z4, int i5, int i6, int[] iArr, int i7) {
        Object[] objArr = {f5272b[i], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i7)};
        int i8 = AbstractC0370w.f5326a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i9 = 0; i9 < length; i9++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i9])));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r12, java.lang.String[] r13, a0.C0181g r14) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC0349b.c(java.lang.String, java.lang.String[], a0.g):android.util.Pair");
    }
}
