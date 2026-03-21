package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f6984a;
    private static final long serialVersionUID = 8352817235686L;

    abstract void S(ObjectOutput objectOutput);

    public abstract String getId();

    public abstract j$.time.zone.f r();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f6984a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = f6984a;
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return of(id);
    }

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(j$.time.zone.j.a());
    }

    public static ZoneId of(String str) {
        return B(str, true);
    }

    public static ZoneId I(String str, z zVar) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zVar, "offset");
        if (str.isEmpty()) {
            return zVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zVar.Y() != 0) {
            str = str.concat(zVar.getId());
        }
        return new A(str, j$.time.zone.f.h(zVar));
    }

    static ZoneId B(String str, boolean z4) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return z.Z(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return R(str, 3, z4);
        }
        if (str.startsWith("UT")) {
            return R(str, 2, z4);
        }
        return A.V(str, z4);
    }

    private static ZoneId R(String str, int i, boolean z4) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return I(strSubstring, z.f7202f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return A.V(str, z4);
        }
        try {
            z zVarZ = z.Z(str.substring(i));
            if (zVarZ == z.f7202f) {
                return I(strSubstring, zVarZ);
            }
            return I(strSubstring, zVarZ);
        } catch (c e5) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e5);
        }
    }

    ZoneId() {
        if (getClass() != z.class && getClass() != A.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }
}
