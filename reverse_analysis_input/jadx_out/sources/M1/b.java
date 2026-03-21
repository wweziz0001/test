package M1;

import M3.l;
import N3.g;
import N3.h;
import androidx.window.extensions.layout.WindowLayoutInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends g implements l {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // M3.l
    public final Object c(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((f) this.f1608m).accept(windowLayoutInfo);
        return B3.g.f275a;
    }
}
