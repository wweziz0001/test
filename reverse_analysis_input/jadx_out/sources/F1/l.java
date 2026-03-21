package F1;

import Q1.C;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f859a;

    static {
        m eVar;
        try {
            eVar = new B0.d((WebViewProviderFactoryBoundaryInterface) i4.a.j(WebViewProviderFactoryBoundaryInterface.class, C.Y()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new RuntimeException(e);
        }
        f859a = eVar;
    }
}
