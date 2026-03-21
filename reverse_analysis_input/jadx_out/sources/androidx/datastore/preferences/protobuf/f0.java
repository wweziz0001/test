package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f4143b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j5, Object obj) {
        switch (this.f4143b) {
            case 0:
                if (!i0.f4167f) {
                }
                break;
            default:
                if (!i0.f4167f) {
                }
                break;
        }
        return i0.c(j5, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j5, Object obj) {
        switch (this.f4143b) {
        }
        return Double.longBitsToDouble(g(j5, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j5, Object obj) {
        switch (this.f4143b) {
        }
        return Float.intBitsToFloat(f(j5, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j5, boolean z4) {
        switch (this.f4143b) {
            case 0:
                if (!i0.f4167f) {
                    i0.l(obj, j5, z4 ? (byte) 1 : (byte) 0);
                } else {
                    i0.k(obj, j5, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i0.f4167f) {
                    i0.l(obj, j5, z4 ? (byte) 1 : (byte) 0);
                } else {
                    i0.k(obj, j5, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j5, byte b4) {
        switch (this.f4143b) {
            case 0:
                if (!i0.f4167f) {
                    i0.l(obj, j5, b4);
                } else {
                    i0.k(obj, j5, b4);
                }
                break;
            default:
                if (!i0.f4167f) {
                    i0.l(obj, j5, b4);
                } else {
                    i0.k(obj, j5, b4);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j5, double d5) {
        switch (this.f4143b) {
            case 0:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j5, float f2) {
        switch (this.f4143b) {
            case 0:
                n(j5, obj, Float.floatToIntBits(f2));
                break;
            default:
                n(j5, obj, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f4143b) {
        }
        return false;
    }
}
