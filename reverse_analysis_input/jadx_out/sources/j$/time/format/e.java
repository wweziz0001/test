package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7067b;

    e(ArrayList arrayList, boolean z4) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z4);
    }

    e(f[] fVarArr, boolean z4) {
        this.f7066a = fVarArr;
        this.f7067b = z4;
    }

    public final e a() {
        return !this.f7067b ? this : new e(this.f7066a, false);
    }

    @Override // j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        int length = sb.length();
        boolean z4 = this.f7067b;
        if (z4) {
            tVar.g();
        }
        try {
            for (f fVar : this.f7066a) {
                if (!fVar.p(tVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z4) {
                tVar.a();
            }
            return true;
        } finally {
            if (z4) {
                tVar.a();
            }
        }
    }

    @Override // j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        boolean z4 = this.f7067b;
        f[] fVarArr = this.f7066a;
        if (z4) {
            qVar.q();
            int iR = i;
            for (f fVar : fVarArr) {
                iR = fVar.r(qVar, charSequence, iR);
                if (iR < 0) {
                    qVar.e(false);
                    return i;
                }
            }
            qVar.e(true);
            return iR;
        }
        for (f fVar2 : fVarArr) {
            i = fVar2.r(qVar, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f7066a;
        if (fVarArr != null) {
            boolean z4 = this.f7067b;
            sb.append(z4 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z4 ? "]" : ")");
        }
        return sb.toString();
    }
}
