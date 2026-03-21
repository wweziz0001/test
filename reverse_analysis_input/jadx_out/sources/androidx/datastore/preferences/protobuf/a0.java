package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import q.C0733c;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends AbstractSet {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f4126m;

    public /* synthetic */ a0(int i, Map map) {
        this.f4125l = i;
        this.f4126m = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4125l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((X) this.f4126m).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4125l) {
            case 0:
                ((X) this.f4126m).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4125l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((X) this.f4126m).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4125l) {
            case 0:
                return new Z((X) this.f4126m);
            default:
                return new C0733c((C0735e) this.f4126m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4125l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((X) this.f4126m).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4125l) {
            case 0:
                return ((X) this.f4126m).size();
            default:
                return ((C0735e) this.f4126m).f9237n;
        }
    }
}
