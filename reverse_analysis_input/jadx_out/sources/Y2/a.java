package Y2;

import C3.e;
import N3.h;
import P2.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import j3.C0524a;
import j3.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0705o, b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f2738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0707q f2739m;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        h.b(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            byte b4 = bArrDigest[i];
            int i5 = i * 2;
            cArr2[i5] = cArr[(b4 & 255) >>> 4];
            cArr2[i5 + 1] = cArr[b4 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        String strB = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f2738l;
                h.b(context);
                SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    h.d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) e.X(apkContentsSigners)).toByteArray();
                    h.d(byteArray, "toByteArray(...)");
                    strB = b(byteArray);
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    h.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) e.X(signingCertificateHistory)).toByteArray();
                    h.d(byteArray2, "toByteArray(...)");
                    strB = b(byteArray2);
                }
            } else {
                Context context2 = this.f2738l;
                h.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && e.X(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) e.X(signatureArr)).toByteArray();
                    h.d(byteArray3, "toByteArray(...)");
                    strB = b(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return strB;
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        this.f2738l = c0524a.f7453a;
        C0707q c0707q = new C0707q(c0524a.f7455c, "dev.fluttercommunity.plus/package_info");
        this.f2739m = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        this.f2738l = null;
        C0707q c0707q = this.f2739m;
        h.b(c0707q);
        c0707q.b(null);
        this.f2739m = null;
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        String string;
        CharSequence charSequenceLoadLabel;
        h.e(c0704n, "call");
        try {
            if (!h.a(c0704n.f8938a, "getAll")) {
                ((c) interfaceC0706p).notImplemented();
                return;
            }
            Context context = this.f2738l;
            h.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f2738l;
            h.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strA = a(packageManager);
            Context context3 = this.f2738l;
            h.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f2738l;
            h.b(context4);
            String packageName = context4.getPackageName();
            int i = Build.VERSION.SDK_INT;
            String initiatingPackageName = i >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            long j5 = packageInfo.firstInstallTime;
            long j6 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = "";
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "";
            }
            map.put("appName", string);
            Context context5 = this.f2738l;
            h.b(context5);
            map.put("packageName", context5.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            map.put("buildNumber", String.valueOf(i >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (strA != null) {
                map.put("buildSignature", strA);
            }
            if (initiatingPackageName != null) {
                map.put("installerStore", initiatingPackageName);
            }
            map.put("installTime", String.valueOf(j5));
            map.put("updateTime", String.valueOf(j6));
            ((c) interfaceC0706p).success(map);
        } catch (PackageManager.NameNotFoundException e5) {
            ((c) interfaceC0706p).error("Name not found", e5.getMessage(), null);
        }
    }
}
