package I2;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Type f1026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Type f1027m;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f1027m = null;
            this.f1026l = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f1027m = d.a(typeArr2[0]);
        this.f1026l = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1027m;
        return type != null ? new Type[]{type} : d.f1028a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f1026l};
    }

    public final int hashCode() {
        Type type = this.f1027m;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1026l.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1027m;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Type type2 = this.f1026l;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
