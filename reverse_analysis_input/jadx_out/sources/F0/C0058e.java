package F0;

import a0.C0157H;
import d0.AbstractC0349b;
import d0.C0363p;
import java.util.ArrayList;

/* JADX INFO: renamed from: F0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f761h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f764l;

    public C0058e(ArrayList arrayList, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f2, String str) {
        this.f754a = arrayList;
        this.f755b = i;
        this.f756c = i5;
        this.f757d = i6;
        this.f758e = i7;
        this.f759f = i8;
        this.f760g = i9;
        this.f761h = i10;
        this.i = i11;
        this.f762j = i12;
        this.f763k = f2;
        this.f764l = str;
    }

    public static C0058e a(C0363p c0363p) {
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        String strA;
        int i11;
        try {
            c0363p.I(4);
            int iV = (c0363p.v() & 3) + 1;
            if (iV == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iV2 = c0363p.v() & 31;
            for (int i12 = 0; i12 < iV2; i12++) {
                int iB = c0363p.B();
                int i13 = c0363p.f5314b;
                c0363p.I(iB);
                byte[] bArr = c0363p.f5313a;
                byte[] bArr2 = AbstractC0349b.f5271a;
                byte[] bArr3 = new byte[iB + 4];
                System.arraycopy(AbstractC0349b.f5271a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i13, bArr3, 4, iB);
                arrayList.add(bArr3);
            }
            int iV3 = c0363p.v();
            for (int i14 = 0; i14 < iV3; i14++) {
                int iB2 = c0363p.B();
                int i15 = c0363p.f5314b;
                c0363p.I(iB2);
                byte[] bArr4 = c0363p.f5313a;
                byte[] bArr5 = AbstractC0349b.f5271a;
                byte[] bArr6 = new byte[iB2 + 4];
                System.arraycopy(AbstractC0349b.f5271a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i15, bArr6, 4, iB2);
                arrayList.add(bArr6);
            }
            if (iV2 > 0) {
                e0.m mVarI = e0.n.i((byte[]) arrayList.get(0), iV, ((byte[]) arrayList.get(0)).length);
                int i16 = mVarI.f5531e;
                int i17 = mVarI.f5532f;
                int i18 = mVarI.f5534h + 8;
                int i19 = mVarI.i + 8;
                int i20 = mVarI.f5541p;
                int i21 = mVarI.f5542q;
                int i22 = mVarI.f5543r;
                int i23 = mVarI.f5544s;
                float f5 = mVarI.f5533g;
                strA = AbstractC0349b.a(mVarI.f5527a, mVarI.f5528b, mVarI.f5529c);
                i9 = i21;
                i10 = i22;
                i11 = i23;
                f2 = f5;
                i5 = i17;
                i6 = i18;
                i7 = i19;
                i8 = i20;
                i = i16;
            } else {
                i = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                f2 = 1.0f;
                strA = null;
                i11 = 16;
            }
            return new C0058e(arrayList, iV, i, i5, i6, i7, i8, i9, i10, i11, f2, strA);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw C0157H.a(e5, "Error parsing AVC config");
        }
    }
}
