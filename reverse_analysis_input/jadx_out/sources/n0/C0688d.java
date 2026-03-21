package n0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: n0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688d extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
