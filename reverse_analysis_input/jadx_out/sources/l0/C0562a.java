package l0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0562a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7817f;

    public C0562a(long j5, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.f7812a = j5;
        this.f7813b = i;
        this.f7814c = Collections.unmodifiableList(arrayList);
        this.f7815d = Collections.unmodifiableList(list);
        this.f7816e = Collections.unmodifiableList(list2);
        this.f7817f = Collections.unmodifiableList(list3);
    }
}
