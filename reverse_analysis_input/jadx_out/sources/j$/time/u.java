package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f7190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f7191b;

    public u() {
    }

    u(byte b4, Object obj) {
        this.f7190a = b4;
        this.f7191b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f7190a;
        Object obj = this.f7191b;
        objectOutput.writeByte(b4);
        switch (b4) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).a0(objectOutput);
                return;
            case 3:
                ((h) obj).t0(objectOutput);
                return;
            case 4:
                ((l) obj).o0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).p0(objectOutput);
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ZonedDateTime) obj).a0(objectOutput);
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((A) obj).Y(objectOutput);
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                ((z) obj).e0(objectOutput);
                return;
            case 9:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((w) obj).S(objectOutput);
                return;
            case 12:
                ((y) obj).Z(objectOutput);
                return;
            case 13:
                ((p) obj).B(objectOutput);
                return;
            case 14:
                ((t) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        this.f7190a = b4;
        this.f7191b = b(b4, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b4, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b4) {
            case 1:
                Duration duration = Duration.f6974c;
                return Duration.S(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f6977c;
                return Instant.V(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f7127d;
                return h.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return l.j0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f6980c;
                h hVar2 = h.f7127d;
                return LocalDateTime.g0(h.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.j0(objectInput));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ZonedDateTime.S(objectInput);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = A.f6968d;
                return ZoneId.B(objectInput.readUTF(), false);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return z.d0(objectInput);
            case 9:
                return s.I(objectInput);
            case 10:
                return r.I(objectInput);
            case 11:
                int i5 = w.f7194b;
                return w.r(objectInput.readInt());
            case 12:
                return y.S(objectInput);
            case 13:
                return p.r(objectInput);
            case 14:
                return t.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f7191b;
    }
}
