package f0;

import java.io.IOException;

/* JADX INFO: renamed from: f0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0414i extends IOException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f5672m = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5673l;

    public C0414i(int i) {
        this.f5673l = i;
    }

    public C0414i(Exception exc, int i) {
        super(exc);
        this.f5673l = i;
    }

    public C0414i(String str, int i) {
        super(str);
        this.f5673l = i;
    }

    public C0414i(String str, Exception exc, int i) {
        super(str, exc);
        this.f5673l = i;
    }
}
