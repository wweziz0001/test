package v3;

import F0.u;
import a0.C0150A;
import a0.C0153D;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import m2.b0;
import p1.b;
import t0.t;
import x0.C0980v;
import x0.G;
import x0.J;

/* JADX INFO: renamed from: v3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922c extends L0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0922c(String str, int i) {
        super(str);
        this.f10366b = i;
    }

    @Override // L0.e
    public final C0150A f() {
        switch (this.f10366b) {
            case 0:
                u uVar = new u();
                new A0.b();
                List listEmptyList = Collections.emptyList();
                b0 b0Var = b0.f8583p;
                C0195u c0195u = new C0195u();
                C0198x c0198x = C0198x.f3466a;
                String str = (String) this.f1479a;
                Uri uri = str == null ? null : Uri.parse(str);
                return new C0150A("", new C0194t(uVar), uri != null ? new C0197w(uri, null, null, listEmptyList, b0Var, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x);
            default:
                u uVar2 = new u();
                new A0.b();
                List listEmptyList2 = Collections.emptyList();
                b0 b0Var2 = b0.f8583p;
                C0195u c0195u2 = new C0195u();
                C0198x c0198x2 = C0198x.f3466a;
                String str2 = (String) this.f1479a;
                Uri uri2 = str2 == null ? null : Uri.parse(str2);
                return new C0150A("", new C0194t(uVar2), uri2 != null ? new C0197w(uri2, null, null, listEmptyList2, b0Var2, null, -9223372036854775807L) : null, new C0196v(c0195u2), C0153D.f3185B, c0198x2);
        }
    }

    @Override // L0.e
    public final G g(Context context) {
        switch (this.f10366b) {
            case 0:
                return new C0980v(context);
            default:
                return new G() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SocketFactory f4663a = SocketFactory.getDefault();

                    @Override // x0.G
                    public final J a(C0150A c0150a) {
                        c0150a.f3154b.getClass();
                        return new t(c0150a, new b(12), this.f4663a);
                    }
                };
        }
    }
}
