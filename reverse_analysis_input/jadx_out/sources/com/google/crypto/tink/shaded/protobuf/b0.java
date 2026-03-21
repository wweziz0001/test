package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0321a f5181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f5183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5184d;

    public b0(AbstractC0321a abstractC0321a, String str, Object[] objArr) {
        this.f5181a = abstractC0321a;
        this.f5182b = str;
        this.f5183c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5184d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f5184d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final AbstractC0321a a() {
        return this.f5181a;
    }

    public final Object[] b() {
        return this.f5183c;
    }

    public final String c() {
        return this.f5182b;
    }

    public final int d() {
        return (this.f5184d & 1) == 1 ? 1 : 2;
    }
}
