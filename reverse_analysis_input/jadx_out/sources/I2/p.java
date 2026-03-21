package I2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f1063t = new l(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Comparator f1064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f1066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f1069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f1070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f1071s;

    public p(boolean z4) {
        l lVar = f1063t;
        this.f1067o = 0;
        this.f1068p = 0;
        this.f1064l = lVar;
        this.f1065m = z4;
        this.f1069q = new o(z4);
    }

    public final o a(Object obj, boolean z4) {
        int iCompareTo;
        o oVar;
        o oVar2 = this.f1066n;
        l lVar = f1063t;
        Comparator comparator = this.f1064l;
        if (oVar2 != null) {
            Comparable comparable = comparator == lVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oVar2.f1059q;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return oVar2;
                }
                o oVar3 = iCompareTo < 0 ? oVar2.f1055m : oVar2.f1056n;
                if (oVar3 == null) {
                    break;
                }
                oVar2 = oVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z4) {
            return null;
        }
        o oVar4 = this.f1069q;
        if (oVar2 != null) {
            oVar = new o(this.f1065m, oVar2, obj, oVar4, oVar4.f1058p);
            if (iCompareTo < 0) {
                oVar2.f1055m = oVar;
            } else {
                oVar2.f1056n = oVar;
            }
            b(oVar2, true);
        } else {
            if (comparator == lVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            oVar = new o(this.f1065m, oVar2, obj, oVar4, oVar4.f1058p);
            this.f1066n = oVar;
        }
        this.f1067o++;
        this.f1068p++;
        return oVar;
    }

    public final void b(o oVar, boolean z4) {
        while (oVar != null) {
            o oVar2 = oVar.f1055m;
            o oVar3 = oVar.f1056n;
            int i = oVar2 != null ? oVar2.f1062t : 0;
            int i5 = oVar3 != null ? oVar3.f1062t : 0;
            int i6 = i - i5;
            if (i6 == -2) {
                o oVar4 = oVar3.f1055m;
                o oVar5 = oVar3.f1056n;
                int i7 = (oVar4 != null ? oVar4.f1062t : 0) - (oVar5 != null ? oVar5.f1062t : 0);
                if (i7 == -1 || (i7 == 0 && !z4)) {
                    e(oVar);
                } else {
                    f(oVar3);
                    e(oVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 2) {
                o oVar6 = oVar2.f1055m;
                o oVar7 = oVar2.f1056n;
                int i8 = (oVar6 != null ? oVar6.f1062t : 0) - (oVar7 != null ? oVar7.f1062t : 0);
                if (i8 == 1 || (i8 == 0 && !z4)) {
                    f(oVar);
                } else {
                    e(oVar2);
                    f(oVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 0) {
                oVar.f1062t = i + 1;
                if (z4) {
                    return;
                }
            } else {
                oVar.f1062t = Math.max(i, i5) + 1;
                if (!z4) {
                    return;
                }
            }
            oVar = oVar.f1054l;
        }
    }

    public final void c(o oVar, boolean z4) {
        o oVar2;
        o oVar3;
        int i;
        if (z4) {
            o oVar4 = oVar.f1058p;
            oVar4.f1057o = oVar.f1057o;
            oVar.f1057o.f1058p = oVar4;
        }
        o oVar5 = oVar.f1055m;
        o oVar6 = oVar.f1056n;
        o oVar7 = oVar.f1054l;
        int i5 = 0;
        if (oVar5 == null || oVar6 == null) {
            if (oVar5 != null) {
                d(oVar, oVar5);
                oVar.f1055m = null;
            } else if (oVar6 != null) {
                d(oVar, oVar6);
                oVar.f1056n = null;
            } else {
                d(oVar, null);
            }
            b(oVar7, false);
            this.f1067o--;
            this.f1068p++;
            return;
        }
        if (oVar5.f1062t > oVar6.f1062t) {
            o oVar8 = oVar5.f1056n;
            while (true) {
                o oVar9 = oVar8;
                oVar3 = oVar5;
                oVar5 = oVar9;
                if (oVar5 == null) {
                    break;
                } else {
                    oVar8 = oVar5.f1056n;
                }
            }
        } else {
            o oVar10 = oVar6.f1055m;
            while (true) {
                oVar2 = oVar6;
                oVar6 = oVar10;
                if (oVar6 == null) {
                    break;
                } else {
                    oVar10 = oVar6.f1055m;
                }
            }
            oVar3 = oVar2;
        }
        c(oVar3, false);
        o oVar11 = oVar.f1055m;
        if (oVar11 != null) {
            i = oVar11.f1062t;
            oVar3.f1055m = oVar11;
            oVar11.f1054l = oVar3;
            oVar.f1055m = null;
        } else {
            i = 0;
        }
        o oVar12 = oVar.f1056n;
        if (oVar12 != null) {
            i5 = oVar12.f1062t;
            oVar3.f1056n = oVar12;
            oVar12.f1054l = oVar3;
            oVar.f1056n = null;
        }
        oVar3.f1062t = Math.max(i, i5) + 1;
        d(oVar, oVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1066n = null;
        this.f1067o = 0;
        this.f1068p++;
        o oVar = this.f1069q;
        oVar.f1058p = oVar;
        oVar.f1057o = oVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        o oVarA = null;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return oVarA != null;
    }

    public final void d(o oVar, o oVar2) {
        o oVar3 = oVar.f1054l;
        oVar.f1054l = null;
        if (oVar2 != null) {
            oVar2.f1054l = oVar3;
        }
        if (oVar3 == null) {
            this.f1066n = oVar2;
        } else if (oVar3.f1055m == oVar) {
            oVar3.f1055m = oVar2;
        } else {
            oVar3.f1056n = oVar2;
        }
    }

    public final void e(o oVar) {
        o oVar2 = oVar.f1055m;
        o oVar3 = oVar.f1056n;
        o oVar4 = oVar3.f1055m;
        o oVar5 = oVar3.f1056n;
        oVar.f1056n = oVar4;
        if (oVar4 != null) {
            oVar4.f1054l = oVar;
        }
        d(oVar, oVar3);
        oVar3.f1055m = oVar;
        oVar.f1054l = oVar3;
        int iMax = Math.max(oVar2 != null ? oVar2.f1062t : 0, oVar4 != null ? oVar4.f1062t : 0) + 1;
        oVar.f1062t = iMax;
        oVar3.f1062t = Math.max(iMax, oVar5 != null ? oVar5.f1062t : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n nVar = this.f1070r;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 0);
        this.f1070r = nVar2;
        return nVar2;
    }

    public final void f(o oVar) {
        o oVar2 = oVar.f1055m;
        o oVar3 = oVar.f1056n;
        o oVar4 = oVar2.f1055m;
        o oVar5 = oVar2.f1056n;
        oVar.f1055m = oVar5;
        if (oVar5 != null) {
            oVar5.f1054l = oVar;
        }
        d(oVar, oVar2);
        oVar2.f1056n = oVar;
        oVar.f1054l = oVar2;
        int iMax = Math.max(oVar3 != null ? oVar3.f1062t : 0, oVar5 != null ? oVar5.f1062t : 0) + 1;
        oVar.f1062t = iMax;
        oVar2.f1062t = Math.max(iMax, oVar4 != null ? oVar4.f1062t : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            return oVarA.f1061s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n nVar = this.f1071s;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 1);
        this.f1071s = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f1065m) {
            throw new NullPointerException("value == null");
        }
        o oVarA = a(obj, true);
        Object obj3 = oVarA.f1061s;
        oVarA.f1061s = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            c(oVarA, true);
        }
        if (oVarA != null) {
            return oVarA.f1061s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1067o;
    }
}
