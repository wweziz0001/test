package d0;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: d0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f5319a;

    public final void a() {
        this.f5319a = null;
        ArrayList arrayList = C0367t.f5320b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f5319a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
