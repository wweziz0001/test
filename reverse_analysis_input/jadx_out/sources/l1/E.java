package l1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import r1.C0755F;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f7920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7921e;

    public E(int i, int i5) {
        this(Integer.MIN_VALUE, i, i5);
    }

    public void a() {
        int i = this.f7919c;
        this.f7919c = i == Integer.MIN_VALUE ? this.f7917a : i + this.f7918b;
        this.f7921e = ((String) this.f7920d) + this.f7919c;
    }

    public int b(int i) {
        int i5 = this.f7918b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((ArrayList) this.f7920d).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f7920d).get(r3.size() - 1);
        C0755F c0755f = (C0755F) view.getLayoutParams();
        this.f7918b = ((StaggeredGridLayoutManager) this.f7921e).f4752j.c(view);
        c0755f.getClass();
        return this.f7918b;
    }

    public void c() {
        if (this.f7919c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public E(int i, int i5, int i6) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f7920d = str;
        this.f7917a = i5;
        this.f7918b = i6;
        this.f7919c = Integer.MIN_VALUE;
        this.f7921e = "";
    }

    public E(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f7921e = staggeredGridLayoutManager;
        this.f7920d = new ArrayList();
        this.f7917a = Integer.MIN_VALUE;
        this.f7918b = Integer.MIN_VALUE;
        this.f7919c = i;
    }
}
