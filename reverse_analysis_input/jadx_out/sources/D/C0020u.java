package D;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: D.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0020u extends AbstractC0022w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f371p;

    public C0020u(int i, Class cls, int i5, int i6, int i7) {
        this.f371p = i7;
        this.f373l = i;
        this.f376o = cls;
        this.f375n = i5;
        this.f374m = i6;
    }

    @Override // D.AbstractC0022w
    public final Object c(View view) {
        switch (this.f371p) {
            case 0:
                return D.b(view);
            default:
                return F.b(view);
        }
    }

    @Override // D.AbstractC0022w
    public final void d(View view, CharSequence charSequence) {
        switch (this.f371p) {
            case 0:
                D.h(view, charSequence);
                break;
            default:
                F.e(view, charSequence);
                break;
        }
    }

    @Override // D.AbstractC0022w
    public final boolean g(Object obj, CharSequence charSequence) {
        switch (this.f371p) {
        }
        return !TextUtils.equals((CharSequence) obj, charSequence);
    }
}
