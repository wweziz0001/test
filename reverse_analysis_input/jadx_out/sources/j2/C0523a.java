package j2;

import N3.h;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import j3.C0524a;
import j3.b;
import java.io.File;
import java.util.Locale;
import n3.C0707q;
import n3.InterfaceC0705o;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0523a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f7451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f7452m;

    public final Uri a(String str, String str2) {
        String mimeTypeFromExtension;
        ContentResolver contentResolver;
        if (str2 == null) {
            str2 = String.valueOf(System.currentTimeMillis());
        }
        if (TextUtils.isEmpty(str)) {
            mimeTypeFromExtension = null;
        } else {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            h.d(lowerCase, "toLowerCase(...)");
            mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        }
        boolean z4 = false;
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video")) {
            z4 = true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(Environment.getExternalStoragePublicDirectory(z4 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES).getAbsolutePath());
            if (!file.exists()) {
                file.mkdir();
            }
            if (str.length() > 0) {
                str2 = ((Object) str2) + "." + str;
            }
            return Uri.fromFile(new File(file, str2));
        }
        Uri uri = z4 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("relative_path", z4 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES);
        if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
            contentValues.put("mime_type", mimeTypeFromExtension);
        }
        Context context = this.f7452m;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        return contentResolver.insert(uri, contentValues);
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        this.f7452m = c0524a.f7453a;
        C0707q c0707q = new C0707q(c0524a.f7455c, "image_gallery_saver_plus");
        this.f7451l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        this.f7452m = null;
        C0707q c0707q = this.f7451l;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0093: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:148), block:B:26:0x0093 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(n3.C0704n r13, n3.InterfaceC0706p r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C0523a.onMethodCall(n3.n, n3.p):void");
    }
}
