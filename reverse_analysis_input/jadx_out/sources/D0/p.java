package D0;

import a0.c0;
import a0.d0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f473a;

    public p(o oVar) {
        this.f473a = oVar;
    }

    public final void a() throws c0 {
        try {
            ((p) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(d0.class).newInstance(this.f473a)).a();
        } catch (Exception e5) {
            int i = c0.f3327l;
            if (!(e5 instanceof c0)) {
                throw new c0(e5);
            }
        }
    }
}
