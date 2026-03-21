package io.flutter.embedding.android;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B {
    public static /* bridge */ /* synthetic */ AutofillManager a(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue b(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange h(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void j() {
    }
}
