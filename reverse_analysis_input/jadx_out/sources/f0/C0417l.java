package f0;

import a0.AbstractC0151B;
import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: f0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417l {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f5689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5693h;

    static {
        AbstractC0151B.a("media3.datasource");
    }

    public C0417l(Uri uri, int i5, byte[] bArr, Map map, long j5, long j6, String str, int i6) {
        AbstractC0360m.c(j5 >= 0);
        AbstractC0360m.c(j5 >= 0);
        AbstractC0360m.c(j6 > 0 || j6 == -1);
        uri.getClass();
        this.f5686a = uri;
        this.f5687b = i5;
        this.f5688c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f5689d = Collections.unmodifiableMap(new HashMap(map));
        this.f5690e = j5;
        this.f5691f = j6;
        this.f5692g = str;
        this.f5693h = i6;
    }

    public final C0417l a(long j5) {
        long j6 = this.f5691f;
        long j7 = j6 != -1 ? j6 - j5 : -1L;
        if (j5 == 0 && j6 == j7) {
            return this;
        }
        return new C0417l(this.f5686a, this.f5687b, this.f5688c, this.f5689d, this.f5690e + j5, j7, this.f5692g, this.f5693h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i5 = this.f5687b;
        if (i5 == 1) {
            str = "GET";
        } else if (i5 == 2) {
            str = "POST";
        } else {
            if (i5 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f5686a);
        sb.append(", ");
        sb.append(this.f5690e);
        sb.append(", ");
        sb.append(this.f5691f);
        sb.append(", ");
        sb.append(this.f5692g);
        sb.append(", ");
        return AbstractC0307a.l(sb, this.f5693h, "]");
    }
}
