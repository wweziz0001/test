package p1;

import a0.C0200z;
import android.content.pm.PackageInfo;
import b3.AbstractC0307a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0200z f9172a = new C0200z(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9173b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f9174c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9175d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f9176e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f9177f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9178g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f9179h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f9180j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(u0.e[] eVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (u0.e eVar : eVarArr) {
            length += ((((eVar.i * 2) + 7) & (-8)) / 8) + (eVar.f10187f * 2) + d(bArr, (String) eVar.f10183b, (String) eVar.f10184c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f10189h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f9177f)) {
            for (u0.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d(bArr, (String) eVar2.f10183b, (String) eVar2.f10184c));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f10185d;
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (u0.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d(bArr, (String) eVar3.f10183b, (String) eVar3.f10184c));
            }
            for (u0.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f10185d;
                int length3 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length3) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f9179h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9178g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return B0.i(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = inputStream.read(bArr, i6, i5 - i6);
            if (i7 < 0) {
                throw new IllegalStateException(AbstractC0307a.i("Not enough bytes to read: ", i5));
            }
            i6 += i7;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int iM = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i6] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i5, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int i8 = fileInputStream.read(bArr2);
                if (i8 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, i8);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i6 - iInflate);
                    i7 += i8;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i7 == i5) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    public static u0.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, u0.e[] eVarArr) throws IOException {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f9180j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                u0.e[] eVarArrK = k(byteArrayInputStream, bArr2, iM, eVarArr);
                byteArrayInputStream.close();
                return eVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9175d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            u0.e[] eVarArrJ = j(byteArrayInputStream2, iM2, eVarArr);
            byteArrayInputStream2.close();
            return eVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static u0.e[] j(ByteArrayInputStream byteArrayInputStream, int i5, u0.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new u0.e[0];
        }
        if (i5 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            u0.e eVar = eVarArr[i7];
            if (!((String) eVar.f10184c).equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            eVar.f10187f = i8;
            eVar.f10185d = g(byteArrayInputStream, i8);
        }
        return eVarArr;
    }

    public static u0.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, u0.e[] eVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new u0.e[0];
        }
        if (i5 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            u0.e eVar = null;
            if (eVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i7 = 0;
                while (true) {
                    if (i7 >= eVarArr.length) {
                        break;
                    }
                    if (((String) eVarArr[i7].f10184c).equals(strSubstring)) {
                        eVar = eVarArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            if (eVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            eVar.f10190j = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f9179h)) {
                eVar.f10187f = iM;
                eVar.f10185d = iArrG;
            }
        }
        return eVarArr;
    }

    public static u0.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f9176e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            u0.e[] eVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return eVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i5) throws IOException {
        byte[] bArrF = f(inputStream, i5);
        long j5 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j5 += ((long) (bArrF[i6] & 255)) << (i6 * 8);
        }
        return j5;
    }

    public static u0.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new u0.e[0];
        }
        u0.e[] eVarArr = new u0.e[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            eVarArr[i6] = new u0.e(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            u0.e eVar = eVarArr[i7];
            int iAvailable = byteArrayInputStream.available() - eVar.f10189h;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f10186e;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            eVar.f10185d = g(byteArrayInputStream, eVar.f10187f);
            int i8 = eVar.i;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = bitSetValueOf.get(i9) ? 2 : 0;
                if (bitSetValueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, u0.e[] eVarArr) throws IOException {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9175d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f9176e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(eVarArr, bArr3);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f9178g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, eVarArr.length, 1);
                for (u0.e eVar : eVarArr) {
                    int size = ((TreeMap) eVar.f10186e).size() * 4;
                    String strD = d(bArr4, (String) eVar.f10183b, (String) eVar.f10184c);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, ((int[]) eVar.f10185d).length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, eVar.f10188g, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = ((TreeMap) eVar.f10186e).keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i6 : (int[]) eVar.f10185d) {
                        u(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f9177f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(eVarArr, bArr5);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f9179h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, eVarArr.length);
            for (u0.e eVar2 : eVarArr) {
                String strD2 = d(bArr6, (String) eVar2.f10183b, (String) eVar2.f10184c);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = (TreeMap) eVar2.f10186e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar2.f10185d).length);
                t(byteArrayOutputStream, eVar2.f10188g, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : (int[]) eVar2.f10185d) {
                    u(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, eVarArr.length);
            int i8 = 2;
            int i9 = 2;
            for (u0.e eVar3 : eVarArr) {
                t(byteArrayOutputStream2, eVar3.f10188g, 4);
                t(byteArrayOutputStream2, eVar3.f10190j, 4);
                t(byteArrayOutputStream2, eVar3.i, 4);
                String strD3 = d(bArr2, (String) eVar3.f10183b, (String) eVar3.f10184c);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < eVarArr.length) {
                try {
                    u0.e eVar4 = eVarArr[i10];
                    u(byteArrayOutputStream3, i10);
                    u(byteArrayOutputStream3, eVar4.f10187f);
                    i11 = i11 + 4 + (eVar4.f10187f * 2);
                    int[] iArr = (int[]) eVar4.f10185d;
                    int length3 = iArr.length;
                    int i12 = i5;
                    while (i5 < length3) {
                        int i13 = iArr[i5];
                        u(byteArrayOutputStream3, i13 - i12);
                        i5++;
                        i12 = i13;
                    }
                    i10++;
                    i5 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < eVarArr.length) {
                try {
                    u0.e eVar5 = eVarArr[i14];
                    Iterator it3 = ((TreeMap) eVar5.f10186e).entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, eVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, eVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + i8 + byteArray4.length;
                            int i16 = i15 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i15 = i16 + length4;
                            i14++;
                            arrayList3 = arrayList4;
                            i8 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i17);
                int i18 = lVar4.f9191a;
                if (i18 == 1) {
                    j5 = 0;
                } else if (i18 == 2) {
                    j5 = 1;
                } else if (i18 == 3) {
                    j5 = 2;
                } else if (i18 == 4) {
                    j5 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                t(byteArrayOutputStream, j5, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = lVar4.f9192b;
                if (lVar4.f9193c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, u0.e eVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f10187f);
        t(byteArrayOutputStream, eVar.f10189h, 4);
        t(byteArrayOutputStream, eVar.f10188g, 4);
        t(byteArrayOutputStream, eVar.i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, u0.e eVar) throws IOException {
        byte[] bArr = new byte[(((eVar.i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f10186e).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + eVar.i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, u0.e eVar) throws IOException {
        int i5 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f10186e).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i5);
                u(byteArrayOutputStream, 0);
                i5 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0173 A[EXC_TOP_SPLITTER, PHI: r6
      0x0173: PHI (r6v26 char) = (r6v25 char), (r6v35 char), (r6v30 char) binds: [B:92:0x0169, B:94:0x016d, B:95:0x016f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, p1.c r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.d.s(android.content.Context, java.util.concurrent.Executor, p1.c, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j5, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j5 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i5) throws IOException {
        t(byteArrayOutputStream, i5, 2);
    }
}
