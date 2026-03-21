package m2;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X implements l2.h, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8572l;

    public X() {
        r.e("expectedValuesPerKey", 2);
        this.f8572l = 2;
    }

    @Override // l2.h
    public final Object get() {
        return new ArrayList(this.f8572l);
    }
}
