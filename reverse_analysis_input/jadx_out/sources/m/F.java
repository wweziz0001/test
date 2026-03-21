package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E {
    @Override // m.E, m.G
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.G
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
