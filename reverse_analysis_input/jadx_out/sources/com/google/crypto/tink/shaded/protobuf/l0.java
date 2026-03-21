package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f5229b = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean c(long j5, Object obj) {
        switch (this.f5229b) {
            case 0:
                if (o0.f5239f) {
                    if (o0.h(j5, obj) == 0) {
                    }
                } else if (o0.i(j5, obj) == 0) {
                }
                break;
            default:
                if (o0.f5239f) {
                    if (o0.h(j5, obj) == 0) {
                    }
                } else if (o0.i(j5, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final byte d(long j5, Object obj) {
        switch (this.f5229b) {
            case 0:
                if (!o0.f5239f) {
                }
                break;
            default:
                if (!o0.f5239f) {
                }
                break;
        }
        return o0.i(j5, obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final double e(long j5, Object obj) {
        switch (this.f5229b) {
        }
        return Double.longBitsToDouble(h(j5, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final float f(long j5, Object obj) {
        switch (this.f5229b) {
        }
        return Float.intBitsToFloat(g(j5, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void k(Object obj, long j5, boolean z4) {
        switch (this.f5229b) {
            case 0:
                if (!o0.f5239f) {
                    o0.q(obj, j5, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.p(obj, j5, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!o0.f5239f) {
                    o0.q(obj, j5, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.p(obj, j5, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void l(Object obj, long j5, byte b4) {
        switch (this.f5229b) {
            case 0:
                if (!o0.f5239f) {
                    o0.q(obj, j5, b4);
                } else {
                    o0.p(obj, j5, b4);
                }
                break;
            default:
                if (!o0.f5239f) {
                    o0.q(obj, j5, b4);
                } else {
                    o0.p(obj, j5, b4);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void m(Object obj, long j5, double d5) {
        switch (this.f5229b) {
            case 0:
                p(obj, j5, Double.doubleToLongBits(d5));
                break;
            default:
                p(obj, j5, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void n(Object obj, long j5, float f2) {
        switch (this.f5229b) {
            case 0:
                o(j5, obj, Float.floatToIntBits(f2));
                break;
            default:
                o(j5, obj, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean s() {
        switch (this.f5229b) {
        }
        return false;
    }
}
