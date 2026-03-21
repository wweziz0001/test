package k1;

import a0.C0157H;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: k1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7686a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(C0363p c0363p) {
        c0363p.getClass();
        String strJ = c0363p.j(StandardCharsets.UTF_8);
        return strJ != null && strJ.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = str.split("\\.", 2);
        long j5 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j5 = (j5 * 60) + Long.parseLong(str2);
        }
        long j6 = j5 * 1000;
        if (strArrSplit.length == 2) {
            j6 += Long.parseLong(strArrSplit[1]);
        }
        return j6 * 1000;
    }

    public static void d(C0363p c0363p) throws C0157H {
        int i = c0363p.f5314b;
        if (a(c0363p)) {
            return;
        }
        c0363p.H(i);
        throw C0157H.a(null, "Expected WEBVTT. Got " + c0363p.j(StandardCharsets.UTF_8));
    }
}
