package q0;

import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f9285l = new j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f9286m = new j();

    @Override // q0.x
    public int a(Object obj) {
        String str = ((o) obj).f9288a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC0370w.f5326a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
