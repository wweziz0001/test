package Q;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.InterfaceC0263e;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0263e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0274p f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f1723b;

    public k(EmojiCompatInitializer emojiCompatInitializer, AbstractC0274p abstractC0274p) {
        this.f1723b = emojiCompatInitializer;
        this.f1722a = abstractC0274p;
    }

    @Override // androidx.lifecycle.InterfaceC0263e
    public final void a() {
        this.f1723b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
        this.f1722a.b(this);
    }
}
