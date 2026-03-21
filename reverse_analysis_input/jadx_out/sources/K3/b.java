package K3;

import N3.h;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b extends IOException {
    public /* synthetic */ b(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        h.d(string, "toString(...)");
        super(string);
    }

    public b(String str) {
        super(str);
    }

    public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
