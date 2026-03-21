package Q1;

import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f1791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.p f1792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1793c;

    public E(UUID uuid, Z1.p pVar, LinkedHashSet linkedHashSet) {
        N3.h.e(uuid, "id");
        N3.h.e(pVar, "workSpec");
        N3.h.e(linkedHashSet, "tags");
        this.f1791a = uuid;
        this.f1792b = pVar;
        this.f1793c = linkedHashSet;
    }
}
