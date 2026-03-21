package D;

/* JADX INFO: renamed from: D.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0015o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f361c;

    public int a() {
        int i = this.f361c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.f359a) {
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f360b + ", mEndLine=" + this.f361c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0015o(int i, int i5, int i6) {
        this.f359a = i6;
        this.f360b = i;
        this.f361c = i5;
    }
}
