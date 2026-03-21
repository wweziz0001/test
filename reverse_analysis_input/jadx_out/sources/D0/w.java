package D0;

import a0.e0;
import androidx.datastore.preferences.protobuf.C0219k;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.d f524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f526c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.e f527d = new Z0.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z0.e f528e = new Z0.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0219k f529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f531h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f532j;

    public w(B0.d dVar, s sVar) {
        this.f524a = dVar;
        this.f525b = sVar;
        C0219k c0219k = new C0219k(2);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c0219k.f4172b = 0;
        c0219k.f4173c = 0;
        c0219k.f4175e = new long[iHighestOneBit];
        c0219k.f4174d = iHighestOneBit - 1;
        this.f529f = c0219k;
        this.f531h = e0.f3333d;
        this.f532j = -9223372036854775807L;
    }
}
