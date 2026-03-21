package l;

import D.K;
import D.M;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.E;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m.InterfaceC0600l;
import m.L0;
import u.AbstractC0884a;

/* JADX INFO: renamed from: l.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0550h implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f7734u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f7736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E f7739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f7740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f7741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7742h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f7743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f7745l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MenuItemC0551i f7752s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7746m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7747n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7748o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7749p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f7750q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f7751r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7753t = false;

    public MenuC0550h(Context context) {
        boolean zB;
        boolean z4 = false;
        this.f7735a = context;
        Resources resources = context.getResources();
        this.f7736b = resources;
        this.f7740f = new ArrayList();
        this.f7741g = new ArrayList();
        this.f7742h = true;
        this.i = new ArrayList();
        this.f7743j = new ArrayList();
        this.f7744k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = M.f303a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = K.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z4 = true;
            }
        }
        this.f7738d = z4;
    }

    public final MenuItemC0551i a(int i, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f7734u[i8] << 16) | (65535 & i6);
        MenuItemC0551i menuItemC0551i = new MenuItemC0551i(this, i, i5, i6, i9, charSequence);
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((MenuItemC0551i) arrayList.get(size)).f7759d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, menuItemC0551i);
        o(true);
        return menuItemC0551i;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f7735a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0551i menuItemC0551iA = a(i, i5, i6, resolveInfo.loadLabel(packageManager));
            menuItemC0551iA.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC0551iA.f7762g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = menuItemC0551iA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0557o interfaceC0557o, Context context) {
        this.f7751r.add(new WeakReference(interfaceC0557o));
        interfaceC0557o.a(context, this);
        this.f7744k = true;
    }

    public final void c(boolean z4) {
        if (this.f7749p) {
            return;
        }
        this.f7749p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7751r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
            if (interfaceC0557o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0557o.b(this, z4);
            }
        }
        this.f7749p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0551i menuItemC0551i = this.f7752s;
        if (menuItemC0551i != null) {
            d(menuItemC0551i);
        }
        this.f7740f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f7745l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC0551i menuItemC0551i) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7751r;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f7752s == menuItemC0551i) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
                if (interfaceC0557o != null) {
                    zK = interfaceC0557o.k(menuItemC0551i);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zK) {
                this.f7752s = null;
            }
        }
        return zK;
    }

    public boolean e(MenuC0550h menuC0550h, MenuItem menuItem) {
        InterfaceC0600l interfaceC0600l;
        E e5 = this.f7739e;
        return (e5 == null || (interfaceC0600l = ((ActionMenuView) e5.f4474m).f3863J) == null || !((L0) interfaceC0600l).f8290a.f3978R.a()) ? false : true;
    }

    public boolean f(MenuItemC0551i menuItemC0551i) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7751r;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
            if (interfaceC0557o != null) {
                zJ = interfaceC0557o.j(menuItemC0551i);
                if (zJ) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zJ) {
            this.f7752s = menuItemC0551i;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
            if (menuItemC0551i.f7756a == i) {
                return menuItemC0551i;
            }
            if (menuItemC0551i.hasSubMenu() && (menuItemFindItem = menuItemC0551i.f7769o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final MenuItemC0551i g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7750q;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0551i) arrayList.get(0);
        }
        boolean zM = m();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
            char c5 = zM ? menuItemC0551i.f7764j : menuItemC0551i.f7763h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (zM && c5 == '\b' && i == 67))) {
                return menuItemC0551i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f7740f.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.m()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f7740f
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            l.i r12 = (l.MenuItemC0551i) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            l.s r13 = r12.f7769o
            r13.h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f7764j
            goto L42
        L40:
            char r13 = r12.f7763h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f7765k
            goto L49
        L47:
            int r14 = r12.i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.MenuC0550h.h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemC0551i) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f7744k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7751r;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
                if (interfaceC0557o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= interfaceC0557o.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f7743j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i = 0; i < size; i++) {
                    MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayListK.get(i);
                    if (menuItemC0551i.d()) {
                        arrayList.add(menuItemC0551i);
                    } else {
                        arrayList2.add(menuItemC0551i);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f7744k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z4 = this.f7742h;
        ArrayList arrayList = this.f7741g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f7740f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList2.get(i);
            if (menuItemC0551i.isVisible()) {
                arrayList.add(menuItemC0551i);
            }
        }
        this.f7742h = false;
        this.f7744k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f7753t;
    }

    public boolean m() {
        return this.f7737c;
    }

    public boolean n() {
        return this.f7738d;
    }

    public final void o(boolean z4) {
        if (this.f7746m) {
            this.f7747n = true;
            if (z4) {
                this.f7748o = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f7742h = true;
            this.f7744k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7751r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) weakReference.get();
            if (interfaceC0557o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0557o.e();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, l.AbstractC0552j r7, int r8) {
        /*
            r5 = this;
            l.i r6 = (l.MenuItemC0551i) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f7770p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            l.h r1 = r6.f7768n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f7762g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f7735a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            l.s r8 = new l.s
            android.content.Context r3 = r5.f7735a
            r8.<init>(r3, r5, r6)
            r6.f7769o = r8
            java.lang.CharSequence r3 = r6.f7760e
            r8.setHeaderTitle(r3)
        L70:
            l.s r6 = r6.f7769o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f7751r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.f(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            l.o r4 = (l.InterfaceC0557o) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.f(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.MenuC0550h.p(android.view.MenuItem, l.j, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i5) {
        return p(findItem(i), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i5) {
        MenuItemC0551i menuItemC0551iG = g(i, keyEvent);
        boolean zP = menuItemC0551iG != null ? p(menuItemC0551iG, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i, CharSequence charSequence, int i5, View view) {
        if (view != null) {
            this.f7745l = null;
        } else {
            if (i > 0) {
                this.f7745l = this.f7736b.getText(i);
            } else if (charSequence != null) {
                this.f7745l = charSequence;
            }
            if (i5 > 0) {
                AbstractC0884a.b(this.f7735a, i5);
            }
        }
        o(false);
    }

    public final void r() {
        this.f7746m = false;
        if (this.f7747n) {
            this.f7747n = false;
            o(this.f7748o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((MenuItemC0551i) arrayList.get(i6)).f7757b == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((MenuItemC0551i) arrayList.get(i6)).f7757b != i) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f7740f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((MenuItemC0551i) arrayList.get(i5)).f7756a == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f7740f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            o(true);
        }
    }

    public final void s() {
        if (this.f7746m) {
            return;
        }
        this.f7746m = true;
        this.f7747n = false;
        this.f7748o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z5) {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
            if (menuItemC0551i.f7757b == i) {
                menuItemC0551i.f7778x = (menuItemC0551i.f7778x & (-5)) | (z5 ? 4 : 0);
                menuItemC0551i.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f7753t = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
            if (menuItemC0551i.f7757b == i) {
                menuItemC0551i.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        ArrayList arrayList = this.f7740f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0551i menuItemC0551i = (MenuItemC0551i) arrayList.get(i5);
            if (menuItemC0551i.f7757b == i) {
                int i6 = menuItemC0551i.f7778x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                menuItemC0551i.f7778x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f7737c = z4;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7740f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f7736b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f7736b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, CharSequence charSequence) {
        return a(i, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, CharSequence charSequence) {
        MenuItemC0551i menuItemC0551iA = a(i, i5, i6, charSequence);
        SubMenuC0561s subMenuC0561s = new SubMenuC0561s(this.f7735a, this, menuItemC0551iA);
        menuItemC0551iA.f7769o = subMenuC0561s;
        subMenuC0561s.setHeaderTitle(menuItemC0551iA.f7760e);
        return subMenuC0561s;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, int i7) {
        return a(i, i5, i6, this.f7736b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, int i7) {
        return addSubMenu(i, i5, i6, this.f7736b.getString(i7));
    }

    public MenuC0550h j() {
        return this;
    }
}
