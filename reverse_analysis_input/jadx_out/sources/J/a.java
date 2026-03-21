package J;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.android.D;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;
import m.D0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i) {
        super(handler);
        this.f1081a = i;
        this.f1082b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1081a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4, Uri uri) {
        switch (this.f1081a) {
            case 2:
                k kVar = (k) this.f1082b;
                if (!kVar.f6947t) {
                    if (Settings.Global.getFloat(kVar.f6934f, "transition_animation_scale", 1.0f) == 0.0f) {
                        kVar.f6939l |= 4;
                    } else {
                        kVar.f6939l &= -5;
                    }
                    ((FlutterJNI) kVar.f6930b.f3025n).setAccessibilityFeatures(kVar.f6939l);
                    break;
                }
                break;
            default:
                super.onChange(z4, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(D0 d02) {
        super(new Handler());
        this.f1081a = 0;
        this.f1082b = d02;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        switch (this.f1081a) {
            case 0:
                D0 d02 = (D0) this.f1082b;
                if (d02.f1086m && (cursor = d02.f1087n) != null && !cursor.isClosed()) {
                    d02.f1085l = d02.f1087n.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z4);
                D d5 = (D) this.f1082b;
                if (d5.f6512s != null) {
                    d5.d();
                    break;
                }
                break;
            default:
                onChange(z4, null);
                break;
        }
    }
}
