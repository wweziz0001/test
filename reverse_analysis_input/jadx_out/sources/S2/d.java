package S2;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f2024l;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        g gVar = this.f2024l;
        if (i == -1) {
            gVar.a();
        }
        gVar.p("onAudioFocusChanged", Integer.valueOf(i));
    }
}
