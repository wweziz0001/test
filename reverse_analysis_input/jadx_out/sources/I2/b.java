package I2;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Type f1023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Type f1024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Type[] f1025n;

    public b(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f1023l = type == null ? null : d.a(type);
        this.f1024m = d.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f1025n = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f1025n[i]);
            d.c(this.f1025n[i]);
            Type[] typeArr3 = this.f1025n;
            typeArr3[i] = d.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1025n.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1023l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1024m;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f1025n) ^ this.f1024m.hashCode();
        Type type = this.f1023l;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f1025n;
        int length = typeArr.length;
        Type type = this.f1024m;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.l(type));
        sb.append("<");
        sb.append(d.l(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(d.l(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
