package m3;

import a0.C0200z;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import n3.C0702l;
import n3.C0707q;
import n3.x;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0707q f8672a;

    public C0667a(f3.b bVar, int i) {
        switch (i) {
            case 1:
                C0200z c0200z = new C0200z(24);
                C0707q c0707q = new C0707q(bVar, "flutter/navigation", C0702l.f8937a, null);
                this.f8672a = c0707q;
                c0707q.b(c0200z);
                break;
            default:
                C0200z c0200z2 = new C0200z(22);
                C0707q c0707q2 = new C0707q(bVar, "flutter/backgesture", x.f8947a, null);
                this.f8672a = c0707q2;
                c0707q2.b(c0200z2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }
}
