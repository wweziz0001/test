package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.C0283z;
import androidx.lifecycle.EnumC0273o;
import androidx.lifecycle.InterfaceC0268j;
import androidx.lifecycle.InterfaceC0278u;
import com.example.hqp_mobile_app.R;
import io.flutter.embedding.android.AbstractActivityC0502v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import v1.C0916f;
import v1.C0917g;
import v1.InterfaceC0918h;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0278u, androidx.lifecycle.Z, InterfaceC0268j, InterfaceC0918h {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Object f4409e0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4410A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4411B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4412C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public L f4413D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0254v f4414E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public r f4416G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f4417H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f4418I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f4419J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f4420K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f4421L;
    public boolean M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f4423O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ViewGroup f4424P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public io.flutter.embedding.android.D f4425Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f4426R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0250q f4428T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f4429U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f4430V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f4431W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public EnumC0273o f4432X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0280w f4433Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public V f4434Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0283z f4435a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0917g f4436b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList f4437c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C0248o f4438d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f4440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SparseArray f4441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f4442o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bundle f4444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f4445r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4447t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4451x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4452z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4439l = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4443p = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f4446s = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f4448u = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public M f4415F = new M();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f4422N = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f4427S = true;

    public r() {
        io.flutter.embedding.android.r rVar = (io.flutter.embedding.android.r) this;
        new A.b(rVar, 4);
        this.f4432X = EnumC0273o.f4538p;
        this.f4435a0 = new C0283z();
        new AtomicInteger();
        this.f4437c0 = new ArrayList();
        this.f4438d0 = new C0248o(rVar);
        f();
    }

    public final C0250q a() {
        if (this.f4428T == null) {
            C0250q c0250q = new C0250q();
            Object obj = f4409e0;
            c0250q.f4405g = obj;
            c0250q.f4406h = obj;
            c0250q.i = obj;
            c0250q.f4407j = 1.0f;
            c0250q.f4408k = null;
            this.f4428T = c0250q;
        }
        return this.f4428T;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractActivityC0255w getActivity() {
        C0254v c0254v = this.f4414E;
        if (c0254v == null) {
            return null;
        }
        return c0254v.f4458q;
    }

    public final L c() {
        if (this.f4414E != null) {
            return this.f4415F;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int d() {
        EnumC0273o enumC0273o = this.f4432X;
        return (enumC0273o == EnumC0273o.f4535m || this.f4416G == null) ? enumC0273o.ordinal() : Math.min(enumC0273o.ordinal(), this.f4416G.d());
    }

    public final L e() {
        L l3 = this.f4413D;
        if (l3 != null) {
            return l3;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void f() {
        this.f4433Y = new C0280w(this);
        this.f4436b0 = new C0917g(this);
        ArrayList arrayList = this.f4437c0;
        C0248o c0248o = this.f4438d0;
        if (arrayList.contains(c0248o)) {
            return;
        }
        if (this.f4439l >= 0) {
            c0248o.a();
        } else {
            arrayList.add(c0248o);
        }
    }

    public final void g() {
        f();
        this.f4431W = this.f4443p;
        this.f4443p = UUID.randomUUID().toString();
        this.f4449v = false;
        this.f4450w = false;
        this.y = false;
        this.f4452z = false;
        this.f4410A = false;
        this.f4412C = 0;
        this.f4413D = null;
        this.f4415F = new M();
        this.f4414E = null;
        this.f4417H = 0;
        this.f4418I = 0;
        this.f4419J = null;
        this.f4420K = false;
        this.f4421L = false;
    }

    public final Context getContext() {
        C0254v c0254v = this.f4414E;
        if (c0254v == null) {
            return null;
        }
        return c0254v.f4459r;
    }

    @Override // androidx.lifecycle.InterfaceC0268j
    public final W.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = n().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + n().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        W.c cVar = new W.c();
        LinkedHashMap linkedHashMap = cVar.f2458a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.U.f4516a, application);
        }
        linkedHashMap.put(androidx.lifecycle.M.f4495a, this);
        linkedHashMap.put(androidx.lifecycle.M.f4496b, this);
        Bundle bundle = this.f4444q;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.M.f4497c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0278u
    public final AbstractC0274p getLifecycle() {
        return this.f4433Y;
    }

    @Override // v1.InterfaceC0918h
    public final C0916f getSavedStateRegistry() {
        return this.f4436b0.f10355b;
    }

    @Override // androidx.lifecycle.Z
    public final androidx.lifecycle.Y getViewModelStore() {
        if (this.f4413D == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (d() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f4413D.f4250N.f4287f;
        androidx.lifecycle.Y y = (androidx.lifecycle.Y) map.get(this.f4443p);
        if (y != null) {
            return y;
        }
        androidx.lifecycle.Y y4 = new androidx.lifecycle.Y();
        map.put(this.f4443p, y4);
        return y4;
    }

    public final boolean h() {
        return this.f4414E != null && this.f4449v;
    }

    public final boolean i() {
        if (!this.f4420K) {
            L l3 = this.f4413D;
            if (l3 == null) {
                return false;
            }
            r rVar = this.f4416G;
            l3.getClass();
            if (!(rVar == null ? false : rVar.i())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j() {
        return this.f4412C > 0;
    }

    public final void k() {
        this.f4415F.O();
        this.f4411B = true;
        this.f4434Z = new V(this, getViewModelStore(), new RunnableC0247n(this));
        io.flutter.embedding.android.r rVar = (io.flutter.embedding.android.r) this;
        io.flutter.embedding.android.D dG = rVar.f6608g0.g(io.flutter.embedding.android.r.f6606j0, rVar.f4444q.getBoolean("should_delay_first_android_view_draw"));
        this.f4425Q = dG;
        if (dG == null) {
            if (this.f4434Z.f4321o != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f4434Z = null;
            return;
        }
        this.f4434Z.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f4425Q + " for Fragment " + this);
        }
        io.flutter.embedding.android.D d5 = this.f4425Q;
        V v4 = this.f4434Z;
        N3.h.e(d5, "<this>");
        d5.setTag(R.id.view_tree_lifecycle_owner, v4);
        io.flutter.embedding.android.D d6 = this.f4425Q;
        V v5 = this.f4434Z;
        N3.h.e(d6, "<this>");
        d6.setTag(R.id.view_tree_view_model_store_owner, v5);
        io.flutter.embedding.android.D d7 = this.f4425Q;
        V v6 = this.f4434Z;
        N3.h.e(d7, "<this>");
        d7.setTag(R.id.view_tree_saved_state_registry_owner, v6);
        this.f4435a0.a(this.f4434Z);
    }

    public final LayoutInflater l() {
        C0254v c0254v = this.f4414E;
        if (c0254v == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0502v abstractActivityC0502v = c0254v.f4462u;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0502v.getLayoutInflater().cloneInContext(abstractActivityC0502v);
        layoutInflaterCloneInContext.setFactory2(this.f4415F.f4257f);
        return layoutInflaterCloneInContext;
    }

    public final AbstractActivityC0255w m() {
        AbstractActivityC0255w activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context n() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View o() {
        io.flutter.embedding.android.D d5 = this.f4425Q;
        if (d5 != null) {
            return d5;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4423O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4423O = true;
    }

    public final void p(int i, int i5, int i6, int i7) {
        if (this.f4428T == null && i == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        a().f4400b = i;
        a().f4401c = i5;
        a().f4402d = i6;
        a().f4403e = i7;
    }

    public final void q(Bundle bundle) {
        L l3 = this.f4413D;
        if (l3 != null && (l3.f4244G || l3.f4245H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f4444q = bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4443p);
        if (this.f4417H != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4417H));
        }
        if (this.f4419J != null) {
            sb.append(" tag=");
            sb.append(this.f4419J);
        }
        sb.append(")");
        return sb.toString();
    }
}
