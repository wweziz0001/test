package f0;

import a0.InterfaceC0182h;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: f0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0413h extends InterfaceC0182h {
    void b(InterfaceC0403A interfaceC0403A);

    void close();

    long p(C0417l c0417l);

    Uri r();

    default Map y() {
        return Collections.emptyMap();
    }
}
