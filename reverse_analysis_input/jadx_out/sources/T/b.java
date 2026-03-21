package T;

import android.util.Log;
import b3.AbstractC0307a;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ByteOrder f2043p = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ByteOrder f2044q = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DataInputStream f2045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteOrder f2046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f2048o;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i) throws IOException {
        int i5 = 0;
        while (i5 < i) {
            DataInputStream dataInputStream = this.f2045l;
            int i6 = i - i5;
            int iSkip = (int) dataInputStream.skip(i6);
            if (iSkip <= 0) {
                if (this.f2048o == null) {
                    this.f2048o = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f2048o, 0, Math.min(8192, i6));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0307a.h(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += iSkip;
        }
        this.f2047n += i5;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2045l.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f2047n++;
        return this.f2045l.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f2047n++;
        return this.f2045l.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f2047n++;
        int i = this.f2045l.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f2047n += 2;
        return this.f2045l.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i5) throws IOException {
        this.f2047n += i5;
        this.f2045l.readFully(bArr, i, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f2047n += 4;
        DataInputStream dataInputStream = this.f2045l;
        int i = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i | i5 | i6 | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2046m;
        if (byteOrder == f2043p) {
            return (i7 << 24) + (i6 << 16) + (i5 << 8) + i;
        }
        if (byteOrder == f2044q) {
            return (i << 24) + (i5 << 16) + (i6 << 8) + i7;
        }
        throw new IOException("Invalid byte order: " + this.f2046m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f2047n += 8;
        DataInputStream dataInputStream = this.f2045l;
        int i = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i | i5 | i6 | i7 | i8 | i9 | i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2046m;
        if (byteOrder == f2043p) {
            return (((long) i11) << 56) + (((long) i10) << 48) + (((long) i9) << 40) + (((long) i8) << 32) + (((long) i7) << 24) + (((long) i6) << 16) + (((long) i5) << 8) + ((long) i);
        }
        if (byteOrder == f2044q) {
            return (((long) i) << 56) + (((long) i5) << 48) + (((long) i6) << 40) + (((long) i7) << 32) + (((long) i8) << 24) + (((long) i9) << 16) + (((long) i10) << 8) + ((long) i11);
        }
        throw new IOException("Invalid byte order: " + this.f2046m);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f2047n += 2;
        DataInputStream dataInputStream = this.f2045l;
        int i = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2046m;
        if (byteOrder == f2043p) {
            return (short) ((i5 << 8) + i);
        }
        if (byteOrder == f2044q) {
            return (short) ((i << 8) + i5);
        }
        throw new IOException("Invalid byte order: " + this.f2046m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f2047n += 2;
        return this.f2045l.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f2047n++;
        return this.f2045l.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f2047n += 2;
        DataInputStream dataInputStream = this.f2045l;
        int i = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2046m;
        if (byteOrder == f2043p) {
            return (i5 << 8) + i;
        }
        if (byteOrder == f2044q) {
            return (i << 8) + i5;
        }
        throw new IOException("Invalid byte order: " + this.f2046m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f2046m = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f2045l = dataInputStream;
        dataInputStream.mark(0);
        this.f2047n = 0;
        this.f2046m = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        int i6 = this.f2045l.read(bArr, i, i5);
        this.f2047n += i6;
        return i6;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f2047n += bArr.length;
        this.f2045l.readFully(bArr);
    }
}
