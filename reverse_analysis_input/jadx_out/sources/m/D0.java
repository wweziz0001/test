package m;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.example.hqp_mobile_app.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends J.c implements View.OnClickListener {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f8242I = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8243A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f8244B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8245C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8246D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8247E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8248F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8249G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f8250H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LayoutInflater f8253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SearchView f8254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SearchableInfo f8255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f8256x;
    public final WeakHashMap y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8257z;

    public D0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1086m = true;
        this.f1087n = null;
        this.f1085l = false;
        this.f1088o = -1;
        this.f1089p = new J.a(this);
        this.f1090q = new J.b(this, 0);
        this.f8252t = suggestionRowLayout;
        this.f8251s = suggestionRowLayout;
        this.f8253u = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8243A = 1;
        this.f8245C = -1;
        this.f8246D = -1;
        this.f8247E = -1;
        this.f8248F = -1;
        this.f8249G = -1;
        this.f8250H = -1;
        this.f8254v = searchView;
        this.f8255w = searchableInfo;
        this.f8257z = searchView.getSuggestionCommitIconResId();
        this.f8256x = context;
        this.y = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    @Override // J.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.D0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // J.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f8245C = cursor.getColumnIndex("suggest_text_1");
                this.f8246D = cursor.getColumnIndex("suggest_text_2");
                this.f8247E = cursor.getColumnIndex("suggest_text_2_url");
                this.f8248F = cursor.getColumnIndex("suggest_icon_1");
                this.f8249G = cursor.getColumnIndex("suggest_icon_2");
                this.f8250H = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // J.c
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f8255w;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // J.c
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f8253u.inflate(this.f8251s, viewGroup, false);
        viewInflate.setTag(new C0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f8257z);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8256x.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.D0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f8256x.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // J.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f8253u.inflate(this.f8252t, viewGroup, false);
            if (viewInflate != null) {
                ((C0) viewInflate.getTag()).f8237a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // J.c, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewD = d(viewGroup);
            ((C0) viewD.getTag()).f8237a.setText(e5.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1087n;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1087n;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8254v.n((CharSequence) tag);
        }
    }
}
