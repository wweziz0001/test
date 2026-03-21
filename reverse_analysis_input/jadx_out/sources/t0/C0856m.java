package t0;

import a.AbstractC0149a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import m2.C0635B;
import m2.C0639F;
import m2.C0660t;
import m2.C0662v;
import m2.I;
import m2.J;
import m2.b0;
import m3.C0675i;

/* JADX INFO: renamed from: t0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0856m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f9929a;

    static {
        new C0675i(21).j();
    }

    public C0856m(C0675i c0675i) {
        J j5;
        C0662v c0662v = (C0662v) ((A.j) c0675i.f8712m).f27m;
        if (c0662v == null) {
            j5 = C0635B.f8536p;
        } else {
            Collection collectionEntrySet = c0662v.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                j5 = C0635B.f8536p;
            } else {
                C0660t<Map.Entry> c0660t = (C0660t) collectionEntrySet;
                D0.d dVar = new D0.d(c0660t.f8653m.size());
                int i = 0;
                for (Map.Entry entry : c0660t) {
                    Object key = entry.getKey();
                    b0 b0VarG = ((C0639F) entry.getValue()).g();
                    dVar.o(key, b0VarG);
                    i += b0VarG.f8585o;
                }
                j5 = new J(dVar.f(), i);
            }
        }
        this.f9929a = j5;
    }

    public static String b(String str) {
        return AbstractC0149a.p(str, "Accept") ? "Accept" : AbstractC0149a.p(str, "Allow") ? "Allow" : AbstractC0149a.p(str, "Authorization") ? "Authorization" : AbstractC0149a.p(str, "Bandwidth") ? "Bandwidth" : AbstractC0149a.p(str, "Blocksize") ? "Blocksize" : AbstractC0149a.p(str, "Cache-Control") ? "Cache-Control" : AbstractC0149a.p(str, "Connection") ? "Connection" : AbstractC0149a.p(str, "Content-Base") ? "Content-Base" : AbstractC0149a.p(str, "Content-Encoding") ? "Content-Encoding" : AbstractC0149a.p(str, "Content-Language") ? "Content-Language" : AbstractC0149a.p(str, "Content-Length") ? "Content-Length" : AbstractC0149a.p(str, "Content-Location") ? "Content-Location" : AbstractC0149a.p(str, "Content-Type") ? "Content-Type" : AbstractC0149a.p(str, "CSeq") ? "CSeq" : AbstractC0149a.p(str, "Date") ? "Date" : AbstractC0149a.p(str, "Expires") ? "Expires" : AbstractC0149a.p(str, "Location") ? "Location" : AbstractC0149a.p(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : AbstractC0149a.p(str, "Proxy-Require") ? "Proxy-Require" : AbstractC0149a.p(str, "Public") ? "Public" : AbstractC0149a.p(str, "Range") ? "Range" : AbstractC0149a.p(str, "RTP-Info") ? "RTP-Info" : AbstractC0149a.p(str, "RTCP-Interval") ? "RTCP-Interval" : AbstractC0149a.p(str, "Scale") ? "Scale" : AbstractC0149a.p(str, "Session") ? "Session" : AbstractC0149a.p(str, "Speed") ? "Speed" : AbstractC0149a.p(str, "Supported") ? "Supported" : AbstractC0149a.p(str, "Timestamp") ? "Timestamp" : AbstractC0149a.p(str, "Transport") ? "Transport" : AbstractC0149a.p(str, "User-Agent") ? "User-Agent" : AbstractC0149a.p(str, "Via") ? "Via" : AbstractC0149a.p(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final J a() {
        return this.f9929a;
    }

    public final String c(String str) {
        I iD = this.f9929a.d(b(str));
        if (iD.isEmpty()) {
            return null;
        }
        return (String) m2.r.l(iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0856m) {
            return this.f9929a.equals(((C0856m) obj).f9929a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9929a.hashCode();
    }
}
