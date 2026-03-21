package j$.time.zone;

import j$.time.z;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f7207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Serializable f7208b;

    public a() {
    }

    a(byte b4, Serializable serializable) {
        this.f7207a = b4;
        this.f7208b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f7207a;
        Serializable serializable = this.f7208b;
        objectOutput.writeByte(b4);
        if (b4 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b4 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b4 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b4 == 100) {
                ((f) serializable).k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableJ;
        byte b4 = objectInput.readByte();
        this.f7207a = b4;
        if (b4 == 1) {
            serializableJ = f.j(objectInput);
        } else if (b4 == 2) {
            long jA = a(objectInput);
            z zVarB = b(objectInput);
            z zVarB2 = b(objectInput);
            if (zVarB.equals(zVarB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableJ = new b(jA, zVarB, zVarB2);
        } else if (b4 == 3) {
            serializableJ = e.b(objectInput);
        } else {
            if (b4 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableJ = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f7208b = serializableJ;
    }

    private Object readResolve() {
        return this.f7208b;
    }

    static void d(z zVar, ObjectOutput objectOutput) {
        int iY = zVar.Y();
        int i = iY % 900 == 0 ? iY / 900 : 127;
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(iY);
        }
    }

    static z b(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        return b4 == 127 ? z.b0(objectInput.readInt()) : z.b0(b4 * 900);
    }

    static void c(long j5, ObjectOutput objectOutput) {
        if (j5 >= -4575744000L && j5 < 10413792000L && j5 % 900 == 0) {
            int i = (int) ((j5 + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j5);
    }

    static long a(ObjectInput objectInput) {
        int i = objectInput.readByte() & 255;
        if (i == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
