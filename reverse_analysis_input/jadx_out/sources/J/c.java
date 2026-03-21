package J;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b3.AbstractC0307a;
import m.D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Cursor f1087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f1089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f1090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f1091r;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1087n;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1089p;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1090q;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1087n = cursor;
            if (cursor != null) {
                a aVar2 = this.f1089p;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1090q;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1088o = cursor.getColumnIndexOrThrow("_id");
                this.f1085l = true;
                notifyDataSetChanged();
            } else {
                this.f1088o = -1;
                this.f1085l = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1085l || (cursor = this.f1087n) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1085l) {
            return null;
        }
        this.f1087n.moveToPosition(i);
        if (view == null) {
            D0 d02 = (D0) this;
            view = d02.f8253u.inflate(d02.f8252t, viewGroup, false);
        }
        a(view, this.f1087n);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1091r == null) {
            d dVar = new d();
            dVar.f1092a = this;
            this.f1091r = dVar;
        }
        return this.f1091r;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f1085l || (cursor = this.f1087n) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1087n;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f1085l && (cursor = this.f1087n) != null && cursor.moveToPosition(i)) {
            return this.f1087n.getLong(this.f1088o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1085l) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1087n.moveToPosition(i)) {
            throw new IllegalStateException(AbstractC0307a.i("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1087n);
        return view;
    }
}
