package A;

import D2.Z;
import D2.f0;
import D2.r0;
import Q1.C;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import b3.AbstractC0307a;
import c0.C0316a;
import c0.C0317b;
import d0.AbstractC0370w;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import i1.C0478a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import y3.C1032c;
import y3.C1034e;
import y3.C1036g;
import y3.C1038i;
import y3.C1047r;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c1.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f9n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f10o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f11p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f12q;

    public static String i(String str) {
        if (str == null || !U3.l.c0(str, "/")) {
            return "*";
        }
        String strSubstring = str.substring(0, U3.l.g0(0, 6, str, "/", false));
        N3.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static void k(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    @Override // c1.d
    public int a(long j5) {
        long[] jArr = (long[]) this.f9n;
        int iA = AbstractC0370w.a(jArr, j5, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    public void b(Object obj, Object obj2, f0 f0Var, boolean z4) {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f9n) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (f0Var.F() != Z.f571n) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(f0Var.D());
        if (f0Var.E() == r0.f580p) {
            numValueOf = null;
        }
        r2.b bVarA = y2.h.f10944b.a(y2.n.d(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), numValueOf));
        int iOrdinal = f0Var.E().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(f0Var.D()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
        } else {
            bArrArray = r2.b.f9523a;
        }
        r2.k kVar = new r2.k(obj, obj2, bArrArray, f0Var.F(), f0Var.E(), f0Var.D(), f0Var.C().D(), bVarA);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9n;
        ArrayList arrayList = (ArrayList) this.f10o;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(kVar);
        byte[] bArr = kVar.f9537c;
        r2.l lVar = new r2.l(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(kVar);
            concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(kVar);
        if (z4) {
            if (((r2.k) this.f11p) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f11p = kVar;
        }
    }

    public s2.k c() throws GeneralSecurityException {
        if (((Integer) this.f8m) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f9n) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        Integer num = (Integer) this.f10o;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((s2.j) this.f11p) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((s2.j) this.f12q) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        s2.j jVar = (s2.j) this.f11p;
        if (jVar == s2.j.f9625c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (jVar == s2.j.f9626d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (jVar == s2.j.f9627e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (jVar == s2.j.f9628f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (jVar != s2.j.f9629g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new s2.k(((Integer) this.f8m).intValue(), ((Integer) this.f9n).intValue(), ((Integer) this.f10o).intValue(), (s2.j) this.f12q, (s2.j) this.f11p);
    }

    @Override // c1.d
    public List d(long j5) {
        i1.c cVar = (i1.c) this.f8m;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j5, cVar.f6431h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j5, false, cVar.f6431h, treeMap);
        HashMap map = (HashMap) this.f11p;
        cVar.h(j5, (Map) this.f10o, map, cVar.f6431h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) ((HashMap) this.f12q).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                i1.f fVar = (i1.f) map.get(pair.first);
                fVar.getClass();
                arrayList2.add(new C0317b(null, null, null, bitmapDecodeByteArray, fVar.f6450c, 0, fVar.f6452e, fVar.f6449b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f6453f, fVar.f6454g, false, -16777216, fVar.f6456j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            i1.f fVar2 = (i1.f) map.get(entry.getKey());
            fVar2.getClass();
            C0316a c0316a = (C0316a) entry.getValue();
            CharSequence charSequence = c0316a.f4959a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C0478a c0478a : (C0478a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0478a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c0478a), spannableStringBuilder.getSpanEnd(c0478a), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i5 = i + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i, i7 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length() - 1; i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    if (spannableStringBuilder.charAt(i11) == '\n') {
                        spannableStringBuilder.delete(i10, i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0316a.f4963e = fVar2.f6450c;
            c0316a.f4964f = fVar2.f6451d;
            c0316a.f4965g = fVar2.f6452e;
            c0316a.f4966h = fVar2.f6449b;
            c0316a.f4969l = fVar2.f6453f;
            c0316a.f4968k = fVar2.i;
            c0316a.f4967j = fVar2.f6455h;
            c0316a.f4973p = fVar2.f6456j;
            arrayList2.add(c0316a.a());
        }
        return arrayList2;
    }

    public InterfaceC0703m e() {
        if (((C1036g) this.f10o) == null) {
            this.f10o = new C1036g(this);
        }
        C1036g c1036g = (C1036g) this.f10o;
        N3.h.b(c1036g);
        return c1036g;
    }

    public Context f() {
        Activity activity = (Activity) this.f9n;
        if (activity == null) {
            return (Context) this.f8m;
        }
        N3.h.b(activity);
        return activity;
    }

    @Override // c1.d
    public long g(int i) {
        return ((long[]) this.f9n)[i];
    }

    @Override // c1.d
    public int h() {
        return ((long[]) this.f9n).length;
    }

    public File j() {
        return new File(f().getCacheDir(), "share_plus");
    }

    public void l(Runnable runnable) {
        Context context = (Context) this.f11p;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void m(Map map) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        P2.c cVar;
        boolean zStartsWith;
        N3.h.e(map, "arguments");
        File fileJ = j();
        File[] fileArrListFiles = fileJ.listFiles();
        if (fileJ.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileJ.delete();
        }
        String str2 = (String) map.get("text");
        String str3 = (String) map.get("uri");
        String str4 = (String) map.get("subject");
        String str5 = (String) map.get("title");
        List list = (List) map.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) map.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = new File((String) it.next());
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    N3.h.b(canonicalPath);
                    String canonicalPath2 = j().getCanonicalPath();
                    N3.h.d(canonicalPath2, "getCanonicalPath(...)");
                    zStartsWith = canonicalPath.startsWith(canonicalPath2);
                } catch (IOException unused) {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    throw new IOException(AbstractC0307a.k("Shared file can not be located in '", j().getCanonicalPath(), "'"));
                }
                File fileJ2 = j();
                if (!fileJ2.exists()) {
                    fileJ2.mkdirs();
                }
                File file3 = new File(fileJ2, file2.getName());
                if (!file2.exists()) {
                    throw new K3.a(file2, null, "The source file doesn't exist.");
                }
                if (file3.exists() && !file3.delete()) {
                    throw new K3.a(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
                }
                if (!file2.isDirectory()) {
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            C.k(fileInputStream, fileOutputStream, 8192);
                            Z1.f.f(fileOutputStream, null);
                            Z1.f.f(fileInputStream, null);
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Z1.f.f(fileInputStream, th);
                            throw th2;
                        }
                    }
                } else if (!file3.mkdirs()) {
                    throw new K3.b(file2, file3, "Failed to create target directory.");
                }
                arrayList3.add(u.h.d(f(), (String) ((B3.e) this.f11p).a(), file3));
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            if (!(str4 == null || U3.l.i0(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || U3.l.i0(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            str = "*/*";
            if (arrayList3.size() == 1) {
                str = arrayList2 == null || arrayList2.isEmpty() ? "*/*" : (String) C3.f.T(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) C3.f.T(arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        str = (String) C3.f.T(arrayList2);
                    } else {
                        String strConcat = (String) C3.f.T(arrayList2);
                        int size = arrayList2.size() - 1;
                        if (1 <= size) {
                            int i = 1;
                            while (true) {
                                if (!N3.h.a(strConcat, arrayList2.get(i))) {
                                    if (!i(strConcat).equals(i((String) arrayList2.get(i)))) {
                                        break;
                                    } else {
                                        strConcat = i((String) arrayList2.get(i)).concat("/*");
                                    }
                                }
                                if (i == size) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            str = strConcat;
                        } else {
                            str = strConcat;
                        }
                    }
                }
                intent.setType(str);
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
            }
            if (!(str2 == null || U3.l.i0(str2))) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            if (!(str4 == null || U3.l.i0(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || U3.l.i0(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
            intent.addFlags(1);
        }
        Context context = (Context) this.f8m;
        Intent intentCreateChooser = Intent.createChooser(intent, str5, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((B3.e) this.f12q).a()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            List<ResolveInfo> listQueryIntentActivities = f().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
            N3.h.d(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = listQueryIntentActivities.iterator();
            while (it2.hasNext()) {
                String str6 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    f().grantUriPermission(str6, (Uri) it3.next(), 3);
                }
            }
        }
        N3.h.b(intentCreateChooser);
        Activity activity = (Activity) this.f9n;
        if (activity != null) {
            activity.startActivityForResult(intentCreateChooser, 22643);
            return;
        }
        intentCreateChooser.addFlags(268435456);
        Z2.c cVar2 = (Z2.c) this.f10o;
        if (cVar2.f3094m.compareAndSet(false, true) && (cVar = cVar2.f3093l) != null) {
            cVar.success("dev.fluttercommunity.plus/share/unavailable");
            cVar2.f3093l = null;
        }
        context.startActivity(intentCreateChooser);
    }

    public String toString() {
        switch (this.f7l) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f8m) + ", mProviderPackage: " + ((String) this.f9n) + ", mQuery: " + ((String) this.f10o) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f12q;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i5 = 0; i5 < list2.size(); i5++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public e(Context context, Z2.c cVar) {
        this.f7l = 1;
        N3.h.e(context, "context");
        N3.h.e(cVar, "manager");
        this.f8m = context;
        this.f9n = null;
        this.f10o = cVar;
        this.f11p = new B3.e(new Z2.a(this, 0));
        this.f12q = new B3.e(new defpackage.c(1));
    }

    public e(InterfaceC0696f interfaceC0696f, Context context, C1047r c1047r) {
        this.f7l = 6;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        this.f8m = interfaceC0696f;
        this.f9n = new C1032c(new C1038i(new C1034e(interfaceC0696f)));
        this.f11p = context;
        this.f12q = c1047r;
    }

    public e(i1.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f7l = 2;
        this.f8m = cVar;
        this.f11p = map2;
        this.f12q = map3;
        this.f10o = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f9n = jArr;
    }

    public e(String str, String str2, String str3, List list) {
        this.f7l = 0;
        str.getClass();
        this.f8m = str;
        str2.getClass();
        this.f9n = str2;
        this.f10o = str3;
        list.getClass();
        this.f12q = list;
        this.f11p = str + "-" + str2 + "-" + str3;
    }

    public e(Context context, InterfaceC0696f interfaceC0696f, I2.g gVar, I2.g gVar2, io.flutter.embedding.engine.renderer.l lVar) {
        this.f7l = 5;
        this.f8m = context;
        this.f9n = interfaceC0696f;
        this.f10o = gVar;
        this.f11p = gVar2;
        this.f12q = lVar;
    }

    public e(Class cls) {
        this.f7l = 3;
        this.f9n = new ConcurrentHashMap();
        this.f10o = new ArrayList();
        this.f8m = cls;
        this.f12q = B2.a.f262b;
    }
}
