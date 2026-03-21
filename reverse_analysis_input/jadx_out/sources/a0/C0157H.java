package a0;

import b3.AbstractC0307a;
import java.io.IOException;

/* JADX INFO: renamed from: a0.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0157H extends IOException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3216m;

    public C0157H(String str, Exception exc, boolean z4, int i) {
        super(str, exc);
        this.f3215l = z4;
        this.f3216m = i;
    }

    public static C0157H a(RuntimeException runtimeException, String str) {
        return new C0157H(str, runtimeException, true, 1);
    }

    public static C0157H b(String str, Exception exc) {
        return new C0157H(str, exc, true, 4);
    }

    public static C0157H c(String str) {
        return new C0157H(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append(" {contentIsMalformed=");
        sb.append(this.f3215l);
        sb.append(", dataType=");
        return AbstractC0307a.l(sb, this.f3216m, "}");
    }
}
