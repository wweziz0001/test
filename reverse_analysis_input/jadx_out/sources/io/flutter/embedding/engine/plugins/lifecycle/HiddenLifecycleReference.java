package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.AbstractC0274p;
import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class HiddenLifecycleReference {
    private final AbstractC0274p lifecycle;

    public HiddenLifecycleReference(AbstractC0274p abstractC0274p) {
        this.lifecycle = abstractC0274p;
    }

    public AbstractC0274p getLifecycle() {
        return this.lifecycle;
    }
}
