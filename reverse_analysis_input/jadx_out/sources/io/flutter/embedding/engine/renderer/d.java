package io.flutter.embedding.engine.renderer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.o f6630m;

    public /* synthetic */ d(io.flutter.view.o oVar, int i) {
        this.f6629l = i;
        this.f6630m = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6629l) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f6630m).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f6630m).getClass();
                break;
        }
    }
}
