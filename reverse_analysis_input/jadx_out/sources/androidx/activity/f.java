package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.AbstractActivityC0255w;
import e.AbstractC0387i;
import e.C0388j;
import f.C0402a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0387i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0255w f3743h;

    public f(AbstractActivityC0255w abstractActivityC0255w) {
        this.f3743h = abstractActivityC0255w;
    }

    @Override // e.AbstractC0387i
    public final void b(int i, f.b bVar, Parcelable parcelable) {
        Bundle bundle;
        AbstractActivityC0255w abstractActivityC0255w = this.f3743h;
        C0402a c0402aB = bVar.b(abstractActivityC0255w, parcelable);
        if (c0402aB != null) {
            new Handler(Looper.getMainLooper()).post(new T1.i(this, i, c0402aB, 2));
            return;
        }
        Intent intentA = bVar.a(abstractActivityC0255w, parcelable);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(abstractActivityC0255w.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            i4.a.Q(abstractActivityC0255w, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            abstractActivityC0255w.startActivityForResult(intentA, i, bundle);
            return;
        }
        C0388j c0388j = (C0388j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            abstractActivityC0255w.startIntentSenderForResult(c0388j.f5481l, i, c0388j.f5482m, c0388j.f5483n, c0388j.f5484o, 0, bundle);
        } catch (IntentSender.SendIntentException e5) {
            new Handler(Looper.getMainLooper()).post(new T1.i(this, i, e5, 3));
        }
    }
}
