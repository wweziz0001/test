package o3;

import Z1.e;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import m3.C0675i;
import n3.C0707q;

/* JADX INFO: renamed from: o3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9121b;

    public C0721a(Context context, e eVar) {
        C0675i c0675i = new C0675i(this, 13);
        this.f9121b = context;
        this.f9120a = eVar;
        eVar.f3002n = c0675i;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i = 2;
        }
        if (strArrSplit.length > i && strArrSplit[i].length() >= 2 && strArrSplit[i].length() <= 3) {
            builder.setRegion(strArrSplit[i]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList<Locale> arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        e eVar = this.f9120a;
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : arrayList) {
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((C0707q) eVar.f3001m).a("setLocale", arrayList2, null);
    }
}
