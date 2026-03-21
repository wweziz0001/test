package b3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.crypto.tink.shaded.protobuf.C0332l;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.HashMap;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0307a {
    public static /* synthetic */ int A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("REPLACE")) {
            return 1;
        }
        if (str.equals("KEEP")) {
            return 2;
        }
        if (str.equals("UPDATE")) {
            return 3;
        }
        if (str.equals("CANCEL_AND_REENQUEUE")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant androidx.work.ExistingPeriodicWorkPolicy.".concat(str));
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("REPLACE")) {
            return 1;
        }
        if (str.equals("KEEP")) {
            return 2;
        }
        if (str.equals("APPEND")) {
            return 3;
        }
        if (str.equals("APPEND_OR_REPLACE")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant androidx.work.ExistingWorkPolicy.".concat(str));
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NOT_REQUIRED")) {
            return 1;
        }
        if (str.equals("CONNECTED")) {
            return 2;
        }
        if (str.equals("UNMETERED")) {
            return 3;
        }
        if (str.equals("NOT_ROAMING")) {
            return 4;
        }
        if (str.equals("METERED")) {
            return 5;
        }
        if (str.equals("TEMPORARILY_UNMETERED")) {
            return 6;
        }
        throw new IllegalArgumentException("No enum constant androidx.work.NetworkType.".concat(str));
    }

    public static final void a(int i, View view, ViewGroup viewGroup) {
        N3.h.e(view, "view");
        N3.h.e(viewGroup, "container");
        int iB = O.i.b(i);
        if (iB == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iB == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iB != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final boolean b(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static int d(int i, int i5, int i6, int i7) {
        return C0332l.m0(i) + i5 + i6 + i7;
    }

    public static int e(int i, String str, int i5) {
        return (str.hashCode() + i) * i5;
    }

    public static int f(long j5, int i, int i5) {
        return (Long.hashCode(j5) + i) * i5;
    }

    public static String g(int i, int i5, String str, String str2) {
        return str + i + str2 + i5;
    }

    public static String h(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String i(String str, int i) {
        return str + i;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void n(int i, int i5, int i6, int i7, int i8) {
        AbstractC0370w.G(i);
        AbstractC0370w.G(i5);
        AbstractC0370w.G(i6);
        AbstractC0370w.G(i7);
        AbstractC0370w.G(i8);
    }

    public static void o(int i, String str, String str2) {
        AbstractC0360m.y(str2, str + i);
    }

    public static void p(int i, HashMap map, String str, int i5, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i5));
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void r(String str, int i) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = N3.h.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            N3.h.f(nullPointerException, N3.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void s(String str, String str2, String str3) {
        AbstractC0360m.y(str3, str + str2);
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? "null" : "LINEAR" : "EXPONENTIAL";
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
