package d2;

import C3.f;
import N3.h;
import Q1.C;
import Q1.q;
import Z1.g;
import Z1.i;
import Z1.l;
import Z1.p;
import Z1.s;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;
import s1.j;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0377b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5426a;

    static {
        String strF = q.f("DiagnosticsWrkr");
        h.d(strF, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f5426a = strF;
    }

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g gVarN = iVar.n(D1.b.z(pVar));
            Integer numValueOf = gVarN != null ? Integer.valueOf(gVarN.f3010c) : null;
            lVar.getClass();
            j jVarC = j.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
            String str2 = pVar.f3046a;
            if (str2 == null) {
                jVarC.g(1);
            } else {
                jVarC.h(str2, 1);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f3020l;
            workDatabase_Impl.b();
            Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorL0.getCount());
                while (cursorL0.moveToNext()) {
                    arrayList2.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
                }
                cursorL0.close();
                jVarC.f();
                String strV = f.V(arrayList2, ",", null, null, null, 62);
                String strV2 = f.V(sVar.I(str2), ",", null, null, null, 62);
                StringBuilder sbM = AbstractC0307a.m("\n", str2, "\t ");
                sbM.append(pVar.f3048c);
                sbM.append("\t ");
                sbM.append(numValueOf);
                sbM.append("\t ");
                switch (pVar.f3047b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbM.append(str);
                sbM.append("\t ");
                sbM.append(strV);
                sbM.append("\t ");
                sbM.append(strV2);
                sbM.append('\t');
                sb.append(sbM.toString());
            } catch (Throwable th) {
                cursorL0.close();
                jVarC.f();
                throw th;
            }
        }
        String string = sb.toString();
        h.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
