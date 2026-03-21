package I2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractSet {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f1053m;

    public /* synthetic */ n(p pVar, int i) {
        this.f1052l = i;
        this.f1053m = pVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1052l) {
            case 0:
                this.f1053m.clear();
                break;
            default:
                this.f1053m.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        o oVarA;
        switch (this.f1052l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                p pVar = this.f1053m;
                pVar.getClass();
                Object key = entry.getKey();
                o oVar = null;
                if (key != null) {
                    try {
                        oVarA = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                        oVarA = null;
                    }
                    break;
                } else {
                    oVarA = null;
                }
                if (oVarA != null && Objects.equals(oVarA.f1061s, entry.getValue())) {
                    oVar = oVarA;
                }
                return oVar != null;
            default:
                return this.f1053m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1052l) {
            case 0:
                return new m(this.f1053m, 0);
            default:
                return new m(this.f1053m, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o oVarA;
        switch (this.f1052l) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    p pVar = this.f1053m;
                    pVar.getClass();
                    Object key = entry.getKey();
                    o oVar = null;
                    if (key != null) {
                        try {
                            oVarA = pVar.a(key, false);
                        } catch (ClassCastException unused) {
                            oVarA = null;
                        }
                    } else {
                        oVarA = null;
                    }
                    if (oVarA != null && Objects.equals(oVarA.f1061s, entry.getValue())) {
                        oVar = oVarA;
                    }
                    if (oVar != null) {
                        pVar.c(oVar, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                p pVar2 = this.f1053m;
                pVar2.getClass();
                o oVarA2 = null;
                if (obj != null) {
                    try {
                        oVarA2 = pVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (oVarA2 != null) {
                    pVar2.c(oVarA2, true);
                }
                if (oVarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1052l) {
        }
        return this.f1053m.f1067o;
    }
}
