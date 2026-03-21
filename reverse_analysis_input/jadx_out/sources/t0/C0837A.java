package t0;

import a0.C0157H;
import d0.AbstractC0370w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: t0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0837A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0837A f9802c = new C0837A(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f9803d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9805b;

    public C0837A(long j5, long j6) {
        this.f9804a = j5;
        this.f9805b = j6;
    }

    public static C0837A a(String str) {
        long j5;
        Matcher matcher = f9803d.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = y.f9989a;
        if (!zMatches) {
            throw C0157H.b(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw C0157H.b(str, null);
        }
        int i = AbstractC0370w.f5326a;
        long j6 = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j5 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j5 < j6) {
                    throw C0157H.b(str, null);
                }
            } catch (NumberFormatException e5) {
                throw C0157H.b(strGroup2, e5);
            }
        } else {
            j5 = -9223372036854775807L;
        }
        return new C0837A(j6, j5);
    }
}
