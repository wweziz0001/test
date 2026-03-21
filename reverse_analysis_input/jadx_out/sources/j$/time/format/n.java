package j$.time.format;

import j$.time.ZoneId;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class n implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f7087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f7088d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7090b;

    public /* synthetic */ n(Object obj, int i) {
        this.f7089a = i;
        this.f7090b = obj;
    }

    @Override // j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        switch (this.f7089a) {
            case 0:
                sb.append((String) this.f7090b);
                break;
            default:
                ZoneId zoneId = (ZoneId) tVar.f((C0518a) this.f7090b);
                if (zoneId != null) {
                    sb.append(zoneId.getId());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        int i5;
        switch (this.f7089a) {
            case 0:
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f7090b;
                return !qVar.r(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt != '+' && cCharAt != '-') {
                        int i6 = i + 2;
                        if (length >= i6) {
                            char cCharAt2 = charSequence.charAt(i + 1);
                            if (qVar.a(cCharAt, 'U') && qVar.a(cCharAt2, 'T')) {
                                int i7 = i + 3;
                                if (length >= i7 && qVar.a(charSequence.charAt(i6), 'C')) {
                                    return a(qVar, charSequence, i, i7, j.f7077f);
                                }
                                return a(qVar, charSequence, i, i6, j.f7077f);
                            }
                            if (qVar.a(cCharAt, 'G') && length >= (i5 = i + 3) && qVar.a(cCharAt2, 'M') && qVar.a(charSequence.charAt(i6), 'T')) {
                                int i8 = i + 4;
                                if (length >= i8 && qVar.a(charSequence.charAt(i5), '0')) {
                                    qVar.m(ZoneId.of("GMT0"));
                                    return i8;
                                }
                                return a(qVar, charSequence, i, i5, j.f7077f);
                            }
                        }
                        Set setA = j$.time.zone.j.a();
                        int size = setA.size();
                        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = qVar.j() ? f7087c : f7088d;
                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                            synchronized (this) {
                                try {
                                    simpleImmutableEntry = qVar.j() ? f7087c : f7088d;
                                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(setA, qVar));
                                        if (qVar.j()) {
                                            f7087c = simpleImmutableEntry;
                                        } else {
                                            f7088d = simpleImmutableEntry;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        l lVar = (l) simpleImmutableEntry.getValue();
                        ParsePosition parsePosition = new ParsePosition(i);
                        String strC = lVar.c(charSequence, parsePosition);
                        if (strC == null) {
                            if (qVar.a(cCharAt, 'Z')) {
                                qVar.m(j$.time.z.f7202f);
                                return i + 1;
                            }
                        } else {
                            qVar.m(ZoneId.of(strC));
                            return parsePosition.getIndex();
                        }
                    } else {
                        return a(qVar, charSequence, i, i, j.f7076e);
                    }
                    break;
                }
                return ~i;
        }
    }

    private static int a(q qVar, CharSequence charSequence, int i, int i5, j jVar) {
        String upperCase = charSequence.subSequence(i, i5).toString().toUpperCase();
        if (i5 >= charSequence.length()) {
            qVar.m(ZoneId.of(upperCase));
            return i5;
        }
        if (charSequence.charAt(i5) == '0' || qVar.a(charSequence.charAt(i5), 'Z')) {
            qVar.m(ZoneId.of(upperCase));
            return i5;
        }
        q qVarC = qVar.c();
        int iR = jVar.r(qVarC, charSequence, i5);
        try {
            if (iR < 0) {
                if (jVar == j.f7076e) {
                    return ~i;
                }
                qVar.m(ZoneId.of(upperCase));
                return i5;
            }
            qVar.m(ZoneId.I(upperCase, j$.time.z.b0((int) qVarC.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            return iR;
        } catch (j$.time.c unused) {
            return ~i;
        }
    }

    public final String toString() {
        switch (this.f7089a) {
            case 0:
                return "'" + ((String) this.f7090b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
