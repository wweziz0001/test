package h0;

import a0.C0177c;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d0.AbstractC0370w;
import java.io.Serializable;

/* JADX INFO: renamed from: h0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0456g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2.h f6127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0455f f6128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC0445D f6129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0177c f6130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6133g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f6134h;

    public C0456g(Context context, Handler handler, SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D) {
        C0453d c0453d = new C0453d(context, 0);
        this.f6127a = c0453d instanceof Serializable ? new l2.i(c0453d) : new l2.j(c0453d);
        this.f6129c = surfaceHolderCallbackC0445D;
        this.f6128b = new C0455f(this, handler);
        this.f6131e = 0;
    }

    public final void a() {
        int i = this.f6131e;
        if (i == 1 || i == 0) {
            return;
        }
        int i5 = AbstractC0370w.f5326a;
        l2.h hVar = this.f6127a;
        if (i5 < 26) {
            ((AudioManager) hVar.get()).abandonAudioFocus(this.f6128b);
        } else if (this.f6134h != null) {
            ((AudioManager) hVar.get()).abandonAudioFocusRequest(this.f6134h);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(a0.C0177c r7) {
        /*
            r6 = this;
            a0.c r0 = r6.f6130d
            int r1 = d0.AbstractC0370w.f5326a
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L3d
            r6.f6130d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L12
        L10:
            r2 = r0
            goto L31
        L12:
            r2 = 3
            r3 = 2
            java.lang.String r4 = "AudioFocusManager"
            int r5 = r7.f3325c
            switch(r5) {
                case 0: goto L2b;
                case 1: goto L29;
                case 2: goto L27;
                case 3: goto L10;
                case 4: goto L27;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L31;
                case 8: goto L31;
                case 9: goto L31;
                case 10: goto L31;
                case 11: goto L23;
                case 12: goto L31;
                case 13: goto L31;
                case 14: goto L29;
                case 15: goto L1b;
                case 16: goto L21;
                default: goto L1b;
            }
        L1b:
            java.lang.String r7 = "Unidentified audio usage: "
            b3.AbstractC0307a.o(r5, r7, r4)
            goto L10
        L21:
            r2 = 4
            goto L31
        L23:
            int r7 = r7.f3323a
            if (r7 != r1) goto L31
        L27:
            r2 = r3
            goto L31
        L29:
            r2 = r1
            goto L31
        L2b:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            d0.AbstractC0360m.y(r4, r7)
            goto L29
        L31:
            r6.f6132f = r2
            if (r2 == r1) goto L37
            if (r2 != 0) goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            d0.AbstractC0360m.b(r7, r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0456g.b(a0.c):void");
    }

    public final void c(int i) {
        if (this.f6131e == i) {
            return;
        }
        this.f6131e = i;
        float f2 = i == 4 ? 0.2f : 1.0f;
        if (this.f6133g == f2) {
            return;
        }
        this.f6133g = f2;
        SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D = this.f6129c;
        if (surfaceHolderCallbackC0445D != null) {
            C0448G c0448g = surfaceHolderCallbackC0445D.f5909l;
            c0448g.O(1, 2, Float.valueOf(c0448g.f5934V * c0448g.y.f6133g));
        }
    }

    public final int d(int i, boolean z4) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderO;
        int i5 = 0;
        z = false;
        boolean z5 = false;
        if (i == 1 || this.f6132f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z4) {
            int i6 = this.f6131e;
            if (i6 != 1) {
                return i6 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f6131e == 2) {
            return 1;
        }
        int i7 = AbstractC0370w.f5326a;
        l2.h hVar = this.f6127a;
        C0455f c0455f = this.f6128b;
        if (i7 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f6134h;
            if (audioFocusRequest == null) {
                if (audioFocusRequest == null) {
                    com.dexterous.flutterlocalnotifications.b.D();
                    builderO = com.dexterous.flutterlocalnotifications.b.k(this.f6132f);
                } else {
                    com.dexterous.flutterlocalnotifications.b.D();
                    builderO = com.dexterous.flutterlocalnotifications.b.o(this.f6134h);
                }
                C0177c c0177c = this.f6130d;
                if (c0177c != null && c0177c.f3323a == 1) {
                    z5 = true;
                }
                c0177c.getClass();
                this.f6134h = builderO.setAudioAttributes((AudioAttributes) c0177c.a().f190l).setWillPauseWhenDucked(z5).setOnAudioFocusChangeListener(c0455f).build();
            }
            iRequestAudioFocus = ((AudioManager) hVar.get()).requestAudioFocus(this.f6134h);
        } else {
            AudioManager audioManager = (AudioManager) hVar.get();
            C0177c c0177c2 = this.f6130d;
            c0177c2.getClass();
            int i8 = c0177c2.f3325c;
            if (i8 != 13) {
                switch (i8) {
                    case 2:
                        break;
                    case 3:
                        i5 = 8;
                        break;
                    case 4:
                        i5 = 4;
                        break;
                    case 5:
                    case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        i5 = 5;
                        break;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 2;
                        break;
                    default:
                        i5 = 3;
                        break;
                }
            } else {
                i5 = 1;
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(c0455f, i5, this.f6132f);
        }
        if (iRequestAudioFocus == 1) {
            c(2);
            return 1;
        }
        c(1);
        return -1;
    }
}
