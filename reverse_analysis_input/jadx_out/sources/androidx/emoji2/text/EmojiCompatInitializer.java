package androidx.emoji2.text;

import A1.a;
import A1.b;
import Q.j;
import Q.k;
import Q.n;
import Q.s;
import android.content.Context;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.InterfaceC0278u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // A1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // A1.b
    public final Object b(Context context) {
        Object objB;
        s sVar = new s(new n(context, 0));
        sVar.f1751b = 1;
        if (j.f1713j == null) {
            synchronized (j.i) {
                try {
                    if (j.f1713j == null) {
                        j.f1713j = new j(sVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f169e) {
            try {
                objB = aVarC.f170a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0274p lifecycle = ((InterfaceC0278u) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
