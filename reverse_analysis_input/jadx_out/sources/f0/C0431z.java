package f0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: f0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431z implements InterfaceC0413h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0413h f5733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f5735n;

    public C0431z(InterfaceC0413h interfaceC0413h) {
        interfaceC0413h.getClass();
        this.f5733l = interfaceC0413h;
        this.f5735n = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        interfaceC0403A.getClass();
        this.f5733l.b(interfaceC0403A);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5733l.close();
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        InterfaceC0413h interfaceC0413h = this.f5733l;
        this.f5735n = c0417l.f5686a;
        Collections.emptyMap();
        try {
            return interfaceC0413h.p(c0417l);
        } finally {
            Uri uriR = interfaceC0413h.r();
            if (uriR != null) {
                this.f5735n = uriR;
            }
            interfaceC0413h.y();
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f5733l.r();
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) {
        int i6 = this.f5733l.read(bArr, i, i5);
        if (i6 != -1) {
            this.f5734m += (long) i6;
        }
        return i6;
    }

    @Override // f0.InterfaceC0413h
    public final Map y() {
        return this.f5733l.y();
    }
}
