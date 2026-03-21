package v1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: v1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911a implements InterfaceC0915e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10344a;

    public C0911a(C0916f c0916f) {
        N3.h.e(c0916f, "registry");
        this.f10344a = new LinkedHashSet();
        c0916f.c("androidx.savedstate.Restarter", this);
    }

    @Override // v1.InterfaceC0915e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f10344a));
        return bundle;
    }
}
