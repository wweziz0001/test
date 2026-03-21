package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b3.AbstractC0307a;
import e3.InterfaceC0400i;
import e3.InterfaceC0401j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0400i, InterfaceC0401j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6843a;

    public /* synthetic */ a(Object obj) {
        this.f6843a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i;
        Z1.l lVar;
        ArrayList arrayList;
        int i5;
        g gVar;
        int i6;
        int i7;
        g gVar2;
        String str;
        String str2;
        float f2;
        float f5;
        View viewS;
        Integer num;
        k kVar;
        View viewS2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        k kVar2 = (k) this.f6843a;
        kVar2.getClass();
        ArrayList<g> arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            i = 14;
            lVar = kVar2.f6933e;
            if (!zHasRemaining) {
                break;
            }
            g gVarC = kVar2.c(byteBuffer.getInt());
            gVarC.f6878C = true;
            gVarC.f6884I = gVarC.f6917r;
            gVarC.f6885J = gVarC.f6915p;
            gVarC.f6879D = gVarC.f6903c;
            gVarC.f6880E = gVarC.f6904d;
            gVarC.f6881F = gVarC.f6907g;
            gVarC.f6882G = gVarC.f6908h;
            gVarC.f6883H = gVarC.f6911l;
            gVarC.f6903c = byteBuffer.getLong();
            gVarC.f6904d = byteBuffer.getInt();
            gVarC.f6905e = byteBuffer.getInt();
            gVarC.f6906f = byteBuffer.getInt();
            gVarC.f6907g = byteBuffer.getInt();
            gVarC.f6908h = byteBuffer.getInt();
            gVarC.i = byteBuffer.getInt();
            gVarC.f6909j = byteBuffer.getInt();
            gVarC.f6910k = byteBuffer.getInt();
            gVarC.f6911l = byteBuffer.getFloat();
            gVarC.f6912m = byteBuffer.getFloat();
            gVarC.f6913n = byteBuffer.getFloat();
            int i8 = byteBuffer.getInt();
            gVarC.f6914o = i8 == -1 ? null : strArr[i8];
            int i9 = byteBuffer.getInt();
            gVarC.f6915p = i9 == -1 ? null : strArr[i9];
            gVarC.f6916q = g.h(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            gVarC.f6917r = i10 == -1 ? null : strArr[i10];
            gVarC.f6918s = g.h(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            gVarC.f6919t = i11 == -1 ? null : strArr[i11];
            gVarC.f6920u = g.h(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            gVarC.f6921v = i12 == -1 ? null : strArr[i12];
            gVarC.f6922w = g.h(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            gVarC.f6923x = i13 == -1 ? null : strArr[i13];
            gVarC.y = g.h(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            gVarC.f6924z = i14 == -1 ? null : strArr[i14];
            int i15 = byteBuffer.getInt();
            gVarC.f6876A = i15 == -1 ? null : strArr[i15];
            byteBuffer.getInt();
            gVarC.f6886K = byteBuffer.getFloat();
            gVarC.f6887L = byteBuffer.getFloat();
            gVarC.M = byteBuffer.getFloat();
            gVarC.f6888N = byteBuffer.getFloat();
            if (gVarC.f6889O == null) {
                gVarC.f6889O = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                gVarC.f6889O[i16] = byteBuffer.getFloat();
            }
            gVarC.f6896V = true;
            gVarC.f6898X = true;
            int i17 = byteBuffer.getInt();
            ArrayList arrayList3 = gVarC.f6891Q;
            arrayList3.clear();
            ArrayList arrayList4 = gVarC.f6892R;
            arrayList4.clear();
            int i18 = 0;
            while (true) {
                kVar = gVarC.f6901a;
                if (i18 >= i17) {
                    break;
                }
                g gVarC2 = kVar.c(byteBuffer.getInt());
                gVarC2.f6890P = gVarC;
                arrayList3.add(gVarC2);
                i18++;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                g gVarC3 = kVar.c(byteBuffer.getInt());
                gVarC3.f6890P = gVarC;
                arrayList4.add(gVarC3);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                gVarC.f6893S = null;
            } else {
                ArrayList arrayList5 = gVarC.f6893S;
                if (arrayList5 == null) {
                    gVarC.f6893S = new ArrayList(i20);
                } else {
                    arrayList5.clear();
                }
                for (int i21 = 0; i21 < i20; i21++) {
                    e eVarB = kVar.b(byteBuffer.getInt());
                    int i22 = eVarB.f6872c;
                    if (i22 == 1) {
                        gVarC.f6894T = eVarB;
                    } else if (i22 == 2) {
                        gVarC.f6895U = eVarB;
                    } else {
                        gVarC.f6893S.add(eVarB);
                    }
                    gVarC.f6893S.add(eVarB);
                }
            }
            if (!gVarC.i(14)) {
                if (gVarC.i(6)) {
                    kVar2.f6940m = gVarC;
                }
                if (gVarC.f6878C) {
                    arrayList2.add(gVarC);
                }
                int i23 = gVarC.i;
                if (i23 != -1 && !lVar.g0(i23) && (viewS2 = lVar.S(gVarC.i)) != null) {
                    viewS2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = kVar2.f6935g;
        g gVar3 = (g) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (gVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            gVar3.m(fArr, hashSet, false);
            gVar3.d(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        g gVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = kVar2.f6943p;
            if (!zHasNext) {
                break;
            }
            g gVar5 = (g) it.next();
            if (!arrayList.contains(Integer.valueOf(gVar5.f6902b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && arrayList6.size() > 0) {
            gVar4 = (g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f6902b != kVar2.f6944q || arrayList6.size() != arrayList.size())) {
            kVar2.f6944q = gVar4.f6902b;
            String strG = gVar4.g();
            if (strG == null) {
                strG = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                kVar2.f6929a.setAccessibilityPaneTitle(strG);
            } else {
                AccessibilityEvent accessibilityEventD = kVar2.d(gVar4.f6902b, 32);
                accessibilityEventD.getText().add(strG);
                kVar2.h(accessibilityEventD);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it2.next()).f6902b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i5 = 4;
            if (!it3.hasNext()) {
                break;
            }
            g gVar6 = (g) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f6890P = null;
                if (gVar6.i != -1 && (num = kVar2.f6937j) != null && kVar2.f6932d.platformViewOfNode(num.intValue()) == lVar.S(gVar6.i)) {
                    kVar2.g(kVar2.f6937j.intValue(), 65536);
                    kVar2.f6937j = null;
                }
                int i24 = gVar6.i;
                if (i24 != -1 && (viewS = lVar.S(i24)) != null) {
                    viewS.setImportantForAccessibility(4);
                }
                g gVar7 = kVar2.i;
                if (gVar7 == gVar6) {
                    kVar2.g(gVar7.f6902b, 65536);
                    kVar2.i = null;
                }
                if (kVar2.f6940m == gVar6) {
                    kVar2.f6940m = null;
                }
                if (kVar2.f6942o == gVar6) {
                    kVar2.f6942o = null;
                }
                it3.remove();
            }
        }
        int i25 = 2048;
        int i26 = 0;
        AccessibilityEvent accessibilityEventD2 = kVar2.d(0, 2048);
        accessibilityEventD2.setContentChangeTypes(1);
        kVar2.h(accessibilityEventD2);
        for (g gVar8 : arrayList2) {
            if (!Float.isNaN(gVar8.f6911l) && !Float.isNaN(gVar8.f6883H) && gVar8.f6883H != gVar8.f6911l) {
                AccessibilityEvent accessibilityEventD3 = kVar2.d(gVar8.f6902b, 4096);
                float f6 = gVar8.f6911l;
                float f7 = gVar8.f6912m;
                if (Float.isInfinite(f7)) {
                    if (f6 > 70000.0f) {
                        f6 = 70000.0f;
                    }
                    f7 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f6913n)) {
                    f2 = f7 + 100000.0f;
                    if (f6 < -70000.0f) {
                        f6 = -70000.0f;
                    }
                    f5 = f6 + 100000.0f;
                } else {
                    float f8 = gVar8.f6913n;
                    f2 = f7 - f8;
                    f5 = f6 - f8;
                }
                if (g.c(gVar8, d.f6860q) || g.c(gVar8, d.f6861r)) {
                    accessibilityEventD3.setScrollY((int) f5);
                    accessibilityEventD3.setMaxScrollY((int) f2);
                } else if (g.c(gVar8, d.f6858o) || g.c(gVar8, d.f6859p)) {
                    accessibilityEventD3.setScrollX((int) f5);
                    accessibilityEventD3.setMaxScrollX((int) f2);
                }
                int i27 = gVar8.f6909j;
                if (i27 > 0) {
                    accessibilityEventD3.setItemCount(i27);
                    accessibilityEventD3.setFromIndex(gVar8.f6910k);
                    Iterator it4 = gVar8.f6892R.iterator();
                    int i28 = i26;
                    while (it4.hasNext()) {
                        if (!((g) it4.next()).i(i)) {
                            i28++;
                        }
                    }
                    accessibilityEventD3.setToIndex((gVar8.f6910k + i28) - 1);
                }
                kVar2.h(accessibilityEventD3);
            }
            if (gVar8.i(16) && (((str = gVar8.f6915p) != null || gVar8.f6885J != null) && (str == null || (str2 = gVar8.f6885J) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventD4 = kVar2.d(gVar8.f6902b, i25);
                accessibilityEventD4.setContentChangeTypes(1);
                kVar2.h(accessibilityEventD4);
            }
            g gVar9 = kVar2.i;
            if (gVar9 != null && gVar9.f6902b == gVar8.f6902b && (gVar8.f6879D & ((long) AbstractC0307a.c(3))) == 0 && gVar8.i(3)) {
                AccessibilityEvent accessibilityEventD5 = kVar2.d(gVar8.f6902b, i5);
                accessibilityEventD5.getText().add(gVar8.f6915p);
                kVar2.h(accessibilityEventD5);
            }
            g gVar10 = kVar2.f6940m;
            if (gVar10 != null && (i6 = gVar10.f6902b) == (i7 = gVar8.f6902b) && ((gVar2 = kVar2.f6941n) == null || gVar2.f6902b != i6)) {
                kVar2.f6941n = gVar10;
                kVar2.h(kVar2.d(i7, 8));
            } else if (gVar10 == null) {
                kVar2.f6941n = null;
            }
            g gVar11 = kVar2.f6940m;
            if (gVar11 != null && gVar11.f6902b == gVar8.f6902b && (gVar8.f6879D & ((long) AbstractC0307a.c(5))) != 0 && gVar8.i(5) && ((gVar = kVar2.i) == null || gVar.f6902b == kVar2.f6940m.f6902b)) {
                String str3 = gVar8.f6884I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = gVar8.f6917r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventD6 = kVar2.d(gVar8.f6902b, 16);
                accessibilityEventD6.setBeforeText(str3);
                accessibilityEventD6.getText().add(str5);
                int i29 = 0;
                while (i29 < str3.length() && i29 < str5.length() && str3.charAt(i29) == str5.charAt(i29)) {
                    i29++;
                }
                if (i29 < str3.length() || i29 < str5.length()) {
                    accessibilityEventD6.setFromIndex(i29);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i29 && length2 >= i29 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventD6.setRemovedCount((length - i29) + 1);
                    accessibilityEventD6.setAddedCount((length2 - i29) + 1);
                } else {
                    accessibilityEventD6 = null;
                }
                if (accessibilityEventD6 != null) {
                    kVar2.h(accessibilityEventD6);
                }
                if (gVar8.f6881F != gVar8.f6907g || gVar8.f6882G != gVar8.f6908h) {
                    AccessibilityEvent accessibilityEventD7 = kVar2.d(gVar8.f6902b, 8192);
                    accessibilityEventD7.getText().add(str5);
                    accessibilityEventD7.setFromIndex(gVar8.f6907g);
                    accessibilityEventD7.setToIndex(gVar8.f6908h);
                    accessibilityEventD7.setItemCount(str5.length());
                    kVar2.h(accessibilityEventD7);
                }
            }
            i25 = 2048;
            i26 = 0;
            i5 = 4;
            i = 14;
        }
    }
}
