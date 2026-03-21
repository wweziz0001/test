package j$.time.chrono;

import j$.time.ZoneId;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class E implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f6994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f6995b;

    public E() {
    }

    E(byte b4, Object obj) {
        this.f6994a = b4;
        this.f6995b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f6994a;
        Object obj = this.f6995b;
        objectOutput.writeByte(b4);
        switch (b4) {
            case 1:
                objectOutput.writeUTF(((AbstractC0508a) obj).getId());
                return;
            case 2:
                ((C0514g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((k) obj).writeExternal(objectOutput);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(xVar.i(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(xVar.i(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(xVar.i(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((y) obj).C(objectOutput);
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((q) obj).writeExternal(objectOutput);
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                C c5 = (C) obj;
                c5.getClass();
                objectOutput.writeInt(c5.i(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(c5.i(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(c5.i(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                I i = (I) obj;
                i.getClass();
                objectOutput.writeInt(i.i(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(i.i(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(i.i(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0515h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objR;
        byte b4 = objectInput.readByte();
        this.f6994a = b4;
        switch (b4) {
            case 1:
                int i = AbstractC0508a.f7003c;
                objR = AbstractC0508a.r(objectInput.readUTF());
                break;
            case 2:
                objR = ((InterfaceC0509b) objectInput.readObject()).J((j$.time.l) objectInput.readObject());
                break;
            case 3:
                objR = ((InterfaceC0512e) objectInput.readObject()).G((j$.time.z) objectInput.readObject()).H((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = x.f7041d;
                int i5 = objectInput.readInt();
                byte b5 = objectInput.readByte();
                byte b6 = objectInput.readByte();
                v.f7039d.getClass();
                objR = new x(j$.time.h.f0(i5, b5, b6));
                break;
            case 5:
                y yVar = y.f7045d;
                objR = y.w(objectInput.readByte());
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                o oVar = (o) objectInput.readObject();
                int i6 = objectInput.readInt();
                byte b7 = objectInput.readByte();
                byte b8 = objectInput.readByte();
                oVar.getClass();
                objR = q.Y(oVar, i6, b7, b8);
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i7 = objectInput.readInt();
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                A.f6990d.getClass();
                objR = new C(j$.time.h.f0(i7 + 1911, b9, b10));
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                int i8 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                G.f6997d.getClass();
                objR = new I(j$.time.h.f0(i8 - 543, b11, b12));
                break;
            case 9:
                int i9 = C0515h.f7008e;
                objR = new C0515h(AbstractC0508a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f6995b = objR;
    }

    private Object readResolve() {
        return this.f6995b;
    }
}
