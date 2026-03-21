package com.ryanheise.just_audio;

import Z1.s;
import n3.InterfaceC0696f;
import n3.InterfaceC0697g;
import n3.InterfaceC0699i;

/* JADX INFO: loaded from: classes.dex */
public class BetterEventChannel implements InterfaceC0697g {
    private InterfaceC0697g eventSink;

    public BetterEventChannel(InterfaceC0696f interfaceC0696f, String str) {
        new s(interfaceC0696f, str).Q(new InterfaceC0699i() { // from class: com.ryanheise.just_audio.BetterEventChannel.1
            @Override // n3.InterfaceC0699i
            public void onCancel(Object obj) {
                BetterEventChannel.this.eventSink = null;
            }

            @Override // n3.InterfaceC0699i
            public void onListen(Object obj, InterfaceC0697g interfaceC0697g) {
                BetterEventChannel.this.eventSink = interfaceC0697g;
            }
        });
    }

    @Override // n3.InterfaceC0697g
    public void endOfStream() {
        InterfaceC0697g interfaceC0697g = this.eventSink;
        if (interfaceC0697g != null) {
            interfaceC0697g.endOfStream();
        }
    }

    @Override // n3.InterfaceC0697g
    public void error(String str, String str2, Object obj) {
        InterfaceC0697g interfaceC0697g = this.eventSink;
        if (interfaceC0697g != null) {
            interfaceC0697g.error(str, str2, obj);
        }
    }

    @Override // n3.InterfaceC0697g
    public void success(Object obj) {
        InterfaceC0697g interfaceC0697g = this.eventSink;
        if (interfaceC0697g != null) {
            interfaceC0697g.success(obj);
        }
    }
}
