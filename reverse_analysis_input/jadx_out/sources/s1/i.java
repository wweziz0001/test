package s1;

import R1.m;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m3.C0675i;
import t1.AbstractC0859a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9585b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f9589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f9590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f9591h;
    public boolean i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9594l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f9598p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9586c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9587d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9588e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9592j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9593k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9595m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0675i f9596n = new C0675i(20);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f9597o = new LinkedHashSet();

    public i(Context context, String str) {
        this.f9584a = context;
        this.f9585b = str;
    }

    public final void a(AbstractC0859a... abstractC0859aArr) {
        if (this.f9598p == null) {
            this.f9598p = new HashSet();
        }
        for (AbstractC0859a abstractC0859a : abstractC0859aArr) {
            HashSet hashSet = this.f9598p;
            N3.h.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC0859a.f10001a));
            HashSet hashSet2 = this.f9598p;
            N3.h.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC0859a.f10002b));
        }
        this.f9596n.g((AbstractC0859a[]) Arrays.copyOf(abstractC0859aArr, abstractC0859aArr.length));
    }
}
