package m2;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8553c;

    public K(Object obj, Object obj2, Object obj3) {
        this.f8551a = obj;
        this.f8552b = obj2;
        this.f8553c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8551a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f8552b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f8553c);
        return new IllegalArgumentException(sb.toString());
    }
}
