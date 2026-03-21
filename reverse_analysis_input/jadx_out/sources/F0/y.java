package F0;

import a0.C0155F;
import a0.InterfaceC0154E;
import d0.AbstractC0370w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f833c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f834a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f835b = -1;

    public final boolean a(String str) {
        Matcher matcher = f833c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC0370w.f5326a;
            int i5 = Integer.parseInt(strGroup, 16);
            int i6 = Integer.parseInt(matcher.group(2), 16);
            if (i5 <= 0 && i6 <= 0) {
                return false;
            }
            this.f834a = i5;
            this.f835b = i6;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(C0155F c0155f) {
        int i = 0;
        while (true) {
            InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
            if (i >= interfaceC0154EArr.length) {
                return;
            }
            InterfaceC0154E interfaceC0154E = interfaceC0154EArr[i];
            if (interfaceC0154E instanceof T0.e) {
                T0.e eVar = (T0.e) interfaceC0154E;
                if ("iTunSMPB".equals(eVar.f2113n) && a(eVar.f2114o)) {
                    return;
                }
            } else if (interfaceC0154E instanceof T0.k) {
                T0.k kVar = (T0.k) interfaceC0154E;
                if ("com.apple.iTunes".equals(kVar.f2126m) && "iTunSMPB".equals(kVar.f2127n) && a(kVar.f2128o)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
