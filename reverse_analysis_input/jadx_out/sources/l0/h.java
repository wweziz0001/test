package l0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7856d;

    public h(String str, long j5, ArrayList arrayList, List list) {
        this.f7853a = str;
        this.f7854b = j5;
        this.f7855c = Collections.unmodifiableList(arrayList);
        this.f7856d = Collections.unmodifiableList(list);
    }
}
