package androidx.activity;

import D.C0008h;
import D.C0009i;
import D.InterfaceC0011k;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC0255w;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0270l;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.EnumC0273o;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0268j;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import com.example.hqp_mobile_app.R;
import d.C0346a;
import d.InterfaceC0347b;
import e.AbstractC0381c;
import e.AbstractC0387i;
import e.C0382d;
import e.C0383e;
import e.C0386h;
import e.InterfaceC0380b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t.AbstractActivityC0820i;
import t.C0821j;
import v1.C0916f;
import v1.C0917g;
import v1.InterfaceC0918h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AbstractActivityC0820i implements Z, InterfaceC0268j, InterfaceC0918h, y, u.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC0387i mActivityResultRegistry;
    private int mContentLayoutId;
    private W mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final n mFullyDrawnReporter;
    private final C0009i mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private x mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<C.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<C.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnTrimMemoryListeners;
    final k mReportFullyDrawnExecutor;
    final C0917g mSavedStateRegistryController;
    private Y mViewModelStore;
    final C0346a mContextAwareHelper = new C0346a();
    private final C0280w mLifecycleRegistry = new C0280w(this);

    public m() {
        final AbstractActivityC0255w abstractActivityC0255w = (AbstractActivityC0255w) this;
        this.mMenuHostHelper = new C0009i(new A3.c(abstractActivityC0255w, 7));
        C0917g c0917g = new C0917g(this);
        this.mSavedStateRegistryController = c0917g;
        this.mOnBackPressedDispatcher = null;
        l lVar = new l(abstractActivityC0255w);
        this.mReportFullyDrawnExecutor = lVar;
        this.mFullyDrawnReporter = new n(lVar, new Z2.a(abstractActivityC0255w, 1));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new f(abstractActivityC0255w);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new g(abstractActivityC0255w, 1));
        getLifecycle().a(new g(abstractActivityC0255w, 0));
        getLifecycle().a(new g(abstractActivityC0255w, 2));
        c0917g.a();
        M.e(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new d(abstractActivityC0255w, 0));
        addOnContextAvailableListener(new InterfaceC0347b() { // from class: androidx.activity.e
            @Override // d.InterfaceC0347b
            public final void a(m mVar) {
                m.a(abstractActivityC0255w);
            }
        });
    }

    public static void a(AbstractActivityC0255w abstractActivityC0255w) {
        Bundle bundleA = abstractActivityC0255w.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            AbstractC0387i abstractC0387i = ((m) abstractActivityC0255w).mActivityResultRegistry;
            abstractC0387i.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC0387i.f5477d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC0387i.f5480g;
            bundle2.putAll(bundle);
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                HashMap map = abstractC0387i.f5475b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = abstractC0387i.f5474a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    public static Bundle b(AbstractActivityC0255w abstractActivityC0255w) {
        Bundle bundle = new Bundle();
        AbstractC0387i abstractC0387i = ((m) abstractActivityC0255w).mActivityResultRegistry;
        abstractC0387i.getClass();
        HashMap map = abstractC0387i.f5475b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0387i.f5477d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0387i.f5480g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.f(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0011k interfaceC0011k) {
        C0009i c0009i = this.mMenuHostHelper;
        c0009i.f352b.add(interfaceC0011k);
        c0009i.f351a.run();
    }

    @Override // u.i
    public final void addOnConfigurationChangedListener(C.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC0347b interfaceC0347b) {
        C0346a c0346a = this.mContextAwareHelper;
        c0346a.getClass();
        N3.h.e(interfaceC0347b, "listener");
        m mVar = c0346a.f5269b;
        if (mVar != null) {
            interfaceC0347b.a(mVar);
        }
        c0346a.f5268a.add(interfaceC0347b);
    }

    public final void addOnMultiWindowModeChangedListener(C.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.mViewModelStore = jVar.f3748b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new Y();
            }
        }
    }

    public final AbstractC0387i getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0268j
    public W.b getDefaultViewModelCreationExtras() {
        W.c cVar = new W.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2458a;
        if (application != null) {
            linkedHashMap.put(U.f4516a, getApplication());
        }
        linkedHashMap.put(M.f4495a, this);
        linkedHashMap.put(M.f4496b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(M.f4497c, getIntent().getExtras());
        }
        return cVar;
    }

    public W getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new P(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public n getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f3747a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0278u
    public AbstractC0274p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.y
    public final x getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new x(new h(this));
            getLifecycle().a(new g(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // v1.InterfaceC0918h
    public final C0916f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f10355b;
    }

    @Override // androidx.lifecycle.Z
    public Y getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        N3.h.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        N3.h.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        N3.h.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        N3.h.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        N3.h.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        if (this.mActivityResultRegistry.a(i, i5, intent)) {
            return;
        }
        super.onActivityResult(i, i5, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // t.AbstractActivityC0820i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        C0346a c0346a = this.mContextAwareHelper;
        c0346a.getClass();
        c0346a.f5269b = this;
        Iterator it = c0346a.f5268a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0347b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = I.f4484m;
        M.g(this);
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0009i c0009i = this.mMenuHostHelper;
        getMenuInflater();
        Iterator it = c0009i.f352b.iterator();
        while (it.hasNext()) {
            ((E) ((InterfaceC0011k) it.next())).f4230a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<C.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0821j(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<C.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.f352b.iterator();
        while (it.hasNext()) {
            ((E) ((InterfaceC0011k) it.next())).f4230a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<C.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new t.Y(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.mMenuHostHelper.f352b.iterator();
        while (it.hasNext()) {
            ((E) ((InterfaceC0011k) it.next())).f4230a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        Y y = this.mViewModelStore;
        if (y == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            y = jVar.f3748b;
        }
        if (y == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f3747a = objOnRetainCustomNonConfigurationInstance;
        jVar2.f3748b = y;
        return jVar2;
    }

    @Override // t.AbstractActivityC0820i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0274p lifecycle = getLifecycle();
        if (lifecycle instanceof C0280w) {
            ((C0280w) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f5269b;
    }

    public final <I, O> AbstractC0381c registerForActivityResult(f.b bVar, AbstractC0387i abstractC0387i, InterfaceC0380b interfaceC0380b) {
        String str = "activity_rq#" + this.mNextLocalRequestCode.getAndIncrement();
        abstractC0387i.getClass();
        AbstractC0274p lifecycle = getLifecycle();
        C0280w c0280w = (C0280w) lifecycle;
        if (c0280w.f4545c.compareTo(EnumC0273o.f4537o) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c0280w.f4545c + ". LifecycleOwners must call register before they are STARTED.");
        }
        abstractC0387i.d(str);
        HashMap map = abstractC0387i.f5476c;
        C0386h c0386h = (C0386h) map.get(str);
        if (c0386h == null) {
            c0386h = new C0386h(lifecycle);
        }
        C0382d c0382d = new C0382d(abstractC0387i, str, interfaceC0380b, bVar);
        c0386h.f5472a.a(c0382d);
        c0386h.f5473b.add(c0382d);
        map.put(str, c0386h);
        return new C0383e();
    }

    public void removeMenuProvider(InterfaceC0011k interfaceC0011k) {
        this.mMenuHostHelper.b(interfaceC0011k);
    }

    @Override // u.i
    public final void removeOnConfigurationChangedListener(C.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC0347b interfaceC0347b) {
        C0346a c0346a = this.mContextAwareHelper;
        c0346a.getClass();
        N3.h.e(interfaceC0347b, "listener");
        c0346a.f5268a.remove(interfaceC0347b);
    }

    public final void removeOnMultiWindowModeChangedListener(C.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Z1.f.B()) {
                Trace.beginSection(Z1.f.N("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            n nVar = this.mFullyDrawnReporter;
            synchronized (nVar.f3753a) {
                try {
                    nVar.f3754b = true;
                    Iterator it = nVar.f3755c.iterator();
                    while (it.hasNext()) {
                        ((M3.a) it.next()).d();
                    }
                    nVar.f3755c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.f(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            for (C.a aVar : this.mOnMultiWindowModeChangedListeners) {
                N3.h.e(configuration, "newConfig");
                aVar.accept(new C0821j(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            for (C.a aVar : this.mOnPictureInPictureModeChangedListeners) {
                N3.h.e(configuration, "newConfig");
                aVar.accept(new t.Y(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.f(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0011k interfaceC0011k, InterfaceC0278u interfaceC0278u) {
        final C0009i c0009i = this.mMenuHostHelper;
        c0009i.f352b.add(interfaceC0011k);
        c0009i.f351a.run();
        AbstractC0274p lifecycle = interfaceC0278u.getLifecycle();
        HashMap map = c0009i.f353c;
        C0008h c0008h = (C0008h) map.remove(interfaceC0011k);
        if (c0008h != null) {
            c0008h.f349a.b(c0008h.f350b);
            c0008h.f350b = null;
        }
        map.put(interfaceC0011k, new C0008h(lifecycle, new InterfaceC0276s() { // from class: D.g
            @Override // androidx.lifecycle.InterfaceC0276s
            public final void b(InterfaceC0278u interfaceC0278u2, EnumC0272n enumC0272n) {
                EnumC0272n enumC0272n2 = EnumC0272n.ON_DESTROY;
                C0009i c0009i2 = c0009i;
                if (enumC0272n == enumC0272n2) {
                    c0009i2.b(interfaceC0011k);
                } else {
                    c0009i2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.f(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0011k interfaceC0011k, InterfaceC0278u interfaceC0278u, final EnumC0273o enumC0273o) {
        final C0009i c0009i = this.mMenuHostHelper;
        c0009i.getClass();
        AbstractC0274p lifecycle = interfaceC0278u.getLifecycle();
        HashMap map = c0009i.f353c;
        C0008h c0008h = (C0008h) map.remove(interfaceC0011k);
        if (c0008h != null) {
            c0008h.f349a.b(c0008h.f350b);
            c0008h.f350b = null;
        }
        map.put(interfaceC0011k, new C0008h(lifecycle, new InterfaceC0276s() { // from class: D.f
            @Override // androidx.lifecycle.InterfaceC0276s
            public final void b(InterfaceC0278u interfaceC0278u2, EnumC0272n enumC0272n) {
                C0009i c0009i2 = c0009i;
                c0009i2.getClass();
                EnumC0272n.Companion.getClass();
                EnumC0273o enumC0273o2 = enumC0273o;
                N3.h.e(enumC0273o2, "state");
                int iOrdinal = enumC0273o2.ordinal();
                EnumC0272n enumC0272n2 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0272n.ON_RESUME : EnumC0272n.ON_START : EnumC0272n.ON_CREATE;
                Runnable runnable = c0009i2.f351a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0009i2.f352b;
                InterfaceC0011k interfaceC0011k2 = interfaceC0011k;
                if (enumC0272n == enumC0272n2) {
                    copyOnWriteArrayList.add(interfaceC0011k2);
                    runnable.run();
                } else if (enumC0272n == EnumC0272n.ON_DESTROY) {
                    c0009i2.b(interfaceC0011k2);
                } else if (enumC0272n == C0270l.a(enumC0273o2)) {
                    copyOnWriteArrayList.remove(interfaceC0011k2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0381c registerForActivityResult(f.b bVar, InterfaceC0380b interfaceC0380b) {
        return registerForActivityResult(bVar, this.mActivityResultRegistry, interfaceC0380b);
    }
}
