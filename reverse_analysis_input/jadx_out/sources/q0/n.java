package q0;

import android.media.MediaCodec;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public class n extends g0.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9287l;

    public n(IllegalStateException illegalStateException, o oVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(oVar == null ? null : oVar.f9288a);
        super(sb.toString(), illegalStateException);
        boolean z4 = illegalStateException instanceof MediaCodec.CodecException;
        this.f9287l = AbstractC0370w.f5326a >= 23 ? z4 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC0370w.w(z4 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
