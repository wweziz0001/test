package io.flutter.embedding.android;

import a0.C0187m;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import n3.InterfaceC0695e;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class J implements L {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0696f f6532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f6533m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f6534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c4.i f6535o;

    public J(InterfaceC0696f interfaceC0696f) {
        HashMap map = new HashMap();
        this.f6534n = map;
        this.f6535o = new c4.i();
        this.f6532l = interfaceC0696f;
        N n4 = P.f6541a;
        O o4 = new O();
        o4.f6540a = false;
        O o5 = new O[]{o4}[0];
        o5.getClass();
        map.put(4294967556L, o5);
    }

    public final void a(G g5, final C0187m c0187m) {
        long j5;
        long j6;
        byte[] bytes = null;
        InterfaceC0695e interfaceC0695e = c0187m == null ? null : new InterfaceC0695e() { // from class: io.flutter.embedding.android.H
            @Override // n3.InterfaceC0695e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                c0187m.c(boolValueOf.booleanValue());
            }
        };
        try {
            String str = g5.f6525g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(g5.f6519a);
            int i = g5.f6520b;
            if (i == 1) {
                j5 = 0;
            } else if (i == 2) {
                j5 = 1;
            } else {
                if (i != 3) {
                    throw null;
                }
                j5 = 2;
            }
            byteBufferAllocateDirect.putLong(j5);
            byteBufferAllocateDirect.putLong(g5.f6521c);
            byteBufferAllocateDirect.putLong(g5.f6522d);
            byteBufferAllocateDirect.putLong(g5.f6523e ? 1L : 0L);
            int i5 = g5.f6524f;
            if (i5 == 1) {
                j6 = 0;
            } else if (i5 == 2) {
                j6 = 1;
            } else if (i5 == 3) {
                j6 = 2;
            } else if (i5 == 4) {
                j6 = 3;
            } else {
                if (i5 != 5) {
                    throw null;
                }
                j6 = 4;
            }
            byteBufferAllocateDirect.putLong(j6);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f6532l.h("flutter/keydata", byteBufferAllocateDirect, interfaceC0695e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z4, Long l3, Long l4, long j5) {
        G g5 = new G();
        g5.f6519a = j5;
        g5.f6520b = z4 ? 1 : 2;
        g5.f6522d = l3.longValue();
        g5.f6521c = l4.longValue();
        g5.f6525g = null;
        g5.f6523e = true;
        g5.f6524f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z4) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(g5, null);
    }

    public final void c(Long l3, Long l4) {
        HashMap map = this.f6533m;
        if (l4 != null) {
            if (((Long) map.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ed  */
    @Override // io.flutter.embedding.android.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(final android.view.KeyEvent r30, a0.C0187m r31) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.J.r(android.view.KeyEvent, a0.m):void");
    }
}
