package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import e.C0379a;
import e.C0388j;
import f.C0402a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4234a;

    public /* synthetic */ H(int i) {
        this.f4234a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b
    public final Intent a(AbstractActivityC0255w abstractActivityC0255w, Parcelable parcelable) {
        Bundle bundleExtra;
        switch (this.f4234a) {
            case 0:
                C0388j c0388j = (C0388j) parcelable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0388j.f5482m;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0388j.f5481l;
                        N3.h.e(intentSender, "intentSender");
                        c0388j = new C0388j(intentSender, null, c0388j.f5483n, c0388j.f5484o);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0388j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) parcelable;
                N3.h.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                N3.h.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                Intent intent3 = (Intent) parcelable;
                N3.h.e(intent3, "input");
                return intent3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b
    public C0402a b(AbstractActivityC0255w abstractActivityC0255w, Parcelable parcelable) {
        switch (this.f4234a) {
            case 1:
                String[] strArr = (String[]) parcelable;
                N3.h.e(strArr, "input");
                if (strArr.length == 0) {
                    return new C0402a(C3.o.f292l);
                }
                for (String str : strArr) {
                    if (i4.a.m(abstractActivityC0255w, str) != 0) {
                        return null;
                    }
                }
                int iB0 = C3.r.b0(strArr.length);
                if (iB0 < 16) {
                    iB0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0402a(linkedHashMap);
            default:
                return super.b(abstractActivityC0255w, parcelable);
        }
    }

    @Override // f.b
    public final Object c(Intent intent, int i) {
        switch (this.f4234a) {
            case 0:
                return new C0379a(intent, i);
            case 1:
                C3.o oVar = C3.o.f292l;
                if (i != -1 || intent == null) {
                    return oVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return oVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i5 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i5 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(C3.h.R(arrayList2), C3.h.R(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new B3.b(it.next(), it2.next()));
                }
                return C3.r.e0(arrayList3);
            default:
                return new C0379a(intent, i);
        }
    }
}
