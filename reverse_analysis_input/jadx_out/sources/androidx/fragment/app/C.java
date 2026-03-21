package androidx.fragment.app;

import android.util.Log;
import e.C0379a;
import e.InterfaceC0380b;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0380b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f4224b;

    public /* synthetic */ C(L l3, int i) {
        this.f4223a = i;
        this.f4224b = l3;
    }

    @Override // e.InterfaceC0380b
    public final void a(Object obj) {
        switch (this.f4223a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                L l3 = this.f4224b;
                I i5 = (I) l3.f4242E.pollFirst();
                if (i5 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = i5.f4235l;
                    r rVarJ = l3.f4254c.j(str);
                    if (rVarJ == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        int i6 = i5.f4236m;
                        io.flutter.embedding.android.r rVar = (io.flutter.embedding.android.r) rVarJ;
                        if (rVar.r("onRequestPermissionsResult")) {
                            rVar.f6608g0.k(i6, strArr, iArr);
                        }
                    }
                }
                break;
            case 1:
                C0379a c0379a = (C0379a) obj;
                L l4 = this.f4224b;
                I i7 = (I) l4.f4242E.pollLast();
                if (i7 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = i7.f4235l;
                    r rVarJ2 = l4.f4254c.j(str2);
                    if (rVarJ2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        int i8 = c0379a.f5461l;
                        int i9 = i7.f4236m;
                        io.flutter.embedding.android.r rVar2 = (io.flutter.embedding.android.r) rVarJ2;
                        if (rVar2.r("onActivityResult")) {
                            rVar2.f6608g0.e(i9, i8, c0379a.f5462m);
                        }
                    }
                }
                break;
            default:
                C0379a c0379a2 = (C0379a) obj;
                L l5 = this.f4224b;
                I i10 = (I) l5.f4242E.pollFirst();
                if (i10 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = i10.f4235l;
                    r rVarJ3 = l5.f4254c.j(str3);
                    if (rVarJ3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        int i11 = c0379a2.f5461l;
                        int i12 = i10.f4236m;
                        io.flutter.embedding.android.r rVar3 = (io.flutter.embedding.android.r) rVarJ3;
                        if (rVar3.r("onActivityResult")) {
                            rVar3.f6608g0.e(i12, i11, c0379a2.f5462m);
                        }
                    }
                }
                break;
        }
    }
}
