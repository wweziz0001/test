package N1;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.A;
import androidx.fragment.app.C0246m;
import androidx.fragment.app.T;
import io.flutter.plugin.platform.y;
import io.flutter.plugin.platform.z;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1586l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f1587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f1588n;

    public i(A a5, T t4) {
        this.f1588n = a5;
        this.f1587m = t4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f1586l) {
            case 0:
                N3.h.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f1588n).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((j) this.f1587m).g(iBinder, activity);
                }
                break;
            case 1:
                T t4 = (T) this.f1587m;
                t4.k();
                C0246m.j((ViewGroup) t4.f4307c.f4425Q.getParent(), ((A) this.f1588n).f4220l).i();
                break;
            default:
                y yVar = new y(this, 0);
                View view2 = (View) this.f1587m;
                view2.getViewTreeObserver().addOnDrawListener(new z(view2, yVar));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1586l) {
            case 0:
                N3.h.e(view, "view");
                break;
        }
    }

    public i(View view, io.flutter.plugin.platform.l lVar) {
        this.f1587m = view;
        this.f1588n = lVar;
    }

    public i(j jVar, Activity activity) {
        N3.h.e(jVar, "sidecarCompat");
        this.f1587m = jVar;
        this.f1588n = new WeakReference(activity);
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
