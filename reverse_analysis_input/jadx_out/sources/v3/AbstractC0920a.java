package v3;

import a0.AbstractC0158I;
import a0.InterfaceC0162M;
import h0.C0448G;
import h0.InterfaceC0467s;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0920a implements InterfaceC0162M {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10359l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10360m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0467s f10361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0935p f10362o;

    public AbstractC0920a(InterfaceC0467s interfaceC0467s, C0935p c0935p) {
        this.f10361n = interfaceC0467s;
        this.f10362o = c0935p;
    }

    public abstract void a();

    public final void b(boolean z4) throws IOException {
        if (this.f10359l == z4) {
            return;
        }
        this.f10359l = z4;
        C0933n c0933n = this.f10362o.f10395l;
        if (z4) {
            HashMap map = new HashMap();
            map.put("event", "bufferingStart");
            c0933n.success(map);
        } else {
            HashMap map2 = new HashMap();
            map2.put("event", "bufferingEnd");
            c0933n.success(map2);
        }
    }

    @Override // a0.InterfaceC0162M
    public final void onIsPlayingChanged(boolean z4) throws IOException {
        C0935p c0935p = this.f10362o;
        HashMap map = new HashMap();
        map.put("event", "isPlayingStateUpdate");
        map.put("isPlaying", Boolean.valueOf(z4));
        c0935p.f10395l.success(map);
    }

    @Override // a0.InterfaceC0162M
    public final void onPlaybackStateChanged(int i) throws IOException {
        C0933n c0933n = this.f10362o.f10395l;
        if (i == 2) {
            b(true);
            long jS = ((C0448G) this.f10361n).s();
            HashMap map = new HashMap();
            map.put("event", "bufferingUpdate");
            map.put("position", Long.valueOf(jS));
            c0933n.success(map);
        } else if (i != 3) {
            if (i == 4) {
                HashMap map2 = new HashMap();
                map2.put("event", "completed");
                c0933n.success(map2);
            }
        } else if (!this.f10360m) {
            this.f10360m = true;
            a();
        }
        if (i != 2) {
            b(false);
        }
    }

    @Override // a0.InterfaceC0162M
    public final void onPlayerError(AbstractC0158I abstractC0158I) throws IOException {
        b(false);
        if (abstractC0158I.f3217l != 1002) {
            this.f10362o.f10395l.error("VideoError", "Video player had error " + abstractC0158I, null);
            return;
        }
        Object obj = this.f10361n;
        L0.e eVar = (L0.e) obj;
        eVar.getClass();
        eVar.n(((C0448G) eVar).w(), -9223372036854775807L, false);
        ((C0448G) obj).K();
    }
}
