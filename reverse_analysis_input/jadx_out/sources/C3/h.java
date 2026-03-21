package C3;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {
    public static int R(Iterable iterable) {
        N3.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
