package t;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: t.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0822k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconCompat f9738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f9739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f9740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f9742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f9743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9745h;
    public boolean i;

    public C0822k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f9741d = true;
        this.f9745h = true;
        this.f9738a = iconCompat;
        this.f9739b = r.b(charSequence);
        this.f9740c = pendingIntent;
        this.f9742e = bundle;
        this.f9743f = null;
        this.f9741d = true;
        this.f9744g = 0;
        this.f9745h = true;
        this.i = false;
    }

    public final C0823l a() {
        CharSequence[] charSequenceArr;
        if (this.i && this.f9740c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0> arrayList3 = this.f9743f;
        if (arrayList3 != null) {
            for (c0 c0Var : arrayList3) {
                if (c0Var.f9734c || (!((charSequenceArr = c0Var.f9733b) == null || charSequenceArr.length == 0) || c0Var.f9736e.isEmpty())) {
                    arrayList2.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
        }
        return new C0823l(this.f9738a, this.f9739b, this.f9740c, this.f9742e, arrayList2.isEmpty() ? null : (c0[]) arrayList2.toArray(new c0[arrayList2.size()]), arrayList.isEmpty() ? null : (c0[]) arrayList.toArray(new c0[arrayList.size()]), this.f9741d, this.f9744g, this.f9745h, this.i);
    }
}
