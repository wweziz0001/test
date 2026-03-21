package a4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3594a;

    static {
        try {
            Iterator it = Arrays.asList(new W3.b()).iterator();
            N3.h.e(it, "<this>");
            f3594a = T3.c.E0(new T3.a(new T3.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
