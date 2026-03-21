package t;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import x.AbstractC0953b;

/* JADX INFO: renamed from: t.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f9746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f9747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0[] f9748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9753h;
    public final CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f9754j;

    public C0823l(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, c0[] c0VarArr, c0[] c0VarArr2, boolean z4, int i, boolean z5, boolean z6) {
        this.f9750e = true;
        this.f9747b = iconCompat;
        if (iconCompat != null) {
            int i5 = iconCompat.f4018a;
            if ((i5 == -1 ? AbstractC0953b.c(iconCompat.f4019b) : i5) == 2) {
                this.f9753h = iconCompat.h();
            }
        }
        this.i = r.b(charSequence);
        this.f9754j = pendingIntent;
        this.f9746a = bundle == null ? new Bundle() : bundle;
        this.f9748c = c0VarArr;
        this.f9749d = z4;
        this.f9751f = i;
        this.f9750e = z5;
        this.f9752g = z6;
    }

    public final IconCompat a() {
        int i;
        if (this.f9747b == null && (i = this.f9753h) != 0) {
            this.f9747b = IconCompat.g(null, "", i);
        }
        return this.f9747b;
    }
}
