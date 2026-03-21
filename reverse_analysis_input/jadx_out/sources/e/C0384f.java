package e;

import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: renamed from: e.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0384f extends AbstractC0381c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.b f5468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0387i f5469c;

    public C0384f(AbstractC0387i abstractC0387i, String str, f.b bVar) {
        this.f5469c = abstractC0387i;
        this.f5467a = str;
        this.f5468b = bVar;
    }

    public final void a(Object obj) {
        AbstractC0387i abstractC0387i = this.f5469c;
        HashMap map = abstractC0387i.f5475b;
        String str = this.f5467a;
        Integer num = (Integer) map.get(str);
        f.b bVar = this.f5468b;
        if (num != null) {
            abstractC0387i.f5477d.add(str);
            try {
                abstractC0387i.b(num.intValue(), bVar, (Parcelable) obj);
                return;
            } catch (Exception e5) {
                abstractC0387i.f5477d.remove(str);
                throw e5;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
