package T2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2253b;

    public o(String str, List list) {
        this.f2252a = str;
        this.f2253b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = this.f2252a;
        if (str != null) {
            if (!str.equals(oVar.f2252a)) {
                return false;
            }
        } else if (oVar.f2252a != null) {
            return false;
        }
        List list = this.f2253b;
        if (list.size() != oVar.f2253b.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            boolean z4 = list.get(i) instanceof byte[];
            List list2 = oVar.f2253b;
            if (z4 && (list2.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                    return false;
                }
            } else if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2252a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2252a);
        List list = this.f2253b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
