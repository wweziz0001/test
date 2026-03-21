package y3;

import java.util.List;
import n3.InterfaceC0693c;

/* JADX INFO: renamed from: y3.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1010E implements InterfaceC0693c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1054y f10979m;

    public /* synthetic */ C1010E(C1054y c1054y, int i) {
        this.f10978l = i;
        this.f10979m = c1054y;
    }

    @Override // n3.InterfaceC0693c
    public final void u(Object obj) {
        switch (this.f10978l) {
            case 0:
                boolean z4 = obj instanceof List;
                M3.l lVar = (M3.l) this.f10979m.f11114m;
                if (!z4) {
                    lVar.c(new C1015J(i4.a.p(new C1030a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", ""))));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.c(new C1015J((String) list.get(0)));
                    } else {
                        Object obj2 = list.get(0);
                        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.c(new C1015J(i4.a.p(new C1030a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                boolean z5 = obj instanceof List;
                M3.l lVar2 = (M3.l) this.f10979m.f11114m;
                if (!z5) {
                    lVar2.c(new C1015J(i4.a.p(new C1030a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", ""))));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.c(new C1015J(B3.g.f275a));
                    } else {
                        Object obj4 = list2.get(0);
                        N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.c(new C1015J(i4.a.p(new C1030a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                boolean z6 = obj instanceof List;
                M3.l lVar3 = (M3.l) this.f10979m.f11114m;
                if (!z6) {
                    lVar3.c(new C1015J(i4.a.p(new C1030a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", ""))));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        lVar3.c(new C1015J(i4.a.p(new C1030a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        N3.h.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        lVar3.c(new C1015J((List) obj8));
                    } else {
                        lVar3.c(new C1015J(i4.a.p(new C1030a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
            default:
                boolean z7 = obj instanceof List;
                M3.l lVar4 = (M3.l) this.f10979m.f11114m;
                if (!z7) {
                    lVar4.c(new C1015J(i4.a.p(new C1030a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", ""))));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        N3.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        lVar4.c(new C1015J(i4.a.p(new C1030a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        N3.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        lVar4.c(new C1015J((Boolean) obj11));
                    } else {
                        lVar4.c(new C1015J(i4.a.p(new C1030a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
        }
    }
}
