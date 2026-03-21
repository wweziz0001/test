package androidx.fragment.app;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235b implements Parcelable {
    public static final Parcelable.Creator<C0235b> CREATOR = new C0184j(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f4356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f4358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f4359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f4364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f4366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f4367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f4368x;
    public final boolean y;

    public C0235b(C0234a c0234a) {
        int size = c0234a.f4339a.size();
        this.f4356l = new int[size * 6];
        if (!c0234a.f4345g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4357m = new ArrayList(size);
        this.f4358n = new int[size];
        this.f4359o = new int[size];
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            U u4 = (U) c0234a.f4339a.get(i5);
            int i6 = i + 1;
            this.f4356l[i] = u4.f4310a;
            ArrayList arrayList = this.f4357m;
            r rVar = u4.f4311b;
            arrayList.add(rVar != null ? rVar.f4443p : null);
            int[] iArr = this.f4356l;
            iArr[i6] = u4.f4312c ? 1 : 0;
            iArr[i + 2] = u4.f4313d;
            iArr[i + 3] = u4.f4314e;
            int i7 = i + 5;
            iArr[i + 4] = u4.f4315f;
            i += 6;
            iArr[i7] = u4.f4316g;
            this.f4358n[i5] = u4.f4317h.ordinal();
            this.f4359o[i5] = u4.i.ordinal();
        }
        this.f4360p = c0234a.f4344f;
        this.f4361q = c0234a.f4346h;
        this.f4362r = c0234a.f4355r;
        this.f4363s = c0234a.i;
        this.f4364t = c0234a.f4347j;
        this.f4365u = c0234a.f4348k;
        this.f4366v = c0234a.f4349l;
        this.f4367w = c0234a.f4350m;
        this.f4368x = c0234a.f4351n;
        this.y = c0234a.f4352o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4356l);
        parcel.writeStringList(this.f4357m);
        parcel.writeIntArray(this.f4358n);
        parcel.writeIntArray(this.f4359o);
        parcel.writeInt(this.f4360p);
        parcel.writeString(this.f4361q);
        parcel.writeInt(this.f4362r);
        parcel.writeInt(this.f4363s);
        TextUtils.writeToParcel(this.f4364t, parcel, 0);
        parcel.writeInt(this.f4365u);
        TextUtils.writeToParcel(this.f4366v, parcel, 0);
        parcel.writeStringList(this.f4367w);
        parcel.writeStringList(this.f4368x);
        parcel.writeInt(this.y ? 1 : 0);
    }

    public C0235b(Parcel parcel) {
        this.f4356l = parcel.createIntArray();
        this.f4357m = parcel.createStringArrayList();
        this.f4358n = parcel.createIntArray();
        this.f4359o = parcel.createIntArray();
        this.f4360p = parcel.readInt();
        this.f4361q = parcel.readString();
        this.f4362r = parcel.readInt();
        this.f4363s = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4364t = (CharSequence) creator.createFromParcel(parcel);
        this.f4365u = parcel.readInt();
        this.f4366v = (CharSequence) creator.createFromParcel(parcel);
        this.f4367w = parcel.createStringArrayList();
        this.f4368x = parcel.createStringArrayList();
        this.y = parcel.readInt() != 0;
    }
}
