package t;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.example.hqp_mobile_app.R;
import x.AbstractC0953b;

/* JADX INFO: renamed from: t.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833w extends Q1.D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X f9794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f9795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f9796h;
    public PendingIntent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f9798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f9799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IconCompat f9800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f9801n;

    @Override // Q1.D
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f9793e);
        bundle.putBoolean("android.callIsVideo", this.f9797j);
        X x4 = this.f9794f;
        if (x4 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", AbstractC0831u.b(W.b(x4)));
            } else {
                bundle.putParcelable("android.callPersonCompat", x4.b());
            }
        }
        IconCompat iconCompat = this.f9800m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", AbstractC0830t.a(AbstractC0953b.f(iconCompat, ((r) this.f1788b).f9769a)));
        }
        bundle.putCharSequence("android.verificationText", this.f9801n);
        bundle.putParcelable("android.answerIntent", this.f9795g);
        bundle.putParcelable("android.declineIntent", this.f9796h);
        bundle.putParcelable("android.hangUpIntent", this.i);
        Integer num = this.f9798k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f9799l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // Q1.D
    public final void b(a1.j jVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f3517n;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i < 31) {
            X x4 = this.f9794f;
            builder.setContentTitle(x4 != null ? x4.f9725a : null);
            Bundle bundle = ((r) this.f1788b).f9791x;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : ((r) this.f1788b).f9791x.getCharSequence("android.text");
            if (charSequence == null) {
                int i5 = this.f9793e;
                if (i5 == 1) {
                    string = ((r) this.f1788b).f9769a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i5 == 2) {
                    string = ((r) this.f1788b).f9769a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i5 == 3) {
                    string = ((r) this.f1788b).f9769a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            X x5 = this.f9794f;
            if (x5 != null) {
                IconCompat iconCompat = x5.f9726b;
                if (iconCompat != null) {
                    AbstractC0830t.c(builder, AbstractC0953b.f(iconCompat, ((r) this.f1788b).f9769a));
                }
                if (i >= 28) {
                    X x6 = this.f9794f;
                    x6.getClass();
                    AbstractC0831u.a(builder, W.b(x6));
                } else {
                    AbstractC0829s.a(builder, this.f9794f.f9727c);
                }
            }
            AbstractC0829s.b(builder, "call");
            return;
        }
        int i6 = this.f9793e;
        if (i6 == 1) {
            X x7 = this.f9794f;
            x7.getClass();
            callStyleA = AbstractC0832v.a(W.b(x7), this.f9796h, this.f9795g);
        } else if (i6 == 2) {
            X x8 = this.f9794f;
            x8.getClass();
            callStyleA = AbstractC0832v.b(W.b(x8), this.i);
        } else if (i6 == 3) {
            X x9 = this.f9794f;
            x9.getClass();
            callStyleA = AbstractC0832v.c(W.b(x9), this.i, this.f9795g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f9793e));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.f9798k;
            if (num != null) {
                AbstractC0832v.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f9799l;
            if (num2 != null) {
                AbstractC0832v.f(callStyleA, num2.intValue());
            }
            AbstractC0832v.i(callStyleA, this.f9801n);
            IconCompat iconCompat2 = this.f9800m;
            if (iconCompat2 != null) {
                AbstractC0832v.h(callStyleA, AbstractC0953b.f(iconCompat2, ((r) this.f1788b).f9769a));
            }
            AbstractC0832v.g(callStyleA, this.f9797j);
        }
    }

    @Override // Q1.D
    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // Q1.D
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.f9793e = bundle.getInt("android.callType");
        this.f9797j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f9794f = W.a(androidx.media.C.c(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f9794f = X.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f9800m = IconCompat.d((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f9800m = IconCompat.c(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f9801n = bundle.getCharSequence("android.verificationText");
        this.f9795g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f9796h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.f9798k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f9799l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final C0823l j(int i, int i5, Integer num, int i6, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(u.b.a(((r) this.f1788b).f9769a, i6));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((r) this.f1788b).f9769a.getResources().getString(i5));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = ((r) this.f1788b).f9769a;
        PorterDuff.Mode mode = IconCompat.f4017k;
        context.getClass();
        C0823l c0823lA = new C0822k(IconCompat.g(context.getResources(), context.getPackageName(), i), spannableStringBuilder, pendingIntent).a();
        c0823lA.f9746a.putBoolean("key_action_priority", true);
        return c0823lA;
    }
}
