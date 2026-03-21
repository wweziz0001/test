package u1;

import C3.o;
import D3.i;
import N3.h;
import Z1.f;
import android.database.Cursor;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y1.C1002b;

/* JADX INFO: renamed from: u1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSet f10249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractSet f10250d;

    public C0893e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        h.e(abstractSet, "foreignKeys");
        this.f10247a = str;
        this.f10248b = map;
        this.f10249c = abstractSet;
        this.f10250d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final C0893e a(C1002b c1002b, String str) throws IOException {
        Map mapB;
        i iVarE;
        i iVar;
        Cursor cursorP = c1002b.p("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorP.getColumnCount() <= 0) {
                mapB = o.f292l;
                f.f(cursorP, null);
            } else {
                int columnIndex = cursorP.getColumnIndex("name");
                int columnIndex2 = cursorP.getColumnIndex("type");
                int columnIndex3 = cursorP.getColumnIndex("notnull");
                int columnIndex4 = cursorP.getColumnIndex("pk");
                int columnIndex5 = cursorP.getColumnIndex("dflt_value");
                D3.f fVar = new D3.f();
                while (cursorP.moveToNext()) {
                    String string = cursorP.getString(columnIndex);
                    String string2 = cursorP.getString(columnIndex2);
                    boolean z4 = cursorP.getInt(columnIndex3) != 0;
                    int i = cursorP.getInt(columnIndex4);
                    String string3 = cursorP.getString(columnIndex5);
                    h.d(string, "name");
                    h.d(string2, "type");
                    fVar.put(string, new C0889a(i, 2, string, string2, string3, z4));
                }
                mapB = fVar.b();
                f.f(cursorP, null);
            }
            cursorP = c1002b.p("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorP.getColumnIndex("id");
                int columnIndex7 = cursorP.getColumnIndex("seq");
                int columnIndex8 = cursorP.getColumnIndex("table");
                int columnIndex9 = cursorP.getColumnIndex("on_delete");
                int columnIndex10 = cursorP.getColumnIndex("on_update");
                List listN = i4.a.N(cursorP);
                cursorP.moveToPosition(-1);
                i iVar2 = new i();
                while (cursorP.moveToNext()) {
                    if (cursorP.getInt(columnIndex7) == 0) {
                        int i5 = cursorP.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i6 = columnIndex6;
                        ArrayList<C0891c> arrayList3 = new ArrayList();
                        for (Object obj : listN) {
                            int i7 = columnIndex7;
                            List list = listN;
                            if (((C0891c) obj).f10239l == i5) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i7;
                            listN = list;
                        }
                        int i8 = columnIndex7;
                        List list2 = listN;
                        for (C0891c c0891c : arrayList3) {
                            arrayList.add(c0891c.f10241n);
                            arrayList2.add(c0891c.f10242o);
                        }
                        String string4 = cursorP.getString(columnIndex8);
                        h.d(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorP.getString(columnIndex9);
                        h.d(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorP.getString(columnIndex10);
                        h.d(string6, "cursor.getString(onUpdateColumnIndex)");
                        iVar2.add(new C0890b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i6;
                        columnIndex7 = i8;
                        listN = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                i iVarE2 = D1.b.e(iVar2);
                f.f(cursorP, null);
                cursorP = c1002b.p("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorP.getColumnIndex("name");
                    int columnIndex12 = cursorP.getColumnIndex("origin");
                    int columnIndex13 = cursorP.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        iVarE = null;
                        f.f(cursorP, null);
                    } else {
                        i iVar3 = new i();
                        while (cursorP.moveToNext()) {
                            if ("c".equals(cursorP.getString(columnIndex12))) {
                                String string7 = cursorP.getString(columnIndex11);
                                boolean z5 = cursorP.getInt(columnIndex13) == 1;
                                h.d(string7, "name");
                                C0892d c0892dO = i4.a.O(c1002b, string7, z5);
                                if (c0892dO == null) {
                                    f.f(cursorP, null);
                                    iVar = null;
                                    break;
                                }
                                iVar3.add(c0892dO);
                            }
                        }
                        iVarE = D1.b.e(iVar3);
                        f.f(cursorP, null);
                    }
                    iVar = iVarE;
                    return new C0893e(str, mapB, iVarE2, iVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893e)) {
            return false;
        }
        C0893e c0893e = (C0893e) obj;
        if (!this.f10247a.equals(c0893e.f10247a) || !this.f10248b.equals(c0893e.f10248b) || !h.a(this.f10249c, c0893e.f10249c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f10250d;
        if (abstractSet2 == null || (abstractSet = c0893e.f10250d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f10249c.hashCode() + ((this.f10248b.hashCode() + (this.f10247a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f10247a + "', columns=" + this.f10248b + ", foreignKeys=" + this.f10249c + ", indices=" + this.f10250d + '}';
    }
}
