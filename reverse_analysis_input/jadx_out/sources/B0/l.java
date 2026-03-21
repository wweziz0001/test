package B0;

import android.content.Context;
import d0.InterfaceC0351d;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC0351d, F0.t, I2.q, l2.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f228l;

    public /* synthetic */ l(int i) {
        this.f228l = i;
    }

    @Override // d0.InterfaceC0351d
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f2  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // l2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.l.apply(java.lang.Object):java.lang.Object");
    }

    @Override // F0.t
    public F0.q[] b() {
        switch (this.f228l) {
            case 4:
                return new F0.q[]{new G0.a(0)};
            case 14:
                return new F0.q[]{new K0.c()};
            case 15:
                return new F0.q[]{new L0.b()};
            case 23:
                return new F0.q[]{new Z0.p(c1.j.f5051h, 16)};
            default:
                return new F0.q[]{new a1.d()};
        }
    }

    public Z1.l c(Context context) {
        switch (this.f228l) {
            case 16:
                return new Z1.l(context);
            default:
                return new Q2.b(context);
        }
    }

    public Z1.s d(Context context, Z1.l lVar) {
        switch (this.f228l) {
            case 18:
                return new Z1.s(context, lVar);
            default:
                return new Q2.d(context, lVar);
        }
    }

    @Override // I2.q
    public Object e() {
        switch (this.f228l) {
            case 5:
                return new I2.p(true);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new TreeSet();
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new LinkedHashSet();
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return new ArrayDeque();
            case 9:
                return new ArrayList();
            case 10:
                return new ConcurrentSkipListMap();
            case 11:
                return new ConcurrentHashMap();
            case 12:
                return new TreeMap();
            default:
                return new LinkedHashMap();
        }
    }

    public Constructor f() {
        switch (this.f228l) {
            case 2:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(F0.q.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(F0.q.class).getConstructor(null);
        }
    }
}
