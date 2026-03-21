package a0;

import F0.C0066m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import d0.AbstractC0370w;
import f0.C0415j;
import g1.C0436a;
import h1.C0475a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l.InterfaceC0556n;
import l.MenuC0550h;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: renamed from: a0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0200z implements a1.g, androidx.lifecycle.W, c1.j, InterfaceC0705o, B0.t, InterfaceC0556n, o0.p, p1.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static C0200z f3467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static C0200z f3468n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3469l;

    public /* synthetic */ C0200z(int i) {
        this.f3469l = i;
    }

    public static final boolean o(g4.l lVar) {
        g4.l lVar2 = h4.c.f6334c;
        return !U3.l.d0(lVar.b(), ".class", true);
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] q(m2.I i, long j5) {
        B0.l lVar = new B0.l(27);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i.size());
        Iterator<E> it = i.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) lVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j5);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static Z1.c r(Context context, String[] strArr, String str, Z1.i iVar) {
        String[] strArrW = w(context);
        int length = strArrW.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrW[i];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i5 = i6;
                }
            }
            if (zipFile != null) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c5 = File.separatorChar;
                            sb.append(c5);
                            sb.append(str3);
                            sb.append(c5);
                            sb.append(str);
                            String string = sb.toString();
                            iVar.r("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                Z1.c cVar = new Z1.c();
                                cVar.f2996l = zipFile;
                                cVar.f2997m = entry;
                                return cVar;
                            }
                        }
                        i7 = i8;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static g4.l s(String str, boolean z4) {
        N3.h.e(str, "<this>");
        g4.b bVar = h4.b.f6329a;
        g4.a aVar = new g4.a();
        aVar.v(str);
        return h4.b.d(aVar, z4);
    }

    public static g4.l t(File file) {
        String str = g4.l.f5856m;
        String string = file.toString();
        N3.h.d(string, "toString()");
        return s(string, false);
    }

    public static String[] u(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c5 = File.separatorChar;
        sb.append(c5);
        sb.append("([^\\");
        sb.append(c5);
        sb.append("]*)");
        sb.append(c5);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : w(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] w(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // c1.j
    public c1.l a(C0190p c0190p) {
        List list;
        c1.l hVar;
        switch (this.f3469l) {
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = c0190p.f3424n;
                if (str != null) {
                    list = c0190p.f3427q;
                    switch (str) {
                        case "application/dvbsubs":
                            hVar = new e1.h(list);
                            break;
                        case "application/pgs":
                            return new Z1.i(10);
                        case "application/x-mp4-vtt":
                            return new F0.A(1);
                        case "text/vtt":
                            return new Z1.l(12);
                        case "application/x-quicktime-tx3g":
                            hVar = new j1.a(list);
                            break;
                        case "text/x-ssa":
                            hVar = new C0436a(list);
                            break;
                        case "application/x-subrip":
                            return new C0475a();
                        case "application/ttml+xml":
                            return new i1.e();
                    }
                    return hVar;
                }
                throw new IllegalArgumentException(AbstractC0307a.j("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.T c(Class cls) {
        return new androidx.fragment.app.O(true);
    }

    @Override // c1.j
    public int d(C0190p c0190p) {
        switch (this.f3469l) {
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = c0190p.f3424n;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException(AbstractC0307a.j("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    @Override // a1.g
    public F0.E e() {
        return new F0.v(-9223372036854775807L);
    }

    @Override // l.InterfaceC0556n
    public boolean g(MenuC0550h menuC0550h) {
        return false;
    }

    @Override // a1.g
    public long k(C0066m c0066m) {
        return -1L;
    }

    @Override // B0.t
    public Object l(Uri uri, C0415j c0415j) {
        return Long.valueOf(AbstractC0370w.P(new BufferedReader(new InputStreamReader(c0415j)).readLine()));
    }

    @Override // o0.p
    public B0.t m() {
        return new o0.o(o0.l.f9042l, null);
    }

    @Override // o0.p
    public B0.t n(o0.l lVar, o0.i iVar) {
        return new o0.o(lVar, iVar);
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        switch (this.f3469l) {
            case 9:
                try {
                    System.loadLibrary("sqlite3");
                    ((P2.c) interfaceC0706p).success(null);
                } catch (Throwable th) {
                    ((P2.c) interfaceC0706p).error(th.toString(), null, null);
                    return;
                }
                break;
            case 22:
                ((P2.c) interfaceC0706p).success(null);
                break;
            default:
                ((P2.c) interfaceC0706p).success(null);
                break;
        }
    }

    @Override // c1.j
    public boolean supportsFormat(C0190p c0190p) {
        switch (this.f3469l) {
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = c0190p.f3424n;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    public CharSequence v(Preference preference) {
        switch (this.f3469l) {
            case 27:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f4673l.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f4673l.getString(R.string.not_set);
                }
                return null;
        }
    }

    public C0200z(Context context) {
        this.f3469l = 14;
        context.getApplicationContext();
    }

    public C0200z(f3.b bVar) {
        this.f3469l = 23;
        new C0707q(bVar, "flutter/deferredcomponent", n3.x.f8947a, null).b(new androidx.lifecycle.E(this, 22));
        Z1.m.z().getClass();
        new HashMap();
    }

    @Override // p1.c
    public void h() {
    }

    @Override // a1.g
    public void j(long j5) {
    }

    @Override // l.InterfaceC0556n
    public void b(MenuC0550h menuC0550h, boolean z4) {
    }

    @Override // p1.c
    public void f(int i, Serializable serializable) {
    }
}
