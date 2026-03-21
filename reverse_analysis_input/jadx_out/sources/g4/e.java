package g4;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f5843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f5844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f5845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f5846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f5847g = C3.o.f292l;

    public e(boolean z4, boolean z5, Long l3, Long l4, Long l5, Long l6) {
        this.f5841a = z4;
        this.f5842b = z5;
        this.f5843c = l3;
        this.f5844d = l4;
        this.f5845e = l5;
        this.f5846f = l6;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f5841a) {
            arrayList.add("isRegularFile");
        }
        if (this.f5842b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f5843c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f5844d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f5845e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f5846f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f5847g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C3.f.V(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
