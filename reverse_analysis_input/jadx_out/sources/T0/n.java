package T0;

import Q1.C;
import a0.C0152C;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Objects;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new D1.a(17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I f2137n;

    public n(String str, String str2, b0 b0Var) {
        super(str);
        AbstractC0360m.c(!b0Var.isEmpty());
        this.f2136m = str2;
        I iP = I.p(b0Var);
        this.f2137n = iP;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        String str = this.f2124l;
        str.getClass();
        I i = this.f2137n;
        byte b4 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b4 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b4 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b4 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b4 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b4 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b4 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b4 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b4 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b4 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b4 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b4 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b4 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b4 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b4 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b4 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b4 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b4 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b4 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b4 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b4 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b4 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b4 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b4 = 22;
                }
                break;
        }
        try {
            switch (b4) {
                case 0:
                case 10:
                    c0152c.f3163c = (CharSequence) i.get(0);
                    break;
                case 1:
                case 11:
                    c0152c.f3178s = (CharSequence) i.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) i.get(0);
                    int i5 = Integer.parseInt(str2.substring(2, 4));
                    int i6 = Integer.parseInt(str2.substring(0, 2));
                    c0152c.d(Integer.valueOf(i5));
                    c0152c.c(Integer.valueOf(i6));
                    break;
                case 3:
                case 18:
                    c0152c.f3162b = (CharSequence) i.get(0);
                    break;
                case 4:
                case 19:
                    c0152c.f3164d = (CharSequence) i.get(0);
                    break;
                case 5:
                case 20:
                    c0152c.f3179t = (CharSequence) i.get(0);
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                case 21:
                    String[] strArrW = AbstractC0370w.W((String) i.get(0), "/");
                    int i7 = Integer.parseInt(strArrW[0]);
                    Integer numValueOf = strArrW.length > 1 ? Integer.valueOf(Integer.parseInt(strArrW[1])) : null;
                    c0152c.f3168h = Integer.valueOf(i7);
                    c0152c.i = numValueOf;
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                case 17:
                    c0152c.f3161a = (CharSequence) i.get(0);
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                    c0152c.f3177r = (CharSequence) i.get(0);
                    break;
                case 9:
                case 22:
                    c0152c.e(Integer.valueOf(Integer.parseInt((String) i.get(0))));
                    break;
                case 12:
                    Integer numZ0 = C.z0((String) i.get(0));
                    if (numZ0 != null) {
                        String strA = j.a(numZ0.intValue());
                        if (strA != null) {
                            c0152c.b(strA);
                        }
                    } else {
                        c0152c.b((CharSequence) i.get(0));
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) i.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0152c.c((Integer) arrayListD.get(2));
                            }
                        }
                        c0152c.d((Integer) arrayListD.get(1));
                    }
                    c0152c.e((Integer) arrayListD.get(0));
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) i.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0152c.f3176q = (Integer) arrayListD2.get(2);
                            }
                        }
                        c0152c.f3175p = (Integer) arrayListD2.get(1);
                    }
                    c0152c.f3174o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f2124l, nVar.f2124l) && Objects.equals(this.f2136m, nVar.f2136m) && this.f2137n.equals(nVar.f2137n);
    }

    public final int hashCode() {
        int iE = AbstractC0307a.e(527, this.f2124l, 31);
        String str = this.f2136m;
        return this.f2137n.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": description=" + this.f2136m + ": values=" + this.f2137n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124l);
        parcel.writeString(this.f2136m);
        parcel.writeStringArray((String[]) this.f2137n.toArray(new String[0]));
    }
}
