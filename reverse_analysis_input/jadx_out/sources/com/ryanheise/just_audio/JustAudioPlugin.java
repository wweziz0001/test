package com.ryanheise.just_audio;

import android.content.Context;
import e3.InterfaceC0393b;
import j3.C0524a;
import n3.C0707q;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public class JustAudioPlugin implements j3.b {
    private C0707q channel;
    private MainMethodCallHandler methodCallHandler;

    @Override // j3.b
    public void onAttachedToEngine(C0524a c0524a) {
        Context context = c0524a.f7453a;
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        this.methodCallHandler = new MainMethodCallHandler(context, interfaceC0696f);
        C0707q c0707q = new C0707q(interfaceC0696f, "com.ryanheise.just_audio.methods");
        this.channel = c0707q;
        c0707q.b(this.methodCallHandler);
        c0524a.f7454b.f5624u.add(new InterfaceC0393b() { // from class: com.ryanheise.just_audio.JustAudioPlugin.1
            @Override // e3.InterfaceC0393b
            public void onEngineWillDestroy() {
            }

            @Override // e3.InterfaceC0393b
            public void onPreEngineRestart() {
                JustAudioPlugin.this.methodCallHandler.dispose();
            }
        });
    }

    @Override // j3.b
    public void onDetachedFromEngine(C0524a c0524a) {
        this.methodCallHandler.dispose();
        this.methodCallHandler = null;
        this.channel.b(null);
    }
}
