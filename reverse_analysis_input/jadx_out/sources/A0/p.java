package A0;

import a0.C0177c;
import a0.C0190p;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f123d;

    public p(int i) {
        this.f121b = new long[i];
        this.f122c = new boolean[i];
        this.f123d = new int[i];
    }

    public boolean a(C0177c c0177c, C0190p c0190p) {
        boolean zEquals = Objects.equals(c0190p.f3424n, "audio/eac3-joc");
        int i = c0190p.f3402C;
        if (!zEquals) {
            String str = c0190p.f3424n;
            if (Objects.equals(str, "audio/iamf")) {
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
                i = 24;
            }
        } else if (i == 16) {
            i = 12;
        }
        int iR = AbstractC0370w.r(i);
        if (iR == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iR);
        int i5 = c0190p.f3403D;
        if (i5 != -1) {
            channelMask.setSampleRate(i5);
        }
        return ((Spatializer) this.f121b).canBeSpatialized((AudioAttributes) c0177c.a().f190l, channelMask.build());
    }

    public int[] b() {
        synchronized (this) {
            try {
                if (!this.f120a) {
                    return null;
                }
                long[] jArr = (long[]) this.f121b;
                int length = jArr.length;
                int i = 0;
                int i5 = 0;
                while (i < length) {
                    int i6 = i5 + 1;
                    int i7 = 1;
                    boolean z4 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f122c;
                    if (z4 != zArr[i5]) {
                        int[] iArr = (int[]) this.f123d;
                        if (!z4) {
                            i7 = 2;
                        }
                        iArr[i5] = i7;
                    } else {
                        ((int[]) this.f123d)[i5] = 0;
                    }
                    zArr[i5] = z4;
                    i++;
                    i5 = i6;
                }
                this.f120a = false;
                return (int[]) ((int[]) this.f123d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public p(Spatializer spatializer) {
        this.f121b = spatializer;
        this.f120a = spatializer.getImmersiveAudioLevel() != 0;
    }
}
