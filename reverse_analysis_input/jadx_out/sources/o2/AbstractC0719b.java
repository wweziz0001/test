package o2;

import java.math.RoundingMode;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0719b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9116a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f9116a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9116a[RoundingMode.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9116a[RoundingMode.CEILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9116a[RoundingMode.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9116a[RoundingMode.UP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9116a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9116a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f9116a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
