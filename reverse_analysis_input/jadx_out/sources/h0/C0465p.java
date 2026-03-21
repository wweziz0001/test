package h0;

/* JADX INFO: renamed from: h0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0465p implements l2.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6253m;

    public /* synthetic */ C0465p(Object obj, int i) {
        this.f6252l = i;
        this.f6253m = obj;
    }

    @Override // l2.h
    public final Object get() {
        switch (this.f6252l) {
            case 0:
                return (Q) this.f6253m;
            case 1:
                return (com.ryanheise.just_audio.b) this.f6253m;
            case 2:
                return (x0.G) this.f6253m;
            case 3:
                return Boolean.valueOf(((N) this.f6253m).f6004N);
            default:
                try {
                    return (x0.G) ((Class) this.f6253m).getConstructor(null).newInstance(null);
                } catch (Exception e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }
}
