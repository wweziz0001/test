package p1;

import android.content.res.AssetManager;
import android.os.Build;
import d0.RunnableC0355h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f9166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9168f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0.e[] f9169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f9170h;

    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        this.f9163a = executor;
        this.f9164b = cVar;
        this.f9167e = str;
        this.f9166d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = d.f9179h;
                    break;
                case 26:
                    bArr = d.f9178g;
                    break;
                case 27:
                    bArr = d.f9177f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f9176e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f9175d;
                    break;
            }
        }
        this.f9165c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9164b.h();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f9163a.execute(new RunnableC0355h(this, i, serializable, 1));
    }
}
