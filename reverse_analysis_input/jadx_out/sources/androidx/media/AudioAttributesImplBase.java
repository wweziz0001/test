package androidx.media;

import b3.AbstractC0307a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4566a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4567b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4568c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4569d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i = this.f4569d;
        return i != -1 ? i : AudioAttributesCompat.c(this.f4568c, this.f4566a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4567b != audioAttributesImplBase.f4567b) {
            return false;
        }
        int i = this.f4568c;
        int i5 = audioAttributesImplBase.f4568c;
        int iA = audioAttributesImplBase.a();
        if (iA == 6) {
            i5 |= 4;
        } else if (iA == 7) {
            i5 |= 1;
        }
        return i == (i5 & 273) && this.f4566a == audioAttributesImplBase.f4566a && this.f4569d == audioAttributesImplBase.f4569d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4567b), Integer.valueOf(this.f4568c), Integer.valueOf(this.f4566a), Integer.valueOf(this.f4569d)});
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4569d != -1) {
            sb.append(" stream=");
            sb.append(this.f4569d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f4566a;
        int i5 = AudioAttributesCompat.f4562b;
        switch (i) {
            case 0:
                strI = "USAGE_UNKNOWN";
                break;
            case 1:
                strI = "USAGE_MEDIA";
                break;
            case 2:
                strI = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strI = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strI = "USAGE_ALARM";
                break;
            case 5:
                strI = "USAGE_NOTIFICATION";
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                strI = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                strI = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                strI = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strI = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strI = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strI = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strI = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strI = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strI = "USAGE_GAME";
                break;
            case 15:
            default:
                strI = AbstractC0307a.i("unknown usage ", i);
                break;
            case 16:
                strI = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strI);
        sb.append(" content=");
        sb.append(this.f4567b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4568c).toUpperCase());
        return sb.toString();
    }
}
