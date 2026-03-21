package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {
    public static final /* synthetic */ int y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.m f6930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f6931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f6932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z1.l f6933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f6934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f6935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f6936h;
    public g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f6937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f6938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f6940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f6941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f6942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f6943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E f6945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f6948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f6949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f6950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J.a f6951x;

    public k(View view, Z1.m mVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, Z1.l lVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f6935g = new HashMap();
        this.f6936h = new HashMap();
        this.f6939l = 0;
        this.f6943p = new ArrayList();
        this.f6944q = 0;
        this.f6946s = false;
        this.f6947t = false;
        this.f6948u = new a(this);
        b bVar = new b(this);
        this.f6949v = bVar;
        J.a aVar = new J.a(this, new Handler(), 2);
        this.f6951x = aVar;
        this.f6929a = view;
        this.f6930b = mVar;
        this.f6931c = accessibilityManager;
        this.f6934f = contentResolver;
        this.f6932d = accessibilityViewEmbedder;
        this.f6933e = lVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f6950w = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f6939l |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i == Integer.MAX_VALUE || i < 300) {
                this.f6939l &= -9;
            } else {
                this.f6939l |= 8;
            }
            ((FlutterJNI) mVar.f3025n).setAccessibilityFeatures(this.f6939l);
        }
        ((io.flutter.plugin.platform.p) lVar.f3020l).i.f6743a = this;
        ((io.flutter.plugin.platform.o) lVar.f3021m).f6785h.f6743a = this;
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6932d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f6938k = recordFlutterId;
            this.f6940m = null;
            return true;
        }
        if (eventType == 128) {
            this.f6942o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f6937j = recordFlutterId;
            this.i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f6938k = null;
        this.f6937j = null;
        return true;
    }

    public final e b(int i) {
        HashMap map = this.f6936h;
        e eVar = (e) map.get(Integer.valueOf(i));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f6872c = -1;
        eVar2.f6871b = i;
        eVar2.f6870a = 267386881 + i;
        map.put(Integer.valueOf(i), eVar2);
        return eVar2;
    }

    public final g c(int i) {
        HashMap map = this.f6935g;
        g gVar = (g) map.get(Integer.valueOf(i));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f6902b = i;
        map.put(Integer.valueOf(i), gVar2);
        return gVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        String str;
        int i5;
        int i6;
        int i7;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6932d;
        if (i >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
        }
        HashMap map = this.f6935g;
        View view = this.f6929a;
        if (i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        g gVar = (g) map.get(Integer.valueOf(i));
        if (gVar == null) {
            return null;
        }
        int i8 = gVar.i;
        Z1.l lVar = this.f6933e;
        if (i8 != -1 && lVar.g0(i8)) {
            View viewS = lVar.S(gVar.i);
            if (viewS == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(viewS, gVar.f6902b, gVar.f6900Z);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i);
        int i9 = Build.VERSION.SDK_INT;
        accessibilityNodeInfoObtain2.setImportantForAccessibility((gVar.i(12) || (g.b(gVar) == null && gVar.f6904d == 0)) ? false : true);
        accessibilityNodeInfoObtain2.setViewIdResourceName("");
        String str2 = gVar.f6914o;
        if (str2 != null) {
            accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
        }
        accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoObtain2.setClassName("android.view.View");
        accessibilityNodeInfoObtain2.setSource(view, i);
        accessibilityNodeInfoObtain2.setFocusable(gVar.k());
        g gVar2 = this.f6940m;
        if (gVar2 != null) {
            accessibilityNodeInfoObtain2.setFocused(gVar2.f6902b == i);
        }
        g gVar3 = this.i;
        if (gVar3 != null) {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(gVar3.f6902b == i);
        }
        if (gVar.i(5)) {
            accessibilityNodeInfoObtain2.setPassword(gVar.i(11));
            if (!gVar.i(21)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoObtain2.setEditable(!gVar.i(21));
            int i10 = gVar.f6907g;
            if (i10 != -1 && (i7 = gVar.f6908h) != -1) {
                accessibilityNodeInfoObtain2.setTextSelection(i10, i7);
            }
            g gVar4 = this.i;
            if (gVar4 != null && gVar4.f6902b == i) {
                accessibilityNodeInfoObtain2.setLiveRegion(1);
            }
            if (g.a(gVar, d.f6865v)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (g.a(gVar, d.f6866w)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i6 = 1;
            }
            if (g.a(gVar, d.f6852F)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i6 |= 2;
            }
            if (g.a(gVar, d.f6853G)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i6 |= 2;
            }
            accessibilityNodeInfoObtain2.setMovementGranularities(i6);
            if (gVar.f6905e >= 0) {
                String str3 = gVar.f6917r;
                accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f6906f) + gVar.f6905e);
            }
        }
        if (g.a(gVar, d.f6867x)) {
            accessibilityNodeInfoObtain2.addAction(131072);
        }
        if (g.a(gVar, d.y)) {
            accessibilityNodeInfoObtain2.addAction(16384);
        }
        if (g.a(gVar, d.f6868z)) {
            accessibilityNodeInfoObtain2.addAction(65536);
        }
        if (g.a(gVar, d.f6847A)) {
            accessibilityNodeInfoObtain2.addAction(32768);
        }
        if (g.a(gVar, d.f6854H)) {
            accessibilityNodeInfoObtain2.addAction(2097152);
        }
        if (gVar.i(4)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
        }
        if (gVar.i(15)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
        }
        if (g.a(gVar, d.f6851E)) {
            accessibilityNodeInfoObtain2.setDismissable(true);
            accessibilityNodeInfoObtain2.addAction(1048576);
        }
        g gVar5 = gVar.f6890P;
        if (gVar5 != null) {
            accessibilityNodeInfoObtain2.setParent(view, gVar5.f6902b);
        } else {
            accessibilityNodeInfoObtain2.setParent(view);
        }
        int i11 = gVar.f6877B;
        if (i11 != -1) {
            accessibilityNodeInfoObtain2.setTraversalAfter(view, i11);
        }
        Rect rect = gVar.f6900Z;
        g gVar6 = gVar.f6890P;
        if (gVar6 != null) {
            Rect rect2 = gVar6.f6900Z;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
        } else {
            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
        accessibilityNodeInfoObtain2.setVisibleToUser(true);
        accessibilityNodeInfoObtain2.setEnabled(!gVar.i(7) || gVar.i(8));
        if (g.a(gVar, d.f6856m)) {
            if (gVar.f6894T != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, gVar.f6894T.f6874e));
                accessibilityNodeInfoObtain2.setClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(16);
                accessibilityNodeInfoObtain2.setClickable(true);
            }
        } else if (gVar.i(24)) {
            accessibilityNodeInfoObtain2.addAction(16);
            accessibilityNodeInfoObtain2.setClickable(true);
        }
        if (g.a(gVar, d.f6857n)) {
            if (gVar.f6895U != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gVar.f6895U.f6874e));
                accessibilityNodeInfoObtain2.setLongClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(32);
                accessibilityNodeInfoObtain2.setLongClickable(true);
            }
        }
        d dVar = d.f6858o;
        boolean zA = g.a(gVar, dVar);
        d dVar2 = d.f6861r;
        d dVar3 = d.f6860q;
        d dVar4 = d.f6859p;
        if (zA || g.a(gVar, dVar3) || g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
            accessibilityNodeInfoObtain2.setScrollable(true);
            if (gVar.i(19)) {
                if (g.a(gVar, dVar) || g.a(gVar, dVar4)) {
                    if (j(gVar)) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.f6909j, false));
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (j(gVar)) {
                    accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gVar.f6909j, 0, false));
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (g.a(gVar, dVar) || g.a(gVar, dVar3)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        d dVar5 = d.f6862s;
        boolean zA2 = g.a(gVar, dVar5);
        d dVar6 = d.f6863t;
        if (zA2 || g.a(gVar, dVar6)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
            if (g.a(gVar, dVar5)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (g.a(gVar, dVar6)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        if (gVar.i(16)) {
            accessibilityNodeInfoObtain2.setLiveRegion(1);
        }
        if (gVar.i(5)) {
            accessibilityNodeInfoObtain2.setText(g.e(gVar.f6917r, gVar.f6918s));
            if (i9 >= 28) {
                CharSequence[] charSequenceArr = {gVar.f(), g.e(gVar.f6923x, gVar.y)};
                int i12 = 0;
                CharSequence charSequence = null;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    CharSequence charSequenceConcat = charSequenceArr[i12];
                    if (charSequenceConcat == null || charSequenceConcat.length() <= 0) {
                        i5 = 1;
                    } else {
                        if (charSequence == null || charSequence.length() == 0) {
                            i5 = 1;
                        } else {
                            i5 = 1;
                            charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                        }
                        charSequence = charSequenceConcat;
                    }
                    i12 += i5;
                }
                accessibilityNodeInfoObtain2.setHintText(charSequence);
            }
        } else if (!gVar.i(12)) {
            CharSequence charSequenceB = g.b(gVar);
            if (i9 < 28 && gVar.f6924z != null) {
                charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + gVar.f6924z;
            }
            if (charSequenceB != null) {
                accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 28 && (str = gVar.f6924z) != null) {
            accessibilityNodeInfoObtain2.setTooltipText(str);
            if (g.b(gVar) == null) {
                accessibilityNodeInfoObtain2.setContentDescription(gVar.f6924z);
            }
        }
        boolean z4 = true;
        boolean zI = gVar.i(1);
        boolean zI2 = gVar.i(17);
        if (!zI && !zI2) {
            z4 = false;
        }
        accessibilityNodeInfoObtain2.setCheckable(z4);
        if (zI) {
            accessibilityNodeInfoObtain2.setChecked(gVar.i(2));
            if (gVar.i(9)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
            }
        } else if (zI2) {
            accessibilityNodeInfoObtain2.setChecked(gVar.i(18));
            accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoObtain2.setSelected(gVar.i(3));
        if (i14 >= 28) {
            accessibilityNodeInfoObtain2.setHeading(gVar.i(10));
        }
        g gVar7 = this.i;
        if (gVar7 == null || gVar7.f6902b != i) {
            accessibilityNodeInfoObtain2.addAction(64);
        } else {
            accessibilityNodeInfoObtain2.addAction(128);
        }
        ArrayList<e> arrayList = gVar.f6893S;
        if (arrayList != null) {
            for (e eVar : arrayList) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f6870a, eVar.f6873d));
            }
        }
        for (g gVar8 : gVar.f6891Q) {
            if (!gVar8.i(14)) {
                int i15 = gVar8.i;
                if (i15 != -1) {
                    View viewS2 = lVar.S(i15);
                    if (!lVar.g0(gVar8.i)) {
                        viewS2.setImportantForAccessibility(0);
                        accessibilityNodeInfoObtain2.addChild(viewS2);
                    }
                }
                accessibilityNodeInfoObtain2.addChild(view, gVar8.f6902b);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    public final AccessibilityEvent d(int i, int i5) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i5);
        View view = this.f6929a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i);
        return accessibilityEventObtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z4) {
        g gVarJ;
        if (!this.f6931c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap map = this.f6935g;
        if (map.isEmpty()) {
            return false;
        }
        g gVarJ2 = ((g) map.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (gVarJ2 != null && gVarJ2.i != -1) {
            if (z4) {
                return false;
            }
            return this.f6932d.onAccessibilityHoverEvent(gVarJ2.f6902b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (!map.isEmpty() && (gVarJ = ((g) map.get(0)).j(new float[]{x4, y4, 0.0f, 1.0f}, z4)) != this.f6942o) {
                if (gVarJ != null) {
                    g(gVarJ.f6902b, 128);
                }
                g gVar = this.f6942o;
                if (gVar != null) {
                    g(gVar.f6902b, 256);
                }
                this.f6942o = gVarJ;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f6942o;
            if (gVar2 != null) {
                g(gVar2.f6902b, 256);
                this.f6942o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i, Bundle bundle, boolean z4) {
        int i5;
        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i7 = gVar.f6907g;
        int i8 = gVar.f6908h;
        if (i8 >= 0 && i7 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z4) {
                                gVar.f6908h = gVar.f6917r.length();
                            } else {
                                gVar.f6908h = 0;
                            }
                        }
                    } else if (z4 && i8 < gVar.f6917r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f6917r.substring(gVar.f6908h));
                        if (matcher.find()) {
                            gVar.f6908h += matcher.start(1);
                        } else {
                            gVar.f6908h = gVar.f6917r.length();
                        }
                    } else if (!z4 && gVar.f6908h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f6917r.substring(0, gVar.f6908h));
                        if (matcher2.find()) {
                            gVar.f6908h = matcher2.start(1);
                        } else {
                            gVar.f6908h = 0;
                        }
                    }
                } else if (z4 && i8 < gVar.f6917r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f6917r.substring(gVar.f6908h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f6908h += matcher3.start(1);
                    } else {
                        gVar.f6908h = gVar.f6917r.length();
                    }
                } else if (!z4 && gVar.f6908h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f6917r.substring(0, gVar.f6908h));
                    if (matcher4.find()) {
                        gVar.f6908h = matcher4.start(1);
                    }
                }
            } else if (z4 && i8 < gVar.f6917r.length()) {
                gVar.f6908h++;
            } else if (!z4 && (i5 = gVar.f6908h) > 0) {
                gVar.f6908h = i5 - 1;
            }
            if (!z5) {
                gVar.f6907g = gVar.f6908h;
            }
        }
        if (i7 != gVar.f6907g || i8 != gVar.f6908h) {
            String str = gVar.f6917r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventD = d(gVar.f6902b, 8192);
            accessibilityEventD.getText().add(str);
            accessibilityEventD.setFromIndex(gVar.f6907g);
            accessibilityEventD.setToIndex(gVar.f6908h);
            accessibilityEventD.setItemCount(str.length());
            h(accessibilityEventD);
        }
        Z1.m mVar = this.f6930b;
        if (i6 == 1) {
            if (z4) {
                d dVar = d.f6865v;
                if (g.a(gVar, dVar)) {
                    mVar.p(i, dVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                d dVar2 = d.f6866w;
                if (g.a(gVar, dVar2)) {
                    mVar.p(i, dVar2, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z4) {
                d dVar3 = d.f6852F;
                if (g.a(gVar, dVar3)) {
                    mVar.p(i, dVar3, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                d dVar4 = d.f6853G;
                if (g.a(gVar, dVar4)) {
                    mVar.p(i, dVar4, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            g gVar = this.f6940m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f6902b);
            }
            Integer num = this.f6938k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        g gVar2 = this.i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f6902b);
        }
        Integer num2 = this.f6937j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i, int i5) {
        if (this.f6931c.isEnabled()) {
            h(d(i, i5));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f6931c.isEnabled()) {
            View view = this.f6929a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z4) {
        if (this.f6946s == z4) {
            return;
        }
        this.f6946s = z4;
        if (z4) {
            this.f6939l |= 1;
        } else {
            this.f6939l &= -2;
        }
        ((FlutterJNI) this.f6930b.f3025n).setAccessibilityFeatures(this.f6939l);
    }

    public final boolean j(g gVar) {
        if (gVar.f6909j > 0) {
            g gVar2 = this.i;
            g gVar3 = null;
            if (gVar2 != null) {
                g gVar4 = gVar2.f6890P;
                while (true) {
                    if (gVar4 == null) {
                        gVar4 = null;
                        break;
                    }
                    if (gVar4 == gVar) {
                        break;
                    }
                    gVar4 = gVar4.f6890P;
                }
                if (gVar4 == null) {
                }
                return true;
            }
            g gVar5 = this.i;
            if (gVar5 != null) {
                g gVar6 = gVar5.f6890P;
                while (true) {
                    if (gVar6 == null) {
                        break;
                    }
                    if (gVar6.i(19)) {
                        gVar3 = gVar6;
                        break;
                    }
                    gVar6 = gVar6.f6890P;
                }
                if (gVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i5, Bundle bundle) {
        if (i >= 65536) {
            boolean zPerformAction = this.f6932d.performAction(i, i5, bundle);
            if (zPerformAction && i5 == 128) {
                this.f6937j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f6935g;
        g gVar = (g) map.get(Integer.valueOf(i));
        if (gVar == null) {
            return false;
        }
        d dVar = d.f6862s;
        d dVar2 = d.f6863t;
        Z1.m mVar = this.f6930b;
        switch (i5) {
            case 16:
                mVar.o(i, d.f6856m);
                return true;
            case 32:
                mVar.o(i, d.f6857n);
                return true;
            case 64:
                if (this.i == null) {
                    this.f6929a.invalidate();
                }
                this.i = gVar;
                mVar.o(i, d.f6848B);
                HashMap map2 = new HashMap();
                map2.put("type", "didGainFocus");
                map2.put("nodeId", Integer.valueOf(gVar.f6902b));
                ((Z1.i) mVar.f3024m).D(map2, null);
                g(i, 32768);
                if (g.a(gVar, dVar) || g.a(gVar, dVar2)) {
                    g(i, 4);
                }
                return true;
            case 128:
                g gVar2 = this.i;
                if (gVar2 != null && gVar2.f6902b == i) {
                    this.i = null;
                }
                Integer num = this.f6937j;
                if (num != null && num.intValue() == i) {
                    this.f6937j = null;
                }
                mVar.o(i, d.f6849C);
                g(i, 65536);
                return true;
            case 256:
                return f(gVar, i, bundle, true);
            case 512:
                return f(gVar, i, bundle, false);
            case 4096:
                d dVar3 = d.f6860q;
                if (g.a(gVar, dVar3)) {
                    mVar.o(i, dVar3);
                } else {
                    d dVar4 = d.f6858o;
                    if (g.a(gVar, dVar4)) {
                        mVar.o(i, dVar4);
                    } else {
                        if (!g.a(gVar, dVar)) {
                            return false;
                        }
                        gVar.f6917r = gVar.f6919t;
                        gVar.f6918s = gVar.f6920u;
                        g(i, 4);
                        mVar.o(i, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.f6861r;
                if (g.a(gVar, dVar5)) {
                    mVar.o(i, dVar5);
                } else {
                    d dVar6 = d.f6859p;
                    if (g.a(gVar, dVar6)) {
                        mVar.o(i, dVar6);
                    } else {
                        if (!g.a(gVar, dVar2)) {
                            return false;
                        }
                        gVar.f6917r = gVar.f6921v;
                        gVar.f6918s = gVar.f6922w;
                        g(i, 4);
                        mVar.o(i, dVar2);
                    }
                }
                return true;
            case 16384:
                mVar.o(i, d.y);
                return true;
            case 32768:
                mVar.o(i, d.f6847A);
                return true;
            case 65536:
                mVar.o(i, d.f6868z);
                return true;
            case 131072:
                HashMap map3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map3.put("base", Integer.valueOf(gVar.f6908h));
                    map3.put("extent", Integer.valueOf(gVar.f6908h));
                }
                mVar.p(i, d.f6867x, map3);
                g gVar3 = (g) map.get(Integer.valueOf(i));
                gVar3.f6907g = ((Integer) map3.get("base")).intValue();
                gVar3.f6908h = ((Integer) map3.get("extent")).intValue();
                return true;
            case 1048576:
                mVar.o(i, d.f6851E);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                mVar.p(i, d.f6854H, string);
                gVar.f6917r = string;
                gVar.f6918s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                mVar.o(i, d.f6864u);
                return true;
            default:
                e eVar = (e) this.f6936h.get(Integer.valueOf(i5 - 267386881));
                if (eVar == null) {
                    return false;
                }
                mVar.p(i, d.f6850D, Integer.valueOf(eVar.f6871b));
                return true;
        }
    }
}
