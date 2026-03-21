package com.ryanheise.audioservice;

import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5259m;

    public /* synthetic */ c(Object obj, int i) {
        this.f5258l = i;
        this.f5259m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5258l) {
            case 0:
                ((InterfaceC0706p) this.f5259m).success(null);
                break;
            case 1:
                ((InterfaceC0706p) this.f5259m).success(null);
                break;
            default:
                ((AudioService) this.f5259m).updateNotification();
                break;
        }
    }
}
