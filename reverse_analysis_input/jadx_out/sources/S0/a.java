package S0;

import Q1.C;
import a.AbstractC0149a;
import a0.C0155F;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f1984e = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f1985c = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharsetDecoder f1986d = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // Q1.C
    public final C0155F n(O0.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f1986d;
        CharsetDecoder charsetDecoder2 = this.f1985c;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C0155F(new c(bArr, null, null));
        }
        Matcher matcher = f1984e.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strI = AbstractC0149a.I(strGroup);
                strI.getClass();
                if (strI.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strI.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C0155F(new c(bArr, str, str2));
    }
}
