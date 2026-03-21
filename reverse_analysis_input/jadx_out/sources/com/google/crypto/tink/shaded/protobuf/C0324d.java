package com.google.crypto.tink.shaded.protobuf;

import a0.C0157H;
import d0.AbstractC0360m;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0324d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5189c;

    public static byte[] b(byte b4, DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b4, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte b5 = dataInputStream.readByte();
            bArr[1] = b5;
            byteArrayOutputStream.write(b5);
        }
    }

    public m2.I a(byte[] bArr) {
        long j5;
        AbstractC0360m.c(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, t0.x.f9982r);
        ArrayList arrayList = (ArrayList) this.f5189c;
        arrayList.add(str);
        int i = this.f5187a;
        if (i == 1) {
            if (!t0.y.f9989a.matcher(str).matches() && !t0.y.f9990b.matcher(str).matches()) {
                return null;
            }
            this.f5187a = 2;
            return null;
        }
        if (i != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = t0.y.f9991c.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                j5 = Long.parseLong(strGroup);
            } else {
                j5 = -1;
            }
            if (j5 != -1) {
                this.f5188b = j5;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f5188b > 0) {
                this.f5187a = 3;
                return null;
            }
            m2.I iP = m2.I.p(arrayList);
            arrayList.clear();
            this.f5187a = 1;
            this.f5188b = 0L;
            return iP;
        } catch (NumberFormatException e5) {
            throw C0157H.b(str, e5);
        }
    }
}
