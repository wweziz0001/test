package B2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f262b = new a(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f263a;

    public a(Map map) {
        this.f263a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f263a.equals(((a) obj).f263a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f263a.hashCode();
    }

    public final String toString() {
        return this.f263a.toString();
    }
}
