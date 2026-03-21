package D;

import android.view.View;
import com.example.hqp_mobile_app.R;
import java.util.Objects;
import q.C0739i;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static void a(View view, G g5) {
        C0739i c0739i = (C0739i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0739i == null) {
            c0739i = new C0739i();
            view.setTag(R.id.tag_unhandled_key_listeners, c0739i);
        }
        Objects.requireNonNull(g5);
        View.OnUnhandledKeyEventListener c5 = new C();
        c0739i.put(g5, c5);
        view.addOnUnhandledKeyEventListener(c5);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, G g5) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0739i c0739i = (C0739i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0739i == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0739i.getOrDefault(g5, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, F.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
