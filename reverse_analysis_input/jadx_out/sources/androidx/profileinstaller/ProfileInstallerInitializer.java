package androidx.profileinstaller;

import A1.b;
import D0.y;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import p1.g;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // A1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // A1.b
    public final Object b(Context context) {
        g.a(new y(this, 20, context.getApplicationContext()));
        return new p1.b(1);
    }
}
