package g1;

import O.j;
import Q1.C;
import android.graphics.Color;
import b3.AbstractC0307a;
import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f5819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5823h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5824j;

    public d(String str, int i, Integer num, Integer num2, float f2, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.f5816a = str;
        this.f5817b = i;
        this.f5818c = num;
        this.f5819d = num2;
        this.f5820e = f2;
        this.f5821f = z4;
        this.f5822g = z5;
        this.f5823h = z6;
        this.i = z7;
        this.f5824j = i5;
    }

    public static int a(String str) {
        boolean z4;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0307a.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e5) {
            AbstractC0360m.z("SsaStyle", "Failed to parse boolean value: '" + str + "'", e5);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j5 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0360m.c(j5 <= 4294967295L);
            return Integer.valueOf(Color.argb(C.g(((j5 >> 24) & 255) ^ 255), C.g(j5 & 255), C.g((j5 >> 8) & 255), C.g((j5 >> 16) & 255)));
        } catch (IllegalArgumentException e5) {
            AbstractC0360m.z("SsaStyle", "Failed to parse color expression: '" + str + "'", e5);
            return null;
        }
    }
}
