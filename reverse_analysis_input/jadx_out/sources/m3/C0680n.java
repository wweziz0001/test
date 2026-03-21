package m3;

import org.json.JSONObject;

/* JADX INFO: renamed from: m3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0680n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8740e;

    public C0680n(String str, int i, int i5, int i6, int i7) {
        if (!(i == -1 && i5 == -1) && (i < 0 || i5 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i5) + ")");
        }
        if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i6) + ", " + String.valueOf(i7) + ")");
        }
        if (i7 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i6));
        }
        if (i > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i5));
        }
        this.f8736a = str;
        this.f8737b = i;
        this.f8738c = i5;
        this.f8739d = i6;
        this.f8740e = i7;
    }

    public static C0680n a(JSONObject jSONObject) {
        return new C0680n(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
