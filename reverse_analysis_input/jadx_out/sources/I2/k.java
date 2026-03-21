package I2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Number {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1045l;

    public k(String str) {
        this.f1045l = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1045l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f1045l.equals(((k) obj).f1045l);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1045l);
    }

    public final int hashCode() {
        return this.f1045l.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f1045l;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.j(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f1045l;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f1045l;
    }
}
