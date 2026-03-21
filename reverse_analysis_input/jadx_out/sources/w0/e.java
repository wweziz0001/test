package w0;

import Z0.s;
import Z0.u;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UUID f10455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f10456g;

    @Override // w0.d
    public final Object b() {
        UUID uuid = this.f10455f;
        byte[] bArrA = s.a(uuid, null, this.f10456g);
        byte[] bArr = this.f10456g;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String string = sb.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b4 = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b4;
        byte b5 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b5;
        byte b6 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b6;
        byte b7 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b7;
        return new C0940a(uuid, bArrA, new u[]{new u(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // w0.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // w0.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10454e = false;
        }
    }

    @Override // w0.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10454e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f10455f = UUID.fromString(attributeValue);
        }
    }

    @Override // w0.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f10454e) {
            this.f10456g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
