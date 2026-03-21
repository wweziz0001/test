package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.EnumC0273o;
import d.InterfaceC0347b;
import e.C0388j;
import io.flutter.embedding.android.AbstractActivityC0502v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q.C0740j;
import t.AbstractC0812a;
import t.InterfaceC0814c;
import t.e0;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0255w extends androidx.activity.m implements InterfaceC0814c {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0258z mFragments;
    boolean mResumed;
    final C0280w mFragmentLifecycleRegistry = new C0280w(this);
    boolean mStopped = true;

    public AbstractActivityC0255w() {
        final AbstractActivityC0502v abstractActivityC0502v = (AbstractActivityC0502v) this;
        this.mFragments = new C0258z(new C0254v(abstractActivityC0502v));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0251s(abstractActivityC0502v, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new C.a() { // from class: androidx.fragment.app.t
            @Override // C.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC0502v.mFragments.a();
                        break;
                    default:
                        abstractActivityC0502v.mFragments.a();
                        break;
                }
            }
        });
        final int i5 = 1;
        addOnNewIntentListener(new C.a() { // from class: androidx.fragment.app.t
            @Override // C.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        abstractActivityC0502v.mFragments.a();
                        break;
                    default:
                        abstractActivityC0502v.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC0347b() { // from class: androidx.fragment.app.u
            @Override // d.InterfaceC0347b
            public final void a(androidx.activity.m mVar) {
                C0254v c0254v = abstractActivityC0502v.mFragments.f4472a;
                c0254v.f4461t.b(c0254v, c0254v, null);
            }
        });
    }

    public static boolean c(L l3) {
        boolean zC = false;
        for (r rVar : l3.f4254c.m()) {
            if (rVar != null) {
                C0254v c0254v = rVar.f4414E;
                if ((c0254v == null ? null : c0254v.f4462u) != null) {
                    zC |= c(rVar.c());
                }
                V v4 = rVar.f4434Z;
                EnumC0273o enumC0273o = EnumC0273o.f4537o;
                if (v4 != null) {
                    v4.b();
                    if (v4.f4321o.f4545c.compareTo(enumC0273o) >= 0) {
                        rVar.f4434Z.f4321o.g();
                        zC = true;
                    }
                }
                if (rVar.f4433Y.f4545c.compareTo(enumC0273o) >= 0) {
                    rVar.f4433Y.g();
                    zC = true;
                }
            }
        }
        return zC;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f4472a.f4461t.f4257f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                Z1.m mVar = new Z1.m(getViewModelStore(), X.b.f2483e);
                String canonicalName = X.b.class.getCanonicalName();
                if (canonicalName == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                C0740j c0740j = ((X.b) mVar.t(X.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f2484d;
                if (c0740j.f9241n > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (c0740j.f9241n > 0) {
                        if (c0740j.f9240m[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(c0740j.f9239l[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f4472a.f4461t.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public L getSupportFragmentManager() {
        return this.mFragments.f4472a.f4461t;
    }

    @Deprecated
    public X.a getSupportLoaderManager() {
        return new X.c(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (c(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(r rVar) {
    }

    @Override // androidx.activity.m, t.AbstractActivityC0820i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_CREATE);
        M m4 = this.mFragments.f4472a.f4461t;
        m4.f4244G = false;
        m4.f4245H = false;
        m4.f4250N.i = false;
        m4.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f4472a.f4461t.l();
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f4472a.f4461t.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f4472a.f4461t.u(5);
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f4472a.f4461t.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_RESUME);
        M m4 = this.mFragments.f4472a.f4461t;
        m4.f4244G = false;
        m4.f4245H = false;
        m4.f4250N.i = false;
        m4.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            M m4 = this.mFragments.f4472a.f4461t;
            m4.f4244G = false;
            m4.f4245H = false;
            m4.f4250N.i = false;
            m4.u(4);
        }
        this.mFragments.f4472a.f4461t.z(true);
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_START);
        M m5 = this.mFragments.f4472a.f4461t;
        m5.f4244G = false;
        m5.f4245H = false;
        m5.f4250N.i = false;
        m5.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        M m4 = this.mFragments.f4472a.f4461t;
        m4.f4245H = true;
        m4.f4250N.i = true;
        m4.u(4);
        this.mFragmentLifecycleRegistry.e(EnumC0272n.ON_STOP);
    }

    public void setEnterSharedElementCallback(e0 e0Var) {
        AbstractC0812a.c(this, null);
    }

    public void setExitSharedElementCallback(e0 e0Var) {
        AbstractC0812a.d(this, null);
    }

    public void startActivityFromFragment(r rVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (rVar.f4414E == null) {
            throw new IllegalStateException("Fragment " + rVar + " not attached to Activity");
        }
        L lE = rVar.e();
        if (lE.f4239B != null) {
            lE.f4242E.addLast(new I(rVar.f4443p, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            lE.f4239B.a(intent);
            return;
        }
        C0254v c0254v = lE.f4272v;
        c0254v.getClass();
        N3.h.e(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        c0254v.f4459r.startActivity(intent, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(r rVar, IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        Intent intent2 = intent;
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i5, i6, i7, bundle);
            return;
        }
        if (rVar.f4414E == null) {
            throw new IllegalStateException("Fragment " + rVar + " not attached to Activity");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + rVar + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        L lE = rVar.e();
        if (lE.f4240C == null) {
            C0254v c0254v = lE.f4272v;
            c0254v.getClass();
            N3.h.e(intentSender, "intent");
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            AbstractActivityC0255w abstractActivityC0255w = c0254v.f4458q;
            if (abstractActivityC0255w == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            abstractActivityC0255w.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + rVar);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        N3.h.e(intentSender, "intentSender");
        C0388j c0388j = new C0388j(intentSender, intent2, i5, i6);
        lE.f4242E.addLast(new I(rVar.f4443p, i));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + rVar + "is launching an IntentSender for result ");
        }
        lE.f4240C.a(c0388j);
    }

    public void supportFinishAfterTransition() {
        AbstractC0812a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0812a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0812a.e(this);
    }

    @Override // t.InterfaceC0814c
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(r rVar, Intent intent, int i) {
        startActivityFromFragment(rVar, intent, i, (Bundle) null);
    }
}
