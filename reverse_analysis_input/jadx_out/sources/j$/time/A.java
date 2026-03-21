package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class A extends ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6968d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f6970c;

    static A V(String str, boolean z4) {
        j$.time.zone.f fVarB;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarB = j$.time.zone.j.b(str, true);
            } catch (j$.time.zone.g e5) {
                if (z4) {
                    throw e5;
                }
                fVarB = null;
            }
            return new A(str, fVarB);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    A(String str, j$.time.zone.f fVar) {
        this.f6969b = str;
        this.f6970c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f6969b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f r() {
        j$.time.zone.f fVar = this.f6970c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.f6969b, false);
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void S(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f6969b);
    }

    final void Y(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f6969b);
    }
}
