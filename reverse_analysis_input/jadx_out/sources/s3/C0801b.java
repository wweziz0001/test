package s3;

import java.nio.ByteBuffer;
import n3.v;
import n3.w;

/* JADX INFO: renamed from: s3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801b extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0801b f9689d = new C0801b();

    @Override // n3.w
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        if (b4 != -127) {
            return super.f(b4, byteBuffer);
        }
        Object objE = e(byteBuffer);
        if (objE == null) {
            return null;
        }
        return EnumC0802c.values()[((Long) objE).intValue()];
    }

    @Override // n3.w
    public final void k(v vVar, Object obj) {
        if (!(obj instanceof EnumC0802c)) {
            super.k(vVar, obj);
        } else {
            vVar.write(129);
            k(vVar, obj == null ? null : Integer.valueOf(((EnumC0802c) obj).f9691l));
        }
    }
}
