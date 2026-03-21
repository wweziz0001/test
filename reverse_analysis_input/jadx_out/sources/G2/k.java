package G2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Serializable f907l;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f907l = bool;
    }

    public static boolean l(k kVar) {
        Serializable serializable = kVar.f907l;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        Serializable serializable = this.f907l;
        Serializable serializable2 = kVar.f907l;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (l(this) && l(kVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? i().equals(kVar.i()) : k().longValue() == kVar.k().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : I2.d.j(h())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : I2.d.j(kVar.h())) == 0;
        }
        double dJ = j();
        double dJ2 = kVar.j();
        if (dJ != dJ2) {
            return Double.isNaN(dJ) && Double.isNaN(dJ2);
        }
        return true;
    }

    @Override // G2.g
    public final boolean f() {
        Serializable serializable = this.f907l;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(h());
    }

    @Override // G2.g
    public final String h() {
        Serializable serializable = this.f907l;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return k().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f907l;
        if (serializable == null) {
            return 31;
        }
        if (l(this)) {
            jDoubleToLongBits = k().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final BigInteger i() {
        Serializable serializable = this.f907l;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (l(this)) {
            return BigInteger.valueOf(k().longValue());
        }
        String strH = h();
        I2.d.d(strH);
        return new BigInteger(strH);
    }

    public final double j() {
        return this.f907l instanceof Number ? k().doubleValue() : Double.parseDouble(h());
    }

    public final Number k() {
        Serializable serializable = this.f907l;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new I2.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f907l = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f907l = str;
    }
}
