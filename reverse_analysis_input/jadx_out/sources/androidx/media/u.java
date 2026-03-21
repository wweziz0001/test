package androidx.media;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4626d;

    public u(String str) {
        this.f4623a = str;
    }

    public void a() {
        boolean z4 = this.f4624b;
        String str = this.f4623a;
        if (z4) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + ((Object) str));
        }
        if (this.f4625c) {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + ((Object) str));
        }
        if (!this.f4626d) {
            this.f4624b = true;
        } else {
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + ((Object) str));
        }
    }

    public final boolean b() {
        return this.f4624b || this.f4625c || this.f4626d;
    }

    public void c(Bundle bundle) {
        throw new UnsupportedOperationException("It is not supported to send an error for " + ((Object) this.f4623a));
    }

    public abstract void d(Object obj);

    public final void e(Bundle bundle) {
        if (this.f4625c || this.f4626d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + ((Object) this.f4623a));
        }
        this.f4626d = true;
        c(bundle);
    }

    public final void f(Object obj) {
        if (this.f4625c || this.f4626d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + ((Object) this.f4623a));
        }
        this.f4625c = true;
        d(obj);
    }
}
