package com.ryanheise.audioservice;

import com.ryanheise.audioservice.AudioServicePlugin;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0706p f5261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Exception f5262n;

    public /* synthetic */ d(InterfaceC0706p interfaceC0706p, Exception exc, int i) {
        this.f5260l = i;
        this.f5261m = interfaceC0706p;
        this.f5262n = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5260l) {
            case 0:
                AudioServicePlugin.AudioHandlerInterface.lambda$onMethodCall$4(this.f5261m, this.f5262n);
                break;
            default:
                AudioServicePlugin.AudioHandlerInterface.lambda$onMethodCall$1(this.f5261m, this.f5262n);
                break;
        }
    }
}
