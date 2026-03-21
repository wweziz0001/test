package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234a implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4346h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f4349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f4350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f4351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final L f4353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4355r;

    public C0234a(L l3) {
        l3.G();
        C0254v c0254v = l3.f4272v;
        if (c0254v != null) {
            c0254v.f4459r.getClassLoader();
        }
        this.f4339a = new ArrayList();
        this.f4352o = false;
        this.f4355r = -1;
        this.f4353p = l3;
    }

    @Override // androidx.fragment.app.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4345g) {
            return true;
        }
        this.f4353p.f4255d.add(this);
        return true;
    }

    public final void b(int i, r rVar, String str) {
        String str2 = rVar.f4431W;
        if (str2 != null) {
            V.d.c(rVar, str2);
        }
        Class<?> cls = rVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = rVar.f4419J;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + rVar + ": was " + rVar.f4419J + " now " + str);
            }
            rVar.f4419J = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + rVar + " with tag " + str + " to container view with no id");
            }
            int i5 = rVar.f4417H;
            if (i5 != 0 && i5 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + rVar + ": was " + rVar.f4417H + " now " + i);
            }
            rVar.f4417H = i;
            rVar.f4418I = i;
        }
        U u4 = new U(1, rVar);
        this.f4339a.add(u4);
        u4.f4313d = this.f4340b;
        u4.f4314e = this.f4341c;
        u4.f4315f = this.f4342d;
        u4.f4316g = this.f4343e;
        rVar.f4413D = this.f4353p;
    }

    public final void c(int i) {
        if (this.f4345g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f4339a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                U u4 = (U) arrayList.get(i5);
                r rVar = u4.f4311b;
                if (rVar != null) {
                    rVar.f4412C += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + u4.f4311b + " to " + u4.f4311b.f4412C);
                    }
                }
            }
        }
    }

    public final void d() {
        if (this.f4354q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new W());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.f4354q = true;
        boolean z4 = this.f4345g;
        L l3 = this.f4353p;
        if (z4) {
            this.f4355r = l3.f4260j.getAndIncrement();
        } else {
            this.f4355r = -1;
        }
        l3.x(this);
    }

    public final void e(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4346h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4355r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4354q);
            if (this.f4344f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4344f));
            }
            if (this.f4340b != 0 || this.f4341c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4340b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4341c));
            }
            if (this.f4342d != 0 || this.f4343e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4342d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4343e));
            }
            if (this.i != 0 || this.f4347j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4347j);
            }
            if (this.f4348k != 0 || this.f4349l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4348k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4349l);
            }
        }
        ArrayList arrayList = this.f4339a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            U u4 = (U) arrayList.get(i);
            switch (u4.f4310a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + u4.f4310a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(u4.f4311b);
            if (z4) {
                if (u4.f4313d != 0 || u4.f4314e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(u4.f4313d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(u4.f4314e));
                }
                if (u4.f4315f != 0 || u4.f4316g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(u4.f4315f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(u4.f4316g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4355r >= 0) {
            sb.append(" #");
            sb.append(this.f4355r);
        }
        if (this.f4346h != null) {
            sb.append(" ");
            sb.append(this.f4346h);
        }
        sb.append("}");
        return sb.toString();
    }
}
