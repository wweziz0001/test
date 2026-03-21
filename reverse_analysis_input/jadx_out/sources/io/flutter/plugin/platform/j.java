package io.flutter.plugin.platform;

import android.view.View;
import n3.C0707q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6768c;

    public /* synthetic */ j(int i, int i5, Object obj) {
        this.f6766a = i5;
        this.f6768c = obj;
        this.f6767b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f6766a) {
            case 0:
                p pVar = (p) this.f6768c;
                int i = this.f6767b;
                if (!z4) {
                    io.flutter.plugin.editing.i iVar = pVar.f6800g;
                    if (iVar != null) {
                        iVar.b(i);
                    }
                    break;
                } else {
                    C0707q c0707q = (C0707q) pVar.f6801h.f3001m;
                    if (c0707q != null) {
                        c0707q.a("viewFocused", Integer.valueOf(i), null);
                        break;
                    }
                }
                break;
            default:
                o oVar = (o) this.f6768c;
                int i5 = this.f6767b;
                if (!z4) {
                    io.flutter.plugin.editing.i iVar2 = oVar.f6783f;
                    if (iVar2 != null) {
                        iVar2.b(i5);
                    }
                    break;
                } else {
                    C0707q c0707q2 = (C0707q) oVar.f6784g.f2996l;
                    if (c0707q2 != null) {
                        c0707q2.a("viewFocused", Integer.valueOf(i5), null);
                        break;
                    }
                }
                break;
        }
    }
}
