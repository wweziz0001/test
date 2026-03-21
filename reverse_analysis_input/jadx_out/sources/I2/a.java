package I2;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Type f1022l;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f1022l = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1022l;
    }

    public final int hashCode() {
        return this.f1022l.hashCode();
    }

    public final String toString() {
        return d.l(this.f1022l) + "[]";
    }
}
