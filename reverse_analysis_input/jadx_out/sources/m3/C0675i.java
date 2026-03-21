package m3;

import B0.o;
import B0.t;
import a0.C0157H;
import a0.C0170V;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.PointerIcon;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.E;
import androidx.profileinstaller.ProfileInstallReceiver;
import d0.AbstractC0370w;
import f0.C0415j;
import io.flutter.embedding.android.D;
import io.flutter.embedding.android.N;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import m2.AbstractC0636C;
import m2.C0662v;
import m2.I;
import m2.b0;
import m2.r;
import n0.C0688d;
import n3.C0702l;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import o3.C0721a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p3.InterfaceC0730a;
import q3.C0745a;
import t0.C0848e;
import t0.C0856m;
import t0.RunnableC0857n;
import t0.p;
import t0.q;
import t0.s;
import t0.x;
import t1.AbstractC0859a;
import x0.d0;
import x0.g0;
import x0.h0;
import x0.q0;

/* JADX INFO: renamed from: m3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675i implements InterfaceC0705o, g0, p0.c, p1.c, B0.m, d0, t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8712m;

    public /* synthetic */ C0675i(Object obj, int i) {
        this.f8711l = i;
        this.f8712m = obj;
    }

    public static int k(int i, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    public void b(String str) {
        Z1.c cVar = (Z1.c) this.f8712m;
        InterfaceC0730a interfaceC0730a = (InterfaceC0730a) cVar.f2996l;
        if (Z1.c.f2995o == null) {
            N n4 = new N();
            n4.put("alias", 1010);
            n4.put("allScroll", 1013);
            n4.put("basic", 1000);
            n4.put("cell", 1006);
            n4.put("click", 1002);
            n4.put("contextMenu", 1001);
            n4.put("copy", 1011);
            n4.put("forbidden", 1012);
            n4.put("grab", 1020);
            n4.put("grabbing", 1021);
            n4.put("help", 1003);
            n4.put("move", 1013);
            n4.put("none", 0);
            n4.put("noDrop", 1012);
            n4.put("precise", 1007);
            n4.put("text", 1008);
            n4.put("resizeColumn", 1014);
            n4.put("resizeDown", 1015);
            n4.put("resizeUpLeft", 1016);
            n4.put("resizeDownRight", 1017);
            n4.put("resizeLeft", 1014);
            n4.put("resizeLeftRight", 1014);
            n4.put("resizeRight", 1014);
            n4.put("resizeRow", 1015);
            n4.put("resizeUp", 1015);
            n4.put("resizeUpDown", 1015);
            n4.put("resizeUpLeft", 1017);
            n4.put("resizeUpRight", 1016);
            n4.put("resizeUpLeftDownRight", 1017);
            n4.put("resizeUpRightDownLeft", 1016);
            n4.put("verticalText", 1009);
            n4.put("wait", 1004);
            n4.put("zoomIn", 1018);
            n4.put("zoomOut", 1019);
            Z1.c.f2995o = n4;
        }
        interfaceC0730a.setPointerIcon(PointerIcon.getSystemIcon(((D) ((InterfaceC0730a) cVar.f2996l)).getContext(), ((Integer) Z1.c.f2995o.getOrDefault(str, 1000)).intValue()));
    }

    public void c(String str, String str2) {
        String strB = C0856m.b(str.trim());
        String strTrim = str2.trim();
        A.j jVar = (A.j) this.f8712m;
        jVar.getClass();
        r.d(strB, strTrim);
        C0662v c0662vA = (C0662v) jVar.f27m;
        if (c0662vA == null) {
            c0662vA = C0662v.a();
            jVar.f27m = c0662vA;
        }
        AbstractC0636C abstractC0636CO = (AbstractC0636C) c0662vA.get(strB);
        if (abstractC0636CO == null) {
            abstractC0636CO = I.o(jVar.f26l);
            C0662v c0662vA2 = (C0662v) jVar.f27m;
            if (c0662vA2 == null) {
                c0662vA2 = C0662v.a();
                jVar.f27m = c0662vA2;
            }
            c0662vA2.put(strB, abstractC0636CO);
        }
        abstractC0636CO.b(strTrim);
    }

    @Override // x0.g0
    public void d(h0 h0Var) {
        n0.k kVar = (n0.k) this.f8712m;
        kVar.f8816B.d(kVar);
    }

    public void e(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i5 = AbstractC0370w.f5326a;
            String[] strArrSplit = str.split(":\\s?", 2);
            if (strArrSplit.length == 2) {
                c(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    @Override // p1.c
    public void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f8712m).setResultCode(i);
    }

    public void g(AbstractC0859a... abstractC0859aArr) {
        N3.h.e(abstractC0859aArr, "migrations");
        for (AbstractC0859a abstractC0859a : abstractC0859aArr) {
            int i = abstractC0859a.f10001a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8712m;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i5 = abstractC0859a.f10002b;
            if (treeMap2.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i5)) + " with " + abstractC0859a);
            }
            treeMap2.put(Integer.valueOf(i5), abstractC0859a);
        }
    }

    @Override // p1.c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // B0.m
    public void i(o oVar, long j5, long j6) {
        switch (this.f8711l) {
            case 22:
                C0848e c0848e = (C0848e) oVar;
                q qVar = (q) this.f8712m;
                if (qVar.h() != 0) {
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = qVar.f9953p;
                        if (i < arrayList.size()) {
                            p pVar = (p) arrayList.get(i);
                            if (pVar.f9936a.f9933b == c0848e) {
                                pVar.a();
                            } else {
                                i++;
                            }
                        }
                    }
                    qVar.f9952o.f9928z = 1;
                } else if (!qVar.f9948G) {
                    q.y(qVar);
                }
                break;
            default:
                break;
        }
    }

    public C0856m j() {
        return new C0856m(this);
    }

    @Override // B0.t
    public Object l(Uri uri, C0415j c0415j) throws C0157H {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f8712m).newPullParser();
            xmlPullParserNewPullParser.setInput(c0415j, null);
            return (w0.c) new w0.g(uri.toString()).e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e5) {
            throw C0157H.b(null, e5);
        }
    }

    @Override // x0.d0
    public void m() {
        q qVar = (q) this.f8712m;
        qVar.f9950m.post(new RunnableC0857n(qVar, 1));
    }

    @Override // B0.m
    public B0.k n(o oVar, long j5, long j6, IOException iOException, int i) {
        switch (this.f8711l) {
            case 22:
                C0848e c0848e = (C0848e) oVar;
                q qVar = (q) this.f8712m;
                if (!qVar.f9945D) {
                    qVar.f9959v = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i5 = qVar.f9947F;
                    qVar.f9947F = i5 + 1;
                    if (i5 < 3) {
                    }
                } else {
                    qVar.f9960w = new K3.b(c0848e.f9863m.f9973b.toString(), iOException);
                }
                break;
            default:
                if (!((x) this.f8712m).f9988q) {
                    Z1.l lVar = ((x) this.f8712m).f9983l;
                }
                break;
        }
        return B0.r.f240p;
    }

    public String o(String str, String str2) {
        C0721a c0721a = (C0721a) this.f8712m;
        Context contextCreateConfigurationContext = c0721a.f9121b;
        if (str2 != null) {
            Locale localeA = C0721a.a(str2);
            Configuration configuration = new Configuration(c0721a.f9121b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = c0721a.f9121b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", c0721a.f9121b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Bundle bundle;
        int i = 3;
        int i5 = 2;
        boolean z4 = false;
        z4 = false;
        switch (this.f8711l) {
            case 0:
                Z1.l lVar = (Z1.l) this.f8712m;
                if (((C0745a) lVar.f3021m) == null) {
                    return;
                }
                String str = c0704n.f8938a;
                Object obj = c0704n.f8939b;
                str.getClass();
                if (str.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        ((C0745a) lVar.f3021m).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (P2.c) interfaceC0706p);
                        return;
                    } catch (IllegalStateException e5) {
                        ((P2.c) interfaceC0706p).error("error", e5.getMessage(), null);
                        return;
                    }
                }
                if (!str.equals("ProcessText.queryTextActions")) {
                    ((P2.c) interfaceC0706p).notImplemented();
                    return;
                }
                try {
                    ((P2.c) interfaceC0706p).success(((C0745a) lVar.f3021m).b());
                    return;
                } catch (IllegalStateException e6) {
                    ((P2.c) interfaceC0706p).error("error", e6.getMessage(), null);
                    return;
                }
            case 1:
                String str2 = c0704n.f8938a;
                str2.getClass();
                C0676j c0676j = (C0676j) this.f8712m;
                if (!str2.equals("get")) {
                    if (!str2.equals("put")) {
                        ((P2.c) interfaceC0706p).notImplemented();
                        return;
                    } else {
                        c0676j.f8714b = (byte[]) c0704n.f8939b;
                        ((P2.c) interfaceC0706p).success(null);
                        return;
                    }
                }
                c0676j.f8718f = true;
                if (c0676j.f8717e || !c0676j.f8713a) {
                    ((P2.c) interfaceC0706p).success(C0676j.a(c0676j.f8714b));
                    return;
                } else {
                    c0676j.f8716d = (P2.c) interfaceC0706p;
                    return;
                }
            case 2:
                C0675i c0675i = (C0675i) this.f8712m;
                if (((Z1.e) c0675i.f8712m) == null) {
                    return;
                }
                String str3 = c0704n.f8938a;
                str3.getClass();
                switch (str3) {
                    case "Scribe.isFeatureAvailable":
                        try {
                            Z1.e eVar = (Z1.e) c0675i.f8712m;
                            if (Build.VERSION.SDK_INT < 34) {
                                eVar.getClass();
                            } else if (((InputMethodManager) eVar.f3001m).isStylusHandwritingAvailable()) {
                                z4 = true;
                            }
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(z4));
                            return;
                        } catch (IllegalStateException e7) {
                            ((P2.c) interfaceC0706p).error("error", e7.getMessage(), null);
                            return;
                        }
                    case "Scribe.startStylusHandwriting":
                        if (Build.VERSION.SDK_INT < 33) {
                            ((P2.c) interfaceC0706p).error("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            Z1.e eVar2 = (Z1.e) c0675i.f8712m;
                            ((InputMethodManager) eVar2.f3001m).startStylusHandwriting((View) eVar2.f3002n);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        } catch (IllegalStateException e8) {
                            ((P2.c) interfaceC0706p).error("error", e8.getMessage(), null);
                            return;
                        }
                    case "Scribe.isStylusHandwritingAvailable":
                        if (Build.VERSION.SDK_INT < 34) {
                            ((P2.c) interfaceC0706p).error("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(((InputMethodManager) ((Z1.e) c0675i.f8712m).f3001m).isStylusHandwritingAvailable()));
                            return;
                        } catch (IllegalStateException e9) {
                            ((P2.c) interfaceC0706p).error("error", e9.getMessage(), null);
                            return;
                        }
                    default:
                        ((P2.c) interfaceC0706p).notImplemented();
                        return;
                }
            case 3:
            case 5:
            default:
                Z1.e eVar3 = (Z1.e) this.f8712m;
                if (((E) eVar3.f3002n) == null) {
                    return;
                }
                String str4 = c0704n.f8938a;
                str4.getClass();
                Object obj2 = c0704n.f8939b;
                switch (str4.hashCode()) {
                    case -1779068172:
                        if (str4.equals("TextInput.setPlatformViewClient")) {
                        }
                        break;
                    case -1015421462:
                        if (str4.equals("TextInput.setEditingState")) {
                        }
                        break;
                    case -37561188:
                        if (str4.equals("TextInput.setClient")) {
                        }
                        break;
                    case 270476819:
                        if (str4.equals("TextInput.hide")) {
                        }
                        break;
                    case 270803918:
                        if (str4.equals("TextInput.show")) {
                        }
                        break;
                    case 649192816:
                        if (str4.equals("TextInput.sendAppPrivateCommand")) {
                        }
                        break;
                    case 1204752139:
                        if (str4.equals("TextInput.setEditableSizeAndTransform")) {
                        }
                        break;
                    case 1727570905:
                        if (str4.equals("TextInput.finishAutofillContext")) {
                        }
                        break;
                    case 1904427655:
                        if (str4.equals("TextInput.clearClient")) {
                        }
                        break;
                    case 2113369584:
                        if (str4.equals("TextInput.requestAutofill")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C0675i.onMethodCall(n3.n, n3.p):void");
            }

            public void p(K3.b bVar) {
                boolean z4 = bVar instanceof s;
                q qVar = (q) this.f8712m;
                if (!z4 || qVar.f9948G) {
                    qVar.f9960w = bVar;
                } else {
                    q.y(qVar);
                }
            }

            @Override // B0.m
            public /* bridge */ /* synthetic */ void q(o oVar, long j5, long j6, boolean z4) {
                switch (this.f8711l) {
                    case 22:
                        break;
                    default:
                        break;
                }
            }

            public void r() {
                n0.k kVar = (n0.k) this.f8712m;
                int i = kVar.f8817C - 1;
                kVar.f8817C = i;
                if (i > 0) {
                    return;
                }
                int i5 = 0;
                for (n0.q qVar : kVar.f8819E) {
                    qVar.a();
                    i5 += qVar.f8881T.f10776a;
                }
                C0170V[] c0170vArr = new C0170V[i5];
                int i6 = 0;
                for (n0.q qVar2 : kVar.f8819E) {
                    qVar2.a();
                    int i7 = qVar2.f8881T.f10776a;
                    int i8 = 0;
                    while (i8 < i7) {
                        qVar2.a();
                        c0170vArr[i6] = qVar2.f8881T.a(i8);
                        i8++;
                        i6++;
                    }
                }
                kVar.f8818D = new q0(c0170vArr);
                kVar.f8816B.a(kVar);
            }

            public void s(String str, IOException iOException) {
                ((q) this.f8712m).f9959v = iOException == null ? new IOException(str) : new IOException(str, iOException);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
            
                if (r2 >= 26) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
            
                if (r2 >= 34) goto L45;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int t(a0.C0190p r7) {
                /*
                    r6 = this;
                    r0 = 4
                    r1 = 1
                    java.lang.String r2 = r7.f3424n
                    r3 = 0
                    if (r2 == 0) goto L84
                    boolean r2 = a0.AbstractC0156G.j(r2)
                    if (r2 != 0) goto Lf
                    goto L84
                Lf:
                    int r2 = d0.AbstractC0370w.f5326a
                    java.lang.String r7 = r7.f3424n
                    r7.getClass()
                    int r2 = d0.AbstractC0370w.f5326a
                    r4 = -1
                    int r5 = r7.hashCode()
                    switch(r5) {
                        case -1487656890: goto L63;
                        case -1487464693: goto L58;
                        case -1487464690: goto L4d;
                        case -1487394660: goto L42;
                        case -1487018032: goto L37;
                        case -879272239: goto L2c;
                        case -879258763: goto L21;
                        default: goto L20;
                    }
                L20:
                    goto L6d
                L21:
                    java.lang.String r5 = "image/png"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L2a
                    goto L6d
                L2a:
                    r4 = 6
                    goto L6d
                L2c:
                    java.lang.String r5 = "image/bmp"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L35
                    goto L6d
                L35:
                    r4 = 5
                    goto L6d
                L37:
                    java.lang.String r5 = "image/webp"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L40
                    goto L6d
                L40:
                    r4 = r0
                    goto L6d
                L42:
                    java.lang.String r5 = "image/jpeg"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L4b
                    goto L6d
                L4b:
                    r4 = 3
                    goto L6d
                L4d:
                    java.lang.String r5 = "image/heif"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L56
                    goto L6d
                L56:
                    r4 = 2
                    goto L6d
                L58:
                    java.lang.String r5 = "image/heic"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L61
                    goto L6d
                L61:
                    r4 = r1
                    goto L6d
                L63:
                    java.lang.String r5 = "image/avif"
                    boolean r7 = r7.equals(r5)
                    if (r7 != 0) goto L6c
                    goto L6d
                L6c:
                    r4 = r3
                L6d:
                    switch(r4) {
                        case 0: goto L76;
                        case 1: goto L71;
                        case 2: goto L71;
                        case 3: goto L7a;
                        case 4: goto L7a;
                        case 5: goto L7a;
                        case 6: goto L7a;
                        default: goto L70;
                    }
                L70:
                    goto L7f
                L71:
                    r7 = 26
                    if (r2 < r7) goto L7f
                    goto L7a
                L76:
                    r7 = 34
                    if (r2 < r7) goto L7f
                L7a:
                    int r7 = h0.q0.e(r0, r3, r3, r3)
                    goto L83
                L7f:
                    int r7 = h0.q0.e(r1, r3, r3, r3)
                L83:
                    return r7
                L84:
                    int r7 = h0.q0.e(r3, r3, r3, r3)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C0675i.t(a0.p):int");
            }

            public C0675i(int i) {
                this.f8711l = i;
                switch (i) {
                    case 12:
                        this.f8712m = new SparseArray();
                        return;
                    case 14:
                        this.f8712m = new i0.b(29);
                        return;
                    case 18:
                        this.f8712m = new SparseIntArray();
                        return;
                    case 20:
                        this.f8712m = new LinkedHashMap();
                        return;
                    case 21:
                        A.j jVar = new A.j();
                        jVar.f26l = 4;
                        this.f8712m = jVar;
                        return;
                    case 27:
                        return;
                    case 28:
                        try {
                            this.f8712m = XmlPullParserFactory.newInstance();
                            return;
                        } catch (XmlPullParserException e5) {
                            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
                        }
                    case 29:
                        this.f8712m = null;
                        return;
                    default:
                        this.f8712m = new C0688d(5, 1.0f, false);
                        return;
                }
            }

            public C0675i(b0 b0Var) {
                this.f8711l = 25;
                this.f8712m = I.p(b0Var);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C0675i(int i, String str, String str2) {
                this(21);
                this.f8711l = 21;
                c("User-Agent", str);
                c("CSeq", String.valueOf(i));
                if (str2 != null) {
                    c("Session", str2);
                }
            }

            public C0675i(f3.b bVar, int i) {
                this.f8711l = i;
                switch (i) {
                    case 5:
                        new C0707q(bVar, "flutter/sensitivecontent", n3.x.f8947a, null).b(new C0675i(this, 4));
                        break;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    default:
                        new C0707q(bVar, "flutter/scribe", C0702l.f8937a, null).b(new C0675i(this, 2));
                        break;
                    case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        new C0707q(bVar, "flutter/spellcheck", n3.x.f8947a, null).b(new C0675i(this, 6));
                        break;
                }
            }
        }
