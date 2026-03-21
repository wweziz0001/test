package S;

import Q.v;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1963a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f1964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f1965c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1965c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
