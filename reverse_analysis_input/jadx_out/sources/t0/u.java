package t0;

import android.net.Uri;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f9972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f9973b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r31 = "audio/3gpp";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[PHI: r31
      0x0067: PHI (r31v19 java.lang.String) = 
      (r31v1 java.lang.String)
      (r31v2 java.lang.String)
      (r31v3 java.lang.String)
      (r31v4 java.lang.String)
      (r31v5 java.lang.String)
      (r31v6 java.lang.String)
      (r31v7 java.lang.String)
      (r31v8 java.lang.String)
      (r31v9 java.lang.String)
      (r31v10 java.lang.String)
      (r31v11 java.lang.String)
      (r31v12 java.lang.String)
      (r31v13 java.lang.String)
      (r31v14 java.lang.String)
      (r31v15 java.lang.String)
      (r31v16 java.lang.String)
      (r31v17 java.lang.String)
      (r31v20 java.lang.String)
     binds: [B:74:0x0159, B:70:0x014c, B:66:0x0141, B:62:0x0134, B:58:0x0127, B:54:0x011c, B:50:0x010f, B:46:0x0100, B:42:0x00f0, B:38:0x00e0, B:34:0x00d0, B:30:0x00c0, B:26:0x00b0, B:22:0x00a2, B:18:0x0092, B:14:0x0082, B:10:0x0072, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(t0.C0856m r39, t0.C0846c r40, android.net.Uri r41) {
        /*
            Method dump skipped, instruction units count: 2128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.u.<init>(t0.m, t0.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(e0.n.f5545a, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f9972a.equals(uVar.f9972a) && this.f9973b.equals(uVar.f9973b);
    }

    public final int hashCode() {
        return this.f9973b.hashCode() + ((this.f9972a.hashCode() + 217) * 31);
    }
}
