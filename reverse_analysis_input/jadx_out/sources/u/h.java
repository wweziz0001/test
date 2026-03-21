package u;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import b3.AbstractC0307a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ContentProvider {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f10141o = {"_display_name", "_size"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final File f10142p = new File("/");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HashMap f10143q = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10144l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f10145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f10146n;

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static g c(Context context, String str) {
        g gVarE;
        HashMap map = f10143q;
        synchronized (map) {
            try {
                gVarE = (g) map.get(str);
                if (gVarE == null) {
                    try {
                        try {
                            gVarE = e(context, str);
                            map.put(str, gVarE);
                        } catch (IOException e5) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                        }
                    } catch (XmlPullParserException e6) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVarE;
    }

    public static Uri d(Context context, String str, File file) {
        g gVarC = c(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : gVarC.f10140b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (g.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(AbstractC0307a.j("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(gVarC.f10139a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static g e(Context context, String str) throws XmlPullParserException, IOException {
        g gVar = new g(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(AbstractC0307a.j("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return gVar;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f10142p;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrA = f.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        gVar.f10140b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e5) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e5);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f10144l) {
            this.f10145m = str;
        }
        HashMap map = f10143q;
        synchronized (map) {
            map.remove(str);
        }
    }

    public final g b() {
        g gVar;
        synchronized (this.f10144l) {
            try {
                if (this.f10145m == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.f10146n == null) {
                    this.f10146n = c(getContext(), this.f10145m);
                }
                gVar = this.f10146n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileB = b().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileB = b().b(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(AbstractC0307a.j("Invalid mode: ", str));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileB, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileB = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f10141o;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i5] = "_display_name";
                i = i5 + 1;
                objArr[i5] = queryParameter == null ? fileB.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i5] = "_size";
                i = i5 + 1;
                objArr[i5] = Long.valueOf(fileB.length());
            }
            i5 = i;
        }
        String[] strArr4 = new String[i5];
        System.arraycopy(strArr3, 0, strArr4, 0, i5);
        Object[] objArr2 = new Object[i5];
        System.arraycopy(objArr, 0, objArr2, 0, i5);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
