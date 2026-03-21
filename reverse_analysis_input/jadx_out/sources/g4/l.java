package g4;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f5856m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f5857l;

    static {
        String str = File.separator;
        N3.h.d(str, "separator");
        f5856m = str;
    }

    public l(b bVar) {
        N3.h.e(bVar, "bytes");
        this.f5857l = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = h4.b.a(this);
        b bVar = this.f5857l;
        if (iA == -1) {
            iA = 0;
        } else if (iA < bVar.b() && bVar.g(iA) == 92) {
            iA++;
        }
        int iB = bVar.b();
        int i = iA;
        while (iA < iB) {
            if (bVar.g(iA) == 47 || bVar.g(iA) == 92) {
                arrayList.add(bVar.l(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < bVar.b()) {
            arrayList.add(bVar.l(i, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = h4.b.f6329a;
        b bVar2 = h4.b.f6329a;
        b bVarM = this.f5857l;
        int i = b.i(bVarM, bVar2);
        if (i == -1) {
            i = b.i(bVarM, h4.b.f6330b);
        }
        if (i != -1) {
            bVarM = b.m(bVarM, i + 1, 0, 2);
        } else if (g() != null && bVarM.b() == 2) {
            bVarM = b.f5831o;
        }
        return bVarM.n();
    }

    public final l c() {
        b bVar = h4.b.f6332d;
        b bVar2 = this.f5857l;
        if (N3.h.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = h4.b.f6329a;
        if (N3.h.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = h4.b.f6330b;
        if (N3.h.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = h4.b.f6333e;
        bVar2.getClass();
        N3.h.e(bVar5, "suffix");
        int iB = bVar2.b();
        byte[] bArr = bVar5.f5832l;
        if (bVar2.k(iB - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.k(bVar2.b() - 3, bVar3, 1) || bVar2.k(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i = b.i(bVar2, bVar3);
        if (i == -1) {
            i = b.i(bVar2, bVar4);
        }
        if (i == 2 && g() != null) {
            if (bVar2.b() == 3) {
                return null;
            }
            return new l(b.m(bVar2, 0, 3, 1));
        }
        if (i == 1) {
            N3.h.e(bVar4, "prefix");
            if (bVar2.k(0, bVar4, bVar4.f5832l.length)) {
                return null;
            }
        }
        if (i != -1 || g() == null) {
            return i == -1 ? new l(bVar) : i == 0 ? new l(b.m(bVar2, 0, 1, 1)) : new l(b.m(bVar2, 0, i, 1));
        }
        if (bVar2.b() == 2) {
            return null;
        }
        return new l(b.m(bVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        N3.h.e(lVar, "other");
        return this.f5857l.compareTo(lVar.f5857l);
    }

    public final l d(String str) {
        N3.h.e(str, "child");
        a aVar = new a();
        aVar.v(str);
        return h4.b.b(this, h4.b.d(aVar, false), false);
    }

    public final File e() {
        return new File(this.f5857l.n());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && N3.h.a(((l) obj).f5857l, this.f5857l);
    }

    public final Path f() {
        Path path = Paths.get(this.f5857l.n(), new String[0]);
        N3.h.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        b bVar = h4.b.f6329a;
        b bVar2 = this.f5857l;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char cG = (char) bVar2.g(0);
        if (('a' > cG || cG >= '{') && ('A' > cG || cG >= '[')) {
            return null;
        }
        return Character.valueOf(cG);
    }

    public final int hashCode() {
        return this.f5857l.hashCode();
    }

    public final String toString() {
        return this.f5857l.n();
    }
}
