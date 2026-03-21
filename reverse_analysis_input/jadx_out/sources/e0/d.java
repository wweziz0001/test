package e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5493l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5494m;

    public /* synthetic */ d() {
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void b(int i) {
        this.f5494m = i | this.f5494m;
    }

    public boolean e(int i) {
        return (this.f5494m & i) == i;
    }

    public String toString() {
        switch (this.f5493l) {
            case 0:
                return c(this.f5494m);
            default:
                return super.toString();
        }
    }

    public d(int i) {
        this.f5494m = i;
    }
}
