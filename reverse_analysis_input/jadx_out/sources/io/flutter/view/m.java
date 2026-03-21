package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6959b;

    public m(View view, int i) {
        this.f6958a = view;
        this.f6959b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f6959b == mVar.f6959b && this.f6958a.equals(mVar.f6958a);
    }

    public final int hashCode() {
        return ((this.f6958a.hashCode() + 31) * 31) + this.f6959b;
    }
}
