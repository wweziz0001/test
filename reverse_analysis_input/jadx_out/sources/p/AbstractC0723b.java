package p;

import android.os.LocaleList;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723b {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
