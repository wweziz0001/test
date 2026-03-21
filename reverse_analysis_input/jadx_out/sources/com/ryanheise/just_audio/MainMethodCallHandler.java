package com.ryanheise.just_audio;

import android.content.Context;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.C0704n;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public class MainMethodCallHandler implements InterfaceC0705o {
    private final Context applicationContext;
    private final InterfaceC0696f messenger;
    private final Map<String, AudioPlayer> players = new HashMap();

    public MainMethodCallHandler(Context context, InterfaceC0696f interfaceC0696f) {
        this.applicationContext = context;
        this.messenger = interfaceC0696f;
    }

    public void dispose() {
        Iterator it = new ArrayList(this.players.values()).iterator();
        while (it.hasNext()) {
            ((AudioPlayer) it.next()).dispose();
        }
        this.players.clear();
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        String str = c0704n.f8938a;
        str.getClass();
        switch (str) {
            case "init":
                String str2 = (String) c0704n.a("id");
                if (!this.players.containsKey(str2)) {
                    this.players.put(str2, new AudioPlayer(this.applicationContext, this.messenger, str2, (Map) c0704n.a("audioLoadConfiguration"), (List) c0704n.a("androidAudioEffects"), (Map) c0704n.a("androidAudioOffloadPreferences"), (Boolean) c0704n.a("androidOffloadSchedulingEnabled"), ((Boolean) c0704n.a("useLazyPreparation")).booleanValue()));
                    interfaceC0706p.success(null);
                    break;
                } else {
                    interfaceC0706p.error(AbstractC0307a.k("Platform player ", str2, " already exists"), null, null);
                    break;
                }
                break;
            case "disposePlayer":
                String str3 = (String) c0704n.a("id");
                AudioPlayer audioPlayer = this.players.get(str3);
                if (audioPlayer != null) {
                    audioPlayer.dispose();
                    this.players.remove(str3);
                }
                interfaceC0706p.success(new HashMap());
                break;
            case "disposeAllPlayers":
                dispose();
                interfaceC0706p.success(new HashMap());
                break;
            default:
                interfaceC0706p.notImplemented();
                break;
        }
    }
}
