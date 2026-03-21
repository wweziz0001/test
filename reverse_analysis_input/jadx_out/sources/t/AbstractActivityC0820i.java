package t;

import D.InterfaceC0005e;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.InterfaceC0278u;
import b3.AbstractC0307a;
import q.C0739i;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0820i extends Activity implements InterfaceC0278u, InterfaceC0005e {
    private final C0739i extraDataMap = new C0739i();
    private final C0280w lifecycleRegistry = new C0280w(this);

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.AbstractActivityC0820i.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        N3.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        N3.h.d(decorView, "window.decorView");
        if (Q1.C.X(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends AbstractC0819h> T getExtraData(Class<T> cls) {
        N3.h.e(cls, "extraDataClass");
        AbstractC0307a.q(this.extraDataMap.getOrDefault(cls, null));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = androidx.lifecycle.I.f4484m;
        androidx.lifecycle.M.g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        N3.h.e(bundle, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(AbstractC0819h abstractC0819h) {
        N3.h.e(abstractC0819h, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5c
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L5c
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L4c;
                case 100470631: goto L3c;
                case 472614934: goto L33;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5c
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L5c
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L5c
        L21:
            r1 = r0
            goto L5c
        L23:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2c
            goto L5c
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L5c
            goto L21
        L33:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L3c:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L5c
            goto L21
        L4c:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L55
            goto L5c
        L55:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L5c
            goto L21
        L5c:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t.AbstractActivityC0820i.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // D.InterfaceC0005e
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        N3.h.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
