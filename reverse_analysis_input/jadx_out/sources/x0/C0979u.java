package x0;

import F0.C0067n;
import a0.C0200z;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import b3.AbstractC0307a;
import h0.C0465p;
import java.util.HashMap;

/* JADX INFO: renamed from: x0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0067n f10797a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z1.e f10800d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0200z f10802f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10798b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10799c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10801e = true;

    public C0979u(C0067n c0067n, C0200z c0200z) {
        this.f10797a = c0067n;
        this.f10802f = c0200z;
    }

    public final l2.h a(int i) {
        l2.h hVar;
        l2.h c0465p;
        HashMap map = this.f10798b;
        l2.h hVar2 = (l2.h) map.get(Integer.valueOf(i));
        if (hVar2 != null) {
            return hVar2;
        }
        final Z1.e eVar = this.f10800d;
        eVar.getClass();
        if (i == 0) {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(G.class);
            final int i5 = 0;
            hVar = new l2.h() { // from class: x0.t
                @Override // l2.h
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return C0980v.d((Class) clsAsSubclass, eVar);
                        case 1:
                            return C0980v.d((Class) clsAsSubclass, eVar);
                        case 2:
                            return C0980v.d((Class) clsAsSubclass, eVar);
                        default:
                            return new Z(eVar, ((C0979u) clsAsSubclass).f10797a);
                    }
                }
            };
        } else if (i == 1) {
            final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(G.class);
            final int i6 = 1;
            hVar = new l2.h() { // from class: x0.t
                @Override // l2.h
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return C0980v.d((Class) clsAsSubclass2, eVar);
                        case 1:
                            return C0980v.d((Class) clsAsSubclass2, eVar);
                        case 2:
                            return C0980v.d((Class) clsAsSubclass2, eVar);
                        default:
                            return new Z(eVar, ((C0979u) clsAsSubclass2).f10797a);
                    }
                }
            };
        } else {
            if (i != 2) {
                if (i == 3) {
                    c0465p = new C0465p(RtspMediaSource$Factory.class.asSubclass(G.class), 4);
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(AbstractC0307a.i("Unrecognized contentType: ", i));
                    }
                    final int i7 = 3;
                    c0465p = new l2.h() { // from class: x0.t
                        @Override // l2.h
                        public final Object get() {
                            switch (i7) {
                                case 0:
                                    return C0980v.d((Class) this, eVar);
                                case 1:
                                    return C0980v.d((Class) this, eVar);
                                case 2:
                                    return C0980v.d((Class) this, eVar);
                                default:
                                    return new Z(eVar, ((C0979u) this).f10797a);
                            }
                        }
                    };
                }
                map.put(Integer.valueOf(i), c0465p);
                return c0465p;
            }
            final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(G.class);
            final int i8 = 2;
            hVar = new l2.h() { // from class: x0.t
                @Override // l2.h
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return C0980v.d((Class) clsAsSubclass3, eVar);
                        case 1:
                            return C0980v.d((Class) clsAsSubclass3, eVar);
                        case 2:
                            return C0980v.d((Class) clsAsSubclass3, eVar);
                        default:
                            return new Z(eVar, ((C0979u) clsAsSubclass3).f10797a);
                    }
                }
            };
        }
        c0465p = hVar;
        map.put(Integer.valueOf(i), c0465p);
        return c0465p;
    }
}
