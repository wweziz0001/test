package j0;

import F0.C0057d;
import a0.C0177c;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f7410a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f7411b = new w();

    public static AudioAttributes b(C0177c c0177c, boolean z4) {
        return z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0177c.a().f190l;
    }

    public static int c(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 768000;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 192000;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(C0057d c0057d, C0177c c0177c, int i) {
        int i5 = AbstractC0370w.f5326a;
        boolean z4 = c0057d.f751d;
        int i6 = c0057d.f748a;
        int i7 = c0057d.f750c;
        int i8 = c0057d.f749b;
        if (i5 < 23) {
            return new AudioTrack(b(c0177c, z4), AbstractC0370w.q(i8, i7, i6), c0057d.f753f, 1, i);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(c0177c, z4)).setAudioFormat(AbstractC0370w.q(i8, i7, i6)).setTransferMode(1).setBufferSizeInBytes(c0057d.f753f).setSessionId(i);
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(c0057d.f752e);
        }
        return sessionId.build();
    }
}
