package t;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: t.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0808F extends Q1.D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9699e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9700f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X f9701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f9702h;
    public Boolean i;

    public C0808F() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t.C0808F j(android.app.Notification r6) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0808F.j(android.app.Notification):t.F");
    }

    @Override // Q1.D
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f9701g.f9725a);
        bundle.putBundle("android.messagingStyleUser", this.f9701g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f9702h);
        if (this.f9702h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f9702h);
        }
        ArrayList arrayList = this.f9699e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", C0807E.a(arrayList));
        }
        ArrayList arrayList2 = this.f9700f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C0807E.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // Q1.D
    public final void b(a1.j jVar) {
        Notification.MessagingStyle messagingStyleB;
        this.i = Boolean.valueOf(k());
        if (Build.VERSION.SDK_INT >= 28) {
            X x4 = this.f9701g;
            x4.getClass();
            messagingStyleB = AbstractC0804B.a(W.b(x4));
        } else {
            messagingStyleB = AbstractC0836z.b(this.f9701g.f9725a);
        }
        Iterator it = this.f9699e.iterator();
        while (it.hasNext()) {
            AbstractC0836z.a(messagingStyleB, ((C0807E) it.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f9700f.iterator();
            while (it2.hasNext()) {
                AbstractC0803A.a(messagingStyleB, ((C0807E) it2.next()).c());
            }
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            AbstractC0836z.c(messagingStyleB, this.f9702h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0804B.b(messagingStyleB, this.i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) jVar.f3517n);
    }

    @Override // Q1.D
    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // Q1.D
    public final void g(Bundle bundle) {
        super.g(bundle);
        ArrayList arrayList = this.f9699e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f9701g = X.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            X x4 = new X();
            x4.f9725a = string;
            x4.f9726b = null;
            x4.f9727c = null;
            x4.f9728d = null;
            x4.f9729e = false;
            x4.f9730f = false;
            this.f9701g = x4;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f9702h = charSequence;
        if (charSequence == null) {
            this.f9702h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(C0807E.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f9700f.addAll(C0807E.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final boolean k() {
        r rVar = (r) this.f1788b;
        if (rVar != null && rVar.f9769a.getApplicationInfo().targetSdkVersion < 28 && this.i == null) {
            return this.f9702h != null;
        }
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public C0808F(X x4) {
        if (!TextUtils.isEmpty(x4.f9725a)) {
            this.f9701g = x4;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
