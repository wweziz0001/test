package B0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f225d;

    public j(int i, int i5, int i6, int i7) {
        this.f222a = i;
        this.f223b = i5;
        this.f224c = i6;
        this.f225d = i7;
    }

    public final boolean a(int i) {
        if (i == 1) {
            if (this.f222a - this.f223b <= 1) {
                return false;
            }
        } else if (this.f224c - this.f225d <= 1) {
            return false;
        }
        return true;
    }
}
