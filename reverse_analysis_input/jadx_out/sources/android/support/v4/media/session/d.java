package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    void A(String str, Bundle bundle);

    void B(int i, int i5);

    ParcelableVolumeInfo C();

    void D();

    Bundle E();

    void F(Uri uri, Bundle bundle);

    void G(MediaDescriptionCompat mediaDescriptionCompat);

    boolean H();

    void I(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent J();

    int K();

    void L(long j5);

    void M(int i);

    void O(int i);

    void P();

    void Q(String str, Bundle bundle);

    boolean R();

    String S();

    void W();

    void X(float f2);

    void Y(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List Z();

    void a();

    PlaybackStateCompat b();

    void b0(int i, int i5);

    void c();

    boolean d0(KeyEvent keyEvent);

    void e(int i);

    void f();

    CharSequence h();

    void i(String str, Bundle bundle);

    void j(InterfaceC0208b interfaceC0208b);

    void k(RatingCompat ratingCompat, Bundle bundle);

    MediaMetadataCompat l();

    void m(String str, Bundle bundle);

    void next();

    Bundle o();

    void p(InterfaceC0208b interfaceC0208b);

    void previous();

    void q(MediaDescriptionCompat mediaDescriptionCompat, int i);

    String s();

    void stop();

    void t(boolean z4);

    void u(RatingCompat ratingCompat);

    void v(String str, Bundle bundle);

    long w();

    void x(Uri uri, Bundle bundle);

    int y();

    void z(long j5);
}
