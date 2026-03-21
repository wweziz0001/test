package w3;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import io.flutter.plugin.platform.g;
import java.util.Objects;
import n3.w;
import v3.AbstractC0934o;
import v3.C0925f;
import v3.C0927h;
import y3.C1032c;

/* JADX INFO: renamed from: w3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f10507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10509c;

    public C0949b(w wVar) {
        this.f10507a = wVar;
    }

    public final g a(Context context, Object obj) {
        switch (this.f10508b) {
            case 0:
                C0927h c0927h = (C0927h) obj;
                Objects.requireNonNull(c0927h);
                return new C0948a(context, ((AbstractC0934o) ((LongSparseArray) ((I2.g) this.f10509c).f1034m).get(c0927h.f10377a.longValue())).f10394d);
            default:
                if (((Integer) obj) == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object objE = ((C1032c) this.f10509c).e(r4.intValue());
                if (objE instanceof g) {
                    return (g) objE;
                }
                if (objE instanceof View) {
                    return new C0948a((View) objE);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0949b(C1032c c1032c) {
        this(w.f8944a);
        this.f10508b = 1;
        this.f10509c = c1032c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0949b(I2.g gVar) {
        this(C0925f.f10374d);
        this.f10508b = 0;
        this.f10509c = gVar;
    }
}
