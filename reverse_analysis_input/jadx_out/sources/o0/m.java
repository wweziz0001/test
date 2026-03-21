package o0;

import java.util.Collections;
import java.util.List;
import s0.InterfaceC0784a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements InterfaceC0784a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9052c;

    public m(String str, List list, boolean z4) {
        this.f9050a = str;
        this.f9051b = Collections.unmodifiableList(list);
        this.f9052c = z4;
    }
}
