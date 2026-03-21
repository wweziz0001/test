package A;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6a = new c(0);

    public static j a(Context context, e eVar) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) eVar.f8m;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC0307a.j("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) eVar.f9n;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        c cVar = f6a;
        Collections.sort(arrayList, cVar);
        List listF = (List) eVar.f12q;
        if (listF == null) {
            listF = AbstractC0905b.f(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i >= listF.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listF.get(i));
            Collections.sort(arrayList2, cVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new j(1, (Object) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) eVar.f10o};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e5) {
                    Log.w("FontsProvider", "Unable to query the content provider", e5);
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new k(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return new j(0, (k[]) arrayList3.toArray(new k[0]));
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }
}
