package S2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2028b;

    public /* synthetic */ f(g gVar, int i) {
        this.f2027a = i;
        this.f2028b = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2027a) {
            case 0:
                N3.h.e(context, "context");
                N3.h.e(intent, "intent");
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f2028b.p("onBecomingNoisy", new Object[0]);
                }
                break;
            default:
                N3.h.e(context, "context");
                N3.h.e(intent, "intent");
                this.f2028b.p("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
