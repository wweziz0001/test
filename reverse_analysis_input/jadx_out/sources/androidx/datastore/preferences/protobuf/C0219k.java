package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0325e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0333m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0338s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0343x;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.nio.charset.Charset;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4175e;

    public C0219k(AbstractC0218j abstractC0218j) {
        this.f4171a = 0;
        this.f4174d = 0;
        Charset charset = AbstractC0231x.f4217a;
        this.f4175e = abstractC0218j;
        abstractC0218j.f4169b = this;
    }

    public static void T(int i) throws com.google.crypto.tink.shaded.protobuf.C {
        if ((i & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public static void U(int i) throws com.google.crypto.tink.shaded.protobuf.C {
        if ((i & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public void A(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0218j.v()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Long.valueOf(abstractC0218j.v()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j5 = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                j5.h(abstractC0218j.v());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            j5.h(abstractC0218j.v());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public void B(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 2) {
            int iD = abstractC0218j.D();
            if ((iD & 3) != 0) {
                throw new C0233z("Failed to parse the message.");
            }
            int iF = abstractC0218j.f() + iD;
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.w()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        if (i != 5) {
            throw C0233z.b();
        }
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.w()));
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void C(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 2) {
                int iD = abstractC0218j.D();
                T(iD);
                int iF = abstractC0218j.f() + iD;
                do {
                    list.add(Integer.valueOf(abstractC0218j.w()));
                } while (abstractC0218j.f() < iF);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            do {
                list.add(Integer.valueOf(abstractC0218j.w()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 2) {
            int iD2 = abstractC0218j.D();
            T(iD2);
            int iF2 = abstractC0218j.f() + iD2;
            do {
                abstractC0343x.h(abstractC0218j.w());
            } while (abstractC0218j.f() < iF2);
            return;
        }
        if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        do {
            abstractC0343x.h(abstractC0218j.w());
            if (abstractC0218j.g()) {
                return;
            } else {
                iC2 = abstractC0218j.C();
            }
        } while (iC2 == this.f4172b);
        this.f4174d = iC2;
    }

    public void D(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 1) {
            do {
                ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.x()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iD = abstractC0218j.D();
        if ((iD & 7) != 0) {
            throw new C0233z("Failed to parse the message.");
        }
        int iF = abstractC0218j.f() + iD;
        do {
            ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.x()));
        } while (abstractC0218j.f() < iF);
    }

    public void E(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0218j.x()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iD = abstractC0218j.D();
            U(iD);
            int iF = abstractC0218j.f() + iD;
            do {
                list.add(Long.valueOf(abstractC0218j.x()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j5 = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i5 = this.f4172b & 7;
        if (i5 == 1) {
            do {
                j5.h(abstractC0218j.x());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iD2 = abstractC0218j.D();
        U(iD2);
        int iF2 = abstractC0218j.f() + iD2;
        do {
            j5.h(abstractC0218j.x());
        } while (abstractC0218j.f() < iF2);
    }

    public void F(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.y()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.y()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void G(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0218j.y()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Integer.valueOf(abstractC0218j.y()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                abstractC0343x.h(abstractC0218j.y());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            abstractC0343x.h(abstractC0218j.y());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public void H(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.z()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.z()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void I(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0218j.z()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Long.valueOf(abstractC0218j.z()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j5 = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                j5.h(abstractC0218j.z());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            j5.h(abstractC0218j.z());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public void J(InterfaceC0230w interfaceC0230w, boolean z4) throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        String strA;
        int iC;
        if ((this.f4172b & 7) != 2) {
            throw C0233z.b();
        }
        do {
            AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
            if (z4) {
                R(2);
                strA = abstractC0218j.B();
            } else {
                R(2);
                strA = abstractC0218j.A();
            }
            ((T) interfaceC0230w).add(strA);
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void K(List list, boolean z4) throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        String strA;
        int iC;
        int iC2;
        if ((this.f4172b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        boolean z5 = list instanceof com.google.crypto.tink.shaded.protobuf.F;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (z5 && !z4) {
            com.google.crypto.tink.shaded.protobuf.F f2 = (com.google.crypto.tink.shaded.protobuf.F) list;
            do {
                f2.e(j());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        do {
            if (z4) {
                R(2);
                strA = abstractC0218j.B();
            } else {
                R(2);
                strA = abstractC0218j.A();
            }
            list.add(strA);
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void L(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.D()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.D()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void M(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0218j.D()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Integer.valueOf(abstractC0218j.D()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                abstractC0343x.h(abstractC0218j.D());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            abstractC0343x.h(abstractC0218j.D());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public void N(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.E()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.E()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void O(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0218j.E()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Long.valueOf(abstractC0218j.E()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j5 = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                j5.h(abstractC0218j.E());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            j5.h(abstractC0218j.E());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public long P() {
        int i = this.f4173c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i5 = this.f4172b;
        long j5 = ((long[]) this.f4175e)[i5];
        this.f4172b = (i5 + 1) & this.f4174d;
        this.f4173c = i - 1;
        return j5;
    }

    public void Q(int i) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        switch (this.f4171a) {
            case 0:
                if (((AbstractC0218j) this.f4175e).f() != i) {
                    throw C0233z.e();
                }
                return;
            default:
                if (((AbstractC0218j) this.f4175e).f() != i) {
                    throw com.google.crypto.tink.shaded.protobuf.C.g();
                }
                return;
        }
    }

    public void R(int i) throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        switch (this.f4171a) {
            case 0:
                if ((this.f4172b & 7) != i) {
                    throw C0233z.b();
                }
                return;
            default:
                if ((this.f4172b & 7) != i) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                return;
        }
    }

    public boolean S() {
        int i;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (abstractC0218j.g() || (i = this.f4172b) == this.f4173c) {
            return false;
        }
        return abstractC0218j.F(i);
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f4175e;
        int i5 = this.f4173c;
        iArr[i5] = i;
        int i6 = this.f4174d & (i5 + 1);
        this.f4173c = i6;
        int i7 = this.f4172b;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            System.arraycopy(iArr, i7, iArr2, 0, i8);
            System.arraycopy((int[]) this.f4175e, 0, iArr2, i8, this.f4172b);
            this.f4175e = iArr2;
            this.f4172b = 0;
            this.f4173c = length;
            this.f4174d = i9 - 1;
        }
    }

    public int b() {
        switch (this.f4171a) {
            case 0:
                int i = this.f4174d;
                if (i != 0) {
                    this.f4172b = i;
                    this.f4174d = 0;
                } else {
                    this.f4172b = ((AbstractC0218j) this.f4175e).C();
                }
                int i5 = this.f4172b;
                if (i5 == 0 || i5 == this.f4173c) {
                    return Integer.MAX_VALUE;
                }
                return i5 >>> 3;
            default:
                int i6 = this.f4174d;
                if (i6 != 0) {
                    this.f4172b = i6;
                    this.f4174d = 0;
                } else {
                    this.f4172b = ((AbstractC0218j) this.f4175e).C();
                }
                int i7 = this.f4172b;
                if (i7 == 0 || i7 == this.f4173c) {
                    return Integer.MAX_VALUE;
                }
                return i7 >>> 3;
        }
    }

    public void c(Object obj, V v4, C0222n c0222n) {
        int i = this.f4173c;
        this.f4173c = ((this.f4172b >>> 3) << 3) | 4;
        try {
            v4.e(obj, this, c0222n);
            if (this.f4172b == this.f4173c) {
            } else {
                throw new C0233z("Failed to parse the message.");
            }
        } finally {
            this.f4173c = i;
        }
    }

    public void d(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0335o c0335o) {
        int i = this.f4173c;
        this.f4173c = ((this.f4172b >>> 3) << 3) | 4;
        try {
            c0Var.j(obj, this, c0335o);
            if (this.f4172b == this.f4173c) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.C.f();
            }
        } finally {
            this.f4173c = i;
        }
    }

    public void e(Object obj, V v4, C0222n c0222n) throws C0233z {
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        int iD = abstractC0218j.D();
        if (abstractC0218j.f4168a >= 100) {
            throw new C0233z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = abstractC0218j.l(iD);
        abstractC0218j.f4168a++;
        v4.e(obj, this, c0222n);
        abstractC0218j.b(0);
        abstractC0218j.f4168a--;
        abstractC0218j.j(iL);
    }

    public void f(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0335o c0335o) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        int iD = abstractC0218j.D();
        if (abstractC0218j.f4168a >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.C("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = abstractC0218j.l(iD);
        abstractC0218j.f4168a++;
        c0Var.j(obj, this, c0335o);
        abstractC0218j.b(0);
        abstractC0218j.f4168a--;
        abstractC0218j.j(iL);
    }

    public void g(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Boolean.valueOf(abstractC0218j.m()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Boolean.valueOf(abstractC0218j.m()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void h(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0325e;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0218j.m()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Boolean.valueOf(abstractC0218j.m()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        AbstractC0325e abstractC0325e = (AbstractC0325e) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                abstractC0325e.h(abstractC0218j.m());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            abstractC0325e.h(abstractC0218j.m());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public C0215g i() throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        R(2);
        return ((AbstractC0218j) this.f4175e).n();
    }

    public AbstractC0329i j() throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        R(2);
        return ((AbstractC0218j) this.f4175e).o();
    }

    public void k(InterfaceC0230w interfaceC0230w) throws C0232y {
        int iC;
        if ((this.f4172b & 7) != 2) {
            throw C0233z.b();
        }
        do {
            ((T) interfaceC0230w).add(i());
            AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void l(List list) throws com.google.crypto.tink.shaded.protobuf.B {
        int iC;
        if ((this.f4172b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        do {
            list.add(j());
            AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void m(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 1) {
            do {
                ((T) interfaceC0230w).add(Double.valueOf(abstractC0218j.p()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iD = abstractC0218j.D();
        if ((iD & 7) != 0) {
            throw new C0233z("Failed to parse the message.");
        }
        int iF = abstractC0218j.f() + iD;
        do {
            ((T) interfaceC0230w).add(Double.valueOf(abstractC0218j.p()));
        } while (abstractC0218j.f() < iF);
    }

    public void n(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0333m;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC0218j.p()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iD = abstractC0218j.D();
            U(iD);
            int iF = abstractC0218j.f() + iD;
            do {
                list.add(Double.valueOf(abstractC0218j.p()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        AbstractC0333m abstractC0333m = (AbstractC0333m) list;
        int i5 = this.f4172b & 7;
        if (i5 == 1) {
            do {
                abstractC0333m.h(abstractC0218j.p());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iD2 = abstractC0218j.D();
        U(iD2);
        int iF2 = abstractC0218j.f() + iD2;
        do {
            abstractC0333m.h(abstractC0218j.p());
        } while (abstractC0218j.f() < iF2);
    }

    public void o(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.q()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.q()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void p(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0218j.q()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Integer.valueOf(abstractC0218j.q()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                abstractC0343x.h(abstractC0218j.q());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            abstractC0343x.h(abstractC0218j.q());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public Object q(q0 q0Var, Class cls, C0222n c0222n) throws C0233z, com.google.crypto.tink.shaded.protobuf.B {
        int iOrdinal = q0Var.ordinal();
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        switch (iOrdinal) {
            case 0:
                R(1);
                return Double.valueOf(abstractC0218j.p());
            case 1:
                R(5);
                return Float.valueOf(abstractC0218j.t());
            case 2:
                R(0);
                return Long.valueOf(abstractC0218j.v());
            case 3:
                R(0);
                return Long.valueOf(abstractC0218j.E());
            case 4:
                R(0);
                return Integer.valueOf(abstractC0218j.u());
            case 5:
                R(1);
                return Long.valueOf(abstractC0218j.s());
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                R(5);
                return Integer.valueOf(abstractC0218j.r());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                R(0);
                return Boolean.valueOf(abstractC0218j.m());
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                R(2);
                return abstractC0218j.B();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                R(2);
                V vA = S.f4099c.a(cls);
                AbstractC0229v abstractC0229vC = vA.c();
                e(abstractC0229vC, vA, c0222n);
                vA.d(abstractC0229vC);
                return abstractC0229vC;
            case 11:
                return i();
            case 12:
                R(0);
                return Integer.valueOf(abstractC0218j.D());
            case 13:
                R(0);
                return Integer.valueOf(abstractC0218j.q());
            case 14:
                R(5);
                return Integer.valueOf(abstractC0218j.w());
            case 15:
                R(1);
                return Long.valueOf(abstractC0218j.x());
            case 16:
                R(0);
                return Integer.valueOf(abstractC0218j.y());
            case 17:
                R(0);
                return Long.valueOf(abstractC0218j.z());
        }
    }

    public void r(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 2) {
            int iD = abstractC0218j.D();
            if ((iD & 3) != 0) {
                throw new C0233z("Failed to parse the message.");
            }
            int iF = abstractC0218j.f() + iD;
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.r()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        if (i != 5) {
            throw C0233z.b();
        }
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.r()));
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void s(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 2) {
                int iD = abstractC0218j.D();
                T(iD);
                int iF = abstractC0218j.f() + iD;
                do {
                    list.add(Integer.valueOf(abstractC0218j.r()));
                } while (abstractC0218j.f() < iF);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            do {
                list.add(Integer.valueOf(abstractC0218j.r()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 2) {
            int iD2 = abstractC0218j.D();
            T(iD2);
            int iF2 = abstractC0218j.f() + iD2;
            do {
                abstractC0343x.h(abstractC0218j.r());
            } while (abstractC0218j.f() < iF2);
            return;
        }
        if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        do {
            abstractC0343x.h(abstractC0218j.r());
            if (abstractC0218j.g()) {
                return;
            } else {
                iC2 = abstractC0218j.C();
            }
        } while (iC2 == this.f4172b);
        this.f4174d = iC2;
    }

    public void t(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 1) {
            do {
                ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.s()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iD = abstractC0218j.D();
        if ((iD & 7) != 0) {
            throw new C0233z("Failed to parse the message.");
        }
        int iF = abstractC0218j.f() + iD;
        do {
            ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.s()));
        } while (abstractC0218j.f() < iF);
    }

    public void u(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0218j.s()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iD = abstractC0218j.D();
            U(iD);
            int iF = abstractC0218j.f() + iD;
            do {
                list.add(Long.valueOf(abstractC0218j.s()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.J j5 = (com.google.crypto.tink.shaded.protobuf.J) list;
        int i5 = this.f4172b & 7;
        if (i5 == 1) {
            do {
                j5.h(abstractC0218j.s());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iD2 = abstractC0218j.D();
        U(iD2);
        int iF2 = abstractC0218j.f() + iD2;
        do {
            j5.h(abstractC0218j.s());
        } while (abstractC0218j.f() < iF2);
    }

    public void v(InterfaceC0230w interfaceC0230w) throws C0233z {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 2) {
            int iD = abstractC0218j.D();
            if ((iD & 3) != 0) {
                throw new C0233z("Failed to parse the message.");
            }
            int iF = abstractC0218j.f() + iD;
            do {
                ((T) interfaceC0230w).add(Float.valueOf(abstractC0218j.t()));
            } while (abstractC0218j.f() < iF);
            return;
        }
        if (i != 5) {
            throw C0233z.b();
        }
        do {
            ((T) interfaceC0230w).add(Float.valueOf(abstractC0218j.t()));
            if (abstractC0218j.g()) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == this.f4172b);
        this.f4174d = iC;
    }

    public void w(List list) throws com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0338s;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 2) {
                int iD = abstractC0218j.D();
                T(iD);
                int iF = abstractC0218j.f() + iD;
                do {
                    list.add(Float.valueOf(abstractC0218j.t()));
                } while (abstractC0218j.f() < iF);
                return;
            }
            if (i != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            do {
                list.add(Float.valueOf(abstractC0218j.t()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        AbstractC0338s abstractC0338s = (AbstractC0338s) list;
        int i5 = this.f4172b & 7;
        if (i5 == 2) {
            int iD2 = abstractC0218j.D();
            T(iD2);
            int iF2 = abstractC0218j.f() + iD2;
            do {
                abstractC0338s.h(abstractC0218j.t());
            } while (abstractC0218j.f() < iF2);
            return;
        }
        if (i5 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        do {
            abstractC0338s.h(abstractC0218j.t());
            if (abstractC0218j.g()) {
                return;
            } else {
                iC2 = abstractC0218j.C();
            }
        } while (iC2 == this.f4172b);
        this.f4174d = iC2;
    }

    public void x(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.u()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Integer.valueOf(abstractC0218j.u()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public void y(List list) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        boolean z4 = list instanceof AbstractC0343x;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (!z4) {
            int i = this.f4172b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0218j.u()));
                    if (abstractC0218j.g()) {
                        return;
                    } else {
                        iC = abstractC0218j.C();
                    }
                } while (iC == this.f4172b);
                this.f4174d = iC;
                return;
            }
            if (i != 2) {
                throw com.google.crypto.tink.shaded.protobuf.C.c();
            }
            int iF = abstractC0218j.f() + abstractC0218j.D();
            do {
                list.add(Integer.valueOf(abstractC0218j.u()));
            } while (abstractC0218j.f() < iF);
            Q(iF);
            return;
        }
        AbstractC0343x abstractC0343x = (AbstractC0343x) list;
        int i5 = this.f4172b & 7;
        if (i5 == 0) {
            do {
                abstractC0343x.h(abstractC0218j.u());
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC2 = abstractC0218j.C();
                }
            } while (iC2 == this.f4172b);
            this.f4174d = iC2;
            return;
        }
        if (i5 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.C.c();
        }
        int iF2 = abstractC0218j.f() + abstractC0218j.D();
        do {
            abstractC0343x.h(abstractC0218j.u());
        } while (abstractC0218j.f() < iF2);
        Q(iF2);
    }

    public void z(InterfaceC0230w interfaceC0230w) throws C0233z, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i = this.f4172b & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) this.f4175e;
        if (i == 0) {
            do {
                ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.v()));
                if (abstractC0218j.g()) {
                    return;
                } else {
                    iC = abstractC0218j.C();
                }
            } while (iC == this.f4172b);
            this.f4174d = iC;
            return;
        }
        if (i != 2) {
            throw C0233z.b();
        }
        int iF = abstractC0218j.f() + abstractC0218j.D();
        do {
            ((T) interfaceC0230w).add(Long.valueOf(abstractC0218j.v()));
        } while (abstractC0218j.f() < iF);
        Q(iF);
    }

    public C0219k(int i) {
        this.f4171a = i;
        switch (i) {
            case 3:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f4174d = iHighestOneBit - 1;
                this.f4175e = new int[iHighestOneBit];
                break;
        }
    }

    public C0219k(AbstractC0218j abstractC0218j, byte b4) {
        this.f4171a = 1;
        this.f4174d = 0;
        com.google.crypto.tink.shaded.protobuf.A.a(abstractC0218j, "input");
        this.f4175e = abstractC0218j;
        abstractC0218j.f4169b = this;
    }
}
