package m3;

import java.util.HashMap;
import n3.C0707q;
import n3.x;

/* JADX INFO: renamed from: m3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0676j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f8714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0707q f8715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P2.c f8716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8718f;

    public C0676j(f3.b bVar, boolean z4) {
        C0707q c0707q = new C0707q(bVar, "flutter/restoration", x.f8947a, null);
        this.f8717e = false;
        this.f8718f = false;
        C0675i c0675i = new C0675i(this, 1);
        this.f8715c = c0707q;
        this.f8713a = z4;
        c0707q.b(c0675i);
    }

    public static HashMap a(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }
}
