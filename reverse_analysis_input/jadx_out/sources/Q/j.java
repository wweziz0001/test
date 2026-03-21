package Q;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q.C0736f;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile j f1713j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0736f f1715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f1719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f1721h;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1714a = reentrantReadWriteLock;
        this.f1716c = 3;
        i iVar = sVar.f1750a;
        this.f1719f = iVar;
        int i5 = sVar.f1751b;
        this.f1720g = i5;
        this.f1721h = sVar.f1752c;
        this.f1717d = new Handler(Looper.getMainLooper());
        this.f1715b = new C0736f(0);
        f fVar = new f(this);
        this.f1718e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f1716c = 0;
            } catch (Throwable th) {
                this.f1714a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (i) {
            try {
                jVar = f1713j;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1714a.readLock().lock();
        try {
            return this.f1716c;
        } finally {
            this.f1714a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1720g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1714a.writeLock().lock();
        try {
            if (this.f1716c == 0) {
                return;
            }
            this.f1716c = 0;
            this.f1714a.writeLock().unlock();
            f fVar = this.f1718e;
            j jVar = fVar.f1707a;
            try {
                jVar.f1719f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f1714a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1714a.writeLock().lock();
        try {
            this.f1716c = 2;
            arrayList.addAll(this.f1715b);
            this.f1715b.clear();
            this.f1714a.writeLock().unlock();
            this.f1717d.post(new h(arrayList, this.f1716c, th));
        } catch (Throwable th2) {
            this.f1714a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i5, int i6) {
        int iCharCount;
        w[] wVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i5 <= i6)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        y yVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i5 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i6 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i5 == i6) {
            return charSequence;
        }
        Z1.c cVar = this.f1718e.f1708b;
        cVar.getClass();
        boolean z4 = charSequence instanceof v;
        if (z4) {
            ((v) charSequence).a();
        }
        if (z4) {
            yVar = new y((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    yVar = new y((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i5 - 1, i6 + 1, w.class) <= i6) {
                    yVar = new y(charSequence);
                }
            } finally {
                if (z4) {
                    ((v) charSequence).b();
                }
            }
        }
        if (yVar != null && (wVarArr = (w[]) yVar.f1763m.getSpans(i5, i6, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = yVar.f1763m.getSpanStart(wVar);
                int spanEnd = yVar.f1763m.getSpanEnd(wVar);
                if (spanStart != i6) {
                    yVar.removeSpan(wVar);
                }
                i5 = Math.min(spanStart, i5);
                i6 = Math.max(spanEnd, i6);
            }
        }
        if (i5 != i6 && i5 < charSequence.length()) {
            q qVar = new q((t) ((Z1.i) cVar.f2996l).f3014n);
            int iCodePointAt = Character.codePointAt(charSequence, i5);
            int i7 = 0;
            y yVar2 = yVar;
            loop1: while (true) {
                iCharCount = i5;
                while (i5 < i6 && i7 < Integer.MAX_VALUE) {
                    int iA = qVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i5 = iCharCount;
                    } else if (iA == 2) {
                        i5 += Character.charCount(iCodePointAt);
                        if (i5 < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, i5);
                        }
                    } else if (iA == 3) {
                        if (!cVar.h(charSequence, iCharCount, i5, qVar.f1738d.f1754b)) {
                            if (yVar2 == null) {
                                yVar2 = new y((Spannable) new SpannableString(charSequence));
                            }
                            yVar2.setSpan(new w(qVar.f1738d.f1754b), iCharCount, i5, 33);
                            i7++;
                        }
                    }
                }
                break loop1;
            }
            if (qVar.f1735a == 2 && qVar.f1737c.f1754b != null && ((qVar.f1740f > 1 || qVar.c()) && i7 < Integer.MAX_VALUE && !cVar.h(charSequence, iCharCount, i5, qVar.f1737c.f1754b))) {
                if (yVar2 == null) {
                    yVar2 = new y(charSequence);
                }
                yVar2.setSpan(new w(qVar.f1737c.f1754b), iCharCount, i5, 33);
            }
            if (yVar2 != null) {
                Spannable spannable = yVar2.f1763m;
                if (z4) {
                    ((v) charSequence).b();
                }
                return spannable;
            }
            if (!z4) {
                return charSequence;
            }
        } else if (!z4) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(g gVar) {
        D1.b.n(gVar, "initCallback cannot be null");
        this.f1714a.writeLock().lock();
        try {
            if (this.f1716c == 1 || this.f1716c == 2) {
                this.f1717d.post(new h(Arrays.asList(gVar), this.f1716c, null));
            } else {
                this.f1715b.add(gVar);
            }
            this.f1714a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1714a.writeLock().unlock();
            throw th;
        }
    }
}
