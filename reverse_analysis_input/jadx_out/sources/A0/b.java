package A0;

import D0.B;
import F0.E;
import F0.InterfaceC0061h;
import F0.K;
import a0.C0157H;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import f0.C0414i;
import f0.C0424s;
import f0.C0427v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public class b implements B0.s, B0.o, B, InterfaceC0061h, F0.s, W {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile b f47m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static b f48n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f49l;

    public /* synthetic */ b(int i) {
        this.f49l = i;
    }

    public static B0.k m(B0.j jVar, A.j jVar2) {
        int i;
        IOException iOException = (IOException) jVar2.f27m;
        if (!(iOException instanceof C0427v) || ((i = ((C0427v) iOException).f5724o) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (jVar.a(1)) {
            return new B0.k(300000L, 1);
        }
        if (jVar.a(2)) {
            return new B0.k(60000L, 2);
        }
        return null;
    }

    public static long p(A.j jVar) {
        Throwable cause = (IOException) jVar.f27m;
        if (!(cause instanceof C0157H) && !(cause instanceof FileNotFoundException) && !(cause instanceof C0424s) && !(cause instanceof B0.q)) {
            int i = C0414i.f5672m;
            while (cause != null) {
                if (!(cause instanceof C0414i) || ((C0414i) cause).f5673l != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((jVar.f26l - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(S.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.b.r(S.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // androidx.lifecycle.W
    public T c(Class cls) {
        return new X.b();
    }

    @Override // F0.s
    public void d(E e5) {
        switch (this.f49l) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // B0.o
    public void e() {
        synchronized (C0.b.f280a) {
            Object obj = C0.b.f281b;
            synchronized (obj) {
                if (C0.b.f282c) {
                    return;
                }
                long jA = C0.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    C0.b.f283d = jA;
                    C0.b.f282c = true;
                }
            }
        }
    }

    @Override // F0.s
    public void j() {
        switch (this.f49l) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // F0.s
    public K k(int i, int i5) {
        switch (this.f49l) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new F0.o();
        }
    }

    public Object n(String str, Provider provider) {
        switch (this.f49l) {
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 9:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 10:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 11:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public int o(int i) {
        return i == 7 ? 6 : 3;
    }

    public android.content.pm.Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean s(CharSequence charSequence) {
        return false;
    }

    public b() {
        this.f49l = 29;
        C0640G c0640g = I.f8549m;
        b0 b0Var = b0.f8583p;
    }

    private final void l() {
    }

    @Override // B0.s
    public void a() {
    }

    @Override // D0.B
    public void f() {
    }

    @Override // B0.o
    public void g() {
    }

    @Override // D0.B
    public void h() {
    }

    private final void t(E e5) {
    }

    @Override // F0.InterfaceC0061h
    public long b(long j5) {
        return j5;
    }
}
