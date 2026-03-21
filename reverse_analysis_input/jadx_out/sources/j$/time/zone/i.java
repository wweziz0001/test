package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class i extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7235d;

    i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f7235d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set d() {
        return this.f7235d;
    }

    @Override // j$.time.zone.j
    protected final f c(String str) {
        if (this.f7235d.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: " + str);
    }
}
