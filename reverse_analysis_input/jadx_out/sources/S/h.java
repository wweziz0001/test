package S;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import m.AbstractC0602m;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Q.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1978a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f1979b;

    public h(SwitchCompat switchCompat) {
        this.f1979b = new WeakReference(switchCompat);
    }

    @Override // Q.g
    public void a() {
        switch (this.f1978a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1979b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // Q.g
    public final void b() {
        switch (this.f1978a) {
            case 0:
                i.a((EditText) this.f1979b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1979b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public h(AbstractC0602m abstractC0602m) {
        this.f1979b = new WeakReference(abstractC0602m);
    }
}
