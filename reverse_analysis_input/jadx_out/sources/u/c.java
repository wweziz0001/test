package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
        /*
            r0 = r11 & 4
            if (r0 == 0) goto Laa
            if (r9 != 0) goto Laa
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r6.getPackageName()
            r9.append(r11)
            java.lang.String r11 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r11 = android.os.Process.myPid()
            int r0 = android.os.Process.myUid()
            java.lang.String r1 = r6.getPackageName()
            int r11 = r6.checkPermission(r9, r11, r0)
            r2 = -1
            if (r11 != r2) goto L30
            goto L95
        L30:
            java.lang.String r11 = t.AbstractC0817f.d(r9)
            r3 = 0
            if (r11 != 0) goto L39
        L37:
            r2 = r3
            goto L95
        L39:
            if (r1 != 0) goto L4b
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String[] r1 = r1.getPackagesForUid(r0)
            if (r1 == 0) goto L95
            int r4 = r1.length
            if (r4 > 0) goto L49
            goto L95
        L49:
            r1 = r1[r3]
        L4b:
            int r2 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r2 != r0) goto L86
            boolean r2 = java.util.Objects.equals(r4, r1)
            if (r2 == 0) goto L86
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r2 < r4) goto L7b
            android.app.AppOpsManager r2 = t.AbstractC0818g.c(r6)
            int r4 = android.os.Binder.getCallingUid()
            int r1 = t.AbstractC0818g.a(r2, r11, r4, r1)
            if (r1 == 0) goto L72
            goto L90
        L72:
            java.lang.String r1 = t.AbstractC0818g.b(r6)
            int r1 = t.AbstractC0818g.a(r2, r11, r0, r1)
            goto L90
        L7b:
            java.lang.Object r0 = t.AbstractC0817f.a(r6, r5)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = t.AbstractC0817f.c(r0, r11, r1)
            goto L90
        L86:
            java.lang.Object r0 = t.AbstractC0817f.a(r6, r5)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = t.AbstractC0817f.c(r0, r11, r1)
        L90:
            if (r1 != 0) goto L93
            goto L37
        L93:
            r11 = -2
            r2 = r11
        L95:
            if (r2 != 0) goto L9c
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
            return r6
        L9c:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Permission "
            java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r7 = b3.AbstractC0307a.k(r7, r9, r8)
            r6.<init>(r7)
            throw r6
        Laa:
            r5 = r11 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, int):android.content.Intent");
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
