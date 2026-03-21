package S;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f1972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f1973b;

    public e(KeyListener keyListener) {
        A0.b bVar = new A0.b(27);
        this.f1972a = keyListener;
        this.f1973b = bVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1972a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1972a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z4;
        this.f1973b.getClass();
        if (i != 67 ? i != 112 ? false : Z1.c.a(editable, keyEvent, true) : Z1.c.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || this.f1972a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1972a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1972a.onKeyUp(view, editable, i, keyEvent);
    }
}
