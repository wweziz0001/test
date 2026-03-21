package j0;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import androidx.lifecycle.E;
import h0.C0449H;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z1.s f7348a;

    public u(Z1.s sVar) {
        this.f7348a = sVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        v vVar;
        E e5;
        C0449H c0449h;
        if (audioTrack.equals(((v) this.f7348a.f3087o).f7406v) && (e5 = (vVar = (v) this.f7348a.f3087o).f7402r) != null && vVar.f7372V && (c0449h = ((x) e5.f4474m).f9330Q) != null) {
            c0449h.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((v) this.f7348a.f3087o).f7406v)) {
            ((v) this.f7348a.f3087o).f7371U = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        v vVar;
        E e5;
        C0449H c0449h;
        if (audioTrack.equals(((v) this.f7348a.f3087o).f7406v) && (e5 = (vVar = (v) this.f7348a.f3087o).f7402r) != null && vVar.f7372V && (c0449h = ((x) e5.f4474m).f9330Q) != null) {
            c0449h.a();
        }
    }
}
